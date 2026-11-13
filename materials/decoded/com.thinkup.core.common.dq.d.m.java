package com.thinkup.core.common.dq.d;

import android.app.Activity;
import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import com.thinkup.core.api.TUAdConst;
import com.thinkup.core.api.TUBidRequestInfoListener;
import com.thinkup.core.api.TUBiddingListener;
import com.thinkup.core.api.TUBiddingResult;
import com.thinkup.core.api.TUCommonImpressionListener;
import com.thinkup.core.api.TUCustomLoadListener;
import com.thinkup.core.api.bridge.ITUBaseAdAdapter;
import com.thinkup.core.api.bridge.TUBaseAdAdapter;
import com.thinkup.core.common.dm.m0;
import com.thinkup.core.common.dq.dd.n;
import com.thinkup.core.common.nn.mo;
import com.thinkup.core.common.nn.nm;
import java.util.Map;

/* JADX INFO: loaded from: classes7.dex */
public class m implements ITUBaseAdAdapter {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final String f68837d = "m";

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private static final String f68838m = "not support this format: %s";

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private ITUBaseAdAdapter f68839n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private Map<Integer, Class<? extends TUBaseAdAdapter>> f68840o;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private String f68841q;

    public m(ITUBaseAdAdapter iTUBaseAdAdapter) {
        this.f68839n = iTUBaseAdAdapter;
    }

    private ITUBaseAdAdapter d(Map<String, Object> map, Map<String, Object> map2) {
        ITUBaseAdAdapter iTUBaseAdAdapterD;
        Class<? extends TUBaseAdAdapter> cls;
        ITUBaseAdAdapter iTUBaseAdAdapter = this.f68839n;
        if (iTUBaseAdAdapter != null) {
            iTUBaseAdAdapter.parseGlobalParams(map, map2);
        }
        com.thinkup.core.common.dq.o.m serverExtraInfo = getServerExtraInfo();
        if (serverExtraInfo == null || !serverExtraInfo.dq()) {
            iTUBaseAdAdapterD = this.f68839n;
        } else {
            int iM = serverExtraInfo.m();
            if (this.f68840o == null) {
                this.f68840o = getFormatAdapterMap();
            }
            Map<Integer, Class<? extends TUBaseAdAdapter>> map3 = this.f68840o;
            if (map3 == null || map3.size() <= 0 || (cls = this.f68840o.get(Integer.valueOf(iM))) == null) {
                this.f68841q = String.format(f68838m, Integer.valueOf(iM));
            } else {
                try {
                    iTUBaseAdAdapterD = nm.d(cls.getName());
                } catch (Throwable th2) {
                    th2.getMessage();
                    this.f68841q = th2.getMessage();
                    iTUBaseAdAdapterD = null;
                }
            }
            iTUBaseAdAdapterD = null;
        }
        if (iTUBaseAdAdapterD != null && iTUBaseAdAdapterD != this.f68839n) {
            try {
                serverExtraInfo.d(iTUBaseAdAdapterD);
                if (serverExtraInfo.m0()) {
                    int iIntValue = ((Integer) mo.d(map, "nw_firm_id", 0)).intValue();
                    if (iIntValue == 39 && map2 != null) {
                        Object obj = map2.get("huawei_request_custom_dislike");
                        boolean zBooleanValue = obj instanceof Boolean ? ((Boolean) obj).booleanValue() : true;
                        map2.put("huawei_request_custom_dislike", Boolean.valueOf(zBooleanValue));
                        if (zBooleanValue && !map2.containsKey(TUAdConst.KEY.AD_CHOICES_PLACEMENT)) {
                            map2.put(TUAdConst.KEY.AD_CHOICES_PLACEMENT, 2);
                        }
                    }
                    if (!serverExtraInfo.dd() || map == null) {
                        if (serverExtraInfo.d0() && iIntValue == 2 && map2 != null && !map2.containsKey(TUAdConst.KEY.AD_CHOICES_PLACEMENT)) {
                            map2.put(TUAdConst.KEY.AD_CHOICES_PLACEMENT, 2);
                        }
                    } else if (iIntValue != 2) {
                        if (iIntValue != 6) {
                            if (iIntValue != 8) {
                                if (iIntValue == 28 && !map.containsKey("video_sound")) {
                                    map.put("video_sound", 0);
                                }
                            } else if (!map.containsKey("video_muted")) {
                                map.put("video_muted", "1");
                            }
                        } else if (!map.containsKey("video_muted")) {
                            map.put("video_muted", "0");
                        }
                    } else if (map2 != null && !map2.containsKey(TUAdConst.KEY.AD_CHOICES_PLACEMENT)) {
                        map2.put(TUAdConst.KEY.AD_CHOICES_PLACEMENT, 0);
                    }
                }
                iTUBaseAdAdapterD.parseGlobalParams(map, map2);
                iTUBaseAdAdapterD.setTrackingInfo(this.f68839n.getTrackingInfo());
            } catch (Throwable unused) {
            }
        }
        return iTUBaseAdAdapterD;
    }

