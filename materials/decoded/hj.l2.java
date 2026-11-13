package hj;

import android.app.Application;
import com.thinkup.core.api.AdError;
import com.thinkup.core.api.TUAdInfo;
import com.thinkup.core.api.TUAdStatusInfo;
import com.thinkup.core.api.TUShowConfig;
import com.thinkup.nativead.api.NativeAd;
import com.thinkup.nativead.api.TUNative;
import com.thinkup.nativead.api.TUNativeAdView;
import com.thinkup.nativead.api.TUNativeEventExListener;
import com.thinkup.nativead.api.TUNativeNetworkListener;
import java.util.HashMap;
import java.util.List;

/* JADX INFO: loaded from: classes7.dex */
public final class l2 implements j1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ q0 f83620a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f83621b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ double f83622c;

    public static final class a implements TUNativeNetworkListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ q0 f83623a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Application f83624b;

        /* JADX INFO: renamed from: hj.l2$a$a, reason: collision with other inner class name */
        public static final class C1024a implements TUNativeEventExListener {
            @Override // com.thinkup.nativead.api.TUNativeEventExListener
            public final void onAdActReward(TUAdInfo tUAdInfo, int i10) {
            }

            @Override // com.thinkup.nativead.api.TUNativeEventExListener
            public final void onAdActRewardSuccess(TUAdInfo tUAdInfo) {
            }

            @Override // com.thinkup.nativead.api.TUNativeEventListener
            public final void onAdClicked(TUNativeAdView tUNativeAdView, TUAdInfo tUAdInfo) {
            }

            @Override // com.thinkup.nativead.api.TUNativeEventListener
            public final void onAdImpressed(TUNativeAdView tUNativeAdView, TUAdInfo tUAdInfo) {
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

        public a(q0 q0Var, Application application) {
            this.f83623a = q0Var;
            this.f83624b = application;
        }

        @Override // com.thinkup.nativead.api.TUNativeNetworkListener
        public final void onNativeAdLoadFail(AdError adError) {
        }

        @Override // com.thinkup.nativead.api.TUNativeNetworkListener
        public final void onNativeAdLoaded() {
            TUShowConfig tUShowConfigBuild = new TUShowConfig.Builder().scenarioId(this.f83623a.f83607f).build();
            TUNative tUNative = this.f83623a.f83665p;
            NativeAd nativeAd = tUNative != null ? tUNative.getNativeAd(tUShowConfigBuild) : null;
            TUNativeAdView tUNativeAdView = new TUNativeAdView(this.f83624b);
            if (nativeAd != null) {
                nativeAd.renderAdContainer(tUNativeAdView, null);
            }
            if (nativeAd != null) {
                nativeAd.prepare(tUNativeAdView, null);
            }
            if (nativeAd != null) {
                nativeAd.setNativeEventListener(new C1024a());
            }
        }
    }

    public l2(q0 q0Var, String str, double d10) {
        this.f83620a = q0Var;
        this.f83621b = str;
        this.f83622c = d10;
    }

    @Override // hj.j1
    public final void a(String str) {
    }

    @Override // hj.j1
    public final void onInitSuccess() {
        TUNative tUNative;
        List<TUAdInfo> listCheckValidAdCaches;
        Application applicationC = ij.a.c();
        if (applicationC != null) {
            q0 q0Var = this.f83620a;
            String str = this.f83621b;
            double d10 = this.f83622c;
            TUNative tUNative2 = new TUNative(applicationC, str, new a(q0Var, applicationC));
            q0Var.f83665p = tUNative2;
            TUAdStatusInfo tUAdStatusInfoCheckAdStatus = tUNative2.checkAdStatus();
            if (tUAdStatusInfoCheckAdStatus != null && tUAdStatusInfoCheckAdStatus.isReady() && (tUNative = q0Var.f83665p) != null && (listCheckValidAdCaches = tUNative.checkValidAdCaches()) != null) {
                listCheckValidAdCaches.clear();
            }
            HashMap map = new HashMap();
            map.put("custom_price", Double.valueOf(d10));
            TUNative tUNative3 = q0Var.f83665p;
            if (tUNative3 != null) {
                tUNative3.setLocalExtra(map);
            }
            TUNative tUNative4 = q0Var.f83665p;
            if (tUNative4 != null) {
                tUNative4.makeAdRequest();
            }
        }
    }
}