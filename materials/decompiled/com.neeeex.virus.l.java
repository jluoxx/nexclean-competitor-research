package com.neeeex.virus;

import android.app.Activity;
import android.app.Dialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.drawable.ColorDrawable;
import android.net.Uri;
import android.util.DisplayMetrics;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import android.widget.TextView;
import androidx.p002lifecycle.DefaultLifecycleObserver;
import androidx.p002lifecycle.Lifecycle;
import androidx.p002lifecycle.LifecycleOwner;
import com.neeeex.eraser.R$id;
import com.neeeex.eraser.R$layout;
import com.neeeex.eraser.R$string;
import com.neeeex.eraser.m0;
import com.neeeex.eraser.module.main.WebViewNeeeexActivity;
import java.lang.ref.WeakReference;
import p003kotlin.jvm.internal.r0;
import p003kotlin.text.k0;

/* JADX INFO: loaded from: classes7.dex */
public final class l {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final String f66700b = m0.a("QmR3f26FVFdRaGByQr5TQVdhanloqF8=\n", "NA0FCh3aOjI=\n");

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final String f66701c = m0.a("lPuYYy4FCRKZyopnPxo6E5TmiHsgGhAFmMqKdCwMFQOY8Q==\n", "/ZXrF09pZXc=\n");

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final String f66702d = m0.a("nKvePpy5zDGDqN1gm/GWbYCzxSGErYBxmfDaPIb1gn2N8tohg+qAZw==\n", "9N+qTu+D4x4=\n");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final l f66699a = new l();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static WeakReference f66703e = new WeakReference(null);

    public static final class a implements DefaultLifecycleObserver {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ r0 f66704a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Dialog f66705b;

        public a(r0 r0Var, Dialog dialog) {
            this.f66704a = r0Var;
            this.f66705b = dialog;
        }

        @Override // androidx.p002lifecycle.DefaultLifecycleObserver
        public /* bridge */ void onCreate(LifecycleOwner lifecycleOwner) {
            super.onCreate(lifecycleOwner);
        }

        @Override // androidx.p002lifecycle.DefaultLifecycleObserver
        public void onDestroy(LifecycleOwner lifecycleOwner) {
            m0.a("DhQwB7k=\n", "YWNeYstGPvc=\n");
            lifecycleOwner.getClass();
            this.f66704a.element = true;
            l.f66699a.h(this.f66705b);
        }

        @Override // androidx.p002lifecycle.DefaultLifecycleObserver
        public /* bridge */ void onPause(LifecycleOwner lifecycleOwner) {
            super.onPause(lifecycleOwner);
        }

        @Override // androidx.p002lifecycle.DefaultLifecycleObserver
        public /* bridge */ void onResume(LifecycleOwner lifecycleOwner) {
            super.onResume(lifecycleOwner);
        }

        @Override // androidx.p002lifecycle.DefaultLifecycleObserver
        public /* bridge */ void onStart(LifecycleOwner lifecycleOwner) {
            super.onStart(lifecycleOwner);
        }

        @Override // androidx.p002lifecycle.DefaultLifecycleObserver
        public /* bridge */ void onStop(LifecycleOwner lifecycleOwner) {
            super.onStop(lifecycleOwner);
        }
    }

    public static void a(Dialog dialog, View view) {
        f66699a.h(dialog);
    }

    public static void b(Activity activity, View view) {
        WebViewNeeeexActivity.Companion companion = WebViewNeeeexActivity.INSTANCE;
        String string = activity.getString(R$string.setting_neeeex_pp);
        m0.a("VTUdJFFfdbxVeEdZCwQ=\n", "MlBpdyUtHNI=\n");
        string.getClass();
        companion.a(activity, string, m0.a("CsK1RY0wC0wR37VQjSRDDA3RrVDQaUsOTcCoUIklSgYa1a1Qn2QJExDft1SdcwkTDdqoVoc=\n", "YrbBNf4KJGM=\n"));
    }

    public static void c(Activity activity, r0 r0Var, Dialog dialog, Runnable runnable, View view) {
        activity.getSharedPreferences(f66700b, 0).edit().putBoolean(f66701c, true).apply();
        r0Var.element = true;
        f66699a.h(dialog);
        runnable.run();
    }

    public static void d(Lifecycle lifecycle, a aVar, Dialog dialog, r0 r0Var, r0 r0Var2, Activity activity, Runnable runnable, DialogInterface dialogInterface) {
        if (lifecycle != null) {
            lifecycle.removeObserver(aVar);
        }
        if (f66703e.get() == dialog) {
            f66703e.clear();
        }
        if (r0Var.element || r0Var2.element || activity.isFinishing() || activity.isDestroyed() || runnable == null) {
            return;
        }
        runnable.run();
    }

    public static void e(Dialog dialog, Activity activity, DialogInterface dialogInterface) {
        Window window = dialog.getWindow();
        if (window != null) {
            window.setBackgroundDrawable(new ColorDrawable(0));
            window.addFlags(2);
            WindowManager.LayoutParams attributes = window.getAttributes();
            attributes.dimAmount = 0.6f;
            window.setAttributes(attributes);
            DisplayMetrics displayMetrics = activity.getResources().getDisplayMetrics();
            window.setLayout(displayMetrics.widthPixels - (((int) (20 * displayMetrics.density)) * 2), (int) (displayMetrics.heightPixels * 0.7f));
        }
    }

