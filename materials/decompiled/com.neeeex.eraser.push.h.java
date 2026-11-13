package com.neeeex.eraser.push;

import com.neeeex.eraser.m0;
import com.neeeex.eraser.utils.b0;
import com.neeeex.eraser.utils.c0;

/* JADX INFO: loaded from: classes7.dex */
public final class h {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final String f65508b = m0.a("ETv5qvpQSakCHfm67A==\n", "YXKX3p8iGsw=\n");

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final String f65509c = m0.a("RUausdyJl6RVZ4Wm+omHsg==\n", "JzTgxZXn48E=\n");

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final String f65510d = m0.a("LG5ugQ3ptxkPRXmnDfmh\n", "XCAayGOd0ms=\n");

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final String f65511e = m0.a("19eMXX81M4bZyqpgYz83h9/ThnZOPjmX1dSMXXg+IobOxJRuTiMl\n", "vLL1AhFQVuM=\n");

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final String f65512f = m0.a("jQl+Vi9/1B+DFFh9M3PWHYMeWGcubtgcnzNuZzV/wwyHAFh6Mg==\n", "5mwHCUEasXo=\n");

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final String f65513g = m0.a("e5zLlSAng3d1ge2nLzq5fX6c7a4vO7lhYw==\n", "EPmyyk5C5hI=\n");

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final String f65514h = m0.a("RAy6FGTYFx9KEZwkZNodE0EOnCJkyRcIWQivFHnO\n", "L2nDSwq9cno=\n");

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final String f65515i = m0.a("3Emb7th6\n", "ryr+gL0JNWE=\n");

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final String f65516j = m0.a("ZSA=\n", "DEREPbeT4wM=\n");

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final String f65517k = m0.a("gYR5Wf8g30WHhGlP\n", "6OoNPI1zuiY=\n");

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final String f65518l = m0.a("rNb6K1Q=\n", "wL+XQiBmpbE=\n");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final h f65507a = new h();

    public final long a() {
        return c0.f66142a.e() ? b(f65511e, i.f65519a.b()) : b(f65509c, 300L);
    }

    public final long b(String str, long j10) {
        return b0.f66131a.v(str, j10) * 1000;
    }

    public final long c() {
        if (c0.f66142a.e()) {
            return b0.f66131a.v(f65513g, i.f65519a.c());
        }
        return 999L;
    }

    public final int d(int i10, int i11) {
        return i11;
    }

    public final long e(int i10, long j10) {
        return j10 * 1000;
    }

    public final long f() {
        if (c0.f66142a.e()) {
            return b0.f66131a.v(f65514h, i.f65519a.d());
        }
        return 30L;
    }

    public final long g() {
        return c0.f66142a.e() ? b(f65512f, i.f65519a.f()) : b(f65510d, 600L);
    }

    public final long h() {
        return b(f65508b, 120L);
    }

    public final void i(long j10) {
        if (c0.f66142a.e()) {
            b0.f66131a.C(f65511e, j10 * ((long) 60));
        }
    }

    public final void j(long j10) {
        if (c0.f66142a.e()) {
            b0.f66131a.C(f65513g, j10);
        }
    }

    public final void k(long j10) {
        if (c0.f66142a.e()) {
            b0.f66131a.C(f65514h, j10);
        }
    }

    public final void l(long j10) {
        if (c0.f66142a.e()) {
            b0.f66131a.C(f65512f, j10 * ((long) 60));
        }
    }
}