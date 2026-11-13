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
    public static final String f65527b = m0.a("MXfgngPLSmYwZuydH+xxYT5+6pw533R7K031iQneZXwAduSPAw==\n", "XxKF+2azFQg=\n");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final j f65526a = new j();

    public final boolean a() {
        return !v.c(b0.f66131a.x(f65527b, ""), b());
    }

    public final String b() {
        String str = new SimpleDateFormat(m0.a("TkKBi1zQF3NTXw==\n", "Nzv48nGdWl4=\n"), Locale.getDefault()).format(new Date());
        m0.a("iw2ImhDQSSfDTNM=\n", "7WL693GkYQk=\n");
        str.getClass();
        return str;
    }

    public final void c() {
        b0.f66131a.D(f65527b, b());
    }
}