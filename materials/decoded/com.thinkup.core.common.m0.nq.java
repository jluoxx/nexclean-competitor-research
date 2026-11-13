package com.thinkup.core.common.m0;

import android.content.Context;
import com.thinkup.core.api.AdError;
import com.thinkup.core.common.dm.dd0;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes7.dex */
public final class nq extends m {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    dd0 f69971d;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    boolean f69972m = true;

    private nq(dd0 dd0Var) {
        this.f69971d = dd0Var;
    }

    private dd0 nm() {
        return this.f69971d;
    }

    @Override // com.thinkup.core.common.m0.m
    public final int d() {
        return this.f69971d.f67959m;
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
        return this.f69971d.f67961o;
    }

    @Override // com.thinkup.core.common.m0.m
    public final void m0() {
    }

    @Override // com.thinkup.core.common.m0.m
    public final boolean mo() {
        return true;
    }

    @Override // com.thinkup.core.common.m0.m
    public final Map<String, String> n() {
        String str = this.f69971d.f67960n;
        HashMap map = new HashMap();
        try {
            JSONObject jSONObject = new JSONObject(str);
            Iterator<String> itKeys = jSONObject.keys();
            while (itKeys.hasNext()) {
                String next = itKeys.next();
                map.put(next, jSONObject.optString(next));
            }
        } catch (Exception unused) {
        }
        return map;
    }

    @Override // com.thinkup.core.common.m0.m
    public final byte[] o() {
        JSONObject jSONObject;
        String str = this.f69971d.f67960n;
        boolean z10 = str != null && str.contains("gzip");
        JSONObject jSONObject2 = null;
        try {
            jSONObject = new JSONObject(this.f69971d.f67962q);
            try {
                if (this.f69972m) {
                    jSONObject.put(d0.ddo, 1);
                }
            } catch (Exception e10) {
                e = e10;
                jSONObject2 = jSONObject;
                e.printStackTrace();
                jSONObject = jSONObject2;
            }
        } catch (Exception e11) {
            e = e11;
        }
        if (z10) {
            return jSONObject != null ? m.d(jSONObject.toString()) : new byte[0];
        }
        return jSONObject != null ? jSONObject.toString().getBytes() : new byte[0];
    }

    @Override // com.thinkup.core.common.m0.m
    public final String q() {
        return null;
    }

    @Override // com.thinkup.core.common.m0.m
    public final void d(AdError adError) {
    }

    private void d(boolean z10) {
        this.f69972m = z10;
    }

    @Override // com.thinkup.core.common.m0.m
    public final Object d(Object obj) {
        return null;
    }
}