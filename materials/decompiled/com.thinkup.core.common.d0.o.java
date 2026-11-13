package com.thinkup.core.common.d0;

import android.content.Context;
import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;
import com.thinkup.core.common.o.nd;

/* JADX INFO: loaded from: classes7.dex */
public class o extends n {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static o f67737d;

    private o(Context context) {
        super(context);
    }

    private void n(SQLiteDatabase sQLiteDatabase) {
        try {
            sQLiteDatabase.execSQL(q.d.f67741d0);
            d(sQLiteDatabase, 3, 20);
            nd.m().dd();
            String str = com.thinkup.core.common.o.dn.f72604d;
        } catch (Throwable th2) {
            th2.printStackTrace();
        }
    }

    private static void o(SQLiteDatabase sQLiteDatabase) {
        try {
            sQLiteDatabase.execSQL("DROP TABLE IF EXISTS 'sdkconfig'");
            sQLiteDatabase.execSQL("DROP TABLE IF EXISTS 'offer_data_cache'");
            sQLiteDatabase.execSQL("DROP TABLE IF EXISTS 'video_res_cache_info'");
            sQLiteDatabase.execSQL("DROP TABLE IF EXISTS 'notice_url_fail_info'");
            sQLiteDatabase.execSQL("DROP TABLE IF EXISTS 'user_value_placement'");
        } catch (Exception e10) {
            e10.printStackTrace();
        }
    }

    private void q(SQLiteDatabase sQLiteDatabase) {
        o(sQLiteDatabase);
        n(sQLiteDatabase);
    }

    @Override // com.thinkup.core.common.d0.n
    public final void d(SQLiteDatabase sQLiteDatabase, int i10, int i11) {
        while (i10 < i11) {
            if (i10 == 1 || i10 == 2) {
                o(sQLiteDatabase);
                n(sQLiteDatabase);
            } else if (i10 == 4) {
                sQLiteDatabase.execSQL(dn.d.f83do);
            } else if (i10 == 13) {
                sQLiteDatabase.execSQL("DROP TABLE IF EXISTS 'offer_data_cache'");
                sQLiteDatabase.execSQL(dn.d.f83do);
            } else if (i10 == 16) {
                sQLiteDatabase.execSQL(d0.d.f67689dd);
                sQLiteDatabase.execSQL(d0.d.f67690dm);
                sQLiteDatabase.execSQL(d0.d.f67691dn);
                sQLiteDatabase.execSQL(d0.d.f82do);
                sQLiteDatabase.execSQL(d0.d.f67692dq);
                sQLiteDatabase.execSQL(d0.d.f67694m0);
            } else if (i10 == 18) {
                sQLiteDatabase.execSQL(d.C0836d.f67679n0);
            } else if (i10 != 19) {
                switch (i10) {
                    case 7:
                        sQLiteDatabase.execSQL(dq.d.f67729dm);
                        break;
                    case 8:
                        sQLiteDatabase.execSQL(dm.m.f67706dn);
                        break;
                    case 9:
                        sQLiteDatabase.execSQL(com.thinkup.core.o.m.q.d.f73799m0);
                        break;
                    case 10:
                        try {
                            sQLiteDatabase.execSQL(com.thinkup.core.o.m.q.d.f73799m0);
                            break;
                        } catch (Throwable unused) {
                        }
                        sQLiteDatabase.execSQL("DROP TABLE IF EXISTS 'offer_data_cache'");
                        sQLiteDatabase.execSQL(dn.d.f83do);
                        break;
                    case 11:
                        sQLiteDatabase.execSQL(com.thinkup.core.o.m.q.d.f73800md);
                        sQLiteDatabase.execSQL(com.thinkup.core.o.m.q.d.f73801mm);
                        break;
                }
            } else {
                try {
                    sQLiteDatabase.execSQL(d.C0836d.f67680nd);
                    sQLiteDatabase.execSQL(d.C0836d.f67681nm);
                    sQLiteDatabase.execSQL(d.C0836d.f67682nn);
                } catch (SQLException unused2) {
                }
            }
            i10++;
        }
    }

    @Override // com.thinkup.core.common.d0.n
    public final void m(SQLiteDatabase sQLiteDatabase) {
        o(sQLiteDatabase);
        n(sQLiteDatabase);
    }

    @Override // com.thinkup.core.common.d0.n
    public final String n() {
        return "thinkup.db";
    }

    @Override // com.thinkup.core.common.d0.n
    public final int o() {
        return 20;
    }

    @Override // com.thinkup.core.common.d0.n
    public final void d(SQLiteDatabase sQLiteDatabase) {
        n(sQLiteDatabase);
    }

    public static o d(Context context) {
        if (f67737d == null) {
            synchronized (o.class) {
                try {
                    if (f67737d == null) {
                        f67737d = new o(context.getApplicationContext());
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        return f67737d;
    }
}