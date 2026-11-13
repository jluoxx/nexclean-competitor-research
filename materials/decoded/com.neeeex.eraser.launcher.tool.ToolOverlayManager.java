package com.neeeex.eraser.launcher.tool;

import am.q;
import android.R;
import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.app.Activity;
import android.app.KeyguardManager;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.os.IBinder;
import android.os.PowerManager;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.WindowManager;
import android.view.animation.DecelerateInterpolator;
import android.widget.FrameLayout;
import android.window.OnBackInvokedCallback;
import android.window.OnBackInvokedDispatcher;
import androidx.core.app.NotificationCompat;
import app.lawnchair.LawnchairLauncher;
import com.android.launcher3.LauncherSettings;
import com.android.launcher3.Utilities;
import com.android.quickstep.util.DeviceConfigHelper;
import com.android.systemui.plugins.shared.LauncherOverlayManager;
import com.neeeex.eraser.launcher.OpenSceneAdPolicy;
import com.neeeex.eraser.launcher.contract.ToolHost;
import com.neeeex.eraser.launcher.contract.ToolPanel;
import com.tp.vast.VastIconXmlManager;
import fl.m0;
import p003kotlin.Metadata;
import p003kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000´\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0005\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0015\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\b\u0007\u0018\u0000 \u008e\u00012\u00020\u00012\u00020\u00022\u00020\u0003:\u0004\u008f\u0001\u008e\u0001B\u000f\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\u000b\u001a\u00020\bH\u0002¢\u0006\u0004\b\u000b\u0010\nJ\u0017\u0010\u000e\u001a\u00020\b2\u0006\u0010\r\u001a\u00020\fH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0010\u001a\u00020\b2\u0006\u0010\r\u001a\u00020\fH\u0002¢\u0006\u0004\b\u0010\u0010\u000fJ)\u0010\u0016\u001a\u00020\b2\u0006\u0010\u0011\u001a\u00020\f2\u0006\u0010\u0013\u001a\u00020\u00122\b\b\u0002\u0010\u0015\u001a\u00020\u0014H\u0002¢\u0006\u0004\b\u0016\u0010\u0017J\u0017\u0010\u0018\u001a\u00020\b2\u0006\u0010\u0011\u001a\u00020\fH\u0002¢\u0006\u0004\b\u0018\u0010\u000fJ\u000f\u0010\u0019\u001a\u00020\bH\u0002¢\u0006\u0004\b\u0019\u0010\nJ\u000f\u0010\u001a\u001a\u00020\bH\u0002¢\u0006\u0004\b\u001a\u0010\nJ\u000f\u0010\u001b\u001a\u00020\bH\u0002¢\u0006\u0004\b\u001b\u0010\nJ\u000f\u0010\u001c\u001a\u00020\bH\u0002¢\u0006\u0004\b\u001c\u0010\nJ\u000f\u0010\u001d\u001a\u00020\bH\u0002¢\u0006\u0004\b\u001d\u0010\nJ\u0017\u0010\u001e\u001a\u00020\b2\u0006\u0010\r\u001a\u00020\u0014H\u0002¢\u0006\u0004\b\u001e\u0010\u001fJ\u000f\u0010 \u001a\u00020\bH\u0003¢\u0006\u0004\b \u0010\nJ\u000f\u0010!\u001a\u00020\bH\u0003¢\u0006\u0004\b!\u0010\nJ\u0017\u0010\"\u001a\u00020\b2\u0006\u0010\r\u001a\u00020\u0014H\u0002¢\u0006\u0004\b\"\u0010\u001fJ\u0017\u0010$\u001a\u00020\b2\u0006\u0010#\u001a\u00020\u0014H\u0002¢\u0006\u0004\b$\u0010\u001fJ\u000f\u0010%\u001a\u00020\bH\u0002¢\u0006\u0004\b%\u0010\nJ\u000f\u0010&\u001a\u00020\bH\u0002¢\u0006\u0004\b&\u0010\nJ\u000f\u0010'\u001a\u00020\bH\u0016¢\u0006\u0004\b'\u0010\nJ\u000f\u0010(\u001a\u00020\bH\u0016¢\u0006\u0004\b(\u0010\nJ\u000f\u0010)\u001a\u00020\bH\u0016¢\u0006\u0004\b)\u0010\nJ\u0017\u0010,\u001a\u00020\b2\u0006\u0010+\u001a\u00020*H\u0016¢\u0006\u0004\b,\u0010-J\u0017\u0010.\u001a\u00020\b2\u0006\u0010+\u001a\u00020*H\u0016¢\u0006\u0004\b.\u0010-J\u0017\u0010/\u001a\u00020\b2\u0006\u0010+\u001a\u00020*H\u0016¢\u0006\u0004\b/\u0010-J\u0017\u00100\u001a\u00020\b2\u0006\u0010+\u001a\u00020*H\u0016¢\u0006\u0004\b0\u0010-J\u0017\u00101\u001a\u00020\b2\u0006\u0010+\u001a\u00020*H\u0016¢\u0006\u0004\b1\u0010-J\u000f\u00102\u001a\u00020\bH\u0016¢\u0006\u0004\b2\u0010\nJ\r\u00103\u001a\u00020\b¢\u0006\u0004\b3\u0010\nJ\u0017\u00105\u001a\u00020\b2\u0006\u00104\u001a\u00020\u0014H\u0016¢\u0006\u0004\b5\u0010\u001fJ\u0017\u00105\u001a\u00020\b2\u0006\u0010\u0013\u001a\u000206H\u0016¢\u0006\u0004\b5\u00107J\u0017\u00108\u001a\u00020\b2\u0006\u00104\u001a\u00020\u0014H\u0016¢\u0006\u0004\b8\u0010\u001fJ\u000f\u00109\u001a\u00020\bH\u0016¢\u0006\u0004\b9\u0010\nJ\r\u0010:\u001a\u00020\b¢\u0006\u0004\b:\u0010\nJ\r\u0010;\u001a\u00020\b¢\u0006\u0004\b;\u0010\nJ!\u0010@\u001a\u00020\b2\u0006\u0010=\u001a\u00020<2\b\u0010?\u001a\u0004\u0018\u00010>H\u0016¢\u0006\u0004\b@\u0010AJ\u0015\u0010B\u001a\u00020\b2\u0006\u0010=\u001a\u00020<¢\u0006\u0004\bB\u0010CJ\u000f\u0010D\u001a\u00020\bH\u0016¢\u0006\u0004\bD\u0010\nJ\u000f\u0010E\u001a\u00020\bH\u0016¢\u0006\u0004\bE\u0010\nJ\u001f\u0010H\u001a\u00020\b2\u0006\u0010F\u001a\u00020\f2\u0006\u0010G\u001a\u00020\u0014H\u0016¢\u0006\u0004\bH\u0010IJ\u0017\u0010K\u001a\u00020\b2\u0006\u0010J\u001a\u00020\fH\u0016¢\u0006\u0004\bK\u0010\u000fJ\u001f\u0010O\u001a\u00020\b2\u0006\u0010M\u001a\u00020L2\u0006\u0010N\u001a\u00020\fH\u0016¢\u0006\u0004\bO\u0010PJ\u0019\u0010S\u001a\u00020\b2\b\u0010R\u001a\u0004\u0018\u00010QH\u0016¢\u0006\u0004\bS\u0010TJ\r\u0010U\u001a\u00020\u0014¢\u0006\u0004\bU\u0010VJ\r\u0010W\u001a\u00020\b¢\u0006\u0004\bW\u0010\nJ\r\u0010X\u001a\u00020\u0014¢\u0006\u0004\bX\u0010VR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010YR\u0014\u0010[\u001a\u00020Z8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b[\u0010\\R\u0016\u0010^\u001a\u0004\u0018\u00010]8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b^\u0010_R\u0016\u0010a\u001a\u0004\u0018\u00010`8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\ba\u0010bR\u0014\u0010d\u001a\u00020c8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bd\u0010eR\u0018\u0010g\u001a\u00060fR\u00020\u00008\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bg\u0010hR\u0014\u0010j\u001a\u00020i8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bj\u0010kR\u0014\u0010l\u001a\u00020i8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bl\u0010kR\u0018\u0010n\u001a\u0004\u0018\u00010m8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bn\u0010oR\u0018\u0010R\u001a\u0004\u0018\u00010Q8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bR\u0010pR\u0018\u0010r\u001a\u0004\u0018\u00010q8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\br\u0010sR\u0016\u0010F\u001a\u00020\f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bF\u0010tR\u0016\u0010u\u001a\u00020\f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bu\u0010tR\u0016\u0010v\u001a\u00020\u00148\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bv\u0010wR\u0016\u0010x\u001a\u00020\u00148\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bx\u0010wR\u0016\u0010y\u001a\u00020\u00148\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\by\u0010wR\u0016\u0010z\u001a\u00020\u00148\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bz\u0010wR\u0016\u0010{\u001a\u00020\u00148\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b{\u0010wR\u0016\u0010|\u001a\u00020\u00148\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b|\u0010wR\u0016\u0010}\u001a\u00020\u00148\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b}\u0010wR\u0016\u0010~\u001a\u00020\u00148\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b~\u0010wR\u0016\u0010\u007f\u001a\u00020\u00148\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u007f\u0010wR\u0018\u0010\u0080\u0001\u001a\u00020\u00148\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b\u0080\u0001\u0010wR\u0019\u0010\u0081\u0001\u001a\u0002068\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0081\u0001\u0010\u0082\u0001R\u001c\u0010\u0084\u0001\u001a\u0005\u0018\u00010\u0083\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0084\u0001\u0010\u0085\u0001R\u001c\u0010\u0087\u0001\u001a\u0005\u0018\u00010\u0086\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0087\u0001\u0010\u0088\u0001R\u0018\u0010\u0089\u0001\u001a\u00020\u00148\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b\u0089\u0001\u0010wR\u0018\u0010\u008a\u0001\u001a\u00020\u00148\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b\u008a\u0001\u0010wR\u0018\u0010\u008b\u0001\u001a\u00020\u00148\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b\u008b\u0001\u0010wR\u0016\u0010+\u001a\u00020*8VX\u0096\u0004¢\u0006\b\u001a\u0006\b\u008c\u0001\u0010\u008d\u0001¨\u0006\u0090\u0001"}, d2 = {"Lcom/neeeex/eraser/launcher/tool/ToolOverlayManager;", "Lcom/android/systemui/plugins/shared/LauncherOverlayManager;", "Lcom/android/systemui/plugins/shared/LauncherOverlayManager$LauncherOverlay;", "Lcom/neeeex/eraser/launcher/contract/ToolHost;", "Lapp/lawnchair/LawnchairLauncher;", DeviceConfigHelper.NAMESPACE_LAUNCHER, "<init>", "(Lapp/lawnchair/LawnchairLauncher;)V", "Lfl/m0;", "attachWindow", "()V", "detachWindow", "", "value", "updateProgress", "(F)V", "applyProgress", "target", "", VastIconXmlManager.DURATION, "", "showSwipeAdOnFinish", "settleTo", "(FJZ)V", "finishSettle", "showMinusOneSwipeAdIfEligible", "cancelAnimation", "beginMotionLayer", "releaseMotionLayer", "beginPanelDrag", "setInteractive", "(Z)V", "registerOverlayBackCallback", "unregisterOverlayBackCallback", "setVisible", "useDarkIcons", "updateStatusBarAppearance", "rememberOverlayBeforeLock", "restoreOverlayIfRequested", "onAttachedToWindow", "onDetachedFromWindow", "onDeviceProvideChanged", "Landroid/app/Activity;", "activity", "onActivityStarted", "(Landroid/app/Activity;)V", "onActivityResumed", "onActivityPaused", "onActivityStopped", "onActivityDestroyed", "openOverlay", "openOverlayFromEdgeHint", "animate", "hideOverlay", "", "(I)V", "closeTool", "prepareForActivityLaunch", "requestRestoreAfterNotification", "requestRestoreAfterExternalWarmStart", "Landroid/content/Intent;", "intent", "Landroid/os/Bundle;", LauncherSettings.Favorites.OPTIONS, "launch", "(Landroid/content/Intent;Landroid/os/Bundle;)V", "launchFromMinusOne", "(Landroid/content/Intent;)V", "onScrollInteractionBegin", "onScrollInteractionEnd", NotificationCompat.CATEGORY_PROGRESS, "rtl", "onScrollChange", "(FZ)V", "velocity", "onFlingVelocity", "Landroid/view/MotionEvent;", "event", "scrollProgress", "onOverlayMotionEvent", "(Landroid/view/MotionEvent;F)V", "Lcom/android/systemui/plugins/shared/LauncherOverlayManager$LauncherOverlayCallbacks;", "callbacks", "setOverlayCallbacks", "(Lcom/android/systemui/plugins/shared/LauncherOverlayManager$LauncherOverlayCallbacks;)V", "isOverlayOpen", "()Z", "dispatchDefaultHomePromptIfPending", "handleBack", "Lapp/lawnchair/LawnchairLauncher;", "Landroid/view/WindowManager;", "windowManager", "Landroid/view/WindowManager;", "Landroid/app/KeyguardManager;", "keyguardManager", "Landroid/app/KeyguardManager;", "Landroid/os/PowerManager;", "powerManager", "Landroid/os/PowerManager;", "Lcom/neeeex/eraser/launcher/contract/ToolPanel;", "panel", "Lcom/neeeex/eraser/launcher/contract/ToolPanel;", "Lcom/neeeex/eraser/launcher/tool/ToolOverlayManager$ToolOverlayContainer;", "container", "Lcom/neeeex/eraser/launcher/tool/ToolOverlayManager$ToolOverlayContainer;", "Landroid/widget/FrameLayout;", "appOpenAdRenderHost", "Landroid/widget/FrameLayout;", "appOpenAdContentHost", "Landroid/view/WindowManager$LayoutParams;", "layoutParams", "Landroid/view/WindowManager$LayoutParams;", "Lcom/android/systemui/plugins/shared/LauncherOverlayManager$LauncherOverlayCallbacks;", "Landroid/animation/ValueAnimator;", "animator", "Landroid/animation/ValueAnimator;", "F", "flingVelocity", "isRtl", "Z", "attached", "interactive", "visible", "restoreOverlayOnResume", "restoreOverlayAfterLock", "overlayClosing", "restoreAfterExternalWarmStartNeedsPause", "defaultHomePromptDispatchScheduled", "destroyed", "motionLayerGeneration", "I", "Landroid/window/OnBackInvokedDispatcher;", "overlayBackDispatcher", "Landroid/window/OnBackInvokedDispatcher;", "Landroid/window/OnBackInvokedCallback;", "overlayBackCallback", "Landroid/window/OnBackInvokedCallback;", "minusOneSwipeStartedFromHome", "showMinusOneSwipeAdAfterSettle", "minusOneSwipeAdShowing", "getActivity", "()Landroid/app/Activity;", "Companion", "ToolOverlayContainer", "launcher_lawnWithQuickstepProductionRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class ToolOverlayManager implements LauncherOverlayManager, LauncherOverlayManager.LauncherOverlay, ToolHost {
    private static final int ACTIVE_FLAGS = 768;
    private static final float CLOSED_PROGRESS_EPSILON = 0.001f;
    private static final long DEFAULT_ANIMATION_DURATION = 240;
    private static final long DEFAULT_HOME_PROMPT_FOCUS_RELEASE_MS = 100;
    private static final long DEFAULT_HOME_PROMPT_INTERACTION_FALLBACK_MS = 500;
    private static final int EDGE_TO_EDGE_SYSTEM_UI_FLAGS = 1792;
    private static final float MIN_OPEN_FLING_VELOCITY = 100.0f;
    private static final float OPEN_THRESHOLD = 0.45f;
    private static final int PASSIVE_FLAGS = 131864;
    private static final String TAG = "ToolOverlayManager";
    private ValueAnimator animator;
    private final FrameLayout appOpenAdContentHost;
    private final FrameLayout appOpenAdRenderHost;
    private boolean attached;
    private LauncherOverlayManager.LauncherOverlayCallbacks callbacks;
    private final ToolOverlayContainer container;
    private boolean defaultHomePromptDispatchScheduled;
    private boolean destroyed;
    private float flingVelocity;
    private boolean interactive;
    private boolean isRtl;
    private final KeyguardManager keyguardManager;
    private final LawnchairLauncher launcher;
    private WindowManager.LayoutParams layoutParams;
    private boolean minusOneSwipeAdShowing;
    private boolean minusOneSwipeStartedFromHome;
    private int motionLayerGeneration;
    private OnBackInvokedCallback overlayBackCallback;
    private OnBackInvokedDispatcher overlayBackDispatcher;
    private boolean overlayClosing;
    private final ToolPanel panel;
    private final PowerManager powerManager;
    private float progress;
    private boolean restoreAfterExternalWarmStartNeedsPause;
    private boolean restoreOverlayAfterLock;
    private boolean restoreOverlayOnResume;
    private boolean showMinusOneSwipeAdAfterSettle;
    private boolean visible;
    private final WindowManager windowManager;
    private static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    @Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0082\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u000f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0011\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0011\u0010\u0010R\u0014\u0010\u0013\u001a\u00020\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0016\u001a\u00020\u00158\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u0016\u0010\u0018\u001a\u00020\u00158\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0018\u0010\u0017R\u0016\u0010\u0019\u001a\u00020\u00158\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0019\u0010\u0017R\u0016\u0010\u001a\u001a\u00020\u000b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u0018\u0010\u001d\u001a\u0004\u0018\u00010\u001c8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001d\u0010\u001e¨\u0006\u001f"}, d2 = {"Lcom/neeeex/eraser/launcher/tool/ToolOverlayManager$ToolOverlayContainer;", "Landroid/widget/FrameLayout;", "Landroid/content/Context;", "context", "<init>", "(Lcom/neeeex/eraser/launcher/tool/ToolOverlayManager;Landroid/content/Context;)V", "Lfl/m0;", "recycleTracker", "()V", "Landroid/view/KeyEvent;", "event", "", "dispatchKeyEvent", "(Landroid/view/KeyEvent;)Z", "Landroid/view/MotionEvent;", "onInterceptTouchEvent", "(Landroid/view/MotionEvent;)Z", "onTouchEvent", "", "touchSlop", "I", "", "downX", "F", "downY", "startProgress", "dragging", "Z", "Landroid/view/VelocityTracker;", "velocityTracker", "Landroid/view/VelocityTracker;", "launcher_lawnWithQuickstepProductionRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public final class ToolOverlayContainer extends FrameLayout {
        private float downX;
        private float downY;
        private boolean dragging;
        private float startProgress;
        final /* synthetic */ ToolOverlayManager this$0;
        private final int touchSlop;
        private VelocityTracker velocityTracker;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ToolOverlayContainer(ToolOverlayManager toolOverlayManager, Context context) {
            super(context);
            context.getClass();
            this.this$0 = toolOverlayManager;
            this.touchSlop = ViewConfiguration.get(context).getScaledTouchSlop();
            this.startProgress = 1.0f;
            setBackgroundColor(0);
            setClickable(true);
            setSystemUiVisibility(ToolOverlayManager.EDGE_TO_EDGE_SYSTEM_UI_FLAGS);
        }

        private final void recycleTracker() {
            VelocityTracker velocityTracker = this.velocityTracker;
            if (velocityTracker != null) {
                velocityTracker.recycle();
            }
            this.velocityTracker = null;
        }

        @Override // android.view.ViewGroup, android.view.View
        public boolean dispatchKeyEvent(KeyEvent event) {
            event.getClass();
            return (event.getKeyCode() == 4 && event.getAction() == 1) ? this.this$0.handleBack() : super.dispatchKeyEvent(event);
        }

        /* JADX WARN: Code duplicated, block: B:27:0x005a  */
        @Override // android.view.ViewGroup
        public boolean onInterceptTouchEvent(MotionEvent event) {
            event.getClass();
            int actionMasked = event.getActionMasked();
            if (actionMasked == 0) {
                this.downX = event.getX();
                this.downY = event.getY();
                this.startProgress = this.this$0.progress;
                this.dragging = false;
                VelocityTracker velocityTracker = this.velocityTracker;
                if (velocityTracker != null) {
                    velocityTracker.recycle();
                }
                VelocityTracker velocityTrackerObtain = VelocityTracker.obtain();
                velocityTrackerObtain.addMovement(event);
                this.velocityTracker = velocityTrackerObtain;
            } else if (actionMasked == 1) {
                recycleTracker();
            } else if (actionMasked == 2) {
                VelocityTracker velocityTracker2 = this.velocityTracker;
                if (velocityTracker2 != null) {
                    velocityTracker2.addMovement(event);
                }
                float x10 = event.getX() - this.downX;
                float y10 = event.getY() - this.downY;
                if (!this.this$0.isRtl ? x10 < 0.0f : x10 > 0.0f) {
                    if (Math.abs(x10) > this.touchSlop && Math.abs(x10) > Math.abs(y10)) {
                        this.dragging = true;
                        this.this$0.beginPanelDrag();
                        return true;
                    }
                }
            } else if (actionMasked == 3) {
                recycleTracker();
            }
            return false;
        }

        @Override // android.view.View
        public boolean onTouchEvent(MotionEvent event) {
            event.getClass();
            if (!this.dragging) {
                return super.onTouchEvent(event);
            }
            VelocityTracker velocityTracker = this.velocityTracker;
            if (velocityTracker != null) {
                velocityTracker.addMovement(event);
            }
            int actionMasked = event.getActionMasked();
            if (actionMasked == 1) {
                VelocityTracker velocityTracker2 = this.velocityTracker;
                if (velocityTracker2 != null) {
                    velocityTracker2.computeCurrentVelocity(1000);
                }
                ToolOverlayManager toolOverlayManager = this.this$0;
                VelocityTracker velocityTracker3 = this.velocityTracker;
                toolOverlayManager.flingVelocity = velocityTracker3 != null ? velocityTracker3.getXVelocity() : 0.0f;
                recycleTracker();
                this.dragging = false;
                this.this$0.onScrollInteractionEnd();
            } else if (actionMasked == 2) {
                Integer numValueOf = Integer.valueOf(getWidth());
                if (numValueOf.intValue() <= 0) {
                    numValueOf = null;
                }
                int iIntValue = numValueOf != null ? numValueOf.intValue() : getResources().getDisplayMetrics().widthPixels;
                float x10 = event.getX() - this.downX;
                if (this.this$0.isRtl) {
                    x10 = -x10;
                }
                this.this$0.updateProgress(this.startProgress + (x10 / iIntValue));
            } else if (actionMasked == 3) {
                this.this$0.flingVelocity = 0.0f;
                recycleTracker();
                this.dragging = false;
                this.this$0.minusOneSwipeStartedFromHome = false;
                this.this$0.onScrollInteractionEnd();
            }
            return true;
        }
    }

    public ToolOverlayManager(LawnchairLauncher lawnchairLauncher) {
        lawnchairLauncher.getClass();
        this.launcher = lawnchairLauncher;
        Object systemService = lawnchairLauncher.getSystemService(WindowManager.class);
        if (systemService == null) {
            gq.e.a("Required value was null.");
            throw null;
        }
        this.windowManager = (WindowManager) systemService;
        this.keyguardManager = (KeyguardManager) lawnchairLauncher.getSystemService(KeyguardManager.class);
        this.powerManager = (PowerManager) lawnchairLauncher.getSystemService(PowerManager.class);
        ToolPanel toolPanelCreate = ToolRegistry.INSTANCE.create(lawnchairLauncher, this);
        this.panel = toolPanelCreate;
        ToolOverlayContainer toolOverlayContainer = new ToolOverlayContainer(this, lawnchairLauncher);
        this.container = toolOverlayContainer;
        FrameLayout frameLayout = new FrameLayout(lawnchairLauncher);
        this.appOpenAdRenderHost = frameLayout;
        FrameLayout frameLayout2 = new FrameLayout(lawnchairLauncher);
        frameLayout2.setId(R.id.content);
        frameLayout2.setClickable(false);
        frameLayout2.setFocusable(false);
        frameLayout2.setImportantForAccessibility(2);
        frameLayout2.addView(frameLayout, new FrameLayout.LayoutParams(-1, -1));
        this.appOpenAdContentHost = frameLayout2;
        this.isRtl = Utilities.isRtl(lawnchairLauncher.getResources());
        ViewParent parent = toolPanelCreate.getView().getParent();
        ViewGroup viewGroup = parent instanceof ViewGroup ? (ViewGroup) parent : null;
        if (viewGroup != null) {
            viewGroup.removeView(toolPanelCreate.getView());
        }
        toolOverlayContainer.addView(toolPanelCreate.getView(), new FrameLayout.LayoutParams(-1, -1));
        toolOverlayContainer.addView(frameLayout2, new FrameLayout.LayoutParams(-1, -1));
        lawnchairLauncher.setAppOpenAdContentHost(frameLayout2);
        toolPanelCreate.onHostCreate();
    }

    private final void applyProgress(float value) {
        Integer numValueOf = Integer.valueOf(this.container.getWidth());
        if (numValueOf.intValue() <= 0) {
            numValueOf = null;
        }
        this.container.setTranslationX((this.isRtl ? 1.0f : -1.0f) * (numValueOf != null ? numValueOf.intValue() : this.launcher.getResources().getDisplayMetrics().widthPixels) * (1.0f - q.o(value, 0.0f, 1.0f)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void attachWindow() {
        if (this.attached || this.destroyed) {
            return;
        }
        View decorView = this.launcher.getWindow().getDecorView();
        decorView.getClass();
        IBinder windowToken = decorView.getWindowToken();
        if (windowToken == null) {
            decorView.post(new Runnable() { // from class: com.neeeex.eraser.launcher.tool.b
                @Override // java.lang.Runnable
                public final void run() {
                    this.f65159a.attachWindow();
                }
            });
            return;
        }
        WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams(-1, -1, 1003, this.interactive ? ACTIVE_FLAGS : PASSIVE_FLAGS, -3);
        layoutParams.token = windowToken;
        layoutParams.gravity = 8388659;
        layoutParams.softInputMode = 16;
        layoutParams.setTitle("Launcher minus-one tool panel");
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 28) {
            layoutParams.layoutInDisplayCutoutMode = 1;
        }
        try {
            this.windowManager.addView(this.container, layoutParams);
            this.layoutParams = layoutParams;
            this.attached = true;
            this.container.post(new Runnable() { // from class: com.neeeex.eraser.launcher.tool.c
                @Override // java.lang.Runnable
                public final void run() {
                    ToolOverlayManager.h(this.f65160a);
                }
            });
            if (i10 >= 33) {
                this.container.post(new j(this));
            }
            this.launcher.setLauncherOverlay(this);
        } catch (WindowManager.BadTokenException unused) {
        }
    }

    public static void b(ToolOverlayManager toolOverlayManager) {
        toolOverlayManager.applyProgress(toolOverlayManager.progress);
    }

    private final void beginMotionLayer() {
        this.motionLayerGeneration++;
        if (this.container.getLayerType() != 2) {
            this.container.setLayerType(2, null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void beginPanelDrag() {
        this.overlayClosing = false;
        cancelAnimation();
        this.flingVelocity = 0.0f;
    }

    public static void c(int i10, ToolOverlayManager toolOverlayManager) {
        if (i10 == toolOverlayManager.motionLayerGeneration && toolOverlayManager.animator == null) {
            toolOverlayManager.container.setLayerType(0, null);
        }
    }

    private final void cancelAnimation() {
        ValueAnimator valueAnimator = this.animator;
        if (valueAnimator == null) {
            return;
        }
        this.animator = null;
        valueAnimator.cancel();
    }

    public static void d(ToolOverlayManager toolOverlayManager, Intent intent) {
        if (toolOverlayManager.destroyed) {
            return;
        }
        toolOverlayManager.prepareForActivityLaunch();
        toolOverlayManager.launcher.startActivity(intent);
        toolOverlayManager.launcher.overridePendingTransition(0, 0);
    }

    private final void detachWindow() {
        if (this.attached) {
            updateStatusBarAppearance(false);
            if (Build.VERSION.SDK_INT >= 33) {
                unregisterOverlayBackCallback();
            }
            try {
                this.windowManager.removeViewImmediate(this.container);
            } catch (IllegalArgumentException unused) {
            } finally {
                this.attached = false;
                this.layoutParams = null;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void dispatchDefaultHomePromptIfPending$lambda$0$0(ToolOverlayManager toolOverlayManager) {
        if (toolOverlayManager.destroyed || !toolOverlayManager.launcher.hasBeenResumed() || toolOverlayManager.progress <= 0.0f) {
            return;
        }
        toolOverlayManager.setInteractive(true);
    }

    public static void e(ToolOverlayManager toolOverlayManager) {
        if (toolOverlayManager.destroyed || !toolOverlayManager.launcher.hasBeenResumed()) {
            return;
        }
        toolOverlayManager.restoreOverlayIfRequested();
    }

    public static m0 f(ToolOverlayManager toolOverlayManager) {
        toolOverlayManager.appOpenAdRenderHost.removeAllViews();
        toolOverlayManager.minusOneSwipeAdShowing = false;
        return m0.f80959a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void finishSettle(float target) {
        boolean z10 = target == 1.0f && this.showMinusOneSwipeAdAfterSettle;
        this.showMinusOneSwipeAdAfterSettle = false;
        updateProgress(target);
        if (target == 0.0f) {
            setVisible(false);
            setInteractive(false);
        } else {
            setVisible(true);
            if (this.launcher.hasPendingDefaultHomePromptAfterMinusOne$launcher_lawnWithQuickstepProductionRelease()) {
                dispatchDefaultHomePromptIfPending();
            } else {
                setInteractive(true);
            }
        }
        releaseMotionLayer();
        if (z10) {
            showMinusOneSwipeAdIfEligible();
        }
    }

    public static void h(ToolOverlayManager toolOverlayManager) {
        toolOverlayManager.applyProgress(toolOverlayManager.progress);
    }

    public static m0 i(ToolOverlayManager toolOverlayManager) {
        toolOverlayManager.appOpenAdRenderHost.removeAllViews();
        toolOverlayManager.minusOneSwipeAdShowing = false;
        if (toolOverlayManager.launcher.hasBeenResumed()) {
            toolOverlayManager.restoreOverlayOnResume = false;
        }
        return m0.f80959a;
    }

    public static void j(final ToolOverlayManager toolOverlayManager) {
        toolOverlayManager.defaultHomePromptDispatchScheduled = false;
        if (toolOverlayManager.destroyed || toolOverlayManager.progress <= 0.0f) {
            return;
        }
        if (toolOverlayManager.launcher.launchPendingDefaultHomePromptFromMinusOne$launcher_lawnWithQuickstepProductionRelease()) {
            toolOverlayManager.container.postDelayed(new Runnable() { // from class: com.neeeex.eraser.launcher.tool.e
                @Override // java.lang.Runnable
                public final void run() {
                    ToolOverlayManager.dispatchDefaultHomePromptIfPending$lambda$0$0(this.f65163a);
                }
            }, 500L);
        } else {
            toolOverlayManager.setInteractive(true);
        }
    }

    public static m0 m(ToolOverlayManager toolOverlayManager) {
        toolOverlayManager.appOpenAdRenderHost.removeAllViews();
        toolOverlayManager.prepareForActivityLaunch();
        toolOverlayManager.minusOneSwipeAdShowing = true;
        return m0.f80959a;
    }

    public static void n(ToolOverlayManager toolOverlayManager) {
        toolOverlayManager.handleBack();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void registerOverlayBackCallback() {
        OnBackInvokedDispatcher onBackInvokedDispatcherFindOnBackInvokedDispatcher;
        if (this.attached && this.overlayBackCallback == null && (onBackInvokedDispatcherFindOnBackInvokedDispatcher = this.container.findOnBackInvokedDispatcher()) != null) {
            OnBackInvokedCallback onBackInvokedCallback = new OnBackInvokedCallback() { // from class: com.neeeex.eraser.launcher.tool.g
                @Override // android.window.OnBackInvokedCallback
                public final void onBackInvoked() {
                    ToolOverlayManager.n(this.f65165a);
                }
            };
            onBackInvokedDispatcherFindOnBackInvokedDispatcher.registerOnBackInvokedCallback(1000000, onBackInvokedCallback);
            this.overlayBackDispatcher = onBackInvokedDispatcherFindOnBackInvokedDispatcher;
            this.overlayBackCallback = onBackInvokedCallback;
        }
    }

    private final void releaseMotionLayer() {
        final int i10 = this.motionLayerGeneration;
        this.container.postOnAnimation(new Runnable() { // from class: com.neeeex.eraser.launcher.tool.d
            @Override // java.lang.Runnable
            public final void run() {
                ToolOverlayManager.c(i10, this);
            }
        });
    }

    private final void rememberOverlayBeforeLock() {
        KeyguardManager keyguardManager;
        if (!this.visible || this.progress <= 0.0f || this.overlayClosing) {
            return;
        }
        PowerManager powerManager = this.powerManager;
        if ((powerManager == null || powerManager.isInteractive()) && ((keyguardManager = this.keyguardManager) == null || !keyguardManager.isKeyguardLocked())) {
            return;
        }
        this.restoreOverlayAfterLock = true;
    }

    private final void restoreOverlayIfRequested() {
        if ((this.restoreOverlayOnResume || this.restoreOverlayAfterLock) && !this.restoreAfterExternalWarmStartNeedsPause) {
            this.restoreOverlayOnResume = false;
            this.restoreOverlayAfterLock = false;
            this.restoreAfterExternalWarmStartNeedsPause = false;
            settleTo$default(this, 1.0f, 0L, false, 4, null);
        }
    }

    private final void setInteractive(boolean value) {
        WindowManager.LayoutParams layoutParams;
        if (this.interactive == value) {
            return;
        }
        this.interactive = value;
        if (this.attached && (layoutParams = this.layoutParams) != null) {
            layoutParams.flags = value ? ACTIVE_FLAGS : PASSIVE_FLAGS;
            try {
                this.windowManager.updateViewLayout(this.container, layoutParams);
            } catch (IllegalArgumentException unused) {
            }
            if (!value || Build.VERSION.SDK_INT < 33) {
                return;
            }
            this.container.post(new j(this));
        }
    }

    private final void setVisible(boolean value) {
        if (this.visible == value) {
            return;
        }
        this.visible = value;
        updateStatusBarAppearance(value);
        this.panel.onToolVisibilityChanged(value);
    }

    private final void settleTo(float target, long duration, boolean showSwipeAdOnFinish) {
        attachWindow();
        cancelAnimation();
        beginMotionLayer();
        this.showMinusOneSwipeAdAfterSettle = showSwipeAdOnFinish;
        final float fO = q.o(target, 0.0f, 1.0f);
        this.overlayClosing = fO == 0.0f;
        if (fO > 0.0f) {
            setVisible(true);
        }
        if (duration == 0 || Math.abs(this.progress - fO) < CLOSED_PROGRESS_EPSILON) {
            updateProgress(fO);
            finishSettle(fO);
            return;
        }
        final ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(this.progress, fO);
        this.animator = valueAnimatorOfFloat;
        valueAnimatorOfFloat.setDuration(duration);
        valueAnimatorOfFloat.setInterpolator(new DecelerateInterpolator());
        valueAnimatorOfFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.neeeex.eraser.launcher.tool.h
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                ToolOverlayManager.settleTo$lambda$0$0(this.f65166a, valueAnimator);
            }
        });
        valueAnimatorOfFloat.addListener(new AnimatorListenerAdapter() { // from class: com.neeeex.eraser.launcher.tool.ToolOverlayManager$settleTo$1$2
            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public void onAnimationEnd(Animator animation) {
                animation.getClass();
                if (this.this$0.animator != valueAnimatorOfFloat) {
                    return;
                }
                this.this$0.animator = null;
                this.this$0.finishSettle(fO);
            }
        });
        valueAnimatorOfFloat.start();
    }

    public static /* synthetic */ void settleTo$default(ToolOverlayManager toolOverlayManager, float f10, long j10, boolean z10, int i10, Object obj) {
        if ((i10 & 4) != 0) {
            z10 = false;
        }
        toolOverlayManager.settleTo(f10, j10, z10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void settleTo$lambda$0$0(ToolOverlayManager toolOverlayManager, ValueAnimator valueAnimator) {
        valueAnimator.getClass();
        Object animatedValue = valueAnimator.getAnimatedValue();
        animatedValue.getClass();
        toolOverlayManager.updateProgress(((Float) animatedValue).floatValue());
    }

    private final void showMinusOneSwipeAdIfEligible() {
        if (this.minusOneSwipeAdShowing) {
            return;
        }
        OpenSceneAdPolicy openSceneAdPolicy = OpenSceneAdPolicy.INSTANCE;
        if (openSceneAdPolicy.canShowOnMinusOneSwipe()) {
            openSceneAdPolicy.tryShowOnMinusOneSwipe(this.launcher, new Function0() { // from class: com.neeeex.eraser.launcher.tool.l
                @Override // p003kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return ToolOverlayManager.m(this.f65170a);
                }
            }, new Function0() { // from class: com.neeeex.eraser.launcher.tool.m
                @Override // p003kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return ToolOverlayManager.i(this.f65171a);
                }
            }, new Function0() { // from class: com.neeeex.eraser.launcher.tool.n
                @Override // p003kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return ToolOverlayManager.f(this.f65172a);
                }
            });
        }
    }

    private final void unregisterOverlayBackCallback() {
        OnBackInvokedDispatcher onBackInvokedDispatcher = this.overlayBackDispatcher;
        OnBackInvokedCallback onBackInvokedCallback = this.overlayBackCallback;
        this.overlayBackDispatcher = null;
        this.overlayBackCallback = null;
        if (onBackInvokedDispatcher == null || onBackInvokedCallback == null) {
            return;
        }
        onBackInvokedDispatcher.unregisterOnBackInvokedCallback(onBackInvokedCallback);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void updateProgress(float value) {
        float fO = q.o(value, 0.0f, 1.0f);
        this.progress = fO;
        if (fO > 0.0f) {
            setVisible(true);
        }
        applyProgress(this.progress);
        LauncherOverlayManager.LauncherOverlayCallbacks launcherOverlayCallbacks = this.callbacks;
        if (launcherOverlayCallbacks != null) {
            launcherOverlayCallbacks.onOverlayScrollChanged(this.progress);
        }
        this.panel.onToolScroll(this.progress);
    }

    private final void updateStatusBarAppearance(boolean useDarkIcons) {
        this.launcher.getSystemUiController().updateUiState(5, useDarkIcons ? 4 : 0);
        this.container.setSystemUiVisibility(useDarkIcons ? 9984 : EDGE_TO_EDGE_SYSTEM_UI_FLAGS);
    }

    @Override // com.neeeex.eraser.launcher.contract.ToolHost
    public void closeTool(boolean animate) {
        hideOverlay(animate);
    }

    public final void dispatchDefaultHomePromptIfPending() {
        if (this.destroyed || this.progress <= 0.0f || this.defaultHomePromptDispatchScheduled || !this.launcher.hasPendingDefaultHomePromptAfterMinusOne$launcher_lawnWithQuickstepProductionRelease()) {
            return;
        }
        this.defaultHomePromptDispatchScheduled = true;
        setInteractive(false);
        this.container.postDelayed(new Runnable() { // from class: com.neeeex.eraser.launcher.tool.f
            @Override // java.lang.Runnable
            public final void run() {
                ToolOverlayManager.j(this.f65164a);
            }
        }, 100L);
    }

    @Override // com.neeeex.eraser.launcher.contract.ToolHost
    public Activity getActivity() {
        return this.launcher;
    }

    public final boolean handleBack() {
        if (this.progress <= 0.0f) {
            return false;
        }
        if (!this.panel.onBackPressed()) {
            hideOverlay(true);
        }
        return true;
    }

    @Override // com.android.systemui.plugins.shared.LauncherOverlayManager
    public void hideOverlay(boolean animate) {
        this.restoreOverlayAfterLock = false;
        settleTo$default(this, 0.0f, animate ? DEFAULT_ANIMATION_DURATION : 0L, false, 4, null);
    }

    public final boolean isOverlayOpen() {
        return this.progress > 0.0f;
    }

    @Override // com.neeeex.eraser.launcher.contract.ToolHost
    public void launch(Intent intent, Bundle options) {
        intent.getClass();
        prepareForActivityLaunch();
        LawnchairLauncher lawnchairLauncher = this.launcher;
        if (options == null) {
            lawnchairLauncher.startActivity(intent);
        } else {
            lawnchairLauncher.startActivity(intent, options);
        }
    }

    public final void launchFromMinusOne(final Intent intent) {
        intent.getClass();
        settleTo$default(this, 1.0f, 0L, false, 4, null);
        this.container.postOnAnimation(new Runnable() { // from class: com.neeeex.eraser.launcher.tool.a
            @Override // java.lang.Runnable
            public final void run() {
                ToolOverlayManager.d(this.f65157a, intent);
            }
        });
    }

    @Override // com.android.systemui.plugins.shared.LauncherOverlayManager, android.app.Application.ActivityLifecycleCallbacks
    public void onActivityDestroyed(Activity activity) {
        activity.getClass();
        if (this.destroyed) {
            return;
        }
        this.destroyed = true;
        this.launcher.setAppOpenAdContentHost(null);
        this.appOpenAdRenderHost.removeAllViews();
        this.defaultHomePromptDispatchScheduled = false;
        ValueAnimator valueAnimator = this.animator;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        this.animator = null;
        this.launcher.setLauncherOverlay(null);
        detachWindow();
        this.panel.onHostDestroy();
    }

    @Override // com.android.systemui.plugins.shared.LauncherOverlayManager, android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPaused(Activity activity) {
        activity.getClass();
        rememberOverlayBeforeLock();
        if (this.restoreAfterExternalWarmStartNeedsPause) {
            this.restoreAfterExternalWarmStartNeedsPause = false;
        }
        this.panel.onHostPause();
    }

    @Override // com.android.systemui.plugins.shared.LauncherOverlayManager, android.app.Application.ActivityLifecycleCallbacks
    public void onActivityResumed(Activity activity) {
        activity.getClass();
        this.panel.onHostResume();
        if (!this.restoreAfterExternalWarmStartNeedsPause) {
            restoreOverlayIfRequested();
        }
        if (!this.visible || this.progress <= 0.0f || this.defaultHomePromptDispatchScheduled) {
            return;
        }
        if (this.launcher.hasPendingDefaultHomePromptAfterMinusOne$launcher_lawnWithQuickstepProductionRelease()) {
            dispatchDefaultHomePromptIfPending();
        } else {
            setInteractive(true);
        }
    }

    @Override // com.android.systemui.plugins.shared.LauncherOverlayManager, android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStarted(Activity activity) {
        activity.getClass();
        this.panel.onHostStart();
    }

    @Override // com.android.systemui.plugins.shared.LauncherOverlayManager, android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStopped(Activity activity) {
        activity.getClass();
        rememberOverlayBeforeLock();
        if (!this.restoreOverlayOnResume && !this.restoreOverlayAfterLock) {
            hideOverlay(0);
        }
        this.panel.onHostStop();
    }

    @Override // com.android.systemui.plugins.shared.LauncherOverlayManager
    public void onAttachedToWindow() {
        attachWindow();
    }

    @Override // com.android.systemui.plugins.shared.LauncherOverlayManager
    public void onDetachedFromWindow() {
        detachWindow();
    }

    @Override // com.android.systemui.plugins.shared.LauncherOverlayManager
    public void onDeviceProvideChanged() {
        this.isRtl = Utilities.isRtl(this.launcher.getResources());
        this.container.post(new Runnable() { // from class: com.neeeex.eraser.launcher.tool.i
            @Override // java.lang.Runnable
            public final void run() {
                ToolOverlayManager.b(this.f65167a);
            }
        });
    }

    @Override // com.android.systemui.plugins.shared.LauncherOverlayManager.LauncherOverlay, com.android.systemui.plugins.shared.LauncherOverlayManager.LauncherOverlayTouchProxy
    public void onFlingVelocity(float velocity) {
        this.flingVelocity = velocity;
    }

    @Override // com.android.systemui.plugins.shared.LauncherOverlayManager.LauncherOverlay, com.android.systemui.plugins.shared.LauncherOverlayManager.LauncherOverlayTouchProxy
    public void onOverlayMotionEvent(MotionEvent event, float scrollProgress) {
        event.getClass();
        this.isRtl = Utilities.isRtl(this.launcher.getResources());
        int actionMasked = event.getActionMasked();
        if (actionMasked == 0) {
            onScrollInteractionBegin();
            return;
        }
        if (actionMasked == 1) {
            onScrollInteractionEnd();
            return;
        }
        if (actionMasked == 2) {
            onScrollChange(scrollProgress, this.isRtl);
        } else {
            if (actionMasked != 3) {
                return;
            }
            this.minusOneSwipeStartedFromHome = false;
            onScrollInteractionEnd();
        }
    }

    @Override // com.android.systemui.plugins.shared.LauncherOverlayManager.LauncherOverlay
    public void onScrollChange(float progress, boolean rtl) {
        this.isRtl = rtl;
        updateProgress(progress);
    }

    @Override // com.android.systemui.plugins.shared.LauncherOverlayManager.LauncherOverlay
    public void onScrollInteractionBegin() {
        this.overlayClosing = false;
        this.minusOneSwipeStartedFromHome = this.progress <= CLOSED_PROGRESS_EPSILON;
        cancelAnimation();
        beginMotionLayer();
        this.flingVelocity = 0.0f;
        setInteractive(false);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x000f  */
    @Override // com.android.systemui.plugins.shared.LauncherOverlayManager.LauncherOverlay
    public void onScrollInteractionEnd() {
        float f10;
        boolean z10 = this.isRtl;
        float f11 = this.flingVelocity;
        if (z10) {
            f11 = -f11;
        }
        if (f11 > 100.0f) {
            f10 = 1.0f;
        } else {
            f10 = 0.0f;
            if (f11 >= -100.0f && this.progress >= OPEN_THRESHOLD) {
                f10 = 1.0f;
            }
        }
        boolean z11 = this.minusOneSwipeStartedFromHome && f10 == 1.0f;
        this.minusOneSwipeStartedFromHome = false;
        settleTo(f10, DEFAULT_ANIMATION_DURATION, z11);
    }

    @Override // com.android.systemui.plugins.shared.LauncherOverlayManager
    public void openOverlay() {
        settleTo$default(this, 1.0f, DEFAULT_ANIMATION_DURATION, false, 4, null);
    }

    public final void openOverlayFromEdgeHint() {
        settleTo(1.0f, DEFAULT_ANIMATION_DURATION, true);
    }

    @Override // com.neeeex.eraser.launcher.contract.ToolHost
    public void prepareForActivityLaunch() {
        this.restoreOverlayOnResume = this.visible && this.progress > 0.0f;
        this.restoreAfterExternalWarmStartNeedsPause = false;
    }

    public final void requestRestoreAfterExternalWarmStart() {
        this.restoreOverlayOnResume = true;
        this.restoreAfterExternalWarmStartNeedsPause = true;
    }

    public final void requestRestoreAfterNotification() {
        this.restoreOverlayOnResume = true;
        this.restoreAfterExternalWarmStartNeedsPause = false;
        if (this.launcher.hasBeenResumed()) {
            restoreOverlayIfRequested();
        } else {
            this.launcher.getWindow().getDecorView().post(new Runnable() { // from class: com.neeeex.eraser.launcher.tool.k
                @Override // java.lang.Runnable
                public final void run() {
                    ToolOverlayManager.e(this.f65169a);
                }
            });
        }
    }

    @Override // com.android.systemui.plugins.shared.LauncherOverlayManager.LauncherOverlay, com.android.systemui.plugins.shared.LauncherOverlayManager.LauncherOverlayTouchProxy
    public void setOverlayCallbacks(LauncherOverlayManager.LauncherOverlayCallbacks callbacks) {
        this.callbacks = callbacks;
        if (callbacks != null) {
            callbacks.onOverlayScrollChanged(this.progress);
        }
    }

    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0007X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0007X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u000bX\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000bX\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u000fX\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u000fX\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0012"}, d2 = {"Lcom/neeeex/eraser/launcher/tool/ToolOverlayManager$Companion;", "", "<init>", "()V", "TAG", "", "DEFAULT_ANIMATION_DURATION", "", "DEFAULT_HOME_PROMPT_FOCUS_RELEASE_MS", "DEFAULT_HOME_PROMPT_INTERACTION_FALLBACK_MS", "OPEN_THRESHOLD", "", "MIN_OPEN_FLING_VELOCITY", "CLOSED_PROGRESS_EPSILON", "EDGE_TO_EDGE_SYSTEM_UI_FLAGS", "", "ACTIVE_FLAGS", "PASSIVE_FLAGS", "launcher_lawnWithQuickstepProductionRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(p003kotlin.jvm.internal.m mVar) {
            this();
        }

        private Companion() {
        }
    }

    @Override // com.android.systemui.plugins.shared.LauncherOverlayManager
    public void hideOverlay(int duration) {
        this.restoreOverlayAfterLock = false;
        settleTo$default(this, 0.0f, q.g(duration, 0L), false, 4, null);
    }
}