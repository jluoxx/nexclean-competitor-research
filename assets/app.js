(()=>{'use strict';
const root=new URL('../',document.querySelector('script[src$="app.js"]').src), ns='nexclean-offline-v1:';
const E=s=>String(s??'').replace(/[&<>"']/g,c=>({'&':'&amp;','<':'&lt;','>':'&gt;','"':'&quot;',"'":'&#39;'}[c]));
const get=k=>{try{return JSON.parse(sessionStorage.getItem(ns+k));}catch{return null;}};
const set=(k,v)=>{try{sessionStorage.setItem(ns+k,JSON.stringify(v));}catch{}};
const views=[...document.querySelectorAll('[data-view]')],home=views.length>0;
document.querySelector('.skip')?.addEventListener('click',e=>{e.preventDefault();const content=document.querySelector('#content');content.focus();content.scrollIntoView();});
const safe=s=>{try{let u=new URL(s,root);return u.protocol===root.protocol&&u.host===root.host&&u.pathname.startsWith(root.pathname)&&u.pathname.endsWith('.html')?u:null;}catch{return null;}};
function save(){set('view:'+location.href,{y:scrollY,open:[...document.querySelectorAll('details[open]')].map(d=>d.id)});}
const returnTo=get('return:'+location.pathname);const back=document.querySelector('#back');
if(returnTo&&safe(returnTo))back.href=returnTo;
document.querySelector('#print').addEventListener('click',()=>window.print());
document.addEventListener('click',e=>{const a=e.target.closest('a[data-reader]');if(!a)return;const u=safe(a.href);if(u){save();set('return:'+u.pathname,location.href);}});
addEventListener('pagehide',save);
function restore(){const s=get('view:'+location.href);if(s){for(const id of s.open||[]){const d=document.getElementById(id);if(d)d.open=true;}requestAnimationFrame(()=>scrollTo(0,s.y||0));}}
if(!home){document.querySelector(`[data-nav="${document.body.dataset.section}"]`)?.classList.add('active');restore();return;}
const D=window.RESEARCH;
const search=document.querySelector('#param-search'),scope=document.querySelector('#scope'),es=document.querySelector('#evidence-search');
function route(){const [name,query='']=location.hash.slice(1).split('?');return {name:views.some(v=>v.dataset.view===name)?name:'overview',query:new URLSearchParams(query)};}
function updateQuery(){const r=route(),q=new URLSearchParams();if(r.name==='config'){if(search.value)q.set('q',search.value);if(scope.value!=='all')q.set('scope',scope.value);}if(r.name==='library'&&es.value)q.set('q',es.value);history.replaceState(null,'','#'+r.name+(q.size?'?'+q:''));}
function parameters(){const q=search.value.toLowerCase(),f=scope.value;const list=D.params.filter(p=>(f==='all'||p.scope===f)&&Object.values(p).join(' ').toLowerCase().includes(q));
document.querySelector('#param-count').textContent=`${list.length} / ${D.params.length} 个参数`;
document.querySelector('#params').innerHTML=list.map(p=>`<details class="parameter" id="${p.id}"><summary><span><strong class="param-name">${E(p['通俗名称'])}</strong><span class="param-purpose">${E(p['控制什么'])}</span><small>${E(p.scope)} · 线上值未取得</small><code class="param-key">${E(p['原始键'])}</code></span><span class="default"><small>包内默认</small>${E(p['默认值白话'])}</span></summary><div class="detail-body"><dl class="plain-details"><dt>如果调整</dt><dd>${E(p['调整示例'])}</dd><dt>要注意</dt><dd>${E(p['不能误解为'])}</dd></dl><details class="technical"><summary>技术证据：调用链、缓存与失败处理</summary><dl>${['parser到消费者','生效条件','动作','缺值零值非法值','请求失败行为','缓存与单位转换'].map(k=>`<dt>${E(k==='parser到消费者'?'读取与消费链':k)}</dt><dd>${E(p[k])}</dd>`).join('')}</dl></details><a href="${p.evidence}" data-reader>查看配置类原始证据 →</a></div></details>`).join('')||'<p class="empty">没有匹配的参数。可清空搜索或选择全部范围。</p>';}
function evidence(){const q=es.value.trim().toLowerCase(),list=D.evidence.filter(e=>/^[ech]\d{2}$/.test(q)?e.id.toLowerCase()===q:[e.id,e.title,e.topic,e.kind,e.path,e.line,e.excerpt,e.gap].join(' ').toLowerCase().includes(q));document.querySelector('#evidence-count').textContent=`${list.length} / ${D.evidence.length} 条证据`;
document.querySelector('#evidence-list').innerHTML=list.map(e=>`<details class="evidence-item" id="ev-${e.id}"><summary><span class="evidence-id">${E(e.id)}</span><span><strong>${E(e.title)}</strong><small>${E(e.topic)} · ${E(e.kind)}<br>${E(e.path)} : ${E(e.line)}</small></span></summary><div class="detail-body"><pre><code>${E(e.excerpt)}</code></pre><p class="muted">边界：${E(e.gap)}</p><a href="${e.href}" data-reader>打开原始证据与行号 →</a></div></details>`).join('')||'<p class="empty">没有匹配的证据。</p>';}
const keys=['placement','format原值','ad_delivery_sw','unit_caps_d','unit_caps_h','unit_pacing','refresh','auto_refresh','network标签'];
document.querySelector('#placement-table').innerHTML='<div class="table-wrap" tabindex="0" role="region" aria-label="23个广告位包内策略表"><table><thead><tr>'+keys.map(k=>`<th>${E(k)}</th>`).join('')+'</tr></thead><tbody>'+D.placements.map(p=>'<tr>'+keys.map(k=>`<td>${E(p[k])}</td>`).join('')+'</tr>').join('')+'</tbody></table></div>';
document.querySelector('#network-link').href=D.networkHref;document.querySelector('#network-link').dataset.reader='';
document.querySelector('#downloads').innerHTML=D.downloads.map(d=>`<div><a data-reader href="${d.href}">${E(d.name)} →</a><a class="raw" download href="${d.raw}">下载 CSV 原件</a></div>`).join('');
let current='';
function render(){const r=route();views.forEach(v=>v.hidden=v.dataset.view!==r.name);document.querySelectorAll('[data-nav]').forEach(a=>a.classList.toggle('active',a.dataset.nav===r.name));search.value=r.name==='config'?(r.query.get('q')||''):'';scope.value=r.query.get('scope')==='Samsung'?'Samsung':r.query.get('scope')==='全部设备'?'全部设备':'all';es.value=r.name==='library'?(r.query.get('q')||''):'';parameters();evidence();document.title=(document.querySelector(`[data-nav="${r.name}"]`)?.textContent.trim()||'研究结论')+' · NexClean研究';if(current!==r.name){scrollTo(0,0);current=r.name;}restore();}
search.addEventListener('input',()=>{parameters();updateQuery();});scope.addEventListener('change',()=>{parameters();updateQuery();});es.addEventListener('input',()=>{evidence();updateQuery();});
document.addEventListener('click',e=>{const a=e.target.closest('a');if(a&&safe(a.href)&&a.pathname===location.pathname&&a.hash!==location.hash)save();});
addEventListener('hashchange',render);render();
})();
