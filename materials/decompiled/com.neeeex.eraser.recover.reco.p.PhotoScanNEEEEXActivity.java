package com.neeeex.eraser.recover.reco.p;

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
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u0000 )2\u00020\u0001:\u0002*+B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0005\u0010\u0003J\u000f\u0010\u0006\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0006\u0010\u0003J\u000f\u0010\u0007\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\u0003J\u0017\u0010\n\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\f\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\f\u0010\u0003J\u000f\u0010\r\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\r\u0010\u0003J\u0017\u0010\u0010\u001a\u00020\u00042\u0006\u0010\u000f\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0012\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0012\u0010\u0003J\u0019\u0010\u0015\u001a\u00020\u00042\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013H\u0014¢\u0006\u0004\b\u0015\u0010\u0016J\u000f\u0010\u0017\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0017\u0010\u0003J\u000f\u0010\u0018\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0018\u0010\u0003J\u000f\u0010\u0019\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0019\u0010\u0003R\u0016\u0010\u001d\u001a\u00020\u001a8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR\u0018\u0010!\u001a\u0004\u0018\u00010\u001e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001f\u0010 R\u0016\u0010$\u001a\u00020\u000e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\"\u0010#R\u0016\u0010(\u001a\u00020%8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b&\u0010'¨\u0006,"}, d2 = {"Lcom/neeeex/eraser/recover/reco/p/PhotoScanNEEEEXActivity;", "Lcom/neeeex/eraser/base/BaseStoragePermActivity;", "<init>", "()V", "Lfl/m0;", "S0", "W0", "U0", "Landroid/animation/Animator$AnimatorListener;", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "c1", "(Landroid/animation/Animator$AnimatorListener;)V", "V0", "T0", "", "stopSearch", "Y0", "(Z)V", "onStoragePermission", "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "(Landroid/os/Bundle;)V", "onBackPressed", "a1", "X0", "Lcom/neeeex/eraser/recover/reco/p/PhotoScanNEEEEXActivity$b;", "c", "Lcom/neeeex/eraser/recover/reco/p/PhotoScanNEEEEXActivity$b;", "scanState", "Lkotlinx/coroutines/Job;", "d", "Lkotlinx/coroutines/Job;", "permissionPreviewJob", "e", "Z", "exitInProgress", "Lji/s;", "f", "Lji/s;", "binding", "g", DownloadCommon.DOWNLOAD_REPORT_FIND_FILE_RESULT_VALUE_B, "a", "tool-feature_productionRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class PhotoScanNEEEEXActivity extends BaseStoragePermActivity {

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    public b scanState = b.C0795b.f65779a;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    public Job permissionPreviewJob;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    public boolean exitInProgress;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    public ji.s binding;

    public interface b {

        public static final class a implements b {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final a f65778a = new a();

            public boolean equals(Object obj) {
                return this == obj || (obj instanceof a);
            }

            public int hashCode() {
                return 1332064659;
            }

            public String toString() {
                return com.neeeex.eraser.m0.a("gQD472lOrDyQEuvrdFSxMq8Z\n", "wHeZhh0nwls=\n");
            }
        }

        /* JADX INFO: renamed from: com.neeeex.eraser.recover.reco.p.PhotoScanNEEEEXActivity$b$b, reason: collision with other inner class name */
        public static final class C0795b implements b {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final C0795b f65779a = new C0795b();

            public boolean equals(Object obj) {
                return this == obj || (obj instanceof C0795b);
            }

            public int hashCode() {
                return -1381003746;
            }

            public String toString() {
                return com.neeeex.eraser.m0.a("pWD09AvWz6+3Y/TvCw==\n", "5BeVnX+/ocg=\n");
            }
        }

        public static final class c implements b {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final long f65780a;

            public c(long j10) {
                this.f65780a = j10;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof c) && this.f65780a == ((c) obj).f65780a;
            }

            public int hashCode() {
                return Long.hashCode(this.f65780a);
            }

            public String toString() {
                return "Delaying(remaining=" + this.f65780a + ")";
            }
        }

        public static final class d implements b {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final d f65781a = new d();

            public boolean equals(Object obj) {
                return this == obj || (obj instanceof d);
            }

            public int hashCode() {
                return -928532918;
            }

            public String toString() {
                return com.neeeex.eraser.m0.a("G8EtuGdddC8=\n", "XahD0RQ1EUs=\n");
            }
        }

        public static final class e implements b {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final e f65782a = new e();

            public boolean equals(Object obj) {
                return this == obj || (obj instanceof e);
            }

            public int hashCode() {
                return -1874625503;
            }

            public String toString() {
                return com.neeeex.eraser.m0.a("JRY6stljCaAaHRit1WYTrAI=\n", "dXNI37AQesk=\n");
            }
        }

        public static final class f implements b {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final long f65783a;

            public f(long j10) {
                this.f65783a = j10;
            }

            public final long a() {
                return this.f65783a;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof f) && this.f65783a == ((f) obj).f65783a;
            }

            public int hashCode() {
                return Long.hashCode(this.f65783a);
            }

            public String toString() {
                return "Running(startedAt=" + this.f65783a + ")";
            }
        }
    }

    public static final class c extends ll.m implements tl.n {
        final /* synthetic */ long $remaining;
        int label;
        final /* synthetic */ PhotoScanNEEEEXActivity this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(long j10, PhotoScanNEEEEXActivity photoScanNEEEEXActivity, kl.f<? super c> fVar) {
            super(2, fVar);
            this.$remaining = j10;
            this.this$0 = photoScanNEEEEXActivity;
        }

        @Override // ll.a
        public final kl.f<fl.m0> create(Object obj, kl.f<?> fVar) {
            return new c(this.$remaining, this.this$0, fVar);
        }

        @Override // tl.n
        public final Object invoke(kotlinx.coroutines.p0 p0Var, kl.f<? super fl.m0> fVar) {
            return ((c) create(p0Var, fVar)).invokeSuspend(fl.m0.f80959a);
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
                    gq.v0.a(com.neeeex.eraser.m0.a("iG6njXa+1SnMfa6SI6ffLsttroc5uN8pzGallzmh3y7LeKKVPurZZplgvpU/pN8=\n", "6w/L4VbKugk=\n"));
                    return null;
                }
                fl.v.b(obj);
            }
            com.neeeex.eraser.ads.e.b0().z0();
            this.this$0.T0();
            return fl.m0.f80959a;
        }
    }

    public static final class d extends ll.m implements tl.n {
        int label;

        public d(kl.f<? super d> fVar) {
            super(2, fVar);
        }

        public static fl.m0 b(PhotoScanNEEEEXActivity photoScanNEEEEXActivity, int i10) {
            ji.s sVar = photoScanNEEEEXActivity.binding;
            if (sVar == null) {
                p003kotlin.jvm.internal.v.n(com.neeeex.eraser.m0.a("2uQswJ+zvw==\n", "uI1CpPbd2B8=\n"));
                sVar = null;
            }
            sVar.f85670f.setProgress(i10);
            return fl.m0.f80959a;
        }

        public static fl.m0 f(PhotoScanNEEEEXActivity photoScanNEEEEXActivity) {
            photoScanNEEEEXActivity.Y0(true);
            return fl.m0.f80959a;
        }

        @Override // ll.a
        public final kl.f<fl.m0> create(Object obj, kl.f<?> fVar) {
            return PhotoScanNEEEEXActivity.this.new d(fVar);
        }

        @Override // tl.n
        public final Object invoke(kotlinx.coroutines.p0 p0Var, kl.f<? super fl.m0> fVar) {
            return ((d) create(p0Var, fVar)).invokeSuspend(fl.m0.f80959a);
        }

        @Override // ll.a
        public final Object invokeSuspend(Object obj) {
            d dVar;
            Object objF = p003kotlin.coroutines.intrinsics.c.f();
            int i10 = this.label;
            if (i10 == 0) {
                fl.v.b(obj);
                com.neeeex.eraser.base.p pVar = com.neeeex.eraser.base.p.f65036a;
                final PhotoScanNEEEEXActivity photoScanNEEEEXActivity = PhotoScanNEEEEXActivity.this;
                Function1 function1 = new Function1() { // from class: com.neeeex.eraser.recover.reco.p.v0
                    @Override // p003kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj2) {
                        return PhotoScanNEEEEXActivity.d.b(photoScanNEEEEXActivity, ((Integer) obj2).intValue());
                    }
                };
                this.label = 1;
                dVar = this;
                if (com.neeeex.eraser.base.p.b(pVar, 0, function1, dVar, 1, null) == objF) {
                    return objF;
                }
            } else {
                if (i10 != 1) {
                    gq.v0.a(com.neeeex.eraser.m0.a("3H+TDS8eMyiYbJoSegc5L598mgdgGDkomHeRF2ABOS+faZYVZ0o/Z81xihVmBDk=\n", "vx7/YQ9qXAg=\n"));
                    return null;
                }
                fl.v.b(obj);
                dVar = this;
            }
            if (PhotoScanNEEEEXActivity.this.scanState != b.e.f65782a) {
                return fl.m0.f80959a;
            }
            PhotoScanNEEEEXActivity.this.scanState = b.a.f65778a;
            final PhotoScanNEEEEXActivity photoScanNEEEEXActivity2 = PhotoScanNEEEEXActivity.this;
            photoScanNEEEEXActivity2.askPermission(new Function0() { // from class: com.neeeex.eraser.recover.reco.p.w0
                @Override // p003kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return PhotoScanNEEEEXActivity.d.f(photoScanNEEEEXActivity2);
                }
            });
            return fl.m0.f80959a;
        }
    }

    public static final class e extends AnimatorListenerAdapter {
        public e() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            com.neeeex.eraser.m0.a("o8996NPtpfCs\n", "wqEUhbKZzJ8=\n");
            animator.getClass();
            PhotoScanNEEEEXActivity.this.c1(this);
        }
    }

    public static void G0(PhotoScanNEEEEXActivity photoScanNEEEEXActivity, View view) {
        photoScanNEEEEXActivity.onBackPressed();
    }

    public static fl.m0 J0(PhotoScanNEEEEXActivity photoScanNEEEEXActivity, List list) {
        photoScanNEEEEXActivity.V0();
        return fl.m0.f80959a;
    }

    public static fl.m0 K0(PhotoScanNEEEEXActivity photoScanNEEEEXActivity) {
        photoScanNEEEEXActivity.Y0(true);
        return fl.m0.f80959a;
    }

    public static fl.m0 L0(PhotoScanNEEEEXActivity photoScanNEEEEXActivity, ii.c cVar) {
        ji.s sVar = photoScanNEEEEXActivity.binding;
        ji.s sVar2 = null;
        if (sVar == null) {
            p003kotlin.jvm.internal.v.n(com.neeeex.eraser.m0.a("ivnK6L+1cw==\n", "6JCkjNbbFDI=\n"));
            sVar = null;
        }
        sVar.f85671g.setText(cVar.e());
        ji.s sVar3 = photoScanNEEEEXActivity.binding;
        if (sVar3 == null) {
            p003kotlin.jvm.internal.v.n(com.neeeex.eraser.m0.a("nX5T85bHiA==\n", "/xc9l/+p75I=\n"));
            sVar3 = null;
        }
        if (sVar3.f85670f.getProgress() < 60) {
            ji.s sVar4 = photoScanNEEEEXActivity.binding;
            if (sVar4 == null) {
                p003kotlin.jvm.internal.v.n(com.neeeex.eraser.m0.a("E2y0mSAglA==\n", "cQXa/UlO83w=\n"));
            } else {
                sVar2 = sVar4;
            }
            ProgressBar progressBar = sVar2.f85670f;
            progressBar.setProgress(progressBar.getProgress() + 3);
        }
        return fl.m0.f80959a;
    }

    private final void S0() {
        b bVar = this.scanState;
        if (bVar == b.a.f65778a) {
            askPermission(new Function0() { // from class: com.neeeex.eraser.recover.reco.p.s0
                @Override // p003kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return PhotoScanNEEEEXActivity.K0(this.f65875a);
                }
            });
            return;
        }
        if (bVar != b.C0795b.f65779a) {
            return;
        }
        if (!checkStoragePermission(this)) {
            W0();
            mi.a.f88870a.T0();
        } else {
            com.neeeex.eraser.push.a.f65469a.o();
            com.neeeex.eraser.utils.b0.f66131a.C(com.neeeex.eraser.m0.a("A9Mj3IYW/GwI/A/Rgh3GeRjMCN28H/h9FdAI7Zca9Gw=\n", "cKN8suNzmQk=\n"), System.currentTimeMillis());
            X0();
            mi.a.f88870a.T0();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void T0() {
        b bVar = this.scanState;
        b.d dVar = b.d.f65781a;
        if (bVar == dVar) {
            return;
        }
        this.scanState = dVar;
        ji.s sVar = this.binding;
        if (sVar == null) {
            p003kotlin.jvm.internal.v.n(com.neeeex.eraser.m0.a("Rj8pVhGKTw==\n", "JFZHMnjkKPs=\n"));
            sVar = null;
        }
        sVar.f85669e.m();
        ji.s sVar2 = this.binding;
        if (sVar2 == null) {
            p003kotlin.jvm.internal.v.n(com.neeeex.eraser.m0.a("V1mbWDGKxg==\n", "NTD1PFjkoQQ=\n"));
            sVar2 = null;
        }
        sVar2.f85670f.setProgress(100);
        ji.s sVar3 = this.binding;
        if (sVar3 == null) {
            p003kotlin.jvm.internal.v.n(com.neeeex.eraser.m0.a("wBmeEHzLOA==\n", "onDwdBWlX2U=\n"));
            sVar3 = null;
        }
        sVar3.f85671g.setText("");
        ji.s sVar4 = this.binding;
        if (sVar4 == null) {
            p003kotlin.jvm.internal.v.n(com.neeeex.eraser.m0.a("ty9vv3B1Ew==\n", "1UYB2xkbdBQ=\n"));
            sVar4 = null;
        }
        sVar4.f85672h.setText(R$string.photo_neeeex_scan_end);
        mi.a.f88870a.R0();
        boolean zK = com.neeeex.eraser.module.report.bytedance.a.k();
        boolean z10 = zK && com.neeeex.eraser.ads.h.f64923a.g().c() > -0.1d;
        if (zK) {
            PhotoScanResultNEEEEXActivity.INSTANCE.a(this, z10);
            BaseAdActivity.showInter$default(this, com.neeeex.eraser.m0.a("fGtYQ2RC6C1rdUNPbk0=\n", "LjsHECcDpnI=\n"), null, 2, null);
        } else {
            PhotoScanResultNEEEEXActivity.INSTANCE.a(this, false);
        }
        finish();
    }

    private final void U0() {
        MutableLiveData mutableLiveDataB;
        MutableLiveData mutableLiveDataZ;
        ji.s sVar = this.binding;
        ji.s sVar2 = null;
        if (sVar == null) {
            p003kotlin.jvm.internal.v.n(com.neeeex.eraser.m0.a("TdHgBQ7hvg==\n", "L7iOYWeP2Qk=\n"));
            sVar = null;
        }
        sVar.f85670f.setVisibility(0);
        ji.s sVar3 = this.binding;
        if (sVar3 == null) {
            p003kotlin.jvm.internal.v.n(com.neeeex.eraser.m0.a("zZ6ebJyJTg==\n", "r/fwCPXnKVE=\n"));
        } else {
            sVar2 = sVar3;
        }
        sVar2.f85670f.setProgress(2);
        com.neeeex.eraser.h0 sharedViewModel = getSharedViewModel();
        if (sharedViewModel != null && (mutableLiveDataZ = sharedViewModel.z()) != null) {
            ti.h.g(mutableLiveDataZ, this, false, false, new Function1() { // from class: com.neeeex.eraser.recover.reco.p.t0
                @Override // p003kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return PhotoScanNEEEEXActivity.L0(this.f65877a, (ii.c) obj);
                }
            }, 4, null);
        }
        com.neeeex.eraser.h0 sharedViewModel2 = getSharedViewModel();
        if (sharedViewModel2 != null && (mutableLiveDataB = sharedViewModel2.B()) != null) {
            ti.h.g(mutableLiveDataB, this, false, false, new Function1() { // from class: com.neeeex.eraser.recover.reco.p.u0
                @Override // p003kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return PhotoScanNEEEEXActivity.J0(this.f65879a, (List) obj);
                }
            }, 4, null);
        }
        com.neeeex.eraser.h0 sharedViewModel3 = getSharedViewModel();
        if (sharedViewModel3 != null) {
            sharedViewModel3.L(this, 2);
        }
    }

    private final void V0() {
        b bVar = this.scanState;
        b.f fVar = bVar instanceof b.f ? (b.f) bVar : null;
        if (fVar == null) {
            return;
        }
        long jCurrentTimeMillis = 4000 - (System.currentTimeMillis() - fVar.a());
        this.scanState = new b.c(am.q.g(jCurrentTimeMillis, 0L));
        if (jCurrentTimeMillis <= 0) {
            T0();
        } else {
            kotlinx.coroutines.k.d(LifecycleOwnerKt.getLifecycleScope(this), null, null, new c(jCurrentTimeMillis, this, null), 3, null);
        }
    }

    private final void W0() {
        this.scanState = b.e.f65782a;
        ji.s sVar = this.binding;
        if (sVar == null) {
            p003kotlin.jvm.internal.v.n(com.neeeex.eraser.m0.a("SEWr+uzybQ==\n", "KizFnoWcCtY=\n"));
            sVar = null;
        }
        sVar.f85672h.setText(R$string.photo_neeeex_scanning);
        ji.s sVar2 = this.binding;
        if (sVar2 == null) {
            p003kotlin.jvm.internal.v.n(com.neeeex.eraser.m0.a("OwWYz+jCvg==\n", "WWz2q4Gs2SY=\n"));
            sVar2 = null;
        }
        sVar2.f85671g.setText(R$string.neeeex_permission_scan_preparing);
        ji.s sVar3 = this.binding;
        if (sVar3 == null) {
            p003kotlin.jvm.internal.v.n(com.neeeex.eraser.m0.a("k1B9bVRVig==\n", "8TkTCT077T4=\n"));
            sVar3 = null;
        }
        sVar3.f85670f.setVisibility(0);
        ji.s sVar4 = this.binding;
        if (sVar4 == null) {
            p003kotlin.jvm.internal.v.n(com.neeeex.eraser.m0.a("aCnsSkuPwg==\n", "CkCCLiLhpcs=\n"));
            sVar4 = null;
        }
        LottieAnimationView lottieAnimationView = sVar4.f85669e;
        lottieAnimationView.setMinFrame(0);
        lottieAnimationView.setRepeatCount(-1);
        lottieAnimationView.v();
        this.permissionPreviewJob = kotlinx.coroutines.k.d(LifecycleOwnerKt.getLifecycleScope(this), null, null, new d(null), 3, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void Y0(boolean stopSearch) {
        com.neeeex.eraser.h0 sharedViewModel;
        if (this.exitInProgress) {
            return;
        }
        this.exitInProgress = true;
        this.scanState = b.d.f65781a;
        Job job = this.permissionPreviewJob;
        ji.s sVar = null;
        if (job != null) {
            Job.a.a(job, null, 1, null);
        }
        ji.s sVar2 = this.binding;
        if (sVar2 == null) {
            p003kotlin.jvm.internal.v.n(com.neeeex.eraser.m0.a("0LYd/sKI6g==\n", "st9zmqvmjYw=\n"));
        } else {
            sVar = sVar2;
        }
        sVar.f85669e.m();
        if (stopSearch && (sharedViewModel = getSharedViewModel()) != null) {
            sharedViewModel.N();
        }
        zi.l.f104405a.b(this, com.neeeex.eraser.m0.a("GqhZmUVLfpsavVKfVERvjQY=\n", "SPgGygYKMMQ=\n"), zi.n.PHOTO_RECOVERY);
    }

    public static final void Z0(PhotoScanNEEEEXActivity photoScanNEEEEXActivity) {
        photoScanNEEEEXActivity.Y0(true);
    }

    public static final void b1(PhotoScanNEEEEXActivity photoScanNEEEEXActivity, View view) {
        photoScanNEEEEXActivity.S0();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void c1(Animator.AnimatorListener listener) {
        ji.s sVar = this.binding;
        if (sVar == null) {
            p003kotlin.jvm.internal.v.n(com.neeeex.eraser.m0.a("wpX4d/DsNA==\n", "oPyWE5mCU/w=\n"));
            sVar = null;
        }
        LottieAnimationView lottieAnimationView = sVar.f85669e;
        lottieAnimationView.w(listener);
        lottieAnimationView.setMinFrame(0);
        lottieAnimationView.setRepeatCount(-1);
        lottieAnimationView.v();
    }

    public final void X0() {
        this.scanState = new b.f(System.currentTimeMillis());
        ji.s sVar = this.binding;
        ji.s sVar2 = null;
        if (sVar == null) {
            p003kotlin.jvm.internal.v.n(com.neeeex.eraser.m0.a("eWutpB8r6w==\n", "GwLDwHZFjLk=\n"));
            sVar = null;
        }
        sVar.f85672h.setText(R$string.photo_neeeex_scanning);
        ji.s sVar3 = this.binding;
        if (sVar3 == null) {
            p003kotlin.jvm.internal.v.n(com.neeeex.eraser.m0.a("fsoO4zt5eA==\n", "HKNgh1IXH0c=\n"));
            sVar3 = null;
        }
        sVar3.f85669e.setVisibility(0);
        ji.s sVar4 = this.binding;
        if (sVar4 == null) {
            p003kotlin.jvm.internal.v.n(com.neeeex.eraser.m0.a("WEyE6GMBrw==\n", "OiXqjApvyOs=\n"));
            sVar4 = null;
        }
        sVar4.f85669e.m();
        ji.s sVar5 = this.binding;
        if (sVar5 == null) {
            p003kotlin.jvm.internal.v.n(com.neeeex.eraser.m0.a("+MYrHRzOEw==\n", "mq9FeXWgdGk=\n"));
            sVar5 = null;
        }
        sVar5.f85669e.setFrame(88);
        ji.s sVar6 = this.binding;
        if (sVar6 == null) {
            p003kotlin.jvm.internal.v.n(com.neeeex.eraser.m0.a("tunOwSw6cQ==\n", "1ICgpUVUFqo=\n"));
            sVar6 = null;
        }
        sVar6.f85669e.setMinFrame(88);
        ji.s sVar7 = this.binding;
        if (sVar7 == null) {
            p003kotlin.jvm.internal.v.n(com.neeeex.eraser.m0.a("YmE+27YvAw==\n", "AAhQv99BZCo=\n"));
            sVar7 = null;
        }
        sVar7.f85669e.setRepeatCount(0);
        ji.s sVar8 = this.binding;
        if (sVar8 == null) {
            p003kotlin.jvm.internal.v.n(com.neeeex.eraser.m0.a("NA4h1beh9w==\n", "VmdPsd7PkD0=\n"));
            sVar8 = null;
        }
        sVar8.f85669e.v();
        e eVar = new e();
        ji.s sVar9 = this.binding;
        if (sVar9 == null) {
            p003kotlin.jvm.internal.v.n(com.neeeex.eraser.m0.a("GTn1joxH8Q==\n", "e1Cb6uUplnw=\n"));
        } else {
            sVar2 = sVar9;
        }
        sVar2.f85669e.i(eVar);
        U0();
        mi.a.f88870a.S0();
    }

    public final void a1() {
        ji.s sVar = this.binding;
        ji.s sVar2 = null;
        if (sVar == null) {
            p003kotlin.jvm.internal.v.n(com.neeeex.eraser.m0.a("DRIy0nUl4A==\n", "b3tcthxLh3g=\n"));
            sVar = null;
        }
        sVar.f85667c.setOnClickListener(new View.OnClickListener() { // from class: com.neeeex.eraser.recover.reco.p.q0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                PhotoScanNEEEEXActivity.G0(this.f65871a, view);
            }
        });
        ji.s sVar3 = this.binding;
        if (sVar3 == null) {
            p003kotlin.jvm.internal.v.n(com.neeeex.eraser.m0.a("1PJFlM9feg==\n", "tpsr8KYxHXI=\n"));
            sVar3 = null;
        }
        LinearLayout linearLayout = sVar3.f85668d;
        com.neeeex.eraser.m0.a("bqDf/Txz45ZPrfj2GnnommOl//0r\n", "AsyRmFkWhu4=\n");
        linearLayout.getClass();
        ji.s sVar4 = this.binding;
        if (sVar4 == null) {
            p003kotlin.jvm.internal.v.n(com.neeeex.eraser.m0.a("ympCucG1Kg==\n", "qAMs3ajbTUw=\n"));
            sVar4 = null;
        }
        LottieAnimationView lottieAnimationView = sVar4.f85669e;
        com.neeeex.eraser.m0.a("KhW/9pVQ1dsWCZ7nn2bTwig=\n", "RmHxk/A1sKM=\n");
        lottieAnimationView.getClass();
        ji.s sVar5 = this.binding;
        if (sVar5 == null) {
            p003kotlin.jvm.internal.v.n(com.neeeex.eraser.m0.a("rdbp9A4Wwg==\n", "z7+HkGd4pUY=\n"));
            sVar5 = null;
        }
        AppCompatTextView appCompatTextView = sVar5.f85672h;
        com.neeeex.eraser.m0.a("c9GNcVQ1z25U06JgVA==\n", "B6fDFDFQqhY=\n");
        appCompatTextView.getClass();
        Iterator it = gl.w.p(linearLayout, lottieAnimationView, appCompatTextView).iterator();
        while (it.hasNext()) {
            ((View) it.next()).setOnClickListener(new View.OnClickListener() { // from class: com.neeeex.eraser.recover.reco.p.r0
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    PhotoScanNEEEEXActivity.b1(this.f65873a, view);
                }
            });
        }
        ji.s sVar6 = this.binding;
        if (sVar6 == null) {
            p003kotlin.jvm.internal.v.n(com.neeeex.eraser.m0.a("BlfjySjIOA==\n", "ZD6NrUGmX1s=\n"));
            sVar6 = null;
        }
        sVar6.f85669e.setFrame(88);
        ji.s sVar7 = this.binding;
        if (sVar7 == null) {
            p003kotlin.jvm.internal.v.n(com.neeeex.eraser.m0.a("RekW5viveQ==\n", "J4B4gpHBHlE=\n"));
            sVar7 = null;
        }
        sVar7.f85669e.setMinFrame(88);
        ji.s sVar8 = this.binding;
        if (sVar8 == null) {
            p003kotlin.jvm.internal.v.n(com.neeeex.eraser.m0.a("GKb/ZsRYtw==\n", "es+RAq020LY=\n"));
        } else {
            sVar2 = sVar8;
        }
        sVar2.f85670f.setVisibility(8);
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        if (this.scanState == b.d.f65781a) {
            Y0(false);
            return;
        }
        ExitScanDialog exitScanDialogB = ExitScanDialog.Companion.b(ExitScanDialog.INSTANCE, 0, 1, null);
        exitScanDialogB.p(new ki.a() { // from class: com.neeeex.eraser.recover.reco.p.p0
            @Override // ki.a
            public final void a() {
                PhotoScanNEEEEXActivity.Z0(this.f65869a);
            }
        });
        androidx.fragment.app.l0 supportFragmentManager = getSupportFragmentManager();
        com.neeeex.eraser.m0.a("qJSNrHxa/2G9hb+NaE3ia6GFtJ5nS+hrvdnX0ScD\n", "z/H5/wkqjw4=\n");
        supportFragmentManager.getClass();
        exitScanDialogB.i(supportFragmentManager);
    }

    @Override // com.neeeex.eraser.base.RootActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ji.s sVarC = ji.s.c(getLayoutInflater());
        com.neeeex.eraser.m0.a("5ucP40hLfWqhp0em\n", "j4lpjyk/GEI=\n");
        sVarC.getClass();
        this.binding = sVarC;
        ji.s sVar = null;
        if (sVarC == null) {
            p003kotlin.jvm.internal.v.n(com.neeeex.eraser.m0.a("UrXvVUgHZA==\n", "MNyBMSFpA0o=\n"));
            sVarC = null;
        }
        setContentView(sVarC.getRoot());
        a1();
        if (com.neeeex.eraser.module.report.bytedance.a.k()) {
            ji.s sVar2 = this.binding;
            if (sVar2 == null) {
                p003kotlin.jvm.internal.v.n(com.neeeex.eraser.m0.a("UAWCBa1fog==\n", "MmzsYcQxxa4=\n"));
            } else {
                sVar = sVar2;
            }
            FrameLayout frameLayout = sVar.f85666b;
            com.neeeex.eraser.m0.a("QOe8r2EwYcBH4pOuUA==\n", "Jov9yyJfD7Q=\n");
            frameLayout.getClass();
            BaseAdActivity.showRenderAdAndRefresh$default(this, frameLayout, R$layout.ad_neeeex_native_white, com.neeeex.eraser.m0.a("r8Xz4C8GV6qz1Pj6OgI=\n", "/ZWss2xHGfU=\n"), null, 8, null);
        }
        mi.a.f88870a.U0();
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
        b bVar = this.scanState;
        if (bVar == b.e.f65782a || bVar == b.a.f65778a) {
            this.scanState = b.C0795b.f65779a;
        }
        S0();
    }

    /* JADX INFO: renamed from: com.neeeex.eraser.recover.reco.p.PhotoScanNEEEEXActivity$a, reason: from kotlin metadata */
    public static final class Companion {
        public /* synthetic */ Companion(p003kotlin.jvm.internal.m mVar) {
            this();
        }

        public final void a(Context context) {
            com.neeeex.eraser.m0.a("JDKPbP5PqQ==\n", "R13hGJs33eY=\n");
            context.getClass();
            context.startActivity(new Intent(context, (Class<?>) PhotoScanNEEEEXActivity.class));
        }

        public Companion() {
        }
    }
}