package com.neeeex.similar3p.junk.ui;

import android.content.Intent;
import android.os.Bundle;
import android.os.Environment;
import android.os.SystemClock;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.l0;
import androidx.p002lifecycle.LifecycleOwnerKt;
import b.o0;
import com.mbridge.msdk.foundation.download.core.DownloadCommon;
import com.neeeex.eraser.R$string;
import com.neeeex.eraser.base.BaseAdActivity;
import com.neeeex.eraser.m0;
import com.neeeex.eraser.module.dialog.ExitScanDialog;
import gq.v0;
import java.io.File;
import java.util.List;
import java.util.concurrent.CancellationException;
import ji.e1;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.p0;
import kotlinx.coroutines.z0;
import p003kotlin.Metadata;
import p003kotlin.jvm.functions.Function0;
import p003kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u0000 02\u00020\u0001:\u000312!B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0005\u0010\u0003J\u0019\u0010\b\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0014¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\n\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\n\u0010\u0003J\u000f\u0010\u000b\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u000b\u0010\u0003J\u0010\u0010\f\u001a\u00020\u0004H\u0082@¢\u0006\u0004\b\f\u0010\rJ\u0013\u0010\u0010\u001a\u00020\u000f*\u00020\u000eH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u001e\u0010\u0015\u001a\u00020\u000f2\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00130\u0012H\u0082@¢\u0006\u0004\b\u0015\u0010\u0016J\u0018\u0010\u0019\u001a\u00020\u00042\u0006\u0010\u0018\u001a\u00020\u0017H\u0082@¢\u0006\u0004\b\u0019\u0010\u001aJ\u0017\u0010\u001c\u001a\u00020\u00042\u0006\u0010\u001b\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u001c\u0010\u001dJ\u000f\u0010\u001e\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u001e\u0010\u0003J\u000f\u0010\u001f\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u001f\u0010\u0003R\u001b\u0010%\u001a\u00020 8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b!\u0010\"\u001a\u0004\b#\u0010$R\u0016\u0010)\u001a\u00020&8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b'\u0010(R\u0018\u0010-\u001a\u0004\u0018\u00010*8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b+\u0010,R\u0016\u0010/\u001a\u00020&8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b.\u0010(¨\u00063"}, d2 = {"Lcom/neeeex/similar3p/junk/ui/JunkCleanNEEEEXActivity;", "Lcom/neeeex/eraser/base/BaseAdActivity;", "<init>", "()V", "Lfl/m0;", "B0", "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "(Landroid/os/Bundle;)V", "F0", "y0", "x0", "(Lkl/f;)Ljava/lang/Object;", "Lcom/neeeex/similar3p/junk/ui/JunkCleanNEEEEXActivity$a;", "Lcom/neeeex/similar3p/junk/d;", "G0", "(Lcom/neeeex/similar3p/junk/ui/JunkCleanNEEEEXActivity$a;)Lcom/neeeex/similar3p/junk/d;", "", "Lcom/neeeex/similar3p/junk/b0;", "targets", "E0", "(Ljava/util/List;Lkl/f;)Ljava/lang/Object;", "", "startedAtMillis", "I0", "(JLkl/f;)Ljava/lang/Object;", "result", "A0", "(Lcom/neeeex/similar3p/junk/d;)V", "D0", "H0", "Lji/e1;", "c", "Lfl/n;", "z0", "()Lji/e1;", "binding", "", "d", "Z", "cleaningStarted", "Lkotlinx/coroutines/Job;", "e", "Lkotlinx/coroutines/Job;", "cleaningJob", "f", "exitInProgress", "g", DownloadCommon.DOWNLOAD_REPORT_FIND_FILE_RESULT_VALUE_B, "a", "tool-feature_productionRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class JunkCleanNEEEEXActivity extends BaseAdActivity {

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    public final fl.n binding = fl.o.b(new Function0() { // from class: com.neeeex.similar3p.junk.ui.d
        @Override // p003kotlin.jvm.functions.Function0
        public final Object invoke() {
            return JunkCleanNEEEEXActivity.u0(this.f66433a);
        }
    });

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    public boolean cleaningStarted;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    public Job cleaningJob;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    public boolean exitInProgress;

    public interface a {

        /* JADX INFO: renamed from: com.neeeex.similar3p.junk.ui.JunkCleanNEEEEXActivity$a$a, reason: collision with other inner class name */
        public static final class C0812a implements a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final com.neeeex.similar3p.junk.d f66395a;

            public C0812a(com.neeeex.similar3p.junk.d dVar) {
                m0.a("1eFpDA1f\n", "p4QaeWErECE=\n");
                dVar.getClass();
                this.f66395a = dVar;
            }

            public final com.neeeex.similar3p.junk.d a() {
                return this.f66395a;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof C0812a) && p003kotlin.jvm.internal.v.c(this.f66395a, ((C0812a) obj).f66395a);
            }

            public int hashCode() {
                return this.f66395a.hashCode();
            }

            public String toString() {
                return "Complete(result=" + this.f66395a + ")";
            }
        }

        public static final class b implements a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final int f66396a;

            public b(int i10) {
                this.f66396a = i10;
            }

            public final int a() {
                return this.f66396a;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof b) && this.f66396a == ((b) obj).f66396a;
            }

            public int hashCode() {
                return Integer.hashCode(this.f66396a);
            }

            public String toString() {
                return "Failed(targetCount=" + this.f66396a + ")";
            }
        }
    }

    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final com.neeeex.similar3p.junk.d f66397a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final long f66398b;

        public b(com.neeeex.similar3p.junk.d dVar, long j10) {
            m0.a("y+Aq4Ivk\n", "uYVZleeQazA=\n");
            dVar.getClass();
            this.f66397a = dVar;
            this.f66398b = j10;
        }

        public final com.neeeex.similar3p.junk.d a() {
            return this.f66397a;
        }

        public final long b() {
            return this.f66398b;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return p003kotlin.jvm.internal.v.c(this.f66397a, bVar.f66397a) && this.f66398b == bVar.f66398b;
        }

        public int hashCode() {
            return (this.f66397a.hashCode() * 31) + Long.hashCode(this.f66398b);
        }

        public String toString() {
            return "CleaningRun(result=" + this.f66397a + ", startedAtMillis=" + this.f66398b + ")";
        }
    }

    public static final class d extends ll.d {
        long J$0;
        Object L$0;
        Object L$1;
        Object L$2;
        int label;
        /* synthetic */ Object result;

        public d(kl.f<? super d> fVar) {
            super(fVar);
        }

        @Override // ll.a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return JunkCleanNEEEEXActivity.this.x0(this);
        }
    }

    public static final class e extends ll.m implements tl.n {
        int label;

        public e(kl.f<? super e> fVar) {
            super(2, fVar);
        }

        @Override // ll.a
        public final kl.f<fl.m0> create(Object obj, kl.f<?> fVar) {
            return JunkCleanNEEEEXActivity.this.new e(fVar);
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
                JunkCleanNEEEEXActivity junkCleanNEEEEXActivity = JunkCleanNEEEEXActivity.this;
                this.label = 1;
                if (junkCleanNEEEEXActivity.x0(this) == objF) {
                    return objF;
                }
            } else {
                if (i10 != 1) {
                    v0.a(m0.a("zcmqCfu9B52J2qMWrqQNmo7KowO0uw2dicGoE7SiDZqO368Rs+kL0tzHsxGypw0=\n", "rqjGZdvJaL0=\n"));
                    return null;
                }
                fl.v.b(obj);
            }
            return fl.m0.f80959a;
        }
    }

    private final void B0() {
        if (this.exitInProgress) {
            return;
        }
        ExitScanDialog exitScanDialogA = ExitScanDialog.INSTANCE.a(R$string.dialog_neeeex_clean_exit_tip);
        exitScanDialogA.p(new ki.a() { // from class: com.neeeex.similar3p.junk.ui.g
            @Override // ki.a
            public final void a() {
                JunkCleanNEEEEXActivity.C0(this.f66439a);
            }
        });
        l0 supportFragmentManager = getSupportFragmentManager();
        m0.a("4S6uyWN/Kpj0P5zod2g3kug/l/t4bj2S9GP0tDgm\n", "hkvamhYPWvc=\n");
        supportFragmentManager.getClass();
        exitScanDialogA.i(supportFragmentManager);
    }

    public static final void C0(JunkCleanNEEEEXActivity junkCleanNEEEEXActivity) {
        junkCleanNEEEEXActivity.y0();
    }

    public static void s0(JunkCleanNEEEEXActivity junkCleanNEEEEXActivity, View view) {
        junkCleanNEEEEXActivity.B0();
    }

    public static e1 u0(JunkCleanNEEEEXActivity junkCleanNEEEEXActivity) {
        return e1.c(junkCleanNEEEEXActivity.getLayoutInflater());
    }

    public static fl.m0 v0(JunkCleanNEEEEXActivity junkCleanNEEEEXActivity, b.k0 k0Var) {
        m0.a("2j9ZtgKf82WaCFCzHdnzYpU=\n", "/ksx33G7kgE=\n");
        k0Var.getClass();
        junkCleanNEEEEXActivity.B0();
        return fl.m0.f80959a;
    }

    public final void A0(com.neeeex.similar3p.junk.d result) {
        if (this.exitInProgress) {
            return;
        }
        com.neeeex.similar3p.junk.e0.f66328a.a();
        Intent intent = new Intent(this, (Class<?>) JunkCleanCompleteNEEEEXActivity.class);
        intent.putExtra(m0.a("XPTmFiv12vBX7+0ZK/TP4VPy\n", "FqGoXXS2lrU=\n"), result.e());
        intent.putExtra(m0.a("LBH0Mlnb4FknCv89WdvjSSgQ\n", "ZkS6eQaYrBw=\n"), result.f());
        intent.putExtra(m0.a("Rel89tjnjx1D+XbixO6bGls=\n", "D7wyvYehzlQ=\n"), result.c());
        startActivity(intent);
        H0();
        finish();
    }

    public final void D0() {
        startActivity(new Intent(this, (Class<?>) JunkScanNEEEEXActivity.class));
        finish();
    }

    public final Object E0(List list, kl.f fVar) {
        File externalStorageDirectory = Environment.getExternalStorageDirectory();
        m0.a("tPZ+zGM3Q3S98mbabyxUZ7T2TuBpJkVyvOFzoTVtCC8=\n", "05MKiRtDJgY=\n");
        externalStorageDirectory.getClass();
        return com.neeeex.similar3p.junk.f.f(new com.neeeex.similar3p.junk.f(new com.neeeex.similar3p.junk.n(externalStorageDirectory, gl.w.r(getCacheDir(), getExternalCacheDir())), null, null, 6, null), list, null, fVar, 2, null);
    }

    public final void F0() {
        if (this.cleaningStarted) {
            return;
        }
        this.cleaningStarted = true;
        this.cleaningJob = kotlinx.coroutines.k.d(LifecycleOwnerKt.getLifecycleScope(this), null, null, new e(null), 3, null);
    }

    public final com.neeeex.similar3p.junk.d G0(a aVar) {
        if (aVar instanceof a.C0812a) {
            return ((a.C0812a) aVar).a();
        }
        if (aVar instanceof a.b) {
            return new com.neeeex.similar3p.junk.d(0, 0L, ((a.b) aVar).a(), 0);
        }
        coil.util.j.a();
        return null;
    }

    public final void H0() {
        if (com.neeeex.eraser.module.report.bytedance.a.k()) {
            BaseAdActivity.showInter$default(this, m0.a("/anPOvbOWJL3qvU8/9NmjMyozzP2wmK98KPHL//Tc4fMqtk=\n", "k8yqX5O2B+I=\n"), null, 2, null);
        }
    }

    public final Object I0(long j10, kl.f fVar) {
        Object objB;
        long jA = i.a(j10, SystemClock.elapsedRealtime(), 4000L);
        return (jA <= 0 || (objB = z0.b(jA, fVar)) != p003kotlin.coroutines.intrinsics.c.f()) ? fl.m0.f80959a : objB;
    }

    @Override // com.neeeex.eraser.base.RootActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        b.w.b(this, null, null, 3, null);
        setContentView(z0().getRoot());
        ConstraintLayout root = z0().getRoot();
        m0.a("LYcGvoCYkHBkzFzF\n", "SuJy7O/35Fg=\n");
        root.getClass();
        ConstraintLayout constraintLayout = z0().f85409e;
        m0.a("J0D2VXdmxdInTtBcd3/hzidCx199cu3GOw==\n", "SSWTMBIej6c=\n");
        constraintLayout.getClass();
        h0.c(root, constraintLayout, null, null, 12, null);
        z0().f85407c.setOnClickListener(new View.OnClickListener() { // from class: com.neeeex.similar3p.junk.ui.e
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                JunkCleanNEEEEXActivity.s0(this.f66434a, view);
            }
        });
        o0.b(getOnBackPressedDispatcher(), this, false, new Function1() { // from class: com.neeeex.similar3p.junk.ui.f
            @Override // p003kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return JunkCleanNEEEEXActivity.v0(this.f66437a, (b.k0) obj);
            }
        }, 2, null);
        F0();
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object x0(kl.f fVar) {
        d dVar;
        List listG;
        long j10;
        a bVar;
        b bVar2;
        if (fVar instanceof d) {
            dVar = (d) fVar;
            int i10 = dVar.label;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                dVar.label = i10 - Integer.MIN_VALUE;
            } else {
                dVar = new d(fVar);
            }
        } else {
            dVar = new d(fVar);
        }
        Object objE0 = dVar.result;
        Object objF = p003kotlin.coroutines.intrinsics.c.f();
        int i11 = dVar.label;
        try {
            if (i11 != 0) {
                if (i11 == 1) {
                    j10 = dVar.J$0;
                    listG = (List) dVar.L$0;
                    try {
                        fl.v.b(objE0);
                    } catch (Throwable unused) {
                        bVar = new a.b(listG.size());
                    }
                } else {
                    if (i11 != 2) {
                        v0.a(m0.a("BZzqytCTcjBBj+PVhYp4N0af48CflXgwQZTo0J+MeDdGiu/SmMd+fxSS89KZiXg=\n", "Zv2GpvDnHRA=\n"));
                        return null;
                    }
                    bVar2 = (b) dVar.L$2;
                    fl.v.b(objE0);
                }
                A0(bVar2.a());
                return fl.m0.f80959a;
            }
            fl.v.b(objE0);
            listG = com.neeeex.similar3p.junk.e0.f66328a.g();
            if (listG.isEmpty()) {
                D0();
                return fl.m0.f80959a;
            }
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            try {
                dVar.L$0 = listG;
                dVar.J$0 = jElapsedRealtime;
                dVar.label = 1;
                objE0 = E0(listG, dVar);
                if (objE0 != objF) {
                    j10 = jElapsedRealtime;
                }
            } catch (Throwable unused2) {
                j10 = jElapsedRealtime;
                bVar = new a.b(listG.size());
            }
            return objF;
            bVar = new a.C0812a((com.neeeex.similar3p.junk.d) objE0);
            b bVar3 = new b(G0(bVar), j10);
            long jB = bVar3.b();
            dVar.L$0 = ll.l.a(listG);
            dVar.L$1 = ll.l.a(bVar);
            dVar.L$2 = bVar3;
            dVar.J$0 = j10;
            dVar.label = 2;
            if (I0(jB, dVar) != objF) {
                bVar2 = bVar3;
                A0(bVar2.a());
                return fl.m0.f80959a;
            }
            return objF;
        } catch (CancellationException e10) {
            throw e10;
        }
    }

    public final void y0() {
        if (this.exitInProgress) {
            return;
        }
        this.exitInProgress = true;
        Job job = this.cleaningJob;
        if (job != null) {
            Job.a.a(job, null, 1, null);
        }
        zi.l.f104405a.b(this, m0.a("mVRZCvdymX2TV2MM/m+nY6hVWQP3fqNSkklVG81stQ==\n", "9zE8b5IKxg0=\n"), zi.n.JUNK_CLEANER);
    }

    public final e1 z0() {
        return (e1) this.binding.getValue();
    }
}