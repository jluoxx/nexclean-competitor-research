package com.neeeex.ctools.features.network;

import android.app.Application;
import androidx.p002lifecycle.AndroidViewModel;
import androidx.p002lifecycle.LiveData;
import androidx.p002lifecycle.MutableLiveData;
import androidx.p002lifecycle.ViewModelKt;
import com.neeeex.eraser.R$string;
import com.neeeex.eraser.m0;
import di.k;
import gq.v0;
import java.util.List;
import kotlinx.coroutines.f1;
import kotlinx.coroutines.l0;
import kotlinx.coroutines.p0;
import ll.m;
import p003kotlin.jvm.internal.v;
import tl.n;

/* JADX INFO: loaded from: classes7.dex */
public final class j extends AndroidViewModel {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final yh.a f64397a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final k f64398b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final MutableLiveData f64399c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final LiveData f64400d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public di.f f64401e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public di.b f64402f;

    public interface a {

        /* JADX INFO: renamed from: com.neeeex.ctools.features.network.j$a$a, reason: collision with other inner class name */
        public static final class C0745a implements a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final List f64403a;

            public C0745a(List list) {
                "items" /* decoded XOR */;
                list.getClass();
                this.f64403a = list;
            }

            public final List a() {
                return this.f64403a;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof C0745a) && v.c(this.f64403a, ((C0745a) obj).f64403a);
            }

            public int hashCode() {
                return this.f64403a.hashCode();
            }

            public String toString() {
                return "Data(items=" + this.f64403a + ")";
            }
        }

        public static final class b implements a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final Throwable f64404a;

            public b(Throwable th2) {
                "cause" /* decoded XOR */;
                th2.getClass();
                this.f64404a = th2;
            }

            public final Throwable a() {
                return this.f64404a;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof b) && v.c(this.f64404a, ((b) obj).f64404a);
            }

            public int hashCode() {
                return this.f64404a.hashCode();
            }

            public String toString() {
                return "Failed(cause=" + this.f64404a + ")";
            }
        }
    }

    public interface b {

        public static final class a implements b {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final a f64405a = new a();

            public boolean equals(Object obj) {
                return this == obj || (obj instanceof a);
            }

            public int hashCode() {
                return -1775878182;
            }

            public String toString() {
                return "PermissionDenied" /* decoded XOR */;
            }
        }

        /* JADX INFO: renamed from: com.neeeex.ctools.features.network.j$b$b, reason: collision with other inner class name */
        public static final class C0746b implements b {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final di.f f64406a;

            public C0746b(di.f fVar) {
                "range" /* decoded XOR */;
                fVar.getClass();
                this.f64406a = fVar;
            }

            public final di.f a() {
                return this.f64406a;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof C0746b) && this.f64406a == ((C0746b) obj).f64406a;
            }

            public int hashCode() {
                return this.f64406a.hashCode();
            }

            public String toString() {
                return "Read(range=" + this.f64406a + ")";
            }
        }
    }

    public static final class c extends m implements n {
        final /* synthetic */ di.f $range;
        int label;

        public static final class a extends m implements n {
            final /* synthetic */ di.f $range;
            int label;
            final /* synthetic */ j this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(j jVar, di.f fVar, kl.f<? super a> fVar2) {
                super(2, fVar2);
                this.this$0 = jVar;
                this.$range = fVar;
            }

            @Override // ll.a
            public final kl.f<fl.m0> create(Object obj, kl.f<?> fVar) {
                return new a(this.this$0, this.$range, fVar);
            }

            @Override // tl.n
            public final Object invoke(p0 p0Var, kl.f<? super List<di.c>> fVar) {
                return ((a) create(p0Var, fVar)).invokeSuspend(fl.m0.f80959a);
            }

            @Override // ll.a
            public final Object invokeSuspend(Object obj) {
                p003kotlin.coroutines.intrinsics.c.f();
                if (this.label == 0) {
                    fl.v.b(obj);
                    return this.this$0.f64398b.b(this.$range);
                }
                v0.a("call to 'resume' before 'invoke' with coroutine" /* decoded XOR */);
                return null;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(di.f fVar, kl.f<? super c> fVar2) {
            super(2, fVar2);
            this.$range = fVar;
        }

        @Override // ll.a
        public final kl.f<fl.m0> create(Object obj, kl.f<?> fVar) {
            return j.this.new c(this.$range, fVar);
        }

        @Override // tl.n
        public final Object invoke(p0 p0Var, kl.f<? super fl.m0> fVar) {
            return ((c) create(p0Var, fVar)).invokeSuspend(fl.m0.f80959a);
        }

        @Override // ll.a
        public final Object invokeSuspend(Object obj) {
            a bVar;
            Object objF = p003kotlin.coroutines.intrinsics.c.f();
            int i10 = this.label;
            try {
                if (i10 == 0) {
                    fl.v.b(obj);
                    l0 l0VarB = f1.b();
                    a aVar = new a(j.this, this.$range, null);
                    this.label = 1;
                    obj = kotlinx.coroutines.i.g(l0VarB, aVar, this);
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
                bVar = new a.C0745a((List) obj);
            } catch (Throwable th2) {
                bVar = new a.b(th2);
            }
            j.this.f64399c.setValue(j.this.l(bVar));
            return fl.m0.f80959a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(Application application) {
        super(application);
        "application" /* decoded XOR */;
        application.getClass();
        this.f64397a = new yh.a(application);
        this.f64398b = new k(application);
        MutableLiveData mutableLiveData = new MutableLiveData(zh.a.d.f104379a);
        this.f64399c = mutableLiveData;
        this.f64400d = mutableLiveData;
        this.f64401e = di.f.LAST_24_HOURS;
        this.f64402f = di.b.BOTH_TYPES;
    }

    private final String n(int i10) {
        String string = getApplication().getString(i10);
        "getString(...)" /* decoded XOR */;
        string.getClass();
        return string;
    }

    public final void g(di.f fVar) {
        this.f64399c.setValue(zh.a.e.f104380a);
        kotlinx.coroutines.k.d(ViewModelKt.getViewModelScope(this), null, null, new c(fVar, null), 3, null);
    }

    public final di.b h() {
        return this.f64402f;
    }

    public final LiveData i() {
        return this.f64400d;
    }

    public final void j(di.f fVar) {
        "range" /* decoded XOR */;
        fVar.getClass();
        this.f64401e = fVar;
        b bVarK = k(fVar);
        if (v.c(bVarK, b.a.f64405a)) {
            this.f64399c.setValue(zh.a.f.f104381a);
        } else if (bVarK instanceof b.C0746b) {
            g(((b.C0746b) bVarK).a());
        } else {
            coil.util.j.a();
        }
    }

    public final b k(di.f fVar) {
        return this.f64397a.b() ? new b.C0746b(fVar) : b.a.f64405a;
    }

    public final zh.a l(a aVar) {
        if (aVar instanceof a.b) {
            return new zh.a.c(n(R$string.ctools_neeeex_error_read_network_traffic), ((a.b) aVar).a());
        }
        if (aVar instanceof a.C0745a) {
            a.C0745a c0745a = (a.C0745a) aVar;
            return c0745a.a().isEmpty() ? new zh.a.b(n(R$string.ctools_neeeex_no_detected)) : new zh.a.C1347a(c0745a.a());
        }
        coil.util.j.a();
        return null;
    }

    public final void m(di.b bVar) {
        "filter" /* decoded XOR */;
        bVar.getClass();
        this.f64402f = bVar;
    }
}