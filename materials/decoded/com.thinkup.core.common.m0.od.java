package com.thinkup.core.common.m0;

import android.content.Context;
import com.thinkup.core.api.AdError;
import com.thinkup.core.api.TUAdRequest;
import com.thinkup.core.common.nn.Cdo;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes7.dex */
public class od extends m {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final String f70036d = "od";

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private Context f70037m;

    /* JADX INFO: renamed from: md, reason: collision with root package name */
    private List<com.thinkup.core.common.nm.d.m.d.d.n> f70039md;

    /* JADX INFO: renamed from: mm, reason: collision with root package name */
    private com.thinkup.core.common.nm.d.m.d.d.n f70040mm;

    /* JADX INFO: renamed from: mn, reason: collision with root package name */
    private int f70041mn;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private String f70042n = com.thinkup.core.common.o.nd.m().mo();

    /* JADX INFO: renamed from: m0, reason: collision with root package name */
    private String f70038m0 = com.thinkup.core.common.o.nd.m().mq();

    public od(Context context, int i10, List<com.thinkup.core.common.nm.d.m.d.d.n> list) {
        this.f70037m = context;
        this.f70041mn = i10;
        this.f70039md = list;
    }

    @Override // com.thinkup.core.common.m0.m
    public final void d(AdError adError) {
        List<com.thinkup.core.common.nm.d.m.d.d.n> list = this.f70039md;
        int size = list != null ? list.size() : 1;
        String platformCode = adError.getPlatformCode();
        String platformMSG = adError.getPlatformMSG();
        com.thinkup.core.common.dn.d();
        com.thinkup.core.common.nm.d0.d("tk", platformCode, platformMSG, com.thinkup.core.common.dn.o(), (String) null, String.valueOf(size), "0", (TUAdRequest) null);
    }

    @Override // com.thinkup.core.common.m0.m
    public final Context d0() {
        return this.f70037m;
    }

    @Override // com.thinkup.core.common.m0.m
    public final String dd() {
        return this.f70038m0;
    }

    @Override // com.thinkup.core.common.m0.m
    public final Map<String, Object> dm() {
        return null;
    }

    @Override // com.thinkup.core.common.m0.m
    public final JSONObject dn() {
        JSONObject jSONObjectDn = super.dn();
        JSONObject jSONObjectMo259do = super.mo259do();
        try {
            jSONObjectDn.put("app_id", this.f70042n);
            jSONObjectDn.put(d0.ddn, this.f70041mn);
            Iterator<String> itKeys = jSONObjectMo259do.keys();
            while (itKeys.hasNext()) {
                String next = itKeys.next();
                jSONObjectDn.put(next, jSONObjectMo259do.opt(next));
            }
            Map<String, Object> mapMd = com.thinkup.core.common.o.nd.m().md();
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
                        jSONObjectDn.put("custom", jSONObject);
                    }
                } catch (Throwable unused) {
                }
            }
            d0.m(jSONObjectDn);
        } catch (JSONException unused2) {
        }
        return jSONObjectDn;
    }

    @Override // com.thinkup.core.common.m0.m
    public final String dq() {
        JSONObject jSONObjectD;
        JSONObject jSONObject = new JSONObject();
        String strD = Cdo.d(dn().toString());
        JSONArray jSONArray = new JSONArray();
        List<com.thinkup.core.common.nm.d.m.d.d.n> list = this.f70039md;
        if (list != null) {
            for (com.thinkup.core.common.nm.d.m.d.d.n nVar : list) {
                JSONObject jSONObjectD2 = nVar.d();
                if (jSONObjectD2 != null) {
                    d(jSONObjectD2, nVar.m());
                    jSONArray.put(jSONObjectD2);
                }
            }
        } else {
            com.thinkup.core.common.nm.d.m.d.d.n nVar2 = this.f70040mm;
            if (nVar2 != null && (jSONObjectD = nVar2.d()) != null) {
                d(jSONObjectD, this.f70040mm.m());
                jSONArray.put(jSONObjectD);
            }
        }
        String strD2 = Cdo.d(jSONArray.toString());
        String strN = com.thinkup.core.common.nn.mm.n(this.f70038m0 + "api_ver=1.0&common=" + strD + "&data=" + strD2);
        try {
            jSONObject.put(d0.dmo, strD);
            jSONObject.put("data", strD2);
            jSONObject.put(d0.dd0, "1.0");
            jSONObject.put(d0.dmn, strN);
        } catch (Exception e10) {
            e10.printStackTrace();
        }
        return jSONObject.toString();
    }

    @Override // com.thinkup.core.common.m0.m
    public final String m() {
        com.thinkup.core.common.dn.d();
        return com.thinkup.core.common.dn.o();
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
        return this.f70042n;
    }

    @Override // com.thinkup.core.common.m0.m
    public final Object d(Object obj) {
        return obj;
    }

    @Override // com.thinkup.core.common.m0.m
    public final boolean d(int i10) {
        return false;
    }

    @Override // com.thinkup.core.common.m0.m
    public final int d() {
        return 1;
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
}