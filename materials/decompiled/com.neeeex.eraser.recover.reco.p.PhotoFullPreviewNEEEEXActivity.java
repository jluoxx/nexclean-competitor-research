package com.neeeex.eraser.recover.reco.p;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import com.mbridge.msdk.foundation.download.core.DownloadCommon;
import com.neeeex.eraser.base.RootActivity;
import java.io.File;
import p003kotlin.Metadata;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u0000 \u00152\u00020\u0001:\u0002\u0016\u0017B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0019\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0014¢\u0006\u0004\b\u0007\u0010\bJ\u0019\u0010\t\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0014¢\u0006\u0004\b\t\u0010\bJ\u000f\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u000f\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\rH\u0002¢\u0006\u0004\b\u000f\u0010\u0010R\u0016\u0010\u0014\u001a\u00020\u00118\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013¨\u0006\u0018"}, d2 = {"Lcom/neeeex/eraser/recover/reco/p/PhotoFullPreviewNEEEEXActivity;", "Lcom/neeeex/eraser/base/RootActivity;", "<init>", "()V", "Landroid/os/Bundle;", "savedInstanceState", "Lfl/m0;", "onCreate", "(Landroid/os/Bundle;)V", "onPostCreate", "Lcom/neeeex/eraser/recover/reco/p/PhotoFullPreviewNEEEEXActivity$b;", "j0", "()Lcom/neeeex/eraser/recover/reco/p/PhotoFullPreviewNEEEEXActivity$b;", "", "model", "i0", "(Ljava/lang/Object;)V", "Lji/o;", "c", "Lji/o;", "binding", "d", DownloadCommon.DOWNLOAD_REPORT_FIND_FILE_RESULT_VALUE_B, "a", "tool-feature_productionRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class PhotoFullPreviewNEEEEXActivity extends RootActivity {

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    public ji.o binding;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final String f65739e = com.neeeex.eraser.m0.a("bOyOpqQGzr5t/ZuLtTjXsw==\n", "CZT61MVZo9s=\n");

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final String f65740f = com.neeeex.eraser.m0.a("eioLFO5NnJd7Ox45+mCY\n", "H1J/Zo8S8fI=\n");

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    public interface b {

        public static final class a implements b {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final Object f65742a;

            public a(Object obj) {
                com.neeeex.eraser.m0.a("v/Hy6yc=\n", "0p6WjkundfM=\n");
                obj.getClass();
                this.f65742a = obj;
            }

            public final Object a() {
                return this.f65742a;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof a) && p003kotlin.jvm.internal.v.c(this.f65742a, ((a) obj).f65742a);
            }

            public int hashCode() {
                return this.f65742a.hashCode();
            }

            public String toString() {
                return "Display(model=" + this.f65742a + ")";
            }
        }

        /* JADX INFO: renamed from: com.neeeex.eraser.recover.reco.p.PhotoFullPreviewNEEEEXActivity$b$b, reason: collision with other inner class name */
        public static final class C0793b implements b {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final C0793b f65743a = new C0793b();

            public boolean equals(Object obj) {
                return this == obj || (obj instanceof C0793b);
            }

            public int hashCode() {
                return 597193707;
            }

            public String toString() {
                return com.neeeex.eraser.m0.a("evqGNRRNUQ==\n", "N5P1Rn0jNls=\n");
            }
        }
    }

    public static void h0(PhotoFullPreviewNEEEEXActivity photoFullPreviewNEEEEXActivity, View view) {
        photoFullPreviewNEEEEXActivity.onBackPressed();
    }

    public final void i0(Object model) {
        com.bumptech.glide.j jVarT = com.bumptech.glide.b.v(this).t(model);
        ji.o oVar = this.binding;
        if (oVar == null) {
            p003kotlin.jvm.internal.v.n(com.neeeex.eraser.m0.a("tGxeFjl0Tg==\n", "1gUwclAaKYo=\n"));
            oVar = null;
        }
        jVarT.G0(oVar.f85608c);
    }

    public final b j0() {
        String stringExtra = getIntent().getStringExtra(f65740f);
        if (stringExtra == null || p003kotlin.text.k0.r0(stringExtra)) {
            String stringExtra2 = getIntent().getStringExtra(f65739e);
            return (stringExtra2 == null || p003kotlin.text.k0.r0(stringExtra2)) ? b.C0793b.f65743a : new b.a(new File(stringExtra2));
        }
        Uri uri = Uri.parse(stringExtra);
        com.neeeex.eraser.m0.a("yoCEmDGq6MeUyA==\n", "uuH261SCxuk=\n");
        uri.getClass();
        return new b.a(uri);
    }

    @Override // com.neeeex.eraser.base.RootActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ji.o oVarC = ji.o.c(getLayoutInflater());
        com.neeeex.eraser.m0.a("TakclgJ1SKMK6VTT\n", "JMd6+mMBLYs=\n");
        oVarC.getClass();
        this.binding = oVarC;
        ji.o oVar = null;
        if (oVarC == null) {
            p003kotlin.jvm.internal.v.n(com.neeeex.eraser.m0.a("PJFprq48Wg==\n", "XvgHysdSPSw=\n"));
            oVarC = null;
        }
        setContentView(oVarC.getRoot());
        ji.o oVar2 = this.binding;
        if (oVar2 == null) {
            p003kotlin.jvm.internal.v.n(com.neeeex.eraser.m0.a("8P4M7IFEnA==\n", "kpdiiOgq+8g=\n"));
        } else {
            oVar = oVar2;
        }
        oVar.f85607b.setOnClickListener(new View.OnClickListener() { // from class: com.neeeex.eraser.recover.reco.p.d0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                PhotoFullPreviewNEEEEXActivity.h0(this.f65813a, view);
            }
        });
        b bVarJ0 = j0();
        if (p003kotlin.jvm.internal.v.c(bVarJ0, b.C0793b.f65743a)) {
            return;
        }
        if (bVarJ0 instanceof b.a) {
            i0(((b.a) bVarJ0).a());
        } else {
            coil.util.j.a();
        }
    }

    @Override // com.neeeex.eraser.base.RootActivity, androidx.appcompat.app.AppCompatActivity, android.app.Activity
    public void onPostCreate(Bundle savedInstanceState) {
        super.onPostCreate(savedInstanceState);
        ti.a.a(this, false);
    }

    /* JADX INFO: renamed from: com.neeeex.eraser.recover.reco.p.PhotoFullPreviewNEEEEXActivity$a, reason: from kotlin metadata */
    public static final class Companion {
        public /* synthetic */ Companion(p003kotlin.jvm.internal.m mVar) {
            this();
        }

        public final void a(Context context, Uri uri) {
            com.neeeex.eraser.m0.a("xbGWkPy7vQ==\n", "pt745JnDyQc=\n");
            context.getClass();
            com.neeeex.eraser.m0.a("Wx9v\n", "Lm0GXDEc4b8=\n");
            uri.getClass();
            Intent intent = new Intent(context, (Class<?>) PhotoFullPreviewNEEEEXActivity.class);
            intent.putExtra(com.neeeex.eraser.m0.a("UvkW3oofccRT6APznjJ1\n", "N4FirOtAHKE=\n"), uri.toString());
            context.startActivity(intent);
        }

        public final void b(Context context, String str) {
            com.neeeex.eraser.m0.a("/U+CGAxXhA==\n", "niDsbGkv8Ag=\n");
            context.getClass();
            com.neeeex.eraser.m0.a("C71XTQ==\n", "e9wjJbgTNbc=\n");
            str.getClass();
            Intent intent = new Intent(context, (Class<?>) PhotoFullPreviewNEEEEXActivity.class);
            intent.putExtra(com.neeeex.eraser.m0.a("MG03+BSvnCYxfCLVBZGFKw==\n", "VRVDinXw8UM=\n"), str);
            context.startActivity(intent);
        }

        public Companion() {
        }
    }
}