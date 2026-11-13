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
import android.widget.RelativeLayout;
import coil.util.j;
import com.android.launcher3.testing.shared.TestProtocol;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.mbridge.msdk.foundation.download.core.DownloadCommon;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.neeeex.eraser.R$style;
import com.neeeex.eraser.m0;
import com.neeeex.eraser.module.dialog.FilterDialog;
import com.thinkup.core.common.nn.m.n;
import fl.t;
import fl.z;
import gl.w;
import ji.l0;
import p003kotlin.Metadata;
import p003kotlin.jvm.internal.m;
import p003kotlin.jvm.internal.v;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u0000 22\u00020\u0001:\u0004(/2,B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u0019\u0010\u000b\u001a\u00020\u00062\b\u0010\n\u001a\u0004\u0018\u00010\tH\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\r\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\r\u0010\u0003J-\u0010\u0013\u001a\u0004\u0018\u00010\u00122\u0006\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0011\u001a\u0004\u0018\u00010\u00102\b\u0010\n\u001a\u0004\u0018\u00010\tH\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0015\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0015\u0010\u0003J\u0015\u0010\u0018\u001a\u00020\u00062\u0006\u0010\u0017\u001a\u00020\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u0015\u0010\u001c\u001a\u00020\u00062\u0006\u0010\u001b\u001a\u00020\u001a¢\u0006\u0004\b\u001c\u0010\u001dJ\u0017\u0010 \u001a\u00020\u00062\u0006\u0010\u001f\u001a\u00020\u001eH\u0002¢\u0006\u0004\b \u0010!J\u0017\u0010$\u001a\u00020\u00062\u0006\u0010#\u001a\u00020\"H\u0002¢\u0006\u0004\b$\u0010%J\u0017\u0010'\u001a\u00020\u00062\u0006\u0010&\u001a\u00020\u0016H\u0002¢\u0006\u0004\b'\u0010\u0019R\u0018\u0010*\u001a\u0004\u0018\u00010\u001e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b(\u0010)R\u0016\u0010.\u001a\u00020+8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b,\u0010-R\u0018\u00101\u001a\u0004\u0018\u00010\u001a8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b/\u00100¨\u00063"}, d2 = {"Lcom/neeeex/eraser/module/dialog/FilterDialog;", "Lcom/neeeex/eraser/module/dialog/BaseDialogFragment;", "<init>", "()V", "Landroid/content/Context;", "context", "Lfl/m0;", "onAttach", "(Landroid/content/Context;)V", "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "(Landroid/os/Bundle;)V", "onStart", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "Landroid/view/View;", "onCreateView", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;", "onDestroyView", "", "filterValue", "t", "(I)V", "Lcom/neeeex/eraser/module/dialog/FilterDialog$c;", "filterListener", "s", "(Lcom/neeeex/eraser/module/dialog/FilterDialog$c;)V", "Lji/l0;", "viewBinding", n.f72065d, "(Lji/l0;)V", "Lcom/neeeex/eraser/module/dialog/FilterDialog$b;", "action", "m", "(Lcom/neeeex/eraser/module/dialog/FilterDialog$b;)V", "selected", CampaignEx.JSON_KEY_AD_R, "a", "Lji/l0;", "binding", "Lcom/neeeex/eraser/module/dialog/FilterDialog$d;", DownloadCommon.DOWNLOAD_REPORT_FIND_FILE_RESULT_VALUE_B, "Lcom/neeeex/eraser/module/dialog/FilterDialog$d;", TestProtocol.STATE_FIELD, "c", "Lcom/neeeex/eraser/module/dialog/FilterDialog$c;", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "d", "tool-feature_productionRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class FilterDialog extends BaseDialogFragment {

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    public l0 binding;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    public d state = new d(0, 0);

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    public c listener;

    public interface c {
        void a(int i10);
    }

    public static final class d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f65219a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f65220b;

        public d(int i10, int i11) {
            this.f65219a = i10;
            this.f65220b = i11;
        }

        public static /* synthetic */ d b(d dVar, int i10, int i11, int i12, Object obj) {
            if ((i12 & 1) != 0) {
                i10 = dVar.f65219a;
            }
            if ((i12 & 2) != 0) {
                i11 = dVar.f65220b;
            }
            return dVar.a(i10, i11);
        }

        public final d a(int i10, int i11) {
            return new d(i10, i11);
        }

        public final int c() {
            return this.f65220b;
        }

        public final int d() {
            return this.f65219a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof d)) {
                return false;
            }
            d dVar = (d) obj;
            return this.f65219a == dVar.f65219a && this.f65220b == dVar.f65220b;
        }

        public int hashCode() {
            return (Integer.hashCode(this.f65219a) * 31) + Integer.hashCode(this.f65220b);
        }

        public String toString() {
            return "SelectionState(initial=" + this.f65219a + ", current=" + this.f65220b + ")";
        }
    }

    public static final void o(FilterDialog filterDialog, int i10, View view) {
        filterDialog.m(new b.c(i10));
    }

    public static final void p(FilterDialog filterDialog, View view) {
        filterDialog.m(b.C0777b.f65217a);
    }

    public static final void q(FilterDialog filterDialog, View view) {
        filterDialog.m(b.a.f65216a);
    }

    public final void m(b action) {
        if (action instanceof b.c) {
            b.c cVar = (b.c) action;
            this.state = d.b(this.state, 0, cVar.a(), 1, null);
            r(cVar.a());
        } else {
            if (v.c(action, b.C0777b.f65217a)) {
                c cVar2 = this.listener;
                if (cVar2 != null) {
                    cVar2.a(this.state.c());
                }
                dismissAllowingStateLoss();
                return;
            }
            if (v.c(action, b.a.f65216a)) {
                dismissAllowingStateLoss();
            } else {
                j.a();
            }
        }
    }

    public final void n(l0 viewBinding) {
        for (t tVar : w.p(z.a(viewBinding.f85549k, 0), z.a(viewBinding.f85548j, 1), z.a(viewBinding.f85546h, 11), z.a(viewBinding.f85547i, 12))) {
            Object objComponent1 = tVar.component1();
            "component1(...)" /* decoded XOR */;
            objComponent1.getClass();
            final int iIntValue = ((Number) tVar.component2()).intValue();
            ((RelativeLayout) objComponent1).setOnClickListener(new View.OnClickListener() { // from class: ki.j
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    FilterDialog.o(this.f86544a, iIntValue, view);
                }
            });
        }
        viewBinding.f85540b.setOnClickListener(new View.OnClickListener() { // from class: ki.k
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                FilterDialog.p(this.f86546a, view);
            }
        });
        viewBinding.f85541c.setOnClickListener(new View.OnClickListener() { // from class: ki.l
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                FilterDialog.q(this.f86547a, view);
            }
        });
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
        l0 l0VarC = l0.c(inflater, container, false);
        this.binding = l0VarC;
        l0VarC.getClass();
        n(l0VarC);
        m(new b.c(this.state.d()));
        return l0VarC.getRoot();
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

    public final void r(int selected) {
        l0 l0Var = this.binding;
        if (l0Var != null) {
            for (t tVar : w.p(z.a(l0Var.f85545g, 0), z.a(l0Var.f85544f, 1), z.a(l0Var.f85542d, 11), z.a(l0Var.f85543e, 12))) {
                ((CheckBox) tVar.component1()).setChecked(selected == ((Number) tVar.component2()).intValue());
            }
        }
    }

    public final void s(c filterListener) {
        "filterListener" /* decoded XOR */;
        filterListener.getClass();
        this.listener = filterListener;
    }

    public final void t(int filterValue) {
        this.state = new d(filterValue, filterValue);
    }

    /* JADX INFO: renamed from: com.neeeex.eraser.module.dialog.FilterDialog$a, reason: from kotlin metadata */
    public static final class Companion {
        public /* synthetic */ Companion(m mVar) {
            this();
        }

        public final FilterDialog a() {
            return new FilterDialog();
        }

        public Companion() {
        }
    }

    public static abstract class b {

        public static final class a extends b {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final a f65216a = new a();

            public a() {
                super(null);
            }
        }

        /* JADX INFO: renamed from: com.neeeex.eraser.module.dialog.FilterDialog$b$b, reason: collision with other inner class name */
        public static final class C0777b extends b {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final C0777b f65217a = new C0777b();

            public C0777b() {
                super(null);
            }
        }

        public static final class c extends b {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final int f65218a;

            public c(int i10) {
                super(null);
                this.f65218a = i10;
            }

            public final int a() {
                return this.f65218a;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof c) && this.f65218a == ((c) obj).f65218a;
            }

            public int hashCode() {
                return Integer.hashCode(this.f65218a);
            }

            public String toString() {
                return "Select(value=" + this.f65218a + ")";
            }
        }

        public /* synthetic */ b(m mVar) {
            this();
        }

        public b() {
        }
    }
}