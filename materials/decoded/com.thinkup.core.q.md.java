package com.thinkup.core.q;

import com.thinkup.core.api.AdError;
import com.thinkup.core.api.ErrorCode;
import com.thinkup.core.common.dm.doq;

/* JADX INFO: loaded from: classes7.dex */
public class md implements com.thinkup.core.common.m0.nd {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final String f73994d = "md";

    /* JADX INFO: renamed from: d0, reason: collision with root package name */
    private com.thinkup.core.common.nd.d f73995d0;

    /* JADX INFO: renamed from: dd, reason: collision with root package name */
    private boolean[] f73996dd;

    /* JADX INFO: renamed from: dm, reason: collision with root package name */
    private com.thinkup.core.common.nn.m.o f73997dm;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final mm f73998m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final doq f73999n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private final mm.m f74000o;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private final m0 f74001q;

    public md(mm mmVar, doq doqVar, mm.m mVar, m0 m0Var, com.thinkup.core.common.nd.d dVar, com.thinkup.core.common.nn.m.o oVar, boolean[] zArr) {
        this.f73998m = mmVar;
        this.f73999n = doqVar;
        this.f74000o = mVar;
        this.f73995d0 = dVar;
        this.f73996dd = zArr;
        this.f73997dm = oVar;
        this.f74001q = m0Var;
    }

    private void d() {
        com.thinkup.core.common.nn.m.o oVar;
        com.thinkup.core.common.nd.d dVar = this.f73995d0;
        if (dVar == null || (oVar = this.f73997dm) == null) {
            return;
        }
        dVar.d(oVar);
    }

    @Override // com.thinkup.core.common.m0.nd
    public void onLoadCanceled(int i10) {
        d();
        mm.m mVar = this.f74000o;
        if (mVar == null) {
            return;
        }
        m0 m0Var = this.f74001q;
        if (m0Var == null) {
            mVar.d(ErrorCode.getErrorCode(ErrorCode.exception, "", "by canceled"));
        } else {
            mVar.d(m0Var);
        }
    }

    @Override // com.thinkup.core.common.m0.nd
    public void onLoadError(int i10, String str, AdError adError) {
        mm.m mVar;
        d();
        if (this.f73999n != null) {
            if (ErrorCode.statuError.equals(adError.getCode()) && (ErrorCode.placementIdError.equals(adError.getPlatformCode()) || ErrorCode.appIdError.equals(adError.getPlatformCode()) || "10001".equals(adError.getPlatformCode()))) {
                this.f73999n.m();
                this.f73999n.o();
                this.f73999n.n();
                if (com.thinkup.core.common.o.nd.m().qm()) {
                    this.f73999n.m();
                    this.f73999n.n();
                    this.f73999n.o();
                }
            }
            if ("699".equals(adError.getPlatformCode())) {
                this.f73998m.d(this.f73999n.m(), this.f73999n.o(), this.f74001q);
                mm.m mVar2 = this.f74000o;
                if (mVar2 != null) {
                    mVar2.d(adError);
                    return;
                }
                return;
            }
        }
        m0 m0Var = this.f74001q;
        if (m0Var == null && (mVar = this.f74000o) != null) {
            mVar.d(adError);
            return;
        }
        mm.m mVar3 = this.f74000o;
        if (mVar3 != null) {
            mVar3.d(m0Var);
        }
    }

    @Override // com.thinkup.core.common.m0.nd
    public void onLoadFinish(int i10, Object obj) {
        d();
        mm.m mVar = this.f74000o;
        if (mVar != null) {
            mVar.m();
        }
        mm mmVar = this.f73998m;
        if (mmVar != null) {
            mmVar.d(i10, obj, this.f73999n, this.f74000o, this.f73996dd, this.f74001q);
        }
    }

    @Override // com.thinkup.core.common.m0.nd
    public void onLoadStart(int i10) {
        mm.m mVar = this.f74000o;
        if (mVar != null) {
            mVar.d();
        }
    }

    public md(mm mmVar, doq doqVar, mm.m mVar, m0 m0Var) {
        this.f73998m = mmVar;
        this.f73999n = doqVar;
        this.f74000o = mVar;
        this.f74001q = m0Var;
    }
}