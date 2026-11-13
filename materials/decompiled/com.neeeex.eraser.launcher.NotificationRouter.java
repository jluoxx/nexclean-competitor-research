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
    private static final String EXTRA_TARGET = m0.a("1AYxdIAF5MrSEXI/nAHyysVHMDubDuLH0htyFKE0yOn+Kh0Opy/P8OMoDh2rNA==\n", "t2lcWu5gga8=\n");
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
        m0.a("mT0OqhpbazawOReMXhQ2a9c=\n", "/lh66XY6GEU=\n");
        className.getClass();
        if ((!e0.U(className, m0.a("ZPivDtMqKNdi7+w=\n", "B5fCIL1PTbI=\n"), false, 2, null) && !p003kotlin.jvm.internal.v.c(component.getClassName(), m0.a("cKuvg400kd5ys77Ek3uq0Wa1vMWAPJT8cK6xzokwlA==\n", "EdvfreFV5rA=\n"))) || p003kotlin.jvm.internal.v.c(component.getClassName(), NotificationDeliveryActivity.class.getName())) {
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
        m0.a("25CEcu8LwQ==\n", "uP/qBopztZQ=\n");
        context.getClass();
        m0.a("i0nQKxjVCHc=\n", "5Du5THG7aRs=\n");
        original.getClass();
        Bundle bundleExtra = original.getBundleExtra(m0.a("hpGGrWaO\n", "5OToyQrrsa4=\n"));
        int intExtra = original.getIntExtra(m0.a("SNeFIw==\n", "LqXqTg8/YQ8=\n"), 0);
        int i10 = bundleExtra != null ? bundleExtra.getInt(m0.a("7DE73fJr\n", "jVJPtJ0FlQ8=\n")) : 0;
        int i11 = bundleExtra != null ? bundleExtra.getInt(m0.a("bcl+51NSNw==\n", "HqobiTYbUxw=\n")) : 0;
        ComponentName component = original.getComponent();
        String className = component != null ? component.getClassName() : null;
        if (className == null) {
            className = "";
        }
        Intent intent = new Intent(context, (Class<?>) NotificationDeliveryActivity.class);
        intent.setAction(context.getPackageName() + ".notification." + intExtra + "." + i10 + "." + i11);
        intent.setData(new Uri.Builder().scheme(m0.a("6S5m9+LNFdQ=\n", "h0selI6odLo=\n")).authority(m0.a("0iz+FE0fkGnIKuUT\n", "vEOKfSt28wg=\n")).appendPath(String.valueOf(intExtra)).appendPath(String.valueOf(i10)).appendPath(String.valueOf(i11)).appendPath(className).build());
        intent.putExtra(EXTRA_TARGET, DesktopNavigator.INSTANCE.toolIntent(original));
        Bundle extras = original.getExtras();
        if (extras != null) {
            intent.putExtras(extras);
        }
        intent.setFlags(872415232);
        return intent;
    }

    public final Intent businessTarget(Context context, Intent source) {
        m0.a("+ZEHiGzOOg==\n", "mv5p/Am2TpM=\n");
        context.getClass();
        m0.a("r9C+iqlp\n", "3L/L+MoM6U4=\n");
        source.getClass();
        Intent target = readTarget(context, source);
        if (source.getIntExtra(m0.a("L1JLpQ==\n", "SSAkyJrlq9Y=\n"), 0) == 10) {
            return target;
        }
        Set setK = b1.k(MainActivity.class.getName(), SplashNEEEEXActivity.class.getName());
        ComponentName component = target.getComponent();
        if (!setK.contains(component != null ? component.getClassName() : null)) {
            return target;
        }
        Intent intentFromNotification = LauncherActionNavigator.INSTANCE.fromNotification(context, source.getBundleExtra(m0.a("iwuAlMQO\n", "6X7u8KhrX44=\n")));
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
        m0.a("1V56PiQsdg==\n", "tjEUSkFUAiY=\n");
        context.getClass();
        m0.a("Rmnth2lVOmo=\n", "IgyB7h8wSBM=\n");
        delivery.getClass();
        String str = EXTRA_TARGET;
        Intent intent = (Intent) delivery.getParcelableExtra(str);
        if (intent != null) {
            if (!INSTANCE.allowed(context, intent)) {
                intent = null;
            }
            if (intent != null) {
                Intent intent2 = new Intent(intent);
                intent2.putExtra(m0.a("HLYwngI/fpUdpzydDiRAjxu8O6QEK0iYGYw2lAk0VJYXtw==\n", "ctNV+2dHIfs=\n"), delivery.getBooleanExtra(m0.a("L8EEQ6MQOyku0AhArwsFMyjLD3mlBA0kKvsCSagbESokwA==\n", "QaRhJsZoZEc=\n"), false));
                intent2.putExtra(m0.a("L8CD1KWWLrIk1o3Fr54upTXElMWlii63NfqD37ScCA==\n", "QaXmscDucdY=\n"), delivery.getBooleanExtra(m0.a("8y9uQpzoG5/4OWBTluAbiOkreVOc9Bua6RVuSY3iPQ==\n", "nUoLJ/mQRPs=\n"), false));
                intent2.putExtra(m0.a("Fz37GkixxZsYNvsTcqbqjhcH/wtyrPSfCyE=\n", "eViefy3Jmus=\n"), delivery.getBooleanExtra(m0.a("/Gi8S9oAkpHzY7xC4Be9hPxSuFrgHaOV4HQ=\n", "kg3ZLr94zeE=\n"), false));
                intent2.putExtra(m0.a("t8WWkKvhILix0tXbt+U2uKaEl9+w6ia1sdjV+oDIDIuR+KLhkcUWlg==\n", "1Kr7vsWERd0=\n"), delivery.getIntExtra(m0.a("ark1JXPqS+lsrnZub+5d6Xv4NGpo4U3kbKR2T1jDZ9pMhAFUSc59xw==\n", "CdZYCx2PLow=\n"), -1));
                intent2.putExtra(m0.a("TIoVZg==\n", "Kvh6C8TsmTY=\n"), delivery.getIntExtra(m0.a("8qr6+Q==\n", "lNiVlDt8kIE=\n"), 0));
                Bundle bundleExtra = delivery.getBundleExtra(m0.a("UsggPVgE\n", "ML1OWTRhz6Y=\n"));
                if (bundleExtra != null) {
                    intent2.putExtra(m0.a("6XlfQrU8\n", "iwwxJtlZnco=\n"), bundleExtra);
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