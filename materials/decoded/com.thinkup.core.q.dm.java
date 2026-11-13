package com.thinkup.core.q;

import com.thinkup.core.common.dm.ddn;
import java.util.List;

/* JADX INFO: loaded from: classes7.dex */
public final class dm {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final int f73833d;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final List<ddn> f73834m;

    public dm(m mVar, List<ddn> list) {
        this.f73833d = mVar != null ? mVar.mmo() : 2;
        this.f73834m = list;
    }

    public final void d(com.thinkup.core.common.m0.nd ndVar) {
        int i10 = this.f73833d;
        if (i10 == 1) {
            new com.thinkup.core.common.m0.mm(this.f73834m).d(0, ndVar);
        } else {
            if (i10 == 2) {
                new com.thinkup.core.common.m0.q.d0(this.f73834m).d(ndVar);
                return;
            }
            com.thinkup.core.common.m0.mo moVar = new com.thinkup.core.common.m0.mo(ndVar);
            new com.thinkup.core.common.m0.mm(this.f73834m).d(0, (com.thinkup.core.common.m0.nd) moVar);
            new com.thinkup.core.common.m0.q.d0(this.f73834m).d(moVar);
        }
    }

    private int d() {
        return this.f73833d;
    }
}