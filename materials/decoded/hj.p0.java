package hj;

/* JADX INFO: loaded from: classes7.dex */
public final class p0 extends ll.m implements tl.n {
    public final /* synthetic */ s0 OooO00o;
    public final /* synthetic */ kj.d OooO0O0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p0(s0 s0Var, kj.d dVar, kl.f fVar) {
        super(2, fVar);
        this.OooO00o = s0Var;
        this.OooO0O0 = dVar;
    }

    @Override // tl.n
    /* JADX INFO: renamed from: OooO00o, reason: merged with bridge method [inline-methods] */
    public final Object invoke(kotlinx.coroutines.p0 p0Var, kl.f<? super fl.m0> fVar) {
        return new p0(this.OooO00o, this.OooO0O0, fVar).invokeSuspend(fl.m0.f80959a);
    }

    @Override // ll.a
    public final kl.f<fl.m0> create(Object obj, kl.f<?> fVar) {
        return new p0(this.OooO00o, this.OooO0O0, fVar);
    }

    @Override // ll.a
    public final Object invokeSuspend(Object obj) {
        p003kotlin.coroutines.intrinsics.c.f();
        fl.v.b(obj);
        mj.a aVar = this.OooO00o.f83676c;
        if (aVar != null) {
            aVar.c(kj.h.SUCCESS, this.OooO0O0, null);
        }
        return fl.m0.f80959a;
    }
}