package com.neeeex.ctools.features.network.realtime;

import android.os.SystemClock;
import com.neeeex.eraser.m0;
import gq.v0;
import kotlinx.coroutines.z0;
import p003kotlin.jvm.functions.Function0;
import p003kotlin.jvm.internal.m;
import p003kotlin.jvm.internal.s;
import p003kotlin.jvm.internal.v;
import tl.n;

/* JADX INFO: loaded from: classes7.dex */
public final class b {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final c f64410d = new c(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final com.neeeex.ctools.features.network.realtime.c f64411a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Function0 f64412b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final n f64413c;

    public static final /* synthetic */ class a extends s implements Function0 {
        public static final a INSTANCE = new a();

        public a() {
            super(0, SystemClock.class, m0.a("N41KDH0dzOU3gEcIZxXN+TOPRA8=\n", "UuErfA54qLc=\n"), m0.a("lp1Qm3nFil2WkF2fY82LQZKfXpgiiaQ=\n", "8/Ex6wqg7g8=\n"), 0);
        }

        @Override // p003kotlin.jvm.functions.Function0
        public final Long invoke() {
            return Long.valueOf(SystemClock.elapsedRealtimeNanos());
        }
    }

    public interface d {

        public static final class a implements d {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final com.neeeex.ctools.features.network.realtime.d f64414a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final long f64415b;

            public a(com.neeeex.ctools.features.network.realtime.d dVar) {
                m0.a("X7bmc8pxxq4=\n", "L8SDBaMes90=\n");
                dVar.getClass();
                this.f64414a = dVar;
                this.f64415b = 3000L;
            }

            @Override // com.neeeex.ctools.features.network.realtime.b.d
            public com.neeeex.ctools.features.network.realtime.d a() {
                return this.f64414a;
            }

            @Override // com.neeeex.ctools.features.network.realtime.b.d
            public long b() {
                return this.f64415b;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof a) && v.c(this.f64414a, ((a) obj).f64414a);
            }

            public int hashCode() {
                return this.f64414a.hashCode();
            }

            public String toString() {
                return "Sampling(previous=" + this.f64414a + ")";
            }
        }

        /* JADX INFO: renamed from: com.neeeex.ctools.features.network.realtime.b$d$b, reason: collision with other inner class name */
        public static final class C0750b implements d {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final com.neeeex.ctools.features.network.realtime.d f64416a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final long f64417b;

            public C0750b(com.neeeex.ctools.features.network.realtime.d dVar) {
                m0.a("mKfaj5OP9+k=\n", "6NW/+frggpo=\n");
                dVar.getClass();
                this.f64416a = dVar;
                this.f64417b = 1000L;
            }

            @Override // com.neeeex.ctools.features.network.realtime.b.d
            public com.neeeex.ctools.features.network.realtime.d a() {
                return this.f64416a;
            }

            @Override // com.neeeex.ctools.features.network.realtime.b.d
            public long b() {
                return this.f64417b;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof C0750b) && v.c(this.f64416a, ((C0750b) obj).f64416a);
            }

            public int hashCode() {
                return this.f64416a.hashCode();
            }

            public String toString() {
                return "WarmingUp(previous=" + this.f64416a + ")";
            }
        }

        com.neeeex.ctools.features.network.realtime.d a();

