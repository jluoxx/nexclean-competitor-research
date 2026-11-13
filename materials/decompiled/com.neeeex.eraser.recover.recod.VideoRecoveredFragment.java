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
import com.neeeex.eraser.recover.reco.v.VideoScanNEEEEXActivity;
import com.neeeex.eraser.recover.recod.VideoRecoveredFragment;
import com.thinkup.core.common.nn.m.n;
import com.thinkup.core.q.o;
import fl.h;
import gl.x;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.function.Predicate;
import ji.r0;
import ml.a;
import p003kotlin.Metadata;
import p003kotlin.jvm.functions.Function1;
import p003kotlin.jvm.internal.m;
import p003kotlin.jvm.internal.p;
import p003kotlin.jvm.internal.v;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000p\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 A2\u00020\u0001:\u000336,B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0005\u0010\u0003J\u000f\u0010\u0006\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0006\u0010\u0003J\u000f\u0010\u0007\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\u0003J\u0017\u0010\n\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\f\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\f\u0010\u0003J\u0019\u0010\u000f\u001a\u00020\u00042\b\u0010\u000e\u001a\u0004\u0018\u00010\rH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J-\u0010\u0016\u001a\u0004\u0018\u00010\u00152\u0006\u0010\u0012\u001a\u00020\u00112\b\u0010\u0014\u001a\u0004\u0018\u00010\u00132\b\u0010\u000e\u001a\u0004\u0018\u00010\rH\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0018\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0018\u0010\u0003J\u0013\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u001a0\u0019¢\u0006\u0004\b\u001b\u0010\u001cJ\r\u0010\u001d\u001a\u00020\u0004¢\u0006\u0004\b\u001d\u0010\u0003J\r\u0010\u001e\u001a\u00020\u0004¢\u0006\u0004\b\u001e\u0010\u0003J\r\u0010\u001f\u001a\u00020\u0004¢\u0006\u0004\b\u001f\u0010\u0003J\u0015\u0010\"\u001a\u00020\u00042\u0006\u0010!\u001a\u00020 ¢\u0006\u0004\b\"\u0010#J\u000f\u0010$\u001a\u00020\u0004H\u0003¢\u0006\u0004\b$\u0010\u0003J%\u0010(\u001a\u00020\u00042\f\u0010%\u001a\b\u0012\u0004\u0012\u00020 0\u00192\u0006\u0010'\u001a\u00020&H\u0002¢\u0006\u0004\b(\u0010)R.\u00102\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001a0+0*8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b,\u0010-\u001a\u0004\b.\u0010/\"\u0004\b0\u00101R\u001c\u00105\u001a\b\u0012\u0004\u0012\u00020\u001a0+8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b3\u00104R\u0016\u00108\u001a\u00020&8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b6\u00107R\u0018\u0010<\u001a\u0004\u0018\u0001098\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b:\u0010;R\u0018\u0010@\u001a\u0004\u0018\u00010=8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b>\u0010?¨\u0006B"}, d2 = {"Lcom/neeeex/eraser/recover/recod/VideoRecoveredFragment;", "Landroidx/fragment/app/Fragment;", "<init>", "()V", "Lfl/m0;", "l", "p", "t", "Landroid/content/Context;", "context", "onAttach", "(Landroid/content/Context;)V", "onStart", "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "(Landroid/os/Bundle;)V", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "Landroid/view/View;", "onCreateView", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;", "onDestroyView", "", "Lii/c;", o.f74114d, "()Ljava/util/List;", n.f72065d, "m", "q", "", MBridgeConstans.DYNAMIC_VIEW_WX_PATH, CampaignEx.JSON_KEY_AD_R, "(Ljava/lang/String;)V", "v", "paths", "Lcom/neeeex/eraser/recover/recod/VideoRecoveredFragment$b;", "removal", "u", "(Ljava/util/List;Lcom/neeeex/eraser/recover/recod/VideoRecoveredFragment$b;)V", "Landroidx/lifecycle/MutableLiveData;", "Ljava/util/concurrent/CopyOnWriteArrayList;", "a", "Landroidx/lifecycle/MutableLiveData;", "getFileBeanListLiveData", "()Landroidx/lifecycle/MutableLiveData;", "setFileBeanListLiveData", "(Landroidx/lifecycle/MutableLiveData;)V", "fileBeanListLiveData", DownloadCommon.DOWNLOAD_REPORT_FIND_FILE_RESULT_VALUE_B, "Ljava/util/concurrent/CopyOnWriteArrayList;", "recoveredVideos", "c", "Lcom/neeeex/eraser/recover/recod/VideoRecoveredFragment$b;", "pendingRemoval", "Lcom/neeeex/eraser/recover/reco/v/e;", "d", "Lcom/neeeex/eraser/recover/reco/v/e;", "videoAdapter", "Lji/r0;", "e", "Lji/r0;", "viewRef", "f", "tool-feature_productionRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class VideoRecoveredFragment extends Fragment {

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    public MutableLiveData fileBeanListLiveData = new MutableLiveData();

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    public CopyOnWriteArrayList recoveredVideos = new CopyOnWriteArrayList();

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    public b pendingRemoval = b.C0803b.f66117a;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    public com.neeeex.eraser.recover.reco.v.e videoAdapter;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    public r0 viewRef;

    public enum c {
        EMPTY,
        GRID;


        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ a f66120b = ml.b.a(d());

        public static a getEntries() {
            return f66120b;
        }
    }

    public static final /* synthetic */ class d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f66121a;

        static {
            int[] iArr = new int[c.values().length];
            try {
                iArr[c.EMPTY.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[c.GRID.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f66121a = iArr;
        }
    }

    public static final class g implements Observer, p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Function1 f66122a;

        public g(Function1 function1) {
            m0.a("OngMZqCPNqc=\n", "XA1iBdTmWck=\n");
            function1.getClass();
            this.f66122a = function1;
        }

        public final boolean equals(Object obj) {
            if ((obj instanceof Observer) && (obj instanceof p)) {
                return v.c(getFunctionDelegate(), ((p) obj).getFunctionDelegate());
            }
            return false;
        }

        @Override // p003kotlin.jvm.internal.p
        public final h getFunctionDelegate() {
            return this.f66122a;
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }

        @Override // androidx.p002lifecycle.Observer
        public final /* synthetic */ void onChanged(Object obj) {
            this.f66122a.invoke(obj);
        }
    }

    public static boolean c(b bVar, ii.c cVar) {
        m0.a("ZokHQPU=\n", "EOBjJZoeMO0=\n");
        cVar.getClass();
        return v.c(cVar.h(), ((b.c) bVar).a());
    }

    public static void d() {
    }

    public static fl.m0 f(VideoRecoveredFragment videoRecoveredFragment, String str) {
        CopyOnWriteArrayList copyOnWriteArrayList = videoRecoveredFragment.recoveredVideos;
        if (copyOnWriteArrayList == null || !copyOnWriteArrayList.isEmpty()) {
            Iterator it = copyOnWriteArrayList.iterator();
            while (it.hasNext()) {
                if (v.c(((ii.c) it.next()).h(), str)) {
                    str.getClass();
                    videoRecoveredFragment.r(str);
                    break;
                }
            }
        }
        return fl.m0.f80959a;
    }

    public static boolean g(Function1 function1, Object obj) {
        return ((Boolean) function1.invoke(obj)).booleanValue();
    }

    public static fl.m0 h(VideoRecoveredFragment videoRecoveredFragment, CopyOnWriteArrayList copyOnWriteArrayList) {
        copyOnWriteArrayList.getClass();
        videoRecoveredFragment.recoveredVideos = copyOnWriteArrayList;
        videoRecoveredFragment.t();
        return fl.m0.f80959a;
    }

    public static fl.m0 i(VideoRecoveredFragment videoRecoveredFragment, Boolean bool) {
        if (videoRecoveredFragment.pendingRemoval != b.C0803b.f66117a) {
            videoRecoveredFragment.m();
        }
        return fl.m0.f80959a;
    }

    public static boolean j(Function1 function1, ii.c cVar) {
        cVar.getClass();
        return ((Boolean) function1.invoke(cVar)).booleanValue();
    }

    public static void k(VideoRecoveredFragment videoRecoveredFragment, View view) {
        Context context = videoRecoveredFragment.getContext();
        if (context != null) {
            VideoScanNEEEEXActivity.INSTANCE.a(context);
        }
    }

    private final void l() {
        AppCompatTextView appCompatTextView;
        r0 r0Var = this.viewRef;
        if (r0Var == null || (appCompatTextView = r0Var.f85660b) == null) {
            return;
        }
        appCompatTextView.setOnClickListener(new View.OnClickListener() { // from class: si.z
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                VideoRecoveredFragment.k(this.f98418a, view);
            }
        });
    }

    private final void p() {
        MutableLiveData mutableLiveDataD;
        MutableLiveData mutableLiveDataA;
        this.fileBeanListLiveData.observe(getViewLifecycleOwner(), new g(new Function1() { // from class: si.w
            @Override // p003kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return VideoRecoveredFragment.h(this.f98415a, (CopyOnWriteArrayList) obj);
            }
        }));
        FragmentActivity activity = getActivity();
        RecoveredNEEEEXActivity recoveredNEEEEXActivity = activity instanceof RecoveredNEEEEXActivity ? (RecoveredNEEEEXActivity) activity : null;
        h0 sharedViewModel = recoveredNEEEEXActivity != null ? recoveredNEEEEXActivity.getSharedViewModel() : null;
        if (sharedViewModel != null && (mutableLiveDataA = sharedViewModel.A()) != null) {
            LifecycleOwner viewLifecycleOwner = getViewLifecycleOwner();
            m0.a("BSdFJxaGcjYLJFQSBoBpHy01XxQNyytUTGs=\n", "YkIxcX/jBXo=\n");
            viewLifecycleOwner.getClass();
            ti.h.g(mutableLiveDataA, viewLifecycleOwner, false, false, new Function1() { // from class: si.x
                @Override // p003kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return VideoRecoveredFragment.i(this.f98416a, (Boolean) obj);
                }
            }, 4, null);
        }
        if (sharedViewModel == null || (mutableLiveDataD = sharedViewModel.D()) == null) {
            return;
        }
        ti.h.g(mutableLiveDataD, this, false, false, new Function1() { // from class: si.y
            @Override // p003kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return VideoRecoveredFragment.f(this.f98417a, (String) obj);
            }
        }, 4, null);
    }

    public static final void s(VideoRecoveredFragment videoRecoveredFragment, List list) {
        List list2 = list;
        ArrayList arrayList = new ArrayList(x.x(list2, 10));
        Iterator it = list2.iterator();
        while (it.hasNext()) {
            arrayList.add(((ii.c) it.next()).h());
        }
        videoRecoveredFragment.u(arrayList, b.a.f66116a);
    }

    private final void t() {
        r0 r0Var = this.viewRef;
        if (r0Var == null) {
            return;
        }
        int i10 = d.f66121a[(this.recoveredVideos.isEmpty() ? c.EMPTY : c.GRID).ordinal()];
        if (i10 == 1) {
            r0Var.f85662d.setVisibility(0);
            r0Var.f85663e.setVisibility(8);
        } else {
            if (i10 != 2) {
                j.a();
                return;
            }
            r0Var.f85662d.setVisibility(8);
            r0Var.f85663e.setVisibility(0);
            r0Var.f85663e.setHasFixedSize(true);
            r0Var.f85663e.setLayoutManager(new GridLayoutManager(getContext(), 3));
            com.neeeex.eraser.recover.reco.v.e eVar = new com.neeeex.eraser.recover.reco.v.e(this.recoveredVideos, true, new com.neeeex.eraser.recover.reco.v.e.c() { // from class: si.e0
                @Override // com.neeeex.eraser.recover.reco.v.e.c
                public final void a() {
                    VideoRecoveredFragment.d();
                }
            });
            this.videoAdapter = eVar;
            r0Var.f85663e.setAdapter(eVar);
        }
    }

    public final void m() {
        final Function1 function1;
        final b bVar = this.pendingRemoval;
        if (bVar instanceof b.c) {
            function1 = new Function1() { // from class: si.a0
                @Override // p003kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return Boolean.valueOf(VideoRecoveredFragment.c(bVar, (ii.c) obj));
                }
            };
        } else if (v.c(bVar, b.a.f66116a)) {
            function1 = new p003kotlin.jvm.internal.h0() { // from class: com.neeeex.eraser.recover.recod.VideoRecoveredFragment.e
                {
                    m0.a("TDVZ7fD8Jdg=\n", "P1A1iJOIQLw=\n");
                    m0.a("ptIvoNFFpUq10j/bnXM=\n", "wbdb87QpwCk=\n");
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
        } else {
            if (!v.c(bVar, b.C0803b.f66117a)) {
                j.a();
                return;
            }
            function1 = new p003kotlin.jvm.internal.h0() { // from class: com.neeeex.eraser.recover.recod.VideoRecoveredFragment.f
                {
                    m0.a("M6zgPK9SHuA=\n", "QMmMWcwme4Q=\n");
                    m0.a("DLsbXU69+RsfuwsmAos=\n", "a95vDivRnHg=\n");
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
        CopyOnWriteArrayList copyOnWriteArrayList = this.recoveredVideos;
        final Function1 function2 = new Function1() { // from class: si.b0
            @Override // p003kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return Boolean.valueOf(VideoRecoveredFragment.j(function1, (ii.c) obj));
            }
        };
        copyOnWriteArrayList.removeIf(new Predicate() { // from class: si.c0
            @Override // java.util.function.Predicate
            public final boolean test(Object obj) {
                return VideoRecoveredFragment.g(function2, obj);
            }
        });
        this.pendingRemoval = b.C0803b.f66117a;
        com.neeeex.eraser.recover.reco.v.e eVar = this.videoAdapter;
        if (eVar != null) {
            eVar.notifyDataSetChanged();
        }
        t();
        Toast.makeText(getContext(), R$string.toast_neeeex_delete, 0).show();
    }

    public final void n() {
        Iterator it = this.recoveredVideos.iterator();
        while (it.hasNext()) {
            ((ii.c) it.next()).m(false);
        }
        com.neeeex.eraser.recover.reco.v.e eVar = this.videoAdapter;
        if (eVar != null) {
            eVar.notifyDataSetChanged();
        }
    }

    public final List o() {
        CopyOnWriteArrayList copyOnWriteArrayList = this.recoveredVideos;
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
        m0.a("Vlh7kzpsGA==\n", "NTcV518UbC4=\n");
        context.getClass();
        super.onAttach(context);
    }

    @Override // androidx.fragment.app.Fragment
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        m0.a("+HcrORJh47Q=\n", "kRlNVXMVhsY=\n");
        inflater.getClass();
        this.viewRef = r0.c(inflater, container, false);
        l();
        p();
        v();
        r0 r0Var = this.viewRef;
        if (r0Var != null) {
            return r0Var.getRoot();
        }
        return null;
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroyView() {
        super.onDestroyView();
        this.viewRef = null;
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
        deleteTipDialogA.m(new ki.a() { // from class: si.d0
            @Override // ki.a
            public final void a() {
                VideoRecoveredFragment.s(this.f98397a, listO);
            }
        });
        l0 childFragmentManager = getChildFragmentManager();
        m0.a("pW8uLVJv9wGEeDsJV2P1EY9rNA9dY+lN7CR0Rw==\n", "wgpabjoGm2U=\n");
        childFragmentManager.getClass();
        deleteTipDialogA.i(childFragmentManager);
    }

    public final void r(String path) {
        m0.a("Hs3/JA==\n", "bqyLTM3UMbs=\n");
        path.getClass();
        u(gl.v.e(path), new b.c(path));
    }

    public final void u(List paths, b removal) {
        h0 sharedViewModel;
        FragmentActivity activity = getActivity();
        RecoveredNEEEEXActivity recoveredNEEEEXActivity = activity instanceof RecoveredNEEEEXActivity ? (RecoveredNEEEEXActivity) activity : null;
        if (recoveredNEEEEXActivity == null || (sharedViewModel = recoveredNEEEEXActivity.getSharedViewModel()) == null) {
            return;
        }
        if (com.neeeex.eraser.module.report.bytedance.a.k()) {
            BaseAdActivity.showInter$default(recoveredNEEEEXActivity, m0.a("LCLga4X5yrQw\n", "fnS/L8C1lf0=\n"), null, 2, null);
        }
        this.pendingRemoval = removal;
        sharedViewModel.x(recoveredNEEEEXActivity, paths, true);
    }

    public final void v() {
        h0 sharedViewModel;
        FragmentActivity activity = getActivity();
        RecoveredNEEEEXActivity recoveredNEEEEXActivity = activity instanceof RecoveredNEEEEXActivity ? (RecoveredNEEEEXActivity) activity : null;
        if (recoveredNEEEEXActivity == null || (sharedViewModel = recoveredNEEEEXActivity.getSharedViewModel()) == null) {
            return;
        }
        sharedViewModel.M(0, this.fileBeanListLiveData, recoveredNEEEEXActivity);
    }

    /* JADX INFO: renamed from: com.neeeex.eraser.recover.recod.VideoRecoveredFragment$a, reason: from kotlin metadata */
    public static final class Companion {
        public /* synthetic */ Companion(m mVar) {
            this();
        }

        public final VideoRecoveredFragment a() {
            return new VideoRecoveredFragment();
        }

        public Companion() {
        }
    }

    public static abstract class b {

        public static final class a extends b {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final a f66116a = new a();

            public a() {
                super(null);
            }

            public boolean equals(Object obj) {
                return this == obj || (obj instanceof a);
            }

            public int hashCode() {
                return -698236321;
            }

            public String toString() {
                return m0.a("G7duNT15jBU3qHg=\n", "WN8LVlYc6Ec=\n");
            }
        }

        /* JADX INFO: renamed from: com.neeeex.eraser.recover.recod.VideoRecoveredFragment$b$b, reason: collision with other inner class name */
        public static final class C0803b extends b {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final C0803b f66117a = new C0803b();

            public C0803b() {
                super(null);
            }

            public boolean equals(Object obj) {
                return this == obj || (obj instanceof C0803b);
            }

            public int hashCode() {
                return 1505017817;
            }

            public String toString() {
                return m0.a("3xCRHg==\n", "kX//e0E5OjI=\n");
            }
        }

        public static final class c extends b {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final String f66118a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public c(String str) {
                super(null);
                m0.a("2T4ooRQ=\n", "r19E1HHiKmI=\n");
                str.getClass();
                this.f66118a = str;
            }

            public final String a() {
                return this.f66118a;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof c) && v.c(this.f66118a, ((c) obj).f66118a);
            }

            public int hashCode() {
                return this.f66118a.hashCode();
            }

            public String toString() {
                return "Path(value=" + this.f66118a + ")";
            }
        }

        public /* synthetic */ b(m mVar) {
            this();
        }

        public b() {
        }
    }
}