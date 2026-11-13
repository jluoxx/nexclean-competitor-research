package com.neeeex.ctools.features.network.realtime;

/* JADX INFO: loaded from: classes7.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f64418a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f64419b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f64420c;

    public d(long j10, long j11, long j12) {
        this.f64418a = j10;
        this.f64419b = j11;
        this.f64420c = j12;
    }

    public final long a() {
        return this.f64419b;
    }

    public final long b() {
        return this.f64418a;
    }

    public final long c() {
        return this.f64420c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return this.f64418a == dVar.f64418a && this.f64419b == dVar.f64419b && this.f64420c == dVar.f64420c;
    }

    public int hashCode() {
        return (((Long.hashCode(this.f64418a) * 31) + Long.hashCode(this.f64419b)) * 31) + Long.hashCode(this.f64420c);
    }

    public String toString() {
        return "TrafficCounterSnapshot(timestampNanos=" + this.f64418a + ", receivedBytes=" + this.f64419b + ", transmittedBytes=" + this.f64420c + ")";
    }
}