package hj;

import android.app.Activity;
import android.app.Application;
import android.content.Intent;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import com.tradplus.ads.base.GlobalTradPlus;
import com.tradplus.ads.base.bean.TPAdError;
import com.tradplus.ads.base.bean.TPAdInfo;
import com.tradplus.ads.base.bean.TPBaseAd;
import com.tradplus.ads.open.LoadAdEveryLayerListener;
import com.tradplus.ads.open.TradPlusSdk;
import com.tradplus.ads.open.splash.SplashAdListener;
import com.tradplus.ads.open.splash.TPSplash;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes7.dex */
public final class f2 extends c {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public TPSplash f83561b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public ViewGroup f83562c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public String f83563d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public double f83564e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public String f83565f;

    public static final class a extends SplashAdListener {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ String f83567b;

        /* JADX INFO: renamed from: hj.f2$a$a, reason: collision with other inner class name */
        public static final class C1020a extends ll.m implements tl.n {
            public final /* synthetic */ f2 OooO00o;
            public final /* synthetic */ String OooO0O0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C1020a(f2 f2Var, String str, kl.f fVar) {
                super(2, fVar);
                this.OooO00o = f2Var;
                this.OooO0O0 = str;
            }

            @Override // tl.n
            /* JADX INFO: renamed from: OooO00o, reason: merged with bridge method [inline-methods] */
            public final Object invoke(kotlinx.coroutines.p0 p0Var, kl.f<? super fl.m0> fVar) {
                return new C1020a(this.OooO00o, this.OooO0O0, fVar).invokeSuspend(fl.m0.f80959a);
            }

            @Override // ll.a
            public final kl.f<fl.m0> create(Object obj, kl.f<?> fVar) {
                return new C1020a(this.OooO00o, this.OooO0O0, fVar);
            }

            @Override // ll.a
            public final Object invokeSuspend(Object obj) {
                p003kotlin.coroutines.intrinsics.c.f();
                fl.v.b(obj);
                u2 u2Var = this.OooO00o.f83715a;
                if (u2Var != null) {
                    u2Var.c();
                }
                v2.f83727a.c(this.OooO0O0, 5);
                return fl.m0.f80959a;
            }
        }

        public a(String str) {
            this.f83567b = str;
        }

        @Override // com.tradplus.ads.open.splash.SplashAdListener
        public final void onAdClicked(TPAdInfo tPAdInfo) {
            u2 u2Var = f2.this.f83715a;
            if (u2Var != null) {
                u2Var.onAdClicked();
            }
        }

        @Override // com.tradplus.ads.open.splash.SplashAdListener
        public final void onAdClosed(TPAdInfo tPAdInfo) {
            u2 u2Var = f2.this.f83715a;
            if (u2Var != null) {
                u2Var.onAdClosed();
            }
        }

        @Override // com.tradplus.ads.open.splash.SplashAdListener
        public final void onAdImpression(TPAdInfo tPAdInfo) {
            f2.this.i();
            u2 u2Var = f2.this.f83715a;
            if (u2Var != null) {
                u2Var.a();
            }
            w2 w2VarB = v2.f83727a.b(tPAdInfo, f2.this.f83564e);
            u2 u2Var2 = f2.this.f83715a;
            if (u2Var2 != null) {
                u2Var2.h(w2VarB);
            }
        }

        @Override // com.tradplus.ads.open.splash.SplashAdListener
        public final void onAdLoadFailed(TPAdError tPAdError) {
            f2 f2Var = f2.this;
            int errorCode = tPAdError != null ? tPAdError.getErrorCode() : 0;
            String errorMsg = tPAdError != null ? tPAdError.getErrorMsg() : null;
            u2 u2Var = f2Var.f83715a;
            if (u2Var != null) {
                u2Var.i(errorCode, errorMsg);
            }
        }

