package com.thinkup.core.common.m0.q.d;

import android.os.SystemClock;
import android.text.TextUtils;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import com.thinkup.core.api.TUSDK;
import com.thinkup.core.common.m0.n.dm;
import com.thinkup.core.common.m0.q.dn;
import com.thinkup.core.common.nn.mo;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.net.SocketException;
import java.net.SocketTimeoutException;
import java.nio.ByteBuffer;
import java.util.List;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.zip.GZIPInputStream;

/* JADX INFO: loaded from: classes7.dex */
public abstract class q {

    /* JADX INFO: renamed from: md, reason: collision with root package name */
    private static final int f70064md = 5242880;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static final int f70065n = 0;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private static final int f70066o = 1;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private static final int f70067q = 7;

    /* JADX INFO: renamed from: d0, reason: collision with root package name */
    private String f70069d0;

    /* JADX INFO: renamed from: dd, reason: collision with root package name */
    private int f70070dd;

    /* JADX INFO: renamed from: dm, reason: collision with root package name */
    private String f70071dm;

    /* JADX INFO: renamed from: dn, reason: collision with root package name */
    private long f70072dn;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    protected Socket f70074m;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final String f70068d = getClass().getSimpleName();

    /* JADX INFO: renamed from: do, reason: not valid java name */
    private byte[] f148do = null;

    /* JADX INFO: renamed from: dq, reason: collision with root package name */
    private final byte[] f70073dq = new byte[1];

    /* JADX INFO: renamed from: m0, reason: collision with root package name */
    private final AtomicBoolean f70075m0 = new AtomicBoolean(false);

