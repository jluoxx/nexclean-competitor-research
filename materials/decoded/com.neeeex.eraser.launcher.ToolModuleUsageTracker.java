package com.neeeex.eraser.launcher;

import android.content.Context;
import com.neeeex.eraser.m0;
import p003kotlin.Metadata;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nJ\u000e\u0010\u000b\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nJ\u0018\u0010\f\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\u0005H\u0002R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u000e"}, d2 = {"Lcom/neeeex/eraser/launcher/ToolModuleUsageTracker;", "", "<init>", "()V", "SCENE_TOOL_HOME", "", "SCENE_MINUS_ONE", "reportToolHome", "", "context", "Landroid/content/Context;", "reportMinusOne", "report", "scene", "tool-feature_productionRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class ToolModuleUsageTracker {
    private static final String SCENE_TOOL_HOME = "tool_home" /* decoded XOR */;
    private static final String SCENE_MINUS_ONE = "minus_one" /* decoded XOR */;
    public static final ToolModuleUsageTracker INSTANCE = new ToolModuleUsageTracker();

    private ToolModuleUsageTracker() {
    }

    private final boolean report(Context context, String scene) {
        Context applicationContext = context.getApplicationContext();
        com.neeeex.eraser.y yVar = applicationContext instanceof com.neeeex.eraser.y ? (com.neeeex.eraser.y) applicationContext : null;
        if (yVar == null) {
            return false;
        }
        if (p003kotlin.jvm.internal.v.c(scene, SCENE_MINUS_ONE)) {
            DefaultHomeStatusTracker.INSTANCE.reportLauncher(context);
        }
        yVar.ensureReportingInitialized();
        LauncherReport.INSTANCE.reportToolModuleUse(scene);
        return true;
    }

    public final boolean reportMinusOne(Context context) {
        "context" /* decoded XOR */;
        context.getClass();
        return report(context, SCENE_MINUS_ONE);
    }

    public final boolean reportToolHome(Context context) {
        "context" /* decoded XOR */;
        context.getClass();
        return report(context, SCENE_TOOL_HOME);
    }
}