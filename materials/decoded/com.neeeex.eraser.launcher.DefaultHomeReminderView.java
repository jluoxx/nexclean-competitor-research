package com.neeeex.eraser.launcher;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.util.Property;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.widget.FrameLayout;
import com.mbridge.msdk.playercommon.exoplayer2.text.ttml.TtmlNode;
import com.neeeex.eraser.R$id;
import com.neeeex.eraser.R$layout;
import com.neeeex.eraser.m0;
import java.util.ArrayList;
import p003kotlin.Metadata;
import p003kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0005\u0018\u0000 \u001f2\u00020\u0001:\u0001\u001fB\u001d\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\t\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\t\u0010\nJ\r\u0010\u000b\u001a\u00020\u0005¢\u0006\u0004\b\u000b\u0010\nJ\r\u0010\f\u001a\u00020\u0005¢\u0006\u0004\b\f\u0010\nJ\u000f\u0010\r\u001a\u00020\u0005H\u0014¢\u0006\u0004\b\r\u0010\nJ/\u0010\u0013\u001a\u00020\u00052\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u000e2\u0006\u0010\u0012\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0016\u001a\u00020\u00158\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u0018\u0010\u0019\u001a\u0004\u0018\u00010\u00188\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u0018\u0010\u001e\u001a\u00020\u001b*\u00020\u000e8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u001c\u0010\u001d¨\u0006 "}, d2 = {"Lcom/neeeex/eraser/launcher/DefaultHomeReminderView;", "Landroid/widget/FrameLayout;", "Landroid/content/Context;", "context", "Lkotlin/Function0;", "Lfl/m0;", "onSetDefault", "<init>", "(Landroid/content/Context;Lkotlin/jvm/functions/Function0;)V", "startActionPulse", "()V", "show", "hide", "onDetachedFromWindow", "", TtmlNode.LEFT, "top", TtmlNode.RIGHT, "bottom", "setPadding", "(IIII)V", "Landroid/view/View;", "actionButton", "Landroid/view/View;", "Landroid/animation/AnimatorSet;", "pulseAnimator", "Landroid/animation/AnimatorSet;", "", "getDp", "(I)F", "dp", "Companion", "tool-feature_productionRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class DefaultHomeReminderView extends FrameLayout {
    private static final Companion Companion = new Companion(null);
    private static final long PULSE_DURATION_MS = 1800;
    private static final long SHOW_DURATION_MS = 260;
    private final View actionButton;
    private AnimatorSet pulseAnimator;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DefaultHomeReminderView(Context context, final Function0 function0) {
        super(context);
        "context" /* decoded XOR */;
        context.getClass();
        "onSetDefault" /* decoded XOR */;
        function0.getClass();
        LayoutInflater.from(context).inflate(R$layout.neeeex_launcher_default_home_reminder, (ViewGroup) this, true);
        View viewFindViewById = findViewById(R$id.neeeex_launcher_default_home_reminder_action);
        if (viewFindViewById == null) {
            yl.d.a("Required value was null." /* decoded XOR */);
            throw null;
        }
        this.actionButton = viewFindViewById;
        setOnClickListener(new View.OnClickListener() { // from class: com.neeeex.eraser.launcher.c
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                DefaultHomeReminderView.a(function0, view);
            }
        });
        setClipChildren(false);
        setClipToPadding(false);
        setFocusable(true);
    }

    public static void a(Function0 function0, View view) {
        function0.invoke();
    }

    private final float getDp(int i10) {
        return i10 * getResources().getDisplayMetrics().density;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void startActionPulse() {
        AnimatorSet animatorSet = this.pulseAnimator;
        if (animatorSet != null) {
            animatorSet.cancel();
        }
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this.actionButton, (Property<View, Float>) View.SCALE_X, 1.0f, 0.975f, 1.0f);
        ObjectAnimator objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(this.actionButton, (Property<View, Float>) View.SCALE_Y, 1.0f, 0.975f, 1.0f);
        ObjectAnimator objectAnimatorOfFloat3 = ObjectAnimator.ofFloat(this.actionButton, (Property<View, Float>) View.ALPHA, 1.0f, 0.84f, 1.0f);
        AnimatorSet animatorSet2 = new AnimatorSet();
        animatorSet2.playTogether(objectAnimatorOfFloat, objectAnimatorOfFloat2, objectAnimatorOfFloat3);
        animatorSet2.setDuration(PULSE_DURATION_MS);
        animatorSet2.setInterpolator(new AccelerateDecelerateInterpolator());
        ArrayList<Animator> childAnimations = animatorSet2.getChildAnimations();
        "getChildAnimations(...)" /* decoded XOR */;
        childAnimations.getClass();
        for (Animator animator : childAnimations) {
            ValueAnimator valueAnimator = animator instanceof ValueAnimator ? (ValueAnimator) animator : null;
            if (valueAnimator != null) {
                valueAnimator.setRepeatCount(-1);
            }
        }
        animatorSet2.start();
        this.pulseAnimator = animatorSet2;
    }

    public final void hide() {
        animate().cancel();
        AnimatorSet animatorSet = this.pulseAnimator;
        if (animatorSet != null) {
            animatorSet.cancel();
        }
        this.pulseAnimator = null;
        this.actionButton.setScaleX(1.0f);
        this.actionButton.setScaleY(1.0f);
        this.actionButton.setAlpha(1.0f);
        setAlpha(1.0f);
        setTranslationY(0.0f);
        setVisibility(4);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        AnimatorSet animatorSet = this.pulseAnimator;
        if (animatorSet != null) {
            animatorSet.cancel();
        }
        this.pulseAnimator = null;
        animate().cancel();
        super.onDetachedFromWindow();
    }

    @Override // android.view.View
    public void setPadding(int left, int top, int right, int bottom) {
        super.setPadding(0, 0, 0, 0);
    }

    public final void show() {
        animate().cancel();
        AnimatorSet animatorSet = this.pulseAnimator;
        if (animatorSet != null) {
            animatorSet.cancel();
        }
        this.pulseAnimator = null;
        this.actionButton.setScaleX(1.0f);
        this.actionButton.setScaleY(1.0f);
        this.actionButton.setAlpha(1.0f);
        setVisibility(0);
        setAlpha(0.0f);
        setTranslationY(getDp(10));
        animate().alpha(1.0f).translationY(0.0f).setDuration(SHOW_DURATION_MS).withEndAction(new Runnable() { // from class: com.neeeex.eraser.launcher.d
            @Override // java.lang.Runnable
            public final void run() {
                this.f65120a.startActionPulse();
            }
        }).start();
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0002\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0007"}, d2 = {"Lcom/neeeex/eraser/launcher/DefaultHomeReminderView$Companion;", "", "<init>", "()V", "SHOW_DURATION_MS", "", "PULSE_DURATION_MS", "tool-feature_productionRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(p003kotlin.jvm.internal.m mVar) {
            this();
        }

        private Companion() {
        }
    }
}