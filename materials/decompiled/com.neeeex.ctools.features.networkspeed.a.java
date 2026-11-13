package com.neeeex.ctools.features.networkspeed;

import com.neeeex.eraser.m0;
import gl.g0;
import java.util.List;

/* JADX INFO: loaded from: classes7.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f64490a = new a();

    /* JADX INFO: renamed from: com.neeeex.ctools.features.networkspeed.a$a, reason: collision with other inner class name */
    public static final class C0751a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final long f64491a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final long f64492b;

        public C0751a(long j10, long j11) {
            this.f64491a = j10;
            this.f64492b = j11;
        }

        public final boolean a() {
            return this.f64491a > 0 && this.f64492b > 0;
        }

        public final double b() {
            return (((this.f64491a * 8.0d) * 1.0E9d) / this.f64492b) / 1000000.0d;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C0751a)) {
                return false;
            }
            C0751a c0751a = (C0751a) obj;
            return this.f64491a == c0751a.f64491a && this.f64492b == c0751a.f64492b;
        }

        public int hashCode() {
            return (Long.hashCode(this.f64491a) * 31) + Long.hashCode(this.f64492b);
        }

        public String toString() {
            return "TransferInterval(bytes=" + this.f64491a + ", nanos=" + this.f64492b + ")";
        }
    }

    public final Double a(long j10, long j11) {
        C0751a c0751a = new C0751a(j10, j11);
        if (!c0751a.a()) {
            c0751a = null;
        }
        if (c0751a != null) {
            return Double.valueOf(c0751a.b());
        }
        return null;
    }

    public final Double b(List list, long j10) {
        b0 b0Var;
        m0.a("XgHJ3q0tRg==\n", "LWCkrsFINUE=\n");
        list.getClass();
        if (list.size() < 2 || j10 <= 0) {
            return null;
        }
        b0 b0Var2 = (b0) g0.A0(list);
        b0 b0Var3 = (b0) g0.p0(list);
        int iO = gl.w.o(list);
        do {
            iO--;
            if (-1 < iO) {
                b0Var = (b0) list.get(iO);
            }
            return a(b0Var2.b() - b0Var3.b(), b0Var2.a() - b0Var3.a());
        } while (b0Var2.a() - b0Var.a() < j10);
        b0Var3 = b0Var;
        return a(b0Var2.b() - b0Var3.b(), b0Var2.a() - b0Var3.a());
    }
}