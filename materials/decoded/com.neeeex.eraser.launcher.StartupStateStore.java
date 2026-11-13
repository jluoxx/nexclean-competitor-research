package com.neeeex.eraser.launcher;

import android.app.Activity;
import android.app.ActivityManager;
import android.app.Application;
import android.content.ComponentName;
import android.content.Intent;
import com.android.launcher3.AutoInstallsLayout;
import com.neeeex.eraser.m0;
import com.neeeex.eraser.module.main.GuideNEEEEXActivity;
import com.neeeex.eraser.module.main.LanguageNEEEEXActivity;
import com.neeeex.eraser.module.main.SplashNEEEEXActivity;
import gl.b1;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import p003kotlin.Metadata;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\"\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0015\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\f\u0010\rJ\u0015\u0010\u000e\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000e\u0010\u000fJ\u001d\u0010\u0012\u001a\u00020\u00112\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u0010\u001a\u00020\u000b¢\u0006\u0004\b\u0012\u0010\u0013J\r\u0010\u0014\u001a\u00020\u0006¢\u0006\u0004\b\u0014\u0010\u0015J\r\u0010\u0016\u001a\u00020\u0011¢\u0006\u0004\b\u0016\u0010\u0003R\"\u0010\u0019\u001a\u0010\u0012\f\u0012\n \u0018*\u0004\u0018\u00010\u00040\u00040\u00178\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001a¨\u0006\u001b"}, d2 = {"Lcom/neeeex/eraser/launcher/StartupStateStore;", "", "<init>", "()V", "", AutoInstallsLayout.ATTR_CLASS_NAME, "", "isStartupPage", "(Ljava/lang/String;)Z", "Landroid/app/Activity;", "activity", "Landroid/content/Intent;", "continuationIntent", "(Landroid/app/Activity;)Landroid/content/Intent;", "resumeOnboardingAfterHomeSelection", "(Landroid/app/Activity;)Z", "target", "Lfl/m0;", "startInOwnerTask", "(Landroid/app/Activity;Landroid/content/Intent;)V", "requiredFlowComplete", "()Z", "markRequiredFlowComplete", "", "kotlin.jvm.PlatformType", "startupPages", "Ljava/util/Set;", "tool-feature_productionRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class StartupStateStore {
    public static final StartupStateStore INSTANCE = new StartupStateStore();
    private static final Set<String> startupPages = b1.k(SplashNEEEEXActivity.class.getName(), LanguageNEEEEXActivity.class.getName(), GuideNEEEEXActivity.class.getName(), DefaultHomeOnboardingActivity.class.getName());

    private StartupStateStore() {
    }

    /* JADX WARN: Code duplicated, block: B:11:0x0032  */
    public final Intent continuationIntent(Activity activity) {
        "activity" /* decoded XOR */;
        activity.getClass();
        Application application = activity.getApplication();
        "null cannot be cast to non-null type com.neeeex.eraser.MyApplication" /* decoded XOR */;
        application.getClass();
        com.neeeex.eraser.y yVar = (com.neeeex.eraser.y) application;
        String toolStartupActivityClass = yVar.getToolStartupActivityClass();
        if (toolStartupActivityClass == null) {
            toolStartupActivityClass = SplashNEEEEXActivity.class.getName();
        } else {
            if (!yVar.isToolStartupInProgress() || !INSTANCE.isStartupPage(toolStartupActivityClass)) {
                toolStartupActivityClass = null;
            }
            if (toolStartupActivityClass == null) {
                toolStartupActivityClass = SplashNEEEEXActivity.class.getName();
            }
        }
        Intent intentAddFlags = new Intent().setClassName(activity, toolStartupActivityClass).addFlags(603979776);
        "addFlags(...)" /* decoded XOR */;
        intentAddFlags.getClass();
        return intentAddFlags;
    }

    public final boolean isStartupPage(String className) {
        "className" /* decoded XOR */;
        className.getClass();
        return startupPages.contains(className);
    }

    public final void markRequiredFlowComplete() {
        com.neeeex.eraser.utils.b0.f66131a.z("neeeex_required_startup_done" /* decoded XOR */, true);
    }

    public final boolean requiredFlowComplete() {
        return com.neeeex.eraser.utils.b0.f66131a.s("neeeex_required_startup_done" /* decoded XOR */, !com.neeeex.eraser.utils.a.f66125a.b());
    }

    public final boolean resumeOnboardingAfterHomeSelection(Activity activity) {
        Object objM372constructorimpl;
        List<ActivityManager.AppTask> appTasks;
        "activity" /* decoded XOR */;
        activity.getClass();
        Application application = activity.getApplication();
        "null cannot be cast to non-null type com.neeeex.eraser.MyApplication" /* decoded XOR */;
        application.getClass();
        com.neeeex.eraser.y yVar = (com.neeeex.eraser.y) application;
        boolean z10 = false;
        if (!StartupRoutePolicy.INSTANCE.shouldResumeOnboardingFromHome(requiredFlowComplete(), yVar.isToolStartupInProgress() && p003kotlin.jvm.internal.v.c(yVar.getToolStartupActivityClass(), DefaultHomeOnboardingActivity.class.getName()), DefaultHomeOnboardingHelper.INSTANCE.isDefaultHome(activity))) {
            return false;
        }
        try {
            fl.u.a aVar = fl.u.Companion;
            ActivityManager activityManager = (ActivityManager) activity.getSystemService(ActivityManager.class);
            ActivityManager.AppTask appTask = null;
            Object obj = null;
            appTask = null;
            if (activityManager != null && (appTasks = activityManager.getAppTasks()) != null) {
                for (Object obj2 : appTasks) {
                    ActivityManager.AppTask appTask2 = (ActivityManager.AppTask) obj2;
                    if (appTask2.getTaskInfo().id == yVar.getToolStartupTaskId() && appTask2.getTaskInfo().id != activity.getTaskId()) {
                        obj = obj2;
                        break;
                    }
                }
                appTask = (ActivityManager.AppTask) obj;
            }
            if (appTask != null) {
                appTask.moveToFront();
                z10 = true;
            }
            objM372constructorimpl = fl.u.m372constructorimpl(Boolean.valueOf(z10));
        } catch (Throwable th2) {
            fl.u.a aVar2 = fl.u.Companion;
            objM372constructorimpl = fl.u.m372constructorimpl(fl.v.a(th2));
        }
        Boolean bool = Boolean.FALSE;
        if (fl.u.m377isFailureimpl(objM372constructorimpl)) {
            objM372constructorimpl = bool;
        }
        if (!((Boolean) objM372constructorimpl).booleanValue()) {
            Intent intent = new Intent(activity, (Class<?>) SplashNEEEEXActivity.class);
            intent.addFlags(872415232);
            intent.putExtra("com.neeeex.eraser.launcher.OPEN_DESKTOP_AFTER_STARTUP" /* decoded XOR */, true);
            intent.putExtra("com.neeeex.eraser.launcher.DESTINATION" /* decoded XOR */, "DESKTOP" /* decoded XOR */);
            activity.startActivity(intent);
        }
        return true;
    }

    public final void startInOwnerTask(Activity activity, Intent target) {
        Object objM372constructorimpl;
        ActivityManager.AppTask appTask;
        boolean z10;
        List<ActivityManager.AppTask> appTasks;
        Object next;
        "activity" /* decoded XOR */;
        activity.getClass();
        "target" /* decoded XOR */;
        target.getClass();
        Application application = activity.getApplication();
        "null cannot be cast to non-null type com.neeeex.eraser.MyApplication" /* decoded XOR */;
        application.getClass();
        com.neeeex.eraser.y yVar = (com.neeeex.eraser.y) application;
        if (yVar.isToolStartupInProgress()) {
            ComponentName component = target.getComponent();
            String className = component != null ? component.getClassName() : null;
            if (className == null) {
                className = "";
            }
            if (isStartupPage(className) && yVar.getToolStartupTaskId() != activity.getTaskId()) {
                try {
                    fl.u.a aVar = fl.u.Companion;
                    ActivityManager activityManager = (ActivityManager) activity.getSystemService(ActivityManager.class);
                    if (activityManager == null || (appTasks = activityManager.getAppTasks()) == null) {
                        appTask = null;
                    } else {
                        Iterator<T> it = appTasks.iterator();
                        do {
                            if (!it.hasNext()) {
                                next = null;
                                break;
                            }
                            next = it.next();
                        } while (((ActivityManager.AppTask) next).getTaskInfo().id != yVar.getToolStartupTaskId());
                        appTask = (ActivityManager.AppTask) next;
                    }
                    if (appTask == null) {
                        z10 = false;
                    } else {
                        DesktopNavigator desktopNavigator = DesktopNavigator.INSTANCE;
                        Intent intent = desktopNavigator.toolIntent(target);
                        if (p003kotlin.jvm.internal.v.c(intent.getComponent(), appTask.getTaskInfo().topActivity)) {
                            intent.addFlags(805306368);
                        }
                        appTask.startActivity(activity, intent, null);
                        desktopNavigator.finishDelivery(activity, Integer.valueOf(yVar.getToolStartupTaskId()));
                        z10 = true;
                    }
                    objM372constructorimpl = fl.u.m372constructorimpl(Boolean.valueOf(z10));
                } catch (Throwable th2) {
                    fl.u.a aVar2 = fl.u.Companion;
                    objM372constructorimpl = fl.u.m372constructorimpl(fl.v.a(th2));
                }
                Boolean bool = Boolean.FALSE;
                if (fl.u.m377isFailureimpl(objM372constructorimpl)) {
                    objM372constructorimpl = bool;
                }
                if (((Boolean) objM372constructorimpl).booleanValue()) {
                    return;
                }
            }
        }
        activity.startActivity(DesktopNavigator.INSTANCE.toolIntent(target));
    }
}