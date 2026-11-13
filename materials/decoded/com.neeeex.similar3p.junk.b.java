package com.neeeex.similar3p.junk;

/* JADX INFO: loaded from: classes7.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f66307a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f66308b;

    public /* synthetic */ b(int i10, long j10, int i11, p003kotlin.jvm.internal.m mVar) {
        this((i11 & 1) != 0 ? 0 : i10, (i11 & 2) != 0 ? 0L : j10);
    }

    public final long a() {
        return this.f66308b;
    }

    public final int b() {
        return this.f66307a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return this.f66307a == bVar.f66307a && this.f66308b == bVar.f66308b;
    }

    public int hashCode() {
        return (Integer.hashCode(this.f66307a) * 31) + Long.hashCode(this.f66308b);
    }

    public String toString() {
        return "JunkCategoryTotal(count=" + this.f66307a + ", bytes=" + this.f66308b + ")";
    }

    public b(int i10, long j10) {
        this.f66307a = i10;
        this.f66308b = j10;
    }
}