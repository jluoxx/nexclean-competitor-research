package com.neeeex.eraser.launcher;

import android.content.Context;
import com.mbridge.msdk.MBridgeConstans;
import com.neeeex.eraser.m0;
import p003kotlin.Metadata;
import p003kotlin.jvm.functions.Function0;
import p003kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0014\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J&\u0010\t\u001a\u00020\u00072\u0006\u0010\u0005\u001a\u00020\u00042\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006H\u0082\b¢\u0006\u0004\b\t\u0010\nJ\r\u0010\u000b\u001a\u00020\u0007¢\u0006\u0004\b\u000b\u0010\u0003J\u0015\u0010\u000e\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000e\u0010\u000fJ\u0015\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b\u0013\u0010\u0014J\r\u0010\u0015\u001a\u00020\u0012¢\u0006\u0004\b\u0015\u0010\u0016J\r\u0010\u0017\u001a\u00020\u0007¢\u0006\u0004\b\u0017\u0010\u0003J\u001d\u0010\u001a\u001a\u00020\u00072\u0006\u0010\u0018\u001a\u00020\u00042\u0006\u0010\u0019\u001a\u00020\u0004¢\u0006\u0004\b\u001a\u0010\u001bJ\r\u0010\u001c\u001a\u00020\u0007¢\u0006\u0004\b\u001c\u0010\u0003J\u001d\u0010\u001e\u001a\u00020\u00122\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u001d\u001a\u00020\u0012¢\u0006\u0004\b\u001e\u0010\u001fR\u0014\u0010 \u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b \u0010!R\u0014\u0010\"\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\"\u0010!R\u0014\u0010#\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b#\u0010!R\u0014\u0010$\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b$\u0010!R\u0014\u0010%\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b%\u0010!R\u0014\u0010&\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b&\u0010!R\u0014\u0010(\u001a\u00020'8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b(\u0010)¨\u0006*"}, d2 = {"Lcom/neeeex/eraser/launcher/NewUserDesktopFunnelTracker;", "", "<init>", "()V", "", com.thinkup.core.common.d0.q.d.f67742m, "Lkotlin/Function0;", "Lfl/m0;", "report", "reportOnce", "(Ljava/lang/String;Lkotlin/jvm/functions/Function0;)V", "start", "Lcom/neeeex/eraser/launcher/FirstMinusOneEntryPath;", MBridgeConstans.DYNAMIC_VIEW_WX_PATH, "recordFirstMinusOneEntry", "(Lcom/neeeex/eraser/launcher/FirstMinusOneEntryPath;)V", "Landroid/content/Context;", "context", "", "reportFirstMinusOneShown", "(Landroid/content/Context;)Z", "isActive", "()Z", "reportDefaultHomeGuideShown", "source", "surface", "reportDefaultHomeSettingsShown", "(Ljava/lang/String;Ljava/lang/String;)V", "reportDefaultHomeSelected", "isDefaultHome", "reportDesktopFirstScreenShown", "(Landroid/content/Context;Z)Z", "KEY_FUNNEL_ACTIVE", "Ljava/lang/String;", "KEY_GUIDE_SHOWN", "KEY_SETTINGS_SHOWN", "KEY_DEFAULT_SELECTED", "KEY_DESKTOP_FIRST_SCREEN_SHOWN", "KEY_FIRST_MINUS_ONE_STATE", "Lcom/neeeex/eraser/launcher/FirstMinusOneFunnel;", "firstMinusOne", "Lcom/neeeex/eraser/launcher/FirstMinusOneFunnel;", "tool-feature_productionRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class NewUserDesktopFunnelTracker {
    private static final String KEY_FUNNEL_ACTIVE = m0.a("3rSDkDhJ6gXJpqyKOVjHNMi0gJQ+UsU0yqSdkS9R6grPpZqJLw==\n", "rNHz/0o9tWs=\n");
    private static final String KEY_GUIDE_SHOWN = m0.a("pdlxorG7THSyy164sKphRbPZcqa3oGNFsMloqaaQYHK4y28=\n", "17wBzcPPExo=\n");
    private static final String KEY_SETTINGS_SHOWN = m0.a("xGc9SORA8xrTdRJS5VHeK9JnPkziW9wrxWc5U/9aywfpcSVI4Vo=\n", "tgJNJ5Y0rHQ=\n");
    private static final String KEY_DEFAULT_SELECTED = m0.a("eKprLOv9byFvuEQ26uxCEG6qaCjt5kAQbqp9IuzlRBB5qncm+v1VKw==\n", "Cs8bQ5mJME8=\n");
    private static final String KEY_DESKTOP_FIRST_SCREEN_SHOWN = m0.a("sm4yOJfJaEalfB0ilthFd6RuMTyR0kd3pmIwJJHiREuybic5us5fR7dl\n", "wAtCV+W9Nyg=\n");
    private static final String KEY_FIRST_MINUS_ONE_STATE = m0.a("upaxiqdv/L+thJ6Qpn7Rjq6as5ahRM64poayurp1xo67h6CRsA==\n", "yPPB5dUbo9E=\n");
    public static final NewUserDesktopFunnelTracker INSTANCE = new NewUserDesktopFunnelTracker();
    private static final FirstMinusOneFunnel firstMinusOne = new FirstMinusOneFunnel(new Function0() { // from class: com.neeeex.eraser.launcher.p
        @Override // p003kotlin.jvm.functions.Function0
        public final Object invoke() {
            return NewUserDesktopFunnelTracker.c();
        }
    }, new Function1() { // from class: com.neeeex.eraser.launcher.q
        @Override // p003kotlin.jvm.functions.Function1
        public final Object invoke(Object obj) {
            return Boolean.valueOf(NewUserDesktopFunnelTracker.b((String) obj));
        }
    }, new Function1() { // from class: com.neeeex.eraser.launcher.r
        @Override // p003kotlin.jvm.functions.Function1
        public final Object invoke(Object obj) {
            return NewUserDesktopFunnelTracker.a((FirstMinusOneEntryPath) obj);
        }
    });

    private NewUserDesktopFunnelTracker() {
    }

    public static fl.m0 a(FirstMinusOneEntryPath firstMinusOneEntryPath) {
        m0.a("Jfb79Q==\n", "VZePnQXiH4g=\n");
        firstMinusOneEntryPath.getClass();
        try {
            fl.u.a aVar = fl.u.Companion;
            LauncherReport.INSTANCE.reportFirstMinusOneShow(firstMinusOneEntryPath.getValue());
            fl.u.m372constructorimpl(fl.m0.f80959a);
        } catch (Throwable th2) {
            fl.u.a aVar2 = fl.u.Companion;
            fl.u.m372constructorimpl(fl.v.a(th2));
        }
        return fl.m0.f80959a;
    }

    public static boolean b(String str) {
        m0.a("AsU=\n", "a7GCK9haJ7E=\n");
        str.getClass();
        return com.neeeex.eraser.utils.b0.f66131a.D(KEY_FIRST_MINUS_ONE_STATE, str);
    }

    public static String c() {
        return com.neeeex.eraser.utils.b0.f66131a.w(KEY_FIRST_MINUS_ONE_STATE);
    }

    private final void reportOnce(String key, Function0 report) {
        com.neeeex.eraser.utils.b0 b0Var = com.neeeex.eraser.utils.b0.f66131a;
        if (!b0Var.s(KEY_FUNNEL_ACTIVE, false) || b0Var.s(key, false)) {
            return;
        }
        report.invoke();
        b0Var.z(key, true);
    }

    public final boolean isActive() {
        return com.neeeex.eraser.utils.b0.f66131a.s(KEY_FUNNEL_ACTIVE, false);
    }

    public final void recordFirstMinusOneEntry(FirstMinusOneEntryPath path) {
        m0.a("QxQClg==\n", "M3V2/llC8AQ=\n");
        path.getClass();
        firstMinusOne.recordEntryPath(path);
    }

    public final void reportDefaultHomeGuideShown() {
        String str = KEY_GUIDE_SHOWN;
        com.neeeex.eraser.utils.b0 b0Var = com.neeeex.eraser.utils.b0.f66131a;
        if (!b0Var.s(KEY_FUNNEL_ACTIVE, false) || b0Var.s(str, false)) {
            return;
        }
        LauncherReport.INSTANCE.reportDefaultHomeGuideShow();
        b0Var.z(str, true);
    }

    public final void reportDefaultHomeSelected() {
        String str = KEY_DEFAULT_SELECTED;
        com.neeeex.eraser.utils.b0 b0Var = com.neeeex.eraser.utils.b0.f66131a;
        if (!b0Var.s(KEY_FUNNEL_ACTIVE, false) || b0Var.s(str, false)) {
            return;
        }
        LauncherReport.INSTANCE.reportFirstDefaultHomeSelected();
        b0Var.z(str, true);
    }

    public final void reportDefaultHomeSettingsShown(String source, String surface) {
        m0.a("TasGeOy+\n", "PsRzCo/b1YM=\n");
        source.getClass();
        m0.a("7UESrDe/KA==\n", "njRgylbcTVk=\n");
        surface.getClass();
        String str = KEY_SETTINGS_SHOWN;
        com.neeeex.eraser.utils.b0 b0Var = com.neeeex.eraser.utils.b0.f66131a;
        if (!b0Var.s(KEY_FUNNEL_ACTIVE, false) || b0Var.s(str, false)) {
            return;
        }
        LauncherReport.INSTANCE.reportDefaultHomeSettingsShow(source, surface);
        b0Var.z(str, true);
    }

    public final boolean reportDesktopFirstScreenShown(Context context, boolean isDefaultHome) {
        m0.a("trvzl3Mq7g==\n", "1dSd4xZSmio=\n");
        context.getClass();
        com.neeeex.eraser.utils.b0 b0Var = com.neeeex.eraser.utils.b0.f66131a;
        String str = KEY_FUNNEL_ACTIVE;
        if (b0Var.s(str, false)) {
            String str2 = KEY_DESKTOP_FIRST_SCREEN_SHOWN;
            if (!b0Var.s(str2, false)) {
                Context applicationContext = context.getApplicationContext();
                com.neeeex.eraser.y yVar = applicationContext instanceof com.neeeex.eraser.y ? (com.neeeex.eraser.y) applicationContext : null;
                if (yVar == null) {
                    return false;
                }
                yVar.ensureReportingInitialized();
                if (isDefaultHome) {
                    String str3 = KEY_DEFAULT_SELECTED;
                    if (!b0Var.s(str3, false)) {
                        LauncherReport.INSTANCE.reportFirstDefaultHomeSelected();
                        b0Var.z(str3, true);
                    }
                }
                LauncherReport.INSTANCE.reportDesktopFirstScreenShow(isDefaultHome);
                b0Var.z(str2, true);
                b0Var.z(str, false);
                return true;
            }
        }
        return false;
    }

    public final boolean reportFirstMinusOneShown(Context context) {
        m0.a("DMWsHjK6JQ==\n", "b6rCalfCUVs=\n");
        context.getClass();
        if (!StartupStateStore.INSTANCE.requiredFlowComplete()) {
            return false;
        }
        Context applicationContext = context.getApplicationContext();
        com.neeeex.eraser.y yVar = applicationContext instanceof com.neeeex.eraser.y ? (com.neeeex.eraser.y) applicationContext : null;
        if (yVar == null) {
            return false;
        }
        yVar.ensureReportingInitialized();
        return firstMinusOne.reportShown();
    }

    public final void start() {
        com.neeeex.eraser.utils.b0 b0Var = com.neeeex.eraser.utils.b0.f66131a;
        String str = KEY_FUNNEL_ACTIVE;
        if (b0Var.s(str, false) || b0Var.s(KEY_DESKTOP_FIRST_SCREEN_SHOWN, false)) {
            return;
        }
        firstMinusOne.startNewUser();
        b0Var.z(str, true);
    }
}