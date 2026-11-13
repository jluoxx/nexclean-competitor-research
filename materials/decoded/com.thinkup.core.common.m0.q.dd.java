package com.thinkup.core.common.m0.q;

import android.content.Context;
import android.os.SystemClock;
import android.text.TextUtils;
import androidx.room.n0;
import com.mbridge.msdk.MBridgeConstans;
import com.thinkup.core.common.nn.qo;
import com.thinkup.core.common.o.nd;
import gq.v0;
import java.util.UUID;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes7.dex */
public class dd extends dn {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final String f70079d = "dd";

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final String f70080m;

    /* JADX INFO: renamed from: mq, reason: collision with root package name */
    private volatile String f70081mq;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private volatile String f70082n;

    /* JADX INFO: renamed from: n0, reason: collision with root package name */
    private volatile com.thinkup.core.common.m0.n.dm f70083n0;

    /* JADX INFO: renamed from: nd, reason: collision with root package name */
    private volatile com.thinkup.core.common.m0.n.dm f70084nd;

    /* JADX INFO: renamed from: nm, reason: collision with root package name */
    private volatile String f70085nm;

    /* JADX INFO: renamed from: nn, reason: collision with root package name */
    private volatile long f70086nn;

    public dd(String str) {
        this.f70080m = str;
    }

    private String d(String str, String str2) {
        if (TextUtils.isEmpty(str)) {
            return "";
        }
        try {
            String strMo = nd.m().mo();
            com.thinkup.core.common.dn.d();
            String strM = qo.m(com.thinkup.core.common.dn.m(true));
            if (!TextUtils.isEmpty(strMo) && !TextUtils.isEmpty(str2) && !TextUtils.isEmpty(strM)) {
                this.f70081mq = strMo;
                JSONObject jSONObject = new JSONObject();
                jSONObject.put(MBridgeConstans.DYNAMIC_VIEW_WX_PATH, strM);
                jSONObject.put(com.thinkup.core.common.m0.d0.odd, str2);
                jSONObject.put("traceid", UUID.randomUUID().toString());
                jSONObject.put("app_id", strMo);
                String string = jSONObject.toString();
                String strD = qo.d(strMo, string, "{}", str, qo.f72332d);
                if (TextUtils.isEmpty(strD)) {
                    return "";
                }
                return "{\"h\":" + string + ",\"q\":{},\"b\":" + str + ",\"mac\":\"" + strD + "\"}";
            }
        } catch (Throwable unused) {
        }
        return "";
    }

    private static String md() {
        com.thinkup.core.common.dn.d();
        return qo.m(com.thinkup.core.common.dn.m(true));
    }

    private void mm() {
        Context contextDd = nd.m().dd();
        String strN = com.thinkup.core.common.dd.n.d().n(contextDd);
        int iQ = com.thinkup.core.common.dd.n.d().q(contextDd);
        String strO = com.thinkup.core.common.dd.n.d().o(contextDd);
        int iD0 = com.thinkup.core.common.dd.n.d().d0(contextDd);
        com.thinkup.core.common.m0.n.dm dmVar = null;
        this.f70083n0 = (TextUtils.isEmpty(strN) || iQ <= 0) ? null : new com.thinkup.core.common.m0.n.dm(strN, iQ);
        if (!TextUtils.isEmpty(strO) && iD0 > 0) {
            dmVar = new com.thinkup.core.common.m0.n.dm(strO, iD0);
        }
        this.f70084nd = dmVar;
    }

    @Override // com.thinkup.core.common.m0.q.dn
    public final com.thinkup.core.common.m0.n.dm c_() {
        try {
            if (this.f70083n0 != null) {
                return this.f70083n0;
            }
            Context contextDd = nd.m().dd();
            String strN = com.thinkup.core.common.dd.n.d().n(contextDd);
            int iQ = com.thinkup.core.common.dd.n.d().q(contextDd);
            if (!TextUtils.isEmpty(strN) && iQ > 0) {
                return new com.thinkup.core.common.m0.n.dm(strN, iQ);
            }
            return null;
        } catch (Throwable unused) {
        }
    }

    @Override // com.thinkup.core.common.m0.q.dn
    public final com.thinkup.core.common.m0.n.dm dm() {
        return this.f70084nd;
    }

    @Override // com.thinkup.core.common.m0.q.dn
    public final boolean dn() {
        return true;
    }

    @Override // com.thinkup.core.common.m0.q.dn
    /* JADX INFO: renamed from: do, reason: not valid java name */
    public final long mo262do() {
        return this.f70086nn;
    }

