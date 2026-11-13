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
        m0.a("WBG60F1WoCZLXOC3HQs=\n", "P3TOmTMixUg=\n");
        intent.getClass();
        lVar.f(intent);
        getIntent().putExtra(m0.a("GftMbuOts4Uf7A8l/6mlhQi6TSH4prWIH+YPBMiEn7Y/xngf2YmFqw==\n", "epQhQI3I1uA=\n"), getTaskId());
        Application application = getApplication();
        m0.a("Y6GWf2f2cbtju44zJfAwtmynjjMz+jC7YrrXfTL5fPV5rYp2Z/Z/uCO6n3Yi8Gj7aKabYCLnPph0\nlYpjK/xztHm9lX0=\n", "DdT6E0eVENU=\n");
        application.getClass();
        com.neeeex.eraser.y yVar = (com.neeeex.eraser.y) application;
        int intExtra = getIntent().getIntExtra(m0.a("KIDjBg==\n", "TvKMa4V9yyg=\n"), 0);
        boolean z10 = 10 <= intExtra && intExtra < 14;
        if (!z10 && yVar.isToolStartupInProgress()) {
            PendingToolEntry pendingToolEntry = PendingToolEntry.INSTANCE;
            Intent intent2 = getIntent();
            m0.a("BLw+GO0pkUgX8WR/rXQ=\n", "Y9lKUYNd9CY=\n");
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
            target.putExtra(m0.a("4/AZVbU2Us7l51oeqTJEzvKxGBquPVTD5e1aP54AY+LO3iAylB0=\n", "gJ90e9tTN6s=\n"), m0.a("aPb/tuqX7C1y8OSx84ruPmH8/w==\n", "Jrmr/6zer2w=\n"));
        } else {
            NotificationRouter notificationRouter = NotificationRouter.INSTANCE;
            Intent intent3 = getIntent();
            m0.a("K9xBGsY0JG04kRt9hmk=\n", "TLk1U6hAQQM=\n");
            intent3.getClass();
            target = notificationRouter.readTarget(this, intent3);
        }
        if (getIntent().getIntExtra(m0.a("hGNjWQ==\n", "4hEMNPAlIOA=\n"), 0) == 10 && SplashRetainTask.startInSourceTask(this, target)) {
            DesktopNavigator.INSTANCE.finishDelivery(this, Integer.valueOf(getIntent().getIntExtra(m0.a("wVXhtqvfEP3XUey+tug84MdX7rKHwy782Xrksw==\n", "siWN19i3T48=\n"), -1)));
        } else {
            startupStateStore.startInOwnerTask(this, target);
            finish();
        }
    }

    @Override // android.app.Activity
    public void onCreate(Bundle savedInstanceState) {
        if (!getIntent().hasExtra(m0.a("Ve1QYeio7+Ne+15w4qDv9E/pR3DotO/mT9dQavmiyQ==\n", "O4g1BI3QsIc=\n"))) {
            getIntent().putExtra(m0.a("sr/kazJbEI65qep6OFMQmai783oyRxCLqIXkYCNRNg==\n", "3NqBDlcjT+o=\n"), DesktopRoutePolicy.INSTANCE.isDesktopStarted());
            getIntent().putExtra(m0.a("vQtq/Wso6i6yAGr0UT/FO70xbuxRNdsqoRc=\n", "024PmA5QtV4=\n"), com.neeeex.eraser.ads.e.b0().m0());
        }
        super.onCreate(savedInstanceState);
    }

    @Override // android.app.Activity
    public void onNewIntent(Intent intent) {
        m0.a("qPCI5vcS\n", "wZ78g5lmiiM=\n");
        intent.getClass();
        super.onNewIntent(intent);
        intent.putExtra(m0.a("CbA6xQWuZK4CpjTUD6ZkuRO0LdQFsmSrE4o6zhSkQg==\n", "Z9VfoGDWO8o=\n"), DesktopRoutePolicy.INSTANCE.isDesktopStarted());
        intent.putExtra(m0.a("BKQRkqkDoHgLrxGbkxSPbQSeFYOTHpF8GLg=\n", "asF098x7/wg=\n"), com.neeeex.eraser.ads.e.b0().m0());
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