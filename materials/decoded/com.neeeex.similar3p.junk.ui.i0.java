package com.neeeex.similar3p.junk.ui;

/* JADX INFO: loaded from: classes7.dex */
public final class i0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f66448a;

    public i0(long j10) {
        this.f66448a = j10;
    }

    public final long a() {
        return this.f66448a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof i0) && this.f66448a == ((i0) obj).f66448a;
    }

    public int hashCode() {
        return Long.hashCode(this.f66448a);
    }

    public String toString() {
        return "Bytes(value=" + this.f66448a + ")";
    }
}