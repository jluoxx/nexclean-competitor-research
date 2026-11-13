package com.neeeex.ctools.features.device;

import com.android.systemui.shared.system.QuickStepContract;

/* JADX INFO: loaded from: classes7.dex */
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final e f64282a = new e();

    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final long f64285a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final long f64286b;

        public b(long j10, long j11) {
            this.f64285a = j10;
            this.f64286b = j11;
        }

        public final int a() {
            long j10 = this.f64286b;
            if (j10 <= 0) {
                return 0;
            }
            return (int) ((am.q.r(this.f64285a, 0L, j10) / this.f64286b) * ((double) 100));
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return this.f64285a == bVar.f64285a && this.f64286b == bVar.f64286b;
        }

        public int hashCode() {
            return (Long.hashCode(this.f64285a) * 31) + Long.hashCode(this.f64286b);
        }

        public String toString() {
            return "Ratio(numerator=" + this.f64285a + ", denominator=" + this.f64286b + ")";
        }
    }

    public final com.neeeex.ctools.features.device.a a(long j10, int i10) {
        a aVarA = a.f64283b.a(j10);
        return new com.neeeex.ctools.features.device.a(aVarA != null ? Integer.valueOf(aVarA.b()) : null, aVarA != null ? aVarA.a(i10) : null);
    }

    public final int b(long j10, long j11) {
        return new b(j10, j11).a();
    }

    public static final class a {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final C0738a f64283b = new C0738a(null);

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f64284a;

        public a(int i10) {
            this.f64284a = i10;
        }

        public final Integer a(int i10) {
            if (1 > i10 || i10 >= 101) {
                return null;
            }
            return Integer.valueOf((int) am.q.l((((long) this.f64284a) * ((long) 100)) / ((long) i10), 2147483647L));
        }

        public final int b() {
            return this.f64284a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && this.f64284a == ((a) obj).f64284a;
        }

        public int hashCode() {
            return Integer.hashCode(this.f64284a);
        }

        public String toString() {
            return "MilliAmpHours(value=" + this.f64284a + ")";
        }

        /* JADX INFO: renamed from: com.neeeex.ctools.features.device.e$a$a, reason: collision with other inner class name */
        public static final class C0738a {
            public /* synthetic */ C0738a(p003kotlin.jvm.internal.m mVar) {
                this();
            }

            public final a a(long j10) {
                if (j10 <= 0) {
                    return null;
                }
                long j11 = j10 / 1000;
                if (1 > j11 || j11 >= QuickStepContract.SYSUI_STATE_STATUS_BAR_KEYGUARD_GOING_AWAY) {
                    return null;
                }
                return new a((int) j11);
            }

            public C0738a() {
            }
        }
    }
}