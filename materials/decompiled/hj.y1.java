package hj;

import android.app.Activity;
import android.app.Application;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.FrameLayout;
import com.tradplus.ads.base.bean.TPAdError;
import com.tradplus.ads.base.bean.TPAdInfo;
import com.tradplus.ads.base.util.TradPlusInterstitialConstants;
import com.tradplus.ads.open.LoadAdEveryLayerListener;
import com.tradplus.ads.open.TradPlusSdk;
import com.tradplus.ads.open.banner.BannerAdListener;
import com.tradplus.ads.open.banner.TPBanner;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes7.dex */
public final class y1 extends f {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public TPBanner f83768b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public String f83769c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f83770d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f83771e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public double f83772f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public String f83773g;

    public static final class a extends BannerAdListener {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ String f83775b;

        /* JADX INFO: renamed from: hj.y1$a$a, reason: collision with other inner class name */
        public static final class C1032a extends ll.m implements tl.n {
            public final /* synthetic */ y1 OooO00o;
            public final /* synthetic */ String OooO0O0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C1032a(y1 y1Var, String str, kl.f fVar) {
                super(2, fVar);
                this.OooO00o = y1Var;
                this.OooO0O0 = str;
            }

            @Override // tl.n
            /* JADX INFO: renamed from: OooO00o, reason: merged with bridge method [inline-methods] */
            public final Object invoke(kotlinx.coroutines.p0 p0Var, kl.f<? super fl.m0> fVar) {
                return new C1032a(this.OooO00o, this.OooO0O0, fVar).invokeSuspend(fl.m0.f80959a);
            }

            @Override // ll.a
            public final kl.f<fl.m0> create(Object obj, kl.f<?> fVar) {
                return new C1032a(this.OooO00o, this.OooO0O0, fVar);
            }

            @Override // ll.a
            public final Object invokeSuspend(Object obj) {
                p003kotlin.coroutines.intrinsics.c.f();
                fl.v.b(obj);
                u2 u2Var = this.OooO00o.f83715a;
                if (u2Var != null) {
                    u2Var.c();
                }
                v2.f83727a.c(this.OooO0O0, 1);
                return fl.m0.f80959a;
            }
        }

        public a(String str) {
            this.f83775b = str;
        }

        @Override // com.tradplus.ads.open.banner.BannerAdListener
        public final void onAdClicked(TPAdInfo tPAdInfo) {
            u2 u2Var = y1.this.f83715a;
            if (u2Var != null) {
                u2Var.onAdClicked();
            }
        }

        @Override // com.tradplus.ads.open.banner.BannerAdListener
        public final void onAdClosed(TPAdInfo tPAdInfo) {
            u2 u2Var = y1.this.f83715a;
            if (u2Var != null) {
                u2Var.onAdClosed();
            }
        }

        @Override // com.tradplus.ads.open.banner.BannerAdListener
        public final void onAdImpression(TPAdInfo tPAdInfo) {
            y1.this.i();
            u2 u2Var = y1.this.f83715a;
            if (u2Var != null) {
                u2Var.a();
            }
            w2 w2VarB = v2.f83727a.b(tPAdInfo, y1.this.f83772f);
            u2 u2Var2 = y1.this.f83715a;
            if (u2Var2 != null) {
                u2Var2.h(w2VarB);
            }
        }

        @Override // com.tradplus.ads.open.banner.BannerAdListener
        public final void onAdLoadFailed(TPAdError tPAdError) {
            y1 y1Var = y1.this;
            int errorCode = tPAdError != null ? tPAdError.getErrorCode() : 0;
            String errorMsg = tPAdError != null ? tPAdError.getErrorMsg() : null;
            u2 u2Var = y1Var.f83715a;
            if (u2Var != null) {
                u2Var.i(errorCode, errorMsg);
            }
        }

