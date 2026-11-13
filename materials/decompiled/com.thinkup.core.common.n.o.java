package com.thinkup.core.common.n;

import android.content.Context;

/* JADX INFO: loaded from: classes7.dex */
public abstract class o implements q {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    static final int f71558d = 1;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    static final int f71559m = 2;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    static final int f71560n = 3;

    /* JADX INFO: renamed from: d0, reason: collision with root package name */
    protected String f71561d0;

    /* JADX INFO: renamed from: dd, reason: collision with root package name */
    protected long f71562dd;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    protected String f71563o;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    protected Context f71564q;

    public o(Context context, String str, String str2, long j10) {
        this.f71563o = str;
        this.f71564q = context;
        this.f71561d0 = str2;
        this.f71562dd = j10;
    }

    private String o() {
        return this.f71561d0;
    }

    private long q() {
        return this.f71562dd;
    }

    @Override // com.thinkup.core.common.n.q
    public final String d() {
        return this.f71563o;
    }
}