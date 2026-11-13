package com.neeeex.eraser.utils;

import com.neeeex.eraser.m0;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import p003kotlin.text.k0;

/* JADX INFO: loaded from: classes7.dex */
public final class l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final l f66191a = new l();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final List f66192b = gl.w.p("screenshot" /* decoded XOR */, "screencapture" /* decoded XOR */, "screencap" /* decoded XOR */, "截图" /* decoded XOR */, "截屏" /* decoded XOR */);

    public final boolean a(String str) {
        "pathHint" /* decoded XOR */;
        str.getClass();
        Locale locale = Locale.ROOT;
        "ROOT" /* decoded XOR */;
        locale.getClass();
        String lowerCase = str.toLowerCase(locale);
        "toLowerCase(...)" /* decoded XOR */;
        lowerCase.getClass();
        String strO = p003kotlin.text.e0.O(p003kotlin.text.e0.O(p003kotlin.text.e0.O(lowerCase, "_" /* decoded XOR */, "", false, 4, null), "-" /* decoded XOR */, "", false, 4, null), " ", "", false, 4, null);
        List list = f66192b;
        if ((list instanceof Collection) && list.isEmpty()) {
            return false;
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            if (k0.c0(strO, (CharSequence) it.next(), false, 2, null)) {
                return true;
            }
        }
        return false;
    }
}