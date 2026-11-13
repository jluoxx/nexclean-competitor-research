package hj;

/* JADX INFO: loaded from: classes7.dex */
public final class s2 extends ll.m implements tl.n {
    public final /* synthetic */ k OooO00o;
    public final /* synthetic */ int OooO0O0;
    public final /* synthetic */ String OooO0OO;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s2(k kVar, int i10, String str, kl.f fVar) {
        super(2, fVar);
        this.OooO00o = kVar;
        this.OooO0O0 = i10;
        this.OooO0OO = str;
    }

    public final Object OooO00o(kotlinx.coroutines.p0 p0Var, kl.f<? super fl.m0> fVar) {
        return ((s2) create(p0Var, fVar)).invokeSuspend(fl.m0.f80959a);
    }

    @Override // ll.a
    public final kl.f<fl.m0> create(Object obj, kl.f<?> fVar) {
        return new s2(this.OooO00o, this.OooO0O0, this.OooO0OO, fVar);
    }

    @Override // tl.n
    public final Object invoke(Object obj, Object obj2) {
        return ((s2) create((kotlinx.coroutines.p0) obj, (kl.f) obj2)).invokeSuspend(fl.m0.f80959a);
    }

    @Override // ll.a
    public final Object invokeSuspend(Object obj) {
        p003kotlin.coroutines.intrinsics.c.f();
        fl.v.b(obj);
        k kVar = this.OooO00o;
        mj.c cVar = kVar.f83605d;
        if (cVar != null) {
            cVar.d(kVar.f83614m, new kj.b(this.OooO0O0, this.OooO0OO));
        }
        return fl.m0.f80959a;
    }
}