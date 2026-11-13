package com.thinkup.core.common.dn;

import android.content.Context;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import com.tradplus.ads.base.Const;

/* JADX INFO: loaded from: classes7.dex */
public class d {

    /* JADX INFO: renamed from: d0, reason: collision with root package name */
    private static volatile d f68733d0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    SharedPreferences f68734d;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    final String f68735m = "IABTCF_PurposeConsents";

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    final String f68736n = "IABTCF_TCString";

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    final String f68737o = Const.SPUKEY.IABTCF_ADDTLCONSENT;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    final String f68738q = Const.SPUKEY.IABTCF_VENDORCONSENTS;

    private d(Context context) {
        this.f68734d = PreferenceManager.getDefaultSharedPreferences(context);
    }

    public static d d(Context context) {
        if (f68733d0 == null) {
            synchronized (d.class) {
                try {
                    if (f68733d0 == null) {
                        f68733d0 = new d(context);
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        return f68733d0;
    }

    public final String m() {
        SharedPreferences sharedPreferences = this.f68734d;
        return sharedPreferences != null ? sharedPreferences.getString("IABTCF_TCString", "") : "";
    }

    public final String n() {
        SharedPreferences sharedPreferences = this.f68734d;
        return sharedPreferences != null ? sharedPreferences.getString(Const.SPUKEY.IABTCF_ADDTLCONSENT, "") : "";
    }

    public final String o() {
        SharedPreferences sharedPreferences = this.f68734d;
        return sharedPreferences != null ? sharedPreferences.getString(Const.SPUKEY.IABTCF_VENDORCONSENTS, "") : "";
    }

    public final String d() {
        SharedPreferences sharedPreferences = this.f68734d;
        return sharedPreferences != null ? sharedPreferences.getString("IABTCF_PurposeConsents", "") : "";
    }
}