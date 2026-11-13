package hj;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.thinkup.banner.api.TUBannerExListener;
import com.thinkup.banner.api.TUBannerView;
import com.thinkup.core.api.AdError;
import com.thinkup.core.api.TUAdConst;
import com.thinkup.core.api.TUAdInfo;
import com.thinkup.core.api.TUAdSourceStatusListener;
import com.thinkup.core.api.TUAdStatusInfo;
import com.thinkup.core.api.TUNetworkConfirmInfo;
import com.thinkup.core.api.TUShowConfig;
import com.thinkup.network.admob.AdmobTUConst;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes7.dex */
public final class m2 extends f {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public TUBannerView f83626b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public String f83627c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public String f83628d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f83629e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f83630f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public double f83631g;

    public static final class a implements TUBannerExListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ String f83632a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ m2 f83633b;

        public a(m2 m2Var, String str) {
            this.f83632a = str;
            this.f83633b = m2Var;
        }

        @Override // com.thinkup.banner.api.TUBannerListener
        public final void onBannerAutoRefreshFail(AdError adError) {
        }

        @Override // com.thinkup.banner.api.TUBannerListener
        public final void onBannerAutoRefreshed(TUAdInfo tUAdInfo) {
            u2 u2Var = this.f83633b.f83715a;
            if (u2Var != null) {
                u2Var.a();
            }
            w2 w2VarB = t2.f83703a.b(tUAdInfo, this.f83633b.f83631g);
            u2 u2Var2 = this.f83633b.f83715a;
            if (u2Var2 != null) {
                u2Var2.h(w2VarB);
            }
        }

        @Override // com.thinkup.banner.api.TUBannerListener
        public final void onBannerClicked(TUAdInfo tUAdInfo) {
            u2 u2Var = this.f83633b.f83715a;
            if (u2Var != null) {
                u2Var.onAdClicked();
            }
        }

        @Override // com.thinkup.banner.api.TUBannerListener
        public final void onBannerClose(TUAdInfo tUAdInfo) {
            u2 u2Var = this.f83633b.f83715a;
            if (u2Var != null) {
                u2Var.onAdClosed();
            }
        }

        @Override // com.thinkup.banner.api.TUBannerListener
        public final void onBannerFailed(AdError adError) {
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
            m2 m2Var = this.f83633b;
            String desc = adError != null ? adError.getDesc() : null;
            u2 u2Var = m2Var.f83715a;
            if (u2Var != null) {
                u2Var.i(i10, desc);
            }
        }

        @Override // com.thinkup.banner.api.TUBannerListener
        public final void onBannerLoaded() {
            TUAdStatusInfo tUAdStatusInfoCheckAdStatus;
            q1 q1VarA = r.f83668a.a(3);
            if (q1VarA instanceof c3) {
                if (((c3) q1VarA).f83535c.contains(this.f83632a)) {
                    m2 m2Var = this.f83633b;
                    int code = kj.c.E_91109.getCode();
                    u2 u2Var = m2Var.f83715a;
                    if (u2Var != null) {
                        u2Var.i(code, "E_91109");
                        return;
                    }
                    return;
                }
            }
            TUBannerView tUBannerView = this.f83633b.f83626b;
            TUAdInfo tUTopAdInfo = (tUBannerView == null || (tUAdStatusInfoCheckAdStatus = tUBannerView.checkAdStatus()) == null) ? null : tUAdStatusInfoCheckAdStatus.getTUTopAdInfo();
            m2 m2Var2 = this.f83633b;
            if (tUTopAdInfo == null) {
                u2 u2Var2 = m2Var2.f83715a;
                if (u2Var2 != null) {
                    u2Var2.i(2, "load failed");
                    return;
                }
                return;
            }
            m2Var2.f83628d = tUTopAdInfo.getAdsourceId();
            m2.h(this.f83633b);
            t2 t2Var = t2.f83703a;
            this.f83633b.g(tUTopAdInfo, t2Var.h(tUTopAdInfo) == 1 ? t2Var.e(tUTopAdInfo) : 0.0d);
            m2 m2Var3 = this.f83633b;
            int iH = t2Var.h(tUTopAdInfo);
            String networkPlacementId = tUTopAdInfo.getNetworkPlacementId();
            u2 u2Var3 = m2Var3.f83715a;
            if (u2Var3 != null) {
                u2Var3.f(iH, networkPlacementId);
            }
            u2 u2Var4 = this.f83633b.f83715a;
            if (u2Var4 != null) {
                u2Var4.c();
            }
            t2Var.c(this.f83632a, 1);
        }

