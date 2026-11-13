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
    public static final String f91414b = "neeeex_recovery_notify_channel_020" /* decoded XOR */;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final String f91415c = "neeeex_RecoveryNotifyChannel020" /* decoded XOR */;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final String f91416d = "neeeex_messaging" /* decoded XOR */;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final e f91413a = new e();

    public static /* synthetic */ void c(e eVar, String str, int i10, int i11, int i12, Object obj) {
        if ((i12 & 4) != 0) {
            i11 = 0;
        }
        eVar.b(str, i10, i11);
    }

    public final Intent a(Context context, int i10) {
        "context" /* decoded XOR */;
        context.getClass();
        Intent intent = new Intent(context, (Class<?>) SplashNEEEEXActivity.class);
        intent.setAction("android.intent.action.VIEW" /* decoded XOR */);
        intent.addCategory("android.intent.category.LAUNCHER" /* decoded XOR */);
        intent.setFlags(335544320);
        if (i10 != 0) {
            intent.putExtra("from" /* decoded XOR */, 5);
            String strA = "bundle" /* decoded XOR */;
            Bundle bundle = new Bundle();
            bundle.putInt("action" /* decoded XOR */, i10);
            fl.m0 m0Var = fl.m0.f80959a;
            intent.putExtra(strA, bundle);
        }
        return intent;
    }

    public final void b(String str, int i10, int i11) {
        "content" /* decoded XOR */;
        str.getClass();
        Context contextA = y.Companion.a();
        if (contextA == null) {
            return;
        }
        Object systemService = contextA.getSystemService("notification" /* decoded XOR */);
        "null cannot be cast to non-null type android.app.NotificationManager" /* decoded XOR */;
        systemService.getClass();
        String str2 = f91414b;
        ((NotificationManager) systemService).createNotificationChannel(new NotificationChannel(str2, f91415c, 4));
        Intent intentA = a(contextA, i11);
        PendingIntent activity = PendingIntent.getActivity(contextA, 0, NotificationRouter.wrap(contextA, intentA), 201326592);
        Intent intent = new Intent(intentA);
        intent.setAction(contextA.getPackageName() + ".action.OPEN_RECOMMENDATION");
        intent.putExtra("notifyId" /* decoded XOR */, i10);
        PendingIntent activity2 = PendingIntent.getActivity(contextA, i10 + 1, NotificationRouter.wrap(contextA, intent), 201326592);
        Bitmap bitmapDecodeResource = BitmapFactory.decodeResource(contextA.getResources(), R$drawable.neeeex_ic_app);
        String string = contextA.getString(R$string.app_name);
        "getString(...)" /* decoded XOR */;
        string.getClass();
        IconCompat iconCompatG = IconCompat.g(bitmapDecodeResource);
        "createWithBitmap(...)" /* decoded XOR */;
        iconCompatG.getClass();
        androidx.core.app.c.C0164c c0164cF = new androidx.core.app.c.C0164c().f(string);
        String str3 = f91416d;
        androidx.core.app.c cVarA = c0164cF.e(str3).c(iconCompatG).a();
        "build(...)" /* decoded XOR */;
        cVarA.getClass();
        m2.b bVarA = new m2.b.C1131b(contextA, str3).k(string).g(string).c(iconCompatG).d(intentA).i(cVarA).h(true).f(new l2.c(str3)).b(a1.d("android.intent.category.LAUNCHER" /* decoded XOR */)).a();
        "build(...)" /* decoded XOR */;
        bVarA.getClass();
        m2.d.f(contextA, bVarA);
        NotificationCompat.p pVarI = new NotificationCompat.p(cVarA).k(string).l(false).i(str, System.currentTimeMillis(), cVarA);
        "addMessage(...)" /* decoded XOR */;
        pVarI.getClass();
        NotificationCompat.n nVar = new NotificationCompat.n(contextA, str2);
        int i12 = R$drawable.ic_neeeex_push_logo;
        NotificationCompat.n nVarC = nVar.G(i12).i(contextA.getColor(R$color.colorPrimary)).I(pVarI).k(activity).a(i12, contextA.getString(R$string.common_neeeex_open), activity2).f(true).D(str3).y(new l2.c(str3)).b(cVarA).g("call" /* decoded XOR */).C(1);
        g gVar = g.f65506a;
        nVarC.getClass();
        gVar.a(nVarC, com.neeeex.eraser.module.report.bytedance.a.k());
        Notification notificationC = nVarC.c();
        "build(...)" /* decoded XOR */;
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