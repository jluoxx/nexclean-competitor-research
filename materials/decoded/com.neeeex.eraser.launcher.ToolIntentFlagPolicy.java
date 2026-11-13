package com.neeeex.eraser.launcher;

import p003kotlin.Metadata;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0005R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000¨\u0006\b"}, d2 = {"Lcom/neeeex/eraser/launcher/ToolIntentFlagPolicy;", "", "<init>", "()V", "SPLIT_OR_CLEAR_TASK_FLAGS", "", "sanitize", "flags", "tool-feature_productionRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class ToolIntentFlagPolicy {
    public static final ToolIntentFlagPolicy INSTANCE = new ToolIntentFlagPolicy();
    private static final int SPLIT_OR_CLEAR_TASK_FLAGS = 403210240;

    private ToolIntentFlagPolicy() {
    }

    public final int sanitize(int flags) {
        return flags & (-403210241);
    }
}