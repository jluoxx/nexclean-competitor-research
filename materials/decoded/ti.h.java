package ti;

import android.os.Handler;
import android.os.Looper;
import androidx.p002lifecycle.LifecycleOwner;
import androidx.p002lifecycle.LiveData;
import androidx.p002lifecycle.Observer;
import com.neeeex.eraser.m0;
import p003kotlin.jvm.functions.Function0;
import p003kotlin.jvm.functions.Function1;
import p003kotlin.jvm.internal.p;
import p003kotlin.jvm.internal.r0;
import p003kotlin.jvm.internal.v;

/* JADX INFO: loaded from: classes7.dex */
public abstract class h {

    public static final class a implements Observer {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ r0 f99223a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Function1 f99224b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ LiveData f99225c;

        public a(r0 r0Var, Function1 function1, LiveData liveData) {
            this.f99223a = r0Var;
            this.f99224b = function1;
            this.f99225c = liveData;
        }

        @Override // androidx.p002lifecycle.Observer
        public void onChanged(Object obj) {
            if (this.f99223a.element) {
                this.f99224b.invoke(obj);
                this.f99225c.removeObserver(this);
            }
        }
    }

    public static final class b implements Observer {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Function1 f99226a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ LiveData f99227b;

        public b(Function1 function1, LiveData liveData) {
            this.f99226a = function1;
            this.f99227b = liveData;
        }

        @Override // androidx.p002lifecycle.Observer
        public void onChanged(Object obj) {
            this.f99226a.invoke(obj);
            this.f99227b.removeObserver(this);
        }
    }

    public static final class c implements Observer, p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Function1 f99228a;

        public c(Function1 function1) {
            "function" /* decoded XOR */;
            function1.getClass();
            this.f99228a = function1;
        }

        public final boolean equals(Object obj) {
            if ((obj instanceof Observer) && (obj instanceof p)) {
                return v.c(getFunctionDelegate(), ((p) obj).getFunctionDelegate());
            }
            return false;
        }

        @Override // p003kotlin.jvm.internal.p
        public final fl.h getFunctionDelegate() {
            return this.f99228a;
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }

        @Override // androidx.p002lifecycle.Observer
        public final /* synthetic */ void onChanged(Object obj) {
            this.f99228a.invoke(obj);
        }
    }

    public static fl.m0 a(r0 r0Var) {
        r0Var.element = true;
        return fl.m0.f80959a;
    }

    public static void b(Function0 function0) {
        function0.invoke();
    }

    public static fl.m0 c(r0 r0Var, Function1 function1, Object obj) {
        if (r0Var.element) {
            function1.invoke(obj);
        }
        return fl.m0.f80959a;
    }

    public static fl.m0 d(r0 r0Var) {
        r0Var.element = true;
        return fl.m0.f80959a;
    }

    public static final void e(final Function0 function0) {
        new Handler(Looper.getMainLooper()).post(new Runnable() { // from class: ti.g
            @Override // java.lang.Runnable
            public final void run() {
                h.b(function0);
            }
        });
    }

    public static final void f(LiveData liveData, LifecycleOwner lifecycleOwner, boolean z10, boolean z11, Function1 function1) {
        "<this>" /* decoded XOR */;
        liveData.getClass();
        "owner" /* decoded XOR */;
        lifecycleOwner.getClass();
        "observer" /* decoded XOR */;
        function1.getClass();
        int i10 = (z10 ? 2 : 0) + (z11 ? 1 : 0);
        if (i10 == 1) {
            i(liveData, lifecycleOwner, function1);
            return;
        }
        if (i10 == 2) {
            liveData.observe(lifecycleOwner, new c(function1));
        } else if (i10 != 3) {
            h(liveData, lifecycleOwner, function1);
        } else {
            j(liveData, lifecycleOwner, function1);
        }
    }

    public static /* synthetic */ void g(LiveData liveData, LifecycleOwner lifecycleOwner, boolean z10, boolean z11, Function1 function1, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            z10 = true;
        }
        if ((i10 & 4) != 0) {
            z11 = false;
        }
        f(liveData, lifecycleOwner, z10, z11, function1);
    }

    public static final void h(LiveData liveData, LifecycleOwner lifecycleOwner, final Function1 function1) {
        final r0 r0Var = new r0();
        liveData.observe(lifecycleOwner, new c(new Function1() { // from class: ti.e
            @Override // p003kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return h.c(r0Var, function1, obj);
            }
        }));
        e(new Function0() { // from class: ti.f
            @Override // p003kotlin.jvm.functions.Function0
            public final Object invoke() {
                return h.a(r0Var);
            }
        });
    }

    public static final void i(LiveData liveData, LifecycleOwner lifecycleOwner, Function1 function1) {
        final r0 r0Var = new r0();
        liveData.observe(lifecycleOwner, new a(r0Var, function1, liveData));
        e(new Function0() { // from class: ti.d
            @Override // p003kotlin.jvm.functions.Function0
            public final Object invoke() {
                return h.d(r0Var);
            }
        });
    }

    public static final void j(LiveData liveData, LifecycleOwner lifecycleOwner, Function1 function1) {
        liveData.observe(lifecycleOwner, new b(function1, liveData));
    }
}