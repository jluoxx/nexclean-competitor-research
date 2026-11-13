package com.thinkup.core.common.m0;

import android.content.Context;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.Pair;
import com.thinkup.core.api.AdError;
import com.thinkup.core.api.TUAdConst;
import com.thinkup.core.api.TUAdRequest;
import com.thinkup.core.basead.adx.api.TUAdxSetting;
import com.thinkup.core.common.dm.doq;
import com.tradplus.ads.common.serialization.asm.Opcodes;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes7.dex */
public class nn extends m {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final String f69943d = "nn";

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final String f69944m = "sdk_custom";

    /* JADX INFO: renamed from: mm, reason: collision with root package name */
    private static final String f69945mm = "YXBpdjQ=";

    /* JADX INFO: renamed from: m0, reason: collision with root package name */
    long f69946m0;

    /* JADX INFO: renamed from: md, reason: collision with root package name */
    long f69947md;

    /* JADX INFO: renamed from: mn, reason: collision with root package name */
    private String f69948mn;

    /* JADX INFO: renamed from: mo, reason: collision with root package name */
    private String f69949mo;

    /* JADX INFO: renamed from: mq, reason: collision with root package name */
    private String f69950mq;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    Map<String, Object> f69951n;

    /* JADX INFO: renamed from: n0, reason: collision with root package name */
    private Context f69952n0;

    /* JADX INFO: renamed from: nd, reason: collision with root package name */
    private String f69953nd;

    /* JADX INFO: renamed from: nm, reason: collision with root package name */
    private String f69954nm;

    /* JADX INFO: renamed from: nn, reason: collision with root package name */
    private String f69955nn;

    /* JADX INFO: renamed from: no, reason: collision with root package name */
    private Map<String, Object> f69956no;

    /* JADX INFO: renamed from: nq, reason: collision with root package name */
    private Map<String, String> f69957nq;

    /* JADX INFO: renamed from: o0, reason: collision with root package name */
    private int f69958o0;

    /* JADX INFO: renamed from: od, reason: collision with root package name */
    private JSONObject f69959od;

    /* JADX INFO: renamed from: om, reason: collision with root package name */
    private String f69960om;

    /* JADX INFO: renamed from: on, reason: collision with root package name */
    private JSONObject f69961on;

    /* JADX INFO: renamed from: oo, reason: collision with root package name */
    private TUAdRequest f69962oo;

    /* JADX INFO: renamed from: oq, reason: collision with root package name */
    private String f69963oq;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    private boolean f69964q0;

    /* JADX INFO: renamed from: qd, reason: collision with root package name */
    private final doq f69965qd;

    /* JADX INFO: renamed from: qm, reason: collision with root package name */
    private String f69966qm;

    /* JADX INFO: renamed from: qn, reason: collision with root package name */
    private String f69967qn;

    /* JADX INFO: renamed from: qo, reason: collision with root package name */
    private String f69968qo;

    /* JADX INFO: renamed from: qq, reason: collision with root package name */
    private boolean f69969qq = false;

    public nn(Context context, doq doqVar) {
        this.f69959od = null;
        this.f69965qd = doqVar;
        if (doqVar != null) {
            this.f69953nd = doqVar.m();
            this.f69954nm = doqVar.n();
            this.f69952n0 = context;
            this.f69950mq = doqVar.o();
            this.f69948mn = com.thinkup.core.common.o.nd.m().n0();
            this.f69949mo = com.thinkup.core.common.o.nd.m().dd(this.f69950mq);
            this.f69955nn = doqVar.q();
            this.f69951n = doqVar.d0();
            this.f69956no = doqVar.dd();
            this.f69958o0 = doqVar.dm();
            this.f69957nq = doqVar.dn();
            this.f69959od = doqVar.m0();
            this.f69960om = doqVar.md();
            this.f69961on = doqVar.mm();
            this.f69962oo = doqVar.m219do();
            this.f69968qo = doqVar.dq();
            this.f69966qm = doqVar.mo();
        }
    }

    @Override // com.thinkup.core.common.m0.m
    public Object d(Object obj) {
        try {
            doq doqVar = this.f69965qd;
            if (doqVar != null) {
                doqVar.m(this.f69964q0);
            }
            com.thinkup.core.common.nm.d0.d("placement", this.f69950mq, this.f69946m0, System.currentTimeMillis(), SystemClock.elapsedRealtime() - this.f69947md, this.f69962oo, this.f69968qo);
            if (obj instanceof JSONObject) {
                JSONObject jSONObject = (JSONObject) obj;
                d(jSONObject);
                return jSONObject;
            }
        } catch (Throwable unused) {
        }
        return obj;
    }