        long b();
    }

    public static final class e extends ll.d {
        Object L$0;
        Object L$1;
        int label;
        /* synthetic */ Object result;

        public e(kl.f<? super e> fVar) {
            super(fVar);
        }

        @Override // ll.a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return b.this.a(null, this);
        }
    }

    public b(com.neeeex.ctools.features.network.realtime.c cVar, Function0 function0, n nVar) {
        m0.a("Vk2QdHSy\n", "JCjxEBHAV8k=\n");
        cVar.getClass();
        m0.a("PcoJobXdjcM=\n", "U6V+79Sz4rA=\n");
        function0.getClass();
        m0.a("CxtDpHIa1qQZAl6DVRjUhhk=\n", "fHoq0DR1pOo=\n");
        nVar.getClass();
        this.f64411a = cVar;
        this.f64412b = function0;
        this.f64413c = nVar;
    }

    /* JADX WARN: Code duplicated, block: B:17:0x0072 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:16:0x0070 -> B:18:0x0073). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:0:?
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public final java.lang.Object a(p003kotlin.jvm.functions.Function1 r8, kl.f r9) {
        /*
            r7 = this;
            boolean r0 = r9 instanceof com.neeeex.ctools.features.network.realtime.b.e
            if (r0 == 0) goto L13
            r0 = r9
            com.neeeex.ctools.features.network.realtime.b$e r0 = (com.neeeex.ctools.features.network.realtime.b.e) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            com.neeeex.ctools.features.network.realtime.b$e r0 = new com.neeeex.ctools.features.network.realtime.b$e
            r0.<init>(r9)
        L18:
            java.lang.Object r9 = r0.result
            java.lang.Object r1 = p003kotlin.coroutines.intrinsics.c.f()
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L3f
            if (r2 != r3) goto L32
            java.lang.Object r8 = r0.L$1
            com.neeeex.ctools.features.network.realtime.b$d r8 = (com.neeeex.ctools.features.network.realtime.b.d) r8
            java.lang.Object r2 = r0.L$0
            kotlin.jvm.functions.Function1 r2 = (p003kotlin.jvm.functions.Function1) r2
            fl.v.b(r9)
            r9 = r2
            goto L73
        L32:
            java.lang.String r8 = "kNZoYw5udoTUxWF8W3d8g9PVYWlBaHyE1N5qeUFxfIPTwG17Rjp6y4HYcXtHdHw=\n"
            java.lang.String r9 = "87cEDy4aGaQ=\n"
            java.lang.String r8 = com.neeeex.eraser.m0.a(r8, r9)
            gq.v0.a(r8)
            r8 = 0
            return r8
        L3f:
            fl.v.b(r9)
            com.neeeex.ctools.features.network.realtime.b$d$b r9 = new com.neeeex.ctools.features.network.realtime.b$d$b
            com.neeeex.ctools.features.network.realtime.c r2 = r7.f64411a
            kotlin.jvm.functions.Function0 r4 = r7.f64412b
            java.lang.Object r4 = r4.invoke()
            java.lang.Number r4 = (java.lang.Number) r4
            long r4 = r4.longValue()
            com.neeeex.ctools.features.network.realtime.d r2 = r2.a(r4)
            r9.<init>(r2)
            r6 = r9
            r9 = r8
            r8 = r6
        L5c:
            tl.n r2 = r7.f64413c
            long r4 = r8.b()
            java.lang.Long r4 = ll.b.e(r4)
            r0.L$0 = r9
            r0.L$1 = r8
            r0.label = r3
            java.lang.Object r2 = r2.invoke(r4, r0)
            if (r2 != r1) goto L73
            return r1
        L73:
            kl.j r2 = r0.getContext()
            kotlinx.coroutines.e2.i(r2)
            com.neeeex.ctools.features.network.realtime.c r2 = r7.f64411a
            kotlin.jvm.functions.Function0 r4 = r7.f64412b
            java.lang.Object r4 = r4.invoke()
            java.lang.Number r4 = (java.lang.Number) r4
            long r4 = r4.longValue()
            com.neeeex.ctools.features.network.realtime.d r2 = r2.a(r4)
            com.neeeex.ctools.features.network.realtime.e r4 = com.neeeex.ctools.features.network.realtime.e.f64421a
            com.neeeex.ctools.features.network.realtime.d r8 = r8.a()
            com.neeeex.ctools.features.network.realtime.h r8 = r4.a(r8, r2)
            r9.invoke(r8)
            com.neeeex.ctools.features.network.realtime.b$d$a r8 = new com.neeeex.ctools.features.network.realtime.b$d$a
            r8.<init>(r2)
            goto L5c
        */
        throw new UnsupportedOperationException("Method not decompiled: com.neeeex.ctools.features.network.realtime.b.a(kotlin.jvm.functions.Function1, kl.f):java.lang.Object");
    }

    public static final class c {
        public /* synthetic */ c(m mVar) {
            this();
        }

        public c() {
        }
    }

    /* JADX INFO: renamed from: com.neeeex.ctools.features.network.realtime.b$b, reason: collision with other inner class name */
    public static final class C0749b extends ll.m implements n {
        /* synthetic */ long J$0;
        int label;

        public C0749b(kl.f<? super C0749b> fVar) {
            super(2, fVar);
        }

        @Override // ll.a
        public final kl.f<fl.m0> create(Object obj, kl.f<?> fVar) {
            C0749b c0749b = new C0749b(fVar);
            c0749b.J$0 = ((Number) obj).longValue();
            return c0749b;
        }

        public final Object invoke(long j10, kl.f<? super fl.m0> fVar) {
            return ((C0749b) create(Long.valueOf(j10), fVar)).invokeSuspend(fl.m0.f80959a);
        }

        @Override // ll.a
        public final Object invokeSuspend(Object obj) {
            long j10 = this.J$0;
            Object objF = p003kotlin.coroutines.intrinsics.c.f();
            int i10 = this.label;
            if (i10 == 0) {
                fl.v.b(obj);
                this.J$0 = j10;
                this.label = 1;
                if (z0.b(j10, this) == objF) {
                    return objF;
                }
            } else {
                if (i10 != 1) {
                    v0.a(m0.a("r57z/gGgniXrjfrhVLmUIuyd+vROppQl65bx5E6/lCLsiPbmSfSSar6Q6uZIupQ=\n", "zP+fkiHU8QU=\n"));
                    return null;
                }
                fl.v.b(obj);
            }
            return fl.m0.f80959a;
        }

        @Override // tl.n
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            return invoke(((Number) obj).longValue(), (kl.f<? super fl.m0>) obj2);
        }
    }

    public /* synthetic */ b(com.neeeex.ctools.features.network.realtime.c cVar, Function0 function0, n nVar, int i10, m mVar) {
        this((i10 & 1) != 0 ? new com.neeeex.ctools.features.network.realtime.a() : cVar, (i10 & 2) != 0 ? a.INSTANCE : function0, (i10 & 4) != 0 ? new C0749b(null) : nVar);
    }
}