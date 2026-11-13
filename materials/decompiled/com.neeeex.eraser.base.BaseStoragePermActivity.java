package com.neeeex.eraser.base;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.os.Environment;
import android.os.Handler;
import android.os.Looper;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.l0;
import androidx.p002lifecycle.LifecycleOwnerKt;
import com.mbridge.msdk.foundation.download.core.DownloadCommon;
import com.neeeex.eraser.R$string;
import com.neeeex.eraser.m0;
import com.neeeex.eraser.module.dialog.FilePermDialog;
import com.neeeex.eraser.module.main.FileNEEEEXPermActivity;
import com.neeeex.eraser.utils.b0;
import fl.q;
import fl.u;
import fl.v;
import gq.v0;
import kotlinx.coroutines.p0;
import kotlinx.coroutines.z0;
import p003kotlin.Metadata;
import p003kotlin.jvm.functions.Function0;
import p003kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0015\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\n\b&\u0018\u0000 42\u00020\u0001:\u0003567B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0014¢\u0006\u0004\b\u0005\u0010\u0003J\u000f\u0010\u0006\u001a\u00020\u0004H\u0014¢\u0006\u0004\b\u0006\u0010\u0003J\u0017\u0010\t\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0007H\u0014¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\u000b\u001a\u00020\u0004H&¢\u0006\u0004\b\u000b\u0010\u0003J\u001f\u0010\u000e\u001a\u00020\u00042\u0010\b\u0002\u0010\r\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\f¢\u0006\u0004\b\u000e\u0010\u000fJ\u0015\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b\u0013\u0010\u0014J\r\u0010\u0015\u001a\u00020\u0004¢\u0006\u0004\b\u0015\u0010\u0003J)\u0010\u001a\u001a\u00020\u00042\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0018\u001a\u00020\u00162\b\u0010\u0019\u001a\u0004\u0018\u00010\u0007H\u0014¢\u0006\u0004\b\u001a\u0010\u001bJ/\u0010!\u001a\u00020\u00042\u0006\u0010\u0017\u001a\u00020\u00162\u000e\u0010\u001e\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u001d0\u001c2\u0006\u0010 \u001a\u00020\u001fH\u0016¢\u0006\u0004\b!\u0010\"J\u000f\u0010#\u001a\u00020\u0004H\u0002¢\u0006\u0004\b#\u0010\u0003J\u000f\u0010$\u001a\u00020\u0004H\u0002¢\u0006\u0004\b$\u0010\u0003J\u0011\u0010&\u001a\u0004\u0018\u00010%H\u0002¢\u0006\u0004\b&\u0010'J\u000f\u0010)\u001a\u00020(H\u0002¢\u0006\u0004\b)\u0010*J\u000f\u0010+\u001a\u00020\u0004H\u0002¢\u0006\u0004\b+\u0010\u0003J\u000f\u0010,\u001a\u00020\u0004H\u0002¢\u0006\u0004\b,\u0010\u0003J\u000f\u0010-\u001a\u00020\u0004H\u0002¢\u0006\u0004\b-\u0010\u0003R\u001b\u00103\u001a\u00020.8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b/\u00100\u001a\u0004\b1\u00102¨\u00068"}, d2 = {"Lcom/neeeex/eraser/base/BaseStoragePermActivity;", "Lcom/neeeex/eraser/base/BaseAdActivity;", "<init>", "()V", "Lfl/m0;", "onResume", "onDestroy", "Landroid/content/Intent;", "intent", "onNewIntent", "(Landroid/content/Intent;)V", "onStoragePermission", "Lkotlin/Function0;", "onClose", "askPermission", "(Lkotlin/jvm/functions/Function0;)V", "Landroid/content/Context;", "context", "", "checkStoragePermission", "(Landroid/content/Context;)Z", "stopPermissionCheck", "", "requestCode", "resultCode", "data", "onActivityResult", "(IILandroid/content/Intent;)V", "", "", "permissions", "", "grantResults", "onRequestPermissionsResult", "(I[Ljava/lang/String;[I)V", "F0", "y0", "Lcom/neeeex/eraser/module/dialog/FilePermDialog;", "w0", "()Lcom/neeeex/eraser/module/dialog/FilePermDialog;", "Lcom/neeeex/eraser/base/BaseStoragePermActivity$b;", "D0", "()Lcom/neeeex/eraser/base/BaseStoragePermActivity$b;", "B0", "A0", "C0", "Lcom/neeeex/eraser/base/BaseStoragePermActivity$c;", "permissionPoller$delegate", "Lfl/n;", "z0", "()Lcom/neeeex/eraser/base/BaseStoragePermActivity$c;", "permissionPoller", "Companion", DownloadCommon.DOWNLOAD_REPORT_FIND_FILE_RESULT_VALUE_B, "c", "a", "tool-feature_productionRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public abstract class BaseStoragePermActivity extends BaseAdActivity {
    private static final int PERM_REQ_LEGACY = 40002;
    private static final int PERM_REQ_R = 40001;

    /* JADX INFO: renamed from: permissionPoller$delegate, reason: from kotlin metadata */
    private final fl.n permissionPoller = fl.o.a(q.NONE, new Function0() { // from class: com.neeeex.eraser.base.c
        @Override // p003kotlin.jvm.functions.Function0
        public final Object invoke() {
            return BaseStoragePermActivity.u0(this.f65023a);
        }
    });
    private static final String KEY_MANAGE_STORAGE_GUIDE_SHOWN = m0.a("qlaVZP4pM+izWIlk/ikz/LJen2DGPwT0sFk=\n", "xzf7BZlMbJs=\n");

    public enum b {
        MANAGE_ALL_FILES,
        LEGACY_RUNTIME;


        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ ml.a f65012b = ml.b.a(d());

        public static ml.a getEntries() {
            return f65012b;
        }
    }

    public static final /* synthetic */ class d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f65019a;

        static {
            int[] iArr = new int[b.values().length];
            try {
                iArr[b.MANAGE_ALL_FILES.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[b.LEGACY_RUNTIME.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f65019a = iArr;
        }
    }

    public static final class e extends ll.m implements tl.n {
        int label;

        public e(kl.f<? super e> fVar) {
            super(2, fVar);
        }

        @Override // ll.a
        public final kl.f<fl.m0> create(Object obj, kl.f<?> fVar) {
            return BaseStoragePermActivity.this.new e(fVar);
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
                v.b(obj);
                this.label = 1;
                if (z0.b(300L, this) == objF) {
                    return objF;
                }
            } else {
                if (i10 != 1) {
                    v0.a(m0.a("rGfoh7dTDx/odOGY4koFGO9k4Y34VQUf6G/qnfhMBRjvce2f/wcDUL1p8Z/+SQU=\n", "zwaE65cnYD8=\n"));
                    return null;
                }
                v.b(obj);
            }
            b0.f66131a.z(m0.a("3+pRWGJ/hIDG5E1YYn+ElMfiW1xaabOcxeU=\n", "sos/OQUa2/M=\n"), true);
            FileNEEEEXPermActivity.INSTANCE.a(BaseStoragePermActivity.this);
            return fl.m0.f80959a;
        }
    }

    public static final boolean E0(BaseStoragePermActivity baseStoragePermActivity) {
        return baseStoragePermActivity.checkStoragePermission(baseStoragePermActivity);
    }

    public static /* synthetic */ void askPermission$default(BaseStoragePermActivity baseStoragePermActivity, Function0 function0, int i10, Object obj) {
        if (obj != null) {
            gq.o.a(m0.a("Pikqpka4hAoBMCnjQ/GTA004P6VV7YsfTT0opEH1ggUZL3qtW+zHGBgsKqxG7IIPTTU040DwjhhN\nKDuxU/2TR006L61X7I4EA2Z6okfztw4fMTOwR/GIBQ==\n", "bVxawzSY52s=\n"));
            return;
        }
        if ((i10 & 1) != 0) {
            function0 = null;
        }
        baseStoragePermActivity.askPermission(function0);
    }

    public static c u0(final BaseStoragePermActivity baseStoragePermActivity) {
        return new c(new Function0() { // from class: com.neeeex.eraser.base.f
            @Override // p003kotlin.jvm.functions.Function0
            public final Object invoke() {
                return Boolean.valueOf(BaseStoragePermActivity.E0(this.f65026a));
            }
        }, new f(baseStoragePermActivity));
    }

    public static void v0(BaseStoragePermActivity baseStoragePermActivity) {
        mi.a.f88870a.T();
        baseStoragePermActivity.F0();
    }

    public static final void x0(Function0 function0) {
        function0.invoke();
    }

    public final void A0() {
        j2.b.f(this, new String[]{m0.a("KQBvPAGJUR44C3kjB5NGWScAJRk8qWF1FytTGiuye3EEMVgaIbJ0dw0=\n", "SG4LTm7gNTA=\n"), m0.a("zAMIqagUexjdCB62rg5sX8IDQomCPFtp6DU4npUzXnryPjiUlTxYcw==\n", "rW1s28d9HzY=\n")}, PERM_REQ_LEGACY);
    }

    public final void B0() {
        Object objM372constructorimpl;
        Intent intent = new Intent(m0.a("sZMaAScUVz+jmAoHIRNUYv6wPz0JOnZOka0uLAkxf06WtDI2GyJyUpO4LSAXLXZDnbQtIAEyfQ==\n", "0P1+c0h9MxE=\n"));
        intent.addCategory(m0.a("Rhk4FEikeC1OGSgDSbkyYEYDOQFIv2UtYzIaJ3KBSA==\n", "J3dcZifNHAM=\n"));
        intent.setData(Uri.parse("package:" + getApplicationContext().getPackageName()));
        try {
            u.a aVar = u.Companion;
            startActivityForResult(intent, PERM_REQ_R);
            if (!b0.f66131a.s(KEY_MANAGE_STORAGE_GUIDE_SHOWN, false)) {
                kotlinx.coroutines.k.d(LifecycleOwnerKt.getLifecycleScope(this), null, null, new e(null), 3, null);
            }
            objM372constructorimpl = u.m372constructorimpl(fl.m0.f80959a);
        } catch (Throwable th2) {
            u.a aVar2 = u.Companion;
            objM372constructorimpl = u.m372constructorimpl(v.a(th2));
        }
        if (!u.m378isSuccessimpl(objM372constructorimpl)) {
            startActivityForResult(new Intent(m0.a("GLNhnBW/RekKuHGaE7hGtFeQRKA7kWSYOJFJsTyfbYIqgkStOZNylCaNQLw3n3KUMJJL\n", "ed0F7nrWIcc=\n")), PERM_REQ_R);
        }
        z0().d();
    }

    public final void C0() {
        com.neeeex.eraser.ads.e.b0().R0();
        Intent intent = new Intent(this, getClass());
        intent.putExtra(m0.a("3uVrcL588vrPwmx2sFH08t7Cb2etTg==\n", "u50fAt8jlZU=\n"), true);
        intent.setFlags(604110848);
        startActivity(intent);
    }

    public final b D0() {
        return Build.VERSION.SDK_INT >= 30 ? b.MANAGE_ALL_FILES : b.LEGACY_RUNTIME;
    }

    public final void F0() {
        int i10 = d.f65019a[D0().ordinal()];
        if (i10 == 1) {
            B0();
        } else if (i10 == 2) {
            A0();
        } else {
            coil.util.j.a();
        }
    }

    public final void askPermission(final Function0 onClose) {
        Fragment fragmentK0 = getSupportFragmentManager().k0(FilePermDialog.class.getName());
        if (fragmentK0 == null || !fragmentK0.isAdded() || fragmentK0.isRemoving()) {
            fragmentK0 = null;
        }
        FilePermDialog filePermDialog = fragmentK0 instanceof FilePermDialog ? (FilePermDialog) fragmentK0 : null;
        FilePermDialog filePermDialogA = filePermDialog == null ? FilePermDialog.INSTANCE.a(R$string.dialog_neeeex_file_perm_title, R$string.dialog_neeeex_file_perm_content, R$string.dialog_neeeex_file_perm_agree) : filePermDialog;
        filePermDialogA.q(new ki.a() { // from class: com.neeeex.eraser.base.d
            @Override // ki.a
            public final void a() {
                BaseStoragePermActivity.v0(this.f65024a);
            }
        });
        filePermDialogA.r(onClose != null ? new ki.a() { // from class: com.neeeex.eraser.base.e
            @Override // ki.a
            public final void a() {
                BaseStoragePermActivity.x0(onClose);
            }
        } : null);
        filePermDialogA.s(false);
        if (filePermDialog == null) {
            mi.a.f88870a.V();
            l0 supportFragmentManager = getSupportFragmentManager();
            m0.a("v6FzMA5pLSiqsEERGn4wIrawSgIVeDoiquwpTVUw\n", "2MQHY3sZXUc=\n");
            supportFragmentManager.getClass();
            filePermDialogA.i(supportFragmentManager);
        }
    }

    public final boolean checkStoragePermission(Context context) {
        m0.a("h2tbSb0oQA==\n", "5AQ1PdhQNPY=\n");
        context.getClass();
        if (Build.VERSION.SDK_INT >= 30) {
            return Environment.isExternalStorageManager();
        }
        String[] strArr = {m0.a("n8WCVsXiaLGOzpRJw/h/9pHFyHbvykjAu/OyYfjFTdOh+LJr+MpL2g==\n", "/qvmJKqLDJ8=\n"), m0.a("CgfKTVvRnwwbDNxSXcuISwQHgGhm8a9nNCz2a3HqtWMnNv1re+q6ZS4=\n", "a2muPzS4+yI=\n")};
        for (int i10 = 0; i10 < 2; i10++) {
            if (l2.a.checkSelfPermission(context, strArr[i10]) != 0) {
                return false;
            }
        }
        return true;
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
    }

    @Override // com.neeeex.eraser.base.BaseAdActivity, com.neeeex.eraser.base.RootActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        z0().e();
    }

    @Override // com.neeeex.eraser.base.RootActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onNewIntent(Intent intent) {
        m0.a("a4zT2u1y\n", "AuKnv4MGFsU=\n");
        intent.getClass();
        super.onNewIntent(intent);
        setIntent(intent);
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onRequestPermissionsResult(int requestCode, String[] permissions, int[] grantResults) {
        m0.a("zu10AnT38vbR5nU=\n", "vogGbx2EgZ8=\n");
        permissions.getClass();
        m0.a("cUmvRnI27wxjV7pb\n", "FjvOKAZkin8=\n");
        grantResults.getClass();
        super.onRequestPermissionsResult(requestCode, permissions, grantResults);
        if (requestCode != PERM_REQ_LEGACY) {
            return;
        }
        if ((grantResults.length == 0) || grantResults[0] != 0) {
            return;
        }
        y0();
        mi.a.f88870a.U();
        onStoragePermission();
    }

    @Override // com.neeeex.eraser.base.BaseAdActivity, com.neeeex.eraser.base.RootActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onResume() {
        super.onResume();
        z0().e();
        boolean z10 = false;
        boolean booleanExtra = getIntent().getBooleanExtra(m0.a("rhmfL6yLSLS/PpgpoqZOvK4+mzi/uQ==\n", "y2HrXc3UL9s=\n"), false);
        if (w0() != null && checkStoragePermission(this)) {
            z10 = true;
        }
        if (booleanExtra || z10) {
            getIntent().removeExtra(m0.a("xyi1Jn6zUSTWD7IgcJ5XLMcPsTFtgQ==\n", "olDBVB/sNks=\n"));
            y0();
            mi.a.f88870a.U();
            onStoragePermission();
        }
    }

    public abstract void onStoragePermission();

    public final void stopPermissionCheck() {
        z0().e();
    }

    public final FilePermDialog w0() {
        Fragment fragmentK0 = getSupportFragmentManager().k0(FilePermDialog.class.getName());
        if (fragmentK0 instanceof FilePermDialog) {
            return (FilePermDialog) fragmentK0;
        }
        return null;
    }

    public final void y0() {
        FilePermDialog filePermDialogW0 = w0();
        if (filePermDialogW0 != null) {
            filePermDialogW0.g();
        }
    }

    public final c z0() {
        return (c) this.permissionPoller.getValue();
    }

    public static final class c {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public static final a f65013e = new a(null);

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Function0 f65014a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Function0 f65015b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final Handler f65016c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public Runnable f65017d;

        public static final class b implements Runnable {
            public b() {
            }

            @Override // java.lang.Runnable
            public void run() {
                boolean zBooleanValue = ((Boolean) c.this.f65014a.invoke()).booleanValue();
                c cVar = c.this;
                if (zBooleanValue) {
                    cVar.f65015b.invoke();
                } else {
                    cVar.f65016c.postDelayed(this, 300L);
                }
            }
        }

        public c(Function0 function0, Function0 function1) {
            m0.a("gSncbrOy8n6M\n", "6FqbHNLchhs=\n");
            function0.getClass();
            m0.a("6VyUze3jOlzi\n", "hjLTv4yNTjk=\n");
            function1.getClass();
            this.f65014a = function0;
            this.f65015b = function1;
            this.f65016c = new Handler(Looper.getMainLooper());
        }

        public final void d() {
            e();
            b bVar = new b();
            this.f65016c.post(bVar);
            this.f65017d = bVar;
        }

        public final void e() {
            Runnable runnable = this.f65017d;
            if (runnable != null) {
                this.f65016c.removeCallbacks(runnable);
            }
            this.f65017d = null;
        }

        public static final class a {
            public /* synthetic */ a(p003kotlin.jvm.internal.m mVar) {
                this();
            }

            public a() {
            }
        }
    }

    public static final /* synthetic */ class f extends s implements Function0 {
        public f(Object obj) {
            super(0, obj, BaseStoragePermActivity.class, m0.a("4AHEHfIaGUXMAdEfwhIZSN4FwBnTFwxH\n", "jmCydJV7bSA=\n"), m0.a("ZYIELy47a3lJghEtHjNrdFuGACsPNn57I8ok\n", "C+NyRklaHxw=\n"), 0);
        }

        /* JADX INFO: renamed from: invoke, reason: collision with other method in class */
        public final void m164invoke() {
            ((BaseStoragePermActivity) this.receiver).C0();
        }

        @Override // p003kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Object invoke() {
            m164invoke();
            return fl.m0.f80959a;
        }
    }
}