package com.thinkup.core.common.d0;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

/* JADX INFO: loaded from: classes7.dex */
public abstract class n {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final d f67735d;

    public class d extends SQLiteOpenHelper {
        public d(Context context, String str, int i10) {
            super(context, str, (SQLiteDatabase.CursorFactory) null, i10);
        }

        @Override // android.database.sqlite.SQLiteOpenHelper
        public final void onCreate(SQLiteDatabase sQLiteDatabase) {
            n.this.d(sQLiteDatabase);
        }

        @Override // android.database.sqlite.SQLiteOpenHelper
        public final void onDowngrade(SQLiteDatabase sQLiteDatabase, int i10, int i11) {
            n.this.m(sQLiteDatabase);
        }

        @Override // android.database.sqlite.SQLiteOpenHelper
        public final void onUpgrade(SQLiteDatabase sQLiteDatabase, int i10, int i11) {
            n.this.d(sQLiteDatabase, i10, i11);
        }
    }

    public n(Context context) {
        this.f67735d = new d(context, n(), o());
    }

    public final synchronized SQLiteDatabase d() {
        return this.f67735d.getReadableDatabase();
    }

    public abstract void d(SQLiteDatabase sQLiteDatabase);

    public abstract void d(SQLiteDatabase sQLiteDatabase, int i10, int i11);

    public final synchronized SQLiteDatabase m() {
        SQLiteDatabase writableDatabase;
        try {
            writableDatabase = this.f67735d.getWritableDatabase();
        } catch (Exception unused) {
            writableDatabase = null;
        }
        return writableDatabase;
    }

    public abstract void m(SQLiteDatabase sQLiteDatabase);

    public abstract String n();

    public abstract int o();
}