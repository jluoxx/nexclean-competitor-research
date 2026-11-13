package com.neeeex.virus;

import com.neeeex.eraser.m0;
import java.util.List;

/* JADX INFO: loaded from: classes7.dex */
public final class c0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final b0 f66651a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f66652b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f66653c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f66654d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final List f66655e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final String f66656f;

    public c0(b0 b0Var, int i10, String str, int i11, List list, String str2) {
        m0.a("te0OiDk=\n", "xYVv+1zsNjU=\n");
        b0Var.getClass();
        m0.a("F5AqC8bFmMUElQ==\n", "dOVYeaOr7IQ=\n");
        str.getClass();
        m0.a("MrfUq1gWYw==\n", "Rt+mzjliEMo=\n");
        list.getClass();
        m0.a("rH7zXrN8iyC6beZU\n", "yQyBMcEx7lM=\n");
        str2.getClass();
        this.f66651a = b0Var;
        this.f66652b = i10;
        this.f66653c = str;
        this.f66654d = i11;
        this.f66655e = list;
        this.f66656f = str2;
    }

    public static /* synthetic */ c0 b(c0 c0Var, b0 b0Var, int i10, String str, int i11, List list, String str2, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            b0Var = c0Var.f66651a;
        }
        if ((i12 & 2) != 0) {
            i10 = c0Var.f66652b;
        }
        if ((i12 & 4) != 0) {
            str = c0Var.f66653c;
        }
        if ((i12 & 8) != 0) {
            i11 = c0Var.f66654d;
        }
        if ((i12 & 16) != 0) {
            list = c0Var.f66655e;
        }
        if ((i12 & 32) != 0) {
            str2 = c0Var.f66656f;
        }
        List list2 = list;
        String str3 = str2;
        return c0Var.a(b0Var, i10, str, i11, list2, str3);
    }

    public final c0 a(b0 b0Var, int i10, String str, int i11, List list, String str2) {
        m0.a("kraX+F4=\n", "4t72izvp7us=\n");
        b0Var.getClass();
        m0.a("Li916KZlqfc9Kg==\n", "TVoHmsML3bY=\n");
        str.getClass();
        m0.a("j+K2Qw+ziw==\n", "+4rEJm7H+JQ=\n");
        list.getClass();
        m0.a("NamH4i8R/cEjupLo\n", "UNv1jV1cmLI=\n");
        str2.getClass();
        return new c0(b0Var, i10, str, i11, list, str2);
    }

    public final String c() {
        return this.f66653c;
    }

    public final String d() {
        return this.f66656f;
    }

    public final b0 e() {
        return this.f66651a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c0)) {
            return false;
        }
        c0 c0Var = (c0) obj;
        return this.f66651a == c0Var.f66651a && this.f66652b == c0Var.f66652b && p003kotlin.jvm.internal.v.c(this.f66653c, c0Var.f66653c) && this.f66654d == c0Var.f66654d && p003kotlin.jvm.internal.v.c(this.f66655e, c0Var.f66655e) && p003kotlin.jvm.internal.v.c(this.f66656f, c0Var.f66656f);
    }

    public final int f() {
        return this.f66652b;
    }

    public final int g() {
        return this.f66654d;
    }

    public final List h() {
        return this.f66655e;
    }

    public int hashCode() {
        return (((((((((this.f66651a.hashCode() * 31) + Integer.hashCode(this.f66652b)) * 31) + this.f66653c.hashCode()) * 31) + Integer.hashCode(this.f66654d)) * 31) + this.f66655e.hashCode()) * 31) + this.f66656f.hashCode();
    }

    public String toString() {
        return "VirusScanUiState(phase=" + this.f66651a + ", progress=" + this.f66652b + ", currentApp=" + this.f66653c + ", riskCount=" + this.f66654d + ", threats=" + this.f66655e + ", errorMessage=" + this.f66656f + ")";
    }

    public /* synthetic */ c0(b0 b0Var, int i10, String str, int i11, List list, String str2, int i12, p003kotlin.jvm.internal.m mVar) {
        this((i12 & 1) != 0 ? b0.IDLE : b0Var, (i12 & 2) != 0 ? 0 : i10, (i12 & 4) != 0 ? "" : str, (i12 & 8) != 0 ? 0 : i11, (i12 & 16) != 0 ? gl.w.m() : list, (i12 & 32) != 0 ? "" : str2);
    }
}