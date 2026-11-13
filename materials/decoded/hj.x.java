package hj;

import android.app.Activity;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.google.android.libraries.ads.mobile.sdk.banner.BannerAd;
import com.google.android.libraries.ads.mobile.sdk.common.AdChoicesView;
import com.google.android.libraries.ads.mobile.sdk.common.AdSourceResponseInfo;
import com.google.android.libraries.ads.mobile.sdk.common.AdValue;
import com.google.android.libraries.ads.mobile.sdk.common.FullScreenContentError;
import com.google.android.libraries.ads.mobile.sdk.common.Image;
import com.google.android.libraries.ads.mobile.sdk.common.LoadAdError;
import com.google.android.libraries.ads.mobile.sdk.common.ResponseInfo;
import com.google.android.libraries.ads.mobile.sdk.nativead.CustomNativeAd;
import com.google.android.libraries.ads.mobile.sdk.nativead.MediaView;
import com.google.android.libraries.ads.mobile.sdk.nativead.NativeAd;
import com.google.android.libraries.ads.mobile.sdk.nativead.NativeAdEventCallback;
import com.google.android.libraries.ads.mobile.sdk.nativead.NativeAdLoader;
import com.google.android.libraries.ads.mobile.sdk.nativead.NativeAdLoaderCallback;
import com.google.android.libraries.ads.mobile.sdk.nativead.NativeAdView;
import com.sg.sdk.api.nativead.AdIconView;
import java.util.Map;

