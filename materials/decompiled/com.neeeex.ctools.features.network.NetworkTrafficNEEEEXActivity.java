package com.neeeex.ctools.features.network;

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
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.neeeex.ctools.features.permission.UsagePermissionActivity;
import com.neeeex.eraser.R$id;
import com.neeeex.eraser.R$layout;
import com.neeeex.eraser.R$string;
import com.neeeex.eraser.base.BaseAdActivity;
import com.neeeex.eraser.m0;
import fl.t;
import fl.z;
import gl.v0;
import gl.w;
import gl.x;
import java.util.ArrayList;
import java.util.Iterator;
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
@Metadata(d1 = {"\u0000\u0080\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\u0005\u0018\u00002\u00020\u0001:\u0001LB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0005\u0010\u0003J\u000f\u0010\u0006\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0006\u0010\u0003J\u0019\u0010\t\u001a\u00020\u00042\b\u0010\b\u001a\u0004\u0018\u00010\u0007H\u0014¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\u000b\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u000b\u0010\u0003J\u000f\u0010\f\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\f\u0010\u0003J\u0017\u0010\u000f\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\rH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J#\u0010\u0014\u001a\u00020\u00042\u0012\u0010\u0013\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\r0\u00120\u0011H\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u0017\u0010\u0018\u001a\u00020\u00042\u0006\u0010\u0017\u001a\u00020\u0016H\u0002¢\u0006\u0004\b\u0018\u0010\u0019J\u000f\u0010\u001a\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u001a\u0010\u0003J\u0017\u0010\u001d\u001a\u00020\u00042\u0006\u0010\u001c\u001a\u00020\u001bH\u0002¢\u0006\u0004\b\u001d\u0010\u001eJ\u000f\u0010\u001f\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u001f\u0010\u0003J\u0017\u0010\"\u001a\u00020\u00042\u0006\u0010!\u001a\u00020 H\u0002¢\u0006\u0004\b\"\u0010#J\u000f\u0010$\u001a\u00020\u0004H\u0002¢\u0006\u0004\b$\u0010\u0003J\u0017\u0010'\u001a\u00020\u00042\u0006\u0010&\u001a\u00020%H\u0002¢\u0006\u0004\b'\u0010(R\u0016\u0010,\u001a\u00020)8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b*\u0010+R\u0014\u00100\u001a\u00020-8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b.\u0010/R\u001c\u00103\u001a\b\u0012\u0004\u0012\u00020\r0\u00128\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b1\u00102R\u0016\u00107\u001a\u0002048\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b5\u00106R\u0016\u0010;\u001a\u0002088\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b9\u0010:R\u0016\u0010?\u001a\u00020<8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b=\u0010>R\u0016\u0010A\u001a\u0002088\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b@\u0010:R\u0016\u0010C\u001a\u0002088\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\bB\u0010:R\u0016\u0010E\u001a\u0002088\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\bD\u0010:R\u001c\u0010G\u001a\b\u0012\u0004\u0012\u0002080\u00128\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\bF\u00102R\u0016\u0010K\u001a\u00020H8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bI\u0010J¨\u0006M"}, d2 = {"Lcom/neeeex/ctools/features/network/NetworkTrafficNEEEEXActivity;", "Lcom/neeeex/eraser/base/BaseAdActivity;", "<init>", "()V", "Lfl/m0;", "B0", "E0", "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "(Landroid/os/Bundle;)V", "C0", "G0", "Ldi/c;", "item", "D0", "(Ldi/c;)V", "Lzh/a;", "", TestProtocol.STATE_FIELD, "F0", "(Lzh/a;)V", "Lcom/neeeex/ctools/features/network/NetworkTrafficNEEEEXActivity$a;", "effect", "A0", "(Lcom/neeeex/ctools/features/network/NetworkTrafficNEEEEXActivity$a;)V", "L0", "", "message", "M0", "(Ljava/lang/String;)V", "J0", "", "selectedIndex", "I0", "(I)V", "N0", "Ldi/b;", "filter", "H0", "(Ldi/b;)V", "Lcom/neeeex/ctools/features/network/j;", "c", "Lcom/neeeex/ctools/features/network/j;", "model", "Lcom/neeeex/ctools/features/network/a;", "d", "Lcom/neeeex/ctools/features/network/a;", "trafficAdapter", "e", "Ljava/util/List;", "loadedItems", "Landroid/widget/ProgressBar;", "f", "Landroid/widget/ProgressBar;", "loadingIndicator", "Landroid/widget/TextView;", "g", "Landroid/widget/TextView;", "messageView", "Landroidx/recyclerview/widget/RecyclerView;", "h", "Landroidx/recyclerview/widget/RecyclerView;", "trafficList", "i", "mobileTotalView", "j", "wifiTotalView", CampaignEx.JSON_KEY_AD_K, "filterView", "l", "rangeTabs", "", "m", "Z", "exitInProgress", "a", "tool-feature_productionRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class NetworkTrafficNEEEEXActivity extends BaseAdActivity {

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    public j model;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    public final com.neeeex.ctools.features.network.a trafficAdapter = new com.neeeex.ctools.features.network.a(new d(this));

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    public List loadedItems = w.m();

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    public ProgressBar loadingIndicator;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    public TextView messageView;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    public RecyclerView trafficList;

    /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata */
    public TextView mobileTotalView;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    public TextView wifiTotalView;

    /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata */
    public TextView filterView;

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
    public List rangeTabs;

    /* JADX INFO: renamed from: m, reason: collision with root package name and from kotlin metadata */
    public boolean exitInProgress;

    public interface a {

        /* JADX INFO: renamed from: com.neeeex.ctools.features.network.NetworkTrafficNEEEEXActivity$a$a, reason: collision with other inner class name */
        public static final class C0740a implements a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final List f64360a;

            public C0740a(List list) {
                m0.a("98p3udU=\n", "nr4S1KaYiUw=\n");
                list.getClass();
                this.f64360a = list;
            }

            public final List a() {
                return this.f64360a;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof C0740a) && v.c(this.f64360a, ((C0740a) obj).f64360a);
            }

            public int hashCode() {
                return this.f64360a.hashCode();
            }

            public String toString() {
                return "Content(items=" + this.f64360a + ")";
            }
        }

        public static final class b implements a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final b f64361a = new b();

            public boolean equals(Object obj) {
                return this == obj || (obj instanceof b);
            }

            public int hashCode() {
                return 372534431;
            }

            public String toString() {
                return m0.a("8Y8KliTEFw==\n", "veBr8k2qcAU=\n");
            }
        }

        public static final class c implements a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final String f64362a;

            public c(String str) {
                m0.a("Gt+6Uw==\n", "brrCJ+vZaww=\n");
                str.getClass();
                this.f64362a = str;
            }

            public final String a() {
                return this.f64362a;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof c) && v.c(this.f64362a, ((c) obj).f64362a);
            }

            public int hashCode() {
                return this.f64362a.hashCode();
            }

            public String toString() {
                return "Message(text=" + this.f64362a + ")";
            }
        }

        public static final class d implements a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final d f64363a = new d();

            public boolean equals(Object obj) {
                return this == obj || (obj instanceof d);
            }

            public int hashCode() {
                return 938186421;
            }

            public String toString() {
                return m0.a("shvpDA==\n", "/HSHaWmYY4w=\n");
            }
        }

        public static final class e implements a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final e f64364a = new e();

            public boolean equals(Object obj) {
                return this == obj || (obj instanceof e);
            }

            public int hashCode() {
                return -530392735;
            }

            public String toString() {
                return m0.a("VmvQJvtL2iVhfMw67UvHGmo=\n", "BA6hU544rnU=\n");
            }
        }
    }

    public static final class c implements Observer, p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Function1 f64365a;

        public c(Function1 function1) {
            m0.a("yYWnmr4mQ1Y=\n", "r/DJ+cpPLDg=\n");
            function1.getClass();
            this.f64365a = function1;
        }

        public final boolean equals(Object obj) {
            if ((obj instanceof Observer) && (obj instanceof p)) {
                return v.c(getFunctionDelegate(), ((p) obj).getFunctionDelegate());
            }
            return false;
        }

        @Override // p003kotlin.jvm.internal.p
        public final fl.h getFunctionDelegate() {
            return this.f64365a;
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }

        @Override // androidx.p002lifecycle.Observer
        public final /* synthetic */ void onChanged(Object obj) {
            this.f64365a.invoke(obj);
        }
    }

    private final void B0() {
        View viewFindViewById = findViewById(R$id.neeeex_network_progress);
        m0.a("JS1IUq+beIkBPW9S0dwz0Go=\n", "Q0QmNvnyHf4=\n");
        viewFindViewById.getClass();
        this.loadingIndicator = (ProgressBar) viewFindViewById;
        View viewFindViewById2 = findViewById(R$id.neeeex_network_empty_text);
        m0.a("gZYiACsxx2KlhgUAVXaMO84=\n", "5/9MZH1YohU=\n");
        viewFindViewById2.getClass();
        this.messageView = (TextView) viewFindViewById2;
        View viewFindViewById3 = findViewById(R$id.neeeex_network_recycler_view);
        m0.a("9l7xci0GqWTSTtZyU0HiPbk=\n", "kDefFntvzBM=\n");
        viewFindViewById3.getClass();
        this.trafficList = (RecyclerView) viewFindViewById3;
        View viewFindViewById4 = findViewById(R$id.neeeex_network_text_mobile_total);
        m0.a("FEBuFUDHupYwUEkVPoDxz1s=\n", "cikAcRau3+E=\n");
        viewFindViewById4.getClass();
        this.mobileTotalView = (TextView) viewFindViewById4;
        View viewFindViewById5 = findViewById(R$id.neeeex_network_text_wifi_total);
        m0.a("GLVHHwZKkTs8pWAfeA3aYlc=\n", "ftwpe1Aj9Ew=\n");
        viewFindViewById5.getClass();
        this.wifiTotalView = (TextView) viewFindViewById5;
        View viewFindViewById6 = findViewById(R$id.neeeex_network_text_filter);
        m0.a("w7WJf+RQ6Rrnpa5/mheiQ4w=\n", "pdznG7I5jG0=\n");
        viewFindViewById6.getClass();
        this.filterView = (TextView) viewFindViewById6;
    }

    private final void E0() {
        if (this.exitInProgress) {
            return;
        }
        this.exitInProgress = true;
        l.f104405a.b(this, m0.a("2ZfdNuZ/dbnTlOcw72JLp+iB2zLtWE+x3obnNfA=\n", "t/K4U4MHKsk=\n"), n.NETWORK_TRAFFIC);
    }

    public static final void K0(NetworkTrafficNEEEEXActivity networkTrafficNEEEEXActivity, int i10, di.f fVar, View view) {
        networkTrafficNEEEEXActivity.I0(i10);
        j jVar = networkTrafficNEEEEXActivity.model;
        if (jVar == null) {
            v.n(m0.a("Bn7O1v4=\n", "axGqs5IyyrY=\n"));
            jVar = null;
        }
        jVar.j(fVar);
    }

    public static final void O0(com.google.android.material.bottomsheet.a aVar, NetworkTrafficNEEEEXActivity networkTrafficNEEEEXActivity, di.b bVar, View view) {
        aVar.dismiss();
        networkTrafficNEEEEXActivity.H0(bVar);
    }

    public static void s0(NetworkTrafficNEEEEXActivity networkTrafficNEEEEXActivity, View view) {
        networkTrafficNEEEEXActivity.N0();
    }

    public static fl.m0 t0(NetworkTrafficNEEEEXActivity networkTrafficNEEEEXActivity, k0 k0Var) {
        m0.a("JL8JIbFMlblkiAAkrgqVvms=\n", "AMthSMJo9N0=\n");
        k0Var.getClass();
        networkTrafficNEEEEXActivity.E0();
        return fl.m0.f80959a;
    }

    public static fl.m0 v0(NetworkTrafficNEEEEXActivity networkTrafficNEEEEXActivity, di.c cVar) {
        com.neeeex.eraser.ads.e.K = false;
        wh.d.f102160a.c(networkTrafficNEEEEXActivity, cVar.d());
        return fl.m0.f80959a;
    }

    public static void w0(NetworkTrafficNEEEEXActivity networkTrafficNEEEEXActivity, View view) {
        networkTrafficNEEEEXActivity.E0();
    }

    public final void A0(a effect) {
        if (v.c(effect, a.d.f64363a)) {
            return;
        }
        if (v.c(effect, a.e.f64364a)) {
            startActivity(UsagePermissionActivity.INSTANCE.a(this, ei.b.NETWORK_TRAFFIC));
            finish();
            return;
        }
        if (!v.c(effect, a.b.f64361a)) {
            if (effect instanceof a.C0740a) {
                this.loadedItems = ((a.C0740a) effect).a();
                L0();
                return;
            } else if (effect instanceof a.c) {
                M0(((a.c) effect).a());
                return;
            } else {
                coil.util.j.a();
                return;
            }
        }
        ProgressBar progressBar = this.loadingIndicator;
        RecyclerView recyclerView = null;
        if (progressBar == null) {
            v.n(m0.a("xl2jULAG/5fEVqtXuBz3rA==\n", "qjLCNNlomN4=\n"));
            progressBar = null;
        }
        progressBar.setVisibility(0);
        TextView textView = this.messageView;
        if (textView == null) {
            v.n(m0.a("7jx+gPJRjgzqPHo=\n", "g1kN85M261o=\n"));
            textView = null;
        }
        textView.setVisibility(8);
        RecyclerView recyclerView2 = this.trafficList;
        if (recyclerView2 == null) {
            v.n(m0.a("8GDvhdYCoR7tYfo=\n", "hBKO47BrwlI=\n"));
        } else {
            recyclerView = recyclerView2;
        }
        recyclerView.setVisibility(8);
    }

    public final void C0() {
        findViewById(R$id.neeeex_network_button_back).setOnClickListener(new View.OnClickListener() { // from class: com.neeeex.ctools.features.network.f
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                NetworkTrafficNEEEEXActivity.w0(this.f64391a, view);
            }
        });
        o0.b(getOnBackPressedDispatcher(), this, false, new Function1() { // from class: com.neeeex.ctools.features.network.g
            @Override // p003kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return NetworkTrafficNEEEEXActivity.t0(this.f64392a, (k0) obj);
            }
        }, 2, null);
        TextView textView = this.filterView;
        RecyclerView recyclerView = null;
        if (textView == null) {
            v.n(m0.a("MlUO218xJwQxSw==\n", "VDxirzpDcW0=\n"));
            textView = null;
        }
        textView.setOnClickListener(new View.OnClickListener() { // from class: com.neeeex.ctools.features.network.h
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                NetworkTrafficNEEEEXActivity.s0(this.f64393a, view);
            }
        });
        RecyclerView recyclerView2 = this.trafficList;
        if (recyclerView2 == null) {
            v.n(m0.a("Y+GGXnjZCQR+4JM=\n", "F5PnOB6wakg=\n"));
        } else {
            recyclerView = recyclerView2;
        }
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setAdapter(this.trafficAdapter);
    }

    public final void D0(final di.c item) {
        mi.a.f88870a.C();
        vh.a.f100781a.f(this, m0.a("3lubddYNfHTYW4N1yBV8d9xBlX3fAWp0\n", "nQ/UOppeIzo=\n"), vh.a.e.NETWORK_TRAFFIC, new Function0() { // from class: com.neeeex.ctools.features.network.d
            @Override // p003kotlin.jvm.functions.Function0
            public final Object invoke() {
                return NetworkTrafficNEEEEXActivity.v0(this.f64386a, item);
            }
        });
    }

    public final void F0(zh.a state) {
        a cVar;
        a aVar;
        if (v.c(state, zh.a.f.f104381a)) {
            aVar = a.e.f64364a;
        } else if (v.c(state, zh.a.d.f104379a)) {
            aVar = a.d.f64363a;
        } else if (v.c(state, zh.a.e.f104380a)) {
            aVar = a.b.f64361a;
        } else {
            if (state instanceof zh.a.C1347a) {
                cVar = new a.C0740a((List) ((zh.a.C1347a) state).a());
            } else if (state instanceof zh.a.b) {
                cVar = new a.c(((zh.a.b) state).a());
            } else {
                if (!(state instanceof zh.a.c)) {
                    coil.util.j.a();
                    return;
                }
                cVar = new a.c(((zh.a.c) state).a());
            }
            aVar = cVar;
        }
        A0(aVar);
    }

    public final void G0() {
        View viewFindViewById = findViewById(R$id.neeeex_network_ad_container_banner);
        m0.a("yPm09F4g+7vs6ZP0IGew4oc=\n", "rpDakAhJnsw=\n");
        viewFindViewById.getClass();
        BaseAdActivity.showRenderAdAndRefresh$default(this, (ViewGroup) viewFindViewById, R$layout.ad_neeeex_native, m0.a("2avcBi9n+4ffq8QGMX/7nci+1Q8qd/ub36zGBTdr6ojOtsUM\n", "mv+TSWM0pMk=\n"), null, 8, null);
    }

    public final void H0(di.b filter) {
        j jVar = this.model;
        TextView textView = null;
        if (jVar == null) {
            v.n(m0.a("Y9/OfJ4=\n", "DrCqGfI/1WU=\n"));
            jVar = null;
        }
        jVar.m(filter);
        Map mapN = v0.n(z.a(di.b.MOBILE, Integer.valueOf(R$string.ctools_neeeex_mobile)), z.a(di.b.WIFI, Integer.valueOf(R$string.ctools_neeeex_wi_fi)), z.a(di.b.BOTH_TYPES, Integer.valueOf(R$string.ctools_neeeex_both_types)));
        TextView textView2 = this.filterView;
        if (textView2 == null) {
            v.n(m0.a("L69Mx4G/CWMssQ==\n", "ScYgs+TNXwo=\n"));
        } else {
            textView = textView2;
        }
        textView.setText(((Number) v0.l(mapN, filter)).intValue());
        L0();
    }

    public final void I0(int selectedIndex) {
        List list = this.rangeTabs;
        if (list == null) {
            v.n(m0.a("b7BRWqPKbyBu\n", "HdE/PcaeDkI=\n"));
            list = null;
        }
        int i10 = 0;
        for (Object obj : list) {
            int i11 = i10 + 1;
            if (i10 < 0) {
                w.w();
            }
            ((TextView) obj).setSelected(i10 == selectedIndex);
            i10 = i11;
        }
    }

    public final void J0() {
        List listP = w.p(z.a(Integer.valueOf(R$id.neeeex_network_tab_24_hours), di.f.LAST_24_HOURS), z.a(Integer.valueOf(R$id.neeeex_network_tab_7_days), di.f.LAST_7_DAYS), z.a(Integer.valueOf(R$id.neeeex_network_tab_this_month), di.f.THIS_MONTH));
        ArrayList arrayList = new ArrayList(x.x(listP, 10));
        Iterator it = listP.iterator();
        while (it.hasNext()) {
            arrayList.add((TextView) findViewById(((Number) ((t) it.next()).component1()).intValue()));
        }
        this.rangeTabs = arrayList;
        final int i10 = 0;
        for (Object obj : listP) {
            int i11 = i10 + 1;
            if (i10 < 0) {
                w.w();
            }
            final di.f fVar = (di.f) ((t) obj).component2();
            List list = this.rangeTabs;
            if (list == null) {
                v.n(m0.a("MSeAzPoCM50w\n", "Q0buq59WUv8=\n"));
                list = null;
            }
            ((TextView) list.get(i10)).setOnClickListener(new View.OnClickListener() { // from class: com.neeeex.ctools.features.network.e
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    NetworkTrafficNEEEEXActivity.K0(this.f64388a, i10, fVar, view);
                }
            });
            i10 = i11;
        }
        I0(0);
    }

    public final void L0() {
        ProgressBar progressBar = this.loadingIndicator;
        j jVar = null;
        TextView textView = null;
        if (progressBar == null) {
            v.n(m0.a("vmC51UR51CG8a7HSTGPcGg==\n", "0g/YsS0Xs2g=\n"));
            progressBar = null;
        }
        progressBar.setVisibility(8);
        di.d dVar = di.d.f79105a;
        List list = this.loadedItems;
        j jVar2 = this.model;
        if (jVar2 == null) {
            v.n(m0.a("Ld5UMbA=\n", "QLEwVNwU2cU=\n"));
            jVar2 = null;
        }
        di.a aVarA = dVar.a(list, jVar2.h());
        TextView textView2 = this.mobileTotalView;
        if (textView2 == null) {
            v.n(m0.a("SfMdMY1UVvhQ/RMOiFR1\n", "JJx/WOExApc=\n"));
            textView2 = null;
        }
        xh.a aVar = xh.a.f102795a;
        textView2.setText(aVar.a(aVarA.c()));
        TextView textView3 = this.wifiTotalView;
        if (textView3 == null) {
            v.n(m0.a("GM8cysifqQ8D8BPG6w==\n", "b6Z6o5zw3W4=\n"));
            textView3 = null;
        }
        textView3.setText(aVar.a(aVarA.d()));
        if (aVarA.a().isEmpty()) {
            RecyclerView recyclerView = this.trafficList;
            if (recyclerView == null) {
                v.n(m0.a("5UjTi08ZCeL4ScY=\n", "kTqy7Slwaq4=\n"));
                recyclerView = null;
            }
            recyclerView.setVisibility(8);
            TextView textView4 = this.messageView;
            if (textView4 == null) {
                v.n(m0.a("CcweBT0NK/INzBo=\n", "ZKltdlxqTqQ=\n"));
                textView4 = null;
            }
            textView4.setVisibility(0);
            TextView textView5 = this.messageView;
            if (textView5 == null) {
                v.n(m0.a("+J0zhDYvagD8nTc=\n", "lfhA91dID1Y=\n"));
            } else {
                textView = textView5;
            }
            textView.setText(getString(R$string.ctools_neeeex_no_network_traffic_for_filter));
            return;
        }
        TextView textView6 = this.messageView;
        if (textView6 == null) {
            v.n(m0.a("tTeg8UzF9YaxN6Q=\n", "2FLTgi2ikNA=\n"));
            textView6 = null;
        }
        textView6.setVisibility(8);
        RecyclerView recyclerView2 = this.trafficList;
        if (recyclerView2 == null) {
            v.n(m0.a("XVlcOqvbvgdAWEk=\n", "KSs9XM2y3Us=\n"));
            recyclerView2 = null;
        }
        recyclerView2.setVisibility(0);
        com.neeeex.ctools.features.network.a aVar2 = this.trafficAdapter;
        j jVar3 = this.model;
        if (jVar3 == null) {
            v.n(m0.a("lzfRay4=\n", "+li1DkIiBBo=\n"));
        } else {
            jVar = jVar3;
        }
        aVar2.l(aVarA, jVar.h());
    }

    public final void M0(String message) {
        ProgressBar progressBar = this.loadingIndicator;
        TextView textView = null;
        if (progressBar == null) {
            v.n(m0.a("vlX2YgkgpIi8Xv5lATqssw==\n", "0jqXBmBOw8E=\n"));
            progressBar = null;
        }
        progressBar.setVisibility(8);
        RecyclerView recyclerView = this.trafficList;
        if (recyclerView == null) {
            v.n(m0.a("KHHfs3UqY881cMo=\n", "XAO+1RNDAIM=\n"));
            recyclerView = null;
        }
        recyclerView.setVisibility(8);
        TextView textView2 = this.messageView;
        if (textView2 == null) {
            v.n(m0.a("GirTRyXVHT0eKtc=\n", "d0+gNESyeGs=\n"));
            textView2 = null;
        }
        textView2.setVisibility(0);
        TextView textView3 = this.messageView;
        if (textView3 == null) {
            v.n(m0.a("/qKBS2jiR/P6ooU=\n", "k8fyOAmFIqU=\n"));
        } else {
            textView = textView3;
        }
        textView.setText(message);
    }

    public final void N0() {
        final com.google.android.material.bottomsheet.a aVar = new com.google.android.material.bottomsheet.a(this);
        View viewInflate = getLayoutInflater().inflate(R$layout.dialog_neeeex_traffic_types, (ViewGroup) null);
        for (Map.Entry entry : v0.n(z.a(Integer.valueOf(R$id.neeeex_network_option_mobile), di.b.MOBILE), z.a(Integer.valueOf(R$id.neeeex_network_option_wifi), di.b.WIFI), z.a(Integer.valueOf(R$id.neeeex_network_option_both_types), di.b.BOTH_TYPES)).entrySet()) {
            int iIntValue = ((Number) entry.getKey()).intValue();
            final di.b bVar = (di.b) entry.getValue();
            ((TextView) viewInflate.findViewById(iIntValue)).setOnClickListener(new View.OnClickListener() { // from class: com.neeeex.ctools.features.network.i
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    NetworkTrafficNEEEEXActivity.O0(aVar, this, bVar, view);
                }
            });
        }
        aVar.setContentView(viewInflate);
        aVar.show();
    }

    @Override // com.neeeex.eraser.base.RootActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R$layout.activity_neeeex_network_traffic);
        mi.a.f88870a.I();
        this.model = (j) new ViewModelProvider(this).get(j.class);
        B0();
        C0();
        G0();
        J0();
        j jVar = this.model;
        j jVar2 = null;
        if (jVar == null) {
            v.n(m0.a("d/HWh4s=\n", "Gp6y4ucjL2M=\n"));
            jVar = null;
        }
        jVar.i().observe(this, new c(new b(this)));
        if (savedInstanceState == null) {
            j jVar3 = this.model;
            if (jVar3 == null) {
                v.n(m0.a("3yg5Yis=\n", "skddB0dpZAE=\n"));
            } else {
                jVar2 = jVar3;
            }
            jVar2.j(di.f.LAST_24_HOURS);
        }
    }

    public static final /* synthetic */ class b extends s implements Function1 {
        public b(Object obj) {
            super(1, obj, NetworkTrafficNEEEEXActivity.class, m0.a("7IrtGPB7\n", "nu+DfJUJLLc=\n"), m0.a("yKhnaKOgjp/ZomQjqLfDtt+1Jm+yvcm/yeJqY6u/yb2Vvn1tsreJn9WsbV+ys9K2geRf\n", "us0JDMbSptM=\n"), 0);
        }

        public final void invoke(zh.a aVar) {
            m0.a("/jk=\n", "jgmYSVxFHEI=\n");
            aVar.getClass();
            ((NetworkTrafficNEEEEXActivity) this.receiver).F0(aVar);
        }

        @Override // p003kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((zh.a) obj);
            return fl.m0.f80959a;
        }
    }

    public static final /* synthetic */ class d extends s implements Function1 {
        public d(Object obj) {
            super(1, obj, NetworkTrafficNEEEEXActivity.class, m0.a("hEDDB8BYukuZTcQFxkmSVIc=\n", "6SGtZqc9+zs=\n"), m0.a("/WRG26axFvHgaUHZoKA+7v4tZNmuuXjv9WBN37n7NPX/akTJ7rIy4ORwWt+y+znk5HJHyKr7M+Dk\nZAf0pKAg7uJufMigsjHo80xc36zvftc=\n", "kAUousHUV4E=\n"), 0);
        }

        public final void invoke(di.c cVar) {
            m0.a("qx8=\n", "2y96Olbsysw=\n");
            cVar.getClass();
            ((NetworkTrafficNEEEEXActivity) this.receiver).D0(cVar);
        }

        @Override // p003kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((di.c) obj);
            return fl.m0.f80959a;
        }
    }
}