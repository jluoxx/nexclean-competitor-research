package com.neeeex.eraser.recover.reco.v;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.FrameLayout;
import androidx.p002lifecycle.MutableLiveData;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.mbridge.msdk.foundation.download.core.DownloadCommon;
import com.neeeex.eraser.R$layout;
import com.neeeex.eraser.base.BaseAdActivity;
import com.neeeex.eraser.module.dialog.ReturnTipDialog;
import java.util.List;
import p003kotlin.Metadata;
import p003kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u0000 \u001d2\u00020\u0001:\u0002\u001e\u001fB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0019\u0010\u000b\u001a\u00020\u00062\b\u0010\n\u001a\u0004\u0018\u00010\tH\u0014¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\r\u001a\u00020\u0006H\u0014¢\u0006\u0004\b\r\u0010\u0003J\u000f\u0010\u000e\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u000e\u0010\u0003J\u000f\u0010\u000f\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u000f\u0010\u0003J\u000f\u0010\u0010\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0010\u0010\u0003R\u0018\u0010\u0014\u001a\u0004\u0018\u00010\u00118\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u0016\u0010\u0018\u001a\u00020\u00158\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u0016\u0010\u001c\u001a\u00020\u00198\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u001a\u0010\u001b¨\u0006 "}, d2 = {"Lcom/neeeex/eraser/recover/reco/v/VideoFilterFolderNEEEEXActivity;", "Lcom/neeeex/eraser/base/BaseAdActivity;", "<init>", "()V", "", "position", "Lfl/m0;", "w0", "(I)V", "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "(Landroid/os/Bundle;)V", "onResume", "onBackPressed", "y0", "x0", "Lcom/neeeex/eraser/recover/reco/v/g;", "c", "Lcom/neeeex/eraser/recover/reco/v/g;", "folderAdapter", "", "d", "Z", "exitInProgress", "Lji/a0;", "e", "Lji/a0;", "binding", "f", DownloadCommon.DOWNLOAD_REPORT_FIND_FILE_RESULT_VALUE_B, "a", "tool-feature_productionRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class VideoFilterFolderNEEEEXActivity extends BaseAdActivity {

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    public g folderAdapter;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    public boolean exitInProgress;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    public ji.a0 binding;

    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f65909a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f65910b;

        public b(int i10, int i11) {
            this.f65909a = i10;
            this.f65910b = i11;
        }

        public final int a() {
            return this.f65910b;
        }

        public final int b() {
            return this.f65909a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return this.f65909a == bVar.f65909a && this.f65910b == bVar.f65910b;
        }

        public int hashCode() {
            return (Integer.hashCode(this.f65909a) * 31) + Integer.hashCode(this.f65910b);
        }

        public String toString() {
            return "VisibilityPair(empty=" + this.f65909a + ", content=" + this.f65910b + ")";
        }
    }

    public static final /* synthetic */ class c implements g.a, p003kotlin.jvm.internal.p {
        public c() {
        }

        @Override // com.neeeex.eraser.recover.reco.v.g.a
        public final void a(int i10) {
            VideoFilterFolderNEEEEXActivity.this.w0(i10);
        }

        public final boolean equals(Object obj) {
            if ((obj instanceof g.a) && (obj instanceof p003kotlin.jvm.internal.p)) {
                return p003kotlin.jvm.internal.v.c(getFunctionDelegate(), ((p003kotlin.jvm.internal.p) obj).getFunctionDelegate());
            }
            return false;
        }

        @Override // p003kotlin.jvm.internal.p
        public final fl.h getFunctionDelegate() {
            return new p003kotlin.jvm.internal.s(1, VideoFilterFolderNEEEEXActivity.this, VideoFilterFolderNEEEEXActivity.class, "openFolder" /* decoded XOR */, "openFolder(I)V" /* decoded XOR */, 0);
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }
    }

    public static void s0(VideoFilterFolderNEEEEXActivity videoFilterFolderNEEEEXActivity) {
        videoFilterFolderNEEEEXActivity.exitInProgress = true;
        zi.l.f104405a.b(videoFilterFolderNEEEEXActivity, "RV_SCAN_RESULT_AND_ALBUM_BACK_EXIT_IN" /* decoded XOR */, zi.n.VIDEO_RECOVERY);
    }

    public static fl.m0 t0(VideoFilterFolderNEEEEXActivity videoFilterFolderNEEEEXActivity, Boolean bool) {
        g gVar = videoFilterFolderNEEEEXActivity.folderAdapter;
        if (gVar != null) {
            gVar.notifyDataSetChanged();
        }
        return fl.m0.f80959a;
    }

    public static void u0(VideoFilterFolderNEEEEXActivity videoFilterFolderNEEEEXActivity, View view) {
        videoFilterFolderNEEEEXActivity.onBackPressed();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void w0(int position) {
        VideoFilterDetailNEEEEXActivity.INSTANCE.a(this, position);
        if (com.neeeex.eraser.module.report.bytedance.a.k()) {
            BaseAdActivity.showInter$default(this, "RV_ALBUM_IN" /* decoded XOR */, null, 2, null);
        }
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        if (this.exitInProgress) {
            return;
        }
        ReturnTipDialog returnTipDialogA = ReturnTipDialog.INSTANCE.a();
        returnTipDialogA.p(new ki.a() { // from class: com.neeeex.eraser.recover.reco.v.w
            @Override // ki.a
            public final void a() {
                VideoFilterFolderNEEEEXActivity.s0(this.f66068a);
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
        ji.a0 a0VarC = ji.a0.c(getLayoutInflater());
        "inflate(...)" /* decoded XOR */;
        a0VarC.getClass();
        this.binding = a0VarC;
        ji.a0 a0Var = null;
        if (a0VarC == null) {
            p003kotlin.jvm.internal.v.n("binding" /* decoded XOR */);
            a0VarC = null;
        }
        setContentView(a0VarC.getRoot());
        y0();
        if (com.neeeex.eraser.module.report.bytedance.a.k()) {
            ji.a0 a0Var2 = this.binding;
            if (a0Var2 == null) {
                p003kotlin.jvm.internal.v.n("binding" /* decoded XOR */);
            } else {
                a0Var = a0Var2;
            }
            FrameLayout frameLayout = a0Var.f85304b;
            "flAdContainer" /* decoded XOR */;
            frameLayout.getClass();
            BaseAdActivity.showRenderAdAndRefresh$default(this, frameLayout, R$layout.ad_neeeex_native, "RV_ALBUM_NATIVE" /* decoded XOR */, null, 8, null);
        }
        mi.a.f88870a.X0();
    }

    @Override // com.neeeex.eraser.base.BaseAdActivity, com.neeeex.eraser.base.RootActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onResume() {
        MutableLiveData mutableLiveDataC;
        super.onResume();
        com.neeeex.eraser.h0 sharedViewModel = getSharedViewModel();
        if (sharedViewModel == null || (mutableLiveDataC = sharedViewModel.C()) == null) {
            return;
        }
        ti.h.g(mutableLiveDataC, this, false, false, new Function1() { // from class: com.neeeex.eraser.recover.reco.v.u
            @Override // p003kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return VideoFilterFolderNEEEEXActivity.t0(this.f66064a, (Boolean) obj);
            }
        }, 4, null);
    }

    public final void x0() {
        MutableLiveData mutableLiveDataB;
        List list;
        ji.a0 a0Var = this.binding;
        if (a0Var == null) {
            p003kotlin.jvm.internal.v.n("binding" /* decoded XOR */);
            a0Var = null;
        }
        com.neeeex.eraser.h0 sharedViewModel = getSharedViewModel();
        b bVar = ((sharedViewModel == null || (mutableLiveDataB = sharedViewModel.B()) == null || (list = (List) mutableLiveDataB.getValue()) == null) ? 0 : list.size()) == 0 ? new b(0, 8) : new b(8, 0);
        a0Var.f85307e.setVisibility(bVar.b());
        a0Var.f85308f.setVisibility(bVar.a());
        if (bVar.a() != 8) {
            a0Var.f85308f.setHasFixedSize(true);
            a0Var.f85308f.setLayoutManager(new LinearLayoutManager(this));
            g gVar = new g(getSharedViewModel(), new c());
            this.folderAdapter = gVar;
            a0Var.f85308f.setAdapter(gVar);
        }
    }

    public final void y0() {
        ji.a0 a0Var = this.binding;
        if (a0Var == null) {
            p003kotlin.jvm.internal.v.n("binding" /* decoded XOR */);
            a0Var = null;
        }
        a0Var.f85305c.setOnClickListener(new View.OnClickListener() { // from class: com.neeeex.eraser.recover.reco.v.v
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                VideoFilterFolderNEEEEXActivity.u0(this.f66066a, view);
            }
        });
        x0();
    }

    /* JADX INFO: renamed from: com.neeeex.eraser.recover.reco.v.VideoFilterFolderNEEEEXActivity$a, reason: from kotlin metadata */
    public static final class Companion {
        public /* synthetic */ Companion(p003kotlin.jvm.internal.m mVar) {
            this();
        }

        public final void a(Context context) {
            "context" /* decoded XOR */;
            context.getClass();
            context.startActivity(new Intent(context, (Class<?>) VideoFilterFolderNEEEEXActivity.class));
        }

        public Companion() {
        }
    }
}