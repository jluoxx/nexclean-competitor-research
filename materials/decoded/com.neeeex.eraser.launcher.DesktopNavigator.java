package com.neeeex.eraser.launcher;

import android.app.Activity;
import android.app.ActivityManager;
import android.app.Application;
import android.content.ActivityNotFoundException;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.util.AndroidRuntimeException;
import android.widget.Toast;
import com.neeeex.eraser.MainActivity;
import com.neeeex.eraser.R$string;
import com.neeeex.eraser.m0;
import java.util.List;
import java.util.Objects;
import p003kotlin.Metadata;
import p003kotlin.jvm.functions.Function0;
import p003kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\b\n\u0002\b\u0006\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\t\u0010\nJ\u001f\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\f\u0010\rJ\u001f\u0010\u0011\u001a\u00020\u00062\u0006\u0010\u000f\u001a\u00020\u000e2\b\b\u0002\u0010\u0010\u001a\u00020\u000b¢\u0006\u0004\b\u0011\u0010\u0012J\u0015\u0010\u0014\u001a\u00020\u00062\u0006\u0010\u0013\u001a\u00020\u0006¢\u0006\u0004\b\u0014\u0010\u0015J\u0017\u0010\u0017\u001a\u0004\u0018\u00010\u00162\u0006\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0017\u0010\u0018J'\u0010\u001a\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0010\u001a\u00020\u000b2\b\b\u0002\u0010\u0019\u001a\u00020\u000b¢\u0006\u0004\b\u001a\u0010\u001bJ'\u0010\u001e\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u001c\u001a\u00020\u00062\b\b\u0002\u0010\u001d\u001a\u00020\u000b¢\u0006\u0004\b\u001e\u0010\u001fJ\u001f\u0010\"\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010!\u001a\u0004\u0018\u00010 ¢\u0006\u0004\b\"\u0010#J\u0015\u0010$\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b$\u0010%¨\u0006&"}, d2 = {"Lcom/neeeex/eraser/launcher/DesktopNavigator;", "", "<init>", "()V", "Landroid/app/Activity;", "activity", "Landroid/content/Intent;", "intent", "Lfl/m0;", "openDesktopWithPayload", "(Landroid/app/Activity;Landroid/content/Intent;)V", "", "launchDesktop", "(Landroid/app/Activity;Landroid/content/Intent;)Z", "Landroid/content/Context;", "context", "openPanel", "homeIntent", "(Landroid/content/Context;Z)Landroid/content/Intent;", "source", "toolIntent", "(Landroid/content/Intent;)Landroid/content/Intent;", "Landroid/app/ActivityManager$AppTask;", "findHomeTask", "(Landroid/content/Context;)Landroid/app/ActivityManager$AppTask;", "warmStart", "openDesktop", "(Landroid/app/Activity;ZZ)V", "target", "restorePanel", "deliverTool", "(Landroid/app/Activity;Landroid/content/Intent;Z)V", "", "destinationTask", "finishDelivery", "(Landroid/app/Activity;Ljava/lang/Integer;)V", "completeStartup", "(Landroid/app/Activity;)V", "tool-feature_productionRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class DesktopNavigator {
    public static final DesktopNavigator INSTANCE = new DesktopNavigator();

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[DesktopLaunchRecovery.Stage.values().length];
            try {
                iArr[DesktopLaunchRecovery.Stage.HOME.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[DesktopLaunchRecovery.Stage.EXPLICIT_HOME.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[DesktopLaunchRecovery.Stage.TOOL.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    private DesktopNavigator() {
    }

    public static boolean a(RuntimeException runtimeException) {
        "it" /* decoded XOR */;
        runtimeException.getClass();
        return (runtimeException instanceof AndroidRuntimeException) || (runtimeException instanceof ActivityNotFoundException) || (runtimeException instanceof SecurityException);
    }

    public static fl.m0 b(Activity activity, Intent intent) {
        activity.startActivity(new Intent(intent).setComponent(DesktopNavigation.createExplicitIntent(activity).getComponent()));
        return fl.m0.f80959a;
    }

    public static fl.m0 c(Activity activity, Intent intent) {
        Intent component = new Intent(intent).setComponent(new ComponentName(activity, (Class<?>) MainActivity.class));
        component.setAction("android.intent.action.MAIN" /* decoded XOR */);
        component.removeCategory("android.intent.category.HOME" /* decoded XOR */);
        activity.startActivity(component);
        return fl.m0.f80959a;
    }

    public static fl.m0 d(Activity activity, DesktopLaunchRecovery.Stage stage, RuntimeException runtimeException) {
        Integer numValueOf;
        "stage" /* decoded XOR */;
        stage.getClass();
        "error" /* decoded XOR */;
        runtimeException.getClass();
        "DesktopNavigator" /* decoded XOR */;
        Objects.toString(stage);
        int i10 = WhenMappings.$EnumSwitchMapping$0[stage.ordinal()];
        if (i10 == 1) {
            numValueOf = null;
        } else if (i10 == 2) {
            numValueOf = Integer.valueOf(R$string.neeeex_launcher_desktop_launch_unavailable);
        } else {
            if (i10 != 3) {
                coil.util.j.a();
                return null;
            }
            numValueOf = Integer.valueOf(R$string.neeeex_launcher_app_launch_unavailable);
        }
        if (numValueOf != null) {
            Toast.makeText(activity, numValueOf.intValue(), 1).show();
        }
        return fl.m0.f80959a;
    }

    public static /* synthetic */ void deliverTool$default(DesktopNavigator desktopNavigator, Activity activity, Intent intent, boolean z10, int i10, Object obj) {
        if ((i10 & 4) != 0) {
            z10 = false;
        }
        desktopNavigator.deliverTool(activity, intent, z10);
    }

    public static fl.m0 e(Activity activity, Intent intent) {
        activity.startActivity(intent);
        return fl.m0.f80959a;
    }

    private static final boolean findHomeTask$lambda$0$0$isHome(Context context, ComponentName componentName) {
        return p003kotlin.jvm.internal.v.c(componentName != null ? componentName.getPackageName() : null, context.getPackageName()) && p003kotlin.jvm.internal.v.c(componentName.getClassName(), "app.lawnchair.LawnchairLauncher" /* decoded XOR */);
    }

    public static /* synthetic */ Intent homeIntent$default(DesktopNavigator desktopNavigator, Context context, boolean z10, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            z10 = false;
        }
        return desktopNavigator.homeIntent(context, z10);
    }

    private final boolean launchDesktop(final Activity activity, final Intent intent) {
        return DesktopLaunchRecovery.INSTANCE.launch(new Function0() { // from class: com.neeeex.eraser.launcher.e
            @Override // p003kotlin.jvm.functions.Function0
            public final Object invoke() {
                return DesktopNavigator.e(activity, intent);
            }
        }, new Function0() { // from class: com.neeeex.eraser.launcher.f
            @Override // p003kotlin.jvm.functions.Function0
            public final Object invoke() {
                return DesktopNavigator.b(activity, intent);
            }
        }, new Function0() { // from class: com.neeeex.eraser.launcher.g
            @Override // p003kotlin.jvm.functions.Function0
            public final Object invoke() {
                return DesktopNavigator.c(activity, intent);
            }
        }, new Function1() { // from class: com.neeeex.eraser.launcher.h
            @Override // p003kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return Boolean.valueOf(DesktopNavigator.a((RuntimeException) obj));
            }
        }, new tl.n() { // from class: com.neeeex.eraser.launcher.i
            @Override // tl.n
            public final Object invoke(Object obj, Object obj2) {
                return DesktopNavigator.d(activity, (DesktopLaunchRecovery.Stage) obj, (RuntimeException) obj2);
            }
        });
    }

    public static /* synthetic */ void openDesktop$default(DesktopNavigator desktopNavigator, Activity activity, boolean z10, boolean z11, int i10, Object obj) {
        if ((i10 & 4) != 0) {
            z11 = false;
        }
        desktopNavigator.openDesktop(activity, z10, z11);
    }

    private final void openDesktopWithPayload(Activity activity, Intent intent) {
        launchDesktop(activity, intent);
    }

    public final void completeStartup(Activity activity) {
        ActivityManager.RecentTaskInfo taskInfo;
        ActivityManager.RecentTaskInfo taskInfo2;
        "activity" /* decoded XOR */;
        activity.getClass();
        Application application = activity.getApplication();
        "null cannot be cast to non-null type com.neeeex.eraser.MyApplication" /* decoded XOR */;
        application.getClass();
        ((com.neeeex.eraser.y) application).markToolStartupFinished();
        MinusOneGuideHelper.INSTANCE.markShown(activity);
        Intent intentConsume = PendingToolEntry.INSTANCE.consume();
        if (intentConsume == null) {
            intentConsume = activity.getIntent();
        } else if (!intentConsume.hasExtra("neeeex_desktop_started_at_entry" /* decoded XOR */)) {
            intentConsume.putExtra("neeeex_desktop_started_at_entry" /* decoded XOR */, activity.getIntent().getBooleanExtra("neeeex_desktop_started_at_entry" /* decoded XOR */, false));
        }
        int intExtra = intentConsume.getIntExtra("from" /* decoded XOR */, 0);
        boolean z10 = (intExtra == 0 || intExtra == 10) ? false : true;
        String stringExtra = intentConsume.getStringExtra("com.neeeex.eraser.launcher.DESTINATION" /* decoded XOR */);
        if (intExtra == 10 && !intentConsume.getBooleanExtra("com.neeeex.eraser.launcher.OPEN_DESKTOP_AFTER_STARTUP" /* decoded XOR */, false)) {
            Intent intentPutExtras = new Intent(activity, (Class<?>) MainActivity.class).putExtras(intentConsume);
            "putExtras(...)" /* decoded XOR */;
            intentPutExtras.getClass();
            if (SplashRetainTask.startInSourceTask(activity, intentPutExtras)) {
                finishDelivery(activity, Integer.valueOf(intentConsume.getIntExtra("splash_retain_source_task_id" /* decoded XOR */, -1)));
                return;
            } else {
                activity.startActivity(intentPutExtras);
                activity.finish();
                return;
            }
        }
        Integer numValueOf = null;
        if (z10) {
            Intent intentBusinessTarget = NotificationRouter.INSTANCE.businessTarget(activity, intentConsume);
            if (DesktopRoutePolicy.shouldRouteThroughMainActivity$default(DesktopRoutePolicy.INSTANCE, true, intentConsume.getBooleanExtra("neeeex_desktop_started_at_entry" /* decoded XOR */, false), DefaultHomeController.INSTANCE.isDefaultHome(activity), false, false, 24, null)) {
                deliverTool(activity, intentBusinessTarget, intentConsume.getBooleanExtra("neeeex_panel_open_at_entry" /* decoded XOR */, false));
                return;
            }
            Intent intentPutExtras2 = homeIntent(activity, true).putExtras(intentConsume);
            "putExtras(...)" /* decoded XOR */;
            intentPutExtras2.getClass();
            intentPutExtras2.putExtra("com.neeeex.eraser.ROUTE_FROM_MINUS_ONE" /* decoded XOR */, true);
            openDesktopWithPayload(activity, intentPutExtras2);
            ActivityManager.AppTask appTaskFindHomeTask = findHomeTask(activity);
            if (appTaskFindHomeTask != null && (taskInfo2 = appTaskFindHomeTask.getTaskInfo()) != null) {
                numValueOf = Integer.valueOf(taskInfo2.id);
            }
            finishDelivery(activity, numValueOf);
            return;
        }
        if (p003kotlin.jvm.internal.v.c(stringExtra, "TOOL" /* decoded XOR */)) {
            Intent intent = intentConsume.getBooleanExtra("com.neeeex.eraser.OPEN_CLEAN_FROM_DESKTOP" /* decoded XOR */, false) ? LauncherActionNavigator.INSTANCE.intent(activity, LauncherActionNavigator.Action.JUNK) : new Intent(activity, (Class<?>) MainActivity.class);
            Bundle extras = intentConsume.getExtras();
            if (extras != null) {
                intent.putExtras(extras);
            }
            activity.startActivity(intent);
            activity.finish();
            return;
        }
        Intent intentHomeIntent = homeIntent(activity, true);
        intentHomeIntent.putExtra("com.neeeex.eraser.DEFAULT_HOME_AFTER_PANEL" /* decoded XOR */, true);
        launchDesktop(activity, intentHomeIntent);
        ActivityManager.AppTask appTaskFindHomeTask2 = findHomeTask(activity);
        if (appTaskFindHomeTask2 != null && (taskInfo = appTaskFindHomeTask2.getTaskInfo()) != null) {
            numValueOf = Integer.valueOf(taskInfo.id);
        }
        finishDelivery(activity, numValueOf);
    }

    public final void deliverTool(Activity activity, Intent target, boolean restorePanel) {
        Integer num;
        Object objM372constructorimpl;
        ActivityManager.RecentTaskInfo taskInfo;
        "activity" /* decoded XOR */;
        activity.getClass();
        "target" /* decoded XOR */;
        target.getClass();
        ComponentName component = target.getComponent();
        Integer numValueOf = null;
        if (!p003kotlin.jvm.internal.v.c(component != null ? component.getPackageName() : null, activity.getPackageName())) {
            yl.d.a("Failed requirement." /* decoded XOR */);
            return;
        }
        ComponentName component2 = target.getComponent();
        if (p003kotlin.jvm.internal.v.c(component2 != null ? component2.getClassName() : null, "app.lawnchair.LawnchairLauncher" /* decoded XOR */)) {
            openDesktop$default(this, activity, target.getBooleanExtra("com.neeeex.eraser.launcher.OPEN_PANEL" /* decoded XOR */, true), false, 4, null);
            ActivityManager.AppTask appTaskFindHomeTask = findHomeTask(activity);
            if (appTaskFindHomeTask != null && (taskInfo = appTaskFindHomeTask.getTaskInfo()) != null) {
                numValueOf = Integer.valueOf(taskInfo.id);
            }
            finishDelivery(activity, numValueOf);
            return;
        }
        ActivityManager.AppTask appTaskFindHomeTask2 = findHomeTask(activity);
        if (restorePanel) {
            com.neeeex.eraser.utils.b0.f66131a.z("neeeex_pending_panel_return" /* decoded XOR */, true);
        }
        if (appTaskFindHomeTask2 != null) {
            DesktopNavigator desktopNavigator = INSTANCE;
            try {
                fl.u.a aVar = fl.u.Companion;
                Intent intent = desktopNavigator.toolIntent(target);
                if (p003kotlin.jvm.internal.v.c(intent.getComponent(), appTaskFindHomeTask2.getTaskInfo().topActivity)) {
                    intent.addFlags(805306368);
                }
                appTaskFindHomeTask2.startActivity(activity, intent, null);
                objM372constructorimpl = fl.u.m372constructorimpl(Integer.valueOf(appTaskFindHomeTask2.getTaskInfo().id));
            } catch (Throwable th2) {
                fl.u.a aVar2 = fl.u.Companion;
                objM372constructorimpl = fl.u.m372constructorimpl(fl.v.a(th2));
            }
            if (fl.u.m377isFailureimpl(objM372constructorimpl)) {
                objM372constructorimpl = null;
            }
            num = (Integer) objM372constructorimpl;
        } else {
            num = null;
        }
        if (num != null) {
            finishDelivery(activity, num);
        } else {
            activity.startActivities(new Intent[]{homeIntent(activity, restorePanel), toolIntent(target)});
            finishDelivery(activity, null);
        }
    }

    public final ActivityManager.AppTask findHomeTask(Context context) {
        List<ActivityManager.AppTask> appTasks;
        Object objM372constructorimpl;
        "context" /* decoded XOR */;
        context.getClass();
        ActivityManager activityManager = (ActivityManager) context.getSystemService(ActivityManager.class);
        Object obj = null;
        if (activityManager == null || (appTasks = activityManager.getAppTasks()) == null) {
            return null;
        }
        for (Object obj2 : appTasks) {
            ActivityManager.AppTask appTask = (ActivityManager.AppTask) obj2;
            try {
                fl.u.a aVar = fl.u.Companion;
                ActivityManager.RecentTaskInfo taskInfo = appTask.getTaskInfo();
                objM372constructorimpl = fl.u.m372constructorimpl(Boolean.valueOf(findHomeTask$lambda$0$0$isHome(context, taskInfo.baseActivity) || findHomeTask$lambda$0$0$isHome(context, taskInfo.origActivity) || DesktopNavigation.isDesktopIntent(context, taskInfo.baseIntent)));
            } catch (Throwable th2) {
                fl.u.a aVar2 = fl.u.Companion;
                objM372constructorimpl = fl.u.m372constructorimpl(fl.v.a(th2));
            }
            Boolean bool = Boolean.FALSE;
            if (fl.u.m377isFailureimpl(objM372constructorimpl)) {
                objM372constructorimpl = bool;
            }
            if (((Boolean) objM372constructorimpl).booleanValue()) {
                obj = obj2;
                break;
            }
        }
        return (ActivityManager.AppTask) obj;
    }

    public final void finishDelivery(Activity activity, Integer destinationTask) {
        ActivityManager.AppTask appTaskFindHomeTask;
        ActivityManager.RecentTaskInfo taskInfo;
        "activity" /* decoded XOR */;
        activity.getClass();
        int intExtra = activity.getIntent().getIntExtra("com.neeeex.eraser.launcher.DELIVERY_TASK" /* decoded XOR */, activity.getTaskId());
        if (activity.isTaskRoot() && intExtra == activity.getTaskId()) {
            int taskId = activity.getTaskId();
            if ((destinationTask == null || destinationTask.intValue() != taskId) && ((appTaskFindHomeTask = findHomeTask(activity)) == null || (taskInfo = appTaskFindHomeTask.getTaskInfo()) == null || taskInfo.id != activity.getTaskId())) {
                activity.finishAndRemoveTask();
                return;
            }
        }
        activity.finish();
    }

    public final Intent homeIntent(Context context, boolean openPanel) {
        "context" /* decoded XOR */;
        context.getClass();
        Intent intentCreateIntent = DesktopNavigation.createIntent(context);
        intentCreateIntent.putExtra("com.neeeex.eraser.launcher.OPEN_PANEL" /* decoded XOR */, openPanel);
        "apply(...)" /* decoded XOR */;
        return intentCreateIntent;
    }

    public final void openDesktop(Activity activity, boolean openPanel, boolean warmStart) {
        "activity" /* decoded XOR */;
        activity.getClass();
        Intent intentPutExtra = homeIntent(activity, openPanel).putExtra("com.neeeex.eraser.launcher.WARM_START" /* decoded XOR */, warmStart);
        "putExtra(...)" /* decoded XOR */;
        intentPutExtra.getClass();
        launchDesktop(activity, intentPutExtra);
    }

    public final Intent toolIntent(Intent source) {
        "source" /* decoded XOR */;
        source.getClass();
        Intent intent = new Intent(source);
        intent.setFlags(ToolIntentFlagPolicy.INSTANCE.sanitize(intent.getFlags()));
        intent.addFlags(536870912);
        return intent;
    }
}