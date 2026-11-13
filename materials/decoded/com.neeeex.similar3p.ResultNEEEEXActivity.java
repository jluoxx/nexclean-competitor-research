package com.neeeex.similar3p;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.fragment.app.l0;
import androidx.p002lifecycle.LifecycleOwnerKt;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import b.k0;
import b.o0;
import com.mbridge.msdk.foundation.download.core.DownloadCommon;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.neeeex.eraser.R$drawable;
import com.neeeex.eraser.R$id;
import com.neeeex.eraser.R$layout;
import com.neeeex.eraser.R$string;
import com.neeeex.eraser.base.BaseAdActivity;
import com.neeeex.eraser.m0;
import com.neeeex.eraser.module.dialog.DeleteTipDialog;
import com.neeeex.eraser.module.dialog.ReturnTipDialog;
import com.neeeex.eraser.utils.b0;
import gl.g0;
import gq.v0;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import kotlinx.coroutines.p0;
import p003kotlin.Metadata;
import p003kotlin.jvm.functions.Function0;
import p003kotlin.jvm.functions.Function1;
import p003kotlin.jvm.internal.b1;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0096\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\t\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u00002\u00020\u0001:\u0002cdB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0005\u0010\u0003J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\u000b\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u000b\u0010\u0003J\u000f\u0010\f\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\f\u0010\u0003JY\u0010\u0017\u001a\u00020\u00162\n\u0010\u000e\u001a\u0006\u0012\u0002\b\u00030\r2\u0012\u0010\u0012\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00110\u00100\u000f2\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00040\u000f2\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00040\u000f2\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00040\u000fH\u0002¢\u0006\u0004\b\u0017\u0010\u0018J\u000f\u0010\u0019\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0019\u0010\u0003J\u000f\u0010\u001a\u001a\u00020\bH\u0002¢\u0006\u0004\b\u001a\u0010\u001bJ\u001f\u0010\u001f\u001a\u00020\u00042\u0006\u0010\u001c\u001a\u00020\b2\u0006\u0010\u001e\u001a\u00020\u001dH\u0002¢\u0006\u0004\b\u001f\u0010 J\u000f\u0010!\u001a\u00020\u0004H\u0002¢\u0006\u0004\b!\u0010\u0003J\u0015\u0010\"\u001a\b\u0012\u0004\u0012\u00020\u00110\u0010H\u0002¢\u0006\u0004\b\"\u0010#J\u000f\u0010$\u001a\u00020\u0004H\u0002¢\u0006\u0004\b$\u0010\u0003J\u001f\u0010(\u001a\u00020\u00042\u0006\u0010&\u001a\u00020%2\u0006\u0010'\u001a\u00020\bH\u0002¢\u0006\u0004\b(\u0010)J\u0017\u0010*\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b*\u0010+J\u000f\u0010,\u001a\u00020\u0004H\u0002¢\u0006\u0004\b,\u0010\u0003J\u000f\u0010-\u001a\u00020\u0004H\u0002¢\u0006\u0004\b-\u0010\u0003J\u0017\u00100\u001a\u00020/2\u0006\u0010.\u001a\u00020\u001dH\u0002¢\u0006\u0004\b0\u00101J\u000f\u00102\u001a\u00020\u0004H\u0002¢\u0006\u0004\b2\u0010\u0003J\u000f\u00103\u001a\u00020\u0004H\u0002¢\u0006\u0004\b3\u0010\u0003J\u000f\u00104\u001a\u00020\u0004H\u0002¢\u0006\u0004\b4\u0010\u0003J\u000f\u00105\u001a\u00020\u0004H\u0002¢\u0006\u0004\b5\u0010\u0003J\u0019\u00108\u001a\u00020\u00042\b\u00107\u001a\u0004\u0018\u000106H\u0014¢\u0006\u0004\b8\u00109J\u000f\u0010:\u001a\u00020\u0004H\u0014¢\u0006\u0004\b:\u0010\u0003R\u0016\u0010>\u001a\u00020;8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b<\u0010=R\u0016\u0010B\u001a\u00020?8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b@\u0010AR\u0016\u0010F\u001a\u00020C8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\bD\u0010ER\u0016\u0010J\u001a\u00020G8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\bH\u0010IR\u0016\u0010L\u001a\u00020C8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\bK\u0010ER\u001b\u0010R\u001a\u00020M8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bN\u0010O\u001a\u0004\bP\u0010QR\u0016\u0010U\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bS\u0010TR\u0018\u0010X\u001a\u0004\u0018\u00010\u00168\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bV\u0010WR\u0016\u0010\\\u001a\u00020Y8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bZ\u0010[R\u0018\u0010`\u001a\u0004\u0018\u00010]8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b^\u0010_R\u0016\u0010b\u001a\u00020Y8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\ba\u0010[¨\u0006e"}, d2 = {"Lcom/neeeex/similar3p/ResultNEEEEXActivity;", "Lcom/neeeex/eraser/base/BaseAdActivity;", "<init>", "()V", "Lfl/m0;", "P0", "Lcom/neeeex/similar3p/y;", "kind", "", "R0", "(Lcom/neeeex/similar3p/y;)I", "S0", "V0", "Landroidx/recyclerview/widget/RecyclerView$h;", "adapter", "Lkotlin/Function0;", "", "Lyi/e;", "selected", "selectAll", "deselectAll", "remove", "Lcom/neeeex/similar3p/ResultNEEEEXActivity$b;", "Y0", "(Landroidx/recyclerview/widget/RecyclerView$h;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;)Lcom/neeeex/similar3p/ResultNEEEEXActivity$b;", "b1", "X0", "()I", "cnt", "", "totalBytes", "O0", "(IJ)V", "I0", "H0", "()Ljava/util/List;", "U0", "Lcom/neeeex/similar3p/ResultNEEEEXActivity$a;", "batch", "removedCount", "G0", "(Lcom/neeeex/similar3p/ResultNEEEEXActivity$a;I)V", "L0", "(Lcom/neeeex/similar3p/y;)V", "c1", "Z0", "raw", "", "W0", "(J)Ljava/lang/String;", "M0", "Q0", "a1", "K0", "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "(Landroid/os/Bundle;)V", "onDestroy", "Landroidx/recyclerview/widget/RecyclerView;", "c", "Landroidx/recyclerview/widget/RecyclerView;", "rvFiles", "Landroid/widget/Button;", "d", "Landroid/widget/Button;", "btnCleanAction", "Landroid/widget/TextView;", "e", "Landroid/widget/TextView;", "btnSelectAll", "Landroid/view/View;", "f", "Landroid/view/View;", "layoutEmpty", "g", "tvPageTitle", "Lcom/neeeex/similar3p/utils/f;", "h", "Lfl/n;", "N0", "()Lcom/neeeex/similar3p/utils/f;", "scanner", "i", "Lcom/neeeex/similar3p/y;", "currentScanType", "j", "Lcom/neeeex/similar3p/ResultNEEEEXActivity$b;", "content", "", CampaignEx.JSON_KEY_AD_K, "Z", "_allChecked", "Landroidx/appcompat/app/a;", "l", "Landroidx/appcompat/app/a;", "_deletingPopup", "m", "exitInProgress", DownloadCommon.DOWNLOAD_REPORT_FIND_FILE_RESULT_VALUE_B, "a", "tool-feature_productionRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class ResultNEEEEXActivity extends BaseAdActivity {

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    public RecyclerView rvFiles;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    public Button btnCleanAction;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    public TextView btnSelectAll;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    public View layoutEmpty;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    public TextView tvPageTitle;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    public final fl.n scanner = fl.o.b(new Function0() { // from class: com.neeeex.similar3p.h
        @Override // p003kotlin.jvm.functions.Function0
        public final Object invoke() {
            return ResultNEEEEXActivity.v0(this.f66285a);
        }
    });

    /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata */
    public com.neeeex.similar3p.y currentScanType = com.neeeex.similar3p.y.LARGE_DOCS;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    public b content;

    /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata */
    public boolean _allChecked;

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
    public androidx.appcompat.app.a _deletingPopup;

    /* JADX INFO: renamed from: m, reason: collision with root package name and from kotlin metadata */
    public boolean exitInProgress;

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final List f66232a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final long f66233b;

        public a(List list) {
            "files" /* decoded XOR */;
            list.getClass();
            this.f66232a = list;
            Iterator it = list.iterator();
            long jH = 0;
            while (it.hasNext()) {
                jH += ((yi.e) it.next()).h();
            }
            this.f66233b = jH;
        }

        public final boolean a() {
            return this.f66232a.isEmpty();
        }

        public final List b() {
            return this.f66232a;
        }

        public final long c() {
            return this.f66233b;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && p003kotlin.jvm.internal.v.c(this.f66232a, ((a) obj).f66232a);
        }

        public int hashCode() {
            return this.f66232a.hashCode();
        }

        public String toString() {
            return "DeletionBatch(files=" + this.f66232a + ")";
        }
    }

    public interface b {
        void a();

        RecyclerView.h b();

        void c(boolean z10);

        List d();

        default int getItemCount() {
            return b().getItemCount();
        }
    }

    public static final /* synthetic */ class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f66234a;

        static {
            int[] iArr = new int[com.neeeex.similar3p.y.values().length];
            try {
                iArr[com.neeeex.similar3p.y.LARGE_DOCS.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[com.neeeex.similar3p.y.DUPLICATE_DOCS.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[com.neeeex.similar3p.y.LARGE_MEDIA.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[com.neeeex.similar3p.y.DUPLICATE_MEDIA.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[com.neeeex.similar3p.y.SIMILAR_IMAGES.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[com.neeeex.similar3p.y.JUNK_FILES.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[com.neeeex.similar3p.y.SCREEN_CAPTURE_FILES.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            f66234a = iArr;
        }
    }

    public static final class d extends ll.m implements tl.n {
        final /* synthetic */ a $batch;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(a aVar, kl.f<? super d> fVar) {
            super(2, fVar);
            this.$batch = aVar;
        }

        @Override // ll.a
        public final kl.f<fl.m0> create(Object obj, kl.f<?> fVar) {
            return ResultNEEEEXActivity.this.new d(this.$batch, fVar);
        }

        @Override // tl.n
        public final Object invoke(p0 p0Var, kl.f<? super fl.m0> fVar) {
            return ((d) create(p0Var, fVar)).invokeSuspend(fl.m0.f80959a);
        }

        @Override // ll.a
        public final Object invokeSuspend(Object obj) {
            Object objF = p003kotlin.coroutines.intrinsics.c.f();
            int i10 = this.label;
            try {
                if (i10 == 0) {
                    fl.v.b(obj);
                    ResultNEEEEXActivity.this.a1();
                    com.neeeex.similar3p.utils.f fVarN0 = ResultNEEEEXActivity.this.N0();
                    List listB = this.$batch.b();
                    this.label = 1;
                    obj = fVarN0.A(listB, this);
                    if (obj == objF) {
                        return objF;
                    }
                } else {
                    if (i10 != 1) {
                        v0.a("call to 'resume' before 'invoke' with coroutine" /* decoded XOR */);
                        return null;
                    }
                    fl.v.b(obj);
                }
                ResultNEEEEXActivity.this.G0(this.$batch, ((Number) obj).intValue());
                ResultNEEEEXActivity.this.K0();
                return fl.m0.f80959a;
            } catch (Throwable th2) {
                ResultNEEEEXActivity.this.K0();
                throw th2;
            }
        }
    }

    public static final /* synthetic */ class h extends p003kotlin.jvm.internal.s implements Function0 {
        public h(Object obj) {
            super(0, obj, wi.s.class, "getSelectedFiles" /* decoded XOR */, "getSelectedFiles()Ljava/util/List;" /* decoded XOR */, 0);
        }

        @Override // p003kotlin.jvm.functions.Function0
        public final List<yi.e> invoke() {
            return ((wi.s) this.receiver).q();
        }
    }

    public static final /* synthetic */ class l extends p003kotlin.jvm.internal.s implements Function0 {
        public l(Object obj) {
            super(0, obj, wi.l.class, "getSelectedFiles" /* decoded XOR */, "getSelectedFiles()Ljava/util/List;" /* decoded XOR */, 0);
        }

        @Override // p003kotlin.jvm.functions.Function0
        public final List<yi.e> invoke() {
            return ((wi.l) this.receiver).q();
        }
    }

    public static final /* synthetic */ class p extends p003kotlin.jvm.internal.s implements Function0 {
        public p(Object obj) {
            super(0, obj, wi.f.class, "getSelectedFiles" /* decoded XOR */, "getSelectedFiles()Ljava/util/List;" /* decoded XOR */, 0);
        }

        @Override // p003kotlin.jvm.functions.Function0
        public final List<yi.e> invoke() {
            return ((wi.f) this.receiver).o();
        }
    }

    public static final /* synthetic */ class t extends p003kotlin.jvm.internal.s implements Function0 {
        public t(Object obj) {
            super(0, obj, wi.z.class, "getSelectedFiles" /* decoded XOR */, "getSelectedFiles()Ljava/util/List;" /* decoded XOR */, 0);
        }

        @Override // p003kotlin.jvm.functions.Function0
        public final List<yi.e> invoke() {
            return ((wi.z) this.receiver).o();
        }
    }

    public static final class y implements b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final RecyclerView.h f66235a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Function0 f66236b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ Function0 f66237c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ Function0 f66238d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final /* synthetic */ Function0 f66239e;

        public y(RecyclerView.h hVar, Function0 function0, Function0 function1, Function0 function2, Function0 function3) {
            this.f66236b = function0;
            this.f66237c = function1;
            this.f66238d = function2;
            this.f66239e = function3;
            this.f66235a = hVar;
        }

        @Override // com.neeeex.similar3p.ResultNEEEEXActivity.b
        public void a() {
            this.f66239e.invoke();
        }

        @Override // com.neeeex.similar3p.ResultNEEEEXActivity.b
        public RecyclerView.h b() {
            return this.f66235a;
        }

        @Override // com.neeeex.similar3p.ResultNEEEEXActivity.b
        public void c(boolean z10) {
            (z10 ? this.f66237c : this.f66238d).invoke();
        }

        @Override // com.neeeex.similar3p.ResultNEEEEXActivity.b
        public List d() {
            return (List) this.f66236b.invoke();
        }

        @Override // com.neeeex.similar3p.ResultNEEEEXActivity.b
        public /* bridge */ int getItemCount() {
            return super.getItemCount();
        }
    }

    public static final class z implements com.neeeex.eraser.ads.o {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Function0 f66240a;

        public z(Function0 function0) {
            this.f66240a = function0;
        }

        @Override // com.neeeex.eraser.ads.o
        public void onAdClick() {
        }

        @Override // com.neeeex.eraser.ads.o
        public void onAdClose() {
            this.f66240a.invoke();
        }

        @Override // com.neeeex.eraser.ads.o
        public void onAdShowFailed(oj.a aVar) {
        }

        @Override // com.neeeex.eraser.ads.o
        public void onAdShowSuccess(oj.a aVar) {
            this.f66240a.invoke();
        }
    }

    public static void A0(ResultNEEEEXActivity resultNEEEEXActivity, View view) {
        resultNEEEEXActivity.S0();
    }

    public static final void J0(ResultNEEEEXActivity resultNEEEEXActivity) {
        resultNEEEEXActivity.U0();
    }

    private final void S0() {
        if (this.exitInProgress) {
            return;
        }
        ReturnTipDialog returnTipDialogA = ReturnTipDialog.INSTANCE.a();
        returnTipDialogA.p(new ki.a() { // from class: com.neeeex.similar3p.i
            @Override // ki.a
            public final void a() {
                ResultNEEEEXActivity.T0(this.f66286a);
            }
        });
        l0 supportFragmentManager = getSupportFragmentManager();
        "getSupportFragmentManager(...)" /* decoded XOR */;
        supportFragmentManager.getClass();
        returnTipDialogA.i(supportFragmentManager);
    }

    public static final void T0(ResultNEEEEXActivity resultNEEEEXActivity) {
        resultNEEEEXActivity.exitInProgress = true;
        zi.l.f104405a.b(resultNEEEEXActivity, "neeeex_pdf_clean_scan_exit_fs" /* decoded XOR */, zi.n.Companion.a(resultNEEEEXActivity.currentScanType));
    }

    public static String t0(ResultNEEEEXActivity resultNEEEEXActivity, yi.b bVar, int i10, int i11) {
        "grp" /* decoded XOR */;
        bVar.getClass();
        if (bVar.c() == 1) {
            String string = resultNEEEEXActivity.getString(R$string.neeeex_similar_group_title_apk_files, new Object[]{Integer.valueOf(i11)});
            "getString(...)" /* decoded XOR */;
            string.getClass();
            return string;
        }
        String string2 = resultNEEEEXActivity.getString(R$string.neeeex_similar_group_title_junk_files, new Object[]{Integer.valueOf(i11)});
        "getString(...)" /* decoded XOR */;
        string2.getClass();
        return string2;
    }

    public static boolean u0() {
        return b0.f66131a.C(com.neeeex.similar3p.a.f66261a.c(), System.currentTimeMillis());
    }

    public static com.neeeex.similar3p.utils.f v0(ResultNEEEEXActivity resultNEEEEXActivity) {
        return new com.neeeex.similar3p.utils.f(resultNEEEEXActivity);
    }

    public static fl.m0 w0(ResultNEEEEXActivity resultNEEEEXActivity, k0 k0Var) {
        "$this$addCallback" /* decoded XOR */;
        k0Var.getClass();
        resultNEEEEXActivity.S0();
        return fl.m0.f80959a;
    }

    public static void x0(ResultNEEEEXActivity resultNEEEEXActivity, View view) {
        resultNEEEEXActivity.I0();
    }

    public static void y0(ResultNEEEEXActivity resultNEEEEXActivity, View view) {
        resultNEEEEXActivity.M0();
    }

    public final void G0(a batch, int removedCount) {
        b bVar = this.content;
        if (bVar != null) {
            bVar.a();
        }
        this._allChecked = false;
        TextView textView = this.btnSelectAll;
        if (textView == null) {
            p003kotlin.jvm.internal.v.n("btnSelectAll" /* decoded XOR */);
            textView = null;
        }
        textView.setText(R$string.neeeex_select_all);
        O0(0, 0L);
        b1();
        startActivity(new Intent(this, (Class<?>) CleanCompleteNEEEEXActivity.class).putExtra("CLEAN_SIZE" /* decoded XOR */, W0(batch.c())).putExtra("CLEAN_COUNT" /* decoded XOR */, removedCount));
        c1();
    }

    public final List H0() {
        b bVar = this.content;
        List listD = bVar != null ? bVar.d() : null;
        return listD == null ? gl.w.m() : listD;
    }

    public final void I0() {
        if (H0().isEmpty()) {
            return;
        }
        DeleteTipDialog deleteTipDialogA = DeleteTipDialog.INSTANCE.a();
        deleteTipDialogA.m(new ki.a() { // from class: com.neeeex.similar3p.n
            @Override // ki.a
            public final void a() {
                ResultNEEEEXActivity.J0(this.f66533a);
            }
        });
        l0 supportFragmentManager = getSupportFragmentManager();
        "getSupportFragmentManager(...)" /* decoded XOR */;
        supportFragmentManager.getClass();
        deleteTipDialogA.i(supportFragmentManager);
    }

    public final void K0() {
        androidx.appcompat.app.a aVar = this._deletingPopup;
        if (aVar != null) {
            aVar.dismiss();
        }
        this._deletingPopup = null;
    }

    public final void L0(com.neeeex.similar3p.y kind) {
        switch (c.f66234a[kind.ordinal()]) {
            case 1:
                mi.a.f88870a.p();
                break;
            case 2:
                mi.a.f88870a.m();
                break;
            case 3:
                mi.a.f88870a.q();
                break;
            case 4:
                mi.a.f88870a.n();
                break;
            case 5:
                mi.a.f88870a.s();
                break;
            case 6:
                mi.a.f88870a.o();
                break;
            case 7:
                mi.a.f88870a.r();
                break;
            default:
                coil.util.j.a();
                break;
        }
    }

    public final void M0() {
        boolean z10 = this._allChecked;
        boolean z11 = !z10;
        b bVar = this.content;
        if (bVar != null) {
            bVar.c(z11);
        }
        this._allChecked = z11;
        TextView textView = this.btnSelectAll;
        if (textView == null) {
            p003kotlin.jvm.internal.v.n("btnSelectAll" /* decoded XOR */);
            textView = null;
        }
        textView.setText(!z10 ? R$string.neeeex_unselect_all : R$string.neeeex_select_all);
    }

    public final com.neeeex.similar3p.utils.f N0() {
        return (com.neeeex.similar3p.utils.f) this.scanner.getValue();
    }

    public final void O0(int cnt, long totalBytes) {
        Object pVar = cnt > 0 ? new com.neeeex.similar3p.p(cnt, totalBytes) : com.neeeex.similar3p.q.f66536a;
        Button button = null;
        if (pVar instanceof com.neeeex.similar3p.p) {
            Button button2 = this.btnCleanAction;
            if (button2 == null) {
                p003kotlin.jvm.internal.v.n("btnCleanAction" /* decoded XOR */);
                button2 = null;
            }
            button2.setEnabled(true);
            Button button3 = this.btnCleanAction;
            if (button3 == null) {
                p003kotlin.jvm.internal.v.n("btnCleanAction" /* decoded XOR */);
                button3 = null;
            }
            button3.setBackgroundResource(R$drawable.neeeex_similar_button_red);
            Button button4 = this.btnCleanAction;
            if (button4 == null) {
                p003kotlin.jvm.internal.v.n("btnCleanAction" /* decoded XOR */);
            } else {
                button = button4;
            }
            button.setText(getString(R$string.neeeex_delete_selected_size, new Object[]{W0(((com.neeeex.similar3p.p) pVar).a())}));
            return;
        }
        if (!p003kotlin.jvm.internal.v.c(pVar, com.neeeex.similar3p.q.f66536a)) {
            coil.util.j.a();
            return;
        }
        Button button5 = this.btnCleanAction;
        if (button5 == null) {
            p003kotlin.jvm.internal.v.n("btnCleanAction" /* decoded XOR */);
            button5 = null;
        }
        button5.setEnabled(false);
        Button button6 = this.btnCleanAction;
        if (button6 == null) {
            p003kotlin.jvm.internal.v.n("btnCleanAction" /* decoded XOR */);
            button6 = null;
        }
        button6.setBackgroundResource(R$drawable.neeeex_similar_button_gray_disabled);
        Button button7 = this.btnCleanAction;
        if (button7 == null) {
            p003kotlin.jvm.internal.v.n("btnCleanAction" /* decoded XOR */);
        } else {
            button = button7;
        }
        button.setText(getString(R$string.neeeex_delete_selected));
    }

    public final void P0() {
        View viewFindViewById = findViewById(R$id.neeeex_recyclerView);
        "findViewById(...)" /* decoded XOR */;
        viewFindViewById.getClass();
        this.rvFiles = (RecyclerView) viewFindViewById;
        View viewFindViewById2 = findViewById(R$id.neeeex_btnClean);
        "findViewById(...)" /* decoded XOR */;
        viewFindViewById2.getClass();
        this.btnCleanAction = (Button) viewFindViewById2;
        View viewFindViewById3 = findViewById(R$id.neeeex_btnSelectAll);
        "findViewById(...)" /* decoded XOR */;
        viewFindViewById3.getClass();
        this.btnSelectAll = (TextView) viewFindViewById3;
        View viewFindViewById4 = findViewById(R$id.neeeex_emptyState);
        "findViewById(...)" /* decoded XOR */;
        viewFindViewById4.getClass();
        this.layoutEmpty = viewFindViewById4;
        View viewFindViewById5 = findViewById(R$id.neeeex_tvTitle);
        "findViewById(...)" /* decoded XOR */;
        viewFindViewById5.getClass();
        TextView textView = (TextView) viewFindViewById5;
        this.tvPageTitle = textView;
        TextView textView2 = null;
        if (textView == null) {
            p003kotlin.jvm.internal.v.n("tvPageTitle" /* decoded XOR */);
            textView = null;
        }
        textView.setText(R0(this.currentScanType));
        findViewById(R$id.neeeex_btnBack).setOnClickListener(new View.OnClickListener() { // from class: com.neeeex.similar3p.k
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ResultNEEEEXActivity.A0(this.f66530a, view);
            }
        });
        Button button = this.btnCleanAction;
        if (button == null) {
            p003kotlin.jvm.internal.v.n("btnCleanAction" /* decoded XOR */);
            button = null;
        }
        button.setOnClickListener(new View.OnClickListener() { // from class: com.neeeex.similar3p.l
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ResultNEEEEXActivity.x0(this.f66531a, view);
            }
        });
        TextView textView3 = this.btnSelectAll;
        if (textView3 == null) {
            p003kotlin.jvm.internal.v.n("btnSelectAll" /* decoded XOR */);
        } else {
            textView2 = textView3;
        }
        textView2.setOnClickListener(new View.OnClickListener() { // from class: com.neeeex.similar3p.m
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ResultNEEEEXActivity.y0(this.f66532a, view);
            }
        });
    }

    public final void Q0() {
        b bVar = this.content;
        if (bVar != null) {
            bVar.c(true);
        }
        this._allChecked = true;
        TextView textView = this.btnSelectAll;
        if (textView == null) {
            p003kotlin.jvm.internal.v.n("btnSelectAll" /* decoded XOR */);
            textView = null;
        }
        textView.setText(getString(R$string.neeeex_unselect_all));
    }

    public final int R0(com.neeeex.similar3p.y kind) {
        switch (c.f66234a[kind.ordinal()]) {
            case 1:
                return R$string.neeeex_large_docs;
            case 2:
                return R$string.neeeex_duplicate_docs;
            case 3:
                return R$string.neeeex_large_media;
            case 4:
                return R$string.neeeex_duplicate_media;
            case 5:
                return R$string.neeeex_similar_images;
            case 6:
                return R$string.neeeex_similar_junk_files;
            case 7:
                return R$string.neeeex_similar_screenshots;
            default:
                coil.util.j.a();
                return 0;
        }
    }

    public final void U0() {
        a aVar = new a(H0());
        if (aVar.a()) {
            return;
        }
        L0(this.currentScanType);
        kotlinx.coroutines.k.d(LifecycleOwnerKt.getLifecycleScope(this), null, null, new d(aVar, null), 3, null);
    }

    public final void V0() {
        ResultNEEEEXActivity resultNEEEEXActivity;
        b bVarY0;
        RecyclerView recyclerView = this.rvFiles;
        if (recyclerView == null) {
            p003kotlin.jvm.internal.v.n("rvFiles" /* decoded XOR */);
            recyclerView = null;
        }
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        switch (c.f66234a[this.currentScanType.ordinal()]) {
            case 1:
            case 3:
            case 7:
                resultNEEEEXActivity = this;
                wi.l lVar = new wi.l(g0.i1(com.neeeex.similar3p.x.f66611a.c()), new u(this));
                bVarY0 = resultNEEEEXActivity.Y0(lVar, new l(lVar), new m(lVar), new n(lVar), new o(lVar));
                break;
            case 2:
            case 4:
                resultNEEEEXActivity = this;
                wi.f fVar = new wi.f(g0.i1(com.neeeex.similar3p.x.f66611a.b()), new v(this));
                bVarY0 = resultNEEEEXActivity.Y0(fVar, new p(fVar), new q(fVar), new r(fVar), new s(fVar));
                break;
            case 5:
                resultNEEEEXActivity = this;
                wi.z zVar = new wi.z(g0.i1(com.neeeex.similar3p.x.f66611a.d()), new w(this));
                bVarY0 = resultNEEEEXActivity.Y0(zVar, new t(zVar), new e(zVar), new f(zVar), new g(zVar));
                break;
            case 6:
                wi.s sVar = new wi.s(g0.i1(com.neeeex.similar3p.x.f66611a.b()), new x(this), new tl.o() { // from class: com.neeeex.similar3p.j
                    @Override // tl.o
                    public final Object invoke(Object obj, Object obj2, Object obj3) {
                        return ResultNEEEEXActivity.t0(this.f66287a, (yi.b) obj, ((Integer) obj2).intValue(), ((Integer) obj3).intValue());
                    }
                });
                resultNEEEEXActivity = this;
                bVarY0 = resultNEEEEXActivity.Y0(sVar, new h(sVar), new i(sVar), new j(sVar), new k(sVar));
                break;
            default:
                coil.util.j.a();
                return;
        }
        resultNEEEEXActivity.content = bVarY0;
        RecyclerView recyclerView2 = resultNEEEEXActivity.rvFiles;
        if (recyclerView2 == null) {
            p003kotlin.jvm.internal.v.n("rvFiles" /* decoded XOR */);
            recyclerView2 = null;
        }
        b bVar = resultNEEEEXActivity.content;
        recyclerView2.setAdapter(bVar != null ? bVar.b() : null);
    }

    public final String W0(long raw) {
        double d10 = 1024;
        double d11 = d10 * 1024.0d;
        double d12 = d10 * d11;
        double d13 = raw;
        if (d13 < d11) {
            b1 b1Var = b1.f86707a;
            String str = String.format(Locale.US, "%.2f KB" /* decoded XOR */, Arrays.copyOf(new Object[]{Double.valueOf(d13 / 1024.0d)}, 1));
            "format(...)" /* decoded XOR */;
            return str;
        }
        if (d13 < d12) {
            b1 b1Var2 = b1.f86707a;
            String str2 = String.format(Locale.US, "%.2f MB" /* decoded XOR */, Arrays.copyOf(new Object[]{Double.valueOf(d13 / d11)}, 1));
            "format(...)" /* decoded XOR */;
            return str2;
        }
        b1 b1Var3 = b1.f86707a;
        String str3 = String.format(Locale.US, "%.2f GB" /* decoded XOR */, Arrays.copyOf(new Object[]{Double.valueOf(d13 / d12)}, 1));
        "format(...)" /* decoded XOR */;
        return str3;
    }

    public final int X0() {
        b bVar = this.content;
        if (bVar != null) {
            return bVar.getItemCount();
        }
        return 0;
    }

    public final b Y0(RecyclerView.h adapter, Function0 selected, Function0 selectAll, Function0 deselectAll, Function0 remove) {
        return new y(adapter, selected, selectAll, deselectAll, remove);
    }

    public final void Z0() {
        showInter("neeeex_pdf_clean_delete_complete_fs" /* decoded XOR */, new z(new Function0() { // from class: com.neeeex.similar3p.o
            @Override // p003kotlin.jvm.functions.Function0
            public final Object invoke() {
                return Boolean.valueOf(ResultNEEEEXActivity.u0());
            }
        }));
    }

    public final void a1() {
        androidx.appcompat.app.a aVar = this._deletingPopup;
        if (aVar == null || !aVar.isShowing()) {
            ProgressBar progressBar = new ProgressBar(this);
            progressBar.setIndeterminate(true);
            FrameLayout frameLayout = new FrameLayout(this);
            frameLayout.addView(progressBar, new FrameLayout.LayoutParams(-2, -2, 17));
            frameLayout.setPadding(0, 0, 0, (int) (frameLayout.getResources().getDisplayMetrics().density * 24));
            androidx.appcompat.app.a aVarA = new xc.b(this).Q(R$string.neeeex_similar_deleting).v(frameLayout).B(false).a();
            this._deletingPopup = aVarA;
            if (aVarA != null) {
                aVarA.show();
            }
        }
    }

    public final void b1() {
        boolean z10 = X0() > 0;
        RecyclerView recyclerView = this.rvFiles;
        TextView textView = null;
        if (recyclerView == null) {
            p003kotlin.jvm.internal.v.n("rvFiles" /* decoded XOR */);
            recyclerView = null;
        }
        recyclerView.setVisibility(z10 ? 0 : 8);
        View view = this.layoutEmpty;
        if (view == null) {
            p003kotlin.jvm.internal.v.n("layoutEmpty" /* decoded XOR */);
            view = null;
        }
        view.setVisibility(z10 ? 8 : 0);
        TextView textView2 = this.btnSelectAll;
        if (textView2 == null) {
            p003kotlin.jvm.internal.v.n("btnSelectAll" /* decoded XOR */);
        } else {
            textView = textView2;
        }
        textView.setVisibility((z10 && this.currentScanType == com.neeeex.similar3p.y.JUNK_FILES) ? 0 : 8);
    }

    public final void c1() {
        b0 b0Var = b0.f66131a;
        com.neeeex.similar3p.a aVar = com.neeeex.similar3p.a.f66261a;
        long jCurrentTimeMillis = System.currentTimeMillis() - b0Var.v(aVar.c(), 0L);
        if (!com.neeeex.eraser.module.report.bytedance.a.k() || jCurrentTimeMillis <= aVar.b()) {
            return;
        }
        Z0();
    }

    @Override // com.neeeex.eraser.base.RootActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        b.w.b(this, null, null, 3, null);
        setContentView(R$layout.neeeex_similar_activity_result);
        this.currentScanType = com.neeeex.similar3p.x.f66611a.a();
        P0();
        V0();
        b1();
        if (this.currentScanType == com.neeeex.similar3p.y.JUNK_FILES) {
            b bVar = this.content;
            if ((bVar != null ? bVar.getItemCount() : 0) > 0) {
                Q0();
            }
        }
        o0.b(getOnBackPressedDispatcher(), this, false, new Function1() { // from class: com.neeeex.similar3p.g
            @Override // p003kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return ResultNEEEEXActivity.w0(this.f66284a, (k0) obj);
            }
        }, 2, null);
        View viewFindViewById = findViewById(R$id.neeeex_ad_container_banner);
        "findViewById(...)" /* decoded XOR */;
        viewFindViewById.getClass();
        BaseAdActivity.showRenderAdAndRefresh$default(this, (ViewGroup) viewFindViewById, R$layout.ad_neeeex_native, "neeeex_pdf_clean_result" /* decoded XOR */, null, 8, null);
    }

    @Override // com.neeeex.eraser.base.BaseAdActivity, com.neeeex.eraser.base.RootActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        K0();
        super.onDestroy();
    }

    public static final /* synthetic */ class e extends p003kotlin.jvm.internal.s implements Function0 {
        public e(Object obj) {
            super(0, obj, wi.z.class, "selectAll" /* decoded XOR */, "selectAll()V" /* decoded XOR */, 0);
        }

        /* JADX INFO: renamed from: invoke, reason: collision with other method in class */
        public final void m176invoke() {
            ((wi.z) this.receiver).t();
        }

        @Override // p003kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Object invoke() {
            m176invoke();
            return fl.m0.f80959a;
        }
    }

    public static final /* synthetic */ class f extends p003kotlin.jvm.internal.s implements Function0 {
        public f(Object obj) {
            super(0, obj, wi.z.class, "deselectAll" /* decoded XOR */, "deselectAll()V" /* decoded XOR */, 0);
        }

        /* JADX INFO: renamed from: invoke, reason: collision with other method in class */
        public final void m177invoke() {
            ((wi.z) this.receiver).n();
        }

        @Override // p003kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Object invoke() {
            m177invoke();
            return fl.m0.f80959a;
        }
    }

    public static final /* synthetic */ class g extends p003kotlin.jvm.internal.s implements Function0 {
        public g(Object obj) {
            super(0, obj, wi.z.class, "removeSelected" /* decoded XOR */, "removeSelected()V" /* decoded XOR */, 0);
        }

        /* JADX INFO: renamed from: invoke, reason: collision with other method in class */
        public final void m178invoke() {
            ((wi.z) this.receiver).s();
        }

        @Override // p003kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Object invoke() {
            m178invoke();
            return fl.m0.f80959a;
        }
    }

    public static final /* synthetic */ class i extends p003kotlin.jvm.internal.s implements Function0 {
        public i(Object obj) {
            super(0, obj, wi.s.class, "selectAll" /* decoded XOR */, "selectAll()V" /* decoded XOR */, 0);
        }

        /* JADX INFO: renamed from: invoke, reason: collision with other method in class */
        public final void m179invoke() {
            ((wi.s) this.receiver).x();
        }

        @Override // p003kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Object invoke() {
            m179invoke();
            return fl.m0.f80959a;
        }
    }

    public static final /* synthetic */ class j extends p003kotlin.jvm.internal.s implements Function0 {
        public j(Object obj) {
            super(0, obj, wi.s.class, "deselectAll" /* decoded XOR */, "deselectAll()V" /* decoded XOR */, 0);
        }

        /* JADX INFO: renamed from: invoke, reason: collision with other method in class */
        public final void m180invoke() {
            ((wi.s) this.receiver).p();
        }

        @Override // p003kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Object invoke() {
            m180invoke();
            return fl.m0.f80959a;
        }
    }

    public static final /* synthetic */ class k extends p003kotlin.jvm.internal.s implements Function0 {
        public k(Object obj) {
            super(0, obj, wi.s.class, "removeSelected" /* decoded XOR */, "removeSelected()V" /* decoded XOR */, 0);
        }

        /* JADX INFO: renamed from: invoke, reason: collision with other method in class */
        public final void m181invoke() {
            ((wi.s) this.receiver).w();
        }

        @Override // p003kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Object invoke() {
            m181invoke();
            return fl.m0.f80959a;
        }
    }

    public static final /* synthetic */ class m extends p003kotlin.jvm.internal.s implements Function0 {
        public m(Object obj) {
            super(0, obj, wi.l.class, "selectAll" /* decoded XOR */, "selectAll()V" /* decoded XOR */, 0);
        }

        /* JADX INFO: renamed from: invoke, reason: collision with other method in class */
        public final void m182invoke() {
            ((wi.l) this.receiver).w();
        }

        @Override // p003kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Object invoke() {
            m182invoke();
            return fl.m0.f80959a;
        }
    }

    public static final /* synthetic */ class n extends p003kotlin.jvm.internal.s implements Function0 {
        public n(Object obj) {
            super(0, obj, wi.l.class, "deselectAll" /* decoded XOR */, "deselectAll()V" /* decoded XOR */, 0);
        }

        /* JADX INFO: renamed from: invoke, reason: collision with other method in class */
        public final void m183invoke() {
            ((wi.l) this.receiver).o();
        }

        @Override // p003kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Object invoke() {
            m183invoke();
            return fl.m0.f80959a;
        }
    }

    public static final /* synthetic */ class o extends p003kotlin.jvm.internal.s implements Function0 {
        public o(Object obj) {
            super(0, obj, wi.l.class, "removeSelected" /* decoded XOR */, "removeSelected()V" /* decoded XOR */, 0);
        }

        /* JADX INFO: renamed from: invoke, reason: collision with other method in class */
        public final void m184invoke() {
            ((wi.l) this.receiver).u();
        }

        @Override // p003kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Object invoke() {
            m184invoke();
            return fl.m0.f80959a;
        }
    }

    public static final /* synthetic */ class q extends p003kotlin.jvm.internal.s implements Function0 {
        public q(Object obj) {
            super(0, obj, wi.f.class, "selectAll" /* decoded XOR */, "selectAll()V" /* decoded XOR */, 0);
        }

        /* JADX INFO: renamed from: invoke, reason: collision with other method in class */
        public final void m185invoke() {
            ((wi.f) this.receiver).v();
        }

        @Override // p003kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Object invoke() {
            m185invoke();
            return fl.m0.f80959a;
        }
    }

    public static final /* synthetic */ class r extends p003kotlin.jvm.internal.s implements Function0 {
        public r(Object obj) {
            super(0, obj, wi.f.class, "deselectAll" /* decoded XOR */, "deselectAll()V" /* decoded XOR */, 0);
        }

        /* JADX INFO: renamed from: invoke, reason: collision with other method in class */
        public final void m186invoke() {
            ((wi.f) this.receiver).m();
        }

        @Override // p003kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Object invoke() {
            m186invoke();
            return fl.m0.f80959a;
        }
    }

    public static final /* synthetic */ class s extends p003kotlin.jvm.internal.s implements Function0 {
        public s(Object obj) {
            super(0, obj, wi.f.class, "removeSelected" /* decoded XOR */, "removeSelected()V" /* decoded XOR */, 0);
        }

        /* JADX INFO: renamed from: invoke, reason: collision with other method in class */
        public final void m187invoke() {
            ((wi.f) this.receiver).u();
        }

        @Override // p003kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Object invoke() {
            m187invoke();
            return fl.m0.f80959a;
        }
    }

    public static final /* synthetic */ class u extends p003kotlin.jvm.internal.s implements tl.n {
        public u(Object obj) {
            super(2, obj, ResultNEEEEXActivity.class, "handleSelectionUpdate" /* decoded XOR */, "handleSelectionUpdate(IJ)V" /* decoded XOR */, 0);
        }

        @Override // tl.n
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            invoke(((Number) obj).intValue(), ((Number) obj2).longValue());
            return fl.m0.f80959a;
        }

        public final void invoke(int i10, long j10) {
            ((ResultNEEEEXActivity) this.receiver).O0(i10, j10);
        }
    }

    public static final /* synthetic */ class v extends p003kotlin.jvm.internal.s implements tl.n {
        public v(Object obj) {
            super(2, obj, ResultNEEEEXActivity.class, "handleSelectionUpdate" /* decoded XOR */, "handleSelectionUpdate(IJ)V" /* decoded XOR */, 0);
        }

        @Override // tl.n
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            invoke(((Number) obj).intValue(), ((Number) obj2).longValue());
            return fl.m0.f80959a;
        }

        public final void invoke(int i10, long j10) {
            ((ResultNEEEEXActivity) this.receiver).O0(i10, j10);
        }
    }

    public static final /* synthetic */ class w extends p003kotlin.jvm.internal.s implements tl.n {
        public w(Object obj) {
            super(2, obj, ResultNEEEEXActivity.class, "handleSelectionUpdate" /* decoded XOR */, "handleSelectionUpdate(IJ)V" /* decoded XOR */, 0);
        }

        @Override // tl.n
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            invoke(((Number) obj).intValue(), ((Number) obj2).longValue());
            return fl.m0.f80959a;
        }

        public final void invoke(int i10, long j10) {
            ((ResultNEEEEXActivity) this.receiver).O0(i10, j10);
        }
    }

    public static final /* synthetic */ class x extends p003kotlin.jvm.internal.s implements tl.n {
        public x(Object obj) {
            super(2, obj, ResultNEEEEXActivity.class, "handleSelectionUpdate" /* decoded XOR */, "handleSelectionUpdate(IJ)V" /* decoded XOR */, 0);
        }

        @Override // tl.n
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            invoke(((Number) obj).intValue(), ((Number) obj2).longValue());
            return fl.m0.f80959a;
        }

        public final void invoke(int i10, long j10) {
            ((ResultNEEEEXActivity) this.receiver).O0(i10, j10);
        }
    }
}