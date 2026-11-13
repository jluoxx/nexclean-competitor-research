package com.thinkup.core.common.m0;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class c implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ m f69654a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f69655b;

    public /* synthetic */ c(m mVar, int i10) {
        this.f69654a = mVar;
        this.f69655b = i10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f69654a.o(this.f69655b);
    }
}