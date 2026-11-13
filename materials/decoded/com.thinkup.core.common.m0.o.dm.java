package com.thinkup.core.common.m0.o;

import android.content.Context;
import android.text.TextUtils;
import com.thinkup.core.common.nn.q0;
import java.util.Map;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes7.dex */
public final class dm {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final String f69983d = "HttpReqLimitInterceptor";

    /* JADX INFO: renamed from: d0, reason: collision with root package name */
    private long f69984d0;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final Object f69985m = new Object();

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final Context f69986n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private final Map<String, Long> f69987o;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private final d f69988q;

    public static class d {

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public long f69990m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public boolean f69991n = true;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public int f69989d = 5;

        public d(long j10) {
            this.f69990m = j10;
        }
    }

    public dm(Context context, Map<String, Long> map, d dVar) {
        this.f69986n = context;
        this.f69987o = map;
        this.f69988q = dVar;
    }

    private static String d0(com.thinkup.core.common.m0.n.o oVar) {
        if (oVar == null) {
            return "";
        }
        return oVar.m() + "_data_timestamp";
    }

    private void m(com.thinkup.core.common.m0.n.o oVar) {
        String strD = d(oVar);
        String strO = o(oVar);
        this.f69987o.put(strD, 0L);
        com.thinkup.core.common.n0.d dVarN = q0.n(this.f69986n, "thinkup_app_pl_cl_retry");
        dVarN.d(strD, 0L);
        dVarN.d(strO, 0L);
    }

    private static String n(com.thinkup.core.common.m0.n.o oVar) {
        if (oVar == null) {
            return "";
        }
        return oVar.m() + "_req_frist_timestamp";
    }

    private static String o(com.thinkup.core.common.m0.n.o oVar) {
        if (oVar == null) {
            return "";
        }
        return oVar.m() + "_req_count";
    }

    private static String q(com.thinkup.core.common.m0.n.o oVar) {
        if (oVar == null) {
            return "";
        }
        return oVar.m() + "_data";
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final com.thinkup.core.common.m0.n.d0 d(com.thinkup.core.common.m0.n.o oVar, com.thinkup.core.common.m0.n.d0 d0Var) {
        String str;
        long j10;
        long jLongValue;
        if (d0Var == null) {
            return null;
        }
        try {
            String strD = d(oVar);
            if (oVar != null) {
                str = oVar.m() + "_req_frist_timestamp";
            } else {
                str = "";
            }
            String strO = o(oVar);
            long jCurrentTimeMillis = System.currentTimeMillis();
            synchronized (this.f69985m) {
                try {
                    com.thinkup.core.common.n0.d dVarN = q0.n(this.f69986n, "thinkup_app_pl_cl_retry");
                    d dVar = this.f69988q;
                    if (dVar == null || dVar.f69991n) {
                        long jLongValue2 = ((Long) dVarN.m(d0(oVar), 0L)).longValue();
                        j10 = 0;
                        String jSONObject = (String) dVarN.m(q(oVar), "");
                        boolean z10 = jLongValue2 > 0 && System.currentTimeMillis() - jLongValue2 <= d();
                        if (!TextUtils.isEmpty(jSONObject) && z10) {
                            jSONObject = new JSONObject(jSONObject);
                            try {
                                d0Var.d(jSONObject);
                                d0Var.m(200);
                                d0Var.d(true);
                            } catch (Throwable unused) {
                            }
                        }
                    } else {
                        j10 = 0;
                    }
                    if (!d0Var.q()) {
                        long jLongValue3 = this.f69984d0;
                        if (jLongValue3 <= j10) {
                            jLongValue3 = ((Long) dVarN.m(str, 0L)).longValue();
                        }
                        this.f69984d0 = jLongValue3;
                        if (jLongValue3 <= j10 || jCurrentTimeMillis - jLongValue3 >= d()) {
                            this.f69984d0 = jCurrentTimeMillis;
                            dVarN.d(str, Long.valueOf(jCurrentTimeMillis));
                            jLongValue = j10;
                        } else {
                            jLongValue = ((Long) dVarN.m(strO, 0L)).longValue();
                        }
                        d dVar2 = this.f69988q;
                        if (jLongValue == (dVar2 != null ? dVar2.f69989d : 5) - 1) {
                            if (this.f69984d0 == j10) {
                                this.f69984d0 = jCurrentTimeMillis;
                            }
                            long jD = this.f69984d0 + d();
                            Map<String, Long> map = this.f69987o;
                            if (map != null) {
                                map.put(strD, Long.valueOf(jD));
                            }
                            dVarN.d(strD, Long.valueOf(jD));
                        } else {
                            dVarN.d(strO, Long.valueOf(jLongValue + 1));
                        }
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        } catch (Throwable unused2) {
        }
        return d0Var;
    }

    private int m() {
        d dVar = this.f69988q;
        if (dVar != null) {
            return dVar.f69989d;
        }
        return 5;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private void d(com.thinkup.core.common.m0.n.d0 d0Var, com.thinkup.core.common.m0.n.o oVar, com.thinkup.core.common.n0.d dVar) {
        d dVar2 = this.f69988q;
        if (dVar2 == null || dVar2.f69991n) {
            long jLongValue = ((Long) dVar.m(d0(oVar), 0L)).longValue();
            String jSONObject = (String) dVar.m(q(oVar), "");
            boolean z10 = jLongValue > 0 && System.currentTimeMillis() - jLongValue <= d();
            if (TextUtils.isEmpty(jSONObject) || !z10) {
                return;
            }
            try {
                jSONObject = new JSONObject(jSONObject);
            } catch (Throwable unused) {
            }
            try {
                d0Var.d(jSONObject);
                d0Var.m(200);
                d0Var.d(true);
            } catch (Throwable unused2) {
            }
        }
    }

    private long d(com.thinkup.core.common.n0.d dVar, String str) {
        long j10 = this.f69984d0;
        return j10 <= 0 ? ((Long) dVar.m(str, 0L)).longValue() : j10;
    }

    private long d() {
        d dVar = this.f69988q;
        if (dVar != null) {
            return dVar.f69990m;
        }
        return 3600000L;
    }

    public static String d(com.thinkup.core.common.m0.n.o oVar) {
        if (oVar == null) {
            return "";
        }
        return oVar.m() + "_req_next_timestamp";
    }

    public final void d(com.thinkup.core.common.m0.n.d0 d0Var, com.thinkup.core.common.m0.n.o oVar) {
        Object objDd = d0Var.dd();
        try {
            synchronized (this.f69985m) {
                try {
                    d dVar = this.f69988q;
                    if (dVar != null && dVar.f69991n && objDd != null) {
                        q0.m(this.f69986n, "thinkup_app_pl_cl_retry", q(oVar), objDd.toString());
                        q0.d(this.f69986n, "thinkup_app_pl_cl_retry", d0(oVar), System.currentTimeMillis());
                    }
                    String strD = d(oVar);
                    String strO = o(oVar);
                    this.f69987o.put(strD, 0L);
                    com.thinkup.core.common.n0.d dVarN = q0.n(this.f69986n, "thinkup_app_pl_cl_retry");
                    dVarN.d(strD, 0L);
                    dVarN.d(strO, 0L);
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        } catch (Throwable unused) {
        }
    }
}