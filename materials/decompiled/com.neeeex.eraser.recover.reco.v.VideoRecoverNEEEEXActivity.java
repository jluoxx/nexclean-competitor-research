package com.neeeex.eraser.recover.reco.v;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;
import androidx.p002lifecycle.LifecycleOwnerKt;
import com.android.launcher3.testing.shared.TestProtocol;
import com.mbridge.msdk.foundation.download.core.DownloadCommon;
import com.neeeex.eraser.R$string;
import com.neeeex.eraser.base.BaseAdActivity;
import p003kotlin.Metadata;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u0000 \u00142\u00020\u0001:\u0002\u0015\u0016B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0005\u0010\u0003J\u0019\u0010\b\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0014¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\n\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\n\u0010\u0003J\u000f\u0010\u000b\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u000b\u0010\u0003R\u0016\u0010\u000f\u001a\u00020\f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\r\u0010\u000eR\u0016\u0010\u0013\u001a\u00020\u00108\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012¨\u0006\u0017"}, d2 = {"Lcom/neeeex/eraser/recover/reco/v/VideoRecoverNEEEEXActivity;", "Lcom/neeeex/eraser/base/BaseAdActivity;", "<init>", "()V", "Lfl/m0;", "u0", "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "(Landroid/os/Bundle;)V", "onBackPressed", "v0", "Lcom/neeeex/eraser/recover/reco/v/VideoRecoverNEEEEXActivity$b;", "c", "Lcom/neeeex/eraser/recover/reco/v/VideoRecoverNEEEEXActivity$b;", TestProtocol.STATE_FIELD, "Lji/d0;", "d", "Lji/d0;", "binding", "e", DownloadCommon.DOWNLOAD_REPORT_FIND_FILE_RESULT_VALUE_B, "a", "tool-feature_productionRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class VideoRecoverNEEEEXActivity extends BaseAdActivity {

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    public b state = b.LOCKED;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    public ji.d0 binding;

    public enum b {
        LOCKED,
        RELEASED;


        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ ml.a f65945b = ml.b.a(d());

        public static ml.a getEntries() {
            return f65945b;
        }
    }

    public static final class c extends ll.m implements tl.n {
        int label;

        public c(kl.f<? super c> fVar) {
            super(2, fVar);
        }

        @Override // ll.a
        public final kl.f<fl.m0> create(Object obj, kl.f<?> fVar) {
            return VideoRecoverNEEEEXActivity.this.new c(fVar);
        }

        @Override // tl.n
        public final Object invoke(kotlinx.coroutines.p0 p0Var, kl.f<? super fl.m0> fVar) {
            return ((c) create(p0Var, fVar)).invokeSuspend(fl.m0.f80959a);
        }

        @Override // ll.a
        public final Object invokeSuspend(Object obj) {
            Object objF = p003kotlin.coroutines.intrinsics.c.f();
            int i10 = this.label;
            if (i10 == 0) {
                fl.v.b(obj);
                this.label = 1;
                if (kotlinx.coroutines.z0.b(6000L, this) == objF) {
                    return objF;
                }
            } else {
                if (i10 != 1) {
                    gq.v0.a(com.neeeex.eraser.m0.a("qwNbhyJyXDTvEFKYd2tWM+gAUo1tdFY07wtZnW1tVjPoFV6faiZQe7oNQp9raFY=\n", "yGI36wIGMxQ=\n"));
                    return null;
                }
                fl.v.b(obj);
            }
            VideoRecoverNEEEEXActivity.this.v0();
            return fl.m0.f80959a;
        }
    }

    public static void s0(VideoRecoverNEEEEXActivity videoRecoverNEEEEXActivity, View view) {
        videoRecoverNEEEEXActivity.onBackPressed();
    }

    private final void u0() {
        this.state = b.LOCKED;
        ji.d0 d0Var = this.binding;
        if (d0Var == null) {
            p003kotlin.jvm.internal.v.n(com.neeeex.eraser.m0.a("ugOnL7YIag==\n", "2GrJS99mDVA=\n"));
            d0Var = null;
        }
        d0Var.f85388b.setOnClickListener(new View.OnClickListener() { // from class: com.neeeex.eraser.recover.reco.v.m0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                VideoRecoverNEEEEXActivity.s0(this.f66048a, view);
            }
        });
        mi.a.f88870a.a1();
        kotlinx.coroutines.k.d(LifecycleOwnerKt.getLifecycleScope(this), null, null, new c(null), 3, null);
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        if (this.state == b.LOCKED) {
            Toast.makeText(this, R$string.toast_neeeex_recovering, 1).show();
        } else {
            super.onBackPressed();
        }
    }

    @Override // com.neeeex.eraser.base.RootActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ji.d0 d0VarC = ji.d0.c(getLayoutInflater());
        com.neeeex.eraser.m0.a("fYUrphBXZR86xWPj\n", "FOtNynEjADc=\n");
        d0VarC.getClass();
        this.binding = d0VarC;
        if (d0VarC == null) {
            p003kotlin.jvm.internal.v.n(com.neeeex.eraser.m0.a("BuMO3uUt0A==\n", "ZIpguoxDt3w=\n"));
            d0VarC = null;
        }
        setContentView(d0VarC.getRoot());
        u0();
    }

    public final void v0() {
        b bVar = this.state;
        b bVar2 = b.RELEASED;
        if (bVar == bVar2) {
            return;
        }
        this.state = bVar2;
        ji.d0 d0Var = this.binding;
        if (d0Var == null) {
            p003kotlin.jvm.internal.v.n(com.neeeex.eraser.m0.a("e7b5Ofseuw==\n", "Gd+XXZJw3Ig=\n"));
            d0Var = null;
        }
        d0Var.f85389c.m();
        mi.a.f88870a.Z0();
        VideoRecoverResultNEEEEXActivity.INSTANCE.a(this);
        BaseAdActivity.showInter$default(this, com.neeeex.eraser.m0.a("MifP7hm5mlMhP9nxA7+bSD843g==\n", "YHGQvFz61Qw=\n"), null, 2, null);
        finish();
    }

    /* JADX INFO: renamed from: com.neeeex.eraser.recover.reco.v.VideoRecoverNEEEEXActivity$a, reason: from kotlin metadata */
    public static final class Companion {
        public /* synthetic */ Companion(p003kotlin.jvm.internal.m mVar) {
            this();
        }

        public final void a(Context context) {
            com.neeeex.eraser.m0.a("CuvEWWK5gw==\n", "aYSqLQfB93g=\n");
            context.getClass();
            context.startActivity(new Intent(context, (Class<?>) VideoRecoverNEEEEXActivity.class));
        }

        public Companion() {
        }
    }
}