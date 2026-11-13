package nb;

import java.nio.charset.StandardCharsets;

/* JADX INFO: loaded from: classes6.dex */
public final class a {
    public static byte[] b(byte[] bArr, byte[] bArr2) {
        int length = bArr.length;
        int length2 = bArr2.length;
        int i10 = 0;
        int i11 = 0;
        while (i10 < length) {
            if (i11 >= length2) {
                i11 = 0;
            }
            bArr[i10] = (byte) (bArr[i10] ^ bArr2[i11]);
            i10++;
            i11++;
        }
        return bArr;
    }

    public String a(byte[] bArr, byte[] bArr2) {
        return new String(b(bArr, bArr2), StandardCharsets.UTF_8);
    }
}