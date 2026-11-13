package com.neeeex.eraser.launcher;

import p003kotlin.Metadata;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\f\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\r\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0003J\r\u0010\u0006\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0003J\r\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ9\u0010\u000f\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\u00072\u0006\u0010\f\u001a\u00020\u00072\b\b\u0002\u0010\r\u001a\u00020\u00072\b\b\u0002\u0010\u000e\u001a\u00020\u0007¢\u0006\u0004\b\u000f\u0010\u0010R\u0016\u0010\u0011\u001a\u00020\u00078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012¨\u0006\u0013"}, d2 = {"Lcom/neeeex/eraser/launcher/DesktopRoutePolicy;", "", "<init>", "()V", "Lfl/m0;", "onDesktopStarted", "onDesktopStopped", "", "isDesktopStarted", "()Z", "hasPushOrExternalFile", "desktopWasStartedAtLaunch", "isDefaultHome", "isSplashRetain", "openDesktopAfterStartup", "shouldRouteThroughMainActivity", "(ZZZZZ)Z", "desktopStarted", "Z", "tool-feature_productionRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class DesktopRoutePolicy {
    public static final DesktopRoutePolicy INSTANCE = new DesktopRoutePolicy();
    private static volatile boolean desktopStarted;

    private DesktopRoutePolicy() {
    }

    public static /* synthetic */ boolean shouldRouteThroughMainActivity$default(DesktopRoutePolicy desktopRoutePolicy, boolean z10, boolean z11, boolean z12, boolean z13, boolean z14, int i10, Object obj) {
        if ((i10 & 8) != 0) {
            z13 = false;
        }
        if ((i10 & 16) != 0) {
            z14 = false;
        }
        return desktopRoutePolicy.shouldRouteThroughMainActivity(z10, z11, z12, z13, z14);
    }

    public final boolean isDesktopStarted() {
        return desktopStarted;
    }

    public final void onDesktopStarted() {
        desktopStarted = true;
    }

    public final void onDesktopStopped() {
        desktopStarted = false;
    }

    public final boolean shouldRouteThroughMainActivity(boolean hasPushOrExternalFile, boolean desktopWasStartedAtLaunch, boolean isDefaultHome, boolean isSplashRetain, boolean openDesktopAfterStartup) {
        if (isSplashRetain) {
            return !openDesktopAfterStartup;
        }
        if (hasPushOrExternalFile) {
            return desktopWasStartedAtLaunch || isDefaultHome;
        }
        return false;
    }
}