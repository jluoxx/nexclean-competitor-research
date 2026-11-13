package com.neeeex.ctools.features.device;

/* JADX INFO: loaded from: classes7.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Integer f64268a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Integer f64269b;

    public a(Integer num, Integer num2) {
        this.f64268a = num;
        this.f64269b = num2;
    }

    public final Integer a() {
        return this.f64268a;
    }

    public final Integer b() {
        return this.f64269b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return p003kotlin.jvm.internal.v.c(this.f64268a, aVar.f64268a) && p003kotlin.jvm.internal.v.c(this.f64269b, aVar.f64269b);
    }

    public int hashCode() {
        Integer num = this.f64268a;
        int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
        Integer num2 = this.f64269b;
        return iHashCode + (num2 != null ? num2.hashCode() : 0);
    }

    public String toString() {
        return "BatteryCapacity(currentMah=" + this.f64268a + ", estimatedTotalMah=" + this.f64269b + ")";
    }
}