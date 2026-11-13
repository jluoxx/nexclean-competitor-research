package com.neeeex.eraser.module.main;

import android.animation.ObjectAnimator;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Bundle;
import android.os.CountDownTimer;
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
import com.neeeex.eraser.R$string;
import com.neeeex.eraser.base.BaseAdActivity;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import p003kotlin.Metadata;
import p003kotlin.jvm.functions.Function0;
import p003kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u0000 ,2\u00020\u0001:\u0004-\u0017\u001b.B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0019\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0014¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\t\u001a\u00020\u0006H\u0014¢\u0006\u0004\b\t\u0010\u0003J\u000f\u0010\n\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\n\u0010\u0003J\u000f\u0010\u000b\u001a\u00020\u0006H\u0014¢\u0006\u0004\b\u000b\u0010\u0003J\u000f\u0010\f\u001a\u00020\u0006H\u0014¢\u0006\u0004\b\f\u0010\u0003J\u000f\u0010\r\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\r\u0010\u0003J\u000f\u0010\u000e\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u000e\u0010\u0003J\u000f\u0010\u000f\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u000f\u0010\u0003J\u0017\u0010\u0012\u001a\u00020\u00062\u0006\u0010\u0011\u001a\u00020\u0010H\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0014\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0014\u0010\u0003J\u000f\u0010\u0015\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0015\u0010\u0003R\u0016\u0010\u0019\u001a\u00020\u00168\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u0016\u0010\u001d\u001a\u00020\u001a8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR\u0016\u0010!\u001a\u00020\u001e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001f\u0010 R\u0014\u0010%\u001a\u00020\"8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010$R\u001b\u0010+\u001a\u00020&8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b'\u0010(\u001a\u0004\b)\u0010*¨\u0006/"}, d2 = {"Lcom/neeeex/eraser/module/main/LanguageNEEEEXActivity;", "Lcom/neeeex/eraser/base/BaseAdActivity;", "<init>", "()V", "Landroid/os/Bundle;", "savedInstanceState", "Lfl/m0;", "onCreate", "(Landroid/os/Bundle;)V", "onDestroy", "onBackPressed", "onResume", "onPause", "H0", "L0", "E0", "", "languageCode", "J0", "(Ljava/lang/String;)V", "F0", "K0", "Lji/l;", "c", "Lji/l;", "binding", "Lcom/neeeex/eraser/module/main/LanguageNEEEEXActivity$c;", "d", "Lcom/neeeex/eraser/module/main/LanguageNEEEEXActivity$c;", "selection", "", "e", "Z", "navigationStarted", "Lcom/neeeex/eraser/module/main/LanguageNEEEEXActivity$d;", "f", "Lcom/neeeex/eraser/module/main/LanguageNEEEEXActivity$d;", "shakeLoop", "Lcom/neeeex/eraser/module/main/LanguageNEEEEXActivity$a;", "g", "Lfl/n;", "G0", "()Lcom/neeeex/eraser/module/main/LanguageNEEEEXActivity$a;", "autoAdvance", "h", DownloadCommon.DOWNLOAD_REPORT_FIND_FILE_RESULT_VALUE_B, "a", "tool-feature_productionRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class LanguageNEEEEXActivity extends BaseAdActivity {

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    public ji.l binding;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    public c selection;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    public boolean navigationStarted;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    public final d shakeLoop = new d();

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    public final fl.n autoAdvance = fl.o.a(fl.q.NONE, new Function0() { // from class: com.neeeex.eraser.module.main.x
        @Override // p003kotlin.jvm.functions.Function0
        public final Object invoke() {
            return LanguageNEEEEXActivity.s0(this.f65389a);
        }
    });

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final String f65259i = "system" /* decoded XOR */;

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Function1 f65265a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Function0 f65266b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final Function0 f65267c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public CountDownTimer f65268d;

        /* JADX INFO: renamed from: com.neeeex.eraser.module.main.LanguageNEEEEXActivity$a$a, reason: collision with other inner class name */
        public static final class CountDownTimerC0779a extends CountDownTimer {
            public CountDownTimerC0779a() {
                super(4000L, 1000L);
            }

            @Override // android.os.CountDownTimer
            public void onFinish() {
                a.this.f65266b.invoke();
            }

            @Override // android.os.CountDownTimer
            public void onTick(long j10) {
                a.this.f65265a.invoke(Long.valueOf((j10 / ((long) 1000)) + 1));
            }
        }

        public a(Function1 function1, Function0 function0, Function0 function2) {
            "onSecond" /* decoded XOR */;
            function1.getClass();
            "onComplete" /* decoded XOR */;
            function0.getClass();
            "onCancelled" /* decoded XOR */;
            function2.getClass();
            this.f65265a = function1;
            this.f65266b = function0;
            this.f65267c = function2;
        }

        public final void c() {
            this.f65267c.invoke();
            CountDownTimer countDownTimer = this.f65268d;
            if (countDownTimer != null) {
                countDownTimer.cancel();
            }
            this.f65268d = null;
        }

        public final boolean d() {
            return this.f65268d != null;
        }

        public final void e() {
            c();
            this.f65268d = new CountDownTimerC0779a().start();
        }
    }

    public static final class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final List f65270a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f65271b;

        public c(List list) {
            "languages" /* decoded XOR */;
            list.getClass();
            this.f65270a = list;
        }

        public final void a(int i10) {
            this.f65271b = i10;
        }

        public final String b() {
            q qVar = (q) this.f65270a.get(this.f65271b);
            com.neeeex.eraser.utils.f fVar = com.neeeex.eraser.utils.f.f66153a;
            fVar.c(qVar.a());
            fVar.d(this.f65271b);
            return qVar.a();
        }
    }

    public static final class f implements com.neeeex.eraser.ads.o {
        public f() {
        }

        @Override // com.neeeex.eraser.ads.o
        public void onAdClick() {
        }

        @Override // com.neeeex.eraser.ads.o
        public void onAdClose() {
            LanguageNEEEEXActivity.this.K0();
        }

        @Override // com.neeeex.eraser.ads.o
        public void onAdShowFailed(oj.a aVar) {
            LanguageNEEEEXActivity.this.K0();
        }

        @Override // com.neeeex.eraser.ads.o
        public void onAdShowSuccess(oj.a aVar) {
        }
    }

    public static final class g implements t {
        public g() {
        }

        @Override // com.neeeex.eraser.module.main.t
        public void a(int i10) {
            c cVar = LanguageNEEEEXActivity.this.selection;
            if (cVar == null) {
                p003kotlin.jvm.internal.v.n("selection" /* decoded XOR */);
                cVar = null;
            }
            cVar.a(i10);
            LanguageNEEEEXActivity.this.G0().c();
        }
    }

    public static final class h implements com.neeeex.eraser.ads.o {
        @Override // com.neeeex.eraser.ads.o
        public void onAdClick() {
        }

        @Override // com.neeeex.eraser.ads.o
        public void onAdClose() {
        }

        @Override // com.neeeex.eraser.ads.o
        public void onAdShowFailed(oj.a aVar) {
        }

        @Override // com.neeeex.eraser.ads.o
        public void onAdShowSuccess(oj.a aVar) {
        }
    }

    public static final fl.m0 C0(LanguageNEEEEXActivity languageNEEEEXActivity, long j10) {
        ji.l lVar = languageNEEEEXActivity.binding;
        if (lVar == null) {
            p003kotlin.jvm.internal.v.n("binding" /* decoded XOR */);
            lVar = null;
        }
        lVar.f85537e.setText(languageNEEEEXActivity.getString(R$string.common_neeeex_next) + " (" + j10 + "S)");
        return fl.m0.f80959a;
    }

    public static final fl.m0 D0(LanguageNEEEEXActivity languageNEEEEXActivity) {
        ji.l lVar = languageNEEEEXActivity.binding;
        if (lVar == null) {
            p003kotlin.jvm.internal.v.n("binding" /* decoded XOR */);
            lVar = null;
        }
        lVar.f85537e.setText(languageNEEEEXActivity.getString(R$string.common_neeeex_next));
        return fl.m0.f80959a;
    }

    public static final void I0(LanguageNEEEEXActivity languageNEEEEXActivity, View view, int i10, int i11, int i12, int i13) {
        if (i13 == 0 || !languageNEEEEXActivity.G0().d()) {
            return;
        }
        languageNEEEEXActivity.G0().c();
    }

    public static a s0(final LanguageNEEEEXActivity languageNEEEEXActivity) {
        return new a(new Function1() { // from class: com.neeeex.eraser.module.main.z
            @Override // p003kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return LanguageNEEEEXActivity.C0(this.f65391a, ((Long) obj).longValue());
            }
        }, new e(languageNEEEEXActivity), new Function0() { // from class: com.neeeex.eraser.module.main.a0
            @Override // p003kotlin.jvm.functions.Function0
            public final Object invoke() {
                return LanguageNEEEEXActivity.D0(this.f65338a);
            }
        });
    }

    public static void u0(LanguageNEEEEXActivity languageNEEEEXActivity) {
        if (languageNEEEEXActivity.isFinishing() || languageNEEEEXActivity.isDestroyed()) {
            return;
        }
        GuideNEEEEXActivity.Companion.b(GuideNEEEEXActivity.INSTANCE, languageNEEEEXActivity, languageNEEEEXActivity.getIntent(), false, 4, null);
        languageNEEEEXActivity.finish();
    }

    public static void v0(LanguageNEEEEXActivity languageNEEEEXActivity, View view) {
        languageNEEEEXActivity.E0();
    }

    public final void E0() {
        if (this.navigationStarted) {
            return;
        }
        this.navigationStarted = true;
        c cVar = this.selection;
        if (cVar == null) {
            p003kotlin.jvm.internal.v.n("selection" /* decoded XOR */);
            cVar = null;
        }
        J0(cVar.b());
    }

    public final void F0() {
        if (!com.neeeex.eraser.module.report.bytedance.a.k() || com.neeeex.eraser.ads.h.f64923a.g().c() <= -0.1d) {
            K0();
        } else {
            showInter("FIRST_LAN_END_IN" /* decoded XOR */, new f());
        }
    }

    public final a G0() {
        return (a) this.autoAdvance.getValue();
    }

    public final void H0() {
        s sVar = new s(this, new g());
        ji.l lVar = this.binding;
        if (lVar == null) {
            p003kotlin.jvm.internal.v.n("binding" /* decoded XOR */);
            lVar = null;
        }
        RecyclerView recyclerView = lVar.f85536d;
        recyclerView.addItemDecoration(new com.neeeex.eraser.utils.d0(12));
        recyclerView.setHasFixedSize(true);
        recyclerView.setOnScrollChangeListener(new View.OnScrollChangeListener() { // from class: com.neeeex.eraser.module.main.b0
            @Override // android.view.View.OnScrollChangeListener
            public final void onScrollChange(View view, int i10, int i11, int i12, int i13) {
                LanguageNEEEEXActivity.I0(this.f65341a, view, i10, i11, i12, i13);
            }
        });
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setAdapter(sVar);
    }

    public final void J0(String languageCode) {
        mi.a.f88870a.z1();
        if (p003kotlin.jvm.internal.v.c(languageCode, f65259i)) {
            languageCode = null;
        }
        Locale locale = languageCode != null ? new Locale(languageCode) : com.neeeex.eraser.utils.g.a();
        Resources resources = getResources();
        Configuration configuration = getResources().getConfiguration();
        configuration.locale = locale;
        resources.updateConfiguration(configuration, getResources().getDisplayMetrics());
        qi.a.f92153a.m();
        F0();
    }

    public final void K0() {
        runOnUiThread(new Runnable() { // from class: com.neeeex.eraser.module.main.y
            @Override // java.lang.Runnable
            public final void run() {
                LanguageNEEEEXActivity.u0(this.f65390a);
            }
        });
    }

    public final void L0() {
        ji.l lVar = this.binding;
        if (lVar == null) {
            p003kotlin.jvm.internal.v.n("binding" /* decoded XOR */);
            lVar = null;
        }
        FrameLayout frameLayout = lVar.f85534b;
        "flAdContainer" /* decoded XOR */;
        frameLayout.getClass();
        showNativeAdAndRefresh(frameLayout, R$layout.ad_neeeex_native, "FIRST_LANGUAGE_NATIVE" /* decoded XOR */, new h());
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        E0();
    }

    @Override // com.neeeex.eraser.base.RootActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ji.l lVarC = ji.l.c(getLayoutInflater());
        "inflate(...)" /* decoded XOR */;
        lVarC.getClass();
        this.binding = lVarC;
        ji.l lVar = null;
        if (lVarC == null) {
            p003kotlin.jvm.internal.v.n("binding" /* decoded XOR */);
            lVarC = null;
        }
        setContentView(lVarC.getRoot());
        this.selection = new c(v.f65386a.b());
        H0();
        ji.l lVar2 = this.binding;
        if (lVar2 == null) {
            p003kotlin.jvm.internal.v.n("binding" /* decoded XOR */);
        } else {
            lVar = lVar2;
        }
        lVar.f85535c.setOnClickListener(new View.OnClickListener() { // from class: com.neeeex.eraser.module.main.w
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                LanguageNEEEEXActivity.v0(this.f65388a, view);
            }
        });
        L0();
        mi.a.f88870a.y1();
        G0().e();
    }

    @Override // com.neeeex.eraser.base.BaseAdActivity, com.neeeex.eraser.base.RootActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        G0().c();
    }

    @Override // com.neeeex.eraser.base.BaseAdActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onPause() {
        super.onPause();
        this.shakeLoop.f();
    }

    @Override // com.neeeex.eraser.base.BaseAdActivity, com.neeeex.eraser.base.RootActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onResume() {
        super.onResume();
        d dVar = this.shakeLoop;
        ji.l lVar = this.binding;
        if (lVar == null) {
            p003kotlin.jvm.internal.v.n("binding" /* decoded XOR */);
            lVar = null;
        }
        LinearLayout linearLayout = lVar.f85535c;
        "llNeeeexBtnNext" /* decoded XOR */;
        linearLayout.getClass();
        dVar.e(linearLayout);
    }

    public static final class d {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final a f65272d = new a(null);

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public static final float[] f65273e = {0.0f, 25.0f, -25.0f, 20.0f, -20.0f, 15.0f, -15.0f, 6.0f, -6.0f, 0.0f};

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public ViewGroup f65275b;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Handler f65274a = new Handler(Looper.getMainLooper());

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final b f65276c = new b();

        public static final class b implements Runnable {
            public b() {
            }

            @Override // java.lang.Runnable
            public void run() {
                ViewGroup viewGroup = d.this.f65275b;
                if (viewGroup != null) {
                    String strA = "translationX" /* decoded XOR */;
                    float[] fArrA = d.f65272d.a();
                    ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(viewGroup, strA, Arrays.copyOf(fArrA, fArrA.length));
                    objectAnimatorOfFloat.setDuration(500L);
                    objectAnimatorOfFloat.start();
                }
                d.this.f65274a.postDelayed(this, AdaptiveTrackSelection.DEFAULT_MIN_TIME_BETWEEN_BUFFER_REEVALUTATION_MS);
            }
        }

        public final void e(ViewGroup viewGroup) {
            "view" /* decoded XOR */;
            viewGroup.getClass();
            f();
            this.f65275b = viewGroup;
            this.f65274a.post(this.f65276c);
        }

        public final void f() {
            this.f65274a.removeCallbacks(this.f65276c);
            this.f65275b = null;
        }

        public static final class a {
            public /* synthetic */ a(p003kotlin.jvm.internal.m mVar) {
                this();
            }

            public final float[] a() {
                return d.f65273e;
            }

            public a() {
            }
        }
    }

    public static final /* synthetic */ class e extends p003kotlin.jvm.internal.s implements Function0 {
        public e(Object obj) {
            super(0, obj, LanguageNEEEEXActivity.class, "commitLanguage" /* decoded XOR */, "commitLanguage()V" /* decoded XOR */, 0);
        }

        /* JADX INFO: renamed from: invoke, reason: collision with other method in class */
        public final void m166invoke() {
            ((LanguageNEEEEXActivity) this.receiver).E0();
        }

        @Override // p003kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Object invoke() {
            m166invoke();
            return fl.m0.f80959a;
        }
    }
}