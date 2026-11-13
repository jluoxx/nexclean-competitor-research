package com.thinkup.core.q.d;

import com.thinkup.core.common.m0.mo;
import com.thinkup.core.common.m0.nd;
import com.thinkup.core.common.nd.n;
import com.thinkup.core.common.nn.m.o;
import com.thinkup.core.common.nn.m.q;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes7.dex */
public abstract class d extends mo {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final String f73806d = "d";

    /* JADX INFO: renamed from: dm, reason: collision with root package name */
    public static final int f73807dm = 0;

    /* JADX INFO: renamed from: dn, reason: collision with root package name */
    public static final int f73808dn = 1;

    /* JADX INFO: renamed from: do, reason: not valid java name */
    com.thinkup.core.common.nd.d f247do;

    /* JADX INFO: renamed from: dq, reason: collision with root package name */
    o f73809dq;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private List<Integer> f73810m;

    /* JADX INFO: renamed from: m0, reason: collision with root package name */
    o f73811m0;

    /* JADX INFO: renamed from: md, reason: collision with root package name */
    boolean f73812md;

    /* JADX INFO: renamed from: mm, reason: collision with root package name */
    boolean f73813mm;

    /* JADX INFO: renamed from: mn, reason: collision with root package name */
    boolean f73814mn;

    /* JADX INFO: renamed from: mo, reason: collision with root package name */
    boolean f73815mo;

    /* JADX INFO: renamed from: mq, reason: collision with root package name */
    int f73816mq;

    public d(boolean z10, nd ndVar) {
        super(ndVar);
        this.f73810m = new ArrayList(4);
        this.f73816mq = 0;
        this.f73813mm = z10;
        this.f247do = n.d();
    }

    private void d(int i10, boolean z10) {
        o oVar;
        o oVar2;
        if (i10 == 0 && (oVar2 = this.f73809dq) != null && !this.f73814mn) {
            this.f247do.d(oVar2);
            this.f73809dq = null;
        } else {
            if (i10 != 1 || (oVar = this.f73811m0) == null || this.f73815mo) {
                return;
            }
            if (z10 || this.f73816mq != 0) {
                this.f247do.d(oVar);
                this.f73811m0 = null;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void dq() {
        if (this.f73812md) {
            return;
        }
        this.f73812md = true;
        if (!n()) {
            d0();
            return;
        }
        o oVar = new o(q.d0dq, new Runnable() { // from class: com.thinkup.core.q.d.d.2
            @Override // java.lang.Runnable
            public final void run() {
                d dVar = d.this;
                dVar.f73815mo = true;
                if (dVar.dm()) {
                    return;
                }
                d.this.d0();
            }
        });
        this.f73811m0 = oVar;
        this.f247do.d(oVar, q());
        d(1, (mo) this);
    }

    public abstract void d(int i10, mo moVar);

    public abstract void d(boolean z10, int i10);

    public abstract void d0();

    public final void dd() {
        o oVar = new o(q.d0do, new Runnable() { // from class: com.thinkup.core.q.d.d.1
            @Override // java.lang.Runnable
            public final void run() {
                d dVar = d.this;
                dVar.f73814mn = true;
                if (dVar.dm()) {
                    return;
                }
                d.this.dq();
            }
        });
        this.f73809dq = oVar;
        this.f247do.d(oVar, o());
        d(0, (mo) this);
    }

    public final boolean dm() {
        return this.f73810m.contains(0);
    }

    public final boolean dn() {
        return this.f73814mn;
    }

    /* JADX INFO: renamed from: do, reason: not valid java name */
    public final boolean m310do() {
        return this.f73815mo;
    }

    public abstract void m(int i10, Object obj);

    public abstract boolean n();

    public abstract long o();

    public abstract long q();

    @Override // com.thinkup.core.common.m0.mo
    public final void d(int i10, Object obj) {
        if (i10 == 0) {
            this.f73816mq = 1;
        }
        d(i10, true);
        this.f73810m.add(Integer.valueOf(i10));
        d(true, i10);
        if (i10 == 0 && this.f73810m.size() == 2) {
            m(i10, obj);
        }
    }

    @Override // com.thinkup.core.common.m0.mo
    public final void d(int i10) {
        if (i10 == 0) {
            this.f73816mq = 2;
        }
        d(i10, false);
        d(false, i10);
        dq();
    }
}