package fg;

/* JADX INFO: loaded from: classes6.dex */
public class p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f80875a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f80876b;

    public static class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public long f80877a = 60;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public long f80878b = com.google.firebase.remoteconfig.internal.c.f55372j;

        public p c() {
            return new p(this);
        }

        public b d(long j10) {
            if (j10 >= 0) {
                this.f80878b = j10;
                return this;
            }
            throw new IllegalArgumentException("Minimum interval between fetches has to be a non-negative number. " + j10 + " is an invalid argument");
        }
    }

    public p(b bVar) {
        this.f80875a = bVar.f80877a;
        this.f80876b = bVar.f80878b;
    }

    public long a() {
        return this.f80875a;
    }

    public long b() {
        return this.f80876b;
    }
}