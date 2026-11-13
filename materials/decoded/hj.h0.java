package hj;

/* JADX INFO: loaded from: classes7.dex */
public final class h0 extends ll.m implements tl.n {
    public final /* synthetic */ s0 OooO00o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h0(s0 s0Var, kl.f fVar) {
        super(2, fVar);
        this.OooO00o = s0Var;
    }

    @Override // tl.n
    /* JADX INFO: renamed from: OooO00o, reason: merged with bridge method [inline-methods] */
    public final Object invoke(kotlinx.coroutines.p0 p0Var, kl.f<? super fl.m0> fVar) {
        return new h0(this.OooO00o, fVar).invokeSuspend(fl.m0.f80959a);
    }

    @Override // ll.a
    public final kl.f<fl.m0> create(Object obj, kl.f<?> fVar) {
        return new h0(this.OooO00o, fVar);
    }

    @Override // ll.a
    public final Object invokeSuspend(Object obj) {
        p003kotlin.coroutines.intrinsics.c.f();
        fl.v.b(obj);
        mj.a aVar = this.OooO00o.f83676c;
        if (aVar != null) {
            aVar.b();
        }
        return fl.m0.f80959a;
    }
}