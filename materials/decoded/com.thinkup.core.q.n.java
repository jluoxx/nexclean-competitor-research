package com.thinkup.core.q;

import android.content.Context;
import android.text.TextUtils;
import com.thinkup.core.api.AdError;
import com.thinkup.core.api.ErrorCode;
import com.thinkup.core.api.TUSDK;
import com.thinkup.core.common.m0.q.Cdo;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes7.dex */
public class n {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final String f74074d = "n";

    /* JADX INFO: renamed from: com.thinkup.core.q.n$2, reason: invalid class name */
    public class AnonymousClass2 extends com.thinkup.core.common.m0.n {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ Cdo f74080d;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        final /* synthetic */ com.thinkup.core.common.m0.dd f74082m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        final /* synthetic */ com.thinkup.core.common.m0.nd f74083n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        final /* synthetic */ Context f74084o;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        final /* synthetic */ com.thinkup.core.common.dm.nm f74085q;

        public AnonymousClass2(Cdo cdo, com.thinkup.core.common.m0.dd ddVar, com.thinkup.core.common.m0.nd ndVar, Context context, com.thinkup.core.common.dm.nm nmVar) {
            this.f74080d = cdo;
            this.f74082m = ddVar;
            this.f74083n = ndVar;
            this.f74084o = context;
            this.f74085q = nmVar;
        }

        @Override // com.thinkup.core.common.m0.nd
        public final void onLoadError(int i10, String str, AdError adError) {
            if (this.f74080d.d()) {
                n.this.d(this.f74084o, this.f74085q, this.f74083n, true);
            }
        }

        @Override // com.thinkup.core.common.m0.nd
        public final void onLoadFinish(int i10, Object obj) {
            boolean z10 = obj instanceof JSONObject;
            Cdo cdo = this.f74080d;
            if (!z10) {
                if (cdo.d()) {
                    n.this.d(this.f74084o, this.f74085q, this.f74083n, true);
                }
            } else if (cdo.d()) {
                this.f74082m.d((JSONObject) obj);
                this.f74083n.onLoadFinish(i10, obj);
            }
        }
    }

    /* JADX INFO: renamed from: com.thinkup.core.q.n$3, reason: invalid class name */
    public class AnonymousClass3 implements Runnable {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ Cdo f74086d;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        final /* synthetic */ Context f74087m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        final /* synthetic */ com.thinkup.core.common.dm.nm f74088n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        final /* synthetic */ com.thinkup.core.common.m0.nd f74089o;

        public AnonymousClass3(Cdo cdo, Context context, com.thinkup.core.common.dm.nm nmVar, com.thinkup.core.common.m0.nd ndVar) {
            this.f74086d = cdo;
            this.f74087m = context;
            this.f74088n = nmVar;
            this.f74089o = ndVar;
        }

        @Override // java.lang.Runnable
        public final void run() {
            if (this.f74086d.d()) {
                n.this.d(this.f74087m, this.f74088n, this.f74089o, true);
            }
        }
    }

    public static void m(Context context, com.thinkup.core.common.dm.nm nmVar, com.thinkup.core.common.m0.nd ndVar) {
        if (context == null) {
            return;
        }
        new com.thinkup.core.common.m0.dq(context, nmVar).d(0, ndVar);
    }

    private void n(Context context, com.thinkup.core.common.dm.nm nmVar, com.thinkup.core.common.m0.nd ndVar) {
        com.thinkup.core.common.m0.dd ddVar = new com.thinkup.core.common.m0.dd(context, nmVar);
        String strNm = ddVar.nm();
        if (TextUtils.isEmpty(strNm)) {
            d(context, nmVar, ndVar, false);
            return;
        }
        Cdo cdo = new Cdo();
        m mVarD = o.d();
        long jMmn = mVarD != null ? mVarD.mmn() : m.m(0L);
        new com.thinkup.core.common.m0.q.n(strNm).d(new AnonymousClass2(cdo, ddVar, ndVar, context, nmVar), jMmn);
        try {
            cdo.d(com.thinkup.core.common.nn.m.n.d().m(new com.thinkup.core.common.nn.m.o(com.thinkup.core.common.nn.m.q.f72098d, new AnonymousClass3(cdo, context, nmVar, ndVar)), jMmn));
        } catch (Throwable unused) {
        }
    }

