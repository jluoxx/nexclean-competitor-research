package com.thinkup.core.common.m0.n;

/* JADX INFO: loaded from: classes7.dex */
public final class o {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private String f69932d = "";

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private String f69933m = "";

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private boolean f69934n = false;

    private o() {
    }

    public static o d(String str, String str2) {
        o oVar = new o();
        oVar.f69932d = str;
        oVar.f69933m = str2;
        return oVar;
    }

    private static o o() {
        return new o();
    }

    public final String m() {
        return this.f69932d;
    }

    public final boolean n() {
        return this.f69934n;
    }

    public final String toString() {
        return "HttpReqEntity{urlType='" + this.f69932d + "', interceptKey='" + this.f69933m + "', fromTcpFallback=" + this.f69934n + '}';
    }

    private void m(String str) {
        this.f69933m = str;
    }

    public static o d(String str) {
        o oVar = new o();
        oVar.f69932d = str;
        return oVar;
    }

    public final String d() {
        return this.f69933m;
    }

    public final void d(boolean z10) {
        this.f69934n = z10;
    }
}