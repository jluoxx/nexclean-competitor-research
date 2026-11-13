package com.neeeex.eraser.push;

import android.content.Context;
import android.graphics.Color;
import android.text.Spannable;
import android.text.SpannableString;
import android.text.Spanned;
import android.text.style.ForegroundColorSpan;
import android.text.style.RelativeSizeSpan;
import android.text.style.StyleSpan;
import com.neeeex.eraser.R$color;
import com.neeeex.eraser.m0;
import com.neeeex.eraser.y;
import fl.t;
import fl.z;
import p003kotlin.text.k0;

/* JADX INFO: loaded from: classes7.dex */
public final class n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final n f65534a = new n();

    public static /* synthetic */ Spanned e(n nVar, String str, String[] strArr, float f10, int i10, Object obj) {
        if ((i10 & 4) != 0) {
            f10 = 1.0f;
        }
        return nVar.d(str, strArr, f10);
    }

    public final void a(Spannable spannable, int i10, int i11, int i12, float f10) {
        spannable.setSpan(new RelativeSizeSpan(f10), i10, i11, 33);
        spannable.setSpan(new ForegroundColorSpan(i12), i10, i11, 33);
        spannable.setSpan(new StyleSpan(1), i10, i11, 33);
    }

    public final Spanned b(String str, String str2, float f10) {
        SpannableString spannableString = new SpannableString(str);
        t tVarC = c(str, str2);
        if (tVarC != null) {
            a(spannableString, ((Number) tVarC.component1()).intValue(), ((Number) tVarC.component2()).intValue(), h(), f10);
        }
        return spannableString;
    }

    public final t c(String str, String str2) {
        int iP0 = k0.p0(str, str2, 0, false, 6, null);
        if (iP0 != -1) {
            return z.a(Integer.valueOf(iP0), Integer.valueOf(iP0 + str2.length()));
        }
        return null;
    }

    public final Spanned d(String str, String[] strArr, float f10) {
        float f11;
        m0.a("6J+O\n", "m+v8/XONl1A=\n");
        str.getClass();
        m0.a("I+7Ca/mKfQUlw9l/6A==\n", "V4+wDJz+LnE=\n");
        strArr.getClass();
        SpannableString spannableString = new SpannableString(str);
        int length = strArr.length;
        int i10 = 0;
        while (i10 < length) {
            String str2 = strArr[i10];
            String str3 = str;
            int iP0 = k0.p0(str3, str2, 0, false, 6, null);
            if (iP0 != -1) {
                int length2 = iP0 + str2.length();
                n nVar = f65534a;
                f11 = f10;
                nVar.a(spannableString, iP0, length2, nVar.h(), f11);
            } else {
                f11 = f10;
            }
            i10++;
            f10 = f11;
            str = str3;
        }
        return spannableString;
    }

    public final Spanned f(String str, String str2) {
        m0.a("+J4X\n", "i+plqHZq47g=\n");
        str.getClass();
        m0.a("thfMt2SNne+w\n", "wna+0AH5zps=\n");
        str2.getClass();
        return b(str, str2, 1.3f);
    }

    public final Spanned g(String str, String str2) {
        m0.a("694x\n", "mKpDtMK1QS8=\n");
        str.getClass();
        m0.a("lm+naru23Q+Q\n", "4g7VDd7Cjns=\n");
        str2.getClass();
        return b(str, str2, 1.5f);
    }

    public final int h() {
        Context contextA = y.Companion.a();
        return contextA != null ? contextA.getColor(R$color.color_neeeex_sub_4) : Color.parseColor(m0.a("rriirzzpWA==\n", "jYqT7QyvbBE=\n"));
    }
}