package com.thinkup.core.q;

/* JADX INFO: loaded from: classes7.dex */
public final class d {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final int f73805d;

    public d(m mVar) {
        this.f73805d = mVar != null ? mVar.mmo() : 2;
    }

    public final void d(com.thinkup.core.common.m0.nd ndVar) {
        int i10 = this.f73805d;
        if (i10 == 1) {
            new com.thinkup.core.common.m0.m0().d(0, ndVar);
        } else {
            if (i10 == 2) {
                new com.thinkup.core.common.m0.q.q().d(ndVar);
                return;
            }
            com.thinkup.core.common.m0.mo moVar = new com.thinkup.core.common.m0.mo(ndVar);
            new com.thinkup.core.common.m0.m0().d(0, (com.thinkup.core.common.m0.nd) moVar);
            new com.thinkup.core.common.m0.q.q().d(moVar);
        }
    }

    public final int d() {
        return this.f73805d;
    }
}