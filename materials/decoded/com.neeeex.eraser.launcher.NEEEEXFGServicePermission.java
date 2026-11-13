package com.neeeex.eraser.launcher;

import android.app.Activity;
import android.os.Build;
import com.neeeex.eraser.m0;
import p003kotlin.Metadata;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\bÂ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007¨\u0006\b"}, d2 = {"Lcom/neeeex/eraser/launcher/NEEEEXFGServicePermission;", "", "<init>", "()V", "canUseRuntimePermission", "", "activity", "Landroid/app/Activity;", "tool-feature_productionRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
final class NEEEEXFGServicePermission {
    public static final NEEEEXFGServicePermission INSTANCE = new NEEEEXFGServicePermission();

    private NEEEEXFGServicePermission() {
    }

    public final boolean canUseRuntimePermission(Activity activity) {
        "activity" /* decoded XOR */;
        activity.getClass();
        return Build.VERSION.SDK_INT >= 33 && l2.a.checkSelfPermission(activity, "android.permission.POST_NOTIFICATIONS" /* decoded XOR */) != 0;
    }
}