    @Override // com.thinkup.core.api.bridge.ITUBaseAdAdapter
    public int baseOnAdapterBridgeVersion() {
        ITUBaseAdAdapter iTUBaseAdAdapter = this.f68839n;
        if (iTUBaseAdAdapter != null) {
            return iTUBaseAdAdapter.baseOnAdapterBridgeVersion();
        }
        return 1;
    }

    @Override // com.thinkup.core.api.bridge.ITUBaseAdAdapter
    public String closeAd() {
        ITUBaseAdAdapter iTUBaseAdAdapter = this.f68839n;
        return iTUBaseAdAdapter != null ? iTUBaseAdAdapter.closeAd() : "";
    }

    @Override // com.thinkup.core.api.bridge.ITUBaseAdAdapter
    public void destory() {
        ITUBaseAdAdapter iTUBaseAdAdapter = this.f68839n;
        if (iTUBaseAdAdapter != null) {
            iTUBaseAdAdapter.destory();
        }
    }

    @Override // com.thinkup.core.api.bridge.ITUBaseAdAdapter
    public void getBidRequestInfo(Context context, Map<String, Object> map, Map<String, Object> map2, TUBidRequestInfoListener tUBidRequestInfoListener) {
        if (this.f68839n != null) {
            this.f68839n = d(map, map2);
            if (!d()) {
                this.f68839n.getBidRequestInfo(context, map, map2, tUBidRequestInfoListener);
            } else if (tUBidRequestInfoListener != null) {
                tUBidRequestInfoListener.onFailed(this.f68841q);
            }
        }
    }

    @Override // com.thinkup.core.api.bridge.ITUBaseAdAdapter
    public Map<Integer, Class<? extends TUBaseAdAdapter>> getFormatAdapterMap() {
        ITUBaseAdAdapter iTUBaseAdAdapter = this.f68839n;
        if (iTUBaseAdAdapter != null) {
            return iTUBaseAdAdapter.getFormatAdapterMap();
        }
        return null;
    }

    @Override // com.thinkup.core.api.bridge.ITUBaseAdAdapter
    public View getMixView() {
        ITUBaseAdAdapter iTUBaseAdAdapter = this.f68839n;
        if (iTUBaseAdAdapter != null) {
            return iTUBaseAdAdapter.getMixView();
        }
        return null;
    }

    @Override // com.thinkup.core.api.bridge.ITUBaseAdAdapter
    public Map<String, Object> getNetworkInfoMap() {
        com.thinkup.core.common.dq.o.m serverExtraInfo = getServerExtraInfo();
        if (serverExtraInfo != null && serverExtraInfo.mq() != null) {
            return serverExtraInfo.mq();
        }
        ITUBaseAdAdapter iTUBaseAdAdapter = this.f68839n;
        if (iTUBaseAdAdapter != null) {
            return iTUBaseAdAdapter.getNetworkInfoMap();
        }
        return null;
    }

    @Override // com.thinkup.core.api.bridge.ITUBaseAdAdapter
    public String getNetworkName() {
        ITUBaseAdAdapter iTUBaseAdAdapter = this.f68839n;
        return iTUBaseAdAdapter != null ? iTUBaseAdAdapter.getNetworkName() : "";
    }

    @Override // com.thinkup.core.api.bridge.ITUBaseAdAdapter
    public String getNetworkPlacementId() {
        ITUBaseAdAdapter iTUBaseAdAdapter = this.f68839n;
        return iTUBaseAdAdapter != null ? iTUBaseAdAdapter.getNetworkPlacementId() : "";
    }

    @Override // com.thinkup.core.api.bridge.ITUBaseAdAdapter
    public String getNetworkSDKVersion() {
        ITUBaseAdAdapter iTUBaseAdAdapter = this.f68839n;
        return iTUBaseAdAdapter != null ? iTUBaseAdAdapter.getNetworkSDKVersion() : "";
    }

