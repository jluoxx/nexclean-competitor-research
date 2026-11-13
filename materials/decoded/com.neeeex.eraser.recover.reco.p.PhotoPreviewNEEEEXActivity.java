package com.neeeex.eraser.recover.reco.p;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.FrameLayout;
import androidx.p002lifecycle.MutableLiveData;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.foundation.download.core.DownloadCommon;
import com.neeeex.eraser.R$layout;
import com.neeeex.eraser.base.BaseAdActivity;
import com.neeeex.eraser.module.dialog.DeleteTipDialog;
import java.io.File;
import p003kotlin.Metadata;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u0000 \u001d2\u00020\u0001:\u0003\u001e\u001f\u001aB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\t\u0010\nJ\u0019\u0010\r\u001a\u00020\b2\b\u0010\f\u001a\u0004\u0018\u00010\u000bH\u0014¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u0010\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u0017\u0010\u0013\u001a\u00020\b2\u0006\u0010\u0012\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u001f\u0010\u0017\u001a\u00020\b2\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0017\u0010\u0018R\u0016\u0010\u001c\u001a\u00020\u00198\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u001a\u0010\u001b¨\u0006 "}, d2 = {"Lcom/neeeex/eraser/recover/reco/p/PhotoPreviewNEEEEXActivity;", "Lcom/neeeex/eraser/base/BaseAdActivity;", "<init>", "()V", "", MBridgeConstans.DYNAMIC_VIEW_WX_PATH, "", "recover", "Lfl/m0;", "D0", "(Ljava/lang/String;Z)V", "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "(Landroid/os/Bundle;)V", "Lcom/neeeex/eraser/recover/reco/p/PhotoPreviewNEEEEXActivity$c;", "E0", "()Lcom/neeeex/eraser/recover/reco/p/PhotoPreviewNEEEEXActivity$c;", "content", "x0", "(Lcom/neeeex/eraser/recover/reco/p/PhotoPreviewNEEEEXActivity$c;)V", "Lcom/neeeex/eraser/recover/reco/p/PhotoPreviewNEEEEXActivity$b;", "operation", "B0", "(Lcom/neeeex/eraser/recover/reco/p/PhotoPreviewNEEEEXActivity$b;Ljava/lang/String;)V", "Lji/p;", "c", "Lji/p;", "binding", "d", DownloadCommon.DOWNLOAD_REPORT_FIND_FILE_RESULT_VALUE_B, "a", "tool-feature_productionRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class PhotoPreviewNEEEEXActivity extends BaseAdActivity {

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    public ji.p binding;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final String f65745e = "extra_media_name" /* decoded XOR */;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final String f65746f = "extra_media_path" /* decoded XOR */;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final String f65747g = "extra_media_resolution" /* decoded XOR */;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final String f65748h = "extra_media_size" /* decoded XOR */;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final String f65749i = "extra_media_date" /* decoded XOR */;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final String f65750j = "extra_media_recovered" /* decoded XOR */;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    public enum b {
        DELETE,
        RECOVER,
        FULL_SCREEN;


        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ ml.a f65753b = ml.b.a(d());

        public static ml.a getEntries() {
            return f65753b;
        }
    }

    public static final class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f65754a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f65755b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final String f65756c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final String f65757d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final String f65758e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final boolean f65759f;

        public c(String str, String str2, String str3, String str4, String str5, boolean z10) {
            "name" /* decoded XOR */;
            str.getClass();
            "path" /* decoded XOR */;
            str2.getClass();
            "resolution" /* decoded XOR */;
            str3.getClass();
            "size" /* decoded XOR */;
            str4.getClass();
            "date" /* decoded XOR */;
            str5.getClass();
            this.f65754a = str;
            this.f65755b = str2;
            this.f65756c = str3;
            this.f65757d = str4;
            this.f65758e = str5;
            this.f65759f = z10;
        }

        public final String a() {
            return this.f65758e;
        }

        public final String b() {
            return this.f65754a;
        }

        public final String c() {
            return this.f65755b;
        }

        public final boolean d() {
            return this.f65759f;
        }

        public final String e() {
            return this.f65756c;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            return p003kotlin.jvm.internal.v.c(this.f65754a, cVar.f65754a) && p003kotlin.jvm.internal.v.c(this.f65755b, cVar.f65755b) && p003kotlin.jvm.internal.v.c(this.f65756c, cVar.f65756c) && p003kotlin.jvm.internal.v.c(this.f65757d, cVar.f65757d) && p003kotlin.jvm.internal.v.c(this.f65758e, cVar.f65758e) && this.f65759f == cVar.f65759f;
        }

        public final String f() {
            return this.f65757d;
        }

        public int hashCode() {
            return (((((((((this.f65754a.hashCode() * 31) + this.f65755b.hashCode()) * 31) + this.f65756c.hashCode()) * 31) + this.f65757d.hashCode()) * 31) + this.f65758e.hashCode()) * 31) + Boolean.hashCode(this.f65759f);
        }

        public String toString() {
            return "PhotoContent(name=" + this.f65754a + ", path=" + this.f65755b + ", resolution=" + this.f65756c + ", size=" + this.f65757d + ", date=" + this.f65758e + ", recovered=" + this.f65759f + ")";
        }
    }

    public static final /* synthetic */ class d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f65760a;

        static {
            int[] iArr = new int[b.values().length];
            try {
                iArr[b.RECOVER.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[b.FULL_SCREEN.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[b.DELETE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f65760a = iArr;
        }
    }

    public static final void A0(PhotoPreviewNEEEEXActivity photoPreviewNEEEEXActivity, c cVar, View view) {
        photoPreviewNEEEEXActivity.B0(b.RECOVER, cVar.c());
    }

    public static final void C0(PhotoPreviewNEEEEXActivity photoPreviewNEEEEXActivity, String str) {
        photoPreviewNEEEEXActivity.D0(str, false);
    }

    private final void D0(String path, boolean recover) {
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

    public static void w0(PhotoPreviewNEEEEXActivity photoPreviewNEEEEXActivity, View view) {
        photoPreviewNEEEEXActivity.onBackPressed();
    }

    public static final void y0(PhotoPreviewNEEEEXActivity photoPreviewNEEEEXActivity, c cVar, View view) {
        photoPreviewNEEEEXActivity.B0(b.DELETE, cVar.c());
    }

    public static final void z0(PhotoPreviewNEEEEXActivity photoPreviewNEEEEXActivity, c cVar, View view) {
        photoPreviewNEEEEXActivity.B0(b.FULL_SCREEN, cVar.c());
    }

    public final void B0(b operation, final String path) {
        int i10 = d.f65760a[operation.ordinal()];
        if (i10 == 1) {
            D0(path, true);
            return;
        }
        if (i10 == 2) {
            PhotoFullPreviewNEEEEXActivity.INSTANCE.b(this, path);
            return;
        }
        if (i10 != 3) {
            coil.util.j.a();
            return;
        }
        DeleteTipDialog deleteTipDialogA = DeleteTipDialog.INSTANCE.a();
        deleteTipDialogA.m(new ki.a() { // from class: com.neeeex.eraser.recover.reco.p.i0
            @Override // ki.a
            public final void a() {
                PhotoPreviewNEEEEXActivity.C0(this.f65853a, path);
            }
        });
        androidx.fragment.app.l0 supportFragmentManager = getSupportFragmentManager();
        "getSupportFragmentManager(...)" /* decoded XOR */;
        supportFragmentManager.getClass();
        deleteTipDialogA.i(supportFragmentManager);
    }

    public final c E0() {
        String stringExtra = getIntent().getStringExtra(f65745e);
        if (stringExtra == null) {
            stringExtra = "";
        }
        String stringExtra2 = getIntent().getStringExtra(f65746f);
        if (stringExtra2 == null) {
            stringExtra2 = "";
        }
        String stringExtra3 = getIntent().getStringExtra(f65747g);
        if (stringExtra3 == null) {
            stringExtra3 = "";
        }
        String stringExtra4 = getIntent().getStringExtra(f65748h);
        if (stringExtra4 == null) {
            stringExtra4 = "";
        }
        String stringExtra5 = getIntent().getStringExtra(f65749i);
        return new c(stringExtra, stringExtra2, stringExtra3, stringExtra4, stringExtra5 != null ? stringExtra5 : "", getIntent().getBooleanExtra(f65750j, false));
    }

    @Override // com.neeeex.eraser.base.RootActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ji.p pVarC = ji.p.c(getLayoutInflater());
        "inflate(...)" /* decoded XOR */;
        pVarC.getClass();
        this.binding = pVarC;
        ji.p pVar = null;
        if (pVarC == null) {
            p003kotlin.jvm.internal.v.n("binding" /* decoded XOR */);
            pVarC = null;
        }
        setContentView(pVarC.getRoot());
        ji.p pVar2 = this.binding;
        if (pVar2 == null) {
            p003kotlin.jvm.internal.v.n("binding" /* decoded XOR */);
            pVar2 = null;
        }
        pVar2.f85628e.setOnClickListener(new View.OnClickListener() { // from class: com.neeeex.eraser.recover.reco.p.e0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                PhotoPreviewNEEEEXActivity.w0(this.f65830a, view);
            }
        });
        x0(E0());
        ji.p pVar3 = this.binding;
        if (pVar3 == null) {
            p003kotlin.jvm.internal.v.n("binding" /* decoded XOR */);
        } else {
            pVar = pVar3;
        }
        FrameLayout frameLayout = pVar.f85627d;
        "flAdContainer" /* decoded XOR */;
        frameLayout.getClass();
        BaseAdActivity.showRenderAdAndRefresh$default(this, frameLayout, R$layout.ad_neeeex_native, "RP_DETAIL_NATIVE" /* decoded XOR */, null, 8, null);
    }

    public final void x0(final c content) {
        ji.p pVar = this.binding;
        if (pVar == null) {
            p003kotlin.jvm.internal.v.n("binding" /* decoded XOR */);
            pVar = null;
        }
        pVar.f85632i.setVisibility(content.d() ? 8 : 0);
        pVar.f85634k.setText(content.b());
        pVar.f85635l.setText(content.c());
        pVar.f85636m.setText(content.e());
        pVar.f85637n.setText(content.f());
        pVar.f85633j.setText(content.a());
        String strC = content.c();
        String str = strC.length() > 0 ? strC : null;
        if (str != null) {
            com.bumptech.glide.b.v(this).s(new File(str)).G0(pVar.f85631h);
        }
        pVar.f85629f.setOnClickListener(new View.OnClickListener() { // from class: com.neeeex.eraser.recover.reco.p.f0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                PhotoPreviewNEEEEXActivity.y0(this.f65833a, content, view);
            }
        });
        pVar.f85630g.setOnClickListener(new View.OnClickListener() { // from class: com.neeeex.eraser.recover.reco.p.g0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                PhotoPreviewNEEEEXActivity.z0(this.f65846a, content, view);
            }
        });
        pVar.f85632i.setOnClickListener(new View.OnClickListener() { // from class: com.neeeex.eraser.recover.reco.p.h0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                PhotoPreviewNEEEEXActivity.A0(this.f65849a, content, view);
            }
        });
    }

    /* JADX INFO: renamed from: com.neeeex.eraser.recover.reco.p.PhotoPreviewNEEEEXActivity$a, reason: from kotlin metadata */
    public static final class Companion {
        public /* synthetic */ Companion(p003kotlin.jvm.internal.m mVar) {
            this();
        }

        public final void a(Context context, String str, String str2, String str3, String str4, String str5, boolean z10) {
            "context" /* decoded XOR */;
            context.getClass();
            "name" /* decoded XOR */;
            str.getClass();
            "path" /* decoded XOR */;
            str2.getClass();
            "resolution" /* decoded XOR */;
            str3.getClass();
            "size" /* decoded XOR */;
            str4.getClass();
            "date" /* decoded XOR */;
            str5.getClass();
            Intent intent = new Intent(context, (Class<?>) PhotoPreviewNEEEEXActivity.class);
            intent.putExtra("extra_media_name" /* decoded XOR */, str);
            intent.putExtra("extra_media_path" /* decoded XOR */, str2);
            intent.putExtra("extra_media_resolution" /* decoded XOR */, str3);
            intent.putExtra("extra_media_size" /* decoded XOR */, str4);
            intent.putExtra("extra_media_date" /* decoded XOR */, str5);
            intent.putExtra("extra_media_recovered" /* decoded XOR */, z10);
            context.startActivity(intent);
        }

        public Companion() {
        }
    }
}