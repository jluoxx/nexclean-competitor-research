package com.thinkup.core.common.m0.q;

import android.content.Context;
import android.text.TextUtils;
import com.thinkup.core.common.o.nd;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes7.dex */
public final class q extends dn {
    private static String md() {
        try {
            JSONObject jSONObject = new JSONObject();
            String strMo = nd.m().mo();
            String strM = com.thinkup.core.common.dd.n.d().m();
            String strN = com.thinkup.core.common.dd.n.d().n();
            if (TextUtils.isEmpty(strMo) || TextUtils.isEmpty(strM) || TextUtils.isEmpty(strN)) {
                com.thinkup.core.common.nm.d0.m("cdn error 1", strMo + "--" + strM + "--" + strN, nd.m().n0());
            }
            jSONObject.put("app_id", strMo);
            jSONObject.put(com.thinkup.core.q.m.d.f73924qn, strM);
            jSONObject.put(com.thinkup.core.q.m.d.f73925qo, strN);
            Context contextDd = nd.m().dd();
            jSONObject.put("domain_tcp", com.thinkup.core.common.dd.n.d().n(contextDd));
            jSONObject.put("domain_tcp_bck", com.thinkup.core.common.dd.n.d().o(contextDd));
            jSONObject.put("t_type", nd.m().dmn());
            jSONObject.put("sdk_ver", "UA_6.6.41");
            return jSONObject.toString();
        } catch (Throwable unused) {
            return "";
        }
    }

    @Override // com.thinkup.core.common.m0.q.dn
    public final com.thinkup.core.common.m0.n.dm c_() {
        try {
            com.thinkup.core.common.dn.d();
            return new com.thinkup.core.common.m0.n.dm(com.thinkup.core.common.dn.dq(), com.thinkup.core.common.dn.m0());
        } catch (Throwable unused) {
            return null;
        }
    }

    public final void d(final com.thinkup.core.common.m0.nd ndVar) {
        d(new dn.d() { // from class: com.thinkup.core.common.m0.q.q.1
            @Override // com.thinkup.core.common.m0.q.dn.d
            public final void d(Throwable th2) {
                com.thinkup.core.common.m0.nd ndVar2 = ndVar;
                if (ndVar2 != null) {
                    ndVar2.onLoadError(0, th2 != null ? th2.getMessage() : "", null);
                }
            }

            @Override // com.thinkup.core.common.m0.q.dn.d
            public final void d(Object obj) {
                com.thinkup.core.common.m0.nd ndVar2 = ndVar;
                if (ndVar2 != null) {
                    ndVar2.onLoadFinish(0, obj);
                }
            }
        });
    }

    @Override // com.thinkup.core.common.m0.q.dn
    public final int m() {
        return 3;
    }

    @Override // com.thinkup.core.common.m0.q.dn
    public final byte[] n() {
        return dn.d(md());
    }

    @Override // com.thinkup.core.common.m0.q.dn
    public final boolean o() {
        return false;
    }

    @Override // com.thinkup.core.common.m0.q.dn
    public final int d() {
        return 6;
    }
}