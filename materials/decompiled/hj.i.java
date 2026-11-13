package hj;

/* JADX INFO: loaded from: classes7.dex */
public final class i extends ll.m implements tl.n {
    public final /* synthetic */ j OooO00o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(j jVar, kl.f fVar) {
        super(2, fVar);
        this.OooO00o = jVar;
    }

    @Override // tl.n
    /* JADX INFO: renamed from: OooO00o, reason: merged with bridge method [inline-methods] */
    public final Object invoke(kotlinx.coroutines.p0 p0Var, kl.f<? super fl.m0> fVar) {
        return new i(this.OooO00o, fVar).invokeSuspend(fl.m0.f80959a);
    }

    @Override // ll.a
    public final kl.f<fl.m0> create(Object obj, kl.f<?> fVar) {
        return new i(this.OooO00o, fVar);
    }

    @Override // ll.a
    public final Object invokeSuspend(Object obj) {
        p003kotlin.coroutines.intrinsics.c.f();
        fl.v.b(obj);
        j jVar = this.OooO00o;
        mj.c cVar = jVar.f83605d;
        if (cVar instanceof mj.b) {
            ((mj.b) cVar).c(jVar.f83614m);
        }
        return fl.m0.f80959a;
    }
}