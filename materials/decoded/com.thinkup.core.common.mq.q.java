package com.thinkup.core.common.mq;

import android.text.TextUtils;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ScheduledFuture;

/* JADX INFO: loaded from: classes7.dex */
public class q {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final String f71515d = "q";

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final Map<String, Integer> f71516m = new ConcurrentHashMap();

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final Map<String, ScheduledFuture<?>> f71517n = new ConcurrentHashMap();

    public final void d(dm dmVar, d dVar) {
        dd ddVar;
        if (dmVar != null) {
            try {
                ddVar = dmVar.f197do;
            } catch (Throwable unused) {
                return;
            }
        } else {
            ddVar = null;
        }
        if (ddVar != null && ddVar.d(16, dmVar.f71491m)) {
            String str = dmVar.f71491m;
            Integer num = this.f71516m.get(str);
            Integer numValueOf = num != null ? Integer.valueOf(num.intValue() + 1) : 1;
            dmVar.f71489dn = numValueOf.intValue();
            this.f71516m.put(str, numValueOf);
            if (numValueOf.intValue() > ddVar.dd()) {
                return;
            }
            this.f71517n.put(str, com.thinkup.core.common.nn.m.n.d().m(new com.thinkup.core.common.nn.m.o(com.thinkup.core.common.nn.m.q.qmo, new d0(dmVar, dVar)), ddVar.dm() * ((long) numValueOf.intValue())));
        }
    }

    public final void d(dm dmVar) {
        if (dmVar == null) {
            return;
        }
        String str = dmVar.f71491m;
        if (TextUtils.isEmpty(str)) {
            return;
        }
        try {
            dmVar.f71489dn = 0;
            this.f71516m.remove(str);
            ScheduledFuture<?> scheduledFutureRemove = this.f71517n.remove(str);
            com.thinkup.core.common.nn.m.n.d();
            com.thinkup.core.common.nn.m.n.d(scheduledFutureRemove);
        } catch (Throwable unused) {
        }
    }
}