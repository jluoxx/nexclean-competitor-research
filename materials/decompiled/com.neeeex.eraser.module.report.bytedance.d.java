package com.neeeex.eraser.module.report.bytedance;

import com.neeeex.eraser.m0;

/* JADX INFO: loaded from: classes7.dex */
public abstract class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a[] f65402a = {new a(3, m0.a("x1nSEcg=\n", "kzaifqZvC/E=\n")), new a(1, m0.a("wu+5JfU=\n", "g4vUSpeR7Q0=\n"))};

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final a[] f65403b = {new a(1, m0.a("t1vpcck=\n", "9j+EHqu5UM8=\n")), new a(7, m0.a("ippTgDwwHVA=\n", "y+oj7FNGdD4=\n")), new a(10, m0.a("uNOtJg==\n", "+rrKSaL35Lo=\n")), new a(2, m0.a("dqiI\n", "McnlllIZ1PU=\n")), new a(9, m0.a("E6xDEh2E\n", "WsIufX/tOZo=\n")), new a(8, m0.a("/cjcal/4/w==\n", "saG6HjCemWA=\n")), new a(11, m0.a("Zz7K\n", "Kl+yLTzETPo=\n")), new a(4, m0.a("oLibfg==\n", "7d3vH4id8oI=\n")), new a(6, m0.a("QtFH/HZqUctj\n", "D7gpiBMNI6o=\n")), new a(5, m0.a("6PkpMqc8\n", "uJhHVctZopg=\n")), new a(3, m0.a("xSs+plE=\n", "kUROyT9eCJw=\n"))};

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final a[] f65404c = {new a(1, m0.a("bFtz75AJ\n", "LjodgfV7JZI=\n")), new a(2, m0.a("h6pXwUueO/K6rULI\n", "zsQjpDntT5s=\n")), new a(3, m0.a("4RkUUmHa\n", "r3hgOxe/Oo4=\n")), new a(5, m0.a("CsuFzw==\n", "RbvgoZ4/nk0=\n")), new a(4, m0.a("4tas2T1H\n", "sLPbuE8jqog=\n")), new a(6, m0.a("LTpHch/BTpsRK1VhHtF4phY+XA==\n", "f18wE22lEdI=\n"))};

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
        return m0.a("PnOLSTC0uQ==\n", "ax3gJ1/D1+8=\n");
    }
}