        @Override // com.tradplus.ads.open.splash.SplashAdListener
        public final void onAdLoaded(TPAdInfo tPAdInfo, TPBaseAd tPBaseAd) {
            String str;
            String str2;
            String str3;
            q1 q1VarA = r.f83668a.a(30);
            if (q1VarA instanceof e2) {
                if (((e2) q1VarA).f83557c.contains(this.f83567b)) {
                    f2 f2Var = f2.this;
                    int code = kj.c.E_91109.getCode();
                    u2 u2Var = f2Var.f83715a;
                    if (u2Var != null) {
                        u2Var.i(code, "E_91109");
                        return;
                    }
                    return;
                }
            }
            f2.h(f2.this);
            f2 f2Var2 = f2.this;
            String str4 = "";
            if (tPAdInfo == null || (str = tPAdInfo.adSourceId) == null) {
                str = "";
            }
            f2Var2.f83565f = str;
            f2Var2.g(tPAdInfo);
            f2 f2Var3 = f2.this;
            v2 v2Var = v2.f83727a;
            if (tPAdInfo == null || (str2 = tPAdInfo.adNetworkId) == null) {
                str2 = "";
            }
            int iD = v2Var.d(str2);
            if (tPAdInfo != null && (str3 = tPAdInfo.adSourcePlacementId) != null) {
                str4 = str3;
            }
            u2 u2Var2 = f2Var3.f83715a;
            if (u2Var2 != null) {
                u2Var2.f(iD, str4);
            }
            kotlinx.coroutines.k.d(kotlinx.coroutines.v1.f87249a, null, null, new C1020a(f2.this, this.f83567b, null), 3, null);
        }

        @Override // com.tradplus.ads.open.splash.SplashAdListener
        public final void onAdShowFailed(TPAdInfo tPAdInfo, TPAdError tPAdError) {
            f2.this.i();
            f2 f2Var = f2.this;
            int errorCode = tPAdError != null ? tPAdError.getErrorCode() : 0;
            String errorMsg = tPAdError != null ? tPAdError.getErrorMsg() : null;
            u2 u2Var = f2Var.f83715a;
            if (u2Var != null) {
                u2Var.e(errorCode, errorMsg);
            }
        }
    }

    public static final class b implements LoadAdEveryLayerListener {
        @Override // com.tradplus.ads.open.LoadAdEveryLayerListener
        public final void onAdAllLoaded(boolean z10) {
        }

        @Override // com.tradplus.ads.open.LoadAdEveryLayerListener
        public final void onAdIsLoading(String str) {
        }

        @Override // com.tradplus.ads.open.LoadAdEveryLayerListener
        public final void onAdStartLoad(String str) {
        }

        @Override // com.tradplus.ads.open.LoadAdEveryLayerListener
        public final void onBiddingEnd(TPAdInfo tPAdInfo, TPAdError tPAdError) {
        }

        @Override // com.tradplus.ads.open.LoadAdEveryLayerListener
        public final void onBiddingStart(TPAdInfo tPAdInfo) {
        }

        @Override // com.tradplus.ads.open.LoadAdEveryLayerListener
        public final void oneLayerLoadFailed(TPAdError tPAdError, TPAdInfo tPAdInfo) {
        }

        @Override // com.tradplus.ads.open.LoadAdEveryLayerListener
        public final void oneLayerLoadStart(TPAdInfo tPAdInfo) {
        }

        @Override // com.tradplus.ads.open.LoadAdEveryLayerListener
        public final void oneLayerLoaded(TPAdInfo tPAdInfo) {
        }
    }

    public f2(u2 u2Var) {
        super(u2Var);
        this.f83563d = "";
        this.f83565f = "";
    }

    public static final void h(f2 f2Var) {
        f2Var.getClass();
        q1 q1VarA = r.f83668a.a(30);
        if (q1VarA instanceof e2) {
            ((e2) q1VarA).f83557c.add(f2Var.f83563d);
        }
    }

    @Override // hj.c
    public final boolean a() {
        TPAdInfo tPAdInfo = TradPlusSdk.getTPAdInfo(this.f83563d);
        if (p003kotlin.jvm.internal.v.c(this.f83565f, tPAdInfo != null ? tPAdInfo.adSourceId : null) || tPAdInfo == null) {
            return false;
        }
        this.f83565f = tPAdInfo.adSourceId;
        g(tPAdInfo);
        v2 v2Var = v2.f83727a;
        String str = tPAdInfo.adNetworkId;
        if (str == null) {
            str = "";
        }
        int iD = v2Var.d(str);
        String str2 = tPAdInfo.adSourcePlacementId;
        String str3 = str2 != null ? str2 : "";
        u2 u2Var = this.f83715a;
        if (u2Var == null) {
            return true;
        }
        u2Var.f(iD, str3);
        return true;
    }

