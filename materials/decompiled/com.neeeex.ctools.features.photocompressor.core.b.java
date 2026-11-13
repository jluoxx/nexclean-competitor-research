package com.neeeex.ctools.features.photocompressor.core;

import android.content.ContentResolver;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Matrix;
import android.media.ExifInterface;
import android.net.Uri;
import android.os.Build;
import coil.util.j;
import com.neeeex.eraser.m0;
import fl.u;
import fl.v;
import fl.z;
import gl.v0;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.util.Map;
import java.util.UUID;
import kotlinx.coroutines.f1;
import kotlinx.coroutines.i;
import kotlinx.coroutines.p0;
import ll.m;
import p003kotlin.text.k0;
import p003kotlin.text.p;
import s0.q;
import tl.n;

/* JADX INFO: loaded from: classes7.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f64585a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ContentResolver f64586b;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final String f64582d = m0.a("doqnEw0lsu9rkroCEQm+8g==\n", "BuLIZ2J60YA=\n");

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final a f64581c = new a(null);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final p f64583e = new p(m0.a("r1VlaTDifG3EJh1qNa4M\n", "9AskRGqDURc=\n"));

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final Map f64584f = v0.n(z.a(2, new c(0.0f, true)), z.a(3, new c(180.0f, false)), z.a(4, new c(180.0f, true)), z.a(5, new c(90.0f, true)), z.a(6, new c(90.0f, false)), z.a(7, new c(-90.0f, true)), z.a(8, new c(-90.0f, false)));

    /* JADX INFO: renamed from: com.neeeex.ctools.features.photocompressor.core.b$b, reason: collision with other inner class name */
    public final class C0753b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Uri f64587a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f64588b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public Bitmap f64589c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public File f64590d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final /* synthetic */ b f64591e;

        public C0753b(b bVar, Uri uri, String str) {
            m0.a("1a3QfHPnnunP\n", "psKlDhCCy5s=\n");
            uri.getClass();
            m0.a("ILDfWLJvpaw+ug==\n", "U9+qKtEK680=\n");
            str.getClass();
            this.f64591e = bVar;
            this.f64587a = uri;
            this.f64588b = str;
        }

        public final com.neeeex.ctools.features.photocompressor.core.a a() {
            try {
                b bVar = this.f64591e;
                Uri uri = this.f64587a;
                b(bVar.m(uri, bVar.n(uri)));
                b(this.f64591e.i(c(), this.f64591e.r(this.f64587a)));
                b(this.f64591e.t(c()));
                Bitmap bitmapC = c();
                g gVarE = com.neeeex.ctools.features.photocompressor.core.e.f64596a.e(bitmapC.hasAlpha());
                File fileQ = this.f64591e.q(this.f64588b, gVarE);
                this.f64590d = fileQ;
                this.f64591e.o(bitmapC, fileQ, gVarE);
                String name = fileQ.getName();
                m0.a("01wVmzdEm9yaF0/8\n", "tDlh1VYp/vQ=\n");
                name.getClass();
                com.neeeex.ctools.features.photocompressor.core.a aVar = new com.neeeex.ctools.features.photocompressor.core.a(fileQ, name, gVarE.getMimeType(), bitmapC.getWidth(), bitmapC.getHeight());
                Bitmap bitmap = this.f64589c;
                if (bitmap != null) {
                    this.f64591e.s(bitmap);
                }
                this.f64589c = null;
                return aVar;
            } catch (Throwable th2) {
                try {
                    File file = this.f64590d;
                    if (file != null) {
                        file.delete();
                    }
                    throw th2;
                } catch (Throwable th3) {
                    Bitmap bitmap2 = this.f64589c;
                    if (bitmap2 != null) {
                        this.f64591e.s(bitmap2);
                    }
                    this.f64589c = null;
                    throw th3;
                }
            }
        }

        public final void b(Bitmap bitmap) {
            Bitmap bitmap2 = this.f64589c;
            this.f64589c = bitmap;
            if (bitmap2 == null || bitmap2 == bitmap) {
                return;
            }
            this.f64591e.s(bitmap2);
        }

        public final Bitmap c() {
            Bitmap bitmap = this.f64589c;
            if (bitmap != null) {
                return bitmap;
            }
            q.a(m0.a("OdMUv56LlZxLwASmgpzQjwrFRaSClZzW\n", "a7Zlyvf58Pg=\n"));
            return null;
        }
    }

    public static final class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final float f64592a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final boolean f64593b;

        public c(float f10, boolean z10) {
            this.f64592a = f10;
            this.f64593b = z10;
        }

        public final boolean a() {
            return this.f64593b;
        }

        public final float b() {
            return this.f64592a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            return Float.compare(this.f64592a, cVar.f64592a) == 0 && this.f64593b == cVar.f64593b;
        }

        public int hashCode() {
            return (Float.hashCode(this.f64592a) * 31) + Boolean.hashCode(this.f64593b);
        }

        public String toString() {
            return "Transform(rotation=" + this.f64592a + ", flipX=" + this.f64593b + ")";
        }
    }

    public static final /* synthetic */ class d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f64594a;

        static {
            int[] iArr = new int[g.values().length];
            try {
                iArr[g.JPEG.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[g.WEBP.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f64594a = iArr;
        }
    }

    public static final class e extends m implements n {
        final /* synthetic */ String $sourceDisplayName;
        final /* synthetic */ Uri $sourceUri;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(Uri uri, String str, kl.f<? super e> fVar) {
            super(2, fVar);
            this.$sourceUri = uri;
            this.$sourceDisplayName = str;
        }

        @Override // ll.a
        public final kl.f<fl.m0> create(Object obj, kl.f<?> fVar) {
            return b.this.new e(this.$sourceUri, this.$sourceDisplayName, fVar);
        }

        @Override // tl.n
        public final Object invoke(p0 p0Var, kl.f<? super com.neeeex.ctools.features.photocompressor.core.a> fVar) {
            return ((e) create(p0Var, fVar)).invokeSuspend(fl.m0.f80959a);
        }

        @Override // ll.a
        public final Object invokeSuspend(Object obj) {
            p003kotlin.coroutines.intrinsics.c.f();
            if (this.label == 0) {
                v.b(obj);
                return new C0753b(b.this, this.$sourceUri, this.$sourceDisplayName).a();
            }
            gq.v0.a(m0.a("S9FCxAMq5JAPwkvbVjPulwjSS85MLO6QD9lA3kw17pcIx0fcS37o31rfW9xKMO4=\n", "KLAuqCNei7A=\n"));
            return null;
        }
    }

    public b(Context context) {
        m0.a("qlDe8dj16A==\n", "yT+whb2NnCA=\n");
        context.getClass();
        Context applicationContext = context.getApplicationContext();
        this.f64585a = applicationContext;
        this.f64586b = applicationContext.getContentResolver();
    }

    public final Bitmap i(Bitmap bitmap, int i10) {
        Matrix matrixP = p(i10);
        if (matrixP == null) {
            return bitmap;
        }
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(bitmap, 0, 0, bitmap.getWidth(), bitmap.getHeight(), matrixP, true);
        m0.a("g31bHEFR5seUYl8NHRqKgMk=\n", "4A8+fTU0pK4=\n");
        bitmapCreateBitmap.getClass();
        return bitmapCreateBitmap;
    }

    public final Bitmap.CompressFormat j(g gVar) {
        int i10 = d.f64594a[gVar.ordinal()];
        if (i10 == 1) {
            return Bitmap.CompressFormat.JPEG;
        }
        if (i10 == 2) {
            return u();
        }
        j.a();
        return null;
    }

    public final String k(String str, g gVar) {
        String strY1 = k0.y1(f64583e.replace(k0.t1(str, '.', str), m0.a("4g==\n", "vaxyF98ME+A=\n")), '_', '.', ' ');
        if (k0.r0(strY1)) {
            strY1 = m0.a("XtfcFpaXJGtY3O4WjJ0jdw==\n", "PbixZuTyVxg=\n");
        }
        String strG1 = p003kotlin.text.m0.G1(strY1, 64);
        String string = UUID.randomUUID().toString();
        m0.a("Gz1fcb5sIaJHfCIr5Q==\n", "b1IMBcwFT8U=\n");
        string.getClass();
        String strG2 = p003kotlin.text.m0.G1(string, 8);
        return strG1 + "_" + System.currentTimeMillis() + "_" + strG2 + "." + gVar.getExtension();
    }

    public final Object l(Uri uri, String str, kl.f fVar) {
        return i.g(f1.b(), new e(uri, str, null), fVar);
    }

    public final Bitmap m(Uri uri, f fVar) throws FileNotFoundException {
        BitmapFactory.Options options = new BitmapFactory.Options();
        options.inSampleSize = com.neeeex.ctools.features.photocompressor.core.e.f64596a.c(fVar.b(), fVar.a());
        InputStream inputStreamOpenInputStream = this.f64586b.openInputStream(uri);
        try {
            if (inputStreamOpenInputStream == null) {
                throw new IllegalArgumentException(m0.a("Ww8L/klmKYZlARnpCmp6z30OH/pLamWOagwb\n", "CGB+jCoDCe8=\n").toString());
            }
            Bitmap bitmapDecodeStream = BitmapFactory.decodeStream(inputStreamOpenInputStream, null, options);
            if (bitmapDecodeStream == null) {
                throw new IllegalArgumentException(m0.a("+UduwoyMXIjHSXzVz4oTlMZMO96AnVyDzwh/1YyGGITO\n", "qigbsO/pfOE=\n").toString());
            }
            ql.c.a(inputStreamOpenInputStream, null);
            return bitmapDecodeStream;
        } catch (Throwable th2) {
            try {
                throw th2;
            } catch (Throwable th3) {
                ql.c.a(inputStreamOpenInputStream, th2);
                throw th3;
            }
        }
    }

    public final f n(Uri uri) throws FileNotFoundException {
        int i10;
        BitmapFactory.Options options = new BitmapFactory.Options();
        options.inJustDecodeBounds = true;
        InputStream inputStreamOpenInputStream = this.f64586b.openInputStream(uri);
        try {
            if (inputStreamOpenInputStream == null) {
                throw new IllegalArgumentException(m0.a("9EmyEzymyBvKR6AEf6qbUtJIphc+qoQTxUqi\n", "pybHYV/D6HI=\n").toString());
            }
            BitmapFactory.decodeStream(inputStreamOpenInputStream, null, options);
            ql.c.a(inputStreamOpenInputStream, null);
            int i11 = options.outWidth;
            if (i11 > 0 && (i10 = options.outHeight) > 0) {
                return new f(i11, i10);
            }
            yl.d.a(m0.a("mzAwOzhaFzqlPiIse1tePq0xNiA0UURzqS0gaTJRQTKkNiE=\n", "yF9FSVs/N1M=\n"));
            return null;
        } catch (Throwable th2) {
            try {
                throw th2;
            } catch (Throwable th3) {
                ql.c.a(inputStreamOpenInputStream, th2);
                throw th3;
            }
        }
    }

    public final void o(Bitmap bitmap, File file, g gVar) {
        FileOutputStream fileOutputStream = new FileOutputStream(file);
        try {
            if (!bitmap.compress(j(gVar), 75, fileOutputStream)) {
                throw new IllegalStateException(m0.a("QwIZ5mUCpfV5TB3qagjh5DYPF+l5FeDyZQkcpGAK5OZz\n", "Fmx4hAlnhYE=\n").toString());
            }
            fl.m0 m0Var = fl.m0.f80959a;
            ql.c.a(fileOutputStream, null);
            if (file.length() > 0) {
                return;
            }
            q.a(m0.a("7FW9UwcMfQrKXvBKGAhpHI9TowMQBH4N1g==\n", "rzrQI3VpDnk=\n"));
        } catch (Throwable th2) {
            try {
                throw th2;
            } catch (Throwable th3) {
                ql.c.a(fileOutputStream, th2);
                throw th3;
            }
        }
    }

    public final Matrix p(int i10) {
        c cVar = (c) f64584f.get(Integer.valueOf(i10));
        if (cVar == null) {
            return null;
        }
        Matrix matrix = new Matrix();
        matrix.setRotate(cVar.b());
        if (cVar.a()) {
            matrix.postScale(-1.0f, 1.0f);
        }
        return matrix;
    }

    public final File q(String str, g gVar) {
        File file = new File(this.f64585a.getCacheDir(), f64582d);
        if (!file.exists() && !file.mkdirs()) {
            q.a(m0.a("MkTtuy8jlQ8ICu+rJifBHkdJ47QzNNAIFEPjt2Ml1BgPTw==\n", "ZyqM2UNGtXs=\n"));
            return null;
        }
        File[] fileArrListFiles = file.listFiles();
        if (fileArrListFiles == null) {
            fileArrListFiles = new File[0];
        }
        for (File file2 : fileArrListFiles) {
            ql.m.o(file2);
        }
        return new File(file, k(str, gVar));
    }

    public final int r(Uri uri) {
        Object objM372constructorimpl;
        try {
            u.a aVar = u.Companion;
            InputStream inputStreamOpenInputStream = this.f64586b.openInputStream(uri);
            try {
                if (inputStreamOpenInputStream == null) {
                    throw new IllegalArgumentException(m0.a("v96/RbxbMCTNza9coEx1N4zI7l6gRTlu\n", "7bvOMNUpVUA=\n").toString());
                }
                int attributeInt = new ExifInterface(inputStreamOpenInputStream).getAttributeInt(m0.a("MkH0eUfpvwwUXPM=\n", "fTOdHCmd3ng=\n"), 1);
                ql.c.a(inputStreamOpenInputStream, null);
                objM372constructorimpl = u.m372constructorimpl(Integer.valueOf(attributeInt));
                if (u.m377isFailureimpl(objM372constructorimpl)) {
                    objM372constructorimpl = 1;
                }
                return ((Number) objM372constructorimpl).intValue();
            } catch (Throwable th2) {
                try {
                    throw th2;
                } catch (Throwable th3) {
                    ql.c.a(inputStreamOpenInputStream, th2);
                    throw th3;
                }
            }
        } catch (Throwable th4) {
            u.a aVar2 = u.Companion;
            objM372constructorimpl = u.m372constructorimpl(v.a(th4));
        }
    }

    public final void s(Bitmap bitmap) {
        if (bitmap.isRecycled()) {
            return;
        }
        bitmap.recycle();
    }

    public final Bitmap t(Bitmap bitmap) {
        f fVarD = com.neeeex.ctools.features.photocompressor.core.e.f64596a.d(bitmap.getWidth(), bitmap.getHeight());
        if (p003kotlin.jvm.internal.v.c(fVarD, new f(bitmap.getWidth(), bitmap.getHeight()))) {
            return bitmap;
        }
        Bitmap bitmapCreateScaledBitmap = Bitmap.createScaledBitmap(bitmap, fVarD.b(), fVarD.a(), true);
        m0.a("UTNHdCFxUhlTLUdxF311F1MxCjt7Oig=\n", "MkEiFVUUAXo=\n");
        bitmapCreateScaledBitmap.getClass();
        return bitmapCreateScaledBitmap;
    }

    public final Bitmap.CompressFormat u() {
        return Build.VERSION.SDK_INT >= 30 ? Bitmap.CompressFormat.WEBP_LOSSY : Bitmap.CompressFormat.WEBP;
    }

    public static final class a {
        public /* synthetic */ a(p003kotlin.jvm.internal.m mVar) {
            this();
        }

        public a() {
        }
    }
}