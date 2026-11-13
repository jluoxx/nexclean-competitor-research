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
public class o0 extends m {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int f70009d = 1;
    private static final String d00 = "o0";

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final int f70010m = 2;

    /* JADX INFO: renamed from: m0, reason: collision with root package name */
    public static final int f70011m0 = 4;

    /* JADX INFO: renamed from: md, reason: collision with root package name */
    public static final int f70012md = 5;

    /* JADX INFO: renamed from: mm, reason: collision with root package name */
    public static final int f70013mm = 6;

    /* JADX INFO: renamed from: mn, reason: collision with root package name */
    public static final int f70014mn = 7;

    /* JADX INFO: renamed from: mo, reason: collision with root package name */
    public static final int f70015mo = 8;

    /* JADX INFO: renamed from: mq, reason: collision with root package name */
    public static final int f70016mq = 9;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final int f70017n = 3;

    /* JADX INFO: renamed from: n0, reason: collision with root package name */
    public static final int f70018n0 = 10;

    /* JADX INFO: renamed from: nd, reason: collision with root package name */
    public static final int f70019nd = 11;

    /* JADX INFO: renamed from: nm, reason: collision with root package name */
    public static final int f70020nm = 12;

    /* JADX INFO: renamed from: nn, reason: collision with root package name */
    public static final int f70021nn = 13;

    /* JADX INFO: renamed from: no, reason: collision with root package name */
    public static final int f70022no = 15;

    /* JADX INFO: renamed from: nq, reason: collision with root package name */
    public static final int f70023nq = 16;

    /* JADX INFO: renamed from: o0, reason: collision with root package name */
    public static final int f70024o0 = 18;

    /* JADX INFO: renamed from: od, reason: collision with root package name */
    public static final int f70025od = 19;

    /* JADX INFO: renamed from: om, reason: collision with root package name */
    public static final int f70026om = 20;

    /* JADX INFO: renamed from: on, reason: collision with root package name */
    public static final int f70027on = 21;

    /* JADX INFO: renamed from: oo, reason: collision with root package name */
    public static final int f70028oo = 22;

    /* JADX INFO: renamed from: oq, reason: collision with root package name */
    public static final int f70029oq = 23;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public static final int f70030q0 = 24;

    /* JADX INFO: renamed from: qd, reason: collision with root package name */
    public static final int f70031qd = 25;

    /* JADX INFO: renamed from: qm, reason: collision with root package name */
    public static final int f70032qm = 26;

    /* JADX INFO: renamed from: qn, reason: collision with root package name */
    public static final int f70033qn = 27;

    /* JADX INFO: renamed from: qo, reason: collision with root package name */
    public static final int f70034qo = 28;
    private Context d0d;
    private List<com.thinkup.core.common.dm.md> d0o;
    private com.thinkup.core.common.dm.md d0q;
    private int dd0;

    /* JADX INFO: renamed from: qq, reason: collision with root package name */
    boolean f70035qq = false;
    private String d0m = com.thinkup.core.common.o.nd.m().mo();
    private String d0n = com.thinkup.core.common.o.nd.m().mq();

    private o0(Context context, int i10, List<com.thinkup.core.common.dm.md> list) {
        this.d0d = context;
        this.dd0 = i10;
        this.d0o = list;
    }

    @Override // com.thinkup.core.common.m0.m
    public final void d(AdError adError) {
        List<com.thinkup.core.common.dm.md> list = this.d0o;
        com.thinkup.core.common.nm.d0.d("tk", adError.getPlatformCode(), adError.getPlatformMSG(), m(), (String) null, String.valueOf(list != null ? list.size() : 1), "0", (TUAdRequest) null);
    }

    @Override // com.thinkup.core.common.m0.m
    public final Context d0() {
        return this.d0d;
    }

    @Override // com.thinkup.core.common.m0.m
    public final String dd() {
        return this.d0n;
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
            jSONObjectDn.put("app_id", this.d0m);
            jSONObjectDn.put(d0.ddn, this.dd0);
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
        String strD = Cdo.d(dn().toString());
        JSONArray jSONArray = new JSONArray();
        List<com.thinkup.core.common.dm.md> list = this.d0o;
        if (list != null) {
            Iterator<com.thinkup.core.common.dm.md> it = list.iterator();
            while (it.hasNext()) {
                JSONObject jSONObjectD = it.next().d();
                d(jSONObjectD);
                jSONArray.put(jSONObjectD);
            }
        } else {
            com.thinkup.core.common.dm.md mdVar = this.d0q;
            if (mdVar != null) {
                JSONObject jSONObjectD2 = mdVar.d();
                d(jSONObjectD2);
                jSONArray.put(jSONObjectD2);
            }
        }
        String strD2 = Cdo.d(jSONArray.toString());
        String strN = com.thinkup.core.common.nn.mm.n(this.d0n + "api_ver=1.0&common=" + strD + "&data=" + strD2);
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
        com.thinkup.core.common.dm.md mdVar = this.d0q;
        if (mdVar != null) {
            return mdVar.f68329m.mqo;
        }
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
        return this.d0m;
    }

    @Override // com.thinkup.core.common.m0.m
    public final Object d(Object obj) {
        return obj;
    }

    @Override // com.thinkup.core.common.m0.m
    public final int d() {
        return 1;
    }

    private void d(JSONObject jSONObject) {
        if (!this.f70035qq || jSONObject == null) {
            return;
        }
        try {
            jSONObject.put(d0.ddo, 1);
        } catch (JSONException e10) {
            e10.printStackTrace();
        }
    }
}