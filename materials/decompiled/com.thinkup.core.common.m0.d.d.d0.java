package com.thinkup.core.common.m0.d.d;

import android.text.TextUtils;
import androidx.browser.trusted.sharing.ShareTarget;
import com.mbridge.msdk.foundation.download.Command;
import com.thinkup.core.common.m0.d.Cdo;
import com.thinkup.core.common.m0.d.dn;
import com.thinkup.core.common.md.m.nn;
import com.thinkup.core.common.md.m.o0;
import com.thinkup.core.common.md.m.om;
import com.thinkup.core.common.md.m.q0;
import com.thinkup.core.common.md.m.qd;
import com.thinkup.core.common.md.m.qm;
import com.thinkup.core.common.md.m.qn;
import com.thinkup.core.common.nn.m0;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;

/* JADX INFO: loaded from: classes7.dex */
public final class d0 extends com.thinkup.core.common.m0.d.d {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private com.thinkup.core.common.md.m.q f69672m;

    public d0(com.thinkup.core.common.m0.d.d0 d0Var) {
        super(d0Var);
    }

    private static q0 m(dn dnVar) {
        nn.d dVar = new nn.d();
        Map<String, String> map = dnVar.f69736q;
        if (map == null || map.isEmpty()) {
            String strM293do = m0.m293do();
            if (!TextUtils.isEmpty(strM293do)) {
                dVar.d(Command.HTTP_HEADER_USER_AGENT, strM293do);
            }
        } else {
            for (Map.Entry<String, String> entry : map.entrySet()) {
                dVar.d(entry.getKey(), entry.getValue());
            }
            if (!map.containsKey(Command.HTTP_HEADER_USER_AGENT)) {
                String strM293do2 = m0.m293do();
                if (!TextUtils.isEmpty(strM293do2)) {
                    dVar.d(Command.HTTP_HEADER_USER_AGENT, strM293do2);
                }
            }
        }
        if (Objects.equals(dnVar.f69733m, ShareTarget.METHOD_GET)) {
            return new q0.d().d(dnVar.f69732d).d().d(dVar.d()).m();
        }
        return new q0.d().d(dnVar.f69732d).d(dnVar.f69733m, qd.d(o0.m(dnVar.f69735o), dnVar.f69734n)).d(dVar.d()).m();
    }

    private static /* synthetic */ void n() {
    }

    @Override // com.thinkup.core.common.m0.d.m
    public final Cdo d(dn dnVar) {
        try {
            com.thinkup.core.common.md.m.q qVarD = q.d().d(this.f69664d).d(m(dnVar));
            this.f69672m = qVarD;
            return m(dnVar, qVarD.m(), null);
        } catch (Throwable th2) {
            return m(dnVar, null, th2);
        }
    }

    @Override // com.thinkup.core.common.m0.d.m
    public final void d(final dn dnVar, final com.thinkup.core.common.m0.d.n nVar) {
        try {
            com.thinkup.core.common.md.m.q qVarD = q.d().d(this.f69664d).d(m(dnVar));
            this.f69672m = qVarD;
            qVarD.d(new com.thinkup.core.common.md.m.d0() { // from class: com.thinkup.core.common.m0.d.d.d0.1
                @Override // com.thinkup.core.common.md.m.d0
                public final void d(IOException iOException) {
                    d0.m(dnVar, null, iOException);
                }

                @Override // com.thinkup.core.common.md.m.d0
                public final void d(qm qmVar) {
                    d0.m(dnVar, qmVar, null);
                }
            });
        } catch (Throwable th2) {
            m(dnVar, null, th2);
        }
    }

    @Override // com.thinkup.core.common.m0.d.m
    public final void d() {
        try {
            com.thinkup.core.common.md.m.q qVar = this.f69672m;
            if (qVar == null || qVar.q()) {
                return;
            }
            this.f69672m.n();
        } catch (Throwable unused) {
        }
    }

    private static om d(com.thinkup.core.common.m0.d.d0 d0Var) {
        return q.d().d(d0Var);
    }

    private static void m() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static Cdo m(dn dnVar, qm qmVar, Throwable th2) {
        Cdo.d dVarD = new Cdo.d().d(dnVar).d(th2);
        if (qmVar != null) {
            try {
                dVarD.d(qmVar.n());
                dVarD.d(qmVar.q());
                HashMap map = new HashMap();
                nn nnVarDd = qmVar.dd();
                for (int i10 = 0; i10 < nnVarDd.d(); i10++) {
                    String strD = nnVarDd.d(i10);
                    String strM = nnVarDd.m(i10);
                    List<String> list = map.get(strD);
                    if (list != null) {
                        if (!list.contains(strM)) {
                            list.add(strM);
                        }
                    } else {
                        ArrayList arrayList = new ArrayList();
                        arrayList.add(strM);
                        map.put(strD, arrayList);
                    }
                }
                dVarD.d(map);
                qn qnVarDm = qmVar.dm();
                if (qnVarDm != null) {
                    dVarD.d(new dd(qnVarDm));
                }
            } catch (Throwable th3) {
                dVarD.d(th3);
            }
        }
        return dVarD.d();
    }
}