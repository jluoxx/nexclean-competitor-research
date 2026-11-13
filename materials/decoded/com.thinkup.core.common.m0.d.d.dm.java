package com.thinkup.core.common.m0.d.d;

import android.os.SystemClock;
import android.text.TextUtils;
import com.thinkup.core.common.md.d.Cdo;
import com.thinkup.core.common.md.d.dq;
import com.thinkup.core.common.md.d.md;
import com.thinkup.core.common.md.d.mn;
import com.thinkup.core.common.md.m.mq;
import gq.e;
import java.net.InetAddress;
import java.net.SocketTimeoutException;
import java.net.UnknownHostException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.gj1;

/* JADX INFO: loaded from: classes7.dex */
public final class dm {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final String f69677d = "dm";

    /* JADX INFO: renamed from: d0, reason: collision with root package name */
    private static final Map<String, Long> f69678d0 = new LinkedHashMap<String, Long>() { // from class: com.thinkup.core.common.m0.d.d.dm.1
        @Override // java.util.LinkedHashMap
        public final boolean removeEldestEntry(Map.Entry<String, Long> entry) {
            return size() > 100;
        }
    };

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private static final int f69679m = 3;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static final long f69680n = 300000;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private static final int f69681o = 100;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private static final long f69682q = 12000;

    private dm() {
    }

    /* JADX WARN: Code duplicated, block: B:18:0x003e  */
    public static List<InetAddress> d(String str, boolean z10, com.thinkup.core.common.m0.n.d dVar, long j10) throws UnknownHostException {
        String str2;
        com.thinkup.core.common.m0.n.d dVar2;
        long j11;
        RuntimeException runtimeException;
        String str3;
        if (d(j10)) {
            throw m(str);
        }
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        List<InetAddress> listM = m(str, dVar);
        if (d(j10)) {
            throw m(str);
        }
        if (listM != null && !listM.isEmpty()) {
            if (dVar != null) {
                dVar.o(1);
                dVar.o(SystemClock.elapsedRealtime() - jElapsedRealtime);
            }
            return listM;
        }
        if (z10) {
            boolean zD = d();
            boolean zM = m();
            if (zD || zM) {
                str2 = str;
                dVar2 = dVar;
                j11 = j10;
                List<InetAddress> listD = d(str2, dVar2, jElapsedRealtime, zD, zM, j11);
                if (d(j11)) {
                    throw m(str2);
                }
                if (listD != null && !listD.isEmpty()) {
                    return listD;
                }
                runtimeException = new RuntimeException("L2/L3 both failed/empty (includeL2=" + zD + ", includeL3=" + zM + ")");
            } else {
                str2 = str;
                dVar2 = dVar;
                j11 = j10;
                runtimeException = null;
            }
        } else {
            str2 = str;
            dVar2 = dVar;
            j11 = j10;
            runtimeException = null;
        }
        if (d(j11)) {
            throw m(str2);
        }
        List<InetAddress> listO = o(str2);
        if (listO != null && !listO.isEmpty()) {
            if (d(j11)) {
                throw m(str2);
            }
            if (dVar2 != null) {
                dVar2.o(4);
                dVar2.o(SystemClock.elapsedRealtime() - jElapsedRealtime);
            }
            q(str2);
            return listO;
        }
        if (dVar2 != null) {
            dVar2.o(0);
            dVar2.o(SystemClock.elapsedRealtime() - jElapsedRealtime);
            dVar2.q(d(runtimeException, (Throwable) null, z10));
        }
        if (runtimeException != null) {
            str3 = runtimeException + ": " + runtimeException.getMessage();
        } else {
            str3 = "cant not resolve \"" + str2 + "\".";
        }
        if (dVar2 != null && TextUtils.isEmpty(dVar2.dq())) {
            dVar2.n(str3);
        }
        throw new UnknownHostException(str3);
    }

    private static List<InetAddress> m(String str, com.thinkup.core.common.m0.n.d dVar) {
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        try {
            List<InetAddress> listD = mq.f70980m.d(str);
            if (dVar != null) {
                dVar.m(SystemClock.elapsedRealtime() - jElapsedRealtime);
            }
            List<InetAddress> listD2 = o.d(listD);
            if (listD2 != null && !listD2.isEmpty()) {
                return listD2;
            }
            if (listD == null || listD.isEmpty() || dVar == null) {
                return null;
            }
            dVar.dm();
            dVar.m("All " + listD.size() + " address(es) filtered as invalid (likely DNS hijacking)");
            return null;
        } catch (Throwable th2) {
            if (dVar == null) {
                return null;
            }
            dVar.dm();
            dVar.m(th2 + ": " + th2.getMessage());
            return null;
        }
    }

