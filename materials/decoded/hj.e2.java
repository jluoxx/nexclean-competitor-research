package hj;

import android.app.Application;
import com.tradplus.ads.open.TradPlusSdk;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* JADX INFO: loaded from: classes7.dex */
public final class e2 extends b {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Set f83557c = Collections.synchronizedSet(new HashSet());

    public static final void e(j1 j1Var) {
        j1Var.onInitSuccess();
    }

    @Override // hj.b
    public final void c(final b.C1016b c1016b) {
        try {
            Application applicationC = ij.a.c();
            if (applicationC == null) {
                b.this.d(false, "init error by context is null");
                return;
            }
            u0.f83705a.getClass();
            if (u0.f83712h == null) {
                b.this.d(false, "init error by empty info");
                return;
            }
            TradPlusSdk.setTradPlusInitListener(new TradPlusSdk.TradPlusInitListener() { // from class: hj.d2
                @Override // com.tradplus.ads.open.TradPlusSdk.TradPlusInitListener
                public final void onInitSuccess() {
                    e2.e(c1016b);
                }
            });
            r2 r2Var = u0.f83712h;
            TradPlusSdk.initSdk(applicationC, r2Var != null ? r2Var.f83672a : null);
        } catch (Throwable th2) {
            b.this.d(false, th2.getMessage());
        }
    }
}