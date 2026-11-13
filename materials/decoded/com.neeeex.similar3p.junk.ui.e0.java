package com.neeeex.similar3p.junk.ui;

import com.neeeex.eraser.m0;

/* JADX INFO: loaded from: classes7.dex */
public abstract class e0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final p003kotlin.text.p f66435a = new p003kotlin.text.p("(?<=\\d)(?=[A-Za-z])" /* decoded XOR */);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final p003kotlin.text.p f66436b = new p003kotlin.text.p("\\.0(?= [A-Za-z])" /* decoded XOR */);

    public static final String a(long j10) {
        Object i0Var;
        if (j10 <= 0) {
            i0Var = k0.f66475a;
        } else {
            i0Var = j10 < 1024 ? new i0(j10) : new j0(com.neeeex.eraser.utils.d.b(j10, 0, 2, null));
        }
        if (p003kotlin.jvm.internal.v.c(i0Var, k0.f66475a)) {
            return "0B" /* decoded XOR */;
        }
        if (!(i0Var instanceof i0)) {
            if (i0Var instanceof j0) {
                return b(((j0) i0Var).a());
            }
            coil.util.j.a();
            return null;
        }
        return ((i0) i0Var).a() + " B";
    }

    public static final String b(String str) {
        for (fl.t tVar : gl.w.p(fl.z.a(f66435a, " "), fl.z.a(f66436b, ""))) {
            str = ((p003kotlin.text.p) tVar.component1()).replace(str, (String) tVar.component2());
        }
        return str;
    }
}