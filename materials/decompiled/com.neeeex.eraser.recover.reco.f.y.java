package com.neeeex.eraser.recover.reco.f;

import androidx.p002lifecycle.ViewModel;
import com.android.launcher3.model.data.ItemInfoWithIcon;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.Date;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import p003kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes7.dex */
public final class y extends ViewModel {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public a f65706a = new a(null, null == true ? 1 : 0, 3, null == true ? 1 : 0);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f65707b = -1;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public fl.t f65708c = new fl.t(1, 6);

    public interface b {

        public static final class a implements b {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final Comparator f65711a;

            public a(Comparator comparator) {
                com.neeeex.eraser.m0.a("qcqeAKB9FGil1w==\n", "yqXzcMEPdRw=\n");
                comparator.getClass();
                this.f65711a = comparator;
            }

            public final Comparator a() {
                return this.f65711a;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof a) && p003kotlin.jvm.internal.v.c(this.f65711a, ((a) obj).f65711a);
            }

            public int hashCode() {
                return this.f65711a.hashCode();
            }

            public String toString() {
                return "Flat(comparator=" + this.f65711a + ")";
            }
        }

        /* JADX INFO: renamed from: com.neeeex.eraser.recover.reco.f.y$b$b, reason: collision with other inner class name */
        public static final class C0791b implements b {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final Comparator f65712a;

            public C0791b(Comparator comparator) {
                com.neeeex.eraser.m0.a("VkpYnPAdTeZaVw==\n", "NSU17JFvLJI=\n");
                comparator.getClass();
                this.f65712a = comparator;
            }

            public final Comparator a() {
                return this.f65712a;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof C0791b) && p003kotlin.jvm.internal.v.c(this.f65712a, ((C0791b) obj).f65712a);
            }

            public int hashCode() {
                return this.f65712a.hashCode();
            }

