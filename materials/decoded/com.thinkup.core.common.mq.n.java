package com.thinkup.core.common.mq;

import com.thinkup.core.api.AdError;
import com.thinkup.core.api.TUAdRequest;
import com.thinkup.core.common.dm.ddd;
import com.thinkup.core.common.dm.m0;
import com.thinkup.core.common.o.nd;

/* JADX INFO: loaded from: classes7.dex */
public class n {

    /* JADX INFO: renamed from: m0, reason: collision with root package name */
    private static final String f71501m0 = "n";

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    String f71502d;

    /* JADX INFO: renamed from: d0, reason: collision with root package name */
    boolean f71503d0;

    /* JADX INFO: renamed from: dd, reason: collision with root package name */
    long f71504dd;

    /* JADX INFO: renamed from: dm, reason: collision with root package name */
    String f71505dm;

    /* JADX INFO: renamed from: dn, reason: collision with root package name */
    boolean f71506dn;

    /* JADX INFO: renamed from: do, reason: not valid java name */
    Boolean f198do;

    /* JADX INFO: renamed from: dq, reason: collision with root package name */
    com.thinkup.core.common.nn.m.o f71507dq;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    dm f71508m;

    /* JADX INFO: renamed from: md, reason: collision with root package name */
    private TUAdRequest f71509md;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    int f71510n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    o f71511o;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    int f71512q;

