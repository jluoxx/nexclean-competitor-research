package com.neeeex.similar3p.junk.ui;

import android.os.Bundle;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import b.o0;
import com.neeeex.eraser.R$layout;
import com.neeeex.eraser.R$string;
import com.neeeex.eraser.base.BaseAdActivity;
import com.neeeex.eraser.base.BaseStoragePermActivity;
import fl.m0;
import ji.f1;
import p003kotlin.Metadata;
import p003kotlin.jvm.functions.Function0;
import p003kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0019\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0014¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\t\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\u0003J\u000f\u0010\n\u001a\u00020\u0006H\u0014¢\u0006\u0004\b\n\u0010\u0003J\u000f\u0010\u000b\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u000b\u0010\u0003J\u000f\u0010\f\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\f\u0010\u0003J\u000f\u0010\r\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\r\u0010\u0003R\u0018\u0010\u0011\u001a\u0004\u0018\u00010\u000e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u001b\u0010\u0017\u001a\u00020\u00128BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u0014\u0010\u001a\u001a\u00020\u000e8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0018\u0010\u0019¨\u0006\u001b"}, d2 = {"Lcom/neeeex/similar3p/junk/ui/JunkCleanCompleteNEEEEXActivity;", "Lcom/neeeex/eraser/base/BaseStoragePermActivity;", "<init>", "()V", "Landroid/os/Bundle;", "savedInstanceState", "Lfl/m0;", "onCreate", "(Landroid/os/Bundle;)V", "onStoragePermission", "onDestroy", "M0", "J0", "N0", "Lji/f1;", "c", "Lji/f1;", "_vb", "Lzi/j;", "d", "Lfl/n;", "K0", "()Lzi/j;", "recommendationLauncher", "L0", "()Lji/f1;", "vb", "tool-feature_productionRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class JunkCleanCompleteNEEEEXActivity extends BaseStoragePermActivity {

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    public f1 _vb;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    public final fl.n recommendationLauncher = fl.o.b(new Function0() { // from class: com.neeeex.similar3p.junk.ui.c
        @Override // p003kotlin.jvm.functions.Function0
        public final Object invoke() {
            return JunkCleanCompleteNEEEEXActivity.G0(this.f66431a);
        }
    });

    public static zi.j G0(JunkCleanCompleteNEEEEXActivity junkCleanCompleteNEEEEXActivity) {
        return new zi.j(junkCleanCompleteNEEEEXActivity);
    }

    public static void H0(JunkCleanCompleteNEEEEXActivity junkCleanCompleteNEEEEXActivity, View view) {
        junkCleanCompleteNEEEEXActivity.finish();
    }

    public static m0 I0(JunkCleanCompleteNEEEEXActivity junkCleanCompleteNEEEEXActivity, b.k0 k0Var) {
        com.neeeex.eraser.m0.a("APvWfTY15INAzN94KXPkhE8=\n", "JI++FEURhec=\n");
        k0Var.getClass();
        junkCleanCompleteNEEEEXActivity.finish();
        return m0.f80959a;
    }

    public final void J0() {
        zi.o oVarB = zi.m.f104407a.b(zi.p.JUNK_CLEANER);
        if (oVarB == null) {
            return;
        }
        int i10 = 0;
        for (Object obj : oVarB.b()) {
            int i11 = i10 + 1;
            if (i10 < 0) {
                gl.w.w();
            }
            zi.p pVar = (zi.p) obj;
            LinearLayout linearLayout = L0().f85435f;
            zi.f fVar = zi.f.f104388a;
            LinearLayout linearLayout2 = L0().f85435f;
            com.neeeex.eraser.m0.a("QSPBAXZBirtBLecLfkmsq1sj9gFwVq2jSijABWdQr6A=\n", "L0akZBM5wM4=\n");
            linearLayout2.getClass();
            linearLayout.addView(fVar.b(linearLayout2, pVar, i10 == 0, new a(K0())));
            i10 = i11;
        }
    }

    public final zi.j K0() {
        return (zi.j) this.recommendationLauncher.getValue();
    }

    public final f1 L0() {
        f1 f1Var = this._vb;
        f1Var.getClass();
        return f1Var;
    }

    public final void M0() {
        long longExtra = getIntent().getLongExtra(com.neeeex.eraser.m0.a("Ws0qpzEBy/RR1iGoMQDe5VXL\n", "EJhk7G5Ch7E=\n"), 0L);
        int intExtra = getIntent().getIntExtra(com.neeeex.eraser.m0.a("rM35kx5hvpun1vKcHmG9i6jM\n", "5pi32EEi8t4=\n"), 0);
        int intExtra2 = getIntent().getIntExtra(com.neeeex.eraser.m0.a("oit9CNeVDbmkO3ccy5wZvrw=\n", "6H4zQ4jTTPA=\n"), 0);
        L0().f85437h.setContentDescription(getString(R$string.neeeex_junk_cleaned_size, new Object[]{e0.a(longExtra)}));
        L0().f85433d.setText(intExtra > 0 ? R$string.neeeex_junk_cleared_detail : R$string.neeeex_junk_nothing_cleaned);
        if (intExtra > 0 || intExtra2 <= 0) {
            return;
        }
        L0().f85437h.setText(R$string.neeeex_junk_result);
    }

    public final void N0() {
        FrameLayout frameLayout = L0().f85431b;
        com.neeeex.eraser.m0.a("242g87HKfJn2h6vitdtTmMeqpPi6108=\n", "tejFltSyPf0=\n");
        frameLayout.getClass();
        BaseAdActivity.showRenderAdAndRefresh$default(this, frameLayout, R$layout.ad_neeeex_native, com.neeeex.eraser.m0.a("Y9WoEGhKo2dp1pIWYVedeVLTohh9XpljaA==\n", "DbDNdQ0y/Bc=\n"), null, 8, null);
    }

    @Override // com.neeeex.eraser.base.RootActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        b.w.b(this, null, null, 3, null);
        this._vb = f1.c(getLayoutInflater());
        setContentView(L0().getRoot());
        ConstraintLayout root = L0().getRoot();
        com.neeeex.eraser.m0.a("149aXifjcq6exAAl\n", "sOouDEiMBoY=\n");
        root.getClass();
        ConstraintLayout constraintLayout = L0().f85439j;
        com.neeeex.eraser.m0.a("ElUT0mOnMoMSWzXYa68UkwhVIthpsxqXDg==\n", "fDB2twbfePY=\n");
        constraintLayout.getClass();
        h0.b(root, constraintLayout, L0().f85431b, L0().f85436g);
        M0();
        J0();
        L0().f85432c.setOnClickListener(new View.OnClickListener() { // from class: com.neeeex.similar3p.junk.ui.a
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                JunkCleanCompleteNEEEEXActivity.H0(this.f66427a, view);
            }
        });
        o0.b(getOnBackPressedDispatcher(), this, false, new Function1() { // from class: com.neeeex.similar3p.junk.ui.b
            @Override // p003kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return JunkCleanCompleteNEEEEXActivity.I0(this.f66429a, (b.k0) obj);
            }
        }, 2, null);
        N0();
    }

    @Override // com.neeeex.eraser.base.BaseStoragePermActivity, com.neeeex.eraser.base.BaseAdActivity, com.neeeex.eraser.base.RootActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        this._vb = null;
        super.onDestroy();
    }

    @Override // com.neeeex.eraser.base.BaseStoragePermActivity
    public void onStoragePermission() {
        K0().j();
    }

    public static final /* synthetic */ class a extends p003kotlin.jvm.internal.s implements Function1 {
        public a(Object obj) {
            super(1, obj, zi.j.class, com.neeeex.eraser.m0.a("4ZO7/Xdv\n", "jfLOkxQHAcc=\n"), com.neeeex.eraser.m0.a("InbPbDPWwowteNctPtuPpStvlXE504OsL2WJcn/Mj6MhetdnPtqLtCd41C0C24mvI3rfbDTbjoYr\nds53ItvR6Rg=\n", "The6AlC+6sA=\n"), 0);
        }

        public final void invoke(zi.p pVar) {
            com.neeeex.eraser.m0.a("G7U=\n", "a4U1rmBVjjc=\n");
            pVar.getClass();
            ((zi.j) this.receiver).e(pVar);
        }

        @Override // p003kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((zi.p) obj);
            return m0.f80959a;
        }
    }
}