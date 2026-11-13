package com.neeeex.eraser.push;

import com.neeeex.eraser.m0;
import com.neeeex.eraser.utils.b0;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import p003kotlin.jvm.internal.v;

/* JADX INFO: loaded from: classes7.dex */
public final class j {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final String f65527b = "neeeex_notify_dialog_last_prompt_date" /* decoded XOR */;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final j f65526a = new j();

    public final boolean a() {
        return !v.c(b0.f66131a.x(f65527b, ""), b());
    }

    public final String b() {
        String str = new SimpleDateFormat("yyyy-MM-dd" /* decoded XOR */, Locale.getDefault()).format(new Date());
        "format(...)" /* decoded XOR */;
        str.getClass();
        return str;
    }

    public final void c() {
        b0.f66131a.D(f65527b, b());
    }
}