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
import androidx.recyclerview.widget.GridLayoutManager;
import coil.util.j;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.foundation.download.core.DownloadCommon;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.neeeex.eraser.R$string;
import com.neeeex.eraser.base.BaseAdActivity;
import com.neeeex.eraser.h0;
import com.neeeex.eraser.m0;
import com.neeeex.eraser.module.dialog.DeleteTipDialog;
import com.neeeex.eraser.recover.reco.p.PhotoScanNEEEEXActivity;
import com.neeeex.eraser.recover.recod.PhotoRecoveredFragment;
import com.thinkup.core.common.nn.m.n;
import com.thinkup.core.q.o;
import fl.h;
import gl.x;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.function.Predicate;
import ji.q0;
import ki.a;
import p003kotlin.Metadata;
import p003kotlin.jvm.functions.Function1;
import p003kotlin.jvm.internal.m;
import p003kotlin.jvm.internal.p;
import p003kotlin.jvm.internal.v;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0086\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 G2\u00020\u0001:\u0004<@81B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0005\u0010\u0003J\u000f\u0010\u0006\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0006\u0010\u0003J\u000f\u0010\u0007\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\u0003J\u0017\u0010\n\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\f\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\f\u0010\u0003J\u0019\u0010\u000f\u001a\u00020\u00042\b\u0010\u000e\u001a\u0004\u0018\u00010\rH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J-\u0010\u0016\u001a\u0004\u0018\u00010\u00152\u0006\u0010\u0012\u001a\u00020\u00112\b\u0010\u0014\u001a\u0004\u0018\u00010\u00132\b\u0010\u000e\u001a\u0004\u0018\u00010\rH\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0018\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0018\u0010\u0003J\u0013\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u001a0\u0019¢\u0006\u0004\b\u001b\u0010\u001cJ\r\u0010\u001d\u001a\u00020\u0004¢\u0006\u0004\b\u001d\u0010\u0003J\r\u0010\u001e\u001a\u00020\u0004¢\u0006\u0004\b\u001e\u0010\u0003J\r\u0010\u001f\u001a\u00020\u0004¢\u0006\u0004\b\u001f\u0010\u0003J\u0015\u0010\"\u001a\u00020\u00042\u0006\u0010!\u001a\u00020 ¢\u0006\u0004\b\"\u0010#J\u000f\u0010$\u001a\u00020\u0004H\u0003¢\u0006\u0004\b$\u0010\u0003J\u001b\u0010(\u001a\u00020'*\u00020%2\u0006\u0010&\u001a\u00020%H\u0002¢\u0006\u0004\b(\u0010)J%\u0010-\u001a\u00020\u00042\f\u0010*\u001a\b\u0012\u0004\u0012\u00020 0\u00192\u0006\u0010,\u001a\u00020+H\u0002¢\u0006\u0004\b-\u0010.R.\u00107\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001a000/8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b1\u00102\u001a\u0004\b3\u00104\"\u0004\b5\u00106R\u001c\u0010:\u001a\b\u0012\u0004\u0012\u00020\u001a008\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b8\u00109R\u0016\u0010>\u001a\u00020;8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b<\u0010=R\u0018\u0010B\u001a\u0004\u0018\u00010?8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b@\u0010AR\u0018\u0010F\u001a\u0004\u0018\u00010C8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bD\u0010E¨\u0006H"}, d2 = {"Lcom/neeeex/eraser/recover/recod/PhotoRecoveredFragment;", "Landroidx/fragment/app/Fragment;", "<init>", "()V", "Lfl/m0;", "l", "p", "t", "Landroid/content/Context;", "context", "onAttach", "(Landroid/content/Context;)V", "onStart", "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "(Landroid/os/Bundle;)V", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "Landroid/view/View;", "onCreateView", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;", "onDestroyView", "", "Lii/c;", o.f74114d, "()Ljava/util/List;", n.f72065d, "m", "q", "", MBridgeConstans.DYNAMIC_VIEW_WX_PATH, CampaignEx.JSON_KEY_AD_R, "(Ljava/lang/String;)V", "v", "", "expected", "", "w", "(ZZ)I", "paths", "Lcom/neeeex/eraser/recover/recod/PhotoRecoveredFragment$d;", "target", "u", "(Ljava/util/List;Lcom/neeeex/eraser/recover/recod/PhotoRecoveredFragment$d;)V", "Landroidx/lifecycle/MutableLiveData;", "Ljava/util/concurrent/CopyOnWriteArrayList;", "a", "Landroidx/lifecycle/MutableLiveData;", "getFileBeanListLiveData", "()Landroidx/lifecycle/MutableLiveData;", "setFileBeanListLiveData", "(Landroidx/lifecycle/MutableLiveData;)V", "fileBeanListLiveData", DownloadCommon.DOWNLOAD_REPORT_FIND_FILE_RESULT_VALUE_B, "Ljava/util/concurrent/CopyOnWriteArrayList;", "recoveredPhotos", "Lcom/neeeex/eraser/recover/recod/PhotoRecoveredFragment$c;", "c", "Lcom/neeeex/eraser/recover/recod/PhotoRecoveredFragment$c;", "deletionState", "Lcom/neeeex/eraser/recover/reco/p/e;", "d", "Lcom/neeeex/eraser/recover/reco/p/e;", "photoAdapter", "Lji/q0;", "e", "Lji/q0;", "vb", "f", "tool-feature_productionRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class PhotoRecoveredFragment extends Fragment {

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    public MutableLiveData fileBeanListLiveData = new MutableLiveData();

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    public CopyOnWriteArrayList recoveredPhotos = new CopyOnWriteArrayList();

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    public c deletionState = c.a.f66095a;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    public com.neeeex.eraser.recover.reco.p.e photoAdapter;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    public q0 vb;

    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final boolean f66093a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final List f66094b;

        public b(boolean z10, List list) {
            m0.a("Ru8Oo28=\n", "IIZixhwjB/w=\n");
            list.getClass();
            this.f66093a = z10;
            this.f66094b = list;
        }

        public final List a() {
            return this.f66094b;
        }

        public final boolean b() {
            return this.f66093a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return this.f66093a == bVar.f66093a && v.c(this.f66094b, bVar.f66094b);
        }

        public int hashCode() {
            return (Boolean.hashCode(this.f66093a) * 31) + this.f66094b.hashCode();
        }

        public String toString() {
            return "ContentState(hasContent=" + this.f66093a + ", files=" + this.f66094b + ")";
        }
    }

    public interface c {

        public static final class a implements c {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final a f66095a = new a();

            public boolean equals(Object obj) {
                return this == obj || (obj instanceof a);
            }

            public int hashCode() {
                return -801692082;
            }

            public String toString() {
                return m0.a("sThmdA==\n", "+FwKEVpArOU=\n");
            }
        }

        public static final class b implements c {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final d f66096a;

            public b(d dVar) {
                m0.a("9EfO0ey5\n", "gCa8tonNxUA=\n");
                dVar.getClass();
                this.f66096a = dVar;
            }

            public final d a() {
                return this.f66096a;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof b) && v.c(this.f66096a, ((b) obj).f66096a);
            }

            public int hashCode() {
                return this.f66096a.hashCode();
            }

            public String toString() {
                return "Waiting(target=" + this.f66096a + ")";
            }
        }
    }

    public interface d {

        public static final class a implements d {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final String f66097a;

            public a(String str) {
                m0.a("ZonUVA==\n", "FuigPKGWQmg=\n");
                str.getClass();
                this.f66097a = str;
            }

            public final String a() {
                return this.f66097a;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof a) && v.c(this.f66097a, ((a) obj).f66097a);
            }

            public int hashCode() {
                return this.f66097a.hashCode();
            }

            public String toString() {
                return "One(path=" + this.f66097a + ")";
            }
        }

        public static final class b implements d {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final b f66098a = new b();

            public boolean equals(Object obj) {
                return this == obj || (obj instanceof b);
            }

            public int hashCode() {
                return -228152898;
            }

            public String toString() {
                return m0.a("tyhmaFdY76CK\n", "5E0KDTQshs8=\n");
            }
        }
    }

    public static final class f implements Observer, p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Function1 f66099a;

        public f(Function1 function1) {
            m0.a("XJA+SYp5tvA=\n", "OuVQKv4Q2Z4=\n");
            function1.getClass();
            this.f66099a = function1;
        }

        public final boolean equals(Object obj) {
            if ((obj instanceof Observer) && (obj instanceof p)) {
                return v.c(getFunctionDelegate(), ((p) obj).getFunctionDelegate());
            }
            return false;
        }

        @Override // p003kotlin.jvm.internal.p
        public final h getFunctionDelegate() {
            return this.f66099a;
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }

        @Override // androidx.p002lifecycle.Observer
        public final /* synthetic */ void onChanged(Object obj) {
            this.f66099a.invoke(obj);
        }
    }

    public static fl.m0 c(PhotoRecoveredFragment photoRecoveredFragment, String str) {
        CopyOnWriteArrayList copyOnWriteArrayList = photoRecoveredFragment.recoveredPhotos;
        if (copyOnWriteArrayList == null || !copyOnWriteArrayList.isEmpty()) {
            Iterator it = copyOnWriteArrayList.iterator();
            while (it.hasNext()) {
                if (v.c(((ii.c) it.next()).h(), str)) {
                    str.getClass();
                    photoRecoveredFragment.r(str);
                    break;
                }
            }
        }
        return fl.m0.f80959a;
    }

    public static void d() {
    }

    public static boolean e(Function1 function1, Object obj) {
        return ((Boolean) function1.invoke(obj)).booleanValue();
    }

    public static boolean f(Function1 function1, ii.c cVar) {
        cVar.getClass();
        return ((Boolean) function1.invoke(cVar)).booleanValue();
    }

    public static void g(PhotoRecoveredFragment photoRecoveredFragment, View view) {
        Context context = photoRecoveredFragment.getContext();
        if (context != null) {
            PhotoScanNEEEEXActivity.INSTANCE.a(context);
        }
    }

    public static fl.m0 i(PhotoRecoveredFragment photoRecoveredFragment, Boolean bool) {
        if (photoRecoveredFragment.deletionState instanceof c.b) {
            photoRecoveredFragment.m();
        }
        return fl.m0.f80959a;
    }

    public static fl.m0 j(PhotoRecoveredFragment photoRecoveredFragment, CopyOnWriteArrayList copyOnWriteArrayList) {
        copyOnWriteArrayList.getClass();
        photoRecoveredFragment.recoveredPhotos = copyOnWriteArrayList;
        photoRecoveredFragment.t();
        return fl.m0.f80959a;
    }

    public static boolean k(d dVar, ii.c cVar) {
        m0.a("1awioGM=\n", "pcRN1AwDZsU=\n");
        cVar.getClass();
        return v.c(cVar.h(), ((d.a) dVar).a());
    }

    private final void l() {
        AppCompatTextView appCompatTextView;
        q0 q0Var = this.vb;
        if (q0Var == null || (appCompatTextView = q0Var.f85648b) == null) {
            return;
        }
        appCompatTextView.setOnClickListener(new View.OnClickListener() { // from class: si.n
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                PhotoRecoveredFragment.g(this.f98407a, view);
            }
        });
    }

    private final void p() {
        MutableLiveData mutableLiveDataD;
        MutableLiveData mutableLiveDataA;
        this.fileBeanListLiveData.observe(getViewLifecycleOwner(), new f(new Function1() { // from class: si.k
            @Override // p003kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return PhotoRecoveredFragment.j(this.f98404a, (CopyOnWriteArrayList) obj);
            }
        }));
        FragmentActivity activity = getActivity();
        RecoveredNEEEEXActivity recoveredNEEEEXActivity = activity instanceof RecoveredNEEEEXActivity ? (RecoveredNEEEEXActivity) activity : null;
        h0 sharedViewModel = recoveredNEEEEXActivity != null ? recoveredNEEEEXActivity.getSharedViewModel() : null;
        if (sharedViewModel != null && (mutableLiveDataA = sharedViewModel.A()) != null) {
            LifecycleOwner viewLifecycleOwner = getViewLifecycleOwner();
            m0.a("ZDF/KagBzn9qMm4cuAfVVkwjZRqzTJcdLX0=\n", "A1QLf8FkuTM=\n");
            viewLifecycleOwner.getClass();
            ti.h.g(mutableLiveDataA, viewLifecycleOwner, false, false, new Function1() { // from class: si.l
                @Override // p003kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return PhotoRecoveredFragment.i(this.f98405a, (Boolean) obj);
                }
            }, 4, null);
        }
        if (sharedViewModel == null || (mutableLiveDataD = sharedViewModel.D()) == null) {
            return;
        }
        ti.h.g(mutableLiveDataD, this, false, false, new Function1() { // from class: si.m
            @Override // p003kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return PhotoRecoveredFragment.c(this.f98406a, (String) obj);
            }
        }, 4, null);
    }

    public static final void s(PhotoRecoveredFragment photoRecoveredFragment, List list) {
        List list2 = list;
        ArrayList arrayList = new ArrayList(x.x(list2, 10));
        Iterator it = list2.iterator();
        while (it.hasNext()) {
            arrayList.add(((ii.c) it.next()).h());
        }
        photoRecoveredFragment.u(arrayList, d.b.f66098a);
    }

    private final void t() {
        q0 q0Var = this.vb;
        if (q0Var == null) {
            return;
        }
        b bVar = new b(!this.recoveredPhotos.isEmpty(), this.recoveredPhotos);
        q0Var.f85650d.setVisibility(w(bVar.b(), false));
        q0Var.f85651e.setVisibility(w(bVar.b(), true));
        if (bVar.b()) {
            q0Var.f85651e.setHasFixedSize(true);
            q0Var.f85651e.setLayoutManager(new GridLayoutManager(getContext(), 3));
            com.neeeex.eraser.recover.reco.p.e eVar = new com.neeeex.eraser.recover.reco.p.e(bVar.a(), true, new com.neeeex.eraser.recover.reco.p.e.c() { // from class: si.o
                @Override // com.neeeex.eraser.recover.reco.p.e.c
                public final void a() {
                    PhotoRecoveredFragment.d();
                }
            });
            this.photoAdapter = eVar;
            q0Var.f85651e.setAdapter(eVar);
        }
    }

    public final void m() {
        final d dVarA;
        final Function1 function1;
        c cVar = this.deletionState;
        c.b bVar = cVar instanceof c.b ? (c.b) cVar : null;
        if (bVar == null || (dVarA = bVar.a()) == null) {
            dVarA = d.b.f66098a;
        }
        if (dVarA instanceof d.a) {
            function1 = new Function1() { // from class: si.q
                @Override // p003kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return Boolean.valueOf(PhotoRecoveredFragment.k(dVarA, (ii.c) obj));
                }
            };
        } else {
            if (!v.c(dVarA, d.b.f66098a)) {
                j.a();
                return;
            }
            function1 = new p003kotlin.jvm.internal.h0() { // from class: com.neeeex.eraser.recover.recod.PhotoRecoveredFragment.e
                {
                    m0.a("YNy/L/HaueE=\n", "E7nTSpKu3IU=\n");
                    m0.a("Z9UXZgLxUah01QcdTsc=\n", "ALBjNWedNMs=\n");
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
        CopyOnWriteArrayList copyOnWriteArrayList = this.recoveredPhotos;
        final Function1 function2 = new Function1() { // from class: si.r
            @Override // p003kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return Boolean.valueOf(PhotoRecoveredFragment.f(function1, (ii.c) obj));
            }
        };
        copyOnWriteArrayList.removeIf(new Predicate() { // from class: si.s
            @Override // java.util.function.Predicate
            public final boolean test(Object obj) {
                return PhotoRecoveredFragment.e(function2, obj);
            }
        });
        this.deletionState = c.a.f66095a;
        com.neeeex.eraser.recover.reco.p.e eVar = this.photoAdapter;
        if (eVar != null) {
            eVar.notifyDataSetChanged();
        }
        t();
        Toast.makeText(getContext(), R$string.toast_neeeex_delete, 0).show();
    }

    public final void n() {
        Iterator it = this.recoveredPhotos.iterator();
        while (it.hasNext()) {
            ((ii.c) it.next()).m(false);
        }
        com.neeeex.eraser.recover.reco.p.e eVar = this.photoAdapter;
        if (eVar != null) {
            eVar.notifyDataSetChanged();
        }
    }

    public final List o() {
        CopyOnWriteArrayList copyOnWriteArrayList = this.recoveredPhotos;
        ArrayList arrayList = new ArrayList();
        for (Object obj : copyOnWriteArrayList) {
            if (((ii.c) obj).i()) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    @Override // androidx.fragment.app.Fragment
    public void onAttach(Context context) {
        m0.a("o99B3Knsag==\n", "wLAvqMyUHq4=\n");
        context.getClass();
        super.onAttach(context);
    }

    @Override // androidx.fragment.app.Fragment
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        m0.a("6JTOHiKUxnU=\n", "gfqockPgowc=\n");
        inflater.getClass();
        this.vb = q0.c(inflater, container, false);
        l();
        p();
        v();
        q0 q0Var = this.vb;
        if (q0Var != null) {
            return q0Var.getRoot();
        }
        return null;
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroyView() {
        super.onDestroyView();
        this.vb = null;
    }

    @Override // androidx.fragment.app.Fragment
    public void onStart() {
        super.onStart();
    }

    public final void q() {
        final List listO = o();
        if (listO.isEmpty()) {
            Toast.makeText(getContext(), R$string.toast_neeeex_select_one, 1).show();
            return;
        }
        DeleteTipDialog deleteTipDialogA = DeleteTipDialog.INSTANCE.a();
        deleteTipDialogA.m(new a() { // from class: si.p
            @Override // ki.a
            public final void a() {
                PhotoRecoveredFragment.s(this.f98408a, listO);
            }
        });
        l0 childFragmentManager = getChildFragmentManager();
        m0.a("uIxzBjt3hVyZm2YiPnuHTJKIaSQ0e5sQ8ccpbA==\n", "3+kHRVMe6Tg=\n");
        childFragmentManager.getClass();
        deleteTipDialogA.i(childFragmentManager);
    }

    public final void r(String path) {
        m0.a("ge0Tyw==\n", "8Yxno1tpBps=\n");
        path.getClass();
        u(gl.v.e(path), new d.a(path));
    }

    public final void u(List paths, d target) {
        h0 sharedViewModel;
        FragmentActivity activity = getActivity();
        RecoveredNEEEEXActivity recoveredNEEEEXActivity = activity instanceof RecoveredNEEEEXActivity ? (RecoveredNEEEEXActivity) activity : null;
        if (recoveredNEEEEXActivity == null || (sharedViewModel = recoveredNEEEEXActivity.getSharedViewModel()) == null) {
            return;
        }
        if (com.neeeex.eraser.module.report.bytedance.a.k()) {
            BaseAdActivity.showInter$default(recoveredNEEEEXActivity, m0.a("TcFR+SjkdwtR\n", "H5EOvW2oKEI=\n"), null, 2, null);
        }
        this.deletionState = new c.b(target);
        sharedViewModel.x(recoveredNEEEEXActivity, paths, true);
    }

    public final void v() {
        h0 sharedViewModel;
        FragmentActivity activity = getActivity();
        RecoveredNEEEEXActivity recoveredNEEEEXActivity = activity instanceof RecoveredNEEEEXActivity ? (RecoveredNEEEEXActivity) activity : null;
        if (recoveredNEEEEXActivity == null || (sharedViewModel = recoveredNEEEEXActivity.getSharedViewModel()) == null) {
            return;
        }
        sharedViewModel.M(2, this.fileBeanListLiveData, recoveredNEEEEXActivity);
    }

    public final int w(boolean z10, boolean z11) {
        return z10 == z11 ? 0 : 8;
    }

    /* JADX INFO: renamed from: com.neeeex.eraser.recover.recod.PhotoRecoveredFragment$a, reason: from kotlin metadata */
    public static final class Companion {
        public /* synthetic */ Companion(m mVar) {
            this();
        }

        public final PhotoRecoveredFragment a() {
            return new PhotoRecoveredFragment();
        }

        public Companion() {
        }
    }
}