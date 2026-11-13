package hj;

import android.app.Activity;
import android.app.Application;
import com.thinkup.core.api.AdError;
import com.thinkup.core.api.TUAdInfo;
import com.thinkup.core.api.TUAdSourceStatusListener;
import com.thinkup.core.api.TUAdStatusInfo;
import com.thinkup.core.api.TUShowConfig;
import com.thinkup.interstitial.api.TUInterstitial;
import com.thinkup.interstitial.api.TUInterstitialListener;
import java.util.Map;

/* JADX INFO: loaded from: classes7.dex */
public final class b2 extends v1 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public TUInterstitial f83520b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public String f83521c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public String f83522d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public double f83523e;

    public static final class a implements TUAdSourceStatusListener {
        public a() {
        }

        @Override // com.thinkup.core.api.TUAdSourceStatusListener
        public final void onAdSourceAttempt(TUAdInfo tUAdInfo) {
            u2 u2Var;
            if (tUAdInfo != null) {
                b2 b2Var = b2.this;
                if (!t2.f83703a.j(tUAdInfo) || (u2Var = b2Var.f83715a) == null) {
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
                b2 b2Var = b2.this;
                if (!t2.f83703a.d(tUAdInfo.getNetworkFirmId()) || (u2Var = b2Var.f83715a) == null) {
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

    public static final class b implements TUInterstitialListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ String f83525a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ b2 f83526b;

        public b(b2 b2Var, String str) {
            this.f83525a = str;
            this.f83526b = b2Var;
        }

        @Override // com.thinkup.interstitial.api.TUInterstitialListener
        public final void onInterstitialAdClicked(TUAdInfo tUAdInfo) {
            u2 u2Var = this.f83526b.f83715a;
            if (u2Var != null) {
                u2Var.onAdClicked();
            }
        }

        @Override // com.thinkup.interstitial.api.TUInterstitialListener
        public final void onInterstitialAdClose(TUAdInfo tUAdInfo) {
            u2 u2Var = this.f83526b.f83715a;
            if (u2Var != null) {
                u2Var.onAdClosed();
            }
        }

        @Override // com.thinkup.interstitial.api.TUInterstitialListener
        public final void onInterstitialAdLoadFail(AdError adError) {
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
            b2 b2Var = this.f83526b;
            String desc = adError != null ? adError.getDesc() : null;
            u2 u2Var = b2Var.f83715a;
            if (u2Var != null) {
                u2Var.i(i10, desc);
            }
        }

        @Override // com.thinkup.interstitial.api.TUInterstitialListener
        public final void onInterstitialAdLoaded() {
            TUAdStatusInfo tUAdStatusInfoCheckAdStatus;
            q1 q1VarA = r.f83668a.a(3);
            if (q1VarA instanceof c3) {
                if (((c3) q1VarA).f83535c.contains(this.f83525a)) {
                    b2 b2Var = this.f83526b;
                    int code = kj.c.E_91109.getCode();
                    u2 u2Var = b2Var.f83715a;
                    if (u2Var != null) {
                        u2Var.i(code, "E_91109");
                        return;
                    }
                    return;
                }
            }
            TUInterstitial tUInterstitial = this.f83526b.f83520b;
            TUAdInfo tUTopAdInfo = (tUInterstitial == null || (tUAdStatusInfoCheckAdStatus = tUInterstitial.checkAdStatus()) == null) ? null : tUAdStatusInfoCheckAdStatus.getTUTopAdInfo();
            b2 b2Var2 = this.f83526b;
            if (tUTopAdInfo == null) {
                u2 u2Var2 = b2Var2.f83715a;
                if (u2Var2 != null) {
                    u2Var2.i(2, "load failed");
                    return;
                }
                return;
            }
            b2Var2.f83522d = tUTopAdInfo.getAdsourceId();
            b2.h(this.f83526b);
            t2 t2Var = t2.f83703a;
            this.f83526b.g(tUTopAdInfo, t2Var.h(tUTopAdInfo) == 1 ? t2Var.f(tUTopAdInfo) : 0.0d);
            b2 b2Var3 = this.f83526b;
            int iH = t2Var.h(tUTopAdInfo);
            String networkPlacementId = tUTopAdInfo.getNetworkPlacementId();
            u2 u2Var3 = b2Var3.f83715a;
            if (u2Var3 != null) {
                u2Var3.f(iH, networkPlacementId);
            }
            u2 u2Var4 = this.f83526b.f83715a;
            if (u2Var4 != null) {
                u2Var4.c();
            }
            t2Var.c(this.f83525a, 2);
        }

        @Override // com.thinkup.interstitial.api.TUInterstitialListener
        public final void onInterstitialAdShow(TUAdInfo tUAdInfo) {
            u2 u2Var = this.f83526b.f83715a;
            if (u2Var != null) {
                u2Var.a();
            }
            w2 w2VarB = t2.f83703a.b(tUAdInfo, this.f83526b.f83523e);
            u2 u2Var2 = this.f83526b.f83715a;
            if (u2Var2 != null) {
                u2Var2.h(w2VarB);
            }
        }

        @Override // com.thinkup.interstitial.api.TUInterstitialListener
        public final void onInterstitialAdVideoEnd(TUAdInfo tUAdInfo) {
        }

        @Override // com.thinkup.interstitial.api.TUInterstitialListener
        public final void onInterstitialAdVideoError(AdError adError) {
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
            b2 b2Var = this.f83526b;
            String desc = adError != null ? adError.getDesc() : null;
            u2 u2Var = b2Var.f83715a;
            if (u2Var != null) {
                u2Var.e(i10, desc);
            }
        }

        @Override // com.thinkup.interstitial.api.TUInterstitialListener
        public final void onInterstitialAdVideoStart(TUAdInfo tUAdInfo) {
        }
    }

    public b2(u2 u2Var) {
        super(u2Var);
        this.f83521c = "";
        this.f83522d = "";
    }

    public static final void h(b2 b2Var) {
        b2Var.getClass();
        q1 q1VarA = r.f83668a.a(3);
        if (q1VarA instanceof c3) {
            ((c3) q1VarA).f83535c.add(b2Var.f83521c);
        }
    }

    @Override // hj.v1
    public final boolean a() {
        TUAdStatusInfo tUAdStatusInfoCheckAdStatus;
        TUInterstitial tUInterstitial = this.f83520b;
        TUAdInfo tUTopAdInfo = (tUInterstitial == null || (tUAdStatusInfoCheckAdStatus = tUInterstitial.checkAdStatus()) == null) ? null : tUAdStatusInfoCheckAdStatus.getTUTopAdInfo();
        if (p003kotlin.jvm.internal.v.c(this.f83522d, tUTopAdInfo != null ? tUTopAdInfo.getAdsourceId() : null) || tUTopAdInfo == null) {
            return false;
        }
        this.f83522d = tUTopAdInfo.getAdsourceId();
        t2 t2Var = t2.f83703a;
        g(tUTopAdInfo, t2Var.h(tUTopAdInfo) == 1 ? t2Var.f(tUTopAdInfo) : 0.0d);
        int iH = t2Var.h(tUTopAdInfo);
        String networkPlacementId = tUTopAdInfo.getNetworkPlacementId();
        u2 u2Var = this.f83715a;
        if (u2Var != null) {
            u2Var.f(iH, networkPlacementId);
        }
        return true;
    }

    @Override // hj.v1
    public final void b(String str, Map map) {
        fl.m0 m0Var;
        this.f83521c = str;
        Application applicationC = ij.a.c();
        if (applicationC != null) {
            t2.f83703a.c(str, 2);
            TUInterstitial tUInterstitial = this.f83520b;
            if (tUInterstitial == null) {
                TUInterstitial tUInterstitial2 = new TUInterstitial(applicationC, str);
                this.f83520b = tUInterstitial2;
                if (!tUInterstitial2.isAdReady()) {
                    i();
                }
                TUInterstitial tUInterstitial3 = this.f83520b;
                if (tUInterstitial3 != null) {
                    tUInterstitial3.setAdSourceStatusListener(new a());
                }
                TUInterstitial tUInterstitial4 = this.f83520b;
                if (tUInterstitial4 != null) {
                    tUInterstitial4.setAdListener(new b(this, str));
                }
            } else if (!tUInterstitial.isAdReady()) {
                i();
            }
            TUInterstitial tUInterstitial5 = this.f83520b;
            if (tUInterstitial5 != null) {
                tUInterstitial5.load();
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

    @Override // hj.v1
    public final boolean c(Activity activity, String str) {
        i();
        TUInterstitial tUInterstitial = this.f83520b;
        if (tUInterstitial == null || !tUInterstitial.isAdReady()) {
            return false;
        }
        TUShowConfig tUShowConfigBuild = new TUShowConfig.Builder().scenarioId(str).build();
        TUInterstitial tUInterstitial2 = this.f83520b;
        if (tUInterstitial2 != null) {
            tUInterstitial2.show(activity, tUShowConfigBuild);
        }
        return true;
    }

    @Override // hj.v1
    public final void d() {
        TUInterstitial tUInterstitial = this.f83520b;
        if (tUInterstitial != null) {
            tUInterstitial.setAdListener(null);
        }
        this.f83520b = null;
    }

    @Override // hj.v1
    public final boolean e() {
        TUInterstitial tUInterstitial = this.f83520b;
        if (tUInterstitial == null || !tUInterstitial.isAdReady()) {
            i();
        }
        TUInterstitial tUInterstitial2 = this.f83520b;
        return tUInterstitial2 == null || !tUInterstitial2.isAdReady();
    }

    @Override // hj.v1
    public final void f() {
        i();
    }

    public final void g(TUAdInfo tUAdInfo, double d10) {
        if (tUAdInfo != null) {
            if (t2.f83703a.d(tUAdInfo.getNetworkFirmId())) {
                u2 u2Var = this.f83715a;
                if (u2Var != null) {
                    u2Var.g(d10);
                }
                this.f83523e = d10;
                return;
            }
            double ecpm = tUAdInfo.getEcpm();
            u2 u2Var2 = this.f83715a;
            if (u2Var2 != null) {
                u2Var2.g(ecpm);
            }
        }
    }

    public final void i() {
        q1 q1VarA = r.f83668a.a(3);
        if (q1VarA instanceof c3) {
            ((c3) q1VarA).f83535c.remove(this.f83521c);
        }
    }
}