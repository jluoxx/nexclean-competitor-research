package com.neeeex.eraser.module.dialog;

import android.app.Dialog;
import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import com.mbridge.msdk.foundation.download.core.DownloadCommon;
import com.neeeex.eraser.R$style;
import com.neeeex.eraser.module.dialog.NotifyDialog;
import com.thinkup.core.q.o;
import ji.m0;
import ki.a;
import p003kotlin.Metadata;
import p003kotlin.jvm.internal.m;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\f\u0018\u0000 &2\u00020\u0001:\u0001\u001cB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u0019\u0010\u000b\u001a\u00020\u00062\b\u0010\n\u001a\u0004\u0018\u00010\tH\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\r\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\r\u0010\u0003J-\u0010\u0013\u001a\u0004\u0018\u00010\u00122\u0006\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0011\u001a\u0004\u0018\u00010\u00102\b\u0010\n\u001a\u0004\u0018\u00010\tH\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0015\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0015\u0010\u0003J\u000f\u0010\u0016\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0016\u0010\u0003J\u0017\u0010\u0019\u001a\u00020\u00062\u0006\u0010\u0018\u001a\u00020\u0017H\u0002¢\u0006\u0004\b\u0019\u0010\u001aR$\u0010\"\u001a\u0004\u0018\u00010\u001b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001f\"\u0004\b \u0010!R\u0018\u0010%\u001a\u0004\u0018\u00010\u00178\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b#\u0010$¨\u0006'"}, d2 = {"Lcom/neeeex/eraser/module/dialog/NotifyDialog;", "Lcom/neeeex/eraser/module/dialog/BaseDialogFragment;", "<init>", "()V", "Landroid/content/Context;", "context", "Lfl/m0;", "onAttach", "(Landroid/content/Context;)V", "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "(Landroid/os/Bundle;)V", "onStart", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "Landroid/view/View;", "onCreateView", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;", "onDestroyView", o.f74114d, "Lji/m0;", "binding", "l", "(Lji/m0;)V", "Lki/a;", "a", "Lki/a;", "getActionListener", "()Lki/a;", "p", "(Lki/a;)V", "actionListener", DownloadCommon.DOWNLOAD_REPORT_FIND_FILE_RESULT_VALUE_B, "Lji/m0;", "dlgBinding", "c", "tool-feature_productionRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class NotifyDialog extends BaseDialogFragment {

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    public a actionListener;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    public m0 dlgBinding;

    public static final void m(NotifyDialog notifyDialog, View view) {
        a aVar = notifyDialog.actionListener;
        if (aVar != null) {
            aVar.a();
        }
        notifyDialog.dismissAllowingStateLoss();
    }

    public static final void n(NotifyDialog notifyDialog, View view) {
        notifyDialog.dismissAllowingStateLoss();
    }

    public final void l(m0 binding) {
        binding.f85577b.setOnClickListener(new View.OnClickListener() { // from class: ki.m
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                NotifyDialog.m(this.f86548a, view);
            }
        });
        binding.f85578c.setOnClickListener(new View.OnClickListener() { // from class: ki.n
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                NotifyDialog.n(this.f86549a, view);
            }
        });
    }

    public final void o() {
        Window window;
        Dialog dialog = getDialog();
        if (dialog != null && (window = dialog.getWindow()) != null) {
            window.setLayout(-1, -2);
            window.setGravity(80);
            window.setBackgroundDrawable(new ColorDrawable(0));
        }
        Dialog dialog2 = getDialog();
        if (dialog2 != null) {
            dialog2.setCanceledOnTouchOutside(false);
        }
        setCancelable(false);
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onAttach(Context context) {
        "context" /* decoded XOR */;
        context.getClass();
        super.onAttach(context);
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
        m0 m0VarC = m0.c(inflater, container, false);
        this.dlgBinding = m0VarC;
        if (m0VarC != null) {
            l(m0VarC);
        }
        m0 m0Var = this.dlgBinding;
        if (m0Var != null) {
            return m0Var.getRoot();
        }
        return null;
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onDestroyView() {
        super.onDestroyView();
        this.dlgBinding = null;
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onStart() {
        super.onStart();
        o();
    }

    public final void p(a aVar) {
        this.actionListener = aVar;
    }

    /* JADX INFO: renamed from: com.neeeex.eraser.module.dialog.NotifyDialog$a, reason: from kotlin metadata */
    public static final class Companion {
        public /* synthetic */ Companion(m mVar) {
            this();
        }

        public final NotifyDialog a() {
            return new NotifyDialog();
        }

        public Companion() {
        }
    }
}