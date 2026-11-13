package com.neeeex.ctools.features.appmanager;

import android.content.Intent;
import android.net.Uri;
import com.neeeex.eraser.m0;

/* JADX INFO: loaded from: classes7.dex */
public final class r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final r f64232a = new r();

    public final Intent a(String str) {
        "packageName" /* decoded XOR */;
        str.getClass();
        Intent intentPutExtra = new Intent("android.intent.action.UNINSTALL_PACKAGE" /* decoded XOR */, Uri.fromParts("package" /* decoded XOR */, str, null)).putExtra("android.intent.extra.RETURN_RESULT" /* decoded XOR */, true);
        "putExtra(...)" /* decoded XOR */;
        intentPutExtra.getClass();
        return intentPutExtra;
    }
}