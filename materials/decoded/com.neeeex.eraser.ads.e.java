package com.neeeex.eraser.ads;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import android.text.TextUtils;
import android.widget.Toast;
import com.mbridge.msdk.playercommon.exoplayer2.trackselection.AdaptiveTrackSelection;
import com.neeeex.eraser.MainActivity;
import com.neeeex.eraser.MyTransActivity;
import com.neeeex.eraser.MyTransNormalActivity;
import com.neeeex.eraser.R$string;
import com.neeeex.eraser.base.RootActivity;
import com.neeeex.eraser.l0;
import com.neeeex.eraser.launcher.DefaultHomeOnboardingActivity;
import com.neeeex.eraser.launcher.DefaultHomeOnboardingHelper;
import com.neeeex.eraser.launcher.LauncherActionActivity;
import com.neeeex.eraser.launcher.MinusOneRouteActivity;
import com.neeeex.eraser.launcher.SplashRetainTask;
import com.neeeex.eraser.m0;
import com.neeeex.eraser.module.main.GuideNEEEEXActivity;
import com.neeeex.eraser.module.main.LanguageNEEEEXActivity;
import com.neeeex.eraser.module.main.SplashNEEEEXActivity;
import com.neeeex.eraser.module.main.SplashNEEEEXHotActivity;
import com.neeeex.eraser.module.vpu.BaseNEEEEXIVPActivity;
import com.neeeex.eraser.module.vpu.QDNEEEEXIVPActivity;
import com.neeeex.eraser.module.vpu.QDNEEEEXOVPActivity;
import java.lang.ref.WeakReference;
import java.util.Stack;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes7.dex */
public class e {
    public static final String J = "com.neeeex.eraser.launcher.startup.AppStartupActivity" /* decoded XOR */;
    public static boolean K = true;
    public static boolean L = true;
    public static boolean M = false;
    public static boolean N = false;
    public int A;
    public int B;
    public final int C;
    public final int D;
    public final int E;
    public String F;
    public String G;
    public final Stack H;
    public final Application.ActivityLifecycleCallbacks I;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f64891a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f64892b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public volatile int f64893c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public volatile boolean f64894d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f64895e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f64896f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f64897g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f64898h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public boolean f64899i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public Handler f64900j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public Runnable f64901k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public Runnable f64902l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public Runnable f64903m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public Runnable f64904n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public long f64905o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public boolean f64906p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public boolean f64907q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public WeakReference f64908r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public WeakReference f64909s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final WeakHashMap f64910t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public q f64911u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public q f64912v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public WeakReference f64913w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public q f64914x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public Class f64915y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public boolean f64916z;

