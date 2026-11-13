package com.neeeex.eraser.recover.reco.v;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.p002lifecycle.LifecycleOwnerKt;
import androidx.p002lifecycle.MutableLiveData;
import com.airbnb.lottie.LottieAnimationView;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.mbridge.msdk.foundation.download.core.DownloadCommon;
import com.neeeex.eraser.R$layout;
import com.neeeex.eraser.R$string;
import com.neeeex.eraser.base.BaseAdActivity;
import com.neeeex.eraser.base.BaseStoragePermActivity;
import com.neeeex.eraser.module.dialog.ExitScanDialog;
import java.util.Iterator;
import java.util.List;
import kotlinx.coroutines.Job;
import p003kotlin.Metadata;
import p003kotlin.jvm.functions.Function0;
import p003kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u0000 -2\u00020\u0001:\u0002./B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0005\u0010\u0003J\u000f\u0010\u0006\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0006\u0010\u0003J\u0017\u0010\t\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\u000b\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u000b\u0010\u0003J\u000f\u0010\f\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\f\u0010\u0003J\u0017\u0010\u000f\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\rH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0011\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0011\u0010\u0003J\u0019\u0010\u0014\u001a\u00020\u00042\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012H\u0014¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0016\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0016\u0010\u0003J\u000f\u0010\u0017\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0017\u0010\u0003J\u000f\u0010\u0018\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0018\u0010\u0003J\u000f\u0010\u0019\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0019\u0010\u0003R\u0016\u0010\u001d\u001a\u00020\u001a8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR\u0016\u0010!\u001a\u00020\u001e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001f\u0010 R\u0018\u0010%\u001a\u0004\u0018\u00010\"8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b#\u0010$R\u0016\u0010(\u001a\u00020\r8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b&\u0010'R\u0016\u0010,\u001a\u00020)8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b*\u0010+¨\u00060"}, d2 = {"Lcom/neeeex/eraser/recover/reco/v/VideoScanNEEEEXActivity;", "Lcom/neeeex/eraser/base/BaseStoragePermActivity;", "<init>", "()V", "Lfl/m0;", "W0", "U0", "Landroid/animation/Animator$AnimatorListener;", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "c1", "(Landroid/animation/Animator$AnimatorListener;)V", "V0", "T0", "", "stopSearch", "X0", "(Z)V", "onStoragePermission", "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "(Landroid/os/Bundle;)V", "onBackPressed", "Z0", "b1", "S0", "", "c", "J", "scanStartedAt", "Lcom/neeeex/eraser/recover/reco/v/VideoScanNEEEEXActivity$b;", "d", "Lcom/neeeex/eraser/recover/reco/v/VideoScanNEEEEXActivity$b;", "scanStatus", "Lkotlinx/coroutines/Job;", "e", "Lkotlinx/coroutines/Job;", "permissionPreviewJob", "f", "Z", "exitInProgress", "Lji/f0;", "g", "Lji/f0;", "binding", "h", DownloadCommon.DOWNLOAD_REPORT_FIND_FILE_RESULT_VALUE_B, "a", "tool-feature_productionRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class VideoScanNEEEEXActivity extends BaseStoragePermActivity {

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    public long scanStartedAt;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    public b scanStatus = b.IDLE;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    public Job permissionPreviewJob;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    public boolean exitInProgress;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    public ji.f0 binding;

    public enum b {
        IDLE(true, false),
        PERMISSION_PREVIEW(false, false),
        AWAITING_PERMISSION(true, false),
        SEARCHING(false, false),
        WAITING(false, false),
        DONE(false, true);


        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ ml.a f65958b = ml.b.a(d());
        private final boolean acceptsStart;
        private final boolean canExitDirectly;

        b(boolean z10, boolean z11) {
            this.acceptsStart = z10;
            this.canExitDirectly = z11;
        }

        public static ml.a getEntries() {
            return f65958b;
        }

        public final boolean getAcceptsStart() {
            return this.acceptsStart;
        }

        public final boolean getCanExitDirectly() {
            return this.canExitDirectly;
        }
    }

    public static final class c extends AnimatorListenerAdapter {
        public c() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            "animation" /* decoded XOR */;
            animator.getClass();
            VideoScanNEEEEXActivity.this.c1(this);
        }
    }

    public static final class d extends ll.m implements tl.n {
        final /* synthetic */ long $remaining;
        int label;
        final /* synthetic */ VideoScanNEEEEXActivity this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(long j10, VideoScanNEEEEXActivity videoScanNEEEEXActivity, kl.f<? super d> fVar) {
            super(2, fVar);
            this.$remaining = j10;
            this.this$0 = videoScanNEEEEXActivity;
        }

        @Override // ll.a
        public final kl.f<fl.m0> create(Object obj, kl.f<?> fVar) {
            return new d(this.$remaining, this.this$0, fVar);
        }

        @Override // tl.n
        public final Object invoke(kotlinx.coroutines.p0 p0Var, kl.f<? super fl.m0> fVar) {
            return ((d) create(p0Var, fVar)).invokeSuspend(fl.m0.f80959a);
        }

        @Override // ll.a
        public final Object invokeSuspend(Object obj) {
            Object objF = p003kotlin.coroutines.intrinsics.c.f();
            int i10 = this.label;
            if (i10 == 0) {
                fl.v.b(obj);
                long j10 = this.$remaining;
                this.label = 1;
                if (kotlinx.coroutines.z0.b(j10, this) == objF) {
                    return objF;
                }
            } else {
                if (i10 != 1) {
                    gq.v0.a("call to 'resume' before 'invoke' with coroutine" /* decoded XOR */);
                    return null;
                }
                fl.v.b(obj);
            }
            com.neeeex.eraser.ads.e.b0().z0();
            this.this$0.T0();
            return fl.m0.f80959a;
        }
    }

    public static final class e extends ll.m implements tl.n {
        int label;

        public e(kl.f<? super e> fVar) {
            super(2, fVar);
        }

        public static fl.m0 b(VideoScanNEEEEXActivity videoScanNEEEEXActivity) {
            videoScanNEEEEXActivity.X0(true);
            return fl.m0.f80959a;
        }

        public static fl.m0 f(VideoScanNEEEEXActivity videoScanNEEEEXActivity, int i10) {
            ji.f0 f0Var = videoScanNEEEEXActivity.binding;
            if (f0Var == null) {
                p003kotlin.jvm.internal.v.n("binding" /* decoded XOR */);
                f0Var = null;
            }
            f0Var.f85427f.setProgress(i10);
            return fl.m0.f80959a;
        }

        @Override // ll.a
        public final kl.f<fl.m0> create(Object obj, kl.f<?> fVar) {
            return VideoScanNEEEEXActivity.this.new e(fVar);
        }

        @Override // tl.n
        public final Object invoke(kotlinx.coroutines.p0 p0Var, kl.f<? super fl.m0> fVar) {
            return ((e) create(p0Var, fVar)).invokeSuspend(fl.m0.f80959a);
        }

        @Override // ll.a
        public final Object invokeSuspend(Object obj) {
            e eVar;
            Object objF = p003kotlin.coroutines.intrinsics.c.f();
            int i10 = this.label;
            if (i10 == 0) {
                fl.v.b(obj);
                com.neeeex.eraser.base.p pVar = com.neeeex.eraser.base.p.f65036a;
                final VideoScanNEEEEXActivity videoScanNEEEEXActivity = VideoScanNEEEEXActivity.this;
                Function1 function1 = new Function1() { // from class: com.neeeex.eraser.recover.reco.v.y0
                    @Override // p003kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj2) {
                        return VideoScanNEEEEXActivity.e.f(videoScanNEEEEXActivity, ((Integer) obj2).intValue());
                    }
                };
                this.label = 1;
                eVar = this;
                if (com.neeeex.eraser.base.p.b(pVar, 0, function1, eVar, 1, null) == objF) {
                    return objF;
                }
            } else {
                if (i10 != 1) {
                    gq.v0.a("call to 'resume' before 'invoke' with coroutine" /* decoded XOR */);
                    return null;
                }
                fl.v.b(obj);
                eVar = this;
            }
            if (VideoScanNEEEEXActivity.this.scanStatus != b.PERMISSION_PREVIEW) {
                return fl.m0.f80959a;
            }
            VideoScanNEEEEXActivity.this.scanStatus = b.AWAITING_PERMISSION;
            final VideoScanNEEEEXActivity videoScanNEEEEXActivity2 = VideoScanNEEEEXActivity.this;
            videoScanNEEEEXActivity2.askPermission(new Function0() { // from class: com.neeeex.eraser.recover.reco.v.z0
                @Override // p003kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return VideoScanNEEEEXActivity.e.b(videoScanNEEEEXActivity2);
                }
            });
            return fl.m0.f80959a;
        }
    }

    public static fl.m0 G0(VideoScanNEEEEXActivity videoScanNEEEEXActivity, ii.c cVar) {
        ji.f0 f0Var = videoScanNEEEEXActivity.binding;
        ji.f0 f0Var2 = null;
        if (f0Var == null) {
            p003kotlin.jvm.internal.v.n("binding" /* decoded XOR */);
            f0Var = null;
        }
        f0Var.f85428g.setText(cVar.e());
        ji.f0 f0Var3 = videoScanNEEEEXActivity.binding;
        if (f0Var3 == null) {
            p003kotlin.jvm.internal.v.n("binding" /* decoded XOR */);
            f0Var3 = null;
        }
        if (f0Var3.f85427f.getProgress() < 60) {
            ji.f0 f0Var4 = videoScanNEEEEXActivity.binding;
            if (f0Var4 == null) {
                p003kotlin.jvm.internal.v.n("binding" /* decoded XOR */);
            } else {
                f0Var2 = f0Var4;
            }
            ProgressBar progressBar = f0Var2.f85427f;
            progressBar.setProgress(progressBar.getProgress() + 3);
        }
        return fl.m0.f80959a;
    }

    public static fl.m0 I0(VideoScanNEEEEXActivity videoScanNEEEEXActivity, List list) {
        videoScanNEEEEXActivity.V0();
        return fl.m0.f80959a;
    }

    public static void K0(VideoScanNEEEEXActivity videoScanNEEEEXActivity, View view) {
        videoScanNEEEEXActivity.onBackPressed();
    }

    public static fl.m0 L0(VideoScanNEEEEXActivity videoScanNEEEEXActivity) {
        videoScanNEEEEXActivity.X0(true);
        return fl.m0.f80959a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void T0() {
        b bVar = this.scanStatus;
        b bVar2 = b.DONE;
        if (bVar == bVar2) {
            return;
        }
        this.scanStatus = bVar2;
        ji.f0 f0Var = this.binding;
        if (f0Var == null) {
            p003kotlin.jvm.internal.v.n("binding" /* decoded XOR */);
            f0Var = null;
        }
        f0Var.f85426e.m();
        ji.f0 f0Var2 = this.binding;
        if (f0Var2 == null) {
            p003kotlin.jvm.internal.v.n("binding" /* decoded XOR */);
            f0Var2 = null;
        }
        f0Var2.f85427f.setProgress(100);
        ji.f0 f0Var3 = this.binding;
        if (f0Var3 == null) {
            p003kotlin.jvm.internal.v.n("binding" /* decoded XOR */);
            f0Var3 = null;
        }
        f0Var3.f85428g.setText("");
        ji.f0 f0Var4 = this.binding;
        if (f0Var4 == null) {
            p003kotlin.jvm.internal.v.n("binding" /* decoded XOR */);
            f0Var4 = null;
        }
        f0Var4.f85429h.setText(R$string.photo_neeeex_scan_end);
        mi.a.f88870a.d1();
        if (com.neeeex.eraser.module.report.bytedance.a.k()) {
            VideoScanResultNEEEEXActivity.INSTANCE.a(this, com.neeeex.eraser.ads.h.f64923a.g().c() > -0.1d);
            BaseAdActivity.showInter$default(this, "RV_SCAN_END_IN" /* decoded XOR */, null, 2, null);
        } else {
            VideoScanResultNEEEEXActivity.INSTANCE.a(this, false);
        }
        finish();
    }

    private final void U0() {
        MutableLiveData mutableLiveDataB;
        MutableLiveData mutableLiveDataZ;
        this.scanStartedAt = System.currentTimeMillis();
        ji.f0 f0Var = this.binding;
        ji.f0 f0Var2 = null;
        if (f0Var == null) {
            p003kotlin.jvm.internal.v.n("binding" /* decoded XOR */);
            f0Var = null;
        }
        f0Var.f85427f.setVisibility(0);
        ji.f0 f0Var3 = this.binding;
        if (f0Var3 == null) {
            p003kotlin.jvm.internal.v.n("binding" /* decoded XOR */);
        } else {
            f0Var2 = f0Var3;
        }
        f0Var2.f85427f.setProgress(2);
        com.neeeex.eraser.h0 sharedViewModel = getSharedViewModel();
        if (sharedViewModel != null && (mutableLiveDataZ = sharedViewModel.z()) != null) {
            ti.h.g(mutableLiveDataZ, this, false, false, new Function1() { // from class: com.neeeex.eraser.recover.reco.v.w0
                @Override // p003kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return VideoScanNEEEEXActivity.G0(this.f66069a, (ii.c) obj);
                }
            }, 4, null);
        }
        com.neeeex.eraser.h0 sharedViewModel2 = getSharedViewModel();
        if (sharedViewModel2 != null && (mutableLiveDataB = sharedViewModel2.B()) != null) {
            ti.h.g(mutableLiveDataB, this, false, false, new Function1() { // from class: com.neeeex.eraser.recover.reco.v.x0
                @Override // p003kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return VideoScanNEEEEXActivity.I0(this.f66072a, (List) obj);
                }
            }, 4, null);
        }
        com.neeeex.eraser.h0 sharedViewModel3 = getSharedViewModel();
        if (sharedViewModel3 != null) {
            sharedViewModel3.L(this, 0);
        }
    }

    private final void V0() {
        if (this.scanStatus != b.SEARCHING) {
            return;
        }
        long jCurrentTimeMillis = 4000 - (System.currentTimeMillis() - this.scanStartedAt);
        this.scanStatus = b.WAITING;
        if (jCurrentTimeMillis <= 0) {
            T0();
        } else {
            kotlinx.coroutines.k.d(LifecycleOwnerKt.getLifecycleScope(this), null, null, new d(jCurrentTimeMillis, this, null), 3, null);
        }
    }

    private final void W0() {
        this.scanStatus = b.PERMISSION_PREVIEW;
        ji.f0 f0Var = this.binding;
        if (f0Var == null) {
            p003kotlin.jvm.internal.v.n("binding" /* decoded XOR */);
            f0Var = null;
        }
        f0Var.f85429h.setText(R$string.photo_neeeex_scanning);
        ji.f0 f0Var2 = this.binding;
        if (f0Var2 == null) {
            p003kotlin.jvm.internal.v.n("binding" /* decoded XOR */);
            f0Var2 = null;
        }
        f0Var2.f85428g.setText(R$string.neeeex_permission_scan_preparing);
        ji.f0 f0Var3 = this.binding;
        if (f0Var3 == null) {
            p003kotlin.jvm.internal.v.n("binding" /* decoded XOR */);
            f0Var3 = null;
        }
        f0Var3.f85427f.setVisibility(0);
        ji.f0 f0Var4 = this.binding;
        if (f0Var4 == null) {
            p003kotlin.jvm.internal.v.n("binding" /* decoded XOR */);
            f0Var4 = null;
        }
        LottieAnimationView lottieAnimationView = f0Var4.f85426e;
        lottieAnimationView.setMinFrame(0);
        lottieAnimationView.setRepeatCount(-1);
        lottieAnimationView.v();
        this.permissionPreviewJob = kotlinx.coroutines.k.d(LifecycleOwnerKt.getLifecycleScope(this), null, null, new e(null), 3, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void X0(boolean stopSearch) {
        com.neeeex.eraser.h0 sharedViewModel;
        if (this.exitInProgress) {
            return;
        }
        this.exitInProgress = true;
        this.scanStatus = b.DONE;
        Job job = this.permissionPreviewJob;
        ji.f0 f0Var = null;
        if (job != null) {
            Job.a.a(job, null, 1, null);
        }
        ji.f0 f0Var2 = this.binding;
        if (f0Var2 == null) {
            p003kotlin.jvm.internal.v.n("binding" /* decoded XOR */);
        } else {
            f0Var = f0Var2;
        }
        f0Var.f85426e.m();
        if (stopSearch && (sharedViewModel = getSharedViewModel()) != null) {
            sharedViewModel.N();
        }
        zi.l.f104405a.b(this, "RV_SCAN_RETURN_IN" /* decoded XOR */, zi.n.VIDEO_RECOVERY);
    }

    public static final void Y0(VideoScanNEEEEXActivity videoScanNEEEEXActivity) {
        videoScanNEEEEXActivity.X0(true);
    }

    public static final void a1(VideoScanNEEEEXActivity videoScanNEEEEXActivity, View view) {
        videoScanNEEEEXActivity.b1();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void c1(Animator.AnimatorListener listener) {
        ji.f0 f0Var = this.binding;
        if (f0Var == null) {
            p003kotlin.jvm.internal.v.n("binding" /* decoded XOR */);
            f0Var = null;
        }
        LottieAnimationView lottieAnimationView = f0Var.f85426e;
        lottieAnimationView.w(listener);
        lottieAnimationView.setMinFrame(0);
        lottieAnimationView.setRepeatCount(-1);
        lottieAnimationView.v();
    }

    public final void S0() {
        this.scanStatus = b.SEARCHING;
        ji.f0 f0Var = this.binding;
        ji.f0 f0Var2 = null;
        if (f0Var == null) {
            p003kotlin.jvm.internal.v.n("binding" /* decoded XOR */);
            f0Var = null;
        }
        f0Var.f85429h.setText(R$string.photo_neeeex_scanning);
        ji.f0 f0Var3 = this.binding;
        if (f0Var3 == null) {
            p003kotlin.jvm.internal.v.n("binding" /* decoded XOR */);
            f0Var3 = null;
        }
        f0Var3.f85426e.setVisibility(0);
        ji.f0 f0Var4 = this.binding;
        if (f0Var4 == null) {
            p003kotlin.jvm.internal.v.n("binding" /* decoded XOR */);
            f0Var4 = null;
        }
        f0Var4.f85426e.m();
        ji.f0 f0Var5 = this.binding;
        if (f0Var5 == null) {
            p003kotlin.jvm.internal.v.n("binding" /* decoded XOR */);
            f0Var5 = null;
        }
        f0Var5.f85426e.setFrame(88);
        ji.f0 f0Var6 = this.binding;
        if (f0Var6 == null) {
            p003kotlin.jvm.internal.v.n("binding" /* decoded XOR */);
            f0Var6 = null;
        }
        f0Var6.f85426e.setMinFrame(88);
        ji.f0 f0Var7 = this.binding;
        if (f0Var7 == null) {
            p003kotlin.jvm.internal.v.n("binding" /* decoded XOR */);
            f0Var7 = null;
        }
        f0Var7.f85426e.setRepeatCount(0);
        ji.f0 f0Var8 = this.binding;
        if (f0Var8 == null) {
            p003kotlin.jvm.internal.v.n("binding" /* decoded XOR */);
            f0Var8 = null;
        }
        f0Var8.f85426e.v();
        ji.f0 f0Var9 = this.binding;
        if (f0Var9 == null) {
            p003kotlin.jvm.internal.v.n("binding" /* decoded XOR */);
        } else {
            f0Var2 = f0Var9;
        }
        f0Var2.f85426e.i(new c());
        U0();
        mi.a.f88870a.e1();
    }

    public final void Z0() {
        ji.f0 f0Var = this.binding;
        ji.f0 f0Var2 = null;
        if (f0Var == null) {
            p003kotlin.jvm.internal.v.n("binding" /* decoded XOR */);
            f0Var = null;
        }
        f0Var.f85424c.setOnClickListener(new View.OnClickListener() { // from class: com.neeeex.eraser.recover.reco.v.s0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                VideoScanNEEEEXActivity.K0(this.f66060a, view);
            }
        });
        ji.f0 f0Var3 = this.binding;
        if (f0Var3 == null) {
            p003kotlin.jvm.internal.v.n("binding" /* decoded XOR */);
            f0Var3 = null;
        }
        LinearLayout linearLayout = f0Var3.f85425d;
        "llNeeeexMainContainer" /* decoded XOR */;
        linearLayout.getClass();
        ji.f0 f0Var4 = this.binding;
        if (f0Var4 == null) {
            p003kotlin.jvm.internal.v.n("binding" /* decoded XOR */);
            f0Var4 = null;
        }
        LottieAnimationView lottieAnimationView = f0Var4.f85426e;
        "ltNeeeexVideoScan" /* decoded XOR */;
        lottieAnimationView.getClass();
        ji.f0 f0Var5 = this.binding;
        if (f0Var5 == null) {
            p003kotlin.jvm.internal.v.n("binding" /* decoded XOR */);
            f0Var5 = null;
        }
        AppCompatTextView appCompatTextView = f0Var5.f85429h;
        "tvNeeeexState" /* decoded XOR */;
        appCompatTextView.getClass();
        Iterator it = gl.w.p(linearLayout, lottieAnimationView, appCompatTextView).iterator();
        while (it.hasNext()) {
            ((View) it.next()).setOnClickListener(new View.OnClickListener() { // from class: com.neeeex.eraser.recover.reco.v.t0
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    VideoScanNEEEEXActivity.a1(this.f66063a, view);
                }
            });
        }
        ji.f0 f0Var6 = this.binding;
        if (f0Var6 == null) {
            p003kotlin.jvm.internal.v.n("binding" /* decoded XOR */);
            f0Var6 = null;
        }
        f0Var6.f85426e.setFrame(88);
        ji.f0 f0Var7 = this.binding;
        if (f0Var7 == null) {
            p003kotlin.jvm.internal.v.n("binding" /* decoded XOR */);
            f0Var7 = null;
        }
        f0Var7.f85426e.setMinFrame(88);
        ji.f0 f0Var8 = this.binding;
        if (f0Var8 == null) {
            p003kotlin.jvm.internal.v.n("binding" /* decoded XOR */);
        } else {
            f0Var2 = f0Var8;
        }
        f0Var2.f85427f.setVisibility(8);
    }

    public final void b1() {
        b bVar = this.scanStatus;
        if (bVar == b.AWAITING_PERMISSION) {
            askPermission(new Function0() { // from class: com.neeeex.eraser.recover.reco.v.v0
                @Override // p003kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return VideoScanNEEEEXActivity.L0(this.f66067a);
                }
            });
            return;
        }
        if (bVar.getAcceptsStart()) {
            if (!checkStoragePermission(this)) {
                W0();
                mi.a.f88870a.f1();
            } else {
                com.neeeex.eraser.push.a.f65469a.o();
                com.neeeex.eraser.utils.b0.f66131a.C("sp_neeeex_scan_video_latest_time" /* decoded XOR */, System.currentTimeMillis());
                S0();
                mi.a.f88870a.f1();
            }
        }
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        if (this.scanStatus.getCanExitDirectly()) {
            X0(false);
            return;
        }
        ExitScanDialog exitScanDialogB = ExitScanDialog.Companion.b(ExitScanDialog.INSTANCE, 0, 1, null);
        exitScanDialogB.p(new ki.a() { // from class: com.neeeex.eraser.recover.reco.v.u0
            @Override // ki.a
            public final void a() {
                VideoScanNEEEEXActivity.Y0(this.f66065a);
            }
        });
        androidx.fragment.app.l0 supportFragmentManager = getSupportFragmentManager();
        "getSupportFragmentManager(...)" /* decoded XOR */;
        supportFragmentManager.getClass();
        exitScanDialogB.i(supportFragmentManager);
    }

    @Override // com.neeeex.eraser.base.RootActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ji.f0 f0VarC = ji.f0.c(getLayoutInflater());
        "inflate(...)" /* decoded XOR */;
        f0VarC.getClass();
        this.binding = f0VarC;
        ji.f0 f0Var = null;
        if (f0VarC == null) {
            p003kotlin.jvm.internal.v.n("binding" /* decoded XOR */);
            f0VarC = null;
        }
        setContentView(f0VarC.getRoot());
        Z0();
        if (com.neeeex.eraser.module.report.bytedance.a.k()) {
            ji.f0 f0Var2 = this.binding;
            if (f0Var2 == null) {
                p003kotlin.jvm.internal.v.n("binding" /* decoded XOR */);
            } else {
                f0Var = f0Var2;
            }
            FrameLayout frameLayout = f0Var.f85423b;
            "flAdContainer" /* decoded XOR */;
            frameLayout.getClass();
            BaseAdActivity.showRenderAdAndRefresh$default(this, frameLayout, R$layout.ad_neeeex_native_white, "RV_SCAN_NATIVE" /* decoded XOR */, null, 8, null);
        }
        mi.a.f88870a.g1();
        b1();
    }

    @Override // com.neeeex.eraser.base.BaseStoragePermActivity
    public void onStoragePermission() {
        if (this.binding == null) {
            return;
        }
        Job job = this.permissionPreviewJob;
        if (job != null) {
            Job.a.a(job, null, 1, null);
        }
        b bVar = this.scanStatus;
        if (bVar == b.PERMISSION_PREVIEW || bVar == b.AWAITING_PERMISSION) {
            this.scanStatus = b.IDLE;
        }
        b1();
    }

    /* JADX INFO: renamed from: com.neeeex.eraser.recover.reco.v.VideoScanNEEEEXActivity$a, reason: from kotlin metadata */
    public static final class Companion {
        public /* synthetic */ Companion(p003kotlin.jvm.internal.m mVar) {
            this();
        }

        public final void a(Context context) {
            "context" /* decoded XOR */;
            context.getClass();
            context.startActivity(new Intent(context, (Class<?>) VideoScanNEEEEXActivity.class));
        }

        public Companion() {
        }
    }
}