    public final void d(Context context, com.thinkup.core.common.dm.nm nmVar, com.thinkup.core.common.m0.nd ndVar) {
        m mVarD;
        if (context == null) {
            return;
        }
        com.thinkup.core.common.o.nd.m().ddn();
        if (TUSDK.isCnSDK() || !((mVarD = o.d()) == null || mVarD.mmd())) {
            d(context, nmVar, ndVar, false);
            return;
        }
        com.thinkup.core.common.m0.dd ddVar = new com.thinkup.core.common.m0.dd(context, nmVar);
        String strNm = ddVar.nm();
        if (TextUtils.isEmpty(strNm)) {
            d(context, nmVar, ndVar, false);
            return;
        }
        Cdo cdo = new Cdo();
        m mVarD2 = o.d();
        long jMmn = mVarD2 != null ? mVarD2.mmn() : m.m(0L);
        new com.thinkup.core.common.m0.q.n(strNm).d(new AnonymousClass2(cdo, ddVar, ndVar, context, nmVar), jMmn);
        try {
            cdo.d(com.thinkup.core.common.nn.m.n.d().m(new com.thinkup.core.common.nn.m.o(com.thinkup.core.common.nn.m.q.f72098d, new AnonymousClass3(cdo, context, nmVar, ndVar)), jMmn));
        } catch (Throwable unused) {
        }
    }

    public static class d {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Context f74098d;

        /* JADX INFO: renamed from: d0, reason: collision with root package name */
        String f74099d0;

        /* JADX INFO: renamed from: dd, reason: collision with root package name */
        long f74100dd;

        /* JADX INFO: renamed from: dm, reason: collision with root package name */
        long f74101dm;

        /* JADX INFO: renamed from: dn, reason: collision with root package name */
        String f74102dn;

        /* JADX INFO: renamed from: do, reason: not valid java name */
        boolean f254do;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        com.thinkup.core.common.dm.nm f74103m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        String f74104n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        String f74105o;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        String f74106q;

        private d() {
        }

        public final String d(boolean z10) {
            return z10 ? this.f74106q : this.f74104n;
        }

        public final String m(boolean z10) {
            String str = this.f74099d0;
            if (z10) {
                return str;
            }
            return !TextUtils.isEmpty(str) ? this.f74099d0 : this.f74105o;
        }

