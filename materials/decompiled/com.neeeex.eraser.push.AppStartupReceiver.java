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
        m0.a("8hT8jHkKbQ==\n", "kXuS+BxyGeY=\n");
        context.getClass();
        m0.a("uV41+JmJ\n", "0DBBnff9Eoc=\n");
        intent.getClass();
        String action = intent.getAction();
        if (action != null) {
            int iHashCode = action.hashCode();
            if (iHashCode != 798292259) {
                if (iHashCode != 1737074039 || !action.equals(m0.a("NcH9Ek+ke6c9we0FTrkx6Dfb8A9O41LQC//YI2uMWMwL/dwwbIxczBA=\n", "VK+ZYCDNH4k=\n"))) {
                    return;
                }
            } else if (!action.equals(m0.a("s/x0qQasXaO7/GS+B7EX7LHmebQH63vCncZPmCaIacGXxlWf\n", "0pIQ22nFOY0=\n"))) {
                return;
            }
            m0.a("pS4kNsBPv5eRLgYA10uklYEs\n", "5F5UZbQuzeM=\n");
            intent.getAction();
            NEEEEXFGService.Companion companion = NEEEEXFGService.INSTANCE;
            Context applicationContext = context.getApplicationContext();
            m0.a("I20SqUVutPYnaRKBWnCb8Cp8A5BBNvaxaiE=\n", "RAhm6DUe2J8=\n");
            applicationContext.getClass();
            companion.b(applicationContext);
        }
    }
}