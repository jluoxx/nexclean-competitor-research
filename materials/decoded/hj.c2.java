package hj;

import android.app.Application;
import com.thinkup.core.api.AdError;
import com.thinkup.core.api.TUAdInfo;
import com.thinkup.core.api.TUAdSourceStatusListener;
import com.thinkup.core.api.TUAdStatusInfo;
import com.thinkup.rewardvideo.api.TURewardVideoAd;
import com.thinkup.rewardvideo.api.TURewardVideoListener;
import java.util.Map;

/* JADX INFO: loaded from: classes7.dex */
public final class c2 extends s {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public TURewardVideoAd f83528b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public String f83529c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public String f83530d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public double f83531e;

    public static final class a implements TURewardVideoListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ String f83532a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ c2 f83533b;

        public a(c2 c2Var, String str) {
            this.f83532a = str;
            this.f83533b = c2Var;
        }

        @Override // com.thinkup.rewardvideo.api.TURewardVideoListener
        public final void onReward(TUAdInfo tUAdInfo) {
            u2 u2Var = this.f83533b.f83715a;
            if (u2Var != null) {
                u2Var.d(1);
            }
        }

        @Override // com.thinkup.rewardvideo.api.TURewardVideoListener
        public final void onRewardedVideoAdClosed(TUAdInfo tUAdInfo) {
            u2 u2Var = this.f83533b.f83715a;
            if (u2Var != null) {
                u2Var.onAdClosed();
            }
        }

        @Override // com.thinkup.rewardvideo.api.TURewardVideoListener
        public final void onRewardedVideoAdFailed(AdError adError) {
            int i10 = 100;
            if (adError != null) {
                try {
                    String code = adError.getCode();
                    if (code != null) {
                        i10 = Integer.parseInt(code);
                    }
                } catch (Exception unused) {
                }
            }
            c2 c2Var = this.f83533b;
            String desc = adError != null ? adError.getDesc() : null;
            u2 u2Var = c2Var.f83715a;
            if (u2Var != null) {
                u2Var.i(i10, desc);
            }
        }

        @Override // com.thinkup.rewardvideo.api.TURewardVideoListener
        public final void onRewardedVideoAdLoaded() {
            TUAdStatusInfo tUAdStatusInfoCheckAdStatus;
            q1 q1VarA = r.f83668a.a(3);
            if (q1VarA instanceof c3) {
                if (((c3) q1VarA).f83535c.contains(this.f83532a)) {
                    c2 c2Var = this.f83533b;
                    int code = kj.c.E_91109.getCode();
                    u2 u2Var = c2Var.f83715a;
                    if (u2Var != null) {
                        u2Var.i(code, "E_91109");
                        return;
                    }
                    return;
                }
            }
            TURewardVideoAd tURewardVideoAd = this.f83533b.f83528b;
            TUAdInfo tUTopAdInfo = (tURewardVideoAd == null || (tUAdStatusInfoCheckAdStatus = tURewardVideoAd.checkAdStatus()) == null) ? null : tUAdStatusInfoCheckAdStatus.getTUTopAdInfo();
            c2 c2Var2 = this.f83533b;
            if (tUTopAdInfo == null) {
                u2 u2Var2 = c2Var2.f83715a;
                if (u2Var2 != null) {
                    u2Var2.i(2, "load failed");
                    return;
                }
                return;
            }
            c2Var2.f83530d = tUTopAdInfo.getAdsourceId();
            c2.g(this.f83533b);
            t2 t2Var = t2.f83703a;
            this.f83533b.f(tUTopAdInfo, t2Var.h(tUTopAdInfo) == 1 ? t2Var.i(tUTopAdInfo) : 0.0d);
            c2 c2Var3 = this.f83533b;
            int iH = t2Var.h(tUTopAdInfo);
            String networkPlacementId = tUTopAdInfo.getNetworkPlacementId();
            u2 u2Var3 = c2Var3.f83715a;
            if (u2Var3 != null) {
                u2Var3.f(iH, networkPlacementId);
            }
            u2 u2Var4 = this.f83533b.f83715a;
            if (u2Var4 != null) {
                u2Var4.c();
            }
            t2Var.c(this.f83532a, 4);
        }

