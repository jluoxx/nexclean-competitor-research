package hj;

import android.app.Activity;
import android.app.Application;
import android.view.ViewGroup;
import android.view.ViewParent;
import com.tradplus.ads.base.bean.TPAdError;
import com.tradplus.ads.base.bean.TPAdInfo;
import com.tradplus.ads.base.bean.TPBaseAd;
import com.tradplus.ads.open.LoadAdEveryLayerListener;
import com.tradplus.ads.open.TradPlusSdk;
import com.tradplus.ads.open.nativead.NativeAdListener;
import com.tradplus.ads.open.nativead.TPNative;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes7.dex */
public final class g2 extends o2 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public TPNative f83574b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public String f83575c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public double f83576d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public String f83577e;

    public static final class a extends NativeAdListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ String f83578a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ g2 f83579b;

        /* JADX INFO: renamed from: hj.g2$a$a, reason: collision with other inner class name */
        public static final class C1021a extends ll.m implements tl.n {
            public final /* synthetic */ g2 OooO00o;
            public final /* synthetic */ String OooO0O0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C1021a(g2 g2Var, String str, kl.f fVar) {
                super(2, fVar);
                this.OooO00o = g2Var;
                this.OooO0O0 = str;
            }

            @Override // tl.n
            /* JADX INFO: renamed from: OooO00o, reason: merged with bridge method [inline-methods] */
            public final Object invoke(kotlinx.coroutines.p0 p0Var, kl.f<? super fl.m0> fVar) {
                return new C1021a(this.OooO00o, this.OooO0O0, fVar).invokeSuspend(fl.m0.f80959a);
            }

            @Override // ll.a
            public final kl.f<fl.m0> create(Object obj, kl.f<?> fVar) {
                return new C1021a(this.OooO00o, this.OooO0O0, fVar);
            }

            @Override // ll.a
            public final Object invokeSuspend(Object obj) {
                p003kotlin.coroutines.intrinsics.c.f();
                fl.v.b(obj);
                u2 u2Var = this.OooO00o.f83715a;
                if (u2Var != null) {
                    u2Var.c();
                }
                v2.f83727a.c(this.OooO0O0, 3);
                return fl.m0.f80959a;
            }
        }

        public a(g2 g2Var, String str) {
            this.f83578a = str;
            this.f83579b = g2Var;
        }

        @Override // com.tradplus.ads.open.nativead.NativeAdListener
        public final void onAdClicked(TPAdInfo tPAdInfo) {
            u2 u2Var = this.f83579b.f83715a;
            if (u2Var != null) {
                u2Var.onAdClicked();
            }
        }

        @Override // com.tradplus.ads.open.nativead.NativeAdListener
        public final void onAdClosed(TPAdInfo tPAdInfo) {
            u2 u2Var = this.f83579b.f83715a;
            if (u2Var != null) {
                u2Var.onAdClosed();
            }
        }

        @Override // com.tradplus.ads.open.nativead.NativeAdListener
        public final void onAdImpression(TPAdInfo tPAdInfo) {
            this.f83579b.i();
            u2 u2Var = this.f83579b.f83715a;
            if (u2Var != null) {
                u2Var.a();
            }
            w2 w2VarB = v2.f83727a.b(tPAdInfo, this.f83579b.f83576d);
            u2 u2Var2 = this.f83579b.f83715a;
            if (u2Var2 != null) {
                u2Var2.h(w2VarB);
            }
        }

        @Override // com.tradplus.ads.open.nativead.NativeAdListener
        public final void onAdLoadFailed(TPAdError tPAdError) {
            g2 g2Var = this.f83579b;
            int errorCode = tPAdError != null ? tPAdError.getErrorCode() : 0;
            String errorMsg = tPAdError != null ? tPAdError.getErrorMsg() : null;
            u2 u2Var = g2Var.f83715a;
            if (u2Var != null) {
                u2Var.i(errorCode, errorMsg);
            }
        }

        @Override // com.tradplus.ads.open.nativead.NativeAdListener
        public final void onAdLoaded(TPAdInfo tPAdInfo, TPBaseAd tPBaseAd) {
            String str;
            String str2;
            String str3;
            q1 q1VarA = r.f83668a.a(30);
            if (q1VarA instanceof e2) {
                if (((e2) q1VarA).f83557c.contains(this.f83578a)) {
                    g2 g2Var = this.f83579b;
                    int code = kj.c.E_91109.getCode();
                    u2 u2Var = g2Var.f83715a;
                    if (u2Var != null) {
                        u2Var.i(code, "E_91109");
                        return;
                    }
                    return;
                }
            }
            g2.h(this.f83579b);
            g2 g2Var2 = this.f83579b;
            String str4 = "";
            if (tPAdInfo == null || (str = tPAdInfo.adSourceId) == null) {
                str = "";
            }
            g2Var2.f83577e = str;
            g2Var2.g(tPAdInfo);
            g2 g2Var3 = this.f83579b;
            v2 v2Var = v2.f83727a;
            if (tPAdInfo == null || (str2 = tPAdInfo.adNetworkId) == null) {
                str2 = "";
            }
            int iD = v2Var.d(str2);
            if (tPAdInfo != null && (str3 = tPAdInfo.adSourcePlacementId) != null) {
                str4 = str3;
            }
            u2 u2Var2 = g2Var3.f83715a;
            if (u2Var2 != null) {
                u2Var2.f(iD, str4);
            }
            kotlinx.coroutines.k.d(kotlinx.coroutines.v1.f87249a, null, null, new C1021a(this.f83579b, this.f83578a, null), 3, null);
        }

        @Override // com.tradplus.ads.open.nativead.NativeAdListener
        public final void onAdShowFailed(TPAdError tPAdError, TPAdInfo tPAdInfo) {
            this.f83579b.i();
            g2 g2Var = this.f83579b;
            int errorCode = tPAdError != null ? tPAdError.getErrorCode() : 0;
            String errorMsg = tPAdError != null ? tPAdError.getErrorMsg() : null;
            u2 u2Var = g2Var.f83715a;
            if (u2Var != null) {
                u2Var.e(errorCode, errorMsg);
            }
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

    public g2(u2 u2Var) {
        super(u2Var);
        this.f83575c = "";
        this.f83577e = "";
    }

    public static final void h(g2 g2Var) {
        g2Var.getClass();
        q1 q1VarA = r.f83668a.a(30);
        if (q1VarA instanceof e2) {
            ((e2) q1VarA).f83557c.add(g2Var.f83575c);
        }
    }

    @Override // hj.o2
    public final void a(String str, Map map) {
        fl.m0 m0Var;
        this.f83575c = str;
        Application applicationC = ij.a.c();
        if (applicationC != null) {
            v2.f83727a.c(str, 3);
            TPNative tPNative = new TPNative(applicationC, str);
            this.f83574b = tPNative;
            tPNative.setAutoLoadCallback(true);
            TPNative tPNative2 = this.f83574b;
            if (tPNative2 != null) {
                tPNative2.setAdListener(new a(this, str));
            }
            TPNative tPNative3 = this.f83574b;
            if (tPNative3 != null) {
                tPNative3.setAllAdLoadListener(new b());
            }
            TPNative tPNative4 = this.f83574b;
            if (tPNative4 != null && !tPNative4.isReady()) {
                i();
            }
            TPNative tPNative5 = this.f83574b;
            if (tPNative5 != null) {
                tPNative5.loadAd();
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

    @Override // hj.o2
    public final boolean b(Activity activity, ViewGroup viewGroup, nj.a aVar, String str) {
        if (this.f83574b == null || aVar == null) {
            return false;
        }
        try {
            if (aVar.getParent() instanceof ViewGroup) {
                ViewParent parent = aVar.getParent();
                parent.getClass();
                ((ViewGroup) parent).removeView(aVar);
            }
            TPNative tPNative = this.f83574b;
            if (tPNative == null) {
                return true;
            }
            tPNative.showAd(aVar, new i2(aVar, viewGroup), "");
            return true;
        } catch (Exception e10) {
            e10.printStackTrace();
            return false;
        }
    }

    @Override // hj.o2
    public final void c() {
        TPNative tPNative = this.f83574b;
        if (tPNative != null) {
            tPNative.setAdListener(null);
        }
        TPNative tPNative2 = this.f83574b;
        if (tPNative2 != null) {
            tPNative2.onDestroy();
        }
        this.f83574b = null;
    }

    @Override // hj.o2
    public final Boolean d() {
        TPNative tPNative = this.f83574b;
        if (tPNative != null && !tPNative.isReady()) {
            i();
        }
        return Boolean.FALSE;
    }

    @Override // hj.o2
    public final void e() {
        i();
    }

    @Override // hj.o2
    public final boolean f() {
        TPAdInfo tPAdInfo = TradPlusSdk.getTPAdInfo(this.f83575c);
        if (p003kotlin.jvm.internal.v.c(this.f83577e, tPAdInfo != null ? tPAdInfo.adSourceId : null) || tPAdInfo == null) {
            return false;
        }
        this.f83577e = tPAdInfo.adSourceId;
        g(tPAdInfo);
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

    public final void g(TPAdInfo tPAdInfo) {
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
                this.f83576d = dA;
                HashMap map = new HashMap();
                map.put("tx_platform", tPAdInfo.adNetworkId);
                map.put("tx_type", "native");
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

    public final void i() {
        q1 q1VarA = r.f83668a.a(30);
        if (q1VarA instanceof e2) {
            ((e2) q1VarA).f83557c.remove(this.f83575c);
        }
    }
}