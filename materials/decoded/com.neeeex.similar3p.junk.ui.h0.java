package com.neeeex.similar3p.junk.ui;

import android.view.View;
import androidx.core.view.c1;
import com.neeeex.eraser.m0;

/* JADX INFO: loaded from: classes7.dex */
public abstract class h0 {
    public static c1 a(h hVar, View view, c1 c1Var) {
        "<unused var>" /* decoded XOR */;
        view.getClass();
        "insets" /* decoded XOR */;
        c1Var.getClass();
        o2.d dVarF = c1Var.f(c1.p.i());
        "getInsets(...)" /* decoded XOR */;
        dVarF.getClass();
        hVar.a(dVarF.f89981b, dVarF.f89983d);
        return c1Var;
    }

    public static final void b(View view, View view2, View view3, View view4) {
        "root" /* decoded XOR */;
        view.getClass();
        "topMarginView" /* decoded XOR */;
        view2.getClass();
        final h hVarA = h.f66441g.a(view2, view3, view4);
        androidx.core.view.m0.w0(view, new androidx.core.view.y() { // from class: com.neeeex.similar3p.junk.ui.g0
            @Override // androidx.core.view.y
            public final c1 a(View view5, c1 c1Var) {
                return h0.a(hVarA, view5, c1Var);
            }
        });
        androidx.core.view.m0.i0(view);
    }

    public static /* synthetic */ void c(View view, View view2, View view3, View view4, int i10, Object obj) {
        if ((i10 & 4) != 0) {
            view3 = null;
        }
        if ((i10 & 8) != 0) {
            view4 = null;
        }
        b(view, view2, view3, view4);
    }
}