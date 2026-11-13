package mi;

import android.os.Bundle;
import coil.util.j;
import com.neeeex.eraser.m0;
import com.neeeex.eraser.utils.b0;
import com.neeeex.eraser.utils.c0;
import fl.t;
import fl.z;
import gl.q;
import gl.v0;
import gl.w;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import p003kotlin.jvm.internal.v;

/* JADX INFO: loaded from: classes7.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f88870a = new a();

    /* JADX INFO: renamed from: mi.a$a, reason: collision with other inner class name */
    public enum EnumC1140a {
        FIREBASE,
        TRACKER;


        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ ml.a f88872b = ml.b.a(d());

        public static ml.a getEntries() {
            return f88872b;
        }
    }

    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f88873a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f88874b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final List f88875c;

        public b(String str, String str2, List list) {
            "firebaseName" /* decoded XOR */;
            str.getClass();
            "trackerName" /* decoded XOR */;
            str2.getClass();
            "fields" /* decoded XOR */;
            list.getClass();
            this.f88873a = str;
            this.f88874b = str2;
            this.f88875c = list;
        }

        public final Bundle a() {
            if (this.f88875c.isEmpty()) {
                return null;
            }
            Bundle bundle = new Bundle(this.f88875c.size());
            for (t tVar : this.f88875c) {
                String str = (String) tVar.component1();
                Object objComponent2 = tVar.component2();
                if (objComponent2 instanceof Integer) {
                    bundle.putInt(str, ((Number) objComponent2).intValue());
                } else if (objComponent2 instanceof Long) {
                    bundle.putLong(str, ((Number) objComponent2).longValue());
                } else if (objComponent2 instanceof Double) {
                    bundle.putDouble(str, ((Number) objComponent2).doubleValue());
                } else {
                    if (!(objComponent2 instanceof String)) {
                        throw new IllegalStateException("Unsupported analytics value" /* decoded XOR */.toString());
                    }
                    bundle.putString(str, (String) objComponent2);
                }
            }
            return bundle;
        }

        public final String b() {
            return this.f88873a;
        }

        public final String c() {
            return this.f88874b;
        }

        public final Map d() {
            if (this.f88875c.isEmpty()) {
                return null;
            }
            return v0.u(this.f88875c);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return v.c(this.f88873a, bVar.f88873a) && v.c(this.f88874b, bVar.f88874b) && v.c(this.f88875c, bVar.f88875c);
        }

        public int hashCode() {
            return (((this.f88873a.hashCode() * 31) + this.f88874b.hashCode()) * 31) + this.f88875c.hashCode();
        }

        public String toString() {
            return "EventEnvelope(firebaseName=" + this.f88873a + ", trackerName=" + this.f88874b + ", fields=" + this.f88875c + ")";
        }
    }

    public static final /* synthetic */ class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f88876a;

        static {
            int[] iArr = new int[EnumC1140a.values().length];
            try {
                iArr[EnumC1140a.FIREBASE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[EnumC1140a.TRACKER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f88876a = iArr;
        }
    }

    public static /* synthetic */ void d(a aVar, String str, String str2, List list, String str3, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            str2 = str;
        }
        if ((i10 & 4) != 0) {
            list = w.m();
        }
        if ((i10 & 8) != 0) {
            str3 = null;
        }
        aVar.c(str, str2, list, str3);
    }

    public final void A() {
        f("PR_Ctools_Click_CompressPhoto" /* decoded XOR */);
    }

    public final void A0() {
    }

    public final void A1() {
        f("PR_Virus_Click_Home" /* decoded XOR */);
    }

    public final void B() {
        f("PR_Ctools_Click_DeviceClean" /* decoded XOR */);
    }

    public final void B0() {
    }

    public final void B1() {
        f("PR_Virus_Scan_Complete" /* decoded XOR */);
    }

    public final void C() {
        f("PR_Ctools_Click_Manage" /* decoded XOR */);
    }

    public final void C0() {
        f("RF_RECO_ANIM_IM" /* decoded XOR */);
    }

    public final void C1() {
        f("PR_Virus_Scan_Start" /* decoded XOR */);
    }

    public final void D() {
        f("PR_Ctools_Click_Stop" /* decoded XOR */);
    }

    public final void D0() {
    }

    public final void D1() {
        f("PR_Virus_Threat_Removed" /* decoded XOR */);
    }

    public final void E() {
        f("PR_Ctools_Click_Uninstall" /* decoded XOR */);
    }

    public final void E0() {
    }

    public final void F() {
        f("PR_Ctools_Enter_AppManager" /* decoded XOR */);
    }

    public final void F0() {
    }

    public final void G() {
        f("PR_Ctools_Enter_DeviceStatus" /* decoded XOR */);
    }

    public final void G0() {
        f("RF_SCAN_ANIM_IM" /* decoded XOR */);
    }

    public final void H() {
        f("PR_Ctools_Enter_NetworkSpeed" /* decoded XOR */);
    }

    public final void H0() {
        f("RF_SCAN_CK" /* decoded XOR */);
    }

    public final void I() {
        f("PR_Ctools_Enter_NetworkTraffic" /* decoded XOR */);
    }

    public final void I0() {
        f("RF_SCAN_IM" /* decoded XOR */);
    }

    public final void J() {
        f("PR_Ctools_Enter_PhotoCompressor" /* decoded XOR */);
    }

    public final void J0(int i10) {
    }

    public final void K() {
        f("PR_Ctools_Enter_RecentApps" /* decoded XOR */);
    }

    public final void K0(int i10) {
    }

    public final void L() {
        f("PR_Ctools_PhotoCompression_Failure" /* decoded XOR */);
    }

    public final void L0() {
    }

    public final void M() {
        f("PR_Ctools_PhotoCompression_Success" /* decoded XOR */);
    }

    public final void M0() {
    }

    public final void N() {
        f("PR_Ctools_Click_NetworkSpeed_Retry" /* decoded XOR */);
    }

    public final void N0() {
    }

    public final void O() {
        f("PR_Ctools_Select_PhotoForCompression" /* decoded XOR */);
    }

    public final void O0() {
        f("RP_RECO_ANIM_IM" /* decoded XOR */);
    }

    public final void P() {
        f("PR_Ctools_Click_NetworkSpeed_TestAgain" /* decoded XOR */);
    }

    public final void P0() {
    }

    public final void Q() {
        f(b("RP_SIMPLE_FCM" /* decoded XOR */, "RP_SIMPLE_FCM_SS" /* decoded XOR */));
    }

    public final void Q0() {
    }

    public final void R() {
        f("RP_SIMPLE_FCM_HIGH" /* decoded XOR */);
    }

    public final void R0() {
    }

    public final void S() {
        f("RP_SIMPLE_FCM_NORMAL" /* decoded XOR */);
    }

    public final void S0() {
        f("RP_SCAN_ANIM_IM" /* decoded XOR */);
    }

    public final void T() {
        f("ALLFILE_AUTHOR_GUIDE_POP_AGREE_CK" /* decoded XOR */);
    }

    public final void T0() {
        f("RP_SCAN_CK" /* decoded XOR */);
    }

    public final void U() {
        o0("ALLFILE_AUTHOR_OPEN" /* decoded XOR */);
    }

    public final void U0() {
        f("RP_SCAN_IM" /* decoded XOR */);
    }

    public final void V() {
        f("ALLFILE_AUTHOR_GUIDE_POP_IM" /* decoded XOR */);
    }

    public final void V0(int i10) {
    }

    public final void W() {
        f("SPLASH_OPEN" /* decoded XOR */);
    }

    public final void W0(int i10) {
    }

    public final void X() {
        f("HEARTBEAT" /* decoded XOR */);
    }

    public final void X0() {
    }

    public final void Y() {
    }

    public final void Y0() {
    }

    public final void Z(String str) {
        "adPosition" /* decoded XOR */;
        str.getClass();
        e("rp_insert_click" /* decoded XOR */, "rp_insert_click" /* decoded XOR */, str);
    }

    public final void Z0() {
    }

    public final void a(EnumC1140a enumC1140a, b bVar) {
        int i10 = c.f88876a[enumC1140a.ordinal()];
        if (i10 == 1) {
            Bundle bundleA = bVar.a();
            if (bundleA != null) {
                ni.a.d(bVar.b(), bundleA);
                return;
            } else {
                ni.a.c(bVar.b());
                return;
            }
        }
        if (i10 != 2) {
            j.a();
            return;
        }
        Map mapD = bVar.d();
        if (mapD != null) {
            com.neeeex.eraser.module.report.bytedance.c.e(bVar.c(), mapD);
        } else {
            com.neeeex.eraser.module.report.bytedance.c.d(bVar.c());
        }
    }

    public final void a0(String str) {
        "adPosition" /* decoded XOR */;
        str.getClass();
        e("rp_insert_shouldshow" /* decoded XOR */, "rp_insert_shouldshow" /* decoded XOR */, str);
    }

    public final void a1() {
        f("RV_RECO_ANIM_IM" /* decoded XOR */);
    }

    public final String b(String str, String str2) {
        return new String[]{str, str2}[c0.f66142a.e() ? 1 : 0];
    }

    public final void b0(String str, double d10) {
        "adPosition" /* decoded XOR */;
        str.getClass();
        h("rp_insert_show" /* decoded XOR */, str, d10);
    }

    public final void b1() {
    }

    public final void c(String str, String str2, List list, String str3) {
        try {
            List listC = gl.v.c();
            listC.add(new b(str, str2, list));
            if (str3 != null) {
                listC.add(new b(str3, str3, w.m()));
            }
            List listA = gl.v.a(listC);
            for (EnumC1140a enumC1140a : EnumC1140a.getEntries()) {
                Iterator it = listA.iterator();
                while (it.hasNext()) {
                    f88870a.a(enumC1140a, (b) it.next());
                }
            }
        } catch (Throwable unused) {
        }
    }

    public final void c0(String str) {
        "adPosition" /* decoded XOR */;
        str.getClass();
        e("rp_native_click" /* decoded XOR */, "rp_native_click" /* decoded XOR */, str);
    }

    public final void c1() {
    }

    public final void d0(String str) {
        "adPosition" /* decoded XOR */;
        str.getClass();
        e("rp_native_shouldshow" /* decoded XOR */, "rp_native_shouldshow" /* decoded XOR */, str);
    }

    public final void d1() {
    }

    public final void e(String str, String str2, String str3) {
        d(this, str, str2, gl.v.e(z.a("id" /* decoded XOR */, str3)), null, 8, null);
    }

    public final void e0(String str, double d10) {
        "adPosition" /* decoded XOR */;
        str.getClass();
        h("rp_native_show" /* decoded XOR */, str, d10);
    }

    public final void e1() {
        f("RV_SCAN_ANIM_IM" /* decoded XOR */);
    }

    public final void f(String str) {
        d(this, str, null, null, null, 14, null);
    }

    public final void f0() {
        f("SPLASH_NOTI_SYSTEM_POP_AGREE_CK" /* decoded XOR */);
    }

    public final void f1() {
        f("RV_SCAN_CK" /* decoded XOR */);
    }

    public final List g(t... tVarArr) {
        return q.f(tVarArr);
    }

    public final void g0() {
        o0("NOTI_AUTHOR_OPEN" /* decoded XOR */);
    }

    public final void g1() {
        f("RV_SCAN_IM" /* decoded XOR */);
    }

    public final void h(String str, String str2, double d10) {
        d(this, str, null, g(z.a("id" /* decoded XOR */, str2), z.a("income" /* decoded XOR */, Double.valueOf(d10))), "rp_all_show" /* decoded XOR */, 2, null);
    }

    public final void h0() {
        f("SPLASH_NOTI_SYSTEM_POP_IM" /* decoded XOR */);
    }

    public final void h1(int i10) {
    }

    public final void i() {
        f("RP_ATTR_FAIL" /* decoded XOR */);
    }

    public final void i0(int i10) {
        d(this, "NOTI_BAR_CK" /* decoded XOR */, null, g(z.a("type" /* decoded XOR */, Integer.valueOf(i10))), null, 10, null);
    }

    public final void i1(int i10) {
    }

    public final void j() {
        f("RP_ATTR_START" /* decoded XOR */);
    }

    public final void j0(int i10, int i11, int i12, int i13) {
        d(this, "NOTI_CK" /* decoded XOR */, null, g(z.a("type" /* decoded XOR */, Integer.valueOf(i10)), z.a("scene" /* decoded XOR */, Integer.valueOf(i11)), z.a("touch" /* decoded XOR */, Integer.valueOf(i12)), z.a("from" /* decoded XOR */, Integer.valueOf(i13))), "PUSH_AND_NOTI_CK" /* decoded XOR */, 2, null);
    }

    public final void j1() {
        f("SPLASH_FIRST_AD_CLICK" /* decoded XOR */);
    }

    public final void k(long j10, String str) {
        "channel" /* decoded XOR */;
        str.getClass();
        d(this, "RP_ATTR_SUCCESS" /* decoded XOR */, null, g(z.a("attrtime" /* decoded XOR */, Long.valueOf(j10)), z.a("channel" /* decoded XOR */, str)), null, 10, null);
    }

    public final void k0(int i10, int i11, int i12, int i13) {
        d(this, "NOTI_IM" /* decoded XOR */, null, g(z.a("type" /* decoded XOR */, Integer.valueOf(i10)), z.a("scene" /* decoded XOR */, Integer.valueOf(i11)), z.a("touch" /* decoded XOR */, Integer.valueOf(i12)), z.a("from" /* decoded XOR */, Integer.valueOf(i13))), "PUSH_AND_NOTI_IM" /* decoded XOR */, 2, null);
    }

    public final void k1() {
        f("SPLASH_FIRST_AD_SHOW_CLOSE" /* decoded XOR */);
    }

    public final void l() {
        f("RP_ATTR_SUCCESS_CHANNEL_NOT_ORG" /* decoded XOR */);
    }

    public final void l0(int i10, int i11) {
        d(this, "RETAIN_NOTI_CK" /* decoded XOR */, null, g(z.a("scene" /* decoded XOR */, Integer.valueOf(i10)), z.a("from" /* decoded XOR */, Integer.valueOf(i11))), null, 10, null);
    }

    public final void l1() {
        f("SPLASH_FIRST_AD_SHOW_FAILED" /* decoded XOR */);
    }

    public final void m() {
        f("PR_Clean_Delete_DuplicateDocs" /* decoded XOR */);
    }

    public final void m0(int i10, int i11) {
        d(this, "RETAIN_NOTI_IM" /* decoded XOR */, null, g(z.a("scene" /* decoded XOR */, Integer.valueOf(i10)), z.a("from" /* decoded XOR */, Integer.valueOf(i11))), null, 10, null);
    }

    public final void m1() {
        f("SPLASH_FIRST_AD_SHOW_SUCCESS" /* decoded XOR */);
    }

    public final void n() {
        f("PR_Clean_Delete_DuplicateMedia" /* decoded XOR */);
    }

    public final void n0(int i10, int i11, int i12, int i13) {
    }

    public final void n1() {
        f("SPLASH_FIRST_END_BACKGROUND" /* decoded XOR */);
    }

    public final void o() {
        f("PR_Clean_Delete_JunkFiles" /* decoded XOR */);
    }

    public final void o0(String str) {
        try {
            String str2 = new SimpleDateFormat("yyyy-MM-dd" /* decoded XOR */, Locale.getDefault()).format(new Date());
            String str3 = str + "_REPORTED";
            b0 b0Var = b0.f66131a;
            if (v.c(b0Var.x(str3, ""), str2)) {
                return;
            }
            d(f88870a, str, null, null, null, 14, null);
            b0Var.D(str3, str2);
        } catch (Throwable unused) {
        }
    }

    public final void o1() {
        f("SPLASH_FIRST_END_LOAD" /* decoded XOR */);
    }

    public final void p() {
        f("PR_Clean_Delete_LargeDocs" /* decoded XOR */);
    }

    public final void p0(String str) {
        "adPosition" /* decoded XOR */;
        str.getClass();
        e("rp_open_click" /* decoded XOR */, "rp_open_click" /* decoded XOR */, str);
    }

    public final void p1() {
        f("SPLASH_FIRST_END_SPLASH" /* decoded XOR */);
    }

    public final void q() {
        f("PR_Clean_Delete_LargeMedia" /* decoded XOR */);
    }

    public final void q0(String str) {
        "adPosition" /* decoded XOR */;
        str.getClass();
        e("rp_open_shouldshow" /* decoded XOR */, "rp_open_shouldshow" /* decoded XOR */, str);
    }

    public final void q1() {
        f("SPLASH_FIRST_END_SPLASH_BY_RESUME" /* decoded XOR */);
    }

    public final void r() {
        f("PR_Clean_Delete_Screenshots" /* decoded XOR */);
    }

    public final void r0(String str, double d10) {
        "adPosition" /* decoded XOR */;
        str.getClass();
        h("rp_open_show" /* decoded XOR */, str, d10);
    }

    public final void r1() {
        f("SPLASH_FIRST_HOME_IM" /* decoded XOR */);
    }

    public final void s() {
        f("PR_Clean_Delete_SimilarImages" /* decoded XOR */);
    }

    public final void s0(int i10) {
        d(this, "PUSH_CK" /* decoded XOR */, null, g(z.a("type" /* decoded XOR */, Integer.valueOf(i10))), "PUSH_AND_NOTI_CK" /* decoded XOR */, 2, null);
    }

    public final void s1() {
        f("SPLASH_FIRST_NOT_AD" /* decoded XOR */);
    }

    public final void t() {
        f("PR_Clean_Scan_DuplicateDocs" /* decoded XOR */);
    }

    public final void t0(int i10) {
        d(this, "PUSH_IM" /* decoded XOR */, null, g(z.a("type" /* decoded XOR */, Integer.valueOf(i10))), "PUSH_AND_NOTI_IM" /* decoded XOR */, 2, null);
    }

    public final void t1() {
        f("SPLASH_FIRST_OPEN" /* decoded XOR */);
    }

    public final void u() {
        f("PR_Clean_Scan_DuplicateMedia" /* decoded XOR */);
    }

    public final void u0() {
        try {
            a aVar = f88870a;
            aVar.f(aVar.b("PR_push_message_show" /* decoded XOR */, "PR_push_message_show_SS" /* decoded XOR */));
        } catch (Throwable unused) {
        }
    }

    public final void u1() {
        f("SPLASH_FIRST_OPEN_2" /* decoded XOR */);
    }

    public final void v() {
        f("PR_Clean_Scan_JunkFiles" /* decoded XOR */);
    }

    public final void v0(String str, int i10, int i11, int i12, int i13, boolean z10) {
        d(this, str, null, g(z.a("type" /* decoded XOR */, Integer.valueOf(i10)), z.a("scene" /* decoded XOR */, Integer.valueOf(i11)), z.a("touch" /* decoded XOR */, Integer.valueOf(i12)), z.a("from" /* decoded XOR */, Integer.valueOf(i13)), z.a("repeat" /* decoded XOR */, Integer.valueOf(z10 ? 1 : 0))), null, 10, null);
    }

    public final void v1() {
        f("SPLASH_FIRST_SHOW_AD" /* decoded XOR */);
    }

    public final void w() {
        f("PR_Clean_Scan_LargeDocs" /* decoded XOR */);
    }

    public final void w0(int i10, int i11, int i12, int i13, boolean z10) {
        v0("PUSH_REPEAT_RATE_CK" /* decoded XOR */, i10, i11, i12, i13, z10);
    }

    public final void w1(int i10) {
        d(this, "SPLASH_FIRST_FUN_IM" /* decoded XOR */, null, g(z.a("type" /* decoded XOR */, Integer.valueOf(i10))), null, 10, null);
    }

    public final void x() {
        f("PR_Clean_Scan_LargeMedia" /* decoded XOR */);
    }

    public final void x0(int i10, int i11, int i12, int i13, boolean z10) {
        v0("PUSH_REPEAT_RATE_IM" /* decoded XOR */, i10, i11, i12, i13, z10);
    }

    public final void x1() {
        f("SPLASH_FIRST_FUN_LASTNEXT_CK" /* decoded XOR */);
    }

    public final void y() {
        f("PR_Clean_Scan_Screenshots" /* decoded XOR */);
    }

    public final void y0() {
        f("RDF_LIST_IM" /* decoded XOR */);
    }

    public final void y1() {
        f("SPLASH_FIRST_LAN_IM" /* decoded XOR */);
    }

    public final void z() {
        f("PR_Clean_Scan_SimilarImages" /* decoded XOR */);
    }

    public final void z0() {
    }

    public final void z1() {
        f("SPLASH_FIRST_LAN_NEXT_CK" /* decoded XOR */);
    }
}