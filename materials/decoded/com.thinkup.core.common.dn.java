package com.thinkup.core.common;

import android.text.TextUtils;
import com.thinkup.core.api.TUSDK;
import com.thinkup.core.common.dm.d0o;
import com.tiktok.util.UrlConst;

/* JADX INFO: loaded from: classes7.dex */
public class dn {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static volatile dn f68732d;

    private dn() {
    }

    public static String d(boolean z10) {
        String str;
        if (z10) {
            str = dm() ? com.thinkup.core.common.o.dn.q.f72918oo : com.thinkup.core.common.o.dn.q.f72894d0;
        } else {
            str = dm() ? com.thinkup.core.common.o.dn.q.f72919oq : com.thinkup.core.common.o.dn.q.f72895dd;
        }
        String strMn0 = "";
        if (!TUSDK.isCnSDK()) {
            return com.thinkup.core.common.dd.n.d().d(str, "", z10);
        }
        com.thinkup.core.q.m mVarM = com.thinkup.core.q.o.d(com.thinkup.core.common.o.nd.m().dd()).m(com.thinkup.core.common.o.nd.m().mo());
        if (mVarM != null) {
            strMn0 = z10 ? mVarM.mn0() : mVarM.mnd();
        }
        com.thinkup.core.common.dd.n.d();
        return com.thinkup.core.common.dd.n.m(str, strMn0);
    }

    public static String d0() {
        com.thinkup.core.q.m mVarM = com.thinkup.core.q.o.d(com.thinkup.core.common.o.nd.m().dd()).m(com.thinkup.core.common.o.nd.m().mo());
        if (mVarM != null) {
            return d(mVarM.dmn(), "https://img.robin-flow.com/gdpr/PrivacyPolicySetting.html");
        }
        com.thinkup.core.common.o.n0 n0VarN = com.thinkup.core.common.o.nd.m().n();
        String gdprUrl = n0VarN != null ? n0VarN.getGdprUrl() : "";
        return !TextUtils.isEmpty(gdprUrl) ? gdprUrl : "https://img.robin-flow.com/gdpr/PrivacyPolicySetting.html";
    }

    public static String dd() {
        return com.thinkup.core.common.o.dn.q.f72912nq;
    }

    public static boolean dm() {
        return com.thinkup.core.common.o.nd.m().d0d() && com.thinkup.core.common.o.nd.m().d00();
    }

    public static String dn() {
        com.thinkup.core.q.m mVarM = com.thinkup.core.q.o.d(com.thinkup.core.common.o.nd.m().dd()).m(com.thinkup.core.common.o.nd.m().mo());
        String strD = com.thinkup.core.common.dd.n.d().d(dm() ? com.thinkup.core.common.o.dn.q.f72923qm : com.thinkup.core.common.o.dn.q.f226do, com.thinkup.core.common.m0.n.dd.f69904dq);
        return mVarM != null ? d(mVarM.dqq(), strD) : strD;
    }

    /* JADX INFO: renamed from: do, reason: not valid java name */
    public static String m246do() {
        com.thinkup.core.common.o.n0 n0VarN = com.thinkup.core.common.o.nd.m().n();
        String cdnUrl = n0VarN != null ? n0VarN.getCdnUrl() : "";
        if (TextUtils.isEmpty(cdnUrl)) {
            cdnUrl = "https://se.rfvtgbyhn.com/v2/open/ns";
        }
        com.thinkup.core.q.m mVarD = com.thinkup.core.q.o.d();
        if (mVarD == null) {
            return cdnUrl;
        }
        String strDdm = mVarD.ddm();
        if (TextUtils.isEmpty(strDdm)) {
            return cdnUrl;
        }
        return strDdm.startsWith("http") ? strDdm.concat("/v2/open/ns") : com.thinkup.core.common.nn.mo.d(cdnUrl, strDdm);
    }

    public static String dq() {
        com.thinkup.core.q.m mVarD = com.thinkup.core.q.o.d();
        com.thinkup.core.common.o.n0 n0VarN = com.thinkup.core.common.o.nd.m().n();
        String cdnTcpDm = (n0VarN == null || n0VarN.getOsDmEntity() == null) ? "" : n0VarN.getOsDmEntity().getCdnTcpDm();
        if (TextUtils.isEmpty(cdnTcpDm)) {
            cdnTcpDm = com.thinkup.core.common.o.dn.dd.m.f72665n;
        }
        if (mVarD != null) {
            String strM0n = mVarD.m0n();
            if (!TextUtils.isEmpty(strM0n)) {
                return strM0n;
            }
        }
        return cdnTcpDm;
    }

