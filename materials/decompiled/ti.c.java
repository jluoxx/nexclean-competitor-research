package ti;

import android.content.res.Resources;

/* JADX INFO: loaded from: classes7.dex */
public abstract class c {
    public static final int a(int i10) {
        return c(i10);
    }

    public static final float b() {
        return Resources.getSystem().getDisplayMetrics().density;
    }

    public static final int c(float f10) {
        return (int) ((f10 * b()) + 0.5f);
    }
}