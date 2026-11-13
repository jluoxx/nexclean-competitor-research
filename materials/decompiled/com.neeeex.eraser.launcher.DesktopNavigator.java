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
        m0.a("bQA=\n", "BHSu00Nzodo=\n");
        runtimeException.getClass();
        return (runtimeException instanceof AndroidRuntimeException) || (runtimeException instanceof ActivityNotFoundException) || (runtimeException instanceof SecurityException);
    }

    public static fl.m0 b(Activity activity, Intent intent) {
        activity.startActivity(new Intent(intent).setComponent(DesktopNavigation.createExplicitIntent(activity).getComponent()));
        return fl.m0.f80959a;
    }

    public static fl.m0 c(Activity activity, Intent intent) {
        Intent component = new Intent(intent).setComponent(new ComponentName(activity, (Class<?>) MainActivity.class));
        component.setAction(m0.a("4tYeO0T2oAzq1g4sRevqQ+DMEyZFsYljyvY=\n", "g7h6SSufxCI=\n"));
        component.removeCategory(m0.a("DjSdnsPPKE0GNI2JwtJiAA4unIvD1DVNJxW0qQ==\n", "b1r57KymTGM=\n"));
        activity.startActivity(component);
        return fl.m0.f80959a;
    }

    public static fl.m0 d(Activity activity, DesktopLaunchRecovery.Stage stage, RuntimeException runtimeException) {
        Integer numValueOf;
        m0.a("chIA45Y=\n", "AWZhhPOZ+lU=\n");
        stage.getClass();
        m0.a("Yk5MfGE=\n", "Bzw+ExPWHeM=\n");
        runtimeException.getClass();
        m0.a("xOM7c+7R5Jnh8CF/+8r7pQ==\n", "gIZIGJq+lNc=\n");
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
        return p003kotlin.jvm.internal.v.c(componentName != null ? componentName.getPackageName() : null, context.getPackageName()) && p003kotlin.jvm.internal.v.c(componentName.getClassName(), m0.a("Tr0S2Wo35w1MpQOedHjcAlijAZ9nP+IvTrgMlG4z4g==\n", "L81i9wZWkGM=\n"));
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
        m0.a("tuLYXoqV9Zc=\n", "14GsN/z8ge4=\n");
        activity.getClass();
        Application application = activity.getApplication();
        m0.a("F35zkcLnCTwXZGvdgOFIMRh4a92W60g8FmUyk5foBHINcm+YwucHP1dlepiH4RB8HHl+jof2Rh8A\nSm+Nju0LMw1icJM=\n", "eQsf/eKEaFI=\n");
        application.getClass();
        ((com.neeeex.eraser.y) application).markToolStartupFinished();
        MinusOneGuideHelper.INSTANCE.markShown(activity);
        Intent intentConsume = PendingToolEntry.INSTANCE.consume();
        if (intentConsume == null) {
            intentConsume = activity.getIntent();
        } else if (!intentConsume.hasExtra(m0.a("vxEkvbdpQUa0ByqsvWFBUaUVM6y3dUFDpSsktqZjZw==\n", "0XRB2NIRHiI=\n"))) {
            intentConsume.putExtra(m0.a("lRh5GP19rWeeDncJ93WtcI8cbgn9Ya1ijyJ5E+x3iw==\n", "+30cfZgF8gM=\n"), activity.getIntent().getBooleanExtra(m0.a("1CWgBneYIfvfM64XfZAh7M4htxd3hCH+zh+gDWaSBw==\n", "ukDFYxLgfp8=\n"), false));
        }
        int intExtra = intentConsume.getIntExtra(m0.a("FGHOBw==\n", "chOhahZykyQ=\n"), 0);
        boolean z10 = (intExtra == 0 || intExtra == 10) ? false : true;
        String stringExtra = intentConsume.getStringExtra(m0.a("uBKtj+HEPZu+Be7E/cArm6lTrMD6zzuWvg/u5cryDLeVPJTowO8=\n", "233AoY+hWP4=\n"));
        if (intExtra == 10 && !intentConsume.getBooleanExtra(m0.a("WFDJeCi8RmteR4ozNLhQa0kRyDczt0BmXk2KGRacbVF/evcdEpZzUXp58BMUhnBaem3wAxY=\n", "Oz+kVkbZIw4=\n"), false)) {
            Intent intentPutExtras = new Intent(activity, (Class<?>) MainActivity.class).putExtras(intentConsume);
            m0.a("5GiiJbvCzAznNfhO7Z8=\n", "lB3WYMO2vm0=\n");
            intentPutExtras.getClass();
            if (SplashRetainTask.startInSourceTask(activity, intentPutExtras)) {
                finishDelivery(activity, Integer.valueOf(intentConsume.getIntExtra(m0.a("9MljEqNNG7DizW4avno3rfLLbBaPUSWx7OZmFw==\n", "h7kPc9AlRMI=\n"), -1)));
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
            if (DesktopRoutePolicy.shouldRouteThroughMainActivity$default(DesktopRoutePolicy.INSTANCE, true, intentConsume.getBooleanExtra(m0.a("N+080xYPy8Q8+zLCHAfL0y3pK8IWE8vBLdc82AcF7Q==\n", "WYhZtnN3lKA=\n"), false), DefaultHomeController.INSTANCE.isDefaultHome(activity), false, false, 24, null)) {
                deliverTool(activity, intentBusinessTarget, intentConsume.getBooleanExtra(m0.a("yheSSpzlkxbFHJJDpvK8A8otllum+KIS1gs=\n", "pHL3L/mdzGY=\n"), false));
                return;
            }
            Intent intentPutExtras2 = homeIntent(activity, true).putExtras(intentConsume);
            m0.a("MKMhf5+3a8Ez/nsUyeo=\n", "QNZVOufDGaA=\n");
            intentPutExtras2.getClass();
            intentPutExtras2.putExtra(m0.a("fUAgSSXk8z97V2MCOeDlP2wBHyge1dMFWH0CKhTM3xRLfBIoBcQ=\n", "Hi9NZ0uBllo=\n"), true);
            openDesktopWithPayload(activity, intentPutExtras2);
            ActivityManager.AppTask appTaskFindHomeTask = findHomeTask(activity);
            if (appTaskFindHomeTask != null && (taskInfo2 = appTaskFindHomeTask.getTaskInfo()) != null) {
                numValueOf = Integer.valueOf(taskInfo2.id);
            }
            finishDelivery(activity, numValueOf);
            return;
        }
        if (p003kotlin.jvm.internal.v.c(stringExtra, m0.a("DPrbEw==\n", "WLWUX3Jzwds=\n"))) {
            Intent intent = intentConsume.getBooleanExtra(m0.a("MYDAXSaLAF43l4MWOo8WXiDB4iMNoDp4HqrsPReoN3QfsOk2G6UxdAI=\n", "Uu+tc0juZTs=\n"), false) ? LauncherActionNavigator.INSTANCE.intent(activity, LauncherActionNavigator.Action.JUNK) : new Intent(activity, (Class<?>) MainActivity.class);
            Bundle extras = intentConsume.getExtras();
            if (extras != null) {
                intent.putExtras(extras);
            }
            activity.startActivity(intent);
            activity.finish();
            return;
        }
        Intent intentHomeIntent = homeIntent(activity, true);
        intentHomeIntent.putExtra(m0.a("87AnjrouTsH1p2TFpipYweLxDuWSCn7oxIAC75kOdOXWiw/yixtq6tWT\n", "kN9KoNRLK6Q=\n"), true);
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
        m0.a("ML5d4rir4ag=\n", "Ud0pi87CldE=\n");
        activity.getClass();
        m0.a("KABIzr5e\n", "XGE6qdsq/Wk=\n");
        target.getClass();
        ComponentName component = target.getComponent();
        Integer numValueOf = null;
        if (!p003kotlin.jvm.internal.v.c(component != null ? component.getPackageName() : null, activity.getPackageName())) {
            yl.d.a(m0.a("0wAQE8s+FUDwEAwW3D9YV/sVVw==\n", "lWF5f65aNTI=\n"));
            return;
        }
        ComponentName component2 = target.getComponent();
        if (p003kotlin.jvm.internal.v.c(component2 != null ? component2.getClassName() : null, m0.a("dNfWw7Ju5Uh2z8eErCHeR2LJxYW/ZuBqdNLIjrZq4A==\n", "Faem7d4PkiY=\n"))) {
            openDesktop$default(this, activity, target.getBooleanExtra(m0.a("d9afsYdDus1xwdz6m0eszWaXnv6cSLzAccvc0LljkfdE+LzapQ==\n", "FLnyn+km36g=\n"), true), false, 4, null);
            ActivityManager.AppTask appTaskFindHomeTask = findHomeTask(activity);
            if (appTaskFindHomeTask != null && (taskInfo = appTaskFindHomeTask.getTaskInfo()) != null) {
                numValueOf = Integer.valueOf(taskInfo.id);
            }
            finishDelivery(activity, numValueOf);
            return;
        }
        ActivityManager.AppTask appTaskFindHomeTask2 = findHomeTask(activity);
        if (restorePanel) {
            com.neeeex.eraser.utils.b0.f66131a.z(m0.a("bnI/f7guVL1leT5zszFUvWF5P3aCJG65dWU0\n", "ABdaGt1WC80=\n"), true);
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
        m0.a("jQ0lF3yLuQ==\n", "7mJLYxnzzWI=\n");
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
        m0.a("cV54oNnEjGk=\n", "ED0Mya+t+BA=\n");
        activity.getClass();
        int intExtra = activity.getIntent().getIntExtra(m0.a("bPpmQQZg4jVq7SUKGmT0NX27Zw4da+Q4auclKy1JzgZKx1IwPETUGw==\n", "D5ULb2gFh1A=\n"), activity.getTaskId());
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
        m0.a("D46dimsHXw==\n", "bOHz/g5/K8E=\n");
        context.getClass();
        Intent intentCreateIntent = DesktopNavigation.createIntent(context);
        intentCreateIntent.putExtra(m0.a("nwR5ZzOatp6ZEzosL56gno5FeCgokbCTmRk6Bg26naSsKloMEQ==\n", "/GsUSV3/0/s=\n"), openPanel);
        m0.a("SeWvkrJfA1UGvA==\n", "KJXf/st3LXs=\n");
        return intentCreateIntent;
    }

    public final void openDesktop(Activity activity, boolean openPanel, boolean warmStart) {
        m0.a("AXHZUhomIH0=\n", "YBKtO2xPVAQ=\n");
        activity.getClass();
        Intent intentPutExtra = homeIntent(activity, openPanel).putExtra(m0.a("9iDzvEkI8gTwN7D3VQzkBOdh8vNSA/QJ8D2wxWY/2j7GG9/Acw==\n", "lU+ekidtl2E=\n"), warmStart);
        m0.a("uwJbsuz3MXnjWQHZvQ==\n", "y3cv95SDQxg=\n");
        intentPutExtra.getClass();
        launchDesktop(activity, intentPutExtra);
    }

    public final Intent toolIntent(Intent source) {
        m0.a("B2VoY6uN\n", "dAodEcjoqrE=\n");
        source.getClass();
        Intent intent = new Intent(source);
        intent.setFlags(ToolIntentFlagPolicy.INSTANCE.sanitize(intent.getFlags()));
        intent.addFlags(536870912);
        return intent;
    }
}