package com.neeeex.ctools.features.recent;

import com.neeeex.eraser.m0;

/* JADX INFO: loaded from: classes7.dex */
public final class k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final gi.c f64844a;

    public k(gi.c cVar) {
        m0.a("lgfRmsw=\n", "5Ga//ak8MJc=\n");
        cVar.getClass();
        this.f64844a = cVar;
    }

    public final gi.c a() {
        return this.f64844a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof k) && this.f64844a == ((k) obj).f64844a;
    }

    public int hashCode() {
        return this.f64844a.hashCode();
    }

    public String toString() {
        return "Query(range=" + this.f64844a + ")";
    }
}