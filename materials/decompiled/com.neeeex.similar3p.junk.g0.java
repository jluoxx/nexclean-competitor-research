package com.neeeex.similar3p.junk;

import com.neeeex.eraser.m0;
import java.util.Set;

/* JADX INFO: loaded from: classes7.dex */
public final class g0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final d0 f66346a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Set f66347b;

    public g0(d0 d0Var, Set set) {
        m0.a("6rx4vDQW\n", "mNkLyVhi8rs=\n");
        d0Var.getClass();
        m0.a("2dYPFfV+Q5z60hcY5Q==\n", "qrNjcJYKJvg=\n");
        set.getClass();
        this.f66346a = d0Var;
        this.f66347b = set;
    }

    public static /* synthetic */ g0 b(g0 g0Var, d0 d0Var, Set set, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            d0Var = g0Var.f66346a;
        }
        if ((i10 & 2) != 0) {
            set = g0Var.f66347b;
        }
        return g0Var.a(d0Var, set);
    }

    public final g0 a(d0 d0Var, Set set) {
        m0.a("JXFfj1r7\n", "VxQs+jaPRpU=\n");
        d0Var.getClass();
        m0.a("hMO0Z86G15ynx6xq3g==\n", "96bYAq3ysvg=\n");
        set.getClass();
        return new g0(d0Var, set);
    }

    public final d0 c() {
        return this.f66346a;
    }

    public final Set d() {
        return this.f66347b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g0)) {
            return false;
        }
        g0 g0Var = (g0) obj;
        return p003kotlin.jvm.internal.v.c(this.f66346a, g0Var.f66346a) && p003kotlin.jvm.internal.v.c(this.f66347b, g0Var.f66347b);
    }

    public int hashCode() {
        return (this.f66346a.hashCode() * 31) + this.f66347b.hashCode();
    }

    public String toString() {
        return "JunkScanState(result=" + this.f66346a + ", selectedPaths=" + this.f66347b + ")";
    }
}