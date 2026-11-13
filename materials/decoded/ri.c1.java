package ri;

import android.os.Environment;
import android.os.StatFs;
import com.neeeex.eraser.R$string;

/* JADX INFO: loaded from: classes7.dex */
public abstract class c1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final int[] f92966a = {R$string.push_neeeex_storage_usage_clean_0, R$string.push_neeeex_storage_usage_clean_1, R$string.push_neeeex_storage_usage_clean_2};

    public static final int c() {
        Object objM372constructorimpl;
        try {
            fl.u.a aVar = fl.u.Companion;
            StatFs statFs = new StatFs(Environment.getExternalStorageDirectory().getPath());
            objM372constructorimpl = fl.u.m372constructorimpl(Integer.valueOf(qi.c.f92156a.b(statFs.getAvailableBytes(), statFs.getTotalBytes())));
        } catch (Throwable th2) {
            fl.u.a aVar2 = fl.u.Companion;
            objM372constructorimpl = fl.u.m372constructorimpl(fl.v.a(th2));
        }
        if (fl.u.m377isFailureimpl(objM372constructorimpl)) {
            objM372constructorimpl = 0;
        }
        return ((Number) objM372constructorimpl).intValue();
    }
}