package com.neeeex.eraser.ads;

import android.app.Application;
import android.content.Context;
import android.util.DisplayMetrics;
import android.view.WindowManager;
import com.neeeex.eraser.m0;
import fl.v;
import gl.w;
import gq.v0;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlinx.coroutines.z0;
import p003kotlin.jvm.functions.Function0;
import p003kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes7.dex */
public final class h {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final String f64927e = m0.a("283x9DAbM1nczMv/NBcFX9A=\n", "taiUkVVjbCk=\n");

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final String f64928f = m0.a("BnpW3c6jljMBe2zZ26uWLBh6XQ==\n", "aB8zuKvbyUM=\n");

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final String f64929g = m0.a("Vd03XuWV3q5S3A1S7pnkrGTXIl7u\n", "O7hSO4Dtgd4=\n");

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final String f64930h = m0.a("ZAd2+iyNMS1jBkz2J4ELLw==\n", "CmITn0n1bl0=\n");

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final String f64931i = m0.a("Y7YonneZfnNktxKZc49PZn8=\n", "DdNN+xLhIQM=\n");

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final String f64932j = m0.a("/d2I7ClA9uT63LLoPEj2++Pdg9Y8Ssw=\n", "k7jtiUw4qZQ=\n");

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final String f64933k = m0.a("phRV1EqCaeWhFW/QX4pp+rgUXu5GlFjwug==\n", "yHEwsS/6NpU=\n");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final h f64923a = new h();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final com.neeeex.eraser.ads.a f64924b = new com.neeeex.eraser.ads.a();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final AtomicBoolean f64925c = new AtomicBoolean(false);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final AtomicBoolean f64926d = new AtomicBoolean(false);

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final n f64934l = new n(m0.a("bKTPgUChImVrpfWKRK0UY2c=\n", "AsGq5CXZfRU=\n"));

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final m f64935m = new m(m0.a("GhmygOpNlIIdGIiM4UGugA==\n", "dHzX5Y81y/I=\n"));

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final k f64936n = new k(m0.a("7TzzB3TzVv/qPckDYftW4PM8+A==\n", "g1mWYhGLCY8=\n"));

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final m f64937o = new m(m0.a("EFDjLi6GG+UXUdkiJYoh5yFa9i4l\n", "fjWGS0v+RJU=\n"));

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final l f64938p = new l(m0.a("yig5rk0PBOPNKQOpSRk19tY=\n", "pE1cyyh3W5M=\n"));

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final k f64939q = new k(m0.a("3/XppIR5uJ/Y9NOgkXG4gMH14p6Rc4I=\n", "sZCMweEB5+8=\n"));

    public static final /* synthetic */ class a extends s implements Function0 {
        public a(Object obj) {
            super(0, obj, h.class, m0.a("cWUfwYw1\n", "GBZWr+VBNTk=\n"), m0.a("GDMJt8DnkUkr\n", "cUBA2amTuWA=\n"), 0);
        }

        @Override // p003kotlin.jvm.functions.Function0
        public final Boolean invoke() {
            return Boolean.valueOf(((h) this.receiver).l());
        }
    }

    public static final class b extends ll.d {
        Object L$0;
        boolean Z$0;
        int label;
        /* synthetic */ Object result;

        public b(kl.f<? super b> fVar) {
            super(fVar);
        }

