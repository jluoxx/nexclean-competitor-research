package com.thinkup.core.common.m0.o;

import android.content.Context;
import android.text.TextUtils;
import com.thinkup.core.common.nn.q0;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes7.dex */
public abstract class o implements dn {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final String f70003d = "thinkup_app_pl_cl_retry";

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    protected final Context f70004m;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    protected final Object f70006o = new Object();

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    protected final Map<String, Long> f70005n = new ConcurrentHashMap(1);

    public o(Context context) {
        this.f70004m = context;
    }

    @Override // com.thinkup.core.common.m0.o.dn
    public com.thinkup.core.common.m0.n.d0 d(com.thinkup.core.common.m0.n.o oVar) {
        String strN = n(oVar);
        if (this.f70005n == null || TextUtils.isEmpty(strN)) {
            return null;
        }
        com.thinkup.core.common.m0.n.d0 d0VarD = com.thinkup.core.common.m0.n.d0.d();
        synchronized (this.f70006o) {
            try {
                Long lValueOf = this.f70005n.get(strN);
                if (lValueOf == null) {
                    lValueOf = Long.valueOf(q0.m(this.f70004m, "thinkup_app_pl_cl_retry", strN, 0L));
                    this.f70005n.put(strN, lValueOf);
                }
                if (lValueOf.longValue() == 0) {
                    d0VarD.d(false);
                } else if (lValueOf.longValue() == -1) {
                    d0VarD.d(true);
                    d0VarD.m(700);
                } else {
                    boolean z10 = System.currentTimeMillis() - lValueOf.longValue() < 0;
                    if (z10) {
                        d0VarD.m(700);
                    }
                    d0VarD.d(z10);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return d0VarD;
    }

    public boolean m(com.thinkup.core.common.m0.n.o oVar) {
        return false;
    }

    public String n(com.thinkup.core.common.m0.n.o oVar) {
        return oVar != null ? oVar.d() : "";
    }
}