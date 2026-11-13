package com.neeeex.eraser.push;

import com.neeeex.eraser.m0;
import com.neeeex.eraser.utils.b0;
import com.neeeex.eraser.utils.c0;

/* JADX INFO: loaded from: classes7.dex */
public final class h {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final String f65508b = "pInterSeconds" /* decoded XOR */;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final String f65509c = "brNtInterSeconds" /* decoded XOR */;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final String f65510d = "pNtInterSeconds" /* decoded XOR */;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final String f65511e = "key_neeeex_broadcast_notify_interval_ss" /* decoded XOR */;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final String f65512f = "key_neeeex_trigger_notify_interval_ss" /* decoded XOR */;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final String f65513g = "key_neeeex_max_one_day_ss" /* decoded XOR */;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final String f65514h = "key_neeeex_ongoing_interval_ss" /* decoded XOR */;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final String f65515i = "scenes" /* decoded XOR */;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final String f65516j = "id" /* decoded XOR */;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final String f65517k = "interSeconds" /* decoded XOR */;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final String f65518l = "limit" /* decoded XOR */;

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