    @Override // com.thinkup.core.common.m0.m
    public final Context d0() {
        return this.f69952n0;
    }

    @Override // com.thinkup.core.common.m0.m
    public final String dd() {
        return this.f69954nm;
    }

    @Override // com.thinkup.core.common.m0.m
    public final Map<String, Object> dm() {
        return null;
    }

    @Override // com.thinkup.core.common.m0.m
    public JSONObject dn() {
        Object obj;
        Object obj2;
        JSONObject jSONObjectDn = super.dn();
        try {
            jSONObjectDn.put("app_id", this.f69953nd);
            jSONObjectDn.put(d0.ndo, this.f69950mq);
            jSONObjectDn.put("session_id", this.f69949mo);
            jSONObjectDn.put("nw_ver", com.thinkup.core.common.nn.m0.dd());
            jSONObjectDn.put("exclude_myofferid", com.thinkup.core.common.n0.d().d(this.f69952n0));
            if (com.thinkup.core.common.o.nd.m().m0() != null) {
                jSONObjectDn.put(TUAdConst.NETWORK_REQUEST_PARAMS_KEY.EXCLUDE_OFFER, com.thinkup.core.common.o.nd.m().m0());
            }
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
            JSONObject jSONObjectD = d0.d(this.f69951n);
            if (jSONObjectD != null) {
                jSONObjectDn.put("custom", jSONObjectD);
            }
            jSONObjectDn.put("deny", com.thinkup.core.common.nn.m0.mm(com.thinkup.core.common.o.nd.m().dd()));
            if (com.thinkup.core.common.o.nd.m().om()) {
                com.thinkup.core.common.o.nd.m().on().fillRequestParam(jSONObjectDn);
            }
            Map<String, Object> map = this.f69956no;
            if (map != null && (obj2 = map.get(TUAdConst.KEY.CP_PLACEMENT_ID)) != null) {
                jSONObjectDn.put(d0.dom, obj2.toString());
            }
            Map<String, String> map2 = this.f69957nq;
            if (map2 != null && map2.size() != 0) {
                try {
                    jSONObjectDn.put("cached", new JSONObject(this.f69957nq));
                } catch (Throwable unused) {
                }
            }
            jSONObjectDn.put(d0.dqo, this.f69958o0);
            JSONObject jSONObjectD2 = com.thinkup.core.o.m.d().d(this.f69950mq);
            if (jSONObjectD2 != null) {
                jSONObjectDn.put(d0.dqq, jSONObjectD2);
            }
            if (com.thinkup.core.common.no.d().d(this.f69950mq)) {
                jSONObjectDn.put(d0.m00, 2);
            } else {
                jSONObjectDn.put(d0.m00, 1);
            }
            if (TUAdxSetting.getInstance().isAdxNetworkMode(this.f69950mq)) {
                jSONObjectDn.put(d0.n0o, 1);
            }
            try {
                JSONObject jSONObject = new JSONObject();
                JSONObject jSONObject2 = this.f69959od;
                if (jSONObject2 != null && jSONObject2.length() > 0) {
                    Iterator<String> itKeys = this.f69959od.keys();
                    while (itKeys.hasNext()) {
                        String next = itKeys.next();
                        jSONObject.put(next, this.f69959od.get(next));
                    }
                }
                if (jSONObject.length() > 0) {
                    jSONObjectDn.put(d0.nd0, jSONObject.toString());
                }
            } catch (Throwable unused2) {
            }
            jSONObjectDn.put(d0.ndn, new JSONArray(TUAdConst.AD_SUPPORT_SDK_DSP_ID_ARRAY));
            if (!TextUtils.isEmpty(this.f69960om)) {
                jSONObjectDn.put(d0.nm0, this.f69960om);
                JSONObject jSONObject3 = this.f69961on;
                if (jSONObject3 != null) {
                    jSONObjectDn.put(d0.nmd, jSONObject3);
                }
            }
            TUAdRequest tUAdRequest = this.f69962oo;
            if (tUAdRequest != null) {
                jSONObjectDn.put(d0.no0, tUAdRequest.getChannelSource());
            } else {
                jSONObjectDn.put(d0.no0, com.thinkup.core.common.o.nd.m().qd());
            }
            Pair<Integer, List<String>> pairQo = com.thinkup.core.common.o.nd.m().qo();
            if (pairQo != null && (obj = pairQo.first) != null) {
                jSONObjectDn.put(d0.nod, ((Integer) obj).intValue());
            }
            com.thinkup.core.q.m mVarM = com.thinkup.core.q.o.d(com.thinkup.core.common.o.nd.m().dd()).m(com.thinkup.core.common.o.nd.m().mo());
            if (mVarM != null) {
                String strQ = mVarM.q();
                if (!TextUtils.isEmpty(strQ)) {
                    jSONObjectDn.put(d0.nom, strQ);
                }
            }
            if (!TextUtils.isEmpty(this.f69966qm)) {
                if (this.f69964q0) {
                    this.f69966qm += "_cdn";
                }
                jSONObjectDn.put(d0.od0, this.f69966qm);
            }
            doq doqVar = this.f69965qd;
            if (doqVar != null && !TextUtils.isEmpty(doqVar.dq())) {
                jSONObjectDn.put(d0.o0q, this.f69965qd.dq());
            }
            if (!TextUtils.isEmpty(this.f69967qn)) {
                jSONObjectDn.put(d0.odd, this.f69967qn);
            }
        } catch (JSONException unused3) {
        }
        return jSONObjectDn;
    }

