package com.neeeex.eraser;

import android.app.Application;
import android.content.Context;
import android.content.res.Resources;
import android.webkit.WebView;
import androidx.p002lifecycle.ViewModelStore;
import androidx.p002lifecycle.ViewModelStoreOwner;
import com.bytedance.sdk.openadsdk.api.init.PAGSdk;
import com.google.android.gms.ads.identifier.AdvertisingIdClient;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.messaging.FirebaseMessaging;
import com.neeeex.eraser.launcher.NewUserDesktopFunnelTracker;
import com.neeeex.eraser.push.NotifyListener;
import com.neeeex.eraser.push.service.EmptyWorker;
import gq.v0;
import java.util.ArrayDeque;
import java.util.Locale;
import java.util.concurrent.TimeUnit;
import kotlinx.coroutines.f1;
import kotlinx.coroutines.l2;
import kotlinx.coroutines.p0;
import kotlinx.coroutines.q0;
import kotlinx.coroutines.x2;

/* JADX INFO: loaded from: classes7.dex */
public abstract class y extends Application implements ViewModelStoreOwner {
    private static final long FIRST_WORK_DELAY_MINUTES = 15;
    private static Context appContext;
    private ViewModelStore applicationViewModels;
    private boolean isToolRuntimeInitialized;
    private boolean isToolStartupInProgress;
    private boolean reportingInitialized;
    private boolean startupInitialized;
    private String toolStartupActivityClass;
    private int toolStartupTaskId = -1;
    private boolean workManagerUnavailable;
    private static final String PERIODIC_WORK_NAME = "sync_periodic" /* decoded XOR */;
    private static final String PUSH_TOKEN_KEY = "push_token" /* decoded XOR */;
    private static final String SYSTEM_LANGUAGE = "system" /* decoded XOR */;
    public static final a Companion = new a(null);
    private static final p0 mainScope = q0.a(f1.c().plus(x2.b(null, 1, null)));
    private static final p0 ioScope = q0.a(f1.b().plus(x2.b(null, 1, null)));
    private static String gaid = "";

    public interface b {
        void execute();
    }

    public static final class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final ArrayDeque f66208a = new ArrayDeque();

        public final void a() {
            while (!this.f66208a.isEmpty()) {
                ((b) this.f66208a.removeFirst()).execute();
            }
        }

