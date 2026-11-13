package com.thinkup.core.common.m0.d;

import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: com.thinkup.core.common.m0.d.do, reason: invalid class name */
/* JADX INFO: loaded from: classes7.dex */
public final class Cdo {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public dn f69742d;

    /* JADX INFO: renamed from: d0, reason: collision with root package name */
    public Map<String, List<String>> f69743d0;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public int f69744m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public String f69745n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public Throwable f69746o;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public dq f69747q;

    public /* synthetic */ Cdo(byte b10) {
        this();
    }

    private boolean d() {
        int i10 = this.f69744m;
        return i10 == 200 || i10 == 201 || i10 == 204;
    }

    public final String toString() {
        return "NetBridgeResponse{request=" + this.f69742d + ", code=" + this.f69744m + ", errorMsg='" + this.f69745n + "', exception=" + this.f69746o + ", responseBody=" + this.f69747q + ", responseHeader=" + this.f69743d0 + '}';
    }

    private Cdo() {
    }

    /* JADX INFO: renamed from: com.thinkup.core.common.m0.d.do$d */
    public static class d {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private dn f69748d;

        /* JADX INFO: renamed from: d0, reason: collision with root package name */
        private Map<String, List<String>> f69749d0;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        private int f69750m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private String f69751n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        private Throwable f69752o;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        private dq f69753q;

        public final Cdo d() {
            Cdo cdo = new Cdo((byte) 0);
            cdo.f69742d = this.f69748d;
            cdo.f69744m = this.f69750m;
            cdo.f69745n = this.f69751n;
            cdo.f69746o = this.f69752o;
            cdo.f69747q = this.f69753q;
            cdo.f69743d0 = this.f69749d0;
            return cdo;
        }

        public final d d(int i10) {
            this.f69750m = i10;
            return this;
        }

        public final d d(String str) {
            this.f69751n = str;
            return this;
        }

        public final d d(Throwable th2) {
            this.f69752o = th2;
            return this;
        }

        public final d d(dq dqVar) {
            this.f69753q = dqVar;
            return this;
        }

        public final d d(Map<String, List<String>> map) {
            this.f69749d0 = map;
            return this;
        }

        public final d d(dn dnVar) {
            this.f69748d = dnVar;
            return this;
        }
    }
}