package com.thinkup.core.common.m0.d.d;

import b.i0;
import com.thinkup.core.common.md.m.dq;
import com.thinkup.core.common.md.m.mo;
import com.thinkup.core.common.md.m.mq;
import com.thinkup.core.common.md.m.om;
import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.AbstractExecutorService;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes7.dex */
public class q {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final String f69702d = "q";

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private static volatile q f69703m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private volatile om f69705n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private volatile om f69706o;

    /* JADX INFO: renamed from: d0, reason: collision with root package name */
    private final ExecutorService f69704d0 = new m(0);

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private final dq f69707q = new dq(10, TimeUnit.MINUTES);

    public static class d implements mq {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final com.thinkup.core.common.m0.d.o f69709d;

        public d(com.thinkup.core.common.m0.d.o oVar) {
            this.f69709d = oVar;
        }

        @Override // com.thinkup.core.common.md.m.mq
        public final List<InetAddress> d(String str) {
            com.thinkup.core.common.m0.d.o oVar = this.f69709d;
            return oVar != null ? oVar.d(str) : mq.f70980m.d(str);
        }
    }

    public static class n implements mq {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        static final n f69710d = new n();

        private n() {
        }

        @Override // com.thinkup.core.common.md.m.mq
        public final List<InetAddress> d(String str) throws UnknownHostException {
            List<InetAddress> listD = mq.f70980m.d(str);
            List<InetAddress> listD2 = o.d(listD);
            if (listD2 != null && !listD2.isEmpty()) {
                return listD2;
            }
            StringBuilder sb2 = new StringBuilder("System DNS returned no valid address for ");
            sb2.append(str);
            sb2.append(" (raw size: ");
            sb2.append(listD == null ? 0 : listD.size());
            sb2.append(", all filtered as invalid)");
            throw new UnknownHostException(sb2.toString());
        }
    }

    private q() {
    }

    private int n() {
        dq dqVar = this.f69707q;
        if (dqVar != null) {
            return dqVar.m();
        }
        return 0;
    }

    private int o() {
        dq dqVar = this.f69707q;
        if (dqVar != null) {
            return dqVar.d();
        }
        return 0;
    }

    public final synchronized om d(com.thinkup.core.common.m0.d.d0 d0Var) {
        om omVar;
        try {
            com.thinkup.core.common.m0.d.o oVar = d0Var.f69717dm;
            if (oVar != null) {
                if (this.f69706o == null) {
                    this.f69706o = new om.d().n(d0Var.f69720n, d0Var.f69721o).m(d0Var.f69714d, d0Var.f69719m).d(d0Var.f69722q, d0Var.f69715d0).d(this.f69707q).d(new mo(this.f69704d0)).d(new d(oVar)).d(com.thinkup.core.common.m0.m.n.f69841d).d();
                } else {
                    this.f69706o = this.f69706o.nm().d(new d(oVar)).d();
                }
                omVar = this.f69706o;
            } else {
                omVar = null;
            }
            if (omVar == null) {
                if (this.f69705n == null) {
                    this.f69705n = new om.d().n(d0Var.f69720n, d0Var.f69721o).m(d0Var.f69714d, d0Var.f69719m).d(d0Var.f69722q, d0Var.f69715d0).d(this.f69707q).d(new mo(this.f69704d0)).d(n.f69710d).d(com.thinkup.core.common.m0.m.n.f69841d).d();
                }
                omVar = this.f69705n;
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return omVar;
    }

    public final int m() {
        try {
            dq dqVar = this.f69707q;
            if (dqVar == null) {
                return 0;
            }
            int iD = dqVar.d();
            if (iD > 0) {
                com.thinkup.core.common.nn.m.n.d().q(new com.thinkup.core.common.nn.m.o(com.thinkup.core.common.nn.m.q.odn, new Runnable() { // from class: com.thinkup.core.common.m0.d.d.q.1
                    @Override // java.lang.Runnable
                    public final void run() {
                        try {
                            q.this.f69707q.n();
                        } catch (Throwable unused) {
                        }
                    }
                }));
            }
            return iD;
        } catch (Throwable unused) {
            return 0;
        }
    }

    public static class m extends AbstractExecutorService implements AutoCloseable {
        private m() {
        }

        @Override // java.util.concurrent.ExecutorService
        public final boolean awaitTermination(long j10, TimeUnit timeUnit) {
            return false;
        }

        @Override // java.lang.AutoCloseable
        public /* synthetic */ void close() {
            i0.a(this);
        }

        @Override // java.util.concurrent.Executor
        public final void execute(Runnable runnable) {
            com.thinkup.core.common.nn.m.n.d().m().execute(runnable);
        }

        @Override // java.util.concurrent.ExecutorService
        public final boolean isShutdown() {
            return false;
        }

        @Override // java.util.concurrent.ExecutorService
        public final boolean isTerminated() {
            return false;
        }

        @Override // java.util.concurrent.ExecutorService
        public final void shutdown() {
        }

        @Override // java.util.concurrent.ExecutorService
        public final List<Runnable> shutdownNow() {
            return Collections.EMPTY_LIST;
        }

        public /* synthetic */ m(byte b10) {
            this();
        }
    }

    public static q d() {
        if (f69703m == null) {
            synchronized (q.class) {
                try {
                    if (f69703m == null) {
                        f69703m = new q();
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        return f69703m;
    }
}