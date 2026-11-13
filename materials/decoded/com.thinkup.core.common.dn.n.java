package com.thinkup.core.common.dn;

import android.app.Activity;
import android.content.Context;
import android.text.TextUtils;
import com.android.quickstep.util.SplitAnimationTimings;
import com.android.systemui.shared.system.SysUiStatsLog;
import com.thinkup.core.api.NetTrafficeCallback;
import com.thinkup.core.api.TUGDPRAuthCallback;
import com.thinkup.core.api.TUGDPRConsentDismissListener;
import com.thinkup.core.api.TUSDK;
import com.thinkup.core.common.dn.o.AnonymousClass3;
import com.thinkup.core.common.nn.m.q;
import com.thinkup.core.common.o.nd;
import com.thinkup.core.common.o.nn;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes7.dex */
public class n {

    /* JADX INFO: renamed from: dn, reason: collision with root package name */
    private static final String f68745dn = "tpn_thinkup_ump";

    /* JADX INFO: renamed from: do, reason: not valid java name */
    private static volatile n f113do;

    /* JADX INFO: renamed from: dq, reason: collision with root package name */
    private Map<Integer, m> f68750dq;

    /* JADX INFO: renamed from: m0, reason: collision with root package name */
    private Map<Integer, m> f68752m0;

    /* JADX INFO: renamed from: mq, reason: collision with root package name */
    private List<Integer> f68757mq;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final int f68746d = -1;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    final int f68751m = 100;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    final int f68758n = 101;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    final int f68759o = 102;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    final int f68760q = 103;

    /* JADX INFO: renamed from: d0, reason: collision with root package name */
    final int f68747d0 = 104;

    /* JADX INFO: renamed from: dd, reason: collision with root package name */
    final int f68748dd = 105;

    /* JADX INFO: renamed from: dm, reason: collision with root package name */
    final int f68749dm = 106;

    /* JADX INFO: renamed from: mm, reason: collision with root package name */
    private String f68754mm = "";

    /* JADX INFO: renamed from: mn, reason: collision with root package name */
    private String f68755mn = "";

    /* JADX INFO: renamed from: mo, reason: collision with root package name */
    private String f68756mo = "";

    /* JADX INFO: renamed from: md, reason: collision with root package name */
    private boolean f68753md = false;

