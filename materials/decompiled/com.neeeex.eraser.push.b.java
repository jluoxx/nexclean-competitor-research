package com.neeeex.eraser.push;

import android.content.Context;
import android.content.SharedPreferences;
import com.neeeex.eraser.m0;
import fl.u;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import p003kotlin.jvm.internal.v;

/* JADX INFO: loaded from: classes7.dex */
public final class b {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final String f65482b = m0.a("qQ6mp/9I8NKaDKa66E/4/6sAp6D6SfbBsQa8pw==\n", "xW/TyZwglaA=\n");

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final String f65483c = m0.a("SZcefDaUe7xwnxxjIJR0u3CCG30x\n", "L/ZyEFT1GNc=\n");

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final String f65484d = m0.a("OIQIlZHnDjojiySAug==\n", "VOV74c6UZlU=\n");

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final String f65485e = m0.a("kR3+ygdcEg2L\n", "8nKLpHMDdmw=\n");

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final String f65486f = m0.a("ZC3OIjM=\n", "B0K7TEf28ro=\n");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final b f65481a = new b();

    public static final synchronized boolean a(Context context, long j10) {
        m0.a("GrmP79xlVg==\n", "edbhm7kdImI=\n");
        context.getClass();
        if (ni.i.f89495a.w() && com.neeeex.eraser.module.report.bytedance.a.k()) {
            b bVar = f65481a;
            SharedPreferences sharedPreferencesD = bVar.d(context);
            long jG = bVar.g(context, j10);
            if (j10 >= jG && j10 - jG >= 10800000) {
                long j11 = sharedPreferencesD.getLong(f65484d, 0L);
                if (j11 <= j10 && j10 - j11 >= 2400000) {
                    return (v.c(sharedPreferencesD.getString(f65485e, null), bVar.c(j10)) ? sharedPreferencesD.getInt(f65486f, 0) : 0) < 7;
                }
                return false;
            }
            return false;
        }
        return false;
    }

    public static /* synthetic */ boolean b(Context context, long j10, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            j10 = System.currentTimeMillis();
        }
        return a(context, j10);
    }

    public static final synchronized void e(Context context, long j10) {
        try {
            m0.a("hWxO49RuxQ==\n", "5gMgl7EWsSg=\n");
            context.getClass();
            b bVar = f65481a;
            SharedPreferences sharedPreferencesD = bVar.d(context);
            String strC = bVar.c(j10);
            String str = f65485e;
            sharedPreferencesD.edit().putLong(f65484d, j10).putString(str, strC).putInt(f65486f, (v.c(sharedPreferencesD.getString(str, null), strC) ? sharedPreferencesD.getInt(f65486f, 0) : 0) + 1).apply();
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public static /* synthetic */ void f(Context context, long j10, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            j10 = System.currentTimeMillis();
        }
        e(context, j10);
    }

    public final String c(long j10) {
        String str = new SimpleDateFormat(m0.a("vCoLW+3ofyuhNw==\n", "xVNyIsClMgY=\n"), Locale.US).format(new Date(j10));
        m0.a("fggL9d7NyEk2SVA=\n", "GGd5mL+54Gc=\n");
        str.getClass();
        return str;
    }

    public final SharedPreferences d(Context context) {
        return context.getApplicationContext().getSharedPreferences(f65482b, 0);
    }

    public final long g(Context context, long j10) {
        Object objM372constructorimpl;
        try {
            u.a aVar = u.Companion;
            objM372constructorimpl = u.m372constructorimpl(Long.valueOf(context.getPackageManager().getPackageInfo(context.getPackageName(), 0).firstInstallTime));
        } catch (Throwable th2) {
            u.a aVar2 = u.Companion;
            objM372constructorimpl = u.m372constructorimpl(fl.v.a(th2));
        }
        if (u.m377isFailureimpl(objM372constructorimpl)) {
            objM372constructorimpl = 0L;
        }
        long jLongValue = ((Number) objM372constructorimpl).longValue();
        if (jLongValue > 0) {
            return jLongValue;
        }
        SharedPreferences sharedPreferencesD = d(context);
        String str = f65483c;
        long j11 = sharedPreferencesD.getLong(str, 0L);
        if (j11 > 0) {
            return j11;
        }
        sharedPreferencesD.edit().putLong(str, j10).apply();
        return j10;
    }
}