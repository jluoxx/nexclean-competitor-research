package com.neeeex.ctools.features.device;

import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes7.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final d f64280a = new d();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final AtomicBoolean f64281b = new AtomicBoolean();

    public final void a() {
        f64281b.set(false);
    }

    public final boolean b() {
        return f64281b.getAndSet(false);
    }
}