    @Override // hj.c
    public final void b(String str, Map map) {
        this.f83563d = str;
        Application applicationC = ij.a.c();
        if (applicationC != null) {
            v2.f83727a.c(str, 5);
            TPSplash tPSplash = this.f83561b;
            if (tPSplash == null) {
                TPSplash tPSplash2 = new TPSplash(applicationC, str);
                this.f83561b = tPSplash2;
                if (!tPSplash2.isReady()) {
                    i();
                }
                TPSplash tPSplash3 = this.f83561b;
                if (tPSplash3 != null) {
                    tPSplash3.setAutoLoadCallback(true);
                }
                TPSplash tPSplash4 = this.f83561b;
                if (tPSplash4 != null) {
                    tPSplash4.setAdListener(new a(str));
                }
                TPSplash tPSplash5 = this.f83561b;
                if (tPSplash5 != null) {
                    tPSplash5.setAllAdLoadListener(new b());
                }
            } else if (!tPSplash.isReady()) {
                i();
            }
            TPSplash tPSplash6 = this.f83561b;
            fl.m0 m0Var = null;
            if (tPSplash6 != null) {
                tPSplash6.loadAd(null);
                m0Var = fl.m0.f80959a;
            }
            if (m0Var != null) {
                return;
            }
        }
        int code = kj.c.E_91108.getCode();
        u2 u2Var = this.f83715a;
        if (u2Var != null) {
            u2Var.i(code, "E_91108");
        }
    }

    @Override // hj.c
    public final boolean c(Activity activity, String str) {
        GlobalTradPlus.getInstance().refreshContext(activity);
        TPSplash tPSplash = this.f83561b;
        if (tPSplash == null || !tPSplash.isReady()) {
            return false;
        }
        Intent intent = activity.getIntent();
        if (intent == null) {
            intent = new Intent();
        }
        String stringExtra = intent.getStringExtra("ks_container");
        if (TextUtils.isEmpty(stringExtra)) {
            TPSplash tPSplash2 = this.f83561b;
            if (tPSplash2 != null) {
                tPSplash2.showAd();
            }
        } else {
            int identifier = activity.getResources().getIdentifier(stringExtra, "id", activity.getPackageName());
            if (identifier <= 0) {
                return false;
            }
            View viewFindViewById = activity.findViewById(identifier);
            viewFindViewById.getClass();
            ViewGroup viewGroup = (ViewGroup) viewFindViewById;
            this.f83562c = viewGroup;
            if (viewGroup != null) {
                viewGroup.setVisibility(0);
            }
            TPSplash tPSplash3 = this.f83561b;
            if (tPSplash3 != null) {
                tPSplash3.showAd(this.f83562c);
            }
        }
        return true;
    }

    @Override // hj.c
    public final void d() {
        TPSplash tPSplash = this.f83561b;
        if (tPSplash != null) {
            tPSplash.setAdListener(null);
        }
        TPSplash tPSplash2 = this.f83561b;
        if (tPSplash2 != null) {
            tPSplash2.onDestroy();
        }
        this.f83561b = null;
    }

    @Override // hj.c
    public final boolean e() {
        TPSplash tPSplash = this.f83561b;
        if (tPSplash != null && !tPSplash.isReady()) {
            i();
        }
        TPSplash tPSplash2 = this.f83561b;
        return tPSplash2 == null || !tPSplash2.isReady();
    }

    @Override // hj.c
    public final void f() {
        i();
    }

    public final void g(TPAdInfo tPAdInfo) {
        if (tPAdInfo != null) {
            try {
                v2 v2Var = v2.f83727a;
                if (!v2Var.e(tPAdInfo.adNetworkId)) {
                    double d10 = Double.parseDouble(tPAdInfo.ecpm);
                    u2 u2Var = this.f83715a;
                    if (u2Var != null) {
                        u2Var.g(d10);
                        return;
                    }
                    return;
                }
                double dA = v2Var.a(tPAdInfo.tpAdUnitId);
                this.f83564e = dA;
                HashMap map = new HashMap();
                map.put("tx_platform", tPAdInfo.adNetworkId);
                map.put("tx_type", "appopen");
                map.put("tx_sdk_ecpm", tPAdInfo.ecpm);
                map.put("tx_cal_ecpm", String.valueOf(dA));
                u2 u2Var2 = this.f83715a;
                if (u2Var2 != null) {
                    u2Var2.g(dA);
                }
            } catch (Throwable th2) {
                th2.printStackTrace();
            }
        }
    }

    public final void i() {
        q1 q1VarA = r.f83668a.a(30);
        if (q1VarA instanceof e2) {
            ((e2) q1VarA).f83557c.remove(this.f83563d);
        }
    }
}