package hj;

import android.app.Activity;
import android.app.Application;
import com.thinkup.core.api.AdError;
import com.thinkup.core.api.TUAdInfo;
import com.thinkup.core.api.TUShowConfig;
import com.thinkup.interstitial.api.TUInterstitial;
import com.thinkup.interstitial.api.TUInterstitialListener;
import java.util.HashMap;
import java.util.List;

/* JADX INFO: loaded from: classes7.dex */
public final class p2 implements j1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ String f83657a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ double f83658b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ q2 f83659c;

    public static final class a implements TUInterstitialListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ q2 f83660a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ p003kotlin.jvm.internal.v0 f83661b;

        public a(q2 q2Var, p003kotlin.jvm.internal.v0 v0Var) {
            this.f83660a = q2Var;
            this.f83661b = v0Var;
        }

        @Override // com.thinkup.interstitial.api.TUInterstitialListener
        public final void onInterstitialAdClicked(TUAdInfo tUAdInfo) {
        }

        @Override // com.thinkup.interstitial.api.TUInterstitialListener
        public final void onInterstitialAdClose(TUAdInfo tUAdInfo) {
        }

        @Override // com.thinkup.interstitial.api.TUInterstitialListener
        public final void onInterstitialAdLoadFail(AdError adError) {
        }

        @Override // com.thinkup.interstitial.api.TUInterstitialListener
        public final void onInterstitialAdLoaded() {
            ((TUInterstitial) this.f83661b.element).show(new Activity(), new TUShowConfig.Builder().scenarioId(this.f83660a.f83607f).build());
        }

        @Override // com.thinkup.interstitial.api.TUInterstitialListener
        public final void onInterstitialAdShow(TUAdInfo tUAdInfo) {
        }

        @Override // com.thinkup.interstitial.api.TUInterstitialListener
        public final void onInterstitialAdVideoEnd(TUAdInfo tUAdInfo) {
        }

        @Override // com.thinkup.interstitial.api.TUInterstitialListener
        public final void onInterstitialAdVideoError(AdError adError) {
        }

        @Override // com.thinkup.interstitial.api.TUInterstitialListener
        public final void onInterstitialAdVideoStart(TUAdInfo tUAdInfo) {
        }
    }

    public p2(String str, double d10, q2 q2Var) {
        this.f83657a = str;
        this.f83658b = d10;
        this.f83659c = q2Var;
    }

    @Override // hj.j1
    public final void a(String str) {
    }

    @Override // hj.j1
    public final void onInitSuccess() {
        List<TUAdInfo> listCheckValidAdCaches;
        Application applicationC = ij.a.c();
        if (applicationC != null) {
            String str = this.f83657a;
            double d10 = this.f83658b;
            q2 q2Var = this.f83659c;
            p003kotlin.jvm.internal.v0 v0Var = new p003kotlin.jvm.internal.v0();
            TUInterstitial tUInterstitial = new TUInterstitial(applicationC, str);
            v0Var.element = tUInterstitial;
            if (tUInterstitial.isAdReady() && (listCheckValidAdCaches = ((TUInterstitial) v0Var.element).checkValidAdCaches()) != null) {
                listCheckValidAdCaches.clear();
            }
            HashMap map = new HashMap();
            map.put("custom_price", Double.valueOf(d10));
            ((TUInterstitial) v0Var.element).setLocalExtra(map);
            ((TUInterstitial) v0Var.element).setAdListener(new a(q2Var, v0Var));
            ((TUInterstitial) v0Var.element).load();
        }
    }
}