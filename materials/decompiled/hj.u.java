package hj;

import android.text.TextUtils;
import java.util.HashMap;

/* JADX INFO: loaded from: classes7.dex */
public final class u extends k {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public s f83704n;

    public u(kj.e eVar, double d10, n1 n1Var) {
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
    public static final void q(u uVar, double d10) {
        String str;
        q1 q1VarA;
        x1 x1Var;
        x1 x1Var2;
        String str2;
        x1 x1Var3;
        String str3;
        kj.e eVar = uVar.f83602a;
        if (eVar == null || eVar.b() != 3) {
            kj.e eVar2 = uVar.f83602a;
            String str4 = "";
            if (eVar2 == null || eVar2.b() != 30) {
                u0.f83705a.getClass();
                x1 x1Var4 = u0.f83707c;
                if (x1Var4 != null && (str = x1Var4.f83752e) != null) {
                    str4 = str;
                }
            } else if (uVar.f83614m.f() == 1) {
                u0.f83705a.getClass();
                x1 x1Var5 = u0.f83709e;
                if (x1Var5 == null || (str3 = x1Var5.f83752e) == null) {
                    str3 = "";
                }
                if (!TextUtils.isEmpty(str3)) {
                    x1 x1Var6 = u0.f83709e;
                    if (x1Var6 != null && (str = x1Var6.f83752e) != null) {
                        str4 = str;
                    }
                } else if (uVar.f83614m.f() == 4) {
                    u0.f83705a.getClass();
                    x1Var2 = u0.f83710f;
                    if (x1Var2 != null || (str2 = x1Var2.f83752e) == null) {
                        str2 = "";
                    }
                    if (TextUtils.isEmpty(str2)) {
                        u0.f83705a.getClass();
                        x1Var = u0.f83708d;
                        if (x1Var != null && (str = x1Var.f83752e) != null) {
                            str4 = str;
                        }
                    } else {
                        x1Var3 = u0.f83710f;
                        if (x1Var3 != null && (str = x1Var3.f83752e) != null) {
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
            } else if (uVar.f83614m.f() == 4) {
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
            q1VarA.b(new t(str4, d10, uVar));
        }
    }

    @Override // oj.a
    public final void destroy() {
        s sVar = this.f83704n;
        if (sVar != null) {
            sVar.c();
        }
        this.f83704n = null;
        this.f83605d = null;
    }

    @Override // hj.k
    public final void f(HashMap map) {
        String strA;
        a3 a3Var = a3.f83512a;
        kj.e eVar = this.f83602a;
        s sVarE = a3Var.e(eVar != null ? eVar.b() : 0, new q(this));
        this.f83704n = sVarE;
        kj.e eVar2 = this.f83602a;
        if (eVar2 == null || (strA = eVar2.a()) == null) {
            strA = "";
        }
        sVarE.b(strA, map);
    }

    @Override // hj.k
    public final boolean i() {
        boolean zBooleanValue = true;
        if (this.f83614m.b() == 3 || this.f83614m.b() == 30) {
            s sVar = this.f83704n;
            zBooleanValue = sVar != null ? sVar.d().booleanValue() : true;
            if (zBooleanValue) {
                s sVar2 = this.f83704n;
                if (sVar2 != null) {
                    sVar2.e();
                }
                destroy();
            }
            return zBooleanValue;
        }
        if (!super.i()) {
            s sVar3 = this.f83704n;
            if (!(sVar3 != null ? sVar3.d().booleanValue() : true)) {
                zBooleanValue = false;
            }
        }
        if (zBooleanValue) {
            s sVar4 = this.f83704n;
            if (sVar4 != null) {
                sVar4.e();
            }
            destroy();
        }
        return zBooleanValue;
    }

    @Override // hj.k
    public final boolean o() {
        s sVar = this.f83704n;
        if (sVar != null) {
            return sVar.a();
        }
        return false;
    }
}