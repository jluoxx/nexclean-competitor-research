package com.neeeex.eraser.utils;

import android.app.ActivityManager;
import android.app.KeyguardManager;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.os.Build;
import android.os.Environment;
import android.os.PowerManager;
import com.neeeex.eraser.m0;
import java.io.File;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import p003kotlin.text.k0;

/* JADX INFO: loaded from: classes7.dex */
public final class c0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final c0 f66142a = new c0();

    public final boolean a(Context context) {
        "context" /* decoded XOR */;
        context.getClass();
        return Build.VERSION.SDK_INT >= 30 ? Environment.isExternalStorageManager() : j(context);
    }

    public final fl.t b(Context context, String str) {
        "context" /* decoded XOR */;
        context.getClass();
        "packageName" /* decoded XOR */;
        str.getClass();
        try {
            ApplicationInfo applicationInfo = context.getPackageManager().getPackageInfo(str, 0).applicationInfo;
            applicationInfo.getClass();
            return fl.z.a(context.getPackageManager().getApplicationLabel(applicationInfo).toString(), Long.valueOf(new File(applicationInfo.sourceDir).length()));
        } catch (Exception unused) {
            return fl.z.a("", 0L);
        }
    }

    public final boolean c(Context context) {
        List<ActivityManager.RunningAppProcessInfo> runningAppProcesses;
        "context" /* decoded XOR */;
        context.getClass();
        ActivityManager activityManager = (ActivityManager) context.getSystemService(ActivityManager.class);
        if (activityManager == null || (runningAppProcesses = activityManager.getRunningAppProcesses()) == null) {
            return false;
        }
        String packageName = context.getPackageName();
        List<ActivityManager.RunningAppProcessInfo> list = runningAppProcesses;
        if ((list instanceof Collection) && list.isEmpty()) {
            return false;
        }
        for (ActivityManager.RunningAppProcessInfo runningAppProcessInfo : list) {
            if (p003kotlin.jvm.internal.v.c(runningAppProcessInfo.processName, packageName) && runningAppProcessInfo.importance == 100) {
                return true;
            }
        }
        return false;
    }

    public final boolean d() {
        try {
            List listP = gl.w.p(Build.BRAND, Build.MANUFACTURER);
            if (!(listP instanceof Collection) || !listP.isEmpty()) {
                Iterator it = listP.iterator();
                while (it.hasNext()) {
                    if (p003kotlin.text.e0.F((String) it.next(), "xiaomi" /* decoded XOR */, true)) {
                    }
                }
            }
            String str = Build.MODEL;
            "MODEL" /* decoded XOR */;
            str.getClass();
            return k0.a0(str, "MI 2" /* decoded XOR */, true);
        } catch (Exception unused) {
        }
    }

    public final boolean e() {
        Iterator it = to.s.t(Build.MANUFACTURER, Build.BRAND).iterator();
        while (it.hasNext()) {
            if (p003kotlin.text.e0.F((String) it.next(), "Samsung" /* decoded XOR */, true)) {
            }
        }
        String str = Build.MODEL;
        "MODEL" /* decoded XOR */;
        str.getClass();
        return p003kotlin.text.e0.U(str, "SM-" /* decoded XOR */, false, 2, null);
    }

    public final boolean f(Context context) {
        "context" /* decoded XOR */;
        context.getClass();
        Object systemService = context.getSystemService("keyguard" /* decoded XOR */);
        KeyguardManager keyguardManager = systemService instanceof KeyguardManager ? (KeyguardManager) systemService : null;
        if (keyguardManager != null) {
            return keyguardManager.inKeyguardRestrictedInputMode();
        }
        return false;
    }

    public final boolean g(Context context) {
        "context" /* decoded XOR */;
        context.getClass();
        Object systemService = context.getSystemService("power" /* decoded XOR */);
        PowerManager powerManager = systemService instanceof PowerManager ? (PowerManager) systemService : null;
        if (powerManager != null) {
            return powerManager.isInteractive();
        }
        return false;
    }

    public final boolean h() {
        return com.neeeex.eraser.ads.e.b0().o0();
    }

    public final boolean i(Context context) {
        "context" /* decoded XOR */;
        context.getClass();
        return h() || !g(context) || f(context) || !com.neeeex.eraser.module.report.bytedance.a.k();
    }

    public final boolean j(Context context) {
        String[] strArr = {"android.permission.READ_EXTERNAL_STORAGE" /* decoded XOR */, "android.permission.WRITE_EXTERNAL_STORAGE" /* decoded XOR */};
        for (int i10 = 0; i10 < 2; i10++) {
            if (l2.a.checkSelfPermission(context, strArr[i10]) != 0) {
                return false;
            }
        }
        return true;
    }
}