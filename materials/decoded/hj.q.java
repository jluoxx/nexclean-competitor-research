package hj;

/* JADX INFO: loaded from: classes7.dex */
public final class q implements u2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ u f83662a;

    public static final class a extends ll.m implements tl.n {
        public final /* synthetic */ u OooO00o;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(u uVar, kl.f fVar) {
            super(2, fVar);
            this.OooO00o = uVar;
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

    public q(u uVar) {
        this.f83662a = uVar;
    }

    @Override // hj.u2
    public final void a() {
        this.f83662a.p();
    }

    @Override // hj.u2
    public final void b() {
        u uVar = this.f83662a;
        n1 n1Var = uVar.f83603b;
        if (n1Var != null) {
            n1Var.e(uVar, uVar.f83602a);
        }
    }

    @Override // hj.u2
    public final void c() {
        this.f83662a.n();
    }

    @Override // hj.u2
    public final void d(int i10) {
        this.f83662a.c(i10);
    }

    @Override // hj.u2
    public final void e(int i10, String str) {
        this.f83662a.g(i10, str);
    }

    @Override // hj.u2
    public final void f(int i10, String str) {
        this.f83662a.h(i10, str);
    }

    @Override // hj.u2
    public final void g(double d10) {
        u uVar = this.f83662a;
        kj.e eVar = uVar.f83602a;
        if (eVar != null) {
            eVar.l(d10);
        }
        uVar.f83614m.i(d10);
    }

    @Override // hj.u2
    public final void h(w2 w2Var) {
        this.f83662a.e(w2Var);
        u.q(this.f83662a, w2Var.f83737a);
    }

    @Override // hj.u2
    public final void i(int i10, String str) {
        this.f83662a.d(i10, str);
    }

    @Override // hj.u2
    public final void onAdClicked() {
        this.f83662a.l();
    }

    @Override // hj.u2
    public final void onAdClosed() {
        this.f83662a.m();
        kotlinx.coroutines.k.d(kotlinx.coroutines.v1.f87249a, kotlinx.coroutines.f1.c(), null, new a(this.f83662a, null), 2, null);
    }
}