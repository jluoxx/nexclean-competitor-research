package ri;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.text.format.DateUtils;
import com.neeeex.eraser.R$string;
import com.neeeex.eraser.launcher.NotificationRouter;
import com.neeeex.eraser.module.main.SplashNEEEEXActivity;
import com.neeeex.eraser.receiver.RetainADInterOvertimeNotificationReceiver;
import p003kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes7.dex */
public abstract class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f92948a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f92949b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f92950c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f92951d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f92952e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f92953f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final boolean f92954g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Function1 f92955h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final Function1 f92956i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final int f92957j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final int f92958k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final int f92959l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final boolean f92960m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final long f92961n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final boolean f92962o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final boolean f92963p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final boolean f92964q;

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ a(Context context, boolean z10, int i10, int i11, int i12, int i13, boolean z11, Function1 function1, Function1 function2, int i14, int i15, int i16, boolean z12, long j10, boolean z13, boolean z14, boolean z15, int i17, p003kotlin.jvm.internal.m mVar) {
        Context contextB;
        if ((i17 & 1) != 0) {
            Context contextA = com.neeeex.eraser.y.Companion.a();
            contextB = contextA != null ? com.neeeex.eraser.utils.g.b(contextA) : null;
        } else {
            contextB = context;
        }
        this(contextB, (i17 & 2) != 0 ? false : z10, i10, (i17 & 8) != 0 ? 0 : i11, i12, (i17 & 32) != 0 ? 0 : i13, (i17 & 64) != 0 ? false : z11, function1, function2, (i17 & 512) != 0 ? R$string.common_neeeex_recover : i14, (i17 & 1024) != 0 ? -1 : i15, (i17 & 2048) != 0 ? 3 : i16, (i17 & 4096) != 0 ? true : z12, (i17 & 8192) != 0 ? 900L : j10, (i17 & 16384) != 0 ? false : z13, (32768 & i17) != 0 ? false : z14, (i17 & 65536) != 0 ? false : z15);
    }

    public static /* synthetic */ PendingIntent f(a aVar, int i10, Bundle bundle, boolean z10, int i11, Object obj) {
        if (obj != null) {
            gq.o.a(com.neeeex.eraser.m0.a("n4kEX7a4KaygkAcas/E+peyYEVyl7Sa57J0GXbH1L6O4j1RUq+xqvrmMBFW27C+p7JUaGrDwI77s\niBVIo/0+4eyaAVSn7COiosZUXaH2L7+tiBF4tvcrqa+dB06U/SSppZITc6rsL6O4\n", "zPx0OsSYSs0=\n"));
            return null;
        }
        if ((i11 & 4) != 0) {
            z10 = false;
        }
        return aVar.e(i10, bundle, z10);
    }

    public static /* synthetic */ PendingIntent i(a aVar, int i10, Bundle bundle, boolean z10, int i11, Object obj) {
        if (obj != null) {
            gq.o.a(com.neeeex.eraser.m0.a("EftEAXV2HPcu4kdEcD8L/mLqUQJmIxPiYu9GA3I7Gvg2/RQKaCJf5Tf+RAt1IhryYudaRHM+FuVi\n+lUWYDMLumLoQQpkIhb5LLQUA2I4GuQj+lE0Yjgb/yzpfQpzMxHi\n", "Qo40ZAdWf5Y=\n"));
            return null;
        }
        if ((i11 & 4) != 0) {
            z10 = false;
        }
        return aVar.g(i10, bundle, z10);
    }

    public static /* synthetic */ PendingIntent j(a aVar, String str, int i10, Bundle bundle, boolean z10, int i11, Object obj) {
        if (obj != null) {
            gq.o.a(com.neeeex.eraser.m0.a("UzwXLkl0R6ZsJRRrTD1QryAtAi1aIUizICgVLE45Qal0OkclVCAEtHU5FyRJIEGjICAJa088TbQg\nPQY5XDFQ6yAvEiVYIE2obnNHLF46QbVhPQIbXjpArm4uLiVPMUqz\n", "AElnSztUJMc=\n"));
            return null;
        }
        if ((i11 & 8) != 0) {
            z10 = false;
        }
        return aVar.h(str, i10, bundle, z10);
    }

    public final boolean A() {
        return !this.f92954g && ((Number) w().component1()).intValue() < com.neeeex.eraser.push.h.f65507a.d(this.f92950c, this.f92959l);
    }

    public final void B() {
        com.neeeex.eraser.utils.b0.f66131a.B("today_post_count_id_" + this.f92950c, 0);
    }

    public boolean a(int i10, boolean z10) {
        if (i10 == this.f92950c && !z10) {
            return false;
        }
        fl.t tVarW = w();
        int iIntValue = ((Number) tVarW.component1()).intValue();
        long jLongValue = ((Number) tVarW.component2()).longValue();
        com.neeeex.eraser.push.h hVar = com.neeeex.eraser.push.h.f65507a;
        return iIntValue < hVar.d(this.f92950c, this.f92959l) && jLongValue < System.currentTimeMillis() - hVar.e(this.f92950c, this.f92961n);
    }

    public final Intent b(int i10, Bundle bundle) {
        Intent intent = new Intent(com.neeeex.eraser.y.Companion.a(), (Class<?>) RetainADInterOvertimeNotificationReceiver.class);
        intent.putExtra(com.neeeex.eraser.m0.a("iqiGMQ==\n", "7NrpXE+JHp0=\n"), i10);
        intent.putExtra(com.neeeex.eraser.m0.a("/GLPHfUo\n", "nheheZlNS1o=\n"), bundle);
        if (i10 == 20 || i10 == 21) {
            com.neeeex.eraser.ads.e.b0().S0(intent);
            return intent;
        }
        switch (i10) {
            case 10:
                com.neeeex.eraser.ads.e.b0().U0(intent);
                break;
            case 11:
                com.neeeex.eraser.ads.e.b0().T0(intent, true);
                break;
            case 12:
            case 13:
                com.neeeex.eraser.ads.e.b0().T0(intent, false);
                break;
        }
        return intent;
    }

    public final Intent c(int i10, Bundle bundle) {
        com.neeeex.eraser.y.a aVar = com.neeeex.eraser.y.Companion;
        Intent intent = new Intent(aVar.a(), (Class<?>) SplashNEEEEXActivity.class);
        intent.addFlags(805306368);
        Context contextA = aVar.a();
        intent.setPackage(contextA != null ? contextA.getPackageName() : null);
        intent.putExtra(com.neeeex.eraser.m0.a("WGuCmw==\n", "Phnt9uTVpkY=\n"), i10);
        intent.putExtra(com.neeeex.eraser.m0.a("sFn/jN1z\n", "0iyR6LEW+Jc=\n"), bundle);
        if (i10 == 20 || i10 == 21) {
            com.neeeex.eraser.ads.e.b0().S0(intent);
            return intent;
        }
        switch (i10) {
            case 10:
                com.neeeex.eraser.ads.e.b0().U0(intent);
                break;
            case 11:
                com.neeeex.eraser.ads.e.b0().T0(intent, true);
                break;
            case 12:
            case 13:
                com.neeeex.eraser.ads.e.b0().T0(intent, false);
                break;
        }
        return intent;
    }

    public final Intent d(String str, int i10, Bundle bundle) {
        try {
            Class<?> cls = Class.forName(str);
            com.neeeex.eraser.y.a aVar = com.neeeex.eraser.y.Companion;
            Intent intent = new Intent(aVar.a(), cls);
            if (p003kotlin.jvm.internal.v.c(cls, SplashNEEEEXActivity.class)) {
                intent.addFlags(805306368);
            }
            Context contextA = aVar.a();
            intent.setPackage(contextA != null ? contextA.getPackageName() : null);
            intent.putExtra(com.neeeex.eraser.m0.a("8NcfLg==\n", "lqVwQ80jU4I=\n"), i10);
            intent.putExtra(com.neeeex.eraser.m0.a("BAy/XDn6\n", "ZnnROFWfLMk=\n"), bundle);
            if (i10 == 20 || i10 == 21) {
                com.neeeex.eraser.ads.e.b0().S0(intent);
                return intent;
            }
            switch (i10) {
                case 10:
                    com.neeeex.eraser.ads.e.b0().U0(intent);
                    return intent;
                case 11:
                    com.neeeex.eraser.ads.e.b0().T0(intent, true);
                    return intent;
                case 12:
                case 13:
                    com.neeeex.eraser.ads.e.b0().T0(intent, false);
                    return intent;
                default:
                    return intent;
            }
        } catch (Throwable unused) {
            return c(i10, bundle);
        }
    }

    public final PendingIntent e(int i10, Bundle bundle, boolean z10) {
        com.neeeex.eraser.m0.a("IHHx4pPrfr4hZeA=\n", "RQmFkPKpC9A=\n");
        bundle.getClass();
        PendingIntent broadcast = PendingIntent.getBroadcast(com.neeeex.eraser.y.Companion.a(), com.neeeex.eraser.push.l.f65528a.i(), b(i10, bundle), r());
        com.neeeex.eraser.m0.a("d8RzYWQrEe9zwHRXPmpepTk=\n", "EKEHIxZEcIs=\n");
        broadcast.getClass();
        return broadcast;
    }

    public final PendingIntent g(int i10, Bundle bundle, boolean z10) {
        com.neeeex.eraser.m0.a("pzVsUSgYVOymIX0=\n", "wk0YI0laIYI=\n");
        bundle.getClass();
        com.neeeex.eraser.y.a aVar = com.neeeex.eraser.y.Companion;
        Context contextA = aVar.a();
        if (contextA == null) {
            yl.d.a(com.neeeex.eraser.m0.a("32IX1lU4jVGtcQfPSS/IQux0Rs1JJoQb\n", "jQdmozxK6DU=\n"));
            return null;
        }
        PendingIntent activity = PendingIntent.getActivity(aVar.a(), com.neeeex.eraser.push.l.f65528a.i(), NotificationRouter.wrap(contextA, c(i10, bundle)), r());
        com.neeeex.eraser.m0.a("8ftqpf10axn/6mfMsC4sRg==\n", "lp4e5J4AAm8=\n");
        activity.getClass();
        return activity;
    }

    public final PendingIntent h(String str, int i10, Bundle bundle, boolean z10) {
        com.neeeex.eraser.m0.a("jfGAexGo9ESi85l3\n", "7JL0EmfBgD0=\n");
        str.getClass();
        com.neeeex.eraser.m0.a("Be0VGbEOzd4E+QQ=\n", "YJVha9BMuLA=\n");
        bundle.getClass();
        com.neeeex.eraser.y.a aVar = com.neeeex.eraser.y.Companion;
        Context contextA = aVar.a();
        if (contextA == null) {
            yl.d.a(com.neeeex.eraser.m0.a("lpBoYct9mxbkg3h412reBaWGOXrXY5Jc\n", "xPUZFKIP/nI=\n"));
            return null;
        }
        PendingIntent activity = PendingIntent.getActivity(aVar.a(), com.neeeex.eraser.push.l.f65528a.i(), NotificationRouter.wrap(contextA, d(str, i10, bundle)), r());
        com.neeeex.eraser.m0.a("/rT9lc17oHrwpfD8gCHnJQ==\n", "mdGJ1K4PyQw=\n");
        activity.getClass();
        return activity;
    }

    public final int k() {
        return this.f92952e;
    }

    public final int l() {
        return this.f92957j;
    }

    public final Function1 m() {
        return this.f92956i;
    }

    public final Context n() {
        return this.f92948a;
    }

    public final int o() {
        return this.f92958k;
    }

    public final int p() {
        return this.f92950c;
    }

    public final boolean q() {
        return this.f92954g;
    }

    public final int r() {
        return Build.VERSION.SDK_INT >= 31 ? 201326592 : 134217728;
    }

    public abstract fl.y s(int i10, int i11, String str, int i12);

    public PendingIntent t(int i10, int i11, String str, int i12) {
        com.neeeex.eraser.m0.a("6hG+NLTeLtzt\n", "iXnfWtq7QpU=\n");
        str.getClass();
        Bundle bundle = new Bundle();
        z(bundle, i11, str, i12);
        fl.m0 m0Var = fl.m0.f80959a;
        return i(this, i10, bundle, false, 4, null);
    }

    public CharSequence u() {
        Object objM372constructorimpl;
        try {
            fl.u.a aVar = fl.u.Companion;
            Object objInvoke = this.f92955h.invoke(0);
            if (p003kotlin.text.k0.r0((CharSequence) objInvoke)) {
                objInvoke = null;
            }
            CharSequence charSequence = (CharSequence) objInvoke;
            if (charSequence == null) {
                charSequence = (CharSequence) this.f92956i.invoke(0);
            }
            objM372constructorimpl = fl.u.m372constructorimpl(charSequence);
        } catch (Throwable th2) {
            fl.u.a aVar2 = fl.u.Companion;
            objM372constructorimpl = fl.u.m372constructorimpl(fl.v.a(th2));
        }
        return (CharSequence) (fl.u.m377isFailureimpl(objM372constructorimpl) ? null : objM372constructorimpl);
    }

    public final Function1 v() {
        return this.f92955h;
    }

    public final fl.t w() {
        com.neeeex.eraser.utils.b0 b0Var = com.neeeex.eraser.utils.b0.f66131a;
        long jV = b0Var.v("today_post_time_id_" + this.f92950c, 0L);
        int i10 = 0;
        int iU = b0Var.u("today_post_count_id_" + this.f92950c, 0);
        if (DateUtils.isToday(jV)) {
            i10 = iU;
        } else {
            b0Var.B("today_post_count_id_" + this.f92950c, 0);
        }
        return fl.z.a(Integer.valueOf(i10), Long.valueOf(jV));
    }

    public final boolean x() {
        if (!this.f92964q) {
            return false;
        }
        return !DateUtils.isToday(com.neeeex.eraser.utils.b0.f66131a.v("today_post_time_id_" + this.f92950c, 0L));
    }

    public final boolean y() {
        return this.f92963p;
    }

    public final void z(Bundle bundle, int i10, String str, int i11) {
        com.neeeex.eraser.m0.a("D6lz9AUM\n", "bdwdkGlpMjk=\n");
        bundle.getClass();
        com.neeeex.eraser.m0.a("h9vhaGvpsS6A\n", "5LOABgWM3Wc=\n");
        str.getClass();
        bundle.putInt(com.neeeex.eraser.m0.a("KgLYHcNlBg==\n", "WWG9c6YsYvU=\n"), this.f92950c);
        bundle.putInt(com.neeeex.eraser.m0.a("b9e1hTz7\n", "DrTB7FOVLUM=\n"), this.f92952e);
        bundle.putInt(com.neeeex.eraser.m0.a("4GFblqg=\n", "lA4u9cD83g0=\n"), i11);
        bundle.putInt(com.neeeex.eraser.m0.a("r7PMJOJKNx8=\n", "wdy4TYQzfns=\n"), i10);
        bundle.putString(com.neeeex.eraser.m0.a("kP8Y7LYZijGX\n", "85d5gth85ng=\n"), str);
    }

    public a(Context context, boolean z10, int i10, int i11, int i12, int i13, boolean z11, Function1 function1, Function1 function2, int i14, int i15, int i16, boolean z12, long j10, boolean z13, boolean z14, boolean z15) {
        com.neeeex.eraser.m0.a("g5xTClM=\n", "9/UnZjayVOY=\n");
        function1.getClass();
        com.neeeex.eraser.m0.a("2XMslESV0A==\n", "uhxC4CH7pPw=\n");
        function2.getClass();
        this.f92948a = context;
        this.f92949b = z10;
        this.f92950c = i10;
        this.f92951d = i11;
        this.f92952e = i12;
        this.f92953f = i13;
        this.f92954g = z11;
        this.f92955h = function1;
        this.f92956i = function2;
        this.f92957j = i14;
        this.f92958k = i15;
        this.f92959l = i16;
        this.f92960m = z12;
        this.f92961n = j10;
        this.f92962o = z13;
        this.f92963p = z14;
        this.f92964q = z15;
    }
}