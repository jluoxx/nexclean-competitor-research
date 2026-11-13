package com.neeeex.eraser.push;

import android.app.Notification;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.graphics.BitmapFactory;
import android.media.AudioAttributes;
import android.media.RingtoneManager;
import android.os.Build;
import android.os.Bundle;
import android.service.notification.StatusBarNotification;
import android.widget.RemoteViews;
import androidx.core.app.NotificationCompat;
import com.neeeex.eraser.R$color;
import com.neeeex.eraser.R$drawable;
import com.neeeex.eraser.R$mipmap;
import com.neeeex.eraser.R$string;
import com.neeeex.eraser.m0;
import com.neeeex.eraser.utils.b0;
import com.neeeex.eraser.y;
import fl.t;
import gl.b1;
import gl.g0;
import gl.w;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import p003kotlin.jvm.functions.Function0;
import ri.c0;
import ri.f1;
import ri.i1;
import ri.l0;
import ri.p0;
import ri.t0;
import ri.u;
import ri.x;
import ri.x0;
import ri.z;

/* JADX INFO: loaded from: classes7.dex */
public final class l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final l f65528a = new l();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Set f65529b = b1.k(19, 27, 28);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Set f65530c = b1.k(13, 14, 15, 16, 17, 20, 21, 22, 24, 25, 26, 100, 101, 102, 103);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final fl.n f65531d = fl.o.b(new Function0() { // from class: com.neeeex.eraser.push.k
        @Override // p003kotlin.jvm.functions.Function0
        public final Object invoke() {
            return l.a();
        }
    });

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static int f65532e = 10000;

    public static final class a implements Comparator {
        @Override // java.util.Comparator
        public final int compare(Object obj, Object obj2) {
            return jl.c.e(Long.valueOf(((StatusBarNotification) obj).getPostTime()), Long.valueOf(((StatusBarNotification) obj2).getPostTime()));
        }
    }

    public static List a() {
        return w.p(new z(), new f1(), new i1(), new ri.f(), new ri.i(), new ri.l(), new ri.o(), new ri.r(), new u(), new x(), new c0(), new l0(), new p0(), new t0(), new x0(), new ri.b1());
    }

    public static /* synthetic */ void c(l lVar, String str, boolean z10, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            z10 = false;
        }
        lVar.b(str, z10);
    }

    public static /* synthetic */ void e(l lVar, int i10, String str, String str2, int i11, Object obj) {
        if ((i11 & 4) != 0) {
            str2 = null;
        }
        lVar.d(i10, str, str2);
    }

    public final void b(String str, boolean z10) {
        Context contextA = y.Companion.a();
        Object systemService = contextA != null ? contextA.getSystemService(m0.a("ha7kn4TDTIqfqP+Y\n", "68GQ9uKqL+s=\n")) : null;
        m0.a("iX3epWkWO9qJZ8bpKxB614Z7xuk9GnraiGafpzwZNpSTccKsaRQ00JVn261nFCrEyUbdvSATM9eG\nfNumJzg72oZv17s=\n", "5wiyyUl1WrQ=\n");
        systemService.getClass();
        NotificationManager notificationManager = (NotificationManager) systemService;
        NotificationChannel notificationChannel = new NotificationChannel(str, str, 4);
        notificationChannel.setLockscreenVisibility(1);
        notificationChannel.setShowBadge(true);
        if (z10) {
            notificationChannel.setSound(null, null);
            notificationChannel.enableVibration(false);
        } else {
            notificationChannel.setSound(RingtoneManager.getDefaultUri(2), new AudioAttributes.Builder().setUsage(5).build());
            notificationChannel.enableVibration(true);
        }
        notificationManager.createNotificationChannel(notificationChannel);
    }

    public final void d(int i10, String str, String str2) {
        m0.a("DhpDCbQuGZEJ\n", "bXIiZ9pLddg=\n");
        str.getClass();
        Context contextA = y.Companion.a();
        if (contextA != null) {
            f.f65503a.a(contextA, str2, i10);
        }
    }

    public final void f(Intent intent) {
        m0.a("kzYCcaLa\n", "+lh2FMyuk3A=\n");
        intent.getClass();
        if (intent.getBooleanExtra(m0.a("4q0hGx2Bb6LjvC0YEZpRuOWnKiEblVmv55cnERaKRaHprA==\n", "jMhEfnj5MMw=\n"), false)) {
            return;
        }
        intent.putExtra(m0.a("JIUT51hrk5cllB/kVHCtjSOPGN1ef6WaIb8V7VNguZQvhA==\n", "SuB2gj0TzPk=\n"), true);
        int intExtra = intent.getIntExtra(m0.a("DFWwcw==\n", "aiffHnOr6LA=\n"), 0);
        Bundle bundleExtra = intent.getBundleExtra(m0.a("PFblfkkc\n", "XiOLGiV51rE=\n"));
        if (bundleExtra == null || intExtra == 0) {
            return;
        }
        int i10 = bundleExtra.getInt(m0.a("TolKbB6Fxg==\n", "PeovAnvMorw=\n"));
        int i11 = bundleExtra.getInt(m0.a("thZjfGEe\n", "13UXFQ5wekc=\n"));
        int i12 = bundleExtra.getInt(m0.a("WkFlBNw=\n", "Li4QZ7RM+CI=\n"));
        int i13 = bundleExtra.getInt(m0.a("6TjL5RzXPfI=\n", "h1e/jHqudJY=\n"));
        if (intExtra == 1 || intExtra == 2) {
            mi.a aVar = mi.a.f88870a;
            aVar.j0(i11, i10, i12, intExtra);
            aVar.w0(i11, i10, i12, intExtra, t(i10));
        } else if (intExtra == 4) {
            mi.a aVar2 = mi.a.f88870a;
            aVar2.s0(i11);
            aVar2.w0(i11, i10, i12, intExtra, t(i10));
        }
        String string = bundleExtra.getString(m0.a("5vIPrII970bh\n", "hZpuwuxYgw8=\n"), "");
        if (10 <= intExtra && intExtra < 14) {
            string.getClass();
            e(this, i13, string, null, 4, null);
        }
        if (intExtra != 1 && intExtra != 2) {
            if (intExtra == 3) {
                mi.a.f88870a.i0(i11 != 4 ? 2 : 1);
                return;
            } else if (intExtra != 4) {
                return;
            }
        }
        string.getClass();
        e(this, i13, string, null, 4, null);
    }

    public final void g(int i10, int i11, int i12, int i13) {
        if (i10 == 1 || i10 == 2) {
            mi.a aVar = mi.a.f88870a;
            aVar.k0(i12, i11, i13, i10);
            aVar.x0(i12, i11, i13, i10, t(i11));
        } else {
            if (i10 != 4) {
                return;
            }
            mi.a aVar2 = mi.a.f88870a;
            aVar2.t0(i12);
            aVar2.x0(i12, i11, i13, i10, t(i11));
        }
    }

    public final void h(int i10, int i11, int i12, int i13) {
        if (i10 == 1 || i10 == 2) {
            mi.a.f88870a.n0(i12, i11, i13, i10);
        }
    }

    public final int i() {
        int i10 = f65532e + 1;
        f65532e = i10;
        return i10;
    }

    public final t j(int i10) {
        int i11 = i10 + 4000;
        return fl.z.a(Integer.valueOf(i11), "channel-" + i11);
    }

    public final List k() {
        return l();
    }

    public final List l() {
        return (List) f65531d.getValue();
    }

    public final boolean m() {
        String str = new SimpleDateFormat(m0.a("Mcpta8UNfVks1w==\n", "SLMUEuhAMHQ=\n")).format(new Date(System.currentTimeMillis()));
        m0.a("l+8uWzhU/o/frnU=\n", "8YBcNlkg1qE=\n");
        str.getClass();
        StringBuilder sb2 = new StringBuilder("n_count_");
        sb2.append(str);
        return ((long) b0.f66131a.u(sb2.toString(), 0)) >= h.f65507a.c();
    }

    public final void n() {
        String str = new SimpleDateFormat(m0.a("3SXmlE2D7zvAOA==\n", "pFyf7WDOohY=\n")).format(new Date(System.currentTimeMillis()));
        m0.a("ieMIgTtOyLbBolM=\n", "74x67Fo64Jg=\n");
        str.getClass();
        String str2 = "n_count_" + str;
        b0 b0Var = b0.f66131a;
        b0Var.B(str2, b0Var.u(str2, 0) + 1);
    }

    public final void o(ri.a aVar, int i10) {
        Context contextA;
        m0.a("U62q4o0Sw6NYrLs=\n", "PcLei+53kMA=\n");
        aVar.getClass();
        if (com.neeeex.eraser.module.report.bytedance.a.k() && (contextA = y.Companion.a()) != null) {
            t tVarJ = j(aVar.p());
            int iIntValue = ((Number) tVarJ.component1()).intValue();
            String str = (String) tVarJ.component2();
            fl.y yVarS = aVar.s(i10, iIntValue, str, -1);
            NotificationCompat.n nVarQ = q(contextA, str, aVar, i10, iIntValue, -1, (RemoteViews) yVarS.component1(), (RemoteViews) yVarS.component2(), (RemoteViews) yVarS.component3());
            c(this, str, false, 2, null);
            Notification notificationC = g.f65506a.a(nVarQ, com.neeeex.eraser.module.report.bytedance.a.k()).c();
            m0.a("Mb/1SKWum0Z94w==\n", "U8qcJMGGtWg=\n");
            notificationC.getClass();
            f.f65503a.b(contextA, null, iIntValue, notificationC, t(aVar.p()), !v(aVar.p(), true));
        }
    }

    public final void p(ri.a aVar, int i10, int i11) {
        Context contextA;
        m0.a("tvuJtZ70fZC9+pg=\n", "2JT93P2RLvM=\n");
        aVar.getClass();
        if (com.neeeex.eraser.module.report.bytedance.a.k()) {
            if ((com.neeeex.eraser.utils.c0.f66142a.e() && m()) || (contextA = y.Companion.a()) == null) {
                return;
            }
            h(i10, aVar.p(), aVar.k(), i11);
            t tVarJ = j(aVar.p());
            int iIntValue = ((Number) tVarJ.component1()).intValue();
            String str = (String) tVarJ.component2();
            s(iIntValue, str);
            fl.y yVarS = aVar.s(i10, iIntValue, str, i11);
            NotificationCompat.n nVarQ = q(contextA, str, aVar, i10, iIntValue, i11, (RemoteViews) yVarS.component1(), (RemoteViews) yVarS.component2(), (RemoteViews) yVarS.component3());
            c(this, str, false, 2, null);
            Notification notificationC = g.f65506a.a(nVarQ, com.neeeex.eraser.module.report.bytedance.a.k()).c();
            m0.a("UisPtsSOB6Aedw==\n", "MF5m2qCmKY4=\n");
            notificationC.getClass();
            f.f65503a.b(contextA, null, iIntValue, notificationC, t(aVar.p()), !v(aVar.p(), true));
            n();
            if (i10 == 1 || i10 == 2) {
                r(aVar.p());
            }
            g(i10, aVar.p(), aVar.k(), i11);
        }
    }

    public final NotificationCompat.n q(Context context, String str, ri.a aVar, int i10, int i11, int i12, RemoteViews remoteViews, RemoteViews remoteViews2, RemoteViews remoteViews3) {
        String string = context.getString(R$string.app_name);
        m0.a("H1GhGqmhi4wfHPtn8/o=\n", "eDTVSd3T4uI=\n");
        string.getClass();
        NotificationCompat.n nVarF = new NotificationCompat.n(context, str).G(R$drawable.ic_neeeex_push_logo).i(context.getColor(R$color.colorPrimary)).m(string).o(remoteViews).n(remoteViews3).C(2).f(true);
        m0.a("9G0FnUDDtpPmZhK5WZ/3/qkh\n", "hwhx3DW32dA=\n");
        nVarF.getClass();
        CharSequence charSequenceU = aVar.u();
        if (charSequenceU != null) {
            nVarF.l(charSequenceU);
        }
        PendingIntent pendingIntentT = aVar.t(i10, i11, str, i12);
        if (pendingIntentT != null) {
            nVarF.k(pendingIntentT);
        }
        nVarF.I(new NotificationCompat.k().i(BitmapFactory.decodeResource(context.getResources(), R$mipmap.ic_launcher)).h(null));
        nVarF.I(new NotificationCompat.l().h(""));
        nVarF.L(1);
        if (com.neeeex.eraser.utils.c0.f66142a.d() || Build.VERSION.SDK_INT >= 33) {
            nVarF.p(remoteViews2);
        } else {
            nVarF.p(remoteViews);
        }
        nVarF.u(false);
        nVarF.t(string);
        return nVarF;
    }

    public final void r(int i10) {
        long jCurrentTimeMillis = System.currentTimeMillis();
        b0 b0Var = b0.f66131a;
        b0Var.C(m0.a("KpSF4H37yQkyqoL9T+4=\n", "RvX2lCKLpno=\n"), jCurrentTimeMillis);
        b0Var.C("today_post_time_id_" + i10, jCurrentTimeMillis);
        b0Var.B("today_post_count_id_" + i10, b0Var.u("today_post_count_id_" + i10, 0) + 1);
    }

    public final void s(int i10, String str) {
        Exception exc;
        Object systemService;
        try {
            Context contextA = y.Companion.a();
            if (contextA != null) {
                try {
                    systemService = contextA.getSystemService(m0.a("zunQWM4mdFzU78tf\n", "oIakMahPFz0=\n"));
                } catch (Exception e10) {
                    exc = e10;
                }
            } else {
                systemService = null;
            }
            m0.a("0cJ5gYck8DnR2GHNxSKxNN7EYc3TKLE50Nk4g9Ir/XfLzmWIhyb/M83YfImJJuEnkfl6mc4h+DTe\nw3yCyQrwOd7QcJ8=\n", "v7cV7adHkVc=\n");
            systemService.getClass();
            StatusBarNotification[] activeNotifications = ((NotificationManager) systemService).getActiveNotifications();
            m0.a("2BK39I/YsdXaOazBhcqxwN4DqtqC3/CNkVnq\n", "v3fDteys2KM=\n");
            activeNotifications.getClass();
            ArrayList arrayList = new ArrayList();
            for (StatusBarNotification statusBarNotification : activeNotifications) {
                int id2 = statusBarNotification.getId();
                if (4001 <= id2 && id2 < 4029 && (statusBarNotification.getNotification().flags & 512) == 0) {
                    arrayList.add(statusBarNotification);
                }
            }
            List listV0 = g0.V0(arrayList, new a());
            if (listV0.size() < (com.neeeex.eraser.utils.c0.f66142a.e() ? 6 : 8)) {
                return;
            }
            List list = listV0;
            try {
                if (!(list instanceof Collection) || !list.isEmpty()) {
                    Iterator it = list.iterator();
                    while (it.hasNext()) {
                        if (((StatusBarNotification) it.next()).getId() == i10) {
                            e(this, i10, str, null, 4, null);
                            return;
                        }
                    }
                }
                StatusBarNotification statusBarNotification2 = (StatusBarNotification) g0.p0(listV0);
                String channelId = statusBarNotification2.getNotification().getChannelId();
                int id3 = statusBarNotification2.getId();
                channelId.getClass();
                d(id3, channelId, statusBarNotification2.getTag());
                return;
            } catch (Exception e11) {
                e = e11;
            }
        } catch (Exception e12) {
            e = e12;
        }
        exc = e;
        exc.printStackTrace();
    }

    public final boolean t(int i10) {
        return u(i10, com.neeeex.eraser.utils.c0.f66142a.e());
    }

    public final boolean u(int i10, boolean z10) {
        if (f65529b.contains(Integer.valueOf(i10))) {
            return true;
        }
        return !z10 && f65530c.contains(Integer.valueOf(i10));
    }

    public final boolean v(int i10, boolean z10) {
        return z10 && i10 != 103;
    }
}