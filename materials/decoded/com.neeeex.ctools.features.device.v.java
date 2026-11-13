package com.neeeex.ctools.features.device;

/* JADX INFO: loaded from: classes7.dex */
public final class v {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f64331a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f64332b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f64333c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f64334d;

    public v(int i10, int i11, int i12, boolean z10) {
        this.f64331a = i10;
        this.f64332b = i11;
        this.f64333c = i12;
        this.f64334d = z10;
    }

    public final int a() {
        return this.f64333c;
    }

    public final int b() {
        return this.f64332b;
    }

    public final boolean c() {
        return this.f64334d;
    }

    public final int d() {
        return this.f64331a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof v)) {
            return false;
        }
        v vVar = (v) obj;
        return this.f64331a == vVar.f64331a && this.f64332b == vVar.f64332b && this.f64333c == vVar.f64333c && this.f64334d == vVar.f64334d;
    }

    public int hashCode() {
        return (((((Integer.hashCode(this.f64331a) * 31) + Integer.hashCode(this.f64332b)) * 31) + Integer.hashCode(this.f64333c)) * 31) + Boolean.hashCode(this.f64334d);
    }

    public String toString() {
        return "ScreenStatus(widthPixels=" + this.f64331a + ", heightPixels=" + this.f64332b + ", densityDpi=" + this.f64333c + ", supportsMultipleTouch=" + this.f64334d + ")";
    }
}