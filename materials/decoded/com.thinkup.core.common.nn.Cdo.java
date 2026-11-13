package com.thinkup.core.common.nn;

import android.text.TextUtils;
import java.io.ByteArrayOutputStream;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: renamed from: com.thinkup.core.common.nn.do, reason: invalid class name */
/* JADX INFO: loaded from: classes7.dex */
public class Cdo {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final String f72039d = "czZQYTNDVjhJUWZMTmNPWUR4aWVXKzFuRzRGRW1iNS8yTVhKd2g3UlNvenZyQXFCWlVqOXlIbGcwa3VwS2R0VA==";

    /* JADX INFO: renamed from: dd, reason: collision with root package name */
    private static final String f72041dd = "ZE1XbmhiZXlLcjBKSXZMTk94M0JGa0V1bWw5Mlk1ZmpTcUdUN1I4cFpWY2lQSEFzdEM0VVhhNlFEdzFnb3orLw==";

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final String f72045n = "+3MtanYVQs8GK7W/rSpiz9FCBUEDdbqxmhgcIRH4loTvuZw20XfO51JPN6jeLkyA";

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private static final String f72046o = "do";

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private static final char[] f72047q = {'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z', 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z', '0', '1', '2', '3', '4', '5', '6', '7', '8', '9', '+', '/'};

    /* JADX INFO: renamed from: d0, reason: collision with root package name */
    private static final byte[] f72040d0 = {-1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 62, -1, -1, -1, 63, 52, 53, 54, 55, 56, 57, 58, 59, 60, 61, -1, -1, -1, -1, -1, -1, -1, 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, -1, -1, -1, -1, -1, -1, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35, 36, 37, 38, 39, 40, 41, 42, 43, 44, 45, 46, 47, 48, 49, 50, 51, -1, -1, -1, -1, -1};

    /* JADX INFO: renamed from: dm, reason: collision with root package name */
    private static String f72042dm = "";

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    static HashMap<String, HashMap<Character, Character>> f72044m = new HashMap<>();

    /* JADX INFO: renamed from: dn, reason: collision with root package name */
    private static Map<Character, Character> f72043dn = null;

    /* JADX INFO: renamed from: do, reason: not valid java name */
    private static String f206do = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789+/";

    private Cdo() {
    }

    public static String d(byte[] bArr) {
        StringBuffer stringBuffer = new StringBuffer();
        int length = bArr.length;
        int i10 = 0;
        while (i10 < length) {
            int i11 = i10 + 1;
            byte b10 = bArr[i10];
            int i12 = b10 & 255;
            if (i11 == length) {
                char[] cArr = f72047q;
                stringBuffer.append(cArr[i12 >>> 2]);
                stringBuffer.append(cArr[(b10 & 3) << 4]);
                stringBuffer.append("==");
                break;
            }
            int i13 = i10 + 2;
            byte b11 = bArr[i11];
            if (i13 == length) {
                char[] cArr2 = f72047q;
                stringBuffer.append(cArr2[i12 >>> 2]);
                stringBuffer.append(cArr2[((b10 & 3) << 4) | ((b11 & 240) >>> 4)]);
                stringBuffer.append(cArr2[(b11 & 15) << 2]);
                stringBuffer.append("=");
                break;
            }
            i10 += 3;
            byte b12 = bArr[i13];
            char[] cArr3 = f72047q;
            stringBuffer.append(cArr3[i12 >>> 2]);
            stringBuffer.append(cArr3[((b10 & 3) << 4) | ((b11 & 240) >>> 4)]);
            stringBuffer.append(cArr3[((b11 & 15) << 2) | ((b12 & 192) >>> 6)]);
            stringBuffer.append(cArr3[b12 & 63]);
        }
        return stringBuffer.toString();
    }

    private static String d0(String str) {
        return d(str, (String) null);
    }

    public static String m(String str) {
        return TextUtils.isEmpty(str) ? "" : new String(q(str));
    }

    public static String n(String str) {
        if (TextUtils.isEmpty(str)) {
            return "";
        }
        String strD = d(str.getBytes());
        if (TextUtils.isEmpty(f72042dm)) {
            f72042dm = m(f72041dd);
        }
        StringBuilder sb2 = new StringBuilder();
        for (char cCharAt : strD.toCharArray()) {
            int i10 = 0;
            while (true) {
                char[] cArr = f72047q;
                if (i10 >= cArr.length) {
                    break;
                }
                if (cArr[i10] == cCharAt && i10 < f72042dm.length()) {
                    cCharAt = f72042dm.charAt(i10);
                    break;
                }
                i10++;
            }
            sb2.append(cCharAt);
        }
        return sb2.toString();
    }

    public static String o(String str) {
        char[] charArray;
        try {
            if (TextUtils.isEmpty(str) || (charArray = d(str.getBytes()).toCharArray()) == null || charArray.length <= 0) {
                return "";
            }
            char[] cArr = new char[charArray.length];
            for (int i10 = 0; i10 < charArray.length; i10++) {
                char c10 = charArray[i10];
                if (f72043dn == null) {
                    f72043dn = new HashMap();
                    for (int i11 = 0; i11 < f206do.length(); i11++) {
                        f72043dn.put(Character.valueOf(f206do.charAt(i11)), Character.valueOf(f72045n.charAt(i11)));
                    }
                }
                cArr[i10] = (f72043dn.containsKey(Character.valueOf(c10)) ? f72043dn.get(Character.valueOf(c10)) : Character.valueOf(c10)).charValue();
            }
            return new String(cArr);
        } catch (Exception e10) {
            e10.printStackTrace();
            return "";
        }
    }

    private static byte[] q(String str) {
        int i10;
        byte b10;
        int i11;
        byte b11;
        int i12;
        byte b12;
        int i13;
        byte b13;
        byte[] bytes = str.getBytes();
        int length = bytes.length;
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(length);
        int i14 = 0;
        while (i14 < length) {
            while (true) {
                i10 = i14 + 1;
                b10 = f72040d0[bytes[i14]];
                if (i10 >= length || b10 != -1) {
                    break;
                }
                i14 = i10;
            }
            if (b10 == -1) {
                break;
            }
            while (true) {
                i11 = i10 + 1;
                b11 = f72040d0[bytes[i10]];
                if (i11 >= length || b11 != -1) {
                    break;
                }
                i10 = i11;
            }
            if (b11 == -1) {
                break;
            }
            byteArrayOutputStream.write((b10 << 2) | ((b11 & 48) >>> 4));
            while (true) {
                i12 = i11 + 1;
                byte b14 = bytes[i11];
                if (b14 == 61) {
                    return byteArrayOutputStream.toByteArray();
                }
                b12 = f72040d0[b14];
                if (i12 >= length || b12 != -1) {
                    break;
                }
                i11 = i12;
            }
            if (b12 == -1) {
                break;
            }
            byteArrayOutputStream.write(((b11 & 15) << 4) | ((b12 & 60) >>> 2));
            while (true) {
                i13 = i12 + 1;
                byte b15 = bytes[i12];
                if (b15 == 61) {
                    return byteArrayOutputStream.toByteArray();
                }
                b13 = f72040d0[b15];
                if (i13 >= length || b13 != -1) {
                    break;
                }
                i12 = i13;
            }
            if (b13 == -1) {
                break;
            }
            byteArrayOutputStream.write(b13 | ((b12 & 3) << 6));
            i14 = i13;
        }
        return byteArrayOutputStream.toByteArray();
    }

    public static String d(String str) {
        if (TextUtils.isEmpty(str)) {
            return "";
        }
        return d(str.getBytes());
    }

    private static synchronized Character d(char c10, String str) {
        try {
            if (TextUtils.isEmpty(str)) {
                if (TextUtils.isEmpty(f72042dm)) {
                    f72042dm = m(f72041dd);
                }
                str = f72042dm;
            }
            HashMap<Character, Character> map = f72044m.get(str);
            if (map == null) {
                map = new HashMap<>();
                if (str.length() >= f72047q.length) {
                    int i10 = 0;
                    while (true) {
                        char[] cArr = f72047q;
                        if (i10 >= cArr.length) {
                            break;
                        }
                        map.put(Character.valueOf(str.charAt(i10)), Character.valueOf(cArr[i10]));
                        i10++;
                    }
                    f72044m.put(str, map);
                }
            }
            if (map.containsKey(Character.valueOf(c10))) {
                return map.get(Character.valueOf(c10));
            }
            return Character.valueOf(c10);
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public static String d(String str, String str2) {
        String str3 = "";
        try {
            if (!TextUtils.isEmpty(str)) {
                char[] charArray = str.toCharArray();
                if (charArray != null && charArray.length > 0) {
                    char[] cArr = new char[charArray.length];
                    for (int i10 = 0; i10 < charArray.length; i10++) {
                        cArr[i10] = d(charArray[i10], str2).charValue();
                    }
                    str3 = new String(cArr);
                }
                return new String(q(str3));
            }
        } catch (Exception unused) {
        }
        return str3;
    }

    private static Character d(char c10) {
        if (f72043dn == null) {
            f72043dn = new HashMap();
            for (int i10 = 0; i10 < f206do.length(); i10++) {
                f72043dn.put(Character.valueOf(f206do.charAt(i10)), Character.valueOf(f72045n.charAt(i10)));
            }
        }
        if (f72043dn.containsKey(Character.valueOf(c10))) {
            return f72043dn.get(Character.valueOf(c10));
        }
        return Character.valueOf(c10);
    }
}