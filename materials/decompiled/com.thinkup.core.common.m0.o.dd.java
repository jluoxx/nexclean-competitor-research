package com.thinkup.core.common.m0.o;

import android.app.Activity;
import android.content.Context;
import android.text.TextUtils;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes7.dex */
public final class dd implements dn {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final String f69979d = "HttpLoaderInterceptor";

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final Context f69980m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final Map<String, dn> f69981n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private final d f69982o;

    public dd(Context context) {
        context = context instanceof Activity ? context.getApplicationContext() : context;
        this.f69980m = context;
        this.f69981n = new ConcurrentHashMap();
        this.f69982o = new d(context);
    }

    private dn d(Context context, String str) {
        dn qVar = null;
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        str.getClass();
        switch (str) {
            case "get_cdn_domain":
                qVar = new q(context);
                break;
            case "user_dau_strategy":
                qVar = new Cdo(context);
                break;
            case "app_strategy":
                qVar = new m(context);
                break;
            case "eu_traffic":
                qVar = new d0(context);
                break;
            case "get_area":
                qVar = new n(context);
                break;
        }
        if (qVar != null) {
            this.f69981n.put(str, qVar);
        }
        return qVar;
    }

    @Override // com.thinkup.core.common.m0.o.dn
    public final void d(com.thinkup.core.common.m0.n.d0 d0Var, com.thinkup.core.common.m0.n.o oVar) {
        if (this.f69980m == null || d0Var == null || oVar == null) {
            return;
        }
        try {
            d dVar = this.f69982o;
            if (dVar != null) {
                dVar.d(d0Var, oVar);
            }
            dn dnVarD = d(this.f69980m, oVar);
            if (dnVarD != null) {
                dnVarD.d(d0Var, oVar);
            }
        } catch (Throwable unused) {
        }
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    private dn d(Context context, com.thinkup.core.common.m0.n.o oVar) {
        dn qVar = null;
        if (oVar == null || this.f69981n == null) {
            return null;
        }
        String strM = oVar.m();
        dn dnVar = this.f69981n.get(strM);
        if (dnVar != null) {
            return dnVar;
        }
        synchronized (this) {
            try {
                if (!TextUtils.isEmpty(strM)) {
                    switch (strM.hashCode()) {
                        case 261237151:
                            if (strM.equals(com.thinkup.core.common.m0.n.dd.f69900d0)) {
                                qVar = new q(context);
                            }
                            break;
                        case 1051663406:
                            if (strM.equals(com.thinkup.core.common.m0.n.dd.f69907md)) {
                                qVar = new Cdo(context);
                            }
                            break;
                        case 1584672721:
                            if (strM.equals(com.thinkup.core.common.m0.n.dd.f69905m)) {
                                qVar = new m(context);
                            }
                            break;
                        case 1899111790:
                            if (strM.equals(com.thinkup.core.common.m0.n.dd.f69909n)) {
                                qVar = new d0(context);
                            }
                            break;
                        case 1976115158:
                            if (strM.equals(com.thinkup.core.common.m0.n.dd.f69910o)) {
                                qVar = new n(context);
                            }
                            break;
                    }
                    if (qVar != null) {
                        this.f69981n.put(strM, qVar);
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return qVar;
    }

    @Override // com.thinkup.core.common.m0.o.dn
    public final com.thinkup.core.common.m0.n.d0 d(com.thinkup.core.common.m0.n.o oVar) {
        dn dnVarD;
        com.thinkup.core.common.m0.n.d0 d0VarD = null;
        if (this.f69980m != null && oVar != null) {
            try {
                d dVar = this.f69982o;
                d0VarD = dVar != null ? dVar.d(oVar) : null;
                if ((d0VarD == null || !d0VarD.q()) && (dnVarD = d(this.f69980m, oVar)) != null) {
                    return dnVarD.d(oVar);
                }
            } catch (Throwable unused) {
            }
        }
        return d0VarD;
    }
}