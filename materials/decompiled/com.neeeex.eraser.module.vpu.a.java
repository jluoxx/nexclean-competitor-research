package com.neeeex.eraser.module.vpu;

import android.content.Context;
import android.content.Intent;
import com.neeeex.eraser.ads.o;
import com.neeeex.eraser.m0;

/* JADX INFO: loaded from: classes7.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f65458a = new a();

    public final void a(String str, o oVar) {
        BaseNEEEEXIVPActivity.Companion companion = BaseNEEEEXIVPActivity.INSTANCE;
        companion.a(str);
        companion.setOnAdListener(oVar);
    }

    public final void b(Context context, String str, o oVar, Class cls) {
        m0.a("cZuzgk5iAQ==\n", "EvTd9isadaY=\n");
        context.getClass();
        m0.a("sfEZRRsCFGKI+g==\n", "wZ5qLG9reww=\n");
        str.getClass();
        m0.a("99ZLurtm617V2V6gvg==\n", "lrU/080Pnyc=\n");
        cls.getClass();
        a(str, oVar);
        context.startActivity(new Intent(context, (Class<?>) cls));
    }
}