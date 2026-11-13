package com.neeeex.eraser.recover.reco.f;

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
import androidx.recyclerview.widget.LinearLayoutManager;
import com.mbridge.msdk.foundation.download.core.DownloadCommon;
import com.neeeex.eraser.R$layout;
import com.neeeex.eraser.R$string;
import com.neeeex.eraser.base.BaseAdActivity;
import com.neeeex.eraser.module.dialog.DeleteTipDialog;
import com.neeeex.eraser.module.dialog.FilterDialog;
import com.neeeex.eraser.module.dialog.SortDialog;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import p003kotlin.Metadata;
import p003kotlin.jvm.functions.Function0;
import p003kotlin.jvm.functions.Function1;
import p003kotlin.jvm.internal.w0;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000r\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u0000 C2\u00020\u0001:\u00033DEB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0005\u0010\u0003J\u0017\u0010\b\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\n\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\n\u0010\u0003J\u001d\u0010\u000e\u001a\u00020\u00042\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000bH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0010\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0010\u0010\u0003J\u000f\u0010\u0011\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0011\u0010\u0003J\u0011\u0010\u0013\u001a\u0004\u0018\u00010\u0012H\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0015\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0015\u0010\u0003J\u000f\u0010\u0016\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0016\u0010\u0003J\u000f\u0010\u0018\u001a\u00020\u0017H\u0002¢\u0006\u0004\b\u0018\u0010\u0019J\u000f\u0010\u001a\u001a\u00020\u0017H\u0002¢\u0006\u0004\b\u001a\u0010\u0019J\u0017\u0010\u001c\u001a\u00020\u00042\u0006\u0010\u001b\u001a\u00020\u0017H\u0002¢\u0006\u0004\b\u001c\u0010\u001dJ\u0017\u0010\u001e\u001a\u00020\u00042\u0006\u0010\u001b\u001a\u00020\u0017H\u0002¢\u0006\u0004\b\u001e\u0010\u001dJ\u000f\u0010\u001f\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u001f\u0010\u0003J\u000f\u0010 \u001a\u00020\u0004H\u0002¢\u0006\u0004\b \u0010\u0003J\u001d\u0010$\u001a\u00020\u00042\f\u0010#\u001a\b\u0012\u0004\u0012\u00020\"0!H\u0002¢\u0006\u0004\b$\u0010\u000fJ%\u0010'\u001a\u00020\u00042\f\u0010#\u001a\b\u0012\u0004\u0012\u00020\"0!2\u0006\u0010&\u001a\u00020%H\u0002¢\u0006\u0004\b'\u0010(J\u0017\u0010+\u001a\u00020\u00042\u0006\u0010*\u001a\u00020)H\u0002¢\u0006\u0004\b+\u0010,J\u000f\u0010-\u001a\u00020\u0004H\u0014¢\u0006\u0004\b-\u0010\u0003J\u0019\u00100\u001a\u00020\u00042\b\u0010/\u001a\u0004\u0018\u00010.H\u0014¢\u0006\u0004\b0\u00101R\u001b\u00107\u001a\u0002028FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b3\u00104\u001a\u0004\b5\u00106R\u0018\u0010;\u001a\u0004\u0018\u0001088\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b9\u0010:R\u0016\u0010>\u001a\u00020%8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b<\u0010=R\u0016\u0010B\u001a\u00020?8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b@\u0010A¨\u0006F"}, d2 = {"Lcom/neeeex/eraser/recover/reco/f/FileFilterDetailNEEEEXActivity;", "Lcom/neeeex/eraser/base/BaseAdActivity;", "<init>", "()V", "Lfl/m0;", "F0", "Lcom/neeeex/eraser/recover/reco/f/FileFilterDetailNEEEEXActivity$c;", "action", "P0", "(Lcom/neeeex/eraser/recover/reco/f/FileFilterDetailNEEEEXActivity$c;)V", "a1", "", "Lii/c;", "items", "d1", "(Ljava/util/List;)V", "b1", "c1", "Lii/b;", "M0", "()Lii/b;", "U0", "W0", "Lcom/neeeex/eraser/recover/reco/f/FileFilterDetailNEEEEXActivity$b;", "O0", "()Lcom/neeeex/eraser/recover/reco/f/FileFilterDetailNEEEEXActivity$b;", "Z0", "operation", "f1", "(Lcom/neeeex/eraser/recover/reco/f/FileFilterDetailNEEEEXActivity$b;)V", "Q0", "T0", "h1", "", "", "paths", "N0", "", "expired", "Y0", "(Ljava/util/List;I)V", "", "showDeleteToast", "S0", "(Z)V", "onDestroy", "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "(Landroid/os/Bundle;)V", "Lcom/neeeex/eraser/recover/reco/f/y;", "c", "Lfl/n;", "R0", "()Lcom/neeeex/eraser/recover/reco/f/y;", "viewModel", "Lcom/neeeex/eraser/recover/reco/f/d;", "d", "Lcom/neeeex/eraser/recover/reco/f/d;", "detailAdapter", "e", "I", "selectedFolderIndex", "Lji/c;", "f", "Lji/c;", "binding", "g", DownloadCommon.DOWNLOAD_REPORT_FIND_FILE_RESULT_VALUE_B, "a", "tool-feature_productionRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class FileFilterDetailNEEEEXActivity extends BaseAdActivity {

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    public final fl.n viewModel = new ViewModelLazy(w0.b(y.class), new f(this), new e(this), new g(null, this));

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    public com.neeeex.eraser.recover.reco.f.d detailAdapter;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    public int selectedFolderIndex;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    public ji.c binding;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final String f65560h = com.neeeex.eraser.m0.a("aCK80IyHI7toP63asqgirWQuoc2D\n", "DVrIou3YTd4=\n");

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    public interface b {

        public static final class a implements b {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final List f65565a;

            public a(List list) {
                com.neeeex.eraser.m0.a("Y+FuEi4=\n", "E4Aael15x1U=\n");
                list.getClass();
                this.f65565a = list;
            }

            @Override // com.neeeex.eraser.recover.reco.f.FileFilterDetailNEEEEXActivity.b
            public List a() {
                return this.f65565a;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof a) && p003kotlin.jvm.internal.v.c(this.f65565a, ((a) obj).f65565a);
            }

            public int hashCode() {
                return this.f65565a.hashCode();
            }

            public String toString() {
                return "Delete(paths=" + this.f65565a + ")";
            }
        }

        /* JADX INFO: renamed from: com.neeeex.eraser.recover.reco.f.FileFilterDetailNEEEEXActivity$b$b, reason: collision with other inner class name */
        public static final class C0787b implements b {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final List f65566a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final int f65567b;

            public C0787b(List list, int i10) {
                com.neeeex.eraser.m0.a("3XNerTw=\n", "rRIqxU8cZ7U=\n");
                list.getClass();
                this.f65566a = list;
                this.f65567b = i10;
            }

            @Override // com.neeeex.eraser.recover.reco.f.FileFilterDetailNEEEEXActivity.b
            public List a() {
                return this.f65566a;
            }

            public final int b() {
                return this.f65567b;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof C0787b)) {
                    return false;
                }
                C0787b c0787b = (C0787b) obj;
                return p003kotlin.jvm.internal.v.c(this.f65566a, c0787b.f65566a) && this.f65567b == c0787b.f65567b;
            }

            public int hashCode() {
                return (this.f65566a.hashCode() * 31) + Integer.hashCode(this.f65567b);
            }

            public String toString() {
                return "Recover(paths=" + this.f65566a + ", expired=" + this.f65567b + ")";
            }
        }

        List a();
    }

    public enum c {
        BACK,
        SELECT_ALL,
        FILTER,
        SORT,
        DELETE,
        RECOVER;


        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ ml.a f65569b = ml.b.a(d());

        public static ml.a getEntries() {
            return f65569b;
        }
    }

    public static final /* synthetic */ class d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f65570a;

        static {
            int[] iArr = new int[c.values().length];
            try {
                iArr[c.BACK.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[c.SELECT_ALL.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[c.FILTER.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[c.SORT.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[c.DELETE.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[c.RECOVER.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            f65570a = iArr;
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

    public static fl.m0 A0(FileFilterDetailNEEEEXActivity fileFilterDetailNEEEEXActivity, String str) {
        fileFilterDetailNEEEEXActivity.Y0(gl.v.e(str), 1);
        return fl.m0.f80959a;
    }

    private final void F0() {
        ji.c cVar = this.binding;
        if (cVar == null) {
            p003kotlin.jvm.internal.v.n(com.neeeex.eraser.m0.a("C/mygXshag==\n", "aZDc5RJPDcg=\n"));
            cVar = null;
        }
        cVar.f85346e.setOnClickListener(new View.OnClickListener() { // from class: com.neeeex.eraser.recover.reco.f.j
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                FileFilterDetailNEEEEXActivity.G0(this.f65670a, view);
            }
        });
        cVar.f85351j.setOnClickListener(new View.OnClickListener() { // from class: com.neeeex.eraser.recover.reco.f.k
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                FileFilterDetailNEEEEXActivity.H0(this.f65672a, view);
            }
        });
        cVar.f85350i.setOnClickListener(new View.OnClickListener() { // from class: com.neeeex.eraser.recover.reco.f.l
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                FileFilterDetailNEEEEXActivity.I0(this.f65674a, view);
            }
        });
        cVar.f85352k.setOnClickListener(new View.OnClickListener() { // from class: com.neeeex.eraser.recover.reco.f.m
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                FileFilterDetailNEEEEXActivity.J0(this.f65676a, view);
            }
        });
        cVar.f85347f.setOnClickListener(new View.OnClickListener() { // from class: com.neeeex.eraser.recover.reco.f.n
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                FileFilterDetailNEEEEXActivity.K0(this.f65678a, view);
            }
        });
        cVar.f85343b.setOnClickListener(new View.OnClickListener() { // from class: com.neeeex.eraser.recover.reco.f.o
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                FileFilterDetailNEEEEXActivity.L0(this.f65680a, view);
            }
        });
    }

    public static final void G0(FileFilterDetailNEEEEXActivity fileFilterDetailNEEEEXActivity, View view) {
        fileFilterDetailNEEEEXActivity.P0(c.BACK);
    }

    public static final void H0(FileFilterDetailNEEEEXActivity fileFilterDetailNEEEEXActivity, View view) {
        fileFilterDetailNEEEEXActivity.P0(c.SELECT_ALL);
    }

    public static final void I0(FileFilterDetailNEEEEXActivity fileFilterDetailNEEEEXActivity, View view) {
        fileFilterDetailNEEEEXActivity.P0(c.FILTER);
    }

    public static final void J0(FileFilterDetailNEEEEXActivity fileFilterDetailNEEEEXActivity, View view) {
        fileFilterDetailNEEEEXActivity.P0(c.SORT);
    }

    public static final void K0(FileFilterDetailNEEEEXActivity fileFilterDetailNEEEEXActivity, View view) {
        fileFilterDetailNEEEEXActivity.P0(c.DELETE);
    }

    public static final void L0(FileFilterDetailNEEEEXActivity fileFilterDetailNEEEEXActivity, View view) {
        fileFilterDetailNEEEEXActivity.P0(c.RECOVER);
    }

    public static final void V0(FileFilterDetailNEEEEXActivity fileFilterDetailNEEEEXActivity, int i10) {
        fileFilterDetailNEEEEXActivity.R0().x(i10);
        fileFilterDetailNEEEEXActivity.d1(fileFilterDetailNEEEEXActivity.R0().z());
    }

    public static final void X0(FileFilterDetailNEEEEXActivity fileFilterDetailNEEEEXActivity, fl.t tVar) {
        com.neeeex.eraser.m0.a("8t+/IE4=\n", "hL7TVSsKCBE=\n");
        tVar.getClass();
        fileFilterDetailNEEEEXActivity.R0().y(tVar);
        fileFilterDetailNEEEEXActivity.d1(fileFilterDetailNEEEEXActivity.R0().z());
    }

    public static final void e1(FileFilterDetailNEEEEXActivity fileFilterDetailNEEEEXActivity) {
        fileFilterDetailNEEEEXActivity.b1();
    }

    public static final void g1(FileFilterDetailNEEEEXActivity fileFilterDetailNEEEEXActivity, b bVar) {
        fileFilterDetailNEEEEXActivity.Q0(bVar);
    }

    public static fl.m0 u0(FileFilterDetailNEEEEXActivity fileFilterDetailNEEEEXActivity, boolean z10, Boolean bool) {
        fileFilterDetailNEEEEXActivity.c1();
        if (z10) {
            Toast.makeText(fileFilterDetailNEEEEXActivity, R$string.toast_neeeex_delete, 0).show();
        }
        return fl.m0.f80959a;
    }

    public static fl.m0 v0(FileFilterDetailNEEEEXActivity fileFilterDetailNEEEEXActivity, String str) {
        fileFilterDetailNEEEEXActivity.N0(gl.v.e(str));
        return fl.m0.f80959a;
    }

    public final ii.b M0() {
        MutableLiveData mutableLiveDataB;
        List list;
        com.neeeex.eraser.h0 sharedViewModel = getSharedViewModel();
        if (sharedViewModel == null || (mutableLiveDataB = sharedViewModel.B()) == null || (list = (List) mutableLiveDataB.getValue()) == null) {
            return null;
        }
        return (ii.b) gl.g0.s0(list, this.selectedFolderIndex);
    }

    public final void N0(List paths) {
        if (com.neeeex.eraser.module.report.bytedance.a.k()) {
            BaseAdActivity.showInter$default(this, com.neeeex.eraser.m0.a("3GjmY3/HWk/A\n", "ji65JzqLBQY=\n"), null, 2, null);
        }
        S0(true);
        com.neeeex.eraser.h0 sharedViewModel = getSharedViewModel();
        if (sharedViewModel != null) {
            sharedViewModel.w(this, this.selectedFolderIndex, paths, false);
        }
    }

    public final b O0() {
        return new b.a(R0().r());
    }

    public final void P0(c action) {
        switch (d.f65570a[action.ordinal()]) {
            case 1:
                onBackPressed();
                break;
            case 2:
                com.neeeex.eraser.recover.reco.f.d dVar = this.detailAdapter;
                if (dVar != null) {
                    dVar.r();
                }
                break;
            case 3:
                U0();
                break;
            case 4:
                W0();
                break;
            case 5:
                f1(O0());
                break;
            case 6:
                f1(Z0());
                break;
            default:
                coil.util.j.a();
                break;
        }
    }

    public final void Q0(b operation) {
        if (operation instanceof b.a) {
            N0(((b.a) operation).a());
        } else if (!(operation instanceof b.C0787b)) {
            coil.util.j.a();
        } else {
            b.C0787b c0787b = (b.C0787b) operation;
            Y0(c0787b.a(), c0787b.b());
        }
    }

    public final y R0() {
        return (y) this.viewModel.getValue();
    }

    public final void S0(final boolean showDeleteToast) {
        MutableLiveData mutableLiveDataA;
        com.neeeex.eraser.h0 sharedViewModel = getSharedViewModel();
        if (sharedViewModel == null || (mutableLiveDataA = sharedViewModel.A()) == null) {
            return;
        }
        ti.h.f(mutableLiveDataA, this, false, true, new Function1() { // from class: com.neeeex.eraser.recover.reco.f.h
            @Override // p003kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return FileFilterDetailNEEEEXActivity.u0(this.f65665a, showDeleteToast, (Boolean) obj);
            }
        });
    }

    public final void T0() {
        FileFilterDetailNEEEEXActivity fileFilterDetailNEEEEXActivity;
        MutableLiveData mutableLiveDataE;
        MutableLiveData mutableLiveDataD;
        com.neeeex.eraser.h0 sharedViewModel = getSharedViewModel();
        if (sharedViewModel == null || (mutableLiveDataD = sharedViewModel.D()) == null) {
            fileFilterDetailNEEEEXActivity = this;
        } else {
            fileFilterDetailNEEEEXActivity = this;
            ti.h.g(mutableLiveDataD, fileFilterDetailNEEEEXActivity, false, false, new Function1() { // from class: com.neeeex.eraser.recover.reco.f.e
                @Override // p003kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return FileFilterDetailNEEEEXActivity.v0(this.f65658a, (String) obj);
                }
            }, 4, null);
        }
        com.neeeex.eraser.h0 sharedViewModel2 = getSharedViewModel();
        if (sharedViewModel2 == null || (mutableLiveDataE = sharedViewModel2.E()) == null) {
            return;
        }
        ti.h.g(mutableLiveDataE, fileFilterDetailNEEEEXActivity, false, false, new Function1() { // from class: com.neeeex.eraser.recover.reco.f.i
            @Override // p003kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return FileFilterDetailNEEEEXActivity.A0(this.f65668a, (String) obj);
            }
        }, 4, null);
    }

    public final void U0() {
        FilterDialog filterDialogA = FilterDialog.INSTANCE.a();
        filterDialogA.t(R0().n());
        filterDialogA.s(new FilterDialog.c() { // from class: com.neeeex.eraser.recover.reco.f.q
            @Override // com.neeeex.eraser.module.dialog.FilterDialog.c
            public final void a(int i10) {
                FileFilterDetailNEEEEXActivity.V0(this.f65684a, i10);
            }
        });
        androidx.fragment.app.l0 supportFragmentManager = getSupportFragmentManager();
        com.neeeex.eraser.m0.a("RDDkg2KBrCRRIdaidpaxLk0h3bF5kLsuUX2+/jnY\n", "I1WQ0Bfx3Es=\n");
        supportFragmentManager.getClass();
        filterDialogA.i(supportFragmentManager);
    }

    public final void W0() {
        SortDialog sortDialogA = SortDialog.INSTANCE.a();
        sortDialogA.z(R0().s());
        sortDialogA.y(new SortDialog.c() { // from class: com.neeeex.eraser.recover.reco.f.g
            @Override // com.neeeex.eraser.module.dialog.SortDialog.c
            public final void a(fl.t tVar) {
                FileFilterDetailNEEEEXActivity.X0(this.f65663a, tVar);
            }
        });
        androidx.fragment.app.l0 supportFragmentManager = getSupportFragmentManager();
        com.neeeex.eraser.m0.a("ArmdZocBGnwXqK9HkxYHdguopFScEA12F/THG9xY\n", "ZdzpNfJxahM=\n");
        supportFragmentManager.getClass();
        sortDialogA.i(supportFragmentManager);
    }

    public final void Y0(List paths, int expired) {
        FileRecoverNEEEEXActivity.INSTANCE.a(this);
        com.neeeex.eraser.push.a aVar = com.neeeex.eraser.push.a.f65469a;
        aVar.k(paths.size(), 3);
        aVar.l(expired, 3);
        com.neeeex.eraser.h0 sharedViewModel = getSharedViewModel();
        if (sharedViewModel != null) {
            sharedViewModel.I(this, this.selectedFolderIndex, paths, false);
        }
        S0(false);
    }

    public final b Z0() {
        List listQ = R0().q();
        int i10 = 0;
        if (!(listQ instanceof Collection) || !listQ.isEmpty()) {
            Iterator it = listQ.iterator();
            while (it.hasNext()) {
                if (com.neeeex.eraser.push.a.f65469a.h(((ii.c) it.next()).a()) && (i10 = i10 + 1) < 0) {
                    gl.w.v();
                }
            }
        }
        return new b.C0787b(R0().r(), i10);
    }

    public final void a1() {
        ji.c cVar = this.binding;
        if (cVar == null) {
            p003kotlin.jvm.internal.v.n(com.neeeex.eraser.m0.a("BKM+1Ka+9w==\n", "ZspQsM/QkKk=\n"));
            cVar = null;
        }
        cVar.f85355n.setText(R0().o());
        d1(R0().z());
    }

    public final void b1() {
        ji.c cVar = this.binding;
        ji.c cVar2 = null;
        if (cVar == null) {
            p003kotlin.jvm.internal.v.n(com.neeeex.eraser.m0.a("IkcFiBdndQ==\n", "QC5r7H4JEuY=\n"));
            cVar = null;
        }
        cVar.f85344c.setChecked(R0().u());
        ji.c cVar3 = this.binding;
        if (cVar3 == null) {
            p003kotlin.jvm.internal.v.n(com.neeeex.eraser.m0.a("4vaWnP0HTg==\n", "gJ/4+JRpKdg=\n"));
        } else {
            cVar2 = cVar3;
        }
        cVar2.f85343b.setText(getString(R$string.recover_neeeex_recover_btn, new Object[]{Integer.valueOf(R0().p())}));
    }

    public final void c1() {
        ii.b bVarM0 = M0();
        if (bVarM0 == null) {
            return;
        }
        R0().t(bVarM0);
        a1();
    }

    public final void d1(List items) {
        ji.c cVar = this.binding;
        if (cVar == null) {
            p003kotlin.jvm.internal.v.n(com.neeeex.eraser.m0.a("cbM6NY7Z2A==\n", "E9pUUee3v08=\n"));
            cVar = null;
        }
        int i10 = items.isEmpty() ? 8 : 0;
        cVar.f85349h.setVisibility(i10 != 0 ? 0 : 8);
        cVar.f85353l.setVisibility(i10);
        if (i10 == 0) {
            cVar.f85353l.setHasFixedSize(true);
            cVar.f85353l.setLayoutManager(new LinearLayoutManager(this));
            com.neeeex.eraser.recover.reco.f.d dVar = new com.neeeex.eraser.recover.reco.f.d(items, false, new com.neeeex.eraser.recover.reco.f.d.c() { // from class: com.neeeex.eraser.recover.reco.f.p
                @Override // com.neeeex.eraser.recover.reco.f.d.c
                public final void a() {
                    FileFilterDetailNEEEEXActivity.e1(this.f65682a);
                }
            });
            this.detailAdapter = dVar;
            cVar.f85353l.setAdapter(dVar);
            b1();
        }
    }

    public final void f1(final b operation) {
        if (operation.a().isEmpty()) {
            h1();
            return;
        }
        if (!(operation instanceof b.a)) {
            if (operation instanceof b.C0787b) {
                Q0(operation);
                return;
            } else {
                coil.util.j.a();
                return;
            }
        }
        DeleteTipDialog deleteTipDialogA = DeleteTipDialog.INSTANCE.a();
        deleteTipDialogA.m(new ki.a() { // from class: com.neeeex.eraser.recover.reco.f.f
            @Override // ki.a
            public final void a() {
                FileFilterDetailNEEEEXActivity.g1(this.f65660a, operation);
            }
        });
        androidx.fragment.app.l0 supportFragmentManager = getSupportFragmentManager();
        com.neeeex.eraser.m0.a("HUIWQYFaV/UIUyRglU1K/xRTL3OaS0D/CA9MPNoD\n", "eidiEvQqJ5o=\n");
        supportFragmentManager.getClass();
        deleteTipDialogA.i(supportFragmentManager);
    }

    public final void h1() {
        Toast.makeText(this, R$string.toast_neeeex_select_one, 1).show();
    }

    @Override // com.neeeex.eraser.base.RootActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ji.c cVarC = ji.c.c(getLayoutInflater());
        com.neeeex.eraser.m0.a("eG4vZG9iPC0/Lmch\n", "EQBJCA4WWQU=\n");
        cVarC.getClass();
        this.binding = cVarC;
        ji.c cVar = null;
        if (cVarC == null) {
            p003kotlin.jvm.internal.v.n(com.neeeex.eraser.m0.a("SEwwvXz6oA==\n", "KiVe2RWUx2k=\n"));
            cVarC = null;
        }
        setContentView(cVarC.getRoot());
        this.selectedFolderIndex = getIntent().getIntExtra(f65560h, 0);
        ii.b bVarM0 = M0();
        if (bVarM0 == null) {
            finish();
            return;
        }
        R0().t(bVarM0);
        F0();
        a1();
        T0();
        if (com.neeeex.eraser.module.report.bytedance.a.k()) {
            ji.c cVar2 = this.binding;
            if (cVar2 == null) {
                p003kotlin.jvm.internal.v.n(com.neeeex.eraser.m0.a("s8zqCVFqoA==\n", "0aWEbTgEx5s=\n"));
            } else {
                cVar = cVar2;
            }
            FrameLayout frameLayout = cVar.f85345d;
            com.neeeex.eraser.m0.a("+nLR1NHbffX9d/7V4A==\n", "nB6QsJK0E4E=\n");
            frameLayout.getClass();
            BaseAdActivity.showRenderAdAndRefresh$default(this, frameLayout, R$layout.ad_neeeex_native, com.neeeex.eraser.m0.a("radXLEFMePqxoFwpXlo=\n", "/+EIYAgfLKU=\n"), null, 8, null);
        }
        mi.a.f88870a.A0();
    }

    @Override // com.neeeex.eraser.base.BaseAdActivity, com.neeeex.eraser.base.RootActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        R0().h();
        super.onDestroy();
    }

    /* JADX INFO: renamed from: com.neeeex.eraser.recover.reco.f.FileFilterDetailNEEEEXActivity$a, reason: from kotlin metadata */
    public static final class Companion {
        public /* synthetic */ Companion(p003kotlin.jvm.internal.m mVar) {
            this();
        }

        public final void a(Context context, int i10) {
            com.neeeex.eraser.m0.a("hl/UU3zuTg==\n", "5TC6JxmWOt8=\n");
            context.getClass();
            Intent intent = new Intent(context, (Class<?>) FileFilterDetailNEEEEXActivity.class);
            intent.putExtra(com.neeeex.eraser.m0.a("WyGwc5J7ISRbPKF5rFQgMlctrW6d\n", "PlnEAfMkT0E=\n"), i10);
            context.startActivity(intent);
        }

        public Companion() {
        }
    }
}