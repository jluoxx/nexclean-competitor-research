package com.neeeex.eraser.recover.reco.p;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.FrameLayout;
import androidx.p002lifecycle.MutableLiveData;
import com.android.launcher3.testing.shared.TestProtocol;
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
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u0000 \u001f2\u00020\u0001:\u0002 !B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0005\u0010\u0003J\u0019\u0010\b\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0014¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\n\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\n\u0010\u0003J\u000f\u0010\u000b\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u000b\u0010\u0003J\u001f\u0010\u000f\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\fH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0013\u001a\u00020\u00042\u0006\u0010\u0012\u001a\u00020\u0011H\u0002¢\u0006\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0018\u001a\u00020\u00158\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u0016\u0010\u001a\u001a\u00020\u00158\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0019\u0010\u0017R\u0016\u0010\u001e\u001a\u00020\u001b8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u001c\u0010\u001d¨\u0006\""}, d2 = {"Lcom/neeeex/eraser/recover/reco/p/PhotoScanResultNEEEEXActivity;", "Lcom/neeeex/eraser/base/BaseAdActivity;", "<init>", "()V", "Lfl/m0;", "y0", "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "(Landroid/os/Bundle;)V", "onBackPressed", "w0", "", "total", "expired", "x0", "(II)V", "Lcom/neeeex/eraser/recover/reco/p/PhotoScanResultNEEEEXActivity$b;", TestProtocol.STATE_FIELD, "u0", "(Lcom/neeeex/eraser/recover/reco/p/PhotoScanResultNEEEEXActivity$b;)V", "", "c", "Z", "resultInterstitialShown", "d", "exitInProgress", "Lji/t;", "e", "Lji/t;", "binding", "f", DownloadCommon.DOWNLOAD_REPORT_FIND_FILE_RESULT_VALUE_B, "a", "tool-feature_productionRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class PhotoScanResultNEEEEXActivity extends BaseAdActivity {

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    public boolean resultInterstitialShown;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    public boolean exitInProgress;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    public ji.t binding;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final String f65786g = com.neeeex.eraser.m0.a("6iSeKmlI0t3QL4I3f3LC5eYyng==\n", "j1zqWAgXpro=\n");

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    public static void s0(boolean z10, PhotoScanResultNEEEEXActivity photoScanResultNEEEEXActivity, b bVar, View view) {
        if (z10) {
            PhotoFilterFolderNEEEEXActivity.INSTANCE.a(photoScanResultNEEEEXActivity);
        }
        photoScanResultNEEEEXActivity.y0();
        mi.a.f88870a.V0(bVar.a());
        photoScanResultNEEEEXActivity.finish();
    }

    public static final void v0(PhotoScanResultNEEEEXActivity photoScanResultNEEEEXActivity) {
        photoScanResultNEEEEXActivity.exitInProgress = true;
        zi.l.f104405a.b(photoScanResultNEEEEXActivity, com.neeeex.eraser.m0.a("DfV87OwMqckN4HDq4xm41xHhfP7jD7LbAOdi/OQSos4W8Xz24Q==\n", "X6Ujv69N55Y=\n"), zi.n.PHOTO_RECOVERY);
    }

    private final void y0() {
        if (this.resultInterstitialShown) {
            return;
        }
        BaseAdActivity.showInter$default(this, com.neeeex.eraser.m0.a("qisW+SdlarWqPhr/KHB7vLE+HvUrb3ujtg==\n", "+HtJqmQkJOo=\n"), null, 2, null);
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        if (this.exitInProgress) {
            return;
        }
        ReturnTipDialog returnTipDialogA = ReturnTipDialog.INSTANCE.a();
        returnTipDialogA.p(new ki.a() { // from class: com.neeeex.eraser.recover.reco.p.y0
            @Override // ki.a
            public final void a() {
                PhotoScanResultNEEEEXActivity.v0(this.f65890a);
            }
        });
        androidx.fragment.app.l0 supportFragmentManager = getSupportFragmentManager();
        com.neeeex.eraser.m0.a("f3qr8MCtZcNqa5nR1Lp4yXZrksLbvHLJajfxjZv0\n", "GB/fo7XdFaw=\n");
        supportFragmentManager.getClass();
        returnTipDialogA.i(supportFragmentManager);
    }

    @Override // com.neeeex.eraser.base.RootActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ji.t tVarC = ji.t.c(getLayoutInflater());
        com.neeeex.eraser.m0.a("zv+cSjr5OGmJv9QP\n", "p5H6JluNXUE=\n");
        tVarC.getClass();
        this.binding = tVarC;
        ji.t tVar = null;
        if (tVarC == null) {
            p003kotlin.jvm.internal.v.n(com.neeeex.eraser.m0.a("fiCGBanGjQ==\n", "HEnoYcCo6mM=\n"));
            tVarC = null;
        }
        setContentView(tVarC.getRoot());
        this.resultInterstitialShown = getIntent().getBooleanExtra(f65786g, false);
        w0();
        ji.t tVar2 = this.binding;
        if (tVar2 == null) {
            p003kotlin.jvm.internal.v.n(com.neeeex.eraser.m0.a("98S4kupShQ==\n", "la3W9oM84lI=\n"));
        } else {
            tVar = tVar2;
        }
        FrameLayout frameLayout = tVar.f85678c;
        com.neeeex.eraser.m0.a("S4yLM3ehYg5MiaQyRg==\n", "LeDKVzTODHo=\n");
        frameLayout.getClass();
        BaseAdActivity.showRenderAdAndRefresh$default(this, frameLayout, R$layout.ad_neeeex_native_white, com.neeeex.eraser.m0.a("cWJjd+iTsnVxd29x54ajZGJmdXLu\n", "IzI8JKvS/Co=\n"), null, 8, null);
    }

    public final void u0(final b state) {
        final boolean z10 = state instanceof b.C0796b;
        ji.t tVar = this.binding;
        ji.t tVar2 = null;
        if (tVar == null) {
            p003kotlin.jvm.internal.v.n(com.neeeex.eraser.m0.a("0qS5Q2tJxA==\n", "sM3XJwIno+Y=\n"));
            tVar = null;
        }
        tVar.f85681f.setVisibility(z10 ? 8 : 0);
        ji.t tVar3 = this.binding;
        if (tVar3 == null) {
            p003kotlin.jvm.internal.v.n(com.neeeex.eraser.m0.a("G0h4w0XvKw==\n", "eSEWpyyBTMg=\n"));
            tVar3 = null;
        }
        tVar3.f85679d.setVisibility(z10 ? 0 : 8);
        ji.t tVar4 = this.binding;
        if (tVar4 == null) {
            p003kotlin.jvm.internal.v.n(com.neeeex.eraser.m0.a("uPg3wNyi4Q==\n", "2pFZpLXMhiM=\n"));
            tVar4 = null;
        }
        tVar4.f85680e.setText(String.valueOf(state.b()));
        ji.t tVar5 = this.binding;
        if (tVar5 == null) {
            p003kotlin.jvm.internal.v.n(com.neeeex.eraser.m0.a("a608k6jqtg==\n", "CcRS98GE0TQ=\n"));
            tVar5 = null;
        }
        tVar5.f85677b.setText(z10 ? R$string.common_neeeex_view : R$string.common_neeeex_ok);
        ji.t tVar6 = this.binding;
        if (tVar6 == null) {
            p003kotlin.jvm.internal.v.n(com.neeeex.eraser.m0.a("hbTDBiSidg==\n", "592tYk3MEVE=\n"));
        } else {
            tVar2 = tVar6;
        }
        tVar2.f85677b.setOnClickListener(new View.OnClickListener() { // from class: com.neeeex.eraser.recover.reco.p.x0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                PhotoScanResultNEEEEXActivity.s0(z10, this, state, view);
            }
        });
    }

    public final void w0() {
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
                if (com.neeeex.eraser.push.a.f65469a.h(((ii.c) it.next()).a()) && (i10 = i10 + 1) < 0) {
                    gl.w.v();
                }
            }
        }
        x0(size, i10);
        b c0796b = bVar == null ? b.a.f65792c : new b.C0796b(listB.size());
        u0(c0796b);
        mi.a.f88870a.W0(c0796b.a());
    }

    public final void x0(int total, int expired) {
        com.neeeex.eraser.push.a aVar = com.neeeex.eraser.push.a.f65469a;
        aVar.m(total, 1);
        aVar.n(expired, 1);
    }

    /* JADX INFO: renamed from: com.neeeex.eraser.recover.reco.p.PhotoScanResultNEEEEXActivity$a, reason: from kotlin metadata */
    public static final class Companion {
        public /* synthetic */ Companion(p003kotlin.jvm.internal.m mVar) {
            this();
        }

        public final void a(Context context, boolean z10) {
            com.neeeex.eraser.m0.a("eYCiPQy/aw==\n", "Gu/MSWnHH40=\n");
            context.getClass();
            Intent intent = new Intent(context, (Class<?>) PhotoScanResultNEEEEXActivity.class);
            intent.putExtra(com.neeeex.eraser.m0.a("7R/dbZqqu4nXFMFwjJCrseEJ3Q==\n", "iGepH/v1z+4=\n"), z10);
            context.startActivity(intent);
        }

        public Companion() {
        }
    }

    public static abstract class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f65790a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f65791b;

        public static final class a extends b {

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public static final a f65792c = new a();

            public a() {
                super(2, 0, null);
            }

            public boolean equals(Object obj) {
                return this == obj || (obj instanceof a);
            }

            public int hashCode() {
                return -714476718;
            }

            public String toString() {
                return com.neeeex.eraser.m0.a("f/nZRrw=\n", "OpSpMsUOqfU=\n");
            }
        }

        /* JADX INFO: renamed from: com.neeeex.eraser.recover.reco.p.PhotoScanResultNEEEEXActivity$b$b, reason: collision with other inner class name */
        public static final class C0796b extends b {

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final int f65793c;

            public C0796b(int i10) {
                super(1, i10, null);
                this.f65793c = i10;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof C0796b) && this.f65793c == ((C0796b) obj).f65793c;
            }

            public int hashCode() {
                return Integer.hashCode(this.f65793c);
            }

            public String toString() {
                return "Found(count=" + this.f65793c + ")";
            }
        }

        public b(int i10, int i11) {
            this.f65790a = i10;
            this.f65791b = i11;
        }

        public final int a() {
            return this.f65790a;
        }

        public final int b() {
            return this.f65791b;
        }

        public /* synthetic */ b(int i10, int i11, p003kotlin.jvm.internal.m mVar) {
            this(i10, i11);
        }
    }
}