package com.thinkup.core.common.mq;

import com.thinkup.core.api.TUAdRequest;

/* JADX INFO: loaded from: classes7.dex */
public final class m {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    dm f71495d;

    /* JADX INFO: renamed from: d0, reason: collision with root package name */
    TUAdRequest f71496d0;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    int f71497m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    boolean f71498n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    long f71499o;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    o f71500q;

    public m(dm dmVar, int i10, TUAdRequest tUAdRequest) {
        this.f71495d = dmVar;
        this.f71497m = i10;
        this.f71496d0 = tUAdRequest;
    }

    private boolean n() {
        return this.f71498n;
    }

    private long o() {
        return this.f71499o;
    }

    public final TUAdRequest d() {
        return this.f71496d0;
    }

    public final void m() {
        this.f71498n = true;
    }

    public final void d(long j10) {
        this.f71499o = j10;
    }

    public final void d(o oVar) {
        this.f71500q = oVar;
    }
}