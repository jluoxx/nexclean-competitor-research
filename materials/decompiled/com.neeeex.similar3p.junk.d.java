package com.neeeex.similar3p.junk;

/* JADX INFO: loaded from: classes7.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f66321a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f66322b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f66323c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f66324d;

    public d(int i10, long j10, int i11, int i12) {
        this.f66321a = i10;
        this.f66322b = j10;
        this.f66323c = i11;
        this.f66324d = i12;
    }

    public static /* synthetic */ d b(d dVar, int i10, long j10, int i11, int i12, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            i10 = dVar.f66321a;
        }
        if ((i13 & 2) != 0) {
            j10 = dVar.f66322b;
        }
        if ((i13 & 4) != 0) {
            i11 = dVar.f66323c;
        }
        if ((i13 & 8) != 0) {
            i12 = dVar.f66324d;
        }
        return dVar.a(i10, j10, i11, i12);
    }

    public final d a(int i10, long j10, int i11, int i12) {
        return new d(i10, j10, i11, i12);
    }

    public final int c() {
        return this.f66323c;
    }

    public final int d() {
        return this.f66324d;
    }

    public final long e() {
        return this.f66322b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return this.f66321a == dVar.f66321a && this.f66322b == dVar.f66322b && this.f66323c == dVar.f66323c && this.f66324d == dVar.f66324d;
    }

    public final int f() {
        return this.f66321a;
    }

    public int hashCode() {
        return (((((Integer.hashCode(this.f66321a) * 31) + Long.hashCode(this.f66322b)) * 31) + Integer.hashCode(this.f66323c)) * 31) + Integer.hashCode(this.f66324d);
    }

    public String toString() {
        return "JunkCleanResult(successCount=" + this.f66321a + ", successBytes=" + this.f66322b + ", failedCount=" + this.f66323c + ", skippedCount=" + this.f66324d + ")";
    }
}