package com.reyun.solar.engine;

import android.app.Activity;
import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import android.view.View;
import android.webkit.WebView;
import com.google.ads.mediation.vungle.VungleConstants;
import com.mbridge.msdk.MBridgeConstans;
import com.reyun.solar.engine.autotrack.AutoTrackManager;
import com.reyun.solar.engine.core.AdDurationManager;
import com.reyun.solar.engine.core.SolarEngine;
import com.reyun.solar.engine.core.SolarEngineEventFactory;
import com.reyun.solar.engine.core.TimerEventManager;
import com.reyun.solar.engine.h5bridge.NativeInteractiveH5Util;
import com.reyun.solar.engine.infos.PartnerEventParamsConstants;
import com.reyun.solar.engine.infos.PresetEventType;
import com.reyun.solar.engine.infos.SEAdClickEventModel;
import com.reyun.solar.engine.infos.SEAdImpEventModel;
import com.reyun.solar.engine.infos.SEAppAchieveLevelModel;
import com.reyun.solar.engine.infos.SEAppAdButtonClickModel;
import com.reyun.solar.engine.infos.SEAppAdShowEndModel;
import com.reyun.solar.engine.infos.SEAppAdShowStartModel;
import com.reyun.solar.engine.infos.SEAppClickModel;
import com.reyun.solar.engine.infos.SEAppCostCoinsModel;
import com.reyun.solar.engine.infos.SEAppEndPlayModel;
import com.reyun.solar.engine.infos.SEAppGameInitInfoModel;
import com.reyun.solar.engine.infos.SEAppGetCoinsModel;
import com.reyun.solar.engine.infos.SEAppReEngagementModel;
import com.reyun.solar.engine.infos.SEAppStartPlayModel;
import com.reyun.solar.engine.infos.SEAppUpdateLevelModel;
import com.reyun.solar.engine.infos.SEAttrEventModel;
import com.reyun.solar.engine.infos.SEBaseFirstEventModel;
import com.reyun.solar.engine.infos.SECustomEventModel;
import com.reyun.solar.engine.infos.SELoginEventModel;
import com.reyun.solar.engine.infos.SEOrderEventModel;
import com.reyun.solar.engine.infos.SEPurchaseEventModel;
import com.reyun.solar.engine.infos.SERegisterEventModel;
import com.reyun.solar.engine.infos.SEViewScreenModel;
import com.reyun.solar.engine.partner.Result;
import com.reyun.solar.engine.partner.SolarEnginePartnerManager;
import com.reyun.solar.engine.partner.StrategyBuilder;
import com.reyun.solar.engine.tracker.EventType;
import com.reyun.solar.engine.tracker.SEUserDeleteType;
import com.reyun.solar.engine.tracker.TrackEvent;
import com.reyun.solar.engine.utils.Command;
import com.reyun.solar.engine.utils.ExecutorManager;
import com.reyun.solar.engine.utils.OpenApiLogger;
import com.reyun.solar.engine.utils.SolarEngineLogger;
import com.reyun.solar.engine.utils.SolarEngineUtils;
import java.util.List;
import java.util.Objects;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes7.dex */
public final class SolarEngineManager {
    private static final String TAG = "SolarEngine";

    public static final class ClassHolder {
        private static final SolarEngineManager SOLAR_ENGINE_MANAGER = new SolarEngineManager();

        private ClassHolder() {
        }
    }

    private SolarEngineManager() {
    }

    public static /* synthetic */ void Q(SolarEngineManager solarEngineManager, final SEAppCostCoinsModel sEAppCostCoinsModel) {
        solarEngineManager.getClass();
        solarEngineManager.track(new Runnable() { // from class: com.reyun.solar.engine.g0
            @Override // java.lang.Runnable
            public final void run() {
                SolarEngine.getInstance().getTrackManager().trackEvent(SolarEngineEventFactory.createSolarEngineEventAppCostCoins(sEAppCostCoinsModel));
            }
        });
    }

    public static /* synthetic */ void R(SolarEngineManager solarEngineManager, final SEAppUpdateLevelModel sEAppUpdateLevelModel) {
        solarEngineManager.getClass();
        solarEngineManager.track(new Runnable() { // from class: com.reyun.solar.engine.p1
            @Override // java.lang.Runnable
            public final void run() {
                SolarEngine.getInstance().getTrackManager().trackEvent(SolarEngineEventFactory.createSolarEngineEventAppUpdateLevel(sEAppUpdateLevelModel));
            }
        });
    }

    public static /* synthetic */ void T(SolarEngineManager solarEngineManager, final SEAppAdShowStartModel sEAppAdShowStartModel) {
        solarEngineManager.getClass();
        solarEngineManager.track(new Runnable() { // from class: com.reyun.solar.engine.e1
            @Override // java.lang.Runnable
            public final void run() {
                SolarEngine.getInstance().getTrackManager().trackEvent(SolarEngineEventFactory.createSolarEngineEventAppAdShowStart(sEAppAdShowStartModel));
            }
        });
    }

    private void _initialize(Context context, String str, String str2, SolarEngineConfig solarEngineConfig, OnInitializationCallback onInitializationCallback) {
        SolarEngine solarEngine = SolarEngine.getInstance();
        if (solarEngineConfig == null) {
            solarEngineConfig = new SolarEngineConfig.Builder().build();
        }
        solarEngine.init(context, str, solarEngineConfig, onInitializationCallback);
    }

    public static /* synthetic */ void b(SolarEngineManager solarEngineManager, final SEAppEndPlayModel sEAppEndPlayModel) {
        solarEngineManager.getClass();
        solarEngineManager.track(new Runnable() { // from class: com.reyun.solar.engine.d0
            @Override // java.lang.Runnable
            public final void run() {
                SolarEngine.getInstance().getTrackManager().trackEvent(SolarEngineEventFactory.createSolarEngineEventAppEndPlay(sEAppEndPlayModel));
            }
        });
    }

    public static /* synthetic */ void c0(SolarEngineManager solarEngineManager, final SEAppAdButtonClickModel sEAppAdButtonClickModel) {
        solarEngineManager.getClass();
        solarEngineManager.track(new Runnable() { // from class: com.reyun.solar.engine.a1
            @Override // java.lang.Runnable
            public final void run() {
                SolarEngine.getInstance().getTrackManager().trackEvent(SolarEngineEventFactory.createSolarEngineEventAppAdButtonClick(sEAppAdButtonClickModel));
            }
        });
    }

    public static /* synthetic */ void f0(SolarEngineManager solarEngineManager, final SEAppGameInitInfoModel sEAppGameInitInfoModel) {
        solarEngineManager.getClass();
        solarEngineManager.track(new Runnable() { // from class: com.reyun.solar.engine.d1
            @Override // java.lang.Runnable
            public final void run() {
                SolarEngine.getInstance().getTrackManager().trackEvent(SolarEngineEventFactory.createSolarEngineEventAppGameInitInfo(sEAppGameInitInfoModel));
            }
        });
    }

    public static SolarEngineManager getInstance() {
        return ClassHolder.SOLAR_ENGINE_MANAGER;
    }

    public static /* synthetic */ void k(SolarEngineManager solarEngineManager, final SEAppAdShowEndModel sEAppAdShowEndModel) {
        solarEngineManager.getClass();
        solarEngineManager.track(new Runnable() { // from class: com.reyun.solar.engine.o1
            @Override // java.lang.Runnable
            public final void run() {
                SolarEngine.getInstance().getTrackManager().trackEvent(SolarEngineEventFactory.createSolarEngineEventAppAdShowEnd(sEAppAdShowEndModel));
            }
        });
    }

    public static /* synthetic */ void o(SolarEngineManager solarEngineManager, final SEAppGetCoinsModel sEAppGetCoinsModel) {
        solarEngineManager.getClass();
        solarEngineManager.track(new Runnable() { // from class: com.reyun.solar.engine.b
            @Override // java.lang.Runnable
            public final void run() {
                SolarEngine.getInstance().getTrackManager().trackEvent(SolarEngineEventFactory.createSolarEngineEventAppGetCoins(sEAppGetCoinsModel));
            }
        });
    }

    public static /* synthetic */ void r(SolarEngineManager solarEngineManager, final SEAppAchieveLevelModel sEAppAchieveLevelModel) {
        solarEngineManager.getClass();
        solarEngineManager.track(new Runnable() { // from class: com.reyun.solar.engine.h1
            @Override // java.lang.Runnable
            public final void run() {
                SolarEngine.getInstance().getTrackManager().trackEvent(SolarEngineEventFactory.createSolarEngineEventAppAchieveLevel(sEAppAchieveLevelModel));
            }
        });
    }

    public static /* synthetic */ void s(SolarEngineManager solarEngineManager, final SEAppStartPlayModel sEAppStartPlayModel) {
        solarEngineManager.getClass();
        solarEngineManager.track(new Runnable() { // from class: com.reyun.solar.engine.o0
            @Override // java.lang.Runnable
            public final void run() {
                SolarEngine.getInstance().getTrackManager().trackEvent(SolarEngineEventFactory.createSolarEngineEventAppStartPlay(sEAppStartPlayModel));
            }
        });
    }

    private void user(Runnable runnable) {
        if (SolarEngine.getInstance().isInitSuccess()) {
            ExecutorManager.executeTrackEvent(runnable);
        } else {
            SolarEngine.getInstance().addWaitingTask(runnable);
        }
    }

    public void appDeeplinkOpenURI(final Uri uri) {
        OpenApiLogger.apiInvokedLog("SolarEngine", "appDeeplinkOpenURI", new OpenApiLogger.ParamBuilder().add("uri", uri));
        Runnable runnable = new Runnable() { // from class: com.reyun.solar.engine.b0
            @Override // java.lang.Runnable
            public final void run() {
                SolarEngine.getInstance().analysisUri(uri);
            }
        };
        if (SolarEngine.getInstance().isInitSuccess()) {
            ExecutorManager.executorCommon(runnable);
        } else if (SolarEngine.getInstance().isDataReportDisabled()) {
            runnable.run();
        } else {
            SolarEngine.getInstance().addWaitingTask(runnable);
        }
    }

