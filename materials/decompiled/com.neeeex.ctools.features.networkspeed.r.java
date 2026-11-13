package com.neeeex.ctools.features.networkspeed;

/* JADX INFO: loaded from: classes7.dex */
public final class r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final double f64523a;

    public r(double d10) {
        this.f64523a = d10;
    }

    public u.e a() {
        return new u.e(this.f64523a);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof r) && Double.compare(this.f64523a, ((r) obj).f64523a) == 0;
    }

    public int hashCode() {
        return Double.hashCode(this.f64523a);
    }

    public String toString() {
        return "Progress(mbps=" + this.f64523a + ")";
    }
}