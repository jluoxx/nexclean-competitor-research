package hj;

/* JADX INFO: loaded from: classes7.dex */
public final class i0 extends ll.d {
    public Object OooO00o;
    public Object OooO0O0;
    public /* synthetic */ Object OooO0OO;
    public final /* synthetic */ s0 OooO0Oo;
    public int OooO0o0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i0(s0 s0Var, kl.f fVar) {
        super(fVar);
        this.OooO0Oo = s0Var;
    }

    @Override // ll.a
    public final Object invokeSuspend(Object obj) {
        this.OooO0OO = obj;
        this.OooO0o0 |= Integer.MIN_VALUE;
        return this.OooO0Oo.h(null, null, false, false, this);
    }
}