    @Override // com.thinkup.core.common.m0.q.dn
    public final int m() {
        return 3;
    }

    @Override // com.thinkup.core.common.m0.q.dn
    public final byte[] n() {
        return dn.d(this.f70082n);
    }

    @Override // com.thinkup.core.common.m0.q.dn
    public final boolean o() {
        return false;
    }

    @Override // com.thinkup.core.common.m0.q.dn
    public final int d() {
        return 12;
    }

    private void d(Object obj, com.thinkup.core.common.m0.nd ndVar) {
        this.f70082n = null;
        if (obj instanceof String) {
            String str = (String) obj;
            if (!TextUtils.isEmpty(str)) {
                try {
                    qo.m mVarD = qo.d(str);
                    if (mVarD == null) {
                        ndVar.onLoadError(0, "envelope parse failed", null);
                        return;
                    }
                    String strD = qo.d(this.f70081mq, mVarD.f72340d, mVarD.f72341m, qo.f72332d);
                    if (strD != null && qo.d(strD, mVarD.f72342n)) {
                        JSONObject jSONObject = new JSONObject(mVarD.f72341m);
                        int iOptInt = jSONObject.optInt("code", 0);
                        if (iOptInt != 0) {
                            ndVar.onLoadError(0, "business code ".concat(String.valueOf(iOptInt)), null);
                            return;
                        }
                        JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject(com.thinkup.core.common.o.dn.q.f72920q);
                        if (jSONObjectOptJSONObject == null) {
                            jSONObjectOptJSONObject = new JSONObject();
                        }
                        ndVar.onLoadFinish(0, jSONObjectOptJSONObject);
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

    @Override // com.thinkup.core.common.m0.q.dn
    public final void d(com.thinkup.core.common.m0.n.dm dmVar) {
        if (dmVar != null && !TextUtils.isEmpty(dmVar.d()) && dmVar.m() > 0) {
            String str = dmVar.d() + ":" + dmVar.m();
            if (!TextUtils.equals(str, this.f70085nm) || TextUtils.isEmpty(this.f70082n)) {
                this.f70082n = d(this.f70080m, dmVar.d());
                this.f70085nm = str;
                if (TextUtils.isEmpty(this.f70082n)) {
                    n0.a("TCP envelope build failed for endpoint ", dmVar.d());
                    return;
                }
                return;
            }
            return;
        }
        v0.a("TCP endpoint is empty");
    }

    private void d(com.thinkup.core.common.m0.nd ndVar) {
        d(ndVar, 0L);
    }

    public final void d(final com.thinkup.core.common.m0.nd ndVar, long j10) {
        try {
            mm();
            this.f70086nn = j10 > 0 ? SystemClock.elapsedRealtime() + j10 : 0L;
            d(this.f70083n0 != null ? this.f70083n0 : this.f70084nd);
            d(new dn.d() { // from class: com.thinkup.core.common.m0.q.dd.1
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
                    dd.d(dd.this, obj, ndVar2);
                }
            });
        } catch (Throwable th2) {
            if (ndVar != null) {
                ndVar.onLoadError(0, th2.getMessage(), null);
            }
        }
    }

    public static /* synthetic */ void d(dd ddVar, Object obj, com.thinkup.core.common.m0.nd ndVar) {
        ddVar.f70082n = null;
        if (obj instanceof String) {
            String str = (String) obj;
            if (!TextUtils.isEmpty(str)) {
                try {
                    qo.m mVarD = qo.d(str);
                    if (mVarD == null) {
                        ndVar.onLoadError(0, "envelope parse failed", null);
                        return;
                    }
                    String strD = qo.d(ddVar.f70081mq, mVarD.f72340d, mVarD.f72341m, qo.f72332d);
                    if (strD != null && qo.d(strD, mVarD.f72342n)) {
                        JSONObject jSONObject = new JSONObject(mVarD.f72341m);
                        int iOptInt = jSONObject.optInt("code", 0);
                        if (iOptInt != 0) {
                            ndVar.onLoadError(0, "business code ".concat(String.valueOf(iOptInt)), null);
                            return;
                        }
                        JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject(com.thinkup.core.common.o.dn.q.f72920q);
                        if (jSONObjectOptJSONObject == null) {
                            jSONObjectOptJSONObject = new JSONObject();
                        }
                        ndVar.onLoadFinish(0, jSONObjectOptJSONObject);
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