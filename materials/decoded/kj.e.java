package kj;

/* JADX INFO: loaded from: classes7.dex */
public class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f86579a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f86580b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f86581c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public String f86582d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public double f86583e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f86584f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f86585g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f86586h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public boolean f86587i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public boolean f86588j;

    public e(String str, int i10, boolean z10, String str2, double d10, int i11, int i12, int i13, boolean z11, boolean z12) {
        this.f86579a = str;
        this.f86580b = i10;
        this.f86581c = z10;
        this.f86582d = str2;
        this.f86583e = d10;
        this.f86584f = i11;
        this.f86586h = i12;
        this.f86585g = i13;
        this.f86588j = z11;
        this.f86587i = z12;
    }

    public String a() {
        return this.f86579a;
    }

    public int b() {
        return this.f86580b;
    }

    public int c() {
        return this.f86584f;
    }

    public double d() {
        return this.f86583e;
    }

    public int e() {
        return this.f86585g;
    }

    public int f() {
        return this.f86586h;
    }

    public String g() {
        return this.f86582d;
    }

    public boolean h() {
        return this.f86581c;
    }

    public boolean i() {
        return this.f86588j;
    }

    public boolean j() {
        return this.f86587i;
    }

    public void k(int i10) {
        this.f86584f = i10;
    }

    public void l(double d10) {
        this.f86583e = d10;
    }

    public void m(String str) {
        this.f86582d = str;
    }

    public e(String str, int i10, boolean z10, boolean z11) {
        this(str, i10, z10, "", 0.0d, 0, 0, 0, false, z11);
    }

    public e(String str, int i10, boolean z10, boolean z11, int i11) {
        this(str, i10, z10, "", 0.0d, 0, i11, 0, false, z11);
    }
}