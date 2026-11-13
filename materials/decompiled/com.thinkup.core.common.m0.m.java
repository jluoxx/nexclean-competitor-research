package com.thinkup.core.common.m0;

import android.content.Context;
import android.text.TextUtils;
import androidx.browser.trusted.sharing.ShareTarget;
import com.mbridge.msdk.foundation.download.Command;
import com.thinkup.core.api.AdError;
import com.thinkup.core.api.ErrorCode;
import com.thinkup.core.common.m0.d.Cdo;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.net.ConnectException;
import java.net.SocketException;
import java.net.SocketTimeoutException;
import java.net.UnknownHostException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import java.util.zip.GZIPOutputStream;
import javax.net.ssl.SSLException;
import org.apache.http.conn.ConnectTimeoutException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes7.dex */
public abstract class m {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final String f69811d = "http.loader";

    /* JADX INFO: renamed from: d0, reason: collision with root package name */
    public static final int f69812d0 = 200;

    /* JADX INFO: renamed from: dd, reason: collision with root package name */
    public static final String f69813dd = "Content-Type";

    /* JADX INFO: renamed from: dm, reason: collision with root package name */
    public static final String f69814dm = "application/json";

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final int f69815o = 699;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final int f69816q = 700;

    /* JADX INFO: renamed from: dn, reason: collision with root package name */
    protected nd f69817dn;

    /* JADX INFO: renamed from: do, reason: not valid java name */
    protected boolean f143do;

    /* JADX INFO: renamed from: dq, reason: collision with root package name */
    protected String f69818dq;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final com.thinkup.core.common.m0.o.dn f69819m = com.thinkup.core.common.o.nd.m().dmd();

    /* JADX INFO: renamed from: m0, reason: collision with root package name */
    private com.thinkup.core.common.m0.d.m f69820m0;

    /* JADX INFO: renamed from: md, reason: collision with root package name */
    private long f69821md;

    /* JADX INFO: renamed from: mm, reason: collision with root package name */
    private boolean f69822mm;

    /* JADX INFO: renamed from: mn, reason: collision with root package name */
    private com.thinkup.core.common.m0.d.d.d f69823mn;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private com.thinkup.core.common.m0.n.o f69824n;

    private void d(Cdo cdo, int i10) {
        String strConcat;
        int i11;
        Throwable th2 = cdo.f69746o;
        int i12 = cdo.f69744m;
        String str = "";
        String message = th2 != null ? th2.getMessage() : "";
        if (th2 instanceof UnknownHostException) {
            strConcat = "UnknownHostException: ".concat(String.valueOf(message));
            i11 = -1000;
        } else if (th2 instanceof ConnectException) {
            strConcat = "ConnectException: ".concat(String.valueOf(message));
            i11 = mq.f69867m;
        } else if (th2 instanceof SSLException) {
            strConcat = "SSLException: ".concat(String.valueOf(message));
            i11 = mq.f69863dd;
        } else if (th2 instanceof SocketException) {
            strConcat = "SocketException: ".concat(String.valueOf(message));
            i11 = mq.f69864dm;
        } else if (th2 instanceof SocketTimeoutException) {
            strConcat = "SocketTimeoutException: ".concat(String.valueOf(message));
            i11 = mq.f69872n;
        } else if (th2 instanceof ConnectTimeoutException) {
            strConcat = "ConnectTimeoutException: ".concat(String.valueOf(message));
            i11 = mq.f69873o;
        } else if (th2 instanceof IOException) {
            strConcat = "IOException: ".concat(String.valueOf(message));
            i11 = mq.f69865dn;
        } else {
            String str2 = cdo.f69745n;
            if (th2 == null) {
                strConcat = str2;
            } else if (TextUtils.isEmpty(str2)) {
                strConcat = "Exception: " + th2 + ", Message: " + message;
            } else {
                strConcat = "Msg: " + cdo.f69745n + "Exception: " + th2 + ", Message: " + message;
            }
            i11 = -9998;
        }
        com.thinkup.core.common.m0.d.d.d dVar = this.f69823mn;
        com.thinkup.core.common.m0.n.d dVarD = dVar != null ? dVar.d() : null;
        if (dVarD != null && dVarD.mm()) {
            strConcat = "cus-dns,".concat(String.valueOf(strConcat));
        }
        String str3 = strConcat;
        AdError errorCode = ErrorCode.getErrorCode(ErrorCode.httpStatuException, String.valueOf(i11), str3);
        Map<String, List<String>> map = cdo.f69743d0;
        if (map != null && !map.isEmpty() && cdo.f69744m == 699) {
            try {
                List<String> list = map.get("Req-Next-Time");
                if (list != null && !list.isEmpty()) {
                    str = list.get(0);
                }
                if (!TextUtils.isEmpty(str)) {
                    this.f69821md = Long.parseLong(str) * 1000;
                }
            } catch (Throwable unused) {
            }
        }
        try {
            m(i10, i12, str3, errorCode, true);
        } finally {
            d(cdo.f69747q);
        }
    }

