package hj;

import android.app.Activity;
import android.text.TextUtils;
import com.thinkup.splashad.api.TUSplashAd;
import java.util.HashMap;
import java.util.Timer;

/* JADX INFO: loaded from: classes7.dex */
public final class a extends k {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public c f83504n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public boolean f83505o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public TUSplashAd f83506p;

    /* JADX INFO: renamed from: hj.a$a, reason: collision with other inner class name */
    public static final class C1015a extends ll.m implements tl.n {
        public final /* synthetic */ c OooO0O0;
        public final /* synthetic */ Activity OooO0OO;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C1015a(c cVar, Activity activity, kl.f fVar) {
            super(2, fVar);
            this.OooO0O0 = cVar;
            this.OooO0OO = activity;
        }

        public final Object OooO00o(kotlinx.coroutines.p0 p0Var, kl.f<? super fl.m0> fVar) {
            return ((C1015a) create(p0Var, fVar)).invokeSuspend(fl.m0.f80959a);
        }

        @Override // ll.a
        public final kl.f<fl.m0> create(Object obj, kl.f<?> fVar) {
            return a.this.new C1015a(this.OooO0O0, this.OooO0OO, fVar);
        }

        @Override // tl.n
        public final Object invoke(Object obj, Object obj2) {
            return ((C1015a) create((kotlinx.coroutines.p0) obj, (kl.f) obj2)).invokeSuspend(fl.m0.f80959a);
        }

        @Override // ll.a
        public final Object invokeSuspend(Object obj) {
            p003kotlin.coroutines.intrinsics.c.f();
            fl.v.b(obj);
            a aVar = a.this;
            aVar.b();
            Timer timer = new Timer();
            aVar.f83611j = timer;
            timer.schedule(new t1(aVar), aVar.f83613l);
            c cVar = this.OooO0O0;
            Activity activity = this.OooO0OO;
            String str = a.this.f83607f;
            if (str == null) {
                str = "";
            }
            if (!cVar.c(activity, str)) {
                a.this.g(kj.c.E_91206.getCode(), "E_91206");
            }
            return fl.m0.f80959a;
        }
    }

    public a(kj.e eVar, double d10, n1 n1Var) {
        super(eVar, d10, n1Var);
    }

    /* JADX WARN: Code duplicated, block: B:25:0x0041 A[PHI: r0
  0x0041: PHI (r0v8 java.lang.String) = (r0v4 java.lang.String), (r0v16 java.lang.String), (r0v23 java.lang.String), (r0v31 java.lang.String) binds: [B:48:0x0082, B:43:0x0074, B:38:0x0066, B:23:0x003e] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:26:0x0043  */
    /* JADX WARN: Code duplicated, block: B:28:0x004c  */
    /* JADX WARN: Code duplicated, block: B:32:0x0059  */
    /* JADX WARN: Code duplicated, block: B:35:0x0060  */
    /* JADX WARN: Code duplicated, block: B:40:0x0069  */
    /* JADX WARN: Code duplicated, block: B:42:0x0072  */
    public static final void r(a aVar, double d10) {
        String str;
        q1 q1VarA;
        x1 x1Var;
        x1 x1Var2;
        String str2;
        x1 x1Var3;
        String str3;
        kj.e eVar = aVar.f83602a;
        if (eVar == null || eVar.b() != 3) {
            kj.e eVar2 = aVar.f83602a;
            String str4 = "";
            if (eVar2 == null || eVar2.b() != 30) {
                u0.f83705a.getClass();
                x1 x1Var4 = u0.f83707c;
                if (x1Var4 != null && (str = x1Var4.f83748a) != null) {
                    str4 = str;
                }
            } else if (aVar.f83614m.f() == 1) {
                u0.f83705a.getClass();
                x1 x1Var5 = u0.f83709e;
                if (x1Var5 == null || (str3 = x1Var5.f83748a) == null) {
                    str3 = "";
                }
                if (!TextUtils.isEmpty(str3)) {
                    x1 x1Var6 = u0.f83709e;
                    if (x1Var6 != null && (str = x1Var6.f83748a) != null) {
                        str4 = str;
                    }
                } else if (aVar.f83614m.f() == 4) {
                    u0.f83705a.getClass();
                    x1Var2 = u0.f83710f;
                    if (x1Var2 != null || (str2 = x1Var2.f83748a) == null) {
                        str2 = "";
                    }
                    if (TextUtils.isEmpty(str2)) {
                        u0.f83705a.getClass();
                        x1Var = u0.f83708d;
                        if (x1Var != null && (str = x1Var.f83748a) != null) {
                            str4 = str;
                        }
                    } else {
                        x1Var3 = u0.f83710f;
                        if (x1Var3 != null && (str = x1Var3.f83748a) != null) {
                            str4 = str;
                        }
                    }
                } else {
                    u0.f83705a.getClass();
                    x1Var = u0.f83708d;
                    if (x1Var != null) {
                        str4 = str;
                    }
                }
            } else if (aVar.f83614m.f() == 4) {
                u0.f83705a.getClass();
                x1Var2 = u0.f83710f;
                if (x1Var2 != null) {
                    str2 = "";
                } else {
                    str2 = "";
                }
                if (TextUtils.isEmpty(str2)) {
                    x1Var3 = u0.f83710f;
                    if (x1Var3 != null) {
                        str4 = str;
                    }
                } else {
                    u0.f83705a.getClass();
                    x1Var = u0.f83708d;
                    if (x1Var != null) {
                        str4 = str;
                    }
                }
            } else {
                u0.f83705a.getClass();
                x1Var = u0.f83708d;
                if (x1Var != null) {
                    str4 = str;
                }
            }
            if (str4.length() <= 0 || (q1VarA = r.f83668a.a(3)) == null) {
                return;
            }
            q1VarA.b(new e(aVar, str4, d10));
        }
    }

