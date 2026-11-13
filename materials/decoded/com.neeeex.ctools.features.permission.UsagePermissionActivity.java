package com.neeeex.ctools.features.permission;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import androidx.appcompat.app.AppCompatActivity;
import coil.util.j;
import com.mbridge.msdk.foundation.download.core.DownloadCommon;
import com.neeeex.ctools.features.loading.CtoolsLoadingNEEEEXActivity;
import com.neeeex.ctools.features.permission.UsagePermissionActivity;
import com.neeeex.eraser.ads.e;
import com.neeeex.eraser.m0;
import com.varbto.utils.api.UtilConst;
import fl.n;
import fl.o;
import fl.q;
import java.util.Iterator;
import p003kotlin.Metadata;
import p003kotlin.jvm.functions.Function0;
import p003kotlin.jvm.internal.m;
import p003kotlin.jvm.internal.v;
import yh.a;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u0000 12\u00020\u0001:\u000223B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0019\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0014¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\u000b\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\tH\u0014¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\r\u001a\u00020\u0006H\u0014¢\u0006\u0004\b\r\u0010\u0003J\u000f\u0010\u000e\u001a\u00020\u0006H\u0014¢\u0006\u0004\b\u000e\u0010\u0003J\u000f\u0010\u000f\u001a\u00020\u0006H\u0014¢\u0006\u0004\b\u000f\u0010\u0003J\u0017\u0010\u0011\u001a\u00020\u00062\u0006\u0010\u0010\u001a\u00020\tH\u0002¢\u0006\u0004\b\u0011\u0010\fJ\u0019\u0010\u0015\u001a\u0004\u0018\u00010\u00142\u0006\u0010\u0013\u001a\u00020\u0012H\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\u000f\u0010\u0017\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0017\u0010\u0003J\u000f\u0010\u0018\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0018\u0010\u0003J\u000f\u0010\u0019\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0019\u0010\u0003J\u000f\u0010\u001a\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u001a\u0010\u0003J\u000f\u0010\u001b\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u001b\u0010\u0003R\u0016\u0010\u001f\u001a\u00020\u001c8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR\u0016\u0010\"\u001a\u00020\u00148\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b \u0010!R\u0016\u0010&\u001a\u00020#8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b$\u0010%R\u001b\u0010,\u001a\u00020'8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b(\u0010)\u001a\u0004\b*\u0010+R\u0018\u00100\u001a\u0004\u0018\u00010-8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b.\u0010/¨\u00064"}, d2 = {"Lcom/neeeex/ctools/features/permission/UsagePermissionActivity;", "Landroidx/appcompat/app/AppCompatActivity;", "<init>", "()V", "Landroid/os/Bundle;", "savedInstanceState", "Lfl/m0;", "onCreate", "(Landroid/os/Bundle;)V", "Landroid/content/Intent;", "intent", "onNewIntent", "(Landroid/content/Intent;)V", "onResume", "onStop", "onDestroy", "source", "T", "", "value", "Lei/b;", UtilConst.CRASH_CAT_S, "(Ljava/lang/String;)Lei/b;", "P", "M", "N", "Q", "R", "Lyh/a;", "c", "Lyh/a;", "access", "d", "Lei/b;", "destination", "Lcom/neeeex/ctools/features/permission/UsagePermissionActivity$b;", "e", "Lcom/neeeex/ctools/features/permission/UsagePermissionActivity$b;", "journey", "Landroid/os/Handler;", "f", "Lfl/n;", "O", "()Landroid/os/Handler;", "mainHandler", "Ljava/lang/Runnable;", "g", "Ljava/lang/Runnable;", "permissionPoll", "h", DownloadCommon.DOWNLOAD_REPORT_FIND_FILE_RESULT_VALUE_B, "a", "tool-feature_productionRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class UsagePermissionActivity extends AppCompatActivity {

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    public a access;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    public ei.b destination;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    public b journey = b.Initial;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    public final n mainHandler = o.a(q.NONE, new Function0() { // from class: ei.a
        @Override // p003kotlin.jvm.functions.Function0
        public final Object invoke() {
            return UsagePermissionActivity.I();
        }
    });

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    public Runnable permissionPoll;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final String f64565i = "extra_usage_permission_target" /* decoded XOR */;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final String f64566j = "extra_auto_open_usage_settings" /* decoded XOR */;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final String f64567k = "extra_usage_permission_granted_return" /* decoded XOR */;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    public enum b {
        Initial,
        SettingsForeground,
        SettingsBackgrounded,
        Complete;


        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ ml.a f64574b = ml.b.a(d());

        public static ml.a getEntries() {
            return f64574b;
        }
    }

    public static final class c implements Runnable {
        public c() {
        }

        @Override // java.lang.Runnable
        public void run() {
            a aVar = UsagePermissionActivity.this.access;
            if (aVar == null) {
                v.n("access" /* decoded XOR */);
                aVar = null;
            }
            boolean zB = aVar.b();
            UsagePermissionActivity usagePermissionActivity = UsagePermissionActivity.this;
            if (zB) {
                usagePermissionActivity.Q();
            } else {
                usagePermissionActivity.O().postDelayed(this, 300L);
            }
        }
    }

    public static Handler I() {
        return new Handler(Looper.getMainLooper());
    }

    public final void M() {
        N();
        this.permissionPoll = new c();
        Handler handlerO = O();
        Runnable runnable = this.permissionPoll;
        if (runnable != null) {
            handlerO.postDelayed(runnable, 300L);
        } else {
            s0.q.a("Required value was null." /* decoded XOR */);
        }
    }

    public final void N() {
        Runnable runnable = this.permissionPoll;
        if (runnable != null) {
            O().removeCallbacks(runnable);
        }
        this.permissionPoll = null;
    }

    public final Handler O() {
        return (Handler) this.mainHandler.getValue();
    }

    public final void P() {
        if (this.journey != b.Initial) {
            return;
        }
        this.journey = b.SettingsForeground;
        a aVar = this.access;
        if (aVar == null) {
            v.n("access" /* decoded XOR */);
            aVar = null;
        }
        startActivity(aVar.e());
        M();
    }

    public final void Q() {
        N();
        e.K = false;
        Intent intent = new Intent(this, (Class<?>) UsagePermissionActivity.class);
        String str = f64565i;
        ei.b bVar = this.destination;
        if (bVar == null) {
            v.n("destination" /* decoded XOR */);
            bVar = null;
        }
        Intent intentPutExtra = intent.putExtra(str, bVar.name()).putExtra(f64567k, true);
        "putExtra(...)" /* decoded XOR */;
        intentPutExtra.getClass();
        intentPutExtra.setFlags(67239936);
        startActivity(intentPutExtra);
    }

    public final void R() {
        b bVar = this.journey;
        b bVar2 = b.Complete;
        if (bVar == bVar2) {
            return;
        }
        this.journey = bVar2;
        N();
        CtoolsLoadingNEEEEXActivity.Companion companion = CtoolsLoadingNEEEEXActivity.INSTANCE;
        ei.b bVar3 = this.destination;
        if (bVar3 == null) {
            v.n("destination" /* decoded XOR */);
            bVar3 = null;
        }
        startActivity(companion.a(this, bVar3.loadingTarget$tool_feature_productionRelease()));
        finish();
    }

    public final ei.b S(String value) {
        Object next;
        Iterator<E> it = ei.b.getEntries().iterator();
        while (it.hasNext()) {
            next = it.next();
            if (v.c(((ei.b) next).name(), value)) {
                return (ei.b) next;
            }
        }
        next = null;
        return (ei.b) next;
    }

    public final void T(Intent source) {
        ei.b bVarS;
        String stringExtra = source.getStringExtra(f64565i);
        if (stringExtra == null || (bVarS = S(stringExtra)) == null) {
            bVarS = ei.b.RECENT_APPS;
        }
        this.destination = bVarS;
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Intent intent = getIntent();
        "getIntent(...)" /* decoded XOR */;
        intent.getClass();
        T(intent);
        Context applicationContext = getApplicationContext();
        "getApplicationContext(...)" /* decoded XOR */;
        applicationContext.getClass();
        a aVar = new a(applicationContext);
        this.access = aVar;
        if (aVar.b()) {
            R();
        } else {
            P();
        }
    }

    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        N();
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void onNewIntent(Intent intent) {
        "intent" /* decoded XOR */;
        intent.getClass();
        super.onNewIntent(intent);
        setIntent(intent);
        T(intent);
        if (intent.getBooleanExtra(f64567k, false)) {
            R();
        }
    }

    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onResume() {
        super.onResume();
        if (this.journey == b.SettingsBackgrounded) {
            a aVar = this.access;
            if (aVar == null) {
                v.n("access" /* decoded XOR */);
                aVar = null;
            }
            boolean zB = aVar.b();
            if (zB) {
                R();
            } else if (zB) {
                j.a();
            } else {
                finish();
            }
        }
    }

    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onStop() {
        super.onStop();
        if (this.journey == b.SettingsForeground) {
            this.journey = b.SettingsBackgrounded;
        }
    }

    /* JADX INFO: renamed from: com.neeeex.ctools.features.permission.UsagePermissionActivity$a, reason: from kotlin metadata */
    public static final class Companion {
        public /* synthetic */ Companion(m mVar) {
            this();
        }

        public final Intent a(Context context, ei.b bVar) {
            "context" /* decoded XOR */;
            context.getClass();
            "target" /* decoded XOR */;
            bVar.getClass();
            Intent intentPutExtra = b(context, bVar).putExtra("extra_auto_open_usage_settings" /* decoded XOR */, true);
            "putExtra(...)" /* decoded XOR */;
            intentPutExtra.getClass();
            return intentPutExtra;
        }

        public final Intent b(Context context, ei.b bVar) {
            "context" /* decoded XOR */;
            context.getClass();
            "target" /* decoded XOR */;
            bVar.getClass();
            Intent intentPutExtra = new Intent(context, (Class<?>) UsagePermissionActivity.class).putExtra("extra_usage_permission_target" /* decoded XOR */, bVar.name());
            "putExtra(...)" /* decoded XOR */;
            intentPutExtra.getClass();
            return intentPutExtra;
        }

        public Companion() {
        }
    }
}