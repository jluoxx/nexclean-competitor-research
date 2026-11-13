package com.neeeex.eraser.launcher;

import p003kotlin.Metadata;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001e\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0005¨\u0006\t"}, d2 = {"Lcom/neeeex/eraser/launcher/NotificationEntryPolicy;", "", "<init>", "()V", "continueRequiredStartup", "", "retain", "startupInProgress", "flowComplete", "tool-feature_productionRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class NotificationEntryPolicy {
    public static final NotificationEntryPolicy INSTANCE = new NotificationEntryPolicy();

    private NotificationEntryPolicy() {
    }

    public final boolean continueRequiredStartup(boolean retain, boolean startupInProgress, boolean flowComplete) {
        if (retain) {
            return false;
        }
        return startupInProgress || !flowComplete;
    }
}