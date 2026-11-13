package com.neeeex.eraser.push;

import android.app.Notification;
import android.app.NotificationChannel;
import android.app.NotificationChannelGroup;
import android.app.NotificationManager;
import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import android.service.notification.StatusBarNotification;
import com.neeeex.eraser.m0;
import com.neeeex.eraser.utils.c0;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.UUID;
import p003kotlin.jvm.functions.Function0;
import p003kotlin.jvm.internal.v;
import p003kotlin.jvm.internal.v0;

/* JADX INFO: loaded from: classes7.dex */
public final class s {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f65547a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f65548b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Function0 f65549c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final tl.n f65550d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Handler f65551e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Map f65552f;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final String f65546h = m0.a("EUGSbMhERp4aVJJo2WMYgwxQqH3CVw2C\n", "fyT3Ca08aOw=\n");

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final b f65545g = new b(null);

    public static final /* synthetic */ class a extends p003kotlin.jvm.internal.s implements Function0 {
        public static final a INSTANCE = new a();

        public a() {
            super(0, com.neeeex.eraser.module.report.bytedance.a.class, m0.a("QrOrSK//\n", "K8DqPNuNFJU=\n"), m0.a("q/0SSvfxbFOY\n", "wo5TPoODRHo=\n"), 0);
        }

        @Override // p003kotlin.jvm.functions.Function0
        public final Boolean invoke() {
            return Boolean.valueOf(com.neeeex.eraser.module.report.bytedance.a.k());
        }
    }

    public static final class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f65553a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f65554b;

        public c(String str, int i10) {
            this.f65553a = str;
            this.f65554b = i10;
        }

        public final int a() {
            return this.f65554b;
        }

        public final String b() {
            return this.f65553a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            return v.c(this.f65553a, cVar.f65553a) && this.f65554b == cVar.f65554b;
        }

        public int hashCode() {
            String str = this.f65553a;
            return ((str == null ? 0 : str.hashCode()) * 31) + Integer.hashCode(this.f65554b);
        }

