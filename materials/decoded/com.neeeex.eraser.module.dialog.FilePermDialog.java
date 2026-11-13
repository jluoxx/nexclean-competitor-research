package com.neeeex.eraser.module.dialog;

import android.app.Dialog;
import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import androidx.appcompat.widget.AppCompatButton;
import androidx.appcompat.widget.AppCompatTextView;
import com.mbridge.msdk.foundation.download.core.DownloadCommon;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.neeeex.eraser.R$style;
import com.neeeex.eraser.m0;
import com.neeeex.eraser.module.dialog.FilePermDialog;
import com.thinkup.core.common.nn.m.n;
import ji.k0;
import ki.a;
import p003kotlin.Metadata;
import p003kotlin.jvm.internal.m;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\n\n\u0002\u0010\b\n\u0002\b\t\u0018\u0000 <2\u00020\u0001:\u0001\u001eB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u0019\u0010\u000b\u001a\u00020\u00062\b\u0010\n\u001a\u0004\u0018\u00010\tH\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\r\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\r\u0010\u0003J-\u0010\u0013\u001a\u0004\u0018\u00010\u00122\u0006\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0011\u001a\u0004\u0018\u00010\u00102\b\u0010\n\u001a\u0004\u0018\u00010\tH\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0015\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0015\u0010\u0003J\u000f\u0010\u0016\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0016\u0010\u0003J\u0019\u0010\u0018\u001a\u00020\u00062\b\u0010\u0017\u001a\u0004\u0018\u00010\tH\u0002¢\u0006\u0004\b\u0018\u0010\fJ\u0017\u0010\u001b\u001a\u00020\u00062\u0006\u0010\u001a\u001a\u00020\u0019H\u0002¢\u0006\u0004\b\u001b\u0010\u001cR$\u0010$\u001a\u0004\u0018\u00010\u001d8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010!\"\u0004\b\"\u0010#R$\u0010(\u001a\u0004\u0018\u00010\u001d8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b%\u0010\u001f\u001a\u0004\b&\u0010!\"\u0004\b'\u0010#R\"\u00100\u001a\u00020)8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b*\u0010+\u001a\u0004\b,\u0010-\"\u0004\b.\u0010/R\u0018\u00103\u001a\u0004\u0018\u00010\u00198\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b1\u00102R\u0016\u00107\u001a\u0002048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b5\u00106R\u0016\u00109\u001a\u0002048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b8\u00106R\u0016\u0010;\u001a\u0002048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b:\u00106¨\u0006="}, d2 = {"Lcom/neeeex/eraser/module/dialog/FilePermDialog;", "Lcom/neeeex/eraser/module/dialog/BaseDialogFragment;", "<init>", "()V", "Landroid/content/Context;", "context", "Lfl/m0;", "onAttach", "(Landroid/content/Context;)V", "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "(Landroid/os/Bundle;)V", "onStart", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "Landroid/view/View;", "onCreateView", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;", "onDestroyView", "l", "args", "m", "Lji/k0;", "binding", n.f72065d, "(Lji/k0;)V", "Lki/a;", "a", "Lki/a;", "getActionListener", "()Lki/a;", "q", "(Lki/a;)V", "actionListener", DownloadCommon.DOWNLOAD_REPORT_FIND_FILE_RESULT_VALUE_B, "getCloseListener", CampaignEx.JSON_KEY_AD_R, "closeListener", "", "c", "Z", "getDismissOnAction", "()Z", "s", "(Z)V", "dismissOnAction", "d", "Lji/k0;", "viewBinding", "", "e", "I", "titleRes", "f", "contentRes", "g", "agreeRes", "h", "tool-feature_productionRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class FilePermDialog extends BaseDialogFragment {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    public a actionListener;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    public a closeListener;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    public boolean dismissOnAction = true;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    public k0 viewBinding;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    public int titleRes;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    public int contentRes;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    public int agreeRes;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final String f65202i = "arg_title_res" /* decoded XOR */;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final String f65203j = "arg_content_res" /* decoded XOR */;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final String f65204k = "arg_agree_res" /* decoded XOR */;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    public static final void o(FilePermDialog filePermDialog, View view) {
        a aVar = filePermDialog.actionListener;
        if (aVar != null) {
            aVar.a();
        }
        if (filePermDialog.dismissOnAction) {
            filePermDialog.dismissAllowingStateLoss();
        }
    }

    public static final void p(FilePermDialog filePermDialog, View view) {
        filePermDialog.dismissAllowingStateLoss();
        a aVar = filePermDialog.closeListener;
        if (aVar != null) {
            aVar.a();
        }
    }

    public final void l() {
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

    public final void m(Bundle args) {
        this.titleRes = args != null ? args.getInt(f65202i) : 0;
        this.contentRes = args != null ? args.getInt(f65203j) : 0;
        this.agreeRes = args != null ? args.getInt(f65204k) : 0;
    }

    public final void n(k0 binding) {
        Integer numValueOf = Integer.valueOf(this.titleRes);
        if (numValueOf.intValue() == 0) {
            numValueOf = null;
        }
        if (numValueOf != null) {
            AppCompatTextView appCompatTextView = binding.f85526e;
            "tvNeeeexPermissionTitle" /* decoded XOR */;
            appCompatTextView.getClass();
            appCompatTextView.setText(numValueOf.intValue());
        }
        Integer numValueOf2 = Integer.valueOf(this.contentRes);
        if (numValueOf2.intValue() == 0) {
            numValueOf2 = null;
        }
        if (numValueOf2 != null) {
            AppCompatTextView appCompatTextView2 = binding.f85525d;
            "tvNeeeexPermissionContent" /* decoded XOR */;
            appCompatTextView2.getClass();
            appCompatTextView2.setText(numValueOf2.intValue());
        }
        Integer numValueOf3 = Integer.valueOf(this.agreeRes);
        Integer num = numValueOf3.intValue() != 0 ? numValueOf3 : null;
        if (num != null) {
            AppCompatButton appCompatButton = binding.f85523b;
            "btnNeeeexAgree" /* decoded XOR */;
            appCompatButton.getClass();
            appCompatButton.setText(num.intValue());
        }
        binding.f85523b.setOnClickListener(new View.OnClickListener() { // from class: ki.h
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                FilePermDialog.o(this.f86542a, view);
            }
        });
        binding.f85524c.setOnClickListener(new View.OnClickListener() { // from class: ki.i
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                FilePermDialog.p(this.f86543a, view);
            }
        });
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onAttach(Context context) {
        "context" /* decoded XOR */;
        context.getClass();
        super.onAttach(context);
        m(getArguments());
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
        k0 k0VarC = k0.c(inflater, container, false);
        this.viewBinding = k0VarC;
        if (k0VarC != null) {
            n(k0VarC);
        }
        k0 k0Var = this.viewBinding;
        if (k0Var != null) {
            return k0Var.getRoot();
        }
        return null;
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onDestroyView() {
        super.onDestroyView();
        this.viewBinding = null;
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onStart() {
        super.onStart();
        l();
    }

    public final void q(a aVar) {
        this.actionListener = aVar;
    }

    public final void r(a aVar) {
        this.closeListener = aVar;
    }

    public final void s(boolean z10) {
        this.dismissOnAction = z10;
    }

    /* JADX INFO: renamed from: com.neeeex.eraser.module.dialog.FilePermDialog$a, reason: from kotlin metadata */
    public static final class Companion {
        public /* synthetic */ Companion(m mVar) {
            this();
        }

        public final FilePermDialog a(int i10, int i11, int i12) {
            FilePermDialog filePermDialog = new FilePermDialog();
            Bundle bundle = new Bundle();
            bundle.putInt("arg_title_res" /* decoded XOR */, i10);
            bundle.putInt("arg_content_res" /* decoded XOR */, i11);
            bundle.putInt("arg_agree_res" /* decoded XOR */, i12);
            filePermDialog.setArguments(bundle);
            return filePermDialog;
        }

        public Companion() {
        }
    }
}