package app.lawnchair;

import android.animation.AnimatorSet;
import android.app.ActivityOptions;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.pm.PackageManager;
import android.graphics.Rect;
import android.graphics.RectF;
import android.os.Build;
import android.os.Bundle;
import android.os.Process;
import android.util.ArrayMap;
import android.util.Pair;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import androidx.core.app.NotificationCompat;
import androidx.p002lifecycle.LifecycleOwnerKt;
import app.lawnchair.data.AppDatabase;
import app.lawnchair.factory.LawnchairWidgetHolder;
import app.lawnchair.theme.ThemeProvider;
import app.lawnchair.views.LawnchairFloatingSurfaceView;
import com.android.launcher3.AbstractFloatingView;
import com.android.launcher3.AutoInstallsLayout;
import com.android.launcher3.BubbleTextView;
import com.android.launcher3.CellLayout;
import com.android.launcher3.GestureNavContract;
import com.android.launcher3.InsettableFrameLayout;
import com.android.launcher3.Launcher;
import com.android.launcher3.LauncherAppState;
import com.android.launcher3.LauncherModel;
import com.android.launcher3.LauncherState;
import com.android.launcher3.OnBackPressedHandler;
import com.android.launcher3.R;
import com.android.launcher3.Utilities;
import com.android.launcher3.allapps.ActivityAllAppsContainerView;
import com.android.launcher3.celllayout.CellLayoutLayoutParams;
import com.android.launcher3.dragndrop.DragLayer;
import com.android.launcher3.icons.BitmapInfo;
import com.android.launcher3.icons.FastBitmapDrawable;
import com.android.launcher3.model.AddWorkspaceItemsTask;
import com.android.launcher3.model.AllAppsList;
import com.android.launcher3.model.BgDataModel;
import com.android.launcher3.model.ModelTaskController;
import com.android.launcher3.model.ModelWriter;
import com.android.launcher3.model.data.ItemInfo;
import com.android.launcher3.model.data.WorkspaceItemInfo;
import com.android.launcher3.popup.SystemShortcut;
import com.android.launcher3.shortcuts.DeepShortcutView;
import com.android.launcher3.statemanager.StateManager;
import com.android.launcher3.uioverrides.QuickstepLauncher;
import com.android.launcher3.uioverrides.states.AllAppsState;
import com.android.launcher3.uioverrides.states.BackgroundAppState;
import com.android.launcher3.uioverrides.states.OverviewState;
import com.android.launcher3.util.ActivityOptionsWrapper;
import com.android.launcher3.util.Executors;
import com.android.launcher3.util.IntSparseArrayMap;
import com.android.launcher3.util.ItemInflater;
import com.android.launcher3.util.RunnableList;
import com.android.launcher3.util.Themes;
import com.android.launcher3.util.TouchController;
import com.android.launcher3.views.ActivityContext;
import com.android.launcher3.views.OptionsPopupView;
import com.android.launcher3.widget.LauncherWidgetHolder;
import com.android.launcher3.widget.RoundedCornerEnforcement;
import com.android.systemui.plugins.shared.LauncherOverlayManager;
import com.android.systemui.shared.system.QuickStepContract;
import com.kieronquinn.app.smartspacer.sdk.client.SmartspacerClient;
import com.neeeex.eraser.R$string;
import com.neeeex.eraser.launcher.DefaultHomeOnboardingHelper;
import com.neeeex.eraser.launcher.DefaultHomeReminderView;
import com.neeeex.eraser.launcher.DefaultHomeStatusTracker;
import com.neeeex.eraser.launcher.DesktopRoutePolicy;
import com.neeeex.eraser.launcher.HomeBackPolicy;
import com.neeeex.eraser.launcher.LauncherRoutes;
import com.neeeex.eraser.launcher.MinusOneGuideHelper;
import com.neeeex.eraser.launcher.MinusOneRouteActivity;
import com.neeeex.eraser.launcher.NewUserDesktopFunnelTracker;
import com.neeeex.eraser.launcher.StartupStateStore;
import com.neeeex.eraser.launcher.ToolMinusOneEdgeHintView;
import com.neeeex.eraser.launcher.ToolMinusOneGuideView;
import com.neeeex.eraser.launcher.notification.LauncherFloatingNotification;
import com.neeeex.eraser.launcher.startup.HomeResolverPromptController;
import com.neeeex.eraser.launcher.startup.WorkspaceToolEntry;
import com.neeeex.eraser.launcher.tool.ToolOverlayManager;
import com.neeeex.eraser.module.main.SplashNEEEEXActivity;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.IntConsumer;
import java.util.stream.Stream;
import p003kotlin.Metadata;
import p003kotlin.jvm.functions.Function0;
import p003kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000à\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b&\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\b\u0003\n\u0002\b\u0003\n\u0002\b\u0003\n\u0002\b\u0003\n\u0002\b\u0003\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\n*\f¹\u0001¼\u0001¿\u0001Â\u0001Å\u0001È\u0001\b\u0007\u0018\u0000 \u0080\u00022\u00020\u0001:\u0002\u0081\u0002B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J]\u0010\u0012\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u0011\"\u0010\b\u0000\u0010\u0006*\u0004\u0018\u00010\u0004*\u0004\u0018\u00010\u00052\b\u0010\u0007\u001a\u0004\u0018\u00010\u00052\u0006\u0010\t\u001a\u00020\b2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\n2\b\b\u0002\u0010\u000e\u001a\u00020\r2\b\b\u0002\u0010\u0010\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u0017\u0010\u0016\u001a\u00020\r2\u0006\u0010\u0015\u001a\u00020\u0014H\u0002¢\u0006\u0004\b\u0016\u0010\u0017J\u0019\u0010\u001b\u001a\u00020\u001a2\b\u0010\u0019\u001a\u0004\u0018\u00010\u0018H\u0002¢\u0006\u0004\b\u001b\u0010\u001cJ\u000f\u0010\u001e\u001a\u00020\u001dH\u0002¢\u0006\u0004\b\u001e\u0010\u0003J\u000f\u0010\u001f\u001a\u00020\u001dH\u0002¢\u0006\u0004\b\u001f\u0010\u0003J\u000f\u0010 \u001a\u00020\u001dH\u0002¢\u0006\u0004\b \u0010\u0003J\u0017\u0010\"\u001a\u00020\u001d2\u0006\u0010!\u001a\u00020\u0014H\u0002¢\u0006\u0004\b\"\u0010#J\u001f\u0010&\u001a\u00020\u001d2\u0006\u0010$\u001a\u00020\r2\u0006\u0010%\u001a\u00020\rH\u0002¢\u0006\u0004\b&\u0010'J\u0017\u0010(\u001a\u00020\r2\u0006\u0010!\u001a\u00020\u0014H\u0002¢\u0006\u0004\b(\u0010\u0017J\u0017\u0010)\u001a\u00020\r2\u0006\u0010!\u001a\u00020\u0014H\u0002¢\u0006\u0004\b)\u0010\u0017J\u0017\u0010*\u001a\u00020\r2\u0006\u0010!\u001a\u00020\u0014H\u0002¢\u0006\u0004\b*\u0010\u0017J\u000f\u0010+\u001a\u00020\u001dH\u0002¢\u0006\u0004\b+\u0010\u0003J\u000f\u0010,\u001a\u00020\u001dH\u0002¢\u0006\u0004\b,\u0010\u0003J\u000f\u0010-\u001a\u00020\u001dH\u0002¢\u0006\u0004\b-\u0010\u0003J\u000f\u0010.\u001a\u00020\u001dH\u0002¢\u0006\u0004\b.\u0010\u0003J\u000f\u0010/\u001a\u00020\u001dH\u0002¢\u0006\u0004\b/\u0010\u0003J\u000f\u00100\u001a\u00020\u001dH\u0002¢\u0006\u0004\b0\u0010\u0003J\u000f\u00101\u001a\u00020\rH\u0002¢\u0006\u0004\b1\u00102J\u000f\u00103\u001a\u00020\u001dH\u0002¢\u0006\u0004\b3\u0010\u0003J\u000f\u00104\u001a\u00020\u001dH\u0002¢\u0006\u0004\b4\u0010\u0003J\u000f\u00105\u001a\u00020\u001dH\u0002¢\u0006\u0004\b5\u0010\u0003J\u000f\u00106\u001a\u00020\u001dH\u0002¢\u0006\u0004\b6\u0010\u0003J\u000f\u00107\u001a\u00020\u001dH\u0002¢\u0006\u0004\b7\u0010\u0003J\u000f\u00108\u001a\u00020\u001dH\u0002¢\u0006\u0004\b8\u0010\u0003J\u000f\u00109\u001a\u00020\u001dH\u0002¢\u0006\u0004\b9\u0010\u0003J\u0017\u0010;\u001a\u00020\u001d2\u0006\u0010:\u001a\u00020\u0018H\u0002¢\u0006\u0004\b;\u0010<J\u000f\u0010=\u001a\u00020\u001dH\u0002¢\u0006\u0004\b=\u0010\u0003J\u000f\u0010>\u001a\u00020\u001dH\u0002¢\u0006\u0004\b>\u0010\u0003J\u000f\u0010?\u001a\u00020\u001dH\u0002¢\u0006\u0004\b?\u0010\u0003J\u000f\u0010@\u001a\u00020\u001dH\u0002¢\u0006\u0004\b@\u0010\u0003J\u000f\u0010A\u001a\u00020\u001dH\u0002¢\u0006\u0004\bA\u0010\u0003J\u000f\u0010B\u001a\u00020\u0014H\u0002¢\u0006\u0004\bB\u0010CJ\u0017\u0010F\u001a\u00020\r2\u0006\u0010E\u001a\u00020DH\u0002¢\u0006\u0004\bF\u0010GJ\u000f\u0010H\u001a\u00020\u001dH\u0002¢\u0006\u0004\bH\u0010\u0003J\u001f\u0010L\u001a\u00020\u001d2\u0006\u0010J\u001a\u00020I2\u0006\u0010K\u001a\u00020\u000fH\u0002¢\u0006\u0004\bL\u0010MJ\u0019\u0010O\u001a\u00020\u001d2\b\u0010N\u001a\u0004\u0018\u00010\u000fH\u0002¢\u0006\u0004\bO\u0010PJ\u000f\u0010Q\u001a\u00020\u001dH\u0002¢\u0006\u0004\bQ\u0010\u0003J\u000f\u0010R\u001a\u00020\u001dH\u0002¢\u0006\u0004\bR\u0010\u0003J\u0019\u0010U\u001a\u00020\u001d2\b\u0010T\u001a\u0004\u0018\u00010SH\u0014¢\u0006\u0004\bU\u0010VJ#\u0010[\u001a\u00020\u001d2\u0012\u0010Z\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020Y0X0WH\u0016¢\u0006\u0004\b[\u0010\\J\u0019\u0010_\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030^0]H\u0016¢\u0006\u0004\b_\u0010`J\u000f\u0010a\u001a\u00020\u001dH\u0014¢\u0006\u0004\ba\u0010\u0003J\u0015\u0010d\u001a\b\u0012\u0004\u0012\u00020c0bH\u0016¢\u0006\u0004\bd\u0010eJ\u000f\u0010f\u001a\u00020\u001dH\u0016¢\u0006\u0004\bf\u0010\u0003J\u000f\u0010g\u001a\u00020\u001dH\u0016¢\u0006\u0004\bg\u0010\u0003J\u000f\u0010h\u001a\u00020\u001dH\u0014¢\u0006\u0004\bh\u0010\u0003J%\u0010j\u001a\u00020\u001d2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020D0\n2\u0006\u0010i\u001a\u00020\rH\u0016¢\u0006\u0004\bj\u0010kJ\u0019\u0010l\u001a\u00020\u001d2\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014H\u0014¢\u0006\u0004\bl\u0010#J\u000f\u0010m\u001a\u00020\u001dH\u0016¢\u0006\u0004\bm\u0010\u0003J\u001f\u0010q\u001a\u00020\u001d2\u0006\u0010o\u001a\u00020n2\u0006\u0010p\u001a\u00020nH\u0016¢\u0006\u0004\bq\u0010rJ\u000f\u0010t\u001a\u00020sH\u0014¢\u0006\u0004\bt\u0010uJ\u0017\u0010w\u001a\u00020\u001a2\u0006\u0010v\u001a\u00020\u000fH\u0016¢\u0006\u0004\bw\u0010xJ#\u0010y\u001a\u00020\u001a2\b\u0010\u0019\u001a\u0004\u0018\u00010\u00182\b\u0010E\u001a\u0004\u0018\u00010DH\u0016¢\u0006\u0004\by\u0010zJ-\u0010|\u001a\u0004\u0018\u00010{2\b\u0010\u0019\u001a\u0004\u0018\u00010\u00182\u0006\u0010\u0015\u001a\u00020\u00142\b\u0010E\u001a\u0004\u0018\u00010DH\u0016¢\u0006\u0004\b|\u0010}J\u0017\u0010~\u001a\u00020\u001d2\u0006\u0010\u0015\u001a\u00020\u0014H\u0014¢\u0006\u0004\b~\u0010#J\u000f\u0010\u007f\u001a\u00020\u001dH\u0014¢\u0006\u0004\b\u007f\u0010\u0003J\u0011\u0010\u0080\u0001\u001a\u00020\u001dH\u0014¢\u0006\u0005\b\u0080\u0001\u0010\u0003J\u0011\u0010\u0081\u0001\u001a\u00020\u001dH\u0014¢\u0006\u0005\b\u0081\u0001\u0010\u0003J\u0011\u0010\u0082\u0001\u001a\u00020\u001dH\u0014¢\u0006\u0005\b\u0082\u0001\u0010\u0003J\u001b\u0010\u0084\u0001\u001a\u00020\u001d2\u0007\u0010\u0083\u0001\u001a\u00020\rH\u0016¢\u0006\u0006\b\u0084\u0001\u0010\u0085\u0001J\u0011\u0010\u0087\u0001\u001a\u00020\rH\u0000¢\u0006\u0005\b\u0086\u0001\u00102J\u0011\u0010\u0089\u0001\u001a\u00020\rH\u0000¢\u0006\u0005\b\u0088\u0001\u00102J\u0011\u0010\u008a\u0001\u001a\u00020\u001dH\u0016¢\u0006\u0005\b\u008a\u0001\u0010\u0003J\u001c\u0010\u008d\u0001\u001a\u00020\u001d2\n\u0010\u008c\u0001\u001a\u0005\u0018\u00010\u008b\u0001¢\u0006\u0006\b\u008d\u0001\u0010\u008e\u0001J)\u0010\u0090\u0001\u001a\u0004\u0018\u00018\u0000\"\n\b\u0000\u0010\u0006*\u0004\u0018\u00010\u00182\u0007\u0010\u008f\u0001\u001a\u00020\u000fH\u0016¢\u0006\u0006\b\u0090\u0001\u0010\u0091\u0001J\u0013\u0010\u0093\u0001\u001a\u00030\u0092\u0001H\u0014¢\u0006\u0006\b\u0093\u0001\u0010\u0094\u0001J\u0013\u0010\u0096\u0001\u001a\u00030\u0095\u0001H\u0014¢\u0006\u0006\b\u0096\u0001\u0010\u0097\u0001J\u001c\u0010\u009a\u0001\u001a\u00020\r2\b\u0010\u0099\u0001\u001a\u00030\u0098\u0001H\u0016¢\u0006\u0006\b\u009a\u0001\u0010\u009b\u0001J\u000f\u0010\u009c\u0001\u001a\u00020\u001d¢\u0006\u0005\b\u009c\u0001\u0010\u0003R!\u0010¡\u0001\u001a\u00030\u009d\u00018BX\u0082\u0084\u0002¢\u0006\u0010\n\u0006\b\u009e\u0001\u0010\u009f\u0001\u001a\u0006\b\u0093\u0001\u0010 \u0001R\u001c\u0010¢\u0001\u001a\u0005\u0018\u00010\u008b\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b¢\u0001\u0010£\u0001R!\u0010¨\u0001\u001a\u00030¤\u00018BX\u0082\u0084\u0002¢\u0006\u0010\n\u0006\b¥\u0001\u0010\u009f\u0001\u001a\u0006\b¦\u0001\u0010§\u0001R!\u0010\u00ad\u0001\u001a\u00030©\u00018BX\u0082\u0084\u0002¢\u0006\u0010\n\u0006\bª\u0001\u0010\u009f\u0001\u001a\u0006\b«\u0001\u0010¬\u0001R!\u0010²\u0001\u001a\u00030®\u00018BX\u0082\u0084\u0002¢\u0006\u0010\n\u0006\b¯\u0001\u0010\u009f\u0001\u001a\u0006\b°\u0001\u0010±\u0001R+\u0010¸\u0001\u001a\r ´\u0001*\u0005\u0018\u00010³\u00010³\u00018BX\u0082\u0084\u0002¢\u0006\u0010\n\u0006\bµ\u0001\u0010\u009f\u0001\u001a\u0006\b¶\u0001\u0010·\u0001R\u0018\u0010º\u0001\u001a\u00030¹\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\bº\u0001\u0010»\u0001R\u0018\u0010½\u0001\u001a\u00030¼\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b½\u0001\u0010¾\u0001R\u0018\u0010À\u0001\u001a\u00030¿\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\bÀ\u0001\u0010Á\u0001R\u0018\u0010Ã\u0001\u001a\u00030Â\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\bÃ\u0001\u0010Ä\u0001R\u0018\u0010Æ\u0001\u001a\u00030Å\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\bÆ\u0001\u0010Ç\u0001R\u0018\u0010É\u0001\u001a\u00030È\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\bÉ\u0001\u0010Ê\u0001R\u0018\u0010Ì\u0001\u001a\u00030Ë\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\bÌ\u0001\u0010Í\u0001R\u0018\u0010Î\u0001\u001a\u00030Ë\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\bÎ\u0001\u0010Í\u0001R\u001a\u0010Ð\u0001\u001a\u00030Ï\u00018\u0002@\u0002X\u0082.¢\u0006\b\n\u0006\bÐ\u0001\u0010Ñ\u0001R\u0019\u0010Ò\u0001\u001a\u00020\r8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bÒ\u0001\u0010Ó\u0001R\u0019\u0010Ô\u0001\u001a\u00020\r8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bÔ\u0001\u0010Ó\u0001R\u0019\u0010Õ\u0001\u001a\u00020\r8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bÕ\u0001\u0010Ó\u0001R\u0019\u0010Ö\u0001\u001a\u00020\r8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bÖ\u0001\u0010Ó\u0001R\u0019\u0010×\u0001\u001a\u00020\r8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b×\u0001\u0010Ó\u0001R\u0019\u0010Ø\u0001\u001a\u00020\u000f8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bØ\u0001\u0010Ù\u0001R\u001b\u0010Ú\u0001\u001a\u0004\u0018\u00010\u00148\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bÚ\u0001\u0010Û\u0001R\u0019\u0010Ü\u0001\u001a\u00020\r8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bÜ\u0001\u0010Ó\u0001R\u001c\u0010Þ\u0001\u001a\u0005\u0018\u00010Ý\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bÞ\u0001\u0010ß\u0001R\u0019\u0010à\u0001\u001a\u00020\r8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bà\u0001\u0010Ó\u0001R\u001c\u0010â\u0001\u001a\u0005\u0018\u00010á\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bâ\u0001\u0010ã\u0001R\u0019\u0010ä\u0001\u001a\u00020n8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bä\u0001\u0010å\u0001R\u0019\u0010æ\u0001\u001a\u00020\r8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bæ\u0001\u0010Ó\u0001R\u0019\u0010ç\u0001\u001a\u00020\r8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bç\u0001\u0010Ó\u0001R\u001c\u0010é\u0001\u001a\u0005\u0018\u00010è\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bé\u0001\u0010ê\u0001R\u0019\u0010ë\u0001\u001a\u00020\r8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bë\u0001\u0010Ó\u0001R\u0019\u0010ì\u0001\u001a\u00020\r8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bì\u0001\u0010Ó\u0001R\u0019\u0010í\u0001\u001a\u00020\r8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bí\u0001\u0010Ó\u0001R\u0019\u0010î\u0001\u001a\u00020\r8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bî\u0001\u0010Ó\u0001R\u0019\u0010ï\u0001\u001a\u00020\r8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bï\u0001\u0010Ó\u0001R\u001c\u0010ñ\u0001\u001a\u0005\u0018\u00010ð\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bñ\u0001\u0010ò\u0001R!\u0010÷\u0001\u001a\u00030ó\u00018FX\u0086\u0084\u0002¢\u0006\u0010\n\u0006\bô\u0001\u0010\u009f\u0001\u001a\u0006\bõ\u0001\u0010ö\u0001R!\u0010ü\u0001\u001a\u00030ø\u00018BX\u0082\u0084\u0002¢\u0006\u0010\n\u0006\bù\u0001\u0010\u009f\u0001\u001a\u0006\bú\u0001\u0010û\u0001R\u001b\u0010ÿ\u0001\u001a\u00020\u000f*\u00020\u000f8BX\u0082\u0004¢\u0006\b\u001a\u0006\bý\u0001\u0010þ\u0001¨\u0006\u0082\u0002"}, d2 = {"Lapp/lawnchair/LawnchairLauncher;", "Lcom/android/launcher3/uioverrides/QuickstepLauncher;", "<init>", "()V", "Landroid/content/Context;", "Lcom/android/launcher3/views/ActivityContext;", "T", "activityContext", "Landroid/graphics/RectF;", "targetRect", "", "Lcom/android/launcher3/views/OptionsPopupView$OptionItem;", "items", "", "shouldAddArrow", "", "width", "Lcom/android/launcher3/views/OptionsPopupView;", "show", "(Lcom/android/launcher3/views/ActivityContext;Landroid/graphics/RectF;Ljava/util/List;ZI)Lcom/android/launcher3/views/OptionsPopupView;", "Landroid/content/Intent;", "intent", "isToolWorkspaceEntry", "(Landroid/content/Intent;)Z", "Landroid/view/View;", "v", "Lcom/android/launcher3/util/ActivityOptionsWrapper;", "getActivityLaunchOptionsDefault", "(Landroid/view/View;)Lcom/android/launcher3/util/ActivityOptionsWrapper;", "Lfl/m0;", "scheduleLauncherAnalyticsReport", "scheduleLauncherCustomNotification", "reportDesktopFirstScreenIfReady", "sourceIntent", "captureMinusOneRoute", "(Landroid/content/Intent;)V", "restoreRequested", "hotSplashStarted", "restoreMinusOneAfterStartup", "(ZZ)V", "consumeMinusOneRestoreRequest", "consumeExternalHotSplashRequest", "consumeDefaultHomePromptAfterMinusOneRequest", "consumeDefaultHomePromptAfterHotSplash", "scheduleDefaultHomePromptAfterMinusOne", "showDefaultHomePromptAfterMinusOneIfReady", "scheduleMinusOneRoute", "scheduleMinusOneGuide", "showMinusOneGuideIfReady", "dismissMinusOneGuide", "()Z", "installMinusOneEdgeHint", "positionMinusOneEdgeHint", "updateMinusOneEdgeHintVisibility", "revealDefaultHomeReminderAfterGuide", "scheduleDefaultHomeReminder", "showDefaultHomeReminderIfReady", "removeDefaultHomeReminder", NotificationCompat.CATEGORY_REMINDER, "removeReminderFromWorkspace", "(Landroid/view/View;)V", "promptForDefaultHomeFromBack", "restartIfPending", "reloadIconsIfNeeded", "ensureToolWorkspaceEntry", "ensureStorageCleanWorkspaceEntry", "createStorageCleanWorkspaceIntent", "()Landroid/content/Intent;", "Lcom/android/launcher3/model/data/ItemInfo;", "item", "isStorageCleanWorkspaceEntry", "(Lcom/android/launcher3/model/data/ItemInfo;)Z", "refreshStorageCleanWorkspaceIcon", "Lcom/android/launcher3/icons/BitmapInfo;", "bitmapInfo", "usedPercent", "updateStorageCleanWorkspaceIcon", "(Lcom/android/launcher3/icons/BitmapInfo;I)V", "renderedPercent", "completeStorageCleanIconRefresh", "(Ljava/lang/Integer;)V", "scheduleStorageCleanWorkspaceEntryRetry", "scheduleToolWorkspaceEntryRetry", "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "(Landroid/os/Bundle;)V", "", "Lcom/android/launcher3/statemanager/StateManager$StateHandler;", "Lcom/android/launcher3/LauncherState;", "out", "collectStateHandlers", "(Ljava/util/List;)V", "Ljava/util/stream/Stream;", "Lcom/android/launcher3/popup/SystemShortcut$Factory;", "getSupportedShortcuts", "()Ljava/util/stream/Stream;", "updateTheme", "", "Lcom/android/launcher3/util/TouchController;", "createTouchControllers", "()[Lcom/android/launcher3/util/TouchController;", "handleHomeTap", "onPageEndTransition", "registerBackDispatcher", "forceAnimateIcons", "bindItems", "(Ljava/util/List;Z)V", "handleGestureContract", "onUiChangedWhileSleeping", "", AutoInstallsLayout.ATTR_X, AutoInstallsLayout.ATTR_Y, "showDefaultOptions", "(FF)V", "Lcom/android/launcher3/widget/LauncherWidgetHolder;", "createAppWidgetHolder", "()Lcom/android/launcher3/widget/LauncherWidgetHolder;", "splashScreenStyle", "makeDefaultActivityOptions", "(I)Lcom/android/launcher3/util/ActivityOptionsWrapper;", "getActivityLaunchOptions", "(Landroid/view/View;Lcom/android/launcher3/model/data/ItemInfo;)Lcom/android/launcher3/util/ActivityOptionsWrapper;", "Lcom/android/launcher3/util/RunnableList;", "startActivitySafely", "(Landroid/view/View;Landroid/content/Intent;Lcom/android/launcher3/model/data/ItemInfo;)Lcom/android/launcher3/util/RunnableList;", "onNewIntent", "onStart", "onStop", "onPause", "onResume", "hasFocus", "onWindowFocusChanged", "(Z)V", "hasPendingDefaultHomePromptAfterMinusOne$launcher_lawnWithQuickstepProductionRelease", "hasPendingDefaultHomePromptAfterMinusOne", "launchPendingDefaultHomePromptFromMinusOne$launcher_lawnWithQuickstepProductionRelease", "launchPendingDefaultHomePromptFromMinusOne", "onDestroy", "Landroid/view/ViewGroup;", com.thinkup.core.common.m0.d0.odd, "setAppOpenAdContentHost", "(Landroid/view/ViewGroup;)V", "id", "findViewById", "(I)Landroid/view/View;", "Lcom/android/systemui/plugins/shared/LauncherOverlayManager;", "getDefaultOverlay", "()Lcom/android/systemui/plugins/shared/LauncherOverlayManager;", "Lcom/android/launcher3/OnBackPressedHandler;", "getOnBackPressedHandler", "()Lcom/android/launcher3/OnBackPressedHandler;", "Landroid/view/KeyEvent;", "event", "dispatchKeyEvent", "(Landroid/view/KeyEvent;)Z", "recreateIfNotScheduled", "Lcom/neeeex/eraser/launcher/tool/ToolOverlayManager;", "defaultOverlay$delegate", "Lfl/n;", "()Lcom/neeeex/eraser/launcher/tool/ToolOverlayManager;", "defaultOverlay", "appOpenAdContentHost", "Landroid/view/ViewGroup;", "Lapp/lawnchair/preferences/x;", "prefs$delegate", "getPrefs", "()Lapp/lawnchair/preferences/x;", "prefs", "Lapp/lawnchair/preferences2/g2;", "preferenceManager2$delegate", "getPreferenceManager2", "()Lapp/lawnchair/preferences2/g2;", "preferenceManager2", "Landroidx/core/view/d1;", "insetsController$delegate", "getInsetsController", "()Landroidx/core/view/d1;", "insetsController", "Lapp/lawnchair/theme/ThemeProvider;", "kotlin.jvm.PlatformType", "themeProvider$delegate", "getThemeProvider", "()Lapp/lawnchair/theme/ThemeProvider;", "themeProvider", "app/lawnchair/LawnchairLauncher$g", "noStatusBarStateListener", "Lapp/lawnchair/LawnchairLauncher$g;", "app/lawnchair/LawnchairLauncher$n", "rememberPositionStateListener", "Lapp/lawnchair/LawnchairLauncher$n;", "app/lawnchair/LawnchairLauncher$p", "statusBarClockListener", "Lapp/lawnchair/LawnchairLauncher$p;", "app/lawnchair/LawnchairLauncher$c", "clearSearchStateListener", "Lapp/lawnchair/LawnchairLauncher$c;", "app/lawnchair/LawnchairLauncher$f", "minusOneEdgeStateListener", "Lapp/lawnchair/LawnchairLauncher$f;", "app/lawnchair/LawnchairLauncher$e", "minusOneEdgeOverlayCallback", "Lapp/lawnchair/LawnchairLauncher$e;", "Landroid/view/View$OnLayoutChangeListener;", "minusOneEdgeLayoutChangeListener", "Landroid/view/View$OnLayoutChangeListener;", "defaultHomeReminderLayoutChangeListener", "Lal/a;", "colorScheme", "Lal/a;", "hasBackGesture", "Z", "toolEntryCheckInFlight", "storageCleanEntryCheckInFlight", "storageCleanIconRefreshInFlight", "storageCleanIconRefreshPending", "storageCleanLastRenderedPercent", "I", "pendingMinusOneRoute", "Landroid/content/Intent;", "minusOneRouteScheduled", "Lcom/neeeex/eraser/launcher/ToolMinusOneGuideView;", "minusOneGuideOverlay", "Lcom/neeeex/eraser/launcher/ToolMinusOneGuideView;", "minusOneGuideScheduled", "Lcom/neeeex/eraser/launcher/ToolMinusOneEdgeHintView;", "minusOneEdgeHint", "Lcom/neeeex/eraser/launcher/ToolMinusOneEdgeHintView;", "minusOneOverlayProgress", "F", "suppressCustomNotificationAfterMinusOnePause", "suppressCustomNotificationAfterStartup", "Lcom/neeeex/eraser/launcher/DefaultHomeReminderView;", "defaultHomeReminder", "Lcom/neeeex/eraser/launcher/DefaultHomeReminderView;", "defaultHomeReminderScheduled", "defaultHomeReminderCellsReserved", "pendingDefaultHomePromptAfterMinusOne", "defaultHomePromptScheduled", "launcherAnalyticsReportScheduled", "Lcom/neeeex/eraser/launcher/notification/LauncherFloatingNotification;", "floatingNotification", "Lcom/neeeex/eraser/launcher/notification/LauncherFloatingNotification;", "Lapp/lawnchair/gestures/b;", "gestureController$delegate", "getGestureController", "()Lapp/lawnchair/gestures/b;", "gestureController", "Lcom/neeeex/eraser/launcher/startup/WorkspaceToolEntry;", "workspaceToolEntry$delegate", "getWorkspaceToolEntry", "()Lcom/neeeex/eraser/launcher/startup/WorkspaceToolEntry;", "workspaceToolEntry", "getDp", "(I)I", "dp", "Companion", "a", "launcher_lawnWithQuickstepProductionRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class LawnchairLauncher extends QuickstepLauncher {
    private static final long DEFAULT_HOME_PROMPT_RETRY_DELAY_MS = 120;
    private static final int DEFAULT_HOME_REMINDER_CELL_Y = 1;
    private static final int DEFAULT_HOME_REMINDER_HORIZONTAL_MARGIN_DP = 16;
    private static final long DEFAULT_HOME_REMINDER_RETRY_DELAY_MS = 250;
    private static final int DEFAULT_HOME_REMINDER_VERTICAL_MARGIN_DP = 6;
    private static final int DEFAULT_HOME_REMINDER_VERTICAL_SPAN = 2;
    private static final int FLAG_RECREATE = 1;
    private static final int FLAG_RESTART = 2;
    private static final String KEY_STORAGE_CLEAN_ENTRY_MIGRATED = "migrated_v2";
    private static final String KEY_TOOL_ENTRY_MIGRATED = "migrated_v3";
    private static final float MINUS_ONE_EDGE_CLOSED_EPSILON = 0.001f;
    private static final float MINUS_ONE_EDGE_VERTICAL_BIAS = 0.4f;
    private static final int MINUS_ONE_EDGE_VERTICAL_OFFSET_MULTIPLIER = 2;
    private static final long MINUS_ONE_GUIDE_DELAY_MS = 600;
    private static final int REQUEST_DEFAULT_HOME_AFTER_MINUS_ONE = 49072;
    private static final int REQUEST_DEFAULT_HOME_FROM_BACK = 49073;
    private static final int REQUEST_DEFAULT_HOME_REMINDER = 49071;
    private static final String STORAGE_CLEAN_ENTRY_PREFS = "storage_clean_workspace_entry";
    private static final long STORAGE_CLEAN_ENTRY_RETRY_DELAY_MILLIS = 1000;
    private static final String TOOL_ENTRY_ACTIVITY_CLASS = "com.neeeex.eraser.launcher.startup.ExternalAppEntry";
    private static final String TOOL_ENTRY_PREFS = "quick_pdf_workspace_entry";
    private static final long TOOL_ENTRY_RETRY_DELAY_MILLIS = 1000;
    private static final int URI_GRANT_FLAGS = 195;
    private static int sRestartFlags;
    private ViewGroup appOpenAdContentHost;
    private final c clearSearchStateListener;
    private al.a colorScheme;
    private boolean defaultHomePromptScheduled;
    private DefaultHomeReminderView defaultHomeReminder;
    private boolean defaultHomeReminderCellsReserved;
    private final View.OnLayoutChangeListener defaultHomeReminderLayoutChangeListener;
    private boolean defaultHomeReminderScheduled;

    /* JADX INFO: renamed from: defaultOverlay$delegate, reason: from kotlin metadata */
    private final fl.n defaultOverlay;
    private LauncherFloatingNotification floatingNotification;

    /* JADX INFO: renamed from: gestureController$delegate, reason: from kotlin metadata */
    private final fl.n gestureController;
    private boolean hasBackGesture;

    /* JADX INFO: renamed from: insetsController$delegate, reason: from kotlin metadata */
    private final fl.n insetsController;
    private boolean launcherAnalyticsReportScheduled;
    private ToolMinusOneEdgeHintView minusOneEdgeHint;
    private final View.OnLayoutChangeListener minusOneEdgeLayoutChangeListener;
    private final e minusOneEdgeOverlayCallback;
    private final f minusOneEdgeStateListener;
    private ToolMinusOneGuideView minusOneGuideOverlay;
    private boolean minusOneGuideScheduled;
    private float minusOneOverlayProgress;
    private boolean minusOneRouteScheduled;
    private final g noStatusBarStateListener;
    private boolean pendingDefaultHomePromptAfterMinusOne;
    private Intent pendingMinusOneRoute;

    /* JADX INFO: renamed from: preferenceManager2$delegate, reason: from kotlin metadata */
    private final fl.n preferenceManager2;

    /* JADX INFO: renamed from: prefs$delegate, reason: from kotlin metadata */
    private final fl.n prefs;
    private final n rememberPositionStateListener;
    private final p statusBarClockListener;
    private volatile boolean storageCleanEntryCheckInFlight;
    private boolean storageCleanIconRefreshInFlight;
    private boolean storageCleanIconRefreshPending;
    private int storageCleanLastRenderedPercent;
    private boolean suppressCustomNotificationAfterMinusOnePause;
    private boolean suppressCustomNotificationAfterStartup;

    /* JADX INFO: renamed from: themeProvider$delegate, reason: from kotlin metadata */
    private final fl.n themeProvider;
    private volatile boolean toolEntryCheckInFlight;

    /* JADX INFO: renamed from: workspaceToolEntry$delegate, reason: from kotlin metadata */
    private final fl.n workspaceToolEntry;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    public static final /* synthetic */ class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f34454a;

        static {
            int[] iArr = new int[HomeBackPolicy.Prompt.values().length];
            try {
                iArr[HomeBackPolicy.Prompt.NONE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[HomeBackPolicy.Prompt.RESOLVER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[HomeBackPolicy.Prompt.ROLE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f34454a = iArr;
        }
    }

    public static final class c implements StateManager.StateListener {
        public c() {
        }

        public static void a(LawnchairLauncher lawnchairLauncher) {
            lawnchairLauncher.mAppsView.reset(false, true);
        }

        @Override // com.android.launcher3.statemanager.StateManager.StateListener
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void onStateTransitionComplete(LauncherState launcherState) {
            ActivityAllAppsContainerView<Launcher> activityAllAppsContainerView;
            final LawnchairLauncher lawnchairLauncher;
            ActivityAllAppsContainerView<Launcher> activityAllAppsContainerView2;
            launcherState.getClass();
            LauncherState launcherState2 = LauncherState.NORMAL;
            if (p003kotlin.jvm.internal.v.c(launcherState, launcherState2) && (activityAllAppsContainerView = LawnchairLauncher.this.mAppsView) != null && activityAllAppsContainerView.isSearching() && (activityAllAppsContainerView2 = (lawnchairLauncher = LawnchairLauncher.this).mAppsView) != null) {
                activityAllAppsContainerView2.post(new Runnable() { // from class: app.lawnchair.y1
                    @Override // java.lang.Runnable
                    public final void run() {
                        LawnchairLauncher.c.a(lawnchairLauncher);
                    }
                });
            }
            if (p003kotlin.jvm.internal.v.c(launcherState, launcherState2)) {
                LawnchairLauncher.this.scheduleMinusOneGuide();
                LawnchairLauncher.this.scheduleLauncherAnalyticsReport();
            }
        }
    }

    public static final class d implements OnBackPressedHandler {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ OnBackPressedHandler f34456a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ boolean f34457b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ LawnchairLauncher f34458c;

        public d(OnBackPressedHandler onBackPressedHandler, boolean z10, LawnchairLauncher lawnchairLauncher) {
            this.f34456a = onBackPressedHandler;
            this.f34457b = z10;
            this.f34458c = lawnchairLauncher;
        }

        @Override // com.android.launcher3.OnBackPressedHandler
        public void onBackCancelled() {
            this.f34456a.onBackCancelled();
        }

        @Override // com.android.launcher3.OnBackPressedHandler
        public void onBackInvoked() {
            this.f34456a.onBackInvoked();
            if (this.f34457b) {
                this.f34458c.promptForDefaultHomeFromBack();
            }
        }

        @Override // com.android.launcher3.OnBackPressedHandler
        public void onBackProgressed(float f10) {
            this.f34456a.onBackProgressed(f10);
        }

        @Override // com.android.launcher3.OnBackPressedHandler
        public void onBackStarted() {
            this.f34456a.onBackStarted();
        }
    }

    public static final class e implements LauncherOverlayManager.LauncherOverlayCallbacks {
        public e() {
        }

        @Override // com.android.systemui.plugins.shared.LauncherOverlayManager.LauncherOverlayCallbacks
        public void onOverlayScrollChanged(float f10) {
            LawnchairLauncher.this.minusOneOverlayProgress = f10;
            LawnchairLauncher.this.updateMinusOneEdgeHintVisibility();
        }
    }

    public static final class f implements StateManager.StateListener {
        public f() {
        }

        @Override // com.android.launcher3.statemanager.StateManager.StateListener
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void onStateTransitionComplete(LauncherState launcherState) {
            launcherState.getClass();
            LawnchairLauncher.this.updateMinusOneEdgeHintVisibility();
        }

        @Override // com.android.launcher3.statemanager.StateManager.StateListener
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void onStateTransitionStart(LauncherState launcherState) {
            launcherState.getClass();
            ToolMinusOneEdgeHintView toolMinusOneEdgeHintView = LawnchairLauncher.this.minusOneEdgeHint;
            if (toolMinusOneEdgeHintView != null) {
                toolMinusOneEdgeHintView.setHintVisible(false);
            }
        }
    }

    public static final class g implements StateManager.StateListener {
        public g() {
        }

        @Override // com.android.launcher3.statemanager.StateManager.StateListener
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void onStateTransitionComplete(LauncherState launcherState) {
            launcherState.getClass();
            if (launcherState instanceof OverviewState) {
                return;
            }
            LawnchairLauncher.this.getInsetsController().a(androidx.core.view.c1.p.h());
        }

        @Override // com.android.launcher3.statemanager.StateManager.StateListener
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void onStateTransitionStart(LauncherState launcherState) {
            launcherState.getClass();
            if (launcherState instanceof OverviewState) {
                LawnchairLauncher.this.getInsetsController().f(androidx.core.view.c1.p.h());
            }
        }
    }

    public static final class h extends ll.m implements tl.n {
        int label;

        public h(kl.f<? super h> fVar) {
            super(2, fVar);
        }

        @Override // ll.a
        public final kl.f<fl.m0> create(Object obj, kl.f<?> fVar) {
            return LawnchairLauncher.this.new h(fVar);
        }

        @Override // tl.n
        public final Object invoke(kotlinx.coroutines.p0 p0Var, kl.f<? super fl.m0> fVar) {
            return ((h) create(p0Var, fVar)).invokeSuspend(fl.m0.f80959a);
        }

        @Override // ll.a
        public final Object invokeSuspend(Object obj) {
            Object objF = p003kotlin.coroutines.intrinsics.c.f();
            int i10 = this.label;
            if (i10 == 0) {
                fl.v.b(obj);
                com.neeeex.eraser.ads.h hVar = com.neeeex.eraser.ads.h.f64923a;
                LawnchairLauncher lawnchairLauncher = LawnchairLauncher.this;
                this.label = 1;
                if (hVar.d(lawnchairLauncher, this) == objF) {
                    return objF;
                }
            } else {
                if (i10 != 1) {
                    gq.v0.a("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                fl.v.b(obj);
            }
            return fl.m0.f80959a;
        }
    }

    public static final class i extends ll.m implements tl.n {
        int label;

        public i(kl.f<? super i> fVar) {
            super(2, fVar);
        }

        @Override // ll.a
        public final kl.f<fl.m0> create(Object obj, kl.f<?> fVar) {
            return LawnchairLauncher.this.new i(fVar);
        }

        @Override // tl.n
        public final Object invoke(kotlinx.coroutines.p0 p0Var, kl.f<? super fl.m0> fVar) {
            return ((i) create(p0Var, fVar)).invokeSuspend(fl.m0.f80959a);
        }

        @Override // ll.a
        public final Object invokeSuspend(Object obj) {
            p003kotlin.coroutines.intrinsics.c.f();
            if (this.label != 0) {
                gq.v0.a("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            fl.v.b(obj);
            try {
                app.lawnchair.root.f.f35658e.a().e(LawnchairLauncher.this);
            } catch (app.lawnchair.root.g unused) {
            }
            return fl.m0.f80959a;
        }
    }

    public static final class m implements ViewTreeObserver.OnDrawListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public boolean f34462a;

        public m() {
        }

        public static void a(LawnchairLauncher lawnchairLauncher, m mVar) {
            lawnchairLauncher.getDragLayer().getViewTreeObserver().removeOnDrawListener(mVar);
        }

        @Override // android.view.ViewTreeObserver.OnDrawListener
        public void onDraw() {
            if (this.f34462a) {
                return;
            }
            this.f34462a = true;
            DragLayer dragLayer = LawnchairLauncher.this.getDragLayer();
            final LawnchairLauncher lawnchairLauncher = LawnchairLauncher.this;
            dragLayer.post(new Runnable() { // from class: app.lawnchair.z1
                @Override // java.lang.Runnable
                public final void run() {
                    LawnchairLauncher.m.a(lawnchairLauncher, this);
                }
            });
            LawnchairLauncher.this.getDepthController();
        }
    }

    public static final class n implements StateManager.StateListener {
        public n() {
        }

        @Override // com.android.launcher3.statemanager.StateManager.StateListener
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void onStateTransitionComplete(LauncherState launcherState) {
            launcherState.getClass();
        }

        @Override // com.android.launcher3.statemanager.StateManager.StateListener
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void onStateTransitionStart(LauncherState launcherState) {
            launcherState.getClass();
            if (launcherState instanceof AllAppsState) {
                LawnchairLauncher.this.mAppsView.getActiveRecyclerView().restoreScrollPosition();
            }
        }
    }

    public static final class o implements ViewTreeObserver.OnDrawListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public boolean f34465a;

        public o() {
        }

        public static void a(LawnchairLauncher lawnchairLauncher, o oVar) {
            lawnchairLauncher.getDragLayer().getViewTreeObserver().removeOnDrawListener(oVar);
            lawnchairLauncher.launcherAnalyticsReportScheduled = false;
            DefaultHomeStatusTracker.INSTANCE.reportLauncher(lawnchairLauncher);
            lawnchairLauncher.reportDesktopFirstScreenIfReady();
        }

        @Override // android.view.ViewTreeObserver.OnDrawListener
        public void onDraw() {
            if (this.f34465a) {
                return;
            }
            this.f34465a = true;
            DragLayer dragLayer = LawnchairLauncher.this.getDragLayer();
            final LawnchairLauncher lawnchairLauncher = LawnchairLauncher.this;
            dragLayer.post(new Runnable() { // from class: app.lawnchair.a2
                @Override // java.lang.Runnable
                public final void run() {
                    LawnchairLauncher.o.a(lawnchairLauncher, this);
                }
            });
        }
    }

    public static final class p implements StateManager.StateListener {
        public p() {
        }

        @Override // com.android.launcher3.statemanager.StateManager.StateListener
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void onStateTransitionComplete(LauncherState launcherState) {
            launcherState.getClass();
        }

        @Override // com.android.launcher3.statemanager.StateManager.StateListener
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void onStateTransitionStart(LauncherState launcherState) {
            launcherState.getClass();
            if ((launcherState instanceof BackgroundAppState) || (launcherState instanceof OverviewState) || (launcherState instanceof AllAppsState)) {
                LawnchairApp.INSTANCE.e().restoreClockInStatusBar();
            } else {
                LawnchairLauncher.this.getWorkspace().updateStatusbarClock();
            }
        }
    }

    public LawnchairLauncher() {
        Function0 function0 = new Function0() { // from class: app.lawnchair.o0
            @Override // p003kotlin.jvm.functions.Function0
            public final Object invoke() {
                return LawnchairLauncher.o0(this.f35298a);
            }
        };
        fl.q qVar = fl.q.NONE;
        this.defaultOverlay = fl.o.a(qVar, function0);
        this.prefs = fl.o.a(qVar, new Function0() { // from class: app.lawnchair.p0
            @Override // p003kotlin.jvm.functions.Function0
            public final Object invoke() {
                return LawnchairLauncher.V0(this.f35309a);
            }
        });
        this.preferenceManager2 = fl.o.a(qVar, new Function0() { // from class: app.lawnchair.q0
            @Override // p003kotlin.jvm.functions.Function0
            public final Object invoke() {
                return LawnchairLauncher.M0(this.f35580a);
            }
        });
        this.insetsController = fl.o.a(qVar, new Function0() { // from class: app.lawnchair.r0
            @Override // p003kotlin.jvm.functions.Function0
            public final Object invoke() {
                return LawnchairLauncher.I0(this.f35652a);
            }
        });
        this.themeProvider = fl.o.a(qVar, new Function0() { // from class: app.lawnchair.s0
            @Override // p003kotlin.jvm.functions.Function0
            public final Object invoke() {
                return LawnchairLauncher.S0(this.f35665a);
            }
        });
        this.noStatusBarStateListener = new g();
        this.rememberPositionStateListener = new n();
        this.statusBarClockListener = new p();
        this.clearSearchStateListener = new c();
        this.minusOneEdgeStateListener = new f();
        this.minusOneEdgeOverlayCallback = new e();
        this.minusOneEdgeLayoutChangeListener = new View.OnLayoutChangeListener() { // from class: app.lawnchair.t0
            @Override // android.view.View.OnLayoutChangeListener
            public final void onLayoutChange(View view, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17) {
                LawnchairLauncher.T0(this.f35975a, view, i10, i11, i12, i13, i14, i15, i16, i17);
            }
        };
        this.defaultHomeReminderLayoutChangeListener = new View.OnLayoutChangeListener() { // from class: app.lawnchair.u0
            @Override // android.view.View.OnLayoutChangeListener
            public final void onLayoutChange(View view, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17) {
                LawnchairLauncher.E0(this.f35990a, view, i10, i11, i12, i13, i14, i15, i16, i17);
            }
        };
        this.storageCleanLastRenderedPercent = -1;
        this.suppressCustomNotificationAfterStartup = true;
        this.gestureController = fl.o.a(qVar, new Function0() { // from class: app.lawnchair.w0
            @Override // p003kotlin.jvm.functions.Function0
            public final Object invoke() {
                return LawnchairLauncher.U0(this.f39377a);
            }
        });
        this.workspaceToolEntry = fl.o.a(qVar, new Function0() { // from class: app.lawnchair.x0
            @Override // p003kotlin.jvm.functions.Function0
            public final Object invoke() {
                return LawnchairLauncher.C0(this.f39395a);
            }
        });
    }

    public static void A0(LawnchairLauncher lawnchairLauncher) {
        lawnchairLauncher.defaultHomePromptScheduled = false;
        lawnchairLauncher.showDefaultHomePromptAfterMinusOneIfReady();
    }

    public static fl.m0 B0(LawnchairLauncher lawnchairLauncher) {
        DefaultHomeOnboardingHelper.requestDefaultHome$default(DefaultHomeOnboardingHelper.INSTANCE, lawnchairLauncher, REQUEST_DEFAULT_HOME_REMINDER, null, 4, null);
        return fl.m0.f80959a;
    }

    public static WorkspaceToolEntry C0(LawnchairLauncher lawnchairLauncher) {
        return new WorkspaceToolEntry(lawnchairLauncher);
    }

    public static void D0(boolean z10, boolean z11, LawnchairLauncher lawnchairLauncher) {
        LauncherFloatingNotification launcherFloatingNotification;
        boolean zT = com.neeeex.eraser.ads.e.b0().T();
        if (z10 || z11 || zT || lawnchairLauncher.isFinishing() || lawnchairLauncher.isDestroyed() || !lawnchairLauncher.hasBeenResumed() || !lawnchairLauncher.isInState(LauncherState.NORMAL) || lawnchairLauncher.getWorkspace().isOverlayShown() || (launcherFloatingNotification = lawnchairLauncher.floatingNotification) == null) {
            return;
        }
        launcherFloatingNotification.showIfEligible();
    }

    public static void E0(LawnchairLauncher lawnchairLauncher, View view, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17) {
        DefaultHomeReminderView defaultHomeReminderView = lawnchairLauncher.defaultHomeReminder;
        if ((defaultHomeReminderView != null ? defaultHomeReminderView.getParent() : null) == null) {
            lawnchairLauncher.scheduleDefaultHomeReminder();
        }
    }

    public static void F0(LawnchairLauncher lawnchairLauncher) {
        if (lawnchairLauncher.isFinishing() || lawnchairLauncher.isDestroyed()) {
            return;
        }
        lawnchairLauncher.ensureStorageCleanWorkspaceEntry();
    }

    public static void H0(LawnchairLauncher lawnchairLauncher) {
        if (lawnchairLauncher.isFinishing() || lawnchairLauncher.isDestroyed()) {
            return;
        }
        lawnchairLauncher.ensureToolWorkspaceEntry();
    }

    public static androidx.core.view.d1 I0(LawnchairLauncher lawnchairLauncher) {
        return new androidx.core.view.d1(b2.a(lawnchairLauncher).getWindow(), lawnchairLauncher.getRootView());
    }

    public static void J0(LawnchairLauncher lawnchairLauncher) {
        lawnchairLauncher.dismissMinusOneGuide();
    }

    public static void K0(RunnableList runnableList) {
        runnableList.executeAllAndDestroy();
    }

    public static void L0(LawnchairLauncher lawnchairLauncher) {
        lawnchairLauncher.getDefaultOverlay().handleBack();
    }

    public static app.lawnchair.preferences2.g2 M0(LawnchairLauncher lawnchairLauncher) {
        return app.lawnchair.preferences2.g2.f35452e1.b(lawnchairLauncher);
    }

    public static fl.m0 N0(LawnchairLauncher lawnchairLauncher, boolean z10, boolean z11) {
        lawnchairLauncher.getSystemUiController().updateUiState(0, z10 || z11);
        return fl.m0.f80959a;
    }

    public static fl.m0 P0(boolean z10) {
        RoundedCornerEnforcement.sRoundedCornerEnabled = z10;
        return fl.m0.f80959a;
    }

    public static void Q0(LawnchairLauncher lawnchairLauncher) {
        lawnchairLauncher.defaultHomeReminderScheduled = false;
        lawnchairLauncher.showDefaultHomeReminderIfReady();
    }

    public static ThemeProvider S0(LawnchairLauncher lawnchairLauncher) {
        return (ThemeProvider) ThemeProvider.f35979k.lambda$get$1(lawnchairLauncher);
    }

    public static void T0(LawnchairLauncher lawnchairLauncher, View view, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17) {
        lawnchairLauncher.positionMinusOneEdgeHint();
    }

    public static app.lawnchair.gestures.b U0(LawnchairLauncher lawnchairLauncher) {
        return new app.lawnchair.gestures.b(lawnchairLauncher);
    }

    public static app.lawnchair.preferences.x V0(LawnchairLauncher lawnchairLauncher) {
        return app.lawnchair.preferences.x.F0.c(lawnchairLauncher);
    }

    public static void W0(LawnchairLauncher lawnchairLauncher) {
        lawnchairLauncher.minusOneRouteScheduled = false;
        Intent intent = lawnchairLauncher.pendingMinusOneRoute;
        if (intent == null) {
            return;
        }
        lawnchairLauncher.pendingMinusOneRoute = null;
        lawnchairLauncher.getDefaultOverlay().launchFromMinusOne(intent);
    }

    public static void X0(LawnchairLauncher lawnchairLauncher) {
        lawnchairLauncher.minusOneGuideScheduled = false;
        lawnchairLauncher.showMinusOneGuideIfReady();
    }

    public static void Y0(boolean z10) {
        QuickStepContract.sHasCustomCornerRadius = z10;
    }

    public static void Z0(LawnchairLauncher lawnchairLauncher, int i10) {
        lawnchairLauncher.getWorkspace().removeWidget(i10);
    }

    public static fl.m0 a1(LawnchairLauncher lawnchairLauncher) {
        lawnchairLauncher.minusOneGuideOverlay = null;
        lawnchairLauncher.revealDefaultHomeReminderAfterGuide();
        lawnchairLauncher.updateMinusOneEdgeHintVisibility();
        return fl.m0.f80959a;
    }

    private final void captureMinusOneRoute(Intent sourceIntent) {
        if (sourceIntent.getBooleanExtra(LauncherRoutes.EXTRA_ROUTE_FROM_MINUS_ONE, false)) {
            sourceIntent.removeExtra(LauncherRoutes.EXTRA_ROUTE_FROM_MINUS_ONE);
            Intent intent = new Intent(this, (Class<?>) MinusOneRouteActivity.class);
            Bundle extras = sourceIntent.getExtras();
            if (extras != null) {
                intent.putExtras(extras);
            }
            intent.setData(sourceIntent.getData());
            intent.setClipData(sourceIntent.getClipData());
            intent.addFlags(sourceIntent.getFlags() & URI_GRANT_FLAGS);
            this.pendingMinusOneRoute = intent;
        }
    }

    private final void completeStorageCleanIconRefresh(Integer renderedPercent) {
        if (renderedPercent != null) {
            this.storageCleanLastRenderedPercent = renderedPercent.intValue();
        }
        this.storageCleanIconRefreshInFlight = false;
        boolean z10 = this.storageCleanIconRefreshPending;
        this.storageCleanIconRefreshPending = false;
        if (!z10 || isFinishing() || isDestroyed()) {
            return;
        }
        refreshStorageCleanWorkspaceIcon();
    }

    private final void consumeDefaultHomePromptAfterHotSplash() {
        if (DefaultHomeOnboardingHelper.INSTANCE.consumePromptAfterHotSplash(this)) {
            this.pendingDefaultHomePromptAfterMinusOne = true;
        }
    }

    private final boolean consumeDefaultHomePromptAfterMinusOneRequest(Intent sourceIntent) {
        boolean booleanExtra = sourceIntent.getBooleanExtra(LauncherRoutes.EXTRA_REQUEST_DEFAULT_HOME_AFTER_MINUS_ONE, false);
        if (booleanExtra) {
            sourceIntent.removeExtra(LauncherRoutes.EXTRA_REQUEST_DEFAULT_HOME_AFTER_MINUS_ONE);
        }
        return booleanExtra;
    }

    private final boolean consumeExternalHotSplashRequest(Intent sourceIntent) {
        if (!sourceIntent.getBooleanExtra("com.neeeex.eraser.launcher.WARM_START", false)) {
            return false;
        }
        sourceIntent.removeExtra("com.neeeex.eraser.launcher.WARM_START");
        return true;
    }

    private final boolean consumeMinusOneRestoreRequest(Intent sourceIntent) {
        boolean booleanExtra = sourceIntent.getBooleanExtra("com.neeeex.eraser.launcher.OPEN_PANEL", false);
        boolean booleanExtra2 = sourceIntent.getBooleanExtra("com.neeeex.eraser.launcher.OPEN_PANEL", false);
        if (booleanExtra) {
            sourceIntent.removeExtra("com.neeeex.eraser.launcher.OPEN_PANEL");
        }
        if (booleanExtra2) {
            sourceIntent.removeExtra("com.neeeex.eraser.launcher.OPEN_PANEL");
        }
        return booleanExtra || booleanExtra2;
    }

    private final Intent createStorageCleanWorkspaceIntent() {
        Intent flags = new Intent("com.neeeex.eraser.OPEN_CLEAN_FROM_DESKTOP").setComponent(new ComponentName(getPackageName(), "com.neeeex.eraser.launcher.startup.ExternalAppEntry")).putExtra("com.neeeex.eraser.OPEN_CLEAN_FROM_DESKTOP", true).setFlags(270532608);
        flags.getClass();
        return flags;
    }

    private final boolean dismissMinusOneGuide() {
        ToolMinusOneGuideView toolMinusOneGuideView = this.minusOneGuideOverlay;
        if (toolMinusOneGuideView == null) {
            return false;
        }
        toolMinusOneGuideView.dismiss();
        return true;
    }

    private final void ensureStorageCleanWorkspaceEntry() {
        final SharedPreferences sharedPreferences = getSharedPreferences(STORAGE_CLEAN_ENTRY_PREFS, 0);
        if (this.storageCleanEntryCheckInFlight) {
            return;
        }
        if (sharedPreferences.getBoolean(KEY_STORAGE_CLEAN_ENTRY_MIGRATED, false)) {
            refreshStorageCleanWorkspaceIcon();
            return;
        }
        this.storageCleanEntryCheckInFlight = true;
        final String string = getString(R$string.main_neeeex_clean_junk);
        string.getClass();
        final int i10 = LauncherAppState.getInstance(this).getInvariantDeviceProfile().iconBitmapSize;
        getModel().loadAsync(new Consumer() { // from class: app.lawnchair.z0
            @Override // java.util.function.Consumer
            public final void accept(Object obj) {
                LawnchairLauncher.p0(sharedPreferences, this, string, i10, (BgDataModel) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:23:0x0039  */
    public static final void ensureStorageCleanWorkspaceEntry$lambda$0$2(LawnchairLauncher lawnchairLauncher, SharedPreferences sharedPreferences, BgDataModel bgDataModel) {
        boolean z10;
        boolean z11;
        if (bgDataModel != null) {
            synchronized (bgDataModel) {
                try {
                    Iterable iterable = bgDataModel.itemsIdMap;
                    iterable.getClass();
                    if (!(iterable instanceof Collection) || !((Collection) iterable).isEmpty()) {
                        Iterator it = iterable.iterator();
                        while (true) {
                            if (!it.hasNext()) {
                                z11 = false;
                                break;
                            } else if (lawnchairLauncher.isStorageCleanWorkspaceEntry((ItemInfo) it.next())) {
                                z11 = true;
                                break;
                            }
                        }
                    } else {
                        z11 = false;
                        break;
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            if (z11) {
                z10 = true;
            } else {
                z10 = false;
            }
        } else {
            z10 = false;
        }
        lawnchairLauncher.storageCleanEntryCheckInFlight = false;
        if (!z10) {
            lawnchairLauncher.scheduleStorageCleanWorkspaceEntryRetry();
        } else {
            sharedPreferences.edit().putBoolean(KEY_STORAGE_CLEAN_ENTRY_MIGRATED, true).apply();
            Executors.MAIN_EXECUTOR.execute(new x1(lawnchairLauncher));
        }
    }

    private final void ensureToolWorkspaceEntry() {
        getWorkspaceToolEntry().ensureAddedOnce();
    }

    private final ActivityOptionsWrapper getActivityLaunchOptionsDefault(View v10) {
        int iWidth;
        int iWidth2;
        int paddingTop;
        BubbleTextView bubbleTextView;
        FastBitmapDrawable icon;
        v10.getClass();
        int measuredWidth = v10.getMeasuredWidth();
        int measuredHeight = v10.getMeasuredHeight();
        if (!(v10 instanceof BubbleTextView) || (icon = (bubbleTextView = (BubbleTextView) v10).getIcon()) == null) {
            iWidth = measuredWidth;
            iWidth2 = 0;
            paddingTop = 0;
        } else {
            Rect bounds = icon.getBounds();
            bounds.getClass();
            iWidth2 = (measuredWidth - bounds.width()) / 2;
            paddingTop = bubbleTextView.getPaddingTop();
            iWidth = bounds.width();
            measuredHeight = bounds.height();
        }
        ActivityOptions activityOptionsAllowBGLaunch = Utilities.allowBGLaunch(ActivityOptions.makeClipRevealAnimation(v10, iWidth2, paddingTop, iWidth, measuredHeight));
        if (Utilities.ATLEAST_T) {
            activityOptionsAllowBGLaunch.setSplashScreenStyle(1);
        }
        activityOptionsAllowBGLaunch.setLaunchDisplayId(v10.getDisplay() != null ? v10.getDisplay().getDisplayId() : 0);
        return new ActivityOptionsWrapper(activityOptionsAllowBGLaunch, new RunnableList());
    }

    private final ToolOverlayManager getDefaultOverlay() {
        return (ToolOverlayManager) this.defaultOverlay.getValue();
    }

    private final int getDp(int i10) {
        return (int) (i10 * getResources().getDisplayMetrics().density);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final androidx.core.view.d1 getInsetsController() {
        return (androidx.core.view.d1) this.insetsController.getValue();
    }

    private final app.lawnchair.preferences2.g2 getPreferenceManager2() {
        return (app.lawnchair.preferences2.g2) this.preferenceManager2.getValue();
    }

    private final app.lawnchair.preferences.x getPrefs() {
        return (app.lawnchair.preferences.x) this.prefs.getValue();
    }

    private final ThemeProvider getThemeProvider() {
        return (ThemeProvider) this.themeProvider.getValue();
    }

    private final WorkspaceToolEntry getWorkspaceToolEntry() {
        return (WorkspaceToolEntry) this.workspaceToolEntry.getValue();
    }

    private final void installMinusOneEdgeHint() {
        if (this.minusOneEdgeHint != null) {
            return;
        }
        ToolMinusOneEdgeHintView toolMinusOneEdgeHintView = new ToolMinusOneEdgeHintView(this, new Function0() { // from class: app.lawnchair.o1
            @Override // p003kotlin.jvm.functions.Function0
            public final Object invoke() {
                return LawnchairLauncher.w0(this.f35299a);
            }
        });
        this.minusOneEdgeHint = toolMinusOneEdgeHintView;
        toolMinusOneEdgeHintView.setHintVisible(false);
        DragLayer dragLayer = getDragLayer();
        InsettableFrameLayout.LayoutParams layoutParams = new InsettableFrameLayout.LayoutParams(-2, -2);
        ((FrameLayout.LayoutParams) layoutParams).gravity = 8388659;
        layoutParams.ignoreInsets = true;
        fl.m0 m0Var = fl.m0.f80959a;
        dragLayer.addView(toolMinusOneEdgeHintView, layoutParams);
        getDragLayer().addOnLayoutChangeListener(this.minusOneEdgeLayoutChangeListener);
        getWorkspace().addOverlayCallback(this.minusOneEdgeOverlayCallback);
        getDragLayer().post(new Runnable() { // from class: app.lawnchair.p1
            @Override // java.lang.Runnable
            public final void run() {
                this.f35310a.positionMinusOneEdgeHint();
            }
        });
        updateMinusOneEdgeHintVisibility();
    }

    private final boolean isStorageCleanWorkspaceEntry(ItemInfo item) {
        Intent intent;
        WorkspaceItemInfo workspaceItemInfo = item instanceof WorkspaceItemInfo ? (WorkspaceItemInfo) item : null;
        return workspaceItemInfo != null && (intent = workspaceItemInfo.intent) != null && p003kotlin.jvm.internal.v.c(intent.getComponent(), new ComponentName(getPackageName(), "com.neeeex.eraser.launcher.startup.ExternalAppEntry")) && intent.getBooleanExtra("com.neeeex.eraser.OPEN_CLEAN_FROM_DESKTOP", false);
    }

    private final boolean isToolWorkspaceEntry(Intent intent) {
        ComponentName component = intent.getComponent();
        return p003kotlin.jvm.internal.v.c(component != null ? component.getClassName() : null, "com.neeeex.eraser.launcher.startup.ExternalAppEntry") && intent.getBooleanExtra(LauncherRoutes.EXTRA_INTERNAL_TOOL, false);
    }

    public static ToolOverlayManager o0(LawnchairLauncher lawnchairLauncher) {
        return new ToolOverlayManager(lawnchairLauncher);
    }

    public static void p0(final SharedPreferences sharedPreferences, final LawnchairLauncher lawnchairLauncher, String str, int i10, BgDataModel bgDataModel) {
        ItemInfo next;
        ItemInfo itemInfo;
        if (sharedPreferences.getBoolean(KEY_STORAGE_CLEAN_ENTRY_MIGRATED, false)) {
            lawnchairLauncher.storageCleanEntryCheckInFlight = false;
            return;
        }
        if (bgDataModel == null) {
            lawnchairLauncher.storageCleanEntryCheckInFlight = false;
            lawnchairLauncher.scheduleStorageCleanWorkspaceEntryRetry();
            return;
        }
        Intent intentCreateStorageCleanWorkspaceIntent = lawnchairLauncher.createStorageCleanWorkspaceIntent();
        synchronized (bgDataModel) {
            try {
                IntSparseArrayMap<ItemInfo> intSparseArrayMap = bgDataModel.itemsIdMap;
                intSparseArrayMap.getClass();
                Iterator<ItemInfo> it = intSparseArrayMap.iterator();
                do {
                    if (!it.hasNext()) {
                        next = null;
                        break;
                    }
                    next = it.next();
                } while (!lawnchairLauncher.isStorageCleanWorkspaceEntry(next));
                itemInfo = next;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        if (itemInfo != null) {
            sharedPreferences.edit().putBoolean(KEY_STORAGE_CLEAN_ENTRY_MIGRATED, true).apply();
            lawnchairLauncher.storageCleanEntryCheckInFlight = false;
            Executors.MAIN_EXECUTOR.execute(new x1(lawnchairLauncher));
            return;
        }
        q2 q2Var = q2.f35582a;
        int iB = q2Var.b();
        WorkspaceItemInfo workspaceItemInfo = new WorkspaceItemInfo();
        workspaceItemInfo.user = Process.myUserHandle();
        workspaceItemInfo.intent = intentCreateStorageCleanWorkspaceIntent;
        workspaceItemInfo.title = str;
        workspaceItemInfo.contentDescription = str;
        workspaceItemInfo.bitmap = q2Var.a(i10, iB);
        workspaceItemInfo.itemType = 0;
        workspaceItemInfo.spanX = 1;
        workspaceItemInfo.spanY = 1;
        lawnchairLauncher.getModel().enqueueModelUpdateTask(new AddWorkspaceItemsTask(gl.v.e(new Pair(workspaceItemInfo, fl.m0.f80959a)), r2.f35654a));
        lawnchairLauncher.getModel().loadAsync(new Consumer() { // from class: app.lawnchair.l0
            @Override // java.util.function.Consumer
            public final void accept(Object obj) {
                LawnchairLauncher.ensureStorageCleanWorkspaceEntry$lambda$0$2(this.f35270a, sharedPreferences, (BgDataModel) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void positionMinusOneEdgeHint() {
        ToolMinusOneEdgeHintView toolMinusOneEdgeHintView = this.minusOneEdgeHint;
        if (toolMinusOneEdgeHintView != null && getDragLayer().getHeight() > 0 && toolMinusOneEdgeHintView.getHeight() > 0) {
            ViewGroup.LayoutParams layoutParams = toolMinusOneEdgeHintView.getLayoutParams();
            FrameLayout.LayoutParams layoutParams2 = layoutParams instanceof FrameLayout.LayoutParams ? (FrameLayout.LayoutParams) layoutParams : null;
            if (layoutParams2 == null) {
                return;
            }
            int iF = am.q.f(getDragLayer().getHeight() - toolMinusOneEdgeHintView.getHeight(), 0);
            int iK = am.q.k((int) ((iF * 0.4f) + (toolMinusOneEdgeHintView.getHeight() * 2)), iF);
            if (layoutParams2.topMargin != iK) {
                layoutParams2.topMargin = iK;
                toolMinusOneEdgeHintView.setLayoutParams(layoutParams2);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void promptForDefaultHomeFromBack() {
        int i10 = b.f34454a[HomeBackPolicy.INSTANCE.normalBack(com.neeeex.eraser.module.report.bytedance.a.k(), app.lawnchair.util.n0.t(this), Build.VERSION.SDK_INT, app.lawnchair.util.q.k()).ordinal()];
        if (i10 != 1) {
            if (i10 == 2) {
                HomeResolverPromptController.INSTANCE.promptForHomeResolution(this);
            } else if (i10 == 3) {
                DefaultHomeOnboardingHelper.requestDefaultHome$default(DefaultHomeOnboardingHelper.INSTANCE, this, REQUEST_DEFAULT_HOME_FROM_BACK, null, 4, null);
            } else {
                coil.util.j.a();
            }
        }
    }

    public static fl.m0 r0(LawnchairLauncher lawnchairLauncher, app.lawnchair.gestures.config.b bVar) {
        bVar.getClass();
        lawnchairLauncher.hasBackGesture = !(bVar instanceof app.lawnchair.gestures.config.b.C0281b);
        return fl.m0.f80959a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void refreshStorageCleanWorkspaceIcon() {
        if (isFinishing() || isDestroyed()) {
            return;
        }
        if (this.storageCleanIconRefreshInFlight) {
            this.storageCleanIconRefreshPending = true;
            return;
        }
        this.storageCleanIconRefreshInFlight = true;
        final int i10 = LauncherAppState.getInstance(this).getInvariantDeviceProfile().iconBitmapSize;
        Executors.THREAD_POOL_EXECUTOR.execute(new Runnable() { // from class: app.lawnchair.n0
            @Override // java.lang.Runnable
            public final void run() {
                LawnchairLauncher.x0(i10, this);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void refreshStorageCleanWorkspaceIcon$lambda$0$0(LawnchairLauncher lawnchairLauncher, int i10, BitmapInfo bitmapInfo) {
        if (lawnchairLauncher.isFinishing() || lawnchairLauncher.isDestroyed()) {
            lawnchairLauncher.completeStorageCleanIconRefresh(null);
        } else if (lawnchairLauncher.storageCleanLastRenderedPercent == i10) {
            lawnchairLauncher.completeStorageCleanIconRefresh(Integer.valueOf(i10));
        } else {
            lawnchairLauncher.updateStorageCleanWorkspaceIcon(bitmapInfo, i10);
        }
    }

    private final void reloadIconsIfNeeded() {
        if (!(p003kotlin.text.k0.r0((CharSequence) getPrefs().v1().get()) && p003kotlin.text.k0.r0((CharSequence) getPrefs().Y1().get())) && ((Boolean) com.patrykmichalik.opto.core.a.b(getPreferenceManager2().m2())).booleanValue()) {
            LauncherAppState.getInstance(this).reloadIcons();
        }
    }

    private final void removeDefaultHomeReminder() {
        DefaultHomeReminderView defaultHomeReminderView = this.defaultHomeReminder;
        if (defaultHomeReminderView != null) {
            removeReminderFromWorkspace(defaultHomeReminderView);
        }
        this.defaultHomeReminder = null;
    }

    private final void removeReminderFromWorkspace(View reminder) {
        ViewParent parent = reminder.getParent();
        ViewGroup viewGroup = parent instanceof ViewGroup ? (ViewGroup) parent : null;
        if (viewGroup == null) {
            this.defaultHomeReminderCellsReserved = false;
            return;
        }
        ViewParent parent2 = viewGroup.getParent();
        CellLayout cellLayout = parent2 instanceof CellLayout ? (CellLayout) parent2 : null;
        if (cellLayout == null || !this.defaultHomeReminderCellsReserved) {
            viewGroup.removeView(reminder);
        } else {
            cellLayout.removeView(reminder);
        }
        this.defaultHomeReminderCellsReserved = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void reportDesktopFirstScreenIfReady() {
        if (StartupStateStore.INSTANCE.requiredFlowComplete() && hasBeenResumed() && hasWindowFocus() && isInState(LauncherState.NORMAL) && getWorkspace().getCurrentPage() == 0 && !isFinishing() && !isDestroyed()) {
            NewUserDesktopFunnelTracker.INSTANCE.reportDesktopFirstScreenShown(this, app.lawnchair.util.n0.t(this));
        }
    }

    private final void restartIfPending() {
        int i10 = sRestartFlags;
        if ((i10 & 2) != 0) {
            i0.a(this).restart(false);
        } else if ((i10 & 1) != 0) {
            sRestartFlags = 0;
            recreate();
        }
    }

    private final void restoreMinusOneAfterStartup(boolean restoreRequested, boolean hotSplashStarted) {
        if (restoreRequested) {
            if (hotSplashStarted) {
                getDefaultOverlay().requestRestoreAfterExternalWarmStart();
            } else {
                getDefaultOverlay().requestRestoreAfterNotification();
            }
        }
    }

    private final void revealDefaultHomeReminderAfterGuide() {
        if (app.lawnchair.util.n0.t(this)) {
            removeDefaultHomeReminder();
            return;
        }
        DefaultHomeReminderView defaultHomeReminderView = this.defaultHomeReminder;
        if ((defaultHomeReminderView != null ? defaultHomeReminderView.getParent() : null) != null) {
            defaultHomeReminderView.show();
        } else {
            scheduleDefaultHomeReminder();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void scheduleDefaultHomePromptAfterMinusOne() {
        if (!this.pendingDefaultHomePromptAfterMinusOne || this.defaultHomePromptScheduled || isFinishing() || isDestroyed()) {
            return;
        }
        this.defaultHomePromptScheduled = true;
        getDragLayer().post(new Runnable() { // from class: app.lawnchair.i1
            @Override // java.lang.Runnable
            public final void run() {
                LawnchairLauncher.A0(this.f35151a);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void scheduleDefaultHomeReminder() {
        if (this.defaultHomeReminderScheduled || isFinishing() || isDestroyed()) {
            return;
        }
        this.defaultHomeReminderScheduled = true;
        getWorkspace().post(new Runnable() { // from class: app.lawnchair.y0
            @Override // java.lang.Runnable
            public final void run() {
                LawnchairLauncher.Q0(this.f39412a);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void scheduleLauncherAnalyticsReport() {
        if (this.launcherAnalyticsReportScheduled || !hasBeenResumed() || !hasWindowFocus() || isFinishing() || isDestroyed()) {
            return;
        }
        this.launcherAnalyticsReportScheduled = true;
        getDragLayer().getViewTreeObserver().addOnDrawListener(new o());
        getDragLayer().postInvalidateOnAnimation();
    }

    private final void scheduleLauncherCustomNotification() {
        final boolean z10 = this.suppressCustomNotificationAfterMinusOnePause;
        this.suppressCustomNotificationAfterMinusOnePause = false;
        final boolean z11 = this.suppressCustomNotificationAfterStartup;
        this.suppressCustomNotificationAfterStartup = false;
        getDragLayer().post(new Runnable() { // from class: app.lawnchair.k1
            @Override // java.lang.Runnable
            public final void run() {
                LawnchairLauncher.D0(z11, z10, this);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void scheduleMinusOneGuide() {
        if (this.minusOneGuideOverlay != null || this.minusOneGuideScheduled || !MinusOneGuideHelper.INSTANCE.shouldShow(this) || isFinishing() || isDestroyed()) {
            return;
        }
        this.minusOneGuideScheduled = true;
        getDragLayer().postDelayed(new Runnable() { // from class: app.lawnchair.m0
            @Override // java.lang.Runnable
            public final void run() {
                LawnchairLauncher.X0(this.f35276a);
            }
        }, 600L);
    }

    private final void scheduleMinusOneRoute() {
        if (this.pendingMinusOneRoute == null || this.minusOneRouteScheduled || isFinishing() || isDestroyed()) {
            return;
        }
        this.minusOneRouteScheduled = true;
        getDragLayer().post(new Runnable() { // from class: app.lawnchair.h1
            @Override // java.lang.Runnable
            public final void run() {
                LawnchairLauncher.W0(this.f35143a);
            }
        });
    }

    private final void scheduleStorageCleanWorkspaceEntryRetry() {
        getDragLayer().postDelayed(new Runnable() { // from class: app.lawnchair.m1
            @Override // java.lang.Runnable
            public final void run() {
                LawnchairLauncher.F0(this.f35277a);
            }
        }, 1000L);
    }

    private final void scheduleToolWorkspaceEntryRetry() {
        getDragLayer().postDelayed(new Runnable() { // from class: app.lawnchair.q1
            @Override // java.lang.Runnable
            public final void run() {
                LawnchairLauncher.H0(this.f35581a);
            }
        }, 1000L);
    }

    private final <T extends Context & ActivityContext> OptionsPopupView<T> show(ActivityContext activityContext, RectF targetRect, List<? extends OptionsPopupView.OptionItem> items, boolean shouldAddArrow, int width) {
        if (activityContext == null) {
            return null;
        }
        boolean zIsEmpty = ((app.lawnchair.data.wallpaper.service.k) app.lawnchair.data.wallpaper.service.k.f34911e.lambda$get$1(this)).l().isEmpty();
        View viewInflate = activityContext.getLayoutInflater().inflate(zIsEmpty ? R.layout.longpress_options_menu : R.layout.wallpaper_options_popup, (ViewGroup) activityContext.getDragLayer(), false);
        viewInflate.getClass();
        OptionsPopupView<T> optionsPopupView = (OptionsPopupView) viewInflate;
        optionsPopupView.setTargetRect(targetRect);
        optionsPopupView.setShouldAddArrow(shouldAddArrow);
        for (OptionsPopupView.OptionItem optionItem : items) {
            DeepShortcutView deepShortcutView = (DeepShortcutView) optionsPopupView.inflateAndAdd(zIsEmpty ? R.layout.system_shortcut : R.layout.wallpaper_options_popup_item, optionsPopupView);
            if (width > 0) {
                deepShortcutView.getLayoutParams().width = width;
            }
            deepShortcutView.getIconView().setBackgroundDrawable(optionItem.icon);
            deepShortcutView.getBubbleText().setText(optionItem.label);
            deepShortcutView.setOnClickListener(optionsPopupView);
            deepShortcutView.setOnLongClickListener(optionsPopupView);
            ArrayMap<View, OptionsPopupView.OptionItem> arrayMap = optionsPopupView.mItemMap;
            arrayMap.getClass();
            arrayMap.put(deepShortcutView, optionItem);
        }
        optionsPopupView.show();
        return optionsPopupView;
    }

    public static /* synthetic */ OptionsPopupView show$default(LawnchairLauncher lawnchairLauncher, ActivityContext activityContext, RectF rectF, List list, boolean z10, int i10, int i11, Object obj) {
        if ((i11 & 8) != 0) {
            z10 = false;
        }
        if ((i11 & 16) != 0) {
            i10 = 0;
        }
        return lawnchairLauncher.show(activityContext, rectF, list, z10, i10);
    }

    private final void showDefaultHomePromptAfterMinusOneIfReady() {
        if (this.pendingDefaultHomePromptAfterMinusOne) {
            if (app.lawnchair.util.n0.t(this)) {
                this.pendingDefaultHomePromptAfterMinusOne = false;
                removeDefaultHomeReminder();
                return;
            }
            if (hasBeenResumed() && isInState(LauncherState.NORMAL) && getDefaultOverlay().isOverlayOpen() && !isFinishing() && !isDestroyed()) {
                getDefaultOverlay().dispatchDefaultHomePromptIfPending();
            } else {
                if (!hasBeenResumed() || isFinishing() || isDestroyed()) {
                    return;
                }
                getDragLayer().postDelayed(new Runnable() { // from class: app.lawnchair.l1
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f35272a.scheduleDefaultHomePromptAfterMinusOne();
                    }
                }, 120L);
            }
        }
    }

    private final void showDefaultHomeReminderIfReady() {
        if (app.lawnchair.util.n0.t(this)) {
            removeDefaultHomeReminder();
            return;
        }
        if (hasBeenResumed() && hasWindowFocus() && isInState(LauncherState.NORMAL) && !isFinishing() && !isDestroyed()) {
            CellLayout screenWithId = getWorkspace().getScreenWithId(0);
            if (screenWithId == null) {
                View childAt = getWorkspace().getChildAt(0);
                screenWithId = childAt instanceof CellLayout ? (CellLayout) childAt : null;
            }
            CellLayout cellLayout = screenWithId;
            if (cellLayout == null || cellLayout.getCountY() <= 1) {
                getWorkspace().postDelayed(new Runnable() { // from class: app.lawnchair.v1
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f39343a.scheduleDefaultHomeReminder();
                    }
                }, DEFAULT_HOME_REMINDER_RETRY_DELAY_MS);
                return;
            }
            DefaultHomeReminderView defaultHomeReminderView = this.defaultHomeReminder;
            if (defaultHomeReminderView == null) {
                defaultHomeReminderView = new DefaultHomeReminderView(this, new Function0() { // from class: app.lawnchair.w1
                    @Override // p003kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return LawnchairLauncher.B0(this.f39378a);
                    }
                });
            }
            this.defaultHomeReminder = defaultHomeReminderView;
            if (defaultHomeReminderView.getParent() != cellLayout.getShortcutsAndWidgets()) {
                removeReminderFromWorkspace(defaultHomeReminderView);
                int iK = am.q.k(2, cellLayout.getCountY() - 1);
                CellLayoutLayoutParams cellLayoutLayoutParams = new CellLayoutLayoutParams(0, 1, cellLayout.getCountX(), iK);
                cellLayoutLayoutParams.canReorder = false;
                ((ViewGroup.MarginLayoutParams) cellLayoutLayoutParams).leftMargin = getDp(16);
                ((ViewGroup.MarginLayoutParams) cellLayoutLayoutParams).rightMargin = getDp(16);
                ((ViewGroup.MarginLayoutParams) cellLayoutLayoutParams).topMargin = getDp(6);
                ((ViewGroup.MarginLayoutParams) cellLayoutLayoutParams).bottomMargin = getDp(6);
                boolean zIsRegionVacant = cellLayout.isRegionVacant(0, 1, cellLayout.getCountX(), iK);
                DefaultHomeReminderView defaultHomeReminderView2 = defaultHomeReminderView;
                if (!cellLayout.addViewToCellLayout(defaultHomeReminderView2, -1, View.generateViewId(), cellLayoutLayoutParams, zIsRegionVacant)) {
                    getWorkspace().postDelayed(new Runnable() { // from class: app.lawnchair.v1
                        @Override // java.lang.Runnable
                        public final void run() {
                            this.f39343a.scheduleDefaultHomeReminder();
                        }
                    }, DEFAULT_HOME_REMINDER_RETRY_DELAY_MS);
                    return;
                }
                this.defaultHomeReminderCellsReserved = zIsRegionVacant;
                if (this.minusOneGuideOverlay != null) {
                    defaultHomeReminderView2.hide();
                } else {
                    defaultHomeReminderView2.show();
                }
            }
        }
    }

    private final void showMinusOneGuideIfReady() {
        if (this.minusOneGuideOverlay == null) {
            MinusOneGuideHelper minusOneGuideHelper = MinusOneGuideHelper.INSTANCE;
            if (minusOneGuideHelper.shouldShow(this) && hasBeenResumed() && hasWindowFocus() && isInState(LauncherState.NORMAL) && !getDefaultOverlay().isOverlayOpen() && !isFinishing() && !isDestroyed()) {
                DefaultHomeReminderView defaultHomeReminderView = this.defaultHomeReminder;
                if (defaultHomeReminderView != null) {
                    defaultHomeReminderView.hide();
                }
                ToolMinusOneGuideView toolMinusOneGuideView = new ToolMinusOneGuideView(this, new Function0() { // from class: app.lawnchair.t1
                    @Override // p003kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return LawnchairLauncher.u0(this.f35976a);
                    }
                }, new Function0() { // from class: app.lawnchair.u1
                    @Override // p003kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return LawnchairLauncher.a1(this.f35991a);
                    }
                });
                this.minusOneGuideOverlay = toolMinusOneGuideView;
                updateMinusOneEdgeHintVisibility();
                getDragLayer().addView(toolMinusOneGuideView, new ViewGroup.LayoutParams(-1, -1));
                minusOneGuideHelper.markShown(this);
                toolMinusOneGuideView.show();
            }
        }
    }

    public static void t0(final LawnchairLauncher lawnchairLauncher, BitmapInfo bitmapInfo, final int i10, ModelTaskController modelTaskController, BgDataModel bgDataModel, AllAppsList allAppsList) {
        ItemInfo next;
        final WorkspaceItemInfo workspaceItemInfo;
        modelTaskController.getClass();
        bgDataModel.getClass();
        allAppsList.getClass();
        synchronized (bgDataModel) {
            try {
                IntSparseArrayMap<ItemInfo> intSparseArrayMap = bgDataModel.itemsIdMap;
                intSparseArrayMap.getClass();
                Iterator<ItemInfo> it = intSparseArrayMap.iterator();
                do {
                    if (!it.hasNext()) {
                        next = null;
                        break;
                    }
                    next = it.next();
                } while (!lawnchairLauncher.isStorageCleanWorkspaceEntry(next));
                workspaceItemInfo = next instanceof WorkspaceItemInfo ? (WorkspaceItemInfo) next : null;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        if (workspaceItemInfo != null) {
            String string = lawnchairLauncher.getString(R$string.main_neeeex_clean_junk);
            string.getClass();
            workspaceItemInfo.itemType = 0;
            workspaceItemInfo.intent = lawnchairLauncher.createStorageCleanWorkspaceIntent();
            workspaceItemInfo.title = string;
            workspaceItemInfo.contentDescription = string;
            workspaceItemInfo.bitmap = bitmapInfo;
            modelTaskController.getModelWriter().updateItemInDatabase(workspaceItemInfo);
            modelTaskController.bindUpdatedWorkspaceItems(gl.v.e(workspaceItemInfo));
        }
        Executors.MAIN_EXECUTOR.execute(new Runnable() { // from class: app.lawnchair.j1
            @Override // java.lang.Runnable
            public final void run() {
                LawnchairLauncher.updateStorageCleanWorkspaceIcon$lambda$0$2(this.f35255a, i10, workspaceItemInfo);
            }
        });
    }

    public static fl.m0 u0(LawnchairLauncher lawnchairLauncher) {
        lawnchairLauncher.minusOneGuideOverlay = null;
        lawnchairLauncher.revealDefaultHomeReminderAfterGuide();
        ToolMinusOneEdgeHintView toolMinusOneEdgeHintView = lawnchairLauncher.minusOneEdgeHint;
        if (toolMinusOneEdgeHintView != null) {
            toolMinusOneEdgeHintView.setHintVisible(false);
        }
        lawnchairLauncher.getDefaultOverlay().openOverlay();
        return fl.m0.f80959a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void updateMinusOneEdgeHintVisibility() {
        boolean z10 = com.neeeex.eraser.module.report.bytedance.a.k() && this.minusOneGuideOverlay == null && this.minusOneOverlayProgress <= MINUS_ONE_EDGE_CLOSED_EPSILON && !getDefaultOverlay().isOverlayOpen() && hasBeenResumed() && hasWindowFocus() && isInState(LauncherState.NORMAL) && !isFinishing() && !isDestroyed();
        ToolMinusOneEdgeHintView toolMinusOneEdgeHintView = this.minusOneEdgeHint;
        if (toolMinusOneEdgeHintView != null) {
            toolMinusOneEdgeHintView.setHintVisible(z10);
        }
    }

    private final void updateStorageCleanWorkspaceIcon(final BitmapInfo bitmapInfo, final int usedPercent) {
        getModel().enqueueModelUpdateTask(new LauncherModel.ModelUpdateTask() { // from class: app.lawnchair.k0
            @Override // com.android.launcher3.LauncherModel.ModelUpdateTask
            public final void execute(ModelTaskController modelTaskController, BgDataModel bgDataModel, AllAppsList allAppsList) {
                LawnchairLauncher.t0(this.f35260a, bitmapInfo, usedPercent, modelTaskController, bgDataModel, allAppsList);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void updateStorageCleanWorkspaceIcon$lambda$0$2(LawnchairLauncher lawnchairLauncher, int i10, WorkspaceItemInfo workspaceItemInfo) {
        Integer numValueOf = Integer.valueOf(i10);
        if (workspaceItemInfo == null) {
            numValueOf = null;
        }
        lawnchairLauncher.completeStorageCleanIconRefresh(numValueOf);
    }

    public static void v0(int i10) {
        QuickStepContract.sCustomCornerRadius = i10;
    }

    public static fl.m0 w0(LawnchairLauncher lawnchairLauncher) {
        ToolMinusOneEdgeHintView toolMinusOneEdgeHintView = lawnchairLauncher.minusOneEdgeHint;
        if (toolMinusOneEdgeHintView != null) {
            toolMinusOneEdgeHintView.setHintVisible(false);
        }
        if (com.neeeex.eraser.module.report.bytedance.a.k()) {
            lawnchairLauncher.getDefaultOverlay().openOverlayFromEdgeHint();
        }
        return fl.m0.f80959a;
    }

    public static void x0(int i10, final LawnchairLauncher lawnchairLauncher) {
        q2 q2Var = q2.f35582a;
        final int iB = q2Var.b();
        final BitmapInfo bitmapInfoA = q2Var.a(i10, iB);
        Executors.MAIN_EXECUTOR.execute(new Runnable() { // from class: app.lawnchair.v0
            @Override // java.lang.Runnable
            public final void run() {
                LawnchairLauncher.refreshStorageCleanWorkspaceIcon$lambda$0$0(this.f39340a, iB, bitmapInfoA);
            }
        });
    }

    @Override // com.android.launcher3.Launcher, com.android.launcher3.model.BgDataModel.Callbacks
    public void bindItems(List<? extends ItemInfo> items, boolean forceAnimateIcons) {
        items.getClass();
        List<? extends ItemInfo> list = items;
        ArrayList arrayList = new ArrayList(gl.x.x(list, 10));
        Iterator<T> it = list.iterator();
        while (true) {
            View viewInflateItem$default = null;
            if (!it.hasNext()) {
                break;
            }
            ItemInfo itemInfo = (ItemInfo) it.next();
            ItemInflater<Launcher> itemInflater = getItemInflater();
            if (itemInflater != null) {
                ModelWriter modelWriter = getModelWriter();
                modelWriter.getClass();
                viewInflateItem$default = ItemInflater.inflateItem$default(itemInflater, itemInfo, modelWriter, null, 4, null);
            }
            arrayList.add(Pair.create(itemInfo, viewInflateItem$default));
        }
        bindInflatedItems(gl.g0.f1(arrayList), forceAnimateIcons ? new AnimatorSet() : null);
    }

    @Override // com.android.launcher3.uioverrides.QuickstepLauncher, com.android.launcher3.Launcher, com.android.launcher3.statemanager.StatefulActivity, com.android.launcher3.statemanager.StatefulContainer
    public void collectStateHandlers(List<StateManager.StateHandler<LauncherState>> out) {
        out.getClass();
        super.collectStateHandlers(out);
        out.add(new p2(this));
    }

    @Override // com.android.launcher3.uioverrides.QuickstepLauncher, com.android.launcher3.Launcher
    public LauncherWidgetHolder createAppWidgetHolder() {
        LauncherWidgetHolder.HolderFactory holderFactoryNewFactory = LauncherWidgetHolder.HolderFactory.newFactory(this);
        holderFactoryNewFactory.getClass();
        return ((LawnchairWidgetHolder.LawnchairHolderFactory) holderFactoryNewFactory).newInstance(this, new IntConsumer() { // from class: app.lawnchair.s1
            @Override // java.util.function.IntConsumer
            public final void accept(int i10) {
                LawnchairLauncher.Z0(this.f35666a, i10);
            }
        });
    }

    @Override // com.android.launcher3.uioverrides.QuickstepLauncher, com.android.launcher3.Launcher
    public TouchController[] createTouchControllers() {
        TouchController[] touchControllerArr = {new app.lawnchair.gestures.d(this, getGestureController())};
        TouchController[] touchControllerArrCreateTouchControllers = super.createTouchControllers();
        touchControllerArrCreateTouchControllers.getClass();
        return (TouchController[]) gl.q.L(touchControllerArr, touchControllerArrCreateTouchControllers);
    }

    @Override // com.android.launcher3.uioverrides.QuickstepLauncher, com.android.launcher3.Launcher, androidx.core.app.ComponentActivity, android.app.Activity, android.view.Window.Callback
    public boolean dispatchKeyEvent(KeyEvent event) {
        event.getClass();
        if (event.getKeyCode() == 4 && event.getAction() == 1 && dismissMinusOneGuide()) {
            promptForDefaultHomeFromBack();
            return true;
        }
        if (event.getKeyCode() == 4 && event.getAction() == 1 && getDefaultOverlay().handleBack()) {
            return true;
        }
        return super.dispatchKeyEvent(event);
    }

    @Override // com.android.launcher3.statemanager.StatefulActivity, android.app.Activity
    public <T extends View> T findViewById(int id2) {
        ViewGroup viewGroup;
        return (id2 != 16908290 || (viewGroup = this.appOpenAdContentHost) == null) ? (T) super.findViewById(id2) : viewGroup;
    }

    @Override // com.android.launcher3.uioverrides.QuickstepLauncher, com.android.launcher3.BaseDraggingActivity, com.android.launcher3.views.ActivityContext
    public ActivityOptionsWrapper getActivityLaunchOptions(View v10, ItemInfo item) {
        Object objM372constructorimpl;
        try {
            fl.u.a aVar = fl.u.Companion;
            objM372constructorimpl = fl.u.m372constructorimpl(super.getActivityLaunchOptions(v10, item));
        } catch (Throwable th2) {
            fl.u.a aVar2 = fl.u.Companion;
            objM372constructorimpl = fl.u.m372constructorimpl(fl.v.a(th2));
        }
        if (fl.u.m375exceptionOrNullimpl(objM372constructorimpl) != null) {
            objM372constructorimpl = getActivityLaunchOptionsDefault(v10);
        }
        return (ActivityOptionsWrapper) objM372constructorimpl;
    }

    public final app.lawnchair.gestures.b getGestureController() {
        return (app.lawnchair.gestures.b) this.gestureController.getValue();
    }

    @Override // com.android.launcher3.Launcher
    public OnBackPressedHandler getOnBackPressedHandler() {
        if (this.minusOneGuideOverlay != null) {
            return new OnBackPressedHandler() { // from class: app.lawnchair.g1
                @Override // com.android.launcher3.OnBackPressedHandler
                public final void onBackInvoked() {
                    LawnchairLauncher.J0(this.f35038a);
                }
            };
        }
        if (getDefaultOverlay().isOverlayOpen()) {
            return new OnBackPressedHandler() { // from class: app.lawnchair.r1
                @Override // com.android.launcher3.OnBackPressedHandler
                public final void onBackInvoked() {
                    LawnchairLauncher.L0(this.f35653a);
                }
            };
        }
        boolean zIsInState = isInState(LauncherState.NORMAL);
        OnBackPressedHandler onBackPressedHandler = super.getOnBackPressedHandler();
        onBackPressedHandler.getClass();
        return new d(onBackPressedHandler, zIsInState, this);
    }

    @Override // com.android.launcher3.uioverrides.QuickstepLauncher, com.android.launcher3.Launcher
    public Stream<SystemShortcut.Factory<?>> getSupportedShortcuts() {
        Stream<SystemShortcut.Factory> supportedShortcuts = super.getSupportedShortcuts();
        app.lawnchair.ui.popup.o.a aVar = app.lawnchair.ui.popup.o.f36047a;
        Stream<SystemShortcut.Factory<?>> streamConcat = Stream.concat(supportedShortcuts, Stream.concat(Stream.of((Object[]) new SystemShortcut.Factory[]{aVar.e(), aVar.c()}), LawnchairApp.INSTANCE.g() ? Stream.of(aVar.d()) : Stream.empty()));
        streamConcat.getClass();
        return streamConcat;
    }

    @Override // com.android.launcher3.uioverrides.QuickstepLauncher, com.android.launcher3.Launcher
    public void handleGestureContract(Intent intent) {
        GestureNavContract gestureNavContractFromIntent;
        if (LawnchairApp.INSTANCE.g() || !getPrefs().X0().get().booleanValue() || (gestureNavContractFromIntent = GestureNavContract.fromIntent(intent)) == null) {
            return;
        }
        AbstractFloatingView.closeOpenViews(this, false, 8192);
        LawnchairFloatingSurfaceView.INSTANCE.b(this, gestureNavContractFromIntent);
    }

    @Override // com.android.launcher3.Launcher
    public void handleHomeTap() {
        getGestureController().e();
    }

    public final boolean hasPendingDefaultHomePromptAfterMinusOne$launcher_lawnWithQuickstepProductionRelease() {
        return (!this.pendingDefaultHomePromptAfterMinusOne || app.lawnchair.util.n0.t(this) || isFinishing() || isDestroyed()) ? false : true;
    }

    public final boolean launchPendingDefaultHomePromptFromMinusOne$launcher_lawnWithQuickstepProductionRelease() {
        if (!this.pendingDefaultHomePromptAfterMinusOne) {
            return false;
        }
        if (app.lawnchair.util.n0.t(this)) {
            this.pendingDefaultHomePromptAfterMinusOne = false;
            removeDefaultHomeReminder();
            return false;
        }
        if (!hasBeenResumed() || !isInState(LauncherState.NORMAL) || !getDefaultOverlay().isOverlayOpen() || isFinishing() || isDestroyed()) {
            return false;
        }
        this.pendingDefaultHomePromptAfterMinusOne = false;
        DefaultHomeOnboardingHelper.requestDefaultHome$default(DefaultHomeOnboardingHelper.INSTANCE, this, REQUEST_DEFAULT_HOME_AFTER_MINUS_ONE, null, 4, null);
        return true;
    }

    @Override // com.android.launcher3.uioverrides.QuickstepLauncher, com.android.launcher3.BaseDraggingActivity, com.android.launcher3.views.ActivityContext
    public ActivityOptionsWrapper makeDefaultActivityOptions(int splashScreenStyle) {
        final RunnableList runnableList = new RunnableList();
        ActivityOptions activityOptionsMakeCustomAnimation = Utilities.ATLEAST_Q ? x5.a.b().makeCustomAnimation(this, 0, 0, Executors.MAIN_EXECUTOR.getHandler(), null, new Runnable() { // from class: app.lawnchair.n1
            @Override // java.lang.Runnable
            public final void run() {
                LawnchairLauncher.K0(runnableList);
            }
        }) : ActivityOptions.makeBasic();
        if (Utilities.ATLEAST_T) {
            activityOptionsMakeCustomAnimation.setSplashScreenStyle(splashScreenStyle);
        }
        Utilities.allowBGLaunch(activityOptionsMakeCustomAnimation);
        return new ActivityOptionsWrapper(activityOptionsMakeCustomAnimation, runnableList);
    }

    @Override // com.android.launcher3.uioverrides.QuickstepLauncher, com.android.launcher3.Launcher, com.android.launcher3.statemanager.StatefulActivity, com.android.launcher3.BaseDraggingActivity, com.android.launcher3.BaseActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle savedInstanceState) throws Throwable {
        if (!Utilities.ATLEAST_Q) {
            b.w.b(this, null, b.t0.a.e(b.t0.f39479e, 0, 0, null, 4, null), 1, null);
        }
        getLayoutInflater().setFactory2(new d2(this));
        super.onCreate(savedInstanceState);
        kotlinx.coroutines.k.d(LifecycleOwnerKt.getLifecycleScope(this), null, null, new h(null), 3, null);
        this.floatingNotification = new LauncherFloatingNotification(this);
        Intent intent = getIntent();
        intent.getClass();
        boolean zConsumeMinusOneRestoreRequest = consumeMinusOneRestoreRequest(intent);
        Intent intent2 = getIntent();
        intent2.getClass();
        this.pendingDefaultHomePromptAfterMinusOne = consumeDefaultHomePromptAfterMinusOneRequest(intent2);
        consumeDefaultHomePromptAfterHotSplash();
        Intent intent3 = getIntent();
        intent3.getClass();
        restoreMinusOneAfterStartup(zConsumeMinusOneRestoreRequest, consumeExternalHotSplashRequest(intent3) && com.neeeex.eraser.ads.e.b0().y0(this));
        Intent intent4 = getIntent();
        intent4.getClass();
        captureMinusOneRoute(intent4);
        getPrefs().A1().h(this, new Runnable() { // from class: app.lawnchair.a1
            @Override // java.lang.Runnable
            public final void run() {
                this.f34471a.updateTheme();
            }
        });
        b2.a(this).getStateManager().addStateListener(this.clearSearchStateListener);
        b2.a(this).getStateManager().addStateListener(this.minusOneEdgeStateListener);
        getWorkspace().addOnLayoutChangeListener(this.defaultHomeReminderLayoutChangeListener);
        installMinusOneEdgeHint();
        ensureStorageCleanWorkspaceEntry();
        ensureToolWorkspaceEntry();
        scheduleDefaultHomeReminder();
        scheduleDefaultHomePromptAfterMinusOne();
        if (getPrefs().a0().get().booleanValue()) {
            kotlinx.coroutines.k.d(LifecycleOwnerKt.getLifecycleScope(this), null, null, new i(null), 3, null);
        }
        kotlinx.coroutines.flow.i.B(kotlinx.coroutines.flow.i.G(kotlinx.coroutines.flow.i.n(getPreferenceManager2().G3().get()), new j(null)), LifecycleOwnerKt.getLifecycleScope(this));
        kotlinx.coroutines.flow.i.G(getPreferenceManager2().T3().get(), new k(null));
        kotlinx.coroutines.flow.i.B(kotlinx.coroutines.flow.i.G(getPreferenceManager2().v3().get(), new l(null)), LifecycleOwnerKt.getLifecycleScope(this));
        getPrefs().B1().j(this, new x2.c() { // from class: app.lawnchair.b1
            @Override // x2.c
            public final void accept(Object obj) {
                LawnchairLauncher.Y0(((Boolean) obj).booleanValue());
            }
        });
        getPrefs().f2().j(this, new x2.c() { // from class: app.lawnchair.c1
            @Override // x2.c
            public final void accept(Object obj) {
                LawnchairLauncher.v0(((Integer) obj).intValue());
            }
        });
        com.patrykmichalik.opto.core.a.c(getPreferenceManager2().x3(), LifecycleOwnerKt.getLifecycleScope(this), new Function1() { // from class: app.lawnchair.d1
            @Override // p003kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return LawnchairLauncher.P0(((Boolean) obj).booleanValue());
            }
        });
        final boolean attrBoolean = Themes.getAttrBoolean(this, R.attr.isWorkspaceDarkText);
        com.patrykmichalik.opto.core.a.c(getPreferenceManager2().u2(), LifecycleOwnerKt.getLifecycleScope(this), new Function1() { // from class: app.lawnchair.e1
            @Override // p003kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return LawnchairLauncher.N0(this.f34933a, attrBoolean, ((Boolean) obj).booleanValue());
            }
        });
        com.patrykmichalik.opto.core.a.c(getPreferenceManager2().q2(), LifecycleOwnerKt.getLifecycleScope(this), new Function1() { // from class: app.lawnchair.f1
            @Override // p003kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return LawnchairLauncher.r0(this.f34938a, (app.lawnchair.gestures.config.b) obj);
            }
        });
        app.lawnchair.ui.popup.i iVar = app.lawnchair.ui.popup.i.f36044a;
        iVar.k(b2.a(this));
        iVar.j(b2.a(this));
        if (getPrefs().Z1().get().booleanValue()) {
            PackageManager packageManager = getPackageManager();
            packageManager.getClass();
            if (app.lawnchair.util.b1.b(packageManager, this).isEmpty()) {
                getPrefs().Z1().r(false);
            }
        }
        this.colorScheme = getThemeProvider().k();
        LawnchairApp.INSTANCE.h(this);
        reloadIconsIfNeeded();
        ((AppDatabase) AppDatabase.INSTANCE.a().e(this)).Z();
    }

    @Override // com.android.launcher3.uioverrides.QuickstepLauncher, com.android.launcher3.Launcher, com.android.launcher3.BaseDraggingActivity, com.android.launcher3.BaseActivity, android.app.Activity
    public void onDestroy() {
        getWorkspaceToolEntry().destroy();
        LauncherFloatingNotification launcherFloatingNotification = this.floatingNotification;
        if (launcherFloatingNotification != null) {
            launcherFloatingNotification.destroy();
        }
        this.floatingNotification = null;
        this.minusOneGuideScheduled = false;
        this.minusOneGuideOverlay = null;
        this.defaultHomeReminderScheduled = false;
        this.pendingDefaultHomePromptAfterMinusOne = false;
        this.defaultHomePromptScheduled = false;
        getWorkspace().removeOverlayCallback(this.minusOneEdgeOverlayCallback);
        b2.a(this).getStateManager().removeStateListener(this.minusOneEdgeStateListener);
        getDragLayer().removeOnLayoutChangeListener(this.minusOneEdgeLayoutChangeListener);
        ToolMinusOneEdgeHintView toolMinusOneEdgeHintView = this.minusOneEdgeHint;
        if (toolMinusOneEdgeHintView != null) {
            ViewParent parent = toolMinusOneEdgeHintView.getParent();
            ViewGroup viewGroup = parent instanceof ViewGroup ? (ViewGroup) parent : null;
            if (viewGroup != null) {
                viewGroup.removeView(toolMinusOneEdgeHintView);
            }
        }
        this.minusOneEdgeHint = null;
        getWorkspace().removeOnLayoutChangeListener(this.defaultHomeReminderLayoutChangeListener);
        removeDefaultHomeReminder();
        super.onDestroy();
        SmartspacerClient.INSTANCE.close();
    }

    @Override // com.android.launcher3.uioverrides.QuickstepLauncher, com.android.launcher3.Launcher, androidx.activity.ComponentActivity, android.app.Activity
    public void onNewIntent(Intent intent) {
        intent.getClass();
        boolean z10 = false;
        if (intent.getBooleanExtra(LauncherRoutes.EXTRA_OPEN_DESKTOP_AFTER_STARTUP, false) || intent.getBooleanExtra("com.neeeex.eraser.launcher.OPEN_PANEL", false) || intent.getBooleanExtra("com.neeeex.eraser.launcher.WARM_START", false)) {
            this.suppressCustomNotificationAfterStartup = true;
        }
        boolean zConsumeMinusOneRestoreRequest = consumeMinusOneRestoreRequest(intent);
        boolean zConsumeDefaultHomePromptAfterMinusOneRequest = consumeDefaultHomePromptAfterMinusOneRequest(intent);
        boolean zConsumeExternalHotSplashRequest = consumeExternalHotSplashRequest(intent);
        super.onNewIntent(intent);
        setIntent(intent);
        if (StartupStateStore.INSTANCE.resumeOnboardingAfterHomeSelection(this)) {
            return;
        }
        if (zConsumeDefaultHomePromptAfterMinusOneRequest) {
            this.pendingDefaultHomePromptAfterMinusOne = true;
        }
        if (zConsumeExternalHotSplashRequest && com.neeeex.eraser.ads.e.b0().y0(this)) {
            z10 = true;
        }
        restoreMinusOneAfterStartup(zConsumeMinusOneRestoreRequest, z10);
        captureMinusOneRoute(intent);
        scheduleMinusOneRoute();
        scheduleMinusOneGuide();
        scheduleDefaultHomeReminder();
        scheduleDefaultHomePromptAfterMinusOne();
    }

    @Override // com.android.launcher3.Launcher
    public void onPageEndTransition() {
        super.onPageEndTransition();
        if (getWorkspace().getCurrentPage() == 0 && isInState(LauncherState.NORMAL)) {
            refreshStorageCleanWorkspaceIcon();
        }
    }

    @Override // com.android.launcher3.uioverrides.QuickstepLauncher, com.android.launcher3.Launcher, com.android.launcher3.BaseActivity, android.app.Activity
    public void onPause() {
        this.suppressCustomNotificationAfterMinusOnePause = getWorkspace().isOverlayShown() || this.minusOneOverlayProgress > MINUS_ONE_EDGE_CLOSED_EPSILON;
        super.onPause();
    }

    @Override // com.android.launcher3.uioverrides.QuickstepLauncher, com.android.launcher3.Launcher, com.android.launcher3.statemanager.StatefulActivity, com.android.launcher3.BaseActivity, android.app.Activity
    public void onResume() {
        super.onResume();
        if (StartupStateStore.INSTANCE.resumeOnboardingAfterHomeSelection(this)) {
            return;
        }
        com.neeeex.eraser.utils.b0 b0Var = com.neeeex.eraser.utils.b0.f66131a;
        if (b0Var.s(LauncherRoutes.PREF_PENDING_PANEL_RETURN, false)) {
            b0Var.z(LauncherRoutes.PREF_PENDING_PANEL_RETURN, false);
            getDefaultOverlay().requestRestoreAfterNotification();
        }
        consumeDefaultHomePromptAfterHotSplash();
        restartIfPending();
        ensureStorageCleanWorkspaceEntry();
        ensureToolWorkspaceEntry();
        if (getWorkspace().getCurrentPage() == 0) {
            refreshStorageCleanWorkspaceIcon();
        }
        scheduleMinusOneRoute();
        scheduleMinusOneGuide();
        scheduleDefaultHomePromptAfterMinusOne();
        scheduleLauncherAnalyticsReport();
        scheduleLauncherCustomNotification();
        updateMinusOneEdgeHintVisibility();
        getDragLayer().getViewTreeObserver().addOnDrawListener(new m());
    }

    @Override // com.android.launcher3.Launcher, com.android.launcher3.BaseActivity, android.app.Activity
    public void onStart() {
        super.onStart();
        DesktopRoutePolicy.INSTANCE.onDesktopStarted();
    }

    @Override // com.android.launcher3.Launcher, com.android.launcher3.statemanager.StatefulActivity, com.android.launcher3.BaseActivity, android.app.Activity
    public void onStop() {
        DesktopRoutePolicy.INSTANCE.onDesktopStopped();
        super.onStop();
    }

    @Override // com.android.launcher3.uioverrides.QuickstepLauncher, com.android.launcher3.statemanager.StatefulActivity
    public void onUiChangedWhileSleeping() {
        if (Utilities.ATLEAST_S) {
            super.onUiChangedWhileSleeping();
        }
    }

    @Override // com.android.launcher3.BaseActivity, android.app.Activity, android.view.Window.Callback
    public void onWindowFocusChanged(boolean hasFocus) {
        super.onWindowFocusChanged(hasFocus);
        updateMinusOneEdgeHintVisibility();
        if (hasFocus) {
            scheduleMinusOneGuide();
            scheduleDefaultHomeReminder();
            scheduleDefaultHomePromptAfterMinusOne();
            scheduleLauncherAnalyticsReport();
        }
    }

    public final void recreateIfNotScheduled() {
        if (sRestartFlags == 0) {
            recreate();
        }
    }

    @Override // com.android.launcher3.uioverrides.QuickstepLauncher, com.android.launcher3.BaseActivity
    public void registerBackDispatcher() {
        if (LawnchairApp.INSTANCE.f()) {
            super.registerBackDispatcher();
        }
    }

    public final void setAppOpenAdContentHost(ViewGroup host) {
        this.appOpenAdContentHost = host;
    }

    @Override // com.android.launcher3.Launcher
    public void showDefaultOptions(float x10, float y10) {
        if (!p003kotlin.text.k0.c0((CharSequence) com.patrykmichalik.opto.core.a.b(getPreferenceManager2().g3()), "+carousel", false, 2, null)) {
            super.showDefaultOptions(x10, y10);
            return;
        }
        RectF popupTarget = getPopupTarget(x10, y10);
        popupTarget.getClass();
        ArrayList<OptionsPopupView.OptionItem> options = OptionsPopupView.getOptions(this);
        options.getClass();
        show$default(this, this, popupTarget, options, false, 0, 24, null);
    }

    @Override // com.android.launcher3.uioverrides.QuickstepLauncher, com.android.launcher3.Launcher, com.android.launcher3.views.ActivityContext
    public RunnableList startActivitySafely(View v10, Intent intent, ItemInfo item) {
        intent.getClass();
        if (!isToolWorkspaceEntry(intent)) {
            return super.startActivitySafely(v10, intent, item);
        }
        ActivityOptionsWrapper activityLaunchOptions = getActivityLaunchOptions(v10, item);
        startActivity(new Intent(this, (Class<?>) SplashNEEEEXActivity.class).putExtra(LauncherRoutes.EXTRA_DESTINATION, "TOOL"), activityLaunchOptions.toBundle());
        return activityLaunchOptions.onEndCallback;
    }

    @Override // com.android.launcher3.BaseDraggingActivity
    public void updateTheme() {
        al.a aVarK = getThemeProvider().k();
        al.a aVar = this.colorScheme;
        if (aVar == null) {
            p003kotlin.jvm.internal.v.n("colorScheme");
            aVar = null;
        }
        if (p003kotlin.jvm.internal.v.c(aVarK, aVar)) {
            super.updateTheme();
        } else {
            recreate();
        }
    }

    /* JADX INFO: renamed from: app.lawnchair.LawnchairLauncher$a, reason: from kotlin metadata */
    public static final class Companion {
        public /* synthetic */ Companion(p003kotlin.jvm.internal.m mVar) {
            this();
        }

        public final LawnchairLauncher a() {
            LauncherAppState instanceNoCreate = LauncherAppState.getInstanceNoCreate();
            Launcher launcher = instanceNoCreate != null ? instanceNoCreate.getLauncher() : null;
            if (launcher instanceof LawnchairLauncher) {
                return (LawnchairLauncher) launcher;
            }
            return null;
        }

        public Companion() {
        }
    }

    @Override // com.android.launcher3.Launcher
    /* JADX INFO: renamed from: getDefaultOverlay, reason: collision with other method in class */
    public LauncherOverlayManager mo112getDefaultOverlay() {
        return getDefaultOverlay();
    }

    public static final class j extends ll.m implements tl.n {
        /* synthetic */ boolean Z$0;
        int label;

        public j(kl.f<? super j> fVar) {
            super(2, fVar);
        }

        @Override // ll.a
        public final kl.f<fl.m0> create(Object obj, kl.f<?> fVar) {
            j jVar = LawnchairLauncher.this.new j(fVar);
            jVar.Z$0 = ((Boolean) obj).booleanValue();
            return jVar;
        }

        public final Object invoke(boolean z10, kl.f<? super fl.m0> fVar) {
            return ((j) create(Boolean.valueOf(z10), fVar)).invokeSuspend(fl.m0.f80959a);
        }

        @Override // ll.a
        public final Object invokeSuspend(Object obj) {
            boolean z10 = this.Z$0;
            p003kotlin.coroutines.intrinsics.c.f();
            if (this.label != 0) {
                gq.v0.a("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            fl.v.b(obj);
            androidx.core.view.d1 insetsController = LawnchairLauncher.this.getInsetsController();
            if (z10) {
                insetsController.f(androidx.core.view.c1.p.h());
            } else {
                insetsController.a(androidx.core.view.c1.p.h());
            }
            StateManager<LauncherState, Launcher> stateManager = b2.a(LawnchairLauncher.this).getStateManager();
            LawnchairLauncher lawnchairLauncher = LawnchairLauncher.this;
            if (z10) {
                stateManager.removeStateListener(lawnchairLauncher.noStatusBarStateListener);
            } else {
                stateManager.addStateListener(lawnchairLauncher.noStatusBarStateListener);
            }
            return fl.m0.f80959a;
        }

        @Override // tl.n
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            return invoke(((Boolean) obj).booleanValue(), (kl.f<? super fl.m0>) obj2);
        }
    }

    public static final class k extends ll.m implements tl.n {
        /* synthetic */ boolean Z$0;
        int label;

        public k(kl.f<? super k> fVar) {
            super(2, fVar);
        }

        @Override // ll.a
        public final kl.f<fl.m0> create(Object obj, kl.f<?> fVar) {
            k kVar = LawnchairLauncher.this.new k(fVar);
            kVar.Z$0 = ((Boolean) obj).booleanValue();
            return kVar;
        }

        public final Object invoke(boolean z10, kl.f<? super fl.m0> fVar) {
            return ((k) create(Boolean.valueOf(z10), fVar)).invokeSuspend(fl.m0.f80959a);
        }

        @Override // ll.a
        public final Object invokeSuspend(Object obj) {
            boolean z10 = this.Z$0;
            p003kotlin.coroutines.intrinsics.c.f();
            if (this.label != 0) {
                gq.v0.a("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            fl.v.b(obj);
            StateManager<LauncherState, Launcher> stateManager = b2.a(LawnchairLauncher.this).getStateManager();
            LawnchairLauncher lawnchairLauncher = LawnchairLauncher.this;
            if (z10) {
                stateManager.addStateListener(lawnchairLauncher.statusBarClockListener);
            } else {
                stateManager.removeStateListener(lawnchairLauncher.statusBarClockListener);
                LawnchairApp.INSTANCE.e().restoreClockInStatusBar();
            }
            return fl.m0.f80959a;
        }

        @Override // tl.n
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            return invoke(((Boolean) obj).booleanValue(), (kl.f<? super fl.m0>) obj2);
        }
    }

    public static final class l extends ll.m implements tl.n {
        /* synthetic */ boolean Z$0;
        int label;

        public l(kl.f<? super l> fVar) {
            super(2, fVar);
        }

        @Override // ll.a
        public final kl.f<fl.m0> create(Object obj, kl.f<?> fVar) {
            l lVar = LawnchairLauncher.this.new l(fVar);
            lVar.Z$0 = ((Boolean) obj).booleanValue();
            return lVar;
        }

        public final Object invoke(boolean z10, kl.f<? super fl.m0> fVar) {
            return ((l) create(Boolean.valueOf(z10), fVar)).invokeSuspend(fl.m0.f80959a);
        }

        @Override // ll.a
        public final Object invokeSuspend(Object obj) {
            boolean z10 = this.Z$0;
            p003kotlin.coroutines.intrinsics.c.f();
            if (this.label != 0) {
                gq.v0.a("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            fl.v.b(obj);
            StateManager<LauncherState, Launcher> stateManager = b2.a(LawnchairLauncher.this).getStateManager();
            LawnchairLauncher lawnchairLauncher = LawnchairLauncher.this;
            if (z10) {
                stateManager.addStateListener(lawnchairLauncher.rememberPositionStateListener);
            } else {
                stateManager.removeStateListener(lawnchairLauncher.rememberPositionStateListener);
            }
            return fl.m0.f80959a;
        }

        @Override // tl.n
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            return invoke(((Boolean) obj).booleanValue(), (kl.f<? super fl.m0>) obj2);
        }
    }
}