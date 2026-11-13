package com.neeeex.ctools.features.photocompressor.core;

/* JADX INFO: loaded from: classes7.dex */
public final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f64599a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f64600b;

    public f(int i10, int i11) {
        this.f64599a = i10;
        this.f64600b = i11;
    }

    public final int a() {
        return this.f64600b;
    }

    public final int b() {
        return this.f64599a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        return this.f64599a == fVar.f64599a && this.f64600b == fVar.f64600b;
    }

    public int hashCode() {
        return (Integer.hashCode(this.f64599a) * 31) + Integer.hashCode(this.f64600b);
    }

    public String toString() {
        return "PhotoDimensions(width=" + this.f64599a + ", height=" + this.f64600b + ")";
    }
}