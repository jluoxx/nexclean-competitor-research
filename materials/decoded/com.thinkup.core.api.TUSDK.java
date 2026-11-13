package com.thinkup.core.api;

import android.app.Activity;
import android.content.Context;
import android.location.Location;
import com.thinkup.core.common.dd.m;
import com.thinkup.core.common.dn.n;
import com.thinkup.core.common.m0.dm;
import com.thinkup.core.common.nn.mn;
import com.thinkup.core.common.o.nd;
import com.thinkup.core.common.o.nn;
import java.util.List;
import java.util.Map;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes7.dex */
public class TUSDK {
    private static boolean HAS_INIT = false;
    public static final int NONPERSONALIZED = 1;
    public static final int PERSONALIZED = 0;
    public static final int UNKNOWN = 2;

    private TUSDK() {
    }

    public static void addCustomAdapterConfig(String str, TUCustomAdapterConfig tUCustomAdapterConfig) {
        nd.m().d(str, tUCustomAdapterConfig);
    }

    public static void checkIsEuTraffic(Context context, NetTrafficeCallback netTrafficeCallback) {
        nn.d(context).d(netTrafficeCallback, "");
    }

    public static void deniedUploadDeviceInfo(String... strArr) {
        nd.m().d(strArr);
    }

    public static void getArea(final TUAreaCallback tUAreaCallback) {
        if (tUAreaCallback == null) {
            return;
        }
        new dm().d(0, new com.thinkup.core.common.m0.nd() { // from class: com.thinkup.core.api.TUSDK.1
            @Override // com.thinkup.core.common.m0.nd
            public final void onLoadCanceled(int i10) {
                tUAreaCallback.onErrorCallback("Request cancel");
            }

            @Override // com.thinkup.core.common.m0.nd
            public final void onLoadError(int i10, String str, AdError adError) {
                tUAreaCallback.onErrorCallback(adError.printStackTrace());
            }

            @Override // com.thinkup.core.common.m0.nd
            public final void onLoadFinish(int i10, Object obj) {
                try {
                    if (!(obj instanceof JSONObject)) {
                        tUAreaCallback.onErrorCallback("There is no result.");
                        return;
                    }
                    JSONObject jSONObject = (JSONObject) obj;
                    if (!jSONObject.has("area")) {
                        tUAreaCallback.onErrorCallback("There is no result.");
                    } else {
                        tUAreaCallback.onResultCallback(jSONObject.optString("area"));
                    }
                } catch (Throwable unused) {
                    tUAreaCallback.onErrorCallback("Internal error");
                }
            }

            @Override // com.thinkup.core.common.m0.nd
            public final void onLoadStart(int i10) {
            }
        });
    }

    public static int getGDPRDataLevel(Context context) {
        return nn.d(context).d();
    }

    public static int getPersionalizedAdStatus() {
        return nd.m().q();
    }

    public static int getRequireAdapterBridgeVersion() {
        return 1;
    }

    public static String getSDKVersionName() {
        return mn.d();
    }

    @Deprecated
    public static void init(Context context, String str, String str2, TUNetworkConfig tUNetworkConfig, TUSDKInitListener tUSDKInitListener) {
        try {
            if (context == null) {
                if (tUSDKInitListener != null) {
                    tUSDKInitListener.onFail("init: Context is null!");
                }
            } else {
                nd.m().d(context, str, str2, tUNetworkConfig);
                if (tUSDKInitListener != null) {
                    tUSDKInitListener.onSuccess();
                }
            }
        } catch (Error | Exception unused) {
        }
    }

    public static void initCustomMap(Map<String, Object> map) {
        nd.m().d(map);
    }

    public static void initPlacementCustomMap(String str, Map<String, Object> map) {
        nd.m().d(str, map);
    }

    public static void integrationChecking(Context context) {
        nd.m().m(context);
    }

    public static boolean isCnSDK() {
        nd.m();
        return false;
    }

    public static boolean isEUTraffic(Context context) {
        return nn.d(context).o();
    }

    public static boolean isNetworkLogDebug() {
        return nd.m().qm();
    }

    public static void putFilter(String str, TUAdFilter tUAdFilter) {
        nd.m().d(str, tUAdFilter);
    }

    public static void registerDeviceRiskListener(ITUDeviceRiskListener iTUDeviceRiskListener) {
        nd.m().d(iTUDeviceRiskListener);
    }

    public static void removeFilterWithPlacementId(String str) {
        nd.m().nm(str);
    }

    public static void removeFilters() {
        nd.m().dmq();
    }

    public static void setAdLogoVisible(boolean z10) {
        nd.m().n(z10);
    }

