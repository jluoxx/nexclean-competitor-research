package zi;

import com.neeeex.eraser.m0;
import com.neeeex.similar3p.y;

/* JADX INFO: loaded from: classes7.dex */
public enum n {
    JUNK_CLEANER(p.JUNK_CLEANER),
    NETWORK_TRAFFIC(p.NETWORK_TRAFFIC),
    APP_MANAGER(p.APP_MANAGER),
    SCREENSHOTS(p.SCREENSHOTS),
    RECENT_APPS(p.RECENT_APPS),
    SIMILAR_IMAGES(p.SIMILAR_IMAGES),
    DUPLICATE_MEDIA(p.DUPLICATE_MEDIA),
    LARGE_MEDIA(p.LARGE_MEDIA),
    LARGE_FILES(p.LARGE_FILES),
    DEVICE_STATUS(p.DEVICE_STATUS),
    PHOTO_COMPRESSOR(p.PHOTO_COMPRESSOR),
    DUPLICATE_DOCS(p.DUPLICATE_DOCS),
    PHOTO_RECOVERY(null),
    VIDEO_RECOVERY(null),
    FILE_RECOVERY(null),
    VIRUS_SCAN(p.VIRUS_SCAN);

    private final p completedFeature;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ ml.a f104409b = ml.b.a(d());
    public static final a Companion = new a(null);

    n(p pVar) {
        this.completedFeature = pVar;
    }

    public static ml.a getEntries() {
        return f104409b;
    }

    public final p getCompletedFeature() {
        return this.completedFeature;
    }

    public static final class a {

        /* JADX INFO: renamed from: zi.n$a$a, reason: collision with other inner class name */
        public static final /* synthetic */ class C1349a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final /* synthetic */ int[] f104410a;

            static {
                int[] iArr = new int[y.values().length];
                try {
                    iArr[y.JUNK_FILES.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[y.SCREEN_CAPTURE_FILES.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[y.SIMILAR_IMAGES.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                try {
                    iArr[y.DUPLICATE_MEDIA.ordinal()] = 4;
                } catch (NoSuchFieldError unused4) {
                }
                try {
                    iArr[y.LARGE_MEDIA.ordinal()] = 5;
                } catch (NoSuchFieldError unused5) {
                }
                try {
                    iArr[y.LARGE_DOCS.ordinal()] = 6;
                } catch (NoSuchFieldError unused6) {
                }
                try {
                    iArr[y.DUPLICATE_DOCS.ordinal()] = 7;
                } catch (NoSuchFieldError unused7) {
                }
                f104410a = iArr;
            }
        }

        public /* synthetic */ a(p003kotlin.jvm.internal.m mVar) {
            this();
        }

        public final n a(y yVar) {
            m0.a("9+Z/BQ==\n", "g58PYKfJpcQ=\n");
            yVar.getClass();
            switch (C1349a.f104410a[yVar.ordinal()]) {
                case 1:
                    return n.JUNK_CLEANER;
                case 2:
                    return n.SCREENSHOTS;
                case 3:
                    return n.SIMILAR_IMAGES;
                case 4:
                    return n.DUPLICATE_MEDIA;
                case 5:
                    return n.LARGE_MEDIA;
                case 6:
                    return n.LARGE_FILES;
                case 7:
                    return n.DUPLICATE_DOCS;
                default:
                    coil.util.j.a();
                    return null;
            }
        }

        public a() {
        }
    }
}