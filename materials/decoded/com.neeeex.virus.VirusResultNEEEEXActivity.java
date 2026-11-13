package com.neeeex.virus;

import android.content.Intent;
import android.content.pm.PackageManager;
import android.media.MediaScannerConnection;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;
import androidx.core.view.c1;
import androidx.p002lifecycle.LifecycleOwnerKt;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import b.k0;
import com.android.launcher3.AutoInstallsLayout;
import com.neeeex.eraser.R$drawable;
import com.neeeex.eraser.R$plurals;
import com.neeeex.eraser.R$string;
import com.neeeex.eraser.base.BaseAdActivity;
import com.neeeex.eraser.m0;
import com.neeeex.eraser.module.dialog.ReturnTipDialog;
import gq.v0;
import java.io.File;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import ji.l1;
import kotlinx.coroutines.f1;
import kotlinx.coroutines.l0;
import kotlinx.coroutines.p0;
import p003kotlin.Metadata;
import p003kotlin.jvm.functions.Function0;
import p003kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000h\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000 ?2\u00020\u0001:\u0001@B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0019\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0014¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\n\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\u0004H\u0014¢\u0006\u0004\b\n\u0010\bJ\u000f\u0010\u000b\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u000b\u0010\u0003J\u000f\u0010\f\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\f\u0010\u0003J\u0017\u0010\u000f\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\rH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0011\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\rH\u0002¢\u0006\u0004\b\u0011\u0010\u0010J\u0017\u0010\u0012\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\rH\u0002¢\u0006\u0004\b\u0012\u0010\u0010J\u001f\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0016\u001a\u00020\u0015H\u0002¢\u0006\u0004\b\u0018\u0010\u0019J\u0017\u0010\u001a\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\rH\u0002¢\u0006\u0004\b\u001a\u0010\u0010J\u000f\u0010\u001b\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u001b\u0010\u0003J\u0017\u0010\u001e\u001a\u00020\u00172\u0006\u0010\u001d\u001a\u00020\u001cH\u0002¢\u0006\u0004\b\u001e\u0010\u001fJ+\u0010$\u001a\u0012\u0012\u0004\u0012\u00020\r0\"j\b\u0012\u0004\u0012\u00020\r`#*\u00020 2\u0006\u0010!\u001a\u00020\u001cH\u0002¢\u0006\u0004\b$\u0010%J+\u0010&\u001a\u0012\u0012\u0004\u0012\u00020\r0\"j\b\u0012\u0004\u0012\u00020\r`#*\u00020\u00042\u0006\u0010!\u001a\u00020\u001cH\u0002¢\u0006\u0004\b&\u0010'J\u001d\u0010(\u001a\u0004\u0018\u00010\r*\u00020\u00042\u0006\u0010!\u001a\u00020\u001cH\u0002¢\u0006\u0004\b(\u0010)R\u0016\u0010-\u001a\u00020*8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b+\u0010,R\u0016\u00101\u001a\u00020.8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b/\u00100R$\u00104\u001a\u0012\u0012\u0004\u0012\u00020\r0\"j\b\u0012\u0004\u0012\u00020\r`#8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b2\u00103R\u0018\u00107\u001a\u0004\u0018\u00010\r8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b5\u00106R\u0016\u0010:\u001a\u00020\u00178\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b8\u00109R\u001a\u0010>\u001a\b\u0012\u0004\u0012\u00020 0;8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b<\u0010=¨\u0006A"}, d2 = {"Lcom/neeeex/virus/VirusResultNEEEEXActivity;", "Lcom/neeeex/eraser/base/BaseAdActivity;", "<init>", "()V", "Landroid/os/Bundle;", "savedInstanceState", "Lfl/m0;", "onCreate", "(Landroid/os/Bundle;)V", "outState", "onSaveInstanceState", "H0", "C0", "Lcom/neeeex/virus/e0;", "threat", "D0", "(Lcom/neeeex/virus/e0;)V", "O0", "E0", "Ljava/io/File;", "file", "", "scannedSize", "", "F0", "(Ljava/io/File;J)Z", "M0", "N0", "", AutoInstallsLayout.ATTR_PACKAGE_NAME, "G0", "(Ljava/lang/String;)Z", "Landroid/content/Intent;", com.thinkup.core.common.d0.q.d.f67742m, "Ljava/util/ArrayList;", "Lkotlin/collections/ArrayList;", "K0", "(Landroid/content/Intent;Ljava/lang/String;)Ljava/util/ArrayList;", "L0", "(Landroid/os/Bundle;Ljava/lang/String;)Ljava/util/ArrayList;", "J0", "(Landroid/os/Bundle;Ljava/lang/String;)Lcom/neeeex/virus/e0;", "Lji/l1;", "c", "Lji/l1;", "binding", "Lcom/neeeex/virus/m;", "d", "Lcom/neeeex/virus/m;", "adapter", "e", "Ljava/util/ArrayList;", "threats", "f", "Lcom/neeeex/virus/e0;", "pendingUninstall", "g", "Z", "exitInProgress", "Le/d;", "h", "Le/d;", "uninstallLauncher", "i", "a", "tool-feature_productionRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class VirusResultNEEEEXActivity extends BaseAdActivity {

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    public l1 binding;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    public m adapter;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    public e0 pendingUninstall;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    public boolean exitInProgress;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final String f66620j = "virus_neeeex_threats" /* decoded XOR */;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final String f66621k = "virus_neeeex_state_threats" /* decoded XOR */;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final String f66622l = "virus_neeeex_state_pending_uninstall" /* decoded XOR */;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    public final ArrayList threats = new ArrayList();

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    public final e.d uninstallLauncher = registerForActivityResult(new f.d(), new e.b() { // from class: com.neeeex.virus.p
        @Override // e.b
        public final void a(Object obj) {
            VirusResultNEEEEXActivity.v0(this.f66714a, (e.a) obj);
        }
    });

    public static final class b extends ll.m implements tl.n {
        final /* synthetic */ e0 $threat;
        Object L$0;
        int label;
        final /* synthetic */ VirusResultNEEEEXActivity this$0;

        public static final class a extends ll.m implements tl.n {
            final /* synthetic */ File $file;
            final /* synthetic */ e0 $threat;
            int label;
            final /* synthetic */ VirusResultNEEEEXActivity this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(VirusResultNEEEEXActivity virusResultNEEEEXActivity, File file, e0 e0Var, kl.f<? super a> fVar) {
                super(2, fVar);
                this.this$0 = virusResultNEEEEXActivity;
                this.$file = file;
                this.$threat = e0Var;
            }

            @Override // ll.a
            public final kl.f<fl.m0> create(Object obj, kl.f<?> fVar) {
                return new a(this.this$0, this.$file, this.$threat, fVar);
            }

            @Override // tl.n
            public final Object invoke(p0 p0Var, kl.f<? super Boolean> fVar) {
                return ((a) create(p0Var, fVar)).invokeSuspend(fl.m0.f80959a);
            }

            @Override // ll.a
            public final Object invokeSuspend(Object obj) {
                p003kotlin.coroutines.intrinsics.c.f();
                if (this.label == 0) {
                    fl.v.b(obj);
                    return ll.b.a(this.this$0.F0(this.$file, this.$threat.f()));
                }
                v0.a("call to 'resume' before 'invoke' with coroutine" /* decoded XOR */);
                return null;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(e0 e0Var, VirusResultNEEEEXActivity virusResultNEEEEXActivity, kl.f<? super b> fVar) {
            super(2, fVar);
            this.$threat = e0Var;
            this.this$0 = virusResultNEEEEXActivity;
        }

        @Override // ll.a
        public final kl.f<fl.m0> create(Object obj, kl.f<?> fVar) {
            return new b(this.$threat, this.this$0, fVar);
        }

        @Override // tl.n
        public final Object invoke(p0 p0Var, kl.f<? super fl.m0> fVar) {
            return ((b) create(p0Var, fVar)).invokeSuspend(fl.m0.f80959a);
        }

        @Override // ll.a
        public final Object invokeSuspend(Object obj) {
            File file;
            Object objF = p003kotlin.coroutines.intrinsics.c.f();
            int i10 = this.label;
            if (i10 == 0) {
                fl.v.b(obj);
                File file2 = new File(this.$threat.b());
                l0 l0VarB = f1.b();
                a aVar = new a(this.this$0, file2, this.$threat, null);
                this.L$0 = file2;
                this.label = 1;
                Object objG = kotlinx.coroutines.i.g(l0VarB, aVar, this);
                if (objG == objF) {
                    return objF;
                }
                file = file2;
                obj = objG;
            } else {
                if (i10 != 1) {
                    v0.a("call to 'resume' before 'invoke' with coroutine" /* decoded XOR */);
                    return null;
                }
                file = (File) this.L$0;
                fl.v.b(obj);
            }
            boolean zBooleanValue = ((Boolean) obj).booleanValue();
            VirusResultNEEEEXActivity virusResultNEEEEXActivity = this.this$0;
            if (zBooleanValue) {
                MediaScannerConnection.scanFile(virusResultNEEEEXActivity, new String[]{file.getAbsolutePath()}, null, null);
                this.this$0.M0(this.$threat);
            } else {
                Toast.makeText(virusResultNEEEEXActivity, R$string.virus_neeeex_delete_failed, 0).show();
            }
            return fl.m0.f80959a;
        }
    }

    public static final class d extends k0 {
        public d() {
            super(true);
        }

        @Override // b.k0
        public void handleOnBackPressed() {
            VirusResultNEEEEXActivity.this.H0();
        }
    }

    public static final void I0(VirusResultNEEEEXActivity virusResultNEEEEXActivity) {
        virusResultNEEEEXActivity.exitInProgress = true;
        zi.l.f104405a.b(virusResultNEEEEXActivity, "neeeex_pdf_clean_scan_exit_fs" /* decoded XOR */, zi.n.VIRUS_SCAN);
    }

    public static void s0(VirusResultNEEEEXActivity virusResultNEEEEXActivity, View view) {
        virusResultNEEEEXActivity.H0();
    }

    public static c1 t0(View view, c1 c1Var) {
        "view" /* decoded XOR */;
        view.getClass();
        "insets" /* decoded XOR */;
        c1Var.getClass();
        o2.d dVarF = c1Var.f(c1.p.i() | c1.p.c());
        "getInsets(...)" /* decoded XOR */;
        dVarF.getClass();
        view.setPadding(dVarF.f89980a, dVarF.f89981b, dVarF.f89982c, dVarF.f89983d);
        return c1Var;
    }

    public static fl.m0 u0(boolean z10, VirusResultNEEEEXActivity virusResultNEEEEXActivity, e0 e0Var) {
        if (z10) {
            virusResultNEEEEXActivity.O0(e0Var);
        } else {
            virusResultNEEEEXActivity.E0(e0Var);
        }
        return fl.m0.f80959a;
    }

    public static void v0(VirusResultNEEEEXActivity virusResultNEEEEXActivity, e.a aVar) {
        "it" /* decoded XOR */;
        aVar.getClass();
        e0 e0Var = virusResultNEEEEXActivity.pendingUninstall;
        if (e0Var == null) {
            return;
        }
        virusResultNEEEEXActivity.pendingUninstall = null;
        if (virusResultNEEEEXActivity.G0(e0Var.d())) {
            Toast.makeText(virusResultNEEEEXActivity, R$string.virus_neeeex_uninstall_failed, 0).show();
        } else {
            virusResultNEEEEXActivity.M0(e0Var);
        }
    }

    public static boolean x0(e0 e0Var, e0 e0Var2) {
        "it" /* decoded XOR */;
        e0Var2.getClass();
        return p003kotlin.jvm.internal.v.c(e0Var2.g(), e0Var.g());
    }

    public final void C0() {
        l1 l1Var = this.binding;
        if (l1Var == null) {
            p003kotlin.jvm.internal.v.n("binding" /* decoded XOR */);
            l1Var = null;
        }
        androidx.core.view.m0.w0(l1Var.getRoot(), new androidx.core.view.y() { // from class: com.neeeex.virus.t
            @Override // androidx.core.view.y
            public final c1 a(View view, c1 c1Var) {
                return VirusResultNEEEEXActivity.t0(view, c1Var);
            }
        });
    }

    public final void D0(final e0 threat) {
        final boolean z10 = threat.a() == f0.UNINSTALL;
        e eVar = e.f66670a;
        String string = getString(z10 ? R$string.virus_neeeex_uninstall_title : R$string.virus_neeeex_delete_title);
        "getString(...)" /* decoded XOR */;
        string.getClass();
        int i10 = z10 ? R$string.virus_neeeex_uninstall_message : R$string.virus_neeeex_delete_message;
        String strC = threat.c();
        if (p003kotlin.text.k0.r0(strC)) {
            strC = new File(threat.b()).getName();
        }
        String string2 = getString(i10, new Object[]{strC});
        "getString(...)" /* decoded XOR */;
        string2.getClass();
        String string3 = getString(z10 ? R$string.virus_neeeex_uninstall : R$string.virus_neeeex_delete);
        "getString(...)" /* decoded XOR */;
        string3.getClass();
        eVar.d(this, string, string2, string3, new Function0() { // from class: com.neeeex.virus.r
            @Override // p003kotlin.jvm.functions.Function0
            public final Object invoke() {
                return VirusResultNEEEEXActivity.u0(z10, this, threat);
            }
        });
    }

    public final void E0(e0 threat) {
        kotlinx.coroutines.k.d(LifecycleOwnerKt.getLifecycleScope(this), null, null, new b(threat, this, null), 3, null);
    }

    public final boolean F0(File file, long scannedSize) {
        Object objM372constructorimpl;
        boolean zDeleteIfExists = false;
        if (!file.isFile() || !p003kotlin.text.e0.F(ql.m.p(file), "apk" /* decoded XOR */, true)) {
            return false;
        }
        if (scannedSize > 0 && file.length() != scannedSize) {
            return false;
        }
        try {
            fl.u.a aVar = fl.u.Companion;
            Path pathNormalize = file.toPath().toAbsolutePath().normalize();
            if (!Files.isSymbolicLink(pathNormalize) && p003kotlin.jvm.internal.v.c(file.getCanonicalFile().toPath().normalize(), pathNormalize)) {
                zDeleteIfExists = Files.deleteIfExists(pathNormalize);
            }
            objM372constructorimpl = fl.u.m372constructorimpl(Boolean.valueOf(zDeleteIfExists));
        } catch (Throwable th2) {
            fl.u.a aVar2 = fl.u.Companion;
            objM372constructorimpl = fl.u.m372constructorimpl(fl.v.a(th2));
        }
        Boolean bool = Boolean.FALSE;
        if (fl.u.m377isFailureimpl(objM372constructorimpl)) {
            objM372constructorimpl = bool;
        }
        return ((Boolean) objM372constructorimpl).booleanValue();
    }

    public final boolean G0(String packageName) {
        if (p003kotlin.text.k0.r0(packageName)) {
            return false;
        }
        try {
            if (Build.VERSION.SDK_INT >= 33) {
                getPackageManager().getPackageInfo(packageName, PackageManager.PackageInfoFlags.of(0L));
                return true;
            }
            getPackageManager().getPackageInfo(packageName, 0);
            return true;
        } catch (PackageManager.NameNotFoundException unused) {
            return false;
        }
    }

    public final void H0() {
        if (this.exitInProgress) {
            return;
        }
        ReturnTipDialog returnTipDialogA = ReturnTipDialog.INSTANCE.a();
        returnTipDialogA.p(new ki.a() { // from class: com.neeeex.virus.s
            @Override // ki.a
            public final void a() {
                VirusResultNEEEEXActivity.I0(this.f66719a);
            }
        });
        androidx.fragment.app.l0 supportFragmentManager = getSupportFragmentManager();
        "getSupportFragmentManager(...)" /* decoded XOR */;
        supportFragmentManager.getClass();
        returnTipDialogA.i(supportFragmentManager);
    }

    public final e0 J0(Bundle bundle, String str) {
        return Build.VERSION.SDK_INT >= 33 ? (e0) bundle.getParcelable(str, e0.class) : (e0) bundle.getParcelable(str);
    }

    public final ArrayList K0(Intent intent, String str) {
        if (Build.VERSION.SDK_INT >= 33) {
            ArrayList parcelableArrayListExtra = intent.getParcelableArrayListExtra(str, e0.class);
            return parcelableArrayListExtra == null ? new ArrayList() : parcelableArrayListExtra;
        }
        ArrayList parcelableArrayListExtra2 = intent.getParcelableArrayListExtra(str);
        return parcelableArrayListExtra2 == null ? new ArrayList() : parcelableArrayListExtra2;
    }

    public final ArrayList L0(Bundle bundle, String str) {
        if (Build.VERSION.SDK_INT >= 33) {
            ArrayList parcelableArrayList = bundle.getParcelableArrayList(str, e0.class);
            return parcelableArrayList == null ? new ArrayList() : parcelableArrayList;
        }
        ArrayList parcelableArrayList2 = bundle.getParcelableArrayList(str);
        return parcelableArrayList2 == null ? new ArrayList() : parcelableArrayList2;
    }

    public final void M0(final e0 threat) {
        gl.b0.J(this.threats, new Function1() { // from class: com.neeeex.virus.q
            @Override // p003kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return Boolean.valueOf(VirusResultNEEEEXActivity.x0(threat, (e0) obj));
            }
        });
        getIntent().putParcelableArrayListExtra(f66620j, new ArrayList<>(this.threats));
        mi.a.f88870a.D1();
        N0();
        BaseAdActivity.showInter$default(this, "neeeex_pdf_clean_delete_complete_fs" /* decoded XOR */, null, 2, null);
    }

    public final void N0() {
        boolean zIsEmpty = this.threats.isEmpty();
        l1 l1Var = this.binding;
        m mVar = null;
        if (l1Var == null) {
            p003kotlin.jvm.internal.v.n("binding" /* decoded XOR */);
            l1Var = null;
        }
        l1Var.f85554e.setBackgroundResource(!zIsEmpty ? R$drawable.virus_neeeex_header_risk : R$drawable.virus_neeeex_header_safe);
        l1 l1Var2 = this.binding;
        if (l1Var2 == null) {
            p003kotlin.jvm.internal.v.n("binding" /* decoded XOR */);
            l1Var2 = null;
        }
        l1Var2.f85557h.setText(!zIsEmpty ? getResources().getQuantityString(R$plurals.virus_neeeex_result_count, this.threats.size(), Integer.valueOf(this.threats.size())) : getString(R$string.virus_neeeex_safe_title));
        l1 l1Var3 = this.binding;
        if (l1Var3 == null) {
            p003kotlin.jvm.internal.v.n("binding" /* decoded XOR */);
            l1Var3 = null;
        }
        l1Var3.f85556g.setText(getString(!zIsEmpty ? R$string.virus_neeeex_result_hint : R$string.virus_neeeex_safe_subtitle));
        l1 l1Var4 = this.binding;
        if (l1Var4 == null) {
            p003kotlin.jvm.internal.v.n("binding" /* decoded XOR */);
            l1Var4 = null;
        }
        l1Var4.f85553d.setVisibility(!zIsEmpty ? 0 : 8);
        l1 l1Var5 = this.binding;
        if (l1Var5 == null) {
            p003kotlin.jvm.internal.v.n("binding" /* decoded XOR */);
            l1Var5 = null;
        }
        l1Var5.f85558i.setVisibility(!zIsEmpty ? 0 : 8);
        l1 l1Var6 = this.binding;
        if (l1Var6 == null) {
            p003kotlin.jvm.internal.v.n("binding" /* decoded XOR */);
            l1Var6 = null;
        }
        l1Var6.f85552c.setVisibility(zIsEmpty ? 0 : 8);
        m mVar2 = this.adapter;
        if (mVar2 == null) {
            p003kotlin.jvm.internal.v.n("adapter" /* decoded XOR */);
        } else {
            mVar = mVar2;
        }
        mVar.i(gl.g0.f1(this.threats));
    }

    public final void O0(e0 threat) {
        if (p003kotlin.text.k0.r0(threat.d())) {
            Toast.makeText(this, R$string.virus_neeeex_uninstall_failed, 0).show();
            return;
        }
        this.pendingUninstall = threat;
        com.neeeex.eraser.ads.e.K = false;
        try {
            e.d dVar = this.uninstallLauncher;
            Intent intent = new Intent("android.intent.action.DELETE" /* decoded XOR */, Uri.parse("package:" + threat.d()));
            intent.putExtra("android.intent.extra.RETURN_RESULT" /* decoded XOR */, true);
            dVar.a(intent);
        } catch (Throwable unused) {
            this.pendingUninstall = null;
            Toast.makeText(this, R$string.virus_neeeex_uninstall_failed, 0).show();
        }
    }

    @Override // com.neeeex.eraser.base.RootActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle savedInstanceState) {
        ArrayList arrayListK0;
        super.onCreate(savedInstanceState);
        l1 l1VarC = l1.c(getLayoutInflater());
        "inflate(...)" /* decoded XOR */;
        l1VarC.getClass();
        this.binding = l1VarC;
        l1 l1Var = null;
        if (l1VarC == null) {
            p003kotlin.jvm.internal.v.n("binding" /* decoded XOR */);
            l1VarC = null;
        }
        setContentView(l1VarC.getRoot());
        C0();
        ArrayList arrayList = this.threats;
        if (savedInstanceState == null || (arrayListK0 = L0(savedInstanceState, f66621k)) == null) {
            Intent intent = getIntent();
            "getIntent(...)" /* decoded XOR */;
            intent.getClass();
            arrayListK0 = K0(intent, f66620j);
        }
        gl.b0.D(arrayList, arrayListK0);
        this.pendingUninstall = savedInstanceState != null ? J0(savedInstanceState, f66622l) : null;
        this.adapter = new m(new c(this));
        l1 l1Var2 = this.binding;
        if (l1Var2 == null) {
            p003kotlin.jvm.internal.v.n("binding" /* decoded XOR */);
            l1Var2 = null;
        }
        l1Var2.f85558i.setLayoutManager(new LinearLayoutManager(this));
        l1 l1Var3 = this.binding;
        if (l1Var3 == null) {
            p003kotlin.jvm.internal.v.n("binding" /* decoded XOR */);
            l1Var3 = null;
        }
        RecyclerView recyclerView = l1Var3.f85558i;
        m mVar = this.adapter;
        if (mVar == null) {
            p003kotlin.jvm.internal.v.n("adapter" /* decoded XOR */);
            mVar = null;
        }
        recyclerView.setAdapter(mVar);
        l1 l1Var4 = this.binding;
        if (l1Var4 == null) {
            p003kotlin.jvm.internal.v.n("binding" /* decoded XOR */);
        } else {
            l1Var = l1Var4;
        }
        l1Var.f85551b.setOnClickListener(new View.OnClickListener() { // from class: com.neeeex.virus.o
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                VirusResultNEEEEXActivity.s0(this.f66713a, view);
            }
        });
        getOnBackPressedDispatcher().d(this, new d());
        N0();
    }

    @Override // androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onSaveInstanceState(Bundle outState) {
        "outState" /* decoded XOR */;
        outState.getClass();
        outState.putParcelableArrayList(f66621k, new ArrayList<>(this.threats));
        outState.putParcelable(f66622l, this.pendingUninstall);
        super.onSaveInstanceState(outState);
    }

    public static final /* synthetic */ class c extends p003kotlin.jvm.internal.s implements Function1 {
        public c(Object obj) {
            super(1, obj, VirusResultNEEEEXActivity.class, "confirmAction" /* decoded XOR */, "confirmAction(Lcom/neeeex/virus/VirusThreat;)V" /* decoded XOR */, 0);
        }

        public final void invoke(e0 e0Var) {
            "p0" /* decoded XOR */;
            e0Var.getClass();
            ((VirusResultNEEEEXActivity) this.receiver).D0(e0Var);
        }

        @Override // p003kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((e0) obj);
            return fl.m0.f80959a;
        }
    }
}