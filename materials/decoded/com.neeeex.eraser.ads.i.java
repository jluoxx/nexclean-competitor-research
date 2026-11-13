package com.neeeex.eraser.ads;

import android.content.Context;
import android.os.Bundle;
import com.neeeex.eraser.m0;
import com.neeeex.eraser.utils.b0;
import com.neeeex.eraser.y;
import com.reyun.solar.engine.SolarEngineManager;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Currency;

/* JADX INFO: loaded from: classes7.dex */
public final class i {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static volatile long f64941b;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static com.facebook.appevents.o f64945f;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final String f64943d = "key_neeeex_aeo_revenue" /* decoded XOR */;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final String f64944e = "key_neeeex_taichi_" /* decoded XOR */;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final i f64940a = new i();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static boolean f64942c = true;

    static {
        Context contextA = y.Companion.a();
        f64945f = contextA != null ? com.facebook.appevents.o.f52076b.f(contextA) : null;
    }

    public final boolean a(double d10, double d11, double d12, String str) {
        if (d10 >= d12) {
            return false;
        }
        if (d11 < d12) {
            return true;
        }
        ni.a.c(str);
        if (f64945f == null) {
            Context contextA = y.Companion.a();
            f64945f = contextA != null ? com.facebook.appevents.o.f52076b.f(contextA) : null;
        }
        com.facebook.appevents.o oVar = f64945f;
        if (oVar == null) {
            return false;
        }
        oVar.b(str);
        return false;
    }

    public final void b(double d10, double d11, String str) {
        String str2 = "key_neeeex_taichi_" + str;
        b0 b0Var = b0.f66131a;
        double dT = b0Var.t(str2, 0.0d) + d10;
        if (dT < d11) {
            b0Var.A(str2, dT);
            return;
        }
        Bundle bundle = new Bundle();
        bundle.putString("currency" /* decoded XOR */, "USD" /* decoded XOR */);
        bundle.putDouble("value" /* decoded XOR */, dT);
        ni.a.d(str, bundle);
        b0Var.A(str2, 0.0d);
    }

    public final long c() {
        if (f64941b == 0) {
            try {
                Context contextA = y.Companion.a();
                f64941b = contextA != null ? contextA.getPackageManager().getPackageInfo(contextA.getPackageName(), 0).firstInstallTime : 0L;
            } catch (Throwable unused) {
            }
            if (f64941b == 0) {
                f64941b = b0.f66131a.v("sp_neeeex_first_start_time" /* decoded XOR */, 0L);
            }
        }
        return f64941b;
    }

    public final boolean d() {
        boolean z10 = false;
        if (f64942c) {
            z10 = System.currentTimeMillis() - c() <= 86400000;
            f64942c = z10;
        }
        return z10;
    }

    public final void e(double d10) {
        b0 b0Var = b0.f66131a;
        String str = f64943d;
        double dT = b0Var.t(str, 0.0d);
        double d11 = dT + d10;
        b0Var.A(str, d11);
        if (a(dT, d11, 0.2d, "Ad_value_0200" /* decoded XOR */) || a(dT, d11, 0.25d, "Ad_value_0250" /* decoded XOR */) || a(dT, d11, 0.3d, "Ad_value_0300" /* decoded XOR */) || a(dT, d11, 0.4d, "Ad_value_0400" /* decoded XOR */) || a(dT, d11, 0.5d, "Ad_value_0500" /* decoded XOR */) || a(dT, d11, 0.6d, "Ad_value_0600" /* decoded XOR */) || a(dT, d11, 0.7d, "Ad_value_0700" /* decoded XOR */) || a(dT, d11, 0.8d, "Ad_value_0800" /* decoded XOR */) || a(dT, d11, 0.9d, "Ad_value_0900" /* decoded XOR */)) {
            return;
        }
        a(dT, d11, 1.0d, "Ad_value_1000" /* decoded XOR */);
    }

    public final void f(kj.d dVar) {
        i(dVar);
    }

