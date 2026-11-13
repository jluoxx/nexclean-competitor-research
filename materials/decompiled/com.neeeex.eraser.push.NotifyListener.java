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
                v0.a(com.neeeex.eraser.m0.a("m8+ryVyms0Lf3KLWCb+5RdjMosMToLlC38ep0xO5uUXY2a7RFPK/DYrBstEVvLk=\n", "+K7HpXzS3GI=\n"));
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
                v0.a(com.neeeex.eraser.m0.a("SScxjTZWn7MNNDiSY0+VtAokOId5UJWzDS8zl3lJlbQKMTSVfgKT/FgpKJV/TJU=\n", "KkZd4RYi8JM=\n"));
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
        com.neeeex.eraser.m0.a("SvZdY+aQng==\n", "KZkzF4Po6iY=\n");
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
                com.neeeex.eraser.m0.a("LeNf42H2iQ==\n", "TowxlwSO/Yo=\n");
                context.getClass();
                com.neeeex.eraser.m0.a("/Sw1hkdW\n", "lEJB4ykiaJ8=\n");
                intent.getClass();
                if (intent.getData() == null || (data = intent.getData()) == null || (schemeSpecificPart = data.getSchemeSpecificPart()) == null || (action = intent.getAction()) == null) {
                    return;
                }
                int iHashCode = action.hashCode();
                if (iHashCode != 525384130) {
                    if (iHashCode == 1544582882 && action.equals(com.neeeex.eraser.m0.a("WzbtiXiv/hFTNv2eebK0Xlks4JR56Mp+eRPIvFKZ23t+Hc0=\n", "OliJ+xfGmj8=\n"))) {
                        NotifyListener.f65464a.l(context, schemeSpecificPart);
                        return;
                    }
                    return;
                }
                if (action.equals(com.neeeex.eraser.m0.a("PwyZOBDqLg43DIkvEfdkQT0WlCURrRphHSm8DTrcGGUTLasPOw==\n", "XmL9Sn+DSiA=\n")) && !intent.getBooleanExtra(com.neeeex.eraser.m0.a("qw7H2+BHwaijDtfM4VqL47IU0cihfODWhiHg4MFp\n", "ymCjqY8upYY=\n"), false)) {
                    NotifyListener.f65464a.m(context);
                }
            }
        };
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x002b, code lost:
    
        if (r0.equals(com.neeeex.eraser.m0.a("YxSd87B9UVtrFI3ksWAbFGEOkO6xOmAmRyim0Y1RZjBMLg==\n", "Anr5gd8UNXU=\n")) == false) goto L44;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x00a1, code lost:
    
        if (r0.equals(com.neeeex.eraser.m0.a("RdGziEZccGVN0aOfR0E6KkfLvpVHG0cIdvqStHZ6Wg==\n", "JL/X+ik1FEs=\n")) != false) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x00ab, code lost:
    
        return com.neeeex.eraser.m0.a("6A==\n", "2WM8U+ctrrk=\n");
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x00b8, code lost:
    
        if (r0.equals(com.neeeex.eraser.m0.a("vvR9SP9o4WG29G1f/nWrLrzucFX+L8QMi9NWdM9RyhiayEZ+2VLGAJHUXHnERME=\n", "35oZOpABhU8=\n")) == false) goto L44;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x00c3, code lost:
    
        return com.neeeex.eraser.m0.a("xQ==\n", "9kWybl9vvrM=\n");
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x001b, code lost:
    
        if (r0.equals(com.neeeex.eraser.m0.a("kuptCE7/fiKa6n0fT+I0bZDwYBVPuFtPp81GNH7GVVu21lY5bthUSbDQTD4=\n", "84QJeiGWGgw=\n")) == false) goto L44;
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
                    if (action.equals(com.neeeex.eraser.m0.a("u7gJUV7PnP2zuBlGX9LWsrmiBExfiLuflYUofGL/q4efmzJneOe0nJ2F\n", "2tZtIzGm+NM=\n"))) {
                        String stringExtra = intent.getStringExtra(com.neeeex.eraser.m0.a("0MzDcQRW\n", "oqmiAms4C5c=\n"));
                        if (stringExtra != null) {
                            int iHashCode = stringExtra.hashCode();
                            if (iHashCode != 350448461) {
                                if (iHashCode == 1092716832 && stringExtra.equals(com.neeeex.eraser.m0.a("LfUZkRt/Pw==\n", "RZp09HAaRqk=\n"))) {
                                    return com.neeeex.eraser.m0.a("5A==\n", "1gyP07A7ooA=\n");
                                }
                            } else if (stringExtra.equals(com.neeeex.eraser.m0.a("w31+RHaylDvBaw==\n", "sRgdIRjG9Us=\n"))) {
                                return com.neeeex.eraser.m0.a("Wg==\n", "bpSqXdSaoLQ=\n");
                            }
                        }
                        return com.neeeex.eraser.m0.a("Ig==\n", "F3R7BOmrv2A=\n");
                    }
                    break;
                case 823795052:
                    break;
                case 1019184907:
                    break;
            }
        }
        return com.neeeex.eraser.m0.a("lw==\n", "pxqzln8+frM=\n");
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
            com.neeeex.eraser.m0.a("WcwS63tU9M5ZgUiWIQ8=\n", "PqlmuA8mnaA=\n");
            string.getClass();
            l.f65528a.p(new f0(n.e(nVar, string, new String[]{str2, strB}, 0.0f, 4, null)), 1, -1);
        }
    }

    public final void m(Context context) {
        if (com.neeeex.eraser.module.report.bytedance.a.k() && c.f65487a.b(context)) {
            l lVar = l.f65528a;
            String string = context.getString(R$string.push_neeeex_similar_uninstall);
            com.neeeex.eraser.m0.a("QfHrdbA4XfhBvLEI6mM=\n", "JpSfJsRKNJY=\n");
            string.getClass();
            lVar.p(new i0(string), 1, -1);
        }
    }

    public final synchronized void n() {
        Object objM372constructorimpl;
        try {
            long jCurrentTimeMillis = System.currentTimeMillis();
            b0 b0Var = b0.f66131a;
            if (jCurrentTimeMillis - b0Var.v(com.neeeex.eraser.m0.a("AY2TZrI0EWMPkLVVvSIAWRiNjEu5IhxZAo2LS6gzEWcet55QsTQ=\n", "aujqOdxRdAY=\n"), 0L) >= 3600000) {
                b0Var.C(com.neeeex.eraser.m0.a("k3uUz3fHu9WdZrL8eNGq74p7i+J80bbvkHuM4m3Au9GMQZn5dMc=\n", "+B7tkBmi3rA=\n"), jCurrentTimeMillis);
                mi.a.f88870a.X();
            }
            Context contextA = y.Companion.a();
            if (contextA == null) {
                return;
            }
            if (qi.a.f92153a.d(contextA)) {
                long jV = b0Var.v(com.neeeex.eraser.m0.a("5fGoqWvqftfr7I6aZPxv7fzxt4Rg/HPt4fq2mWvmddXR4LibYA==\n", "jpTR9gWPG7I=\n"), 0L);
                try {
                    u.a aVar = u.Companion;
                    Object systemService = contextA.getSystemService(com.neeeex.eraser.m0.a("xIrIUaSXC5bejNNW\n", "quW8OML+aPc=\n"));
                    com.neeeex.eraser.m0.a("cMevx1W7R09w3beLF70GQn/Bt4sBtwZPcdzuxQC0SgFqy7POVblIRWzdqs9buVZRMPys3xy+T0J/\nxqrEG5VHT3/Vptk=\n", "HrLDq3XYJiE=\n");
                    systemService.getClass();
                    StatusBarNotification[] activeNotifications = ((NotificationManager) systemService).getActiveNotifications();
                    com.neeeex.eraser.m0.a("cvXf6fJxXARw3sTc+GNcEXTkwsf/dh1cO76C\n", "FZCrqJEFNXI=\n");
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
                    b0.f66131a.C(com.neeeex.eraser.m0.a("x81uee263L/J0EhK4qzNhd7NcVTmrNGFw8ZwSe22173z3H5L5g==\n", "rKgXJoPfudo=\n"), jCurrentTimeMillis);
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
                com.neeeex.eraser.m0.a("FN22QNo1cQ==\n", "d7LYNL9NBUc=\n");
                context2.getClass();
                com.neeeex.eraser.m0.a("3U2omXNO\n", "tCPc/B063bk=\n");
                intent.getClass();
                String strK = NotifyListener.f65464a.k(intent);
                if (m.f65533a.a(intent.getAction(), intent.getStringExtra(com.neeeex.eraser.m0.a("vxet+pfR\n", "zXLMifi/zkM=\n")))) {
                    long jElapsedRealtime = SystemClock.elapsedRealtime();
                    if (NotifyListener.f65467d > 0 && jElapsedRealtime - NotifyListener.f65467d < 5000) {
                        return;
                    }
                    NotifyListener.f65467d = jElapsedRealtime;
                    boolean zE0 = com.neeeex.eraser.ads.e.b0().E0(context2);
                    Context applicationContext = context2.getApplicationContext();
                    com.neeeex.eraser.m0.a("fc3xIt3kBSN91+lun+JELnLL6W6J6EQjfNawIIjrCG1nwe0r3eQLID3W+CuY4hxjdsr8PZj1SgBq\n+e0+ke4HLGfR8iA=\n", "E7idTv2HZE0=\n");
                    applicationContext.getClass();
                    ((y) applicationContext).onHomeSignalReceived();
                    if (zE0) {
                        return;
                    }
                } else if (p003kotlin.jvm.internal.v.c(intent.getAction(), com.neeeex.eraser.m0.a("uJuLa4/aq7mwm5t8jsfh9rqBhnaOnZrEnKewSbL2nNKXoQ==\n", "2fXvGeCzz5c=\n"))) {
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
        intentFilter.addAction(com.neeeex.eraser.m0.a("lb7JaKjS2lydvtl/qc+QE5ekxHWple0xppXoVJj08A==\n", "9NCtGse7vnI=\n"));
        intentFilter.addAction(com.neeeex.eraser.m0.a("i/+jaUGeXGaD/7N+QIMWKYnlrnRA2W0br8OYS3yyaw2kxQ==\n", "6pHHGy73OEg=\n"));
        intentFilter.addAction(com.neeeex.eraser.m0.a("04O6yrObEfXbg6rdsoZbutGZt9ey3DaX/b6b54+rJo/3oIH8lbM5lPW+\n", "su3euNzydds=\n"));
        intentFilter.addAction(com.neeeex.eraser.m0.a("M/KoSNJ5RUM78rhf02QPDDHopVXTPmAuBtWDdOJAbjoXzpN58l5vKBHIiX4=\n", "UpzMOr0QIW0=\n"));
        intentFilter.addAction(com.neeeex.eraser.m0.a("ZLi9jRt7FmZsuK2aGmZcKWaisJAaPDMLUZ+WsStCPR9AhIa7PUExB0uYnLwgVzY=\n", "BdbZ/3QSckg=\n"));
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 33) {
            context.registerReceiver(broadcastReceiver, intentFilter, 4);
        } else {
            context.registerReceiver(broadcastReceiver, intentFilter);
        }
        BroadcastReceiver broadcastReceiverJ = j();
        IntentFilter intentFilter2 = new IntentFilter();
        intentFilter2.addAction(com.neeeex.eraser.m0.a("JSeR/8Ln5xEtJ4How/qtXic9nOLDoNN+BwK0yujRwnsADLE=\n", "REn1ja2Ogz8=\n"));
        intentFilter2.addAction(com.neeeex.eraser.m0.a("vRyOMouCvkO1HJ4lip/0DL8Ggy+KxYosnzmrB6G0iCiRPbwFoA==\n", "3HLqQOTr2m0=\n"));
        intentFilter2.addDataScheme(com.neeeex.eraser.m0.a("2ZXxPTu7DQ==\n", "qfSSVlrcaIc=\n"));
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