        @Override // com.tradplus.ads.open.banner.BannerAdListener
        public final void onAdLoaded(TPAdInfo tPAdInfo) {
            String str;
            String str2;
            String str3;
            q1 q1VarA = r.f83668a.a(30);
            if (q1VarA instanceof e2) {
                if (((e2) q1VarA).f83557c.contains(this.f83775b)) {
                    y1 y1Var = y1.this;
                    int code = kj.c.E_91109.getCode();
                    u2 u2Var = y1Var.f83715a;
                    if (u2Var != null) {
                        u2Var.i(code, "E_91109");
                        return;
                    }
                    return;
                }
            }
            y1.h(y1.this);
            y1 y1Var2 = y1.this;
            String str4 = "";
            if (tPAdInfo == null || (str = tPAdInfo.adSourceId) == null) {
                str = "";
            }
            y1Var2.f83773g = str;
            y1Var2.g(tPAdInfo);
            y1 y1Var3 = y1.this;
            v2 v2Var = v2.f83727a;
            if (tPAdInfo == null || (str2 = tPAdInfo.adNetworkId) == null) {
                str2 = "";
            }
            int iD = v2Var.d(str2);
            if (tPAdInfo != null && (str3 = tPAdInfo.adSourcePlacementId) != null) {
                str4 = str3;
            }
            u2 u2Var2 = y1Var3.f83715a;
            if (u2Var2 != null) {
                u2Var2.f(iD, str4);
            }
            kotlinx.coroutines.k.d(kotlinx.coroutines.v1.f87249a, null, null, new C1032a(y1.this, this.f83775b, null), 3, null);
        }