    public void clearSuperProperties(Context context) {
        OpenApiLogger.apiInvokedLog("SolarEngine", "clearSuperProperties");
        if (SolarEngine.getInstance().isSharedPreferenceSuccess()) {
            SolarEngine.getInstance().getSuperProperty().clearSuperProperties();
        } else {
            SolarEngine.getInstance().addSharedPreferenceWaitingTask(new Runnable() { // from class: com.reyun.solar.engine.i1
                @Override // java.lang.Runnable
                public final void run() {
                    SolarEngine.getInstance().getSuperProperty().clearSuperProperties();
                }
            });
        }
    }

    public TrackEvent createTimerEvent(String str, JSONObject jSONObject) {
        OpenApiLogger.apiInvokedLog("SolarEngine", "createTimerEvent", new OpenApiLogger.ParamBuilder().add("eventName", str).add("eventData", jSONObject));
        if (TextUtils.isEmpty(str)) {
            SolarEngineLogger.warn("SolarEngine", "eventName is null, [createTimerEvent] event will not be tracked.");
            return null;
        }
        eventStart(str);
        return new TrackEvent(EventType.TRACK_EVENT_TYPE_TIMER_EVENT, str, null, null, jSONObject);
    }

    public void disableAutoTrack() {
        OpenApiLogger.apiInvokedLog("SolarEngine", "disableAutoTrack");
        AutoTrackManager.getInstance().disableAutoTrack();
    }

    public void disableAutoTrackApViewScreen() {
        OpenApiLogger.apiInvokedLog("SolarEngine", "disableAutoTrackApViewScreen");
        AutoTrackManager.getInstance().disableAutoTrackApViewScreen();
    }

    public void disableAutoTrackAppClick() {
        OpenApiLogger.apiInvokedLog("SolarEngine", "disableAutoTrackAppClick");
        AutoTrackManager.getInstance().disableAutoTrackAppClick();
    }

    public void enableAutoTrack() {
        OpenApiLogger.apiInvokedLog("SolarEngine", "enableAutoTrack");
        AutoTrackManager.getInstance().enableAutoTrack();
    }

    public void enableAutoTrackApViewScreen() {
        OpenApiLogger.apiInvokedLog("SolarEngine", "enableAutoTrackApViewScreen");
        AutoTrackManager.getInstance().enableAutoTrackApViewScreen();
    }

    public void enableAutoTrackAppClick() {
        OpenApiLogger.apiInvokedLog("SolarEngine", "enableAutoTrackAppClick");
        AutoTrackManager.getInstance().enableAutoTrackAppClick();
    }

    public void eventFinish(String str, JSONObject jSONObject, String str2) {
        OpenApiLogger.apiInvokedLog("SolarEngine", "eventFinish", new OpenApiLogger.ParamBuilder().add("eventName", str).add("customProperties", jSONObject).add("customEventAlias", str2));
        if (TextUtils.isEmpty(str)) {
            SolarEngineLogger.warn("SolarEngine", "eventName is null, [eventFinish] event will not be tracked.");
            return;
        }
        final TrackEvent trackEvent = new TrackEvent(EventType.TRACK_EVENT_TYPE_TIMER_EVENT, str, null, null, jSONObject);
        trackEvent.setCustomEventAlias(str2);
        trackEvent.setDuration(TimerEventManager.getDuration(str));
        track(new Runnable() { // from class: com.reyun.solar.engine.d
            @Override // java.lang.Runnable
            public final void run() {
                SolarEngine.getInstance().getTrackManager().trackEvent(SolarEngineEventFactory.createSolarEngineTimerEvent(trackEvent));
            }
        });
    }

    public void eventStart(final String str) {
        OpenApiLogger.apiInvokedLog("SolarEngine", "eventStart", new OpenApiLogger.ParamBuilder().add("eventName", str));
        if (TextUtils.isEmpty(str)) {
            SolarEngineLogger.warn("SolarEngine", "eventName is null, [eventStart] event will not be tracked.");
        } else if (SolarEngine.getInstance().isInitSuccess()) {
            TimerEventManager.addEventStart(str);
        } else {
            SolarEngine.getInstance().addWaitingTask(new Runnable() { // from class: com.reyun.solar.engine.a0
                @Override // java.lang.Runnable
                public final void run() {
                    TimerEventManager.addEventStart(str);
                }
            });
        }
    }

    public String getAccountID() {
        OpenApiLogger.apiInvokedLog("SolarEngine", "getAccountID");
        return SolarEngine.getInstance().isSharedPreferenceSuccess() ? SolarEngine.getInstance().getAccountID() : "";
    }

    public JSONObject getAttribution() {
        OpenApiLogger.apiInvokedLog("SolarEngine", "getAttribution");
        return SolarEngine.getInstance().getAttributionManager().getAttributionData();
    }

    public String getDistinctId() {
        OpenApiLogger.apiInvokedLog("SolarEngine", "getDistinctId");
        return SolarEngine.getInstance().getDistinctIDManager().getDistinctID();
    }

    public JSONObject getPresetProperties() {
        OpenApiLogger.apiInvokedLog("SolarEngine", "getPresetProperties");
        return SolarEngine.getInstance().getPresetProperties();
    }

    public JSONObject getREAttributionData() {
        OpenApiLogger.apiInvokedLog("SolarEngine", "getREAttributionData");
        return SolarEngine.getInstance().getREAttributionManager().getREAttributionData();
    }

    public JSONObject getUAAttributionData() {
        OpenApiLogger.apiInvokedLog("SolarEngine", "getUAAttributionData");
        return SolarEngine.getInstance().getUAAttributionManager().getUAAttributionData();
    }

    public String getVisitorID() {
        OpenApiLogger.apiInvokedLog("SolarEngine", "getVisitorID");
        return SolarEngine.getInstance().isSharedPreferenceSuccess() ? SolarEngine.getInstance().getVisitorID() : "";
    }

    public void ignoreAutoTrackActivities(List<Class<?>> list) {
        OpenApiLogger.apiInvokedLog("SolarEngine", "ignoreAutoTrackActivities", new OpenApiLogger.ParamBuilder().add("ignoredActivities", list));
        if (list == null || list.isEmpty()) {
            SolarEngineLogger.warn("SolarEngine", "ignoredActivities is null, ignoreAutoTrackActivities will not work.");
        } else {
            AutoTrackManager.getInstance().ignoreAutoTrackActivities(list);
        }
    }

    public void ignoreAutoTrackActivity(Class<?> cls) {
        OpenApiLogger.apiInvokedLog("SolarEngine", "ignoreAutoTrackActivity", new OpenApiLogger.ParamBuilder().add("ignoredActivity", cls));
        if (cls == null) {
            SolarEngineLogger.warn("SolarEngine", "ignoredActivity is null, ignoreAutoTrackActivity will not work.");
        } else {
            AutoTrackManager.getInstance().ignoreAutoTrackActivity(cls);
        }
    }

    public void ignoreView(View view) {
        OpenApiLogger.apiInvokedLog("SolarEngine", "ignoreView", new OpenApiLogger.ParamBuilder().add("ignoredView", view));
        if (view == null) {
            SolarEngineLogger.warn("SolarEngine", "ignoredView is null, ignoreView will not work.");
        } else {
            AutoTrackManager.getInstance().ignoreView(view);
        }
    }

    public void ignoreViewType(Class<?> cls) {
        OpenApiLogger.apiInvokedLog("SolarEngine", "ignoreViewType", new OpenApiLogger.ParamBuilder().add("ignoredViewType", cls));
        if (cls == null) {
            SolarEngineLogger.warn("SolarEngine", "ignoredViewType is null, ignoreViewType will not work.");
        } else {
            AutoTrackManager.getInstance().ignoreViewType(cls);
        }
    }

    public void initialize(Context context, String str, SolarEngineConfig solarEngineConfig, OnInitializationCallback onInitializationCallback) {
        OpenApiLogger.apiInvokedLog("SolarEngine", "initialize", new OpenApiLogger.ParamBuilder().add("appKey", str).add("config", solarEngineConfig).add("onInitializationCallback", onInitializationCallback));
        _initialize(context, str, "", solarEngineConfig, onInitializationCallback);
    }

    public void login(final String str) {
        OpenApiLogger.apiInvokedLog("SolarEngine", "login", new OpenApiLogger.ParamBuilder().add("accountID", str));
        if (SolarEngine.getInstance().isSharedPreferenceSuccess()) {
            SolarEngine.getInstance().login(str);
        } else {
            SolarEngine.getInstance().addSharedPreferenceWaitingTask(new Runnable() { // from class: com.reyun.solar.engine.r
                @Override // java.lang.Runnable
                public final void run() {
                    SolarEngine.getInstance().login(str);
                }
            });
        }
    }

    public void logout() {
        OpenApiLogger.apiInvokedLog("SolarEngine", "logout");
        if (SolarEngine.getInstance().isSharedPreferenceSuccess()) {
            SolarEngine.getInstance().logout();
            return;
        }
        SolarEngine solarEngine = SolarEngine.getInstance();
        final SolarEngine solarEngine2 = SolarEngine.getInstance();
        Objects.requireNonNull(solarEngine2);
        solarEngine.addSharedPreferenceWaitingTask(new Runnable() { // from class: com.reyun.solar.engine.f
            @Override // java.lang.Runnable
            public final void run() {
                solarEngine2.logout();
            }
        });
    }

    public void preInit(Context context, String str) {
        OpenApiLogger.apiInvokedLog("SolarEngine", "initialize", new OpenApiLogger.ParamBuilder().add("appKey", str));
        SolarEngine.getInstance().preInit(context, str);
    }

    public void reportEventImmediately() {
        OpenApiLogger.apiInvokedLog("SolarEngine", "reportEventImmediately");
        if (SolarEngine.getInstance().isInitSuccess()) {
            SolarEngine.getInstance().getEventLibrary().flush();
        } else {
            SolarEngineLogger.error("SolarEngine", "SolarEngine SDK init is false");
        }
    }

