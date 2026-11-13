package com.thinkup.core.common.m0.n;

/* JADX INFO: loaded from: classes7.dex */
public final class d0 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private String f69893d;

    /* JADX INFO: renamed from: d0, reason: collision with root package name */
    private Object f69894d0;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private int f69895m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private long f69896n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private boolean f69897o;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private int f69898q;

    private d0() {
    }

    public static d0 d() {
        return new d0();
    }

    public final int d0() {
        return this.f69898q;
    }

    public final Object dd() {
        return this.f69894d0;
    }

    public final String m() {
        return this.f69893d;
    }

    public final int n() {
        return this.f69895m;
    }

    public final long o() {
        return this.f69896n;
    }

    public final boolean q() {
        return this.f69897o;
    }

    public final String toString() {
        return "HttpRespEntity{urlKey='" + this.f69893d + "', statusCode=" + this.f69895m + ", reqNextTime=" + this.f69896n + ", isIntercept=" + this.f69897o + ", interceptStatusCode=" + this.f69898q + ", interceptResult=" + this.f69894d0 + '}';
    }

    public final void m(int i10) {
        this.f69898q = i10;
    }

    public final void d(String str) {
        this.f69893d = str;
    }

    public final void d(int i10) {
        this.f69895m = i10;
    }

    public final void d(long j10) {
        this.f69896n = j10;
    }

    public final void d(boolean z10) {
        this.f69897o = z10;
    }

    public final void d(Object obj) {
        this.f69894d0 = obj;
    }
}