    public static void f(Activity activity, View view) {
        f66699a.j(activity, f66702d);
    }

    public static final void k(Activity activity, Runnable runnable) {
        m0.a("q+V9CkNFAEw=\n", "yoYJYzUsdDU=\n");
        activity.getClass();
        m0.a("Dnr2s00ZAB0EcA==\n", "YRS30C58cGk=\n");
        runnable.getClass();
        l(activity, runnable, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void l(final Activity activity, final Runnable runnable, final Runnable runnable2) {
        m0.a("VVG5gAozKA4=\n", "NDLN6XxaXHc=\n");
        activity.getClass();
        m0.a("bxh3EuWmwF1lEg==\n", "AHY2cYbDsCk=\n");
        runnable.getClass();
        if (activity.isFinishing() || activity.isDestroyed()) {
            return;
        }
        l lVar = f66699a;
        if (lVar.i(activity)) {
            runnable.run();
            return;
        }
        Dialog dialog = (Dialog) f66703e.get();
        f66703e.clear();
        if (dialog != null) {
            lVar.h(dialog);
        }
        final r0 r0Var = new r0();
        final r0 r0Var2 = new r0();
        final Dialog dialog2 = new Dialog(activity);
        dialog2.setOwnerActivity(activity);
        dialog2.requestWindowFeature(1);
        View viewInflate = LayoutInflater.from(activity).inflate(R$layout.virus_neeeex_dialog_disclosure, (ViewGroup) null, false);
        dialog2.setContentView(viewInflate);
        dialog2.setCancelable(false);
        ((TextView) viewInflate.findViewById(R$id.virus_neeeex_disclosure_trustlook_policy)).setOnClickListener(new View.OnClickListener() { // from class: com.neeeex.virus.f
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                l.f(activity, view);
            }
        });
        ((TextView) viewInflate.findViewById(R$id.virus_neeeex_disclosure_app_policy)).setOnClickListener(new View.OnClickListener() { // from class: com.neeeex.virus.g
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                l.b(activity, view);
            }
        });
        ((TextView) viewInflate.findViewById(R$id.virus_neeeex_disclosure_cancel)).setOnClickListener(new View.OnClickListener() { // from class: com.neeeex.virus.h
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                l.a(dialog2, view);
            }
        });
        ((TextView) viewInflate.findViewById(R$id.virus_neeeex_disclosure_agree)).setOnClickListener(new View.OnClickListener() { // from class: com.neeeex.virus.i
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                l.c(activity, r0Var, dialog2, runnable, view);
            }
        });
        dialog2.setOnShowListener(new DialogInterface.OnShowListener() { // from class: com.neeeex.virus.j
            @Override // android.content.DialogInterface.OnShowListener
            public final void onShow(DialogInterface dialogInterface) {
                l.e(dialog2, activity, dialogInterface);
            }
        });
        LifecycleOwner lifecycleOwner = activity instanceof LifecycleOwner ? (LifecycleOwner) activity : null;
        final Lifecycle lifecycle = lifecycleOwner != null ? lifecycleOwner.getLifecycle() : null;
        final a aVar = new a(r0Var2, dialog2);
        dialog2.setOnDismissListener(new DialogInterface.OnDismissListener() { // from class: com.neeeex.virus.k
            @Override // android.content.DialogInterface.OnDismissListener
            public final void onDismiss(DialogInterface dialogInterface) {
                l.d(lifecycle, aVar, dialog2, r0Var, r0Var2, activity, runnable2, dialogInterface);
            }
        });
        f66703e = new WeakReference(dialog2);
        if (lifecycle != null) {
            lifecycle.addObserver(aVar);
        }
        dialog2.show();
    }

    public final void h(Dialog dialog) {
        if (dialog.isShowing()) {
            Window window = dialog.getWindow();
            View decorView = window != null ? window.getDecorView() : null;
            try {
                dialog.dismiss();
            } catch (IllegalArgumentException e10) {
                if (decorView != null && decorView.isAttachedToWindow()) {
                    throw e10;
                }
                m0.a("rEXpUXjV5yqZQPRXfuPrHZNN90ts\n", "+iybJAuRjlk=\n");
                m0.a("QnaAMWlq471vcYUycS20q3U/gDF0aKKufz+FOHJsoKJjew==\n", "Bh/hXQYNw8o=\n");
            }
        }
    }

    public final boolean i(Activity activity) {
        return activity.getSharedPreferences(f66700b, 0).getBoolean(f66701c, false);
    }

    public final void j(Activity activity, String str) {
        if (k0.r0(str)) {
            return;
        }
        try {
            fl.u.a aVar = fl.u.Companion;
            activity.startActivity(new Intent(m0.a("bVVnYs/KknFlVXd1ztfYPm9Pan/OjaAWSWw=\n", "DDsDEKCj9l8=\n"), Uri.parse(str)));
            fl.u.m372constructorimpl(fl.m0.f80959a);
        } catch (Throwable th2) {
            fl.u.a aVar2 = fl.u.Companion;
            fl.u.m372constructorimpl(fl.v.a(th2));
        }
    }
}