    public static String m(boolean z10) {
        String str;
        if (z10) {
            str = dm() ? com.thinkup.core.common.o.dn.q.f72921q0 : com.thinkup.core.common.o.dn.q.f72896dm;
        } else {
            str = dm() ? com.thinkup.core.common.o.dn.q.f72922qd : com.thinkup.core.common.o.dn.q.f72897dn;
        }
        String strMn0 = "";
        if (!TUSDK.isCnSDK()) {
            return com.thinkup.core.common.dd.n.d().d(str, "", z10);
        }
        com.thinkup.core.q.m mVarM = com.thinkup.core.q.o.d(com.thinkup.core.common.o.nd.m().dd()).m(com.thinkup.core.common.o.nd.m().mo());
        if (mVarM != null) {
            strMn0 = z10 ? mVarM.mn0() : mVarM.mnd();
        }
        com.thinkup.core.common.dd.n.d();
        return com.thinkup.core.common.dd.n.m(str, strMn0);
    }

    public static int m0() {
        int iM0o;
        com.thinkup.core.q.m mVarM = com.thinkup.core.q.o.d(com.thinkup.core.common.o.nd.m().dd()).m(com.thinkup.core.common.o.nd.m().mo());
        return (mVarM == null || (iM0o = mVarM.m0o()) <= 0) ? com.thinkup.core.common.o.dn.dd.m.f72660d : iM0o;
    }

    public static String md() {
        String str = dm() ? com.thinkup.core.common.o.dn.q.ddm : com.thinkup.core.common.o.dn.q.f72917on;
        com.thinkup.core.q.m mVarM = com.thinkup.core.q.o.d(com.thinkup.core.common.o.nd.m().dd()).m(com.thinkup.core.common.o.nd.m().mo());
        return (mVarM == null || TextUtils.isEmpty(mVarM.mdd())) ? com.thinkup.core.common.dd.n.d().d(str, "") : mVarM.mdd();
    }

    public static String mm() {
        com.thinkup.core.common.o.n0 n0VarN = com.thinkup.core.common.o.nd.m().n();
        String cdnUrl = n0VarN != null ? n0VarN.getCdnUrl() : "";
        String strReplace = TextUtils.isEmpty(cdnUrl) ? "https://se.rfvtgbyhn.com/v2/open/api_hb" : cdnUrl.replace("/v2/open/ns", "/v2/open/api_hb");
        com.thinkup.core.q.m mVarD = com.thinkup.core.q.o.d();
        if (mVarD == null) {
            return strReplace;
        }
        String strDdm = mVarD.ddm();
        if (TextUtils.isEmpty(strDdm)) {
            return strReplace;
        }
        if (strDdm.startsWith("http")) {
            return strDdm.concat("/v2/open/api_hb");
        }
        return UrlConst.HTTPS + strDdm + "/v2/open/api_hb";
    }

    private static String mn() {
        return com.thinkup.core.common.dd.n.d().d(dm() ? com.thinkup.core.common.o.dn.q.dd0 : com.thinkup.core.common.o.dn.q.f72910nn, "");
    }

    private static String mo() {
        d0o d0oVarNo = com.thinkup.core.q.o.d(com.thinkup.core.common.o.nd.m().dd()).m(com.thinkup.core.common.o.nd.m().mo()).no();
        String strD = com.thinkup.core.common.dd.n.d().d(dm() ? com.thinkup.core.common.o.dn.q.d0m : com.thinkup.core.common.o.dn.q.f72904mo, "bid");
        return d0oVarNo != null ? d(d0oVarNo.m(), strD) : strD;
    }

    private static String mq() {
        d0o d0oVarNo = com.thinkup.core.q.o.d(com.thinkup.core.common.o.nd.m().dd()).m(com.thinkup.core.common.o.nd.m().mo()).no();
        String strD = com.thinkup.core.common.dd.n.d().d(dm() ? com.thinkup.core.common.o.dn.q.d0n : com.thinkup.core.common.o.dn.q.f72905mq, com.thinkup.core.common.m0.n.dd.f69901dd);
        return d0oVarNo != null ? d(d0oVarNo.o(), strD) : strD;
    }

    public static String n() {
        com.thinkup.core.q.m mVarM = com.thinkup.core.q.o.d(com.thinkup.core.common.o.nd.m().dd()).m(com.thinkup.core.common.o.nd.m().mo());
        String strD = com.thinkup.core.common.dd.n.d().d(dm() ? com.thinkup.core.common.o.dn.q.d0q : com.thinkup.core.common.o.dn.q.f72909nm, com.thinkup.core.common.m0.n.dd.f69901dd);
        return mVarM != null ? d(mVarM.nd(), strD) : strD;
    }

