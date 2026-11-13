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
        return Intent.makeMainActivity(new ComponentName(context.getPackageName(), m0.a("jYlcPb3xTpyPkU16o751k5uXT3uw+Uu+jYxCcLn1Sw==\n", "7PksE9GQOfI=\n"))).addFlags(872415232);
    }

    public static Intent createIntent(Context context) {
        return (DefaultHomeOnboardingHelper.INSTANCE.isDefaultHome(context) ? new Intent(m0.a("nX8qplP6kYCVfzqxUufbz59lJ7tSvbjvtV8=\n", "/BFO1DyT9a4=\n")).addCategory(m0.a("c5o1Ojc5YtJ7miUtNiQon3OANC83In/SWrscDQ==\n", "EvRRSFhQBvw=\n")).setPackage(context.getPackageName()) : createExplicitIntent(context)).addFlags(872415232);
    }

    public static boolean isDesktopIntent(Context context, Intent intent) {
        ComponentName component = intent.getComponent();
        if (component != null) {
            return context.getPackageName().equals(component.getPackageName()) && m0.a("oQ3PCoTiTc2jFd5Nmq12wrcT3EyJ6kjvoQjRR4DmSA==\n", "wH2/JOiDOqM=\n").equals(component.getClassName());
        }
        return context.getPackageName().equals(intent.getPackage()) && m0.a("mNBWSjt0Iy6Q0EZdOmlpYZrKW1c6MwpBsPA=\n", "+b4yOFQdRwA=\n").equals(intent.getAction()) && intent.hasCategory(m0.a("rk4/Nfq6oImmTi8i+6fqxK5UPiD6ob2Jh28WAg==\n", "zyBbR5XTxKc=\n"));
    }
}