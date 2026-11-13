package com.thinkup.core.common.m0.q;

import com.thinkup.core.common.dm.ddn;
import com.thinkup.core.common.o.nd;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes7.dex */
public final class d0 extends dn {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    List<ddn> f70076d;

    public d0(List<ddn> list) {
        this.f70076d = list;
    }

    private String md() {
        try {
            JSONObject jSONObject = new JSONObject();
            com.thinkup.core.common.m0.d0.d(nd.m().dd(), jSONObject);
            List<ddn> list = this.f70076d;
            if (list != null && !list.isEmpty()) {
                JSONArray jSONArray = new JSONArray();
                for (ddn ddnVar : this.f70076d) {
                    if (ddnVar != null) {
                        JSONObject jSONObject2 = new JSONObject();
                        ddnVar.m(jSONObject2);
                        jSONArray.put(jSONObject2);
                    }
                }
                jSONObject.put("t_items", jSONArray);
            }
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
        d(new dn.d() { // from class: com.thinkup.core.common.m0.q.d0.1
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
        return 9;
    }
}