    @Override // com.thinkup.core.common.m0.m
    /* JADX INFO: renamed from: do */
    public final JSONObject mo259do() {
        return super.mo259do();
    }

    @Override // com.thinkup.core.common.m0.m
    public String m() {
        String strM;
        if (TextUtils.isEmpty(this.f69963oq)) {
            com.thinkup.core.common.dn.d();
            strM = com.thinkup.core.common.dn.m(true);
        } else {
            strM = this.f69963oq;
        }
        if (!TextUtils.isEmpty(strM)) {
            this.f69967qn = com.thinkup.core.common.nn.mo.q(strM);
        }
        return strM;
    }

    @Override // com.thinkup.core.common.m0.m
    public final void m0() {
    }

    @Override // com.thinkup.core.common.m0.m
    public final boolean md() {
        return true;
    }

    @Override // com.thinkup.core.common.m0.m
    public final int mm() {
        return Opcodes.INVOKESPECIAL;
    }

    @Override // com.thinkup.core.common.m0.m
    public final com.thinkup.core.common.m0.n.o mn() {
        com.thinkup.core.common.m0.n.o oVarD = com.thinkup.core.common.m0.n.o.d(com.thinkup.core.common.m0.n.dd.f69899d, this.f69950mq);
        oVarD.d(this.f69969qq);
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
        return this.f69953nd;
    }

    private void m(JSONObject jSONObject) throws JSONException {
        JSONObject jSONObjectD = com.thinkup.core.o.m.d().d(this.f69950mq);
        if (jSONObjectD != null) {
            jSONObject.put(d0.dqq, jSONObjectD);
        }
    }

    public final nn m(String str) {
        this.f69963oq = str;
        return this;
    }

    public final nn m(boolean z10) {
        this.f69964q0 = z10;
        return this;
    }

    @Override // com.thinkup.core.common.m0.m
    public final void d(int i10, nd ndVar) {
        this.f69946m0 = System.currentTimeMillis();
        this.f69947md = SystemClock.elapsedRealtime();
        super.d(i10, ndVar);
    }

    public final void d(JSONObject jSONObject) {
        if (jSONObject == null || this.f69951n == null) {
            return;
        }
        try {
            jSONObject.put(f69944m, new JSONObject(this.f69951n));
        } catch (Exception unused) {
        }
    }

    @Override // com.thinkup.core.common.m0.m
    public final int d() {
        return 1;
    }

    @Override // com.thinkup.core.common.m0.m
    public void d(AdError adError) {
        com.thinkup.core.common.nm.d0.d("placement", adError.getPlatformCode(), adError.getPlatformMSG(), m(), this.f69950mq, "", "", this.f69962oo, this.f69968qo, 0);
    }

    public final nn d(boolean z10) {
        this.f69969qq = z10;
        return this;
    }
}