package com.android.launcher3.notification;

import android.app.Notification;
import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.service.notification.NotificationListenerService;
import android.service.notification.StatusBarNotification;
import android.text.TextUtils;
import android.util.ArraySet;
import android.util.Pair;
import androidx.core.app.NotificationCompat;
import app.lawnchair.h2;
import com.android.launcher3.util.Executors;
import com.android.launcher3.util.PackageUserKey;
import com.android.launcher3.util.SettingsCache;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.function.Predicate;
import java.util.stream.Collectors;

/* JADX INFO: loaded from: classes4.dex */
public class NotificationListener extends NotificationListenerService {
    private static final int MSG_NOTIFICATION_FULL_REFRESH = 3;
    private static final int MSG_NOTIFICATION_POSTED = 1;
    private static final int MSG_NOTIFICATION_REMOVED = 2;
    private static final int MSG_RANKING_UPDATE = 4;
    public static final String TAG = "NotificationListener";
    private static boolean sIsConnected;
    private static NotificationListener sNotificationListenerInstance;
    private static final ArraySet<NotificationsChangedListener> sNotificationsChangedListeners = new ArraySet<>();
    private h2 mNotificationManager;
    private SettingsCache.OnChangeListener mNotificationSettingsChangedListener;
    private SettingsCache mSettingsCache;
    private final NotificationListenerService.Ranking mTempRanking = new NotificationListenerService.Ranking();
    private final Map<String, NotificationGroup> mNotificationGroupMap = new HashMap();
    private final Map<String, String> mNotificationGroupKeyMap = new HashMap();
    private final Handler mWorkerHandler = new Handler(Executors.MODEL_EXECUTOR.getLooper(), new Handler.Callback() { // from class: c8.d
        @Override // android.os.Handler.Callback
        public final boolean handleMessage(Message message) {
            return this.f40672a.handleWorkerMessage(message);
        }
    });
    private final Handler mUiHandler = new Handler(Looper.getMainLooper(), new Handler.Callback() { // from class: c8.e
        @Override // android.os.Handler.Callback
        public final boolean handleMessage(Message message) {
            return this.f40673a.handleUiMessage(message);
        }
    });

    public interface NotificationsChangedListener {
        void onNotificationFullRefresh(List<StatusBarNotification> list);

        void onNotificationPosted(PackageUserKey packageUserKey, NotificationKeyData notificationKeyData);

        void onNotificationRemoved(PackageUserKey packageUserKey, NotificationKeyData notificationKeyData);
    }

    public NotificationListener() {
        sNotificationListenerInstance = this;
    }

