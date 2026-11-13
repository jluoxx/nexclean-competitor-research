package com.neeeex.ctools.features.loading;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.LinearInterpolator;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.fragment.app.l0;
import b.k0;
import b.o0;
import b.w;
import coil.util.j;
import com.airbnb.lottie.LottieAnimationView;
import com.android.launcher3.icons.cache.BaseIconCache;
import com.mbridge.msdk.foundation.download.core.DownloadCommon;
import com.neeeex.ctools.features.loading.CtoolsLoadingNEEEEXActivity;
import com.neeeex.eraser.R$id;
import com.neeeex.eraser.R$layout;
import com.neeeex.eraser.R$string;
import com.neeeex.eraser.base.BaseAdActivity;
import com.neeeex.eraser.m0;
import com.neeeex.eraser.module.dialog.ExitScanDialog;
import ml.b;
import p003kotlin.Metadata;
import p003kotlin.jvm.functions.Function0;
import p003kotlin.jvm.functions.Function1;
import p003kotlin.jvm.internal.m;
import p003kotlin.jvm.internal.s;
import p003kotlin.jvm.internal.v;
import zi.l;
import zi.n;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u0000 (2\u00020\u0001:\u0004\u001d!)*B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0019\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0014¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\t\u001a\u00020\u0006H\u0014¢\u0006\u0004\b\t\u0010\u0003J\u000f\u0010\n\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\n\u0010\u0003J\u000f\u0010\u000b\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u000b\u0010\u0003J\u000f\u0010\f\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\f\u0010\u0003J'\u0010\u0013\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u0011H\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0015\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0015\u0010\u0003J\u000f\u0010\u0016\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0016\u0010\u0003J\u000f\u0010\u0017\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0017\u0010\u0003J\u000f\u0010\u0019\u001a\u00020\u0018H\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ\u000f\u0010\u001b\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u001b\u0010\u0003R\u0016\u0010\u001f\u001a\u00020\u001c8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR\u0018\u0010#\u001a\u0004\u0018\u00010 8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b!\u0010\"R\u0016\u0010'\u001a\u00020$8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b%\u0010&¨\u0006+"}, d2 = {"Lcom/neeeex/ctools/features/loading/CtoolsLoadingNEEEEXActivity;", "Lcom/neeeex/eraser/base/BaseAdActivity;", "<init>", "()V", "Landroid/os/Bundle;", "savedInstanceState", "Lfl/m0;", "onCreate", "(Landroid/os/Bundle;)V", "onDestroy", "A0", "G0", "y0", "", "value", "Landroid/widget/ProgressBar;", "bar", "Landroid/widget/TextView;", BaseIconCache.IconDB.COLUMN_LABEL, "H0", "(ILandroid/widget/ProgressBar;Landroid/widget/TextView;)V", "C0", "E0", "w0", "", "B0", "()Z", "D0", "Lcom/neeeex/ctools/features/loading/a;", "c", "Lcom/neeeex/ctools/features/loading/a;", "loadingTarget", "Landroid/animation/ValueAnimator;", "d", "Landroid/animation/ValueAnimator;", "animator", "Lcom/neeeex/ctools/features/loading/CtoolsLoadingNEEEEXActivity$d;", "e", "Lcom/neeeex/ctools/features/loading/CtoolsLoadingNEEEEXActivity$d;", "navigationState", "f", "a", DownloadCommon.DOWNLOAD_REPORT_FIND_FILE_RESULT_VALUE_B, "tool-feature_productionRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class CtoolsLoadingNEEEEXActivity extends BaseAdActivity {

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    public com.neeeex.ctools.features.loading.a loadingTarget;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    public ValueAnimator animator;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    public d navigationState = d.Loading;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final String f64336g = m0.a("pNvIPr6giMuuzNA/gJOE3qXK0iuAi4rNpsbI\n", "waO8TN//678=\n");

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    public enum a {
        Show,
        Hide;


        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ ml.a f64341b = b.a(d());

        public static ml.a getEntries() {
            return f64341b;
        }
    }

    public static final class c extends AnimatorListenerAdapter {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Function0 f64342a;

        public c(Function0 function0) {
            m0.a("dvkFQfABXv188w==\n", "GZdDKJ5oLZU=\n");
            function0.getClass();
            this.f64342a = function0;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            m0.a("Qdsh9FlGm/hO\n", "ILVImTgy8pc=\n");
            animator.getClass();
            this.f64342a.invoke();
        }
    }

    public enum d {
        Loading,
        Opened,
        Aborted;


        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ ml.a f64344b = b.a(d());

        public static ml.a getEntries() {
            return f64344b;
        }
    }

    public static final /* synthetic */ class e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f64345a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ int[] f64346b;

        static {
            int[] iArr = new int[a.values().length];
            try {
                iArr[a.Show.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[a.Hide.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f64345a = iArr;
            int[] iArr2 = new int[com.neeeex.ctools.features.loading.a.values().length];
            try {
                iArr2[com.neeeex.ctools.features.loading.a.RECENT_APPS.ordinal()] = 1;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr2[com.neeeex.ctools.features.loading.a.NETWORK_TRAFFIC.ordinal()] = 2;
            } catch (NoSuchFieldError unused4) {
            }
            f64346b = iArr2;
        }
    }

    public static final void F0(CtoolsLoadingNEEEEXActivity ctoolsLoadingNEEEEXActivity) {
        ctoolsLoadingNEEEEXActivity.w0();
    }

    public static void s0(CtoolsLoadingNEEEEXActivity ctoolsLoadingNEEEEXActivity, View view) {
        ctoolsLoadingNEEEEXActivity.E0();
    }

    public static fl.m0 u0(CtoolsLoadingNEEEEXActivity ctoolsLoadingNEEEEXActivity, k0 k0Var) {
        m0.a("GJLiCFWwFupYpesNSvYW7Vc=\n", "POaKYSaUd44=\n");
        k0Var.getClass();
        ctoolsLoadingNEEEEXActivity.E0();
        return fl.m0.f80959a;
    }

    public static final void z0(CtoolsLoadingNEEEEXActivity ctoolsLoadingNEEEEXActivity, ProgressBar progressBar, TextView textView, ValueAnimator valueAnimator) {
        m0.a("np8=\n", "9+t4c0KBy2k=\n");
        valueAnimator.getClass();
        Object animatedValue = valueAnimator.getAnimatedValue();
        m0.a("qYSOVgu8zfOpnpYaSbqM/qaClhpfsIzzqJ/PVF6zwL2ziJJfC7TD6auYjBRisdg=\n", "x/HiOivfrJ0=\n");
        animatedValue.getClass();
        int iIntValue = ((Integer) animatedValue).intValue();
        progressBar.getClass();
        textView.getClass();
        ctoolsLoadingNEEEEXActivity.H0(iIntValue, progressBar, textView);
    }

    public final void A0() {
        TextView textView = (TextView) findViewById(R$id.ctools_tv_title);
        com.neeeex.ctools.features.loading.a aVar = this.loadingTarget;
        com.neeeex.ctools.features.loading.a aVar2 = null;
        if (aVar == null) {
            v.n(m0.a("FvjdhuYQNl4b5duH+w==\n", "epe84o9+UQo=\n"));
            aVar = null;
        }
        textView.setText(aVar.getTitleRes());
        TextView textView2 = (TextView) findViewById(R$id.ctools_tv_loading_status);
        com.neeeex.ctools.features.loading.a aVar3 = this.loadingTarget;
        if (aVar3 == null) {
            v.n(m0.a("t4CKYTULN6a6nYxgKA==\n", "2+/rBVxlUPI=\n"));
            aVar3 = null;
        }
        textView2.setText(aVar3.getStatusRes());
        ((ImageView) findViewById(R$id.ctools_btn_back)).setOnClickListener(new View.OnClickListener() { // from class: ci.b
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                CtoolsLoadingNEEEEXActivity.s0(this.f40841a, view);
            }
        });
        LottieAnimationView lottieAnimationView = (LottieAnimationView) findViewById(R$id.ctools_lottie_loading);
        com.neeeex.ctools.features.loading.a aVar4 = this.loadingTarget;
        if (aVar4 == null) {
            v.n(m0.a("g2+3jRW1NPSOcrGMCA==\n", "7wDW6XzbU6A=\n"));
        } else {
            aVar2 = aVar4;
        }
        lottieAnimationView.setAnimation(aVar2.getLottieRawRes());
        lottieAnimationView.v();
        o0.b(getOnBackPressedDispatcher(), this, false, new Function1() { // from class: ci.c
            @Override // p003kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return CtoolsLoadingNEEEEXActivity.u0(this.f40842a, (k0) obj);
            }
        }, 2, null);
    }

    public final boolean B0() {
        if (this.navigationState != d.Loading || isFinishing() || isDestroyed()) {
            return false;
        }
        this.navigationState = d.Opened;
        return true;
    }

    public final void C0() {
        if (B0()) {
            ((TextView) findViewById(R$id.ctools_tv_loading_status)).setText(R$string.ctools_neeeex_loading_completed);
            com.neeeex.ctools.features.loading.a aVar = this.loadingTarget;
            com.neeeex.ctools.features.loading.a aVar2 = null;
            if (aVar == null) {
                v.n(m0.a("RxAbZBdomotKDR1lCg==\n", "K396AH4G/d8=\n"));
                aVar = null;
            }
            startActivity(new Intent(this, aVar.getDestination()));
            vh.a aVar3 = vh.a.f100781a;
            com.neeeex.ctools.features.loading.a aVar4 = this.loadingTarget;
            if (aVar4 == null) {
                v.n(m0.a("J4DBxXtyL5IqncfEZg==\n", "S++goRIcSMY=\n"));
                aVar4 = null;
            }
            String scanEndInterstitialPosition = aVar4.getScanEndInterstitialPosition();
            com.neeeex.ctools.features.loading.a aVar5 = this.loadingTarget;
            if (aVar5 == null) {
                v.n(m0.a("Du+Yx75Wd3kD8p7Gow==\n", "YoD5o9c4EC0=\n"));
            } else {
                aVar2 = aVar5;
            }
            aVar3.e(this, scanEndInterstitialPosition, aVar2.getActionInterstitialCooldownScope());
            finish();
        }
    }

    public final void D0() {
        ValueAnimator valueAnimator = this.animator;
        if (valueAnimator != null) {
            valueAnimator.removeAllListeners();
            valueAnimator.cancel();
        }
        this.animator = null;
    }

    public final void E0() {
        if (this.navigationState != d.Loading) {
            return;
        }
        ExitScanDialog exitScanDialogB = ExitScanDialog.Companion.b(ExitScanDialog.INSTANCE, 0, 1, null);
        exitScanDialogB.p(new ki.a() { // from class: ci.d
            @Override // ki.a
            public final void a() {
                CtoolsLoadingNEEEEXActivity.F0(this.f40843a);
            }
        });
        l0 supportFragmentManager = getSupportFragmentManager();
        m0.a("QLFpnWqGvGBVoFu8fpGhakmgUK9xl6tqVfwz4DHf\n", "J9Qdzh/2zA8=\n");
        supportFragmentManager.getClass();
        exitScanDialogB.i(supportFragmentManager);
    }

    public final void G0() {
        ViewGroup viewGroup = (ViewGroup) findViewById(R$id.ctools_ad_container_banner);
        int i10 = e.f64345a[(com.neeeex.eraser.module.report.bytedance.a.k() ? a.Show : a.Hide).ordinal()];
        if (i10 == 1) {
            viewGroup.getClass();
            BaseAdActivity.showRenderAdAndRefresh$default(this, viewGroup, R$layout.ad_neeeex_native_white, m0.a("XhCIOvwlZhpeBYkq/jdtAEsB\n", "HUTHdbB2OUk=\n"), null, 8, null);
        } else if (i10 == 2) {
            viewGroup.setVisibility(8);
        } else {
            j.a();
        }
    }

    public final void H0(int value, ProgressBar bar, TextView label) {
        bar.setProgress(value);
        label.setText(getString(R$string.ctools_neeeex_loading_percentage, new Object[]{Integer.valueOf(value)}));
    }

    @Override // com.neeeex.eraser.base.RootActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        w.b(this, null, null, 3, null);
        setContentView(R$layout.ctools_activity_loading);
        this.loadingTarget = com.neeeex.ctools.features.loading.a.Companion.a(getIntent().getStringExtra(f64336g));
        A0();
        G0();
        y0();
    }

    @Override // com.neeeex.eraser.base.BaseAdActivity, com.neeeex.eraser.base.RootActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        D0();
        super.onDestroy();
    }

    public final void w0() {
        n nVar;
        if (this.navigationState != d.Loading) {
            return;
        }
        this.navigationState = d.Aborted;
        D0();
        l lVar = l.f104405a;
        String strA = m0.a("gsSb+/oLqAiIx6H98xaWFrPSnf/xLJIAhdWh+Ow=\n", "7KH+np9z93g=\n");
        com.neeeex.ctools.features.loading.a aVar = this.loadingTarget;
        if (aVar == null) {
            v.n(m0.a("hKpydr9LdH+Jt3R3og==\n", "6MUTEtYlEys=\n"));
            aVar = null;
        }
        int i10 = e.f64346b[aVar.ordinal()];
        if (i10 == 1) {
            nVar = n.RECENT_APPS;
        } else {
            if (i10 != 2) {
                j.a();
                return;
            }
            nVar = n.NETWORK_TRAFFIC;
        }
        lVar.b(this, strA, nVar);
    }

    public final void y0() {
        final TextView textView = (TextView) findViewById(R$id.ctools_tv_percentage);
        final ProgressBar progressBar = (ProgressBar) findViewById(R$id.ctools_loading_progress);
        ValueAnimator valueAnimatorOfInt = ValueAnimator.ofInt(0, 100);
        valueAnimatorOfInt.setDuration(2200L);
        valueAnimatorOfInt.setInterpolator(new LinearInterpolator());
        valueAnimatorOfInt.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: ci.a
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                CtoolsLoadingNEEEEXActivity.z0(this.f40838a, progressBar, textView, valueAnimator);
            }
        });
        valueAnimatorOfInt.addListener(new c(new f(this)));
        valueAnimatorOfInt.start();
        this.animator = valueAnimatorOfInt;
    }

    /* JADX INFO: renamed from: com.neeeex.ctools.features.loading.CtoolsLoadingNEEEEXActivity$b, reason: from kotlin metadata */
    public static final class Companion {
        public /* synthetic */ Companion(m mVar) {
            this();
        }

        public final Intent a(Context context, com.neeeex.ctools.features.loading.a aVar) {
            m0.a("JlUJf9B5ng==\n", "RTpnC7UB6pU=\n");
            context.getClass();
            m0.a("Fr33C0Bg\n", "YtyFbCUUXIY=\n");
            aVar.getClass();
            Intent intentPutExtra = new Intent(context, (Class<?>) CtoolsLoadingNEEEEXActivity.class).putExtra(m0.a("v0QIyZnf5wK1UxDIp+zrF75VEtyn9OUEvVkI\n", "2jx8u/iAhHY=\n"), aVar.getExtraValue());
            m0.a("P6T05PNYsHhn/66Pog==\n", "T9GAoYsswhk=\n");
            intentPutExtra.getClass();
            return intentPutExtra;
        }

        public Companion() {
        }
    }

    public static final /* synthetic */ class f extends s implements Function0 {
        public f(Object obj) {
            super(0, obj, CtoolsLoadingNEEEEXActivity.class, m0.a("pL4xjCf5T6qioDWWCvNS\n", "y85U4mOcPN4=\n"), m0.a("GZd0exUf+CwfiXBhOBXlcF+x\n", "ducRFVF6i1g=\n"), 0);
        }

        /* JADX INFO: renamed from: invoke, reason: collision with other method in class */
        public final void m163invoke() {
            ((CtoolsLoadingNEEEEXActivity) this.receiver).C0();
        }

        @Override // p003kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Object invoke() {
            m163invoke();
            return fl.m0.f80959a;
        }
    }
}