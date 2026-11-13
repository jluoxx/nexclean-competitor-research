package hj;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.widget.FrameLayout;
import com.thinkup.core.api.AdError;
import com.thinkup.core.api.TUAdInfo;
import com.thinkup.core.api.TUNetworkConfirmInfo;
import com.thinkup.core.api.TUShowConfig;
import com.thinkup.splashad.api.TUSplashAd;
import com.thinkup.splashad.api.TUSplashAdExtraInfo;
import com.thinkup.splashad.api.TUSplashExListener;
import com.thinkup.splashad.api.TUSplashSkipInfo;
import java.util.HashMap;
import java.util.List;

/* JADX INFO: loaded from: classes7.dex */
public final class e implements j1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ hj.a f83539a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f83540b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ double f83541c;

    public static final class a implements TUSplashExListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Application f83542a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ hj.a f83543b;

        public a(Application application, hj.a aVar) {
            this.f83542a = application;
            this.f83543b = aVar;
        }

        @Override // com.thinkup.splashad.api.TUSplashAdListener
        public final void onAdClick(TUAdInfo tUAdInfo) {
        }

        @Override // com.thinkup.splashad.api.TUSplashAdListener
        public final void onAdDismiss(TUAdInfo tUAdInfo, TUSplashAdExtraInfo tUSplashAdExtraInfo) {
        }

        @Override // com.thinkup.splashad.api.TUSplashAdListener
        public final void onAdLoadTimeout() {
        }

        @Override // com.thinkup.splashad.api.TUSplashAdListener
        public final void onAdLoaded(boolean z10) {
            Activity activity = new Activity();
            FrameLayout frameLayout = new FrameLayout(this.f83542a);
            TUShowConfig tUShowConfigBuild = new TUShowConfig.Builder().scenarioId(this.f83543b.f83607f).build();
            TUSplashAd tUSplashAd = this.f83543b.f83506p;
            if (tUSplashAd != null) {
                tUSplashAd.show(activity, frameLayout, (TUSplashSkipInfo) null, tUShowConfigBuild);
            }
        }

        @Override // com.thinkup.splashad.api.TUSplashAdListener
        public final void onAdShow(TUAdInfo tUAdInfo) {
        }

        @Override // com.thinkup.splashad.api.TUSplashExListener
        public final void onDeeplinkCallback(TUAdInfo tUAdInfo, boolean z10) {
        }

        @Override // com.thinkup.splashad.api.TUSplashExListener
        public final void onDownloadConfirm(Context context, TUAdInfo tUAdInfo, TUNetworkConfirmInfo tUNetworkConfirmInfo) {
        }

        @Override // com.thinkup.splashad.api.TUSplashAdListener
        public final void onNoAdError(AdError adError) {
        }

        @Override // com.thinkup.splashad.api.TUSplashExListener
        public final void onSplashAdReward(TUAdInfo tUAdInfo) {
        }
    }

    public e(hj.a aVar, String str, double d10) {
        this.f83539a = aVar;
        this.f83540b = str;
        this.f83541c = d10;
    }

    @Override // hj.j1
    public final void a(String str) {
    }

    @Override // hj.j1
    public final void onInitSuccess() {
        TUSplashAd tUSplashAd;
        List<TUAdInfo> listCheckValidAdCaches;
        Application applicationC = ij.a.c();
        if (applicationC != null) {
            hj.a aVar = this.f83539a;
            String str = this.f83540b;
            double d10 = this.f83541c;
            TUSplashAd tUSplashAd2 = new TUSplashAd(applicationC, str, new a(applicationC, aVar));
            aVar.f83506p = tUSplashAd2;
            if (tUSplashAd2.isAdReady() && (tUSplashAd = aVar.f83506p) != null && (listCheckValidAdCaches = tUSplashAd.checkValidAdCaches()) != null) {
                listCheckValidAdCaches.clear();
            }
            HashMap map = new HashMap();
            map.put("custom_price", Double.valueOf(d10));
            TUSplashAd tUSplashAd3 = aVar.f83506p;
            if (tUSplashAd3 != null) {
                tUSplashAd3.setLocalExtra(map);
            }
            TUSplashAd tUSplashAd4 = aVar.f83506p;
            if (tUSplashAd4 != null) {
                tUSplashAd4.loadAd();
            }
        }
    }
}