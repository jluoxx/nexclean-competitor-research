package com.thinkup.core.common.o;

import android.content.Context;
import android.view.View;
import com.thinkup.core.api.TUNetworkConfirmInfo;

/* JADX INFO: loaded from: classes7.dex */
public interface mm {
    void onAdActReward(int i10);

    void onAdActRewardSuccess();

    void onAdClicked(View view);

    void onAdDislikeButtonClick();

    void onAdImpressed();

    void onAdVideoEnd();

    void onAdVideoProgress(int i10);

    void onAdVideoStart();

    void onDeeplinkCallback(boolean z10);

    void onDownloadConfirmCallback(Context context, View view, TUNetworkConfirmInfo tUNetworkConfirmInfo);
}