package com.neeeex.eraser.module.main;

import android.animation.ObjectAnimator;
import android.app.Application;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.os.Looper;
import android.view.animation.DecelerateInterpolator;
import androidx.p002lifecycle.LifecycleOwnerKt;
import androidx.p002lifecycle.Observer;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.neeeex.eraser.base.RootActivity;
import com.neeeex.eraser.launcher.DesktopNavigation;
import com.neeeex.eraser.launcher.DesktopNavigator;
import com.neeeex.eraser.launcher.DesktopRoutePolicy;
import com.neeeex.eraser.launcher.FirstMinusOneEntryPath;
import com.neeeex.eraser.launcher.NewUserDesktopFunnelTracker;
import com.neeeex.eraser.launcher.OpenSceneAdPolicy;
import com.neeeex.eraser.launcher.StartupRoutePolicy;
import com.neeeex.eraser.launcher.StartupStateStore;
import com.neeeex.eraser.push.service.NEEEEXFGService;
import gq.v0;
import java.util.Timer;
import java.util.TimerTask;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.p0;
import kotlinx.coroutines.z0;
import p003kotlin.Metadata;
import p003kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000|\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0006\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\t\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\t\u0010\u0003J\u000f\u0010\n\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\n\u0010\u0003J\u000f\u0010\u000b\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u000b\u0010\u0003J\u000f\u0010\f\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\f\u0010\u0003J\u000f\u0010\r\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\r\u0010\u0003J\u0010\u0010\u000e\u001a\u00020\u0006H\u0082@¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0011\u001a\u00020\u0010H\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u001b\u0010\u0017\u001a\u000e\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\u00160\u0015H\u0002¢\u0006\u0004\b\u0017\u0010\u0018J\u001f\u0010\u001b\u001a\u00020\u00122\u0006\u0010\u0019\u001a\u00020\u00162\u0006\u0010\u001a\u001a\u00020\u0016H\u0002¢\u0006\u0004\b\u001b\u0010\u001cJ\u001f\u0010\u001d\u001a\u00020\u00062\u0006\u0010\u0019\u001a\u00020\u00162\u0006\u0010\u001a\u001a\u00020\u0016H\u0002¢\u0006\u0004\b\u001d\u0010\u001eJ\u000f\u0010 \u001a\u00020\u001fH\u0002¢\u0006\u0004\b \u0010!J\u0017\u0010$\u001a\u00020\u00062\u0006\u0010#\u001a\u00020\"H\u0002¢\u0006\u0004\b$\u0010%J\u000f\u0010&\u001a\u00020\u0006H\u0002¢\u0006\u0004\b&\u0010\u0003J\u000f\u0010'\u001a\u00020\u0006H\u0002¢\u0006\u0004\b'\u0010\u0003J\u000f\u0010(\u001a\u00020\u0006H\u0002¢\u0006\u0004\b(\u0010\u0003J\u000f\u0010)\u001a\u00020\u0006H\u0002¢\u0006\u0004\b)\u0010\u0003J\u000f\u0010*\u001a\u00020\u0006H\u0002¢\u0006\u0004\b*\u0010\u0003J\u0019\u0010-\u001a\u00020\u00062\b\u0010,\u001a\u0004\u0018\u00010+H\u0014¢\u0006\u0004\b-\u0010.J\u000f\u0010/\u001a\u00020\u0006H\u0014¢\u0006\u0004\b/\u0010\u0003J\u0017\u00102\u001a\u00020\u00062\u0006\u00101\u001a\u000200H\u0014¢\u0006\u0004\b2\u00103J\u000f\u00104\u001a\u00020\u0006H\u0014¢\u0006\u0004\b4\u0010\u0003J\u000f\u00105\u001a\u00020\u0006H\u0014¢\u0006\u0004\b5\u0010\u0003J\u000f\u00106\u001a\u00020\u0006H\u0014¢\u0006\u0004\b6\u0010\u0003J\u000f\u00107\u001a\u00020\u0006H\u0016¢\u0006\u0004\b7\u0010\u0003J\r\u00108\u001a\u00020\u0012¢\u0006\u0004\b8\u00109J\r\u0010:\u001a\u00020\u0006¢\u0006\u0004\b:\u0010\u0003J\u0017\u0010<\u001a\u00020\u00062\u0006\u0010;\u001a\u00020+H\u0014¢\u0006\u0004\b<\u0010.R\u0016\u0010?\u001a\u00020\u00128\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b=\u0010>R\u0016\u0010A\u001a\u00020\u00128\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b@\u0010>R\u0014\u0010D\u001a\u00020\"8\u0002X\u0082D¢\u0006\u0006\n\u0004\bB\u0010CR\u0018\u0010H\u001a\u0004\u0018\u00010E8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bF\u0010GR\u0016\u0010J\u001a\u00020\u00128\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bI\u0010>R\u0016\u0010N\u001a\u00020K8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bL\u0010MR\u0016\u0010R\u001a\u00020O8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\bP\u0010QR\u0016\u0010U\u001a\u00020\u00108\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bS\u0010TR\u0016\u0010W\u001a\u00020\u00128\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bV\u0010>R\u0016\u0010Y\u001a\u00020\u00128\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bX\u0010>R\u0016\u0010[\u001a\u00020\u00128\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bZ\u0010>R\u0016\u0010]\u001a\u00020\u00128\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\\\u0010>R\u0016\u0010_\u001a\u00020\u00128\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b^\u0010>R\u0016\u0010a\u001a\u00020\u00128\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b`\u0010>R\u0016\u0010c\u001a\u00020\u00128\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bb\u0010>R\u0018\u0010g\u001a\u0004\u0018\u00010d8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\be\u0010fR\u0018\u0010k\u001a\u0004\u0018\u00010h8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bi\u0010j¨\u0006l"}, d2 = {"Lcom/neeeex/eraser/module/main/SplashNEEEEXActivity;", "Lcom/neeeex/eraser/base/RootActivity;", "<init>", "()V", "Landroid/content/Context;", "ctx", "Lfl/m0;", "z0", "(Landroid/content/Context;)V", "I0", "P0", "L0", "y0", "C0", "x0", "(Lkl/f;)Ljava/lang/Object;", "", "elapsed", "", "H0", "(I)Z", "Lfl/t;", "", "D0", "()Lfl/t;", "interValue", "openValue", "F0", "(DD)Z", "J0", "(DD)V", "Lcom/neeeex/eraser/ads/o;", "A0", "()Lcom/neeeex/eraser/ads/o;", "", "durationMillis", "w0", "(J)V", "K0", "B0", "O0", "N0", "M0", "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "(Landroid/os/Bundle;)V", "onStart", "Landroid/content/Intent;", "intent", "onNewIntent", "(Landroid/content/Intent;)V", "onStop", "onResume", "onDestroy", "onBackPressed", "G0", "()Z", "E0", "outState", "onSaveInstanceState", "c", "Z", "isForeground", "d", "needToStartNewPage", "e", "J", "displayTimeout", "Ljava/util/Timer;", "f", "Ljava/util/Timer;", "displayTimer", "g", "shouldCheckNotification", "", "h", "Ljava/lang/String;", "adSceneId", "Lji/x;", "i", "Lji/x;", "binding", "j", "I", "sourceType", CampaignEx.JSON_KEY_AD_K, "adShownSuccessfully", "l", "isFirstLaunch", "m", "desktopWasStartedAtLaunch", com.thinkup.core.common.nn.m.n.f72065d, "launchFlowStarted", com.thinkup.core.q.o.f74114d, "desktopPrelaunchedForAd", "p", "navigationStarted", "q", "pendingRetainAdFlow", "Lkotlinx/coroutines/Job;", CampaignEx.JSON_KEY_AD_R, "Lkotlinx/coroutines/Job;", "launchJob", "Landroid/animation/ObjectAnimator;", "s", "Landroid/animation/ObjectAnimator;", "loadingProgressAnimator", "tool-feature_productionRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class SplashNEEEEXActivity extends RootActivity {

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    public boolean isForeground;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    public boolean needToStartNewPage;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    public Timer displayTimer;

    /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata */
    public ji.x binding;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    public int sourceType;

    /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata */
    public boolean adShownSuccessfully;

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
    public boolean isFirstLaunch;

    /* JADX INFO: renamed from: m, reason: collision with root package name and from kotlin metadata */
    public boolean desktopWasStartedAtLaunch;

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    public boolean launchFlowStarted;

    /* JADX INFO: renamed from: o, reason: collision with root package name and from kotlin metadata */
    public boolean desktopPrelaunchedForAd;

    /* JADX INFO: renamed from: p, reason: collision with root package name and from kotlin metadata */
    public boolean navigationStarted;

    /* JADX INFO: renamed from: q, reason: collision with root package name and from kotlin metadata */
    public boolean pendingRetainAdFlow;

    /* JADX INFO: renamed from: r, reason: collision with root package name and from kotlin metadata */
    public Job launchJob;

    /* JADX INFO: renamed from: s, reason: collision with root package name and from kotlin metadata */
    public ObjectAnimator loadingProgressAnimator;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    public final long displayTimeout = 5700;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    public boolean shouldCheckNotification = true;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    public String adSceneId = "OPEN_SPLASH" /* decoded XOR */;

    public static final class a extends ll.d {
        int I$0;
        int label;
        /* synthetic */ Object result;

        public a(kl.f<? super a> fVar) {
            super(fVar);
        }

        @Override // ll.a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return SplashNEEEEXActivity.this.x0(this);
        }
    }

    public static final class b extends ll.m implements tl.n {
        int label;

        public b(kl.f<? super b> fVar) {
            super(2, fVar);
        }

        @Override // ll.a
        public final kl.f<fl.m0> create(Object obj, kl.f<?> fVar) {
            return SplashNEEEEXActivity.this.new b(fVar);
        }

        @Override // tl.n
        public final Object invoke(p0 p0Var, kl.f<? super fl.m0> fVar) {
            return ((b) create(p0Var, fVar)).invokeSuspend(fl.m0.f80959a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:14:0x0039, code lost:
        
            if (r6.x0(r5) == r0) goto L15;
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
                this.label = 1;
                if (z0.b(4000L, this) != objF) {
                }
                return objF;
            }
            if (i10 == 1) {
                fl.v.b(obj);
            } else {
                if (i10 != 2) {
                    v0.a("call to 'resume' before 'invoke' with coroutine" /* decoded XOR */);
                    return null;
                }
                fl.v.b(obj);
            }
            com.neeeex.eraser.utils.a aVar = com.neeeex.eraser.utils.a.f66125a;
            if (aVar.b()) {
                mi.a.f88870a.o1();
            }
            if (SplashNEEEEXActivity.this.isForeground) {
                fl.t tVarD0 = SplashNEEEEXActivity.this.D0();
                double dDoubleValue = ((Number) tVarD0.component1()).doubleValue();
                double dDoubleValue2 = ((Number) tVarD0.component2()).doubleValue();
                if (SplashNEEEEXActivity.this.F0(dDoubleValue, dDoubleValue2)) {
                    if (aVar.b()) {
                        mi.a.f88870a.v1();
                    }
                    SplashNEEEEXActivity.this.J0(dDoubleValue, dDoubleValue2);
                    return fl.m0.f80959a;
                }
                if (aVar.b()) {
                    mi.a.f88870a.s1();
                }
                com.neeeex.eraser.ads.h.f64923a.e().a(SplashNEEEEXActivity.this.adSceneId);
            } else if (aVar.b()) {
                mi.a.f88870a.n1();
            }
            SplashNEEEEXActivity.this.K0();
            SplashNEEEEXActivity.this.finish();
            return fl.m0.f80959a;
            SplashNEEEEXActivity splashNEEEEXActivity = SplashNEEEEXActivity.this;
            this.label = 2;
        }
    }

    public static final class c extends ll.m implements tl.n {
        final /* synthetic */ Context $ctx;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(Context context, kl.f<? super c> fVar) {
            super(2, fVar);
            this.$ctx = context;
        }

        @Override // ll.a
        public final kl.f<fl.m0> create(Object obj, kl.f<?> fVar) {
            return new c(this.$ctx, fVar);
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
                com.neeeex.eraser.ads.h hVar = com.neeeex.eraser.ads.h.f64923a;
                Context context = this.$ctx;
                this.label = 1;
                if (hVar.d(context, this) == objF) {
                    return objF;
                }
            } else {
                if (i10 != 1) {
                    v0.a("call to 'resume' before 'invoke' with coroutine" /* decoded XOR */);
                    return null;
                }
                fl.v.b(obj);
            }
            return fl.m0.f80959a;
        }
    }

    public static final class d implements com.neeeex.eraser.ads.o {
        public d() {
        }

        @Override // com.neeeex.eraser.ads.o
        public void onAdClick() {
            if (com.neeeex.eraser.utils.a.f66125a.b()) {
                mi.a.f88870a.j1();
            }
        }

        @Override // com.neeeex.eraser.ads.o
        public void onAdClose() {
            if (com.neeeex.eraser.utils.a.f66125a.b()) {
                mi.a.f88870a.k1();
            }
            SplashNEEEEXActivity.this.E0();
        }

        @Override // com.neeeex.eraser.ads.o
        public void onAdShowFailed(oj.a aVar) {
            if (com.neeeex.eraser.utils.a.f66125a.b()) {
                mi.a.f88870a.l1();
            }
            SplashNEEEEXActivity.this.B0();
            SplashNEEEEXActivity.this.E0();
        }

        @Override // com.neeeex.eraser.ads.o
        public void onAdShowSuccess(oj.a aVar) {
            OpenSceneAdPolicy.markOpenSceneAdShown();
            if (com.neeeex.eraser.utils.a.f66125a.b()) {
                mi.a.f88870a.m1();
            }
            SplashNEEEEXActivity.this.adShownSuccessfully = true;
            SplashNEEEEXActivity.this.needToStartNewPage = true;
            SplashNEEEEXActivity.this.B0();
        }
    }

    public static final class e extends ll.m implements tl.n {
        int label;

        public e(kl.f<? super e> fVar) {
            super(2, fVar);
        }

        @Override // ll.a
        public final kl.f<fl.m0> create(Object obj, kl.f<?> fVar) {
            return SplashNEEEEXActivity.this.new e(fVar);
        }

        @Override // tl.n
        public final Object invoke(p0 p0Var, kl.f<? super fl.m0> fVar) {
            return ((e) create(p0Var, fVar)).invokeSuspend(fl.m0.f80959a);
        }

        @Override // ll.a
        public final Object invokeSuspend(Object obj) {
            p003kotlin.coroutines.intrinsics.c.f();
            if (this.label != 0) {
                v0.a("call to 'resume' before 'invoke' with coroutine" /* decoded XOR */);
                return null;
            }
            fl.v.b(obj);
            if (SplashNEEEEXActivity.this.isForeground) {
                fl.t tVarD0 = SplashNEEEEXActivity.this.D0();
                double dDoubleValue = ((Number) tVarD0.component1()).doubleValue();
                double dDoubleValue2 = ((Number) tVarD0.component2()).doubleValue();
                if (SplashNEEEEXActivity.this.F0(dDoubleValue, dDoubleValue2)) {
                    SplashNEEEEXActivity.this.J0(dDoubleValue, dDoubleValue2);
                    return fl.m0.f80959a;
                }
                com.neeeex.eraser.ads.h.f64923a.e().a(SplashNEEEEXActivity.this.adSceneId);
            }
            SplashNEEEEXActivity.this.K0();
            SplashNEEEEXActivity.this.finish();
            return fl.m0.f80959a;
        }
    }

    public static final class f implements vi.h.a {
        public f() {
        }

        @Override // vi.h.a
        public void on13Permission(boolean z10, boolean z11) {
        }

        @Override // vi.h.a
        public void onGranted(boolean z10) {
            com.neeeex.eraser.ads.e.N = false;
            if (z10) {
                mi.a aVar = mi.a.f88870a;
                aVar.g0();
                aVar.f0();
            }
            SplashNEEEEXActivity.this.y0();
        }
    }

    public static final class g implements Observer, p003kotlin.jvm.internal.p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Function1 f65315a;

        public g(Function1 function1) {
            "function" /* decoded XOR */;
            function1.getClass();
            this.f65315a = function1;
        }

        public final boolean equals(Object obj) {
            if ((obj instanceof Observer) && (obj instanceof p003kotlin.jvm.internal.p)) {
                return p003kotlin.jvm.internal.v.c(getFunctionDelegate(), ((p003kotlin.jvm.internal.p) obj).getFunctionDelegate());
            }
            return false;
        }

        @Override // p003kotlin.jvm.internal.p
        public final fl.h getFunctionDelegate() {
            return this.f65315a;
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }

        @Override // androidx.p002lifecycle.Observer
        public final /* synthetic */ void onChanged(Object obj) {
            this.f65315a.invoke(obj);
        }
    }

    public static final class h extends TimerTask {
        public h() {
        }

        @Override // java.util.TimerTask, java.lang.Runnable
        public void run() {
            SplashNEEEEXActivity.this.E0();
        }
    }

    public static void h0(SplashNEEEEXActivity splashNEEEEXActivity, double d10, double d11) {
        splashNEEEEXActivity.J0(d10, d11);
    }

    public static fl.m0 i0(SplashNEEEEXActivity splashNEEEEXActivity, fl.m0 m0Var) {
        "it" /* decoded XOR */;
        m0Var.getClass();
        splashNEEEEXActivity.E0();
        return fl.m0.f80959a;
    }

    public static void j0(SplashNEEEEXActivity splashNEEEEXActivity) {
        splashNEEEEXActivity.K0();
    }

    public static void k0(SplashNEEEEXActivity splashNEEEEXActivity) {
        splashNEEEEXActivity.E0();
    }

    public final com.neeeex.eraser.ads.o A0() {
        return new d();
    }

    public final void B0() {
        Timer timer = this.displayTimer;
        if (timer != null) {
            timer.cancel();
        }
        this.displayTimer = null;
    }

    public final void C0() {
        ObjectAnimator objectAnimator = this.loadingProgressAnimator;
        if (objectAnimator != null) {
            objectAnimator.cancel();
        }
        ji.x xVar = this.binding;
        if (xVar == null) {
            p003kotlin.jvm.internal.v.n("binding" /* decoded XOR */);
            xVar = null;
        }
        xVar.f85732e.setProgress(100);
        NEEEEXFGService.INSTANCE.b(this);
        this.launchJob = kotlinx.coroutines.k.d(LifecycleOwnerKt.getLifecycleScope(this), null, null, new e(null), 3, null);
    }

    public final fl.t D0() {
        com.neeeex.eraser.ads.h hVar = com.neeeex.eraser.ads.h.f64923a;
        return fl.z.a(Double.valueOf(hVar.h().c()), Double.valueOf(hVar.e().c()));
    }

    public final void E0() {
        if (!p003kotlin.jvm.internal.v.c(Looper.myLooper(), Looper.getMainLooper())) {
            runOnUiThread(new Runnable() { // from class: com.neeeex.eraser.module.main.j0
                @Override // java.lang.Runnable
                public final void run() {
                    SplashNEEEEXActivity.k0(this.f65360a);
                }
            });
            return;
        }
        if (com.neeeex.eraser.utils.a.f66125a.b()) {
            mi.a.f88870a.p1();
        }
        if (isFinishing() || isDestroyed()) {
            return;
        }
        K0();
        finish();
    }

    public final boolean F0(double interValue, double openValue) {
        return interValue > -0.1d || openValue > -0.1d;
    }

    public final boolean G0() {
        return this.binding != null;
    }

    public final boolean H0(int elapsed) {
        com.neeeex.eraser.ads.h hVar = com.neeeex.eraser.ads.h.f64923a;
        com.neeeex.eraser.ads.k kVarE = hVar.e();
        com.neeeex.eraser.ads.m mVarH = hVar.h();
        double dC = kVarE.c();
        double dC2 = mVarH.c();
        if (elapsed < 5400) {
            return (dC > -0.1d && (kVarE.e() || kVarE.b())) || (kVarE.b() && (dC2 > -0.1d || mVarH.b()));
        }
        return dC2 > -0.1d || dC > -0.1d || (kVarE.b() && mVarH.b());
    }

    public final void I0() {
        ji.x xVar = this.binding;
        if (xVar == null) {
            p003kotlin.jvm.internal.v.n("binding" /* decoded XOR */);
            xVar = null;
        }
        xVar.f85731d.setVisibility(8);
    }

    public final void J0(final double interValue, final double openValue) {
        if (!p003kotlin.jvm.internal.v.c(Looper.myLooper(), Looper.getMainLooper())) {
            runOnUiThread(new Runnable() { // from class: com.neeeex.eraser.module.main.l0
                @Override // java.lang.Runnable
                public final void run() {
                    SplashNEEEEXActivity.h0(this.f65365a, interValue, openValue);
                }
            });
            return;
        }
        if (isFinishing() || isDestroyed() || !this.isForeground) {
            return;
        }
        if (!this.isFirstLaunch && !this.desktopPrelaunchedForAd && getIntent().getBooleanExtra("com.neeeex.eraser.launcher.OPEN_DESKTOP_AFTER_STARTUP" /* decoded XOR */, false) && getIntent().getData() == null) {
            this.desktopPrelaunchedForAd = true;
            Intent intentAddFlags = DesktopNavigator.INSTANCE.homeIntent(this, true ^ this.isFirstLaunch).addFlags(65536);
            "addFlags(...)" /* decoded XOR */;
            intentAddFlags.getClass();
            try {
                startActivity(intentAddFlags);
            } catch (RuntimeException unused) {
                startActivity(DesktopNavigation.createExplicitIntent(this).putExtras(intentAddFlags));
            }
            overridePendingTransition(0, 0);
        }
        O0();
        if (interValue > openValue) {
            com.neeeex.eraser.ads.m mVarH = com.neeeex.eraser.ads.h.f64923a.h();
            mVarH.a(this.adSceneId);
            mVarH.f(this, this.adSceneId, A0());
        } else {
            com.neeeex.eraser.ads.k kVarE = com.neeeex.eraser.ads.h.f64923a.e();
            kVarE.a(this.adSceneId);
            kVarE.g(this, this.adSceneId, A0());
        }
    }

    public final void K0() {
        if (!p003kotlin.jvm.internal.v.c(Looper.myLooper(), Looper.getMainLooper())) {
            runOnUiThread(new Runnable() { // from class: com.neeeex.eraser.module.main.i0
                @Override // java.lang.Runnable
                public final void run() {
                    SplashNEEEEXActivity.j0(this.f65356a);
                }
            });
            return;
        }
        if (this.navigationStarted) {
            return;
        }
        this.navigationStarted = true;
        getIntent().putExtra("neeeex_desktop_started_at_entry" /* decoded XOR */, this.desktopWasStartedAtLaunch);
        StartupStateStore startupStateStore = StartupStateStore.INSTANCE;
        boolean zRequiredFlowComplete = startupStateStore.requiredFlowComplete();
        if (StartupRoutePolicy.INSTANCE.shouldScanDevice(zRequiredFlowComplete, this.adShownSuccessfully)) {
            com.neeeex.eraser.utils.a.f66125a.e();
            GuideNEEEEXActivity.Companion.b(GuideNEEEEXActivity.INSTANCE, this, getIntent(), false, 4, null);
            return;
        }
        if (!zRequiredFlowComplete) {
            com.neeeex.eraser.utils.a.f66125a.e();
            NewUserDesktopFunnelTracker.INSTANCE.recordFirstMinusOneEntry(FirstMinusOneEntryPath.SPLASH_AD);
            startupStateStore.markRequiredFlowComplete();
            mi.a.f88870a.r1();
        }
        DesktopNavigator.INSTANCE.completeStartup(this);
    }

    public final void L0() {
        if (Build.VERSION.SDK_INT >= 33) {
            ui.a aVar = ui.a.f100035a;
            if (!aVar.a(this)) {
                mi.a.f88870a.h0();
                vi.h hVarD = aVar.d(this);
                com.neeeex.eraser.ads.e.N = true;
                hVarD.f(new f());
                return;
            }
        }
        y0();
    }

    /* JADX WARN: Code duplicated, block: B:17:0x002a  */
    public final void M0() {
        String strA;
        int i10 = this.sourceType;
        if (i10 == 1 || i10 == 2) {
            strA = "NOTIFICATION_SPLASH" /* decoded XOR */;
        } else if (i10 == 3) {
            strA = "NOTIFICATION_BAR_SPLASH" /* decoded XOR */;
        } else if (i10 != 4 && i10 != 5 && i10 != 32) {
            switch (i10) {
                case 10:
                case 11:
                case 12:
                case 13:
                    strA = "NOTIFICATION_SPLASH" /* decoded XOR */;
                    break;
                default:
                    strA = "OPEN_SPLASH" /* decoded XOR */;
                    break;
            }
        } else {
            strA = "NOTIFICATION_SPLASH" /* decoded XOR */;
        }
        this.adSceneId = strA;
    }

    public final void N0() {
        this.sourceType = getIntent().getIntExtra("from" /* decoded XOR */, 0);
    }

    public final void O0() {
        B0();
        Timer timer = new Timer();
        this.displayTimer = timer;
        timer.schedule(new h(), this.displayTimeout);
    }

    public final void P0() {
        if (this.shouldCheckNotification) {
            com.neeeex.eraser.utils.a aVar = com.neeeex.eraser.utils.a.f66125a;
            if (aVar.d()) {
                this.shouldCheckNotification = false;
                aVar.f();
                L0();
                return;
            }
        }
        y0();
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void onBackPressed() {
    }

    /* JADX WARN: Code duplicated, block: B:15:0x003b  */
    @Override // com.neeeex.eraser.base.RootActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle savedInstanceState) {
        boolean zIsDesktopStarted;
        Bundle extras;
        boolean z10;
        ji.x xVar = null;
        if (savedInstanceState != null) {
            zIsDesktopStarted = savedInstanceState.getBoolean("desktop_started_at_entry" /* decoded XOR */);
        } else {
            Intent intent = getIntent();
            if (intent == null || (extras = intent.getExtras()) == null) {
                zIsDesktopStarted = DesktopRoutePolicy.INSTANCE.isDesktopStarted();
            } else {
                if (!extras.containsKey("neeeex_desktop_started_at_entry" /* decoded XOR */)) {
                    extras = null;
                }
                if (extras != null) {
                    zIsDesktopStarted = extras.getBoolean("neeeex_desktop_started_at_entry" /* decoded XOR */);
                } else {
                    zIsDesktopStarted = DesktopRoutePolicy.INSTANCE.isDesktopStarted();
                }
            }
        }
        this.desktopWasStartedAtLaunch = zIsDesktopStarted;
        if (savedInstanceState != null) {
            z10 = savedInstanceState.getBoolean("first_launch" /* decoded XOR */);
        } else {
            z10 = !StartupStateStore.INSTANCE.requiredFlowComplete();
        }
        this.isFirstLaunch = z10;
        this.desktopPrelaunchedForAd = savedInstanceState != null ? savedInstanceState.getBoolean("desktop_prelaunched" /* decoded XOR */) : false;
        this.needToStartNewPage = savedInstanceState != null ? savedInstanceState.getBoolean("resume_after_ad" /* decoded XOR */) : false;
        this.adShownSuccessfully = savedInstanceState != null ? savedInstanceState.getBoolean("ad_shown_successfully" /* decoded XOR */) : false;
        super.onCreate(savedInstanceState);
        this.isForeground = true;
        Application application = getApplication();
        "null cannot be cast to non-null type com.neeeex.eraser.MyApplication" /* decoded XOR */;
        application.getClass();
        ((com.neeeex.eraser.y) application).markToolRuntimeInitialized();
        com.neeeex.eraser.utils.b0 b0Var = com.neeeex.eraser.utils.b0.f66131a;
        if (b0Var.s("neeeex_first_report_pending" /* decoded XOR */, false)) {
            mi.a.f88870a.t1();
            b0Var.z("neeeex_first_report_pending" /* decoded XOR */, false);
        }
        com.neeeex.eraser.ads.e.N = false;
        z0(this);
        ji.x xVarC = ji.x.c(getLayoutInflater());
        "inflate(...)" /* decoded XOR */;
        xVarC.getClass();
        this.binding = xVarC;
        if (xVarC == null) {
            p003kotlin.jvm.internal.v.n("binding" /* decoded XOR */);
            xVarC = null;
        }
        setContentView(xVarC.getRoot());
        I0();
        ji.x xVar2 = this.binding;
        if (xVar2 == null) {
            p003kotlin.jvm.internal.v.n("binding" /* decoded XOR */);
        } else {
            xVar = xVar2;
        }
        xVar.f85732e.setProgress(savedInstanceState != null ? savedInstanceState.getInt("loading_progress" /* decoded XOR */) : 0);
        N0();
        M0();
        if (com.neeeex.eraser.utils.a.f66125a.b()) {
            mi.a.f88870a.u1();
        }
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
        com.neeeex.eraser.utils.b.b().observe(this, new g(new Function1() { // from class: com.neeeex.eraser.module.main.k0
            @Override // p003kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return SplashNEEEEXActivity.i0(this.f65363a, (fl.m0) obj);
            }
        }));
        if (this.needToStartNewPage) {
            return;
        }
        if (this.sourceType == 10) {
            C0();
        } else {
            P0();
        }
    }

    @Override // com.neeeex.eraser.base.RootActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        ObjectAnimator objectAnimator = this.loadingProgressAnimator;
        if (objectAnimator != null) {
            objectAnimator.cancel();
        }
        this.loadingProgressAnimator = null;
        super.onDestroy();
        B0();
    }

    @Override // com.neeeex.eraser.base.RootActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onNewIntent(Intent intent) {
        "intent" /* decoded XOR */;
        intent.getClass();
        super.onNewIntent(intent);
        setIntent(intent);
        N0();
        M0();
        if (this.sourceType == 10) {
            Job job = this.launchJob;
            if (job != null) {
                Job.a.a(job, null, 1, null);
            }
            B0();
            this.pendingRetainAdFlow = true;
        }
    }

    @Override // com.neeeex.eraser.base.RootActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onResume() {
        super.onResume();
        Application application = getApplication();
        "null cannot be cast to non-null type com.neeeex.eraser.MyApplication" /* decoded XOR */;
        application.getClass();
        String name = SplashNEEEEXActivity.class.getName();
        "getName(...)" /* decoded XOR */;
        ((com.neeeex.eraser.y) application).markToolStartupStarted(name, getTaskId());
        if (this.pendingRetainAdFlow) {
            this.pendingRetainAdFlow = false;
            C0();
        } else if (this.needToStartNewPage) {
            if (com.neeeex.eraser.utils.a.f66125a.b()) {
                mi.a.f88870a.q1();
            }
            this.needToStartNewPage = false;
            E0();
        }
    }

    @Override // androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onSaveInstanceState(Bundle outState) {
        "outState" /* decoded XOR */;
        outState.getClass();
        outState.putBoolean("desktop_prelaunched" /* decoded XOR */, this.desktopPrelaunchedForAd);
        outState.putBoolean("desktop_started_at_entry" /* decoded XOR */, this.desktopWasStartedAtLaunch);
        outState.putBoolean("first_launch" /* decoded XOR */, this.isFirstLaunch);
        outState.putBoolean("resume_after_ad" /* decoded XOR */, this.needToStartNewPage);
        outState.putBoolean("ad_shown_successfully" /* decoded XOR */, this.adShownSuccessfully);
        String strA = "loading_progress" /* decoded XOR */;
        ji.x xVar = this.binding;
        if (xVar == null) {
            p003kotlin.jvm.internal.v.n("binding" /* decoded XOR */);
            xVar = null;
        }
        outState.putInt(strA, xVar.f85732e.getProgress());
        super.onSaveInstanceState(outState);
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

    public final void w0(long durationMillis) {
        ObjectAnimator objectAnimator = this.loadingProgressAnimator;
        if (objectAnimator != null) {
            objectAnimator.cancel();
        }
        ji.x xVar = this.binding;
        if (xVar == null) {
            p003kotlin.jvm.internal.v.n("binding" /* decoded XOR */);
            xVar = null;
        }
        ObjectAnimator objectAnimatorOfInt = ObjectAnimator.ofInt(xVar.f85732e, "progress" /* decoded XOR */, 0, 100);
        objectAnimatorOfInt.setDuration(durationMillis);
        objectAnimatorOfInt.setInterpolator(new DecelerateInterpolator());
        objectAnimatorOfInt.start();
        this.loadingProgressAnimator = objectAnimatorOfInt;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:22:0x0055 -> B:24:0x0058). Please report as a decompilation issue!!! */
    public final Object x0(kl.f fVar) {
        a aVar;
        int i10;
        if (fVar instanceof a) {
            aVar = (a) fVar;
            int i11 = aVar.label;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                aVar.label = i11 - Integer.MIN_VALUE;
            } else {
                aVar = new a(fVar);
            }
        } else {
            aVar = new a(fVar);
        }
        Object obj = aVar.result;
        Object objF = p003kotlin.coroutines.intrinsics.c.f();
        int i12 = aVar.label;
        if (i12 == 0) {
            fl.v.b(obj);
            i10 = 0;
            if (this.isForeground || i10 >= 8100 || H0(i10)) {
                return fl.m0.f80959a;
            }
            aVar.I$0 = i10;
            aVar.label = 1;
            if (z0.b(300L, aVar) == objF) {
                return objF;
            }
        } else {
            if (i12 != 1) {
                v0.a("call to 'resume' before 'invoke' with coroutine" /* decoded XOR */);
                return null;
            }
            i10 = aVar.I$0;
            fl.v.b(obj);
        }
        i10 += 300;
        if (this.isForeground) {
        }
        return fl.m0.f80959a;
    }

    public final void y0() {
        if (this.launchFlowStarted) {
            return;
        }
        this.launchFlowStarted = true;
        NEEEEXFGService.INSTANCE.b(this);
        w0(12200L);
        this.launchJob = kotlinx.coroutines.k.d(LifecycleOwnerKt.getLifecycleScope(this), null, null, new b(null), 3, null);
    }

    public final void z0(Context ctx) {
        kotlinx.coroutines.k.d(LifecycleOwnerKt.getLifecycleScope(this), null, null, new c(ctx, null), 3, null);
    }
}