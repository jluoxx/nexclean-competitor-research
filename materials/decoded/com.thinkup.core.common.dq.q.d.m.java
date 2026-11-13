package com.thinkup.core.common.dq.q.d;

import android.content.Context;
import android.view.View;
import com.thinkup.core.api.TUNetworkConfirmInfo;

/* JADX INFO: loaded from: classes7.dex */
public interface m {
    void onAdClicked(View view);

    void onAdDislikeButtonClick();

    void onAdImpressed();

    void onAdVideoEnd();

    void onAdVideoProgress(int i10);

    void onAdVideoStart();

    void onClose();

    void onDeeplinkCallback(boolean z10);

    void onDownloadConfirmCallback(Context context, View view, TUNetworkConfirmInfo tUNetworkConfirmInfo);

    void onVideoError(String str, String str2);
}