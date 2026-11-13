package com.neeeex.eraser.launcher;

import android.content.Context;
import com.neeeex.eraser.m0;
import p003kotlin.Metadata;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0016\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0005J\u000e\u0010\u0010\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eR\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\tX\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0011"}, d2 = {"Lcom/neeeex/eraser/launcher/DefaultHomeStatusTracker;", "", "<init>", "()V", "SCENE_TOOL_ACTIVITY", "", "SCENE_DEFAULT_HOME_GUIDE", "SCENE_LAUNCHER", "STATUS_NOT_DEFAULT", "", "STATUS_DEFAULT", "report", "", "context", "Landroid/content/Context;", "scene", "reportLauncher", "tool-feature_productionRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class DefaultHomeStatusTracker {
    private static final int STATUS_DEFAULT = 1;
    private static final int STATUS_NOT_DEFAULT = 0;
    public static final String SCENE_TOOL_ACTIVITY = m0.a("e4pjAwoNzjBmk2UbLA==\n", "D+UMb1VsrUQ=\n");
    public static final String SCENE_DEFAULT_HOME_GUIDE = m0.a("iSajHqMA4gyFLKgaiQvjOokm\n", "7UPFf9ZsllM=\n");
    private static final String SCENE_LAUNCHER = m0.a("83abieOlEAg=\n", "nxfu54DNdXo=\n");
    public static final DefaultHomeStatusTracker INSTANCE = new DefaultHomeStatusTracker();

    private DefaultHomeStatusTracker() {
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public final boolean report(Context context, String scene) {
        m0.a("PqVIWWxZDg==\n", "XcomLQkhetk=\n");
        context.getClass();
        m0.a("iYAH2Kk=\n", "+uNitsyypUs=\n");
        scene.getClass();
        boolean zIsDefaultHome = DefaultHomeOnboardingHelper.INSTANCE.isDefaultHome(context);
        Context applicationContext = context.getApplicationContext();
        com.neeeex.eraser.y yVar = applicationContext instanceof com.neeeex.eraser.y ? (com.neeeex.eraser.y) applicationContext : null;
        if (yVar == null) {
            return false;
        }
        yVar.ensureReportingInitialized();
        LauncherReport.INSTANCE.reportDefaultHomeStatus(zIsDefaultHome ? 1 : 0, scene);
        DefaultHomeSelectionTracker.INSTANCE.reportResult(context, zIsDefaultHome);
        return true;
    }

    public final boolean reportLauncher(Context context) {
        m0.a("a7s37qE0Gw==\n", "CNRZmsRMb9w=\n");
        context.getClass();
        return report(context, SCENE_LAUNCHER);
    }
}