package com.neeeex.eraser.recover.reco.v;

import androidx.p002lifecycle.ViewModel;
import com.android.launcher3.model.data.ItemInfoWithIcon;
import com.thinkup.core.q.dn;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import p003kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes7.dex */
public final class b0 extends ViewModel {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public b f65973a = new b("", gl.w.m());

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f65974b = -1;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public fl.t f65975c = new fl.t(1, 6);

    public enum a {
        TIMELINE,
        SIZE_LIST;


        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ ml.a f65977b = ml.b.a(d());

        public static ml.a getEntries() {
            return f65977b;
        }
    }

    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f65978a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final List f65979b;

        public b(String str, List list) {
            com.neeeex.eraser.m0.a("B8dyYg==\n", "aaYfB+Un3CE=\n");
            str.getClass();
            com.neeeex.eraser.m0.a("sguHV8xwOA==\n", "0WTpI6keTO8=\n");
            list.getClass();
            this.f65978a = str;
            this.f65979b = list;
        }

        public final List a() {
            return this.f65979b;
        }

        public final String b() {
            return this.f65978a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return p003kotlin.jvm.internal.v.c(this.f65978a, bVar.f65978a) && p003kotlin.jvm.internal.v.c(this.f65979b, bVar.f65979b);
        }

        public int hashCode() {
            return (this.f65978a.hashCode() * 31) + this.f65979b.hashCode();
        }

