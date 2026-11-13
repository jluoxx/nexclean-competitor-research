package com.neeeex.ctools.features.networkspeed;

import android.os.SystemClock;
import com.neeeex.eraser.m0;
import gq.v0;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.SocketTimeoutException;
import java.net.URL;
import java.net.URLConnection;
import java.util.concurrent.CancellationException;
import kotlinx.coroutines.e2;
import kotlinx.coroutines.f1;
import kotlinx.coroutines.p0;
import p003kotlin.jvm.functions.Function0;
import p003kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes7.dex */
public final class n implements e {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final String f64515b = m0.a("Gjs30gJ/rawBPybHFWvh7x06J8QdJPDmXCwsz14a3ecdOC2dEzz25gFydpJBdbKzQn8=\n", "ck9DonFFgoM=\n");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f64514a = new a(null);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final am.j f64516c = new am.j(200, 299);

    public final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final HttpURLConnection f64517a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ n f64518b;

        public static final /* synthetic */ class a extends p003kotlin.jvm.internal.s implements Function0 {
            public static final a INSTANCE = new a();

            public a() {
                super(0, SystemClock.class, m0.a("5TtOr4v9dKTlNkOrkfV1uOE5QKw=\n", "gFcv3/iYEPY=\n"), m0.a("TIJW5rNHYr1Mj1viqU9joUiAWOXoC0w=\n", "Ke43lsAiBu8=\n"), 0);
            }

            @Override // p003kotlin.jvm.functions.Function0
            public final Long invoke() {
                return Long.valueOf(SystemClock.elapsedRealtimeNanos());
            }
        }

        public b(n nVar, HttpURLConnection httpURLConnection) {
            m0.a("DZR8z5SPNRoBlQ==\n", "bvsSofHsQXM=\n");
            httpURLConnection.getClass();
            this.f64518b = nVar;
            this.f64517a = httpURLConnection;
        }

        public static final fl.m0 d(kl.j jVar) {
            e2.i(jVar);
            return fl.m0.f80959a;
        }

        public final void b() {
            this.f64517a.disconnect();
        }

