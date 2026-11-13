package com.neeeex.eraser;

import android.app.Application;
import android.content.Context;
import android.os.Environment;
import androidx.fragment.app.FragmentActivity;
import androidx.p002lifecycle.AndroidViewModel;
import androidx.p002lifecycle.MutableLiveData;
import androidx.p002lifecycle.ViewModelKt;
import gq.v0;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.f1;
import kotlinx.coroutines.p0;
import kotlinx.coroutines.q0;
import p003kotlin.jvm.functions.Function0;
import p003kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes7.dex */
public final class h0 extends AndroidViewModel {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Application f65063a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ii.e f65064b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final MutableLiveData f65065c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final MutableLiveData f65066d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final MutableLiveData f65067e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final MutableLiveData f65068f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final MutableLiveData f65069g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final MutableLiveData f65070h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public Job f65071i;

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Function0 f65072a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Function0 f65073b;

        public a(Function0 function0, Function0 function1) {
            "action" /* decoded XOR */;
            function0.getClass();
            this.f65072a = function0;
            this.f65073b = function1;
        }

        public final Function0 a() {
            return this.f65072a;
        }

        public final Function0 b() {
            return this.f65073b;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return p003kotlin.jvm.internal.v.c(this.f65072a, aVar.f65072a) && p003kotlin.jvm.internal.v.c(this.f65073b, aVar.f65073b);
        }

        public int hashCode() {
            int iHashCode = this.f65072a.hashCode() * 31;
            Function0 function0 = this.f65073b;
            return iHashCode + (function0 == null ? 0 : function0.hashCode());
        }

