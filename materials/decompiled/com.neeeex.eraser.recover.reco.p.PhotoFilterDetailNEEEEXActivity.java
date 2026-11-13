package com.neeeex.eraser.recover.reco.p;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.Toast;
import androidx.activity.ComponentActivity;
import androidx.p002lifecycle.MutableLiveData;
import androidx.p002lifecycle.ViewModelLazy;
import androidx.p002lifecycle.ViewModelProvider;
import androidx.p002lifecycle.ViewModelStore;
import androidx.p002lifecycle.viewmodel.CreationExtras;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.mbridge.msdk.foundation.download.core.DownloadCommon;
import com.neeeex.eraser.R$layout;
import com.neeeex.eraser.R$string;
import com.neeeex.eraser.base.BaseAdActivity;
import com.neeeex.eraser.module.dialog.DeleteTipDialog;
import com.neeeex.eraser.module.dialog.FilterDialog;
import com.neeeex.eraser.module.dialog.SortDialog;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import p003kotlin.Metadata;
import p003kotlin.jvm.functions.Function0;
import p003kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000r\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u0000 @2\u00020\u0001:\u0003A0BB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0005\u0010\u0003J\u0017\u0010\b\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\b\u0010\tJ\u0011\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\r\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\r\u0010\u0003J\u001d\u0010\u0011\u001a\u00020\u00042\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000eH\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0013\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0013\u0010\u0003J\u000f\u0010\u0014\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0014\u0010\u0003J\u0011\u0010\u0016\u001a\u0004\u0018\u00010\u0015H\u0002¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0018\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0018\u0010\u0003J\u000f\u0010\u0019\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0019\u0010\u0003J\u0017\u0010\u001b\u001a\u00020\u00042\u0006\u0010\u001a\u001a\u00020\nH\u0002¢\u0006\u0004\b\u001b\u0010\u001cJ\u000f\u0010\u001d\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u001d\u0010\u0003J\u001d\u0010!\u001a\u00020\u00042\f\u0010 \u001a\b\u0012\u0004\u0012\u00020\u001f0\u001eH\u0002¢\u0006\u0004\b!\u0010\u0012J%\u0010$\u001a\u00020\u00042\f\u0010 \u001a\b\u0012\u0004\u0012\u00020\u001f0\u001e2\u0006\u0010#\u001a\u00020\"H\u0002¢\u0006\u0004\b$\u0010%J\u0017\u0010(\u001a\u00020\u00042\u0006\u0010'\u001a\u00020&H\u0002¢\u0006\u0004\b(\u0010)J\u000f\u0010*\u001a\u00020\u0004H\u0014¢\u0006\u0004\b*\u0010\u0003J\u0019\u0010-\u001a\u00020\u00042\b\u0010,\u001a\u0004\u0018\u00010+H\u0014¢\u0006\u0004\b-\u0010.R\u001b\u00104\u001a\u00020/8FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b0\u00101\u001a\u0004\b2\u00103R\u0018\u00108\u001a\u0004\u0018\u0001058\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b6\u00107R\u0016\u0010;\u001a\u00020\"8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b9\u0010:R\u0016\u0010?\u001a\u00020<8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b=\u0010>¨\u0006C"}, d2 = {"Lcom/neeeex/eraser/recover/reco/p/PhotoFilterDetailNEEEEXActivity;", "Lcom/neeeex/eraser/base/BaseAdActivity;", "<init>", "()V", "Lfl/m0;", "H0", "Lcom/neeeex/eraser/recover/reco/p/PhotoFilterDetailNEEEEXActivity$b;", "intent", "G0", "(Lcom/neeeex/eraser/recover/reco/p/PhotoFilterDetailNEEEEXActivity$b;)V", "Lcom/neeeex/eraser/recover/reco/p/PhotoFilterDetailNEEEEXActivity$c;", "g1", "()Lcom/neeeex/eraser/recover/reco/p/PhotoFilterDetailNEEEEXActivity$c;", "b1", "", "Lii/c;", "items", "e1", "(Ljava/util/List;)V", "c1", "d1", "Lii/b;", "R0", "()Lii/b;", "W0", "Y0", "batch", "P0", "(Lcom/neeeex/eraser/recover/reco/p/PhotoFilterDetailNEEEEXActivity$c;)V", "V0", "", "", "paths", "S0", "", "expired", "a1", "(Ljava/util/List;I)V", "", "showToast", "U0", "(Z)V", "onDestroy", "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "(Landroid/os/Bundle;)V", "Lcom/neeeex/eraser/recover/reco/p/c0;", "c", "Lfl/n;", "T0", "()Lcom/neeeex/eraser/recover/reco/p/c0;", "viewModel", "Lcom/neeeex/eraser/recover/reco/p/e;", "d", "Lcom/neeeex/eraser/recover/reco/p/e;", "detailAdapter", "e", "I", "selectedFolderIndex", "Lji/m;", "f", "Lji/m;", "binding", "g", DownloadCommon.DOWNLOAD_REPORT_FIND_FILE_RESULT_VALUE_B, "a", "tool-feature_productionRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class PhotoFilterDetailNEEEEXActivity extends BaseAdActivity {

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    public final fl.n viewModel = new ViewModelLazy(p003kotlin.jvm.internal.w0.b(c0.class), new f(this), new e(this), new g(null, this));

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    public com.neeeex.eraser.recover.reco.p.e detailAdapter;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    public int selectedFolderIndex;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    public ji.m binding;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final String f65715h = com.neeeex.eraser.m0.a("jW7oYiGYhL2Nc/loH7eFq4Fi9X8u\n", "6BacEEDH6tg=\n");

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    public interface b {

        public static final class a implements b {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final a f65720a = new a();

            public boolean equals(Object obj) {
                return this == obj || (obj instanceof a);
            }

            public int hashCode() {
                return 210859419;
            }

            public String toString() {
                return com.neeeex.eraser.m0.a("ovfBWg==\n", "4JaiMSzrfWE=\n");
            }
        }

        /* JADX INFO: renamed from: com.neeeex.eraser.recover.reco.p.PhotoFilterDetailNEEEEXActivity$b$b, reason: collision with other inner class name */
        public static final class C0792b implements b {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final C0792b f65721a = new C0792b();

            public boolean equals(Object obj) {
                return this == obj || (obj instanceof C0792b);
            }

            public int hashCode() {
                return 833657183;
            }

            public String toString() {
                return com.neeeex.eraser.m0.a("9kznbQbU\n", "simLCHKxAns=\n");
            }
        }

        public static final class c implements b {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final c f65722a = new c();

            public boolean equals(Object obj) {
                return this == obj || (obj instanceof c);
            }

            public int hashCode() {
                return 894623532;
            }

            public String toString() {
                return com.neeeex.eraser.m0.a("pZDwPT0G\n", "4/mcSVh0yxM=\n");
            }
        }

        public static final class d implements b {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final d f65723a = new d();

            public boolean equals(Object obj) {
                return this == obj || (obj instanceof d);
            }

            public int hashCode() {
                return -394293200;
            }

            public String toString() {
                return com.neeeex.eraser.m0.a("zJs4XvWb6w==\n", "nv5bMYP+mac=\n");
            }
        }

        public static final class e implements b {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final e f65724a = new e();

            public boolean equals(Object obj) {
                return this == obj || (obj instanceof e);
            }

            public int hashCode() {
                return 211379794;
            }

            public String toString() {
                return com.neeeex.eraser.m0.a("wBmjKQ==\n", "k3bRXdNz7AQ=\n");
            }
        }

        public static final class f implements b {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final f f65725a = new f();

            public boolean equals(Object obj) {
                return this == obj || (obj instanceof f);
            }

            public int hashCode() {
                return -1013615239;
            }

            public String toString() {
                return com.neeeex.eraser.m0.a("JWaurhaLUyEd\n", "cQnJyXruEk0=\n");
            }
        }

        public static final class g implements b {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final g f65726a = new g();

            public boolean equals(Object obj) {
                return this == obj || (obj instanceof g);
            }

            public int hashCode() {
                return -976023337;
            }

            public String toString() {
                return com.neeeex.eraser.m0.a("4nlzwr9+wtzXen3Rqg==\n", "thYUpdMbk6k=\n");
            }
        }
    }

    public static final class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final List f65727a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f65728b;

        public c(List list, int i10) {
            com.neeeex.eraser.m0.a("J6n0hD4=\n", "V8iA7E06TqQ=\n");
            list.getClass();
            this.f65727a = list;
            this.f65728b = i10;
        }

        public final int a() {
            return this.f65728b;
        }

        public final List b() {
            return this.f65727a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            return p003kotlin.jvm.internal.v.c(this.f65727a, cVar.f65727a) && this.f65728b == cVar.f65728b;
        }

        public int hashCode() {
            return (this.f65727a.hashCode() * 31) + Integer.hashCode(this.f65728b);
        }

        public String toString() {
            return "SelectedBatch(paths=" + this.f65727a + ", expired=" + this.f65728b + ")";
        }
    }

    public static final class d extends GridLayoutManager.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ List f65729a;

        public d(List list) {
            this.f65729a = list;
        }

        @Override // androidx.recyclerview.widget.GridLayoutManager.d
        public int getSpanSize(int i10) {
            return ((ii.c) this.f65729a.get(i10)).j() ? 3 : 1;
        }
    }

    public static final class e extends p003kotlin.jvm.internal.b0 implements Function0 {
        final /* synthetic */ ComponentActivity $this_viewModels;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(ComponentActivity componentActivity) {
            super(0);
            this.$this_viewModels = componentActivity;
        }

        @Override // p003kotlin.jvm.functions.Function0
        public final ViewModelProvider.Factory invoke() {
            return this.$this_viewModels.getDefaultViewModelProviderFactory();
        }
    }

    public static final class f extends p003kotlin.jvm.internal.b0 implements Function0 {
        final /* synthetic */ ComponentActivity $this_viewModels;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(ComponentActivity componentActivity) {
            super(0);
            this.$this_viewModels = componentActivity;
        }

        @Override // p003kotlin.jvm.functions.Function0
        public final ViewModelStore invoke() {
            return this.$this_viewModels.getViewModelStore();
        }
    }

    public static final class g extends p003kotlin.jvm.internal.b0 implements Function0 {
        final /* synthetic */ Function0 $extrasProducer;
        final /* synthetic */ ComponentActivity $this_viewModels;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(Function0 function0, ComponentActivity componentActivity) {
            super(0);
            this.$extrasProducer = function0;
            this.$this_viewModels = componentActivity;
        }

        @Override // p003kotlin.jvm.functions.Function0
        public final CreationExtras invoke() {
            CreationExtras creationExtras;
            Function0 function0 = this.$extrasProducer;
            return (function0 == null || (creationExtras = (CreationExtras) function0.invoke()) == null) ? this.$this_viewModels.getDefaultViewModelCreationExtras() : creationExtras;
        }
    }

    public static fl.m0 D0(PhotoFilterDetailNEEEEXActivity photoFilterDetailNEEEEXActivity, boolean z10, Boolean bool) {
        photoFilterDetailNEEEEXActivity.d1();
        if (z10) {
            Toast.makeText(photoFilterDetailNEEEEXActivity, R$string.toast_neeeex_delete, 0).show();
        }
        return fl.m0.f80959a;
    }

    private final void H0() {
        ji.m mVar = this.binding;
        if (mVar == null) {
            p003kotlin.jvm.internal.v.n(com.neeeex.eraser.m0.a("HdXklLxPYw==\n", "f7yK8NUhBLQ=\n"));
            mVar = null;
        }
        mVar.f85565f.setOnClickListener(new View.OnClickListener() { // from class: com.neeeex.eraser.recover.reco.p.h
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                PhotoFilterDetailNEEEEXActivity.I0(this.f65848a, view);
            }
        });
        mVar.f85570k.setOnClickListener(new View.OnClickListener() { // from class: com.neeeex.eraser.recover.reco.p.m
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                PhotoFilterDetailNEEEEXActivity.J0(this.f65862a, view);
            }
        });
        mVar.f85562c.setOnClickListener(new View.OnClickListener() { // from class: com.neeeex.eraser.recover.reco.p.n
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                PhotoFilterDetailNEEEEXActivity.K0(this.f65864a, view);
            }
        });
        mVar.f85569j.setOnClickListener(new View.OnClickListener() { // from class: com.neeeex.eraser.recover.reco.p.o
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                PhotoFilterDetailNEEEEXActivity.L0(this.f65866a, view);
            }
        });
        mVar.f85571l.setOnClickListener(new View.OnClickListener() { // from class: com.neeeex.eraser.recover.reco.p.p
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                PhotoFilterDetailNEEEEXActivity.M0(this.f65868a, view);
            }
        });
        mVar.f85566g.setOnClickListener(new View.OnClickListener() { // from class: com.neeeex.eraser.recover.reco.p.q
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                PhotoFilterDetailNEEEEXActivity.N0(this.f65870a, view);
            }
        });
        mVar.f85561b.setOnClickListener(new View.OnClickListener() { // from class: com.neeeex.eraser.recover.reco.p.r
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                PhotoFilterDetailNEEEEXActivity.O0(this.f65872a, view);
            }
        });
    }

    public static final void I0(PhotoFilterDetailNEEEEXActivity photoFilterDetailNEEEEXActivity, View view) {
        photoFilterDetailNEEEEXActivity.G0(b.a.f65720a);
    }

    public static final void J0(PhotoFilterDetailNEEEEXActivity photoFilterDetailNEEEEXActivity, View view) {
        photoFilterDetailNEEEEXActivity.G0(b.f.f65725a);
    }

    public static final void K0(PhotoFilterDetailNEEEEXActivity photoFilterDetailNEEEEXActivity, View view) {
        photoFilterDetailNEEEEXActivity.G0(b.g.f65726a);
    }

    public static final void L0(PhotoFilterDetailNEEEEXActivity photoFilterDetailNEEEEXActivity, View view) {
        photoFilterDetailNEEEEXActivity.G0(b.c.f65722a);
    }

    public static final void M0(PhotoFilterDetailNEEEEXActivity photoFilterDetailNEEEEXActivity, View view) {
        photoFilterDetailNEEEEXActivity.G0(b.e.f65724a);
    }

    public static final void N0(PhotoFilterDetailNEEEEXActivity photoFilterDetailNEEEEXActivity, View view) {
        photoFilterDetailNEEEEXActivity.G0(b.C0792b.f65721a);
    }

    public static final void O0(PhotoFilterDetailNEEEEXActivity photoFilterDetailNEEEEXActivity, View view) {
        photoFilterDetailNEEEEXActivity.G0(b.d.f65723a);
    }

    public static final void Q0(PhotoFilterDetailNEEEEXActivity photoFilterDetailNEEEEXActivity, c cVar) {
        photoFilterDetailNEEEEXActivity.S0(cVar.b());
    }

    private final ii.b R0() {
        MutableLiveData mutableLiveDataB;
        List list;
        com.neeeex.eraser.h0 sharedViewModel = getSharedViewModel();
        if (sharedViewModel == null || (mutableLiveDataB = sharedViewModel.B()) == null || (list = (List) mutableLiveDataB.getValue()) == null) {
            return null;
        }
        return (ii.b) gl.g0.s0(list, this.selectedFolderIndex);
    }

    private final void V0() {
        PhotoFilterDetailNEEEEXActivity photoFilterDetailNEEEEXActivity;
        MutableLiveData mutableLiveDataE;
        MutableLiveData mutableLiveDataD;
        com.neeeex.eraser.h0 sharedViewModel = getSharedViewModel();
        if (sharedViewModel == null || (mutableLiveDataD = sharedViewModel.D()) == null) {
            photoFilterDetailNEEEEXActivity = this;
        } else {
            photoFilterDetailNEEEEXActivity = this;
            ti.h.g(mutableLiveDataD, photoFilterDetailNEEEEXActivity, false, false, new Function1() { // from class: com.neeeex.eraser.recover.reco.p.s
                @Override // p003kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return PhotoFilterDetailNEEEEXActivity.w0(this.f65874a, (String) obj);
                }
            }, 4, null);
        }
        com.neeeex.eraser.h0 sharedViewModel2 = getSharedViewModel();
        if (sharedViewModel2 == null || (mutableLiveDataE = sharedViewModel2.E()) == null) {
            return;
        }
        ti.h.g(mutableLiveDataE, photoFilterDetailNEEEEXActivity, false, false, new Function1() { // from class: com.neeeex.eraser.recover.reco.p.t
            @Override // p003kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return PhotoFilterDetailNEEEEXActivity.s0(this.f65876a, (String) obj);
            }
        }, 4, null);
    }

    public static final void X0(PhotoFilterDetailNEEEEXActivity photoFilterDetailNEEEEXActivity, int i10) {
        photoFilterDetailNEEEEXActivity.T0().y(i10);
        photoFilterDetailNEEEEXActivity.e1(photoFilterDetailNEEEEXActivity.T0().B());
    }

    public static final void Z0(PhotoFilterDetailNEEEEXActivity photoFilterDetailNEEEEXActivity, fl.t tVar) {
        com.neeeex.eraser.m0.a("qF1Pmew=\n", "3jwj7IkyuzY=\n");
        tVar.getClass();
        photoFilterDetailNEEEEXActivity.T0().z(tVar);
        photoFilterDetailNEEEEXActivity.e1(photoFilterDetailNEEEEXActivity.T0().B());
    }

    private final void b1() {
        ji.m mVar = this.binding;
        ji.m mVar2 = null;
        if (mVar == null) {
            p003kotlin.jvm.internal.v.n(com.neeeex.eraser.m0.a("ZziPEUHRxQ==\n", "BVHhdSi/opQ=\n"));
            mVar = null;
        }
        mVar.f85575p.setText(T0().m());
        ji.m mVar3 = this.binding;
        if (mVar3 == null) {
            p003kotlin.jvm.internal.v.n(com.neeeex.eraser.m0.a("TjRCxCcaZQ==\n", "LF0soE50Amg=\n"));
        } else {
            mVar2 = mVar3;
        }
        mVar2.f85574o.setText(getString(R$string.recover_neeeex_hide_low, new Object[]{Integer.valueOf(T0().n())}));
        e1(T0().B());
    }

    private final void d1() {
        ii.b bVarR0 = R0();
        if (bVarR0 == null) {
            return;
        }
        T0().r(bVarR0);
        b1();
    }

    private final void e1(List items) {
        boolean z10;
        ji.m mVar = this.binding;
        if (mVar == null) {
            p003kotlin.jvm.internal.v.n(com.neeeex.eraser.m0.a("PpKPvLxJsA==\n", "XPvh2NUn1wI=\n"));
            mVar = null;
        }
        boolean zIsEmpty = items.isEmpty();
        boolean z11 = !zIsEmpty;
        LinearLayout linearLayout = mVar.f85568i;
        com.neeeex.eraser.m0.a("iFiCQBS61ySUTYI=\n", "5Dn7L2HOkkk=\n");
        linearLayout.getClass();
        RecyclerView recyclerView = mVar.f85572m;
        com.neeeex.eraser.m0.a("CzNrV5BFc0M9IFFTnEw=\n", "eUUlMvUgFjs=\n");
        recyclerView.getClass();
        ViewGroup[] viewGroupArr = {linearLayout, recyclerView};
        int i10 = 0;
        int i11 = 0;
        while (i10 < 2) {
            ViewGroup viewGroup = viewGroupArr[i10];
            int i12 = i11 + 1;
            if (i11 == 0) {
                z10 = zIsEmpty;
            } else {
                z10 = z11;
            }
            viewGroup.setVisibility(z10 ? 0 : 8);
            i10++;
            i11 = i12;
        }
        if (zIsEmpty) {
            return;
        }
        GridLayoutManager gridLayoutManager = new GridLayoutManager(this, 3);
        gridLayoutManager.setSpanSizeLookup(new d(items));
        mVar.f85572m.setHasFixedSize(true);
        mVar.f85572m.setLayoutManager(gridLayoutManager);
        com.neeeex.eraser.recover.reco.p.e eVar = new com.neeeex.eraser.recover.reco.p.e(items, false, new com.neeeex.eraser.recover.reco.p.e.c() { // from class: com.neeeex.eraser.recover.reco.p.u
            @Override // com.neeeex.eraser.recover.reco.p.e.c
            public final void a() {
                PhotoFilterDetailNEEEEXActivity.f1(this.f65878a);
            }
        });
        this.detailAdapter = eVar;
        mVar.f85572m.setAdapter(eVar);
        c1();
    }

    public static final void f1(PhotoFilterDetailNEEEEXActivity photoFilterDetailNEEEEXActivity) {
        photoFilterDetailNEEEEXActivity.c1();
    }

    public static fl.m0 s0(PhotoFilterDetailNEEEEXActivity photoFilterDetailNEEEEXActivity, String str) {
        photoFilterDetailNEEEEXActivity.a1(gl.v.e(str), 1);
        return fl.m0.f80959a;
    }

    public static fl.m0 w0(PhotoFilterDetailNEEEEXActivity photoFilterDetailNEEEEXActivity, String str) {
        photoFilterDetailNEEEEXActivity.S0(gl.v.e(str));
        return fl.m0.f80959a;
    }

    public final void G0(b intent) {
        if (p003kotlin.jvm.internal.v.c(intent, b.a.f65720a)) {
            onBackPressed();
            return;
        }
        if (p003kotlin.jvm.internal.v.c(intent, b.f.f65725a)) {
            com.neeeex.eraser.recover.reco.p.e eVar = this.detailAdapter;
            if (eVar != null) {
                eVar.s();
                return;
            }
            return;
        }
        if (p003kotlin.jvm.internal.v.c(intent, b.g.f65726a)) {
            T0().A();
            e1(T0().B());
            return;
        }
        if (p003kotlin.jvm.internal.v.c(intent, b.c.f65722a)) {
            W0();
            return;
        }
        if (p003kotlin.jvm.internal.v.c(intent, b.e.f65724a)) {
            Y0();
            return;
        }
        if (p003kotlin.jvm.internal.v.c(intent, b.C0792b.f65721a)) {
            c cVarG1 = g1();
            if (cVarG1 != null) {
                P0(cVarG1);
                return;
            }
            return;
        }
        if (!p003kotlin.jvm.internal.v.c(intent, b.d.f65723a)) {
            coil.util.j.a();
            return;
        }
        c cVarG2 = g1();
        if (cVarG2 != null) {
            a1(cVarG2.b(), cVarG2.a());
        }
    }

    public final void P0(final c batch) {
        DeleteTipDialog deleteTipDialogA = DeleteTipDialog.INSTANCE.a();
        deleteTipDialogA.m(new ki.a() { // from class: com.neeeex.eraser.recover.reco.p.i
            @Override // ki.a
            public final void a() {
                PhotoFilterDetailNEEEEXActivity.Q0(this.f65851a, batch);
            }
        });
        androidx.fragment.app.l0 supportFragmentManager = getSupportFragmentManager();
        com.neeeex.eraser.m0.a("XMl09c3CkvJJ2EbU2dWP+FXYTcfW04X4SYQuiJab\n", "O6wApriy4p0=\n");
        supportFragmentManager.getClass();
        deleteTipDialogA.i(supportFragmentManager);
    }

    public final void S0(List paths) {
        if (com.neeeex.eraser.module.report.bytedance.a.k()) {
            BaseAdActivity.showInter$default(this, com.neeeex.eraser.m0.a("1lQHDS48fHPK\n", "hARYSWtwIzo=\n"), null, 2, null);
        }
        U0(true);
        com.neeeex.eraser.h0 sharedViewModel = getSharedViewModel();
        if (sharedViewModel != null) {
            sharedViewModel.w(this, this.selectedFolderIndex, paths, true);
        }
    }

    public final c0 T0() {
        return (c0) this.viewModel.getValue();
    }

    public final void U0(final boolean showToast) {
        MutableLiveData mutableLiveDataA;
        com.neeeex.eraser.h0 sharedViewModel = getSharedViewModel();
        if (sharedViewModel == null || (mutableLiveDataA = sharedViewModel.A()) == null) {
            return;
        }
        ti.h.f(mutableLiveDataA, this, false, true, new Function1() { // from class: com.neeeex.eraser.recover.reco.p.j
            @Override // p003kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return PhotoFilterDetailNEEEEXActivity.D0(this.f65855a, showToast, (Boolean) obj);
            }
        });
    }

    public final void W0() {
        FilterDialog filterDialogA = FilterDialog.INSTANCE.a();
        filterDialogA.t(T0().l());
        filterDialogA.s(new FilterDialog.c() { // from class: com.neeeex.eraser.recover.reco.p.k
            @Override // com.neeeex.eraser.module.dialog.FilterDialog.c
            public final void a(int i10) {
                PhotoFilterDetailNEEEEXActivity.X0(this.f65858a, i10);
            }
        });
        androidx.fragment.app.l0 supportFragmentManager = getSupportFragmentManager();
        com.neeeex.eraser.m0.a("4IXNz8T6/xn1lP/u0O3iE+mU9P3f6+gT9ciXsp+j\n", "h+C5nLGKj3Y=\n");
        supportFragmentManager.getClass();
        filterDialogA.i(supportFragmentManager);
    }

    public final void Y0() {
        SortDialog sortDialogA = SortDialog.INSTANCE.a();
        sortDialogA.z(T0().q());
        sortDialogA.y(new SortDialog.c() { // from class: com.neeeex.eraser.recover.reco.p.l
            @Override // com.neeeex.eraser.module.dialog.SortDialog.c
            public final void a(fl.t tVar) {
                PhotoFilterDetailNEEEEXActivity.Z0(this.f65860a, tVar);
            }
        });
        androidx.fragment.app.l0 supportFragmentManager = getSupportFragmentManager();
        com.neeeex.eraser.m0.a("eihJ6e3kZbdvOXvI+fN4vXM5cNv29XK9b2UTlLa9\n", "HU09upiUFdg=\n");
        supportFragmentManager.getClass();
        sortDialogA.i(supportFragmentManager);
    }

    public final void a1(List paths, int expired) {
        PhotoRecoverNEEEEXActivity.INSTANCE.a(this);
        com.neeeex.eraser.push.a aVar = com.neeeex.eraser.push.a.f65469a;
        aVar.k(paths.size(), 1);
        aVar.l(expired, 1);
        com.neeeex.eraser.h0 sharedViewModel = getSharedViewModel();
        if (sharedViewModel != null) {
            sharedViewModel.I(this, this.selectedFolderIndex, paths, true);
        }
        U0(false);
    }

    public final void c1() {
        ji.m mVar = this.binding;
        ji.m mVar2 = null;
        if (mVar == null) {
            p003kotlin.jvm.internal.v.n(com.neeeex.eraser.m0.a("aZW8OtwMWg==\n", "C/zSXrViPQc=\n"));
            mVar = null;
        }
        mVar.f85562c.setChecked(T0().u());
        ji.m mVar3 = this.binding;
        if (mVar3 == null) {
            p003kotlin.jvm.internal.v.n(com.neeeex.eraser.m0.a("2LoBIma5jw==\n", "utNvRg/X6H8=\n"));
            mVar3 = null;
        }
        mVar3.f85563d.setChecked(T0().s());
        ji.m mVar4 = this.binding;
        if (mVar4 == null) {
            p003kotlin.jvm.internal.v.n(com.neeeex.eraser.m0.a("FMFkTyn88A==\n", "dqgKK0CSlyY=\n"));
        } else {
            mVar2 = mVar4;
        }
        mVar2.f85561b.setText(getString(R$string.recover_neeeex_recover_btn, new Object[]{Integer.valueOf(T0().o())}));
    }

    public final c g1() {
        List listP = T0().p();
        if (T0().o() == 0) {
            Toast.makeText(this, R$string.toast_neeeex_select_one, 1).show();
            return null;
        }
        List list = listP;
        ArrayList arrayList = new ArrayList(gl.x.x(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(((ii.c) it.next()).h());
        }
        int i10 = 0;
        if (!(list instanceof Collection) || !list.isEmpty()) {
            Iterator it2 = list.iterator();
            while (it2.hasNext()) {
                if (com.neeeex.eraser.push.a.f65469a.h(((ii.c) it2.next()).a()) && (i10 = i10 + 1) < 0) {
                    gl.w.v();
                }
            }
        }
        return new c(arrayList, i10);
    }

    @Override // com.neeeex.eraser.base.RootActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ji.m mVarC = ji.m.c(getLayoutInflater());
        com.neeeex.eraser.m0.a("XNB/hUFuVn0bkDfA\n", "Nb4Z6SAaM1U=\n");
        mVarC.getClass();
        this.binding = mVarC;
        ji.m mVar = null;
        if (mVarC == null) {
            p003kotlin.jvm.internal.v.n(com.neeeex.eraser.m0.a("b05kMoIAgA==\n", "DScKVutu5/E=\n"));
            mVarC = null;
        }
        setContentView(mVarC.getRoot());
        this.selectedFolderIndex = getIntent().getIntExtra(f65715h, 0);
        ii.b bVarR0 = R0();
        if (bVarR0 == null) {
            finish();
            return;
        }
        T0().r(bVarR0);
        H0();
        b1();
        V0();
        if (com.neeeex.eraser.module.report.bytedance.a.k()) {
            ji.m mVar2 = this.binding;
            if (mVar2 == null) {
                p003kotlin.jvm.internal.v.n(com.neeeex.eraser.m0.a("UX7MB8OORQ==\n", "MxeiY6rgIiI=\n"));
            } else {
                mVar = mVar2;
            }
            FrameLayout frameLayout = mVar.f85564e;
            com.neeeex.eraser.m0.a("5I/Pc/sPLw7jiuByyg==\n", "guOOF7hgQXo=\n");
            frameLayout.getClass();
            BaseAdActivity.showRenderAdAndRefresh$default(this, frameLayout, R$layout.ad_neeeex_native, com.neeeex.eraser.m0.a("OlVhLhNCX1omRGorDFQ=\n", "aAU+YloRCwU=\n"), null, 8, null);
        }
        mi.a.f88870a.M0();
    }

    @Override // com.neeeex.eraser.base.BaseAdActivity, com.neeeex.eraser.base.RootActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        T0().i();
        super.onDestroy();
    }

    /* JADX INFO: renamed from: com.neeeex.eraser.recover.reco.p.PhotoFilterDetailNEEEEXActivity$a, reason: from kotlin metadata */
    public static final class Companion {
        public /* synthetic */ Companion(p003kotlin.jvm.internal.m mVar) {
            this();
        }

        public final void a(Context context, int i10) {
            com.neeeex.eraser.m0.a("kxmeIxVgAg==\n", "8HbwV3AYdjg=\n");
            context.getClass();
            Intent intent = new Intent(context, (Class<?>) PhotoFilterDetailNEEEEXActivity.class);
            intent.putExtra(com.neeeex.eraser.m0.a("EYpJ4kRvK2MRl1joekAqdR2GVP9L\n", "dPI9kCUwRQY=\n"), i10);
            context.startActivity(intent);
        }

        public Companion() {
        }
    }
}