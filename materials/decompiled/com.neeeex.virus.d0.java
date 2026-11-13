package com.neeeex.virus;

import android.app.Application;
import androidx.p002lifecycle.AndroidViewModel;
import fl.m0;
import gq.v0;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.f1;
import kotlinx.coroutines.flow.r0;
import kotlinx.coroutines.p0;
import kotlinx.coroutines.q0;
import kotlinx.coroutines.x2;
import kotlinx.coroutines.z0;
import p003kotlin.text.k0;

/* JADX INFO: loaded from: classes7.dex */
public final class d0 extends AndroidViewModel {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final a f66659i = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final p0 f66660a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final u f66661b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final kotlinx.coroutines.flow.a0 f66662c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final LinkedHashSet f66663d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f66664e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public long f66665f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public Job f66666g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final kotlinx.coroutines.flow.p0 f66667h;

    public static final class b extends ll.m implements tl.n {
        final /* synthetic */ long $remaining;
        final /* synthetic */ int $scanGeneration;
        int label;
        final /* synthetic */ d0 this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(long j10, d0 d0Var, int i10, kl.f<? super b> fVar) {
            super(2, fVar);
            this.$remaining = j10;
            this.this$0 = d0Var;
            this.$scanGeneration = i10;
        }

        @Override // ll.a
        public final kl.f<m0> create(Object obj, kl.f<?> fVar) {
            return new b(this.$remaining, this.this$0, this.$scanGeneration, fVar);
        }

        @Override // tl.n
        public final Object invoke(p0 p0Var, kl.f<? super m0> fVar) {
            return ((b) create(p0Var, fVar)).invokeSuspend(m0.f80959a);
        }

        @Override // ll.a
        public final Object invokeSuspend(Object obj) {
            Object objF = p003kotlin.coroutines.intrinsics.c.f();
            int i10 = this.label;
            if (i10 == 0) {
                fl.v.b(obj);
                long j10 = this.$remaining;
                this.label = 1;
                if (z0.b(j10, this) == objF) {
                    return objF;
                }
            } else {
                if (i10 != 1) {
                    v0.a(com.neeeex.eraser.m0.a("FO6HQVakyWlQ/Y5eA73DblftjksZosNpUOaFWxm7w25X+IJZHvDFJgXgnlkfvsM=\n", "d4/rLXbQpkk=\n"));
                    return null;
                }
                fl.v.b(obj);
            }
            d0 d0Var = this.this$0;
            int i11 = this.$scanGeneration;
            synchronized (d0Var) {
                if (i11 == d0Var.f66664e && ((c0) d0Var.f66662c.getValue()).e() == b0.SCANNING) {
                    d0Var.f66662c.setValue(c0.b((c0) d0Var.f66662c.getValue(), b0.FINISHED, 100, null, 0, null, null, 60, null));
                }
            }
            return m0.f80959a;
        }
    }

    public static final class c implements u.a {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ int f66669b;

        public c(int i10) {
            this.f66669b = i10;
        }

        @Override // com.neeeex.virus.u.a
        public void a(int i10, int i11, String str, e0 e0Var) {
            com.neeeex.eraser.m0.a("TpIOsBvS+I9dlw==\n", "Led8wn68jM4=\n");
            str.getClass();
            d0.this.m(this.f66669b, i10, i11, str, e0Var);
        }

        @Override // com.neeeex.virus.u.a
        public void b() {
        }

        @Override // com.neeeex.virus.u.a
        public void c(List list) throws Throwable {
            com.neeeex.eraser.m0.a("qgYIGV+YLg==\n", "3m56fD7sXdQ=\n");
            list.getClass();
            d0.this.l(this.f66669b, list);
        }

        @Override // com.neeeex.virus.u.a
        public void onCanceled() {
        }

