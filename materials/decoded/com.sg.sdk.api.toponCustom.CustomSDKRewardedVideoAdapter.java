package com.sg.sdk.api.toponCustom;

import android.app.Activity;
import android.content.Context;
import com.thinkup.core.api.TUAdConst;
import com.thinkup.core.api.TUBiddingListener;
import com.thinkup.core.api.TUBiddingResult;
import com.thinkup.rewardvideo.unitgroup.api.CustomRewardVideoAdapter;
import com.thinkup.rewardvideo.unitgroup.api.CustomRewardedVideoEventListener;
import java.util.Map;
import java.util.UUID;

/* JADX INFO: loaded from: classes7.dex */
public class CustomSDKRewardedVideoAdapter extends CustomRewardVideoAdapter {
    private boolean isReady = false;
    private Double bidPrice = Double.valueOf(0.0d);

    @Override // com.thinkup.core.api.bridge.ITUBaseAdAdapter
    public void destory() {
        this.bidPrice = Double.valueOf(0.0d);
    }

    @Override // com.thinkup.core.api.bridge.ITUBaseAdAdapter
    public String getNetworkName() {
        return "topon_custom";
    }

    @Override // com.thinkup.core.api.bridge.ITUBaseAdAdapter
    public String getNetworkPlacementId() {
        return "topon_custom_reward";
    }

    @Override // com.thinkup.core.api.bridge.ITUBaseAdAdapter
    public String getNetworkSDKVersion() {
        return "";
    }

    @Override // com.thinkup.core.api.bridge.ITUBaseAdAdapter
    public boolean isAdReady() {
        return this.isReady;
    }

    @Override // com.thinkup.core.api.bridge.ITUBaseAdAdapter
    public void loadCustomNetworkAd(Context context, Map<String, Object> map, Map<String, Object> map2) {
    }

    @Override // com.thinkup.rewardvideo.unitgroup.api.CustomRewardVideoAdapter
    public void show(Activity activity) {
        CustomRewardedVideoEventListener customRewardedVideoEventListener = this.mImpressionListener;
        if (customRewardedVideoEventListener != null) {
            customRewardedVideoEventListener.onRewardedVideoAdPlayStart();
            this.mImpressionListener.onRewardedVideoAdClosed();
        }
        this.isReady = false;
        this.bidPrice = Double.valueOf(0.0d);
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
        if (tUBiddingListener != null) {
            tUBiddingListener.onC2SBiddingResultWithCache(TUBiddingResult.success(this.bidPrice.doubleValue(), string, null, currency), null);
        }
        return true;
    }
}