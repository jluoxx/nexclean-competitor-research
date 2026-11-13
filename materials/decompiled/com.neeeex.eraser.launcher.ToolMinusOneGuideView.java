package com.neeeex.eraser.launcher;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.graphics.Color;
import android.util.Property;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.LinearInterpolator;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.core.view.c1;
import com.neeeex.eraser.R$id;
import com.neeeex.eraser.R$layout;
import com.neeeex.eraser.m0;
import p003kotlin.Metadata;
import p003kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0005\u0018\u0000 ,2\u00020\u0001:\u0001,B+\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\n\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\u000e\u001a\u00020\u00052\u0006\u0010\r\u001a\u00020\fH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\r\u0010\u0010\u001a\u00020\u0005¢\u0006\u0004\b\u0010\u0010\u000bJ\r\u0010\u0011\u001a\u00020\u0005¢\u0006\u0004\b\u0011\u0010\u000bJ\u0017\u0010\u0014\u001a\u00020\f2\u0006\u0010\u0013\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0016\u001a\u00020\u0005H\u0014¢\u0006\u0004\b\u0016\u0010\u000bR\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0017R\u001a\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u0017R\u0014\u0010\u0019\u001a\u00020\u00188\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u0014\u0010\u001b\u001a\u00020\u00188\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001aR\u0014\u0010\u001d\u001a\u00020\u001c8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR\u0018\u0010 \u001a\u0004\u0018\u00010\u001f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b \u0010!R\u0016\u0010#\u001a\u00020\"8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b#\u0010$R\u0016\u0010%\u001a\u00020\"8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b%\u0010$R\u0016\u0010&\u001a\u00020\f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b&\u0010'R\u0018\u0010+\u001a\u00020(*\u00020(8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b)\u0010*¨\u0006-"}, d2 = {"Lcom/neeeex/eraser/launcher/ToolMinusOneGuideView;", "Landroid/widget/FrameLayout;", "Landroid/content/Context;", "context", "Lkotlin/Function0;", "Lfl/m0;", "onOpenMinusOne", "onSkip", "<init>", "(Landroid/content/Context;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;)V", "startSwipeAnimation", "()V", "", "openMinusOne", "finishGuide", "(Z)V", "show", "dismiss", "Landroid/view/MotionEvent;", "event", "onTouchEvent", "(Landroid/view/MotionEvent;)Z", "onDetachedFromWindow", "Lkotlin/jvm/functions/Function0;", "Landroid/view/View;", "swipeTrack", "Landroid/view/View;", "swipeThumb", "Landroid/widget/TextView;", "skipButton", "Landroid/widget/TextView;", "Landroid/animation/AnimatorSet;", "swipeAnimator", "Landroid/animation/AnimatorSet;", "", "downX", "F", "downY", "finishing", "Z", "", "getDp", "(I)I", "dp", "Companion", "tool-feature_productionRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class ToolMinusOneGuideView extends FrameLayout {
    private static final Companion Companion = new Companion(null);
    private static final long FADE_IN_DURATION_MS = 260;
    private static final long FADE_OUT_DURATION_MS = 180;
    private static final long SWIPE_ANIMATION_DURATION_MS = 1800;
    private static final int SWIPE_DISTANCE_DP = 72;
    private float downX;
    private float downY;
    private boolean finishing;
    private final Function0 onOpenMinusOne;
    private final Function0 onSkip;
    private final TextView skipButton;
    private AnimatorSet swipeAnimator;
    private final View swipeThumb;
    private final View swipeTrack;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ToolMinusOneGuideView(Context context, Function0 function0, Function0 function1) {
        super(context);
        m0.a("U6CSoHT+OQ==\n", "MM/81BGGTUM=\n");
        context.getClass();
        m0.a("zN1ESBkQvfzNxnh3Ehs=\n", "o7MLOHx+8JU=\n");
        function0.getClass();
        m0.a("svecALOa\n", "3ZnPa9rq2oo=\n");
        function1.getClass();
        this.onOpenMinusOne = function0;
        this.onSkip = function1;
        LayoutInflater.from(context).inflate(R$layout.neeeex_launcher_minus_one_guide_overlay, (ViewGroup) this, true);
        setBackgroundColor(Color.parseColor(m0.a("e1801IUu4vNo\n", "WB0M5LUe0sM=\n")));
        setClickable(true);
        setFocusableInTouchMode(true);
        View viewFindViewById = findViewById(R$id.neeeex_launcher_minus_one_guide_swipe_track);
        if (viewFindViewById == null) {
            yl.d.a(m0.a("Ppxzb2rfUgNMj2N2dsgXEA2KInR2wVtJ\n", "bPkCGgOtN2c=\n"));
            throw null;
        }
        this.swipeTrack = viewFindViewById;
        View viewFindViewById2 = findViewById(R$id.neeeex_launcher_minus_one_guide_swipe_thumb);
        if (viewFindViewById2 == null) {
            yl.d.a(m0.a("01y62XS3YxuhT6rAaKAmCOBK68JoqWpR\n", "gTnLrB3FBn8=\n"));
            throw null;
        }
        this.swipeThumb = viewFindViewById2;
        View viewFindViewById3 = findViewById(R$id.neeeex_launcher_minus_one_guide_skip);
        if (viewFindViewById3 == null) {
            yl.d.a(m0.a("H40UxhH8iuJtngTfDevP8SybRd0N4oOo\n", "Tehls3iO74Y=\n"));
            throw null;
        }
        TextView textView = (TextView) viewFindViewById3;
        this.skipButton = textView;
        textView.setOnClickListener(new View.OnClickListener() { // from class: com.neeeex.eraser.launcher.y
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ToolMinusOneGuideView.e(this.f65179a, view);
            }
        });
        View viewFindViewById4 = findViewById(R$id.neeeex_launcher_minus_one_guide_action);
        if (viewFindViewById4 == null) {
            yl.d.a(m0.a("qqaU5fgP4izYtYT85BinP5mwxf7kEetm\n", "+MPlkJF9h0g=\n"));
            throw null;
        }
        viewFindViewById4.setOnClickListener(new View.OnClickListener() { // from class: com.neeeex.eraser.launcher.z
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ToolMinusOneGuideView.d(this.f65180a, view);
            }
        });
        final int dp2 = getDp(16);
        final int dp3 = getDp(20);
        androidx.core.view.m0.w0(this, new androidx.core.view.y() { // from class: com.neeeex.eraser.launcher.a0
            @Override // androidx.core.view.y
            public final c1 a(View view, c1 c1Var) {
                return ToolMinusOneGuideView.f(this.f65114a, dp2, dp3, view, c1Var);
            }
        });
    }

    public static void a(ToolMinusOneGuideView toolMinusOneGuideView, boolean z10) {
        ViewParent parent = toolMinusOneGuideView.getParent();
        ViewGroup viewGroup = parent instanceof ViewGroup ? (ViewGroup) parent : null;
        if (viewGroup != null) {
            viewGroup.removeView(toolMinusOneGuideView);
        }
        (z10 ? toolMinusOneGuideView.onOpenMinusOne : toolMinusOneGuideView.onSkip).invoke();
    }

    public static void b(ToolMinusOneGuideView toolMinusOneGuideView) {
        if (toolMinusOneGuideView.finishing) {
            return;
        }
        toolMinusOneGuideView.startSwipeAnimation();
    }

    public static void c(ToolMinusOneGuideView toolMinusOneGuideView) {
        if (toolMinusOneGuideView.finishing || !toolMinusOneGuideView.isAttachedToWindow()) {
            return;
        }
        float f10 = am.q.f((toolMinusOneGuideView.swipeTrack.getWidth() - toolMinusOneGuideView.swipeThumb.getWidth()) - toolMinusOneGuideView.getDp(12), 0);
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(toolMinusOneGuideView.swipeThumb, (Property<View, Float>) View.TRANSLATION_X, 0.0f, 0.0f, 0.22f * f10, 0.62f * f10, f10, f10);
        objectAnimatorOfFloat.setDuration(SWIPE_ANIMATION_DURATION_MS);
        objectAnimatorOfFloat.setInterpolator(new LinearInterpolator());
        objectAnimatorOfFloat.setRepeatCount(-1);
        objectAnimatorOfFloat.setRepeatMode(1);
        ObjectAnimator objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(toolMinusOneGuideView.swipeThumb, (Property<View, Float>) View.ALPHA, 0.55f, 1.0f, 1.0f, 1.0f, 0.72f);
        objectAnimatorOfFloat2.setDuration(SWIPE_ANIMATION_DURATION_MS);
        objectAnimatorOfFloat2.setInterpolator(new AccelerateDecelerateInterpolator());
        objectAnimatorOfFloat2.setRepeatCount(-1);
        objectAnimatorOfFloat2.setRepeatMode(1);
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playTogether(objectAnimatorOfFloat, objectAnimatorOfFloat2);
        animatorSet.start();
        toolMinusOneGuideView.swipeAnimator = animatorSet;
    }

    public static void d(ToolMinusOneGuideView toolMinusOneGuideView, View view) {
        toolMinusOneGuideView.finishGuide(true);
    }

    public static void e(ToolMinusOneGuideView toolMinusOneGuideView, View view) {
        toolMinusOneGuideView.finishGuide(false);
    }

    public static c1 f(ToolMinusOneGuideView toolMinusOneGuideView, int i10, int i11, View view, c1 c1Var) {
        m0.a("d4GEyZJJPHQ9lZiC\n", "S/TqvOEsWFQ=\n");
        view.getClass();
        m0.a("+OE9ERwB\n", "kY9OdGhyvzA=\n");
        c1Var.getClass();
        o2.d dVarF = c1Var.f(c1.p.i());
        m0.a("5zFH7htzJUnzfB2JWyk=\n", "gFQzp3UAQD0=\n");
        dVarF.getClass();
        ViewGroup.LayoutParams layoutParams = toolMinusOneGuideView.skipButton.getLayoutParams();
        ViewGroup.MarginLayoutParams marginLayoutParams = layoutParams instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams : null;
        if (marginLayoutParams != null) {
            marginLayoutParams.topMargin = i10 + dVarF.f89981b;
            marginLayoutParams.setMarginEnd(i11 + dVarF.f89982c);
            toolMinusOneGuideView.skipButton.setLayoutParams(marginLayoutParams);
        }
        return c1Var;
    }

    private final void finishGuide(final boolean openMinusOne) {
        if (this.finishing) {
            return;
        }
        this.finishing = true;
        AnimatorSet animatorSet = this.swipeAnimator;
        if (animatorSet != null) {
            animatorSet.cancel();
        }
        this.swipeAnimator = null;
        animate().cancel();
        animate().alpha(0.0f).setDuration(FADE_OUT_DURATION_MS).withEndAction(new Runnable() { // from class: com.neeeex.eraser.launcher.w
            @Override // java.lang.Runnable
            public final void run() {
                ToolMinusOneGuideView.a(this.f65176a, openMinusOne);
            }
        }).start();
    }

    private final int getDp(int i10) {
        return (int) (i10 * getResources().getDisplayMetrics().density);
    }

    private final void startSwipeAnimation() {
        AnimatorSet animatorSet = this.swipeAnimator;
        if (animatorSet != null) {
            animatorSet.cancel();
        }
        this.swipeTrack.post(new Runnable() { // from class: com.neeeex.eraser.launcher.b0
            @Override // java.lang.Runnable
            public final void run() {
                ToolMinusOneGuideView.c(this.f65118a);
            }
        });
    }

    public final void dismiss() {
        finishGuide(false);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        AnimatorSet animatorSet = this.swipeAnimator;
        if (animatorSet != null) {
            animatorSet.cancel();
        }
        this.swipeAnimator = null;
        super.onDetachedFromWindow();
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent event) {
        m0.a("oNbsEF8=\n", "xaCJfivhrEQ=\n");
        event.getClass();
        int actionMasked = event.getActionMasked();
        if (actionMasked == 0) {
            this.downX = event.getX();
            this.downY = event.getY();
            return true;
        }
        if (actionMasked != 1) {
            return true;
        }
        float x10 = event.getX() - this.downX;
        float y10 = event.getY() - this.downY;
        if (x10 >= getDp(72) && Math.abs(x10) > Math.abs(y10)) {
            finishGuide(true);
        }
        return true;
    }

    public final void show() {
        setAlpha(0.0f);
        animate().alpha(1.0f).setDuration(FADE_IN_DURATION_MS).withEndAction(new Runnable() { // from class: com.neeeex.eraser.launcher.x
            @Override // java.lang.Runnable
            public final void run() {
                ToolMinusOneGuideView.b(this.f65178a);
            }
        }).start();
        requestFocus();
        androidx.core.view.m0.i0(this);
    }

    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0007X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0007X\u0082T¢\u0006\u0002\n\u0000¨\u0006\n"}, d2 = {"Lcom/neeeex/eraser/launcher/ToolMinusOneGuideView$Companion;", "", "<init>", "()V", "SWIPE_DISTANCE_DP", "", "FADE_IN_DURATION_MS", "", "FADE_OUT_DURATION_MS", "SWIPE_ANIMATION_DURATION_MS", "tool-feature_productionRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(p003kotlin.jvm.internal.m mVar) {
            this();
        }

        private Companion() {
        }
    }
}