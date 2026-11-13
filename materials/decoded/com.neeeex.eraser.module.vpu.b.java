package com.neeeex.eraser.module.vpu;

import android.content.Context;
import com.neeeex.eraser.m0;
import p003kotlin.jvm.internal.s;
import tl.o;

/* JADX INFO: loaded from: classes7.dex */
public enum b {
    FILE_SCAN(new a(FileScanRDNEEEEXVPActivity.INSTANCE)),
    PHOTO_PREVIEW(new C0785b(PhotoPVNEEEEXVPActivity.INSTANCE)),
    PHOTO_RECOVERY(new c(PhotoRecoverRDNEEEEXVPActivity.INSTANCE)),
    PHOTO_SCAN(new d(PhotoScanRDNEEEEXVPActivity.INSTANCE)),
    VIDEO_PREVIEW(new e(VideoPVNEEEEXVPActivity.INSTANCE)),
    VIDEO_RECOVERY(new f(VideoRecoverRDNEEEEXVPActivity.INSTANCE)),
    VIDEO_SCAN(new g(VideoScanRDNEEEEXVPActivity.INSTANCE));


    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ ml.a f65460b = ml.b.a(d());
    private final o launch;

    b(o oVar) {
        this.launch = oVar;
    }

    public static ml.a getEntries() {
        return f65460b;
    }

    public final void open(Context context, String str, com.neeeex.eraser.ads.o oVar) {
        "context" /* decoded XOR */;
        context.getClass();
        "positionId" /* decoded XOR */;
        str.getClass();
        this.launch.invoke(context, str, oVar);
    }

