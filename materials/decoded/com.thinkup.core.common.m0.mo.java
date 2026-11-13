package com.thinkup.core.common.m0;

import android.text.TextUtils;
import com.thinkup.core.api.AdError;
import com.thinkup.core.api.ErrorCode;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes7.dex */
public class mo extends n {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final String f69850d = "mo";

    /* JADX INFO: renamed from: dd, reason: collision with root package name */
    private volatile boolean f69852dd;

    /* JADX INFO: renamed from: dm, reason: collision with root package name */
    private volatile boolean f69853dm;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final nd f69855n;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final Object f69854m = new Object();

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private final AtomicInteger f69856o = new AtomicInteger(0);

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private final List<d> f69857q = new ArrayList();

    /* JADX INFO: renamed from: d0, reason: collision with root package name */
    private int f69851d0 = Math.max(1, 2);

    public static class d {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        int f69858d;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        String f69859m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        AdError f69860n;

        public d(int i10, String str, AdError adError) {
            this.f69858d = i10;
            this.f69859m = str;
            this.f69860n = adError;
        }
    }

    public mo(nd ndVar) {
        this.f69855n = ndVar;
    }

    private void m(int i10, Object obj) {
        this.f69853dm = true;
        if (this.f69855n == null || this.f69852dd) {
            return;
        }
        this.f69852dd = true;
        this.f69855n.onLoadFinish(i10, obj);
    }

    private void n() {
        if (this.f69855n == null || this.f69852dd) {
            return;
        }
        this.f69852dd = true;
        StringBuilder sb2 = new StringBuilder();
        AdError errorCode = null;
        for (d dVar : new ArrayList(this.f69857q)) {
            if (dVar != null) {
                if (TextUtils.isEmpty(sb2.toString())) {
                    sb2.append(dVar.f69859m);
                } else {
                    sb2.append(",");
                    sb2.append(dVar.f69859m);
                }
                errorCode = dVar.f69860n;
            }
        }
        this.f69857q.clear();
        if (errorCode == null) {
            errorCode = ErrorCode.getErrorCode(ErrorCode.exception, "", "");
        }
        this.f69855n.onLoadError(0, sb2.toString(), errorCode);
    }

    public final void d() {
        synchronized (this.f69854m) {
            try {
                if (this.f69852dd) {
                    return;
                }
                int i10 = this.f69851d0;
                if (i10 > 1) {
                    this.f69851d0 = i10 - 1;
                }
                if (this.f69856o.get() >= this.f69851d0 && !this.f69857q.isEmpty()) {
                    n();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // com.thinkup.core.common.m0.nd
    public void onLoadError(int i10, String str, AdError adError) {
        d(i10);
        synchronized (this.f69854m) {
            try {
                this.f69857q.add(new d(i10, str, adError));
                if (this.f69856o.incrementAndGet() >= this.f69851d0) {
                    n();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // com.thinkup.core.common.m0.nd
    public void onLoadFinish(int i10, Object obj) {
        d(i10, obj);
        synchronized (this.f69854m) {
            try {
                this.f69853dm = true;
                if (this.f69855n != null && !this.f69852dd) {
                    this.f69852dd = true;
                    this.f69855n.onLoadFinish(i10, obj);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final boolean m() {
        boolean z10;
        synchronized (this.f69854m) {
            z10 = this.f69853dm;
        }
        return z10;
    }

    public void d(int i10, Object obj) {
    }

    public void d(int i10) {
    }
}