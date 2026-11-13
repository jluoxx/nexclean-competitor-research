package com.neeeex.similar3p.utils;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorMatrix;
import android.graphics.ColorMatrixColorFilter;
import android.graphics.Paint;
import com.neeeex.eraser.m0;
import fl.t;
import fl.u;
import fl.v;
import java.util.Iterator;
import p003kotlin.jvm.functions.Function1;
import p003kotlin.jvm.internal.s;
import p003kotlin.text.k0;

/* JADX INFO: loaded from: classes7.dex */
public final class k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final k f66608a = new k();

    public static final /* synthetic */ class a extends s implements Function1 {
        public static final a INSTANCE = new a();

        public a() {
            super(1, System.class, "identityHashCode" /* decoded XOR */, "identityHashCode(Ljava/lang/Object;)I" /* decoded XOR */, 0);
        }

        @Override // p003kotlin.jvm.functions.Function1
        public final Integer invoke(Object obj) {
            return Integer.valueOf(System.identityHashCode(obj));
        }
    }

    public static boolean a(Bitmap bitmap, Bitmap bitmap2) {
        "it" /* decoded XOR */;
        bitmap2.getClass();
        return bitmap2 != bitmap;
    }

    public final int b(String str, String str2) {
        "hash1" /* decoded XOR */;
        str.getClass();
        "hash2" /* decoded XOR */;
        str2.getClass();
        if (str.length() != str2.length()) {
            return -1;
        }
        int i10 = 0;
        for (t tVar : p003kotlin.text.m0.H1(str, str2)) {
            i10 += ((Character) tVar.component1()).charValue() == ((Character) tVar.component2()).charValue() ? 0 : 1;
        }
        return i10;
    }

    public final String c(Bitmap bitmap) {
        Bitmap bitmapL = l(bitmap);
        try {
            StringBuilder sb2 = new StringBuilder(64);
            for (int i10 = 0; i10 < 8; i10++) {
                int i11 = 0;
                while (i11 < 8) {
                    k kVar = f66608a;
                    int iG = kVar.g(bitmapL.getPixel(i11, i10));
                    i11++;
                    sb2.append(iG > kVar.g(bitmapL.getPixel(i11, i10)) ? '1' : '0');
                }
            }
            return sb2.toString();
        } finally {
            bitmapL.recycle();
        }
    }

    public final long d(String str) {
        "binary" /* decoded XOR */;
        str.getClass();
        String strSubstring = str.substring(0, Math.min(str.length(), 64));
        "substring(...)" /* decoded XOR */;
        try {
            return Long.parseUnsignedLong(strSubstring, 2);
        } catch (NumberFormatException unused) {
            return 0L;
        }
    }

    public final String e(long j10) {
        String binaryString = Long.toBinaryString(j10);
        "toBinaryString(...)" /* decoded XOR */;
        binaryString.getClass();
        return k0.D0(binaryString, 64, '0');
    }

    public final Bitmap f(Bitmap bitmap, Bitmap bitmap2) {
        Bitmap.Config config = bitmap.getConfig();
        Bitmap.Config config2 = Bitmap.Config.ARGB_8888;
        if (config == config2) {
            return bitmap;
        }
        Bitmap bitmapCopy = bitmap.copy(config2, false);
        if (bitmap != bitmap2) {
            bitmap.recycle();
        }
        bitmapCopy.getClass();
        return bitmapCopy;
    }

    public final int g(int i10) {
        return (((((i10 >>> 16) & 255) * 299) + (((i10 >>> 8) & 255) * 587)) + ((i10 & 255) * 114)) / 1000;
    }

    public final String h(Bitmap bitmap) {
        "bitmap" /* decoded XOR */;
        bitmap.getClass();
        Bitmap bitmapK = k(bitmap, 9, 8, false);
        Bitmap bitmapF = f(bitmapK, bitmap);
        String strI = i(bitmapF);
        if (strI == null) {
            strI = c(bitmapF);
        }
        j(bitmap, bitmapK, bitmapF);
        return strI;
    }

    public final String i(Bitmap bitmap) {
        Object objM372constructorimpl;
        ImageNUtils imageNUtils = ImageNUtils.INSTANCE;
        if (!imageNUtils.getNativeLoaded()) {
            return null;
        }
        try {
            u.a aVar = u.Companion;
            objM372constructorimpl = u.m372constructorimpl(e(imageNUtils.aa(bitmap)));
        } catch (Throwable th2) {
            u.a aVar2 = u.Companion;
            objM372constructorimpl = u.m372constructorimpl(v.a(th2));
        }
        return (String) (u.m377isFailureimpl(objM372constructorimpl) ? null : objM372constructorimpl);
    }

    public final void j(final Bitmap bitmap, Bitmap bitmap2, Bitmap bitmap3) {
        Iterator it = to.v.x(to.v.z(to.s.t(bitmap2, bitmap3), new Function1() { // from class: com.neeeex.similar3p.utils.j
            @Override // p003kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return Boolean.valueOf(k.a(bitmap, (Bitmap) obj));
            }
        }), a.INSTANCE).iterator();
        while (it.hasNext()) {
            ((Bitmap) it.next()).recycle();
        }
    }

    public final Bitmap k(Bitmap bitmap, int i10, int i11, boolean z10) {
        if (bitmap.getWidth() == i10 && bitmap.getHeight() == i11) {
            return bitmap;
        }
        Bitmap bitmapCreateScaledBitmap = Bitmap.createScaledBitmap(bitmap, i10, i11, z10);
        "createScaledBitmap(...)" /* decoded XOR */;
        bitmapCreateScaledBitmap.getClass();
        return bitmapCreateScaledBitmap;
    }

    public final Bitmap l(Bitmap bitmap) {
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(bitmap.getWidth(), bitmap.getHeight(), Bitmap.Config.ARGB_8888);
        "createBitmap(...)" /* decoded XOR */;
        bitmapCreateBitmap.getClass();
        Canvas canvas = new Canvas(bitmapCreateBitmap);
        Paint paint = new Paint();
        ColorMatrix colorMatrix = new ColorMatrix();
        colorMatrix.setSaturation(0.0f);
        paint.setColorFilter(new ColorMatrixColorFilter(colorMatrix));
        canvas.drawBitmap(bitmap, 0.0f, 0.0f, paint);
        return bitmapCreateBitmap;
    }
}