    public class a implements Application.ActivityLifecycleCallbacks {
        public a() {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityCreated(Activity activity, Bundle bundle) {
            if (e.this.g0(activity)) {
                e eVar = e.this;
                q qVarS = eVar.S((Activity) eVar.f64908r.get());
                if (qVarS != null) {
                    e.this.f64910t.put(activity, qVarS);
                }
            }
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityDestroyed(Activity activity) {
            e.this.H.remove(activity);
            e.this.f64910t.remove(activity);
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPaused(Activity activity) {
            if (e.this.q0(activity)) {
                return;
            }
            if (e.this.n0(activity)) {
                e.this.f64895e = true;
            }
            e.this.f64897g = true;
            if (lj.a.f87875a.a(activity)) {
                e.this.O0();
                com.neeeex.eraser.push.c.f65487a.e();
            }
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityResumed(Activity activity) {
            com.neeeex.eraser.push.e.i(activity);
            if (e.this.q0(activity)) {
                return;
            }
            boolean zEquals = "app.lawnchair.LawnchairLauncher" /* decoded XOR */.equals(activity.getClass().getName());
            e eVar = e.this;
            eVar.f64896f = zEquals && eVar.f64895e;
            e.this.f64895e = false;
            if ((activity instanceof SplashNEEEEXActivity) || (activity instanceof SplashNEEEEXHotActivity)) {
                e.this.f64915y = activity.getClass();
                e.this.f64916z = activity.getIntent().getBooleanExtra("com.neeeex.eraser.launcher.OPEN_DESKTOP_AFTER_STARTUP" /* decoded XOR */, false);
                e.this.A = SplashRetainTask.sourceTaskId(activity);
            }
            e.this.f64897g = false;
            if (e.this.j0(activity)) {
                return;
            }
            if (e.this.g0(activity)) {
                e.this.f64908r = new WeakReference(activity);
                if (activity instanceof RootActivity) {
                    e.this.f64909s = new WeakReference(activity);
                }
            }
            lj.a aVar = lj.a.f87875a;
            if (aVar.b(activity.getClass().getName())) {
                e.this.F = activity.getClass().getName();
            } else {
                if ((!activity.getClass().getName().contains(SplashNEEEEXHotActivity.class.getSimpleName()) && !(activity instanceof BaseNEEEEXIVPActivity) && !(activity instanceof QDNEEEEXIVPActivity) && !(activity instanceof QDNEEEEXOVPActivity)) || TextUtils.isEmpty(e.this.G)) {
                    e.this.G = activity.getClass().getName();
                }
                e.this.F = activity.getClass().getName();
            }
            if (aVar.a(activity)) {
                e.this.H.remove(activity);
                e.this.H.add(activity);
            }
            e.this.V(activity);
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityStarted(Activity activity) {
            if (e.this.h0(activity)) {
                return;
            }
            e.this.f64892b++;
            if (e.this.n0(activity)) {
                e.this.f64893c++;
            }
            boolean z10 = e.this.f64898h;
            e.this.f64898h = true;
            if (z10) {
                return;
            }
            e.this.x0(activity);
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityStopped(Activity activity) {
            if (e.this.h0(activity)) {
                return;
            }
            e.this.f64892b--;
            if (e.this.f64892b < 0) {
                e.this.f64892b = 0;
            }
            if (e.this.n0(activity)) {
                e.this.f64893c--;
                if (e.this.f64893c < 0) {
                    e.this.f64893c = 0;
                }
            }
            if (e.this.f64892b == 0 && e.this.f64898h && e.this.f64897g) {
                e.this.f64898h = false;
                e.this.w0(activity);
            }
        }
    }

    public class b implements Runnable {
        public b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            if (e.this.f64900j == null) {
                e.this.f64900j = new Handler(Looper.getMainLooper());
            }
            if (e.this.f64901k != null) {
                e.this.B++;
                h hVar = h.f64923a;
                double dC = hVar.e().c();
                double dC2 = hVar.h().c();
                boolean zE = hVar.e().e();
                if (e.this.B >= 13 || ((dC > -0.1d && (zE || hVar.e().b())) || (hVar.e().b() && (dC2 > -0.1d || hVar.h().b())))) {
                    com.neeeex.eraser.push.c.f65487a.y(e.this.d0().getName());
                    e.this.Q0();
                } else {
                    if (e.this.B >= 13 || e.this.f64900j == null) {
                        return;
                    }
                    e.this.f64900j.postDelayed(this, AdaptiveTrackSelection.DEFAULT_MIN_TIME_BETWEEN_BUFFER_REEVALUTATION_MS);
                }
            }
        }
    }

    public class c implements Runnable {
        public c() {
        }

        @Override // java.lang.Runnable
        public void run() {
            if (e.this.f64902l != null) {
                if (!e.this.f64898h && !e.N) {
                    com.neeeex.eraser.push.c.f65487a.o(e.this.c0().getName());
                }
                e.this.N0();
            }
        }
    }

    public class d implements Runnable {
        public d() {
        }

        @Override // java.lang.Runnable
        public void run() {
            if (e.this.f64903m != null) {
                if (lj.a.f87875a.a(e.this.a0())) {
                    com.neeeex.eraser.push.c.f65487a.q();
                }
                e.this.O0();
            }
        }
    }

    /* JADX INFO: renamed from: com.neeeex.eraser.ads.e$e, reason: collision with other inner class name */
    public static class C0775e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final e f64921a = new e();
    }

    public e() {
        this.f64892b = 0;
        this.f64893c = 0;
        this.f64894d = false;
        this.f64895e = false;
        this.f64896f = false;
        this.f64897g = true;
        this.f64898h = false;
        this.f64899i = false;
        this.f64900j = new Handler(Looper.getMainLooper());
        this.f64901k = null;
        this.f64902l = null;
        this.f64903m = null;
        this.f64904n = null;
        this.f64905o = 0L;
        this.f64906p = false;
        this.f64907q = false;
        this.f64908r = new WeakReference(null);
        this.f64909s = new WeakReference(null);
        this.f64910t = new WeakHashMap();
        this.f64913w = new WeakReference(null);
        this.A = -1;
        this.B = 0;
        this.C = 13;
        this.D = 4000;
        this.E = 6000;
        this.F = "";
        this.G = "";
        this.H = new Stack();
        this.I = new a();
    }

    public static /* synthetic */ void b(Activity activity) {
        if (activity.isFinishing() || activity.isDestroyed()) {
            return;
        }
        DefaultHomeOnboardingHelper defaultHomeOnboardingHelper = DefaultHomeOnboardingHelper.INSTANCE;
        if (defaultHomeOnboardingHelper.consumePromptAfterHotSplash(activity) && !defaultHomeOnboardingHelper.isDefaultHome(activity)) {
            defaultHomeOnboardingHelper.requestDefaultHome(activity, 9102);
        }
    }

    public static e b0() {
        return C0775e.f64921a;
    }

    public void A0(Activity activity, boolean z10) {
        this.f64913w = new WeakReference(activity);
        q qVarS = z10 ? (q) this.f64910t.get(activity) : S(activity);
        this.f64912v = qVarS;
        if (qVarS != null || z10) {
            return;
        }
        this.f64912v = S((Activity) this.f64908r.get());
    }

    public void B0(Context context) {
        Application application;
        if (M) {
            return;
        }
        synchronized (e.class) {
            try {
                if (!M) {
                    try {
                        if (context instanceof Application) {
                            application = (Application) context;
                        } else {
                            Context applicationContext = context.getApplicationContext();
                            application = applicationContext instanceof Application ? (Application) applicationContext : null;
                        }
                        if (application == null) {
                            return;
                        }
                        this.f64891a = context.getPackageName();
                        application.registerActivityLifecycleCallbacks(this.I);
                        M = true;
                    } catch (Exception e10) {
                        e10.printStackTrace();
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public void C0(Activity activity, boolean z10) {
        Intent intentMakeMainActivity = Intent.makeMainActivity(activity.getComponentName());
        intentMakeMainActivity.putExtra("com.neeeex.eraser.launcher.OPEN_PANEL" /* decoded XOR */, z10);
        this.f64911u = new q(intentMakeMainActivity, activity.getTaskId());
        this.f64908r = new WeakReference(activity);
    }

    public int D0(Activity activity) {
        q qVarB = q.b(activity);
        if (qVarB == null) {
            qVarB = S((Activity) this.f64908r.get());
        }
        R0();
        if (qVarB != null && qVarB.c(activity)) {
            return qVarB.d();
        }
        new q(new Intent(activity, (Class<?>) MainActivity.class), -1).c(activity);
        return -1;
    }

    public boolean E0(Context context) {
        boolean z10 = this.f64906p || i0(a0());
        boolean zL0 = l0(this.F);
        Activity activity = (Activity) this.f64909s.get();
        if (!z10 && (k0(this.F) || ("app.lawnchair.LawnchairLauncher" /* decoded XOR */.equals(this.F) && i0(activity) && k0(activity.getClass().getName())))) {
            this.f64905o = SystemClock.elapsedRealtime();
            com.neeeex.eraser.push.c.f65487a.x();
            return true;
        }
        if (!z10 && (!zL0 || N)) {
            return false;
        }
        this.f64905o = SystemClock.elapsedRealtime();
        O0();
        com.neeeex.eraser.push.c.f65487a.e();
        if (!z10) {
            F0(context);
            return true;
        }
        if (this.f64900j == null) {
            this.f64900j = new Handler(Looper.getMainLooper());
        }
        Runnable runnable = this.f64904n;
        if (runnable != null) {
            this.f64900j.removeCallbacks(runnable);
        }
        Runnable runnable2 = new Runnable() { // from class: com.neeeex.eraser.ads.c
            @Override // java.lang.Runnable
            public final void run() {
                this.f64889a.p0();
            }
        };
        this.f64904n = runnable2;
        this.f64900j.postDelayed(runnable2, 500L);
        return true;
    }

    public final void F0(Context context) {
        if (com.neeeex.eraser.utils.a.f66125a.b()) {
            com.neeeex.eraser.push.c.f65487a.y(d0().getName());
        } else {
            I0();
            M0();
        }
    }

    public final void G0() {
        N0();
        this.f64902l = new c();
    }

    public final void H0() {
        this.f64903m = new d();
    }

    public final void I0() {
        this.f64901k = new b();
    }

    public void J0(boolean z10) {
        this.f64894d = z10;
    }

    public final void K0() {
        if (this.f64902l != null) {
            if (this.f64900j == null) {
                this.f64900j = new Handler(Looper.getMainLooper());
            }
            this.f64900j.removeCallbacks(this.f64902l);
            this.f64900j.postDelayed(this.f64902l, Y());
        }
    }

    public final void L0() {
        if (this.f64903m != null) {
            if (this.f64900j == null) {
                this.f64900j = new Handler(Looper.getMainLooper());
            }
            this.f64900j.removeCallbacks(this.f64903m);
            this.f64900j.postDelayed(this.f64903m, Z());
        }
    }

    public final void M0() {
        this.B = 0;
        if (this.f64901k != null) {
            if (this.f64900j == null) {
                this.f64900j = new Handler(Looper.getMainLooper());
            }
            this.f64900j.removeCallbacks(this.f64901k);
            this.f64900j.post(this.f64901k);
        }
    }

    public final void N0() {
        if (this.f64902l != null) {
            if (this.f64900j == null) {
                this.f64900j = new Handler(Looper.getMainLooper());
            }
            this.f64900j.removeCallbacks(this.f64902l);
            this.f64902l = null;
        }
    }

    public final void O0() {
        if (this.f64903m != null) {
            if (this.f64900j == null) {
                this.f64900j = new Handler(Looper.getMainLooper());
            }
            this.f64900j.removeCallbacks(this.f64903m);
            this.f64903m = null;
        }
    }

    public final void P0() {
        Handler handler;
        Runnable runnable = this.f64904n;
        if (runnable == null || (handler = this.f64900j) == null) {
            return;
        }
        handler.removeCallbacks(runnable);
        this.f64904n = null;
    }

    public final void Q0() {
        if (this.f64901k != null) {
            if (this.f64900j == null) {
                this.f64900j = new Handler(Looper.getMainLooper());
            }
            this.f64900j.removeCallbacks(this.f64901k);
            this.f64901k = null;
        }
        this.B = 0;
    }

    public void R0() {
        K = false;
        this.f64907q = false;
        N0();
        com.neeeex.eraser.push.c.f65487a.c();
    }

    public final q S(Activity activity) {
        if (!i0(activity) || !g0(activity)) {
            return null;
        }
        if (!"app.lawnchair.LawnchairLauncher" /* decoded XOR */.equals(activity.getClass().getName())) {
            return q.a(activity);
        }
        q qVar = this.f64911u;
        if (qVar != null) {
            return qVar;
        }
        Intent intentMakeMainActivity = Intent.makeMainActivity(activity.getComponentName());
        intentMakeMainActivity.putExtra("com.neeeex.eraser.launcher.OPEN_PANEL" /* decoded XOR */, this.f64894d);
        return new q(intentMakeMainActivity, activity.getTaskId());
    }

    public void S0(Intent intent) {
        q qVarS = S((Activity) this.f64909s.get());
        if (qVarS != null) {
            qVarS.e(intent);
        }
    }

    public boolean T() {
        boolean z10 = this.f64896f;
        this.f64896f = false;
        return z10;
    }

    public void T0(Intent intent, boolean z10) {
        q qVarS = z10 ? this.f64914x : this.f64912v;
        if (qVarS == null) {
            qVarS = S((Activity) this.f64908r.get());
        }
        if (qVarS != null) {
            qVarS.e(intent);
        }
    }

    public final boolean U() {
        long j10 = this.f64905o;
        this.f64905o = 0L;
        return j10 > 0 && SystemClock.elapsedRealtime() - j10 <= AdaptiveTrackSelection.DEFAULT_MIN_TIME_BETWEEN_BUFFER_REEVALUTATION_MS;
    }

    public void U0(Intent intent) {
        intent.putExtra("com.neeeex.eraser.launcher.OPEN_DESKTOP_AFTER_STARTUP" /* decoded XOR */, this.f64916z);
        SplashRetainTask.writeTo(intent, this.A);
    }

    public final void V(final Activity activity) {
        if (!(activity instanceof RootActivity) || (activity instanceof SplashNEEEEXActivity) || (activity instanceof SplashNEEEEXHotActivity)) {
            return;
        }
        activity.getWindow().getDecorView().post(new Runnable() { // from class: com.neeeex.eraser.ads.d
            @Override // java.lang.Runnable
            public final void run() {
                e.b(activity);
            }
        });
    }

    public void W(Context context) {
        Activity[] activityArr = (Activity[]) this.H.toArray(new Activity[0]);
        boolean z10 = false;
        for (int length = activityArr.length - 1; length >= 0; length--) {
            Activity activity = activityArr[length];
            if (activity == null || activity.isDestroyed()) {
                this.H.remove(activity);
            } else if (lj.a.f87875a.a(activity) && !activity.isFinishing()) {
                activity.finish();
                z10 = true;
            }
        }
        if (z10) {
            K = true;
            L = true;
            this.f64906p = false;
            if (context != null) {
                Toast.makeText(context, context.getString(R$string.toast_ad_closed), 1).show();
            }
            com.neeeex.eraser.push.c.f65487a.e();
        }
    }

    public int X(Activity activity) {
        q qVarB = q.b(activity);
        if (qVarB == null) {
            qVarB = S((Activity) this.f64908r.get());
        }
        W(activity);
        R0();
        if (qVarB != null && qVarB.c(activity)) {
            return qVarB.d();
        }
        new q(new Intent(activity, (Class<?>) MainActivity.class), -1).c(activity);
        return -1;
    }

    public final long Y() {
        if (this.F.contains(LanguageNEEEEXActivity.class.getSimpleName()) || this.F.contains(GuideNEEEEXActivity.class.getSimpleName()) || this.G.contains(LanguageNEEEEXActivity.class.getSimpleName()) || this.G.contains(GuideNEEEEXActivity.class.getSimpleName())) {
            return 1500L;
        }
        lj.a aVar = lj.a.f87875a;
        return (aVar.c(this.F) || aVar.d(this.F)) ? 4000L : 1600L;
    }

    public final long Z() {
        lj.a aVar = lj.a.f87875a;
        return (aVar.c(this.F) || aVar.d(this.F)) ? 6000L : 4000L;
    }

    public Activity a0() {
        try {
            if (this.H.empty()) {
                return null;
            }
            return (Activity) this.H.lastElement();
        } catch (Throwable unused) {
            return null;
        }
    }

    public final Class c0() {
        return MyTransActivity.class;
    }

    public final Class d0() {
        Class cls = this.f64915y;
        if (cls != null) {
            return cls;
        }
        return this.F.contains(SplashNEEEEXHotActivity.class.getSimpleName()) ? SplashNEEEEXHotActivity.class : SplashNEEEEXActivity.class;
    }

    public final boolean e0(Activity activity, boolean z10) {
        boolean z11 = false;
        this.f64907q = false;
        if (this.f64899i) {
            ij.a.g();
            if (z10 && !activity.getClass().getName().contains(SplashNEEEEXActivity.class.getSimpleName()) && !activity.getClass().getName().contains(SplashNEEEEXHotActivity.class.getSimpleName()) && !(activity instanceof DefaultHomeOnboardingActivity) && !j0(activity) && K && L) {
                activity.startActivity(new Intent(activity, (Class<?>) SplashNEEEEXHotActivity.class));
                z11 = true;
            } else if (!K) {
                K = true;
            }
        } else {
            this.f64899i = true;
        }
        if (!"app.lawnchair.LawnchairLauncher" /* decoded XOR */.equals(activity.getClass().getName())) {
            P0();
            this.f64905o = 0L;
            Q0();
            N0();
            com.neeeex.eraser.push.c cVar = com.neeeex.eraser.push.c.f65487a;
            cVar.k();
            cVar.c();
            cVar.d();
            cVar.j();
        }
        return z11;
    }

    public boolean f0() {
        return this.f64898h;
    }

    public final boolean g0(Activity activity) {
        if (activity == null || (activity instanceof MyTransActivity) || (activity instanceof MyTransNormalActivity) || (activity instanceof MinusOneRouteActivity) || (activity instanceof LauncherActionActivity) || (activity instanceof SplashNEEEEXHotActivity)) {
            return false;
        }
        return (activity instanceof RootActivity) || "app.lawnchair.LawnchairLauncher" /* decoded XOR */.equals(activity.getClass().getName());
    }

    public final boolean h0(Activity activity) {
        return activity != null && J.equals(activity.getClass().getName());
    }

    public final boolean i0(Activity activity) {
        return (activity == null || activity.isFinishing() || activity.isDestroyed()) ? false : true;
    }

    public final boolean j0(Activity activity) {
        return (activity instanceof MyTransActivity) || (activity instanceof MyTransNormalActivity);
    }

    public final boolean k0(String str) {
        return com.neeeex.eraser.push.o.a(str);
    }

    public final boolean l0(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        return str.contains(SplashNEEEEXActivity.class.getSimpleName()) || str.contains(SplashNEEEEXHotActivity.class.getSimpleName());
    }

    public boolean m0() {
        return this.f64894d;
    }

    public final boolean n0(Activity activity) {
        return (activity instanceof RootActivity) || (activity instanceof DefaultHomeOnboardingActivity);
    }

    public boolean o0() {
        return this.f64894d || this.f64893c > 0;
    }

    public final /* synthetic */ void p0() {
        com.neeeex.eraser.push.c.f65487a.p(c0().getName());
        this.f64904n = null;
    }

    public final boolean q0(Activity activity) {
        return h0(activity);
    }

    public void r0() {
        this.f64906p = false;
        O0();
        com.neeeex.eraser.push.c.f65487a.e();
    }

    public void s0() {
        this.f64906p = true;
        H0();
        L0();
    }

    public void t0() {
        this.f64906p = false;
        O0();
        com.neeeex.eraser.push.c.f65487a.e();
    }

    public void u0() {
        this.f64906p = true;
        if (lj.a.f87875a.c(this.F)) {
            return;
        }
        H0();
        L0();
    }

    public void v0(Activity activity) {
        q qVar;
        K = false;
        this.f64907q = true;
        if (this.f64913w.get() == activity && (qVar = this.f64912v) != null) {
            this.f64914x = qVar;
            return;
        }
        if (!g0(activity)) {
            activity = (Activity) this.f64908r.get();
        }
        this.f64914x = S(activity);
    }

    public final void w0(Activity activity) {
        this.f64895e = false;
        this.f64896f = false;
        boolean z10 = this.f64907q && !N;
        this.f64907q = false;
        if (!U()) {
            if (l0(this.F) && !N) {
                F0(activity);
            } else if (z10) {
                G0();
                K0();
            } else if (lj.a.f87875a.b(this.F) && K) {
                com.neeeex.eraser.push.c.f65487a.p(c0().getName());
            } else if (k0(this.F)) {
                com.neeeex.eraser.push.c.f65487a.x();
            }
        }
        l0.f65085a.d(System.currentTimeMillis());
        this.f64899i = true;
        ij.a.f();
        O0();
        com.neeeex.eraser.push.c.f65487a.e();
    }

    public final void x0(Activity activity) {
        e0(activity, n0(activity));
    }

    public boolean y0(Activity activity) {
        if (activity == null || activity.isFinishing() || activity.isDestroyed()) {
            return false;
        }
        this.f64898h = true;
        this.f64899i = true;
        return e0(activity, true);
    }

    public void z0() {
        if (o0()) {
            return;
        }
        com.neeeex.eraser.push.c cVar = com.neeeex.eraser.push.c.f65487a;
        cVar.j();
        cVar.w();
    }
}