package com.thinkup.core.common.m0;

import android.content.Context;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.Pair;
import com.android.systemui.shared.system.SysUiStatsLog;
import com.thinkup.core.api.AdError;
import com.thinkup.core.api.TUAdRequest;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes7.dex */
public class dd extends m {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final String f69788d = "custom";

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private static final String f69789m = "dd";

    /* JADX INFO: renamed from: m0, reason: collision with root package name */
    private String f69790m0;

    /* JADX INFO: renamed from: md, reason: collision with root package name */
    private String f69791md;

    /* JADX INFO: renamed from: mm, reason: collision with root package name */
    private Context f69792mm;

    /* JADX INFO: renamed from: mn, reason: collision with root package name */
    private long f69793mn;

    /* JADX INFO: renamed from: mo, reason: collision with root package name */
    private long f69794mo;

    /* JADX INFO: renamed from: mq, reason: collision with root package name */
    private Map<String, Object> f69795mq;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private String f69796n;

    /* JADX INFO: renamed from: n0, reason: collision with root package name */
    private Map<String, String> f69797n0;

    /* JADX INFO: renamed from: nd, reason: collision with root package name */
    private String f69798nd;

    /* JADX INFO: renamed from: nm, reason: collision with root package name */
    private String f69799nm;

    /* JADX INFO: renamed from: nn, reason: collision with root package name */
    private boolean f69800nn;

    /* JADX INFO: renamed from: no, reason: collision with root package name */
    private String f69801no;

    /* JADX INFO: renamed from: nq, reason: collision with root package name */
    private String f69802nq;

    /* JADX INFO: renamed from: o0, reason: collision with root package name */
    private com.thinkup.core.common.dm.nm f69803o0;

    /* JADX INFO: renamed from: od, reason: collision with root package name */
    private boolean f69804od = false;

    public dd(Context context, com.thinkup.core.common.dm.nm nmVar) {
        if (nmVar == null) {
            return;
        }
        this.f69803o0 = nmVar;
        this.f69795mq = com.thinkup.core.common.o.nd.m().md();
        this.f69796n = nmVar.d();
        this.f69790m0 = nmVar.m();
        this.f69792mm = context;
        this.f69797n0 = nmVar.o();
        this.f69791md = nmVar.n();
        this.f69799nm = nmVar.d0();
        this.f69801no = nmVar.dd();
    }

    @Override // com.thinkup.core.common.m0.m
    public final Object d(Object obj) {
        if (obj instanceof JSONObject) {
            d((JSONObject) obj);
        }
        com.thinkup.core.common.nm.d0.d("app", (String) null, this.f69793mn, System.currentTimeMillis(), SystemClock.elapsedRealtime() - this.f69794mo, (TUAdRequest) null, this.f69799nm);
        return obj;
    }

    @Override // com.thinkup.core.common.m0.m
    public final Context d0() {
        return this.f69792mm;
    }

    @Override // com.thinkup.core.common.m0.m
    public final String dd() {
        return this.f69790m0;
    }

    @Override // com.thinkup.core.common.m0.m
    public final Map<String, Object> dm() {
        return null;
    }

    @Override // com.thinkup.core.common.m0.m
    public final JSONObject dn() {
        Object obj;
        JSONObject jSONObjectDn = super.dn();
        try {
            jSONObjectDn.put("app_id", this.f69796n);
            jSONObjectDn.put("nw_ver", com.thinkup.core.common.nn.m0.dd());
            String strOq = com.thinkup.core.common.o.nd.m().oq();
            if (!TextUtils.isEmpty(strOq)) {
                jSONObjectDn.put("sy_id", strOq);
            }
            String strQ0 = com.thinkup.core.common.o.nd.m().q0();
            if (TextUtils.isEmpty(strQ0)) {
                com.thinkup.core.common.o.nd.m().dq(com.thinkup.core.common.o.nd.m().oo());
                jSONObjectDn.put("bk_id", com.thinkup.core.common.o.nd.m().oo());
            } else {
                jSONObjectDn.put("bk_id", strQ0);
            }
            JSONObject jSONObjectD = d0.d();
            if (jSONObjectD != null) {
                jSONObjectDn.put("custom", jSONObjectD);
            }
            jSONObjectDn.put("deny", com.thinkup.core.common.nn.m0.mm(com.thinkup.core.common.o.nd.m().dd()));
            if (com.thinkup.core.common.o.nd.m().om()) {
                jSONObjectDn.put("is_test", 1);
            }
            Map<String, String> map = this.f69797n0;
            if (map != null && map.size() != 0) {
                try {
                    jSONObjectDn.put("cached", new JSONObject(this.f69797n0));
                } catch (Throwable unused) {
                }
            }
            try {
                JSONObject jSONObject = new JSONObject();
                com.thinkup.core.common.dn.n.d().d(jSONObject);
                if (jSONObject.length() > 0) {
                    jSONObjectDn.put(d0.nd0, jSONObject.toString());
                }
            } catch (Throwable unused2) {
            }
            jSONObjectDn.putOpt(d0.ndd, 1);
            if (!TextUtils.isEmpty(this.f69791md)) {
                jSONObjectDn.put(d0.nm0, this.f69791md);
            }
            jSONObjectDn.put(d0.no0, com.thinkup.core.common.o.nd.m().qd());
            Pair<Integer, List<String>> pairQo = com.thinkup.core.common.o.nd.m().qo();
            if (pairQo != null && (obj = pairQo.first) != null) {
                jSONObjectDn.put(d0.nod, ((Integer) obj).intValue());
            }
            com.thinkup.core.common.o.nd.m();
            if (!TextUtils.isEmpty(this.f69801no)) {
                if (this.f69800nn) {
                    this.f69801no += "_cdn";
                }
                jSONObjectDn.put(d0.od0, this.f69801no);
            }
            com.thinkup.core.common.dm.nm nmVar = this.f69803o0;
            if (nmVar != null && !TextUtils.isEmpty(nmVar.d0())) {
                jSONObjectDn.put(d0.o0q, this.f69803o0.d0());
            }
            if (!TextUtils.isEmpty(this.f69802nq)) {
                jSONObjectDn.put(d0.odd, this.f69802nq);
            }
        } catch (JSONException unused3) {
        }
        return jSONObjectDn;
    }

