package com.thinkup.core.api;

import android.content.Context;
import com.thinkup.core.common.d0;
import com.thinkup.core.common.nn.mq;
import com.thinkup.core.common.o.nd;
import com.thinkup.core.q.m0;
import com.thinkup.core.q.mm;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: loaded from: classes7.dex */
public class TUSDKGlobalSetting {
    public static long mDelayInspectTime = 0;
    private static boolean mDenyApi_getRunningAppProcesses = false;
    public static long mInspectInterval;
    private static final List<String> sensorNetworkList = new CopyOnWriteArrayList();
    public static SHAKE_TYPE shakeControlType = SHAKE_TYPE.DEFAULT_NETWORK;
    public static boolean isHideNavAndStatusBar = false;
    public static boolean enableGetDeviceInfoInBg = false;
    public static Boolean isGlobalMute = null;

    public enum SHAKE_TYPE {
        DEFAULT_NETWORK,
        FORBID_ALL,
        ALLOW_ALL,
        ALLOW_NETWORK
    }

    @Deprecated
    public static void clearCache(String str, int i10) {
        mm mmVarD;
        m0 m0VarD0;
        nd ndVarM = nd.m();
        try {
            if (ndVarM.dd() == null || (mmVarD = mm.d(ndVarM.dd())) == null || (m0VarD0 = mmVarD.d0(str)) == null) {
                return;
            }
            d0 d0VarD = d0.d(ndVarM.dd(), str, String.valueOf(m0VarD0.dqm()));
            if (d0VarD != null) {
                d0VarD.d(i10);
            }
        } catch (Exception unused) {
        }
    }

    public static TUCustomContentResult customContentResultReviewByInfos(List<TUCustomContentInfo> list) {
        return mq.m(list);
    }

    public static TUCustomContentInfo customContentReviewResult(List<TUCustomContentInfo> list) {
        return mq.d(list);
    }

    public static boolean isDenyApi_getRunningAppProcesses() {
        return mDenyApi_getRunningAppProcesses;
    }

    public static Boolean isShakeEnabled(int i10) {
        SHAKE_TYPE shake_type = shakeControlType;
        if (shake_type == SHAKE_TYPE.ALLOW_ALL) {
            return Boolean.TRUE;
        }
        if (shake_type == SHAKE_TYPE.FORBID_ALL) {
            return Boolean.FALSE;
        }
        if (shake_type == SHAKE_TYPE.ALLOW_NETWORK) {
            return Boolean.valueOf(sensorNetworkList.contains(String.valueOf(i10)));
        }
        return null;
    }

    public static void needTraminiInfo(Context context, boolean z10) {
        com.thinkup.core.common.mq.d(context).d(z10);
    }

    public static void setAdMuted(Boolean bool) {
        isGlobalMute = bool;
    }

    public static void setDenyApi_getRunningAppProcesses(boolean z10) {
        mDenyApi_getRunningAppProcesses = z10;
    }

    public static void setEnableGetDeviceInfoInBg(boolean z10) {
        enableGetDeviceInfoInBg = z10;
    }

    public static void setHideNavAndStatusBar(boolean z10) {
        isHideNavAndStatusBar = z10;
    }

    public static void setShakeControl(SHAKE_TYPE shake_type, List<String> list) {
        try {
            if (shakeControlType != shake_type) {
                nd.m();
                nd.d(String.valueOf(shake_type.ordinal()), list != null ? list.toString() : new ArrayList().toString());
            }
            shakeControlType = shake_type;
            if (shake_type == SHAKE_TYPE.ALLOW_NETWORK && list != null && !list.isEmpty()) {
                List<String> list2 = sensorNetworkList;
                list2.clear();
                list2.addAll(list);
            }
            nd.m().d(isShakeEnabled(66));
        } catch (Throwable unused) {
        }
    }

    @Deprecated
    public static void clearCache(String str, List<TUAdInfo> list) {
        mm mmVarD;
        m0 m0VarD0;
        nd ndVarM = nd.m();
        try {
            if (ndVarM.dd() == null || (mmVarD = mm.d(ndVarM.dd())) == null || (m0VarD0 = mmVarD.d0(str)) == null) {
                return;
            }
            d0 d0VarD = d0.d(ndVarM.dd(), str, String.valueOf(m0VarD0.dqm()));
            if (d0VarD != null) {
                d0VarD.d(list);
            }
        } catch (Exception unused) {
        }
    }
}