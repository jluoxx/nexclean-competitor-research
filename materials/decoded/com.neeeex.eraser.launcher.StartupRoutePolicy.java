package com.neeeex.eraser.launcher;

import com.neeeex.eraser.m0;
import p003kotlin.Metadata;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\bÆ\u0002\u0018\u00002\u00020\u0001:\u0003\u0010\u0011\u0012B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001e\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0005J\u0016\u0010\t\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\n\u001a\u00020\u0005J\u0016\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0005¨\u0006\u0013"}, d2 = {"Lcom/neeeex/eraser/launcher/StartupRoutePolicy;", "", "<init>", "()V", "shouldResumeOnboardingFromHome", "", "requiredFlowComplete", "onboardingInProgress", "isDefaultHome", "shouldScanDevice", "openSceneAdShown", "resolve", "Lcom/neeeex/eraser/launcher/StartupRoutePolicy$Route;", "entry", "Lcom/neeeex/eraser/launcher/StartupRoutePolicy$Entry;", "toolRuntimeReady", "Entry", "Destination", "Route", "tool-feature_productionRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class StartupRoutePolicy {
    public static final StartupRoutePolicy INSTANCE = new StartupRoutePolicy();

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0007\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007¨\u0006\b"}, d2 = {"Lcom/neeeex/eraser/launcher/StartupRoutePolicy$Destination;", "", "<init>", "(Ljava/lang/String;I)V", "DESKTOP", "MINUS_ONE", "TOOL", "NOTIFICATION_TARGET", "tool-feature_productionRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public enum Destination {
        DESKTOP,
        MINUS_ONE,
        TOOL,
        NOTIFICATION_TARGET;

        private static final /* synthetic */ ml.a $ENTRIES = ml.b.a(values());

        public static ml.a getEntries() {
            return $ENTRIES;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0007\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007¨\u0006\b"}, d2 = {"Lcom/neeeex/eraser/launcher/StartupRoutePolicy$Entry;", "", "<init>", "(Ljava/lang/String;I)V", "HOME", "EXTERNAL_ICON", "INTERNAL_TOOL", "NOTIFICATION", "tool-feature_productionRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public enum Entry {
        HOME,
        EXTERNAL_ICON,
        INTERNAL_TOOL,
        NOTIFICATION;

        private static final /* synthetic */ ml.a $ENTRIES = ml.b.a(values());

        public static ml.a getEntries() {
            return $ENTRIES;
        }
    }

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0014\u0010\u000f\u001a\u00020\u00032\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010\u0011\u001a\u00020\u0012HÖ\u0081\u0004J\n\u0010\u0013\u001a\u00020\u0014HÖ\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0015"}, d2 = {"Lcom/neeeex/eraser/launcher/StartupRoutePolicy$Route;", "", "runColdStartup", "", "destination", "Lcom/neeeex/eraser/launcher/StartupRoutePolicy$Destination;", "<init>", "(ZLcom/neeeex/eraser/launcher/StartupRoutePolicy$Destination;)V", "getRunColdStartup", "()Z", "getDestination", "()Lcom/neeeex/eraser/launcher/StartupRoutePolicy$Destination;", "component1", "component2", "copy", "equals", "other", "hashCode", "", "toString", "", "tool-feature_productionRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class Route {
        private final Destination destination;
        private final boolean runColdStartup;

        public Route(boolean z10, Destination destination) {
            "destination" /* decoded XOR */;
            destination.getClass();
            this.runColdStartup = z10;
            this.destination = destination;
        }

        public static /* synthetic */ Route copy$default(Route route, boolean z10, Destination destination, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                z10 = route.runColdStartup;
            }
            if ((i10 & 2) != 0) {
                destination = route.destination;
            }
            return route.copy(z10, destination);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final boolean getRunColdStartup() {
            return this.runColdStartup;
        }

        /* JADX INFO: renamed from: component2, reason: from getter */
        public final Destination getDestination() {
            return this.destination;
        }

        public final Route copy(boolean runColdStartup, Destination destination) {
            "destination" /* decoded XOR */;
            destination.getClass();
            return new Route(runColdStartup, destination);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Route)) {
                return false;
            }
            Route route = (Route) other;
            return this.runColdStartup == route.runColdStartup && this.destination == route.destination;
        }

        public final Destination getDestination() {
            return this.destination;
        }

        public final boolean getRunColdStartup() {
            return this.runColdStartup;
        }

        public int hashCode() {
            return (Boolean.hashCode(this.runColdStartup) * 31) + this.destination.hashCode();
        }

        public String toString() {
            return "Route(runColdStartup=" + this.runColdStartup + ", destination=" + this.destination + ")";
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[Entry.values().length];
            try {
                iArr[Entry.HOME.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[Entry.INTERNAL_TOOL.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[Entry.NOTIFICATION.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[Entry.EXTERNAL_ICON.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    private StartupRoutePolicy() {
    }

    public final Route resolve(Entry entry, boolean toolRuntimeReady) {
        "entry" /* decoded XOR */;
        entry.getClass();
        int i10 = WhenMappings.$EnumSwitchMapping$0[entry.ordinal()];
        if (i10 == 1) {
            return new Route(false, Destination.DESKTOP);
        }
        if (i10 == 2) {
            return new Route(!toolRuntimeReady, Destination.TOOL);
        }
        if (i10 == 3) {
            return new Route(!toolRuntimeReady, Destination.NOTIFICATION_TARGET);
        }
        if (i10 == 4) {
            return new Route(!toolRuntimeReady, Destination.MINUS_ONE);
        }
        coil.util.j.a();
        return null;
    }

    public final boolean shouldResumeOnboardingFromHome(boolean requiredFlowComplete, boolean onboardingInProgress, boolean isDefaultHome) {
        return !requiredFlowComplete && onboardingInProgress && isDefaultHome;
    }

    public final boolean shouldScanDevice(boolean requiredFlowComplete, boolean openSceneAdShown) {
        return (requiredFlowComplete || openSceneAdShown) ? false : true;
    }
}