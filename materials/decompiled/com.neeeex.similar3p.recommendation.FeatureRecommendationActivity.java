package com.neeeex.similar3p.recommendation;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import b.k0;
import b.o0;
import com.neeeex.eraser.R$drawable;
import com.neeeex.eraser.R$layout;
import com.neeeex.eraser.base.BaseAdActivity;
import com.neeeex.eraser.base.BaseStoragePermActivity;
import com.neeeex.eraser.m0;
import com.neeeex.eraser.module.report.bytedance.a;
import com.neeeex.similar3p.junk.ui.h0;
import com.neeeex.similar3p.recommendation.FeatureRecommendationActivity;
import com.tradplus.ads.common.serialization.asm.Opcodes;
import fl.n;
import fl.o;
import fl.u;
import fl.v;
import gl.g0;
import gl.w;
import ji.c1;
import p003kotlin.Metadata;
import p003kotlin.jvm.functions.Function0;
import p003kotlin.jvm.functions.Function1;
import p003kotlin.jvm.internal.s;
import zi.f;
import zi.j;
import zi.m;
import zi.p;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0000\u0018\u0000 !2\u00020\u0001:\u0001\"B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0019\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0014¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\u000b\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\tH\u0014¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\r\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\r\u0010\u0003J\u0011\u0010\u000f\u001a\u0004\u0018\u00010\u000eH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0013\u001a\u00020\u00062\u0006\u0010\u0012\u001a\u00020\u0011H\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0015\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0015\u0010\u0003R\u001b\u0010\u001b\u001a\u00020\u00168BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u001b\u0010 \u001a\u00020\u001c8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001d\u0010\u0018\u001a\u0004\b\u001e\u0010\u001f¨\u0006#"}, d2 = {"Lcom/neeeex/similar3p/recommendation/FeatureRecommendationActivity;", "Lcom/neeeex/eraser/base/BaseStoragePermActivity;", "<init>", "()V", "Landroid/os/Bundle;", "savedInstanceState", "Lfl/m0;", "onCreate", "(Landroid/os/Bundle;)V", "Landroid/content/Intent;", "intent", "onNewIntent", "(Landroid/content/Intent;)V", "onStoragePermission", "Lzi/n;", "N0", "()Lzi/n;", "Lzi/o;", "plan", "O0", "(Lzi/o;)V", "K0", "Lji/c1;", "c", "Lfl/n;", "L0", "()Lji/c1;", "binding", "Lzi/j;", "d", "M0", "()Lzi/j;", "recommendationLauncher", "e", "a", "tool-feature_productionRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class FeatureRecommendationActivity extends BaseStoragePermActivity {

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    public final n binding = o.b(new Function0() { // from class: zi.c
        @Override // p003kotlin.jvm.functions.Function0
        public final Object invoke() {
            return FeatureRecommendationActivity.G0(this.f104384a);
        }
    });

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    public final n recommendationLauncher = o.b(new Function0() { // from class: zi.d
        @Override // p003kotlin.jvm.functions.Function0
        public final Object invoke() {
            return FeatureRecommendationActivity.H0(this.f104385a);
        }
    });

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final String f66539f = m0.a("sigqhHOvwy26IDKTZpXEHbE1P4JngsU=\n", "11Be9hLwoEI=\n");

    public static c1 G0(FeatureRecommendationActivity featureRecommendationActivity) {
        return c1.c(featureRecommendationActivity.getLayoutInflater());
    }

    public static j H0(FeatureRecommendationActivity featureRecommendationActivity) {
        return new j(featureRecommendationActivity);
    }

    public static void I0(FeatureRecommendationActivity featureRecommendationActivity, View view) {
        featureRecommendationActivity.finish();
    }

    public static fl.m0 J0(FeatureRecommendationActivity featureRecommendationActivity, k0 k0Var) {
        m0.a("3lZjtiOSnJ6eYWqzPNScmZE=\n", "+iIL31C2/fo=\n");
        k0Var.getClass();
        featureRecommendationActivity.finish();
        return fl.m0.f80959a;
    }

    private final j M0() {
        return (j) this.recommendationLauncher.getValue();
    }

    public final void K0() {
        if (a.k()) {
            int iA = ti.c.a(8);
            FrameLayout frameLayout = new FrameLayout(this);
            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, ti.c.a(Opcodes.IFEQ) + (iA * 2));
            layoutParams.topMargin = ti.c.a(4);
            layoutParams.bottomMargin = ti.c.a(16);
            frameLayout.setLayoutParams(layoutParams);
            frameLayout.setPadding(iA, iA, iA, iA);
            frameLayout.setBackgroundResource(R$drawable.neeeex_for_you_ad_surface);
            frameLayout.setClipToOutline(true);
            frameLayout.setElevation(ti.c.a(1));
            frameLayout.setVisibility(8);
            L0().f85376e.addView(frameLayout);
            BaseAdActivity.showNativeAdAndRefresh$default(this, frameLayout, R$layout.ad_neeeex_native, m0.a("ikPj8PqwnSqBR/Lg7a2dPoFF6fjyrawohVLv+vGXrC2QT/Dw\n", "5CaGlZ/Iwkw=\n"), null, 8, null);
        }
    }

    public final c1 L0() {
        return (c1) this.binding.getValue();
    }

    public final zi.n N0() {
        Object objM372constructorimpl;
        String stringExtra = getIntent().getStringExtra(f66539f);
        if (stringExtra == null) {
            return null;
        }
        try {
            u.a aVar = u.Companion;
            objM372constructorimpl = u.m372constructorimpl(zi.n.valueOf(stringExtra));
        } catch (Throwable th2) {
            u.a aVar2 = u.Companion;
            objM372constructorimpl = u.m372constructorimpl(v.a(th2));
        }
        return (zi.n) (u.m377isFailureimpl(objM372constructorimpl) ? null : objM372constructorimpl);
    }

    public final void O0(zi.o plan) {
        FrameLayout frameLayout = L0().f85374c;
        f fVar = f.f104388a;
        FrameLayout frameLayout2 = L0().f85374c;
        m0.a("1/hiIwURyAPLxGgzJgzvGMzvYiI=\n", "uZ0HRmBpjmw=\n");
        frameLayout2.getClass();
        frameLayout.addView(fVar.b(frameLayout2, plan.a(), true, new b(M0())));
        int i10 = 0;
        for (Object obj : g0.g0(plan.b(), 1)) {
            int i11 = i10 + 1;
            if (i10 < 0) {
                w.w();
            }
            LinearLayout linearLayout = L0().f85376e;
            f fVar2 = f.f104388a;
            LinearLayout linearLayout2 = L0().f85376e;
            m0.a("2QX1KttjxxbFOf868nLyDQ==\n", "t2CQT74bgXk=\n");
            linearLayout2.getClass();
            linearLayout.addView(fVar2.b(linearLayout2, (p) obj, false, new c(M0())));
            if (i10 == 0) {
                K0();
            }
            i10 = i11;
        }
    }

    @Override // com.neeeex.eraser.base.RootActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        zi.n nVarN0 = N0();
        if (nVarN0 == null) {
            finish();
            return;
        }
        b.w.b(this, null, null, 3, null);
        setContentView(L0().getRoot());
        ConstraintLayout root = L0().getRoot();
        m0.a("V1XEBE1zLjweHp5/\n", "MDCwViIcWhQ=\n");
        root.getClass();
        ConstraintLayout constraintLayout = L0().f85378g;
        m0.a("UvmnQ57QzCxOxa1Tr8flL179sA==\n", "PJzCJvuoikM=\n");
        constraintLayout.getClass();
        h0.c(root, constraintLayout, null, L0().f85377f, 4, null);
        L0().f85373b.setOnClickListener(new View.OnClickListener() { // from class: zi.a
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                FeatureRecommendationActivity.I0(this.f104382a, view);
            }
        });
        o0.b(getOnBackPressedDispatcher(), this, false, new Function1() { // from class: zi.b
            @Override // p003kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return FeatureRecommendationActivity.J0(this.f104383a, (k0) obj);
            }
        }, 2, null);
        zi.o oVarB = m.f104407a.b(nVarN0.getCompletedFeature());
        if (oVarB == null) {
            finish();
        } else {
            O0(oVarB);
        }
    }

    @Override // com.neeeex.eraser.base.BaseStoragePermActivity, com.neeeex.eraser.base.RootActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onNewIntent(Intent intent) {
        m0.a("AhPCpgFk\n", "a322w28QqmU=\n");
        intent.getClass();
        super.onNewIntent(intent);
        setIntent(intent);
    }

    @Override // com.neeeex.eraser.base.BaseStoragePermActivity
    public void onStoragePermission() {
        M0().j();
    }

    public static final /* synthetic */ class b extends s implements Function1 {
        public b(Object obj) {
            super(1, obj, j.class, m0.a("LesDBunH\n", "QYp2aIqv6GI=\n"), m0.a("JjlyG35b/JApN2pac1axuS8gKAZ0Xr2wKyo0BTJBsb8lNWoQc1e1qCM3aVpPVrezJzViG3lWsJov\nOXMAb1bv9Rw=\n", "SlgHdR0z1Nw=\n"), 0);
        }

        public final void invoke(p pVar) {
            m0.a("eVc=\n", "CWf1nMBzCfc=\n");
            pVar.getClass();
            ((j) this.receiver).e(pVar);
        }

        @Override // p003kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((p) obj);
            return fl.m0.f80959a;
        }
    }

    public static final /* synthetic */ class c extends s implements Function1 {
        public c(Object obj) {
            super(1, obj, j.class, m0.a("OaJ70Wvd\n", "VcMOvwi10vc=\n"), m0.a("2IaqsBevQwHXiLLxGqIOKNGf8K0dqgIh1ZXsrlu1Di7birK7GqMKOd2IsfEmoggi2Yq6sBCiDwvR\nhqurBqJQZOI=\n", "tOff3nTHa00=\n"), 0);
        }

        public final void invoke(p pVar) {
            m0.a("aWY=\n", "GVbUQs2uWXQ=\n");
            pVar.getClass();
            ((j) this.receiver).e(pVar);
        }

        @Override // p003kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((p) obj);
            return fl.m0.f80959a;
        }
    }
}