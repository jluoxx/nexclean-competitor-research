package com.neeeex.eraser.utils;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.webkit.MimeTypeMap;
import androidx.core.content.FileProvider;
import com.android.systemui.shared.system.QuickStepContract;
import com.neeeex.eraser.R$drawable;
import com.neeeex.eraser.m0;
import java.io.File;
import java.util.Arrays;
import p003kotlin.jvm.internal.b1;
import p003kotlin.text.k0;

/* JADX INFO: loaded from: classes7.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final c f66140a = new c();

    public static final /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f66141a;

        static {
            int[] iArr = new int[yi.g.values().length];
            try {
                iArr[yi.g.FILE_TYPE_DIRECTORY.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[yi.g.FILE_TYPE_AUDIO.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[yi.g.FILE_TYPE_TXT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[yi.g.FILE_TYPE_ZIP.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[yi.g.FILE_TYPE_XLS.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[yi.g.FILE_TYPE_PPT.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[yi.g.FILE_TYPE_PDF.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[yi.g.FILE_TYPE_APK.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr[yi.g.FILE_TYPE_DOC.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            f66141a = iArr;
        }
    }

    public final fl.t a(long j10, int i10) {
        String str;
        String str2;
        fl.t tVarA;
        if (j10 == 0) {
            return fl.z.a(m0.a("MQ==\n", "AVrTf7K9ehY=\n"), m0.a("NT4=\n", "fnwZlKDaZzI=\n"));
        }
        if (i10 == 1) {
            str = "airHMg==\n";
            str2 = "TwT2VB8ri4E=\n";
        } else {
            str = "yUEmpg==\n";
            str2 = "7G8UwJjdu7Q=\n";
        }
        String strA = m0.a(str, str2);
        if (j10 >= QuickStepContract.SYSUI_STATE_NOTIFICATION_PANEL_VISIBLE) {
            tVarA = fl.z.a(Long.valueOf(QuickStepContract.SYSUI_STATE_NOTIFICATION_PANEL_VISIBLE), m0.a("sLs=\n", "9/mHUjlyqUw=\n"));
        } else {
            tVarA = j10 >= 1048576 ? fl.z.a(1048576L, m0.a("ccY=\n", "PIRtfdPege0=\n")) : fl.z.a(1024L, m0.a("k6o=\n", "2OhVJzRKF0Q=\n"));
        }
        long jLongValue = ((Number) tVarA.component1()).longValue();
        String str3 = (String) tVarA.component2();
        b1 b1Var = b1.f86707a;
        String str4 = String.format(strA, Arrays.copyOf(new Object[]{Double.valueOf(j10 / jLongValue)}, 1));
        m0.a("/kXL14NLYSG2BJA=\n", "mCq5uuI/SQ8=\n");
        return fl.z.a(i(str4), str3);
    }

    public final String b(long j10) {
        long j11 = j10 / ((long) 1000);
        long j12 = 60;
        String str = String.format(m0.a("A0OcKNhCY6pC\n", "JnOuTOJnU5g=\n"), Arrays.copyOf(new Object[]{Long.valueOf(j11 / j12), Long.valueOf(j11 % j12)}, 2));
        m0.a("myJgIv+E4pfTYzs=\n", "/U0ST57wyrk=\n");
        return str;
    }

    public final String c(String str) {
        Object objM372constructorimpl;
        int iU0 = k0.u0(str, '.', 0, false, 6, null);
        if (iU0 < 1 || iU0 >= str.length() - 1) {
            return null;
        }
        String strSubstring = str.substring(iU0 + 1);
        m0.a("x3xD4kndbBTTIQ+/E4Y=\n", "tAkhkT2vBXo=\n");
        try {
            fl.u.a aVar = fl.u.Companion;
            objM372constructorimpl = fl.u.m372constructorimpl(MimeTypeMap.getSingleton().getMimeTypeFromExtension(strSubstring));
        } catch (Throwable th2) {
            fl.u.a aVar2 = fl.u.Companion;
            objM372constructorimpl = fl.u.m372constructorimpl(fl.v.a(th2));
        }
        return (String) (fl.u.m377isFailureimpl(objM372constructorimpl) ? null : objM372constructorimpl);
    }

    public final int d(int i10) {
        switch (i10) {
            case 1:
                return R$drawable.ic_neeeex_file_txt;
            case 2:
                return R$drawable.ic_neeeex_file_pdf;
            case 3:
                return R$drawable.ic_neeeex_file_doc;
            case 4:
                return R$drawable.ic_neeeex_file_xls;
            case 5:
                return R$drawable.ic_neeeex_file_ppt;
            case 6:
                return R$drawable.ic_neeeex_file_zip;
            case 7:
                return R$drawable.ic_neeeex_file_apk;
            case 8:
            default:
                return R$drawable.ic_neeeex_file_unknown;
            case 9:
                return R$drawable.ic_neeeex_file_mp3;
        }
    }

    public final int e(yi.g gVar) {
        m0.a("8HZ+45WAUuk=\n", "lh8ShsH5Iow=\n");
        gVar.getClass();
        switch (a.f66141a[gVar.ordinal()]) {
            case 1:
                return R$drawable.ic_neeeex_file_folder;
            case 2:
                return R$drawable.ic_neeeex_file_mp3;
            case 3:
                return R$drawable.ic_neeeex_file_txt;
            case 4:
                return R$drawable.ic_neeeex_file_zip;
            case 5:
                return R$drawable.ic_neeeex_file_xls;
            case 6:
                return R$drawable.ic_neeeex_file_ppt;
            case 7:
                return R$drawable.ic_neeeex_file_pdf;
            case 8:
                return R$drawable.ic_neeeex_file_apk;
            case 9:
                return R$drawable.ic_neeeex_file_doc;
            default:
                return R$drawable.ic_neeeex_file_unknown;
        }
    }

    public final boolean f(Context context, Uri uri, String str) {
        Object objM372constructorimpl;
        try {
            fl.u.a aVar = fl.u.Companion;
            Intent intent = new Intent(m0.a("dWWtfJ0Tvp99Zb1rnA700Hd/oGGcVIz4UVw=\n", "FAvJDvJ62rE=\n"));
            intent.addFlags(1);
            intent.setDataAndType(uri, str);
            context.startActivity(intent);
            objM372constructorimpl = fl.u.m372constructorimpl(fl.m0.f80959a);
        } catch (Throwable th2) {
            fl.u.a aVar2 = fl.u.Companion;
            objM372constructorimpl = fl.u.m372constructorimpl(fl.v.a(th2));
        }
        return fl.u.m378isSuccessimpl(objM372constructorimpl);
    }

    public final void g(Context context, String str) {
        m0.a("k+IOr5Pf3Q==\n", "8I1g2/anqQU=\n");
        context.getClass();
        m0.a("KuHhjTsjucM=\n", "TIiN6GtCzas=\n");
        str.getClass();
        Uri uriH = h(context, str);
        String strC = c(str);
        if (strC == null) {
            strC = m0.a("kKiD\n", "uoepyg29nyY=\n");
        }
        if (f(context, uriH, strC) || p003kotlin.jvm.internal.v.c(strC, m0.a("CeGv\n", "I86FhB+FhLA=\n"))) {
            return;
        }
        f(context, uriH, m0.a("svRw\n", "mNta4YqUpsA=\n"));
    }

    public final Uri h(Context context, String str) {
        Uri uriForFile = FileProvider.getUriForFile(context, context.getPackageName() + ".provider", new File(str));
        m0.a("GJWzq+tLClkNtq6S/ApiGFHZ\n", "f/DH/pkiTDY=\n");
        uriForFile.getClass();
        return uriForFile;
    }

    public final String i(String str) {
        int iO0 = k0.o0(str, '.', 0, false, 6, null);
        if (iO0 >= 0) {
            if (p003kotlin.text.e0.E(str, m0.a("MsY=\n", "HPYLdCKTM1g=\n"), false, 2, null)) {
                String strSubstring = str.substring(0, iO0);
                m0.a("maVCmWh7pJuN+A7EMiA=\n", "6tAg6hwJzfU=\n");
                return strSubstring;
            }
            if (p003kotlin.text.m0.D1(str) == '0') {
                return p003kotlin.text.m0.B1(str, 1);
            }
        }
        return str;
    }
}