    /* JADX INFO: renamed from: com.thinkup.core.common.mq.n$1, reason: invalid class name */
    public class AnonymousClass1 implements Runnable {
        public AnonymousClass1() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            n.this.dq();
        }
    }

    public n(String str) {
        this.f71502d = str;
        this.f71505dm = str + "_" + hashCode();
    }

    private Boolean d0() {
        return this.f198do;
    }

    private void dd() {
        if (this.f71503d0 && this.f71504dd != -1) {
            this.f71507dq = new com.thinkup.core.common.nn.m.o(com.thinkup.core.common.nn.m.q.d0md, new AnonymousClass1());
            com.thinkup.core.common.nd.n.d().d(this.f71507dq, this.f71504dd);
        }
    }

    private void dm() {
        if (this.f71507dq != null) {
            com.thinkup.core.common.nd.n.d().d(this.f71507dq);
        }
    }

    private com.thinkup.core.common.d0 dn() {
        return com.thinkup.core.common.d0.d(nd.m().dd(), this.f71502d, String.valueOf(this.f71512q));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: do, reason: not valid java name */
    public synchronized void m286do() {
        dm();
        o oVar = this.f71511o;
        if (oVar != null) {
            oVar.d(this.f71505dm, this.f71508m);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public synchronized void dq() {
        o oVar = this.f71511o;
        if (oVar != null) {
            oVar.m(this.f71505dm, this.f71508m);
        }
    }

    private ddd m0() {
        com.thinkup.core.common.dm.m mVar;
        ddd dddVar = new ddd();
        dddVar.d(nd.m().d0m());
        dddVar.f67976n = this.f71510n;
        dddVar.d(this.f71509md);
        dm dmVar = this.f71508m;
        if (dmVar != null) {
            m0 m0Var = dmVar.f71487dd;
            ddd dddVar2 = dmVar.f71486d0;
            com.thinkup.core.q.m0 m0Var2 = dmVar.f71488dm;
            dd ddVar = dmVar.f197do;
            if (dddVar2 != null) {
                mVar = dddVar2.f67967dn;
                if (mVar == null) {
                    mVar = new com.thinkup.core.common.dm.m();
                }
                mVar.d(dddVar2.f67963d);
            } else {
                mVar = new com.thinkup.core.common.dm.m();
                if (this.f71510n == 17) {
                    mVar.m(m0Var != null ? 1 : 2);
                }
            }
            mVar.d(this.f71508m.f71489dn);
            if (m0Var != null) {
                mVar.d(m0Var.mnq(), m0Var.dmq(), m0Var.mnn());
            } else if (m0Var2 != null) {
                mVar.d(m0Var2.dn(), m0Var2.m0o(), m0Var2.do0());
            }
            if (ddVar != null) {
                mVar.m(ddVar.dm());
                mVar.d(ddVar.d0());
                mVar.d(ddVar.dq());
            }
        } else {
            mVar = null;
        }
        dddVar.f67967dn = mVar;
        return dddVar;
    }

    public final void d(m mVar) {
        dm dmVar = mVar.f71495d;
        this.f71508m = dmVar;
        this.f71510n = mVar.f71497m;
        this.f71512q = dmVar.f71485d;
        this.f71511o = mVar.f71500q;
        this.f71503d0 = mVar.f71498n;
        this.f71504dd = mVar.f71499o;
        this.f71509md = mVar.f71496d0;
    }

    public final boolean m() {
        return this.f198do == null || !this.f71506dn;
    }

    public final void n() {
        com.thinkup.core.common.dm.m mVar;
        com.thinkup.core.common.d0 d0VarD = com.thinkup.core.common.d0.d(nd.m().dd(), this.f71502d, String.valueOf(this.f71512q));
        if (this.f71503d0 && this.f71504dd != -1) {
            this.f71507dq = new com.thinkup.core.common.nn.m.o(com.thinkup.core.common.nn.m.q.d0md, new AnonymousClass1());
            com.thinkup.core.common.nd.n.d().d(this.f71507dq, this.f71504dd);
        }
        ddd dddVar = new ddd();
        dddVar.d(nd.m().d0m());
        dddVar.f67976n = this.f71510n;
        dddVar.d(this.f71509md);
        dm dmVar = this.f71508m;
        if (dmVar != null) {
            m0 m0Var = dmVar.f71487dd;
            ddd dddVar2 = dmVar.f71486d0;
            com.thinkup.core.q.m0 m0Var2 = dmVar.f71488dm;
            dd ddVar = dmVar.f197do;
            if (dddVar2 != null) {
                mVar = dddVar2.f67967dn;
                if (mVar == null) {
                    mVar = new com.thinkup.core.common.dm.m();
                }
                mVar.d(dddVar2.f67963d);
            } else {
                mVar = new com.thinkup.core.common.dm.m();
                if (this.f71510n == 17) {
                    mVar.m(m0Var != null ? 1 : 2);
                }
            }
            mVar.d(this.f71508m.f71489dn);
            if (m0Var != null) {
                mVar.d(m0Var.mnq(), m0Var.dmq(), m0Var.mnn());
            } else if (m0Var2 != null) {
                mVar.d(m0Var2.dn(), m0Var2.m0o(), m0Var2.do0());
            }
            if (ddVar != null) {
                mVar.m(ddVar.dm());
                mVar.d(ddVar.d0());
                mVar.d(ddVar.dq());
            }
        } else {
            mVar = null;
        }
        dddVar.f67967dn = mVar;
        d0VarD.d(nd.m().dd(), String.valueOf(this.f71512q), this.f71502d, dddVar, new com.thinkup.core.common.o.d() { // from class: com.thinkup.core.common.mq.n.2
            @Override // com.thinkup.core.common.o.d
            public final void onAdLoadFail(AdError adError) {
                n.this.d(adError);
            }

            @Override // com.thinkup.core.common.o.d
            public final void onAdLoaded() {
                n.this.m286do();
            }
        });
    }

    public final int o() {
        return this.f71510n;
    }

    public final String q() {
        return this.f71502d;
    }

    public final String d() {
        return this.f71505dm;
    }

    private void d(Boolean bool) {
        this.f198do = bool;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public synchronized void d(AdError adError) {
        dm();
        o oVar = this.f71511o;
        if (oVar != null) {
            oVar.d(this.f71505dm, this.f71508m, adError);
        }
    }
}