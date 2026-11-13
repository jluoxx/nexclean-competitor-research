package com.neeeex.eraser.launcher;

import android.app.Activity;
import android.app.Application;
import android.content.Intent;
import android.os.Bundle;
import com.neeeex.eraser.m0;
import p003kotlin.Metadata;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0005\u0010\u0003J\u0019\u0010\b\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0014¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\f\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\nH\u0014¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000e\u001a\u00020\u0004H\u0014¢\u0006\u0004\b\u000e\u0010\u0003R\u0016\u0010\u0010\u001a\u00020\u000f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, d2 = {"Lcom/neeeex/eraser/launcher/NotificationDeliveryActivity;", "Landroid/app/Activity;", "<init>", "()V", "Lfl/m0;", "deliver", "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "(Landroid/os/Bundle;)V", "Landroid/content/Intent;", "intent", "onNewIntent", "(Landroid/content/Intent;)V", "onPostResume", "", "delivered", "Z", "tool-feature_productionRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class NotificationDeliveryActivity extends Activity {
    private boolean delivered;

    private final void deliver() {
        Intent target;
        com.neeeex.eraser.push.l lVar = com.neeeex.eraser.push.l.f65528a;
        Intent intent = getIntent();
        "getIntent(...)" /* decoded XOR */;
        intent.getClass();
        lVar.f(intent);
        getIntent().putExtra("com.neeeex.eraser.launcher.DELIVERY_TASK" /* decoded XOR */, getTaskId());
        Application application = getApplication();
        "null cannot be cast to non-null type com.neeeex.eraser.MyApplication" /* decoded XOR */;
        application.getClass();
        com.neeeex.eraser.y yVar = (com.neeeex.eraser.y) application;
        int intExtra = getIntent().getIntExtra("from" /* decoded XOR */, 0);
        boolean z10 = 10 <= intExtra && intExtra < 14;
        if (!z10 && yVar.isToolStartupInProgress()) {
            PendingToolEntry pendingToolEntry = PendingToolEntry.INSTANCE;
            Intent intent2 = getIntent();
            "getIntent(...)" /* decoded XOR */;
            intent2.getClass();
            pendingToolEntry.save(intent2);
        }
        NotificationEntryPolicy notificationEntryPolicy = NotificationEntryPolicy.INSTANCE;
        boolean zIsToolStartupInProgress = yVar.isToolStartupInProgress();
        StartupStateStore startupStateStore = StartupStateStore.INSTANCE;
        if (notificationEntryPolicy.continueRequiredStartup(z10, zIsToolStartupInProgress, startupStateStore.requiredFlowComplete())) {
            target = startupStateStore.continuationIntent(this);
            Bundle extras = getIntent().getExtras();
            if (extras != null) {
                target.putExtras(extras);
            }
            target.putExtra("com.neeeex.eraser.launcher.DESTINATION" /* decoded XOR */, "NOTIFICATION_TARGET" /* decoded XOR */);
        } else {
            NotificationRouter notificationRouter = NotificationRouter.INSTANCE;
            Intent intent3 = getIntent();
            "getIntent(...)" /* decoded XOR */;
            intent3.getClass();
            target = notificationRouter.readTarget(this, intent3);
        }
        if (getIntent().getIntExtra("from" /* decoded XOR */, 0) == 10 && SplashRetainTask.startInSourceTask(this, target)) {
            DesktopNavigator.INSTANCE.finishDelivery(this, Integer.valueOf(getIntent().getIntExtra("splash_retain_source_task_id" /* decoded XOR */, -1)));
        } else {
            startupStateStore.startInOwnerTask(this, target);
            finish();
        }
    }

    @Override // android.app.Activity
    public void onCreate(Bundle savedInstanceState) {
        if (!getIntent().hasExtra("neeeex_desktop_started_at_entry" /* decoded XOR */)) {
            getIntent().putExtra("neeeex_desktop_started_at_entry" /* decoded XOR */, DesktopRoutePolicy.INSTANCE.isDesktopStarted());
            getIntent().putExtra("neeeex_panel_open_at_entry" /* decoded XOR */, com.neeeex.eraser.ads.e.b0().m0());
        }
        super.onCreate(savedInstanceState);
    }

    @Override // android.app.Activity
    public void onNewIntent(Intent intent) {
        "intent" /* decoded XOR */;
        intent.getClass();
        super.onNewIntent(intent);
        intent.putExtra("neeeex_desktop_started_at_entry" /* decoded XOR */, DesktopRoutePolicy.INSTANCE.isDesktopStarted());
        intent.putExtra("neeeex_panel_open_at_entry" /* decoded XOR */, com.neeeex.eraser.ads.e.b0().m0());
        setIntent(intent);
        this.delivered = false;
    }

    @Override // android.app.Activity
    public void onPostResume() {
        super.onPostResume();
        if (this.delivered) {
            return;
        }
        this.delivered = true;
        deliver();
    }
}