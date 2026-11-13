package com.thinkup.core.common.o;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArraySet;

/* JADX INFO: loaded from: classes7.dex */
public class m {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final String f72996d = "AdLifecycleManager";

    /* JADX INFO: renamed from: d0, reason: collision with root package name */
    private static final long f72997d0 = 500;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static volatile m f72998n;

    /* JADX INFO: renamed from: dq, reason: collision with root package name */
    private Runnable f73002dq;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private volatile boolean f73005o;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private String f73006q;

    /* JADX INFO: renamed from: dd, reason: collision with root package name */
    private final Handler f72999dd = new Handler(Looper.getMainLooper());

    /* JADX INFO: renamed from: dm, reason: collision with root package name */
    private int f73000dm = 0;

    /* JADX INFO: renamed from: dn, reason: collision with root package name */
    private boolean f73001dn = true;

    /* JADX INFO: renamed from: do, reason: not valid java name */
    private boolean f230do = false;

    /* JADX INFO: renamed from: m0, reason: collision with root package name */
    private final List<Application.ActivityLifecycleCallbacks> f73004m0 = new ArrayList();

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final Set<WeakReference<d>> f73003m = new HashSet();

    /* JADX INFO: renamed from: com.thinkup.core.common.o.m$1, reason: invalid class name */
    public class AnonymousClass1 implements Application.ActivityLifecycleCallbacks {
        public AnonymousClass1() {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public final void onActivityCreated(Activity activity, Bundle bundle) {
            m.this.f73006q = activity.getClass().getName();
            m.d(m.this, activity, bundle);
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public final void onActivityDestroyed(Activity activity) {
            m.q(m.this, activity);
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public final void onActivityPaused(Activity activity) {
            m.n(m.this, activity);
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public final void onActivityResumed(Activity activity) {
            m.this.f73006q = activity.getClass().getName();
            m.m(m.this, activity);
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
            m.this.d(activity, bundle);
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public final void onActivityStarted(Activity activity) {
            m.d(m.this);
            if (m.this.f73000dm == 1 && m.this.f73001dn) {
                m.this.f73001dn = false;
                nd.m().q(true);
            }
            m.this.f230do = false;
            nd.m().d(activity);
            m.d(m.this, activity);
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public final void onActivityStopped(Activity activity) {
            m.o(m.this);
            m.this.f230do = activity.isChangingConfigurations();
            try {
                if (m.this.f73002dq != null) {
                    m.this.f72999dd.removeCallbacks(m.this.f73002dq);
                }
                m.this.f73002dq = new Runnable() { // from class: com.thinkup.core.common.o.m.1.1
                    @Override // java.lang.Runnable
                    public final void run() {
                        if (m.this.f73000dm != 0 || m.this.f230do) {
                            return;
                        }
                        m.this.f73001dn = true;
                        nd.m().q(false);
                    }
                };
                m.this.f72999dd.postDelayed(m.this.f73002dq, 500L);
            } catch (Throwable unused) {
            }
            m.o(m.this, activity);
        }
    }

    public interface d {
        void onCreate(Activity activity);

        void onDestroy(Activity activity);

        void onPause(Activity activity);

        void onResume(Activity activity);

        void onStart(Activity activity);

        void onStop(Activity activity);
    }

    private void d(Activity activity) {
        try {
            synchronized (this.f73004m0) {
                try {
                    if (!this.f73004m0.isEmpty()) {
                        for (Application.ActivityLifecycleCallbacks activityLifecycleCallbacks : this.f73004m0) {
                            if (activityLifecycleCallbacks != null) {
                                activityLifecycleCallbacks.onActivityStarted(activity);
                            }
                        }
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            Iterator it = new CopyOnWriteArraySet(this.f73003m).iterator();
            while (it.hasNext()) {
                d dVar = (d) ((WeakReference) it.next()).get();
                if (dVar != null) {
                    dVar.onStart(activity);
                }
            }
        } catch (Exception e10) {
            e10.printStackTrace();
        }
    }

    public static /* synthetic */ void m(m mVar, Activity activity) {
        try {
            synchronized (mVar.f73004m0) {
                try {
                    if (!mVar.f73004m0.isEmpty()) {
                        for (Application.ActivityLifecycleCallbacks activityLifecycleCallbacks : mVar.f73004m0) {
                            if (activityLifecycleCallbacks != null) {
                                activityLifecycleCallbacks.onActivityResumed(activity);
                            }
                        }
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            Iterator it = new CopyOnWriteArraySet(mVar.f73003m).iterator();
            while (it.hasNext()) {
                d dVar = (d) ((WeakReference) it.next()).get();
                if (dVar != null) {
                    dVar.onResume(activity);
                }
            }
            com.thinkup.core.common.q.d.d();
            if (activity != null) {
                nd.m();
            }
        } catch (Throwable th3) {
            th3.printStackTrace();
        }
    }

    private void n(Activity activity) {
        try {
            synchronized (this.f73004m0) {
                try {
                    if (!this.f73004m0.isEmpty()) {
                        for (Application.ActivityLifecycleCallbacks activityLifecycleCallbacks : this.f73004m0) {
                            if (activityLifecycleCallbacks != null) {
                                activityLifecycleCallbacks.onActivityResumed(activity);
                            }
                        }
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            Iterator it = new CopyOnWriteArraySet(this.f73003m).iterator();
            while (it.hasNext()) {
                d dVar = (d) ((WeakReference) it.next()).get();
                if (dVar != null) {
                    dVar.onResume(activity);
                }
            }
            com.thinkup.core.common.q.d.d();
            if (activity != null) {
                nd.m();
            }
        } catch (Throwable th3) {
            th3.printStackTrace();
        }
    }

    private void o(Activity activity) {
        try {
            synchronized (this.f73004m0) {
                try {
                    if (!this.f73004m0.isEmpty()) {
                        for (Application.ActivityLifecycleCallbacks activityLifecycleCallbacks : this.f73004m0) {
                            if (activityLifecycleCallbacks != null) {
                                activityLifecycleCallbacks.onActivityStopped(activity);
                            }
                        }
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            Iterator it = new CopyOnWriteArraySet(this.f73003m).iterator();
            while (it.hasNext()) {
                d dVar = (d) ((WeakReference) it.next()).get();
                if (dVar != null) {
                    dVar.onStop(activity);
                }
            }
        } catch (Exception e10) {
            e10.printStackTrace();
        }
    }

    private void q(Activity activity) {
        try {
            synchronized (this.f73004m0) {
                try {
                    if (!this.f73004m0.isEmpty()) {
                        for (Application.ActivityLifecycleCallbacks activityLifecycleCallbacks : this.f73004m0) {
                            if (activityLifecycleCallbacks != null) {
                                activityLifecycleCallbacks.onActivityDestroyed(activity);
                            }
                        }
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            Iterator it = new CopyOnWriteArraySet(this.f73003m).iterator();
            while (it.hasNext()) {
                d dVar = (d) ((WeakReference) it.next()).get();
                if (dVar != null) {
                    dVar.onDestroy(activity);
                }
            }
        } catch (Exception e10) {
            e10.printStackTrace();
        }
    }

    private WeakReference<d> o(d dVar) {
        for (WeakReference<d> weakReference : new CopyOnWriteArraySet(this.f73003m)) {
            if (weakReference.get() == dVar) {
                return weakReference;
            }
        }
        return null;
    }

    public static /* synthetic */ void q(m mVar, Activity activity) {
        try {
            synchronized (mVar.f73004m0) {
                try {
                    if (!mVar.f73004m0.isEmpty()) {
                        for (Application.ActivityLifecycleCallbacks activityLifecycleCallbacks : mVar.f73004m0) {
                            if (activityLifecycleCallbacks != null) {
                                activityLifecycleCallbacks.onActivityDestroyed(activity);
                            }
                        }
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            Iterator it = new CopyOnWriteArraySet(mVar.f73003m).iterator();
            while (it.hasNext()) {
                d dVar = (d) ((WeakReference) it.next()).get();
                if (dVar != null) {
                    dVar.onDestroy(activity);
                }
            }
        } catch (Exception e10) {
            e10.printStackTrace();
        }
    }

    public static /* synthetic */ int o(m mVar) {
        int i10 = mVar.f73000dm;
        mVar.f73000dm = i10 - 1;
        return i10;
    }

    public final String d() {
        return this.f73006q;
    }

    public static /* synthetic */ void o(m mVar, Activity activity) {
        try {
            synchronized (mVar.f73004m0) {
                try {
                    if (!mVar.f73004m0.isEmpty()) {
                        for (Application.ActivityLifecycleCallbacks activityLifecycleCallbacks : mVar.f73004m0) {
                            if (activityLifecycleCallbacks != null) {
                                activityLifecycleCallbacks.onActivityStopped(activity);
                            }
                        }
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            Iterator it = new CopyOnWriteArraySet(mVar.f73003m).iterator();
            while (it.hasNext()) {
                d dVar = (d) ((WeakReference) it.next()).get();
                if (dVar != null) {
                    dVar.onStop(activity);
                }
            }
        } catch (Exception e10) {
            e10.printStackTrace();
        }
    }

    public final void d(Application application) {
        try {
            if (this.f73005o) {
                return;
            }
            if (application != null) {
                application.registerActivityLifecycleCallbacks(new AnonymousClass1());
            }
            this.f73005o = true;
        } catch (Throwable unused) {
        }
    }

    public final void d(d dVar) {
        try {
            synchronized (this.f73003m) {
                try {
                    if (!n(dVar)) {
                        this.f73003m.add(new WeakReference<>(dVar));
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        } catch (Exception e10) {
            e10.printStackTrace();
        }
    }

    public static m n() {
        if (f72998n == null) {
            synchronized (m.class) {
                try {
                    if (f72998n == null) {
                        f72998n = new m();
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        return f72998n;
    }

    public final boolean m() {
        return this.f73001dn;
    }

    private void m(Application application) {
        if (application == null) {
            return;
        }
        application.registerActivityLifecycleCallbacks(new AnonymousClass1());
    }

    public final void m(d dVar) {
        try {
            synchronized (this.f73003m) {
                try {
                    Iterator<WeakReference<d>> it = this.f73003m.iterator();
                    while (it.hasNext()) {
                        if (it.next().get() == dVar) {
                            it.remove();
                        }
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        } catch (Exception e10) {
            e10.printStackTrace();
        }
    }

    public static /* synthetic */ int d(m mVar) {
        int i10 = mVar.f73000dm;
        mVar.f73000dm = i10 + 1;
        return i10;
    }

    public final void d(Activity activity, Bundle bundle) {
        try {
            synchronized (this.f73004m0) {
                try {
                    if (!this.f73004m0.isEmpty()) {
                        for (Application.ActivityLifecycleCallbacks activityLifecycleCallbacks : this.f73004m0) {
                            if (activityLifecycleCallbacks != null) {
                                activityLifecycleCallbacks.onActivitySaveInstanceState(activity, bundle);
                            }
                        }
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        } catch (Exception e10) {
            e10.printStackTrace();
        }
    }

    private boolean n(d dVar) {
        try {
            Iterator it = new CopyOnWriteArraySet(this.f73003m).iterator();
            while (it.hasNext()) {
                if (((WeakReference) it.next()).get() == dVar) {
                    return true;
                }
            }
            return false;
        } catch (Exception e10) {
            e10.printStackTrace();
            return false;
        }
    }

    private void m(Activity activity, Bundle bundle) {
        try {
            synchronized (this.f73004m0) {
                try {
                    if (!this.f73004m0.isEmpty()) {
                        for (Application.ActivityLifecycleCallbacks activityLifecycleCallbacks : this.f73004m0) {
                            if (activityLifecycleCallbacks != null) {
                                activityLifecycleCallbacks.onActivityCreated(activity, bundle);
                            }
                        }
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            Iterator it = new CopyOnWriteArraySet(this.f73003m).iterator();
            while (it.hasNext()) {
                d dVar = (d) ((WeakReference) it.next()).get();
                if (dVar != null) {
                    dVar.onCreate(activity);
                }
            }
        } catch (Exception e10) {
            e10.printStackTrace();
        }
    }

    public static /* synthetic */ void n(m mVar, Activity activity) {
        try {
            synchronized (mVar.f73004m0) {
                try {
                    if (!mVar.f73004m0.isEmpty()) {
                        for (Application.ActivityLifecycleCallbacks activityLifecycleCallbacks : mVar.f73004m0) {
                            if (activityLifecycleCallbacks != null) {
                                activityLifecycleCallbacks.onActivityPaused(activity);
                            }
                        }
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            Iterator it = new CopyOnWriteArraySet(mVar.f73003m).iterator();
            while (it.hasNext()) {
                d dVar = (d) ((WeakReference) it.next()).get();
                if (dVar != null) {
                    dVar.onPause(activity);
                }
            }
        } catch (Exception e10) {
            e10.printStackTrace();
        }
    }

    public final void d(Application.ActivityLifecycleCallbacks activityLifecycleCallbacks) {
        try {
            synchronized (this.f73004m0) {
                try {
                    if (!this.f73004m0.contains(activityLifecycleCallbacks)) {
                        this.f73004m0.add(activityLifecycleCallbacks);
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        } catch (Exception e10) {
            e10.printStackTrace();
        }
    }

    public static /* synthetic */ void d(m mVar, Activity activity) {
        try {
            synchronized (mVar.f73004m0) {
                try {
                    if (!mVar.f73004m0.isEmpty()) {
                        for (Application.ActivityLifecycleCallbacks activityLifecycleCallbacks : mVar.f73004m0) {
                            if (activityLifecycleCallbacks != null) {
                                activityLifecycleCallbacks.onActivityStarted(activity);
                            }
                        }
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            Iterator it = new CopyOnWriteArraySet(mVar.f73003m).iterator();
            while (it.hasNext()) {
                d dVar = (d) ((WeakReference) it.next()).get();
                if (dVar != null) {
                    dVar.onStart(activity);
                }
            }
        } catch (Exception e10) {
            e10.printStackTrace();
        }
    }

    private void m(Activity activity) {
        try {
            synchronized (this.f73004m0) {
                try {
                    if (!this.f73004m0.isEmpty()) {
                        for (Application.ActivityLifecycleCallbacks activityLifecycleCallbacks : this.f73004m0) {
                            if (activityLifecycleCallbacks != null) {
                                activityLifecycleCallbacks.onActivityPaused(activity);
                            }
                        }
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            Iterator it = new CopyOnWriteArraySet(this.f73003m).iterator();
            while (it.hasNext()) {
                d dVar = (d) ((WeakReference) it.next()).get();
                if (dVar != null) {
                    dVar.onPause(activity);
                }
            }
        } catch (Exception e10) {
            e10.printStackTrace();
        }
    }

    public static /* synthetic */ void d(m mVar, Activity activity, Bundle bundle) {
        try {
            synchronized (mVar.f73004m0) {
                try {
                    if (!mVar.f73004m0.isEmpty()) {
                        for (Application.ActivityLifecycleCallbacks activityLifecycleCallbacks : mVar.f73004m0) {
                            if (activityLifecycleCallbacks != null) {
                                activityLifecycleCallbacks.onActivityCreated(activity, bundle);
                            }
                        }
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            Iterator it = new CopyOnWriteArraySet(mVar.f73003m).iterator();
            while (it.hasNext()) {
                d dVar = (d) ((WeakReference) it.next()).get();
                if (dVar != null) {
                    dVar.onCreate(activity);
                }
            }
        } catch (Exception e10) {
            e10.printStackTrace();
        }
    }
}