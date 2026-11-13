package qi;

import am.q;

/* JADX INFO: loaded from: classes7.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final c f92156a = new c();

    public final String a(int i10) {
        return q.p(i10, 0, 100) + "%";
    }

    public final int b(long j10, long j11) {
        if (j11 <= 0) {
            return 0;
        }
        return q.p((int) ((q.r(j11 - j10, 0L, j11) * 100.0d) / j11), 0, 100);
    }
}