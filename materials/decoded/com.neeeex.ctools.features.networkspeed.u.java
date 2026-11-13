package com.neeeex.ctools.features.networkspeed;

import com.neeeex.eraser.m0;

/* JADX INFO: loaded from: classes7.dex */
public interface u {

    public static final class a implements u {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final com.neeeex.ctools.features.networkspeed.d f64542a;

        public a(com.neeeex.ctools.features.networkspeed.d dVar) {
            "reason" /* decoded XOR */;
            dVar.getClass();
            this.f64542a = dVar;
        }

        public final com.neeeex.ctools.features.networkspeed.d a() {
            return this.f64542a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && this.f64542a == ((a) obj).f64542a;
        }

        public int hashCode() {
            return this.f64542a.hashCode();
        }

        public String toString() {
            return "Failure(reason=" + this.f64542a + ")";
        }
    }

    public static final class b implements u {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final b f64543a = new b();

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof b);
        }

        public int hashCode() {
            return -982359519;
        }

        public String toString() {
            return "Idle" /* decoded XOR */;
        }
    }

    public static final class c implements u {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final c f64544a = new c();

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof c);
        }

        public int hashCode() {
            return -1488959017;
        }

        public String toString() {
            return "Preparing" /* decoded XOR */;
        }
    }

    public static final class d implements u {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final double f64545a;

        public d(double d10) {
            this.f64545a = d10;
        }

        public final double a() {
            return this.f64545a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof d) && Double.compare(this.f64545a, ((d) obj).f64545a) == 0;
        }

        public int hashCode() {
            return Double.hashCode(this.f64545a);
        }

        public String toString() {
            return "Success(finalMbps=" + this.f64545a + ")";
        }
    }

    public static final class e implements u {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final double f64546a;

        public e(double d10) {
            this.f64546a = d10;
        }

        public final double a() {
            return this.f64546a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof e) && Double.compare(this.f64546a, ((e) obj).f64546a) == 0;
        }

        public int hashCode() {
            return Double.hashCode(this.f64546a);
        }

        public String toString() {
            return "Testing(liveMbps=" + this.f64546a + ")";
        }
    }
}