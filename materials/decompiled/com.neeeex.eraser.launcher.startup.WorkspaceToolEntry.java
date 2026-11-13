package com.neeeex.eraser.launcher.startup;

import android.content.ComponentName;
import android.content.Intent;
import android.database.Cursor;
import android.database.sqlite.SQLiteException;
import android.os.Process;
import app.lawnchair.LawnchairLauncher;
import com.android.launcher3.CellLayout;
import com.android.launcher3.InvariantDeviceProfile;
import com.android.launcher3.LauncherAppState;
import com.android.launcher3.LauncherSettings;
import com.android.launcher3.ShortcutAndWidgetContainer;
import com.android.launcher3.celllayout.CellPosMapper;
import com.android.launcher3.model.BgDataModel;
import com.android.launcher3.model.ModelWriter;
import com.android.launcher3.model.data.ItemInfo;
import com.android.launcher3.model.data.WorkspaceItemInfo;
import com.android.launcher3.util.Executors;
import com.android.launcher3.util.GridOccupancy;
import com.android.launcher3.util.IntSparseArrayMap;
import com.android.quickstep.util.DeviceConfigHelper;
import com.neeeex.eraser.launcher.DefaultHomeController;
import com.neeeex.eraser.launcher.LauncherRoutes;
import com.neeeex.eraser.launcher.WorkspaceToolPlacementPolicy;
import com.neeeex.eraser.utils.b0;
import com.reyun.solar.engine.core.LogReporter;
import fl.m0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.function.Consumer;
import p003kotlin.Metadata;
import p003kotlin.jvm.internal.m;
import p003kotlin.jvm.internal.v;
import p003kotlin.text.k0;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u0000 +2\u00020\u0001:\u0001+B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J/\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\nH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u001f\u0010\u0014\u001a\u00020\n2\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u0012H\u0002¢\u0006\u0004\b\u0014\u0010\u0015J'\u0010\u001a\u001a\u00020\n2\u0006\u0010\u0016\u001a\u00020\b2\u0006\u0010\u0017\u001a\u00020\b2\u0006\u0010\u0019\u001a\u00020\u0018H\u0002¢\u0006\u0004\b\u001a\u0010\u001bJ\u0017\u0010\u001d\u001a\u00020\r2\u0006\u0010\u001c\u001a\u00020\nH\u0002¢\u0006\u0004\b\u001d\u0010\u001eJ\r\u0010\u001f\u001a\u00020\r¢\u0006\u0004\b\u001f\u0010 J\r\u0010!\u001a\u00020\r¢\u0006\u0004\b!\u0010 R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\"R\u0014\u0010$\u001a\u00020#8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010%R\u0016\u0010&\u001a\u00020\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b&\u0010'R\u0014\u0010)\u001a\u00020(8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b)\u0010*¨\u0006,"}, d2 = {"Lcom/neeeex/eraser/launcher/startup/WorkspaceToolEntry;", "", "Lapp/lawnchair/LawnchairLauncher;", DeviceConfigHelper.NAMESPACE_LAUNCHER, "<init>", "(Lapp/lawnchair/LawnchairLauncher;)V", "Lcom/android/launcher3/model/BgDataModel;", "model", "", "firstScreen", "", "mirrorCells", "reserveReminder", "Lfl/m0;", "placeInLoadedModel", "(Lcom/android/launcher3/model/BgDataModel;IZZ)V", "Lcom/android/launcher3/model/data/WorkspaceItemInfo;", "item", "", "marker", "isOwnedEntry", "(Lcom/android/launcher3/model/data/WorkspaceItemInfo;Ljava/lang/String;)Z", "id", "screen", "Lcom/neeeex/eraser/launcher/WorkspaceToolPlacementPolicy$Cell;", "cell", "persistedAt", "(IILcom/neeeex/eraser/launcher/WorkspaceToolPlacementPolicy$Cell;)Z", "retryWhenLoaded", "defer", "(Z)V", "ensureAddedOnce", "()V", "destroy", "Lapp/lawnchair/LawnchairLauncher;", "Ljava/util/concurrent/atomic/AtomicBoolean;", "inFlight", "Ljava/util/concurrent/atomic/AtomicBoolean;", "destroyed", "Z", "Ljava/lang/Runnable;", LogReporter.KEY_RETRY, "Ljava/lang/Runnable;", "Companion", "launcher_lawnWithQuickstepProductionRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class WorkspaceToolEntry {

    @Deprecated
    public static final String POSITION_MIGRATED = "neeeex_workspace_tool_first_screen_left_of_clean_v1";
    private volatile boolean destroyed;
    private final AtomicBoolean inFlight;
    private final LawnchairLauncher launcher;
    private final Runnable retry;
    private static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    public WorkspaceToolEntry(LawnchairLauncher lawnchairLauncher) {
        lawnchairLauncher.getClass();
        this.launcher = lawnchairLauncher;
        this.inFlight = new AtomicBoolean(false);
        this.retry = new Runnable() { // from class: com.neeeex.eraser.launcher.startup.c
            @Override // java.lang.Runnable
            public final void run() {
                WorkspaceToolEntry.c(this.f65151a);
            }
        };
    }

    public static void c(WorkspaceToolEntry workspaceToolEntry) {
        workspaceToolEntry.ensureAddedOnce();
    }

    public static void d(WorkspaceToolEntry workspaceToolEntry) {
        if (workspaceToolEntry.destroyed) {
            return;
        }
        workspaceToolEntry.launcher.getDragLayer().removeCallbacks(workspaceToolEntry.retry);
        workspaceToolEntry.launcher.getDragLayer().postDelayed(workspaceToolEntry.retry, 1000L);
    }

    private final void defer(boolean retryWhenLoaded) {
        this.inFlight.set(false);
        if (retryWhenLoaded) {
            Executors.MAIN_EXECUTOR.execute(new Runnable() { // from class: com.neeeex.eraser.launcher.startup.d
                @Override // java.lang.Runnable
                public final void run() {
                    WorkspaceToolEntry.d(this.f65152a);
                }
            });
        }
    }

    public static void e(WorkspaceToolEntry workspaceToolEntry, int i10, boolean z10, boolean z11, BgDataModel bgDataModel) {
        if (workspaceToolEntry.destroyed) {
            workspaceToolEntry.inFlight.set(false);
        } else if (bgDataModel == null) {
            workspaceToolEntry.defer(true);
        } else {
            workspaceToolEntry.placeInLoadedModel(bgDataModel, i10, z10, z11);
        }
    }

    private final boolean isOwnedEntry(WorkspaceItemInfo item, String marker) {
        Intent intent;
        if (v.c(item.user, Process.myUserHandle())) {
            Intent intent2 = item.intent;
            if (v.c(intent2 != null ? intent2.getComponent() : null, new ComponentName(this.launcher.getPackageName(), LauncherRoutes.EXTERNAL_ALIAS)) && (intent = item.intent) != null && intent.getBooleanExtra(marker, false)) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Code duplicated, block: B:17:0x005c  */
    private final boolean persistedAt(int id2, int screen, WorkspaceToolPlacementPolicy.Cell cell) {
        boolean z10;
        try {
            Cursor cursorQuery = this.launcher.getModel().getModelDbController().query(LauncherSettings.Favorites.TABLE_NAME, new String[]{"container", "screen", LauncherSettings.Favorites.CELLX, LauncherSettings.Favorites.CELLY}, "_id=?", new String[]{String.valueOf(id2)}, null);
            try {
                Cursor cursor = cursorQuery;
                if (cursor.moveToFirst() && cursor.getInt(0) == -100) {
                    z10 = cursor.getInt(1) == screen && cursor.getInt(2) == cell.getX() && cursor.getInt(3) == cell.getY();
                }
                ql.c.a(cursorQuery, null);
                return z10;
            } catch (Throwable th2) {
                try {
                    throw th2;
                } catch (Throwable th3) {
                    ql.c.a(cursorQuery, th2);
                    throw th3;
                }
            }
        } catch (SQLiteException unused) {
            return false;
        }
    }

    private final void placeInLoadedModel(BgDataModel model, final int firstScreen, boolean mirrorCells, boolean reserveReminder) {
        Object next;
        Object next2;
        WorkspaceItemInfo workspaceItemInfo;
        final WorkspaceItemInfo workspaceItemInfo2;
        LauncherAppState launcherAppState = LauncherAppState.getInstance(this.launcher);
        InvariantDeviceProfile invariantDeviceProfile = launcherAppState.getInvariantDeviceProfile();
        synchronized (model) {
            try {
                IntSparseArrayMap<ItemInfo> intSparseArrayMap = model.itemsIdMap;
                intSparseArrayMap.getClass();
                ArrayList arrayList = new ArrayList();
                for (ItemInfo itemInfo : intSparseArrayMap) {
                    if (itemInfo instanceof WorkspaceItemInfo) {
                        arrayList.add(itemInfo);
                    }
                }
                Iterator it = arrayList.iterator();
                do {
                    if (!it.hasNext()) {
                        next = null;
                        break;
                    }
                    next = it.next();
                } while (!isOwnedEntry((WorkspaceItemInfo) next, LauncherRoutes.EXTRA_INTERNAL_TOOL));
                final WorkspaceItemInfo workspaceItemInfo3 = (WorkspaceItemInfo) next;
                if (workspaceItemInfo3 == null) {
                    b0 b0Var = b0.f66131a;
                    if (b0Var.s(LauncherRoutes.PREF_INTERNAL_ICON_ADDED, false)) {
                        b0Var.z(POSITION_MIGRATED, true);
                        this.inFlight.set(false);
                        return;
                    }
                }
                Iterator it2 = arrayList.iterator();
                do {
                    if (!it2.hasNext()) {
                        next2 = null;
                        break;
                    }
                    next2 = it2.next();
                } while (!isOwnedEntry((WorkspaceItemInfo) next2, "com.neeeex.eraser.OPEN_CLEAN_FROM_DESKTOP"));
                final WorkspaceItemInfo workspaceItemInfo4 = (WorkspaceItemInfo) next2;
                if (workspaceItemInfo4 == null) {
                    defer(!this.launcher.getSharedPreferences("storage_clean_workspace_entry", 0).getBoolean("migrated_v2", false));
                    return;
                }
                if (workspaceItemInfo4.container == -100 && ((workspaceItemInfo3 == null || workspaceItemInfo3.container == -100) && workspaceItemInfo4.spanX == 1 && workspaceItemInfo4.spanY == 1 && (workspaceItemInfo3 == null || (workspaceItemInfo3.spanX == 1 && workspaceItemInfo3.spanY == 1)))) {
                    GridOccupancy gridOccupancy = new GridOccupancy(invariantDeviceProfile.numColumns, invariantDeviceProfile.numRows);
                    gridOccupancy.markCells(0, 0, invariantDeviceProfile.numColumns, 1, true);
                    if (reserveReminder && invariantDeviceProfile.numRows > 3) {
                        gridOccupancy.markCells(0, 1, invariantDeviceProfile.numColumns, 2, true);
                    }
                    IntSparseArrayMap<ItemInfo> intSparseArrayMap2 = model.itemsIdMap;
                    intSparseArrayMap2.getClass();
                    for (ItemInfo itemInfo2 : intSparseArrayMap2) {
                        if (workspaceItemInfo3 == null || itemInfo2.f42032id != workspaceItemInfo3.f42032id) {
                            if (itemInfo2.f42032id != workspaceItemInfo4.f42032id && itemInfo2.container == -100 && itemInfo2.screenId == firstScreen) {
                                gridOccupancy.markCells(itemInfo2, true);
                            }
                        }
                    }
                    WorkspaceToolPlacementPolicy workspaceToolPlacementPolicy = WorkspaceToolPlacementPolicy.INSTANCE;
                    boolean[][] zArr = gridOccupancy.cells;
                    zArr.getClass();
                    final WorkspaceToolPlacementPolicy.Placement placementFindPlacement = workspaceToolPlacementPolicy.findPlacement(zArr, placeInLoadedModel$lambda$0$firstPageCell(firstScreen, workspaceItemInfo4), placeInLoadedModel$lambda$0$firstPageCell(firstScreen, workspaceItemInfo3), mirrorCells);
                    if (placementFindPlacement == null) {
                        defer(false);
                        return;
                    }
                    ModelWriter writer = this.launcher.getModel().getWriter(false, CellPosMapper.DEFAULT, null);
                    writer.getClass();
                    if (workspaceItemInfo3 == null) {
                        workspaceItemInfo = new WorkspaceItemInfo();
                        workspaceItemInfo.user = Process.myUserHandle();
                        workspaceItemInfo.intent = new Intent("android.intent.action.MAIN").addCategory("android.intent.category.LAUNCHER").setComponent(new ComponentName(this.launcher.getPackageName(), LauncherRoutes.EXTERNAL_ALIAS)).putExtra(LauncherRoutes.EXTRA_INTERNAL_TOOL, true).setFlags(270532608);
                        workspaceItemInfo.spanX = 1;
                        workspaceItemInfo.spanY = 1;
                        launcherAppState.getIconCache().getTitleAndIcon(workspaceItemInfo, false);
                        CharSequence charSequence = workspaceItemInfo.title;
                        if (charSequence == null || k0.r0(charSequence)) {
                            workspaceItemInfo.title = this.launcher.getApplicationInfo().loadLabel(this.launcher.getPackageManager());
                        }
                    } else {
                        workspaceItemInfo = workspaceItemInfo3;
                    }
                    final ArrayList<ItemInfo> arrayList2 = new ArrayList<>();
                    placeInLoadedModel$lambda$0$moveIfNeeded(firstScreen, arrayList2, workspaceItemInfo4, placementFindPlacement.getClean());
                    if (workspaceItemInfo3 != null) {
                        placeInLoadedModel$lambda$0$moveIfNeeded(firstScreen, arrayList2, workspaceItemInfo3, placementFindPlacement.getTool());
                    }
                    if (!arrayList2.isEmpty()) {
                        writer.moveItemsInDatabase(arrayList2, -100, firstScreen);
                    }
                    if (workspaceItemInfo3 == null) {
                        WorkspaceItemInfo workspaceItemInfo5 = workspaceItemInfo;
                        writer.addItemToDatabase(workspaceItemInfo5, -100, firstScreen, placementFindPlacement.getTool().getX(), placementFindPlacement.getTool().getY());
                        workspaceItemInfo2 = workspaceItemInfo5;
                    } else {
                        workspaceItemInfo2 = workspaceItemInfo;
                    }
                    Executors.MODEL_EXECUTOR.execute(new Runnable() { // from class: com.neeeex.eraser.launcher.startup.b
                        @Override // java.lang.Runnable
                        public final void run() {
                            WorkspaceToolEntry.placeInLoadedModel$lambda$0$6(this.f65144a, workspaceItemInfo2, firstScreen, placementFindPlacement, workspaceItemInfo4, arrayList2, workspaceItemInfo3);
                        }
                    });
                    m0 m0Var = m0.f80959a;
                    return;
                }
                defer(false);
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void placeInLoadedModel$lambda$0$6(final WorkspaceToolEntry workspaceToolEntry, WorkspaceItemInfo workspaceItemInfo, int i10, WorkspaceToolPlacementPolicy.Placement placement, WorkspaceItemInfo workspaceItemInfo2, ArrayList arrayList, WorkspaceItemInfo workspaceItemInfo3) {
        final boolean z10 = workspaceToolEntry.persistedAt(workspaceItemInfo.f42032id, i10, placement.getTool()) && workspaceToolEntry.persistedAt(workspaceItemInfo2.f42032id, i10, placement.getClean());
        if (z10) {
            b0 b0Var = b0.f66131a;
            b0Var.z(LauncherRoutes.PREF_INTERNAL_ICON_ADDED, true);
            b0Var.z(POSITION_MIGRATED, true);
        }
        workspaceToolEntry.inFlight.set(false);
        if ((arrayList.isEmpty() && workspaceItemInfo3 != null && z10) || workspaceToolEntry.destroyed) {
            return;
        }
        Executors.MAIN_EXECUTOR.execute(new Runnable() { // from class: com.neeeex.eraser.launcher.startup.e
            @Override // java.lang.Runnable
            public final void run() {
                WorkspaceToolEntry.placeInLoadedModel$lambda$0$6$0(this.f65153a, z10);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void placeInLoadedModel$lambda$0$6$0(WorkspaceToolEntry workspaceToolEntry, boolean z10) {
        if (workspaceToolEntry.destroyed || workspaceToolEntry.launcher.isFinishing() || workspaceToolEntry.launcher.isDestroyed()) {
            return;
        }
        workspaceToolEntry.launcher.getModel().forceReload();
        if (z10) {
            return;
        }
        workspaceToolEntry.defer(true);
    }

    private static final WorkspaceToolPlacementPolicy.Cell placeInLoadedModel$lambda$0$firstPageCell(int i10, WorkspaceItemInfo workspaceItemInfo) {
        if (workspaceItemInfo != null) {
            if (workspaceItemInfo.screenId != i10) {
                workspaceItemInfo = null;
            }
            if (workspaceItemInfo != null) {
                return new WorkspaceToolPlacementPolicy.Cell(workspaceItemInfo.cellX, workspaceItemInfo.cellY);
            }
        }
        return null;
    }

    private static final void placeInLoadedModel$lambda$0$moveIfNeeded(int i10, ArrayList<ItemInfo> arrayList, WorkspaceItemInfo workspaceItemInfo, WorkspaceToolPlacementPolicy.Cell cell) {
        if (workspaceItemInfo.screenId == i10 && workspaceItemInfo.cellX == cell.getX() && workspaceItemInfo.cellY == cell.getY()) {
            return;
        }
        workspaceItemInfo.cellX = cell.getX();
        workspaceItemInfo.cellY = cell.getY();
        arrayList.add(workspaceItemInfo);
    }

    public final void destroy() {
        this.destroyed = true;
        this.launcher.getDragLayer().removeCallbacks(this.retry);
    }

    public final void ensureAddedOnce() {
        ShortcutAndWidgetContainer shortcutsAndWidgets;
        if (this.destroyed || this.launcher.isFinishing() || this.launcher.isDestroyed()) {
            return;
        }
        final boolean zInvertLayoutHorizontally = false;
        if (b0.f66131a.s(POSITION_MIGRATED, false) || !this.inFlight.compareAndSet(false, true)) {
            return;
        }
        Integer numValueOf = Integer.valueOf(this.launcher.getWorkspace().getScreenIdForPageIndex(0));
        if (numValueOf.intValue() < 0) {
            numValueOf = null;
        }
        final int iIntValue = numValueOf != null ? numValueOf.intValue() : 0;
        CellLayout screenWithId = this.launcher.getWorkspace().getScreenWithId(iIntValue);
        if (screenWithId != null && (shortcutsAndWidgets = screenWithId.getShortcutsAndWidgets()) != null) {
            zInvertLayoutHorizontally = shortcutsAndWidgets.invertLayoutHorizontally();
        }
        final boolean zIsDefaultHome = true ^ DefaultHomeController.INSTANCE.isDefaultHome(this.launcher);
        this.launcher.getModel().loadAsync(new Consumer() { // from class: com.neeeex.eraser.launcher.startup.a
            @Override // java.util.function.Consumer
            public final void accept(Object obj) {
                WorkspaceToolEntry.e(this.f65140a, iIntValue, zInvertLayoutHorizontally, zIsDefaultHome, (BgDataModel) obj);
            }
        });
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Lcom/neeeex/eraser/launcher/startup/WorkspaceToolEntry$Companion;", "", "<init>", "()V", "POSITION_MIGRATED", "", "launcher_lawnWithQuickstepProductionRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(m mVar) {
            this();
        }

        private Companion() {
        }
    }
}