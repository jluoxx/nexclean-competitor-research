package com.neeeex.eraser.launcher;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import androidx.core.app.NotificationCompat;
import com.mbridge.msdk.MBridgeConstans;
import com.neeeex.eraser.launcher.contract.ToolHost;
import com.neeeex.eraser.launcher.contract.ToolPanel;
import com.neeeex.eraser.m0;
import com.thinkup.core.common.m0.d0;
import p003kotlin.Metadata;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000e\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u000e\u0010\rJ\u0017\u0010\u0011\u001a\u00020\u000b2\u0006\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0015\u001a\u00020\u000b2\u0006\u0010\u0014\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u0015\u0010\u0016J\u000f\u0010\u0017\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u0017\u0010\rR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0018R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0019R\u0014\u0010\u001b\u001a\u00020\u001a8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR\u0016\u0010\u001e\u001a\u00020\u001d8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR\u0016\u0010 \u001a\u00020\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b \u0010!R\u0016\u0010\u0010\u001a\u00020\u000f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0010\u0010\"R\u0016\u0010\u0014\u001a\u00020\u00138\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0014\u0010#R\u0014\u0010'\u001a\u00020$8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b%\u0010&¨\u0006("}, d2 = {"Lcom/neeeex/eraser/launcher/NexCleanToolPanel;", "Lcom/neeeex/eraser/launcher/contract/ToolPanel;", "Landroid/content/Context;", "context", "Lcom/neeeex/eraser/launcher/contract/ToolHost;", d0.odd, "<init>", "(Landroid/content/Context;Lcom/neeeex/eraser/launcher/contract/ToolHost;)V", "Lcom/neeeex/eraser/launcher/NexCleanLauncherHomeView;", "createContent", "()Lcom/neeeex/eraser/launcher/NexCleanLauncherHomeView;", "Lfl/m0;", "onHostResume", "()V", "onHostPause", "", "visible", "onToolVisibilityChanged", "(Z)V", "", NotificationCompat.CATEGORY_PROGRESS, "onToolScroll", "(F)V", "onHostDestroy", "Landroid/content/Context;", "Lcom/neeeex/eraser/launcher/contract/ToolHost;", "Landroid/widget/FrameLayout;", "root", "Landroid/widget/FrameLayout;", "", "language", "Ljava/lang/String;", "content", "Lcom/neeeex/eraser/launcher/NexCleanLauncherHomeView;", "Z", "F", "Landroid/view/View;", "getView", "()Landroid/view/View;", MBridgeConstans.DYNAMIC_VIEW_KEY_VIEW, "tool-feature_productionRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class NexCleanToolPanel implements ToolPanel {
    private NexCleanLauncherHomeView content;
    private final Context context;
    private final ToolHost host;
    private String language;
    private float progress;
    private final FrameLayout root;
    private boolean visible;

    public NexCleanToolPanel(Context context, ToolHost toolHost) {
        m0.a("qpupJoGvow==\n", "yfTHUuTX15E=\n");
        context.getClass();
        m0.a("IdyblQ==\n", "SbPo4Roxyuk=\n");
        toolHost.getClass();
        this.context = context;
        this.host = toolHost;
        this.root = new FrameLayout(context);
        this.language = com.neeeex.eraser.utils.f.f66153a.a();
        this.content = createContent();
    }

    private final NexCleanLauncherHomeView createContent() {
        NexCleanLauncherHomeView nexCleanLauncherHomeView = new NexCleanLauncherHomeView(this.context, this.host);
        this.root.addView(nexCleanLauncherHomeView, new FrameLayout.LayoutParams(-1, -1));
        return nexCleanLauncherHomeView;
    }

    @Override // com.neeeex.eraser.launcher.contract.ToolPanel
    public View getView() {
        return this.root;
    }

    @Override // com.neeeex.eraser.launcher.contract.ToolPanel
    public /* bridge */ boolean onBackPressed() {
        return super.onBackPressed();
    }

    @Override // com.neeeex.eraser.launcher.contract.ToolPanel
    public /* bridge */ void onHostCreate() {
        super.onHostCreate();
    }

    @Override // com.neeeex.eraser.launcher.contract.ToolPanel
    public void onHostDestroy() {
        this.content.destroy();
    }

    @Override // com.neeeex.eraser.launcher.contract.ToolPanel
    public void onHostPause() {
        this.content.onHostPause();
    }

    @Override // com.neeeex.eraser.launcher.contract.ToolPanel
    public void onHostResume() {
        String strA = com.neeeex.eraser.utils.f.f66153a.a();
        if (!p003kotlin.jvm.internal.v.c(strA, this.language)) {
            this.content.destroy();
            this.root.removeAllViews();
            this.language = strA;
            NexCleanLauncherHomeView nexCleanLauncherHomeViewCreateContent = createContent();
            this.content = nexCleanLauncherHomeViewCreateContent;
            nexCleanLauncherHomeViewCreateContent.onPanelVisibilityChanged(this.visible);
            this.content.onPanelScroll(this.progress);
        }
        this.content.onHostResume();
    }

    @Override // com.neeeex.eraser.launcher.contract.ToolPanel
    public /* bridge */ void onHostStart() {
        super.onHostStart();
    }

    @Override // com.neeeex.eraser.launcher.contract.ToolPanel
    public /* bridge */ void onHostStop() {
        super.onHostStop();
    }

    @Override // com.neeeex.eraser.launcher.contract.ToolPanel
    public void onToolScroll(float progress) {
        this.progress = progress;
        this.content.onPanelScroll(progress);
    }

    @Override // com.neeeex.eraser.launcher.contract.ToolPanel
    public void onToolVisibilityChanged(boolean visible) {
        this.visible = visible;
        this.content.onPanelVisibilityChanged(visible);
    }
}