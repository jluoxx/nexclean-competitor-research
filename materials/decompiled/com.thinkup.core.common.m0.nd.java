package com.thinkup.core.common.m0;

import com.thinkup.core.api.AdError;

/* JADX INFO: loaded from: classes7.dex */
public interface nd {
    void onLoadCanceled(int i10);

    void onLoadError(int i10, String str, AdError adError);

    void onLoadFinish(int i10, Object obj);

    void onLoadStart(int i10);
}