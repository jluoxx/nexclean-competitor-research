package com.neeeex.eraser.recover.reco.p;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;
import androidx.p002lifecycle.LifecycleOwnerKt;
import com.mbridge.msdk.foundation.download.core.DownloadCommon;
import com.neeeex.eraser.R$string;
import com.neeeex.eraser.base.BaseAdActivity;
import kotlinx.coroutines.z0;
import p003kotlin.Metadata;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u0000 \u00142\u00020\u0001:\u0002\u0015\u0016B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0019\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0014¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\t\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\u0003J\u000f\u0010\n\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\n\u0010\u0003J\u000f\u0010\u000b\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u000b\u0010\u0003R\u0016\u0010\u000f\u001a\u00020\f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\r\u0010\u000eR\u0016\u0010\u0013\u001a\u00020\u00108\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012¨\u0006\u0017"}, d2 = {"Lcom/neeeex/eraser/recover/reco/p/PhotoRecoverNEEEEXActivity;", "Lcom/neeeex/eraser/base/BaseAdActivity;", "<init>", "()V", "Landroid/os/Bundle;", "savedInstanceState", "Lfl/m0;", "onCreate", "(Landroid/os/Bundle;)V", "onBackPressed", "u0", "v0", "Lcom/neeeex/eraser/recover/reco/p/PhotoRecoverNEEEEXActivity$b;", "c", "Lcom/neeeex/eraser/recover/reco/p/PhotoRecoverNEEEEXActivity$b;", "phase", "Lji/q;", "d", "Lji/q;", "binding", "e", DownloadCommon.DOWNLOAD_REPORT_FIND_FILE_RESULT_VALUE_B, "a", "tool-feature_productionRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class PhotoRecoverNEEEEXActivity extends BaseAdActivity {

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    public b phase = b.ANIMATING;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    public ji.q binding;

    public enum b {
        ANIMATING,
        ROUTING;


        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ ml.a f65765b = ml.b.a(d());

        public static ml.a getEntries() {
            return f65765b;
        }
    }

    public static final /* synthetic */ class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f65766a;

        static {
            int[] iArr = new int[b.values().length];
            try {
                iArr[b.ANIMATING.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[b.ROUTING.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f65766a = iArr;
        }
    }

    public static final class d extends ll.m implements tl.n {
        int label;

        public d(kl.f<? super d> fVar) {
            super(2, fVar);
        }

        @Override // ll.a
        public final kl.f<fl.m0> create(Object obj, kl.f<?> fVar) {
            return PhotoRecoverNEEEEXActivity.this.new d(fVar);
        }

        @Override // tl.n
        public final Object invoke(kotlinx.coroutines.p0 p0Var, kl.f<? super fl.m0> fVar) {
            return ((d) create(p0Var, fVar)).invokeSuspend(fl.m0.f80959a);
        }

        @Override // ll.a
        public final Object invokeSuspend(Object obj) {
            Object objF = p003kotlin.coroutines.intrinsics.c.f();
            int i10 = this.label;
            if (i10 == 0) {
                fl.v.b(obj);
                this.label = 1;
                if (z0.b(6000L, this) == objF) {
                    return objF;
                }
            } else {
                if (i10 != 1) {
                    gq.v0.a("call to 'resume' before 'invoke' with coroutine" /* decoded XOR */);
                    return null;
                }
                fl.v.b(obj);
            }
            PhotoRecoverNEEEEXActivity.this.v0();
            return fl.m0.f80959a;
        }
    }

    public static void s0(PhotoRecoverNEEEEXActivity photoRecoverNEEEEXActivity, View view) {
        photoRecoverNEEEEXActivity.onBackPressed();
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        int i10 = c.f65766a[this.phase.ordinal()];
        if (i10 == 1) {
            Toast.makeText(this, R$string.toast_neeeex_recovering, 1).show();
        } else if (i10 == 2) {
            super.onBackPressed();
        } else {
            coil.util.j.a();
        }
    }

    @Override // com.neeeex.eraser.base.RootActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ji.q qVarC = ji.q.c(getLayoutInflater());
        "inflate(...)" /* decoded XOR */;
        qVarC.getClass();
        this.binding = qVarC;
        if (qVarC == null) {
            p003kotlin.jvm.internal.v.n("binding" /* decoded XOR */);
            qVarC = null;
        }
        setContentView(qVarC.getRoot());
        u0();
    }

    public final void u0() {
        this.phase = b.ANIMATING;
        ji.q qVar = this.binding;
        if (qVar == null) {
            p003kotlin.jvm.internal.v.n("binding" /* decoded XOR */);
            qVar = null;
        }
        qVar.f85645b.setOnClickListener(new View.OnClickListener() { // from class: com.neeeex.eraser.recover.reco.p.j0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                PhotoRecoverNEEEEXActivity.s0(this.f65857a, view);
            }
        });
        mi.a.f88870a.O0();
        kotlinx.coroutines.k.d(LifecycleOwnerKt.getLifecycleScope(this), null, null, new d(null), 3, null);
    }

    public final void v0() {
        b bVar = this.phase;
        b bVar2 = b.ROUTING;
        if (bVar == bVar2) {
            return;
        }
        this.phase = bVar2;
        ji.q qVar = this.binding;
        if (qVar == null) {
            p003kotlin.jvm.internal.v.n("binding" /* decoded XOR */);
            qVar = null;
        }
        qVar.f85646c.m();
        mi.a.f88870a.N0();
        PhotoRecoverResultNEEEEXActivity.INSTANCE.a(this);
        BaseAdActivity.showInter$default(this, "RP_RECO_ANIM_END_IN" /* decoded XOR */, null, 2, null);
        finish();
    }

    /* JADX INFO: renamed from: com.neeeex.eraser.recover.reco.p.PhotoRecoverNEEEEXActivity$a, reason: from kotlin metadata */
    public static final class Companion {
        public /* synthetic */ Companion(p003kotlin.jvm.internal.m mVar) {
            this();
        }

        public final void a(Context context) {
            "context" /* decoded XOR */;
            context.getClass();
            context.startActivity(new Intent(context, (Class<?>) PhotoRecoverNEEEEXActivity.class));
        }

        public Companion() {
        }
    }
}