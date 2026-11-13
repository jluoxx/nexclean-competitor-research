package com.neeeex.eraser.launcher.contract;

import android.view.View;
import androidx.core.app.NotificationCompat;
import com.mbridge.msdk.MBridgeConstans;
import p003kotlin.Metadata;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0005\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0004J\u000f\u0010\u0006\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0006\u0010\u0004J\u000f\u0010\u0007\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0007\u0010\u0004J\u000f\u0010\b\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\b\u0010\u0004J\u000f\u0010\t\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\t\u0010\u0004J\u0017\u0010\f\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0012\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0017\u001a\u00020\u00148&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u0016¨\u0006\u0018À\u0006\u0003"}, d2 = {"Lcom/neeeex/eraser/launcher/contract/ToolPanel;", "", "Lfl/m0;", "onHostCreate", "()V", "onHostStart", "onHostResume", "onHostPause", "onHostStop", "onHostDestroy", "", NotificationCompat.CATEGORY_PROGRESS, "onToolScroll", "(F)V", "", "visible", "onToolVisibilityChanged", "(Z)V", "onBackPressed", "()Z", "Landroid/view/View;", "getView", "()Landroid/view/View;", MBridgeConstans.DYNAMIC_VIEW_KEY_VIEW, "launcher-contract_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
public interface ToolPanel {

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class DefaultImpls {
        @Deprecated
        public static boolean onBackPressed(ToolPanel toolPanel) {
            return ToolPanel.super.onBackPressed();
        }

        @Deprecated
        public static void onHostCreate(ToolPanel toolPanel) {
            ToolPanel.super.onHostCreate();
        }

        @Deprecated
        public static void onHostDestroy(ToolPanel toolPanel) {
            ToolPanel.super.onHostDestroy();
        }

        @Deprecated
        public static void onHostPause(ToolPanel toolPanel) {
            ToolPanel.super.onHostPause();
        }

        @Deprecated
        public static void onHostResume(ToolPanel toolPanel) {
            ToolPanel.super.onHostResume();
        }

        @Deprecated
        public static void onHostStart(ToolPanel toolPanel) {
            ToolPanel.super.onHostStart();
        }

        @Deprecated
        public static void onHostStop(ToolPanel toolPanel) {
            ToolPanel.super.onHostStop();
        }

        @Deprecated
        public static void onToolScroll(ToolPanel toolPanel, float f10) {
            ToolPanel.super.onToolScroll(f10);
        }

        @Deprecated
        public static void onToolVisibilityChanged(ToolPanel toolPanel, boolean z10) {
            ToolPanel.super.onToolVisibilityChanged(z10);
        }
    }

    View getView();

    default boolean onBackPressed() {
        return false;
    }

    default void onHostCreate() {
    }

    default void onHostDestroy() {
    }

    default void onHostPause() {
    }

    default void onHostResume() {
    }

    default void onHostStart() {
    }

    default void onHostStop() {
    }

    default void onToolScroll(float progress) {
    }

    default void onToolVisibilityChanged(boolean visible) {
    }
}