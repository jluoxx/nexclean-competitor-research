package com.neeeex.eraser.launcher.tool;

import android.content.Context;
import com.neeeex.eraser.launcher.NexCleanToolPanel;
import com.neeeex.eraser.launcher.contract.ToolHost;
import com.neeeex.eraser.launcher.contract.ToolPanel;
import com.thinkup.core.common.m0.d0;
import p003kotlin.Metadata;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0016\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t¨\u0006\n"}, d2 = {"Lcom/neeeex/eraser/launcher/tool/ToolRegistry;", "", "<init>", "()V", "create", "Lcom/neeeex/eraser/launcher/contract/ToolPanel;", "context", "Landroid/content/Context;", d0.odd, "Lcom/neeeex/eraser/launcher/contract/ToolHost;", "launcher_lawnWithQuickstepProductionRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class ToolRegistry {
    public static final int $stable = 0;
    public static final ToolRegistry INSTANCE = new ToolRegistry();

    private ToolRegistry() {
    }

    public final ToolPanel create(Context context, ToolHost host) {
        context.getClass();
        host.getClass();
        return new NexCleanToolPanel(context, host);
    }
}