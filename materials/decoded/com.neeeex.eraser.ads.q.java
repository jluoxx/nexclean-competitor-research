package com.neeeex.eraser.ads;

import android.app.Activity;
import android.app.ActivityManager;
import android.content.ComponentName;
import android.content.Intent;
import com.neeeex.eraser.launcher.DesktopNavigation;
import com.neeeex.eraser.m0;

/* JADX INFO: loaded from: classes7.dex */
public final class q {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final String f64987d = "AdRetainReturn" /* decoded XOR */;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final String f64988e = "ad_retain_return_intent" /* decoded XOR */;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final String f64989f = "ad_retain_return_task_id" /* decoded XOR */;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Intent f64990a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f64991b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f64992c = -1;

    public q(Intent intent, int i10) {
        this.f64990a = new Intent(intent);
        this.f64991b = i10;
    }

    public static q a(Activity activity) {
        Intent intent = activity.getIntent() == null ? new Intent() : new Intent(activity.getIntent());
        intent.setComponent(activity.getComponentName());
        return new q(intent, activity.getTaskId());
    }

    public static q b(Activity activity) {
        Intent intent = activity.getIntent();
        if (intent == null) {
            return null;
        }
        try {
            intent.setExtrasClassLoader(activity.getClassLoader());
            Intent intent2 = (Intent) intent.getParcelableExtra(f64988e);
            ComponentName component = intent2 == null ? null : intent2.getComponent();
            if (component != null && activity.getPackageName().equals(component.getPackageName())) {
                return new q(intent2, intent.getIntExtra(f64989f, -1));
            }
            return null;
        } catch (RuntimeException unused) {
            "Cannot read notification return target" /* decoded XOR */;
            return null;
        }
    }

    public boolean c(Activity activity) {
        Intent intent;
        String str;
        String str2;
        boolean zIsDesktopIntent = DesktopNavigation.isDesktopIntent(activity, this.f64990a);
        if (zIsDesktopIntent) {
            intent = DesktopNavigation.createIntent(activity);
            if (this.f64990a.getExtras() != null) {
                intent.putExtras(this.f64990a.getExtras());
            }
        } else {
            intent = new Intent(this.f64990a);
        }
        intent.setFlags((this.f64990a.getFlags() & 195) | 537067520);
        ActivityManager activityManager = (ActivityManager) activity.getSystemService("activity" /* decoded XOR */);
        if (!zIsDesktopIntent && activityManager != null && this.f64991b >= 0) {
            try {
                for (ActivityManager.AppTask appTask : activityManager.getAppTasks()) {
                    if (appTask.getTaskInfo().id == this.f64991b) {
                        appTask.startActivity(activity, intent, null);
                        this.f64992c = this.f64991b;
                        "Restore content in task " /* decoded XOR */;
                        return true;
                    }
                }
            } catch (LinkageError | RuntimeException unused) {
                "Cannot restore original content task " /* decoded XOR */;
            }
        }
        try {
            intent.addFlags(268435456);
            activity.startActivity(intent);
            if (zIsDesktopIntent) {
                str = "SgOeZC/54uZ8A557NOT35mwHnns=\n";
                str2 = "GGbtEECLh8Y=\n";
            } else {
                str = "lD4uAHbmW2rmNSIGeuFGbKcvJB19p11qsi4/HDPzTn2hPjk=\n";
                str2 = "xltNchOHLw8=\n";
            }
            m0.a(str, str2);
            return true;
        } catch (RuntimeException unused2) {
            "Cannot launch notification return target" /* decoded XOR */;
            return false;
        }
    }

    public int d() {
        return this.f64992c;
    }

    public void e(Intent intent) {
        intent.putExtra(f64988e, new Intent(this.f64990a));
        intent.putExtra(f64989f, this.f64991b);
    }
}