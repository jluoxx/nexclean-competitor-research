package com.neeeex.ctools.features.photocompressor.detail;

import am.q;
import android.animation.ObjectAnimator;
import android.app.Dialog;
import android.content.Intent;
import android.graphics.drawable.ColorDrawable;
import android.net.Uri;
import android.os.Bundle;
import android.os.SystemClock;
import android.text.format.Formatter;
import android.util.Property;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import android.view.animation.LinearInterpolator;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.core.view.a1;
import androidx.core.view.c1;
import androidx.core.view.d1;
import androidx.core.view.y;
import androidx.p002lifecycle.Observer;
import androidx.p002lifecycle.ViewModelProvider;
import b.w;
import coil.util.j;
import com.android.launcher3.testing.shared.TestProtocol;
import com.mbridge.msdk.foundation.download.core.DownloadCommon;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.playercommon.exoplayer2.trackselection.AdaptiveTrackSelection;
import com.neeeex.eraser.R$id;
import com.neeeex.eraser.R$layout;
import com.neeeex.eraser.R$string;
import com.neeeex.eraser.base.BaseAdActivity;
import com.neeeex.eraser.m0;
import com.pgl.ssdk.b0;
import com.thinkup.core.common.nn.m.n;
import p003kotlin.Metadata;
import p003kotlin.jvm.functions.Function0;
import p003kotlin.jvm.functions.Function1;
import p003kotlin.jvm.internal.p;
import p003kotlin.jvm.internal.s;
import p003kotlin.jvm.internal.v;
import p003kotlin.text.k0;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0092\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0007\u0018\u0000 O2\u00020\u0001:\u0003P(QB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0005\u0010\u0003J\u000f\u0010\u0006\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0006\u0010\u0003J\u0019\u0010\t\u001a\u00020\u00042\b\u0010\b\u001a\u0004\u0018\u00010\u0007H\u0014¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\u000b\u001a\u00020\u0004H\u0014¢\u0006\u0004\b\u000b\u0010\u0003J\u0019\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\u0006\u0010\r\u001a\u00020\fH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0012\u001a\u00020\u00042\u0006\u0010\u0011\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u0017\u0010\u0016\u001a\u00020\u00042\u0006\u0010\u0015\u001a\u00020\u0014H\u0002¢\u0006\u0004\b\u0016\u0010\u0017J\u0017\u0010\u0019\u001a\u00020\u00042\u0006\u0010\u0015\u001a\u00020\u0018H\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ\u000f\u0010\u001b\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u001b\u0010\u0003J\u001d\u0010\u001e\u001a\u00020\u00042\f\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u00040\u001cH\u0002¢\u0006\u0004\b\u001e\u0010\u001fJ\u000f\u0010 \u001a\u00020\u0004H\u0002¢\u0006\u0004\b \u0010\u0003J\u000f\u0010!\u001a\u00020\u0004H\u0002¢\u0006\u0004\b!\u0010\u0003J\u000f\u0010\"\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\"\u0010\u0003J\u0017\u0010%\u001a\u00020#2\u0006\u0010$\u001a\u00020#H\u0002¢\u0006\u0004\b%\u0010&R\u0016\u0010*\u001a\u00020'8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b(\u0010)R\u0016\u0010.\u001a\u00020+8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b,\u0010-R\u0016\u00102\u001a\u00020/8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b0\u00101R\u0016\u00104\u001a\u00020/8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b3\u00101R\u0016\u00108\u001a\u0002058\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b6\u00107R\u0016\u0010:\u001a\u00020+8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b9\u0010-R\u0018\u0010>\u001a\u0004\u0018\u00010;8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b<\u0010=R\u0018\u0010B\u001a\u0004\u0018\u00010?8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b@\u0010AR\u0016\u0010F\u001a\u00020C8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bD\u0010ER\u0018\u0010J\u001a\u0004\u0018\u00010G8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bH\u0010IR\u0016\u0010N\u001a\u00020K8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bL\u0010M¨\u0006R"}, d2 = {"Lcom/neeeex/ctools/features/photocompressor/detail/PhotoCompressionNEEEEXActivity;", "Lcom/neeeex/eraser/base/BaseAdActivity;", "<init>", "()V", "Lfl/m0;", "B0", "z0", "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "(Landroid/os/Bundle;)V", "onDestroy", "Landroid/content/Intent;", "sourceIntent", "Lcom/neeeex/ctools/features/photocompressor/detail/PhotoCompressionNEEEEXActivity$c;", "F0", "(Landroid/content/Intent;)Lcom/neeeex/ctools/features/photocompressor/detail/PhotoCompressionNEEEEXActivity$c;", "source", "A0", "(Lcom/neeeex/ctools/features/photocompressor/detail/PhotoCompressionNEEEEXActivity$c;)V", "Lcom/neeeex/ctools/features/photocompressor/detail/h;", TestProtocol.STATE_FIELD, "G0", "(Lcom/neeeex/ctools/features/photocompressor/detail/h;)V", "Lcom/neeeex/ctools/features/photocompressor/detail/h$c;", "H0", "(Lcom/neeeex/ctools/features/photocompressor/detail/h$c;)V", "J0", "Lkotlin/Function0;", "action", "E0", "(Lkotlin/jvm/functions/Function0;)V", "C0", "I0", "K0", "", "value", "D0", "(I)I", "Lcom/neeeex/ctools/features/photocompressor/detail/i;", "c", "Lcom/neeeex/ctools/features/photocompressor/detail/i;", "model", "Landroid/view/View;", "d", "Landroid/view/View;", "rootView", "Landroid/widget/TextView;", "e", "Landroid/widget/TextView;", "compressedSizeView", "f", "statusView", "Landroid/widget/Button;", "g", "Landroid/widget/Button;", "saveButton", "h", "bottomActionBar", "Landroid/app/Dialog;", "i", "Landroid/app/Dialog;", "savingDialog", "Landroid/animation/ObjectAnimator;", "j", "Landroid/animation/ObjectAnimator;", "spinnerAnimator", "", CampaignEx.JSON_KEY_AD_K, "J", "savingDialogStartedAtMillis", "Ljava/lang/Runnable;", "l", "Ljava/lang/Runnable;", "pendingSavingCompletion", "", "m", "Z", "hasRequestedCompressionCompleteInterstitial", n.f72065d, DownloadCommon.DOWNLOAD_REPORT_FIND_FILE_RESULT_VALUE_B, "a", "tool-feature_productionRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class PhotoCompressionNEEEEXActivity extends BaseAdActivity {

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    public i model;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    public View rootView;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    public TextView compressedSizeView;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    public TextView statusView;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    public Button saveButton;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    public View bottomActionBar;

    /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata */
    public Dialog savingDialog;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    public ObjectAnimator spinnerAnimator;

    /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata */
    public long savingDialogStartedAtMillis;

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
    public Runnable pendingSavingCompletion;

    /* JADX INFO: renamed from: m, reason: collision with root package name and from kotlin metadata */
    public boolean hasRequestedCompressionCompleteInterstitial;

    public interface b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final C0757b f64664a = C0757b.f64666a;

        public static final class a implements b {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public static final a f64665b = new a();

            public boolean equals(Object obj) {
                return this == obj || (obj instanceof a);
            }

            public int hashCode() {
                return -1912606135;
            }

            public String toString() {
                return "Calculating" /* decoded XOR */;
            }
        }

        /* JADX INFO: renamed from: com.neeeex.ctools.features.photocompressor.detail.PhotoCompressionNEEEEXActivity$b$b, reason: collision with other inner class name */
        public static final class C0757b {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final /* synthetic */ C0757b f64666a = new C0757b();

            public final b a(com.neeeex.ctools.features.photocompressor.detail.h hVar) {
                "state" /* decoded XOR */;
                hVar.getClass();
                if (v.c(hVar, com.neeeex.ctools.features.photocompressor.detail.h.d.f64707a)) {
                    return d.f64668b;
                }
                if (v.c(hVar, com.neeeex.ctools.features.photocompressor.detail.h.b.f64704a)) {
                    return a.f64665b;
                }
                if (hVar instanceof com.neeeex.ctools.features.photocompressor.detail.h.e) {
                    return new f(((com.neeeex.ctools.features.photocompressor.detail.h.e) hVar).a().b().length());
                }
                if (v.c(hVar, com.neeeex.ctools.features.photocompressor.detail.h.a.f64703a)) {
                    return e.f64669b;
                }
                if (v.c(hVar, com.neeeex.ctools.features.photocompressor.detail.h.f.f64709a)) {
                    return g.f64671b;
                }
                if (hVar instanceof com.neeeex.ctools.features.photocompressor.detail.h.g) {
                    return new h(((com.neeeex.ctools.features.photocompressor.detail.h.g) hVar).a());
                }
                if (hVar instanceof com.neeeex.ctools.features.photocompressor.detail.h.c) {
                    return new c((com.neeeex.ctools.features.photocompressor.detail.h.c) hVar);
                }
                j.a();
                return null;
            }
        }

        public static final class c implements b {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final com.neeeex.ctools.features.photocompressor.detail.h.c f64667b;

            public c(com.neeeex.ctools.features.photocompressor.detail.h.c cVar) {
                "state" /* decoded XOR */;
                cVar.getClass();
                this.f64667b = cVar;
            }

            public final com.neeeex.ctools.features.photocompressor.detail.h.c a() {
                return this.f64667b;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof c) && v.c(this.f64667b, ((c) obj).f64667b);
            }

            public int hashCode() {
                return this.f64667b.hashCode();
            }

            public String toString() {
                return "Failure(state=" + this.f64667b + ")";
            }
        }

        public static final class d implements b {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public static final d f64668b = new d();

            public boolean equals(Object obj) {
                return this == obj || (obj instanceof d);
            }

            public int hashCode() {
                return 1318570578;
            }

            public String toString() {
                return "None" /* decoded XOR */;
            }
        }

        public static final class e implements b {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public static final e f64669b = new e();

            public boolean equals(Object obj) {
                return this == obj || (obj instanceof e);
            }

            public int hashCode() {
                return -1120678323;
            }

            public String toString() {
                return "Optimized" /* decoded XOR */;
            }
        }

        public static final class f implements b {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final long f64670b;

            public f(long j10) {
                this.f64670b = j10;
            }

            public final long a() {
                return this.f64670b;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof f) && this.f64670b == ((f) obj).f64670b;
            }

            public int hashCode() {
                return Long.hashCode(this.f64670b);
            }

            public String toString() {
                return "Ready(bytes=" + this.f64670b + ")";
            }
        }

        public static final class g implements b {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public static final g f64671b = new g();

            public boolean equals(Object obj) {
                return this == obj || (obj instanceof g);
            }

            public int hashCode() {
                return 261435284;
            }

            public String toString() {
                return "Saving" /* decoded XOR */;
            }
        }

        public static final class h implements b {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final Uri f64672b;

            public h(Uri uri) {
                "uri" /* decoded XOR */;
                uri.getClass();
                this.f64672b = uri;
            }

            public final Uri a() {
                return this.f64672b;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof h) && v.c(this.f64672b, ((h) obj).f64672b);
            }

            public int hashCode() {
                return this.f64672b.hashCode();
            }

            public String toString() {
                return "Success(uri=" + this.f64672b + ")";
            }
        }
    }

    public static final class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Uri f64673a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f64674b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final long f64675c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final boolean f64676d;

        public c(Uri uri, String str, long j10, boolean z10) {
            "uri" /* decoded XOR */;
            uri.getClass();
            "displayName" /* decoded XOR */;
            str.getClass();
            this.f64673a = uri;
            this.f64674b = str;
            this.f64675c = j10;
            this.f64676d = z10;
        }

        public final String a() {
            return this.f64674b;
        }

        public final boolean b() {
            return this.f64676d;
        }

        public final long c() {
            return this.f64675c;
        }

        public final Uri d() {
            return this.f64673a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            return v.c(this.f64673a, cVar.f64673a) && v.c(this.f64674b, cVar.f64674b) && this.f64675c == cVar.f64675c && this.f64676d == cVar.f64676d;
        }

        public int hashCode() {
            return (((((this.f64673a.hashCode() * 31) + this.f64674b.hashCode()) * 31) + Long.hashCode(this.f64675c)) * 31) + Boolean.hashCode(this.f64676d);
        }

        public String toString() {
            return "SourceRequest(uri=" + this.f64673a + ", displayName=" + this.f64674b + ", sizeBytes=" + this.f64675c + ", readOnly=" + this.f64676d + ")";
        }
    }

    public static final class e implements Observer, p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Function1 f64677a;

        public e(Function1 function1) {
            "function" /* decoded XOR */;
            function1.getClass();
            this.f64677a = function1;
        }

        public final boolean equals(Object obj) {
            if ((obj instanceof Observer) && (obj instanceof p)) {
                return v.c(getFunctionDelegate(), ((p) obj).getFunctionDelegate());
            }
            return false;
        }

        @Override // p003kotlin.jvm.internal.p
        public final fl.h getFunctionDelegate() {
            return this.f64677a;
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }

        @Override // androidx.p002lifecycle.Observer
        public final /* synthetic */ void onChanged(Object obj) {
            this.f64677a.invoke(obj);
        }
    }

    private final void B0() {
        View viewFindViewById = findViewById(R$id.neeeex_photo_compression_root);
        "findViewById(...)" /* decoded XOR */;
        viewFindViewById.getClass();
        this.rootView = viewFindViewById;
        View viewFindViewById2 = findViewById(R$id.neeeex_photo_compression_after_size);
        "findViewById(...)" /* decoded XOR */;
        viewFindViewById2.getClass();
        this.compressedSizeView = (TextView) viewFindViewById2;
        View viewFindViewById3 = findViewById(R$id.neeeex_photo_compression_status);
        "findViewById(...)" /* decoded XOR */;
        viewFindViewById3.getClass();
        this.statusView = (TextView) viewFindViewById3;
        View viewFindViewById4 = findViewById(R$id.neeeex_photo_compression_action);
        "findViewById(...)" /* decoded XOR */;
        viewFindViewById4.getClass();
        this.saveButton = (Button) viewFindViewById4;
        View viewFindViewById5 = findViewById(R$id.neeeex_photo_compression_action_bar);
        "findViewById(...)" /* decoded XOR */;
        viewFindViewById5.getClass();
        this.bottomActionBar = viewFindViewById5;
    }

    public static void s0(PhotoCompressionNEEEEXActivity photoCompressionNEEEEXActivity, View view) {
        mi.a.f88870a.A();
        i iVar = photoCompressionNEEEEXActivity.model;
        if (iVar == null) {
            v.n("model" /* decoded XOR */);
            iVar = null;
        }
        iVar.l();
    }

    public static fl.m0 t0(PhotoCompressionNEEEEXActivity photoCompressionNEEEEXActivity, b bVar) {
        photoCompressionNEEEEXActivity.H0(((b.c) bVar).a());
        return fl.m0.f80959a;
    }

    public static fl.m0 u0(PhotoCompressionNEEEEXActivity photoCompressionNEEEEXActivity, b bVar) {
        photoCompressionNEEEEXActivity.I0();
        photoCompressionNEEEEXActivity.setResult(-1, new Intent().setData(((b.h) bVar).a()));
        photoCompressionNEEEEXActivity.finish();
        return fl.m0.f80959a;
    }

    public static void v0(PhotoCompressionNEEEEXActivity photoCompressionNEEEEXActivity, View view) {
        photoCompressionNEEEEXActivity.finish();
    }

    public static c1 w0(View view, PhotoCompressionNEEEEXActivity photoCompressionNEEEEXActivity, int i10, int i11, View view2, c1 c1Var) {
        "<unused var>" /* decoded XOR */;
        view2.getClass();
        "insets" /* decoded XOR */;
        c1Var.getClass();
        o2.d dVarF = c1Var.f(c1.p.i());
        "getInsets(...)" /* decoded XOR */;
        dVarF.getClass();
        view.getClass();
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams == null) {
            b0.a("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams" /* decoded XOR */);
            return null;
        }
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
        marginLayoutParams.topMargin = i10 + dVarF.f89981b;
        view.setLayoutParams(marginLayoutParams);
        View view3 = photoCompressionNEEEEXActivity.bottomActionBar;
        if (view3 == null) {
            v.n("bottomActionBar" /* decoded XOR */);
            view3 = null;
        }
        ViewGroup.LayoutParams layoutParams2 = view3.getLayoutParams();
        if (layoutParams2 == null) {
            b0.a("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams" /* decoded XOR */);
            return null;
        }
        ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) layoutParams2;
        marginLayoutParams2.bottomMargin = i11 + dVarF.f89983d;
        view3.setLayoutParams(marginLayoutParams2);
        return c1Var;
    }

    public static void x0(PhotoCompressionNEEEEXActivity photoCompressionNEEEEXActivity, Function0 function0) {
        photoCompressionNEEEEXActivity.pendingSavingCompletion = null;
        photoCompressionNEEEEXActivity.C0();
        photoCompressionNEEEEXActivity.savingDialogStartedAtMillis = 0L;
        function0.invoke();
    }

    private final void z0() {
        final View viewFindViewById = findViewById(R$id.neeeex_photo_compression_toolbar);
        ViewGroup.LayoutParams layoutParams = viewFindViewById.getLayoutParams();
        View view = null;
        ViewGroup.MarginLayoutParams marginLayoutParams = layoutParams instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams : null;
        final int i10 = marginLayoutParams != null ? marginLayoutParams.topMargin : 0;
        View view2 = this.bottomActionBar;
        if (view2 == null) {
            v.n("bottomActionBar" /* decoded XOR */);
            view2 = null;
        }
        ViewGroup.LayoutParams layoutParams2 = view2.getLayoutParams();
        ViewGroup.MarginLayoutParams marginLayoutParams2 = layoutParams2 instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams2 : null;
        final int i11 = marginLayoutParams2 != null ? marginLayoutParams2.bottomMargin : 0;
        Window window = getWindow();
        View view3 = this.rootView;
        if (view3 == null) {
            v.n("rootView" /* decoded XOR */);
            view3 = null;
        }
        d1 d1VarA = a1.a(window, view3);
        d1VarA.d(true);
        d1VarA.c(true);
        View view4 = this.rootView;
        if (view4 == null) {
            v.n("rootView" /* decoded XOR */);
            view4 = null;
        }
        androidx.core.view.m0.w0(view4, new y() { // from class: com.neeeex.ctools.features.photocompressor.detail.d
            @Override // androidx.core.view.y
            public final c1 a(View view5, c1 c1Var) {
                return PhotoCompressionNEEEEXActivity.w0(viewFindViewById, this, i10, i11, view5, c1Var);
            }
        });
        View view5 = this.rootView;
        if (view5 == null) {
            v.n("rootView" /* decoded XOR */);
        } else {
            view = view5;
        }
        androidx.core.view.m0.i0(view);
    }

    public final void A0(c source) {
        ((com.bumptech.glide.j) com.bumptech.glide.b.v(this).r(source.d()).e()).G0((ImageView) findViewById(R$id.neeeex_photo_compression_preview));
        String fileSize = Formatter.formatFileSize(this, source.c());
        ((TextView) findViewById(R$id.neeeex_photo_compression_original_size)).setText(fileSize);
        i iVar = null;
        TextView textView = null;
        if (source.b()) {
            View view = this.bottomActionBar;
            if (view == null) {
                v.n("bottomActionBar" /* decoded XOR */);
                view = null;
            }
            view.setVisibility(8);
            TextView textView2 = this.compressedSizeView;
            if (textView2 == null) {
                v.n("compressedSizeView" /* decoded XOR */);
                textView2 = null;
            }
            textView2.setText(fileSize);
            TextView textView3 = this.statusView;
            if (textView3 == null) {
                v.n("statusView" /* decoded XOR */);
            } else {
                textView = textView3;
            }
            textView.setText(R$string.ctools_neeeex_photo_compressor_read_only);
            return;
        }
        Button button = this.saveButton;
        if (button == null) {
            v.n("saveButton" /* decoded XOR */);
            button = null;
        }
        button.setOnClickListener(new View.OnClickListener() { // from class: com.neeeex.ctools.features.photocompressor.detail.c
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                PhotoCompressionNEEEEXActivity.s0(this.f64692a, view2);
            }
        });
        i iVar2 = this.model;
        if (iVar2 == null) {
            v.n("model" /* decoded XOR */);
            iVar2 = null;
        }
        iVar2.i().observe(this, new e(new d(this)));
        i iVar3 = this.model;
        if (iVar3 == null) {
            v.n("model" /* decoded XOR */);
        } else {
            iVar = iVar3;
        }
        iVar.o(source.d(), source.a(), source.c());
    }

    public final void C0() {
        ObjectAnimator objectAnimator = this.spinnerAnimator;
        if (objectAnimator != null) {
            objectAnimator.cancel();
        }
        this.spinnerAnimator = null;
        Dialog dialog = this.savingDialog;
        if (dialog != null) {
            dialog.dismiss();
        }
        this.savingDialog = null;
    }

    public final int D0(int value) {
        return (int) (value * getResources().getDisplayMetrics().density);
    }

    public final void E0(final Function0 action) {
        J0();
        Runnable runnable = this.pendingSavingCompletion;
        View view = null;
        if (runnable != null) {
            View view2 = this.rootView;
            if (view2 == null) {
                v.n("rootView" /* decoded XOR */);
                view2 = null;
            }
            view2.removeCallbacks(runnable);
        }
        long jG = q.g(AdaptiveTrackSelection.DEFAULT_MIN_TIME_BETWEEN_BUFFER_REEVALUTATION_MS - (SystemClock.elapsedRealtime() - this.savingDialogStartedAtMillis), 0L);
        Runnable runnable2 = new Runnable() { // from class: com.neeeex.ctools.features.photocompressor.detail.g
            @Override // java.lang.Runnable
            public final void run() {
                PhotoCompressionNEEEEXActivity.x0(this.f64701a, action);
            }
        };
        this.pendingSavingCompletion = runnable2;
        if (jG == 0) {
            runnable2.run();
            return;
        }
        View view3 = this.rootView;
        if (view3 == null) {
            v.n("rootView" /* decoded XOR */);
        } else {
            view = view3;
        }
        view.postDelayed(runnable2, jG);
    }

    public final c F0(Intent sourceIntent) {
        Uri uri;
        String stringExtra = sourceIntent.getStringExtra("ctools_photo_compressor_uri" /* decoded XOR */);
        if (stringExtra != null) {
            if (k0.r0(stringExtra)) {
                stringExtra = null;
            }
            if (stringExtra != null && (uri = Uri.parse(stringExtra)) != null) {
                Long lValueOf = Long.valueOf(sourceIntent.getLongExtra("ctools_photo_compressor_size_bytes" /* decoded XOR */, 0L));
                if (lValueOf.longValue() <= 0) {
                    lValueOf = null;
                }
                if (lValueOf != null) {
                    long jLongValue = lValueOf.longValue();
                    String stringExtra2 = sourceIntent.getStringExtra("ctools_photo_compressor_display_name" /* decoded XOR */);
                    if (stringExtra2 == null) {
                        stringExtra2 = "";
                    }
                    return new c(uri, stringExtra2, jLongValue, sourceIntent.getBooleanExtra("ctools_photo_compressor_read_only" /* decoded XOR */, false));
                }
            }
        }
        return null;
    }

    public final void G0(h state) {
        final b bVarA = b.f64664a.a(state);
        if (v.c(bVarA, b.d.f64668b)) {
            return;
        }
        Button button = null;
        if (v.c(bVarA, b.a.f64665b)) {
            TextView textView = this.compressedSizeView;
            if (textView == null) {
                v.n("compressedSizeView" /* decoded XOR */);
                textView = null;
            }
            textView.setText(R$string.ctools_neeeex_photo_compressor_not_available);
            TextView textView2 = this.statusView;
            if (textView2 == null) {
                v.n("statusView" /* decoded XOR */);
                textView2 = null;
            }
            textView2.setText(R$string.ctools_neeeex_photo_compressor_calculating);
            Button button2 = this.saveButton;
            if (button2 == null) {
                v.n("saveButton" /* decoded XOR */);
            } else {
                button = button2;
            }
            button.setEnabled(false);
            return;
        }
        if (bVarA instanceof b.f) {
            TextView textView3 = this.statusView;
            if (textView3 == null) {
                v.n("statusView" /* decoded XOR */);
                textView3 = null;
            }
            textView3.setText(R$string.ctools_neeeex_photo_compressor_disclaimer);
            TextView textView4 = this.compressedSizeView;
            if (textView4 == null) {
                v.n("compressedSizeView" /* decoded XOR */);
                textView4 = null;
            }
            textView4.setText(Formatter.formatFileSize(this, ((b.f) bVarA).a()));
            View view = this.bottomActionBar;
            if (view == null) {
                v.n("bottomActionBar" /* decoded XOR */);
                view = null;
            }
            view.setVisibility(0);
            Button button3 = this.saveButton;
            if (button3 == null) {
                v.n("saveButton" /* decoded XOR */);
            } else {
                button = button3;
            }
            button.setEnabled(true);
            return;
        }
        if (v.c(bVarA, b.e.f64669b)) {
            TextView textView5 = this.statusView;
            if (textView5 == null) {
                v.n("statusView" /* decoded XOR */);
                textView5 = null;
            }
            textView5.setText(R$string.ctools_neeeex_photo_compressor_already_optimized);
            TextView textView6 = this.compressedSizeView;
            if (textView6 == null) {
                v.n("compressedSizeView" /* decoded XOR */);
                textView6 = null;
            }
            textView6.setText(R$string.ctools_neeeex_photo_compressor_not_available);
            Button button4 = this.saveButton;
            if (button4 == null) {
                v.n("saveButton" /* decoded XOR */);
            } else {
                button = button4;
            }
            button.setEnabled(false);
            return;
        }
        if (v.c(bVarA, b.g.f64671b)) {
            Button button5 = this.saveButton;
            if (button5 == null) {
                v.n("saveButton" /* decoded XOR */);
            } else {
                button = button5;
            }
            button.setEnabled(false);
            J0();
            return;
        }
        if (bVarA instanceof b.h) {
            E0(new Function0() { // from class: com.neeeex.ctools.features.photocompressor.detail.e
                @Override // p003kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return PhotoCompressionNEEEEXActivity.u0(this.f64697a, bVarA);
                }
            });
            return;
        }
        if (!(bVarA instanceof b.c)) {
            j.a();
        } else if (this.savingDialogStartedAtMillis > 0) {
            E0(new Function0() { // from class: com.neeeex.ctools.features.photocompressor.detail.f
                @Override // p003kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return PhotoCompressionNEEEEXActivity.t0(this.f64699a, bVarA);
                }
            });
        } else {
            H0(((b.c) bVarA).a());
        }
    }

    public final void H0(h.c state) {
        TextView textView = this.statusView;
        Button button = null;
        if (textView == null) {
            v.n("statusView" /* decoded XOR */);
            textView = null;
        }
        textView.setText(state.b());
        View view = this.bottomActionBar;
        if (view == null) {
            v.n("bottomActionBar" /* decoded XOR */);
            view = null;
        }
        view.setVisibility(0);
        Button button2 = this.saveButton;
        if (button2 == null) {
            v.n("saveButton" /* decoded XOR */);
        } else {
            button = button2;
        }
        button.setEnabled(state.a());
    }

    public final void I0() {
        if (this.hasRequestedCompressionCompleteInterstitial) {
            return;
        }
        this.hasRequestedCompressionCompleteInterstitial = true;
        if (com.neeeex.eraser.module.report.bytedance.a.k()) {
            BaseAdActivity.showInter$default(this, "CTOOLS_PHOTO_COMPRESSOR_COMPRESS_END_IN" /* decoded XOR */, null, 2, null);
        }
    }

    public final void J0() {
        Dialog dialog = this.savingDialog;
        if (dialog == null || !dialog.isShowing()) {
            if (this.savingDialogStartedAtMillis == 0) {
                this.savingDialogStartedAtMillis = SystemClock.elapsedRealtime();
            }
            Dialog dialog2 = new Dialog(this);
            dialog2.setContentView(R$layout.dialog_neeeex_photo_compressing);
            dialog2.setCancelable(false);
            dialog2.setCanceledOnTouchOutside(false);
            Window window = dialog2.getWindow();
            if (window != null) {
                window.setBackgroundDrawable(new ColorDrawable(0));
                window.addFlags(2);
                WindowManager.LayoutParams attributes = window.getAttributes();
                attributes.gravity = 17;
                attributes.dimAmount = 0.6f;
                window.setAttributes(attributes);
            }
            dialog2.show();
            Window window2 = dialog2.getWindow();
            if (window2 != null) {
                window2.setLayout(getResources().getDisplayMetrics().widthPixels - D0(40), -2);
            }
            ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat((ImageView) dialog2.findViewById(R$id.neeeex_photo_compressing_spinner), (Property<ImageView, Float>) View.ROTATION, 0.0f, 360.0f);
            objectAnimatorOfFloat.setDuration(800L);
            objectAnimatorOfFloat.setInterpolator(new LinearInterpolator());
            objectAnimatorOfFloat.setRepeatCount(-1);
            objectAnimatorOfFloat.start();
            this.spinnerAnimator = objectAnimatorOfFloat;
            this.savingDialog = dialog2;
        }
    }

    public final void K0() {
        TextView textView = this.compressedSizeView;
        Button button = null;
        if (textView == null) {
            v.n("compressedSizeView" /* decoded XOR */);
            textView = null;
        }
        textView.setText(R$string.ctools_neeeex_photo_compressor_not_available);
        TextView textView2 = this.statusView;
        if (textView2 == null) {
            v.n("statusView" /* decoded XOR */);
            textView2 = null;
        }
        textView2.setText(R$string.ctools_neeeex_photo_compressor_source_unavailable);
        Button button2 = this.saveButton;
        if (button2 == null) {
            v.n("saveButton" /* decoded XOR */);
        } else {
            button = button2;
        }
        button.setEnabled(false);
    }

    @Override // com.neeeex.eraser.base.RootActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        w.b(this, null, null, 3, null);
        setContentView(R$layout.activity_neeeex_photo_compression);
        this.model = (i) new ViewModelProvider(this).get(i.class);
        B0();
        findViewById(R$id.neeeex_photo_compression_back).setOnClickListener(new View.OnClickListener() { // from class: com.neeeex.ctools.features.photocompressor.detail.b
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                PhotoCompressionNEEEEXActivity.v0(this.f64691a, view);
            }
        });
        z0();
        Intent intent = getIntent();
        "getIntent(...)" /* decoded XOR */;
        intent.getClass();
        c cVarF0 = F0(intent);
        if (cVarF0 == null) {
            K0();
        } else {
            A0(cVarF0);
        }
    }

    @Override // com.neeeex.eraser.base.BaseAdActivity, com.neeeex.eraser.base.RootActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        Runnable runnable = this.pendingSavingCompletion;
        if (runnable != null) {
            View view = this.rootView;
            if (view == null) {
                v.n("rootView" /* decoded XOR */);
                view = null;
            }
            view.removeCallbacks(runnable);
        }
        this.pendingSavingCompletion = null;
        C0();
        super.onDestroy();
    }

    public static final /* synthetic */ class d extends s implements Function1 {
        public d(Object obj) {
            super(1, obj, PhotoCompressionNEEEEXActivity.class, "render" /* decoded XOR */, "render(Lcom/neeeex/ctools/features/photocompressor/detail/PhotoCompressionState;)V" /* decoded XOR */, 0);
        }

        public final void invoke(h hVar) {
            "p0" /* decoded XOR */;
            hVar.getClass();
            ((PhotoCompressionNEEEEXActivity) this.receiver).G0(hVar);
        }

        @Override // p003kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((h) obj);
            return fl.m0.f80959a;
        }
    }
}