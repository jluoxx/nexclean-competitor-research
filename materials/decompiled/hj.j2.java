package hj;

import android.app.Application;
import com.tradplus.ads.base.bean.TPAdError;
import com.tradplus.ads.base.bean.TPAdInfo;
import com.tradplus.ads.open.LoadAdEveryLayerListener;
import com.tradplus.ads.open.TradPlusSdk;
import com.tradplus.ads.open.reward.RewardAdListener;
import com.tradplus.ads.open.reward.TPReward;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes7.dex */
public final class j2 extends s {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public TPReward f83596b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public String f83597c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public double f83598d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public String f83599e;

    public static final class a implements RewardAdListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ String f83600a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ j2 f83601b;

        /* JADX INFO: renamed from: hj.j2$a$a, reason: collision with other inner class name */
        public static final class C1023a extends ll.m implements tl.n {
            public final /* synthetic */ j2 OooO00o;
            public final /* synthetic */ String OooO0O0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C1023a(j2 j2Var, String str, kl.f fVar) {
                super(2, fVar);
                this.OooO00o = j2Var;
                this.OooO0O0 = str;
            }

            @Override // tl.n
            /* JADX INFO: renamed from: OooO00o, reason: merged with bridge method [inline-methods] */
            public final Object invoke(kotlinx.coroutines.p0 p0Var, kl.f<? super fl.m0> fVar) {
                return new C1023a(this.OooO00o, this.OooO0O0, fVar).invokeSuspend(fl.m0.f80959a);
            }

            @Override // ll.a
            public final kl.f<fl.m0> create(Object obj, kl.f<?> fVar) {
                return new C1023a(this.OooO00o, this.OooO0O0, fVar);
            }

            @Override // ll.a
            public final Object invokeSuspend(Object obj) {
                p003kotlin.coroutines.intrinsics.c.f();
                fl.v.b(obj);
                u2 u2Var = this.OooO00o.f83715a;
                if (u2Var != null) {
                    u2Var.c();
                }
                v2.f83727a.c(this.OooO0O0, 4);
                return fl.m0.f80959a;
            }
        }

        public a(j2 j2Var, String str) {
            this.f83600a = str;
            this.f83601b = j2Var;
        }

        @Override // com.tradplus.ads.open.reward.RewardAdListener
        public final void onAdClicked(TPAdInfo tPAdInfo) {
            u2 u2Var = this.f83601b.f83715a;
            if (u2Var != null) {
                u2Var.onAdClicked();
            }
        }

        @Override // com.tradplus.ads.open.reward.RewardAdListener
        public final void onAdClosed(TPAdInfo tPAdInfo) {
            u2 u2Var = this.f83601b.f83715a;
            if (u2Var != null) {
                u2Var.onAdClosed();
            }
        }

        @Override // com.tradplus.ads.open.reward.RewardAdListener
        public final void onAdFailed(TPAdError tPAdError) {
            j2 j2Var = this.f83601b;
            int errorCode = tPAdError != null ? tPAdError.getErrorCode() : 0;
            String errorMsg = tPAdError != null ? tPAdError.getErrorMsg() : null;
            u2 u2Var = j2Var.f83715a;
            if (u2Var != null) {
                u2Var.i(errorCode, errorMsg);
            }
        }

        @Override // com.tradplus.ads.open.reward.RewardAdListener
        public final void onAdImpression(TPAdInfo tPAdInfo) {
            this.f83601b.h();
            u2 u2Var = this.f83601b.f83715a;
            if (u2Var != null) {
                u2Var.a();
            }
            w2 w2VarB = v2.f83727a.b(tPAdInfo, this.f83601b.f83598d);
            u2 u2Var2 = this.f83601b.f83715a;
            if (u2Var2 != null) {
                u2Var2.h(w2VarB);
            }
        }

