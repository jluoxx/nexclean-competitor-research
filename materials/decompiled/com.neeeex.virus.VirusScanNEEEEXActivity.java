package com.neeeex.virus;

import android.app.Dialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.activity.ComponentActivity;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.view.c1;
import androidx.core.view.d1;
import androidx.p002lifecycle.Lifecycle;
import androidx.p002lifecycle.LifecycleOwnerKt;
import androidx.p002lifecycle.RepeatOnLifecycleKt;
import androidx.p002lifecycle.ViewModelLazy;
import androidx.p002lifecycle.ViewModelProvider;
import androidx.p002lifecycle.ViewModelStore;
import androidx.p002lifecycle.viewmodel.CreationExtras;
import b.k0;
import com.airbnb.lottie.LottieAnimationView;
import com.android.launcher3.testing.shared.TestProtocol;
import com.neeeex.eraser.R$color;
import com.neeeex.eraser.R$drawable;
import com.neeeex.eraser.R$id;
import com.neeeex.eraser.R$layout;
import com.neeeex.eraser.R$plurals;
import com.neeeex.eraser.R$string;
import com.neeeex.eraser.base.BaseAdActivity;
import fl.m0;
import gq.v0;
import java.util.ArrayList;
import java.util.List;
import ji.m1;
import kotlin.xy1;
import kotlinx.coroutines.p0;
import p003kotlin.Metadata;
import p003kotlin.jvm.functions.Function0;
import p003kotlin.jvm.internal.w0;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0012\u0018\u0000 32\u00020\u0001:\u00014B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0005\u0010\u0003J\u000f\u0010\u0006\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0006\u0010\u0003J\u0019\u0010\t\u001a\u00020\u00042\b\u0010\b\u001a\u0004\u0018\u00010\u0007H\u0014¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\u000b\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u000b\u0010\u0003J\u000f\u0010\f\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\f\u0010\u0003J\u0017\u0010\u000f\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\rH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0011\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0011\u0010\u0003J\u0017\u0010\u0014\u001a\u00020\u00042\u0006\u0010\u0013\u001a\u00020\u0012H\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u0017\u0010\u0018\u001a\u00020\u00042\u0006\u0010\u0017\u001a\u00020\u0016H\u0002¢\u0006\u0004\b\u0018\u0010\u0019J\u001d\u0010\u001d\u001a\u00020\u00042\f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u001b0\u001aH\u0002¢\u0006\u0004\b\u001d\u0010\u001eR\u0016\u0010\"\u001a\u00020\u001f8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b \u0010!R\u001b\u0010(\u001a\u00020#8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b$\u0010%\u001a\u0004\b&\u0010'R\u0016\u0010+\u001a\u00020\u00128\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b)\u0010*R\u0016\u0010-\u001a\u00020\u00128\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b,\u0010*R\u0016\u0010/\u001a\u00020\u00128\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b.\u0010*R\u0016\u00102\u001a\u00020\u00168\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b0\u00101¨\u00065"}, d2 = {"Lcom/neeeex/virus/VirusScanNEEEEXActivity;", "Lcom/neeeex/eraser/base/BaseAdActivity;", "<init>", "()V", "Lfl/m0;", "B0", "C0", "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "(Landroid/os/Bundle;)V", "H0", "G0", "Lcom/neeeex/virus/c0;", TestProtocol.STATE_FIELD, "J0", "(Lcom/neeeex/virus/c0;)V", "F0", "", "cancelScan", "D0", "(Z)V", "", "detail", "K0", "(Ljava/lang/String;)V", "", "Lcom/neeeex/virus/e0;", "threats", "I0", "(Ljava/util/List;)V", "Lji/m1;", "c", "Lji/m1;", "binding", "Lcom/neeeex/virus/d0;", "d", "Lfl/n;", "E0", "()Lcom/neeeex/virus/d0;", "viewModel", "e", "Z", "resultOpened", "f", "errorDialogVisible", "g", "exitInProgress", "h", "Ljava/lang/String;", "renderedCurrentApp", "i", "a", "tool-feature_productionRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class VirusScanNEEEEXActivity extends BaseAdActivity {

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    public m1 binding;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    public boolean resultOpened;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    public boolean errorDialogVisible;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    public boolean exitInProgress;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    public final fl.n viewModel = new ViewModelLazy(w0.b(d0.class), new f(this), new e(this), new g(null, this));

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    public String renderedCurrentApp = "";

    public static final /* synthetic */ class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f66637a;

        static {
            int[] iArr = new int[b0.values().length];
            try {
                iArr[b0.SCANNING.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[b0.ERROR.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[b0.FINISHED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[b0.CANCELED.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[b0.IDLE.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            f66637a = iArr;
        }
    }

    public static final class c extends k0 {
        public c() {
            super(true);
        }

        @Override // b.k0
        public void handleOnBackPressed() {
            VirusScanNEEEEXActivity.this.F0();
        }
    }

    public static final class d extends ll.m implements tl.n {
        int label;

        public static final class a extends ll.m implements tl.n {
            int label;
            final /* synthetic */ VirusScanNEEEEXActivity this$0;

            /* JADX INFO: renamed from: com.neeeex.virus.VirusScanNEEEEXActivity$d$a$a, reason: collision with other inner class name */
            public static final /* synthetic */ class C0821a implements kotlinx.coroutines.flow.h, p003kotlin.jvm.internal.p {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final /* synthetic */ VirusScanNEEEEXActivity f66639a;

                public C0821a(VirusScanNEEEEXActivity virusScanNEEEEXActivity) {
                    this.f66639a = virusScanNEEEEXActivity;
                }

                @Override // kotlinx.coroutines.flow.h
                /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
                public final Object emit(c0 c0Var, kl.f fVar) {
                    Object objB = a.b(this.f66639a, c0Var, fVar);
                    return objB == p003kotlin.coroutines.intrinsics.c.f() ? objB : m0.f80959a;
                }

                public final boolean equals(Object obj) {
                    if ((obj instanceof kotlinx.coroutines.flow.h) && (obj instanceof p003kotlin.jvm.internal.p)) {
                        return p003kotlin.jvm.internal.v.c(getFunctionDelegate(), ((p003kotlin.jvm.internal.p) obj).getFunctionDelegate());
                    }
                    return false;
                }

                @Override // p003kotlin.jvm.internal.p
                public final fl.h getFunctionDelegate() {
                    return new p003kotlin.jvm.internal.a(2, this.f66639a, VirusScanNEEEEXActivity.class, com.neeeex.eraser.m0.a("ItJvdIvB\n", "ULcBEO6zc+g=\n"), com.neeeex.eraser.m0.a("2ohOfvWXGOjLgk01/oBVwc2VD2z5l0XXh7tJaOWWY8fJg3Vzw5FR0M3WCUw=\n", "qO0gGpDlMKQ=\n"), 4);
                }

                public final int hashCode() {
                    return getFunctionDelegate().hashCode();
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(VirusScanNEEEEXActivity virusScanNEEEEXActivity, kl.f<? super a> fVar) {
                super(2, fVar);
                this.this$0 = virusScanNEEEEXActivity;
            }

            public static final /* synthetic */ Object b(VirusScanNEEEEXActivity virusScanNEEEEXActivity, c0 c0Var, kl.f fVar) {
                virusScanNEEEEXActivity.J0(c0Var);
                return m0.f80959a;
            }

            @Override // ll.a
            public final kl.f<m0> create(Object obj, kl.f<?> fVar) {
                return new a(this.this$0, fVar);
            }

            @Override // tl.n
            public final Object invoke(p0 p0Var, kl.f<? super m0> fVar) {
                return ((a) create(p0Var, fVar)).invokeSuspend(m0.f80959a);
            }

            @Override // ll.a
            public final Object invokeSuspend(Object obj) {
                Object objF = p003kotlin.coroutines.intrinsics.c.f();
                int i10 = this.label;
                if (i10 == 0) {
                    fl.v.b(obj);
                    kotlinx.coroutines.flow.p0 p0VarJ = this.this$0.E0().j();
                    C0821a c0821a = new C0821a(this.this$0);
                    this.label = 1;
                    if (p0VarJ.collect(c0821a, this) == objF) {
                        return objF;
                    }
                } else {
                    if (i10 != 1) {
                        v0.a(com.neeeex.eraser.m0.a("LyBLUfpTH5RrM0JOr0oVk2wjQlu1VRWUayhJS7VMFZNsNk5JsgcT2z4uUkmzSRU=\n", "TEEnPdoncLQ=\n"));
                        return null;
                    }
                    fl.v.b(obj);
                }
                xy1.a();
                return null;
            }
        }

        public d(kl.f<? super d> fVar) {
            super(2, fVar);
        }

        @Override // ll.a
        public final kl.f<m0> create(Object obj, kl.f<?> fVar) {
            return VirusScanNEEEEXActivity.this.new d(fVar);
        }

        @Override // tl.n
        public final Object invoke(p0 p0Var, kl.f<? super m0> fVar) {
            return ((d) create(p0Var, fVar)).invokeSuspend(m0.f80959a);
        }

        @Override // ll.a
        public final Object invokeSuspend(Object obj) {
            Object objF = p003kotlin.coroutines.intrinsics.c.f();
            int i10 = this.label;
            if (i10 == 0) {
                fl.v.b(obj);
                VirusScanNEEEEXActivity virusScanNEEEEXActivity = VirusScanNEEEEXActivity.this;
                Lifecycle.State state = Lifecycle.State.STARTED;
                a aVar = new a(virusScanNEEEEXActivity, null);
                this.label = 1;
                if (RepeatOnLifecycleKt.repeatOnLifecycle(virusScanNEEEEXActivity, state, aVar, this) == objF) {
                    return objF;
                }
            } else {
                if (i10 != 1) {
                    v0.a(com.neeeex.eraser.m0.a("6iFqDLZ142SuMmMT42zpY6kiYwb5c+lkriloFvlq6WOpN28U/iHvK/svcxT/b+k=\n", "iUAGYJYBjEQ=\n"));
                    return null;
                }
                fl.v.b(obj);
            }
            return m0.f80959a;
        }
    }

    public static final class e extends p003kotlin.jvm.internal.b0 implements Function0 {
        final /* synthetic */ ComponentActivity $this_viewModels;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(ComponentActivity componentActivity) {
            super(0);
            this.$this_viewModels = componentActivity;
        }

        @Override // p003kotlin.jvm.functions.Function0
        public final ViewModelProvider.Factory invoke() {
            return this.$this_viewModels.getDefaultViewModelProviderFactory();
        }
    }

    public static final class f extends p003kotlin.jvm.internal.b0 implements Function0 {
        final /* synthetic */ ComponentActivity $this_viewModels;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(ComponentActivity componentActivity) {
            super(0);
            this.$this_viewModels = componentActivity;
        }

        @Override // p003kotlin.jvm.functions.Function0
        public final ViewModelStore invoke() {
            return this.$this_viewModels.getViewModelStore();
        }
    }

    public static final class g extends p003kotlin.jvm.internal.b0 implements Function0 {
        final /* synthetic */ Function0 $extrasProducer;
        final /* synthetic */ ComponentActivity $this_viewModels;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(Function0 function0, ComponentActivity componentActivity) {
            super(0);
            this.$extrasProducer = function0;
            this.$this_viewModels = componentActivity;
        }

        @Override // p003kotlin.jvm.functions.Function0
        public final CreationExtras invoke() {
            CreationExtras creationExtras;
            Function0 function0 = this.$extrasProducer;
            return (function0 == null || (creationExtras = (CreationExtras) function0.invoke()) == null) ? this.$this_viewModels.getDefaultViewModelCreationExtras() : creationExtras;
        }
    }

    private final void B0() {
        m1 m1Var = this.binding;
        if (m1Var == null) {
            p003kotlin.jvm.internal.v.n(com.neeeex.eraser.m0.a("1KUx63pMdQ==\n", "tsxfjxMiEoM=\n"));
            m1Var = null;
        }
        androidx.core.view.m0.w0(m1Var.f85587i, new androidx.core.view.y() { // from class: com.neeeex.virus.v
            @Override // androidx.core.view.y
            public final c1 a(View view, c1 c1Var) {
                return VirusScanNEEEEXActivity.s0(this.f66720a, view, c1Var);
            }
        });
    }

    private final void C0() {
        m1 m1Var = this.binding;
        if (m1Var == null) {
            p003kotlin.jvm.internal.v.n(com.neeeex.eraser.m0.a("IeTHRoKz+Q==\n", "Q42pIuvdnrU=\n"));
            m1Var = null;
        }
        m1Var.f85581c.setOnClickListener(new View.OnClickListener() { // from class: com.neeeex.virus.z
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                VirusScanNEEEEXActivity.x0(this.f66725a, view);
            }
        });
        getOnBackPressedDispatcher().d(this, new c());
    }

    public static c1 s0(VirusScanNEEEEXActivity virusScanNEEEEXActivity, View view, c1 c1Var) {
        com.neeeex.eraser.m0.a("Ny6tGQ==\n", "QUfIbtmwmIw=\n");
        view.getClass();
        com.neeeex.eraser.m0.a("TGb/w4O2\n", "JQiMpvfFIMA=\n");
        c1Var.getClass();
        o2.d dVarF = c1Var.f(c1.p.i() | c1.p.c());
        com.neeeex.eraser.m0.a("42uwoX5r3AL3JurGPjE=\n", "hA7E6BAYuXY=\n");
        dVarF.getClass();
        view.setPadding(dVarF.f89980a, dVarF.f89981b, dVarF.f89982c, dVarF.f89983d);
        int iD = wl.c.d(virusScanNEEEEXActivity.getResources().getDisplayMetrics().density * 188.0f);
        m1 m1Var = virusScanNEEEEXActivity.binding;
        if (m1Var == null) {
            p003kotlin.jvm.internal.v.n(com.neeeex.eraser.m0.a("AC8E0Ao1Ag==\n", "YkZqtGNbZXo=\n"));
            m1Var = null;
        }
        LottieAnimationView lottieAnimationView = m1Var.f85580b;
        com.neeeex.eraser.m0.a("rIyyXC0Imxy/gLhoMC+TGK6Mr0c=\n", "2uXAKV5G/nk=\n");
        lottieAnimationView.getClass();
        ViewGroup.LayoutParams layoutParams = lottieAnimationView.getLayoutParams();
        if (layoutParams == null) {
            com.pgl.ssdk.b0.a(com.neeeex.eraser.m0.a("xs/h429iL4LG1fmvLWRuj8nJ+a87bm6Cx9Sg4TptIszcw/3qb2AgiNrV5Os3Ly2Dxsn5/S5oIJjE\n2/TgOnVgm8He6uo7Lw2Dxsn5/S5oIJjk2/TgOnVgoMnD4vo7US+eydf+\n", "qLqNj08BTuw=\n"));
            return null;
        }
        ConstraintLayout.b bVar = (ConstraintLayout.b) layoutParams;
        ((ViewGroup.MarginLayoutParams) bVar).topMargin = am.q.f(iD - dVarF.f89981b, 0);
        lottieAnimationView.setLayoutParams(bVar);
        return c1Var;
    }

    public static void t0(Dialog dialog, VirusScanNEEEEXActivity virusScanNEEEEXActivity, View view) {
        dialog.dismiss();
        virusScanNEEEEXActivity.errorDialogVisible = false;
        virusScanNEEEEXActivity.D0(false);
    }

    public static m0 u0(VirusScanNEEEEXActivity virusScanNEEEEXActivity) {
        virusScanNEEEEXActivity.errorDialogVisible = false;
        mi.a.f88870a.C1();
        virusScanNEEEEXActivity.E0().n();
        return m0.f80959a;
    }

    public static void v0(VirusScanNEEEEXActivity virusScanNEEEEXActivity, DialogInterface dialogInterface) {
        virusScanNEEEEXActivity.errorDialogVisible = false;
        virusScanNEEEEXActivity.D0(false);
    }

    public static m0 w0(VirusScanNEEEEXActivity virusScanNEEEEXActivity) {
        virusScanNEEEEXActivity.D0(true);
        return m0.f80959a;
    }

    public static void x0(VirusScanNEEEEXActivity virusScanNEEEEXActivity, View view) {
        virusScanNEEEEXActivity.F0();
    }

    public final void D0(boolean cancelScan) {
        if (this.exitInProgress) {
            return;
        }
        this.exitInProgress = true;
        if (cancelScan) {
            E0().i();
        }
        zi.l.f104405a.b(this, com.neeeex.eraser.m0.a("dKwwGsuqhJJ+rwocwre6jEW6Nh7Ajb6ac70KGd0=\n", "GslVf67S2+I=\n"), zi.n.VIRUS_SCAN);
    }

    public final d0 E0() {
        return (d0) this.viewModel.getValue();
    }

    public final void F0() {
        if (((c0) E0().j().getValue()).e() != b0.SCANNING) {
            D0(false);
            return;
        }
        com.neeeex.virus.e eVar = com.neeeex.virus.e.f66670a;
        String string = getString(R$string.virus_neeeex_stop_title);
        com.neeeex.eraser.m0.a("5DQ1wzGbvCfkeW++a8A=\n", "g1FBkEXp1Uk=\n");
        string.getClass();
        String string2 = getString(R$string.virus_neeeex_stop_message);
        com.neeeex.eraser.m0.a("k03pUytTu6OTALMucQg=\n", "9CidAF8h0s0=\n");
        string2.getClass();
        String string3 = getString(R$string.virus_neeeex_stop);
        com.neeeex.eraser.m0.a("b2ybzAAIy0ZvIcGxWlM=\n", "CAnvn3R6oig=\n");
        string3.getClass();
        eVar.d(this, string, string2, string3, new Function0() { // from class: com.neeeex.virus.a0
            @Override // p003kotlin.jvm.functions.Function0
            public final Object invoke() {
                return VirusScanNEEEEXActivity.w0(this.f66645a);
            }
        });
    }

    public final void G0() {
        boolean zK = com.neeeex.eraser.module.report.bytedance.a.k();
        m1 m1Var = this.binding;
        m1 m1Var2 = null;
        if (!zK) {
            if (m1Var == null) {
                p003kotlin.jvm.internal.v.n(com.neeeex.eraser.m0.a("6iVSO1E/ig==\n", "iEw8XzhR7cs=\n"));
                m1Var = null;
            }
            m1Var.f85586h.setVisibility(8);
            return;
        }
        if (m1Var == null) {
            p003kotlin.jvm.internal.v.n(com.neeeex.eraser.m0.a("jvvHbEjxMQ==\n", "7JKpCCGfVo8=\n"));
            m1Var = null;
        }
        m1Var.f85586h.setVisibility(0);
        m1 m1Var3 = this.binding;
        if (m1Var3 == null) {
            p003kotlin.jvm.internal.v.n(com.neeeex.eraser.m0.a("Q8Bb7BtJqQ==\n", "Iak1iHInzns=\n"));
        } else {
            m1Var2 = m1Var3;
        }
        FrameLayout frameLayout = m1Var2.f85586h;
        com.neeeex.eraser.m0.a("C5xb2l8SvWEYkFH8Tz22RRk=\n", "ffUpryxc2AQ=\n");
        frameLayout.getClass();
        BaseAdActivity.showRenderAdAndRefresh$default(this, frameLayout, R$layout.ad_neeeex_native_white, com.neeeex.eraser.m0.a("CfPbeP4haaID8OF+9zxXvDjl3Xz1\n", "Z5a+HZtZNtI=\n"), null, 8, null);
    }

    public final void H0() {
        kotlinx.coroutines.k.d(LifecycleOwnerKt.getLifecycleScope(this), null, null, new d(null), 3, null);
    }

    public final void I0(List threats) {
        if (this.resultOpened || isFinishing()) {
            return;
        }
        this.resultOpened = true;
        mi.a.f88870a.B1();
        com.neeeex.eraser.ads.e.b0().z0();
        Intent intent = new Intent(this, (Class<?>) VirusResultNEEEEXActivity.class);
        intent.putParcelableArrayListExtra(com.neeeex.eraser.m0.a("WsWkCoIg11pJybMHrgvRTUnNogw=\n", "LKzWf/F/uT8=\n"), new ArrayList<>(threats));
        startActivity(intent);
        if (com.neeeex.eraser.module.report.bytedance.a.k()) {
            BaseAdActivity.showInter$default(this, com.neeeex.eraser.m0.a("YZLylEiXCIxrkciSQYo2klCE9JBDsDKSa6jxgg==\n", "D/eX8S3vV/w=\n"), null, 2, null);
        }
        finish();
    }

    public final void J0(c0 state) {
        boolean z10 = state.g() > 0;
        int color = l2.a.getColor(this, z10 ? R$color.virus_neeeex_scan_risk : R$color.virus_neeeex_scan_safe);
        m1 m1Var = this.binding;
        m1 m1Var2 = null;
        if (m1Var == null) {
            p003kotlin.jvm.internal.v.n(com.neeeex.eraser.m0.a("MzKkbZ0kxQ==\n", "UVvKCfRKoqA=\n"));
            m1Var = null;
        }
        m1Var.getRoot().setBackgroundColor(color);
        getWindow().setNavigationBarColor(0);
        m1 m1Var3 = this.binding;
        if (m1Var3 == null) {
            p003kotlin.jvm.internal.v.n(com.neeeex.eraser.m0.a("IfOxjaazlw==\n", "Q5rf6c/d8BA=\n"));
            m1Var3 = null;
        }
        m1Var3.f85584f.setProgressDrawable(l2.a.getDrawable(this, z10 ? R$drawable.virus_neeeex_progress_risk : R$drawable.virus_neeeex_progress));
        m1 m1Var4 = this.binding;
        if (m1Var4 == null) {
            p003kotlin.jvm.internal.v.n(com.neeeex.eraser.m0.a("A6zi2cfUMw==\n", "YcWMva66VMI=\n"));
            m1Var4 = null;
        }
        m1Var4.f85584f.setProgress(state.f());
        m1 m1Var5 = this.binding;
        if (m1Var5 == null) {
            p003kotlin.jvm.internal.v.n(com.neeeex.eraser.m0.a("DSj4filNcQ==\n", "b0GWGkAjFhY=\n"));
            m1Var5 = null;
        }
        TextView textView = m1Var5.f85583e;
        textView.setVisibility(state.f() > 0 ? 0 : 8);
        textView.setText(getString(R$string.virus_neeeex_scan_percentage, new Object[]{Integer.valueOf(state.f())}));
        m1 m1Var6 = this.binding;
        if (m1Var6 == null) {
            p003kotlin.jvm.internal.v.n(com.neeeex.eraser.m0.a("WlL84R0rDg==\n", "ODuShXRFaVc=\n"));
            m1Var6 = null;
        }
        TextView textView2 = m1Var6.f85582d;
        if (p003kotlin.text.k0.r0(state.c())) {
            this.renderedCurrentApp = "";
            textView2.setVisibility(4);
        } else if (!p003kotlin.jvm.internal.v.c(state.c(), this.renderedCurrentApp)) {
            this.renderedCurrentApp = state.c();
            textView2.animate().cancel();
            textView2.setText(state.c());
            textView2.setVisibility(0);
            textView2.setAlpha(0.0f);
            textView2.setTranslationY(textView2.getResources().getDisplayMetrics().density * 6.0f);
            textView2.animate().alpha(1.0f).translationY(0.0f).setDuration(160L).start();
        }
        m1 m1Var7 = this.binding;
        if (m1Var7 == null) {
            p003kotlin.jvm.internal.v.n(com.neeeex.eraser.m0.a("npOgQcjmOg==\n", "/PrOJaGIXck=\n"));
        } else {
            m1Var2 = m1Var7;
        }
        TextView textView3 = m1Var2.f85585g;
        textView3.setVisibility(z10 ? 0 : 8);
        textView3.setText(textView3.getResources().getQuantityString(R$plurals.virus_neeeex_risk_count, state.g(), Integer.valueOf(state.g())));
        int i10 = b.f66637a[state.e().ordinal()];
        if (i10 == 1) {
            this.errorDialogVisible = false;
            return;
        }
        if (i10 == 2) {
            K0(state.d());
            return;
        }
        if (i10 == 3) {
            I0(state.h());
        } else {
            if (i10 == 4 || i10 == 5) {
                return;
            }
            coil.util.j.a();
        }
    }

    public final void K0(String detail) {
        if (this.errorDialogVisible || isFinishing()) {
            return;
        }
        this.errorDialogVisible = true;
        if (p003kotlin.text.k0.r0(detail)) {
            detail = null;
        }
        if (detail == null) {
            detail = getString(R$string.virus_neeeex_scan_error_message);
            com.neeeex.eraser.m0.a("TTLJg0fpBFFNf5P+HbI=\n", "Kle90DObbT8=\n");
            detail.getClass();
        }
        com.neeeex.virus.e eVar = com.neeeex.virus.e.f66670a;
        String string = getString(R$string.virus_neeeex_scan_error_title);
        com.neeeex.eraser.m0.a("T5hK0Hb90TNP1RCtLKY=\n", "KP0+gwKPuF0=\n");
        string.getClass();
        String string2 = getString(R$string.virus_neeeex_retry);
        com.neeeex.eraser.m0.a("nyzpz9EuKs6fYbOyi3U=\n", "+EmdnKVcQ6A=\n");
        string2.getClass();
        final Dialog dialogD = eVar.d(this, string, detail, string2, new Function0() { // from class: com.neeeex.virus.w
            @Override // p003kotlin.jvm.functions.Function0
            public final Object invoke() {
                return VirusScanNEEEEXActivity.u0(this.f66721a);
            }
        });
        dialogD.findViewById(R$id.virus_neeeex_confirmation_cancel).setOnClickListener(new View.OnClickListener() { // from class: com.neeeex.virus.x
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                VirusScanNEEEEXActivity.t0(dialogD, this, view);
            }
        });
        dialogD.setOnCancelListener(new DialogInterface.OnCancelListener() { // from class: com.neeeex.virus.y
            @Override // android.content.DialogInterface.OnCancelListener
            public final void onCancel(DialogInterface dialogInterface) {
                VirusScanNEEEEXActivity.v0(this.f66724a, dialogInterface);
            }
        });
    }

    @Override // com.neeeex.eraser.base.RootActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        m1 m1VarC = m1.c(getLayoutInflater());
        com.neeeex.eraser.m0.a("1VfJNlgDKTaSF4Fz\n", "vDmvWjl3TB4=\n");
        m1VarC.getClass();
        this.binding = m1VarC;
        m1 m1Var = null;
        if (m1VarC == null) {
            p003kotlin.jvm.internal.v.n(com.neeeex.eraser.m0.a("6VHH3RTymQ==\n", "izipuX2c/v4=\n"));
            m1VarC = null;
        }
        setContentView(m1VarC.getRoot());
        Window window = getWindow();
        m1 m1Var2 = this.binding;
        if (m1Var2 == null) {
            p003kotlin.jvm.internal.v.n(com.neeeex.eraser.m0.a("hqVAR4UKIQ==\n", "5MwuI+xkRhw=\n"));
        } else {
            m1Var = m1Var2;
        }
        d1 d1Var = new d1(window, m1Var.getRoot());
        d1Var.d(true);
        d1Var.c(true);
        B0();
        C0();
        H0();
        G0();
        if (savedInstanceState == null && ((c0) E0().j().getValue()).e() == b0.IDLE) {
            mi.a.f88870a.C1();
            E0().o();
        }
    }
}