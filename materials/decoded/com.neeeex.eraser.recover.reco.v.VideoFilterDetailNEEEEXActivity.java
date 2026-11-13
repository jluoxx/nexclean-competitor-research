package com.neeeex.eraser.recover.reco.v;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.Toast;
import androidx.activity.ComponentActivity;
import androidx.p002lifecycle.MutableLiveData;
import androidx.p002lifecycle.ViewModelLazy;
import androidx.p002lifecycle.ViewModelProvider;
import androidx.p002lifecycle.ViewModelStore;
import androidx.p002lifecycle.viewmodel.CreationExtras;
import androidx.recyclerview.widget.GridLayoutManager;
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
@Metadata(d1 = {"\u0000p\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u0000 A2\u00020\u0001:\u0003B1CB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0005\u0010\u0003J\u0017\u0010\b\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\b\u0010\tJ\u0019\u0010\r\u001a\u0004\u0018\u00010\f2\u0006\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u000f\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u000f\u0010\u0003J\u001d\u0010\u0013\u001a\u00020\u00042\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00110\u0010H\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0015\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0015\u0010\u0003J\u000f\u0010\u0016\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0016\u0010\u0003J\u0011\u0010\u0018\u001a\u0004\u0018\u00010\u0017H\u0002¢\u0006\u0004\b\u0018\u0010\u0019J\u000f\u0010\u001a\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u001a\u0010\u0003J\u000f\u0010\u001b\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u001b\u0010\u0003J\u0017\u0010\u001d\u001a\u00020\u00042\u0006\u0010\u001c\u001a\u00020\fH\u0002¢\u0006\u0004\b\u001d\u0010\u001eJ\u000f\u0010\u001f\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u001f\u0010\u0003J\u001d\u0010#\u001a\u00020\u00042\f\u0010\"\u001a\b\u0012\u0004\u0012\u00020!0 H\u0002¢\u0006\u0004\b#\u0010\u0014J%\u0010&\u001a\u00020\u00042\f\u0010\"\u001a\b\u0012\u0004\u0012\u00020!0 2\u0006\u0010%\u001a\u00020$H\u0002¢\u0006\u0004\b&\u0010'J\u0017\u0010)\u001a\u00020\u00042\u0006\u0010(\u001a\u00020\nH\u0002¢\u0006\u0004\b)\u0010*J\u000f\u0010+\u001a\u00020\u0004H\u0014¢\u0006\u0004\b+\u0010\u0003J\u0019\u0010.\u001a\u00020\u00042\b\u0010-\u001a\u0004\u0018\u00010,H\u0014¢\u0006\u0004\b.\u0010/R\u001b\u00105\u001a\u0002008FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b1\u00102\u001a\u0004\b3\u00104R\u0018\u00109\u001a\u0004\u0018\u0001068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b7\u00108R\u0016\u0010<\u001a\u00020$8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b:\u0010;R\u0016\u0010@\u001a\u00020=8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b>\u0010?¨\u0006D"}, d2 = {"Lcom/neeeex/eraser/recover/reco/v/VideoFilterDetailNEEEEXActivity;", "Lcom/neeeex/eraser/base/BaseAdActivity;", "<init>", "()V", "Lfl/m0;", "F0", "Lcom/neeeex/eraser/recover/reco/v/VideoFilterDetailNEEEEXActivity$b;", "input", "X0", "(Lcom/neeeex/eraser/recover/reco/v/VideoFilterDetailNEEEEXActivity$b;)V", "", "recover", "Lcom/neeeex/eraser/recover/reco/v/VideoFilterDetailNEEEEXActivity$c;", "R0", "(Z)Lcom/neeeex/eraser/recover/reco/v/VideoFilterDetailNEEEEXActivity$c;", "Y0", "", "Lii/c;", "items", "b1", "(Ljava/util/List;)V", "Z0", "a1", "Lii/b;", "M0", "()Lii/b;", "S0", "U0", "mutation", "d1", "(Lcom/neeeex/eraser/recover/reco/v/VideoFilterDetailNEEEEXActivity$c;)V", "Q0", "", "", "paths", "N0", "", "expired", "W0", "(Ljava/util/List;I)V", "showToast", "P0", "(Z)V", "onDestroy", "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "(Landroid/os/Bundle;)V", "Lcom/neeeex/eraser/recover/reco/v/b0;", "c", "Lfl/n;", "O0", "()Lcom/neeeex/eraser/recover/reco/v/b0;", "viewModel", "Lcom/neeeex/eraser/recover/reco/v/e;", "d", "Lcom/neeeex/eraser/recover/reco/v/e;", "detailAdapter", "e", "I", "selectedFolderIndex", "Lji/z;", "f", "Lji/z;", "binding", "g", DownloadCommon.DOWNLOAD_REPORT_FIND_FILE_RESULT_VALUE_B, "a", "tool-feature_productionRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class VideoFilterDetailNEEEEXActivity extends BaseAdActivity {

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    public final fl.n viewModel = new ViewModelLazy(p003kotlin.jvm.internal.w0.b(b0.class), new g(this), new f(this), new h(null, this));

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    public com.neeeex.eraser.recover.reco.v.e detailAdapter;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    public int selectedFolderIndex;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    public ji.z binding;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final String f65893h = "extra_neeeex_position" /* decoded XOR */;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    public enum b {
        NAVIGATE_BACK,
        TOGGLE_ALL,
        CHOOSE_FILTER,
        CHOOSE_SORT,
        DELETE,
        RECOVER;


        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ ml.a f65899b = ml.b.a(d());

        public static ml.a getEntries() {
            return f65899b;
        }
    }

    public interface c {

        public static final class a implements c {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final List f65900a;

            public a(List list) {
                "paths" /* decoded XOR */;
                list.getClass();
                this.f65900a = list;
            }

            public List a() {
                return this.f65900a;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof a) && p003kotlin.jvm.internal.v.c(this.f65900a, ((a) obj).f65900a);
            }

            public int hashCode() {
                return this.f65900a.hashCode();
            }

            public String toString() {
                return "Delete(paths=" + this.f65900a + ")";
            }
        }

        public static final class b implements c {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final List f65901a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final int f65902b;

            public b(List list, int i10) {
                "paths" /* decoded XOR */;
                list.getClass();
                this.f65901a = list;
                this.f65902b = i10;
            }

            public final int a() {
                return this.f65902b;
            }

            public List b() {
                return this.f65901a;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof b)) {
                    return false;
                }
                b bVar = (b) obj;
                return p003kotlin.jvm.internal.v.c(this.f65901a, bVar.f65901a) && this.f65902b == bVar.f65902b;
            }

            public int hashCode() {
                return (this.f65901a.hashCode() * 31) + Integer.hashCode(this.f65902b);
            }

            public String toString() {
                return "Recover(paths=" + this.f65901a + ", expired=" + this.f65902b + ")";
            }
        }
    }

    public static final /* synthetic */ class d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f65903a;

        static {
            int[] iArr = new int[b.values().length];
            try {
                iArr[b.NAVIGATE_BACK.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[b.TOGGLE_ALL.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[b.CHOOSE_FILTER.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[b.CHOOSE_SORT.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[b.DELETE.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[b.RECOVER.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            f65903a = iArr;
        }
    }

    public static final class e extends GridLayoutManager.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ List f65904a;

        public e(List list) {
            this.f65904a = list;
        }

        @Override // androidx.recyclerview.widget.GridLayoutManager.d
        public int getSpanSize(int i10) {
            return ((ii.c) this.f65904a.get(i10)).j() ? 3 : 1;
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
        public final ViewModelProvider.Factory invoke() {
            return this.$this_viewModels.getDefaultViewModelProviderFactory();
        }
    }

    public static final class g extends p003kotlin.jvm.internal.b0 implements Function0 {
        final /* synthetic */ ComponentActivity $this_viewModels;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(ComponentActivity componentActivity) {
            super(0);
            this.$this_viewModels = componentActivity;
        }

        @Override // p003kotlin.jvm.functions.Function0
        public final ViewModelStore invoke() {
            return this.$this_viewModels.getViewModelStore();
        }
    }

    public static final class h extends p003kotlin.jvm.internal.b0 implements Function0 {
        final /* synthetic */ Function0 $extrasProducer;
        final /* synthetic */ ComponentActivity $this_viewModels;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h(Function0 function0, ComponentActivity componentActivity) {
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

    private final void F0() {
        ji.z zVar = this.binding;
        if (zVar == null) {
            p003kotlin.jvm.internal.v.n("binding" /* decoded XOR */);
            zVar = null;
        }
        zVar.f85757e.setOnClickListener(new View.OnClickListener() { // from class: com.neeeex.eraser.recover.reco.v.h
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                VideoFilterDetailNEEEEXActivity.G0(this.f66032a, view);
            }
        });
        zVar.f85762j.setOnClickListener(new View.OnClickListener() { // from class: com.neeeex.eraser.recover.reco.v.l
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                VideoFilterDetailNEEEEXActivity.H0(this.f66044a, view);
            }
        });
        zVar.f85761i.setOnClickListener(new View.OnClickListener() { // from class: com.neeeex.eraser.recover.reco.v.m
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                VideoFilterDetailNEEEEXActivity.I0(this.f66047a, view);
            }
        });
        zVar.f85763k.setOnClickListener(new View.OnClickListener() { // from class: com.neeeex.eraser.recover.reco.v.n
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                VideoFilterDetailNEEEEXActivity.J0(this.f66049a, view);
            }
        });
        zVar.f85758f.setOnClickListener(new View.OnClickListener() { // from class: com.neeeex.eraser.recover.reco.v.o
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                VideoFilterDetailNEEEEXActivity.K0(this.f66051a, view);
            }
        });
        zVar.f85754b.setOnClickListener(new View.OnClickListener() { // from class: com.neeeex.eraser.recover.reco.v.p
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                VideoFilterDetailNEEEEXActivity.L0(this.f66053a, view);
            }
        });
    }

    public static final void G0(VideoFilterDetailNEEEEXActivity videoFilterDetailNEEEEXActivity, View view) {
        videoFilterDetailNEEEEXActivity.X0(b.NAVIGATE_BACK);
    }

    public static final void H0(VideoFilterDetailNEEEEXActivity videoFilterDetailNEEEEXActivity, View view) {
        videoFilterDetailNEEEEXActivity.X0(b.TOGGLE_ALL);
    }

    public static final void I0(VideoFilterDetailNEEEEXActivity videoFilterDetailNEEEEXActivity, View view) {
        videoFilterDetailNEEEEXActivity.X0(b.CHOOSE_FILTER);
    }

    public static final void J0(VideoFilterDetailNEEEEXActivity videoFilterDetailNEEEEXActivity, View view) {
        videoFilterDetailNEEEEXActivity.X0(b.CHOOSE_SORT);
    }

    public static final void K0(VideoFilterDetailNEEEEXActivity videoFilterDetailNEEEEXActivity, View view) {
        videoFilterDetailNEEEEXActivity.X0(b.DELETE);
    }

    public static final void L0(VideoFilterDetailNEEEEXActivity videoFilterDetailNEEEEXActivity, View view) {
        videoFilterDetailNEEEEXActivity.X0(b.RECOVER);
    }

    private final ii.b M0() {
        MutableLiveData mutableLiveDataB;
        List list;
        com.neeeex.eraser.h0 sharedViewModel = getSharedViewModel();
        if (sharedViewModel == null || (mutableLiveDataB = sharedViewModel.B()) == null || (list = (List) mutableLiveDataB.getValue()) == null) {
            return null;
        }
        return (ii.b) gl.g0.s0(list, this.selectedFolderIndex);
    }

    private final void P0(final boolean showToast) {
        MutableLiveData mutableLiveDataA;
        com.neeeex.eraser.h0 sharedViewModel = getSharedViewModel();
        if (sharedViewModel == null || (mutableLiveDataA = sharedViewModel.A()) == null) {
            return;
        }
        ti.h.f(mutableLiveDataA, this, false, true, new Function1() { // from class: com.neeeex.eraser.recover.reco.v.t
            @Override // p003kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return VideoFilterDetailNEEEEXActivity.z0(this.f66061a, showToast, (Boolean) obj);
            }
        });
    }

    private final void Q0() {
        VideoFilterDetailNEEEEXActivity videoFilterDetailNEEEEXActivity;
        MutableLiveData mutableLiveDataE;
        MutableLiveData mutableLiveDataD;
        com.neeeex.eraser.h0 sharedViewModel = getSharedViewModel();
        if (sharedViewModel == null || (mutableLiveDataD = sharedViewModel.D()) == null) {
            videoFilterDetailNEEEEXActivity = this;
        } else {
            videoFilterDetailNEEEEXActivity = this;
            ti.h.g(mutableLiveDataD, videoFilterDetailNEEEEXActivity, false, false, new Function1() { // from class: com.neeeex.eraser.recover.reco.v.r
                @Override // p003kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return VideoFilterDetailNEEEEXActivity.v0(this.f66057a, (String) obj);
                }
            }, 4, null);
        }
        com.neeeex.eraser.h0 sharedViewModel2 = getSharedViewModel();
        if (sharedViewModel2 == null || (mutableLiveDataE = sharedViewModel2.E()) == null) {
            return;
        }
        ti.h.g(mutableLiveDataE, videoFilterDetailNEEEEXActivity, false, false, new Function1() { // from class: com.neeeex.eraser.recover.reco.v.s
            @Override // p003kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return VideoFilterDetailNEEEEXActivity.s0(this.f66059a, (String) obj);
            }
        }, 4, null);
    }

    private final void S0() {
        FilterDialog filterDialogA = FilterDialog.INSTANCE.a();
        filterDialogA.t(O0().m());
        filterDialogA.s(new FilterDialog.c() { // from class: com.neeeex.eraser.recover.reco.v.j
            @Override // com.neeeex.eraser.module.dialog.FilterDialog.c
            public final void a(int i10) {
                VideoFilterDetailNEEEEXActivity.T0(this.f66037a, i10);
            }
        });
        androidx.fragment.app.l0 supportFragmentManager = getSupportFragmentManager();
        "getSupportFragmentManager(...)" /* decoded XOR */;
        supportFragmentManager.getClass();
        filterDialogA.i(supportFragmentManager);
    }

    public static final void T0(VideoFilterDetailNEEEEXActivity videoFilterDetailNEEEEXActivity, int i10) {
        videoFilterDetailNEEEEXActivity.O0().x(i10);
        videoFilterDetailNEEEEXActivity.b1(videoFilterDetailNEEEEXActivity.O0().z());
    }

    private final void U0() {
        SortDialog sortDialogA = SortDialog.INSTANCE.a();
        sortDialogA.z(O0().q());
        sortDialogA.y(new SortDialog.c() { // from class: com.neeeex.eraser.recover.reco.v.i
            @Override // com.neeeex.eraser.module.dialog.SortDialog.c
            public final void a(fl.t tVar) {
                VideoFilterDetailNEEEEXActivity.V0(this.f66034a, tVar);
            }
        });
        androidx.fragment.app.l0 supportFragmentManager = getSupportFragmentManager();
        "getSupportFragmentManager(...)" /* decoded XOR */;
        supportFragmentManager.getClass();
        sortDialogA.i(supportFragmentManager);
    }

    public static final void V0(VideoFilterDetailNEEEEXActivity videoFilterDetailNEEEEXActivity, fl.t tVar) {
        "value" /* decoded XOR */;
        tVar.getClass();
        videoFilterDetailNEEEEXActivity.O0().y(tVar);
        videoFilterDetailNEEEEXActivity.b1(videoFilterDetailNEEEEXActivity.O0().z());
    }

    private final void Y0() {
        ji.z zVar = this.binding;
        if (zVar == null) {
            p003kotlin.jvm.internal.v.n("binding" /* decoded XOR */);
            zVar = null;
        }
        zVar.f85766n.setText(O0().n());
        b1(O0().z());
    }

    private final void Z0() {
        ji.z zVar = this.binding;
        ji.z zVar2 = null;
        if (zVar == null) {
            p003kotlin.jvm.internal.v.n("binding" /* decoded XOR */);
            zVar = null;
        }
        zVar.f85755c.setChecked(O0().s());
        int iO = O0().o();
        ji.z zVar3 = this.binding;
        if (zVar3 == null) {
            p003kotlin.jvm.internal.v.n("binding" /* decoded XOR */);
        } else {
            zVar2 = zVar3;
        }
        zVar2.f85754b.setText(getString(R$string.recover_neeeex_recover_btn, new Object[]{Integer.valueOf(iO)}));
    }

    private final void a1() {
        ii.b bVarM0 = M0();
        if (bVarM0 == null) {
            return;
        }
        O0().r(bVarM0);
        Y0();
    }

    private final void b1(List items) {
        ji.z zVar = this.binding;
        if (zVar == null) {
            p003kotlin.jvm.internal.v.n("binding" /* decoded XOR */);
            zVar = null;
        }
        List list = items.isEmpty() ? null : items;
        zVar.f85760h.setVisibility(list == null ? 0 : 8);
        zVar.f85764l.setVisibility(list != null ? 0 : 8);
        if (list != null) {
            GridLayoutManager gridLayoutManager = new GridLayoutManager(this, 3);
            gridLayoutManager.setSpanSizeLookup(new e(items));
            zVar.f85764l.setHasFixedSize(true);
            zVar.f85764l.setLayoutManager(gridLayoutManager);
            com.neeeex.eraser.recover.reco.v.e eVar = new com.neeeex.eraser.recover.reco.v.e(items, false, new com.neeeex.eraser.recover.reco.v.e.c() { // from class: com.neeeex.eraser.recover.reco.v.q
                @Override // com.neeeex.eraser.recover.reco.v.e.c
                public final void a() {
                    VideoFilterDetailNEEEEXActivity.c1(this.f66055a);
                }
            });
            this.detailAdapter = eVar;
            zVar.f85764l.setAdapter(eVar);
            Z0();
        }
    }

    public static final void c1(VideoFilterDetailNEEEEXActivity videoFilterDetailNEEEEXActivity) {
        videoFilterDetailNEEEEXActivity.Z0();
    }

    public static final void e1(VideoFilterDetailNEEEEXActivity videoFilterDetailNEEEEXActivity, c cVar) {
        videoFilterDetailNEEEEXActivity.N0(((c.a) cVar).a());
    }

    public static fl.m0 s0(VideoFilterDetailNEEEEXActivity videoFilterDetailNEEEEXActivity, String str) {
        videoFilterDetailNEEEEXActivity.W0(gl.v.e(str), 1);
        return fl.m0.f80959a;
    }

    public static fl.m0 v0(VideoFilterDetailNEEEEXActivity videoFilterDetailNEEEEXActivity, String str) {
        videoFilterDetailNEEEEXActivity.N0(gl.v.e(str));
        return fl.m0.f80959a;
    }

    public static fl.m0 z0(VideoFilterDetailNEEEEXActivity videoFilterDetailNEEEEXActivity, boolean z10, Boolean bool) {
        videoFilterDetailNEEEEXActivity.a1();
        if (z10) {
            Toast.makeText(videoFilterDetailNEEEEXActivity, R$string.toast_neeeex_delete, 0).show();
        }
        return fl.m0.f80959a;
    }

    public final void N0(List paths) {
        if (com.neeeex.eraser.module.report.bytedance.a.k()) {
            BaseAdActivity.showInter$default(this, "RV_DEL_IN" /* decoded XOR */, null, 2, null);
        }
        P0(true);
        com.neeeex.eraser.h0 sharedViewModel = getSharedViewModel();
        if (sharedViewModel != null) {
            sharedViewModel.w(this, this.selectedFolderIndex, paths, true);
        }
    }

    public final b0 O0() {
        return (b0) this.viewModel.getValue();
    }

    public final c R0(boolean recover) {
        List listP = O0().p();
        if (listP.isEmpty()) {
            Toast.makeText(this, R$string.toast_neeeex_select_one, 1).show();
            return null;
        }
        List list = listP;
        ArrayList arrayList = new ArrayList(gl.x.x(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(((ii.c) it.next()).h());
        }
        if (!recover) {
            return new c.a(arrayList);
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
        return new c.b(arrayList, i10);
    }

    public final void W0(List paths, int expired) {
        VideoRecoverNEEEEXActivity.INSTANCE.a(this);
        com.neeeex.eraser.push.a aVar = com.neeeex.eraser.push.a.f65469a;
        aVar.k(paths.size(), 2);
        aVar.l(expired, 2);
        com.neeeex.eraser.h0 sharedViewModel = getSharedViewModel();
        if (sharedViewModel != null) {
            sharedViewModel.I(this, this.selectedFolderIndex, paths, true);
        }
        P0(false);
    }

    public final void X0(b input) {
        switch (d.f65903a[input.ordinal()]) {
            case 1:
                onBackPressed();
                break;
            case 2:
                com.neeeex.eraser.recover.reco.v.e eVar = this.detailAdapter;
                if (eVar != null) {
                    eVar.t();
                }
                break;
            case 3:
                S0();
                break;
            case 4:
                U0();
                break;
            case 5:
                c cVarR0 = R0(false);
                if (cVarR0 != null) {
                    d1(cVarR0);
                }
                break;
            case 6:
                c cVarR1 = R0(true);
                if (cVarR1 != null) {
                    d1(cVarR1);
                }
                break;
            default:
                coil.util.j.a();
                break;
        }
    }

    public final void d1(final c mutation) {
        if (!(mutation instanceof c.a)) {
            if (!(mutation instanceof c.b)) {
                coil.util.j.a();
                return;
            } else {
                c.b bVar = (c.b) mutation;
                W0(bVar.b(), bVar.a());
                return;
            }
        }
        DeleteTipDialog deleteTipDialogA = DeleteTipDialog.INSTANCE.a();
        deleteTipDialogA.m(new ki.a() { // from class: com.neeeex.eraser.recover.reco.v.k
            @Override // ki.a
            public final void a() {
                VideoFilterDetailNEEEEXActivity.e1(this.f66040a, mutation);
            }
        });
        androidx.fragment.app.l0 supportFragmentManager = getSupportFragmentManager();
        "getSupportFragmentManager(...)" /* decoded XOR */;
        supportFragmentManager.getClass();
        deleteTipDialogA.i(supportFragmentManager);
    }

    @Override // com.neeeex.eraser.base.RootActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ji.z zVarC = ji.z.c(getLayoutInflater());
        "inflate(...)" /* decoded XOR */;
        zVarC.getClass();
        this.binding = zVarC;
        ji.z zVar = null;
        if (zVarC == null) {
            p003kotlin.jvm.internal.v.n("binding" /* decoded XOR */);
            zVarC = null;
        }
        setContentView(zVarC.getRoot());
        this.selectedFolderIndex = getIntent().getIntExtra(f65893h, 0);
        ii.b bVarM0 = M0();
        if (bVarM0 == null) {
            finish();
            return;
        }
        O0().r(bVarM0);
        F0();
        Y0();
        Q0();
        if (com.neeeex.eraser.module.report.bytedance.a.k()) {
            ji.z zVar2 = this.binding;
            if (zVar2 == null) {
                p003kotlin.jvm.internal.v.n("binding" /* decoded XOR */);
            } else {
                zVar = zVar2;
            }
            FrameLayout frameLayout = zVar.f85756d;
            "flAdContainer" /* decoded XOR */;
            frameLayout.getClass();
            BaseAdActivity.showRenderAdAndRefresh$default(this, frameLayout, R$layout.ad_neeeex_native, "RV_LIST_NATIVE" /* decoded XOR */, null, 8, null);
        }
        mi.a.f88870a.Y0();
    }

    @Override // com.neeeex.eraser.base.BaseAdActivity, com.neeeex.eraser.base.RootActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        O0().k();
        super.onDestroy();
    }

    /* JADX INFO: renamed from: com.neeeex.eraser.recover.reco.v.VideoFilterDetailNEEEEXActivity$a, reason: from kotlin metadata */
    public static final class Companion {
        public /* synthetic */ Companion(p003kotlin.jvm.internal.m mVar) {
            this();
        }

        public final void a(Context context, int i10) {
            "context" /* decoded XOR */;
            context.getClass();
            Intent intent = new Intent(context, (Class<?>) VideoFilterDetailNEEEEXActivity.class);
            intent.putExtra("extra_neeeex_position" /* decoded XOR */, i10);
            context.startActivity(intent);
        }

        public Companion() {
        }
    }
}