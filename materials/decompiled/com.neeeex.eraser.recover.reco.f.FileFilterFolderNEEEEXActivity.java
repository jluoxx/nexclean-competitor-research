package com.neeeex.eraser.recover.reco.f;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.FrameLayout;
import androidx.core.app.NotificationCompat;
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
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u0000 \u001f2\u00020\u0001:\u0003\u0015 !B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0005\u0010\u0003J\u0019\u0010\b\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0014¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\n\u001a\u00020\u0004H\u0014¢\u0006\u0004\b\n\u0010\u0003J\u000f\u0010\u000b\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u000b\u0010\u0003J\u0017\u0010\u000e\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\fH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0012\u001a\u00020\u00042\u0006\u0010\u0011\u001a\u00020\u0010H\u0002¢\u0006\u0004\b\u0012\u0010\u0013R\u0018\u0010\u0017\u001a\u0004\u0018\u00010\u00148\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u0016\u0010\u001a\u001a\u00020\f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u0016\u0010\u001e\u001a\u00020\u001b8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u001c\u0010\u001d¨\u0006\""}, d2 = {"Lcom/neeeex/eraser/recover/reco/f/FileFilterFolderNEEEEXActivity;", "Lcom/neeeex/eraser/base/BaseAdActivity;", "<init>", "()V", "Lfl/m0;", "setupViews", "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "(Landroid/os/Bundle;)V", "onResume", "onBackPressed", "", "hasFolders", "x0", "(Z)V", "Lcom/neeeex/eraser/recover/reco/f/FileFilterFolderNEEEEXActivity$c;", NotificationCompat.CATEGORY_NAVIGATION, "w0", "(Lcom/neeeex/eraser/recover/reco/f/FileFilterFolderNEEEEXActivity$c;)V", "Lcom/neeeex/eraser/recover/reco/f/v0;", "c", "Lcom/neeeex/eraser/recover/reco/f/v0;", "folderAdapter", "d", "Z", "exitInProgress", "Lji/d;", "e", "Lji/d;", "binding", "f", DownloadCommon.DOWNLOAD_REPORT_FIND_FILE_RESULT_VALUE_B, "a", "tool-feature_productionRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class FileFilterFolderNEEEEXActivity extends BaseAdActivity {

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    public v0 folderAdapter;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    public boolean exitInProgress;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    public ji.d binding;

    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f65575a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f65576b;

        public b(int i10, int i11) {
            this.f65575a = i10;
            this.f65576b = i11;
        }

        public final int a() {
            return this.f65575a;
        }

        public final int b() {
            return this.f65576b;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return this.f65575a == bVar.f65575a && this.f65576b == bVar.f65576b;
        }

        public int hashCode() {
            return (Integer.hashCode(this.f65575a) * 31) + Integer.hashCode(this.f65576b);
        }

        public String toString() {
            return "FolderScreen(empty=" + this.f65575a + ", list=" + this.f65576b + ")";
        }
    }

    public interface c {

        public static final class a implements c {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final a f65577a = new a();

            public boolean equals(Object obj) {
                return this == obj || (obj instanceof a);
            }

            public int hashCode() {
                return -1304636336;
            }

            public String toString() {
                return com.neeeex.eraser.m0.a("UnWBqA==\n", "EBTiwwtcx08=\n");
            }
        }

        public static final class b implements c {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final int f65578a;

            public b(int i10) {
                this.f65578a = i10;
            }

            public final int a() {
                return this.f65578a;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof b) && this.f65578a == ((b) obj).f65578a;
            }

            public int hashCode() {
                return Integer.hashCode(this.f65578a);
            }

            public String toString() {
                return "Folder(index=" + this.f65578a + ")";
            }
        }
    }

    public static void s0(FileFilterFolderNEEEEXActivity fileFilterFolderNEEEEXActivity) {
        fileFilterFolderNEEEEXActivity.exitInProgress = true;
        zi.l.f104405a.b(fileFilterFolderNEEEEXActivity, com.neeeex.eraser.m0.a("midZqevcwCWaJFWv5MnRO4YlWbvk39s3lyNHuePCyyKBNVmz5g==\n", "yGEG+qidjno=\n"), zi.n.FILE_RECOVERY);
    }

    private final void setupViews() {
        MutableLiveData mutableLiveDataB;
        List list;
        ji.d dVar = this.binding;
        if (dVar == null) {
            p003kotlin.jvm.internal.v.n(com.neeeex.eraser.m0.a("ILZ0f62fpw==\n", "Qt8aG8TxwIg=\n"));
            dVar = null;
        }
        dVar.f85381c.setOnClickListener(new View.OnClickListener() { // from class: com.neeeex.eraser.recover.reco.f.t
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                FileFilterFolderNEEEEXActivity.v0(this.f65691a, view);
            }
        });
        com.neeeex.eraser.h0 sharedViewModel = getSharedViewModel();
        boolean z10 = false;
        if (sharedViewModel != null && (mutableLiveDataB = sharedViewModel.B()) != null && (list = (List) mutableLiveDataB.getValue()) != null && (!list.isEmpty())) {
            z10 = true;
        }
        x0(z10);
    }

    public static fl.m0 t0(FileFilterFolderNEEEEXActivity fileFilterFolderNEEEEXActivity, Boolean bool) {
        v0 v0Var = fileFilterFolderNEEEEXActivity.folderAdapter;
        if (v0Var != null) {
            v0Var.notifyDataSetChanged();
        }
        return fl.m0.f80959a;
    }

    public static void v0(FileFilterFolderNEEEEXActivity fileFilterFolderNEEEEXActivity, View view) {
        fileFilterFolderNEEEEXActivity.w0(c.a.f65577a);
    }

    public static final void y0(FileFilterFolderNEEEEXActivity fileFilterFolderNEEEEXActivity, int i10) {
        fileFilterFolderNEEEEXActivity.w0(new c.b(i10));
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        if (this.exitInProgress) {
            return;
        }
        ReturnTipDialog returnTipDialogA = ReturnTipDialog.INSTANCE.a();
        returnTipDialogA.p(new ki.a() { // from class: com.neeeex.eraser.recover.reco.f.r
            @Override // ki.a
            public final void a() {
                FileFilterFolderNEEEEXActivity.s0(this.f65686a);
            }
        });
        androidx.fragment.app.l0 supportFragmentManager = getSupportFragmentManager();
        com.neeeex.eraser.m0.a("D7zT4gXFnYoareHDEdKAgAat6tAe1IqAGvGJn16c\n", "aNmnsXC17eU=\n");
        supportFragmentManager.getClass();
        returnTipDialogA.i(supportFragmentManager);
    }

    @Override // com.neeeex.eraser.base.RootActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ji.d dVarC = ji.d.c(getLayoutInflater());
        com.neeeex.eraser.m0.a("kHb1xVHoqRnXNr2A\n", "+RiTqTCczDE=\n");
        dVarC.getClass();
        this.binding = dVarC;
        ji.d dVar = null;
        if (dVarC == null) {
            p003kotlin.jvm.internal.v.n(com.neeeex.eraser.m0.a("oHp5S9v2iQ==\n", "whMXL7KY7s4=\n"));
            dVarC = null;
        }
        setContentView(dVarC.getRoot());
        setupViews();
        if (com.neeeex.eraser.module.report.bytedance.a.k()) {
            ji.d dVar2 = this.binding;
            if (dVar2 == null) {
                p003kotlin.jvm.internal.v.n(com.neeeex.eraser.m0.a("y5tl5ctTzg==\n", "qfILgaI9qU8=\n"));
            } else {
                dVar = dVar2;
            }
            FrameLayout frameLayout = dVar.f85380b;
            com.neeeex.eraser.m0.a("6hQ5nDl7SMbtERadCA==\n", "jHh4+HoUJrI=\n");
            frameLayout.getClass();
            BaseAdActivity.showRenderAdAndRefresh$default(this, frameLayout, R$layout.ad_neeeex_native, com.neeeex.eraser.m0.a("huADBuofRK2L6B0T7wtU\n", "1KZcR6ZdEeA=\n"), null, 8, null);
        }
        mi.a.f88870a.z0();
    }

    @Override // com.neeeex.eraser.base.BaseAdActivity, com.neeeex.eraser.base.RootActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onResume() {
        MutableLiveData mutableLiveDataC;
        super.onResume();
        com.neeeex.eraser.h0 sharedViewModel = getSharedViewModel();
        if (sharedViewModel == null || (mutableLiveDataC = sharedViewModel.C()) == null) {
            return;
        }
        ti.h.g(mutableLiveDataC, this, false, false, new Function1() { // from class: com.neeeex.eraser.recover.reco.f.s
            @Override // p003kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return FileFilterFolderNEEEEXActivity.t0(this.f65688a, (Boolean) obj);
            }
        }, 4, null);
    }

    public final void w0(c navigation) {
        if (p003kotlin.jvm.internal.v.c(navigation, c.a.f65577a)) {
            onBackPressed();
            return;
        }
        if (!(navigation instanceof c.b)) {
            coil.util.j.a();
            return;
        }
        FileFilterDetailNEEEEXActivity.INSTANCE.a(this, ((c.b) navigation).a());
        if (com.neeeex.eraser.module.report.bytedance.a.k()) {
            BaseAdActivity.showInter$default(this, com.neeeex.eraser.m0.a("1qpfmRw5VhTbpU4=\n", "hOwA2FB7A1k=\n"), null, 2, null);
        }
    }

    public final void x0(boolean hasFolders) {
        ji.d dVar = this.binding;
        ji.d dVar2 = null;
        if (dVar == null) {
            p003kotlin.jvm.internal.v.n(com.neeeex.eraser.m0.a("xS94wxkbig==\n", "p0YWp3B17Q4=\n"));
            dVar = null;
        }
        b bVar = hasFolders ? new b(8, 0) : new b(0, 8);
        dVar.f85383e.setVisibility(bVar.a());
        dVar.f85384f.setVisibility(bVar.b());
        if (hasFolders) {
            ji.d dVar3 = this.binding;
            if (dVar3 == null) {
                p003kotlin.jvm.internal.v.n(com.neeeex.eraser.m0.a("OegHcjndHg==\n", "W4FpFlCzees=\n"));
                dVar3 = null;
            }
            dVar3.f85384f.setHasFixedSize(true);
            ji.d dVar4 = this.binding;
            if (dVar4 == null) {
                p003kotlin.jvm.internal.v.n(com.neeeex.eraser.m0.a("thQ/qdhcsw==\n", "1H1RzbEy1PA=\n"));
                dVar4 = null;
            }
            dVar4.f85384f.setLayoutManager(new LinearLayoutManager(this));
            this.folderAdapter = new v0(getSharedViewModel(), new v0.a() { // from class: com.neeeex.eraser.recover.reco.f.u
                @Override // com.neeeex.eraser.recover.reco.f.v0.a
                public final void a(int i10) {
                    FileFilterFolderNEEEEXActivity.y0(this.f65693a, i10);
                }
            });
            ji.d dVar5 = this.binding;
            if (dVar5 == null) {
                p003kotlin.jvm.internal.v.n(com.neeeex.eraser.m0.a("WHDTB1KoIg==\n", "Ohm9YzvGRbg=\n"));
            } else {
                dVar2 = dVar5;
            }
            dVar2.f85384f.setAdapter(this.folderAdapter);
        }
    }

    /* JADX INFO: renamed from: com.neeeex.eraser.recover.reco.f.FileFilterFolderNEEEEXActivity$a, reason: from kotlin metadata */
    public static final class Companion {
        public /* synthetic */ Companion(p003kotlin.jvm.internal.m mVar) {
            this();
        }

        public final void a(Context context) {
            com.neeeex.eraser.m0.a("YaZPf20z5A==\n", "AskhCwhLkFk=\n");
            context.getClass();
            context.startActivity(new Intent(context, (Class<?>) FileFilterFolderNEEEEXActivity.class));
        }

        public Companion() {
        }
    }
}