package ti;

import android.app.Activity;
import android.os.Build;
import android.view.View;
import android.view.WindowInsetsController;
import com.neeeex.eraser.m0;

/* JADX INFO: loaded from: classes7.dex */
public abstract class a {
    public static final void a(Activity activity, boolean z10) {
        "<this>" /* decoded XOR */;
        activity.getClass();
        if (Build.VERSION.SDK_INT >= 30) {
            b(activity, z10);
        } else {
            c(activity, z10);
        }
    }

    public static final void b(Activity activity, boolean z10) {
        WindowInsetsController insetsController = activity.getWindow().getInsetsController();
        if (insetsController == null) {
            return;
        }
        insetsController.setSystemBarsAppearance(z10 ? 8 : 0, 8);
    }

    public static final void c(Activity activity, boolean z10) {
        View decorView = activity.getWindow().getDecorView();
        "getDecorView(...)" /* decoded XOR */;
        decorView.getClass();
        int systemUiVisibility = decorView.getSystemUiVisibility();
        decorView.setSystemUiVisibility(z10 ? systemUiVisibility | 8192 : systemUiVisibility & (-8193));
    }
}