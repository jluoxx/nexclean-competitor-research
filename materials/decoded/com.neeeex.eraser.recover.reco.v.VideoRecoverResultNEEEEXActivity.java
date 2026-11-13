package com.neeeex.eraser.recover.reco.v;

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
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u0000 \u00152\u00020\u0001:\u0002\u0016\u0017B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0005\u0010\u0003J\u000f\u0010\u0006\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0006\u0010\u0003J\u0019\u0010\t\u001a\u00020\u00042\b\u0010\b\u001a\u0004\u0018\u00010\u0007H\u0014¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\r\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u000f\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u000f\u0010\u0003J\u000f\u0010\u0010\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0010\u0010\u0003R\u0016\u0010\u0014\u001a\u00020\u00118\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013¨\u0006\u0018"}, d2 = {"Lcom/neeeex/eraser/recover/reco/v/VideoRecoverResultNEEEEXActivity;", "Lcom/neeeex/eraser/base/BaseAdActivity;", "<init>", "()V", "Lfl/m0;", "x0", "F0", "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "(Landroid/os/Bundle;)V", "Lcom/neeeex/eraser/recover/reco/v/VideoRecoverResultNEEEEXActivity$a;", "command", "E0", "(Lcom/neeeex/eraser/recover/reco/v/VideoRecoverResultNEEEEXActivity$a;)V", "G0", "C0", "Lji/e0;", "c", "Lji/e0;", "binding", "d", "a", DownloadCommon.DOWNLOAD_REPORT_FIND_FILE_RESULT_VALUE_B, "tool-feature_productionRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class VideoRecoverResultNEEEEXActivity extends BaseAdActivity {

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    public ji.e0 binding;

    public enum a {
        BACK,
        CLOSE,
        OPEN_RECOVERED,
        RETURN_HOME;


        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ ml.a f65949b = ml.b.a(d());

        public static ml.a getEntries() {
            return f65949b;
        }
    }

    public static final /* synthetic */ class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f65950a;

        static {
            int[] iArr = new int[a.values().length];
            try {
                iArr[a.BACK.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[a.CLOSE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[a.OPEN_RECOVERED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[a.RETURN_HOME.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            f65950a = iArr;
        }
    }

    public static final void A0(VideoRecoverResultNEEEEXActivity videoRecoverResultNEEEEXActivity, View view) {
        videoRecoverResultNEEEEXActivity.E0(a.OPEN_RECOVERED);
    }

    public static final void B0(VideoRecoverResultNEEEEXActivity videoRecoverResultNEEEEXActivity, View view) {
        videoRecoverResultNEEEEXActivity.E0(a.RETURN_HOME);
    }

    public static final void D0(VideoRecoverResultNEEEEXActivity videoRecoverResultNEEEEXActivity) {
        videoRecoverResultNEEEEXActivity.F0();
        if (com.neeeex.eraser.module.report.bytedance.a.k()) {
            BaseAdActivity.showInter$default(videoRecoverResultNEEEEXActivity, "RV_RECO_RESULT_HOME_BACK_EXIT_IN" /* decoded XOR */, null, 2, null);
        }
    }

    private final void F0() {
        Intent intent = new Intent(this, (Class<?>) MainActivity.class);
        intent.setFlags(603979776);
        startActivity(intent);
    }

    private final void x0() {
        ji.e0 e0Var = this.binding;
        if (e0Var == null) {
            p003kotlin.jvm.internal.v.n("binding" /* decoded XOR */);
            e0Var = null;
        }
        e0Var.f85403e.setOnClickListener(new View.OnClickListener() { // from class: com.neeeex.eraser.recover.reco.v.n0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                VideoRecoverResultNEEEEXActivity.y0(this.f66050a, view);
            }
        });
        e0Var.f85400b.setOnClickListener(new View.OnClickListener() { // from class: com.neeeex.eraser.recover.reco.v.o0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                VideoRecoverResultNEEEEXActivity.z0(this.f66052a, view);
            }
        });
        e0Var.f85401c.setOnClickListener(new View.OnClickListener() { // from class: com.neeeex.eraser.recover.reco.v.p0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                VideoRecoverResultNEEEEXActivity.A0(this.f66054a, view);
            }
        });
        e0Var.f85404f.setOnClickListener(new View.OnClickListener() { // from class: com.neeeex.eraser.recover.reco.v.q0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                VideoRecoverResultNEEEEXActivity.B0(this.f66056a, view);
            }
        });
    }

    public static final void y0(VideoRecoverResultNEEEEXActivity videoRecoverResultNEEEEXActivity, View view) {
        videoRecoverResultNEEEEXActivity.E0(a.BACK);
    }

    public static final void z0(VideoRecoverResultNEEEEXActivity videoRecoverResultNEEEEXActivity, View view) {
        videoRecoverResultNEEEEXActivity.E0(a.CLOSE);
    }

    public final void C0() {
        ReturnTipDialog returnTipDialogA = ReturnTipDialog.INSTANCE.a();
        returnTipDialogA.p(new ki.a() { // from class: com.neeeex.eraser.recover.reco.v.r0
            @Override // ki.a
            public final void a() {
                VideoRecoverResultNEEEEXActivity.D0(this.f66058a);
            }
        });
        androidx.fragment.app.l0 supportFragmentManager = getSupportFragmentManager();
        "getSupportFragmentManager(...)" /* decoded XOR */;
        supportFragmentManager.getClass();
        returnTipDialogA.i(supportFragmentManager);
    }

    public final void E0(a command) {
        int i10 = c.f65950a[command.ordinal()];
        if (i10 == 1) {
            onBackPressed();
            return;
        }
        if (i10 == 2) {
            finish();
            return;
        }
        if (i10 == 3) {
            G0();
        } else if (i10 == 4) {
            C0();
        } else {
            coil.util.j.a();
        }
    }

    public final void G0() {
        mi.a.f88870a.c1();
        F0();
        RecoveredNEEEEXActivity.INSTANCE.a(this, 1);
    }

    @Override // com.neeeex.eraser.base.RootActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ji.e0 e0VarC = ji.e0.c(getLayoutInflater());
        "inflate(...)" /* decoded XOR */;
        e0VarC.getClass();
        this.binding = e0VarC;
        ji.e0 e0Var = null;
        if (e0VarC == null) {
            p003kotlin.jvm.internal.v.n("binding" /* decoded XOR */);
            e0VarC = null;
        }
        setContentView(e0VarC.getRoot());
        x0();
        ji.e0 e0Var2 = this.binding;
        if (e0Var2 == null) {
            p003kotlin.jvm.internal.v.n("binding" /* decoded XOR */);
        } else {
            e0Var = e0Var2;
        }
        FrameLayout frameLayout = e0Var.f85402d;
        "flAdContainer" /* decoded XOR */;
        frameLayout.getClass();
        BaseAdActivity.showRenderAdAndRefresh$default(this, frameLayout, R$layout.ad_neeeex_native_white, "RV_RECO_RESULT_NATIVE" /* decoded XOR */, null, 8, null);
        mi.a.f88870a.b1();
    }

    /* JADX INFO: renamed from: com.neeeex.eraser.recover.reco.v.VideoRecoverResultNEEEEXActivity$b, reason: from kotlin metadata */
    public static final class Companion {
        public /* synthetic */ Companion(p003kotlin.jvm.internal.m mVar) {
            this();
        }

        public final void a(Context context) {
            "context" /* decoded XOR */;
            context.getClass();
            context.startActivity(new Intent(context, (Class<?>) VideoRecoverResultNEEEEXActivity.class));
        }

        public Companion() {
        }
    }
}