package com.neeeex.eraser.launcher;

import android.content.Context;
import com.neeeex.eraser.m0;
import p003kotlin.Metadata;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u001d\u0010\r\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eR\u0018\u0010\u000f\u001a\u0004\u0018\u00010\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, d2 = {"Lcom/neeeex/eraser/launcher/DefaultHomeSelectionTracker;", "", "<init>", "()V", "", "source", "Lfl/m0;", "markRequestStarted", "(Ljava/lang/String;)V", "Landroid/content/Context;", "context", "", "isDefaultHome", "reportResult", "(Landroid/content/Context;Z)Z", "pendingSource", "Ljava/lang/String;", "tool-feature_productionRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class DefaultHomeSelectionTracker {
    public static final DefaultHomeSelectionTracker INSTANCE = new DefaultHomeSelectionTracker();
    private static String pendingSource;

    private DefaultHomeSelectionTracker() {
    }

    public final synchronized void markRequestStarted(String source) {
        m0.a("iI1/0Yqo\n", "++IKo+nNRtU=\n");
        source.getClass();
        pendingSource = source;
    }

    public final synchronized boolean reportResult(Context context, boolean isDefaultHome) {
        m0.a("fEZ8vJ6elA==\n", "HykSyPvm4D0=\n");
        context.getClass();
        String str = pendingSource;
        if (str == null) {
            return false;
        }
        pendingSource = null;
        if (!isDefaultHome) {
            return false;
        }
        Context applicationContext = context.getApplicationContext();
        com.neeeex.eraser.y yVar = applicationContext instanceof com.neeeex.eraser.y ? (com.neeeex.eraser.y) applicationContext : null;
        if (yVar == null) {
            return false;
        }
        yVar.ensureReportingInitialized();
        LauncherReport.INSTANCE.reportDefaultHomeSelected(str);
        return true;
    }
}