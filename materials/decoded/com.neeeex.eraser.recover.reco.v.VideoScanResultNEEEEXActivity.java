package com.neeeex.eraser.recover.reco.v;

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
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u0000 \u001f2\u00020\u0001:\u0002 !B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0005\u0010\u0003J\u000f\u0010\u0006\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0006\u0010\u0003J\u0019\u0010\t\u001a\u00020\u00042\b\u0010\b\u001a\u0004\u0018\u00010\u0007H\u0014¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\u000b\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u000b\u0010\u0003J\u001f\u0010\u000f\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\fH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0013\u001a\u00020\u00042\u0006\u0010\u0012\u001a\u00020\u0011H\u0002¢\u0006\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0018\u001a\u00020\u00158\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u0016\u0010\u001a\u001a\u00020\u00158\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0019\u0010\u0017R\u0016\u0010\u001e\u001a\u00020\u001b8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u001c\u0010\u001d¨\u0006\""}, d2 = {"Lcom/neeeex/eraser/recover/reco/v/VideoScanResultNEEEEXActivity;", "Lcom/neeeex/eraser/base/BaseAdActivity;", "<init>", "()V", "Lfl/m0;", "x0", "y0", "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "(Landroid/os/Bundle;)V", "onBackPressed", "", "total", "expired", "w0", "(II)V", "Lcom/neeeex/eraser/recover/reco/v/VideoScanResultNEEEEXActivity$b;", "outcome", "u0", "(Lcom/neeeex/eraser/recover/reco/v/VideoScanResultNEEEEXActivity$b;)V", "", "c", "Z", "resultInterstitialShown", "d", "exitInProgress", "Lji/g0;", "e", "Lji/g0;", "binding", "f", DownloadCommon.DOWNLOAD_REPORT_FIND_FILE_RESULT_VALUE_B, "a", "tool-feature_productionRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class VideoScanResultNEEEEXActivity extends BaseAdActivity {

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    public boolean resultInterstitialShown;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    public boolean exitInProgress;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    public ji.g0 binding;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final String f65961g = "extra_tg_showed_int" /* decoded XOR */;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f65965a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f65966b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final int f65967c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final boolean f65968d;

        public b(int i10, int i11, int i12, boolean z10) {
            this.f65965a = i10;
            this.f65966b = i11;
            this.f65967c = i12;
            this.f65968d = z10;
        }

        public final int a() {
            return this.f65967c;
        }

        public final int b() {
            return this.f65965a;
        }

        public final boolean c() {
            return this.f65968d;
        }

        public final int d() {
            return this.f65966b;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return this.f65965a == bVar.f65965a && this.f65966b == bVar.f65966b && this.f65967c == bVar.f65967c && this.f65968d == bVar.f65968d;
        }

        public int hashCode() {
            return (((((Integer.hashCode(this.f65965a) * 31) + Integer.hashCode(this.f65966b)) * 31) + Integer.hashCode(this.f65967c)) * 31) + Boolean.hashCode(this.f65968d);
        }

        public String toString() {
            return "Outcome(count=" + this.f65965a + ", reportCode=" + this.f65966b + ", buttonLabel=" + this.f65967c + ", launchAlbums=" + this.f65968d + ")";
        }
    }

    public static void s0(b bVar, VideoScanResultNEEEEXActivity videoScanResultNEEEEXActivity, View view) {
        if (bVar.c()) {
            VideoFilterFolderNEEEEXActivity.INSTANCE.a(videoScanResultNEEEEXActivity);
        }
        videoScanResultNEEEEXActivity.y0();
        mi.a.f88870a.h1(bVar.d());
        videoScanResultNEEEEXActivity.finish();
    }

    public static final void v0(VideoScanResultNEEEEXActivity videoScanResultNEEEEXActivity) {
        videoScanResultNEEEEXActivity.exitInProgress = true;
        zi.l.f104405a.b(videoScanResultNEEEEXActivity, "RV_SCAN_RESULT_AND_ALBUM_BACK_EXIT_IN" /* decoded XOR */, zi.n.VIDEO_RECOVERY);
    }

    private final void x0() {
        int i10;
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
        if ((list2 instanceof Collection) && list2.isEmpty()) {
            i10 = 0;
        } else {
            Iterator it = list2.iterator();
            i10 = 0;
            while (it.hasNext()) {
                if (com.neeeex.eraser.push.a.f65469a.h(((ii.c) it.next()).a()) && (i10 = i10 + 1) < 0) {
                    gl.w.v();
                }
            }
        }
        w0(size, i10);
        b bVar2 = bVar == null ? new b(0, 2, R$string.common_neeeex_ok, false) : new b(listB.size(), 1, R$string.common_neeeex_view, true);
        u0(bVar2);
        mi.a.f88870a.i1(bVar2.d());
    }

    private final void y0() {
        if (this.resultInterstitialShown) {
            return;
        }
        BaseAdActivity.showInter$default(this, "RV_SCAN_RESULT_VIEW_OK_IN" /* decoded XOR */, null, 2, null);
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        if (this.exitInProgress) {
            return;
        }
        ReturnTipDialog returnTipDialogA = ReturnTipDialog.INSTANCE.a();
        returnTipDialogA.p(new ki.a() { // from class: com.neeeex.eraser.recover.reco.v.b1
            @Override // ki.a
            public final void a() {
                VideoScanResultNEEEEXActivity.v0(this.f65981a);
            }
        });
        androidx.fragment.app.l0 supportFragmentManager = getSupportFragmentManager();
        "getSupportFragmentManager(...)" /* decoded XOR */;
        supportFragmentManager.getClass();
        returnTipDialogA.i(supportFragmentManager);
    }

    @Override // com.neeeex.eraser.base.RootActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ji.g0 g0VarC = ji.g0.c(getLayoutInflater());
        "inflate(...)" /* decoded XOR */;
        g0VarC.getClass();
        this.binding = g0VarC;
        ji.g0 g0Var = null;
        if (g0VarC == null) {
            p003kotlin.jvm.internal.v.n("binding" /* decoded XOR */);
            g0VarC = null;
        }
        setContentView(g0VarC.getRoot());
        this.resultInterstitialShown = getIntent().getBooleanExtra(f65961g, false);
        x0();
        ji.g0 g0Var2 = this.binding;
        if (g0Var2 == null) {
            p003kotlin.jvm.internal.v.n("binding" /* decoded XOR */);
        } else {
            g0Var = g0Var2;
        }
        FrameLayout frameLayout = g0Var.f85445c;
        "flAdContainer" /* decoded XOR */;
        frameLayout.getClass();
        BaseAdActivity.showRenderAdAndRefresh$default(this, frameLayout, R$layout.ad_neeeex_native_white, "RV_SCAN_RESULT_NATIVE" /* decoded XOR */, null, 8, null);
    }

    public final void u0(final b outcome) {
        ji.g0 g0Var = this.binding;
        ji.g0 g0Var2 = null;
        if (g0Var == null) {
            p003kotlin.jvm.internal.v.n("binding" /* decoded XOR */);
            g0Var = null;
        }
        g0Var.f85448f.setVisibility(outcome.c() ? 8 : 0);
        ji.g0 g0Var3 = this.binding;
        if (g0Var3 == null) {
            p003kotlin.jvm.internal.v.n("binding" /* decoded XOR */);
            g0Var3 = null;
        }
        g0Var3.f85446d.setVisibility(outcome.c() ? 0 : 8);
        ji.g0 g0Var4 = this.binding;
        if (g0Var4 == null) {
            p003kotlin.jvm.internal.v.n("binding" /* decoded XOR */);
            g0Var4 = null;
        }
        g0Var4.f85447e.setText(String.valueOf(outcome.b()));
        ji.g0 g0Var5 = this.binding;
        if (g0Var5 == null) {
            p003kotlin.jvm.internal.v.n("binding" /* decoded XOR */);
            g0Var5 = null;
        }
        g0Var5.f85444b.setText(outcome.a());
        ji.g0 g0Var6 = this.binding;
        if (g0Var6 == null) {
            p003kotlin.jvm.internal.v.n("binding" /* decoded XOR */);
        } else {
            g0Var2 = g0Var6;
        }
        g0Var2.f85444b.setOnClickListener(new View.OnClickListener() { // from class: com.neeeex.eraser.recover.reco.v.a1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                VideoScanResultNEEEEXActivity.s0(outcome, this, view);
            }
        });
    }

    public final void w0(int total, int expired) {
        com.neeeex.eraser.push.a aVar = com.neeeex.eraser.push.a.f65469a;
        aVar.m(total, 2);
        aVar.n(expired, 2);
    }

    /* JADX INFO: renamed from: com.neeeex.eraser.recover.reco.v.VideoScanResultNEEEEXActivity$a, reason: from kotlin metadata */
    public static final class Companion {
        public /* synthetic */ Companion(p003kotlin.jvm.internal.m mVar) {
            this();
        }

        public final void a(Context context, boolean z10) {
            "context" /* decoded XOR */;
            context.getClass();
            Intent intent = new Intent(context, (Class<?>) VideoScanResultNEEEEXActivity.class);
            intent.putExtra("extra_tg_showed_int" /* decoded XOR */, z10);
            context.startActivity(intent);
        }

        public Companion() {
        }
    }
}