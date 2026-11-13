package hj;

/* JADX INFO: loaded from: classes7.dex */
public final class k0 extends ll.m implements tl.n {
    public final /* synthetic */ s0 OooO00o;
    public final /* synthetic */ kj.d OooO0O0;
    public final /* synthetic */ int OooO0OO;
    public final /* synthetic */ String OooO0Oo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k0(s0 s0Var, kj.d dVar, int i10, String str, kl.f fVar) {
        super(2, fVar);
        this.OooO00o = s0Var;
        this.OooO0O0 = dVar;
        this.OooO0OO = i10;
        this.OooO0Oo = str;
    }

    public final Object OooO00o(kotlinx.coroutines.p0 p0Var, kl.f<? super fl.m0> fVar) {
        return ((k0) create(p0Var, fVar)).invokeSuspend(fl.m0.f80959a);
    }

    @Override // ll.a
    public final kl.f<fl.m0> create(Object obj, kl.f<?> fVar) {
        return new k0(this.OooO00o, this.OooO0O0, this.OooO0OO, this.OooO0Oo, fVar);
    }

    @Override // tl.n
    public final Object invoke(Object obj, Object obj2) {
        return ((k0) create((kotlinx.coroutines.p0) obj, (kl.f) obj2)).invokeSuspend(fl.m0.f80959a);
    }

    @Override // ll.a
    public final Object invokeSuspend(Object obj) {
        p003kotlin.coroutines.intrinsics.c.f();
        fl.v.b(obj);
        mj.a aVar = this.OooO00o.f83676c;
        if (aVar != null) {
            aVar.c(kj.h.FAILED, this.OooO0O0, new kj.b(this.OooO0OO, this.OooO0Oo));
        }
        return fl.m0.f80959a;
    }
}