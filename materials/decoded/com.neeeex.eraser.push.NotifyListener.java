package com.neeeex.eraser.push;

import android.app.NotificationManager;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.Uri;
import android.os.Build;
import android.os.SystemClock;
import android.service.notification.StatusBarNotification;
import com.neeeex.eraser.R$string;
import com.neeeex.eraser.utils.b0;
import com.neeeex.eraser.utils.c0;
import com.neeeex.eraser.y;
import fl.m0;
import fl.t;
import fl.u;
import fl.v;
import gq.v0;
import kotlinx.coroutines.f1;
import kotlinx.coroutines.p0;
import kotlinx.coroutines.q0;
import kotlinx.coroutines.x2;
import kotlinx.coroutines.z0;
import p003kotlin.text.k0;
import ri.f0;
import ri.i0;

/* JADX INFO: loaded from: classes7.dex */
public final class NotifyListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final NotifyListener f65464a = new NotifyListener();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final p0 f65465b = q0.a(x2.b(null, 1, null).plus(f1.a()));

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static boolean f65466c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static long f65467d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static long f65468e;

    public static final class a extends ll.m implements tl.n {
        private /* synthetic */ Object L$0;
        int label;

        public a(kl.f<? super a> fVar) {
            super(2, fVar);
        }

        @Override // ll.a
        public final kl.f<m0> create(Object obj, kl.f<?> fVar) {
            a aVar = new a(fVar);
            aVar.L$0 = obj;
            return aVar;
        }

        @Override // tl.n
        public final Object invoke(p0 p0Var, kl.f<? super m0> fVar) {
            return ((a) create(p0Var, fVar)).invokeSuspend(m0.f80959a);
        }

        @Override // ll.a
        public final Object invokeSuspend(Object obj) {
            p0 p0Var = (p0) this.L$0;
            Object objF = p003kotlin.coroutines.intrinsics.c.f();
            int i10 = this.label;
            if (i10 == 0) {
                v.b(obj);
                this.L$0 = p0Var;
                this.label = 1;
                if (z0.b(500L, this) != objF) {
                }
                return objF;
            }
            if (i10 != 1 && i10 != 2) {
                v0.a("call to 'resume' before 'invoke' with coroutine" /* decoded XOR */);
                return null;
            }
            v.b(obj);
            while (q0.g(p0Var)) {
                try {
                    u.a aVar = u.Companion;
                    NotifyListener.f65464a.n();
                    u.m372constructorimpl(m0.f80959a);
                } catch (Throwable th2) {
                    u.a aVar2 = u.Companion;
                    u.m372constructorimpl(v.a(th2));
                }
                this.L$0 = p0Var;
                this.label = 2;
                if (z0.b(5000L, this) == objF) {
                    return objF;
                }
            }
            return m0.f80959a;
        }
    }

    public static final class b extends ll.m implements tl.n {
        private /* synthetic */ Object L$0;
        int label;

        public b(kl.f<? super b> fVar) {
            super(2, fVar);
        }

        @Override // ll.a
        public final kl.f<m0> create(Object obj, kl.f<?> fVar) {
            b bVar = new b(fVar);
            bVar.L$0 = obj;
            return bVar;
        }

        @Override // tl.n
        public final Object invoke(p0 p0Var, kl.f<? super m0> fVar) {
            return ((b) create(p0Var, fVar)).invokeSuspend(m0.f80959a);
        }

        @Override // ll.a
        public final Object invokeSuspend(Object obj) {
            p0 p0Var = (p0) this.L$0;
            Object objF = p003kotlin.coroutines.intrinsics.c.f();
            int i10 = this.label;
            if (i10 == 0) {
                v.b(obj);
                this.L$0 = p0Var;
                this.label = 1;
                if (z0.b(500L, this) != objF) {
                }
                return objF;
            }
            if (i10 != 1 && i10 != 2) {
                v0.a("call to 'resume' before 'invoke' with coroutine" /* decoded XOR */);
                return null;
            }
            v.b(obj);
            while (q0.g(p0Var)) {
                NotifyListener notifyListener = NotifyListener.f65464a;
                this.L$0 = p0Var;
                this.label = 2;
                if (notifyListener.q(this) == objF) {
                    return objF;
                }
            }
            return m0.f80959a;
        }
    }

    public final synchronized void i(Context context) {
        "context" /* decoded XOR */;
        context.getClass();
        if (f65466c) {
            return;
        }
        f65466c = true;
        o(context);
        p();
    }

    public final BroadcastReceiver j() {
        return new BroadcastReceiver() { // from class: com.neeeex.eraser.push.NotifyListener$createAppChangeReceiver$1
            @Override // android.content.BroadcastReceiver
            public void onReceive(Context context, Intent intent) {
                Uri data;
                String schemeSpecificPart;
                String action;
                "context" /* decoded XOR */;
                context.getClass();
                "intent" /* decoded XOR */;
                intent.getClass();
                if (intent.getData() == null || (data = intent.getData()) == null || (schemeSpecificPart = data.getSchemeSpecificPart()) == null || (action = intent.getAction()) == null) {
                    return;
                }
                int iHashCode = action.hashCode();
                if (iHashCode != 525384130) {
                    if (iHashCode == 1544582882 && action.equals("android.intent.action.PACKAGE_ADDED" /* decoded XOR */)) {
                        NotifyListener.f65464a.l(context, schemeSpecificPart);
                        return;
                    }
                    return;
                }
                if (action.equals("android.intent.action.PACKAGE_REMOVED" /* decoded XOR */) && !intent.getBooleanExtra("android.intent.extra.REPLACING" /* decoded XOR */, false)) {
                    NotifyListener.f65464a.m(context);
                }
            }
        };
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x002b, code lost:
    
        if (r0.equals("android.intent.action.USER_PRESENT" /* decoded XOR */) == false) goto L44;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x00a1, code lost:
    
        if (r0.equals("android.intent.action.SCREEN_ON" /* decoded XOR */) != false) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x00ab, code lost:
    
        return "1" /* decoded XOR */;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x00b8, code lost:
    
        if (r0.equals("android.intent.action.ACTION_POWER_DISCONNECTED" /* decoded XOR */) == false) goto L44;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x00c3, code lost:
    
        return "3" /* decoded XOR */;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x001b, code lost:
    
        if (r0.equals("android.intent.action.ACTION_POWER_CONNECTED" /* decoded XOR */) == false) goto L44;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final String k(Intent intent) {
        String action = intent.getAction();
        if (action != null) {
            switch (action.hashCode()) {
                case -1886648615:
                    break;
                case -1454123155:
                    break;
                case -403228793:
                    if (action.equals("android.intent.action.CLOSE_SYSTEM_DIALOGS" /* decoded XOR */)) {
                        String stringExtra = intent.getStringExtra("reason" /* decoded XOR */);
                        if (stringExtra != null) {
                            int iHashCode = stringExtra.hashCode();
                            if (iHashCode != 350448461) {
                                if (iHashCode == 1092716832 && stringExtra.equals("homekey" /* decoded XOR */)) {
                                    return "2" /* decoded XOR */;
                                }
                            } else if (stringExtra.equals("recentapps" /* decoded XOR */)) {
                                return "4" /* decoded XOR */;
                            }
                        }
                        return "5" /* decoded XOR */;
                    }
                    break;
                case 823795052:
                    break;
                case 1019184907:
                    break;
            }
        }
        return "0" /* decoded XOR */;
    }

    public final void l(Context context, String str) {
        if (com.neeeex.eraser.module.report.bytedance.a.k() && c.f65487a.b(context)) {
            t tVarB = c0.f66142a.b(context, str);
            String str2 = (String) tVarB.component1();
            long jLongValue = ((Number) tVarB.component2()).longValue();
            if (k0.r0(str2) || jLongValue <= 0) {
                return;
            }
            String strB = com.neeeex.eraser.utils.d.b(jLongValue, 0, 2, null);
            n nVar = n.f65534a;
            String string = context.getString(R$string.push_neeeex_similar_install, str2, strB);
            "getString(...)" /* decoded XOR */;
            string.getClass();
            l.f65528a.p(new f0(n.e(nVar, string, new String[]{str2, strB}, 0.0f, 4, null)), 1, -1);
        }
    }

    public final void m(Context context) {
        if (com.neeeex.eraser.module.report.bytedance.a.k() && c.f65487a.b(context)) {
            l lVar = l.f65528a;
            String string = context.getString(R$string.push_neeeex_similar_uninstall);
            "getString(...)" /* decoded XOR */;
            string.getClass();
            lVar.p(new i0(string), 1, -1);
        }
    }

    public final synchronized void n() {
        Object objM372constructorimpl;
        try {
            long jCurrentTimeMillis = System.currentTimeMillis();
            b0 b0Var = b0.f66131a;
            if (jCurrentTimeMillis - b0Var.v("key_neeeex_last_refresh_heartbeat_time" /* decoded XOR */, 0L) >= 3600000) {
                b0Var.C("key_neeeex_last_refresh_heartbeat_time" /* decoded XOR */, jCurrentTimeMillis);
                mi.a.f88870a.X();
            }
            Context contextA = y.Companion.a();
            if (contextA == null) {
                return;
            }
            if (qi.a.f92153a.d(contextA)) {
                long jV = b0Var.v("key_neeeex_last_refresh_ongoning_time" /* decoded XOR */, 0L);
                try {
                    u.a aVar = u.Companion;
                    Object systemService = contextA.getSystemService("notification" /* decoded XOR */);
                    "null cannot be cast to non-null type android.app.NotificationManager" /* decoded XOR */;
                    systemService.getClass();
                    StatusBarNotification[] activeNotifications = ((NotificationManager) systemService).getActiveNotifications();
                    "getActiveNotifications(...)" /* decoded XOR */;
                    activeNotifications.getClass();
                    boolean z10 = false;
                    for (StatusBarNotification statusBarNotification : activeNotifications) {
                        if (statusBarNotification.getId() == 126666 && statusBarNotification.getTag() == null) {
                            z10 = true;
                            break;
                        }
                    }
                    objM372constructorimpl = u.m372constructorimpl(Boolean.valueOf(z10));
                } catch (Throwable th2) {
                    u.a aVar2 = u.Companion;
                    objM372constructorimpl = u.m372constructorimpl(v.a(th2));
                }
                if (u.m377isFailureimpl(objM372constructorimpl)) {
                    objM372constructorimpl = null;
                }
                if (qi.b.f92155a.a(jCurrentTimeMillis, jV, com.neeeex.eraser.module.report.bytedance.a.k(), (Boolean) objM372constructorimpl, c0.f66142a.e(), h.f65507a.f())) {
                    qi.a.f92153a.m();
                    b0.f66131a.C("key_neeeex_last_refresh_ongoning_time" /* decoded XOR */, jCurrentTimeMillis);
                }
            }
        } catch (Throwable th3) {
            throw th3;
        }
    }

    public final void o(Context context) {
        BroadcastReceiver broadcastReceiver = new BroadcastReceiver() { // from class: com.neeeex.eraser.push.NotifyListener$registerLocalReceiver$receiver$1
            @Override // android.content.BroadcastReceiver
            public void onReceive(Context context2, Intent intent) {
                "context" /* decoded XOR */;
                context2.getClass();
                "intent" /* decoded XOR */;
                intent.getClass();
                String strK = NotifyListener.f65464a.k(intent);
                if (m.f65533a.a(intent.getAction(), intent.getStringExtra("reason" /* decoded XOR */))) {
                    long jElapsedRealtime = SystemClock.elapsedRealtime();
                    if (NotifyListener.f65467d > 0 && jElapsedRealtime - NotifyListener.f65467d < 5000) {
                        return;
                    }
                    NotifyListener.f65467d = jElapsedRealtime;
                    boolean zE0 = com.neeeex.eraser.ads.e.b0().E0(context2);
                    Context applicationContext = context2.getApplicationContext();
                    "null cannot be cast to non-null type com.neeeex.eraser.MyApplication" /* decoded XOR */;
                    applicationContext.getClass();
                    ((y) applicationContext).onHomeSignalReceived();
                    if (zE0) {
                        return;
                    }
                } else if (p003kotlin.jvm.internal.v.c(intent.getAction(), "android.intent.action.USER_PRESENT" /* decoded XOR */)) {
                    long jElapsedRealtime2 = SystemClock.elapsedRealtime();
                    if (NotifyListener.f65468e > 0 && jElapsedRealtime2 - NotifyListener.f65468e < 5000) {
                        return;
                    } else {
                        NotifyListener.f65468e = jElapsedRealtime2;
                    }
                }
                c.v(c.f65487a, 1, Integer.parseInt(strK), false, 4, null);
            }
        };
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.intent.action.SCREEN_ON" /* decoded XOR */);
        intentFilter.addAction("android.intent.action.USER_PRESENT" /* decoded XOR */);
        intentFilter.addAction("android.intent.action.CLOSE_SYSTEM_DIALOGS" /* decoded XOR */);
        intentFilter.addAction("android.intent.action.ACTION_POWER_CONNECTED" /* decoded XOR */);
        intentFilter.addAction("android.intent.action.ACTION_POWER_DISCONNECTED" /* decoded XOR */);
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 33) {
            context.registerReceiver(broadcastReceiver, intentFilter, 4);
        } else {
            context.registerReceiver(broadcastReceiver, intentFilter);
        }
        BroadcastReceiver broadcastReceiverJ = j();
        IntentFilter intentFilter2 = new IntentFilter();
        intentFilter2.addAction("android.intent.action.PACKAGE_ADDED" /* decoded XOR */);
        intentFilter2.addAction("android.intent.action.PACKAGE_REMOVED" /* decoded XOR */);
        intentFilter2.addDataScheme("package" /* decoded XOR */);
        if (i10 >= 33) {
            context.registerReceiver(broadcastReceiverJ, intentFilter2, 2);
        } else {
            context.registerReceiver(broadcastReceiverJ, intentFilter2);
        }
    }

    public final void p() {
        p0 p0Var = f65465b;
        kotlinx.coroutines.k.d(p0Var, null, null, new a(null), 3, null);
        kotlinx.coroutines.k.d(p0Var, null, null, new b(null), 3, null);
    }

    public final Object q(kl.f fVar) {
        c.v(c.f65487a, 2, -1, false, 4, null);
        Object objB = z0.b(h.f65507a.h(), fVar);
        return objB == p003kotlin.coroutines.intrinsics.c.f() ? objB : m0.f80959a;
    }
}