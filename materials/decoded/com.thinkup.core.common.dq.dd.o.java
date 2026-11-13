package com.thinkup.core.common.dq.dd;

import android.graphics.Bitmap;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.thinkup.core.api.BaseAd;
import com.thinkup.core.api.ITUAdvertiserInfoOperate;
import com.thinkup.core.api.TUAdAppInfo;
import com.thinkup.core.api.TUCompViewListener;
import com.thinkup.core.api.TUCustomVideo;
import com.thinkup.core.api.TUNativeAdInfo;
import com.thinkup.core.api.TUShakeViewListener;
import com.thinkup.core.common.dq;
import com.thinkup.core.common.inner.ui.thirdparty.ThirdPartyMediaView;
import com.thinkup.core.common.nn.mo;
import com.thinkup.core.common.o.mm;
import com.thinkup.core.q.m0;
import com.thinkup.network.admob.GoogleAdTUConst;
import com.tradplus.ads.base.util.AppKeyManager;
import java.io.Serializable;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes7.dex */
public final class o extends BaseAd implements d, Serializable {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f68851d;

    /* JADX INFO: renamed from: d0, reason: collision with root package name */
    private BaseAd f68852d0;

    /* JADX INFO: renamed from: dd, reason: collision with root package name */
    private Map<String, Object> f68853dd;

    /* JADX INFO: renamed from: dm, reason: collision with root package name */
    private View f68854dm;

    /* JADX INFO: renamed from: dn, reason: collision with root package name */
    private int f68855dn;

    /* JADX INFO: renamed from: do, reason: not valid java name */
    private int f115do;

    /* JADX INFO: renamed from: dq, reason: collision with root package name */
    private int f68856dq;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private int f68857m;

    /* JADX INFO: renamed from: m0, reason: collision with root package name */
    private volatile ThirdPartyMediaView f68858m0;

    /* JADX INFO: renamed from: md, reason: collision with root package name */
    private final Object f68859md = new Object();

    /* JADX INFO: renamed from: mm, reason: collision with root package name */
    private int f68860mm;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private int f68861n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private int f68862o;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private int f68863q;

    public o(BaseAd baseAd, Map<String, Object> map) {
        this.f68851d = 1;
        this.f68857m = 5;
        this.f68861n = 1;
        this.f68863q = 5;
        this.f68860mm = 1;
        this.f68852d0 = baseAd;
        this.f68853dd = map;
        this.f68851d = mo.d(map, GoogleAdTUConst.KEY_ORIENTATION, 1);
        this.f68857m = mo.d(map, AppKeyManager.KEY_COUNTDOWN, 5);
        this.f68861n = mo.d(map, "allows_skip", 1);
        this.f68860mm = mo.d(map, dq.mmn, 1);
        this.f68862o = ((Integer) mo.d(this.f68853dd, dq.mmq, 3)).intValue();
        int iD = mo.d(map, "s_c_t", 0);
        if (iD >= 0) {
            this.f68863q = iD;
        }
        this.f68856dq = mo.d(map, "c_b_i_r", 0);
        this.f68855dn = 1;
        try {
            Object obj = map.get("render_type");
            if (obj != null) {
                this.f68855dn = Integer.parseInt(obj.toString());
            }
            Object obj2 = map.get("template_type");
            if (obj != null) {
                this.f115do = Integer.parseInt(obj2.toString());
            }
        } catch (Throwable unused) {
        }
    }

    private void d(Map<String, Object> map) {
        this.f68851d = mo.d(map, GoogleAdTUConst.KEY_ORIENTATION, 1);
        this.f68857m = mo.d(map, AppKeyManager.KEY_COUNTDOWN, 5);
        this.f68861n = mo.d(map, "allows_skip", 1);
        this.f68860mm = mo.d(map, dq.mmn, 1);
        this.f68862o = ((Integer) mo.d(this.f68853dd, dq.mmq, 3)).intValue();
        int iD = mo.d(map, "s_c_t", 0);
        if (iD >= 0) {
            this.f68863q = iD;
        }
        this.f68856dq = mo.d(map, "c_b_i_r", 0);
        this.f68855dn = 1;
        try {
            Object obj = map.get("render_type");
            if (obj != null) {
                this.f68855dn = Integer.parseInt(obj.toString());
            }
            Object obj2 = map.get("template_type");
            if (obj != null) {
                this.f115do = Integer.parseInt(obj2.toString());
            }
        } catch (Throwable unused) {
        }
    }

