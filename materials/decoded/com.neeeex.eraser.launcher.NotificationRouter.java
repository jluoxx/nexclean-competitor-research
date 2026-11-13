package com.neeeex.eraser.launcher;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import com.neeeex.eraser.MainActivity;
import com.neeeex.eraser.m0;
import com.neeeex.eraser.module.main.SplashNEEEEXActivity;
import gl.b1;
import java.util.Set;
import p003kotlin.Metadata;
import p003kotlin.text.e0;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0018\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u0007H\u0007J\u0016\u0010\u000b\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u0007J\u0016\u0010\r\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\u000e\u001a\u00020\u0007J\u0018\u0010\u000f\u001a\u00020\u00102\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\u0011\u001a\u00020\u0007H\u0002R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0012"}, d2 = {"Lcom/neeeex/eraser/launcher/NotificationRouter;", "", "<init>", "()V", "EXTRA_TARGET", "", "wrap", "Landroid/content/Intent;", "context", "Landroid/content/Context;", "original", "readTarget", "delivery", "businessTarget", "source", "allowed", "", "intent", "tool-feature_productionRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class NotificationRouter {
    private static final String EXTRA_TARGET = "com.neeeex.eraser.launcher.NOTIFICATION_TARGET" /* decoded XOR */;
    public static final NotificationRouter INSTANCE = new NotificationRouter();

    private NotificationRouter() {
    }

    private final boolean allowed(Context context, Intent intent) {
        Object objM372constructorimpl;
        ComponentName component = intent.getComponent();
        if (component == null || !p003kotlin.jvm.internal.v.c(component.getPackageName(), context.getPackageName())) {
            return false;
        }
        String className = component.getClassName();
        "getClassName(...)" /* decoded XOR */;
        className.getClass();
        if ((!e0.U(className, "com.neeeex." /* decoded XOR */, false, 2, null) && !p003kotlin.jvm.internal.v.c(component.getClassName(), "app.lawnchair.LawnchairLauncher" /* decoded XOR */)) || p003kotlin.jvm.internal.v.c(component.getClassName(), NotificationDeliveryActivity.class.getName())) {
            return false;
        }
        try {
            fl.u.a aVar = fl.u.Companion;
            objM372constructorimpl = fl.u.m372constructorimpl(context.getPackageManager().getActivityInfo(component, 0));
        } catch (Throwable th2) {
            fl.u.a aVar2 = fl.u.Companion;
            objM372constructorimpl = fl.u.m372constructorimpl(fl.v.a(th2));
        }
        return fl.u.m378isSuccessimpl(objM372constructorimpl);
    }

    public static final Intent wrap(Context context, Intent original) {
        "context" /* decoded XOR */;
        context.getClass();
        "original" /* decoded XOR */;
        original.getClass();
        Bundle bundleExtra = original.getBundleExtra("bundle" /* decoded XOR */);
        int intExtra = original.getIntExtra("from" /* decoded XOR */, 0);
        int i10 = bundleExtra != null ? bundleExtra.getInt("action" /* decoded XOR */) : 0;
        int i11 = bundleExtra != null ? bundleExtra.getInt("sceneId" /* decoded XOR */) : 0;
        ComponentName component = original.getComponent();
        String className = component != null ? component.getClassName() : null;
        if (className == null) {
            className = "";
        }
        Intent intent = new Intent(context, (Class<?>) NotificationDeliveryActivity.class);
        intent.setAction(context.getPackageName() + ".notification." + intExtra + "." + i10 + "." + i11);
        intent.setData(new Uri.Builder().scheme("nexclean" /* decoded XOR */).authority("notification" /* decoded XOR */).appendPath(String.valueOf(intExtra)).appendPath(String.valueOf(i10)).appendPath(String.valueOf(i11)).appendPath(className).build());
        intent.putExtra(EXTRA_TARGET, DesktopNavigator.INSTANCE.toolIntent(original));
        Bundle extras = original.getExtras();
        if (extras != null) {
            intent.putExtras(extras);
        }
        intent.setFlags(872415232);
        return intent;
    }

    public final Intent businessTarget(Context context, Intent source) {
        "context" /* decoded XOR */;
        context.getClass();
        "source" /* decoded XOR */;
        source.getClass();
        Intent target = readTarget(context, source);
        if (source.getIntExtra("from" /* decoded XOR */, 0) == 10) {
            return target;
        }
        Set setK = b1.k(MainActivity.class.getName(), SplashNEEEEXActivity.class.getName());
        ComponentName component = target.getComponent();
        if (!setK.contains(component != null ? component.getClassName() : null)) {
            return target;
        }
        Intent intentFromNotification = LauncherActionNavigator.INSTANCE.fromNotification(context, source.getBundleExtra("bundle" /* decoded XOR */));
        if (intentFromNotification != null) {
            Bundle extras = source.getExtras();
            if (extras != null) {
                intentFromNotification.putExtras(extras);
            }
            intentFromNotification.removeExtra(EXTRA_TARGET);
            return intentFromNotification;
        }
        Intent intent = new Intent(context, (Class<?>) MainActivity.class);
        Bundle extras2 = source.getExtras();
        if (extras2 != null) {
            intent.putExtras(extras2);
        }
        intent.removeExtra(EXTRA_TARGET);
        return intent;
    }

    public final Intent readTarget(Context context, Intent delivery) {
        "context" /* decoded XOR */;
        context.getClass();
        "delivery" /* decoded XOR */;
        delivery.getClass();
        String str = EXTRA_TARGET;
        Intent intent = (Intent) delivery.getParcelableExtra(str);
        if (intent != null) {
            if (!INSTANCE.allowed(context, intent)) {
                intent = null;
            }
            if (intent != null) {
                Intent intent2 = new Intent(intent);
                intent2.putExtra("neeeex_notification_click_consumed" /* decoded XOR */, delivery.getBooleanExtra("neeeex_notification_click_consumed" /* decoded XOR */, false));
                intent2.putExtra("neeeex_desktop_started_at_entry" /* decoded XOR */, delivery.getBooleanExtra("neeeex_desktop_started_at_entry" /* decoded XOR */, false));
                intent2.putExtra("neeeex_panel_open_at_entry" /* decoded XOR */, delivery.getBooleanExtra("neeeex_panel_open_at_entry" /* decoded XOR */, false));
                intent2.putExtra("com.neeeex.eraser.launcher.DELIVERY_TASK" /* decoded XOR */, delivery.getIntExtra("com.neeeex.eraser.launcher.DELIVERY_TASK" /* decoded XOR */, -1));
                intent2.putExtra("from" /* decoded XOR */, delivery.getIntExtra("from" /* decoded XOR */, 0));
                Bundle bundleExtra = delivery.getBundleExtra("bundle" /* decoded XOR */);
                if (bundleExtra != null) {
                    intent2.putExtra("bundle" /* decoded XOR */, bundleExtra);
                }
                return intent2;
            }
        }
        Intent intent3 = new Intent(context, (Class<?>) MainActivity.class);
        Bundle extras = delivery.getExtras();
        if (extras != null) {
            intent3.putExtras(extras);
        }
        intent3.removeExtra(str);
        return intent3;
    }
}