package com.neeeex.ctools.features.device;

/* JADX INFO: loaded from: classes7.dex */
public final class u {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f64328a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f64329b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f64330c;

    public u(long j10, long j11, int i10) {
        this.f64328a = j10;
        this.f64329b = j11;
        this.f64330c = i10;
    }

    public final int a() {
        return this.f64330c;
    }

    public final long b() {
        return this.f64329b;
    }

    public final long c() {
        return this.f64328a;
    }

    public final boolean d() {
        return this.f64329b > 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof u)) {
            return false;
        }
        u uVar = (u) obj;
        return this.f64328a == uVar.f64328a && this.f64329b == uVar.f64329b && this.f64330c == uVar.f64330c;
    }

    public int hashCode() {
        return (((Long.hashCode(this.f64328a) * 31) + Long.hashCode(this.f64329b)) * 31) + Integer.hashCode(this.f64330c);
    }

    public String toString() {
        return "DeviceUsageMetric(usedBytes=" + this.f64328a + ", totalBytes=" + this.f64329b + ", percent=" + this.f64330c + ")";
    }
}