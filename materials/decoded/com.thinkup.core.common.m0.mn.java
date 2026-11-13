package com.thinkup.core.common.m0;

import android.content.Context;
import com.thinkup.core.api.AdError;
import com.thinkup.core.common.dm.dmm;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes7.dex */
public class mn extends nn {

    /* JADX INFO: renamed from: mm, reason: collision with root package name */
    private static final String f69848mm = "mn";

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    JSONObject f69849d;

    public mn(Context context, dmm dmmVar) {
        super(context, dmmVar);
        this.f69849d = dmmVar.d();
    }

    @Override // com.thinkup.core.common.m0.nn, com.thinkup.core.common.m0.m
    public final Object d(Object obj) {
        try {
            if (!(obj instanceof JSONObject)) {
                return null;
            }
            JSONObject jSONObject = (JSONObject) obj;
            if (((nn) this).f69951n != null) {
                jSONObject.put(nn.f69944m, new JSONObject(((nn) this).f69951n));
            }
            return jSONObject;
        } catch (Exception unused) {
            return null;
        }
    }

    @Override // com.thinkup.core.common.m0.nn, com.thinkup.core.common.m0.m
    public final JSONObject dn() {
        JSONObject jSONObjectDn = super.dn();
        try {
            jSONObjectDn.put(d0.n0q, this.f69849d);
        } catch (JSONException unused) {
        }
        return jSONObjectDn;
    }

    @Override // com.thinkup.core.common.m0.nn, com.thinkup.core.common.m0.m
    public final String m() {
        com.thinkup.core.common.dn.d();
        return com.thinkup.core.common.dn.dd();
    }

    @Override // com.thinkup.core.common.m0.nn, com.thinkup.core.common.m0.m
    public final void d(AdError adError) {
    }
}