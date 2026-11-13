package com.neeeex.eraser.launcher;

import android.app.Activity;
import com.neeeex.eraser.m0;
import p003kotlin.Metadata;
import p003kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0005\u0010\u0003J\r\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ?\u0010\u000f\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\t2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00040\u000b2\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00040\u000b2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00040\u000b¢\u0006\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0012\u001a\u00020\u00118\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0014\u001a\u00020\u00118\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0014\u0010\u0013¨\u0006\u0015"}, d2 = {"Lcom/neeeex/eraser/launcher/OpenSceneAdPolicy;", "", "<init>", "()V", "Lfl/m0;", "markOpenSceneAdShown", "", "canShowOnMinusOneSwipe", "()Z", "Landroid/app/Activity;", "activity", "Lkotlin/Function0;", "onBeforeShow", "onShowFailed", "onAdClose", "tryShowOnMinusOneSwipe", "(Landroid/app/Activity;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;)V", "", "LAST_SHOWN", "Ljava/lang/String;", "POSITION", "tool-feature_productionRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class OpenSceneAdPolicy {
    private static final String LAST_SHOWN = m0.a("IJI2+lZ9YKwnmSbsbGpRpBGYI/pdWl6lEZsy7EdaTKkhgD0=\n", "TvdTnzMFP8E=\n");
    private static final String POSITION = m0.a("+Bu352W2ueb2GLo=\n", "t0vyqTrl6ao=\n");
    public static final OpenSceneAdPolicy INSTANCE = new OpenSceneAdPolicy();

    private OpenSceneAdPolicy() {
    }

    public static final void markOpenSceneAdShown() {
        com.neeeex.eraser.utils.b0.f66131a.C(LAST_SHOWN, System.currentTimeMillis());
    }

    public final boolean canShowOnMinusOneSwipe() {
        ni.i iVar = ni.i.f89495a;
        boolean z10 = false;
        if (!iVar.x()) {
            return false;
        }
        MinusOneAdPolicy minusOneAdPolicy = MinusOneAdPolicy.INSTANCE;
        long jCurrentTimeMillis = System.currentTimeMillis();
        com.neeeex.eraser.utils.b0 b0Var = com.neeeex.eraser.utils.b0.f66131a;
        long jV = b0Var.v(m0.a("vGIFr8lDsYe3TTyo3lWgvbxmO7PYeaCLonc=\n", "zxJawawm1OI=\n"), 0L);
        long jV2 = b0Var.v(LAST_SHOWN, 0L);
        boolean zK = com.neeeex.eraser.module.report.bytedance.a.k();
        com.neeeex.eraser.ads.h hVar = com.neeeex.eraser.ads.h.f64923a;
        if (hVar.l() && hVar.e().c() > -0.1d) {
            z10 = true;
        }
        return minusOneAdPolicy.eligible(jCurrentTimeMillis, jV, jV2, zK, z10, iVar.t());
    }

    public final void tryShowOnMinusOneSwipe(Activity activity, Function0 onBeforeShow, final Function0 onShowFailed, final Function0 onAdClose) {
        m0.a("89+gYdB6+r4=\n", "krzUCKYTjsc=\n");
        activity.getClass();
        m0.a("/V3GkyShPdHBW+uB\n", "kjOE9kLOT7Q=\n");
        onBeforeShow.getClass();
        m0.a("YNT3wNd4WeRm1sHM\n", "D7qkqLgPH4U=\n");
        onShowFailed.getClass();
        m0.a("vQqDVvNkPsi3\n", "0mTCMrAIUbs=\n");
        onAdClose.getClass();
        if (activity.isFinishing() || activity.isDestroyed() || !canShowOnMinusOneSwipe()) {
            return;
        }
        com.neeeex.eraser.ads.h hVar = com.neeeex.eraser.ads.h.f64923a;
        com.neeeex.eraser.ads.k kVarE = hVar.e();
        String str = POSITION;
        kVarE.a(str);
        onBeforeShow.invoke();
        hVar.e().g(activity, str, new com.neeeex.eraser.ads.o() { // from class: com.neeeex.eraser.launcher.OpenSceneAdPolicy.tryShowOnMinusOneSwipe.1
            @Override // com.neeeex.eraser.ads.o
            public void onAdClick() {
            }

            @Override // com.neeeex.eraser.ads.o
            public void onAdClose() {
                onAdClose.invoke();
            }

            @Override // com.neeeex.eraser.ads.o
            public void onAdShowFailed(oj.a iRenderView) {
                onShowFailed.invoke();
            }

            @Override // com.neeeex.eraser.ads.o
            public void onAdShowSuccess(oj.a iRenderView) {
                OpenSceneAdPolicy.markOpenSceneAdShown();
            }
        });
    }
}