        @Override // com.tradplus.ads.open.reward.RewardAdListener
        public final void onAdLoaded(TPAdInfo tPAdInfo) {
            String str;
            String str2;
            String str3;
            q1 q1VarA = r.f83668a.a(30);
            if (q1VarA instanceof e2) {
                if (((e2) q1VarA).f83557c.contains(this.f83600a)) {
                    j2 j2Var = this.f83601b;
                    int code = kj.c.E_91109.getCode();
                    u2 u2Var = j2Var.f83715a;
                    if (u2Var != null) {
                        u2Var.i(code, "E_91109");
                        return;
                    }
                    return;
                }
            }
            j2.g(this.f83601b);
            j2 j2Var2 = this.f83601b;
            String str4 = "";
            if (tPAdInfo == null || (str = tPAdInfo.adSourceId) == null) {
                str = "";
            }
            j2Var2.f83599e = str;
            j2Var2.f(tPAdInfo);
            j2 j2Var3 = this.f83601b;
            v2 v2Var = v2.f83727a;
            if (tPAdInfo == null || (str2 = tPAdInfo.adNetworkId) == null) {
                str2 = "";
            }
            int iD = v2Var.d(str2);
            if (tPAdInfo != null && (str3 = tPAdInfo.adSourcePlacementId) != null) {
                str4 = str3;
            }
            u2 u2Var2 = j2Var3.f83715a;
            if (u2Var2 != null) {
                u2Var2.f(iD, str4);
            }
            kotlinx.coroutines.k.d(kotlinx.coroutines.v1.f87249a, null, null, new C1023a(this.f83601b, this.f83600a, null), 3, null);
        }

        @Override // com.tradplus.ads.open.reward.RewardAdListener
        public final void onAdReward(TPAdInfo tPAdInfo) {
            u2 u2Var = this.f83601b.f83715a;
            if (u2Var != null) {
                u2Var.d(1);
            }
        }

        @Override // com.tradplus.ads.open.reward.RewardAdListener
        public final void onAdVideoEnd(TPAdInfo tPAdInfo) {
        }

        @Override // com.tradplus.ads.open.reward.RewardAdListener
        public final void onAdVideoError(TPAdInfo tPAdInfo, TPAdError tPAdError) {
            this.f83601b.h();
            j2 j2Var = this.f83601b;
            int errorCode = tPAdError != null ? tPAdError.getErrorCode() : 0;
            String errorMsg = tPAdError != null ? tPAdError.getErrorMsg() : null;
            u2 u2Var = j2Var.f83715a;
            if (u2Var != null) {
                u2Var.e(errorCode, errorMsg);
            }
        }

