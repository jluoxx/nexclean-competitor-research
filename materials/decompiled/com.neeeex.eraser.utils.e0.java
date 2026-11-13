package com.neeeex.eraser.utils;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import com.neeeex.eraser.m0;
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes7.dex */
public final class e0 implements ViewTreeObserver.OnPreDrawListener, View.OnAttachStateChangeListener {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final a f66149c = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final View f66150a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public ViewTreeObserver f66151b;

    public e0(View view) {
        m0.a("PcE6zA==\n", "T65VuPckZko=\n");
        view.getClass();
        this.f66150a = view;
        view.addOnAttachStateChangeListener(this);
        c();
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x000b, code lost:
    
        r0 = null;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a() {
        View view = this.f66150a;
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            while (viewGroup != null) {
                View focusedChild = viewGroup.getFocusedChild();
                if (focusedChild == null) {
                    break;
                }
                if (focusedChild.getParent() != viewGroup) {
                    viewGroup.clearChildFocus(focusedChild);
                    return;
                }
                viewGroup = focusedChild instanceof ViewGroup ? (ViewGroup) focusedChild : null;
            }
            this.f66150a.clearFocus();
        }
    }

    public final void b() {
        this.f66150a.removeOnAttachStateChangeListener(this);
        ViewTreeObserver viewTreeObserver = this.f66151b;
        if (viewTreeObserver != null) {
            if (!viewTreeObserver.isAlive()) {
                viewTreeObserver = null;
            }
            if (viewTreeObserver != null) {
                viewTreeObserver.removeOnPreDrawListener(this);
            }
        }
        this.f66151b = null;
        ViewTreeObserver viewTreeObserver2 = this.f66150a.getViewTreeObserver();
        ViewTreeObserver viewTreeObserver3 = viewTreeObserver2.isAlive() ? viewTreeObserver2 : null;
        if (viewTreeObserver3 != null) {
            viewTreeObserver3.removeOnPreDrawListener(this);
        }
    }

    public final void c() {
        ViewTreeObserver viewTreeObserver = this.f66151b;
        if (viewTreeObserver != null) {
            if (!viewTreeObserver.isAlive()) {
                viewTreeObserver = null;
            }
            if (viewTreeObserver != null) {
                viewTreeObserver.removeOnPreDrawListener(this);
            }
        }
        ViewTreeObserver viewTreeObserver2 = this.f66150a.getViewTreeObserver();
        viewTreeObserver2.removeOnPreDrawListener(this);
        viewTreeObserver2.addOnPreDrawListener(this);
        this.f66151b = viewTreeObserver2;
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public boolean onPreDraw() {
        View viewFindFocus = this.f66150a.findFocus();
        if (viewFindFocus == null) {
            return true;
        }
        while (viewFindFocus != null) {
            if (viewFindFocus == this.f66150a) {
                return true;
            }
            Object parent = viewFindFocus.getParent();
            viewFindFocus = parent instanceof View ? (View) parent : null;
        }
        a();
        m0.a("T2Zqr0niPNF7eneMU/QI2g==\n", "GA8EyyaVer4=\n");
        m0.a("2vbe1Iu95pT/9djAivjtwe3p0tGc+Pbc/LrM3Je87cO+6ZvDkL31lPHz3seYquHc4A==\n", "mZq7tfnYgrQ=\n");
        return true;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public void onViewAttachedToWindow(View view) {
        m0.a("Wm/FIQ==\n", "LAagVpuC1B0=\n");
        view.getClass();
        c();
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public void onViewDetachedFromWindow(View view) {
        m0.a("9wHNHQ==\n", "gWioajYHbZ0=\n");
        view.getClass();
        ViewTreeObserver viewTreeObserver = this.f66151b;
        if (viewTreeObserver != null) {
            if (!viewTreeObserver.isAlive()) {
                viewTreeObserver = null;
            }
            if (viewTreeObserver != null) {
                viewTreeObserver.removeOnPreDrawListener(this);
            }
        }
        this.f66151b = null;
    }

    public static final class a {

        /* JADX INFO: renamed from: com.neeeex.eraser.utils.e0$a$a, reason: collision with other inner class name */
        public static final class C0805a implements Application.ActivityLifecycleCallbacks {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final Map f66152a = new LinkedHashMap();

            @Override // android.app.Application.ActivityLifecycleCallbacks
            public void onActivityCreated(Activity activity, Bundle bundle) {
                m0.a("TKTGg0wCMB8=\n", "Lcey6jprRGY=\n");
                activity.getClass();
                Map map = this.f66152a;
                View decorView = activity.getWindow().getDecorView();
                m0.a("swaCoIsl0X2CCpOTxmiQIf0=\n", "1GP25O5Gvg8=\n");
                decorView.getClass();
                map.put(activity, new e0(decorView));
            }

            @Override // android.app.Application.ActivityLifecycleCallbacks
            public void onActivityDestroyed(Activity activity) {
                m0.a("77lXt85q9IA=\n", "jtoj3rgDgPk=\n");
                activity.getClass();
                e0 e0Var = (e0) this.f66152a.remove(activity);
                if (e0Var != null) {
                    e0Var.b();
                }
            }

            @Override // android.app.Application.ActivityLifecycleCallbacks
            public void onActivityPaused(Activity activity) {
                m0.a("e78meGwWDkk=\n", "GtxSERp/ejA=\n");
                activity.getClass();
            }

            @Override // android.app.Application.ActivityLifecycleCallbacks
            public void onActivityResumed(Activity activity) {
                m0.a("w4F21J4nxAQ=\n", "ouICvehOsH0=\n");
                activity.getClass();
            }

            @Override // android.app.Application.ActivityLifecycleCallbacks
            public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
                m0.a("IkuuurvzZkA=\n", "Qyja082aEjk=\n");
                activity.getClass();
                m0.a("eq5lpK62rvc=\n", "FdsR99rX2pI=\n");
                bundle.getClass();
            }

            @Override // android.app.Application.ActivityLifecycleCallbacks
            public void onActivityStarted(Activity activity) {
                m0.a("WZpadv2QQ+Q=\n", "OPkuH4v5N50=\n");
                activity.getClass();
            }

            @Override // android.app.Application.ActivityLifecycleCallbacks
            public void onActivityStopped(Activity activity) {
                m0.a("78oyzyg3G20=\n", "jqlGpl5ebxQ=\n");
                activity.getClass();
            }
        }

        public /* synthetic */ a(p003kotlin.jvm.internal.m mVar) {
            this();
        }

        public final void a(Application application) {
            m0.a("nqSNaA8OfoeWu5M=\n", "/9T9BGZtH/M=\n");
            application.getClass();
            application.registerActivityLifecycleCallbacks(new C0805a());
        }

        public a() {
        }
    }
}