        @Override // com.neeeex.virus.u.a
        public void onError(int i10, String str) {
            com.neeeex.eraser.m0.a("wS2a3rYsSw==\n", "rEjprddLLpw=\n");
            str.getClass();
            d0.this.k(this.f66669b, str);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d0(Application application) {
        super(application);
        com.neeeex.eraser.m0.a("bUKh5MYXlfBlXb8=\n", "DDLRiK909IQ=\n");
        application.getClass();
        this.f66660a = q0.a(x2.b(null, 1, null).plus(f1.a()));
        this.f66661b = new com.neeeex.virus.a(application);
        kotlinx.coroutines.flow.a0 a0VarA = r0.a(new c0(null, 0, null, 0, null, null, 63, null));
        this.f66662c = a0VarA;
        this.f66663d = new LinkedHashSet();
        this.f66667h = kotlinx.coroutines.flow.i.a(a0VarA);
    }

    public final synchronized void i() {
        try {
            this.f66664e++;
            Job job = this.f66666g;
            if (job != null) {
                Job.a.a(job, null, 1, null);
            }
            this.f66661b.cancel();
            kotlinx.coroutines.flow.a0 a0Var = this.f66662c;
            a0Var.setValue(c0.b((c0) a0Var.getValue(), b0.CANCELED, 0, null, 0, null, null, 62, null));
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public final kotlinx.coroutines.flow.p0 j() {
        return this.f66667h;
    }

    public final synchronized void k(int i10, String str) {
        if (i10 == this.f66664e && ((c0) this.f66662c.getValue()).e() == b0.SCANNING) {
            kotlinx.coroutines.flow.a0 a0Var = this.f66662c;
            a0Var.setValue(c0.b((c0) a0Var.getValue(), b0.ERROR, 0, null, 0, null, str, 30, null));
        }
    }

    public final synchronized void l(int i10, List list) throws Throwable {
        Throwable th2;
        try {
            try {
                if (i10 != this.f66664e || ((c0) this.f66662c.getValue()).e() != b0.SCANNING) {
                    return;
                }
                HashSet hashSet = new HashSet();
                ArrayList arrayList = new ArrayList();
                for (Object obj : list) {
                    try {
                        if (hashSet.add(((e0) obj).g())) {
                            arrayList.add(obj);
                        }
                    } catch (Throwable th3) {
                        th2 = th3;
                    }
                }
                kotlinx.coroutines.flow.a0 a0Var = this.f66662c;
                a0Var.setValue(c0.b((c0) a0Var.getValue(), null, 99, null, arrayList.size(), arrayList, null, 37, null));
                try {
                    this.f66666g = kotlinx.coroutines.k.d(this.f66660a, null, null, new b(am.q.g(4000 - (System.currentTimeMillis() - this.f66665f), 0L), this, i10, null), 3, null);
                    return;
                } catch (Throwable th4) {
                    th = th4;
                }
            } catch (Throwable th5) {
                th = th5;
            }
        } catch (Throwable th6) {
            th = th6;
        }
        th2 = th;
        throw th2;
    }

    public final synchronized void m(int i10, int i11, int i12, String str, e0 e0Var) {
        try {
            if (i10 == this.f66664e && ((c0) this.f66662c.getValue()).e() == b0.SCANNING) {
                if (e0Var != null) {
                    this.f66663d.add(e0Var.g());
                }
                int iP = i12 > 0 ? am.q.p((int) ((((long) i11) * 100) / ((long) i12)), 1, 99) : ((c0) this.f66662c.getValue()).f();
                kotlinx.coroutines.flow.a0 a0Var = this.f66662c;
                c0 c0Var = (c0) a0Var.getValue();
                int iMax = Math.max(iP, ((c0) this.f66662c.getValue()).f());
                if (k0.r0(str)) {
                    str = null;
                }
                if (str == null) {
                    str = ((c0) this.f66662c.getValue()).c();
                }
                a0Var.setValue(c0.b(c0Var, null, iMax, str, this.f66663d.size(), null, null, 49, null));
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public final void n() {
        o();
    }

    public final synchronized void o() {
        try {
            b0 b0VarE = ((c0) this.f66662c.getValue()).e();
            b0 b0Var = b0.SCANNING;
            if (b0VarE == b0Var) {
                return;
            }
            Job job = this.f66666g;
            if (job != null) {
                Job.a.a(job, null, 1, null);
            }
            int i10 = this.f66664e + 1;
            this.f66664e = i10;
            this.f66663d.clear();
            this.f66665f = System.currentTimeMillis();
            this.f66662c.setValue(new c0(b0Var, 0, null, 0, null, null, 62, null));
            this.f66661b.a(new c(i10));
        } catch (Throwable th2) {
            throw th2;
        }
    }

    @Override // androidx.p002lifecycle.ViewModel
    public void onCleared() {
        this.f66664e++;
        this.f66661b.cancel();
        q0.d(this.f66660a, null, 1, null);
        super.onCleared();
    }

    public static final class a {
        public /* synthetic */ a(p003kotlin.jvm.internal.m mVar) {
            this();
        }

        public a() {
        }
    }
}