        @Override // com.thinkup.banner.api.TUBannerListener
        public final void onBannerShow(TUAdInfo tUAdInfo) {
            u2 u2Var = this.f83633b.f83715a;
            if (u2Var != null) {
                u2Var.a();
            }
            w2 w2VarB = t2.f83703a.b(tUAdInfo, this.f83633b.f83631g);
            u2 u2Var2 = this.f83633b.f83715a;
            if (u2Var2 != null) {
                u2Var2.h(w2VarB);
            }
        }

        @Override // com.thinkup.banner.api.TUBannerExListener
        public final void onDeeplinkCallback(boolean z10, TUAdInfo tUAdInfo, boolean z11) {
        }

        @Override // com.thinkup.banner.api.TUBannerExListener
        public final void onDownloadConfirm(Context context, TUAdInfo tUAdInfo, TUNetworkConfirmInfo tUNetworkConfirmInfo) {
        }
    }

    public static final class b implements TUAdSourceStatusListener {
        public b() {
        }

        @Override // com.thinkup.core.api.TUAdSourceStatusListener
        public final void onAdSourceAttempt(TUAdInfo tUAdInfo) {
            u2 u2Var;
            if (tUAdInfo != null) {
                m2 m2Var = m2.this;
                if (!t2.f83703a.j(tUAdInfo) || (u2Var = m2Var.f83715a) == null) {
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
                m2 m2Var = m2.this;
                if (!t2.f83703a.d(tUAdInfo.getNetworkFirmId()) || (u2Var = m2Var.f83715a) == null) {
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

    public m2(u2 u2Var) {
        super(u2Var);
        this.f83627c = "";
        this.f83628d = "";
    }

    public static final void h(m2 m2Var) {
        m2Var.getClass();
        q1 q1VarA = r.f83668a.a(3);
        if (q1VarA instanceof c3) {
            ((c3) q1VarA).f83535c.add(m2Var.f83627c);
        }
    }

    @Override // hj.f
    public final void a(String str, Map map) {
        int i10;
        fl.m0 m0Var;
        TUAdStatusInfo tUAdStatusInfoCheckAdStatus;
        this.f83627c = str;
        try {
            String strValueOf = String.valueOf(map.get("ad_pp_inline_width"));
            if (strValueOf.length() > 0 && !p003kotlin.jvm.internal.v.c(strValueOf, "null")) {
                this.f83629e = Integer.parseInt(strValueOf);
            }
            String strValueOf2 = String.valueOf(map.get("ad_pp_normal_width"));
            if (strValueOf2.length() > 0 && !p003kotlin.jvm.internal.v.c(strValueOf2, "null")) {
                this.f83630f = Integer.parseInt(strValueOf2);
            }
        } catch (Throwable th2) {
            th2.printStackTrace();
        }
        Application applicationC = ij.a.c();
        if (applicationC != null) {
            t2.f83703a.c(str, 1);
            int i11 = this.f83629e;
            if (i11 <= 0 && (i11 = this.f83630f) <= 0) {
                i10 = applicationC.getResources().getDisplayMetrics().widthPixels;
            } else {
                float f10 = applicationC.getResources().getDisplayMetrics().density;
                i10 = (int) ((i11 * f10) + 0.5f);
            }
            HashMap map2 = new HashMap();
            map2.put(TUAdConst.KEY.AD_WIDTH, Integer.valueOf(i10));
            map2.put(AdmobTUConst.ADAPTIVE_WIDTH, Integer.valueOf(i10));
            if (this.f83629e > 0) {
                map2.put(AdmobTUConst.ADAPTIVE_TYPE, 1);
            } else {
                map2.put(AdmobTUConst.ADAPTIVE_TYPE, 0);
            }
            if (this.f83626b == null) {
                TUBannerView tUBannerView = new TUBannerView(applicationC);
                this.f83626b = tUBannerView;
                tUBannerView.setPlacementId(str);
                TUBannerView tUBannerView2 = this.f83626b;
                if (tUBannerView2 != null) {
                    tUBannerView2.setLayoutParams(new FrameLayout.LayoutParams(i10, -2));
                }
                TUBannerView tUBannerView3 = this.f83626b;
                if (tUBannerView3 != null) {
                    tUBannerView3.setBannerAdListener(new a(this, str));
                }
                TUBannerView tUBannerView4 = this.f83626b;
                if (tUBannerView4 != null) {
                    tUBannerView4.setAdSourceStatusListener(new b());
                }
            }
            TUBannerView tUBannerView5 = this.f83626b;
            if (tUBannerView5 != null && (tUAdStatusInfoCheckAdStatus = tUBannerView5.checkAdStatus()) != null && !tUAdStatusInfoCheckAdStatus.isReady()) {
                q1 q1VarA = r.f83668a.a(3);
                if (q1VarA instanceof c3) {
                    ((c3) q1VarA).f83535c.remove(this.f83627c);
                }
            }
            TUBannerView tUBannerView6 = this.f83626b;
            if (tUBannerView6 != null) {
                tUBannerView6.setLocalExtra(map2);
            }
            TUBannerView tUBannerView7 = this.f83626b;
            if (tUBannerView7 != null) {
                tUBannerView7.loadAd();
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

    @Override // hj.f
    public final boolean b(Activity activity, ViewGroup viewGroup, String str) {
        q1 q1VarA = r.f83668a.a(3);
        if (q1VarA instanceof c3) {
            ((c3) q1VarA).f83535c.remove(this.f83627c);
        }
        TUBannerView tUBannerView = this.f83626b;
        if (tUBannerView == null) {
            return false;
        }
        tUBannerView.setShowConfig(new TUShowConfig.Builder().scenarioId(str).build());
        viewGroup.removeAllViews();
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
        layoutParams.gravity = 17;
        tUBannerView.setLayoutParams(layoutParams);
        viewGroup.addView(tUBannerView, layoutParams);
        return true;
    }

    @Override // hj.f
    public final void c() {
        TUBannerView tUBannerView = this.f83626b;
        if (tUBannerView != null) {
            tUBannerView.setBannerAdListener(null);
        }
        this.f83626b = null;
    }

    @Override // hj.f
    public final boolean d() {
        TUAdStatusInfo tUAdStatusInfoCheckAdStatus;
        TUAdStatusInfo tUAdStatusInfoCheckAdStatus2;
        TUBannerView tUBannerView = this.f83626b;
        if (tUBannerView == null || (tUAdStatusInfoCheckAdStatus2 = tUBannerView.checkAdStatus()) == null || !tUAdStatusInfoCheckAdStatus2.isReady()) {
            q1 q1VarA = r.f83668a.a(3);
            if (q1VarA instanceof c3) {
                ((c3) q1VarA).f83535c.remove(this.f83627c);
            }
        }
        TUBannerView tUBannerView2 = this.f83626b;
        return tUBannerView2 == null || (tUAdStatusInfoCheckAdStatus = tUBannerView2.checkAdStatus()) == null || !tUAdStatusInfoCheckAdStatus.isReady();
    }

    @Override // hj.f
    public final void e() {
        q1 q1VarA = r.f83668a.a(3);
        if (q1VarA instanceof c3) {
            ((c3) q1VarA).f83535c.remove(this.f83627c);
        }
    }

    @Override // hj.f
    public final boolean f() {
        TUAdStatusInfo tUAdStatusInfoCheckAdStatus;
        TUBannerView tUBannerView = this.f83626b;
        TUAdInfo tUTopAdInfo = (tUBannerView == null || (tUAdStatusInfoCheckAdStatus = tUBannerView.checkAdStatus()) == null) ? null : tUAdStatusInfoCheckAdStatus.getTUTopAdInfo();
        if (p003kotlin.jvm.internal.v.c(this.f83628d, tUTopAdInfo != null ? tUTopAdInfo.getAdsourceId() : null) || tUTopAdInfo == null) {
            return false;
        }
        this.f83628d = tUTopAdInfo.getAdsourceId();
        t2 t2Var = t2.f83703a;
        g(tUTopAdInfo, t2Var.h(tUTopAdInfo) == 1 ? t2Var.e(tUTopAdInfo) : 0.0d);
        int iH = t2Var.h(tUTopAdInfo);
        String networkPlacementId = tUTopAdInfo.getNetworkPlacementId();
        u2 u2Var = this.f83715a;
        if (u2Var != null) {
            u2Var.f(iH, networkPlacementId);
        }
        return true;
    }

    public final void g(TUAdInfo tUAdInfo, double d10) {
        if (tUAdInfo != null) {
            if (t2.f83703a.d(tUAdInfo.getNetworkFirmId())) {
                u2 u2Var = this.f83715a;
                if (u2Var != null) {
                    u2Var.g(d10);
                }
                this.f83631g = d10;
                return;
            }
            double ecpm = tUAdInfo.getEcpm();
            u2 u2Var2 = this.f83715a;
            if (u2Var2 != null) {
                u2Var2.g(ecpm);
            }
        }
    }
}