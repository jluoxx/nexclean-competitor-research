package com.neeeex.similar3p.junk;

import com.neeeex.eraser.m0;
import gq.v0;
import java.io.File;
import java.util.Collection;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.ListIterator;
import kotlinx.coroutines.e2;
import kotlinx.coroutines.f1;
import kotlinx.coroutines.l0;
import kotlinx.coroutines.p0;
import p003kotlin.jvm.functions.Function0;
import p003kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes7.dex */
public final class a0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final File f66290a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f66291b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Function0 f66292c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final x f66293d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final n f66294e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final l0 f66295f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final long f66296g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Function0 f66297h;

    public static final /* synthetic */ class a extends p003kotlin.jvm.internal.s implements Function0 {
        public static final a INSTANCE = new a();

        public a() {
            super(0, System.class, "currentTimeMillis" /* decoded XOR */, "currentTimeMillis()J" /* decoded XOR */, 0);
        }

        @Override // p003kotlin.jvm.functions.Function0
        public final Long invoke() {
            return Long.valueOf(System.currentTimeMillis());
        }
    }

    public interface b {

        public static final class a implements b {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final File f66298a;

            public a(File file) {
                "directory" /* decoded XOR */;
                file.getClass();
                this.f66298a = file;
            }

            public final File a() {
                return this.f66298a;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof a) && p003kotlin.jvm.internal.v.c(this.f66298a, ((a) obj).f66298a);
            }

            public int hashCode() {
                return this.f66298a.hashCode();
            }

            public String toString() {
                return "Descend(directory=" + this.f66298a + ")";
            }
        }

        /* JADX INFO: renamed from: com.neeeex.similar3p.junk.a0$b$b, reason: collision with other inner class name */
        public static final class C0808b implements b {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final C0808b f66299a = new C0808b();

            public boolean equals(Object obj) {
                return this == obj || (obj instanceof C0808b);
            }

            public int hashCode() {
                return 808520942;
            }

            public String toString() {
                return "Ignore" /* decoded XOR */;
            }
        }

        public static final class c implements b {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final File f66300a;

            public c(File file) {
                "candidate" /* decoded XOR */;
                file.getClass();
                this.f66300a = file;
            }

            public final File a() {
                return this.f66300a;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof c) && p003kotlin.jvm.internal.v.c(this.f66300a, ((c) obj).f66300a);
            }

            public int hashCode() {
                return this.f66300a.hashCode();
            }

            public String toString() {
                return "Record(candidate=" + this.f66300a + ")";
            }
        }
    }

    public static final class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final File f66301a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final i0 f66302b;

        public c(File file, i0 i0Var) {
            "directory" /* decoded XOR */;
            file.getClass();
            "source" /* decoded XOR */;
            i0Var.getClass();
            this.f66301a = file;
            this.f66302b = i0Var;
        }

        public final File a() {
            return this.f66301a;
        }

        public final i0 b() {
            return this.f66302b;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            return p003kotlin.jvm.internal.v.c(this.f66301a, cVar.f66301a) && this.f66302b == cVar.f66302b;
        }

        public int hashCode() {
            return (this.f66301a.hashCode() * 31) + this.f66302b.hashCode();
        }

        public String toString() {
            return "RootRequest(directory=" + this.f66301a + ", source=" + this.f66302b + ")";
        }
    }

    public static final class d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final LinkedHashMap f66303a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final HashSet f66304b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final LinkedHashSet f66305c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public String f66306d;

        public static final class a implements Comparator {
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                return jl.c.e(Long.valueOf(((b0) obj2).e()), Long.valueOf(((b0) obj).e()));
            }
        }

        public d(String str) {
            "initialPath" /* decoded XOR */;
            str.getClass();
            this.f66303a = new LinkedHashMap();
            this.f66304b = new HashSet();
            this.f66305c = new LinkedHashSet();
            this.f66306d = str;
        }

        public final void a(b0 b0Var) {
            "item" /* decoded XOR */;
            b0Var.getClass();
            if (this.f66304b.add(b0Var.d())) {
                this.f66303a.put(b0Var.d(), b0Var);
            }
        }

        public final LinkedHashSet b() {
            return this.f66305c;
        }

        public final String c() {
            return this.f66306d;
        }

        public final LinkedHashMap d() {
            return this.f66303a;
        }

        public final d0 e() {
            Collection collectionValues = this.f66303a.values();
            "<get-values>(...)" /* decoded XOR */;
            collectionValues.getClass();
            return new d0(gl.g0.V0(collectionValues, new a()));
        }

        public final void f(String str) {
            "<set-?>" /* decoded XOR */;
            str.getClass();
            this.f66306d = str;
        }
    }

    public static final class e extends ll.d {
        Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        int label;
        /* synthetic */ Object result;

        public e(kl.f<? super e> fVar) {
            super(fVar);
        }

        @Override // ll.a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return a0.this.i(null, null, null, this);
        }
    }

    public static final class f extends ll.d {
        Object L$0;
        Object L$1;
        Object L$2;
        int label;
        /* synthetic */ Object result;

        public f(kl.f<? super f> fVar) {
            super(fVar);
        }

        @Override // ll.a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return a0.this.j(null, null, this);
        }
    }

    public static final /* synthetic */ class g extends p003kotlin.jvm.internal.s implements Function1 {
        public g(Object obj) {
            super(1, obj, n.class, "canonicalOrNull" /* decoded XOR */, "canonicalOrNull(Ljava/io/File;)Ljava/io/File;" /* decoded XOR */, 0);
        }

        @Override // p003kotlin.jvm.functions.Function1
        public final File invoke(File file) {
            "p0" /* decoded XOR */;
            file.getClass();
            return ((n) this.receiver).h(file);
        }
    }

    public static final class h extends ll.m implements tl.n {
        final /* synthetic */ tl.n $onProgress;
        int I$0;
        int I$1;
        Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        Object L$4;
        Object L$5;
        Object L$6;
        Object L$7;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h(tl.n nVar, kl.f<? super h> fVar) {
            super(2, fVar);
            this.$onProgress = nVar;
        }

        @Override // ll.a
        public final kl.f<fl.m0> create(Object obj, kl.f<?> fVar) {
            return a0.this.new h(this.$onProgress, fVar);
        }

        @Override // tl.n
        public final Object invoke(p0 p0Var, kl.f<? super d0> fVar) {
            return ((h) create(p0Var, fVar)).invokeSuspend(fl.m0.f80959a);
        }

        /* JADX WARN: Code duplicated, block: B:19:0x00bf  */
        /* JADX WARN: Code duplicated, block: B:25:0x011a  */
        /* JADX WARN: Code duplicated, block: B:29:0x0119 A[SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:31:? A[LOOP:0: B:17:0x00b9->B:31:?, LOOP_END, SYNTHETIC] */
        @Override // ll.a
        public final Object invokeSuspend(Object obj) {
            com.neeeex.similar3p.f fVar;
            d dVar;
            tl.n nVar;
            d dVar2;
            a0 a0Var;
            Iterable iterable;
            Iterator it;
            com.neeeex.similar3p.f fVar2;
            int i10;
            a0 a0Var2;
            tl.n nVar2;
            d dVar3;
            c cVar;
            Object objF = p003kotlin.coroutines.intrinsics.c.f();
            int i11 = this.label;
            if (i11 == 0) {
                fl.v.b(obj);
                com.neeeex.similar3p.f fVar3 = (com.neeeex.similar3p.f) a0.this.f66292c.invoke();
                String absolutePath = a0.this.f66290a.getAbsolutePath();
                "getAbsolutePath(...)" /* decoded XOR */;
                absolutePath.getClass();
                d dVar4 = new d(absolutePath);
                a0 a0Var3 = a0.this;
                String strC = dVar4.c();
                tl.n nVar3 = this.$onProgress;
                this.L$0 = fVar3;
                this.L$1 = dVar4;
                this.label = 1;
                if (a0Var3.i(strC, dVar4, nVar3, this) != objF) {
                    fVar = fVar3;
                    dVar = dVar4;
                }
                return objF;
            }
            if (i11 == 1) {
                dVar = (d) this.L$1;
                fVar = (com.neeeex.similar3p.f) this.L$0;
                fl.v.b(obj);
            } else {
                if (i11 == 2) {
                    int i12 = this.I$0;
                    Iterator it2 = (Iterator) this.L$5;
                    tl.n nVar4 = (tl.n) this.L$4;
                    a0 a0Var4 = (a0) this.L$3;
                    Iterable iterable2 = (Iterable) this.L$2;
                    d dVar5 = (d) this.L$1;
                    com.neeeex.similar3p.f fVar4 = (com.neeeex.similar3p.f) this.L$0;
                    fl.v.b(obj);
                    i10 = i12;
                    a0Var = a0Var4;
                    dVar2 = dVar5;
                    iterable = iterable2;
                    nVar = nVar4;
                    fVar2 = fVar4;
                    it = it2;
                    while (it.hasNext()) {
                        Object next = it.next();
                        cVar = (c) next;
                        e2.i(getContext());
                        this.L$0 = fVar2;
                        this.L$1 = dVar2;
                        this.L$2 = ll.l.a(iterable);
                        this.L$3 = a0Var;
                        this.L$4 = nVar;
                        this.L$5 = it;
                        this.L$6 = ll.l.a(next);
                        this.L$7 = ll.l.a(cVar);
                        this.I$0 = i10;
                        this.I$1 = 0;
                        this.label = 2;
                        if (a0Var.p(cVar, fVar2, dVar2, nVar, this) == objF) {
                            return objF;
                        }
                    }
                    a0Var2 = a0.this;
                    nVar2 = this.$onProgress;
                    this.L$0 = ll.l.a(fVar2);
                    this.L$1 = dVar2;
                    this.L$2 = null;
                    this.L$3 = null;
                    this.L$4 = null;
                    this.L$5 = null;
                    this.L$6 = null;
                    this.L$7 = null;
                    this.label = 3;
                    if (a0Var2.j(dVar2, nVar2, this) != objF) {
                        dVar3 = dVar2;
                    }
                    return objF;
                }
                if (i11 != 3) {
                    v0.a("call to 'resume' before 'invoke' with coroutine" /* decoded XOR */);
                    return null;
                }
                dVar3 = (d) this.L$1;
                fl.v.b(obj);
            }
            e2.i(getContext());
            return dVar3.e();
            List listN = a0.this.n();
            a0 a0Var5 = a0.this;
            nVar = this.$onProgress;
            dVar2 = dVar;
            a0Var = a0Var5;
            iterable = listN;
            it = listN.iterator();
            fVar2 = fVar;
            i10 = 0;
            while (it.hasNext()) {
                Object next2 = it.next();
                cVar = (c) next2;
                e2.i(getContext());
                this.L$0 = fVar2;
                this.L$1 = dVar2;
                this.L$2 = ll.l.a(iterable);
                this.L$3 = a0Var;
                this.L$4 = nVar;
                this.L$5 = it;
                this.L$6 = ll.l.a(next2);
                this.L$7 = ll.l.a(cVar);
                this.I$0 = i10;
                this.I$1 = 0;
                this.label = 2;
                if (a0Var.p(cVar, fVar2, dVar2, nVar, this) == objF) {
                    return objF;
                }
            }
            a0Var2 = a0.this;
            nVar2 = this.$onProgress;
            this.L$0 = ll.l.a(fVar2);
            this.L$1 = dVar2;
            this.L$2 = null;
            this.L$3 = null;
            this.L$4 = null;
            this.L$5 = null;
            this.L$6 = null;
            this.L$7 = null;
            this.label = 3;
            if (a0Var2.j(dVar2, nVar2, this) != objF) {
                dVar3 = dVar2;
                e2.i(getContext());
                return dVar3.e();
            }
            return objF;
        }
    }

    public static final class i extends ll.d {
        int I$0;
        int I$1;
        long J$0;
        Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        Object L$4;
        Object L$5;
        Object L$6;
        Object L$7;
        Object L$8;
        Object L$9;
        int label;
        /* synthetic */ Object result;

        public i(kl.f<? super i> fVar) {
            super(fVar);
        }

        @Override // ll.a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return a0.this.p(null, null, null, null, this);
        }
    }

    public a0(File file, List list, Function0 function0, x xVar, n nVar, l0 l0Var, long j10, Function0 function1) {
        "sharedRoot" /* decoded XOR */;
        file.getClass();
        "appCacheRoots" /* decoded XOR */;
        list.getClass();
        "rulesProvider" /* decoded XOR */;
        function0.getClass();
        "classifier" /* decoded XOR */;
        xVar.getClass();
        "guard" /* decoded XOR */;
        nVar.getClass();
        "dispatcher" /* decoded XOR */;
        l0Var.getClass();
        "clock" /* decoded XOR */;
        function1.getClass();
        this.f66290a = file;
        this.f66291b = list;
        this.f66292c = function0;
        this.f66293d = xVar;
        this.f66294e = nVar;
        this.f66295f = l0Var;
        this.f66296g = j10;
        this.f66297h = function1;
    }

    public static String a(File file) {
        "root" /* decoded XOR */;
        file.getClass();
        return file.getPath();
    }

    public static com.neeeex.similar3p.f b() {
        return com.neeeex.similar3p.e.f66268a.a();
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object i(String str, d dVar, tl.n nVar, kl.f fVar) {
        e eVar;
        if (fVar instanceof e) {
            eVar = (e) fVar;
            int i10 = eVar.label;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                eVar.label = i10 - Integer.MIN_VALUE;
            } else {
                eVar = new e(fVar);
            }
        } else {
            eVar = new e(fVar);
        }
        Object obj = eVar.result;
        Object objF = p003kotlin.coroutines.intrinsics.c.f();
        int i11 = eVar.label;
        if (i11 == 0) {
            fl.v.b(obj);
            Collection collectionValues = dVar.d().values();
            "<get-values>(...)" /* decoded XOR */;
            collectionValues.getClass();
            d0 d0Var = new d0(gl.g0.f1(collectionValues));
            Object f0Var = new f0(str, d0Var.c(), d0Var.d(), gl.g0.k1(dVar.b()));
            eVar.L$0 = ll.l.a(str);
            eVar.L$1 = ll.l.a(dVar);
            eVar.L$2 = ll.l.a(nVar);
            eVar.L$3 = ll.l.a(d0Var);
            eVar.label = 1;
            if (nVar.invoke(f0Var, eVar) == objF) {
                return objF;
            }
        } else {
            if (i11 != 1) {
                v0.a("call to 'resume' before 'invoke' with coroutine" /* decoded XOR */);
                return null;
            }
            fl.v.b(obj);
        }
        e2.i(eVar.getContext());
        return fl.m0.f80959a;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object j(d dVar, tl.n nVar, kl.f fVar) {
        f fVar2;
        d dVar2;
        ListIterator listIterator;
        tl.n nVar2;
        if (fVar instanceof f) {
            fVar2 = (f) fVar;
            int i10 = fVar2.label;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                fVar2.label = i10 - Integer.MIN_VALUE;
            } else {
                fVar2 = new f(fVar);
            }
        } else {
            fVar2 = new f(fVar);
        }
        Object obj = fVar2.result;
        Object objF = p003kotlin.coroutines.intrinsics.c.f();
        int i11 = fVar2.label;
        if (i11 == 0) {
            fl.v.b(obj);
            dVar2 = dVar;
            listIterator = c0.f66319a.a().listIterator();
            nVar2 = nVar;
        } else {
            if (i11 != 1) {
                v0.a("call to 'resume' before 'invoke' with coroutine" /* decoded XOR */);
                return null;
            }
            listIterator = (ListIterator) fVar2.L$2;
            tl.n nVar3 = (tl.n) fVar2.L$1;
            d dVar3 = (d) fVar2.L$0;
            fl.v.b(obj);
            nVar2 = nVar3;
            dVar2 = dVar3;
        }
        while (listIterator.hasNext()) {
            e2.i(fVar2.getContext());
            dVar2.b().add(listIterator.next());
            String strC = listIterator.hasNext() ? dVar2.c() : "";
            fVar2.L$0 = dVar2;
            fVar2.L$1 = nVar2;
            fVar2.L$2 = listIterator;
            fVar2.label = 1;
            if (i(strC, dVar2, nVar2, fVar2) == objF) {
                return objF;
            }
        }
        return fl.m0.f80959a;
    }

    public final b k(File file, i0 i0Var) {
        Object objM372constructorimpl;
        if (file.isFile()) {
            return new b.c(file);
        }
        if (!file.isDirectory()) {
            return b.C0808b.f66299a;
        }
        if (i0Var == i0.SHARED && l(file)) {
            return b.C0808b.f66299a;
        }
        try {
            fl.u.a aVar = fl.u.Companion;
            objM372constructorimpl = fl.u.m372constructorimpl(file.listFiles());
        } catch (Throwable th2) {
            fl.u.a aVar2 = fl.u.Companion;
            objM372constructorimpl = fl.u.m372constructorimpl(fl.v.a(th2));
        }
        if (fl.u.m377isFailureimpl(objM372constructorimpl)) {
            objM372constructorimpl = null;
        }
        File[] fileArr = (File[]) objM372constructorimpl;
        if (fileArr != null) {
            return fileArr.length == 0 ? new b.c(file) : new b.a(file);
        }
        return b.C0808b.f66299a;
    }

    public final boolean l(File file) {
        String path;
        File fileH = this.f66294e.h(file);
        if (fileH != null && (path = fileH.getPath()) != null) {
            Iterator it = to.v.K(to.v.M(gl.g0.b0(this.f66291b), new g(this.f66294e)), new Function1() { // from class: com.neeeex.similar3p.junk.z
                @Override // p003kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return a0.a((File) obj);
                }
            }).iterator();
            while (it.hasNext()) {
                if (path.equals(it.next())) {
                    return true;
                }
            }
        }
        return false;
    }

    public final void m(File file, i0 i0Var, com.neeeex.similar3p.f fVar, d dVar) {
        Object objM372constructorimpl;
        com.neeeex.similar3p.junk.a aVarK = this.f66293d.k(file, i0Var, fVar);
        if (aVarK == null) {
            return;
        }
        try {
            fl.u.a aVar = fl.u.Companion;
            objM372constructorimpl = fl.u.m372constructorimpl(b0.f66309g.a(file, aVarK));
        } catch (Throwable th2) {
            fl.u.a aVar2 = fl.u.Companion;
            objM372constructorimpl = fl.u.m372constructorimpl(fl.v.a(th2));
        }
        if (fl.u.m377isFailureimpl(objM372constructorimpl)) {
            objM372constructorimpl = null;
        }
        b0 b0Var = (b0) objM372constructorimpl;
        if (b0Var == null) {
            return;
        }
        dVar.a(b0Var);
    }

    public final List n() {
        List listD = gl.v.d(this.f66291b.size() + 1);
        listD.add(new c(this.f66290a, i0.SHARED));
        List list = listD;
        Iterator it = this.f66291b.iterator();
        while (it.hasNext()) {
            list.add(new c((File) it.next(), i0.APP_CACHE));
        }
        return gl.v.a(listD);
    }

    public final Object o(tl.n nVar, kl.f fVar) {
        return kotlinx.coroutines.i.g(this.f66295f, new h(nVar, null), fVar);
    }

    /* JADX WARN: Code duplicated, block: B:37:0x00e8  */
    /* JADX WARN: Code duplicated, block: B:39:0x00fc  */
    /* JADX WARN: Code duplicated, block: B:41:0x0121  */
    /* JADX WARN: Code duplicated, block: B:43:0x0125  */
    /* JADX WARN: Code duplicated, block: B:44:0x012f  */
    /* JADX WARN: Code duplicated, block: B:46:0x0133  */
    /* JADX WARN: Code duplicated, block: B:47:0x0141  */
    /* JADX WARN: Code duplicated, block: B:51:0x0157  */
    /* JADX WARN: Code duplicated, block: B:55:0x0171  */
    /* JADX WARN: Code duplicated, block: B:58:0x01b8 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:59:0x01b9  */
    /* JADX WARN: Code duplicated, block: B:61:0x01d1  */
    /* JADX WARN: Code duplicated, block: B:64:0x01ea  */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:35:0x00d8 -> B:36:0x00e6). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:59:0x01b9 -> B:60:0x01c6). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:62:0x01da -> B:63:0x01e1). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:59:0x01b9
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public final java.lang.Object p(com.neeeex.similar3p.junk.a0.c r23, com.neeeex.similar3p.f r24, com.neeeex.similar3p.junk.a0.d r25, tl.n r26, kl.f r27) {
        /*
            Method dump skipped, instruction units count: 511
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.neeeex.similar3p.junk.a0.p(com.neeeex.similar3p.junk.a0$c, com.neeeex.similar3p.f, com.neeeex.similar3p.junk.a0$d, tl.n, kl.f):java.lang.Object");
    }

    public /* synthetic */ a0(File file, List list, Function0 function0, x xVar, n nVar, l0 l0Var, long j10, Function0 function1, int i10, p003kotlin.jvm.internal.m mVar) {
        this(file, list, (i10 & 4) != 0 ? new Function0() { // from class: com.neeeex.similar3p.junk.y
            @Override // p003kotlin.jvm.functions.Function0
            public final Object invoke() {
                return a0.b();
            }
        } : function0, (i10 & 8) != 0 ? new x() : xVar, (i10 & 16) != 0 ? new n(file, list) : nVar, (i10 & 32) != 0 ? f1.b() : l0Var, (i10 & 64) != 0 ? 100L : j10, (i10 & 128) != 0 ? a.INSTANCE : function1);
    }
}