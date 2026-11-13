package com.thinkup.core.common.m0.q;

import com.thinkup.core.common.nn.Cdo;
import com.thinkup.core.common.nn.mm;
import com.thinkup.core.common.o.nd;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes7.dex */
public final class m0 extends dn {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    List<com.thinkup.core.common.nm.d.m.d.d.n> f70121d;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    boolean f70122m;

    /* JADX INFO: renamed from: mq, reason: collision with root package name */
    private int f70123mq;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final String f70124n = m0.class.getSimpleName();

    public m0(List<com.thinkup.core.common.nm.d.m.d.d.n> list) {
        this.f70121d = list;
    }

    private String md() {
        JSONObject jSONObject = new JSONObject();
        JSONObject jSONObjectDq = super.dq();
        JSONObject jSONObjectM0 = super.m0();
        try {
            jSONObjectDq.put("app_id", nd.m().mo());
            jSONObjectDq.put(com.thinkup.core.common.m0.d0.ddn, this.f70103mn);
            jSONObjectDq.put(com.thinkup.core.common.m0.d0.ddq, this.f70104mo);
            Iterator<String> itKeys = jSONObjectM0.keys();
            while (itKeys.hasNext()) {
                String next = itKeys.next();
                jSONObjectDq.put(next, jSONObjectM0.opt(next));
            }
            Map<String, Object> mapMd = nd.m().md();
            if (mapMd != null) {
                try {
                    if (mapMd.size() > 0) {
                        JSONObject jSONObject2 = new JSONObject();
                        for (String str : mapMd.keySet()) {
                            Object obj = mapMd.get(str);
                            if (obj != null) {
                                jSONObject2.put(str, obj.toString());
                            }
                        }
                        jSONObjectDq.put("custom", jSONObject2);
                    }
                } catch (Throwable unused) {
                }
            }
            com.thinkup.core.common.m0.d0.m(jSONObjectDq);
        } catch (JSONException unused2) {
        }
        String strD = Cdo.d(jSONObjectDq.toString());
        JSONArray jSONArray = new JSONArray();
        List<com.thinkup.core.common.nm.d.m.d.d.n> list = this.f70121d;
        if (list != null) {
            for (com.thinkup.core.common.nm.d.m.d.d.n nVar : list) {
                JSONObject jSONObjectD = nVar.d();
                if (jSONObjectD != null) {
                    try {
                        jSONObjectD.put(com.thinkup.core.common.m0.d0.ddo, nVar.m());
                    } catch (JSONException e10) {
                        e10.printStackTrace();
                    }
                    jSONArray.put(jSONObjectD);
                }
            }
        }
        String strD2 = Cdo.d(jSONArray.toString());
        String strN = mm.n(nd.m().mq() + "api_ver=1.0&common=" + strD + "&data=" + strD2);
        try {
            jSONObject.put(com.thinkup.core.common.m0.d0.dmo, strD);
            jSONObject.put("data", strD2);
            jSONObject.put(com.thinkup.core.common.m0.d0.dd0, "1.0");
            jSONObject.put(com.thinkup.core.common.m0.d0.dmn, strN);
        } catch (Exception unused3) {
        }
        return jSONObject.toString();
    }

    @Override // com.thinkup.core.common.m0.q.dn
    public final int d() {
        return 1;
    }

    @Override // com.thinkup.core.common.m0.q.dn
    public final int d0() {
        return 6;
    }

    @Override // com.thinkup.core.common.m0.q.dn
    public final int m() {
        return 3;
    }

    @Override // com.thinkup.core.common.m0.q.dn
    public final byte[] n() {
        List<com.thinkup.core.common.nm.d.m.d.d.n> list = this.f70121d;
        return (list == null || list.size() <= 0) ? new byte[0] : dn.d(md());
    }

    @Override // com.thinkup.core.common.m0.q.dn
    public final boolean o() {
        return this.f70122m;
    }

    @Override // com.thinkup.core.common.m0.q.dn
    public final void q() {
    }
}