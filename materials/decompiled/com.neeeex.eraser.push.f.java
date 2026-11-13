package com.neeeex.eraser.push;

import android.app.Notification;
import android.app.NotificationManager;
import android.content.Context;
import com.neeeex.eraser.m0;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes7.dex */
public final class f {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final String f65504b = m0.a("BS+6LEy7+09aOaMlSKGiFBo=\n", "KFzTQCnVj2I=\n");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final f f65503a = new f();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Map f65505c = new LinkedHashMap();

    public final synchronized void a(Context context, String str, int i10) {
        try {
            m0.a("8aGdNVFj3g==\n", "ks7zQTQbqto=\n");
            context.getClass();
            Iterator it = f65505c.values().iterator();
            while (it.hasNext()) {
                ((s) it.next()).d(str, i10);
            }
            NotificationManager notificationManager = (NotificationManager) context.getSystemService(NotificationManager.class);
            e eVar = e.f65494a;
            notificationManager.getClass();
            eVar.b(notificationManager, str, i10);
            notificationManager.cancel(str, i10);
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public final synchronized void b(Context context, String str, int i10, Notification notification, boolean z10, boolean z11) {
        try {
            m0.a("fal+h7eS6A==\n", "HsYQ89LqnBU=\n");
            context.getClass();
            m0.a("qsddjHP4ORqwwUaL\n", "xKgp5RWRWns=\n");
            notification.getClass();
            String str2 = notification.getChannelId() + "-silent-repeat-v2";
            Iterator it = f65505c.values().iterator();
            while (it.hasNext()) {
                ((s) it.next()).d(str, i10);
            }
            Map map = f65505c;
            Object obj = map.get(str2);
            if (obj == null) {
                s sVar = new s(str2, m0.a("hS//4eail7/rOOLP46mStLlqr9Hjq5O/v2r1x/qil6Xi\n", "y0qHoorH9tE=\n"), null, null, 12, null);
                map.put(str2, sVar);
                obj = sVar;
            }
            ((s) obj).h(context, i10, notification, str, z10, z11);
        } catch (Throwable th2) {
            throw th2;
        }
    }
}