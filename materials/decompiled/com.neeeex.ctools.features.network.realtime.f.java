package com.neeeex.ctools.features.network.realtime;

import am.q;
import com.neeeex.eraser.m0;
import gl.g0;
import gl.w;
import java.util.Arrays;
import java.util.List;
import java.util.ListIterator;
import java.util.Locale;
import p003kotlin.jvm.internal.b1;
import p003kotlin.jvm.internal.v;

/* JADX INFO: loaded from: classes7.dex */
public final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final f f64428a = new f();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final List f64429b = w.p(new a(m0.a("v3pU\n", "/VUnTSfWjlg=\n"), 1.0d), new a(m0.a("AYE/Eg==\n", "SsMQYVUsP68=\n"), 1024.0d), new a(m0.a("mfOISw==\n", "1LGnOJZY4xk=\n"), 1048576.0d), new a(m0.a("RGcCew==\n", "AyUtCJpotj4=\n"), 1.073741824E9d), new a(m0.a("YbJQdA==\n", "NfB/B7HKkk0=\n"), 1.099511627776E12d));

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f64430a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final double f64431b;

        public a(String str, double d10) {
            m0.a("t3bhG24=\n", "2xeDfgJR/qY=\n");
            str.getClass();
            this.f64430a = str;
            this.f64431b = d10;
        }

        public final double a() {
            return this.f64431b;
        }

        public final String b() {
            return this.f64430a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return v.c(this.f64430a, aVar.f64430a) && Double.compare(this.f64431b, aVar.f64431b) == 0;
        }

        public int hashCode() {
            return (this.f64430a.hashCode() * 31) + Double.hashCode(this.f64431b);
        }

        public String toString() {
            return "RateScale(label=" + this.f64430a + ", divisor=" + this.f64431b + ")";
        }
    }

    public final String a(long j10) {
        Object objPrevious;
        long jG = q.g(j10, 0L);
        List list = f64429b;
        ListIterator listIterator = list.listIterator(list.size());
        do {
            if (!listIterator.hasPrevious()) {
                objPrevious = null;
                break;
            }
            objPrevious = listIterator.previous();
        } while (jG < ((a) objPrevious).a());
        a aVar = (a) objPrevious;
        if (aVar == null) {
            aVar = (a) g0.p0(f64429b);
        }
        double dA = jG / aVar.a();
        if (aVar == g0.p0(f64429b)) {
            return ((long) dA) + " " + aVar.b();
        }
        if (dA >= 100.0d) {
            b1 b1Var = b1.f86707a;
            String str = String.format(Locale.US, m0.a("OpgHmnjw1A==\n", "H7Y3/FjVp8Y=\n"), Arrays.copyOf(new Object[]{Double.valueOf(dA), aVar.b()}, 2));
            m0.a("AKzUFfszC/lI7Y8=\n", "ZsOmeJpHI9c=\n");
            return str;
        }
        b1 b1Var2 = b1.f86707a;
        String str2 = String.format(Locale.US, m0.a("7eTV6zyx5Q==\n", "yMrkjRyUlh0=\n"), Arrays.copyOf(new Object[]{Double.valueOf(dA), aVar.b()}, 2));
        m0.a("vo6A2Bkhrun2z9s=\n", "2OHytXhVhsc=\n");
        return str2;
    }
}