package com.neeeex.eraser.recover.reco.p;

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
import java.util.Iterator;
import java.util.List;
import p003kotlin.Metadata;
import p003kotlin.jvm.functions.Function0;
import p003kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u0000  2\u00020\u0001:\u0002!\"B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0019\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0014¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\t\u001a\u00020\u0006H\u0014¢\u0006\u0004\b\t\u0010\u0003J\u000f\u0010\n\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\n\u0010\u0003J\u000f\u0010\u000b\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u000b\u0010\u0003J\u0017\u0010\u000e\u001a\u00020\u00062\u0006\u0010\r\u001a\u00020\fH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0012\u001a\u00020\u00062\u0006\u0010\u0011\u001a\u00020\u0010H\u0002¢\u0006\u0004\b\u0012\u0010\u0013R\u0018\u0010\u0017\u001a\u0004\u0018\u00010\u00148\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u0016\u0010\u001b\u001a\u00020\u00188\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u0016\u0010\u001f\u001a\u00020\u001c8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u001d\u0010\u001e¨\u0006#"}, d2 = {"Lcom/neeeex/eraser/recover/reco/p/PhotoFilterFolderNEEEEXActivity;", "Lcom/neeeex/eraser/base/BaseAdActivity;", "<init>", "()V", "Landroid/os/Bundle;", "savedInstanceState", "Lfl/m0;", "onCreate", "(Landroid/os/Bundle;)V", "onResume", "onBackPressed", "B0", "Lcom/neeeex/eraser/recover/reco/p/PhotoFilterFolderNEEEEXActivity$b;", "presentation", "A0", "(Lcom/neeeex/eraser/recover/reco/p/PhotoFilterFolderNEEEEXActivity$b;)V", "", "position", "z0", "(I)V", "Lcom/neeeex/eraser/recover/reco/p/g;", "c", "Lcom/neeeex/eraser/recover/reco/p/g;", "folderAdapter", "", "d", "Z", "exitInProgress", "Lji/n;", "e", "Lji/n;", "binding", "f", DownloadCommon.DOWNLOAD_REPORT_FIND_FILE_RESULT_VALUE_B, "a", "tool-feature_productionRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class PhotoFilterFolderNEEEEXActivity extends BaseAdActivity {

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    public g folderAdapter;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    public boolean exitInProgress;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    public ji.n binding;

    public enum b {
        EMPTY,
        FOLDERS;


        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ ml.a f65735b = ml.b.a(d());

        public static ml.a getEntries() {
            return f65735b;
        }
    }

    public static final /* synthetic */ class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f65736a;

        static {
            int[] iArr = new int[b.values().length];
            try {
                iArr[b.EMPTY.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[b.FOLDERS.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f65736a = iArr;
        }
    }

    public static final /* synthetic */ class d implements g.a, p003kotlin.jvm.internal.p {
        public d() {
        }

        @Override // com.neeeex.eraser.recover.reco.p.g.a
        public final void a(int i10) {
            PhotoFilterFolderNEEEEXActivity.this.z0(i10);
        }

        public final boolean equals(Object obj) {
            if ((obj instanceof g.a) && (obj instanceof p003kotlin.jvm.internal.p)) {
                return p003kotlin.jvm.internal.v.c(getFunctionDelegate(), ((p003kotlin.jvm.internal.p) obj).getFunctionDelegate());
            }
            return false;
        }

        @Override // p003kotlin.jvm.internal.p
        public final fl.h getFunctionDelegate() {
            return new p003kotlin.jvm.internal.s(1, PhotoFilterFolderNEEEEXActivity.this, PhotoFilterFolderNEEEEXActivity.class, com.neeeex.eraser.m0.a("ER6EF+D8jmkbHA==\n", "fm7heaaT4g0=\n"), com.neeeex.eraser.m0.a("mXJ9qqZ/Xh+TcDCNyUY=\n", "9gIYxOAQMns=\n"), 0);
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }
    }

    public static fl.m0 t0(PhotoFilterFolderNEEEEXActivity photoFilterFolderNEEEEXActivity, Boolean bool) {
        g gVar = photoFilterFolderNEEEEXActivity.folderAdapter;
        if (gVar != null) {
            gVar.notifyDataSetChanged();
        }
        return fl.m0.f80959a;
    }

    public static void u0(PhotoFilterFolderNEEEEXActivity photoFilterFolderNEEEEXActivity, View view) {
        photoFilterFolderNEEEEXActivity.onBackPressed();
    }

    public static fl.m0 v0(PhotoFilterFolderNEEEEXActivity photoFilterFolderNEEEEXActivity, int i10) {
        PhotoFilterDetailNEEEEXActivity.INSTANCE.a(photoFilterFolderNEEEEXActivity, i10);
        return fl.m0.f80959a;
    }

    public static fl.m0 w0(PhotoFilterFolderNEEEEXActivity photoFilterFolderNEEEEXActivity) {
        if (com.neeeex.eraser.module.report.bytedance.a.k()) {
            BaseAdActivity.showInter$default(photoFilterFolderNEEEEXActivity, com.neeeex.eraser.m0.a("w0qU9WCO05LOU4U=\n", "kRrLtCzMht8=\n"), null, 2, null);
        }
        return fl.m0.f80959a;
    }

    public static final void y0(PhotoFilterFolderNEEEEXActivity photoFilterFolderNEEEEXActivity) {
        photoFilterFolderNEEEEXActivity.exitInProgress = true;
        zi.l.f104405a.b(photoFilterFolderNEEEEXActivity, com.neeeex.eraser.m0.a("Hj/4AfaGiJweKvQH+ZOZggIr+BP5hZOOEy3mEf6Yg5sFO/gb+w==\n", "TG+nUrXHxsM=\n"), zi.n.PHOTO_RECOVERY);
    }

    public final void A0(b presentation) {
        ji.n nVar = this.binding;
        if (nVar == null) {
            p003kotlin.jvm.internal.v.n(com.neeeex.eraser.m0.a("YdY5ZiJoYQ==\n", "A79XAksGBlY=\n"));
            nVar = null;
        }
        int i10 = c.f65736a[presentation.ordinal()];
        if (i10 == 1) {
            nVar.f85594e.setVisibility(0);
            nVar.f85595f.setVisibility(8);
        } else {
            if (i10 != 2) {
                coil.util.j.a();
                return;
            }
            nVar.f85594e.setVisibility(8);
            nVar.f85595f.setVisibility(0);
            nVar.f85595f.setHasFixedSize(true);
            nVar.f85595f.setLayoutManager(new LinearLayoutManager(this));
            g gVar = new g(getSharedViewModel(), new d());
            this.folderAdapter = gVar;
            nVar.f85595f.setAdapter(gVar);
        }
    }

    public final void B0() {
        MutableLiveData mutableLiveDataB;
        ji.n nVar = this.binding;
        List list = null;
        if (nVar == null) {
            p003kotlin.jvm.internal.v.n(com.neeeex.eraser.m0.a("M+8cAU9vmA==\n", "UYZyZSYB/28=\n"));
            nVar = null;
        }
        nVar.f85592c.setOnClickListener(new View.OnClickListener() { // from class: com.neeeex.eraser.recover.reco.p.w
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                PhotoFilterFolderNEEEEXActivity.u0(this.f65882a, view);
            }
        });
        com.neeeex.eraser.h0 sharedViewModel = getSharedViewModel();
        if (sharedViewModel != null && (mutableLiveDataB = sharedViewModel.B()) != null) {
            list = (List) mutableLiveDataB.getValue();
        }
        List list2 = list;
        A0((list2 == null || list2.isEmpty()) ? b.EMPTY : b.FOLDERS);
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        if (this.exitInProgress) {
            return;
        }
        ReturnTipDialog returnTipDialogA = ReturnTipDialog.INSTANCE.a();
        returnTipDialogA.p(new ki.a() { // from class: com.neeeex.eraser.recover.reco.p.x
            @Override // ki.a
            public final void a() {
                PhotoFilterFolderNEEEEXActivity.y0(this.f65884a);
            }
        });
        androidx.fragment.app.l0 supportFragmentManager = getSupportFragmentManager();
        com.neeeex.eraser.m0.a("CNXA/7PJ6NgdxPLep9710gHE+c2o2P/SHZiaguiQ\n", "b7C0rMa5mLc=\n");
        supportFragmentManager.getClass();
        returnTipDialogA.i(supportFragmentManager);
    }

    @Override // com.neeeex.eraser.base.RootActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ji.n nVarC = ji.n.c(getLayoutInflater());
        com.neeeex.eraser.m0.a("fRijU/0oeYM6WOsW\n", "FHbFP5xcHKs=\n");
        nVarC.getClass();
        this.binding = nVarC;
        ji.n nVar = null;
        if (nVarC == null) {
            p003kotlin.jvm.internal.v.n(com.neeeex.eraser.m0.a("jwFMQzusFA==\n", "7WgiJ1LCc74=\n"));
            nVarC = null;
        }
        setContentView(nVarC.getRoot());
        B0();
        if (com.neeeex.eraser.module.report.bytedance.a.k()) {
            ji.n nVar2 = this.binding;
            if (nVar2 == null) {
                p003kotlin.jvm.internal.v.n(com.neeeex.eraser.m0.a("v0ReXZKs2Q==\n", "3S0wOfvCvg4=\n"));
            } else {
                nVar = nVar2;
            }
            FrameLayout frameLayout = nVar.f85591b;
            com.neeeex.eraser.m0.a("G48x8dwkyLgcih7w7Q==\n", "feNwlZ9Lpsw=\n");
            frameLayout.getClass();
            BaseAdActivity.showRenderAdAndRefresh$default(this, frameLayout, R$layout.ad_neeeex_native, com.neeeex.eraser.m0.a("hrN9hnhJN+iLrWOTfV0n\n", "1OMixzQLYqU=\n"), null, 8, null);
        }
        mi.a.f88870a.L0();
    }

    @Override // com.neeeex.eraser.base.BaseAdActivity, com.neeeex.eraser.base.RootActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onResume() {
        MutableLiveData mutableLiveDataC;
        super.onResume();
        com.neeeex.eraser.h0 sharedViewModel = getSharedViewModel();
        if (sharedViewModel == null || (mutableLiveDataC = sharedViewModel.C()) == null) {
            return;
        }
        ti.h.g(mutableLiveDataC, this, false, false, new Function1() { // from class: com.neeeex.eraser.recover.reco.p.v
            @Override // p003kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return PhotoFilterFolderNEEEEXActivity.t0(this.f65880a, (Boolean) obj);
            }
        }, 4, null);
    }

    public final void z0(final int position) {
        Iterator it = gl.w.p(new Function0() { // from class: com.neeeex.eraser.recover.reco.p.y
            @Override // p003kotlin.jvm.functions.Function0
            public final Object invoke() {
                return PhotoFilterFolderNEEEEXActivity.v0(this.f65888a, position);
            }
        }, new Function0() { // from class: com.neeeex.eraser.recover.reco.p.z
            @Override // p003kotlin.jvm.functions.Function0
            public final Object invoke() {
                return PhotoFilterFolderNEEEEXActivity.w0(this.f65891a);
            }
        }).iterator();
        while (it.hasNext()) {
            ((Function0) it.next()).invoke();
        }
    }

    /* JADX INFO: renamed from: com.neeeex.eraser.recover.reco.p.PhotoFilterFolderNEEEEXActivity$a, reason: from kotlin metadata */
    public static final class Companion {
        public /* synthetic */ Companion(p003kotlin.jvm.internal.m mVar) {
            this();
        }

        public final void a(Context context) {
            com.neeeex.eraser.m0.a("TLR2FNyvkA==\n", "L9sYYLnX5IQ=\n");
            context.getClass();
            context.startActivity(new Intent(context, (Class<?>) PhotoFilterFolderNEEEEXActivity.class));
        }

        public Companion() {
        }
    }
}