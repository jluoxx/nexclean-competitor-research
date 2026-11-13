package hj;

/* JADX INFO: loaded from: classes7.dex */
public final class r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final r f83668a = new r();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static w f83669b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static c3 f83670c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static e2 f83671d;

    public final q1 a(int i10) {
        if (i10 == 1) {
            if (f83669b == null) {
                f83669b = new w();
            }
            return f83669b;
        }
        if (i10 == 3) {
            if (f83670c == null) {
                f83670c = new c3();
            }
            return f83670c;
        }
        if (i10 != 30) {
            return null;
        }
        if (f83671d == null) {
            f83671d = new e2();
        }
        return f83671d;
    }
}