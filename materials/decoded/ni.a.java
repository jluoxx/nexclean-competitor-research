package ni;

import android.content.Context;
import android.os.Bundle;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.neeeex.eraser.y;

/* JADX INFO: loaded from: classes7.dex */
public abstract class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static volatile FirebaseAnalytics f89479a;

    public static void a(Context context) {
        if (context != null) {
            f89479a = FirebaseAnalytics.getInstance(context);
        }
    }

    public static void b(String str, Bundle bundle) {
        FirebaseAnalytics firebaseAnalyticsE;
        if (str == null || (firebaseAnalyticsE = e()) == null) {
            return;
        }
        firebaseAnalyticsE.a(str, bundle);
    }

    public static void c(String str) {
        b(str, null);
    }

    public static void d(String str, Bundle bundle) {
        b(str, bundle);
    }

    public static FirebaseAnalytics e() {
        FirebaseAnalytics firebaseAnalytics;
        Context contextA;
        FirebaseAnalytics firebaseAnalytics2 = f89479a;
        if (firebaseAnalytics2 != null) {
            return firebaseAnalytics2;
        }
        synchronized (a.class) {
            try {
                firebaseAnalytics = f89479a;
                if (firebaseAnalytics == null && (contextA = y.Companion.a()) != null) {
                    firebaseAnalytics = FirebaseAnalytics.getInstance(contextA);
                    f89479a = firebaseAnalytics;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return firebaseAnalytics;
    }
}