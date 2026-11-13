package hj;

import java.util.ArrayList;
import java.util.HashMap;

/* JADX INFO: loaded from: classes7.dex */
public final class y {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final y f83761a = new y();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final HashMap f83762b = new HashMap();

    public static final class a {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public static final C1031a f83763e = new C1031a(null);

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @mg.c("sn_pp_id")
        private final String f83764a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @mg.c("sn_pp_aa")
        private double f83765b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @mg.c("sn_pp_bb")
        private int f83766c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        @mg.c("sn_pp_cc")
        private final ArrayList<Double> f83767d = new ArrayList<>();

        /* JADX INFO: renamed from: hj.y$a$a, reason: collision with other inner class name */
        public static final class C1031a {
            public C1031a(p003kotlin.jvm.internal.m mVar) {
            }
        }

        public a(String str) {
            this.f83764a = str;
        }

        public final double a() {
            return this.f83765b;
        }

        public final double b(double d10) {
            int i10 = this.f83766c;
            this.f83766c = i10 + 1;
            int iFloorMod = Math.floorMod(i10, 6);
            int size = this.f83767d.size();
            ArrayList<Double> arrayList = this.f83767d;
            if (size < 6) {
                arrayList.add(Double.valueOf(d10));
            } else {
                arrayList.set(iFloorMod, Double.valueOf(d10));
            }
            ArrayList<Double> arrayList2 = this.f83767d;
            int size2 = arrayList2.size();
            double dDoubleValue = 0.0d;
            int i11 = 0;
            while (i11 < size2) {
                Double d11 = arrayList2.get(i11);
                i11++;
                dDoubleValue += d11.doubleValue();
            }
            this.f83765b = dDoubleValue / ((double) this.f83767d.size());
            y yVar = y.f83761a;
            String str = this.f83764a;
            yVar.getClass();
            y.c(str, this);
            return this.f83765b;
        }
    }

    public static void c(String str, a aVar) {
        if (ij.a.c() != null) {
            s1.f83694a.d("sp_key_pp_value_" + str, p1.f83656b.u(aVar));
        }
    }

    public final double a(String str) {
        HashMap map = f83762b;
        a aVar = (a) map.get(str);
        if (aVar == null) {
            if (ij.a.c() != null) {
                String strB = s1.f83694a.b("sp_key_pp_value_" + str, "");
                aVar = (a) p1.f83656b.j(strB != null ? strB : "", a.class);
            } else {
                aVar = null;
            }
            if (aVar == null) {
                aVar = new a(str);
                c(str, aVar);
            }
            map.put(str, aVar);
        }
        return aVar.a();
    }

    public final double b(String str, double d10) {
        HashMap map = f83762b;
        a aVar = (a) map.get(str);
        if (aVar == null) {
            if (ij.a.c() != null) {
                String strB = s1.f83694a.b("sp_key_pp_value_" + str, "");
                aVar = (a) p1.f83656b.j(strB != null ? strB : "", a.class);
            } else {
                aVar = null;
            }
            if (aVar == null) {
                aVar = new a(str);
                c(str, aVar);
            }
            map.put(str, aVar);
        }
        return aVar.b(d10);
    }
}