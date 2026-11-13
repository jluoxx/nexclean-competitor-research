package hj;

import android.app.Application;
import com.google.android.libraries.ads.mobile.sdk.MobileAds;
import com.google.android.libraries.ads.mobile.sdk.initialization.InitializationConfig;
import com.google.android.libraries.ads.mobile.sdk.initialization.InitializationStatus;
import com.google.android.libraries.ads.mobile.sdk.initialization.OnAdapterInitializationCompleteListener;

/* JADX INFO: loaded from: classes7.dex */
public final class d0 extends ll.m implements tl.n {
    public final /* synthetic */ b.C1016b OooO00o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d0(b.C1016b c1016b, kl.f fVar) {
        super(2, fVar);
        this.OooO00o = c1016b;
    }

    @Override // tl.n
    /* JADX INFO: renamed from: OooO00o, reason: merged with bridge method [inline-methods] */
    public final Object invoke(kotlinx.coroutines.p0 p0Var, kl.f<? super fl.m0> fVar) {
        return new d0(this.OooO00o, fVar).invokeSuspend(fl.m0.f80959a);
    }

    @Override // ll.a
    public final kl.f<fl.m0> create(Object obj, kl.f<?> fVar) {
        return new d0(this.OooO00o, fVar);
    }

    @Override // ll.a
    public final Object invokeSuspend(Object obj) {
        p003kotlin.coroutines.intrinsics.c.f();
        fl.v.b(obj);
        try {
            Application applicationC = ij.a.c();
            b.C1016b c1016b = this.OooO00o;
            if (applicationC != null) {
                u0.f83705a.getClass();
                a0 a0Var = u0.f83713i;
                if (a0Var != null) {
                    MobileAds.INSTANCE.initialize(applicationC, new InitializationConfig.Builder(a0Var.f83507a).build(), new OnAdapterInitializationCompleteListener() { // from class: hj.c0
                        @Override // com.google.android.libraries.ads.mobile.sdk.initialization.OnAdapterInitializationCompleteListener
                        public final void onAdapterInitializationComplete(InitializationStatus initializationStatus) {
                            d0.OooO00o(initializationStatus);
                        }
                    });
                    b.this.d(true, "");
                } else {
                    b.this.d(false, "error002");
                }
            } else {
                b.this.d(false, "error001");
            }
        } catch (Throwable th2) {
            b.C1016b c1016b2 = this.OooO00o;
            b.this.d(false, th2.getMessage());
        }
        return fl.m0.f80959a;
    }

    public static final void OooO00o(InitializationStatus initializationStatus) {
    }
}