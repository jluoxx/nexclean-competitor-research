package com.thinkup.core.common.dq.q;

import android.content.Context;
import android.view.View;
import com.thinkup.core.api.TUNetworkConfirmInfo;
import com.thinkup.core.api.bridge.TUBaseAdAdapter;
import com.thinkup.core.common.dm.m0;
import com.thinkup.core.common.dq.q.d.m;

/* JADX INFO: loaded from: classes7.dex */
public abstract class d implements m {
    private com.thinkup.core.common.dm.d adCacheInfo;
    private int clickType;
    private int clickedArea;

    public d(com.thinkup.core.common.dm.d dVar) {
        this.adCacheInfo = dVar;
    }

    public int getClickType() {
        return this.clickType;
    }

    public int getClickedArea() {
        return this.clickedArea;
    }

    @Override // com.thinkup.core.common.dq.q.d.m
    public void onAdClicked(View view) {
        TUBaseAdAdapter tUBaseAdAdapterQ;
        com.thinkup.core.common.dm.d dVar = this.adCacheInfo;
        if (dVar == null || (tUBaseAdAdapterQ = dVar.q()) == null || tUBaseAdAdapterQ.getTrackingInfo() == null) {
            return;
        }
        m0 trackingInfo = tUBaseAdAdapterQ.getTrackingInfo();
        trackingInfo.dd0(getClickedArea());
        trackingInfo.ddd(getClickType());
    }

    @Override // com.thinkup.core.common.dq.q.d.m
    public void onAdDislikeButtonClick() {
    }

    @Override // com.thinkup.core.common.dq.q.d.m
    public void onAdImpressed() {
    }

    @Override // com.thinkup.core.common.dq.q.d.m
    public void onAdVideoEnd() {
    }

    @Override // com.thinkup.core.common.dq.q.d.m
    public void onAdVideoProgress(int i10) {
    }

    @Override // com.thinkup.core.common.dq.q.d.m
    public void onAdVideoStart() {
    }

    @Override // com.thinkup.core.common.dq.q.d.m
    public void onClose() {
    }

    @Override // com.thinkup.core.common.dq.q.d.m
    public void onDeeplinkCallback(boolean z10) {
    }

    @Override // com.thinkup.core.common.dq.q.d.m
    public void onDownloadConfirmCallback(Context context, View view, TUNetworkConfirmInfo tUNetworkConfirmInfo) {
    }

    @Override // com.thinkup.core.common.dq.q.d.m
    public void onVideoError(String str, String str2) {
    }

    public void setClickType(int i10) {
        this.clickType = i10;
    }

    public void setClickedArea(int i10) {
        this.clickedArea = i10;
    }

    public d() {
    }
}