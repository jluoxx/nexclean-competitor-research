package com.thinkup.core.common.o;

import android.content.Context;
import android.text.TextUtils;
import com.thinkup.core.api.NoticeUtils;
import com.thinkup.core.api.TUSDK;
import com.thinkup.core.common.dm.oq;
import com.thinkup.core.common.nn.qq;
import java.util.Map;
import java.util.Objects;

/* JADX INFO: loaded from: classes7.dex */
public final class mq {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final String f73017d = "tpn_thinkup_notice_handler";

    public static void d(com.thinkup.core.common.d0 d0Var, String str, Map<String, Object> map) {
        try {
            com.thinkup.core.common.dm.m0 m0VarD = d(str, d0Var);
            if (m0VarD != null) {
                if (TUSDK.isNetworkLogDebug()) {
                    Objects.toString(map);
                }
                if (map != null) {
                    Object obj = map.get("second_price");
                    if (obj instanceof Double) {
                        m0VarD.m(((Double) obj).doubleValue());
                    }
                    Object obj2 = map.get("bidding_name");
                    if (obj2 instanceof String) {
                        m0VarD.m((String) obj2);
                    }
                    Object obj3 = map.get(NoticeUtils.ORIGIN_ILRD);
                    if (obj3 instanceof String) {
                        m0VarD.n((String) obj3);
                    }
                    Object obj4 = map.get("waterfall_info");
                    if (obj4 instanceof String) {
                        com.thinkup.core.common.o.d().d(str, (String) obj4);
                    }
                }
                com.thinkup.core.common.nm.q.d(nd.m().dd());
                com.thinkup.core.common.nm.q.d(22, m0VarD);
            }
        } catch (Throwable unused) {
        }
    }

    public static void m(com.thinkup.core.common.d0 d0Var, String str, Map<String, Object> map) {
        try {
            com.thinkup.core.common.dm.m0 m0VarD = d(str, d0Var);
            if (m0VarD != null) {
                if (map != null) {
                    String str2 = (String) map.get(NoticeUtils.LOSS_REASON);
                    Object obj = map.get(NoticeUtils.WINNER_PRICE);
                    double dDoubleValue = obj != null ? ((Double) obj).doubleValue() : -1.0d;
                    if (TUSDK.isNetworkLogDebug()) {
                        map.toString();
                    }
                    m0VarD.d(dDoubleValue);
                    try {
                        m0VarD.n(Integer.parseInt(str2));
                    } catch (Throwable unused) {
                    }
                    Object obj2 = map.get("bidding_name");
                    if (obj2 instanceof String) {
                        m0VarD.d((String) obj2);
                    }
                    Object obj3 = map.get(NoticeUtils.ORIGIN_ILRD);
                    if (obj3 instanceof String) {
                        m0VarD.n((String) obj3);
                    }
                    Object obj4 = map.get("waterfall_info");
                    if (obj4 instanceof String) {
                        com.thinkup.core.common.o.d().d(str, (String) obj4);
                    }
                }
                com.thinkup.core.common.nm.q.d(nd.m().dd());
                com.thinkup.core.common.nm.q.d(23, m0VarD);
            }
            d0Var.dn();
        } catch (Throwable unused2) {
        }
    }

    private static com.thinkup.core.common.dm.m0 d(String str, com.thinkup.core.common.d0 d0Var) {
        if (!nd.m().f73056o || TextUtils.isEmpty(str) || d0Var == null) {
            return null;
        }
        Context contextDd = nd.m().dd();
        com.thinkup.core.common.dm.d dVarD = d0Var.d(contextDd, false, false, (oq) null);
        if (dVarD != null) {
            return dVarD.dn().do0();
        }
        com.thinkup.core.q.m0 m0VarD = com.thinkup.core.q.mm.d(contextDd).d(str);
        String strMd = d0Var.md();
        if (TextUtils.isEmpty(strMd)) {
            strMd = "";
        }
        com.thinkup.core.common.dm.m0 m0VarD2 = qq.d(strMd, str, m0VarD, 0, 0, null, null, 0, d0Var.mm(), d0Var);
        if (m0VarD == null) {
            m0VarD2.d0d(d0Var.m());
        }
        return m0VarD2;
    }
}