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
        m0.a("6TYarSBpMg==\n", "ill02UURRoQ=\n");
        context.getClass();
        return Build.VERSION.SDK_INT >= 30 ? Environment.isExternalStorageManager() : j(context);
    }

    public final fl.t b(Context context, String str) {
        m0.a("V6kmeBu2aQ==\n", "NMZIDH7OHVQ=\n");
        context.getClass();
        m0.a("1Ca5SjzxvyHFKr8=\n", "pEfaIV2W2m8=\n");
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
        m0.a("J1xwAGQSIw==\n", "RDMedAFqVxk=\n");
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
                    if (p003kotlin.text.e0.F((String) it.next(), m0.a("8/5lp0pw\n", "i5cEyCcZus8=\n"), true)) {
                    }
                }
            }
            String str = Build.MODEL;
            m0.a("gJhwefw=\n", "zdc0PLAPqqs=\n");
            str.getClass();
            return k0.a0(str, m0.a("VZou+w==\n", "GNMOyTQYALw=\n"), true);
        } catch (Exception unused) {
        }
    }

    public final boolean e() {
        Iterator it = to.s.t(Build.MANUFACTURER, Build.BRAND).iterator();
        while (it.hasNext()) {
            if (p003kotlin.text.e0.F((String) it.next(), m0.a("j4Fz3wHhHw==\n", "3OAerHSPeCI=\n"), true)) {
            }
        }
        String str = Build.MODEL;
        m0.a("3y1rOAo=\n", "kmIvfUblZAg=\n");
        str.getClass();
        return p003kotlin.text.e0.U(str, m0.a("x/zC\n", "lLHvt09XKGA=\n"), false, 2, null);
    }

    public final boolean f(Context context) {
        m0.a("Ya2/btO1bg==\n", "AsLRGrbNGsw=\n");
        context.getClass();
        Object systemService = context.getSystemService(m0.a("92+HSnCWOKA=\n", "nAr+LQX3SsQ=\n"));
        KeyguardManager keyguardManager = systemService instanceof KeyguardManager ? (KeyguardManager) systemService : null;
        if (keyguardManager != null) {
            return keyguardManager.inKeyguardRestrictedInputMode();
        }
        return false;
    }

    public final boolean g(Context context) {
        m0.a("cFOWM8DGAQ==\n", "Ezz4R6W+dXE=\n");
        context.getClass();
        Object systemService = context.getSystemService(m0.a("A3eaZUE=\n", "cxjtADMb694=\n"));
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
        m0.a("DjPSJpOo/g==\n", "bVy8UvbQihQ=\n");
        context.getClass();
        return h() || !g(context) || f(context) || !com.neeeex.eraser.module.report.bytedance.a.k();
    }

    public final boolean j(Context context) {
        String[] strArr = {m0.a("Vu+9Vy54OntH5KtIKGItPFjv93cEUBoKctmNYBNfHxlo0o1qE1AZEA==\n", "N4HZJUERXlU=\n"), m0.a("Mq4RcmVEnWAjpQdtY16KJzyuW1dYZK0LDIUtVE9/tw8fnyZURX+4CRY=\n", "U8B1AAot+U4=\n")};
        for (int i10 = 0; i10 < 2; i10++) {
            if (l2.a.checkSelfPermission(context, strArr[i10]) != 0) {
                return false;
            }
        }
        return true;
    }
}