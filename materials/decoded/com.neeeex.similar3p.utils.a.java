package com.neeeex.similar3p.utils;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.webkit.MimeTypeMap;
import android.widget.Toast;
import androidx.core.content.FileProvider;
import com.neeeex.eraser.R$string;
import com.neeeex.eraser.m0;
import com.neeeex.eraser.recover.reco.p.PhotoFullPreviewNEEEEXActivity;
import com.neeeex.eraser.recover.reco.v.VideoFullPreviewNEEEEXActivity;
import fl.e0;
import fl.u;
import fl.z;
import gl.v0;
import java.io.File;
import java.util.Locale;
import java.util.Map;
import p003kotlin.jvm.internal.v;
import ql.m;
import to.s;

/* JADX INFO: loaded from: classes7.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f66545a = new a();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Map f66546b = v0.n(z.a("apk" /* decoded XOR */, "application/vnd.android.package-archive" /* decoded XOR */), z.a("txt" /* decoded XOR */, "text/plain" /* decoded XOR */), z.a("log" /* decoded XOR */, "text/plain" /* decoded XOR */), z.a("csv" /* decoded XOR */, "text/plain" /* decoded XOR */), z.a("json" /* decoded XOR */, "application/json" /* decoded XOR */), z.a("xml" /* decoded XOR */, "application/xml" /* decoded XOR */), z.a("html" /* decoded XOR */, "text/html" /* decoded XOR */), z.a("htm" /* decoded XOR */, "text/html" /* decoded XOR */), z.a("mp4" /* decoded XOR */, "video/mp4" /* decoded XOR */), z.a("m4v" /* decoded XOR */, "video/mp4" /* decoded XOR */), z.a("avi" /* decoded XOR */, "video/x-msvideo" /* decoded XOR */), z.a("mkv" /* decoded XOR */, "video/x-matroska" /* decoded XOR */), z.a("mov" /* decoded XOR */, "video/quicktime" /* decoded XOR */), z.a("3gp" /* decoded XOR */, "video/3gpp" /* decoded XOR */), z.a("webm" /* decoded XOR */, "video/webm" /* decoded XOR */));

    /* JADX INFO: renamed from: com.neeeex.similar3p.utils.a$a, reason: collision with other inner class name */
    public interface InterfaceC0816a {

        /* JADX INFO: renamed from: com.neeeex.similar3p.utils.a$a$a, reason: collision with other inner class name */
        public static final class C0817a implements InterfaceC0816a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final C0817a f66547a = new C0817a();

            public boolean equals(Object obj) {
                return this == obj || (obj instanceof C0817a);
            }

            public int hashCode() {
                return 159048952;
            }

            public String toString() {
                return "ExternalViewer" /* decoded XOR */;
            }
        }

        /* JADX INFO: renamed from: com.neeeex.similar3p.utils.a$a$b */
        public static final class b implements InterfaceC0816a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final b f66548a = new b();

            public boolean equals(Object obj) {
                return this == obj || (obj instanceof b);
            }

            public int hashCode() {
                return -1717116952;
            }

            public String toString() {
                return "ImagePreview" /* decoded XOR */;
            }
        }

        /* JADX INFO: renamed from: com.neeeex.similar3p.utils.a$a$c */
        public static final class c implements InterfaceC0816a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final c f66549a = new c();

            public boolean equals(Object obj) {
                return this == obj || (obj instanceof c);
            }

            public int hashCode() {
                return 1832431816;
            }

            public String toString() {
                return "VideoPreview" /* decoded XOR */;
            }
        }
    }

    public static final /* synthetic */ class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f66550a;

        static {
            int[] iArr = new int[yi.f.values().length];
            try {
                iArr[yi.f.IMAGE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[yi.f.VIDEO.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[yi.f.DOCUMENT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[yi.f.OTHER.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            f66550a = iArr;
        }
    }

    public final Intent a(Uri uri, String str) {
        Intent intent = new Intent("android.intent.action.VIEW" /* decoded XOR */);
        intent.setDataAndType(uri, str);
        intent.addFlags(1);
        return intent;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final String b(File file) {
        String strP = m.p(file);
        Locale locale = Locale.getDefault();
        "getDefault(...)" /* decoded XOR */;
        locale.getClass();
        String lowerCase = strP.toLowerCase(locale);
        "toLowerCase(...)" /* decoded XOR */;
        lowerCase.getClass();
        for (Object obj : s.t(MimeTypeMap.getSingleton().getMimeTypeFromExtension(lowerCase), f66546b.get(lowerCase), "*/*" /* decoded XOR */)) {
            String str = (String) obj;
            if (!(str == null || str.length() == 0)) {
                obj.getClass();
                return str;
            }
        }
        e0.a("Sequence contains no element matching the predicate." /* decoded XOR */);
        return null;
    }

    public final void c(Context context, yi.e eVar) {
        "context" /* decoded XOR */;
        context.getClass();
        "fileItem" /* decoded XOR */;
        eVar.getClass();
        InterfaceC0816a interfaceC0816aH = h(eVar);
        if (v.c(interfaceC0816aH, InterfaceC0816a.b.f66548a)) {
            d(context, eVar);
            return;
        }
        if (v.c(interfaceC0816aH, InterfaceC0816a.c.f66549a)) {
            e(context, eVar);
        } else if (v.c(interfaceC0816aH, InterfaceC0816a.C0817a.f66547a)) {
            f(context, eVar);
        } else {
            coil.util.j.a();
        }
    }

    public final void d(Context context, yi.e eVar) {
        PhotoFullPreviewNEEEEXActivity.INSTANCE.b(context, eVar.g());
    }

    public final void e(Context context, yi.e eVar) {
        VideoFullPreviewNEEEEXActivity.INSTANCE.a(context, eVar.g());
    }

    public final void f(Context context, yi.e eVar) {
        Object objM372constructorimpl;
        try {
            u.a aVar = u.Companion;
            File fileD = eVar.d();
            Uri uriForFile = FileProvider.getUriForFile(context, g(context), fileD);
            uriForFile.getClass();
            Intent intentA = a(uriForFile, b(fileD));
            Intent intentCreateChooser = intentA.resolveActivity(context.getPackageManager()) != null ? intentA : null;
            if (intentCreateChooser == null) {
                intentCreateChooser = Intent.createChooser(intentA, context.getString(R$string.neeeex_open_with));
            }
            context.startActivity(intentCreateChooser);
            objM372constructorimpl = u.m372constructorimpl(intentCreateChooser);
        } catch (Throwable th2) {
            u.a aVar2 = u.Companion;
            objM372constructorimpl = u.m372constructorimpl(fl.v.a(th2));
        }
        if (u.m375exceptionOrNullimpl(objM372constructorimpl) != null) {
            Toast.makeText(context, context.getString(R$string.neeeex_cannot_open_file), 0).show();
        }
    }

    public final String g(Context context) {
        return context.getPackageName() + ".provider";
    }

    public final InterfaceC0816a h(yi.e eVar) {
        int i10 = b.f66550a[eVar.j().ordinal()];
        if (i10 == 1) {
            return InterfaceC0816a.b.f66548a;
        }
        if (i10 == 2) {
            return InterfaceC0816a.c.f66549a;
        }
        if (i10 == 3 || i10 == 4) {
            return InterfaceC0816a.C0817a.f66547a;
        }
        coil.util.j.a();
        return null;
    }
}