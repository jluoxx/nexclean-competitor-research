package com.neeeex.similar3p;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.fragment.app.l0;
import androidx.p002lifecycle.LifecycleOwnerKt;
import b.k0;
import b.o0;
import com.airbnb.lottie.LottieAnimationView;
import com.mbridge.msdk.foundation.download.core.DownloadCommon;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.neeeex.eraser.R$layout;
import com.neeeex.eraser.R$raw;
import com.neeeex.eraser.R$string;
import com.neeeex.eraser.base.BaseAdActivity;
import com.neeeex.eraser.base.BaseStoragePermActivity;
import com.neeeex.eraser.m0;
import com.neeeex.eraser.module.dialog.ExitScanDialog;
import com.neeeex.similar3p.junk.ui.JunkScanNEEEEXActivity;
import gl.g0;
import gq.v0;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import ji.j1;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.f1;
import kotlinx.coroutines.l2;
import kotlinx.coroutines.p0;
import kotlinx.coroutines.z0;
import p003kotlin.Metadata;
import p003kotlin.jvm.functions.Function0;
import p003kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000x\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\n\u0018\u0000 N2\u00020\u0001:\u0005O=3P9B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u000b\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0012\u001a\u00020\fH\u0002¢\u0006\u0004\b\u0012\u0010\u0003J\u000f\u0010\u0013\u001a\u00020\fH\u0002¢\u0006\u0004\b\u0013\u0010\u0003J\u000f\u0010\u0014\u001a\u00020\fH\u0002¢\u0006\u0004\b\u0014\u0010\u0003J\u000f\u0010\u0015\u001a\u00020\fH\u0002¢\u0006\u0004\b\u0015\u0010\u0003J\u000f\u0010\u0016\u001a\u00020\fH\u0002¢\u0006\u0004\b\u0016\u0010\u0003J\u000f\u0010\u0017\u001a\u00020\fH\u0002¢\u0006\u0004\b\u0017\u0010\u0003J\u0017\u0010\u0018\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0018\u0010\u000eJ\u0018\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u000b\u001a\u00020\u0004H\u0082@¢\u0006\u0004\b\u001a\u0010\u001bJ\u0016\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u001d0\u001cH\u0082@¢\u0006\u0004\b\u001e\u0010\u001fJ\u0017\u0010!\u001a\u00020\f2\u0006\u0010 \u001a\u00020\u0019H\u0002¢\u0006\u0004\b!\u0010\"J\u000f\u0010#\u001a\u00020\fH\u0002¢\u0006\u0004\b#\u0010\u0003J'\u0010)\u001a\u00020\f2\u0006\u0010%\u001a\u00020$2\u0006\u0010&\u001a\u00020$2\u0006\u0010(\u001a\u00020'H\u0002¢\u0006\u0004\b)\u0010*J\u0018\u0010+\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\u0004H\u0082@¢\u0006\u0004\b+\u0010\u001bJ\u0019\u0010.\u001a\u00020\f2\b\u0010-\u001a\u0004\u0018\u00010,H\u0014¢\u0006\u0004\b.\u0010/J\u000f\u00100\u001a\u00020\fH\u0016¢\u0006\u0004\b0\u0010\u0003J\u000f\u00101\u001a\u00020\fH\u0014¢\u0006\u0004\b1\u0010\u0003R\u001b\u00107\u001a\u0002028BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b3\u00104\u001a\u0004\b5\u00106R\u0016\u0010;\u001a\u0002088\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b9\u0010:R\u0018\u0010?\u001a\u0004\u0018\u00010<8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b=\u0010>R\u0018\u0010A\u001a\u0004\u0018\u00010<8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b@\u0010>R\u0016\u0010D\u001a\u00020\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bB\u0010CR\u0016\u0010F\u001a\u00020\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bE\u0010CR\u0016\u0010J\u001a\u00020G8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bH\u0010IR\u0016\u0010M\u001a\u00020\u00048\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\bK\u0010L¨\u0006Q"}, d2 = {"Lcom/neeeex/similar3p/ScanNEEEEXActivity;", "Lcom/neeeex/eraser/base/BaseStoragePermActivity;", "<init>", "()V", "Lcom/neeeex/similar3p/y;", "n1", "()Lcom/neeeex/similar3p/y;", "type", "", "l1", "(Lcom/neeeex/similar3p/y;)Z", "kind", "Lfl/m0;", "f1", "(Lcom/neeeex/similar3p/y;)V", "Lcom/neeeex/similar3p/ScanNEEEEXActivity$e;", "b1", "(Lcom/neeeex/similar3p/y;)Lcom/neeeex/similar3p/ScanNEEEEXActivity$e;", "e1", "h1", "Z0", "X0", "V0", "o1", "W0", "Lcom/neeeex/similar3p/ScanNEEEEXActivity$c;", "a1", "(Lcom/neeeex/similar3p/y;Lkl/f;)Ljava/lang/Object;", "", "Lyi/b;", "j1", "(Lkl/f;)Ljava/lang/Object;", "payload", "k1", "(Lcom/neeeex/similar3p/ScanNEEEEXActivity$c;)V", "Y0", "", "done", "total", "", "currentPath", "m1", "(JJLjava/lang/String;)V", "c1", "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "(Landroid/os/Bundle;)V", "onStoragePermission", "onDestroy", "Lji/j1;", "c", "Lfl/n;", "d1", "()Lji/j1;", "binding", "Lcom/neeeex/similar3p/utils/f;", "d", "Lcom/neeeex/similar3p/utils/f;", "scanner", "Lkotlinx/coroutines/Job;", "e", "Lkotlinx/coroutines/Job;", "_activeJob", "f", "permissionPreviewJob", "g", "Z", "_finished", "h", "exitInProgress", "Lcom/neeeex/similar3p/ScanNEEEEXActivity$d;", "i", "Lcom/neeeex/similar3p/ScanNEEEEXActivity$d;", "scanPhase", "j", "Lcom/neeeex/similar3p/y;", "chosenType", CampaignEx.JSON_KEY_AD_K, "a", DownloadCommon.DOWNLOAD_REPORT_FIND_FILE_RESULT_VALUE_B, "tool-feature_productionRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class ScanNEEEEXActivity extends BaseStoragePermActivity {

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    public com.neeeex.similar3p.utils.f scanner;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    public Job _activeJob;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    public Job permissionPreviewJob;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    public boolean _finished;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    public boolean exitInProgress;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    public y chosenType;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    public final fl.n binding = fl.o.b(new Function0() { // from class: com.neeeex.similar3p.u
        @Override // p003kotlin.jvm.functions.Function0
        public final Object invoke() {
            return ScanNEEEEXActivity.H0(this.f66544a);
        }
    });

    /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata */
    public d scanPhase = d.READY;

    public enum b {
        IMMEDIATE,
        CONFIRM;


        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ ml.a f66251b = ml.b.a(d());

        public static ml.a getEntries() {
            return f66251b;
        }
    }

    public interface c {

        public static final class a implements c {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final List f66252a;

            public a(List list) {
                "values" /* decoded XOR */;
                list.getClass();
                this.f66252a = list;
            }

            public final List a() {
                return this.f66252a;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof a) && p003kotlin.jvm.internal.v.c(this.f66252a, ((a) obj).f66252a);
            }

            public int hashCode() {
                return this.f66252a.hashCode();
            }

            public String toString() {
                return "Duplicates(values=" + this.f66252a + ")";
            }
        }

        public static final class b implements c {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final List f66253a;

            public b(List list) {
                "values" /* decoded XOR */;
                list.getClass();
                this.f66253a = list;
            }

            public final List a() {
                return this.f66253a;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof b) && p003kotlin.jvm.internal.v.c(this.f66253a, ((b) obj).f66253a);
            }

            public int hashCode() {
                return this.f66253a.hashCode();
            }

            public String toString() {
                return "Files(values=" + this.f66253a + ")";
            }
        }

        /* JADX INFO: renamed from: com.neeeex.similar3p.ScanNEEEEXActivity$c$c, reason: collision with other inner class name */
        public static final class C0806c implements c {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final List f66254a;

            public C0806c(List list) {
                "values" /* decoded XOR */;
                list.getClass();
                this.f66254a = list;
            }

            public final List a() {
                return this.f66254a;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof C0806c) && p003kotlin.jvm.internal.v.c(this.f66254a, ((C0806c) obj).f66254a);
            }

            public int hashCode() {
                return this.f66254a.hashCode();
            }

            public String toString() {
                return "Similar(values=" + this.f66254a + ")";
            }
        }
    }

    public enum d {
        READY,
        PERMISSION_PREVIEW,
        AWAITING_PERMISSION,
        SCANNING,
        FINISHED;


        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ ml.a f66256b = ml.b.a(d());

        public static ml.a getEntries() {
            return f66256b;
        }
    }

    public static final class e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f66257a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f66258b;

        public e(int i10, int i11) {
            this.f66257a = i10;
            this.f66258b = i11;
        }

        public final int a() {
            return this.f66258b;
        }

        public final int b() {
            return this.f66257a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof e)) {
                return false;
            }
            e eVar = (e) obj;
            return this.f66257a == eVar.f66257a && this.f66258b == eVar.f66258b;
        }

        public int hashCode() {
            return (Integer.hashCode(this.f66257a) * 31) + Integer.hashCode(this.f66258b);
        }

        public String toString() {
            return "ScanPresentation(title=" + this.f66257a + ", animation=" + this.f66258b + ")";
        }
    }

    public static final /* synthetic */ class f {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f66259a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ int[] f66260b;

        static {
            int[] iArr = new int[y.values().length];
            try {
                iArr[y.LARGE_DOCS.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[y.DUPLICATE_DOCS.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[y.LARGE_MEDIA.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[y.DUPLICATE_MEDIA.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[y.SIMILAR_IMAGES.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[y.JUNK_FILES.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[y.SCREEN_CAPTURE_FILES.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            f66259a = iArr;
            int[] iArr2 = new int[b.values().length];
            try {
                iArr2[b.IMMEDIATE.ordinal()] = 1;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr2[b.CONFIRM.ordinal()] = 2;
            } catch (NoSuchFieldError unused9) {
            }
            f66260b = iArr2;
        }
    }

    public static final class h extends ll.m implements tl.n {
        final /* synthetic */ y $kind;
        int I$0;
        private /* synthetic */ Object L$0;
        Object L$1;
        int label;

        public static final class a extends ll.m implements tl.n {
            final /* synthetic */ y $kind;
            int label;
            final /* synthetic */ ScanNEEEEXActivity this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(ScanNEEEEXActivity scanNEEEEXActivity, y yVar, kl.f<? super a> fVar) {
                super(2, fVar);
                this.this$0 = scanNEEEEXActivity;
                this.$kind = yVar;
            }

            @Override // ll.a
            public final kl.f<fl.m0> create(Object obj, kl.f<?> fVar) {
                return new a(this.this$0, this.$kind, fVar);
            }

            @Override // tl.n
            public final Object invoke(p0 p0Var, kl.f<? super fl.m0> fVar) {
                return ((a) create(p0Var, fVar)).invokeSuspend(fl.m0.f80959a);
            }

            @Override // ll.a
            public final Object invokeSuspend(Object obj) {
                Object objF = p003kotlin.coroutines.intrinsics.c.f();
                int i10 = this.label;
                if (i10 == 0) {
                    fl.v.b(obj);
                    ScanNEEEEXActivity scanNEEEEXActivity = this.this$0;
                    y yVar = this.$kind;
                    this.label = 1;
                    if (scanNEEEEXActivity.c1(yVar, this) == objF) {
                        return objF;
                    }
                } else {
                    if (i10 != 1) {
                        v0.a("call to 'resume' before 'invoke' with coroutine" /* decoded XOR */);
                        return null;
                    }
                    fl.v.b(obj);
                }
                return fl.m0.f80959a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h(y yVar, kl.f<? super h> fVar) {
            super(2, fVar);
            this.$kind = yVar;
        }

        @Override // ll.a
        public final kl.f<fl.m0> create(Object obj, kl.f<?> fVar) {
            h hVar = ScanNEEEEXActivity.this.new h(this.$kind, fVar);
            hVar.L$0 = obj;
            return hVar;
        }

        @Override // tl.n
        public final Object invoke(p0 p0Var, kl.f<? super fl.m0> fVar) {
            return ((h) create(p0Var, fVar)).invokeSuspend(fl.m0.f80959a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:28:0x0090, code lost:
        
            if (kotlinx.coroutines.i.g(r8, r2, r7) == r1) goto L29;
         */
        @Override // ll.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            Object objM372constructorimpl;
            p0 p0Var = (p0) this.L$0;
            Object objF = p003kotlin.coroutines.intrinsics.c.f();
            int i10 = this.label;
            try {
                if (i10 != 0) {
                    if (i10 == 1) {
                        fl.v.b(obj);
                    } else {
                        if (i10 != 2) {
                            v0.a("call to 'resume' before 'invoke' with coroutine" /* decoded XOR */);
                            return null;
                        }
                        fl.v.b(obj);
                    }
                    return fl.m0.f80959a;
                }
                fl.v.b(obj);
                ScanNEEEEXActivity.this.Y0();
                ScanNEEEEXActivity scanNEEEEXActivity = ScanNEEEEXActivity.this;
                y yVar = this.$kind;
                fl.u.a aVar = fl.u.Companion;
                this.L$0 = ll.l.a(p0Var);
                this.L$1 = ll.l.a(p0Var);
                this.I$0 = 0;
                this.label = 1;
                obj = scanNEEEEXActivity.a1(yVar, this);
                if (obj == objF) {
                }
                return objF;
                objM372constructorimpl = fl.u.m372constructorimpl((c) obj);
            } catch (Throwable th2) {
                fl.u.a aVar2 = fl.u.Companion;
                objM372constructorimpl = fl.u.m372constructorimpl(fl.v.a(th2));
            }
            if (fl.u.m377isFailureimpl(objM372constructorimpl)) {
                objM372constructorimpl = null;
            }
            c cVar = (c) objM372constructorimpl;
            if (cVar != null) {
                ScanNEEEEXActivity.this.k1(cVar);
            }
            l2 l2VarC = f1.c();
            a aVar3 = new a(ScanNEEEEXActivity.this, this.$kind, null);
            this.L$0 = ll.l.a(p0Var);
            this.L$1 = null;
            this.label = 2;
        }
    }

    public static final class i extends ll.d {
        Object L$0;
        int label;
        /* synthetic */ Object result;

        public i(kl.f<? super i> fVar) {
            super(fVar);
        }

        @Override // ll.a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return ScanNEEEEXActivity.this.a1(null, this);
        }
    }

    public static final class p extends ll.d {
        Object L$0;
        int label;
        /* synthetic */ Object result;

        public p(kl.f<? super p> fVar) {
            super(fVar);
        }

        @Override // ll.a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return ScanNEEEEXActivity.this.c1(null, this);
        }
    }

    public static final class q implements Comparator {
        @Override // java.util.Comparator
        public final int compare(Object obj, Object obj2) {
            return jl.c.e(Integer.valueOf(((yi.b) obj).c()), Integer.valueOf(((yi.b) obj2).c()));
        }
    }

    public static final class r extends ll.d {
        int label;
        /* synthetic */ Object result;

        public r(kl.f<? super r> fVar) {
            super(fVar);
        }

        @Override // ll.a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return ScanNEEEEXActivity.this.j1(this);
        }
    }

    public static j1 H0(ScanNEEEEXActivity scanNEEEEXActivity) {
        return j1.c(scanNEEEEXActivity.getLayoutInflater());
    }

    public static void J0(ScanNEEEEXActivity scanNEEEEXActivity, View view) {
        scanNEEEEXActivity.h1();
    }

    public static fl.m0 K0(ScanNEEEEXActivity scanNEEEEXActivity, k0 k0Var) {
        "$this$addCallback" /* decoded XOR */;
        k0Var.getClass();
        scanNEEEEXActivity.h1();
        return fl.m0.f80959a;
    }

    public static final void g1(ScanNEEEEXActivity scanNEEEEXActivity, View view) {
        scanNEEEEXActivity.o1();
    }

    private final void h1() {
        int i10 = f.f66260b[(this._finished ? b.IMMEDIATE : b.CONFIRM).ordinal()];
        if (i10 == 1) {
            Z0();
            return;
        }
        if (i10 != 2) {
            coil.util.j.a();
            return;
        }
        ExitScanDialog exitScanDialogB = ExitScanDialog.Companion.b(ExitScanDialog.INSTANCE, 0, 1, null);
        exitScanDialogB.p(new ki.a() { // from class: com.neeeex.similar3p.v
            @Override // ki.a
            public final void a() {
                ScanNEEEEXActivity.i1(this.f66609a);
            }
        });
        l0 supportFragmentManager = getSupportFragmentManager();
        "getSupportFragmentManager(...)" /* decoded XOR */;
        supportFragmentManager.getClass();
        exitScanDialogB.i(supportFragmentManager);
    }

    public static final void i1(ScanNEEEEXActivity scanNEEEEXActivity) {
        Job job = scanNEEEEXActivity._activeJob;
        if (job != null) {
            Job.a.a(job, null, 1, null);
        }
        scanNEEEEXActivity.Z0();
    }

    public final void V0() {
        if (this.scanPhase != d.READY) {
            return;
        }
        this.scanPhase = d.PERMISSION_PREVIEW;
        Y0();
        d1().f85515h.setText(R$string.neeeex_permission_scan_preparing);
        this.permissionPreviewJob = kotlinx.coroutines.k.d(LifecycleOwnerKt.getLifecycleScope(this), null, null, new g(null), 3, null);
    }

    public final void W0(y kind) {
        if (this.scanPhase != d.READY) {
            return;
        }
        this.scanPhase = d.SCANNING;
        d1().f85513f.setProgress(0);
        d1().f85514g.setText(getString(R$string.neeeex_scan_percentage, new Object[]{0}));
        d1().f85515h.setText(R$string.neeeex_junk_preparing);
        this._activeJob = kotlinx.coroutines.k.d(LifecycleOwnerKt.getLifecycleScope(this), f1.b(), null, new h(kind, null), 2, null);
    }

    public final void X0() {
        if (!checkStoragePermission(this)) {
            V0();
            return;
        }
        y yVar = this.chosenType;
        if (yVar == null) {
            p003kotlin.jvm.internal.v.n("chosenType" /* decoded XOR */);
            yVar = null;
        }
        W0(yVar);
    }

    public final void Y0() {
        x xVar = x.f66611a;
        xVar.g(gl.w.m());
        xVar.f(gl.w.m());
        xVar.h(gl.w.m());
    }

    public final void Z0() {
        if (this.exitInProgress) {
            return;
        }
        this.exitInProgress = true;
        this.scanPhase = d.FINISHED;
        this._finished = true;
        Job job = this.permissionPreviewJob;
        y yVar = null;
        if (job != null) {
            Job.a.a(job, null, 1, null);
        }
        Job job2 = this._activeJob;
        if (job2 != null) {
            Job.a.a(job2, null, 1, null);
        }
        zi.l lVar = zi.l.f104405a;
        String strA = "neeeex_pdf_clean_scan_exit_fs" /* decoded XOR */;
        zi.n.a aVar = zi.n.Companion;
        y yVar2 = this.chosenType;
        if (yVar2 == null) {
            p003kotlin.jvm.internal.v.n("chosenType" /* decoded XOR */);
        } else {
            yVar = yVar2;
        }
        lVar.b(this, strA, aVar.a(yVar));
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x00a5, code lost:
    
        if (r6 == r1) goto L79;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x00be, code lost:
    
        if (r6 == r1) goto L79;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x00ed, code lost:
    
        if (r6 == r1) goto L79;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x011c, code lost:
    
        if (r6 == r1) goto L79;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x014b, code lost:
    
        if (r6 == r1) goto L79;
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x0179, code lost:
    
        if (r6 == r1) goto L79;
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x01a7, code lost:
    
        if (r6 == r1) goto L79;
     */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x01a9, code lost:
    
        return r1;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a1(y yVar, kl.f fVar) {
        i iVar;
        if (fVar instanceof i) {
            iVar = (i) fVar;
            int i10 = iVar.label;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                iVar.label = i10 - Integer.MIN_VALUE;
            } else {
                iVar = new i(fVar);
            }
        } else {
            iVar = new i(fVar);
        }
        Object objY = iVar.result;
        Object objF = p003kotlin.coroutines.intrinsics.c.f();
        switch (iVar.label) {
            case 0:
                fl.v.b(objY);
                com.neeeex.similar3p.utils.f fVar2 = null;
                switch (f.f66259a[yVar.ordinal()]) {
                    case 1:
                        com.neeeex.similar3p.utils.f fVar3 = this.scanner;
                        if (fVar3 == null) {
                            p003kotlin.jvm.internal.v.n("scanner" /* decoded XOR */);
                        } else {
                            fVar2 = fVar3;
                        }
                        j jVar = new j(this);
                        iVar.L$0 = ll.l.a(yVar);
                        iVar.label = 1;
                        objY = fVar2.Y(jVar, iVar);
                        break;
                    case 2:
                        com.neeeex.similar3p.utils.f fVar4 = this.scanner;
                        if (fVar4 == null) {
                            p003kotlin.jvm.internal.v.n("scanner" /* decoded XOR */);
                        } else {
                            fVar2 = fVar4;
                        }
                        k kVar = new k(this);
                        iVar.L$0 = ll.l.a(yVar);
                        iVar.label = 2;
                        objY = fVar2.T(kVar, iVar);
                        break;
                    case 3:
                        com.neeeex.similar3p.utils.f fVar5 = this.scanner;
                        if (fVar5 == null) {
                            p003kotlin.jvm.internal.v.n("scanner" /* decoded XOR */);
                        } else {
                            fVar2 = fVar5;
                        }
                        l lVar = new l(this);
                        iVar.L$0 = ll.l.a(yVar);
                        iVar.label = 3;
                        objY = fVar2.Z(lVar, iVar);
                        break;
                    case 4:
                        com.neeeex.similar3p.utils.f fVar6 = this.scanner;
                        if (fVar6 == null) {
                            p003kotlin.jvm.internal.v.n("scanner" /* decoded XOR */);
                        } else {
                            fVar2 = fVar6;
                        }
                        m mVar = new m(this);
                        iVar.L$0 = ll.l.a(yVar);
                        iVar.label = 4;
                        objY = fVar2.U(mVar, iVar);
                        break;
                    case 5:
                        com.neeeex.similar3p.utils.f fVar7 = this.scanner;
                        if (fVar7 == null) {
                            p003kotlin.jvm.internal.v.n("scanner" /* decoded XOR */);
                        } else {
                            fVar2 = fVar7;
                        }
                        n nVar = new n(this);
                        iVar.L$0 = ll.l.a(yVar);
                        iVar.label = 5;
                        objY = fVar2.b0(nVar, iVar);
                        break;
                    case 6:
                        iVar.L$0 = ll.l.a(yVar);
                        iVar.label = 7;
                        objY = j1(iVar);
                        break;
                    case 7:
                        com.neeeex.similar3p.utils.f fVar8 = this.scanner;
                        if (fVar8 == null) {
                            p003kotlin.jvm.internal.v.n("scanner" /* decoded XOR */);
                        } else {
                            fVar2 = fVar8;
                        }
                        o oVar = new o(this);
                        iVar.L$0 = ll.l.a(yVar);
                        iVar.label = 6;
                        objY = fVar2.a0(oVar, iVar);
                        break;
                    default:
                        coil.util.j.a();
                        return null;
                }
                break;
            case 1:
                fl.v.b(objY);
                return new c.b((List) objY);
            case 2:
                fl.v.b(objY);
                return new c.a((List) objY);
            case 3:
                fl.v.b(objY);
                return new c.b((List) objY);
            case 4:
                fl.v.b(objY);
                return new c.a((List) objY);
            case 5:
                fl.v.b(objY);
                return new c.C0806c((List) objY);
            case 6:
                fl.v.b(objY);
                return new c.b((List) objY);
            case 7:
                fl.v.b(objY);
                return new c.a((List) objY);
            default:
                v0.a("call to 'resume' before 'invoke' with coroutine" /* decoded XOR */);
                return null;
        }
    }

    public final e b1(y kind) {
        switch (f.f66259a[kind.ordinal()]) {
            case 1:
                return new e(R$string.neeeex_large_docs, R$raw.neeeex_lottie_large_docs);
            case 2:
                return new e(R$string.neeeex_duplicate_docs, R$raw.neeeex_lottie_duplicate_docs);
            case 3:
                return new e(R$string.neeeex_large_media, R$raw.neeeex_lottie_large_images);
            case 4:
                return new e(R$string.neeeex_duplicate_media, R$raw.neeeex_lottie_duplicate_images);
            case 5:
                return new e(R$string.neeeex_similar_images, R$raw.neeeex_lottie_similar_images);
            case 6:
                return new e(R$string.neeeex_similar_junk_files, R$raw.neeeex_lottie_scan_junk);
            case 7:
                return new e(R$string.neeeex_similar_screenshots, R$raw.neeeex_lottie_scan_screenshot);
            default:
                coil.util.j.a();
                return null;
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object c1(y yVar, kl.f fVar) {
        p pVar;
        if (fVar instanceof p) {
            pVar = (p) fVar;
            int i10 = pVar.label;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                pVar.label = i10 - Integer.MIN_VALUE;
            } else {
                pVar = new p(fVar);
            }
        } else {
            pVar = new p(fVar);
        }
        Object obj = pVar.result;
        Object objF = p003kotlin.coroutines.intrinsics.c.f();
        int i11 = pVar.label;
        if (i11 == 0) {
            fl.v.b(obj);
            com.neeeex.eraser.ads.e.b0().z0();
            this.scanPhase = d.FINISHED;
            this._finished = true;
            d1().f85513f.setProgress(100);
            d1().f85514g.setText("100%" /* decoded XOR */);
            d1().f85515h.setText(getString(R$string.neeeex_scan_completed));
            x.f66611a.e(yVar);
            pVar.L$0 = ll.l.a(yVar);
            pVar.label = 1;
            if (z0.b(200L, pVar) == objF) {
                return objF;
            }
        } else {
            if (i11 != 1) {
                v0.a("call to 'resume' before 'invoke' with coroutine" /* decoded XOR */);
                return null;
            }
            fl.v.b(obj);
        }
        startActivity(new Intent(this, (Class<?>) ResultNEEEEXActivity.class));
        if (com.neeeex.eraser.module.report.bytedance.a.k()) {
            BaseAdActivity.showInter$default(this, "neeeex_pdf_clean_scan_end_fs" /* decoded XOR */, null, 2, null);
        }
        finish();
        return fl.m0.f80959a;
    }

    public final j1 d1() {
        return (j1) this.binding.getValue();
    }

    public final void e1() {
        if (!com.neeeex.eraser.module.report.bytedance.a.k()) {
            d1().f85509b.setVisibility(8);
            return;
        }
        FrameLayout frameLayout = d1().f85509b;
        "neeeexAdContainerBanner" /* decoded XOR */;
        frameLayout.getClass();
        BaseAdActivity.showRenderAdAndRefresh$default(this, frameLayout, R$layout.ad_neeeex_native_white, "neeeex_pdf_clean_scan" /* decoded XOR */, null, 8, null);
    }

    public final void f1(y kind) {
        e eVarB1 = b1(kind);
        d1().f85516i.setText(eVarB1.b());
        LottieAnimationView lottieAnimationView = d1().f85512e;
        lottieAnimationView.setAnimation(eVarB1.a());
        lottieAnimationView.v();
        d1().f85510c.setOnClickListener(new View.OnClickListener() { // from class: com.neeeex.similar3p.r
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ScanNEEEEXActivity.J0(this.f66537a, view);
            }
        });
        LottieAnimationView lottieAnimationView2 = d1().f85512e;
        "neeeexSimailarLottieScan" /* decoded XOR */;
        lottieAnimationView2.getClass();
        TextView textView = d1().f85514g;
        "neeeexTvPercentage" /* decoded XOR */;
        textView.getClass();
        TextView textView2 = d1().f85515h;
        "neeeexTvScanningPath" /* decoded XOR */;
        textView2.getClass();
        Iterator it = gl.w.p(lottieAnimationView2, textView, textView2).iterator();
        while (it.hasNext()) {
            ((View) it.next()).setOnClickListener(new View.OnClickListener() { // from class: com.neeeex.similar3p.s
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    ScanNEEEEXActivity.g1(this.f66542a, view);
                }
            });
        }
        o0.b(getOnBackPressedDispatcher(), this, false, new Function1() { // from class: com.neeeex.similar3p.t
            @Override // p003kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return ScanNEEEEXActivity.K0(this.f66543a, (k0) obj);
            }
        }, 2, null);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object j1(kl.f fVar) {
        r rVar;
        if (fVar instanceof r) {
            rVar = (r) fVar;
            int i10 = rVar.label;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                rVar.label = i10 - Integer.MIN_VALUE;
            } else {
                rVar = new r(fVar);
            }
        } else {
            rVar = new r(fVar);
        }
        Object objW = rVar.result;
        Object objF = p003kotlin.coroutines.intrinsics.c.f();
        int i11 = rVar.label;
        if (i11 == 0) {
            fl.v.b(objW);
            com.neeeex.similar3p.utils.f fVar2 = this.scanner;
            if (fVar2 == null) {
                p003kotlin.jvm.internal.v.n("scanner" /* decoded XOR */);
                fVar2 = null;
            }
            s sVar = new s(this);
            rVar.label = 1;
            objW = fVar2.W(sVar, rVar);
            if (objW == objF) {
                return objF;
            }
        } else {
            if (i11 != 1) {
                v0.a("call to 'resume' before 'invoke' with coroutine" /* decoded XOR */);
                return null;
            }
            fl.v.b(objW);
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Object obj : (List) objW) {
            String strL1 = p003kotlin.text.k0.l1(((yi.e) obj).f(), '.', "");
            Locale locale = Locale.ROOT;
            "ROOT" /* decoded XOR */;
            locale.getClass();
            String lowerCase = strL1.toLowerCase(locale);
            "toLowerCase(...)" /* decoded XOR */;
            lowerCase.getClass();
            Integer numD = ll.b.d(p003kotlin.jvm.internal.v.c(lowerCase, "apk" /* decoded XOR */) ? 1 : 2);
            Object arrayList = linkedHashMap.get(numD);
            if (arrayList == null) {
                arrayList = new ArrayList();
                linkedHashMap.put(numD, arrayList);
            }
            ((List) arrayList).add(obj);
        }
        ArrayList arrayList2 = new ArrayList(linkedHashMap.size());
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            int iIntValue = ((Number) entry.getKey()).intValue();
            List list = (List) entry.getValue();
            arrayList2.add(new yi.b((yi.e) g0.p0(list), new ArrayList(list), iIntValue));
        }
        return g0.V0(arrayList2, new q());
    }

    public final void k1(c payload) {
        if (payload instanceof c.b) {
            x.f66611a.g(((c.b) payload).a());
            return;
        }
        if (payload instanceof c.a) {
            x.f66611a.f(((c.a) payload).a());
        } else if (payload instanceof c.C0806c) {
            x.f66611a.h(((c.C0806c) payload).a());
        } else {
            coil.util.j.a();
        }
    }

    public final boolean l1(y type) {
        if (type != y.JUNK_FILES) {
            return false;
        }
        startActivity(new Intent(this, (Class<?>) JunkScanNEEEEXActivity.class));
        finish();
        return true;
    }

    public final void m1(long done, long total, String currentPath) {
        int iP = total > 0 ? am.q.p((int) ((done / total) * ((double) 100)), 0, 99) : 0;
        d1().f85513f.setProgress(iP);
        d1().f85514g.setText(iP + "%");
        d1().f85515h.setText(currentPath);
    }

    public final y n1() {
        Object objM372constructorimpl;
        String stringExtra = getIntent().getStringExtra("SCAN_TYPE" /* decoded XOR */);
        if (stringExtra == null) {
            return y.LARGE_DOCS;
        }
        try {
            fl.u.a aVar = fl.u.Companion;
            objM372constructorimpl = fl.u.m372constructorimpl(y.valueOf(stringExtra));
        } catch (Throwable th2) {
            fl.u.a aVar2 = fl.u.Companion;
            objM372constructorimpl = fl.u.m372constructorimpl(fl.v.a(th2));
        }
        y yVar = y.LARGE_DOCS;
        if (fl.u.m377isFailureimpl(objM372constructorimpl)) {
            objM372constructorimpl = yVar;
        }
        return (y) objM372constructorimpl;
    }

    public final void o1() {
        if (this.scanPhase == d.AWAITING_PERMISSION) {
            askPermission(new t(this));
        }
    }

    @Override // com.neeeex.eraser.base.RootActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        y yVarN1 = n1();
        this.chosenType = yVarN1;
        y yVar = null;
        if (yVarN1 == null) {
            p003kotlin.jvm.internal.v.n("chosenType" /* decoded XOR */);
            yVarN1 = null;
        }
        if (l1(yVarN1)) {
            return;
        }
        b.w.b(this, null, null, 3, null);
        setContentView(d1().getRoot());
        this.scanner = new com.neeeex.similar3p.utils.f(this);
        y yVar2 = this.chosenType;
        if (yVar2 == null) {
            p003kotlin.jvm.internal.v.n("chosenType" /* decoded XOR */);
        } else {
            yVar = yVar2;
        }
        f1(yVar);
        X0();
        e1();
    }

    @Override // com.neeeex.eraser.base.BaseStoragePermActivity, com.neeeex.eraser.base.BaseAdActivity, com.neeeex.eraser.base.RootActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        Job job = this.permissionPreviewJob;
        if (job != null) {
            Job.a.a(job, null, 1, null);
        }
        Job job2 = this._activeJob;
        if (job2 != null) {
            Job.a.a(job2, null, 1, null);
        }
        super.onDestroy();
    }

    @Override // com.neeeex.eraser.base.BaseStoragePermActivity
    public void onStoragePermission() {
        if (this.scanner == null) {
            return;
        }
        d dVar = this.scanPhase;
        if (dVar == d.PERMISSION_PREVIEW || dVar == d.AWAITING_PERMISSION) {
            Job job = this.permissionPreviewJob;
            y yVar = null;
            if (job != null) {
                Job.a.a(job, null, 1, null);
            }
            this.scanPhase = d.READY;
            y yVar2 = this.chosenType;
            if (yVar2 == null) {
                p003kotlin.jvm.internal.v.n("chosenType" /* decoded XOR */);
            } else {
                yVar = yVar2;
            }
            W0(yVar);
        }
    }

    public static final class g extends ll.m implements tl.n {
        int label;

        public g(kl.f<? super g> fVar) {
            super(2, fVar);
        }

        public static fl.m0 b(ScanNEEEEXActivity scanNEEEEXActivity, int i10) {
            scanNEEEEXActivity.d1().f85513f.setProgress(i10);
            scanNEEEEXActivity.d1().f85514g.setText(scanNEEEEXActivity.getString(R$string.neeeex_scan_percentage, new Object[]{Integer.valueOf(i10)}));
            return fl.m0.f80959a;
        }

        @Override // ll.a
        public final kl.f<fl.m0> create(Object obj, kl.f<?> fVar) {
            return ScanNEEEEXActivity.this.new g(fVar);
        }

        @Override // tl.n
        public final Object invoke(p0 p0Var, kl.f<? super fl.m0> fVar) {
            return ((g) create(p0Var, fVar)).invokeSuspend(fl.m0.f80959a);
        }

        @Override // ll.a
        public final Object invokeSuspend(Object obj) {
            g gVar;
            Object objF = p003kotlin.coroutines.intrinsics.c.f();
            int i10 = this.label;
            if (i10 == 0) {
                fl.v.b(obj);
                com.neeeex.eraser.base.p pVar = com.neeeex.eraser.base.p.f65036a;
                final ScanNEEEEXActivity scanNEEEEXActivity = ScanNEEEEXActivity.this;
                Function1 function1 = new Function1() { // from class: com.neeeex.similar3p.w
                    @Override // p003kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj2) {
                        return ScanNEEEEXActivity.g.b(scanNEEEEXActivity, ((Integer) obj2).intValue());
                    }
                };
                this.label = 1;
                gVar = this;
                if (com.neeeex.eraser.base.p.b(pVar, 0, function1, gVar, 1, null) == objF) {
                    return objF;
                }
            } else {
                if (i10 != 1) {
                    v0.a("call to 'resume' before 'invoke' with coroutine" /* decoded XOR */);
                    return null;
                }
                fl.v.b(obj);
                gVar = this;
            }
            if (ScanNEEEEXActivity.this.scanPhase != d.PERMISSION_PREVIEW) {
                return fl.m0.f80959a;
            }
            ScanNEEEEXActivity.this.scanPhase = d.AWAITING_PERMISSION;
            ScanNEEEEXActivity.this.askPermission(new a(ScanNEEEEXActivity.this));
            return fl.m0.f80959a;
        }

        public static final /* synthetic */ class a extends p003kotlin.jvm.internal.s implements Function0 {
            public a(Object obj) {
                super(0, obj, ScanNEEEEXActivity.class, "closeScanPage" /* decoded XOR */, "closeScanPage()V" /* decoded XOR */, 0);
            }

            /* JADX INFO: renamed from: invoke, reason: collision with other method in class */
            public final void m188invoke() {
                ((ScanNEEEEXActivity) this.receiver).Z0();
            }

            @Override // p003kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ Object invoke() {
                m188invoke();
                return fl.m0.f80959a;
            }
        }
    }

    public static final /* synthetic */ class t extends p003kotlin.jvm.internal.s implements Function0 {
        public t(Object obj) {
            super(0, obj, ScanNEEEEXActivity.class, "closeScanPage" /* decoded XOR */, "closeScanPage()V" /* decoded XOR */, 0);
        }

        /* JADX INFO: renamed from: invoke, reason: collision with other method in class */
        public final void m189invoke() {
            ((ScanNEEEEXActivity) this.receiver).Z0();
        }

        @Override // p003kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Object invoke() {
            m189invoke();
            return fl.m0.f80959a;
        }
    }

    public static final /* synthetic */ class j extends p003kotlin.jvm.internal.s implements tl.o {
        public j(Object obj) {
            super(3, obj, ScanNEEEEXActivity.class, "reportProgress" /* decoded XOR */, "reportProgress(JJLjava/lang/String;)V" /* decoded XOR */, 0);
        }

        @Override // tl.o
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            invoke(((Number) obj).longValue(), ((Number) obj2).longValue(), (String) obj3);
            return fl.m0.f80959a;
        }

        public final void invoke(long j10, long j11, String str) {
            "p2" /* decoded XOR */;
            str.getClass();
            ((ScanNEEEEXActivity) this.receiver).m1(j10, j11, str);
        }
    }

    public static final /* synthetic */ class k extends p003kotlin.jvm.internal.s implements tl.o {
        public k(Object obj) {
            super(3, obj, ScanNEEEEXActivity.class, "reportProgress" /* decoded XOR */, "reportProgress(JJLjava/lang/String;)V" /* decoded XOR */, 0);
        }

        @Override // tl.o
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            invoke(((Number) obj).longValue(), ((Number) obj2).longValue(), (String) obj3);
            return fl.m0.f80959a;
        }

        public final void invoke(long j10, long j11, String str) {
            "p2" /* decoded XOR */;
            str.getClass();
            ((ScanNEEEEXActivity) this.receiver).m1(j10, j11, str);
        }
    }

    public static final /* synthetic */ class l extends p003kotlin.jvm.internal.s implements tl.o {
        public l(Object obj) {
            super(3, obj, ScanNEEEEXActivity.class, "reportProgress" /* decoded XOR */, "reportProgress(JJLjava/lang/String;)V" /* decoded XOR */, 0);
        }

        @Override // tl.o
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            invoke(((Number) obj).longValue(), ((Number) obj2).longValue(), (String) obj3);
            return fl.m0.f80959a;
        }

        public final void invoke(long j10, long j11, String str) {
            "p2" /* decoded XOR */;
            str.getClass();
            ((ScanNEEEEXActivity) this.receiver).m1(j10, j11, str);
        }
    }

    public static final /* synthetic */ class m extends p003kotlin.jvm.internal.s implements tl.o {
        public m(Object obj) {
            super(3, obj, ScanNEEEEXActivity.class, "reportProgress" /* decoded XOR */, "reportProgress(JJLjava/lang/String;)V" /* decoded XOR */, 0);
        }

        @Override // tl.o
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            invoke(((Number) obj).longValue(), ((Number) obj2).longValue(), (String) obj3);
            return fl.m0.f80959a;
        }

        public final void invoke(long j10, long j11, String str) {
            "p2" /* decoded XOR */;
            str.getClass();
            ((ScanNEEEEXActivity) this.receiver).m1(j10, j11, str);
        }
    }

    public static final /* synthetic */ class n extends p003kotlin.jvm.internal.s implements tl.o {
        public n(Object obj) {
            super(3, obj, ScanNEEEEXActivity.class, "reportProgress" /* decoded XOR */, "reportProgress(JJLjava/lang/String;)V" /* decoded XOR */, 0);
        }

        @Override // tl.o
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            invoke(((Number) obj).longValue(), ((Number) obj2).longValue(), (String) obj3);
            return fl.m0.f80959a;
        }

        public final void invoke(long j10, long j11, String str) {
            "p2" /* decoded XOR */;
            str.getClass();
            ((ScanNEEEEXActivity) this.receiver).m1(j10, j11, str);
        }
    }

    public static final /* synthetic */ class o extends p003kotlin.jvm.internal.s implements tl.o {
        public o(Object obj) {
            super(3, obj, ScanNEEEEXActivity.class, "reportProgress" /* decoded XOR */, "reportProgress(JJLjava/lang/String;)V" /* decoded XOR */, 0);
        }

        @Override // tl.o
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            invoke(((Number) obj).longValue(), ((Number) obj2).longValue(), (String) obj3);
            return fl.m0.f80959a;
        }

        public final void invoke(long j10, long j11, String str) {
            "p2" /* decoded XOR */;
            str.getClass();
            ((ScanNEEEEXActivity) this.receiver).m1(j10, j11, str);
        }
    }

    public static final /* synthetic */ class s extends p003kotlin.jvm.internal.s implements tl.o {
        public s(Object obj) {
            super(3, obj, ScanNEEEEXActivity.class, "reportProgress" /* decoded XOR */, "reportProgress(JJLjava/lang/String;)V" /* decoded XOR */, 0);
        }

        @Override // tl.o
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            invoke(((Number) obj).longValue(), ((Number) obj2).longValue(), (String) obj3);
            return fl.m0.f80959a;
        }

        public final void invoke(long j10, long j11, String str) {
            "p2" /* decoded XOR */;
            str.getClass();
            ((ScanNEEEEXActivity) this.receiver).m1(j10, j11, str);
        }
    }
}