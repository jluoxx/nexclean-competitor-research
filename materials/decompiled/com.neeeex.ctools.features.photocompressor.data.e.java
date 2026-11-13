package com.neeeex.ctools.features.photocompressor.data;

import com.neeeex.eraser.m0;
import gl.w;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import p003kotlin.jvm.internal.v;
import p003kotlin.text.e0;
import p003kotlin.text.k0;

/* JADX INFO: loaded from: classes7.dex */
public final class e {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final String f64648b = m0.a("4ygYScKceS6cDz548qtEcuMpFEnYzl8y3jEJWMSdcy+c\n", "s0F7PbfuHF0=\n");

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final String f64649c = m0.a("DkevU4Hs70BSGKhVkPz4XQ5Hrl+B9r1GTlq2QpDq7kpTGA==\n", "ITfGMPWZnSU=\n");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final e f64647a = new e();

    public interface a {

        /* JADX INFO: renamed from: com.neeeex.ctools.features.photocompressor.data.e$a$a, reason: collision with other inner class name */
        public static final class C0756a implements a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final String f64650a;

            public C0756a(String str) {
                this.f64650a = str;
            }

            @Override // com.neeeex.ctools.features.photocompressor.data.e.a
            public boolean a() {
                e eVar = e.f64647a;
                String str = this.f64650a;
                if (str == null) {
                    str = "";
                }
                return k0.c0(eVar.c(str, false), m0.a("lIRh2VwGKHzI22bfTRY/YZSEYNVcHHp61Jl4yE0AKXbJ2w==\n", "u/QIuihzWhk=\n"), false, 2, null);
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof C0756a) && v.c(this.f64650a, ((C0756a) obj).f64650a);
            }

            public int hashCode() {
                String str = this.f64650a;
                if (str == null) {
                    return 0;
                }
                return str.hashCode();
            }

            public String toString() {
                return "Absolute(value=" + this.f64650a + ")";
            }
        }

        public static final class b implements a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final String f64651a;

            public b(String str) {
                this.f64651a = str;
            }

            @Override // com.neeeex.ctools.features.photocompressor.data.e.a
            public boolean a() {
                String str = this.f64651a;
                return v.c(str != null ? e.f64647a.c(str, true) : null, e.f64647a.c(m0.a("njc4jUNbit3hEB68c2y3gZ42NI1ZCazBoy4pnEVagNzh\n", "zl5b+TYp764=\n"), true));
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof b) && v.c(this.f64651a, ((b) obj).f64651a);
            }

            public int hashCode() {
                String str = this.f64651a;
                if (str == null) {
                    return 0;
                }
                return str.hashCode();
            }

            public String toString() {
                return "Relative(value=" + this.f64651a + ")";
            }
        }

        boolean a();
    }

    public final boolean b(String str, String str2) {
        List listP = w.p(new a.b(str), new a.C0756a(str2));
        if ((listP instanceof Collection) && listP.isEmpty()) {
            return false;
        }
        Iterator it = listP.iterator();
        while (it.hasNext()) {
            if (((a) it.next()).a()) {
                return true;
            }
        }
        return false;
    }

    public final String c(String str, boolean z10) {
        String strN = e0.N(str, '\\', '/', false, 4, null);
        Locale locale = Locale.ROOT;
        m0.a("RX7V5Q==\n", "FzGasajaJFs=\n");
        locale.getClass();
        String lowerCase = strN.toLowerCase(locale);
        m0.a("nejAvxJbQ8qI9On4SxAfoA==\n", "6YeM0GU+MYk=\n");
        lowerCase.getClass();
        return z10 ? k0.y1(lowerCase, '/') : lowerCase;
    }
}