    @Override // oj.a
    public final void destroy() {
        c cVar = this.f83504n;
        if (cVar != null) {
            cVar.d();
        }
        this.f83504n = null;
        this.f83605d = null;
    }

    @Override // hj.k
    public final void f(HashMap map) {
        String strA;
        a3 a3Var = a3.f83512a;
        kj.e eVar = this.f83602a;
        c cVarA = a3Var.a(eVar != null ? eVar.b() : 0, new d(this));
        this.f83504n = cVarA;
        kj.e eVar2 = this.f83602a;
        if (eVar2 == null || (strA = eVar2.a()) == null) {
            strA = "";
        }
        cVarA.b(strA, map);
    }

    @Override // hj.k
    public final boolean i() {
        boolean zE = true;
        if (this.f83614m.b() == 3 || this.f83614m.b() == 30) {
            c cVar = this.f83504n;
            zE = cVar != null ? cVar.e() : true;
            if (zE) {
                c cVar2 = this.f83504n;
                if (cVar2 != null) {
                    cVar2.f();
                }
                destroy();
            }
            return zE;
        }
        if (!super.i()) {
            c cVar3 = this.f83504n;
            if (!(cVar3 != null ? cVar3.e() : true)) {
                zE = false;
            }
        }
        if (zE) {
            c cVar4 = this.f83504n;
            if (cVar4 != null) {
                cVar4.f();
            }
            destroy();
        }
        return zE;
    }

    @Override // hj.k
    public final boolean o() {
        c cVar = this.f83504n;
        if (cVar != null) {
            return cVar.a();
        }
        return false;
    }

    public final oj.a q(Activity activity, String str, mj.c cVar) {
        q1 q1VarA;
        this.f83505o = true;
        this.f83607f = str;
        this.f83605d = cVar;
        kj.e eVar = this.f83602a;
        if (eVar != null) {
            q1VarA = r.f83668a.a(eVar.b());
        } else {
            q1VarA = null;
        }
        if (q1VarA == null || !q1VarA.a()) {
            g(kj.c.E_91202.getCode(), "E_91202");
            return this;
        }
        if (!j()) {
            g(kj.c.E_91203.getCode(), "E_91203");
            return this;
        }
        if (i()) {
            g(kj.c.E_91204.getCode(), "E_91204");
            return this;
        }
        c cVar2 = this.f83504n;
        if (cVar2 != null && kotlinx.coroutines.k.d(kotlinx.coroutines.v1.f87249a, kotlinx.coroutines.f1.c(), null, new C1015a(cVar2, activity, null), 2, null) != null) {
            return this;
        }
        g(kj.c.E_91205.getCode(), "E_91205");
        fl.m0 m0Var = fl.m0.f80959a;
        return this;
    }
}