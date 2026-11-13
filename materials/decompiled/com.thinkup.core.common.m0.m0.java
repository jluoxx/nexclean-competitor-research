package com.thinkup.core.common.m0;

import android.content.Context;
import android.text.TextUtils;
import com.thinkup.core.api.AdError;
import java.util.Map;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes7.dex */
public final class m0 extends m {
    private static String nm() {
        try {
            JSONObject jSONObject = new JSONObject();
            String strMo = com.thinkup.core.common.o.nd.m().mo();
            String strM = com.thinkup.core.common.dd.n.d().m();
            String strN = com.thinkup.core.common.dd.n.d().n();
            if (TextUtils.isEmpty(strMo) || TextUtils.isEmpty(strM) || TextUtils.isEmpty(strN)) {
                com.thinkup.core.common.nm.d0.m("cdn error 2", strMo + "--" + strM + "--" + strN, com.thinkup.core.common.o.nd.m().n0());
            }
            jSONObject.put("app_id", strMo);
            jSONObject.put(com.thinkup.core.q.m.d.f73924qn, strM);
            jSONObject.put(com.thinkup.core.q.m.d.f73925qo, strN);
            Context contextDd = com.thinkup.core.common.o.nd.m().dd();
            jSONObject.put("domain_tcp", com.thinkup.core.common.dd.n.d().n(contextDd));
            jSONObject.put("domain_tcp_bck", com.thinkup.core.common.dd.n.d().o(contextDd));
            jSONObject.put("t_type", com.thinkup.core.common.o.nd.m().dmn());
            jSONObject.put("sdk_ver", "UA_6.6.41");
            return jSONObject.toString();
        } catch (Throwable unused) {
            return "";
        }
    }

    @Override // com.thinkup.core.common.m0.m
    public final int d() {
        return 1;
    }

    @Override // com.thinkup.core.common.m0.m
    public final Context d0() {
        return null;
    }

    @Override // com.thinkup.core.common.m0.m
    public final String dd() {
        return null;
    }

    @Override // com.thinkup.core.common.m0.m
    public final Map<String, Object> dm() {
        return null;
    }

    @Override // com.thinkup.core.common.m0.m
    public final String m() {
        com.thinkup.core.common.dn.d();
        return com.thinkup.core.common.dn.m246do();
    }

    @Override // com.thinkup.core.common.m0.m
    public final void m0() {
    }

    @Override // com.thinkup.core.common.m0.m
    public final com.thinkup.core.common.m0.n.o mn() {
        return com.thinkup.core.common.m0.n.o.d(com.thinkup.core.common.m0.n.dd.f69900d0);
    }

    @Override // com.thinkup.core.common.m0.m
    public final Map<String, String> n() {
        return null;
    }

    @Override // com.thinkup.core.common.m0.m
    public final byte[] o() {
        return nm().getBytes();
    }

    @Override // com.thinkup.core.common.m0.m
    public final String q() {
        return com.thinkup.core.common.o.nd.m().mo();
    }

    @Override // com.thinkup.core.common.m0.m
    public final Object d(Object obj) {
        return obj;
    }

    @Override // com.thinkup.core.common.m0.m
    public final void d(AdError adError) {
    }

    @Override // com.thinkup.core.common.m0.m
    public final boolean d(int i10) {
        return false;
    }
}