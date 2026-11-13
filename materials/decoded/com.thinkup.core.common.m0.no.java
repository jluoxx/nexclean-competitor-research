package com.thinkup.core.common.m0;

import android.content.Context;
import com.thinkup.core.api.AdError;
import com.thinkup.core.common.dm.dnm;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes7.dex */
public final class no extends m {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    dnm f69970d;

    public no(dnm dnmVar) {
        this.f69970d = dnmVar;
    }

    @Override // com.thinkup.core.common.m0.m
    public final boolean d(int i10) {
        return i10 >= 200 && i10 < 300;
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
        return this.f69970d.f68065o;
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
        String str = this.f69970d.f68064n;
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
        return new byte[0];
    }

    @Override // com.thinkup.core.common.m0.m
    public final String q() {
        return null;
    }

    @Override // com.thinkup.core.common.m0.m
    public final void d(AdError adError) {
    }

    @Override // com.thinkup.core.common.m0.m
    public final Object d(Object obj) {
        return null;
    }

    @Override // com.thinkup.core.common.m0.m
    public final int d() {
        return this.f69970d.f68063m;
    }
}