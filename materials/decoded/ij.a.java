package ij;

import android.app.Application;
import hj.a0;
import hj.a2;
import hj.d3;
import hj.r2;
import hj.u0;
import hj.x1;

/* JADX INFO: loaded from: classes7.dex */
public abstract class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static Application f84629a;

    public static boolean a() {
        return u0.f83705a.d();
    }

    public static Application b() {
        try {
            return (Application) Class.forName("android.app.ActivityThread").getMethod("currentApplication", null).invoke(null, null);
        } catch (Exception unused) {
            return null;
        }
    }

    public static Application c() {
        if (f84629a == null) {
            Application applicationB = b();
            if (applicationB == null) {
                applicationB = d();
            }
            f84629a = applicationB != null ? (Application) applicationB.getApplicationContext() : null;
        }
        return f84629a;
    }

    public static Application d() {
        try {
            return (Application) Class.forName("android.app.AppGlobals").getMethod("getInitialApplication", null).invoke(null, null);
        } catch (Exception unused) {
            return null;
        }
    }

    public static void e(Application application, kj.a aVar) {
        k(application);
        u0.f83705a.b(application, aVar);
    }

    public static void f() {
        d3.f83538a.b();
    }

    public static void g() {
        d3.f83538a.a();
    }

    public static void h(Application application) {
        k(application);
        u0.f83705a.e();
    }

    public static void i(String str) {
        u0.f83705a.getClass();
        u0.f83713i = new a0(str);
    }

    public static void j(Boolean bool) {
        u0 u0Var = u0.f83705a;
        boolean zBooleanValue = bool.booleanValue();
        u0Var.getClass();
        u0.f83706b = zBooleanValue;
    }

    public static void k(Application application) {
        f84629a = application;
    }

    public static void l(String str) {
        u0.f83705a.c(str);
    }

    public static void m(String str, String str2, String str3, String str4, String str5) {
        u0.f83705a.getClass();
        u0.f83707c = new x1(str, str2, str3, str4, str5);
    }

    public static void n(String str, String str2, String str3, String str4, String str5) {
        u0.f83705a.getClass();
        u0.f83709e = new x1(str, str2, str3, str4, str5);
    }

    public static void o(String str, String str2, String str3, String str4, String str5) {
        u0.f83705a.getClass();
        u0.f83708d = new x1(str, str2, str3, str4, str5);
    }

    public static void p(String str, String str2, String str3, String str4, String str5) {
        u0.f83705a.getClass();
        u0.f83710f = new x1(str, str2, str3, str4, str5);
    }

    public static void q(String str, String str2, String str3) {
        u0.f83705a.getClass();
        u0.f83711g = new a2(str, str2, str3);
    }

    public static void r(String str) {
        u0.f83705a.getClass();
        u0.f83712h = new r2(str);
    }
}