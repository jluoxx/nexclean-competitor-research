package com.neeeex.eraser.launcher.notification;

import android.os.Handler;
import android.os.Looper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.android.launcher3.Launcher;
import com.android.launcher3.dragndrop.DragLayer;
import com.android.launcher3.testing.shared.ResourceUtils;
import com.android.launcher3.views.BaseDragLayer;
import com.android.quickstep.util.DeviceConfigHelper;
import com.mbridge.msdk.MBridgeConstans;
import com.neeeex.eraser.R$id;
import com.neeeex.eraser.R$layout;
import com.neeeex.eraser.launcher.LauncherReport;
import com.neeeex.eraser.launcher.NotificationRouter;
import com.reyun.solar.engine.utils.OsUtil;
import gq.v0;
import p003kotlin.Metadata;
import p003kotlin.jvm.internal.m;
import pi.e;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\b\u0007\u0018\u0000  2\u00020\u0001:\u0001 B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\tH\u0002¢\u0006\u0004\b\f\u0010\rJ\r\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u000f\u0010\u0010J\r\u0010\u0011\u001a\u00020\u000b¢\u0006\u0004\b\u0011\u0010\u0012J\r\u0010\u0013\u001a\u00020\u000b¢\u0006\u0004\b\u0013\u0010\u0012R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0014R\u0014\u0010\u0016\u001a\u00020\u00158\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u0014\u0010\u0019\u001a\u00020\u00188\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u0018\u0010\u001b\u001a\u0004\u0018\u00010\t8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR\u0018\u0010\u001f\u001a\u00020\u0006*\u00020\u00068BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u001d\u0010\u001e¨\u0006!"}, d2 = {"Lcom/neeeex/eraser/launcher/notification/LauncherFloatingNotification;", "", "Lcom/android/launcher3/Launcher;", DeviceConfigHelper.NAMESPACE_LAUNCHER, "<init>", "(Lcom/android/launcher3/Launcher;)V", "", "statusBarHeight", "()I", "Landroid/view/View;", MBridgeConstans.DYNAMIC_VIEW_KEY_VIEW, "Lfl/m0;", "removeFromParent", "(Landroid/view/View;)V", "", "showIfEligible", "()Z", "dismiss", "()V", "destroy", "Lcom/android/launcher3/Launcher;", "Landroid/os/Handler;", "mainHandler", "Landroid/os/Handler;", "Ljava/lang/Runnable;", "scheduledDismiss", "Ljava/lang/Runnable;", "currentView", "Landroid/view/View;", "getDp", "(I)I", "dp", "Companion", "launcher_lawnWithQuickstepProductionRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class LauncherFloatingNotification {
    private static final long DISMISS_ANIMATION_MILLIS = 300;
    private static final long DISPLAY_DURATION_MILLIS = 8000;
    private static final long SHOW_ANIMATION_MILLIS = 300;
    private View currentView;
    private final Launcher launcher;
    private final Handler mainHandler;
    private final Runnable scheduledDismiss;
    private static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    public LauncherFloatingNotification(Launcher launcher) {
        launcher.getClass();
        this.launcher = launcher;
        this.mainHandler = new Handler(Looper.getMainLooper());
        this.scheduledDismiss = new Runnable() { // from class: com.neeeex.eraser.launcher.notification.b
            @Override // java.lang.Runnable
            public final void run() {
                this.f65135a.dismiss();
            }
        };
    }

    public static void a(LauncherFloatingNotification launcherFloatingNotification, pi.c.a aVar, View view) {
        launcherFloatingNotification.dismiss();
        Launcher launcher = launcherFloatingNotification.launcher;
        launcher.startActivity(NotificationRouter.wrap(launcher, e.f91413a.a(launcher, aVar.a())));
    }

    public static void b(LauncherFloatingNotification launcherFloatingNotification, View view) {
        launcherFloatingNotification.removeFromParent(view);
    }

    private final int getDp(int i10) {
        return (int) (i10 * this.launcher.getResources().getDisplayMetrics().density);
    }

    private final void removeFromParent(View view) {
        ViewParent parent = view.getParent();
        ViewGroup viewGroup = parent instanceof ViewGroup ? (ViewGroup) parent : null;
        if (viewGroup != null) {
            viewGroup.removeView(view);
        }
    }

    private final int statusBarHeight() {
        int identifier = this.launcher.getResources().getIdentifier(ResourceUtils.STATUS_BAR_HEIGHT, "dimen", OsUtil.OS_TYPE_ANDROID);
        if (identifier > 0) {
            return this.launcher.getResources().getDimensionPixelSize(identifier);
        }
        return 0;
    }

    public final void destroy() {
        this.mainHandler.removeCallbacksAndMessages(null);
        View view = this.currentView;
        if (view != null) {
            view.animate().cancel();
            removeFromParent(view);
        }
        this.currentView = null;
    }

    public final void dismiss() {
        this.mainHandler.removeCallbacks(this.scheduledDismiss);
        final View view = this.currentView;
        if (view == null) {
            return;
        }
        this.currentView = null;
        view.animate().cancel();
        Integer numValueOf = Integer.valueOf(view.getHeight());
        Integer num = numValueOf.intValue() > 0 ? numValueOf : null;
        view.animate().alpha(0.0f).translationY(-(num != null ? num.intValue() : getDp(120))).setDuration(300L).withEndAction(new Runnable() { // from class: com.neeeex.eraser.launcher.notification.a
            @Override // java.lang.Runnable
            public final void run() {
                LauncherFloatingNotification.b(this.f65133a, view);
            }
        }).start();
    }

    public final boolean showIfEligible() {
        if (this.currentView != null || !com.neeeex.eraser.push.b.b(this.launcher, 0L, 2, null)) {
            return false;
        }
        final pi.c.a aVarD = pi.c.f91405a.d(this.launcher);
        String strB = aVarD.b();
        DragLayer dragLayer = this.launcher.getDragLayer();
        View viewInflate = LayoutInflater.from(this.launcher).inflate(R$layout.neeeex_launcher_launcher_floating_notification, (ViewGroup) dragLayer, false);
        View viewFindViewById = viewInflate.findViewById(R$id.neeeex_launcher_launcher_floating_notification_content);
        if (viewFindViewById == null) {
            v0.a("Required value was null.");
            return false;
        }
        ((TextView) viewFindViewById).setText(strB);
        viewInflate.setContentDescription(strB);
        viewInflate.setOnClickListener(new View.OnClickListener() { // from class: com.neeeex.eraser.launcher.notification.c
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                LauncherFloatingNotification.a(this.f65136a, aVarD, view);
            }
        });
        int dp2 = getDp(14);
        BaseDragLayer.LayoutParams layoutParams = new BaseDragLayer.LayoutParams(-1, -2);
        ((FrameLayout.LayoutParams) layoutParams).gravity = 48;
        layoutParams.ignoreInsets = true;
        layoutParams.setMarginStart(dp2);
        layoutParams.setMarginEnd(dp2);
        ((FrameLayout.LayoutParams) layoutParams).topMargin = statusBarHeight() + getDp(8);
        dragLayer.addView(viewInflate, layoutParams);
        this.currentView = viewInflate;
        viewInflate.setAlpha(0.0f);
        viewInflate.setTranslationY(-getDp(120));
        viewInflate.animate().alpha(1.0f).translationY(0.0f).setDuration(300L).start();
        com.neeeex.eraser.push.b.f(this.launcher, 0L, 2, null);
        LauncherReport.INSTANCE.reportPushShow("local_popup");
        this.mainHandler.postDelayed(this.scheduledDismiss, DISPLAY_DURATION_MILLIS);
        return true;
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0003\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000¨\u0006\b"}, d2 = {"Lcom/neeeex/eraser/launcher/notification/LauncherFloatingNotification$Companion;", "", "<init>", "()V", "SHOW_ANIMATION_MILLIS", "", "DISMISS_ANIMATION_MILLIS", "DISPLAY_DURATION_MILLIS", "launcher_lawnWithQuickstepProductionRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(m mVar) {
            this();
        }

        private Companion() {
        }
    }
}