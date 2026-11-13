package com.neeeex.eraser.module.main;

import android.animation.ObjectAnimator;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.mbridge.msdk.foundation.download.core.DownloadCommon;
import com.mbridge.msdk.playercommon.exoplayer2.trackselection.AdaptiveTrackSelection;
import com.neeeex.eraser.R$layout;
import com.neeeex.eraser.base.BaseAdActivity;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import p003kotlin.Metadata;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u0000 \u001a2\u00020\u0001:\u0003\u001b\u001c\u000fB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0005\u0010\u0003J\u0019\u0010\b\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0014¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\n\u001a\u00020\u0004H\u0014¢\u0006\u0004\b\n\u0010\u0003J\u000f\u0010\u000b\u001a\u00020\u0004H\u0014¢\u0006\u0004\b\u000b\u0010\u0003J\u000f\u0010\f\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\f\u0010\u0003J\u000f\u0010\r\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\r\u0010\u0003R\u0016\u0010\u0011\u001a\u00020\u000e8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0016\u0010\u0015\u001a\u00020\u00128\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0019\u001a\u00020\u00168\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018¨\u0006\u001d"}, d2 = {"Lcom/neeeex/eraser/module/main/LanguageNEEEEXSettingActivity;", "Lcom/neeeex/eraser/base/BaseAdActivity;", "<init>", "()V", "Lfl/m0;", "w0", "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "(Landroid/os/Bundle;)V", "onResume", "onPause", "x0", "v0", "Lji/w;", "c", "Lji/w;", "binding", "Lcom/neeeex/eraser/module/main/LanguageNEEEEXSettingActivity$b;", "d", "Lcom/neeeex/eraser/module/main/LanguageNEEEEXSettingActivity$b;", "selection", "Lcom/neeeex/eraser/module/main/LanguageNEEEEXSettingActivity$c;", "e", "Lcom/neeeex/eraser/module/main/LanguageNEEEEXSettingActivity$c;", "shakeScheduler", "f", "a", DownloadCommon.DOWNLOAD_REPORT_FIND_FILE_RESULT_VALUE_B, "tool-feature_productionRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class LanguageNEEEEXSettingActivity extends BaseAdActivity {

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    public ji.w binding;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    public b selection;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    public final c shakeScheduler = new c();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final String f65281g = "system" /* decoded XOR */;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final List f65285a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f65286b;

        public b(List list) {
            "values" /* decoded XOR */;
            list.getClass();
            this.f65285a = list;
        }

        public final void a(int i10) {
            this.f65286b = i10;
        }

        public final String b() {
            q qVar = (q) this.f65285a.get(this.f65286b);
            com.neeeex.eraser.utils.f fVar = com.neeeex.eraser.utils.f.f66153a;
            fVar.c(qVar.a());
            fVar.d(this.f65286b);
            return qVar.a();
        }
    }

    public static final class d implements t {
        public d() {
        }

        @Override // com.neeeex.eraser.module.main.t
        public void a(int i10) {
            b bVar = LanguageNEEEEXSettingActivity.this.selection;
            if (bVar == null) {
                p003kotlin.jvm.internal.v.n("selection" /* decoded XOR */);
                bVar = null;
            }
            bVar.a(i10);
        }
    }

    public static void s0(LanguageNEEEEXSettingActivity languageNEEEEXSettingActivity, View view) {
        languageNEEEEXSettingActivity.v0();
    }

    public static void t0(LanguageNEEEEXSettingActivity languageNEEEEXSettingActivity, View view) {
        languageNEEEEXSettingActivity.onBackPressed();
    }

    private final void w0() {
        s sVar = new s(this, new d());
        ji.w wVar = this.binding;
        if (wVar == null) {
            p003kotlin.jvm.internal.v.n("binding" /* decoded XOR */);
            wVar = null;
        }
        RecyclerView recyclerView = wVar.f85723e;
        recyclerView.addItemDecoration(new com.neeeex.eraser.utils.d0(12));
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setAdapter(sVar);
    }

    @Override // com.neeeex.eraser.base.RootActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ji.w wVarC = ji.w.c(getLayoutInflater());
        "inflate(...)" /* decoded XOR */;
        wVarC.getClass();
        this.binding = wVarC;
        ji.w wVar = null;
        if (wVarC == null) {
            p003kotlin.jvm.internal.v.n("binding" /* decoded XOR */);
            wVarC = null;
        }
        setContentView(wVarC.getRoot());
        this.selection = new b(v.f65386a.b());
        w0();
        x0();
        ji.w wVar2 = this.binding;
        if (wVar2 == null) {
            p003kotlin.jvm.internal.v.n("binding" /* decoded XOR */);
        } else {
            wVar = wVar2;
        }
        FrameLayout frameLayout = wVar.f85720b;
        "flAdContainer" /* decoded XOR */;
        frameLayout.getClass();
        BaseAdActivity.showRenderAdAndRefresh$default(this, frameLayout, R$layout.ad_neeeex_native, "FIRST_LANGUAGE_NATIVE" /* decoded XOR */, null, 8, null);
    }

    @Override // com.neeeex.eraser.base.BaseAdActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onPause() {
        super.onPause();
        this.shakeScheduler.f();
    }

    @Override // com.neeeex.eraser.base.BaseAdActivity, com.neeeex.eraser.base.RootActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onResume() {
        super.onResume();
        c cVar = this.shakeScheduler;
        ji.w wVar = this.binding;
        if (wVar == null) {
            p003kotlin.jvm.internal.v.n("binding" /* decoded XOR */);
            wVar = null;
        }
        LinearLayout linearLayout = wVar.f85722d;
        "llNeeeexBtnNext" /* decoded XOR */;
        linearLayout.getClass();
        cVar.e(linearLayout);
    }

    public final void v0() {
        b bVar = this.selection;
        if (bVar == null) {
            p003kotlin.jvm.internal.v.n("selection" /* decoded XOR */);
            bVar = null;
        }
        String strB = bVar.b();
        String str = p003kotlin.jvm.internal.v.c(strB, f65281g) ? null : strB;
        Locale locale = str != null ? new Locale(str) : com.neeeex.eraser.utils.g.a();
        Resources resources = getResources();
        Configuration configuration = getResources().getConfiguration();
        configuration.locale = locale;
        resources.updateConfiguration(configuration, getResources().getDisplayMetrics());
        Intent intent = new Intent(this, (Class<?>) SplashNEEEEXActivity.class);
        intent.addFlags(268468224);
        startActivity(intent);
        finish();
    }

    public final void x0() {
        ji.w wVar = this.binding;
        ji.w wVar2 = null;
        if (wVar == null) {
            p003kotlin.jvm.internal.v.n("binding" /* decoded XOR */);
            wVar = null;
        }
        wVar.f85722d.setOnClickListener(new View.OnClickListener() { // from class: com.neeeex.eraser.module.main.c0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                LanguageNEEEEXSettingActivity.s0(this.f65344a, view);
            }
        });
        ji.w wVar3 = this.binding;
        if (wVar3 == null) {
            p003kotlin.jvm.internal.v.n("binding" /* decoded XOR */);
        } else {
            wVar2 = wVar3;
        }
        wVar2.f85721c.setOnClickListener(new View.OnClickListener() { // from class: com.neeeex.eraser.module.main.d0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                LanguageNEEEEXSettingActivity.t0(this.f65346a, view);
            }
        });
    }

    public static final class c {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final a f65287d = new a(null);

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public static final float[] f65288e = {0.0f, 25.0f, -25.0f, 20.0f, -20.0f, 15.0f, -15.0f, 6.0f, -6.0f, 0.0f};

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public ViewGroup f65290b;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Handler f65289a = new Handler(Looper.getMainLooper());

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final b f65291c = new b();

        public static final class b implements Runnable {
            public b() {
            }

            @Override // java.lang.Runnable
            public void run() {
                ViewGroup viewGroup = c.this.f65290b;
                if (viewGroup != null) {
                    c.this.d(viewGroup);
                }
                c.this.f65289a.postDelayed(this, AdaptiveTrackSelection.DEFAULT_MIN_TIME_BETWEEN_BUFFER_REEVALUTATION_MS);
            }
        }

        public final void d(ViewGroup viewGroup) {
            String strA = "translationX" /* decoded XOR */;
            float[] fArr = f65288e;
            ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(viewGroup, strA, Arrays.copyOf(fArr, fArr.length));
            objectAnimatorOfFloat.setDuration(500L);
            objectAnimatorOfFloat.start();
        }

        public final void e(ViewGroup viewGroup) {
            "view" /* decoded XOR */;
            viewGroup.getClass();
            f();
            this.f65290b = viewGroup;
            this.f65289a.post(this.f65291c);
        }

        public final void f() {
            this.f65289a.removeCallbacks(this.f65291c);
            this.f65290b = null;
        }

        public static final class a {
            public /* synthetic */ a(p003kotlin.jvm.internal.m mVar) {
                this();
            }

            public a() {
            }
        }
    }

    /* JADX INFO: renamed from: com.neeeex.eraser.module.main.LanguageNEEEEXSettingActivity$a, reason: from kotlin metadata */
    public static final class Companion {
        public /* synthetic */ Companion(p003kotlin.jvm.internal.m mVar) {
            this();
        }

        public final void a(Context context) {
            "context" /* decoded XOR */;
            context.getClass();
            context.startActivity(new Intent(context, (Class<?>) LanguageNEEEEXSettingActivity.class));
        }

        public Companion() {
        }
    }
}