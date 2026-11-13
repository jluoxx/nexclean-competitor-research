package com.neeeex.eraser.module.dialog;

import android.app.Dialog;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import com.mbridge.msdk.foundation.download.core.DownloadCommon;
import com.neeeex.eraser.R$string;
import com.neeeex.eraser.R$style;
import com.neeeex.eraser.m0;
import com.neeeex.eraser.module.dialog.ExitScanDialog;
import ji.j0;
import ki.a;
import p003kotlin.Metadata;
import p003kotlin.jvm.internal.m;
import ti.c;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\b\n\u0002\b\u0005\u0018\u0000 ,2\u00020\u0001:\u0001\u001eB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u0019\u0010\u000b\u001a\u00020\u00062\b\u0010\n\u001a\u0004\u0018\u00010\tH\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\r\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\r\u0010\u0003J-\u0010\u0013\u001a\u0004\u0018\u00010\u00122\u0006\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0011\u001a\u0004\u0018\u00010\u00102\b\u0010\n\u001a\u0004\u0018\u00010\tH\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0015\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0015\u0010\u0003J\u000f\u0010\u0016\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0016\u0010\u0003J\u0019\u0010\u0018\u001a\u00020\u00062\b\u0010\u0017\u001a\u0004\u0018\u00010\tH\u0002¢\u0006\u0004\b\u0018\u0010\fJ\u0017\u0010\u001b\u001a\u00020\u00062\u0006\u0010\u001a\u001a\u00020\u0019H\u0002¢\u0006\u0004\b\u001b\u0010\u001cR$\u0010$\u001a\u0004\u0018\u00010\u001d8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010!\"\u0004\b\"\u0010#R\u0018\u0010'\u001a\u0004\u0018\u00010\u00198\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b%\u0010&R\u0016\u0010+\u001a\u00020(8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b)\u0010*¨\u0006-"}, d2 = {"Lcom/neeeex/eraser/module/dialog/ExitScanDialog;", "Lcom/neeeex/eraser/module/dialog/BaseDialogFragment;", "<init>", "()V", "Landroid/content/Context;", "context", "Lfl/m0;", "onAttach", "(Landroid/content/Context;)V", "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "(Landroid/os/Bundle;)V", "onStart", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "Landroid/view/View;", "onCreateView", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;", "onDestroyView", "q", "args", "l", "Lji/j0;", "binding", "m", "(Lji/j0;)V", "Lki/a;", "a", "Lki/a;", "getActionListener", "()Lki/a;", "p", "(Lki/a;)V", "actionListener", DownloadCommon.DOWNLOAD_REPORT_FIND_FILE_RESULT_VALUE_B, "Lji/j0;", "viewBinding", "", "c", "I", "promptResId", "d", "tool-feature_productionRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class ExitScanDialog extends BaseDialogFragment {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    public a actionListener;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    public j0 viewBinding;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    public int promptResId = R$string.dialog_neeeex_scan_exit_tip;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final String f65197e = "prompt_res_id" /* decoded XOR */;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    public static final void n(ExitScanDialog exitScanDialog, View view) {
        a aVar = exitScanDialog.actionListener;
        if (aVar != null) {
            aVar.a();
        }
        exitScanDialog.dismiss();
    }

    public static final void o(ExitScanDialog exitScanDialog, View view) {
        exitScanDialog.dismiss();
    }

    public final void l(Bundle args) {
        this.promptResId = args != null ? args.getInt(f65197e, R$string.dialog_neeeex_scan_exit_tip) : R$string.dialog_neeeex_scan_exit_tip;
    }

    public final void m(j0 binding) {
        binding.f85507d.setText(this.promptResId);
        binding.f85506c.setOnClickListener(new View.OnClickListener() { // from class: ki.f
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ExitScanDialog.n(this.f86540a, view);
            }
        });
        binding.f85505b.setOnClickListener(new View.OnClickListener() { // from class: ki.g
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ExitScanDialog.o(this.f86541a, view);
            }
        });
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onAttach(Context context) {
        "context" /* decoded XOR */;
        context.getClass();
        super.onAttach(context);
        l(getArguments());
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setStyle(1, R$style.DIM_NEEEEX_Dialog);
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        "inflater" /* decoded XOR */;
        inflater.getClass();
        j0 j0VarC = j0.c(inflater, container, false);
        "inflate(...)" /* decoded XOR */;
        j0VarC.getClass();
        this.viewBinding = j0VarC;
        m(j0VarC);
        return j0VarC.getRoot();
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onDestroyView() {
        super.onDestroyView();
        this.viewBinding = null;
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onStart() {
        super.onStart();
        q();
    }

    public final void p(a aVar) {
        this.actionListener = aVar;
    }

    public final void q() {
        Window window;
        Dialog dialog = getDialog();
        if (dialog == null || (window = dialog.getWindow()) == null) {
            return;
        }
        window.setLayout(Resources.getSystem().getDisplayMetrics().widthPixels - c.a(40), -2);
        window.setGravity(17);
        window.setBackgroundDrawable(new ColorDrawable(0));
    }

    /* JADX INFO: renamed from: com.neeeex.eraser.module.dialog.ExitScanDialog$a, reason: from kotlin metadata */
    public static final class Companion {
        public /* synthetic */ Companion(m mVar) {
            this();
        }

        public static /* synthetic */ ExitScanDialog b(Companion companion, int i10, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                i10 = R$string.dialog_neeeex_scan_exit_tip;
            }
            return companion.a(i10);
        }

        public final ExitScanDialog a(int i10) {
            ExitScanDialog exitScanDialog = new ExitScanDialog();
            Bundle bundle = new Bundle();
            bundle.putInt("prompt_res_id" /* decoded XOR */, i10);
            exitScanDialog.setArguments(bundle);
            return exitScanDialog;
        }

        public Companion() {
        }
    }
}