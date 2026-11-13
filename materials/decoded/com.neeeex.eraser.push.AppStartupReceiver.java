package com.neeeex.eraser.push;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.neeeex.eraser.m0;
import com.neeeex.eraser.push.service.NEEEEXFGService;
import p003kotlin.Metadata;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lcom/neeeex/eraser/push/AppStartupReceiver;", "Landroid/content/BroadcastReceiver;", "<init>", "()V", "Landroid/content/Context;", "context", "Landroid/content/Intent;", "intent", "Lfl/m0;", "onReceive", "(Landroid/content/Context;Landroid/content/Intent;)V", "tool-feature_productionRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class AppStartupReceiver extends BroadcastReceiver {
    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        "context" /* decoded XOR */;
        context.getClass();
        "intent" /* decoded XOR */;
        intent.getClass();
        String action = intent.getAction();
        if (action != null) {
            int iHashCode = action.hashCode();
            if (iHashCode != 798292259) {
                if (iHashCode != 1737074039 || !action.equals("android.intent.action.MY_PACKAGE_REPLACED" /* decoded XOR */)) {
                    return;
                }
            } else if (!action.equals("android.intent.action.BOOT_COMPLETED" /* decoded XOR */)) {
                return;
            }
            "AppStartupReceiver" /* decoded XOR */;
            intent.getAction();
            NEEEEXFGService.Companion companion = NEEEEXFGService.INSTANCE;
            Context applicationContext = context.getApplicationContext();
            "getApplicationContext(...)" /* decoded XOR */;
            applicationContext.getClass();
            companion.b(applicationContext);
        }
    }
}