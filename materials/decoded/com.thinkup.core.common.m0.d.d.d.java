package com.thinkup.core.common.m0.d.d;

import com.thinkup.core.api.TUSDK;
import java.net.InetAddress;
import java.util.List;

/* JADX INFO: loaded from: classes7.dex */
public final class d {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final String f69665d;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final String f69666m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private com.thinkup.core.common.m0.n.d f69667n;

    /* JADX INFO: renamed from: com.thinkup.core.common.m0.d.d.d$d, reason: collision with other inner class name */
    public static class C0851d implements com.thinkup.core.common.m0.d.o {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final com.thinkup.core.common.m0.n.d f69668d;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        private final int f69669m;

        public C0851d(com.thinkup.core.common.m0.n.d dVar, boolean z10) {
            this.f69668d = dVar;
            this.f69669m = z10 ? 3 : 1;
        }

        @Override // com.thinkup.core.common.m0.d.o
        public final List<InetAddress> d(String str) {
            com.thinkup.core.common.m0.n.d dVar = this.f69668d;
            if (dVar != null) {
                dVar.mq();
                this.f69668d.d0(this.f69669m);
            }
            return dm.d(str, true, this.f69668d);
        }
    }

    public static class m implements com.thinkup.core.common.m0.d.o {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final com.thinkup.core.common.m0.n.d f69670d;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        private final int f69671m;

        public m(com.thinkup.core.common.m0.n.d dVar, boolean z10) {
            this.f69670d = dVar;
            this.f69671m = z10 ? 3 : 1;
        }

        @Override // com.thinkup.core.common.m0.d.o
        public final List<InetAddress> d(String str) {
            com.thinkup.core.common.m0.n.d dVar = this.f69670d;
            if (dVar != null) {
                dVar.mq();
                this.f69670d.d0(this.f69671m);
            }
            return dm.d(str, false, this.f69670d);
        }
    }

    public d(String str, String str2) {
        this.f69665d = str;
        this.f69666m = str2;
    }

    private static boolean m(com.thinkup.core.common.m0.n.o oVar) {
        String strM = oVar != null ? oVar.m() : "";
        if (!TUSDK.isCnSDK() && (com.thinkup.core.common.m0.n.dd.f69905m.equals(strM) || com.thinkup.core.common.m0.n.dd.f69899d.equals(strM) || "bid".equals(strM) || com.thinkup.core.common.m0.n.dd.f69901dd.equals(strM) || com.thinkup.core.common.m0.n.dd.f69902dm.equals(strM))) {
            return true;
        }
        com.thinkup.core.q.m mVarD = com.thinkup.core.q.o.d();
        return mVarD != null && mVarD.dd(strM);
    }

    public final com.thinkup.core.common.m0.d.o d(com.thinkup.core.common.m0.n.o oVar) {
        com.thinkup.core.q.m mVarD;
        String strM = oVar != null ? oVar.m() : "";
        boolean z10 = false;
        boolean z11 = (!TUSDK.isCnSDK() && (com.thinkup.core.common.m0.n.dd.f69905m.equals(strM) || com.thinkup.core.common.m0.n.dd.f69899d.equals(strM) || "bid".equals(strM) || com.thinkup.core.common.m0.n.dd.f69901dd.equals(strM) || com.thinkup.core.common.m0.n.dd.f69902dm.equals(strM))) || ((mVarD = com.thinkup.core.q.o.d()) != null && mVarD.dd(strM));
        com.thinkup.core.common.m0.n.d dVar = new com.thinkup.core.common.m0.n.d();
        dVar.o(this.f69665d);
        dVar.q(this.f69666m);
        dVar.n(com.thinkup.core.common.m0.n.dd.d(oVar != null ? oVar.m() : ""));
        this.f69667n = dVar;
        if (oVar != null && oVar.n()) {
            z10 = true;
        }
        return z11 ? new C0851d(dVar, z10) : new m(dVar, z10);
    }

    public final com.thinkup.core.common.m0.n.d d() {
        return this.f69667n;
    }

    private static boolean d(String str) {
        return com.thinkup.core.common.m0.n.dd.f69905m.equals(str) || com.thinkup.core.common.m0.n.dd.f69899d.equals(str) || "bid".equals(str) || com.thinkup.core.common.m0.n.dd.f69901dd.equals(str) || com.thinkup.core.common.m0.n.dd.f69902dm.equals(str);
    }
}