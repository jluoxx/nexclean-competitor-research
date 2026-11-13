package com.neeeex.eraser.utils;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import com.neeeex.eraser.m0;
import java.util.Locale;

/* JADX INFO: loaded from: classes7.dex */
public abstract class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final String f66156a = "system" /* decoded XOR */;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final String f66157b = "zh" /* decoded XOR */;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final String f66158c = "zh-rCN" /* decoded XOR */;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final String f66159d = "zh-rTW" /* decoded XOR */;

    public static Locale a() {
        return Resources.getSystem().getConfiguration().getLocales().get(0);
    }

    public static Context b(Context context) {
        return e(context, f.f66153a.a());
    }

    public static Locale c(String str, Locale locale) {
        if (str != null) {
            if (f66157b.equals(str) || f66158c.equals(str)) {
                return Locale.SIMPLIFIED_CHINESE;
            }
            if (f66159d.equals(str)) {
                return Locale.TRADITIONAL_CHINESE;
            }
        }
        return locale;
    }

    public static Locale d(String str) {
        return f66156a.equals(str) ? a() : new Locale(str);
    }

    public static Context e(Context context, String str) {
        Locale localeD = d(str);
        Locale.setDefault(localeD);
        Resources resources = context.getResources();
        Configuration configuration = resources.getConfiguration();
        configuration.locale = c(str, localeD);
        resources.updateConfiguration(configuration, resources.getDisplayMetrics());
        return context;
    }
}