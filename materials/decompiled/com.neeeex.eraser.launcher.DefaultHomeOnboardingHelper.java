package com.neeeex.eraser.launcher;

import android.app.Activity;
import android.app.role.RoleManager;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.pm.ActivityInfo;
import android.content.pm.ResolveInfo;
import android.os.Build;
import com.neeeex.eraser.m0;
import p003kotlin.Metadata;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\f\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u001d\u0010\u000b\u001a\u00020\t2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ\u0015\u0010\r\u001a\u00020\t2\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\r\u0010\u000eJ\u0015\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0010\u0010\u0011J\u0015\u0010\u0012\u001a\u00020\u000f2\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0012\u0010\u0011J\u0015\u0010\u0013\u001a\u00020\t2\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0013\u0010\u000eJ)\u0010\u001a\u001a\u00020\u000f2\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0017\u001a\u00020\u00162\b\b\u0002\u0010\u0019\u001a\u00020\u0018H\u0007¢\u0006\u0004\b\u001a\u0010\u001bR\u0014\u0010\u001c\u001a\u00020\u00188\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u0014\u0010\u001e\u001a\u00020\u00188\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u001e\u0010\u001dR\u0014\u0010\u001f\u001a\u00020\u00188\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u001f\u0010\u001dR\u0014\u0010 \u001a\u00020\u00188\u0002X\u0082T¢\u0006\u0006\n\u0004\b \u0010\u001dR\u0014\u0010!\u001a\u00020\u00188\u0002X\u0082T¢\u0006\u0006\n\u0004\b!\u0010\u001dR\u0014\u0010\"\u001a\u00020\u00188\u0002X\u0082T¢\u0006\u0006\n\u0004\b\"\u0010\u001dR\u0014\u0010#\u001a\u00020\u00188\u0002X\u0082T¢\u0006\u0006\n\u0004\b#\u0010\u001d¨\u0006$"}, d2 = {"Lcom/neeeex/eraser/launcher/DefaultHomeOnboardingHelper;", "", "<init>", "()V", "Landroid/content/Context;", "context", "Landroid/content/SharedPreferences;", "preferences", "(Landroid/content/Context;)Landroid/content/SharedPreferences;", "", "isFirstLaunch", "shouldShow", "(Landroid/content/Context;Z)Z", "isDefaultHome", "(Landroid/content/Context;)Z", "Lfl/m0;", "markOnboardingComplete", "(Landroid/content/Context;)V", "markPromptAfterHotSplash", "consumePromptAfterHotSplash", "Landroid/app/Activity;", "activity", "", "requestCode", "", "source", "requestDefaultHome", "(Landroid/app/Activity;ILjava/lang/String;)V", "SOURCE_NEW_USER_ONBOARDING", "Ljava/lang/String;", "SOURCE_OTHER", "PREFS_NAME", "KEY_ONBOARDING_COMPLETE", "KEY_PROMPT_AFTER_HOT_SPLASH", "SURFACE_ROLE_PICKER", "SURFACE_HOME_SETTINGS", "tool-feature_productionRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class DefaultHomeOnboardingHelper {
    public static final String SOURCE_NEW_USER_ONBOARDING = m0.a("fFbwB76zx8xNXOk6pKHQ2ntd4A==\n", "EjOHWMvAor4=\n");
    public static final String SOURCE_OTHER = m0.a("gYdvXuY=\n", "7vMHO5Re2NU=\n");
    private static final String PREFS_NAME = m0.a("FIGrtEIT2W0nlLG1TSTPaxmSqq9R\n", "eODe2iF7vB8=\n");
    private static final String KEY_ONBOARDING_COMPLETE = m0.a("5q5S5R0ZGj3np2/pEwYOOOy0VQ==\n", "icAwinxrflQ=\n");
    private static final String KEY_PROMPT_AFTER_HOT_SPLASH = m0.a("29sUIG5fAuXN3R4/QUMy8PTaCyF/WDU=\n", "q6l7TR4rXYQ=\n");
    private static final String SURFACE_ROLE_PICKER = m0.a("LWoaoF7QcA40YAQ=\n", "XwV2xQGgGW0=\n");
    private static final String SURFACE_HOME_SETTINGS = m0.a("uEX7Fq1cG6SkQ/gUgQ==\n", "0CqWc/IvftA=\n");
    public static final DefaultHomeOnboardingHelper INSTANCE = new DefaultHomeOnboardingHelper();

    private DefaultHomeOnboardingHelper() {
    }

    private final SharedPreferences preferences(Context context) {
        SharedPreferences sharedPreferences = context.getSharedPreferences(PREFS_NAME, 0);
        String str = KEY_ONBOARDING_COMPLETE;
        if (!sharedPreferences.contains(str)) {
            com.neeeex.eraser.utils.b0 b0Var = com.neeeex.eraser.utils.b0.f66131a;
            if (b0Var.o(m0.a("c+8mvGN/feVy5yaGaWlA4nz4J7BoYH3pcuQm\n", "HYpD2QYHIo0=\n"))) {
                sharedPreferences.edit().putBoolean(str, b0Var.s(m0.a("s53wv2SWevWylfCFboBH8ryK8bNviXr5spbw\n", "3fiV2gHuJZ0=\n"), false)).apply();
            }
        }
        return sharedPreferences;
    }

    public static /* synthetic */ void requestDefaultHome$default(DefaultHomeOnboardingHelper defaultHomeOnboardingHelper, Activity activity, int i10, String str, int i11, Object obj) {
        if ((i11 & 4) != 0) {
            str = SOURCE_OTHER;
        }
        defaultHomeOnboardingHelper.requestDefaultHome(activity, i10, str);
    }

    public final boolean consumePromptAfterHotSplash(Context context) {
        m0.a("kGwPfWPVVg==\n", "8wNhCQatIic=\n");
        context.getClass();
        SharedPreferences sharedPreferencesPreferences = preferences(context);
        String str = KEY_PROMPT_AFTER_HOT_SPLASH;
        if (!sharedPreferencesPreferences.getBoolean(str, false)) {
            return false;
        }
        sharedPreferencesPreferences.edit().remove(str).apply();
        return true;
    }

    public final boolean isDefaultHome(Context context) {
        ActivityInfo activityInfo;
        RoleManager roleManager;
        m0.a("LIAoMOy87w==\n", "T+9GRInEmy4=\n");
        context.getClass();
        if (Build.VERSION.SDK_INT >= 29 && (roleManager = (RoleManager) context.getSystemService(RoleManager.class)) != null && roleManager.isRoleAvailable(m0.a("tpc26qh73Aa2iSK2tX3UTfmxHdWC\n", "1/lSmMcSuCg=\n"))) {
            return roleManager.isRoleHeld(m0.a("Wxqbsmxsz5VbBI/ucWrH3hQ8sI1G\n", "OnT/wAMFq7s=\n"));
        }
        Intent intentAddCategory = new Intent(m0.a("ccD7pUwtZPd5wOuyTTAuuHPa9rhNak2YWeA=\n", "EK6f1yNEANk=\n")).addCategory(m0.a("xx8bQR3iud/PHwtWHP/zkscFGlQd+aTf7j4ydg==\n", "pnF/M3KL3fE=\n"));
        m0.a("bjV2NoNiP1lgI2tdzDh0Fw==\n", "D1ESdeIWWj4=\n");
        intentAddCategory.getClass();
        ResolveInfo resolveInfoResolveActivity = context.getPackageManager().resolveActivity(intentAddCategory, 65536);
        return p003kotlin.jvm.internal.v.c((resolveInfoResolveActivity == null || (activityInfo = resolveInfoResolveActivity.activityInfo) == null) ? null : activityInfo.packageName, context.getPackageName());
    }

    public final void markOnboardingComplete(Context context) {
        m0.a("Xx/wB93x9w==\n", "PHCec7iJg6c=\n");
        context.getClass();
        preferences(context).edit().putBoolean(KEY_ONBOARDING_COMPLETE, true).apply();
    }

    public final void markPromptAfterHotSplash(Context context) {
        m0.a("3gj1e78A+w==\n", "vWebD9p4j/o=\n");
        context.getClass();
        preferences(context).edit().putBoolean(KEY_PROMPT_AFTER_HOT_SPLASH, true).apply();
    }

    public final void requestDefaultHome(Activity activity, int requestCode, String source) {
        RoleManager roleManager;
        m0.a("Df6sxi6i1LM=\n", "bJ3Yr1jLoMo=\n");
        activity.getClass();
        m0.a("NU9SPhRb\n", "RiAnTHc+VpA=\n");
        source.getClass();
        com.neeeex.eraser.ads.e.b0().R0();
        if (Build.VERSION.SDK_INT < 29 || (roleManager = (RoleManager) activity.getSystemService(RoleManager.class)) == null || !roleManager.isRoleAvailable(m0.a("Nm2r+JCRD1M2c7+kjZcHGHlLgMe6\n", "VwPPiv/4a30=\n"))) {
            activity.startActivityForResult(new Intent(m0.a("/zwgRhx6SIjtNzBAGn1L1bAaC3k2TH/jygYNejRA\n", "nlJENHMTLKY=\n")), requestCode);
            DefaultHomeSelectionTracker.INSTANCE.markRequestStarted(source);
            NewUserDesktopFunnelTracker.INSTANCE.reportDefaultHomeSettingsShown(source, SURFACE_HOME_SETTINGS);
        } else {
            activity.startActivityForResult(roleManager.createRequestRoleIntent(m0.a("6d+FdKhAnfTpwZEotUaVv6b5rkuC\n", "iLHhBscp+do=\n")), requestCode);
            DefaultHomeSelectionTracker.INSTANCE.markRequestStarted(source);
            NewUserDesktopFunnelTracker.INSTANCE.reportDefaultHomeSettingsShown(source, SURFACE_ROLE_PICKER);
        }
    }

    public final boolean shouldShow(Context context, boolean isFirstLaunch) {
        m0.a("1IbOthGDlQ==\n", "t+mgwnT74cQ=\n");
        context.getClass();
        return (!isFirstLaunch || preferences(context).getBoolean(KEY_ONBOARDING_COMPLETE, false) || isDefaultHome(context)) ? false : true;
    }

    public final void requestDefaultHome(Activity activity, int i10) {
        m0.a("KJbZT/ZUjso=\n", "SfWtJoA9+rM=\n");
        activity.getClass();
        requestDefaultHome$default(this, activity, i10, null, 4, null);
    }
}