        @Override // com.thinkup.rewardvideo.api.TURewardVideoListener
        public final void onRewardedVideoAdPlayClicked(TUAdInfo tUAdInfo) {
            u2 u2Var = this.f83533b.f83715a;
            if (u2Var != null) {
                u2Var.onAdClicked();
            }
        }

        @Override // com.thinkup.rewardvideo.api.TURewardVideoListener
        public final void onRewardedVideoAdPlayEnd(TUAdInfo tUAdInfo) {
        }

        @Override // com.thinkup.rewardvideo.api.TURewardVideoListener
        public final void onRewardedVideoAdPlayFailed(AdError adError, TUAdInfo tUAdInfo) {
            int i10 = 100;
            if (adError != null) {
                try {
                    String code = adError.getCode();
                    if (code != null) {
                        i10 = Integer.parseInt(code);
                    }
                } catch (Exception unused) {
                }
            }
            c2 c2Var = this.f83533b;
            String desc = adError != null ? adError.getDesc() : null;
            u2 u2Var = c2Var.f83715a;
            if (u2Var != null) {
                u2Var.e(i10, desc);
            }
        }

        @Override // com.thinkup.rewardvideo.api.TURewardVideoListener
        public final void onRewardedVideoAdPlayStart(TUAdInfo tUAdInfo) {
            u2 u2Var = this.f83533b.f83715a;
            if (u2Var != null) {
                u2Var.a();
            }
            w2 w2VarB = t2.f83703a.b(tUAdInfo, this.f83533b.f83531e);
            u2 u2Var2 = this.f83533b.f83715a;
            if (u2Var2 != null) {
                u2Var2.h(w2VarB);
            }
        }
    }

    public static final class b implements TUAdSourceStatusListener {
        public b() {
        }

        @Override // com.thinkup.core.api.TUAdSourceStatusListener
        public final void onAdSourceAttempt(TUAdInfo tUAdInfo) {
            u2 u2Var;
            if (tUAdInfo != null) {
                c2 c2Var = c2.this;
                if (!t2.f83703a.j(tUAdInfo) || (u2Var = c2Var.f83715a) == null) {
                    return;
                }
                u2Var.b();
            }
        }

        @Override // com.thinkup.core.api.TUAdSourceStatusListener
        public final void onAdSourceBiddingAttempt(TUAdInfo tUAdInfo) {
        }

        @Override // com.thinkup.core.api.TUAdSourceStatusListener
        public final void onAdSourceBiddingFail(TUAdInfo tUAdInfo, AdError adError) {
            u2 u2Var;
            if (tUAdInfo != null) {
                c2 c2Var = c2.this;
                if (!t2.f83703a.d(tUAdInfo.getNetworkFirmId()) || (u2Var = c2Var.f83715a) == null) {
                    return;
                }
                u2Var.b();
            }
        }

        @Override // com.thinkup.core.api.TUAdSourceStatusListener
        public final void onAdSourceBiddingFilled(TUAdInfo tUAdInfo) {
        }

        @Override // com.thinkup.core.api.TUAdSourceStatusListener
        public final void onAdSourceLoadFail(TUAdInfo tUAdInfo, AdError adError) {
        }

        @Override // com.thinkup.core.api.TUAdSourceStatusListener
        public final void onAdSourceLoadFilled(TUAdInfo tUAdInfo) {
        }
    }

    public c2(u2 u2Var) {
        super(u2Var);
        this.f83529c = "";
        this.f83530d = "";
    }

    public static final void g(c2 c2Var) {
        c2Var.getClass();
        q1 q1VarA = r.f83668a.a(3);
        if (q1VarA instanceof c3) {
            ((c3) q1VarA).f83535c.add(c2Var.f83529c);
        }
    }

    @Override // hj.s
    public final boolean a() {
        TUAdStatusInfo tUAdStatusInfoCheckAdStatus;
        TURewardVideoAd tURewardVideoAd = this.f83528b;
        TUAdInfo tUTopAdInfo = (tURewardVideoAd == null || (tUAdStatusInfoCheckAdStatus = tURewardVideoAd.checkAdStatus()) == null) ? null : tUAdStatusInfoCheckAdStatus.getTUTopAdInfo();
        if (p003kotlin.jvm.internal.v.c(this.f83530d, tUTopAdInfo != null ? tUTopAdInfo.getAdsourceId() : null) || tUTopAdInfo == null) {
            return false;
        }
        this.f83530d = tUTopAdInfo.getAdsourceId();
        t2 t2Var = t2.f83703a;
        f(tUTopAdInfo, t2Var.h(tUTopAdInfo) == 1 ? t2Var.i(tUTopAdInfo) : 0.0d);
        int iH = t2Var.h(tUTopAdInfo);
        String networkPlacementId = tUTopAdInfo.getNetworkPlacementId();
        u2 u2Var = this.f83715a;
        if (u2Var != null) {
            u2Var.f(iH, networkPlacementId);
        }
        return true;
    }

    @Override // hj.s
    public final void b(String str, Map map) {
        fl.m0 m0Var;
        this.f83529c = str;
        Application applicationC = ij.a.c();
        if (applicationC != null) {
            t2.f83703a.c(str, 4);
            TURewardVideoAd tURewardVideoAd = this.f83528b;
            if (tURewardVideoAd == null) {
                TURewardVideoAd tURewardVideoAd2 = new TURewardVideoAd(applicationC, this.f83529c);
                this.f83528b = tURewardVideoAd2;
                if (!tURewardVideoAd2.isAdReady()) {
                    h();
                }
                TURewardVideoAd tURewardVideoAd3 = this.f83528b;
                if (tURewardVideoAd3 != null) {
                    tURewardVideoAd3.setAdListener(new a(this, str));
                }
                TURewardVideoAd tURewardVideoAd4 = this.f83528b;
                if (tURewardVideoAd4 != null) {
                    tURewardVideoAd4.setAdSourceStatusListener(new b());
                }
            } else if (!tURewardVideoAd.isAdReady()) {
                h();
            }
            TURewardVideoAd tURewardVideoAd5 = this.f83528b;
            if (tURewardVideoAd5 != null) {
                tURewardVideoAd5.load();
                m0Var = fl.m0.f80959a;
            } else {
                m0Var = null;
            }
            if (m0Var != null) {
                return;
            }
        }
        int code = kj.c.E_91108.getCode();
        u2 u2Var = this.f83715a;
        if (u2Var != null) {
            u2Var.i(code, "E_91108");
        }
    }

    @Override // hj.s
    public final void c() {
        TURewardVideoAd tURewardVideoAd = this.f83528b;
        if (tURewardVideoAd != null) {
            tURewardVideoAd.setAdListener(null);
        }
        this.f83528b = null;
    }

    @Override // hj.s
    public final Boolean d() {
        TUAdStatusInfo tUAdStatusInfoCheckAdStatus;
        TURewardVideoAd tURewardVideoAd = this.f83528b;
        boolean z10 = true;
        if (tURewardVideoAd == null || (tUAdStatusInfoCheckAdStatus = tURewardVideoAd.checkAdStatus()) == null || !tUAdStatusInfoCheckAdStatus.isReady()) {
            h();
        }
        TURewardVideoAd tURewardVideoAd2 = this.f83528b;
        if (tURewardVideoAd2 != null && tURewardVideoAd2.isAdReady()) {
            z10 = false;
        }
        return Boolean.valueOf(z10);
    }

    @Override // hj.s
    public final void e() {
        h();
    }

    public final void f(TUAdInfo tUAdInfo, double d10) {
        if (tUAdInfo != null) {
            if (t2.f83703a.d(tUAdInfo.getNetworkFirmId())) {
                u2 u2Var = this.f83715a;
                if (u2Var != null) {
                    u2Var.g(d10);
                }
                this.f83531e = d10;
                return;
            }
            double ecpm = tUAdInfo.getEcpm();
            u2 u2Var2 = this.f83715a;
            if (u2Var2 != null) {
                u2Var2.g(ecpm);
            }
        }
    }

    public final void h() {
        q1 q1VarA = r.f83668a.a(3);
        if (q1VarA instanceof c3) {
            ((c3) q1VarA).f83535c.remove(this.f83529c);
        }
    }
}