package hj;

import android.app.Activity;
import com.google.android.libraries.ads.mobile.sdk.appopen.AppOpenAd;
import com.google.android.libraries.ads.mobile.sdk.appopen.AppOpenAdEventCallback;
import com.google.android.libraries.ads.mobile.sdk.common.AdLoadCallback;
import com.google.android.libraries.ads.mobile.sdk.common.AdSourceResponseInfo;
import com.google.android.libraries.ads.mobile.sdk.common.AdValue;
import com.google.android.libraries.ads.mobile.sdk.common.FullScreenContentError;
import com.google.android.libraries.ads.mobile.sdk.common.LoadAdError;
import com.google.android.libraries.ads.mobile.sdk.common.ResponseInfo;
import java.util.Map;

/* JADX INFO: loaded from: classes7.dex */
public final class z extends c {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public AppOpenAd f83777b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public String f83778c;

    public static final class a extends ll.m implements tl.n {
        public final /* synthetic */ String OooO00o;
        public final /* synthetic */ z OooO0O0;

        /* JADX INFO: renamed from: hj.z$a$a, reason: collision with other inner class name */
        public static final class C1033a implements AdLoadCallback {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final /* synthetic */ z f83779a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ String f83780b;

            public C1033a(z zVar, String str) {
                this.f83779a = zVar;
                this.f83780b = str;
            }

            @Override // com.google.android.libraries.ads.mobile.sdk.common.AdLoadCallback
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final void onAdLoaded(AppOpenAd appOpenAd) {
                String id2;
                u2 u2Var;
                ResponseInfo responseInfo;
                AdSourceResponseInfo loadedAdSourceResponseInfo;
                String instanceId;
                ResponseInfo responseInfo2;
                AdSourceResponseInfo loadedAdSourceResponseInfo2;
                z zVar = this.f83779a;
                zVar.f83777b = appOpenAd;
                String str = "";
                if (appOpenAd == null || (responseInfo2 = appOpenAd.getResponseInfo()) == null || (loadedAdSourceResponseInfo2 = responseInfo2.getLoadedAdSourceResponseInfo()) == null || (id2 = loadedAdSourceResponseInfo2.getId()) == null) {
                    id2 = "";
                }
                zVar.f83778c = id2;
                AppOpenAd appOpenAd2 = this.f83779a.f83777b;
                if (appOpenAd2 != null && (responseInfo = appOpenAd2.getResponseInfo()) != null && (loadedAdSourceResponseInfo = responseInfo.getLoadedAdSourceResponseInfo()) != null && (instanceId = loadedAdSourceResponseInfo.getInstanceId()) != null) {
                    str = instanceId;
                }
                f0 f0Var = f0.f83559a;
                double dA = f0Var.b(this.f83779a.f83778c) != 4 ? l0.f83618a.a(appOpenAd) : 0.0d;
                if (dA > 1.0E-9d) {
                    u2 u2Var2 = this.f83779a.f83715a;
                    if (u2Var2 != null) {
                        u2Var2.g(dA);
                    }
                } else {
                    double dA2 = y.f83761a.a(this.f83780b);
                    if (dA2 > 1.0E-9d && (u2Var = this.f83779a.f83715a) != null) {
                        u2Var.g(dA2);
                    }
                }
                z zVar2 = this.f83779a;
                int iB = f0Var.b(zVar2.f83778c);
                u2 u2Var3 = zVar2.f83715a;
                if (u2Var3 != null) {
                    u2Var3.f(iB, str);
                }
                u2 u2Var4 = this.f83779a.f83715a;
                if (u2Var4 != null) {
                    u2Var4.c();
                }
            }