    private static List<InetAddress> n(String str, com.thinkup.core.common.m0.n.d dVar) {
        dq[] dqVarArrM;
        if (dVar != null) {
            dVar.mn();
        }
        com.thinkup.core.common.md.d.o oVarD = com.thinkup.core.common.md.d.o.d();
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        boolean zM = oVarD.m();
        if (!zM && (dqVarArrM = com.thinkup.core.common.m0.n.n.m()) != null && dqVarArrM.length > 0) {
            oVarD.d(md.f155do, dqVarArrM);
            zM = oVarD.m();
        }
        if (!zM) {
            e.a("init custom dns server failed.");
            return null;
        }
        mn mnVarD = oVarD.d(new Cdo(str));
        ArrayList arrayList = null;
        com.thinkup.core.common.md.d.dd ddVarM = mnVarD != null ? mnVarD.m() : null;
        if (dVar != null) {
            dVar.n(SystemClock.elapsedRealtime() - jElapsedRealtime);
            if (ddVarM != null) {
                dVar.d(ddVarM.d());
                dVar.d(ddVarM.m());
                dVar.d(ddVarM.n());
            }
        }
        InetAddress[] inetAddressArrD = mnVarD != null ? mnVarD.d() : null;
        if (inetAddressArrD != null && inetAddressArrD.length > 0) {
            arrayList = new ArrayList();
            Collections.addAll(arrayList, inetAddressArrD);
            if (dVar != null) {
                dVar.m(1);
            }
        }
        return arrayList;
    }

    private static List<InetAddress> o(String str) {
        List<String> listD = com.thinkup.core.common.m0.m.m.d().d(str);
        if (listD == null || listD.isEmpty()) {
            return null;
        }
        List<InetAddress> listD2 = com.thinkup.core.common.m0.m.d.d(str, listD);
        if (listD2.isEmpty()) {
            return null;
        }
        return listD2;
    }

