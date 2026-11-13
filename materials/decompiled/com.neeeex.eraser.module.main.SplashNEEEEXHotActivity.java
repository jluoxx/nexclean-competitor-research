package com.neeeex.eraser.module.main;

import android.animation.ObjectAnimator;
import android.content.Context;
import android.os.Bundle;
import android.view.animation.DecelerateInterpolator;
import androidx.p002lifecycle.LifecycleOwnerKt;
import com.neeeex.eraser.base.RootActivity;
import com.neeeex.eraser.launcher.DefaultHomeController;
import com.neeeex.eraser.launcher.DefaultHomeOnboardingHelper;
import com.neeeex.eraser.launcher.OpenSceneAdPolicy;
import com.neeeex.eraser.push.service.NEEEEXFGService;
import gq.v0;
import kotlinx.coroutines.f1;
import kotlinx.coroutines.p0;
import kotlinx.coroutines.z0;
import p003kotlin.Metadata;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\r\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0006H\u0082@¢\u0006\u0004\b\t\u0010\nJ\u001b\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\f0\u000bH\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u0019\u0010\u0011\u001a\u00020\u00062\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fH\u0014¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0013\u001a\u00020\u0006H\u0014¢\u0006\u0004\b\u0013\u0010\u0003J\u000f\u0010\u0014\u001a\u00020\u0006H\u0014¢\u0006\u0004\b\u0014\u0010\u0003J\u000f\u0010\u0015\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0015\u0010\u0003J\u000f\u0010\u0016\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0016\u0010\u0003J\u000f\u0010\u0017\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0017\u0010\u0003J\u000f\u0010\u0018\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0018\u0010\u0003J\u001f\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u001b\u001a\u00020\u0019H\u0002¢\u0006\u0004\b\u001d\u0010\u001eJ\u0010\u0010\u001f\u001a\u00020\u0006H\u0082@¢\u0006\u0004\b\u001f\u0010\nJ \u0010\"\u001a\u00020\u00062\u0006\u0010 \u001a\u00020\f2\u0006\u0010!\u001a\u00020\fH\u0082@¢\u0006\u0004\b\"\u0010#J\u000f\u0010$\u001a\u00020\u0006H\u0002¢\u0006\u0004\b$\u0010\u0003R\u0016\u0010'\u001a\u00020\u001c8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b%\u0010&R\u0016\u0010)\u001a\u00020\u001c8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b(\u0010&R\u0016\u0010-\u001a\u00020*8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b+\u0010,R\u0016\u00100\u001a\u00020\u00198\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b.\u0010/R\u0016\u00104\u001a\u0002018\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b2\u00103¨\u00065"}, d2 = {"Lcom/neeeex/eraser/module/main/SplashNEEEEXHotActivity;", "Lcom/neeeex/eraser/base/RootActivity;", "<init>", "()V", "Landroid/content/Context;", "ctx", "Lfl/m0;", "o0", "(Landroid/content/Context;)V", "l0", "(Lkl/f;)Ljava/lang/Object;", "Lfl/t;", "", com.thinkup.core.common.m0.f69624d, "()Lfl/t;", "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "(Landroid/os/Bundle;)V", "onStart", "onStop", "onBackPressed", "s0", "t0", "u0", "", "waited", "openPhaseLimit", "", "p0", "(II)Z", "n0", "interEcpm", "openEcpm", "r0", "(DDLkl/f;)Ljava/lang/Object;", "q0", "c", "Z", "isForeground", "d", "extendedWait", "", "e", "Ljava/lang/String;", "adSceneId", "f", "I", "sourceType", "Lji/y;", "g", "Lji/y;", "binding", "tool-feature_productionRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class SplashNEEEEXHotActivity extends RootActivity {

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    public boolean isForeground;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    public boolean extendedWait;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    public String adSceneId = com.neeeex.eraser.m0.a("y3OvGlM8yUbIaKwIWA==\n", "mCTtWxB3lhU=\n");

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    public int sourceType;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    public ji.y binding;

    public static final class a extends ll.d {
        int I$0;
        int I$1;
        int I$2;
        int label;
        /* synthetic */ Object result;

        public a(kl.f<? super a> fVar) {
            super(fVar);
        }

        @Override // ll.a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return SplashNEEEEXHotActivity.this.l0(this);
        }
    }

    public static final class b extends ll.m implements tl.n {
        int label;

        public b(kl.f<? super b> fVar) {
            super(2, fVar);
        }

        @Override // ll.a
        public final kl.f<fl.m0> create(Object obj, kl.f<?> fVar) {
            return SplashNEEEEXHotActivity.this.new b(fVar);
        }

        @Override // tl.n
        public final Object invoke(p0 p0Var, kl.f<? super fl.m0> fVar) {
            return ((b) create(p0Var, fVar)).invokeSuspend(fl.m0.f80959a);
        }

        @Override // ll.a
        public final Object invokeSuspend(Object obj) {
            Object objF = p003kotlin.coroutines.intrinsics.c.f();
            int i10 = this.label;
            if (i10 == 0) {
                fl.v.b(obj);
                com.neeeex.eraser.ads.h hVar = com.neeeex.eraser.ads.h.f64923a;
                SplashNEEEEXHotActivity splashNEEEEXHotActivity = SplashNEEEEXHotActivity.this;
                this.label = 1;
                if (hVar.m(splashNEEEEXHotActivity, this) == objF) {
                    return objF;
                }
            } else {
                if (i10 != 1) {
                    v0.a(com.neeeex.eraser.m0.a("mpn9MGCJNdbeivQvNZA/0dma9Dovjz/W3pH/Ki+WP9HZj/goKN05mYuX5Cgpkz8=\n", "+fiRXED9WvY=\n"));
                    return null;
                }
                fl.v.b(obj);
            }
            return fl.m0.f80959a;
        }
    }

    public static final class c extends ll.m implements tl.n {
        final /* synthetic */ double $interEcpm;
        final /* synthetic */ double $openEcpm;
        Object L$0;
        int label;

        public static final class a implements com.neeeex.eraser.ads.o {
            @Override // com.neeeex.eraser.ads.o
            public void onAdClick() {
            }

            @Override // com.neeeex.eraser.ads.o
            public void onAdClose() {
            }

            @Override // com.neeeex.eraser.ads.o
            public void onAdShowFailed(oj.a aVar) {
            }

            @Override // com.neeeex.eraser.ads.o
            public void onAdShowSuccess(oj.a aVar) {
                OpenSceneAdPolicy.markOpenSceneAdShown();
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(double d10, double d11, kl.f<? super c> fVar) {
            super(2, fVar);
            this.$interEcpm = d10;
            this.$openEcpm = d11;
        }

        @Override // ll.a
        public final kl.f<fl.m0> create(Object obj, kl.f<?> fVar) {
            return SplashNEEEEXHotActivity.this.new c(this.$interEcpm, this.$openEcpm, fVar);
        }

        @Override // tl.n
        public final Object invoke(p0 p0Var, kl.f<? super fl.m0> fVar) {
            return ((c) create(p0Var, fVar)).invokeSuspend(fl.m0.f80959a);
        }

        @Override // ll.a
        public final Object invokeSuspend(Object obj) {
            Object objF = p003kotlin.coroutines.intrinsics.c.f();
            int i10 = this.label;
            if (i10 == 0) {
                fl.v.b(obj);
                if (SplashNEEEEXHotActivity.this.isFinishing() || SplashNEEEEXHotActivity.this.isDestroyed() || !SplashNEEEEXHotActivity.this.isForeground) {
                    return fl.m0.f80959a;
                }
                a aVar = new a();
                if (this.$interEcpm > this.$openEcpm) {
                    com.neeeex.eraser.ads.h hVar = com.neeeex.eraser.ads.h.f64923a;
                    hVar.h().a(SplashNEEEEXHotActivity.this.adSceneId);
                    com.neeeex.eraser.ads.m mVarH = hVar.h();
                    SplashNEEEEXHotActivity splashNEEEEXHotActivity = SplashNEEEEXHotActivity.this;
                    mVarH.f(splashNEEEEXHotActivity, splashNEEEEXHotActivity.adSceneId, aVar);
                } else {
                    com.neeeex.eraser.ads.h hVar2 = com.neeeex.eraser.ads.h.f64923a;
                    hVar2.e().a(SplashNEEEEXHotActivity.this.adSceneId);
                    com.neeeex.eraser.ads.k kVarE = hVar2.e();
                    SplashNEEEEXHotActivity splashNEEEEXHotActivity2 = SplashNEEEEXHotActivity.this;
                    kVarE.g(splashNEEEEXHotActivity2, splashNEEEEXHotActivity2.adSceneId, aVar);
                }
                this.L$0 = ll.l.a(aVar);
                this.label = 1;
                if (z0.b(100L, this) == objF) {
                    return objF;
                }
            } else {
                if (i10 != 1) {
                    v0.a(com.neeeex.eraser.m0.a("s1v3bg99Xtz3SP5xWmRU2/BY/mRAe1Tc91P1dEBiVNvwTfJ2RylSk6JV7nZGZ1Q=\n", "0DqbAi8JMfw=\n"));
                    return null;
                }
                fl.v.b(obj);
            }
            SplashNEEEEXHotActivity.this.finish();
            return fl.m0.f80959a;
        }
    }

    public static final class d extends ll.m implements tl.n {
        int label;

        public d(kl.f<? super d> fVar) {
            super(2, fVar);
        }

        @Override // ll.a
        public final kl.f<fl.m0> create(Object obj, kl.f<?> fVar) {
            return SplashNEEEEXHotActivity.this.new d(fVar);
        }

        @Override // tl.n
        public final Object invoke(p0 p0Var, kl.f<? super fl.m0> fVar) {
            return ((d) create(p0Var, fVar)).invokeSuspend(fl.m0.f80959a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:14:0x0039, code lost:
        
            if (r5.n0(r4) == r0) goto L15;
         */
        @Override // ll.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            Object objF = p003kotlin.coroutines.intrinsics.c.f();
            int i10 = this.label;
            if (i10 == 0) {
                fl.v.b(obj);
                SplashNEEEEXHotActivity splashNEEEEXHotActivity = SplashNEEEEXHotActivity.this;
                this.label = 1;
                if (splashNEEEEXHotActivity.l0(this) != objF) {
                }
                return objF;
            }
            if (i10 == 1) {
                fl.v.b(obj);
            } else {
                if (i10 != 2) {
                    v0.a(com.neeeex.eraser.m0.a("iOTOm5/xMXvM98eEyug7fMvnx5HQ9zt7zOzMgdDuO3zL8suD16U9NJnq14PW6zs=\n", "64Wi97+FXls=\n"));
                    return null;
                }
                fl.v.b(obj);
            }
            return fl.m0.f80959a;
            SplashNEEEEXHotActivity splashNEEEEXHotActivity2 = SplashNEEEEXHotActivity.this;
            this.label = 2;
        }
    }

    public static final class e extends ll.m implements tl.n {
        int label;

        public e(kl.f<? super e> fVar) {
            super(2, fVar);
        }

        @Override // ll.a
        public final kl.f<fl.m0> create(Object obj, kl.f<?> fVar) {
            return SplashNEEEEXHotActivity.this.new e(fVar);
        }

        @Override // tl.n
        public final Object invoke(p0 p0Var, kl.f<? super fl.m0> fVar) {
            return ((e) create(p0Var, fVar)).invokeSuspend(fl.m0.f80959a);
        }

        @Override // ll.a
        public final Object invokeSuspend(Object obj) {
            Object objF = p003kotlin.coroutines.intrinsics.c.f();
            int i10 = this.label;
            if (i10 == 0) {
                fl.v.b(obj);
                SplashNEEEEXHotActivity splashNEEEEXHotActivity = SplashNEEEEXHotActivity.this;
                this.label = 1;
                if (splashNEEEEXHotActivity.n0(this) == objF) {
                    return objF;
                }
            } else {
                if (i10 != 1) {
                    v0.a(com.neeeex.eraser.m0.a("HfIBCP2MO01Z4QgXqJUxSl7xCAKyijFNWfoDErKTMUpe5AQQtdg3Agz8GBC0ljE=\n", "fpNtZN34VG0=\n"));
                    return null;
                }
                fl.v.b(obj);
            }
            return fl.m0.f80959a;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:28:0x006d -> B:30:0x0070). Please report as a decompilation issue!!! */
    public final Object l0(kl.f fVar) {
        a aVar;
        int i10;
        int i11;
        int i12;
        if (fVar instanceof a) {
            aVar = (a) fVar;
            int i13 = aVar.label;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                aVar.label = i13 - Integer.MIN_VALUE;
            } else {
                aVar = new a(fVar);
            }
        } else {
            aVar = new a(fVar);
        }
        Object obj = aVar.result;
        Object objF = p003kotlin.coroutines.intrinsics.c.f();
        int i14 = aVar.label;
        if (i14 == 0) {
            fl.v.b(obj);
            boolean z10 = this.extendedWait;
            i10 = z10 ? 10500 : 5400;
            i11 = 0;
            i12 = z10 ? 8100 : 4200;
            if (this.isForeground || i11 >= i10 || p0(i11, i12)) {
                return fl.m0.f80959a;
            }
            aVar.I$0 = i10;
            aVar.I$1 = i12;
            aVar.I$2 = i11;
            aVar.label = 1;
            if (z0.b(300L, aVar) == objF) {
                return objF;
            }
        } else {
            if (i14 != 1) {
                v0.a(com.neeeex.eraser.m0.a("bmwHPChyUaAqfw4jfWtbpy1vDjZndFugKmQFJmdtW6ctegIkYCZd739iHiRhaFs=\n", "DQ1rUAgGPoA=\n"));
                return null;
            }
            i11 = aVar.I$2;
            i12 = aVar.I$1;
            i10 = aVar.I$0;
            fl.v.b(obj);
        }
        i11 += 300;
        if (this.isForeground) {
        }
        return fl.m0.f80959a;
    }

    private final fl.t m0() {
        com.neeeex.eraser.ads.h hVar = com.neeeex.eraser.ads.h.f64923a;
        return fl.z.a(Double.valueOf(hVar.h().c()), Double.valueOf(hVar.e().c()));
    }

    private final void o0(Context ctx) {
        kotlinx.coroutines.k.d(LifecycleOwnerKt.getLifecycleScope(this), null, null, new b(null), 3, null);
    }

    public final Object n0(kl.f fVar) {
        if (!this.isForeground) {
            finish();
            return fl.m0.f80959a;
        }
        fl.t tVarM0 = m0();
        double dDoubleValue = ((Number) tVarM0.component1()).doubleValue();
        double dDoubleValue2 = ((Number) tVarM0.component2()).doubleValue();
        if (dDoubleValue > -0.1d || dDoubleValue2 > -0.1d) {
            Object objR0 = r0(dDoubleValue, dDoubleValue2, fVar);
            return objR0 == p003kotlin.coroutines.intrinsics.c.f() ? objR0 : fl.m0.f80959a;
        }
        com.neeeex.eraser.ads.h.f64923a.e().a(this.adSceneId);
        finish();
        return fl.m0.f80959a;
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void onBackPressed() {
    }

    @Override // com.neeeex.eraser.base.RootActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        this.isForeground = true;
        com.neeeex.eraser.ads.e.N = false;
        o0(this);
        ji.y yVarC = ji.y.c(getLayoutInflater());
        com.neeeex.eraser.m0.a("AySg416ZDtlEZOim\n", "akrGjz/ta/E=\n");
        yVarC.getClass();
        this.binding = yVarC;
        if (yVarC == null) {
            p003kotlin.jvm.internal.v.n(com.neeeex.eraser.m0.a("w5QdJVhiaw==\n", "of1zQTEMDGw=\n"));
            yVarC = null;
        }
        setContentView(yVarC.getRoot());
        long jCurrentTimeMillis = System.currentTimeMillis();
        com.neeeex.eraser.l0 l0Var = com.neeeex.eraser.l0.f65085a;
        boolean z10 = jCurrentTimeMillis - l0Var.c() > l0Var.b();
        this.extendedWait = z10;
        if (z10 && com.neeeex.eraser.module.report.bytedance.a.k() && !DefaultHomeController.INSTANCE.isDefaultHome(this)) {
            DefaultHomeOnboardingHelper.INSTANCE.markPromptAfterHotSplash(this);
        }
        q0();
        s0();
        if (this.sourceType == 10) {
            u0();
        } else {
            t0();
        }
    }

    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onStart() {
        this.isForeground = true;
        super.onStart();
    }

    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onStop() {
        this.isForeground = false;
        super.onStop();
    }

    public final boolean p0(int waited, int openPhaseLimit) {
        com.neeeex.eraser.ads.h hVar = com.neeeex.eraser.ads.h.f64923a;
        com.neeeex.eraser.ads.k kVarE = hVar.e();
        com.neeeex.eraser.ads.m mVarH = hVar.h();
        double dC = kVarE.c();
        double dC2 = mVarH.c();
        if (waited < openPhaseLimit) {
            return (dC > -0.1d && (kVarE.e() || kVarE.b())) || (kVarE.b() && (dC2 > -0.1d || mVarH.b()));
        }
        return dC2 > -0.1d || dC > -0.1d || (kVarE.b() && mVarH.b());
    }

    public final void q0() {
        this.sourceType = getIntent().getIntExtra(com.neeeex.eraser.m0.a("QtF3FA==\n", "JKMYeTwBFrg=\n"), 0);
    }

    public final Object r0(double d10, double d11, kl.f fVar) {
        Object objG = kotlinx.coroutines.i.g(f1.c(), new c(d10, d11, null), fVar);
        return objG == p003kotlin.coroutines.intrinsics.c.f() ? objG : fl.m0.f80959a;
    }

    public final void s0() {
        mi.a aVar = mi.a.f88870a;
        aVar.W();
        aVar.X();
        ni.i.f89495a.G();
        if (ui.a.f100035a.a(this)) {
            aVar.g0();
        }
        if (com.neeeex.eraser.utils.c0.f66142a.a(this)) {
            aVar.U();
        }
    }

    public final void t0() {
        NEEEEXFGService.INSTANCE.b(this);
        ji.y yVar = this.binding;
        if (yVar == null) {
            p003kotlin.jvm.internal.v.n(com.neeeex.eraser.m0.a("pNOzCq7Ljg==\n", "xrrdbsel6Xk=\n"));
            yVar = null;
        }
        ObjectAnimator objectAnimatorOfInt = ObjectAnimator.ofInt(yVar.f85743c, com.neeeex.eraser.m0.a("S0JLIuWiGjs=\n", "OzAkRZfHaUg=\n"), 0, 100);
        objectAnimatorOfInt.setDuration(this.extendedWait ? 10400L : 5300L);
        objectAnimatorOfInt.setInterpolator(new DecelerateInterpolator());
        objectAnimatorOfInt.start();
        kotlinx.coroutines.k.d(LifecycleOwnerKt.getLifecycleScope(this), null, null, new d(null), 3, null);
    }

    public final void u0() {
        NEEEEXFGService.INSTANCE.b(this);
        kotlinx.coroutines.k.d(LifecycleOwnerKt.getLifecycleScope(this), null, null, new e(null), 3, null);
    }
}