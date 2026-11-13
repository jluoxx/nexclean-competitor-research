package com.thinkup.core.common.m0.m;

import com.thinkup.core.common.md.m.n0;
import com.thinkup.core.common.md.m.q;
import java.io.IOException;
import java.net.InetSocketAddress;
import java.net.SocketException;
import javax.net.ssl.SSLException;

/* JADX INFO: loaded from: classes7.dex */
public class n extends n0 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final n f69841d = new n();

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static final String f69842n = "n";

    private n() {
    }

    @Override // com.thinkup.core.common.md.m.n0
    public final void d(q qVar, InetSocketAddress inetSocketAddress, IOException iOException) {
        if (qVar == null || inetSocketAddress == null || inetSocketAddress.getAddress() == null) {
            return;
        }
        if (iOException instanceof SSLException ? false : iOException instanceof SocketException) {
            String strD = d(qVar);
            String hostAddress = inetSocketAddress.getAddress().getHostAddress();
            if (strD == null || hostAddress == null || !m.d().m(strD, hostAddress)) {
                return;
            }
            com.thinkup.core.common.m0.d.d.q.d().m();
        }
    }

    @Override // com.thinkup.core.common.md.m.n0
    public final void d(q qVar, InetSocketAddress inetSocketAddress) {
        if (qVar == null || inetSocketAddress == null || inetSocketAddress.getAddress() == null) {
            return;
        }
        String strD = d(qVar);
        String hostAddress = inetSocketAddress.getAddress().getHostAddress();
        if (strD == null || hostAddress == null) {
            return;
        }
        m.d().d(strD, hostAddress);
    }

    private static boolean d(IOException iOException) {
        if (iOException == null || (iOException instanceof SSLException)) {
            return false;
        }
        return iOException instanceof SocketException;
    }

    private static String d(q qVar) {
        try {
            return qVar.d().d().d0();
        } catch (Throwable unused) {
            return null;
        }
    }
}