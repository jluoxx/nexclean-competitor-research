package com.thinkup.core.common.dd;

import android.app.Activity;
import android.content.Context;
import android.text.TextUtils;
import com.thinkup.core.api.AdError;
import com.thinkup.core.api.TUOsDmEntity;
import com.thinkup.core.api.TUSDK;
import com.thinkup.core.common.nm.d0;
import com.thinkup.core.common.nn.Cdo;
import com.thinkup.core.common.nn.m.q;
import com.thinkup.core.common.nn.mo;
import com.thinkup.core.common.nn.q0;
import com.thinkup.core.common.o.dn;
import com.thinkup.core.common.o.n0;
import com.thinkup.core.common.o.nd;
import com.thinkup.core.common.o.nm;
import java.net.URL;
import java.util.ArrayDeque;
import java.util.Locale;
import java.util.Objects;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes7.dex */
public class n {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final long f67831d = 1800000;

    /* JADX INFO: renamed from: d0, reason: collision with root package name */
    private static final String f67832d0 = Cdo.m(dn.dd.m.f72667q);

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private static final String f67833m = "DomainManager";

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static final String f67834n = "thinkup_sdk";

    /* JADX INFO: renamed from: nq, reason: collision with root package name */
    private static volatile n f67835nq = null;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private static final String f67836o = "ru";

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private static final String f67837q = "api.";

    /* JADX INFO: renamed from: dn, reason: collision with root package name */
    private volatile boolean f67840dn;

    /* JADX INFO: renamed from: do, reason: not valid java name */
    private volatile boolean f86do;

    /* JADX INFO: renamed from: dq, reason: collision with root package name */
    private volatile long f67841dq;

    /* JADX INFO: renamed from: mo, reason: collision with root package name */
    private ArrayDeque<d> f67846mo;

    /* JADX INFO: renamed from: mq, reason: collision with root package name */
    private String f67847mq;

    /* JADX INFO: renamed from: n0, reason: collision with root package name */
    private String f67848n0;

    /* JADX INFO: renamed from: nd, reason: collision with root package name */
    private String f67849nd;

    /* JADX INFO: renamed from: nm, reason: collision with root package name */
    private String f67850nm;

    /* JADX INFO: renamed from: nn, reason: collision with root package name */
    private int f67851nn;

    /* JADX INFO: renamed from: no, reason: collision with root package name */
    private int f67852no;

    /* JADX INFO: renamed from: dd, reason: collision with root package name */
    private final Object f67838dd = new Object();

    /* JADX INFO: renamed from: dm, reason: collision with root package name */
    private final Object f67839dm = new Object();

    /* JADX INFO: renamed from: m0, reason: collision with root package name */
    private volatile String f67842m0 = "";

    /* JADX INFO: renamed from: md, reason: collision with root package name */
    private volatile String f67843md = "";

    /* JADX INFO: renamed from: mm, reason: collision with root package name */
    private volatile String f67844mm = "";

    /* JADX INFO: renamed from: mn, reason: collision with root package name */
    private volatile String f67845mn = "";

    public static class d {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private o f67862d;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        private boolean f67863m;

        public d(o oVar, boolean z10) {
            this.f67862d = oVar;
            this.f67863m = z10;
        }

        public final o d() {
            return this.f67862d;
        }

        public final boolean m() {
            return this.f67863m;
        }
    }

    /* JADX INFO: renamed from: com.thinkup.core.common.dd.n$n, reason: collision with other inner class name */
    public interface InterfaceC0838n {
        void d(int i10, Object obj, Object obj2, long j10);

        void d(int i10, String str, AdError adError, long j10);

        void d(String str, String str2);

        void m(String str, String str2);
    }

    private n() {
    }

    private String d(String str, boolean z10) {
        if (TextUtils.isEmpty(str)) {
            return z10 ? this.f67842m0 : this.f67843md;
        }
        n0 n0VarN = nd.m().n();
        if (n0VarN == null || n0VarN.getOsDmEntity() == null) {
            return "";
        }
        TUOsDmEntity osDmEntity = n0VarN.getOsDmEntity();
        str.getClass();
        switch (str) {
            case "smart_wf":
                return osDmEntity.getSmartWFDm();
            case "bid":
                return osDmEntity.getBidDm();
            case "agent":
                return osDmEntity.getDaDm();
            case "tracking":
                return osDmEntity.getTkDm();
            default:
                return "";
        }
    }

