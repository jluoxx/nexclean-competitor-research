package com.neeeex.eraser.ads;

import android.app.Activity;
import com.neeeex.eraser.m0;
import p003kotlin.jvm.internal.v;

/* JADX INFO: loaded from: classes7.dex */
public final class k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f64947a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final jj.a f64948b;

    public static final class a implements mj.a {
        @Override // mj.a
        public void a(kj.h hVar, kj.d dVar, kj.b bVar) {
        }

        @Override // mj.a
        public void b() {
        }

        @Override // mj.a
        public void c(kj.h hVar, kj.d dVar, kj.b bVar) {
        }
    }

    public static final class b implements mj.c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public oj.a f64949a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Activity f64950b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ o f64951c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ String f64952d;

        public b(Activity activity, o oVar, String str) {
            this.f64950b = activity;
            this.f64951c = oVar;
            this.f64952d = str;
        }

        @Override // mj.c
        public void a(kj.d dVar, double d10) {
            i.f64940a.g(dVar, d10);
        }

        @Override // mj.c
        public void d(kj.d dVar, kj.b bVar) {
            o oVar = this.f64951c;
            if (oVar != null) {
                oVar.onAdShowFailed(this.f64949a);
            }
        }

        @Override // mj.c
        public void e(kj.d dVar) {
            e.L = false;
            o oVar = this.f64951c;
            if (oVar != null) {
                oVar.onAdShowSuccess(this.f64949a);
            }
            mi.a.f88870a.r0(this.f64952d, j.f64946a.a(dVar != null ? dVar.d() : 0.0d));
            e.b0().u0();
        }

        @Override // mj.c
        public void f(kj.d dVar) {
            e.b0().v0(this.f64950b);
            o oVar = this.f64951c;
            if (oVar != null) {
                oVar.onAdClick();
            }
            i.f64940a.f(dVar);
            mi.a.f88870a.p0(this.f64952d);
        }

        @Override // mj.c
        public void g(kj.d dVar, int i10) {
        }

        @Override // mj.c
        public void h(kj.d dVar) {
            e.L = true;
            o oVar = this.f64951c;
            if (oVar != null) {
                oVar.onAdClose();
            }
            e.b0().t0();
        }

        public final void i(oj.a aVar) {
            this.f64949a = aVar;
        }
    }

    public k(String str) {
        m0.a("sQe8OIOVBPS1Irk=\n", "wWvdW+b4YZo=\n");
        str.getClass();
        this.f64947a = str;
        this.f64948b = new jj.a(str);
    }

    public final void a(String str) {
        m0.a("Ns8mvG1K9ysPxA==\n", "RqBV1RkjmEU=\n");
        str.getClass();
        if (d(str)) {
            mi.a.f88870a.q0(str);
        } else {
            mi.a.f88870a.a0(str);
        }
    }

    public final boolean b() {
        return this.f64948b.a();
    }

    public final double c() {
        kj.d dVarB = this.f64948b.b();
        if (dVarB != null) {
            return dVarB.d();
        }
        return -0.1d;
    }

    public final boolean d(String str) {
        m0.a("dwOpxZFNtsBOCA==\n", "B2zarOUk2a4=\n");
        str.getClass();
        return v.c(str, m0.a("Wilngj+bctFUKmo=\n", "FXkizGDIIp0=\n")) || v.c(str, m0.a("bPl5bBgKYD5v4np+Ew==\n", "P647LVtBP20=\n")) || v.c(str, m0.a("/e07YlE8x/Ln6yBlSCbU//LxJw==\n", "s6JvKxd1hLM=\n")) || v.c(str, m0.a("mSNYwqFuxFODJUPFuGXGQIg/XMemdM8=\n", "12wMi+cnhxI=\n"));
    }

    public final boolean e() {
        kj.d dVarB = this.f64948b.b();
        return dVarB != null && dVarB.b() == 3;
    }

    public final void f(boolean z10) {
        this.f64948b.c(z10, new a());
    }

    public final void g(Activity activity, String str, o oVar) {
        m0.a("6yP9tIC1UEo=\n", "ikCJ3fbcJDM=\n");
        activity.getClass();
        m0.a("uszbdGkrmBaDxw==\n", "yqOoHR1C93g=\n");
        str.getClass();
        if (!ti.b.c(activity)) {
            if (oVar != null) {
                oVar.onAdShowFailed(null);
            }
        } else if (this.f64948b.b() != null) {
            e.b0().A0(activity, false);
            b bVar = new b(activity, oVar, str);
            bVar.i(this.f64948b.d(activity, str, bVar));
        } else if (oVar != null) {
            oVar.onAdShowFailed(null);
        }
    }
}