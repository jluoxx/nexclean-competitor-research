package com.neeeex.eraser.launcher.startup;

import android.app.Activity;
import android.app.ActivityManager;
import android.app.Application;
import android.content.Intent;
import android.os.Bundle;
import com.neeeex.eraser.MainActivity;
import com.neeeex.eraser.launcher.DesktopNavigator;
import com.neeeex.eraser.launcher.LauncherRoutes;
import com.neeeex.eraser.launcher.StartupRoutePolicy;
import com.neeeex.eraser.launcher.StartupStateStore;
import com.neeeex.eraser.y;
import p003kotlin.Metadata;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0019\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0014¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lcom/neeeex/eraser/launcher/startup/AppStartupActivity;", "Landroid/app/Activity;", "<init>", "()V", "Landroid/os/Bundle;", "savedInstanceState", "Lfl/m0;", "onCreate", "(Landroid/os/Bundle;)V", "launcher_lawnWithQuickstepProductionRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class AppStartupActivity extends Activity {
    public static final int $stable = 8;

    @Override // android.app.Activity
    public void onCreate(Bundle savedInstanceState) {
        ActivityManager.RecentTaskInfo taskInfo;
        super.onCreate(savedInstanceState);
        boolean z10 = false;
        boolean z11 = getIntent().getBooleanExtra(LauncherRoutes.EXTRA_INTERNAL_TOOL, false) || getIntent().getBooleanExtra("com.neeeex.eraser.OPEN_CLEAN_FROM_DESKTOP", false);
        StartupRoutePolicy.Entry entry = z11 ? StartupRoutePolicy.Entry.INTERNAL_TOOL : StartupRoutePolicy.Entry.EXTERNAL_ICON;
        Application application = getApplication();
        application.getClass();
        y yVar = (y) application;
        if (yVar.isToolRuntimeInitialized() && !yVar.isToolStartupInProgress() && StartupStateStore.INSTANCE.requiredFlowComplete()) {
            z10 = true;
        }
        StartupRoutePolicy.Route routeResolve = StartupRoutePolicy.INSTANCE.resolve(entry, z10);
        if (!routeResolve.getRunColdStartup() && !z11) {
            if (z11) {
                DesktopNavigator.deliverTool$default(DesktopNavigator.INSTANCE, this, new Intent(this, (Class<?>) MainActivity.class), false, 4, null);
                return;
            }
            DesktopNavigator desktopNavigator = DesktopNavigator.INSTANCE;
            desktopNavigator.openDesktop(this, true, true);
            ActivityManager.AppTask appTaskFindHomeTask = desktopNavigator.findHomeTask(this);
            desktopNavigator.finishDelivery(this, (appTaskFindHomeTask == null || (taskInfo = appTaskFindHomeTask.getTaskInfo()) == null) ? null : Integer.valueOf(taskInfo.id));
            return;
        }
        StartupStateStore startupStateStore = StartupStateStore.INSTANCE;
        Intent intentContinuationIntent = startupStateStore.continuationIntent(this);
        Bundle extras = getIntent().getExtras();
        if (extras != null) {
            intentContinuationIntent.putExtras(extras);
        }
        intentContinuationIntent.putExtra(LauncherRoutes.EXTRA_DESTINATION, z11 ? "TOOL" : routeResolve.getDestination().name());
        intentContinuationIntent.putExtra(LauncherRoutes.EXTRA_OPEN_DESKTOP_AFTER_STARTUP, !z11);
        startupStateStore.startInOwnerTask(this, intentContinuationIntent);
        finish();
    }
}