package pi;

import android.content.Context;
import android.content.res.Resources;
import com.neeeex.eraser.m0;
import fl.t;
import fl.z;
import gl.w;
import java.util.List;
import p003kotlin.jvm.functions.Function1;
import p003kotlin.jvm.internal.v;

/* JADX INFO: loaded from: classes7.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final c f91405a = new c();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final List f91406b = w.p(z.a(m0.a("tsA17vqUVtKj0D7Z1pNe3qrUNNnWk17eqtQ02Q==\n", "xrVGhqX6M7c=\n"), 6), z.a(m0.a("tdDcOXsZxxSgwNcOVx7PGKnE3Q5IFtAWoPrCNEAewy4=\n", "xaWvUSR3onE=\n"), 6), z.a(m0.a("oBMQtE36Vke1AxuDYf1eS7wHEYN24UNOuQUCqHfLXke0DwKD\n", "0GZj3BKUMyI=\n"), 6), z.a(m0.a("z/d2DAd1Tiba5307K3JGKtPjdzs0elkk2t1jDTR+dA==\n", "v4IFZFgbK0M=\n"), 6), z.a(m0.a("dtmxE8DrnXBjybok7OyVfGrNsCT78Ih5b8+jD/rannxqyZ0=\n", "BqzCe5+F+BU=\n"), 6), z.a(m0.a("893Hg8VT5YTmzcy06VTtiO/JxrTwSO6K3M7dh/9O3w==\n", "g6i065o9gOE=\n"), 9), z.a(m0.a("oWnk2QkgioK0ee/uJSeCjr195e4lLZ2CtHLk2Tk6nLijefTeJCqGibZvyA==\n", "0RyXsVZO7+c=\n"), 6), z.a(m0.a("Oz/NwtVlKh4uL8b1+WIiEicrzPX4biweJT7hy/p7PCQ=\n", "S0q+qooLT3s=\n"), 4), z.a(m0.a("XNtnuLiWpM9Jy2yPlJGsw0DPZo+JnbXdQ9x/j5OKoMxKx3eP\n", "LK4U0Of4wao=\n"), 4), z.a(m0.a("Xx6k7eMhKm1KDq/azyYiYUMKpdrMJyB8QDS06tE/PW1cGLj34w==\n", "L2vXhbxPTwg=\n"), 4), z.a(m0.a("t1wSb73htByiTBlYkea8EKtIE1iU5qMMtHY=\n", "xylhB+KP0Xk=\n"), 5));

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f91407a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f91408b;

        public a(String str, int i10) {
            m0.a("LS1K6WULhA==\n", "TkIknQBl8KY=\n");
            str.getClass();
            this.f91407a = str;
            this.f91408b = i10;
        }

        public final int a() {
            return this.f91408b;
        }

        public final String b() {
            return this.f91407a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return v.c(this.f91407a, aVar.f91407a) && this.f91408b == aVar.f91408b;
        }

        public int hashCode() {
            return (this.f91407a.hashCode() * 31) + Integer.hashCode(this.f91408b);
        }

        public String toString() {
            return "CleanNotificationTarget(content=" + this.f91407a + ", action=" + this.f91408b + ")";
        }
    }

    public static String a(Resources resources, int i10) {
        String string = resources.getString(i10);
        m0.a("HoC0fpC/a1ceze4DyuQ=\n", "eeXALeTNAjk=\n");
        string.getClass();
        return string;
    }

    public static int b(Resources resources, String str, String str2) {
        m0.a("ij0Dpb3mSCS2OR2v\n", "+FhwysiUK0E=\n");
        str2.getClass();
        return resources.getIdentifier(str2, m0.a("OrhOc46z\n", "Scw8GuDUIe0=\n"), str);
    }

    public final int c(String str) {
        switch (str.hashCode()) {
            case -1128547213:
                return !str.equals(m0.a("HzR9Oh1Tp4gKJHYNMVSvhAMgfA0mSLKBBiJvJidir4gLKG8N\n", "b0EOUkI9wu0=\n")) ? 0 : 7;
            case -632159205:
                return !str.equals(m0.a("GLyL5zLzNfUNrIDQHvQ9+QSoitAB/CL3DZae5gH4Dw==\n", "aMn4j22dUJA=\n")) ? 0 : 8;
            case -479166373:
                return !str.equals(m0.a("zDrpuYRsnR7ZKuKOqGuVEtAu6I6xd5YQ4ynzvb5xpw==\n", "vE+a0dsC+Hs=\n")) ? 0 : 11;
            case -466543208:
                return !str.equals(m0.a("bT4iMVMl51d4LikGfyLvW3EqIwZ/Iu9bcSojBg==\n", "HUtRWQxLgjI=\n")) ? 0 : 5;
            case -310461769:
                return !str.equals(m0.a("uxKRUCnSZJKuAppnBdVsnqcGkGcY2XWApBWJZwLOYJGtDoFn\n", "y2fiOHa8Afc=\n")) ? 0 : 14;
            case -181290005:
                return !str.equals(m0.a("XsHP7z+0cyhL0cTYE7N7JELVztgEr2YhR9fd8wWFcCRC0eM=\n", "LrS8h2DaFk0=\n")) ? 0 : 9;
            case 969283655:
                return !str.equals(m0.a("FaGMgrSYSdsAsYe1mJ9B1wm1jbWYlV7bALqMgoSCX+EXsZyFmZJF0AKnoA==\n", "ZdT/6uv2LL4=\n")) ? 0 : 12;
            case 1366382697:
                return !str.equals(m0.a("SlZcGHYEshFfRlcvWgO6HVZCXS9ZArgAVXxMH0QapRFJUEACdg==\n", "OiMvcClq13Q=\n")) ? 0 : 15;
            case 1782673677:
                return !str.equals(m0.a("2BUv7jdsgF3NBSTZG2uIUcQBLtkaZ4ZdxhQD5xhylmc=\n", "qGBchmgC5Tg=\n")) ? 0 : 13;
            case 1989471174:
                return !str.equals(m0.a("e5uONDDWDTtui4UDHNEFN2ePjwMZ0RoreLE=\n", "C+79XG+4aF4=\n")) ? 0 : 16;
            case 2074376771:
                return !str.equals(m0.a("j5oedlgWpKSaihVBdBGsqJOOH0FrGbOmmrAAe2MRoJ4=\n", "/+9tHgd4wcE=\n")) ? 0 : 6;
            default:
                return 0;
        }
    }

    public final a d(Context context) {
        m0.a("SRPp/XrRrg==\n", "KnyHiR+p2mw=\n");
        context.getClass();
        final Resources resources = context.getResources();
        final String packageName = context.getPackageName();
        return g(yl.c.Default, new Function1() { // from class: pi.a
            @Override // p003kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return Integer.valueOf(c.b(resources, packageName, (String) obj));
            }
        }, new Function1() { // from class: pi.b
            @Override // p003kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return c.a(resources, ((Integer) obj).intValue());
            }
        });
    }

    public final String e(Context context, int i10) {
        m0.a("s7maBcGQfw==\n", "0Nb0caToC7s=\n");
        context.getClass();
        Resources resources = context.getResources();
        int identifier = resources.getIdentifier("push_neeeex_content" + i10, m0.a("FG0bD5zB\n", "ZxlpZvKmmWY=\n"), context.getPackageName());
        if (identifier == 0) {
            return "";
        }
        String string = resources.getString(identifier);
        m0.a("I9TwglpJPeUjmar/ABI=\n", "RLGE0S47VIs=\n");
        string.getClass();
        return string;
    }

    public final t f(yl.c cVar) {
        List list = f91406b;
        t tVar = (t) list.get(cVar.nextInt(list.size()));
        String str = (String) tVar.component1();
        return z.a(str + cVar.nextInt(((Number) tVar.component2()).intValue()), Integer.valueOf(c(str)));
    }

    public final a g(yl.c cVar, Function1 function1, Function1 function2) {
        m0.a("Lk26hNxU\n", "XCzU4LM5iEQ=\n");
        cVar.getClass();
        m0.a("NiaUBdNN1tY4JYkpxQ==\n", "UUPgTLcouKI=\n");
        function1.getClass();
        m0.a("jyc0bGyA4p6P\n", "6EJAPxjyi/A=\n");
        function2.getClass();
        t tVarF = f(cVar);
        String str = (String) tVarF.component1();
        int iIntValue = ((Number) tVarF.component2()).intValue();
        int iIntValue2 = ((Number) function1.invoke(str)).intValue();
        return new a(iIntValue2 == 0 ? "" : (String) function2.invoke(Integer.valueOf(iIntValue2)), iIntValue);
    }
}