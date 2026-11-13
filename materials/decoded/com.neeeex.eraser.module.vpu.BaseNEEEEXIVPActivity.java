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
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u000b\b\u0016\u0018\u0000  2\u00020\u0001:\u0004!\"\u0019 B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0019\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0014¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\t\u001a\u00020\u0006H\u0014¢\u0006\u0004\b\t\u0010\u0003J\u001f\u0010\r\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\nH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u000f\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u000f\u0010\u0003J\u000f\u0010\u0011\u001a\u00020\u0010H\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0013\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0013\u0010\u0003J\u0017\u0010\u0016\u001a\u00020\u00062\u0006\u0010\u0015\u001a\u00020\u0014H\u0002¢\u0006\u0004\b\u0016\u0010\u0017R\"\u0010\u001f\u001a\u00020\u00188\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001c\"\u0004\b\u001d\u0010\u001e¨\u0006#"}, d2 = {"Lcom/neeeex/eraser/module/vpu/BaseNEEEEXIVPActivity;", "Landroidx/appcompat/app/AppCompatActivity;", "<init>", "()V", "Landroid/os/Bundle;", "savedInstanceState", "Lfl/m0;", "onCreate", "(Landroid/os/Bundle;)V", "onResume", "", "enterAnim", "exitAnim", "overridePendingTransition", "(II)V", "finish", "Lcom/neeeex/eraser/module/vpu/BaseNEEEEXIVPActivity$d;", "K", "()Lcom/neeeex/eraser/module/vpu/BaseNEEEEXIVPActivity$d;", "L", "Lcom/neeeex/eraser/module/vpu/BaseNEEEEXIVPActivity$a;", "signal", "M", "(Lcom/neeeex/eraser/module/vpu/BaseNEEEEXIVPActivity$a;)V", "", "c", "Z", "getShowed", "()Z", "setShowed", "(Z)V", "showed", "d", DownloadCommon.DOWNLOAD_REPORT_FIND_FILE_RESULT_VALUE_B, "a", "tool-feature_productionRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public class BaseNEEEEXIVPActivity extends AppCompatActivity {

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static String f65408e = "";

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static o f65409f;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    public boolean showed;

    public interface a {

        /* JADX INFO: renamed from: com.neeeex.eraser.module.vpu.BaseNEEEEXIVPActivity$a$a, reason: collision with other inner class name */
        public static final class C0782a implements a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final C0782a f65411a = new C0782a();

            public boolean equals(Object obj) {
                return this == obj || (obj instanceof C0782a);
            }

            public int hashCode() {
                return 1068323622;
            }

            public String toString() {
                return "Click" /* decoded XOR */;
            }
        }

        public static final class b implements a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final b f65412a = new b();

            public boolean equals(Object obj) {
                return this == obj || (obj instanceof b);
            }

            public int hashCode() {
                return -1241512050;
            }

            public String toString() {
                return "Closed" /* decoded XOR */;
            }
        }

        public static final class c implements a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final oj.a f65413a;

            public c(oj.a aVar) {
                this.f65413a = aVar;
            }

            public final oj.a a() {
                return this.f65413a;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof c) && v.c(this.f65413a, ((c) obj).f65413a);
            }

            public int hashCode() {
                oj.a aVar = this.f65413a;
                if (aVar == null) {
                    return 0;
                }
                return aVar.hashCode();
            }

            public String toString() {
                return "Failed(renderView=" + this.f65413a + ")";
            }
        }

        public static final class d implements a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final oj.a f65414a;

            public d(oj.a aVar) {
                this.f65414a = aVar;
            }

            public final oj.a a() {
                return this.f65414a;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof d) && v.c(this.f65414a, ((d) obj).f65414a);
            }

            public int hashCode() {
                oj.a aVar = this.f65414a;
                if (aVar == null) {
                    return 0;
                }
                return aVar.hashCode();
            }

            public String toString() {
                return "Shown(renderView=" + this.f65414a + ")";
            }
        }
    }

    public final class c implements o {
        public c() {
        }

        @Override // com.neeeex.eraser.ads.o
        public void onAdClick() {
            BaseNEEEEXIVPActivity.this.M(a.C0782a.f65411a);
        }

        @Override // com.neeeex.eraser.ads.o
        public void onAdClose() {
            BaseNEEEEXIVPActivity.this.M(a.b.f65412a);
        }

        @Override // com.neeeex.eraser.ads.o
        public void onAdShowFailed(oj.a aVar) {
            BaseNEEEEXIVPActivity.this.M(new a.c(aVar));
        }

        @Override // com.neeeex.eraser.ads.o
        public void onAdShowSuccess(oj.a aVar) {
            BaseNEEEEXIVPActivity.this.M(new a.d(aVar));
        }
    }

    public enum d {
        OPEN_AD,
        CLOSE_PAGE;


        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ ml.a f65417b = ml.b.a(d());

        public static ml.a getEntries() {
            return f65417b;
        }
    }

    public static final /* synthetic */ class e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f65418a;

        static {
            int[] iArr = new int[d.values().length];
            try {
                iArr[d.OPEN_AD.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[d.CLOSE_PAGE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f65418a = iArr;
        }
    }

    public final d K() {
        boolean z10 = this.showed;
        this.showed = true;
        return !z10 ? d.OPEN_AD : d.CLOSE_PAGE;
    }

    public final void L() {
        h hVar = h.f64923a;
        boolean z10 = hVar.g().c() > -0.1d;
        if (z10) {
            hVar.g().f(this, f65408e, new c());
        } else if (z10) {
            j.a();
        } else {
            finish();
        }
    }

    public final void M(a signal) {
        o oVar = f65409f;
        if (v.c(signal, a.C0782a.f65411a)) {
            if (oVar != null) {
                oVar.onAdClick();
            }
        } else if (signal instanceof a.d) {
            if (oVar != null) {
                oVar.onAdShowSuccess(((a.d) signal).a());
            }
        } else if (signal instanceof a.c) {
            if (oVar != null) {
                oVar.onAdShowFailed(((a.c) signal).a());
            }
        } else if (!v.c(signal, a.b.f65412a)) {
            j.a();
            return;
        } else if (oVar != null) {
            oVar.onAdClose();
        }
        if ((signal instanceof a.c) || signal == a.b.f65412a) {
            finish();
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
        int i10 = e.f65418a[K().ordinal()];
        if (i10 == 1) {
            L();
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

    /* JADX INFO: renamed from: com.neeeex.eraser.module.vpu.BaseNEEEEXIVPActivity$b, reason: from kotlin metadata */
    public static final class Companion {
        public /* synthetic */ Companion(m mVar) {
            this();
        }

        public final void a(String str) {
            "<set-?>" /* decoded XOR */;
            str.getClass();
            BaseNEEEEXIVPActivity.f65408e = str;
        }

        public final void setOnAdListener(o oVar) {
            BaseNEEEEXIVPActivity.f65409f = oVar;
        }

        public Companion() {
        }
    }
}