        public String toString() {
            return "VideoShelf(name=" + this.f65978a + ", content=" + this.f65979b + ")";
        }
    }

    public static final /* synthetic */ class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f65980a;

        static {
            int[] iArr = new int[a.values().length];
            try {
                iArr[a.TIMELINE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[a.SIZE_LIST.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f65980a = iArr;
        }
    }

    public static int d(tl.n nVar, Object obj, Object obj2) {
        return ((Number) nVar.invoke(obj, obj2)).intValue();
    }

    public static int e(ii.c cVar) {
        com.neeeex.eraser.m0.a("WW0=\n", "MBkjcS7lrrA=\n");
        cVar.getClass();
        return 1;
    }

    public static ii.c f(ii.c cVar) {
        com.neeeex.eraser.m0.a("tL4=\n", "3cp9BuM4LSs=\n");
        cVar.getClass();
        return cVar;
    }

    public static int g(int i10, Function1 function1, ii.c cVar, ii.c cVar2) {
        cVar.getClass();
        long jLongValue = ((Number) function1.invoke(cVar)).longValue();
        cVar2.getClass();
        return i10 * p003kotlin.jvm.internal.v.e(jLongValue, ((Number) function1.invoke(cVar2)).longValue());
    }

    private final List j() {
        List listL = l();
        int i10 = c.f65980a[u().ordinal()];
        if (i10 == 1) {
            return i(listL);
        }
        if (i10 == 2) {
            return h(listL, new p003kotlin.jvm.internal.n0() { // from class: com.neeeex.eraser.recover.reco.v.b0.e
                {
                    com.neeeex.eraser.m0.a("62MVUaTAdnc=\n", "jQp5NPepDBI=\n");
                    com.neeeex.eraser.m0.a("OpwNljePDGg0gxz4d6k=\n", "Xfl50F7jaTs=\n");
                }

                @Override // p003kotlin.jvm.internal.n0, p003kotlin.jvm.internal.m0, bm.o
                public Object get(Object obj) {
                    return Long.valueOf(((ii.c) obj).f());
                }
            });
        }
        coil.util.j.a();
        return null;
    }

    private final boolean t() {
        return ((Number) this.f65975c.getSecond()).intValue() == 5;
    }

    private final Long w() {
        int i10 = this.f65974b;
        if (i10 == 1) {
            return Long.valueOf(dn.f73836d0);
        }
        if (i10 != 11) {
            return i10 != 12 ? null : 16070400000L;
        }
        return 2678400000L;
    }

    public final List A(Function1 function1) {
        ArrayList arrayList = new ArrayList();
        for (ii.c cVar : this.f65973a.a()) {
            if (cVar.i() && !cVar.j()) {
                arrayList.add(function1.invoke(cVar));
            }
        }
        return arrayList;
    }

    public final List h(List list, final Function1 function1) {
        final int i10 = t() ? 1 : -1;
        final tl.n nVar = new tl.n() { // from class: com.neeeex.eraser.recover.reco.v.x
            @Override // tl.n
            public final Object invoke(Object obj, Object obj2) {
                return Integer.valueOf(b0.g(i10, function1, (ii.c) obj, (ii.c) obj2));
            }
        };
        return gl.g0.i1(gl.g0.V0(list, new Comparator() { // from class: com.neeeex.eraser.recover.reco.v.y
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                return b0.d(nVar, obj, obj2);
            }
        }));
    }

    public final List i(List list) {
        List<ii.c> listH = h(list, new p003kotlin.jvm.internal.n0() { // from class: com.neeeex.eraser.recover.reco.v.b0.d
            {
                com.neeeex.eraser.m0.a("p1qszuK0L22pTQ==\n", "xCjJr5bRewQ=\n");
                com.neeeex.eraser.m0.a("MpALKEcmDiowoRYGUGtGFA==\n", "VfV/azVDb14=\n");
            }

            @Override // p003kotlin.jvm.internal.n0, p003kotlin.jvm.internal.m0, bm.o
            public Object get(Object obj) {
                return Long.valueOf(((ii.c) obj).a());
            }
        });
        ArrayList arrayList = new ArrayList();
        String str = null;
        int i10 = -1;
        for (ii.c cVar : listH) {
            String str2 = new SimpleDateFormat(com.neeeex.eraser.m0.a("8iN/+SCSIRrvPg==\n", "i1oGgA3fbDc=\n")).format(new Date(cVar.a()));
            com.neeeex.eraser.m0.a("xv9bqM/mgWaOvgA=\n", "oJApxa6SqUg=\n");
            str2.getClass();
            if (!p003kotlin.jvm.internal.v.c(str2, str)) {
                int size = arrayList.size();
                arrayList.add(v(cVar));
                i10 = size;
                str = str2;
            } else if (!cVar.i() && i10 >= 0) {
                ((ii.c) arrayList.get(i10)).m(false);
            }
            arrayList.add(cVar);
        }
        return arrayList;
    }

    public final void k() {
        Iterator it = this.f65973a.a().iterator();
        while (it.hasNext()) {
            ((ii.c) it.next()).m(false);
        }
    }

    public final List l() {
        Long lW = w();
        Long lValueOf = lW != null ? Long.valueOf(System.currentTimeMillis() - lW.longValue()) : null;
        b bVar = this.f65973a;
        if (lValueOf == null) {
            return bVar.a();
        }
        List listA = bVar.a();
        ArrayList arrayList = new ArrayList();
        for (Object obj : listA) {
            if (((ii.c) obj).a() >= lValueOf.longValue()) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    public final int m() {
        return this.f65974b;
    }

    public final String n() {
        return this.f65973a.b();
    }

    public final int o() {
        return gl.g0.W0(A(new Function1() { // from class: com.neeeex.eraser.recover.reco.v.a0
            @Override // p003kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return Integer.valueOf(b0.e((ii.c) obj));
            }
        }));
    }

    public final List p() {
        return A(new Function1() { // from class: com.neeeex.eraser.recover.reco.v.z
            @Override // p003kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return b0.f((ii.c) obj);
            }
        });
    }

    public final fl.t q() {
        return this.f65975c;
    }

    public final void r(ii.b bVar) {
        com.neeeex.eraser.m0.a("9wgt8p7E\n", "kWdBlvu2T9w=\n");
        bVar.getClass();
        this.f65973a = new b(bVar.a(), gl.g0.i1(bVar.b()));
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0023 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:12:0x0025 A[RETURN] */
    public final boolean s() {
        for (Object obj : this.f65973a.a()) {
            if (!((ii.c) obj).i()) {
                if (obj == null) {
                    return true;
                }
                return false;
            }
        }
        obj = null;
        if (obj == null) {
            return true;
        }
        return false;
    }

    public final a u() {
        return ((Number) this.f65975c.getFirst()).intValue() == 1 ? a.TIMELINE : a.SIZE_LIST;
    }

    public final ii.c v(ii.c cVar) {
        long jA = cVar.a();
        String str = new SimpleDateFormat(com.neeeex.eraser.m0.a("HcvKoVRnT/gp//4=\n", "UIaHgTADYYE=\n")).format(new Date(jA));
        com.neeeex.eraser.m0.a("XE7hXrSdwzUUD7o=\n", "OiGTM9Xp6xs=\n");
        str.getClass();
        return new ii.c(0, str, str, 0L, 0L, "", jA, str, true, cVar.i(), false, false, ItemInfoWithIcon.FLAG_SHOW_DOWNLOAD_PROGRESS_MASK, null);
    }

    public final void x(int i10) {
        this.f65974b = i10;
    }

    public final void y(fl.t tVar) {
        com.neeeex.eraser.m0.a("+pF3cxlJlw==\n", "xuISBzR2qWI=\n");
        tVar.getClass();
        this.f65975c = tVar;
    }

    public final List z() {
        return j();
    }
}