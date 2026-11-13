package com.neeeex.eraser.launcher;

import android.content.Context;
import android.content.SharedPreferences;
import com.neeeex.eraser.m0;
import p003kotlin.Metadata;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0006\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0015\u0010\n\u001a\u00020\t2\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\n\u0010\u000bJ\u0015\u0010\f\u001a\u00020\t2\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\f\u0010\u000bJ\u0015\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u000e\u0010\u000fJ\u0015\u0010\u0010\u001a\u00020\r2\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0010\u0010\u000fJ\u0015\u0010\u0011\u001a\u00020\t2\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0011\u0010\u000bR\u0014\u0010\u0013\u001a\u00020\u00128\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0015\u001a\u00020\u00128\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0015\u0010\u0014R\u0014\u0010\u0016\u001a\u00020\u00128\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0016\u0010\u0014R\u0014\u0010\u0017\u001a\u00020\u00128\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0017\u0010\u0014¨\u0006\u0018"}, d2 = {"Lcom/neeeex/eraser/launcher/MinusOneGuideHelper;", "", "<init>", "()V", "Landroid/content/Context;", "context", "Landroid/content/SharedPreferences;", "preferences", "(Landroid/content/Context;)Landroid/content/SharedPreferences;", "Lfl/m0;", "markPendingForNewUser", "(Landroid/content/Context;)V", "markReadyAfterStartup", "", "isPending", "(Landroid/content/Context;)Z", "shouldShow", "markShown", "", "PREFS_NAME", "Ljava/lang/String;", "KEY_GUIDE_PENDING", "KEY_GUIDE_READY", "KEY_GUIDE_SHOWN", "tool-feature_productionRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class MinusOneGuideHelper {
    private static final String PREFS_NAME = m0.a("AozhXYNOjAsxmftcjHmaDQ+f4EaQ\n", "bu2UM+Am6Xk=\n");
    private static final String KEY_GUIDE_PENDING = m0.a("PxPc+snebnY3JdX60+VkRyIf3OvT72Y=\n", "Unqyj7qBARg=\n");
    private static final String KEY_GUIDE_READY = m0.a("zbznkEmYMrLFiu6QU6M4g9Kw6IFD\n", "oNWJ5TrHXdw=\n");
    private static final String KEY_GUIDE_SHOWN = m0.a("6Q6MTxIXcUnhOIVPCCx7ePcPjU0P\n", "hGfiOmFIHic=\n");
    public static final MinusOneGuideHelper INSTANCE = new MinusOneGuideHelper();

    private MinusOneGuideHelper() {
    }

    private final SharedPreferences preferences(Context context) {
        boolean z10 = false;
        SharedPreferences sharedPreferences = context.getSharedPreferences(PREFS_NAME, 0);
        String str = KEY_GUIDE_SHOWN;
        if (!sharedPreferences.contains(str)) {
            com.neeeex.eraser.utils.b0 b0Var = com.neeeex.eraser.utils.b0.f66131a;
            boolean zS = b0Var.s(m0.a("Xp3JTjPuEQpRlslHCfInCVOX2k4k7xEeX5bJ\n", "MPisK1aWTno=\n"), false);
            boolean zS2 = b0Var.s(m0.a("yoe5X8wZRvfFjLlW9gVw9MeNql/bGEb3wYy4U8cG\n", "pOLcOqlhGYc=\n"), false);
            SharedPreferences.Editor editorPutBoolean = sharedPreferences.edit().putBoolean(str, zS).putBoolean(KEY_GUIDE_PENDING, zS2 && !zS);
            String str2 = KEY_GUIDE_READY;
            if (zS2 && !zS) {
                z10 = true;
            }
            editorPutBoolean.putBoolean(str2, z10).apply();
        }
        return sharedPreferences;
    }

    public final boolean isPending(Context context) {
        m0.a("CAtSAWdkSw==\n", "a2Q8dQIcP/4=\n");
        context.getClass();
        SharedPreferences sharedPreferencesPreferences = preferences(context);
        return sharedPreferencesPreferences.getBoolean(KEY_GUIDE_PENDING, false) && !sharedPreferencesPreferences.getBoolean(KEY_GUIDE_SHOWN, false);
    }

    public final void markPendingForNewUser(Context context) {
        m0.a("cBWOXowOYw==\n", "E3rgKul2F4Q=\n");
        context.getClass();
        SharedPreferences sharedPreferencesPreferences = preferences(context);
        if (sharedPreferencesPreferences.getBoolean(KEY_GUIDE_SHOWN, false)) {
            return;
        }
        sharedPreferencesPreferences.edit().putBoolean(KEY_GUIDE_PENDING, true).putBoolean(KEY_GUIDE_READY, false).apply();
    }

    public final void markReadyAfterStartup(Context context) {
        m0.a("1MUxK6g8rw==\n", "t6pfX81E2+o=\n");
        context.getClass();
        SharedPreferences sharedPreferencesPreferences = preferences(context);
        if (!sharedPreferencesPreferences.getBoolean(KEY_GUIDE_PENDING, false) || sharedPreferencesPreferences.getBoolean(KEY_GUIDE_SHOWN, false)) {
            return;
        }
        sharedPreferencesPreferences.edit().putBoolean(KEY_GUIDE_READY, true).apply();
    }

    public final void markShown(Context context) {
        m0.a("40keUwb6Ow==\n", "gCZwJ2OCT/U=\n");
        context.getClass();
        preferences(context).edit().putBoolean(KEY_GUIDE_PENDING, false).putBoolean(KEY_GUIDE_READY, false).putBoolean(KEY_GUIDE_SHOWN, true).apply();
    }

    public final boolean shouldShow(Context context) {
        m0.a("IF3MTT+NMw==\n", "QzKiOVr1R7w=\n");
        context.getClass();
        SharedPreferences sharedPreferencesPreferences = preferences(context);
        return sharedPreferencesPreferences.getBoolean(KEY_GUIDE_PENDING, false) && sharedPreferencesPreferences.getBoolean(KEY_GUIDE_READY, false) && !sharedPreferencesPreferences.getBoolean(KEY_GUIDE_SHOWN, false);
    }
}