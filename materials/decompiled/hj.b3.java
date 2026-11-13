package hj;

import android.app.Activity;
import android.view.ViewGroup;

/* JADX INFO: loaded from: classes7.dex */
public final class b3 extends n2 {
    /* JADX WARN: Illegal instructions before constructor call */
    public b3(String str) {
        c1 c1Var = c1.f83527c;
        w0.f83728a.getClass();
        super(str, c1Var, w0.f83729b);
    }

    public final oj.a c(Activity activity, ViewGroup viewGroup, String str, mj.b bVar) {
        j jVar = (j) a(bVar);
        oj.a aVarQ = jVar != null ? jVar.q(activity, viewGroup, str, bVar) : null;
        if (jVar != null) {
            this.f83642c.c(jVar);
            return aVarQ;
        }
        if (bVar != null) {
            this.f83642c.e(this.f83640a, bVar);
        }
        return aVarQ;
    }
}