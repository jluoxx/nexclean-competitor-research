package com.sg.sdk.api.toponCustom;

import android.content.Context;
import android.view.View;
import com.thinkup.banner.unitgroup.api.CustomBannerAdapter;
import com.thinkup.banner.unitgroup.api.CustomBannerEventListener;
import com.thinkup.core.api.TUAdConst;
import com.thinkup.core.api.TUBiddingListener;
import com.thinkup.core.api.TUBiddingResult;
import java.util.Map;
import java.util.UUID;

/* JADX INFO: loaded from: classes7.dex */
public class CustomSDKBannerAdapter extends CustomBannerAdapter {
    private View bannerView;
    private boolean isReady = false;
    private Double bidPrice = Double.valueOf(0.0d);

    public class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            CustomBannerEventListener customBannerEventListener = CustomSDKBannerAdapter.this.mImpressionEventListener;
            if (customBannerEventListener != null) {
                customBannerEventListener.onBannerAdShow();
            }
            CustomSDKBannerAdapter.this.isReady = false;
            CustomSDKBannerAdapter.this.bidPrice = Double.valueOf(0.0d);
        }
    }

    @Override // com.thinkup.core.api.bridge.ITUBaseAdAdapter
    public void destory() {
        this.bidPrice = Double.valueOf(0.0d);
        this.bannerView = null;
    }

    @Override // com.thinkup.banner.unitgroup.api.CustomBannerAdapter
    public View getBannerView() {
        this.bannerView.postDelayed(new a(), 500L);
        return this.bannerView;
    }

    @Override // com.thinkup.core.api.bridge.ITUBaseAdAdapter
    public String getNetworkName() {
        return "topon_custom";
    }

    @Override // com.thinkup.core.api.bridge.ITUBaseAdAdapter
    public String getNetworkPlacementId() {
        return "topon_custom_banner";
    }

    @Override // com.thinkup.core.api.bridge.ITUBaseAdAdapter
    public String getNetworkSDKVersion() {
        return null;
    }

    @Override // com.thinkup.banner.unitgroup.api.CustomBannerAdapter, com.thinkup.core.api.bridge.ITUBaseAdAdapter
    public boolean isAdReady() {
        return this.isReady;
    }

    @Override // com.thinkup.core.api.bridge.ITUBaseAdAdapter
    public void loadCustomNetworkAd(Context context, Map<String, Object> map, Map<String, Object> map2) {
    }

    @Override // com.thinkup.core.api.bridge.TUBaseAdAdapter, com.thinkup.core.api.bridge.ITUBaseAdAdapter
    public boolean startBiddingRequest(Context context, Map<String, Object> map, Map<String, Object> map2, TUBiddingListener tUBiddingListener) {
        if (map2 != null) {
            try {
                Double d10 = (Double) map2.get("custom_price");
                this.bidPrice = d10;
                if (d10 == null) {
                    this.bidPrice = Double.valueOf(0.0d);
                }
            } catch (Exception e10) {
                e10.printStackTrace();
            }
        }
        TUAdConst.CURRENCY currency = TUAdConst.CURRENCY.USD;
        String string = UUID.randomUUID().toString();
        this.isReady = true;
        this.bannerView = new View(context);
        if (tUBiddingListener != null) {
            tUBiddingListener.onC2SBiddingResultWithCache(TUBiddingResult.success(this.bidPrice.doubleValue(), string, null, currency), null);
        }
        return true;
    }
}