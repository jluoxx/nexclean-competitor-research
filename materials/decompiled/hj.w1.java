package hj;

import java.util.HashMap;

/* JADX INFO: loaded from: classes7.dex */
public abstract class w1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f83734a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final HashMap f83735b = new HashMap();

    public w1(int i10) {
        this.f83734a = i10;
    }

    public final void a(String str, boolean z10, mj.a aVar) {
        r1 r1VarC = (r1) this.f83735b.get(str);
        if (r1VarC == null) {
            kj.a.C1088a c1088aA = u0.f83705a.a(str);
            r1VarC = (c1088aA == null || c1088aA.a() != this.f83734a) ? null : c(str);
            this.f83735b.put(str, r1VarC);
        }
        if (r1VarC != null) {
            r1VarC.e(z10, aVar);
        }
    }

    public final boolean b(String str) {
        r1 r1Var = (r1) this.f83735b.get(str);
        if (r1Var != null) {
            return r1Var.c();
        }
        return false;
    }

    public abstract r1 c(String str);
}