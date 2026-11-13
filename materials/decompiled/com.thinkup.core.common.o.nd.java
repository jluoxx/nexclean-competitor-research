package com.thinkup.core.common.o;

import android.app.Activity;
import android.app.Application;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.ProviderInfo;
import android.content.res.XmlResourceParser;
import android.location.Location;
import android.os.Build;
import android.text.TextUtils;
import android.util.Pair;
import android.widget.Toast;
import com.android.launcher3.AutoInstallsLayout;
import com.mbridge.msdk.playercommon.exoplayer2.text.ttml.TtmlNode;
import com.reyun.solar.engine.utils.Command;
import com.thinkup.core.api.DeviceInfoCallback;
import com.thinkup.core.api.IDlHandler;
import com.thinkup.core.api.IExHandler;
import com.thinkup.core.api.IOdHandler;
import com.thinkup.core.api.IOsExHandler;
import com.thinkup.core.api.ITUAdFilter;
import com.thinkup.core.api.ITUDeviceRiskListener;
import com.thinkup.core.api.MediationInitCallback;
import com.thinkup.core.api.TUAdConst;
import com.thinkup.core.api.TUAdFilter;
import com.thinkup.core.api.TUAdInfo;
import com.thinkup.core.api.TUCommonConfig;
import com.thinkup.core.api.TUCustomAdapterConfig;
import com.thinkup.core.api.TUDebuggerConfig;
import com.thinkup.core.api.TUInitConfig;
import com.thinkup.core.api.TUInitMediation;
import com.thinkup.core.api.TUNetworkConfig;
import com.thinkup.core.api.TUOsDmEntity;
import com.thinkup.core.api.TUSDK;
import com.thinkup.core.api.TUSharedPlacementConfig;
import com.thinkup.core.api.TUUserDeviceInfo;
import com.thinkup.core.common.dm.mdm;
import com.thinkup.core.common.dm.oq;
import com.thinkup.core.common.nn.on;
import com.thinkup.core.common.nn.q0;
import com.thinkup.core.common.nn.qq;
import com.thinkup.core.common.no;
import com.thinkup.network.facebook.FacebookTUInitConfig;
import com.varbto.utils.api.MediationUtilsManager;
import com.varbto.utils.performance.DevicePerformanceGrader;
import dalvik.system.DexFile;
import java.io.File;
import java.lang.ref.WeakReference;
import java.lang.reflect.Constructor;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import org.json.JSONArray;
import org.json.JSONObject;
import v3.a;

/* JADX INFO: loaded from: classes7.dex */
public class nd {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int f73036d = 0;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final int f73039m = 1;

    /* JADX INFO: renamed from: mm, reason: collision with root package name */
    public static final String f73042mm = "mmed_m_a_c";

    /* JADX INFO: renamed from: n0, reason: collision with root package name */
    private static volatile nd f73043n0;
    private String d0q;

    /* JADX INFO: renamed from: dd, reason: collision with root package name */
    ITUDeviceRiskListener f73045dd;
    private String dd0;
    private boolean ddm;

    /* JADX INFO: renamed from: dm, reason: collision with root package name */
    WeakReference<Activity> f73046dm;
    private com.thinkup.core.common.p000do.q dmm;
    private Location dmn;
    private JSONArray dmq;
    private List<String> dn0;
    private String dnm;
    private TUDebuggerConfig dnn;
    private boolean dno;
    private ConcurrentHashMap<String, ITUAdFilter> dom;
    private TUUserDeviceInfo doo;
    private mdm doq;
    private String dqm;
    private boolean dqo;
    private long dqq;
    private volatile com.thinkup.core.common.m0.o.dn m0d;
    private com.thinkup.core.common.q.m m0m;
    private String m0n;
    private Pair<Integer, List<String>> m0q;
    private Pair<Boolean, com.thinkup.core.common.dm.m0> md0;
    private boolean mmd;
    private volatile String mmm;
    private volatile JSONObject mmo;

    /* JADX INFO: renamed from: mn, reason: collision with root package name */
    private int f73047mn;

    /* JADX INFO: renamed from: nd, reason: collision with root package name */
    private Context f73051nd;

    /* JADX INFO: renamed from: nm, reason: collision with root package name */
    private String f73052nm;

    /* JADX INFO: renamed from: nn, reason: collision with root package name */
    private String f73053nn;

    /* JADX INFO: renamed from: no, reason: collision with root package name */
    private TUNetworkConfig f73054no;

    /* JADX INFO: renamed from: nq, reason: collision with root package name */
    private String f73055nq;

    /* JADX INFO: renamed from: om, reason: collision with root package name */
    private ConcurrentHashMap<String, TUCustomAdapterConfig> f73059om;

    /* JADX INFO: renamed from: oo, reason: collision with root package name */
    private volatile String f73061oo;

    /* JADX INFO: renamed from: qd, reason: collision with root package name */
    private BroadcastReceiver f73065qd;

    /* JADX INFO: renamed from: qm, reason: collision with root package name */
    private String f73066qm;

    /* JADX INFO: renamed from: qn, reason: collision with root package name */
    private String f73067qn;

    /* JADX INFO: renamed from: qo, reason: collision with root package name */
    private String f73068qo;

    /* JADX INFO: renamed from: qq, reason: collision with root package name */
    private n0 f73069qq;
    private static final Object m00 = new Object();

    /* JADX INFO: renamed from: dn, reason: collision with root package name */
    public static final String f73037dn = "anr_count";

    /* JADX INFO: renamed from: do, reason: not valid java name */
    public static final String f231do = "dynamic_score";

    /* JADX INFO: renamed from: dq, reason: collision with root package name */
    public static final String f73038dq = "total_score";

    /* JADX INFO: renamed from: m0, reason: collision with root package name */
    public static final String f73040m0 = "is_high_consumption";

    /* JADX INFO: renamed from: md, reason: collision with root package name */
    public static final String f73041md = "anr_timestamps";
    private static final String[] mmq = {f73037dn, f231do, f73038dq, f73040m0, f73041md};

    /* JADX INFO: renamed from: mo, reason: collision with root package name */
    private final String f73048mo = "SDK.init";

    /* JADX INFO: renamed from: mq, reason: collision with root package name */
    private boolean f73049mq = false;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    private final Object f73064q0 = new Object();
    private boolean d0d = false;
    private boolean d0m = false;
    private long d0n = 0;
    private long d0o = 0;
    private boolean ddn = false;
    private boolean ddo = false;
    private final Object ddq = new Object();
    private boolean dm0 = false;
    private final Object dmd = new Object();
    private String dmo = "";
    private int dnq = 1;
    private boolean do0 = false;
    private boolean dod = false;
    private String don = "";
    private final Object dqd = new Object();

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public volatile boolean f73050n = false;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    boolean f73056o = false;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    volatile long f73063q = 0;

    /* JADX INFO: renamed from: d0, reason: collision with root package name */
    volatile long f73044d0 = 0;
    private int m0o = -1;
    private final List<m0> mdd = new ArrayList();
    private final Map<String, TUAdFilter> mdm = new HashMap();
    private final Map<String, TUAdFilter> mdn = new HashMap();
    private int mdo = -1;
    private int mdq = -1;
    private int mm0 = -1;
    private volatile boolean mmn = false;

    /* JADX INFO: renamed from: od, reason: collision with root package name */
    private ConcurrentHashMap<String, Map<String, Object>> f73058od = new ConcurrentHashMap<>();

    /* JADX INFO: renamed from: o0, reason: collision with root package name */
    private ConcurrentHashMap<String, Object> f73057o0 = new ConcurrentHashMap<>();
    private final String d00 = File.separator + "thinkup.test";
    private boolean ddd = true;
    private ConcurrentHashMap<String, List<String>> dnd = new ConcurrentHashMap<>();

    /* JADX INFO: renamed from: oq, reason: collision with root package name */
    private ConcurrentHashMap<String, String> f73062oq = new ConcurrentHashMap<>();
    private long dq0 = System.currentTimeMillis();

    /* JADX INFO: renamed from: on, reason: collision with root package name */
    private final Map<String, Boolean> f73060on = new ConcurrentHashMap(2);
    private long dqn = System.currentTimeMillis();

