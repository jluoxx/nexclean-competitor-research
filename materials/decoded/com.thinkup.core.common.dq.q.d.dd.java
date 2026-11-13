package com.thinkup.core.common.dq.q.d;

import android.view.View;
import com.thinkup.core.api.BaseAd;
import com.thinkup.core.api.TUNativeAdCustomRender;
import com.thinkup.core.api.TUNativeAdInfo;
import com.thinkup.core.api.TUShakeViewListener;
import com.thinkup.core.api.bridge.TUBaseAdAdapter;

/* JADX INFO: loaded from: classes7.dex */
public interface dd extends TUNativeAdInfo {
    View d(int i10, int i11, TUShakeViewListener tUShakeViewListener);

    BaseAd d();

    void d(TUNativeAdCustomRender tUNativeAdCustomRender);

    void d(TUNativeAdInfo.AdController adController);

    void d(com.thinkup.core.common.dq.m mVar);

    TUBaseAdAdapter m();

    TUNativeAdInfo.AdPrepareInfo n();

    TUNativeAdCustomRender o();
}