    public void restoreAutoTrackActivities(List<Class<?>> list) {
        OpenApiLogger.apiInvokedLog("SolarEngine", "restoreAutoTrackActivities", new OpenApiLogger.ParamBuilder().add("restoredActivities", list));
        if (list == null || list.isEmpty()) {
            SolarEngineLogger.warn("SolarEngine", "restoredActivities is null, restoreAutoTrackActivities will not work.");
        } else {
            AutoTrackManager.getInstance().restoreAutoTrackActivities(list);
        }
    }

    public void restoreAutoTrackActivity(Class<?> cls) {
        OpenApiLogger.apiInvokedLog("SolarEngine", "restoreAutoTrackActivity", new OpenApiLogger.ParamBuilder().add("restoredActivity", cls));
        if (cls == null) {
            SolarEngineLogger.warn("SolarEngine", "restoredActivity is null, restoreAutoTrackActivity will not work.");
        } else {
            AutoTrackManager.getInstance().restoreAutoTrackActivity(cls);
        }
    }

    public void restoreView(View view) {
        OpenApiLogger.apiInvokedLog("SolarEngine", "restoreView", new OpenApiLogger.ParamBuilder().add("restoredView", view));
        if (view == null) {
            SolarEngineLogger.warn("SolarEngine", "restoredView is null, restoreView will not work.");
        } else {
            AutoTrackManager.getInstance().restoreView(view);
        }
    }

    public void restoreViewType(Class<?> cls) {
        OpenApiLogger.apiInvokedLog("SolarEngine", "restoreViewType", new OpenApiLogger.ParamBuilder().add("restoredViewType", cls));
        if (cls == null) {
            SolarEngineLogger.warn("SolarEngine", "restoredViewType is null, restoreViewType will not work.");
        } else {
            AutoTrackManager.getInstance().restoreViewType(cls);
        }
    }

    public void setChannel(String str) {
        OpenApiLogger.apiInvokedLog("SolarEngine", "setChannel", new OpenApiLogger.ParamBuilder().add("channel", str));
        SolarEngine.getInstance().setChannel(str);
    }

    public void setDeepLinkCallback(DeepLinkCallBack deepLinkCallBack) {
        OpenApiLogger.apiInvokedLog("SolarEngine", "setDeepLinkCallback", new OpenApiLogger.ParamBuilder().add("callback", deepLinkCallBack));
        SolarEngine.getInstance().setDeepLinkCallBack(deepLinkCallBack);
    }

    public void setDeferredDeepLinkCallback(DeferredDeepLinkCallback deferredDeepLinkCallback) {
        OpenApiLogger.apiInvokedLog("SolarEngine", "setDeferredDeepLinkCallback", new OpenApiLogger.ParamBuilder().add("callback", deferredDeepLinkCallback));
        SolarEngine.getInstance().setDeferredDeepLinkCallback(deferredDeepLinkCallback);
    }

    @Deprecated
    public void setDelayDeepLinkCallback(DelayDeepLinkCallback delayDeepLinkCallback) {
        OpenApiLogger.apiInvokedLog("SolarEngine", "setDelayDeepLinkCallback", new OpenApiLogger.ParamBuilder().add("callback", delayDeepLinkCallback));
        SolarEngine.getInstance().setDelayDeepLinkCallback(delayDeepLinkCallback);
    }

    public void setGDPRArea(boolean z10) {
        OpenApiLogger.apiInvokedLog("SolarEngine", "setGDPRArea", new OpenApiLogger.ParamBuilder().add("isGDPRArea", Boolean.valueOf(z10)));
        if (SolarEngineUtils.isCN()) {
            SolarEngineLogger.warn("SolarEngine", "isGDPRArea is true, CN invalid configuration");
        }
        SolarEngine.getInstance().setGDPRArea(z10);
    }

    public void setGaid(String str) {
        OpenApiLogger.apiInvokedLog("SolarEngine", "setGaid", new OpenApiLogger.ParamBuilder().add("gaid", str));
        SolarEngine.getInstance().setGaid(str);
    }

    public void setJsBridge(WebView webView) {
        OpenApiLogger.apiInvokedLog("SolarEngine", "setJsBridge", new OpenApiLogger.ParamBuilder().add("webView", webView));
        if (webView == null) {
            SolarEngineLogger.warn("SolarEngine", "webView is null, setJsBridge will not work.");
        } else {
            NativeInteractiveH5Util.setNativeJsBridge(webView);
        }
    }

    public void setPresetEventProperties(final PresetEventType presetEventType, final JSONObject jSONObject) {
        OpenApiLogger.apiInvokedLog("SolarEngine", "setPresetEventProperties", new OpenApiLogger.ParamBuilder().add("presetEventType", presetEventType).add("customProperties", jSONObject));
        if (presetEventType == null) {
            SolarEngineLogger.warn("SolarEngine", "presetEventType is null, [setPresetEventProperties] event will not be tracked.");
        } else if (SolarEngine.getInstance().isSharedPreferenceSuccess()) {
            SolarEngine.getInstance().getPresetEventProperty().setPresetEventProperties(presetEventType, jSONObject);
        } else {
            SolarEngine.getInstance().addSharedPreferenceWaitingTask(new Runnable() { // from class: com.reyun.solar.engine.m0
                @Override // java.lang.Runnable
                public final void run() {
                    SolarEngine.getInstance().getPresetEventProperty().setPresetEventProperties(presetEventType, jSONObject);
                }
            });
        }
    }

    public void setSeSdkSource(SeSdkSource seSdkSource) {
        OpenApiLogger.apiInvokedLog("SolarEngine", "setSeSdkSource", new OpenApiLogger.ParamBuilder().add("seSdkSource", seSdkSource));
        SolarEngine.getInstance().setSDKSource(seSdkSource);
    }

    public void setSuperProperties(Context context, final String str, final double d10) {
        OpenApiLogger.apiInvokedLog("SolarEngine", "setSuperProperties", new OpenApiLogger.ParamBuilder().add(com.thinkup.core.common.d0.q.d.f67742m, str).add("value", Double.valueOf(d10)));
        if (SolarEngine.getInstance().isSharedPreferenceSuccess()) {
            SolarEngine.getInstance().getSuperProperty().setSuperProperties(str, d10);
        } else {
            SolarEngine.getInstance().addSharedPreferenceWaitingTask(new Runnable() { // from class: com.reyun.solar.engine.m
                @Override // java.lang.Runnable
                public final void run() {
                    SolarEngine.getInstance().getSuperProperty().setSuperProperties(str, d10);
                }
            });
        }
    }

    public void setViewId(View view, String str) {
        OpenApiLogger.apiInvokedLog("SolarEngine", "setViewId", new OpenApiLogger.ParamBuilder().add(MBridgeConstans.DYNAMIC_VIEW_KEY_VIEW, view).add("viewId", str));
        if (view == null) {
            SolarEngineLogger.warn("SolarEngine", "view is null, setViewId will not work.");
        } else {
            AutoTrackManager.getInstance().setViewId(view, str);
        }
    }

    public void setViewProperties(View view, JSONObject jSONObject) {
        OpenApiLogger.apiInvokedLog("SolarEngine", "setViewProperties", new OpenApiLogger.ParamBuilder().add(MBridgeConstans.DYNAMIC_VIEW_KEY_VIEW, view).add("customProperties", jSONObject));
        if (view == null) {
            SolarEngineLogger.warn("SolarEngine", "view is null, setViewProperties will not work.");
        } else {
            AutoTrackManager.getInstance().setViewProperties(view, jSONObject);
        }
    }

    public void setVisitorID(final String str) {
        OpenApiLogger.apiInvokedLog("SolarEngine", "setVisitorID", new OpenApiLogger.ParamBuilder().add("visitorID", str));
        if (SolarEngine.getInstance().isSharedPreferenceSuccess()) {
            SolarEngine.getInstance().setVisitorID(str);
        } else {
            SolarEngine.getInstance().addSharedPreferenceWaitingTask(new Runnable() { // from class: com.reyun.solar.engine.i0
                @Override // java.lang.Runnable
                public final void run() {
                    SolarEngine.getInstance().setVisitorID(str);
                }
            });
        }
    }

    public void track(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, JSONObject jSONObject) {
        OpenApiLogger.apiInvokedLog("SolarEngine", "track", new OpenApiLogger.ParamBuilder().add("adNetwork", str).add("subChannel", str2).add("adAccountId", str3).add("adAccountName", str4).add("adCampaignId", str5).add("adCampaignName", str6).add("adOfferId", str7).add("adOfferName", str8).add("adCreativeId", str9).add("adCreativeName", str10).add("attributionPlatform", str11).add("customProperties", jSONObject));
        trackAttr(new SEAttrEventModel(str, str2, str3, str4, str5, str6, str7, str8, str9, str10, str11, jSONObject));
    }

    public void trackABtestShunt(final String str, final String str2, final int i10) {
        OpenApiLogger.apiInvokedLog("SolarEngine", "trackABtestShunt", new OpenApiLogger.ParamBuilder().add("experimentId", str).add("experimentGroupId", str2).add("experimentStatus", Integer.valueOf(i10)));
        track(new Runnable() { // from class: com.reyun.solar.engine.k
            @Override // java.lang.Runnable
            public final void run() {
                SolarEngine.getInstance().getTrackManager().trackEvent(SolarEngineEventFactory.createSolarEngineEventABtestShunt(str, str2, i10));
            }
        });
    }

    public void trackAdClick(final SEAdClickEventModel sEAdClickEventModel) {
        OpenApiLogger.apiInvokedLog("SolarEngine", "trackAdClick", new OpenApiLogger.ParamBuilder().add("seAdClickEventModel", sEAdClickEventModel));
        if (sEAdClickEventModel == null) {
            SolarEngineLogger.warn("SolarEngine", "seAdClickEventModel is null, [trackAdClick] event will not be tracked.");
        } else {
            track(new Runnable() { // from class: com.reyun.solar.engine.c0
                @Override // java.lang.Runnable
                public final void run() {
                    SolarEngine.getInstance().getTrackManager().trackEvent(SolarEngineEventFactory.createSolarEngineEventAdClick(sEAdClickEventModel));
                }
            });
        }
    }

