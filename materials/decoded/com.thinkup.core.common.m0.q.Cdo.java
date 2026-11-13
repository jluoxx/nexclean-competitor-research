package com.thinkup.core.common.m0.q;

import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: renamed from: com.thinkup.core.common.m0.q.do, reason: invalid class name */
/* JADX INFO: loaded from: classes7.dex */
public final class Cdo {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final AtomicBoolean f70105d = new AtomicBoolean(false);

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final AtomicBoolean f70106m = new AtomicBoolean(false);

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private volatile ScheduledFuture<?> f70107n;

    private void m() {
        if (this.f70106m.compareAndSet(true, false)) {
            ScheduledFuture<?> scheduledFuture = this.f70107n;
            this.f70107n = null;
            if (scheduledFuture != null) {
                scheduledFuture.cancel(false);
            }
        }
    }

    public final void d(ScheduledFuture<?> scheduledFuture) {
        if (scheduledFuture == null) {
            return;
        }
        this.f70107n = scheduledFuture;
        this.f70106m.set(true);
        if (this.f70105d.get()) {
            m();
        }
    }

    public final boolean d() {
        if (!this.f70105d.compareAndSet(false, true)) {
            return false;
        }
        m();
        return true;
    }
}