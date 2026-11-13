package com.neeeex.eraser.launcher;

import android.content.Intent;
import android.net.Uri;
import com.neeeex.eraser.base.RootActivity;
import com.neeeex.eraser.m0;
import p003kotlin.Metadata;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0014¢\u0006\u0004\b\u0005\u0010\u0003R\u0016\u0010\u0007\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lcom/neeeex/eraser/launcher/MinusOneRouteActivity;", "Lcom/neeeex/eraser/base/RootActivity;", "<init>", "()V", "Lfl/m0;", "onPostResume", "", "delivered", "Z", "tool-feature_productionRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class MinusOneRouteActivity extends RootActivity {
    private boolean delivered;

    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onPostResume() {
        super.onPostResume();
        if (this.delivered) {
            return;
        }
        this.delivered = true;
        NotificationRouter notificationRouter = NotificationRouter.INSTANCE;
        Intent intent = getIntent();
        m0.a("VNUB3OPBjrdHmFu7o5w=\n", "M7B1lY2169k=\n");
        intent.getClass();
        Intent intentBusinessTarget = notificationRouter.businessTarget(this, intent);
        if (!p003kotlin.jvm.internal.v.c(intentBusinessTarget.getComponent(), getComponentName())) {
            Intent intent2 = DesktopNavigator.INSTANCE.toolIntent(intentBusinessTarget);
            Uri data = getIntent().getData();
            if (data != null) {
                intent2.setDataAndType(data, getIntent().getType());
            }
            intent2.setClipData(getIntent().getClipData());
            intent2.addFlags(1 & getIntent().getFlags());
            startActivity(intent2);
        }
        finish();
        overridePendingTransition(0, 0);
    }
}