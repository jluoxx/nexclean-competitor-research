package com.thinkup.core.common.d0;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;

/* JADX INFO: renamed from: com.thinkup.core.common.d0.do, reason: invalid class name */
/* JADX INFO: loaded from: classes7.dex */
public class Cdo extends n {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static Cdo f67723d;

    private Cdo(Context context) {
        super(context);
    }

    public static Cdo d(Context context) {
        if (f67723d == null) {
            synchronized (Cdo.class) {
                try {
                    if (f67723d == null) {
                        f67723d = new Cdo(context.getApplicationContext());
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        return f67723d;
    }

    private static void d0() {
    }

    private static void n(SQLiteDatabase sQLiteDatabase) {
        try {
            sQLiteDatabase.execSQL("ALTER TABLE agent_request_info ADD COLUMN create_time INTEGER DEFAULT 0");
            sQLiteDatabase.execSQL("UPDATE agent_request_info SET create_time = rowid");
        } catch (Throwable unused) {
        }
    }

    private void o(SQLiteDatabase sQLiteDatabase) {
        try {
            sQLiteDatabase.execSQL(com.thinkup.core.common.nm.d.d.d.C0863d.f71783d0);
            sQLiteDatabase.execSQL(com.thinkup.core.common.nm.d.d.m.d.f71794dd);
            d(sQLiteDatabase, 0, 2);
        } catch (Exception e10) {
            e10.printStackTrace();
        }
    }

    private static void q() {
    }

    @Override // com.thinkup.core.common.d0.n
    public final void m(SQLiteDatabase sQLiteDatabase) {
    }

    @Override // com.thinkup.core.common.d0.n
    public final String n() {
        return "thinkup_upload.db";
    }

    @Override // com.thinkup.core.common.d0.n
    public final int o() {
        return 2;
    }

    @Override // com.thinkup.core.common.d0.n
    public final void d(SQLiteDatabase sQLiteDatabase) {
        try {
            sQLiteDatabase.execSQL(com.thinkup.core.common.nm.d.d.d.C0863d.f71783d0);
            sQLiteDatabase.execSQL(com.thinkup.core.common.nm.d.d.m.d.f71794dd);
            d(sQLiteDatabase, 0, 2);
        } catch (Exception e10) {
            e10.printStackTrace();
        }
    }

    @Override // com.thinkup.core.common.d0.n
    public final void d(SQLiteDatabase sQLiteDatabase, int i10, int i11) {
        if (i10 < 2) {
            try {
                sQLiteDatabase.execSQL("ALTER TABLE agent_request_info ADD COLUMN create_time INTEGER DEFAULT 0");
                sQLiteDatabase.execSQL("UPDATE agent_request_info SET create_time = rowid");
            } catch (Throwable unused) {
            }
        }
    }
}