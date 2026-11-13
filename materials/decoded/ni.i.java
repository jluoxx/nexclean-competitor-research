package ni;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.neeeex.eraser.m0;
import com.neeeex.eraser.utils.b0;
import fg.k;
import fg.m;
import fg.p;
import fg.q;
import fl.u;
import fl.z;
import gl.g0;
import gl.v0;
import gl.w;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;
import p003kotlin.jvm.functions.Function0;
import p003kotlin.jvm.functions.Function1;
import p003kotlin.jvm.internal.s;
import p003kotlin.jvm.internal.v;

/* JADX INFO: loaded from: classes7.dex */
public final class i {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static k f89496b;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final String f89498d = "KEY_NEEEEX_FORCE_ATTR" /* decoded XOR */;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final String f89499e = "key_neeeex_minus_one_open_ad_enabled" /* decoded XOR */;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final String f89500f = "key_neeeex_minus_one_open_ad_interval_seconds" /* decoded XOR */;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final String f89501g = "key_neeeex_home_clear_default_enabled" /* decoded XOR */;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final String f89502h = "key_neeeex_launcher_view_notification_enabled" /* decoded XOR */;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final i f89495a = new i();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final AtomicBoolean f89497c = new AtomicBoolean(false);

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f89503a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Function0 f89504b;

        public a(String str, Function0 function0) {
            "key" /* decoded XOR */;
            str.getClass();
            "applyValue" /* decoded XOR */;
            function0.getClass();
            this.f89503a = str;
            this.f89504b = function0;
        }

        public final Function0 a() {
            return this.f89504b;
        }

        public final String b() {
            return this.f89503a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return v.c(this.f89503a, aVar.f89503a) && v.c(this.f89504b, aVar.f89504b);
        }

        public int hashCode() {
            return (this.f89503a.hashCode() * 31) + this.f89504b.hashCode();
        }

