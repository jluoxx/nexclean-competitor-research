package com.neeeex.eraser.launcher;

import android.app.Activity;
import android.app.ActivityManager;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import com.neeeex.eraser.m0;

/* JADX INFO: loaded from: classes7.dex */
public final class SplashRetainTask {
    private static final String TAG = "SplashRetainTask" /* decoded XOR */;
    private static final String EXTRA_SOURCE_TASK_ID = "splash_retain_source_task_id" /* decoded XOR */;

    private SplashRetainTask() {
    }

    private static boolean isDesktopActivity(ComponentName componentName) {
        return componentName != null && "app.lawnchair.LawnchairLauncher" /* decoded XOR */.equals(componentName.getClassName());
    }

    private static boolean isDesktopTask(Context context, ActivityManager.RecentTaskInfo recentTaskInfo) {
        if (isDesktopActivity(recentTaskInfo.baseActivity) || isDesktopActivity(recentTaskInfo.origActivity)) {
            return true;
        }
        Intent intent = recentTaskInfo.baseIntent;
        return intent != null && DesktopNavigation.isDesktopIntent(context, intent);
    }

    private static Intent sanitizeDestination(Intent intent) {
        Intent intent2 = new Intent(intent);
        intent2.setFlags(intent2.getFlags() & (-403210241));
        return intent2;
    }

    public static int sourceTaskId(Activity activity) {
        return activity.getIntent().getIntExtra(EXTRA_SOURCE_TASK_ID, activity.getTaskId());
    }

    public static boolean startInDesktopTask(Activity activity, Intent intent) {
        ActivityManager activityManager = (ActivityManager) activity.getSystemService("activity" /* decoded XOR */);
        if (activityManager == null) {
            return false;
        }
        try {
            for (ActivityManager.AppTask appTask : activityManager.getAppTasks()) {
                ActivityManager.RecentTaskInfo taskInfo = appTask.getTaskInfo();
                if (taskInfo != null && taskId(taskInfo) != activity.getTaskId() && isDesktopTask(activity, taskInfo)) {
                    return startInTask(activity, appTask, taskInfo, intent, "desktop" /* decoded XOR */);
                }
            }
        } catch (RuntimeException unused) {
            "Cannot route notification to desktop task" /* decoded XOR */;
        }
        try {
            activity.startActivities(new Intent[]{DesktopNavigation.createIntent(activity), sanitizeDestination(intent)});
            "Route notification through a recreated desktop task" /* decoded XOR */;
            return true;
        } catch (RuntimeException unused2) {
            "Cannot recreate desktop task for notification" /* decoded XOR */;
            return false;
        }
    }

    public static boolean startInSourceTask(Activity activity, Intent intent) {
        ActivityManager activityManager;
        int iSourceTaskId = sourceTaskId(activity);
        if (iSourceTaskId < 0 || iSourceTaskId == activity.getTaskId() || (activityManager = (ActivityManager) activity.getSystemService("activity" /* decoded XOR */)) == null) {
            return false;
        }
        try {
            for (ActivityManager.AppTask appTask : activityManager.getAppTasks()) {
                ActivityManager.RecentTaskInfo taskInfo = appTask.getTaskInfo();
                if (taskInfo != null && taskId(taskInfo) == iSourceTaskId) {
                    return startInTask(activity, appTask, taskInfo, intent, "source" /* decoded XOR */);
                }
            }
        } catch (RuntimeException unused) {
            "Cannot return business to source task " /* decoded XOR */;
        }
        return false;
    }

    private static boolean startInTask(Activity activity, ActivityManager.AppTask appTask, ActivityManager.RecentTaskInfo recentTaskInfo, Intent intent, String str) {
        Intent intentSanitizeDestination = sanitizeDestination(intent);
        if (intentSanitizeDestination.getComponent() != null && intentSanitizeDestination.getComponent().equals(recentTaskInfo.topActivity)) {
            intentSanitizeDestination.addFlags(805306368);
        }
        appTask.startActivity(activity, intentSanitizeDestination, null);
        "Route notification to " /* decoded XOR */;
        " task " /* decoded XOR */;
        taskId(recentTaskInfo);
        return true;
    }

    private static int taskId(ActivityManager.RecentTaskInfo recentTaskInfo) {
        return Build.VERSION.SDK_INT >= 29 ? recentTaskInfo.taskId : recentTaskInfo.persistentId;
    }

    public static void writeTo(Intent intent, int i10) {
        intent.putExtra(EXTRA_SOURCE_TASK_ID, i10);
    }
}