package com.thinkup.core.common.dq.dd;

import android.graphics.Bitmap;
import android.text.TextUtils;
import com.thinkup.core.api.BaseAd;
import com.thinkup.core.api.TUCustomLoadListener;
import com.thinkup.core.api.TUCustomLoadListenerExt;
import com.thinkup.core.common.dm.nq;
import com.thinkup.core.common.o.nd;
import com.thinkup.core.common.res.q;

/* JADX INFO: loaded from: classes7.dex */
public final class n implements TUCustomLoadListenerExt {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final TUCustomLoadListener f68847d;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final com.thinkup.core.common.dq.o.m f68848m;

    public n(TUCustomLoadListener tUCustomLoadListener, com.thinkup.core.common.dq.o.m mVar) {
        this.f68848m = mVar;
        this.f68847d = tUCustomLoadListener;
    }

    @Override // com.thinkup.core.api.TUCustomLoadListener
    public final void onAdCacheLoaded(BaseAd... baseAdArr) {
        final BaseAd baseAd;
        com.thinkup.core.common.dq.o.m mVar = this.f68848m;
        if (mVar == null || !mVar.m0()) {
            TUCustomLoadListener tUCustomLoadListener = this.f68847d;
            if (tUCustomLoadListener != null) {
                tUCustomLoadListener.onAdCacheLoaded(new BaseAd[0]);
                return;
            }
            return;
        }
        if (baseAdArr == null || baseAdArr.length <= 0 || (baseAd = baseAdArr[0]) == null) {
            TUCustomLoadListener tUCustomLoadListener2 = this.f68847d;
            if (tUCustomLoadListener2 != null) {
                tUCustomLoadListener2.onAdLoadError("10011", "load fail with no adObject");
                return;
            }
            return;
        }
        this.f68848m.d(baseAd.getNetworkInfoMap());
        boolean zEquals = String.valueOf(this.f68848m.q()).equals("2") ? ((String) this.f68848m.d("size", "")).equals(nq.f68546n) : true;
        if (TextUtils.isEmpty(baseAd.getMainImageUrl()) && baseAd.getAdMediaView(new Object[0]) == null && zEquals) {
            TUCustomLoadListener tUCustomLoadListener3 = this.f68847d;
            if (tUCustomLoadListener3 != null) {
                tUCustomLoadListener3.onAdLoadError("10012", "load fail with no main image.");
                return;
            }
            return;
        }
        if (TextUtils.isEmpty(baseAd.getMainImageUrl())) {
            this.f68847d.onAdCacheLoaded(new o(baseAd, this.f68848m.d()));
        } else if (baseAd.getAdMediaView(new Object[0]) == null) {
            com.thinkup.core.common.res.m.d(nd.m().dd()).d(new q(2, baseAd.getMainImageUrl()), 0, 0, new com.thinkup.core.common.res.m.d() { // from class: com.thinkup.core.common.dq.dd.n.1
                @Override // com.thinkup.core.common.res.m.d
                public final void onFail(String str, String str2) {
                    if (n.this.f68847d != null) {
                        n.this.f68847d.onAdLoadError("10011", "load image fail:".concat(String.valueOf(str2)));
                    }
                }

                @Override // com.thinkup.core.common.res.m.d
                public final void onSuccess(String str, Bitmap bitmap) {
                    if (!TextUtils.equals(str, baseAd.getMainImageUrl()) || n.this.f68847d == null) {
                        return;
                    }
                    n.this.f68847d.onAdCacheLoaded(new o(baseAd, n.this.f68848m.d()));
                }
            });
        } else {
            this.f68847d.onAdCacheLoaded(new o(baseAd, this.f68848m.d()));
        }
    }

    @Override // com.thinkup.core.api.TUCustomLoadListener
    public final void onAdDataLoaded() {
        TUCustomLoadListener tUCustomLoadListener = this.f68847d;
        if (tUCustomLoadListener != null) {
            tUCustomLoadListener.onAdDataLoaded();
        }
    }

    @Override // com.thinkup.core.api.TUCustomLoadListenerExt
    public final void onAdDataLoadedWithAds(BaseAd... baseAdArr) {
        TUCustomLoadListener tUCustomLoadListener = this.f68847d;
        if (tUCustomLoadListener instanceof TUCustomLoadListenerExt) {
            ((TUCustomLoadListenerExt) tUCustomLoadListener).onAdDataLoadedWithAds(baseAdArr);
        }
    }

    @Override // com.thinkup.core.api.TUCustomLoadListener
    public final void onAdLoadError(String str, String str2) {
        TUCustomLoadListener tUCustomLoadListener = this.f68847d;
        if (tUCustomLoadListener != null) {
            tUCustomLoadListener.onAdLoadError(str, str2);
        }
    }
}