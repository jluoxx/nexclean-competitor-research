package com.neeeex.ctools.features.appmanager;

import android.app.Application;
import androidx.p002lifecycle.AndroidViewModel;
import androidx.p002lifecycle.LiveData;
import androidx.p002lifecycle.MutableLiveData;
import androidx.p002lifecycle.ViewModelKt;
import com.neeeex.eraser.R$string;
import com.neeeex.eraser.m0;
import gq.v0;
import java.util.List;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.f1;
import kotlinx.coroutines.l0;
import kotlinx.coroutines.p0;
import p003kotlin.jvm.functions.Function1;
import p003kotlin.jvm.internal.s;
import p003kotlin.jvm.internal.v;

/* JADX INFO: loaded from: classes7.dex */
public final class q extends AndroidViewModel {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final bi.e f64223a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final MutableLiveData f64224b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final MutableLiveData f64225c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Job f64226d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final LiveData f64227e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final LiveData f64228f;

    public interface a {

        /* JADX INFO: renamed from: com.neeeex.ctools.features.appmanager.q$a$a, reason: collision with other inner class name */
        public static final class C0735a implements a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final Throwable f64229a;

            public C0735a(Throwable th2) {
                m0.a("jrwspwQ=\n", "7d1Z1GEP+NE=\n");
                th2.getClass();
                this.f64229a = th2;
            }

            public final Throwable a() {
                return this.f64229a;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof C0735a) && v.c(this.f64229a, ((C0735a) obj).f64229a);
            }

            public int hashCode() {
                return this.f64229a.hashCode();
            }

