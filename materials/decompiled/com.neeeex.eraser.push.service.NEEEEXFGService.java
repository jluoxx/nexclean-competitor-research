package com.neeeex.eraser.push.service;

import android.app.Service;
import android.content.Context;
import android.content.Intent;
import android.os.IBinder;
import com.neeeex.eraser.launcher.LauncherReport;
import com.neeeex.eraser.m0;
import fl.t;
import p003kotlin.Metadata;
import p003kotlin.jvm.internal.m;
import qi.a;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u000b\u0018\u0000 \u00152\u00020\u0001:\u0001\u0015B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0005\u0010\u0003J\u001b\u0010\t\u001a\u0004\u0018\u00010\b2\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0016¢\u0006\u0004\b\t\u0010\nJ)\u0010\u000e\u001a\u00020\u000b2\b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0010\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0010\u0010\u0003J\u001f\u0010\u0012\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\u000b2\u0006\u0010\u0011\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u0017\u0010\u0012\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u0012\u0010\u0014¨\u0006\u0016"}, d2 = {"Lcom/neeeex/eraser/push/service/NEEEEXFGService;", "Landroid/app/Service;", "<init>", "()V", "Lfl/m0;", "onCreate", "Landroid/content/Intent;", "intent", "Landroid/os/IBinder;", "onBind", "(Landroid/content/Intent;)Landroid/os/IBinder;", "", "flags", "startId", "onStartCommand", "(Landroid/content/Intent;II)I", "onDestroy", "fgsType", "onTimeout", "(II)V", "(I)V", "a", "tool-feature_productionRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class NEEEEXFGService extends Service {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static volatile boolean f65556b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final String f65557c = m0.a("v8sInMSTfOWlzROb/Ylr5aPQI5PNiHrjo8sJm8ala+28wQ==\n", "0aR89aL6H4Q=\n");

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    @Override // android.app.Service
    public IBinder onBind(Intent intent) {
        return null;
    }

    @Override // android.app.Service
    public void onCreate() {
        super.onCreate();
        f65556b = false;
    }

    @Override // android.app.Service
    public void onDestroy() {
        try {
            stopForeground(2);
        } catch (Throwable unused) {
        }
        super.onDestroy();
        f65556b = false;
    }

    @Override // android.app.Service
    public int onStartCommand(Intent intent, int flags, int startId) {
        try {
            startForeground(126666, a.f92153a.g(this, true));
            f65556b = true;
            LauncherReport.INSTANCE.event(m0.a("t9IE1qE++sW/2SnAoz7j2bLYKcCyLefEtNk=\n", "0b12s8ZMlbA=\n"), new t[0]);
            return 1;
        } catch (Throwable unused) {
            f65556b = false;
            try {
                stopForeground(2);
            } catch (Throwable unused2) {
            }
            try {
                stopSelf(startId);
            } catch (Throwable unused3) {
            }
            return 2;
        }
    }

    public void onTimeout(int startId, int fgsType) {
        f65556b = false;
        try {
            stopForeground(2);
        } catch (Throwable unused) {
        }
        try {
            stopSelf(startId);
        } catch (Throwable unused2) {
        }
        super.onTimeout(startId, fgsType);
    }

    /* JADX INFO: renamed from: com.neeeex.eraser.push.service.NEEEEXFGService$a, reason: from kotlin metadata */
    public static final class Companion {
        public /* synthetic */ Companion(m mVar) {
            this();
        }

        public final boolean a() {
            return NEEEEXFGService.f65556b;
        }

        public final void b(Context context) {
            m0.a("0l/GWmquYw==\n", "sTCoLg/WFwM=\n");
            context.getClass();
            if (a.f92153a.d(context)) {
                try {
                    context.startForegroundService(new Intent(context, (Class<?>) NEEEEXFGService.class));
                } catch (Throwable th2) {
                    th2.printStackTrace();
                }
            }
        }

        public Companion() {
        }
    }

    @Override // android.app.Service
    public void onTimeout(int startId) {
        f65556b = false;
        try {
            stopForeground(2);
        } catch (Throwable unused) {
        }
        try {
            stopSelf(startId);
        } catch (Throwable unused2) {
        }
        super.onTimeout(startId);
    }
}