    private n() {
        HashMap map = new HashMap();
        this.f68750dq = map;
        map.put(2, new m(2, 755, 1));
        this.f68750dq.put(33, new m(33, 755, 1));
        this.f68750dq.put(6, new m(6, 867, 1));
        this.f68750dq.put(3, new m(3, SplitAnimationTimings.PHONE_CONFIRM_DURATION, 1));
        this.f68750dq.put(37, new m(37, SysUiStatsLog.LAUNCHER_SNAPSHOT, 1));
        this.f68750dq.put(13, new m(13, 667, 1));
        this.f68750dq.put(36, new m(36, 31, 1));
        this.f68750dq.put(58, new m(58, 512, 1));
        this.f68750dq.put(75, new m(75, 793, 1));
        this.f68750dq.put(1, new m(1, 89, 2));
        this.f68750dq.put(12, new m(12, 3234, 2));
        this.f68750dq.put(5, new m(5, 1301, 2));
        this.f68750dq.put(9, new m(9, 2898, 2));
        this.f68750dq.put(11, new m(11, 2878, 2));
        this.f68750dq.put(59, new m(59, 16831, 2));
        this.f68750dq.put(45, new m(45, 3183, 2));
        this.f68750dq.put(25, new m(25, 2312, 2));
        this.f68752m0 = new HashMap();
        this.f68757mq = new ArrayList();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void n(Context context) {
        String strD = d.d(context).d();
        if (TextUtils.isEmpty(strD) || strD.contains("1")) {
            nn.d(context).d(0);
        } else {
            nn.d(context).d(1);
        }
    }

    public final synchronized void d(Context context) {
        boolean zD;
        try {
            if (TextUtils.isEmpty(this.f68754mm)) {
                this.f68754mm = d.d(context).m();
                this.f68756mo = d.d(context).o();
                this.f68755mn = d.d(context).n();
            }
            m("IABTCF_TCString:" + this.f68754mm);
            m("IABTCF_VendorConsents:" + this.f68756mo);
            m("IABTCF_AddtlConsent:" + this.f68755mn);
            if (TextUtils.isEmpty(this.f68754mm)) {
                this.f68753md = true;
                return;
            }
            this.f68753md = false;
            this.f68752m0.clear();
            ArrayList arrayList = new ArrayList();
            if (!TextUtils.isEmpty(this.f68755mn)) {
                try {
                    String[] strArrSplit = this.f68755mn.split("~");
                    if (strArrSplit.length >= 2) {
                        for (String str : strArrSplit[1].split("\\.")) {
                            arrayList.add(Integer.valueOf(Integer.parseInt(str)));
                        }
                    }
                } catch (Throwable unused) {
                }
            }
            for (Map.Entry<Integer, m> entry : this.f68750dq.entrySet()) {
                Integer key = entry.getKey();
                m value = entry.getValue();
                int iN = value.n();
                if (iN != 1) {
                    if (iN == 2) {
                        zD = arrayList.size() == 0 ? false : arrayList.contains(Integer.valueOf(value.m()));
                    }
                    this.f68752m0.put(key, value);
                    m("initNetworkConsentMap " + value.d() + ":" + value.o());
                } else {
                    zD = d(this.f68756mo, value.m());
                }
                value.d(zD);
                this.f68752m0.put(key, value);
                m("initNetworkConsentMap " + value.d() + ":" + value.o());
            }
            n(context);
            StringBuilder sb2 = new StringBuilder("initNetworkConsentMap others:");
            sb2.append(nn.d(context).d() == 0);
            m(sb2.toString());
            this.f68753md = true;
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public final void m(final Activity activity, final TUGDPRConsentDismissListener tUGDPRConsentDismissListener, final String str) {
        boolean z10;
        nd.m();
        if (activity == null) {
            if (nd.m().qm()) {
                m("showGDPRConsentDialog fail:activity is null!");
            }
            d(tUGDPRConsentDismissListener, "activity is null!", -1);
            return;
        }
        final Context applicationContext = activity.getApplicationContext();
        try {
            o.d(applicationContext);
            z10 = true;
        } catch (Throwable unused) {
            z10 = false;
        }
        final boolean z11 = z10;
        if (nd.m().qm()) {
            m("Has UMP SDK:".concat(String.valueOf(z11)));
        }
        com.thinkup.core.common.nn.m.n.d().d(new com.thinkup.core.common.nn.m.o(q.dmm, new Runnable() { // from class: com.thinkup.core.common.dn.n.3
            @Override // java.lang.Runnable
            public final void run() {
                int iQ = nn.d(applicationContext).q();
                if (iQ == -100 || iQ == 1) {
                    nn.d(applicationContext).d(new nn.d() { // from class: com.thinkup.core.common.dn.n.3.1
                        @Override // com.thinkup.core.common.o.nn.d
                        public final void d(boolean z12, boolean z13) {
                            n.m("checkIsEuTraffic:onResultCallback:" + z12 + ":" + z13);
                            if (!z13) {
                                AnonymousClass3 anonymousClass3 = AnonymousClass3.this;
                                n.d(n.this, applicationContext, activity, z11, tUGDPRConsentDismissListener, str);
                                return;
                            }
                            AnonymousClass3 anonymousClass4 = AnonymousClass3.this;
                            if (z12) {
                                n.d(n.this, applicationContext, activity, z11, tUGDPRConsentDismissListener, str);
                            } else {
                                n.this.d(tUGDPRConsentDismissListener, "", 102);
                            }
                        }

                        @Override // com.thinkup.core.api.NetTrafficeCallback
                        public final void onErrorCallback(String str2) {
                            n.m("checkIsEuTraffic:onErrorCallback:".concat(String.valueOf(str2)));
                            AnonymousClass3 anonymousClass3 = AnonymousClass3.this;
                            n.d(n.this, applicationContext, activity, z11, tUGDPRConsentDismissListener, str);
                        }

                        @Override // com.thinkup.core.api.NetTrafficeCallback
                        public final void onResultCallback(boolean z12) {
                            n.m("checkIsEuTraffic:onResultCallback:".concat(String.valueOf(z12)));
                        }
                    }, str);
                } else {
                    n.d(n.this, applicationContext, activity, z11, tUGDPRConsentDismissListener, str);
                }
            }
        }));
    }

    /* JADX INFO: renamed from: com.thinkup.core.common.dn.n$4, reason: invalid class name */
    public class AnonymousClass4 implements o.d {
        public AnonymousClass4() {
        }

        @Override // com.thinkup.core.common.dn.o.d
        public final void d(boolean z10) {
            n.m("(UMP Update)UMP onConsentSuccess isRealTimeDialogDismiss:".concat(String.valueOf(z10)));
        }

        @Override // com.thinkup.core.common.dn.o.d
        public final void d(String str) {
            n.m("(UMP Update)UMP onConsentFail:".concat(String.valueOf(str)));
        }
    }

    public final String n() {
        return this.f68754mm;
    }

    /* JADX INFO: renamed from: com.thinkup.core.common.dn.n$2, reason: invalid class name */
    public class AnonymousClass2 implements o.d {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ Context f68768d;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        final /* synthetic */ TUGDPRConsentDismissListener f68769m;

        public AnonymousClass2(Context context, TUGDPRConsentDismissListener tUGDPRConsentDismissListener) {
            this.f68768d = context;
            this.f68769m = tUGDPRConsentDismissListener;
        }

        @Override // com.thinkup.core.common.dn.o.d
        public final void d(String str) {
            if (nd.m().qm()) {
                n.m("UMP onConsentFail:".concat(String.valueOf(str)));
            }
            if (!o.d(this.f68768d).m()) {
                n.this.d(this.f68769m, str, -1);
            } else {
                n.m("UMP canRequestAd:true after onConsentFail");
                n.this.d(this.f68769m, "", 106);
            }
        }

        @Override // com.thinkup.core.common.dn.o.d
        public final void d(boolean z10) {
            if (nd.m().qm()) {
                n.m("UMP onConsentSuccess isRealTimeDialogDismiss:".concat(String.valueOf(z10)));
            }
            if (z10) {
                n.n(this.f68768d);
            }
            n.this.d(this.f68769m, "", z10 ? 105 : 103);
        }
    }

    /* JADX INFO: renamed from: com.thinkup.core.common.dn.n$5, reason: invalid class name */
    public class AnonymousClass5 implements o.d {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ Context f68779d;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        final /* synthetic */ TUGDPRConsentDismissListener f68780m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        final /* synthetic */ String f68781n;

        public AnonymousClass5(Context context, TUGDPRConsentDismissListener tUGDPRConsentDismissListener, String str) {
            this.f68779d = context;
            this.f68780m = tUGDPRConsentDismissListener;
            this.f68781n = str;
        }

        @Override // com.thinkup.core.common.dn.o.d
        public final void d(String str) {
            if (nd.m().qm()) {
                n.m("UMP onConsentFail:".concat(String.valueOf(str)));
            }
            if (!o.d(this.f68779d).m()) {
                n.this.d(this.f68779d, this.f68780m, this.f68781n);
            } else {
                n.m("UMP canRequestAd:true after onConsentFail");
                n.this.d(this.f68780m, "", 106);
            }
        }

        @Override // com.thinkup.core.common.dn.o.d
        public final void d(boolean z10) {
            if (nd.m().qm()) {
                n.m("UMP onConsentSuccess isRealTimeDialogDismiss:".concat(String.valueOf(z10)));
            }
            if (z10) {
                n.n(this.f68779d);
            }
            n.this.d(this.f68780m, "", z10 ? 105 : 103);
        }
    }

    public final synchronized boolean m() {
        return this.f68753md;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void m(String str) {
        TUSDK.isNetworkLogDebug();
    }

    public static n d() {
        if (f113do == null) {
            synchronized (n.class) {
                try {
                    if (f113do == null) {
                        f113do = new n();
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        return f113do;
    }

    public final void d(final Activity activity, final TUGDPRConsentDismissListener tUGDPRConsentDismissListener, final String str) {
        boolean z10;
        nd.m();
        if (activity == null) {
            if (nd.m().qm()) {
                m("showGDPRConsentDialog fail:activity is null!");
            }
            d(tUGDPRConsentDismissListener, "activity is null!", -1);
            return;
        }
        final Context applicationContext = activity.getApplicationContext();
        try {
            o.d(applicationContext);
            z10 = true;
        } catch (Throwable unused) {
            z10 = false;
        }
        final boolean z11 = z10;
        if (nd.m().qm()) {
            m("Has UMP SDK:".concat(String.valueOf(z11)));
        }
        com.thinkup.core.common.nn.m.n.d().d(new com.thinkup.core.common.nn.m.o(q.dmn, new Runnable() { // from class: com.thinkup.core.common.dn.n.1
            @Override // java.lang.Runnable
            public final void run() {
                int iQ = nn.d(applicationContext).q();
                if (iQ == -100 || iQ == 1) {
                    nn.d(applicationContext).d(new nn.d() { // from class: com.thinkup.core.common.dn.n.1.1
                        @Override // com.thinkup.core.common.o.nn.d
                        public final void d(boolean z12, boolean z13) {
                            n.m("checkIsEuTraffic:onResultCallback:" + z12 + ":" + z13);
                            if (!z13) {
                                AnonymousClass1 anonymousClass1 = AnonymousClass1.this;
                                n.d(n.this, applicationContext, activity, z11, tUGDPRConsentDismissListener);
                                return;
                            }
                            AnonymousClass1 anonymousClass2 = AnonymousClass1.this;
                            if (z12) {
                                n.d(n.this, applicationContext, activity, z11, tUGDPRConsentDismissListener);
                            } else {
                                n.this.d(tUGDPRConsentDismissListener, "", 102);
                            }
                        }

                        @Override // com.thinkup.core.api.NetTrafficeCallback
                        public final void onErrorCallback(String str2) {
                            n.m("checkIsEuTraffic:onErrorCallback:".concat(String.valueOf(str2)));
                            AnonymousClass1 anonymousClass1 = AnonymousClass1.this;
                            n.d(n.this, applicationContext, activity, z11, tUGDPRConsentDismissListener);
                        }

                        @Override // com.thinkup.core.api.NetTrafficeCallback
                        public final void onResultCallback(boolean z12) {
                            n.m("checkIsEuTraffic:onResultCallback:".concat(String.valueOf(z12)));
                        }
                    }, str);
                } else {
                    n.d(n.this, applicationContext, activity, z11, tUGDPRConsentDismissListener);
                }
            }
        }));
    }

    private void d(Context context, Activity activity, boolean z10, TUGDPRConsentDismissListener tUGDPRConsentDismissListener) {
        if (z10) {
            o oVarD = o.d(context);
            AnonymousClass2 anonymousClass2 = new AnonymousClass2(context, tUGDPRConsentDismissListener);
            try {
                if (oVarD.d()) {
                    nd.m();
                    nd.m(oVarD.new AnonymousClass3(activity, anonymousClass2));
                    return;
                } else {
                    anonymousClass2.d("isPrivacyOptionsRequired is not.");
                    return;
                }
            } catch (Throwable th2) {
                anonymousClass2.d("secondAdsConsent:" + th2.getMessage());
                return;
            }
        }
        d(tUGDPRConsentDismissListener, "ump sdk not exist", -1);
    }

    private void d(Context context, Activity activity, boolean z10, TUGDPRConsentDismissListener tUGDPRConsentDismissListener, String str) {
        if (!TextUtils.isEmpty(d.d(context).m())) {
            if (z10) {
                o.d(context).d(activity, new AnonymousClass4());
            }
            d(tUGDPRConsentDismissListener, "", 101);
        } else {
            if (z10) {
                o.d(context).d(activity, new AnonymousClass5(context, tUGDPRConsentDismissListener, str));
                if (o.d(context).m()) {
                    m("UMP canRequestAd:true");
                    d(tUGDPRConsentDismissListener, "", 104);
                    return;
                }
                return;
            }
            d(context, tUGDPRConsentDismissListener, str);
        }
    }

    public final void d(final Context context, final TUGDPRConsentDismissListener tUGDPRConsentDismissListener, String str) {
        if (nn.d(context).d() != 2) {
            d(tUGDPRConsentDismissListener, "", 101);
        } else {
            TUSDK.checkIsEuTraffic(context, new NetTrafficeCallback() { // from class: com.thinkup.core.common.dn.n.6
                @Override // com.thinkup.core.api.NetTrafficeCallback
                public final void onErrorCallback(String str2) {
                    n.this.d(tUGDPRConsentDismissListener, str2, -1);
                }

                @Override // com.thinkup.core.api.NetTrafficeCallback
                public final void onResultCallback(boolean z10) {
                    if (z10) {
                        nn.d(context).d(context, new TUGDPRAuthCallback() { // from class: com.thinkup.core.common.dn.n.6.1
                            @Override // com.thinkup.core.api.TUGDPRAuthCallback
                            public final void onAuthResult(int i10) {
                                AnonymousClass6 anonymousClass6 = AnonymousClass6.this;
                                n.this.d(tUGDPRConsentDismissListener, "", 100);
                            }

                            @Override // com.thinkup.core.api.TUGDPRAuthCallback
                            public final void onPageLoadFail() {
                                AnonymousClass6 anonymousClass6 = AnonymousClass6.this;
                                n.this.d(tUGDPRConsentDismissListener, "showUploadDataNotifyDialog onPageLoadFail", -1);
                            }
                        });
                    } else {
                        n.this.d(tUGDPRConsentDismissListener, "", 102);
                    }
                }
            }, str);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d(final TUGDPRConsentDismissListener tUGDPRConsentDismissListener, final String str, final int i10) {
        nd.m();
        nd.m(new Runnable() { // from class: com.thinkup.core.common.dn.n.7
            @Override // java.lang.Runnable
            public final void run() {
                if (tUGDPRConsentDismissListener == null || n.this.f68757mq.contains(Integer.valueOf(tUGDPRConsentDismissListener.hashCode()))) {
                    return;
                }
                n.this.f68757mq.add(Integer.valueOf(tUGDPRConsentDismissListener.hashCode()));
                tUGDPRConsentDismissListener.onDismiss(new TUGDPRConsentDismissListener.ConsentDismissInfo(str, i10));
            }
        });
    }

    public final synchronized boolean d(Context context, int i10) {
        m mVar;
        if (this.f68752m0.size() > 0 && (mVar = this.f68752m0.get(Integer.valueOf(i10))) != null) {
            return mVar.o();
        }
        return nn.d(context).n();
    }

    private static boolean d(String str, int i10) {
        if (!TextUtils.isEmpty(str) && i10 > 0) {
            try {
                if (str.length() >= i10 && str.charAt(i10 - 1) == '1') {
                    return true;
                }
            } catch (Throwable unused) {
            }
        }
        return false;
    }

    private static boolean d(List<Integer> list, int i10) {
        if (list.size() == 0) {
            return false;
        }
        return list.contains(Integer.valueOf(i10));
    }

    public final synchronized JSONObject d(JSONObject jSONObject) {
        if (!m() && TextUtils.isEmpty(this.f68754mm)) {
            this.f68754mm = d.d(nd.m().dd()).m();
            this.f68756mo = d.d(nd.m().dd()).o();
            this.f68755mn = d.d(nd.m().dd()).n();
        }
        try {
            if (!TextUtils.isEmpty(this.f68754mm)) {
                jSONObject.put("tc_string", this.f68754mm);
            }
            if (!TextUtils.isEmpty(this.f68755mn)) {
                jSONObject.put("addtl_consent", this.f68755mn);
            }
        } catch (Throwable unused) {
        }
        return jSONObject;
    }

    public static /* synthetic */ void d(n nVar, Context context, Activity activity, boolean z10, TUGDPRConsentDismissListener tUGDPRConsentDismissListener) {
        if (z10) {
            o oVarD = o.d(context);
            AnonymousClass2 anonymousClass2 = nVar.new AnonymousClass2(context, tUGDPRConsentDismissListener);
            try {
                if (oVarD.d()) {
                    nd.m();
                    nd.m(oVarD.new AnonymousClass3(activity, anonymousClass2));
                    return;
                } else {
                    anonymousClass2.d("isPrivacyOptionsRequired is not.");
                    return;
                }
            } catch (Throwable th2) {
                anonymousClass2.d("secondAdsConsent:" + th2.getMessage());
                return;
            }
        }
        nVar.d(tUGDPRConsentDismissListener, "ump sdk not exist", -1);
    }

    public static /* synthetic */ void d(n nVar, Context context, Activity activity, boolean z10, TUGDPRConsentDismissListener tUGDPRConsentDismissListener, String str) {
        if (!TextUtils.isEmpty(d.d(context).m())) {
            if (z10) {
                o.d(context).d(activity, nVar.new AnonymousClass4());
            }
            nVar.d(tUGDPRConsentDismissListener, "", 101);
        } else {
            if (z10) {
                o.d(context).d(activity, nVar.new AnonymousClass5(context, tUGDPRConsentDismissListener, str));
                if (o.d(context).m()) {
                    m("UMP canRequestAd:true");
                    nVar.d(tUGDPRConsentDismissListener, "", 104);
                    return;
                }
                return;
            }
            nVar.d(context, tUGDPRConsentDismissListener, str);
        }
    }
}