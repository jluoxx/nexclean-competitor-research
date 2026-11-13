package com.thinkup.core.common.dq.o;

import android.content.Context;
import com.thinkup.core.api.BaseAd;
import com.thinkup.core.api.TUNativeAdCustomRender;
import com.thinkup.core.api.bridge.ITUBaseAdAdapter;
import com.thinkup.core.common.dm.m0;

/* JADX INFO: loaded from: classes7.dex */
public final class d {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private Context f68864d;

    /* JADX INFO: renamed from: d0, reason: collision with root package name */
    private com.thinkup.core.common.dq.m.d.m f68865d0;

    /* JADX INFO: renamed from: dd, reason: collision with root package name */
    private boolean f68866dd;

    /* JADX INFO: renamed from: dm, reason: collision with root package name */
    private m f68867dm;

    /* JADX INFO: renamed from: dn, reason: collision with root package name */
    private int f68868dn;

    /* JADX INFO: renamed from: do, reason: not valid java name */
    private int f116do;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private BaseAd f68869m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private m0 f68870n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private TUNativeAdCustomRender f68871o;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private com.thinkup.core.common.dq.q.d.m f68872q;

    public /* synthetic */ d(byte b10) {
        this();
    }

    private int m0() {
        m mVar = this.f68867dm;
        if (mVar != null) {
            return mVar.m();
        }
        return -1;
    }

    public final int d(String str) {
        m mVar = this.f68867dm;
        return Math.max(mVar != null ? ((Integer) mVar.d(str, 5)).intValue() : 5, 3);
    }

    public final ITUBaseAdAdapter d0() {
        m mVar = this.f68867dm;
        if (mVar != null) {
            return mVar.n0();
        }
        return null;
    }

    public final m0 dd() {
        return this.f68870n;
    }

    public final boolean dm() {
        return this.f68866dd;
    }

    public final com.thinkup.core.common.dq.m.d.m dn() {
        return this.f68865d0;
    }

    /* JADX INFO: renamed from: do, reason: not valid java name */
    public final int m248do() {
        return this.f68868dn;
    }

    public final int dq() {
        return this.f116do;
    }

    public final TUNativeAdCustomRender n() {
        return this.f68871o;
    }

    public final com.thinkup.core.common.dq.q.d.m o() {
        return this.f68872q;
    }

    public final int q() {
        m mVar = this.f68867dm;
        if (mVar != null) {
            return mVar.q();
        }
        return -1;
    }

    public final BaseAd m() {
        return this.f68869m;
    }

    private d() {
    }

    public final Context d() {
        return this.f68864d;
    }

    public final void d(m mVar) {
        this.f68867dm = mVar;
    }

    /* JADX INFO: renamed from: com.thinkup.core.common.dq.o.d$d, reason: collision with other inner class name */
    public static class C0842d {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private Context f68873d;

        /* JADX INFO: renamed from: d0, reason: collision with root package name */
        private com.thinkup.core.common.dq.m.d.m f68874d0;

        /* JADX INFO: renamed from: dd, reason: collision with root package name */
        private boolean f68875dd;

        /* JADX INFO: renamed from: dm, reason: collision with root package name */
        private int f68876dm;

        /* JADX INFO: renamed from: dn, reason: collision with root package name */
        private int f68877dn;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        private BaseAd f68878m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private m0 f68879n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        private TUNativeAdCustomRender f68880o;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        private com.thinkup.core.common.dq.q.d.m f68881q;

        public final d d() {
            d dVar = new d((byte) 0);
            dVar.f68864d = this.f68873d;
            dVar.f68869m = this.f68878m;
            dVar.f68871o = this.f68880o;
            dVar.f68872q = this.f68881q;
            dVar.f68865d0 = this.f68874d0;
            dVar.f68870n = this.f68879n;
            dVar.f68866dd = this.f68875dd;
            dVar.f68868dn = this.f68876dm;
            dVar.f116do = this.f68877dn;
            return dVar;
        }

        public final C0842d m(int i10) {
            this.f68877dn = i10;
            return this;
        }

        public final C0842d d(BaseAd baseAd) {
            this.f68878m = baseAd;
            return this;
        }

        public final C0842d d(TUNativeAdCustomRender tUNativeAdCustomRender) {
            this.f68880o = tUNativeAdCustomRender;
            return this;
        }

        public final C0842d d(com.thinkup.core.common.dq.q.d.m mVar) {
            this.f68881q = mVar;
            return this;
        }

        public final C0842d d(m0 m0Var) {
            this.f68879n = m0Var;
            return this;
        }

        public final C0842d d(boolean z10) {
            this.f68875dd = z10;
            return this;
        }

        public final C0842d d(com.thinkup.core.common.dq.m.d.m mVar) {
            this.f68874d0 = mVar;
            return this;
        }

        public final C0842d d(int i10) {
            this.f68876dm = i10;
            return this;
        }

        public final C0842d d(Context context) {
            this.f68873d = context;
            return this;
        }
    }
}