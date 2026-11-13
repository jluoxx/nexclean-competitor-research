package hj;

import java.util.concurrent.ConcurrentLinkedQueue;

/* JADX INFO: loaded from: classes7.dex */
public abstract class b implements q1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public volatile a f83513a = a.NONE;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ConcurrentLinkedQueue f83514b = new ConcurrentLinkedQueue();

    /* JADX WARN: Enum visitor error
    jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v1 hj.b$a[], still in use, count: 1, list:
  (r0v1 hj.b$a[]) from 0x002e: INVOKE (r0v1 hj.b$a[]) STATIC call: ml.b.a(java.lang.Enum[]):ml.a A[MD:(java.lang.Enum[]):ml.a (m), WRAPPED]
    	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:164)
    	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:129)
    	at jadx.core.utils.InsnRemover.lambda$unbindInsns$1(InsnRemover.java:101)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1511)
    	at jadx.core.utils.InsnRemover.unbindInsns(InsnRemover.java:100)
    	at jadx.core.utils.InsnRemover.removeAllAndUnbind(InsnRemover.java:257)
    	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:187)
    	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:102)
     */
    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    public static final class a {
        NONE,
        INITIALIZING,
        SUCCEED,
        FAILED;

        public static final /* synthetic */ ml.a OooO0o;

        static {
            OooO0o = ml.b.a(aVarArr);
        }

        public a() {
            super(str, i);
        }

        public static ml.a OooO00o() {
            return OooO0o;
        }

        public static a valueOf(String str) {
            return (a) Enum.valueOf(a.class, str);
        }

        public static a[] values() {
            return (a[]) OooO0o0.clone();
        }
    }

    /* JADX INFO: renamed from: hj.b$b, reason: collision with other inner class name */
    public static final class C1016b implements j1 {
        public C1016b() {
        }

        @Override // hj.j1
        public final void a(String str) {
            b.this.d(false, str);
        }

        @Override // hj.j1
        public final void onInitSuccess() {
            b.this.d(true, "");
        }
    }

    @Override // hj.q1
    public final boolean a() {
        return this.f83513a == a.SUCCEED;
    }

    @Override // hj.q1
    public final void b(j1 j1Var) {
        if (a()) {
            j1Var.onInitSuccess();
            return;
        }
        this.f83514b.add(j1Var);
        a aVar = this.f83513a;
        a aVar2 = a.INITIALIZING;
        if (aVar != aVar2) {
            this.f83513a = aVar2;
            try {
                c(new C1016b());
            } catch (Throwable th2) {
                th2.printStackTrace();
                d(false, th2.getMessage());
            }
        }
    }

    public abstract void c(C1016b c1016b);

    public final void d(boolean z10, String str) {
        fl.m0 m0Var;
        this.f83513a = z10 ? a.SUCCEED : a.FAILED;
        j1 j1Var = null;
        while (true) {
            j1 j1Var2 = (j1) this.f83514b.poll();
            if (j1Var2 != null) {
                m0Var = fl.m0.f80959a;
            } else {
                j1Var2 = j1Var;
                m0Var = null;
            }
            if (m0Var == null) {
                return;
            }
            if (z10) {
                if (j1Var2 != null) {
                    j1Var2.onInitSuccess();
                }
            } else if (j1Var2 != null) {
                j1Var2.a(str);
            }
            j1Var = j1Var2;
        }
    }
}