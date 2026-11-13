package com.thinkup.core.q;

import android.content.Context;
import android.text.TextUtils;
import com.thinkup.core.api.AdError;
import com.thinkup.core.api.ErrorCode;
import com.thinkup.core.api.TUSDK;
import com.thinkup.core.common.dm.doq;
import com.thinkup.core.common.m0.q.Cdo;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes7.dex */
public class mn {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final String f74022d = "mn";

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private mm f74023m;

    public mn(mm mmVar) {
        this.f74023m = mmVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d(Context context, doq doqVar, com.thinkup.core.common.m0.nd ndVar, boolean z10) {
        m mVarM = o.d(com.thinkup.core.common.o.nd.m().dd()).m(com.thinkup.core.common.o.nd.m().mo());
        byte b10 = 0;
        if (mVarM != null && !TextUtils.isEmpty(mVarM.m00())) {
            new com.thinkup.core.common.m0.nn(context, doqVar).m(mVarM.m00()).d(z10).d(0, ndVar);
            return;
        }
        com.thinkup.core.common.dn.d();
        final String strM = com.thinkup.core.common.dn.m(true);
        com.thinkup.core.common.dn.d();
        final String strM2 = com.thinkup.core.common.dn.m(false);
        long jMnm = mVarM != null ? mVarM.mnm() : 10000L;
        long jMno = mVarM != null ? mVarM.mno() : 10000L;
        final d dVar = new d(b10);
        dVar.f74049d = context;
        dVar.f74054m = doqVar;
        dVar.f74055n = strM;
        dVar.f74056o = strM2;
        dVar.f74051dd = jMnm;
        dVar.f74052dm = jMno;
        dVar.f253do = z10;
        if (TUSDK.isCnSDK()) {
            d(false, dVar, ndVar);
            return;
        }
        final com.thinkup.core.common.m0.mo moVar = new com.thinkup.core.common.m0.mo(ndVar);
        d(false, dVar, (com.thinkup.core.common.m0.nd) moVar);
        com.thinkup.core.common.dd.n.d().d(new com.thinkup.core.common.dd.o() { // from class: com.thinkup.core.q.mn.2
            @Override // com.thinkup.core.common.dd.o
            public final void d(String str, String str2) {
                String str3;
                String str4;
                moVar.m();
                String strQ = com.thinkup.core.common.nn.mo.q(strM);
                String strQ2 = com.thinkup.core.common.nn.mo.q(strM2);
                boolean z11 = false;
                boolean z12 = (TextUtils.isEmpty(str) || str.equals(strQ)) ? false : true;
                if (!TextUtils.isEmpty(str2) && !str2.equals(strQ2)) {
                    z11 = true;
                }
                if (z12 || z11) {
                    str3 = str;
                    str4 = str2;
                    com.thinkup.core.common.dd.n.d().d(str3, str4, strM, z12, dVar.f74054m.dq());
                } else {
                    str3 = str;
                    str4 = str2;
                }
                com.thinkup.core.common.dd.n.d();
                dVar.f74050d0 = com.thinkup.core.common.dd.n.m(strM2, str4);
                if (!z12) {
                    moVar.d();
                    return;
                }
                com.thinkup.core.common.dd.n.d();
                String strM3 = com.thinkup.core.common.dd.n.m(strM, str3);
                d dVar2 = dVar;
                dVar2.f74057q = strM3;
                mn.this.d(true, dVar2, (com.thinkup.core.common.m0.nd) moVar);
            }
        });
    }

    private void m(final Context context, final doq doqVar, final com.thinkup.core.common.m0.nd ndVar) {
        final com.thinkup.core.common.m0.nn nnVar = new com.thinkup.core.common.m0.nn(context, doqVar);
        String strNm = nnVar.nm();
        if (TextUtils.isEmpty(strNm)) {
            d(context, doqVar, ndVar, false);
            return;
        }
        final Cdo cdo = new Cdo();
        m mVarD = o.d();
        long jMmn = mVarD != null ? mVarD.mmn() : m.m(0L);
        new com.thinkup.core.common.m0.q.dd(strNm).d(new com.thinkup.core.common.m0.n() { // from class: com.thinkup.core.q.mn.3
            @Override // com.thinkup.core.common.m0.nd
            public final void onLoadError(int i10, String str, AdError adError) {
                if (cdo.d()) {
                    mn.this.d(context, doqVar, ndVar, true);
                }
            }

            @Override // com.thinkup.core.common.m0.nd
            public final void onLoadFinish(int i10, Object obj) {
                boolean z10 = obj instanceof JSONObject;
                Cdo cdo2 = cdo;
                if (!z10) {
                    if (cdo2.d()) {
                        mn.this.d(context, doqVar, ndVar, true);
                    }
                } else if (cdo2.d()) {
                    nnVar.d((JSONObject) obj);
                    ndVar.onLoadFinish(i10, obj);
                }
            }
        }, jMmn);
        try {
            cdo.d(com.thinkup.core.common.nn.m.n.d().m(new com.thinkup.core.common.nn.m.o(com.thinkup.core.common.nn.m.q.f72098d, new Runnable() { // from class: com.thinkup.core.q.mn.4
                @Override // java.lang.Runnable
                public final void run() {
                    if (cdo.d()) {
                        mn.this.d(context, doqVar, ndVar, true);
                    }
                }
            }), jMmn));
        } catch (Throwable unused) {
        }
    }

    public static class d {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Context f74049d;

        /* JADX INFO: renamed from: d0, reason: collision with root package name */
        String f74050d0;

        /* JADX INFO: renamed from: dd, reason: collision with root package name */
        long f74051dd;

        /* JADX INFO: renamed from: dm, reason: collision with root package name */
        long f74052dm;

        /* JADX INFO: renamed from: dn, reason: collision with root package name */
        String f74053dn;

        /* JADX INFO: renamed from: do, reason: not valid java name */
        boolean f253do;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        doq f74054m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        String f74055n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        String f74056o;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        String f74057q;

        private d() {
        }

        public final String d(boolean z10) {
            return z10 ? this.f74057q : this.f74055n;
        }

        public final String m(boolean z10) {
            String str = this.f74050d0;
            if (z10) {
                return str;
            }
            return !TextUtils.isEmpty(str) ? this.f74050d0 : this.f74056o;
        }

        public /* synthetic */ d(byte b10) {
            this();
        }
    }

    public mn() {
    }

    public final void d(Context context, final doq doqVar) {
        if (doqVar == null) {
            return;
        }
        d(context, doqVar, new com.thinkup.core.common.m0.nd() { // from class: com.thinkup.core.q.mn.1
            @Override // com.thinkup.core.common.m0.nd
            public final void onLoadCanceled(int i10) {
            }

            @Override // com.thinkup.core.common.m0.nd
            public final void onLoadError(int i10, String str, AdError adError) {
            }

            @Override // com.thinkup.core.common.m0.nd
            public final void onLoadFinish(int i10, Object obj) {
                mn.d(mn.this, i10, obj, doqVar);
            }

            @Override // com.thinkup.core.common.m0.nd
            public final void onLoadStart(int i10) {
            }
        });
    }

    private void d(int i10, Object obj, doq doqVar) {
        m0 m0VarD;
        if (obj instanceof JSONObject) {
            JSONObject jSONObject = (JSONObject) obj;
            try {
                jSONObject.put(m0.d.dnd, System.currentTimeMillis());
                jSONObject.put("strategy_domain_type_key", i10 == 1 ? 1 : 0);
                int iOptInt = jSONObject.optInt(m0.d.m0m, 0);
                mm mmVar = this.f74023m;
                if (mmVar != null && (m0VarD = mmVar.d(doqVar.o(), iOptInt)) != null) {
                    m0VarD.d(jSONObject, doqVar.o());
                }
            } catch (Throwable th2) {
                th2.getMessage();
            }
            m0 m0VarD2 = m0.d(doqVar.o(), jSONObject);
            mm mmVar2 = this.f74023m;
            if (mmVar2 == null || m0VarD2 == null) {
                return;
            }
            String strO = doqVar.o();
            if (m0VarD2.dqq() != 1) {
                jSONObject = null;
            }
            mmVar2.d(strO, m0VarD2, jSONObject, m0VarD2.moq());
        }
    }

    public final void d(Context context, doq doqVar, com.thinkup.core.common.m0.nd ndVar) {
        if (doqVar == null) {
            return;
        }
        com.thinkup.core.common.o.nd.m().ddn();
        if (d()) {
            m(context, doqVar, ndVar);
        } else {
            d(context, doqVar, ndVar, false);
        }
    }

    private static boolean d() {
        if (TUSDK.isCnSDK()) {
            return false;
        }
        m mVarD = o.d();
        return mVarD == null || mVarD.mmd();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d(final boolean z10, final d dVar, final com.thinkup.core.common.m0.nd ndVar) {
        final String strDq = dVar.f74054m.dq();
        final String strD = dVar.d(z10);
        final String strM = dVar.m(z10);
        new com.thinkup.core.q.d.d(z10, ndVar) { // from class: com.thinkup.core.q.mn.5
            @Override // com.thinkup.core.q.d.d
            public final void d(int i10, com.thinkup.core.common.m0.mo moVar) {
                boolean z11 = i10 == 0;
                String str = z11 ? strD : strM;
                d dVar2 = dVar;
                new com.thinkup.core.common.m0.nn(dVar2.f74049d, dVar2.f74054m).m(str).m(z10).d(dVar.f253do).d(i10, (com.thinkup.core.common.m0.nd) moVar);
                com.thinkup.core.common.nm.d0.d(strDq, z11 ? 1 : 2, str, 1, dn(), m310do(), z10, dVar.f74054m.o());
            }

            @Override // com.thinkup.core.q.d.d
            public final void d0() {
                com.thinkup.core.common.nm.d0.d(strDq, 0, "", 4, dn(), m310do(), z10, dVar.f74054m.o());
                if (ndVar != null) {
                    String str = "request timeout for main(backup) strategy (" + dVar.f74051dd + "/" + dVar.f74052dm + ")";
                    ndVar.onLoadError(0, str, ErrorCode.getErrorCode(ErrorCode.exception, "", str));
                }
            }

            @Override // com.thinkup.core.q.d.d
            public final void m(int i10, Object obj) {
                mn.d(mn.this, i10, obj, dVar.f74054m);
            }

            @Override // com.thinkup.core.q.d.d
            public final boolean n() {
                if (TextUtils.equals(strM, dVar.f74053dn)) {
                    return false;
                }
                dVar.f74053dn = strM;
                return true;
            }

            @Override // com.thinkup.core.q.d.d
            public final long o() {
                return dVar.f74051dd;
            }

            @Override // com.thinkup.core.q.d.d
            public final long q() {
                return dVar.f74052dm;
            }

            @Override // com.thinkup.core.q.d.d
            public final void d(boolean z11, int i10) {
                boolean z12 = i10 == 0;
                com.thinkup.core.common.nm.d0.d(strDq, z12 ? 1 : 2, z12 ? strD : strM, z11 ? 2 : 3, dn(), m310do(), z10, dVar.f74054m.o());
            }
        }.dd();
    }

    public static /* synthetic */ void d(mn mnVar, int i10, Object obj, doq doqVar) {
        m0 m0VarD;
        if (obj instanceof JSONObject) {
            JSONObject jSONObject = (JSONObject) obj;
            try {
                jSONObject.put(m0.d.dnd, System.currentTimeMillis());
                jSONObject.put("strategy_domain_type_key", i10 == 1 ? 1 : 0);
                int iOptInt = jSONObject.optInt(m0.d.m0m, 0);
                mm mmVar = mnVar.f74023m;
                if (mmVar != null && (m0VarD = mmVar.d(doqVar.o(), iOptInt)) != null) {
                    m0VarD.d(jSONObject, doqVar.o());
                }
            } catch (Throwable th2) {
                th2.getMessage();
            }
            m0 m0VarD2 = m0.d(doqVar.o(), jSONObject);
            mm mmVar2 = mnVar.f74023m;
            if (mmVar2 == null || m0VarD2 == null) {
                return;
            }
            String strO = doqVar.o();
            if (m0VarD2.dqq() != 1) {
                jSONObject = null;
            }
            mmVar2.d(strO, m0VarD2, jSONObject, m0VarD2.moq());
        }
    }
}