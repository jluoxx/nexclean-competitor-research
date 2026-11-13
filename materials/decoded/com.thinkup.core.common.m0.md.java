package com.thinkup.core.common.m0;

import android.content.Context;
import com.thinkup.core.api.AdError;
import com.thinkup.core.common.dm.d0n;
import com.thinkup.core.common.nn.Cdo;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes7.dex */
public class md extends m {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final String f69843d = "md";

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final d0n f69844m;

    public md(d0n d0nVar) {
        this.f69844m = d0nVar;
    }

    @Override // com.thinkup.core.common.m0.m
    public final int d() {
        return 1;
    }

    @Override // com.thinkup.core.common.m0.m
    public final Context d0() {
        d0n d0nVar = this.f69844m;
        if (d0nVar != null) {
            return d0nVar.d();
        }
        return null;
    }

    @Override // com.thinkup.core.common.m0.m
    public final String dd() {
        d0n d0nVar = this.f69844m;
        return d0nVar != null ? d0nVar.n() : "";
    }

    @Override // com.thinkup.core.common.m0.m
    public final Map<String, Object> dm() {
        return null;
    }

    @Override // com.thinkup.core.common.m0.m
    public final JSONObject dn() {
        JSONObject jSONObjectDn = super.dn();
        try {
            d0n d0nVar = this.f69844m;
            if (d0nVar != null) {
                jSONObjectDn.put("app_id", d0nVar.m());
                jSONObjectDn.put(d0.ndo, this.f69844m.d0());
                jSONObjectDn.put("t_g_id", this.f69844m.dd());
                jSONObjectDn.put("gro_id", this.f69844m.dm());
            }
        } catch (Throwable unused) {
        }
        return jSONObjectDn;
    }

    @Override // com.thinkup.core.common.m0.m
    public final String dq() {
        String string = dn().toString();
        String string2 = mo259do().toString();
        HashMap map = new HashMap();
        String strD = Cdo.d(string);
        String strD2 = Cdo.d(string2);
        map.put("p", strD);
        map.put(d0.dmm, strD2);
        d0n d0nVar = this.f69844m;
        if (d0nVar != null) {
            JSONArray jSONArrayO = d0nVar.o();
            if (jSONArrayO != null) {
                map.put(d0.nmd, Cdo.d(jSONArrayO.toString()));
            }
            map.put(com.thinkup.core.common.d0.d.C0836d.f67675mn, this.f69844m.q());
        }
        Set<String> setKeySet = map.keySet();
        JSONObject jSONObject = new JSONObject();
        try {
            for (String str : setKeySet) {
                jSONObject.put(str, map.get(str));
            }
            return jSONObject.toString();
        } catch (Exception unused) {
            return null;
        } catch (OutOfMemoryError unused2) {
            System.gc();
            return null;
        }
    }

    @Override // com.thinkup.core.common.m0.m
    public final String m() {
        com.thinkup.core.common.dn.d();
        return com.thinkup.core.common.dn.dn();
    }

    @Override // com.thinkup.core.common.m0.m
    public final void m0() {
    }

    @Override // com.thinkup.core.common.m0.m
    public final boolean md() {
        return true;
    }

    @Override // com.thinkup.core.common.m0.m
    public final Map<String, String> n() {
        HashMap map = new HashMap();
        map.put("Accept-Encoding", "gzip");
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
        d0n d0nVar = this.f69844m;
        return d0nVar != null ? d0nVar.m() : "";
    }

    @Override // com.thinkup.core.common.m0.m
    public final Object d(Object obj) {
        return obj;
    }

    @Override // com.thinkup.core.common.m0.m
    public final void d(AdError adError) {
    }
}