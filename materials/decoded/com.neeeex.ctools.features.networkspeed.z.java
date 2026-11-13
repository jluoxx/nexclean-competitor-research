package com.neeeex.ctools.features.networkspeed;

import gl.g0;
import java.util.Iterator;

/* JADX INFO: loaded from: classes7.dex */
public final class z {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final z f64562a = new z();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final double[] f64563b = {0.0d, 10.0d, 20.0d, 50.0d, 100.0d, 250.0d, 500.0d, 750.0d, 1000.0d};

    public final float a(double d10) {
        Object next;
        double d11 = am.q.d(d10, 0.0d);
        Iterator it = to.v.y(g0.b0(gl.s.s0(f64563b)), 1).iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (d11 > f64563b[((Number) next).intValue()]);
        Integer num = (Integer) next;
        if (num != null) {
            return b(d11, num.intValue());
        }
        return 1.0f;
    }

    public final float b(double d10, int i10) {
        double[] dArr = f64563b;
        int i11 = i10 - 1;
        double d11 = dArr[i11];
        return (float) ((((double) i11) + ((d10 - d11) / (dArr[i10] - d11))) / ((double) gl.s.v0(dArr)));
    }
}