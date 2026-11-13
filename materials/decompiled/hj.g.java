package hj;

/* JADX INFO: loaded from: classes7.dex */
public final class g implements u2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f83569a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f83570b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f83571c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ j f83572d;

    public g(j jVar) {
        this.f83572d = jVar;
    }

    @Override // hj.u2
    public final void a() {
        int i10 = this.f83571c;
        j jVar = this.f83572d;
        if (i10 == 0) {
            jVar.p();
        } else {
            j.s(jVar);
        }
        this.f83571c++;
    }

    @Override // hj.u2
    public final void b() {
        j jVar = this.f83572d;
        n1 n1Var = jVar.f83603b;
        if (n1Var != null) {
            n1Var.e(jVar, jVar.f83602a);
        }
    }

    @Override // hj.u2
    public final void c() {
        if (this.f83569a == 0 && this.f83570b == 0) {
            this.f83572d.n();
        }
        this.f83569a++;
    }

    @Override // hj.u2
    public final void d(int i10) {
        this.f83572d.c(i10);
    }

    @Override // hj.u2
    public final void e(int i10, String str) {
        this.f83572d.g(i10, str);
    }

    @Override // hj.u2
    public final void f(int i10, String str) {
        this.f83572d.h(i10, str);
    }

    @Override // hj.u2
    public final void g(double d10) {
        j jVar = this.f83572d;
        kj.e eVar = jVar.f83602a;
        if (eVar != null) {
            eVar.l(d10);
        }
        jVar.f83614m.i(d10);
    }

    @Override // hj.u2
    public final void h(w2 w2Var) {
        this.f83572d.e(w2Var);
        j.r(this.f83572d, w2Var.f83737a);
    }

    @Override // hj.u2
    public final void i(int i10, String str) {
        if (this.f83569a == 0 && this.f83570b == 0) {
            this.f83572d.d(i10, str);
        }
        this.f83570b++;
    }

    @Override // hj.u2
    public final void onAdClicked() {
        this.f83572d.l();
    }

    @Override // hj.u2
    public final void onAdClosed() {
        this.f83572d.m();
    }
}