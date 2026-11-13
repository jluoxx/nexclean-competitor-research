package com.thinkup.core.common.m0;

import android.content.Context;
import android.text.TextUtils;
import com.thinkup.core.api.AdError;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes7.dex */
public final class q extends m {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    Context f70043d;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    int f70044m;

    /* JADX INFO: renamed from: md, reason: collision with root package name */
    List<String> f70046md;

    /* JADX INFO: renamed from: mm, reason: collision with root package name */
    int f70047mm;

    /* JADX INFO: renamed from: mn, reason: collision with root package name */
    boolean f70048mn = false;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    String f70049n = com.thinkup.core.common.o.nd.m().mo();

    /* JADX INFO: renamed from: m0, reason: collision with root package name */
    String f70045m0 = com.thinkup.core.common.o.nd.m().mq();

    public q(Context context, int i10, List<String> list) {
        this.f70043d = context;
        this.f70046md = list;
        this.f70044m = list.size();
        this.f70047mm = i10;
    }

    private static String m(String str) {
        try {
            return URLEncoder.encode(str, "utf-8");
        } catch (UnsupportedEncodingException unused) {
            return null;
        }
    }

    @Override // com.thinkup.core.common.m0.m
    public final void d(int i10, nd ndVar) {
        com.thinkup.core.common.dn.d();
        if (!TextUtils.isEmpty(com.thinkup.core.common.dn.q())) {
            super.d(i10, ndVar);
        } else if (ndVar != null) {
            ndVar.onLoadFinish(i10, Integer.valueOf(this.f70044m));
        }
    }

    @Override // com.thinkup.core.common.m0.m
    public final Context d0() {
        return this.f70043d;
    }

    @Override // com.thinkup.core.common.m0.m
    public final String dd() {
        return this.f70045m0;
    }

    @Override // com.thinkup.core.common.m0.m
    public final Map<String, Object> dm() {
        return null;
    }

    @Override // com.thinkup.core.common.m0.m
    public final JSONObject dn() {
        JSONObject jSONObjectDn = super.dn();
        if (jSONObjectDn != null) {
            try {
                jSONObjectDn.put("app_id", this.f70049n);
                jSONObjectDn.put("nw_ver", com.thinkup.core.common.nn.m0.dd());
                Map<String, Object> mapMd = com.thinkup.core.common.o.nd.m().md();
                if (mapMd != null) {
                    try {
                        if (mapMd.size() > 0) {
                            JSONObject jSONObject = new JSONObject();
                            for (String str : mapMd.keySet()) {
                                Object obj = mapMd.get(str);
                                if (obj != null) {
                                    jSONObject.put(str, obj.toString());
                                }
                            }
                            jSONObjectDn.put("custom", jSONObject);
                        }
                    } catch (Throwable unused) {
                    }
                }
                JSONArray jSONArray = new JSONArray();
                List<String> list = this.f70046md;
                if (list != null && list.size() > 0) {
                    for (String str2 : this.f70046md) {
                        if (!TextUtils.isEmpty(str2)) {
                            jSONArray.put(new JSONObject(str2));
                        }
                    }
                }
                jSONObjectDn.put("data", jSONArray);
            } catch (Exception unused2) {
            }
        }
        return jSONObjectDn;
    }

    @Override // com.thinkup.core.common.m0.m
    /* JADX INFO: renamed from: do */
    public final JSONObject mo259do() {
        JSONObject jSONObjectMo259do = super.mo259do();
        if (jSONObjectMo259do != null) {
            try {
                jSONObjectMo259do.put(d0.ddn, this.f70047mm);
            } catch (Exception unused) {
            }
        }
        return jSONObjectMo259do;
    }

    @Override // com.thinkup.core.common.m0.m
    public final void m0() {
    }

    @Override // com.thinkup.core.common.m0.m
    public final int mm() {
        return 4;
    }

    @Override // com.thinkup.core.common.m0.m
    public final boolean mo() {
        return true;
    }

    @Override // com.thinkup.core.common.m0.m
    public final Map<String, String> n() {
        HashMap map = new HashMap();
        map.put("Content-Encoding", "gzip");
        map.put("Content-Type", "application/json;charset=utf-8");
        return map;
    }

    public final void nm() {
        this.f70048mn = true;
    }

    @Override // com.thinkup.core.common.m0.m
    public final byte[] o() {
        return m.d(dq());
    }

    @Override // com.thinkup.core.common.m0.m
    public final String q() {
        return this.f70049n;
    }

    @Override // com.thinkup.core.common.m0.m
    public final String m() {
        com.thinkup.core.common.dn.d();
        return com.thinkup.core.common.dn.q();
    }

    @Override // com.thinkup.core.common.m0.m
    public final void d(AdError adError) {
    }

    @Override // com.thinkup.core.common.m0.m
    public final Object d(Object obj) {
        return Integer.valueOf(this.f70044m);
    }

    @Override // com.thinkup.core.common.m0.m
    public final int d() {
        return 1;
    }
}