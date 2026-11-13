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
        "root" /* decoded XOR */;
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
        "WindowFocusGuard" /* decoded XOR */;
        "Cleared focus outside the window's view hierarchy" /* decoded XOR */;
        return true;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public void onViewAttachedToWindow(View view) {
        "view" /* decoded XOR */;
        view.getClass();
        c();
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public void onViewDetachedFromWindow(View view) {
        "view" /* decoded XOR */;
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
                "activity" /* decoded XOR */;
                activity.getClass();
                Map map = this.f66152a;
                View decorView = activity.getWindow().getDecorView();
                "getDecorView(...)" /* decoded XOR */;
                decorView.getClass();
                map.put(activity, new e0(decorView));
            }

            @Override // android.app.Application.ActivityLifecycleCallbacks
            public void onActivityDestroyed(Activity activity) {
                "activity" /* decoded XOR */;
                activity.getClass();
                e0 e0Var = (e0) this.f66152a.remove(activity);
                if (e0Var != null) {
                    e0Var.b();
                }
            }

            @Override // android.app.Application.ActivityLifecycleCallbacks
            public void onActivityPaused(Activity activity) {
                "activity" /* decoded XOR */;
                activity.getClass();
            }

            @Override // android.app.Application.ActivityLifecycleCallbacks
            public void onActivityResumed(Activity activity) {
                "activity" /* decoded XOR */;
                activity.getClass();
            }

            @Override // android.app.Application.ActivityLifecycleCallbacks
            public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
                "activity" /* decoded XOR */;
                activity.getClass();
                "outState" /* decoded XOR */;
                bundle.getClass();
            }

            @Override // android.app.Application.ActivityLifecycleCallbacks
            public void onActivityStarted(Activity activity) {
                "activity" /* decoded XOR */;
                activity.getClass();
            }

            @Override // android.app.Application.ActivityLifecycleCallbacks
            public void onActivityStopped(Activity activity) {
                "activity" /* decoded XOR */;
                activity.getClass();
            }
        }

        public /* synthetic */ a(p003kotlin.jvm.internal.m mVar) {
            this();
        }

        public final void a(Application application) {
            "application" /* decoded XOR */;
            application.getClass();
            application.registerActivityLifecycleCallbacks(new C0805a());
        }

        public a() {
        }
    }
}