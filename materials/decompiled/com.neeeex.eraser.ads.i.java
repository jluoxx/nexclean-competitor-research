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
    public static final String f64943d = m0.a("6Jx1I8EA1OLmgVMdygru9eaPaRLaAA==\n", "g/kMfK9lsYc=\n");

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final String f64944e = m0.a("iWQyKPIzhh2HeRQD/T+AEIte\n", "4gFLd5xW43g=\n");

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
        bundle.putString(m0.a("j4BLUSSQ/LU=\n", "7PU5I0H+n8w=\n"), m0.a("ug11\n", "714xHVPbuHE=\n"));
        bundle.putDouble(m0.a("VoAAiCE=\n", "IOFs/UTDnrU=\n"), dT);
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
                f64941b = b0.f66131a.v(m0.a("S5f7pxrFxQRAuMKgDdPUPkuTxbsL/9QIVYI=\n", "OOekyX+goGE=\n"), 0L);
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
        if (a(dT, d11, 0.2d, m0.a("oJH/vPzG04e+xZL6rQ==\n", "4fWgyp2qpuI=\n")) || a(dT, d11, 0.25d, m0.a("KTZ+gf9kXHo3YhPCrg==\n", "aFIh954IKR8=\n")) || a(dT, d11, 0.3d, m0.a("7HlkmXjh+FvyLQjfKQ==\n", "rR077xmNjT4=\n")) || a(dT, d11, 0.4d, m0.a("DTi0TNXB4UITbN8KhA==\n", "TFzrOrStlCc=\n")) || a(dT, d11, 0.5d, m0.a("Ryl/VSljIEFZfRUTeA==\n", "Bk0gI0gPVSQ=\n")) || a(dT, d11, 0.6d, m0.a("QwJCL3Q0pVNdVitpJQ==\n", "AmYdWRVY0DY=\n")) || a(dT, d11, 0.7d, m0.a("6l0wqGIwJbf0CVjuMw==\n", "qzlv3gNcUNI=\n")) || a(dT, d11, 0.8d, m0.a("PmDiZ/a3dPIgNIUhpw==\n", "fwS9EZfbAZc=\n")) || a(dT, d11, 0.9d, m0.a("IgP/kuQQWxo8V5nUtQ==\n", "Y2eg5IV8Ln8=\n"))) {
            return;
        }
        a(dT, d11, 1.0d, m0.a("PtRKkops5noggSXU2w==\n", "f7AV5OsAkx8=\n"));
    }

    public final void f(kj.d dVar) {
        i(dVar);
    }

    public final void g(kj.d dVar, double d10) {
        BigDecimal bigDecimalDivide = new BigDecimal(d10).divide(new BigDecimal(1000), 9, RoundingMode.HALF_UP);
        m0.a("O7Hbbxg5Rthx9oQ=\n", "X9itBnxcbvY=\n");
        bigDecimalDivide.getClass();
        double dDoubleValue = bigDecimalDivide.doubleValue();
        j(dVar);
        String strA = kj.f.a(dVar != null ? dVar.f() : 0);
        m0.a("9e73GUzTNte8pa1+\n", "kouDVy2+U/8=\n");
        strA.getClass();
        String strA2 = kj.g.a(dVar != null ? dVar.c() : 0);
        m0.a("WSs7AnmxP0gQYGFl\n", "Pk5PTBjcWmA=\n");
        strA2.getClass();
        l(strA, strA2, dVar != null ? dVar.a() : null, dDoubleValue);
        k(dDoubleValue);
        String strA3 = kj.f.a(dVar != null ? dVar.f() : 0);
        m0.a("FtUuRrgo6yxfnnQh\n", "cbBaCNlFjgQ=\n");
        strA3.getClass();
        h(dDoubleValue, strA3);
        m(dDoubleValue);
        if (d()) {
            e(dDoubleValue);
        }
    }

    public final void h(double d10, String str) {
        String strA = m0.a("0T5GTlL+lNzfI2BlXfKS0dMEWXNj9p7b0zdaTl3/lebONGByXemF\n", "uls/ETyb8bk=\n");
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
        bundle.putString(m0.a("lMob/X0mQcqcyz0=\n", "8qhEnghUM68=\n"), m0.a("J5v7\n", "csi/nytJwTo=\n"));
        bundle.putString(m0.a("Q4urMYjjFJNLnasmnv0F\n", "Jen0UueNYPY=\n"), m0.a("DfHdjbkgWw==\n", "fYOy6cxDL78=\n"));
        bundle.putString(m0.a("YTGtKC2TfaNl\n", "AFXyW0LmD8A=\n"), str);
        com.facebook.appevents.o oVar = f64945f;
        if (oVar != null) {
            oVar.c(m0.a("knOV3Slxvr6RTqvUIkyjvatyq8Iy\n", "9BHKsEYT19I=\n"), dT, bundle);
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
            SolarEngineManager.getInstance().track(com.neeeex.eraser.module.report.bytedance.d.a(dVar.f()), com.neeeex.eraser.module.report.bytedance.d.c(dVar.b()), com.neeeex.eraser.module.report.bytedance.d.b(dVar.c()), "", dVar.e(), dVar.d(), m0.a("UP1v\n", "Ba4rjjTsBmk=\n"), true, null);
        }
    }

    public final void k(double d10) {
        b(d10, 0.01d, m0.a("CToVnfDYLtpt\n", "XUh6/IPoHus=\n"));
        b(d10, 0.02d, m0.a("VvJvL/bssh0y\n", "AoAAToXcgi8=\n"));
        b(d10, 0.05d, m0.a("ZvJNSaLz8FoC\n", "MoAiKNHDwG8=\n"));
        b(d10, 0.1d, m0.a("1g6iYt85izey\n", "gnzNA6wJugc=\n"));
    }

    public final void l(String str, String str2, String str3, double d10) {
        Bundle bundle = new Bundle();
        bundle.putString(m0.a("6GrZta3Ol4fmfOs=\n", "iQ6GxcGv4+E=\n"), m0.a("NuFTmeE=\n", "Yo4j9o/5+u4=\n"));
        bundle.putString(m0.a("tE3CyIhHqVqw\n", "1Smdu+cy2zk=\n"), str);
        bundle.putString(m0.a("rblR92H0DGO4\n", "zN0OkQ6GYQI=\n"), str2);
        bundle.putString(m0.a("JkDm5fdjGFYpRdT1\n", "RyS5kJkKbAk=\n"), str3);
        bundle.putString(m0.a("UBS/VMYOvh0=\n", "M2HNJqNg3WQ=\n"), m0.a("iOOk\n", "3bDgqSZDCpk=\n"));
        bundle.putDouble(m0.a("yUl+tiQ=\n", "vygSw0HRXFA=\n"), d10);
        ni.a.d(m0.a("y2AOFF7PHvXZdzgSXQ==\n", "qgRRfTO/bJA=\n"), bundle);
    }

    public final void m(double d10) {
        if (f64945f == null) {
            Context contextA = y.Companion.a();
            f64945f = contextA != null ? com.facebook.appevents.o.f52076b.f(contextA) : null;
        }
        com.facebook.appevents.o oVar = f64945f;
        if (oVar != null) {
            oVar.e(new BigDecimal(d10), Currency.getInstance(m0.a("ff+L\n", "KKzPoZPlwjM=\n")));
        }
        Bundle bundle = new Bundle();
        bundle.putString(m0.a("NmgteWbs57Q+aQs=\n", "UApyGhOeldE=\n"), m0.a("ea5v\n", "LP0r+Tjkakc=\n"));
        com.facebook.appevents.o oVar2 = f64945f;
        if (oVar2 != null) {
            oVar2.c(m0.a("3JV9cnWwaoDumFtx\n", "nfE0HwXCD/M=\n"), d10, bundle);
        }
        com.facebook.appevents.o oVar3 = f64945f;
        if (oVar3 != null) {
            oVar3.c(m0.a("gE73nkcgw3m5RcWYWhrRbo9Dxg==\n", "5iyo6Ch/oh0=\n"), d10, bundle);
        }
    }
}