            public String toString() {
                return "Sectioned(comparator=" + this.f65712a + ")";
            }
        }
    }

    public static long d(ii.c cVar) {
        com.neeeex.eraser.m0.a("rok=\n", "x/0irmRYd/k=\n");
        cVar.getClass();
        return cVar.a();
    }

    public static long e(ii.c cVar) {
        com.neeeex.eraser.m0.a("srA=\n", "28SYfxVr/sY=\n");
        cVar.getClass();
        return cVar.f();
    }

    public static int f(int i10, Function1 function1, Object obj, Object obj2) {
        return i10 * p003kotlin.jvm.internal.v.e(((Number) function1.invoke(obj)).longValue(), ((Number) function1.invoke(obj2)).longValue());
    }

    public final List g() {
        int i10 = v() ? 1 : -1;
        return w(i(), ((Number) this.f65708c.getFirst()).intValue() == 1 ? new b.C0791b(j(i10, new Function1() { // from class: com.neeeex.eraser.recover.reco.f.v
            @Override // p003kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return Long.valueOf(y.d((ii.c) obj));
            }
        })) : new b.a(j(i10, new Function1() { // from class: com.neeeex.eraser.recover.reco.f.w
            @Override // p003kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return Long.valueOf(y.e((ii.c) obj));
            }
        })));
    }

    public final void h() {
        Iterator it = this.f65706a.a().iterator();
        while (it.hasNext()) {
            ((ii.c) it.next()).m(false);
        }
    }

    public final List i() {
        Long lM = m();
        long jCurrentTimeMillis = lM != null ? System.currentTimeMillis() - lM.longValue() : Long.MIN_VALUE;
        List<ii.c> listA = this.f65706a.a();
        ArrayList arrayList = new ArrayList(this.f65706a.a().size());
        for (ii.c cVar : listA) {
            if (cVar.a() >= jCurrentTimeMillis) {
                arrayList.add(cVar);
            }
        }
        return arrayList;
    }

    public final Comparator j(final int i10, final Function1 function1) {
        return new Comparator() { // from class: com.neeeex.eraser.recover.reco.f.x
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                return y.f(i10, function1, obj, obj2);
            }
        };
    }

    public final ii.c k(List list) {
        long jA = ((ii.c) gl.g0.p0(list)).a();
        String str = new SimpleDateFormat(com.neeeex.eraser.m0.a("CWGMO56PJUw9Vbg=\n", "RCzBG/rrCzU=\n")).format(new Date(jA));
        com.neeeex.eraser.m0.a("YsS8frLivYQqhec=\n", "BKvOE9OWlao=\n");
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

    public final long l(int i10) {
        return ((long) i10) * 86400000;
    }

    public final Long m() {
        int i10 = this.f65707b;
        if (i10 == 1) {
            return Long.valueOf(l(7));
        }
        if (i10 == 11) {
            return Long.valueOf(l(31));
        }
        if (i10 != 12) {
            return null;
        }
        return Long.valueOf(l(186));
    }

    public final int n() {
        return this.f65707b;
    }

    public final String o() {
        return this.f65706a.b();
    }

    public final int p() {
        int i10 = 0;
        for (ii.c cVar : this.f65706a.a()) {
            if (cVar.i() && !cVar.j()) {
                i10++;
            }
        }
        return i10;
    }

    public final List q() {
        ArrayList arrayList = new ArrayList();
        for (ii.c cVar : this.f65706a.a()) {
            if (cVar.i() && !cVar.j()) {
                arrayList.add(cVar);
            }
        }
        return arrayList;
    }

    public final List r() {
        ArrayList arrayList = new ArrayList();
        for (ii.c cVar : this.f65706a.a()) {
            if (cVar.i() && !cVar.j()) {
                arrayList.add(cVar.h());
            }
        }
        return arrayList;
    }

    public final fl.t s() {
        return this.f65708c;
    }

    public final void t(ii.b bVar) {
        com.neeeex.eraser.m0.a("W2ow6dXK\n", "PQVcjbC4HV8=\n");
        bVar.getClass();
        this.f65706a = new a(bVar.a(), gl.g0.i1(bVar.b()));
    }

    public final boolean u() {
        Iterator it = this.f65706a.a().iterator();
        boolean zI = true;
        while (zI && it.hasNext()) {
            zI = ((ii.c) it.next()).i();
        }
        return zI;
    }

    public final boolean v() {
        return ((Number) this.f65708c.getSecond()).intValue() == 5;
    }

    public final List w(List list, b bVar) {
        if (bVar instanceof b.a) {
            return gl.g0.i1(gl.g0.V0(list, ((b.a) bVar).a()));
        }
        com.neeeex.eraser.m0.a("zgMe9Y4lBTHOGQa5zCNEPMEFBrnaKUQxzxhf99sqCH/UDwL8jiULMo4YF/zLIxxxxQQT6ss0Si3F\nFR3vyzRKLcUVHbfIaCI2zBM08MIyAS32Hxfu4ykAOsxYIuvBLAE81B8d94AVATzUHx33yyI=\n", "oHZyma5GZF8=\n");
        bVar.getClass();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (ii.c cVar : gl.g0.V0(list, ((b.C0791b) bVar).a())) {
            String str = new SimpleDateFormat(com.neeeex.eraser.m0.a("mBGZwKUOfHeFDA==\n", "4WjguYhDMVo=\n")).format(new Date(cVar.a()));
            com.neeeex.eraser.m0.a("YglxdrRw/zkqSCo=\n", "BGYDG9UE1xc=\n");
            str.getClass();
            Object arrayList = linkedHashMap.get(str);
            if (arrayList == null) {
                arrayList = new ArrayList();
                linkedHashMap.put(str, arrayList);
            }
            ((List) arrayList).add(cVar);
        }
        Collection<List> collectionValues = linkedHashMap.values();
        com.neeeex.eraser.m0.a("tkNu5UM/bSD/QXivRmciYqM=\n", "iiQLkW5JDEw=\n");
        collectionValues.getClass();
        ArrayList arrayList2 = new ArrayList();
        for (List list2 : collectionValues) {
            list2.getClass();
            arrayList2.add(k(list2));
            arrayList2.addAll(list2);
        }
        return arrayList2;
    }

    public final void x(int i10) {
        this.f65707b = i10;
    }

    public final void y(fl.t tVar) {
        com.neeeex.eraser.m0.a("qqvCMtRLUA==\n", "ltinRvl0bmw=\n");
        tVar.getClass();
        this.f65708c = tVar;
    }

    public final List z() {
        return g();
    }

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f65709a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final List f65710b;

        public a(String str, List list) {
            com.neeeex.eraser.m0.a("0UrdTpA=\n", "pSOpIvXWwIw=\n");
            str.getClass();
            com.neeeex.eraser.m0.a("A9j+u1/Wxg==\n", "ZraKyTaztZI=\n");
            list.getClass();
            this.f65709a = str;
            this.f65710b = list;
        }

        public final List a() {
            return this.f65710b;
        }

        public final String b() {
            return this.f65709a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return p003kotlin.jvm.internal.v.c(this.f65709a, aVar.f65709a) && p003kotlin.jvm.internal.v.c(this.f65710b, aVar.f65710b);
        }

        public int hashCode() {
            return (this.f65709a.hashCode() * 31) + this.f65710b.hashCode();
        }

        public String toString() {
            return "Catalog(title=" + this.f65709a + ", entries=" + this.f65710b + ")";
        }

        public /* synthetic */ a(String str, List list, int i10, p003kotlin.jvm.internal.m mVar) {
            this((i10 & 1) != 0 ? "" : str, (i10 & 2) != 0 ? gl.w.m() : list);
        }
    }
}