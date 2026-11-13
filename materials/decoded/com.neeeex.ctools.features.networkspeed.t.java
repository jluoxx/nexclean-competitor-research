package com.neeeex.ctools.features.networkspeed;

import com.mbridge.msdk.playercommon.exoplayer2.C;
import com.neeeex.eraser.m0;
import gl.g0;
import java.io.IOException;
import java.io.InputStream;
import p003kotlin.jvm.functions.Function0;
import p003kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes7.dex */
public final class t {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final a f64525c = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Function0 f64526a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Function0 f64527b;

    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final long f64528a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final long f64529b;

        public b(long j10, long j11) {
            this.f64528a = j10;
            this.f64529b = j11;
        }

        public final long a() {
            return this.f64528a;
        }

        public final long b() {
            return this.f64529b;
        }

        public final boolean c() {
            return this.f64528a > 0 && this.f64529b > 0;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return this.f64528a == bVar.f64528a && this.f64529b == bVar.f64529b;
        }

        public int hashCode() {
            return (Long.hashCode(this.f64528a) * 31) + Long.hashCode(this.f64529b);
        }

        public String toString() {
            return "TransferBudget(maxBytes=" + this.f64528a + ", maxDurationNanos=" + this.f64529b + ")";
        }
    }

    public final class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final InputStream f64530a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final b f64531b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final d f64532c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final Function1 f64533d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final byte[] f64534e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final /* synthetic */ t f64535f;

        public c(t tVar, InputStream inputStream, b bVar, d dVar, Function1 function1) {
            "input" /* decoded XOR */;
            inputStream.getClass();
            "budget" /* decoded XOR */;
            bVar.getClass();
            "state" /* decoded XOR */;
            dVar.getClass();
            "progress" /* decoded XOR */;
            function1.getClass();
            this.f64535f = tVar;
            this.f64530a = inputStream;
            this.f64531b = bVar;
            this.f64532c = dVar;
            this.f64533d = function1;
            this.f64534e = new byte[32768];
        }

        public final p a() {
            Double dA;
            if (this.f64532c.c() >= 65536 && (dA = com.neeeex.ctools.features.networkspeed.a.f64490a.a(this.f64532c.c(), this.f64532c.b())) != null) {
                return new p.b(dA.doubleValue());
            }
            return this.f64535f.c();
        }

        public final void b() throws IOException {
            while (true) {
                boolean z10 = true;
                while (z10) {
                    this.f64535f.f64527b.invoke();
                    int i10 = this.f64530a.read(this.f64534e, 0, (int) Math.min(this.f64534e.length, this.f64531b.a() - this.f64532c.c()));
                    boolean z11 = i10 > 0;
                    if (z11) {
                        this.f64532c.a(i10);
                        Double d10 = this.f64532c.d();
                        if (d10 != null) {
                            this.f64533d.invoke(d10);
                        }
                        if (this.f64532c.c() >= this.f64531b.a() || this.f64532c.b() >= this.f64531b.b()) {
                            z10 = false;
                        }
                    } else {
                        z10 = z11;
                    }
                }
                return;
            }
        }
    }

    public static final class d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Function0 f64536a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final gl.n f64537b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public long f64538c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public long f64539d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public Long f64540e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public Long f64541f;

        public d(Function0 function0) {
            "clock" /* decoded XOR */;
            function0.getClass();
            this.f64536a = function0;
            this.f64537b = new gl.n();
        }

        public final void a(int i10) {
            long jLongValue;
            this.f64538c += (long) i10;
            long jLongValue2 = ((Number) this.f64536a.invoke()).longValue();
            Long l10 = this.f64540e;
            if (l10 != null) {
                jLongValue = l10.longValue();
            } else {
                this.f64540e = Long.valueOf(jLongValue2);
                jLongValue = jLongValue2;
            }
            long j10 = jLongValue2 - jLongValue;
            this.f64539d = j10;
            this.f64537b.addLast(new b0(this.f64538c, j10));
            while (this.f64537b.size() > 2 && this.f64539d - ((b0) this.f64537b.first()).a() > C.NANOS_PER_SECOND) {
                this.f64537b.removeFirst();
            }
        }

        public final long b() {
            return this.f64539d;
        }

        public final long c() {
            return this.f64538c;
        }

        public final Double d() {
            Double dB;
            Long l10 = this.f64541f;
            long j10 = this.f64539d;
            if (j10 <= 0 || ((l10 != null && j10 - l10.longValue() < 250000000) || (dB = com.neeeex.ctools.features.networkspeed.a.f64490a.b(g0.f1(this.f64537b), C.NANOS_PER_SECOND)) == null)) {
                return null;
            }
            this.f64541f = Long.valueOf(this.f64539d);
            return dB;
        }
    }

    public t(Function0 function0, Function0 function1) {
        "nowNanos" /* decoded XOR */;
        function0.getClass();
        "checkActive" /* decoded XOR */;
        function1.getClass();
        this.f64526a = function0;
        this.f64527b = function1;
    }

    public final p.a c() {
        return new p.a(com.neeeex.ctools.features.networkspeed.d.INSUFFICIENT_DATA);
    }

    public final p d(InputStream inputStream, long j10, long j11, Function1 function1) throws IOException {
        "input" /* decoded XOR */;
        inputStream.getClass();
        "onProgress" /* decoded XOR */;
        function1.getClass();
        b bVar = new b(j10, j11);
        if (!bVar.c()) {
            return c();
        }
        c cVar = new c(this, inputStream, bVar, new d(this.f64526a), function1);
        cVar.b();
        return cVar.a();
    }

    public static final class a {
        public /* synthetic */ a(p003kotlin.jvm.internal.m mVar) {
            this();
        }

        public a() {
        }
    }
}