    public void trackAdImpression(final SEAdImpEventModel sEAdImpEventModel) {
        OpenApiLogger.apiInvokedLog("SolarEngine", "trackAdImpression", new OpenApiLogger.ParamBuilder().add("seAdImpEventModel", sEAdImpEventModel));
        if (sEAdImpEventModel == null) {
            SolarEngineLogger.warn("SolarEngine", "seAdImpEventModel is null, [trackAdImpression] event will not be tracked.");
        } else {
            track(new Runnable() { // from class: com.reyun.solar.engine.l0
                @Override // java.lang.Runnable
                public final void run() {
                    SolarEngine.getInstance().getTrackManager().trackEvent(SolarEngineEventFactory.createSolarEngineEventAdImpression(sEAdImpEventModel));
                }
            });
        }
    }

    public void trackAppAchieveLevel(final SEAppAchieveLevelModel sEAppAchieveLevelModel) {
        OpenApiLogger.apiInvokedLog("SolarEngine", "trackAppAchieveLevel", new OpenApiLogger.ParamBuilder().add("appAchieveLevelModel", sEAppAchieveLevelModel));
        if (sEAppAchieveLevelModel == null) {
            SolarEngineLogger.warn("SolarEngine", "appAchieveLevelModel is null, [trackAppAchieveLevel] event will not be tracked.");
            return;
        }
        Runnable runnable = new Runnable() { // from class: com.reyun.solar.engine.g
            @Override // java.lang.Runnable
            public final void run() {
                SolarEngineManager.r(this.f66961a, sEAppAchieveLevelModel);
            }
        };
        if (SolarEngine.getInstance().isInitSuccess()) {
            ExecutorManager.executorCommon(runnable);
        } else {
            SolarEngine.getInstance().addWaitingTask(runnable);
        }
    }

    public void trackAppAdButtonClick(final SEAppAdButtonClickModel sEAppAdButtonClickModel, final StrategyBuilder strategyBuilder) {
        OpenApiLogger.apiInvokedLog("SolarEngine", "trackAppAdButtonClick", new OpenApiLogger.ParamBuilder().add("appAdButtonClickModel", sEAppAdButtonClickModel).add("strategy", strategyBuilder));
        if (sEAppAdButtonClickModel == null) {
            SolarEngineLogger.warn("SolarEngine", "appAdButtonClickModel is null, [trackAppAdButtonClick] event will not be tracked.");
            return;
        }
        Runnable runnable = new Runnable() { // from class: com.reyun.solar.engine.x0
            @Override // java.lang.Runnable
            public final void run() {
                SolarEnginePartnerManager.getInstance().trackAppAdButtonClick(sEAppAdButtonClickModel, strategyBuilder);
            }
        };
        if (SolarEngine.getInstance().isInitSuccess()) {
            ExecutorManager.executorCommon(runnable);
        } else {
            SolarEngine.getInstance().addWaitingTask(runnable);
        }
    }

    public void trackAppAdShowEnd(final SEAppAdShowEndModel sEAppAdShowEndModel) {
        OpenApiLogger.apiInvokedLog("SolarEngine", "trackAppAdShowEnd", new OpenApiLogger.ParamBuilder().add("appAdShowEndModel", sEAppAdShowEndModel));
        if (sEAppAdShowEndModel == null) {
            SolarEngineLogger.warn("SolarEngine", "appAdShowEndModel is null, [trackAppAdShowEnd] event will not be tracked.");
            return;
        }
        JSONObject properties = sEAppAdShowEndModel.getProperties();
        long jCalculateAdDuration = AdDurationManager.getInstance().calculateAdDuration(properties.optString(AdDurationManager.AD_SHOW_UNIQUE_ID, ""));
        if (jCalculateAdDuration > 0) {
            try {
                sEAppAdShowEndModel = new SEAppAdShowEndModel.InternalBuilder().withAdType(properties.optInt("_ad_type", 0)).withAdPositionType(properties.optString(PartnerEventParamsConstants.PROPERTY_KEY_AD_POSITION_TYPE, "")).withAdPosition(properties.optString(PartnerEventParamsConstants.PROPERTY_KEY_AD_POSITION, "")).withResult(Result.fromString(properties.optString(PartnerEventParamsConstants.PROPERTY_KEY_RESULT, ""))).withAdShowDuration(jCalculateAdDuration).withCustomProperties(sEAppAdShowEndModel.getCustomProperties()).build();
            } catch (IllegalArgumentException e10) {
                SolarEngineLogger.warn("SolarEngine", "Invalid result string, using default result: " + e10.getMessage());
                sEAppAdShowEndModel = new SEAppAdShowEndModel.InternalBuilder().withAdType(properties.optInt("_ad_type", 0)).withAdPositionType(properties.optString(PartnerEventParamsConstants.PROPERTY_KEY_AD_POSITION_TYPE, "")).withAdPosition(properties.optString(PartnerEventParamsConstants.PROPERTY_KEY_AD_POSITION, "")).withResult(Result.SUCCESS).withAdShowDuration(jCalculateAdDuration).withCustomProperties(sEAppAdShowEndModel.getCustomProperties()).build();
            }
        }
        Runnable runnable = new Runnable() { // from class: com.reyun.solar.engine.w
            @Override // java.lang.Runnable
            public final void run() {
                SolarEngineManager.k(this.f67127a, sEAppAdShowEndModel);
            }
        };
        if (SolarEngine.getInstance().isInitSuccess()) {
            ExecutorManager.executorCommon(runnable);
        } else {
            SolarEngine.getInstance().addWaitingTask(runnable);
        }
    }

    public void trackAppAdShowStart(final SEAppAdShowStartModel sEAppAdShowStartModel) {
        OpenApiLogger.apiInvokedLog("SolarEngine", "trackAppAdShowStart", new OpenApiLogger.ParamBuilder().add("appAdShowStartModel", sEAppAdShowStartModel));
        if (sEAppAdShowStartModel == null) {
            SolarEngineLogger.warn("SolarEngine", "appAdShowStartModel is null, [trackAppAdShowStart] event will not be tracked.");
            return;
        }
        AdDurationManager.getInstance().recordAdShowStart(sEAppAdShowStartModel.getProperties().optString(AdDurationManager.AD_SHOW_UNIQUE_ID, ""));
        Runnable runnable = new Runnable() { // from class: com.reyun.solar.engine.w0
            @Override // java.lang.Runnable
            public final void run() {
                SolarEngineManager.T(this.f67129a, sEAppAdShowStartModel);
            }
        };
        if (SolarEngine.getInstance().isInitSuccess()) {
            ExecutorManager.executorCommon(runnable);
        } else {
            SolarEngine.getInstance().addWaitingTask(runnable);
        }
    }

    public void trackAppClick(final SEAppClickModel sEAppClickModel) {
        OpenApiLogger.apiInvokedLog("SolarEngine", "trackAppClick", new OpenApiLogger.ParamBuilder().add("seAppClickModel", sEAppClickModel));
        if (sEAppClickModel == null) {
            SolarEngineLogger.warn("SolarEngine", "seAppClickModel is null, [trackAppClick] event will not be tracked.");
        } else {
            track(new Runnable() { // from class: com.reyun.solar.engine.h
                @Override // java.lang.Runnable
                public final void run() {
                    SolarEngine.getInstance().getTrackManager().trackEvent(SolarEngineEventFactory.createSolarEngineEventAppClick(sEAppClickModel, false));
                }
            });
        }
    }

    public void trackAppCostCoins(final SEAppCostCoinsModel sEAppCostCoinsModel, final StrategyBuilder strategyBuilder) {
        OpenApiLogger.apiInvokedLog("SolarEngine", "trackAppCostCoins", new OpenApiLogger.ParamBuilder().add("appCostCoinsModel", sEAppCostCoinsModel).add("strategy", strategyBuilder));
        if (sEAppCostCoinsModel == null) {
            SolarEngineLogger.warn("SolarEngine", "appCostCoinsModel is null, [trackAppCostCoins] event will not be tracked.");
            return;
        }
        Runnable runnable = new Runnable() { // from class: com.reyun.solar.engine.n1
            @Override // java.lang.Runnable
            public final void run() {
                SolarEnginePartnerManager.getInstance().trackAppCostCoins(sEAppCostCoinsModel, strategyBuilder);
            }
        };
        if (SolarEngine.getInstance().isInitSuccess()) {
            ExecutorManager.executorCommon(runnable);
        } else {
            SolarEngine.getInstance().addWaitingTask(runnable);
        }
    }

    public void trackAppEndPlay(final SEAppEndPlayModel sEAppEndPlayModel, final StrategyBuilder strategyBuilder) {
        OpenApiLogger.apiInvokedLog("SolarEngine", "trackAppEndPlay", new OpenApiLogger.ParamBuilder().add("appEndPlayModel", sEAppEndPlayModel).add("strategy", strategyBuilder));
        if (sEAppEndPlayModel == null) {
            SolarEngineLogger.warn("SolarEngine", "appEndPlayModel is null, [trackAppEndPlay] event will not be tracked.");
            return;
        }
        Runnable runnable = new Runnable() { // from class: com.reyun.solar.engine.m1
            @Override // java.lang.Runnable
            public final void run() {
                SolarEnginePartnerManager.getInstance().trackAppEndPlay(sEAppEndPlayModel, strategyBuilder);
            }
        };
        if (SolarEngine.getInstance().isInitSuccess()) {
            ExecutorManager.executorCommon(runnable);
        } else {
            SolarEngine.getInstance().addWaitingTask(runnable);
        }
    }

