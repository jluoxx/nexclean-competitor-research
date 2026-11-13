package com.neeeex.eraser.ads;

import android.app.Activity;
import android.view.ViewGroup;
import android.view.ViewParent;
import com.neeeex.eraser.m0;
import p003kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes7.dex */
public final class n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f64971a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final jj.d f64972b;

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
        public oj.a f64973a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Activity f64974b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ o f64975c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ String f64976d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final /* synthetic */ n f64977e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final /* synthetic */ ViewGroup f64978f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final /* synthetic */ nj.a f64979g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final /* synthetic */ oj.a f64980h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public final /* synthetic */ ViewGroup f64981i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public final /* synthetic */ boolean f64982j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public final /* synthetic */ Function0 f64983k;

        public b(Activity activity, o oVar, String str, n nVar, ViewGroup viewGroup, nj.a aVar, oj.a aVar2, ViewGroup viewGroup2, boolean z10, Function0 function0) {
            this.f64974b = activity;
            this.f64975c = oVar;
            this.f64976d = str;
            this.f64977e = nVar;
            this.f64978f = viewGroup;
            this.f64979g = aVar;
            this.f64980h = aVar2;
            this.f64981i = viewGroup2;
            this.f64982j = z10;
            this.f64983k = function0;
        }

        @Override // mj.c
        public void a(kj.d dVar, double d10) {
            i.f64940a.g(dVar, d10);
        }

        @Override // mj.b
        public void b() {
            if (this.f64974b.isFinishing() || this.f64977e.c().b() == null) {
                return;
            }
            this.f64977e.h(this.f64974b, this.f64978f, this.f64979g, this.f64976d, this.f64980h, this.f64981i, this.f64975c, this.f64982j, this.f64983k);
        }

        @Override // mj.b
        public void c(kj.d dVar) {
        }

        @Override // mj.c
        public void d(kj.d dVar, kj.b bVar) {
            o oVar = this.f64975c;
            if (oVar != null) {
                oVar.onAdShowFailed(this.f64973a);
            }
        }

        @Override // mj.c
        public void e(kj.d dVar) {
            o oVar = this.f64975c;
            if (oVar != null) {
                oVar.onAdShowSuccess(this.f64973a);
            }
            mi.a.f88870a.e0(this.f64976d, j.f64946a.a(dVar != null ? dVar.d() : 0.0d));
        }

        @Override // mj.c
        public void f(kj.d dVar) {
            e.b0().v0(this.f64974b);
            o oVar = this.f64975c;
            if (oVar != null) {
                oVar.onAdClick();
            }
            i.f64940a.f(dVar);
            mi.a.f88870a.c0(this.f64976d);
        }

        @Override // mj.c
        public void g(kj.d dVar, int i10) {
        }

        @Override // mj.c
        public void h(kj.d dVar) {
            o oVar = this.f64975c;
            if (oVar != null) {
                oVar.onAdClose();
            }
        }

        public final void i(oj.a aVar) {
            this.f64973a = aVar;
        }
    }

    public n(String str) {
        m0.a("zJ5meIwCgcLIu2M=\n", "vPIHG+lv5Kw=\n");
        str.getClass();
        this.f64971a = str;
        this.f64972b = new jj.d(str);
    }

    public static /* synthetic */ void i(n nVar, Activity activity, ViewGroup viewGroup, nj.a aVar, String str, oj.a aVar2, ViewGroup viewGroup2, o oVar, boolean z10, Function0 function0, int i10, Object obj) {
        nVar.h(activity, viewGroup, aVar, str, aVar2, viewGroup2, oVar, (i10 & 128) != 0 ? false : z10, (i10 & 256) != 0 ? null : function0);
    }

    public final void b(String str) {
        m0.a("f+nP68fkrTRG4g==\n", "D4a8grONwlo=\n");
        str.getClass();
        mi.a.f88870a.d0(str);
    }

    public final jj.d c() {
        return this.f64972b;
    }

    public final double d() {
        kj.d dVarB = this.f64972b.b();
        if (dVarB != null) {
            return dVarB.d();
        }
        return -0.1d;
    }

    public final void e(boolean z10) {
        this.f64972b.c(z10, new a());
    }

    public final void f(Activity activity, ViewGroup viewGroup, nj.a aVar, String str, oj.a aVar2, ViewGroup viewGroup2, o oVar) {
        m0.a("qclTOgA+eCo=\n", "yKonU3ZXDFM=\n");
        activity.getClass();
        m0.a("7ItvOvRxXbL9smgr4g==\n", "j+QBTpUYM9c=\n");
        viewGroup.getClass();
        m0.a("avCTjcLuRjlS+IKT\n", "BJHn5LSLB10=\n");
        aVar.getClass();
        m0.a("Trvlq7jUT313sA==\n", "PtSWwsy9IBM=\n");
        str.getClass();
        if (ti.b.c(activity)) {
            i(this, activity, viewGroup, aVar, str, aVar2, viewGroup2, oVar, false, null, 384, null);
        } else if (oVar != null) {
            oVar.onAdShowFailed(null);
        }
    }

    public final void g(Activity activity, ViewGroup viewGroup, nj.a aVar, String str, oj.a aVar2, o oVar, Function0 function0) {
        m0.a("PD78ozrqtAw=\n", "XV2IykyDwHU=\n");
        activity.getClass();
        m0.a("aDxXazH/mGl5BVB6Jw==\n", "C1M5H1CW9gw=\n");
        viewGroup.getClass();
        m0.a("wE/Sc47LwEH4R8Nt\n", "ri6mGviugSU=\n");
        aVar.getClass();
        m0.a("yMk63U2LHFjxwg==\n", "uKZJtDniczY=\n");
        str.getClass();
        m0.a("o5GP/cB6ZVmrhr4=\n", "yuLHkrMONzw=\n");
        function0.getClass();
        if (ti.b.c(activity) && !activity.isFinishing() && !activity.isDestroyed()) {
            h(activity, viewGroup, aVar, str, aVar2, null, oVar, true, function0);
        } else if (oVar != null) {
            oVar.onAdShowFailed(null);
        }
    }

    public final void h(Activity activity, ViewGroup viewGroup, nj.a aVar, String str, oj.a aVar2, ViewGroup viewGroup2, o oVar, boolean z10, Function0 function0) {
        if (z10 && (function0 == null || !((Boolean) function0.invoke()).booleanValue())) {
            if (oVar != null) {
                oVar.onAdShowFailed(null);
                return;
            }
            return;
        }
        if (!z10 && !e.b0().f0()) {
            if (oVar != null) {
                oVar.onAdShowFailed(null);
                return;
            }
            return;
        }
        if (this.f64972b.b() != null) {
            viewGroup.removeAllViewsInLayout();
            if (aVar2 != null) {
                aVar2.destroy();
            }
            if (viewGroup2 != null) {
                viewGroup2.setVisibility(8);
            }
            viewGroup.setVisibility(0);
            if (aVar.getParent() instanceof ViewGroup) {
                ViewParent parent = aVar.getParent();
                m0.a("yE+cgr68Qn3IVYTO/LoDcMdJhM7qsAN9yVTdgOuzTzPSQ4CLvr5Nd9RVmYqwqUp20RSmh/uoZGHJ\nT4A=\n", "pjrw7p7fIxM=\n");
                parent.getClass();
                ((ViewGroup) parent).removeView(aVar);
            }
        }
        b bVar = new b(activity, oVar, str, this, viewGroup, aVar, aVar2, viewGroup2, z10, function0);
        bVar.i(this.f64972b.d(activity, viewGroup, aVar, str, bVar));
    }
}