package com.thinkup.core.common.m0.o;

import android.content.Context;
import com.thinkup.core.common.nn.mo;

/* JADX INFO: loaded from: classes7.dex */
public final class n extends o {

    /* JADX INFO: renamed from: d0, reason: collision with root package name */
    private static final long f70000d0 = 3600000;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private static final int f70001q = 5;

    /* JADX INFO: renamed from: dd, reason: collision with root package name */
    private volatile dm f70002dd;

    public n(Context context) {
        super(context);
    }

    @Override // com.thinkup.core.common.m0.o.o, com.thinkup.core.common.m0.o.dn
    public final com.thinkup.core.common.m0.n.d0 d(com.thinkup.core.common.m0.n.o oVar) {
        if (!m(oVar)) {
            return null;
        }
        if (this.f70002dd == null) {
            synchronized (this.f70006o) {
                try {
                    if (this.f70002dd == null) {
                        this.f70002dd = new dm(this.f70004m, this.f70005n, new dm.d(f70000d0));
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        return this.f70002dd.d(oVar, super.d(oVar));
    }

    @Override // com.thinkup.core.common.m0.o.o
    public final boolean m(com.thinkup.core.common.m0.n.o oVar) {
        Context context = this.f70004m;
        return context != null && oVar != null && mo.d(context) && com.thinkup.core.common.m0.n.dd.f69910o.equals(oVar.m());
    }

    @Override // com.thinkup.core.common.m0.o.o
    public final String n(com.thinkup.core.common.m0.n.o oVar) {
        return this.f70002dd != null ? dm.d(oVar) : oVar.m();
    }

    @Override // com.thinkup.core.common.m0.o.dn
    public final void d(com.thinkup.core.common.m0.n.d0 d0Var, com.thinkup.core.common.m0.n.o oVar) {
        if (m(oVar) && this.f70002dd != null) {
            this.f70002dd.d(d0Var, oVar);
        }
    }
}