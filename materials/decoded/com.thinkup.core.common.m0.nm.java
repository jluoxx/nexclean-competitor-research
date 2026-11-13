package com.thinkup.core.common.m0;

import android.content.Context;
import android.os.SystemClock;
import com.thinkup.core.api.AdError;
import com.thinkup.core.common.dm.doq;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes7.dex */
public final class nm extends m {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Context f69938d;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final doq f69939m;

    /* JADX INFO: renamed from: m0, reason: collision with root package name */
    private long f69940m0;

    /* JADX INFO: renamed from: md, reason: collision with root package name */
    private long f69941md;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private String f69942n;

    public nm(Context context, doq doqVar) {
        this.f69938d = context;
        this.f69939m = doqVar;
        this.f69942n = com.thinkup.core.common.o.nd.m().dd(doqVar.o());
    }

    @Override // com.thinkup.core.common.m0.m
    public final void d(AdError adError) {
        doq doqVar = this.f69939m;
        String strO = doqVar != null ? doqVar.o() : "";
        doq doqVar2 = this.f69939m;
        com.thinkup.core.common.nm.d0.d("pl_wf", adError.getPlatformCode(), adError.getPlatformMSG(), m(), strO, "", "", doqVar2 != null ? doqVar2.m219do() : null);
    }

    @Override // com.thinkup.core.common.m0.m
    public final Context d0() {
        return this.f69938d;
    }

    @Override // com.thinkup.core.common.m0.m
    public final String dd() {
        doq doqVar = this.f69939m;
        return doqVar != null ? doqVar.n() : "";
    }

    @Override // com.thinkup.core.common.m0.m
    public final Map<String, Object> dm() {
        return null;
    }

    @Override // com.thinkup.core.common.m0.m
    public final JSONObject dn() {
        if (this.f69939m == null) {
            return super.dn();
        }
        JSONObject jSONObjectDn = super.dn();
        try {
            jSONObjectDn.put("app_id", this.f69939m.m());
            jSONObjectDn.put(d0.ndo, this.f69939m.o());
            jSONObjectDn.put("session_id", this.f69942n);
            jSONObjectDn.put(d0.nm0, this.f69939m.md());
        } catch (Throwable unused) {
        }
        return jSONObjectDn;
    }

    @Override // com.thinkup.core.common.m0.m
    public final String m() {
        com.thinkup.core.common.dn.d();
        return com.thinkup.core.common.dd.n.d().d(com.thinkup.core.common.dn.dm() ? com.thinkup.core.common.o.dn.q.ddd : com.thinkup.core.common.o.dn.q.f72916om);
    }

    @Override // com.thinkup.core.common.m0.m
    public final void m0() {
    }

    @Override // com.thinkup.core.common.m0.m
    public final boolean md() {
        return true;
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
        try {
            return dq().getBytes("utf-8");
        } catch (Exception unused) {
            return dq().getBytes();
        }
    }

    @Override // com.thinkup.core.common.m0.m
    public final String q() {
        doq doqVar = this.f69939m;
        return doqVar != null ? doqVar.m() : "";
    }

    @Override // com.thinkup.core.common.m0.m
    public final void d(int i10, nd ndVar) {
        this.f69940m0 = System.currentTimeMillis();
        this.f69941md = SystemClock.elapsedRealtime();
        super.d(i10, ndVar);
    }

    @Override // com.thinkup.core.common.m0.m
    public final int d() {
        return 1;
    }

    @Override // com.thinkup.core.common.m0.m
    public final Object d(Object obj) {
        doq doqVar = this.f69939m;
        String strO = doqVar != null ? doqVar.o() : "";
        doq doqVar2 = this.f69939m;
        com.thinkup.core.common.nm.d0.d("pl_wf", strO, this.f69940m0, System.currentTimeMillis(), SystemClock.elapsedRealtime() - this.f69941md, doqVar2 != null ? doqVar2.m219do() : null);
        return obj;
    }
}