package com.thinkup.core.common.m0.q;

import android.text.TextUtils;

/* JADX INFO: loaded from: classes7.dex */
public final class dm extends dn {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    String f70089d;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    int f70092n;

    /* JADX INFO: renamed from: mq, reason: collision with root package name */
    private final String f70091mq = dm.class.getSimpleName();

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    boolean f70090m = true;

    private dm(String str, int i10) {
        this.f70092n = 1;
        this.f70089d = str;
        if (i10 == 1000) {
            this.f70092n = 1;
        } else if (i10 == 1001) {
            this.f70092n = 2;
        }
    }

    @Override // com.thinkup.core.common.m0.q.dn
    public final int d() {
        return this.f70092n;
    }

    @Override // com.thinkup.core.common.m0.q.dn
    public final int m() {
        return 3;
    }

    @Override // com.thinkup.core.common.m0.q.dn
    public final byte[] n() {
        return !TextUtils.isEmpty(this.f70089d) ? dn.d(this.f70089d) : new byte[0];
    }

    @Override // com.thinkup.core.common.m0.q.dn
    public final boolean o() {
        return this.f70090m;
    }

    @Override // com.thinkup.core.common.m0.q.dn
    public final void q() {
    }
}