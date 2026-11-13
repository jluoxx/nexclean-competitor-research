package com.neeeex.eraser.ads;

import android.app.Activity;
import android.view.ViewGroup;
import com.neeeex.eraser.m0;
import p003kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes7.dex */
public final class l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f64953a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final jj.b f64954b;

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

    public static final class b implements mj.b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public oj.a f64955a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Activity f64956b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ o f64957c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ String f64958d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final /* synthetic */ l f64959e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final /* synthetic */ ViewGroup f64960f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final /* synthetic */ oj.a f64961g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final /* synthetic */ boolean f64962h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public final /* synthetic */ Function0 f64963i;

        public b(Activity activity, o oVar, String str, l lVar, ViewGroup viewGroup, oj.a aVar, boolean z10, Function0 function0) {
            this.f64956b = activity;
            this.f64957c = oVar;
            this.f64958d = str;
            this.f64959e = lVar;
            this.f64960f = viewGroup;
            this.f64961g = aVar;
            this.f64962h = z10;
            this.f64963i = function0;
        }

        @Override // mj.c
        public void a(kj.d dVar, double d10) {
            i.f64940a.g(dVar, d10);
        }

        @Override // mj.b
        public void b() {
            if (this.f64956b.isFinishing() || this.f64959e.c().b() == null) {
                return;
            }
            this.f64959e.h(this.f64956b, this.f64960f, this.f64958d, this.f64961g, this.f64957c, this.f64962h, this.f64963i);
        }

        @Override // mj.b
        public void c(kj.d dVar) {
        }

        @Override // mj.c
        public void d(kj.d dVar, kj.b bVar) {
            o oVar = this.f64957c;
            if (oVar != null) {
                oVar.onAdShowFailed(this.f64955a);
            }
        }

        @Override // mj.c
        public void e(kj.d dVar) {
            o oVar = this.f64957c;
            if (oVar != null) {
                oVar.onAdShowSuccess(this.f64955a);
            }
            mi.a.f88870a.e0(this.f64958d, j.f64946a.a(dVar != null ? dVar.d() : 0.0d));
        }

        @Override // mj.c
        public void f(kj.d dVar) {
            e.b0().v0(this.f64956b);
            o oVar = this.f64957c;
            if (oVar != null) {
                oVar.onAdClick();
            }
            i.f64940a.f(dVar);
            mi.a.f88870a.c0(this.f64958d);
        }

        @Override // mj.c
        public void g(kj.d dVar, int i10) {
        }

        @Override // mj.c
        public void h(kj.d dVar) {
            o oVar = this.f64957c;
            if (oVar != null) {
                oVar.onAdClick();
            }
        }

        public final void i(oj.a aVar) {
            this.f64955a = aVar;
        }
    }

    public l(String str) {
        "placementId" /* decoded XOR */;
        str.getClass();
        this.f64953a = str;
        this.f64954b = new jj.b(str);
    }

    public static /* synthetic */ void i(l lVar, Activity activity, ViewGroup viewGroup, String str, oj.a aVar, o oVar, boolean z10, Function0 function0, int i10, Object obj) {
        if ((i10 & 32) != 0) {
            z10 = false;
        }
        lVar.h(activity, viewGroup, str, aVar, oVar, z10, (i10 & 64) != 0 ? null : function0);
    }

    public final void b(String str) {
        "positionId" /* decoded XOR */;
        str.getClass();
        mi.a.f88870a.d0(str);
    }

    public final jj.b c() {
        return this.f64954b;
    }

    public final double d() {
        kj.d dVarB = this.f64954b.b();
        if (dVarB != null) {
            return dVarB.d();
        }
        return -0.1d;
    }

    public final void e(boolean z10) {
        this.f64954b.c(z10, new a());
    }

    public final void f(Activity activity, ViewGroup viewGroup, String str, oj.a aVar, o oVar) {
        "activity" /* decoded XOR */;
        activity.getClass();
        "containerView" /* decoded XOR */;
        viewGroup.getClass();
        "positionId" /* decoded XOR */;
        str.getClass();
        if (ti.b.c(activity)) {
            i(this, activity, viewGroup, str, aVar, oVar, false, null, 96, null);
        } else if (oVar != null) {
            oVar.onAdShowFailed(null);
        }
    }

    public final void g(Activity activity, ViewGroup viewGroup, String str, oj.a aVar, o oVar, Function0 function0) {
        "activity" /* decoded XOR */;
        activity.getClass();
        "containerView" /* decoded XOR */;
        viewGroup.getClass();
        "positionId" /* decoded XOR */;
        str.getClass();
        "isHostReady" /* decoded XOR */;
        function0.getClass();
        if (ti.b.c(activity) && !activity.isFinishing() && !activity.isDestroyed()) {
            h(activity, viewGroup, str, aVar, oVar, true, function0);
        } else if (oVar != null) {
            oVar.onAdShowFailed(null);
        }
    }

    public final void h(Activity activity, ViewGroup viewGroup, String str, oj.a aVar, o oVar, boolean z10, Function0 function0) {
        if (z10 && (function0 == null || !((Boolean) function0.invoke()).booleanValue())) {
            if (oVar != null) {
                oVar.onAdShowFailed(null);
            }
        } else {
            if (!z10 && !e.b0().f0()) {
                if (oVar != null) {
                    oVar.onAdShowFailed(null);
                    return;
                }
                return;
            }
            if (this.f64954b.b() != null) {
                viewGroup.removeAllViewsInLayout();
                if (aVar != null) {
                    aVar.destroy();
                }
                viewGroup.setVisibility(0);
            }
            b bVar = new b(activity, oVar, str, this, viewGroup, aVar, z10, function0);
            bVar.i(this.f64954b.d(activity, viewGroup, str, bVar));
        }
    }
}