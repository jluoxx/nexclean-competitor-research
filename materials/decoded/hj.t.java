package hj;

import android.app.Activity;
import android.app.Application;
import com.thinkup.core.api.AdError;
import com.thinkup.core.api.TUAdInfo;
import com.thinkup.core.api.TUShowConfig;
import com.thinkup.rewardvideo.api.TURewardVideoAd;
import com.thinkup.rewardvideo.api.TURewardVideoListener;
import java.util.HashMap;
import java.util.List;

/* JADX INFO: loaded from: classes7.dex */
public final class t implements j1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ String f83697a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ double f83698b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ u f83699c;

    public static final class a implements TURewardVideoListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ u f83700a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ p003kotlin.jvm.internal.v0 f83701b;

        public a(u uVar, p003kotlin.jvm.internal.v0 v0Var) {
            this.f83700a = uVar;
            this.f83701b = v0Var;
        }

        @Override // com.thinkup.rewardvideo.api.TURewardVideoListener
        public final void onReward(TUAdInfo tUAdInfo) {
        }

        @Override // com.thinkup.rewardvideo.api.TURewardVideoListener
        public final void onRewardedVideoAdClosed(TUAdInfo tUAdInfo) {
        }

        @Override // com.thinkup.rewardvideo.api.TURewardVideoListener
        public final void onRewardedVideoAdFailed(AdError adError) {
        }

        @Override // com.thinkup.rewardvideo.api.TURewardVideoListener
        public final void onRewardedVideoAdLoaded() {
            ((TURewardVideoAd) this.f83701b.element).show(new Activity(), new TUShowConfig.Builder().scenarioId(this.f83700a.f83607f).build());
        }

        @Override // com.thinkup.rewardvideo.api.TURewardVideoListener
        public final void onRewardedVideoAdPlayClicked(TUAdInfo tUAdInfo) {
        }

        @Override // com.thinkup.rewardvideo.api.TURewardVideoListener
        public final void onRewardedVideoAdPlayEnd(TUAdInfo tUAdInfo) {
        }

        @Override // com.thinkup.rewardvideo.api.TURewardVideoListener
        public final void onRewardedVideoAdPlayFailed(AdError adError, TUAdInfo tUAdInfo) {
        }

        @Override // com.thinkup.rewardvideo.api.TURewardVideoListener
        public final void onRewardedVideoAdPlayStart(TUAdInfo tUAdInfo) {
        }
    }

    public t(String str, double d10, u uVar) {
        this.f83697a = str;
        this.f83698b = d10;
        this.f83699c = uVar;
    }

    @Override // hj.j1
    public final void a(String str) {
    }

    @Override // hj.j1
    public final void onInitSuccess() {
        List<TUAdInfo> listCheckValidAdCaches;
        Application applicationC = ij.a.c();
        if (applicationC != null) {
            String str = this.f83697a;
            double d10 = this.f83698b;
            u uVar = this.f83699c;
            p003kotlin.jvm.internal.v0 v0Var = new p003kotlin.jvm.internal.v0();
            TURewardVideoAd tURewardVideoAd = new TURewardVideoAd(applicationC, str);
            v0Var.element = tURewardVideoAd;
            if (tURewardVideoAd.isAdReady() && (listCheckValidAdCaches = ((TURewardVideoAd) v0Var.element).checkValidAdCaches()) != null) {
                listCheckValidAdCaches.clear();
            }
            HashMap map = new HashMap();
            map.put("custom_price", Double.valueOf(d10));
            ((TURewardVideoAd) v0Var.element).setLocalExtra(map);
            ((TURewardVideoAd) v0Var.element).setAdListener(new a(uVar, v0Var));
            ((TURewardVideoAd) v0Var.element).load();
        }
    }
}