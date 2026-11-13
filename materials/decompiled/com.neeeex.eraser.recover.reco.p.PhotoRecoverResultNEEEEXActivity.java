package com.neeeex.eraser.recover.reco.p;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.FrameLayout;
import com.mbridge.msdk.foundation.download.core.DownloadCommon;
import com.neeeex.eraser.MainActivity;
import com.neeeex.eraser.R$layout;
import com.neeeex.eraser.base.BaseAdActivity;
import com.neeeex.eraser.module.dialog.ReturnTipDialog;
import com.neeeex.eraser.recover.recod.RecoveredNEEEEXActivity;
import p003kotlin.Metadata;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u0000 \u00162\u00020\u0001:\u0002\u0017\u0018B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0005\u0010\u0003J\u000f\u0010\u0006\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0006\u0010\u0003J\u000f\u0010\u0007\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\u0003J\u0019\u0010\n\u001a\u00020\u00042\b\u0010\t\u001a\u0004\u0018\u00010\bH\u0014¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\u000e\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\fH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0010\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0010\u0010\u0003J\u000f\u0010\u0011\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0011\u0010\u0003R\u0016\u0010\u0015\u001a\u00020\u00128\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014¨\u0006\u0019"}, d2 = {"Lcom/neeeex/eraser/recover/reco/p/PhotoRecoverResultNEEEEXActivity;", "Lcom/neeeex/eraser/base/BaseAdActivity;", "<init>", "()V", "Lfl/m0;", "x0", "D0", "H0", "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "(Landroid/os/Bundle;)V", "Lcom/neeeex/eraser/recover/reco/p/PhotoRecoverResultNEEEEXActivity$a;", "choice", "C0", "(Lcom/neeeex/eraser/recover/reco/p/PhotoRecoverResultNEEEEXActivity$a;)V", "E0", "F0", "Lji/r;", "c", "Lji/r;", "binding", "d", "a", DownloadCommon.DOWNLOAD_REPORT_FIND_FILE_RESULT_VALUE_B, "tool-feature_productionRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class PhotoRecoverResultNEEEEXActivity extends BaseAdActivity {

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    public ji.r binding;

    public interface a {

        /* JADX INFO: renamed from: com.neeeex.eraser.recover.reco.p.PhotoRecoverResultNEEEEXActivity$a$a, reason: collision with other inner class name */
        public static final class C0794a implements a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final C0794a f65769a = new C0794a();

            public boolean equals(Object obj) {
                return this == obj || (obj instanceof C0794a);
            }

            public int hashCode() {
                return -2013443642;
            }

            public String toString() {
                return com.neeeex.eraser.m0.a("09EwYA==\n", "kbBTC04Ghpw=\n");
            }
        }

        public static final class b implements a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final b f65770a = new b();

            public boolean equals(Object obj) {
                return this == obj || (obj instanceof b);
            }

            public int hashCode() {
                return 2126983081;
            }

            public String toString() {
                return com.neeeex.eraser.m0.a("Sfis37Ia\n", "C4rDqMF/+p4=\n");
            }
        }

        public static final class c implements a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final c f65771a = new c();

            public boolean equals(Object obj) {
                return this == obj || (obj instanceof c);
            }

            public int hashCode() {
                return -2013251138;
            }

            public String toString() {
                return com.neeeex.eraser.m0.a("LW5CiQ==\n", "ZQEv7IA/cig=\n");
            }
        }

        public static final class d implements a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final d f65772a = new d();

            public boolean equals(Object obj) {
                return this == obj || (obj instanceof d);
            }

            public int hashCode() {
                return -2012918984;
            }

            public String toString() {
                return com.neeeex.eraser.m0.a("bleg/w==\n", "PSPBhm0Xuzc=\n");
            }
        }
    }

    public static final void A0(PhotoRecoverResultNEEEEXActivity photoRecoverResultNEEEEXActivity, View view) {
        photoRecoverResultNEEEEXActivity.C0(a.b.f65770a);
    }

    public static final void B0(PhotoRecoverResultNEEEEXActivity photoRecoverResultNEEEEXActivity, View view) {
        photoRecoverResultNEEEEXActivity.C0(a.c.f65771a);
    }

    private final void D0() {
        Intent intent = new Intent(this, (Class<?>) MainActivity.class);
        intent.setFlags(603979776);
        startActivity(intent);
    }

    public static final void G0(PhotoRecoverResultNEEEEXActivity photoRecoverResultNEEEEXActivity) {
        photoRecoverResultNEEEEXActivity.D0();
        photoRecoverResultNEEEEXActivity.H0();
    }

    private final void H0() {
        if (com.neeeex.eraser.module.report.bytedance.a.k()) {
            BaseAdActivity.showInter$default(this, com.neeeex.eraser.m0.a("jQU2rErk/9SNEDqrQ/Pvw5AYLKFN5vPAgBAxt1v4+cU=\n", "31Vp/g+nsIs=\n"), null, 2, null);
        }
    }

    private final void x0() {
        ji.r rVar = this.binding;
        if (rVar == null) {
            p003kotlin.jvm.internal.v.n(com.neeeex.eraser.m0.a("9GnLCokPPQ==\n", "lgClbuBhWsw=\n"));
            rVar = null;
        }
        rVar.f85657e.setOnClickListener(new View.OnClickListener() { // from class: com.neeeex.eraser.recover.reco.p.k0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                PhotoRecoverResultNEEEEXActivity.y0(this.f65859a, view);
            }
        });
        rVar.f85654b.setOnClickListener(new View.OnClickListener() { // from class: com.neeeex.eraser.recover.reco.p.l0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                PhotoRecoverResultNEEEEXActivity.z0(this.f65861a, view);
            }
        });
        rVar.f85655c.setOnClickListener(new View.OnClickListener() { // from class: com.neeeex.eraser.recover.reco.p.m0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                PhotoRecoverResultNEEEEXActivity.A0(this.f65863a, view);
            }
        });
        rVar.f85658f.setOnClickListener(new View.OnClickListener() { // from class: com.neeeex.eraser.recover.reco.p.n0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                PhotoRecoverResultNEEEEXActivity.B0(this.f65865a, view);
            }
        });
    }

    public static final void y0(PhotoRecoverResultNEEEEXActivity photoRecoverResultNEEEEXActivity, View view) {
        photoRecoverResultNEEEEXActivity.C0(a.C0794a.f65769a);
    }

    public static final void z0(PhotoRecoverResultNEEEEXActivity photoRecoverResultNEEEEXActivity, View view) {
        photoRecoverResultNEEEEXActivity.C0(a.d.f65772a);
    }

    public final void C0(a choice) {
        if (p003kotlin.jvm.internal.v.c(choice, a.C0794a.f65769a)) {
            onBackPressed();
            return;
        }
        if (p003kotlin.jvm.internal.v.c(choice, a.d.f65772a)) {
            finish();
            return;
        }
        if (p003kotlin.jvm.internal.v.c(choice, a.b.f65770a)) {
            E0();
        } else if (p003kotlin.jvm.internal.v.c(choice, a.c.f65771a)) {
            F0();
        } else {
            coil.util.j.a();
        }
    }

    public final void E0() {
        mi.a.f88870a.Q0();
        D0();
        RecoveredNEEEEXActivity.INSTANCE.a(this, 0);
    }

    public final void F0() {
        ReturnTipDialog returnTipDialogA = ReturnTipDialog.INSTANCE.a();
        returnTipDialogA.p(new ki.a() { // from class: com.neeeex.eraser.recover.reco.p.o0
            @Override // ki.a
            public final void a() {
                PhotoRecoverResultNEEEEXActivity.G0(this.f65867a);
            }
        });
        androidx.fragment.app.l0 supportFragmentManager = getSupportFragmentManager();
        com.neeeex.eraser.m0.a("h5FLFS6jqfqSgHk0OrS08I6Acic1sr7wktwRaHX6\n", "4PQ/RlvT2ZU=\n");
        supportFragmentManager.getClass();
        returnTipDialogA.i(supportFragmentManager);
    }

    @Override // com.neeeex.eraser.base.RootActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ji.r rVarC = ji.r.c(getLayoutInflater());
        com.neeeex.eraser.m0.a("P+A1tFlN3LR4oH3x\n", "Vo5T2Dg5uZw=\n");
        rVarC.getClass();
        this.binding = rVarC;
        ji.r rVar = null;
        if (rVarC == null) {
            p003kotlin.jvm.internal.v.n(com.neeeex.eraser.m0.a("ixGGuQbIYw==\n", "6Xjo3W+mBEA=\n"));
            rVarC = null;
        }
        setContentView(rVarC.getRoot());
        x0();
        ji.r rVar2 = this.binding;
        if (rVar2 == null) {
            p003kotlin.jvm.internal.v.n(com.neeeex.eraser.m0.a("LmBnzClRSQ==\n", "TAkJqEA/Lvo=\n"));
        } else {
            rVar = rVar2;
        }
        FrameLayout frameLayout = rVar.f85656d;
        com.neeeex.eraser.m0.a("Xwl0VRswah5YDFtUKg==\n", "OWU1MVhfBGo=\n");
        frameLayout.getClass();
        BaseAdActivity.showRenderAdAndRefresh$default(this, frameLayout, R$layout.ad_neeeex_native_white, com.neeeex.eraser.m0.a("vi5aS4wuI8S+O1ZMhTkz1a0qTE+M\n", "7H4FGcltbJs=\n"), null, 8, null);
        mi.a.f88870a.P0();
    }

    /* JADX INFO: renamed from: com.neeeex.eraser.recover.reco.p.PhotoRecoverResultNEEEEXActivity$b, reason: from kotlin metadata */
    public static final class Companion {
        public /* synthetic */ Companion(p003kotlin.jvm.internal.m mVar) {
            this();
        }

        public final void a(Context context) {
            com.neeeex.eraser.m0.a("l1Hwc3Guxg==\n", "9D6eBxTWshs=\n");
            context.getClass();
            context.startActivity(new Intent(context, (Class<?>) PhotoRecoverResultNEEEEXActivity.class));
        }

        public Companion() {
        }
    }
}