package hj;

import android.app.Activity;
import android.app.Application;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.FrameLayout;
import com.google.android.libraries.ads.mobile.sdk.banner.AdSize;
import com.google.android.libraries.ads.mobile.sdk.banner.AdView;
import com.google.android.libraries.ads.mobile.sdk.banner.BannerAd;
import com.google.android.libraries.ads.mobile.sdk.banner.BannerAdEventCallback;
import com.google.android.libraries.ads.mobile.sdk.banner.BannerAdRefreshCallback;
import com.google.android.libraries.ads.mobile.sdk.banner.BannerAdRequest;
import com.google.android.libraries.ads.mobile.sdk.common.AdLoadCallback;
import com.google.android.libraries.ads.mobile.sdk.common.AdSourceResponseInfo;
import com.google.android.libraries.ads.mobile.sdk.common.AdValue;
import com.google.android.libraries.ads.mobile.sdk.common.FullScreenContentError;
import com.google.android.libraries.ads.mobile.sdk.common.LoadAdError;
import com.google.android.libraries.ads.mobile.sdk.common.ResponseInfo;
import java.util.Map;

/* JADX INFO: loaded from: classes7.dex */
public final class e0 extends f {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public BannerAd f83544b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public AdView f83545c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public String f83546d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f83547e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f83548f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f83549g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f83550h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public boolean f83551i;

    public static final class a extends ll.m implements tl.n {
        public a(kl.f fVar) {
            super(2, fVar);
        }

        @Override // tl.n
        /* JADX INFO: renamed from: OooO00o, reason: merged with bridge method [inline-methods] */
        public final Object invoke(kotlinx.coroutines.p0 p0Var, kl.f<? super fl.m0> fVar) {
            return e0.this.new a(fVar).invokeSuspend(fl.m0.f80959a);
        }

        @Override // ll.a
        public final kl.f<fl.m0> create(Object obj, kl.f<?> fVar) {
            return e0.this.new a(fVar);
        }

        @Override // ll.a
        public final Object invokeSuspend(Object obj) {
            p003kotlin.coroutines.intrinsics.c.f();
            fl.v.b(obj);
            AdView adView = e0.this.f83545c;
            if ((adView != null ? adView.getParent() : null) instanceof ViewGroup) {
                AdView adView2 = e0.this.f83545c;
                ViewParent parent = adView2 != null ? adView2.getParent() : null;
                parent.getClass();
                ((ViewGroup) parent).removeAllViews();
            }
            AdView adView3 = e0.this.f83545c;
            if (adView3 != null) {
                adView3.destroy();
            }
            e0 e0Var = e0.this;
            e0Var.f83545c = null;
            e0Var.f83544b = null;
            return fl.m0.f80959a;
        }
    }

    public static final class b extends ll.m implements tl.n {
        public final /* synthetic */ Application OooO0O0;
        public final /* synthetic */ String OooO0OO;
        public final /* synthetic */ Application OooO0Oo;

        public static final class a implements AdLoadCallback {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final /* synthetic */ e0 f83552a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ String f83553b;

            /* JADX INFO: renamed from: hj.e0$b$a$a, reason: collision with other inner class name */
            public static final class C1018a implements BannerAdRefreshCallback {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final /* synthetic */ e0 f83554a;

                public C1018a(e0 e0Var) {
                    this.f83554a = e0Var;
                }

                @Override // com.google.android.libraries.ads.mobile.sdk.banner.BannerAdRefreshCallback
                public final void onAdFailedToRefresh(LoadAdError loadAdError) {
                }

                @Override // com.google.android.libraries.ads.mobile.sdk.banner.BannerAdRefreshCallback
                public final void onAdRefreshed() {
                    e0 e0Var = this.f83554a;
                    if (!e0Var.f83550h) {
                        e0Var.f83551i = true;
                        return;
                    }
                    u2 u2Var = e0Var.f83715a;
                    if (u2Var != null) {
                        u2Var.a();
                    }
                }
            }