        @Override // ll.a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return h.this.d(null, this);
        }
    }

    public static final class c extends ll.d {
        Object L$0;
        boolean Z$0;
        boolean Z$1;
        int label;
        /* synthetic */ Object result;

        public c(kl.f<? super c> fVar) {
            super(fVar);
        }

        @Override // ll.a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return h.this.m(null, this);
        }
    }

    public static final class d extends ll.d {
        int label;
        /* synthetic */ Object result;

        public d(kl.f<? super d> fVar) {
            super(fVar);
        }

        @Override // ll.a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return h.this.n(this);
        }
    }

    public static fl.m0 a(Context context) {
        f64923a.k(context);
        return fl.m0.f80959a;
    }

    public final void b(final Context context) {
        f64924b.a(new a(this), new Function0() { // from class: com.neeeex.eraser.ads.g
            @Override // p003kotlin.jvm.functions.Function0
            public final Object invoke() {
                return h.a(context);
            }
        });
    }

    public final void c(Context context) {
        m0.a("3zFutfjBeg==\n", "vF4AwZ25DpI=\n");
        context.getClass();
        b(context);
        if (f64925c.get() || !f64926d.compareAndSet(false, true)) {
            return;
        }
        try {
            o();
        } catch (Throwable th2) {
            f64926d.set(false);
            throw th2;
        }
    }

    /* JADX WARN: Code duplicated, block: B:32:0x0075  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object d(Context context, kl.f fVar) throws Throwable {
        b bVar;
        Throwable th2;
        boolean z10;
        if (fVar instanceof b) {
            bVar = (b) fVar;
            int i10 = bVar.label;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                bVar.label = i10 - Integer.MIN_VALUE;
            } else {
                bVar = new b(fVar);
            }
        } else {
            bVar = new b(fVar);
        }
        Object obj = bVar.result;
        Object objF = p003kotlin.coroutines.intrinsics.c.f();
        int i11 = bVar.label;
        if (i11 != 0) {
            if (i11 != 1) {
                v0.a(m0.a("hVtfrEGgEvzBSFazFLkY+8ZYVqYOphj8wVNdtg6/GPvGTVq0CfQes5RVRrQIuhg=\n", "5jozwGHUfdw=\n"));
                return null;
            }
            z10 = bVar.Z$0;
            try {
                v.b(obj);
                return fl.m0.f80959a;
            } catch (Throwable th3) {
                th2 = th3;
                f64925c.set(false);
                if (z10) {
                    f64926d.set(false);
                }
                throw th2;
            }
        }
        v.b(obj);
        b(context);
        if (!f64925c.compareAndSet(false, true)) {
            return fl.m0.f80959a;
        }
        boolean zCompareAndSet = f64926d.compareAndSet(false, true);
        try {
            bVar.L$0 = ll.l.a(context);
            bVar.Z$0 = zCompareAndSet;
            bVar.label = 1;
            if (n(bVar) == objF) {
                return objF;
            }
            return fl.m0.f80959a;
        } catch (Throwable th4) {
            th2 = th4;
            z10 = zCompareAndSet;
            f64925c.set(false);
            if (z10) {
                f64926d.set(false);
            }
            throw th2;
        }
    }

    public final k e() {
        return f64936n;
    }

    public final l f() {
        return f64938p;
    }

    public final m g() {
        return f64935m;
    }

    public final m h() {
        return f64937o;
    }

    public final n i() {
        return f64934l;
    }

    public final int j(Context context) {
        Object systemService = context.getSystemService(m0.a("Smi71Wms\n", "PQHVsQbbQiI=\n"));
        m0.a("nqgS8LuZcwWesgq8+Z8yCJGuCrzvlTIFn7NT8u6WfkuEpA75u5t8D4KyF/i1jHsOh/Mp9fWefRy9\nvBD9/J9g\n", "8N1+nJv6Ems=\n");
        systemService.getClass();
        DisplayMetrics displayMetrics = new DisplayMetrics();
        ((WindowManager) systemService).getDefaultDisplay().getMetrics(displayMetrics);
        return (int) (displayMetrics.widthPixels / displayMetrics.density);
    }

    public final synchronized void k(Context context) {
        m0.a("Eb2I372dlg==\n", "ctLmq9jl4qQ=\n");
        context.getClass();
        if (l()) {
            return;
        }
        kj.a.C1088a c1088a = new kj.a.C1088a(f64927e, 1, 3, w.p(new kj.e(m0.a("+3NNO14RWCDtcE1uHlBHYKglVmwfVkdpoSpTdRZYQWGuIVZsF1c=\n", "mBJgWi5hdVA=\n"), 1, false, false), new kj.e(m0.a("KsHrim0bmfYtx+eRdQc=\n", "RPCD4xxzqZw=\n"), 3, false, false), new kj.e(m0.a("7gIUvtBkAxPpXhXvyj0=\n", "gDN816EMM3k=\n"), 3, false, true), new kj.e(m0.a("iYFQnmAGTJqL8F+VYAVCl/mCVugQdDmRio8lmWIGSpA=\n", "u7ZnrVRHe6I=\n"), 30, false, false)));
        kj.a.C1088a c1088a2 = new kj.a.C1088a(f64931i, 1, 1, w.p(new kj.e(m0.a("xJcSs7XcLAHSlBLm9Z0zQZfBCeT0mzNIns4M/feYNUORzwji9J4=\n", "p/Y/0sWsAXE=\n"), 1, false, false, j(context) - 44), new kj.e(m0.a("goebxWF9ouSL3oPAYmc=\n", "7LbzrBAVko4=\n"), 3, false, false, j(context) - 44), new kj.e(m0.a("t7vQobdnAre+/86h934=\n", "2Yq4yMYPMt0=\n"), 3, false, true, j(context) - 44), new kj.e(m0.a("vybDuj/dUnG7VLPCPqsrc70itsNJ3lACz1XBuUrWInI=\n", "i2P1+33uE0A=\n"), 30, false, false, j(context) - 44)));
        kj.a.C1088a c1088a3 = new kj.a.C1088a(f64930h, 1, 2, w.p(new kj.e(m0.a("ZwC/x6Lj0U1xA7+S4qLODTRWpJDjpM4EPVmhieSqzgUzUqSf4aM=\n", "BGGSptKT/D0=\n"), 1, false, false), new kj.e(m0.a("mKn/NLBmqaGe+flup2s=\n", "9piXXcEOmcs=\n"), 3, false, false), new kj.e(m0.a("ZN14kwcxkQFinGXCGzY=\n", "CuwQ+nZZoWs=\n"), 3, false, true), new kj.e(m0.a("+lmOOm7nfMHyKfNLaZsPuf8s8jpp53y88l7+Phvteso=\n", "yh3Le1nfS/g=\n"), 30, false, false)));
        kj.a.C1088a c1088a4 = new kj.a.C1088a(f64928f, 1, 5, w.p(new kj.e(m0.a("w6sYEg4yyVzVqBhHTnPWHJD9A0VPddYVmfIGXEpy3B+Q8gRESnc=\n", "oMo1c35C5Cw=\n"), 1, false, false), new kj.e(m0.a("ZUsUAx+zS6RtDAwfWL4=\n", "C3p8am7be84=\n"), 3, false, false), new kj.e(m0.a("/m6G0tfFGD74HfTT08cYNfdp9qLRxxA0+2mE0qO2ETU=\n", "zlyy5uWBIAc=\n"), 30, false, false)));
        kj.a.C1088a c1088a5 = new kj.a.C1088a(f64929g, 1, 2, w.p(new kj.e(m0.a("5J9vuT15U73ynG/sfThM/bfJdO58Pkz0vsZx93swTPWwzXThfjk=\n", "h/5C2E0Jfs0=\n"), 1, false, false), new kj.e(m0.a("w8IA3VRhEQbFkgaHQ2w=\n", "rfNotCUJIWw=\n"), 3, false, false), new kj.e(m0.a("E597AwTSo+0b7wZyA67QlRbqBwMD0qOQG5gLB3HYpeY=\n", "I9s+QjPqlNQ=\n"), 30, false, false)));
        kj.a.C1088a c1088a6 = new kj.a.C1088a(f64932j, 1, 5, w.p(new kj.e(m0.a("iNfZ8hf8WLee1NmnV71H99uBwqVWu0f+0o7HvFO8TfTbjsWkU7k=\n", "67b0k2eMdcc=\n"), 1, false, false), new kj.e(m0.a("YYVTjDqUp49pwkuQfZk=\n", "D7Q75Uv8l+U=\n"), 3, false, false), new kj.e(m0.a("Na1JB1qKqboz3jsGXoipsTyqOXdciKGwMKpLBy75oLE=\n", "BZ99M2jOkYM=\n"), 30, false, false)));
        kj.a aVar = new kj.a();
        aVar.b(w.p(c1088a, c1088a4, c1088a5, c1088a3, c1088a6, c1088a2));
        ij.a.i(m0.a("GeYgSwE9ccoP5SAeQXxuikqwOxxAem6DQ78+VEl4a4JOsDUeSHo=\n", "eocNKnFNXLo=\n"));
        ij.a.q(m0.a("7k9Y8c+ip+jlTV32yv8=\n", "hnk5xqual40=\n"), m0.a("cHfSZGaSeQcgdtA0Ms56U3Jxg2U+ziwFdySEYWabdwkp\n", "ERXmVgerTzE=\n"), m0.a("pIyX4Hjka5+pl5HmbQ==\n", "yOP0gRS3H+0=\n"));
        ij.a.m(m0.a("mJoX1xY/aD6dzU3IA2Q=\n", "9qt/vmdXWFQ=\n"), m0.a("vFqFI2Y/I8W4DZ0+djU=\n", "0mvtShdXE68=\n"), m0.a("1vtCjzHzt/bSvEvUNPg=\n", "uMoq5kCbh5w=\n"), m0.a("uWzO79SdRZG9bsHizcM=\n", "112mhqX1dfs=\n"), "");
        ij.a.o(m0.a("7UPc4tG8f6PuSt7my6Y=\n", "g3K0i6DUT8k=\n"), m0.a("0uk2Jp780UrQvTI63fw=\n", "vNheT++U4SA=\n"), m0.a("nbSAsKEfB62f94ftu0U=\n", "84Xo2dB3N8c=\n"), m0.a("jQQ/rY4JcGiIQD+oyFQ=\n", "4zVXxP9hQAI=\n"), "");
        ij.a.n(m0.a("KBOdQKtrDpIpV8BC73A=\n", "RiL1KdoDPvg=\n"), m0.a("SeWcw5tk6c9JpZXJ0mI=\n", "J9T0quoM2aU=\n"), m0.a("tzfe4PllqYe2bsfvsWE=\n", "2Qa2iYgNme0=\n"), m0.a("/ulqM/pcQhX9s288u14=\n", "kNgCWos0cn8=\n"), "");
        ij.a.p(m0.a("v5LUvk1DCFagxMzmVU8=\n", "0aO81zwrODw=\n"), m0.a("cGJRZY1IC/FuPEg+zhc=\n", "HlM5DPwgO5s=\n"), m0.a("g1n+AqDs6t6cXPFf4O4=\n", "7WiWa9GE2rQ=\n"), m0.a("1jTM+r4xcxrIZsLnv2A=\n", "uAWkk89ZQ3A=\n"), "");
        ij.a.r(m0.a("1K1jjEn5AiDQ2h2FSPx+V6TbY/E4+gZU1N1t9Ej5dlI=\n", "4ulbtX3NR2M=\n"));
        ij.a.j(Boolean.TRUE);
        Context applicationContext = context.getApplicationContext();
        m0.a("HW/EntyOvDUdddzSnoj9OBJp3NKIgv01HHSFnImBsXsHY9iX3IyzPwF1wZbSjK0rXVvYgpCEvjoH\nc8ec\n", "cxqo8vzt3Vs=\n");
        applicationContext.getClass();
        ij.a.e((Application) applicationContext, aVar);
    }

    public final boolean l() {
        return ij.a.a();
    }

    /* JADX WARN: Code duplicated, block: B:28:0x006f  */
    /* JADX WARN: Code duplicated, block: B:30:0x0076  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object m(Context context, kl.f fVar) throws Throwable {
        c cVar;
        boolean z10;
        Throwable th2;
        boolean z11;
        if (fVar instanceof c) {
            cVar = (c) fVar;
            int i10 = cVar.label;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                cVar.label = i10 - Integer.MIN_VALUE;
            } else {
                cVar = new c(fVar);
            }
        } else {
            cVar = new c(fVar);
        }
        Object obj = cVar.result;
        Object objF = p003kotlin.coroutines.intrinsics.c.f();
        int i11 = cVar.label;
        if (i11 != 0) {
            if (i11 != 1) {
                v0.a(m0.a("NeiblnI93a9x+5KJJyTXqHbrkpw9O9evceCZjD0i16h2/p6OOmnR4CTmgo47J9c=\n", "Von3+lJJso8=\n"));
                return null;
            }
            z11 = cVar.Z$1;
            z10 = cVar.Z$0;
            try {
                v.b(obj);
                return fl.m0.f80959a;
            } catch (Throwable th3) {
                th2 = th3;
                if (!z10) {
                    f64925c.set(false);
                }
                if (!z11) {
                    f64926d.set(false);
                }
                throw th2;
            }
        }
        v.b(obj);
        b(context);
        boolean andSet = f64925c.getAndSet(true);
        boolean andSet2 = f64926d.getAndSet(true);
        try {
            cVar.L$0 = ll.l.a(context);
            cVar.Z$0 = andSet;
            cVar.Z$1 = andSet2;
            cVar.label = 1;
            if (n(cVar) == objF) {
                return objF;
            }
            return fl.m0.f80959a;
        } catch (Throwable th4) {
            z10 = andSet;
            th2 = th4;
            z11 = andSet2;
            if (!z10) {
                f64925c.set(false);
            }
            if (!z11) {
                f64926d.set(false);
            }
            throw th2;
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0068, code lost:
    
        if (kotlinx.coroutines.z0.b(800, r0) == r1) goto L21;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object n(kl.f fVar) {
        d dVar;
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
        Object obj = dVar.result;
        Object objF = p003kotlin.coroutines.intrinsics.c.f();
        int i11 = dVar.label;
        if (i11 == 0) {
            v.b(obj);
            f64937o.e(false);
            f64936n.f(true);
            dVar.label = 1;
            if (z0.b(200L, dVar) != objF) {
            }
            return objF;
        }
        if (i11 == 1) {
            v.b(obj);
        } else {
            if (i11 != 2) {
                v0.a(m0.a("4JVvavyLNEukhmZ1qZI+TKOWZmCzjT5LpJ1tcLOUPkyjg2pytN84BPGbdnK1kT4=\n", "g/QDBtz/W2s=\n"));
                return null;
            }
            v.b(obj);
        }
        f64935m.e(true);
        return fl.m0.f80959a;
        f64934l.e(true);
        f64938p.e(true);
        dVar.label = 2;
    }

    public final void o() {
        f64936n.f(true);
        f64934l.e(true);
        f64935m.e(true);
        f64938p.e(true);
    }
}