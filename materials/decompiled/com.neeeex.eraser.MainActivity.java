package com.neeeex.eraser;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.p002lifecycle.Lifecycle;
import androidx.p002lifecycle.LifecycleOwnerKt;
import androidx.p002lifecycle.RepeatOnLifecycleKt;
import com.airbnb.lottie.LottieAnimationView;
import com.mbridge.msdk.foundation.download.core.DownloadCommon;
import com.neeeex.ctools.features.appmanager.AppManagerNEEEEXActivity;
import com.neeeex.ctools.features.device.DeviceStatusNEEEEXActivity;
import com.neeeex.ctools.features.loading.CtoolsLoadingNEEEEXActivity;
import com.neeeex.ctools.features.networkspeed.NetworkSpeedNEEEEXActivity;
import com.neeeex.ctools.features.permission.UsagePermissionActivity;
import com.neeeex.eraser.base.BaseAdActivity;
import com.neeeex.eraser.base.BaseStoragePermActivity;
import com.neeeex.eraser.launcher.DesktopNavigator;
import com.neeeex.eraser.launcher.ToolModuleUsageTracker;
import com.neeeex.eraser.module.dialog.ExitQuitDialog;
import com.neeeex.eraser.module.dialog.FilePermDialog;
import com.neeeex.eraser.module.dialog.NotifyDialog;
import com.neeeex.eraser.module.main.CapacityNEEEEXActivity;
import com.neeeex.eraser.module.main.SettingNEEEEXActivity;
import com.neeeex.eraser.push.service.NEEEEXFGService;
import com.neeeex.eraser.recover.reco.f.FileScanNEEEEXActivity;
import com.neeeex.eraser.recover.reco.p.PhotoFullPreviewNEEEEXActivity;
import com.neeeex.eraser.recover.reco.p.PhotoScanNEEEEXActivity;
import com.neeeex.eraser.recover.reco.v.VideoScanNEEEEXActivity;
import com.neeeex.eraser.recover.recod.RecoveredNEEEEXActivity;
import com.neeeex.virus.VirusScanNEEEEXActivity;
import gq.v0;
import java.util.Map;
import kotlinx.coroutines.p0;
import p003kotlin.Metadata;
import p003kotlin.jvm.functions.Function0;
import p003kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000¦\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0007\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010$\n\u0002\u0010\b\n\u0002\b\b\u0018\u0000 f2\u00020\u0001:\u0003gKhB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0005\u0010\u0003J\u0017\u0010\b\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\f\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000e\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u000e\u0010\u0003J\u001b\u0010\u0012\u001a\u0004\u0018\u00010\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fH\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0014\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0014\u0010\u0003J+\u0010\u001a\u001a\u00020\u00042\u0006\u0010\u0016\u001a\u00020\u00152\u0012\u0010\u0019\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00180\u0017\"\u00020\u0018H\u0002¢\u0006\u0004\b\u001a\u0010\u001bJ\u0017\u0010\u001c\u001a\u00020\u00042\u0006\u0010\u0016\u001a\u00020\u0015H\u0002¢\u0006\u0004\b\u001c\u0010\u001dJ\u000f\u0010\u001e\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u001e\u0010\u0003J\u000f\u0010\u001f\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u001f\u0010\u0003J\u001f\u0010$\u001a\u00020\u00042\u0006\u0010!\u001a\u00020 2\u0006\u0010#\u001a\u00020\"H\u0002¢\u0006\u0004\b$\u0010%J\u0017\u0010&\u001a\u00020\u00042\u0006\u0010!\u001a\u00020 H\u0002¢\u0006\u0004\b&\u0010'J\u000f\u0010(\u001a\u00020\u0004H\u0002¢\u0006\u0004\b(\u0010\u0003J'\u0010-\u001a\u00020\u00042\u0006\u0010*\u001a\u00020)2\u0006\u0010+\u001a\u00020)2\u0006\u0010,\u001a\u00020)H\u0002¢\u0006\u0004\b-\u0010.J\u000f\u0010/\u001a\u00020\u0004H\u0002¢\u0006\u0004\b/\u0010\u0003J\u000f\u00100\u001a\u00020\u0004H\u0002¢\u0006\u0004\b0\u0010\u0003J7\u00106\u001a\u00020\u00042\u0006\u00102\u001a\u0002012\u001e\u00105\u001a\u001a\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u000204\u0012\u0004\u0012\u00020\u000403\u0012\u0004\u0012\u00020\u000403H\u0002¢\u0006\u0004\b6\u00107J\u000f\u00108\u001a\u00020\u0004H\u0002¢\u0006\u0004\b8\u0010\u0003J\u000f\u00109\u001a\u00020\u0004H\u0002¢\u0006\u0004\b9\u0010\u0003J\u000f\u0010:\u001a\u00020\u0004H\u0002¢\u0006\u0004\b:\u0010\u0003J\u000f\u0010;\u001a\u00020\u0004H\u0002¢\u0006\u0004\b;\u0010\u0003J\u000f\u0010<\u001a\u00020\u0004H\u0002¢\u0006\u0004\b<\u0010\u0003J\u0017\u0010?\u001a\u00020\u00042\u0006\u0010>\u001a\u00020=H\u0002¢\u0006\u0004\b?\u0010@J\u000f\u0010A\u001a\u00020\u0004H\u0016¢\u0006\u0004\bA\u0010\u0003J\u000f\u0010B\u001a\u00020\u0004H\u0014¢\u0006\u0004\bB\u0010\u0003J\u0019\u0010E\u001a\u00020\u00042\b\u0010D\u001a\u0004\u0018\u00010CH\u0014¢\u0006\u0004\bE\u0010FJ\u0017\u0010H\u001a\u00020\u00042\u0006\u0010G\u001a\u00020\nH\u0014¢\u0006\u0004\bH\u0010\rJ\u000f\u0010I\u001a\u00020\u0004H\u0016¢\u0006\u0004\bI\u0010\u0003R\u0016\u0010M\u001a\u00020J8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\bK\u0010LR\u001b\u0010S\u001a\u00020N8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bO\u0010P\u001a\u0004\bQ\u0010RR\u001b\u0010X\u001a\u00020T8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bU\u0010P\u001a\u0004\bV\u0010WR\u0016\u0010\\\u001a\u00020Y8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bZ\u0010[R\u0016\u0010_\u001a\u0002048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b]\u0010^R'\u0010e\u001a\u000e\u0012\u0004\u0012\u00020a\u0012\u0004\u0012\u00020\u00150`8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bb\u0010P\u001a\u0004\bc\u0010d¨\u0006i"}, d2 = {"Lcom/neeeex/eraser/MainActivity;", "Lcom/neeeex/eraser/base/BaseStoragePermActivity;", "<init>", "()V", "Lfl/m0;", "k1", "Landroid/content/Context;", "ctx", "n1", "(Landroid/content/Context;)V", "Landroid/content/Intent;", "incomingIntent", "m1", "(Landroid/content/Intent;)V", "z1", "", "rawUri", "Landroid/net/Uri;", "u1", "(Ljava/lang/String;)Landroid/net/Uri;", "d1", "Lcom/neeeex/eraser/MainActivity$b;", "action", "", "Landroid/view/View;", "targets", "Z0", "(Lcom/neeeex/eraser/MainActivity$b;[Landroid/view/View;)V", "e1", "(Lcom/neeeex/eraser/MainActivity$b;)V", "p1", "w1", "Lei/b;", "target", "Lcom/neeeex/ctools/features/loading/a;", "loadingTarget", "s1", "(Lei/b;Lcom/neeeex/ctools/features/loading/a;)V", "A1", "(Lei/b;)V", "v1", "", "photoRatio", "videoRatio", "otherRatio", "Y0", "(FFF)V", "h1", "b1", "Lvi/h;", "permissionLauncher", "Lkotlin/Function1;", "", "openSettings", "o1", "(Lvi/h;Lkotlin/jvm/functions/Function1;)V", "q1", "x1", "r1", "y1", "t1", "Lcom/neeeex/similar3p/y;", "type", "C1", "(Lcom/neeeex/similar3p/y;)V", "onStoragePermission", "onResume", "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "(Landroid/os/Bundle;)V", "intent", "onNewIntent", "onBackPressed", "Lji/a;", "c", "Lji/a;", "binding", "Lyh/a;", "d", "Lfl/n;", "g1", "()Lyh/a;", "usagePermissionManager", "Lcom/neeeex/ctools/features/network/realtime/b;", "e", "f1", "()Lcom/neeeex/ctools/features/network/realtime/b;", "homeTrafficRateMonitor", "Lcom/neeeex/ctools/features/network/realtime/h;", "f", "Lcom/neeeex/ctools/features/network/realtime/h;", "latestHomeTrafficRates", "g", "Z", "showingDownloadRate", "", "", "h", "T", "()Ljava/util/Map;", "notificationActions", "i", DownloadCommon.DOWNLOAD_REPORT_FIND_FILE_RESULT_VALUE_B, "a", "tool-feature_productionRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class MainActivity extends BaseStoragePermActivity {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static c f64846j = c.a.f64866a;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    public ji.a binding;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    public final fl.n usagePermissionManager = fl.o.b(new Function0() { // from class: com.neeeex.eraser.i
        @Override // p003kotlin.jvm.functions.Function0
        public final Object invoke() {
            return MainActivity.M0(this.f65081a);
        }
    });

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    public final fl.n homeTrafficRateMonitor = fl.o.b(new Function0() { // from class: com.neeeex.eraser.j
        @Override // p003kotlin.jvm.functions.Function0
        public final Object invoke() {
            return MainActivity.O0();
        }
    });

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    public com.neeeex.ctools.features.network.realtime.h latestHomeTrafficRates = com.neeeex.ctools.features.network.realtime.h.f64432c.a();

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    public boolean showingDownloadRate = true;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    public final fl.n notificationActions = fl.o.a(fl.q.NONE, new Function0() { // from class: com.neeeex.eraser.k
        @Override // p003kotlin.jvm.functions.Function0
        public final Object invoke() {
            return MainActivity.I0();
        }
    });

    public static final /* synthetic */ class d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f64869a;

        static {
            int[] iArr = new int[ei.b.values().length];
            try {
                iArr[ei.b.RECENT_APPS.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ei.b.NETWORK_TRAFFIC.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f64869a = iArr;
        }
    }

    public static final class e implements vi.h.a {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Function1 f64871b;

        public e(Function1 function1) {
            this.f64871b = function1;
        }

        public static fl.m0 a(MainActivity mainActivity, boolean z10) {
            if (z10) {
                mainActivity.q1();
            }
            return fl.m0.f80959a;
        }

        @Override // vi.h.a
        public void on13Permission(boolean z10, boolean z11) {
        }

        @Override // vi.h.a
        public void onGranted(boolean z10) {
            if (z10) {
                MainActivity.this.q1();
                return;
            }
            com.neeeex.eraser.ads.e.b0().R0();
            Function1 function1 = this.f64871b;
            final MainActivity mainActivity = MainActivity.this;
            function1.invoke(new Function1() { // from class: com.neeeex.eraser.m
                @Override // p003kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return MainActivity.e.a(mainActivity, ((Boolean) obj).booleanValue());
                }
            });
        }
    }

    public static final class f extends ll.m implements tl.n {
        int label;

        public static final class a extends ll.m implements tl.n {
            private /* synthetic */ Object L$0;
            int label;
            final /* synthetic */ MainActivity this$0;

            /* JADX INFO: renamed from: com.neeeex.eraser.MainActivity$f$a$a, reason: collision with other inner class name */
            public static final class C0773a extends ll.m implements tl.n {
                int label;
                final /* synthetic */ MainActivity this$0;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public C0773a(MainActivity mainActivity, kl.f<? super C0773a> fVar) {
                    super(2, fVar);
                    this.this$0 = mainActivity;
                }

                public static fl.m0 b(MainActivity mainActivity, com.neeeex.ctools.features.network.realtime.h hVar) {
                    mainActivity.latestHomeTrafficRates = hVar;
                    mainActivity.w1();
                    mainActivity.showingDownloadRate = !mainActivity.showingDownloadRate;
                    return fl.m0.f80959a;
                }

                @Override // ll.a
                public final kl.f<fl.m0> create(Object obj, kl.f<?> fVar) {
                    return new C0773a(this.this$0, fVar);
                }

                @Override // tl.n
                public final Object invoke(p0 p0Var, kl.f<? super fl.m0> fVar) {
                    return ((C0773a) create(p0Var, fVar)).invokeSuspend(fl.m0.f80959a);
                }

                @Override // ll.a
                public final Object invokeSuspend(Object obj) {
                    Object objF = p003kotlin.coroutines.intrinsics.c.f();
                    int i10 = this.label;
                    if (i10 == 0) {
                        fl.v.b(obj);
                        com.neeeex.ctools.features.network.realtime.b bVarF1 = this.this$0.f1();
                        final MainActivity mainActivity = this.this$0;
                        Function1 function1 = new Function1() { // from class: com.neeeex.eraser.n
                            @Override // p003kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj2) {
                                return MainActivity.f.a.C0773a.b(mainActivity, (com.neeeex.ctools.features.network.realtime.h) obj2);
                            }
                        };
                        this.label = 1;
                        if (bVarF1.a(function1, this) == objF) {
                            return objF;
                        }
                    } else {
                        if (i10 != 1) {
                            v0.a(m0.a("S7vZMiYtBL0PqNAtczQOugi40DhpKw69D7PbKGkyDroIrdwqbnkI8lq1wCpvNw4=\n", "KNq1XgZZa50=\n"));
                            return null;
                        }
                        fl.v.b(obj);
                    }
                    return fl.m0.f80959a;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(MainActivity mainActivity, kl.f<? super a> fVar) {
                super(2, fVar);
                this.this$0 = mainActivity;
            }

            @Override // ll.a
            public final kl.f<fl.m0> create(Object obj, kl.f<?> fVar) {
                a aVar = new a(this.this$0, fVar);
                aVar.L$0 = obj;
                return aVar;
            }

            @Override // tl.n
            public final Object invoke(p0 p0Var, kl.f<? super fl.m0> fVar) {
                return ((a) create(p0Var, fVar)).invokeSuspend(fl.m0.f80959a);
            }

            @Override // ll.a
            public final Object invokeSuspend(Object obj) {
                p0 p0Var = (p0) this.L$0;
                p003kotlin.coroutines.intrinsics.c.f();
                if (this.label != 0) {
                    v0.a(m0.a("dO6YkeKoj38w/ZGOt7GFeDftkZutroV/MOaai623hXg3+J2JqvyDMGXggYmrsoU=\n", "F4/0/cLc4F8=\n"));
                    return null;
                }
                fl.v.b(obj);
                this.this$0.latestHomeTrafficRates = com.neeeex.ctools.features.network.realtime.h.f64432c.a();
                this.this$0.showingDownloadRate = true;
                this.this$0.w1();
                kotlinx.coroutines.k.d(p0Var, null, null, new C0773a(this.this$0, null), 3, null);
                return fl.m0.f80959a;
            }
        }

        public f(kl.f<? super f> fVar) {
            super(2, fVar);
        }

        @Override // ll.a
        public final kl.f<fl.m0> create(Object obj, kl.f<?> fVar) {
            return MainActivity.this.new f(fVar);
        }

        @Override // tl.n
        public final Object invoke(p0 p0Var, kl.f<? super fl.m0> fVar) {
            return ((f) create(p0Var, fVar)).invokeSuspend(fl.m0.f80959a);
        }

        @Override // ll.a
        public final Object invokeSuspend(Object obj) {
            Object objF = p003kotlin.coroutines.intrinsics.c.f();
            int i10 = this.label;
            if (i10 == 0) {
                fl.v.b(obj);
                MainActivity mainActivity = MainActivity.this;
                Lifecycle.State state = Lifecycle.State.STARTED;
                a aVar = new a(mainActivity, null);
                this.label = 1;
                if (RepeatOnLifecycleKt.repeatOnLifecycle(mainActivity, state, aVar, this) == objF) {
                    return objF;
                }
            } else {
                if (i10 != 1) {
                    v0.a(m0.a("8nQ6hsYfoPK2ZzOZkwaq9bF3M4yJGarytnw4nIkAqvWxYj+ejkusveN6I56PBao=\n", "kRVW6uZrz9I=\n"));
                    return null;
                }
                fl.v.b(obj);
            }
            return fl.m0.f80959a;
        }
    }

    public static final class g extends b.k0 {
        public g() {
            super(true);
        }

        @Override // b.k0
        public void handleOnBackPressed() {
            MainActivity.this.k1();
        }
    }

    public static final void B1(FilePermDialog filePermDialog, MainActivity mainActivity, ei.b bVar) {
        filePermDialog.startActivity(UsagePermissionActivity.INSTANCE.a(mainActivity, bVar));
    }

    public static Map I0() {
        return gl.v0.n(fl.z.a(1, b.e.f64857a), fl.z.a(2, b.k.f64864a), fl.z.a(3, b.c.f64855a), fl.z.a(4, b.f.f64858a), fl.z.a(5, new b.g(com.neeeex.similar3p.y.SIMILAR_IMAGES)), fl.z.a(6, new b.g(com.neeeex.similar3p.y.LARGE_MEDIA)), fl.z.a(7, new b.g(com.neeeex.similar3p.y.DUPLICATE_MEDIA)), fl.z.a(8, new b.g(com.neeeex.similar3p.y.LARGE_DOCS)), fl.z.a(9, new b.g(com.neeeex.similar3p.y.DUPLICATE_DOCS)), fl.z.a(10, b.C0771b.f64854a), fl.z.a(11, new b.g(com.neeeex.similar3p.y.JUNK_FILES)), fl.z.a(12, new b.g(com.neeeex.similar3p.y.SCREEN_CAPTURE_FILES)), fl.z.a(13, new b.j(ei.b.RECENT_APPS, com.neeeex.ctools.features.loading.a.RECENT_APPS)), fl.z.a(14, new b.j(ei.b.NETWORK_TRAFFIC, com.neeeex.ctools.features.loading.a.NETWORK_TRAFFIC)), fl.z.a(15, b.d.f64856a), fl.z.a(16, b.l.f64865a));
    }

    public static void J0(MainActivity mainActivity) {
        if (mainActivity.checkStoragePermission(mainActivity)) {
            mainActivity.t1();
        } else {
            f64846j = c.C0772c.f64868a;
            BaseStoragePermActivity.askPermission$default(mainActivity, null, 1, null);
        }
    }

    public static yh.a M0(MainActivity mainActivity) {
        return new yh.a(mainActivity);
    }

    public static com.neeeex.ctools.features.network.realtime.b O0() {
        return new com.neeeex.ctools.features.network.realtime.b(null, null, null, 7, null);
    }

    public static void Q0(MainActivity mainActivity, vi.h hVar, final vi.l lVar, View view) {
        mainActivity.o1(hVar, new Function1() { // from class: com.neeeex.eraser.c
            @Override // p003kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return MainActivity.c1(lVar, (Function1) obj);
            }
        });
    }

    public static final void a1(MainActivity mainActivity, b bVar, View view) {
        mainActivity.e1(bVar);
    }

    public static final fl.m0 c1(vi.l lVar, Function1 function1) {
        m0.a("QmrgX6uQzaE=\n", "IQuMM8nxrso=\n");
        function1.getClass();
        lVar.f(function1);
        return fl.m0.f80959a;
    }

    public static final void i1(MainActivity mainActivity, vi.h hVar, final vi.l lVar) {
        mainActivity.o1(hVar, new Function1() { // from class: com.neeeex.eraser.l
            @Override // p003kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return MainActivity.j1(lVar, (Function1) obj);
            }
        });
    }

    public static final fl.m0 j1(vi.l lVar, Function1 function1) {
        m0.a("sMLxc35dkdY=\n", "06OdHxw88r0=\n");
        function1.getClass();
        lVar.f(function1);
        return fl.m0.f80959a;
    }

    public static final void l1(MainActivity mainActivity) {
        MainActivity mainActivity2;
        if (mainActivity.isTaskRoot()) {
            mainActivity2 = mainActivity;
            DesktopNavigator.openDesktop$default(DesktopNavigator.INSTANCE, mainActivity2, false, false, 4, null);
        } else {
            mainActivity2 = mainActivity;
        }
        mainActivity2.finish();
        mainActivity2.overridePendingTransition(0, 0);
    }

    public final void A1(final ei.b target) {
        fl.t tVarA;
        int i10 = d.f64869a[target.ordinal()];
        if (i10 == 1) {
            tVarA = fl.z.a(Integer.valueOf(R$string.ctools_neeeex_recent_apps_permission_title), Integer.valueOf(R$string.ctools_neeeex_recent_apps_permission_body));
        } else {
            if (i10 != 2) {
                coil.util.j.a();
                return;
            }
            tVarA = fl.z.a(Integer.valueOf(R$string.ctools_neeeex_network_traffic_permission_title), Integer.valueOf(R$string.ctools_neeeex_network_traffic_permission_body));
        }
        final FilePermDialog filePermDialogA = FilePermDialog.INSTANCE.a(((Number) tVarA.getFirst()).intValue(), ((Number) tVarA.getSecond()).intValue(), R$string.dialog_neeeex_file_perm_agree);
        filePermDialogA.q(new ki.a() { // from class: com.neeeex.eraser.h
            @Override // ki.a
            public final void a() {
                MainActivity.B1(filePermDialogA, this, target);
            }
        });
        androidx.fragment.app.l0 supportFragmentManager = getSupportFragmentManager();
        m0.a("Jlnic2kgudYzSNBSfTek3C9I20FyMa7cMxS4DjJ5\n", "QTyWIBxQybk=\n");
        supportFragmentManager.getClass();
        filePermDialogA.i(supportFragmentManager);
    }

    public final void C1(com.neeeex.similar3p.y type) {
        f64846j = c.a.f64866a;
        com.neeeex.eraser.module.main.k.f65361a.a(this, type);
    }

    public final Map T() {
        return (Map) this.notificationActions.getValue();
    }

    public final void Y0(float photoRatio, float videoRatio, float otherRatio) {
        ji.a aVar = this.binding;
        ji.a aVar2 = null;
        if (aVar == null) {
            p003kotlin.jvm.internal.v.n(m0.a("fjasl4c5rA==\n", "HF/C8+5XyxE=\n"));
            aVar = null;
        }
        ViewGroup.LayoutParams layoutParams = aVar.f85302z.f85341b.getLayoutParams();
        m0.a("14m6xPmFx9bXk6KIu4OG29iPooitiYbW1pL7xqyKypjNhabN+YfI3MuTv8yhyMXX14+i2riPyMzV\nna/HrJKIz9CYsc2tyOXX14+i2riPyMz1na/HrJKI9NiFud2ttsfK2JGl\n", "ufzWqNnmprg=\n");
        layoutParams.getClass();
        ConstraintLayout.b bVar = (ConstraintLayout.b) layoutParams;
        bVar.V = otherRatio;
        ji.a aVar3 = this.binding;
        if (aVar3 == null) {
            p003kotlin.jvm.internal.v.n(m0.a("FpofFXQdBw==\n", "dPNxcR1zYDc=\n"));
        } else {
            aVar2 = aVar3;
        }
        aVar2.f85302z.f85341b.setLayoutParams(bVar);
    }

    public final void Z0(final b action, View... targets) {
        for (View view : targets) {
            view.setOnClickListener(new View.OnClickListener() { // from class: com.neeeex.eraser.e
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    MainActivity.a1(this.f65045a, action, view2);
                }
            });
        }
    }

    public final void b1() {
        ji.a aVar = null;
        if (com.neeeex.eraser.module.report.bytedance.a.k()) {
            ui.a aVar2 = ui.a.f100035a;
            if (!aVar2.a(this)) {
                ji.a aVar3 = this.binding;
                if (aVar3 == null) {
                    p003kotlin.jvm.internal.v.n(m0.a("CWCd9NfHaw==\n", "awnzkL6pDNA=\n"));
                    aVar3 = null;
                }
                aVar3.C.setVisibility(0);
                final vi.h hVarD = aVar2.d(this);
                final vi.l lVarE = aVar2.e(this);
                ji.a aVar4 = this.binding;
                if (aVar4 == null) {
                    p003kotlin.jvm.internal.v.n(m0.a("M3bZFGePOQ==\n", "UR+3cA7hXvw=\n"));
                } else {
                    aVar = aVar4;
                }
                aVar.C.setOnClickListener(new View.OnClickListener() { // from class: com.neeeex.eraser.g
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        MainActivity.Q0(this.f65054a, hVarD, lVarE, view);
                    }
                });
                return;
            }
        }
        ji.a aVar5 = this.binding;
        if (aVar5 == null) {
            p003kotlin.jvm.internal.v.n(m0.a("66wAXnJ6Ng==\n", "icVuOhsUUT4=\n"));
        } else {
            aVar = aVar5;
        }
        aVar.C.setVisibility(8);
    }

    public final void d1() {
        b.i iVar = b.i.f64861a;
        ji.a aVar = this.binding;
        ji.a aVar2 = null;
        if (aVar == null) {
            p003kotlin.jvm.internal.v.n(m0.a("guLLGkRr7Q==\n", "4Iulfi0Fis4=\n"));
            aVar = null;
        }
        AppCompatImageView appCompatImageView = aVar.f85301y;
        m0.a("AJmn0l+5Ts86ip3DU7JM\n", "ae/ptzrcK7c=\n");
        appCompatImageView.getClass();
        Z0(iVar, appCompatImageView);
        b.C0771b c0771b = b.C0771b.f64854a;
        ji.a aVar3 = this.binding;
        if (aVar3 == null) {
            p003kotlin.jvm.internal.v.n(m0.a("QnBpg5/pLw==\n", "IBkH5/aHSFM=\n"));
            aVar3 = null;
        }
        FrameLayout frameLayout = aVar3.A;
        m0.a("OKDfuaQg7RgXreG9oiz8GQ==\n", "VMyR3MFFiGA=\n");
        frameLayout.getClass();
        Z0(c0771b, frameLayout);
        b.g gVar = new b.g(com.neeeex.similar3p.y.JUNK_FILES);
        ji.a aVar4 = this.binding;
        if (aVar4 == null) {
            p003kotlin.jvm.internal.v.n(m0.a("gUTC1AcehA==\n", "4y2ssG5w4yE=\n"));
            aVar4 = null;
        }
        LottieAnimationView lottieAnimationView = aVar4.D;
        m0.a("BIdnFgiN7VENjXYaLInKWiuEdgMP\n", "aOgTYmHoozQ=\n");
        lottieAnimationView.getClass();
        ji.a aVar5 = this.binding;
        if (aVar5 == null) {
            p003kotlin.jvm.internal.v.n(m0.a("7kVFC0U55A==\n", "jCwrbyxXgzw=\n"));
            aVar5 = null;
        }
        FrameLayout frameLayout2 = aVar5.f85278b;
        m0.a("oQUTpBf6qsm7MhGPE/GF2a0a\n", "w3F96nKfz6w=\n");
        frameLayout2.getClass();
        ji.a aVar6 = this.binding;
        if (aVar6 == null) {
            p003kotlin.jvm.internal.v.n(m0.a("R04yugwaIw==\n", "JSdc3mV0RCI=\n"));
            aVar6 = null;
        }
        LinearLayout linearLayout = aVar6.f85283g;
        m0.a("rViVRgVyArarQa1XJXwhuqJclA==\n", "zjnnIksXZ9M=\n");
        linearLayout.getClass();
        Z0(gVar, lottieAnimationView, frameLayout2, linearLayout);
        b.l lVar = b.l.f64865a;
        ji.a aVar7 = this.binding;
        if (aVar7 == null) {
            p003kotlin.jvm.internal.v.n(m0.a("Aw9dDpgUpQ==\n", "YWYzavF6wrc=\n"));
            aVar7 = null;
        }
        FrameLayout frameLayout3 = aVar7.f85298v;
        m0.a("ugMo5dWXY5C8Ggzo6Yd1proDNA==\n", "2WJagZvyBvU=\n");
        frameLayout3.getClass();
        Z0(lVar, frameLayout3);
        b.e eVar = b.e.f64857a;
        ji.a aVar8 = this.binding;
        if (aVar8 == null) {
            p003kotlin.jvm.internal.v.n(m0.a("EmorUk//fQ==\n", "cANFNiaRGqs=\n"));
            aVar8 = null;
        }
        FrameLayout frameLayout4 = aVar8.f85293q;
        m0.a("fFbNE1QWycp6T+0SeRzaym1n1xhuHN/pelbLAmgW\n", "Hze/dxpzrK8=\n");
        frameLayout4.getClass();
        ji.a aVar9 = this.binding;
        if (aVar9 == null) {
            p003kotlin.jvm.internal.v.n(m0.a("vCwIfFR6gw==\n", "3kVmGD0U5HE=\n"));
            aVar9 = null;
        }
        LinearLayout linearLayout2 = aVar9.f85291o;
        m0.a("g3IBuSDhV+aFayO1AfBd8A==\n", "4BNz3W6EMoM=\n");
        linearLayout2.getClass();
        Z0(eVar, frameLayout4, linearLayout2);
        b.k kVar = b.k.f64864a;
        ji.a aVar10 = this.binding;
        if (aVar10 == null) {
            p003kotlin.jvm.internal.v.n(m0.a("1PKa1wwo1w==\n", "tpv0s2VGsJ0=\n"));
            aVar10 = null;
        }
        LinearLayout linearLayout3 = aVar10.f85297u;
        m0.a("xLb9MLevX5PCr9k9na9VhQ==\n", "p9ePVPnKOvY=\n");
        linearLayout3.getClass();
        Z0(kVar, linearLayout3);
        b.c cVar = b.c.f64855a;
        ji.a aVar11 = this.binding;
        if (aVar11 == null) {
            p003kotlin.jvm.internal.v.n(m0.a("0v2IzIhOBw==\n", "sJTmqOEgYEQ=\n"));
            aVar11 = null;
        }
        LinearLayout linearLayout4 = aVar11.f85289m;
        m0.a("L9N2c4dxttYpyktjoXGh9SXeYWQ=\n", "TLIEF8kU07M=\n");
        linearLayout4.getClass();
        Z0(cVar, linearLayout4);
        b.f fVar = b.f.f64858a;
        ji.a aVar12 = this.binding;
        if (aVar12 == null) {
            p003kotlin.jvm.internal.v.n(m0.a("FAB7qUaa9Q==\n", "dmkVzS/0kok=\n"));
            aVar12 = null;
        }
        LinearLayout linearLayout5 = aVar12.f85294r;
        m0.a("A37FU3hgFlMFZ+VSVWoFUxJ60w==\n", "YB+3NzYFczY=\n");
        linearLayout5.getClass();
        Z0(fVar, linearLayout5);
        b.g gVar2 = new b.g(com.neeeex.similar3p.y.SCREEN_CAPTURE_FILES);
        ji.a aVar13 = this.binding;
        if (aVar13 == null) {
            p003kotlin.jvm.internal.v.n(m0.a("kK8DtkKhJA==\n", "8sZt0ivPQ2s=\n"));
            aVar13 = null;
        }
        LinearLayout linearLayout6 = aVar13.f85295s;
        m0.a("wZ5bm2E28n3Hh3qcXTbydtGXRotc\n", "ov8p/y9Tlxg=\n");
        linearLayout6.getClass();
        Z0(gVar2, linearLayout6);
        b.g gVar3 = new b.g(com.neeeex.similar3p.y.SIMILAR_IMAGES);
        ji.a aVar14 = this.binding;
        if (aVar14 == null) {
            p003kotlin.jvm.internal.v.n(m0.a("2zN9EvCUtg==\n", "uVoTdpn60ZE=\n"));
            aVar14 = null;
        }
        LinearLayout linearLayout7 = aVar14.f85296t;
        m0.a("Qju4zB+jz7xEIpnBPK/GuFM=\n", "IVrKqFHGqtk=\n");
        linearLayout7.getClass();
        Z0(gVar3, linearLayout7);
        b.g gVar4 = new b.g(com.neeeex.similar3p.y.LARGE_MEDIA);
        ji.a aVar15 = this.binding;
        if (aVar15 == null) {
            p003kotlin.jvm.internal.v.n(m0.a("VG+KgzRtLA==\n", "Ngbk510DS6I=\n"));
            aVar15 = null;
        }
        LinearLayout linearLayout8 = aVar15.f85285i;
        m0.a("IG6PaP+4emomd7Ftw7p6QiZrlG0=\n", "Qw/9DLHdHw8=\n");
        linearLayout8.getClass();
        Z0(gVar4, linearLayout8);
        b.g gVar5 = new b.g(com.neeeex.similar3p.y.DUPLICATE_MEDIA);
        ji.a aVar16 = this.binding;
        if (aVar16 == null) {
            p003kotlin.jvm.internal.v.n(m0.a("dGvOIAQ8KQ==\n", "FgKgRG1STsY=\n"));
            aVar16 = null;
        }
        LinearLayout linearLayout9 = aVar16.f85282f;
        m0.a("ul9RVW2BXpS8RmdEU4hSkrhKRnxGgFKQ\n", "2T4jMSPkO/E=\n");
        linearLayout9.getClass();
        Z0(gVar5, linearLayout9);
        b.g gVar6 = new b.g(com.neeeex.similar3p.y.LARGE_DOCS);
        ji.a aVar17 = this.binding;
        if (aVar17 == null) {
            p003kotlin.jvm.internal.v.n(m0.a("eoyQ7QfneQ==\n", "GOX+iW6JHvM=\n"));
            aVar17 = null;
        }
        LinearLayout linearLayout10 = aVar17.f85284h;
        m0.a("loEsYeC1goyQmBJk3LeCrZqDLQ==\n", "9eBeBa7Q5+k=\n");
        linearLayout10.getClass();
        Z0(gVar6, linearLayout10);
        b.g gVar7 = new b.g(com.neeeex.similar3p.y.DUPLICATE_DOCS);
        ji.a aVar18 = this.binding;
        if (aVar18 == null) {
            p003kotlin.jvm.internal.v.n(m0.a("hrnE7DmtMw==\n", "5NCqiFDDVMA=\n"));
            aVar18 = null;
        }
        LinearLayout linearLayout11 = aVar18.f85281e;
        m0.a("ugRH5nIAbsm8HXH3TAliz7gRUMZTBng=\n", "2WU1gjxlC6w=\n");
        linearLayout11.getClass();
        Z0(gVar7, linearLayout11);
        b.d dVar = b.d.f64856a;
        ji.a aVar19 = this.binding;
        if (aVar19 == null) {
            p003kotlin.jvm.internal.v.n(m0.a("gV/TokgFUg==\n", "4za9xiFrNQw=\n"));
            aVar19 = null;
        }
        LinearLayout linearLayout12 = aVar19.f85290n;
        m0.a("NIplnEFSwroyk0eQYEPInDiGZ4pqRNSwJQ==\n", "V+sX+A83p98=\n");
        linearLayout12.getClass();
        Z0(dVar, linearLayout12);
        b.j jVar = new b.j(ei.b.RECENT_APPS, com.neeeex.ctools.features.loading.a.RECENT_APPS);
        ji.a aVar20 = this.binding;
        if (aVar20 == null) {
            p003kotlin.jvm.internal.v.n(m0.a("zC9q2vDovg==\n", "rkYEvpmG2Tg=\n"));
            aVar20 = null;
        }
        FrameLayout frameLayout5 = aVar20.f85292p;
        m0.a("K9UkAYXuVyktzAQAqO5cOAnEJhY=\n", "SLRWZcuLMkw=\n");
        frameLayout5.getClass();
        Z0(jVar, frameLayout5);
        b.j jVar2 = new b.j(ei.b.NETWORK_TRAFFIC, com.neeeex.ctools.features.loading.a.NETWORK_TRAFFIC);
        ji.a aVar21 = this.binding;
        if (aVar21 == null) {
            p003kotlin.jvm.internal.v.n(m0.a("qBQtq9KmAA==\n", "yn1Dz7vIZwM=\n"));
            aVar21 = null;
        }
        FrameLayout frameLayout6 = aVar21.f85288l;
        m0.a("Yq9Qd31BVbVktmx2R1NfomqaUHJVQlmz\n", "Ac4iEzMkMNA=\n");
        frameLayout6.getClass();
        Z0(jVar2, frameLayout6);
        b.a aVar22 = new b.a(AppManagerNEEEEXActivity.class);
        ji.a aVar23 = this.binding;
        if (aVar23 == null) {
            p003kotlin.jvm.internal.v.n(m0.a("IH/frVHSeQ==\n", "QhaxyTi8HnA=\n"));
            aVar23 = null;
        }
        FrameLayout frameLayout7 = aVar23.f85279c;
        m0.a("7I13Ak0jP9bqlEQWcws73e6LYBQ=\n", "j+wFZgNGWrM=\n");
        frameLayout7.getClass();
        Z0(aVar22, frameLayout7);
        b.a aVar24 = new b.a(DeviceStatusNEEEEXActivity.class);
        ji.a aVar25 = this.binding;
        if (aVar25 == null) {
            p003kotlin.jvm.internal.v.n(m0.a("u5UvYhelhQ==\n", "2fxBBn7L4m8=\n"));
            aVar25 = null;
        }
        FrameLayout frameLayout8 = aVar25.f85280d;
        m0.a("/xm9m0tVt/P5AIuac1mx888MrotwQw==\n", "nHjP/wUw0pY=\n");
        frameLayout8.getClass();
        ji.a aVar26 = this.binding;
        if (aVar26 == null) {
            p003kotlin.jvm.internal.v.n(m0.a("gV8ogtHwqA==\n", "4zZG5riezwI=\n"));
            aVar26 = null;
        }
        LinearLayout linearLayout13 = aVar26.f85286j;
        m0.a("g6tyuYEGVTWFsk2yvQZ0NZajY7icF1Eklbk=\n", "4MoA3c9jMFA=\n");
        linearLayout13.getClass();
        Z0(aVar24, frameLayout8, linearLayout13);
        b.a aVar27 = new b.a(NetworkSpeedNEEEEXActivity.class);
        ji.a aVar28 = this.binding;
        if (aVar28 == null) {
            p003kotlin.jvm.internal.v.n(m0.a("XC88wvdskQ==\n", "PkZSpp4C9u4=\n"));
        } else {
            aVar2 = aVar28;
        }
        LinearLayout linearLayout14 = aVar2.f85287k;
        m0.a("9ilc7EsYQdLwMGDtcQpLxf4bXu1gGQ==\n", "lUguiAV9JLc=\n");
        linearLayout14.getClass();
        Z0(aVar27, linearLayout14);
    }

    public final void e1(b action) {
        if (p003kotlin.jvm.internal.v.c(action, b.i.f64861a)) {
            SettingNEEEEXActivity.INSTANCE.a(this);
            return;
        }
        if (p003kotlin.jvm.internal.v.c(action, b.C0771b.f64854a)) {
            CapacityNEEEEXActivity.INSTANCE.a(this);
            return;
        }
        if (p003kotlin.jvm.internal.v.c(action, b.e.f64857a)) {
            PhotoScanNEEEEXActivity.INSTANCE.a(this);
            return;
        }
        if (p003kotlin.jvm.internal.v.c(action, b.k.f64864a)) {
            VideoScanNEEEEXActivity.INSTANCE.a(this);
            return;
        }
        if (p003kotlin.jvm.internal.v.c(action, b.c.f64855a)) {
            FileScanNEEEEXActivity.INSTANCE.a(this);
            return;
        }
        if (p003kotlin.jvm.internal.v.c(action, b.f.f64858a)) {
            RecoveredNEEEEXActivity.INSTANCE.a(this, 0);
            return;
        }
        if (p003kotlin.jvm.internal.v.c(action, b.d.f64856a)) {
            x1();
            return;
        }
        if (p003kotlin.jvm.internal.v.c(action, b.l.f64865a)) {
            y1();
            return;
        }
        if (action instanceof b.h) {
            PhotoFullPreviewNEEEEXActivity.INSTANCE.a(this, ((b.h) action).a());
            return;
        }
        if (action instanceof b.g) {
            C1(((b.g) action).a());
            return;
        }
        if (action instanceof b.j) {
            b.j jVar = (b.j) action;
            s1(jVar.b(), jVar.a());
        } else if (action instanceof b.a) {
            startActivity(new Intent(this, (Class<?>) ((b.a) action).a()));
        } else {
            coil.util.j.a();
        }
    }

    public final com.neeeex.ctools.features.network.realtime.b f1() {
        return (com.neeeex.ctools.features.network.realtime.b) this.homeTrafficRateMonitor.getValue();
    }

    public final yh.a g1() {
        return (yh.a) this.usagePermissionManager.getValue();
    }

    public final void h1() {
        ui.a aVar = ui.a.f100035a;
        if (aVar.a(this)) {
            return;
        }
        com.neeeex.eraser.push.j jVar = com.neeeex.eraser.push.j.f65526a;
        if (jVar.a()) {
            jVar.c();
            final vi.h hVarD = aVar.d(this);
            final vi.l lVarE = aVar.e(this);
            NotifyDialog notifyDialogA = NotifyDialog.INSTANCE.a();
            notifyDialogA.p(new ki.a() { // from class: com.neeeex.eraser.b
                @Override // ki.a
                public final void a() {
                    MainActivity.i1(this.f64993a, hVarD, lVarE);
                }
            });
            androidx.fragment.app.l0 supportFragmentManager = getSupportFragmentManager();
            m0.a("DxDaVwJC+FUaAeh2FlXlXwYB42UZU+9fGl2AKlkb\n", "aHWuBHcyiDo=\n");
            supportFragmentManager.getClass();
            notifyDialogA.i(supportFragmentManager);
        }
    }

    public final void k1() {
        if (getSupportFragmentManager().T0() || getSupportFragmentManager().k0(m0.a("xleUYcUhf8zNSoVW\n", "iDLsIqlEHqI=\n")) != null) {
            return;
        }
        ExitQuitDialog exitQuitDialogA = ExitQuitDialog.INSTANCE.a();
        exitQuitDialogA.v(new ki.a() { // from class: com.neeeex.eraser.d
            @Override // ki.a
            public final void a() {
                MainActivity.l1(this.f65041a);
            }
        });
        androidx.fragment.app.l0 supportFragmentManager = getSupportFragmentManager();
        m0.a("JpbCQ0F6OBAzh/BiVW0lGi+H+3Faay8aM9uYPhoj\n", "QfO2EDQKSH8=\n");
        supportFragmentManager.getClass();
        exitQuitDialogA.show(supportFragmentManager, m0.a("WpxJXy0nSZ9RgVho\n", "FPkxHEFCKPE=\n"));
    }

    public final void m1(Intent incomingIntent) {
        setIntent(incomingIntent);
        z1();
    }

    public final void n1(Context ctx) {
        com.neeeex.eraser.ads.h.f64923a.c(ctx);
    }

    public final void o1(vi.h permissionLauncher, Function1 openSettings) {
        com.neeeex.eraser.ads.e.b0().R0();
        permissionLauncher.f(new e(openSettings));
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        k1();
    }

    @Override // com.neeeex.eraser.base.RootActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ji.a aVarC = ji.a.c(getLayoutInflater());
        m0.a("VOwrmKV8lnQTrGPd\n", "PYJN9MQI81w=\n");
        aVarC.getClass();
        this.binding = aVarC;
        ji.a aVar = null;
        if (aVarC == null) {
            p003kotlin.jvm.internal.v.n(m0.a("AOMoM3bUnA==\n", "YopGVx+6++Q=\n"));
            aVarC = null;
        }
        setContentView(aVarC.getRoot());
        getOnBackPressedDispatcher().d(this, new g());
        d1();
        p1();
        Intent intent = getIntent();
        m0.a("ohVO4qwdHqmxWBSF7EA=\n", "xXA6q8Jpe8c=\n");
        intent.getClass();
        m1(intent);
        n1(this);
        ji.a aVar2 = this.binding;
        if (aVar2 == null) {
            p003kotlin.jvm.internal.v.n(m0.a("+hyzacqrQQ==\n", "mHXdDaPFJrs=\n"));
        } else {
            aVar = aVar2;
        }
        FrameLayout frameLayout = aVar.f85299w;
        m0.a("Hn1dbPmBycMZeHJtyA==\n", "eBEcCLrup7c=\n");
        frameLayout.getClass();
        BaseAdActivity.showRenderAdAndRefresh$default(this, frameLayout, R$layout.ad_neeeex_native, m0.a("V4RHhzNSy+VWnU8=\n", "H8sKwmwcirE=\n"), null, 8, null);
        h1();
        b1();
    }

    @Override // com.neeeex.eraser.base.BaseStoragePermActivity, com.neeeex.eraser.base.RootActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onNewIntent(Intent intent) {
        m0.a("NMCCxOA4\n", "Xa72oY5MQiU=\n");
        intent.getClass();
        super.onNewIntent(intent);
        m1(intent);
    }

    @Override // com.neeeex.eraser.base.BaseStoragePermActivity, com.neeeex.eraser.base.BaseAdActivity, com.neeeex.eraser.base.RootActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onResume() {
        super.onResume();
        mi.a.f88870a.Y();
        ToolModuleUsageTracker.INSTANCE.reportToolHome(this);
        v1();
    }

    @Override // com.neeeex.eraser.base.BaseStoragePermActivity
    public void onStoragePermission() {
        c cVar = f64846j;
        c.a aVar = c.a.f64866a;
        f64846j = aVar;
        if (p003kotlin.jvm.internal.v.c(cVar, aVar)) {
            return;
        }
        if (p003kotlin.jvm.internal.v.c(cVar, c.b.f64867a)) {
            r1();
        } else if (p003kotlin.jvm.internal.v.c(cVar, c.C0772c.f64868a)) {
            t1();
        } else {
            coil.util.j.a();
        }
    }

    public final void p1() {
        w1();
        kotlinx.coroutines.k.d(LifecycleOwnerKt.getLifecycleScope(this), null, null, new f(null), 3, null);
    }

    public final void q1() {
        NEEEEXFGService.INSTANCE.b(this);
        mi.a.f88870a.g0();
        ji.a aVar = this.binding;
        if (aVar == null) {
            p003kotlin.jvm.internal.v.n(m0.a("YGc/QvX8jQ==\n", "Ag5RJpyS6uA=\n"));
            aVar = null;
        }
        aVar.C.setVisibility(8);
    }

    public final void r1() {
        mi.a.f88870a.J();
        fi.a.f80895a.a(this);
    }

    public final void s1(ei.b target, com.neeeex.ctools.features.loading.a loadingTarget) {
        if (g1().b()) {
            startActivity(CtoolsLoadingNEEEEXActivity.INSTANCE.a(this, loadingTarget));
        } else {
            A1(target);
        }
    }

    public final void t1() {
        f64846j = c.a.f64866a;
        startActivity(new Intent(this, (Class<?>) VirusScanNEEEEXActivity.class));
    }

    public final Uri u1(String rawUri) {
        Uri uri;
        if (rawUri != null) {
            if (p003kotlin.text.k0.r0(rawUri)) {
                rawUri = null;
            }
            if (rawUri != null && (uri = Uri.parse(rawUri)) != null && p003kotlin.jvm.internal.v.c(uri.getScheme(), m0.a("EBodAio7Eg==\n", "c3Vzdk9VZuw=\n")) && p003kotlin.jvm.internal.v.c(uri.getAuthority(), m0.a("S9eihXo=\n", "JrLG7BuTpfQ=\n"))) {
                return uri;
            }
        }
        return null;
    }

    public final void v1() {
        a capacityViewModel = getCapacityViewModel();
        if (capacityViewModel != null) {
            capacityViewModel.d();
        }
        fl.t tVarA = hi.a.f83493a.a();
        if (tVarA == null) {
            tVarA = fl.z.a(0L, 0L);
        }
        long jLongValue = ((Number) tVarA.component1()).longValue();
        long jLongValue2 = ((Number) tVarA.component2()).longValue();
        ji.a aVar = this.binding;
        if (aVar == null) {
            p003kotlin.jvm.internal.v.n(m0.a("rAzSLEGzIA==\n", "zmW8SCjdR08=\n"));
            aVar = null;
        }
        aVar.E.setText(com.neeeex.eraser.utils.d.b(jLongValue, 0, 2, null) + " / " + com.neeeex.eraser.utils.d.b(jLongValue2, 0, 2, null));
        Y0(0.0f, 0.0f, ((float) jLongValue) / ((float) jLongValue2));
    }

    public final void w1() {
        boolean z10 = this.showingDownloadRate;
        com.neeeex.ctools.features.network.realtime.h hVar = this.latestHomeTrafficRates;
        String strA = com.neeeex.ctools.features.network.realtime.f.f64428a.a(z10 ? hVar.c() : hVar.d());
        boolean z11 = this.showingDownloadRate;
        int i10 = z11 ? R$drawable.ic_neeeex_home_traffic_down : R$drawable.ic_neeeex_home_traffic_up;
        String string = getString(z11 ? R$string.ctools_neeeex_home_download_rate_accessibility : R$string.ctools_neeeex_home_upload_rate_accessibility, new Object[]{strA});
        m0.a("nsSp/FtMtLKeifOBARc=\n", "+aHdry8+3dw=\n");
        string.getClass();
        ji.a aVar = this.binding;
        ji.a aVar2 = null;
        if (aVar == null) {
            p003kotlin.jvm.internal.v.n(m0.a("c2AhgiMluQ==\n", "EQlP5kpL3r0=\n"));
            aVar = null;
        }
        aVar.G.setText(strA);
        ji.a aVar3 = this.binding;
        if (aVar3 == null) {
            p003kotlin.jvm.internal.v.n(m0.a("Rkp4K4ANJQ==\n", "JCMWT+ljQjk=\n"));
            aVar3 = null;
        }
        aVar3.G.setCompoundDrawablesRelativeWithIntrinsicBounds(0, 0, i10, 0);
        ji.a aVar4 = this.binding;
        if (aVar4 == null) {
            p003kotlin.jvm.internal.v.n(m0.a("zn7IoVLykA==\n", "rBemxTuc98A=\n"));
        } else {
            aVar2 = aVar4;
        }
        aVar2.G.setContentDescription(string);
    }

    public final void x1() {
        if (checkStoragePermission(this)) {
            f64846j = c.a.f64866a;
            r1();
        } else {
            f64846j = c.b.f64867a;
            BaseStoragePermActivity.askPermission$default(this, null, 1, null);
        }
    }

    public final void y1() {
        f64846j = c.a.f64866a;
        mi.a.f88870a.A1();
        com.neeeex.virus.l.k(this, new Runnable() { // from class: com.neeeex.eraser.f
            @Override // java.lang.Runnable
            public final void run() {
                MainActivity.J0(this.f65050a);
            }
        });
    }

    public final void z1() {
        Bundle bundleExtra;
        com.neeeex.eraser.push.l lVar = com.neeeex.eraser.push.l.f65528a;
        Intent intent = getIntent();
        m0.a("Zj5ivGunZHV1czjbK/o=\n", "AVsW9QXTARs=\n");
        intent.getClass();
        lVar.f(intent);
        if (getIntent().getIntExtra(m0.a("2HL7XA==\n", "vgCUMad8e1A=\n"), 0) == 0 || (bundleExtra = getIntent().getBundleExtra(m0.a("PpyXD0hz\n", "XOn5ayQWmA8=\n"))) == null) {
            return;
        }
        int i10 = bundleExtra.getInt(m0.a("wy5UA/22\n", "ok0gapLYTQU=\n"));
        if (i10 == 17) {
            Uri uriU1 = u1(bundleExtra.getString(m0.a("wEZca0V1ymLcUXt8SQ==\n", "syUuDiAbuQo=\n")));
            if (uriU1 != null) {
                e1(new b.h(uriU1));
                return;
            }
            return;
        }
        b bVar = (b) T().get(Integer.valueOf(i10));
        if (bVar != null) {
            e1(bVar);
        }
    }

    public static abstract class b {

        public static final class a extends b {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final Class f64853a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(Class cls) {
                super(null);
                m0.a("ryddiKf0bjGiLUA=\n", "y0Iu/M6aD0U=\n");
                cls.getClass();
                this.f64853a = cls;
            }

            public final Class a() {
                return this.f64853a;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof a) && p003kotlin.jvm.internal.v.c(this.f64853a, ((a) obj).f64853a);
            }

            public int hashCode() {
                return this.f64853a.hashCode();
            }

            public String toString() {
                return "Activity(destination=" + this.f64853a + ")";
            }
        }

        /* JADX INFO: renamed from: com.neeeex.eraser.MainActivity$b$b, reason: collision with other inner class name */
        public static final class C0771b extends b {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final C0771b f64854a = new C0771b();

            public C0771b() {
                super(null);
            }
        }

        public static final class c extends b {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final c f64855a = new c();

            public c() {
                super(null);
            }
        }

        public static final class d extends b {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final d f64856a = new d();

            public d() {
                super(null);
            }
        }

        public static final class e extends b {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final e f64857a = new e();

            public e() {
                super(null);
            }
        }

        public static final class f extends b {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final f f64858a = new f();

            public f() {
                super(null);
            }
        }

        public static final class g extends b {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final com.neeeex.similar3p.y f64859a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public g(com.neeeex.similar3p.y yVar) {
                super(null);
                m0.a("GWVD0g==\n", "bRwzt0R0t3I=\n");
                yVar.getClass();
                this.f64859a = yVar;
            }

            public final com.neeeex.similar3p.y a() {
                return this.f64859a;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof g) && this.f64859a == ((g) obj).f64859a;
            }

            public int hashCode() {
                return this.f64859a.hashCode();
            }

            public String toString() {
                return "Scan(type=" + this.f64859a + ")";
            }
        }

        public static final class h extends b {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final Uri f64860a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public h(Uri uri) {
                super(null);
                m0.a("2ZN0\n", "rOEdiTcB0GQ=\n");
                uri.getClass();
                this.f64860a = uri;
            }

            public final Uri a() {
                return this.f64860a;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof h) && p003kotlin.jvm.internal.v.c(this.f64860a, ((h) obj).f64860a);
            }

            public int hashCode() {
                return this.f64860a.hashCode();
            }

            public String toString() {
                return "Screenshot(uri=" + this.f64860a + ")";
            }
        }

        public static final class i extends b {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final i f64861a = new i();

            public i() {
                super(null);
            }
        }

        public static final class j extends b {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final ei.b f64862a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final com.neeeex.ctools.features.loading.a f64863b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public j(ei.b bVar, com.neeeex.ctools.features.loading.a aVar) {
                super(null);
                m0.a("bxrMuiZdahpwEeq2PUl8Bw==\n", "H3++108uGXM=\n");
                bVar.getClass();
                m0.a("Xs0mKMvvqIpT0CAp1g==\n", "MqJHTKKBz94=\n");
                aVar.getClass();
                this.f64862a = bVar;
                this.f64863b = aVar;
            }

            public final com.neeeex.ctools.features.loading.a a() {
                return this.f64863b;
            }

            public final ei.b b() {
                return this.f64862a;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof j)) {
                    return false;
                }
                j jVar = (j) obj;
                return this.f64862a == jVar.f64862a && this.f64863b == jVar.f64863b;
            }

            public int hashCode() {
                return (this.f64862a.hashCode() * 31) + this.f64863b.hashCode();
            }

            public String toString() {
                return "Usage(permissionTarget=" + this.f64862a + ", loadingTarget=" + this.f64863b + ")";
            }
        }

        public static final class k extends b {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final k f64864a = new k();

            public k() {
                super(null);
            }
        }

        public static final class l extends b {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final l f64865a = new l();

            public l() {
                super(null);
            }
        }

        public /* synthetic */ b(p003kotlin.jvm.internal.m mVar) {
            this();
        }

        public b() {
        }
    }

    public static abstract class c {

        public static final class a extends c {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final a f64866a = new a();

            public a() {
                super(null);
            }
        }

        public static final class b extends c {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final b f64867a = new b();

            public b() {
                super(null);
            }
        }

        /* JADX INFO: renamed from: com.neeeex.eraser.MainActivity$c$c, reason: collision with other inner class name */
        public static final class C0772c extends c {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final C0772c f64868a = new C0772c();

            public C0772c() {
                super(null);
            }
        }

        public /* synthetic */ c(p003kotlin.jvm.internal.m mVar) {
            this();
        }

        public c() {
        }
    }
}