            /* JADX INFO: renamed from: hj.e0$b$a$b, reason: collision with other inner class name */
            public static final class C1019b implements BannerAdEventCallback {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public boolean f83555a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final /* synthetic */ e0 f83556b;

                public C1019b(e0 e0Var) {
                    this.f83556b = e0Var;
                }

                @Override // com.google.android.libraries.ads.mobile.sdk.common.AdEventCallback
                public final void onAdClicked() {
                    this.f83555a = true;
                    u2 u2Var = this.f83556b.f83715a;
                    if (u2Var != null) {
                        u2Var.onAdClicked();
                    }
                }

                @Override // com.google.android.libraries.ads.mobile.sdk.common.AdEventCallback
                public final void onAdDismissedFullScreenContent() {
                    this.f83555a = false;
                    u2 u2Var = this.f83556b.f83715a;
                    if (u2Var != null) {
                        u2Var.onAdClosed();
                    }
                }

                @Override // com.google.android.libraries.ads.mobile.sdk.common.AdEventCallback
                public final void onAdFailedToShowFullScreenContent(FullScreenContentError fullScreenContentError) {
                }

                @Override // com.google.android.libraries.ads.mobile.sdk.common.AdEventCallback
                public final void onAdImpression() {
                    this.f83555a = false;
                    e0 e0Var = this.f83556b;
                    if (!e0Var.f83550h) {
                        e0Var.f83551i = true;
                        return;
                    }
                    u2 u2Var = e0Var.f83715a;
                    if (u2Var != null) {
                        u2Var.a();
                    }
                }

                @Override // com.google.android.libraries.ads.mobile.sdk.common.AdEventCallback
                public final void onAdPaid(AdValue adValue) {
                    String id2;
                    ResponseInfo responseInfo;
                    AdSourceResponseInfo loadedAdSourceResponseInfo;
                    if (this.f83556b.f83546d.length() == 0) {
                        e0 e0Var = this.f83556b;
                        BannerAd bannerAd = e0Var.f83544b;
                        if (bannerAd == null || (responseInfo = bannerAd.getResponseInfo()) == null || (loadedAdSourceResponseInfo = responseInfo.getLoadedAdSourceResponseInfo()) == null || (id2 = loadedAdSourceResponseInfo.getId()) == null) {
                            id2 = "";
                        }
                        e0Var.f83546d = id2;
                    }
                    w2 w2VarF = f0.f83559a.f(adValue, this.f83556b.f83546d);
                    u2 u2Var = this.f83556b.f83715a;
                    if (u2Var != null) {
                        u2Var.h(w2VarF);
                    }
                }

                @Override // com.google.android.libraries.ads.mobile.sdk.common.AdEventCallback
                public final void onAdShowedFullScreenContent() {
                    u2 u2Var;
                    if (!this.f83555a && (u2Var = this.f83556b.f83715a) != null) {
                        u2Var.onAdClicked();
                    }
                    this.f83555a = false;
                }

                @Override // com.google.android.libraries.ads.mobile.sdk.banner.BannerAdEventCallback, com.google.android.libraries.ads.mobile.sdk.common.OnAppEventListener
                public final /* bridge */ void onAppEvent(String str, String str2) {
                    super.onAppEvent(str, str2);
                }
            }

            public a(e0 e0Var, String str) {
                this.f83552a = e0Var;
                this.f83553b = str;
            }

