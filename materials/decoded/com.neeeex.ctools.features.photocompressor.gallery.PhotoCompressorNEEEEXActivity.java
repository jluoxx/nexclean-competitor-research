package com.neeeex.ctools.features.photocompressor.gallery;

import am.q;
import android.R;
import android.graphics.Rect;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.FrameLayout;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.core.view.a1;
import androidx.core.view.c1;
import androidx.core.view.d1;
import androidx.core.view.y;
import androidx.fragment.app.l0;
import androidx.p002lifecycle.Observer;
import androidx.p002lifecycle.ViewModelProvider;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import b.k0;
import b.o0;
import b.w;
import com.airbnb.lottie.LottieAnimationView;
import com.android.launcher3.testing.shared.TestProtocol;
import com.mbridge.msdk.foundation.download.core.DownloadCommon;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.neeeex.eraser.R$color;
import com.neeeex.eraser.R$id;
import com.neeeex.eraser.R$layout;
import com.neeeex.eraser.R$string;
import com.neeeex.eraser.base.BaseAdActivity;
import com.neeeex.eraser.m0;
import com.neeeex.eraser.module.dialog.ExitScanDialog;
import com.pgl.ssdk.b0;
import com.thinkup.core.q.o;
import java.util.List;
import p003kotlin.Metadata;
import p003kotlin.jvm.functions.Function1;
import p003kotlin.jvm.internal.p;
import p003kotlin.jvm.internal.s;
import p003kotlin.jvm.internal.v;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0090\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u0000 b2\u00020\u0001:\u0004,c(dB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0005\u0010\u0003J\u000f\u0010\u0006\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0006\u0010\u0003J\u000f\u0010\u0007\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\u0003J\u000f\u0010\b\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\b\u0010\u0003J\u0017\u0010\u000b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\tH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0019\u0010\u000f\u001a\u00020\u00042\b\u0010\u000e\u001a\u0004\u0018\u00010\rH\u0014¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0012\u001a\u00020\u00042\u0006\u0010\u0011\u001a\u00020\rH\u0014¢\u0006\u0004\b\u0012\u0010\u0010J\u000f\u0010\u0013\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0013\u0010\u0003J\u000f\u0010\u0014\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0014\u0010\u0003J\u0017\u0010\u0017\u001a\u00020\u00042\u0006\u0010\u0016\u001a\u00020\u0015H\u0002¢\u0006\u0004\b\u0017\u0010\u0018J\u000f\u0010\u0019\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0019\u0010\u0003J\u0017\u0010\u001c\u001a\u00020\u00042\u0006\u0010\u001b\u001a\u00020\u001aH\u0002¢\u0006\u0004\b\u001c\u0010\u001dJ\u000f\u0010\u001e\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u001e\u0010\u0003J\u000f\u0010\u001f\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u001f\u0010\u0003J\u000f\u0010 \u001a\u00020\u0004H\u0002¢\u0006\u0004\b \u0010\u0003J\u0017\u0010!\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\tH\u0002¢\u0006\u0004\b!\u0010\"J\u0017\u0010%\u001a\u00020\u00042\u0006\u0010$\u001a\u00020#H\u0002¢\u0006\u0004\b%\u0010&R\u0016\u0010*\u001a\u00020'8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b(\u0010)R\u0016\u0010.\u001a\u00020+8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b,\u0010-R\u0016\u00100\u001a\u00020+8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b/\u0010-R\u0016\u00104\u001a\u0002018\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b2\u00103R\u0016\u00106\u001a\u00020+8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b5\u0010-R\u0016\u0010:\u001a\u0002078\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b8\u00109R\u0016\u0010<\u001a\u0002078\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b;\u00109R\u0016\u0010@\u001a\u00020=8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b>\u0010?R\u0016\u0010D\u001a\u00020A8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\bB\u0010CR\u0016\u0010F\u001a\u0002078\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\bE\u00109R\u0016\u0010H\u001a\u0002078\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\bG\u00109R\u0016\u0010L\u001a\u00020I8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\bJ\u0010KR\u0014\u0010P\u001a\u00020M8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bN\u0010OR\u0016\u0010T\u001a\u00020Q8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bR\u0010SR\u0016\u0010V\u001a\u00020Q8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bU\u0010SR\u0016\u0010X\u001a\u00020Q8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bW\u0010SR\u0016\u0010Z\u001a\u00020Q8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bY\u0010SR\u0016\u0010\\\u001a\u00020Q8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b[\u0010SR\u001a\u0010a\u001a\b\u0012\u0004\u0012\u00020^0]8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b_\u0010`¨\u0006e"}, d2 = {"Lcom/neeeex/ctools/features/photocompressor/gallery/PhotoCompressorNEEEEXActivity;", "Lcom/neeeex/eraser/base/BaseAdActivity;", "<init>", "()V", "Lfl/m0;", "D0", "I0", "H0", "C0", "", "value", "G0", "(I)I", "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "(Landroid/os/Bundle;)V", "outState", "onSaveInstanceState", "E0", "F0", "Lcom/neeeex/ctools/features/photocompressor/gallery/m;", TestProtocol.STATE_FIELD, "L0", "(Lcom/neeeex/ctools/features/photocompressor/gallery/m;)V", "P0", "Lcom/neeeex/ctools/features/photocompressor/gallery/n;", "tab", "O0", "(Lcom/neeeex/ctools/features/photocompressor/gallery/n;)V", "Q0", "R0", "M0", "N0", "(I)V", "Lcom/neeeex/ctools/features/photocompressor/data/c;", "item", "K0", "(Lcom/neeeex/ctools/features/photocompressor/data/c;)V", "Lcom/neeeex/ctools/features/photocompressor/gallery/j;", "c", "Lcom/neeeex/ctools/features/photocompressor/gallery/j;", "model", "Landroid/view/View;", "d", "Landroid/view/View;", "rootView", "e", "scanningView", "Lcom/airbnb/lottie/LottieAnimationView;", "f", "Lcom/airbnb/lottie/LottieAnimationView;", "scanAnimation", "g", "tabBar", "Landroid/widget/TextView;", "h", "Landroid/widget/TextView;", "allTab", "i", "compressedTab", "Landroidx/recyclerview/widget/RecyclerView;", "j", "Landroidx/recyclerview/widget/RecyclerView;", "photoGrid", "Landroid/widget/ProgressBar;", CampaignEx.JSON_KEY_AD_K, "Landroid/widget/ProgressBar;", "scanProgress", "l", "scanPercentage", "m", "emptyView", "Landroid/widget/FrameLayout;", com.thinkup.core.common.nn.m.n.f72065d, "Landroid/widget/FrameLayout;", "resultAd", "Lcom/neeeex/ctools/features/photocompressor/gallery/a;", o.f74114d, "Lcom/neeeex/ctools/features/photocompressor/gallery/a;", "photosAdapter", "", "p", "Z", "waitingForDetail", "q", "resultDisplayed", CampaignEx.JSON_KEY_AD_R, "resultAdRequested", "s", "scanEndAdRequested", "t", "exitInProgress", "Le/d;", "Landroid/content/Intent;", "u", "Le/d;", "detailLauncher", "v", DownloadCommon.DOWNLOAD_REPORT_FIND_FILE_RESULT_VALUE_B, "a", "tool-feature_productionRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class PhotoCompressorNEEEEXActivity extends BaseAdActivity {

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    public j model;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    public View rootView;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    public View scanningView;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    public LottieAnimationView scanAnimation;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    public View tabBar;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    public TextView allTab;

    /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata */
    public TextView compressedTab;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    public RecyclerView photoGrid;

    /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata */
    public ProgressBar scanProgress;

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
    public TextView scanPercentage;

    /* JADX INFO: renamed from: m, reason: collision with root package name and from kotlin metadata */
    public TextView emptyView;

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    public FrameLayout resultAd;

    /* JADX INFO: renamed from: p, reason: collision with root package name and from kotlin metadata */
    public boolean waitingForDetail;

    /* JADX INFO: renamed from: q, reason: collision with root package name and from kotlin metadata */
    public boolean resultDisplayed;

    /* JADX INFO: renamed from: r, reason: collision with root package name and from kotlin metadata */
    public boolean resultAdRequested;

    /* JADX INFO: renamed from: s, reason: collision with root package name and from kotlin metadata */
    public boolean scanEndAdRequested;

    /* JADX INFO: renamed from: t, reason: collision with root package name and from kotlin metadata */
    public boolean exitInProgress;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static final String f64725w = "state_scan_end_interstitial_requested" /* decoded XOR */;

    /* JADX INFO: renamed from: o, reason: collision with root package name and from kotlin metadata */
    public final a photosAdapter = new a(new g(this));

    /* JADX INFO: renamed from: u, reason: collision with root package name and from kotlin metadata */
    public final e.d detailLauncher = registerForActivityResult(new f.d(), new e.b() { // from class: com.neeeex.ctools.features.photocompressor.gallery.f
        @Override // e.b
        public final void a(Object obj) {
            PhotoCompressorNEEEEXActivity.u0(this.f64772a, (e.a) obj);
        }
    });

    public interface b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f64745a = a.f64746a;

        public static final class a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final /* synthetic */ a f64746a = new a();

            public final b a(m mVar) {
                "state" /* decoded XOR */;
                mVar.getClass();
                if (v.c(mVar, m.c.f64792a)) {
                    return d.f64751b;
                }
                if (mVar instanceof m.b) {
                    return new c(((m.b) mVar).a());
                }
                if (mVar instanceof m.a) {
                    m.a aVar = (m.a) mVar;
                    return new C0762b(aVar.d(), aVar.c().a(aVar.d().getShowsCompressed$tool_feature_productionRelease()), aVar.d() == n.ALL ? R$string.ctools_neeeex_photo_compressor_empty_all : R$string.ctools_neeeex_photo_compressor_empty_compressed);
                }
                coil.util.j.a();
                return null;
            }
        }

        /* JADX INFO: renamed from: com.neeeex.ctools.features.photocompressor.gallery.PhotoCompressorNEEEEXActivity$b$b, reason: collision with other inner class name */
        public static final class C0762b implements b {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final n f64747b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final List f64748c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            public final int f64749d;

            public C0762b(n nVar, List list, int i10) {
                "tab" /* decoded XOR */;
                nVar.getClass();
                "items" /* decoded XOR */;
                list.getClass();
                this.f64747b = nVar;
                this.f64748c = list;
                this.f64749d = i10;
            }

            public final int a() {
                return this.f64749d;
            }

            public final List b() {
                return this.f64748c;
            }

            public final n c() {
                return this.f64747b;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof C0762b)) {
                    return false;
                }
                C0762b c0762b = (C0762b) obj;
                return this.f64747b == c0762b.f64747b && v.c(this.f64748c, c0762b.f64748c) && this.f64749d == c0762b.f64749d;
            }

            public int hashCode() {
                return (((this.f64747b.hashCode() * 31) + this.f64748c.hashCode()) * 31) + Integer.hashCode(this.f64749d);
            }

            public String toString() {
                return "Content(tab=" + this.f64747b + ", items=" + this.f64748c + ", emptyMessageRes=" + this.f64749d + ")";
            }
        }

        public static final class c implements b {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final int f64750b;

            public c(int i10) {
                this.f64750b = i10;
            }

            public final int a() {
                return this.f64750b;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof c) && this.f64750b == ((c) obj).f64750b;
            }

            public int hashCode() {
                return Integer.hashCode(this.f64750b);
            }

            public String toString() {
                return "Error(messageRes=" + this.f64750b + ")";
            }
        }

        public static final class d implements b {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public static final d f64751b = new d();

            public boolean equals(Object obj) {
                return this == obj || (obj instanceof d);
            }

            public int hashCode() {
                return 273983532;
            }

            public String toString() {
                return "Loading" /* decoded XOR */;
            }
        }
    }

    public static final class c extends RecyclerView.p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f64752a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f64753b;

        public c(int i10, int i11) {
            this.f64752a = i10;
            this.f64753b = i11;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.p
        public void getItemOffsets(Rect rect, View view, RecyclerView recyclerView, RecyclerView.c0 c0Var) {
            "outRect" /* decoded XOR */;
            rect.getClass();
            "view" /* decoded XOR */;
            view.getClass();
            "parent" /* decoded XOR */;
            recyclerView.getClass();
            "state" /* decoded XOR */;
            c0Var.getClass();
            int childAdapterPosition = recyclerView.getChildAdapterPosition(view);
            if (childAdapterPosition == -1) {
                return;
            }
            int i10 = this.f64752a;
            int i11 = childAdapterPosition % i10;
            int i12 = this.f64753b;
            rect.left = (i12 * i11) / i10;
            rect.right = i12 - (((i11 + 1) * i12) / i10);
            rect.bottom = i12;
        }
    }

    public static final class d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f64754a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f64755b;

        public d(int i10) {
            this.f64754a = i10;
            this.f64755b = q.p(i10, 0, 100);
        }

        public final int a() {
            return this.f64755b;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof d) && this.f64754a == ((d) obj).f64754a;
        }

        public int hashCode() {
            return Integer.hashCode(this.f64754a);
        }

        public String toString() {
            return "ScanProgress(raw=" + this.f64754a + ")";
        }
    }

    public static final class h implements Observer, p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Function1 f64756a;

        public h(Function1 function1) {
            "function" /* decoded XOR */;
            function1.getClass();
            this.f64756a = function1;
        }

        public final boolean equals(Object obj) {
            if ((obj instanceof Observer) && (obj instanceof p)) {
                return v.c(getFunctionDelegate(), ((p) obj).getFunctionDelegate());
            }
            return false;
        }

        @Override // p003kotlin.jvm.internal.p
        public final fl.h getFunctionDelegate() {
            return this.f64756a;
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }

        @Override // androidx.p002lifecycle.Observer
        public final /* synthetic */ void onChanged(Object obj) {
            this.f64756a.invoke(obj);
        }
    }

    private final void C0() {
        final View viewFindViewById = findViewById(R$id.neeeex_photo_compressor_toolbar);
        ViewGroup.LayoutParams layoutParams = viewFindViewById.getLayoutParams();
        View view = null;
        ViewGroup.MarginLayoutParams marginLayoutParams = layoutParams instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams : null;
        final int i10 = marginLayoutParams != null ? marginLayoutParams.topMargin : 0;
        FrameLayout frameLayout = this.resultAd;
        if (frameLayout == null) {
            v.n("resultAd" /* decoded XOR */);
            frameLayout = null;
        }
        ViewGroup.LayoutParams layoutParams2 = frameLayout.getLayoutParams();
        ViewGroup.MarginLayoutParams marginLayoutParams2 = layoutParams2 instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams2 : null;
        final int i11 = marginLayoutParams2 != null ? marginLayoutParams2.bottomMargin : 0;
        Window window = getWindow();
        View view2 = this.rootView;
        if (view2 == null) {
            v.n("rootView" /* decoded XOR */);
            view2 = null;
        }
        d1 d1VarA = a1.a(window, view2);
        d1VarA.d(true);
        d1VarA.c(true);
        View view3 = this.rootView;
        if (view3 == null) {
            v.n("rootView" /* decoded XOR */);
            view3 = null;
        }
        androidx.core.view.m0.w0(view3, new y() { // from class: com.neeeex.ctools.features.photocompressor.gallery.e
            @Override // androidx.core.view.y
            public final c1 a(View view4, c1 c1Var) {
                return PhotoCompressorNEEEEXActivity.v0(viewFindViewById, this, i10, i11, view4, c1Var);
            }
        });
        View view4 = this.rootView;
        if (view4 == null) {
            v.n("rootView" /* decoded XOR */);
        } else {
            view = view4;
        }
        androidx.core.view.m0.i0(view);
    }

    private final void D0() {
        View viewFindViewById = findViewById(R$id.neeeex_photo_compressor_root);
        "findViewById(...)" /* decoded XOR */;
        viewFindViewById.getClass();
        this.rootView = viewFindViewById;
        View viewFindViewById2 = findViewById(R$id.neeeex_photo_compressor_loading_view);
        "findViewById(...)" /* decoded XOR */;
        viewFindViewById2.getClass();
        this.scanningView = viewFindViewById2;
        View viewFindViewById3 = findViewById(R$id.neeeex_photo_compressor_lottie);
        "findViewById(...)" /* decoded XOR */;
        viewFindViewById3.getClass();
        this.scanAnimation = (LottieAnimationView) viewFindViewById3;
        View viewFindViewById4 = findViewById(R$id.neeeex_photo_compressor_tabs);
        "findViewById(...)" /* decoded XOR */;
        viewFindViewById4.getClass();
        this.tabBar = viewFindViewById4;
        View viewFindViewById5 = findViewById(R$id.neeeex_photo_compressor_tab_all);
        "findViewById(...)" /* decoded XOR */;
        viewFindViewById5.getClass();
        this.allTab = (TextView) viewFindViewById5;
        View viewFindViewById6 = findViewById(R$id.neeeex_photo_compressor_tab_compressed);
        "findViewById(...)" /* decoded XOR */;
        viewFindViewById6.getClass();
        this.compressedTab = (TextView) viewFindViewById6;
        View viewFindViewById7 = findViewById(R$id.neeeex_photo_compressor_grid);
        "findViewById(...)" /* decoded XOR */;
        viewFindViewById7.getClass();
        this.photoGrid = (RecyclerView) viewFindViewById7;
        View viewFindViewById8 = findViewById(R$id.neeeex_photo_compressor_progress);
        "findViewById(...)" /* decoded XOR */;
        viewFindViewById8.getClass();
        this.scanProgress = (ProgressBar) viewFindViewById8;
        View viewFindViewById9 = findViewById(R$id.neeeex_photo_compressor_percentage);
        "findViewById(...)" /* decoded XOR */;
        viewFindViewById9.getClass();
        this.scanPercentage = (TextView) viewFindViewById9;
        View viewFindViewById10 = findViewById(R$id.neeeex_photo_compressor_empty);
        "findViewById(...)" /* decoded XOR */;
        viewFindViewById10.getClass();
        this.emptyView = (TextView) viewFindViewById10;
        View viewFindViewById11 = findViewById(R$id.neeeex_photo_compressor_ad_container);
        "findViewById(...)" /* decoded XOR */;
        viewFindViewById11.getClass();
        this.resultAd = (FrameLayout) viewFindViewById11;
    }

    private final int G0(int value) {
        return (int) (value * getResources().getDisplayMetrics().density);
    }

    private final void H0() {
        if (this.exitInProgress) {
            return;
        }
        this.exitInProgress = true;
        j jVar = this.model;
        LottieAnimationView lottieAnimationView = null;
        if (jVar == null) {
            v.n("model" /* decoded XOR */);
            jVar = null;
        }
        jVar.l();
        LottieAnimationView lottieAnimationView2 = this.scanAnimation;
        if (lottieAnimationView2 == null) {
            v.n("scanAnimation" /* decoded XOR */);
        } else {
            lottieAnimationView = lottieAnimationView2;
        }
        lottieAnimationView.m();
        zi.l.f104405a.b(this, "neeeex_pdf_clean_scan_exit_fs" /* decoded XOR */, zi.n.PHOTO_COMPRESSOR);
    }

    private final void I0() {
        if (this.exitInProgress) {
            return;
        }
        if (this.resultDisplayed) {
            H0();
            return;
        }
        ExitScanDialog exitScanDialogB = ExitScanDialog.Companion.b(ExitScanDialog.INSTANCE, 0, 1, null);
        exitScanDialogB.p(new ki.a() { // from class: com.neeeex.ctools.features.photocompressor.gallery.i
            @Override // ki.a
            public final void a() {
                PhotoCompressorNEEEEXActivity.J0(this.f64775a);
            }
        });
        l0 supportFragmentManager = getSupportFragmentManager();
        "getSupportFragmentManager(...)" /* decoded XOR */;
        supportFragmentManager.getClass();
        exitScanDialogB.i(supportFragmentManager);
    }

    public static final void J0(PhotoCompressorNEEEEXActivity photoCompressorNEEEEXActivity) {
        photoCompressorNEEEEXActivity.H0();
    }

    public static void s0(PhotoCompressorNEEEEXActivity photoCompressorNEEEEXActivity, View view) {
        j jVar = photoCompressorNEEEEXActivity.model;
        if (jVar == null) {
            v.n("model" /* decoded XOR */);
            jVar = null;
        }
        jVar.s(n.COMPRESSED);
    }

    public static void t0(PhotoCompressorNEEEEXActivity photoCompressorNEEEEXActivity, View view) {
        j jVar = photoCompressorNEEEEXActivity.model;
        if (jVar == null) {
            v.n("model" /* decoded XOR */);
            jVar = null;
        }
        jVar.s(n.ALL);
    }

    public static void u0(PhotoCompressorNEEEEXActivity photoCompressorNEEEEXActivity, e.a aVar) {
        "result" /* decoded XOR */;
        aVar.getClass();
        photoCompressorNEEEEXActivity.waitingForDetail = false;
        if (aVar.b() == -1) {
            j jVar = photoCompressorNEEEEXActivity.model;
            if (jVar == null) {
                v.n("model" /* decoded XOR */);
                jVar = null;
            }
            jVar.r(n.COMPRESSED);
        }
    }

    public static c1 v0(View view, PhotoCompressorNEEEEXActivity photoCompressorNEEEEXActivity, int i10, int i11, View view2, c1 c1Var) {
        "<unused var>" /* decoded XOR */;
        view2.getClass();
        "insets" /* decoded XOR */;
        c1Var.getClass();
        o2.d dVarF = c1Var.f(c1.p.i());
        "getInsets(...)" /* decoded XOR */;
        dVarF.getClass();
        view.getClass();
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams == null) {
            b0.a("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams" /* decoded XOR */);
            return null;
        }
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
        marginLayoutParams.topMargin = i10 + dVarF.f89981b;
        view.setLayoutParams(marginLayoutParams);
        FrameLayout frameLayout = photoCompressorNEEEEXActivity.resultAd;
        if (frameLayout == null) {
            v.n("resultAd" /* decoded XOR */);
            frameLayout = null;
        }
        ViewGroup.LayoutParams layoutParams2 = frameLayout.getLayoutParams();
        if (layoutParams2 == null) {
            b0.a("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams" /* decoded XOR */);
            return null;
        }
        ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) layoutParams2;
        marginLayoutParams2.bottomMargin = i11 + dVarF.f89983d;
        frameLayout.setLayoutParams(marginLayoutParams2);
        return c1Var;
    }

    public static fl.m0 w0(PhotoCompressorNEEEEXActivity photoCompressorNEEEEXActivity, k0 k0Var) {
        "$this$addCallback" /* decoded XOR */;
        k0Var.getClass();
        photoCompressorNEEEEXActivity.I0();
        return fl.m0.f80959a;
    }

    public static void y0(PhotoCompressorNEEEEXActivity photoCompressorNEEEEXActivity, View view) {
        photoCompressorNEEEEXActivity.I0();
    }

    public final void E0() {
        findViewById(R$id.neeeex_photo_compressor_back).setOnClickListener(new View.OnClickListener() { // from class: com.neeeex.ctools.features.photocompressor.gallery.c
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                PhotoCompressorNEEEEXActivity.y0(this.f64766a, view);
            }
        });
        o0.b(getOnBackPressedDispatcher(), this, false, new Function1() { // from class: com.neeeex.ctools.features.photocompressor.gallery.d
            @Override // p003kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return PhotoCompressorNEEEEXActivity.w0(this.f64767a, (k0) obj);
            }
        }, 2, null);
        F0();
        RecyclerView recyclerView = this.photoGrid;
        if (recyclerView == null) {
            v.n("photoGrid" /* decoded XOR */);
            recyclerView = null;
        }
        recyclerView.setLayoutManager(new GridLayoutManager(this, 3));
        recyclerView.addItemDecoration(new c(3, G0(8)));
        recyclerView.setAdapter(this.photosAdapter);
        recyclerView.setItemAnimator(null);
    }

    public final void F0() {
        TextView textView = this.allTab;
        TextView textView2 = null;
        if (textView == null) {
            v.n("allTab" /* decoded XOR */);
            textView = null;
        }
        textView.setOnClickListener(new View.OnClickListener() { // from class: com.neeeex.ctools.features.photocompressor.gallery.g
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                PhotoCompressorNEEEEXActivity.t0(this.f64773a, view);
            }
        });
        TextView textView3 = this.compressedTab;
        if (textView3 == null) {
            v.n("compressedTab" /* decoded XOR */);
        } else {
            textView2 = textView3;
        }
        textView2.setOnClickListener(new View.OnClickListener() { // from class: com.neeeex.ctools.features.photocompressor.gallery.h
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                PhotoCompressorNEEEEXActivity.s0(this.f64774a, view);
            }
        });
        O0(n.ALL);
    }

    public final void K0(com.neeeex.ctools.features.photocompressor.data.c item) {
        if (this.waitingForDetail) {
            return;
        }
        this.waitingForDetail = true;
        if (!item.f()) {
            mi.a.f88870a.O();
        }
        this.detailLauncher.a(com.neeeex.ctools.features.photocompressor.detail.a.f64678a.a(this, item));
    }

    public final void L0(m state) {
        if (this.exitInProgress) {
            return;
        }
        b bVarA = b.f64745a.a(state);
        if (v.c(bVarA, b.d.f64751b)) {
            if (this.resultDisplayed) {
                return;
            }
            P0();
            return;
        }
        TextView textView = null;
        if (bVarA instanceof b.c) {
            this.resultDisplayed = true;
            Q0();
            RecyclerView recyclerView = this.photoGrid;
            if (recyclerView == null) {
                v.n("photoGrid" /* decoded XOR */);
                recyclerView = null;
            }
            recyclerView.setVisibility(8);
            TextView textView2 = this.emptyView;
            if (textView2 == null) {
                v.n("emptyView" /* decoded XOR */);
                textView2 = null;
            }
            textView2.setVisibility(0);
            TextView textView3 = this.emptyView;
            if (textView3 == null) {
                v.n("emptyView" /* decoded XOR */);
            } else {
                textView = textView3;
            }
            textView.setText(((b.c) bVarA).a());
            return;
        }
        if (!(bVarA instanceof b.C0762b)) {
            coil.util.j.a();
            return;
        }
        this.resultDisplayed = true;
        Q0();
        b.C0762b c0762b = (b.C0762b) bVarA;
        O0(c0762b.c());
        this.photosAdapter.i(c0762b.b());
        boolean zIsEmpty = c0762b.b().isEmpty();
        RecyclerView recyclerView2 = this.photoGrid;
        if (recyclerView2 == null) {
            v.n("photoGrid" /* decoded XOR */);
            recyclerView2 = null;
        }
        recyclerView2.setVisibility(!zIsEmpty ? 0 : 8);
        TextView textView4 = this.emptyView;
        if (textView4 == null) {
            v.n("emptyView" /* decoded XOR */);
            textView4 = null;
        }
        textView4.setVisibility(zIsEmpty ? 0 : 8);
        TextView textView5 = this.emptyView;
        if (textView5 == null) {
            v.n("emptyView" /* decoded XOR */);
        } else {
            textView = textView5;
        }
        textView.setText(c0762b.a());
    }

    public final void M0() {
        if (this.resultAdRequested) {
            return;
        }
        this.resultAdRequested = true;
        FrameLayout frameLayout = this.resultAd;
        if (frameLayout == null) {
            v.n("resultAd" /* decoded XOR */);
            frameLayout = null;
        }
        BaseAdActivity.showRenderAdAndRefresh$default(this, frameLayout, R$layout.ad_neeeex_native_white, "CTOOLS_PHOTO_COMPRESSOR_RESULT_NATIVE" /* decoded XOR */, null, 8, null);
    }

    public final void N0(int value) {
        if (this.resultDisplayed) {
            return;
        }
        d dVar = new d(value);
        ProgressBar progressBar = this.scanProgress;
        TextView textView = null;
        if (progressBar == null) {
            v.n("scanProgress" /* decoded XOR */);
            progressBar = null;
        }
        progressBar.setProgress(dVar.a());
        TextView textView2 = this.scanPercentage;
        if (textView2 == null) {
            v.n("scanPercentage" /* decoded XOR */);
        } else {
            textView = textView2;
        }
        textView.setText(getString(R$string.ctools_neeeex_loading_percentage, new Object[]{Integer.valueOf(dVar.a())}));
    }

    public final void O0(n tab) {
        TextView textView = this.allTab;
        TextView textView2 = null;
        if (textView == null) {
            v.n("allTab" /* decoded XOR */);
            textView = null;
        }
        textView.setSelected(tab == n.ALL);
        TextView textView3 = this.compressedTab;
        if (textView3 == null) {
            v.n("compressedTab" /* decoded XOR */);
        } else {
            textView2 = textView3;
        }
        textView2.setSelected(tab == n.COMPRESSED);
    }

    public final void P0() {
        View view = this.rootView;
        FrameLayout frameLayout = null;
        if (view == null) {
            v.n("rootView" /* decoded XOR */);
            view = null;
        }
        view.setBackgroundColor(l2.a.getColor(this, R$color.color_neeeex_brand_1));
        View view2 = this.scanningView;
        if (view2 == null) {
            v.n("scanningView" /* decoded XOR */);
            view2 = null;
        }
        view2.setVisibility(0);
        LottieAnimationView lottieAnimationView = this.scanAnimation;
        if (lottieAnimationView == null) {
            v.n("scanAnimation" /* decoded XOR */);
            lottieAnimationView = null;
        }
        lottieAnimationView.v();
        View view3 = this.tabBar;
        if (view3 == null) {
            v.n("tabBar" /* decoded XOR */);
            view3 = null;
        }
        view3.setVisibility(8);
        RecyclerView recyclerView = this.photoGrid;
        if (recyclerView == null) {
            v.n("photoGrid" /* decoded XOR */);
            recyclerView = null;
        }
        recyclerView.setVisibility(8);
        TextView textView = this.emptyView;
        if (textView == null) {
            v.n("emptyView" /* decoded XOR */);
            textView = null;
        }
        textView.setVisibility(8);
        FrameLayout frameLayout2 = this.resultAd;
        if (frameLayout2 == null) {
            v.n("resultAd" /* decoded XOR */);
        } else {
            frameLayout = frameLayout2;
        }
        frameLayout.setVisibility(8);
    }

    public final void Q0() {
        View view = this.rootView;
        TextView textView = null;
        if (view == null) {
            v.n("rootView" /* decoded XOR */);
            view = null;
        }
        view.setBackgroundColor(l2.a.getColor(this, R.color.white));
        LottieAnimationView lottieAnimationView = this.scanAnimation;
        if (lottieAnimationView == null) {
            v.n("scanAnimation" /* decoded XOR */);
            lottieAnimationView = null;
        }
        lottieAnimationView.u();
        View view2 = this.scanningView;
        if (view2 == null) {
            v.n("scanningView" /* decoded XOR */);
            view2 = null;
        }
        view2.setVisibility(8);
        View view3 = this.tabBar;
        if (view3 == null) {
            v.n("tabBar" /* decoded XOR */);
            view3 = null;
        }
        view3.setVisibility(0);
        TextView textView2 = this.emptyView;
        if (textView2 == null) {
            v.n("emptyView" /* decoded XOR */);
        } else {
            textView = textView2;
        }
        textView.setVisibility(8);
        R0();
        M0();
    }

    public final void R0() {
        if (this.scanEndAdRequested) {
            return;
        }
        this.scanEndAdRequested = true;
        if (com.neeeex.eraser.module.report.bytedance.a.k()) {
            BaseAdActivity.showInter$default(this, "CTOOLS_PHOTO_COMPRESSOR_SCAN_END_IN" /* decoded XOR */, null, 2, null);
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x001a  */
    @Override // com.neeeex.eraser.base.RootActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle savedInstanceState) {
        boolean z10;
        super.onCreate(savedInstanceState);
        j jVar = null;
        w.b(this, null, null, 3, null);
        setContentView(R$layout.activity_neeeex_photo_compressor);
        if (savedInstanceState != null) {
            z10 = savedInstanceState.getBoolean(f64725w);
        }
        this.scanEndAdRequested = z10;
        this.model = (j) new ViewModelProvider(this).get(j.class);
        D0();
        E0();
        C0();
        N0(0);
        j jVar2 = this.model;
        if (jVar2 == null) {
            v.n("model" /* decoded XOR */);
            jVar2 = null;
        }
        jVar2.p().observe(this, new h(new e(this)));
        j jVar3 = this.model;
        if (jVar3 == null) {
            v.n("model" /* decoded XOR */);
        } else {
            jVar = jVar3;
        }
        jVar.q().observe(this, new h(new f(this)));
    }

    @Override // androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onSaveInstanceState(Bundle outState) {
        "outState" /* decoded XOR */;
        outState.getClass();
        outState.putBoolean(f64725w, this.scanEndAdRequested);
        super.onSaveInstanceState(outState);
    }

    public static final /* synthetic */ class e extends s implements Function1 {
        public e(Object obj) {
            super(1, obj, PhotoCompressorNEEEEXActivity.class, "renderScanProgress" /* decoded XOR */, "renderScanProgress(I)V" /* decoded XOR */, 0);
        }

        @Override // p003kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke(((Number) obj).intValue());
            return fl.m0.f80959a;
        }

        public final void invoke(int i10) {
            ((PhotoCompressorNEEEEXActivity) this.receiver).N0(i10);
        }
    }

    public static final /* synthetic */ class f extends s implements Function1 {
        public f(Object obj) {
            super(1, obj, PhotoCompressorNEEEEXActivity.class, "render" /* decoded XOR */, "render(Lcom/neeeex/ctools/features/photocompressor/gallery/PhotoGalleryState;)V" /* decoded XOR */, 0);
        }

        public final void invoke(m mVar) {
            "p0" /* decoded XOR */;
            mVar.getClass();
            ((PhotoCompressorNEEEEXActivity) this.receiver).L0(mVar);
        }

        @Override // p003kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((m) obj);
            return fl.m0.f80959a;
        }
    }

    public static final /* synthetic */ class g extends s implements Function1 {
        public g(Object obj) {
            super(1, obj, PhotoCompressorNEEEEXActivity.class, "openPhoto" /* decoded XOR */, "openPhoto(Lcom/neeeex/ctools/features/photocompressor/data/PhotoMediaItem;)V" /* decoded XOR */, 0);
        }

        public final void invoke(com.neeeex.ctools.features.photocompressor.data.c cVar) {
            "p0" /* decoded XOR */;
            cVar.getClass();
            ((PhotoCompressorNEEEEXActivity) this.receiver).K0(cVar);
        }

        @Override // p003kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((com.neeeex.ctools.features.photocompressor.data.c) obj);
            return fl.m0.f80959a;
        }
    }
}