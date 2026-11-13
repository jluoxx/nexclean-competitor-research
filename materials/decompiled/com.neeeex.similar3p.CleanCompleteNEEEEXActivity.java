package com.neeeex.similar3p;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.FrameLayout;
import b.k0;
import b.o0;
import com.mbridge.msdk.foundation.download.core.DownloadCommon;
import com.neeeex.eraser.R$layout;
import com.neeeex.eraser.R$string;
import com.neeeex.eraser.base.BaseAdActivity;
import com.neeeex.eraser.m0;
import ji.i1;
import p003kotlin.Metadata;
import p003kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\n\u0018\u0000 \u001d2\u00020\u0001:\u0003\u001e\u0017\u001fB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0019\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0014¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\t\u001a\u00020\u0006H\u0014¢\u0006\u0004\b\t\u0010\u0003J\u000f\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u000e\u001a\u00020\u00062\u0006\u0010\r\u001a\u00020\nH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0010\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0010\u0010\u0003J\u0017\u0010\u0013\u001a\u00020\u00062\u0006\u0010\u0012\u001a\u00020\u0011H\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0015\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0015\u0010\u0003R\u0018\u0010\u0019\u001a\u0004\u0018\u00010\u00168\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u0014\u0010\u001c\u001a\u00020\u00168BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u001a\u0010\u001b¨\u0006 "}, d2 = {"Lcom/neeeex/similar3p/CleanCompleteNEEEEXActivity;", "Lcom/neeeex/eraser/base/BaseAdActivity;", "<init>", "()V", "Landroid/os/Bundle;", "savedInstanceState", "Lfl/m0;", "onCreate", "(Landroid/os/Bundle;)V", "onDestroy", "Lcom/neeeex/similar3p/CleanCompleteNEEEEXActivity$a;", "y0", "()Lcom/neeeex/similar3p/CleanCompleteNEEEEXActivity$a;", "summary", "z0", "(Lcom/neeeex/similar3p/CleanCompleteNEEEEXActivity$a;)V", "v0", "Lcom/neeeex/similar3p/CleanCompleteNEEEEXActivity$c;", "event", "x0", "(Lcom/neeeex/similar3p/CleanCompleteNEEEEXActivity$c;)V", "A0", "Lji/i1;", "c", "Lji/i1;", "_vb", "w0", "()Lji/i1;", "vb", "d", "a", DownloadCommon.DOWNLOAD_REPORT_FIND_FILE_RESULT_VALUE_B, "tool-feature_productionRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class CleanCompleteNEEEEXActivity extends BaseAdActivity {

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    public i1 _vb;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final String f66213e = m0.a("7WmAWslqfRT7a5E=\n", "riXFG4c1Pls=\n");

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final String f66214f = m0.a("79MeDIFzavH22g==\n", "rJ9bTc8sObg=\n");

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f66216a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f66217b;

        public a(int i10, String str) {
            m0.a("J8WTzg==\n", "VKzpq91D+0s=\n");
            str.getClass();
            this.f66216a = i10;
            this.f66217b = str;
        }

        public final int a() {
            return this.f66216a;
        }

        public final String b() {
            return this.f66217b;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return this.f66216a == aVar.f66216a && p003kotlin.jvm.internal.v.c(this.f66217b, aVar.f66217b);
        }

        public int hashCode() {
            return (Integer.hashCode(this.f66216a) * 31) + this.f66217b.hashCode();
        }

        public String toString() {
            return "CleanSummary(count=" + this.f66216a + ", size=" + this.f66217b + ")";
        }
    }

    public enum c {
        BACK_BUTTON,
        HOME_BUTTON,
        SYSTEM_BACK;


        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ ml.a f66219b = ml.b.a(d());

        public static ml.a getEntries() {
            return f66219b;
        }
    }

    public static final /* synthetic */ class d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f66220a;

        static {
            int[] iArr = new int[c.values().length];
            try {
                iArr[c.BACK_BUTTON.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[c.HOME_BUTTON.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[c.SYSTEM_BACK.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f66220a = iArr;
        }
    }

    public static fl.m0 s0(CleanCompleteNEEEEXActivity cleanCompleteNEEEEXActivity, k0 k0Var) {
        m0.a("9hNASkqsYqa2JElPVepiobk=\n", "0mcoIzmIA8I=\n");
        k0Var.getClass();
        cleanCompleteNEEEEXActivity.x0(c.SYSTEM_BACK);
        return fl.m0.f80959a;
    }

    public static void t0(CleanCompleteNEEEEXActivity cleanCompleteNEEEEXActivity, View view) {
        cleanCompleteNEEEEXActivity.x0(c.BACK_BUTTON);
    }

    public static void u0(CleanCompleteNEEEEXActivity cleanCompleteNEEEEXActivity, View view) {
        cleanCompleteNEEEEXActivity.x0(c.HOME_BUTTON);
    }

    public final void A0() {
        FrameLayout frameLayout = w0().f85494b;
        m0.a("yW9sS2Ku6QrkZWdaZr/GC9VIaEBps9o=\n", "pwoJLgfWqG4=\n");
        frameLayout.getClass();
        BaseAdActivity.showRenderAdAndRefresh$default(this, frameLayout, R$layout.ad_neeeex_native_white, m0.a("kkWKQa493TyYRrBHpyDjIqNDgEm7Kec4mQ==\n", "/CDvJMtFgkw=\n"), null, 8, null);
    }

    @Override // com.neeeex.eraser.base.RootActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        b.w.b(this, null, null, 3, null);
        this._vb = i1.c(getLayoutInflater());
        setContentView(w0().getRoot());
        z0(y0());
        v0();
        A0();
    }

    @Override // com.neeeex.eraser.base.BaseAdActivity, com.neeeex.eraser.base.RootActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        this._vb = null;
        super.onDestroy();
    }

    public final void v0() {
        w0().f85495c.setOnClickListener(new View.OnClickListener() { // from class: com.neeeex.similar3p.b
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                CleanCompleteNEEEEXActivity.t0(this.f66265a, view);
            }
        });
        w0().f85496d.setOnClickListener(new View.OnClickListener() { // from class: com.neeeex.similar3p.c
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                CleanCompleteNEEEEXActivity.u0(this.f66266a, view);
            }
        });
        o0.b(getOnBackPressedDispatcher(), this, false, new Function1() { // from class: com.neeeex.similar3p.d
            @Override // p003kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return CleanCompleteNEEEEXActivity.s0(this.f66267a, (k0) obj);
            }
        }, 2, null);
    }

    public final i1 w0() {
        i1 i1Var = this._vb;
        i1Var.getClass();
        return i1Var;
    }

    public final void x0(c event) {
        int i10 = d.f66220a[event.ordinal()];
        if (i10 == 1 || i10 == 2 || i10 == 3) {
            finish();
        } else {
            coil.util.j.a();
        }
    }

    public final a y0() {
        Intent intent = getIntent();
        if (intent == null) {
            return new a(0, m0.a("0jRE\n", "4hQGNsa9brg=\n"));
        }
        int intExtra = intent.getIntExtra(f66213e, 0);
        String stringExtra = intent.getStringExtra(f66214f);
        if (stringExtra == null) {
            stringExtra = m0.a("YbOf\n", "UZPdnxo96rs=\n");
        }
        return new a(intExtra, stringExtra);
    }

    public final void z0(a summary) {
        w0().f85497e.setText(getString(R$string.neeeex_clean_details, new Object[]{Integer.valueOf(summary.a()), summary.b()}));
    }
}