    public static void addNotificationsChangedListener(final NotificationsChangedListener notificationsChangedListener) {
        if (notificationsChangedListener == null) {
            return;
        }
        sNotificationsChangedListeners.add(notificationsChangedListener);
        NotificationListener instanceIfConnected = getInstanceIfConnected();
        if (instanceIfConnected != null) {
            instanceIfConnected.onNotificationFullRefresh();
        } else {
            Executors.MODEL_EXECUTOR.submit(new Callable() { // from class: c8.f
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    return Executors.MAIN_EXECUTOR.submit(new Runnable() { // from class: c8.h
                        @Override // java.lang.Runnable
                        public final void run() {
                            notificationsChangedListener.onNotificationFullRefresh(Collections.EMPTY_LIST);
                        }
                    });
                }
            });
        }
    }

    private StatusBarNotification[] getActiveNotificationsSafely(String[] strArr) {
        StatusBarNotification[] activeNotifications;
        try {
            activeNotifications = getActiveNotifications(strArr);
        } catch (SecurityException | RuntimeException unused) {
            activeNotifications = null;
        }
        return activeNotifications == null ? new StatusBarNotification[0] : activeNotifications;
    }

    public static NotificationListener getInstanceIfConnected() {
        if (sIsConnected) {
            return sNotificationListenerInstance;
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean handleUiMessage(Message message) {
        int i10 = message.what;
        if (i10 == 1) {
            ArraySet<NotificationsChangedListener> arraySet = sNotificationsChangedListeners;
            if (arraySet.size() > 0) {
                Pair pair = (Pair) message.obj;
                Iterator<NotificationsChangedListener> it = arraySet.iterator();
                while (it.hasNext()) {
                    it.next().onNotificationPosted((PackageUserKey) pair.first, (NotificationKeyData) pair.second);
                }
            }
        } else if (i10 == 2) {
            ArraySet<NotificationsChangedListener> arraySet2 = sNotificationsChangedListeners;
            if (arraySet2.size() > 0) {
                Pair pair2 = (Pair) message.obj;
                Iterator<NotificationsChangedListener> it2 = arraySet2.iterator();
                while (it2.hasNext()) {
                    it2.next().onNotificationRemoved((PackageUserKey) pair2.first, (NotificationKeyData) pair2.second);
                }
            }
        } else if (i10 == 3) {
            ArraySet<NotificationsChangedListener> arraySet3 = sNotificationsChangedListeners;
            if (arraySet3.size() > 0) {
                Iterator<NotificationsChangedListener> it3 = arraySet3.iterator();
                while (it3.hasNext()) {
                    it3.next().onNotificationFullRefresh((List) message.obj);
                }
            }
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean handleWorkerMessage(Message message) {
        int i10 = message.what;
        if (i10 == 1) {
            StatusBarNotification statusBarNotification = (StatusBarNotification) message.obj;
            this.mUiHandler.obtainMessage(notificationIsValidForUI(statusBarNotification) ? 1 : 2, toKeyPair(statusBarNotification)).sendToTarget();
            return true;
        }
        if (i10 == 2) {
            StatusBarNotification statusBarNotification2 = (StatusBarNotification) message.obj;
            this.mUiHandler.obtainMessage(2, toKeyPair(statusBarNotification2)).sendToTarget();
            NotificationGroup notificationGroup = this.mNotificationGroupMap.get(statusBarNotification2.getGroupKey());
            String key = statusBarNotification2.getKey();
            if (notificationGroup != null) {
                notificationGroup.removeChildKey(key);
                if (notificationGroup.isEmpty()) {
                    this.mNotificationGroupMap.remove(statusBarNotification2.getGroupKey());
                }
            }
            return true;
        }
        if (i10 == 3) {
            this.mUiHandler.obtainMessage(message.what, sIsConnected ? (List) Arrays.stream(getActiveNotificationsSafely(null)).filter(new Predicate() { // from class: c8.c
                @Override // java.util.function.Predicate
                public final boolean test(Object obj) {
                    return this.f40671a.notificationIsValidForUI((StatusBarNotification) obj);
                }
            }).collect(Collectors.toList()) : new ArrayList()).sendToTarget();
            return true;
        }
        if (i10 != 4) {
            return false;
        }
        for (StatusBarNotification statusBarNotification3 : getActiveNotificationsSafely(((NotificationListenerService.RankingMap) message.obj).getOrderedKeys())) {
            updateGroupKeyIfNecessary(statusBarNotification3);
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean notificationIsValidForUI(StatusBarNotification statusBarNotification) {
        Notification notification = statusBarNotification.getNotification();
        updateGroupKeyIfNecessary(statusBarNotification);
        getCurrentRanking().getRanking(statusBarNotification.getKey(), this.mTempRanking);
        if (!this.mTempRanking.canShowBadge()) {
            return false;
        }
        if (!this.mTempRanking.getChannel().getId().equals("miscellaneous") || (notification.flags & 2) == 0) {
            return (notification.flags & 512) == 0 && !(TextUtils.isEmpty(notification.extras.getCharSequence(NotificationCompat.EXTRA_TITLE)) && TextUtils.isEmpty(notification.extras.getCharSequence(NotificationCompat.EXTRA_TEXT)));
        }
        return false;
    }

    private void onNotificationFullRefresh() {
        this.mWorkerHandler.obtainMessage(3).sendToTarget();
        this.mNotificationManager.l();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void onNotificationSettingsChanged(boolean z10) {
        if (z10 || !sIsConnected) {
            return;
        }
        requestUnbind();
    }

    public static void removeNotificationsChangedListener(NotificationsChangedListener notificationsChangedListener) {
        if (notificationsChangedListener != null) {
            sNotificationsChangedListeners.remove(notificationsChangedListener);
        }
    }

    private static Pair<PackageUserKey, NotificationKeyData> toKeyPair(StatusBarNotification statusBarNotification) {
        return Pair.create(PackageUserKey.fromNotification(statusBarNotification), NotificationKeyData.fromNotification(statusBarNotification));
    }

    private void updateGroupKeyIfNecessary(StatusBarNotification statusBarNotification) {
        String key = statusBarNotification.getKey();
        String str = this.mNotificationGroupKeyMap.get(key);
        String groupKey = statusBarNotification.getGroupKey();
        if (str == null || !str.equals(groupKey)) {
            this.mNotificationGroupKeyMap.put(key, groupKey);
            if (str != null && this.mNotificationGroupMap.containsKey(str)) {
                NotificationGroup notificationGroup = this.mNotificationGroupMap.get(str);
                notificationGroup.removeChildKey(key);
                if (notificationGroup.isEmpty()) {
                    this.mNotificationGroupMap.remove(str);
                }
            }
        }
        if (!statusBarNotification.isGroup() || groupKey == null) {
            return;
        }
        NotificationGroup notificationGroup2 = this.mNotificationGroupMap.get(groupKey);
        if (notificationGroup2 == null) {
            notificationGroup2 = new NotificationGroup();
            this.mNotificationGroupMap.put(groupKey, notificationGroup2);
        }
        if ((statusBarNotification.getNotification().flags & 512) != 0) {
            notificationGroup2.setGroupSummaryKey(key);
        } else {
            notificationGroup2.addChildKey(key);
        }
    }

    @Override // android.app.Service
    public void onCreate() {
        super.onCreate();
        this.mNotificationManager = (h2) h2.f35146f.lambda$get$1(this);
    }

    @Override // android.service.notification.NotificationListenerService
    public void onListenerConnected() {
        super.onListenerConnected();
        sIsConnected = true;
        this.mSettingsCache = (SettingsCache) SettingsCache.INSTANCE.lambda$get$1(this);
        SettingsCache.OnChangeListener onChangeListener = new SettingsCache.OnChangeListener() { // from class: c8.g
            @Override // com.android.launcher3.util.SettingsCache.OnChangeListener
            public final void onSettingsChanged(boolean z10) {
                this.f40675a.onNotificationSettingsChanged(z10);
            }
        };
        this.mNotificationSettingsChangedListener = onChangeListener;
        SettingsCache settingsCache = this.mSettingsCache;
        Uri uri = SettingsCache.NOTIFICATION_BADGING_URI;
        settingsCache.register(uri, onChangeListener);
        onNotificationSettingsChanged(this.mSettingsCache.getValue(uri));
        onNotificationFullRefresh();
    }

    @Override // android.service.notification.NotificationListenerService
    public void onListenerDisconnected() {
        super.onListenerDisconnected();
        sIsConnected = false;
        this.mSettingsCache.unregister(SettingsCache.NOTIFICATION_BADGING_URI, this.mNotificationSettingsChangedListener);
        onNotificationFullRefresh();
    }

    @Override // android.service.notification.NotificationListenerService
    public void onNotificationPosted(StatusBarNotification statusBarNotification) {
        if (statusBarNotification != null) {
            this.mWorkerHandler.obtainMessage(1, statusBarNotification).sendToTarget();
            this.mNotificationManager.n(statusBarNotification);
        }
    }

    @Override // android.service.notification.NotificationListenerService
    public void onNotificationRankingUpdate(NotificationListenerService.RankingMap rankingMap) {
        this.mWorkerHandler.obtainMessage(4, rankingMap).sendToTarget();
    }

    @Override // android.service.notification.NotificationListenerService
    public void onNotificationRemoved(StatusBarNotification statusBarNotification) {
        if (statusBarNotification != null) {
            this.mWorkerHandler.obtainMessage(2, statusBarNotification).sendToTarget();
            this.mNotificationManager.o(statusBarNotification);
        }
    }
}