    public void trackAppGameInitInfo(final SEAppGameInitInfoModel sEAppGameInitInfoModel, final StrategyBuilder strategyBuilder) {
        OpenApiLogger.apiInvokedLog("SolarEngine", "trackAppGameInitInfo", new OpenApiLogger.ParamBuilder().add("appGameInitInfoModel", sEAppGameInitInfoModel).add("strategy", strategyBuilder));
        if (sEAppGameInitInfoModel == null) {
            SolarEngineLogger.warn("SolarEngine", "appGameInitInfoModel is null, [trackAppGameInitInfo] event will not be tracked.");
            return;
        }
        Runnable runnable = new Runnable() { // from class: com.reyun.solar.engine.l
            @Override // java.lang.Runnable
            public final void run() {
                SolarEnginePartnerManager.getInstance().trackAppGameInitInfo(sEAppGameInitInfoModel, strategyBuilder);
            }
        };
        if (SolarEngine.getInstance().isInitSuccess()) {
            ExecutorManager.executorCommon(runnable);
        } else {
            SolarEngine.getInstance().addWaitingTask(runnable);
        }
    }

    public void trackAppGetCoins(final SEAppGetCoinsModel sEAppGetCoinsModel, final StrategyBuilder strategyBuilder) {
        OpenApiLogger.apiInvokedLog("SolarEngine", "trackAppGetCoins", new OpenApiLogger.ParamBuilder().add("appGetCoinsModel", sEAppGetCoinsModel).add("strategy", strategyBuilder));
        if (sEAppGetCoinsModel == null) {
            SolarEngineLogger.warn("SolarEngine", "appGetCoinsModel is null, [trackAppGetCoins] event will not be tracked.");
            return;
        }
        Runnable runnable = new Runnable() { // from class: com.reyun.solar.engine.q
            @Override // java.lang.Runnable
            public final void run() {
                SolarEnginePartnerManager.getInstance().trackAppGetCoins(sEAppGetCoinsModel, strategyBuilder);
            }
        };
        if (SolarEngine.getInstance().isInitSuccess()) {
            ExecutorManager.executorCommon(runnable);
        } else {
            SolarEngine.getInstance().addWaitingTask(runnable);
        }
    }

    @Deprecated
    public void trackAppLogin(String str, String str2, JSONObject jSONObject) {
        OpenApiLogger.apiInvokedLog("SolarEngine", "trackAppLogin", new OpenApiLogger.ParamBuilder().add("loginType", str).add("status", str2).add("customProperties", jSONObject));
        trackAppLogin(new SELoginEventModel(str, str2, jSONObject));
    }

    public void trackAppReEngagement(final SEAppReEngagementModel sEAppReEngagementModel) {
        OpenApiLogger.apiInvokedLog("SolarEngine", "trackAppReEngagement", new OpenApiLogger.ParamBuilder().add("seAppReEngagementModel", sEAppReEngagementModel));
        if (sEAppReEngagementModel == null) {
            SolarEngineLogger.warn("SolarEngine", "seAppReEngagementModel is null, [trackAppReEngagement] event will not be tracked.");
        } else if (SolarEngine.getInstance().getConfig() == null || SolarEngine.getInstance().getConfig().isEnableAttribution()) {
            track(new Runnable() { // from class: com.reyun.solar.engine.p
                @Override // java.lang.Runnable
                public final void run() {
                    SolarEngine.getInstance().getTrackManager().trackEvent(SolarEngineEventFactory.createSolarEngineEventAppReEngagement(sEAppReEngagementModel));
                }
            });
        } else {
            SolarEngineLogger.warn("SolarEngine", "Attribution is disabled, [trackAppReEngagement] event will not be tracked.");
        }
    }

    @Deprecated
    public void trackAppRegister(String str, String str2, JSONObject jSONObject) {
        OpenApiLogger.apiInvokedLog("SolarEngine", "trackAppRegister", new OpenApiLogger.ParamBuilder().add("regType", str).add("status", str2).add("customProperties", jSONObject));
        trackAppRegister(new SERegisterEventModel(str, str2, jSONObject));
    }

    public void trackAppStartPlay(final SEAppStartPlayModel sEAppStartPlayModel, final StrategyBuilder strategyBuilder) {
        OpenApiLogger.apiInvokedLog("SolarEngine", "trackAppStartPlay", new OpenApiLogger.ParamBuilder().add("appStartPlayModel", sEAppStartPlayModel).add("strategy", strategyBuilder));
        if (sEAppStartPlayModel == null) {
            SolarEngineLogger.warn("SolarEngine", "appStartPlayModel is null, [trackAppStartPlay] event will not be tracked.");
            return;
        }
        Runnable runnable = new Runnable() { // from class: com.reyun.solar.engine.g1
            @Override // java.lang.Runnable
            public final void run() {
                SolarEnginePartnerManager.getInstance().trackAppStartPlay(sEAppStartPlayModel, strategyBuilder);
            }
        };
        if (SolarEngine.getInstance().isInitSuccess()) {
            ExecutorManager.executorCommon(runnable);
        } else {
            SolarEngine.getInstance().addWaitingTask(runnable);
        }
    }

    public void trackAppUpdateLevel(final SEAppUpdateLevelModel sEAppUpdateLevelModel, final StrategyBuilder strategyBuilder) {
        OpenApiLogger.apiInvokedLog("SolarEngine", "trackAppUpdateLevel", new OpenApiLogger.ParamBuilder().add("appUpdateLevelModel", sEAppUpdateLevelModel).add("strategy", strategyBuilder));
        if (sEAppUpdateLevelModel == null) {
            SolarEngineLogger.warn("SolarEngine", "appUpdateLevelModel is null, [trackAppUpdateLevel] event will not be tracked.");
            return;
        }
        Runnable runnable = new Runnable() { // from class: com.reyun.solar.engine.f1
            @Override // java.lang.Runnable
            public final void run() {
                SolarEnginePartnerManager.getInstance().trackAppUpdateLevel(sEAppUpdateLevelModel, strategyBuilder);
            }
        };
        if (SolarEngine.getInstance().isInitSuccess()) {
            ExecutorManager.executorCommon(runnable);
        } else {
            SolarEngine.getInstance().addWaitingTask(runnable);
        }
    }

    public void trackAppViewScreen(final SEViewScreenModel sEViewScreenModel) {
        OpenApiLogger.apiInvokedLog("SolarEngine", "trackAppViewScreen", new OpenApiLogger.ParamBuilder().add("seViewScreenModel", sEViewScreenModel));
        if (sEViewScreenModel == null) {
            SolarEngineLogger.warn("SolarEngine", "seViewScreenModel is null, [trackAppViewScreen] event will not be tracked.");
        } else {
            track(new Runnable() { // from class: com.reyun.solar.engine.u0
                @Override // java.lang.Runnable
                public final void run() {
                    SolarEngine.getInstance().getTrackManager().trackEvent(SolarEngineEventFactory.createSolarEngineEventViewScreen(sEViewScreenModel, false));
                }
            });
        }
    }

    public void trackAttr(final SEAttrEventModel sEAttrEventModel) {
        OpenApiLogger.apiInvokedLog("SolarEngine", "trackAttr", new OpenApiLogger.ParamBuilder().add("seAttrEventModel", sEAttrEventModel));
        if (sEAttrEventModel == null) {
            SolarEngineLogger.warn("SolarEngine", "seAttrEventModel is null, [trackAttr] event will not be tracked.");
        } else {
            track(new Runnable() { // from class: com.reyun.solar.engine.b1
                @Override // java.lang.Runnable
                public final void run() {
                    SolarEngine.getInstance().getTrackManager().trackEvent(SolarEngineEventFactory.createSolarEngineEventAttr(sEAttrEventModel));
                }
            });
        }
    }

    public void trackFirstEvent(final SEBaseFirstEventModel sEBaseFirstEventModel) {
        OpenApiLogger.apiInvokedLog("SolarEngine", "trackFirstEvent", new OpenApiLogger.ParamBuilder().add("seBaseFirstEventModel", sEBaseFirstEventModel));
        if (sEBaseFirstEventModel == null) {
            SolarEngineLogger.warn("SolarEngine", "seBaseFirstEventModel is null, [trackFirstEvent] event will not be tracked.");
        } else {
            track(new Runnable() { // from class: com.reyun.solar.engine.u
                @Override // java.lang.Runnable
                public final void run() {
                    SolarEngine.getInstance().getTrackManager().trackEvent(SolarEngineEventFactory.createSolarEngineEventFirst(sEBaseFirstEventModel));
                }
            });
        }
    }

    public void trackOrder(final SEOrderEventModel sEOrderEventModel) {
        OpenApiLogger.apiInvokedLog("SolarEngine", "trackOrder", new OpenApiLogger.ParamBuilder().add("seOrderEventModel", sEOrderEventModel));
        if (sEOrderEventModel == null) {
            SolarEngineLogger.warn("SolarEngine", "seOrderEventModel is null, [trackOrder] event will not be tracked.");
        } else {
            track(new Runnable() { // from class: com.reyun.solar.engine.l1
                @Override // java.lang.Runnable
                public final void run() {
                    SolarEngine.getInstance().getTrackManager().trackEvent(SolarEngineEventFactory.createSolarEngineEventOrder(sEOrderEventModel));
                }
            });
        }
    }

    public void trackPurchase(final SEPurchaseEventModel sEPurchaseEventModel) {
        OpenApiLogger.apiInvokedLog("SolarEngine", "trackPurchase", new OpenApiLogger.ParamBuilder().add("sePurchaseEventModel", sEPurchaseEventModel));
        if (sEPurchaseEventModel == null) {
            SolarEngineLogger.warn("SolarEngine", "sePurchaseEventModel is null, [trackPurchase] event will not be tracked.");
        } else {
            track(new Runnable() { // from class: com.reyun.solar.engine.t
                @Override // java.lang.Runnable
                public final void run() {
                    SolarEngine.getInstance().getTrackManager().trackEvent(SolarEngineEventFactory.createSolarEngineEventPurchase(sEPurchaseEventModel));
                }
            });
        }
    }

