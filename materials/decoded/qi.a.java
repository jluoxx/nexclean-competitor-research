package qi;

import am.q;
import android.R;
import android.app.Notification;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.SweepGradient;
import android.os.Build;
import android.os.Bundle;
import android.os.Environment;
import android.os.StatFs;
import android.service.notification.StatusBarNotification;
import android.widget.RemoteViews;
import androidx.core.app.NotificationCompat;
import com.neeeex.eraser.R$color;
import com.neeeex.eraser.R$drawable;
import com.neeeex.eraser.R$id;
import com.neeeex.eraser.R$layout;
import com.neeeex.eraser.R$string;
import com.neeeex.eraser.launcher.NotificationRouter;
import com.neeeex.eraser.m0;
import com.neeeex.eraser.module.main.SplashNEEEEXActivity;
import com.neeeex.eraser.push.service.NEEEEXFGService;
import com.neeeex.eraser.utils.g;
import com.neeeex.eraser.y;
import fl.u;
import fl.v;
import gl.w;
import j2.l;
import java.util.Iterator;

/* JADX INFO: loaded from: classes7.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f92153a = new a();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static int f92154b;

    public static /* synthetic */ Notification h(a aVar, Context context, boolean z10, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            z10 = aVar.k(context);
        }
        return aVar.g(context, z10);
    }

    public final void a(RemoteViews remoteViews, Context context, int i10, int i11) {
        Bundle bundle = new Bundle();
        bundle.putInt("action" /* decoded XOR */, i11);
        fl.m0 m0Var = fl.m0.f80959a;
        remoteViews.setOnClickPendingIntent(i10, i(context, 3, bundle));
    }

    public final RemoteViews b(Context context, boolean z10) {
        RemoteViews remoteViews = new RemoteViews(context.getPackageName(), R$layout.push_neeeex_ongoing);
        Context contextB = g.b(context);
        a aVar = f92153a;
        int iJ = aVar.j();
        int i10 = R$id.tv_neeeex_clean_junk;
        remoteViews.setTextViewText(i10, contextB.getString(R$string.main_neeeex_clean_junk));
        int i11 = R$id.tv_neeeex_virus_scan;
        remoteViews.setTextViewText(i11, contextB.getString(R$string.virus_neeeex_title));
        int i12 = R$id.tv_neeeex_storage;
        remoteViews.setTextViewText(i12, contextB.getString(R$string.push_neeeex_ongoing_storage));
        remoteViews.setTextViewText(R$id.tv_neeeex_storage_percent, c.f92156a.a(iJ));
        remoteViews.setImageViewBitmap(R$id.iv_neeeex_storage_progress, aVar.c(context, iJ));
        if (Build.VERSION.SDK_INT >= 36 && z10) {
            int color = context.getColor(R.color.system_on_secondary_light);
            int color2 = context.getColor(R.color.system_on_secondary_dark);
            Iterator it = w.p(Integer.valueOf(i10), Integer.valueOf(i11), Integer.valueOf(i12)).iterator();
            while (it.hasNext()) {
                remoteViews.setColorInt(((Number) it.next()).intValue(), "setTextColor" /* decoded XOR */, color, color2);
            }
        }
        a aVar2 = f92153a;
        aVar2.a(remoteViews, context, R$id.ll_neeeex_clean_junk, 11);
        aVar2.a(remoteViews, context, R$id.ll_neeeex_virus_scan, 16);
        aVar2.a(remoteViews, context, R$id.ll_neeeex_storage, 10);
        return remoteViews;
    }

    public final Bitmap c(Context context, int i10) {
        float f10 = context.getResources().getDisplayMetrics().density;
        int iF = q.f(wl.c.d(32.0f * f10), 1);
        int iF2 = q.f(wl.c.d(31.0f * f10), 1);
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(iF, iF, Bitmap.Config.ARGB_8888);
        "createBitmap(...)" /* decoded XOR */;
        bitmapCreateBitmap.getClass();
        Canvas canvas = new Canvas(bitmapCreateBitmap);
        float f11 = iF / 2.0f;
        float f12 = (iF - iF2) / 2.0f;
        float f13 = f10 * 1.03f;
        float f14 = f13 / 2.0f;
        float f15 = f12 + f14;
        float f16 = (iF2 + f12) - f14;
        RectF rectF = new RectF(f15, f15, f16, f16);
        Paint paint = new Paint(1);
        e(context, canvas, f12, iF2, paint);
        SweepGradient sweepGradient = new SweepGradient(f11, f11, new int[]{Color.parseColor("#FFFF5574" /* decoded XOR */), Color.parseColor("#FFFF0004" /* decoded XOR */), Color.parseColor("#FFFF5574" /* decoded XOR */)}, new float[]{0.0f, 0.72f, 1.0f});
        Matrix matrix = new Matrix();
        matrix.postRotate(0.0f, f11, f11);
        sweepGradient.setLocalMatrix(matrix);
        paint.reset();
        paint.setAntiAlias(true);
        paint.setShader(sweepGradient);
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeCap(Paint.Cap.ROUND);
        paint.setStrokeWidth(f13);
        canvas.drawArc(rectF, 0.0f, (q.p(i10, 0, 100) * 360.0f) / 100.0f, false, paint);
        return bitmapCreateBitmap;
    }

    public final boolean d(Context context) {
        "context" /* decoded XOR */;
        context.getClass();
        l lVarB = l.b(context);
        "from(...)" /* decoded XOR */;
        lVarB.getClass();
        boolean z10 = false;
        if (!lVarB.a()) {
            return false;
        }
        NotificationChannel notificationChannelC = lVarB.c("126666" /* decoded XOR */);
        if (notificationChannelC != null && notificationChannelC.getImportance() == 0) {
            z10 = true;
        }
        return !z10;
    }

    public final void e(Context context, Canvas canvas, float f10, int i10, Paint paint) {
        Bitmap bitmapDecodeResource = BitmapFactory.decodeResource(context.getResources(), R$drawable.ic_neeeex_ongoing_storage_base);
        if (bitmapDecodeResource != null) {
            if (bitmapDecodeResource.getWidth() != i10 || bitmapDecodeResource.getHeight() != i10) {
                bitmapDecodeResource = Bitmap.createScaledBitmap(bitmapDecodeResource, i10, i10, true);
                bitmapDecodeResource.getClass();
            }
            canvas.drawBitmap(bitmapDecodeResource, f10, f10, (Paint) null);
            return;
        }
        paint.reset();
        paint.setAntiAlias(true);
        paint.setStyle(Paint.Style.FILL);
        paint.setColor(Color.parseColor("#FFFF315E" /* decoded XOR */));
        float f11 = i10 / 2.0f;
        float f12 = f10 + f11;
        canvas.drawCircle(f12, f12, f11, paint);
    }

    public final void f(Context context, String str) {
        Object systemService = context.getSystemService("notification" /* decoded XOR */);
        "null cannot be cast to non-null type android.app.NotificationManager" /* decoded XOR */;
        systemService.getClass();
        NotificationManager notificationManager = (NotificationManager) systemService;
        if (notificationManager.getNotificationChannel(str) == null) {
            NotificationChannel notificationChannel = new NotificationChannel(str, str, 4);
            notificationChannel.setShowBadge(false);
            notificationChannel.setSound(null, null);
            notificationChannel.enableVibration(false);
            notificationManager.createNotificationChannel(notificationChannel);
        }
    }

    public final Notification g(Context context, boolean z10) {
        "context" /* decoded XOR */;
        context.getClass();
        String strA = "126666" /* decoded XOR */;
        f(context, strA);
        boolean z11 = Build.VERSION.SDK_INT >= 36 && z10;
        String strConcat = context.getString(R$string.app_name) + "-" + strA;
        RemoteViews remoteViewsB = b(context, z10);
        NotificationCompat.n nVarG = new NotificationCompat.n(context, strA).G(R$drawable.ic_neeeex_push_logo);
        if (z11) {
            strConcat = strConcat.concat(":foreground");
        }
        NotificationCompat.n nVarC = nVarG.t(strConcat).o(remoteViewsB).n(remoteViewsB.clone()).M(System.currentTimeMillis()).I(new NotificationCompat.o()).H(null).E(true).F(true).B(true).A(true).f(false).C(2);
        com.neeeex.eraser.push.g gVar = com.neeeex.eraser.push.g.f65506a;
        nVarC.getClass();
        gVar.a(nVarC, com.neeeex.eraser.module.report.bytedance.a.k());
        if (z11) {
            nVarC.j(true);
        } else {
            nVarC.i(context.getColor(R$color.colorPrimary));
        }
        Notification notificationC = nVarC.c();
        "build(...)" /* decoded XOR */;
        notificationC.getClass();
        return notificationC;
    }

    public final PendingIntent i(Context context, int i10, Bundle bundle) {
        Intent intent = new Intent(context, (Class<?>) SplashNEEEEXActivity.class);
        intent.addFlags(805306368);
        intent.setPackage(context.getPackageName());
        intent.putExtra("from" /* decoded XOR */, i10);
        intent.putExtra("bundle" /* decoded XOR */, bundle);
        PendingIntent activity = PendingIntent.getActivity(context, l(), NotificationRouter.wrap(context, intent), Build.VERSION.SDK_INT >= 31 ? 201326592 : 134217728);
        "getActivity(...)" /* decoded XOR */;
        activity.getClass();
        return activity;
    }

    public final int j() {
        Object objM372constructorimpl;
        try {
            u.a aVar = u.Companion;
            StatFs statFs = new StatFs(Environment.getExternalStorageDirectory().getPath());
            objM372constructorimpl = u.m372constructorimpl(Integer.valueOf(c.f92156a.b(statFs.getAvailableBlocksLong() * statFs.getBlockSizeLong(), statFs.getBlockCountLong() * statFs.getBlockSizeLong())));
        } catch (Throwable th2) {
            u.a aVar2 = u.Companion;
            objM372constructorimpl = u.m372constructorimpl(v.a(th2));
        }
        if (u.m377isFailureimpl(objM372constructorimpl)) {
            objM372constructorimpl = 0;
        }
        return ((Number) objM372constructorimpl).intValue();
    }

    public final boolean k(Context context) {
        Object objM372constructorimpl;
        boolean z10;
        if (Build.VERSION.SDK_INT < 36) {
            return false;
        }
        if (!NEEEEXFGService.INSTANCE.a()) {
            try {
                u.a aVar = u.Companion;
                Object systemService = context.getSystemService("notification" /* decoded XOR */);
                "null cannot be cast to non-null type android.app.NotificationManager" /* decoded XOR */;
                systemService.getClass();
                StatusBarNotification[] activeNotifications = ((NotificationManager) systemService).getActiveNotifications();
                "getActiveNotifications(...)" /* decoded XOR */;
                activeNotifications.getClass();
                int length = activeNotifications.length;
                int i10 = 0;
                while (true) {
                    if (i10 >= length) {
                        z10 = false;
                        break;
                    }
                    StatusBarNotification statusBarNotification = activeNotifications[i10];
                    if (statusBarNotification.getId() == 126666 && statusBarNotification.getTag() == null && p003kotlin.jvm.internal.v.c(statusBarNotification.getNotification().getChannelId(), "126666" /* decoded XOR */) && (statusBarNotification.getNotification().flags & 64) != 0) {
                        z10 = true;
                        break;
                    }
                    i10++;
                }
                objM372constructorimpl = u.m372constructorimpl(Boolean.valueOf(z10));
            } catch (Throwable th2) {
                u.a aVar2 = u.Companion;
                objM372constructorimpl = u.m372constructorimpl(v.a(th2));
            }
            Boolean bool = Boolean.FALSE;
            if (u.m377isFailureimpl(objM372constructorimpl)) {
                objM372constructorimpl = bool;
            }
            if (!((Boolean) objM372constructorimpl).booleanValue()) {
                return false;
            }
        }
        return true;
    }

    public final int l() {
        int i10 = (f92154b % 10000) + 1;
        f92154b = i10;
        return i10;
    }

    public final void m() {
        Context contextA = y.Companion.a();
        if (contextA != null) {
            a aVar = f92153a;
            if (aVar.d(contextA)) {
                Object systemService = contextA.getSystemService("notification" /* decoded XOR */);
                "null cannot be cast to non-null type android.app.NotificationManager" /* decoded XOR */;
                systemService.getClass();
                ((NotificationManager) systemService).notify(126666, h(aVar, contextA, false, 2, null));
            }
        }
    }
}