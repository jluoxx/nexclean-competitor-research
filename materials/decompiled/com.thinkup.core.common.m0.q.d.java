package com.thinkup.core.common.m0.q;

import com.thinkup.core.common.nn.Cdo;
import com.thinkup.core.common.nn.mm;
import com.thinkup.core.common.o.nd;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes7.dex */
public final class d extends dn {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    List<String> f70050d;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    int f70051m;

    /* JADX INFO: renamed from: mq, reason: collision with root package name */
    private final String f70052mq = d.class.getSimpleName();

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    long f70053n;

    public d(List<String> list, long j10) {
        this.f70050d = list;
        this.f70051m = list.size();
        this.f70053n = j10;
    }

    private int md() {
        return this.f70051m;
    }

    private String mm() {
        JSONObject jSONObjectDq = super.dq();
        JSONObject jSONObjectM0 = super.m0();
        if (jSONObjectDq != null) {
            try {
                jSONObjectDq.put("app_id", nd.m().mo());
                jSONObjectDq.put("nw_ver", com.thinkup.core.common.nn.m0.dd().toString());
                Iterator<String> itKeys = jSONObjectM0.keys();
                while (itKeys.hasNext()) {
                    String next = itKeys.next();
                    jSONObjectDq.put(next, jSONObjectM0.opt(next));
                }
                Map<String, Object> mapMd = nd.m().md();
                if (mapMd != null) {
                    try {
                        if (mapMd.size() > 0) {
                            JSONObject jSONObject = new JSONObject();
                            for (String str : mapMd.keySet()) {
                                Object obj = mapMd.get(str);
                                if (obj != null) {
                                    jSONObject.put(str, obj.toString());
                                }
                            }
                            jSONObjectDq.put("custom", jSONObject);
                        }
                    } catch (Throwable unused) {
                    }
                }
                jSONObjectDq.put(com.thinkup.core.common.m0.d0.ddn, this.f70103mn);
                jSONObjectDq.put(com.thinkup.core.common.m0.d0.ddq, this.f70104mo);
                jSONObjectDq.put(com.thinkup.core.common.m0.d0.dm0, this.f70104mo);
            } catch (Exception unused2) {
            }
        }
        JSONObject jSONObject2 = new JSONObject();
        String strD = Cdo.d(jSONObjectDq.toString());
        try {
            JSONArray jSONArray = new JSONArray();
            List<String> list = this.f70050d;
            if (list != null && !list.isEmpty()) {
                for (String str2 : this.f70050d) {
                    JSONObject jSONObject3 = new JSONObject();
                    System.currentTimeMillis();
                    JSONObject jSONObject4 = new JSONObject();
                    jSONObject4.put(com.thinkup.core.common.m0.d0.nnm, com.thinkup.core.common.nn.m0.mq());
                    jSONObject4.put(com.thinkup.core.common.m0.d0.nnn, com.thinkup.core.common.mm.q.d().dd());
                    JSONObject jSONObject5 = new JSONObject();
                    jSONObject5.put(com.thinkup.core.common.m0.d0.nno, com.thinkup.core.common.mm.q.d().d0());
                    JSONObject jSONObject6 = new JSONObject();
                    jSONObject6.put(com.thinkup.core.common.m0.d0.nnd, str2);
                    jSONObject3.put(com.thinkup.core.common.m0.d0.nmm, this.f70053n);
                    jSONObject3.put(com.thinkup.core.common.m0.d0.nmn, nd.m().dnq());
                    jSONObject3.put(com.thinkup.core.common.m0.d0.nmo, jSONObject4.toString());
                    jSONObject3.put(com.thinkup.core.common.m0.d0.nmq, jSONObject5.toString());
                    jSONObject3.put(com.thinkup.core.common.m0.d0.nn0, jSONObject6.toString());
                    jSONArray.put(jSONObject3);
                }
            }
            String strD2 = Cdo.d(jSONArray.toString());
            String strN = mm.n(nd.m().mq() + "api_ver=1.0&common=" + strD + "&data=" + strD2);
            jSONObject2.put(com.thinkup.core.common.m0.d0.dmo, strD);
            jSONObject2.put("data", strD2);
            jSONObject2.put(com.thinkup.core.common.m0.d0.dd0, "1.0");
            jSONObject2.put(com.thinkup.core.common.m0.d0.dmn, strN);
        } catch (Exception unused3) {
        }
        return jSONObject2.toString();
    }

    @Override // com.thinkup.core.common.m0.q.dn
    public final int d() {
        return 10;
    }

    @Override // com.thinkup.core.common.m0.q.dn
    public final int d0() {
        return 4;
    }

    @Override // com.thinkup.core.common.m0.q.dn
    public final int m() {
        return 3;
    }

    @Override // com.thinkup.core.common.m0.q.dn
    public final byte[] n() {
        return dn.d(mm());
    }

    @Override // com.thinkup.core.common.m0.q.dn
    public final boolean o() {
        return false;
    }

    @Override // com.thinkup.core.common.m0.q.dn
    public final void q() {
    }
}