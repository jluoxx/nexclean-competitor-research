package com.thinkup.core.common.m0.o;

import android.content.Context;
import android.text.TextUtils;
import com.thinkup.core.common.nn.mo;
import com.thinkup.core.common.nn.q0;
import com.thinkup.core.common.o.nd;
import java.util.Map;

/* JADX INFO: loaded from: classes7.dex */
public final class m extends o {

    /* JADX INFO: renamed from: d0, reason: collision with root package name */
    private static final long f69995d0 = 24;

    /* JADX INFO: renamed from: dd, reason: collision with root package name */
    private static final long f69996dd = 86400000;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private static final String f69997q = "AppReqCapInterceptor";

    /* JADX INFO: renamed from: dm, reason: collision with root package name */
    private volatile boolean f69998dm;

    /* JADX INFO: renamed from: dn, reason: collision with root package name */
    private volatile long f69999dn;

    /* JADX INFO: renamed from: do, reason: not valid java name */
    private volatile long f147do;

    public m(Context context) {
        super(context);
        this.f69998dm = false;
        this.f69999dn = 0L;
        this.f147do = 0L;
    }

    private void o(com.thinkup.core.common.m0.n.o oVar) {
        try {
            com.thinkup.core.common.n0.d dVarN = q0.n(this.f70004m, "thinkup_app_pl_cl_retry");
            String strD = oVar.d();
            String strN = n(oVar);
            String strN2 = n(strD);
            String strM = m(strD);
            this.f70005n.put(strN, 0L);
            dVarN.d(strN, 0L);
            dVarN.d(strN2, Long.valueOf(f69995d0));
            dVarN.d(strM, 0L);
        } catch (Throwable unused) {
        }
    }

    private static String q(String str) {
        return str + "_agent_event";
    }

    @Override // com.thinkup.core.common.m0.o.o, com.thinkup.core.common.m0.o.dn
    public final com.thinkup.core.common.m0.n.d0 d(com.thinkup.core.common.m0.n.o oVar) {
        long jLongValue;
        if (!m(oVar)) {
            return null;
        }
        String strD = oVar.d();
        String strN = n(oVar);
        String strM = m(strD);
        String strN2 = n(strD);
        String str = strD + "_req_first_timestamp";
        try {
            com.thinkup.core.common.m0.n.d0 d0VarD = super.d(oVar);
            if (d0VarD == null) {
                return null;
            }
            try {
                synchronized (this.f70006o) {
                    try {
                        long jCurrentTimeMillis = System.currentTimeMillis();
                        com.thinkup.core.common.n0.d dVarN = q0.n(this.f70004m, "thinkup_app_pl_cl_retry");
                        long jLongValue2 = ((Long) dVarN.m(strN2, Long.valueOf(f69995d0))).longValue();
                        if (!d0VarD.q()) {
                            long jLongValue3 = this.f69999dn;
                            if (jLongValue3 <= 0) {
                                jLongValue3 = ((Long) dVarN.m(str, 0L)).longValue();
                            }
                            this.f69999dn = jLongValue3;
                            if (this.f69999dn <= 0 || jCurrentTimeMillis - this.f69999dn >= f69996dd) {
                                this.f69999dn = jCurrentTimeMillis;
                                dVarN.d(str, Long.valueOf(jCurrentTimeMillis));
                                jLongValue = 0;
                            } else {
                                jLongValue = ((Long) dVarN.m(strM, 0L)).longValue();
                            }
                            long j10 = 1;
                            if (jLongValue >= jLongValue2 - 1) {
                                long j11 = this.f69999dn + f69996dd;
                                Map<String, Long> map = this.f70005n;
                                if (map != null) {
                                    map.put(strN, Long.valueOf(j11));
                                }
                                long j12 = jLongValue2 / 4;
                                if (j12 > 1) {
                                    j10 = j12;
                                }
                                dVarN.d(strN2, Long.valueOf(j10));
                                dVarN.d(strN, Long.valueOf(j11));
                            } else {
                                long j13 = jLongValue + 1;
                                this.f147do = j13;
                                dVarN.d(strM, Long.valueOf(j13));
                            }
                        } else if (!this.f69998dm) {
                            this.f69998dm = true;
                            String str2 = strD + "_agent_event";
                            if (!((Boolean) dVarN.m(str2, Boolean.FALSE)).booleanValue()) {
                                com.thinkup.core.common.nm.d0.d(this.f69999dn, this.f147do, jLongValue2);
                                dVarN.d(str2, Boolean.TRUE);
                            }
                        }
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
                return d0VarD;
            } catch (Throwable unused) {
                return d0VarD;
            }
        } catch (Throwable unused2) {
            return null;
        }
    }

    @Override // com.thinkup.core.common.m0.o.o
    public final boolean m(com.thinkup.core.common.m0.n.o oVar) {
        return this.f70004m != null && oVar != null && com.thinkup.core.common.m0.n.dd.f69905m.equals(oVar.m()) && d(oVar.d());
    }

    @Override // com.thinkup.core.common.m0.o.o
    public final String n(com.thinkup.core.common.m0.n.o oVar) {
        if (oVar == null) {
            return "";
        }
        return oVar.d() + "_req_next_time";
    }

    private static String n(String str) {
        return str + "_req_count_limit";
    }

    private static String m(String str) {
        return str + "_req_count";
    }

    private static String o(String str) {
        return str + "_req_first_timestamp";
    }

    private long d(com.thinkup.core.common.n0.d dVar, String str) {
        long j10 = this.f69999dn;
        return j10 <= 0 ? ((Long) dVar.m(str, 0L)).longValue() : j10;
    }

    private boolean d(String str) {
        com.thinkup.core.q.m mVarM = com.thinkup.core.q.o.d(this.f70004m).m(nd.m().mo());
        if (this.f70004m == null || TextUtils.isEmpty(str)) {
            return false;
        }
        return (mVarM == null || !mVarM.m313do()) && mo.d(this.f70004m);
    }

    @Override // com.thinkup.core.common.m0.o.dn
    public final void d(com.thinkup.core.common.m0.n.d0 d0Var, com.thinkup.core.common.m0.n.o oVar) {
        if (!m(oVar) || d0Var == null) {
            return;
        }
        synchronized (this.f70006o) {
            try {
                com.thinkup.core.common.n0.d dVarN = q0.n(this.f70004m, "thinkup_app_pl_cl_retry");
                String strD = oVar.d();
                String strN = n(oVar);
                String strN2 = n(strD);
                String strM = m(strD);
                this.f70005n.put(strN, 0L);
                dVarN.d(strN, 0L);
                dVarN.d(strN2, Long.valueOf(f69995d0));
                dVarN.d(strM, 0L);
            } catch (Throwable unused) {
            }
        }
    }
}