        @Override // com.tradplus.ads.open.reward.RewardAdListener
        public final void onAdVideoStart(TPAdInfo tPAdInfo) {
        }
    }

    public static final class b implements LoadAdEveryLayerListener {
        @Override // com.tradplus.ads.open.LoadAdEveryLayerListener
        public final void onAdAllLoaded(boolean z10) {
        }

        @Override // com.tradplus.ads.open.LoadAdEveryLayerListener
        public final void onAdIsLoading(String str) {
        }

        @Override // com.tradplus.ads.open.LoadAdEveryLayerListener
        public final void onAdStartLoad(String str) {
        }

        @Override // com.tradplus.ads.open.LoadAdEveryLayerListener
        public final void onBiddingEnd(TPAdInfo tPAdInfo, TPAdError tPAdError) {
        }

        @Override // com.tradplus.ads.open.LoadAdEveryLayerListener
        public final void onBiddingStart(TPAdInfo tPAdInfo) {
        }

        @Override // com.tradplus.ads.open.LoadAdEveryLayerListener
        public final void oneLayerLoadFailed(TPAdError tPAdError, TPAdInfo tPAdInfo) {
        }

        @Override // com.tradplus.ads.open.LoadAdEveryLayerListener
        public final void oneLayerLoadStart(TPAdInfo tPAdInfo) {
        }

        @Override // com.tradplus.ads.open.LoadAdEveryLayerListener
        public final void oneLayerLoaded(TPAdInfo tPAdInfo) {
        }
    }

    public j2(u2 u2Var) {
        super(u2Var);
        this.f83597c = "";
        this.f83599e = "";
    }

    public static final void g(j2 j2Var) {
        j2Var.getClass();
        q1 q1VarA = r.f83668a.a(30);
        if (q1VarA instanceof e2) {
            ((e2) q1VarA).f83557c.add(j2Var.f83597c);
        }
    }

    @Override // hj.s
    public final boolean a() {
        TPAdInfo tPAdInfo = TradPlusSdk.getTPAdInfo(this.f83597c);
        if (p003kotlin.jvm.internal.v.c(this.f83599e, tPAdInfo != null ? tPAdInfo.adSourceId : null) || tPAdInfo == null) {
            return false;
        }
        this.f83599e = tPAdInfo.adSourceId;
        f(tPAdInfo);
        v2 v2Var = v2.f83727a;
        String str = tPAdInfo.adNetworkId;
        if (str == null) {
            str = "";
        }
        int iD = v2Var.d(str);
        String str2 = tPAdInfo.adSourcePlacementId;
        String str3 = str2 != null ? str2 : "";
        u2 u2Var = this.f83715a;
        if (u2Var == null) {
            return true;
        }
        u2Var.f(iD, str3);
        return true;
    }

    @Override // hj.s
    public final void b(String str, Map map) {
        fl.m0 m0Var;
        this.f83597c = str;
        Application applicationC = ij.a.c();
        if (applicationC != null) {
            v2.f83727a.c(str, 4);
            TPReward tPReward = this.f83596b;
            if (tPReward == null) {
                TPReward tPReward2 = new TPReward(applicationC, str);
                this.f83596b = tPReward2;
                if (!tPReward2.isReady()) {
                    h();
                }
                TPReward tPReward3 = this.f83596b;
                if (tPReward3 != null) {
                    tPReward3.setAutoLoadCallback(true);
                }
                TPReward tPReward4 = this.f83596b;
                if (tPReward4 != null) {
                    tPReward4.setAdListener(new a(this, str));
                }
                TPReward tPReward5 = this.f83596b;
                if (tPReward5 != null) {
                    tPReward5.setAllAdLoadListener(new b());
                }
            } else if (!tPReward.isReady()) {
                h();
            }
            TPReward tPReward6 = this.f83596b;
            if (tPReward6 != null) {
                tPReward6.loadAd();
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
        TPReward tPReward = this.f83596b;
        if (tPReward != null) {
            tPReward.setAdListener(null);
        }
        TPReward tPReward2 = this.f83596b;
        if (tPReward2 != null) {
            tPReward2.onDestroy();
        }
        this.f83596b = null;
    }

    @Override // hj.s
    public final Boolean d() {
        TPReward tPReward = this.f83596b;
        if (tPReward != null && !tPReward.isReady()) {
            h();
        }
        TPReward tPReward2 = this.f83596b;
        return Boolean.valueOf(tPReward2 == null || !tPReward2.isReady());
    }

    @Override // hj.s
    public final void e() {
        h();
    }

    public final void f(TPAdInfo tPAdInfo) {
        if (tPAdInfo != null) {
            try {
                v2 v2Var = v2.f83727a;
                if (!v2Var.e(tPAdInfo.adNetworkId)) {
                    double d10 = Double.parseDouble(tPAdInfo.ecpm);
                    u2 u2Var = this.f83715a;
                    if (u2Var != null) {
                        u2Var.g(d10);
                        return;
                    }
                    return;
                }
                double dA = v2Var.a(tPAdInfo.tpAdUnitId);
                this.f83598d = dA;
                HashMap map = new HashMap();
                map.put("tx_platform", tPAdInfo.adNetworkId);
                map.put("tx_type", "reward");
                map.put("tx_sdk_ecpm", tPAdInfo.ecpm);
                map.put("tx_cal_ecpm", String.valueOf(dA));
                u2 u2Var2 = this.f83715a;
                if (u2Var2 != null) {
                    u2Var2.g(dA);
                }
            } catch (Throwable th2) {
                th2.printStackTrace();
            }
        }
    }

    public final void h() {
        q1 q1VarA = r.f83668a.a(30);
        if (q1VarA instanceof e2) {
            ((e2) q1VarA).f83557c.remove(this.f83597c);
        }
    }
}