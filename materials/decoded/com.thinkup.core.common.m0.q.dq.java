package com.thinkup.core.common.m0.q;

import java.util.concurrent.RejectedExecutionException;

/* JADX INFO: loaded from: classes7.dex */
public class dq {

    /* JADX INFO: renamed from: dd, reason: collision with root package name */
    private static final int f70108dd = 3;

    /* JADX INFO: renamed from: dm, reason: collision with root package name */
    private static final int f70109dm = 3;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private static dq f70110m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static final Object f70111n = new Object();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final String f70112d = getClass().getSimpleName();

    /* JADX INFO: renamed from: d0, reason: collision with root package name */
    private volatile com.thinkup.core.common.m0.q.d.q f70113d0;

    /* JADX INFO: renamed from: dn, reason: collision with root package name */
    private volatile com.thinkup.core.common.m0.q.d.d0[] f70114dn;

    /* JADX INFO: renamed from: do, reason: not valid java name */
    private volatile com.thinkup.core.common.m0.q.d.m[] f150do;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private volatile com.thinkup.core.common.m0.q.d.q f70115o;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private volatile com.thinkup.core.common.m0.q.d.q f70116q;

    private dq() {
    }

    private com.thinkup.core.common.m0.q.d.d0[] m() {
        if (this.f70114dn == null) {
            synchronized (f70111n) {
                try {
                    if (this.f70114dn == null) {
                        com.thinkup.core.common.m0.q.d.d0[] d0VarArr = new com.thinkup.core.common.m0.q.d.d0[3];
                        for (int i10 = 0; i10 < 3; i10++) {
                            d0VarArr[i10] = new com.thinkup.core.common.m0.q.d.d0();
                        }
                        this.f70114dn = d0VarArr;
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        return this.f70114dn;
    }

    private com.thinkup.core.common.m0.q.d.m[] n() {
        if (this.f150do == null) {
            synchronized (f70111n) {
                try {
                    if (this.f150do == null) {
                        com.thinkup.core.common.m0.q.d.m[] mVarArr = new com.thinkup.core.common.m0.q.d.m[3];
                        for (int i10 = 0; i10 < 3; i10++) {
                            mVarArr[i10] = new com.thinkup.core.common.m0.q.d.m();
                        }
                        this.f150do = mVarArr;
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        return this.f150do;
    }

    public final void d(dn dnVar, dn.d dVar) {
        com.thinkup.core.common.m0.q.d.q qVar;
        int iD = dnVar.d();
        if (iD == 12 || iD == 12) {
            d(m(), dnVar, dVar);
            return;
        }
        if (iD == 13) {
            d(n(), dnVar, dVar);
            return;
        }
        synchronized (f70111n) {
            try {
                if (iD == 9) {
                    if (this.f70113d0 == null) {
                        this.f70113d0 = new com.thinkup.core.common.m0.q.d.o();
                    }
                    qVar = this.f70113d0;
                } else if (iD == 6) {
                    if (this.f70116q == null) {
                        this.f70116q = new com.thinkup.core.common.m0.q.d.n();
                    }
                    qVar = this.f70116q;
                } else {
                    if (this.f70115o == null) {
                        this.f70115o = new com.thinkup.core.common.m0.q.d.d();
                    }
                    qVar = this.f70115o;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        if (qVar != null) {
            qVar.n(dnVar, dVar);
        } else if (dVar != null) {
            dVar.d((Throwable) new Exception("socketUploadData is null."));
        }
    }

    public static dq d() {
        if (f70110m == null) {
            synchronized (dq.class) {
                try {
                    if (f70110m == null) {
                        f70110m = new dq();
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        return f70110m;
    }

    private static void d(com.thinkup.core.common.m0.q.d.q[] qVarArr, dn dnVar, dn.d dVar) {
        for (com.thinkup.core.common.m0.q.d.q qVar : qVarArr) {
            if (qVar != null && qVar.d0()) {
                qVar.n(dnVar, dVar);
                return;
            }
        }
        if (dVar != null) {
            dVar.d((Throwable) new RejectedExecutionException("all TCP connections busy, fallback to HTTP"));
        }
    }
}