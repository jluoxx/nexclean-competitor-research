package com.neeeex.eraser.module.main;

import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import com.neeeex.eraser.R$layout;
import com.neeeex.eraser.base.RootActivity;
import p003kotlin.Metadata;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000 $2\u00020\u0001:\u0001%B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0019\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0014¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\t\u001a\u00020\u0006H\u0014¢\u0006\u0004\b\t\u0010\u0003J\u001f\u0010\r\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\nH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u000f\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u000f\u0010\u0003J\u000f\u0010\u0010\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0010\u0010\u0003J\u000f\u0010\u0011\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0011\u0010\u0003R\"\u0010\u0019\u001a\u00020\u00128\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018R\u0014\u0010\u001d\u001a\u00020\u001a8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR\u0016\u0010\u001f\u001a\u00020\u00128\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001e\u0010\u0014R\u0014\u0010#\u001a\u00020 8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010\"¨\u0006&"}, d2 = {"Lcom/neeeex/eraser/module/main/ThanksNEEEEXActivity;", "Lcom/neeeex/eraser/base/RootActivity;", "<init>", "()V", "Landroid/os/Bundle;", "savedInstanceState", "Lfl/m0;", "onCreate", "(Landroid/os/Bundle;)V", "onResume", "", "enterAnim", "exitAnim", "overridePendingTransition", "(II)V", "finish", "j0", "k0", "", "c", "Z", "getShowed", "()Z", "setShowed", "(Z)V", "showed", "Landroid/os/Handler;", "d", "Landroid/os/Handler;", "delayedHandler", "e", "closePending", "Ljava/lang/Runnable;", "f", "Ljava/lang/Runnable;", "closeAction", "g", "a", "tool-feature_productionRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class ThanksNEEEEXActivity extends RootActivity {

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static String f65323h = "";

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static com.neeeex.eraser.ads.o f65324i;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    public boolean showed;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    public boolean closePending;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    public final Handler delayedHandler = new Handler(Looper.getMainLooper());

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    public final Runnable closeAction = new Runnable() { // from class: com.neeeex.eraser.module.main.m0
        @Override // java.lang.Runnable
        public final void run() {
            ThanksNEEEEXActivity.h0(this.f65369a);
        }
    };

    public static final class b implements com.neeeex.eraser.ads.o {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ com.neeeex.eraser.ads.o f65329a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ ThanksNEEEEXActivity f65330b;

        public b(com.neeeex.eraser.ads.o oVar, ThanksNEEEEXActivity thanksNEEEEXActivity) {
            this.f65329a = oVar;
            this.f65330b = thanksNEEEEXActivity;
        }

        @Override // com.neeeex.eraser.ads.o
        public void onAdClick() {
            com.neeeex.eraser.ads.o oVar = this.f65329a;
            if (oVar != null) {
                oVar.onAdClick();
            }
        }

        @Override // com.neeeex.eraser.ads.o
        public void onAdClose() {
            com.neeeex.eraser.ads.o oVar = this.f65329a;
            if (oVar != null) {
                oVar.onAdClose();
            }
            this.f65330b.k0();
        }

        @Override // com.neeeex.eraser.ads.o
        public void onAdShowFailed(oj.a aVar) {
            com.neeeex.eraser.ads.o oVar = this.f65329a;
            if (oVar != null) {
                oVar.onAdShowFailed(aVar);
            }
            this.f65330b.finish();
        }

        @Override // com.neeeex.eraser.ads.o
        public void onAdShowSuccess(oj.a aVar) {
            com.neeeex.eraser.ads.o oVar = this.f65329a;
            if (oVar != null) {
                oVar.onAdShowSuccess(aVar);
            }
        }
    }

    public static void h0(ThanksNEEEEXActivity thanksNEEEEXActivity) {
        if (!thanksNEEEEXActivity.isFinishing() && !thanksNEEEEXActivity.isDestroyed()) {
            thanksNEEEEXActivity.finish();
        }
        thanksNEEEEXActivity.closePending = false;
    }

    @Override // android.app.Activity
    public void finish() {
        super.finish();
        overridePendingTransition(0, 0);
    }

    public final void j0() {
        com.neeeex.eraser.ads.h hVar = com.neeeex.eraser.ads.h.f64923a;
        if (hVar.g().c() <= -0.1d) {
            finish();
        } else {
            hVar.g().f(this, f65323h, new b(f65324i, this));
        }
    }

    public final void k0() {
        if (this.closePending) {
            return;
        }
        this.closePending = true;
        this.delayedHandler.postDelayed(this.closeAction, 900L);
    }

    @Override // com.neeeex.eraser.base.RootActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R$layout.activity_neeeex_thanks);
    }

    @Override // com.neeeex.eraser.base.RootActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onResume() {
        super.onResume();
        if (this.showed) {
            k0();
        } else {
            this.showed = true;
            j0();
        }
    }

    @Override // android.app.Activity
    public void overridePendingTransition(int enterAnim, int exitAnim) {
        super.overridePendingTransition(0, 0);
    }

    /* JADX INFO: renamed from: com.neeeex.eraser.module.main.ThanksNEEEEXActivity$a, reason: from kotlin metadata */
    public static final class Companion {
        public /* synthetic */ Companion(p003kotlin.jvm.internal.m mVar) {
            this();
        }

        public final void setOnAdListener(com.neeeex.eraser.ads.o oVar) {
            ThanksNEEEEXActivity.f65324i = oVar;
        }

        public Companion() {
        }
    }
}