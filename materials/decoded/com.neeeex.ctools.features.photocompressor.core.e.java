package com.neeeex.ctools.features.photocompressor.core;

import am.q;
import coil.util.j;
import com.neeeex.eraser.m0;
import com.tradplus.ads.base.util.AppKeyManager;
import p003kotlin.jvm.functions.Function1;
import to.s;
import to.v;

/* JADX INFO: loaded from: classes7.dex */
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final e f64596a = new e();

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f64597a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f64598b;

        public a(int i10, int i11) {
            this.f64597a = i10;
            this.f64598b = i11;
        }

        public final boolean a(int i10) {
            if (i10 == 1) {
                return true;
            }
            double d10 = i10;
            return Math.max((((double) this.f64597a) / d10) / ((double) AppKeyManager.IMAGE_ACCEPTED_SIZE_Y), (((double) this.f64598b) / d10) / ((double) AppKeyManager.IMAGE_ACCEPTED_SIZE_X)) >= 1.0d;
        }

        public final double b() {
            return Math.min(1.0d, Math.min(1920.0d / ((double) this.f64597a), 1080.0d / ((double) this.f64598b)));
        }

        public final void c() {
            if (this.f64597a <= 0 || this.f64598b <= 0) {
                yl.d.a("Image dimensions must be positive" /* decoded XOR */);
            }
        }

        public final f d(double d10) {
            return new f(q.f(wl.c.c(((double) this.f64597a) * d10), 1), q.f(wl.c.c(((double) this.f64598b) * d10), 1));
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return this.f64597a == aVar.f64597a && this.f64598b == aVar.f64598b;
        }

        public int hashCode() {
            return (Integer.hashCode(this.f64597a) * 31) + Integer.hashCode(this.f64598b);
        }

        public String toString() {
            return "SourceDimensions(width=" + this.f64597a + ", height=" + this.f64598b + ")";
        }
    }

    public static boolean a(a aVar, int i10) {
        return aVar.a(i10);
    }

    public static Integer b(int i10) {
        return Integer.valueOf(i10 << 1);
    }

    public final int c(int i10, int i11) {
        final a aVar = new a(i10, i11);
        aVar.c();
        return ((Number) v.J(v.R(s.n(1, new Function1() { // from class: com.neeeex.ctools.features.photocompressor.core.c
            @Override // p003kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return e.b(((Integer) obj).intValue());
            }
        }), new Function1() { // from class: com.neeeex.ctools.features.photocompressor.core.d
            @Override // p003kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return Boolean.valueOf(e.a(aVar, ((Integer) obj).intValue()));
            }
        }))).intValue();
    }

    public final f d(int i10, int i11) {
        a aVar = new a(i10, i11);
        aVar.c();
        return aVar.d(aVar.b());
    }

    public final g e(boolean z10) {
        if (z10) {
            return g.WEBP;
        }
        if (!z10) {
            return g.JPEG;
        }
        j.a();
        return null;
    }
}