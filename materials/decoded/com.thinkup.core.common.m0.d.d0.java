package com.thinkup.core.common.m0.d;

import com.tradplus.ads.base.util.BaseTimeOutAdapter;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes7.dex */
public final class d0 {

    /* JADX INFO: renamed from: do, reason: not valid java name */
    private static final long f141do = 30000;

    /* JADX INFO: renamed from: dq, reason: collision with root package name */
    private static final long f69711dq = 30000;

    /* JADX INFO: renamed from: m0, reason: collision with root package name */
    private static final long f69712m0 = 30000;

    /* JADX INFO: renamed from: md, reason: collision with root package name */
    private static final TimeUnit f69713md = TimeUnit.MILLISECONDS;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public long f69714d;

    /* JADX INFO: renamed from: d0, reason: collision with root package name */
    public TimeUnit f69715d0;

    /* JADX INFO: renamed from: dd, reason: collision with root package name */
    public final List<q> f69716dd;

    /* JADX INFO: renamed from: dm, reason: collision with root package name */
    public o f69717dm;

    /* JADX INFO: renamed from: dn, reason: collision with root package name */
    public int f69718dn;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public TimeUnit f69719m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public long f69720n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public TimeUnit f69721o;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public long f69722q;

    private d0() {
        this.f69716dd = new ArrayList();
    }

    public /* synthetic */ d0(byte b10) {
        this();
    }

    public static class d {

        /* JADX INFO: renamed from: dm, reason: collision with root package name */
        private o f69726dm;

        /* JADX INFO: renamed from: dn, reason: collision with root package name */
        private int f69727dn;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        private long f69728m = BaseTimeOutAdapter.TIME_DELTA;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private TimeUnit f69729n = d0.f69713md;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        private long f69730o = BaseTimeOutAdapter.TIME_DELTA;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        private TimeUnit f69731q = d0.f69713md;

        /* JADX INFO: renamed from: d0, reason: collision with root package name */
        private long f69724d0 = BaseTimeOutAdapter.TIME_DELTA;

        /* JADX INFO: renamed from: dd, reason: collision with root package name */
        private TimeUnit f69725dd = d0.f69713md;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final List<q> f69723d = new ArrayList();

        public final d0 d() {
            d0 d0Var = new d0((byte) 0);
            d0Var.f69722q = this.f69724d0;
            d0Var.f69715d0 = this.f69725dd;
            d0Var.f69720n = this.f69730o;
            d0Var.f69721o = this.f69731q;
            d0Var.f69714d = this.f69728m;
            d0Var.f69719m = this.f69729n;
            d0Var.f69717dm = this.f69726dm;
            d0Var.f69718dn = this.f69727dn;
            if (!this.f69723d.isEmpty()) {
                d0Var.f69716dd.addAll(new ArrayList(this.f69723d));
            }
            return d0Var;
        }

        public final d m(TimeUnit timeUnit) {
            this.f69730o = 15000L;
            this.f69731q = timeUnit;
            return this;
        }

        public final d n(TimeUnit timeUnit) {
            this.f69724d0 = 10000L;
            this.f69725dd = timeUnit;
            return this;
        }

        public final d d(o oVar) {
            this.f69726dm = oVar;
            return this;
        }

        public final d d(int i10) {
            this.f69727dn = i10;
            return this;
        }

        public final d d(TimeUnit timeUnit) {
            this.f69728m = BaseTimeOutAdapter.TIME_DELTA;
            this.f69729n = timeUnit;
            return this;
        }
    }
}