package com.neeeex.ctools.features.networkspeed;

import androidx.p002lifecycle.LiveData;
import androidx.p002lifecycle.MutableLiveData;
import androidx.p002lifecycle.ViewModel;
import androidx.p002lifecycle.ViewModelKt;
import com.neeeex.eraser.m0;
import gq.v0;
import java.util.concurrent.CancellationException;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.p0;
import p003kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes7.dex */
public final class v extends ViewModel {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final e f64547a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final MutableLiveData f64548b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final LiveData f64549c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Job f64550d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public long f64551e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public Long f64552f;

    public interface a {

        /* JADX INFO: renamed from: com.neeeex.ctools.features.networkspeed.v$a$a, reason: collision with other inner class name */
        public static final class C0752a implements a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final p f64553a;

            public C0752a(p pVar) {
                "result" /* decoded XOR */;
                pVar.getClass();
                this.f64553a = pVar;
            }

            public final p a() {
                return this.f64553a;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof C0752a) && p003kotlin.jvm.internal.v.c(this.f64553a, ((C0752a) obj).f64553a);
            }

            public int hashCode() {
                return this.f64553a.hashCode();
            }

            public String toString() {
                return "Finished(result=" + this.f64553a + ")";
            }
        }

        public static final class b implements a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final double f64554a;

            public b(double d10) {
                this.f64554a = d10;
            }

            public final double a() {
                return this.f64554a;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof b) && Double.compare(this.f64554a, ((b) obj).f64554a) == 0;
            }

            public int hashCode() {
                return Double.hashCode(this.f64554a);
            }

            public String toString() {
                return "Progress(mbps=" + this.f64554a + ")";
            }
        }

        public static final class c implements a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final c f64555a = new c();

            public boolean equals(Object obj) {
                return this == obj || (obj instanceof c);
            }

            public int hashCode() {
                return -2111250889;
            }

            public String toString() {
                return "Started" /* decoded XOR */;
            }
        }
    }

    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final long f64556a;

        public b(long j10) {
            this.f64556a = j10;
        }

        public final long a() {
            return this.f64556a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof b) && this.f64556a == ((b) obj).f64556a;
        }

        public int hashCode() {
            return Long.hashCode(this.f64556a);
        }

        public String toString() {
            return "MeasurementSession(token=" + this.f64556a + ")";
        }
    }

    public static final class c extends ll.m implements tl.n {
        final /* synthetic */ b $session;
        int label;

        public static final class a extends ll.m implements tl.n {
            final /* synthetic */ double $mbps;
            final /* synthetic */ b $session;
            int label;
            final /* synthetic */ v this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(v vVar, b bVar, double d10, kl.f<? super a> fVar) {
                super(2, fVar);
                this.this$0 = vVar;
                this.$session = bVar;
                this.$mbps = d10;
            }

            @Override // ll.a
            public final kl.f<fl.m0> create(Object obj, kl.f<?> fVar) {
                return new a(this.this$0, this.$session, this.$mbps, fVar);
            }

            @Override // tl.n
            public final Object invoke(p0 p0Var, kl.f<? super fl.m0> fVar) {
                return ((a) create(p0Var, fVar)).invokeSuspend(fl.m0.f80959a);
            }

            @Override // ll.a
            public final Object invokeSuspend(Object obj) {
                p003kotlin.coroutines.intrinsics.c.f();
                if (this.label != 0) {
                    v0.a("call to 'resume' before 'invoke' with coroutine" /* decoded XOR */);
                    return null;
                }
                fl.v.b(obj);
                this.this$0.m(this.$session, new a.b(this.$mbps));
                return fl.m0.f80959a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(b bVar, kl.f<? super c> fVar) {
            super(2, fVar);
            this.$session = bVar;
        }

        public static fl.m0 b(v vVar, b bVar, double d10) {
            kotlinx.coroutines.k.d(ViewModelKt.getViewModelScope(vVar), null, null, new a(vVar, bVar, d10, null), 3, null);
            return fl.m0.f80959a;
        }

        @Override // ll.a
        public final kl.f<fl.m0> create(Object obj, kl.f<?> fVar) {
            return v.this.new c(this.$session, fVar);
        }

        @Override // tl.n
        public final Object invoke(p0 p0Var, kl.f<? super fl.m0> fVar) {
            return ((c) create(p0Var, fVar)).invokeSuspend(fl.m0.f80959a);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // ll.a
        public final Object invokeSuspend(Object obj) {
            Object objF = p003kotlin.coroutines.intrinsics.c.f();
            int i10 = this.label;
            try {
                if (i10 == 0) {
                    fl.v.b(obj);
                    e eVar = v.this.f64547a;
                    final v vVar = v.this;
                    final b bVar = this.$session;
                    Function1 function1 = new Function1() { // from class: com.neeeex.ctools.features.networkspeed.w
                        @Override // p003kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj2) {
                            return v.c.b(vVar, bVar, ((Double) obj2).doubleValue());
                        }
                    };
                    this.label = 1;
                    obj = eVar.a(function1, this);
                    if (obj == objF) {
                        return objF;
                    }
                } else {
                    if (i10 != 1) {
                        v0.a("call to 'resume' before 'invoke' with coroutine" /* decoded XOR */);
                        return null;
                    }
                    fl.v.b(obj);
                }
                v.this.m(this.$session, new a.C0752a((p) obj));
                if (v.this.k(this.$session)) {
                }
            } catch (CancellationException unused) {
            } finally {
                if (v.this.k(this.$session)) {
                    v.this.f64552f = null;
                    v.this.f64550d = null;
                }
            }
            return fl.m0.f80959a;
        }
    }

    public v(e eVar) {
        "measurement" /* decoded XOR */;
        eVar.getClass();
        this.f64547a = eVar;
        MutableLiveData mutableLiveData = new MutableLiveData(u.b.f64543a);
        this.f64548b = mutableLiveData;
        this.f64549c = mutableLiveData;
    }

    public final void i() {
        this.f64552f = null;
        Job job = this.f64550d;
        if (job != null) {
            Job.a.a(job, null, 1, null);
        }
        this.f64550d = null;
    }

    public final LiveData j() {
        return this.f64549c;
    }

    public final boolean k(b bVar) {
        Long l10 = this.f64552f;
        return l10 != null && l10.longValue() == bVar.a();
    }

    public final boolean l(u uVar) {
        return (uVar instanceof u.d) || (uVar instanceof u.a);
    }

    public final void m(b bVar, a aVar) {
        if (k(bVar)) {
            if (p003kotlin.jvm.internal.v.c(aVar, a.c.f64555a)) {
                this.f64548b.setValue(u.c.f64544a);
                return;
            }
            if (aVar instanceof a.b) {
                if (l((u) this.f64548b.getValue())) {
                    return;
                }
                this.f64548b.setValue(s.f64524a.a(((a.b) aVar).a()));
            } else if (aVar instanceof a.C0752a) {
                this.f64548b.setValue(s.f64524a.b(((a.C0752a) aVar).a()));
            } else {
                coil.util.j.a();
            }
        }
    }

    public final void n(d dVar) {
        "reason" /* decoded XOR */;
        dVar.getClass();
        r(new u.a(dVar));
    }

    public final void o() {
        r(u.b.f64543a);
    }

    @Override // androidx.p002lifecycle.ViewModel
    public void onCleared() {
        i();
        super.onCleared();
    }

    public final void p() {
        q();
    }

    public final void q() {
        Job job = this.f64550d;
        if (job == null || !job.isActive()) {
            long j10 = this.f64551e + 1;
            this.f64551e = j10;
            b bVar = new b(j10);
            this.f64552f = Long.valueOf(bVar.a());
            m(bVar, a.c.f64555a);
            this.f64550d = kotlinx.coroutines.k.d(ViewModelKt.getViewModelScope(this), null, null, new c(bVar, null), 3, null);
        }
    }

    public final void r(u uVar) {
        Job job = this.f64550d;
        if (job == null || !job.isActive()) {
            this.f64548b.setValue(uVar);
        }
    }
}