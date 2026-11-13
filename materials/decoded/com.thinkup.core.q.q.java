package com.thinkup.core.q;

import android.text.TextUtils;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes7.dex */
public class q {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private JSONObject f74134d;

    /* JADX INFO: renamed from: d0, reason: collision with root package name */
    private int f74135d0;

    /* JADX INFO: renamed from: dd, reason: collision with root package name */
    private int f74136dd;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private Map<String, String> f74137m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private Map<String, String> f74138n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    final String f74139o = q.class.getSimpleName();

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private Map<String, String> f74140q;

    public final void d(JSONObject jSONObject, String str) {
        String strOptString = jSONObject.optString("cached");
        Map<String, String> mapN0q = n0q();
        if (TextUtils.isEmpty(strOptString) || this.f74134d == null) {
            return;
        }
        try {
            JSONObject jSONObject2 = new JSONObject(strOptString);
            Iterator<String> itKeys = jSONObject2.keys();
            while (itKeys.hasNext()) {
                String next = itKeys.next();
                String strOptString2 = jSONObject2.optString(next);
                String str2 = mapN0q.get(next);
                jSONObject.put(next, this.f74134d.opt(next));
                if (!TextUtils.equals(strOptString2, str2)) {
                    com.thinkup.core.common.nm.d0.d(str, TextUtils.isEmpty(str) ? "1" : "2", next, strOptString2, str2);
                    jSONObject2.put(next, str2);
                }
            }
            jSONObject.put("cached", jSONObject2.toString());
        } catch (Throwable unused) {
        }
    }

    public final void d0(int i10) {
        this.f74135d0 = i10;
    }

    public final void m(JSONObject jSONObject) {
        this.f74134d = jSONObject;
    }

    public final void n(JSONObject jSONObject) {
        String strOptString = jSONObject.optString("cached");
        HashMap map = new HashMap();
        if (!TextUtils.isEmpty(strOptString)) {
            try {
                JSONObject jSONObject2 = new JSONObject(strOptString);
                Iterator<String> itKeys = jSONObject2.keys();
                while (itKeys.hasNext()) {
                    String next = itKeys.next();
                    map.put(next, jSONObject2.optString(next));
                }
            } catch (Throwable unused) {
            }
        }
        this.f74137m = map;
    }

    public final JSONObject n0n() {
        return this.f74134d;
    }

    public final boolean n0o() {
        Map<String, String> map = this.f74138n;
        return map == null || map.size() == 0;
    }

    public final synchronized Map<String, String> n0q() {
        try {
            if (this.f74140q == null) {
                HashMap map = new HashMap();
                this.f74140q = map;
                Map<String, String> map2 = this.f74137m;
                if (map2 != null) {
                    map.putAll(map2);
                }
                Map<String, String> map3 = this.f74138n;
                if (map3 != null) {
                    this.f74140q.putAll(map3);
                }
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return this.f74140q;
    }

    public final boolean nd0() {
        return this.f74136dd > 0;
    }

    public final int ndd() {
        return this.f74135d0;
    }

    public final void o(JSONObject jSONObject) {
        String strOptString = jSONObject.optString(com.thinkup.core.common.m0.d0.dqn);
        HashMap map = new HashMap();
        if (!TextUtils.isEmpty(strOptString)) {
            try {
                JSONObject jSONObject2 = new JSONObject(strOptString);
                Iterator<String> itKeys = jSONObject2.keys();
                while (itKeys.hasNext()) {
                    String next = itKeys.next();
                    map.put(next, jSONObject2.optString(next));
                }
            } catch (Throwable unused) {
            }
        }
        this.f74138n = map;
    }

    public final void q(int i10) {
        this.f74136dd = i10;
    }

    private Map<String, String> m() {
        return this.f74138n;
    }

    private Map<String, String> d() {
        return this.f74137m;
    }
}