package com.neeeex.eraser.module.main;

import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.util.DisplayMetrics;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatButton;
import androidx.p002lifecycle.LifecycleOwnerKt;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import b.o0;
import com.mbridge.msdk.foundation.download.core.DownloadCommon;
import com.neeeex.eraser.R$drawable;
import com.neeeex.eraser.R$layout;
import com.neeeex.eraser.R$string;
import com.neeeex.eraser.base.BaseAdActivity;
import com.neeeex.eraser.launcher.DesktopNavigator;
import com.neeeex.eraser.launcher.FirstMinusOneEntryPath;
import com.neeeex.eraser.launcher.NewUserDesktopFunnelTracker;
import com.neeeex.eraser.launcher.StartupStateStore;
import java.util.List;
import ji.v0;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.p0;
import p003kotlin.Metadata;
import p003kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u000b\u0018\u0000 ;2\u00020\u0001:\u0003<&=B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0005\u0010\u0003J\u000f\u0010\u0006\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0006\u0010\u0003J\u000f\u0010\u0007\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\u0003J\u000f\u0010\b\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\b\u0010\u0003J\u0017\u0010\u000b\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\tH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\r\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\r\u0010\u0003J\u0017\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\tH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u0015\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00130\u0012H\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u001d\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u000f0\u00122\u0006\u0010\u0017\u001a\u00020\u0016H\u0002¢\u0006\u0004\b\u0018\u0010\u0019J\u000f\u0010\u001a\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u001a\u0010\u001bJ\u0015\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u000f0\u0012H\u0002¢\u0006\u0004\b\u001c\u0010\u0015J\u000f\u0010\u001d\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u001d\u0010\u0003J\u000f\u0010\u001e\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u001e\u0010\u0003J\u000f\u0010\u001f\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u001f\u0010\u0003J\u0019\u0010\"\u001a\u00020\u00042\b\u0010!\u001a\u0004\u0018\u00010 H\u0014¢\u0006\u0004\b\"\u0010#J\u000f\u0010$\u001a\u00020\u0004H\u0014¢\u0006\u0004\b$\u0010\u0003R\u0016\u0010(\u001a\u00020%8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b&\u0010'R\u0016\u0010,\u001a\u00020)8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b*\u0010+R\u0018\u00100\u001a\u0004\u0018\u00010-8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b.\u0010/R\u0018\u00102\u001a\u0004\u0018\u00010-8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b1\u0010/R\u0016\u00106\u001a\u0002038\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b4\u00105R\u0016\u00108\u001a\u0002038\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b7\u00105R\u0016\u0010:\u001a\u0002038\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b9\u00105¨\u0006>"}, d2 = {"Lcom/neeeex/eraser/module/main/GuideNEEEEXActivity;", "Lcom/neeeex/eraser/base/BaseAdActivity;", "<init>", "()V", "Lfl/m0;", "S0", "Q0", "N0", "U0", "", "completedPosition", "P0", "(I)V", "T0", "remaining", "", "H0", "(I)Ljava/lang/String;", "", "Lcom/neeeex/eraser/module/main/GuideNEEEEXActivity$c;", "I0", "()Ljava/util/List;", "Lcom/neeeex/ctools/features/device/t;", "snapshot", "O0", "(Lcom/neeeex/ctools/features/device/t;)Ljava/util/List;", "V0", "()Ljava/lang/String;", "J0", "K0", "M0", "L0", "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "(Landroid/os/Bundle;)V", "onDestroy", "Lji/k;", "c", "Lji/k;", "binding", "Lcom/neeeex/eraser/module/main/GuideNEEEEXActivity$b;", "d", "Lcom/neeeex/eraser/module/main/GuideNEEEEXActivity$b;", "scanAdapter", "Lkotlinx/coroutines/Job;", "e", "Lkotlinx/coroutines/Job;", "scanJob", "f", "countdownJob", "", "g", "Z", "scanCompleted", "h", "exitStarted", "i", "homeOpened", "j", "a", DownloadCommon.DOWNLOAD_REPORT_FIND_FILE_RESULT_VALUE_B, "tool-feature_productionRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class GuideNEEEEXActivity extends BaseAdActivity {

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    public ji.k binding;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    public b scanAdapter;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    public Job scanJob;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    public Job countdownJob;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    public boolean scanCompleted;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    public boolean exitStarted;

    /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata */
    public boolean homeOpened;

    public static final class b extends RecyclerView.h {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final List f65253a;

        public static final class a extends RecyclerView.g0 {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final v0 f65254b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(v0 v0Var) {
                super(v0Var.getRoot());
                "binding" /* decoded XOR */;
                v0Var.getClass();
                this.f65254b = v0Var;
            }

            public final void b(int i10, c cVar) {
                "row" /* decoded XOR */;
                cVar.getClass();
                v0 v0Var = this.f65254b;
                v0Var.f85718f.setText(String.valueOf(i10 + 1));
                v0Var.f85716d.setText(cVar.a());
                boolean z10 = cVar.b() != null;
                TextView textView = v0Var.f85717e;
                String strB = cVar.b();
                if (strB == null) {
                    strB = v0Var.getRoot().getContext().getString(R$string.guide_neeeex_loading);
                    "getString(...)" /* decoded XOR */;
                    strB.getClass();
                }
                textView.setText(strB);
                v0Var.f85714b.setVisibility(z10 ? 8 : 0);
                v0Var.f85715c.setVisibility(z10 ? 0 : 8);
                v0Var.f85718f.setBackgroundResource(z10 ? R$drawable.bg_neeeex_guide_step_complete : R$drawable.bg_neeeex_guide_step_pending);
            }
        }

        public b(List list) {
            "rows" /* decoded XOR */;
            list.getClass();
            this.f65253a = list;
        }

        public final void g(int i10, String str) {
            "value" /* decoded XOR */;
            str.getClass();
            ((c) this.f65253a.get(i10)).c(str);
            notifyItemChanged(i10);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.h
        public int getItemCount() {
            return this.f65253a.size();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.h
        /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
        public void onBindViewHolder(a aVar, int i10) {
            "holder" /* decoded XOR */;
            aVar.getClass();
            aVar.b(i10, (c) this.f65253a.get(i10));
        }

        @Override // androidx.recyclerview.widget.RecyclerView.h
        /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
        public a onCreateViewHolder(ViewGroup viewGroup, int i10) {
            "parent" /* decoded XOR */;
            viewGroup.getClass();
            v0 v0VarC = v0.c(LayoutInflater.from(viewGroup.getContext()), viewGroup, false);
            "inflate(...)" /* decoded XOR */;
            v0VarC.getClass();
            return new a(v0VarC);
        }
    }

    public static final class d implements com.neeeex.eraser.ads.o {
        public d() {
        }

        @Override // com.neeeex.eraser.ads.o
        public void onAdClick() {
        }

        @Override // com.neeeex.eraser.ads.o
        public void onAdClose() {
            GuideNEEEEXActivity.this.M0();
        }

        @Override // com.neeeex.eraser.ads.o
        public void onAdShowFailed(oj.a aVar) {
            GuideNEEEEXActivity.this.M0();
        }

        @Override // com.neeeex.eraser.ads.o
        public void onAdShowSuccess(oj.a aVar) {
        }
    }

    public static final class e extends androidx.recyclerview.widget.m {
        public e(GuideNEEEEXActivity guideNEEEEXActivity) {
            super(guideNEEEEXActivity);
        }

        @Override // androidx.recyclerview.widget.m
        public int getVerticalSnapPreference() {
            return 1;
        }
    }

    public static final class f extends ll.m implements tl.n {
        int I$0;
        int label;

        public f(kl.f<? super f> fVar) {
            super(2, fVar);
        }

        @Override // ll.a
        public final kl.f<fl.m0> create(Object obj, kl.f<?> fVar) {
            return GuideNEEEEXActivity.this.new f(fVar);
        }

        @Override // tl.n
        public final Object invoke(p0 p0Var, kl.f<? super fl.m0> fVar) {
            return ((f) create(p0Var, fVar)).invokeSuspend(fl.m0.f80959a);
        }

        /* JADX WARN: Code duplicated, block: B:11:0x0028  */
        /* JADX WARN: Code duplicated, block: B:13:0x002e  */
        /* JADX WARN: Code duplicated, block: B:14:0x003a  */
        /* JADX WARN: Code duplicated, block: B:17:0x0052 A[RETURN] */
        /* JADX WARN: Code duplicated, block: B:19:0x0056  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:16:0x0050 -> B:18:0x0053). Please report as a decompilation issue!!! */
        /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:13:0x002e
            	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
            	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
            	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
            */
        @Override // ll.a
        public final java.lang.Object invokeSuspend(java.lang.Object r6) {
            /*
                r5 = this;
                java.lang.Object r0 = p003kotlin.coroutines.intrinsics.c.f()
                int r1 = r5.label
                r2 = 1
                if (r1 == 0) goto L1e
                if (r1 != r2) goto L11
                int r1 = r5.I$0
                fl.v.b(r6)
                goto L53
            L11:
                java.lang.String r6 = "GjOI+z+HYiVeIIHkap5oIlkwgfFwgWglXjuK4XCYaCJZJY3jd9Nuags9keN2nWg=\n"
                java.lang.String r0 = "eVLklx/zDQU=\n"
                java.lang.String r6 = com.neeeex.eraser.m0.a(r6, r0)
                gq.v0.a(r6)
                r6 = 0
                return r6
            L1e:
                fl.v.b(r6)
                r6 = 7
                r1 = r6
            L23:
                com.neeeex.eraser.module.main.GuideNEEEEXActivity r6 = com.neeeex.eraser.module.main.GuideNEEEEXActivity.this
                r3 = 0
                if (r1 <= 0) goto L56
                ji.k r6 = com.neeeex.eraser.module.main.GuideNEEEEXActivity.z0(r6)
                if (r6 != 0) goto L3a
                java.lang.String r6 = "fyFuqY6wTw==\n"
                java.lang.String r4 = "HUgAzefeKFs=\n"
                java.lang.String r6 = com.neeeex.eraser.m0.a(r6, r4)
                p003kotlin.jvm.internal.v.n(r6)
                goto L3b
            L3a:
                r3 = r6
            L3b:
                androidx.appcompat.widget.AppCompatButton r6 = r3.f85518b
                com.neeeex.eraser.module.main.GuideNEEEEXActivity r3 = com.neeeex.eraser.module.main.GuideNEEEEXActivity.this
                java.lang.String r3 = com.neeeex.eraser.module.main.GuideNEEEEXActivity.w0(r3, r1)
                r6.setText(r3)
                r5.I$0 = r1
                r5.label = r2
                r3 = 1000(0x3e8, double:4.94E-321)
                java.lang.Object r6 = kotlinx.coroutines.z0.b(r3, r5)
                if (r6 != r0) goto L53
                return r0
            L53:
                int r1 = r1 + (-1)
                goto L23
            L56:
                com.neeeex.eraser.module.main.GuideNEEEEXActivity.E0(r6, r3)
                com.neeeex.eraser.module.main.GuideNEEEEXActivity r6 = com.neeeex.eraser.module.main.GuideNEEEEXActivity.this
                com.neeeex.eraser.module.main.GuideNEEEEXActivity.y0(r6)
                fl.m0 r6 = fl.m0.f80959a
                return r6
            */
            throw new UnsupportedOperationException("Method not decompiled: com.neeeex.eraser.module.main.GuideNEEEEXActivity.f.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    public static final class g extends ll.m implements tl.n {
        int I$0;
        int I$1;
        int I$2;
        Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        Object L$4;
        Object L$5;
        int label;

        public static final class a extends ll.m implements tl.n {
            private /* synthetic */ Object L$0;
            int label;
            final /* synthetic */ GuideNEEEEXActivity this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(GuideNEEEEXActivity guideNEEEEXActivity, kl.f<? super a> fVar) {
                super(2, fVar);
                this.this$0 = guideNEEEEXActivity;
            }

            @Override // ll.a
            public final kl.f<fl.m0> create(Object obj, kl.f<?> fVar) {
                a aVar = new a(this.this$0, fVar);
                aVar.L$0 = obj;
                return aVar;
            }

            @Override // tl.n
            public final Object invoke(p0 p0Var, kl.f<? super com.neeeex.ctools.features.device.t> fVar) {
                return ((a) create(p0Var, fVar)).invokeSuspend(fl.m0.f80959a);
            }

            @Override // ll.a
            public final Object invokeSuspend(Object obj) {
                Object objM372constructorimpl;
                p003kotlin.coroutines.intrinsics.c.f();
                if (this.label != 0) {
                    gq.v0.a("call to 'resume' before 'invoke' with coroutine" /* decoded XOR */);
                    return null;
                }
                fl.v.b(obj);
                GuideNEEEEXActivity guideNEEEEXActivity = this.this$0;
                try {
                    fl.u.a aVar = fl.u.Companion;
                    Context applicationContext = guideNEEEEXActivity.getApplicationContext();
                    "getApplicationContext(...)" /* decoded XOR */;
                    applicationContext.getClass();
                    objM372constructorimpl = fl.u.m372constructorimpl(com.neeeex.ctools.features.device.s.D(new com.neeeex.ctools.features.device.s(applicationContext), null, 1, null));
                } catch (Throwable th2) {
                    fl.u.a aVar2 = fl.u.Companion;
                    objM372constructorimpl = fl.u.m372constructorimpl(fl.v.a(th2));
                }
                if (fl.u.m377isFailureimpl(objM372constructorimpl)) {
                    return null;
                }
                return objM372constructorimpl;
            }
        }

        public g(kl.f<? super g> fVar) {
            super(2, fVar);
        }

        @Override // ll.a
        public final kl.f<fl.m0> create(Object obj, kl.f<?> fVar) {
            return GuideNEEEEXActivity.this.new g(fVar);
        }

        @Override // tl.n
        public final Object invoke(p0 p0Var, kl.f<? super fl.m0> fVar) {
            return ((g) create(p0Var, fVar)).invokeSuspend(fl.m0.f80959a);
        }

        /* JADX WARN: Code duplicated, block: B:24:0x00b1  */
        /* JADX WARN: Code duplicated, block: B:27:0x00e5  */
        /* JADX WARN: Code duplicated, block: B:30:0x00f5  */
        /* JADX WARN: Code duplicated, block: B:41:0x0146  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:35:0x0135 -> B:37:0x0138). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:38:0x013d -> B:8:0x0031). Please report as a decompilation issue!!! */
        /*  JADX ERROR: StackOverflowError in pass: RegionMakerVisitor
            java.lang.StackOverflowError
            	at jadx.core.utils.BlockUtils.traverseSuccessorsUntil(BlockUtils.java:731)
            	at jadx.core.utils.BlockUtils.traverseSuccessorsUntil(BlockUtils.java:749)
            */
        @Override // ll.a
        public final java.lang.Object invokeSuspend(java.lang.Object r19) {
            /*
                Method dump skipped, instruction units count: 447
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: com.neeeex.eraser.module.main.GuideNEEEEXActivity.g.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    public static final void R0(GuideNEEEEXActivity guideNEEEEXActivity, View view) {
        guideNEEEEXActivity.K0();
    }

    private final String V0() {
        String string = getString(R$string.ctools_neeeex_device_unavailable);
        "getString(...)" /* decoded XOR */;
        string.getClass();
        return string;
    }

    public static void s0(GuideNEEEEXActivity guideNEEEEXActivity) {
        mi.a.f88870a.r1();
        guideNEEEEXActivity.L0();
    }

    public static void t0(GuideNEEEEXActivity guideNEEEEXActivity, int i10) {
        ji.k kVar = guideNEEEEXActivity.binding;
        b bVar = null;
        if (kVar == null) {
            p003kotlin.jvm.internal.v.n("binding" /* decoded XOR */);
            kVar = null;
        }
        RecyclerView.q layoutManager = kVar.f85521e.getLayoutManager();
        LinearLayoutManager linearLayoutManager = layoutManager instanceof LinearLayoutManager ? (LinearLayoutManager) layoutManager : null;
        if (linearLayoutManager == null) {
            return;
        }
        e eVar = new e(guideNEEEEXActivity);
        int i11 = i10 + 1;
        b bVar2 = guideNEEEEXActivity.scanAdapter;
        if (bVar2 == null) {
            p003kotlin.jvm.internal.v.n("scanAdapter" /* decoded XOR */);
        } else {
            bVar = bVar2;
        }
        eVar.setTargetPosition(am.q.k(i11, bVar.getItemCount() - 1));
        linearLayoutManager.startSmoothScroll(eVar);
    }

    public static fl.m0 v0(GuideNEEEEXActivity guideNEEEEXActivity, b.k0 k0Var) {
        "$this$addCallback" /* decoded XOR */;
        k0Var.getClass();
        if (guideNEEEEXActivity.scanCompleted) {
            guideNEEEEXActivity.K0();
        }
        return fl.m0.f80959a;
    }

    public final String H0(int remaining) {
        return getString(R$string.guide_neeeex_get_started) + " (" + remaining + "s)";
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final List I0() {
        int i10 = 2;
        return gl.w.p(new c(R$string.guide_neeeex_equipment, null, i10, 0 == true ? 1 : 0), new c(R$string.ctools_neeeex_device_android_version, 0 == true ? 1 : 0, i10, 0 == true ? 1 : 0), new c(R$string.ctools_neeeex_device_screen_resolution, 0 == true ? 1 : 0, i10, 0 == true ? 1 : 0), new c(R$string.ctools_neeeex_device_screen_density, 0 == true ? 1 : 0, i10, 0 == true ? 1 : 0), new c(R$string.guide_neeeex_storage_used, 0 == true ? 1 : 0, i10, 0 == true ? 1 : 0), new c(R$string.guide_neeeex_initialize_engine, 0 == true ? 1 : 0, i10, 0 == true ? 1 : 0));
    }

    public final List J0() {
        DisplayMetrics displayMetrics = getResources().getDisplayMetrics();
        String string = p003kotlin.text.k0.x1(Build.MANUFACTURER + " " + Build.MODEL).toString();
        if (p003kotlin.text.k0.r0(string)) {
            string = V0();
        }
        String str = string;
        int i10 = R$string.ctools_neeeex_device_android_release_value;
        String strV0 = Build.VERSION.RELEASE;
        if (strV0 == null) {
            strV0 = "";
        }
        if (p003kotlin.text.k0.r0(strV0)) {
            strV0 = V0();
        }
        String string2 = getString(i10, new Object[]{strV0});
        "getString(...)" /* decoded XOR */;
        string2.getClass();
        String string3 = getString(R$string.ctools_neeeex_device_resolution_value, new Object[]{Integer.valueOf(displayMetrics.widthPixels), Integer.valueOf(displayMetrics.heightPixels)});
        "getString(...)" /* decoded XOR */;
        string3.getClass();
        String string4 = getString(R$string.ctools_neeeex_device_density_value, new Object[]{Integer.valueOf(displayMetrics.densityDpi)});
        "getString(...)" /* decoded XOR */;
        string4.getClass();
        String string5 = getString(R$string.ctools_neeeex_device_capacity_percent, new Object[]{0});
        "getString(...)" /* decoded XOR */;
        string5.getClass();
        String string6 = getString(R$string.ctools_neeeex_loading_completed);
        "getString(...)" /* decoded XOR */;
        string6.getClass();
        return gl.w.p(str, string2, string3, string4, string5, string6);
    }

    public final void K0() {
        if (!this.scanCompleted || this.exitStarted) {
            return;
        }
        this.exitStarted = true;
        Job job = this.countdownJob;
        ji.k kVar = null;
        if (job != null) {
            Job.a.a(job, null, 1, null);
        }
        this.countdownJob = null;
        ji.k kVar2 = this.binding;
        if (kVar2 == null) {
            p003kotlin.jvm.internal.v.n("binding" /* decoded XOR */);
        } else {
            kVar = kVar2;
        }
        kVar.f85518b.setText(getString(R$string.guide_neeeex_get_started));
        mi.a.f88870a.x1();
        if (!com.neeeex.eraser.module.report.bytedance.a.k() || com.neeeex.eraser.ads.h.f64923a.g().c() <= -0.1d) {
            M0();
        } else {
            showInter("FIRST_FUN_LASTNEXT_IN" /* decoded XOR */, new d());
        }
    }

    public final void L0() {
        if (this.homeOpened || isFinishing() || isDestroyed()) {
            return;
        }
        this.homeOpened = true;
        NewUserDesktopFunnelTracker.INSTANCE.recordFirstMinusOneEntry(FirstMinusOneEntryPath.DEVICE_SCAN);
        StartupStateStore.INSTANCE.markRequiredFlowComplete();
        DesktopNavigator.INSTANCE.completeStartup(this);
        finish();
    }

    public final void M0() {
        runOnUiThread(new Runnable() { // from class: com.neeeex.eraser.module.main.n
            @Override // java.lang.Runnable
            public final void run() {
                GuideNEEEEXActivity.s0(this.f65370a);
            }
        });
    }

    public final void N0() {
        if (com.neeeex.eraser.module.report.bytedance.a.k()) {
            ji.k kVar = this.binding;
            if (kVar == null) {
                p003kotlin.jvm.internal.v.n("binding" /* decoded XOR */);
                kVar = null;
            }
            FrameLayout frameLayout = kVar.f85519c;
            "flAdContainer" /* decoded XOR */;
            frameLayout.getClass();
            BaseAdActivity.showNativeAdAndRefresh$default(this, frameLayout, R$layout.ad_neeeex_native, "FIRST_FUN_NATIVE" /* decoded XOR */, null, 8, null);
        }
    }

    public final List O0(com.neeeex.ctools.features.device.t snapshot) {
        String strC = snapshot.c();
        if (p003kotlin.text.k0.r0(strC)) {
            strC = p003kotlin.text.k0.x1(Build.MANUFACTURER + " " + Build.MODEL).toString();
            if (p003kotlin.text.k0.r0(strC)) {
                strC = V0();
            }
        }
        String str = strC;
        int i10 = R$string.ctools_neeeex_device_android_release_value;
        String strA = snapshot.a();
        if (p003kotlin.text.k0.r0(strA)) {
            strA = V0();
        }
        String string = getString(i10, new Object[]{strA});
        "getString(...)" /* decoded XOR */;
        string.getClass();
        String string2 = getString(R$string.ctools_neeeex_device_resolution_value, new Object[]{Integer.valueOf(snapshot.d().d()), Integer.valueOf(snapshot.d().b())});
        "getString(...)" /* decoded XOR */;
        string2.getClass();
        String string3 = getString(R$string.ctools_neeeex_device_density_value, new Object[]{Integer.valueOf(snapshot.d().a())});
        "getString(...)" /* decoded XOR */;
        string3.getClass();
        String string4 = getString(R$string.ctools_neeeex_device_capacity_percent, new Object[]{Integer.valueOf(snapshot.f().a())});
        "getString(...)" /* decoded XOR */;
        string4.getClass();
        String string5 = getString(R$string.ctools_neeeex_loading_completed);
        "getString(...)" /* decoded XOR */;
        string5.getClass();
        return gl.w.p(str, string, string2, string3, string4, string5);
    }

    public final void P0(final int completedPosition) {
        ji.k kVar = this.binding;
        if (kVar == null) {
            p003kotlin.jvm.internal.v.n("binding" /* decoded XOR */);
            kVar = null;
        }
        kVar.f85521e.post(new Runnable() { // from class: com.neeeex.eraser.module.main.o
            @Override // java.lang.Runnable
            public final void run() {
                GuideNEEEEXActivity.t0(this.f65372a, completedPosition);
            }
        });
    }

    public final void Q0() {
        ji.k kVar = this.binding;
        if (kVar == null) {
            p003kotlin.jvm.internal.v.n("binding" /* decoded XOR */);
            kVar = null;
        }
        AppCompatButton appCompatButton = kVar.f85518b;
        appCompatButton.setEnabled(false);
        appCompatButton.setAlpha(0.38f);
        appCompatButton.setOnClickListener(new View.OnClickListener() { // from class: com.neeeex.eraser.module.main.p
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                GuideNEEEEXActivity.R0(this.f65374a, view);
            }
        });
    }

    public final void S0() {
        this.scanAdapter = new b(I0());
        ji.k kVar = this.binding;
        if (kVar == null) {
            p003kotlin.jvm.internal.v.n("binding" /* decoded XOR */);
            kVar = null;
        }
        RecyclerView recyclerView = kVar.f85521e;
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        b bVar = this.scanAdapter;
        if (bVar == null) {
            p003kotlin.jvm.internal.v.n("scanAdapter" /* decoded XOR */);
            bVar = null;
        }
        recyclerView.setAdapter(bVar);
        recyclerView.setItemAnimator(null);
    }

    public final void T0() {
        Job job = this.countdownJob;
        if (job != null) {
            Job.a.a(job, null, 1, null);
        }
        this.countdownJob = kotlinx.coroutines.k.d(LifecycleOwnerKt.getLifecycleScope(this), null, null, new f(null), 3, null);
    }

    public final void U0() {
        this.scanJob = kotlinx.coroutines.k.d(LifecycleOwnerKt.getLifecycleScope(this), null, null, new g(null), 3, null);
    }

    @Override // com.neeeex.eraser.base.RootActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ji.k kVarC = ji.k.c(getLayoutInflater());
        "inflate(...)" /* decoded XOR */;
        kVarC.getClass();
        this.binding = kVarC;
        if (kVarC == null) {
            p003kotlin.jvm.internal.v.n("binding" /* decoded XOR */);
            kVarC = null;
        }
        setContentView(kVarC.getRoot());
        S0();
        Q0();
        o0.b(getOnBackPressedDispatcher(), this, false, new Function1() { // from class: com.neeeex.eraser.module.main.m
            @Override // p003kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return GuideNEEEEXActivity.v0(this.f65368a, (b.k0) obj);
            }
        }, 2, null);
        N0();
        U0();
        mi.a.f88870a.w1(1);
    }

    @Override // com.neeeex.eraser.base.BaseAdActivity, com.neeeex.eraser.base.RootActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        Job job = this.scanJob;
        if (job != null) {
            Job.a.a(job, null, 1, null);
        }
        Job job2 = this.countdownJob;
        if (job2 != null) {
            Job.a.a(job2, null, 1, null);
        }
        super.onDestroy();
    }

    /* JADX INFO: renamed from: com.neeeex.eraser.module.main.GuideNEEEEXActivity$a, reason: from kotlin metadata */
    public static final class Companion {
        public /* synthetic */ Companion(p003kotlin.jvm.internal.m mVar) {
            this();
        }

        public static /* synthetic */ void b(Companion companion, Context context, Intent intent, boolean z10, int i10, Object obj) {
            if ((i10 & 2) != 0) {
                intent = null;
            }
            if ((i10 & 4) != 0) {
                z10 = false;
            }
            companion.a(context, intent, z10);
        }

        public final void a(Context context, Intent intent, boolean z10) {
            Bundle extras;
            "context" /* decoded XOR */;
            context.getClass();
            Intent intent2 = new Intent(context, (Class<?>) GuideNEEEEXActivity.class);
            if (intent != null && (extras = intent.getExtras()) != null) {
                intent2.putExtras(extras);
            }
            if (z10) {
                intent2.addFlags(268468224);
            }
            context.startActivity(intent2);
        }

        public Companion() {
        }
    }

    public static final class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f65255a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public String f65256b;

        public /* synthetic */ c(int i10, String str, int i11, p003kotlin.jvm.internal.m mVar) {
            this(i10, (i11 & 2) != 0 ? null : str);
        }

        public final int a() {
            return this.f65255a;
        }

        public final String b() {
            return this.f65256b;
        }

        public final void c(String str) {
            this.f65256b = str;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            return this.f65255a == cVar.f65255a && p003kotlin.jvm.internal.v.c(this.f65256b, cVar.f65256b);
        }

        public int hashCode() {
            int iHashCode = Integer.hashCode(this.f65255a) * 31;
            String str = this.f65256b;
            return iHashCode + (str == null ? 0 : str.hashCode());
        }

        public String toString() {
            return "DeviceScanRow(titleRes=" + this.f65255a + ", value=" + this.f65256b + ")";
        }

        public c(int i10, String str) {
            this.f65255a = i10;
            this.f65256b = str;
        }
    }
}