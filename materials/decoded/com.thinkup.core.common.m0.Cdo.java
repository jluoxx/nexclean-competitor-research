package com.thinkup.core.common.m0;

import android.content.Context;
import com.thinkup.core.api.AdError;
import com.thinkup.core.common.dm.m0q;
import com.thinkup.core.common.dm.mmd;
import com.tradplus.ads.base.common.TPError;
import java.util.Map;

/* JADX INFO: renamed from: com.thinkup.core.common.m0.do, reason: invalid class name */
/* JADX INFO: loaded from: classes7.dex */
public final class Cdo extends m {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final int f69806n = 1;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    String f69807d;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    int f69808m;

    /* JADX INFO: renamed from: m0, reason: collision with root package name */
    boolean f69809m0;

    /* JADX INFO: renamed from: md, reason: collision with root package name */
    private mmd f69810md;

    private Cdo(String str) {
        this.f69808m = 0;
        this.f69809m0 = false;
        this.f69807d = str;
    }

    public static Cdo m(String str) {
        return new Cdo(str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void nm() {
        com.thinkup.core.common.nn.m.n.d().n(new com.thinkup.core.common.nn.m.o(com.thinkup.core.common.nn.m.q.mm0, new Runnable() { // from class: com.thinkup.core.common.m0.a
            @Override // java.lang.Runnable
            public final void run() {
                this.f69652a.nn();
            }
        }));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void nn() {
        d(0, this.f69817dn);
    }

    @Override // com.thinkup.core.common.m0.m
    public final void d(AdError adError) {
        mmd mmdVar;
        if (1 != this.f69808m || (mmdVar = this.f69810md) == null) {
            return;
        }
        int iDq = mmdVar.dq();
        com.thinkup.core.common.dm.m0 m0VarOd = this.f69810md.od();
        m0q m0qVarOm = this.f69810md.om();
        if (iDq == 50 && com.thinkup.core.common.nn.o.d().d(m0VarOd, m0qVarOm) && !this.f69809m0) {
            this.f69809m0 = true;
            com.thinkup.core.common.nn.m.n.d().m(new com.thinkup.core.common.nn.m.o(com.thinkup.core.common.nn.m.q.mdq, new Runnable() { // from class: com.thinkup.core.common.m0.b
                @Override // java.lang.Runnable
                public final void run() {
                    this.f69653a.nm();
                }
            }), 3000L);
        } else {
            this.f69810md.d(adError.getPlatformCode());
            this.f69810md.m(adError.getPlatformMSG());
            com.thinkup.core.common.nn.o.d().d(m0VarOd, m0qVarOm, com.thinkup.core.common.nn.o.f72250n, "1");
            com.thinkup.core.n.o.n.d(this.f69810md);
        }
    }

    @Override // com.thinkup.core.common.m0.m
    public final Context d0() {
        return null;
    }

    @Override // com.thinkup.core.common.m0.m
    public final String dd() {
        return null;
    }

    @Override // com.thinkup.core.common.m0.m
    public final Map<String, Object> dm() {
        return null;
    }

    @Override // com.thinkup.core.common.m0.m
    public final String dq() {
        return "";
    }

    @Override // com.thinkup.core.common.m0.m
    public final void m0() {
    }

    @Override // com.thinkup.core.common.m0.m
    public final Map<String, String> n() {
        return null;
    }

    @Override // com.thinkup.core.common.m0.m
    public final byte[] o() {
        return new byte[0];
    }

    @Override // com.thinkup.core.common.m0.m
    public final String q() {
        return null;
    }

    @Override // com.thinkup.core.common.m0.m
    public final String m() {
        return this.f69807d;
    }

    private Cdo(String str, mmd mmdVar) {
        this(str);
        this.f69808m = 1;
        this.f69810md = mmdVar;
    }

    public static Cdo d(String str, mmd mmdVar) {
        return new Cdo(str, mmdVar);
    }

    @Override // com.thinkup.core.common.m0.m
    public final Object d(Object obj) {
        mmd mmdVar;
        if (1 != this.f69808m || (mmdVar = this.f69810md) == null) {
            return null;
        }
        mmdVar.d(TPError.EC_AUTORELOAD_FAILED);
        com.thinkup.core.common.nn.o.d().d(this.f69810md.od(), this.f69810md.om(), com.thinkup.core.common.nn.o.f72250n, "0");
        com.thinkup.core.n.o.n.d(this.f69810md);
        return null;
    }

    @Override // com.thinkup.core.common.m0.m
    public final int d() {
        return 2;
    }
}