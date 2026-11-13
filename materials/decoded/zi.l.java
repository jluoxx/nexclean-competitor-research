package zi;

import android.content.Intent;
import com.neeeex.eraser.base.BaseAdActivity;
import com.neeeex.similar3p.recommendation.FeatureRecommendationActivity;
import fl.m0;
import p003kotlin.jvm.functions.Function0;
import p003kotlin.jvm.internal.r0;

/* JADX INFO: loaded from: classes7.dex */
public final class l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final l f104405a = new l();

    public static final class a implements com.neeeex.eraser.ads.o {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Function0 f104406a;

        public a(Function0 function0) {
            this.f104406a = function0;
        }

        @Override // com.neeeex.eraser.ads.o
        public void onAdClick() {
        }

        @Override // com.neeeex.eraser.ads.o
        public void onAdClose() {
            this.f104406a.invoke();
        }

        @Override // com.neeeex.eraser.ads.o
        public void onAdShowFailed(oj.a aVar) {
            this.f104406a.invoke();
        }

        @Override // com.neeeex.eraser.ads.o
        public void onAdShowSuccess(oj.a aVar) {
        }
    }

    public static m0 a(r0 r0Var, BaseAdActivity baseAdActivity, n nVar) {
        if (!r0Var.element && !baseAdActivity.isFinishing() && !baseAdActivity.isDestroyed()) {
            r0Var.element = true;
            baseAdActivity.startActivity(new Intent(baseAdActivity, (Class<?>) FeatureRecommendationActivity.class).putExtra("extra_completed_feature" /* decoded XOR */, nVar.name()));
            baseAdActivity.finish();
        }
        return m0.f80959a;
    }

    public final void b(final BaseAdActivity baseAdActivity, String str, final n nVar) {
        "activity" /* decoded XOR */;
        baseAdActivity.getClass();
        "position" /* decoded XOR */;
        str.getClass();
        "origin" /* decoded XOR */;
        nVar.getClass();
        final r0 r0Var = new r0();
        Function0 function0 = new Function0() { // from class: zi.k
            @Override // p003kotlin.jvm.functions.Function0
            public final Object invoke() {
                return l.a(r0Var, baseAdActivity, nVar);
            }
        };
        com.neeeex.eraser.ads.m mVarG = com.neeeex.eraser.ads.h.f64923a.g();
        if (!com.neeeex.eraser.module.report.bytedance.a.k() || mVarG.c() <= -0.1d) {
            function0.invoke();
        } else {
            mVarG.a(str);
            mVarG.f(baseAdActivity, str, new a(function0));
        }
    }
}