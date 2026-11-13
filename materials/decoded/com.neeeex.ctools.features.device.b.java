package com.neeeex.ctools.features.device;

import com.neeeex.eraser.m0;

/* JADX INFO: loaded from: classes7.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f64270a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Integer f64271b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final a f64272c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Integer f64273d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Double f64274e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f64275f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int f64276g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final String f64277h;

    public b(int i10, Integer num, a aVar, Integer num2, Double d10, int i11, int i12, String str) {
        "capacity" /* decoded XOR */;
        aVar.getClass();
        this.f64270a = i10;
        this.f64271b = num;
        this.f64272c = aVar;
        this.f64273d = num2;
        this.f64274e = d10;
        this.f64275f = i11;
        this.f64276g = i12;
        this.f64277h = str;
    }

    public final a a() {
        return this.f64272c;
    }

    public final int b() {
        return this.f64270a;
    }

    public final Integer c() {
        return this.f64271b;
    }

    public final int d() {
        return this.f64276g;
    }

    public final int e() {
        return this.f64275f;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return this.f64270a == bVar.f64270a && p003kotlin.jvm.internal.v.c(this.f64271b, bVar.f64271b) && p003kotlin.jvm.internal.v.c(this.f64272c, bVar.f64272c) && p003kotlin.jvm.internal.v.c(this.f64273d, bVar.f64273d) && p003kotlin.jvm.internal.v.c(this.f64274e, bVar.f64274e) && this.f64275f == bVar.f64275f && this.f64276g == bVar.f64276g && p003kotlin.jvm.internal.v.c(this.f64277h, bVar.f64277h);
    }

    public final String f() {
        return this.f64277h;
    }

    public final Double g() {
        return this.f64274e;
    }

    public final Integer h() {
        return this.f64273d;
    }

    public int hashCode() {
        int iHashCode = Integer.hashCode(this.f64270a) * 31;
        Integer num = this.f64271b;
        int iHashCode2 = (((iHashCode + (num == null ? 0 : num.hashCode())) * 31) + this.f64272c.hashCode()) * 31;
        Integer num2 = this.f64273d;
        int iHashCode3 = (iHashCode2 + (num2 == null ? 0 : num2.hashCode())) * 31;
        Double d10 = this.f64274e;
        int iHashCode4 = (((((iHashCode3 + (d10 == null ? 0 : d10.hashCode())) * 31) + Integer.hashCode(this.f64275f)) * 31) + Integer.hashCode(this.f64276g)) * 31;
        String str = this.f64277h;
        return iHashCode4 + (str != null ? str.hashCode() : 0);
    }

    public String toString() {
        return "BatteryStatus(health=" + this.f64270a + ", percent=" + this.f64271b + ", capacity=" + this.f64272c + ", voltageMillivolts=" + this.f64273d + ", temperatureCelsius=" + this.f64274e + ", status=" + this.f64275f + ", plugged=" + this.f64276g + ", technology=" + this.f64277h + ")";
    }
}