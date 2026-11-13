package com.neeeex.eraser.base;

import android.app.Application;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.p002lifecycle.ViewModelProvider;
import androidx.p002lifecycle.ViewModelStoreOwner;
import b.w;
import com.neeeex.eraser.MainActivity;
import com.neeeex.eraser.h0;
import com.neeeex.eraser.launcher.DefaultHomeStatusTracker;
import com.neeeex.eraser.launcher.StartupStateStore;
import com.neeeex.eraser.module.main.SplashNEEEEXActivity;
import com.neeeex.eraser.y;
import com.thinkup.core.n.d0;
import com.varbto.utils.api.UtilConst;
import fl.m0;
import fl.q;
import fl.z;
import gl.v0;
import java.util.Map;
import p003kotlin.Metadata;
import p003kotlin.jvm.functions.Function0;
import p003kotlin.jvm.functions.Function1;
import p003kotlin.jvm.internal.v;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u000b\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0016\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0014¢\u0006\u0004\b\u0007\u0010\bJ\u0019\u0010\u000b\u001a\u00020\u00062\b\u0010\n\u001a\u0004\u0018\u00010\tH\u0014¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\r\u001a\u00020\u0006H\u0014¢\u0006\u0004\b\r\u0010\u0003J\u0019\u0010\u000e\u001a\u00020\u00062\b\u0010\n\u001a\u0004\u0018\u00010\tH\u0014¢\u0006\u0004\b\u000e\u0010\fJ\u0017\u0010\u0011\u001a\u00020\u00062\u0006\u0010\u0010\u001a\u00020\u000fH\u0014¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0013\u001a\u00020\u0006H\u0014¢\u0006\u0004\b\u0013\u0010\u0003J\u000f\u0010\u0015\u001a\u0004\u0018\u00010\u0014¢\u0006\u0004\b\u0015\u0010\u0016J\u000f\u0010\u0018\u001a\u0004\u0018\u00010\u0017¢\u0006\u0004\b\u0018\u0010\u0019J\u000f\u0010\u001a\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u001a\u0010\u0003J\u0017\u0010\u001c\u001a\u00020\u00062\u0006\u0010\u001b\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u001c\u0010\u0012J\u001f\u0010 \u001a\u00020\u00062\u0006\u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u001f\u001a\u00020\u001dH\u0002¢\u0006\u0004\b \u0010!J\u001f\u0010%\u001a\u00020\u00062\u0006\u0010#\u001a\u00020\"2\u0006\u0010$\u001a\u00020\"H\u0002¢\u0006\u0004\b%\u0010&J\u000f\u0010'\u001a\u00020\u0006H\u0002¢\u0006\u0004\b'\u0010\u0003J\u001f\u0010(\u001a\u00020\u00062\u0006\u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u001f\u001a\u00020\u001dH\u0002¢\u0006\u0004\b(\u0010!J\u001f\u0010)\u001a\u00020\u00062\u0006\u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u001f\u001a\u00020\u001dH\u0002¢\u0006\u0004\b)\u0010!R\u0018\u0010*\u001a\u0004\u0018\u00010\u00148\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b*\u0010+R\u0018\u0010,\u001a\u0004\u0018\u00010\u00178\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b,\u0010-R3\u00104\u001a\u001a\u0012\u0004\u0012\u00020\u001d\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u001d\u0012\u0004\u0012\u00020\u00060/0.8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b0\u00101\u001a\u0004\b2\u00103¨\u00065"}, d2 = {"Lcom/neeeex/eraser/base/RootActivity;", "Landroidx/appcompat/app/AppCompatActivity;", "<init>", "()V", "Landroid/content/Context;", "base", "Lfl/m0;", "attachBaseContext", "(Landroid/content/Context;)V", "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "(Landroid/os/Bundle;)V", "onResume", "onPostCreate", "Landroid/content/Intent;", "intent", "onNewIntent", "(Landroid/content/Intent;)V", "onDestroy", "Lcom/neeeex/eraser/h0;", "getMyViewModel", "()Lcom/neeeex/eraser/h0;", "Lcom/neeeex/eraser/a;", "getCapacityViewModel", "()Lcom/neeeex/eraser/a;", "U", "incoming", d0.f73503d0, "", "scene", "source", "R", "(II)V", "", "click", "fullscreen", "g0", "(ZZ)V", UtilConst.CRASH_CAT_S, "e0", "f0", "sharedViewModel", "Lcom/neeeex/eraser/h0;", "capacityViewModel", "Lcom/neeeex/eraser/a;", "", "Lkotlin/Function1;", "notificationActions$delegate", "Lfl/n;", "T", "()Ljava/util/Map;", "notificationActions", "tool-feature_productionRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public class RootActivity extends AppCompatActivity {
    private com.neeeex.eraser.a capacityViewModel;

    /* JADX INFO: renamed from: notificationActions$delegate, reason: from kotlin metadata */
    private final fl.n notificationActions = fl.o.a(q.NONE, new Function0() { // from class: com.neeeex.eraser.base.g
        @Override // p003kotlin.jvm.functions.Function0
        public final Object invoke() {
            return RootActivity.Q(this.f65027a);
        }
    });
    private h0 sharedViewModel;

    public static Map Q(final RootActivity rootActivity) {
        return v0.n(z.a(10, new Function1() { // from class: com.neeeex.eraser.base.h
            @Override // p003kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return RootActivity.V(this.f65028a, ((Integer) obj).intValue());
            }
        }), z.a(11, new Function1() { // from class: com.neeeex.eraser.base.i
            @Override // p003kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return RootActivity.W(this.f65029a, ((Integer) obj).intValue());
            }
        }), z.a(12, new Function1() { // from class: com.neeeex.eraser.base.j
            @Override // p003kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return RootActivity.X(this.f65030a, ((Integer) obj).intValue());
            }
        }), z.a(20, new Function1() { // from class: com.neeeex.eraser.base.k
            @Override // p003kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return RootActivity.Y(this.f65031a, ((Integer) obj).intValue());
            }
        }), z.a(21, new Function1() { // from class: com.neeeex.eraser.base.l
            @Override // p003kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return RootActivity.Z(this.f65032a, ((Integer) obj).intValue());
            }
        }), z.a(30, new Function1() { // from class: com.neeeex.eraser.base.m
            @Override // p003kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return RootActivity.a0(this.f65033a, ((Integer) obj).intValue());
            }
        }), z.a(31, new Function1() { // from class: com.neeeex.eraser.base.n
            @Override // p003kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return RootActivity.b0(this.f65034a, ((Integer) obj).intValue());
            }
        }), z.a(32, new Function1() { // from class: com.neeeex.eraser.base.o
            @Override // p003kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return RootActivity.c0(this.f65035a, ((Integer) obj).intValue());
            }
        }));
    }

    private final Map T() {
        return (Map) this.notificationActions.getValue();
    }

    public static final m0 V(RootActivity rootActivity, int i10) {
        if (!(rootActivity instanceof MainActivity)) {
            rootActivity.R(i10, 10);
        }
        return m0.f80959a;
    }

    public static final m0 W(RootActivity rootActivity, int i10) {
        com.neeeex.eraser.ads.e.L = true;
        rootActivity.e0(i10, 11);
        rootActivity.S();
        return m0.f80959a;
    }

    public static final m0 X(RootActivity rootActivity, int i10) {
        rootActivity.g0(false, true);
        rootActivity.e0(i10, 12);
        rootActivity.S();
        return m0.f80959a;
    }

    public static final m0 Y(RootActivity rootActivity, int i10) {
        rootActivity.R(i10, 20);
        return m0.f80959a;
    }

    public static final m0 Z(RootActivity rootActivity, int i10) {
        com.neeeex.eraser.ads.e.b0().R0();
        com.neeeex.eraser.push.c.f65487a.i();
        rootActivity.e0(i10, 21);
        return m0.f80959a;
    }

    public static final m0 a0(RootActivity rootActivity, int i10) {
        com.neeeex.eraser.push.c.f65487a.f();
        rootActivity.f0(i10, 30);
        return m0.f80959a;
    }

    public static final m0 b0(RootActivity rootActivity, int i10) {
        com.neeeex.eraser.push.c.f65487a.h();
        rootActivity.f0(i10, 31);
        return m0.f80959a;
    }

    public static final m0 c0(RootActivity rootActivity, int i10) {
        com.neeeex.eraser.push.c.f65487a.g();
        rootActivity.f0(i10, 32);
        return m0.f80959a;
    }

    public final void R(int scene, int source) {
        com.neeeex.eraser.ads.e.b0().R0();
        e0(scene, source);
    }

    public final void S() {
        if (this instanceof SplashNEEEEXActivity) {
            SplashNEEEEXActivity splashNEEEEXActivity = (SplashNEEEEXActivity) this;
            if (splashNEEEEXActivity.G0()) {
                splashNEEEEXActivity.E0();
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public final void U() {
        Application application = getApplication();
        if (application instanceof y) {
            ViewModelProvider viewModelProvider = new ViewModelProvider((ViewModelStoreOwner) application, ViewModelProvider.AndroidViewModelFactory.INSTANCE.getInstance(application));
            this.sharedViewModel = (h0) viewModelProvider.get(h0.class);
            this.capacityViewModel = (com.neeeex.eraser.a) viewModelProvider.get(com.neeeex.eraser.a.class);
        }
    }

    @Override // androidx.appcompat.app.AppCompatActivity, android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    public void attachBaseContext(Context base) {
        com.neeeex.eraser.m0.a("r5Oicg==\n", "zfLRF82OUM8=\n");
        base.getClass();
        super.attachBaseContext(com.neeeex.eraser.utils.g.b(base));
    }

    public final void d0(Intent incoming) {
        Bundle bundleExtra;
        int intExtra = incoming.getIntExtra(com.neeeex.eraser.m0.a("9c+3xA==\n", "k73YqaAqCeM=\n"), 0);
        if (intExtra == 0 || (bundleExtra = incoming.getBundleExtra(com.neeeex.eraser.m0.a("Z6wC+1PM\n", "Bdlsnz+p0s8=\n"))) == null) {
            return;
        }
        int i10 = bundleExtra.getInt(com.neeeex.eraser.m0.a("WtTYjrSElA==\n", "Kbe94NHN8Bw=\n"));
        Function1 function1 = (Function1) T().get(Integer.valueOf(intExtra));
        if (function1 != null) {
            function1.invoke(Integer.valueOf(i10));
        }
    }

    public final void e0(int scene, int source) {
        mi.a.f88870a.l0(scene, source);
    }

    public final void f0(int scene, int source) {
        if (this instanceof MainActivity) {
            return;
        }
        e0(scene, source);
    }

    public final void g0(boolean click, boolean fullscreen) {
        com.neeeex.eraser.ads.e.K = click;
        com.neeeex.eraser.ads.e.L = fullscreen;
    }

    public final com.neeeex.eraser.a getCapacityViewModel() {
        return this.capacityViewModel;
    }

    /* JADX INFO: renamed from: getMyViewModel, reason: from getter */
    public final h0 getSharedViewModel() {
        return this.sharedViewModel;
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        StartupStateStore startupStateStore = StartupStateStore.INSTANCE;
        String name = getClass().getName();
        com.neeeex.eraser.m0.a("tNFVeZD1IBL9mg8e\n", "07QhN/GYRTo=\n");
        if (startupStateStore.isStartupPage(name)) {
            Application application = getApplication();
            com.neeeex.eraser.m0.a("Mviy/JX0CNoy4qqw1/JJ1z3+qrDB+EnaM+Pz/sD7BZQo9K71lfQG2XLju/XQ8hGaOf+/49DlR/kl\nzK7g2f4K1Sjksf4=\n", "XI3ekLWXabQ=\n");
            application.getClass();
            String name2 = getClass().getName();
            com.neeeex.eraser.m0.a("cgXnQW1Juq47Tr0m\n", "FWCTDwwk34Y=\n");
            ((y) application).markToolStartupStarted(name2, getTaskId());
        }
        w.b(this, null, null, 3, null);
        U();
        Intent intent = getIntent();
        if (intent != null) {
            d0(intent);
        }
    }

    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        Application application = getApplication();
        y yVar = application instanceof y ? (y) application : null;
        if (isFinishing()) {
            if (v.c(yVar != null ? yVar.getToolStartupActivityClass() : null, getClass().getName()) && yVar.getToolStartupTaskId() == getTaskId()) {
                yVar.markToolStartupFinished();
            }
        }
        super.onDestroy();
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void onNewIntent(Intent intent) {
        com.neeeex.eraser.m0.a("Tl1Mrqvc\n", "JzM4y8WoGu0=\n");
        intent.getClass();
        super.onNewIntent(intent);
        setIntent(intent);
        d0(intent);
    }

    @Override // androidx.appcompat.app.AppCompatActivity, android.app.Activity
    public void onPostCreate(Bundle savedInstanceState) {
        super.onPostCreate(savedInstanceState);
        ti.a.a(this, true);
    }

    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onResume() {
        super.onResume();
        StartupStateStore startupStateStore = StartupStateStore.INSTANCE;
        String name = getClass().getName();
        com.neeeex.eraser.m0.a("86qXHr6JX4G64c15\n", "lM/jUN/kOqk=\n");
        if (startupStateStore.isStartupPage(name)) {
            Application application = getApplication();
            com.neeeex.eraser.m0.a("57t+qlfGzlDnoWbmFcCPXei9ZuYDyo9Q5qA/qALJwx79t2KjV8bAU6egd6MSwNcQ7LxztRLXgXPw\nj2K2G8zMX/2nfag=\n", "ic4Sxnelrz4=\n");
            application.getClass();
            String name2 = getClass().getName();
            com.neeeex.eraser.m0.a("FHam2ilM77VdPfy9\n", "cxPSlEghip0=\n");
            ((y) application).markToolStartupStarted(name2, getTaskId());
        }
        DefaultHomeStatusTracker.INSTANCE.report(this, com.neeeex.eraser.m0.a("28PInqBqKvnG2s6Ghg==\n", "r6yn8v8LSY0=\n"));
    }
}