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
import android.widget.FrameLayout;
import com.mbridge.msdk.foundation.download.core.DownloadCommon;
import com.neeeex.eraser.R$layout;
import com.neeeex.eraser.R$style;
import com.neeeex.eraser.m0;
import com.neeeex.eraser.module.dialog.ExitQuitDialog;
import ji.i0;
import ki.a;
import p003kotlin.Metadata;
import p003kotlin.jvm.internal.m;
import ti.c;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\r\u0018\u0000 '2\u00020\u0001:\u0001(B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u0019\u0010\u000b\u001a\u00020\u00062\b\u0010\n\u001a\u0004\u0018\u00010\tH\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\r\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\r\u0010\u0003J-\u0010\u0013\u001a\u0004\u0018\u00010\u00122\u0006\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0011\u001a\u0004\u0018\u00010\u00102\b\u0010\n\u001a\u0004\u0018\u00010\tH\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0015\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0015\u0010\u0003J\u000f\u0010\u0016\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0016\u0010\u0003J\u0017\u0010\u0019\u001a\u00020\u00062\u0006\u0010\u0018\u001a\u00020\u0017H\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ\u0017\u0010\u001b\u001a\u00020\u00062\u0006\u0010\u0018\u001a\u00020\u0017H\u0002¢\u0006\u0004\b\u001b\u0010\u001aR$\u0010#\u001a\u0004\u0018\u00010\u001c8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010 \"\u0004\b!\u0010\"R\u0018\u0010&\u001a\u0004\u0018\u00010\u00178\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b$\u0010%¨\u0006)"}, d2 = {"Lcom/neeeex/eraser/module/dialog/ExitQuitDialog;", "Lcom/neeeex/eraser/module/dialog/BaseAdDialogFragment;", "<init>", "()V", "Landroid/content/Context;", "context", "Lfl/m0;", "onAttach", "(Landroid/content/Context;)V", "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "(Landroid/os/Bundle;)V", "onStart", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "Landroid/view/View;", "onCreateView", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;", "onDestroyView", "t", "Lji/i0;", "binding", "w", "(Lji/i0;)V", "u", "Lki/a;", DownloadCommon.DOWNLOAD_REPORT_FIND_FILE_RESULT_VALUE_B, "Lki/a;", "getActionListener", "()Lki/a;", "v", "(Lki/a;)V", "actionListener", "c", "Lji/i0;", "viewBinding", "d", "a", "tool-feature_productionRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class ExitQuitDialog extends BaseAdDialogFragment {

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    public a actionListener;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    public i0 viewBinding;

    public static final void x(ExitQuitDialog exitQuitDialog, View view) {
        a aVar = exitQuitDialog.actionListener;
        if (aVar != null) {
            aVar.a();
        }
        exitQuitDialog.dismissAllowingStateLoss();
    }

    public static final void y(ExitQuitDialog exitQuitDialog, View view) {
        exitQuitDialog.dismissAllowingStateLoss();
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
        i0 i0VarC = i0.c(inflater, container, false);
        "inflate(...)" /* decoded XOR */;
        i0VarC.getClass();
        this.viewBinding = i0VarC;
        w(i0VarC);
        u(i0VarC);
        return i0VarC.getRoot();
    }

    @Override // com.neeeex.eraser.module.dialog.BaseAdDialogFragment, androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onDestroyView() {
        super.onDestroyView();
        this.viewBinding = null;
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onStart() {
        super.onStart();
        t();
    }

    public final void t() {
        Window window;
        Dialog dialog = getDialog();
        if (dialog == null || (window = dialog.getWindow()) == null) {
            return;
        }
        window.setLayout(Resources.getSystem().getDisplayMetrics().widthPixels - c.a(40), -2);
        window.setGravity(17);
        window.setBackgroundDrawable(new ColorDrawable(0));
    }

    public final void u(i0 binding) {
        FrameLayout frameLayout = binding.f85492d;
        "flAdContainer" /* decoded XOR */;
        frameLayout.getClass();
        q(frameLayout, R$layout.ad_neeeex_native_white, "BASE_QUIT_NATIVE" /* decoded XOR */);
    }

    public final void v(a aVar) {
        this.actionListener = aVar;
    }

    public final void w(i0 binding) {
        binding.f85491c.setOnClickListener(new View.OnClickListener() { // from class: ki.d
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ExitQuitDialog.x(this.f86538a, view);
            }
        });
        binding.f85490b.setOnClickListener(new View.OnClickListener() { // from class: ki.e
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ExitQuitDialog.y(this.f86539a, view);
            }
        });
    }

    /* JADX INFO: renamed from: com.neeeex.eraser.module.dialog.ExitQuitDialog$a, reason: from kotlin metadata */
    public static final class Companion {
        public /* synthetic */ Companion(m mVar) {
            this();
        }

        public final ExitQuitDialog a() {
            return new ExitQuitDialog();
        }

        public Companion() {
        }
    }
}