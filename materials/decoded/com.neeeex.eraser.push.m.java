package com.neeeex.eraser.push;

import com.neeeex.eraser.m0;
import p003kotlin.jvm.internal.v;

/* JADX INFO: loaded from: classes7.dex */
public final class m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final m f65533a = new m();

    public final boolean a(String str, String str2) {
        return v.c(str, "android.intent.action.CLOSE_SYSTEM_DIALOGS" /* decoded XOR */) && v.c(str2, "homekey" /* decoded XOR */);
    }
}