package com.thinkup.core.common.d0;

import android.database.sqlite.SQLiteDatabase;

/* JADX INFO: loaded from: classes7.dex */
public class m<T> {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    protected n f67734q;

    public m(n nVar) {
        this.f67734q = nVar;
    }

    public final synchronized SQLiteDatabase d() {
        return this.f67734q.d();
    }

    public final synchronized SQLiteDatabase m() {
        return this.f67734q.m();
    }
}