        public String toString() {
            return "Key(tag=" + this.f65553a + ", id=" + this.f65554b + ")";
        }
    }

    public s(String str, String str2, Function0 function0, tl.n nVar) {
        m0.a("QyR/xUN7IKVE\n", "IEweqy0eTOw=\n");
        str.getClass();
        m0.a("smsnxY3VodCwbiM=\n", "0QNGq+OwzZ4=\n");
        str2.getClass();
        m0.a("taYai5JCApupoT6b\n", "3NVb/+Ywa/k=\n");
        function0.getClass();
        m0.a("kMNc0UqsndWKw2rA\n", "+bAPpDrc77A=\n");
        nVar.getClass();
        this.f65547a = str;
        this.f65548b = str2;
        this.f65549c = function0;
        this.f65550d = nVar;
        this.f65551e = new Handler(Looper.getMainLooper());
        this.f65552f = new LinkedHashMap();
    }

    public static boolean a(Context context, boolean z10) {
        m0.a("9qaJJvwI3Ia8spVt\n", "ytPnU49tuKY=\n");
        context.getClass();
        return !z10 && c0.f66142a.h();
    }

    public static void b(s sVar, Context context, c cVar, Notification notification, String str, int i10, v0 v0Var, boolean z10) {
        Runnable runnable;
        Object obj = v0Var.element;
        if (obj == null) {
            v.n(m0.a("O9RPRg==\n", "T7U8LYsvWtE=\n"));
            runnable = null;
        } else {
            runnable = (Runnable) obj;
        }
        sVar.i(context, cVar, notification, str, i10, runnable, z10);
    }

    public final boolean c(Notification notification) {
        return ((Boolean) this.f65549c.invoke()).booleanValue() && (notification.flags & 578) == 0;
    }

    public final synchronized void d(String str, int i10) {
        Runnable runnable = (Runnable) this.f65552f.remove(new c(str, i10));
        if (runnable != null) {
            this.f65551e.removeCallbacks(runnable);
        }
    }

    public final Notification e(Context context, Notification notification) {
        m0.a("TlK30fLosA==\n", "LT3ZpZeQxIA=\n");
        context.getClass();
        m0.a("G39QBVM2qOQ=\n", "dA05YjpYyYg=\n");
        notification.getClass();
        Notification notificationBuild = Notification.Builder.recoverBuilder(context, notification.clone()).setChannelId(this.f65547a).setSound(null).setVibrate(null).setDefaults(0).setOnlyAlertOnce(false).build();
        m0.a("XhfVPNlZ3cQSSw==\n", "PGK8UL1x8+o=\n");
        notificationBuild.getClass();
        return notificationBuild;
    }

    public final boolean f(NotificationManager notificationManager) {
        m0.a("3bsfo61xrg==\n", "sNpxwsoU3NQ=\n");
        notificationManager.getClass();
        NotificationChannel notificationChannel = new NotificationChannel(this.f65547a, this.f65548b, 4);
        notificationChannel.setSound(null, null);
        notificationChannel.enableVibration(false);
        notificationChannel.setShowBadge(true);
        notificationChannel.setLockscreenVisibility(1);
        notificationManager.createNotificationChannel(notificationChannel);
        NotificationChannel notificationChannel2 = notificationManager.getNotificationChannel(this.f65547a);
        return (notificationChannel2 == null || g(notificationManager, notificationChannel2) || notificationChannel2.getSound() != null || notificationChannel2.shouldVibrate()) ? false : true;
    }

    public final boolean g(NotificationManager notificationManager, NotificationChannel notificationChannel) {
        boolean zC;
        if (notificationChannel.getImportance() == 0) {
            return true;
        }
        if (Build.VERSION.SDK_INT >= 28) {
            String group = notificationChannel.getGroup();
            if (group != null) {
                NotificationChannelGroup notificationChannelGroup = notificationManager.getNotificationChannelGroup(group);
                zC = v.c(notificationChannelGroup != null ? Boolean.valueOf(notificationChannelGroup.isBlocked()) : null, Boolean.TRUE);
            } else {
                zC = false;
            }
            if (zC) {
                return true;
            }
        }
        return false;
    }

    public final synchronized void h(Context context, int i10, Notification notification, String str, boolean z10, boolean z11) throws Throwable {
        Throwable th2;
        Notification notificationBuild;
        try {
            try {
                m0.a("EKqxtKWhfg==\n", "c8XfwMDZCpE=\n");
                context.getClass();
                m0.a("BUeafgzXv3wfQYF5\n", "ayjuF2q+3B0=\n");
                notification.getClass();
                Context applicationContext = context.getApplicationContext();
                NotificationManager notificationManager = (NotificationManager) applicationContext.getSystemService(NotificationManager.class);
                c cVar = new c(str, i10);
                Runnable runnable = (Runnable) this.f65552f.remove(cVar);
                if (runnable != null) {
                    try {
                        this.f65551e.removeCallbacks(runnable);
                    } catch (Throwable th3) {
                        th2 = th3;
                    }
                }
                e eVar = e.f65494a;
                notificationManager.getClass();
                eVar.b(notificationManager, str, i10);
                notificationManager.cancel(str, i10);
                boolean z12 = z10 && c(notification);
                if (z12) {
                    Notification.Builder builderRecoverBuilder = Notification.Builder.recoverBuilder(applicationContext, notification.clone());
                    builderRecoverBuilder.getExtras().putString(f65546h, UUID.randomUUID().toString());
                    notificationBuild = builderRecoverBuilder.build();
                } else {
                    notificationBuild = notification;
                }
                notificationBuild.getClass();
                Notification notificationM = eVar.m(applicationContext, notificationManager, str, i10, notificationBuild, ((Boolean) this.f65549c.invoke()).booleanValue());
                notificationManager.notify(str, i10, notificationM);
                if (z12) {
                    String channelId = notification.getChannelId();
                    m0.a("T86hcAyten5Nx5xXTOI6PgE=\n", "KKvVM2TMFBA=\n");
                    channelId.getClass();
                    j(applicationContext, cVar, notificationM, channelId, 3, z11);
                    return;
                }
                return;
            } catch (Throwable th4) {
                th = th4;
                th2 = th;
            }
        } catch (Throwable th5) {
            th = th5;
            th2 = th;
        }
        throw th2;
    }

    /* JADX WARN: Code duplicated, block: B:59:0x0122  */
    /* JADX WARN: Code duplicated, block: B:64:0x0131 A[EDGE_INSN: B:64:0x0131->B:65:0x0133 BREAK  A[LOOP:0: B:36:0x0085->B:66:0x0139]] */
    public final synchronized void i(Context context, c cVar, Notification notification, String str, int i10, Runnable runnable, boolean z10) {
        s sVar = this;
        Context context2 = context;
        c cVar2 = cVar;
        synchronized (this) {
            if (sVar.f65552f.get(cVar2) != runnable) {
                return;
            }
            sVar.f65552f.remove(cVar2);
            try {
                try {
                    if (sVar.c(notification) && ui.a.f100035a.a(context2) && !((Boolean) sVar.f65550d.invoke(context2, Boolean.valueOf(z10))).booleanValue()) {
                        NotificationManager notificationManager = (NotificationManager) context2.getSystemService(NotificationManager.class);
                        notificationManager.getClass();
                        if (!sVar.f(notificationManager)) {
                            e.f65494a.c(context2);
                            return;
                        }
                        String str2 = str;
                        NotificationChannel notificationChannel = notificationManager.getNotificationChannel(str2);
                        if (notificationChannel == null) {
                            e.f65494a.c(context2);
                            return;
                        }
                        if (sVar.g(notificationManager, notificationChannel)) {
                            e.f65494a.c(context2);
                            return;
                        }
                        StatusBarNotification[] activeNotifications = notificationManager.getActiveNotifications();
                        m0.a("Tfx8xQCl95tP12fwCrf3jkvtYesNorbDBLch\n", "KpkIhGPRnu0=\n");
                        activeNotifications.getClass();
                        int length = activeNotifications.length;
                        int i11 = 0;
                        while (true) {
                            if (i11 >= length) {
                                e.f65494a.c(context2);
                                return;
                            }
                            StatusBarNotification statusBarNotification = activeNotifications[i11];
                            if (statusBarNotification.getId() == cVar2.a() && v.c(statusBarNotification.getTag(), cVar2.b())) {
                                Bundle bundle = statusBarNotification.getNotification().extras;
                                String str3 = f65546h;
                                if (v.c(bundle.getString(str3), notification.extras.getString(str3)) && statusBarNotification.getNotification().when == notification.when && v.c(statusBarNotification.getNotification().getChannelId(), notification.getChannelId())) {
                                    Notification notificationE = sVar.e(context2, notification);
                                    if (notificationChannel.getImportance() < 3) {
                                        notificationManager.notify(cVar2.b(), cVar2.a(), notificationE);
                                        if (i10 > 1) {
                                            context2 = context;
                                            break;
                                        } else {
                                            context2 = context;
                                            sVar.j(context2, cVar2, notificationE, str2, i10 - 1, z10);
                                            break;
                                        }
                                    }
                                    try {
                                        e eVar = e.f65494a;
                                        if (!eVar.d(notificationManager, cVar2.b(), cVar2.a(), notification)) {
                                            notificationE = eVar.m(context, notificationManager, cVar2.b(), cVar2.a(), notificationE, ((Boolean) sVar.f65549c.invoke()).booleanValue());
                                        }
                                        notificationManager.notify(cVar2.b(), cVar2.a(), notificationE);
                                        if (i10 > 1) {
                                            context2 = context;
                                            break;
                                        } else {
                                            context2 = context;
                                            sVar.j(context2, cVar2, notificationE, str2, i10 - 1, z10);
                                            break;
                                        }
                                    } catch (Exception unused) {
                                        context2 = context;
                                        m0.a("cZQlLthWz5FLkj4p7FrclV6P\n", "P/tRR74/rPA=\n");
                                        cVar.a();
                                    } catch (Throwable th2) {
                                        th = th2;
                                        context2 = context;
                                        e.f65494a.c(context2);
                                        throw th;
                                    }
                                }
                            }
                            i11++;
                            sVar = this;
                            cVar2 = cVar;
                            str2 = str;
                        }
                        e.f65494a.c(context2);
                        return;
                        m0.a("cZQlLthWz5FLkj4p7FrclV6P\n", "P/tRR74/rPA=\n");
                        cVar.a();
                        e.f65494a.c(context2);
                        return;
                    }
                    e.f65494a.c(context2);
                } catch (Exception unused2) {
                }
            } catch (Throwable th3) {
                th = th3;
            }
        }
    }

    public final void j(final Context context, final c cVar, final Notification notification, final String str, final int i10, final boolean z10) {
        Runnable runnable;
        final v0 v0Var = new v0();
        Runnable runnable2 = new Runnable() { // from class: com.neeeex.eraser.push.q
            @Override // java.lang.Runnable
            public final void run() {
                s.b(this.f65537a, context, cVar, notification, str, i10, v0Var, z10);
            }
        };
        v0Var.element = runnable2;
        this.f65552f.put(cVar, runnable2);
        Handler handler = this.f65551e;
        Object obj = v0Var.element;
        if (obj == null) {
            v.n(m0.a("3pG6qQ==\n", "qvDJwlGXK9U=\n"));
            runnable = null;
        } else {
            runnable = (Runnable) obj;
        }
        handler.postAtTime(runnable, SystemClock.uptimeMillis() + 4500);
    }

    public static final class b {
        public /* synthetic */ b(p003kotlin.jvm.internal.m mVar) {
            this();
        }

        public b() {
        }
    }

    public /* synthetic */ s(String str, String str2, Function0 function0, tl.n nVar, int i10, p003kotlin.jvm.internal.m mVar) {
        this(str, str2, (i10 & 4) != 0 ? a.INSTANCE : function0, (i10 & 8) != 0 ? new tl.n() { // from class: com.neeeex.eraser.push.r
            @Override // tl.n
            public final Object invoke(Object obj, Object obj2) {
                return Boolean.valueOf(s.a((Context) obj, ((Boolean) obj2).booleanValue()));
            }
        } : nVar);
    }
}