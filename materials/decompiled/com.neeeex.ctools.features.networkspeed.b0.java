package com.neeeex.ctools.features.networkspeed;

/* JADX INFO: loaded from: classes7.dex */
public final class b0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f64497a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f64498b;

    public b0(long j10, long j11) {
        this.f64497a = j10;
        this.f64498b = j11;
    }

    public final long a() {
        return this.f64498b;
    }

    public final long b() {
        return this.f64497a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b0)) {
            return false;
        }
        b0 b0Var = (b0) obj;
        return this.f64497a == b0Var.f64497a && this.f64498b == b0Var.f64498b;
    }

    public int hashCode() {
        return (Long.hashCode(this.f64497a) * 31) + Long.hashCode(this.f64498b);
    }

    public String toString() {
        return "TransferSample(totalBytes=" + this.f64497a + ", elapsedNanos=" + this.f64498b + ")";
    }
}