            @Override // com.google.android.libraries.ads.mobile.sdk.common.AdLoadCallback
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final void onAdLoaded(BannerAd bannerAd) {
                String id2;
                u2 u2Var;
                ResponseInfo responseInfo;
                AdSourceResponseInfo loadedAdSourceResponseInfo;
                String instanceId;
                ResponseInfo responseInfo2;
                AdSourceResponseInfo loadedAdSourceResponseInfo2;
                e0 e0Var = this.f83552a;
                e0Var.f83544b = bannerAd;
                bannerAd.setBannerAdRefreshCallback(new C1018a(e0Var));
                bannerAd.setAdEventCallback(new C1019b(this.f83552a));
                e0 e0Var2 = this.f83552a;
                BannerAd bannerAd2 = e0Var2.f83544b;
                String str = "";
                if (bannerAd2 == null || (responseInfo2 = bannerAd2.getResponseInfo()) == null || (loadedAdSourceResponseInfo2 = responseInfo2.getLoadedAdSourceResponseInfo()) == null || (id2 = loadedAdSourceResponseInfo2.getId()) == null) {
                    id2 = "";
                }
                e0Var2.f83546d = id2;
                BannerAd bannerAd3 = this.f83552a.f83544b;
                if (bannerAd3 != null && (responseInfo = bannerAd3.getResponseInfo()) != null && (loadedAdSourceResponseInfo = responseInfo.getLoadedAdSourceResponseInfo()) != null && (instanceId = loadedAdSourceResponseInfo.getInstanceId()) != null) {
                    str = instanceId;
                }
                f0 f0Var = f0.f83559a;
                double dB = f0Var.b(this.f83552a.f83546d) != 4 ? l0.f83618a.b(bannerAd) : 0.0d;
                if (dB > 1.0E-9d) {
                    u2 u2Var2 = this.f83552a.f83715a;
                    if (u2Var2 != null) {
                        u2Var2.g(dB);
                    }
                } else {
                    double dA = y.f83761a.a(this.f83553b);
                    if (dA > 1.0E-9d && (u2Var = this.f83552a.f83715a) != null) {
                        u2Var.g(dA);
                    }
                }
                e0 e0Var3 = this.f83552a;
                int iB = f0Var.b(e0Var3.f83546d);
                u2 u2Var3 = e0Var3.f83715a;
                if (u2Var3 != null) {
                    u2Var3.f(iB, str);
                }
                u2 u2Var4 = this.f83552a.f83715a;
                if (u2Var4 != null) {
                    u2Var4.c();
                }
            }

            @Override // com.google.android.libraries.ads.mobile.sdk.common.AdLoadCallback
            public final void onAdFailedToLoad(LoadAdError loadAdError) {
                super.onAdFailedToLoad(loadAdError);
                e0 e0Var = this.f83552a;
                int iOrdinal = loadAdError.getCode().ordinal();
                String message = loadAdError.getMessage();
                u2 u2Var = e0Var.f83715a;
                if (u2Var != null) {
                    u2Var.i(iOrdinal, message);
                }
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(Application application, String str, Application application2, kl.f fVar) {
            super(2, fVar);
            this.OooO0O0 = application;
            this.OooO0OO = str;
            this.OooO0Oo = application2;
        }

        public final Object OooO00o(kotlinx.coroutines.p0 p0Var, kl.f<? super fl.m0> fVar) {
            return ((b) create(p0Var, fVar)).invokeSuspend(fl.m0.f80959a);
        }

        @Override // ll.a
        public final kl.f<fl.m0> create(Object obj, kl.f<?> fVar) {
            return e0.this.new b(this.OooO0O0, this.OooO0OO, this.OooO0Oo, fVar);
        }

        @Override // tl.n
        public final Object invoke(Object obj, Object obj2) {
            return ((b) create((kotlinx.coroutines.p0) obj, (kl.f) obj2)).invokeSuspend(fl.m0.f80959a);
        }

        @Override // ll.a
        public final Object invokeSuspend(Object obj) {
            AdSize largeAnchoredAdaptiveBannerAdSize;
            p003kotlin.coroutines.intrinsics.c.f();
            fl.v.b(obj);
            try {
                e0 e0Var = e0.this;
                e0Var.f83550h = false;
                if (e0Var.f83549g > 0) {
                    largeAnchoredAdaptiveBannerAdSize = AdSize.BANNER;
                } else {
                    int i10 = e0Var.f83547e;
                    if (i10 > 0) {
                        largeAnchoredAdaptiveBannerAdSize = AdSize.INSTANCE.getCurrentOrientationInlineAdaptiveBannerAdSize(this.OooO0O0, i10);
                    } else {
                        int iA = e0Var.f83548f;
                        if (iA <= 0) {
                            iA = f0.f83559a.a(this.OooO0O0);
                        }
                        largeAnchoredAdaptiveBannerAdSize = AdSize.INSTANCE.getLargeAnchoredAdaptiveBannerAdSize(this.OooO0O0, iA);
                    }
                }
                BannerAdRequest bannerAdRequestC = f0.f83559a.c(this.OooO0OO, largeAnchoredAdaptiveBannerAdSize);
                e0.this.f83545c = new AdView(this.OooO0Oo);
                e0 e0Var2 = e0.this;
                AdView adView = e0Var2.f83545c;
                if (adView != null) {
                    adView.loadAd(bannerAdRequestC, new a(e0Var2, this.OooO0OO));
                }
            } catch (Throwable unused) {
                e0 e0Var3 = e0.this;
                int code = kj.c.E_91107.getCode();
                u2 u2Var = e0Var3.f83715a;
                if (u2Var != null) {
                    u2Var.i(code, "E_91107");
                }
            }
            return fl.m0.f80959a;
        }
    }

