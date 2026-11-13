package com.neeeex.ctools.features.networkspeed;

import com.neeeex.eraser.m0;

/* JADX INFO: loaded from: classes7.dex */
public final class q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final p f64522a;

    public q(p pVar) {
        m0.a("+J3jKxYW\n", "iviQXnpiHck=\n");
        pVar.getClass();
        this.f64522a = pVar;
    }

    public u a() {
        p pVar = this.f64522a;
        if (pVar instanceof p.b) {
            return new u.d(((p.b) pVar).a());
        }
        if (pVar instanceof p.a) {
            return new u.a(((p.a) pVar).a());
        }
        coil.util.j.a();
        return null;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof q) && p003kotlin.jvm.internal.v.c(this.f64522a, ((q) obj).f64522a);
    }

    public int hashCode() {
        return this.f64522a.hashCode();
    }

    public String toString() {
        return "Completed(result=" + this.f64522a + ")";
    }
}