    private static String n0() {
        d0o d0oVarNo = com.thinkup.core.q.o.d(com.thinkup.core.common.o.nd.m().dd()).m(com.thinkup.core.common.o.nd.m().mo()).no();
        String strD = com.thinkup.core.common.dd.n.d().d(dm() ? com.thinkup.core.common.o.dn.q.d0o : com.thinkup.core.common.o.dn.q.f72907n0, "bid");
        return d0oVarNo != null ? d(d0oVarNo.d(), strD) : strD;
    }

    private static String nd() {
        com.thinkup.core.q.m mVarM = com.thinkup.core.q.o.d(com.thinkup.core.common.o.nd.m().dd()).m(com.thinkup.core.common.o.nd.m().mo());
        String strD = com.thinkup.core.common.dd.n.d().d(dm() ? com.thinkup.core.common.o.dn.q.f72925qo : com.thinkup.core.common.o.dn.q.f72900m0, com.thinkup.core.common.m0.n.dd.f69901dd);
        if (mVarM != null) {
            String strMoo = mVarM.moo();
            if (!TextUtils.isEmpty(strMoo)) {
                return strMoo.startsWith("http") ? strMoo.concat("/v2/open/anr") : com.thinkup.core.common.nn.mo.d(strD, strMoo);
            }
        }
        return strD;
    }

    private static String nm() {
        return com.thinkup.core.common.dd.n.d().d(dm() ? com.thinkup.core.common.o.dn.q.ddd : com.thinkup.core.common.o.dn.q.f72916om, "");
    }

    private static String nn() {
        return dq();
    }

    private static int no() {
        return m0();
    }

    public static String o() {
        com.thinkup.core.q.m mVarM = com.thinkup.core.q.o.d(com.thinkup.core.common.o.nd.m().dd()).m(com.thinkup.core.common.o.nd.m().mo());
        String strD = com.thinkup.core.common.dd.n.d().d(dm() ? com.thinkup.core.common.o.dn.q.f72926qq : com.thinkup.core.common.o.dn.q.f72901md, com.thinkup.core.common.m0.n.dd.f69901dd);
        return mVarM != null ? d(mVarM.dnd(), strD) : strD;
    }

    public static String q() {
        com.thinkup.core.q.m mVarM = com.thinkup.core.q.o.d(com.thinkup.core.common.o.nd.m().dd()).m(com.thinkup.core.common.o.nd.m().mo());
        String strD = com.thinkup.core.common.dd.n.d().d(dm() ? com.thinkup.core.common.o.dn.q.f72924qn : com.thinkup.core.common.o.dn.q.f72898dq, com.thinkup.core.common.m0.n.dd.f69902dm);
        return mVarM != null ? d(mVarM.do0(), strD) : strD;
    }

    public static dn d() {
        if (f68732d == null) {
            synchronized (dn.class) {
                try {
                    if (f68732d == null) {
                        f68732d = new dn();
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        return f68732d;
    }

    public static String m() {
        return dm() ? com.thinkup.core.common.o.dn.q.d00 : com.thinkup.core.common.o.dn.q.f72902mm;
    }

    public static String m(com.thinkup.core.q.m0 m0Var) {
        return m0Var.d0o();
    }

    private static String d(String str) {
        return str;
    }

    public static String d(com.thinkup.core.q.m0 m0Var, boolean z10) {
        if (z10) {
            String strDdn = m0Var.ddn();
            m0Var.mmd();
            if (!TextUtils.isEmpty(strDdn)) {
                return strDdn;
            }
        }
        d0o d0oVarNo = com.thinkup.core.q.o.d(com.thinkup.core.common.o.nd.m().dd()).m(com.thinkup.core.common.o.nd.m().mo()).no();
        String strD = com.thinkup.core.common.dd.n.d().d(dm() ? com.thinkup.core.common.o.dn.q.d0d : com.thinkup.core.common.o.dn.q.f72903mn, "bid");
        return d0oVarNo != null ? d(d0oVarNo.n(), strD) : strD;
    }

    public static String d(com.thinkup.core.q.m0 m0Var) {
        String strD0q = m0Var.d0q();
        return TextUtils.isEmpty(strD0q) ? "" : strD0q;
    }

    private static String d(String str, String str2) {
        return TextUtils.isEmpty(str) ? str2 : str;
    }
}