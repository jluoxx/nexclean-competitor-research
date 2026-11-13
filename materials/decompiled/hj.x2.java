package hj;

import android.R;
import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.thinkup.core.api.AdError;
import com.thinkup.core.api.TUAdInfo;
import com.thinkup.core.api.TUAdSourceStatusListener;
import com.thinkup.core.api.TUAdStatusInfo;
import com.thinkup.core.api.TUNetworkConfirmInfo;
import com.thinkup.core.api.TUShowConfig;
import com.thinkup.splashad.api.TUSplashAd;
import com.thinkup.splashad.api.TUSplashAdExtraInfo;
import com.thinkup.splashad.api.TUSplashExListener;
import com.thinkup.splashad.api.TUSplashSkipInfo;
import java.util.Map;

/* JADX INFO: loaded from: classes7.dex */
public final class x2 extends c {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public TUSplashAd f83753b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public String f83754c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public ViewGroup f83755d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public String f83756e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public double f83757f;

    public static final class a implements TUSplashExListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ String f83758a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ x2 f83759b;

        public a(x2 x2Var, String str) {
            this.f83758a = str;
            this.f83759b = x2Var;
        }

        @Override // com.thinkup.splashad.api.TUSplashAdListener
        public final void onAdClick(TUAdInfo tUAdInfo) {
            u2 u2Var = this.f83759b.f83715a;
            if (u2Var != null) {
                u2Var.onAdClicked();
            }
        }

        @Override // com.thinkup.splashad.api.TUSplashAdListener
        public final void onAdDismiss(TUAdInfo tUAdInfo, TUSplashAdExtraInfo tUSplashAdExtraInfo) {
            ViewGroup viewGroup = this.f83759b.f83755d;
            if (viewGroup != null) {
                viewGroup.setVisibility(8);
            }
            u2 u2Var = this.f83759b.f83715a;
            if (u2Var != null) {
                u2Var.onAdClosed();
            }
        }

        @Override // com.thinkup.splashad.api.TUSplashAdListener
        public final void onAdLoadTimeout() {
        }

        @Override // com.thinkup.splashad.api.TUSplashAdListener
        public final void onAdLoaded(boolean z10) {
            TUAdStatusInfo tUAdStatusInfoCheckAdStatus;
            q1 q1VarA = r.f83668a.a(3);
            if (q1VarA instanceof c3) {
                if (((c3) q1VarA).f83535c.contains(this.f83758a)) {
                    x2 x2Var = this.f83759b;
                    int code = kj.c.E_91109.getCode();
                    u2 u2Var = x2Var.f83715a;
                    if (u2Var != null) {
                        u2Var.i(code, "E_91109");
                        return;
                    }
                    return;
                }
            }
            TUSplashAd tUSplashAd = this.f83759b.f83753b;
            TUAdInfo tUTopAdInfo = (tUSplashAd == null || (tUAdStatusInfoCheckAdStatus = tUSplashAd.checkAdStatus()) == null) ? null : tUAdStatusInfoCheckAdStatus.getTUTopAdInfo();
            x2 x2Var2 = this.f83759b;
            if (tUTopAdInfo == null) {
                u2 u2Var2 = x2Var2.f83715a;
                if (u2Var2 != null) {
                    u2Var2.i(2, "load failed");
                    return;
                }
                return;
            }
            x2Var2.f83756e = tUTopAdInfo.getAdsourceId();
            x2.h(this.f83759b);
            t2 t2Var = t2.f83703a;
            this.f83759b.g(tUTopAdInfo, t2Var.h(tUTopAdInfo) == 1 ? t2Var.a(tUTopAdInfo) : 0.0d);
            x2 x2Var3 = this.f83759b;
            int iH = t2Var.h(tUTopAdInfo);
            String networkPlacementId = tUTopAdInfo.getNetworkPlacementId();
            u2 u2Var3 = x2Var3.f83715a;
            if (u2Var3 != null) {
                u2Var3.f(iH, networkPlacementId);
            }
            u2 u2Var4 = this.f83759b.f83715a;
            if (u2Var4 != null) {
                u2Var4.c();
            }
            t2Var.c(this.f83758a, 5);
        }

