package com.neeeex.eraser.recover.reco.f;

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
import kotlinx.coroutines.z0;
import p003kotlin.Metadata;
import p003kotlin.jvm.functions.Function0;
import p003kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u0000 -2\u00020\u0001:\u0002./B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0005\u0010\u0003J\u000f\u0010\u0006\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0006\u0010\u0003J\u0019\u0010\t\u001a\u00020\u00042\b\u0010\b\u001a\u0004\u0018\u00010\u0007H\u0014¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\u000b\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u000b\u0010\u0003J\u000f\u0010\f\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\f\u0010\u0003J\u000f\u0010\r\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\r\u0010\u0003J\u000f\u0010\u000e\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u000e\u0010\u0003J\u000f\u0010\u000f\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u000f\u0010\u0003J\u0017\u0010\u0012\u001a\u00020\u00042\u0006\u0010\u0011\u001a\u00020\u0010H\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0014\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0014\u0010\u0003J\u000f\u0010\u0015\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0015\u0010\u0003J\u0017\u0010\u0018\u001a\u00020\u00042\u0006\u0010\u0017\u001a\u00020\u0016H\u0002¢\u0006\u0004\b\u0018\u0010\u0019R\u0016\u0010\u001d\u001a\u00020\u001a8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR\u0016\u0010!\u001a\u00020\u001e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001f\u0010 R\u0018\u0010%\u001a\u0004\u0018\u00010\"8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b#\u0010$R\u0016\u0010(\u001a\u00020\u00168\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b&\u0010'R\u0016\u0010,\u001a\u00020)8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b*\u0010+¨\u00060"}, d2 = {"Lcom/neeeex/eraser/recover/reco/f/FileScanNEEEEXActivity;", "Lcom/neeeex/eraser/base/BaseStoragePermActivity;", "<init>", "()V", "Lfl/m0;", "V0", "onStoragePermission", "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "(Landroid/os/Bundle;)V", "onBackPressed", "S0", "Z0", "T0", "X0", "Landroid/animation/Animator$AnimatorListener;", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "c1", "(Landroid/animation/Animator$AnimatorListener;)V", "Y0", "U0", "", "stopSearch", "a1", "(Z)V", "", "c", "J", "scanStartedAt", "Lcom/neeeex/eraser/recover/reco/f/FileScanNEEEEXActivity$b;", "d", "Lcom/neeeex/eraser/recover/reco/f/FileScanNEEEEXActivity$b;", "scanPhase", "Lkotlinx/coroutines/Job;", "e", "Lkotlinx/coroutines/Job;", "permissionPreviewJob", "f", "Z", "exitInProgress", "Lji/i;", "g", "Lji/i;", "binding", "h", DownloadCommon.DOWNLOAD_REPORT_FIND_FILE_RESULT_VALUE_B, "a", "tool-feature_productionRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class FileScanNEEEEXActivity extends BaseStoragePermActivity {

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    public long scanStartedAt;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    public b scanPhase = b.READY;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    public Job permissionPreviewJob;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    public boolean exitInProgress;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    public ji.i binding;

    public enum b {
        READY,
        PERMISSION_PREVIEW,
        AWAITING_PERMISSION,
        ACTIVE,
        MINIMUM_DELAY,
        COMPLETE;


        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ ml.a f65613b = ml.b.a(d());

        public static ml.a getEntries() {
            return f65613b;
        }
    }

    public static final class c extends AnimatorListenerAdapter {
        public c() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            com.neeeex.eraser.m0.a("DCQ97xj6oYID\n", "bUpUgnmOyO0=\n");
            animator.getClass();
            FileScanNEEEEXActivity.this.c1(this);
        }
    }

    public static final class d extends ll.m implements tl.n {
        final /* synthetic */ long $remaining;
        int label;
        final /* synthetic */ FileScanNEEEEXActivity this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(long j10, FileScanNEEEEXActivity fileScanNEEEEXActivity, kl.f<? super d> fVar) {
            super(2, fVar);
            this.$remaining = j10;
            this.this$0 = fileScanNEEEEXActivity;
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
                if (z0.b(j10, this) == objF) {
                    return objF;
                }
            } else {
                if (i10 != 1) {
                    gq.v0.a(com.neeeex.eraser.m0.a("IjFcJLsliAhmIlU77jyCD2EyVS70I4IIZjlePvQ6gg9hJ1k883GERzM/RTzyP4I=\n", "QVAwSJtR5yg=\n"));
                    return null;
                }
                fl.v.b(obj);
            }
            com.neeeex.eraser.ads.e.b0().z0();
            this.this$0.U0();
            return fl.m0.f80959a;
        }
    }

    public static final class e extends ll.m implements tl.n {
        int label;

        public e(kl.f<? super e> fVar) {
            super(2, fVar);
        }

        public static fl.m0 b(FileScanNEEEEXActivity fileScanNEEEEXActivity, int i10) {
            ji.i iVar = fileScanNEEEEXActivity.binding;
            if (iVar == null) {
                p003kotlin.jvm.internal.v.n(com.neeeex.eraser.m0.a("VnsISTpxfg==\n", "NBJmLVMfGU8=\n"));
                iVar = null;
            }
            iVar.f85486f.setProgress(i10);
            return fl.m0.f80959a;
        }

        public static fl.m0 f(FileScanNEEEEXActivity fileScanNEEEEXActivity) {
            fileScanNEEEEXActivity.a1(true);
            return fl.m0.f80959a;
        }

        @Override // ll.a
        public final kl.f<fl.m0> create(Object obj, kl.f<?> fVar) {
            return FileScanNEEEEXActivity.this.new e(fVar);
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
                final FileScanNEEEEXActivity fileScanNEEEEXActivity = FileScanNEEEEXActivity.this;
                Function1 function1 = new Function1() { // from class: com.neeeex.eraser.recover.reco.f.q0
                    @Override // p003kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj2) {
                        return FileScanNEEEEXActivity.e.b(fileScanNEEEEXActivity, ((Integer) obj2).intValue());
                    }
                };
                this.label = 1;
                eVar = this;
                if (com.neeeex.eraser.base.p.b(pVar, 0, function1, eVar, 1, null) == objF) {
                    return objF;
                }
            } else {
                if (i10 != 1) {
                    gq.v0.a(com.neeeex.eraser.m0.a("Ge2+HtsafyJd/rcBjgN1JVrutxSUHHUiXeW8BJQFdSVa+7sGk05zbQjjpwaSAHU=\n", "eozScvtuEAI=\n"));
                    return null;
                }
                fl.v.b(obj);
                eVar = this;
            }
            if (FileScanNEEEEXActivity.this.scanPhase != b.PERMISSION_PREVIEW) {
                return fl.m0.f80959a;
            }
            FileScanNEEEEXActivity.this.scanPhase = b.AWAITING_PERMISSION;
            final FileScanNEEEEXActivity fileScanNEEEEXActivity2 = FileScanNEEEEXActivity.this;
            fileScanNEEEEXActivity2.askPermission(new Function0() { // from class: com.neeeex.eraser.recover.reco.f.r0
                @Override // p003kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return FileScanNEEEEXActivity.e.f(fileScanNEEEEXActivity2);
                }
            });
            return fl.m0.f80959a;
        }
    }

    public static void H0(FileScanNEEEEXActivity fileScanNEEEEXActivity, View view) {
        fileScanNEEEEXActivity.onBackPressed();
    }

    public static fl.m0 I0(FileScanNEEEEXActivity fileScanNEEEEXActivity) {
        fileScanNEEEEXActivity.a1(true);
        return fl.m0.f80959a;
    }

    public static fl.m0 J0(FileScanNEEEEXActivity fileScanNEEEEXActivity, ii.c cVar) {
        ji.i iVar = fileScanNEEEEXActivity.binding;
        ji.i iVar2 = null;
        if (iVar == null) {
            p003kotlin.jvm.internal.v.n(com.neeeex.eraser.m0.a("YRfsEH3aVg==\n", "A36CdBS0Mco=\n"));
            iVar = null;
        }
        iVar.f85487g.setText(cVar.e());
        ji.i iVar3 = fileScanNEEEEXActivity.binding;
        if (iVar3 == null) {
            p003kotlin.jvm.internal.v.n(com.neeeex.eraser.m0.a("O6e9WxXv/Q==\n", "Wc7TP3yBmlw=\n"));
            iVar3 = null;
        }
        if (iVar3.f85486f.getProgress() < 60) {
            ji.i iVar4 = fileScanNEEEEXActivity.binding;
            if (iVar4 == null) {
                p003kotlin.jvm.internal.v.n(com.neeeex.eraser.m0.a("Y5VL3I/PCA==\n", "AfwluOahbxk=\n"));
            } else {
                iVar2 = iVar4;
            }
            ProgressBar progressBar = iVar2.f85486f;
            progressBar.setProgress(progressBar.getProgress() + 3);
        }
        return fl.m0.f80959a;
    }

    public static fl.m0 K0(FileScanNEEEEXActivity fileScanNEEEEXActivity, List list) {
        fileScanNEEEEXActivity.Y0();
        return fl.m0.f80959a;
    }

    private final void V0() {
        ji.i iVar = this.binding;
        ji.i iVar2 = null;
        if (iVar == null) {
            p003kotlin.jvm.internal.v.n(com.neeeex.eraser.m0.a("2ytCPqzeDQ==\n", "uUIsWsWwakE=\n"));
            iVar = null;
        }
        iVar.f85483c.setOnClickListener(new View.OnClickListener() { // from class: com.neeeex.eraser.recover.reco.f.k0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                FileScanNEEEEXActivity.H0(this.f65673a, view);
            }
        });
        ji.i iVar3 = this.binding;
        if (iVar3 == null) {
            p003kotlin.jvm.internal.v.n(com.neeeex.eraser.m0.a("ZiILY0WHBQ==\n", "BEtlByzpYtA=\n"));
            iVar3 = null;
        }
        LinearLayout linearLayout = iVar3.f85484d;
        com.neeeex.eraser.m0.a("9TnXQcj9QUrUNPBK7vdKRvg890Hf\n", "mVWZJK2YJDI=\n");
        linearLayout.getClass();
        ji.i iVar4 = this.binding;
        if (iVar4 == null) {
            p003kotlin.jvm.internal.v.n(com.neeeex.eraser.m0.a("h5oVU4Yf4g==\n", "5fN7N+9xhSM=\n"));
            iVar4 = null;
        }
        LottieAnimationView lottieAnimationView = iVar4.f85485e;
        com.neeeex.eraser.m0.a("Q5ut+Ho6Gllpho/4TDweTw==\n", "L+/jnR9ffyE=\n");
        lottieAnimationView.getClass();
        ji.i iVar5 = this.binding;
        if (iVar5 == null) {
            p003kotlin.jvm.internal.v.n(com.neeeex.eraser.m0.a("su9Dz/wk2A==\n", "0IYtq5VKvys=\n"));
            iVar5 = null;
        }
        AppCompatTextView appCompatTextView = iVar5.f85488h;
        com.neeeex.eraser.m0.a("E0FfyEI8WAw0Q3DZQg==\n", "ZzcRrSdZPXQ=\n");
        appCompatTextView.getClass();
        Iterator it = gl.w.p(linearLayout, lottieAnimationView, appCompatTextView).iterator();
        while (it.hasNext()) {
            ((View) it.next()).setOnClickListener(new View.OnClickListener() { // from class: com.neeeex.eraser.recover.reco.f.l0
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    FileScanNEEEEXActivity.W0(this.f65675a, view);
                }
            });
        }
        ji.i iVar6 = this.binding;
        if (iVar6 == null) {
            p003kotlin.jvm.internal.v.n(com.neeeex.eraser.m0.a("nSOoQiN9Dw==\n", "/0rGJkoTaCs=\n"));
            iVar6 = null;
        }
        iVar6.f85485e.setFrame(88);
        ji.i iVar7 = this.binding;
        if (iVar7 == null) {
            p003kotlin.jvm.internal.v.n(com.neeeex.eraser.m0.a("4hX8ovOsDQ==\n", "gHySxprCah0=\n"));
            iVar7 = null;
        }
        iVar7.f85485e.setMinFrame(88);
        ji.i iVar8 = this.binding;
        if (iVar8 == null) {
            p003kotlin.jvm.internal.v.n(com.neeeex.eraser.m0.a("bnPaate9jw==\n", "DBq0Dr7T6P8=\n"));
        } else {
            iVar2 = iVar8;
        }
        iVar2.f85486f.setVisibility(8);
    }

    public static final void W0(FileScanNEEEEXActivity fileScanNEEEEXActivity, View view) {
        fileScanNEEEEXActivity.S0();
    }

    public static final void b1(FileScanNEEEEXActivity fileScanNEEEEXActivity) {
        fileScanNEEEEXActivity.a1(true);
    }

    public final void S0() {
        b bVar = this.scanPhase;
        if (bVar == b.AWAITING_PERMISSION) {
            askPermission(new Function0() { // from class: com.neeeex.eraser.recover.reco.f.m0
                @Override // p003kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return FileScanNEEEEXActivity.I0(this.f65677a);
                }
            });
            return;
        }
        if (bVar != b.READY) {
            return;
        }
        if (!checkStoragePermission(this)) {
            Z0();
            mi.a.f88870a.H0();
        } else {
            com.neeeex.eraser.push.a.f65469a.o();
            com.neeeex.eraser.utils.b0.f66131a.C(com.neeeex.eraser.m0.a("wU9ANPEujljKYGw59SW0UsZXeijLLYJR10xANvU/jk7GYGsz+S4=\n", "sj8fWpRL6z0=\n"), System.currentTimeMillis());
            T0();
            mi.a.f88870a.H0();
        }
    }

    public final void T0() {
        this.scanPhase = b.ACTIVE;
        ji.i iVar = this.binding;
        ji.i iVar2 = null;
        if (iVar == null) {
            p003kotlin.jvm.internal.v.n(com.neeeex.eraser.m0.a("352ikggGqw==\n", "vfTM9mFozBg=\n"));
            iVar = null;
        }
        iVar.f85488h.setText(R$string.photo_neeeex_scanning);
        ji.i iVar3 = this.binding;
        if (iVar3 == null) {
            p003kotlin.jvm.internal.v.n(com.neeeex.eraser.m0.a("K65Antqoxg==\n", "Sccu+rPGoeA=\n"));
            iVar3 = null;
        }
        iVar3.f85485e.setVisibility(0);
        ji.i iVar4 = this.binding;
        if (iVar4 == null) {
            p003kotlin.jvm.internal.v.n(com.neeeex.eraser.m0.a("ebuJ6ZvMwQ==\n", "G9LnjfKiprY=\n"));
            iVar4 = null;
        }
        iVar4.f85485e.m();
        ji.i iVar5 = this.binding;
        if (iVar5 == null) {
            p003kotlin.jvm.internal.v.n(com.neeeex.eraser.m0.a("ShhUgY6z0Q==\n", "KHE65efdtjU=\n"));
            iVar5 = null;
        }
        iVar5.f85485e.setFrame(88);
        ji.i iVar6 = this.binding;
        if (iVar6 == null) {
            p003kotlin.jvm.internal.v.n(com.neeeex.eraser.m0.a("3GYHfd8wIA==\n", "vg9pGbZeR7E=\n"));
            iVar6 = null;
        }
        iVar6.f85485e.setMinFrame(88);
        ji.i iVar7 = this.binding;
        if (iVar7 == null) {
            p003kotlin.jvm.internal.v.n(com.neeeex.eraser.m0.a("/GxcA+PkkA==\n", "ngUyZ4qK97I=\n"));
            iVar7 = null;
        }
        iVar7.f85485e.setRepeatCount(0);
        ji.i iVar8 = this.binding;
        if (iVar8 == null) {
            p003kotlin.jvm.internal.v.n(com.neeeex.eraser.m0.a("vQb2e7F0MA==\n", "32+YH9gaV8c=\n"));
            iVar8 = null;
        }
        iVar8.f85485e.v();
        ji.i iVar9 = this.binding;
        if (iVar9 == null) {
            p003kotlin.jvm.internal.v.n(com.neeeex.eraser.m0.a("wilE0cs+/Q==\n", "oEAqtaJQmgk=\n"));
        } else {
            iVar2 = iVar9;
        }
        iVar2.f85485e.i(new c());
        X0();
        mi.a.f88870a.G0();
    }

    public final void U0() {
        b bVar = this.scanPhase;
        b bVar2 = b.COMPLETE;
        if (bVar == bVar2) {
            return;
        }
        this.scanPhase = bVar2;
        ji.i iVar = this.binding;
        if (iVar == null) {
            p003kotlin.jvm.internal.v.n(com.neeeex.eraser.m0.a("hTHhH5GLDQ==\n", "51iPe/jlamA=\n"));
            iVar = null;
        }
        iVar.f85485e.m();
        ji.i iVar2 = this.binding;
        if (iVar2 == null) {
            p003kotlin.jvm.internal.v.n(com.neeeex.eraser.m0.a("66YILG6LVA==\n", "ic9mSAflM7w=\n"));
            iVar2 = null;
        }
        iVar2.f85486f.setProgress(100);
        ji.i iVar3 = this.binding;
        if (iVar3 == null) {
            p003kotlin.jvm.internal.v.n(com.neeeex.eraser.m0.a("xwYFhpj1aA==\n", "pW9r4vGbD3s=\n"));
            iVar3 = null;
        }
        iVar3.f85487g.setText("");
        ji.i iVar4 = this.binding;
        if (iVar4 == null) {
            p003kotlin.jvm.internal.v.n(com.neeeex.eraser.m0.a("N8OWXySV3A==\n", "Var4O037u5A=\n"));
            iVar4 = null;
        }
        iVar4.f85488h.setText(R$string.photo_neeeex_scan_end);
        mi.a.f88870a.F0();
        boolean z10 = com.neeeex.eraser.module.report.bytedance.a.k() && com.neeeex.eraser.ads.h.f64923a.g().c() > -0.1d;
        if (com.neeeex.eraser.module.report.bytedance.a.k()) {
            FileScanResultNEEEEXActivity.INSTANCE.a(this, z10);
            BaseAdActivity.showInter$default(this, com.neeeex.eraser.m0.a("CF4+bVBsgn0fViVhWmM=\n", "WhhhPhMtzCI=\n"), null, 2, null);
        } else {
            FileScanResultNEEEEXActivity.INSTANCE.a(this, false);
        }
        finish();
    }

    public final void X0() {
        FileScanNEEEEXActivity fileScanNEEEEXActivity;
        MutableLiveData mutableLiveDataB;
        MutableLiveData mutableLiveDataZ;
        this.scanStartedAt = System.currentTimeMillis();
        ji.i iVar = this.binding;
        ji.i iVar2 = null;
        if (iVar == null) {
            p003kotlin.jvm.internal.v.n(com.neeeex.eraser.m0.a("gEa/LTKtcw==\n", "4i/RSVvDFEc=\n"));
            iVar = null;
        }
        iVar.f85486f.setVisibility(0);
        ji.i iVar3 = this.binding;
        if (iVar3 == null) {
            p003kotlin.jvm.internal.v.n(com.neeeex.eraser.m0.a("3l1jusaYrA==\n", "vDQN3q/2y0A=\n"));
        } else {
            iVar2 = iVar3;
        }
        iVar2.f85486f.setProgress(2);
        com.neeeex.eraser.h0 sharedViewModel = getSharedViewModel();
        if (sharedViewModel == null || (mutableLiveDataZ = sharedViewModel.z()) == null) {
            fileScanNEEEEXActivity = this;
        } else {
            fileScanNEEEEXActivity = this;
            ti.h.g(mutableLiveDataZ, fileScanNEEEEXActivity, false, false, new Function1() { // from class: com.neeeex.eraser.recover.reco.f.o0
                @Override // p003kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return FileScanNEEEEXActivity.J0(this.f65681a, (ii.c) obj);
                }
            }, 4, null);
        }
        com.neeeex.eraser.h0 sharedViewModel2 = getSharedViewModel();
        if (sharedViewModel2 != null && (mutableLiveDataB = sharedViewModel2.B()) != null) {
            ti.h.g(mutableLiveDataB, fileScanNEEEEXActivity, false, false, new Function1() { // from class: com.neeeex.eraser.recover.reco.f.p0
                @Override // p003kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return FileScanNEEEEXActivity.K0(this.f65683a, (List) obj);
                }
            }, 4, null);
        }
        com.neeeex.eraser.h0 sharedViewModel3 = getSharedViewModel();
        if (sharedViewModel3 != null) {
            sharedViewModel3.L(this, 3);
        }
    }

    public final void Y0() {
        if (this.scanPhase != b.ACTIVE) {
            return;
        }
        this.scanPhase = b.MINIMUM_DELAY;
        long jCurrentTimeMillis = 4000 - (System.currentTimeMillis() - this.scanStartedAt);
        if (jCurrentTimeMillis <= 0) {
            U0();
        } else {
            kotlinx.coroutines.k.d(LifecycleOwnerKt.getLifecycleScope(this), null, null, new d(jCurrentTimeMillis, this, null), 3, null);
        }
    }

    public final void Z0() {
        this.scanPhase = b.PERMISSION_PREVIEW;
        ji.i iVar = this.binding;
        if (iVar == null) {
            p003kotlin.jvm.internal.v.n(com.neeeex.eraser.m0.a("jrMdqD0WsA==\n", "7NpzzFR410E=\n"));
            iVar = null;
        }
        iVar.f85488h.setText(R$string.photo_neeeex_scanning);
        ji.i iVar2 = this.binding;
        if (iVar2 == null) {
            p003kotlin.jvm.internal.v.n(com.neeeex.eraser.m0.a("mn6doYB8fg==\n", "+BfzxekSGTI=\n"));
            iVar2 = null;
        }
        iVar2.f85487g.setText(R$string.neeeex_permission_scan_preparing);
        ji.i iVar3 = this.binding;
        if (iVar3 == null) {
            p003kotlin.jvm.internal.v.n(com.neeeex.eraser.m0.a("TnY+D86K/w==\n", "LB9Qa6fkmGE=\n"));
            iVar3 = null;
        }
        iVar3.f85486f.setVisibility(0);
        ji.i iVar4 = this.binding;
        if (iVar4 == null) {
            p003kotlin.jvm.internal.v.n(com.neeeex.eraser.m0.a("qqERKiuGgw==\n", "yMh/TkLo5HI=\n"));
            iVar4 = null;
        }
        LottieAnimationView lottieAnimationView = iVar4.f85485e;
        lottieAnimationView.setMinFrame(0);
        lottieAnimationView.setRepeatCount(-1);
        lottieAnimationView.v();
        this.permissionPreviewJob = kotlinx.coroutines.k.d(LifecycleOwnerKt.getLifecycleScope(this), null, null, new e(null), 3, null);
    }

    public final void a1(boolean stopSearch) {
        com.neeeex.eraser.h0 sharedViewModel;
        if (this.exitInProgress) {
            return;
        }
        this.exitInProgress = true;
        this.scanPhase = b.COMPLETE;
        Job job = this.permissionPreviewJob;
        ji.i iVar = null;
        if (job != null) {
            Job.a.a(job, null, 1, null);
        }
        ji.i iVar2 = this.binding;
        if (iVar2 == null) {
            p003kotlin.jvm.internal.v.n(com.neeeex.eraser.m0.a("dSOZmlTymw==\n", "F0r3/j2c/Gk=\n"));
        } else {
            iVar = iVar2;
        }
        iVar.f85485e.m();
        if (stopSearch && (sharedViewModel = getSharedViewModel()) != null) {
            sharedViewModel.N();
        }
        zi.l.f104405a.b(this, com.neeeex.eraser.m0.a("DmM4Z67rpooOYDNhv+S3nBI=\n", "XCVnNO2q6NU=\n"), zi.n.FILE_RECOVERY);
    }

    public final void c1(Animator.AnimatorListener listener) {
        ji.i iVar = this.binding;
        if (iVar == null) {
            p003kotlin.jvm.internal.v.n(com.neeeex.eraser.m0.a("Ry1yETbHdw==\n", "JUQcdV+pEEc=\n"));
            iVar = null;
        }
        LottieAnimationView lottieAnimationView = iVar.f85485e;
        lottieAnimationView.w(listener);
        lottieAnimationView.setMinFrame(0);
        lottieAnimationView.setRepeatCount(-1);
        lottieAnimationView.v();
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        if (this.scanPhase == b.COMPLETE) {
            a1(false);
            return;
        }
        ExitScanDialog exitScanDialogB = ExitScanDialog.Companion.b(ExitScanDialog.INSTANCE, 0, 1, null);
        exitScanDialogB.p(new ki.a() { // from class: com.neeeex.eraser.recover.reco.f.n0
            @Override // ki.a
            public final void a() {
                FileScanNEEEEXActivity.b1(this.f65679a);
            }
        });
        androidx.fragment.app.l0 supportFragmentManager = getSupportFragmentManager();
        com.neeeex.eraser.m0.a("3BBLSQEYiDXJAXloFQ+VP9UBcnsaCZ8/yV0RNFpB\n", "u3U/GnRo+Fo=\n");
        supportFragmentManager.getClass();
        exitScanDialogB.i(supportFragmentManager);
    }

    @Override // com.neeeex.eraser.base.RootActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ji.i iVarC = ji.i.c(getLayoutInflater());
        com.neeeex.eraser.m0.a("u4fr/tcYrGL8x6O7\n", "0umNkrZsyUo=\n");
        iVarC.getClass();
        this.binding = iVarC;
        ji.i iVar = null;
        if (iVarC == null) {
            p003kotlin.jvm.internal.v.n(com.neeeex.eraser.m0.a("6hRVejaivQ==\n", "iH07Hl/M2pc=\n"));
            iVarC = null;
        }
        setContentView(iVarC.getRoot());
        V0();
        if (com.neeeex.eraser.module.report.bytedance.a.k()) {
            ji.i iVar2 = this.binding;
            if (iVar2 == null) {
                p003kotlin.jvm.internal.v.n(com.neeeex.eraser.m0.a("4k6FUL+Cag==\n", "gCfrNNbsDYI=\n"));
            } else {
                iVar = iVar2;
            }
            FrameLayout frameLayout = iVar.f85482b;
            com.neeeex.eraser.m0.a("F80uPcJPN9sQyAE88w==\n", "caFvWYEgWa8=\n");
            frameLayout.getClass();
            BaseAdActivity.showRenderAdAndRefresh$default(this, frameLayout, R$layout.ad_neeeex_native_white, com.neeeex.eraser.m0.a("vwn9CMA1r1qjDvYS1TE=\n", "7U+iW4N04QU=\n"), null, 8, null);
        }
        mi.a.f88870a.I0();
        S0();
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
        b bVar = this.scanPhase;
        if (bVar == b.PERMISSION_PREVIEW || bVar == b.AWAITING_PERMISSION) {
            this.scanPhase = b.READY;
        }
        S0();
    }

    /* JADX INFO: renamed from: com.neeeex.eraser.recover.reco.f.FileScanNEEEEXActivity$a, reason: from kotlin metadata */
    public static final class Companion {
        public /* synthetic */ Companion(p003kotlin.jvm.internal.m mVar) {
            this();
        }

        public final void a(Context context) {
            com.neeeex.eraser.m0.a("qqup6hWpnA==\n", "ycTHnnDR6Ls=\n");
            context.getClass();
            context.startActivity(new Intent(context, (Class<?>) FileScanNEEEEXActivity.class));
        }

        public Companion() {
        }
    }
}