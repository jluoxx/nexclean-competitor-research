package hj;

import android.app.Activity;
import android.text.TextUtils;
import android.view.ViewGroup;
import java.util.HashMap;

/* JADX INFO: loaded from: classes7.dex */
public final class j extends k {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public f f83593n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public boolean f83594o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public ViewGroup f83595p;

    public static final class a extends ll.m implements tl.n {
        public final /* synthetic */ f OooO00o;
        public final /* synthetic */ Activity OooO0O0;
        public final /* synthetic */ ViewGroup OooO0OO;
        public final /* synthetic */ j OooO0Oo;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(f fVar, Activity activity, ViewGroup viewGroup, j jVar, kl.f fVar2) {
            super(2, fVar2);
            this.OooO00o = fVar;
            this.OooO0O0 = activity;
            this.OooO0OO = viewGroup;
            this.OooO0Oo = jVar;
        }

        public final Object OooO00o(kotlinx.coroutines.p0 p0Var, kl.f<? super fl.m0> fVar) {
            return ((a) create(p0Var, fVar)).invokeSuspend(fl.m0.f80959a);
        }

        @Override // ll.a
        public final kl.f<fl.m0> create(Object obj, kl.f<?> fVar) {
            return new a(this.OooO00o, this.OooO0O0, this.OooO0OO, this.OooO0Oo, fVar);
        }

        @Override // tl.n
        public final Object invoke(Object obj, Object obj2) {
            return ((a) create((kotlinx.coroutines.p0) obj, (kl.f) obj2)).invokeSuspend(fl.m0.f80959a);
        }

        @Override // ll.a
        public final Object invokeSuspend(Object obj) {
            p003kotlin.coroutines.intrinsics.c.f();
            fl.v.b(obj);
            f fVar = this.OooO00o;
            Activity activity = this.OooO0O0;
            ViewGroup viewGroup = this.OooO0OO;
            String str = this.OooO0Oo.f83607f;
            if (str == null) {
                str = "";
            }
            if (!fVar.b(activity, viewGroup, str)) {
                this.OooO0Oo.g(kj.c.E_91206.getCode(), "E_91206");
            }
            return fl.m0.f80959a;
        }
    }

