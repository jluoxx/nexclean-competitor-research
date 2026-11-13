package hj;

import android.app.Application;
import android.content.Context;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.thinkup.banner.api.TUBannerExListener;
import com.thinkup.banner.api.TUBannerView;
import com.thinkup.core.api.AdError;
import com.thinkup.core.api.TUAdInfo;
import com.thinkup.core.api.TUAdStatusInfo;
import com.thinkup.core.api.TUNetworkConfirmInfo;
import com.thinkup.core.api.TUShowConfig;
import java.util.HashMap;
import java.util.List;

/* JADX INFO: loaded from: classes7.dex */
public final class h implements j1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ String f83580a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ double f83581b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ j f83582c;

    public static final class a implements TUBannerExListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ j f83583a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ TUBannerView f83584b;

        public a(j jVar, TUBannerView tUBannerView) {
            this.f83583a = jVar;
            this.f83584b = tUBannerView;
        }

        @Override // com.thinkup.banner.api.TUBannerListener
        public final void onBannerAutoRefreshFail(AdError adError) {
        }

        @Override // com.thinkup.banner.api.TUBannerListener
        public final void onBannerAutoRefreshed(TUAdInfo tUAdInfo) {
        }

        @Override // com.thinkup.banner.api.TUBannerListener
        public final void onBannerClicked(TUAdInfo tUAdInfo) {
        }

        @Override // com.thinkup.banner.api.TUBannerListener
        public final void onBannerClose(TUAdInfo tUAdInfo) {
        }

        @Override // com.thinkup.banner.api.TUBannerListener
        public final void onBannerFailed(AdError adError) {
        }

        @Override // com.thinkup.banner.api.TUBannerListener
        public final void onBannerLoaded() {
            this.f83584b.setShowConfig(new TUShowConfig.Builder().scenarioId(this.f83583a.f83607f).build());
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(1, 1);
            layoutParams.gravity = 17;
            ViewGroup viewGroup = this.f83583a.f83595p;
            if (viewGroup != null) {
                viewGroup.addView(this.f83584b, 0, layoutParams);
            }
        }

        @Override // com.thinkup.banner.api.TUBannerListener
        public final void onBannerShow(TUAdInfo tUAdInfo) {
        }

        @Override // com.thinkup.banner.api.TUBannerExListener
        public final void onDeeplinkCallback(boolean z10, TUAdInfo tUAdInfo, boolean z11) {
        }

        @Override // com.thinkup.banner.api.TUBannerExListener
        public final void onDownloadConfirm(Context context, TUAdInfo tUAdInfo, TUNetworkConfirmInfo tUNetworkConfirmInfo) {
        }
    }

    public h(String str, double d10, j jVar) {
        this.f83580a = str;
        this.f83581b = d10;
        this.f83582c = jVar;
    }

    @Override // hj.j1
    public final void a(String str) {
    }

    @Override // hj.j1
    public final void onInitSuccess() {
        List<TUAdInfo> listCheckValidAdCaches;
        Application applicationC = ij.a.c();
        if (applicationC != null) {
            String str = this.f83580a;
            double d10 = this.f83581b;
            j jVar = this.f83582c;
            TUBannerView tUBannerView = new TUBannerView(applicationC);
            tUBannerView.setPlacementId(str);
            TUAdStatusInfo tUAdStatusInfoCheckAdStatus = tUBannerView.checkAdStatus();
            if (tUAdStatusInfoCheckAdStatus != null && tUAdStatusInfoCheckAdStatus.isReady() && (listCheckValidAdCaches = tUBannerView.checkValidAdCaches()) != null) {
                listCheckValidAdCaches.clear();
            }
            HashMap map = new HashMap();
            map.put("custom_price", Double.valueOf(d10));
            tUBannerView.setLocalExtra(map);
            tUBannerView.setBannerAdListener(new a(jVar, tUBannerView));
            tUBannerView.loadAd();
        }
    }
}