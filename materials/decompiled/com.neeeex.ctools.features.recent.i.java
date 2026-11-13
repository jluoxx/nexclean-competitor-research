package com.neeeex.ctools.features.recent;

import android.app.Application;
import androidx.p002lifecycle.AndroidViewModel;
import androidx.p002lifecycle.LiveData;
import androidx.p002lifecycle.MutableLiveData;
import androidx.p002lifecycle.ViewModelKt;
import com.neeeex.eraser.R$string;
import com.neeeex.eraser.m0;
import gi.n;
import gq.v0;
import java.util.List;
import kotlinx.coroutines.f1;
import kotlinx.coroutines.l0;
import kotlinx.coroutines.p0;
import ll.m;
import p003kotlin.jvm.internal.v;

/* JADX INFO: loaded from: classes7.dex */
public final class i extends AndroidViewModel {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final yh.a f64836a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final n f64837b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final MutableLiveData f64838c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final LiveData f64839d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public gi.c f64840e;

    public interface a {

        /* JADX INFO: renamed from: com.neeeex.ctools.features.recent.i$a$a, reason: collision with other inner class name */
        public static final class C0770a implements a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final List f64841a;

            public C0770a(List list) {
                m0.a("diYTLWI=\n", "H1J2QBHIc8c=\n");
                list.getClass();
                this.f64841a = list;
            }

            public final List a() {
                return this.f64841a;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof C0770a) && v.c(this.f64841a, ((C0770a) obj).f64841a);
            }

            public int hashCode() {
                return this.f64841a.hashCode();
            }

            public String toString() {
                return "Apps(items=" + this.f64841a + ")";
            }
        }

        public static final class b implements a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final Throwable f64842a;

            public b(Throwable th2) {
                m0.a("MU/7k18=\n", "Ui6O4Doo+Xk=\n");
                th2.getClass();
                this.f64842a = th2;
            }

            public final Throwable a() {
                return this.f64842a;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof b) && v.c(this.f64842a, ((b) obj).f64842a);
            }

            public int hashCode() {
                return this.f64842a.hashCode();
            }

            public String toString() {
                return "Failed(cause=" + this.f64842a + ")";
            }
        }
    }

    public static final class b extends m implements tl.n {
        final /* synthetic */ k $request;
        int label;

        public static final class a extends m implements tl.n {
            final /* synthetic */ k $request;
            int label;
            final /* synthetic */ i this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(i iVar, k kVar, kl.f<? super a> fVar) {
                super(2, fVar);
                this.this$0 = iVar;
                this.$request = kVar;
            }

            @Override // ll.a
            public final kl.f<fl.m0> create(Object obj, kl.f<?> fVar) {
                return new a(this.this$0, this.$request, fVar);
            }

            @Override // tl.n
            public final Object invoke(p0 p0Var, kl.f<? super List<gi.b>> fVar) {
                return ((a) create(p0Var, fVar)).invokeSuspend(fl.m0.f80959a);
            }

            @Override // ll.a
            public final Object invokeSuspend(Object obj) {
                p003kotlin.coroutines.intrinsics.c.f();
                if (this.label == 0) {
                    fl.v.b(obj);
                    return this.this$0.f64837b.c(this.$request.a());
                }
                v0.a(m0.a("Obm3hyb6j1V9qr6Yc+OFUnq6vo1p/IVVfbG1nWnlhVJ6r7Kfbq6DGii3rp9v4IU=\n", "Wtjb6waO4HU=\n"));
                return null;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(k kVar, kl.f<? super b> fVar) {
            super(2, fVar);
            this.$request = kVar;
        }

        @Override // ll.a
        public final kl.f<fl.m0> create(Object obj, kl.f<?> fVar) {
            return i.this.new b(this.$request, fVar);
        }

        @Override // tl.n
        public final Object invoke(p0 p0Var, kl.f<? super fl.m0> fVar) {
            return ((b) create(p0Var, fVar)).invokeSuspend(fl.m0.f80959a);
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
                    a aVar = new a(i.this, this.$request, null);
                    this.label = 1;
                    obj = kotlinx.coroutines.i.g(l0VarB, aVar, this);
                    if (obj == objF) {
                        return objF;
                    }
                } else {
                    if (i10 != 1) {
                        v0.a(m0.a("eYUrl+/ya7o9liKIuuthvTqGIp2g9GG6PY0pjaDtYb06ky6Pp6Zn9WiLMo+m6GE=\n", "GuRH+8+GBJo=\n"));
                        return null;
                    }
                    fl.v.b(obj);
                }
                bVar = new a.C0770a((List) obj);
            } catch (Throwable th2) {
                bVar = new a.b(th2);
            }
            i.this.f64838c.setValue(i.this.k(bVar));
            return fl.m0.f80959a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(Application application) {
        super(application);
        m0.a("IZ+6MNotgBMpgKQ=\n", "QO/KXLNO4Wc=\n");
        application.getClass();
        this.f64836a = new yh.a(application);
        this.f64837b = new n(application);
        MutableLiveData mutableLiveData = new MutableLiveData(zh.a.d.f104379a);
        this.f64838c = mutableLiveData;
        this.f64839d = mutableLiveData;
        this.f64840e = gi.c.TODAY;
    }

    private final String l(int i10) {
        String string = getApplication().getString(i10);
        m0.a("v7kbfLMyLQu/9EEB6Wk=\n", "2NxvL8dARGU=\n");
        string.getClass();
        return string;
    }

    public final void g(k kVar) {
        this.f64838c.setValue(zh.a.e.f104380a);
        kotlinx.coroutines.k.d(ViewModelKt.getViewModelScope(this), null, null, new b(kVar, null), 3, null);
    }

    public final gi.c h() {
        return this.f64840e;
    }

    public final LiveData i() {
        return this.f64839d;
    }

    public final void j(gi.c cVar) {
        m0.a("8g/bXCg=\n", "gG61O03i9h4=\n");
        cVar.getClass();
        this.f64840e = cVar;
        Object kVar = this.f64836a.b() ? new k(cVar) : j.f64843a;
        if (v.c(kVar, j.f64843a)) {
            this.f64838c.setValue(zh.a.f.f104381a);
        } else if (kVar instanceof k) {
            g((k) kVar);
        } else {
            coil.util.j.a();
        }
    }

    public final zh.a k(a aVar) {
        if (aVar instanceof a.b) {
            return new zh.a.c(l(R$string.ctools_neeeex_error_read_recent_apps), ((a.b) aVar).a());
        }
        if (aVar instanceof a.C0770a) {
            a.C0770a c0770a = (a.C0770a) aVar;
            return c0770a.a().isEmpty() ? new zh.a.b(l(R$string.ctools_neeeex_no_app_detected)) : new zh.a.C1347a(c0770a.a());
        }
        coil.util.j.a();
        return null;
    }
}