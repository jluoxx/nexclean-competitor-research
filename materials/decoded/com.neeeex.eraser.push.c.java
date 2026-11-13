package com.neeeex.eraser.push;

import android.content.Context;
import android.net.Uri;
import com.neeeex.eraser.MyTransNormalActivity;
import com.neeeex.eraser.m0;
import com.neeeex.eraser.module.main.SplashNEEEEXActivity;
import com.neeeex.eraser.utils.b0;
import com.neeeex.eraser.utils.c0;
import com.neeeex.eraser.y;
import fl.t;
import gl.g0;
import gl.v;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import ri.a2;
import ri.d2;
import ri.g2;
import ri.j2;
import ri.l1;
import ri.o1;
import ri.r1;
import ri.u1;
import ri.x1;

/* JADX INFO: loaded from: classes7.dex */
public final class c {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static volatile long f65489c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static int f65490d;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final String f65488b = "key_neeeex_last_screenshot_push_time" /* decoded XOR */;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final c f65487a = new c();

    public static final class a implements Comparator {
        @Override // java.util.Comparator
        public final int compare(Object obj, Object obj2) {
            Integer num = 1;
            return jl.c.e(((ri.a) obj).x() ? 0 : num, ((ri.a) obj2).x() ? 0 : 1);
        }
    }

    public static final class b implements Comparator {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Comparator f65491a;

        public b(Comparator comparator) {
            this.f65491a = comparator;
        }

        @Override // java.util.Comparator
        public final int compare(Object obj, Object obj2) {
            Integer num = 1;
            int iCompare = this.f65491a.compare(obj, obj2);
            if (iCompare != 0) {
                return iCompare;
            }
            return jl.c.e(((ri.a) obj).y() ? 0 : num, ((ri.a) obj2).y() ? 0 : 1);
        }
    }

    /* JADX INFO: renamed from: com.neeeex.eraser.push.c$c, reason: collision with other inner class name */
    public static final class C0786c implements Comparator {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Comparator f65492a;

        public C0786c(Comparator comparator) {
            this.f65492a = comparator;
        }

        @Override // java.util.Comparator
        public final int compare(Object obj, Object obj2) {
            Integer num = 1;
            int iCompare = this.f65492a.compare(obj, obj2);
            if (iCompare != 0) {
                return iCompare;
            }
            return jl.c.e(((ri.a) obj).q() ? 0 : num, ((ri.a) obj2).q() ? 0 : 1);
        }
    }

    public static /* synthetic */ void v(c cVar, int i10, int i11, boolean z10, int i12, Object obj) {
        if ((i12 & 4) != 0) {
            z10 = false;
        }
        cVar.u(i10, i11, z10);
    }

    public final List A() {
        List listK = l.f65528a.k();
        ArrayList arrayList = new ArrayList();
        for (Object obj : listK) {
            if (((ri.a) obj).a(f65490d, false)) {
                arrayList.add(obj);
            }
        }
        return g0.V0(v.f(arrayList), new C0786c(new b(new a())));
    }

    public final void B(ri.a aVar, int i10, int i11) {
        f65490d = aVar.p();
        l.f65528a.p(aVar, i10, i11);
    }

    public final boolean C(Context context) {
        return c0.f66142a.i(context);
    }

    public final boolean D(int i10, long j10) {
        long jV = b0.f66131a.v("last_post_time" /* decoded XOR */, 0L);
        h hVar = h.f65507a;
        if (j10 < (hVar.a() - 1000) + jV) {
            return false;
        }
        return i10 != 2 || j10 >= jV + (hVar.g() - 1000);
    }

    public final boolean a(long j10, boolean z10, int i10) {
        return (j10 >= f65489c + 3000 || z10) && b(y.Companion.a()) && D(i10, j10);
    }

    public final boolean b(Context context) {
        return (context == null || !ui.a.f100035a.a(context) || C(context)) ? false : true;
    }

    public final void c() {
        l lVar = l.f65528a;
        t tVarJ = lVar.j(101);
        l.e(lVar, ((Number) tVarJ.component1()).intValue(), (String) tVarJ.component2(), null, 4, null);
    }

    public final void d() {
        l lVar = l.f65528a;
        t tVarJ = lVar.j(102);
        l.e(lVar, ((Number) tVarJ.component1()).intValue(), (String) tVarJ.component2(), null, 4, null);
    }

    public final void e() {
        l lVar = l.f65528a;
        t tVarJ = lVar.j(103);
        l.e(lVar, ((Number) tVarJ.component1()).intValue(), (String) tVarJ.component2(), null, 4, null);
    }

    public final void f() {
        l lVar = l.f65528a;
        t tVarJ = lVar.j(301);
        l.e(lVar, ((Number) tVarJ.component1()).intValue(), (String) tVarJ.component2(), null, 4, null);
    }

    public final void g() {
        l lVar = l.f65528a;
        t tVarJ = lVar.j(303);
        l.e(lVar, ((Number) tVarJ.component1()).intValue(), (String) tVarJ.component2(), null, 4, null);
    }

    public final void h() {
        l lVar = l.f65528a;
        t tVarJ = lVar.j(302);
        l.e(lVar, ((Number) tVarJ.component1()).intValue(), (String) tVarJ.component2(), null, 4, null);
    }

    public final void i() {
        l lVar = l.f65528a;
        t tVarJ = lVar.j(202);
        l.e(lVar, ((Number) tVarJ.component1()).intValue(), (String) tVarJ.component2(), null, 4, null);
    }

