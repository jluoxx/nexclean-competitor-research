package hj;

/* JADX INFO: loaded from: classes7.dex */
public final class y2 implements u2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ q2 f83776a;

    public static final class a extends ll.m implements tl.n {
        public final /* synthetic */ q2 OooO00o;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(q2 q2Var, kl.f fVar) {
            super(2, fVar);
            this.OooO00o = q2Var;
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
            this.OooO00o.destroy();
            return fl.m0.f80959a;
        }
    }

    public y2(q2 q2Var) {
        this.f83776a = q2Var;
    }

    @Override // hj.u2
    public final void a() {
        this.f83776a.p();
    }

    @Override // hj.u2
    public final void b() {
        q2 q2Var = this.f83776a;
        n1 n1Var = q2Var.f83603b;
        if (n1Var != null) {
            n1Var.e(q2Var, q2Var.f83602a);
        }
    }

    @Override // hj.u2
    public final void c() {
        this.f83776a.n();
    }

    @Override // hj.u2
    public final void d(int i10) {
        this.f83776a.c(i10);
    }

    @Override // hj.u2
    public final void e(int i10, String str) {
        this.f83776a.g(i10, str);
    }

    @Override // hj.u2
    public final void f(int i10, String str) {
        this.f83776a.h(i10, str);
    }

    @Override // hj.u2
    public final void g(double d10) {
        q2 q2Var = this.f83776a;
        kj.e eVar = q2Var.f83602a;
        if (eVar != null) {
            eVar.l(d10);
        }
        q2Var.f83614m.i(d10);
    }

    @Override // hj.u2
    public final void h(w2 w2Var) {
        this.f83776a.e(w2Var);
        q2.r(this.f83776a, w2Var.f83737a);
    }

    @Override // hj.u2
    public final void i(int i10, String str) {
        this.f83776a.d(i10, str);
    }

    @Override // hj.u2
    public final void onAdClicked() {
        this.f83776a.l();
    }

    @Override // hj.u2
    public final void onAdClosed() {
        this.f83776a.m();
        kotlinx.coroutines.k.d(kotlinx.coroutines.v1.f87249a, kotlinx.coroutines.f1.c(), null, new a(this.f83776a, null), 2, null);
    }
}