    private static void nm() {
    }

    private boolean nn() {
        return (o() == 0 || isNativeExpress()) ? false : true;
    }

    @Override // com.thinkup.core.api.BaseAd
    public final void clear(View view) {
        BaseAd baseAd = this.f68852d0;
        if (baseAd != null) {
            baseAd.clear(view);
        }
    }

    @Override // com.thinkup.core.common.dq.dd.d
    public final int d0() {
        return this.f68863q;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1 */
    /* JADX WARN: Type inference failed for: r0v13 */
    /* JADX WARN: Type inference failed for: r0v2, types: [int] */
    @Override // com.thinkup.core.common.dq.dd.d
    public final int dd() {
        ?? r10;
        Object obj;
        boolean zEquals;
        BaseAd baseAd = this.f68852d0;
        if (baseAd == null || baseAd.getDetail() == null || this.f68852d0.getDetail().dmo() != 8 || (obj = this.f68853dd.get("video_muted")) == null) {
            r10 = -1;
        } else {
            zEquals = TextUtils.equals(obj.toString(), "0");
        }
        if (r10 == -1) {
            r10 = zEquals;
            return mo.d(this.f68853dd, "video_muted", 0);
        }
        r10 = zEquals;
        return r10;
    }

    @Override // com.thinkup.core.api.BaseAd
    public final void destroy() {
        this.f68852d0.destroy();
    }

    @Override // com.thinkup.core.common.dq.dd.d
    public final int dm() {
        Map<String, Object> map = this.f68853dd;
        if (map == null || !map.containsKey(m0.d.dqn)) {
            return 1;
        }
        Object obj = this.f68853dd.get(m0.d.dqn);
        if (obj instanceof Integer) {
            return ((Integer) obj).intValue();
        }
        return 1;
    }

    @Override // com.thinkup.core.common.dq.dd.d
    public final int[] dn() {
        int[] iArr = {1, 2, 3, 4, 5};
        Map<String, Object> map = this.f68853dd;
        if (map != null && map.containsKey(m0.d.dqo)) {
            Object obj = this.f68853dd.get(m0.d.dqo);
            if (obj instanceof int[]) {
                return (int[]) obj;
            }
        }
        return iArr;
    }

    @Override // com.thinkup.core.common.dq.dd.d
    /* JADX INFO: renamed from: do */
    public final int mo247do() {
        return ((Integer) mo.d(this.f68853dd, dq.mnm, 0)).intValue();
    }

    @Override // com.thinkup.core.common.dq.dd.d
    public final int dq() {
        return ((Integer) mo.d(this.f68853dd, dq.mn0, 1)).intValue();
    }

    @Override // com.thinkup.core.api.ITUThirdPartyMaterial
    public final TUAdAppInfo getAdAppInfo() {
        return this.f68852d0.getAdAppInfo();
    }

    @Override // com.thinkup.core.api.ITUThirdPartyMaterial
    public final String getAdChoiceIconUrl() {
        return this.f68852d0.getAdChoiceIconUrl();
    }

    @Override // com.thinkup.core.api.ITUThirdPartyMaterial
    public final String getAdFrom() {
        return this.f68852d0.getAdFrom();
    }

    @Override // com.thinkup.core.api.ITUThirdPartyMaterial
    public final View getAdIconView() {
        BaseAd baseAd;
        if (this.f68854dm == null && (baseAd = this.f68852d0) != null) {
            this.f68854dm = baseAd.getAdIconView();
        }
        return this.f68854dm;
    }

    @Override // com.thinkup.core.api.ITUThirdPartyMaterial
    public final Bitmap getAdLogo() {
        return this.f68852d0.getAdLogo();
    }

    @Override // com.thinkup.core.api.ITUThirdPartyMaterial
    public final View getAdLogoView() {
        return this.f68852d0.getAdLogoView();
    }

    @Override // com.thinkup.core.api.ITUThirdPartyMaterial
    public final View getAdMediaView(Object... objArr) {
        if (o() == 0 || isNativeExpress()) {
            BaseAd baseAd = this.f68852d0;
            if (baseAd != null) {
                return baseAd.getAdMediaView(objArr);
            }
            return null;
        }
        if (this.f68858m0 == null) {
            synchronized (this.f68859md) {
                if (this.f68858m0 == null) {
                    try {
                        BaseAd baseAd2 = this.f68852d0;
                        View adMediaView = baseAd2 != null ? baseAd2.getAdMediaView(objArr) : null;
                        if (adMediaView != null) {
                            if (adMediaView.getParent() instanceof ViewGroup) {
                                ((ViewGroup) adMediaView.getParent()).removeView(adMediaView);
                            }
                            this.f68858m0 = new ThirdPartyMediaView(adMediaView.getContext());
                            this.f68858m0.setInterceptTouchEvent(true);
                            this.f68858m0.addView(adMediaView);
                        }
                    } catch (Throwable unused) {
                    }
                }
            }
        }
        return this.f68858m0;
    }

    @Override // com.thinkup.core.api.ITUThirdPartyMaterial
    public final String getAdType() {
        return this.f68852d0.getAdType();
    }

    @Override // com.thinkup.core.api.ITUThirdPartyMaterial
    public final ITUAdvertiserInfoOperate getAdvertiserInfoOperate() {
        BaseAd baseAd = this.f68852d0;
        if (baseAd != null) {
            return baseAd.getAdvertiserInfoOperate();
        }
        return null;
    }

    @Override // com.thinkup.core.api.ITUThirdPartyMaterial
    public final String getAdvertiserName() {
        return this.f68852d0.getAdvertiserName();
    }

    @Override // com.thinkup.core.api.ITUThirdPartyMaterial
    public final int getAppCommentNum() {
        return this.f68852d0.getAppCommentNum();
    }

    @Override // com.thinkup.core.api.ITUThirdPartyMaterial
    public final double getAppPrice() {
        return this.f68852d0.getAppPrice();
    }

    @Override // com.thinkup.core.api.ITUThirdPartyMaterial
    public final View getCallToActionButton() {
        return this.f68852d0.getCallToActionButton();
    }

    @Override // com.thinkup.core.api.ITUThirdPartyMaterial
    public final String getCallToActionText() {
        return this.f68852d0.getCallToActionText();
    }

    @Override // com.thinkup.core.api.BaseAd
    public final ViewGroup getCustomAdContainer() {
        return this.f68852d0.getCustomAdContainer();
    }

    @Override // com.thinkup.core.api.ITUThirdPartyMaterial
    public final String getDescriptionText() {
        return this.f68852d0.getDescriptionText();
    }

    @Override // com.thinkup.core.api.BaseAd
    public final com.thinkup.core.common.dm.m0 getDetail() {
        return this.f68852d0.getDetail();
    }

    @Override // com.thinkup.core.api.ITUThirdPartyMaterial
    public final String getDomain() {
        BaseAd baseAd = this.f68852d0;
        return baseAd != null ? baseAd.getDomain() : "";
    }

    @Override // com.thinkup.core.api.ITUThirdPartyMaterial
    public final int getDownloadProgress() {
        return this.f68852d0.getDownloadProgress();
    }

    @Override // com.thinkup.core.api.ITUThirdPartyMaterial
    public final int getDownloadStatus() {
        return this.f68852d0.getDownloadStatus();
    }

    @Override // com.thinkup.core.api.ITUThirdPartyMaterial
    public final String getIconImageUrl() {
        return this.f68852d0.getIconImageUrl();
    }

    @Override // com.thinkup.core.api.ITUThirdPartyMaterial
    public final List<String> getImageUrlList() {
        return this.f68852d0.getImageUrlList();
    }

    @Override // com.thinkup.core.api.ITUThirdPartyMaterial
    public final int getMainImageHeight() {
        return this.f68852d0.getMainImageHeight();
    }

    @Override // com.thinkup.core.api.ITUThirdPartyMaterial
    public final String getMainImageUrl() {
        return this.f68852d0.getMainImageUrl();
    }

    @Override // com.thinkup.core.api.ITUThirdPartyMaterial
    public final int getMainImageWidth() {
        return this.f68852d0.getMainImageWidth();
    }

    @Override // com.thinkup.core.api.ITUThirdPartyMaterial
    public final int getNativeAdInteractionType() {
        return this.f68852d0.getNativeAdInteractionType();
    }

    @Override // com.thinkup.core.api.ITUThirdPartyMaterial
    public final TUCustomVideo getNativeCustomVideo() {
        BaseAd baseAd = this.f68852d0;
        if (baseAd != null) {
            return baseAd.getNativeCustomVideo();
        }
        return null;
    }

    @Override // com.thinkup.core.api.ITUThirdPartyMaterial
    public final int getNativeExpressHeight() {
        return this.f68852d0.getNativeExpressHeight();
    }

    @Override // com.thinkup.core.api.ITUThirdPartyMaterial
    public final int getNativeExpressWidth() {
        return this.f68852d0.getNativeExpressWidth();
    }

    @Override // com.thinkup.core.api.ITUThirdPartyMaterial
    public final int getNativeType() {
        return this.f68852d0.getNativeType();
    }

    @Override // com.thinkup.core.api.BaseAd, com.thinkup.core.api.ITUThirdPartyMaterial
    public final Map<String, Object> getNetworkInfoMap() {
        return this.f68852d0.getNetworkInfoMap();
    }

    @Override // com.thinkup.core.api.ITUThirdPartyMaterial
    public final View getRoateView(Map<String, Object> map, TUCompViewListener tUCompViewListener) {
        BaseAd baseAd = this.f68852d0;
        if (baseAd != null) {
            return baseAd.getRoateView(map, tUCompViewListener);
        }
        return null;
    }

    @Override // com.thinkup.core.api.ITUThirdPartyMaterial
    public final View getShakeView(int i10, int i11, TUShakeViewListener tUShakeViewListener) {
        BaseAd baseAd = this.f68852d0;
        if (baseAd != null) {
            return baseAd.getShakeView(i10, i11, tUShakeViewListener);
        }
        return null;
    }

    @Override // com.thinkup.core.api.ITUThirdPartyMaterial
    public final View getSlideView(int i10, int i11, int i12, TUShakeViewListener tUShakeViewListener) {
        BaseAd baseAd = this.f68852d0;
        if (baseAd != null) {
            return baseAd.getSlideView(i10, i11, i12, tUShakeViewListener);
        }
        return null;
    }

    @Override // com.thinkup.core.api.ITUThirdPartyMaterial
    public final Double getStarRating() {
        return this.f68852d0.getStarRating();
    }

    @Override // com.thinkup.core.api.ITUThirdPartyMaterial
    public final String getTitle() {
        return this.f68852d0.getTitle();
    }

    @Override // com.thinkup.core.api.ITUThirdPartyMaterial
    public final double getVideoDuration() {
        return this.f68852d0.getVideoDuration();
    }

    @Override // com.thinkup.core.api.ITUThirdPartyMaterial
    public final int getVideoHeight() {
        return this.f68852d0.getVideoHeight();
    }

    @Override // com.thinkup.core.api.ITUThirdPartyMaterial
    public final double getVideoProgress() {
        return this.f68852d0.getVideoProgress();
    }

    @Override // com.thinkup.core.api.ITUThirdPartyMaterial
    public final String getVideoUrl() {
        return this.f68852d0.getVideoUrl();
    }

    @Override // com.thinkup.core.api.ITUThirdPartyMaterial
    public final int getVideoWidth() {
        return this.f68852d0.getVideoWidth();
    }

    @Override // com.thinkup.core.api.ITUThirdPartyMaterial
    public final String getWarning() {
        BaseAd baseAd = this.f68852d0;
        return baseAd != null ? baseAd.getWarning() : "";
    }

    @Override // com.thinkup.core.api.BaseAd
    public final boolean isNativeExpress() {
        BaseAd baseAd = this.f68852d0;
        if (baseAd != null) {
            return baseAd.isNativeExpress();
        }
        return false;
    }

    @Override // com.thinkup.core.common.dq.dd.d
    public final long m() {
        return this.f68857m;
    }

    @Override // com.thinkup.core.common.dq.dd.d
    public final int m0() {
        return ((Integer) mo.d(this.f68853dd, dq.mnn, 1)).intValue();
    }

    @Override // com.thinkup.core.common.dq.dd.d
    public final int md() {
        return ((Integer) mo.d(this.f68853dd, dq.mmd, 1)).intValue();
    }

    @Override // com.thinkup.core.common.dq.dd.d
    public final int mm() {
        return ((Integer) mo.d(this.f68853dd, dq.mmq, 3)).intValue();
    }

    @Override // com.thinkup.core.common.dq.dd.d
    public final int mn() {
        return ((Integer) mo.d(this.f68853dd, dq.mmm, 2)).intValue();
    }

    @Override // com.thinkup.core.common.dq.dd.d
    public final String mo() {
        return (String) mo.d(this.f68853dd, "size", "");
    }

    @Override // com.thinkup.core.common.dq.dd.d
    public final int mq() {
        if (this.f68855dn == 1) {
            return 3;
        }
        return this.f115do;
    }

    @Override // com.thinkup.core.common.dq.dd.d
    public final int n() {
        int i10 = this.f68861n;
        return (i10 != 1 && i10 == 0) ? 1 : 0;
    }

    public final boolean n0() {
        return mo247do() == 0;
    }

    public final boolean nd() {
        return this.f68860mm == 2;
    }

    @Override // com.thinkup.core.common.dq.dd.d
    public final int o() {
        int i10 = this.f68862o;
        if (i10 != 1) {
            return i10 != 2 ? 2 : 1;
        }
        return 0;
    }

    @Override // com.thinkup.core.api.BaseAd
    public final void pauseVideo() {
        BaseAd baseAd = this.f68852d0;
        if (baseAd != null) {
            baseAd.pauseVideo();
        }
    }

    @Override // com.thinkup.core.common.dq.dd.d
    public final int q() {
        return this.f68856dq;
    }

    @Override // com.thinkup.core.api.BaseAd
    public final void registerListener(View view, List<View> list, FrameLayout.LayoutParams layoutParams) {
        BaseAd baseAd = this.f68852d0;
        if (baseAd != null) {
            baseAd.registerListener(view, list, layoutParams);
        }
    }

    @Override // com.thinkup.core.api.BaseAd
    public final void resumeVideo() {
        BaseAd baseAd = this.f68852d0;
        if (baseAd != null) {
            baseAd.resumeVideo();
        }
    }

    @Override // com.thinkup.core.api.BaseAd
    public final void setDevParams(Map<String, Object> map) {
        BaseAd baseAd = this.f68852d0;
        if (baseAd != null) {
            baseAd.setDevParams(map);
        }
    }

    @Override // com.thinkup.core.api.BaseAd
    public final void setNativeEventListener(mm mmVar) {
        this.f68852d0.setNativeEventListener(mmVar);
    }

    @Override // com.thinkup.core.api.BaseAd
    public final void setNetworkInfoMap(Map<String, Object> map) {
        this.f68852d0.setNetworkInfoMap(map);
    }

    @Override // com.thinkup.core.api.BaseAd
    public final void setTrackingInfo(com.thinkup.core.common.dm.m0 m0Var) {
        this.f68852d0.setTrackingInfo(m0Var);
    }

    @Override // com.thinkup.core.api.BaseAd
    public final void setVideoMute(boolean z10) {
        BaseAd baseAd = this.f68852d0;
        if (baseAd != null) {
            baseAd.setVideoMute(z10);
        }
    }

    @Override // com.thinkup.core.api.ITUThirdPartyMaterial
    public final boolean supportSetPermissionClickViewList() {
        BaseAd baseAd = this.f68852d0;
        return baseAd != null && baseAd.supportSetPermissionClickViewList();
    }

    @Override // com.thinkup.core.api.ITUThirdPartyMaterial
    public final boolean supportSetPrivacyClickViewList() {
        BaseAd baseAd = this.f68852d0;
        return baseAd != null && baseAd.supportSetPrivacyClickViewList();
    }

    @Override // com.thinkup.core.api.BaseAd
    public final void registerListener(View view, List<View> list, FrameLayout.LayoutParams layoutParams, com.thinkup.core.basead.m.o oVar) {
        BaseAd baseAd = this.f68852d0;
        if (baseAd != null) {
            baseAd.registerListener(view, list, layoutParams, oVar);
        }
    }

    @Override // com.thinkup.core.api.BaseAd
    public final void registerListener(View view, TUNativeAdInfo.AdPrepareInfo adPrepareInfo) {
        BaseAd baseAd = this.f68852d0;
        if (baseAd != null) {
            baseAd.registerListener(view, adPrepareInfo);
        }
    }

    @Override // com.thinkup.core.common.dq.dd.d
    public final int d() {
        return this.f68851d;
    }

    private boolean d(Object... objArr) {
        return getAdMediaView(objArr) == null && TextUtils.isEmpty(getMainImageUrl());
    }
}