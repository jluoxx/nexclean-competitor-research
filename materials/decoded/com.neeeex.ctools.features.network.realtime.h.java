package com.neeeex.ctools.features.network.realtime;

import fl.n;
import fl.o;
import fl.q;
import p003kotlin.jvm.functions.Function0;
import p003kotlin.jvm.internal.m;

/* JADX INFO: loaded from: classes7.dex */
public final class h {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final a f64432c = new a(null);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final n f64433d = o.a(q.PUBLICATION, new Function0() { // from class: com.neeeex.ctools.features.network.realtime.g
        @Override // p003kotlin.jvm.functions.Function0
        public final Object invoke() {
            return h.a();
        }
    });

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f64434a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f64435b;

    public h(long j10, long j11) {
        this.f64434a = j10;
        this.f64435b = j11;
    }

    public static h a() {
        return new h(0L, 0L);
    }

    public final long c() {
        return this.f64434a;
    }

    public final long d() {
        return this.f64435b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h)) {
            return false;
        }
        h hVar = (h) obj;
        return this.f64434a == hVar.f64434a && this.f64435b == hVar.f64435b;
    }

    public int hashCode() {
        return (Long.hashCode(this.f64434a) * 31) + Long.hashCode(this.f64435b);
    }

    public String toString() {
        return "TrafficRates(downloadBytesPerSecond=" + this.f64434a + ", uploadBytesPerSecond=" + this.f64435b + ")";
    }

    public static final class a {
        public /* synthetic */ a(m mVar) {
            this();
        }

        public final h a() {
            return (h) h.f64433d.getValue();
        }

        public a() {
        }
    }
}