package com.neeeex.eraser.utils;

import com.neeeex.eraser.m0;

/* JADX INFO: loaded from: classes7.dex */
public abstract class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final String f66143a = "KB" /* decoded XOR */;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final String f66144b = "MB" /* decoded XOR */;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final String f66145c = "GB" /* decoded XOR */;

    public static final String a(long j10, int i10) {
        fl.t tVarA = c.f66140a.a(j10, i10);
        return ((String) tVarA.component1()) + ((String) tVarA.component2());
    }

    public static /* synthetic */ String b(long j10, int i10, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            i10 = 2;
        }
        return a(j10, i10);
    }
}