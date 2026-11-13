package com.neeeex.eraser.module.report.bytedance;

import com.neeeex.eraser.m0;

/* JADX INFO: loaded from: classes7.dex */
public abstract class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a[] f65402a = {new a(3, "Topon" /* decoded XOR */), new a(1, "Admob" /* decoded XOR */)};

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final a[] f65403b = {new a(1, "Admob" /* decoded XOR */), new a(7, "Applovin" /* decoded XOR */), new a(10, "Bigo" /* decoded XOR */), new a(2, "Gam" /* decoded XOR */), new a(9, "Inmobi" /* decoded XOR */), new a(8, "Liftoff" /* decoded XOR */), new a(11, "Max" /* decoded XOR */), new a(4, "Meta" /* decoded XOR */), new a(6, "Mintegral" /* decoded XOR */), new a(5, "Pangle" /* decoded XOR */), new a(3, "Topon" /* decoded XOR */)};

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final a[] f65404c = {new a(1, "Banner" /* decoded XOR */), new a(2, "Interstitial" /* decoded XOR */), new a(3, "Native" /* decoded XOR */), new a(5, "Open" /* decoded XOR */), new a(4, "Reward" /* decoded XOR */), new a(6, "Reward_Interstitial" /* decoded XOR */)};

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f65405a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f65406b;

        public a(int i10, String str) {
            this.f65405a = i10;
            this.f65406b = str;
        }
    }

    public static String a(int i10) {
        return d(f65403b, i10);
    }

    public static int b(int i10) {
        if (i10 == 1) {
            return 5;
        }
        if (i10 == 3) {
            return 6;
        }
        if (i10 == 5) {
            return 2;
        }
        return (i10 == 4 || i10 == 6) ? 1 : 3;
    }

    public static String c(int i10) {
        return d(f65402a, i10);
    }

    public static String d(a[] aVarArr, int i10) {
        for (a aVar : aVarArr) {
            if (aVar.f65405a == i10) {
                return aVar.f65406b;
            }
        }
        return "Unknown" /* decoded XOR */;
    }
}