package com.neeeex.eraser.launcher;

import p003kotlin.Metadata;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0007\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J8\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u00052\u0006\u0010\n\u001a\u00020\u00052\u0006\u0010\u000b\u001a\u00020\u00052\u0006\u0010\f\u001a\u00020\b2\u0006\u0010\r\u001a\u00020\b2\b\b\u0002\u0010\u000e\u001a\u00020\u0005R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u000f"}, d2 = {"Lcom/neeeex/eraser/launcher/MinusOneAdPolicy;", "", "<init>", "()V", "MIN_INSTALL_AGE_MILLIS", "", "COOLDOWN_MILLIS", "eligible", "", "now", "installedAt", "lastShownAt", "attributed", "ready", "cooldownMillis", "tool-feature_productionRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class MinusOneAdPolicy {
    public static final long COOLDOWN_MILLIS = 300000;
    public static final MinusOneAdPolicy INSTANCE = new MinusOneAdPolicy();
    public static final long MIN_INSTALL_AGE_MILLIS = 600000;

    private MinusOneAdPolicy() {
    }

    public final boolean eligible(long now, long installedAt, long lastShownAt, boolean attributed, boolean ready, long cooldownMillis) {
        if (!attributed || !ready || installedAt <= 0 || now < installedAt || now - installedAt < 600000) {
            return false;
        }
        if (lastShownAt != 0) {
            return now >= lastShownAt && now - lastShownAt >= cooldownMillis;
        }
        return true;
    }
}