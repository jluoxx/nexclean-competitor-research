package com.neeeex.eraser.launcher.startup;

import android.app.role.RoleManager;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.os.Build;
import com.neeeex.eraser.launcher.DefaultHomeSelectionTracker;
import ni.i;
import p003kotlin.Metadata;
import p003kotlin.jvm.internal.v;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0004\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u001f\u0010\u000b\u001a\n \n*\u0004\u0018\u00010\t0\t2\u0006\u0010\b\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u000e\u001a\u00020\r2\u0006\u0010\b\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0011\u001a\u00020\u0010H\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0014\u001a\u00020\u00132\u0006\u0010\b\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u0015\u0010\u0016\u001a\u00020\u00132\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\u0016\u0010\u0015J\u0015\u0010\u0017\u001a\u00020\u00132\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\u0017\u0010\u0015R\u0014\u0010\u0018\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u0014\u0010\u001a\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u001a\u0010\u0019R\u0014\u0010\u001c\u001a\u00020\u001b8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u0014\u0010\u001e\u001a\u00020\u001b8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u001e\u0010\u001d¨\u0006\u001f"}, d2 = {"Lcom/neeeex/eraser/launcher/startup/HomeResolverPromptController;", "", "<init>", "()V", "", "promptIntervalMs", "()J", "Landroid/content/Context;", "context", "Landroid/content/SharedPreferences;", "kotlin.jvm.PlatformType", "preferences", "(Landroid/content/Context;)Landroid/content/SharedPreferences;", "", "isCurrentAppDefaultHome", "(Landroid/content/Context;)Z", "Landroid/content/Intent;", "homeIntent", "()Landroid/content/Intent;", "Lfl/m0;", "launchHomeIntent", "(Landroid/content/Context;)V", "handleHomeSignal", "promptForHomeResolution", "TEST_PROMPT_INTERVAL_MS", "J", "PRODUCTION_PROMPT_INTERVAL_MS", "", "LAST_PROMPT_TIME_KEY", "Ljava/lang/String;", "SOURCE_OTHER", "launcher_lawnWithQuickstepProductionRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class HomeResolverPromptController {
    public static final int $stable = 0;
    public static final HomeResolverPromptController INSTANCE = new HomeResolverPromptController();
    private static final String LAST_PROMPT_TIME_KEY = "last_pre_time";
    private static final long PRODUCTION_PROMPT_INTERVAL_MS = 28800000;
    private static final String SOURCE_OTHER = "other";
    private static final long TEST_PROMPT_INTERVAL_MS = 10000;

    private HomeResolverPromptController() {
    }

    private final Intent homeIntent() {
        Intent intentAddCategory = new Intent("android.intent.action.MAIN").addCategory("android.intent.category.HOME");
        intentAddCategory.getClass();
        return intentAddCategory;
    }

    private final boolean isCurrentAppDefaultHome(Context context) {
        ActivityInfo activityInfo;
        if (Build.VERSION.SDK_INT < 29) {
            ResolveInfo resolveInfoResolveActivity = context.getPackageManager().resolveActivity(homeIntent(), 65536);
            return v.c((resolveInfoResolveActivity == null || (activityInfo = resolveInfoResolveActivity.activityInfo) == null) ? null : activityInfo.packageName, context.getPackageName());
        }
        RoleManager roleManager = (RoleManager) context.getSystemService(RoleManager.class);
        if (roleManager == null) {
            return false;
        }
        return !roleManager.isRoleAvailable("android.app.role.HOME") || roleManager.isRoleHeld("android.app.role.HOME");
    }

    private final void launchHomeIntent(Context context) {
        Intent intentHomeIntent = homeIntent();
        intentHomeIntent.setFlags(268435456);
        context.startActivity(intentHomeIntent);
        DefaultHomeSelectionTracker.INSTANCE.markRequestStarted(SOURCE_OTHER);
    }

    private final SharedPreferences preferences(Context context) {
        return context.getSharedPreferences(context.getPackageName(), 0);
    }

    private final long promptIntervalMs() {
        return PRODUCTION_PROMPT_INTERVAL_MS;
    }

    public final void handleHomeSignal(Context context) {
        context.getClass();
        if (i.f89495a.v()) {
            long jCurrentTimeMillis = System.currentTimeMillis();
            if (jCurrentTimeMillis - preferences(context).getLong(LAST_PROMPT_TIME_KEY, 0L) < promptIntervalMs()) {
                return;
            }
            preferences(context).edit().putLong(LAST_PROMPT_TIME_KEY, jCurrentTimeMillis).apply();
            promptForHomeResolution(context);
        }
    }

    public final void promptForHomeResolution(Context context) {
        context.getClass();
        if (!com.neeeex.eraser.module.report.bytedance.a.k() || isCurrentAppDefaultHome(context)) {
            return;
        }
        PackageManager packageManager = context.getPackageManager();
        ComponentName componentName = new ComponentName(context, (Class<?>) HomeResolverPromptActivity.class);
        try {
            packageManager.setComponentEnabledSetting(componentName, 1, 1);
            launchHomeIntent(context);
        } finally {
            packageManager.setComponentEnabledSetting(componentName, 0, 1);
        }
    }
}