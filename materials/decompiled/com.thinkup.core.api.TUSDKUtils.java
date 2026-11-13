package com.thinkup.core.api;

import android.content.Context;
import com.thinkup.core.common.nn.mo;
import com.thinkup.core.common.nn.nd;

/* JADX INFO: loaded from: classes7.dex */
public class TUSDKUtils {
    public static int dip2px(Context context, float f10) {
        return mo.d(context, f10);
    }

    public static double getRmbChangeToUsdRate() {
        return nd.m();
    }

    public static double getUsdChangeToRmbRate() {
        return nd.d();
    }

    public static int px2dip(Context context, float f10) {
        return mo.m(context, f10);
    }
}