        public /* synthetic */ d(byte b10) {
            this();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d(Context context, com.thinkup.core.common.dm.nm nmVar, com.thinkup.core.common.m0.nd ndVar, boolean z10) {
        m mVarM = o.d(com.thinkup.core.common.o.nd.m().dd()).m(com.thinkup.core.common.o.nd.m().mo());
        com.thinkup.core.common.dn.d();
        final String strD = com.thinkup.core.common.dn.d(true);
        com.thinkup.core.common.dn.d();
        byte b10 = 0;
        final String strD2 = com.thinkup.core.common.dn.d(false);
        long jMnm = mVarM != null ? mVarM.mnm() : 10000L;
        long jMno = mVarM != null ? mVarM.mno() : 10000L;
        long j10 = jMnm;
        final d dVar = new d(b10);
        dVar.f74098d = context;
        dVar.f74103m = nmVar;
        dVar.f74104n = strD;
        dVar.f74105o = strD2;
        dVar.f74100dd = j10;
        dVar.f74101dm = jMno;
        dVar.f254do = z10;
        if (!TUSDK.isCnSDK()) {
            final com.thinkup.core.common.m0.mo moVar = new com.thinkup.core.common.m0.mo(ndVar);
            d(false, dVar, (com.thinkup.core.common.m0.nd) moVar);
            com.thinkup.core.common.dd.n.d().d(new com.thinkup.core.common.dd.o() { // from class: com.thinkup.core.q.n.1
                @Override // com.thinkup.core.common.dd.o
                public final void d(String str, String str2) {
                    String str3;
                    String str4;
                    moVar.m();
                    String strQ = com.thinkup.core.common.nn.mo.q(strD);
                    String strQ2 = com.thinkup.core.common.nn.mo.q(strD2);
                    boolean z11 = false;
                    boolean z12 = (TextUtils.isEmpty(str) || str.equals(strQ)) ? false : true;
                    if (!TextUtils.isEmpty(str2) && !str2.equals(strQ2)) {
                        z11 = true;
                    }
                    if (z12 || z11) {
                        str3 = str;
                        str4 = str2;
                        com.thinkup.core.common.dd.n.d().d(str3, str4, strD, false, "");
                    } else {
                        str3 = str;
                        str4 = str2;
                    }
                    com.thinkup.core.common.dd.n.d();
                    dVar.f74099d0 = com.thinkup.core.common.dd.n.m(strD2, str4);
                    if (!z12) {
                        moVar.d();
                        return;
                    }
                    com.thinkup.core.common.dd.n.d();
                    String strM = com.thinkup.core.common.dd.n.m(strD, str3);
                    d dVar2 = dVar;
                    dVar2.f74106q = strM;
                    n.this.d(true, dVar2, (com.thinkup.core.common.m0.nd) moVar);
                }
            });
            return;
        }
        d(false, dVar, ndVar);
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
        final String strD0 = dVar.f74103m.d0();
        final String strD = dVar.d(z10);
        final String strM = dVar.m(z10);
        new com.thinkup.core.q.d.d(z10, ndVar) { // from class: com.thinkup.core.q.n.4
            @Override // com.thinkup.core.q.d.d
            public final void d(int i10, com.thinkup.core.common.m0.mo moVar) {
                boolean z11 = i10 == 0;
                String str = z11 ? strD : strM;
                d dVar2 = dVar;
                new com.thinkup.core.common.m0.dd(dVar2.f74098d, dVar2.f74103m).m(str).m(z10).d(dVar.f254do).d(i10, (com.thinkup.core.common.m0.nd) moVar);
                com.thinkup.core.common.nm.d0.d(strD0, z11 ? 1 : 2, str, 1, dn(), m310do(), z10, dVar.f74103m.d());
            }

            @Override // com.thinkup.core.q.d.d
            public final void d0() {
                com.thinkup.core.common.nm.d0.d(strD0, 0, "", 4, dn(), m310do(), z10, dVar.f74103m.d());
                if (ndVar != null) {
                    String str = "request timeout for main(backup) strategy (" + dVar.f74100dd + "/" + dVar.f74101dm + ")";
                    ndVar.onLoadError(0, str, ErrorCode.getErrorCode(ErrorCode.exception, "", str));
                }
            }

            @Override // com.thinkup.core.q.d.d
            public final void m(int i10, Object obj) {
                o.d(dVar.f74098d).d(dVar.f74098d, obj, com.thinkup.core.common.o.nd.m().mo());
            }

            @Override // com.thinkup.core.q.d.d
            public final boolean n() {
                if (TextUtils.equals(strM, dVar.f74102dn)) {
                    return false;
                }
                dVar.f74102dn = strM;
                return true;
            }

            @Override // com.thinkup.core.q.d.d
            public final long o() {
                return dVar.f74100dd;
            }

            @Override // com.thinkup.core.q.d.d
            public final long q() {
                return dVar.f74101dm;
            }

            @Override // com.thinkup.core.q.d.d
            public final void d(boolean z11, int i10) {
                boolean z12 = i10 == 0;
                com.thinkup.core.common.nm.d0.d(strD0, z12 ? 1 : 2, z12 ? strD : strM, z11 ? 2 : 3, dn(), m310do(), z10, dVar.f74103m.d());
            }
        }.dd();
    }
}