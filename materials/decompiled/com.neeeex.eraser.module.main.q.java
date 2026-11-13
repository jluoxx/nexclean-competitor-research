package com.neeeex.eraser.module.main;

/* JADX INFO: loaded from: classes7.dex */
public final class q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f65375a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f65376b;

    public q(String str, String str2) {
        com.neeeex.eraser.m0.a("Q1NPWNaugAxJUVM=\n", "KDY2FLfA53k=\n");
        str.getClass();
        com.neeeex.eraser.m0.a("nWh49GI6r7CGaHL0\n", "8wkVkS5bwdc=\n");
        str2.getClass();
        this.f65375a = str;
        this.f65376b = str2;
    }

    public final String a() {
        return this.f65375a;
    }

    public final String b() {
        return this.f65376b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof q)) {
            return false;
        }
        q qVar = (q) obj;
        return p003kotlin.jvm.internal.v.c(this.f65375a, qVar.f65375a) && p003kotlin.jvm.internal.v.c(this.f65376b, qVar.f65376b);
    }

    public int hashCode() {
        return (this.f65375a.hashCode() * 31) + this.f65376b.hashCode();
    }

    public String toString() {
        return "Language(keyLanguage=" + this.f65375a + ", nameLanguage=" + this.f65376b + ")";
    }
}