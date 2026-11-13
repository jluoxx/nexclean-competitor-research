package hj;

import com.google.android.gms.location.DeviceOrientationRequest;
import java.util.HashMap;
import java.util.Timer;
import java.util.TimerTask;

/* JADX INFO: loaded from: classes7.dex */
public abstract class k implements oj.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final kj.e f83602a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final n1 f83603b;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public mj.c f83605d;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public String f83607f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public long f83608g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public long f83609h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public Timer f83610i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public Timer f83611j;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final kj.d f83614m;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f83604c = 13800000;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public y0 f83606e = y0.INIT;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final long f83612k = DeviceOrientationRequest.OUTPUT_PERIOD_DEFAULT;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final long f83613l = 5000;

    public static final class a implements j1 {
        public a() {
        }

        @Override // hj.j1
        public final void a(String str) {
            k kVar = k.this;
            int code = kj.c.E_91102.getCode();
            Timer timer = kVar.f83610i;
            if (timer != null) {
                timer.cancel();
            }
            kVar.f83610i = null;
            kVar.f83606e = y0.FAILED;
            n1 n1Var = kVar.f83603b;
            if (n1Var != null) {
                n1Var.f(kVar, kVar.f83614m, code, str);
            }
        }

        @Override // hj.j1
        public final void onInitSuccess() {
            k.this.a();
        }
    }

    public static final class b extends TimerTask {
        public b() {
        }

        @Override // java.util.TimerTask, java.lang.Runnable
        public final void run() {
            k kVar = k.this;
            if (kVar.f83606e == y0.READY) {
                kVar.d(kj.c.E_91104.getCode(), "E_91104");
            }
        }
    }

    public k(kj.e eVar, double d10, n1 n1Var) {
        String strG;
        String strA;
        this.f83602a = eVar;
        this.f83603b = n1Var;
        this.f83609h = 3000000L;
        this.f83614m = new kj.d((eVar == null || (strA = eVar.a()) == null) ? "" : strA, (eVar == null || (strG = eVar.g()) == null) ? "" : strG, eVar != null ? eVar.d() : 0.0d, eVar != null ? eVar.c() : 0, eVar != null ? eVar.b() : 0, eVar != null ? eVar.b() : 0);
        if (eVar != null && eVar.c() == 5 && eVar.b() == 1) {
            this.f83609h = 13800000L;
        }
    }

    public final void a() {
        y0 y0Var = y0.READY;
        this.f83606e = y0Var;
        if (!k2.f83617a.a()) {
            d(kj.c.E_91101.getCode(), "E_91101");
            return;
        }
        f(new HashMap());
        if (this.f83606e == y0Var) {
            Timer timer = this.f83610i;
            if (timer != null) {
                timer.cancel();
            }
            this.f83610i = null;
            Timer timer2 = new Timer();
            this.f83610i = timer2;
            timer2.schedule(new b(), this.f83612k);
        }
    }

    public final void b() {
        Timer timer = this.f83611j;
        if (timer != null) {
            timer.cancel();
        }
        this.f83611j = null;
    }

    public final void c(int i10) {
        kotlinx.coroutines.k.d(kotlinx.coroutines.v1.f87249a, kotlinx.coroutines.f1.c(), null, new n(this, i10, null), 2, null);
    }

    public final void d(int i10, String str) {
        Timer timer = this.f83610i;
        if (timer != null) {
            timer.cancel();
        }
        this.f83610i = null;
        if (this.f83606e == y0.READY) {
            this.f83606e = y0.FAILED;
            n1 n1Var = this.f83603b;
            if (n1Var != null) {
                n1Var.f(this, this.f83614m, i10, str);
            }
        }
    }

    public final void e(w2 w2Var) {
        this.f83614m.j(w2Var.f83740d);
        this.f83614m.i(w2Var.f83737a);
        this.f83614m.h(w2Var.f83738b);
        if (this.f83614m.b() == 1 && w2Var.f83740d == 1) {
            v.f83716a.b(this.f83614m.c(), this.f83614m.d());
            kj.e eVar = this.f83602a;
            if (eVar != null) {
                this.f83602a.l(y.f83761a.b(eVar.a(), w2Var.f83737a));
            }
        }
        kotlinx.coroutines.k.d(kotlinx.coroutines.v1.f87249a, kotlinx.coroutines.f1.c(), null, new t0(this, w2Var, null), 2, null);
    }

    public abstract void f(HashMap map);

    public final void g(int i10, String str) {
        b();
        n1 n1Var = this.f83603b;
        if (n1Var != null) {
            n1Var.d(this, this.f83614m, i10, str);
        }
        kotlinx.coroutines.k.d(kotlinx.coroutines.v1.f87249a, kotlinx.coroutines.f1.c(), null, new s2(this, i10, str, null), 2, null);
    }

    public final void h(int i10, String str) {
        this.f83614m.j(i10);
        this.f83614m.g(str);
        if (this.f83614m.c() == 5 && i10 == 1) {
            this.f83609h = this.f83604c;
        }
    }

    public boolean i() {
        return this.f83608g > 0 && System.currentTimeMillis() - this.f83608g >= this.f83609h;
    }

    public final boolean j() {
        return this.f83606e == y0.SUCCESS;
    }

    public final void k() {
        q1 q1VarA;
        kj.e eVar = this.f83602a;
        if (eVar != null) {
            q1VarA = r.f83668a.a(eVar.b());
        } else {
            q1VarA = null;
        }
        if (q1VarA != null) {
            q1VarA.b(new a());
            return;
        }
        int code = kj.c.E_91103.getCode();
        Timer timer = this.f83610i;
        if (timer != null) {
            timer.cancel();
        }
        this.f83610i = null;
        this.f83606e = y0.FAILED;
        n1 n1Var = this.f83603b;
        if (n1Var != null) {
            n1Var.f(this, this.f83614m, code, "E_91103");
        }
    }

    public final void l() {
        kotlinx.coroutines.k.d(kotlinx.coroutines.v1.f87249a, kotlinx.coroutines.f1.c(), null, new l(this, null), 2, null);
    }

    public final void m() {
        kotlinx.coroutines.k.d(kotlinx.coroutines.v1.f87249a, kotlinx.coroutines.f1.c(), null, new m(this, null), 2, null);
    }

    public final void n() {
        if ((this.f83614m.b() == 3 || this.f83614m.b() == 30) && (this.f83614m.f() == 1 || this.f83614m.f() == 4)) {
            v.f83716a.b(this.f83614m.c(), this.f83614m.d());
        }
        if (this.f83614m.b() == 1 && this.f83614m.f() == 1) {
            p.f83648a.b(this.f83614m.c(), this.f83614m.d());
        }
        Timer timer = this.f83610i;
        if (timer != null) {
            timer.cancel();
        }
        this.f83610i = null;
        this.f83608g = System.currentTimeMillis();
        if (this.f83606e == y0.READY) {
            this.f83606e = y0.SUCCESS;
            n1 n1Var = this.f83603b;
            if (n1Var != null) {
                n1Var.c(this, this.f83614m);
                return;
            }
            return;
        }
        this.f83606e = y0.SUCCESS;
        n1 n1Var2 = this.f83603b;
        if (n1Var2 != null) {
            n1Var2.b(this, this.f83614m);
        }
    }

    public abstract boolean o();

    public final void p() {
        b();
        n1 n1Var = this.f83603b;
        if (n1Var != null) {
            n1Var.a(this, this.f83614m);
        }
        kotlinx.coroutines.k.d(kotlinx.coroutines.v1.f87249a, kotlinx.coroutines.f1.c(), null, new f1(this, null), 2, null);
    }
}