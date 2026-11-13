package jj;

import hj.n2;
import kj.h;

/* JADX INFO: loaded from: classes7.dex */
public abstract class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f85773a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final n2 f85774b;

    public e(int i10, n2 n2Var) {
        this.f85773a = i10;
        this.f85774b = n2Var;
    }

    public boolean a() {
        n2 n2Var = this.f85774b;
        return n2Var.f83641b.b(n2Var.f83640a);
    }

    public kj.d b() {
        return this.f85774b.b();
    }

    public void c(boolean z10, mj.a aVar) {
        if (ij.a.a()) {
            n2 n2Var = this.f85774b;
            n2Var.f83641b.a(n2Var.f83640a, z10, aVar);
        } else if (aVar != null) {
            h hVar = h.FAILED;
            kj.c cVar = kj.c.E_91105;
            aVar.a(hVar, null, new kj.b(cVar.getCode(), cVar.name()));
        }
    }
}