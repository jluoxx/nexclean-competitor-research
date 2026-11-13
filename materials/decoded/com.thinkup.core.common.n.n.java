package com.thinkup.core.common.n;

/* JADX INFO: loaded from: classes7.dex */
public final class n {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private String f71552d;

    /* JADX INFO: renamed from: d0, reason: collision with root package name */
    private String f71553d0;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private long f71554m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private boolean f71555n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private String f71556o;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private boolean f71557q;

    private n(String str, String str2, boolean z10, long j10, boolean z11, String str3) {
        this.f71552d = str;
        this.f71553d0 = str2;
        this.f71557q = z10;
        this.f71554m = j10;
        this.f71555n = z11;
        this.f71556o = str3;
    }

    private String d0() {
        return this.f71553d0;
    }

    private String m() {
        return this.f71552d;
    }

    private long n() {
        return this.f71554m;
    }

    private boolean o() {
        return this.f71555n;
    }

    private String q() {
        return this.f71556o;
    }

    public final boolean d() {
        return this.f71557q;
    }

    public final String toString() {
        return "ApkInspectResult{pkgName='" + this.f71552d + "', inspectTime=" + this.f71554m + ", inspectResult=" + this.f71555n + ", appVersion='" + this.f71556o + "', isRealTimeInspect=" + this.f71557q + ", uploadKey='" + this.f71553d0 + "'}";
    }

    private n(String str, String str2, boolean z10, long j10, boolean z11) {
        this(str, str2, z10, j10, z11, null);
    }
}