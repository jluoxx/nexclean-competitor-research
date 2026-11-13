package com.neeeex.similar3p.junk.ui;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.FrameLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.l0;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import b.o0;
import com.android.launcher3.testing.shared.TestProtocol;
import com.bytedance.applog.aggregation.MetricsSQLiteCacheKt;
import com.neeeex.eraser.R$layout;
import com.neeeex.eraser.R$string;
import com.neeeex.eraser.base.BaseAdActivity;
import com.neeeex.eraser.m0;
import java.util.Set;
import ji.g1;
import p003kotlin.Metadata;
import p003kotlin.jvm.functions.Function0;
import p003kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\"\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u00002\u00020\u0001:\u00014B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0005\u0010\u0003J\u000f\u0010\u0006\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0006\u0010\u0003J\u000f\u0010\u0007\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\u0003J\u0019\u0010\n\u001a\u00020\u00042\b\u0010\t\u001a\u0004\u0018\u00010\bH\u0014¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\u000e\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\fH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u001f\u0010\u0014\u001a\u00020\u00042\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u0012H\u0002¢\u0006\u0004\b\u0014\u0010\u0015J-\u0010\u001c\u001a\u00020\u00042\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0018\u001a\u00020\u00102\f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u001a0\u0019H\u0002¢\u0006\u0004\b\u001c\u0010\u001dJ\u0017\u0010 \u001a\u00020\u00042\u0006\u0010\u001f\u001a\u00020\u001eH\u0002¢\u0006\u0004\b \u0010!J\u000f\u0010\"\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\"\u0010\u0003R\u001b\u0010(\u001a\u00020#8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b$\u0010%\u001a\u0004\b&\u0010'R\u0016\u0010,\u001a\u00020)8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b*\u0010+R\u0016\u00100\u001a\u00020-8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b.\u0010/R\u0016\u00103\u001a\u00020\u00128\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b1\u00102¨\u00065"}, d2 = {"Lcom/neeeex/similar3p/junk/ui/JunkResultNEEEEXActivity;", "Lcom/neeeex/eraser/base/BaseAdActivity;", "<init>", "()V", "Lfl/m0;", "C0", "A0", "E0", "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "(Landroid/os/Bundle;)V", "Lcom/neeeex/similar3p/junk/g0;", TestProtocol.STATE_FIELD, "B0", "(Lcom/neeeex/similar3p/junk/g0;)V", "", "totalBytes", "", "hasFiles", "y0", "(JZ)V", "", MetricsSQLiteCacheKt.METRICS_COUNT, "bytes", "", "", "paths", "G0", "(IJLjava/util/Set;)V", "Lcom/neeeex/similar3p/junk/ui/JunkResultNEEEEXActivity$a;", "summary", "H0", "(Lcom/neeeex/similar3p/junk/ui/JunkResultNEEEEXActivity$a;)V", "F0", "Lji/g1;", "c", "Lfl/n;", "z0", "()Lji/g1;", "binding", "Lcom/neeeex/similar3p/junk/h0;", "d", "Lcom/neeeex/similar3p/junk/h0;", "selectionModel", "Lcom/neeeex/similar3p/junk/ui/j;", "e", "Lcom/neeeex/similar3p/junk/ui/j;", "resultAdapter", "f", "Z", "exitInProgress", "a", "tool-feature_productionRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class JunkResultNEEEEXActivity extends BaseAdActivity {

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    public final fl.n binding = fl.o.b(new Function0() { // from class: com.neeeex.similar3p.junk.ui.t
        @Override // p003kotlin.jvm.functions.Function0
        public final Object invoke() {
            return JunkResultNEEEEXActivity.t0(this.f66487a);
        }
    });

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    public com.neeeex.similar3p.junk.h0 selectionModel;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    public j resultAdapter;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    public boolean exitInProgress;

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f66408a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final long f66409b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final Set f66410c;

        public a(int i10, long j10, Set set) {
            "paths" /* decoded XOR */;
            set.getClass();
            this.f66408a = i10;
            this.f66409b = j10;
            this.f66410c = set;
        }

        public final int a() {
            return this.f66408a;
        }

        public final Set b() {
            return this.f66410c;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return this.f66408a == aVar.f66408a && this.f66409b == aVar.f66409b && p003kotlin.jvm.internal.v.c(this.f66410c, aVar.f66410c);
        }

        public int hashCode() {
            return (((Integer.hashCode(this.f66408a) * 31) + Long.hashCode(this.f66409b)) * 31) + this.f66410c.hashCode();
        }

        public String toString() {
            return "SelectionSummary(count=" + this.f66408a + ", bytes=" + this.f66409b + ", paths=" + this.f66410c + ")";
        }
    }

    private final void A0() {
        if (!com.neeeex.eraser.module.report.bytedance.a.k()) {
            z0().f85452d.setVisibility(8);
            return;
        }
        FrameLayout frameLayout = z0().f85452d;
        "neeeexJunkResultAd" /* decoded XOR */;
        frameLayout.getClass();
        BaseAdActivity.showRenderAdAndRefresh$default(this, frameLayout, R$layout.ad_neeeex_native, "neeeex_pdf_clean_result" /* decoded XOR */, null, 8, null);
    }

    private final void C0() {
        if (this.exitInProgress) {
            return;
        }
        JunkResultExitDialog junkResultExitDialogA = JunkResultExitDialog.INSTANCE.a();
        junkResultExitDialogA.q(new ki.a() { // from class: com.neeeex.similar3p.junk.ui.u
            @Override // ki.a
            public final void a() {
                JunkResultNEEEEXActivity.D0(this.f66488a);
            }
        });
        l0 supportFragmentManager = getSupportFragmentManager();
        "getSupportFragmentManager(...)" /* decoded XOR */;
        supportFragmentManager.getClass();
        junkResultExitDialogA.i(supportFragmentManager);
    }

    public static final void D0(JunkResultNEEEEXActivity junkResultNEEEEXActivity) {
        junkResultNEEEEXActivity.exitInProgress = true;
        zi.l.f104405a.b(junkResultNEEEEXActivity, "neeeex_pdf_clean_scan_exit_fs" /* decoded XOR */, zi.n.JUNK_CLEANER);
    }

    private final void E0() {
        startActivity(new Intent(this, (Class<?>) JunkScanNEEEEXActivity.class));
        finish();
    }

    public static void s0(JunkResultNEEEEXActivity junkResultNEEEEXActivity, View view) {
        junkResultNEEEEXActivity.C0();
    }

    public static g1 t0(JunkResultNEEEEXActivity junkResultNEEEEXActivity) {
        return g1.c(junkResultNEEEEXActivity.getLayoutInflater());
    }

    public static void v0(JunkResultNEEEEXActivity junkResultNEEEEXActivity, View view) {
        junkResultNEEEEXActivity.F0();
    }

    public static fl.m0 w0(JunkResultNEEEEXActivity junkResultNEEEEXActivity, b.k0 k0Var) {
        "$this$addCallback" /* decoded XOR */;
        k0Var.getClass();
        junkResultNEEEEXActivity.C0();
        return fl.m0.f80959a;
    }

    public final void B0(com.neeeex.similar3p.junk.g0 state) {
        this.selectionModel = new com.neeeex.similar3p.junk.h0(state.c().b(), state.d());
        com.neeeex.similar3p.junk.h0 h0Var = this.selectionModel;
        com.neeeex.similar3p.junk.h0 h0Var2 = null;
        if (h0Var == null) {
            p003kotlin.jvm.internal.v.n("selectionModel" /* decoded XOR */);
            h0Var = null;
        }
        this.resultAdapter = new j(h0Var, new b(this));
        y0(state.c().c(), !state.c().b().isEmpty());
        com.neeeex.similar3p.junk.h0 h0Var3 = this.selectionModel;
        if (h0Var3 == null) {
            p003kotlin.jvm.internal.v.n("selectionModel" /* decoded XOR */);
            h0Var3 = null;
        }
        int iB = h0Var3.b();
        com.neeeex.similar3p.junk.h0 h0Var4 = this.selectionModel;
        if (h0Var4 == null) {
            p003kotlin.jvm.internal.v.n("selectionModel" /* decoded XOR */);
            h0Var4 = null;
        }
        long jA = h0Var4.a();
        com.neeeex.similar3p.junk.h0 h0Var5 = this.selectionModel;
        if (h0Var5 == null) {
            p003kotlin.jvm.internal.v.n("selectionModel" /* decoded XOR */);
        } else {
            h0Var2 = h0Var5;
        }
        H0(new a(iB, jA, h0Var2.f()));
        A0();
    }

    public final void F0() {
        if (com.neeeex.similar3p.junk.e0.f66328a.g().isEmpty()) {
            return;
        }
        mi.a.f88870a.o();
        startActivity(new Intent(this, (Class<?>) JunkCleanNEEEEXActivity.class));
        finish();
    }

    public final void G0(int count, long bytes, Set paths) {
        H0(new a(count, bytes, paths));
    }

    public final void H0(a summary) {
        int iA = summary.a();
        com.neeeex.similar3p.junk.e0.f66328a.h(summary.b());
        z0().f85450b.setEnabled(iA > 0);
        z0().f85450b.setText(getString(R$string.neeeex_junk_clean_now));
    }

    @Override // com.neeeex.eraser.base.RootActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        b.w.b(this, null, null, 3, null);
        com.neeeex.similar3p.junk.g0 g0VarI = com.neeeex.similar3p.junk.e0.f66328a.i();
        Object wVar = g0VarI != null ? new w(g0VarI) : v.f66489a;
        if (p003kotlin.jvm.internal.v.c(wVar, v.f66489a)) {
            E0();
        } else if (wVar instanceof w) {
            B0(((w) wVar).a());
        } else {
            coil.util.j.a();
        }
    }

    public final void y0(long totalBytes, boolean hasFiles) {
        setContentView(z0().getRoot());
        ConstraintLayout root = z0().getRoot();
        "getRoot(...)" /* decoded XOR */;
        root.getClass();
        ConstraintLayout constraintLayout = z0().f85459k;
        "neeeexJunkResultToolbar" /* decoded XOR */;
        constraintLayout.getClass();
        h0.c(root, constraintLayout, z0().f85450b, null, 8, null);
        z0().f85460l.setText(e0.a(totalBytes));
        RecyclerView recyclerView = z0().f85456h;
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        j jVar = this.resultAdapter;
        if (jVar == null) {
            p003kotlin.jvm.internal.v.n("resultAdapter" /* decoded XOR */);
            jVar = null;
        }
        recyclerView.setAdapter(jVar);
        recyclerView.setVisibility(hasFiles ? 0 : 8);
        z0().f85451c.setVisibility(hasFiles ? 8 : 0);
        z0().f85453e.setOnClickListener(new View.OnClickListener() { // from class: com.neeeex.similar3p.junk.ui.q
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                JunkResultNEEEEXActivity.s0(this.f66484a, view);
            }
        });
        z0().f85450b.setOnClickListener(new View.OnClickListener() { // from class: com.neeeex.similar3p.junk.ui.r
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                JunkResultNEEEEXActivity.v0(this.f66485a, view);
            }
        });
        o0.b(getOnBackPressedDispatcher(), this, false, new Function1() { // from class: com.neeeex.similar3p.junk.ui.s
            @Override // p003kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return JunkResultNEEEEXActivity.w0(this.f66486a, (b.k0) obj);
            }
        }, 2, null);
    }

    public final g1 z0() {
        return (g1) this.binding.getValue();
    }

    public static final /* synthetic */ class b extends p003kotlin.jvm.internal.s implements tl.o {
        public b(Object obj) {
            super(3, obj, JunkResultNEEEEXActivity.class, "updateSelection" /* decoded XOR */, "updateSelection(IJLjava/util/Set;)V" /* decoded XOR */, 0);
        }

        @Override // tl.o
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            invoke(((Number) obj).intValue(), ((Number) obj2).longValue(), (Set<String>) obj3);
            return fl.m0.f80959a;
        }

        public final void invoke(int i10, long j10, Set<String> set) {
            "p2" /* decoded XOR */;
            set.getClass();
            ((JunkResultNEEEEXActivity) this.receiver).G0(i10, j10, set);
        }
    }
}