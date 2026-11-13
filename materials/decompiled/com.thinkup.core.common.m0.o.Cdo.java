package com.thinkup.core.common.m0.o;

import android.content.Context;
import com.thinkup.core.common.nn.mo;

/* JADX INFO: renamed from: com.thinkup.core.common.m0.o.do, reason: invalid class name */
/* JADX INFO: loaded from: classes7.dex */
public final class Cdo extends o {

    /* JADX INFO: renamed from: d0, reason: collision with root package name */
    private static final long f69992d0 = 86400000;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private static final int f69993q = 5;

    /* JADX INFO: renamed from: dd, reason: collision with root package name */
    private volatile dm f69994dd;

    public Cdo(Context context) {
        super(context);
    }

    @Override // com.thinkup.core.common.m0.o.o, com.thinkup.core.common.m0.o.dn
    public final com.thinkup.core.common.m0.n.d0 d(com.thinkup.core.common.m0.n.o oVar) {
        if (!m(oVar)) {
            return null;
        }
        if (this.f69994dd == null) {
            synchronized (this.f70006o) {
                try {
                    if (this.f69994dd == null) {
                        this.f69994dd = new dm(this.f70004m, this.f70005n, new dm.d(f69992d0));
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        return this.f69994dd.d(oVar, super.d(oVar));
    }

    @Override // com.thinkup.core.common.m0.o.o
    public final boolean m(com.thinkup.core.common.m0.n.o oVar) {
        Context context = this.f70004m;
        return context != null && oVar != null && mo.d(context) && com.thinkup.core.common.m0.n.dd.f69907md.equals(oVar.m());
    }

    @Override // com.thinkup.core.common.m0.o.o
    public final String n(com.thinkup.core.common.m0.n.o oVar) {
        return this.f69994dd != null ? dm.d(oVar) : oVar.m();
    }

    @Override // com.thinkup.core.common.m0.o.dn
    public final void d(com.thinkup.core.common.m0.n.d0 d0Var, com.thinkup.core.common.m0.n.o oVar) {
        if (m(oVar) && this.f69994dd != null) {
            this.f69994dd.d(d0Var, oVar);
        }
    }
}