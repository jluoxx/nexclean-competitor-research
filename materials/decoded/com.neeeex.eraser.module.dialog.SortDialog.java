package com.neeeex.eraser.module.dialog;

import android.app.Dialog;
import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.CheckBox;
import coil.util.j;
import com.android.launcher3.AutoInstallsLayout;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.mbridge.msdk.foundation.download.core.DownloadCommon;
import com.neeeex.eraser.R$style;
import com.neeeex.eraser.m0;
import com.neeeex.eraser.module.dialog.SortDialog;
import fl.t;
import fl.z;
import gl.w;
import java.util.Iterator;
import ji.o0;
import p003kotlin.Metadata;
import p003kotlin.jvm.internal.m;
import p003kotlin.jvm.internal.v;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0010\u0018\u0000 32\u00020\u0001:\u0003(0-B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0005\u0010\u0003J\u0017\u0010\b\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0019\u0010\f\u001a\u00020\u00042\b\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0016¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000e\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u000e\u0010\u0003J-\u0010\u0014\u001a\u0004\u0018\u00010\u00132\u0006\u0010\u0010\u001a\u00020\u000f2\b\u0010\u0012\u001a\u0004\u0018\u00010\u00112\b\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0016\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0016\u0010\u0003J!\u0010\u001a\u001a\u00020\u00042\u0012\u0010\u0019\u001a\u000e\u0012\u0004\u0012\u00020\u0018\u0012\u0004\u0012\u00020\u00180\u0017¢\u0006\u0004\b\u001a\u0010\u001bJ\u0015\u0010\u001e\u001a\u00020\u00042\u0006\u0010\u001d\u001a\u00020\u001c¢\u0006\u0004\b\u001e\u0010\u001fJ\u0017\u0010\"\u001a\u00020\u00042\u0006\u0010!\u001a\u00020 H\u0002¢\u0006\u0004\b\"\u0010#J\u0017\u0010&\u001a\u00020\u00042\u0006\u0010%\u001a\u00020$H\u0002¢\u0006\u0004\b&\u0010'R.\u0010\u0019\u001a\u000e\u0012\u0004\u0012\u00020\u0018\u0012\u0004\u0012\u00020\u00180\u00178\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b(\u0010)\u001a\u0004\b*\u0010+\"\u0004\b,\u0010\u001bR\u0018\u0010/\u001a\u0004\u0018\u00010\u001c8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b-\u0010.R\u0018\u00102\u001a\u0004\u0018\u00010 8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b0\u00101¨\u00064"}, d2 = {"Lcom/neeeex/eraser/module/dialog/SortDialog;", "Lcom/neeeex/eraser/module/dialog/BaseDialogFragment;", "<init>", "()V", "Lfl/m0;", AutoInstallsLayout.ATTR_X, "Landroid/content/Context;", "context", "onAttach", "(Landroid/content/Context;)V", "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "(Landroid/os/Bundle;)V", "onStart", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "Landroid/view/View;", "onCreateView", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;", "onDestroyView", "Lfl/t;", "", "sortPair", "z", "(Lfl/t;)V", "Lcom/neeeex/eraser/module/dialog/SortDialog$c;", "sortListener", AutoInstallsLayout.ATTR_Y, "(Lcom/neeeex/eraser/module/dialog/SortDialog$c;)V", "Lji/o0;", "viewBinding", "q", "(Lji/o0;)V", "Lcom/neeeex/eraser/module/dialog/SortDialog$b;", "action", "p", "(Lcom/neeeex/eraser/module/dialog/SortDialog$b;)V", "a", "Lfl/t;", "getSortPair", "()Lfl/t;", "setSortPair", DownloadCommon.DOWNLOAD_REPORT_FIND_FILE_RESULT_VALUE_B, "Lcom/neeeex/eraser/module/dialog/SortDialog$c;", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "c", "Lji/o0;", "binding", "d", "tool-feature_productionRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class SortDialog extends BaseDialogFragment {

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    public t sortPair = new t(1, 6);

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    public c listener;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    public o0 binding;

    public interface c {
        void a(t tVar);
    }

    public static final void r(SortDialog sortDialog, View view) {
        sortDialog.p(new b.d(1));
    }

    public static final void s(SortDialog sortDialog, View view) {
        sortDialog.p(new b.d(2));
    }

    public static final void t(SortDialog sortDialog, View view) {
        sortDialog.p(new b.c(5));
    }

    public static final void u(SortDialog sortDialog, View view) {
        sortDialog.p(new b.c(6));
    }

    public static final void v(SortDialog sortDialog, View view) {
        sortDialog.p(b.C0778b.f65232a);
    }

    public static final void w(SortDialog sortDialog, View view) {
        sortDialog.p(b.a.f65231a);
    }

    private final void x() {
        o0 o0Var = this.binding;
        if (o0Var != null) {
            Iterator it = w.p(z.a(o0Var.f85613e, 1), z.a(o0Var.f85615g, 2)).iterator();
            while (true) {
                boolean z10 = false;
                if (!it.hasNext()) {
                    break;
                }
                t tVar = (t) it.next();
                CheckBox checkBox = (CheckBox) tVar.component1();
                if (((Number) this.sortPair.getFirst()).intValue() == ((Number) tVar.component2()).intValue()) {
                    z10 = true;
                }
                checkBox.setChecked(z10);
            }
            for (t tVar2 : w.p(z.a(o0Var.f85612d, 5), z.a(o0Var.f85614f, 6))) {
                ((CheckBox) tVar2.component1()).setChecked(((Number) this.sortPair.getSecond()).intValue() == ((Number) tVar2.component2()).intValue());
            }
        }
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
        o0 o0VarC = o0.c(inflater, container, false);
        this.binding = o0VarC;
        o0VarC.getClass();
        q(o0VarC);
        x();
        return o0VarC.getRoot();
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onDestroyView() {
        super.onDestroyView();
        this.binding = null;
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onStart() {
        Window window;
        super.onStart();
        Dialog dialog = getDialog();
        if (dialog == null || (window = dialog.getWindow()) == null) {
            return;
        }
        window.setLayout(-1, -2);
        window.setGravity(80);
        window.setBackgroundDrawable(new ColorDrawable(0));
    }

    public final void p(b action) {
        t tVarA;
        boolean z10 = action instanceof b.d;
        if (z10) {
            tVarA = z.a(Integer.valueOf(((b.d) action).a()), this.sortPair.getSecond());
        } else if (action instanceof b.c) {
            tVarA = z.a(this.sortPair.getFirst(), Integer.valueOf(((b.c) action).a()));
        } else {
            if (!v.c(action, b.C0778b.f65232a) && !v.c(action, b.a.f65231a)) {
                j.a();
                return;
            }
            tVarA = this.sortPair;
        }
        this.sortPair = tVarA;
        if (v.c(action, b.C0778b.f65232a)) {
            c cVar = this.listener;
            if (cVar != null) {
                cVar.a(this.sortPair);
            }
            dismissAllowingStateLoss();
            return;
        }
        if (v.c(action, b.a.f65231a)) {
            dismissAllowingStateLoss();
        } else if (z10 || (action instanceof b.c)) {
            x();
        } else {
            j.a();
        }
    }

    public final void q(o0 viewBinding) {
        viewBinding.f85621m.setOnClickListener(new View.OnClickListener() { // from class: ki.q
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                SortDialog.r(this.f86552a, view);
            }
        });
        viewBinding.f85623o.setOnClickListener(new View.OnClickListener() { // from class: ki.r
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                SortDialog.s(this.f86553a, view);
            }
        });
        viewBinding.f85620l.setOnClickListener(new View.OnClickListener() { // from class: ki.s
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                SortDialog.t(this.f86554a, view);
            }
        });
        viewBinding.f85622n.setOnClickListener(new View.OnClickListener() { // from class: ki.t
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                SortDialog.u(this.f86555a, view);
            }
        });
        viewBinding.f85611c.setOnClickListener(new View.OnClickListener() { // from class: ki.u
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                SortDialog.v(this.f86556a, view);
            }
        });
        viewBinding.f85610b.setOnClickListener(new View.OnClickListener() { // from class: ki.v
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                SortDialog.w(this.f86557a, view);
            }
        });
    }

    public final void y(c sortListener) {
        "sortListener" /* decoded XOR */;
        sortListener.getClass();
        this.listener = sortListener;
    }

    public final void z(t sortPair) {
        "sortPair" /* decoded XOR */;
        sortPair.getClass();
        this.sortPair = sortPair;
    }

    /* JADX INFO: renamed from: com.neeeex.eraser.module.dialog.SortDialog$a, reason: from kotlin metadata */
    public static final class Companion {
        public /* synthetic */ Companion(m mVar) {
            this();
        }

        public final SortDialog a() {
            return new SortDialog();
        }

        public Companion() {
        }
    }

    public static abstract class b {

        public static final class a extends b {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final a f65231a = new a();

            public a() {
                super(null);
            }
        }

        /* JADX INFO: renamed from: com.neeeex.eraser.module.dialog.SortDialog$b$b, reason: collision with other inner class name */
        public static final class C0778b extends b {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final C0778b f65232a = new C0778b();

            public C0778b() {
                super(null);
            }
        }

        public static final class c extends b {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final int f65233a;

            public c(int i10) {
                super(null);
                this.f65233a = i10;
            }

            public final int a() {
                return this.f65233a;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof c) && this.f65233a == ((c) obj).f65233a;
            }

            public int hashCode() {
                return Integer.hashCode(this.f65233a);
            }

            public String toString() {
                return "Direction(value=" + this.f65233a + ")";
            }
        }

        public static final class d extends b {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final int f65234a;

            public d(int i10) {
                super(null);
                this.f65234a = i10;
            }

            public final int a() {
                return this.f65234a;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof d) && this.f65234a == ((d) obj).f65234a;
            }

            public int hashCode() {
                return Integer.hashCode(this.f65234a);
            }

            public String toString() {
                return "Field(value=" + this.f65234a + ")";
            }
        }

        public /* synthetic */ b(m mVar) {
            this();
        }

        public b() {
        }
    }
}