        public final c b(b bVar) {
            "operation" /* decoded XOR */;
            bVar.getClass();
            this.f66208a.addLast(bVar);
            return this;
        }
    }

    public static final class d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f66209a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f66210b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final String f66211c;

        public d(String str, String str2, String str3) {
            "token" /* decoded XOR */;
            str.getClass();
            "language" /* decoded XOR */;
            str2.getClass();
            "version" /* decoded XOR */;
            str3.getClass();
            this.f66209a = str;
            this.f66210b = str2;
            this.f66211c = str3;
        }

        public final String a() {
            return this.f66210b;
        }

        public final String b() {
            return this.f66209a;
        }

        public final String c() {
            return this.f66211c;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof d)) {
                return false;
            }
            d dVar = (d) obj;
            return p003kotlin.jvm.internal.v.c(this.f66209a, dVar.f66209a) && p003kotlin.jvm.internal.v.c(this.f66210b, dVar.f66210b) && p003kotlin.jvm.internal.v.c(this.f66211c, dVar.f66211c);
        }

        public int hashCode() {
            return (((this.f66209a.hashCode() * 31) + this.f66210b.hashCode()) * 31) + this.f66211c.hashCode();
        }

        public String toString() {
            return "TokenRegistration(token=" + this.f66209a + ", language=" + this.f66210b + ", version=" + this.f66211c + ")";
        }
    }

    public static final class e extends ll.m implements tl.n {
        int label;

        public static final class a extends ll.m implements tl.n {
            int label;
            final /* synthetic */ y this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(y yVar, kl.f<? super a> fVar) {
                super(2, fVar);
                this.this$0 = yVar;
            }

            @Override // ll.a
            public final kl.f<fl.m0> create(Object obj, kl.f<?> fVar) {
                return new a(this.this$0, fVar);
            }

            @Override // tl.n
            public final Object invoke(p0 p0Var, kl.f<? super fl.m0> fVar) {
                return ((a) create(p0Var, fVar)).invokeSuspend(fl.m0.f80959a);
            }

            @Override // ll.a
            public final Object invokeSuspend(Object obj) {
                p003kotlin.coroutines.intrinsics.c.f();
                if (this.label != 0) {
                    v0.a("call to 'resume' before 'invoke' with coroutine" /* decoded XOR */);
                    return null;
                }
                fl.v.b(obj);
                this.this$0.v();
                return fl.m0.f80959a;
            }
        }

        public e(kl.f<? super e> fVar) {
            super(2, fVar);
        }

        @Override // ll.a
        public final kl.f<fl.m0> create(Object obj, kl.f<?> fVar) {
            return y.this.new e(fVar);
        }

        @Override // tl.n
        public final Object invoke(p0 p0Var, kl.f<? super fl.m0> fVar) {
            return ((e) create(p0Var, fVar)).invokeSuspend(fl.m0.f80959a);
        }

        @Override // ll.a
        public final Object invokeSuspend(Object obj) {
            Object objF = p003kotlin.coroutines.intrinsics.c.f();
            int i10 = this.label;
            if (i10 == 0) {
                fl.v.b(obj);
                y.Companion.d(y.this.o());
                l2 l2VarC = f1.c();
                a aVar = new a(y.this, null);
                this.label = 1;
                if (kotlinx.coroutines.i.g(l2VarC, aVar, this) == objF) {
                    return objF;
                }
            } else {
                if (i10 != 1) {
                    v0.a("call to 'resume' before 'invoke' with coroutine" /* decoded XOR */);
                    return null;
                }
                fl.v.b(obj);
            }
            return fl.m0.f80959a;
        }
    }

    public static void a(y yVar) {
        yVar.l();
    }

    public static void b() {
        ni.i.f89495a.G();
    }

    public static void c(y yVar) {
        yVar.k();
    }

    public static void d() {
        com.neeeex.eraser.utils.b0.f66131a.y();
    }

    public static void e(y yVar) {
        yVar.p();
    }

    public static void f(y yVar, Task task) {
        String str;
        "result" /* decoded XOR */;
        task.getClass();
        if (!task.isSuccessful()) {
            task = null;
        }
        if (task == null || (str = (String) task.getResult()) == null) {
            return;
        }
        String str2 = str.length() > 0 ? str : null;
        if (str2 != null) {
            yVar.u(yVar.z(str2));
        }
    }

    public static void g(y yVar) {
        yVar.r();
    }

    public static void h(y yVar) {
        yVar.q();
    }

    public static void i(y yVar) {
        com.neeeex.eraser.ads.e.b0().B0(yVar);
    }

    public static void j(y yVar) {
        yVar.t();
    }

    public final synchronized void ensureReportingInitialized() {
        if (this.reportingInitialized) {
            return;
        }
        com.neeeex.eraser.utils.b0.f66131a.y();
        ni.a.a(this);
        com.neeeex.eraser.module.report.bytedance.a.i(this, "20017632" /* decoded XOR */);
        this.reportingInitialized = true;
    }

    public final synchronized boolean ensureWorkManagerInitialized() {
        try {
            androidx.work.p0.a aVar = androidx.work.p0.f34351a;
            boolean z10 = true;
            if (aVar.c()) {
                return true;
            }
            if (this.workManagerUnavailable) {
                return false;
            }
            try {
                aVar.b(this, new androidx.work.c.a().a());
            } catch (LinkageError unused) {
                this.workManagerUnavailable = true;
                "NexCleanStartup" /* decoded XOR */;
                "OEM WorkManager framework unavailable" /* decoded XOR */;
                z10 = false;
            }
            return z10;
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public final String getToolStartupActivityClass() {
        return this.toolStartupActivityClass;
    }

    public final int getToolStartupTaskId() {
        return this.toolStartupTaskId;
    }

    @Override // androidx.p002lifecycle.ViewModelStoreOwner
    public ViewModelStore getViewModelStore() {
        ViewModelStore viewModelStore = this.applicationViewModels;
        if (viewModelStore != null) {
            return viewModelStore;
        }
        p003kotlin.jvm.internal.v.n("applicationViewModels" /* decoded XOR */);
        return null;
    }

    public final boolean isToolRuntimeInitialized() {
        return this.isToolRuntimeInitialized;
    }

    public final boolean isToolStartupInProgress() {
        return this.isToolStartupInProgress;
    }

    public final void k() {
        kotlinx.coroutines.k.d(ioScope, null, null, new e(null), 3, null);
    }

    public final void l() {
        NotifyListener.f65464a.i(this);
        com.neeeex.eraser.utils.j.f66185a.f(this);
    }

    public final void m() {
        try {
            fl.u.a aVar = fl.u.Companion;
            new WebView(this).destroy();
            fl.u.m372constructorimpl(fl.m0.f80959a);
        } catch (Throwable th2) {
            fl.u.a aVar2 = fl.u.Companion;
            fl.u.m372constructorimpl(fl.v.a(th2));
        }
    }

    public final void markToolRuntimeInitialized() {
        this.isToolRuntimeInitialized = true;
    }

    public final void markToolStartupFinished() {
        this.isToolStartupInProgress = false;
        this.toolStartupActivityClass = null;
        this.toolStartupTaskId = -1;
    }

    public final void markToolStartupStarted(String str, int i10) {
        "activityClass" /* decoded XOR */;
        str.getClass();
        this.isToolStartupInProgress = true;
        this.toolStartupActivityClass = str;
        this.toolStartupTaskId = i10;
    }

    public final synchronized void n() {
        if (this.startupInitialized) {
            return;
        }
        x().a();
        this.startupInitialized = true;
    }

    public final String o() {
        Object objM372constructorimpl;
        String strA = com.neeeex.eraser.utils.e.f66147a.a();
        if (strA.length() > 0) {
            return strA;
        }
        try {
            fl.u.a aVar = fl.u.Companion;
            AdvertisingIdClient.Info advertisingIdInfo = AdvertisingIdClient.getAdvertisingIdInfo(this);
            objM372constructorimpl = fl.u.m372constructorimpl(advertisingIdInfo != null ? advertisingIdInfo.getId() : null);
        } catch (Throwable th2) {
            fl.u.a aVar2 = fl.u.Companion;
            objM372constructorimpl = fl.u.m372constructorimpl(fl.v.a(th2));
        }
        String str = (String) (fl.u.m377isFailureimpl(objM372constructorimpl) ? null : objM372constructorimpl);
        if (str == null) {
            str = "";
        }
        if (str.length() > 0) {
            com.neeeex.eraser.utils.e.f66147a.b(str);
        }
        return str;
    }

    @Override // android.app.Application
    public void onCreate() {
        super.onCreate();
        appContext = getApplicationContext();
        com.neeeex.eraser.utils.e0.f66149c.a(this);
        m();
        this.applicationViewModels = new ViewModelStore();
        n();
    }

    public abstract void onHomeSignalReceived();

    public final void p() {
        PAGSdk.closeMultiWebViewFileLock();
        ij.a.h(this);
    }

    public final void q() {
        ensureReportingInitialized();
        com.neeeex.eraser.module.report.bytedance.a.j(this, "4b0595899d047fff" /* decoded XOR */);
        ni.c.f89480a.c(this);
    }

    public final void r() {
        long jS = s();
        TimeUnit timeUnit = TimeUnit.MINUTES;
        androidx.work.h0 h0Var = (androidx.work.h0) ((androidx.work.h0.a) new androidx.work.h0.a(EmptyWorker.class, jS, timeUnit).k(FIRST_WORK_DELAY_MINUTES, timeUnit)).b();
        if (ensureWorkManagerInitialized()) {
            androidx.work.p0.f34351a.a(this).d(PERIODIC_WORK_NAME, androidx.work.j.KEEP, h0Var);
        }
    }

    public final long s() {
        if (com.neeeex.eraser.utils.c0.f66142a.e()) {
            return 20L;
        }
        return FIRST_WORK_DELAY_MINUTES;
    }

    public final void t() {
        com.neeeex.eraser.utils.b0 b0Var = com.neeeex.eraser.utils.b0.f66131a;
        Long lValueOf = Long.valueOf(b0Var.v("sp_neeeex_first_start_time" /* decoded XOR */, 0L));
        if (lValueOf.longValue() != 0) {
            lValueOf = null;
        }
        if (lValueOf != null) {
            NewUserDesktopFunnelTracker.INSTANCE.start();
            b0Var.z("neeeex_first_report_pending" /* decoded XOR */, true);
            b0Var.z("neeeex_required_startup_done" /* decoded XOR */, false);
            b0Var.C("sp_neeeex_first_start_time" /* decoded XOR */, System.currentTimeMillis());
        }
    }

    public final void u(d dVar) {
        com.neeeex.eraser.utils.b0.f66131a.D(PUSH_TOKEN_KEY, dVar.b());
        new li.a().h(this, dVar.b(), dVar.a(), dVar.c());
    }

    public final void v() {
        FirebaseMessaging firebaseMessagingN = FirebaseMessaging.n();
        "getInstance(...)" /* decoded XOR */;
        firebaseMessagingN.getClass();
        firebaseMessagingN.y(true);
        firebaseMessagingN.q().addOnCompleteListener(new OnCompleteListener() { // from class: com.neeeex.eraser.o
            @Override // com.google.android.gms.tasks.OnCompleteListener
            public final void onComplete(Task task) {
                y.f(this.f65462a, task);
            }
        });
    }

    public final String w() {
        String strA = com.neeeex.eraser.utils.f.f66153a.a();
        if (p003kotlin.jvm.internal.v.c(strA, SYSTEM_LANGUAGE)) {
            strA = null;
        }
        if (strA != null) {
            return strA;
        }
        String language = y().getLanguage();
        "getLanguage(...)" /* decoded XOR */;
        language.getClass();
        return language;
    }

    public final c x() {
        return new c().b(new b() { // from class: com.neeeex.eraser.p
            @Override // com.neeeex.eraser.y.b
            public final void execute() {
                y.e(this.f65463a);
            }
        }).b(new b() { // from class: com.neeeex.eraser.q
            @Override // com.neeeex.eraser.y.b
            public final void execute() {
                y.i(this.f65558a);
            }
        }).b(new b() { // from class: com.neeeex.eraser.r
            @Override // com.neeeex.eraser.y.b
            public final void execute() {
                y.d();
            }
        }).b(new b() { // from class: com.neeeex.eraser.s
            @Override // com.neeeex.eraser.y.b
            public final void execute() {
                y.h(this.f66123a);
            }
        }).b(new b() { // from class: com.neeeex.eraser.t
            @Override // com.neeeex.eraser.y.b
            public final void execute() {
                y.b();
            }
        }).b(new b() { // from class: com.neeeex.eraser.u
            @Override // com.neeeex.eraser.y.b
            public final void execute() {
                y.c(this.f66124a);
            }
        }).b(new b() { // from class: com.neeeex.eraser.v
            @Override // com.neeeex.eraser.y.b
            public final void execute() {
                y.g(this.f66205a);
            }
        }).b(new b() { // from class: com.neeeex.eraser.w
            @Override // com.neeeex.eraser.y.b
            public final void execute() {
                y.j(this.f66206a);
            }
        }).b(new b() { // from class: com.neeeex.eraser.x
            @Override // com.neeeex.eraser.y.b
            public final void execute() {
                y.a(this.f66207a);
            }
        });
    }

    public final Locale y() {
        Locale locale = Resources.getSystem().getConfiguration().getLocales().get(0);
        "get(...)" /* decoded XOR */;
        locale.getClass();
        return locale;
    }

    public final d z(String str) {
        return new d(str, w(), "1.3.5" /* decoded XOR */);
    }

    public static final class a {
        public /* synthetic */ a(p003kotlin.jvm.internal.m mVar) {
            this();
        }

        public final Context a() {
            return y.appContext;
        }

        public final String b() {
            return y.gaid;
        }

        public final p0 c() {
            return y.ioScope;
        }

        public final void d(String str) {
            "<set-?>" /* decoded XOR */;
            str.getClass();
            y.gaid = str;
        }

        public a() {
        }
    }
}