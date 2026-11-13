package com.neeeex.eraser.recover.recod;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.l0;
import androidx.p002lifecycle.LifecycleOwner;
import androidx.p002lifecycle.MutableLiveData;
import androidx.p002lifecycle.Observer;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.android.launcher3.AutoInstallsLayout;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.foundation.download.core.DownloadCommon;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.neeeex.eraser.R$string;
import com.neeeex.eraser.base.BaseAdActivity;
import com.neeeex.eraser.m0;
import com.neeeex.eraser.module.dialog.DeleteTipDialog;
import com.neeeex.eraser.recover.reco.f.FileScanNEEEEXActivity;
import com.neeeex.eraser.recover.recod.FileRecoveredFragment;
import com.thinkup.core.common.nn.m.n;
import com.thinkup.core.q.o;
import fl.h;
import gl.x;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.function.Predicate;
import ji.p0;
import ki.a;
import p003kotlin.Metadata;
import p003kotlin.jvm.functions.Function1;
import p003kotlin.jvm.internal.h0;
import p003kotlin.jvm.internal.m;
import p003kotlin.jvm.internal.p;
import p003kotlin.jvm.internal.v;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 C2\u00020\u0001:\u000348-B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0005\u0010\u0003J\u0017\u0010\b\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\n\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\n\u0010\u0003J\u0019\u0010\r\u001a\u00020\u00042\b\u0010\f\u001a\u0004\u0018\u00010\u000bH\u0016¢\u0006\u0004\b\r\u0010\u000eJ-\u0010\u0014\u001a\u0004\u0018\u00010\u00132\u0006\u0010\u0010\u001a\u00020\u000f2\b\u0010\u0012\u001a\u0004\u0018\u00010\u00112\b\u0010\f\u001a\u0004\u0018\u00010\u000bH\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0016\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0016\u0010\u0003J\u0013\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00180\u0017¢\u0006\u0004\b\u0019\u0010\u001aJ\r\u0010\u001b\u001a\u00020\u0004¢\u0006\u0004\b\u001b\u0010\u0003J\r\u0010\u001c\u001a\u00020\u0004¢\u0006\u0004\b\u001c\u0010\u0003J\r\u0010\u001d\u001a\u00020\u0004¢\u0006\u0004\b\u001d\u0010\u0003J\u0015\u0010 \u001a\u00020\u00042\u0006\u0010\u001f\u001a\u00020\u001e¢\u0006\u0004\b \u0010!J\u000f\u0010\"\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\"\u0010\u0003J\u000f\u0010#\u001a\u00020\u0004H\u0003¢\u0006\u0004\b#\u0010\u0003J\u000f\u0010$\u001a\u00020\u0004H\u0002¢\u0006\u0004\b$\u0010\u0003J1\u0010)\u001a\u00020\u00042\f\u0010%\u001a\b\u0012\u0004\u0012\u00020\u001e0\u00172\u0012\u0010(\u001a\u000e\u0012\u0004\u0012\u00020\u0018\u0012\u0004\u0012\u00020'0&H\u0002¢\u0006\u0004\b)\u0010*R.\u00103\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00180,0+8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b-\u0010.\u001a\u0004\b/\u00100\"\u0004\b1\u00102R\u001c\u00106\u001a\b\u0012\u0004\u0012\u00020\u00180,8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b4\u00105R\u0016\u0010:\u001a\u0002078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b8\u00109R\u0018\u0010>\u001a\u0004\u0018\u00010;8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b<\u0010=R\u0018\u0010B\u001a\u0004\u0018\u00010?8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b@\u0010A¨\u0006D"}, d2 = {"Lcom/neeeex/eraser/recover/recod/FileRecoveredFragment;", "Landroidx/fragment/app/Fragment;", "<init>", "()V", "Lfl/m0;", "v", "Landroid/content/Context;", "context", "onAttach", "(Landroid/content/Context;)V", "onStart", "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "(Landroid/os/Bundle;)V", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "Landroid/view/View;", "onCreateView", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;", "onDestroyView", "", "Lii/c;", "p", "()Ljava/util/List;", o.f74114d, n.f72065d, CampaignEx.JSON_KEY_AD_R, "", MBridgeConstans.DYNAMIC_VIEW_WX_PATH, "s", "(Ljava/lang/String;)V", "m", AutoInstallsLayout.ATTR_X, "q", "paths", "Lkotlin/Function1;", "", "matcher", "w", "(Ljava/util/List;Lkotlin/jvm/functions/Function1;)V", "Landroidx/lifecycle/MutableLiveData;", "Ljava/util/concurrent/CopyOnWriteArrayList;", "a", "Landroidx/lifecycle/MutableLiveData;", "getFileBeanListLiveData", "()Landroidx/lifecycle/MutableLiveData;", "setFileBeanListLiveData", "(Landroidx/lifecycle/MutableLiveData;)V", "fileBeanListLiveData", DownloadCommon.DOWNLOAD_REPORT_FIND_FILE_RESULT_VALUE_B, "Ljava/util/concurrent/CopyOnWriteArrayList;", "recoveredFiles", "Lcom/neeeex/eraser/recover/recod/FileRecoveredFragment$b;", "c", "Lcom/neeeex/eraser/recover/recod/FileRecoveredFragment$b;", "removalPlan", "Lcom/neeeex/eraser/recover/reco/f/d;", "d", "Lcom/neeeex/eraser/recover/reco/f/d;", "fileAdapter", "Lji/p0;", "e", "Lji/p0;", "viewBinding", "f", "tool-feature_productionRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class FileRecoveredFragment extends Fragment {

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    public MutableLiveData fileBeanListLiveData = new MutableLiveData();

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    public CopyOnWriteArrayList recoveredFiles = new CopyOnWriteArrayList();

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    public b removalPlan = b.C0801b.f66083a;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    public com.neeeex.eraser.recover.reco.f.d fileAdapter;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    public p0 viewBinding;

    public interface b {

        public static final class a implements b {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final Function1 f66082a;

            public a(Function1 function1) {
                "matcher" /* decoded XOR */;
                function1.getClass();
                this.f66082a = function1;
            }

            public final Function1 a() {
                return this.f66082a;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof a) && v.c(this.f66082a, ((a) obj).f66082a);
            }

            public int hashCode() {
                return this.f66082a.hashCode();
            }

            public String toString() {
                return "Active(matcher=" + this.f66082a + ")";
            }
        }

        /* JADX INFO: renamed from: com.neeeex.eraser.recover.recod.FileRecoveredFragment$b$b, reason: collision with other inner class name */
        public static final class C0801b implements b {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final C0801b f66083a = new C0801b();

            public boolean equals(Object obj) {
                return this == obj || (obj instanceof C0801b);
            }

            public int hashCode() {
                return 1451975385;
            }

            public String toString() {
                return "Inactive" /* decoded XOR */;
            }
        }
    }

    public static final class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f66084a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f66085b;

        public c(int i10, int i11) {
            this.f66084a = i10;
            this.f66085b = i11;
        }

        public final int a() {
            return this.f66084a;
        }

        public final int b() {
            return this.f66085b;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            return this.f66084a == cVar.f66084a && this.f66085b == cVar.f66085b;
        }

        public int hashCode() {
            return (Integer.hashCode(this.f66084a) * 31) + Integer.hashCode(this.f66085b);
        }

        public String toString() {
            return "ScreenModel(emptyVisibility=" + this.f66084a + ", listVisibility=" + this.f66085b + ")";
        }
    }

    public static final class e implements Observer, p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Function1 f66086a;

        public e(Function1 function1) {
            "function" /* decoded XOR */;
            function1.getClass();
            this.f66086a = function1;
        }

        public final boolean equals(Object obj) {
            if ((obj instanceof Observer) && (obj instanceof p)) {
                return v.c(getFunctionDelegate(), ((p) obj).getFunctionDelegate());
            }
            return false;
        }

        @Override // p003kotlin.jvm.internal.p
        public final h getFunctionDelegate() {
            return this.f66086a;
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }

        @Override // androidx.p002lifecycle.Observer
        public final /* synthetic */ void onChanged(Object obj) {
            this.f66086a.invoke(obj);
        }
    }

    public static void e() {
    }

    public static fl.m0 f(FileRecoveredFragment fileRecoveredFragment, String str) {
        CopyOnWriteArrayList copyOnWriteArrayList = fileRecoveredFragment.recoveredFiles;
        if (copyOnWriteArrayList == null || !copyOnWriteArrayList.isEmpty()) {
            Iterator it = copyOnWriteArrayList.iterator();
            while (it.hasNext()) {
                if (v.c(((ii.c) it.next()).h(), str)) {
                    str.getClass();
                    fileRecoveredFragment.s(str);
                    break;
                }
            }
        }
        return fl.m0.f80959a;
    }

    public static boolean g(String str, ii.c cVar) {
        "file" /* decoded XOR */;
        cVar.getClass();
        return v.c(cVar.h(), str);
    }

    public static boolean h(Function1 function1, ii.c cVar) {
        cVar.getClass();
        return ((Boolean) function1.invoke(cVar)).booleanValue();
    }

    public static void i(FileRecoveredFragment fileRecoveredFragment, View view) {
        Context context = fileRecoveredFragment.getContext();
        if (context != null) {
            FileScanNEEEEXActivity.INSTANCE.a(context);
        }
    }

    public static fl.m0 j(FileRecoveredFragment fileRecoveredFragment, Boolean bool) {
        if (fileRecoveredFragment.removalPlan instanceof b.a) {
            fileRecoveredFragment.n();
        }
        return fl.m0.f80959a;
    }

    public static fl.m0 k(FileRecoveredFragment fileRecoveredFragment, CopyOnWriteArrayList copyOnWriteArrayList) {
        copyOnWriteArrayList.getClass();
        fileRecoveredFragment.recoveredFiles = copyOnWriteArrayList;
        fileRecoveredFragment.v();
        return fl.m0.f80959a;
    }

    public static boolean l(Function1 function1, Object obj) {
        return ((Boolean) function1.invoke(obj)).booleanValue();
    }

    public static final void t(FileRecoveredFragment fileRecoveredFragment, List list) {
        List list2 = list;
        ArrayList arrayList = new ArrayList(x.x(list2, 10));
        Iterator it = list2.iterator();
        while (it.hasNext()) {
            arrayList.add(((ii.c) it.next()).h());
        }
        fileRecoveredFragment.w(arrayList, new Function1() { // from class: si.j
            @Override // p003kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return Boolean.valueOf(FileRecoveredFragment.u((ii.c) obj));
            }
        });
    }

    public static final boolean u(ii.c cVar) {
        "file" /* decoded XOR */;
        cVar.getClass();
        return cVar.i();
    }

    private final void v() {
        p0 p0Var = this.viewBinding;
        if (p0Var == null) {
            return;
        }
        c cVar = this.recoveredFiles.isEmpty() ? new c(0, 8) : new c(8, 0);
        p0Var.f85641d.setVisibility(cVar.a());
        p0Var.f85642e.setVisibility(cVar.b());
        if (cVar.b() != 0) {
            return;
        }
        p0Var.f85642e.setHasFixedSize(true);
        p0Var.f85642e.setLayoutManager(new LinearLayoutManager(getContext()));
        com.neeeex.eraser.recover.reco.f.d dVar = new com.neeeex.eraser.recover.reco.f.d(this.recoveredFiles, true, new com.neeeex.eraser.recover.reco.f.d.c() { // from class: si.f
            @Override // com.neeeex.eraser.recover.reco.f.d.c
            public final void a() {
                FileRecoveredFragment.e();
            }
        });
        this.fileAdapter = dVar;
        p0Var.f85642e.setAdapter(dVar);
    }

    public final void m() {
        AppCompatTextView appCompatTextView;
        p0 p0Var = this.viewBinding;
        if (p0Var == null || (appCompatTextView = p0Var.f85639b) == null) {
            return;
        }
        appCompatTextView.setOnClickListener(new View.OnClickListener() { // from class: si.d
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                FileRecoveredFragment.i(this.f98396a, view);
            }
        });
    }

    public final void n() {
        final Function1 function1A;
        b bVar = this.removalPlan;
        b.a aVar = bVar instanceof b.a ? (b.a) bVar : null;
        if (aVar == null || (function1A = aVar.a()) == null) {
            function1A = new h0() { // from class: com.neeeex.eraser.recover.recod.FileRecoveredFragment.d
                {
                    "selected" /* decoded XOR */;
                    "getSelected()Z" /* decoded XOR */;
                }

                @Override // p003kotlin.jvm.internal.h0, p003kotlin.jvm.internal.g0, bm.o
                public Object get(Object obj) {
                    return Boolean.valueOf(((ii.c) obj).i());
                }

                @Override // p003kotlin.jvm.internal.h0, p003kotlin.jvm.internal.g0, bm.k
                public void set(Object obj, Object obj2) {
                    ((ii.c) obj).m(((Boolean) obj2).booleanValue());
                }
            };
        }
        CopyOnWriteArrayList copyOnWriteArrayList = this.recoveredFiles;
        final Function1 function1 = new Function1() { // from class: si.g
            @Override // p003kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return Boolean.valueOf(FileRecoveredFragment.h(function1A, (ii.c) obj));
            }
        };
        copyOnWriteArrayList.removeIf(new Predicate() { // from class: si.h
            @Override // java.util.function.Predicate
            public final boolean test(Object obj) {
                return FileRecoveredFragment.l(function1, obj);
            }
        });
        this.removalPlan = b.C0801b.f66083a;
        com.neeeex.eraser.recover.reco.f.d dVar = this.fileAdapter;
        if (dVar != null) {
            dVar.notifyDataSetChanged();
        }
        v();
        Toast.makeText(getContext(), R$string.toast_neeeex_delete, 0).show();
    }

    public final void o() {
        Iterator it = this.recoveredFiles.iterator();
        while (it.hasNext()) {
            ((ii.c) it.next()).m(false);
        }
        com.neeeex.eraser.recover.reco.f.d dVar = this.fileAdapter;
        if (dVar != null) {
            dVar.notifyDataSetChanged();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onAttach(Context context) {
        "context" /* decoded XOR */;
        context.getClass();
        super.onAttach(context);
    }

    @Override // androidx.fragment.app.Fragment
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        "inflater" /* decoded XOR */;
        inflater.getClass();
        this.viewBinding = p0.c(inflater, container, false);
        m();
        q();
        x();
        p0 p0Var = this.viewBinding;
        if (p0Var != null) {
            return p0Var.getRoot();
        }
        return null;
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroyView() {
        super.onDestroyView();
        this.viewBinding = null;
    }

    @Override // androidx.fragment.app.Fragment
    public void onStart() {
        super.onStart();
    }

    public final List p() {
        CopyOnWriteArrayList copyOnWriteArrayList = this.recoveredFiles;
        ArrayList arrayList = new ArrayList();
        for (Object obj : copyOnWriteArrayList) {
            if (((ii.c) obj).i()) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    public final void q() {
        MutableLiveData mutableLiveDataD;
        MutableLiveData mutableLiveDataA;
        this.fileBeanListLiveData.observe(getViewLifecycleOwner(), new e(new Function1() { // from class: si.a
            @Override // p003kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return FileRecoveredFragment.k(this.f98390a, (CopyOnWriteArrayList) obj);
            }
        }));
        FragmentActivity activity = getActivity();
        RecoveredNEEEEXActivity recoveredNEEEEXActivity = activity instanceof RecoveredNEEEEXActivity ? (RecoveredNEEEEXActivity) activity : null;
        com.neeeex.eraser.h0 sharedViewModel = recoveredNEEEEXActivity != null ? recoveredNEEEEXActivity.getSharedViewModel() : null;
        if (sharedViewModel != null && (mutableLiveDataA = sharedViewModel.A()) != null) {
            LifecycleOwner viewLifecycleOwner = getViewLifecycleOwner();
            "getViewLifecycleOwner(...)" /* decoded XOR */;
            viewLifecycleOwner.getClass();
            ti.h.g(mutableLiveDataA, viewLifecycleOwner, false, false, new Function1() { // from class: si.b
                @Override // p003kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return FileRecoveredFragment.j(this.f98392a, (Boolean) obj);
                }
            }, 4, null);
        }
        if (sharedViewModel == null || (mutableLiveDataD = sharedViewModel.D()) == null) {
            return;
        }
        ti.h.g(mutableLiveDataD, this, false, false, new Function1() { // from class: si.c
            @Override // p003kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return FileRecoveredFragment.f(this.f98394a, (String) obj);
            }
        }, 4, null);
    }

    public final void r() {
        final List listP = p();
        if (listP.isEmpty()) {
            Toast.makeText(getContext(), R$string.toast_neeeex_select_one, 1).show();
            return;
        }
        DeleteTipDialog deleteTipDialogA = DeleteTipDialog.INSTANCE.a();
        deleteTipDialogA.m(new a() { // from class: si.e
            @Override // ki.a
            public final void a() {
                FileRecoveredFragment.t(this.f98399a, listP);
            }
        });
        l0 childFragmentManager = getChildFragmentManager();
        "getChildFragmentManager(...)" /* decoded XOR */;
        childFragmentManager.getClass();
        deleteTipDialogA.i(childFragmentManager);
    }

    public final void s(final String path) {
        "path" /* decoded XOR */;
        path.getClass();
        w(gl.v.e(path), new Function1() { // from class: si.i
            @Override // p003kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return Boolean.valueOf(FileRecoveredFragment.g(path, (ii.c) obj));
            }
        });
    }

    public final void w(List paths, Function1 matcher) {
        com.neeeex.eraser.h0 sharedViewModel;
        FragmentActivity activity = getActivity();
        RecoveredNEEEEXActivity recoveredNEEEEXActivity = activity instanceof RecoveredNEEEEXActivity ? (RecoveredNEEEEXActivity) activity : null;
        if (recoveredNEEEEXActivity == null || (sharedViewModel = recoveredNEEEEXActivity.getSharedViewModel()) == null) {
            return;
        }
        if (com.neeeex.eraser.module.report.bytedance.a.k()) {
            BaseAdActivity.showInter$default(recoveredNEEEEXActivity, "RF_DEL_IN" /* decoded XOR */, null, 2, null);
        }
        this.removalPlan = new b.a(matcher);
        sharedViewModel.x(recoveredNEEEEXActivity, paths, true);
    }

    public final void x() {
        com.neeeex.eraser.h0 sharedViewModel;
        FragmentActivity activity = getActivity();
        RecoveredNEEEEXActivity recoveredNEEEEXActivity = activity instanceof RecoveredNEEEEXActivity ? (RecoveredNEEEEXActivity) activity : null;
        if (recoveredNEEEEXActivity == null || (sharedViewModel = recoveredNEEEEXActivity.getSharedViewModel()) == null) {
            return;
        }
        sharedViewModel.M(3, this.fileBeanListLiveData, recoveredNEEEEXActivity);
    }

    /* JADX INFO: renamed from: com.neeeex.eraser.recover.recod.FileRecoveredFragment$a, reason: from kotlin metadata */
    public static final class Companion {
        public /* synthetic */ Companion(m mVar) {
            this();
        }

        public final FileRecoveredFragment a() {
            return new FileRecoveredFragment();
        }

        public Companion() {
        }
    }
}