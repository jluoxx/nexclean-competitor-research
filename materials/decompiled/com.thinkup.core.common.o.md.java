package com.thinkup.core.common.o;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.util.Base64;
import java.lang.reflect.Method;
import java.nio.charset.StandardCharsets;
import v3.a;

/* JADX INFO: loaded from: classes7.dex */
public class md {

    /* JADX INFO: renamed from: d0, reason: collision with root package name */
    private static Method f73009d0 = null;

    /* JADX INFO: renamed from: dd, reason: collision with root package name */
    private static Method f73010dd = null;

    /* JADX INFO: renamed from: dm, reason: collision with root package name */
    private static volatile md f73011dm = null;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private static final String f73012m = "MixedLBM_CORE";

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static volatile boolean f73013n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private static Method f73014o;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private static Method f73015q;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    Context f73016d;

    private md(Context context) {
        this.f73016d = context;
    }

    private static String d(String str) {
        if (str.isEmpty()) {
            return null;
        }
        try {
            return new String(Base64.decode(str, 0), StandardCharsets.UTF_8);
        } catch (IllegalArgumentException e10) {
            e10.printStackTrace();
            return null;
        } catch (Exception e11) {
            e11.printStackTrace();
            return null;
        }
    }

    private static Object m(Context context) {
        if (!f73013n) {
            synchronized (md.class) {
                try {
                    if (!f73013n) {
                        try {
                            Class<?> cls = Class.forName(d("YW5kcm9pZC5zdXBwb3J0LnY0LmNvbnRlbnQuTG9jYWxCcm9hZGNhc3RNYW5hZ2Vy"));
                            f73014o = cls.getMethod("getInstance", Context.class);
                            f73015q = cls.getMethod("registerReceiver", BroadcastReceiver.class, IntentFilter.class);
                            f73009d0 = cls.getMethod("unregisterReceiver", BroadcastReceiver.class);
                            f73010dd = cls.getMethod("sendBroadcast", Intent.class);
                        } catch (Throwable unused) {
                            f73014o = null;
                        }
                        f73013n = true;
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        Method method = f73014o;
        if (method == null) {
            return null;
        }
        try {
            return method.invoke(null, context);
        } catch (Throwable unused2) {
            return null;
        }
    }

    public final void d(BroadcastReceiver broadcastReceiver, IntentFilter intentFilter) {
        Method method;
        try {
            a.b(this.f73016d).c(broadcastReceiver, intentFilter);
        } catch (Throwable unused) {
            Object objM = m(this.f73016d);
            if (objM == null || (method = f73015q) == null) {
                return;
            }
            try {
                method.invoke(objM, broadcastReceiver, intentFilter);
            } catch (Throwable unused2) {
            }
        }
    }

    public final void d(BroadcastReceiver broadcastReceiver) {
        Method method;
        try {
            a.b(this.f73016d).e(broadcastReceiver);
        } catch (Throwable unused) {
            Object objM = m(this.f73016d);
            if (objM == null || (method = f73009d0) == null) {
                return;
            }
            try {
                method.invoke(objM, broadcastReceiver);
            } catch (Throwable unused2) {
            }
        }
    }

    public final void d(Intent intent) {
        Method method;
        try {
            a.b(this.f73016d).d(intent);
        } catch (Throwable unused) {
            Object objM = m(this.f73016d);
            if (objM == null || (method = f73010dd) == null) {
                return;
            }
            try {
                method.invoke(objM, intent);
            } catch (Throwable unused2) {
            }
        }
    }

    public static md d(Context context) {
        if (f73011dm == null) {
            synchronized (md.class) {
                try {
                    if (f73011dm == null) {
                        f73011dm = new md(context.getApplicationContext());
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        return f73011dm;
    }
}