        public final Object c(long j10, Function1 function1, kl.f fVar) throws IOException {
            am.j jVarA = n.f64514a.a();
            int iK = jVarA.k();
            int iM = jVarA.m();
            int responseCode = this.f64517a.getResponseCode();
            if (iK > responseCode || responseCode > iM) {
                return new p.a(com.neeeex.ctools.features.networkspeed.d.SERVICE_UNAVAILABLE);
            }
            long jElapsedRealtimeNanos = j10 - SystemClock.elapsedRealtimeNanos();
            if (jElapsedRealtimeNanos <= 0) {
                return new p.a(com.neeeex.ctools.features.networkspeed.d.TIMEOUT);
            }
            final kl.j context = fVar.getContext();
            InputStream inputStream = this.f64517a.getInputStream();
            try {
                t tVar = new t(a.INSTANCE, new Function0() { // from class: com.neeeex.ctools.features.networkspeed.o
                    @Override // p003kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return n.b.d(context);
                    }
                });
                inputStream.getClass();
                p pVarD = tVar.d(inputStream, 50000000L, jElapsedRealtimeNanos, function1);
                ql.c.a(inputStream, null);
                return pVarD;
            } catch (Throwable th2) {
                try {
                    throw th2;
                } catch (Throwable th3) {
                    ql.c.a(inputStream, th2);
                    throw th3;
                }
            }
        }
    }

    public static final class c extends ll.m implements tl.n {
        final /* synthetic */ Function1 $onProgress;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(Function1 function1, kl.f<? super c> fVar) {
            super(2, fVar);
            this.$onProgress = function1;
        }

        @Override // ll.a
        public final kl.f<fl.m0> create(Object obj, kl.f<?> fVar) {
            return n.this.new c(this.$onProgress, fVar);
        }

        @Override // tl.n
        public final Object invoke(p0 p0Var, kl.f<? super p> fVar) {
            return ((c) create(p0Var, fVar)).invokeSuspend(fl.m0.f80959a);
        }

        @Override // ll.a
        public final Object invokeSuspend(Object obj) throws Throwable {
            Object objF = p003kotlin.coroutines.intrinsics.c.f();
            int i10 = this.label;
            if (i10 != 0) {
                if (i10 == 1) {
                    fl.v.b(obj);
                    return obj;
                }
                v0.a(m0.a("JftnSEXBaHdh6G5XENhicGb4bkIKx2J3YfNlUgreYnBm7WJQDZVkODT1flAM22I=\n", "RpoLJGW1B1c=\n"));
                return null;
            }
            fl.v.b(obj);
            n nVar = n.this;
            Function1 function1 = this.$onProgress;
            this.label = 1;
            Object objE = nVar.e(function1, this);
            return objE == objF ? objF : objE;
        }
    }

    public static final class d extends ll.d {
        long J$0;
        Object L$0;
        Object L$1;
        int label;
        /* synthetic */ Object result;

        public d(kl.f<? super d> fVar) {
            super(fVar);
        }

        @Override // ll.a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return n.this.e(null, this);
        }
    }

    @Override // com.neeeex.ctools.features.networkspeed.e
    public Object a(Function1 function1, kl.f fVar) {
        return kotlinx.coroutines.i.g(f1.b(), new c(function1, null), fVar);
    }

    /* JADX WARN: Code duplicated, block: B:44:0x009f A[PHI: r10 r11
  0x009f: PHI (r10v15 com.neeeex.ctools.features.networkspeed.n$b) = (r10v13 com.neeeex.ctools.features.networkspeed.n$b), (r10v16 com.neeeex.ctools.features.networkspeed.n$b) binds: [B:43:0x009d, B:47:0x00ac] A[DONT_GENERATE, DONT_INLINE]
  0x009f: PHI (r11v14 com.neeeex.ctools.features.networkspeed.p$a) = (r11v12 com.neeeex.ctools.features.networkspeed.p$a), (r11v15 com.neeeex.ctools.features.networkspeed.p$a) binds: [B:43:0x009d, B:47:0x00ac] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:47:0x00ac  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v3 */
    /* JADX WARN: Type inference failed for: r10v8 */
    public final Object e(Function1 function1, kl.f fVar) throws Throwable {
        d dVar;
        b bVar;
        p.a aVar;
        if (fVar instanceof d) {
            dVar = (d) fVar;
            int i10 = dVar.label;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                dVar.label = i10 - Integer.MIN_VALUE;
            } else {
                dVar = new d(fVar);
            }
        } else {
            dVar = new d(fVar);
        }
        Object objC = dVar.result;
        Object objF = p003kotlin.coroutines.intrinsics.c.f();
        int i11 = dVar.label;
        try {
            if (i11 == 0) {
                fl.v.b(objC);
                long jElapsedRealtimeNanos = SystemClock.elapsedRealtimeNanos() + 10000000000L;
                try {
                    e2.i(dVar.getContext());
                    b bVar2 = new b(this, f());
                    try {
                        dVar.L$0 = ll.l.a(function1);
                        dVar.L$1 = bVar2;
                        dVar.J$0 = jElapsedRealtimeNanos;
                        dVar.label = 1;
                        objC = bVar2.c(jElapsedRealtimeNanos, function1, dVar);
                        if (objC == objF) {
                            return objF;
                        }
                        bVar = bVar2;
                    } catch (SocketTimeoutException unused) {
                        bVar = bVar2;
                        aVar = new p.a(com.neeeex.ctools.features.networkspeed.d.TIMEOUT);
                        if (bVar != null) {
                            bVar.b();
                        }
                        return aVar;
                    } catch (IOException unused2) {
                        bVar = bVar2;
                        aVar = new p.a(com.neeeex.ctools.features.networkspeed.d.GENERIC);
                        if (bVar != null) {
                            bVar.b();
                        }
                        return aVar;
                    } catch (CancellationException e10) {
                        throw e10;
                    } catch (Throwable th2) {
                        th = th2;
                        function1 = bVar2;
                        if (function1 != 0) {
                            function1.b();
                        }
                        throw th;
                    }
                } catch (SocketTimeoutException unused3) {
                    bVar = null;
                } catch (IOException unused4) {
                    bVar = null;
                } catch (CancellationException e11) {
                    throw e11;
                } catch (Throwable th3) {
                    th = th3;
                    function1 = 0;
                }
            } else {
                if (i11 != 1) {
                    v0.a(m0.a("2ncsM7tJo6OeZCUs7lCppJl0JTn0T6mjnn8uKfRWqaSZYSkr8x2v7Mt5NSvyU6k=\n", "uRZAX5s9zIM=\n"));
                    return null;
                }
                bVar = (b) dVar.L$1;
                try {
                    fl.v.b(objC);
                } catch (SocketTimeoutException unused5) {
                    aVar = new p.a(com.neeeex.ctools.features.networkspeed.d.TIMEOUT);
                    if (bVar != null) {
                        bVar.b();
                    }
                    return aVar;
                } catch (IOException unused6) {
                    aVar = new p.a(com.neeeex.ctools.features.networkspeed.d.GENERIC);
                    if (bVar != null) {
                        bVar.b();
                    }
                    return aVar;
                } catch (CancellationException e12) {
                    throw e12;
                }
            }
            p pVar = (p) objC;
            if (bVar != null) {
                bVar.b();
            }
            return pVar;
        } catch (Throwable th4) {
            th = th4;
        }
    }

    public final HttpURLConnection f() throws IOException {
        URLConnection uRLConnectionOpenConnection = new URL(f64515b).openConnection();
        m0.a("j1vhwWdCiZmPQfmNJUTIlIBd+Y0zTsiZjkCgwzJNhNeVV/3IZ0uJgYAA48gzD6CDlV7Y/wtih5mP\nS+7ZLk6G\n", "4S6NrUch6Pc=\n");
        uRLConnectionOpenConnection.getClass();
        HttpURLConnection httpURLConnection = (HttpURLConnection) uRLConnectionOpenConnection;
        httpURLConnection.setRequestMethod(m0.a("cncc\n", "NTJIEXrMykg=\n"));
        httpURLConnection.setConnectTimeout(5000);
        httpURLConnection.setReadTimeout(1000);
        httpURLConnection.setUseCaches(false);
        httpURLConnection.setRequestProperty(m0.a("whGUAm25ntDvBIUFZA==\n", "gXD3agiU3b8=\n"), m0.a("Ih487XfdFvZgUX/hO80K/D4U\n", "THERjha+fpM=\n"));
        return httpURLConnection;
    }

    public static final class a {
        public /* synthetic */ a(p003kotlin.jvm.internal.m mVar) {
            this();
        }

        public final am.j a() {
            return n.f64516c;
        }

        public a() {
        }
    }
}