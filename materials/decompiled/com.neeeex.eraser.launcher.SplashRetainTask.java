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
    private static final String TAG = m0.a("726MAlHvIHrIf4kNduYBdA==\n", "vB7gYyKHch8=\n");
    private static final String EXTRA_SOURCE_TASK_ID = m0.a("jxhO7JEes/aZHEPkjCmf64kaQei9Ao33lzdL6Q==\n", "/GgijeJ27IQ=\n");

    private SplashRetainTask() {
    }

    private static boolean isDesktopActivity(ComponentName componentName) {
        return componentName != null && m0.a("UWk4ePdcP4BTcSk/6RMEj0d3Kz76VDqiUWwmNfNYOg==\n", "MBlIVps9SO4=\n").equals(componentName.getClassName());
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
        ActivityManager activityManager = (ActivityManager) activity.getSystemService(m0.a("A7OsqDFt0oM=\n", "YtDYwUcEpvo=\n"));
        if (activityManager == null) {
            return false;
        }
        try {
            for (ActivityManager.AppTask appTask : activityManager.getAppTasks()) {
                ActivityManager.RecentTaskInfo taskInfo = appTask.getTaskInfo();
                if (taskInfo != null && taskId(taskInfo) != activity.getTaskId() && isDesktopTask(activity, taskInfo)) {
                    return startInTask(activity, appTask, taskInfo, intent, m0.a("OHp5BpyS9A==\n", "XB8Kbej9hA0=\n"));
                }
            }
        } catch (RuntimeException unused) {
            m0.a("YVk72g1ubuJNTSHRQnQh5EtePNcDbif/TBgh20J+K+NJTDrEQm4v40k=\n", "IjhVtGIaTpA=\n");
        }
        try {
            activity.startActivities(new Intent[]{DesktopNavigation.createIntent(activity), sanitizeDestination(intent)});
            m0.a("AHQCdkqTZaEmchFrTNJ/pz11V3ZHwWS7NXNXYw/Bbq0gfhZ2StcrqjdoHHZAwyu6M2gc\n", "Uht3Ai+zC84=\n");
            return true;
        } catch (RuntimeException unused2) {
            m0.a("7tDjAYQazQvI0v8KihqIWcnU/gSfAZ1Z2dD+BMsIgguN3+IbggiEGszF5ACF\n", "rbGNb+tu7Xk=\n");
            return false;
        }
    }

    public static boolean startInSourceTask(Activity activity, Intent intent) {
        ActivityManager activityManager;
        int iSourceTaskId = sourceTaskId(activity);
        if (iSourceTaskId < 0 || iSourceTaskId == activity.getTaskId() || (activityManager = (ActivityManager) activity.getSystemService(m0.a("VftaaMZSJ+I=\n", "NJguAbA7U5s=\n"))) == null) {
            return false;
        }
        try {
            for (ActivityManager.AppTask appTask : activityManager.getAppTasks()) {
                ActivityManager.RecentTaskInfo taskInfo = appTask.getTaskInfo();
                if (taskInfo != null && taskId(taskInfo) == iSourceTaskId) {
                    return startInTask(activity, appTask, taskInfo, intent, m0.a("TycD52MQ\n", "PEh2lQB1GoA=\n"));
                }
            }
        } catch (RuntimeException unused) {
            m0.a("FeJJWRAZdgMz91JFEU00BCXqSVIMHnYFOaNUWAofNRR290ZEFE0=\n", "VoMnN39tVnE=\n");
        }
        return false;
    }

    private static boolean startInTask(Activity activity, ActivityManager.AppTask appTask, ActivityManager.RecentTaskInfo recentTaskInfo, Intent intent, String str) {
        Intent intentSanitizeDestination = sanitizeDestination(intent);
        if (intentSanitizeDestination.getComponent() != null && intentSanitizeDestination.getComponent().equals(recentTaskInfo.topActivity)) {
            intentSanitizeDestination.addFlags(805306368);
        }
        appTask.startActivity(activity, intentSanitizeDestination, null);
        m0.a("z5K0XR5J3MzplKdAGAjGyvKT4V0USQ==\n", "nf3BKXtpsqM=\n");
        m0.a("dgH5VjQf\n", "VnWYJV8/Y6U=\n");
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