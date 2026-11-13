package com.neeeex.eraser.module.vpu;

import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import coil.util.j;
import com.mbridge.msdk.foundation.download.core.DownloadCommon;
import com.neeeex.eraser.R$layout;
import com.neeeex.eraser.ads.h;
import com.neeeex.eraser.ads.o;
import com.neeeex.eraser.m0;
import p003kotlin.Metadata;
import p003kotlin.jvm.internal.m;
import p003kotlin.jvm.internal.v;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u000b\u0018\u0000 \u00192\u00020\u0001:\u0004\u001a\u0012\u001b\u0019B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0019\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0014¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\t\u001a\u00020\u0006H\u0014¢\u0006\u0004\b\t\u0010\u0003J\u001f\u0010\r\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\nH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u000f\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u000f\u0010\u0003J\u000f\u0010\u0010\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0010\u0010\u0003R\"\u0010\u0018\u001a\u00020\u00118\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017¨\u0006\u001c"}, d2 = {"Lcom/neeeex/eraser/module/vpu/QDNEEEEXOVPActivity;", "Landroidx/appcompat/app/AppCompatActivity;", "<init>", "()V", "Landroid/os/Bundle;", "savedInstanceState", "Lfl/m0;", "onCreate", "(Landroid/os/Bundle;)V", "onResume", "", "enterAnim", "exitAnim", "overridePendingTransition", "(II)V", "finish", "I", "", "c", "Z", "getShowed", "()Z", "setShowed", "(Z)V", "showed", "d", DownloadCommon.DOWNLOAD_REPORT_FIND_FILE_RESULT_VALUE_B, "a", "tool-feature_productionRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class QDNEEEEXOVPActivity extends AppCompatActivity {

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static String f65441e = "";

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static o f65442f;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    public boolean showed;

    public interface a {

        /* JADX INFO: renamed from: com.neeeex.eraser.module.vpu.QDNEEEEXOVPActivity$a$a, reason: collision with other inner class name */
        public static final class C0784a implements a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final C0784a f65444a = new C0784a();

            @Override // com.neeeex.eraser.module.vpu.QDNEEEEXOVPActivity.a
            public /* bridge */ boolean a() {
                return super.a();
            }

            public boolean equals(Object obj) {
                return this == obj || (obj instanceof C0784a);
            }

            public int hashCode() {
                return -450485102;
            }

            public String toString() {
                return "Click" /* decoded XOR */;
            }
        }

        public static final class b implements a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final b f65445a = new b();

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public static final boolean f65446b = true;

            @Override // com.neeeex.eraser.module.vpu.QDNEEEEXOVPActivity.a
            public boolean a() {
                return f65446b;
            }

            public boolean equals(Object obj) {
                return this == obj || (obj instanceof b);
            }

            public int hashCode() {
                return -450478846;
            }

            public String toString() {
                return "Close" /* decoded XOR */;
            }
        }

        public static final class c implements a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final oj.a f65447a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final boolean f65448b = true;

            public c(oj.a aVar) {
                this.f65447a = aVar;
            }

            @Override // com.neeeex.eraser.module.vpu.QDNEEEEXOVPActivity.a
            public boolean a() {
                return this.f65448b;
            }

            public final oj.a b() {
                return this.f65447a;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof c) && v.c(this.f65447a, ((c) obj).f65447a);
            }

            public int hashCode() {
                oj.a aVar = this.f65447a;
                if (aVar == null) {
                    return 0;
                }
                return aVar.hashCode();
            }

            public String toString() {
                return "Failure(view=" + this.f65447a + ")";
            }
        }

        public static final class d implements a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final oj.a f65449a;

            public d(oj.a aVar) {
                this.f65449a = aVar;
            }

            @Override // com.neeeex.eraser.module.vpu.QDNEEEEXOVPActivity.a
            public /* bridge */ boolean a() {
                return super.a();
            }

            public final oj.a b() {
                return this.f65449a;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof d) && v.c(this.f65449a, ((d) obj).f65449a);
            }

            public int hashCode() {
                oj.a aVar = this.f65449a;
                if (aVar == null) {
                    return 0;
                }
                return aVar.hashCode();
            }

            public String toString() {
                return "Success(view=" + this.f65449a + ")";
            }
        }

        default boolean a() {
            return false;
        }
    }

    public final class c implements o {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final o f65450a;

        public c(o oVar) {
            this.f65450a = oVar;
        }

        public final void a(a aVar) {
            if (v.c(aVar, a.C0784a.f65444a)) {
                o oVar = this.f65450a;
                if (oVar != null) {
                    oVar.onAdClick();
                }
            } else if (aVar instanceof a.d) {
                o oVar2 = this.f65450a;
                if (oVar2 != null) {
                    oVar2.onAdShowSuccess(((a.d) aVar).b());
                }
            } else if (aVar instanceof a.c) {
                o oVar3 = this.f65450a;
                if (oVar3 != null) {
                    oVar3.onAdShowFailed(((a.c) aVar).b());
                }
            } else if (!v.c(aVar, a.b.f65445a)) {
                j.a();
                return;
            } else {
                o oVar4 = this.f65450a;
                if (oVar4 != null) {
                    oVar4.onAdClose();
                }
            }
            if (aVar.a()) {
                QDNEEEEXOVPActivity.this.finish();
            }
        }

        @Override // com.neeeex.eraser.ads.o
        public void onAdClick() {
            a(a.C0784a.f65444a);
        }

        @Override // com.neeeex.eraser.ads.o
        public void onAdClose() {
            a(a.b.f65445a);
        }

        @Override // com.neeeex.eraser.ads.o
        public void onAdShowFailed(oj.a aVar) {
            a(new a.c(aVar));
        }

        @Override // com.neeeex.eraser.ads.o
        public void onAdShowSuccess(oj.a aVar) {
            a(new a.d(aVar));
        }
    }

    public enum d {
        SHOW,
        FINISH;


        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ ml.a f65453b = ml.b.a(d());

        public static ml.a getEntries() {
            return f65453b;
        }
    }

    public static final /* synthetic */ class e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f65454a;

        static {
            int[] iArr = new int[d.values().length];
            try {
                iArr[d.SHOW.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[d.FINISH.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f65454a = iArr;
        }
    }

    public final void I() {
        h hVar = h.f64923a;
        if (hVar.e().c() <= -0.1d) {
            finish();
        } else {
            hVar.e().g(this, f65441e, new c(f65442f));
        }
    }

    @Override // android.app.Activity
    public void finish() {
        super.finish();
        overridePendingTransition(0, 0);
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R$layout.activity_neeeex_loading_white);
    }

    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onResume() {
        super.onResume();
        d dVar = this.showed ? d.FINISH : d.SHOW;
        this.showed = true;
        int i10 = e.f65454a[dVar.ordinal()];
        if (i10 == 1) {
            I();
        } else if (i10 == 2) {
            finish();
        } else {
            j.a();
        }
    }

    @Override // android.app.Activity
    public void overridePendingTransition(int enterAnim, int exitAnim) {
        super.overridePendingTransition(0, 0);
    }

    /* JADX INFO: renamed from: com.neeeex.eraser.module.vpu.QDNEEEEXOVPActivity$b, reason: from kotlin metadata */
    public static final class Companion {
        public /* synthetic */ Companion(m mVar) {
            this();
        }

        public final void setOnAdListener(o oVar) {
            QDNEEEEXOVPActivity.f65442f = oVar;
        }

        public Companion() {
        }
    }
}