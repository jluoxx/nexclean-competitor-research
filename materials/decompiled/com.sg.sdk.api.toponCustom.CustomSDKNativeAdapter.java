package com.sg.sdk.api.toponCustom;

import android.content.Context;
import android.view.View;
import com.thinkup.core.api.TUAdConst;
import com.thinkup.core.api.TUBiddingListener;
import com.thinkup.core.api.TUBiddingResult;
import com.thinkup.nativead.api.TUNativePrepareInfo;
import com.thinkup.nativead.unitgroup.api.CustomNativeAd;
import com.thinkup.nativead.unitgroup.api.CustomNativeAdapter;
import java.util.Map;
import java.util.UUID;

/* JADX INFO: loaded from: classes7.dex */
public class CustomSDKNativeAdapter extends CustomNativeAdapter {
    private boolean isReady = false;
    private Double bidPrice = Double.valueOf(0.0d);

    public static class a extends CustomNativeAd {
        @Override // com.thinkup.nativead.unitgroup.api.CustomNativeAd, com.thinkup.nativead.unitgroup.d
        public void prepare(View view, TUNativePrepareInfo tUNativePrepareInfo) {
            super.prepare(view, tUNativePrepareInfo);
            notifyAdImpression();
        }
    }

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
        return "topon_custom_native";
    }

    @Override // com.thinkup.core.api.bridge.ITUBaseAdAdapter
    public String getNetworkSDKVersion() {
        return "";
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
        a aVar = new a();
        this.isReady = true;
        if (tUBiddingListener != null) {
            tUBiddingListener.onC2SBiddingResultWithCache(TUBiddingResult.success(this.bidPrice.doubleValue(), string, null, currency), aVar);
        }
        return true;
    }
}