    private static String d0(String str) {
        if (TextUtils.isEmpty(str)) {
            return "";
        }
        int iLastIndexOf = str.lastIndexOf(58);
        return iLastIndexOf < 0 ? str : str.substring(0, iLastIndexOf);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int dd(String str) {
        if (TextUtils.isEmpty(str)) {
            return 0;
        }
        int iLastIndexOf = str.lastIndexOf(58);
        if (iLastIndexOf < 0) {
            return dn.dd.m.f72660d;
        }
        try {
            int i10 = Integer.parseInt(str.substring(iLastIndexOf + 1).trim());
            return (i10 <= 0 || i10 > 65535) ? dn.dd.m.f72660d : i10;
        } catch (NumberFormatException unused) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int dm(String str) {
        int iLastIndexOf;
        if (!TextUtils.isEmpty(str) && (iLastIndexOf = str.lastIndexOf(58)) >= 0 && iLastIndexOf != str.length() - 1) {
            try {
                int i10 = Integer.parseInt(str.substring(iLastIndexOf + 1).trim());
                if (i10 > 0 && i10 <= 65535) {
                    return i10;
                }
            } catch (NumberFormatException unused) {
            }
        }
        return 0;
    }

    private String dn(Context context) {
        String str = this.f67847mq;
        return TextUtils.isEmpty(str) ? q0.n(context, "thinkup_sdk", nm.d.d0m, "") : str;
    }

    /* JADX INFO: renamed from: do, reason: not valid java name */
    private String m210do(Context context) {
        String str = this.f67848n0;
        return TextUtils.isEmpty(str) ? q0.n(context, "thinkup_sdk", nm.d.d0n, "") : str;
    }

    private String dq(Context context) {
        String str = this.f67849nd;
        return TextUtils.isEmpty(str) ? q0.n(context, "thinkup_sdk", nm.d.d0o, "") : str;
    }

    public static String m(String str, String str2) {
        if (TextUtils.isEmpty(str2)) {
            return str;
        }
        try {
            String host = new URL(str).getHost();
            return !str2.equals(host) ? str.replace(host, str2) : str;
        } catch (Throwable unused) {
            return str;
        }
    }

    private d m0() {
        d dVarRemoveFirst;
        ArrayDeque<d> arrayDeque = this.f67846mo;
        if (arrayDeque == null || arrayDeque.isEmpty()) {
            return null;
        }
        synchronized (this.f67839dm) {
            dVarRemoveFirst = this.f67846mo.removeFirst();
        }
        return dVarRemoveFirst;
    }

    private int md(Context context) {
        int i10 = this.f67851nn;
        return i10 > 0 ? i10 : q0.m(context, "thinkup_sdk", nm.d.dd0, 0);
    }

    private void mm() {
        try {
            d dVarM0 = m0();
            if (dVarM0 != null) {
                o oVarD = dVarM0.d();
                dVarM0.m();
                Objects.toString(oVarD);
                if (oVarD != null) {
                    m(oVarD);
                }
            }
        } catch (Throwable unused) {
        }
    }

    public final String n(Context context) {
        String strN = this.f67849nd;
        if (TextUtils.isEmpty(strN)) {
            strN = q0.n(context, "thinkup_sdk", nm.d.d0o, "");
        }
        if (!TextUtils.isEmpty(strN)) {
            return strN;
        }
        n0 n0VarN = nd.m().n();
        if (n0VarN == null || n0VarN.getOsDmEntity() == null) {
            return dn.dd.m.f72661d0;
        }
        String strategyTcpDm = n0VarN.getOsDmEntity().getStrategyTcpDm();
        return !TextUtils.isEmpty(strategyTcpDm) ? strategyTcpDm : dn.dd.m.f72661d0;
    }

    public final String o(Context context) {
        String strN = this.f67850nm;
        if (TextUtils.isEmpty(strN)) {
            strN = q0.n(context, "thinkup_sdk", nm.d.d0q, "");
        }
        if (!TextUtils.isEmpty(strN)) {
            return strN;
        }
        n0 n0VarN = nd.m().n();
        if (n0VarN == null || n0VarN.getOsDmEntity() == null) {
            return dn.dd.m.f72662dd;
        }
        String strategyTcpBackupDm = n0VarN.getOsDmEntity().getStrategyTcpBackupDm();
        return !TextUtils.isEmpty(strategyTcpBackupDm) ? strategyTcpBackupDm : dn.dd.m.f72662dd;
    }

    public final int q(Context context) {
        int iM = this.f67851nn;
        if (iM <= 0) {
            iM = q0.m(context, "thinkup_sdk", nm.d.dd0, 0);
        }
        return iM > 0 ? iM : dn.dd.m.f72660d;
    }

    private static long md() {
        return f67831d;
    }

    private static String dn() {
        nd.m();
        return "tpn_cur_using_bk_domain_key";
    }

    /* JADX INFO: renamed from: do, reason: not valid java name */
    private static void m211do() {
    }

    private static void dq() {
    }

    private static void q(String str) {
        com.thinkup.core.q.o.d(nd.m().dd()).n(str);
    }

    public static String q() {
        return f67832d0;
    }

    private int mm(Context context) {
        int i10 = this.f67852no;
        return i10 > 0 ? i10 : q0.m(context, "thinkup_sdk", nm.d.ddd, 0);
    }

    public final int d0(Context context) {
        int iM = this.f67852no;
        if (iM <= 0) {
            iM = q0.m(context, "thinkup_sdk", nm.d.ddd, 0);
        }
        return iM > 0 ? iM : q(context);
    }

    public final String m() {
        if (TUSDK.isCnSDK()) {
            return d(true);
        }
        return this.f67842m0;
    }

    private String m0(Context context) {
        String str = this.f67850nm;
        return TextUtils.isEmpty(str) ? q0.n(context, "thinkup_sdk", nm.d.d0q, "") : str;
    }

    public final void m(Context context) {
        if (context == null) {
            return;
        }
        this.f67841dq = 0L;
        q0.d(context, "thinkup_sdk", nm.d.f73145qq);
    }

    public static class m implements InterfaceC0838n, o {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private boolean f67864d;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        private final InterfaceC0838n f67865m;

        public m(InterfaceC0838n interfaceC0838n) {
            this.f67865m = interfaceC0838n;
        }

        @Override // com.thinkup.core.common.dd.n.InterfaceC0838n
        public final void d(int i10, Object obj, Object obj2, long j10) {
            Object obj3;
            Object obj4;
            InterfaceC0838n interfaceC0838n = this.f67865m;
            if (interfaceC0838n != null) {
                obj3 = obj;
                obj4 = obj2;
                interfaceC0838n.d(i10, obj3, obj4, j10);
            } else {
                obj3 = obj;
                obj4 = obj2;
            }
            d(obj3 != null ? obj3.toString() : "", obj4 != null ? obj4.toString() : "");
        }

        @Override // com.thinkup.core.common.dd.n.InterfaceC0838n
        public final void m(String str, String str2) {
            InterfaceC0838n interfaceC0838n = this.f67865m;
            if (interfaceC0838n != null) {
                interfaceC0838n.m(str, str2);
            }
            d(str, str2);
        }

        @Override // com.thinkup.core.common.dd.n.InterfaceC0838n
        public final void d(int i10, String str, AdError adError, long j10) {
            InterfaceC0838n interfaceC0838n = this.f67865m;
            if (interfaceC0838n != null) {
                interfaceC0838n.d(i10, str, adError, j10);
            }
            d("", "");
        }

        @Override // com.thinkup.core.common.dd.n.InterfaceC0838n
        public final void d(String str, String str2) {
            InterfaceC0838n interfaceC0838n;
            if (this.f67864d || (interfaceC0838n = this.f67865m) == null) {
                return;
            }
            this.f67864d = true;
            interfaceC0838n.d(str, str2);
        }
    }

    private void m(final o oVar) {
        d(new InterfaceC0838n() { // from class: com.thinkup.core.common.dd.n.1
            @Override // com.thinkup.core.common.dd.n.InterfaceC0838n
            public final void d(String str, String str2) {
                o oVar2 = oVar;
                if (oVar2 != null) {
                    oVar2.d(str, str2);
                }
            }

            @Override // com.thinkup.core.common.dd.n.InterfaceC0838n
            public final void m(String str, String str2) {
            }

            @Override // com.thinkup.core.common.dd.n.InterfaceC0838n
            public final void d(int i10, String str, AdError adError, long j10) {
            }

            @Override // com.thinkup.core.common.dd.n.InterfaceC0838n
            public final void d(int i10, Object obj, Object obj2, long j10) {
            }
        });
    }

    public static /* synthetic */ String m(n nVar, Context context) {
        String str = nVar.f67847mq;
        return TextUtils.isEmpty(str) ? q0.n(context, "thinkup_sdk", nm.d.d0m, "") : str;
    }

    public static /* synthetic */ String m(String str) {
        if (TextUtils.isEmpty(str)) {
            return "";
        }
        int iLastIndexOf = str.lastIndexOf(58);
        return iLastIndexOf < 0 ? str : str.substring(0, iLastIndexOf);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Long dd(Context context) {
        long jM = this.f67841dq;
        if (jM == 0) {
            jM = q0.m(context, "thinkup_sdk", nm.d.f73145qq, 0L);
        }
        return Long.valueOf(jM);
    }

    public static /* synthetic */ void dd() {
    }

    private void dm(Context context) {
        long jCurrentTimeMillis = System.currentTimeMillis();
        this.f67841dq = jCurrentTimeMillis;
        q0.d(context, "thinkup_sdk", nm.d.f73145qq, jCurrentTimeMillis);
    }

    private static String dm() {
        nd.m();
        return "tpn_cur_using_domain_key";
    }

    public static boolean o() {
        String language;
        try {
            language = Locale.getDefault().getLanguage();
        } catch (Exception unused) {
            language = "";
        }
        return language.equalsIgnoreCase(f67836o);
    }

    public final String n() {
        if (TUSDK.isCnSDK()) {
            return d(false);
        }
        return this.f67843md;
    }

    private void n(String str, String str2) {
        if (!TextUtils.isEmpty(str)) {
            this.f67842m0 = str;
            Context contextDd = nd.m().dd();
            nd.m();
            q0.m(contextDd, "thinkup_sdk", "tpn_cur_using_domain_key", str);
        }
        if (TextUtils.isEmpty(str2)) {
            return;
        }
        this.f67843md = str2;
        Context contextDd2 = nd.m().dd();
        nd.m();
        q0.m(contextDd2, "thinkup_sdk", "tpn_cur_using_bk_domain_key", str2);
    }

    public static /* synthetic */ void o(n nVar) {
        try {
            d dVarM0 = nVar.m0();
            if (dVarM0 != null) {
                o oVarD = dVarM0.d();
                dVarM0.m();
                Objects.toString(oVarD);
                if (oVarD != null) {
                    nVar.m(oVarD);
                }
            }
        } catch (Throwable unused) {
        }
    }

    public static /* synthetic */ void o(n nVar, Context context) {
        long jCurrentTimeMillis = System.currentTimeMillis();
        nVar.f67841dq = jCurrentTimeMillis;
        q0.d(context, "thinkup_sdk", nm.d.f73145qq, jCurrentTimeMillis);
    }

    public static /* synthetic */ String n(n nVar, Context context) {
        String str = nVar.f67848n0;
        return TextUtils.isEmpty(str) ? q0.n(context, "thinkup_sdk", nm.d.d0n, "") : str;
    }

    public static n d() {
        if (f67835nq == null) {
            synchronized (n.class) {
                f67835nq = new n();
            }
        }
        return f67835nq;
    }

    public final void d(Context context) {
        if (TUSDK.isCnSDK()) {
            return;
        }
        if (context instanceof Activity) {
            context = context.getApplicationContext();
        }
        if (this.f67840dn) {
            return;
        }
        this.f67840dn = true;
        boolean zO = o();
        this.f67844mm = zO ? f67832d0 : dn.dd.d.f72654d;
        this.f67845mn = dn.dd.d.f72656m;
        n0 n0VarN = nd.m().n();
        if (n0VarN != null && n0VarN.getOsDmEntity() != null) {
            TUOsDmEntity osDmEntity = n0VarN.getOsDmEntity();
            String mainDm = osDmEntity.getMainDm();
            if (!TextUtils.isEmpty(mainDm)) {
                this.f67844mm = mainDm;
                String ruBpDm = osDmEntity.getRuBpDm();
                if (zO && !TextUtils.isEmpty(ruBpDm)) {
                    this.f67844mm = ruBpDm;
                }
            }
            String backupDm = osDmEntity.getBackupDm();
            if (!TextUtils.isEmpty(backupDm)) {
                this.f67845mn = backupDm;
            }
        }
        nd.m();
        String strN = q0.n(context, "thinkup_sdk", "tpn_cur_using_domain_key", "");
        if (!TextUtils.isEmpty(strN)) {
            this.f67844mm = strN;
        }
        nd.m();
        String strN2 = q0.n(context, "thinkup_sdk", "tpn_cur_using_bk_domain_key", "");
        if (!TextUtils.isEmpty(strN2)) {
            this.f67845mn = strN2;
        }
        n(this.f67844mm, this.f67845mn);
    }

    private static String d(boolean z10) {
        String strMn0;
        com.thinkup.core.q.m mVarD = com.thinkup.core.q.o.d();
        if (mVarD != null) {
            strMn0 = z10 ? mVarD.mn0() : mVarD.mnd();
        } else {
            strMn0 = "";
        }
        if (TextUtils.isEmpty(strMn0)) {
            return z10 ? dn.dd.d.f72654d : dn.dd.d.f72656m;
        }
        return strMn0;
    }

    public final String d(String str) {
        return d(str, "", true);
    }

    public final String d(String str, String str2) {
        return d(str, str2, true);
    }

    public final String d(String str, String str2, boolean z10) {
        return TUSDK.isCnSDK() ? str : m(str, d(str2, z10));
    }

    public final void d(String str, String str2, String str3, boolean z10, String str4) {
        String str5 = this.f67842m0;
        String str6 = this.f67843md;
        n(str, str2);
        if (z10) {
            com.thinkup.core.q.o.d(nd.m().dd()).n(str4);
        }
        d0.d(this.f67844mm, str, str3, String.valueOf(dd(nd.m().dd())), "", "", str5, "", "", "", "", 0, str2, str6);
    }

    private void d(String str, String str2, String str3, String str4, String str5) {
        d0.d(this.f67844mm, str, str5, String.valueOf(dd(nd.m().dd())), "", "", str3, "", "", "", "", 0, str2, str4);
    }

    private void d(boolean z10, String str, String str2, long j10, int i10) {
        d0.d(this.f67844mm, this.f67842m0, "", String.valueOf(this.f67841dq), "", "", "", "1", z10 ? "1" : "0", str, String.valueOf(j10), i10, str2, this.f67843md);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d(o oVar, boolean z10) {
        if (oVar == null) {
            return;
        }
        synchronized (this.f67839dm) {
            try {
                if (this.f67846mo == null) {
                    this.f67846mo = new ArrayDeque<>();
                }
                this.f67846mo.addLast(new d(oVar, z10));
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    private void d(Context context, String str, String str2) {
        if (!TextUtils.isEmpty(str)) {
            this.f67847mq = str;
            q0.m(context, "thinkup_sdk", nm.d.d0m, str);
        }
        if (TextUtils.isEmpty(str2)) {
            return;
        }
        this.f67848n0 = str2;
        q0.m(context, "thinkup_sdk", nm.d.d0n, str2);
    }

    private void d(Context context, String str, String str2, int i10, int i11) {
        if (!TextUtils.isEmpty(str)) {
            this.f67849nd = str;
            q0.m(context, "thinkup_sdk", nm.d.d0o, str);
        }
        if (!TextUtils.isEmpty(str2)) {
            this.f67850nm = str2;
            q0.m(context, "thinkup_sdk", nm.d.d0q, str2);
        }
        if (i10 > 0) {
            this.f67851nn = i10;
            q0.d(context, "thinkup_sdk", nm.d.dd0, i10);
        }
        if (i11 > 0) {
            this.f67852no = i11;
            q0.d(context, "thinkup_sdk", nm.d.ddd, i11);
        }
    }

    public final void d(o oVar) {
        m(oVar);
    }

    private void d(InterfaceC0838n interfaceC0838n) {
        String str = this.f67842m0;
        String str2 = this.f67843md;
        final Context contextDd = nd.m().dd();
        if (contextDd != null && !TUSDK.isCnSDK() && mo.d(contextDd)) {
            final m mVar = new m(interfaceC0838n);
            if (this.f86do) {
                d((o) mVar, true);
                return;
            } else {
                com.thinkup.core.common.nn.m.n.d().d(new com.thinkup.core.common.nn.m.o(q.mnm, new Runnable() { // from class: com.thinkup.core.common.dd.n.2

                    /* JADX INFO: renamed from: m, reason: collision with root package name */
                    final /* synthetic */ boolean f67856m = true;

                    @Override // java.lang.Runnable
                    public final void run() {
                        synchronized (n.this.f67838dd) {
                            try {
                                boolean z10 = n.this.f86do;
                                n nVar = n.this;
                                if (z10) {
                                    nVar.d(mVar, this.f67856m);
                                    return;
                                }
                                nVar.f86do = true;
                                n nVar2 = n.this;
                                nVar2.f67841dq = nVar2.dd(contextDd).longValue();
                                final long jCurrentTimeMillis = System.currentTimeMillis();
                                long j10 = jCurrentTimeMillis - n.this.f67841dq;
                                long unused = n.f67831d;
                                if (n.this.f67841dq <= 0 || j10 >= n.f67831d) {
                                    String unused2 = n.this.f67842m0;
                                    n.dd();
                                    com.thinkup.core.q.d dVar = new com.thinkup.core.q.d(com.thinkup.core.q.o.d());
                                    final int iD = dVar.d();
                                    dVar.d(new com.thinkup.core.common.m0.n() { // from class: com.thinkup.core.common.dd.n.2.1
                                        @Override // com.thinkup.core.common.m0.nd
                                        public final void onLoadError(int i10, String str3, AdError adError) {
                                            n.this.f86do = false;
                                            n.d(n.this, false, str3, "", System.currentTimeMillis() - jCurrentTimeMillis, iD);
                                            mVar.d(-1, str3, (AdError) null, jCurrentTimeMillis);
                                            n.o(n.this);
                                        }

                                        /* JADX WARN: Code duplicated, block: B:41:0x00d4  */
                                        /* JADX WARN: Code duplicated, block: B:42:0x00e9  */
                                        @Override // com.thinkup.core.common.m0.nd
                                        public final void onLoadFinish(int i10, Object obj) {
                                            String strOptString;
                                            String strOptString2;
                                            String strM;
                                            String strM2;
                                            int i11;
                                            String str3;
                                            int i12;
                                            int i13;
                                            String str4;
                                            String str5;
                                            String str6;
                                            String str7;
                                            long jCurrentTimeMillis2;
                                            boolean zIsEmpty;
                                            AnonymousClass2 anonymousClass2;
                                            String strConcat;
                                            int i14 = 0;
                                            n.this.f86do = false;
                                            try {
                                                if ((obj instanceof String) && !TextUtils.isEmpty(obj.toString())) {
                                                    JSONObject jSONObject = new JSONObject(obj.toString());
                                                    int iOptInt = jSONObject.optInt("code", 0);
                                                    if (iOptInt == 0) {
                                                        strOptString = jSONObject.optString("data");
                                                        try {
                                                            strOptString2 = jSONObject.optString("data_bck");
                                                            try {
                                                                String strOptString3 = jSONObject.optString("data_tcp");
                                                                String strOptString4 = jSONObject.optString("data_tcp_bck");
                                                                strM = n.m(strOptString3);
                                                                try {
                                                                    strM2 = n.m(strOptString4);
                                                                    try {
                                                                        int iDd = n.dd(strOptString3);
                                                                        try {
                                                                            int iDm = n.dm(strOptString4);
                                                                            i14 = iDm > 0 ? iDm : iDd;
                                                                            AnonymousClass2 anonymousClass3 = AnonymousClass2.this;
                                                                            n.o(n.this, contextDd);
                                                                            i13 = i14;
                                                                            str3 = "";
                                                                            str4 = strOptString;
                                                                            str5 = strOptString2;
                                                                            str6 = strM;
                                                                            str7 = strM2;
                                                                            i12 = iDd;
                                                                        } catch (Throwable th2) {
                                                                            th = th2;
                                                                            i11 = i14;
                                                                            i14 = iDd;
                                                                            str3 = "parse cdn domain error: " + th.getMessage();
                                                                            i12 = i14;
                                                                            i13 = i11;
                                                                            str4 = strOptString;
                                                                            str5 = strOptString2;
                                                                            str6 = strM;
                                                                            str7 = strM2;
                                                                        }
                                                                    } catch (Throwable th3) {
                                                                        th = th3;
                                                                        i11 = 0;
                                                                        str3 = "parse cdn domain error: " + th.getMessage();
                                                                        i12 = i14;
                                                                        i13 = i11;
                                                                        str4 = strOptString;
                                                                        str5 = strOptString2;
                                                                        str6 = strM;
                                                                        str7 = strM2;
                                                                        AnonymousClass2 anonymousClass4 = AnonymousClass2.this;
                                                                        n.d(n.this, contextDd, str4, str5);
                                                                        AnonymousClass2 anonymousClass5 = AnonymousClass2.this;
                                                                        n.d(n.this, contextDd, str6, str7, i12, i13);
                                                                        jCurrentTimeMillis2 = System.currentTimeMillis() - jCurrentTimeMillis;
                                                                        zIsEmpty = TextUtils.isEmpty(str3);
                                                                        anonymousClass2 = AnonymousClass2.this;
                                                                        if (zIsEmpty) {
                                                                            n.d(n.this, true, str4, str5, jCurrentTimeMillis2, iD);
                                                                            mVar.d(0, str4, str5, jCurrentTimeMillis);
                                                                        } else {
                                                                            n.d(n.this, false, str3, "", jCurrentTimeMillis2, iD);
                                                                            mVar.d(0, str3, (AdError) null, jCurrentTimeMillis);
                                                                        }
                                                                        n.o(n.this);
                                                                    }
                                                                } catch (Throwable th4) {
                                                                    th = th4;
                                                                    strM2 = "";
                                                                }
                                                            } catch (Throwable th5) {
                                                                th = th5;
                                                                strM = "";
                                                                strM2 = strM;
                                                                i11 = 0;
                                                                str3 = "parse cdn domain error: " + th.getMessage();
                                                                i12 = i14;
                                                                i13 = i11;
                                                                str4 = strOptString;
                                                                str5 = strOptString2;
                                                                str6 = strM;
                                                                str7 = strM2;
                                                                AnonymousClass2 anonymousClass6 = AnonymousClass2.this;
                                                                n.d(n.this, contextDd, str4, str5);
                                                                AnonymousClass2 anonymousClass7 = AnonymousClass2.this;
                                                                n.d(n.this, contextDd, str6, str7, i12, i13);
                                                                jCurrentTimeMillis2 = System.currentTimeMillis() - jCurrentTimeMillis;
                                                                zIsEmpty = TextUtils.isEmpty(str3);
                                                                anonymousClass2 = AnonymousClass2.this;
                                                                if (zIsEmpty) {
                                                                    n.d(n.this, true, str4, str5, jCurrentTimeMillis2, iD);
                                                                    mVar.d(0, str4, str5, jCurrentTimeMillis);
                                                                } else {
                                                                    n.d(n.this, false, str3, "", jCurrentTimeMillis2, iD);
                                                                    mVar.d(0, str3, (AdError) null, jCurrentTimeMillis);
                                                                }
                                                                n.o(n.this);
                                                            }
                                                        } catch (Throwable th6) {
                                                            th = th6;
                                                            strOptString2 = "";
                                                            strM = strOptString2;
                                                            strM2 = strM;
                                                            i11 = 0;
                                                            str3 = "parse cdn domain error: " + th.getMessage();
                                                            i12 = i14;
                                                            i13 = i11;
                                                            str4 = strOptString;
                                                            str5 = strOptString2;
                                                            str6 = strM;
                                                            str7 = strM2;
                                                            AnonymousClass2 anonymousClass8 = AnonymousClass2.this;
                                                            n.d(n.this, contextDd, str4, str5);
                                                            AnonymousClass2 anonymousClass9 = AnonymousClass2.this;
                                                            n.d(n.this, contextDd, str6, str7, i12, i13);
                                                            jCurrentTimeMillis2 = System.currentTimeMillis() - jCurrentTimeMillis;
                                                            zIsEmpty = TextUtils.isEmpty(str3);
                                                            anonymousClass2 = AnonymousClass2.this;
                                                            if (zIsEmpty) {
                                                                n.d(n.this, true, str4, str5, jCurrentTimeMillis2, iD);
                                                                mVar.d(0, str4, str5, jCurrentTimeMillis);
                                                            } else {
                                                                n.d(n.this, false, str3, "", jCurrentTimeMillis2, iD);
                                                                mVar.d(0, str3, (AdError) null, jCurrentTimeMillis);
                                                            }
                                                            n.o(n.this);
                                                        }
                                                    } else {
                                                        strConcat = "request failed. error code: ".concat(String.valueOf(iOptInt));
                                                    }
                                                    AnonymousClass2 anonymousClass10 = AnonymousClass2.this;
                                                    n.d(n.this, contextDd, str4, str5);
                                                    AnonymousClass2 anonymousClass11 = AnonymousClass2.this;
                                                    n.d(n.this, contextDd, str6, str7, i12, i13);
                                                    jCurrentTimeMillis2 = System.currentTimeMillis() - jCurrentTimeMillis;
                                                    zIsEmpty = TextUtils.isEmpty(str3);
                                                    anonymousClass2 = AnonymousClass2.this;
                                                    if (zIsEmpty) {
                                                        n.d(n.this, true, str4, str5, jCurrentTimeMillis2, iD);
                                                        mVar.d(0, str4, str5, jCurrentTimeMillis);
                                                    } else {
                                                        n.d(n.this, false, str3, "", jCurrentTimeMillis2, iD);
                                                        mVar.d(0, str3, (AdError) null, jCurrentTimeMillis);
                                                    }
                                                    n.o(n.this);
                                                }
                                                strConcat = "";
                                                str3 = strConcat;
                                                i12 = 0;
                                                i13 = 0;
                                                str4 = "";
                                                str5 = str4;
                                                str6 = str5;
                                                str7 = str6;
                                            } catch (Throwable th7) {
                                                th = th7;
                                                strOptString = "";
                                                strOptString2 = strOptString;
                                            }
                                            AnonymousClass2 anonymousClass12 = AnonymousClass2.this;
                                            n.d(n.this, contextDd, str4, str5);
                                            AnonymousClass2 anonymousClass13 = AnonymousClass2.this;
                                            n.d(n.this, contextDd, str6, str7, i12, i13);
                                            jCurrentTimeMillis2 = System.currentTimeMillis() - jCurrentTimeMillis;
                                            zIsEmpty = TextUtils.isEmpty(str3);
                                            anonymousClass2 = AnonymousClass2.this;
                                            if (zIsEmpty) {
                                                n.d(n.this, true, str4, str5, jCurrentTimeMillis2, iD);
                                                mVar.d(0, str4, str5, jCurrentTimeMillis);
                                            } else {
                                                n.d(n.this, false, str3, "", jCurrentTimeMillis2, iD);
                                                mVar.d(0, str3, (AdError) null, jCurrentTimeMillis);
                                            }
                                            n.o(n.this);
                                        }
                                    });
                                    return;
                                }
                                String strM = n.m(n.this, contextDd);
                                String strN = n.n(n.this, contextDd);
                                n.dd();
                                n.this.f86do = false;
                                mVar.m(strM, strN);
                                n.o(n.this);
                            } catch (Throwable th2) {
                                throw th2;
                            }
                        }
                    }
                }));
                return;
            }
        }
        interfaceC0838n.d(str, str2);
    }

    public static /* synthetic */ void d(n nVar, Context context, String str, String str2) {
        if (!TextUtils.isEmpty(str)) {
            nVar.f67847mq = str;
            q0.m(context, "thinkup_sdk", nm.d.d0m, str);
        }
        if (TextUtils.isEmpty(str2)) {
            return;
        }
        nVar.f67848n0 = str2;
        q0.m(context, "thinkup_sdk", nm.d.d0n, str2);
    }

    public static /* synthetic */ void d(n nVar, Context context, String str, String str2, int i10, int i11) {
        if (!TextUtils.isEmpty(str)) {
            nVar.f67849nd = str;
            q0.m(context, "thinkup_sdk", nm.d.d0o, str);
        }
        if (!TextUtils.isEmpty(str2)) {
            nVar.f67850nm = str2;
            q0.m(context, "thinkup_sdk", nm.d.d0q, str2);
        }
        if (i10 > 0) {
            nVar.f67851nn = i10;
            q0.d(context, "thinkup_sdk", nm.d.dd0, i10);
        }
        if (i11 > 0) {
            nVar.f67852no = i11;
            q0.d(context, "thinkup_sdk", nm.d.ddd, i11);
        }
    }

    public static /* synthetic */ void d(n nVar, boolean z10, String str, String str2, long j10, int i10) {
        d0.d(nVar.f67844mm, nVar.f67842m0, "", String.valueOf(nVar.f67841dq), "", "", "", "1", z10 ? "1" : "0", str, String.valueOf(j10), i10, str2, nVar.f67843md);
    }
}