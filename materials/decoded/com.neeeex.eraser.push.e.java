package com.neeeex.eraser.push;

import android.app.Notification;
import android.app.NotificationChannel;
import android.app.NotificationChannelGroup;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.service.notification.StatusBarNotification;
import com.neeeex.eraser.m0;
import java.util.ArrayList;
import java.util.UUID;
import p003kotlin.jvm.internal.v;
import p003kotlin.text.e0;

/* JADX INFO: loaded from: classes7.dex */
public final class e {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static Runnable f65502i;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final String f65495b = "neeeex_notify_channel_card_summaries" /* decoded XOR */;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final String f65496c = "neeeex_card_summary:" /* decoded XOR */;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final String f65497d = "neeeex_card_owner_id" /* decoded XOR */;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final String f65498e = "neeeex_card_owner_tag" /* decoded XOR */;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final String f65499f = "neeeex_card_summary_token" /* decoded XOR */;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final String f65500g = "neeeex_card_original_delete" /* decoded XOR */;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final e f65494a = new e();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final Handler f65501h = new Handler(Looper.getMainLooper());

    public static void a(Context context) {
        e eVar = f65494a;
        context.getClass();
        eVar.c(context);
    }

    public static final synchronized void i(Context context) {
        try {
            "context" /* decoded XOR */;
            context.getClass();
            if (Build.VERSION.SDK_INT < 36) {
                return;
            }
            Runnable runnable = f65502i;
            if (runnable != null) {
                f65501h.removeCallbacks(runnable);
            }
            final Context applicationContext = context.getApplicationContext();
            Runnable runnable2 = new Runnable() { // from class: com.neeeex.eraser.push.d
                @Override // java.lang.Runnable
                public final void run() {
                    e.a(applicationContext);
                }
            };
            f65501h.postDelayed(runnable2, 1500L);
            f65502i = runnable2;
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public static final synchronized void l(Context context, String str, int i10, Notification notification) {
        "context" /* decoded XOR */;
        context.getClass();
        "original" /* decoded XOR */;
        notification.getClass();
        NotificationManager notificationManager = (NotificationManager) context.getSystemService(NotificationManager.class);
        e eVar = f65494a;
        notificationManager.getClass();
        eVar.b(notificationManager, str, i10);
        notificationManager.notify(str, i10, n(eVar, context, notificationManager, str, i10, notification, false, 32, null));
    }

    public static /* synthetic */ Notification n(e eVar, Context context, NotificationManager notificationManager, String str, int i10, Notification notification, boolean z10, int i11, Object obj) {
        if ((i11 & 32) != 0) {
            z10 = com.neeeex.eraser.module.report.bytedance.a.k();
        }
        return eVar.m(context, notificationManager, str, i10, notification, z10);
    }

    public final synchronized void b(NotificationManager notificationManager, String str, int i10) {
        "manager" /* decoded XOR */;
        notificationManager.getClass();
        if (Build.VERSION.SDK_INT >= 36) {
            notificationManager.cancel(o(str, i10), i10);
        }
    }

    public final synchronized void c(Context context) {
        try {
            "context" /* decoded XOR */;
            context.getClass();
            if (Build.VERSION.SDK_INT < 36) {
                return;
            }
            try {
                NotificationManager notificationManager = (NotificationManager) context.getSystemService(NotificationManager.class);
                StatusBarNotification[] activeNotifications = notificationManager.getActiveNotifications();
                activeNotifications.getClass();
                ArrayList<StatusBarNotification> arrayList = new ArrayList();
                for (StatusBarNotification statusBarNotification : activeNotifications) {
                    String tag = statusBarNotification.getTag();
                    if (tag != null && e0.U(tag, f65496c, false, 2, null) && v.c(statusBarNotification.getNotification().getChannelId(), f65495b) && System.currentTimeMillis() - statusBarNotification.getPostTime() >= 1000) {
                        arrayList.add(statusBarNotification);
                    }
                }
                for (StatusBarNotification statusBarNotification2 : arrayList) {
                    int i10 = statusBarNotification2.getNotification().extras.getInt(f65497d);
                    String string = statusBarNotification2.getNotification().extras.getString(f65498e);
                    String string2 = statusBarNotification2.getNotification().extras.getString(f65499f);
                    StatusBarNotification[] activeNotifications2 = notificationManager.getActiveNotifications();
                    activeNotifications2.getClass();
                    for (StatusBarNotification statusBarNotification3 : activeNotifications2) {
                        if (v.c(statusBarNotification3.getKey(), statusBarNotification2.getKey()) && v.c(statusBarNotification3.getNotification().extras.getString(f65499f), string2)) {
                            int length = activeNotifications2.length;
                            int i11 = 0;
                            while (true) {
                                if (i11 >= length) {
                                    notificationManager.cancel(statusBarNotification2.getTag(), statusBarNotification2.getId());
                                    break;
                                }
                                StatusBarNotification statusBarNotification4 = activeNotifications2[i11];
                                if (statusBarNotification4.getId() == i10 && v.c(statusBarNotification4.getTag(), string) && v.c(statusBarNotification4.getNotification().extras.getString(f65499f), string2)) {
                                    break;
                                } else {
                                    i11++;
                                }
                            }
                        }
                    }
                }
            } catch (Exception unused) {
                "CardSummary" /* decoded XOR */;
                "Unable to clean orphan summaries" /* decoded XOR */;
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public final boolean d(NotificationManager notificationManager, String str, int i10, Notification notification) {
        "manager" /* decoded XOR */;
        notificationManager.getClass();
        "child" /* decoded XOR */;
        notification.getClass();
        if (h(notification)) {
            StatusBarNotification[] activeNotifications = notificationManager.getActiveNotifications();
            "getActiveNotifications(...)" /* decoded XOR */;
            activeNotifications.getClass();
            for (StatusBarNotification statusBarNotification : activeNotifications) {
                if (statusBarNotification.getId() == i10 && v.c(statusBarNotification.getTag(), f65494a.o(str, i10)) && v.c(statusBarNotification.getNotification().getChannelId(), f65495b)) {
                    Bundle bundle = statusBarNotification.getNotification().extras;
                    String str2 = f65499f;
                    if (v.c(bundle.getString(str2), notification.extras.getString(str2))) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public final String e(String str) {
        if (str != null) {
            byte[] bytes = str.getBytes(p003kotlin.text.d.f86852b);
            "getBytes(...)" /* decoded XOR */;
            bytes.getClass();
            String string = UUID.nameUUIDFromBytes(bytes).toString();
            if (string != null) {
                return string;
            }
        }
        return "untagged" /* decoded XOR */;
    }

    public final boolean f(NotificationManager notificationManager, NotificationChannel notificationChannel) {
        boolean zC;
        if (notificationChannel.getImportance() == 0) {
            return true;
        }
        String group = notificationChannel.getGroup();
        if (group != null) {
            NotificationChannelGroup notificationChannelGroup = notificationManager.getNotificationChannelGroup(group);
            zC = v.c(notificationChannelGroup != null ? Boolean.valueOf(notificationChannelGroup.isBlocked()) : null, Boolean.TRUE);
        } else {
            zC = false;
        }
        return zC;
    }

    public final boolean g(int i10, boolean z10, int i11) {
        return i10 >= 36 && z10 && (i11 & 578) == 0;
    }

    public final boolean h(Notification notification) {
        "notification" /* decoded XOR */;
        notification.getClass();
        return notification.extras.containsKey(f65499f);
    }

    public final synchronized void j(Context context, Intent intent) {
        try {
            "context" /* decoded XOR */;
            context.getClass();
            "intent" /* decoded XOR */;
            intent.getClass();
            NotificationManager notificationManager = (NotificationManager) context.getSystemService(NotificationManager.class);
            int intExtra = intent.getIntExtra(f65497d, 0);
            String stringExtra = intent.getStringExtra(f65498e);
            String stringExtra2 = intent.getStringExtra(f65499f);
            if (stringExtra2 == null) {
                return;
            }
            StatusBarNotification[] activeNotifications = notificationManager.getActiveNotifications();
            "getActiveNotifications(...)" /* decoded XOR */;
            activeNotifications.getClass();
            ArrayList<StatusBarNotification> arrayList = new ArrayList();
            for (StatusBarNotification statusBarNotification : activeNotifications) {
                if (statusBarNotification.getId() == intExtra && (v.c(statusBarNotification.getTag(), stringExtra) || v.c(statusBarNotification.getTag(), f65494a.o(stringExtra, intExtra)))) {
                    if (v.c(statusBarNotification.getNotification().extras.getString(f65499f), stringExtra2)) {
                        arrayList.add(statusBarNotification);
                    }
                }
            }
            for (StatusBarNotification statusBarNotification2 : arrayList) {
                notificationManager.cancel(statusBarNotification2.getTag(), statusBarNotification2.getId());
            }
            try {
                PendingIntent pendingIntent = (PendingIntent) intent.getParcelableExtra(f65500g);
                if (pendingIntent != null) {
                    pendingIntent.send();
                }
            } catch (PendingIntent.CanceledException unused) {
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public final PendingIntent k(Notification notification) {
        "notification" /* decoded XOR */;
        notification.getClass();
        return h(notification) ? (PendingIntent) notification.extras.getParcelable(f65500g) : notification.deleteIntent;
    }

    public final synchronized Notification m(Context context, NotificationManager notificationManager, String str, int i10, Notification notification, boolean z10) {
        Notification notificationBuild;
        "context" /* decoded XOR */;
        context.getClass();
        "manager" /* decoded XOR */;
        notificationManager.getClass();
        "original" /* decoded XOR */;
        notification.getClass();
        if (!g(Build.VERSION.SDK_INT, z10, notification.flags)) {
            return notification;
        }
        try {
            NotificationChannel notificationChannel = notificationManager.getNotificationChannel(notification.getChannelId());
            if (notificationChannel == null) {
                return notification;
            }
            if (notificationChannel.getImportance() >= 3 && !f(notificationManager, notificationChannel)) {
                String str2 = f65495b;
                NotificationChannel notificationChannel2 = new NotificationChannel(str2, "NexClean notification summaries" /* decoded XOR */, 2);
                notificationChannel2.setSound(null, null);
                notificationChannel2.enableVibration(false);
                notificationChannel2.setShowBadge(false);
                notificationManager.createNotificationChannel(notificationChannel2);
                NotificationChannel notificationChannel3 = notificationManager.getNotificationChannel(str2);
                if (notificationChannel3 == null) {
                    return notification;
                }
                int importance = notificationChannel3.getImportance();
                if (1 <= importance && importance < 3 && notificationChannel3.getSound() == null && !notificationChannel3.shouldVibrate() && !f(notificationManager, notificationChannel3)) {
                    String strO = o(str, i10);
                    String str3 = "neeeex_card:" + i10 + ":" + e(str);
                    String string = UUID.randomUUID().toString();
                    "toString(...)" /* decoded XOR */;
                    string.getClass();
                    Bundle bundle = new Bundle();
                    bundle.putInt(f65497d, i10);
                    bundle.putString(f65498e, str);
                    bundle.putString(f65499f, string);
                    bundle.putParcelable(f65500g, f65494a.k(notification));
                    notificationBuild = Notification.Builder.recoverBuilder(context, notification.clone()).setGroup(str3).setGroupSummary(false).setGroupAlertBehavior(2).setDeleteIntent(PendingIntent.getBroadcast(context, i10, new Intent(context, (Class<?>) NotificationCardDismissReceiver.class).setAction(strO + ":" + string).putExtras(bundle), 201326592)).addExtras(bundle).build();
                    "build(...)" /* decoded XOR */;
                    notificationBuild.getClass();
                    Notification notificationBuild2 = new Notification.Builder(context, str2).setSmallIcon(notification.getSmallIcon()).setContentTitle(notification.extras.getCharSequence("android.title" /* decoded XOR */)).setContentText(notification.extras.getCharSequence("android.text" /* decoded XOR */)).setContentIntent(notification.contentIntent).setWhen(notification.when).setShowWhen(false).setVisibility(notification.visibility).setGroup(str3).setGroupSummary(true).setGroupAlertBehavior(2).setOnlyAlertOnce(true).setAutoCancel(true).setSound(null).setVibrate(null).setDefaults(0).addExtras(bundle).build();
                    "build(...)" /* decoded XOR */;
                    notificationBuild2.getClass();
                    notificationManager.notify(strO, i10, notificationBuild2);
                }
                return notification;
            }
            return notification;
        } catch (Exception unused) {
            b(notificationManager, str, i10);
            "CardSummary" /* decoded XOR */;
            notificationBuild = notification;
        }
        return notificationBuild;
    }

    public final String o(String str, int i10) {
        return "neeeex_card_summary:" + i10 + ":" + e(str);
    }
}