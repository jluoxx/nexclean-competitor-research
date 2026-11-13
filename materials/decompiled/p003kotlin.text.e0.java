package p003kotlin.text;

import am.q;
import gl.e;
import gq.p;
import java.util.Comparator;
import p003kotlin.jvm.internal.b1;

/* JADX INFO: loaded from: classes8.dex */
public abstract class e0 extends d0 {
    public static String A(char[] cArr, int i10, int i11) {
        cArr.getClass();
        e.Companion.a(i10, i11, cArr.length);
        return new String(cArr, i10, i11 - i10);
    }

    public static String B(byte[] bArr) {
        bArr.getClass();
        return new String(bArr, d.f86852b);
    }

    public static byte[] C(String str) {
        str.getClass();
        byte[] bytes = str.getBytes(d.f86852b);
        bytes.getClass();
        return bytes;
    }

    public static boolean D(String str, String str2, boolean z10) {
        str.getClass();
        str2.getClass();
        return !z10 ? str.endsWith(str2) : I(str, str.length() - str2.length(), str2, 0, str2.length(), true);
    }

    public static /* synthetic */ boolean E(String str, String str2, boolean z10, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            z10 = false;
        }
        return D(str, str2, z10);
    }

    public static boolean F(String str, String str2, boolean z10) {
        if (str == null) {
            return str2 == null;
        }
        return !z10 ? str.equals(str2) : str.equalsIgnoreCase(str2);
    }

    public static /* synthetic */ boolean G(String str, String str2, boolean z10, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            z10 = false;
        }
        return F(str, str2, z10);
    }

    public static Comparator H(b1 b1Var) {
        b1Var.getClass();
        Comparator comparator = String.CASE_INSENSITIVE_ORDER;
        comparator.getClass();
        return comparator;
    }

    public static boolean I(String str, int i10, String str2, int i11, int i12, boolean z10) {
        str.getClass();
        str2.getClass();
        return !z10 ? str.regionMatches(i10, str2, i11, i12) : str.regionMatches(z10, i10, str2, i11, i12);
    }

    public static /* synthetic */ boolean J(String str, int i10, String str2, int i11, int i12, boolean z10, int i13, Object obj) {
        if ((i13 & 16) != 0) {
            z10 = false;
        }
        return I(str, i10, str2, i11, i12, z10);
    }

    public static String K(CharSequence charSequence, int i10) {
        charSequence.getClass();
        if (i10 < 0) {
            p.a("Count 'n' must be non-negative, but was ", i10, 46);
            return null;
        }
        if (i10 == 0) {
            return "";
        }
        int i11 = 1;
        if (i10 == 1) {
            return charSequence.toString();
        }
        int length = charSequence.length();
        if (length == 0) {
            return "";
        }
        if (length != 1) {
            StringBuilder sb2 = new StringBuilder(charSequence.length() * i10);
            if (1 <= i10) {
                while (true) {
                    sb2.append(charSequence);
                    if (i11 == i10) {
                        break;
                    }
                    i11++;
                }
            }
            return sb2.toString();
        }
        char cCharAt = charSequence.charAt(0);
        char[] cArr = new char[i10];
        for (int i12 = 0; i12 < i10; i12++) {
            cArr[i12] = cCharAt;
        }
        return new String(cArr);
    }

    public static final String L(String str, char c10, char c11, boolean z10) {
        str.getClass();
        if (!z10) {
            String strReplace = str.replace(c10, c11);
            strReplace.getClass();
            return strReplace;
        }
        StringBuilder sb2 = new StringBuilder(str.length());
        for (int i10 = 0; i10 < str.length(); i10++) {
            char cCharAt = str.charAt(i10);
            if (c.g(cCharAt, c10, z10)) {
                cCharAt = c11;
            }
            sb2.append(cCharAt);
        }
        return sb2.toString();
    }

    public static final String M(String str, String str2, String str3, boolean z10) {
        str.getClass();
        str2.getClass();
        str3.getClass();
        int i10 = 0;
        int iL0 = k0.l0(str, str2, 0, z10);
        if (iL0 < 0) {
            return str;
        }
        int length = str2.length();
        int iF = q.f(length, 1);
        int length2 = (str.length() - length) + str3.length();
        if (length2 < 0) {
            throw new OutOfMemoryError();
        }
        StringBuilder sb2 = new StringBuilder(length2);
        do {
            sb2.append((CharSequence) str, i10, iL0);
            sb2.append(str3);
            i10 = iL0 + length;
            if (iL0 >= str.length()) {
                break;
            }
            iL0 = k0.l0(str, str2, iL0 + iF, z10);
        } while (iL0 > 0);
        sb2.append((CharSequence) str, i10, str.length());
        return sb2.toString();
    }

    public static /* synthetic */ String N(String str, char c10, char c11, boolean z10, int i10, Object obj) {
        if ((i10 & 4) != 0) {
            z10 = false;
        }
        return L(str, c10, c11, z10);
    }

    public static /* synthetic */ String O(String str, String str2, String str3, boolean z10, int i10, Object obj) {
        if ((i10 & 4) != 0) {
            z10 = false;
        }
        return M(str, str2, str3, z10);
    }

    public static final String P(String str, String str2, String str3, boolean z10) {
        str.getClass();
        str2.getClass();
        str3.getClass();
        int iP0 = k0.p0(str, str2, 0, z10, 2, null);
        return iP0 < 0 ? str : k0.O0(str, iP0, str2.length() + iP0, str3).toString();
    }

    public static /* synthetic */ String Q(String str, String str2, String str3, boolean z10, int i10, Object obj) {
        if ((i10 & 4) != 0) {
            z10 = false;
        }
        return P(str, str2, str3, z10);
    }

    public static boolean R(String str, String str2, int i10, boolean z10) {
        str.getClass();
        str2.getClass();
        return !z10 ? str.startsWith(str2, i10) : I(str, i10, str2, 0, str2.length(), z10);
    }

    public static boolean S(String str, String str2, boolean z10) {
        str.getClass();
        str2.getClass();
        return !z10 ? str.startsWith(str2) : I(str, 0, str2, 0, str2.length(), z10);
    }

    public static /* synthetic */ boolean T(String str, String str2, int i10, boolean z10, int i11, Object obj) {
        if ((i11 & 4) != 0) {
            z10 = false;
        }
        return R(str, str2, i10, z10);
    }

    public static /* synthetic */ boolean U(String str, String str2, boolean z10, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            z10 = false;
        }
        return S(str, str2, z10);
    }

    public static String z(char[] cArr) {
        cArr.getClass();
        return new String(cArr);
    }
}