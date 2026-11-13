package com.thinkup.core.common.m0.q;

import android.os.SystemClock;
import android.text.TextUtils;
import com.mbridge.msdk.MBridgeConstans;
import com.thinkup.core.common.nn.qo;
import com.thinkup.core.common.o.nd;
import java.util.UUID;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes7.dex */
public class o extends dn {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final String f70135d = "o";

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final String f70136m;

    /* JADX INFO: renamed from: mq, reason: collision with root package name */
    private volatile String f70137mq;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final String f70138n;

    /* JADX INFO: renamed from: n0, reason: collision with root package name */
    private volatile String f70139n0;

    /* JADX INFO: renamed from: nd, reason: collision with root package name */
    private volatile com.thinkup.core.common.m0.n.dm f70140nd;

    /* JADX INFO: renamed from: nm, reason: collision with root package name */
    private volatile long f70141nm;

    public o(String str, String str2) {
        this.f70136m = str;
        this.f70138n = str2;
    }

    private String d(String str, String str2) {
        if (TextUtils.isEmpty(str)) {
            return "";
        }
        try {
            String strM = qo.m(this.f70138n);
            String strMo = nd.m().mo();
            if (!TextUtils.isEmpty(strMo) && !TextUtils.isEmpty(str2) && !TextUtils.isEmpty(strM)) {
                this.f70139n0 = strMo;
                JSONObject jSONObject = new JSONObject();
                jSONObject.put(MBridgeConstans.DYNAMIC_VIEW_WX_PATH, strM);
                jSONObject.put(com.thinkup.core.common.m0.d0.odd, str2);
                jSONObject.put("traceid", UUID.randomUUID().toString());
                jSONObject.put("app_id", strMo);
                String strDm = com.thinkup.core.common.nn.m0.dm();
                if (!TextUtils.isEmpty(strDm)) {
                    jSONObject.put("ua", strDm);
                }
                String string = jSONObject.toString();
                String strD = qo.d(strMo, string, "{}", str, qo.f72334m);
                if (TextUtils.isEmpty(strD)) {
                    return "";
                }
                return "{\"h\":" + string + ",\"q\":{},\"b\":" + str + ",\"mac\":\"" + strD + "\"}";
            }
        } catch (Throwable unused) {
        }
        return "";
    }

    private String md() {
        return qo.m(this.f70138n);
    }

    private static com.thinkup.core.common.m0.n.dm mm() {
        try {
            com.thinkup.core.q.m mVarD = com.thinkup.core.q.o.d();
            if (mVarD == null) {
                return null;
            }
            String strM0q = mVarD.m0q();
            int iMd0 = mVarD.md0();
            if (!TextUtils.isEmpty(strM0q) && iMd0 > 0) {
                return new com.thinkup.core.common.m0.n.dm(strM0q, iMd0);
            }
        } catch (Throwable unused) {
        }
        return null;
    }

    @Override // com.thinkup.core.common.m0.q.dn
    public final com.thinkup.core.common.m0.n.dm c_() {
        com.thinkup.core.common.m0.n.dm dmVar = this.f70140nd;
        return dmVar != null ? dmVar : mm();
    }

    @Override // com.thinkup.core.common.m0.q.dn
    /* JADX INFO: renamed from: do */
    public final long mo262do() {
        return this.f70141nm;
    }

    @Override // com.thinkup.core.common.m0.q.dn
    public final int m() {
        return 3;
    }

    @Override // com.thinkup.core.common.m0.q.dn
    public final byte[] n() {
        return dn.d(this.f70137mq);
    }

    @Override // com.thinkup.core.common.m0.q.dn
    public final boolean o() {
        return false;
    }

    @Override // com.thinkup.core.common.m0.q.dn
    public final int d() {
        return 13;
    }

    private void d(Object obj, com.thinkup.core.common.m0.nd ndVar) {
        this.f70137mq = null;
        if (obj instanceof String) {
            String str = (String) obj;
            if (!TextUtils.isEmpty(str)) {
                try {
                    qo.m mVarD = qo.d(str);
                    if (mVarD == null) {
                        ndVar.onLoadError(0, "envelope parse failed", null);
                        return;
                    }
                    String strD = qo.d(this.f70139n0, mVarD.f72340d, mVarD.f72341m, qo.f72334m);
                    if (strD != null && qo.d(strD, mVarD.f72342n)) {
                        ndVar.onLoadFinish(0, new JSONObject(mVarD.f72341m));
                        return;
                    }
                    ndVar.onLoadError(0, "response MAC verify failed", null);
                    return;
                } catch (Throwable unused) {
                    ndVar.onLoadError(0, "response handle exception", null);
                    return;
                }
            }
        }
        ndVar.onLoadError(0, "empty response", null);
    }

    private void d(com.thinkup.core.common.m0.nd ndVar) {
        d(ndVar, 0L);
    }

    public final void d(final com.thinkup.core.common.m0.nd ndVar, long j10) {
        this.f70141nm = j10 > 0 ? SystemClock.elapsedRealtime() + j10 : 0L;
        this.f70140nd = mm();
        this.f70137mq = this.f70140nd != null ? d(this.f70136m, this.f70140nd.d()) : "";
        if (!TextUtils.isEmpty(this.f70137mq)) {
            d(new dn.d() { // from class: com.thinkup.core.common.m0.q.o.1
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
                    if (ndVar2 == null) {
                        return;
                    }
                    o.d(o.this, obj, ndVar2);
                }
            });
        } else if (ndVar != null) {
            ndVar.onLoadError(0, "TCP envelope build failed", null);
        }
    }

    public static /* synthetic */ void d(o oVar, Object obj, com.thinkup.core.common.m0.nd ndVar) {
        oVar.f70137mq = null;
        if (obj instanceof String) {
            String str = (String) obj;
            if (!TextUtils.isEmpty(str)) {
                try {
                    qo.m mVarD = qo.d(str);
                    if (mVarD == null) {
                        ndVar.onLoadError(0, "envelope parse failed", null);
                        return;
                    }
                    String strD = qo.d(oVar.f70139n0, mVarD.f72340d, mVarD.f72341m, qo.f72334m);
                    if (strD != null && qo.d(strD, mVarD.f72342n)) {
                        ndVar.onLoadFinish(0, new JSONObject(mVarD.f72341m));
                        return;
                    }
                    ndVar.onLoadError(0, "response MAC verify failed", null);
                    return;
                } catch (Throwable unused) {
                    ndVar.onLoadError(0, "response handle exception", null);
                    return;
                }
            }
        }
        ndVar.onLoadError(0, "empty response", null);
    }
}