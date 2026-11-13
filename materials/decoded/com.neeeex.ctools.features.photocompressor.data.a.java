package com.neeeex.ctools.features.photocompressor.data;

import android.content.ContentResolver;
import android.content.ContentValues;
import android.content.Context;
import android.media.MediaScannerConnection;
import android.net.Uri;
import android.os.Build;
import android.os.Environment;
import android.provider.MediaStore;
import com.neeeex.eraser.m0;
import fl.u;
import fl.v;
import gq.v0;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.OutputStream;
import kotlinx.coroutines.f1;
import kotlinx.coroutines.i;
import kotlinx.coroutines.p;
import kotlinx.coroutines.p0;
import ll.h;
import ll.l;
import ll.m;
import p003kotlin.jvm.functions.Function1;
import p003kotlin.text.k0;
import s0.q;
import tl.n;

/* JADX INFO: loaded from: classes7.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f64605a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ContentResolver f64606b;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final String f64604d = "NEEEEX/Photo Compressor" /* decoded XOR */;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final C0754a f64603c = new C0754a(null);

    public final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Uri f64607a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ a f64608b;

        public b(a aVar, Uri uri) {
            "uri" /* decoded XOR */;
            uri.getClass();
            this.f64608b = aVar;
            this.f64607a = uri;
        }

        public final Uri a(File file) {
            Object objM372constructorimpl;
            "source" /* decoded XOR */;
            file.getClass();
            try {
                this.f64608b.g(file, this.f64607a);
                if (this.f64608b.f64606b.update(this.f64607a, this.f64608b.n(), null, null) > 0) {
                    return this.f64607a;
                }
                throw new IllegalStateException("Unable to publish output image" /* decoded XOR */.toString());
            } catch (Throwable th2) {
                a aVar = this.f64608b;
                try {
                    u.a aVar2 = u.Companion;
                    objM372constructorimpl = u.m372constructorimpl(Integer.valueOf(aVar.f64606b.delete(this.f64607a, null, null)));
                } catch (Throwable th3) {
                    u.a aVar3 = u.Companion;
                    objM372constructorimpl = u.m372constructorimpl(v.a(th3));
                }
                Throwable thM375exceptionOrNullimpl = u.m375exceptionOrNullimpl(objM372constructorimpl);
                if (thM375exceptionOrNullimpl == null) {
                    throw th2;
                }
                th2.addSuppressed(thM375exceptionOrNullimpl);
                throw th2;
            }
        }
    }

    public static final class c extends m implements n {
        final /* synthetic */ com.neeeex.ctools.features.photocompressor.core.a $artifact;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(com.neeeex.ctools.features.photocompressor.core.a aVar, kl.f<? super c> fVar) {
            super(2, fVar);
            this.$artifact = aVar;
        }

        @Override // ll.a
        public final kl.f<fl.m0> create(Object obj, kl.f<?> fVar) {
            return a.this.new c(this.$artifact, fVar);
        }

        @Override // tl.n
        public final Object invoke(p0 p0Var, kl.f<? super Uri> fVar) {
            return ((c) create(p0Var, fVar)).invokeSuspend(fl.m0.f80959a);
        }

        @Override // ll.a
        public final Object invokeSuspend(Object obj) throws Throwable {
            Object objF = p003kotlin.coroutines.intrinsics.c.f();
            int i10 = this.label;
            if (i10 == 0) {
                v.b(obj);
                int i11 = Build.VERSION.SDK_INT;
                a aVar = a.this;
                if (i11 >= 29) {
                    return aVar.m(this.$artifact);
                }
                com.neeeex.ctools.features.photocompressor.core.a aVar2 = this.$artifact;
                this.label = 1;
                obj = aVar.l(aVar2, this);
                if (obj == objF) {
                    return objF;
                }
            } else {
                if (i10 != 1) {
                    v0.a("call to 'resume' before 'invoke' with coroutine" /* decoded XOR */);
                    return null;
                }
                v.b(obj);
            }
            return (Uri) obj;
        }
    }

    public static final class d extends ll.d {
        Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        int label;
        /* synthetic */ Object result;

        public d(kl.f<? super d> fVar) {
            super(fVar);
        }

        @Override // ll.a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return a.this.l(null, this);
        }
    }

    public static final class e implements Function1 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ File f64609a;

        public e(File file) {
            this.f64609a = file;
        }

        public final void a(Throwable th2) {
            this.f64609a.delete();
        }

        @Override // p003kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((Throwable) obj);
            return fl.m0.f80959a;
        }
    }

    public static final class f implements MediaScannerConnection.OnScanCompletedListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ kotlinx.coroutines.n f64610a;

        public f(kotlinx.coroutines.n nVar) {
            this.f64610a = nVar;
        }

        @Override // android.media.MediaScannerConnection.OnScanCompletedListener
        public final void onScanCompleted(String str, Uri uri) {
            if (this.f64610a.isActive()) {
                kotlinx.coroutines.n nVar = this.f64610a;
                if (uri != null) {
                    nVar.resumeWith(u.m372constructorimpl(uri));
                } else {
                    u.a aVar = u.Companion;
                    nVar.resumeWith(u.m372constructorimpl(v.a(new IOException("Media scan failed" /* decoded XOR */))));
                }
            }
        }
    }

    public a(Context context) {
        "context" /* decoded XOR */;
        context.getClass();
        Context applicationContext = context.getApplicationContext();
        this.f64605a = applicationContext;
        this.f64606b = applicationContext.getContentResolver();
    }

    public final void g(File file, Uri uri) throws FileNotFoundException {
        OutputStream outputStreamOpenOutputStream = this.f64606b.openOutputStream(uri, "w" /* decoded XOR */);
        try {
            if (outputStreamOpenOutputStream == null) {
                throw new IllegalArgumentException("Unable to open output image" /* decoded XOR */.toString());
            }
            FileInputStream fileInputStream = new FileInputStream(file);
            try {
                ql.b.b(fileInputStream, outputStreamOpenOutputStream, 0, 2, null);
                ql.c.a(fileInputStream, null);
                ql.c.a(outputStreamOpenOutputStream, null);
            } catch (Throwable th2) {
                try {
                    throw th2;
                } catch (Throwable th3) {
                    ql.c.a(fileInputStream, th2);
                    throw th3;
                }
            }
        } catch (Throwable th4) {
            try {
                throw th4;
            } catch (Throwable th5) {
                ql.c.a(outputStreamOpenOutputStream, th4);
                throw th5;
            }
        }
    }

    public final b h(com.neeeex.ctools.features.photocompressor.core.a aVar) {
        Uri uriInsert = this.f64606b.insert(MediaStore.Images.Media.EXTERNAL_CONTENT_URI, j(aVar));
        if (uriInsert != null) {
            return new b(this, uriInsert);
        }
        yl.d.a("Unable to create output image" /* decoded XOR */);
        return null;
    }

    public final File i(File file) {
        if (file.exists() || file.mkdirs()) {
            return file;
        }
        q.a("Unable to create output directory" /* decoded XOR */);
        return null;
    }

    public final ContentValues j(com.neeeex.ctools.features.photocompressor.core.a aVar) {
        ContentValues contentValues = new ContentValues();
        contentValues.put("_display_name" /* decoded XOR */, aVar.a());
        contentValues.put("mime_type" /* decoded XOR */, aVar.c());
        contentValues.put("relative_path" /* decoded XOR */, "Pictures/NEEEEX/Photo Compressor/" /* decoded XOR */);
        contentValues.put("is_pending" /* decoded XOR */, (Integer) 1);
        return contentValues;
    }

    public final Object k(com.neeeex.ctools.features.photocompressor.core.a aVar, kl.f fVar) {
        return i.g(f1.b(), new c(aVar, null), fVar);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object l(com.neeeex.ctools.features.photocompressor.core.a aVar, kl.f fVar) throws Throwable {
        d dVar;
        Throwable th2;
        File file;
        if (fVar instanceof d) {
            dVar = (d) fVar;
            int i10 = dVar.label;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                dVar.label = i10 - Integer.MIN_VALUE;
            } else {
                dVar = new d(fVar);
            }
        } else {
            dVar = new d(fVar);
        }
        Object objO = dVar.result;
        Object objF = p003kotlin.coroutines.intrinsics.c.f();
        int i11 = dVar.label;
        if (i11 == 0) {
            v.b(objO);
            File externalStoragePublicDirectory = Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_PICTURES);
            File fileI = i(new File(externalStoragePublicDirectory, f64604d));
            File fileP = p(fileI, aVar.a());
            try {
                ql.m.n(aVar.b(), fileP, false, 0, 4, null);
                String strC = aVar.c();
                dVar.L$0 = l.a(aVar);
                dVar.L$1 = l.a(externalStoragePublicDirectory);
                dVar.L$2 = l.a(fileI);
                dVar.L$3 = fileP;
                dVar.label = 1;
                objO = o(fileP, strC, dVar);
                if (objO == objF) {
                    return objF;
                }
                file = fileP;
            } catch (Throwable th3) {
                th2 = th3;
                file = fileP;
                file.delete();
                throw th2;
            }
        } else {
            if (i11 != 1) {
                v0.a("call to 'resume' before 'invoke' with coroutine" /* decoded XOR */);
                return null;
            }
            file = (File) dVar.L$3;
            try {
                v.b(objO);
            } catch (Throwable th4) {
                th2 = th4;
                file.delete();
                throw th2;
            }
        }
        return (Uri) objO;
    }

    public final Uri m(com.neeeex.ctools.features.photocompressor.core.a aVar) {
        return h(aVar).a(aVar.b());
    }

    public final ContentValues n() {
        ContentValues contentValues = new ContentValues();
        contentValues.put("is_pending" /* decoded XOR */, (Integer) 0);
        return contentValues;
    }

    public final Object o(File file, String str, kl.f fVar) {
        p pVar = new p(p003kotlin.coroutines.intrinsics.b.c(fVar), 1);
        pVar.D();
        pVar.B(new e(file));
        MediaScannerConnection.scanFile(this.f64605a, new String[]{file.getAbsolutePath()}, new String[]{str}, new f(pVar));
        Object objV = pVar.v();
        if (objV == p003kotlin.coroutines.intrinsics.c.f()) {
            h.c(fVar);
        }
        return objV;
    }

    public final File p(File file, String str) {
        String str2;
        String str3;
        String strT1 = k0.t1(str, '.', str);
        String strL1 = k0.l1(str, '.', "");
        int i10 = 0;
        while (true) {
            if (i10 == 0) {
                str2 = "";
            } else {
                str2 = "_" + i10;
            }
            if (k0.r0(strL1)) {
                str3 = "";
            } else {
                str3 = "." + strL1;
            }
            File file2 = new File(file, strT1 + str2 + str3);
            if (!file2.exists()) {
                return file2;
            }
            i10++;
        }
    }

    /* JADX INFO: renamed from: com.neeeex.ctools.features.photocompressor.data.a$a, reason: collision with other inner class name */
    public static final class C0754a {
        public /* synthetic */ C0754a(p003kotlin.jvm.internal.m mVar) {
            this();
        }

        public C0754a() {
        }
    }
}