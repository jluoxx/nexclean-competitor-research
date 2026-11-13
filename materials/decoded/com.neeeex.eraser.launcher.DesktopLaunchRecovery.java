package com.neeeex.eraser.launcher;

import com.android.systemui.plugins.BcSmartspaceDataPlugin;
import com.neeeex.eraser.m0;
import p003kotlin.Metadata;
import p003kotlin.jvm.functions.Function0;
import p003kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÀ\u0002\u0018\u00002\u00020\u0001:\u0001\u0013B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003Jm\u0010\u0011\u001a\u00020\f2\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0016\u0010\r\u001a\u0012\u0012\b\u0012\u00060\nj\u0002`\u000b\u0012\u0004\u0012\u00020\f0\t2\u001c\u0010\u0010\u001a\u0018\u0012\u0004\u0012\u00020\u000f\u0012\b\u0012\u00060\nj\u0002`\u000b\u0012\u0004\u0012\u00020\u00050\u000e¢\u0006\u0004\b\u0011\u0010\u0012¨\u0006\u0014"}, d2 = {"Lcom/neeeex/eraser/launcher/DesktopLaunchRecovery;", "", "<init>", "()V", "Lkotlin/Function0;", "Lfl/m0;", BcSmartspaceDataPlugin.UI_SURFACE_HOME_SCREEN, "explicitHome", "tool", "Lkotlin/Function1;", "Ljava/lang/RuntimeException;", "Lkotlin/RuntimeException;", "", "isLaunchFailure", "Lkotlin/Function2;", "Lcom/neeeex/eraser/launcher/DesktopLaunchRecovery$Stage;", "onFailure", "launch", "(Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;Ltl/n;)Z", "Stage", "tool-feature_productionRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class DesktopLaunchRecovery {
    public static final DesktopLaunchRecovery INSTANCE = new DesktopLaunchRecovery();

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Lcom/neeeex/eraser/launcher/DesktopLaunchRecovery$Stage;", "", "<init>", "(Ljava/lang/String;I)V", "HOME", "EXPLICIT_HOME", "TOOL", "tool-feature_productionRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public enum Stage {
        HOME,
        EXPLICIT_HOME,
        TOOL;

        private static final /* synthetic */ ml.a $ENTRIES = ml.b.a(values());

        public static ml.a getEntries() {
            return $ENTRIES;
        }
    }

    private DesktopLaunchRecovery() {
    }

    public final boolean launch(Function0 home, Function0 explicitHome, Function0 tool, Function1 isLaunchFailure, tl.n onFailure) {
        "home" /* decoded XOR */;
        home.getClass();
        "explicitHome" /* decoded XOR */;
        explicitHome.getClass();
        "tool" /* decoded XOR */;
        tool.getClass();
        "isLaunchFailure" /* decoded XOR */;
        isLaunchFailure.getClass();
        "onFailure" /* decoded XOR */;
        onFailure.getClass();
        for (fl.t tVar : gl.w.p(fl.z.a(Stage.HOME, home), fl.z.a(Stage.EXPLICIT_HOME, explicitHome), fl.z.a(Stage.TOOL, tool))) {
            Object obj = (Stage) tVar.component1();
            try {
                ((Function0) tVar.component2()).invoke();
                return true;
            } catch (RuntimeException e10) {
                if (!((Boolean) isLaunchFailure.invoke(e10)).booleanValue()) {
                    throw e10;
                }
                onFailure.invoke(obj, e10);
            }
        }
        return false;
    }
}