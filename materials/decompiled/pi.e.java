package pi;

import android.app.Notification;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Bundle;
import androidx.core.app.NotificationCompat;
import androidx.core.graphics.drawable.IconCompat;
import com.neeeex.eraser.R$color;
import com.neeeex.eraser.R$drawable;
import com.neeeex.eraser.R$string;
import com.neeeex.eraser.launcher.NotificationRouter;
import com.neeeex.eraser.m0;
import com.neeeex.eraser.module.main.SplashNEEEEXActivity;
import com.neeeex.eraser.push.g;
import com.neeeex.eraser.y;
import com.thinkup.core.api.bridge.NetworkAgentEventManager;
import gl.a1;

/* JADX INFO: loaded from: classes7.dex */
public final class e {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final String f91414b = m0.a("p5pnJCDmhFysnG03IOyicaeQdigj54RNoZ5sLyDyhB77zw==\n", "yf8CQUWe2y4=\n");

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final String f91415c = m0.a("CuRze+0alnMB4nlo7RCwbwv1f3jxIaFACu9zcrhQ+Q==\n", "ZIEWHohiySE=\n");

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final String f91416d = m0.a("XmaUPDLBmMJVcII4MNCpyA==\n", "MAPxWVe5x68=\n");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final e f91413a = new e();

    public static /* synthetic */ void c(e eVar, String str, int i10, int i11, int i12, Object obj) {
        if ((i12 & 4) != 0) {
            i11 = 0;
        }
        eVar.b(str, i10, i11);
    }

    public final Intent a(Context context, int i10) {
        m0.a("PRuGnPefOQ==\n", "XnTo6JLnTVM=\n");
        context.getClass();
        Intent intent = new Intent(context, (Class<?>) SplashNEEEEXActivity.class);
        intent.setAction(m0.a("hgxaP/ixX3iODEoo+awVN4QWVyL59m0fojU=\n", "52I+TZfYO1Y=\n"));
        intent.addCategory(m0.a("IB6miSmxuFwoHraeKKzyESAEp5wpqqVcDTGXtQWQmSA=\n", "QXDC+0bY3HI=\n"));
        intent.setFlags(335544320);
        if (i10 != 0) {
            intent.putExtra(m0.a("W4JuMA==\n", "PfABXYAwk40=\n"), 5);
            String strA = m0.a("pjjMCbDk\n", "xE2ibdyBZRo=\n");
            Bundle bundle = new Bundle();
            bundle.putInt(m0.a("etsIFxJw\n", "G7h8fn0exwI=\n"), i10);
            fl.m0 m0Var = fl.m0.f80959a;
            intent.putExtra(strA, bundle);
        }
        return intent;
    }

    public final void b(String str, int i10, int i11) {
        m0.a("pce7H2Eshg==\n", "xqjVawRC8nU=\n");
        str.getClass();
        Context contextA = y.Companion.a();
        if (contextA == null) {
            return;
        }
        Object systemService = contextA.getSystemService(m0.a("etgCHwIY2qdg3hkY\n", "FLd2dmRxucY=\n"));
        m0.a("kCHkmZ/E9tCQO/zV3cK33Z8n/NXLyLfQkTqlm8rL+56KLfiQn8b52ow74ZGRxufO0BrngdbB/t2f\nIOGa0er20J8z7Yc=\n", "/lSI9b+nl74=\n");
        systemService.getClass();
        String str2 = f91414b;
        ((NotificationManager) systemService).createNotificationChannel(new NotificationChannel(str2, f91415c, 4));
        Intent intentA = a(contextA, i11);
        PendingIntent activity = PendingIntent.getActivity(contextA, 0, NotificationRouter.wrap(contextA, intentA), 201326592);
        Intent intent = new Intent(intentA);
        intent.setAction(contextA.getPackageName() + ".action.OPEN_RECOMMENDATION");
        intent.putExtra(m0.a("DV1O3O0bw4Y=\n", "YzI6tYtiiuI=\n"), i10);
        PendingIntent activity2 = PendingIntent.getActivity(contextA, i10 + 1, NotificationRouter.wrap(contextA, intent), 201326592);
        Bitmap bitmapDecodeResource = BitmapFactory.decodeResource(contextA.getResources(), R$drawable.neeeex_ic_app);
        String string = contextA.getString(R$string.app_name);
        m0.a("NtnBw4teIQQ2lJu+0QU=\n", "Uby1kP8sSGo=\n");
        string.getClass();
        IconCompat iconCompatG = IconCompat.g(bitmapDecodeResource);
        m0.a("7QV/SPNiSmf6H1hA82p8fqZZNAeu\n", "jncaKYcHHQ4=\n");
        iconCompatG.getClass();
        androidx.core.app.c.C0164c c0164cF = new androidx.core.app.c.C0164c().f(string);
        String str3 = f91416d;
        androidx.core.app.c cVarA = c0164cF.e(str3).c(iconCompatG).a();
        m0.a("CdJuBQy166NFjg==\n", "a6cHaWidxY0=\n");
        cVarA.getClass();
        m2.b bVarA = new m2.b.C1131b(contextA, str3).k(string).g(string).c(iconCompatG).d(intentA).i(cVarA).h(true).f(new l2.c(str3)).b(a1.d(m0.a("TK8Dk5mK+RNErxOEmJezXky1AoaZkeQTYYAyr7Wr2G8=\n", "LcFn4fbjnT0=\n"))).a();
        m0.a("eRbyN4h2MCo1Sg==\n", "G2ObW+xeHgQ=\n");
        bVarA.getClass();
        m2.d.f(contextA, bVarA);
        NotificationCompat.p pVarI = new NotificationCompat.p(cVarA).k(string).l(false).i(str, System.currentTimeMillis(), cVarA);
        m0.a("Fj81rTFwie4QPnnOei3T\n", "d1tR4FQD+o8=\n");
        pVarI.getClass();
        NotificationCompat.n nVar = new NotificationCompat.n(contextA, str2);
        int i12 = R$drawable.ic_neeeex_push_logo;
        NotificationCompat.n nVarC = nVar.G(i12).i(contextA.getColor(R$color.colorPrimary)).I(pVarI).k(activity).a(i12, contextA.getString(R$string.common_neeeex_open), activity2).f(true).D(str3).y(new l2.c(str3)).b(cVarA).g(m0.a("tPkUcQ==\n", "15h4Hf2ROK8=\n")).C(1);
        g gVar = g.f65506a;
        nVarC.getClass();
        gVar.a(nVarC, com.neeeex.eraser.module.report.bytedance.a.k());
        Notification notificationC = nVarC.c();
        m0.a("S8/6SuHr59sHkw==\n", "KbqTJoXDyfU=\n");
        notificationC.getClass();
        com.neeeex.eraser.push.e.l(contextA, null, i10, notificationC);
    }

    public final void d() {
        Context contextA = y.Companion.a();
        if (contextA != null && ui.a.f100035a.a(contextA)) {
            yl.c.a aVar = yl.c.Default;
            if (aVar.nextInt(100) < 5) {
                c(this, c.f91405a.e(contextA, aVar.nextInt(40) + 1), NetworkAgentEventManager.NETWORK_AGENT_EVENT_TYPE_PG_INIT, 0, 4, null);
                mi.a.f88870a.u0();
            } else {
                c.a aVarD = c.f91405a.d(contextA);
                b(aVarD.b(), NetworkAgentEventManager.NETWORK_AGENT_EVENT_TYPE_PG_INIT, aVarD.a());
                mi.a.f88870a.u0();
            }
            d.f91409a.c();
        }
    }
}