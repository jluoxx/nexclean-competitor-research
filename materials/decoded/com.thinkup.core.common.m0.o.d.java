package com.thinkup.core.common.m0.o;

import android.content.Context;
import android.text.TextUtils;
import com.thinkup.core.common.nn.q0;
import java.util.Map;

/* JADX INFO: loaded from: classes7.dex */
public final class d extends o {
    public d(Context context) {
        super(context);
    }

    @Override // com.thinkup.core.common.m0.o.dn
    public final void d(com.thinkup.core.common.m0.n.d0 d0Var, com.thinkup.core.common.m0.n.o oVar) {
        if (!m(oVar) || d0Var == null) {
            return;
        }
        int iN = d0Var.n();
        String strM = d0Var.m();
        long jO = d0Var.o();
        if (iN != 699 || jO <= 0) {
            return;
        }
        synchronized (this.f70006o) {
            try {
                Map<String, Long> map = this.f70005n;
                if (map != null) {
                    map.put(strM, Long.valueOf(jO));
                }
                q0.d(this.f70004m, "thinkup_app_pl_cl_retry", strM, jO);
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // com.thinkup.core.common.m0.o.o
    public final boolean m(com.thinkup.core.common.m0.n.o oVar) {
        if (this.f70004m != null && oVar != null) {
            String strM = oVar.m();
            String strD = oVar.d();
            if ((com.thinkup.core.common.m0.n.dd.f69905m.equals(strM) || com.thinkup.core.common.m0.n.dd.f69899d.equals(strM) || com.thinkup.core.common.m0.n.dd.f69911q.equals(strM)) && !TextUtils.isEmpty(strD)) {
                return true;
            }
        }
        return false;
    }

    @Override // com.thinkup.core.common.m0.o.o, com.thinkup.core.common.m0.o.dn
    public final com.thinkup.core.common.m0.n.d0 d(com.thinkup.core.common.m0.n.o oVar) {
        if (!m(oVar)) {
            return null;
        }
        com.thinkup.core.common.m0.n.d0 d0VarD = super.d(oVar);
        if (d0VarD != null && d0VarD.q()) {
            d0VarD.m(com.thinkup.core.common.m0.m.f69815o);
        }
        return d0VarD;
    }

    private void d(String str, long j10) {
        Map<String, Long> map = this.f70005n;
        if (map != null) {
            map.put(str, Long.valueOf(j10));
        }
        q0.d(this.f70004m, "thinkup_app_pl_cl_retry", str, j10);
    }
}