package com.neeeex.eraser.utils;

import com.neeeex.eraser.m0;

/* JADX INFO: loaded from: classes7.dex */
public final class a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final String f66126b = "key_neeeex_first_open" /* decoded XOR */;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final String f66127c = "key_neeeex_need_push_perm" /* decoded XOR */;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f66125a = new a();

    public final boolean a(String str) {
        return b0.f66131a.s(str, true);
    }

    public final boolean b() {
        return a(f66126b);
    }

    public final void c(String str) {
        fl.m0 m0Var = fl.m0.f80959a;
        b0.f66131a.z(str, false);
    }

    public final boolean d() {
        return a(f66127c);
    }

    public final void e() {
        c(f66126b);
    }

    public final void f() {
        c(f66127c);
    }
}