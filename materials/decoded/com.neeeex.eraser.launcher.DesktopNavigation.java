package com.neeeex.eraser.launcher;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import com.neeeex.eraser.m0;

/* JADX INFO: loaded from: classes7.dex */
public final class DesktopNavigation {
    private DesktopNavigation() {
    }

    public static Intent createExplicitIntent(Context context) {
        return Intent.makeMainActivity(new ComponentName(context.getPackageName(), "app.lawnchair.LawnchairLauncher" /* decoded XOR */)).addFlags(872415232);
    }

    public static Intent createIntent(Context context) {
        return (DefaultHomeOnboardingHelper.INSTANCE.isDefaultHome(context) ? new Intent("android.intent.action.MAIN" /* decoded XOR */).addCategory("android.intent.category.HOME" /* decoded XOR */).setPackage(context.getPackageName()) : createExplicitIntent(context)).addFlags(872415232);
    }

    public static boolean isDesktopIntent(Context context, Intent intent) {
        ComponentName component = intent.getComponent();
        if (component != null) {
            return context.getPackageName().equals(component.getPackageName()) && "app.lawnchair.LawnchairLauncher" /* decoded XOR */.equals(component.getClassName());
        }
        return context.getPackageName().equals(intent.getPackage()) && "android.intent.action.MAIN" /* decoded XOR */.equals(intent.getAction()) && intent.hasCategory("android.intent.category.HOME" /* decoded XOR */);
    }
}