    @Deprecated
    public void trackTimerEvent(final TrackEvent trackEvent) {
        OpenApiLogger.apiInvokedLog("SolarEngine", "trackTimerEvent", new OpenApiLogger.ParamBuilder().add("trackEvent", trackEvent));
        if (trackEvent == null) {
            SolarEngineLogger.warn("SolarEngine", "trackEvent is null, [trackTimerEvent] event will not be tracked.");
            return;
        }
        String customEventName = trackEvent.getCustomEventName();
        if (TextUtils.isEmpty(customEventName)) {
            SolarEngineLogger.warn("SolarEngine", "eventName is null, [trackTimerEvent] event will not be tracked.");
        } else {
            trackEvent.setDuration(TimerEventManager.getDuration(customEventName));
            track(new Runnable() { // from class: com.reyun.solar.engine.r0
                @Override // java.lang.Runnable
                public final void run() {
                    SolarEngine.getInstance().getTrackManager().trackEvent(SolarEngineEventFactory.createSolarEngineTimerEvent(trackEvent));
                }
            });
        }
    }

    public void unsetSuperProperty(Context context, final String str) {
        OpenApiLogger.apiInvokedLog("SolarEngine", "unsetSuperProperty", new OpenApiLogger.ParamBuilder().add(com.thinkup.core.common.d0.q.d.f67742m, str));
        if (SolarEngine.getInstance().isSharedPreferenceSuccess()) {
            SolarEngine.getInstance().getSuperProperty().unsetSuperProperty(str);
        } else {
            SolarEngine.getInstance().addSharedPreferenceWaitingTask(new Runnable() { // from class: com.reyun.solar.engine.h0
                @Override // java.lang.Runnable
                public final void run() {
                    SolarEngine.getInstance().getSuperProperty().unsetSuperProperty(str);
                }
            });
        }
    }

    public void userAdd(final JSONObject jSONObject) {
        OpenApiLogger.apiInvokedLog("SolarEngine", Command.User.USER_ADD, new OpenApiLogger.ParamBuilder().add(Command.PropertyKey.PROPERTIES, jSONObject));
        user(new Runnable() { // from class: com.reyun.solar.engine.s0
            @Override // java.lang.Runnable
            public final void run() {
                SolarEngine.getInstance().getTrackManager().trackUserSet(SolarEngineEventFactory.createSolarEngineEventUserAdd(jSONObject));
            }
        });
    }

    public void userAppend(final JSONObject jSONObject) {
        OpenApiLogger.apiInvokedLog("SolarEngine", Command.User.USER_APPEND, new OpenApiLogger.ParamBuilder().add(Command.PropertyKey.PROPERTIES, jSONObject));
        user(new Runnable() { // from class: com.reyun.solar.engine.k1
            @Override // java.lang.Runnable
            public final void run() {
                SolarEngine.getInstance().getTrackManager().trackUserSet(SolarEngineEventFactory.createSolarEngineEventUserAppend(jSONObject));
            }
        });
    }

    public void userDelete(final SEUserDeleteType sEUserDeleteType) {
        OpenApiLogger.apiInvokedLog("SolarEngine", "userDelete", new OpenApiLogger.ParamBuilder().add("seUserDeleteType", sEUserDeleteType));
        if (sEUserDeleteType == null) {
            SolarEngineLogger.warn("SolarEngine", "seUserDeleteType is null, [userDelete] event will not be tracked.");
        } else {
            user(new Runnable() { // from class: com.reyun.solar.engine.c1
                @Override // java.lang.Runnable
                public final void run() {
                    SolarEngine.getInstance().getTrackManager().trackUserSet(SolarEngineEventFactory.createSolarEngineEventUserDelete(sEUserDeleteType));
                }
            });
        }
    }

    public void userInit(final JSONObject jSONObject) {
        OpenApiLogger.apiInvokedLog("SolarEngine", Command.User.USER_INIT, new OpenApiLogger.ParamBuilder().add(Command.PropertyKey.PROPERTIES, jSONObject));
        user(new Runnable() { // from class: com.reyun.solar.engine.t0
            @Override // java.lang.Runnable
            public final void run() {
                SolarEngine.getInstance().getTrackManager().trackUserSet(SolarEngineEventFactory.createSolarEngineEventUserInit(jSONObject));
            }
        });
    }

    public void userUnset(final String... strArr) {
        OpenApiLogger.apiInvokedLog("SolarEngine", Command.User.USER_UNSET, new OpenApiLogger.ParamBuilder().add("keys", strArr));
        user(new Runnable() { // from class: com.reyun.solar.engine.z0
            @Override // java.lang.Runnable
            public final void run() {
                SolarEngine.getInstance().getTrackManager().trackUserSet(SolarEngineEventFactory.createSolarEngineEventUserUnset(strArr));
            }
        });
    }

    public void userUpdate(final JSONObject jSONObject) {
        OpenApiLogger.apiInvokedLog("SolarEngine", Command.User.USER_UPDATE, new OpenApiLogger.ParamBuilder().add(Command.PropertyKey.PROPERTIES, jSONObject));
        user(new Runnable() { // from class: com.reyun.solar.engine.j
            @Override // java.lang.Runnable
            public final void run() {
                SolarEngine.getInstance().getTrackManager().trackUserSet(SolarEngineEventFactory.createSolarEngineEventUserUpdate(jSONObject));
            }
        });
    }

    public void setJsBridge(Object obj) {
        OpenApiLogger.apiInvokedLog("SolarEngine", "setJsBridge", new OpenApiLogger.ParamBuilder().add("x5WebView", obj));
        if (obj == null) {
            SolarEngineLogger.warn("SolarEngine", "x5WebView is null, setJsBridge will not work.");
        } else {
            NativeInteractiveH5Util.setX5JsBridge(obj);
        }
    }

    public void trackAppClick(View view, JSONObject jSONObject) {
        OpenApiLogger.apiInvokedLog("SolarEngine", "trackAppClick", new OpenApiLogger.ParamBuilder().add(MBridgeConstans.DYNAMIC_VIEW_KEY_VIEW, view).add("customProperties", jSONObject));
        trackAppClick(new SEAppClickModel(view, jSONObject));
    }

    public void trackAppViewScreen(Activity activity, JSONObject jSONObject) {
        OpenApiLogger.apiInvokedLog("SolarEngine", "trackAppViewScreen", new OpenApiLogger.ParamBuilder().add("activity", activity).add("customProperties", jSONObject));
        trackAppViewScreen(new SEViewScreenModel(activity, jSONObject));
    }

    public void trackAppLogin(final SELoginEventModel sELoginEventModel) {
        OpenApiLogger.apiInvokedLog("SolarEngine", "trackAppLogin", new OpenApiLogger.ParamBuilder().add("seLoginEventModel", sELoginEventModel));
        if (sELoginEventModel == null) {
            SolarEngineLogger.warn("SolarEngine", "seLoginEventModel is null, [trackAppLogin] event will not be tracked.");
        } else {
            track(new Runnable() { // from class: com.reyun.solar.engine.a
                @Override // java.lang.Runnable
                public final void run() {
                    SolarEngine.getInstance().getTrackManager().trackEvent(SolarEngineEventFactory.createSolarEngineEventLogin(sELoginEventModel));
                }
            });
        }
    }

    public void trackAppRegister(final SERegisterEventModel sERegisterEventModel) {
        OpenApiLogger.apiInvokedLog("SolarEngine", "trackAppRegister", new OpenApiLogger.ParamBuilder().add("seRegisterEventModel", sERegisterEventModel));
        if (sERegisterEventModel == null) {
            SolarEngineLogger.warn("SolarEngine", "seRegisterEventModel is null, [trackAppRegister] event will not be tracked.");
        } else {
            track(new Runnable() { // from class: com.reyun.solar.engine.j1
                @Override // java.lang.Runnable
                public final void run() {
                    SolarEngine.getInstance().getTrackManager().trackEvent(SolarEngineEventFactory.createSolarEngineEventRegister(sERegisterEventModel));
                }
            });
        }
    }

    @Deprecated
    public void initialize(Context context, String str, OnInitializationCallback onInitializationCallback) {
        OpenApiLogger.apiInvokedLog("SolarEngine", "initialize", new OpenApiLogger.ParamBuilder().add("appKey", str).add("onInitializationCallback", onInitializationCallback));
        _initialize(context, str, "", null, onInitializationCallback);
    }

    @Deprecated
    public void initialize(Context context, String str, SolarEngineConfig solarEngineConfig) {
        OpenApiLogger.apiInvokedLog("SolarEngine", "initialize", new OpenApiLogger.ParamBuilder().add("appKey", str).add("config", solarEngineConfig));
        _initialize(context, str, "", solarEngineConfig, null);
    }

    @Deprecated
    public void initialize(Context context, String str) {
        OpenApiLogger.apiInvokedLog("SolarEngine", "initialize", new OpenApiLogger.ParamBuilder().add("appKey", str));
        _initialize(context, str, "", null, null);
    }

    @Deprecated
    public void initialize(Context context, String str, String str2) {
        OpenApiLogger.apiInvokedLog("SolarEngine", "initialize", new OpenApiLogger.ParamBuilder().add("appKey", str).add(VungleConstants.KEY_USER_ID, str2));
        _initialize(context, str, str2, null, null);
    }

    @Deprecated
    public void initialize(Context context, String str, String str2, SolarEngineConfig solarEngineConfig) {
        OpenApiLogger.apiInvokedLog("SolarEngine", "initialize", new OpenApiLogger.ParamBuilder().add("appKey", str).add(VungleConstants.KEY_USER_ID, str2).add("config", solarEngineConfig));
        _initialize(context, str, str2, solarEngineConfig, null);
    }

    public void initialize(Context context, String str, String str2, SolarEngineConfig solarEngineConfig, OnInitializationCallback onInitializationCallback) {
        OpenApiLogger.apiInvokedLog("SolarEngine", "initialize", new OpenApiLogger.ParamBuilder().add("appKey", str).add(VungleConstants.KEY_USER_ID, str2).add("config", solarEngineConfig).add("onInitializationCallback", onInitializationCallback));
        _initialize(context, str, str2, solarEngineConfig, onInitializationCallback);
    }

