package hj;

import java.util.ArrayList;
import java.util.HashMap;

/* JADX INFO: loaded from: classes7.dex */
public final class v {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final v f83716a = new v();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final HashMap f83717b = new HashMap();

    public static final class a {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public static final C1028a f83718e = new C1028a(null);

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @mg.c("sn_pp_ad_type")
        private final int f83719a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @mg.c("sn_pp_ad_type_aa")
        private double f83720b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @mg.c("sn_pp_ad_type_bb")
        private int f83721c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        @mg.c("sn_pp_ad_type_cc")
        private final ArrayList<Double> f83722d = new ArrayList<>();

        /* JADX INFO: renamed from: hj.v$a$a, reason: collision with other inner class name */
        public static final class C1028a {
            public C1028a(p003kotlin.jvm.internal.m mVar) {
            }
        }

        public a(int i10) {
            this.f83719a = i10;
        }

        public final double a() {
            return this.f83720b;
        }

        public final double b(double d10) {
            int i10 = this.f83721c;
            this.f83721c = i10 + 1;
            int iFloorMod = Math.floorMod(i10, 3);
            int size = this.f83722d.size();
            ArrayList<Double> arrayList = this.f83722d;
            if (size < 3) {
                arrayList.add(Double.valueOf(d10));
            } else {
                arrayList.set(iFloorMod, Double.valueOf(d10));
            }
            ArrayList<Double> arrayList2 = this.f83722d;
            int size2 = arrayList2.size();
            double dDoubleValue = 0.0d;
            int i11 = 0;
            while (i11 < size2) {
                Double d11 = arrayList2.get(i11);
                i11++;
                dDoubleValue += d11.doubleValue();
            }
            this.f83720b = dDoubleValue / ((double) this.f83722d.size());
            v vVar = v.f83716a;
            int i12 = this.f83719a;
            vVar.getClass();
            v.c(i12, this);
            return this.f83720b;
        }
    }

    public static void c(int i10, a aVar) {
        if (ij.a.c() != null) {
            s1.f83694a.d("sp_key_pp_ad_type_loaded_value_" + i10, p1.f83656b.u(aVar));
        }
    }

    public final double a(int i10) {
        HashMap map = f83717b;
        a aVar = (a) map.get(Integer.valueOf(i10));
        if (aVar == null) {
            if (ij.a.c() != null) {
                String strB = s1.f83694a.b("sp_key_pp_ad_type_loaded_value_" + i10, "");
                aVar = (a) p1.f83656b.j(strB != null ? strB : "", a.class);
            } else {
                aVar = null;
            }
            if (aVar == null) {
                aVar = new a(i10);
                c(i10, aVar);
            }
            map.put(Integer.valueOf(i10), aVar);
        }
        return aVar.a();
    }

    public final double b(int i10, double d10) {
        HashMap map = f83717b;
        a aVar = (a) map.get(Integer.valueOf(i10));
        if (aVar == null) {
            if (ij.a.c() != null) {
                String strB = s1.f83694a.b("sp_key_pp_ad_type_loaded_value_" + i10, "");
                aVar = (a) p1.f83656b.j(strB != null ? strB : "", a.class);
            } else {
                aVar = null;
            }
            if (aVar == null) {
                aVar = new a(i10);
                c(i10, aVar);
            }
            map.put(Integer.valueOf(i10), aVar);
        }
        return aVar.b(d10);
    }
}