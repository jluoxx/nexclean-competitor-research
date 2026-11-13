package hj;

/* JADX INFO: loaded from: classes7.dex */
public final class n extends ll.m implements tl.n {
    public final /* synthetic */ k OooO00o;
    public final /* synthetic */ int OooO0O0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(k kVar, int i10, kl.f fVar) {
        super(2, fVar);
        this.OooO00o = kVar;
        this.OooO0O0 = i10;
    }

    @Override // tl.n
    /* JADX INFO: renamed from: OooO00o, reason: merged with bridge method [inline-methods] */
    public final Object invoke(kotlinx.coroutines.p0 p0Var, kl.f<? super fl.m0> fVar) {
        return new n(this.OooO00o, this.OooO0O0, fVar).invokeSuspend(fl.m0.f80959a);
    }

    @Override // ll.a
    public final kl.f<fl.m0> create(Object obj, kl.f<?> fVar) {
        return new n(this.OooO00o, this.OooO0O0, fVar);
    }

    @Override // ll.a
    public final Object invokeSuspend(Object obj) {
        p003kotlin.coroutines.intrinsics.c.f();
        fl.v.b(obj);
        k kVar = this.OooO00o;
        mj.c cVar = kVar.f83605d;
        if (cVar != null) {
            cVar.g(kVar.f83614m, this.OooO0O0);
        }
        return fl.m0.f80959a;
    }
}