    public static void setAllowedShowNetworkFirmIdList(String str, List<String> list) {
        nd.m().n(str, list);
    }

    public static void setBundleName(String str) {
        nd.m().nd(str);
    }

    public static void setChannel(String str) {
        if (mn.d(str)) {
            nd.m().q(str);
        }
    }

    public static void setChannelSource(int i10) {
        nd.m().o(i10);
    }

    public static void setDebuggerConfig(Context context, String str, TUDebuggerConfig tUDebuggerConfig) {
        nd.m().d(context, str, tUDebuggerConfig);
    }

    public static void setDeviceInformationData(Map<String, Object> map) {
        nd.m().n(map);
    }

    public static void setExcludePackageList(List<String> list) {
        nd.m().d(list);
    }

    public static void setFilterAdSourceIdList(String str, List<String> list) {
        nd.m().d(str, list);
    }

    public static void setFilterNetworkFirmIdList(String str, List<String> list) {
        nd.m().m(str, list);
    }

    public static void setForbidNetworkFirmIdList(List<String> list) {
        nd.m().m(list);
    }

    public static void setForbidShowNetworkFirmIdList(String str, List<String> list) {
        nd.m().o(str, list);
    }

    public static void setGDPRUploadDataLevel(Context context, int i10) {
        if (context == null) {
            return;
        }
        if (i10 == 0 || i10 == 1) {
            nn.d(context).d(i10);
        }
    }

    public static void setInitType(int i10) {
        nd.m().m(i10);
    }

    public static void setLocalStrategyAssetPath(Context context, String str) {
        nd.m();
        nd.d(context, str);
    }

    public static void setLocation(Location location) {
        nd.m().d(location);
    }

    public static void setNetworkLogDebug(boolean z10) {
        nd.m().m(z10);
    }

    public static void setPersonalizedAdStatus(int i10) {
        nd.m().d(i10);
    }

    public static void setRiskFilterNetworkFirmIdList(int i10, List<String> list) {
        nd.m().d(i10, list);
    }

    public static void setSharedPlacementConfig(TUSharedPlacementConfig tUSharedPlacementConfig) {
        nd.m();
        nd.d(tUSharedPlacementConfig);
    }

    public static void setSubChannel(String str) {
        if (mn.m(str)) {
            nd.m().d0(str);
        }
    }

    public static void setSupportDomainCountry(String... strArr) {
        m.f67830d = strArr;
    }

    public static void setSystemDevFragmentType(String str) {
        nd.m().n0(str);
    }

    public static void setTUAdFilter(String[] strArr, ITUAdFilter iTUAdFilter) {
        nd.m().d(strArr, iTUAdFilter);
    }

    public static void setTUUserDeviceInfo(TUUserDeviceInfo tUUserDeviceInfo) {
        nd.m().d(tUUserDeviceInfo);
    }

    public static void setUseHTTP(boolean z10) {
        nd.m().o(z10);
    }

    public static void setWXAppId(String str) {
        nd.m().d(str);
    }

    public static void setWXStatus(boolean z10) {
        nd.m().d(z10);
    }

    public static void showGDPRConsentDialog(Activity activity, TUGDPRConsentDismissListener tUGDPRConsentDismissListener) {
        n.d().m(activity, tUGDPRConsentDismissListener, "");
    }

    public static void showGDPRConsentSecondDialog(Activity activity, TUGDPRConsentDismissListener tUGDPRConsentDismissListener, String str) {
        n.d().d(activity, tUGDPRConsentDismissListener, str);
    }

    @Deprecated
    public static void showGdprAuth(Context context) {
        nn.d(context).d(context, (TUGDPRAuthCallback) null);
    }

    public static void start() {
        nd.m().ddq();
    }

    public static void testModeDeviceInfo(Context context, DeviceInfoCallback deviceInfoCallback) {
        nd.m().d(context, deviceInfoCallback);
    }

    @Deprecated
    public static void showGdprAuth(Context context, TUGDPRAuthCallback tUGDPRAuthCallback) {
        nn.d(context).d(context, tUGDPRAuthCallback);
    }

    public static void checkIsEuTraffic(Context context, NetTrafficeCallback netTrafficeCallback, String str) {
        nn.d(context).d(netTrafficeCallback, str);
    }

    public static void showGDPRConsentDialog(Activity activity, TUGDPRConsentDismissListener tUGDPRConsentDismissListener, String str) {
        n.d().m(activity, tUGDPRConsentDismissListener, str);
    }

    public static void init(Context context, String str, String str2, TUNetworkConfig tUNetworkConfig) {
        init(context, str, str2, tUNetworkConfig, null);
    }

    public static void init(Context context, String str, String str2) {
        init(context, str, str2, null);
    }
}