/* JADX INFO: loaded from: classes7.dex */
public final class x extends o2 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public NativeAd f83741b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public String f83742c;

    public static final class a extends ll.m implements tl.n {
        public final /* synthetic */ String OooO00o;
        public final /* synthetic */ x OooO0O0;

        /* JADX INFO: renamed from: hj.x$a$a, reason: collision with other inner class name */
        public static final class C1029a implements NativeAdLoaderCallback {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final /* synthetic */ x f83743a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ String f83744b;

            /* JADX INFO: renamed from: hj.x$a$a$a, reason: collision with other inner class name */
            public static final class C1030a implements NativeAdEventCallback {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public boolean f83745a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final /* synthetic */ x f83746b;

                public C1030a(x xVar) {
                    this.f83746b = xVar;
                }

                @Override // com.google.android.libraries.ads.mobile.sdk.common.AdEventCallback
                public final void onAdClicked() {
                    this.f83745a = true;
                    u2 u2Var = this.f83746b.f83715a;
                    if (u2Var != null) {
                        u2Var.onAdClicked();
                    }
                }

                @Override // com.google.android.libraries.ads.mobile.sdk.common.AdEventCallback
                public final void onAdDismissedFullScreenContent() {
                    this.f83745a = false;
                    u2 u2Var = this.f83746b.f83715a;
                    if (u2Var != null) {
                        u2Var.onAdClosed();
                    }
                }

                @Override // com.google.android.libraries.ads.mobile.sdk.common.AdEventCallback
                public final void onAdFailedToShowFullScreenContent(FullScreenContentError fullScreenContentError) {
                }

                @Override // com.google.android.libraries.ads.mobile.sdk.common.AdEventCallback
                public final void onAdImpression() {
                    this.f83745a = false;
                    u2 u2Var = this.f83746b.f83715a;
                    if (u2Var != null) {
                        u2Var.a();
                    }
                }

                @Override // com.google.android.libraries.ads.mobile.sdk.common.AdEventCallback
                public final void onAdPaid(AdValue adValue) {
                    String id2;
                    ResponseInfo responseInfo;
                    AdSourceResponseInfo loadedAdSourceResponseInfo;
                    if (this.f83746b.f83742c.length() == 0) {
                        x xVar = this.f83746b;
                        NativeAd nativeAd = xVar.f83741b;
                        if (nativeAd == null || (responseInfo = nativeAd.getResponseInfo()) == null || (loadedAdSourceResponseInfo = responseInfo.getLoadedAdSourceResponseInfo()) == null || (id2 = loadedAdSourceResponseInfo.getId()) == null) {
                            id2 = "";
                        }
                        xVar.f83742c = id2;
                    }
                    w2 w2VarF = f0.f83559a.f(adValue, this.f83746b.f83742c);
                    u2 u2Var = this.f83746b.f83715a;
                    if (u2Var != null) {
                        u2Var.h(w2VarF);
                    }
                }

                @Override // com.google.android.libraries.ads.mobile.sdk.common.AdEventCallback
                public final void onAdShowedFullScreenContent() {
                    u2 u2Var;
                    if (!this.f83745a && (u2Var = this.f83746b.f83715a) != null) {
                        u2Var.onAdClicked();
                    }
                    this.f83745a = false;
                }

                @Override // com.google.android.libraries.ads.mobile.sdk.nativead.NativeAdEventCallback
                public final /* bridge */ void onAdSwipeGestureClicked() {
                    super.onAdSwipeGestureClicked();
                }

                @Override // com.google.android.libraries.ads.mobile.sdk.nativead.NativeAdEventCallback
                public final /* bridge */ void onCustomMuteThisAdReported() {
                    super.onCustomMuteThisAdReported();
                }
            }

            public C1029a(x xVar, String str) {
                this.f83743a = xVar;
                this.f83744b = str;
            }

            @Override // com.google.android.libraries.ads.mobile.sdk.nativead.NativeAdLoaderCallback
            public final void onAdFailedToLoad(LoadAdError loadAdError) {
                x xVar = this.f83743a;
                int iOrdinal = loadAdError.getCode().ordinal();
                String message = loadAdError.getMessage();
                u2 u2Var = xVar.f83715a;
                if (u2Var != null) {
                    u2Var.i(iOrdinal, message);
                }
            }

            @Override // com.google.android.libraries.ads.mobile.sdk.nativead.NativeAdLoaderCallback
            public final /* bridge */ void onAdLoadingCompleted() {
                super.onAdLoadingCompleted();
            }

            @Override // com.google.android.libraries.ads.mobile.sdk.nativead.NativeAdLoaderCallback
            public final /* bridge */ void onBannerAdLoaded(BannerAd bannerAd) {
                super.onBannerAdLoaded(bannerAd);
            }

            @Override // com.google.android.libraries.ads.mobile.sdk.nativead.NativeAdLoaderCallback
            public final /* bridge */ void onCustomNativeAdLoaded(CustomNativeAd customNativeAd) {
                super.onCustomNativeAdLoaded(customNativeAd);
            }

            @Override // com.google.android.libraries.ads.mobile.sdk.nativead.NativeAdLoaderCallback
            public final void onNativeAdLoaded(NativeAd nativeAd) {
                String id2;
                u2 u2Var;
                ResponseInfo responseInfo;
                AdSourceResponseInfo loadedAdSourceResponseInfo;
                String instanceId;
                ResponseInfo responseInfo2;
                AdSourceResponseInfo loadedAdSourceResponseInfo2;
                x xVar = this.f83743a;
                xVar.f83741b = nativeAd;
                if (nativeAd != null) {
                    nativeAd.setAdEventCallback(new C1030a(xVar));
                }
                x xVar2 = this.f83743a;
                NativeAd nativeAd2 = xVar2.f83741b;
                String str = "";
                if (nativeAd2 == null || (responseInfo2 = nativeAd2.getResponseInfo()) == null || (loadedAdSourceResponseInfo2 = responseInfo2.getLoadedAdSourceResponseInfo()) == null || (id2 = loadedAdSourceResponseInfo2.getId()) == null) {
                    id2 = "";
                }
                xVar2.f83742c = id2;
                NativeAd nativeAd3 = this.f83743a.f83741b;
                if (nativeAd3 != null && (responseInfo = nativeAd3.getResponseInfo()) != null && (loadedAdSourceResponseInfo = responseInfo.getLoadedAdSourceResponseInfo()) != null && (instanceId = loadedAdSourceResponseInfo.getInstanceId()) != null) {
                    str = instanceId;
                }
                f0 f0Var = f0.f83559a;
                double d10 = f0Var.b(this.f83743a.f83742c) != 4 ? l0.f83618a.d(nativeAd) : 0.0d;
                if (d10 > 1.0E-9d) {
                    u2 u2Var2 = this.f83743a.f83715a;
                    if (u2Var2 != null) {
                        u2Var2.g(d10);
                    }
                } else {
                    double dA = y.f83761a.a(this.f83744b);
                    if (dA > 1.0E-9d && (u2Var = this.f83743a.f83715a) != null) {
                        u2Var.g(dA);
                    }
                }
                x xVar3 = this.f83743a;
                int iB = f0Var.b(xVar3.f83742c);
                u2 u2Var3 = xVar3.f83715a;
                if (u2Var3 != null) {
                    u2Var3.f(iB, str);
                }
                u2 u2Var4 = this.f83743a.f83715a;
                if (u2Var4 != null) {
                    u2Var4.c();
                }
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(String str, x xVar, kl.f fVar) {
            super(2, fVar);
            this.OooO00o = str;
            this.OooO0O0 = xVar;
        }

        @Override // tl.n
        /* JADX INFO: renamed from: OooO00o, reason: merged with bridge method [inline-methods] */
        public final Object invoke(kotlinx.coroutines.p0 p0Var, kl.f<? super fl.m0> fVar) {
            return new a(this.OooO00o, this.OooO0O0, fVar).invokeSuspend(fl.m0.f80959a);
        }

        @Override // ll.a
        public final kl.f<fl.m0> create(Object obj, kl.f<?> fVar) {
            return new a(this.OooO00o, this.OooO0O0, fVar);
        }

        @Override // ll.a
        public final Object invokeSuspend(Object obj) {
            p003kotlin.coroutines.intrinsics.c.f();
            fl.v.b(obj);
            try {
                NativeAdLoader.INSTANCE.load(f0.f83559a.e(this.OooO00o, true), new C1029a(this.OooO0O0, this.OooO00o));
            } catch (Throwable unused) {
                x xVar = this.OooO0O0;
                int code = kj.c.E_91107.getCode();
                u2 u2Var = xVar.f83715a;
                if (u2Var != null) {
                    u2Var.i(code, "E_91107");
                }
            }
            return fl.m0.f80959a;
        }
    }

    public x(u2 u2Var) {
        super(u2Var);
        this.f83742c = "";
    }

    @Override // hj.o2
    public final void a(String str, Map map) {
        if (ij.a.c() == null || kotlinx.coroutines.k.d(kotlinx.coroutines.v1.f87249a, kotlinx.coroutines.f1.c(), null, new a(str, this, null), 2, null) == null) {
            int code = kj.c.E_91108.getCode();
            u2 u2Var = this.f83715a;
            if (u2Var != null) {
                u2Var.i(code, "E_91108");
            }
            fl.m0 m0Var = fl.m0.f80959a;
        }
    }

    @Override // hj.o2
    public final boolean b(Activity activity, ViewGroup viewGroup, nj.a aVar, String str) {
        Drawable drawable;
        NativeAd nativeAd = this.f83741b;
        if (nativeAd != null) {
            try {
                Context contextC = ij.a.c();
                if (contextC == null) {
                    contextC = aVar.getContext();
                }
                NativeAdView nativeAdView = new NativeAdView(contextC);
                MediaView mediaView = new MediaView(aVar.getContext());
                View titleView = aVar.getTitleView();
                if (titleView != null) {
                    if (titleView instanceof TextView) {
                        ((TextView) titleView).setText(nativeAd.getHeadline());
                    }
                    nativeAdView.setHeadlineView(titleView);
                }
                View descView = aVar.getDescView();
                if (descView != null) {
                    if (descView instanceof TextView) {
                        ((TextView) descView).setText(nativeAd.getBody());
                    }
                    nativeAdView.setBodyView(descView);
                }
                View callToActionView = aVar.getCallToActionView();
                if (callToActionView != null) {
                    if (callToActionView instanceof TextView) {
                        ((TextView) callToActionView).setText(nativeAd.getCallToAction());
                    }
                    nativeAdView.setCallToActionView(callToActionView);
                    String callToAction = nativeAd.getCallToAction();
                    if (callToAction == null || callToAction.length() <= 0) {
                        callToActionView.setVisibility(8);
                    } else {
                        callToActionView.setVisibility(0);
                    }
                }
                com.sg.sdk.api.nativead.MediaView mediaView2 = aVar.getMediaView();
                if (mediaView2 != null) {
                    mediaView2.removeAllViews();
                    mediaView2.addView(mediaView);
                    RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-2, -2);
                    layoutParams.addRule(13);
                    mediaView.setLayoutParams(layoutParams);
                }
                AdIconView adIconView = aVar.getAdIconView();
                if (adIconView != null) {
                    adIconView.removeAllViews();
                    ImageView imageView = new ImageView(aVar.getContext());
                    adIconView.addView(imageView);
                    ViewGroup.LayoutParams layoutParams2 = imageView.getLayoutParams();
                    layoutParams2.width = -1;
                    layoutParams2.height = -1;
                    Image icon = nativeAd.getIcon();
                    if (icon == null || (drawable = icon.getDrawable()) == null) {
                        adIconView.setVisibility(8);
                    } else {
                        adIconView.setVisibility(0);
                        imageView.setImageDrawable(drawable);
                    }
                    nativeAdView.setIconView(imageView);
                }
                View adFlagView = aVar.getAdFlagView();
                if (adFlagView != null) {
                    nativeAdView.setAdvertiserView(adFlagView);
                }
                RelativeLayout.LayoutParams layoutParams3 = new RelativeLayout.LayoutParams(-2, -2);
                layoutParams3.addRule(17);
                nativeAdView.addView(aVar, layoutParams3);
                viewGroup.removeAllViews();
                RelativeLayout.LayoutParams layoutParams4 = new RelativeLayout.LayoutParams(-1, -2);
                layoutParams4.addRule(17);
                viewGroup.addView(nativeAdView, layoutParams4);
                nativeAdView.registerNativeAd(nativeAd, mediaView);
                AdChoicesView adChoicesView = nativeAdView.getAdChoicesView();
                if (adChoicesView == null) {
                    return true;
                }
                adChoicesView.bringToFront();
                return true;
            } catch (Throwable th2) {
                th2.printStackTrace();
            }
        }
        return false;
    }

    @Override // hj.o2
    public final void c() {
        NativeAd nativeAd = this.f83741b;
        if (nativeAd != null) {
            nativeAd.destroy();
        }
        this.f83741b = null;
    }

    @Override // hj.o2
    public final Boolean d() {
        return Boolean.valueOf(this.f83741b == null);
    }

    @Override // hj.o2
    public final void e() {
    }

    @Override // hj.o2
    public final boolean f() {
        return false;
    }
}