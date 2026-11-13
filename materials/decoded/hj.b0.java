package hj;

import com.google.android.libraries.ads.mobile.sdk.common.AdLoadCallback;
import com.google.android.libraries.ads.mobile.sdk.common.AdSourceResponseInfo;
import com.google.android.libraries.ads.mobile.sdk.common.LoadAdError;
import com.google.android.libraries.ads.mobile.sdk.common.ResponseInfo;
import com.google.android.libraries.ads.mobile.sdk.rewarded.RewardedAd;
import java.util.Map;

/* JADX INFO: loaded from: classes7.dex */
public final class b0 extends s {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public RewardedAd f83516b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public String f83517c;

    public static final class a extends ll.m implements tl.n {
        public final /* synthetic */ String OooO00o;
        public final /* synthetic */ b0 OooO0O0;

        /* JADX INFO: renamed from: hj.b0$a$a, reason: collision with other inner class name */
        public static final class C1017a implements AdLoadCallback {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final /* synthetic */ b0 f83518a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ String f83519b;

            public C1017a(b0 b0Var, String str) {
                this.f83518a = b0Var;
                this.f83519b = str;
            }

            @Override // com.google.android.libraries.ads.mobile.sdk.common.AdLoadCallback
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final void onAdLoaded(RewardedAd rewardedAd) {
                String id2;
                u2 u2Var;
                ResponseInfo responseInfo;
                AdSourceResponseInfo loadedAdSourceResponseInfo;
                String instanceId;
                ResponseInfo responseInfo2;
                AdSourceResponseInfo loadedAdSourceResponseInfo2;
                b0 b0Var = this.f83518a;
                b0Var.f83516b = rewardedAd;
                String str = "";
                if (rewardedAd == null || (responseInfo2 = rewardedAd.getResponseInfo()) == null || (loadedAdSourceResponseInfo2 = responseInfo2.getLoadedAdSourceResponseInfo()) == null || (id2 = loadedAdSourceResponseInfo2.getId()) == null) {
                    id2 = "";
                }
                b0Var.f83517c = id2;
                RewardedAd rewardedAd2 = this.f83518a.f83516b;
                if (rewardedAd2 != null && (responseInfo = rewardedAd2.getResponseInfo()) != null && (loadedAdSourceResponseInfo = responseInfo.getLoadedAdSourceResponseInfo()) != null && (instanceId = loadedAdSourceResponseInfo.getInstanceId()) != null) {
                    str = instanceId;
                }
                f0 f0Var = f0.f83559a;
                double dE = f0Var.b(this.f83518a.f83517c) != 4 ? l0.f83618a.e(rewardedAd) : 0.0d;
                if (dE > 1.0E-9d) {
                    u2 u2Var2 = this.f83518a.f83715a;
                    if (u2Var2 != null) {
                        u2Var2.g(dE);
                    }
                } else {
                    double dA = y.f83761a.a(this.f83519b);
                    if (dA > 1.0E-9d && (u2Var = this.f83518a.f83715a) != null) {
                        u2Var.g(dA);
                    }
                }
                b0 b0Var2 = this.f83518a;
                int iB = f0Var.b(b0Var2.f83517c);
                u2 u2Var3 = b0Var2.f83715a;
                if (u2Var3 != null) {
                    u2Var3.f(iB, str);
                }
                u2 u2Var4 = this.f83518a.f83715a;
                if (u2Var4 != null) {
                    u2Var4.c();
                }
            }

            @Override // com.google.android.libraries.ads.mobile.sdk.common.AdLoadCallback
            public final void onAdFailedToLoad(LoadAdError loadAdError) {
                b0 b0Var = this.f83518a;
                int iOrdinal = loadAdError.getCode().ordinal();
                String message = loadAdError.getMessage();
                u2 u2Var = b0Var.f83715a;
                if (u2Var != null) {
                    u2Var.i(iOrdinal, message);
                }
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(String str, b0 b0Var, kl.f fVar) {
            super(2, fVar);
            this.OooO00o = str;
            this.OooO0O0 = b0Var;
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
                RewardedAd.INSTANCE.load(f0.f83559a.d(this.OooO00o, 4), new C1017a(this.OooO0O0, this.OooO00o));
            } catch (Throwable unused) {
                b0 b0Var = this.OooO0O0;
                int code = kj.c.E_91107.getCode();
                u2 u2Var = b0Var.f83715a;
                if (u2Var != null) {
                    u2Var.i(code, "E_91107");
                }
            }
            return fl.m0.f80959a;
        }
    }

    public b0(u2 u2Var) {
        super(u2Var);
        this.f83517c = "";
    }

    @Override // hj.s
    public final boolean a() {
        return false;
    }

    @Override // hj.s
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

    @Override // hj.s
    public final void c() {
        this.f83516b = null;
    }

    @Override // hj.s
    public final Boolean d() {
        return Boolean.valueOf(this.f83516b == null);
    }

    @Override // hj.s
    public final void e() {
    }
}