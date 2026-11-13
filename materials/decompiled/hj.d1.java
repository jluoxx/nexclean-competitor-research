package hj;

import android.app.Activity;

/* JADX INFO: loaded from: classes7.dex */
public final class d1 extends n2 {
    /* JADX WARN: Illegal instructions before constructor call */
    public d1(String str) {
        g1 g1Var = g1.f83573c;
        w0.f83728a.getClass();
        super(str, g1Var, w0.f83731d);
    }

    public final oj.a c(Activity activity, String str, mj.c cVar) {
        q2 q2Var = (q2) a(cVar);
        oj.a aVarQ = q2Var != null ? q2Var.q(activity, str, cVar) : null;
        if (q2Var != null) {
            this.f83642c.c(q2Var);
        }
        return aVarQ;
    }
}