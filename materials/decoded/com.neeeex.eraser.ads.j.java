package com.neeeex.eraser.ads;

import com.neeeex.eraser.m0;
import java.math.BigDecimal;
import java.math.RoundingMode;

/* JADX INFO: loaded from: classes7.dex */
public final class j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final j f64946a = new j();

    public final double a(double d10) {
        BigDecimal bigDecimalDivide = new BigDecimal(d10).divide(new BigDecimal(1000), 9, RoundingMode.HALF_UP);
        "divide(...)" /* decoded XOR */;
        bigDecimalDivide.getClass();
        return bigDecimalDivide.doubleValue();
    }
}