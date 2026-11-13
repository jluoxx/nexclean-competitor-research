package com.thinkup.core.common.d0;

import android.content.ContentValues;
import android.database.Cursor;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes7.dex */
public class dq extends m<com.thinkup.core.common.d.d0> {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private static volatile dq f67724m;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final String f67725d;

    public static class d {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final String f67726d = "video_res_cache_info";

        /* JADX INFO: renamed from: d0, reason: collision with root package name */
        public static final String f67727d0 = "total_size";

        /* JADX INFO: renamed from: dd, reason: collision with root package name */
        public static final String f67728dd = "update_time";

        /* JADX INFO: renamed from: dm, reason: collision with root package name */
        public static final String f67729dm = "CREATE TABLE IF NOT EXISTS video_res_cache_info(video_url TEXT, file_path TEXT, ready_rate INTEGER, download_size INTEGER, total_size INTEGER, update_time INTEGER )";

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public static final String f67730m = "video_url";

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public static final String f67731n = "file_path";

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        public static final String f67732o = "ready_rate";

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        public static final String f67733q = "download_size";
    }

    private dq(n nVar) {
        super(nVar);
        this.f67725d = dq.class.getSimpleName();
    }

    private void q() {
        try {
            Cursor cursorQuery = d().query(d.f67726d, null, null, null, null, null, null);
            if (cursorQuery != null) {
                cursorQuery.close();
            }
        } catch (Throwable unused) {
        }
    }

    public final com.thinkup.core.common.d.d0 d(String str) {
        Cursor cursorQuery;
        try {
            cursorQuery = d().query(d.f67726d, null, "video_url=?", new String[]{str}, null, null, null);
            try {
                if (cursorQuery.moveToNext()) {
                    com.thinkup.core.common.d.d0 d0Var = new com.thinkup.core.common.d.d0();
                    d0Var.d(str);
                    d0Var.m(cursorQuery.getString(cursorQuery.getColumnIndex(d.f67731n)));
                    d0Var.d(cursorQuery.getInt(cursorQuery.getColumnIndex("ready_rate")));
                    d0Var.m(cursorQuery.getLong(cursorQuery.getColumnIndex(d.f67733q)));
                    d0Var.d(cursorQuery.getLong(cursorQuery.getColumnIndex(d.f67727d0)));
                    d0Var.n(cursorQuery.getLong(cursorQuery.getColumnIndex(d.f67728dd)));
                    cursorQuery.close();
                    cursorQuery.close();
                    return d0Var;
                }
            } catch (Throwable unused) {
                if (cursorQuery != null) {
                }
                return null;
            }
        } catch (Throwable unused2) {
            cursorQuery = null;
        }
        cursorQuery.close();
        return null;
    }

    public final void m(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        try {
            ContentValues contentValues = new ContentValues();
            contentValues.put(d.f67728dd, Long.valueOf(System.currentTimeMillis()));
            m().update(d.f67726d, contentValues, "video_url = ? ", new String[]{str});
        } catch (Throwable unused) {
        }
    }

    public final long n() {
        Cursor cursorQuery;
        try {
            cursorQuery = d().query(d.f67726d, new String[]{"sum(download_size)"}, null, null, null, null, null);
            try {
                if (cursorQuery.moveToNext()) {
                    long j10 = cursorQuery.getLong(0);
                    cursorQuery.close();
                    cursorQuery.close();
                    return j10;
                }
            } catch (Throwable unused) {
                if (cursorQuery == null) {
                    return 0L;
                }
            }
        } catch (Throwable unused2) {
            cursorQuery = null;
        }
        cursorQuery.close();
        return 0L;
    }

    public final List<com.thinkup.core.common.d.d0> o() {
        Cursor cursorQuery;
        ArrayList arrayList = new ArrayList();
        try {
            cursorQuery = d().query(d.f67726d, null, null, null, null, null, "update_time DESC");
            try {
                if (cursorQuery.getCount() > 0 && cursorQuery.moveToPosition(((int) Math.round(((((double) cursorQuery.getCount()) * 1.0d) + 1.0d) / 2.0d)) - 1)) {
                    long j10 = cursorQuery.getLong(cursorQuery.getColumnIndex(d.f67728dd));
                    do {
                        com.thinkup.core.common.d.d0 d0Var = new com.thinkup.core.common.d.d0();
                        d0Var.d(cursorQuery.getString(cursorQuery.getColumnIndex("video_url")));
                        d0Var.m(cursorQuery.getString(cursorQuery.getColumnIndex(d.f67731n)));
                        d0Var.d(cursorQuery.getInt(cursorQuery.getColumnIndex("ready_rate")));
                        d0Var.m(cursorQuery.getLong(cursorQuery.getColumnIndex(d.f67733q)));
                        d0Var.d(cursorQuery.getLong(cursorQuery.getColumnIndex(d.f67727d0)));
                        d0Var.n(cursorQuery.getLong(cursorQuery.getColumnIndex(d.f67728dd)));
                        arrayList.add(d0Var);
                    } while (cursorQuery.moveToNext());
                    m().delete(d.f67726d, "update_time<=?", new String[]{String.valueOf(j10)});
                }
            } catch (Throwable unused) {
                if (cursorQuery != null) {
                }
                return arrayList;
            }
        } catch (Throwable unused2) {
            cursorQuery = null;
        }
        cursorQuery.close();
        return arrayList;
    }

    public final void n(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        try {
            m().delete(d.f67726d, "video_url=?", new String[]{str});
        } catch (Throwable unused) {
        }
    }

    public final synchronized void d(String str, String str2, long j10, long j11, int i10) {
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
            return;
        }
        try {
            ContentValues contentValues = new ContentValues();
            contentValues.put("video_url", str);
            contentValues.put(d.f67731n, str2);
            contentValues.put("ready_rate", Integer.valueOf(i10));
            contentValues.put(d.f67733q, Long.valueOf(j11));
            contentValues.put(d.f67727d0, Long.valueOf(j10));
            contentValues.put(d.f67728dd, Long.valueOf(System.currentTimeMillis()));
            if (o(str)) {
                m().update(d.f67726d, contentValues, "video_url = ? ", new String[]{str});
            } else {
                m().insert(d.f67726d, null, contentValues);
            }
        } catch (Throwable unused) {
        }
    }

    public static dq d(n nVar) {
        if (f67724m == null) {
            synchronized (dn.class) {
                try {
                    if (f67724m == null) {
                        f67724m = new dq(nVar);
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        return f67724m;
    }

    private boolean o(String str) {
        Cursor cursorQuery;
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        try {
            cursorQuery = d().query(d.f67726d, new String[]{"video_url"}, "video_url=?", new String[]{str}, null, null, null);
            if (cursorQuery != null) {
                try {
                    if (cursorQuery.getCount() > 0) {
                        cursorQuery.close();
                        cursorQuery.close();
                        return true;
                    }
                } catch (Throwable unused) {
                    if (cursorQuery != null) {
                    }
                    return false;
                }
            }
            if (cursorQuery != null) {
                cursorQuery.close();
            }
        } catch (Throwable unused2) {
            cursorQuery = null;
        }
        return false;
    }
}