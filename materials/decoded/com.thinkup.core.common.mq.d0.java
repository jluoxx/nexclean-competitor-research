package com.thinkup.core.common.mq;

/* JADX INFO: loaded from: classes7.dex */
public final class d0 implements Runnable {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final int f71471d = 16;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final dm f71472m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final d f71473n;

    public d0(dm dmVar, d dVar) {
        this.f71472m = dmVar;
        this.f71473n = dVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        d dVar = this.f71473n;
        if (dVar != null) {
            dVar.d(this.f71471d, this.f71472m);
        }
    }
}