    public void trackAppAdButtonClick(final SEAppAdButtonClickModel sEAppAdButtonClickModel) {
        OpenApiLogger.apiInvokedLog("SolarEngine", "trackAppAdButtonClick", new OpenApiLogger.ParamBuilder().add("appAdButtonClickModel", sEAppAdButtonClickModel));
        if (sEAppAdButtonClickModel == null) {
            SolarEngineLogger.warn("SolarEngine", "appAdButtonClickModel is null, [trackAppAdButtonClick] event will not be tracked.");
            return;
        }
        Runnable runnable = new Runnable() { // from class: com.reyun.solar.engine.y0
            @Override // java.lang.Runnable
            public final void run() {
                SolarEngineManager.c0(this.f67137a, sEAppAdButtonClickModel);
            }
        };
        if (SolarEngine.getInstance().isInitSuccess()) {
            ExecutorManager.executorCommon(runnable);
        } else {
            SolarEngine.getInstance().addWaitingTask(runnable);
        }
    }

    public void trackAppCostCoins(final SEAppCostCoinsModel sEAppCostCoinsModel) {
        OpenApiLogger.apiInvokedLog("SolarEngine", "trackAppCostCoins", new OpenApiLogger.ParamBuilder().add("appCostCoinsModel", sEAppCostCoinsModel));
        if (sEAppCostCoinsModel == null) {
            SolarEngineLogger.warn("SolarEngine", "appCostCoinsModel is null, [trackAppCostCoins] event will not be tracked.");
            return;
        }
        Runnable runnable = new Runnable() { // from class: com.reyun.solar.engine.x
            @Override // java.lang.Runnable
            public final void run() {
                SolarEngineManager.Q(this.f67131a, sEAppCostCoinsModel);
            }
        };
        if (SolarEngine.getInstance().isInitSuccess()) {
            ExecutorManager.executorCommon(runnable);
        } else {
            SolarEngine.getInstance().addWaitingTask(runnable);
        }
    }

    public void trackAppEndPlay(final SEAppEndPlayModel sEAppEndPlayModel) {
        OpenApiLogger.apiInvokedLog("SolarEngine", "trackAppEndPlay", new OpenApiLogger.ParamBuilder().add("appEndPlayModel", sEAppEndPlayModel));
        if (sEAppEndPlayModel == null) {
            SolarEngineLogger.warn("SolarEngine", "appEndPlayModel is null, [trackAppEndPlay] event will not be tracked.");
            return;
        }
        Runnable runnable = new Runnable() { // from class: com.reyun.solar.engine.z
            @Override // java.lang.Runnable
            public final void run() {
                SolarEngineManager.b(this.f67139a, sEAppEndPlayModel);
            }
        };
        if (SolarEngine.getInstance().isInitSuccess()) {
            ExecutorManager.executorCommon(runnable);
        } else {
            SolarEngine.getInstance().addWaitingTask(runnable);
        }
    }

    public void trackAppGameInitInfo(final SEAppGameInitInfoModel sEAppGameInitInfoModel) {
        OpenApiLogger.apiInvokedLog("SolarEngine", "trackAppGameInitInfo", new OpenApiLogger.ParamBuilder().add("appGameInitInfoModel", sEAppGameInitInfoModel));
        if (sEAppGameInitInfoModel == null) {
            SolarEngineLogger.warn("SolarEngine", "appGameInitInfoModel is null, [trackAppGameInitInfo] event will not be tracked.");
            return;
        }
        Runnable runnable = new Runnable() { // from class: com.reyun.solar.engine.y
            @Override // java.lang.Runnable
            public final void run() {
                SolarEngineManager.f0(this.f67135a, sEAppGameInitInfoModel);
            }
        };
        if (SolarEngine.getInstance().isInitSuccess()) {
            ExecutorManager.executorCommon(runnable);
        } else {
            SolarEngine.getInstance().addWaitingTask(runnable);
        }
    }

    public void trackAppGetCoins(final SEAppGetCoinsModel sEAppGetCoinsModel) {
        OpenApiLogger.apiInvokedLog("SolarEngine", "trackAppGetCoins", new OpenApiLogger.ParamBuilder().add("appGetCoinsModel", sEAppGetCoinsModel));
        if (sEAppGetCoinsModel == null) {
            SolarEngineLogger.warn("SolarEngine", "appGetCoinsModel is null, [trackAppGetCoins] event will not be tracked.");
            return;
        }
        Runnable runnable = new Runnable() { // from class: com.reyun.solar.engine.n
            @Override // java.lang.Runnable
            public final void run() {
                SolarEngineManager.o(this.f67008a, sEAppGetCoinsModel);
            }
        };
        if (SolarEngine.getInstance().isInitSuccess()) {
            ExecutorManager.executorCommon(runnable);
        } else {
            SolarEngine.getInstance().addWaitingTask(runnable);
        }
    }

    public void trackAppStartPlay(final SEAppStartPlayModel sEAppStartPlayModel) {
        OpenApiLogger.apiInvokedLog("SolarEngine", "trackAppStartPlay", new OpenApiLogger.ParamBuilder().add("appStartPlayModel", sEAppStartPlayModel));
        if (sEAppStartPlayModel == null) {
            SolarEngineLogger.warn("SolarEngine", "appStartPlayModel is null, [trackAppStartPlay] event will not be tracked.");
            return;
        }
        Runnable runnable = new Runnable() { // from class: com.reyun.solar.engine.v0
            @Override // java.lang.Runnable
            public final void run() {
                SolarEngineManager.s(this.f67125a, sEAppStartPlayModel);
            }
        };
        if (SolarEngine.getInstance().isInitSuccess()) {
            ExecutorManager.executorCommon(runnable);
        } else {
            SolarEngine.getInstance().addWaitingTask(runnable);
        }
    }

    public void trackAppUpdateLevel(final SEAppUpdateLevelModel sEAppUpdateLevelModel) {
        OpenApiLogger.apiInvokedLog("SolarEngine", "trackAppUpdateLevel", new OpenApiLogger.ParamBuilder().add("appUpdateLevelModel", sEAppUpdateLevelModel));
        if (sEAppUpdateLevelModel == null) {
            SolarEngineLogger.warn("SolarEngine", "appUpdateLevelModel is null, [trackAppUpdateLevel] event will not be tracked.");
            return;
        }
        Runnable runnable = new Runnable() { // from class: com.reyun.solar.engine.j0
            @Override // java.lang.Runnable
            public final void run() {
                SolarEngineManager.R(this.f66988a, sEAppUpdateLevelModel);
            }
        };
        if (SolarEngine.getInstance().isInitSuccess()) {
            ExecutorManager.executorCommon(runnable);
        } else {
            SolarEngine.getInstance().addWaitingTask(runnable);
        }
    }

    public void setSuperProperties(Context context, final String str, final float f10) {
        OpenApiLogger.apiInvokedLog("SolarEngine", "setSuperProperties", new OpenApiLogger.ParamBuilder().add(com.thinkup.core.common.d0.q.d.f67742m, str).add("value", Float.valueOf(f10)));
        if (SolarEngine.getInstance().isSharedPreferenceSuccess()) {
            SolarEngine.getInstance().getSuperProperty().setSuperProperties(str, f10);
        } else {
            SolarEngine.getInstance().addSharedPreferenceWaitingTask(new Runnable() { // from class: com.reyun.solar.engine.k0
                @Override // java.lang.Runnable
                public final void run() {
                    SolarEngine.getInstance().getSuperProperty().setSuperProperties(str, f10);
                }
            });
        }
    }

    public void setSuperProperties(Context context, final String str, final int i10) {
        OpenApiLogger.apiInvokedLog("SolarEngine", "setSuperProperties", new OpenApiLogger.ParamBuilder().add(com.thinkup.core.common.d0.q.d.f67742m, str).add("value", Integer.valueOf(i10)));
        if (SolarEngine.getInstance().isSharedPreferenceSuccess()) {
            SolarEngine.getInstance().getSuperProperty().setSuperProperties(str, i10);
        } else {
            SolarEngine.getInstance().addSharedPreferenceWaitingTask(new Runnable() { // from class: com.reyun.solar.engine.s
                @Override // java.lang.Runnable
                public final void run() {
                    SolarEngine.getInstance().getSuperProperty().setSuperProperties(str, i10);
                }
            });
        }
    }

    public void setSuperProperties(Context context, final String str, final long j10) {
        OpenApiLogger.apiInvokedLog("SolarEngine", "setSuperProperties", new OpenApiLogger.ParamBuilder().add(com.thinkup.core.common.d0.q.d.f67742m, str).add("value", Long.valueOf(j10)));
        if (SolarEngine.getInstance().isSharedPreferenceSuccess()) {
            SolarEngine.getInstance().getSuperProperty().setSuperProperties(str, j10);
        } else {
            SolarEngine.getInstance().addSharedPreferenceWaitingTask(new Runnable() { // from class: com.reyun.solar.engine.o
                @Override // java.lang.Runnable
                public final void run() {
                    SolarEngine.getInstance().getSuperProperty().setSuperProperties(str, j10);
                }
            });
        }
    }

    public void setSuperProperties(Context context, final String str, final String str2) {
        OpenApiLogger.apiInvokedLog("SolarEngine", "setSuperProperties", new OpenApiLogger.ParamBuilder().add(com.thinkup.core.common.d0.q.d.f67742m, str).add("value", str2));
        if (SolarEngine.getInstance().isSharedPreferenceSuccess()) {
            SolarEngine.getInstance().getSuperProperty().setSuperProperties(str, str2);
        } else {
            SolarEngine.getInstance().addSharedPreferenceWaitingTask(new Runnable() { // from class: com.reyun.solar.engine.c
                @Override // java.lang.Runnable
                public final void run() {
                    SolarEngine.getInstance().getSuperProperty().setSuperProperties(str, str2);
                }
            });
        }
    }

