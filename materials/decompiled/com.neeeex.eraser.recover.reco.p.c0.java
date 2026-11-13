package com.neeeex.eraser.recover.reco.p;

import androidx.p002lifecycle.ViewModel;
import com.android.launcher3.model.data.ItemInfoWithIcon;
import com.thinkup.core.q.dn;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import p003kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes7.dex */
public final class c0 extends ViewModel {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f65805b;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public b f65804a = new b("", gl.w.m(), 0);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f65806c = -1;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public fl.t f65807d = new fl.t(1, 6);

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final long f65808a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final boolean f65809b;

        public a(long j10, boolean z10) {
            this.f65808a = j10;
            this.f65809b = z10;
        }

        public final boolean a(ii.c cVar) {
            com.neeeex.eraser.m0.a("s0weXh8=\n", "wyRxKnBwT+Q=\n");
            cVar.getClass();
            if (cVar.a() >= this.f65808a) {
                return (this.f65809b && cVar.k()) ? false : true;
            }
            return false;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return this.f65808a == aVar.f65808a && this.f65809b == aVar.f65809b;
        }

        public int hashCode() {
            return (Long.hashCode(this.f65808a) * 31) + Boolean.hashCode(this.f65809b);
        }

        public String toString() {
            return "FilterSnapshot(oldestTimestamp=" + this.f65808a + ", hideLowQuality=" + this.f65809b + ")";
        }
    }

    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f65810a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final List f65811b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final int f65812c;

        public b(String str, List list, int i10) {
            com.neeeex.eraser.m0.a("YeKuv8Rd\n", "B43C26EvO5o=\n");
            str.getClass();
            com.neeeex.eraser.m0.a("bThgIeJV\n", "HVAPVY0mYGQ=\n");
            list.getClass();
            this.f65810a = str;
            this.f65811b = list;
            this.f65812c = i10;
        }

        public final String a() {
            return this.f65810a;
        }

        public final int b() {
            return this.f65812c;
        }

        public final List c() {
            return this.f65811b;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return p003kotlin.jvm.internal.v.c(this.f65810a, bVar.f65810a) && p003kotlin.jvm.internal.v.c(this.f65811b, bVar.f65811b) && this.f65812c == bVar.f65812c;
        }

        public int hashCode() {
            return (((this.f65810a.hashCode() * 31) + this.f65811b.hashCode()) * 31) + Integer.hashCode(this.f65812c);
        }

        public String toString() {
            return "PhotoSource(folder=" + this.f65810a + ", photos=" + this.f65811b + ", lowQualityCount=" + this.f65812c + ")";
        }
    }

    public static int d(tl.n nVar, Object obj, Object obj2) {
        return ((Number) nVar.invoke(obj, obj2)).intValue();
    }

    public static int e(int i10, Function1 function1, ii.c cVar, ii.c cVar2) {
        cVar.getClass();
        long jLongValue = ((Number) function1.invoke(cVar)).longValue();
        cVar2.getClass();
        return i10 * p003kotlin.jvm.internal.v.e(jLongValue, ((Number) function1.invoke(cVar2)).longValue());
    }

    public static final void g(p003kotlin.jvm.internal.v0 v0Var, List list, c0 c0Var) {
        if (((List) v0Var.element).isEmpty()) {
            return;
        }
        list.add(c0Var.j((List) v0Var.element));
        list.addAll((Collection) v0Var.element);
        v0Var.element = new ArrayList();
    }

    private final List h() {
        List listC = this.f65804a.c();
        a aVarK = k();
        ArrayList arrayList = new ArrayList();
        for (Object obj : listC) {
            if (aVarK.a((ii.c) obj)) {
                arrayList.add(obj);
            }
        }
        List listW = w(arrayList, ((Number) this.f65807d.getFirst()).intValue() == 1 ? new p003kotlin.jvm.internal.n0() { // from class: com.neeeex.eraser.recover.reco.p.c0.c
            {
                com.neeeex.eraser.m0.a("QfN9sxFk/lFP5A==\n", "IoEY0mUBqjg=\n");
                com.neeeex.eraser.m0.a("1cUoAABwd3bX9DUuFz0/SA==\n", "sqBcQ3IVFgI=\n");
            }

            @Override // p003kotlin.jvm.internal.n0, p003kotlin.jvm.internal.m0, bm.o
            public Object get(Object obj2) {
                return Long.valueOf(((ii.c) obj2).a());
            }
        } : new p003kotlin.jvm.internal.n0() { // from class: com.neeeex.eraser.recover.reco.p.c0.d
            {
                com.neeeex.eraser.m0.a("ll7ZStRbguw=\n", "8De1L4cy+Ik=\n");
                com.neeeex.eraser.m0.a("qMOuWAYI1/Wm3L82Ri4=\n", "z6baHm9ksqY=\n");
            }

            @Override // p003kotlin.jvm.internal.n0, p003kotlin.jvm.internal.m0, bm.o
            public Object get(Object obj2) {
                return Long.valueOf(((ii.c) obj2).f());
            }
        });
        return ((Number) this.f65807d.getFirst()).intValue() == 1 ? f(listW) : gl.g0.i1(listW);
    }

    private final boolean t() {
        return ((Number) this.f65807d.getSecond()).intValue() == 5;
    }

    public final void A() {
        this.f65805b = !this.f65805b;
    }

    public final List B() {
        return h();
    }

    public final List f(List list) {
        ArrayList arrayList = new ArrayList();
        p003kotlin.jvm.internal.v0 v0Var = new p003kotlin.jvm.internal.v0();
        v0Var.element = new ArrayList();
        Iterator it = list.iterator();
        String str = null;
        while (it.hasNext()) {
            ii.c cVar = (ii.c) it.next();
            String str2 = new SimpleDateFormat(com.neeeex.eraser.m0.a("akAVWU4ROBd3XQ==\n", "EzlsIGNcdTo=\n")).format(new Date(cVar.a()));
            com.neeeex.eraser.m0.a("3wTwlXYbU9OXRas=\n", "uWuC+Bdve/0=\n");
            str2.getClass();
            if (str != null && !p003kotlin.jvm.internal.v.c(str, str2)) {
                g(v0Var, arrayList, this);
            }
            ((List) v0Var.element).add(cVar);
            str = str2;
        }
        g(v0Var, arrayList, this);
        return arrayList;
    }

    public final void i() {
        Iterator it = this.f65804a.c().iterator();
        while (it.hasNext()) {
            ((ii.c) it.next()).m(false);
        }
    }

    public final ii.c j(List list) {
        long jA = ((ii.c) gl.g0.p0(list)).a();
        String str = new SimpleDateFormat(com.neeeex.eraser.m0.a("LDVG1woSfsIYAXI=\n", "YXgL9252ULs=\n")).format(new Date(jA));
        com.neeeex.eraser.m0.a("nMwcpm+1fxXUjUc=\n", "+qNuyw7BVzs=\n");
        str.getClass();
        List list2 = list;
        boolean z10 = true;
        if (!(list2 instanceof Collection) || !list2.isEmpty()) {
            Iterator it = list2.iterator();
            while (it.hasNext()) {
                if (!((ii.c) it.next()).i()) {
                    z10 = false;
                    break;
                }
            }
        }
        return new ii.c(0, str, str, 0L, 0L, "", jA, str, true, z10, false, false, ItemInfoWithIcon.FLAG_SHOW_DOWNLOAD_PROGRESS_MASK, null);
    }

    public final a k() {
        Long lV = v();
        return new a(lV == null ? Long.MIN_VALUE : System.currentTimeMillis() - lV.longValue(), this.f65805b);
    }

    public final int l() {
        return this.f65806c;
    }

    public final String m() {
        return this.f65804a.a();
    }

    public final int n() {
        return this.f65804a.b();
    }

    public final int o() {
        int i10 = 0;
        for (ii.c cVar : this.f65804a.c()) {
            i10 += (!cVar.i() || (this.f65805b && cVar.k())) ? 0 : 1;
        }
        return i10;
    }

    public final List p() {
        return x();
    }

    public final fl.t q() {
        return this.f65807d;
    }

    public final void r(ii.b bVar) {
        com.neeeex.eraser.m0.a("JY9FpROr\n", "Q+ApwXbZWiM=\n");
        bVar.getClass();
        List listI1 = gl.g0.i1(bVar.b());
        String strA = bVar.a();
        List list = listI1;
        int i10 = 0;
        if (!(list instanceof Collection) || !list.isEmpty()) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                if (((ii.c) it.next()).k() && (i10 = i10 + 1) < 0) {
                    gl.w.v();
                }
            }
        }
        this.f65804a = new b(strA, listI1, i10);
    }

    public final boolean s() {
        List listC = this.f65804a.c();
        if ((listC instanceof Collection) && listC.isEmpty()) {
            return true;
        }
        Iterator it = listC.iterator();
        while (it.hasNext()) {
            if (!((ii.c) it.next()).i()) {
                return false;
            }
        }
        return true;
    }

    public final boolean u() {
        return this.f65805b;
    }

    public final Long v() {
        int i10 = this.f65806c;
        if (i10 == 1) {
            return Long.valueOf(dn.f73836d0);
        }
        if (i10 != 11) {
            return i10 != 12 ? null : 16070400000L;
        }
        return 2678400000L;
    }

    public final List w(List list, final Function1 function1) {
        final int i10 = t() ? 1 : -1;
        final tl.n nVar = new tl.n() { // from class: com.neeeex.eraser.recover.reco.p.a0
            @Override // tl.n
            public final Object invoke(Object obj, Object obj2) {
                return Integer.valueOf(c0.e(i10, function1, (ii.c) obj, (ii.c) obj2));
            }
        };
        return gl.g0.V0(list, new Comparator() { // from class: com.neeeex.eraser.recover.reco.p.b0
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                return c0.d(nVar, obj, obj2);
            }
        });
    }

    public final List x() {
        List listC = this.f65804a.c();
        ArrayList arrayList = new ArrayList();
        for (Object obj : listC) {
            ii.c cVar = (ii.c) obj;
            if (cVar.i() && !cVar.j()) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    public final void y(int i10) {
        this.f65806c = i10;
    }

    public final void z(fl.t tVar) {
        com.neeeex.eraser.m0.a("WaKbqSN5rA==\n", "ZdH+3Q5Gkv0=\n");
        tVar.getClass();
        this.f65807d = tVar;
    }
}