        public String toString() {
            return "FileMutation(action=" + this.f65072a + ", afterSuccess=" + this.f65073b + ")";
        }
    }

    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f65074a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Set f65075b;

        public b(int i10, Set set) {
            "paths" /* decoded XOR */;
            set.getClass();
            this.f65074a = i10;
            this.f65075b = set;
        }

        public static boolean a(b bVar, ii.c cVar) {
            "it" /* decoded XOR */;
            cVar.getClass();
            return bVar.f65075b.contains(cVar.h());
        }

        public static boolean b(b bVar, ii.c cVar) {
            "it" /* decoded XOR */;
            cVar.getClass();
            return bVar.f65075b.contains(cVar.h());
        }

        public static boolean c(ii.b bVar) {
            "it" /* decoded XOR */;
            bVar.getClass();
            return bVar.b().isEmpty();
        }

        public final void d(List list) {
            List listB;
            List listB2;
            "folders" /* decoded XOR */;
            list.getClass();
            ii.b bVar = (ii.b) gl.g0.r0(list);
            if (bVar != null && (listB2 = bVar.b()) != null) {
                gl.b0.J(listB2, new Function1() { // from class: com.neeeex.eraser.i0
                    @Override // p003kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return Boolean.valueOf(h0.b.a(this.f65082a, (ii.c) obj));
                    }
                });
            }
            ii.b bVar2 = (ii.b) gl.g0.s0(list, this.f65074a);
            if (bVar2 != null && (listB = bVar2.b()) != null) {
                gl.b0.J(listB, new Function1() { // from class: com.neeeex.eraser.j0
                    @Override // p003kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return Boolean.valueOf(h0.b.b(this.f65083a, (ii.c) obj));
                    }
                });
            }
            gl.b0.J(list, new Function1() { // from class: com.neeeex.eraser.k0
                @Override // p003kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return Boolean.valueOf(h0.b.c((ii.b) obj));
                }
            });
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return this.f65074a == bVar.f65074a && p003kotlin.jvm.internal.v.c(this.f65075b, bVar.f65075b);
        }

        public int hashCode() {
            return (Integer.hashCode(this.f65074a) * 31) + this.f65075b.hashCode();
        }

        public String toString() {
            return "FolderPruneRequest(selectedFolder=" + this.f65074a + ", paths=" + this.f65075b + ")";
        }
    }

    public static final class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final fl.t f65076a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final fl.t f65077b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final fl.t f65078c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final fl.t f65079d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final fl.t f65080e;

        public c(fl.t tVar, fl.t tVar2, fl.t tVar3, fl.t tVar4, fl.t tVar5) {
            "photos" /* decoded XOR */;
            tVar.getClass();
            "videos" /* decoded XOR */;
            tVar2.getClass();
            "audio" /* decoded XOR */;
            tVar3.getClass();
            "documents" /* decoded XOR */;
            tVar4.getClass();
            "others" /* decoded XOR */;
            tVar5.getClass();
            this.f65076a = tVar;
            this.f65077b = tVar2;
            this.f65078c = tVar3;
            this.f65079d = tVar4;
            this.f65080e = tVar5;
        }

        public final fl.t a() {
            return this.f65078c;
        }

        public final fl.t b() {
            return this.f65079d;
        }

        public final fl.t c() {
            return this.f65080e;
        }

        public final fl.t d() {
            return this.f65076a;
        }

        public final fl.t e() {
            return this.f65077b;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            return p003kotlin.jvm.internal.v.c(this.f65076a, cVar.f65076a) && p003kotlin.jvm.internal.v.c(this.f65077b, cVar.f65077b) && p003kotlin.jvm.internal.v.c(this.f65078c, cVar.f65078c) && p003kotlin.jvm.internal.v.c(this.f65079d, cVar.f65079d) && p003kotlin.jvm.internal.v.c(this.f65080e, cVar.f65080e);
        }

        public int hashCode() {
            return (((((((this.f65076a.hashCode() * 31) + this.f65077b.hashCode()) * 31) + this.f65078c.hashCode()) * 31) + this.f65079d.hashCode()) * 31) + this.f65080e.hashCode();
        }

        public String toString() {
            return "ScanCounters(photos=" + this.f65076a + ", videos=" + this.f65077b + ", audio=" + this.f65078c + ", documents=" + this.f65079d + ", others=" + this.f65080e + ")";
        }
    }

    public static final class d extends ll.m implements tl.n {
        final /* synthetic */ a $mutation;
        int label;
        final /* synthetic */ h0 this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(a aVar, h0 h0Var, kl.f<? super d> fVar) {
            super(2, fVar);
            this.$mutation = aVar;
            this.this$0 = h0Var;
        }

        @Override // ll.a
        public final kl.f<fl.m0> create(Object obj, kl.f<?> fVar) {
            return new d(this.$mutation, this.this$0, fVar);
        }

        @Override // tl.n
        public final Object invoke(p0 p0Var, kl.f<? super fl.m0> fVar) {
            return ((d) create(p0Var, fVar)).invokeSuspend(fl.m0.f80959a);
        }

        @Override // ll.a
        public final Object invokeSuspend(Object obj) {
            Object objM372constructorimpl;
            p003kotlin.coroutines.intrinsics.c.f();
            if (this.label != 0) {
                v0.a("call to 'resume' before 'invoke' with coroutine" /* decoded XOR */);
                return null;
            }
            fl.v.b(obj);
            Function0 function0A = this.$mutation.a();
            try {
                fl.u.a aVar = fl.u.Companion;
                objM372constructorimpl = fl.u.m372constructorimpl(function0A.invoke());
            } catch (Throwable th2) {
                fl.u.a aVar2 = fl.u.Companion;
                objM372constructorimpl = fl.u.m372constructorimpl(fl.v.a(th2));
            }
            a aVar3 = this.$mutation;
            if (fl.u.m378isSuccessimpl(objM372constructorimpl)) {
                Function0 function0B = aVar3.b();
                if (function0B != null) {
                    function0B.invoke();
                }
            }
            Throwable thM375exceptionOrNullimpl = fl.u.m375exceptionOrNullimpl(objM372constructorimpl);
            if (thM375exceptionOrNullimpl != null) {
                thM375exceptionOrNullimpl.printStackTrace();
            }
            this.this$0.A().postValue(ll.b.a(true));
            return fl.m0.f80959a;
        }
    }

    public static final class e extends ll.m implements tl.n {
        final /* synthetic */ Context $context;
        final /* synthetic */ int $type;
        private /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(Context context, int i10, kl.f<? super e> fVar) {
            super(2, fVar);
            this.$context = context;
            this.$type = i10;
        }

        @Override // ll.a
        public final kl.f<fl.m0> create(Object obj, kl.f<?> fVar) {
            e eVar = h0.this.new e(this.$context, this.$type, fVar);
            eVar.L$0 = obj;
            return eVar;
        }

        @Override // tl.n
        public final Object invoke(p0 p0Var, kl.f<? super fl.m0> fVar) {
            return ((e) create(p0Var, fVar)).invokeSuspend(fl.m0.f80959a);
        }

        @Override // ll.a
        public final Object invokeSuspend(Object obj) {
            p0 p0Var = (p0) this.L$0;
            p003kotlin.coroutines.intrinsics.c.f();
            if (this.label != 0) {
                v0.a("call to 'resume' before 'invoke' with coroutine" /* decoded XOR */);
                return null;
            }
            fl.v.b(obj);
            h0.this.f65064b.o();
            h0 h0Var = h0.this;
            Context applicationContext = this.$context.getApplicationContext();
            "getApplicationContext(...)" /* decoded XOR */;
            applicationContext.getClass();
            List listK = h0Var.K(applicationContext, this.$type, new File(Environment.getExternalStorageDirectory().getPath()), false);
            if (!q0.g(p0Var)) {
                return fl.m0.f80959a;
            }
            h0 h0Var2 = h0.this;
            h0Var2.v(h0Var2.u());
            h0.this.B().postValue(h0.this.G(this.$context, listK));
            com.neeeex.eraser.ads.e.b0().z0();
            return fl.m0.f80959a;
        }
    }

    public static final class f extends ll.m implements tl.n {
        final /* synthetic */ Context $context;
        final /* synthetic */ MutableLiveData<CopyOnWriteArrayList<ii.c>> $fileBeanListLiveData;
        final /* synthetic */ int $type;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(Context context, int i10, MutableLiveData<CopyOnWriteArrayList<ii.c>> mutableLiveData, kl.f<? super f> fVar) {
            super(2, fVar);
            this.$context = context;
            this.$type = i10;
            this.$fileBeanListLiveData = mutableLiveData;
        }

        @Override // ll.a
        public final kl.f<fl.m0> create(Object obj, kl.f<?> fVar) {
            return h0.this.new f(this.$context, this.$type, this.$fileBeanListLiveData, fVar);
        }

        @Override // tl.n
        public final Object invoke(p0 p0Var, kl.f<? super fl.m0> fVar) {
            return ((f) create(p0Var, fVar)).invokeSuspend(fl.m0.f80959a);
        }

        @Override // ll.a
        public final Object invokeSuspend(Object obj) {
            p003kotlin.coroutines.intrinsics.c.f();
            if (this.label != 0) {
                v0.a("call to 'resume' before 'invoke' with coroutine" /* decoded XOR */);
                return null;
            }
            fl.v.b(obj);
            h0 h0Var = h0.this;
            Context applicationContext = this.$context.getApplicationContext();
            "getApplicationContext(...)" /* decoded XOR */;
            applicationContext.getClass();
            CopyOnWriteArrayList<ii.c> copyOnWriteArrayList = new CopyOnWriteArrayList<>(h0Var.K(applicationContext, this.$type, new File(h0.this.J(this.$type)), true));
            this.$fileBeanListLiveData.postValue(copyOnWriteArrayList);
            h0.this.t(this.$type, copyOnWriteArrayList);
            return fl.m0.f80959a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h0(Application application) {
        super(application);
        "application" /* decoded XOR */;
        application.getClass();
        this.f65063a = application;
        ii.e eVar = new ii.e();
        this.f65064b = eVar;
        this.f65065c = eVar.f();
        this.f65066d = new MutableLiveData();
        this.f65067e = new MutableLiveData();
        this.f65068f = new MutableLiveData();
        this.f65069g = new MutableLiveData();
        this.f65070h = new MutableLiveData();
    }

    public static fl.m0 d(CopyOnWriteArrayList copyOnWriteArrayList) {
        "value" /* decoded XOR */;
        copyOnWriteArrayList.getClass();
        hi.b.f83500a.d(copyOnWriteArrayList);
        return fl.m0.f80959a;
    }

    public static fl.m0 e(h0 h0Var, int i10, List list) {
        h0Var.H(i10, list);
        h0Var.F(list.size());
        return fl.m0.f80959a;
    }

    public static fl.m0 f(FragmentActivity fragmentActivity, List list, boolean z10) {
        ii.j.f84622a.g(fragmentActivity, list, z10);
        return fl.m0.f80959a;
    }

    public static fl.m0 g(CopyOnWriteArrayList copyOnWriteArrayList) {
        "value" /* decoded XOR */;
        copyOnWriteArrayList.getClass();
        hi.b.f83500a.b(copyOnWriteArrayList);
        return fl.m0.f80959a;
    }

    public static fl.m0 h(FragmentActivity fragmentActivity, List list, boolean z10) {
        ii.j.f84622a.s(fragmentActivity, list, z10);
        return fl.m0.f80959a;
    }

    public static fl.m0 i(h0 h0Var, int i10, List list) {
        h0Var.H(i10, list);
        return fl.m0.f80959a;
    }

    public static fl.m0 j(FragmentActivity fragmentActivity, List list, boolean z10) {
        ii.j.f84622a.g(fragmentActivity, list, z10);
        return fl.m0.f80959a;
    }

    public static fl.m0 k(CopyOnWriteArrayList copyOnWriteArrayList) {
        "value" /* decoded XOR */;
        copyOnWriteArrayList.getClass();
        hi.b.f83500a.c(copyOnWriteArrayList);
        return fl.m0.f80959a;
    }

    public final MutableLiveData A() {
        return this.f65067e;
    }

    public final MutableLiveData B() {
        return this.f65066d;
    }

    public final MutableLiveData C() {
        return this.f65068f;
    }

    public final MutableLiveData D() {
        return this.f65069g;
    }

    public final MutableLiveData E() {
        return this.f65070h;
    }

    public final void F(int i10) {
        com.neeeex.eraser.utils.b0 b0Var = com.neeeex.eraser.utils.b0.f66131a;
        b0Var.B("sp_neeeex_recovered_files_count" /* decoded XOR */, b0Var.u("sp_neeeex_recovered_files_count" /* decoded XOR */, 0) + i10);
    }

    public final List G(Context context, List list) {
        if (list.isEmpty()) {
            return new ArrayList();
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            ii.c cVar = (ii.c) it.next();
            String strK = ii.j.f84622a.k(cVar.h());
            Object arrayList = linkedHashMap.get(strK);
            if (arrayList == null) {
                arrayList = new ArrayList();
                linkedHashMap.put(strK, arrayList);
            }
            ((List) arrayList).add(cVar);
        }
        ArrayList arrayList2 = new ArrayList(linkedHashMap.size() + 1);
        String string = context.getString(R$string.common_neeeex_all);
        "getString(...)" /* decoded XOR */;
        string.getClass();
        arrayList2.add(new ii.b(string, list));
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            arrayList2.add(new ii.b((String) entry.getKey(), (List) entry.getValue()));
        }
        return arrayList2;
    }

    public final void H(int i10, List list) {
        try {
            fl.u.a aVar = fl.u.Companion;
            List list2 = (List) this.f65066d.getValue();
            if (list2 != null) {
                new b(i10, gl.g0.d1(list)).d(list2);
                this.f65066d.postValue(list2);
                this.f65068f.postValue(Boolean.TRUE);
            }
            fl.u.m372constructorimpl(fl.m0.f80959a);
        } catch (Throwable th2) {
            fl.u.a aVar2 = fl.u.Companion;
            fl.u.m372constructorimpl(fl.v.a(th2));
        }
    }

    public final void I(final FragmentActivity fragmentActivity, final int i10, final List list, final boolean z10) {
        "activity" /* decoded XOR */;
        fragmentActivity.getClass();
        "fileList" /* decoded XOR */;
        list.getClass();
        y(new a(new Function0() { // from class: com.neeeex.eraser.f0
            @Override // p003kotlin.jvm.functions.Function0
            public final Object invoke() {
                return h0.h(fragmentActivity, list, z10);
            }
        }, new Function0() { // from class: com.neeeex.eraser.g0
            @Override // p003kotlin.jvm.functions.Function0
            public final Object invoke() {
                return h0.e(this.f65057a, i10, list);
            }
        }));
    }

    public final String J(int i10) {
        return i10 == 3 ? ii.j.f84622a.m() : ii.j.f84622a.n();
    }

    public final List K(Context context, int i10, File file, boolean z10) {
        ArrayList arrayList = new ArrayList();
        this.f65064b.d(context, i10, arrayList, file, z10);
        return arrayList;
    }

    public final void L(Context context, int i10) {
        "context" /* decoded XOR */;
        context.getClass();
        this.f65071i = kotlinx.coroutines.k.d(ViewModelKt.getViewModelScope(this), f1.b(), null, new e(context, i10, null), 2, null);
    }

    public final void M(int i10, MutableLiveData mutableLiveData, Context context) {
        "fileBeanListLiveData" /* decoded XOR */;
        mutableLiveData.getClass();
        "context" /* decoded XOR */;
        context.getClass();
        kotlinx.coroutines.k.d(ViewModelKt.getViewModelScope(this), f1.b(), null, new f(context, i10, mutableLiveData, null), 2, null);
    }

    public final void N() {
        Job job = this.f65071i;
        if (job != null) {
            Job.a.a(job, null, 1, null);
        }
    }

    public final fl.t s(ii.a aVar) {
        return new fl.t(Long.valueOf(aVar.c()), Long.valueOf(aVar.d()));
    }

    public final void t(int i10, CopyOnWriteArrayList copyOnWriteArrayList) {
        Function1 function1;
        if (i10 == 0) {
            function1 = new Function1() { // from class: com.neeeex.eraser.a0
                @Override // p003kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return h0.d((CopyOnWriteArrayList) obj);
                }
            };
        } else if (i10 != 2) {
            function1 = i10 != 3 ? null : new Function1() { // from class: com.neeeex.eraser.z
                @Override // p003kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return h0.g((CopyOnWriteArrayList) obj);
                }
            };
        } else {
            function1 = new Function1() { // from class: com.neeeex.eraser.b0
                @Override // p003kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return h0.k((CopyOnWriteArrayList) obj);
                }
            };
        }
        if (function1 != null) {
            function1.invoke(copyOnWriteArrayList);
        }
    }

    public final c u() {
        return new c(s(this.f65064b.j()), s(this.f65064b.k()), s(this.f65064b.e()), s(this.f65064b.g()), s(this.f65064b.i()));
    }

    public final void v(c cVar) {
        hi.a aVar = hi.a.f83493a;
        aVar.e(cVar.d());
        aVar.f(cVar.e());
        aVar.b(cVar.a());
        aVar.c(cVar.b());
        aVar.d(cVar.c());
    }

    public final void w(final FragmentActivity fragmentActivity, final int i10, final List list, final boolean z10) {
        "activity" /* decoded XOR */;
        fragmentActivity.getClass();
        "fileList" /* decoded XOR */;
        list.getClass();
        y(new a(new Function0() { // from class: com.neeeex.eraser.c0
            @Override // p003kotlin.jvm.functions.Function0
            public final Object invoke() {
                return h0.f(fragmentActivity, list, z10);
            }
        }, new Function0() { // from class: com.neeeex.eraser.d0
            @Override // p003kotlin.jvm.functions.Function0
            public final Object invoke() {
                return h0.i(this.f65042a, i10, list);
            }
        }));
    }

    public final void x(final FragmentActivity fragmentActivity, final List list, final boolean z10) {
        "activity" /* decoded XOR */;
        fragmentActivity.getClass();
        "fileList" /* decoded XOR */;
        list.getClass();
        y(new a(new Function0() { // from class: com.neeeex.eraser.e0
            @Override // p003kotlin.jvm.functions.Function0
            public final Object invoke() {
                return h0.j(fragmentActivity, list, z10);
            }
        }, null));
    }

    public final void y(a aVar) {
        kotlinx.coroutines.k.d(ViewModelKt.getViewModelScope(this), f1.b(), null, new d(aVar, this, null), 2, null);
    }

    public final MutableLiveData z() {
        return this.f65065c;
    }
}