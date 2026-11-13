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
    public static final List f66192b = gl.w.p(m0.a("DqL3pvl0lT8StQ==\n", "fcGFw5wa5lc=\n"), m0.a("SCkFKb9j4qRLPgI+vw==\n", "O0p3TNoNgcU=\n"), m0.a("WiNdSDepkvRZ\n", "KUAvLVLH8ZU=\n"), m0.a("VsjKXAaB\n", "sEBguZ0/HRM=\n"), m0.a("2kNFMBvP\n", "PMvv1apA8ZU=\n"));

    public final boolean a(String str) {
        m0.a("AUBS1SB8XIw=\n", "cSEmvWgVMvg=\n");
        str.getClass();
        Locale locale = Locale.ROOT;
        m0.a("rmLFQQ==\n", "/C2KFREwtQM=\n");
        locale.getClass();
        String lowerCase = str.toLowerCase(locale);
        m0.a("xeLr4H8Yl9fQ/sKnJlPLvQ==\n", "sY2njwh95ZQ=\n");
        lowerCase.getClass();
        String strO = p003kotlin.text.e0.O(p003kotlin.text.e0.O(p003kotlin.text.e0.O(lowerCase, m0.a("1A==\n", "iz0YKV3SicE=\n"), "", false, 4, null), m0.a("hA==\n", "qedftIQDJiM=\n"), "", false, 4, null), " ", "", false, 4, null);
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