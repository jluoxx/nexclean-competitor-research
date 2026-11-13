package hj;

/* JADX INFO: loaded from: classes7.dex */
public final class e3 implements u2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ q0 f83558a;

    public e3(q0 q0Var) {
        this.f83558a = q0Var;
    }

    @Override // hj.u2
    public final void a() {
        this.f83558a.p();
    }

    @Override // hj.u2
    public final void b() {
        q0 q0Var = this.f83558a;
        n1 n1Var = q0Var.f83603b;
        if (n1Var != null) {
            n1Var.e(q0Var, q0Var.f83602a);
        }
    }

    @Override // hj.u2
    public final void c() {
        this.f83558a.n();
    }

    @Override // hj.u2
    public final void d(int i10) {
        this.f83558a.c(i10);
    }

    @Override // hj.u2
    public final void e(int i10, String str) {
        this.f83558a.g(i10, str);
    }

    @Override // hj.u2
    public final void f(int i10, String str) {
        this.f83558a.h(i10, str);
    }

    @Override // hj.u2
    public final void g(double d10) {
        q0 q0Var = this.f83558a;
        kj.e eVar = q0Var.f83602a;
        if (eVar != null) {
            eVar.l(d10);
        }
        q0Var.f83614m.i(d10);
    }

    @Override // hj.u2
    public final void h(w2 w2Var) {
        this.f83558a.e(w2Var);
        q0.r(this.f83558a, w2Var.f83737a);
    }

    @Override // hj.u2
    public final void i(int i10, String str) {
        this.f83558a.d(i10, str);
    }

    @Override // hj.u2
    public final void onAdClicked() {
        this.f83558a.l();
    }

    @Override // hj.u2
    public final void onAdClosed() {
        this.f83558a.m();
    }
}