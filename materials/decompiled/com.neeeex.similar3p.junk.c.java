package com.neeeex.similar3p.junk;

import com.neeeex.eraser.m0;

/* JADX INFO: loaded from: classes7.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f66316a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f66317b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f66318c;

    public c(int i10, int i11, String str) {
        m0.a("+vLB8DfZo23489s=\n", "mYezglK31z0=\n");
        str.getClass();
        this.f66316a = i10;
        this.f66317b = i11;
        this.f66318c = str;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return this.f66316a == cVar.f66316a && this.f66317b == cVar.f66317b && p003kotlin.jvm.internal.v.c(this.f66318c, cVar.f66318c);
    }

    public int hashCode() {
        return (((Integer.hashCode(this.f66316a) * 31) + Integer.hashCode(this.f66317b)) * 31) + this.f66318c.hashCode();
    }

    public String toString() {
        return "JunkCleanProgress(completed=" + this.f66316a + ", total=" + this.f66317b + ", currentPath=" + this.f66318c + ")";
    }
}