    public j(kj.e eVar, double d10, n1 n1Var) {
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
    public static final void r(j jVar, double d10) {
        String str;
        q1 q1VarA;
        x1 x1Var;
        x1 x1Var2;
        String str2;
        x1 x1Var3;
        String str3;
        kj.e eVar = jVar.f83602a;
        if (eVar == null || eVar.b() != 3) {
            kj.e eVar2 = jVar.f83602a;
            String str4 = "";
            if (eVar2 == null || eVar2.b() != 30) {
                u0.f83705a.getClass();
                x1 x1Var4 = u0.f83707c;
                if (x1Var4 != null && (str = x1Var4.f83751d) != null) {
                    str4 = str;
                }
            } else if (jVar.f83614m.f() == 1) {
                u0.f83705a.getClass();
                x1 x1Var5 = u0.f83709e;
                if (x1Var5 == null || (str3 = x1Var5.f83751d) == null) {
                    str3 = "";
                }
                if (!TextUtils.isEmpty(str3)) {
                    x1 x1Var6 = u0.f83709e;
                    if (x1Var6 != null && (str = x1Var6.f83751d) != null) {
                        str4 = str;
                    }
                } else if (jVar.f83614m.f() == 4) {
                    u0.f83705a.getClass();
                    x1Var2 = u0.f83710f;
                    if (x1Var2 != null || (str2 = x1Var2.f83751d) == null) {
                        str2 = "";
                    }
                    if (TextUtils.isEmpty(str2)) {
                        u0.f83705a.getClass();
                        x1Var = u0.f83708d;
                        if (x1Var != null && (str = x1Var.f83751d) != null) {
                            str4 = str;
                        }
                    } else {
                        x1Var3 = u0.f83710f;
                        if (x1Var3 != null && (str = x1Var3.f83751d) != null) {
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
            } else if (jVar.f83614m.f() == 4) {
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
            q1VarA.b(new h(str4, d10, jVar));
        }
    }

    public static final void s(j jVar) {
        jVar.b();
        kotlinx.coroutines.k.d(kotlinx.coroutines.v1.f87249a, kotlinx.coroutines.f1.c(), null, new i(jVar, null), 2, null);
    }

    @Override // oj.a
    public final void destroy() {
        f fVar = this.f83593n;
        if (fVar != null) {
            fVar.c();
        }
        this.f83593n = null;
        this.f83605d = null;
    }

    @Override // hj.k
    public final void f(HashMap map) {
        String strA;
        a3 a3Var = a3.f83512a;
        kj.e eVar = this.f83602a;
        f fVarB = a3Var.b(eVar != null ? eVar.b() : 0, new g(this));
        this.f83593n = fVarB;
        kj.e eVar2 = this.f83602a;
        map.put("ad_pp_inline_width", String.valueOf(eVar2 != null ? Integer.valueOf(eVar2.e()) : null));
        kj.e eVar3 = this.f83602a;
        map.put("ad_pp_normal_width", String.valueOf(eVar3 != null ? Integer.valueOf(eVar3.f()) : null));
        kj.e eVar4 = this.f83602a;
        map.put("ad_pp_fix_banner_small", (eVar4 == null || !eVar4.i()) ? "0" : "1");
        kj.e eVar5 = this.f83602a;
        if (eVar5 == null || (strA = eVar5.a()) == null) {
            strA = "";
        }
        fVarB.a(strA, map);
    }

    @Override // hj.k
    public final boolean i() {
        boolean zD = true;
        if (this.f83614m.b() == 3 || this.f83614m.b() == 30) {
            f fVar = this.f83593n;
            zD = fVar != null ? fVar.d() : true;
            if (zD) {
                f fVar2 = this.f83593n;
                if (fVar2 != null) {
                    fVar2.e();
                }
                destroy();
            }
            return zD;
        }
        if (!super.i()) {
            f fVar3 = this.f83593n;
            if (!(fVar3 != null ? fVar3.d() : true)) {
                zD = false;
            }
        }
        if (zD) {
            f fVar4 = this.f83593n;
            if (fVar4 != null) {
                fVar4.e();
            }
            destroy();
        }
        return zD;
    }

    @Override // hj.k
    public final boolean o() {
        f fVar = this.f83593n;
        if (fVar != null) {
            return fVar.f();
        }
        return false;
    }

    public final oj.a q(Activity activity, ViewGroup viewGroup, String str, mj.b bVar) {
        q1 q1VarA;
        j jVar;
        this.f83594o = true;
        this.f83607f = str;
        this.f83605d = bVar;
        kj.e eVar = this.f83602a;
        if (eVar != null) {
            q1VarA = r.f83668a.a(eVar.b());
        } else {
            q1VarA = null;
        }
        kj.e eVar2 = this.f83602a;
        if (eVar2 == null || eVar2.b() != 3) {
            this.f83595p = viewGroup;
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
        f fVar = this.f83593n;
        if (fVar != null) {
            kotlinx.coroutines.v1 v1Var = kotlinx.coroutines.v1.f87249a;
            kotlinx.coroutines.l2 l2VarC = kotlinx.coroutines.f1.c();
            a aVar = new a(fVar, activity, viewGroup, this, null);
            jVar = this;
            if (kotlinx.coroutines.k.d(v1Var, l2VarC, null, aVar, 2, null) != null) {
                return jVar;
            }
        } else {
            jVar = this;
        }
        g(kj.c.E_91205.getCode(), "E_91205");
        fl.m0 m0Var = fl.m0.f80959a;
        return jVar;
    }
}