    @Override // com.thinkup.core.api.bridge.ITUBaseAdAdapter
    public com.thinkup.core.common.dq.o.m getServerExtraInfo() {
        ITUBaseAdAdapter iTUBaseAdAdapter = this.f68839n;
        if (iTUBaseAdAdapter != null) {
            return iTUBaseAdAdapter.getServerExtraInfo();
        }
        return null;
    }

    @Override // com.thinkup.core.api.bridge.ITUBaseAdAdapter
    public m0 getTrackingInfo() {
        ITUBaseAdAdapter iTUBaseAdAdapter = this.f68839n;
        if (iTUBaseAdAdapter != null) {
            return iTUBaseAdAdapter.getTrackingInfo();
        }
        return null;
    }

    @Override // com.thinkup.core.api.bridge.ITUBaseAdAdapter
    public boolean initNetworkObjectByPlacementId(Context context, Map<String, Object> map, Map<String, Object> map2) {
        if (this.f68839n != null) {
            ITUBaseAdAdapter iTUBaseAdAdapterD = d(map, map2);
            this.f68839n = iTUBaseAdAdapterD;
            if (iTUBaseAdAdapterD != null && iTUBaseAdAdapterD.initNetworkObjectByPlacementId(context, map, map2)) {
                return true;
            }
        }
        return false;
    }

    @Override // com.thinkup.core.api.bridge.ITUBaseAdAdapter
    public void internalFormatShow(Activity activity, ViewGroup viewGroup, TUCommonImpressionListener tUCommonImpressionListener) {
        ITUBaseAdAdapter iTUBaseAdAdapter = this.f68839n;
        if (iTUBaseAdAdapter != null) {
            iTUBaseAdAdapter.internalFormatShow(activity, viewGroup, tUCommonImpressionListener);
        }
    }

    @Override // com.thinkup.core.api.bridge.ITUBaseAdAdapter
    public boolean isAdReady() {
        ITUBaseAdAdapter iTUBaseAdAdapter = this.f68839n;
        return iTUBaseAdAdapter != null && iTUBaseAdAdapter.isAdReady();
    }

    @Override // com.thinkup.core.api.bridge.ITUBaseAdAdapter
    public void loadCustomNetworkAd(Context context, Map<String, Object> map, Map<String, Object> map2, TUCustomLoadListener tUCustomLoadListener) {
        if (this.f68839n != null) {
            this.f68839n = d(map, map2);
            if (d()) {
                if (tUCustomLoadListener != null) {
                    tUCustomLoadListener.onAdLoadError("", this.f68841q);
                    return;
                }
                return;
            }
            ITUBaseAdAdapter iTUBaseAdAdapter = this.f68839n;
            if (iTUBaseAdAdapter == null || tUCustomLoadListener == null) {
                tUCustomLoadListener = null;
            } else {
                com.thinkup.core.common.dq.o.m serverExtraInfo = iTUBaseAdAdapter.getServerExtraInfo();
                if (serverExtraInfo != null && serverExtraInfo.dq()) {
                    tUCustomLoadListener = new n(tUCustomLoadListener, serverExtraInfo);
                }
            }
            iTUBaseAdAdapter.setLoadListener(tUCustomLoadListener);
            this.f68839n.loadCustomNetworkAd(context, map, map2);
        }
    }

    @Override // com.thinkup.core.api.bridge.ITUBaseAdAdapter
    public void parseGlobalParams(Map<String, Object> map, Map<String, Object> map2) {
        ITUBaseAdAdapter iTUBaseAdAdapter = this.f68839n;
        if (iTUBaseAdAdapter != null) {
            iTUBaseAdAdapter.parseGlobalParams(map, map2);
        }
    }

    @Override // com.thinkup.core.api.bridge.ITUBaseAdAdapter
    public void setBiddingListener(TUBiddingListener tUBiddingListener) {
        ITUBaseAdAdapter iTUBaseAdAdapter = this.f68839n;
        if (iTUBaseAdAdapter != null) {
            iTUBaseAdAdapter.setBiddingListener(tUBiddingListener);
        }
    }

    @Override // com.thinkup.core.api.bridge.ITUBaseAdAdapter
    public void setLoadListener(TUCustomLoadListener tUCustomLoadListener) {
        ITUBaseAdAdapter iTUBaseAdAdapter = this.f68839n;
        if (iTUBaseAdAdapter != null) {
            iTUBaseAdAdapter.setLoadListener(tUCustomLoadListener);
        }
    }

