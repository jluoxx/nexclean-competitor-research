package hj;

import android.app.Application;
import android.text.TextUtils;
import com.tencent.mmkv.MMKV;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes7.dex */
public final class s1 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static volatile MMKV f83695b;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final s1 f83694a = new s1();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final AtomicBoolean f83696c = new AtomicBoolean(false);

    public static MMKV a() {
        if (f83695b == null) {
            synchronized (s1.class) {
                try {
                    if (f83695b == null) {
                        s1 s1Var = f83694a;
                        s1Var.getClass();
                        if (!f83696c.get()) {
                            s1Var.c();
                        }
                        f83695b = MMKV.y("pp_mmkv");
                    }
                    fl.m0 m0Var = fl.m0.f80959a;
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        return f83695b;
    }

    public final String b(String str, String str2) {
        if (!TextUtils.isEmpty(str)) {
            try {
                MMKV mmkvA = a();
                mmkvA.getClass();
                return mmkvA.g(str, str2);
            } catch (Throwable unused) {
            }
        }
        return str2;
    }

    public final void c() {
        Application applicationC = ij.a.c();
        if (applicationC == null || !f83696c.compareAndSet(false, true)) {
            return;
        }
        try {
            MMKV.t(applicationC);
        } catch (Throwable unused) {
            f83696c.set(false);
        }
    }

    public final boolean d(String str, String str2) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        try {
            MMKV mmkvA = a();
            mmkvA.getClass();
            return mmkvA.q(str, str2);
        } catch (Throwable unused) {
            return false;
        }
    }
}