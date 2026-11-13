package hj;

/* JADX INFO: loaded from: classes7.dex */
public final class g0 extends ll.d {
    public Object OooO00o;
    public Object OooO0O0;
    public /* synthetic */ Object OooO0OO;
    public final /* synthetic */ s0 OooO0Oo;
    public int OooO0o0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g0(s0 s0Var, kl.f fVar) {
        super(fVar);
        this.OooO0Oo = s0Var;
    }

    @Override // ll.a
    public final Object invokeSuspend(Object obj) {
        this.OooO0OO = obj;
        this.OooO0o0 |= Integer.MIN_VALUE;
        return s0.g(this.OooO0Oo, false, false, false, this);
    }
}