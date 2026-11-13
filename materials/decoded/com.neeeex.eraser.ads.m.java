package com.neeeex.eraser.ads;

import android.app.Activity;
import com.neeeex.eraser.m0;
import p003kotlin.jvm.internal.v;

/* JADX INFO: loaded from: classes7.dex */
public final class m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f64964a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final jj.c f64965b;

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
        public oj.a f64966a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Activity f64967b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ o f64968c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ m f64969d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final /* synthetic */ String f64970e;

        public b(Activity activity, o oVar, m mVar, String str) {
            this.f64967b = activity;
            this.f64968c = oVar;
            this.f64969d = mVar;
            this.f64970e = str;
        }

        @Override // mj.c
        public void a(kj.d dVar, double d10) {
            i.f64940a.g(dVar, d10);
        }

        @Override // mj.c
        public void d(kj.d dVar, kj.b bVar) {
            o oVar = this.f64968c;
            if (oVar != null) {
                oVar.onAdShowFailed(this.f64966a);
            }
        }

        @Override // mj.c
        public void e(kj.d dVar) {
            e.L = false;
            o oVar = this.f64968c;
            if (oVar != null) {
                oVar.onAdShowSuccess(this.f64966a);
            }
            if (this.f64969d.d(this.f64970e)) {
                mi.a.f88870a.r0(this.f64970e, j.f64946a.a(dVar != null ? dVar.d() : 0.0d));
            } else {
                mi.a.f88870a.b0(this.f64970e, j.f64946a.a(dVar != null ? dVar.d() : 0.0d));
            }
            e.b0().s0();
        }

        @Override // mj.c
        public void f(kj.d dVar) {
            e.b0().v0(this.f64967b);
            o oVar = this.f64968c;
            if (oVar != null) {
                oVar.onAdClick();
            }
            i.f64940a.f(dVar);
            if (this.f64969d.d(this.f64970e)) {
                mi.a.f88870a.p0(this.f64970e);
            } else {
                mi.a.f88870a.Z(this.f64970e);
            }
        }

        @Override // mj.c
        public void g(kj.d dVar, int i10) {
        }

        @Override // mj.c
        public void h(kj.d dVar) {
            e.L = true;
            o oVar = this.f64968c;
            if (oVar != null) {
                oVar.onAdClose();
            }
            e.b0().r0();
        }

        public final void i(oj.a aVar) {
            this.f64966a = aVar;
        }
    }

    public m(String str) {
        "placementId" /* decoded XOR */;
        str.getClass();
        this.f64964a = str;
        this.f64965b = new jj.c(str);
    }

    public final void a(String str) {
        "positionId" /* decoded XOR */;
        str.getClass();
        if (d(str)) {
            mi.a.f88870a.q0(str);
        } else {
            mi.a.f88870a.a0(str);
        }
    }

    public final boolean b() {
        return this.f64965b.a();
    }

    public final double c() {
        kj.d dVarB = this.f64965b.b();
        if (dVarB != null) {
            return dVarB.d();
        }
        return -0.1d;
    }

    public final boolean d(String str) {
        "positionId" /* decoded XOR */;
        str.getClass();
        return v.c(str, "OPEN_SPLASH" /* decoded XOR */) || v.c(str, "SWBACK_SPLASH" /* decoded XOR */) || v.c(str, "NOTIFICATION_SPLASH" /* decoded XOR */) || v.c(str, "NOTIFICATION_BAR_SPLASH" /* decoded XOR */);
    }

    public final void e(boolean z10) {
        this.f64965b.c(z10, new a());
    }

    public final void f(Activity activity, String str, o oVar) {
        "activity" /* decoded XOR */;
        activity.getClass();
        "positionId" /* decoded XOR */;
        str.getClass();
        if (!ti.b.c(activity)) {
            if (oVar != null) {
                oVar.onAdShowFailed(null);
            }
        } else if (this.f64965b.b() != null) {
            e.b0().A0(activity, com.neeeex.eraser.ads.b.f64887a.a(str, activity.isFinishing()));
            b bVar = new b(activity, oVar, this, str);
            bVar.i(this.f64965b.d(activity, str, bVar));
        } else if (oVar != null) {
            oVar.onAdShowFailed(null);
        }
    }
}