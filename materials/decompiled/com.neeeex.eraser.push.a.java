package com.neeeex.eraser.push;

import android.text.format.DateUtils;
import com.neeeex.eraser.m0;
import com.neeeex.eraser.utils.b0;
import gl.w;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes7.dex */
public final class a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final String f65470b = m0.a("BkbkGsbKY5wNad0d0dxypgZC2gbX8HKQGFM=\n", "dTa7dKOvBvk=\n");

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final String f65471c = m0.a("f1vL6545Ek90dOfmmjIoWmRE4OqkMBZeaVjg2o81Gk8=\n", "DCuUhftcdyo=\n");

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final String f65472d = m0.a("9km7nSAg8Ij9ZpeQJCvKgvFRgYEaI/yB4Eq7nyQx8J7xZpCaKCA=\n", "hTnk80VFle0=\n");

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final String f65473e = m0.a("HoHg8ZFqZFgVrsz8lWFeSwSV2vCrY2BJCILLwIBmbFg=\n", "bfG/n/QPAT0=\n");

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final String f65474f = m0.a("uU6FJ3U07kOyYagscz79Q7hbvhZ2OOdDuWG5JmU//w==\n", "yj7aSRBRiyY=\n");

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final String f65475g = m0.a("LNQ60ryvfR0n+wDEuq99HADABMWqlWgQMNAK47qlbRYr1w==\n", "X6RlvNnKGHg=\n");

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final String f65476h = m0.a("7UXE0/V7zDjmav7F83vMOcFR+sTjQd80+lD04vNx3DPqRg==\n", "njWbvZAeqV0=\n");

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final String f65477i = m0.a("+om7RgsSGXLxpoFQDRIZc9adhVEdKBNj4ZyWdwgeEHL6podHGxkIZA==\n", "ifnkKG53fBc=\n");

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final String f65478j = m0.a("XKVp+RSoQv1XilfhEKRL+U25U8gBpUjsQIpV+ASjU+s=\n", "L9U2l3HNJ5g=\n");

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final String f65479k = m0.a("C3wOdIAb2boAUzBshBfQvhpgNEWTF9i6F1MydZAQyKw=\n", "eAxRGuV+vN8=\n");

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final String f65480l = m0.a("4Aft1x/XrLHrKNPPG9ultfEb1+YVxqGx4SjU0BbXuovwGMfXDsE=\n", "k3eyuXqyydQ=\n");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f65469a = new a();

    public final int a(int i10, int i11) {
        return Math.max(0, i10 - i11);
    }

    public final String b(int i10) {
        if (i10 != 2) {
            return i10 != 3 ? f65478j : f65480l;
        }
        return f65479k;
    }

    public final int[] c(long j10, long j11, long j12) {
        b0 b0Var = b0.f66131a;
        return new int[]{(int) ((j10 - b0Var.v(f65471c, j12)) / j11), (int) ((j10 - b0Var.v(f65473e, j12)) / j11), (int) ((j10 - b0Var.v(f65472d, j12)) / j11)};
    }

    public final String d(int i10) {
        if (i10 != 2) {
            return i10 != 3 ? f65475g : f65477i;
        }
        return f65476h;
    }

    public final int e(int i10) {
        return b0.f66131a.u(b(i10), 0);
    }

    public final int f(int i10) {
        return b0.f66131a.u(d(i10), 0);
    }

    public final List g() {
        b0 b0Var = b0.f66131a;
        return w.p(Long.valueOf(b0Var.v(f65471c, 0L)), Long.valueOf(b0Var.v(f65473e, 0L)), Long.valueOf(b0Var.v(f65472d, 0L)));
    }

    public final boolean h(long j10) {
        return System.currentTimeMillis() - j10 >= 1296000000;
    }

    public final boolean i() {
        long jV = b0.f66131a.v(f65470b, 0L);
        return jV == 0 || System.currentTimeMillis() - jV <= 86400000;
    }

    public final int j() {
        return gl.s.T0(c(System.currentTimeMillis(), 86400000L, b0.f66131a.v(f65470b, 0L)));
    }

    public final void k(int i10, int i11) {
        m(a(e(i11), i10), i11);
    }

    public final void l(int i10, int i11) {
        n(a(f(i11), i10), i11);
    }

    public final void m(int i10, int i11) {
        b0.f66131a.B(b(i11), i10);
    }

    public final void n(int i10, int i11) {
        b0.f66131a.B(d(i11), i10);
    }

    public final boolean o() {
        List listG = g();
        if ((listG instanceof Collection) && listG.isEmpty()) {
            return false;
        }
        Iterator it = listG.iterator();
        while (it.hasNext()) {
            if (DateUtils.isToday(((Number) it.next()).longValue())) {
                return true;
            }
        }
        return false;
    }
}