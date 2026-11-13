package com.android.launcher3.notification;

import android.app.Notification;
import android.app.Person;
import android.service.notification.StatusBarNotification;
import androidx.core.app.NotificationCompat;
import com.android.launcher3.Utilities;
import com.android.launcher3.model.data.u;
import com.android.launcher3.notification.NotificationKeyData;
import java.util.ArrayList;
import java.util.function.IntFunction;
import java.util.function.Predicate;

/* JADX INFO: loaded from: classes4.dex */
public class NotificationKeyData {
    public int count;
    public final String notificationKey;
    public final String[] personKeysFromNotification;
    public final String shortcutId;

    private NotificationKeyData(String str, String str2, int i10, String[] strArr) {
        this.notificationKey = str;
        this.shortcutId = str2;
        this.count = Math.max(1, i10);
        this.personKeysFromNotification = strArr;
    }

    public static /* synthetic */ String[] a(int i10) {
        return new String[i10];
    }

    public static /* synthetic */ boolean b(Person person) {
        return person.getKey() != null;
    }

    private static String[] extractPersonKeyOnly(ArrayList<Person> arrayList) {
        return (arrayList == null || arrayList.isEmpty()) ? Utilities.EMPTY_STRING_ARRAY : (String[]) arrayList.stream().filter(new Predicate() { // from class: c8.a
            @Override // java.util.function.Predicate
            public final boolean test(Object obj) {
                return NotificationKeyData.b((Person) obj);
            }
        }).map(new u()).sorted().toArray(new IntFunction() { // from class: c8.b
            @Override // java.util.function.IntFunction
            public final Object apply(int i10) {
                return NotificationKeyData.a(i10);
            }
        });
    }

    public static NotificationKeyData fromNotification(StatusBarNotification statusBarNotification) {
        Notification notification = statusBarNotification.getNotification();
        return new NotificationKeyData(statusBarNotification.getKey(), notification.getShortcutId(), notification.number, extractPersonKeyOnly(notification.extras.getParcelableArrayList(NotificationCompat.EXTRA_PEOPLE_LIST)));
    }

    public boolean equals(Object obj) {
        if (obj instanceof NotificationKeyData) {
            return ((NotificationKeyData) obj).notificationKey.equals(this.notificationKey);
        }
        return false;
    }

    public NotificationKeyData(String str) {
        this(str, null, 1, new String[0]);
    }
}