package com.neeeex.eraser.utils;

import android.content.Context;
import com.neeeex.eraser.m0;
import com.tencent.mmkv.MMKV;

/* JADX INFO: loaded from: classes7.dex */
public final class b0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final b0 f66131a = new b0();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static volatile a f66132b = a.COLD;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static volatile MMKV f66133c;

    public enum a {
        COLD,
        STARTING,
        READY;


        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ ml.a f66135b = ml.b.a(d());

        public static ml.a getEntries() {
            return f66135b;
        }
    }

    public static boolean a(String str, MMKV mmkv, String str2) {
        m0.a("f8tvDgB6V3U40GMC\n", "W78HZ3NeMhs=\n");
        mmkv.getClass();
        m0.a("YfprZTs=\n", "F5sHDF/TBRw=\n");
        str2.getClass();
        return mmkv.q(str2, str);
    }

    public static boolean b(long j10, MMKV mmkv, String str) {
        m0.a("LQW0WY2aZD5qHrhV\n", "CXHcMP6+AVA=\n");
        mmkv.getClass();
        m0.a("neOLaIA=\n", "64LnAeQ5nC0=\n");
        str.getClass();
        return mmkv.p(str, j10);
    }

    public static boolean c(double d10, MMKV mmkv, String str) {
        m0.a("RyNjXHPzFywAOG9Q\n", "Y1cLNQDXckI=\n");
        mmkv.getClass();
        m0.a("Yw5qtDw=\n", "FW8G3VjkpiM=\n");
        str.getClass();
        return mmkv.n(str, d10);
    }

    public static boolean d(boolean z10, MMKV mmkv, String str) {
        m0.a("E7wX+eWYAmlWrA==\n", "N8h/kJa8UAw=\n");
        mmkv.getClass();
        m0.a("6OM+v3M=\n", "noJS1he/yTQ=\n");
        str.getClass();
        return mmkv.c(str, z10);
    }

    public static boolean e(boolean z10, MMKV mmkv, String str) {
        m0.a("FkiDOanQjNNRU481\n", "MjzrUNr06b0=\n");
        mmkv.getClass();
        m0.a("OZj7Fvk=\n", "T/mXf507MjU=\n");
        str.getClass();
        return mmkv.s(str, z10);
    }

    public static double f(double d10, MMKV mmkv, String str) {
        m0.a("bkS1J1SjoQArVA==\n", "SjDdTieH82U=\n");
        mmkv.getClass();
        m0.a("DWTLJZo=\n", "ewWnTP77VtE=\n");
        str.getClass();
        return mmkv.d(str, d10);
    }

    public static String g(String str, MMKV mmkv, String str2) {
        m0.a("1y74s6mY712SPg==\n", "81qQ2tq8vTg=\n");
        mmkv.getClass();
        m0.a("S9UjSR8=\n", "PbRPIHsYgfI=\n");
        str2.getClass();
        String strG = mmkv.g(str2, str);
        return strG == null ? "" : strG;
    }

    public static String h(MMKV mmkv, String str) {
        m0.a("cE/Swlop3141Xw==\n", "VDu6qykNjTs=\n");
        mmkv.getClass();
        m0.a("xMKuETc=\n", "sqPCeFO8+MQ=\n");
        str.getClass();
        String strG = mmkv.g(str, "");
        return strG == null ? "" : strG;
    }

    public static long i(long j10, MMKV mmkv, String str) {
        m0.a("aZNMay+tdB4sgw==\n", "TeckAlyJJns=\n");
        mmkv.getClass();
        m0.a("/boDDtI=\n", "i9tvZ7bP7sY=\n");
        str.getClass();
        return mmkv.f(str, j10);
    }

    public static boolean j(MMKV mmkv, String str) {
        m0.a("U4y3KwAdp/YUl7sn\n", "d/jfQnM5wpg=\n");
        mmkv.getClass();
        m0.a("sxopaVI=\n", "xXtFADYQ4bM=\n");
        str.getClass();
        mmkv.z(str);
        return true;
    }

    public static boolean k(MMKV mmkv, String str) {
        m0.a("RQ+n5++2L7wAHw==\n", "YXvPjpySfdk=\n");
        mmkv.getClass();
        m0.a("SfPsfb4=\n", "P5KAFNpreaM=\n");
        str.getClass();
        return mmkv.b(str);
    }

    public static int l(int i10, MMKV mmkv, String str) {
        m0.a("zKTUdrkLG9KJtA==\n", "6NC8H8ovSbc=\n");
        mmkv.getClass();
        m0.a("EDQZpAs=\n", "ZlV1zW/zZ0M=\n");
        str.getClass();
        return mmkv.e(str, i10);
    }

    public static boolean m(int i10, MMKV mmkv, String str) {
        m0.a("Q879j0NxVT4E1fGD\n", "Z7qV5jBVMFA=\n");
        mmkv.getClass();
        m0.a("b1LkIgU=\n", "GTOIS2FcXcY=\n");
        str.getClass();
        return mmkv.o(str, i10);
    }

    public final boolean A(String str, final double d10) {
        return q(str, new tl.n() { // from class: com.neeeex.eraser.utils.x
            @Override // tl.n
            public final Object invoke(Object obj, Object obj2) {
                return Boolean.valueOf(b0.c(d10, (MMKV) obj, (String) obj2));
            }
        });
    }

    public final boolean B(String str, final int i10) {
        return q(str, new tl.n() { // from class: com.neeeex.eraser.utils.r
            @Override // tl.n
            public final Object invoke(Object obj, Object obj2) {
                return Boolean.valueOf(b0.m(i10, (MMKV) obj, (String) obj2));
            }
        });
    }

    public final boolean C(String str, final long j10) {
        return q(str, new tl.n() { // from class: com.neeeex.eraser.utils.a0
            @Override // tl.n
            public final Object invoke(Object obj, Object obj2) {
                return Boolean.valueOf(b0.b(j10, (MMKV) obj, (String) obj2));
            }
        });
    }

    public final boolean D(String str, final String str2) {
        return q(str, new tl.n() { // from class: com.neeeex.eraser.utils.z
            @Override // tl.n
            public final Object invoke(Object obj, Object obj2) {
                return Boolean.valueOf(b0.a(str2, (MMKV) obj, (String) obj2));
            }
        });
    }

    public final boolean E(String str) {
        return q(str, new tl.n() { // from class: com.neeeex.eraser.utils.w
            @Override // tl.n
            public final Object invoke(Object obj, Object obj2) {
                return Boolean.valueOf(b0.j((MMKV) obj, (String) obj2));
            }
        });
    }

    public final MMKV n() {
        MMKV mmkvP;
        MMKV mmkv = f66133c;
        if (mmkv != null) {
            return mmkv;
        }
        synchronized (this) {
            mmkvP = f66133c;
            if (mmkvP == null) {
                mmkvP = f66131a.p();
                f66133c = mmkvP;
            }
        }
        return mmkvP;
    }

    public final boolean o(String str) {
        return ((Boolean) r(new b.a(str, Boolean.FALSE, new tl.n() { // from class: com.neeeex.eraser.utils.s
            @Override // tl.n
            public final Object invoke(Object obj, Object obj2) {
                return Boolean.valueOf(b0.k((MMKV) obj, (String) obj2));
            }
        }))).booleanValue();
    }

    public final MMKV p() {
        if (f66132b != a.READY) {
            y();
        }
        return MMKV.j();
    }

    public final boolean q(String str, tl.n nVar) {
        return ((Boolean) r(new b.C0804b(str, nVar))).booleanValue();
    }

    public final Object r(b bVar) {
        Object objM372constructorimpl;
        Object objA;
        String strB = bVar.b();
        if (strB != null) {
            if (strB.length() <= 0) {
                strB = null;
            }
            if (strB != null) {
                try {
                    fl.u.a aVar = fl.u.Companion;
                    MMKV mmkvN = n();
                    if (mmkvN == null || (objA = bVar.c(mmkvN, strB)) == null) {
                        objA = bVar.a();
                    }
                    objM372constructorimpl = fl.u.m372constructorimpl(objA);
                } catch (Throwable th2) {
                    fl.u.a aVar2 = fl.u.Companion;
                    objM372constructorimpl = fl.u.m372constructorimpl(fl.v.a(th2));
                }
                return fl.u.m377isFailureimpl(objM372constructorimpl) ? bVar.a() : objM372constructorimpl;
            }
        }
        return bVar.a();
    }

    public final boolean s(String str, final boolean z10) {
        return ((Boolean) r(new b.a(str, Boolean.valueOf(z10), new tl.n() { // from class: com.neeeex.eraser.utils.q
            @Override // tl.n
            public final Object invoke(Object obj, Object obj2) {
                return Boolean.valueOf(b0.d(z10, (MMKV) obj, (String) obj2));
            }
        }))).booleanValue();
    }

    public final double t(String str, final double d10) {
        return ((Number) r(new b.a(str, Double.valueOf(d10), new tl.n() { // from class: com.neeeex.eraser.utils.t
            @Override // tl.n
            public final Object invoke(Object obj, Object obj2) {
                return Double.valueOf(b0.f(d10, (MMKV) obj, (String) obj2));
            }
        }))).doubleValue();
    }

    public final int u(String str, final int i10) {
        return ((Number) r(new b.a(str, Integer.valueOf(i10), new tl.n() { // from class: com.neeeex.eraser.utils.y
            @Override // tl.n
            public final Object invoke(Object obj, Object obj2) {
                return Integer.valueOf(b0.l(i10, (MMKV) obj, (String) obj2));
            }
        }))).intValue();
    }

    public final long v(String str, final long j10) {
        return ((Number) r(new b.a(str, Long.valueOf(j10), new tl.n() { // from class: com.neeeex.eraser.utils.u
            @Override // tl.n
            public final Object invoke(Object obj, Object obj2) {
                return Long.valueOf(b0.i(j10, (MMKV) obj, (String) obj2));
            }
        }))).longValue();
    }

    public final String w(String str) {
        return (String) r(new b.a(str, "", new tl.n() { // from class: com.neeeex.eraser.utils.v
            @Override // tl.n
            public final Object invoke(Object obj, Object obj2) {
                return b0.h((MMKV) obj, (String) obj2);
            }
        }));
    }

    public final String x(String str, final String str2) {
        return (String) r(new b.a(str, str2, new tl.n() { // from class: com.neeeex.eraser.utils.p
            @Override // tl.n
            public final Object invoke(Object obj, Object obj2) {
                return b0.g(str2, (MMKV) obj, (String) obj2);
            }
        }));
    }

    public final void y() {
        Context contextA;
        a aVar = f66132b;
        a aVar2 = a.READY;
        if (aVar == aVar2) {
            return;
        }
        synchronized (this) {
            try {
                if (f66132b == a.COLD && (contextA = com.neeeex.eraser.y.Companion.a()) != null) {
                    f66132b = a.STARTING;
                    try {
                        MMKV.t(contextA);
                    } catch (Throwable unused) {
                        aVar2 = a.COLD;
                    }
                    f66132b = aVar2;
                }
                fl.m0 m0Var = fl.m0.f80959a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final boolean z(String str, final boolean z10) {
        return q(str, new tl.n() { // from class: com.neeeex.eraser.utils.o
            @Override // tl.n
            public final Object invoke(Object obj, Object obj2) {
                return Boolean.valueOf(b0.e(z10, (MMKV) obj, (String) obj2));
            }
        });
    }

    public static abstract class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f66136a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Object f66137b;

        public static final class a extends b {

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final tl.n f66138c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(String str, Object obj, tl.n nVar) {
                super(str, obj, null);
                m0.a("lYADyazG\n", "8eVgpsijqWw=\n");
                nVar.getClass();
                this.f66138c = nVar;
            }

            @Override // com.neeeex.eraser.utils.b0.b
            public Object c(MMKV mmkv, String str) {
                m0.a("pBMr4xyoxg==\n", "12dEkX3Po/s=\n");
                mmkv.getClass();
                m0.a("4Ua30d+U7e4=\n", "lyfbuLvfiJc=\n");
                str.getClass();
                return this.f66138c.invoke(mmkv, str);
            }
        }

        /* JADX INFO: renamed from: com.neeeex.eraser.utils.b0$b$b, reason: collision with other inner class name */
        public static final class C0804b extends b {

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final tl.n f66139c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0804b(String str, tl.n nVar) {
                super(str, Boolean.FALSE, null);
                m0.a("HJsxkCQu\n", "efVS/0BLIHU=\n");
                nVar.getClass();
                this.f66139c = nVar;
            }

            @Override // com.neeeex.eraser.utils.b0.b
            /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
            public Boolean c(MMKV mmkv, String str) {
                m0.a("CXmkHS+1fw==\n", "eg3Lb07SGk4=\n");
                mmkv.getClass();
                m0.a("zgzpArmpwOY=\n", "uG2Fa93ipZ8=\n");
                str.getClass();
                return (Boolean) this.f66139c.invoke(mmkv, str);
            }
        }

        public b(String str, Object obj) {
            this.f66136a = str;
            this.f66137b = obj;
        }

        public final Object a() {
            return this.f66137b;
        }

        public final String b() {
            return this.f66136a;
        }

        public abstract Object c(MMKV mmkv, String str);

        public /* synthetic */ b(String str, Object obj, p003kotlin.jvm.internal.m mVar) {
            this(str, obj);
        }
    }
}