    @Override // com.thinkup.core.common.m0.m
    /* JADX INFO: renamed from: do, reason: not valid java name */
    public final JSONObject mo259do() {
        return super.mo259do();
    }

    @Override // com.thinkup.core.common.m0.m
    public final String m() {
        String strD;
        if (TextUtils.isEmpty(this.f69798nd)) {
            com.thinkup.core.common.dn.d();
            strD = com.thinkup.core.common.dn.d(true);
        } else {
            strD = this.f69798nd;
        }
        if (!TextUtils.isEmpty(strD)) {
            this.f69802nq = com.thinkup.core.common.nn.mo.q(strD);
        }
        return strD;
    }

    @Override // com.thinkup.core.common.m0.m
    public final void m0() {
    }

    @Override // com.thinkup.core.common.m0.m
    public final boolean md() {
        return true;
    }

    @Override // com.thinkup.core.common.m0.m
    public int mm() {
        return SysUiStatsLog.STYLE_UI_CHANGED;
    }

    @Override // com.thinkup.core.common.m0.m
    public final com.thinkup.core.common.m0.n.o mn() {
        com.thinkup.core.common.m0.n.o oVarD = com.thinkup.core.common.m0.n.o.d(com.thinkup.core.common.m0.n.dd.f69905m, this.f69796n);
        oVarD.d(this.f69804od);
        return oVarD;
    }

    @Override // com.thinkup.core.common.m0.m
    public final Map<String, String> n() {
        HashMap map = new HashMap();
        map.put("Accept-Encoding", "gzip");
        map.put("Content-Type", "application/json;charset=utf-8");
        return map;
    }

    @Override // com.thinkup.core.common.m0.m
    public final List<String> n0() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(com.thinkup.core.common.o.dn.oq.f72891d);
        arrayList.add("http_type");
        return arrayList;
    }

    public final String nm() {
        try {
            return dq();
        } catch (Throwable unused) {
            return null;
        }
    }

    @Override // com.thinkup.core.common.m0.m
    public final byte[] o() {
        try {
            return dq().getBytes("utf-8");
        } catch (Exception unused) {
            return dq().getBytes();
        }
    }

    @Override // com.thinkup.core.common.m0.m
    public final String q() {
        return this.f69796n;
    }

    private dd n(String str) {
        this.f69799nm = str;
        return this;
    }

    public final dd m(String str) {
        this.f69798nd = str;
        return this;
    }

    public final dd m(boolean z10) {
        this.f69800nn = z10;
        return this;
    }

    @Override // com.thinkup.core.common.m0.m
    public final void d(int i10, nd ndVar) {
        this.f69793mn = System.currentTimeMillis();
        this.f69794mo = SystemClock.elapsedRealtime();
        super.d(i10, ndVar);
    }

    public final void d(JSONObject jSONObject) {
        if (jSONObject == null || this.f69795mq == null) {
            return;
        }
        try {
            jSONObject.put("custom", new JSONObject(this.f69795mq));
        } catch (Exception unused) {
        }
    }

    @Override // com.thinkup.core.common.m0.m
    public final int d() {
        return 1;
    }

    @Override // com.thinkup.core.common.m0.m
    public final void d(AdError adError) {
        com.thinkup.core.common.nm.d0.d("app", adError.getPlatformCode(), adError.getPlatformMSG(), m(), "", "", "", (TUAdRequest) null, this.f69799nm, 0);
    }

    public final dd d(boolean z10) {
        this.f69804od = z10;
        return this;
    }
}