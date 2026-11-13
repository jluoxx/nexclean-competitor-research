package com.thinkup.core.common.m0.q;

import android.text.TextUtils;
import com.thinkup.core.common.nn.Cdo;
import com.thinkup.core.common.nn.mm;
import com.thinkup.core.common.o.nd;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes7.dex */
public final class m extends dn {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    List<String> f70117d;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    int f70118m;

    /* JADX INFO: renamed from: mq, reason: collision with root package name */
    private final String f70119mq = m.class.getSimpleName();

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    boolean f70120n;

    public m(List<String> list) {
        this.f70117d = list;
        this.f70118m = list.size();
    }

    private int md() {
        return this.f70118m;
    }

    private String mm() {
        JSONObject jSONObjectDq = super.dq();
        JSONObject jSONObjectM0 = super.m0();
        if (jSONObjectDq != null) {
            try {
                jSONObjectDq.put("app_id", nd.m().mo());
                jSONObjectDq.put("nw_ver", com.thinkup.core.common.nn.m0.dd());
                JSONArray jSONArray = new JSONArray();
                List<String> list = this.f70117d;
                if (list != null && list.size() > 0) {
                    for (String str : this.f70117d) {
                        if (!TextUtils.isEmpty(str)) {
                            jSONArray.put(new JSONObject(str));
                        }
                    }
                }
                jSONObjectDq.put("data", jSONArray);
            } catch (Exception unused) {
            }
        }
        if (jSONObjectM0 != null) {
            try {
                jSONObjectM0.put(com.thinkup.core.common.m0.d0.ddn, this.f70103mn);
                jSONObjectM0.put(com.thinkup.core.common.m0.d0.ddq, this.f70104mo);
            } catch (Exception unused2) {
            }
        }
        HashMap map = new HashMap();
        String strD = Cdo.d(jSONObjectDq.toString());
        String strD2 = Cdo.d(jSONObjectM0.toString());
        map.put(com.thinkup.core.common.m0.d0.dd0, "1.0");
        map.put("p", strD);
        map.put(com.thinkup.core.common.m0.d0.dmm, strD2);
        ArrayList<String> arrayList = new ArrayList(map.size());
        arrayList.addAll(map.keySet());
        Collections.sort(arrayList);
        StringBuilder sb2 = new StringBuilder();
        for (String str2 : arrayList) {
            if (sb2.length() > 0) {
                sb2.append("&");
            }
            sb2.append(str2);
            sb2.append("=");
            sb2.append(map.get(str2));
        }
        map.put(com.thinkup.core.common.m0.d0.dmn, mm.n(nd.m().mq() + sb2.toString()));
        return new JSONObject(map).toString();
    }

    @Override // com.thinkup.core.common.m0.q.dn
    public final int d() {
        return 2;
    }

    @Override // com.thinkup.core.common.m0.q.dn
    public final int d0() {
        return 4;
    }

    public final void dd() {
        this.f70120n = true;
    }

    @Override // com.thinkup.core.common.m0.q.dn
    public final int m() {
        return 3;
    }

    @Override // com.thinkup.core.common.m0.q.dn
    public final byte[] n() {
        return dn.d(mm());
    }

    @Override // com.thinkup.core.common.m0.q.dn
    public final boolean o() {
        return false;
    }

    @Override // com.thinkup.core.common.m0.q.dn
    public final void q() {
    }
}