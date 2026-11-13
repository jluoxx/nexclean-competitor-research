package com.thinkup.core.common.m0;

import android.content.Context;
import com.thinkup.core.api.AdError;
import com.thinkup.core.common.nn.Cdo;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes7.dex */
public final class dm extends m {
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
        return com.thinkup.core.common.o.nd.m().mq();
    }

    @Override // com.thinkup.core.common.m0.m
    public final Map<String, Object> dm() {
        return null;
    }

    @Override // com.thinkup.core.common.m0.m
    public final JSONObject dn() {
        JSONObject jSONObjectDn = super.dn();
        try {
            jSONObjectDn.put("app_id", com.thinkup.core.common.o.nd.m().mo());
            jSONObjectDn.put("curr_ts", System.currentTimeMillis());
        } catch (Exception unused) {
        }
        return jSONObjectDn;
    }

    @Override // com.thinkup.core.common.m0.m
    public final String dq() {
        HashMap map = new HashMap();
        String strD = Cdo.d(dn().toString());
        map.put(d0.dd0, "1.0");
        map.put("p", strD);
        ArrayList<String> arrayList = new ArrayList(map.size());
        arrayList.addAll(map.keySet());
        Collections.sort(arrayList);
        StringBuilder sb2 = new StringBuilder();
        for (String str : arrayList) {
            if (sb2.length() > 0) {
                sb2.append("&");
            }
            sb2.append(str);
            sb2.append("=");
            sb2.append(map.get(str));
        }
        try {
            map.put(d0.dmn, URLEncoder.encode(com.thinkup.core.common.nn.mm.n(com.thinkup.core.common.o.nd.m().mq() + sb2.toString()), "utf-8"));
        } catch (UnsupportedEncodingException e10) {
            e10.printStackTrace();
        }
        return new JSONObject(map).toString();
    }

    @Override // com.thinkup.core.common.m0.m
    public final String m() {
        com.thinkup.core.common.dn.d();
        return com.thinkup.core.common.dd.n.d().d(com.thinkup.core.common.dn.dm() ? com.thinkup.core.common.o.dn.q.dd0 : com.thinkup.core.common.o.dn.q.f72910nn);
    }

    @Override // com.thinkup.core.common.m0.m
    public final void m0() {
    }

    @Override // com.thinkup.core.common.m0.m
    public final boolean md() {
        return true;
    }

    @Override // com.thinkup.core.common.m0.m
    public final com.thinkup.core.common.m0.n.o mn() {
        return com.thinkup.core.common.m0.n.o.d(com.thinkup.core.common.m0.n.dd.f69910o);
    }

    @Override // com.thinkup.core.common.m0.m
    public final Map<String, String> n() {
        HashMap map = new HashMap();
        map.put("Content-Encoding", "gzip");
        map.put("Content-Type", "application/json;charset=utf-8");
        return map;
    }

    @Override // com.thinkup.core.common.m0.m
    public final byte[] o() {
        try {
            return dq().getBytes("utf-8");
        } catch (Exception unused) {
            return dq().getBytes();
        }
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
}