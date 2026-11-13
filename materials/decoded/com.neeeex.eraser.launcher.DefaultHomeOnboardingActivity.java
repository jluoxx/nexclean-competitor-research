package com.neeeex.eraser.launcher;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.app.Application;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.util.Property;
import android.view.View;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.view.a1;
import androidx.core.view.d1;
import b.k0;
import com.neeeex.eraser.R$id;
import com.neeeex.eraser.R$layout;
import com.neeeex.eraser.R$string;
import com.neeeex.eraser.m0;
import java.util.ArrayList;
import p003kotlin.Metadata;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u0000 72\u00020\u0001:\u00017B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0005\u0010\u0003J\u000f\u0010\u0006\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0006\u0010\u0003J\u000f\u0010\u0007\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\u0003J\u000f\u0010\b\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\b\u0010\u0003J\u000f\u0010\t\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\t\u0010\u0003J\u000f\u0010\n\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\n\u0010\u0003J\u0017\u0010\r\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u000f\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u000f\u0010\u0003J\u000f\u0010\u0010\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0010\u0010\u0003J\u0019\u0010\u0013\u001a\u00020\u00042\b\b\u0002\u0010\u0012\u001a\u00020\u0011H\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u0017\u0010\u0017\u001a\u00020\u00042\u0006\u0010\u0016\u001a\u00020\u0015H\u0014¢\u0006\u0004\b\u0017\u0010\u0018J\u0019\u0010\u001b\u001a\u00020\u00042\b\u0010\u001a\u001a\u0004\u0018\u00010\u0019H\u0014¢\u0006\u0004\b\u001b\u0010\u001cJ\u000f\u0010\u001d\u001a\u00020\u0004H\u0014¢\u0006\u0004\b\u001d\u0010\u0003J\u000f\u0010\u001e\u001a\u00020\u0004H\u0014¢\u0006\u0004\b\u001e\u0010\u0003J\u000f\u0010\u001f\u001a\u00020\u0004H\u0014¢\u0006\u0004\b\u001f\u0010\u0003J\u000f\u0010 \u001a\u00020\u0004H\u0014¢\u0006\u0004\b \u0010\u0003J\u0017\u0010\"\u001a\u00020\u00042\u0006\u0010!\u001a\u00020\u0019H\u0014¢\u0006\u0004\b\"\u0010\u001cJ)\u0010'\u001a\u00020\u00042\u0006\u0010#\u001a\u00020\u000b2\u0006\u0010$\u001a\u00020\u000b2\b\u0010&\u001a\u0004\u0018\u00010%H\u0015¢\u0006\u0004\b'\u0010(R\u0016\u0010*\u001a\u00020)8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b*\u0010+R\u0016\u0010,\u001a\u00020)8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b,\u0010+R\u0018\u0010.\u001a\u0004\u0018\u00010-8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b.\u0010/R\u0018\u00101\u001a\u0004\u0018\u0001008\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b1\u00102R\u0016\u00103\u001a\u00020\u00118\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b3\u00104R\u0016\u00105\u001a\u00020\u00118\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b5\u00104R\u0016\u00106\u001a\u00020\u00118\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b6\u00104¨\u00068"}, d2 = {"Lcom/neeeex/eraser/launcher/DefaultHomeOnboardingActivity;", "Landroidx/appcompat/app/AppCompatActivity;", "<init>", "()V", "Lfl/m0;", "configureSystemBars", "requestDefaultHome", "startPrimaryBreathing", "stopPrimaryBreathing", "enterSkipMode", "startSkipCountdown", "", "seconds", "renderSkipSeconds", "(I)V", "hideSkip", "cancelSkipCountdown", "", "defaultSelected", "completeOnboarding", "(Z)V", "Landroid/content/Context;", "newBase", "attachBaseContext", "(Landroid/content/Context;)V", "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "(Landroid/os/Bundle;)V", "onStart", "onStop", "onResume", "onDestroy", "outState", "onSaveInstanceState", "requestCode", "resultCode", "Landroid/content/Intent;", "data", "onActivityResult", "(IILandroid/content/Intent;)V", "Landroid/widget/TextView;", "skipButton", "Landroid/widget/TextView;", "primaryButton", "Landroid/os/CountDownTimer;", "skipTimer", "Landroid/os/CountDownTimer;", "Landroid/animation/AnimatorSet;", "breatheAnimator", "Landroid/animation/AnimatorSet;", "requestInFlight", "Z", "skipEnabled", "finishingFlow", "Companion", "tool-feature_productionRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class DefaultHomeOnboardingActivity extends AppCompatActivity {
    private static final int ATTRIBUTED_SKIP_SECONDS = 7;
    private static final long BREATHE_DURATION_MS = 1800;
    private static final int DEFAULT_SKIP_SECONDS = 3;
    private static final int REQUEST_DEFAULT_HOME = 9101;
    private static final long SKIP_TICK_MS = 1000;
    private AnimatorSet breatheAnimator;
    private boolean finishingFlow;
    private TextView primaryButton;
    private boolean requestInFlight;
    private TextView skipButton;
    private boolean skipEnabled;
    private CountDownTimer skipTimer;
    private static final String STATE_REQUEST_IN_FLIGHT = "default_home_request_in_flight" /* decoded XOR */;
    private static final String STATE_SKIP_ENABLED = "default_home_skip_enabled" /* decoded XOR */;
    private static final Companion Companion = new Companion(null);

    public static void I(DefaultHomeOnboardingActivity defaultHomeOnboardingActivity, View view) {
        defaultHomeOnboardingActivity.requestDefaultHome();
    }

    public static void J(DefaultHomeOnboardingActivity defaultHomeOnboardingActivity, View view) {
        completeOnboarding$default(defaultHomeOnboardingActivity, false, 1, null);
    }

    private final void cancelSkipCountdown() {
        CountDownTimer countDownTimer = this.skipTimer;
        if (countDownTimer != null) {
            countDownTimer.cancel();
        }
        this.skipTimer = null;
    }

    private final void completeOnboarding(boolean defaultSelected) {
        if (this.finishingFlow) {
            return;
        }
        this.finishingFlow = true;
        cancelSkipCountdown();
        if (defaultSelected) {
            NewUserDesktopFunnelTracker.INSTANCE.reportDefaultHomeSelected();
        }
        DefaultHomeOnboardingHelper.INSTANCE.markOnboardingComplete(this);
        setResult(-1);
        finish();
    }

    public static /* synthetic */ void completeOnboarding$default(DefaultHomeOnboardingActivity defaultHomeOnboardingActivity, boolean z10, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            z10 = false;
        }
        defaultHomeOnboardingActivity.completeOnboarding(z10);
    }

    private final void configureSystemBars() {
        a1.b(getWindow(), true);
        getWindow().setStatusBarColor(-1);
        getWindow().setNavigationBarColor(-1);
        d1 d1VarA = a1.a(getWindow(), getWindow().getDecorView());
        d1VarA.d(true);
        d1VarA.c(true);
    }

    private final void enterSkipMode() {
        if (this.finishingFlow) {
            return;
        }
        this.skipEnabled = true;
        startSkipCountdown();
    }

    private final void hideSkip() {
        TextView textView = this.skipButton;
        TextView textView2 = null;
        if (textView == null) {
            p003kotlin.jvm.internal.v.n("skipButton" /* decoded XOR */);
            textView = null;
        }
        textView.setVisibility(4);
        TextView textView3 = this.primaryButton;
        if (textView3 == null) {
            p003kotlin.jvm.internal.v.n("primaryButton" /* decoded XOR */);
        } else {
            textView2 = textView3;
        }
        textView2.setText(R$string.neeeex_launcher_default_home_set_default);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void renderSkipSeconds(int seconds) {
        TextView textView = this.skipButton;
        TextView textView2 = null;
        if (textView == null) {
            p003kotlin.jvm.internal.v.n("skipButton" /* decoded XOR */);
            textView = null;
        }
        textView.setText(getString(R$string.neeeex_launcher_default_home_skip_countdown, new Object[]{Integer.valueOf(seconds)}));
        TextView textView3 = this.primaryButton;
        if (textView3 == null) {
            p003kotlin.jvm.internal.v.n("primaryButton" /* decoded XOR */);
        } else {
            textView2 = textView3;
        }
        textView2.setText(getString(R$string.neeeex_launcher_default_home_set_default_countdown, new Object[]{getString(R$string.neeeex_launcher_default_home_set_default), Integer.valueOf(seconds)}));
    }

    private final void requestDefaultHome() {
        if (this.requestInFlight || this.finishingFlow) {
            return;
        }
        cancelSkipCountdown();
        hideSkip();
        this.requestInFlight = true;
        DefaultHomeOnboardingHelper.INSTANCE.requestDefaultHome(this, REQUEST_DEFAULT_HOME, "new_user_onboarding" /* decoded XOR */);
    }

    private final void startPrimaryBreathing() {
        if (this.finishingFlow) {
            return;
        }
        AnimatorSet animatorSet = this.breatheAnimator;
        if (animatorSet == null || !animatorSet.isStarted()) {
            TextView textView = this.primaryButton;
            TextView textView2 = null;
            if (textView == null) {
                p003kotlin.jvm.internal.v.n("primaryButton" /* decoded XOR */);
                textView = null;
            }
            ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(textView, (Property<TextView, Float>) View.SCALE_X, 1.0f, 1.07f, 1.0f);
            TextView textView3 = this.primaryButton;
            if (textView3 == null) {
                p003kotlin.jvm.internal.v.n("primaryButton" /* decoded XOR */);
                textView3 = null;
            }
            ObjectAnimator objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(textView3, (Property<TextView, Float>) View.SCALE_Y, 1.0f, 1.07f, 1.0f);
            TextView textView4 = this.primaryButton;
            if (textView4 == null) {
                p003kotlin.jvm.internal.v.n("primaryButton" /* decoded XOR */);
            } else {
                textView2 = textView4;
            }
            ObjectAnimator objectAnimatorOfFloat3 = ObjectAnimator.ofFloat(textView2, (Property<TextView, Float>) View.ALPHA, 1.0f, 0.86f, 1.0f);
            AnimatorSet animatorSet2 = new AnimatorSet();
            animatorSet2.playTogether(objectAnimatorOfFloat, objectAnimatorOfFloat2, objectAnimatorOfFloat3);
            animatorSet2.setDuration(BREATHE_DURATION_MS);
            animatorSet2.setInterpolator(new AccelerateDecelerateInterpolator());
            ArrayList<Animator> childAnimations = animatorSet2.getChildAnimations();
            "getChildAnimations(...)" /* decoded XOR */;
            childAnimations.getClass();
            for (Animator animator : childAnimations) {
                "null cannot be cast to non-null type android.animation.ObjectAnimator" /* decoded XOR */;
                animator.getClass();
                ObjectAnimator objectAnimator = (ObjectAnimator) animator;
                objectAnimator.setRepeatCount(-1);
                objectAnimator.setRepeatMode(1);
            }
            animatorSet2.start();
            this.breatheAnimator = animatorSet2;
        }
    }

    private final void startSkipCountdown() {
        cancelSkipCountdown();
        TextView textView = this.skipButton;
        if (textView == null) {
            p003kotlin.jvm.internal.v.n("skipButton" /* decoded XOR */);
            textView = null;
        }
        textView.setVisibility(0);
        int i10 = com.neeeex.eraser.module.report.bytedance.a.k() ? 7 : 3;
        renderSkipSeconds(i10);
        this.skipTimer = new CountDownTimer(((long) i10) * 1000) { // from class: com.neeeex.eraser.launcher.DefaultHomeOnboardingActivity.startSkipCountdown.1
            @Override // android.os.CountDownTimer
            public void onFinish() {
                DefaultHomeOnboardingActivity.completeOnboarding$default(DefaultHomeOnboardingActivity.this, false, 1, null);
            }

            @Override // android.os.CountDownTimer
            public void onTick(long millisUntilFinished) {
                DefaultHomeOnboardingActivity.this.renderSkipSeconds((int) ((millisUntilFinished + 999) / 1000));
            }
        }.start();
    }

    private final void stopPrimaryBreathing() {
        AnimatorSet animatorSet = this.breatheAnimator;
        if (animatorSet != null) {
            animatorSet.cancel();
        }
        TextView textView = null;
        this.breatheAnimator = null;
        TextView textView2 = this.primaryButton;
        if (textView2 != null) {
            if (textView2 == null) {
                p003kotlin.jvm.internal.v.n("primaryButton" /* decoded XOR */);
                textView2 = null;
            }
            textView2.setScaleX(1.0f);
            TextView textView3 = this.primaryButton;
            if (textView3 == null) {
                p003kotlin.jvm.internal.v.n("primaryButton" /* decoded XOR */);
                textView3 = null;
            }
            textView3.setScaleY(1.0f);
            TextView textView4 = this.primaryButton;
            if (textView4 == null) {
                p003kotlin.jvm.internal.v.n("primaryButton" /* decoded XOR */);
            } else {
                textView = textView4;
            }
            textView.setAlpha(1.0f);
        }
    }

    @Override // androidx.appcompat.app.AppCompatActivity, android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    public void attachBaseContext(Context newBase) {
        "newBase" /* decoded XOR */;
        newBase.getClass();
        super.attachBaseContext(com.neeeex.eraser.utils.g.b(newBase));
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    @fl.e
    public void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if (requestCode != REQUEST_DEFAULT_HOME || this.finishingFlow) {
            return;
        }
        this.requestInFlight = false;
        boolean zIsDefaultHome = DefaultHomeOnboardingHelper.INSTANCE.isDefaultHome(this);
        DefaultHomeSelectionTracker.INSTANCE.reportResult(this, zIsDefaultHome);
        if (zIsDefaultHome) {
            completeOnboarding(true);
        } else {
            enterSkipMode();
        }
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        configureSystemBars();
        setContentView(R$layout.neeeex_launcher_activity_default_home_onboarding);
        NewUserDesktopFunnelTracker.INSTANCE.reportDefaultHomeGuideShown();
        this.requestInFlight = savedInstanceState != null ? savedInstanceState.getBoolean(STATE_REQUEST_IN_FLIGHT) : false;
        this.skipEnabled = savedInstanceState != null ? savedInstanceState.getBoolean(STATE_SKIP_ENABLED) : false;
        View viewFindViewById = findViewById(R$id.neeeex_launcher_default_home_skip);
        if (viewFindViewById == null) {
            yl.d.a("Required value was null." /* decoded XOR */);
            return;
        }
        TextView textView = (TextView) viewFindViewById;
        this.skipButton = textView;
        textView.setOnClickListener(new View.OnClickListener() { // from class: com.neeeex.eraser.launcher.a
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                DefaultHomeOnboardingActivity.J(this.f65113a, view);
            }
        });
        View viewFindViewById2 = findViewById(R$id.neeeex_launcher_default_home_hero_title);
        if (viewFindViewById2 == null) {
            yl.d.a("Required value was null." /* decoded XOR */);
            return;
        }
        ((TextView) viewFindViewById2).setText(getString(R$string.neeeex_launcher_default_home_hero_title, new Object[]{getString(R$string.neeeex_launcher_app_name)}));
        View viewFindViewById3 = findViewById(R$id.neeeex_launcher_default_home_primary);
        if (viewFindViewById3 == null) {
            yl.d.a("Required value was null." /* decoded XOR */);
            return;
        }
        TextView textView2 = (TextView) viewFindViewById3;
        this.primaryButton = textView2;
        textView2.setOnClickListener(new View.OnClickListener() { // from class: com.neeeex.eraser.launcher.b
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                DefaultHomeOnboardingActivity.I(this.f65117a, view);
            }
        });
        getOnBackPressedDispatcher().d(this, new k0() { // from class: com.neeeex.eraser.launcher.DefaultHomeOnboardingActivity.onCreate.3
            {
                super(true);
            }

            @Override // b.k0
            public void handleOnBackPressed() {
                if (DefaultHomeOnboardingActivity.this.skipEnabled) {
                    DefaultHomeOnboardingActivity.completeOnboarding$default(DefaultHomeOnboardingActivity.this, false, 1, null);
                }
            }
        });
        if (!this.skipEnabled || this.requestInFlight) {
            hideSkip();
        } else {
            startSkipCountdown();
        }
    }

    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        cancelSkipCountdown();
        stopPrimaryBreathing();
        super.onDestroy();
    }

    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onResume() {
        super.onResume();
        Application application = getApplication();
        "null cannot be cast to non-null type com.neeeex.eraser.MyApplication" /* decoded XOR */;
        application.getClass();
        String name = DefaultHomeOnboardingActivity.class.getName();
        "getName(...)" /* decoded XOR */;
        ((com.neeeex.eraser.y) application).markToolStartupStarted(name, getTaskId());
        DefaultHomeStatusTracker.INSTANCE.report(this, "default_home_guide" /* decoded XOR */);
        if (this.finishingFlow) {
            return;
        }
        if (DefaultHomeOnboardingHelper.INSTANCE.isDefaultHome(this)) {
            completeOnboarding(true);
        } else if (this.requestInFlight) {
            this.requestInFlight = false;
            enterSkipMode();
        }
    }

    @Override // androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onSaveInstanceState(Bundle outState) {
        "outState" /* decoded XOR */;
        outState.getClass();
        outState.putBoolean(STATE_REQUEST_IN_FLIGHT, this.requestInFlight);
        outState.putBoolean(STATE_SKIP_ENABLED, this.skipEnabled);
        super.onSaveInstanceState(outState);
    }

    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onStart() {
        super.onStart();
        startPrimaryBreathing();
    }

    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onStop() {
        stopPrimaryBreathing();
        super.onStop();
    }

    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\u0002\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0007X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\fX\u0082T¢\u0006\u0002\n\u0000¨\u0006\u000e"}, d2 = {"Lcom/neeeex/eraser/launcher/DefaultHomeOnboardingActivity$Companion;", "", "<init>", "()V", "REQUEST_DEFAULT_HOME", "", "STATE_REQUEST_IN_FLIGHT", "", "STATE_SKIP_ENABLED", "ATTRIBUTED_SKIP_SECONDS", "DEFAULT_SKIP_SECONDS", "SKIP_TICK_MS", "", "BREATHE_DURATION_MS", "tool-feature_productionRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(p003kotlin.jvm.internal.m mVar) {
            this();
        }

        private Companion() {
        }
    }
}