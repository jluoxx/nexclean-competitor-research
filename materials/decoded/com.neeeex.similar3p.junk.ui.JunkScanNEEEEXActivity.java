package com.neeeex.similar3p.junk.ui;

import android.content.Intent;
import android.os.Bundle;
import android.os.Environment;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.l0;
import androidx.p002lifecycle.LifecycleOwnerKt;
import androidx.recyclerview.widget.LinearLayoutManager;
import b.o0;
import com.mbridge.msdk.foundation.download.core.DownloadCommon;
import com.neeeex.eraser.R$layout;
import com.neeeex.eraser.R$string;
import com.neeeex.eraser.base.BaseAdActivity;
import com.neeeex.eraser.base.BaseStoragePermActivity;
import com.neeeex.eraser.m0;
import com.neeeex.eraser.module.dialog.ExitScanDialog;
import gl.b1;
import gl.c1;
import java.io.File;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.CancellationException;
import ji.h1;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.f1;
import kotlinx.coroutines.l2;
import kotlinx.coroutines.p0;
import kotlinx.coroutines.q0;
import p003kotlin.Metadata;
import p003kotlin.jvm.functions.Function0;
import p003kotlin.jvm.functions.Function1;
import p003kotlin.jvm.internal.v0;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u0000 =2\u00020\u0001:\u0005$*>.?B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0005\u0010\u0003J\u000f\u0010\u0006\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0006\u0010\u0003J\u000f\u0010\u0007\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\u0003J\u000f\u0010\b\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\b\u0010\u0003J\u0019\u0010\u000b\u001a\u00020\u00042\b\u0010\n\u001a\u0004\u0018\u00010\tH\u0014¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\r\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\r\u0010\u0003J\u000f\u0010\u000e\u001a\u00020\u0004H\u0014¢\u0006\u0004\b\u000e\u0010\u0003J\u000f\u0010\u0010\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0012\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0012\u0010\u0003J\u001d\u0010\u0017\u001a\u00020\u00162\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00140\u0013H\u0002¢\u0006\u0004\b\u0017\u0010\u0018J\u0017\u0010\u001b\u001a\u00020\u00042\u0006\u0010\u001a\u001a\u00020\u0019H\u0002¢\u0006\u0004\b\u001b\u0010\u001cJ\u0017\u0010\u001f\u001a\u00020\u00042\u0006\u0010\u001e\u001a\u00020\u001dH\u0002¢\u0006\u0004\b\u001f\u0010 J\u000f\u0010!\u001a\u00020\u0004H\u0002¢\u0006\u0004\b!\u0010\u0003J\u000f\u0010\"\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\"\u0010\u0003R\u001b\u0010(\u001a\u00020#8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b$\u0010%\u001a\u0004\b&\u0010'R\u0014\u0010,\u001a\u00020)8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b*\u0010+R\u0018\u00100\u001a\u0004\u0018\u00010-8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b.\u0010/R\u0018\u00102\u001a\u0004\u0018\u00010-8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b1\u0010/R\u0016\u00106\u001a\u0002038\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b4\u00105R\u0016\u0010:\u001a\u0002078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b8\u00109R\u0016\u0010<\u001a\u0002038\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b;\u00105¨\u0006@"}, d2 = {"Lcom/neeeex/similar3p/junk/ui/JunkScanNEEEEXActivity;", "Lcom/neeeex/eraser/base/BaseStoragePermActivity;", "<init>", "()V", "Lfl/m0;", "U0", "S0", "f1", "c1", "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "(Landroid/os/Bundle;)V", "onStoragePermission", "onDestroy", "Lcom/neeeex/similar3p/junk/a0;", "Y0", "()Lcom/neeeex/similar3p/junk/a0;", "T0", "", "Lcom/neeeex/similar3p/junk/a;", "newlyCompleted", "", "X0", "(Ljava/util/Set;)J", "Lcom/neeeex/similar3p/junk/d0;", "result", "W0", "(Lcom/neeeex/similar3p/junk/d0;)V", "Lcom/neeeex/similar3p/junk/f0;", "snapshot", "e1", "(Lcom/neeeex/similar3p/junk/f0;)V", "a1", "V0", "Lji/h1;", "c", "Lfl/n;", "Z0", "()Lji/h1;", "binding", "Lcom/neeeex/similar3p/junk/ui/x;", "d", "Lcom/neeeex/similar3p/junk/ui/x;", "categoryAdapter", "Lkotlinx/coroutines/Job;", "e", "Lkotlinx/coroutines/Job;", "scanJob", "f", "permissionPreviewJob", "", "g", "Z", "finished", "Lcom/neeeex/similar3p/junk/ui/JunkScanNEEEEXActivity$e;", "h", "Lcom/neeeex/similar3p/junk/ui/JunkScanNEEEEXActivity$e;", "scanPhase", "i", "exitInProgress", "j", DownloadCommon.DOWNLOAD_REPORT_FIND_FILE_RESULT_VALUE_B, "a", "tool-feature_productionRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class JunkScanNEEEEXActivity extends BaseStoragePermActivity {

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    public Job scanJob;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    public Job permissionPreviewJob;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    public boolean finished;

    /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata */
    public boolean exitInProgress;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    public final fl.n binding = fl.o.b(new Function0() { // from class: com.neeeex.similar3p.junk.ui.y
        @Override // p003kotlin.jvm.functions.Function0
        public final Object invoke() {
            return JunkScanNEEEEXActivity.G0(this.f66507a);
        }
    });

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    public final x categoryAdapter = new x(f0.f66438a.a());

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    public e scanPhase = e.READY;

    public enum b {
        CLOSE_NOW,
        REQUEST_CONFIRMATION;


        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ ml.a f66420b = ml.b.a(d());

        public static ml.a getEntries() {
            return f66420b;
        }
    }

    public static final class d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final c f66422a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Set f66423b;

        public d(c cVar, Set set) {
            "next" /* decoded XOR */;
            cVar.getClass();
            "newlyCompleted" /* decoded XOR */;
            set.getClass();
            this.f66422a = cVar;
            this.f66423b = set;
        }

        public final Set a() {
            return this.f66423b;
        }

        public final c b() {
            return this.f66422a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof d)) {
                return false;
            }
            d dVar = (d) obj;
            return p003kotlin.jvm.internal.v.c(this.f66422a, dVar.f66422a) && p003kotlin.jvm.internal.v.c(this.f66423b, dVar.f66423b);
        }

        public int hashCode() {
            return (this.f66422a.hashCode() * 31) + this.f66423b.hashCode();
        }

        public String toString() {
            return "ProgressTransition(next=" + this.f66422a + ", newlyCompleted=" + this.f66423b + ")";
        }
    }

    public enum e {
        READY,
        PERMISSION_PREVIEW,
        AWAITING_PERMISSION,
        SCANNING,
        FINISHED;


        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ ml.a f66425b = ml.b.a(d());

        public static ml.a getEntries() {
            return f66425b;
        }
    }

    public static final /* synthetic */ class f {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f66426a;

        static {
            int[] iArr = new int[b.values().length];
            try {
                iArr[b.CLOSE_NOW.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[b.REQUEST_CONFIRMATION.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f66426a = iArr;
        }
    }

    public static final class h extends ll.m implements tl.n {
        private /* synthetic */ Object L$0;
        Object L$1;
        int label;

        public static final class a extends ll.m implements tl.n {
            final /* synthetic */ v0 $progressState;
            long J$0;
            /* synthetic */ Object L$0;
            Object L$1;
            Object L$2;
            int label;
            final /* synthetic */ JunkScanNEEEEXActivity this$0;

            /* JADX INFO: renamed from: com.neeeex.similar3p.junk.ui.JunkScanNEEEEXActivity$h$a$a, reason: collision with other inner class name */
            public static final class C0813a extends ll.m implements tl.n {
                final /* synthetic */ com.neeeex.similar3p.junk.f0 $snapshot;
                int label;
                final /* synthetic */ JunkScanNEEEEXActivity this$0;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public C0813a(JunkScanNEEEEXActivity junkScanNEEEEXActivity, com.neeeex.similar3p.junk.f0 f0Var, kl.f<? super C0813a> fVar) {
                    super(2, fVar);
                    this.this$0 = junkScanNEEEEXActivity;
                    this.$snapshot = f0Var;
                }

                @Override // ll.a
                public final kl.f<fl.m0> create(Object obj, kl.f<?> fVar) {
                    return new C0813a(this.this$0, this.$snapshot, fVar);
                }

                @Override // tl.n
                public final Object invoke(p0 p0Var, kl.f<? super fl.m0> fVar) {
                    return ((C0813a) create(p0Var, fVar)).invokeSuspend(fl.m0.f80959a);
                }

                @Override // ll.a
                public final Object invokeSuspend(Object obj) {
                    p003kotlin.coroutines.intrinsics.c.f();
                    if (this.label != 0) {
                        gq.v0.a("call to 'resume' before 'invoke' with coroutine" /* decoded XOR */);
                        return null;
                    }
                    fl.v.b(obj);
                    this.this$0.e1(this.$snapshot);
                    return fl.m0.f80959a;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(v0 v0Var, JunkScanNEEEEXActivity junkScanNEEEEXActivity, kl.f<? super a> fVar) {
                super(2, fVar);
                this.$progressState = v0Var;
                this.this$0 = junkScanNEEEEXActivity;
            }

            @Override // ll.a
            public final kl.f<fl.m0> create(Object obj, kl.f<?> fVar) {
                a aVar = new a(this.$progressState, this.this$0, fVar);
                aVar.L$0 = obj;
                return aVar;
            }

            @Override // tl.n
            public final Object invoke(com.neeeex.similar3p.junk.f0 f0Var, kl.f<? super fl.m0> fVar) {
                return ((a) create(f0Var, fVar)).invokeSuspend(fl.m0.f80959a);
            }

            /* JADX WARN: Code restructure failed: missing block: B:17:0x009b, code lost:
            
                if (kotlinx.coroutines.z0.b(r5, r9) == r1) goto L18;
             */
            @Override // ll.a
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final Object invokeSuspend(Object obj) {
                Set setA;
                d dVar;
                com.neeeex.similar3p.junk.f0 f0Var = (com.neeeex.similar3p.junk.f0) this.L$0;
                Object objF = p003kotlin.coroutines.intrinsics.c.f();
                int i10 = this.label;
                if (i10 != 0) {
                    if (i10 == 1) {
                        setA = (Set) this.L$2;
                        dVar = (d) this.L$1;
                        fl.v.b(obj);
                    } else {
                        if (i10 != 2) {
                            gq.v0.a("call to 'resume' before 'invoke' with coroutine" /* decoded XOR */);
                            return null;
                        }
                        fl.v.b(obj);
                    }
                    return fl.m0.f80959a;
                }
                fl.v.b(obj);
                d dVarA = ((c) this.$progressState.element).a(f0Var);
                setA = dVarA.a();
                l2 l2VarP0 = f1.c().P0();
                C0813a c0813a = new C0813a(this.this$0, f0Var, null);
                this.L$0 = ll.l.a(f0Var);
                this.L$1 = dVarA;
                this.L$2 = setA;
                this.label = 1;
                if (kotlinx.coroutines.i.g(l2VarP0, c0813a, this) != objF) {
                    dVar = dVarA;
                }
                return objF;
                this.$progressState.element = dVar.b();
                long jX0 = this.this$0.X0(setA);
                if (jX0 > 0) {
                    this.L$0 = ll.l.a(f0Var);
                    this.L$1 = ll.l.a(dVar);
                    this.L$2 = ll.l.a(setA);
                    this.J$0 = jX0;
                    this.label = 2;
                }
                return fl.m0.f80959a;
            }
        }

        public h(kl.f<? super h> fVar) {
            super(2, fVar);
        }

        @Override // ll.a
        public final kl.f<fl.m0> create(Object obj, kl.f<?> fVar) {
            h hVar = JunkScanNEEEEXActivity.this.new h(fVar);
            hVar.L$0 = obj;
            return hVar;
        }

        @Override // tl.n
        public final Object invoke(p0 p0Var, kl.f<? super fl.m0> fVar) {
            return ((h) create(p0Var, fVar)).invokeSuspend(fl.m0.f80959a);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // ll.a
        public final Object invokeSuspend(Object obj) {
            com.neeeex.similar3p.junk.d0 d0Var;
            p0 p0Var = (p0) this.L$0;
            Object objF = p003kotlin.coroutines.intrinsics.c.f();
            int i10 = this.label;
            int i11 = 1;
            try {
                if (i10 == 0) {
                    fl.v.b(obj);
                    v0 v0Var = new v0();
                    v0Var.element = new c(null, i11, 0 == true ? 1 : 0);
                    com.neeeex.similar3p.junk.a0 a0VarY0 = JunkScanNEEEEXActivity.this.Y0();
                    a aVar = new a(v0Var, JunkScanNEEEEXActivity.this, null);
                    this.L$0 = p0Var;
                    this.L$1 = ll.l.a(v0Var);
                    this.label = 1;
                    obj = a0VarY0.o(aVar, this);
                    if (obj == objF) {
                        return objF;
                    }
                } else {
                    if (i10 != 1) {
                        gq.v0.a("call to 'resume' before 'invoke' with coroutine" /* decoded XOR */);
                        return null;
                    }
                    fl.v.b(obj);
                }
                d0Var = (com.neeeex.similar3p.junk.d0) obj;
            } catch (CancellationException e10) {
                throw e10;
            } catch (Throwable unused) {
                d0Var = new com.neeeex.similar3p.junk.d0(gl.w.m());
            }
            if (!q0.g(p0Var) || JunkScanNEEEEXActivity.this.isFinishing() || JunkScanNEEEEXActivity.this.isDestroyed()) {
                return fl.m0.f80959a;
            }
            JunkScanNEEEEXActivity.this.W0(d0Var);
            return fl.m0.f80959a;
        }
    }

    public static h1 G0(JunkScanNEEEEXActivity junkScanNEEEEXActivity) {
        return h1.c(junkScanNEEEEXActivity.getLayoutInflater());
    }

    public static fl.m0 I0(JunkScanNEEEEXActivity junkScanNEEEEXActivity, b.k0 k0Var) {
        "$this$addCallback" /* decoded XOR */;
        k0Var.getClass();
        junkScanNEEEEXActivity.c1();
        return fl.m0.f80959a;
    }

    public static void K0(JunkScanNEEEEXActivity junkScanNEEEEXActivity, View view) {
        junkScanNEEEEXActivity.c1();
    }

    private final void S0() {
        if (this.scanPhase != e.READY) {
            return;
        }
        this.scanPhase = e.PERMISSION_PREVIEW;
        com.neeeex.similar3p.junk.e0.f66328a.a();
        Z0().f85480k.setText(R$string.neeeex_junk_zero_size);
        Z0().f85475f.setText(R$string.neeeex_permission_scan_preparing);
        this.permissionPreviewJob = kotlinx.coroutines.k.d(LifecycleOwnerKt.getLifecycleScope(this), null, null, new g(null), 3, null);
    }

    private final void U0() {
        if (checkStoragePermission(this)) {
            T0();
        } else {
            S0();
        }
    }

    public static final void b1(JunkScanNEEEEXActivity junkScanNEEEEXActivity, View view) {
        junkScanNEEEEXActivity.f1();
    }

    private final void c1() {
        int i10 = f.f66426a[(this.finished ? b.CLOSE_NOW : b.REQUEST_CONFIRMATION).ordinal()];
        if (i10 == 1) {
            V0();
            return;
        }
        if (i10 != 2) {
            coil.util.j.a();
            return;
        }
        ExitScanDialog exitScanDialogB = ExitScanDialog.Companion.b(ExitScanDialog.INSTANCE, 0, 1, null);
        exitScanDialogB.p(new ki.a() { // from class: com.neeeex.similar3p.junk.ui.c0
            @Override // ki.a
            public final void a() {
                JunkScanNEEEEXActivity.d1(this.f66432a);
            }
        });
        l0 supportFragmentManager = getSupportFragmentManager();
        "getSupportFragmentManager(...)" /* decoded XOR */;
        supportFragmentManager.getClass();
        exitScanDialogB.i(supportFragmentManager);
    }

    public static final void d1(JunkScanNEEEEXActivity junkScanNEEEEXActivity) {
        junkScanNEEEEXActivity.V0();
    }

    private final void f1() {
        if (this.scanPhase == e.AWAITING_PERMISSION) {
            askPermission(new i(this));
        }
    }

    public final void T0() {
        if (this.scanPhase != e.READY) {
            return;
        }
        this.scanPhase = e.SCANNING;
        com.neeeex.similar3p.junk.e0.f66328a.a();
        this.scanJob = kotlinx.coroutines.k.d(LifecycleOwnerKt.getLifecycleScope(this), null, null, new h(null), 3, null);
    }

    public final void V0() {
        if (this.exitInProgress) {
            return;
        }
        this.exitInProgress = true;
        this.scanPhase = e.FINISHED;
        Job job = this.permissionPreviewJob;
        if (job != null) {
            Job.a.a(job, null, 1, null);
        }
        Job job2 = this.scanJob;
        if (job2 != null) {
            Job.a.a(job2, null, 1, null);
        }
        zi.l.f104405a.b(this, "neeeex_pdf_clean_scan_exit_fs" /* decoded XOR */, zi.n.JUNK_CLEANER);
    }

    public final void W0(com.neeeex.similar3p.junk.d0 result) {
        this.categoryAdapter.m(result.d(), gl.g0.k1(com.neeeex.similar3p.junk.c0.f66319a.a()));
        com.neeeex.similar3p.junk.e0.f66328a.f(result);
        com.neeeex.eraser.ads.e.b0().z0();
        this.scanPhase = e.FINISHED;
        this.finished = true;
        startActivity(new Intent(this, (Class<?>) JunkResultNEEEEXActivity.class));
        if (com.neeeex.eraser.module.report.bytedance.a.k()) {
            BaseAdActivity.showInter$default(this, "neeeex_pdf_clean_scan_end_fs" /* decoded XOR */, null, 2, null);
        }
        finish();
    }

    public final long X0(Set newlyCompleted) {
        if (newlyCompleted.contains(com.neeeex.similar3p.junk.a.TEMP)) {
            return 500L;
        }
        return !newlyCompleted.isEmpty() ? 200L : 0L;
    }

    public final com.neeeex.similar3p.junk.a0 Y0() {
        File externalStorageDirectory = Environment.getExternalStorageDirectory();
        "getExternalStorageDirectory(...)" /* decoded XOR */;
        externalStorageDirectory.getClass();
        return new com.neeeex.similar3p.junk.a0(externalStorageDirectory, gl.w.r(getCacheDir(), getExternalCacheDir()), null, null, null, null, 0L, null, 252, null);
    }

    public final h1 Z0() {
        return (h1) this.binding.getValue();
    }

    public final void a1() {
        if (!com.neeeex.eraser.module.report.bytedance.a.k()) {
            Z0().f85476g.setVisibility(8);
            return;
        }
        FrameLayout frameLayout = Z0().f85476g;
        "neeeexJunkScanAd" /* decoded XOR */;
        frameLayout.getClass();
        BaseAdActivity.showRenderAdAndRefresh$default(this, frameLayout, R$layout.ad_neeeex_native, "neeeex_pdf_clean_scan" /* decoded XOR */, null, 8, null);
    }

    public final void e1(com.neeeex.similar3p.junk.f0 snapshot) {
        if (isFinishing() || isDestroyed()) {
            return;
        }
        Z0().f85480k.setText(e0.a(snapshot.c()));
        TextView textView = Z0().f85475f;
        String strB = snapshot.b();
        if (strB.length() == 0) {
            strB = getString(R$string.neeeex_scan_completed);
            "getString(...)" /* decoded XOR */;
            strB.getClass();
        }
        textView.setText(strB);
        this.categoryAdapter.m(snapshot.d(), snapshot.a());
    }

    @Override // com.neeeex.eraser.base.RootActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        b.w.b(this, null, null, 3, null);
        setContentView(Z0().getRoot());
        ConstraintLayout constraintLayoutB = Z0().getRoot();
        "getRoot(...)" /* decoded XOR */;
        constraintLayoutB.getClass();
        ConstraintLayout constraintLayout = Z0().f85479j;
        "neeeexJunkToolbar" /* decoded XOR */;
        constraintLayout.getClass();
        h0.b(constraintLayoutB, constraintLayout, Z0().f85476g, Z0().f85472c);
        Z0().f85472c.setLayoutManager(new LinearLayoutManager(this));
        Z0().f85472c.setAdapter(this.categoryAdapter);
        Z0().f85471b.setOnClickListener(new View.OnClickListener() { // from class: com.neeeex.similar3p.junk.ui.z
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                JunkScanNEEEEXActivity.K0(this.f66508a, view);
            }
        });
        ImageView imageView = Z0().f85474e;
        "neeeexJunkHero" /* decoded XOR */;
        imageView.getClass();
        TextView textView = Z0().f85480k;
        "neeeexJunkTotal" /* decoded XOR */;
        textView.getClass();
        TextView textView2 = Z0().f85475f;
        "neeeexJunkPath" /* decoded XOR */;
        textView2.getClass();
        Iterator it = gl.w.p(imageView, textView, textView2).iterator();
        while (it.hasNext()) {
            ((View) it.next()).setOnClickListener(new View.OnClickListener() { // from class: com.neeeex.similar3p.junk.ui.a0
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    JunkScanNEEEEXActivity.b1(this.f66428a, view);
                }
            });
        }
        o0.b(getOnBackPressedDispatcher(), this, false, new Function1() { // from class: com.neeeex.similar3p.junk.ui.b0
            @Override // p003kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return JunkScanNEEEEXActivity.I0(this.f66430a, (b.k0) obj);
            }
        }, 2, null);
        a1();
        U0();
    }

    @Override // com.neeeex.eraser.base.BaseStoragePermActivity, com.neeeex.eraser.base.BaseAdActivity, com.neeeex.eraser.base.RootActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        Job job = this.permissionPreviewJob;
        if (job != null) {
            Job.a.a(job, null, 1, null);
        }
        Job job2 = this.scanJob;
        if (job2 != null) {
            Job.a.a(job2, null, 1, null);
        }
        super.onDestroy();
    }

    @Override // com.neeeex.eraser.base.BaseStoragePermActivity
    public void onStoragePermission() {
        e eVar = this.scanPhase;
        if (eVar == e.PERMISSION_PREVIEW || eVar == e.AWAITING_PERMISSION) {
            Job job = this.permissionPreviewJob;
            if (job != null) {
                Job.a.a(job, null, 1, null);
            }
            this.scanPhase = e.READY;
            T0();
        }
    }

    public static final class g extends ll.m implements tl.n {
        int label;

        public g(kl.f<? super g> fVar) {
            super(2, fVar);
        }

        public static fl.m0 b(int i10) {
            return fl.m0.f80959a;
        }

        @Override // ll.a
        public final kl.f<fl.m0> create(Object obj, kl.f<?> fVar) {
            return JunkScanNEEEEXActivity.this.new g(fVar);
        }

        @Override // tl.n
        public final Object invoke(p0 p0Var, kl.f<? super fl.m0> fVar) {
            return ((g) create(p0Var, fVar)).invokeSuspend(fl.m0.f80959a);
        }

        @Override // ll.a
        public final Object invokeSuspend(Object obj) {
            g gVar;
            Object objF = p003kotlin.coroutines.intrinsics.c.f();
            int i10 = this.label;
            if (i10 == 0) {
                fl.v.b(obj);
                com.neeeex.eraser.base.p pVar = com.neeeex.eraser.base.p.f65036a;
                Function1 function1 = new Function1() { // from class: com.neeeex.similar3p.junk.ui.d0
                    @Override // p003kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj2) {
                        return JunkScanNEEEEXActivity.g.b(((Integer) obj2).intValue());
                    }
                };
                this.label = 1;
                gVar = this;
                if (com.neeeex.eraser.base.p.b(pVar, 0, function1, gVar, 1, null) == objF) {
                    return objF;
                }
            } else {
                if (i10 != 1) {
                    gq.v0.a("call to 'resume' before 'invoke' with coroutine" /* decoded XOR */);
                    return null;
                }
                fl.v.b(obj);
                gVar = this;
            }
            if (JunkScanNEEEEXActivity.this.scanPhase != e.PERMISSION_PREVIEW) {
                return fl.m0.f80959a;
            }
            JunkScanNEEEEXActivity.this.scanPhase = e.AWAITING_PERMISSION;
            JunkScanNEEEEXActivity.this.askPermission(new a(JunkScanNEEEEXActivity.this));
            return fl.m0.f80959a;
        }

        public static final /* synthetic */ class a extends p003kotlin.jvm.internal.s implements Function0 {
            public a(Object obj) {
                super(0, obj, JunkScanNEEEEXActivity.class, "closeFromScan" /* decoded XOR */, "closeFromScan()V" /* decoded XOR */, 0);
            }

            /* JADX INFO: renamed from: invoke, reason: collision with other method in class */
            public final void m190invoke() {
                ((JunkScanNEEEEXActivity) this.receiver).V0();
            }

            @Override // p003kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ Object invoke() {
                m190invoke();
                return fl.m0.f80959a;
            }
        }
    }

    public static final /* synthetic */ class i extends p003kotlin.jvm.internal.s implements Function0 {
        public i(Object obj) {
            super(0, obj, JunkScanNEEEEXActivity.class, "closeFromScan" /* decoded XOR */, "closeFromScan()V" /* decoded XOR */, 0);
        }

        /* JADX INFO: renamed from: invoke, reason: collision with other method in class */
        public final void m191invoke() {
            ((JunkScanNEEEEXActivity) this.receiver).V0();
        }

        @Override // p003kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Object invoke() {
            m191invoke();
            return fl.m0.f80959a;
        }
    }

    public static final class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Set f66421a;

        public c(Set set) {
            "completed" /* decoded XOR */;
            set.getClass();
            this.f66421a = set;
        }

        public final d a(com.neeeex.similar3p.junk.f0 f0Var) {
            "snapshot" /* decoded XOR */;
            f0Var.getClass();
            return new d(new c(f0Var.a()), c1.l(f0Var.a(), this.f66421a));
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof c) && p003kotlin.jvm.internal.v.c(this.f66421a, ((c) obj).f66421a);
        }

        public int hashCode() {
            return this.f66421a.hashCode();
        }

        public String toString() {
            return "ProgressState(completed=" + this.f66421a + ")";
        }

        public /* synthetic */ c(Set set, int i10, p003kotlin.jvm.internal.m mVar) {
            this((i10 & 1) != 0 ? b1.f() : set);
        }
    }
}