package hj;

import android.app.Activity;
import com.google.android.libraries.ads.mobile.sdk.common.AdLoadCallback;
import com.google.android.libraries.ads.mobile.sdk.common.AdSourceResponseInfo;
import com.google.android.libraries.ads.mobile.sdk.common.AdValue;
import com.google.android.libraries.ads.mobile.sdk.common.FullScreenContentError;
import com.google.android.libraries.ads.mobile.sdk.common.LoadAdError;
import com.google.android.libraries.ads.mobile.sdk.common.ResponseInfo;
import com.google.android.libraries.ads.mobile.sdk.interstitial.InterstitialAd;
import com.google.android.libraries.ads.mobile.sdk.interstitial.InterstitialAdEventCallback;
import java.util.Map;

/* JADX INFO: loaded from: classes7.dex */
public final class n0 extends v1 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public InterstitialAd f83635b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public String f83636c;

    public static final class a extends ll.m implements tl.n {
        public final /* synthetic */ String OooO00o;
        public final /* synthetic */ n0 OooO0O0;

        /* JADX INFO: renamed from: hj.n0$a$a, reason: collision with other inner class name */
        public static final class C1025a implements AdLoadCallback {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final /* synthetic */ n0 f83637a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ String f83638b;

            public C1025a(n0 n0Var, String str) {
                this.f83637a = n0Var;
                this.f83638b = str;
            }

            @Override // com.google.android.libraries.ads.mobile.sdk.common.AdLoadCallback
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final void onAdLoaded(InterstitialAd interstitialAd) {
                String id2;
                u2 u2Var;
                ResponseInfo responseInfo;
                AdSourceResponseInfo loadedAdSourceResponseInfo;
                String instanceId;
                ResponseInfo responseInfo2;
                AdSourceResponseInfo loadedAdSourceResponseInfo2;
                n0 n0Var = this.f83637a;
                n0Var.f83635b = interstitialAd;
                String str = "";
                if (interstitialAd == null || (responseInfo2 = interstitialAd.getResponseInfo()) == null || (loadedAdSourceResponseInfo2 = responseInfo2.getLoadedAdSourceResponseInfo()) == null || (id2 = loadedAdSourceResponseInfo2.getId()) == null) {
                    id2 = "";
                }
                n0Var.f83636c = id2;
                InterstitialAd interstitialAd2 = this.f83637a.f83635b;
                if (interstitialAd2 != null && (responseInfo = interstitialAd2.getResponseInfo()) != null && (loadedAdSourceResponseInfo = responseInfo.getLoadedAdSourceResponseInfo()) != null && (instanceId = loadedAdSourceResponseInfo.getInstanceId()) != null) {
                    str = instanceId;
                }
                f0 f0Var = f0.f83559a;
                double dC = f0Var.b(this.f83637a.f83636c) != 4 ? l0.f83618a.c(interstitialAd) : 0.0d;
                if (dC > 1.0E-9d) {
                    u2 u2Var2 = this.f83637a.f83715a;
                    if (u2Var2 != null) {
                        u2Var2.g(dC);
                    }
                } else {
                    double dA = y.f83761a.a(this.f83638b);
                    if (dA > 1.0E-9d && (u2Var = this.f83637a.f83715a) != null) {
                        u2Var.g(dA);
                    }
                }
                n0 n0Var2 = this.f83637a;
                int iB = f0Var.b(n0Var2.f83636c);
                u2 u2Var3 = n0Var2.f83715a;
                if (u2Var3 != null) {
                    u2Var3.f(iB, str);
                }
                u2 u2Var4 = this.f83637a.f83715a;
                if (u2Var4 != null) {
                    u2Var4.c();
                }
            }

            @Override // com.google.android.libraries.ads.mobile.sdk.common.AdLoadCallback
            public final void onAdFailedToLoad(LoadAdError loadAdError) {
                n0 n0Var = this.f83637a;
                int iOrdinal = loadAdError.getCode().ordinal();
                String message = loadAdError.getMessage();
                u2 u2Var = n0Var.f83715a;
                if (u2Var != null) {
                    u2Var.i(iOrdinal, message);
                }
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(String str, n0 n0Var, kl.f fVar) {
            super(2, fVar);
            this.OooO00o = str;
            this.OooO0O0 = n0Var;
        }

        @Override // tl.n
        /* JADX INFO: renamed from: OooO00o, reason: merged with bridge method [inline-methods] */
        public final Object invoke(kotlinx.coroutines.p0 p0Var, kl.f<? super fl.m0> fVar) {
            return new a(this.OooO00o, this.OooO0O0, fVar).invokeSuspend(fl.m0.f80959a);
        }

        @Override // ll.a
        public final kl.f<fl.m0> create(Object obj, kl.f<?> fVar) {
            return new a(this.OooO00o, this.OooO0O0, fVar);
        }

        @Override // ll.a
        public final Object invokeSuspend(Object obj) {
            p003kotlin.coroutines.intrinsics.c.f();
            fl.v.b(obj);
            try {
                InterstitialAd.INSTANCE.load(f0.f83559a.d(this.OooO00o, 2), new C1025a(this.OooO0O0, this.OooO00o));
            } catch (Throwable unused) {
                n0 n0Var = this.OooO0O0;
                int code = kj.c.E_91107.getCode();
                u2 u2Var = n0Var.f83715a;
                if (u2Var != null) {
                    u2Var.i(code, "E_91107");
                }
            }
            return fl.m0.f80959a;
        }
    }

    public static final class b implements InterstitialAdEventCallback {
        public b() {
        }

        @Override // com.google.android.libraries.ads.mobile.sdk.common.AdEventCallback
        public final void onAdClicked() {
            u2 u2Var = n0.this.f83715a;
            if (u2Var != null) {
                u2Var.onAdClicked();
            }
        }

        @Override // com.google.android.libraries.ads.mobile.sdk.common.AdEventCallback
        public final void onAdDismissedFullScreenContent() {
            u2 u2Var = n0.this.f83715a;
            if (u2Var != null) {
                u2Var.onAdClosed();
            }
        }

        @Override // com.google.android.libraries.ads.mobile.sdk.common.AdEventCallback
        public final void onAdFailedToShowFullScreenContent(FullScreenContentError fullScreenContentError) {
            n0 n0Var = n0.this;
            int iOrdinal = fullScreenContentError.getCode().ordinal();
            String message = fullScreenContentError.getMessage();
            u2 u2Var = n0Var.f83715a;
            if (u2Var != null) {
                u2Var.e(iOrdinal, message);
            }
        }

        @Override // com.google.android.libraries.ads.mobile.sdk.common.AdEventCallback
        public final void onAdImpression() {
            u2 u2Var = n0.this.f83715a;
            if (u2Var != null) {
                u2Var.a();
            }
        }

        @Override // com.google.android.libraries.ads.mobile.sdk.common.AdEventCallback
        public final void onAdPaid(AdValue adValue) {
            String id2;
            ResponseInfo responseInfo;
            AdSourceResponseInfo loadedAdSourceResponseInfo;
            if (n0.this.f83636c.length() == 0) {
                n0 n0Var = n0.this;
                InterstitialAd interstitialAd = n0Var.f83635b;
                if (interstitialAd == null || (responseInfo = interstitialAd.getResponseInfo()) == null || (loadedAdSourceResponseInfo = responseInfo.getLoadedAdSourceResponseInfo()) == null || (id2 = loadedAdSourceResponseInfo.getId()) == null) {
                    id2 = "";
                }
                n0Var.f83636c = id2;
            }
            w2 w2VarF = f0.f83559a.f(adValue, n0.this.f83636c);
            u2 u2Var = n0.this.f83715a;
            if (u2Var != null) {
                u2Var.h(w2VarF);
            }
        }

        @Override // com.google.android.libraries.ads.mobile.sdk.common.AdEventCallback
        public final void onAdShowedFullScreenContent() {
        }

        @Override // com.google.android.libraries.ads.mobile.sdk.interstitial.InterstitialAdEventCallback, com.google.android.libraries.ads.mobile.sdk.common.OnAppEventListener
        public final /* bridge */ void onAppEvent(String str, String str2) {
            super.onAppEvent(str, str2);
        }
    }

    public n0(u2 u2Var) {
        super(u2Var);
        this.f83636c = "";
    }

    @Override // hj.v1
    public final boolean a() {
        return false;
    }

    @Override // hj.v1
    public final void b(String str, Map map) {
        if (ij.a.c() == null || kotlinx.coroutines.k.d(kotlinx.coroutines.v1.f87249a, kotlinx.coroutines.f1.c(), null, new a(str, this, null), 2, null) == null) {
            int code = kj.c.E_91108.getCode();
            u2 u2Var = this.f83715a;
            if (u2Var != null) {
                u2Var.i(code, "E_91108");
            }
            fl.m0 m0Var = fl.m0.f80959a;
        }
    }

    @Override // hj.v1
    public final boolean c(Activity activity, String str) {
        InterstitialAd interstitialAd = this.f83635b;
        if (interstitialAd == null) {
            return false;
        }
        interstitialAd.setAdEventCallback(new b());
        interstitialAd.show(activity);
        return true;
    }

    @Override // hj.v1
    public final void d() {
        this.f83635b = null;
    }

    @Override // hj.v1
    public final boolean e() {
        return this.f83635b == null;
    }

    @Override // hj.v1
    public final void f() {
    }
}