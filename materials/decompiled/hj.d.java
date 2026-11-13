package hj;

/* JADX INFO: loaded from: classes7.dex */
public final class d implements u2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ hj.a f83536a;

    public static final class a extends ll.m implements tl.n {
        public final /* synthetic */ hj.a OooO00o;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(hj.a aVar, kl.f fVar) {
            super(2, fVar);
            this.OooO00o = aVar;
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

    public d(hj.a aVar) {
        this.f83536a = aVar;
    }

    @Override // hj.u2
    public final void a() {
        this.f83536a.p();
    }

    @Override // hj.u2
    public final void b() {
        hj.a aVar = this.f83536a;
        n1 n1Var = aVar.f83603b;
        if (n1Var != null) {
            n1Var.e(aVar, aVar.f83602a);
        }
    }

    @Override // hj.u2
    public final void c() {
        this.f83536a.n();
    }

    @Override // hj.u2
    public final void d(int i10) {
        this.f83536a.c(i10);
    }

    @Override // hj.u2
    public final void e(int i10, String str) {
        this.f83536a.g(i10, str);
    }

    @Override // hj.u2
    public final void f(int i10, String str) {
        this.f83536a.h(i10, str);
    }

    @Override // hj.u2
    public final void g(double d10) {
        hj.a aVar = this.f83536a;
        kj.e eVar = aVar.f83602a;
        if (eVar != null) {
            eVar.l(d10);
        }
        aVar.f83614m.i(d10);
    }

    @Override // hj.u2
    public final void h(w2 w2Var) {
        this.f83536a.e(w2Var);
        hj.a.r(this.f83536a, w2Var.f83737a);
    }

    @Override // hj.u2
    public final void i(int i10, String str) {
        this.f83536a.d(i10, str);
    }

    @Override // hj.u2
    public final void onAdClicked() {
        this.f83536a.l();
    }

    @Override // hj.u2
    public final void onAdClosed() {
        this.f83536a.m();
        kotlinx.coroutines.k.d(kotlinx.coroutines.v1.f87249a, kotlinx.coroutines.f1.c(), null, new a(this.f83536a, null), 2, null);
    }
}