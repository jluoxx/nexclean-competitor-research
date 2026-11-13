package com.neeeex.eraser.launcher;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.os.Environment;
import android.os.StatFs;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.app.NotificationCompat;
import androidx.core.view.c1;
import com.airbnb.lottie.LottieAnimationView;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.neeeex.eraser.R$drawable;
import com.neeeex.eraser.R$string;
import com.neeeex.eraser.R$style;
import com.neeeex.eraser.launcher.contract.ToolHost;
import com.thinkup.core.common.m0.d0;
import fl.m0;
import gq.v0;
import java.util.Locale;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.f1;
import kotlinx.coroutines.l0;
import kotlinx.coroutines.p0;
import kotlinx.coroutines.q0;
import kotlinx.coroutines.x2;
import p003kotlin.Metadata;
import p003kotlin.jvm.functions.Function1;
import p003kotlin.jvm.internal.r0;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J+\u0010\u000e\u001a\u00020\r2\u0006\u0010\t\u001a\u00020\b2\u0012\u0010\f\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u000b0\n\"\u00020\u000bH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0010\u001a\u00020\rH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\rH\u0082@¢\u0006\u0004\b\u0012\u0010\u0013J\r\u0010\u0014\u001a\u00020\r¢\u0006\u0004\b\u0014\u0010\u0011J\r\u0010\u0015\u001a\u00020\r¢\u0006\u0004\b\u0015\u0010\u0011J\u0015\u0010\u0018\u001a\u00020\r2\u0006\u0010\u0017\u001a\u00020\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u0015\u0010\u001c\u001a\u00020\r2\u0006\u0010\u001b\u001a\u00020\u001a¢\u0006\u0004\b\u001c\u0010\u001dJ\r\u0010\u001e\u001a\u00020\r¢\u0006\u0004\b\u001e\u0010\u0011R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u001fR\u0014\u0010!\u001a\u00020 8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010\"R\u0014\u0010$\u001a\u00020#8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010%R\u0014\u0010'\u001a\u00020&8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b'\u0010(R\u0016\u0010)\u001a\u00020\u00168\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b)\u0010*R\u0016\u0010+\u001a\u00020\u00168\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b+\u0010*R\u0016\u0010,\u001a\u00020\u00168\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b,\u0010*R\u0016\u0010-\u001a\u00020\u00168\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b-\u0010*R\u0018\u0010/\u001a\u0004\u0018\u00010.8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b/\u00100¨\u00061"}, d2 = {"Lcom/neeeex/eraser/launcher/NexCleanLauncherHomeView;", "Landroid/widget/FrameLayout;", "Landroid/content/Context;", "context", "Lcom/neeeex/eraser/launcher/contract/ToolHost;", d0.odd, "<init>", "(Landroid/content/Context;Lcom/neeeex/eraser/launcher/contract/ToolHost;)V", "Lcom/neeeex/eraser/launcher/LauncherActionNavigator$Action;", "action", "", "Landroid/view/View;", "views", "Lfl/m0;", "bind", "(Lcom/neeeex/eraser/launcher/LauncherActionNavigator$Action;[Landroid/view/View;)V", "updateActive", "()V", "refreshCapacity", "(Lkl/f;)Ljava/lang/Object;", "onHostResume", "onHostPause", "", "value", "onPanelVisibilityChanged", "(Z)V", "", NotificationCompat.CATEGORY_PROGRESS, "onPanelScroll", "(F)V", "destroy", "Lcom/neeeex/eraser/launcher/contract/ToolHost;", "Lji/a;", "binding", "Lji/a;", "Lkotlinx/coroutines/p0;", "scope", "Lkotlinx/coroutines/p0;", "Lcom/neeeex/eraser/launcher/PanelAdController;", com.mbridge.msdk.foundation.entity.b.JSON_KEY_ADS, "Lcom/neeeex/eraser/launcher/PanelAdController;", "resumed", "Z", "visible", AppMeasurementSdk.ConditionalUserProperty.ACTIVE, "expanded", "Lkotlinx/coroutines/Job;", "refreshJob", "Lkotlinx/coroutines/Job;", "tool-feature_productionRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class NexCleanLauncherHomeView extends FrameLayout {
    private boolean active;
    private final PanelAdController ads;
    private final ji.a binding;
    private boolean expanded;
    private final ToolHost host;
    private Job refreshJob;
    private boolean resumed;
    private final p0 scope;
    private boolean visible;

    /* JADX INFO: renamed from: com.neeeex.eraser.launcher.NexCleanLauncherHomeView$refreshCapacity$1, reason: invalid class name */
    @ll.f(c = "com.neeeex.eraser.launcher.NexCleanLauncherHomeView", f = "NexCleanLauncherHomeView.kt", l = {135}, m = "refreshCapacity", v = 2)
    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class AnonymousClass1 extends ll.d {
        int label;
        /* synthetic */ Object result;

        public AnonymousClass1(kl.f<? super AnonymousClass1> fVar) {
            super(fVar);
        }

        @Override // ll.a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return NexCleanLauncherHomeView.this.refreshCapacity(this);
        }
    }

    /* JADX INFO: renamed from: com.neeeex.eraser.launcher.NexCleanLauncherHomeView$refreshCapacity$2, reason: invalid class name */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0002\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/p0;", "Lfl/t;", "", "<anonymous>", "(Lkotlinx/coroutines/p0;)Lfl/t;"}, k = 3, mv = {2, 3, 0})
    @ll.f(c = "com.neeeex.eraser.launcher.NexCleanLauncherHomeView$refreshCapacity$2", f = "NexCleanLauncherHomeView.kt", l = {}, m = "invokeSuspend", v = 2)
    public static final class AnonymousClass2 extends ll.m implements tl.n {
        int label;

        public AnonymousClass2(kl.f<? super AnonymousClass2> fVar) {
            super(2, fVar);
        }

        @Override // ll.a
        public final kl.f<m0> create(Object obj, kl.f<?> fVar) {
            return new AnonymousClass2(fVar);
        }

        @Override // tl.n
        public final Object invoke(p0 p0Var, kl.f<? super fl.t> fVar) {
            return ((AnonymousClass2) create(p0Var, fVar)).invokeSuspend(m0.f80959a);
        }

        @Override // ll.a
        public final Object invokeSuspend(Object obj) {
            p003kotlin.coroutines.intrinsics.c.f();
            if (this.label != 0) {
                v0.a("call to 'resume' before 'invoke' with coroutine" /* decoded XOR */);
                return null;
            }
            fl.v.b(obj);
            StatFs statFs = new StatFs(Environment.getDataDirectory().getPath());
            return fl.z.a(ll.b.e(statFs.getTotalBytes() - statFs.getAvailableBytes()), ll.b.e(statFs.getTotalBytes()));
        }
    }

    /* JADX INFO: renamed from: com.neeeex.eraser.launcher.NexCleanLauncherHomeView$updateActive$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/p0;", "Lfl/m0;", "<anonymous>", "(Lkotlinx/coroutines/p0;)V"}, k = 3, mv = {2, 3, 0})
    @ll.f(c = "com.neeeex.eraser.launcher.NexCleanLauncherHomeView$updateActive$1", f = "NexCleanLauncherHomeView.kt", l = {118}, m = "invokeSuspend", v = 2)
    public static final class C36411 extends ll.m implements tl.n {
        private /* synthetic */ Object L$0;
        Object L$1;
        int label;

        /* JADX INFO: renamed from: com.neeeex.eraser.launcher.NexCleanLauncherHomeView$updateActive$1$1, reason: invalid class name and collision with other inner class name */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/p0;", "Lfl/m0;", "<anonymous>", "(Lkotlinx/coroutines/p0;)V"}, k = 3, mv = {2, 3, 0})
        @ll.f(c = "com.neeeex.eraser.launcher.NexCleanLauncherHomeView$updateActive$1$1", f = "NexCleanLauncherHomeView.kt", l = {116}, m = "invokeSuspend", v = 2)
        public static final class C07761 extends ll.m implements tl.n {
            int label;
            final /* synthetic */ NexCleanLauncherHomeView this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C07761(NexCleanLauncherHomeView nexCleanLauncherHomeView, kl.f<? super C07761> fVar) {
                super(2, fVar);
                this.this$0 = nexCleanLauncherHomeView;
            }

            @Override // ll.a
            public final kl.f<m0> create(Object obj, kl.f<?> fVar) {
                return new C07761(this.this$0, fVar);
            }

            @Override // tl.n
            public final Object invoke(p0 p0Var, kl.f<? super m0> fVar) {
                return ((C07761) create(p0Var, fVar)).invokeSuspend(m0.f80959a);
            }

            @Override // ll.a
            public final Object invokeSuspend(Object obj) {
                Object objF = p003kotlin.coroutines.intrinsics.c.f();
                int i10 = this.label;
                if (i10 == 0) {
                    fl.v.b(obj);
                    NexCleanLauncherHomeView nexCleanLauncherHomeView = this.this$0;
                    this.label = 1;
                    if (nexCleanLauncherHomeView.refreshCapacity(this) == objF) {
                        return objF;
                    }
                } else {
                    if (i10 != 1) {
                        v0.a("call to 'resume' before 'invoke' with coroutine" /* decoded XOR */);
                        return null;
                    }
                    fl.v.b(obj);
                }
                return m0.f80959a;
            }
        }

        public C36411(kl.f<? super C36411> fVar) {
            super(2, fVar);
        }

        public static m0 b(r0 r0Var, NexCleanLauncherHomeView nexCleanLauncherHomeView, com.neeeex.ctools.features.network.realtime.h hVar) {
            String strA = com.neeeex.ctools.features.network.realtime.f.f64428a.a(r0Var.element ? hVar.c() : hVar.d());
            nexCleanLauncherHomeView.binding.G.setText(strA);
            nexCleanLauncherHomeView.binding.G.setCompoundDrawablesRelativeWithIntrinsicBounds(0, 0, r0Var.element ? R$drawable.ic_neeeex_home_traffic_down : R$drawable.ic_neeeex_home_traffic_up, 0);
            nexCleanLauncherHomeView.binding.G.setContentDescription(nexCleanLauncherHomeView.getContext().getString(r0Var.element ? R$string.ctools_neeeex_home_download_rate_accessibility : R$string.ctools_neeeex_home_upload_rate_accessibility, strA));
            r0Var.element = !r0Var.element;
            return m0.f80959a;
        }

        @Override // ll.a
        public final kl.f<m0> create(Object obj, kl.f<?> fVar) {
            C36411 c36411 = NexCleanLauncherHomeView.this.new C36411(fVar);
            c36411.L$0 = obj;
            return c36411;
        }

        @Override // tl.n
        public final Object invoke(p0 p0Var, kl.f<? super m0> fVar) {
            return ((C36411) create(p0Var, fVar)).invokeSuspend(m0.f80959a);
        }

        @Override // ll.a
        public final Object invokeSuspend(Object obj) {
            p0 p0Var = (p0) this.L$0;
            Object objF = p003kotlin.coroutines.intrinsics.c.f();
            int i10 = this.label;
            if (i10 == 0) {
                fl.v.b(obj);
                kotlinx.coroutines.k.d(p0Var, null, null, new C07761(NexCleanLauncherHomeView.this, null), 3, null);
                final r0 r0Var = new r0();
                r0Var.element = true;
                com.neeeex.ctools.features.network.realtime.b bVar = new com.neeeex.ctools.features.network.realtime.b(null, null, null, 7, null);
                final NexCleanLauncherHomeView nexCleanLauncherHomeView = NexCleanLauncherHomeView.this;
                Function1 function1 = new Function1() { // from class: com.neeeex.eraser.launcher.u
                    @Override // p003kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj2) {
                        return NexCleanLauncherHomeView.C36411.b(r0Var, nexCleanLauncherHomeView, (com.neeeex.ctools.features.network.realtime.h) obj2);
                    }
                };
                this.L$0 = ll.l.a(p0Var);
                this.L$1 = ll.l.a(r0Var);
                this.label = 1;
                if (bVar.a(function1, this) == objF) {
                    return objF;
                }
            } else {
                if (i10 != 1) {
                    v0.a("call to 'resume' before 'invoke' with coroutine" /* decoded XOR */);
                    return null;
                }
                fl.v.b(obj);
            }
            return m0.f80959a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NexCleanLauncherHomeView(Context context, ToolHost toolHost) {
        super(new ContextThemeWrapper(com.neeeex.eraser.utils.g.b(context), R$style.Theme_NEEEEXRecovery));
        "context" /* decoded XOR */;
        context.getClass();
        "host" /* decoded XOR */;
        toolHost.getClass();
        this.host = toolHost;
        ji.a aVarD = ji.a.d(LayoutInflater.from(getContext()), this, false);
        "inflate(...)" /* decoded XOR */;
        aVarD.getClass();
        this.binding = aVarD;
        this.scope = q0.a(x2.b(null, 1, null).plus(f1.c().P0()));
        Activity activity = toolHost.getActivity();
        FrameLayout frameLayout = aVarD.f85299w;
        "flAdContainer" /* decoded XOR */;
        frameLayout.getClass();
        this.ads = new PanelAdController(activity, frameLayout, new NexCleanLauncherHomeView$ads$1(toolHost));
        addView(aVarD.getRoot(), new FrameLayout.LayoutParams(-1, -1));
        FrameLayout root = aVarD.getRoot();
        "null cannot be cast to non-null type android.view.ViewGroup" /* decoded XOR */;
        root.getClass();
        View childAt = root.getChildAt(1);
        "null cannot be cast to non-null type android.view.ViewGroup" /* decoded XOR */;
        childAt.getClass();
        final ViewGroup viewGroup = (ViewGroup) childAt;
        aVarD.f85301y.setVisibility(8);
        aVarD.getRoot().setFitsSystemWindows(false);
        viewGroup.setFitsSystemWindows(false);
        androidx.core.view.m0.w0(this, new androidx.core.view.y() { // from class: com.neeeex.eraser.launcher.s
            @Override // androidx.core.view.y
            public final c1 a(View view, c1 c1Var) {
                return NexCleanLauncherHomeView.b(viewGroup, view, c1Var);
            }
        });
        LauncherActionNavigator.Action action = LauncherActionNavigator.Action.CAPACITY;
        FrameLayout frameLayout2 = aVarD.A;
        "llNeeeexCapacity" /* decoded XOR */;
        frameLayout2.getClass();
        bind(action, frameLayout2);
        LauncherActionNavigator.Action action2 = LauncherActionNavigator.Action.JUNK;
        LottieAnimationView lottieAnimationView = aVarD.D;
        "lottieNeeeexMainClean" /* decoded XOR */;
        lottieAnimationView.getClass();
        FrameLayout frameLayout3 = aVarD.f85278b;
        "btnNeeeexCleanJunk" /* decoded XOR */;
        frameLayout3.getClass();
        LinearLayout linearLayout = aVarD.f85283g;
        "cardNeeeexJunkFiles" /* decoded XOR */;
        linearLayout.getClass();
        bind(action2, lottieAnimationView, frameLayout3, linearLayout);
        LauncherActionNavigator.Action action3 = LauncherActionNavigator.Action.VIRUS;
        FrameLayout frameLayout4 = aVarD.f85298v;
        "cardNeeeexVirusScan" /* decoded XOR */;
        frameLayout4.getClass();
        bind(action3, frameLayout4);
        LauncherActionNavigator.Action action4 = LauncherActionNavigator.Action.PHOTOS;
        FrameLayout frameLayout5 = aVarD.f85293q;
        "cardNeeeexRecoverPhotosFeature" /* decoded XOR */;
        frameLayout5.getClass();
        LinearLayout linearLayout2 = aVarD.f85291o;
        "cardNeeeexPhotos" /* decoded XOR */;
        linearLayout2.getClass();
        bind(action4, frameLayout5, linearLayout2);
        LauncherActionNavigator.Action action5 = LauncherActionNavigator.Action.VIDEOS;
        LinearLayout linearLayout3 = aVarD.f85297u;
        "cardNeeeexVideos" /* decoded XOR */;
        linearLayout3.getClass();
        bind(action5, linearLayout3);
        LauncherActionNavigator.Action action6 = LauncherActionNavigator.Action.FILES;
        LinearLayout linearLayout4 = aVarD.f85289m;
        "cardNeeeexOtherFiles" /* decoded XOR */;
        linearLayout4.getClass();
        bind(action6, linearLayout4);
        LauncherActionNavigator.Action action7 = LauncherActionNavigator.Action.RECOVERED;
        LinearLayout linearLayout5 = aVarD.f85294r;
        "cardNeeeexRecovered" /* decoded XOR */;
        linearLayout5.getClass();
        bind(action7, linearLayout5);
        LauncherActionNavigator.Action action8 = LauncherActionNavigator.Action.SCREENSHOTS;
        LinearLayout linearLayout6 = aVarD.f85295s;
        "cardNeeeexScreenshots" /* decoded XOR */;
        linearLayout6.getClass();
        bind(action8, linearLayout6);
        LauncherActionNavigator.Action action9 = LauncherActionNavigator.Action.SIMILAR;
        LinearLayout linearLayout7 = aVarD.f85296t;
        "cardNeeeexSimilar" /* decoded XOR */;
        linearLayout7.getClass();
        bind(action9, linearLayout7);
        LauncherActionNavigator.Action action10 = LauncherActionNavigator.Action.LARGE_MEDIA;
        LinearLayout linearLayout8 = aVarD.f85285i;
        "cardNeeeexLargeMedia" /* decoded XOR */;
        linearLayout8.getClass();
        bind(action10, linearLayout8);
        LauncherActionNavigator.Action action11 = LauncherActionNavigator.Action.DUPLICATE_MEDIA;
        LinearLayout linearLayout9 = aVarD.f85282f;
        "cardNeeeexDuplicateMedia" /* decoded XOR */;
        linearLayout9.getClass();
        bind(action11, linearLayout9);
        LauncherActionNavigator.Action action12 = LauncherActionNavigator.Action.LARGE_DOCS;
        LinearLayout linearLayout10 = aVarD.f85284h;
        "cardNeeeexLargeDocs" /* decoded XOR */;
        linearLayout10.getClass();
        bind(action12, linearLayout10);
        LauncherActionNavigator.Action action13 = LauncherActionNavigator.Action.DUPLICATE_DOCS;
        LinearLayout linearLayout11 = aVarD.f85281e;
        "cardNeeeexDuplicateDocs" /* decoded XOR */;
        linearLayout11.getClass();
        bind(action13, linearLayout11);
        LauncherActionNavigator.Action action14 = LauncherActionNavigator.Action.COMPRESS;
        LinearLayout linearLayout12 = aVarD.f85290n;
        "cardNeeeexPhotoCompressor" /* decoded XOR */;
        linearLayout12.getClass();
        bind(action14, linearLayout12);
        LauncherActionNavigator.Action action15 = LauncherActionNavigator.Action.RECENT_APPS;
        FrameLayout frameLayout6 = aVarD.f85292p;
        "cardNeeeexRecentApps" /* decoded XOR */;
        frameLayout6.getClass();
        bind(action15, frameLayout6);
        LauncherActionNavigator.Action action16 = LauncherActionNavigator.Action.TRAFFIC;
        FrameLayout frameLayout7 = aVarD.f85288l;
        "cardNeeeexNetworkTraffic" /* decoded XOR */;
        frameLayout7.getClass();
        bind(action16, frameLayout7);
        LauncherActionNavigator.Action action17 = LauncherActionNavigator.Action.APP_MANAGER;
        FrameLayout frameLayout8 = aVarD.f85279c;
        "cardNeeeexAppManager" /* decoded XOR */;
        frameLayout8.getClass();
        bind(action17, frameLayout8);
        LauncherActionNavigator.Action action18 = LauncherActionNavigator.Action.DEVICE;
        FrameLayout frameLayout9 = aVarD.f85280d;
        "cardNeeeexDeviceStatus" /* decoded XOR */;
        frameLayout9.getClass();
        LinearLayout linearLayout13 = aVarD.f85286j;
        "cardNeeeexMoreDeviceStatus" /* decoded XOR */;
        linearLayout13.getClass();
        bind(action18, frameLayout9, linearLayout13);
        LauncherActionNavigator.Action action19 = LauncherActionNavigator.Action.SPEED;
        LinearLayout linearLayout14 = aVarD.f85287k;
        "cardNeeeexNetworkSpeed" /* decoded XOR */;
        linearLayout14.getClass();
        bind(action19, linearLayout14);
        LauncherActionNavigator.Action action20 = LauncherActionNavigator.Action.NOTIFICATION_PERMISSION;
        LinearLayout linearLayout15 = aVarD.C;
        "llNeeeexNotifyTurn" /* decoded XOR */;
        linearLayout15.getClass();
        bind(action20, linearLayout15);
    }

    public static c1 b(ViewGroup viewGroup, View view, c1 c1Var) {
        "<unused var>" /* decoded XOR */;
        view.getClass();
        "insets" /* decoded XOR */;
        c1Var.getClass();
        o2.d dVarF = c1Var.f(c1.p.i());
        "getInsets(...)" /* decoded XOR */;
        dVarF.getClass();
        viewGroup.setPadding(dVarF.f89980a, dVarF.f89981b, dVarF.f89982c, dVarF.f89983d);
        return c1Var;
    }

    private final void bind(final LauncherActionNavigator.Action action, View... views) {
        for (View view : views) {
            view.setOnClickListener(new View.OnClickListener() { // from class: com.neeeex.eraser.launcher.t
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    NexCleanLauncherHomeView.bind$lambda$0$0(this.f65155a, action, view2);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void bind$lambda$0$0(NexCleanLauncherHomeView nexCleanLauncherHomeView, LauncherActionNavigator.Action action, View view) {
        if (nexCleanLauncherHomeView.active) {
            LauncherTelemetry launcherTelemetry = LauncherTelemetry.INSTANCE;
            String strA = "feature_click" /* decoded XOR */;
            String lowerCase = action.name().toLowerCase(Locale.ROOT);
            "toLowerCase(...)" /* decoded XOR */;
            lowerCase.getClass();
            launcherTelemetry.report(strA, lowerCase);
            ToolHost toolHost = nexCleanLauncherHomeView.host;
            ToolHost.launch$default(toolHost, LauncherActionNavigator.INSTANCE.intent(toolHost.getActivity(), action), null, 2, null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object refreshCapacity(kl.f<? super m0> fVar) {
        AnonymousClass1 anonymousClass1;
        if (fVar instanceof AnonymousClass1) {
            anonymousClass1 = (AnonymousClass1) fVar;
            int i10 = anonymousClass1.label;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                anonymousClass1.label = i10 - Integer.MIN_VALUE;
            } else {
                anonymousClass1 = new AnonymousClass1(fVar);
            }
        } else {
            anonymousClass1 = new AnonymousClass1(fVar);
        }
        Object objG = anonymousClass1.result;
        Object objF = p003kotlin.coroutines.intrinsics.c.f();
        int i11 = anonymousClass1.label;
        if (i11 == 0) {
            fl.v.b(objG);
            l0 l0VarB = f1.b();
            AnonymousClass2 anonymousClass2 = new AnonymousClass2(null);
            anonymousClass1.label = 1;
            objG = kotlinx.coroutines.i.g(l0VarB, anonymousClass2, anonymousClass1);
            if (objG == objF) {
                return objF;
            }
        } else {
            if (i11 != 1) {
                v0.a("call to 'resume' before 'invoke' with coroutine" /* decoded XOR */);
                return null;
            }
            fl.v.b(objG);
        }
        fl.t tVar = (fl.t) objG;
        long jLongValue = ((Number) tVar.component1()).longValue();
        long jLongValue2 = ((Number) tVar.component2()).longValue();
        this.binding.E.setText(com.neeeex.eraser.utils.d.b(jLongValue, 0, 2, null) + " / " + com.neeeex.eraser.utils.d.b(jLongValue2, 0, 2, null));
        View view = this.binding.f85302z.f85341b;
        "viewNeeeexProgressOther" /* decoded XOR */;
        view.getClass();
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        "null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams" /* decoded XOR */;
        layoutParams.getClass();
        ConstraintLayout.b bVar = (ConstraintLayout.b) layoutParams;
        bVar.V = jLongValue2 > 0 ? am.q.o(jLongValue / jLongValue2, 0.0f, 1.0f) : 0.0f;
        view.setLayoutParams(bVar);
        return m0.f80959a;
    }

    private final void updateActive() {
        com.neeeex.eraser.ads.e.b0().J0(this.resumed && this.visible);
        if (this.resumed) {
            com.neeeex.eraser.ads.e.b0().C0(this.host.getActivity(), this.visible);
        }
        boolean z10 = this.resumed && this.visible && this.expanded;
        if (z10 == this.active) {
            return;
        }
        this.active = z10;
        Job job = this.refreshJob;
        if (job != null) {
            Job.a.a(job, null, 1, null);
        }
        this.refreshJob = null;
        if (!this.active) {
            this.binding.D.u();
            this.ads.pause();
            return;
        }
        Application application = this.host.getActivity().getApplication();
        "null cannot be cast to non-null type com.neeeex.eraser.MyApplication" /* decoded XOR */;
        application.getClass();
        ((com.neeeex.eraser.y) application).markToolRuntimeInitialized();
        this.binding.C.setVisibility((!com.neeeex.eraser.module.report.bytedance.a.k() || ui.a.f100035a.a(getContext())) ? 8 : 0);
        this.binding.D.x();
        mi.a.f88870a.Y();
        LauncherTelemetry.INSTANCE.report("panel_open" /* decoded XOR */, "minus_one" /* decoded XOR */);
        ToolModuleUsageTracker.INSTANCE.reportMinusOne(this.host.getActivity());
        NewUserDesktopFunnelTracker.INSTANCE.reportFirstMinusOneShown(this.host.getActivity());
        this.ads.resume();
        this.refreshJob = kotlinx.coroutines.k.d(this.scope, null, null, new C36411(null), 3, null);
    }

    public final void destroy() {
        this.resumed = false;
        this.visible = false;
        updateActive();
        Job job = this.refreshJob;
        if (job != null) {
            Job.a.a(job, null, 1, null);
        }
        q0.d(this.scope, null, 1, null);
        this.ads.destroy();
        this.binding.D.m();
    }

    public final void onHostPause() {
        this.resumed = false;
        updateActive();
    }

    public final void onHostResume() {
        this.resumed = true;
        updateActive();
    }

    public final void onPanelScroll(float progress) {
        this.expanded = progress >= 0.999f;
        updateActive();
    }

    public final void onPanelVisibilityChanged(boolean value) {
        this.visible = value;
        updateActive();
    }
}