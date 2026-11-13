package com.thinkup.core.common.m0.q.d;

import com.thinkup.core.common.m0.q.dn;

/* JADX INFO: loaded from: classes7.dex */
public class d extends q {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final String f70057d = "d";

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static final int f70058n = 1;

    private boolean o(dn dnVar, dn.d dVar) throws Exception {
        int iD = d(this.f70074m.getInputStream());
        if (iD != 1) {
            throw new Exception("Response Error Code:".concat(String.valueOf(iD)));
        }
        if (dVar != null) {
            dVar.d(dnVar);
        }
        return true;
    }

    @Override // com.thinkup.core.common.m0.q.d.q
    public final synchronized void d(dn dnVar, dn.d dVar) {
        o(dnVar, dVar);
    }

    @Override // com.thinkup.core.common.m0.q.d.q
    public final synchronized boolean m(dn dnVar, dn.d dVar) {
        return o(dnVar, dVar);
    }

    @Override // com.thinkup.core.common.m0.q.d.q
    public final boolean d() {
        return true;
    }
}