package com.thinkup.core.common.dq.dd;

import android.graphics.Bitmap;
import android.text.TextUtils;
import com.thinkup.core.api.BaseAd;
import com.thinkup.core.api.TUBiddingListener;
import com.thinkup.core.api.TUBiddingListenerExt;
import com.thinkup.core.api.TUBiddingResult;
import com.thinkup.core.common.dm.nq;
import com.thinkup.core.common.o.nd;
import com.thinkup.core.common.res.q;

/* JADX INFO: loaded from: classes7.dex */
public final class m implements TUBiddingListenerExt {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final TUBiddingListener f68842d;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final com.thinkup.core.common.dq.o.m f68843m;

    public m(TUBiddingListener tUBiddingListener, com.thinkup.core.common.dq.o.m mVar) {
        this.f68842d = tUBiddingListener;
        this.f68843m = mVar;
    }

    @Override // com.thinkup.core.api.TUBiddingListener
    public final void onC2SBidResult(TUBiddingResult tUBiddingResult) {
        TUBiddingListener tUBiddingListener = this.f68842d;
        if (tUBiddingListener != null) {
            tUBiddingListener.onC2SBidResult(tUBiddingResult);
        }
    }

    @Override // com.thinkup.core.api.TUBiddingListener
    public final void onC2SBiddingResultWithCache(final TUBiddingResult tUBiddingResult, final BaseAd baseAd) {
        com.thinkup.core.common.dq.o.m mVar;
        if (!tUBiddingResult.isSuccessWithUseType() || (mVar = this.f68843m) == null || !mVar.m0()) {
            TUBiddingListener tUBiddingListener = this.f68842d;
            if (tUBiddingListener != null) {
                tUBiddingListener.onC2SBiddingResultWithCache(tUBiddingResult, baseAd);
                return;
            }
            return;
        }
        if (baseAd == null) {
            TUBiddingListener tUBiddingListener2 = this.f68842d;
            if (tUBiddingListener2 != null) {
                tUBiddingListener2.onC2SBiddingResultWithCache(TUBiddingResult.fail("load fail with no adObject"), null);
                return;
            }
            return;
        }
        boolean zEquals = String.valueOf(this.f68843m.q()).equals("2") ? ((String) this.f68843m.d("size", "")).equals(nq.f68546n) : true;
        this.f68843m.d(baseAd.getNetworkInfoMap());
        if (TextUtils.isEmpty(baseAd.getMainImageUrl()) && baseAd.getAdMediaView(new Object[0]) == null && zEquals) {
            TUBiddingListener tUBiddingListener3 = this.f68842d;
            if (tUBiddingListener3 != null) {
                tUBiddingListener3.onC2SBiddingResultWithCache(TUBiddingResult.fail("load fail with no main image."), null);
                return;
            }
            return;
        }
        if (!TextUtils.isEmpty(baseAd.getMainImageUrl())) {
            com.thinkup.core.common.res.m.d(nd.m().dd()).d(new q(2, baseAd.getMainImageUrl()), 0, 0, new com.thinkup.core.common.res.m.d() { // from class: com.thinkup.core.common.dq.dd.m.1
                @Override // com.thinkup.core.common.res.m.d
                public final void onFail(String str, String str2) {
                    if (m.this.f68842d != null) {
                        m.this.f68842d.onC2SBiddingResultWithCache(TUBiddingResult.fail("load image failed: ".concat(String.valueOf(str2))), null);
                    }
                }

                @Override // com.thinkup.core.common.res.m.d
                public final void onSuccess(String str, Bitmap bitmap) {
                    if (!TextUtils.equals(str, baseAd.getMainImageUrl()) || m.this.f68842d == null) {
                        return;
                    }
                    m.this.f68842d.onC2SBiddingResultWithCache(tUBiddingResult, new o(baseAd, m.this.f68843m.d()));
                }
            });
            return;
        }
        TUBiddingListener tUBiddingListener4 = this.f68842d;
        if (tUBiddingListener4 != null) {
            tUBiddingListener4.onC2SBiddingResultWithCache(tUBiddingResult, new o(baseAd, this.f68843m.d()));
        }
    }

    @Override // com.thinkup.core.api.TUBiddingListenerExt
    public final void onC2SBiddingResultWithData(TUBiddingResult tUBiddingResult, BaseAd baseAd) {
        TUBiddingListener tUBiddingListener = this.f68842d;
        if (tUBiddingListener instanceof TUBiddingListenerExt) {
            ((TUBiddingListenerExt) tUBiddingListener).onC2SBiddingResultWithData(tUBiddingResult, baseAd);
        }
    }
}