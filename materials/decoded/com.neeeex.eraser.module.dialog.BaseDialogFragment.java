package com.neeeex.eraser.module.dialog;

import android.content.DialogInterface;
import androidx.fragment.app.DialogFragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.l0;
import androidx.fragment.app.t0;
import fl.m0;
import fl.u;
import fl.v;
import p003kotlin.Metadata;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0003\b\u0016\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J!\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0016¢\u0006\u0004\b\t\u0010\nJ!\u0010\t\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u000b2\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0016¢\u0006\u0004\b\t\u0010\u000eJ!\u0010\u000f\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0016¢\u0006\u0004\b\u000f\u0010\nJ\u000f\u0010\u0010\u001a\u00020\bH\u0016¢\u0006\u0004\b\u0010\u0010\u0003J\u0017\u0010\u0013\u001a\u00020\b2\u0006\u0010\u0012\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u0015\u0010\u0015\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0015\u0010\u0016J\r\u0010\u0017\u001a\u00020\b¢\u0006\u0004\b\u0017\u0010\u0003J!\u0010\u001a\u001a\u00020\b2\u0006\u0010\u0018\u001a\u00020\u00042\b\u0010\u0019\u001a\u0004\u0018\u00010\u0006H\u0002¢\u0006\u0004\b\u001a\u0010\nJ\u0017\u0010\u001c\u001a\u00020\r2\u0006\u0010\u001b\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u001c\u0010\u001dJ\u000f\u0010\u001f\u001a\u00020\u001eH\u0002¢\u0006\u0004\b\u001f\u0010 ¨\u0006!"}, d2 = {"Lcom/neeeex/eraser/module/dialog/BaseDialogFragment;", "Landroidx/fragment/app/DialogFragment;", "<init>", "()V", "Landroidx/fragment/app/l0;", "manager", "", "tag", "Lfl/m0;", "show", "(Landroidx/fragment/app/l0;Ljava/lang/String;)V", "Landroidx/fragment/app/t0;", "transaction", "", "(Landroidx/fragment/app/t0;Ljava/lang/String;)I", "showNow", "dismiss", "Landroid/content/DialogInterface;", "dialog", "onDismiss", "(Landroid/content/DialogInterface;)V", "i", "(Landroidx/fragment/app/l0;)V", "g", "mgr", "fragmentTag", "e", "txn", "h", "(Landroidx/fragment/app/t0;)I", "", "f", "()Z", "tool-feature_productionRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public class BaseDialogFragment extends DialogFragment {
    @Override // androidx.fragment.app.DialogFragment
    public void dismiss() {
        super.dismissAllowingStateLoss();
    }

    public final void e(l0 mgr, String fragmentTag) {
        try {
            u.a aVar = u.Companion;
            mgr.o().e(this, fragmentTag).i();
            u.m372constructorimpl(m0.f80959a);
        } catch (Throwable th2) {
            u.a aVar2 = u.Companion;
            u.m372constructorimpl(v.a(th2));
        }
    }

    public final boolean f() {
        FragmentActivity activity = getActivity();
        return (activity == null || !isAdded() || isDetached() || isRemoving() || activity.isDestroyed() || activity.isFinishing()) ? false : true;
    }

    public final void g() {
        if (f()) {
            dismissAllowingStateLoss();
        }
    }

    public final int h(t0 txn) {
        Object objM372constructorimpl;
        try {
            u.a aVar = u.Companion;
            objM372constructorimpl = u.m372constructorimpl(Integer.valueOf(txn.i()));
        } catch (Throwable th2) {
            u.a aVar2 = u.Companion;
            objM372constructorimpl = u.m372constructorimpl(v.a(th2));
        }
        if (u.m377isFailureimpl(objM372constructorimpl)) {
            objM372constructorimpl = 0;
        }
        return ((Number) objM372constructorimpl).intValue();
    }

    public final void i(l0 manager) {
        "manager" /* decoded XOR */;
        manager.getClass();
        show(manager, getClass().getName());
    }

    @Override // androidx.fragment.app.DialogFragment, android.content.DialogInterface.OnDismissListener
    public void onDismiss(DialogInterface dialog) {
        "dialog" /* decoded XOR */;
        dialog.getClass();
        super.onDismiss(dialog);
    }

    @Override // androidx.fragment.app.DialogFragment
    public int show(t0 transaction, String tag) {
        Object objM372constructorimpl;
        "transaction" /* decoded XOR */;
        transaction.getClass();
        try {
            u.a aVar = u.Companion;
            objM372constructorimpl = u.m372constructorimpl(Integer.valueOf(super.show(transaction, tag)));
        } catch (Throwable th2) {
            u.a aVar2 = u.Companion;
            objM372constructorimpl = u.m372constructorimpl(v.a(th2));
        }
        if (u.m375exceptionOrNullimpl(objM372constructorimpl) != null) {
            objM372constructorimpl = Integer.valueOf(h(transaction));
        }
        return ((Number) objM372constructorimpl).intValue();
    }

    @Override // androidx.fragment.app.DialogFragment
    public void showNow(l0 manager, String tag) {
        Object objM372constructorimpl;
        "manager" /* decoded XOR */;
        manager.getClass();
        try {
            u.a aVar = u.Companion;
            super.showNow(manager, tag);
            objM372constructorimpl = u.m372constructorimpl(m0.f80959a);
        } catch (Throwable th2) {
            u.a aVar2 = u.Companion;
            objM372constructorimpl = u.m372constructorimpl(v.a(th2));
        }
        if (u.m375exceptionOrNullimpl(objM372constructorimpl) != null) {
            e(manager, tag);
        }
    }

    @Override // androidx.fragment.app.DialogFragment
    public void show(l0 manager, String tag) {
        Object objM372constructorimpl;
        "manager" /* decoded XOR */;
        manager.getClass();
        try {
            u.a aVar = u.Companion;
            super.show(manager, tag);
            objM372constructorimpl = u.m372constructorimpl(m0.f80959a);
        } catch (Throwable th2) {
            u.a aVar2 = u.Companion;
            objM372constructorimpl = u.m372constructorimpl(v.a(th2));
        }
        if (u.m375exceptionOrNullimpl(objM372constructorimpl) != null) {
            e(manager, tag);
        }
    }
}