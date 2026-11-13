package com.neeeex.similar3p;

/* JADX INFO: loaded from: classes7.dex */
public final class p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f66534a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f66535b;

    public p(int i10, long j10) {
        this.f66534a = i10;
        this.f66535b = j10;
    }

    public final long a() {
        return this.f66535b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p)) {
            return false;
        }
        p pVar = (p) obj;
        return this.f66534a == pVar.f66534a && this.f66535b == pVar.f66535b;
    }

    public int hashCode() {
        return (Integer.hashCode(this.f66534a) * 31) + Long.hashCode(this.f66535b);
    }

    public String toString() {
        return "Active(count=" + this.f66534a + ", bytes=" + this.f66535b + ")";
    }
}