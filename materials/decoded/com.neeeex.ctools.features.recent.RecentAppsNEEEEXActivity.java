package com.neeeex.ctools.features.recent;

import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.p002lifecycle.Observer;
import androidx.p002lifecycle.ViewModelProvider;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import b.k0;
import b.o0;
import com.android.launcher3.testing.shared.TestProtocol;
import com.neeeex.ctools.features.permission.UsagePermissionActivity;
import com.neeeex.eraser.R$id;
import com.neeeex.eraser.R$layout;
import com.neeeex.eraser.base.BaseAdActivity;
import com.neeeex.eraser.m0;
import fl.z;
import gl.v0;
import java.util.List;
import java.util.Map;
import p003kotlin.Metadata;
import p003kotlin.jvm.functions.Function0;
import p003kotlin.jvm.functions.Function1;
import p003kotlin.jvm.internal.p;
import p003kotlin.jvm.internal.s;
import p003kotlin.jvm.internal.v;
import zi.l;
import zi.n;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000|\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0005\u0018\u00002\u00020\u0001:\u0001@B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0005\u0010\u0003J\u000f\u0010\u0006\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0006\u0010\u0003J\u000f\u0010\u0007\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\u0003J#\u0010\f\u001a\u00020\u00042\u0012\u0010\u000b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\t0\bH\u0002¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u0010\u001a\u00020\u00042\u0006\u0010\u000f\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u0019\u0010\u0014\u001a\u00020\u00042\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012H\u0014¢\u0006\u0004\b\u0014\u0010\u0015J\u0017\u0010\u0017\u001a\u00020\u00042\u0006\u0010\u0016\u001a\u00020\nH\u0002¢\u0006\u0004\b\u0017\u0010\u0018J\u0017\u0010\u001b\u001a\u00020\u00042\u0006\u0010\u001a\u001a\u00020\u0019H\u0002¢\u0006\u0004\b\u001b\u0010\u001cJ\u0017\u0010\u001f\u001a\u00020\u00042\u0006\u0010\u001e\u001a\u00020\u001dH\u0002¢\u0006\u0004\b\u001f\u0010 J\u0019\u0010!\u001a\u00020\u00042\b\b\u0002\u0010\u001e\u001a\u00020\u001dH\u0002¢\u0006\u0004\b!\u0010 J\u000f\u0010\"\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\"\u0010\u0003R\u0016\u0010&\u001a\u00020#8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b$\u0010%R\u0014\u0010*\u001a\u00020'8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b(\u0010)R\u0016\u0010.\u001a\u00020+8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b,\u0010-R\u0016\u0010\u000f\u001a\u00020/8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b0\u00101R\u0016\u00105\u001a\u0002028\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b3\u00104R\u0016\u00107\u001a\u00020/8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b6\u00101R\u0016\u0010;\u001a\u0002088\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b9\u0010:R\u0016\u0010?\u001a\u00020<8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b=\u0010>¨\u0006A"}, d2 = {"Lcom/neeeex/ctools/features/recent/RecentAppsNEEEEXActivity;", "Lcom/neeeex/eraser/base/BaseAdActivity;", "<init>", "()V", "Lfl/m0;", "A0", "E0", "B0", "Lzh/a;", "", "Lgi/b;", TestProtocol.STATE_FIELD, "D0", "(Lzh/a;)V", "", "message", "G0", "(Ljava/lang/String;)V", "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "(Landroid/os/Bundle;)V", "item", "C0", "(Lgi/b;)V", "Lcom/neeeex/ctools/features/recent/RecentAppsNEEEEXActivity$a;", "screen", "z0", "(Lcom/neeeex/ctools/features/recent/RecentAppsNEEEEXActivity$a;)V", "Lgi/c;", "range", "F0", "(Lgi/c;)V", "J0", "H0", "Lcom/neeeex/ctools/features/recent/i;", "c", "Lcom/neeeex/ctools/features/recent/i;", "model", "Lcom/neeeex/ctools/features/recent/a;", "d", "Lcom/neeeex/ctools/features/recent/a;", "recentAdapter", "Landroid/widget/ProgressBar;", "e", "Landroid/widget/ProgressBar;", "loading", "Landroid/widget/TextView;", "f", "Landroid/widget/TextView;", "Landroidx/recyclerview/widget/RecyclerView;", "g", "Landroidx/recyclerview/widget/RecyclerView;", "recentList", "h", "rangeLabel", "Landroid/view/View;", "i", "Landroid/view/View;", "rangeButton", "", "j", "Z", "exitInProgress", "a", "tool-feature_productionRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class RecentAppsNEEEEXActivity extends BaseAdActivity {

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    public i model;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    public final com.neeeex.ctools.features.recent.a recentAdapter = new com.neeeex.ctools.features.recent.a(new c(this));

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    public ProgressBar loading;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    public TextView message;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    public RecyclerView recentList;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    public TextView rangeLabel;

    /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata */
    public View rangeButton;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    public boolean exitInProgress;

    public interface a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final b f64803a = b.f64805a;

        /* JADX INFO: renamed from: com.neeeex.ctools.features.recent.RecentAppsNEEEEXActivity$a$a, reason: collision with other inner class name */
        public static final class C0766a implements a {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public static final C0766a f64804b = new C0766a();

            public boolean equals(Object obj) {
                return this == obj || (obj instanceof C0766a);
            }

            public int hashCode() {
                return -215771847;
            }

            public String toString() {
                return "Busy" /* decoded XOR */;
            }
        }

        public static final class b {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final /* synthetic */ b f64805a = new b();

            public final a a(zh.a aVar) {
                "state" /* decoded XOR */;
                aVar.getClass();
                if (v.c(aVar, zh.a.d.f104379a)) {
                    return f.f64809b;
                }
                if (v.c(aVar, zh.a.e.f104380a)) {
                    return C0766a.f64804b;
                }
                if (v.c(aVar, zh.a.f.f104381a)) {
                    return e.f64808b;
                }
                if (aVar instanceof zh.a.C1347a) {
                    return new c((List) ((zh.a.C1347a) aVar).a());
                }
                if (aVar instanceof zh.a.b) {
                    return new d(((zh.a.b) aVar).a());
                }
                if (aVar instanceof zh.a.c) {
                    return new d(((zh.a.c) aVar).a());
                }
                coil.util.j.a();
                return null;
            }
        }

        public static final class c implements a {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final List f64806b;

            public c(List list) {
                "value" /* decoded XOR */;
                list.getClass();
                this.f64806b = list;
            }

            public final List a() {
                return this.f64806b;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof c) && v.c(this.f64806b, ((c) obj).f64806b);
            }

            public int hashCode() {
                return this.f64806b.hashCode();
            }

            public String toString() {
                return "Items(value=" + this.f64806b + ")";
            }
        }

        public static final class d implements a {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final String f64807b;

            public d(String str) {
                "value" /* decoded XOR */;
                str.getClass();
                this.f64807b = str;
            }

            public final String a() {
                return this.f64807b;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof d) && v.c(this.f64807b, ((d) obj).f64807b);
            }

            public int hashCode() {
                return this.f64807b.hashCode();
            }

            public String toString() {
                return "Message(value=" + this.f64807b + ")";
            }
        }

        public static final class e implements a {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public static final e f64808b = new e();

            public boolean equals(Object obj) {
                return this == obj || (obj instanceof e);
            }

            public int hashCode() {
                return -2090100465;
            }

            public String toString() {
                return "Permission" /* decoded XOR */;
            }
        }

        public static final class f implements a {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public static final f f64809b = new f();

            public boolean equals(Object obj) {
                return this == obj || (obj instanceof f);
            }

            public int hashCode() {
                return -232379717;
            }

            public String toString() {
                return "Unchanged" /* decoded XOR */;
            }
        }
    }

    public static final class d implements Observer, p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Function1 f64810a;

        public d(Function1 function1) {
            "function" /* decoded XOR */;
            function1.getClass();
            this.f64810a = function1;
        }

        public final boolean equals(Object obj) {
            if ((obj instanceof Observer) && (obj instanceof p)) {
                return v.c(getFunctionDelegate(), ((p) obj).getFunctionDelegate());
            }
            return false;
        }

        @Override // p003kotlin.jvm.internal.p
        public final fl.h getFunctionDelegate() {
            return this.f64810a;
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }

        @Override // androidx.p002lifecycle.Observer
        public final /* synthetic */ void onChanged(Object obj) {
            this.f64810a.invoke(obj);
        }
    }

    private final void A0() {
        View viewFindViewById = findViewById(R$id.neeeex_recent_progress);
        "findViewById(...)" /* decoded XOR */;
        viewFindViewById.getClass();
        this.loading = (ProgressBar) viewFindViewById;
        View viewFindViewById2 = findViewById(R$id.neeeex_recent_empty_text);
        "findViewById(...)" /* decoded XOR */;
        viewFindViewById2.getClass();
        this.message = (TextView) viewFindViewById2;
        View viewFindViewById3 = findViewById(R$id.neeeex_recent_recycler_view);
        "findViewById(...)" /* decoded XOR */;
        viewFindViewById3.getClass();
        this.recentList = (RecyclerView) viewFindViewById3;
        View viewFindViewById4 = findViewById(R$id.neeeex_recent_text_date);
        "findViewById(...)" /* decoded XOR */;
        viewFindViewById4.getClass();
        this.rangeLabel = (TextView) viewFindViewById4;
        View viewFindViewById5 = findViewById(R$id.neeeex_recent_layout_calendar);
        "findViewById(...)" /* decoded XOR */;
        viewFindViewById5.getClass();
        this.rangeButton = viewFindViewById5;
    }

    private final void B0() {
        if (this.exitInProgress) {
            return;
        }
        this.exitInProgress = true;
        l.f104405a.b(this, "neeeex_pdf_clean_scan_exit_fs" /* decoded XOR */, n.RECENT_APPS);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void D0(zh.a state) {
        z0(a.f64803a.a(state));
    }

    private final void E0() {
        View viewFindViewById = findViewById(R$id.neeeex_recent_ad_container_banner);
        "findViewById(...)" /* decoded XOR */;
        viewFindViewById.getClass();
        BaseAdActivity.showRenderAdAndRefresh$default(this, (ViewGroup) viewFindViewById, R$layout.ad_neeeex_native, "CTOOLS_RECENT_APPS_RESULT_NATIVE" /* decoded XOR */, null, 8, null);
    }

    private final void G0(String message) {
        ProgressBar progressBar = this.loading;
        TextView textView = null;
        if (progressBar == null) {
            v.n("loading" /* decoded XOR */);
            progressBar = null;
        }
        progressBar.setVisibility(8);
        RecyclerView recyclerView = this.recentList;
        if (recyclerView == null) {
            v.n("recentList" /* decoded XOR */);
            recyclerView = null;
        }
        recyclerView.setVisibility(8);
        TextView textView2 = this.message;
        if (textView2 == null) {
            v.n("message" /* decoded XOR */);
            textView2 = null;
        }
        textView2.setVisibility(0);
        TextView textView3 = this.message;
        if (textView3 == null) {
            v.n("message" /* decoded XOR */);
        } else {
            textView = textView3;
        }
        textView.setText(message);
    }

    public static final void I0(com.google.android.material.bottomsheet.a aVar, RecentAppsNEEEEXActivity recentAppsNEEEEXActivity, gi.c cVar, View view) {
        aVar.dismiss();
        recentAppsNEEEEXActivity.F0(cVar);
    }

    public static /* synthetic */ void K0(RecentAppsNEEEEXActivity recentAppsNEEEEXActivity, gi.c cVar, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            i iVar = recentAppsNEEEEXActivity.model;
            if (iVar == null) {
                v.n("model" /* decoded XOR */);
                iVar = null;
            }
            cVar = iVar.h();
        }
        recentAppsNEEEEXActivity.J0(cVar);
    }

    public static fl.m0 s0(RecentAppsNEEEEXActivity recentAppsNEEEEXActivity, k0 k0Var) {
        "$this$addCallback" /* decoded XOR */;
        k0Var.getClass();
        recentAppsNEEEEXActivity.B0();
        return fl.m0.f80959a;
    }

    public static fl.m0 t0(RecentAppsNEEEEXActivity recentAppsNEEEEXActivity, gi.b bVar) {
        com.neeeex.eraser.ads.e.K = false;
        wh.d.f102160a.c(recentAppsNEEEEXActivity, bVar.f());
        return fl.m0.f80959a;
    }

    public static void u0(RecentAppsNEEEEXActivity recentAppsNEEEEXActivity, View view) {
        recentAppsNEEEEXActivity.H0();
    }

    public static void w0(RecentAppsNEEEEXActivity recentAppsNEEEEXActivity, View view) {
        recentAppsNEEEEXActivity.B0();
    }

    public final void C0(final gi.b item) {
        mi.a.f88870a.D();
        vh.a.f100781a.f(this, "CTOOLS_RECENT_STOP_IN" /* decoded XOR */, vh.a.e.RECENT_APPS, new Function0() { // from class: com.neeeex.ctools.features.recent.d
            @Override // p003kotlin.jvm.functions.Function0
            public final Object invoke() {
                return RecentAppsNEEEEXActivity.t0(this.f64828a, item);
            }
        });
    }

    public final void F0(gi.c range) {
        J0(range);
        i iVar = this.model;
        if (iVar == null) {
            v.n("model" /* decoded XOR */);
            iVar = null;
        }
        iVar.j(range);
    }

    public final void H0() {
        final com.google.android.material.bottomsheet.a aVar = new com.google.android.material.bottomsheet.a(this);
        View viewInflate = getLayoutInflater().inflate(R$layout.dialog_neeeex_change_date, (ViewGroup) null);
        for (Map.Entry entry : v0.n(z.a(Integer.valueOf(R$id.neeeex_recent_option_last_60_mins), gi.c.LAST_60_MINUTES), z.a(Integer.valueOf(R$id.neeeex_recent_option_today), gi.c.TODAY), z.a(Integer.valueOf(R$id.neeeex_recent_option_yesterday), gi.c.YESTERDAY), z.a(Integer.valueOf(R$id.neeeex_recent_option_last_7_days), gi.c.LAST_7_DAYS)).entrySet()) {
            int iIntValue = ((Number) entry.getKey()).intValue();
            final gi.c cVar = (gi.c) entry.getValue();
            ((TextView) viewInflate.findViewById(iIntValue)).setOnClickListener(new View.OnClickListener() { // from class: com.neeeex.ctools.features.recent.h
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    RecentAppsNEEEEXActivity.I0(aVar, this, cVar, view);
                }
            });
        }
        aVar.setContentView(viewInflate);
        aVar.show();
    }

    public final void J0(gi.c range) {
        TextView textView = this.rangeLabel;
        if (textView == null) {
            v.n("rangeLabel" /* decoded XOR */);
            textView = null;
        }
        textView.setText(gi.l.l(gi.l.f82514a, this, range, 0L, null, 12, null));
    }

    @Override // com.neeeex.eraser.base.RootActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R$layout.activity_neeeex_recent_apps);
        mi.a.f88870a.K();
        this.model = (i) new ViewModelProvider(this).get(i.class);
        A0();
        findViewById(R$id.neeeex_recent_button_back).setOnClickListener(new View.OnClickListener() { // from class: com.neeeex.ctools.features.recent.e
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                RecentAppsNEEEEXActivity.w0(this.f64830a, view);
            }
        });
        o0.b(getOnBackPressedDispatcher(), this, false, new Function1() { // from class: com.neeeex.ctools.features.recent.f
            @Override // p003kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return RecentAppsNEEEEXActivity.s0(this.f64831a, (k0) obj);
            }
        }, 2, null);
        View view = this.rangeButton;
        if (view == null) {
            v.n("rangeButton" /* decoded XOR */);
            view = null;
        }
        view.setOnClickListener(new View.OnClickListener() { // from class: com.neeeex.ctools.features.recent.g
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                RecentAppsNEEEEXActivity.u0(this.f64832a, view2);
            }
        });
        RecyclerView recyclerView = this.recentList;
        if (recyclerView == null) {
            v.n("recentList" /* decoded XOR */);
            recyclerView = null;
        }
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        RecyclerView recyclerView2 = this.recentList;
        if (recyclerView2 == null) {
            v.n("recentList" /* decoded XOR */);
            recyclerView2 = null;
        }
        recyclerView2.setAdapter(this.recentAdapter);
        E0();
        i iVar = this.model;
        if (iVar == null) {
            v.n("model" /* decoded XOR */);
            iVar = null;
        }
        iVar.i().observe(this, new d(new b(this)));
        if (savedInstanceState == null) {
            F0(gi.c.TODAY);
        } else {
            K0(this, null, 1, null);
        }
    }

    public final void z0(a screen) {
        if (v.c(screen, a.f.f64809b)) {
            return;
        }
        if (v.c(screen, a.e.f64808b)) {
            startActivity(UsagePermissionActivity.INSTANCE.a(this, ei.b.RECENT_APPS));
            finish();
            return;
        }
        RecyclerView recyclerView = null;
        if (v.c(screen, a.C0766a.f64804b)) {
            ProgressBar progressBar = this.loading;
            if (progressBar == null) {
                v.n("loading" /* decoded XOR */);
                progressBar = null;
            }
            progressBar.setVisibility(0);
            TextView textView = this.message;
            if (textView == null) {
                v.n("message" /* decoded XOR */);
                textView = null;
            }
            textView.setVisibility(8);
            RecyclerView recyclerView2 = this.recentList;
            if (recyclerView2 == null) {
                v.n("recentList" /* decoded XOR */);
            } else {
                recyclerView = recyclerView2;
            }
            recyclerView.setVisibility(8);
            return;
        }
        if (!(screen instanceof a.c)) {
            if (screen instanceof a.d) {
                G0(((a.d) screen).a());
                return;
            } else {
                coil.util.j.a();
                return;
            }
        }
        ProgressBar progressBar2 = this.loading;
        if (progressBar2 == null) {
            v.n("loading" /* decoded XOR */);
            progressBar2 = null;
        }
        progressBar2.setVisibility(8);
        TextView textView2 = this.message;
        if (textView2 == null) {
            v.n("message" /* decoded XOR */);
            textView2 = null;
        }
        textView2.setVisibility(8);
        RecyclerView recyclerView3 = this.recentList;
        if (recyclerView3 == null) {
            v.n("recentList" /* decoded XOR */);
        } else {
            recyclerView = recyclerView3;
        }
        recyclerView.setVisibility(0);
        this.recentAdapter.i(((a.c) screen).a());
    }

    public static final /* synthetic */ class b extends s implements Function1 {
        public b(Object obj) {
            super(1, obj, RecentAppsNEEEEXActivity.class, "render" /* decoded XOR */, "render(Lcom/neeeex/ctools/common/state/LoadState;)V" /* decoded XOR */, 0);
        }

        public final void invoke(zh.a aVar) {
            "p0" /* decoded XOR */;
            aVar.getClass();
            ((RecentAppsNEEEEXActivity) this.receiver).D0(aVar);
        }

        @Override // p003kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((zh.a) obj);
            return fl.m0.f80959a;
        }
    }

    public static final /* synthetic */ class c extends s implements Function1 {
        public c(Object obj) {
            super(1, obj, RecentAppsNEEEEXActivity.class, "openAppSettings" /* decoded XOR */, "openAppSettings(Lcom/neeeex/ctools/features/recent/data/RecentAppItem;)V" /* decoded XOR */, 0);
        }

        public final void invoke(gi.b bVar) {
            "p0" /* decoded XOR */;
            bVar.getClass();
            ((RecentAppsNEEEEXActivity) this.receiver).C0(bVar);
        }

        @Override // p003kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((gi.b) obj);
            return fl.m0.f80959a;
        }
    }
}