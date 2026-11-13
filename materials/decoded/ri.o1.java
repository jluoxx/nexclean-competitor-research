package ri;

import android.app.PendingIntent;
import android.content.ContentResolver;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.net.Uri;
import android.os.Bundle;
import android.widget.RemoteViews;
import com.neeeex.eraser.R$drawable;
import com.neeeex.eraser.R$id;
import com.neeeex.eraser.R$layout;
import com.neeeex.eraser.R$string;
import com.neeeex.eraser.module.main.SplashNEEEEXActivity;
import java.io.InputStream;
import p003kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes7.dex */
public final class o1 extends ri.a {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final a f92978s = new a(null);

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final Uri f92979r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o1(Uri uri) {
        super(null, false, 303, 0, 17, 0, false, new Function1() { // from class: ri.m1
            @Override // p003kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return o1.D(((Integer) obj).intValue());
            }
        }, new Function1() { // from class: ri.n1
            @Override // p003kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return o1.C(((Integer) obj).intValue());
            }
        }, 0, 0, 0, false, 0L, false, false, false, 130667, null);
        "imageUri" /* decoded XOR */;
        uri.getClass();
        this.f92979r = uri;
    }

    public static CharSequence C(int i10) {
        Context contextA = com.neeeex.eraser.y.Companion.a();
        String string = contextA != null ? com.neeeex.eraser.utils.g.b(contextA).getString(R$string.push_neeeex_screenshot_saved_content) : null;
        return string == null ? "" : string;
    }

    public static CharSequence D(int i10) {
        Context contextA = com.neeeex.eraser.y.Companion.a();
        String string = contextA != null ? com.neeeex.eraser.utils.g.b(contextA).getString(R$string.push_neeeex_screenshot_saved_title) : null;
        return string == null ? "" : string;
    }

    public final RemoteViews E(int i10, PendingIntent pendingIntent, Bitmap bitmap) {
        Context contextA = com.neeeex.eraser.y.Companion.a();
        RemoteViews remoteViews = new RemoteViews(contextA != null ? contextA.getPackageName() : null, i10);
        remoteViews.setTextViewText(R$id.tv_neeeex_title, (CharSequence) v().invoke(0));
        remoteViews.setTextViewText(R$id.tv_neeeex_content, (CharSequence) m().invoke(0));
        if (bitmap != null) {
            remoteViews.setImageViewBitmap(R$id.iv_neeeex_screenshot, bitmap);
        } else {
            remoteViews.setImageViewResource(R$id.iv_neeeex_screenshot, R$drawable.ic_neeeex_home_capacity_screenshots);
        }
        remoteViews.setOnClickPendingIntent(R$id.rl_container, pendingIntent);
        return remoteViews;
    }

    public final int F(int i10, int i11) {
        int i12 = 1;
        while (true) {
            if (i10 / i12 <= 256 && i11 / i12 <= 256) {
                return i12;
            }
            i12 *= 2;
        }
    }

    public final Bitmap G() {
        ContentResolver contentResolver;
        Object objM372constructorimpl;
        Object objM372constructorimpl2;
        Bitmap bitmapDecodeStream;
        Bitmap bitmapDecodeStream2;
        Context contextA = com.neeeex.eraser.y.Companion.a();
        if (contextA == null || (contentResolver = contextA.getContentResolver()) == null) {
            return null;
        }
        BitmapFactory.Options options = new BitmapFactory.Options();
        options.inJustDecodeBounds = true;
        try {
            fl.u.a aVar = fl.u.Companion;
            InputStream inputStreamOpenInputStream = contentResolver.openInputStream(this.f92979r);
            if (inputStreamOpenInputStream != null) {
                try {
                    bitmapDecodeStream2 = BitmapFactory.decodeStream(inputStreamOpenInputStream, null, options);
                    ql.c.a(inputStreamOpenInputStream, null);
                } catch (Throwable th2) {
                    try {
                        throw th2;
                    } catch (Throwable th3) {
                        ql.c.a(inputStreamOpenInputStream, th2);
                        throw th3;
                    }
                }
            } else {
                bitmapDecodeStream2 = null;
            }
            objM372constructorimpl = fl.u.m372constructorimpl(bitmapDecodeStream2);
        } catch (Throwable th4) {
            fl.u.a aVar2 = fl.u.Companion;
            objM372constructorimpl = fl.u.m372constructorimpl(fl.v.a(th4));
        }
        fl.u.m377isFailureimpl(objM372constructorimpl);
        if (options.outWidth <= 0 || options.outHeight <= 0) {
            return null;
        }
        BitmapFactory.Options options2 = new BitmapFactory.Options();
        options2.inSampleSize = F(options.outWidth, options.outHeight);
        try {
            InputStream inputStreamOpenInputStream2 = contentResolver.openInputStream(this.f92979r);
            if (inputStreamOpenInputStream2 != null) {
                try {
                    bitmapDecodeStream = BitmapFactory.decodeStream(inputStreamOpenInputStream2, null, options2);
                    ql.c.a(inputStreamOpenInputStream2, null);
                } catch (Throwable th5) {
                    try {
                        throw th5;
                    } catch (Throwable th6) {
                        ql.c.a(inputStreamOpenInputStream2, th5);
                        throw th6;
                    }
                }
            } else {
                bitmapDecodeStream = null;
            }
            objM372constructorimpl2 = fl.u.m372constructorimpl(bitmapDecodeStream);
        } catch (Throwable th7) {
            fl.u.a aVar3 = fl.u.Companion;
            objM372constructorimpl2 = fl.u.m372constructorimpl(fl.v.a(th7));
        }
        return (Bitmap) (fl.u.m377isFailureimpl(objM372constructorimpl2) ? null : objM372constructorimpl2);
    }

    @Override // ri.a
    public fl.y s(int i10, int i11, String str, int i12) {
        "channelId" /* decoded XOR */;
        str.getClass();
        String name = SplashNEEEEXActivity.class.getName();
        "getName(...)" /* decoded XOR */;
        Bundle bundle = new Bundle();
        z(bundle, i11, str, i12);
        bundle.putString("screenshotUri" /* decoded XOR */, this.f92979r.toString());
        fl.m0 m0Var = fl.m0.f80959a;
        PendingIntent pendingIntentJ = ri.a.j(this, name, i10, bundle, false, 8, null);
        Bitmap bitmapG = G();
        RemoteViews remoteViewsE = E(R$layout.push_neeeex_screenshot_small, pendingIntentJ, bitmapG);
        int i13 = R$layout.push_neeeex_screenshot;
        return new fl.y(remoteViewsE, E(i13, pendingIntentJ, bitmapG), E(i13, pendingIntentJ, bitmapG));
    }

    @Override // ri.a
    public PendingIntent t(int i10, int i11, String str, int i12) {
        "channelId" /* decoded XOR */;
        str.getClass();
        Bundle bundle = new Bundle();
        z(bundle, i11, str, i12);
        bundle.putString("screenshotUri" /* decoded XOR */, this.f92979r.toString());
        fl.m0 m0Var = fl.m0.f80959a;
        return ri.a.i(this, i10, bundle, false, 4, null);
    }

    public static final class a {
        public /* synthetic */ a(p003kotlin.jvm.internal.m mVar) {
            this();
        }

        public a() {
        }
    }
}