    public e0(u2 u2Var) {
        super(u2Var);
        this.f83546d = "";
    }

    @Override // hj.f
    public final void a(String str, Map map) {
        e0 e0Var;
        try {
            String strValueOf = String.valueOf(map.get("ad_pp_inline_width"));
            if (strValueOf.length() > 0 && !p003kotlin.jvm.internal.v.c(strValueOf, "null")) {
                this.f83547e = Integer.parseInt(strValueOf);
            }
            String strValueOf2 = String.valueOf(map.get("ad_pp_normal_width"));
            if (strValueOf2.length() > 0 && !p003kotlin.jvm.internal.v.c(strValueOf2, "null")) {
                this.f83548f = Integer.parseInt(strValueOf2);
            }
            String strValueOf3 = String.valueOf(map.get("ad_pp_fix_banner_small"));
            if (strValueOf3.length() > 0 && !p003kotlin.jvm.internal.v.c(strValueOf3, "null")) {
                this.f83549g = Integer.parseInt(strValueOf3);
            }
        } catch (Throwable th2) {
            th2.printStackTrace();
        }
        Application applicationC = ij.a.c();
        if (applicationC != null) {
            e0Var = this;
            if (kotlinx.coroutines.k.d(kotlinx.coroutines.v1.f87249a, kotlinx.coroutines.f1.c(), null, e0Var.new b(applicationC, str, applicationC, null), 2, null) != null) {
                return;
            }
        } else {
            e0Var = this;
        }
        int code = kj.c.E_91108.getCode();
        u2 u2Var = e0Var.f83715a;
        if (u2Var != null) {
            u2Var.i(code, "E_91108");
        }
        fl.m0 m0Var = fl.m0.f80959a;
    }

    @Override // hj.f
    public final boolean b(Activity activity, ViewGroup viewGroup, String str) {
        View view = this.f83545c;
        if (view == null || this.f83544b == null) {
            return false;
        }
        this.f83550h = true;
        ViewParent parent = view.getParent();
        ViewGroup viewGroup2 = parent instanceof ViewGroup ? (ViewGroup) parent : null;
        if (viewGroup2 != null) {
            viewGroup2.removeView(view);
        }
        viewGroup.removeAllViews();
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
        layoutParams.gravity = 17;
        viewGroup.addView(view, layoutParams);
        if (this.f83551i) {
            this.f83551i = false;
            u2 u2Var = this.f83715a;
            if (u2Var != null) {
                u2Var.a();
            }
        }
        return true;
    }

    @Override // hj.f
    public final void c() {
        kotlinx.coroutines.k.d(kotlinx.coroutines.v1.f87249a, kotlinx.coroutines.f1.c(), null, new a(null), 2, null);
        this.f83550h = false;
        this.f83551i = false;
    }

    @Override // hj.f
    public final boolean d() {
        return this.f83544b == null;
    }

    @Override // hj.f
    public final void e() {
    }

    @Override // hj.f
    public final boolean f() {
        return false;
    }
}