package hj;

/* JADX INFO: loaded from: classes7.dex */
public final class f1 extends ll.m implements tl.n {
    public final /* synthetic */ k OooO00o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f1(k kVar, kl.f fVar) {
        super(2, fVar);
        this.OooO00o = kVar;
    }

    @Override // tl.n
    /* JADX INFO: renamed from: OooO00o, reason: merged with bridge method [inline-methods] */
    public final Object invoke(kotlinx.coroutines.p0 p0Var, kl.f<? super fl.m0> fVar) {
        return new f1(this.OooO00o, fVar).invokeSuspend(fl.m0.f80959a);
    }

    @Override // ll.a
    public final kl.f<fl.m0> create(Object obj, kl.f<?> fVar) {
        return new f1(this.OooO00o, fVar);
    }

    @Override // ll.a
    public final Object invokeSuspend(Object obj) {
        p003kotlin.coroutines.intrinsics.c.f();
        fl.v.b(obj);
        k kVar = this.OooO00o;
        mj.c cVar = kVar.f83605d;
        if (cVar != null) {
            cVar.e(kVar.f83614m);
        }
        return fl.m0.f80959a;
    }
}