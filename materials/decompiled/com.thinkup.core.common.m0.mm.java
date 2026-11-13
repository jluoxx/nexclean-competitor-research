package com.thinkup.core.common.m0;

import android.content.Context;
import android.os.SystemClock;
import com.thinkup.core.api.AdError;
import com.thinkup.core.api.TUAdRequest;
import com.thinkup.core.common.dm.ddn;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes7.dex */
public final class mm extends m {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    List<ddn> f69845d;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    long f69846m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    long f69847n;

    public mm(List<ddn> list) {
        this.f69845d = list;
    }

    private String nm() {
        try {
            JSONObject jSONObject = new JSONObject();
            d0.d(com.thinkup.core.common.o.nd.m().dd(), jSONObject);
            List<ddn> list = this.f69845d;
            if (list != null && !list.isEmpty()) {
                JSONArray jSONArray = new JSONArray();
                for (ddn ddnVar : this.f69845d) {
                    if (ddnVar != null) {
                        JSONObject jSONObject2 = new JSONObject();
                        ddnVar.m(jSONObject2);
                        jSONArray.put(jSONObject2);
                    }
                }
                jSONObject.put("t_items", jSONArray);
            }
            return jSONObject.toString();
        } catch (Throwable unused) {
            return "";
        }
    }

    @Override // com.thinkup.core.common.m0.m
    public final void d(AdError adError) {
        String platformCode = adError.getPlatformCode();
        String platformMSG = adError.getPlatformMSG();
        com.thinkup.core.common.dn.d();
        com.thinkup.core.common.nm.d0.d("ht_bt", platformCode, platformMSG, com.thinkup.core.common.dn.mm(), "", "", "", (TUAdRequest) null);
    }

    @Override // com.thinkup.core.common.m0.m
    public final Context d0() {
        return null;
    }

    @Override // com.thinkup.core.common.m0.m
    public final String dd() {
        return "";
    }

    @Override // com.thinkup.core.common.m0.m
    public final Map<String, Object> dm() {
        return null;
    }

    @Override // com.thinkup.core.common.m0.m
    public final String m() {
        com.thinkup.core.common.dn.d();
        return com.thinkup.core.common.dn.mm();
    }

    @Override // com.thinkup.core.common.m0.m
    public final void m0() {
    }

    @Override // com.thinkup.core.common.m0.m
    public final com.thinkup.core.common.m0.n.o mn() {
        return com.thinkup.core.common.m0.n.o.d(com.thinkup.core.common.m0.n.dd.f69908mm);
    }

    @Override // com.thinkup.core.common.m0.m
    public final Map<String, String> n() {
        HashMap map = new HashMap();
        map.put("Accept-Encoding", "gzip");
        map.put("Content-Type", "application/json;charset=utf-8");
        return map;
    }

    @Override // com.thinkup.core.common.m0.m
    public final byte[] o() {
        return nm().getBytes();
    }

    @Override // com.thinkup.core.common.m0.m
    public final String q() {
        return com.thinkup.core.common.o.nd.m().mo();
    }

    @Override // com.thinkup.core.common.m0.m
    public final void d(int i10, nd ndVar) {
        this.f69846m = System.currentTimeMillis();
        this.f69847n = SystemClock.elapsedRealtime();
        super.d(i10, ndVar);
    }

    @Override // com.thinkup.core.common.m0.m
    public final int d() {
        return 1;
    }

    @Override // com.thinkup.core.common.m0.m
    public final Object d(Object obj) {
        com.thinkup.core.common.nm.d0.d("ht_bt", "", this.f69846m, System.currentTimeMillis(), SystemClock.elapsedRealtime() - this.f69847n, (TUAdRequest) null);
        return obj;
    }
}