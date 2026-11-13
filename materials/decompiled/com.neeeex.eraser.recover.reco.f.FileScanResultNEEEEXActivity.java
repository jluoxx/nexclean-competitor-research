package com.neeeex.eraser.recover.reco.f;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.FrameLayout;
import androidx.p002lifecycle.MutableLiveData;
import com.mbridge.msdk.foundation.download.core.DownloadCommon;
import com.neeeex.eraser.R$layout;
import com.neeeex.eraser.R$string;
import com.neeeex.eraser.base.BaseAdActivity;
import com.neeeex.eraser.module.dialog.ReturnTipDialog;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import p003kotlin.Metadata;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u0000 #2\u00020\u0001:\u0002$%B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0019\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0014¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\t\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\u0003J\u000f\u0010\n\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\n\u0010\u0003J\u001f\u0010\u000e\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0011\u001a\u00020\u0010H\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u0017\u0010\u0017\u001a\u00020\u00062\u0006\u0010\u0016\u001a\u00020\u0015H\u0002¢\u0006\u0004\b\u0017\u0010\u0018J\u000f\u0010\u0019\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0019\u0010\u0003R\u0016\u0010\u001c\u001a\u00020\u00128\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u0016\u0010\u001e\u001a\u00020\u00128\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001d\u0010\u001bR\u0016\u0010\"\u001a\u00020\u001f8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b \u0010!¨\u0006&"}, d2 = {"Lcom/neeeex/eraser/recover/reco/f/FileScanResultNEEEEXActivity;", "Lcom/neeeex/eraser/base/BaseAdActivity;", "<init>", "()V", "Landroid/os/Bundle;", "savedInstanceState", "Lfl/m0;", "onCreate", "(Landroid/os/Bundle;)V", "onBackPressed", "u0", "", "total", "expired", "x0", "(II)V", "", "createTime", "", "v0", "(J)Z", "Lcom/neeeex/eraser/recover/reco/f/FileScanResultNEEEEXActivity$b;", "model", "y0", "(Lcom/neeeex/eraser/recover/reco/f/FileScanResultNEEEEXActivity$b;)V", "z0", "c", "Z", "resultInterstitialShown", "d", "exitInProgress", "Lji/j;", "e", "Lji/j;", "binding", "f", DownloadCommon.DOWNLOAD_REPORT_FIND_FILE_RESULT_VALUE_B, "a", "tool-feature_productionRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class FileScanResultNEEEEXActivity extends BaseAdActivity {

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    public boolean resultInterstitialShown;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    public boolean exitInProgress;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    public ji.j binding;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final String f65616g = com.neeeex.eraser.m0.a("PtCqOKnSdD8E27Ylv+hkBzLGqg==\n", "W6jeSsiNAFg=\n");

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f65620a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f65621b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final int f65622c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final int f65623d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final int f65624e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final boolean f65625f;

        public b(int i10, int i11, int i12, int i13, int i14, boolean z10) {
            this.f65620a = i10;
            this.f65621b = i11;
            this.f65622c = i12;
            this.f65623d = i13;
            this.f65624e = i14;
            this.f65625f = z10;
        }

        public final int a() {
            return this.f65624e;
        }

        public final int b() {
            return this.f65622c;
        }

        public final boolean c() {
            return this.f65625f;
        }

        public final int d() {
            return this.f65621b;
        }

        public final int e() {
            return this.f65623d;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return this.f65620a == bVar.f65620a && this.f65621b == bVar.f65621b && this.f65622c == bVar.f65622c && this.f65623d == bVar.f65623d && this.f65624e == bVar.f65624e && this.f65625f == bVar.f65625f;
        }

        public final int f() {
            return this.f65620a;
        }

        public int hashCode() {
            return (((((((((Integer.hashCode(this.f65620a) * 31) + Integer.hashCode(this.f65621b)) * 31) + Integer.hashCode(this.f65622c)) * 31) + Integer.hashCode(this.f65623d)) * 31) + Integer.hashCode(this.f65624e)) * 31) + Boolean.hashCode(this.f65625f);
        }

        public String toString() {
            return "ResultModel(total=" + this.f65620a + ", reportCode=" + this.f65621b + ", emptyVisibility=" + this.f65622c + ", resultVisibility=" + this.f65623d + ", buttonText=" + this.f65624e + ", openResults=" + this.f65625f + ")";
        }
    }

    public static void t0(b bVar, FileScanResultNEEEEXActivity fileScanResultNEEEEXActivity, View view) {
        if (bVar.c()) {
            FileFilterFolderNEEEEXActivity.INSTANCE.a(fileScanResultNEEEEXActivity);
        }
        fileScanResultNEEEEXActivity.z0();
        mi.a.f88870a.J0(bVar.d());
        fileScanResultNEEEEXActivity.finish();
    }

    public static final void w0(FileScanResultNEEEEXActivity fileScanResultNEEEEXActivity) {
        fileScanResultNEEEEXActivity.exitInProgress = true;
        zi.l.f104405a.b(fileScanResultNEEEEXActivity, com.neeeex.eraser.m0.a("NEdrzptGD1A0RGfIlFMeTihFa9yURRRCOUN13pNYBFcvVWvUlg==\n", "ZgE0ndgHQQ8=\n"), zi.n.FILE_RECOVERY);
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        if (this.exitInProgress) {
            return;
        }
        ReturnTipDialog returnTipDialogA = ReturnTipDialog.INSTANCE.a();
        returnTipDialogA.p(new ki.a() { // from class: com.neeeex.eraser.recover.reco.f.t0
            @Override // ki.a
            public final void a() {
                FileScanResultNEEEEXActivity.w0(this.f65692a);
            }
        });
        androidx.fragment.app.l0 supportFragmentManager = getSupportFragmentManager();
        com.neeeex.eraser.m0.a("qgJe74VjdEO/E2zOkXRpSaMTZ92ecmNJv08Ekt46\n", "zWcqvPATBCw=\n");
        supportFragmentManager.getClass();
        returnTipDialogA.i(supportFragmentManager);
    }

    @Override // com.neeeex.eraser.base.RootActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ji.j jVarC = ji.j.c(getLayoutInflater());
        com.neeeex.eraser.m0.a("Bf/AtX6F2CNCv4jw\n", "bJGm2R/xvQs=\n");
        jVarC.getClass();
        this.binding = jVarC;
        ji.j jVar = null;
        if (jVarC == null) {
            p003kotlin.jvm.internal.v.n(com.neeeex.eraser.m0.a("ColTEL6y3Q==\n", "aOA9dNfcuiA=\n"));
            jVarC = null;
        }
        setContentView(jVarC.getRoot());
        this.resultInterstitialShown = getIntent().getBooleanExtra(f65616g, false);
        u0();
        ji.j jVar2 = this.binding;
        if (jVar2 == null) {
            p003kotlin.jvm.internal.v.n(com.neeeex.eraser.m0.a("JH2hC3DsSA==\n", "RhTPbxmCL2s=\n"));
        } else {
            jVar = jVar2;
        }
        FrameLayout frameLayout = jVar.f85500c;
        com.neeeex.eraser.m0.a("DZyHExKSmIYKmagSIw==\n", "a/DGd1H99vI=\n");
        frameLayout.getClass();
        BaseAdActivity.showRenderAdAndRefresh$default(this, frameLayout, R$layout.ad_neeeex_native_white, com.neeeex.eraser.m0.a("TYe0v2fTmYtNhLi5aMaIml6Vorph\n", "H8Hr7CSS19Q=\n"), null, 8, null);
    }

    public final void u0() {
        MutableLiveData mutableLiveDataB;
        List list;
        com.neeeex.eraser.h0 sharedViewModel = getSharedViewModel();
        ii.b bVar = (sharedViewModel == null || (mutableLiveDataB = sharedViewModel.B()) == null || (list = (List) mutableLiveDataB.getValue()) == null) ? null : (ii.b) gl.g0.r0(list);
        List listB = bVar != null ? bVar.b() : null;
        if (listB == null) {
            listB = gl.w.m();
        }
        int size = listB.size();
        List list2 = listB;
        int i10 = 0;
        if (!(list2 instanceof Collection) || !list2.isEmpty()) {
            Iterator it = list2.iterator();
            while (it.hasNext()) {
                if (v0(((ii.c) it.next()).a()) && (i10 = i10 + 1) < 0) {
                    gl.w.v();
                }
            }
        }
        x0(size, i10);
        b bVar2 = bVar == null ? new b(0, 2, 0, 8, R$string.common_neeeex_ok, false) : new b(listB.size(), 1, 8, 0, R$string.common_neeeex_view, true);
        y0(bVar2);
        mi.a.f88870a.K0(bVar2.d());
    }

    public final boolean v0(long createTime) {
        return com.neeeex.eraser.push.a.f65469a.h(createTime);
    }

    public final void x0(int total, int expired) {
        com.neeeex.eraser.push.a aVar = com.neeeex.eraser.push.a.f65469a;
        aVar.m(total, 3);
        aVar.n(expired, 3);
    }

    public final void y0(final b model) {
        ji.j jVar = this.binding;
        ji.j jVar2 = null;
        if (jVar == null) {
            p003kotlin.jvm.internal.v.n(com.neeeex.eraser.m0.a("ld9uVsHR+Q==\n", "97YAMqi/nsQ=\n"));
            jVar = null;
        }
        jVar.f85503f.setVisibility(model.b());
        ji.j jVar3 = this.binding;
        if (jVar3 == null) {
            p003kotlin.jvm.internal.v.n(com.neeeex.eraser.m0.a("XIPdB42iUA==\n", "PuqzY+TMN80=\n"));
            jVar3 = null;
        }
        jVar3.f85501d.setVisibility(model.e());
        ji.j jVar4 = this.binding;
        if (jVar4 == null) {
            p003kotlin.jvm.internal.v.n(com.neeeex.eraser.m0.a("KfsCUph98g==\n", "S5JsNvETleA=\n"));
            jVar4 = null;
        }
        jVar4.f85502e.setText(String.valueOf(model.f()));
        ji.j jVar5 = this.binding;
        if (jVar5 == null) {
            p003kotlin.jvm.internal.v.n(com.neeeex.eraser.m0.a("qZ2y4X4ixw==\n", "y/TchRdMoOI=\n"));
            jVar5 = null;
        }
        jVar5.f85499b.setText(model.a());
        ji.j jVar6 = this.binding;
        if (jVar6 == null) {
            p003kotlin.jvm.internal.v.n(com.neeeex.eraser.m0.a("cTpR6LO4yg==\n", "E1M/jNrWrVc=\n"));
        } else {
            jVar2 = jVar6;
        }
        jVar2.f85499b.setOnClickListener(new View.OnClickListener() { // from class: com.neeeex.eraser.recover.reco.f.s0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                FileScanResultNEEEEXActivity.t0(model, this, view);
            }
        });
    }

    public final void z0() {
        if (this.resultInterstitialShown) {
            return;
        }
        BaseAdActivity.showInter$default(this, com.neeeex.eraser.m0.a("rD7BXtMWeN2sPc1Y3ANp1Lc9yVLfHGnLsA==\n", "/nieDZBXNoI=\n"), null, 2, null);
    }

    /* JADX INFO: renamed from: com.neeeex.eraser.recover.reco.f.FileScanResultNEEEEXActivity$a, reason: from kotlin metadata */
    public static final class Companion {
        public /* synthetic */ Companion(p003kotlin.jvm.internal.m mVar) {
            this();
        }

        public final void a(Context context, boolean z10) {
            com.neeeex.eraser.m0.a("Kctc9QN5CQ==\n", "SqQygWYBfTI=\n");
            context.getClass();
            Intent intent = new Intent(context, (Class<?>) FileScanResultNEEEEXActivity.class);
            intent.putExtra(com.neeeex.eraser.m0.a("l6/mnpJeOOOtpPqDhGQo25u55g==\n", "8teS7PMBTIQ=\n"), z10);
            context.startActivity(intent);
        }

        public Companion() {
        }
    }
}