package com.neeeex.similar3p.junk;

import com.neeeex.eraser.m0;
import gq.v0;
import java.io.File;
import java.util.List;
import kotlinx.coroutines.f1;
import kotlinx.coroutines.l0;
import kotlinx.coroutines.p0;
import p003kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes7.dex */
public final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final n f66333a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final l0 f66334b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Function1 f66335c;

    public interface a {

        /* JADX INFO: renamed from: com.neeeex.similar3p.junk.f$a$a, reason: collision with other inner class name */
        public static final class C0810a implements a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final C0810a f66336a = new C0810a();

            public boolean equals(Object obj) {
                return this == obj || (obj instanceof C0810a);
            }

            public int hashCode() {
                return -1340796214;
            }

            public String toString() {
                return "Failed" /* decoded XOR */;
            }
        }

        public static final class b implements a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final long f66337a;

            public b(long j10) {
                this.f66337a = j10;
            }

            public final long a() {
                return this.f66337a;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof b) && this.f66337a == ((b) obj).f66337a;
            }

            public int hashCode() {
                return Long.hashCode(this.f66337a);
            }

            public String toString() {
                return "Removed(bytes=" + this.f66337a + ")";
            }
        }

        public static final class c implements a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final c f66338a = new c();

            public boolean equals(Object obj) {
                return this == obj || (obj instanceof c);
            }

            public int hashCode() {
                return 324057667;
            }

            public String toString() {
                return "Skipped" /* decoded XOR */;
            }
        }
    }

    public static final class b extends ll.m implements tl.n {
        int label;

        public b(kl.f<? super b> fVar) {
            super(2, fVar);
        }

        @Override // ll.a
        public final kl.f<fl.m0> create(Object obj, kl.f<?> fVar) {
            return new b(fVar);
        }

        @Override // tl.n
        public final Object invoke(com.neeeex.similar3p.junk.c cVar, kl.f<? super fl.m0> fVar) {
            return ((b) create(cVar, fVar)).invokeSuspend(fl.m0.f80959a);
        }

        @Override // ll.a
        public final Object invokeSuspend(Object obj) {
            p003kotlin.coroutines.intrinsics.c.f();
            if (this.label == 0) {
                fl.v.b(obj);
                return fl.m0.f80959a;
            }
            v0.a("call to 'resume' before 'invoke' with coroutine" /* decoded XOR */);
            return null;
        }
    }

    public static final class c extends ll.m implements tl.n {
        final /* synthetic */ List<b0> $items;
        final /* synthetic */ tl.n $onProgress;
        int I$0;
        int I$1;
        Object L$0;
        Object L$1;
        Object L$10;
        Object L$11;
        Object L$2;
        Object L$3;
        Object L$4;
        Object L$5;
        Object L$6;
        Object L$7;
        Object L$8;
        Object L$9;
        int label;
        final /* synthetic */ f this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(List<b0> list, f fVar, tl.n nVar, kl.f<? super c> fVar2) {
            super(2, fVar2);
            this.$items = list;
            this.this$0 = fVar;
            this.$onProgress = nVar;
        }

        @Override // ll.a
        public final kl.f<fl.m0> create(Object obj, kl.f<?> fVar) {
            return new c(this.$items, this.this$0, this.$onProgress, fVar);
        }

        @Override // tl.n
        public final Object invoke(p0 p0Var, kl.f<? super d> fVar) {
            return ((c) create(p0Var, fVar)).invokeSuspend(fl.m0.f80959a);
        }

        /* JADX WARN: Code duplicated, block: B:11:0x007e  */
        /* JADX WARN: Code duplicated, block: B:13:0x00f6 A[RETURN] */
        /* JADX WARN: Code duplicated, block: B:14:0x00f7  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:14:0x00f7 -> B:15:0x00f9). Please report as a decompilation issue!!! */
        /*  JADX ERROR: StackOverflowError in pass: RegionMakerVisitor
            java.lang.StackOverflowError
            	at jadx.core.utils.BlockUtils.traverseSuccessorsUntil(BlockUtils.java:731)
            	at jadx.core.utils.BlockUtils.traverseSuccessorsUntil(BlockUtils.java:749)
            */
        @Override // ll.a
        public final java.lang.Object invokeSuspend(java.lang.Object r19) {
            /*
                Method dump skipped, instruction units count: 263
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: com.neeeex.similar3p.junk.f.c.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    public f(n nVar, l0 l0Var, Function1 function1) {
        "guard" /* decoded XOR */;
        nVar.getClass();
        "dispatcher" /* decoded XOR */;
        l0Var.getClass();
        "deleteTarget" /* decoded XOR */;
        function1.getClass();
        this.f66333a = nVar;
        this.f66334b = l0Var;
        this.f66335c = function1;
    }

    public static boolean a(File file) {
        "target" /* decoded XOR */;
        file.getClass();
        return file.delete();
    }

    public static /* synthetic */ Object f(f fVar, List list, tl.n nVar, kl.f fVar2, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            nVar = new b(null);
        }
        return fVar.e(list, nVar, fVar2);
    }

    public final a d(b0 b0Var) {
        Object objM372constructorimpl;
        File fileJ = this.f66333a.j(b0Var);
        if (fileJ != null) {
            try {
                fl.u.a aVar = fl.u.Companion;
                Boolean bool = (Boolean) this.f66335c.invoke(fileJ);
                bool.booleanValue();
                objM372constructorimpl = fl.u.m372constructorimpl(bool);
            } catch (Throwable th2) {
                fl.u.a aVar2 = fl.u.Companion;
                objM372constructorimpl = fl.u.m372constructorimpl(fl.v.a(th2));
            }
            a bVar = (fl.u.m375exceptionOrNullimpl(objM372constructorimpl) == null && ((Boolean) objM372constructorimpl).booleanValue()) ? new a.b(b0Var.e()) : a.C0810a.f66336a;
            if (bVar != null) {
                return bVar;
            }
        }
        return a.c.f66338a;
    }

    public final Object e(List list, tl.n nVar, kl.f fVar) {
        return kotlinx.coroutines.i.g(this.f66334b, new c(list, this, nVar, null), fVar);
    }

    public final d g(d dVar, a aVar) {
        if (aVar instanceof a.b) {
            return d.b(dVar, dVar.f() + 1, ((a.b) aVar).a() + dVar.e(), 0, 0, 12, null);
        }
        if (p003kotlin.jvm.internal.v.c(aVar, a.C0810a.f66336a)) {
            return d.b(dVar, 0, 0L, dVar.c() + 1, 0, 11, null);
        }
        if (p003kotlin.jvm.internal.v.c(aVar, a.c.f66338a)) {
            return d.b(dVar, 0, 0L, 0, dVar.d() + 1, 7, null);
        }
        coil.util.j.a();
        return null;
    }

    public /* synthetic */ f(n nVar, l0 l0Var, Function1 function1, int i10, p003kotlin.jvm.internal.m mVar) {
        this(nVar, (i10 & 2) != 0 ? f1.b() : l0Var, (i10 & 4) != 0 ? new Function1() { // from class: com.neeeex.similar3p.junk.e
            @Override // p003kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return Boolean.valueOf(f.a((File) obj));
            }
        } : function1);
    }
}