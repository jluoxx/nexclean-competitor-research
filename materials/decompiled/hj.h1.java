package hj;

import android.app.Activity;
import android.view.ViewGroup;

/* JADX INFO: loaded from: classes7.dex */
public final class h1 extends n2 {
    /* JADX WARN: Illegal instructions before constructor call */
    public h1(String str) {
        f3 f3Var = f3.f83568c;
        w0.f83728a.getClass();
        super(str, f3Var, w0.f83730c);
    }

    public final oj.a c(Activity activity, ViewGroup viewGroup, nj.a aVar, String str, mj.b bVar) {
        mj.b bVar2;
        oj.a aVarQ;
        q0 q0Var = (q0) a(bVar);
        if (q0Var != null) {
            bVar2 = bVar;
            aVarQ = q0Var.q(activity, viewGroup, aVar, str, bVar2);
        } else {
            bVar2 = bVar;
            aVarQ = null;
        }
        if (q0Var != null) {
            this.f83642c.c(q0Var);
            return aVarQ;
        }
        if (bVar2 != null) {
            this.f83642c.e(this.f83640a, bVar2);
        }
        return aVarQ;
    }
}