    private void d(dn dnVar, dm dmVar, long j10) {
        synchronized (this) {
            try {
                if (this.f70074m == null) {
                    Socket socket = new Socket();
                    this.f70074m = socket;
                    socket.setSoTimeout(d(o(), j10));
                }
                if (dmVar == null) {
                    throw new IllegalArgumentException("The domain must not can be null or empty.");
                }
                this.f70069d0 = dmVar.d();
                this.f70070dd = dmVar.m();
                com.thinkup.core.common.m0.n.d dVar = new com.thinkup.core.common.m0.n.d();
                dVar.o(dnVar.getClass().getName());
                dVar.q(this.f70069d0 + ":" + this.f70070dd);
                dVar.d0(2);
                try {
                    InetSocketAddress inetSocketAddressD = d(this.f70069d0, this.f70070dd, dVar, j10);
                    InetAddress address = inetSocketAddressD.getAddress();
                    this.f70071dm = address != null ? address.getHostAddress() : null;
                    try {
                        int iD = d(30000, j10);
                        this.f70074m.setSoTimeout(d(o(), j10));
                        this.f70074m.connect(inetSocketAddressD, iD);
                        dq();
                        dVar.m(1);
                        try {
                            com.thinkup.core.common.nm.d0.d(dVar);
                        } catch (Throwable unused) {
                        }
                    } catch (Throwable th2) {
                        try {
                            dVar.m(0);
                            dVar.n(th2.getClass().getSimpleName() + ": " + th2.getMessage());
                            throw th2;
                        } catch (Throwable th3) {
                            try {
                                com.thinkup.core.common.nm.d0.d(dVar);
                            } catch (Throwable unused2) {
                            }
                            throw th3;
                        }
                    }
                } catch (Throwable th4) {
                    dVar.m(0);
                    dVar.n(th4.getClass().getSimpleName() + ": " + th4.getMessage());
                    try {
                        com.thinkup.core.common.nm.d0.d(dVar);
                    } catch (Throwable unused3) {
                    }
                    throw th4;
                }
            } catch (Throwable th5) {
                throw th5;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void d0(dn dnVar, dn.d dVar) {
        Throwable thO;
        try {
            if (d()) {
                synchronized (this) {
                    thO = o(dnVar, dVar);
                }
            } else {
                thO = o(dnVar, dVar);
            }
            if (thO != null) {
                d(dVar, thO);
            }
            dd();
        } catch (Throwable th2) {
            dd();
            throw th2;
        }
    }

    private void dd() {
        this.f70075m0.set(false);
    }

    private void dm() {
        synchronized (this) {
            try {
                try {
                    Socket socket = this.f70074m;
                    if (socket != null) {
                        socket.close();
                        this.f70074m = null;
                    }
                } catch (Exception unused) {
                } finally {
                    this.f70072dn = 0L;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    private boolean dn() {
        Socket socket = this.f70074m;
        return (socket == null || !socket.isConnected() || this.f70074m.isClosed()) ? false : true;
    }

    /* JADX INFO: renamed from: do, reason: not valid java name */
    private boolean m261do() {
        long j10 = this.f70072dn;
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        long jQ = q();
        return jQ > 0 && j10 > 0 && jElapsedRealtime >= j10 && jElapsedRealtime - j10 >= jQ;
    }

    private void dq() {
        if (q() > 0) {
            this.f70072dn = SystemClock.elapsedRealtime();
        }
    }

    private synchronized void m(dn dnVar, dm dmVar, long j10) {
        if (dmVar != null) {
            try {
                dnVar.d(dmVar);
            } catch (Throwable th2) {
                throw th2;
            }
        }
        long j11 = this.f70072dn;
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        long jQ = q();
        if (jQ > 0 && j11 > 0 && jElapsedRealtime >= j11 && jElapsedRealtime - j11 >= jQ) {
            dm();
        }
        dm dmVarC_ = (dmVar == null && n()) ? dnVar.c_() : dmVar;
        if (n() && dmVarC_ != null && dn() && (!TextUtils.equals(this.f70069d0, dmVarC_.d()) || this.f70070dd != dmVarC_.m())) {
            dm();
        }
        if (!dn()) {
            if (dmVar == null) {
                dmVar = dmVarC_;
            }
            if (dmVar == null) {
                dmVar = dnVar.c_();
            }
            synchronized (this) {
                try {
                    if (this.f70074m == null) {
                        Socket socket = new Socket();
                        this.f70074m = socket;
                        socket.setSoTimeout(d(o(), j10));
                    }
                    if (dmVar == null) {
                        throw new IllegalArgumentException("The domain must not can be null or empty.");
                    }
                    this.f70069d0 = dmVar.d();
                    this.f70070dd = dmVar.m();
                    com.thinkup.core.common.m0.n.d dVar = new com.thinkup.core.common.m0.n.d();
                    dVar.o(dnVar.getClass().getName());
                    dVar.q(this.f70069d0 + ":" + this.f70070dd);
                    dVar.d0(2);
                    try {
                        InetSocketAddress inetSocketAddressD = d(this.f70069d0, this.f70070dd, dVar, j10);
                        InetAddress address = inetSocketAddressD.getAddress();
                        this.f70071dm = address != null ? address.getHostAddress() : null;
                        try {
                            int iD = d(30000, j10);
                            this.f70074m.setSoTimeout(d(o(), j10));
                            this.f70074m.connect(inetSocketAddressD, iD);
                            dq();
                            dVar.m(1);
                            try {
                                com.thinkup.core.common.nm.d0.d(dVar);
                            } catch (Throwable unused) {
                            }
                        } catch (Throwable th3) {
                            try {
                                dVar.m(0);
                                dVar.n(th3.getClass().getSimpleName() + ": " + th3.getMessage());
                                throw th3;
                            } catch (Throwable th4) {
                                try {
                                    com.thinkup.core.common.nm.d0.d(dVar);
                                } catch (Throwable unused2) {
                                }
                                throw th4;
                            }
                        }
                    } catch (Throwable th5) {
                        dVar.m(0);
                        dVar.n(th5.getClass().getSimpleName() + ": " + th5.getMessage());
                        try {
                            com.thinkup.core.common.nm.d0.d(dVar);
                        } catch (Throwable unused3) {
                        }
                        throw th5;
                    }
                } catch (Throwable th6) {
                    throw th6;
                }
            }
        }
        Socket socket2 = this.f70074m;
        if (socket2 != null) {
            socket2.setSoTimeout(d(o(), j10));
        }
        byte[] bArrN = dnVar.n();
        if (bArrN != null) {
            int length = bArrN.length;
            if (bArrN.length == 0) {
                return;
            }
            int i10 = length + 7;
            byte[] bArr = this.f148do;
            if (bArr == null || bArr.length < i10) {
                this.f148do = new byte[i10];
            }
            this.f148do[0] = 0;
            int iD2 = dnVar.d();
            if (iD2 == 12 || iD2 == 13) {
                this.f148do[0] = 1;
            }
            byte[] bArr2 = this.f148do;
            bArr2[1] = 3;
            bArr2[2] = (byte) dnVar.d();
            byte[] bArr3 = this.f148do;
            bArr3[3] = (byte) ((length >>> 24) & 255);
            bArr3[4] = (byte) ((length >>> 16) & 255);
            bArr3[5] = (byte) ((length >>> 8) & 255);
            bArr3[6] = (byte) (length & 255);
            System.arraycopy(bArrN, 0, bArr3, 7, bArrN.length);
            OutputStream outputStream = this.f70074m.getOutputStream();
            outputStream.write(this.f148do, 0, i10);
            outputStream.flush();
            dq();
        }
    }

    private void m0() {
        String strMn = mn();
        if (TextUtils.isEmpty(this.f70069d0) || TextUtils.isEmpty(strMn)) {
            return;
        }
        com.thinkup.core.common.m0.m.m.d().d(this.f70069d0, strMn);
    }

    private void md() {
        String strMn = mn();
        if (TextUtils.isEmpty(this.f70069d0) || TextUtils.isEmpty(strMn)) {
            return;
        }
        com.thinkup.core.common.m0.m.m.d().m(this.f70069d0, strMn);
    }

    private void mm() {
        dm();
    }

    private String mn() {
        try {
            Socket socket = this.f70074m;
            InetAddress inetAddress = socket != null ? socket.getInetAddress() : null;
            return inetAddress != null ? inetAddress.getHostAddress() : this.f70071dm;
        } catch (Throwable unused) {
            return this.f70071dm;
        }
    }

    private Throwable o(dn dnVar, dn.d dVar) {
        long j10;
        if (!dnVar.dn()) {
            return q(dnVar, dVar);
        }
        try {
            dm dmVarC_ = dnVar.c_();
            long jMo262do = dnVar.mo262do();
            long jMax = 0;
            if (jMo262do <= 0) {
                j10 = jMax;
            } else {
                long jElapsedRealtime = SystemClock.elapsedRealtime();
                long j11 = jMo262do - jElapsedRealtime;
                if (j11 <= 0) {
                    j10 = jElapsedRealtime;
                } else {
                    jMax = Math.max(1L, j11 / 2) + jElapsedRealtime;
                    j10 = jMax;
                }
            }
            Throwable thD = d(dnVar, dVar, dmVarC_, j10, "main");
            if (thD == null) {
                return null;
            }
            dm dmVarDm = dnVar.dm();
            if (dmVarDm != null && !TextUtils.isEmpty(dmVarDm.d()) && dmVarDm.m() > 0) {
                if (dmVarC_ != null && TextUtils.equals(dmVarC_.d(), dmVarDm.d()) && dmVarC_.m() == dmVarDm.m()) {
                    return thD;
                }
                if (jMo262do > 0 && jMo262do <= SystemClock.elapsedRealtime()) {
                    return thD;
                }
                dm();
                thD = d(dnVar, dVar, dmVarDm, jMo262do, "backup");
                if (thD == null) {
                    return null;
                }
            }
            return thD;
        } catch (Throwable th2) {
            d(th2);
            return th2;
        }
    }

    private Throwable q(dn dnVar, dn.d dVar) {
        long jMo262do = dnVar.mo262do();
        try {
            m(dnVar, null, jMo262do);
            if (m(dnVar, dVar)) {
                m0();
            }
            return null;
        } catch (SocketException unused) {
            md();
            dm();
            try {
                m(dnVar, null, jMo262do);
                if (m(dnVar, dVar)) {
                    m0();
                }
                return null;
            } catch (Throwable th2) {
                th = th2;
                d(th);
                return th;
            }
        } catch (Throwable th3) {
            th = th3;
            d(th);
            return th;
        }
    }

    public abstract void d(dn dnVar, dn.d dVar);

    public final void n(final dn dnVar, final dn.d dVar) {
        RejectedExecutionException rejectedExecutionException;
        boolean zO;
        com.thinkup.core.common.nn.m.o oVar = new com.thinkup.core.common.nn.m.o(com.thinkup.core.common.nn.m.q.qmq + "_" + dnVar.d(), new Runnable() { // from class: com.thinkup.core.common.m0.q.d.a
            @Override // java.lang.Runnable
            public final void run() {
                this.f70054a.d0(dnVar, dVar);
            }
        });
        if (!m()) {
            com.thinkup.core.common.nn.m.n.d().n(oVar);
            return;
        }
        try {
            zO = com.thinkup.core.common.nn.m.n.d().o(oVar);
            rejectedExecutionException = null;
        } catch (Throwable th2) {
            rejectedExecutionException = th2;
            zO = false;
        }
        if (zO) {
            return;
        }
        dd();
        if (rejectedExecutionException == null) {
            rejectedExecutionException = new RejectedExecutionException("TCP-first executor is saturated");
        }
        d(dVar, rejectedExecutionException);
    }

    public final boolean d0() {
        return this.f70075m0.compareAndSet(false, true);
    }

    public long q() {
        return 0L;
    }

    public boolean n() {
        return false;
    }

    public int o() {
        return 60000;
    }

    public boolean d() {
        return false;
    }

    private static boolean d(long j10, long j11, long j12) {
        return j12 > 0 && j10 > 0 && j11 >= j10 && j11 - j10 >= j12;
    }

    private com.thinkup.core.common.m0.n.d d(dn dnVar) {
        com.thinkup.core.common.m0.n.d dVar = new com.thinkup.core.common.m0.n.d();
        dVar.o(dnVar.getClass().getName());
        dVar.q(this.f70069d0 + ":" + this.f70070dd);
        dVar.d0(2);
        return dVar;
    }

    private static InetSocketAddress d(String str, int i10, com.thinkup.core.common.m0.n.d dVar, long j10) throws SocketTimeoutException {
        if (j10 > 0 && j10 <= SystemClock.elapsedRealtime()) {
            throw new SocketTimeoutException("TCP DNS deadline exceeded before lookup");
        }
        try {
            List<InetAddress> listD = com.thinkup.core.common.m0.d.d.dm.d(str, !TUSDK.isCnSDK(), dVar, j10);
            if (listD != null && !listD.isEmpty()) {
                return new InetSocketAddress(listD.get(0), i10);
            }
        } catch (Throwable th2) {
            if (j10 > 0) {
                throw new SocketTimeoutException("TCP DNS deadline exceeded: " + th2.getMessage());
            }
        }
        if (j10 <= 0) {
            return new InetSocketAddress(str, i10);
        }
        throw new SocketTimeoutException("TCP DNS resolution failed within deadline");
    }

    private static int d(int i10, long j10) throws SocketTimeoutException {
        if (j10 <= 0) {
            return i10;
        }
        long jElapsedRealtime = j10 - SystemClock.elapsedRealtime();
        if (jElapsedRealtime > 0) {
            return (int) Math.max(1L, Math.min(i10, Math.min(jElapsedRealtime, 2147483647L)));
        }
        throw new SocketTimeoutException("TCP endpoint attempt deadline exceeded");
    }

    private Throwable d(dn dnVar, dn.d dVar, dm dmVar, long j10, String str) {
        if (dmVar != null && !TextUtils.isEmpty(dmVar.d()) && dmVar.m() > 0) {
            try {
                d(dnVar, dVar, dmVar, j10);
                return null;
            } catch (SocketException unused) {
                md();
                dm();
                try {
                    d(dnVar, dVar, dmVar, j10);
                    return null;
                } catch (Throwable th2) {
                    d(th2);
                    return th2;
                }
            } catch (Throwable th3) {
                d(th3);
                return th3;
            }
        }
        return new IllegalArgumentException("TCP " + str + " endpoint is empty");
    }

    private void d(dn dnVar, dn.d dVar, dm dmVar, long j10) {
        m(dnVar, dmVar, j10);
        if (m(dnVar, dVar)) {
            m0();
        }
    }

    private static long d(long j10) {
        if (j10 <= 0) {
            return 0L;
        }
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        long j11 = j10 - jElapsedRealtime;
        return j11 <= 0 ? jElapsedRealtime : jElapsedRealtime + Math.max(1L, j11 / 2);
    }

    private static boolean d(dm dmVar, dm dmVar2) {
        if (dmVar2 == null || TextUtils.isEmpty(dmVar2.d()) || dmVar2.m() <= 0) {
            return false;
        }
        return (dmVar != null && TextUtils.equals(dmVar.d(), dmVar2.d()) && dmVar.m() == dmVar2.m()) ? false : true;
    }

    private static void d(dn.d dVar, Throwable th2) {
        if (th2 != null) {
            th2.getMessage();
            mo.d(th2.getStackTrace());
        }
        if (dVar != null) {
            dVar.d(th2);
        }
    }

    public final int d(InputStream inputStream) throws SocketException {
        if (inputStream.read(this.f70073dq, 0, 1) != -1) {
            byte[] bArr = this.f70073dq;
            byte b10 = bArr[0];
            bArr[0] = 0;
            return b10;
        }
        throw new SocketException("Socket.InputStream read length = -1!");
    }

    private void d(Throwable th2) {
        if (m(th2)) {
            try {
                md();
            } finally {
                dm();
            }
        }
    }

    public final void d(dn.d dVar) throws IOException {
        m(dVar);
    }

    public static void d(InputStream inputStream, byte[] bArr, int i10) throws IOException {
        int i11 = 0;
        while (i11 < i10) {
            int i12 = inputStream.read(bArr, i11, i10 - i11);
            if (i12 < 0) {
                throw new EOFException("stream closed before reading " + i10 + " bytes");
            }
            i11 += i12;
        }
    }

    private static byte[] d(byte[] bArr) {
        if (bArr.length == 0) {
            return null;
        }
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bArr);
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(bArr.length * 2);
        try {
            GZIPInputStream gZIPInputStream = new GZIPInputStream(byteArrayInputStream);
            try {
                byte[] bArr2 = new byte[1024];
                while (true) {
                    int i10 = gZIPInputStream.read(bArr2);
                    if (i10 <= 0) {
                        byte[] byteArray = byteArrayOutputStream.toByteArray();
                        gZIPInputStream.close();
                        return byteArray;
                    }
                    byteArrayOutputStream.write(bArr2, 0, i10);
                    return null;
                }
            } catch (Throwable th2) {
                try {
                    gZIPInputStream.close();
                } catch (Throwable th3) {
                    th2.addSuppressed(th3);
                }
                throw th2;
            }
        } catch (Throwable unused) {
            return null;
        }
    }

    public boolean m() {
        return false;
    }

    public boolean m(dn dnVar, dn.d dVar) {
        d(dnVar, dVar);
        return false;
    }

    private static boolean m(Throwable th2) {
        return (th2 instanceof SocketException) || (th2 instanceof SocketTimeoutException) || (th2 instanceof EOFException);
    }

    public final boolean m(dn.d dVar) throws IOException {
        boolean z10;
        InputStream inputStream = this.f70074m.getInputStream();
        d(inputStream, new byte[1], 1);
        int iD = d(inputStream);
        if (iD == 2) {
            z10 = false;
        } else {
            if (iD != 3) {
                if (dVar != null) {
                    dVar.d((Object) null);
                }
                return false;
            }
            z10 = true;
        }
        d(inputStream, new byte[1], 1);
        byte[] bArr = new byte[4];
        d(inputStream, bArr, 4);
        int i10 = ByteBuffer.wrap(bArr).getInt();
        if (i10 <= 0 || i10 > f70064md) {
            if (dVar != null) {
                dVar.d((Object) null);
            }
            return false;
        }
        byte[] bArrD = new byte[i10];
        d(inputStream, bArrD, i10);
        if (z10) {
            bArrD = d(bArrD);
        }
        if (bArrD == null) {
            if (dVar != null) {
                dVar.d((Object) null);
            }
            return false;
        }
        String str = new String(bArrD, C.UTF8_NAME);
        if (dVar != null) {
            dVar.d(str);
        }
        return true;
    }
}