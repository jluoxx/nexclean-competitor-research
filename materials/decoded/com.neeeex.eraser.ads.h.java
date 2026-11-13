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
    public static final String f64927e = "neeeex_pid_native" /* decoded XOR */;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final String f64928f = "neeeex_pid_app_open" /* decoded XOR */;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final String f64929g = "neeeex_pid_inter_open" /* decoded XOR */;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final String f64930h = "neeeex_pid_inter" /* decoded XOR */;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final String f64931i = "neeeex_pid_banner" /* decoded XOR */;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final String f64932j = "neeeex_pid_app_open_pre" /* decoded XOR */;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final String f64933k = "neeeex_pid_app_open_inner" /* decoded XOR */;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final h f64923a = new h();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final com.neeeex.eraser.ads.a f64924b = new com.neeeex.eraser.ads.a();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final AtomicBoolean f64925c = new AtomicBoolean(false);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final AtomicBoolean f64926d = new AtomicBoolean(false);

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final n f64934l = new n("neeeex_pid_native" /* decoded XOR */);

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final m f64935m = new m("neeeex_pid_inter" /* decoded XOR */);

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final k f64936n = new k("neeeex_pid_app_open" /* decoded XOR */);

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final m f64937o = new m("neeeex_pid_inter_open" /* decoded XOR */);

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final l f64938p = new l("neeeex_pid_banner" /* decoded XOR */);

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final k f64939q = new k("neeeex_pid_app_open_pre" /* decoded XOR */);

    public static final /* synthetic */ class a extends s implements Function0 {
        public a(Object obj) {
            super(0, obj, h.class, "isInit" /* decoded XOR */, "isInit()Z" /* decoded XOR */, 0);
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
        "context" /* decoded XOR */;
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
                v0.a("call to 'resume' before 'invoke' with coroutine" /* decoded XOR */);
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
        Object systemService = context.getSystemService("window" /* decoded XOR */);
        "null cannot be cast to non-null type android.view.WindowManager" /* decoded XOR */;
        systemService.getClass();
        DisplayMetrics displayMetrics = new DisplayMetrics();
        ((WindowManager) systemService).getDefaultDisplay().getMetrics(displayMetrics);
        return (int) (displayMetrics.widthPixels / displayMetrics.density);
    }

    public final synchronized void k(Context context) {
        "context" /* decoded XOR */;
        context.getClass();
        if (l()) {
            return;
        }
        kj.a.C1088a c1088a = new kj.a.C1088a(f64927e, 1, 3, w.p(new kj.e("ca-app-pub-4012007661729983/8941636696" /* decoded XOR */, 1, false, false), new kj.e("n1hiqh0ji7drit" /* decoded XOR */, 3, false, false), new kj.e("n1hiqh0jimi8k1" /* decoded XOR */, 3, false, true), new kj.e("27734A780F884B95B41ED3B319B46A12" /* decoded XOR */, 30, false, false)));
        kj.a.C1088a c1088a2 = new kj.a.C1088a(f64931i, 1, 1, w.p(new kj.e("ca-app-pub-4012007661729983/2442697012" /* decoded XOR */, 1, false, false, j(context) - 44), new kj.e("n1hiqh0jghplrr" /* decoded XOR */, 3, false, false, j(context) - 44), new kj.e("n1hiqh0jguvi1q" /* decoded XOR */, 3, false, true, j(context) - 44), new kj.e("4E6AB3A107F9CE836AC840CBD64B7812" /* decoded XOR */, 30, false, false, j(context) - 44)));
        kj.a.C1088a c1088a3 = new kj.a.C1088a(f64930h, 1, 2, w.p(new kj.e("ca-app-pub-4012007661729983/6928736930" /* decoded XOR */, 1, false, false), new kj.e("n1hiqh0jhan3fe" /* decoded XOR */, 3, false, false), new kj.e("n1hiqh0jhpu8mo" /* decoded XOR */, 3, false, true), new kj.e("0DEA787984800DDA519A087D8C5EB212" /* decoded XOR */, 30, false, false)));
        kj.a.C1088a c1088a4 = new kj.a.C1088a(f64928f, 1, 5, w.p(new kj.e("ca-app-pub-4012007661729983/4083081745" /* decoded XOR */, 1, false, false), new kj.e("n1hiqh0jfvpu6e" /* decoded XOR */, 3, false, false), new kj.e("02442D896AF56F8295DD4F035564F712" /* decoded XOR */, 30, false, false)));
        kj.a.C1088a c1088a5 = new kj.a.C1088a(f64929g, 1, 2, w.p(new kj.e("ca-app-pub-4012007661729983/6928736930" /* decoded XOR */, 1, false, false), new kj.e("n1hiqh0jhan3fe" /* decoded XOR */, 3, false, false), new kj.e("0DEA787984800DDA519A087D8C5EB212" /* decoded XOR */, 30, false, false)));
        kj.a.C1088a c1088a6 = new kj.a.C1088a(f64932j, 1, 5, w.p(new kj.e("ca-app-pub-4012007661729983/4083081745" /* decoded XOR */, 1, false, false), new kj.e("n1hiqh0jfvpu6e" /* decoded XOR */, 3, false, false), new kj.e("02442D896AF56F8295DD4F035564F712" /* decoded XOR */, 30, false, false)));
        kj.a aVar = new kj.a();
        aVar.b(w.p(c1088a, c1088a4, c1088a5, c1088a3, c1088a6, c1088a2));
        ij.a.i("ca-app-pub-4012007661729983~8578478497" /* decoded XOR */);
        ij.a.q("h6a7d80ec4d0ae" /* decoded XOR */, "ab42a9661c6b5e5bcde39ec4f1b7a0888" /* decoded XOR */, "localStrategy" /* decoded XOR */);
        ij.a.m("n1hiqh0jkf2vd3" /* decoded XOR */, "n1hiqh0jjfptab" /* decoded XOR */, "n1hiqh0jjva2tc" /* decoded XOR */, "n1hiqh0jj3gdh6" /* decoded XOR */, "");
        ij.a.o("n1hiqh0jm8jmkr" /* decoded XOR */, "n1hiqh0jlelu2h" /* decoded XOR */, "n1hiqh0jlro4k2" /* decoded XOR */, "n1hiqh0jkuhl75" /* decoded XOR */, "");
        ij.a.n("n1hiqh0jou5k5s" /* decoded XOR */, "n1hiqh0jnqac8n" /* decoded XOR */, "n1hiqh0johqf9l" /* decoded XOR */, "n1hiqh0jmkmf0j" /* decoded XOR */, "");
        ij.a.p("n1hiqh0jqgp1id" /* decoded XOR */, "n1hiqh0jpoq227" /* decoded XOR */, "n1hiqh0jq4g41j" /* decoded XOR */, "n1hiqh0jpcftp9" /* decoded XOR */, "");
        ij.a.r("6D8944EC23F05194F28DE7A7646A5411" /* decoded XOR */);
        ij.a.j(Boolean.TRUE);
        Context applicationContext = context.getApplicationContext();
        "null cannot be cast to non-null type android.app.Application" /* decoded XOR */;
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
                v0.a("call to 'resume' before 'invoke' with coroutine" /* decoded XOR */);
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
                v0.a("call to 'resume' before 'invoke' with coroutine" /* decoded XOR */);
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