    private void m(Cdo cdo, int i10) {
        String strN;
        JSONObject jSONObject;
        int i11 = cdo.f69744m;
        try {
            com.thinkup.core.common.m0.d.dq dqVar = cdo.f69747q;
            String strTrim = "";
            if (dqVar != null) {
                strN = nd() ? dqVar.n() : dqVar.m();
            } else {
                strN = "";
            }
            if (!d(i11) && (i11 == 201 || i11 == 204)) {
                d(i10, d((Object) null));
                return;
            }
            if (!md()) {
                d(i10, d((Object) (strN != null ? strN.trim() : null)));
                return;
            }
            if (TextUtils.isEmpty(strN)) {
                jSONObject = new JSONObject();
            } else {
                strTrim = strN.trim();
                try {
                    jSONObject = new JSONObject(strTrim);
                } catch (Throwable unused) {
                    jSONObject = new JSONObject();
                }
            }
            int iOptInt = jSONObject.optInt("code", 0);
            if (iOptInt != 0) {
                d(i10, mq.f69868m0, strTrim, ErrorCode.getErrorCode(ErrorCode.statuError, String.valueOf(iOptInt), strTrim));
                return;
            }
            JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject(com.thinkup.core.common.o.dn.q.f72920q);
            if (jSONObjectOptJSONObject == null) {
                jSONObjectOptJSONObject = new JSONObject();
            }
            d(i10, d(jSONObjectOptJSONObject));
        } catch (Throwable th2) {
            d(i10, i11, th2.getMessage(), ErrorCode.getErrorCode(ErrorCode.httpStatuException, String.valueOf(i11), th2.getMessage()));
        }
    }

    private void n(int i10) {
        nd ndVar = this.f69817dn;
        if (ndVar != null) {
            ndVar.onLoadCanceled(i10);
        }
    }

    private void nm() {
        this.f143do = true;
        com.thinkup.core.common.m0.d.m mVar = this.f69820m0;
        if (mVar != null) {
            mVar.d();
        }
    }

    private String nn() {
        int iD = d();
        if (iD != 1 && iD != 2) {
            iD = 2;
        }
        return iD == 2 ? ShareTarget.METHOD_GET : ShareTarget.METHOD_POST;
    }

    private Map<String, String> no() {
        Map<String, String> mapN = n();
        if (mapN == null) {
            mapN = new HashMap<>();
        }
        if (com.thinkup.core.common.o.nd.m().n("ua")) {
            mapN.put(Command.HTTP_HEADER_USER_AGENT, com.thinkup.core.common.nn.mn.d());
        }
        return mapN;
    }

