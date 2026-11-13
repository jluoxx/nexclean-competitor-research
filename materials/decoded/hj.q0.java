package hj;

import android.app.Activity;
import android.text.TextUtils;
import android.view.ViewGroup;
import com.thinkup.nativead.api.TUNative;
import java.util.HashMap;

/* JADX INFO: loaded from: classes7.dex */
public final class q0 extends k {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public o2 f83663n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public boolean f83664o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public TUNative f83665p;

    public static final class a extends ll.m implements tl.n {
        public final /* synthetic */ o2 OooO00o;
        public final /* synthetic */ Activity OooO0O0;
        public final /* synthetic */ ViewGroup OooO0OO;
        public final /* synthetic */ nj.a OooO0Oo;
        public final /* synthetic */ q0 OooO0o0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(o2 o2Var, Activity activity, ViewGroup viewGroup, nj.a aVar, q0 q0Var, kl.f fVar) {
            super(2, fVar);
            this.OooO00o = o2Var;
            this.OooO0O0 = activity;
            this.OooO0OO = viewGroup;
            this.OooO0Oo = aVar;
            this.OooO0o0 = q0Var;
        }

        public final Object OooO00o(kotlinx.coroutines.p0 p0Var, kl.f<? super fl.m0> fVar) {
            return ((a) create(p0Var, fVar)).invokeSuspend(fl.m0.f80959a);
        }

        @Override // ll.a
        public final kl.f<fl.m0> create(Object obj, kl.f<?> fVar) {
            return new a(this.OooO00o, this.OooO0O0, this.OooO0OO, this.OooO0Oo, this.OooO0o0, fVar);
        }

        @Override // tl.n
        public final Object invoke(Object obj, Object obj2) {
            return ((a) create((kotlinx.coroutines.p0) obj, (kl.f) obj2)).invokeSuspend(fl.m0.f80959a);
        }

        @Override // ll.a
        public final Object invokeSuspend(Object obj) {
            p003kotlin.coroutines.intrinsics.c.f();
            fl.v.b(obj);
            o2 o2Var = this.OooO00o;
            Activity activity = this.OooO0O0;
            ViewGroup viewGroup = this.OooO0OO;
            nj.a aVar = this.OooO0Oo;
            String str = this.OooO0o0.f83607f;
            if (str == null) {
                str = "";
            }
            if (!o2Var.b(activity, viewGroup, aVar, str)) {
                this.OooO0o0.g(kj.c.E_91206.getCode(), "E_91206");
            }
            return fl.m0.f80959a;
        }
    }

    public q0(kj.e eVar, double d10, n1 n1Var) {
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
    public static final void r(q0 q0Var, double d10) {
        String str;
        q1 q1VarA;
        x1 x1Var;
        x1 x1Var2;
        String str2;
        x1 x1Var3;
        String str3;
        kj.e eVar = q0Var.f83602a;
        if (eVar == null || eVar.b() != 3) {
            kj.e eVar2 = q0Var.f83602a;
            String str4 = "";
            if (eVar2 == null || eVar2.b() != 30) {
                u0.f83705a.getClass();
                x1 x1Var4 = u0.f83707c;
                if (x1Var4 != null && (str = x1Var4.f83750c) != null) {
                    str4 = str;
                }
            } else if (q0Var.f83614m.f() == 1) {
                u0.f83705a.getClass();
                x1 x1Var5 = u0.f83709e;
                if (x1Var5 == null || (str3 = x1Var5.f83750c) == null) {
                    str3 = "";
                }
                if (!TextUtils.isEmpty(str3)) {
                    x1 x1Var6 = u0.f83709e;
                    if (x1Var6 != null && (str = x1Var6.f83750c) != null) {
                        str4 = str;
                    }
                } else if (q0Var.f83614m.f() == 4) {
                    u0.f83705a.getClass();
                    x1Var2 = u0.f83710f;
                    if (x1Var2 != null || (str2 = x1Var2.f83750c) == null) {
                        str2 = "";
                    }
                    if (TextUtils.isEmpty(str2)) {
                        u0.f83705a.getClass();
                        x1Var = u0.f83708d;
                        if (x1Var != null && (str = x1Var.f83750c) != null) {
                            str4 = str;
                        }
                    } else {
                        x1Var3 = u0.f83710f;
                        if (x1Var3 != null && (str = x1Var3.f83750c) != null) {
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
            } else if (q0Var.f83614m.f() == 4) {
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
            q1VarA.b(new l2(q0Var, str4, d10));
        }
    }

    @Override // oj.a
    public final void destroy() {
        o2 o2Var = this.f83663n;
        if (o2Var != null) {
            o2Var.c();
        }
        this.f83663n = null;
        this.f83605d = null;
    }

    @Override // hj.k
    public final void f(HashMap map) {
        String strA;
        a3 a3Var = a3.f83512a;
        kj.e eVar = this.f83602a;
        o2 o2VarD = a3Var.d(eVar != null ? eVar.b() : 0, new e3(this));
        this.f83663n = o2VarD;
        kj.e eVar2 = this.f83602a;
        if (eVar2 == null || (strA = eVar2.a()) == null) {
            strA = "";
        }
        o2VarD.a(strA, map);
    }

    @Override // hj.k
    public final boolean i() {
        boolean zBooleanValue = true;
        if (this.f83614m.b() == 3 || this.f83614m.b() == 30) {
            o2 o2Var = this.f83663n;
            zBooleanValue = o2Var != null ? o2Var.d().booleanValue() : true;
            if (zBooleanValue) {
                o2 o2Var2 = this.f83663n;
                if (o2Var2 != null) {
                    o2Var2.e();
                }
                destroy();
            }
            return zBooleanValue;
        }
        if (!super.i()) {
            o2 o2Var3 = this.f83663n;
            if (!(o2Var3 != null ? o2Var3.d().booleanValue() : true)) {
                zBooleanValue = false;
            }
        }
        if (zBooleanValue) {
            o2 o2Var4 = this.f83663n;
            if (o2Var4 != null) {
                o2Var4.e();
            }
            destroy();
        }
        return zBooleanValue;
    }

    @Override // hj.k
    public final boolean o() {
        o2 o2Var = this.f83663n;
        if (o2Var != null) {
            return o2Var.f();
        }
        return false;
    }

    public final oj.a q(Activity activity, ViewGroup viewGroup, nj.a aVar, String str, mj.c cVar) {
        q1 q1VarA;
        q0 q0Var;
        this.f83664o = true;
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
        o2 o2Var = this.f83663n;
        if (o2Var != null) {
            kotlinx.coroutines.v1 v1Var = kotlinx.coroutines.v1.f87249a;
            kotlinx.coroutines.l2 l2VarC = kotlinx.coroutines.f1.c();
            a aVar2 = new a(o2Var, activity, viewGroup, aVar, this, null);
            q0Var = this;
            if (kotlinx.coroutines.k.d(v1Var, l2VarC, null, aVar2, 2, null) != null) {
                return q0Var;
            }
        } else {
            q0Var = this;
        }
        g(kj.c.E_91205.getCode(), "E_91205");
        fl.m0 m0Var = fl.m0.f80959a;
        return q0Var;
    }
}