        @Override // com.thinkup.splashad.api.TUSplashAdListener
        public final void onAdShow(TUAdInfo tUAdInfo) {
            u2 u2Var = this.f83759b.f83715a;
            if (u2Var != null) {
                u2Var.a();
            }
            w2 w2VarB = t2.f83703a.b(tUAdInfo, this.f83759b.f83757f);
            u2 u2Var2 = this.f83759b.f83715a;
            if (u2Var2 != null) {
                u2Var2.h(w2VarB);
            }
        }

        @Override // com.thinkup.splashad.api.TUSplashExListener
        public final void onDeeplinkCallback(TUAdInfo tUAdInfo, boolean z10) {
        }

        @Override // com.thinkup.splashad.api.TUSplashExListener
        public final void onDownloadConfirm(Context context, TUAdInfo tUAdInfo, TUNetworkConfirmInfo tUNetworkConfirmInfo) {
        }

        @Override // com.thinkup.splashad.api.TUSplashAdListener
        public final void onNoAdError(AdError adError) {
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
            x2 x2Var = this.f83759b;
            String desc = adError != null ? adError.getDesc() : null;
            u2 u2Var = x2Var.f83715a;
            if (u2Var != null) {
                u2Var.i(i10, desc);
            }
        }

        @Override // com.thinkup.splashad.api.TUSplashExListener
        public final void onSplashAdReward(TUAdInfo tUAdInfo) {
        }
    }

    public static final class b implements TUAdSourceStatusListener {
        public b() {
        }

        @Override // com.thinkup.core.api.TUAdSourceStatusListener
        public final void onAdSourceAttempt(TUAdInfo tUAdInfo) {
            u2 u2Var;
            if (tUAdInfo != null) {
                x2 x2Var = x2.this;
                if (!t2.f83703a.j(tUAdInfo) || (u2Var = x2Var.f83715a) == null) {
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
                x2 x2Var = x2.this;
                if (!t2.f83703a.d(tUAdInfo.getNetworkFirmId()) || (u2Var = x2Var.f83715a) == null) {
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

    public x2(u2 u2Var) {
        super(u2Var);
        this.f83754c = "";
        this.f83756e = "";
    }

    public static final void h(x2 x2Var) {
        x2Var.getClass();
        q1 q1VarA = r.f83668a.a(3);
        if (q1VarA instanceof c3) {
            ((c3) q1VarA).f83535c.add(x2Var.f83754c);
        }
    }

    @Override // hj.c
    public final boolean a() {
        TUAdStatusInfo tUAdStatusInfoCheckAdStatus;
        TUSplashAd tUSplashAd = this.f83753b;
        TUAdInfo tUTopAdInfo = (tUSplashAd == null || (tUAdStatusInfoCheckAdStatus = tUSplashAd.checkAdStatus()) == null) ? null : tUAdStatusInfoCheckAdStatus.getTUTopAdInfo();
        if (p003kotlin.jvm.internal.v.c(this.f83756e, tUTopAdInfo != null ? tUTopAdInfo.getAdsourceId() : null) || tUTopAdInfo == null) {
            return false;
        }
        this.f83756e = tUTopAdInfo.getAdsourceId();
        t2 t2Var = t2.f83703a;
        g(tUTopAdInfo, t2Var.h(tUTopAdInfo) == 1 ? t2Var.a(tUTopAdInfo) : 0.0d);
        int iH = t2Var.h(tUTopAdInfo);
        String networkPlacementId = tUTopAdInfo.getNetworkPlacementId();
        u2 u2Var = this.f83715a;
        if (u2Var != null) {
            u2Var.f(iH, networkPlacementId);
        }
        return true;
    }

    @Override // hj.c
    public final void b(String str, Map map) {
        fl.m0 m0Var;
        this.f83754c = str;
        Application applicationC = ij.a.c();
        if (applicationC != null) {
            t2.f83703a.c(str, 5);
            TUSplashAd tUSplashAd = this.f83753b;
            if (tUSplashAd == null) {
                TUSplashAd tUSplashAd2 = new TUSplashAd(applicationC, str, new a(this, str), 20000);
                this.f83753b = tUSplashAd2;
                if (!tUSplashAd2.isAdReady()) {
                    i();
                }
            } else if (!tUSplashAd.isAdReady()) {
                i();
            }
            TUSplashAd tUSplashAd3 = this.f83753b;
            if (tUSplashAd3 != null) {
                tUSplashAd3.setAdSourceStatusListener(new b());
            }
            TUSplashAd tUSplashAd4 = this.f83753b;
            if (tUSplashAd4 != null) {
                tUSplashAd4.loadAd();
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

    @Override // hj.c
    public final boolean c(Activity activity, String str) {
        i();
        TUSplashAd tUSplashAd = this.f83753b;
        if (tUSplashAd == null || !tUSplashAd.isAdReady()) {
            return false;
        }
        TUShowConfig tUShowConfigBuild = new TUShowConfig.Builder().scenarioId(str).build();
        Intent intent = activity.getIntent();
        if (intent == null) {
            intent = new Intent();
        }
        String stringExtra = intent.getStringExtra("ks_container");
        if (TextUtils.isEmpty(stringExtra)) {
            this.f83755d = new FrameLayout(activity.getApplicationContext());
            try {
                View viewFindViewById = activity.findViewById(R.id.content);
                if (viewFindViewById == null) {
                    return false;
                }
                ViewGroup viewGroup = (ViewGroup) viewFindViewById;
                if (viewGroup.getChildCount() <= 0) {
                    return false;
                }
                View childAt = viewGroup.getChildAt(0);
                ViewGroup viewGroup2 = childAt instanceof ViewGroup ? (ViewGroup) childAt : null;
                if (viewGroup2 == null) {
                    return false;
                }
                ViewGroup viewGroup3 = this.f83755d;
                viewGroup3.getClass();
                ((FrameLayout) viewGroup3).setVisibility(0);
                viewGroup2.addView(this.f83755d, new ViewGroup.LayoutParams(-1, -2));
            } catch (Throwable th2) {
                th2.printStackTrace();
            }
            TUSplashAd tUSplashAd2 = this.f83753b;
            if (tUSplashAd2 != null) {
                tUSplashAd2.show(activity, this.f83755d, (TUSplashSkipInfo) null, tUShowConfigBuild);
            }
        } else {
            int identifier = activity.getResources().getIdentifier(stringExtra, "id", activity.getPackageName());
            if (identifier <= 0) {
                return false;
            }
            View viewFindViewById2 = activity.findViewById(identifier);
            ViewGroup viewGroup4 = viewFindViewById2 instanceof ViewGroup ? (ViewGroup) viewFindViewById2 : null;
            this.f83755d = viewGroup4;
            if (viewGroup4 != null) {
                viewGroup4.setVisibility(0);
            }
            TUSplashAd tUSplashAd3 = this.f83753b;
            if (tUSplashAd3 != null) {
                tUSplashAd3.show(activity, this.f83755d, (TUSplashSkipInfo) null, tUShowConfigBuild);
            }
        }
        return true;
    }

    @Override // hj.c
    public final void d() {
        ViewGroup viewGroup = this.f83755d;
        if (viewGroup != null) {
            viewGroup.setVisibility(8);
        }
        TUSplashAd tUSplashAd = this.f83753b;
        if (tUSplashAd != null) {
            tUSplashAd.setAdListener(null);
        }
        this.f83753b = null;
    }

    @Override // hj.c
    public final boolean e() {
        TUSplashAd tUSplashAd = this.f83753b;
        if (tUSplashAd == null || !tUSplashAd.isAdReady()) {
            i();
        }
        TUSplashAd tUSplashAd2 = this.f83753b;
        return tUSplashAd2 == null || !tUSplashAd2.isAdReady();
    }

    @Override // hj.c
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
                this.f83757f = d10;
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
            ((c3) q1VarA).f83535c.remove(this.f83754c);
        }
    }
}