        @Override // com.tradplus.ads.open.banner.BannerAdListener
        public final void onAdShowFailed(TPAdError tPAdError, TPAdInfo tPAdInfo) {
            y1.this.i();
            y1 y1Var = y1.this;
            int errorCode = tPAdError != null ? tPAdError.getErrorCode() : 0;
            String errorMsg = tPAdError != null ? tPAdError.getErrorMsg() : null;
            u2 u2Var = y1Var.f83715a;
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

    public static final class c extends ll.m implements tl.n {
        public final /* synthetic */ ViewGroup OooO0O0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(ViewGroup viewGroup, kl.f fVar) {
            super(2, fVar);
            this.OooO0O0 = viewGroup;
        }

        @Override // tl.n
        /* JADX INFO: renamed from: OooO00o, reason: merged with bridge method [inline-methods] */
        public final Object invoke(kotlinx.coroutines.p0 p0Var, kl.f<? super fl.m0> fVar) {
            return y1.this.new c(this.OooO0O0, fVar).invokeSuspend(fl.m0.f80959a);
        }

        @Override // ll.a
        public final kl.f<fl.m0> create(Object obj, kl.f<?> fVar) {
            return y1.this.new c(this.OooO0O0, fVar);
        }

        @Override // ll.a
        public final Object invokeSuspend(Object obj) {
            p003kotlin.coroutines.intrinsics.c.f();
            fl.v.b(obj);
            TPBanner tPBanner = y1.this.f83768b;
            if ((tPBanner != null ? tPBanner.getParent() : null) instanceof ViewGroup) {
                TPBanner tPBanner2 = y1.this.f83768b;
                ViewParent parent = tPBanner2 != null ? tPBanner2.getParent() : null;
                parent.getClass();
                ((ViewGroup) parent).removeView(y1.this.f83768b);
            }
            this.OooO0O0.removeAllViews();
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
            layoutParams.gravity = 17;
            TPBanner tPBanner3 = y1.this.f83768b;
            if (tPBanner3 != null) {
                tPBanner3.showAd();
            }
            this.OooO0O0.addView(y1.this.f83768b, layoutParams);
            return fl.m0.f80959a;
        }
    }

    public y1(u2 u2Var) {
        super(u2Var);
        this.f83769c = "";
        this.f83773g = "";
    }

    public static final void h(y1 y1Var) {
        y1Var.getClass();
        q1 q1VarA = r.f83668a.a(30);
        if (q1VarA instanceof e2) {
            ((e2) q1VarA).f83557c.add(y1Var.f83769c);
        }
    }

    @Override // hj.f
    public final void a(String str, Map map) {
        fl.m0 m0Var;
        this.f83769c = str;
        try {
            String strValueOf = String.valueOf(map.get("ad_pp_inline_width"));
            if (strValueOf.length() > 0 && !p003kotlin.jvm.internal.v.c(strValueOf, "null")) {
                this.f83770d = Integer.parseInt(strValueOf);
            }
            String strValueOf2 = String.valueOf(map.get("ad_pp_normal_width"));
            if (strValueOf2.length() > 0 && !p003kotlin.jvm.internal.v.c(strValueOf2, "null")) {
                this.f83771e = Integer.parseInt(strValueOf2);
            }
        } catch (Throwable th2) {
            th2.printStackTrace();
        }
        Application applicationC = ij.a.c();
        if (applicationC != null) {
            v2.f83727a.c(str, 1);
            this.f83768b = new TPBanner(applicationC);
            HashMap map2 = new HashMap();
            int i10 = this.f83770d;
            if (i10 <= 0 && (i10 = this.f83771e) <= 0) {
                i10 = 320;
            }
            map2.put("width", Integer.valueOf(i10));
            TPBanner tPBanner = this.f83768b;
            if (tPBanner != null) {
                tPBanner.setCustomParams(map2);
            }
            TPBanner tPBanner2 = this.f83768b;
            if (tPBanner2 != null) {
                tPBanner2.setAutoLoadCallback(true);
            }
            TPBanner tPBanner3 = this.f83768b;
            if (tPBanner3 != null) {
                tPBanner3.setAdListener(new a(str));
            }
            TPBanner tPBanner4 = this.f83768b;
            if (tPBanner4 != null) {
                tPBanner4.setAllAdLoadListener(new b());
            }
            TPBanner tPBanner5 = this.f83768b;
            if (tPBanner5 != null && !tPBanner5.isReady()) {
                i();
            }
            TPBanner tPBanner6 = this.f83768b;
            if (tPBanner6 != null) {
                tPBanner6.closeAutoShow();
            }
            TPBanner tPBanner7 = this.f83768b;
            if (tPBanner7 != null) {
                tPBanner7.loadAd(str);
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

    @Override // hj.f
    public final boolean b(Activity activity, ViewGroup viewGroup, String str) {
        if (this.f83768b == null) {
            return false;
        }
        kotlinx.coroutines.k.d(kotlinx.coroutines.v1.f87249a, kotlinx.coroutines.f1.c(), null, new c(viewGroup, null), 2, null);
        return true;
    }

    @Override // hj.f
    public final void c() {
        TPBanner tPBanner = this.f83768b;
        if (tPBanner != null) {
            tPBanner.setAdListener(null);
        }
        TPBanner tPBanner2 = this.f83768b;
        if (tPBanner2 != null) {
            tPBanner2.onDestroy();
        }
        this.f83768b = null;
    }

    @Override // hj.f
    public final boolean d() {
        TPBanner tPBanner = this.f83768b;
        if (tPBanner != null && !tPBanner.isReady()) {
            i();
        }
        TPBanner tPBanner2 = this.f83768b;
        return tPBanner2 == null || !tPBanner2.isReady();
    }

    @Override // hj.f
    public final void e() {
        i();
    }

    @Override // hj.f
    public final boolean f() {
        TPAdInfo tPAdInfo = TradPlusSdk.getTPAdInfo(this.f83769c);
        if (p003kotlin.jvm.internal.v.c(this.f83773g, tPAdInfo != null ? tPAdInfo.adSourceId : null) || tPAdInfo == null) {
            return false;
        }
        this.f83773g = tPAdInfo.adSourceId;
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
                this.f83772f = dA;
                HashMap map = new HashMap();
                map.put("tx_platform", tPAdInfo.adNetworkId);
                map.put("tx_type", TradPlusInterstitialConstants.INTERSTITIAL_TYPE_BANNER);
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
            ((e2) q1VarA).f83557c.remove(this.f83769c);
        }
    }
}