    private String nq() {
        Map<String, String> mapN = n();
        return (mapN == null || !mapN.containsKey("Content-Type")) ? f69814dm : mapN.get("Content-Type");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public /* synthetic */ void o(int i10) {
        String strN;
        JSONObject jSONObject;
        String strConcat;
        int i11;
        com.thinkup.core.common.m0.o.dn dnVar;
        com.thinkup.core.common.m0.n.d0 d0VarD;
        try {
            if (this.f143do) {
                nd ndVar = this.f69817dn;
                if (ndVar != null) {
                    ndVar.onLoadCanceled(i10);
                    return;
                }
                return;
            }
            this.f69822mm = false;
            com.thinkup.core.common.o.nd.m().ddn();
            this.f69818dq = m();
            int iMdo = com.thinkup.core.q.o.d().mdo();
            int iD = d();
            boolean z10 = true;
            if (iD != 1 && iD != 2) {
                iD = 2;
            }
            String str = iD == 2 ? ShareTarget.METHOD_GET : ShareTarget.METHOD_POST;
            nd ndVar2 = this.f69817dn;
            if (ndVar2 != null) {
                ndVar2.onLoadStart(i10);
            }
            if (this.f69824n == null) {
                this.f69824n = mn();
            }
            com.thinkup.core.common.m0.n.o oVar = this.f69824n;
            String strTrim = "";
            if (oVar != null && (dnVar = this.f69819m) != null && (d0VarD = dnVar.d(oVar)) != null && d0VarD.q()) {
                int iD0 = d0VarD.d0();
                String strValueOf = String.valueOf(iD0);
                if (iD0 != 200) {
                    d(i10, iD0, "", ErrorCode.getErrorCode(ErrorCode.statuError, strValueOf, ""), false);
                    return;
                } else {
                    d(i10, d0VarD.dd(), false);
                    return;
                }
            }
            com.thinkup.core.common.m0.d.m d0Var = this.f69820m0;
            if (d0Var == null) {
                if (this.f69823mn == null) {
                    this.f69823mn = new com.thinkup.core.common.m0.d.d.d(getClass().getName(), this.f69818dq);
                }
                com.thinkup.core.common.m0.d.d0.d dVar = new com.thinkup.core.common.m0.d.d0.d();
                TimeUnit timeUnit = TimeUnit.MILLISECONDS;
                com.thinkup.core.common.m0.d.d0 d0VarD2 = dVar.d(timeUnit).n(timeUnit).m(timeUnit).d(this.f69823mn.d(this.f69824n)).d(iMdo).d();
                d0Var = com.thinkup.core.q.m.m(d0VarD2.f69718dn) ? new com.thinkup.core.common.m0.d.d.d0(d0VarD2) : new com.thinkup.core.common.m0.d.d.m(d0VarD2);
                this.f69820m0 = d0Var;
            }
            com.thinkup.core.common.m0.d.dn.d dVarM = new com.thinkup.core.common.m0.d.dn.d().d(this.f69818dq).m(str);
            String str2 = f69814dm;
            Map<String, String> mapN = n();
            if (mapN != null && mapN.containsKey("Content-Type")) {
                str2 = mapN.get("Content-Type");
            }
            com.thinkup.core.common.m0.d.dn.d dVarD = dVarM.n(str2).d(o());
            Map<String, String> mapN2 = n();
            if (mapN2 == null) {
                mapN2 = new HashMap<>();
            }
            if (com.thinkup.core.common.o.nd.m().n("ua")) {
                mapN2.put(Command.HTTP_HEADER_USER_AGENT, com.thinkup.core.common.nn.mn.d());
            }
            Cdo cdoD = d0Var.d(dVarD.d(mapN2).d());
            int i12 = cdoD.f69744m;
            if ((i12 == 200 || i12 == 201 || i12 == 204) == true || d(i12)) {
                int i13 = cdoD.f69744m;
                try {
                    com.thinkup.core.common.m0.d.dq dqVar = cdoD.f69747q;
                    if (dqVar != null) {
                        strN = nd() ? dqVar.n() : dqVar.m();
                    } else {
                        strN = "";
                    }
                    if (!d(i13) && (i13 == 201 || i13 == 204)) {
                        d(i10, d((Object) null));
                        return;
                    }
                    if (!md()) {
                        d(i10, d((Object) (strN != null ? strN.trim() : null)));
                        return;
                    }
                    if (TextUtils.isEmpty(strN)) {
                        jSONObject = new JSONObject();
                    } else {
                        strTrim = strN.trim();
                        try {
                            jSONObject = new JSONObject(strTrim);
                        } catch (Throwable unused) {
                            jSONObject = new JSONObject();
                        }
                    }
                    int iOptInt = jSONObject.optInt("code", 0);
                    if (iOptInt != 0) {
                        d(i10, mq.f69868m0, strTrim, ErrorCode.getErrorCode(ErrorCode.statuError, String.valueOf(iOptInt), strTrim));
                        return;
                    }
                    JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject(com.thinkup.core.common.o.dn.q.f72920q);
                    if (jSONObjectOptJSONObject == null) {
                        jSONObjectOptJSONObject = new JSONObject();
                    }
                    d(i10, d(jSONObjectOptJSONObject));
                    return;
                } catch (Throwable th2) {
                    d(i10, i13, th2.getMessage(), ErrorCode.getErrorCode(ErrorCode.httpStatuException, String.valueOf(i13), th2.getMessage()));
                    return;
                }
            }
            Throwable th3 = cdoD.f69746o;
            int i14 = cdoD.f69744m;
            String message = th3 != null ? th3.getMessage() : "";
            if (th3 instanceof UnknownHostException) {
                strConcat = "UnknownHostException: ".concat(String.valueOf(message));
                i11 = -1000;
            } else if (th3 instanceof ConnectException) {
                strConcat = "ConnectException: ".concat(String.valueOf(message));
                i11 = mq.f69867m;
            } else if (th3 instanceof SSLException) {
                strConcat = "SSLException: ".concat(String.valueOf(message));
                i11 = mq.f69863dd;
            } else if (th3 instanceof SocketException) {
                strConcat = "SocketException: ".concat(String.valueOf(message));
                i11 = mq.f69864dm;
            } else if (th3 instanceof SocketTimeoutException) {
                strConcat = "SocketTimeoutException: ".concat(String.valueOf(message));
                i11 = mq.f69872n;
            } else if (th3 instanceof ConnectTimeoutException) {
                strConcat = "ConnectTimeoutException: ".concat(String.valueOf(message));
                i11 = mq.f69873o;
            } else if (th3 instanceof IOException) {
                strConcat = "IOException: ".concat(String.valueOf(message));
                i11 = mq.f69865dn;
            } else {
                String str3 = cdoD.f69745n;
                if (th3 == null) {
                    strConcat = str3;
                } else if (TextUtils.isEmpty(str3)) {
                    strConcat = "Exception: " + th3 + ", Message: " + message;
                } else {
                    strConcat = "Msg: " + cdoD.f69745n + "Exception: " + th3 + ", Message: " + message;
                }
                i11 = -9998;
            }
            com.thinkup.core.common.m0.d.d.d dVar2 = this.f69823mn;
            com.thinkup.core.common.m0.n.d dVarD2 = dVar2 != null ? dVar2.d() : null;
            if (dVarD2 == null || !dVarD2.mm()) {
                z10 = false;
            }
            if (z10) {
                strConcat = "cus-dns,".concat(String.valueOf(strConcat));
            }
            AdError errorCode = ErrorCode.getErrorCode(ErrorCode.httpStatuException, String.valueOf(i11), strConcat);
            Map<String, List<String>> map = cdoD.f69743d0;
            if (map != null && !map.isEmpty() && cdoD.f69744m == 699) {
                try {
                    List<String> list = map.get("Req-Next-Time");
                    if (list != null && !list.isEmpty()) {
                        strTrim = list.get(0);
                    }
                    if (!TextUtils.isEmpty(strTrim)) {
                        this.f69821md = Long.parseLong(strTrim) * 1000;
                    }
                } catch (Throwable unused2) {
                }
            }
            try {
                m(i10, i14, strConcat, errorCode, true);
                return;
            } finally {
                d(cdoD.f69747q);
            }
            d(0, 0, th.getMessage(), ErrorCode.getErrorCode(ErrorCode.httpStatuException, "0", th.getMessage()));
        } catch (Throwable th4) {
            d(0, 0, th4.getMessage(), ErrorCode.getErrorCode(ErrorCode.httpStatuException, "0", th4.getMessage()));
        }
    }

    private static void o0() {
    }

    private static void od() {
    }

    private void om() {
        com.thinkup.core.common.m0.d.d.d dVar = this.f69823mn;
        com.thinkup.core.common.m0.n.d dVarD = dVar != null ? dVar.d() : null;
        if (dVarD == null || !dVarD.mo()) {
            return;
        }
        com.thinkup.core.common.nm.d0.d(dVarD);
    }

    private boolean on() {
        com.thinkup.core.common.m0.d.d.d dVar = this.f69823mn;
        com.thinkup.core.common.m0.n.d dVarD = dVar != null ? dVar.d() : null;
        return dVarD != null && dVarD.mm();
    }

    public abstract int d();

    public abstract Object d(Object obj);

    public abstract void d(AdError adError);

    public abstract Context d0();

    public abstract String dd();

    public abstract Map<String, Object> dm();

    public JSONObject dn() {
        return d0.d(mm(), n0());
    }

    /* JADX INFO: renamed from: do */
    public JSONObject mo259do() {
        return d0.m(mm(), n0());
    }

    public String dq() {
        HashMap map = new HashMap();
        String strD = com.thinkup.core.common.nn.Cdo.d(dn().toString());
        String strD2 = com.thinkup.core.common.nn.Cdo.d(mo259do().toString());
        map.put(d0.dd0, mq());
        map.put("p", strD);
        map.put(d0.dmm, strD2);
        ArrayList<String> arrayList = new ArrayList(map.size());
        arrayList.addAll(map.keySet());
        Collections.sort(arrayList);
        StringBuilder sb2 = new StringBuilder();
        for (String str : arrayList) {
            if (sb2.length() > 0) {
                sb2.append("&");
            }
            sb2.append(str);
            sb2.append("=");
            sb2.append(map.get(str));
        }
        map.put(d0.dmn, com.thinkup.core.common.nn.mm.n(dd() + sb2.toString()));
        if (dm() != null) {
            map.putAll(dm());
        }
        Set<String> setKeySet = map.keySet();
        JSONObject jSONObject = new JSONObject();
        try {
            for (String str2 : setKeySet) {
                jSONObject.put(str2, String.valueOf(map.get(str2)));
            }
            return jSONObject.toString();
        } catch (Exception unused) {
            return null;
        } catch (OutOfMemoryError unused2) {
            System.gc();
            return null;
        }
    }

    public abstract String m();

    public abstract void m0();

    public boolean md() {
        return false;
    }

    @Deprecated
    public int mm() {
        return 0;
    }

    public com.thinkup.core.common.m0.n.o mn() {
        return null;
    }

    public boolean mo() {
        return false;
    }

    public String mq() {
        return "1.0";
    }

    public abstract Map<String, String> n();

    public List<String> n0() {
        return null;
    }

    public boolean nd() {
        return false;
    }

    public abstract byte[] o();

    public abstract String q();

    private void m(int i10) {
        c cVar = new c(this, i10);
        if (mo()) {
            com.thinkup.core.common.nm.d.d.d();
            com.thinkup.core.common.nm.d.d.d(cVar);
        } else {
            com.thinkup.core.common.nn.m.n.d().n(new com.thinkup.core.common.nn.m.o(com.thinkup.core.common.nn.m.q.f72098d, cVar));
        }
    }

    private void m(int i10, int i11, String str, AdError adError, boolean z10) {
        if (this.f69822mm) {
            return;
        }
        this.f69822mm = true;
        nd ndVar = this.f69817dn;
        if (ndVar != null) {
            ndVar.onLoadError(i10, str, adError);
        }
        if (z10) {
            m(i11, (Object) null);
        }
        d(adError);
        om();
    }

    private void m(int i10, Object obj) {
        com.thinkup.core.common.m0.n.o oVar;
        if (this.f69819m == null || (oVar = this.f69824n) == null) {
            return;
        }
        String strD = oVar.d();
        String strM = this.f69824n.m();
        com.thinkup.core.common.m0.n.d0 d0VarD = com.thinkup.core.common.m0.n.d0.d();
        if (obj != null && (com.thinkup.core.common.m0.n.dd.f69909n.equals(strM) || com.thinkup.core.common.m0.n.dd.f69910o.equals(strM))) {
            d0VarD.d(obj);
        }
        long j10 = this.f69821md;
        if (j10 > 0) {
            d0VarD.d(j10);
        }
        d0VarD.d(i10);
        d0VarD.d(strD);
        this.f69819m.d(d0VarD, this.f69824n);
    }

    public boolean d(int i10) {
        return false;
    }

    public void d(int i10, nd ndVar) {
        this.f143do = false;
        this.f69817dn = ndVar;
        c cVar = new c(this, i10);
        if (mo()) {
            com.thinkup.core.common.nm.d.d.d();
            com.thinkup.core.common.nm.d.d.d(cVar);
        } else {
            com.thinkup.core.common.nn.m.n.d().n(new com.thinkup.core.common.nn.m.o(com.thinkup.core.common.nn.m.q.f72098d, cVar));
        }
    }

    private void d(int i10, int i11, String str, AdError adError) {
        d(i10, i11, str, adError, true);
    }

    private void d(int i10, int i11, String str, AdError adError, boolean z10) {
        m(i10, i11, str, adError, z10);
    }

    public void d(int i10, Object obj) {
        d(i10, obj, true);
    }

    private void d(int i10, Object obj, boolean z10) {
        if (this.f69822mm) {
            return;
        }
        this.f69822mm = true;
        nd ndVar = this.f69817dn;
        if (ndVar != null) {
            ndVar.onLoadFinish(i10, obj);
        }
        if (z10) {
            m(200, obj);
            om();
        }
    }

    public static byte[] d(String str) {
        if (str == null || str.isEmpty()) {
            return null;
        }
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            GZIPOutputStream gZIPOutputStream = new GZIPOutputStream(byteArrayOutputStream);
            gZIPOutputStream.write(str.getBytes("utf-8"));
            gZIPOutputStream.close();
        } catch (Exception e10) {
            e10.printStackTrace();
        }
        return byteArrayOutputStream.toByteArray();
    }

    private void d(Cdo cdo) {
        Map<String, List<String>> map = cdo.f69743d0;
        if (map == null || map.isEmpty() || cdo.f69744m != 699) {
            return;
        }
        try {
            List<String> list = map.get("Req-Next-Time");
            String str = (list == null || list.isEmpty()) ? "" : list.get(0);
            if (TextUtils.isEmpty(str)) {
                return;
            }
            this.f69821md = Long.parseLong(str) * 1000;
        } catch (Throwable unused) {
        }
    }

    private static void d(com.thinkup.core.common.m0.d.dq dqVar) {
        if (dqVar == null) {
            return;
        }
        try {
            dqVar.o();
        } catch (Throwable unused) {
        }
    }
}