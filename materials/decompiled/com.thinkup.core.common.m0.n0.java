package com.thinkup.core.common.m0;

import android.content.Context;
import android.text.TextUtils;
import com.thinkup.core.api.AdError;
import java.util.Map;

/* JADX INFO: loaded from: classes7.dex */
public final class n0 extends m {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private String f69937d;

    public n0(String str) {
        this.f69937d = str;
    }

    @Override // com.thinkup.core.common.m0.m
    public final int d() {
        return 2;
    }

    @Override // com.thinkup.core.common.m0.m
    public final Context d0() {
        return null;
    }

    @Override // com.thinkup.core.common.m0.m
    public final String dd() {
        return null;
    }

    @Override // com.thinkup.core.common.m0.m
    public final Map<String, Object> dm() {
        return null;
    }

    @Override // com.thinkup.core.common.m0.m
    public final String m() {
        long jCurrentTimeMillis = System.currentTimeMillis();
        String strN = com.thinkup.core.common.nn.mm.n(String.valueOf(jCurrentTimeMillis));
        if (TextUtils.isEmpty(this.f69937d)) {
            StringBuilder sb2 = new StringBuilder();
            com.thinkup.core.common.dn.d();
            sb2.append(com.thinkup.core.common.dn.m());
            sb2.append("?t=");
            sb2.append(jCurrentTimeMillis);
            sb2.append("&sign=");
            sb2.append(strN);
            return sb2.toString();
        }
        String strN2 = com.thinkup.core.common.nn.mm.n(jCurrentTimeMillis + "_" + this.f69937d);
        StringBuilder sb3 = new StringBuilder();
        com.thinkup.core.common.dn.d();
        sb3.append(com.thinkup.core.common.dn.m());
        sb3.append("?t=");
        sb3.append(jCurrentTimeMillis);
        sb3.append("&sign=");
        sb3.append(strN2);
        sb3.append("&app_id=");
        sb3.append(this.f69937d);
        return sb3.toString();
    }

    @Override // com.thinkup.core.common.m0.m
    public final void m0() {
    }

    @Override // com.thinkup.core.common.m0.m
    public final boolean md() {
        return true;
    }

    @Override // com.thinkup.core.common.m0.m
    public final com.thinkup.core.common.m0.n.o mn() {
        return com.thinkup.core.common.m0.n.o.d(com.thinkup.core.common.m0.n.dd.f69909n);
    }

    @Override // com.thinkup.core.common.m0.m
    public final Map<String, String> n() {
        return null;
    }

    @Override // com.thinkup.core.common.m0.m
    public final byte[] o() {
        return new byte[0];
    }

    @Override // com.thinkup.core.common.m0.m
    public final String q() {
        return null;
    }

    @Override // com.thinkup.core.common.m0.m
    public final Object d(Object obj) {
        return obj;
    }

    @Override // com.thinkup.core.common.m0.m
    public final void d(AdError adError) {
    }

    public n0() {
    }
}