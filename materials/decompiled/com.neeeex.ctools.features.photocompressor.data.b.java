package com.neeeex.ctools.features.photocompressor.data;

import com.neeeex.eraser.m0;
import java.util.List;
import p003kotlin.jvm.internal.v;

/* JADX INFO: loaded from: classes7.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f64611a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f64612b;

    public b(List list, List list2) {
        m0.a("B7jD0Zpun9kV\n", "ZtSvgfIB67Y=\n");
        list.getClass();
        m0.a("yrI964PlLhDMuQ==\n", "qd1Qm/GAXWM=\n");
        list2.getClass();
        this.f64611a = list;
        this.f64612b = list2;
    }

    public final List a(boolean z10) {
        return new List[]{this.f64611a, this.f64612b}[Boolean.compare(z10, false)];
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return v.c(this.f64611a, bVar.f64611a) && v.c(this.f64612b, bVar.f64612b);
    }

    public int hashCode() {
        return (this.f64611a.hashCode() * 31) + this.f64612b.hashCode();
    }

    public String toString() {
        return "PhotoMediaCatalog(allPhotos=" + this.f64611a + ", compressed=" + this.f64612b + ")";
    }
}