            @Override // com.google.android.libraries.ads.mobile.sdk.common.AdLoadCallback
            public final void onAdFailedToLoad(LoadAdError loadAdError) {
                z zVar = this.f83779a;
                int iOrdinal = loadAdError.getCode().ordinal();
                String message = loadAdError.getMessage();
                u2 u2Var = zVar.f83715a;
                if (u2Var != null) {
                    u2Var.i(iOrdinal, message);
                }
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(String str, z zVar, kl.f fVar) {
            super(2, fVar);
            this.OooO00o = str;
            this.OooO0O0 = zVar;
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
                AppOpenAd.INSTANCE.load(f0.f83559a.d(this.OooO00o, 5), new C1033a(this.OooO0O0, this.OooO00o));
            } catch (Throwable unused) {
                z zVar = this.OooO0O0;
                int code = kj.c.E_91107.getCode();
                u2 u2Var = zVar.f83715a;
                if (u2Var != null) {
                    u2Var.i(code, "E_91107");
                }
            }
            return fl.m0.f80959a;
        }
    }

    public static final class b implements AppOpenAdEventCallback {
        public b() {
        }

        @Override // com.google.android.libraries.ads.mobile.sdk.common.AdEventCallback
        public final void onAdClicked() {
            u2 u2Var = z.this.f83715a;
            if (u2Var != null) {
                u2Var.onAdClicked();
            }
        }

        @Override // com.google.android.libraries.ads.mobile.sdk.common.AdEventCallback
        public final void onAdDismissedFullScreenContent() {
            u2 u2Var = z.this.f83715a;
            if (u2Var != null) {
                u2Var.onAdClosed();
            }
        }

        @Override // com.google.android.libraries.ads.mobile.sdk.common.AdEventCallback
        public final void onAdFailedToShowFullScreenContent(FullScreenContentError fullScreenContentError) {
            z zVar = z.this;
            int iOrdinal = fullScreenContentError.getCode().ordinal();
            String message = fullScreenContentError.getMessage();
            u2 u2Var = zVar.f83715a;
            if (u2Var != null) {
                u2Var.e(iOrdinal, message);
            }
        }

        @Override // com.google.android.libraries.ads.mobile.sdk.common.AdEventCallback
        public final void onAdImpression() {
            u2 u2Var = z.this.f83715a;
            if (u2Var != null) {
                u2Var.a();
            }
        }

        @Override // com.google.android.libraries.ads.mobile.sdk.common.AdEventCallback
        public final void onAdPaid(AdValue adValue) {
            String id2;
            ResponseInfo responseInfo;
            AdSourceResponseInfo loadedAdSourceResponseInfo;
            if (z.this.f83778c.length() == 0) {
                z zVar = z.this;
                AppOpenAd appOpenAd = zVar.f83777b;
                if (appOpenAd == null || (responseInfo = appOpenAd.getResponseInfo()) == null || (loadedAdSourceResponseInfo = responseInfo.getLoadedAdSourceResponseInfo()) == null || (id2 = loadedAdSourceResponseInfo.getId()) == null) {
                    id2 = "";
                }
                zVar.f83778c = id2;
            }
            w2 w2VarF = f0.f83559a.f(adValue, z.this.f83778c);
            u2 u2Var = z.this.f83715a;
            if (u2Var != null) {
                u2Var.h(w2VarF);
            }
        }

        @Override // com.google.android.libraries.ads.mobile.sdk.common.AdEventCallback
        public final void onAdShowedFullScreenContent() {
        }
    }

    public z(u2 u2Var) {
        super(u2Var);
        this.f83778c = "";
    }

    @Override // hj.c
    public final boolean a() {
        return false;
    }

    @Override // hj.c
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

    @Override // hj.c
    public final boolean c(Activity activity, String str) {
        AppOpenAd appOpenAd = this.f83777b;
        if (appOpenAd == null) {
            return false;
        }
        appOpenAd.setAdEventCallback(new b());
        appOpenAd.show(activity);
        return true;
    }

    @Override // hj.c
    public final void d() {
        this.f83777b = null;
    }

    @Override // hj.c
    public final boolean e() {
        return this.f83777b == null;
    }

    @Override // hj.c
    public final void f() {
    }
}