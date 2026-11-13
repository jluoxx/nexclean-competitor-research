package com.neeeex.eraser.recover.reco.f;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;
import androidx.p002lifecycle.MutableLiveData;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.foundation.download.core.DownloadCommon;
import com.neeeex.eraser.R$layout;
import com.neeeex.eraser.base.BaseAdActivity;
import com.neeeex.eraser.module.dialog.DeleteTipDialog;
import p003kotlin.Metadata;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u0000 \u001d2\u00020\u0001:\u0003\u001e\u001f\u001aB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0019\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0014¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\n\u001a\u00020\tH\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\r\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\tH\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\u00020\u00062\u0006\u0010\u0010\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u001f\u0010\u0017\u001a\u00020\u00062\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0016\u001a\u00020\u0015H\u0002¢\u0006\u0004\b\u0017\u0010\u0018R\u0016\u0010\u001c\u001a\u00020\u00198\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u001a\u0010\u001b¨\u0006 "}, d2 = {"Lcom/neeeex/eraser/recover/reco/f/FilePreviewNEEEEXActivity;", "Lcom/neeeex/eraser/base/BaseAdActivity;", "<init>", "()V", "Landroid/os/Bundle;", "savedInstanceState", "Lfl/m0;", "onCreate", "(Landroid/os/Bundle;)V", "Lcom/neeeex/eraser/recover/reco/f/FilePreviewNEEEEXActivity$c;", "E0", "()Lcom/neeeex/eraser/recover/reco/f/FilePreviewNEEEEXActivity$c;", "content", "x0", "(Lcom/neeeex/eraser/recover/reco/f/FilePreviewNEEEEXActivity$c;)V", "Lcom/neeeex/eraser/recover/reco/f/FilePreviewNEEEEXActivity$b;", "action", "B0", "(Lcom/neeeex/eraser/recover/reco/f/FilePreviewNEEEEXActivity$b;)V", "", MBridgeConstans.DYNAMIC_VIEW_WX_PATH, "", "recover", "D0", "(Ljava/lang/String;Z)V", "Lji/f;", "c", "Lji/f;", "binding", "d", DownloadCommon.DOWNLOAD_REPORT_FIND_FILE_RESULT_VALUE_B, "a", "tool-feature_productionRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class FilePreviewNEEEEXActivity extends BaseAdActivity {

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    public ji.f binding;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final String f65580e = "extra_file_name" /* decoded XOR */;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final String f65581f = "extra_file_path" /* decoded XOR */;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final String f65582g = "extra_file_size" /* decoded XOR */;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final String f65583h = "extra_file_date" /* decoded XOR */;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final String f65584i = "extra_file_type" /* decoded XOR */;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final String f65585j = "extra_file_recovered" /* decoded XOR */;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    public interface b {

        public static final class a implements b {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final String f65587a;

            public a(String str) {
                "path" /* decoded XOR */;
                str.getClass();
                this.f65587a = str;
            }

            public final String a() {
                return this.f65587a;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof a) && p003kotlin.jvm.internal.v.c(this.f65587a, ((a) obj).f65587a);
            }

            public int hashCode() {
                return this.f65587a.hashCode();
            }

            public String toString() {
                return "Delete(path=" + this.f65587a + ")";
            }
        }

        /* JADX INFO: renamed from: com.neeeex.eraser.recover.reco.f.FilePreviewNEEEEXActivity$b$b, reason: collision with other inner class name */
        public static final class C0788b implements b {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final String f65588a;

            public C0788b(String str) {
                "path" /* decoded XOR */;
                str.getClass();
                this.f65588a = str;
            }

            public final String a() {
                return this.f65588a;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof C0788b) && p003kotlin.jvm.internal.v.c(this.f65588a, ((C0788b) obj).f65588a);
            }

            public int hashCode() {
                return this.f65588a.hashCode();
            }

            public String toString() {
                return "Open(path=" + this.f65588a + ")";
            }
        }

        public static final class c implements b {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final String f65589a;

            public c(String str) {
                "path" /* decoded XOR */;
                str.getClass();
                this.f65589a = str;
            }

            public final String a() {
                return this.f65589a;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof c) && p003kotlin.jvm.internal.v.c(this.f65589a, ((c) obj).f65589a);
            }

            public int hashCode() {
                return this.f65589a.hashCode();
            }

            public String toString() {
                return "Recover(path=" + this.f65589a + ")";
            }
        }
    }

    public static final class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f65590a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f65591b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final String f65592c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final String f65593d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final int f65594e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final boolean f65595f;

        public c(String str, String str2, String str3, String str4, int i10, boolean z10) {
            "name" /* decoded XOR */;
            str.getClass();
            "path" /* decoded XOR */;
            str2.getClass();
            "size" /* decoded XOR */;
            str3.getClass();
            "date" /* decoded XOR */;
            str4.getClass();
            this.f65590a = str;
            this.f65591b = str2;
            this.f65592c = str3;
            this.f65593d = str4;
            this.f65594e = i10;
            this.f65595f = z10;
        }

        public final String a() {
            return this.f65593d;
        }

        public final String b() {
            return this.f65590a;
        }

        public final String c() {
            return this.f65591b;
        }

        public final boolean d() {
            return this.f65595f;
        }

        public final String e() {
            return this.f65592c;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            return p003kotlin.jvm.internal.v.c(this.f65590a, cVar.f65590a) && p003kotlin.jvm.internal.v.c(this.f65591b, cVar.f65591b) && p003kotlin.jvm.internal.v.c(this.f65592c, cVar.f65592c) && p003kotlin.jvm.internal.v.c(this.f65593d, cVar.f65593d) && this.f65594e == cVar.f65594e && this.f65595f == cVar.f65595f;
        }

        public final int f() {
            return this.f65594e;
        }

        public int hashCode() {
            return (((((((((this.f65590a.hashCode() * 31) + this.f65591b.hashCode()) * 31) + this.f65592c.hashCode()) * 31) + this.f65593d.hashCode()) * 31) + Integer.hashCode(this.f65594e)) * 31) + Boolean.hashCode(this.f65595f);
        }

        public String toString() {
            return "PreviewContent(name=" + this.f65590a + ", path=" + this.f65591b + ", size=" + this.f65592c + ", date=" + this.f65593d + ", type=" + this.f65594e + ", recovered=" + this.f65595f + ")";
        }
    }

    public static final void A0(FilePreviewNEEEEXActivity filePreviewNEEEEXActivity, c cVar, View view) {
        filePreviewNEEEEXActivity.B0(new b.C0788b(cVar.c()));
    }

    public static final void C0(FilePreviewNEEEEXActivity filePreviewNEEEEXActivity, b bVar) {
        filePreviewNEEEEXActivity.D0(((b.a) bVar).a(), false);
    }

    public static void u0(FilePreviewNEEEEXActivity filePreviewNEEEEXActivity, View view) {
        filePreviewNEEEEXActivity.onBackPressed();
    }

    public static final void y0(FilePreviewNEEEEXActivity filePreviewNEEEEXActivity, c cVar, View view) {
        filePreviewNEEEEXActivity.B0(new b.a(cVar.c()));
    }

    public static final void z0(FilePreviewNEEEEXActivity filePreviewNEEEEXActivity, c cVar, View view) {
        filePreviewNEEEEXActivity.B0(new b.c(cVar.c()));
    }

    public final void B0(final b action) {
        if (action instanceof b.C0788b) {
            com.neeeex.eraser.utils.c.f66140a.g(this, ((b.C0788b) action).a());
            return;
        }
        if (action instanceof b.c) {
            D0(((b.c) action).a(), true);
            return;
        }
        if (!(action instanceof b.a)) {
            coil.util.j.a();
            return;
        }
        DeleteTipDialog deleteTipDialogA = DeleteTipDialog.INSTANCE.a();
        deleteTipDialogA.m(new ki.a() { // from class: com.neeeex.eraser.recover.reco.f.d0
            @Override // ki.a
            public final void a() {
                FilePreviewNEEEEXActivity.C0(this.f65656a, action);
            }
        });
        androidx.fragment.app.l0 supportFragmentManager = getSupportFragmentManager();
        "getSupportFragmentManager(...)" /* decoded XOR */;
        supportFragmentManager.getClass();
        deleteTipDialogA.i(supportFragmentManager);
    }

    public final void D0(String path, boolean recover) {
        MutableLiveData mutableLiveDataD = null;
        if (recover) {
            com.neeeex.eraser.h0 sharedViewModel = getSharedViewModel();
            if (sharedViewModel != null) {
                mutableLiveDataD = sharedViewModel.E();
            }
        } else {
            com.neeeex.eraser.h0 sharedViewModel2 = getSharedViewModel();
            if (sharedViewModel2 != null) {
                mutableLiveDataD = sharedViewModel2.D();
            }
        }
        if (mutableLiveDataD != null) {
            mutableLiveDataD.postValue(path);
        }
        finish();
    }

    public final c E0() {
        String stringExtra = getIntent().getStringExtra(f65580e);
        if (stringExtra == null) {
            stringExtra = "";
        }
        String stringExtra2 = getIntent().getStringExtra(f65581f);
        if (stringExtra2 == null) {
            stringExtra2 = "";
        }
        String stringExtra3 = getIntent().getStringExtra(f65582g);
        if (stringExtra3 == null) {
            stringExtra3 = "";
        }
        String stringExtra4 = getIntent().getStringExtra(f65583h);
        return new c(stringExtra, stringExtra2, stringExtra3, stringExtra4 != null ? stringExtra4 : "", getIntent().getIntExtra(f65584i, 0), getIntent().getBooleanExtra(f65585j, false));
    }

    @Override // com.neeeex.eraser.base.RootActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ji.f fVarC = ji.f.c(getLayoutInflater());
        "inflate(...)" /* decoded XOR */;
        fVarC.getClass();
        this.binding = fVarC;
        ji.f fVar = null;
        if (fVarC == null) {
            p003kotlin.jvm.internal.v.n("binding" /* decoded XOR */);
            fVarC = null;
        }
        setContentView(fVarC.getRoot());
        ji.f fVar2 = this.binding;
        if (fVar2 == null) {
            p003kotlin.jvm.internal.v.n("binding" /* decoded XOR */);
            fVar2 = null;
        }
        fVar2.f85414e.setOnClickListener(new View.OnClickListener() { // from class: com.neeeex.eraser.recover.reco.f.z
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                FilePreviewNEEEEXActivity.u0(this.f65713a, view);
            }
        });
        x0(E0());
        ji.f fVar3 = this.binding;
        if (fVar3 == null) {
            p003kotlin.jvm.internal.v.n("binding" /* decoded XOR */);
        } else {
            fVar = fVar3;
        }
        FrameLayout frameLayout = fVar.f85413d;
        "flAdContainer" /* decoded XOR */;
        frameLayout.getClass();
        BaseAdActivity.showRenderAdAndRefresh$default(this, frameLayout, R$layout.ad_neeeex_native, "RF_DETAIL_NATIVE" /* decoded XOR */, null, 8, null);
    }

    public final void x0(final c content) {
        ji.f fVar = this.binding;
        if (fVar == null) {
            p003kotlin.jvm.internal.v.n("binding" /* decoded XOR */);
            fVar = null;
        }
        RelativeLayout relativeLayout = fVar.f85417h;
        Integer num = content.d() ? 8 : null;
        relativeLayout.setVisibility(num != null ? num.intValue() : 0);
        fVar.f85416g.setImageResource(com.neeeex.eraser.utils.c.f66140a.d(content.f()));
        fVar.f85419j.setText(content.b());
        fVar.f85420k.setText(content.c());
        fVar.f85421l.setText(content.e());
        fVar.f85418i.setText(content.a());
        fVar.f85415f.setOnClickListener(new View.OnClickListener() { // from class: com.neeeex.eraser.recover.reco.f.a0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                FilePreviewNEEEEXActivity.y0(this.f65629a, content, view);
            }
        });
        fVar.f85417h.setOnClickListener(new View.OnClickListener() { // from class: com.neeeex.eraser.recover.reco.f.b0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                FilePreviewNEEEEXActivity.z0(this.f65633a, content, view);
            }
        });
        fVar.f85411b.setOnClickListener(new View.OnClickListener() { // from class: com.neeeex.eraser.recover.reco.f.c0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                FilePreviewNEEEEXActivity.A0(this.f65637a, content, view);
            }
        });
    }

    /* JADX INFO: renamed from: com.neeeex.eraser.recover.reco.f.FilePreviewNEEEEXActivity$a, reason: from kotlin metadata */
    public static final class Companion {
        public /* synthetic */ Companion(p003kotlin.jvm.internal.m mVar) {
            this();
        }

        public final void a(Context context, String str, String str2, String str3, String str4, int i10, boolean z10) {
            "context" /* decoded XOR */;
            context.getClass();
            "name" /* decoded XOR */;
            str.getClass();
            "path" /* decoded XOR */;
            str2.getClass();
            "size" /* decoded XOR */;
            str3.getClass();
            "date" /* decoded XOR */;
            str4.getClass();
            Intent intent = new Intent(context, (Class<?>) FilePreviewNEEEEXActivity.class);
            intent.putExtra("extra_file_name" /* decoded XOR */, str);
            intent.putExtra("extra_file_path" /* decoded XOR */, str2);
            intent.putExtra("extra_file_size" /* decoded XOR */, str3);
            intent.putExtra("extra_file_date" /* decoded XOR */, str4);
            intent.putExtra("extra_file_type" /* decoded XOR */, i10);
            intent.putExtra("extra_file_recovered" /* decoded XOR */, z10);
            context.startActivity(intent);
        }

        public Companion() {
        }
    }
}