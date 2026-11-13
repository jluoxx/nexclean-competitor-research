package com.neeeex.ctools.features.network.realtime;

import android.net.TrafficStats;
import p003kotlin.jvm.internal.m;

/* JADX INFO: loaded from: classes7.dex */
public final class a implements c {
    @Override // com.neeeex.ctools.features.network.realtime.c
    public d a(long j10) {
        return C0747a.f64407c.a().a(j10);
    }

    /* JADX INFO: renamed from: com.neeeex.ctools.features.network.realtime.a$a, reason: collision with other inner class name */
    public static final class C0747a {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final C0748a f64407c = new C0748a(null);

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final long f64408a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final long f64409b;

        public C0747a(long j10, long j11) {
            this.f64408a = j10;
            this.f64409b = j11;
        }

        public final d a(long j10) {
            return new d(j10, this.f64408a, this.f64409b);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C0747a)) {
                return false;
            }
            C0747a c0747a = (C0747a) obj;
            return this.f64408a == c0747a.f64408a && this.f64409b == c0747a.f64409b;
        }

        public int hashCode() {
            return (Long.hashCode(this.f64408a) * 31) + Long.hashCode(this.f64409b);
        }

        public String toString() {
            return "SystemCounters(received=" + this.f64408a + ", transmitted=" + this.f64409b + ")";
        }

        /* JADX INFO: renamed from: com.neeeex.ctools.features.network.realtime.a$a$a, reason: collision with other inner class name */
        public static final class C0748a {
            public /* synthetic */ C0748a(m mVar) {
                this();
            }

            public final C0747a a() {
                return new C0747a(TrafficStats.getTotalRxBytes(), TrafficStats.getTotalTxBytes());
            }

            public C0748a() {
            }
        }
    }
}