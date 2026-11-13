package com.neeeex.similar3p.junk.ui;

import android.app.Dialog;
import android.content.res.Resources;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.LinearLayout;
import com.mbridge.msdk.foundation.download.core.DownloadCommon;
import com.neeeex.eraser.R$string;
import com.neeeex.eraser.R$style;
import com.neeeex.eraser.module.dialog.BaseDialogFragment;
import fl.m0;
import p003kotlin.Metadata;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\f\u0018\u0000 '2\u00020\u0001:\u0002$\u001dB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0019\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\t\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\u0003J+\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u000b\u001a\u00020\n2\b\u0010\r\u001a\u0004\u0018\u00010\f2\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0011\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0011\u0010\u0003J\u0011\u0010\u0012\u001a\u0004\u0018\u00010\u0006H\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u0017\u0010\u0016\u001a\u00020\u00062\u0006\u0010\u0015\u001a\u00020\u0014H\u0002¢\u0006\u0004\b\u0016\u0010\u0017J\u0017\u0010\u001a\u001a\u00020\u00062\u0006\u0010\u0019\u001a\u00020\u0018H\u0002¢\u0006\u0004\b\u001a\u0010\u001bR$\u0010#\u001a\u0004\u0018\u00010\u001c8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010 \"\u0004\b!\u0010\"R\u0018\u0010&\u001a\u0004\u0018\u00010\u00148\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b$\u0010%¨\u0006("}, d2 = {"Lcom/neeeex/similar3p/junk/ui/JunkResultExitDialog;", "Lcom/neeeex/eraser/module/dialog/BaseDialogFragment;", "<init>", "()V", "Landroid/os/Bundle;", "savedInstanceState", "Lfl/m0;", "onCreate", "(Landroid/os/Bundle;)V", "onStart", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "Landroid/view/View;", "onCreateView", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;", "onDestroyView", com.thinkup.core.q.o.f74114d, "()Lfl/m0;", "Lji/j0;", "viewBinding", "l", "(Lji/j0;)V", "Lcom/neeeex/similar3p/junk/ui/JunkResultExitDialog$b;", "action", "p", "(Lcom/neeeex/similar3p/junk/ui/JunkResultExitDialog$b;)V", "Lki/a;", "a", "Lki/a;", "getActionListener", "()Lki/a;", "q", "(Lki/a;)V", "actionListener", DownloadCommon.DOWNLOAD_REPORT_FIND_FILE_RESULT_VALUE_B, "Lji/j0;", "binding", "c", "tool-feature_productionRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class JunkResultExitDialog extends BaseDialogFragment {

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    public ki.a actionListener;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    public ji.j0 binding;

    public enum b {
        CONFIRM_EXIT,
        KEEP_CLEANING;


        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ ml.a f66403b = ml.b.a(d());

        public static ml.a getEntries() {
            return f66403b;
        }
    }

    public static final void m(JunkResultExitDialog junkResultExitDialog, View view) {
        junkResultExitDialog.p(b.CONFIRM_EXIT);
    }

    public static final void n(JunkResultExitDialog junkResultExitDialog, View view) {
        junkResultExitDialog.dismiss();
    }

    public final void l(ji.j0 viewBinding) {
        viewBinding.f85507d.setText(R$string.neeeex_junk_exit_prompt);
        viewBinding.f85506c.setText(R$string.common_neeeex_exit);
        viewBinding.f85505b.setText(R$string.neeeex_junk_clean);
        viewBinding.f85506c.setOnClickListener(new View.OnClickListener() { // from class: com.neeeex.similar3p.junk.ui.o
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                JunkResultExitDialog.m(this.f66482a, view);
            }
        });
        viewBinding.f85505b.setOnClickListener(new View.OnClickListener() { // from class: com.neeeex.similar3p.junk.ui.p
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                JunkResultExitDialog.n(this.f66483a, view);
            }
        });
    }

    public final m0 o() {
        Window window;
        Dialog dialog = getDialog();
        if (dialog == null || (window = dialog.getWindow()) == null) {
            return null;
        }
        window.setLayout(Resources.getSystem().getDisplayMetrics().widthPixels - ti.c.a(40), -2);
        window.setGravity(17);
        window.setBackgroundDrawable(new ColorDrawable(0));
        return m0.f80959a;
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
        ji.j0 j0VarC = ji.j0.c(inflater, container, false);
        "inflate(...)" /* decoded XOR */;
        j0VarC.getClass();
        this.binding = j0VarC;
        l(j0VarC);
        LinearLayout root = j0VarC.getRoot();
        "getRoot(...)" /* decoded XOR */;
        root.getClass();
        return root;
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onDestroyView() {
        this.binding = null;
        super.onDestroyView();
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onStart() {
        super.onStart();
        o();
    }

    public final void p(b action) {
        ki.a aVar;
        dismiss();
        if (action != b.CONFIRM_EXIT || (aVar = this.actionListener) == null) {
            return;
        }
        aVar.a();
    }

    public final void q(ki.a aVar) {
        this.actionListener = aVar;
    }

    /* JADX INFO: renamed from: com.neeeex.similar3p.junk.ui.JunkResultExitDialog$a, reason: from kotlin metadata */
    public static final class Companion {
        public /* synthetic */ Companion(p003kotlin.jvm.internal.m mVar) {
            this();
        }

        public final JunkResultExitDialog a() {
            return new JunkResultExitDialog();
        }

        public Companion() {
        }
    }
}