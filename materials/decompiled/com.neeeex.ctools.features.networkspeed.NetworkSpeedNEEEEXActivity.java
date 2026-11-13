package com.neeeex.ctools.features.networkspeed;

import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.core.view.a1;
import androidx.core.view.c1;
import androidx.core.view.d1;
import androidx.p002lifecycle.Observer;
import androidx.p002lifecycle.ViewModelProvider;
import com.android.launcher3.testing.shared.TestProtocol;
import com.mbridge.msdk.foundation.download.core.DownloadCommon;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.neeeex.eraser.R$drawable;
import com.neeeex.eraser.R$id;
import com.neeeex.eraser.R$layout;
import com.neeeex.eraser.R$string;
import com.neeeex.eraser.base.BaseAdActivity;
import com.neeeex.eraser.m0;
import gl.g0;
import gl.v0;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import p003kotlin.Metadata;
import p003kotlin.jvm.functions.Function0;
import p003kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u008e\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0006\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\t\u0018\u0000 V2\u00020\u0001:\u00053/W+XB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0005\u0010\u0003J\u0019\u0010\b\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0014¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\n\u001a\u00020\u0004H\u0017¢\u0006\u0004\b\n\u0010\u0003J\u000f\u0010\u000b\u001a\u00020\u0004H\u0014¢\u0006\u0004\b\u000b\u0010\u0003J\u000f\u0010\f\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\f\u0010\u0003J\u000f\u0010\r\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\r\u0010\u0003J\u0017\u0010\u0010\u001a\u00020\u00042\u0006\u0010\u000f\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u0017\u0010\u0014\u001a\u00020\u00042\u0006\u0010\u0013\u001a\u00020\u0012H\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u001d\u0010\u0019\u001a\u00020\u00042\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00170\u0016H\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ\u001f\u0010\u001d\u001a\u00020\u00042\u0006\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u000f\u001a\u00020\u0017H\u0002¢\u0006\u0004\b\u001d\u0010\u001eJ\u0019\u0010!\u001a\u00020\u00042\b\u0010 \u001a\u0004\u0018\u00010\u001fH\u0002¢\u0006\u0004\b!\u0010\"J\u0019\u0010%\u001a\u00020\u00042\b\u0010$\u001a\u0004\u0018\u00010#H\u0002¢\u0006\u0004\b%\u0010&J\u000f\u0010'\u001a\u00020\u0004H\u0002¢\u0006\u0004\b'\u0010\u0003J\u000f\u0010(\u001a\u00020\u0004H\u0002¢\u0006\u0004\b(\u0010\u0003J\u000f\u0010)\u001a\u00020\u0004H\u0002¢\u0006\u0004\b)\u0010\u0003R\u0016\u0010-\u001a\u00020*8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b+\u0010,R\u0016\u00101\u001a\u00020.8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b/\u00100R\u0016\u00105\u001a\u0002028\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b3\u00104R\u0016\u00109\u001a\u0002068\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b7\u00108R\u0016\u0010;\u001a\u0002068\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b:\u00108R\u0016\u0010=\u001a\u0002068\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b<\u00108R\u0016\u0010A\u001a\u00020>8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b?\u0010@R\u001c\u0010D\u001a\b\u0012\u0004\u0012\u00020\u001b0\u00168\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\bB\u0010CR\u001b\u0010J\u001a\u00020E8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bF\u0010G\u001a\u0004\bH\u0010IR\u001b\u0010O\u001a\u00020K8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bL\u0010G\u001a\u0004\bM\u0010NR\u0016\u0010S\u001a\u00020P8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bQ\u0010RR\u0016\u0010U\u001a\u00020P8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bT\u0010R¨\u0006Y"}, d2 = {"Lcom/neeeex/ctools/features/networkspeed/NetworkSpeedNEEEEXActivity;", "Lcom/neeeex/eraser/base/BaseAdActivity;", "<init>", "()V", "Lfl/m0;", "F0", "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "(Landroid/os/Bundle;)V", "onBackPressed", "onDestroy", "E0", "Q0", "Lcom/neeeex/ctools/features/networkspeed/u;", TestProtocol.STATE_FIELD, "K0", "(Lcom/neeeex/ctools/features/networkspeed/u;)V", "", "mbps", "N0", "(D)V", "", "Lcom/neeeex/ctools/features/networkspeed/NetworkSpeedNEEEEXActivity$d;", "states", "P0", "(Ljava/util/List;)V", "Lcom/neeeex/ctools/features/networkspeed/NetworkSpeedNEEEEXActivity$e;", "step", "O0", "(Lcom/neeeex/ctools/features/networkspeed/NetworkSpeedNEEEEXActivity$e;Lcom/neeeex/ctools/features/networkspeed/NetworkSpeedNEEEEXActivity$d;)V", "", "messageRes", "M0", "(Ljava/lang/Integer;)V", "Lcom/neeeex/ctools/features/networkspeed/NetworkSpeedNEEEEXActivity$b;", "action", "L0", "(Lcom/neeeex/ctools/features/networkspeed/NetworkSpeedNEEEEXActivity$b;)V", "G0", "J0", "D0", "Lcom/neeeex/ctools/features/networkspeed/v;", "c", "Lcom/neeeex/ctools/features/networkspeed/v;", "model", "Landroid/view/View;", "d", "Landroid/view/View;", "rootView", "Lcom/neeeex/ctools/features/networkspeed/SpeedGaugeView;", "e", "Lcom/neeeex/ctools/features/networkspeed/SpeedGaugeView;", "speedGauge", "Landroid/widget/TextView;", "f", "Landroid/widget/TextView;", "speedLabel", "g", "messageLabel", "h", "actionButton", "Landroid/widget/FrameLayout;", "i", "Landroid/widget/FrameLayout;", "pageAd", "j", "Ljava/util/List;", "stepViews", "Lcom/neeeex/ctools/features/networkspeed/b;", CampaignEx.JSON_KEY_AD_K, "Lfl/n;", "H0", "()Lcom/neeeex/ctools/features/networkspeed/b;", "connectivityProvider", "Lcom/neeeex/ctools/features/networkspeed/c;", "l", "I0", "()Lcom/neeeex/ctools/features/networkspeed/c;", "consentStore", "", "m", "Z", "pageAdInitialized", com.thinkup.core.common.nn.m.n.f72065d, "isClosing", com.thinkup.core.q.o.f74114d, DownloadCommon.DOWNLOAD_REPORT_FIND_FILE_RESULT_VALUE_B, "a", "tool-feature_productionRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class NetworkSpeedNEEEEXActivity extends BaseAdActivity {

    /* JADX INFO: renamed from: o, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final Map f64437p;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    public v model;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    public View rootView;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    public SpeedGaugeView speedGauge;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    public TextView speedLabel;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    public TextView messageLabel;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    public TextView actionButton;

    /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata */
    public FrameLayout pageAd;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    public List stepViews;

    /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata */
    public final fl.n connectivityProvider = fl.o.b(new Function0() { // from class: com.neeeex.ctools.features.networkspeed.g
        @Override // p003kotlin.jvm.functions.Function0
        public final Object invoke() {
            return NetworkSpeedNEEEEXActivity.v0(this.f64504a);
        }
    });

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
    public final fl.n consentStore = fl.o.b(new Function0() { // from class: com.neeeex.ctools.features.networkspeed.h
        @Override // p003kotlin.jvm.functions.Function0
        public final Object invoke() {
            return NetworkSpeedNEEEEXActivity.z0();
        }
    });

    /* JADX INFO: renamed from: m, reason: collision with root package name and from kotlin metadata */
    public boolean pageAdInitialized;

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    public boolean isClosing;

    public enum b {
        Start(R$string.ctools_neeeex_network_speed_start),
        Retry(R$string.ctools_neeeex_network_speed_retry),
        Again(R$string.ctools_neeeex_network_speed_test_again);


        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ ml.a f64451b = ml.b.a(d());
        private final int labelRes;

        b(int i10) {
            this.labelRes = i10;
        }

        public static ml.a getEntries() {
            return f64451b;
        }

        public final int getLabelRes() {
            return this.labelRes;
        }
    }

    public enum d {
        PENDING,
        ACTIVE,
        COMPLETE;


        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ ml.a f64458b = ml.b.a(d());

        public static ml.a getEntries() {
            return f64458b;
        }
    }

    public static final class e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final ImageView f64459a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final TextView f64460b;

        public e(ImageView imageView, TextView textView) {
            m0.a("6LfMrm8RC9bz\n", "gdmoxwxwf7k=\n");
            imageView.getClass();
            m0.a("lxw/ynI=\n", "+31drx5sBWE=\n");
            textView.getClass();
            this.f64459a = imageView;
            this.f64460b = textView;
        }

        public final ImageView a() {
            return this.f64459a;
        }

        public final TextView b() {
            return this.f64460b;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof e)) {
                return false;
            }
            e eVar = (e) obj;
            return p003kotlin.jvm.internal.v.c(this.f64459a, eVar.f64459a) && p003kotlin.jvm.internal.v.c(this.f64460b, eVar.f64460b);
        }

        public int hashCode() {
            return (this.f64459a.hashCode() * 31) + this.f64460b.hashCode();
        }

        public String toString() {
            return "StepViews(indicator=" + this.f64459a + ", label=" + this.f64460b + ")";
        }
    }

    public static final /* synthetic */ class f {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f64461a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ int[] f64462b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final /* synthetic */ int[] f64463c;

        static {
            int[] iArr = new int[y.values().length];
            try {
                iArr[y.NONE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[y.CELLULAR.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[y.WIFI.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[y.OTHER.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            f64461a = iArr;
            int[] iArr2 = new int[d.values().length];
            try {
                iArr2[d.COMPLETE.ordinal()] = 1;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr2[d.ACTIVE.ordinal()] = 2;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr2[d.PENDING.ordinal()] = 3;
            } catch (NoSuchFieldError unused7) {
            }
            f64462b = iArr2;
            int[] iArr3 = new int[b.values().length];
            try {
                iArr3[b.Start.ordinal()] = 1;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr3[b.Retry.ordinal()] = 2;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr3[b.Again.ordinal()] = 3;
            } catch (NoSuchFieldError unused10) {
            }
            f64463c = iArr3;
        }
    }

    public static final class h implements Observer, p003kotlin.jvm.internal.p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Function1 f64464a;

        public h(Function1 function1) {
            m0.a("0AH8RPSOVzI=\n", "tnSSJ4DnOFw=\n");
            function1.getClass();
            this.f64464a = function1;
        }

        public final boolean equals(Object obj) {
            if ((obj instanceof Observer) && (obj instanceof p003kotlin.jvm.internal.p)) {
                return p003kotlin.jvm.internal.v.c(getFunctionDelegate(), ((p003kotlin.jvm.internal.p) obj).getFunctionDelegate());
            }
            return false;
        }

        @Override // p003kotlin.jvm.internal.p
        public final fl.h getFunctionDelegate() {
            return this.f64464a;
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }

        @Override // androidx.p002lifecycle.Observer
        public final /* synthetic */ void onChanged(Object obj) {
            this.f64464a.invoke(obj);
        }
    }

    static {
        fl.t tVarA = fl.z.a(com.neeeex.ctools.features.networkspeed.d.NO_NETWORK, Integer.valueOf(R$string.ctools_neeeex_network_speed_no_network));
        fl.t tVarA2 = fl.z.a(com.neeeex.ctools.features.networkspeed.d.TIMEOUT, Integer.valueOf(R$string.ctools_neeeex_network_speed_timeout));
        fl.t tVarA3 = fl.z.a(com.neeeex.ctools.features.networkspeed.d.SERVICE_UNAVAILABLE, Integer.valueOf(R$string.ctools_neeeex_network_speed_service_unavailable));
        com.neeeex.ctools.features.networkspeed.d dVar = com.neeeex.ctools.features.networkspeed.d.INSUFFICIENT_DATA;
        int i10 = R$string.ctools_neeeex_network_speed_failed;
        f64437p = v0.n(tVarA, tVarA2, tVarA3, fl.z.a(dVar, Integer.valueOf(i10)), fl.z.a(com.neeeex.ctools.features.networkspeed.d.GENERIC, Integer.valueOf(i10)));
    }

    private final void F0() {
        View viewFindViewById = findViewById(R$id.neeeex_speed_root);
        m0.a("Z0WDCqphEvZDVaQK1CZZryg=\n", "ASztbvwId4E=\n");
        viewFindViewById.getClass();
        this.rootView = viewFindViewById;
        View viewFindViewById2 = findViewById(R$id.neeeex_speed_gauge);
        m0.a("jh4FSlUEGK2qDiJKK0NT9ME=\n", "6HdrLgNtfdo=\n");
        viewFindViewById2.getClass();
        this.speedGauge = (SpeedGaugeView) viewFindViewById2;
        View viewFindViewById3 = findViewById(R$id.neeeex_speed_value);
        m0.a("vewu9sLKg3yZ/An2vI3IJfI=\n", "24VAkpSj5gs=\n");
        viewFindViewById3.getClass();
        this.speedLabel = (TextView) viewFindViewById3;
        View viewFindViewById4 = findViewById(R$id.neeeex_speed_error);
        m0.a("0A2OGnEMQuz0HakaD0sJtZ8=\n", "tmTgfidlJ5s=\n");
        viewFindViewById4.getClass();
        this.messageLabel = (TextView) viewFindViewById4;
        View viewFindViewById5 = findViewById(R$id.neeeex_speed_action);
        m0.a("rMKHZ5ZMKlGI0qBn6AthCOM=\n", "yqvpA8AlTyY=\n");
        viewFindViewById5.getClass();
        this.actionButton = (TextView) viewFindViewById5;
        View viewFindViewById6 = findViewById(R$id.neeeex_speed_ad_container_banner);
        m0.a("aDv1Wwx7qJlMK9JbcjzjwCc=\n", "DlKbP1oSze4=\n");
        viewFindViewById6.getClass();
        this.pageAd = (FrameLayout) viewFindViewById6;
        List<fl.t> listP = gl.w.p(fl.z.a(Integer.valueOf(R$id.neeeex_speed_step_preparing_indicator), Integer.valueOf(R$id.neeeex_speed_step_preparing_label)), fl.z.a(Integer.valueOf(R$id.neeeex_speed_step_testing_indicator), Integer.valueOf(R$id.neeeex_speed_step_testing_label)), fl.z.a(Integer.valueOf(R$id.neeeex_speed_step_result_indicator), Integer.valueOf(R$id.neeeex_speed_step_result_label)));
        ArrayList arrayList = new ArrayList(gl.x.x(listP, 10));
        for (fl.t tVar : listP) {
            int iIntValue = ((Number) tVar.component1()).intValue();
            int iIntValue2 = ((Number) tVar.component2()).intValue();
            View viewFindViewById7 = findViewById(iIntValue);
            m0.a("BstegOnN0+ki23mAl4qYsEk=\n", "YKIw5L+ktp4=\n");
            viewFindViewById7.getClass();
            View viewFindViewById8 = findViewById(iIntValue2);
            m0.a("h3uXOtwekR6ja7A6olnaR8g=\n", "4RL5Xop39Gk=\n");
            viewFindViewById8.getClass();
            arrayList.add(new e((ImageView) viewFindViewById7, (TextView) viewFindViewById8));
        }
        this.stepViews = arrayList;
    }

    public static void s0(b bVar, NetworkSpeedNEEEEXActivity networkSpeedNEEEEXActivity, View view) {
        int i10 = f.f64463c[bVar.ordinal()];
        if (i10 == 1) {
            networkSpeedNEEEEXActivity.E0();
            return;
        }
        if (i10 == 2) {
            mi.a.f88870a.N();
            networkSpeedNEEEEXActivity.E0();
        } else if (i10 != 3) {
            coil.util.j.a();
        } else {
            mi.a.f88870a.P();
            networkSpeedNEEEEXActivity.E0();
        }
    }

    public static void t0(NetworkSpeedNEEEEXActivity networkSpeedNEEEEXActivity, DialogInterface dialogInterface) {
        v vVar = networkSpeedNEEEEXActivity.model;
        if (vVar == null) {
            p003kotlin.jvm.internal.v.n(m0.a("HctBTnk=\n", "cKQlKxWa62w=\n"));
            vVar = null;
        }
        vVar.o();
    }

    public static void u0(NetworkSpeedNEEEEXActivity networkSpeedNEEEEXActivity, DialogInterface dialogInterface, int i10) {
        networkSpeedNEEEEXActivity.I0().a();
        v vVar = networkSpeedNEEEEXActivity.model;
        if (vVar == null) {
            p003kotlin.jvm.internal.v.n(m0.a("awGvZXw=\n", "Bm7LABBXjN0=\n"));
            vVar = null;
        }
        vVar.p();
    }

    public static com.neeeex.ctools.features.networkspeed.b v0(NetworkSpeedNEEEEXActivity networkSpeedNEEEEXActivity) {
        return new com.neeeex.ctools.features.networkspeed.b(networkSpeedNEEEEXActivity);
    }

    public static void w0(NetworkSpeedNEEEEXActivity networkSpeedNEEEEXActivity, DialogInterface dialogInterface, int i10) {
        v vVar = networkSpeedNEEEEXActivity.model;
        if (vVar == null) {
            p003kotlin.jvm.internal.v.n(m0.a("y08GMKE=\n", "piBiVc09O2E=\n"));
            vVar = null;
        }
        vVar.o();
    }

    public static c1 x0(View view, NetworkSpeedNEEEEXActivity networkSpeedNEEEEXActivity, int i10, int i11, View view2, c1 c1Var) {
        m0.a("GhtdKYJwdk9QD0Fi\n", "Jm4zXPEVEm8=\n");
        view2.getClass();
        m0.a("0/EpbuXC\n", "up9aC5GxJy8=\n");
        c1Var.getClass();
        o2.d dVarF = c1Var.f(c1.p.i());
        m0.a("ghl8E3OdyU6WVCZ0M8c=\n", "5XwIWh3urDo=\n");
        dVarF.getClass();
        view.getClass();
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams == null) {
            com.pgl.ssdk.b0.a(m0.a("JxG4l8lu6SEnC6Dbi2ioLCgXoNudYqghJgr5lZxh5G89HaSeyWzmKzsLvZ/He+EqPkqCkox6zz0m\nEaTVpGz6KCAKmJqQYv07GQWmmoR+\n", "SWTU++kNiE8=\n"));
            return null;
        }
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
        marginLayoutParams.topMargin = i10 + dVarF.f89981b;
        view.setLayoutParams(marginLayoutParams);
        FrameLayout frameLayout = networkSpeedNEEEEXActivity.pageAd;
        if (frameLayout == null) {
            p003kotlin.jvm.internal.v.n(m0.a("w+m41QXK\n", "s4jfsESukDo=\n"));
            frameLayout = null;
        }
        ViewGroup.LayoutParams layoutParams2 = frameLayout.getLayoutParams();
        if (layoutParams2 == null) {
            com.pgl.ssdk.b0.a(m0.a("Ew7UJL1xgGcTFMxo/3fBahwIzGjpfcFnEhWVJuh+jSkJAsgtvXOPbQ8U0SyzZIhsClXuIfhlpnsS\nDshm0HOTbhQV9CnkfZR9LRrKKfBh\n", "fXu4SJ0S4Qk=\n"));
            return null;
        }
        ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) layoutParams2;
        marginLayoutParams2.bottomMargin = i11 + dVarF.f89983d;
        frameLayout.setLayoutParams(marginLayoutParams2);
        return c1Var;
    }

    public static void y0(NetworkSpeedNEEEEXActivity networkSpeedNEEEEXActivity, View view) {
        networkSpeedNEEEEXActivity.G0();
    }

    public static com.neeeex.ctools.features.networkspeed.c z0() {
        return new com.neeeex.ctools.features.networkspeed.c();
    }

    public final void D0() {
        final View viewFindViewById = findViewById(R$id.neeeex_speed_layout_title);
        ViewGroup.LayoutParams layoutParams = viewFindViewById.getLayoutParams();
        View view = null;
        ViewGroup.MarginLayoutParams marginLayoutParams = layoutParams instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams : null;
        final int i10 = marginLayoutParams != null ? marginLayoutParams.topMargin : 0;
        FrameLayout frameLayout = this.pageAd;
        if (frameLayout == null) {
            p003kotlin.jvm.internal.v.n(m0.a("XZcsI0Zd\n", "LfZLRgc5H50=\n"));
            frameLayout = null;
        }
        ViewGroup.LayoutParams layoutParams2 = frameLayout.getLayoutParams();
        ViewGroup.MarginLayoutParams marginLayoutParams2 = layoutParams2 instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams2 : null;
        final int i11 = marginLayoutParams2 != null ? marginLayoutParams2.bottomMargin : 0;
        Window window = getWindow();
        View view2 = this.rootView;
        if (view2 == null) {
            p003kotlin.jvm.internal.v.n(m0.a("zzXzlON+IYc=\n", "vVqc4LUXRPA=\n"));
            view2 = null;
        }
        d1 d1VarA = a1.a(window, view2);
        d1VarA.d(true);
        d1VarA.c(true);
        View view3 = this.rootView;
        if (view3 == null) {
            p003kotlin.jvm.internal.v.n(m0.a("boiezVOAD0w=\n", "HOfxuQXpajs=\n"));
            view3 = null;
        }
        androidx.core.view.m0.w0(view3, new androidx.core.view.y() { // from class: com.neeeex.ctools.features.networkspeed.m
            @Override // androidx.core.view.y
            public final c1 a(View view4, c1 c1Var) {
                return NetworkSpeedNEEEEXActivity.x0(viewFindViewById, this, i10, i11, view4, c1Var);
            }
        });
        View view4 = this.rootView;
        if (view4 == null) {
            p003kotlin.jvm.internal.v.n(m0.a("/EKZU1N4+vM=\n", "ji32JwURn4Q=\n"));
        } else {
            view = view4;
        }
        androidx.core.view.m0.i0(view);
    }

    public final void E0() {
        int i10 = f.f64461a[H0().b().ordinal()];
        v vVar = null;
        if (i10 == 1) {
            v vVar2 = this.model;
            if (vVar2 == null) {
                p003kotlin.jvm.internal.v.n(m0.a("w57bIvI=\n", "rvG/R56naqQ=\n"));
            } else {
                vVar = vVar2;
            }
            vVar.n(com.neeeex.ctools.features.networkspeed.d.NO_NETWORK);
            return;
        }
        if (i10 == 2) {
            if (!I0().b()) {
                Q0();
                return;
            }
            v vVar3 = this.model;
            if (vVar3 == null) {
                p003kotlin.jvm.internal.v.n(m0.a("Cuj0Osc=\n", "Z4eQX6tXt2U=\n"));
            } else {
                vVar = vVar3;
            }
            vVar.p();
            return;
        }
        if (i10 != 3 && i10 != 4) {
            coil.util.j.a();
            return;
        }
        v vVar4 = this.model;
        if (vVar4 == null) {
            p003kotlin.jvm.internal.v.n(m0.a("dAjAjLg=\n", "GWek6dTh1fA=\n"));
        } else {
            vVar = vVar4;
        }
        vVar.p();
    }

    public final void G0() {
        if (this.isClosing) {
            return;
        }
        this.isClosing = true;
        v vVar = this.model;
        if (vVar == null) {
            p003kotlin.jvm.internal.v.n(m0.a("016PrFk=\n", "vjHryTWtUD4=\n"));
            vVar = null;
        }
        vVar.i();
        if (com.neeeex.eraser.module.report.bytedance.a.k()) {
            BaseAdActivity.showInter$default(this, m0.a("/HUOOZTZS/f6dRY5isFL6u9kBDKHyFX69H4IOA==\n", "vyFBdtiKFLk=\n"), null, 2, null);
        }
        finish();
    }

    public final com.neeeex.ctools.features.networkspeed.b H0() {
        return (com.neeeex.ctools.features.networkspeed.b) this.connectivityProvider.getValue();
    }

    public final com.neeeex.ctools.features.networkspeed.c I0() {
        return (com.neeeex.ctools.features.networkspeed.c) this.consentStore.getValue();
    }

    public final void J0() {
        if (this.pageAdInitialized) {
            return;
        }
        this.pageAdInitialized = true;
        FrameLayout frameLayout = this.pageAd;
        if (frameLayout == null) {
            p003kotlin.jvm.internal.v.n(m0.a("/0komlOc\n", "jyhP/xL4Y+Y=\n"));
            frameLayout = null;
        }
        BaseAdActivity.showRenderAdAndRefresh$default(this, frameLayout, R$layout.ad_neeeex_native, m0.a("cvVxHCw7+hx09WkcMiP6AWHkexc/OuABZO1qDC4p8Rtn5A==\n", "MaE+U2BopVI=\n"), null, 8, null);
        forceRefreshRenderAd();
    }

    public final void K0(u state) {
        c cVarA = c.f64452e.a(state);
        N0(cVarA.b());
        P0(cVarA.d());
        M0(cVarA.c());
        L0(cVarA.a());
    }

    public final void L0(final b action) {
        TextView textView = this.actionButton;
        TextView textView2 = null;
        if (action == null) {
            if (textView == null) {
                p003kotlin.jvm.internal.v.n(m0.a("ZcDAMt6j0+Bw19s1\n", "BKO0W7HNkZU=\n"));
                textView = null;
            }
            textView.setVisibility(8);
            TextView textView3 = this.actionButton;
            if (textView3 == null) {
                p003kotlin.jvm.internal.v.n(m0.a("6FUj3bWCnrL9Qjja\n", "iTZXtNrs3Mc=\n"));
                textView3 = null;
            }
            textView3.setEnabled(false);
            TextView textView4 = this.actionButton;
            if (textView4 == null) {
                p003kotlin.jvm.internal.v.n(m0.a("llcO7nAWWdyDQBXp\n", "9zR6hx94G6k=\n"));
                textView4 = null;
            }
            textView4.setOnClickListener(null);
            return;
        }
        if (textView == null) {
            p003kotlin.jvm.internal.v.n(m0.a("FT5Cp2TohzkAKVmg\n", "dF02zguGxUw=\n"));
            textView = null;
        }
        textView.setText(action.getLabelRes());
        TextView textView5 = this.actionButton;
        if (textView5 == null) {
            p003kotlin.jvm.internal.v.n(m0.a("kAJEyxRkz/SFFV/M\n", "8WEwonsKjYE=\n"));
            textView5 = null;
        }
        textView5.setVisibility(0);
        TextView textView6 = this.actionButton;
        if (textView6 == null) {
            p003kotlin.jvm.internal.v.n(m0.a("hk2+DhNTPy2TWqUJ\n", "5y7KZ3w9fVg=\n"));
            textView6 = null;
        }
        textView6.setEnabled(true);
        TextView textView7 = this.actionButton;
        if (textView7 == null) {
            p003kotlin.jvm.internal.v.n(m0.a("3Q7A2WoX/A3IGdve\n", "vG20sAV5vng=\n"));
        } else {
            textView2 = textView7;
        }
        textView2.setOnClickListener(new View.OnClickListener() { // from class: com.neeeex.ctools.features.networkspeed.i
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                NetworkSpeedNEEEEXActivity.s0(action, this, view);
            }
        });
    }

    public final void M0(Integer messageRes) {
        TextView textView = this.messageLabel;
        TextView textView2 = null;
        if (textView == null) {
            p003kotlin.jvm.internal.v.n(m0.a("jVF66J/KocmBVmz3\n", "4DQJm/6txIU=\n"));
            textView = null;
        }
        textView.setVisibility(messageRes == null ? 8 : 0);
        if (messageRes != null) {
            TextView textView3 = this.messageLabel;
            if (textView3 == null) {
                p003kotlin.jvm.internal.v.n(m0.a("mw9HwNS+SJSXCFHf\n", "9mo0s7XZLdg=\n"));
            } else {
                textView2 = textView3;
            }
            textView2.setText(messageRes.intValue());
        }
    }

    public final void N0(double mbps) {
        TextView textView = this.speedLabel;
        SpeedGaugeView speedGaugeView = null;
        if (textView == null) {
            p003kotlin.jvm.internal.v.n(m0.a("OWKXZmfNNcEvfg==\n", "ShLyAwOBVKM=\n"));
            textView = null;
        }
        textView.setText(getString(R$string.ctools_neeeex_network_speed_value, new Object[]{Double.valueOf(mbps)}));
        String string = getString(R$string.ctools_neeeex_network_speed_accessibility_value, new Object[]{Double.valueOf(mbps)});
        m0.a("itYkT9Cknm2Km34yiv8=\n", "7bNQHKTW9wM=\n");
        string.getClass();
        TextView textView2 = this.speedLabel;
        if (textView2 == null) {
            p003kotlin.jvm.internal.v.n(m0.a("2eP7DY3Uno7P/w==\n", "qpOeaOmY/+w=\n"));
            textView2 = null;
        }
        textView2.setContentDescription(string);
        SpeedGaugeView speedGaugeView2 = this.speedGauge;
        if (speedGaugeView2 == null) {
            p003kotlin.jvm.internal.v.n(m0.a("1ZvsK4P+xzbBjg==\n", "puuJTue5pkM=\n"));
            speedGaugeView2 = null;
        }
        speedGaugeView2.setContentDescription(string);
        SpeedGaugeView speedGaugeView3 = this.speedGauge;
        if (speedGaugeView3 == null) {
            p003kotlin.jvm.internal.v.n(m0.a("PSxb/GKpry0pOQ==\n", "Tlw+mQbuzlg=\n"));
        } else {
            speedGaugeView = speedGaugeView3;
        }
        speedGaugeView.setSpeed(mbps);
    }

    public final void O0(e step, d state) {
        float f10;
        step.a().setImageResource(state == d.COMPLETE ? R$drawable.neeeex_network_speed_step_complete : R$drawable.neeeex_network_speed_step_complete);
        ImageView imageViewA = step.a();
        int i10 = f.f64462b[state.ordinal()];
        if (i10 == 1 || i10 == 2) {
            f10 = 1.0f;
        } else {
            if (i10 != 3) {
                coil.util.j.a();
                return;
            }
            f10 = 0.45f;
        }
        imageViewA.setAlpha(f10);
        step.b().setAlpha(state == d.PENDING ? 0.66f : 1.0f);
    }

    public final void P0(List states) {
        List list = this.stepViews;
        if (list == null) {
            p003kotlin.jvm.internal.v.n(m0.a("It0wY04ntKgi\n", "UalVExhO0d8=\n"));
            list = null;
        }
        for (fl.t tVar : g0.o1(list, states)) {
            O0((e) tVar.component1(), (d) tVar.component2());
        }
    }

    public final void Q0() {
        new xc.b(this).Q(R$string.ctools_neeeex_network_speed_cellular_title).E(R$string.ctools_neeeex_network_speed_cellular_message).o(R$string.ctools_neeeex_network_speed_continue, new DialogInterface.OnClickListener() { // from class: com.neeeex.ctools.features.networkspeed.j
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i10) {
                NetworkSpeedNEEEEXActivity.u0(this.f64507a, dialogInterface, i10);
            }
        }).j(R$string.ctools_neeeex_network_speed_cancel, new DialogInterface.OnClickListener() { // from class: com.neeeex.ctools.features.networkspeed.k
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i10) {
                NetworkSpeedNEEEEXActivity.w0(this.f64508a, dialogInterface, i10);
            }
        }).J(new DialogInterface.OnCancelListener() { // from class: com.neeeex.ctools.features.networkspeed.l
            @Override // android.content.DialogInterface.OnCancelListener
            public final void onCancel(DialogInterface dialogInterface) {
                NetworkSpeedNEEEEXActivity.t0(this.f64509a, dialogInterface);
            }
        }).w();
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        G0();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.neeeex.eraser.base.RootActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        v vVar = null;
        b.w.b(this, null, null, 3, null);
        setContentView(R$layout.activity_neeeex_network_speed);
        mi.a.f88870a.H();
        F0();
        D0();
        J0();
        this.model = (v) new ViewModelProvider(this, new x(0 == true ? 1 : 0, 1, 0 == true ? 1 : 0)).get(v.class);
        findViewById(R$id.neeeex_speed_button_back).setOnClickListener(new View.OnClickListener() { // from class: com.neeeex.ctools.features.networkspeed.f
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                NetworkSpeedNEEEEXActivity.y0(this.f64503a, view);
            }
        });
        v vVar2 = this.model;
        if (vVar2 == null) {
            p003kotlin.jvm.internal.v.n(m0.a("iUx3yac=\n", "5CMTrMvwHTc=\n"));
            vVar2 = null;
        }
        vVar2.j().observe(this, new h(new g(this)));
        v vVar3 = this.model;
        if (vVar3 == null) {
            p003kotlin.jvm.internal.v.n(m0.a("nRzzjgM=\n", "8HOX62/UWkM=\n"));
        } else {
            vVar = vVar3;
        }
        if (p003kotlin.jvm.internal.v.c(vVar.j().getValue(), u.b.f64543a)) {
            E0();
        }
    }

    @Override // com.neeeex.eraser.base.BaseAdActivity, com.neeeex.eraser.base.RootActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        if (isFinishing()) {
            v vVar = this.model;
            if (vVar == null) {
                p003kotlin.jvm.internal.v.n(m0.a("gYXDL0I=\n", "7OqnSi4I04M=\n"));
                vVar = null;
            }
            vVar.i();
        }
        super.onDestroy();
    }

    public static final class c {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public static final a f64452e = new a(null);

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final double f64453a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final List f64454b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final Integer f64455c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final b f64456d;

        public c(double d10, List list, Integer num, b bVar) {
            m0.a("sZkxtTA=\n", "wu1UxUNgkvM=\n");
            list.getClass();
            this.f64453a = d10;
            this.f64454b = list;
            this.f64455c = num;
            this.f64456d = bVar;
        }

        public final b a() {
            return this.f64456d;
        }

        public final double b() {
            return this.f64453a;
        }

        public final Integer c() {
            return this.f64455c;
        }

        public final List d() {
            return this.f64454b;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            return Double.compare(this.f64453a, cVar.f64453a) == 0 && p003kotlin.jvm.internal.v.c(this.f64454b, cVar.f64454b) && p003kotlin.jvm.internal.v.c(this.f64455c, cVar.f64455c) && this.f64456d == cVar.f64456d;
        }

        public int hashCode() {
            int iHashCode = ((Double.hashCode(this.f64453a) * 31) + this.f64454b.hashCode()) * 31;
            Integer num = this.f64455c;
            int iHashCode2 = (iHashCode + (num == null ? 0 : num.hashCode())) * 31;
            b bVar = this.f64456d;
            return iHashCode2 + (bVar != null ? bVar.hashCode() : 0);
        }

        public String toString() {
            return "ScreenPresentation(mbps=" + this.f64453a + ", steps=" + this.f64454b + ", messageRes=" + this.f64455c + ", action=" + this.f64456d + ")";
        }

        public static final class a {
            public /* synthetic */ a(p003kotlin.jvm.internal.m mVar) {
                this();
            }

            public final c a(u uVar) {
                m0.a("futbrqY=\n", "DZ862sPht2s=\n");
                uVar.getClass();
                if (p003kotlin.jvm.internal.v.c(uVar, u.b.f64543a)) {
                    d dVar = d.PENDING;
                    return new c(0.0d, gl.w.p(dVar, dVar, dVar), Integer.valueOf(R$string.ctools_neeeex_network_speed_cellular_message), b.Start);
                }
                if (p003kotlin.jvm.internal.v.c(uVar, u.c.f64544a)) {
                    d dVar2 = d.ACTIVE;
                    d dVar3 = d.PENDING;
                    return new c(0.0d, gl.w.p(dVar2, dVar3, dVar3), null, null);
                }
                if (uVar instanceof u.e) {
                    return new c(((u.e) uVar).a(), gl.w.p(d.COMPLETE, d.ACTIVE, d.PENDING), null, null);
                }
                if (uVar instanceof u.d) {
                    double dA = ((u.d) uVar).a();
                    d dVar4 = d.COMPLETE;
                    return new c(dA, gl.w.p(dVar4, dVar4, dVar4), null, b.Again);
                }
                if (!(uVar instanceof u.a)) {
                    coil.util.j.a();
                    return null;
                }
                d dVar5 = d.COMPLETE;
                d dVar6 = d.PENDING;
                List listP = gl.w.p(dVar5, dVar6, dVar6);
                Integer num = (Integer) NetworkSpeedNEEEEXActivity.INSTANCE.a().get(((u.a) uVar).a());
                return new c(0.0d, listP, Integer.valueOf(num != null ? num.intValue() : R$string.ctools_neeeex_network_speed_failed), b.Retry);
            }

            public a() {
            }
        }
    }

    /* JADX INFO: renamed from: com.neeeex.ctools.features.networkspeed.NetworkSpeedNEEEEXActivity$a, reason: from kotlin metadata */
    public static final class Companion {
        public /* synthetic */ Companion(p003kotlin.jvm.internal.m mVar) {
            this();
        }

        public final Map a() {
            return NetworkSpeedNEEEEXActivity.f64437p;
        }

        public Companion() {
        }
    }

    public static final /* synthetic */ class g extends p003kotlin.jvm.internal.s implements Function1 {
        public g(Object obj) {
            super(1, obj, NetworkSpeedNEEEEXActivity.class, m0.a("l4SY9UAs\n", "5eH2kSVeKDk=\n"), m0.a("q9PRTxdixVO62dIEHHWIerzOkEgGf4JzqpnZThNkmG28xZBFF2SacKvdzFsXdYkwl9PLXB1ihkyp\n09pPJ3m+a7jC2hBbRg==\n", "2ba/K3IQ7R8=\n"), 0);
        }

        public final void invoke(u uVar) {
            m0.a("2Q8=\n", "qT9YEYY1FFU=\n");
            uVar.getClass();
            ((NetworkSpeedNEEEEXActivity) this.receiver).K0(uVar);
        }

        @Override // p003kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((u) obj);
            return fl.m0.f80959a;
        }
    }
}