package com.thinkup.core.common.m0.q.d;

import com.thinkup.core.common.m0.q.dn;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes7.dex */
public class n extends q {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static final int f70061n = 1;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private static final int f70062o = 2;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    protected String f70063d = getClass().getSimpleName();

    private boolean n(dn.d dVar) throws IOException {
        InputStream inputStream = this.f70074m.getInputStream();
        int iD = d(inputStream);
        if (iD != 2) {
            if (dVar != null) {
                dVar.d((Object) null);
            }
            return iD == 1;
        }
        q.d(inputStream, new byte[1], 1);
        byte[] bArr = new byte[4];
        q.d(inputStream, bArr, 4);
        int i10 = ByteBuffer.wrap(bArr).getInt();
        if (i10 <= 0) {
            if (dVar != null) {
                dVar.d((Object) null);
            }
            return false;
        }
        byte[] bArr2 = new byte[i10];
        q.d(inputStream, bArr2, i10);
        String str = new String(bArr2);
        if (dVar != null) {
            dVar.d(str);
        }
        return true;
    }

    @Override // com.thinkup.core.common.m0.q.d.q
    public synchronized void d(dn dnVar, dn.d dVar) {
        n(dVar);
    }

    @Override // com.thinkup.core.common.m0.q.d.q
    public synchronized boolean m(dn dnVar, dn.d dVar) {
        return n(dVar);
    }
}