    private static void q(final String str) {
        if (str == null || str.isEmpty()) {
            return;
        }
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        Map<String, Long> map = f69678d0;
        synchronized (map) {
            try {
                Long l10 = map.get(str);
                if (l10 == null || jElapsedRealtime - l10.longValue() >= 300000) {
                    map.put(str, Long.valueOf(jElapsedRealtime));
                    try {
                        com.thinkup.core.common.nn.m.n.d().q(new com.thinkup.core.common.nn.m.o(com.thinkup.core.common.nn.m.q.f72098d, new Runnable() { // from class: com.thinkup.core.common.m0.d.d.dm.4
                            @Override // java.lang.Runnable
                            public final void run() {
                                try {
                                    mq.f70980m.d(str);
                                } catch (Throwable unused) {
                                }
                            }
                        }));
                    } catch (Throwable unused) {
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    private static UnknownHostException m(String str) {
        UnknownHostException unknownHostException = new UnknownHostException("DNS resolve deadline exceeded: ".concat(String.valueOf(str)));
        try {
            unknownHostException.initCause(new SocketTimeoutException("DNS resolve deadline exceeded"));
        } catch (Throwable unused) {
        }
        return unknownHostException;
    }

    private static boolean m() {
        try {
            com.thinkup.core.q.m mVarD = com.thinkup.core.q.o.d();
            return mVarD == null || mVarD.mm0();
        } catch (Throwable unused) {
            return true;
        }
    }

    private static List<InetAddress> n(String str) {
        List<InetAddress> listD = com.thinkup.core.common.md.d.d.d().d(str);
        if (listD != null) {
            listD.isEmpty();
        }
        return listD;
    }

    public static List<InetAddress> d(String str, boolean z10, com.thinkup.core.common.m0.n.d dVar) {
        return d(str, z10, dVar, 0L);
    }

    private static int d(Throwable th2, Throwable th3, boolean z10) {
        if (!z10) {
            return 1;
        }
        if (th2 != null) {
            return 2;
        }
        return th3 != null ? 3 : 4;
    }

    private static boolean d(long j10) {
        return j10 > 0 && SystemClock.elapsedRealtime() >= j10;
    }

    private static long d(long j10, long j11) {
        return j10 <= 0 ? f69682q : Math.max(0L, Math.min(f69682q, j10 - j11));
    }

    private static boolean d() {
        try {
            com.thinkup.core.q.m mVarD = com.thinkup.core.q.o.d();
            return mVarD == null || mVarD.mdq();
        } catch (Throwable unused) {
            return true;
        }
    }

    private static List<InetAddress> d(final String str, final com.thinkup.core.common.m0.n.d dVar, long j10, boolean z10, boolean z11, long j11) {
        if (!z10 && !z11) {
            return null;
        }
        final CountDownLatch countDownLatch = new CountDownLatch(1);
        final AtomicReference atomicReference = new AtomicReference();
        final AtomicInteger atomicInteger = new AtomicInteger(0);
        final AtomicInteger atomicInteger2 = new AtomicInteger((z10 ? 1 : 0) + (z11 ? 1 : 0));
        if (z10) {
            try {
                com.thinkup.core.common.nn.m.n.d().q(new com.thinkup.core.common.nn.m.o(com.thinkup.core.common.nn.m.q.f72098d, new Runnable() { // from class: com.thinkup.core.common.m0.d.d.dm.2
                    @Override // java.lang.Runnable
                    public final void run() {
                        try {
                            List<InetAddress> listD = o.d(dm.d(str, dVar));
                            if (listD != null && !listD.isEmpty() && gj1.a(atomicReference, null, listD)) {
                                atomicInteger.set(2);
                                countDownLatch.countDown();
                            }
                            if (atomicInteger2.decrementAndGet() != 0 || atomicReference.get() != null) {
                            }
                        } catch (Throwable th2) {
                            try {
                                com.thinkup.core.common.m0.n.d dVar2 = dVar;
                                if (dVar2 != null) {
                                    dVar2.n(th2 + ": " + th2.getMessage());
                                }
                            } finally {
                                if (atomicInteger2.decrementAndGet() == 0 && atomicReference.get() == null) {
                                    countDownLatch.countDown();
                                }
                            }
                        }
                    }
                }));
            } catch (Throwable unused) {
                if (atomicInteger2.decrementAndGet() == 0 && atomicReference.get() == null) {
                    countDownLatch.countDown();
                }
            }
        }
        if (z11) {
            try {
                com.thinkup.core.common.nn.m.n.d().q(new com.thinkup.core.common.nn.m.o(com.thinkup.core.common.nn.m.q.f72098d, new Runnable() { // from class: com.thinkup.core.common.m0.d.d.dm.3
                    @Override // java.lang.Runnable
                    public final void run() {
                        try {
                            List<InetAddress> listD = o.d(dm.d(str));
                            if (listD != null && !listD.isEmpty() && gj1.a(atomicReference, null, listD)) {
                                atomicInteger.set(3);
                                countDownLatch.countDown();
                            }
                            if (atomicInteger2.decrementAndGet() != 0 || atomicReference.get() != null) {
                                return;
                            }
                        } catch (Throwable unused2) {
                            if (atomicInteger2.decrementAndGet() != 0 || atomicReference.get() != null) {
                                return;
                            }
                        }
                        countDownLatch.countDown();
                    }
                }));
            } catch (Throwable unused2) {
                if (atomicInteger2.decrementAndGet() == 0 && atomicReference.get() == null) {
                    countDownLatch.countDown();
                }
            }
        }
        try {
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            long jMax = f69682q;
            if (j11 > 0) {
                jMax = Math.max(0L, Math.min(f69682q, j11 - jElapsedRealtime));
            }
            if (jMax > 0) {
                countDownLatch.await(jMax, TimeUnit.MILLISECONDS);
            }
        } catch (InterruptedException unused3) {
            Thread.currentThread().interrupt();
        }
        List<InetAddress> list = (List) atomicReference.get();
        if (list == null || list.isEmpty()) {
            return null;
        }
        if (dVar != null) {
            dVar.o(atomicInteger.get());
            dVar.o(SystemClock.elapsedRealtime() - j10);
        }
        return list;
    }

    public static /* synthetic */ List d(String str, com.thinkup.core.common.m0.n.d dVar) {
        dq[] dqVarArrM;
        if (dVar != null) {
            dVar.mn();
        }
        com.thinkup.core.common.md.d.o oVarD = com.thinkup.core.common.md.d.o.d();
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        boolean zM = oVarD.m();
        if (!zM && (dqVarArrM = com.thinkup.core.common.m0.n.n.m()) != null && dqVarArrM.length > 0) {
            oVarD.d(md.f155do, dqVarArrM);
            zM = oVarD.m();
        }
        if (zM) {
            mn mnVarD = oVarD.d(new Cdo(str));
            ArrayList arrayList = null;
            com.thinkup.core.common.md.d.dd ddVarM = mnVarD != null ? mnVarD.m() : null;
            if (dVar != null) {
                dVar.n(SystemClock.elapsedRealtime() - jElapsedRealtime);
                if (ddVarM != null) {
                    dVar.d(ddVarM.d());
                    dVar.d(ddVarM.m());
                    dVar.d(ddVarM.n());
                }
            }
            InetAddress[] inetAddressArrD = mnVarD != null ? mnVarD.d() : null;
            if (inetAddressArrD != null && inetAddressArrD.length > 0) {
                arrayList = new ArrayList();
                Collections.addAll(arrayList, inetAddressArrD);
                if (dVar != null) {
                    dVar.m(1);
                }
            }
            return arrayList;
        }
        e.a("init custom dns server failed.");
        return null;
    }

    public static /* synthetic */ List d(String str) {
        List<InetAddress> listD = com.thinkup.core.common.md.d.d.d().d(str);
        if (listD != null) {
            listD.isEmpty();
        }
        return listD;
    }
}