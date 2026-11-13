package hj;

/* JADX INFO: loaded from: classes7.dex */
public abstract class n2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f83640a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final w1 f83641b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final v0 f83642c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public k f83643d;

    public n2(String str, w1 w1Var, v0 v0Var) {
        this.f83640a = str;
        this.f83641b = w1Var;
        this.f83642c = v0Var;
    }

    public final k a(mj.c cVar) {
        k kVarH = this.f83642c.h(this.f83640a);
        this.f83643d = kVarH;
        if (kVarH != null) {
            this.f83642c.g(kVarH);
            return kVarH;
        }
        if (cVar != null) {
            cVar.d(null, new kj.b(kj.c.E_91201.getCode(), "E_91201"));
        }
        return kVarH;
    }

    public final kj.d b() {
        k kVarH = this.f83642c.h(this.f83640a);
        if (kVarH != null) {
            return kVarH.f83614m;
        }
        return null;
    }
}