package com.neeeex.eraser.launcher;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.util.Property;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.widget.FrameLayout;
import com.neeeex.eraser.R$id;
import com.neeeex.eraser.R$layout;
import com.neeeex.eraser.R$string;
import com.neeeex.eraser.m0;
import p003kotlin.Metadata;
import p003kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u0000 \u00192\u00020\u0001:\u0001\u0019B\u001d\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\t\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\r\u001a\u00020\u00052\u0006\u0010\f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u0015\u0010\u0010\u001a\u00020\u00052\u0006\u0010\u000f\u001a\u00020\u000b¢\u0006\u0004\b\u0010\u0010\u000eJ\u000f\u0010\u0011\u001a\u00020\u0005H\u0014¢\u0006\u0004\b\u0011\u0010\nJ\u000f\u0010\u0012\u001a\u00020\u0005H\u0014¢\u0006\u0004\b\u0012\u0010\nR\u0014\u0010\u0014\u001a\u00020\u00138\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u0018\u0010\u0017\u001a\u0004\u0018\u00010\u00168\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018¨\u0006\u001a"}, d2 = {"Lcom/neeeex/eraser/launcher/ToolMinusOneEdgeHintView;", "Landroid/widget/FrameLayout;", "Landroid/content/Context;", "context", "Lkotlin/Function0;", "Lfl/m0;", "onOpenMinusOne", "<init>", "(Landroid/content/Context;Lkotlin/jvm/functions/Function0;)V", "startPulse", "()V", "", "resetScale", "stopPulse", "(Z)V", "visible", "setHintVisible", "onAttachedToWindow", "onDetachedFromWindow", "Landroid/view/View;", "icon", "Landroid/view/View;", "Landroid/animation/AnimatorSet;", "pulseAnimator", "Landroid/animation/AnimatorSet;", "Companion", "tool-feature_productionRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class ToolMinusOneEdgeHintView extends FrameLayout {
    private static final Companion Companion = new Companion(null);
    private static final long PULSE_DURATION_MS = 3000;
    private final View icon;
    private AnimatorSet pulseAnimator;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ToolMinusOneEdgeHintView(Context context, final Function0 function0) {
        super(context);
        "context" /* decoded XOR */;
        context.getClass();
        "onOpenMinusOne" /* decoded XOR */;
        function0.getClass();
        setClipChildren(false);
        setClipToPadding(false);
        LayoutInflater.from(context).inflate(R$layout.neeeex_launcher_minus_one_edge_hint, (ViewGroup) this, true);
        View viewFindViewById = findViewById(R$id.neeeex_launcher_minus_one_edge_hint_icon);
        if (viewFindViewById == null) {
            yl.d.a("Required value was null." /* decoded XOR */);
            throw null;
        }
        this.icon = viewFindViewById;
        setContentDescription(context.getString(R$string.neeeex_launcher_minus_one_guide_title));
        setClickable(true);
        setFocusable(true);
        setOnClickListener(new View.OnClickListener() { // from class: com.neeeex.eraser.launcher.v
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ToolMinusOneEdgeHintView.a(function0, view);
            }
        });
    }

    public static void a(Function0 function0, View view) {
        function0.invoke();
    }

    private final void startPulse() {
        if (isAttachedToWindow()) {
            AnimatorSet animatorSet = this.pulseAnimator;
            if (animatorSet == null || !animatorSet.isStarted()) {
                ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this.icon, (Property<View, Float>) View.SCALE_X, 1.0f, 0.9f, 1.0f, 0.9f, 1.0f);
                ObjectAnimator objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(this.icon, (Property<View, Float>) View.SCALE_Y, 1.0f, 0.9f, 1.0f, 0.9f, 1.0f);
                for (ObjectAnimator objectAnimator : gl.w.p(objectAnimatorOfFloat, objectAnimatorOfFloat2)) {
                    objectAnimator.setDuration(PULSE_DURATION_MS);
                    objectAnimator.setInterpolator(new AccelerateDecelerateInterpolator());
                    objectAnimator.setRepeatCount(-1);
                    objectAnimator.setRepeatMode(1);
                }
                AnimatorSet animatorSet2 = new AnimatorSet();
                animatorSet2.playTogether(objectAnimatorOfFloat, objectAnimatorOfFloat2);
                animatorSet2.start();
                this.pulseAnimator = animatorSet2;
            }
        }
    }

    private final void stopPulse(boolean resetScale) {
        AnimatorSet animatorSet = this.pulseAnimator;
        if (animatorSet != null) {
            animatorSet.cancel();
        }
        this.pulseAnimator = null;
        if (resetScale) {
            this.icon.setScaleX(1.0f);
            this.icon.setScaleY(1.0f);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (getVisibility() == 0) {
            startPulse();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        stopPulse(true);
        super.onDetachedFromWindow();
    }

    public final void setHintVisible(boolean visible) {
        if (visible) {
            setVisibility(0);
            startPulse();
        } else {
            setVisibility(8);
            stopPulse(true);
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\t\n\u0000\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Lcom/neeeex/eraser/launcher/ToolMinusOneEdgeHintView$Companion;", "", "<init>", "()V", "PULSE_DURATION_MS", "", "tool-feature_productionRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(p003kotlin.jvm.internal.m mVar) {
            this();
        }

        private Companion() {
        }
    }
}