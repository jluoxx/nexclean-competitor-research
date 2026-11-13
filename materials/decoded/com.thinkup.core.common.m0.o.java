package com.thinkup.core.common.m0;

import android.content.Context;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.Pair;
import com.android.systemui.shared.system.SysUiStatsLog;
import com.thinkup.core.api.AdError;
import com.thinkup.core.api.TUAdRequest;
import com.thinkup.core.common.nn.Cdo;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes7.dex */
public final class o extends m {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final com.thinkup.core.common.dm.n0 f69973d;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private long f69974m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private long f69975n;

    public o(com.thinkup.core.common.dm.n0 n0Var) {
        this.f69973d = n0Var;
    }

    @Override // com.thinkup.core.common.m0.m
    public final void d(AdError adError) {
        String platformCode = adError.getPlatformCode();
        String platformMSG = adError.getPlatformMSG();
        com.thinkup.core.common.dn.d();
        com.thinkup.core.common.nm.d0.d(com.thinkup.core.q.m.d.f73916om, platformCode, platformMSG, com.thinkup.core.common.dn.md(), "", "", "", (TUAdRequest) null);
    }

    @Override // com.thinkup.core.common.m0.m
    public final Context d0() {
        return com.thinkup.core.common.o.nd.m().dd();
    }

    @Override // com.thinkup.core.common.m0.m
    public final String dd() {
        com.thinkup.core.common.dm.n0 n0Var = this.f69973d;
        return n0Var != null ? n0Var.n() : "";
    }

    @Override // com.thinkup.core.common.m0.m
    public final Map<String, Object> dm() {
        return Collections.EMPTY_MAP;
    }

    @Override // com.thinkup.core.common.m0.m
    public final JSONObject dn() {
        Object obj;
        JSONObject jSONObjectDn = super.dn();
        try {
            com.thinkup.core.common.dm.n0 n0Var = this.f69973d;
            jSONObjectDn.put("app_id", n0Var != null ? n0Var.m() : "");
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
            try {
                JSONObject jSONObject = new JSONObject();
                com.thinkup.core.common.dn.n.d().d(jSONObject);
                if (jSONObject.length() > 0) {
                    jSONObjectDn.put(d0.nd0, jSONObject.toString());
                }
            } catch (Throwable unused) {
            }
            jSONObjectDn.putOpt(d0.ndd, 1);
            jSONObjectDn.put(d0.no0, com.thinkup.core.common.o.nd.m().qd());
            Pair<Integer, List<String>> pairQo = com.thinkup.core.common.o.nd.m().qo();
            if (pairQo != null && (obj = pairQo.first) != null) {
                jSONObjectDn.put(d0.nod, ((Integer) obj).intValue());
            }
        } catch (Throwable unused2) {
        }
        return jSONObjectDn;
    }

    @Override // com.thinkup.core.common.m0.m
    public final String dq() {
        try {
            HashMap map = new HashMap();
            String strD = Cdo.d(dn().toString());
            String strD2 = Cdo.d(mo259do().toString());
            map.put(d0.dd0, mq());
            map.put("p", strD);
            map.put(d0.dmm, strD2);
            com.thinkup.core.common.dm.n0 n0Var = this.f69973d;
            byte[] bArrD = n0Var != null ? n0Var.d() : null;
            if (bArrD != null && bArrD.length > 0) {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("enc_d", new String(bArrD));
                map.put("p3", Cdo.d(jSONObject.toString()));
            }
            ArrayList<String> arrayList = new ArrayList(map.size());
            arrayList.addAll(map.keySet());
            Collections.sort(arrayList);
            StringBuilder sb2 = new StringBuilder();
            for (String str : arrayList) {
                if (sb2.length() > 0) {
                    sb2.append("&");
                }
                sb2.append(str);
                sb2.append("=");
                sb2.append(map.get(str));
            }
            map.put(d0.dmn, com.thinkup.core.common.nn.mm.n(dd() + sb2.toString()));
            return new JSONObject(map).toString();
        } catch (Throwable unused) {
            return "";
        }
    }

    @Override // com.thinkup.core.common.m0.m
    public final String m() {
        com.thinkup.core.common.dn.d();
        return com.thinkup.core.common.dn.md();
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
        return SysUiStatsLog.STYLE_UI_CHANGED;
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
        return arrayList;
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
        com.thinkup.core.common.dm.n0 n0Var = this.f69973d;
        return n0Var != null ? n0Var.m() : "";
    }

    @Override // com.thinkup.core.common.m0.m
    public final int d() {
        return 1;
    }

    @Override // com.thinkup.core.common.m0.m
    public final Object d(Object obj) {
        com.thinkup.core.common.nm.d0.d(com.thinkup.core.q.m.d.f73916om, (String) null, this.f69974m, System.currentTimeMillis(), SystemClock.elapsedRealtime() - this.f69975n, (TUAdRequest) null);
        return obj;
    }

    @Override // com.thinkup.core.common.m0.m
    public final void d(int i10, nd ndVar) {
        this.f69974m = System.currentTimeMillis();
        this.f69975n = SystemClock.elapsedRealtime();
        super.d(i10, ndVar);
    }
}