package com.neeeex.eraser.receiver;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.neeeex.eraser.ads.e;
import com.neeeex.eraser.push.l;
import fl.t;
import mi.a;
import p003kotlin.Metadata;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J#\u0010\t\u001a\u00020\b2\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0016¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\u000b\u001a\u00020\bH\u0002¢\u0006\u0004\b\u000b\u0010\u0003¨\u0006\f"}, d2 = {"Lcom/neeeex/eraser/receiver/RetainADInterOvertimeNotificationReceiver;", "Landroid/content/BroadcastReceiver;", "<init>", "()V", "Landroid/content/Context;", "context", "Landroid/content/Intent;", "intent", "Lfl/m0;", "onReceive", "(Landroid/content/Context;Landroid/content/Intent;)V", "a", "tool-feature_productionRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class RetainADInterOvertimeNotificationReceiver extends BroadcastReceiver {
    public final void a() {
        a.f88870a.l0(103, 13);
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        if (intent != null) {
            l.f65528a.f(intent);
        }
        l lVar = l.f65528a;
        t tVarJ = lVar.j(103);
        l.e(lVar, ((Number) tVarJ.component1()).intValue(), (String) tVarJ.component2(), null, 4, null);
        a();
        e.b0().W(context);
    }
}