    @Override // com.thinkup.core.api.bridge.ITUBaseAdAdapter
    public void setTrackingInfo(m0 m0Var) {
        ITUBaseAdAdapter iTUBaseAdAdapter = this.f68839n;
        if (iTUBaseAdAdapter == null || iTUBaseAdAdapter.getTrackingInfo() != null || m0Var == null) {
            return;
        }
        this.f68839n.setTrackingInfo(m0Var);
    }

    @Override // com.thinkup.core.api.bridge.ITUBaseAdAdapter
    public boolean setUserDataConsent(Context context, boolean z10, boolean z11) {
        ITUBaseAdAdapter iTUBaseAdAdapter = this.f68839n;
        if (iTUBaseAdAdapter == null) {
            return false;
        }
        iTUBaseAdAdapter.setUserDataConsent(context, z10, z11);
        return false;
    }

    @Override // com.thinkup.core.api.bridge.ITUBaseAdAdapter
    public boolean startBiddingRequest(Context context, Map<String, Object> map, Map<String, Object> map2, TUBiddingListener tUBiddingListener) {
        if (this.f68839n == null) {
            return false;
        }
        this.f68839n = d(map, map2);
        if (d()) {
            if (tUBiddingListener != null) {
                tUBiddingListener.onC2SBiddingResultWithCache(TUBiddingResult.fail(this.f68841q), null);
            }
            return false;
        }
        ITUBaseAdAdapter iTUBaseAdAdapter = this.f68839n;
        if (iTUBaseAdAdapter == null || tUBiddingListener == null) {
            tUBiddingListener = null;
        } else {
            com.thinkup.core.common.dq.o.m serverExtraInfo = iTUBaseAdAdapter.getServerExtraInfo();
            if (serverExtraInfo != null && serverExtraInfo.dq()) {
                tUBiddingListener = new com.thinkup.core.common.dq.dd.m(tUBiddingListener, serverExtraInfo);
            }
        }
        this.f68839n.setBiddingListener(tUBiddingListener);
        return this.f68839n.startBiddingRequest(context, map, map2, tUBiddingListener);
    }

    @Override // com.thinkup.core.api.bridge.ITUBaseAdAdapter
    public boolean supportImpressionCallback() {
        ITUBaseAdAdapter iTUBaseAdAdapter = this.f68839n;
        return iTUBaseAdAdapter == null || iTUBaseAdAdapter.supportImpressionCallback();
    }

    @Override // com.thinkup.core.api.bridge.ITUBaseAdAdapter
    public void loadCustomNetworkAd(Context context, Map<String, Object> map, Map<String, Object> map2) {
    }

    private boolean d() {
        return !TextUtils.isEmpty(this.f68841q) || this.f68839n == null;
    }

    private static void d(com.thinkup.core.common.dq.o.m mVar, Map<String, Object> map, Map<String, Object> map2) {
        if (mVar.m0()) {
            int iIntValue = ((Integer) mo.d(map, "nw_firm_id", 0)).intValue();
            if (iIntValue == 39 && map2 != null) {
                Object obj = map2.get("huawei_request_custom_dislike");
                boolean zBooleanValue = obj instanceof Boolean ? ((Boolean) obj).booleanValue() : true;
                map2.put("huawei_request_custom_dislike", Boolean.valueOf(zBooleanValue));
                if (zBooleanValue && !map2.containsKey(TUAdConst.KEY.AD_CHOICES_PLACEMENT)) {
                    map2.put(TUAdConst.KEY.AD_CHOICES_PLACEMENT, 2);
                }
            }
            if (!mVar.dd() || map == null) {
                if (!mVar.d0() || iIntValue != 2 || map2 == null || map2.containsKey(TUAdConst.KEY.AD_CHOICES_PLACEMENT)) {
                    return;
                }
                map2.put(TUAdConst.KEY.AD_CHOICES_PLACEMENT, 2);
                return;
            }
            if (iIntValue == 2) {
                if (map2 == null || map2.containsKey(TUAdConst.KEY.AD_CHOICES_PLACEMENT)) {
                    return;
                }
                map2.put(TUAdConst.KEY.AD_CHOICES_PLACEMENT, 0);
                return;
            }
            if (iIntValue == 6) {
                if (map.containsKey("video_muted")) {
                    return;
                }
                map.put("video_muted", "0");
            } else {
                if (iIntValue != 8) {
                    if (iIntValue == 28 && !map.containsKey("video_sound")) {
                        map.put("video_sound", 0);
                        return;
                    }
                    return;
                }
                if (map.containsKey("video_muted")) {
                    return;
                }
                map.put("video_muted", "1");
            }
        }
    }
}