    public final void j() {
        l lVar = l.f65528a;
        t tVarJ = lVar.j(201);
        l.e(lVar, ((Number) tVarJ.component1()).intValue(), (String) tVarJ.component2(), null, 4, null);
    }

    public final void k() {
        l lVar = l.f65528a;
        t tVarJ = lVar.j(100);
        l.e(lVar, ((Number) tVarJ.component1()).intValue(), (String) tVarJ.component2(), null, 4, null);
    }

    public final void l(int i10, int i11) {
        z();
        u(i10, i11, true);
    }

    public final void m(int i10, int i11) {
        List listK = l.f65528a.k();
        ArrayList arrayList = new ArrayList();
        for (Object obj : listK) {
            if (((ri.a) obj).A()) {
                arrayList.add(obj);
            }
        }
        if (arrayList.size() == 1) {
            n((ri.a) g0.p0(arrayList), i10, i11);
        } else if (arrayList.isEmpty()) {
            l(i10, i11);
        }
    }

    public final void n(ri.a aVar, int i10, int i11) {
        if (aVar.a(f65490d, true)) {
            B(aVar, i10, i11);
            z();
        }
    }

    public final void o(String str) {
        "retainADActivityName" /* decoded XOR */;
        str.getClass();
        if (ui.a.f100035a.a(y.Companion.a()) && com.neeeex.eraser.module.report.bytedance.a.k()) {
            u1 u1Var = new u1(str);
            l.f65528a.o(u1Var, 11);
            mi.a.f88870a.m0(u1Var.p(), 11);
        }
    }

    public final void p(String str) {
        "retainADActivityName" /* decoded XOR */;
        str.getClass();
        if (ui.a.f100035a.a(y.Companion.a()) && com.neeeex.eraser.module.report.bytedance.a.k()) {
            x1 x1Var = new x1(str);
            l.f65528a.o(x1Var, 12);
            mi.a.f88870a.m0(x1Var.p(), 12);
        }
    }

    public final void q() {
        if (ui.a.f100035a.a(y.Companion.a()) && com.neeeex.eraser.module.report.bytedance.a.k()) {
            a2 a2Var = new a2();
            l.f65528a.o(a2Var, 13);
            mi.a.f88870a.m0(a2Var.p(), 13);
        }
    }

    public final void r() {
        if (ui.a.f100035a.a(y.Companion.a())) {
            String name = SplashNEEEEXActivity.class.getName();
            "getName(...)" /* decoded XOR */;
            l1 l1Var = new l1(name);
            l.f65528a.o(l1Var, 30);
            mi.a.f88870a.m0(l1Var.p(), 30);
        }
    }

    public final synchronized void s(Uri uri) {
        "imageUri" /* decoded XOR */;
        uri.getClass();
        Context contextA = y.Companion.a();
        if (contextA == null) {
            return;
        }
        if (ui.a.f100035a.a(contextA) && com.neeeex.eraser.module.report.bytedance.a.k()) {
            long jCurrentTimeMillis = System.currentTimeMillis();
            b0 b0Var = b0.f66131a;
            long jV = b0Var.v("sp_neeeex_first_start_time" /* decoded XOR */, 0L);
            String str = f65488b;
            if (p.f65536a.a(jCurrentTimeMillis, jV, b0Var.v(str, 0L), c0.f66142a.h())) {
                o1 o1Var = new o1(uri);
                l.f65528a.o(o1Var, 32);
                b0Var.C(str, jCurrentTimeMillis);
                mi.a.f88870a.m0(o1Var.p(), 32);
            }
        }
    }

    public final void t() {
        if (ui.a.f100035a.a(y.Companion.a())) {
            String name = SplashNEEEEXActivity.class.getName();
            "getName(...)" /* decoded XOR */;
            r1 r1Var = new r1(name);
            l.f65528a.o(r1Var, 31);
            mi.a.f88870a.m0(r1Var.p(), 31);
        }
    }

    public final synchronized void u(int i10, int i11, boolean z10) {
        long jCurrentTimeMillis = System.currentTimeMillis();
        if (a(jCurrentTimeMillis, z10, i10)) {
            f65489c = jCurrentTimeMillis;
            List listA = A();
            if (listA.isEmpty()) {
                m(i10, i11);
            } else {
                B((ri.a) g0.p0(listA), i10, i11);
            }
        }
    }

    public final void w() {
        if (ui.a.f100035a.a(y.Companion.a())) {
            String name = MyTransNormalActivity.class.getName();
            "getName(...)" /* decoded XOR */;
            g2 g2Var = new g2(name);
            l.f65528a.o(g2Var, 21);
            mi.a.f88870a.m0(g2Var.p(), 21);
        }
    }

    public final void x() {
        if (ui.a.f100035a.a(y.Companion.a())) {
            String name = MyTransNormalActivity.class.getName();
            "getName(...)" /* decoded XOR */;
            j2 j2Var = new j2(name);
            l.f65528a.o(j2Var, 20);
            mi.a.f88870a.m0(j2Var.p(), 20);
        }
    }

    public final void y(String str) {
        "retainSplashActivityName" /* decoded XOR */;
        str.getClass();
        if (ui.a.f100035a.a(y.Companion.a()) && com.neeeex.eraser.module.report.bytedance.a.k()) {
            d2 d2Var = new d2(str);
            l.f65528a.o(d2Var, 10);
            mi.a.f88870a.m0(d2Var.p(), 10);
        }
    }

    public final void z() {
        f65490d = 0;
        Iterator it = l.f65528a.k().iterator();
        while (it.hasNext()) {
            ((ri.a) it.next()).B();
        }
    }
}