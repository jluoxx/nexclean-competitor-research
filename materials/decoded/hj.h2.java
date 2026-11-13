package hj;

import android.app.Activity;
import android.app.Application;
import com.tradplus.ads.base.bean.TPAdError;
import com.tradplus.ads.base.bean.TPAdInfo;
import com.tradplus.ads.open.LoadAdEveryLayerListener;
import com.tradplus.ads.open.TradPlusSdk;
import com.tradplus.ads.open.interstitial.InterstitialAdListener;
import com.tradplus.ads.open.interstitial.TPInterstitial;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes7.dex */
public final class h2 extends v1 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public TPInterstitial f83585b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public String f83586c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public double f83587d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public String f83588e;

    public static final class a implements InterstitialAdListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ String f83589a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ h2 f83590b;

        /* JADX INFO: renamed from: hj.h2$a$a, reason: collision with other inner class name */
        public static final class C1022a extends ll.m implements tl.n {
            public final /* synthetic */ h2 OooO00o;
            public final /* synthetic */ String OooO0O0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C1022a(h2 h2Var, String str, kl.f fVar) {
                super(2, fVar);
                this.OooO00o = h2Var;
                this.OooO0O0 = str;
            }

            @Override // tl.n
            /* JADX INFO: renamed from: OooO00o, reason: merged with bridge method [inline-methods] */
            public final Object invoke(kotlinx.coroutines.p0 p0Var, kl.f<? super fl.m0> fVar) {
                return new C1022a(this.OooO00o, this.OooO0O0, fVar).invokeSuspend(fl.m0.f80959a);
            }

            @Override // ll.a
            public final kl.f<fl.m0> create(Object obj, kl.f<?> fVar) {
                return new C1022a(this.OooO00o, this.OooO0O0, fVar);
            }

            @Override // ll.a
            public final Object invokeSuspend(Object obj) {
                p003kotlin.coroutines.intrinsics.c.f();
                fl.v.b(obj);
                u2 u2Var = this.OooO00o.f83715a;
                if (u2Var != null) {
                    u2Var.c();
                }
                v2.f83727a.c(this.OooO0O0, 2);
                return fl.m0.f80959a;
            }
        }

        public a(h2 h2Var, String str) {
            this.f83589a = str;
            this.f83590b = h2Var;
        }

        @Override // com.tradplus.ads.open.interstitial.InterstitialAdListener
        public final void onAdClicked(TPAdInfo tPAdInfo) {
            u2 u2Var = this.f83590b.f83715a;
            if (u2Var != null) {
                u2Var.onAdClicked();
            }
        }

        @Override // com.tradplus.ads.open.interstitial.InterstitialAdListener
        public final void onAdClosed(TPAdInfo tPAdInfo) {
            u2 u2Var = this.f83590b.f83715a;
            if (u2Var != null) {
                u2Var.onAdClosed();
            }
        }

        @Override // com.tradplus.ads.open.interstitial.InterstitialAdListener
        public final void onAdFailed(TPAdError tPAdError) {
            h2 h2Var = this.f83590b;
            int errorCode = tPAdError != null ? tPAdError.getErrorCode() : 0;
            String errorMsg = tPAdError != null ? tPAdError.getErrorMsg() : null;
            u2 u2Var = h2Var.f83715a;
            if (u2Var != null) {
                u2Var.i(errorCode, errorMsg);
            }
        }

        @Override // com.tradplus.ads.open.interstitial.InterstitialAdListener
        public final void onAdImpression(TPAdInfo tPAdInfo) {
            this.f83590b.i();
            u2 u2Var = this.f83590b.f83715a;
            if (u2Var != null) {
                u2Var.a();
            }
            w2 w2VarB = v2.f83727a.b(tPAdInfo, this.f83590b.f83587d);
            u2 u2Var2 = this.f83590b.f83715a;
            if (u2Var2 != null) {
                u2Var2.h(w2VarB);
            }
        }

        @Override // com.tradplus.ads.open.interstitial.InterstitialAdListener
        public final void onAdLoaded(TPAdInfo tPAdInfo) {
            String str;
            String str2;
            String str3;
            q1 q1VarA = r.f83668a.a(30);
            if (q1VarA instanceof e2) {
                if (((e2) q1VarA).f83557c.contains(this.f83589a)) {
                    h2 h2Var = this.f83590b;
                    int code = kj.c.E_91109.getCode();
                    u2 u2Var = h2Var.f83715a;
                    if (u2Var != null) {
                        u2Var.i(code, "E_91109");
                        return;
                    }
                    return;
                }
            }
            h2.h(this.f83590b);
            h2 h2Var2 = this.f83590b;
            String str4 = "";
            if (tPAdInfo == null || (str = tPAdInfo.adSourceId) == null) {
                str = "";
            }
            h2Var2.f83588e = str;
            h2Var2.g(tPAdInfo);
            h2 h2Var3 = this.f83590b;
            v2 v2Var = v2.f83727a;
            if (tPAdInfo == null || (str2 = tPAdInfo.adNetworkId) == null) {
                str2 = "";
            }
            int iD = v2Var.d(str2);
            if (tPAdInfo != null && (str3 = tPAdInfo.adSourcePlacementId) != null) {
                str4 = str3;
            }
            u2 u2Var2 = h2Var3.f83715a;
            if (u2Var2 != null) {
                u2Var2.f(iD, str4);
            }
            kotlinx.coroutines.k.d(kotlinx.coroutines.v1.f87249a, null, null, new C1022a(this.f83590b, this.f83589a, null), 3, null);
        }

        @Override // com.tradplus.ads.open.interstitial.InterstitialAdListener
        public final void onAdVideoEnd(TPAdInfo tPAdInfo) {
        }

        @Override // com.tradplus.ads.open.interstitial.InterstitialAdListener
        public final void onAdVideoError(TPAdInfo tPAdInfo, TPAdError tPAdError) {
            this.f83590b.i();
            h2 h2Var = this.f83590b;
            int errorCode = tPAdError != null ? tPAdError.getErrorCode() : 0;
            String errorMsg = tPAdError != null ? tPAdError.getErrorMsg() : null;
            u2 u2Var = h2Var.f83715a;
            if (u2Var != null) {
                u2Var.e(errorCode, errorMsg);
            }
        }

        @Override // com.tradplus.ads.open.interstitial.InterstitialAdListener
        public final void onAdVideoStart(TPAdInfo tPAdInfo) {
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

    public h2(u2 u2Var) {
        super(u2Var);
        this.f83586c = "";
        this.f83588e = "";
    }

    public static final void h(h2 h2Var) {
        h2Var.getClass();
        q1 q1VarA = r.f83668a.a(30);
        if (q1VarA instanceof e2) {
            ((e2) q1VarA).f83557c.add(h2Var.f83586c);
        }
    }

    @Override // hj.v1
    public final boolean a() {
        TPAdInfo tPAdInfo = TradPlusSdk.getTPAdInfo(this.f83586c);
        if (p003kotlin.jvm.internal.v.c(this.f83588e, tPAdInfo != null ? tPAdInfo.adSourceId : null) || tPAdInfo == null) {
            return false;
        }
        this.f83588e = tPAdInfo.adSourceId;
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

    @Override // hj.v1
    public final void b(String str, Map map) {
        fl.m0 m0Var;
        this.f83586c = str;
        Application applicationC = ij.a.c();
        if (applicationC != null) {
            v2.f83727a.c(str, 2);
            TPInterstitial tPInterstitial = this.f83585b;
            if (tPInterstitial == null) {
                TPInterstitial tPInterstitial2 = new TPInterstitial(applicationC, str);
                this.f83585b = tPInterstitial2;
                if (!tPInterstitial2.isReady()) {
                    i();
                }
                TPInterstitial tPInterstitial3 = this.f83585b;
                if (tPInterstitial3 != null) {
                    tPInterstitial3.setAutoLoadCallback(true);
                }
                TPInterstitial tPInterstitial4 = this.f83585b;
                if (tPInterstitial4 != null) {
                    tPInterstitial4.setAdListener(new a(this, str));
                }
                TPInterstitial tPInterstitial5 = this.f83585b;
                if (tPInterstitial5 != null) {
                    tPInterstitial5.setAllAdLoadListener(new b());
                }
            } else if (!tPInterstitial.isReady()) {
                i();
            }
            TPInterstitial tPInterstitial6 = this.f83585b;
            if (tPInterstitial6 != null) {
                tPInterstitial6.loadAd();
                m0Var = fl.m0.f80959a;
            } else {
                m0Var = null;
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

    @Override // hj.v1
    public final boolean c(Activity activity, String str) {
        TPInterstitial tPInterstitial = this.f83585b;
        if (tPInterstitial == null || !tPInterstitial.isReady()) {
            return false;
        }
        TPInterstitial tPInterstitial2 = this.f83585b;
        if (tPInterstitial2 != null) {
            tPInterstitial2.showAd(activity, null);
        }
        return true;
    }

    @Override // hj.v1
    public final void d() {
        TPInterstitial tPInterstitial = this.f83585b;
        if (tPInterstitial != null) {
            tPInterstitial.setAdListener(null);
        }
        TPInterstitial tPInterstitial2 = this.f83585b;
        if (tPInterstitial2 != null) {
            tPInterstitial2.onDestroy();
        }
        this.f83585b = null;
    }

    @Override // hj.v1
    public final boolean e() {
        TPInterstitial tPInterstitial = this.f83585b;
        if (tPInterstitial != null && !tPInterstitial.isReady()) {
            i();
        }
        TPInterstitial tPInterstitial2 = this.f83585b;
        return tPInterstitial2 == null || !tPInterstitial2.isReady();
    }

    @Override // hj.v1
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
                this.f83587d = dA;
                HashMap map = new HashMap();
                map.put("tx_platform", tPAdInfo.adNetworkId);
                map.put("tx_type", "inter");
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
            ((e2) q1VarA).f83557c.remove(this.f83586c);
        }
    }
}