    public final void g(kj.d dVar, double d10) {
        BigDecimal bigDecimalDivide = new BigDecimal(d10).divide(new BigDecimal(1000), 9, RoundingMode.HALF_UP);
        "divide(...)" /* decoded XOR */;
        bigDecimalDivide.getClass();
        double dDoubleValue = bigDecimalDivide.doubleValue();
        j(dVar);
        String strA = kj.f.a(dVar != null ? dVar.f() : 0);
        "getName(...)" /* decoded XOR */;
        strA.getClass();
        String strA2 = kj.g.a(dVar != null ? dVar.c() : 0);
        "getName(...)" /* decoded XOR */;
        strA2.getClass();
        l(strA, strA2, dVar != null ? dVar.a() : null, dDoubleValue);
        k(dDoubleValue);
        String strA3 = kj.f.a(dVar != null ? dVar.f() : 0);
        "getName(...)" /* decoded XOR */;
        strA3.getClass();
        h(dDoubleValue, strA3);
        m(dDoubleValue);
        if (d()) {
            e(dDoubleValue);
        }
    }

    public final void h(double d10, String str) {
        String strA = "key_neeeex_taichi_fb_mobile_add_to_cart" /* decoded XOR */;
        b0 b0Var = b0.f66131a;
        double dT = b0Var.t(strA, 0.0d) + d10;
        if (dT < 0.01d) {
            b0Var.A(strA, dT);
            return;
        }
        if (f64945f == null) {
            Context contextA = y.Companion.a();
            f64945f = contextA != null ? com.facebook.appevents.o.f52076b.f(contextA) : null;
        }
        Bundle bundle = new Bundle();
        bundle.putString("fb_currency" /* decoded XOR */, "USD" /* decoded XOR */);
        bundle.putString("fb_content_type" /* decoded XOR */, "product" /* decoded XOR */);
        bundle.putString("ad_source" /* decoded XOR */, str);
        com.facebook.appevents.o oVar = f64945f;
        if (oVar != null) {
            oVar.c("fb_mobile_add_to_cart" /* decoded XOR */, dT, bundle);
        }
        b0Var.A(strA, 0.0d);
    }

    public final void i(kj.d dVar) {
        if (dVar != null) {
            SolarEngineManager.getInstance().track(com.neeeex.eraser.module.report.bytedance.d.a(dVar.f()), com.neeeex.eraser.module.report.bytedance.d.c(dVar.b()), com.neeeex.eraser.module.report.bytedance.d.b(dVar.c()), dVar.e(), null);
        }
    }

    public final void j(kj.d dVar) {
        if (dVar != null) {
            SolarEngineManager.getInstance().track(com.neeeex.eraser.module.report.bytedance.d.a(dVar.f()), com.neeeex.eraser.module.report.bytedance.d.c(dVar.b()), com.neeeex.eraser.module.report.bytedance.d.b(dVar.c()), "", dVar.e(), dVar.d(), "USD" /* decoded XOR */, true, null);
        }
    }

    public final void k(double d10) {
        b(d10, 0.01d, "Troas0010" /* decoded XOR */);
        b(d10, 0.02d, "Troas0020" /* decoded XOR */);
        b(d10, 0.05d, "Troas0050" /* decoded XOR */);
        b(d10, 0.1d, "Troas0100" /* decoded XOR */);
    }

    public final void l(String str, String str2, String str3, double d10) {
        Bundle bundle = new Bundle();
        bundle.putString("ad_platform" /* decoded XOR */, "Topon" /* decoded XOR */);
        bundle.putString("ad_source" /* decoded XOR */, str);
        bundle.putString("ad_format" /* decoded XOR */, str2);
        bundle.putString("ad_unit_name" /* decoded XOR */, str3);
        bundle.putString("currency" /* decoded XOR */, "USD" /* decoded XOR */);
        bundle.putDouble("value" /* decoded XOR */, d10);
        ni.a.d("ad_impression" /* decoded XOR */, bundle);
    }

    public final void m(double d10) {
        if (f64945f == null) {
            Context contextA = y.Companion.a();
            f64945f = contextA != null ? com.facebook.appevents.o.f52076b.f(contextA) : null;
        }
        com.facebook.appevents.o oVar = f64945f;
        if (oVar != null) {
            oVar.e(new BigDecimal(d10), Currency.getInstance("USD" /* decoded XOR */));
        }
        Bundle bundle = new Bundle();
        bundle.putString("fb_currency" /* decoded XOR */, "USD" /* decoded XOR */);
        com.facebook.appevents.o oVar2 = f64945f;
        if (oVar2 != null) {
            oVar2.c("AdImpression" /* decoded XOR */, d10, bundle);
        }
        com.facebook.appevents.o oVar3 = f64945f;
        if (oVar3 != null) {
            oVar3.c("fb_vo_ad_impression" /* decoded XOR */, d10, bundle);
        }
    }
}