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
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u000b\u0018\u0000 \u001c2\u00020\u0001:\u0004\u0015\u001d\u001e\u001cB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0019\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0014¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\t\u001a\u00020\u0006H\u0014¢\u0006\u0004\b\t\u0010\u0003J\u001f\u0010\r\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\nH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u000f\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u000f\u0010\u0003J\u000f\u0010\u0011\u001a\u00020\u0010H\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0013\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0013\u0010\u0003R\"\u0010\u001b\u001a\u00020\u00148\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001a¨\u0006\u001f"}, d2 = {"Lcom/neeeex/eraser/module/vpu/QDNEEEEXIVPActivity;", "Landroidx/appcompat/app/AppCompatActivity;", "<init>", "()V", "Landroid/os/Bundle;", "savedInstanceState", "Lfl/m0;", "onCreate", "(Landroid/os/Bundle;)V", "onResume", "", "enterAnim", "exitAnim", "overridePendingTransition", "(II)V", "finish", "Lcom/neeeex/eraser/module/vpu/QDNEEEEXIVPActivity$d;", "I", "()Lcom/neeeex/eraser/module/vpu/QDNEEEEXIVPActivity$d;", "J", "", "c", "Z", "getShowed", "()Z", "setShowed", "(Z)V", "showed", "d", DownloadCommon.DOWNLOAD_REPORT_FIND_FILE_RESULT_VALUE_B, "a", "tool-feature_productionRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class QDNEEEEXIVPActivity extends AppCompatActivity {

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static String f65424e = "";

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static o f65425f;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    public boolean showed;

    public final class b implements o {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final o f65434a;

        public static final /* synthetic */ class a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final /* synthetic */ int[] f65436a;

            static {
                int[] iArr = new int[a.b.values().length];
                try {
                    iArr[a.b.CLICK.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[a.b.SHOWN.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[a.b.FAILED.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                try {
                    iArr[a.b.CLOSE.ordinal()] = 4;
                } catch (NoSuchFieldError unused4) {
                }
                f65436a = iArr;
            }
        }

        public b(o oVar) {
            this.f65434a = oVar;
        }

        public final void a(a aVar) {
            int i10 = a.f65436a[aVar.c().ordinal()];
            if (i10 == 1) {
                o oVar = this.f65434a;
                if (oVar != null) {
                    oVar.onAdClick();
                }
            } else if (i10 == 2) {
                o oVar2 = this.f65434a;
                if (oVar2 != null) {
                    oVar2.onAdShowSuccess(aVar.d());
                }
            } else if (i10 == 3) {
                o oVar3 = this.f65434a;
                if (oVar3 != null) {
                    oVar3.onAdShowFailed(aVar.d());
                }
            } else if (i10 != 4) {
                j.a();
                return;
            } else {
                o oVar4 = this.f65434a;
                if (oVar4 != null) {
                    oVar4.onAdClose();
                }
            }
            if (aVar.c() == a.b.FAILED || aVar.c() == a.b.CLOSE) {
                QDNEEEEXIVPActivity.this.finish();
            }
        }

        @Override // com.neeeex.eraser.ads.o
        public void onAdClick() {
            a(a.f65427c.b());
        }

        @Override // com.neeeex.eraser.ads.o
        public void onAdClose() {
            a(a.f65427c.c());
        }

        @Override // com.neeeex.eraser.ads.o
        public void onAdShowFailed(oj.a aVar) {
            a(a.f65427c.a(aVar));
        }

        @Override // com.neeeex.eraser.ads.o
        public void onAdShowSuccess(oj.a aVar) {
            a(a.f65427c.d(aVar));
        }
    }

    public enum d {
        ATTEMPT_DISPLAY,
        TERMINATE;


        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ ml.a f65438b = ml.b.a(d());

        public static ml.a getEntries() {
            return f65438b;
        }
    }

    public static final /* synthetic */ class e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f65439a;

        static {
            int[] iArr = new int[d.values().length];
            try {
                iArr[d.ATTEMPT_DISPLAY.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[d.TERMINATE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f65439a = iArr;
        }
    }

    public final d I() {
        if (this.showed) {
            return d.TERMINATE;
        }
        d dVar = d.ATTEMPT_DISPLAY;
        this.showed = true;
        return dVar;
    }

    public final void J() {
        h hVar = h.f64923a;
        if (hVar.h().c() > -0.1d) {
            hVar.h().f(this, f65424e, new b(f65425f));
        } else {
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
        int i10 = e.f65439a[I().ordinal()];
        if (i10 == 1) {
            J();
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

    public static final class a {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final C0783a f65427c = new C0783a(null);

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final a f65428d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public static final a f65429e;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final b f65430a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final oj.a f65431b;

        public enum b {
            CLICK,
            SHOWN,
            FAILED,
            CLOSE;


            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public static final /* synthetic */ ml.a f65433b = ml.b.a(d());

            public static ml.a getEntries() {
                return f65433b;
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        static {
            int i10 = 2;
            f65428d = new a(b.CLICK, 0 == true ? 1 : 0, i10, 0 == true ? 1 : 0);
            f65429e = new a(b.CLOSE, 0 == true ? 1 : 0, i10, 0 == true ? 1 : 0);
        }

        public a(b bVar, oj.a aVar) {
            "kind" /* decoded XOR */;
            bVar.getClass();
            this.f65430a = bVar;
            this.f65431b = aVar;
        }

        public final b c() {
            return this.f65430a;
        }

        public final oj.a d() {
            return this.f65431b;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return this.f65430a == aVar.f65430a && v.c(this.f65431b, aVar.f65431b);
        }

        public int hashCode() {
            int iHashCode = this.f65430a.hashCode() * 31;
            oj.a aVar = this.f65431b;
            return iHashCode + (aVar == null ? 0 : aVar.hashCode());
        }

        public String toString() {
            return "AdEvent(kind=" + this.f65430a + ", renderView=" + this.f65431b + ")";
        }

        /* JADX INFO: renamed from: com.neeeex.eraser.module.vpu.QDNEEEEXIVPActivity$a$a, reason: collision with other inner class name */
        public static final class C0783a {
            public /* synthetic */ C0783a(m mVar) {
                this();
            }

            public final a a(oj.a aVar) {
                return new a(b.FAILED, aVar);
            }

            public final a b() {
                return a.f65428d;
            }

            public final a c() {
                return a.f65429e;
            }

            public final a d(oj.a aVar) {
                return new a(b.SHOWN, aVar);
            }

            public C0783a() {
            }
        }

        public /* synthetic */ a(b bVar, oj.a aVar, int i10, m mVar) {
            this(bVar, (i10 & 2) != 0 ? null : aVar);
        }
    }

    /* JADX INFO: renamed from: com.neeeex.eraser.module.vpu.QDNEEEEXIVPActivity$c, reason: from kotlin metadata */
    public static final class Companion {
        public /* synthetic */ Companion(m mVar) {
            this();
        }

        public final void setOnAdListener(o oVar) {
            QDNEEEEXIVPActivity.f65425f = oVar;
        }

        public Companion() {
        }
    }
}