        public String toString() {
            return "ConfigCommand(key=" + this.f89503a + ", applyValue=" + this.f89504b + ")";
        }
    }

    public static final class g implements fg.c {
        @Override // fg.c
        public void a(fg.b bVar) {
            "configUpdate" /* decoded XOR */;
            bVar.getClass();
            Set setB = bVar.b();
            "getUpdatedKeys(...)" /* decoded XOR */;
            setB.getClass();
            i.f89495a.B(setB);
        }

        @Override // fg.c
        public void b(m mVar) {
            "error" /* decoded XOR */;
            mVar.getClass();
        }
    }

    public static /* synthetic */ void I(i iVar, String str, boolean z10, boolean z11, int i10, Object obj) {
        if ((i10 & 4) != 0) {
            z11 = true;
        }
        iVar.H(str, z10, z11);
    }

    public static /* synthetic */ void K(i iVar, boolean z10, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            z10 = true;
        }
        iVar.J(z10);
    }

    public static void a(Task task) {
        "task" /* decoded XOR */;
        task.getClass();
        try {
            List listQ = f89495a.q();
            ArrayList arrayList = new ArrayList();
            for (Object obj : listQ) {
                a aVar = (a) obj;
                if (task.isSuccessful() || !f89495a.y().containsKey(aVar.b())) {
                    arrayList.add(obj);
                }
            }
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                ((a) it.next()).a().invoke();
            }
        } finally {
            f89497c.set(false);
        }
    }

    public static fl.m0 c() {
        K(f89495a, false, 1, null);
        return fl.m0.f80959a;
    }

    public static fl.m0 d(p.b bVar) {
        "$this$remoteConfigSettings" /* decoded XOR */;
        bVar.getClass();
        bVar.d(3600L);
        return fl.m0.f80959a;
    }

    public static void e(List list, Task task) {
        "task" /* decoded XOR */;
        task.getClass();
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            a aVar = (a) obj;
            if (task.isSuccessful() || !f89495a.y().containsKey(aVar.b())) {
                arrayList.add(obj);
            }
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ((a) it.next()).a().invoke();
        }
    }

    public static final fl.m0 r(String str, boolean z10) {
        I(f89495a, str, z10, false, 4, null);
        return fl.m0.f80959a;
    }

    public final long A(String str, long j10) {
        k kVar = f89496b;
        if (kVar != null) {
            Long lValueOf = Long.valueOf(kVar.n(str));
            if (lValueOf.longValue() == 0) {
                lValueOf = null;
            }
            if (lValueOf != null) {
                return lValueOf.longValue();
            }
        }
        return j10;
    }

    public final void B(Set set) {
        k kVar;
        Task taskG;
        List listQ = q();
        final ArrayList arrayList = new ArrayList();
        for (Object obj : listQ) {
            if (set.contains(((a) obj).b())) {
                arrayList.add(obj);
            }
        }
        if (arrayList.isEmpty() || (kVar = f89496b) == null || (taskG = kVar.g()) == null) {
            return;
        }
        taskG.addOnCompleteListener(new OnCompleteListener() { // from class: ni.h
            @Override // com.google.android.gms.tasks.OnCompleteListener
            public final void onComplete(Task task) {
                i.e(arrayList, task);
            }
        });
    }

    public final void C() {
        k kVar = f89496b;
        if (kVar != null) {
            kVar.h(new g());
        }
    }

    public final Boolean D(q qVar, boolean z10, boolean z11) {
        if (z11 || !(qVar == null || qVar.d() == 0)) {
            return Boolean.valueOf(E(qVar, z10));
        }
        return null;
    }

    public final boolean E(q qVar, boolean z10) {
        Object objM372constructorimpl;
        if (qVar == null || qVar.d() == 0) {
            return z10;
        }
        try {
            u.a aVar = u.Companion;
            objM372constructorimpl = u.m372constructorimpl(Boolean.valueOf(qVar.b()));
        } catch (Throwable th2) {
            u.a aVar2 = u.Companion;
            objM372constructorimpl = u.m372constructorimpl(fl.v.a(th2));
        }
        Boolean boolValueOf = Boolean.valueOf(z10);
        if (u.m377isFailureimpl(objM372constructorimpl)) {
            objM372constructorimpl = boolValueOf;
        }
        return ((Boolean) objM372constructorimpl).booleanValue();
    }

    public final Long F(q qVar, boolean z10) {
        Object objM372constructorimpl;
        if (qVar == null || qVar.d() == 0) {
            return z10 ? 300L : null;
        }
        try {
            u.a aVar = u.Companion;
            objM372constructorimpl = u.m372constructorimpl(Long.valueOf(qVar.a()));
        } catch (Throwable th2) {
            u.a aVar2 = u.Companion;
            objM372constructorimpl = u.m372constructorimpl(fl.v.a(th2));
        }
        return Long.valueOf(L((Long) (u.m377isFailureimpl(objM372constructorimpl) ? null : objM372constructorimpl)));
    }

    public final void G() {
        u();
        s();
    }

    public final void H(String str, boolean z10, boolean z11) {
        k kVar = f89496b;
        Boolean boolD = D(kVar != null ? kVar.p(str) : null, z10, z11);
        if (boolD != null) {
            b0.f66131a.z(str, boolD.booleanValue());
        }
    }

    public final void J(boolean z10) {
        k kVar = f89496b;
        Long lF = F(kVar != null ? kVar.p(f89500f) : null, z10);
        if (lF != null) {
            b0.f66131a.C(f89500f, lF.longValue());
        }
    }

    public final long L(Long l10) {
        if (l10 == null) {
            return 300L;
        }
        long jLongValue = l10.longValue();
        if (1 > jLongValue || jLongValue >= 9223372036854776L) {
            l10 = null;
        }
        if (l10 != null) {
            return l10.longValue();
        }
        return 300L;
    }

    public final void l() {
        com.neeeex.eraser.push.h.f65507a.i(A("key_neeeex_broadcast_notify_interval_ss" /* decoded XOR */, com.neeeex.eraser.push.i.f65519a.a()));
    }

    public final void m() {
        k kVar = f89496b;
        b0.f66131a.z(f89498d, kVar != null ? kVar.k(f89498d) : false);
    }

    public final void n() {
        com.neeeex.eraser.push.h.f65507a.j(A("key_neeeex_max_one_day_ss" /* decoded XOR */, com.neeeex.eraser.push.i.f65519a.c()));
    }

    public final void o() {
        com.neeeex.eraser.push.h.f65507a.k(A("key_neeeex_ongoing_interval_ss" /* decoded XOR */, com.neeeex.eraser.push.i.f65519a.d()));
    }

    public final void p() {
        com.neeeex.eraser.push.h.f65507a.l(A("key_neeeex_trigger_notify_interval_ss" /* decoded XOR */, com.neeeex.eraser.push.i.f65519a.e()));
    }

    public final List q() {
        List listP = w.p(new a(f89498d, new b(this)), new a("key_neeeex_max_one_day_ss" /* decoded XOR */, new c(this)), new a("key_neeeex_ongoing_interval_ss" /* decoded XOR */, new d(this)), new a("key_neeeex_broadcast_notify_interval_ss" /* decoded XOR */, new e(this)), new a("key_neeeex_trigger_notify_interval_ss" /* decoded XOR */, new f(this)), new a(f89500f, new Function0() { // from class: ni.f
            @Override // p003kotlin.jvm.functions.Function0
            public final Object invoke() {
                return i.c();
            }
        }));
        Map mapZ = z();
        ArrayList arrayList = new ArrayList(mapZ.size());
        for (Map.Entry entry : mapZ.entrySet()) {
            final String str = (String) entry.getKey();
            final boolean zBooleanValue = ((Boolean) entry.getValue()).booleanValue();
            arrayList.add(new a(str, new Function0() { // from class: ni.g
                @Override // p003kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return i.r(str, zBooleanValue);
                }
            }));
        }
        return g0.L0(listP, arrayList);
    }

    public final void s() {
        k kVar = f89496b;
        if (kVar != null && f89497c.compareAndSet(false, true)) {
            try {
                kVar.j().addOnCompleteListener(new OnCompleteListener() { // from class: ni.e
                    @Override // com.google.android.gms.tasks.OnCompleteListener
                    public final void onComplete(Task task) {
                        i.a(task);
                    }
                });
            } catch (RuntimeException e10) {
                f89497c.set(false);
                throw e10;
            }
        }
    }

    public final long t() {
        return L(Long.valueOf(b0.f66131a.v(f89500f, 300L))) * 1000;
    }

    public final synchronized void u() {
        try {
            if (f89496b != null) {
                return;
            }
            f89496b = kg.a.a(ag.a.f21443a);
            p pVarB = kg.a.b(new Function1() { // from class: ni.d
                @Override // p003kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return i.d((p.b) obj);
                }
            });
            k kVar = f89496b;
            if (kVar != null) {
                kVar.s(pVarB);
            }
            k kVar2 = f89496b;
            if (kVar2 != null) {
                kVar2.u(y());
            }
            for (Map.Entry entry : z().entrySet()) {
                f89495a.H((String) entry.getKey(), ((Boolean) entry.getValue()).booleanValue(), false);
            }
            J(false);
            C();
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public final boolean v() {
        return b0.f66131a.s(f89501g, true);
    }

    public final boolean w() {
        return b0.f66131a.s(f89502h, true);
    }

    public final boolean x() {
        return b0.f66131a.s(f89499e, true);
    }

    public final Map y() {
        return v0.q(z(), z.a(f89500f, 300L));
    }

    public final Map z() {
        String str = f89499e;
        Boolean bool = Boolean.TRUE;
        return v0.n(z.a(str, bool), z.a(f89501g, bool), z.a(f89502h, bool));
    }

    public static final /* synthetic */ class b extends s implements Function0 {
        public b(Object obj) {
            super(0, obj, i.class, "applyForceAttr" /* decoded XOR */, "applyForceAttr()V" /* decoded XOR */, 0);
        }

        /* JADX INFO: renamed from: invoke, reason: collision with other method in class */
        public final void m390invoke() {
            ((i) this.receiver).m();
        }

        @Override // p003kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Object invoke() {
            m390invoke();
            return fl.m0.f80959a;
        }
    }

    public static final /* synthetic */ class c extends s implements Function0 {
        public c(Object obj) {
            super(0, obj, i.class, "applyMaxOneDay" /* decoded XOR */, "applyMaxOneDay()V" /* decoded XOR */, 0);
        }

        /* JADX INFO: renamed from: invoke, reason: collision with other method in class */
        public final void m391invoke() {
            ((i) this.receiver).n();
        }

        @Override // p003kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Object invoke() {
            m391invoke();
            return fl.m0.f80959a;
        }
    }

    public static final /* synthetic */ class d extends s implements Function0 {
        public d(Object obj) {
            super(0, obj, i.class, "applyOngoingInterval" /* decoded XOR */, "applyOngoingInterval()V" /* decoded XOR */, 0);
        }

        /* JADX INFO: renamed from: invoke, reason: collision with other method in class */
        public final void m392invoke() {
            ((i) this.receiver).o();
        }

        @Override // p003kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Object invoke() {
            m392invoke();
            return fl.m0.f80959a;
        }
    }

    public static final /* synthetic */ class e extends s implements Function0 {
        public e(Object obj) {
            super(0, obj, i.class, "applyBroadcastInterval" /* decoded XOR */, "applyBroadcastInterval()V" /* decoded XOR */, 0);
        }

        /* JADX INFO: renamed from: invoke, reason: collision with other method in class */
        public final void m393invoke() {
            ((i) this.receiver).l();
        }

        @Override // p003kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Object invoke() {
            m393invoke();
            return fl.m0.f80959a;
        }
    }

    public static final /* synthetic */ class f extends s implements Function0 {
        public f(Object obj) {
            super(0, obj, i.class, "applyTriggerInterval" /* decoded XOR */, "applyTriggerInterval()V" /* decoded XOR */, 0);
        }

        /* JADX INFO: renamed from: invoke, reason: collision with other method in class */
        public final void m394invoke() {
            ((i) this.receiver).p();
        }

        @Override // p003kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Object invoke() {
            m394invoke();
            return fl.m0.f80959a;
        }
    }
}