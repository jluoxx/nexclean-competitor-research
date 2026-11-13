package li;

import com.neeeex.eraser.m0;
import java.security.MessageDigest;
import java.security.SecureRandom;
import java.util.Random;

/* JADX INFO: loaded from: classes7.dex */
public abstract class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final String f87865a = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz" /* decoded XOR */;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final char[] f87866b = "0123456789abcdef" /* decoded XOR */.toCharArray();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Random f87867c = new SecureRandom();

    public static String a(byte[] bArr) {
        char[] cArr = new char[bArr.length * 2];
        for (int i10 = 0; i10 < bArr.length; i10++) {
            byte b10 = bArr[i10];
            int i11 = i10 * 2;
            char[] cArr2 = f87866b;
            cArr[i11] = cArr2[(b10 & 255) >>> 4];
            cArr[i11 + 1] = cArr2[b10 & 15];
        }
        return new String(cArr);
    }

    public static String b(String str) {
        try {
            return a(d().digest(str.getBytes()));
        } catch (Exception unused) {
            return null;
        }
    }

    public static String c(int i10) {
        char[] cArr = new char[i10];
        for (int i11 = 0; i11 < i10; i11++) {
            String str = f87865a;
            cArr[i11] = str.charAt(f87867c.nextInt(str.length()));
        }
        return new String(cArr);
    }

    public static MessageDigest d() {
        return MessageDigest.getInstance("MD5" /* decoded XOR */);
    }
}