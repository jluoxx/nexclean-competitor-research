package com.neeeex.ctools.features.network.realtime;

import am.q;
import coil.util.j;
import com.neeeex.eraser.m0;
import fl.t;
import fl.z;
import p003kotlin.jvm.internal.v;

/* JADX INFO: loaded from: classes7.dex */
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final e f64421a = new e();

    public enum a {
        RECEIVED,
        TRANSMITTED;


        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ ml.a f64423b = ml.b.a(d());

        public static ml.a getEntries() {
            return f64423b;
        }
    }

    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final d f64424a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final d f64425b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final long f64426c;

        public static final /* synthetic */ class a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final /* synthetic */ int[] f64427a;

            static {
                int[] iArr = new int[a.values().length];
                try {
                    iArr[a.RECEIVED.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[a.TRANSMITTED.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                f64427a = iArr;
            }
        }

        public b(d dVar, d dVar2) {
            m0.a("WPYR663UHhs=\n", "KIR0ncS7a2g=\n");
            dVar.getClass();
            m0.a("bf+hf+oZig==\n", "DorTDY93/hs=\n");
            dVar2.getClass();
            this.f64424a = dVar;
            this.f64425b = dVar2;
            this.f64426c = dVar2.b() - dVar.b();
        }

        public final boolean a() {
            return this.f64426c > 0;
        }

        public final long b(a aVar) {
            t tVarA;
            m0.a("Z9QWW5eosBxt\n", "A71kPvTc2XM=\n");
            aVar.getClass();
            int i10 = a.f64427a[aVar.ordinal()];
            if (i10 == 1) {
                tVarA = z.a(Long.valueOf(this.f64424a.a()), Long.valueOf(this.f64425b.a()));
            } else {
                if (i10 != 2) {
                    j.a();
                    return 0L;
                }
                tVarA = z.a(Long.valueOf(this.f64424a.c()), Long.valueOf(this.f64425b.c()));
            }
            long jLongValue = ((Number) tVarA.component1()).longValue();
            long jLongValue2 = ((Number) tVarA.component2()).longValue();
            if (jLongValue < 0 || jLongValue2 < jLongValue) {
                return 0L;
            }
            return (long) q.n(((jLongValue2 - jLongValue) / this.f64426c) * 1.0E9d, 0.0d, 9.223372036854776E18d);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return v.c(this.f64424a, bVar.f64424a) && v.c(this.f64425b, bVar.f64425b);
        }

        public int hashCode() {
            return (this.f64424a.hashCode() * 31) + this.f64425b.hashCode();
        }

        public String toString() {
            return "SampleWindow(previous=" + this.f64424a + ", current=" + this.f64425b + ")";
        }
    }

    public final h a(d dVar, d dVar2) {
        m0.a("Seno5Bb6bEk=\n", "OZuNkn+VGTo=\n");
        dVar.getClass();
        m0.a("tYllbOoueQ==\n", "1vwXHo9ADcM=\n");
        dVar2.getClass();
        b bVar = new b(dVar, dVar2);
        return !bVar.a() ? h.f64432c.a() : new h(bVar.b(a.RECEIVED), bVar.b(a.TRANSMITTED));
    }
}