    /* JADX INFO: renamed from: com.thinkup.core.common.o.nd$1, reason: invalid class name */
    public class AnonymousClass1 implements Runnable {
        private AnonymousClass1() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            n0 n0VarN = nd.m().n();
            if (n0VarN != null) {
                n0VarN.startPlugin(nd.this.f73051nd);
            }
        }
    }

    /* JADX INFO: renamed from: com.thinkup.core.common.o.nd$16, reason: invalid class name */
    public class AnonymousClass16 implements Runnable {
        public AnonymousClass16() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            com.thinkup.core.common.mn.d().d(nd.this.f73051nd);
            com.thinkup.core.common.d.dd.d().m();
            com.thinkup.core.common.dn.n.d().d(nd.this.f73051nd);
            com.thinkup.core.common.res.o.d(nd.this.dd()).d();
            com.thinkup.core.common.res.o.d(nd.this.dd());
            com.thinkup.core.common.res.o.m();
        }
    }

    /* JADX INFO: renamed from: com.thinkup.core.common.o.nd$17, reason: invalid class name */
    public class AnonymousClass17 implements MediationInitCallback {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ Context f73083d;

        public AnonymousClass17(Context context) {
            this.f73083d = context;
        }

        @Override // com.thinkup.core.api.MediationInitCallback
        public final void onFail(String str) {
            nd.this.d("There is a problem with the integrated resources of TU SDK, please check whether you have followed the steps of the integration document.", true, 3, str);
        }

        @Override // com.thinkup.core.api.MediationInitCallback
        public final void onSuccess() {
            com.thinkup.core.bridge.d.m.d().d(this.f73083d);
        }
    }

    /* JADX INFO: renamed from: com.thinkup.core.common.o.nd$18, reason: invalid class name */
    public class AnonymousClass18 implements Runnable {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ String f73085d;

        private AnonymousClass18(String str) {
            this.f73085d = str;
        }

        @Override // java.lang.Runnable
        public final void run() {
            if (nd.this.f73051nd != null) {
                Toast.makeText(nd.this.f73051nd, this.f73085d, 1).show();
            }
        }
    }

    /* JADX INFO: renamed from: com.thinkup.core.common.o.nd$2, reason: invalid class name */
    public class AnonymousClass2 implements Runnable {
        private AnonymousClass2() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            n0 n0VarN = nd.m().n();
            if (n0VarN != null) {
                n0VarN.startUpDateUPID(nd.this.f73051nd);
            }
        }
    }

    /* JADX INFO: renamed from: com.thinkup.core.common.o.nd$3, reason: invalid class name */
    public class AnonymousClass3 extends BroadcastReceiver {
        public AnonymousClass3() {
        }

        @Override // android.content.BroadcastReceiver
        public final void onReceive(final Context context, final Intent intent) {
            nd.d(new Runnable() { // from class: com.thinkup.core.common.o.nd.3.1
                @Override // java.lang.Runnable
                public final void run() {
                    if (com.thinkup.core.common.nn.mo.d(context)) {
                        com.thinkup.core.common.nd.d().m();
                    }
                    nd.this.n(context);
                    if (TextUtils.equals(intent.getAction(), dn.f72628on)) {
                        com.thinkup.core.common.nm.d0.d(intent.getStringExtra(dn.f72629oo));
                    }
                }
            });
            try {
                if (nd.this.f73069qq != null) {
                    nd.this.f73069qq.resetSSID();
                }
            } catch (Throwable unused) {
            }
        }
    }

    /* JADX INFO: renamed from: com.thinkup.core.common.o.nd$4, reason: invalid class name */
    public class AnonymousClass4 implements Runnable {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ Context f73092d;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        final /* synthetic */ String f73093m;

        public AnonymousClass4(Context context, String str) {
            this.f73092d = context;
            this.f73093m = str;
        }

        @Override // java.lang.Runnable
        public final void run() {
            nd.this.n(this.f73092d.getApplicationContext());
            com.thinkup.core.q.m mVarM = com.thinkup.core.q.o.d(this.f73092d.getApplicationContext()).m(this.f73093m);
            if (mVarM != null) {
                if (!mVarM.d0d()) {
                    com.thinkup.core.common.mq.d(nd.this.f73051nd).d(mVarM);
                    com.thinkup.core.common.n.m.d().d(mVarM.dqn());
                    com.thinkup.core.common.n.d().m(mVarM.dn());
                    com.thinkup.core.d.m.d(this.f73092d.getApplicationContext()).d(mVarM.m0d());
                    nd.m().qn();
                    nd.m().d(mVarM);
                    com.thinkup.core.common.nn.q.d().d(mVarM.d0());
                    n0 n0VarN = nd.this.n();
                    if (n0VarN != null) {
                        n0VarN.uploadAegisData(mVarM);
                    }
                    com.thinkup.core.common.m0.d(this.f73092d.getApplicationContext()).d(mVarM.mo0());
                }
                nd.this.m(mVarM);
                no.d().d(mVarM.dd());
                if (TextUtils.isEmpty(com.thinkup.core.q.o.d(this.f73092d.getApplicationContext()).d(this.f73093m))) {
                    com.thinkup.core.q.o.d(this.f73092d.getApplicationContext());
                }
                com.thinkup.core.common.mm.q.d().d(mVarM);
            }
        }
    }

    /* JADX INFO: renamed from: com.thinkup.core.common.o.nd$8, reason: invalid class name */
    public class AnonymousClass8 implements Runnable {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ TUInitConfig f73107d;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        final /* synthetic */ Context f73108m;

        public AnonymousClass8(TUInitConfig tUInitConfig, Context context) {
            this.f73107d = tUInitConfig;
            this.f73108m = context;
        }

        @Override // java.lang.Runnable
        public final void run() {
            Map<String, Object> requestParamMap;
            try {
                TUInitMediation initMediation = this.f73107d.getInitMediation();
                if (initMediation != null) {
                    String strN = q0.n(nd.this.f73051nd, nm.m.f73148dd, initMediation.getNetworkName(), "");
                    if (TextUtils.isEmpty(strN)) {
                        requestParamMap = this.f73107d.getRequestParamMap();
                        requestParamMap.put(TUInitMediation.KEY_LOCAL, Boolean.TRUE);
                    } else {
                        requestParamMap = com.thinkup.core.common.nn.mo.n(strN);
                    }
                    try {
                        initMediation.setUserDataConsent(this.f73108m, nn.d(this.f73108m).n(), nn.d(this.f73108m).o());
                    } catch (Throwable th2) {
                        th2.printStackTrace();
                    }
                    com.thinkup.core.q.m mVarM = com.thinkup.core.q.o.d(this.f73108m).m(nd.this.f73052nm);
                    boolean z10 = false;
                    requestParamMap.put("app_ccpa_switch", Boolean.valueOf(mVarM.nm() == 3));
                    boolean zM = com.thinkup.core.common.nn.mn.m();
                    if (mVarM.nn() == 2 && zM) {
                        z10 = true;
                    }
                    requestParamMap.put("app_coppa_switch", Boolean.valueOf(z10));
                    if (nd.m().qm()) {
                        new JSONObject(requestParamMap).toString();
                    }
                    initMediation.initSDK(nd.this.f73051nd, requestParamMap, null);
                }
            } catch (Throwable th3) {
                th3.printStackTrace();
            }
        }
    }

    /* JADX INFO: renamed from: com.thinkup.core.common.o.nd$9, reason: invalid class name */
    public class AnonymousClass9 implements DevicePerformanceGrader.PerformanceMonitorCallback {
        public AnonymousClass9() {
        }

        @Override // com.varbto.utils.performance.DevicePerformanceGrader.PerformanceMonitorCallback
        public final void onCpuUpdate(float f10, float f11) {
            nd.dn(nd.this);
        }

        @Override // com.varbto.utils.performance.DevicePerformanceGrader.PerformanceMonitorCallback
        public final void onGpuUpdate(float f10) {
        }

        @Override // com.varbto.utils.performance.DevicePerformanceGrader.PerformanceMonitorCallback
        public final void onMemoryUpdate(float f10) {
        }

        @Override // com.varbto.utils.performance.DevicePerformanceGrader.PerformanceMonitorCallback
        public final void onThermalUpdate(int i10) {
        }
    }

    private nd() {
    }

    public static /* synthetic */ void d0(Context context) {
        if (m().n("ua")) {
            return;
        }
        try {
            if (nn.d(context).m()) {
                String strDn = com.thinkup.core.common.nn.m0.dn();
                String strN = q0.n(context, nm.m.f73146d, nm.d.f73127nd, "");
                if (TextUtils.isEmpty(strDn) || !Build.VERSION.RELEASE.equals(strN)) {
                    com.thinkup.core.common.nn.m0.mn(context);
                }
            }
        } catch (Exception unused) {
        }
    }

    private synchronized void dm(final Context context) {
        Context context2;
        if (context == null) {
            return;
        }
        this.f73051nd = context.getApplicationContext();
        com.thinkup.core.common.nm.d.d.d().d0();
        if (!TextUtils.isEmpty(this.f73052nm) && !TextUtils.isEmpty(this.f73053nn)) {
            if (this.ddm) {
                return;
            }
            this.ddm = true;
            try {
                final Context applicationContext = context.getApplicationContext();
                try {
                    if (!this.mmn && (context2 = this.f73051nd) != null) {
                        MediationUtilsManager mediationUtilsManager = MediationUtilsManager.getInstance(context2);
                        mediationUtilsManager.setDebugMode(qm());
                        if (this.mm0 < 0) {
                            this.mm0 = mediationUtilsManager.getTotalScore();
                        }
                        if (this.mdq < 0) {
                            this.mdq = mediationUtilsManager.getDynamicScore();
                        }
                        if (!this.mmd) {
                            this.mmd = dnn();
                        }
                        mediationUtilsManager.startMonitoring(new AnonymousClass9(), 5000L);
                    }
                } catch (Throwable unused) {
                }
                this.do0 = com.thinkup.core.common.nn.mo.d();
                try {
                    BroadcastReceiver broadcastReceiver = this.f73065qd;
                    if (broadcastReceiver != null) {
                        this.f73051nd.unregisterReceiver(broadcastReceiver);
                        md.d(this.f73051nd).d(this.f73065qd);
                    }
                    this.f73065qd = null;
                } catch (Throwable unused2) {
                }
                try {
                    this.f73065qd = new AnonymousClass3();
                    IntentFilter intentFilter = new IntentFilter();
                    intentFilter.addAction("android.net.conn.CONNECTIVITY_CHANGE");
                    intentFilter.addAction(dn.f72628on);
                    md.d(this.f73051nd).d(this.f73065qd, intentFilter);
                    int i10 = Build.VERSION.SDK_INT;
                    Context context3 = this.f73051nd;
                    if (i10 >= 33) {
                        context3.registerReceiver(this.f73065qd, intentFilter, Command.Permission.P_ACCESS_NETWORK_STATE, null, 2);
                    } else {
                        context3.registerReceiver(this.f73065qd, intentFilter, Command.Permission.P_ACCESS_NETWORK_STATE, null);
                    }
                } catch (Throwable unused3) {
                }
                d(new Runnable() { // from class: com.thinkup.core.common.o.nd.12
                    @Override // java.lang.Runnable
                    public final void run() {
                        try {
                            nd.this.ddn();
                            nd.this.n0();
                            nd.m(nd.this, context);
                            Cdo.d(applicationContext).d();
                            nd.o(nd.this);
                        } catch (Exception unused4) {
                        }
                    }
                });
                d(new Runnable() { // from class: com.thinkup.core.common.o.nd.13
                    @Override // java.lang.Runnable
                    public final void run() {
                        nd.this.no();
                        nd.d0(applicationContext);
                        if (!TextUtils.isEmpty(nd.this.dnm)) {
                            String strMq = com.thinkup.core.common.nn.m0.mq(nd.this.f73051nd);
                            if (!TextUtils.isEmpty(strMq)) {
                                nd.this.dm(strMq);
                            }
                        }
                        nd ndVar = nd.this;
                        nd.n(ndVar, ndVar.f73051nd);
                    }
                });
                m.n().d(new dd(o0()));
                d(new Runnable() { // from class: com.thinkup.core.common.o.nd.14
                    @Override // java.lang.Runnable
                    public final void run() {
                        nd.this.n();
                        if (nd.this.f73069qq != null) {
                            nd.this.f73069qq.initDeviceInfo(context);
                            nd.this.f73069qq.cleanExpiredInfo();
                        }
                    }
                });
                d(new AnonymousClass4(context, this.f73052nm));
                d(new Runnable() { // from class: com.thinkup.core.common.o.nd.15
                    @Override // java.lang.Runnable
                    public final void run() {
                        nd ndVar = nd.this;
                        nd.d(ndVar, ndVar.f73051nd, nd.this.f73054no);
                    }
                });
            } catch (Exception e10) {
                e10.getMessage();
            }
        }
    }

    private static void dn(Context context) {
        if (m().n("ua")) {
            return;
        }
        try {
            if (nn.d(context).m()) {
                String strDn = com.thinkup.core.common.nn.m0.dn();
                String strN = q0.n(context, nm.m.f73146d, nm.d.f73127nd, "");
                if (TextUtils.isEmpty(strDn) || !Build.VERSION.RELEASE.equals(strN)) {
                    com.thinkup.core.common.nn.m0.mn(context);
                }
            }
        } catch (Exception unused) {
        }
    }

    /* JADX INFO: renamed from: do, reason: not valid java name */
    private void m301do(Context context) {
        try {
            com.thinkup.core.common.q.m mVar = this.m0m;
            if (mVar != null) {
                com.thinkup.core.common.nm.d0.d(mVar);
                return;
            }
            Object objInvoke = null;
            try {
                objInvoke = Class.forName("com.thinkup.network.adx.AdxTUInitManager").getDeclaredMethod("getInstance", null).invoke(null, null);
            } catch (Throwable unused) {
            }
            if (objInvoke instanceof TUInitMediation) {
                TUInitMediation tUInitMediation = (TUInitMediation) objInvoke;
                HashMap map = new HashMap();
                map.put(TUAdConst.NETWORK_REQUEST_PARAMS_KEY.ADX_PRECHECK_MODE, 1);
                com.thinkup.core.bridge.entity.d dVar = new com.thinkup.core.bridge.entity.d();
                dVar.d();
                dVar.d(com.thinkup.core.common.nn.mn.d());
                dVar.m(this.f73052nm);
                dVar.n(this.f73053nn);
                map.put(com.thinkup.core.bridge.d.C0834d.f67342m, com.thinkup.core.bridge.n.d(dVar));
                com.thinkup.core.bridge.entity.o oVar = new com.thinkup.core.bridge.entity.o();
                oVar.d(oo());
                oVar.dd(com.thinkup.core.common.nn.m0.o(context));
                oVar.n(com.thinkup.core.common.nn.m0.mq(context));
                oVar.q(com.thinkup.core.common.nn.m0.qo());
                oVar.d0(com.thinkup.core.common.nn.m0.qq());
                map.put(com.thinkup.core.bridge.d.C0834d.f67341d, com.thinkup.core.bridge.n.d(oVar));
                String[] strArrD0 = d0();
                if (strArrD0 != null && strArrD0.length > 0) {
                    map.put(TUAdConst.NETWORK_REQUEST_PARAMS_KEY.ADX_DENNY_DEVICE_INFO, strArrD0);
                }
                tUInitMediation.initSDK(context, map, new AnonymousClass17(context));
            }
        } catch (Throwable unused2) {
        }
    }

    private void dom() {
        com.thinkup.core.common.nn.m.n.d().q(new com.thinkup.core.common.nn.m.o(com.thinkup.core.common.nn.m.q.qdm, new AnonymousClass16()));
    }

    private void don() {
        com.thinkup.core.common.q.d.d();
        com.thinkup.core.common.q.m mVarD = com.thinkup.core.common.q.d.d(this.f73051nd);
        if (mVarD != null) {
            d(mVarD.m(), false, mVarD.d(), mVarD.n());
        }
    }

    private void doo() {
    }

    private static boolean doq() {
        return o0();
    }

    private boolean dq(Context context) {
        String strO = com.thinkup.core.common.nn.m0.o(context);
        if (!TextUtils.isEmpty(strO) && strO.equals(this.dnm)) {
            return true;
        }
        String strD0 = com.thinkup.core.common.nn.m0.d0();
        if (!TextUtils.isEmpty(strD0) && strD0.equals(this.dnm)) {
            return true;
        }
        n0 n0VarN = m().n();
        return n0VarN != null && n0VarN.checkDebuggerDevice(context, this.dnm);
    }

    private void dq0() {
        try {
            BroadcastReceiver broadcastReceiver = this.f73065qd;
            if (broadcastReceiver != null) {
                this.f73051nd.unregisterReceiver(broadcastReceiver);
                md.d(this.f73051nd).d(this.f73065qd);
            }
            this.f73065qd = null;
        } catch (Throwable unused) {
        }
        try {
            this.f73065qd = new AnonymousClass3();
            IntentFilter intentFilter = new IntentFilter();
            intentFilter.addAction("android.net.conn.CONNECTIVITY_CHANGE");
            intentFilter.addAction(dn.f72628on);
            md.d(this.f73051nd).d(this.f73065qd, intentFilter);
            int i10 = Build.VERSION.SDK_INT;
            Context context = this.f73051nd;
            if (i10 >= 33) {
                context.registerReceiver(this.f73065qd, intentFilter, Command.Permission.P_ACCESS_NETWORK_STATE, null, 2);
            } else {
                context.registerReceiver(this.f73065qd, intentFilter, Command.Permission.P_ACCESS_NETWORK_STATE, null);
            }
        } catch (Throwable unused2) {
        }
    }

    private long dqd() {
        if (this.f73044d0 == 0) {
            this.f73044d0 = q0.m(this.f73051nd, nm.m.f73146d, nm.d.f73130no, 0L);
        }
        return this.f73044d0;
    }

    private void dqm() {
        boolean zExists = false;
        if (this.f73051nd != null) {
            try {
                zExists = new File(this.f73051nd.getExternalFilesDir(null), this.d00).exists();
                if (!zExists) {
                    zExists = new File(this.f73051nd.getFilesDir(), this.d00).exists();
                }
            } catch (Throwable th2) {
                th2.printStackTrace();
            }
        }
        this.d0d = zExists;
    }

    private boolean dqn() {
        return this.ddd;
    }

    private long dqo() {
        return this.dq0;
    }

    private static boolean dqq() {
        return false;
    }

    public static /* synthetic */ void m(nd ndVar, Context context) {
        long jCurrentTimeMillis = ndVar.f73063q;
        try {
            String strN = q0.n(m().f73051nd, nm.m.f73146d, m().f73052nm + "playRecord", "");
            if (!TextUtils.isEmpty(strN)) {
                JSONObject jSONObject = new JSONObject(strN);
                long jOptLong = jSONObject.optLong("start_time");
                long jOptLong2 = jSONObject.optLong("end_time");
                String strOptString = jSONObject.optString(d0.f72585n);
                int iOptInt = jSONObject.optInt(d0.f72586o);
                if (jCurrentTimeMillis != 0) {
                    com.thinkup.core.common.nm.d0.d(iOptInt == 1 ? 4 : 2, jOptLong, jOptLong2, strOptString);
                } else {
                    jCurrentTimeMillis = jOptLong;
                }
                q0.m(m().f73051nd, nm.m.f73146d, m().f73052nm + "playRecord", "");
            }
        } catch (Exception unused) {
            q0.m(m().f73051nd, nm.m.f73146d, m().f73052nm + "playRecord", "");
        }
        if (jCurrentTimeMillis == 0) {
            jCurrentTimeMillis = q0.m(context, nm.m.f73146d, nm.d.f73130no, 0L);
        }
        if (jCurrentTimeMillis == 0) {
            jCurrentTimeMillis = System.currentTimeMillis();
        }
        m.n().d(new d0(jCurrentTimeMillis));
    }

    private void m0(Context context) {
        long jCurrentTimeMillis = this.f73063q;
        try {
            String strN = q0.n(m().f73051nd, nm.m.f73146d, m().f73052nm + "playRecord", "");
            if (!TextUtils.isEmpty(strN)) {
                JSONObject jSONObject = new JSONObject(strN);
                long jOptLong = jSONObject.optLong("start_time");
                long jOptLong2 = jSONObject.optLong("end_time");
                String strOptString = jSONObject.optString(d0.f72585n);
                int iOptInt = jSONObject.optInt(d0.f72586o);
                if (jCurrentTimeMillis != 0) {
                    com.thinkup.core.common.nm.d0.d(iOptInt == 1 ? 4 : 2, jOptLong, jOptLong2, strOptString);
                } else {
                    jCurrentTimeMillis = jOptLong;
                }
                q0.m(m().f73051nd, nm.m.f73146d, m().f73052nm + "playRecord", "");
            }
        } catch (Exception unused) {
            q0.m(m().f73051nd, nm.m.f73146d, m().f73052nm + "playRecord", "");
        }
        if (jCurrentTimeMillis == 0) {
            jCurrentTimeMillis = q0.m(context, nm.m.f73146d, nm.d.f73130no, 0L);
        }
        if (jCurrentTimeMillis == 0) {
            jCurrentTimeMillis = System.currentTimeMillis();
        }
        m.n().d(new d0(jCurrentTimeMillis));
    }

    private static boolean m00() {
        return true;
    }

    private void m0d() {
        Context context;
        if (this.mmn || (context = this.f73051nd) == null) {
            return;
        }
        try {
            MediationUtilsManager mediationUtilsManager = MediationUtilsManager.getInstance(context);
            mediationUtilsManager.setDebugMode(qm());
            if (this.mm0 < 0) {
                this.mm0 = mediationUtilsManager.getTotalScore();
            }
            if (this.mdq < 0) {
                this.mdq = mediationUtilsManager.getDynamicScore();
            }
            if (!this.mmd) {
                this.mmd = dnn();
            }
            mediationUtilsManager.startMonitoring(new AnonymousClass9(), 5000L);
        } catch (Throwable unused) {
        }
    }

    private void m0m() {
        try {
            this.mdq = MediationUtilsManager.getInstance(this.f73051nd).getDynamicScore();
            this.mmd = MediationUtilsManager.getInstance(this.f73051nd).isHighConsumption();
        } catch (Throwable unused) {
        }
    }

    private boolean m0n() {
        return this.mmn;
    }

    private void mm(Context context) {
        long jM = q0.m(context, nm.m.f73146d, nm.d.f73135om, 0L);
        this.d0n = jM;
        if (jM == 0) {
            long j10 = this.dqq;
            this.d0n = j10;
            q0.d(context, nm.m.f73146d, nm.d.f73135om, j10);
        }
        this.d0o = ((d(this.dqq) - d(this.d0n)) / 86400000) + 1;
    }

    private String o0(String str) {
        String str2 = this.f73062oq.get(str);
        if (!TextUtils.isEmpty(str2)) {
            return str2;
        }
        long jCurrentTimeMillis = System.currentTimeMillis();
        String strD = com.thinkup.core.common.nn.mm.d(str + n0());
        try {
            this.f73062oq.put(str, strD);
        } catch (Exception unused) {
        }
        com.thinkup.core.common.nm.d0.d(str, "2", (String) null, String.valueOf(jCurrentTimeMillis));
        return strD;
    }

    private static boolean od(String str) {
        String strD = com.thinkup.core.common.nn.mn.d();
        boolean z10 = !TextUtils.isEmpty(str) && str.startsWith(strD);
        if (!z10) {
            String.format("Adapter Version: The current Adapter version(%s) does not apply to the SDK version(%s).", str, strD);
        }
        return z10;
    }

    public static boolean q(Context context, List<String> list) {
        int size;
        boolean z10 = true;
        if (list == null || (size = list.size()) == 0) {
            return true;
        }
        StringBuilder sb2 = new StringBuilder();
        try {
            String[] strArr = context.getPackageManager().getPackageInfo(context.getPackageName(), 4096).requestedPermissions;
            if (strArr == null) {
                for (int i10 = 0; i10 < size; i10++) {
                    String str = list.get(i10);
                    if (i10 == 0) {
                        sb2.append(str);
                    } else {
                        sb2.append(", ");
                        sb2.append(str);
                    }
                }
                return false;
            }
            for (int i11 = 0; i11 < size; i11++) {
                String str2 = list.get(i11);
                int length = strArr.length;
                int i12 = 0;
                while (true) {
                    if (i12 >= length) {
                        if (sb2.length() == 0) {
                            sb2.append(str2);
                        } else {
                            sb2.append(", ");
                            sb2.append(str2);
                        }
                        z10 = false;
                        break;
                    }
                    if (TextUtils.equals(str2, strArr[i12])) {
                        break;
                    }
                    i12++;
                }
            }
            return z10;
        } catch (Throwable th2) {
            th2.printStackTrace();
            return false;
        }
    }

    /* JADX WARN: Code duplicated, block: B:60:0x00c1 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:61:0x00c2 A[RETURN] */
    public final String d(Context context, List<String> list, String str) {
        String str2;
        if (list == null || list.size() == 0) {
            return "";
        }
        boolean z10 = false;
        try {
            int size = list.size();
            str2 = "";
            boolean z11 = true;
            for (int i10 = 0; i10 < size; i10++) {
                try {
                    String str3 = list.get(i10);
                    try {
                        if (TextUtils.isEmpty(str2)) {
                            str2 = str3.split("_")[0] + "_*";
                        }
                        int identifier = !TextUtils.isEmpty(str) ? context.getResources().getIdentifier(str3, TtmlNode.TAG_LAYOUT, str) : -1;
                        if (identifier <= 0 && !TextUtils.isEmpty(this.dqm)) {
                            identifier = context.getResources().getIdentifier(str3, TtmlNode.TAG_LAYOUT, this.dqm);
                        }
                        if (identifier <= 0) {
                            identifier = context.getResources().getIdentifier(str3, TtmlNode.TAG_LAYOUT, context.getPackageName());
                        }
                        if (identifier <= 0) {
                            if (z10) {
                                return "";
                            }
                            return str2;
                        }
                        XmlResourceParser layout = null;
                        try {
                            layout = context.getResources().getLayout(identifier);
                            while (true) {
                                int next = layout.next();
                                if (next == 1) {
                                    break;
                                }
                                if (next == 2) {
                                    if (!AutoInstallsLayout.ATTR_X.equalsIgnoreCase(layout.getName())) {
                                        if (layout.getAttributeCount() >= 0) {
                                            break;
                                        }
                                    } else {
                                        if (layout.getAttributeCount() == 0) {
                                            z11 = false;
                                            break;
                                        }
                                    }
                                }
                            }
                        } catch (Throwable th2) {
                            try {
                                th2.printStackTrace();
                                if (layout != null) {
                                    break;
                                }
                            } catch (Throwable th3) {
                                if (layout != null) {
                                    layout.close();
                                }
                                throw th3;
                            }
                        }
                        layout.close();
                    } catch (Throwable unused) {
                    }
                } catch (Throwable th4) {
                    th = th4;
                    th.printStackTrace();
                }
            }
            z10 = z11;
        } catch (Throwable th5) {
            th = th5;
            str2 = "";
        }
        if (z10) {
            return "";
        }
        return str2;
    }

    public final boolean d00() {
        return this.do0;
    }

    public final boolean d0d() {
        return this.dod;
    }

    public final Context d0m() {
        WeakReference<Activity> weakReference = this.f73046dm;
        return (weakReference == null || weakReference.get() == null) ? this.f73051nd : this.f73046dm.get();
    }

    public final Activity d0n() {
        WeakReference<Activity> weakReference = this.f73046dm;
        if (weakReference == null || weakReference.get() == null) {
            return null;
        }
        return this.f73046dm.get();
    }

    public final String d0o() {
        return this.don;
    }

    public final boolean d0q() {
        return this.ddn;
    }

    public final String dd(String str) {
        if (TextUtils.isEmpty(str)) {
            return "";
        }
        String str2 = this.f73062oq.get(str);
        return !TextUtils.isEmpty(str2) ? str2 : o0(str);
    }

    public final TUUserDeviceInfo dd0() {
        return this.doo;
    }

    public final mdm ddd() {
        if (this.doq == null) {
            this.doq = new mdm();
        }
        try {
            this.doq.d(com.thinkup.core.common.nn.m0.nd(m().f73051nd));
            this.doq.m(com.thinkup.core.common.nn.m0.m0());
            this.doq.n(com.thinkup.core.common.nn.m0.mm());
            this.doq.o(com.thinkup.core.common.nn.m0.m(com.thinkup.core.common.nn.m0.md()));
        } catch (Throwable unused) {
        }
        return this.doq;
    }

    public final void ddm() {
        this.dq0 = System.currentTimeMillis();
    }

    public final void ddn() {
        Context context = this.f73051nd;
        if (context == null || this.ddo) {
            return;
        }
        synchronized (this.ddq) {
            try {
                if (!this.ddo) {
                    long jM = q0.m(context, nm.m.f73146d, nm.d.f73135om, 0L);
                    this.d0n = jM;
                    if (jM == 0) {
                        long j10 = this.dqq;
                        this.d0n = j10;
                        q0.d(context, nm.m.f73146d, nm.d.f73135om, j10);
                    }
                    this.d0o = ((d(this.dqq) - d(this.d0n)) / 86400000) + 1;
                    com.thinkup.core.common.dd.n.d().d(context);
                    this.ddo = true;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final String ddo() {
        return this.dqm;
    }

    public final boolean ddq() {
        return this.f73056o;
    }

    public final boolean dm0() {
        return this.dqo;
    }

    public final com.thinkup.core.common.m0.o.dn dmd() {
        if (this.m0d == null) {
            synchronized (m00) {
                try {
                    if (this.m0d == null) {
                        this.m0d = new com.thinkup.core.common.m0.o.dd(this.f73051nd);
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        return this.m0d;
    }

    public final long dmm() {
        return this.dqq;
    }

    public final int dmn() {
        try {
            TUOsDmEntity osDmEntity = n().getOsDmEntity();
            if (osDmEntity != null) {
                return Integer.parseInt(osDmEntity.getTrafficType());
            }
            return 8;
        } catch (Throwable unused) {
            return 8;
        }
    }

    public final Map<String, TUAdFilter> dmo() {
        return this.mdm;
    }

    public final void dmq() {
        this.mdm.clear();
    }

    public final int dn0() {
        int i10 = this.mdo;
        if (i10 >= 0) {
            return i10;
        }
        return 0;
    }

    public final int dnd() {
        int i10 = this.mdq;
        if (i10 >= 0) {
            return i10;
        }
        return 0;
    }

    public final int dnm() {
        int i10 = this.mm0;
        if (i10 >= 0) {
            return i10;
        }
        return 0;
    }

    public final boolean dnn() {
        if (!this.mmn) {
            try {
                return MediationUtilsManager.getInstance(this.f73051nd).isHighConsumption();
            } catch (Throwable unused) {
            }
        }
        return this.mmd;
    }

    public final String dno() {
        return this.mmm;
    }

    public final long dnq() {
        return this.dqn;
    }

    public final JSONObject do0() {
        return this.mmo;
    }

    public final void dod() {
        com.thinkup.core.common.nn.m.n.d().q(new com.thinkup.core.common.nn.m.o(com.thinkup.core.common.nn.m.q.onm, new Runnable() { // from class: com.thinkup.core.common.o.nd.10
            @Override // java.lang.Runnable
            public final void run() {
                com.thinkup.core.common.n0.m.d().m();
            }
        }));
    }

    public final List<String> md(String str) {
        return this.dnd.get(str);
    }

    public final List<String> mn(String str) {
        return this.dnd.get(str + "_network_firm_a_s");
    }

    public final List<String> mo(String str) {
        return this.dnd.get(str + "_network_firm_f_s");
    }

    public final ITUAdFilter mq(String str) {
        ConcurrentHashMap<String, ITUAdFilter> concurrentHashMap;
        if (TextUtils.isEmpty(str) || (concurrentHashMap = this.dom) == null) {
            return null;
        }
        return concurrentHashMap.get(str);
    }

    public final void n(Map<String, Object> map) {
        if (map == null || map.isEmpty()) {
            return;
        }
        if (map.containsKey("mmed_m_a_c")) {
            Object obj = map.get("mmed_m_a_c");
            if (obj instanceof JSONObject) {
                this.mmo = (JSONObject) obj;
            }
        }
        for (String str : mmq) {
            if (!map.containsKey(str)) {
                return;
            }
        }
        if (map.containsKey(f73037dn)) {
            Object obj2 = map.get(f73037dn);
            if (obj2 instanceof Integer) {
                this.mdo = ((Integer) obj2).intValue();
            }
        }
        if (map.containsKey(f231do)) {
            Object obj3 = map.get(f231do);
            if (obj3 instanceof Integer) {
                this.mdq = ((Integer) obj3).intValue();
            }
        }
        if (map.containsKey(f73038dq)) {
            Object obj4 = map.get(f73038dq);
            if (obj4 instanceof Integer) {
                this.mm0 = ((Integer) obj4).intValue();
            }
        }
        if (map.containsKey(f73040m0)) {
            Object obj5 = map.get(f73040m0);
            if (obj5 instanceof Boolean) {
                this.mmd = ((Boolean) obj5).booleanValue();
            }
        }
        if (map.containsKey(f73041md)) {
            Object obj6 = map.get(f73041md);
            if (obj6 instanceof String) {
                this.mmm = (String) obj6;
            }
        }
        this.mmn = true;
    }

    public final String n0() {
        try {
            if (TextUtils.isEmpty(this.f73061oo)) {
                d(this.f73051nd, this.f73052nm, 0);
            }
        } catch (Exception unused) {
        }
        return this.f73061oo;
    }

    public final void nd(String str) {
        if (qm()) {
            "setBundleName: ".concat(String.valueOf(str));
        }
        this.dqm = str;
    }

    public final void nm(String str) {
        if (TextUtils.isEmpty(str) || this.mdm.isEmpty()) {
            return;
        }
        this.mdm.remove(str);
    }

    public final TUAdFilter nn(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        return this.mdn.get(str);
    }

    public final void no() {
        try {
            com.thinkup.core.common.nn.m0.d(this.f73051nd);
            com.thinkup.core.common.nn.m0.mo(this.f73051nd);
        } catch (Exception unused) {
        }
        if (qm()) {
            String strO = com.thinkup.core.common.nn.m0.o(this.f73051nd);
            com.thinkup.core.common.nn.mn.d();
            com.thinkup.core.common.nn.m0.mq(this.f73051nd);
            com.thinkup.core.common.nn.m0.qn();
            com.thinkup.core.common.nn.mn.d();
            TextUtils.isEmpty(strO);
        }
    }

    public final String nq() {
        return this.m0n;
    }

    public final void o(String str, List<String> list) {
        if (qm()) {
            String.format("setForbidShowNetworkFirmIdList, placementId=%s, ForbidShowList=%s", str, list);
        }
        if (TextUtils.isEmpty(str)) {
            return;
        }
        this.dnd.remove(str + "_network_firm_a_s");
        ArrayList arrayList = new ArrayList();
        if (list != null) {
            for (String str2 : list) {
                if (!TextUtils.isEmpty(str2)) {
                    arrayList.add(str2);
                }
            }
        }
        int size = arrayList.size();
        ConcurrentHashMap<String, List<String>> concurrentHashMap = this.dnd;
        if (size == 0) {
            concurrentHashMap.remove(str + "_network_firm_f_s");
            return;
        }
        concurrentHashMap.put(str + "_network_firm_f_s", arrayList);
    }

    public final boolean om() {
        return this.dno && this.dnn != null;
    }

    public final TUDebuggerConfig on() {
        return this.dnn;
    }

    public final String oo() {
        if (TextUtils.isEmpty(this.f73066qm)) {
            String strN = q0.n(this.f73051nd, nm.m.f73146d, nm.d.f73131nq, "");
            this.f73066qm = strN;
            TextUtils.isEmpty(strN);
        }
        return this.f73066qm;
    }

    public final String oq() {
        if (TextUtils.isEmpty(this.f73067qn)) {
            this.f73067qn = q0.n(this.f73051nd, nm.m.f73147d0, nm.d.f73137oo, "");
        }
        return this.f73067qn;
    }

    public final String q0() {
        if (TextUtils.isEmpty(this.f73068qo)) {
            this.f73068qo = q0.n(this.f73051nd, nm.m.f73147d0, nm.d.f73138oq, "");
        }
        return this.f73068qo;
    }

    public final int qd() {
        return this.m0o;
    }

    public final boolean qm() {
        return this.d0d || this.d0m;
    }

    public final void qn() {
        com.thinkup.core.common.dm.m0 m0Var;
        try {
            if (this.m0q != null) {
                if (this.f73051nd == null || TextUtils.isEmpty(this.f73052nm)) {
                    com.thinkup.core.common.dm.m0 m0Var2 = new com.thinkup.core.common.dm.m0();
                    m0Var2.d0o(((Integer) this.m0q.first).intValue());
                    Object obj = this.m0q.second;
                    if (obj != null) {
                        m0Var2.o0(((List) obj).toString());
                    }
                    this.md0 = new Pair<>(Boolean.FALSE, m0Var2);
                    return;
                }
                com.thinkup.core.q.m mVarM = com.thinkup.core.q.o.d(this.f73051nd).m(this.f73052nm);
                if (mVarM == null) {
                    com.thinkup.core.common.dm.m0 m0Var3 = new com.thinkup.core.common.dm.m0();
                    m0Var3.d0o(((Integer) this.m0q.first).intValue());
                    Object obj2 = this.m0q.second;
                    if (obj2 != null) {
                        m0Var3.o0(((List) obj2).toString());
                    }
                    this.md0 = new Pair<>(Boolean.FALSE, m0Var3);
                    return;
                }
                if (mVarM.o() == 1) {
                    Pair<Boolean, com.thinkup.core.common.dm.m0> pair = this.md0;
                    if (pair == null || ((Boolean) pair.first).booleanValue()) {
                        m0Var = new com.thinkup.core.common.dm.m0();
                        m0Var.d0o(((Integer) this.m0q.first).intValue());
                        Object obj3 = this.m0q.second;
                        if (obj3 != null) {
                            m0Var.o0(((List) obj3).toString());
                        }
                    } else {
                        m0Var = (com.thinkup.core.common.dm.m0) this.md0.second;
                        this.md0 = null;
                    }
                    com.thinkup.core.common.nm.q.d(m().f73051nd);
                    com.thinkup.core.common.nm.q.d(27, m0Var);
                }
            }
        } catch (Exception e10) {
            e10.printStackTrace();
        }
    }

    public final Pair<Integer, List<String>> qo() {
        return this.m0q;
    }

    public final List<String> qq() {
        return this.dnd.get("forbid_network_firm_list");
    }

    @Deprecated
    private void nq(String str) {
        this.dnm = str;
    }

    public final Map<String, Object> md() {
        return this.f73057o0;
    }

    private static void md(Context context) {
        com.thinkup.core.common.dd.n.d().d(context);
    }

    private static void om(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        try {
            Long.parseLong(str);
        } catch (Exception unused) {
        }
    }

    public final String nn() {
        return this.dmo;
    }

    public final boolean nd() {
        return "1".equals(this.dmo);
    }

    public final void n0(String str) {
        this.don = str;
    }

    public final String mq() {
        return this.f73053nn;
    }

    public final Location nm() {
        return this.dmn;
    }

    public final String mn() {
        Object obj = this.f73057o0.get("sub_channel");
        return obj != null ? obj.toString() : "";
    }

    public final String mo() {
        return this.f73052nm;
    }

    public final Context dd() {
        return this.f73051nd;
    }

    private void dd(Context context) {
        int iD = com.thinkup.core.common.nn.mo.d(context, "common_custom_pg", "string");
        if (iD > 0) {
            this.m0n = context.getResources().getString(iD);
        }
    }

    public final boolean od() {
        return this.dno;
    }

    private Map<String, Object> no(String str) {
        if (this.f73058od == null || TextUtils.isEmpty(str)) {
            return null;
        }
        return this.f73058od.get(str);
    }

    public final List<String> mm(String str) {
        return this.dnd.get(str + "_network_firm");
    }

    public final String mm() {
        Object obj = this.f73057o0.get("channel");
        return obj != null ? obj.toString() : "";
    }

    public final String[] d0() {
        synchronized (this.f73060on) {
            Set<String> setKeySet = this.f73060on.keySet();
            int size = setKeySet.size();
            if (size <= 0) {
                return null;
            }
            String[] strArr = new String[size];
            setKeySet.toArray(strArr);
            return strArr;
        }
    }

    public final long dn() {
        return this.d0o;
    }

    public static boolean dn(String str) {
        try {
            Class.forName(str);
            return true;
        } catch (Throwable unused) {
            return false;
        }
    }

    public static boolean o0() {
        return !m.n().m();
    }

    public static /* synthetic */ void dn(nd ndVar) {
        try {
            ndVar.mdq = MediationUtilsManager.getInstance(ndVar.f73051nd).getDynamicScore();
            ndVar.mmd = MediationUtilsManager.getInstance(ndVar.f73051nd).isHighConsumption();
        } catch (Throwable unused) {
        }
    }

    public final List<String> dq() {
        return this.dn0;
    }

    public final void dq(String str) {
        this.f73068qo = str;
        q0.m(this.f73051nd, nm.m.f73147d0, nm.d.f73138oq, str);
    }

    public final void d0(String str) {
        this.dd0 = str;
        this.f73057o0.put("sub_channel", str);
    }

    private void d0(boolean z10) {
        this.do0 = z10;
    }

    public final int q() {
        return this.dnq;
    }

    public final void q(String str) {
        this.d0q = str;
        this.f73057o0.put("channel", str);
    }

    public final long q(int i10) {
        if (i10 != 1 && i10 != 4 && i10 != 5) {
            return 26214400L;
        }
        com.thinkup.core.q.o.d(this.f73051nd);
        return com.thinkup.core.q.o.m() * 1024;
    }

    public final void q(boolean z10) {
        this.dqo = z10;
        try {
            synchronized (this.mdd) {
                try {
                    if (!this.mdd.isEmpty()) {
                        for (m0 m0Var : this.mdd) {
                            if (m0Var != null) {
                                m0Var.d(z10);
                            }
                        }
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        } catch (Exception unused) {
        }
    }

    public static void q(Context context) {
        m().dm(context);
        m().m(com.thinkup.core.q.o.d());
    }

    public final Map<String, Object> o(String str) {
        Object obj;
        Object obj2;
        HashMap map = new HashMap();
        Map<String, Object> map2 = this.f73058od.get(str);
        ConcurrentHashMap<String, Object> concurrentHashMap = this.f73057o0;
        if (concurrentHashMap != null) {
            com.thinkup.core.common.nn.dn.d(map, concurrentHashMap);
        }
        if (map2 != null) {
            com.thinkup.core.common.nn.dn.d(map, map2);
        }
        map.remove("channel");
        map.remove("sub_channel");
        if (map2 != null) {
            obj = map2.get("channel");
            obj2 = map2.get("sub_channel");
        } else {
            obj = null;
            obj2 = null;
        }
        if (obj == null) {
            obj = this.f73057o0.get("channel");
        }
        if (obj2 == null) {
            obj2 = this.f73057o0.get("sub_channel");
        }
        if (obj != null) {
            map.put("channel", obj);
        }
        if (obj2 != null) {
            map.put("sub_channel", obj2);
        }
        return map;
    }

    private void q(String str, List<TUAdInfo> list) {
        com.thinkup.core.q.mm mmVarD;
        com.thinkup.core.q.m0 m0VarD0;
        try {
            Context context = this.f73051nd;
            if (context == null || (mmVarD = com.thinkup.core.q.mm.d(context)) == null || (m0VarD0 = mmVarD.d0(str)) == null) {
                return;
            }
            com.thinkup.core.common.d0 d0VarD = com.thinkup.core.common.d0.d(this.f73051nd, str, String.valueOf(m0VarD0.dqm()));
            if (d0VarD != null) {
                d0VarD.d(list);
            }
        } catch (Exception unused) {
        }
    }

    public static boolean o(Context context, List<String> list) {
        boolean z10 = true;
        if (list == null || list.size() == 0) {
            return true;
        }
        StringBuilder sb2 = new StringBuilder();
        try {
            ApplicationInfo applicationInfo = context.getPackageManager().getApplicationInfo(context.getPackageName(), 128);
            int size = list.size();
            for (int i10 = 0; i10 < size; i10++) {
                String str = list.get(i10);
                if (TextUtils.isEmpty(applicationInfo.metaData.getString(str))) {
                    sb2.append(", \"");
                    sb2.append(str);
                    sb2.append("\"");
                    z10 = false;
                }
            }
            if (sb2.length() > 2) {
                sb2.delete(0, 2);
            }
            return z10;
        } catch (Throwable th2) {
            th2.printStackTrace();
            return false;
        }
    }

    /* JADX INFO: renamed from: do, reason: not valid java name */
    public final int m302do() {
        return this.f73047mn;
    }

    /* JADX INFO: renamed from: do, reason: not valid java name */
    public final void m303do(String str) {
        this.f73067qn = str;
        q0.m(this.f73051nd, nm.m.f73147d0, nm.d.f73137oo, str);
    }

    public final void o(Context context) {
        String strD = com.thinkup.core.q.o.d(context).d(this.f73052nm);
        if (!TextUtils.isEmpty(strD)) {
            com.thinkup.core.q.o.d(context).d(this.f73052nm, this.f73053nn, strD);
        }
        com.thinkup.core.q.o.d(context).m(this.f73052nm);
    }

    public final void o(int i10) {
        this.m0o = i10;
    }

    public final String o() {
        return this.f73055nq;
    }

    public final void o(boolean z10) {
        this.dod = z10;
    }

    public static /* synthetic */ void o(nd ndVar) {
        com.thinkup.core.common.nn.m.n.d().q(new com.thinkup.core.common.nn.m.o(com.thinkup.core.common.nn.m.q.qdm, ndVar.new AnonymousClass16()));
    }

    public final boolean n(String str) {
        boolean zContainsKey;
        synchronized (this.f73060on) {
            zContainsKey = this.f73060on.containsKey(str);
        }
        return zContainsKey;
    }

    public static boolean n(Context context, List<String> list) {
        PackageInfo packageInfo;
        boolean z10 = true;
        if (list == null) {
            return true;
        }
        StringBuilder sb2 = new StringBuilder();
        try {
            packageInfo = context.getPackageManager().getPackageInfo(context.getPackageName(), 8);
        } catch (Throwable th2) {
            sb2.append(", error: ");
            sb2.append(th2.getMessage());
            packageInfo = null;
            z10 = false;
        }
        if (packageInfo == null) {
            return false;
        }
        ProviderInfo[] providerInfoArr = packageInfo.providers;
        for (String str : list) {
            int length = providerInfoArr.length;
            int i10 = 0;
            while (true) {
                if (i10 < length) {
                    if (TextUtils.equals(providerInfoArr[i10].name, str)) {
                        break;
                    }
                    i10++;
                } else {
                    sb2.append(", ");
                    sb2.append(str);
                    z10 = false;
                    break;
                }
            }
        }
        if (sb2.length() > 2) {
            sb2.delete(0, 2);
        }
        return z10;
    }

    public static boolean n(int i10) {
        try {
            int requireAdapterBridgeVersion = TUSDK.getRequireAdapterBridgeVersion();
            if (i10 == requireAdapterBridgeVersion) {
                return true;
            }
            String.format("Adapter Bridge Version: The current Adapter Bridge version(%s) does not apply to the SDK Require version(%s).", Integer.valueOf(i10), Integer.valueOf(requireAdapterBridgeVersion));
            return false;
        } catch (Throwable unused) {
            return false;
        }
    }

    public final void n(Context context) {
        o(context);
    }

    public static void n(Runnable runnable) {
        com.thinkup.core.common.nn.m.n.d().m(runnable);
    }

    public final TUCustomAdapterConfig m(String str) {
        if (this.f73059om == null || TextUtils.isEmpty(str)) {
            return null;
        }
        return this.f73059om.get(str);
    }

    public final void n(boolean z10) {
        this.ddd = z10;
    }

    private void m(String str, String str2) {
        this.f73052nm = str;
        this.f73053nn = str2;
    }

    public final void n(String str, List<String> list) {
        if (qm()) {
            String.format("setAllowedShowNetworkFimIdList, placementId=%s, allowShowList=%s", str, list);
        }
        if (TextUtils.isEmpty(str)) {
            return;
        }
        this.dnd.remove(str + "_network_firm_f_s");
        ArrayList arrayList = new ArrayList();
        if (list != null) {
            for (String str2 : list) {
                if (!TextUtils.isEmpty(str2)) {
                    arrayList.add(str2);
                }
            }
        }
        int size = arrayList.size();
        ConcurrentHashMap<String, List<String>> concurrentHashMap = this.dnd;
        if (size == 0) {
            concurrentHashMap.remove(str + "_network_firm_a_s");
            return;
        }
        concurrentHashMap.put(str + "_network_firm_a_s", arrayList);
    }

    public final void m(int i10) {
        this.f73047mn = i10;
    }

    public final JSONArray m0() {
        return this.dmq;
    }

    private void m(Context context, String str) {
        d(new AnonymousClass4(context, str));
    }

    public final void m0(String str) {
        q0.m(this.f73051nd, nm.m.f73146d, nm.d.f73131nq, str);
        this.f73066qm = str;
    }

    public final void m(final Context context) {
        if (qm()) {
            com.thinkup.core.common.nn.m.n.d().q(new com.thinkup.core.common.nn.m.o(com.thinkup.core.common.nn.m.q.qdn, new Runnable() { // from class: com.thinkup.core.common.o.nd.5
                @Override // java.lang.Runnable
                public final void run() {
                    try {
                        Object obj = a.f100437f;
                    } catch (Throwable unused) {
                    }
                    try {
                        ArrayList arrayList = new ArrayList();
                        Enumeration<String> enumerationEntries = new DexFile(context.getPackageCodePath()).entries();
                        while (enumerationEntries.hasMoreElements()) {
                            String strNextElement = enumerationEntries.nextElement();
                            if (strNextElement.contains("com.thinkup.network") && strNextElement.contains("InitManager") && !strNextElement.contains("$")) {
                                arrayList.add(strNextElement);
                            }
                        }
                        arrayList.size();
                        Iterator it = arrayList.iterator();
                        while (it.hasNext()) {
                            try {
                                Object objInvoke = null;
                                try {
                                    objInvoke = Class.forName((String) it.next()).getDeclaredMethod("getInstance", null).invoke(null, null);
                                } catch (Throwable unused2) {
                                }
                                if (objInvoke != null && (objInvoke instanceof TUInitMediation)) {
                                    TUInitMediation tUInitMediation = (TUInitMediation) objInvoke;
                                    String networkName = tUInitMediation.getNetworkName();
                                    if (!TextUtils.isEmpty(networkName)) {
                                        if (TextUtils.isEmpty(tUInitMediation.getNetworkVersion())) {
                                            "NetworkName: ".concat(String.valueOf(networkName));
                                        }
                                        boolean zDn = nd.dn(tUInitMediation.getNetworkSDKClass());
                                        boolean zM = nd.m(tUInitMediation.getPluginClassStatus());
                                        boolean zD = nd.d(context, (List<String>) tUInitMediation.getActivityStatus());
                                        boolean zM2 = nd.m(context, (List<String>) tUInitMediation.getServiceStatus());
                                        boolean zN = nd.n(context, (List<String>) tUInitMediation.getProviderStatus());
                                        boolean zO = nd.o(context, (List<String>) tUInitMediation.getMetaValutStatus());
                                        nd.q(context, (List<String>) tUInitMediation.getPermissionStatus());
                                        TextUtils.isEmpty(nd.this.d(context, tUInitMediation.getResourceStatus(), tUInitMediation.getDevBundleName()));
                                        try {
                                            nd.n(tUInitMediation.getAdapterBridgeVersion());
                                        } catch (Throwable unused3) {
                                        }
                                        if (!zDn || !zM || !zD || !zM2 || !zN || zO) {
                                        }
                                    }
                                }
                            } catch (Throwable unused4) {
                            }
                        }
                    } catch (Exception unused5) {
                    }
                }
            }));
        }
    }

    public static boolean m(Map<String, Boolean> map) {
        boolean z10 = true;
        if (map == null) {
            return true;
        }
        StringBuilder sb2 = new StringBuilder();
        for (String str : map.keySet()) {
            if (!map.get(str).booleanValue()) {
                sb2.append(", ");
                sb2.append(str);
                z10 = false;
            }
        }
        if (sb2.length() > 2) {
            sb2.delete(0, 2);
        }
        if (z10) {
            return z10;
        }
        "Dependence Plugin: Missing ".concat(String.valueOf(sb2));
        return z10;
    }

    public final boolean d() {
        return this.ddm;
    }

    private static Object d(Class<?> cls, String str) {
        if (!TextUtils.isEmpty(str)) {
            try {
                Constructor declaredConstructor = Class.forName(str).asSubclass(cls).getDeclaredConstructor(null);
                declaredConstructor.setAccessible(true);
                return declaredConstructor.newInstance(null);
            } catch (Throwable unused) {
            }
        }
        return null;
    }

    public static boolean m(Context context, List<String> list) {
        boolean z10 = true;
        if (list == null) {
            return true;
        }
        StringBuilder sb2 = new StringBuilder();
        PackageManager packageManager = context.getPackageManager();
        for (String str : list) {
            try {
                if (packageManager.queryIntentServices(new Intent(context, Class.forName(str)), 131072).size() <= 0) {
                    sb2.append(", ");
                    sb2.append(str);
                    z10 = false;
                }
            } catch (Throwable th2) {
                sb2.append(", error: ");
                sb2.append(th2.getMessage());
            }
        }
        if (sb2.length() > 2) {
            sb2.delete(0, 2);
        }
        return z10;
    }

    public final n0 n() {
        IExHandler iExHandler;
        IDlHandler iDlHandler;
        IOdHandler iOdHandler;
        if (this.f73049mq) {
            return this.f73069qq;
        }
        synchronized (this.dqd) {
            if (this.f73049mq) {
                return this.f73069qq;
            }
            IOsExHandler iOsExHandler = null;
            try {
                iExHandler = (IExHandler) d((Class<?>) IExHandler.class, "");
            } catch (Throwable unused) {
                iExHandler = null;
            }
            try {
                iDlHandler = (IDlHandler) d((Class<?>) IDlHandler.class, dn.dd.f72651n);
            } catch (Throwable unused2) {
                iDlHandler = null;
            }
            try {
                iOdHandler = (IOdHandler) d((Class<?>) IOdHandler.class, dn.dd.f72652o);
            } catch (Throwable unused3) {
                iOdHandler = null;
            }
            try {
                iOsExHandler = (IOsExHandler) d((Class<?>) IOsExHandler.class, dn.dd.f72653q);
            } catch (Throwable unused4) {
            }
            if (iExHandler != null || iDlHandler != null || iOdHandler != null || iOsExHandler != null) {
                this.f73069qq = new n0(iExHandler, iDlHandler, iOdHandler, iOsExHandler);
            }
            this.f73049mq = true;
            return this.f73069qq;
        }
    }

    public final void d(String str) {
        this.f73055nq = str;
    }

    public final synchronized void d(String str, TUCustomAdapterConfig tUCustomAdapterConfig) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        if (this.f73059om == null) {
            this.f73059om = new ConcurrentHashMap<>();
        }
        ConcurrentHashMap<String, TUCustomAdapterConfig> concurrentHashMap = this.f73059om;
        if (tUCustomAdapterConfig == null) {
            concurrentHashMap.remove(str);
        } else {
            concurrentHashMap.put(str, tUCustomAdapterConfig);
        }
    }

    private boolean m(Context context, List<String> list, String str) {
        return TextUtils.isEmpty(d(context, list, str));
    }

    public static void m(Runnable runnable) {
        com.thinkup.core.common.nn.m.n.d().d(runnable);
    }

    public static void m(Runnable runnable, long j10) {
        if (j10 > 0) {
            com.thinkup.core.common.nn.m.n.d().m(new com.thinkup.core.common.nn.m.o(com.thinkup.core.common.nn.m.q.qdd, runnable), j10);
        } else {
            runnable.run();
        }
    }

    public static void n(com.thinkup.core.q.m mVar) {
        if (mVar == null) {
            return;
        }
        m().d(mVar.n00());
        com.thinkup.core.common.m.d0.d().d0();
        com.thinkup.core.common.nn.m.n.d().d(com.thinkup.core.common.m.q.d(mVar.n0m()));
        com.thinkup.core.common.m.d0.d().dq();
    }

    public final void d(int i10) {
        if (i10 == 2) {
            this.dnq = 2;
        } else {
            this.dnq = 1;
        }
    }

    public final void m(boolean z10) {
        this.d0m = z10;
    }

    public final void m(String str, List<String> list) {
        if (qm()) {
            String.format("setFilterNetworkFirmIdList, placementId=%s, networkFilmIdList=%s", str, list);
        }
        if (TextUtils.isEmpty(str)) {
            return;
        }
        ConcurrentHashMap<String, List<String>> concurrentHashMap = this.dnd;
        if (list == null) {
            concurrentHashMap.remove(str + "_network_firm");
            return;
        }
        concurrentHashMap.put(str + "_network_firm", list);
    }

    public final void d(String... strArr) {
        synchronized (this.f73060on) {
            try {
                if (strArr != null) {
                    for (String str : strArr) {
                        this.f73060on.put(str, Boolean.TRUE);
                    }
                } else {
                    this.f73060on.clear();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public static /* synthetic */ void n(nd ndVar) {
        com.thinkup.core.common.q.d.d();
        com.thinkup.core.common.q.m mVarD = com.thinkup.core.common.q.d.d(ndVar.f73051nd);
        if (mVarD != null) {
            ndVar.d(mVarD.m(), false, mVarD.d(), mVarD.n());
        }
    }

    public final void d(Context context) {
        if (context == null) {
            return;
        }
        this.f73051nd = context;
    }

    public final void d(Map<String, Object> map) {
        String string;
        String string2 = "";
        if (map != null && map.containsKey("channel")) {
            Object obj = map.get("channel");
            if (obj == null) {
                string = "";
            } else {
                string = obj.toString();
            }
            this.d0q = string;
            if (!com.thinkup.core.common.nn.mn.d(string)) {
                this.d0q = null;
                map.remove("channel");
            }
        }
        if (map != null && map.containsKey("sub_channel")) {
            Object obj2 = map.get("sub_channel");
            if (obj2 != null) {
                string2 = obj2.toString();
            }
            this.dd0 = string2;
            if (!com.thinkup.core.common.nn.mn.m(string2)) {
                this.dd0 = null;
                map.remove("sub_channel");
            }
        }
        this.f73057o0.clear();
        if (map != null) {
            com.thinkup.core.common.nn.dn.d(this.f73057o0, map);
        }
        if (!TextUtils.isEmpty(this.d0q)) {
            this.f73057o0.put("channel", this.d0q);
        }
        if (TextUtils.isEmpty(this.dd0)) {
            return;
        }
        this.f73057o0.put("sub_channel", this.dd0);
    }

    public final void m(List<String> list) {
        if (qm()) {
            String.format("setForbidNetworkFirmIdList, ForbidList=%s", list);
        }
        ArrayList arrayList = new ArrayList();
        if (list != null) {
            for (String str : list) {
                if (!TextUtils.isEmpty(str)) {
                    arrayList.add(str);
                }
            }
        }
        int size = arrayList.size();
        ConcurrentHashMap<String, List<String>> concurrentHashMap = this.dnd;
        if (size == 0) {
            concurrentHashMap.remove("forbid_network_firm_list");
        } else {
            concurrentHashMap.put("forbid_network_firm_list", arrayList);
        }
    }

    public static /* synthetic */ void n(nd ndVar, Context context) {
        try {
            com.thinkup.core.common.q.m mVar = ndVar.m0m;
            if (mVar != null) {
                com.thinkup.core.common.nm.d0.d(mVar);
                return;
            }
            Object objInvoke = null;
            try {
                objInvoke = Class.forName("com.thinkup.network.adx.AdxTUInitManager").getDeclaredMethod("getInstance", null).invoke(null, null);
            } catch (Throwable unused) {
            }
            if (objInvoke instanceof TUInitMediation) {
                TUInitMediation tUInitMediation = (TUInitMediation) objInvoke;
                HashMap map = new HashMap();
                map.put(TUAdConst.NETWORK_REQUEST_PARAMS_KEY.ADX_PRECHECK_MODE, 1);
                com.thinkup.core.bridge.entity.d dVar = new com.thinkup.core.bridge.entity.d();
                dVar.d();
                dVar.d(com.thinkup.core.common.nn.mn.d());
                dVar.m(ndVar.f73052nm);
                dVar.n(ndVar.f73053nn);
                map.put(com.thinkup.core.bridge.d.C0834d.f67342m, com.thinkup.core.bridge.n.d(dVar));
                com.thinkup.core.bridge.entity.o oVar = new com.thinkup.core.bridge.entity.o();
                oVar.d(ndVar.oo());
                oVar.dd(com.thinkup.core.common.nn.m0.o(context));
                oVar.n(com.thinkup.core.common.nn.m0.mq(context));
                oVar.q(com.thinkup.core.common.nn.m0.qo());
                oVar.d0(com.thinkup.core.common.nn.m0.qq());
                map.put(com.thinkup.core.bridge.d.C0834d.f67341d, com.thinkup.core.bridge.n.d(oVar));
                String[] strArrD0 = ndVar.d0();
                if (strArrD0 != null && strArrD0.length > 0) {
                    map.put(TUAdConst.NETWORK_REQUEST_PARAMS_KEY.ADX_DENNY_DEVICE_INFO, strArrD0);
                }
                tUInitMediation.initSDK(context, map, ndVar.new AnonymousClass17(context));
            }
        } catch (Throwable unused2) {
        }
    }

    public final void m(m0 m0Var) {
        if (m0Var != null) {
            try {
                synchronized (this.mdd) {
                    this.mdd.remove(m0Var);
                }
            } catch (Exception unused) {
            }
        }
    }

    public final void m(String str, TUAdFilter tUAdFilter) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        this.mdn.put(str, tUAdFilter);
    }

    public final void m(com.thinkup.core.q.m mVar) {
        if (this.dm0) {
            return;
        }
        synchronized (this.dmd) {
            try {
                if (!this.dm0) {
                    n(mVar);
                    this.dm0 = true;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void d(String str, Map<String, Object> map) {
        if (map != null) {
            this.f73058od.put(str, map);
        }
    }

    public final void d(List<String> list) {
        try {
            this.dn0 = list;
            if (list != null && !list.isEmpty()) {
                this.dmq = new JSONArray((Collection) list);
            } else {
                this.dmq = null;
            }
        } catch (Exception unused) {
        }
    }

    private void m(long j10) {
        this.dqn = j10;
    }

    public static /* synthetic */ void m(nd ndVar) {
        boolean zExists = false;
        if (ndVar.f73051nd != null) {
            try {
                zExists = new File(ndVar.f73051nd.getExternalFilesDir(null), ndVar.d00).exists();
                if (!zExists) {
                    zExists = new File(ndVar.f73051nd.getFilesDir(), ndVar.d00).exists();
                }
            } catch (Throwable th2) {
                th2.printStackTrace();
            }
        }
        ndVar.d0d = zExists;
    }

    public final synchronized void d(Location location) {
        this.dmn = location;
    }

    public final synchronized void d(boolean z10) {
        try {
            this.dmo = z10 ? "1" : "2";
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public final synchronized void d(final Context context, String str, String str2, TUNetworkConfig tUNetworkConfig) {
        try {
            if (this.f73056o) {
                return;
            }
            this.f73056o = true;
            this.f73051nd = context.getApplicationContext();
            if (context instanceof Activity) {
                d((Activity) context);
            }
            this.f73054no = tUNetworkConfig;
            try {
                this.dqq = System.currentTimeMillis();
                this.f73063q = 0L;
                d(this.f73051nd);
                this.f73052nm = str;
                this.f73053nn = str2;
                com.thinkup.core.common.nm.d.d.d().d0();
                m.n().d((Application) this.f73051nd);
            } catch (Throwable unused) {
            }
            d(new Runnable() { // from class: com.thinkup.core.common.o.nd.11
                @Override // java.lang.Runnable
                public final void run() {
                    nd.d(nd.this, context);
                    nd.m(nd.this);
                    com.thinkup.core.common.d.o.d(context).d();
                    com.thinkup.core.common.n0.m mVarD = com.thinkup.core.common.n0.m.d();
                    Context context2 = context;
                    String[] strArr = {nm.m.f73146d, nm.m.f73157n, nm.m.f73148dd, nm.m.f73149dm, nm.m.f73150dn, nm.m.f233do, nm.m.f73151dq, "thinkup_app_pl_cl_retry", nm.m.f73158o};
                    for (int i10 = 0; i10 < 9; i10++) {
                        com.thinkup.core.common.n0.d dVarM = mVarD.m(context2, strArr[i10]);
                        if (dVarM instanceof com.thinkup.core.common.n0.m.q) {
                            ((com.thinkup.core.common.n0.m.q) dVarM).o();
                        }
                    }
                    nd.n(nd.this);
                }
            });
            dm(context);
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public static nd m() {
        if (f73043n0 == null) {
            synchronized (nd.class) {
                try {
                    if (f73043n0 == null) {
                        f73043n0 = new nd();
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        return f73043n0;
    }

    public static void d(Runnable runnable) {
        com.thinkup.core.common.nn.m.n.d().d(new com.thinkup.core.common.nn.m.o(com.thinkup.core.common.nn.m.q.qdo, runnable));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d(String str, boolean z10, int i10, String str2) {
        boolean z11 = TUCommonConfig.isShowInitErrorTips;
        if (z10) {
            com.thinkup.core.common.nm.d0.d(new com.thinkup.core.common.q.m(i10, str, str2));
        } else {
            this.m0m = new com.thinkup.core.common.q.m(i10, str, str2);
        }
    }

    public final void d(Context context, String str, TUDebuggerConfig tUDebuggerConfig) {
        n0 n0VarN;
        if (context == null) {
            qm();
            return;
        }
        if (m().f73051nd == null) {
            m().d(context.getApplicationContext());
        }
        this.dnm = str;
        this.dnn = tUDebuggerConfig;
        String strO = com.thinkup.core.common.nn.m0.o(context);
        boolean z10 = true;
        if (TextUtils.isEmpty(strO) || !strO.equals(this.dnm)) {
            String strD0 = com.thinkup.core.common.nn.m0.d0();
            if ((TextUtils.isEmpty(strD0) || !strD0.equals(this.dnm)) && ((n0VarN = m().n()) == null || !n0VarN.checkDebuggerDevice(context, this.dnm))) {
                z10 = false;
            }
        }
        this.dno = z10;
        if (TextUtils.isEmpty(this.dnm)) {
            qm();
            this.dno = false;
        } else {
            if (this.dno) {
                qm();
                if (this.dnn != null) {
                    qm();
                    return;
                }
                return;
            }
            qm();
        }
    }

    public final long dm() {
        return this.d0n;
    }

    public final void dm(String str) {
        if (TextUtils.isEmpty(this.dnm)) {
            return;
        }
        if (TextUtils.equals(str, this.dnm)) {
            this.dno = true;
        }
        if (this.dno) {
            qm();
        }
    }

    public final long d(Context context, String str, int i10) {
        boolean z10;
        com.thinkup.core.q.m mVarM = com.thinkup.core.q.o.d(context).m(str);
        long jCurrentTimeMillis = System.currentTimeMillis();
        long jDdo = i10 == 0 ? mVarM.ddo() : mVarM.qm();
        synchronized (this.f73064q0) {
            try {
                if (this.f73044d0 == 0) {
                    this.f73044d0 = q0.m(this.f73051nd, nm.m.f73146d, nm.d.f73130no, 0L);
                }
                if (Math.max(0L, jCurrentTimeMillis - this.f73044d0) > jDdo) {
                    this.f73061oo = com.thinkup.core.common.nn.mm.d(str + jCurrentTimeMillis);
                    this.f73044d0 = jCurrentTimeMillis;
                    z10 = true;
                } else {
                    z10 = false;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        if (z10) {
            this.f73062oq.clear();
            HashMap map = new HashMap();
            map.put(nm.d.f73128nm, this.f73061oo);
            map.put(nm.d.f73130no, Long.valueOf(jCurrentTimeMillis));
            if (context != null) {
                try {
                    com.thinkup.core.common.n0.m.d().m(context, nm.m.f73146d).d(map);
                } catch (Throwable unused) {
                }
            }
            com.thinkup.core.common.nm.d0.d((String) null, "1", (String) null, String.valueOf(jCurrentTimeMillis));
            if (i10 == 0) {
                this.f73063q = jCurrentTimeMillis;
            }
            return jCurrentTimeMillis;
        }
        if (TextUtils.isEmpty(this.f73061oo)) {
            synchronized (this.f73064q0) {
                try {
                    if (TextUtils.isEmpty(this.f73061oo)) {
                        this.f73061oo = q0.n(context, nm.m.f73146d, nm.d.f73128nm, "");
                    }
                } catch (Throwable th3) {
                    throw th3;
                }
            }
        }
        return 0L;
    }

    public static boolean d(Context context, List<String> list) {
        boolean z10 = true;
        if (list == null) {
            return true;
        }
        StringBuilder sb2 = new StringBuilder();
        for (String str : list) {
            try {
                if (context.getPackageManager().queryIntentActivities(new Intent(context, Class.forName(str)), 131072).size() <= 0) {
                    sb2.append(", ");
                    sb2.append(str);
                    z10 = false;
                }
            } catch (Throwable th2) {
                sb2.append(", error: ");
                sb2.append(th2.getMessage());
            }
        }
        if (sb2.length() > 2) {
            sb2.delete(0, 2);
        }
        return z10;
    }

    public static void d(Runnable runnable, long j10) {
        com.thinkup.core.common.nn.m.n.d().d(runnable, j10);
    }

    private static long d(long j10) {
        Date date = new Date(j10);
        return new Date(date.getYear(), date.getMonth(), date.getDate()).getTime();
    }

    public static com.thinkup.core.common.p000do.q d(com.thinkup.core.common.d0 d0Var) {
        return new com.thinkup.core.common.mo.q(d0Var);
    }

    public final void d(String str, List<String> list) {
        if (qm()) {
            String.format("setFilterAdSourceIdList, placementId=%s, adSourceIdList=%s", str, list);
        }
        if (TextUtils.isEmpty(str)) {
            return;
        }
        ConcurrentHashMap<String, List<String>> concurrentHashMap = this.dnd;
        if (list == null) {
            concurrentHashMap.remove(str);
        } else {
            concurrentHashMap.put(str, list);
        }
    }

    public final void d(int i10, List<String> list) {
        if (qm()) {
            String.format("setForbidShowNetworkFirmIdList, risk=%s, ForbidList=%s", Integer.valueOf(i10), list);
        }
        this.m0q = new Pair<>(Integer.valueOf(i10), list);
        qn();
    }

    public final void d(ITUDeviceRiskListener iTUDeviceRiskListener) {
        this.f73045dd = iTUDeviceRiskListener;
    }

    public final void d(com.thinkup.core.q.m mVar) {
        if (mVar != null) {
            try {
                if (qm()) {
                    Objects.toString(this.f73045dd);
                }
                if (this.f73045dd != null) {
                    JSONObject jSONObject = new JSONObject();
                    String strOo = oo();
                    if (!TextUtils.isEmpty(strOo)) {
                        jSONObject.put("device_upid", strOo);
                    }
                    String strQ = mVar.q();
                    if (!TextUtils.isEmpty(strQ)) {
                        jSONObject.put("device_risk_labels", strQ);
                    }
                    this.f73045dd.onDeviceRiskInfo(jSONObject);
                }
            } catch (Exception e10) {
                e10.printStackTrace();
            }
        }
    }

    public static boolean d(List<String> list, String str) {
        return list != null && list.contains(str);
    }

    public final void d(final Context context, final DeviceInfoCallback deviceInfoCallback) {
        if (!qm()) {
            String strConcat = "Before call \"TUSDK.testModeDeviceInfo()\", you must to call \"TUSDK.setNetworkLogDebug(true);\" first. ".concat("Note: The call to the \"TUSDK.testModeDeviceInfo()\" method must be removed after the test is completed!!!");
            if (deviceInfoCallback != null) {
                deviceInfoCallback.deviceInfo(strConcat);
                return;
            }
            return;
        }
        if (this.f73056o) {
            com.thinkup.core.common.nn.m.n.d().d(new com.thinkup.core.common.nn.m.o(com.thinkup.core.common.nn.m.q.qdq, new Runnable() { // from class: com.thinkup.core.common.o.nd.6
                @Override // java.lang.Runnable
                public final void run() {
                    com.thinkup.core.q.m mVarM = com.thinkup.core.q.o.d(context).m(nd.m().mo());
                    String strD00 = mVarM != null ? mVarM.d00() : "";
                    boolean z10 = true;
                    if (!TextUtils.isEmpty(strD00)) {
                        try {
                            JSONObject jSONObject = new JSONObject(strD00);
                            if (!jSONObject.isNull("a") && jSONObject.optInt("a") != 1) {
                                z10 = false;
                            }
                        } catch (Exception unused) {
                        }
                    }
                    try {
                        JSONObject jSONObject2 = new JSONObject();
                        n0 n0VarN = nd.m().n();
                        if (n0VarN != null) {
                            n0VarN.fillTestDeviceData(jSONObject2, mVarM);
                        }
                        jSONObject2.put("GAID", com.thinkup.core.common.nn.m0.mq(context));
                        jSONObject2.put("AndroidID", z10 ? com.thinkup.core.common.nn.m0.o(context) : "");
                        jSONObject2.put("How to config TestMode", "Please visit the document center and learn more through: Integration(Basic) -> How To Test");
                        on.d("testModeDeviceInfo", jSONObject2.toString());
                        DeviceInfoCallback deviceInfoCallback2 = deviceInfoCallback;
                        if (deviceInfoCallback2 != null) {
                            deviceInfoCallback2.deviceInfo(jSONObject2.toString());
                        }
                    } catch (Throwable unused2) {
                    }
                }
            }));
        } else if (deviceInfoCallback != null) {
            deviceInfoCallback.deviceInfo("You should init SDK first.");
        }
    }

    public final void d(final com.thinkup.core.common.d0 d0Var, final String str, final String str2, final Map<String, Object> map) {
        if (this.f73056o && d0Var != null) {
            final boolean zM0 = d0Var.m0();
            oq oqVar = new oq();
            oqVar.d(map);
            oqVar.d(d0Var.mm());
            final com.thinkup.core.common.dm.d dVarM = d0Var.m(this.f73051nd, false, false, oqVar);
            com.thinkup.core.common.nn.m.n.d().d(new com.thinkup.core.common.nn.m.o(com.thinkup.core.common.nn.m.q.qd0, new Runnable() { // from class: com.thinkup.core.common.o.nd.7
                @Override // java.lang.Runnable
                public final void run() {
                    com.thinkup.core.q.m0 m0VarD = com.thinkup.core.q.mm.d(nd.this.f73051nd).d(d0Var.n());
                    String strMd = d0Var.md();
                    String strO = com.thinkup.core.common.nn.mn.o(str);
                    com.thinkup.core.common.dm.d dVar = dVarM;
                    if (dVar != null) {
                        com.thinkup.core.common.dm.m0 m0VarDo0 = dVar.dn().do0();
                        m0VarDo0.dq(1);
                        m0VarDo0.f68238qo = strO;
                        if (no.d().d(m0VarD)) {
                            qq.d(d0Var.n(), m0VarD, m0VarDo0);
                        }
                        com.thinkup.core.common.nm.q.d(nd.this.f73051nd);
                        com.thinkup.core.common.nm.q.d(16, m0VarDo0);
                        return;
                    }
                    if (TextUtils.isEmpty(strMd)) {
                        strMd = "";
                    }
                    com.thinkup.core.common.dm.m0 m0VarD2 = qq.d(strMd, d0Var.n(), m0VarD, 0, 0, map, null, 0, d0Var.mm(), d0Var);
                    m0VarD2.dq(zM0 ? 3 : 2);
                    if (m0VarD == null) {
                        m0VarD2.d0d(str2);
                    }
                    m0VarD2.f68238qo = strO;
                    if (no.d().d(m0VarD)) {
                        qq.d(d0Var.n(), m0VarD, m0VarD2);
                    }
                    com.thinkup.core.common.nm.q.d(nd.this.f73051nd);
                    com.thinkup.core.common.nm.q.d(16, m0VarD2);
                }
            }));
        }
    }

    public final void d(Activity activity) {
        WeakReference<Activity> weakReference = this.f73046dm;
        if (weakReference == null || weakReference.get() == null) {
            this.f73046dm = new WeakReference<>(activity);
        }
    }

    private void d(Context context, TUNetworkConfig tUNetworkConfig) {
        if (tUNetworkConfig == null) {
            tUNetworkConfig = new TUNetworkConfig();
        }
        List<TUInitConfig> tUInitConfigList = tUNetworkConfig.getTUInitConfigList();
        if (tUInitConfigList == null) {
            tUInitConfigList = new ArrayList<>(2);
        }
        try {
            if (om()) {
                tUInitConfigList.clear();
            }
        } catch (Throwable th2) {
            th2.printStackTrace();
            tUInitConfigList = new ArrayList<>(2);
        }
        boolean z10 = false;
        TUInitConfig tUInitConfig = null;
        if (Build.VERSION.SDK_INT != 29 && !d(m().qq(), "1")) {
            try {
                Constructor declaredConstructor = FacebookTUInitConfig.class.asSubclass(TUInitConfig.class).getDeclaredConstructor(null);
                declaredConstructor.setAccessible(true);
                TUInitConfig tUInitConfig2 = (TUInitConfig) declaredConstructor.newInstance(null);
                try {
                    tUInitConfigList.add(0, tUInitConfig2);
                } catch (Throwable unused) {
                }
                tUInitConfig = tUInitConfig2;
            } catch (Throwable unused2) {
            }
        }
        this.ddn = tUInitConfigList.size() > 0;
        for (TUInitConfig tUInitConfig3 : tUInitConfigList) {
            if (tUInitConfig3 != null) {
                if (tUInitConfig != null && TextUtils.equals(tUInitConfig.getClass().getSimpleName(), tUInitConfig3.getClass().getSimpleName())) {
                    if (!z10) {
                        z10 = true;
                    }
                }
                d(new AnonymousClass8(tUInitConfig3, context));
            }
        }
    }

    public final void d(String str, Map<String, Object> map, String... strArr) {
        com.thinkup.core.common.dm.m0 m0Var;
        if (map == null || map.containsKey(TUInitMediation.KEY_LOCAL)) {
            return;
        }
        try {
            m0Var = (com.thinkup.core.common.dm.m0) map.get("thinkup_tracking_info");
        } catch (Throwable unused) {
            m0Var = null;
        }
        map.remove("thinkup_tracking_info");
        q0.m(this.f73051nd, nm.m.f73148dd, str, new JSONObject(map).toString());
        if (m0Var == null || strArr == null) {
            return;
        }
        try {
            com.thinkup.core.common.nm.d0.d(m0Var, strArr[0], strArr.length > 1 ? strArr[1] : null);
        } catch (Throwable th2) {
            th2.printStackTrace();
        }
    }

    public final void d(String[] strArr, ITUAdFilter iTUAdFilter) {
        ConcurrentHashMap<String, ITUAdFilter> concurrentHashMap = this.dom;
        if (concurrentHashMap != null) {
            concurrentHashMap.clear();
        }
        if (strArr == null || strArr.length <= 0) {
            return;
        }
        if (this.dom == null) {
            this.dom = new ConcurrentHashMap<>();
        }
        for (String str : strArr) {
            this.dom.put(str, iTUAdFilter);
        }
    }

    public final void d(TUUserDeviceInfo tUUserDeviceInfo) {
        this.doo = tUUserDeviceInfo;
    }

    public static void d(Context context, String str) {
        if (context == null || TextUtils.isEmpty(str)) {
            return;
        }
        com.thinkup.core.q.mm.d(context.getApplicationContext()).m320do(str);
        com.thinkup.core.q.o.d(context.getApplicationContext()).o(str);
    }

    public static void d(TUSharedPlacementConfig tUSharedPlacementConfig) {
        no.d().d(tUSharedPlacementConfig);
    }

    public final void d(m0 m0Var) {
        if (m0Var != null) {
            try {
                synchronized (this.mdd) {
                    try {
                        if (!this.mdd.contains(m0Var)) {
                            this.mdd.add(m0Var);
                        }
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
            } catch (Exception unused) {
            }
        }
    }

    public final void d(String str, TUAdFilter tUAdFilter) {
        if (TextUtils.isEmpty(str) || tUAdFilter == null) {
            return;
        }
        this.mdm.put(str, tUAdFilter);
    }

    public static void d(String str, String str2) {
        com.thinkup.core.common.nm.d0.d("1", str, str2);
    }

    public final void d(Boolean bool) {
        if (bool != null) {
            synchronized (this.f73060on) {
                try {
                    boolean zBooleanValue = bool.booleanValue();
                    Map<String, Boolean> map = this.f73060on;
                    if (!zBooleanValue) {
                        map.put("sensor_deny", Boolean.TRUE);
                    } else {
                        map.remove("sensor_deny");
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
    }

    private void d(com.thinkup.core.common.m.m mVar) {
        if (this.mmn || mVar == null) {
            return;
        }
        int iD = mVar.d();
        try {
            MediationUtilsManager mediationUtilsManager = MediationUtilsManager.getInstance(this.f73051nd);
            this.mdo = mediationUtilsManager.getAnrCountWithinDays(iD);
            this.mmm = mediationUtilsManager.getAnrTimestampsWithinDays(iD).toString();
        } catch (Throwable unused) {
        }
    }

    private boolean d(long j10, long j11) {
        if (this.f73044d0 == 0) {
            this.f73044d0 = q0.m(this.f73051nd, nm.m.f73146d, nm.d.f73130no, 0L);
        }
        return Math.max(0L, j10 - this.f73044d0) > j11;
    }

    private void d(String str, int i10) {
        com.thinkup.core.q.mm mmVarD;
        com.thinkup.core.q.m0 m0VarD0;
        try {
            Context context = this.f73051nd;
            if (context == null || (mmVarD = com.thinkup.core.q.mm.d(context)) == null || (m0VarD0 = mmVarD.d0(str)) == null) {
                return;
            }
            com.thinkup.core.common.d0 d0VarD = com.thinkup.core.common.d0.d(this.f73051nd, str, String.valueOf(m0VarD0.dqm()));
            if (d0VarD != null) {
                d0VarD.d(i10);
            }
        } catch (Exception unused) {
        }
    }

    public static /* synthetic */ void d(nd ndVar, Context context) {
        int iD = com.thinkup.core.common.nn.mo.d(context, "common_custom_pg", "string");
        if (iD > 0) {
            ndVar.m0n = context.getResources().getString(iD);
        }
    }

    public static /* synthetic */ void d(nd ndVar, Context context, TUNetworkConfig tUNetworkConfig) {
        if (tUNetworkConfig == null) {
            tUNetworkConfig = new TUNetworkConfig();
        }
        List<TUInitConfig> tUInitConfigList = tUNetworkConfig.getTUInitConfigList();
        if (tUInitConfigList == null) {
            tUInitConfigList = new ArrayList<>(2);
        }
        try {
            if (ndVar.om()) {
                tUInitConfigList.clear();
            }
        } catch (Throwable th2) {
            th2.printStackTrace();
            tUInitConfigList = new ArrayList<>(2);
        }
        boolean z10 = false;
        TUInitConfig tUInitConfig = null;
        if (Build.VERSION.SDK_INT != 29 && !d(m().qq(), "1")) {
            try {
                Constructor declaredConstructor = FacebookTUInitConfig.class.asSubclass(TUInitConfig.class).getDeclaredConstructor(null);
                declaredConstructor.setAccessible(true);
                TUInitConfig tUInitConfig2 = (TUInitConfig) declaredConstructor.newInstance(null);
                try {
                    tUInitConfigList.add(0, tUInitConfig2);
                } catch (Throwable unused) {
                }
                tUInitConfig = tUInitConfig2;
            } catch (Throwable unused2) {
            }
        }
        ndVar.ddn = tUInitConfigList.size() > 0;
        for (TUInitConfig tUInitConfig3 : tUInitConfigList) {
            if (tUInitConfig3 != null) {
                if (tUInitConfig != null && TextUtils.equals(tUInitConfig.getClass().getSimpleName(), tUInitConfig3.getClass().getSimpleName())) {
                    if (!z10) {
                        z10 = true;
                    }
                }
                d(ndVar.new AnonymousClass8(tUInitConfig3, context));
            }
        }
    }
}