    public void setSuperProperties(Context context, final String str, final JSONArray jSONArray) {
        OpenApiLogger.apiInvokedLog("SolarEngine", "setSuperProperties", new OpenApiLogger.ParamBuilder().add(com.thinkup.core.common.d0.q.d.f67742m, str).add("value", jSONArray));
        if (SolarEngine.getInstance().isSharedPreferenceSuccess()) {
            SolarEngine.getInstance().getSuperProperty().setSuperProperties(str, jSONArray);
        } else {
            SolarEngine.getInstance().addSharedPreferenceWaitingTask(new Runnable() { // from class: com.reyun.solar.engine.v
                @Override // java.lang.Runnable
                public final void run() {
                    SolarEngine.getInstance().getSuperProperty().setSuperProperties(str, jSONArray);
                }
            });
        }
    }

    public void setSuperProperties(Context context, final String str, final JSONObject jSONObject) {
        OpenApiLogger.apiInvokedLog("SolarEngine", "setSuperProperties", new OpenApiLogger.ParamBuilder().add(com.thinkup.core.common.d0.q.d.f67742m, str).add("value", jSONObject));
        if (SolarEngine.getInstance().isSharedPreferenceSuccess()) {
            SolarEngine.getInstance().getSuperProperty().setSuperProperties(str, jSONObject);
        } else {
            SolarEngine.getInstance().addSharedPreferenceWaitingTask(new Runnable() { // from class: com.reyun.solar.engine.e0
                @Override // java.lang.Runnable
                public final void run() {
                    SolarEngine.getInstance().getSuperProperty().setSuperProperties(str, jSONObject);
                }
            });
        }
    }

    public void setSuperProperties(Context context, final String str, final boolean z10) {
        OpenApiLogger.apiInvokedLog("SolarEngine", "setSuperProperties", new OpenApiLogger.ParamBuilder().add(com.thinkup.core.common.d0.q.d.f67742m, str).add("value", Boolean.valueOf(z10)));
        if (SolarEngine.getInstance().isSharedPreferenceSuccess()) {
            SolarEngine.getInstance().getSuperProperty().setSuperProperties(str, z10);
        } else {
            SolarEngine.getInstance().addSharedPreferenceWaitingTask(new Runnable() { // from class: com.reyun.solar.engine.e
                @Override // java.lang.Runnable
                public final void run() {
                    SolarEngine.getInstance().getSuperProperty().setSuperProperties(str, z10);
                }
            });
        }
    }

    public void eventFinish(String str, JSONObject jSONObject) {
        OpenApiLogger.apiInvokedLog("SolarEngine", "eventFinish", new OpenApiLogger.ParamBuilder().add("eventName", str).add("customProperties", jSONObject));
        if (TextUtils.isEmpty(str)) {
            SolarEngineLogger.warn("SolarEngine", "eventName is null, [eventFinish] event will not be tracked.");
            return;
        }
        final TrackEvent trackEvent = new TrackEvent(EventType.TRACK_EVENT_TYPE_TIMER_EVENT, str, null, null, jSONObject);
        trackEvent.setDuration(TimerEventManager.getDuration(str));
        track(new Runnable() { // from class: com.reyun.solar.engine.i
            @Override // java.lang.Runnable
            public final void run() {
                SolarEngine.getInstance().getTrackManager().trackEvent(SolarEngineEventFactory.createSolarEngineTimerEvent(trackEvent));
            }
        });
    }

    public void trackAppAdShowStart(final SEAppAdShowStartModel sEAppAdShowStartModel, final StrategyBuilder strategyBuilder) {
        OpenApiLogger.apiInvokedLog("SolarEngine", "trackAppAdShowStart", new OpenApiLogger.ParamBuilder().add("appAdShowStartModel", sEAppAdShowStartModel).add("strategy", strategyBuilder));
        if (sEAppAdShowStartModel == null) {
            SolarEngineLogger.warn("SolarEngine", "appAdShowStartModel is null, [trackAppAdShowStart] event will not be tracked.");
            return;
        }
        Runnable runnable = new Runnable() { // from class: com.reyun.solar.engine.n0
            @Override // java.lang.Runnable
            public final void run() {
                SolarEnginePartnerManager.getInstance().trackAppAdShowStart(sEAppAdShowStartModel, strategyBuilder);
            }
        };
        if (SolarEngine.getInstance().isInitSuccess()) {
            ExecutorManager.executorCommon(runnable);
        } else {
            SolarEngine.getInstance().addWaitingTask(runnable);
        }
    }

    @Deprecated
    public void track(final TrackEvent trackEvent) {
        OpenApiLogger.apiInvokedLog("SolarEngine", "track", new OpenApiLogger.ParamBuilder().add("trackEvent", trackEvent));
        if (trackEvent == null) {
            SolarEngineLogger.warn("SolarEngine", "trackEvent is null, [track] event will not be tracked.");
        } else {
            track(new Runnable() { // from class: com.reyun.solar.engine.q0
                @Override // java.lang.Runnable
                public final void run() {
                    SolarEngine.getInstance().getTrackManager().trackEvent(SolarEngineEventFactory.createSolarEngineEvent(trackEvent));
                }
            });
        }
    }

    private void track(Runnable runnable) {
        if (SolarEngine.getInstance().isInitSuccess()) {
            ExecutorManager.executeTrackEvent(runnable);
        } else {
            SolarEngine.getInstance().addWaitingTask(runnable);
        }
    }

    public void track(String str, double d10, String str2, String str3, String str4, String str5, int i10, int i11, String str6, JSONObject jSONObject) {
        OpenApiLogger.apiInvokedLog("SolarEngine", "track", new OpenApiLogger.ParamBuilder().add("orderId", str).add("payAmount", Double.valueOf(d10)).add("currencyType", str2).add("payType", str3).add("productId", str4).add("productName", str5).add("productNum", Integer.valueOf(i10)).add("payStatus", Integer.valueOf(i11)).add("failReason", str6).add("customProperties", jSONObject));
        trackPurchase(new SEPurchaseEventModel(str, d10, str2, str3, str4, str5, i10, i11, str6, jSONObject));
    }

    public void track(String str, double d10, String str2, String str3, String str4, JSONObject jSONObject) {
        OpenApiLogger.apiInvokedLog("SolarEngine", "track", new OpenApiLogger.ParamBuilder().add("orderId", str).add("payAmount", Double.valueOf(d10)).add("currencyType", str2).add("payType", str3).add("status", str4).add("customProperties", jSONObject));
        trackOrder(new SEOrderEventModel(str, d10, str2, str3, str4, jSONObject));
    }

    public void track(String str, String str2, int i10, String str3, String str4, double d10, String str5, boolean z10, JSONObject jSONObject) {
        OpenApiLogger.apiInvokedLog("SolarEngine", "track", new OpenApiLogger.ParamBuilder().add("adNetworkPlatform", str).add("mediationPlatform", str2).add("adType", Integer.valueOf(i10)).add("adNetworkAppID", str3).add("adNetworkADID", str4).add("ecpm", Double.valueOf(d10)).add("currencyType", str5).add("isRenderSuccess", Boolean.valueOf(z10)).add("customProperties", jSONObject));
        trackAdImpression(new SEAdImpEventModel(str, str2, i10, str3, str4, d10, str5, z10, jSONObject));
    }

    public void track(String str, String str2, int i10, String str3, JSONObject jSONObject) {
        OpenApiLogger.apiInvokedLog("SolarEngine", "track", new OpenApiLogger.ParamBuilder().add("adPlatform", str).add("mediationPlatform", str2).add("adType", Integer.valueOf(i10)).add("adNetworkADID", str3).add("customProperties", jSONObject));
        trackAdClick(new SEAdClickEventModel(str, str2, i10, str3, jSONObject));
    }

    public void track(final SECustomEventModel sECustomEventModel) {
        OpenApiLogger.apiInvokedLog("SolarEngine", "track", new OpenApiLogger.ParamBuilder().add("seCustomEventModel", sECustomEventModel));
        if (sECustomEventModel == null) {
            SolarEngineLogger.warn("SolarEngine", "seCustomEventModel is null, [CustomEvent] event will not be tracked.");
        } else {
            track(new Runnable() { // from class: com.reyun.solar.engine.p0
                @Override // java.lang.Runnable
                public final void run() {
                    SolarEngine.getInstance().getTrackManager().trackEvent(SolarEngineEventFactory.createSolarEngineEventCustom(sECustomEventModel));
                }
            });
        }
    }

    public void track(String str, JSONObject jSONObject) {
        OpenApiLogger.apiInvokedLog("SolarEngine", "track", new OpenApiLogger.ParamBuilder().add("customEventName", str).add("customEventData", jSONObject));
        track(new SECustomEventModel(str, null, jSONObject));
    }

    public void track(String str, JSONObject jSONObject, JSONObject jSONObject2) {
        OpenApiLogger.apiInvokedLog("SolarEngine", "track", new OpenApiLogger.ParamBuilder().add("customEventName", str).add("customEventData", jSONObject).add("preEventData", jSONObject2));
        track(new SECustomEventModel(str, jSONObject2, jSONObject));
    }

    public void trackAppAdShowEnd(final SEAppAdShowEndModel sEAppAdShowEndModel, final StrategyBuilder strategyBuilder) {
        OpenApiLogger.apiInvokedLog("SolarEngine", "trackAppAdShowEnd", new OpenApiLogger.ParamBuilder().add("appAdShowEndModel", sEAppAdShowEndModel).add("strategy", strategyBuilder));
        if (sEAppAdShowEndModel == null) {
            SolarEngineLogger.warn("SolarEngine", "appAdShowEndModel is null, [trackAppAdShowEnd] event will not be tracked.");
            return;
        }
        Runnable runnable = new Runnable() { // from class: com.reyun.solar.engine.f0
            @Override // java.lang.Runnable
            public final void run() {
                SolarEnginePartnerManager.getInstance().trackAppAdShowEnd(sEAppAdShowEndModel, strategyBuilder);
            }
        };
        if (SolarEngine.getInstance().isInitSuccess()) {
            ExecutorManager.executorCommon(runnable);
        } else {
            SolarEngine.getInstance().addWaitingTask(runnable);
        }
    }
}