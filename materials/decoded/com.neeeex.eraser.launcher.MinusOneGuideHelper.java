package com.neeeex.eraser.launcher;

import android.content.Context;
import android.content.SharedPreferences;
import com.neeeex.eraser.m0;
import p003kotlin.Metadata;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0006\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0015\u0010\n\u001a\u00020\t2\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\n\u0010\u000bJ\u0015\u0010\f\u001a\u00020\t2\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\f\u0010\u000bJ\u0015\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u000e\u0010\u000fJ\u0015\u0010\u0010\u001a\u00020\r2\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0010\u0010\u000fJ\u0015\u0010\u0011\u001a\u00020\t2\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0011\u0010\u000bR\u0014\u0010\u0013\u001a\u00020\u00128\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0015\u001a\u00020\u00128\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0015\u0010\u0014R\u0014\u0010\u0016\u001a\u00020\u00128\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0016\u0010\u0014R\u0014\u0010\u0017\u001a\u00020\u00128\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0017\u0010\u0014¨\u0006\u0018"}, d2 = {"Lcom/neeeex/eraser/launcher/MinusOneGuideHelper;", "", "<init>", "()V", "Landroid/content/Context;", "context", "Landroid/content/SharedPreferences;", "preferences", "(Landroid/content/Context;)Landroid/content/SharedPreferences;", "Lfl/m0;", "markPendingForNewUser", "(Landroid/content/Context;)V", "markReadyAfterStartup", "", "isPending", "(Landroid/content/Context;)Z", "shouldShow", "markShown", "", "PREFS_NAME", "Ljava/lang/String;", "KEY_GUIDE_PENDING", "KEY_GUIDE_READY", "KEY_GUIDE_SHOWN", "tool-feature_productionRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class MinusOneGuideHelper {
    private static final String PREFS_NAME = "launcher_tool_startup" /* decoded XOR */;
    private static final String KEY_GUIDE_PENDING = "minus_one_guide_pending" /* decoded XOR */;
    private static final String KEY_GUIDE_READY = "minus_one_guide_ready" /* decoded XOR */;
    private static final String KEY_GUIDE_SHOWN = "minus_one_guide_shown" /* decoded XOR */;
    public static final MinusOneGuideHelper INSTANCE = new MinusOneGuideHelper();

    private MinusOneGuideHelper() {
    }

    private final SharedPreferences preferences(Context context) {
        boolean z10 = false;
        SharedPreferences sharedPreferences = context.getSharedPreferences(PREFS_NAME, 0);
        String str = KEY_GUIDE_SHOWN;
        if (!sharedPreferences.contains(str)) {
            com.neeeex.eraser.utils.b0 b0Var = com.neeeex.eraser.utils.b0.f66131a;
            boolean zS = b0Var.s("neeeex_panel_discovery_done" /* decoded XOR */, false);
            boolean zS2 = b0Var.s("neeeex_panel_discovery_pending" /* decoded XOR */, false);
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
        "context" /* decoded XOR */;
        context.getClass();
        SharedPreferences sharedPreferencesPreferences = preferences(context);
        return sharedPreferencesPreferences.getBoolean(KEY_GUIDE_PENDING, false) && !sharedPreferencesPreferences.getBoolean(KEY_GUIDE_SHOWN, false);
    }

    public final void markPendingForNewUser(Context context) {
        "context" /* decoded XOR */;
        context.getClass();
        SharedPreferences sharedPreferencesPreferences = preferences(context);
        if (sharedPreferencesPreferences.getBoolean(KEY_GUIDE_SHOWN, false)) {
            return;
        }
        sharedPreferencesPreferences.edit().putBoolean(KEY_GUIDE_PENDING, true).putBoolean(KEY_GUIDE_READY, false).apply();
    }

    public final void markReadyAfterStartup(Context context) {
        "context" /* decoded XOR */;
        context.getClass();
        SharedPreferences sharedPreferencesPreferences = preferences(context);
        if (!sharedPreferencesPreferences.getBoolean(KEY_GUIDE_PENDING, false) || sharedPreferencesPreferences.getBoolean(KEY_GUIDE_SHOWN, false)) {
            return;
        }
        sharedPreferencesPreferences.edit().putBoolean(KEY_GUIDE_READY, true).apply();
    }

    public final void markShown(Context context) {
        "context" /* decoded XOR */;
        context.getClass();
        preferences(context).edit().putBoolean(KEY_GUIDE_PENDING, false).putBoolean(KEY_GUIDE_READY, false).putBoolean(KEY_GUIDE_SHOWN, true).apply();
    }

    public final boolean shouldShow(Context context) {
        "context" /* decoded XOR */;
        context.getClass();
        SharedPreferences sharedPreferencesPreferences = preferences(context);
        return sharedPreferencesPreferences.getBoolean(KEY_GUIDE_PENDING, false) && sharedPreferencesPreferences.getBoolean(KEY_GUIDE_READY, false) && !sharedPreferencesPreferences.getBoolean(KEY_GUIDE_SHOWN, false);
    }
}