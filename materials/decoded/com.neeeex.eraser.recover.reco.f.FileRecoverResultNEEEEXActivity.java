package com.neeeex.eraser.recover.reco.f;

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
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u0000 \u00162\u00020\u0001:\u0002\u0017\u0018B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0005\u0010\u0003J\u0019\u0010\b\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0014¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\f\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000e\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u000e\u0010\u0003J\u000f\u0010\u000f\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u000f\u0010\u0003J\u000f\u0010\u0010\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0010\u0010\u0003J\u000f\u0010\u0011\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0011\u0010\u0003R\u0016\u0010\u0015\u001a\u00020\u00128\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014¨\u0006\u0019"}, d2 = {"Lcom/neeeex/eraser/recover/reco/f/FileRecoverResultNEEEEXActivity;", "Lcom/neeeex/eraser/base/BaseAdActivity;", "<init>", "()V", "Lfl/m0;", "x0", "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "(Landroid/os/Bundle;)V", "Lcom/neeeex/eraser/recover/reco/f/FileRecoverResultNEEEEXActivity$b;", "action", "G0", "(Lcom/neeeex/eraser/recover/reco/f/FileRecoverResultNEEEEXActivity$b;)V", "F0", "E0", "C0", "H0", "Lji/h;", "c", "Lji/h;", "binding", "d", DownloadCommon.DOWNLOAD_REPORT_FIND_FILE_RESULT_VALUE_B, "a", "tool-feature_productionRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class FileRecoverResultNEEEEXActivity extends BaseAdActivity {

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    public ji.h binding;

    public enum b {
        BACK,
        CONTINUE,
        VIEW_FILES,
        HOME;


        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ ml.a f65604b = ml.b.a(d());

        public static ml.a getEntries() {
            return f65604b;
        }
    }

    public static final /* synthetic */ class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f65605a;

        static {
            int[] iArr = new int[b.values().length];
            try {
                iArr[b.BACK.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[b.CONTINUE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[b.VIEW_FILES.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[b.HOME.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            f65605a = iArr;
        }
    }

    public static final void A0(FileRecoverResultNEEEEXActivity fileRecoverResultNEEEEXActivity, View view) {
        fileRecoverResultNEEEEXActivity.G0(b.VIEW_FILES);
    }

    public static final void B0(FileRecoverResultNEEEEXActivity fileRecoverResultNEEEEXActivity, View view) {
        fileRecoverResultNEEEEXActivity.G0(b.HOME);
    }

    public static final void D0(FileRecoverResultNEEEEXActivity fileRecoverResultNEEEEXActivity) {
        fileRecoverResultNEEEEXActivity.E0();
        fileRecoverResultNEEEEXActivity.H0();
    }

    private final void x0() {
        ji.h hVar = this.binding;
        if (hVar == null) {
            p003kotlin.jvm.internal.v.n("binding" /* decoded XOR */);
            hVar = null;
        }
        hVar.f85465e.setOnClickListener(new View.OnClickListener() { // from class: com.neeeex.eraser.recover.reco.f.f0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                FileRecoverResultNEEEEXActivity.y0(this.f65662a, view);
            }
        });
        hVar.f85462b.setOnClickListener(new View.OnClickListener() { // from class: com.neeeex.eraser.recover.reco.f.g0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                FileRecoverResultNEEEEXActivity.z0(this.f65664a, view);
            }
        });
        hVar.f85463c.setOnClickListener(new View.OnClickListener() { // from class: com.neeeex.eraser.recover.reco.f.h0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                FileRecoverResultNEEEEXActivity.A0(this.f65667a, view);
            }
        });
        hVar.f85466f.setOnClickListener(new View.OnClickListener() { // from class: com.neeeex.eraser.recover.reco.f.i0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                FileRecoverResultNEEEEXActivity.B0(this.f65669a, view);
            }
        });
    }

    public static final void y0(FileRecoverResultNEEEEXActivity fileRecoverResultNEEEEXActivity, View view) {
        fileRecoverResultNEEEEXActivity.G0(b.BACK);
    }

    public static final void z0(FileRecoverResultNEEEEXActivity fileRecoverResultNEEEEXActivity, View view) {
        fileRecoverResultNEEEEXActivity.G0(b.CONTINUE);
    }

    public final void C0() {
        ReturnTipDialog returnTipDialogA = ReturnTipDialog.INSTANCE.a();
        returnTipDialogA.p(new ki.a() { // from class: com.neeeex.eraser.recover.reco.f.j0
            @Override // ki.a
            public final void a() {
                FileRecoverResultNEEEEXActivity.D0(this.f65671a);
            }
        });
        androidx.fragment.app.l0 supportFragmentManager = getSupportFragmentManager();
        "getSupportFragmentManager(...)" /* decoded XOR */;
        supportFragmentManager.getClass();
        returnTipDialogA.i(supportFragmentManager);
    }

    public final void E0() {
        startActivity(new Intent(this, (Class<?>) MainActivity.class).setFlags(603979776));
    }

    public final void F0() {
        mi.a.f88870a.E0();
        E0();
        RecoveredNEEEEXActivity.INSTANCE.a(this, 2);
    }

    public final void G0(b action) {
        int i10 = c.f65605a[action.ordinal()];
        if (i10 == 1) {
            onBackPressed();
            return;
        }
        if (i10 == 2) {
            finish();
            return;
        }
        if (i10 == 3) {
            F0();
        } else if (i10 == 4) {
            C0();
        } else {
            coil.util.j.a();
        }
    }

    public final void H0() {
        if (com.neeeex.eraser.module.report.bytedance.a.k()) {
            BaseAdActivity.showInter$default(this, "RF_RECO_RESULT_HOME_BACK_EXIT_IN" /* decoded XOR */, null, 2, null);
        }
    }

    @Override // com.neeeex.eraser.base.RootActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ji.h hVarC = ji.h.c(getLayoutInflater());
        "inflate(...)" /* decoded XOR */;
        hVarC.getClass();
        this.binding = hVarC;
        ji.h hVar = null;
        if (hVarC == null) {
            p003kotlin.jvm.internal.v.n("binding" /* decoded XOR */);
            hVarC = null;
        }
        setContentView(hVarC.getRoot());
        x0();
        ji.h hVar2 = this.binding;
        if (hVar2 == null) {
            p003kotlin.jvm.internal.v.n("binding" /* decoded XOR */);
        } else {
            hVar = hVar2;
        }
        FrameLayout frameLayout = hVar.f85464d;
        "flAdContainer" /* decoded XOR */;
        frameLayout.getClass();
        BaseAdActivity.showRenderAdAndRefresh$default(this, frameLayout, R$layout.ad_neeeex_native_white, "RF_RECO_RESULT_NATIVE" /* decoded XOR */, null, 8, null);
        mi.a.f88870a.D0();
    }

    /* JADX INFO: renamed from: com.neeeex.eraser.recover.reco.f.FileRecoverResultNEEEEXActivity$a, reason: from kotlin metadata */
    public static final class Companion {
        public /* synthetic */ Companion(p003kotlin.jvm.internal.m mVar) {
            this();
        }

        public final void a(Context context) {
            "context" /* decoded XOR */;
            context.getClass();
            context.startActivity(new Intent(context, (Class<?>) FileRecoverResultNEEEEXActivity.class));
        }

        public Companion() {
        }
    }
}