    public static final /* synthetic */ class a extends s implements o {
        public a(Object obj) {
            super(3, obj, FileScanRDNEEEEXVPActivity.Companion.class, "start" /* decoded XOR */, "start(Landroid/content/Context;Ljava/lang/String;Lcom/neeeex/eraser/ads/OnAdListener;)V" /* decoded XOR */, 0);
        }

        public final void invoke(Context context, String str, com.neeeex.eraser.ads.o oVar) {
            "p0" /* decoded XOR */;
            context.getClass();
            "p1" /* decoded XOR */;
            str.getClass();
            ((FileScanRDNEEEEXVPActivity.Companion) this.receiver).a(context, str, oVar);
        }

        @Override // tl.o
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            invoke((Context) obj, (String) obj2, (com.neeeex.eraser.ads.o) obj3);
            return fl.m0.f80959a;
        }
    }

    /* JADX INFO: renamed from: com.neeeex.eraser.module.vpu.b$b, reason: collision with other inner class name */
    public static final /* synthetic */ class C0785b extends s implements o {
        public C0785b(Object obj) {
            super(3, obj, PhotoPVNEEEEXVPActivity.Companion.class, "start" /* decoded XOR */, "start(Landroid/content/Context;Ljava/lang/String;Lcom/neeeex/eraser/ads/OnAdListener;)V" /* decoded XOR */, 0);
        }

        public final void invoke(Context context, String str, com.neeeex.eraser.ads.o oVar) {
            "p0" /* decoded XOR */;
            context.getClass();
            "p1" /* decoded XOR */;
            str.getClass();
            ((PhotoPVNEEEEXVPActivity.Companion) this.receiver).a(context, str, oVar);
        }

        @Override // tl.o
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            invoke((Context) obj, (String) obj2, (com.neeeex.eraser.ads.o) obj3);
            return fl.m0.f80959a;
        }
    }

    public static final /* synthetic */ class c extends s implements o {
        public c(Object obj) {
            super(3, obj, PhotoRecoverRDNEEEEXVPActivity.Companion.class, "start" /* decoded XOR */, "start(Landroid/content/Context;Ljava/lang/String;Lcom/neeeex/eraser/ads/OnAdListener;)V" /* decoded XOR */, 0);
        }

        public final void invoke(Context context, String str, com.neeeex.eraser.ads.o oVar) {
            "p0" /* decoded XOR */;
            context.getClass();
            "p1" /* decoded XOR */;
            str.getClass();
            ((PhotoRecoverRDNEEEEXVPActivity.Companion) this.receiver).a(context, str, oVar);
        }

        @Override // tl.o
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            invoke((Context) obj, (String) obj2, (com.neeeex.eraser.ads.o) obj3);
            return fl.m0.f80959a;
        }
    }

    public static final /* synthetic */ class d extends s implements o {
        public d(Object obj) {
            super(3, obj, PhotoScanRDNEEEEXVPActivity.Companion.class, "start" /* decoded XOR */, "start(Landroid/content/Context;Ljava/lang/String;Lcom/neeeex/eraser/ads/OnAdListener;)V" /* decoded XOR */, 0);
        }

        public final void invoke(Context context, String str, com.neeeex.eraser.ads.o oVar) {
            "p0" /* decoded XOR */;
            context.getClass();
            "p1" /* decoded XOR */;
            str.getClass();
            ((PhotoScanRDNEEEEXVPActivity.Companion) this.receiver).a(context, str, oVar);
        }

        @Override // tl.o
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            invoke((Context) obj, (String) obj2, (com.neeeex.eraser.ads.o) obj3);
            return fl.m0.f80959a;
        }
    }

    public static final /* synthetic */ class e extends s implements o {
        public e(Object obj) {
            super(3, obj, VideoPVNEEEEXVPActivity.Companion.class, "start" /* decoded XOR */, "start(Landroid/content/Context;Ljava/lang/String;Lcom/neeeex/eraser/ads/OnAdListener;)V" /* decoded XOR */, 0);
        }

        public final void invoke(Context context, String str, com.neeeex.eraser.ads.o oVar) {
            "p0" /* decoded XOR */;
            context.getClass();
            "p1" /* decoded XOR */;
            str.getClass();
            ((VideoPVNEEEEXVPActivity.Companion) this.receiver).a(context, str, oVar);
        }

        @Override // tl.o
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            invoke((Context) obj, (String) obj2, (com.neeeex.eraser.ads.o) obj3);
            return fl.m0.f80959a;
        }
    }

    public static final /* synthetic */ class f extends s implements o {
        public f(Object obj) {
            super(3, obj, VideoRecoverRDNEEEEXVPActivity.Companion.class, "start" /* decoded XOR */, "start(Landroid/content/Context;Ljava/lang/String;Lcom/neeeex/eraser/ads/OnAdListener;)V" /* decoded XOR */, 0);
        }

        public final void invoke(Context context, String str, com.neeeex.eraser.ads.o oVar) {
            "p0" /* decoded XOR */;
            context.getClass();
            "p1" /* decoded XOR */;
            str.getClass();
            ((VideoRecoverRDNEEEEXVPActivity.Companion) this.receiver).a(context, str, oVar);
        }

        @Override // tl.o
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            invoke((Context) obj, (String) obj2, (com.neeeex.eraser.ads.o) obj3);
            return fl.m0.f80959a;
        }
    }

    public static final /* synthetic */ class g extends s implements o {
        public g(Object obj) {
            super(3, obj, VideoScanRDNEEEEXVPActivity.Companion.class, "start" /* decoded XOR */, "start(Landroid/content/Context;Ljava/lang/String;Lcom/neeeex/eraser/ads/OnAdListener;)V" /* decoded XOR */, 0);
        }

        public final void invoke(Context context, String str, com.neeeex.eraser.ads.o oVar) {
            "p0" /* decoded XOR */;
            context.getClass();
            "p1" /* decoded XOR */;
            str.getClass();
            ((VideoScanRDNEEEEXVPActivity.Companion) this.receiver).a(context, str, oVar);
        }

        @Override // tl.o
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            invoke((Context) obj, (String) obj2, (com.neeeex.eraser.ads.o) obj3);
            return fl.m0.f80959a;
        }
    }
}