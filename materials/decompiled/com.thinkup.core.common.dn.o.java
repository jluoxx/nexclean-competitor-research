package com.thinkup.core.common.dn;

import android.app.Activity;
import android.content.Context;
import android.text.TextUtils;
import com.thinkup.core.api.TUDebuggerConfig;
import com.thinkup.core.common.o.nd;
import sd.a;
import sd.b;
import sd.c;
import sd.e;
import sd.f;

/* JADX INFO: loaded from: classes7.dex */
public class o {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static volatile o f68791d;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final c f68792m;

    /* JADX INFO: renamed from: com.thinkup.core.common.dn.o$3, reason: invalid class name */
    public class AnonymousClass3 implements Runnable {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ Activity f68799d;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        final /* synthetic */ d f68800m;

        public AnonymousClass3(Activity activity, d dVar) {
            this.f68799d = activity;
            this.f68800m = dVar;
        }

        @Override // java.lang.Runnable
        public final void run() {
            f.c(this.f68799d, new b.a() { // from class: com.thinkup.core.common.dn.o.3.1
                @Override // sd.b.a
                public final void onConsentFormDismissed(e eVar) {
                    AnonymousClass3 anonymousClass3 = AnonymousClass3.this;
                    if (eVar != null) {
                        anonymousClass3.f68800m.d("UMP Consent failed to show form.");
                    } else {
                        anonymousClass3.f68800m.d(true);
                    }
                }
            });
        }
    }

    public interface d {
        void d(String str);

        void d(boolean z10);
    }

    private o(Context context) {
        this.f68792m = f.a(context);
    }

    private void m(Activity activity, d dVar) {
        try {
            if (!d()) {
                dVar.d("isPrivacyOptionsRequired is not.");
            } else {
                nd.m();
                nd.m(new AnonymousClass3(activity, dVar));
            }
        } catch (Throwable th2) {
            dVar.d("secondAdsConsent:" + th2.getMessage());
        }
    }

    public final void d(final Activity activity, final d dVar) {
        sd.d dVarA;
        Context applicationContext = activity.getApplicationContext();
        TUDebuggerConfig tUDebuggerConfigOn = nd.m().on();
        if (tUDebuggerConfigOn == null || TextUtils.isEmpty(tUDebuggerConfigOn.getUMPTestDeviceId())) {
            dVarA = new sd.d.a().a();
        } else {
            dVarA = new sd.d.a().b(new a.C1221a(applicationContext).c(1).a(tUDebuggerConfigOn.getUMPTestDeviceId()).b()).a();
        }
        this.f68792m.requestConsentInfoUpdate(activity, dVarA, new c.b() { // from class: com.thinkup.core.common.dn.o.1
            @Override // sd.c.b
            public final void onConsentInfoUpdateSuccess() {
                if (!o.this.f68792m.isConsentFormAvailable()) {
                    dVar.d("UMP Consent failed to load form.");
                } else if (o.this.f68792m.getConsentStatus() != 2) {
                    dVar.d(false);
                } else {
                    f.b(activity, new b.a() { // from class: com.thinkup.core.common.dn.o.1.1
                        @Override // sd.b.a
                        public final void onConsentFormDismissed(e eVar) {
                            AnonymousClass1 anonymousClass1 = AnonymousClass1.this;
                            if (eVar != null) {
                                dVar.d("UMP Consent failed to show form.");
                            } else {
                                dVar.d(true);
                            }
                        }
                    });
                }
            }
        }, new c.a() { // from class: com.thinkup.core.common.dn.o.2
            @Override // sd.c.a
            public final void onConsentInfoUpdateFailure(e eVar) {
                d dVar2 = dVar;
                if (dVar2 != null) {
                    if (eVar == null) {
                        dVar2.d("UMP Consent InfoUpdateFailure");
                        return;
                    }
                    StringBuilder sb2 = new StringBuilder("UMP Consent InfoUpdateFailure,error:");
                    sb2.append(eVar.a());
                    sb2.append(",");
                    sb2.append(eVar.b());
                    dVar2.d(eVar.b());
                }
            }
        });
    }

    public final boolean m() {
        return this.f68792m.canRequestAds();
    }

    public static o d(Context context) {
        if (f68791d == null) {
            synchronized (o.class) {
                try {
                    if (f68791d == null) {
                        f68791d = new o(context);
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        return f68791d;
    }

    public final boolean d() {
        return this.f68792m.getPrivacyOptionsRequirementStatus() == c.EnumC1222c.REQUIRED;
    }
}