package com.neeeex.ctools.features.appmanager;

import android.R;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;
import android.widget.Toast;
import androidx.core.view.a1;
import androidx.core.view.c1;
import androidx.core.view.d1;
import androidx.core.view.y;
import androidx.fragment.app.l0;
import androidx.p002lifecycle.Observer;
import androidx.p002lifecycle.ViewModelProvider;
import androidx.recyclerview.widget.LinearLayoutManager;
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
import java.util.List;
import p003kotlin.Metadata;
import p003kotlin.jvm.functions.Function0;
import p003kotlin.jvm.functions.Function1;
import p003kotlin.jvm.internal.s;
import p003kotlin.jvm.internal.v;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0092\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u0000 ^2\u00020\u0001:\u0002_`B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0019\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0014¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\n\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\u0004H\u0014¢\u0006\u0004\b\n\u0010\bJ\u000f\u0010\u000b\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u000b\u0010\u0003J\u000f\u0010\f\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\f\u0010\u0003J\u000f\u0010\r\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\r\u0010\u0003J\u000f\u0010\u000e\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u000e\u0010\u0003J\u000f\u0010\u000f\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u000f\u0010\u0003J\u000f\u0010\u0010\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0010\u0010\u0003J\u000f\u0010\u0011\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0011\u0010\u0003J\u0017\u0010\u0014\u001a\u00020\u00062\u0006\u0010\u0013\u001a\u00020\u0012H\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u0017\u0010\u0016\u001a\u00020\u00062\u0006\u0010\u0013\u001a\u00020\u0012H\u0002¢\u0006\u0004\b\u0016\u0010\u0015J#\u0010\u001a\u001a\u00020\u00062\u0012\u0010\u0019\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00120\u00180\u0017H\u0002¢\u0006\u0004\b\u001a\u0010\u001bJ\u000f\u0010\u001c\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u001c\u0010\u0003J\u000f\u0010\u001d\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u001d\u0010\u0003J\u0017\u0010 \u001a\u00020\u00062\u0006\u0010\u001f\u001a\u00020\u001eH\u0002¢\u0006\u0004\b \u0010!J\u000f\u0010\"\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\"\u0010\u0003J\u000f\u0010#\u001a\u00020\u0006H\u0002¢\u0006\u0004\b#\u0010\u0003J\u0017\u0010&\u001a\u00020\u00062\u0006\u0010%\u001a\u00020$H\u0002¢\u0006\u0004\b&\u0010'J\u000f\u0010(\u001a\u00020\u0006H\u0002¢\u0006\u0004\b(\u0010\u0003R\u0016\u0010,\u001a\u00020)8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b*\u0010+R\u0014\u00100\u001a\u00020-8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b.\u0010/R\u0016\u00104\u001a\u0002018\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b2\u00103R\u0016\u00106\u001a\u0002018\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b5\u00103R\u0016\u0010:\u001a\u0002078\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b8\u00109R\u0016\u0010>\u001a\u00020;8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b<\u0010=R\u0016\u0010B\u001a\u00020?8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b@\u0010AR\u0016\u0010D\u001a\u00020?8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\bC\u0010AR\u0016\u0010H\u001a\u00020E8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\bF\u0010GR\u0016\u0010L\u001a\u00020I8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\bJ\u0010KR\u0016\u0010P\u001a\u00020M8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bN\u0010OR\u0016\u0010R\u001a\u00020M8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bQ\u0010OR\u0016\u0010T\u001a\u00020M8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bS\u0010OR\u0016\u0010V\u001a\u00020M8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bU\u0010OR\u0016\u0010X\u001a\u00020M8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bW\u0010OR\u001a\u0010]\u001a\b\u0012\u0004\u0012\u00020Z0Y8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b[\u0010\\¨\u0006a"}, d2 = {"Lcom/neeeex/ctools/features/appmanager/AppManagerNEEEEXActivity;", "Lcom/neeeex/eraser/base/BaseAdActivity;", "<init>", "()V", "Landroid/os/Bundle;", "savedInstanceState", "Lfl/m0;", "onCreate", "(Landroid/os/Bundle;)V", "outState", "onSaveInstanceState", "B0", "C0", "H0", "R0", "M0", "I0", "F0", "Lbi/g;", "item", "K0", "(Lbi/g;)V", "L0", "Lzh/a;", "", TestProtocol.STATE_FIELD, "D0", "(Lzh/a;)V", "Q0", "P0", "", "message", "E0", "(Ljava/lang/String;)V", "O0", "N0", "", "value", "S0", "(I)V", "G0", "Lcom/neeeex/ctools/features/appmanager/q;", "c", "Lcom/neeeex/ctools/features/appmanager/q;", "model", "Lcom/neeeex/ctools/features/appmanager/a;", "d", "Lcom/neeeex/ctools/features/appmanager/a;", "appList", "Landroid/view/View;", "e", "Landroid/view/View;", "rootView", "f", "scanningPanel", "Lcom/airbnb/lottie/LottieAnimationView;", "g", "Lcom/airbnb/lottie/LottieAnimationView;", "scanningAnimation", "Landroid/widget/ProgressBar;", "h", "Landroid/widget/ProgressBar;", "scanningProgress", "Landroid/widget/TextView;", "i", "Landroid/widget/TextView;", "scanningPercentage", "j", "messageView", "Landroidx/recyclerview/widget/RecyclerView;", CampaignEx.JSON_KEY_AD_K, "Landroidx/recyclerview/widget/RecyclerView;", "applicationsView", "Landroid/widget/FrameLayout;", "l", "Landroid/widget/FrameLayout;", "resultAd", "", "m", "Z", "awaitingUninstallResult", com.thinkup.core.common.nn.m.n.f72065d, "resultSurfaceReached", com.thinkup.core.q.o.f74114d, "resultAdRequested", "p", "scanInterstitialRequested", "q", "exitInProgress", "Le/d;", "Landroid/content/Intent;", CampaignEx.JSON_KEY_AD_R, "Le/d;", "uninstallLauncher", "s", DownloadCommon.DOWNLOAD_REPORT_FIND_FILE_RESULT_VALUE_B, "a", "tool-feature_productionRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class AppManagerNEEEEXActivity extends BaseAdActivity {

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    public q model;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    public View rootView;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    public View scanningPanel;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    public LottieAnimationView scanningAnimation;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    public ProgressBar scanningProgress;

    /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata */
    public TextView scanningPercentage;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    public TextView messageView;

    /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata */
    public RecyclerView applicationsView;

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
    public FrameLayout resultAd;

    /* JADX INFO: renamed from: m, reason: collision with root package name and from kotlin metadata */
    public boolean awaitingUninstallResult;

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    public boolean resultSurfaceReached;

    /* JADX INFO: renamed from: o, reason: collision with root package name and from kotlin metadata */
    public boolean resultAdRequested;

    /* JADX INFO: renamed from: p, reason: collision with root package name and from kotlin metadata */
    public boolean scanInterstitialRequested;

    /* JADX INFO: renamed from: q, reason: collision with root package name and from kotlin metadata */
    public boolean exitInProgress;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final String f64174t = "state_scan_end_interstitial_requested" /* decoded XOR */;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    public final a appList = new a(new c(this));

    /* JADX INFO: renamed from: r, reason: collision with root package name and from kotlin metadata */
    public final e.d uninstallLauncher = registerForActivityResult(new f.d(), new e.b() { // from class: com.neeeex.ctools.features.appmanager.i
        @Override // e.b
        public final void a(Object obj) {
            AppManagerNEEEEXActivity.x0(this.f64211a, (e.a) obj);
        }
    });

    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f64191a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f64192b;

        public b(int i10) {
            this.f64191a = i10;
            this.f64192b = am.q.p(i10, 0, 100);
        }

        public final int a() {
            return this.f64192b;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof b) && this.f64191a == ((b) obj).f64191a;
        }

        public int hashCode() {
            return Integer.hashCode(this.f64191a);
        }

        public String toString() {
            return "ProgressDisplay(raw=" + this.f64191a + ")";
        }
    }

    public static final class f implements Observer, p003kotlin.jvm.internal.p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Function1 f64193a;

        public f(Function1 function1) {
            "function" /* decoded XOR */;
            function1.getClass();
            this.f64193a = function1;
        }

        public final boolean equals(Object obj) {
            if ((obj instanceof Observer) && (obj instanceof p003kotlin.jvm.internal.p)) {
                return v.c(getFunctionDelegate(), ((p003kotlin.jvm.internal.p) obj).getFunctionDelegate());
            }
            return false;
        }

        @Override // p003kotlin.jvm.internal.p
        public final fl.h getFunctionDelegate() {
            return this.f64193a;
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }

        @Override // androidx.p002lifecycle.Observer
        public final /* synthetic */ void onChanged(Object obj) {
            this.f64193a.invoke(obj);
        }
    }

    public static final void J0(AppManagerNEEEEXActivity appManagerNEEEEXActivity) {
        appManagerNEEEEXActivity.F0();
    }

    public static fl.m0 s0(AppManagerNEEEEXActivity appManagerNEEEEXActivity, k0 k0Var) {
        "$this$addCallback" /* decoded XOR */;
        k0Var.getClass();
        appManagerNEEEEXActivity.I0();
        return fl.m0.f80959a;
    }

    public static fl.m0 u0(AppManagerNEEEEXActivity appManagerNEEEEXActivity, bi.g gVar) {
        appManagerNEEEEXActivity.L0(gVar);
        return fl.m0.f80959a;
    }

    public static c1 v0(View view, AppManagerNEEEEXActivity appManagerNEEEEXActivity, int i10, int i11, View view2, c1 c1Var) {
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
        FrameLayout frameLayout = appManagerNEEEEXActivity.resultAd;
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

    public static void w0(AppManagerNEEEEXActivity appManagerNEEEEXActivity, View view) {
        appManagerNEEEEXActivity.I0();
    }

    public static void x0(AppManagerNEEEEXActivity appManagerNEEEEXActivity, e.a aVar) {
        "it" /* decoded XOR */;
        aVar.getClass();
        appManagerNEEEEXActivity.awaitingUninstallResult = false;
        q qVar = appManagerNEEEEXActivity.model;
        if (qVar == null) {
            v.n("model" /* decoded XOR */);
            qVar = null;
        }
        qVar.l();
    }

    public final void B0() {
        View viewFindViewById = findViewById(R$id.neeeex_app_manager_root);
        "findViewById(...)" /* decoded XOR */;
        viewFindViewById.getClass();
        this.rootView = viewFindViewById;
        View viewFindViewById2 = findViewById(R$id.neeeex_app_manager_loading);
        "findViewById(...)" /* decoded XOR */;
        viewFindViewById2.getClass();
        this.scanningPanel = viewFindViewById2;
        View viewFindViewById3 = findViewById(R$id.neeeex_app_manager_lottie);
        "findViewById(...)" /* decoded XOR */;
        viewFindViewById3.getClass();
        this.scanningAnimation = (LottieAnimationView) viewFindViewById3;
        View viewFindViewById4 = findViewById(R$id.neeeex_app_manager_progress);
        "findViewById(...)" /* decoded XOR */;
        viewFindViewById4.getClass();
        this.scanningProgress = (ProgressBar) viewFindViewById4;
        View viewFindViewById5 = findViewById(R$id.neeeex_app_manager_percentage);
        "findViewById(...)" /* decoded XOR */;
        viewFindViewById5.getClass();
        this.scanningPercentage = (TextView) viewFindViewById5;
        View viewFindViewById6 = findViewById(R$id.neeeex_app_manager_empty_text);
        "findViewById(...)" /* decoded XOR */;
        viewFindViewById6.getClass();
        this.messageView = (TextView) viewFindViewById6;
        View viewFindViewById7 = findViewById(R$id.neeeex_app_manager_recycler_view);
        "findViewById(...)" /* decoded XOR */;
        viewFindViewById7.getClass();
        this.applicationsView = (RecyclerView) viewFindViewById7;
        View viewFindViewById8 = findViewById(R$id.neeeex_app_manager_ad_container_banner);
        "findViewById(...)" /* decoded XOR */;
        viewFindViewById8.getClass();
        this.resultAd = (FrameLayout) viewFindViewById8;
        ((ImageView) findViewById(R$id.neeeex_app_manager_button_back)).setOnClickListener(new View.OnClickListener() { // from class: com.neeeex.ctools.features.appmanager.g
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                AppManagerNEEEEXActivity.w0(this.f64209a, view);
            }
        });
        o0.b(getOnBackPressedDispatcher(), this, false, new Function1() { // from class: com.neeeex.ctools.features.appmanager.h
            @Override // p003kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return AppManagerNEEEEXActivity.s0(this.f64210a, (k0) obj);
            }
        }, 2, null);
    }

    public final void C0() {
        RecyclerView recyclerView = this.applicationsView;
        if (recyclerView == null) {
            v.n("applicationsView" /* decoded XOR */);
            recyclerView = null;
        }
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setAdapter(this.appList);
    }

    public final void D0(zh.a state) {
        Object nVar;
        Object nVar2;
        if (this.exitInProgress) {
            return;
        }
        if (v.c(state, zh.a.d.f104379a)) {
            nVar = p.f64222a;
        } else if (v.c(state, zh.a.e.f104380a)) {
            nVar = this.resultSurfaceReached ? p.f64222a : o.f64221a;
        } else {
            if (state instanceof zh.a.C1347a) {
                nVar2 = new m((List) ((zh.a.C1347a) state).a());
            } else if (state instanceof zh.a.b) {
                nVar2 = new n(((zh.a.b) state).a());
            } else if (state instanceof zh.a.c) {
                nVar2 = new n(((zh.a.c) state).a());
            } else {
                if (!v.c(state, zh.a.f.f104381a)) {
                    coil.util.j.a();
                    return;
                }
                String string = getString(R$string.ctools_neeeex_app_manager_error);
                "getString(...)" /* decoded XOR */;
                string.getClass();
                nVar = new n(string);
            }
            nVar = nVar2;
        }
        if (v.c(nVar, p.f64222a)) {
            return;
        }
        if (v.c(nVar, o.f64221a)) {
            Q0();
            return;
        }
        if (nVar instanceof m) {
            this.resultSurfaceReached = true;
            P0();
            this.appList.i(((m) nVar).a());
        } else if (nVar instanceof n) {
            E0(((n) nVar).a());
        } else {
            coil.util.j.a();
        }
    }

    public final void E0(String message) {
        this.resultSurfaceReached = true;
        O0();
        RecyclerView recyclerView = this.applicationsView;
        TextView textView = null;
        if (recyclerView == null) {
            v.n("applicationsView" /* decoded XOR */);
            recyclerView = null;
        }
        recyclerView.setVisibility(8);
        TextView textView2 = this.messageView;
        if (textView2 == null) {
            v.n("messageView" /* decoded XOR */);
            textView2 = null;
        }
        textView2.setVisibility(0);
        TextView textView3 = this.messageView;
        if (textView3 == null) {
            v.n("messageView" /* decoded XOR */);
        } else {
            textView = textView3;
        }
        textView.setText(message);
    }

    public final void F0() {
        if (this.exitInProgress) {
            return;
        }
        this.exitInProgress = true;
        q qVar = this.model;
        LottieAnimationView lottieAnimationView = null;
        if (qVar == null) {
            v.n("model" /* decoded XOR */);
            qVar = null;
        }
        qVar.g();
        LottieAnimationView lottieAnimationView2 = this.scanningAnimation;
        if (lottieAnimationView2 == null) {
            v.n("scanningAnimation" /* decoded XOR */);
        } else {
            lottieAnimationView = lottieAnimationView2;
        }
        lottieAnimationView.m();
        zi.l.f104405a.b(this, "neeeex_pdf_clean_scan_exit_fs" /* decoded XOR */, zi.n.APP_MANAGER);
    }

    public final void G0() {
        final View viewFindViewById = findViewById(R$id.neeeex_app_manager_layout_title);
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
        androidx.core.view.m0.w0(view3, new y() { // from class: com.neeeex.ctools.features.appmanager.j
            @Override // androidx.core.view.y
            public final c1 a(View view4, c1 c1Var) {
                return AppManagerNEEEEXActivity.v0(viewFindViewById, this, i10, i11, view4, c1Var);
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

    public final void H0() {
        q qVar = this.model;
        q qVar2 = null;
        if (qVar == null) {
            v.n("model" /* decoded XOR */);
            qVar = null;
        }
        qVar.i().observe(this, new f(new d(this)));
        q qVar3 = this.model;
        if (qVar3 == null) {
            v.n("model" /* decoded XOR */);
        } else {
            qVar2 = qVar3;
        }
        qVar2.j().observe(this, new f(new e(this)));
    }

    public final void I0() {
        if (this.exitInProgress) {
            return;
        }
        if (this.resultSurfaceReached) {
            F0();
            return;
        }
        ExitScanDialog exitScanDialogB = ExitScanDialog.Companion.b(ExitScanDialog.INSTANCE, 0, 1, null);
        exitScanDialogB.p(new ki.a() { // from class: com.neeeex.ctools.features.appmanager.k
            @Override // ki.a
            public final void a() {
                AppManagerNEEEEXActivity.J0(this.f64216a);
            }
        });
        l0 supportFragmentManager = getSupportFragmentManager();
        "getSupportFragmentManager(...)" /* decoded XOR */;
        supportFragmentManager.getClass();
        exitScanDialogB.i(supportFragmentManager);
    }

    public final void K0(final bi.g item) {
        if (this.awaitingUninstallResult) {
            return;
        }
        mi.a.f88870a.E();
        this.awaitingUninstallResult = true;
        vh.a.f100781a.f(this, "CTOOLS_APP_MANAGER_UNINSTALL_IN" /* decoded XOR */, vh.a.e.APP_MANAGER, new Function0() { // from class: com.neeeex.ctools.features.appmanager.l
            @Override // p003kotlin.jvm.functions.Function0
            public final Object invoke() {
                return AppManagerNEEEEXActivity.u0(this.f64217a, item);
            }
        });
    }

    public final void L0(bi.g item) {
        try {
            com.neeeex.eraser.ads.e.K = false;
            this.uninstallLauncher.a(r.f64232a.a(item.c()));
        } catch (RuntimeException unused) {
            this.awaitingUninstallResult = false;
            Toast.makeText(this, R$string.ctools_neeeex_app_manager_uninstall_unavailable, 0).show();
            q qVar = this.model;
            if (qVar == null) {
                v.n("model" /* decoded XOR */);
                qVar = null;
            }
            qVar.l();
        }
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
        BaseAdActivity.showRenderAdAndRefresh$default(this, frameLayout, R$layout.ad_neeeex_native_white, "CTOOLS_APP_MANAGER_RESULT_NATIVE" /* decoded XOR */, null, 8, null);
    }

    public final void N0() {
        if (this.scanInterstitialRequested) {
            return;
        }
        this.scanInterstitialRequested = true;
        vh.a.f100781a.e(this, "CTOOLS_APP_MANAGER_SCAN_END_IN" /* decoded XOR */, vh.a.e.APP_MANAGER);
    }

    public final void O0() {
        View view = this.rootView;
        TextView textView = null;
        if (view == null) {
            v.n("rootView" /* decoded XOR */);
            view = null;
        }
        view.setBackgroundColor(l2.a.getColor(this, R.color.white));
        LottieAnimationView lottieAnimationView = this.scanningAnimation;
        if (lottieAnimationView == null) {
            v.n("scanningAnimation" /* decoded XOR */);
            lottieAnimationView = null;
        }
        lottieAnimationView.u();
        View view2 = this.scanningPanel;
        if (view2 == null) {
            v.n("scanningPanel" /* decoded XOR */);
            view2 = null;
        }
        view2.setVisibility(8);
        TextView textView2 = this.messageView;
        if (textView2 == null) {
            v.n("messageView" /* decoded XOR */);
        } else {
            textView = textView2;
        }
        textView.setVisibility(8);
        N0();
        M0();
    }

    public final void P0() {
        O0();
        RecyclerView recyclerView = this.applicationsView;
        if (recyclerView == null) {
            v.n("applicationsView" /* decoded XOR */);
            recyclerView = null;
        }
        recyclerView.setVisibility(0);
    }

    public final void Q0() {
        View view = this.rootView;
        FrameLayout frameLayout = null;
        if (view == null) {
            v.n("rootView" /* decoded XOR */);
            view = null;
        }
        view.setBackgroundColor(l2.a.getColor(this, R$color.color_neeeex_brand_1));
        View view2 = this.scanningPanel;
        if (view2 == null) {
            v.n("scanningPanel" /* decoded XOR */);
            view2 = null;
        }
        view2.setVisibility(0);
        LottieAnimationView lottieAnimationView = this.scanningAnimation;
        if (lottieAnimationView == null) {
            v.n("scanningAnimation" /* decoded XOR */);
            lottieAnimationView = null;
        }
        lottieAnimationView.v();
        RecyclerView recyclerView = this.applicationsView;
        if (recyclerView == null) {
            v.n("applicationsView" /* decoded XOR */);
            recyclerView = null;
        }
        recyclerView.setVisibility(8);
        TextView textView = this.messageView;
        if (textView == null) {
            v.n("messageView" /* decoded XOR */);
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

    public final void R0() {
        q qVar = this.model;
        q qVar2 = null;
        if (qVar == null) {
            v.n("model" /* decoded XOR */);
            qVar = null;
        }
        if (v.c(qVar.j().getValue(), zh.a.d.f104379a)) {
            q qVar3 = this.model;
            if (qVar3 == null) {
                v.n("model" /* decoded XOR */);
            } else {
                qVar2 = qVar3;
            }
            qVar2.l();
        }
    }

    public final void S0(int value) {
        b bVar = new b(value);
        ProgressBar progressBar = this.scanningProgress;
        TextView textView = null;
        if (progressBar == null) {
            v.n("scanningProgress" /* decoded XOR */);
            progressBar = null;
        }
        progressBar.setProgress(bVar.a());
        TextView textView2 = this.scanningPercentage;
        if (textView2 == null) {
            v.n("scanningPercentage" /* decoded XOR */);
        } else {
            textView = textView2;
        }
        textView.setText(getString(R$string.ctools_neeeex_loading_percentage, new Object[]{Integer.valueOf(bVar.a())}));
    }

    @Override // com.neeeex.eraser.base.RootActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        w.b(this, null, null, 3, null);
        setContentView(R$layout.activity_neeeex_app_manager);
        boolean z10 = false;
        if (savedInstanceState != null && savedInstanceState.getBoolean(f64174t)) {
            z10 = true;
        }
        this.scanInterstitialRequested = z10;
        mi.a.f88870a.F();
        this.model = (q) new ViewModelProvider(this).get(q.class);
        B0();
        C0();
        G0();
        H0();
        R0();
    }

    @Override // androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onSaveInstanceState(Bundle outState) {
        "outState" /* decoded XOR */;
        outState.getClass();
        outState.putBoolean(f64174t, this.scanInterstitialRequested);
        super.onSaveInstanceState(outState);
    }

    public static final /* synthetic */ class d extends s implements Function1 {
        public d(Object obj) {
            super(1, obj, AppManagerNEEEEXActivity.class, "updateProgress" /* decoded XOR */, "updateProgress(I)V" /* decoded XOR */, 0);
        }

        @Override // p003kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke(((Number) obj).intValue());
            return fl.m0.f80959a;
        }

        public final void invoke(int i10) {
            ((AppManagerNEEEEXActivity) this.receiver).S0(i10);
        }
    }

    public static final /* synthetic */ class c extends s implements Function1 {
        public c(Object obj) {
            super(1, obj, AppManagerNEEEEXActivity.class, "onUninstallRequested" /* decoded XOR */, "onUninstallRequested(Lcom/neeeex/ctools/features/appmanager/data/ManagedAppItem;)V" /* decoded XOR */, 0);
        }

        public final void invoke(bi.g gVar) {
            "p0" /* decoded XOR */;
            gVar.getClass();
            ((AppManagerNEEEEXActivity) this.receiver).K0(gVar);
        }

        @Override // p003kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((bi.g) obj);
            return fl.m0.f80959a;
        }
    }

    public static final /* synthetic */ class e extends s implements Function1 {
        public e(Object obj) {
            super(1, obj, AppManagerNEEEEXActivity.class, "display" /* decoded XOR */, "display(Lcom/neeeex/ctools/common/state/LoadState;)V" /* decoded XOR */, 0);
        }

        public final void invoke(zh.a aVar) {
            "p0" /* decoded XOR */;
            aVar.getClass();
            ((AppManagerNEEEEXActivity) this.receiver).D0(aVar);
        }

        @Override // p003kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((zh.a) obj);
            return fl.m0.f80959a;
        }
    }
}