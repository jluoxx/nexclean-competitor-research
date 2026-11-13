package hj;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes7.dex */
public final class r0 extends ll.d {
    public Object OooO00o;
    public ArrayList OooO0O0;
    public Object OooO0OO;
    public /* synthetic */ Object OooO0Oo;
    public int OooO0o;
    public final /* synthetic */ s0 OooO0o0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r0(s0 s0Var, kl.f fVar) {
        super(fVar);
        this.OooO0o0 = s0Var;
    }

    @Override // ll.a
    public final Object invokeSuspend(Object obj) {
        this.OooO0Oo = obj;
        this.OooO0o |= Integer.MIN_VALUE;
        return this.OooO0o0.i(false, false, this);
    }
}