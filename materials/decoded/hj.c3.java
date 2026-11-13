package hj;

import android.app.Application;
import com.thinkup.core.api.TUSDK;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* JADX INFO: loaded from: classes7.dex */
public final class c3 extends b {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Set f83535c = Collections.synchronizedSet(new HashSet());

    @Override // hj.b
    public final void c(b.C1016b c1016b) {
        try {
            Application applicationC = ij.a.c();
            if (applicationC == null) {
                b.this.d(false, "error001");
                return;
            }
            u0.f83705a.getClass();
            a2 a2Var = u0.f83711g;
            if (a2Var == null) {
                b.this.d(false, "error002");
                return;
            }
            String str = a2Var.f83511c;
            if (str != null && str.length() > 0) {
                a2 a2Var2 = u0.f83711g;
                TUSDK.setLocalStrategyAssetPath(applicationC, a2Var2 != null ? a2Var2.f83511c : null);
            }
            a2 a2Var3 = u0.f83711g;
            TUSDK.init(applicationC, a2Var3 != null ? a2Var3.f83509a : null, a2Var3 != null ? a2Var3.f83510b : null);
            b.this.d(true, "");
        } catch (Throwable th2) {
            b.this.d(false, th2.getMessage());
        }
    }
}