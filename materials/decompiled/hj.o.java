package hj;

import java.util.List;

/* JADX INFO: loaded from: classes7.dex */
public final class o implements n1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ s0 f83644a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ List f83645b;

    public static final class a extends ll.m implements tl.n {
        public final /* synthetic */ s0 OooO00o;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(s0 s0Var, kl.f fVar) {
            super(2, fVar);
            this.OooO00o = s0Var;
        }

        @Override // tl.n
        /* JADX INFO: renamed from: OooO00o, reason: merged with bridge method [inline-methods] */
        public final Object invoke(kotlinx.coroutines.p0 p0Var, kl.f<? super fl.m0> fVar) {
            return new a(this.OooO00o, fVar).invokeSuspend(fl.m0.f80959a);
        }

        @Override // ll.a
        public final kl.f<fl.m0> create(Object obj, kl.f<?> fVar) {
            return new a(this.OooO00o, fVar);
        }

        @Override // ll.a
        public final Object invokeSuspend(Object obj) {
            p003kotlin.coroutines.intrinsics.c.f();
            fl.v.b(obj);
            this.OooO00o.o(true, true, false);
            return fl.m0.f80959a;
        }
    }

    public static final class b extends ll.m implements tl.n {
        public final /* synthetic */ s0 OooO00o;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(s0 s0Var, kl.f fVar) {
            super(2, fVar);
            this.OooO00o = s0Var;
        }

        @Override // tl.n
        /* JADX INFO: renamed from: OooO00o, reason: merged with bridge method [inline-methods] */
        public final Object invoke(kotlinx.coroutines.p0 p0Var, kl.f<? super fl.m0> fVar) {
            return new b(this.OooO00o, fVar).invokeSuspend(fl.m0.f80959a);
        }

        @Override // ll.a
        public final kl.f<fl.m0> create(Object obj, kl.f<?> fVar) {
            return new b(this.OooO00o, fVar);
        }

        @Override // ll.a
        public final Object invokeSuspend(Object obj) {
            p003kotlin.coroutines.intrinsics.c.f();
            fl.v.b(obj);
            this.OooO00o.o(true, true, false);
            return fl.m0.f80959a;
        }
    }

    public o(s0 s0Var, List list) {
        this.f83644a = s0Var;
        this.f83645b = list;
    }

    @Override // hj.n1
    public final void a(k kVar, kj.d dVar) {
        s0 s0Var = this.f83644a;
        if (s0Var.f83677d && s0Var.f83678e && dVar != null && dVar.b() == 30) {
            kotlinx.coroutines.k.d(kotlinx.coroutines.v1.f87249a, kotlinx.coroutines.f1.c(), null, new b(this.f83644a, null), 2, null);
        }
    }

    @Override // hj.n1
    public final void b(k kVar, kj.d dVar) {
        s0 s0Var = this.f83644a;
        v0 v0Var = s0Var.f83675b;
        String str = s0Var.f83674a;
        kVar.getClass();
        v0Var.d(str, kVar);
    }

    @Override // hj.n1
    public final void c(k kVar, kj.d dVar) {
        s0.j(this.f83644a, kVar, dVar);
    }

    @Override // hj.n1
    public final void d(k kVar, kj.d dVar, int i10, String str) {
        s0 s0Var = this.f83644a;
        if (s0Var.f83677d && s0Var.f83678e && dVar != null && dVar.b() == 30) {
            kotlinx.coroutines.k.d(kotlinx.coroutines.v1.f87249a, kotlinx.coroutines.f1.c(), null, new a(this.f83644a, null), 2, null);
        }
    }

    @Override // hj.n1
    public final void e(k kVar, kj.e eVar) {
        if (eVar == null || eVar.b() != 3 || eVar.j()) {
            return;
        }
        this.f83644a.getClass();
    }

    @Override // hj.n1
    public final void f(k kVar, kj.d dVar, int i10, String str) {
        kj.e eVar = kVar.f83602a;
        if (eVar != null && eVar.b() == 3 && !eVar.j()) {
            this.f83644a.getClass();
        }
        s0 s0Var = this.f83644a;
        List list = this.f83645b;
        if (str == null) {
            str = "";
        }
        s0.k(s0Var, kVar, dVar, list, i10, str);
    }
}