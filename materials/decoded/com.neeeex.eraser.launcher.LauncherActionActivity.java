package com.neeeex.eraser.launcher;

import android.content.Intent;
import android.os.Bundle;
import b.k0;
import b.o0;
import com.neeeex.eraser.base.BaseStoragePermActivity;
import com.neeeex.eraser.m0;
import com.neeeex.eraser.push.service.NEEEEXFGService;
import com.neeeex.virus.VirusScanNEEEEXActivity;
import p003kotlin.Metadata;
import p003kotlin.jvm.functions.Function0;
import p003kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 !2\u00020\u0001:\u0001!B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0005\u0010\u0003J\u000f\u0010\u0006\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0006\u0010\u0003J\u0019\u0010\t\u001a\u00020\u00042\b\u0010\b\u001a\u0004\u0018\u00010\u0007H\u0014¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\f\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\u0007H\u0014¢\u0006\u0004\b\f\u0010\nJ)\u0010\u0012\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\r2\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010H\u0014¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0014\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0014\u0010\u0003R\u0016\u0010\u0016\u001a\u00020\u00158\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u0016\u0010\u0018\u001a\u00020\u00158\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0018\u0010\u0017R\u0016\u0010\u0019\u001a\u00020\u00158\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0019\u0010\u0017R\u0018\u0010\u001b\u001a\u0004\u0018\u00010\u001a8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR\u0016\u0010 \u001a\u0004\u0018\u00010\u001d8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u001e\u0010\u001f¨\u0006\""}, d2 = {"Lcom/neeeex/eraser/launcher/LauncherActionActivity;", "Lcom/neeeex/eraser/base/BaseStoragePermActivity;", "<init>", "()V", "Lfl/m0;", "requireStorage", "requestNotifications", "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "(Landroid/os/Bundle;)V", "outState", "onSaveInstanceState", "", "requestCode", "resultCode", "Landroid/content/Intent;", "data", "onActivityResult", "(IILandroid/content/Intent;)V", "onStoragePermission", "", "launched", "Z", "consentGranted", "roleRequested", "", "requestedAction", "Ljava/lang/String;", "Lcom/neeeex/eraser/launcher/LauncherActionNavigator$Action;", "getAction", "()Lcom/neeeex/eraser/launcher/LauncherActionNavigator$Action;", "action", "Companion", "tool-feature_productionRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class LauncherActionActivity extends BaseStoragePermActivity {
    private boolean consentGranted;
    private boolean launched;
    private String requestedAction;
    private boolean roleRequested;
    public static final String EXTRA_ACTION = "com.neeeex.eraser.launcher.ACTION" /* decoded XOR */;

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[LauncherActionNavigator.Action.values().length];
            try {
                iArr[LauncherActionNavigator.Action.COMPRESS.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[LauncherActionNavigator.Action.VIRUS.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[LauncherActionNavigator.Action.NOTIFICATION_PERMISSION.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[LauncherActionNavigator.Action.DEFAULT_HOME.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX INFO: renamed from: com.neeeex.eraser.launcher.LauncherActionActivity$requestNotifications$2, reason: invalid class name */
    @Metadata(d1 = {"\u0000\u0019\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u001f\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\b\u001a\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"com/neeeex/eraser/launcher/LauncherActionActivity$requestNotifications$2", "Lvi/h$a;", "", "isGranted", "shouldShowRationale", "Lfl/m0;", "on13Permission", "(ZZ)V", "onGranted", "(Z)V", "tool-feature_productionRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class AnonymousClass2 implements vi.h.a {
        final /* synthetic */ vi.l $settingsLauncher;

        public AnonymousClass2(vi.l lVar) {
            this.$settingsLauncher = lVar;
        }

        public static fl.m0 a(LauncherActionActivity launcherActionActivity, boolean z10) {
            launcherActionActivity.finish();
            return fl.m0.f80959a;
        }

        @Override // vi.h.a
        public void on13Permission(boolean isGranted, boolean shouldShowRationale) {
        }

        @Override // vi.h.a
        public void onGranted(boolean isGranted) {
            if (isGranted) {
                NEEEEXFGService.INSTANCE.b(LauncherActionActivity.this);
                mi.a.f88870a.g0();
                LauncherActionActivity.this.finish();
            } else {
                vi.l lVar = this.$settingsLauncher;
                final LauncherActionActivity launcherActionActivity = LauncherActionActivity.this;
                lVar.f(new Function1() { // from class: com.neeeex.eraser.launcher.o
                    @Override // p003kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return LauncherActionActivity.AnonymousClass2.a(launcherActionActivity, ((Boolean) obj).booleanValue());
                    }
                });
            }
        }
    }

    public static void G0(LauncherActionActivity launcherActionActivity) {
        launcherActionActivity.consentGranted = true;
        launcherActionActivity.requireStorage();
    }

    public static fl.m0 H0(LauncherActionActivity launcherActionActivity, k0 k0Var) {
        "$this$addCallback" /* decoded XOR */;
        k0Var.getClass();
        launcherActionActivity.finish();
        return fl.m0.f80959a;
    }

    public static void I0(LauncherActionActivity launcherActionActivity) {
        launcherActionActivity.finish();
    }

    public static fl.m0 J0(LauncherActionActivity launcherActionActivity, boolean z10) {
        if (qi.a.f92153a.d(launcherActionActivity)) {
            NEEEEXFGService.INSTANCE.b(launcherActionActivity);
            mi.a.f88870a.g0();
        }
        launcherActionActivity.finish();
        return fl.m0.f80959a;
    }

    public static fl.m0 K0(LauncherActionActivity launcherActionActivity) {
        launcherActionActivity.finish();
        return fl.m0.f80959a;
    }

    private final LauncherActionNavigator.Action getAction() {
        Object objM372constructorimpl;
        try {
            fl.u.a aVar = fl.u.Companion;
            String str = this.requestedAction;
            if (str == null) {
                str = "";
            }
            objM372constructorimpl = fl.u.m372constructorimpl(LauncherActionNavigator.Action.valueOf(str));
        } catch (Throwable th2) {
            fl.u.a aVar2 = fl.u.Companion;
            objM372constructorimpl = fl.u.m372constructorimpl(fl.v.a(th2));
        }
        if (fl.u.m377isFailureimpl(objM372constructorimpl)) {
            objM372constructorimpl = null;
        }
        return (LauncherActionNavigator.Action) objM372constructorimpl;
    }

    private final void requestNotifications() {
        com.neeeex.eraser.ads.e.b0().R0();
        ui.a aVar = ui.a.f100035a;
        vi.l lVarE = aVar.e(this);
        if (NEEEEXFGServicePermission.INSTANCE.canUseRuntimePermission(this)) {
            aVar.d(this).f(new AnonymousClass2(lVarE));
        } else {
            lVarE.f(new Function1() { // from class: com.neeeex.eraser.launcher.k
                @Override // p003kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return LauncherActionActivity.J0(this.f65129a, ((Boolean) obj).booleanValue());
                }
            });
        }
    }

    private final void requireStorage() {
        if (checkStoragePermission(this)) {
            onStoragePermission();
        } else {
            askPermission(new Function0() { // from class: com.neeeex.eraser.launcher.j
                @Override // p003kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return LauncherActionActivity.K0(this.f65128a);
                }
            });
        }
    }

    @Override // com.neeeex.eraser.base.BaseStoragePermActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if (requestCode == 2601) {
            finish();
        }
    }

    @Override // com.neeeex.eraser.base.RootActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle savedInstanceState) {
        String stringExtra;
        super.onCreate(savedInstanceState);
        if (savedInstanceState == null || (stringExtra = savedInstanceState.getString("requested_action" /* decoded XOR */)) == null) {
            stringExtra = getIntent().getStringExtra(EXTRA_ACTION);
        }
        this.requestedAction = stringExtra;
        this.consentGranted = savedInstanceState != null ? savedInstanceState.getBoolean("consent" /* decoded XOR */) : false;
        this.roleRequested = savedInstanceState != null ? savedInstanceState.getBoolean("role_requested" /* decoded XOR */) : false;
        o0.b(getOnBackPressedDispatcher(), this, false, new Function1() { // from class: com.neeeex.eraser.launcher.l
            @Override // p003kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return LauncherActionActivity.H0(this.f65130a, (k0) obj);
            }
        }, 2, null);
        LauncherActionNavigator.Action action = getAction();
        int i10 = action == null ? -1 : WhenMappings.$EnumSwitchMapping$0[action.ordinal()];
        if (i10 == 1) {
            requireStorage();
            return;
        }
        if (i10 == 2) {
            mi.a.f88870a.A1();
            if (this.consentGranted) {
                requireStorage();
                return;
            } else {
                com.neeeex.virus.l.l(this, new Runnable() { // from class: com.neeeex.eraser.launcher.m
                    @Override // java.lang.Runnable
                    public final void run() {
                        LauncherActionActivity.G0(this.f65131a);
                    }
                }, new Runnable() { // from class: com.neeeex.eraser.launcher.n
                    @Override // java.lang.Runnable
                    public final void run() {
                        LauncherActionActivity.I0(this.f65132a);
                    }
                });
                return;
            }
        }
        if (i10 == 3) {
            requestNotifications();
            return;
        }
        if (i10 != 4) {
            finish();
        } else {
            if (this.roleRequested) {
                return;
            }
            this.roleRequested = true;
            DefaultHomeController.INSTANCE.request(this);
        }
    }

    @Override // androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onSaveInstanceState(Bundle outState) {
        "outState" /* decoded XOR */;
        outState.getClass();
        outState.putBoolean("role_requested" /* decoded XOR */, this.roleRequested);
        outState.putBoolean("consent" /* decoded XOR */, this.consentGranted);
        outState.putString("requested_action" /* decoded XOR */, this.requestedAction);
        super.onSaveInstanceState(outState);
    }

    @Override // com.neeeex.eraser.base.BaseStoragePermActivity
    public void onStoragePermission() {
        if (this.launched) {
            return;
        }
        this.launched = true;
        LauncherActionNavigator.Action action = getAction();
        int i10 = action == null ? -1 : WhenMappings.$EnumSwitchMapping$0[action.ordinal()];
        if (i10 == 1) {
            mi.a.f88870a.J();
            fi.a.f80895a.a(this);
        } else if (i10 == 2) {
            startActivity(new Intent(this, (Class<?>) VirusScanNEEEEXActivity.class));
        }
        finish();
    }
}