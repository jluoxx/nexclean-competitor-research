package com.thinkup.core.common.d0;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import com.thinkup.core.common.dm.d0d;
import com.thinkup.core.common.dm.d0m;
import gq.e;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes7.dex */
public class d0 extends m<d0d> {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final String f67685d = "d0";

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private static volatile d0 f67686m;

    public static class d {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        static final String f67687d = "dyn_wf_ad_source_filter";

        /* JADX INFO: renamed from: d0, reason: collision with root package name */
        static final String f67688d0 = "match_error_code";

        /* JADX INFO: renamed from: dd, reason: collision with root package name */
        public static final String f67689dd = "CREATE TABLE IF NOT EXISTS dyn_wf_ad_source_filter(placement_id TEXT ,ad_source_id TEXT ,request_id TEXT ,match_error_code TEXT ,expired_timestamp INTEGER)";

        /* JADX INFO: renamed from: dm, reason: collision with root package name */
        public static final String f67690dm = "CREATE INDEX IF NOT EXISTS idx_placement_id ON dyn_wf_ad_source_filter(placement_id)";

        /* JADX INFO: renamed from: dn, reason: collision with root package name */
        public static final String f67691dn = "CREATE INDEX IF NOT EXISTS idx_ad_source_id ON dyn_wf_ad_source_filter(ad_source_id)";

        /* JADX INFO: renamed from: do, reason: not valid java name */
        public static final String f82do = "CREATE INDEX IF NOT EXISTS idx_ad_request_id ON dyn_wf_ad_source_filter(request_id)";

        /* JADX INFO: renamed from: dq, reason: collision with root package name */
        public static final String f67692dq = "CREATE INDEX IF NOT EXISTS idx_expired_timestamp ON dyn_wf_ad_source_filter(expired_timestamp)";

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        static final String f67693m = "placement_id";

        /* JADX INFO: renamed from: m0, reason: collision with root package name */
        public static final String f67694m0 = "CREATE INDEX IF NOT EXISTS idx_match_error_code ON dyn_wf_ad_source_filter(match_error_code)";

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        static final String f67695n = "ad_source_id";

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        static final String f67696o = "request_id";

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        static final String f67697q = "expired_timestamp";
    }

    private d0(n nVar) {
        super(nVar);
    }

    private boolean m(d0d d0dVar) {
        Cursor cursorQuery = d().query("dyn_wf_ad_source_filter", new String[]{"request_id"}, "request_id = ? AND ad_source_id = ?", new String[]{d0dVar.dd(), d0dVar.d()}, null, null, null);
        if (cursorQuery != null && cursorQuery.getCount() > 0) {
            cursorQuery.close();
            return true;
        }
        if (cursorQuery == null) {
            return false;
        }
        cursorQuery.close();
        return false;
    }

    private Map<String, Integer> n(String str) {
        Cursor cursorQuery;
        HashMap map = new HashMap();
        try {
            String[] strArr = {str, String.valueOf(System.currentTimeMillis())};
            cursorQuery = d().query("dyn_wf_ad_source_filter", new String[]{"ad_source_id", "count(request_id)"}, "placement_id = ? AND expired_timestamp >= ?", strArr, "ad_source_id", null, null);
            while (cursorQuery.moveToNext()) {
                try {
                    map.put(cursorQuery.getString(d(cursorQuery, "ad_source_id")), Integer.valueOf(cursorQuery.getInt(1)));
                } catch (Throwable unused) {
                    if (cursorQuery != null) {
                        cursorQuery.close();
                    }
                    return map;
                }
            }
            cursorQuery.close();
            return map;
        } catch (Throwable unused2) {
            cursorQuery = null;
        }
    }

    public final synchronized void d(d0d d0dVar) {
        if (d0dVar == null) {
            return;
        }
        try {
            SQLiteDatabase sQLiteDatabaseM = m();
            ContentValues contentValues = new ContentValues();
            contentValues.put("placement_id", d0dVar.m());
            contentValues.put("ad_source_id", d0dVar.d());
            contentValues.put("request_id", d0dVar.dd());
            contentValues.put("match_error_code", d0dVar.dm());
            contentValues.put("expired_timestamp", Long.valueOf(d0dVar.d0()));
            Cursor cursorQuery = d().query("dyn_wf_ad_source_filter", new String[]{"request_id"}, "request_id = ? AND ad_source_id = ?", new String[]{d0dVar.dd(), d0dVar.d()}, null, null, null);
            if (cursorQuery != null && cursorQuery.getCount() > 0) {
                cursorQuery.close();
                sQLiteDatabaseM.update("dyn_wf_ad_source_filter", contentValues, "request_id = ? AND ad_source_id = ?", new String[]{d0dVar.dd(), d0dVar.d()});
            } else {
                if (cursorQuery != null) {
                    cursorQuery.close();
                }
                sQLiteDatabaseM.insertOrThrow("dyn_wf_ad_source_filter", null, contentValues);
            }
        } catch (Throwable unused) {
        }
    }

    public final synchronized void m(String str) {
        try {
            m().delete("dyn_wf_ad_source_filter", "placement_id = ? AND expired_timestamp < ?", new String[]{str, String.valueOf(System.currentTimeMillis())});
        } catch (Throwable unused) {
        }
    }

    public static d0 d(Context context) {
        if (f67686m == null) {
            synchronized (d0.class) {
                try {
                    if (f67686m == null) {
                        f67686m = new d0(o.d(context));
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        return f67686m;
    }

    public final synchronized d0m d(String str) {
        d0m d0mVar;
        Cursor cursorQuery;
        try {
            d0mVar = new d0m(str);
            try {
                String[] strArr = {str, "", String.valueOf(System.currentTimeMillis())};
                cursorQuery = d().query("dyn_wf_ad_source_filter", new String[]{"ad_source_id", "match_error_code", "count(request_id)"}, "placement_id = ? AND match_error_code IS NOT NULL AND match_error_code != ? AND expired_timestamp >= ?", strArr, "ad_source_id,match_error_code", null, "ad_source_id");
                try {
                    HashMap map = new HashMap();
                    while (cursorQuery.moveToNext()) {
                        String string = cursorQuery.getString(d(cursorQuery, "ad_source_id"));
                        String string2 = cursorQuery.getString(d(cursorQuery, "match_error_code"));
                        int i10 = cursorQuery.getInt(2);
                        List<d0m.d> arrayList = map.get(string);
                        if (arrayList == null) {
                            arrayList = new ArrayList<>();
                        }
                        arrayList.add(new d0m.d(string2, i10));
                        map.put(string, arrayList);
                    }
                    d0mVar.d(map);
                } catch (Throwable unused) {
                    if (cursorQuery != null) {
                    }
                    d0mVar.m(n(str));
                    return d0mVar;
                }
            } catch (Throwable unused2) {
                cursorQuery = null;
            }
            cursorQuery.close();
            d0mVar.m(n(str));
        } catch (Throwable th2) {
            throw th2;
        }
        return d0mVar;
    }

    private static int d(Cursor cursor, String str) {
        int columnIndex = cursor.getColumnIndex(str);
        if (columnIndex >= 0) {
            return columnIndex;
        }
        e.a("columnIndex must >= 0.");
        return 0;
    }
}