package vh;

import coil.util.j;
import com.mbridge.msdk.playercommon.exoplayer2.source.chunk.ChunkedTrackBlacklistUtil;
import com.neeeex.eraser.ads.h;
import com.neeeex.eraser.ads.o;
import com.neeeex.eraser.base.BaseAdActivity;
import com.neeeex.eraser.m0;
import com.neeeex.eraser.utils.b0;
import java.util.concurrent.atomic.AtomicBoolean;
import p003kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes7.dex */
public final class a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final String f100782b = "neeeex_sp_key_timestamp_ctools_app_settings_inter_ad" /* decoded XOR */;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f100781a = new a();

    /* JADX INFO: renamed from: vh.a$a, reason: collision with other inner class name */
    public enum EnumC1277a {
        Visible,
        Failed,
        Closed;


        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ ml.a f100784b = ml.b.a(d());

        public static ml.a getEntries() {
            return f100784b;
        }
    }

    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final long f100785a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final long f100786b;

        public b(long j10, long j11) {
            this.f100785a = j10;
            this.f100786b = j11;
        }

        public final boolean a() {
            long j10 = this.f100785a;
            return j10 <= 0 || this.f100786b - j10 >= ChunkedTrackBlacklistUtil.DEFAULT_TRACK_BLACKLIST_MS;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return this.f100785a == bVar.f100785a && this.f100786b == bVar.f100786b;
        }

        public int hashCode() {
            return (Long.hashCode(this.f100785a) * 31) + Long.hashCode(this.f100786b);
        }

        public String toString() {
            return "Cooldown(previous=" + this.f100785a + ", now=" + this.f100786b + ")";
        }
    }

    public static final class c implements o {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final e f100787a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Function0 f100788b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final AtomicBoolean f100789c;

        /* JADX INFO: renamed from: vh.a$c$a, reason: collision with other inner class name */
        public static final /* synthetic */ class C1278a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final /* synthetic */ int[] f100790a;

            static {
                int[] iArr = new int[EnumC1277a.values().length];
                try {
                    iArr[EnumC1277a.Visible.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[EnumC1277a.Failed.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[EnumC1277a.Closed.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                f100790a = iArr;
            }
        }

        public c(e eVar, Function0 function0) {
            "scope" /* decoded XOR */;
            eVar.getClass();
            this.f100787a = eVar;
            this.f100788b = function0;
            this.f100789c = new AtomicBoolean(false);
        }

        public final Object a(EnumC1277a enumC1277a) {
            int i10 = C1278a.f100790a[enumC1277a.ordinal()];
            if (i10 == 1) {
                return Boolean.valueOf(c());
            }
            if (i10 == 2) {
                b();
                return fl.m0.f80959a;
            }
            if (i10 != 3) {
                j.a();
                return null;
            }
            c();
            b();
            return fl.m0.f80959a;
        }

        public final void b() {
            Function0 function0;
            if (!this.f100789c.compareAndSet(false, true) || (function0 = this.f100788b) == null) {
                return;
            }
            function0.invoke();
        }

        public final boolean c() {
            return b0.f66131a.C(this.f100787a.getPreferenceKey(), System.currentTimeMillis());
        }

        @Override // com.neeeex.eraser.ads.o
        public void onAdClick() {
        }

        @Override // com.neeeex.eraser.ads.o
        public void onAdClose() {
            a(EnumC1277a.Closed);
        }

        @Override // com.neeeex.eraser.ads.o
        public void onAdShowFailed(oj.a aVar) {
            a(EnumC1277a.Failed);
        }

        @Override // com.neeeex.eraser.ads.o
        public void onAdShowSuccess(oj.a aVar) {
            a(EnumC1277a.Visible);
        }
    }

    public enum d {
        ContinueImmediately,
        Present;


        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ ml.a f100792b = ml.b.a(d());

        public static ml.a getEntries() {
            return f100792b;
        }
    }

    public enum e {
        RECENT_APPS("neeeex_sp_key_timestamp_ctools_app_settings_inter_ad" /* decoded XOR */),
        NETWORK_TRAFFIC("neeeex_sp_key_timestamp_ctools_network_traffic_settings_inter_ad" /* decoded XOR */),
        APP_MANAGER("neeeex_sp_key_timestamp_ctools_app_manager_uninstall_inter_ad" /* decoded XOR */);


        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ ml.a f100794b = ml.b.a(d());
        private final String preferenceKey;

        e(String str) {
            this.preferenceKey = str;
        }

        public static ml.a getEntries() {
            return f100794b;
        }

        public final String getPreferenceKey() {
            return this.preferenceKey;
        }
    }

    public static final /* synthetic */ class f {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f100795a;

        static {
            int[] iArr = new int[d.values().length];
            try {
                iArr[d.ContinueImmediately.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[d.Present.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f100795a = iArr;
        }
    }

    public final boolean a(long j10, long j11) {
        return new b(j10, j11).a();
    }

    public final d b(e eVar) {
        if (com.neeeex.eraser.module.report.bytedance.a.k() && c()) {
            return a(b0.f66131a.v(eVar.getPreferenceKey(), 0L), System.currentTimeMillis()) ? d.Present : d.ContinueImmediately;
        }
        return d.ContinueImmediately;
    }

    public final boolean c() {
        return h.f64923a.g().c() > -0.1d;
    }

    public final void d(BaseAdActivity baseAdActivity, String str, e eVar, Function0 function0) {
        c cVar = new c(eVar, function0);
        h hVar = h.f64923a;
        hVar.g().a(str);
        hVar.g().f(baseAdActivity, str, cVar);
    }

    public final void e(BaseAdActivity baseAdActivity, String str, e eVar) {
        "activity" /* decoded XOR */;
        baseAdActivity.getClass();
        "position" /* decoded XOR */;
        str.getClass();
        "scope" /* decoded XOR */;
        eVar.getClass();
        if (com.neeeex.eraser.module.report.bytedance.a.k() && c()) {
            d(baseAdActivity, str, eVar, null);
        }
    }

    public final void f(BaseAdActivity baseAdActivity, String str, e eVar, Function0 function0) {
        "activity" /* decoded XOR */;
        baseAdActivity.getClass();
        "position" /* decoded XOR */;
        str.getClass();
        "scope" /* decoded XOR */;
        eVar.getClass();
        "onContinue" /* decoded XOR */;
        function0.getClass();
        int i10 = f.f100795a[b(eVar).ordinal()];
        if (i10 == 1) {
            function0.invoke();
        } else if (i10 == 2) {
            d(baseAdActivity, str, eVar, function0);
        } else {
            j.a();
        }
    }
}