            public String toString() {
                return "Failed(cause=" + this.f64229a + ")";
            }
        }

        public static final class b implements a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final List f64230a;

            public b(List list) {
                m0.a("g2aORA==\n", "4hb+N8p5hoA=\n");
                list.getClass();
                this.f64230a = list;
            }

            public final List a() {
                return this.f64230a;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof b) && v.c(this.f64230a, ((b) obj).f64230a);
            }

            public int hashCode() {
                return this.f64230a.hashCode();
            }

            public String toString() {
                return "Finished(apps=" + this.f64230a + ")";
            }
        }

        public static final class c implements a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final c f64231a = new c();

            public boolean equals(Object obj) {
                return this == obj || (obj instanceof c);
            }

            public int hashCode() {
                return -511577384;
            }

            public String toString() {
                return m0.a("nWZ/qZJfzA==\n", "zhIe2+Y6qI0=\n");
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q(Application application) {
        super(application);
        m0.a("PWH3TB5Z5co1fuk=\n", "XBGHIHc6hL4=\n");
        application.getClass();
        this.f64223a = new bi.e(application);
        MutableLiveData mutableLiveData = new MutableLiveData(zh.a.d.f104379a);
        this.f64224b = mutableLiveData;
        MutableLiveData mutableLiveData2 = new MutableLiveData(0);
        this.f64225c = mutableLiveData2;
        this.f64227e = mutableLiveData;
        this.f64228f = mutableLiveData2;
    }

    public final void g() {
        Job job = this.f64226d;
        if (job != null) {
            Job.a.a(job, null, 1, null);
        }
    }

    public final zh.a h(List list) {
        return list.isEmpty() ? new zh.a.b(m(R$string.ctools_neeeex_app_manager_empty)) : new zh.a.C1347a(list);
    }

    public final LiveData i() {
        return this.f64228f;
    }

    public final LiveData j() {
        return this.f64227e;
    }

    public final void k(a aVar) {
        if (v.c(aVar, a.c.f64231a)) {
            this.f64225c.setValue(0);
            this.f64224b.setValue(zh.a.e.f104380a);
        } else if (aVar instanceof a.C0735a) {
            this.f64225c.setValue(100);
            this.f64224b.setValue(new zh.a.c(m(R$string.ctools_neeeex_app_manager_error), ((a.C0735a) aVar).a()));
        } else if (!(aVar instanceof a.b)) {
            coil.util.j.a();
        } else {
            this.f64225c.setValue(100);
            this.f64224b.setValue(h(((a.b) aVar).a()));
        }
    }

    public final void l() {
        Job job = this.f64226d;
        boolean z10 = false;
        if (job != null && job.isActive()) {
            z10 = true;
        }
        if (z10) {
            return;
        }
        k(a.c.f64231a);
        this.f64226d = kotlinx.coroutines.k.d(ViewModelKt.getViewModelScope(this), null, null, new b(null), 3, null);
    }

    public final String m(int i10) {
        String string = getApplication().getString(i10);
        m0.a("XBcwiaLjjW1cWmr0+Lg=\n", "O3JE2taR5AM=\n");
        string.getClass();
        return string;
    }

    public static final class b extends ll.m implements tl.n {
        int label;

        public b(kl.f<? super b> fVar) {
            super(2, fVar);
        }

        @Override // ll.a
        public final kl.f<fl.m0> create(Object obj, kl.f<?> fVar) {
            return q.this.new b(fVar);
        }

        @Override // tl.n
        public final Object invoke(p0 p0Var, kl.f<? super fl.m0> fVar) {
            return ((b) create(p0Var, fVar)).invokeSuspend(fl.m0.f80959a);
        }

        @Override // ll.a
        public final Object invokeSuspend(Object obj) {
            a c0735a;
            Object objF = p003kotlin.coroutines.intrinsics.c.f();
            int i10 = this.label;
            try {
                if (i10 == 0) {
                    fl.v.b(obj);
                    l0 l0VarB = f1.b();
                    a aVar = new a(q.this, null);
                    this.label = 1;
                    obj = kotlinx.coroutines.i.g(l0VarB, aVar, this);
                    if (obj == objF) {
                        return objF;
                    }
                } else {
                    if (i10 != 1) {
                        v0.a(m0.a("KVXaDlE/hi1tRtMRBCaMKmpW0wQeOYwtbV3YFB4gjCpqQ98WGWuKYjhbwxYYJYw=\n", "SjS2YnFL6Q0=\n"));
                        return null;
                    }
                    fl.v.b(obj);
                }
                c0735a = new a.b((List) obj);
            } catch (Throwable th2) {
                c0735a = new a.C0735a(th2);
            }
            q.this.k(c0735a);
            return fl.m0.f80959a;
        }

        public static final class a extends ll.m implements tl.n {
            int label;
            final /* synthetic */ q this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(q qVar, kl.f<? super a> fVar) {
                super(2, fVar);
                this.this$0 = qVar;
            }

            @Override // ll.a
            public final kl.f<fl.m0> create(Object obj, kl.f<?> fVar) {
                return new a(this.this$0, fVar);
            }

            @Override // tl.n
            public final Object invoke(p0 p0Var, kl.f<? super List<bi.g>> fVar) {
                return ((a) create(p0Var, fVar)).invokeSuspend(fl.m0.f80959a);
            }

            @Override // ll.a
            public final Object invokeSuspend(Object obj) {
                p003kotlin.coroutines.intrinsics.c.f();
                if (this.label == 0) {
                    fl.v.b(obj);
                    return this.this$0.f64223a.b(new C0736a(this.this$0.f64225c));
                }
                v0.a(m0.a("+9zminaugxS/z++VI7eJE7jf74A5qIkUv9TkkDmxiRO4yuOSPvqPW+rS/5I/tIk=\n", "mL2K5lba7DQ=\n"));
                return null;
            }

            /* JADX INFO: renamed from: com.neeeex.ctools.features.appmanager.q$b$a$a, reason: collision with other inner class name */
            public static final /* synthetic */ class C0736a extends s implements Function1 {
                public C0736a(Object obj) {
                    super(1, obj, MutableLiveData.class, m0.a("r+44rwqVADO6\n", "34FL21z0bEY=\n"), m0.a("QivwSv65B9JXbM9Uya4KiF4l7VmHlwnNVyf3BYGO\n", "MkSDPqjYa6c=\n"), 0);
                }

                @Override // p003kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                    invoke((Integer) obj);
                    return fl.m0.f80959a;
                }

                public final void invoke(Integer num) {
                    ((MutableLiveData) this.receiver).postValue(num);
                }
            }
        }
    }
}