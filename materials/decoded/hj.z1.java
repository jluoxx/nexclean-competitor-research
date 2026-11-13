package hj;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.sg.sdk.api.nativead.AdIconView;
import com.sg.sdk.api.nativead.MediaView;
import com.thinkup.core.api.AdError;
import com.thinkup.core.api.TUAdInfo;
import com.thinkup.core.api.TUAdSourceStatusListener;
import com.thinkup.core.api.TUAdStatusInfo;
import com.thinkup.core.api.TUShowConfig;
import com.thinkup.nativead.api.NativeAd;
import com.thinkup.nativead.api.TUNative;
import com.thinkup.nativead.api.TUNativeAdView;
import com.thinkup.nativead.api.TUNativeDislikeListener;
import com.thinkup.nativead.api.TUNativeEventExListener;
import com.thinkup.nativead.api.TUNativeImageView;
import com.thinkup.nativead.api.TUNativeMaterial;
import com.thinkup.nativead.api.TUNativeNetworkListener;
import com.thinkup.nativead.api.TUNativePrepareInfo;
import java.util.ArrayList;
import java.util.Map;

/* JADX INFO: loaded from: classes7.dex */
public final class z1 extends o2 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public TUNative f83782b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public String f83783c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public NativeAd f83784d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public String f83785e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public double f83786f;

    public static final class a implements TUNativeNetworkListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ String f83787a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ z1 f83788b;

        public a(z1 z1Var, String str) {
            this.f83787a = str;
            this.f83788b = z1Var;
        }

        @Override // com.thinkup.nativead.api.TUNativeNetworkListener
        public final void onNativeAdLoadFail(AdError adError) {
            int i10 = 100;
            if (adError != null) {
                try {
                    String code = adError.getCode();
                    if (code != null) {
                        i10 = Integer.parseInt(code);
                    }
                } catch (Exception unused) {
                }
            }
            z1 z1Var = this.f83788b;
            String desc = adError != null ? adError.getDesc() : null;
            u2 u2Var = z1Var.f83715a;
            if (u2Var != null) {
                u2Var.i(i10, desc);
            }
        }

        @Override // com.thinkup.nativead.api.TUNativeNetworkListener
        public final void onNativeAdLoaded() {
            TUAdStatusInfo tUAdStatusInfoCheckAdStatus;
            q1 q1VarA = r.f83668a.a(3);
            if (q1VarA instanceof c3) {
                if (((c3) q1VarA).f83535c.contains(this.f83787a)) {
                    z1 z1Var = this.f83788b;
                    int code = kj.c.E_91109.getCode();
                    u2 u2Var = z1Var.f83715a;
                    if (u2Var != null) {
                        u2Var.i(code, "E_91109");
                        return;
                    }
                    return;
                }
            }
            TUNative tUNative = this.f83788b.f83782b;
            TUAdInfo tUTopAdInfo = (tUNative == null || (tUAdStatusInfoCheckAdStatus = tUNative.checkAdStatus()) == null) ? null : tUAdStatusInfoCheckAdStatus.getTUTopAdInfo();
            z1 z1Var2 = this.f83788b;
            if (tUTopAdInfo == null) {
                u2 u2Var2 = z1Var2.f83715a;
                if (u2Var2 != null) {
                    u2Var2.i(2, "load failed");
                    return;
                }
                return;
            }
            z1Var2.f83785e = tUTopAdInfo.getAdsourceId();
            z1.h(this.f83788b);
            t2 t2Var = t2.f83703a;
            this.f83788b.g(tUTopAdInfo, t2Var.h(tUTopAdInfo) == 1 ? t2Var.g(tUTopAdInfo) : 0.0d);
            z1 z1Var3 = this.f83788b;
            int iH = t2Var.h(tUTopAdInfo);
            String networkPlacementId = tUTopAdInfo.getNetworkPlacementId();
            u2 u2Var3 = z1Var3.f83715a;
            if (u2Var3 != null) {
                u2Var3.f(iH, networkPlacementId);
            }
            u2 u2Var4 = this.f83788b.f83715a;
            if (u2Var4 != null) {
                u2Var4.c();
            }
            t2Var.c(this.f83787a, 3);
        }
    }

    public static final class b implements TUAdSourceStatusListener {
        public b() {
        }

        @Override // com.thinkup.core.api.TUAdSourceStatusListener
        public final void onAdSourceAttempt(TUAdInfo tUAdInfo) {
            u2 u2Var;
            if (tUAdInfo != null) {
                z1 z1Var = z1.this;
                if (!t2.f83703a.j(tUAdInfo) || (u2Var = z1Var.f83715a) == null) {
                    return;
                }
                u2Var.b();
            }
        }

        @Override // com.thinkup.core.api.TUAdSourceStatusListener
        public final void onAdSourceBiddingAttempt(TUAdInfo tUAdInfo) {
        }

        @Override // com.thinkup.core.api.TUAdSourceStatusListener
        public final void onAdSourceBiddingFail(TUAdInfo tUAdInfo, AdError adError) {
            u2 u2Var;
            if (tUAdInfo != null) {
                z1 z1Var = z1.this;
                if (!t2.f83703a.d(tUAdInfo.getNetworkFirmId()) || (u2Var = z1Var.f83715a) == null) {
                    return;
                }
                u2Var.b();
            }
        }

        @Override // com.thinkup.core.api.TUAdSourceStatusListener
        public final void onAdSourceBiddingFilled(TUAdInfo tUAdInfo) {
        }

        @Override // com.thinkup.core.api.TUAdSourceStatusListener
        public final void onAdSourceLoadFail(TUAdInfo tUAdInfo, AdError adError) {
        }

        @Override // com.thinkup.core.api.TUAdSourceStatusListener
        public final void onAdSourceLoadFilled(TUAdInfo tUAdInfo) {
        }
    }

    public static final class c implements TUNativeEventExListener {
        public c() {
        }

        @Override // com.thinkup.nativead.api.TUNativeEventExListener
        public final void onAdActReward(TUAdInfo tUAdInfo, int i10) {
        }

        @Override // com.thinkup.nativead.api.TUNativeEventExListener
        public final void onAdActRewardSuccess(TUAdInfo tUAdInfo) {
        }

        @Override // com.thinkup.nativead.api.TUNativeEventListener
        public final void onAdClicked(TUNativeAdView tUNativeAdView, TUAdInfo tUAdInfo) {
            u2 u2Var = z1.this.f83715a;
            if (u2Var != null) {
                u2Var.onAdClicked();
            }
        }

        @Override // com.thinkup.nativead.api.TUNativeEventListener
        public final void onAdImpressed(TUNativeAdView tUNativeAdView, TUAdInfo tUAdInfo) {
            u2 u2Var = z1.this.f83715a;
            if (u2Var != null) {
                u2Var.a();
            }
            if (tUAdInfo != null) {
                z1 z1Var = z1.this;
                w2 w2VarB = t2.f83703a.b(tUAdInfo, z1Var.f83786f);
                u2 u2Var2 = z1Var.f83715a;
                if (u2Var2 != null) {
                    u2Var2.h(w2VarB);
                }
            }
        }

        @Override // com.thinkup.nativead.api.TUNativeEventListener
        public final void onAdVideoEnd(TUNativeAdView tUNativeAdView) {
        }

        @Override // com.thinkup.nativead.api.TUNativeEventListener
        public final void onAdVideoProgress(TUNativeAdView tUNativeAdView, int i10) {
        }

        @Override // com.thinkup.nativead.api.TUNativeEventListener
        public final void onAdVideoStart(TUNativeAdView tUNativeAdView) {
        }

        @Override // com.thinkup.nativead.api.TUNativeEventExListener
        public final void onDeeplinkCallback(TUNativeAdView tUNativeAdView, TUAdInfo tUAdInfo, boolean z10) {
        }
    }

    public static final class d extends TUNativeDislikeListener {
        public d() {
        }

        @Override // com.thinkup.nativead.api.TUNativeDislikeListener
        public final void onAdCloseButtonClick(TUNativeAdView tUNativeAdView, TUAdInfo tUAdInfo) {
            u2 u2Var = z1.this.f83715a;
            if (u2Var != null) {
                u2Var.onAdClosed();
            }
        }
    }

    public z1(u2 u2Var) {
        super(u2Var);
        this.f83783c = "";
        this.f83785e = "";
    }

    public static final void h(z1 z1Var) {
        z1Var.getClass();
        q1 q1VarA = r.f83668a.a(3);
        if (q1VarA instanceof c3) {
            ((c3) q1VarA).f83535c.add(z1Var.f83783c);
        }
    }

    @Override // hj.o2
    public final void a(String str, Map map) {
        fl.m0 m0Var;
        TUAdStatusInfo tUAdStatusInfoCheckAdStatus;
        this.f83783c = str;
        Application applicationC = ij.a.c();
        if (applicationC != null) {
            t2.f83703a.c(str, 3);
            if (this.f83782b == null) {
                TUNative tUNative = new TUNative(applicationC, str, new a(this, str));
                this.f83782b = tUNative;
                tUNative.setAdSourceStatusListener(new b());
            }
            TUNative tUNative2 = this.f83782b;
            if (tUNative2 != null && (tUAdStatusInfoCheckAdStatus = tUNative2.checkAdStatus()) != null && !tUAdStatusInfoCheckAdStatus.isReady()) {
                q1 q1VarA = r.f83668a.a(3);
                if (q1VarA instanceof c3) {
                    ((c3) q1VarA).f83535c.remove(this.f83783c);
                }
            }
            TUNative tUNative3 = this.f83782b;
            if (tUNative3 != null) {
                tUNative3.makeAdRequest();
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

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // hj.o2
    public final boolean b(Activity activity, ViewGroup viewGroup, nj.a aVar, String str) {
        q1 q1VarA = r.f83668a.a(3);
        if (q1VarA instanceof c3) {
            ((c3) q1VarA).f83535c.remove(this.f83783c);
        }
        if (this.f83782b != null) {
            TUShowConfig tUShowConfigBuild = new TUShowConfig.Builder().scenarioId(str).build();
            TUNative tUNative = this.f83782b;
            this.f83784d = tUNative != null ? tUNative.getNativeAd(tUShowConfigBuild) : null;
        }
        NativeAd nativeAd = this.f83784d;
        if (nativeAd != null) {
            nativeAd.setNativeEventListener(new c());
            nativeAd.setDislikeCallbackListener(new d());
            if (!nativeAd.isNativeExpress() && nativeAd.getAdMaterial() != null) {
                try {
                    Context contextC = ij.a.c();
                    if (contextC == null) {
                        contextC = aVar.getContext();
                    }
                    TUNativeAdView tUNativeAdView = new TUNativeAdView(contextC);
                    RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-2, -2);
                    layoutParams.addRule(17);
                    viewGroup.removeAllViews();
                    viewGroup.addView(tUNativeAdView, layoutParams);
                    TUNativePrepareInfo tUNativePrepareInfo = new TUNativePrepareInfo();
                    TUNativeMaterial adMaterial = nativeAd.getAdMaterial();
                    ArrayList arrayList = new ArrayList();
                    String title = adMaterial.getTitle();
                    View titleView = aVar.getTitleView();
                    if (titleView != null) {
                        if (title == null || title.length() <= 0) {
                            titleView.setVisibility(8);
                        } else {
                            if (titleView instanceof TextView) {
                                ((TextView) titleView).setText(title);
                            }
                            tUNativePrepareInfo.setTitleView(titleView);
                            arrayList.add(titleView);
                            titleView.setVisibility(0);
                        }
                    }
                    String descriptionText = adMaterial.getDescriptionText();
                    View descView = aVar.getDescView();
                    if (descView != null) {
                        if (descriptionText == null || descriptionText.length() <= 0) {
                            descView.setVisibility(8);
                        } else {
                            if (descView instanceof TextView) {
                                ((TextView) descView).setText(descriptionText);
                            }
                            tUNativePrepareInfo.setDescView(descView);
                            arrayList.add(descView);
                            descView.setVisibility(0);
                        }
                    }
                    String callToActionText = adMaterial.getCallToActionText();
                    View callToActionView = aVar.getCallToActionView();
                    if (callToActionView != null) {
                        if (callToActionText == null || callToActionText.length() <= 0) {
                            callToActionView.setVisibility(8);
                        } else {
                            if (callToActionView instanceof TextView) {
                                ((TextView) callToActionView).setText(callToActionText);
                            }
                            tUNativePrepareInfo.setCtaView(callToActionView);
                            arrayList.add(callToActionView);
                            callToActionView.setVisibility(0);
                        }
                    }
                    View adIconView = adMaterial.getAdIconView();
                    String iconImageUrl = adMaterial.getIconImageUrl();
                    AdIconView adIconView2 = aVar.getAdIconView();
                    if (adIconView2 != null) {
                        adIconView2.removeAllViews();
                        TUNativeImageView tUNativeImageView = new TUNativeImageView(aVar.getContext());
                        if (adIconView != null) {
                            adIconView2.addView(adIconView);
                            ViewGroup.LayoutParams layoutParams2 = adIconView.getLayoutParams();
                            layoutParams2.width = -1;
                            layoutParams2.height = -1;
                            tUNativePrepareInfo.setIconView(adIconView);
                            arrayList.add(adIconView);
                            adIconView2.setVisibility(0);
                        } else if (iconImageUrl == null || TextUtils.isEmpty(iconImageUrl)) {
                            adIconView2.setVisibility(8);
                        } else {
                            adIconView2.addView(tUNativeImageView);
                            ViewGroup.LayoutParams layoutParams3 = tUNativeImageView.getLayoutParams();
                            layoutParams3.width = -1;
                            layoutParams3.height = -1;
                            tUNativeImageView.setImage(iconImageUrl);
                            tUNativePrepareInfo.setIconView(tUNativeImageView);
                            arrayList.add(tUNativeImageView);
                            adIconView2.setVisibility(0);
                        }
                    }
                    RelativeLayout relativeLayout = new RelativeLayout(aVar.getContext());
                    View adMediaView = adMaterial.getAdMediaView(relativeLayout);
                    RelativeLayout.LayoutParams layoutParams4 = new RelativeLayout.LayoutParams(-2, -2);
                    layoutParams4.addRule(13);
                    relativeLayout.removeAllViews();
                    if (adMediaView != null) {
                        if (adMediaView.getParent() != null) {
                            ViewParent parent = adMediaView.getParent();
                            parent.getClass();
                            ((ViewGroup) parent).removeView(adMediaView);
                        }
                        adMediaView.setLayoutParams(layoutParams4);
                        relativeLayout.addView(adMediaView, layoutParams4);
                        arrayList.add(adMediaView);
                        relativeLayout.setVisibility(0);
                    } else if (adMaterial.getMainImageUrl() == null || TextUtils.isEmpty(adMaterial.getMainImageUrl())) {
                        relativeLayout.removeAllViews();
                        relativeLayout.setVisibility(8);
                    } else {
                        TUNativeImageView tUNativeImageView2 = new TUNativeImageView(aVar.getContext());
                        tUNativeImageView2.setImage(adMaterial.getMainImageUrl());
                        tUNativeImageView2.setLayoutParams(layoutParams4);
                        relativeLayout.addView(tUNativeImageView2, layoutParams4);
                        tUNativePrepareInfo.setMainImageView(tUNativeImageView2);
                        arrayList.add(tUNativeImageView2);
                        relativeLayout.setVisibility(0);
                    }
                    RelativeLayout.LayoutParams layoutParams5 = new RelativeLayout.LayoutParams(-1, -1);
                    layoutParams5.addRule(13);
                    MediaView mediaView = aVar.getMediaView();
                    if (mediaView != null) {
                        mediaView.addView(relativeLayout, layoutParams5);
                    }
                    tUNativePrepareInfo.setClickViewList(arrayList);
                    tUNativeAdView.addView(aVar);
                    nativeAd.renderAdContainer(tUNativeAdView, aVar);
                    nativeAd.prepare(tUNativeAdView, tUNativePrepareInfo);
                    return true;
                } catch (Throwable th2) {
                    th2.printStackTrace();
                }
            }
        }
        return false;
    }

    @Override // hj.o2
    public final void c() {
        this.f83784d = null;
        this.f83782b = null;
    }

    @Override // hj.o2
    public final Boolean d() {
        TUAdStatusInfo tUAdStatusInfoCheckAdStatus;
        TUAdStatusInfo tUAdStatusInfoCheckAdStatus2;
        TUNative tUNative = this.f83782b;
        boolean z10 = true;
        if (tUNative == null || (tUAdStatusInfoCheckAdStatus2 = tUNative.checkAdStatus()) == null || !tUAdStatusInfoCheckAdStatus2.isReady()) {
            q1 q1VarA = r.f83668a.a(3);
            if (q1VarA instanceof c3) {
                ((c3) q1VarA).f83535c.remove(this.f83783c);
            }
        }
        TUNative tUNative2 = this.f83782b;
        if (tUNative2 != null && (tUAdStatusInfoCheckAdStatus = tUNative2.checkAdStatus()) != null && tUAdStatusInfoCheckAdStatus.isReady()) {
            z10 = false;
        }
        return Boolean.valueOf(z10);
    }

    @Override // hj.o2
    public final void e() {
        q1 q1VarA = r.f83668a.a(3);
        if (q1VarA instanceof c3) {
            ((c3) q1VarA).f83535c.remove(this.f83783c);
        }
    }

    @Override // hj.o2
    public final boolean f() {
        TUAdStatusInfo tUAdStatusInfoCheckAdStatus;
        TUNative tUNative = this.f83782b;
        TUAdInfo tUTopAdInfo = (tUNative == null || (tUAdStatusInfoCheckAdStatus = tUNative.checkAdStatus()) == null) ? null : tUAdStatusInfoCheckAdStatus.getTUTopAdInfo();
        if (p003kotlin.jvm.internal.v.c(this.f83785e, tUTopAdInfo != null ? tUTopAdInfo.getAdsourceId() : null) || tUTopAdInfo == null) {
            return false;
        }
        this.f83785e = tUTopAdInfo.getAdsourceId();
        t2 t2Var = t2.f83703a;
        g(tUTopAdInfo, t2Var.h(tUTopAdInfo) == 1 ? t2Var.g(tUTopAdInfo) : 0.0d);
        int iH = t2Var.h(tUTopAdInfo);
        String networkPlacementId = tUTopAdInfo.getNetworkPlacementId();
        u2 u2Var = this.f83715a;
        if (u2Var != null) {
            u2Var.f(iH, networkPlacementId);
        }
        return true;
    }

    public final void g(TUAdInfo tUAdInfo, double d10) {
        if (tUAdInfo != null) {
            if (t2.f83703a.d(tUAdInfo.getNetworkFirmId())) {
                u2 u2Var = this.f83715a;
                if (u2Var != null) {
                    u2Var.g(d10);
                }
                this.f83786f = d10;
                return;
            }
            double ecpm = tUAdInfo.getEcpm();
            u2 u2Var2 = this.f83715a;
            if (u2Var2 != null) {
                u2Var2.g(ecpm);
            }
        }
    }
}