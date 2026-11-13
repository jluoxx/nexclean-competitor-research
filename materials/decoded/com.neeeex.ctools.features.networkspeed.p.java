package com.neeeex.ctools.features.networkspeed;

import com.neeeex.eraser.m0;

/* JADX INFO: loaded from: classes7.dex */
public interface p {

    public static final class a implements p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final d f64520a;

        public a(d dVar) {
            "reason" /* decoded XOR */;
            dVar.getClass();
            this.f64520a = dVar;
        }

        public final d a() {
            return this.f64520a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && this.f64520a == ((a) obj).f64520a;
        }

        public int hashCode() {
            return this.f64520a.hashCode();
        }

        public String toString() {
            return "Failure(reason=" + this.f64520a + ")";
        }
    }

    public static final class b implements p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final double f64521a;

        public b(double d10) {
            this.f64521a = d10;
        }

        public final double a() {
            return this.f64521a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof b) && Double.compare(this.f64521a, ((b) obj).f64521a) == 0;
        }

        public int hashCode() {
            return Double.hashCode(this.f64521a);
        }

        public String toString() {
            return "Success(mbps=" + this.f64521a + ")";
        }
    }
}