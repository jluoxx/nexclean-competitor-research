package com.thinkup.core.common.m0.q;

import com.thinkup.core.common.o.nd;
import java.io.ByteArrayOutputStream;
import java.util.zip.GZIPOutputStream;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes7.dex */
public abstract class dn {

    /* JADX INFO: renamed from: d0, reason: collision with root package name */
    public static final int f70093d0 = 6;

    /* JADX INFO: renamed from: dd, reason: collision with root package name */
    public static final int f70094dd = 10;

    /* JADX INFO: renamed from: dm, reason: collision with root package name */
    public static final int f70095dm = 9;

    /* JADX INFO: renamed from: dn, reason: collision with root package name */
    public static final int f70096dn = 12;

    /* JADX INFO: renamed from: do, reason: not valid java name */
    public static final int f149do = 12;

    /* JADX INFO: renamed from: dq, reason: collision with root package name */
    public static final int f70097dq = 13;

    /* JADX INFO: renamed from: m0, reason: collision with root package name */
    public static final int f70098m0 = 2;

    /* JADX INFO: renamed from: md, reason: collision with root package name */
    public static final int f70099md = 3;

    /* JADX INFO: renamed from: mm, reason: collision with root package name */
    public static final int f70100mm = 4;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final int f70101o = 1;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final int f70102q = 2;

    /* JADX INFO: renamed from: mn, reason: collision with root package name */
    protected int f70103mn;

    /* JADX INFO: renamed from: mo, reason: collision with root package name */
    protected String f70104mo;

    public interface d {
        void d(Object obj);

        void d(Throwable th2);
    }

    public static byte[] d(String str) {
        if (str == null || str.length() == 0) {
            return null;
        }
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            GZIPOutputStream gZIPOutputStream = new GZIPOutputStream(byteArrayOutputStream);
            gZIPOutputStream.write(str.getBytes("utf-8"));
            gZIPOutputStream.close();
        } catch (Exception e10) {
            e10.printStackTrace();
        }
        return byteArrayOutputStream.toByteArray();
    }

    public com.thinkup.core.common.m0.n.dm c_() {
        com.thinkup.core.q.m mVarM = com.thinkup.core.q.o.d(nd.m().dd()).m(nd.m().mo());
        if (mVarM != null) {
            return new com.thinkup.core.common.m0.n.dm(mVarM.om(), mVarM.on());
        }
        return null;
    }

    public abstract int d();

    public int d0() {
        return 0;
    }

    public com.thinkup.core.common.m0.n.dm dm() {
        return null;
    }

    public boolean dn() {
        return false;
    }

    /* JADX INFO: renamed from: do */
    public long mo262do() {
        return 0L;
    }

    public final JSONObject dq() {
        return com.thinkup.core.common.m0.d0.d(d0());
    }

    public abstract int m();

    public final JSONObject m0() {
        return com.thinkup.core.common.m0.d0.m(d0());
    }

    public abstract byte[] n();

    public abstract boolean o();

    public void q() {
    }

    public void d(com.thinkup.core.common.m0.n.dm dmVar) {
    }

    public final void d(int i10, String str) {
        this.f70103mn = i10;
        this.f70104mo = str;
    }

    public final void d(d dVar) {
        dq.d().d(this, dVar);
    }
}