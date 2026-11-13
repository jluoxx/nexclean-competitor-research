package com.thinkup.core.common.m0;

import android.content.Context;
import android.text.TextUtils;
import com.thinkup.core.api.AdError;
import com.thinkup.core.common.nn.Cdo;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes7.dex */
public class d extends m {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private static final String f69656m = "d";

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    boolean f69657d = false;

    /* JADX INFO: renamed from: m0, reason: collision with root package name */
    private String f69658m0 = com.thinkup.core.common.o.nd.m().mo();

    /* JADX INFO: renamed from: md, reason: collision with root package name */
    private String f69659md = com.thinkup.core.common.o.nd.m().mq();

    /* JADX INFO: renamed from: mm, reason: collision with root package name */
    private List<String> f69660mm;

    /* JADX INFO: renamed from: mn, reason: collision with root package name */
    private int f69661mn;

    /* JADX INFO: renamed from: mo, reason: collision with root package name */
    private long f69662mo;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private Context f69663n;

    public d(Context context, int i10, List<String> list, long j10) {
        this.f69663n = context;
        this.f69661mn = i10;
        this.f69660mm = list;
        this.f69662mo = j10;
    }

    private static void d(JSONObject jSONObject, int i10) {
        if (jSONObject != null) {
            try {
                jSONObject.put(d0.ddo, i10);
            } catch (JSONException e10) {
                e10.printStackTrace();
            }
        }
    }

    @Override // com.thinkup.core.common.m0.m
    public final Context d0() {
        return this.f69663n;
    }

    @Override // com.thinkup.core.common.m0.m
    public final String dd() {
        return this.f69659md;
    }

    @Override // com.thinkup.core.common.m0.m
    public final Map<String, Object> dm() {
        return null;
    }

    @Override // com.thinkup.core.common.m0.m
    public final JSONObject dn() throws JSONException {
        JSONObject jSONObjectDn = super.dn();
        JSONObject jSONObjectMo259do = super.mo259do();
        try {
            jSONObjectDn.put("app_id", this.f69658m0);
            Iterator<String> itKeys = jSONObjectMo259do.keys();
            while (itKeys.hasNext()) {
                String next = itKeys.next();
                jSONObjectDn.put(next, jSONObjectMo259do.opt(next));
            }
            Map<String, Object> mapMd = com.thinkup.core.common.o.nd.m().md();
            if (mapMd != null && mapMd.size() > 0) {
                JSONObject jSONObject = new JSONObject();
                for (String str : mapMd.keySet()) {
                    Object obj = mapMd.get(str);
                    if (obj != null) {
                        jSONObject.put(str, obj.toString());
                    }
                }
                jSONObjectDn.put("custom", jSONObject);
            }
        } catch (Throwable unused) {
        }
        return jSONObjectDn;
    }

    @Override // com.thinkup.core.common.m0.m
    public final String dq() {
        JSONObject jSONObject = new JSONObject();
        try {
            String strD = Cdo.d(dn().toString());
            JSONArray jSONArray = new JSONArray();
            List<String> list = this.f69660mm;
            if (list != null && !list.isEmpty()) {
                for (String str : this.f69660mm) {
                    JSONObject jSONObject2 = new JSONObject();
                    JSONObject jSONObject3 = new JSONObject();
                    jSONObject3.put(d0.nnm, com.thinkup.core.common.nn.m0.mq());
                    jSONObject3.put(d0.nnn, com.thinkup.core.common.mm.q.d().dd());
                    JSONObject jSONObject4 = new JSONObject();
                    jSONObject4.put(d0.nno, com.thinkup.core.common.mm.q.d().d0());
                    JSONObject jSONObject5 = new JSONObject();
                    jSONObject5.put(d0.nnd, str);
                    jSONObject2.put(d0.nmm, this.f69662mo);
                    jSONObject2.put(d0.nmn, com.thinkup.core.common.o.nd.m().dnq());
                    jSONObject2.put(d0.nmo, jSONObject3.toString());
                    jSONObject2.put(d0.nmq, jSONObject4.toString());
                    jSONObject2.put(d0.nn0, jSONObject5.toString());
                    jSONArray.put(jSONObject2);
                }
            }
            String strD2 = Cdo.d(jSONArray.toString());
            String strN = com.thinkup.core.common.nn.mm.n(this.f69659md + "api_ver=1.0&common=" + strD + "&data=" + strD2);
            jSONObject.put(d0.dmo, strD);
            jSONObject.put("data", strD2);
            jSONObject.put(d0.dd0, "1.0");
            jSONObject.put(d0.dmn, strN);
        } catch (Throwable th2) {
            th2.printStackTrace();
        }
        return jSONObject.toString();
    }

    @Override // com.thinkup.core.common.m0.m
    public final String m() {
        com.thinkup.core.common.dn.d();
        com.thinkup.core.q.m mVarM = com.thinkup.core.q.o.d(com.thinkup.core.common.o.nd.m().dd()).m(com.thinkup.core.common.o.nd.m().mo());
        String strD = com.thinkup.core.common.dd.n.d().d(com.thinkup.core.common.dn.dm() ? com.thinkup.core.common.o.dn.q.f72925qo : com.thinkup.core.common.o.dn.q.f72900m0, com.thinkup.core.common.m0.n.dd.f69901dd);
        if (mVarM != null) {
            String strMoo = mVarM.moo();
            if (!TextUtils.isEmpty(strMoo)) {
                return strMoo.startsWith("http") ? strMoo.concat("/v2/open/anr") : com.thinkup.core.common.nn.mo.d(strD, strMoo);
            }
        }
        return strD;
    }

    @Override // com.thinkup.core.common.m0.m
    public final void m0() {
    }

    @Override // com.thinkup.core.common.m0.m
    public final int mm() {
        return 6;
    }

    @Override // com.thinkup.core.common.m0.m
    public final boolean mo() {
        return true;
    }

    @Override // com.thinkup.core.common.m0.m
    public final Map<String, String> n() {
        HashMap map = new HashMap();
        map.put("Content-Encoding", "gzip");
        map.put("Content-Type", "application/json;charset=utf-8");
        return map;
    }

    @Override // com.thinkup.core.common.m0.m
    public final byte[] o() {
        return m.d(dq());
    }

    @Override // com.thinkup.core.common.m0.m
    public final String q() {
        return this.f69658m0;
    }

    @Override // com.thinkup.core.common.m0.m
    public final Object d(Object obj) {
        return obj;
    }

    @Override // com.thinkup.core.common.m0.m
    public final void d(AdError adError) {
    }

    @Override // com.thinkup.core.common.m0.m
    public final boolean d(int i10) {
        return false;
    }

    @Override // com.thinkup.core.common.m0.m
    public final int d() {
        return 1;
    }
}