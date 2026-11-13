package hj;

import android.app.Application;
import com.tradplus.ads.base.util.BaseTimeOutAdapter;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Timer;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes7.dex */
public abstract class s0 implements r1 {

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final b f83673t = new b(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f83674a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final v0 f83675b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public mj.a f83676c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f83677d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public volatile boolean f83678e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final AtomicBoolean f83679f = new AtomicBoolean(false);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final AtomicBoolean f83680g = new AtomicBoolean(false);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Object f83681h = new Object();

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final ArrayList f83682i = new ArrayList();

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final ArrayList f83683j = new ArrayList();

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final ArrayList f83684k = new ArrayList();

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final ArrayList f83685l = new ArrayList();

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public boolean f83686m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public boolean f83687n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public boolean f83688o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public volatile boolean f83689p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public int f83690q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public CountDownLatch f83691r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public Timer f83692s;

    public static final class a implements v0.a {

        /* JADX INFO: renamed from: hj.s0$a$a, reason: collision with other inner class name */
        public static final class C1027a extends ll.m implements tl.n {
            public final /* synthetic */ s0 OooO00o;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C1027a(s0 s0Var, kl.f fVar) {
                super(2, fVar);
                this.OooO00o = s0Var;
            }

            @Override // tl.n
            /* JADX INFO: renamed from: OooO00o, reason: merged with bridge method [inline-methods] */
            public final Object invoke(kotlinx.coroutines.p0 p0Var, kl.f<? super fl.m0> fVar) {
                return new C1027a(this.OooO00o, fVar).invokeSuspend(fl.m0.f80959a);
            }

            @Override // ll.a
            public final kl.f<fl.m0> create(Object obj, kl.f<?> fVar) {
                return new C1027a(this.OooO00o, fVar);
            }

            @Override // ll.a
            public final Object invokeSuspend(Object obj) {
                p003kotlin.coroutines.intrinsics.c.f();
                fl.v.b(obj);
                this.OooO00o.o(true, true, false);
                return fl.m0.f80959a;
            }
        }

        public a() {
        }

        @Override // hj.v0.a
        public final boolean d(int i10) {
            s0 s0Var = s0.this;
            if (!s0Var.f83677d || !s0Var.f83678e || i10 == 30) {
                return false;
            }
            kotlinx.coroutines.k.d(kotlinx.coroutines.v1.f87249a, kotlinx.coroutines.f1.c(), null, new C1027a(s0.this, null), 2, null);
            return true;
        }
    }

    public static final class b {
        public b(p003kotlin.jvm.internal.m mVar) {
        }
    }

    public static final class c extends ll.m implements tl.n {
        public int OooO00o;
        public final /* synthetic */ boolean OooO0OO;
        public final /* synthetic */ boolean OooO0Oo;
        public final /* synthetic */ boolean OooO0o0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(boolean z10, boolean z11, boolean z12, kl.f fVar) {
            super(2, fVar);
            this.OooO0OO = z10;
            this.OooO0Oo = z11;
            this.OooO0o0 = z12;
        }

        public final Object OooO00o(kotlinx.coroutines.p0 p0Var, kl.f<? super fl.m0> fVar) {
            return ((c) create(p0Var, fVar)).invokeSuspend(fl.m0.f80959a);
        }

        @Override // ll.a
        public final kl.f<fl.m0> create(Object obj, kl.f<?> fVar) {
            return s0.this.new c(this.OooO0OO, this.OooO0Oo, this.OooO0o0, fVar);
        }

        @Override // tl.n
        public final Object invoke(Object obj, Object obj2) {
            return ((c) create((kotlinx.coroutines.p0) obj, (kl.f) obj2)).invokeSuspend(fl.m0.f80959a);
        }

        @Override // ll.a
        public final Object invokeSuspend(Object obj) {
            Object objF = p003kotlin.coroutines.intrinsics.c.f();
            int i10 = this.OooO00o;
            if (i10 == 0) {
                fl.v.b(obj);
                s0 s0Var = s0.this;
                boolean z10 = this.OooO0OO;
                boolean z11 = this.OooO0Oo;
                boolean z12 = this.OooO0o0;
                this.OooO00o = 1;
                if (s0.g(s0Var, z10, z11, z12, this) == objF) {
                    return objF;
                }
            } else {
                if (i10 != 1) {
                    gq.v0.a("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                fl.v.b(obj);
            }
            return fl.m0.f80959a;
        }
    }

    public s0(String str, v0 v0Var) {
        this.f83674a = str;
        this.f83675b = v0Var;
        v0Var.f83724b.put(str, new a());
    }

    /* JADX WARN: Code duplicated, block: B:8:0x001b  */
    public static final Object g(s0 s0Var, boolean z10, boolean z11, boolean z12, kl.f fVar) {
        g0 g0Var;
        s0Var.getClass();
        if (fVar instanceof g0) {
            g0Var = (g0) fVar;
            int i10 = g0Var.OooO0o0;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                g0Var.OooO0o0 = i10 - Integer.MIN_VALUE;
            } else {
                g0Var = new g0(s0Var, fVar);
            }
        } else {
            g0Var = new g0(s0Var, fVar);
        }
        g0 g0Var2 = g0Var;
        Object obj = g0Var2.OooO0OO;
        Object objF = p003kotlin.coroutines.intrinsics.c.f();
        int i11 = g0Var2.OooO0o0;
        try {
            if (i11 == 0) {
                fl.v.b(obj);
                if (!s0Var.f83678e) {
                    return fl.m0.f80959a;
                }
                if (!z11 && !s0Var.f83679f.compareAndSet(false, true)) {
                    if (!z10) {
                        kotlinx.coroutines.k.d(kotlinx.coroutines.v1.f87249a, kotlinx.coroutines.f1.c(), null, new h0(s0Var, null), 2, null);
                    }
                    return fl.m0.f80959a;
                }
                boolean z13 = !z10 || z11;
                Timer timer = s0Var.f83692s;
                if (timer != null) {
                    timer.cancel();
                }
                s0Var.f83692s = null;
                s0Var.f83680g.set(false);
                s0Var.f83689p = false;
                kj.a.C1088a c1088aA = u0.f83705a.a(s0Var.f83674a);
                if (c1088aA == null) {
                    s0Var.n(true, false);
                    return fl.m0.f80959a;
                }
                c1088aA.a();
                s0Var.f83690q = c1088aA.c();
                c1088aA.e();
                s0Var.f83675b.b();
                ArrayList arrayList = new ArrayList();
                List listA = m1.f83625a.a(c1088aA);
                if (listA != null) {
                    ll.b.a(arrayList.addAll(listA));
                }
                s0Var.l(arrayList);
                if (s0Var.r()) {
                    s0Var.n(!z10, true);
                } else {
                    g0Var2.OooO00o = ll.l.a(c1088aA);
                    g0Var2.OooO0O0 = ll.l.a(arrayList);
                    g0Var2.OooO0o0 = 1;
                    if (s0Var.h(c1088aA, arrayList, z13, z12, g0Var2) == objF) {
                        return objF;
                    }
                }
            } else {
                if (i11 != 1) {
                    gq.v0.a("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                fl.v.b(obj);
            }
        } catch (Throwable th2) {
            th2.printStackTrace();
            s0Var.n(true, false);
        }
        return fl.m0.f80959a;
    }

    public static final void j(s0 s0Var, k kVar, kj.d dVar) {
        s0Var.getClass();
        try {
            v0 v0Var = s0Var.f83675b;
            String str = s0Var.f83674a;
            kVar.getClass();
            v0Var.d(str, kVar);
            kotlinx.coroutines.k.d(kotlinx.coroutines.v1.f87249a, kotlinx.coroutines.f1.c(), null, new p0(s0Var, dVar, null), 2, null);
            s0Var.f83689p = true;
            s0Var.f83675b.b();
            CountDownLatch countDownLatch = s0Var.f83691r;
            if (countDownLatch != null) {
                countDownLatch.countDown();
            }
        } catch (Throwable th2) {
            th2.printStackTrace();
            CountDownLatch countDownLatch2 = s0Var.f83691r;
            if (countDownLatch2 != null) {
                countDownLatch2.countDown();
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:28:0x0051  */
    /* JADX WARN: Code duplicated, block: B:35:? A[RETURN, SYNTHETIC] */
    public static final void k(s0 s0Var, k kVar, kj.d dVar, List list, int i10, String str) {
        CountDownLatch countDownLatch;
        boolean zIsEmpty;
        s0Var.getClass();
        try {
            try {
                kotlinx.coroutines.k.d(kotlinx.coroutines.v1.f87249a, kotlinx.coroutines.f1.c(), null, new k0(s0Var, dVar, i10, str, null), 2, null);
                synchronized (list) {
                    p003kotlin.jvm.internal.c1.a(list).remove(kVar.f83602a);
                    zIsEmpty = list.isEmpty();
                    fl.m0 m0Var = fl.m0.f80959a;
                }
                if (zIsEmpty) {
                    CountDownLatch countDownLatch2 = s0Var.f83691r;
                    if (countDownLatch2 != null) {
                        countDownLatch2.countDown();
                    }
                } else {
                    s0Var.m(list, -1.0d);
                }
                s0Var.f83675b.b();
            } catch (Throwable th2) {
                th = th2;
                s0Var = s0Var;
                th.printStackTrace();
                countDownLatch = s0Var.f83691r;
                if (countDownLatch != null) {
                    countDownLatch.countDown();
                }
            }
        } catch (Throwable th3) {
            th = th3;
            th.printStackTrace();
            countDownLatch = s0Var.f83691r;
            if (countDownLatch != null) {
                countDownLatch.countDown();
            }
        }
    }

    @Override // hj.r1
    public final void a() {
        synchronized (this.f83681h) {
            try {
                if (this.f83678e) {
                    this.f83678e = false;
                }
                Timer timer = this.f83692s;
                if (timer != null) {
                    timer.cancel();
                }
                this.f83692s = null;
                fl.m0 m0Var = fl.m0.f80959a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // hj.r1
    public final boolean b() {
        return this.f83677d;
    }

    @Override // hj.r1
    public final boolean c() {
        return this.f83680g.get();
    }

    @Override // hj.r1
    public final void d(boolean z10) {
        synchronized (this.f83681h) {
            try {
                if (!this.f83678e) {
                    this.f83678e = true;
                }
                o(z10, false, false);
                fl.m0 m0Var = fl.m0.f80959a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // hj.r1
    public final void e(boolean z10, mj.a aVar) {
        this.f83677d = z10;
        this.f83676c = aVar;
        d(false);
    }

    public abstract k f(kj.e eVar, double d10, n1 n1Var);

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0067, code lost:
    
        if (i(r9, r10, r0) == r1) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x007c, code lost:
    
        if (q() == r1) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x007e, code lost:
    
        return r1;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object h(kj.a.C1088a c1088a, List list, boolean z10, boolean z11, kl.f fVar) {
        i0 i0Var;
        if (fVar instanceof i0) {
            i0Var = (i0) fVar;
            int i10 = i0Var.OooO0o0;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                i0Var.OooO0o0 = i10 - Integer.MIN_VALUE;
            } else {
                i0Var = new i0(this, fVar);
            }
        } else {
            i0Var = new i0(this, fVar);
        }
        Object obj = i0Var.OooO0OO;
        Object objF = p003kotlin.coroutines.intrinsics.c.f();
        int i11 = i0Var.OooO0o0;
        if (i11 == 0) {
            fl.v.b(obj);
            if (list.isEmpty()) {
                n(true, false);
                return fl.m0.f80959a;
            }
            u0.f83705a.getClass();
            if (u0.f83706b) {
                i0Var.OooO00o = ll.l.a(c1088a);
                i0Var.OooO0O0 = ll.l.a(list);
                i0Var.OooO0o0 = 1;
            } else {
                i0Var.OooO00o = ll.l.a(c1088a);
                i0Var.OooO0O0 = ll.l.a(list);
                i0Var.OooO0o0 = 2;
            }
        } else {
            if (i11 != 1 && i11 != 2) {
                gq.v0.a("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            fl.v.b(obj);
        }
        boolean z12 = this.f83689p && this.f83677d && !r();
        n(true, false);
        if (z12) {
            o(true, false, true);
        }
        return fl.m0.f80959a;
    }

    /* JADX WARN: Code duplicated, block: B:49:0x00c7  */
    /* JADX WARN: Code duplicated, block: B:53:0x00d7  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object i(boolean z10, boolean z11, kl.f fVar) {
        r0 r0Var;
        boolean z12;
        List list;
        kj.e eVar;
        if (fVar instanceof r0) {
            r0Var = (r0) fVar;
            int i10 = r0Var.OooO0o;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                r0Var.OooO0o = i10 - Integer.MIN_VALUE;
            } else {
                r0Var = new r0(this, fVar);
            }
        } else {
            r0Var = new r0(this, fVar);
        }
        Object obj = r0Var.OooO0Oo;
        Object objF = p003kotlin.coroutines.intrinsics.c.f();
        int i11 = r0Var.OooO0o;
        try {
            if (i11 == 0) {
                fl.v.b(obj);
                Application applicationC = ij.a.c();
                this.f83691r = new CountDownLatch(4);
                ArrayList arrayList = new ArrayList();
                arrayList.clear();
                if (z11) {
                    if (this.f83683j.isEmpty()) {
                    }
                    z12 = false;
                } else {
                    int i12 = 0;
                    int i13 = 0;
                    for (k kVar : this.f83675b.i(this.f83674a)) {
                        kj.e eVar2 = kVar.f83602a;
                        if (eVar2 == null || eVar2.b() != 3 || (eVar = kVar.f83602a) == null || eVar.j()) {
                            kj.e eVar3 = kVar.f83602a;
                            if (eVar3 != null && eVar3.b() == 30) {
                                i12++;
                            }
                        } else {
                            i13++;
                        }
                    }
                    if ((this.f83683j.isEmpty() && this.f83685l.isEmpty()) || (!this.f83683j.isEmpty() ? !(!this.f83685l.isEmpty() ? i13 < 1 || i12 < 1 : i13 < 1) : i12 >= 1)) {
                        ll.b.a(arrayList.addAll(this.f83682i));
                        z12 = true;
                    } else if (this.f83683j.isEmpty() || !this.f83685l.isEmpty()) {
                        z12 = false;
                    } else {
                        ll.b.a(arrayList.addAll(this.f83682i));
                        z12 = true;
                    }
                }
                long jCurrentTimeMillis = System.currentTimeMillis();
                m(arrayList, 0.01d);
                m(this.f83683j, -1.0d);
                m(this.f83685l, -1.0d);
                m(this.f83684k, -1.0d);
                try {
                    CountDownLatch countDownLatch = this.f83691r;
                    if (countDownLatch != null) {
                        countDownLatch.await();
                    }
                } catch (InterruptedException e10) {
                    e10.printStackTrace();
                }
                long jCurrentTimeMillis2 = System.currentTimeMillis() - jCurrentTimeMillis;
                if (!z12 && !this.f83682i.isEmpty()) {
                    kj.e eVar4 = (kj.e) this.f83682i.get(0);
                    if (!p(eVar4)) {
                        if (jCurrentTimeMillis2 < 5000) {
                            r0Var.OooO00o = ll.l.a(applicationC);
                            r0Var.OooO0O0 = arrayList;
                            r0Var.OooO0OO = ll.l.a(eVar4);
                            r0Var.OooO0o = 1;
                            if (kotlinx.coroutines.z0.b(((long) 5000) - jCurrentTimeMillis2, r0Var) == objF) {
                                return objF;
                            }
                        }
                        list = arrayList;
                    }
                }
                return fl.m0.f80959a;
            }
            if (i11 != 1) {
                gq.v0.a("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            list = r0Var.OooO0O0;
            fl.v.b(obj);
            CountDownLatch countDownLatch2 = this.f83691r;
            if (countDownLatch2 != null) {
                countDownLatch2.await();
                fl.m0 m0Var = fl.m0.f80959a;
            }
        } catch (InterruptedException e11) {
            e11.printStackTrace();
            fl.m0 m0Var2 = fl.m0.f80959a;
        }
        list.clear();
        list.addAll(this.f83682i);
        this.f83691r = new CountDownLatch(1);
        m(list, 0.01d);
        return fl.m0.f80959a;
    }

    public final synchronized void l(ArrayList arrayList) {
        try {
            this.f83682i.clear();
            this.f83683j.clear();
            this.f83684k.clear();
            this.f83685l.clear();
            int i10 = 0;
            this.f83688o = false;
            this.f83687n = false;
            this.f83686m = false;
            int size = arrayList.size();
            while (i10 < size) {
                Object obj = arrayList.get(i10);
                i10++;
                kj.e eVar = (kj.e) obj;
                int iB = eVar.b();
                if (iB == 1) {
                    this.f83682i.add(eVar);
                    this.f83686m = true;
                } else if (iB != 3) {
                    if (iB == 30) {
                        this.f83685l.add(eVar);
                        this.f83688o = true;
                    }
                } else if (eVar.j()) {
                    this.f83684k.add(eVar);
                } else {
                    this.f83683j.add(eVar);
                    this.f83687n = true;
                }
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public final void m(List list, double d10) {
        kj.d dVar;
        if (list == null || list.isEmpty() || !this.f83678e) {
            CountDownLatch countDownLatch = this.f83691r;
            if (countDownLatch != null) {
                countDownLatch.countDown();
                return;
            }
            return;
        }
        int i10 = 0;
        kj.e eVar = (kj.e) list.get(0);
        if (eVar.b() == 4) {
            k kVarA = this.f83675b.a(this.f83674a, 4);
            if (eVar.d() <= ((kVarA == null || (dVar = kVarA.f83614m) == null) ? 0.01d : dVar.d()) && p(eVar)) {
                CountDownLatch countDownLatch2 = this.f83691r;
                if (countDownLatch2 != null) {
                    countDownLatch2.countDown();
                    return;
                }
                return;
            }
            int iB = eVar.b();
            Iterator it = this.f83675b.i(this.f83674a).iterator();
            while (it.hasNext()) {
                kj.e eVar2 = ((k) it.next()).f83602a;
                if (eVar2 != null && eVar2.b() == iB) {
                    i10++;
                }
            }
            if (i10 >= 12) {
                CountDownLatch countDownLatch3 = this.f83691r;
                if (countDownLatch3 != null) {
                    countDownLatch3.countDown();
                    return;
                }
                return;
            }
        } else if (p(eVar)) {
            CountDownLatch countDownLatch4 = this.f83691r;
            if (countDownLatch4 != null) {
                countDownLatch4.countDown();
                return;
            }
            return;
        }
        if (!eVar.h()) {
            d10 = -1.0d;
        }
        f(eVar, d10, new o(this, list)).k();
    }

    public final void n(boolean z10, boolean z11) {
        try {
            boolean z12 = this.f83689p || z11;
            this.f83679f.set(false);
            this.f83680g.set(true);
            if (z10) {
                if (z12) {
                    kotlinx.coroutines.k.d(kotlinx.coroutines.v1.f87249a, kotlinx.coroutines.f1.c(), null, new j0(this, null), 2, null);
                } else {
                    kotlinx.coroutines.k.d(kotlinx.coroutines.v1.f87249a, kotlinx.coroutines.f1.c(), null, new m0(this, null), 2, null);
                }
            }
            if (this.f83678e) {
                Timer timer = this.f83692s;
                if (timer != null) {
                    timer.cancel();
                }
                this.f83692s = null;
                if (this.f83677d) {
                    Timer timer2 = new Timer();
                    this.f83692s = timer2;
                    timer2.schedule(new o0(this), BaseTimeOutAdapter.TIME_DELTA);
                }
            }
        } catch (Throwable th2) {
            th2.printStackTrace();
        }
    }

    public final void o(boolean z10, boolean z11, boolean z12) {
        kotlinx.coroutines.k.d(kotlinx.coroutines.v1.f87249a, kotlinx.coroutines.f1.b(), null, new c(z10, z11, z12, null), 2, null);
    }

    public final boolean p(kj.e eVar) {
        kj.e eVar2;
        int iB = eVar.b();
        int i10 = 0;
        for (k kVar : this.f83675b.i(this.f83674a)) {
            kj.e eVar3 = kVar.f83602a;
            if (eVar3 != null) {
                eVar3.b();
            }
            kj.e eVar4 = kVar.f83602a;
            if (eVar4 != null && eVar4.b() == iB && (eVar2 = kVar.f83602a) != null && eVar2.j() == eVar.j()) {
                i10++;
            }
        }
        if (iB == 3 || iB == 30) {
            return i10 >= 1;
        }
        return i10 >= this.f83690q;
    }

    public final fl.m0 q() {
        ij.a.c();
        this.f83691r = new CountDownLatch(4);
        ArrayList arrayList = new ArrayList();
        arrayList.addAll(this.f83682i);
        m(arrayList, 0.01d);
        m(this.f83683j, -1.0d);
        m(this.f83685l, -1.0d);
        m(this.f83684k, -1.0d);
        try {
            CountDownLatch countDownLatch = this.f83691r;
            if (countDownLatch != null) {
                countDownLatch.await();
            }
        } catch (InterruptedException e10) {
            e10.printStackTrace();
        }
        return fl.m0.f80959a;
    }

    public final boolean r() {
        int i10 = 0;
        int i11 = 0;
        int i12 = 0;
        for (k kVar : this.f83675b.i(this.f83674a)) {
            kj.e eVar = kVar.f83602a;
            Integer numValueOf = eVar != null ? Integer.valueOf(eVar.b()) : null;
            if (numValueOf != null && numValueOf.intValue() == 1) {
                i10++;
            } else if (numValueOf != null && numValueOf.intValue() == 3) {
                kj.e eVar2 = kVar.f83602a;
                if (eVar2 != null && !eVar2.j()) {
                    i11++;
                }
            } else if (numValueOf != null && numValueOf.intValue() == 30) {
                i12++;
            }
        }
        boolean z10 = this.f83686m;
        boolean z11 = !z10 || i10 >= this.f83690q;
        boolean z12 = !this.f83687n || i11 >= 1;
        boolean z13 = !this.f83688o || i12 >= 1;
        if (!z10) {
            return z12 && z13;
        }
        if (z11 && z12 && z13) {
            List listI = this.f83675b.i(this.f83674a);
            int size = listI.size();
            Iterator it = listI.iterator();
            while (it.hasNext()) {
                kj.e eVar3 = ((k) it.next()).f83602a;
                if (eVar3 != null && eVar3.j()) {
                    size--;
                }
            }
            if (size >= this.f83690q) {
                return true;
            }
        }
        return false;
    }
}