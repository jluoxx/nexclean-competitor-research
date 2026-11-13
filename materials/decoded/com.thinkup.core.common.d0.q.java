package com.thinkup.core.common.d0;

import android.content.ContentValues;
import android.database.Cursor;
import com.thinkup.core.common.dm.dqq;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes7.dex */
public class q extends m<dqq> {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final String f67738d = "com.thinkup.core.common.d0.q";

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private static volatile q f67739m;

    public static class d {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final String f67740d = "sdkconfig";

        /* JADX INFO: renamed from: d0, reason: collision with root package name */
        public static final String f67741d0 = "CREATE TABLE IF NOT EXISTS sdkconfig(key TEXT ,type TEXT ,lastupdatetime TEXT ,value TEXT )";

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public static final String f67742m = "key";

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public static final String f67743n = "type";

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        public static final String f67744o = "value";

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        public static final String f67745q = "lastupdatetime";
    }

    private q(n nVar) {
        super(nVar);
    }

    private synchronized long d(dqq dqqVar) {
        if (m() == null || dqqVar == null) {
            return -1L;
        }
        try {
            ContentValues contentValues = new ContentValues();
            contentValues.put(d.f67742m, dqqVar.m());
            contentValues.put("type", dqqVar.n());
            contentValues.put("value", dqqVar.o());
            contentValues.put(d.f67745q, dqqVar.d());
            if (m(dqqVar.m(), dqqVar.d(), dqqVar.n())) {
                return m().update(d.f67740d, contentValues, "key = ? AND type = ? AND lastupdatetime = ?  ", new String[]{dqqVar.m(), dqqVar.n(), dqqVar.d()});
            }
            return m().insert(d.f67740d, null, contentValues);
        } catch (Exception unused) {
            return -1L;
        }
    }

    private synchronized boolean m(String str, String str2) {
        Cursor cursorQuery = d().query(d.f67740d, new String[]{d.f67742m}, "key=? AND type=?", new String[]{str, str2}, null, null, null);
        if (cursorQuery != null && cursorQuery.getCount() > 0) {
            cursorQuery.close();
            return true;
        }
        if (cursorQuery != null) {
            cursorQuery.close();
        }
        return false;
    }

    private synchronized void n(String str, String str2) {
        List<dqq> listN = n(str, str2, dqq.d.f68196d);
        if (listN == null || listN.size() <= 0) {
            dqq dqqVar = new dqq();
            dqqVar.d(str2);
            dqqVar.o("1");
            dqqVar.n(dqq.d.f68196d);
            dqqVar.m(str);
            d(dqqVar);
            return;
        }
        for (dqq dqqVar2 : listN) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(Integer.parseInt(dqqVar2.o()) + 1);
            dqqVar2.o(sb2.toString());
            d(dqqVar2);
        }
    }

    /* JADX WARN: Code duplicated, block: B:15:0x0028 A[Catch: all -> 0x0020, PHI: r10
  0x0028: PHI (r10v7 android.database.Cursor) = (r10v5 android.database.Cursor), (r10v6 android.database.Cursor), (r10v8 android.database.Cursor) binds: [B:14:0x0026, B:19:0x0030, B:28:0x003e] A[DONT_GENERATE, DONT_INLINE], TRY_ENTER, TRY_LEAVE, TryCatch #0 {, blocks: (B:7:0x001c, B:15:0x0028, B:24:0x0037, B:25:0x003a, B:18:0x002d), top: B:36:0x0002, inners: #1 }] */
    private synchronized List<dqq> o(String str, String str2) {
        Cursor cursorQuery;
        try {
            cursorQuery = d().query(d.f67740d, null, "key != ? and type = ?", new String[]{str, str2}, null, null, null);
            try {
                List<dqq> listD = d(cursorQuery);
                if (cursorQuery != null) {
                    cursorQuery.close();
                }
                return listD;
            } catch (Exception unused) {
                if (cursorQuery != null) {
                    cursorQuery.close();
                }
                return null;
            } catch (OutOfMemoryError unused2) {
                try {
                    System.gc();
                    if (cursorQuery != null) {
                        cursorQuery.close();
                    }
                    return null;
                } catch (Throwable th2) {
                    if (cursorQuery == null) {
                        throw th2;
                    }
                    cursorQuery.close();
                    throw th2;
                }
            } catch (Throwable unused3) {
                if (cursorQuery != null) {
                    cursorQuery.close();
                }
                return null;
            }
        } catch (Exception unused4) {
            cursorQuery = null;
        } catch (OutOfMemoryError unused5) {
            cursorQuery = null;
        } catch (Throwable unused6) {
            cursorQuery = null;
        }
    }

    private synchronized boolean m(String str, String str2, String str3) {
        Cursor cursorQuery = d().query(d.f67740d, new String[]{d.f67742m}, "key=? AND type=? AND lastupdatetime=?", new String[]{str, str3, str2}, null, null, null);
        if (cursorQuery != null && cursorQuery.getCount() > 0) {
            cursorQuery.close();
            return true;
        }
        if (cursorQuery != null) {
            cursorQuery.close();
        }
        return false;
    }

    private synchronized void m(String str) {
        try {
            if (m() == null) {
                return;
            }
            m().delete(d.f67740d, "lastupdatetime< ? and type = ?", new String[]{str, dqq.d.f68196d});
        } catch (Exception unused) {
        }
    }

    /* JADX WARN: Code duplicated, block: B:15:0x0028 A[Catch: all -> 0x0020, PHI: r10
  0x0028: PHI (r10v7 android.database.Cursor) = (r10v5 android.database.Cursor), (r10v6 android.database.Cursor), (r10v8 android.database.Cursor) binds: [B:14:0x0026, B:19:0x0030, B:28:0x003e] A[DONT_GENERATE, DONT_INLINE], TRY_ENTER, TRY_LEAVE, TryCatch #0 {, blocks: (B:7:0x001c, B:15:0x0028, B:24:0x0037, B:25:0x003a, B:18:0x002d), top: B:36:0x0002, inners: #1 }] */
    private synchronized List<dqq> n(String str, String str2, String str3) {
        Cursor cursorQuery;
        try {
            cursorQuery = d().query(d.f67740d, null, "key = ? and type = ? and lastupdatetime = ?", new String[]{str, str3, str2}, null, null, null);
            try {
                List<dqq> listD = d(cursorQuery);
                if (cursorQuery != null) {
                    cursorQuery.close();
                }
                return listD;
            } catch (Exception unused) {
                if (cursorQuery != null) {
                    cursorQuery.close();
                }
                return null;
            } catch (OutOfMemoryError unused2) {
                try {
                    System.gc();
                    if (cursorQuery != null) {
                        cursorQuery.close();
                    }
                    return null;
                } catch (Throwable th2) {
                    if (cursorQuery != null) {
                        cursorQuery.close();
                        throw th2;
                    }
                    throw th2;
                }
            } catch (Throwable unused3) {
                if (cursorQuery != null) {
                    cursorQuery.close();
                }
                return null;
            }
        } catch (Exception unused4) {
            cursorQuery = null;
        } catch (OutOfMemoryError unused5) {
            cursorQuery = null;
        } catch (Throwable unused6) {
            cursorQuery = null;
        }
    }

    /* JADX WARN: Code duplicated, block: B:15:0x0028 A[Catch: all -> 0x0020, PHI: r10
  0x0028: PHI (r10v7 android.database.Cursor) = (r10v5 android.database.Cursor), (r10v6 android.database.Cursor), (r10v8 android.database.Cursor) binds: [B:14:0x0026, B:19:0x0030, B:27:0x003d] A[DONT_GENERATE, DONT_INLINE], TRY_ENTER, TRY_LEAVE, TryCatch #0 {, blocks: (B:7:0x001c, B:15:0x0028, B:23:0x0036, B:24:0x0039, B:18:0x002d), top: B:35:0x0002, inners: #1 }] */
    private synchronized List<dqq> n(String str) {
        Cursor cursorQuery;
        try {
            cursorQuery = d().query(d.f67740d, null, "type = ?", new String[]{str}, null, null, null);
            try {
                List<dqq> listD = d(cursorQuery);
                if (cursorQuery != null) {
                    cursorQuery.close();
                }
                return listD;
            } catch (Exception unused) {
                if (cursorQuery != null) {
                    cursorQuery.close();
                }
                return null;
            } catch (OutOfMemoryError unused2) {
                try {
                    System.gc();
                    if (cursorQuery != null) {
                        cursorQuery.close();
                    }
                    return null;
                } catch (Throwable th2) {
                    if (cursorQuery != null) {
                        cursorQuery.close();
                    }
                    throw th2;
                }
            } catch (Throwable unused3) {
                if (cursorQuery != null) {
                    cursorQuery.close();
                }
                return null;
            }
        } catch (Exception unused4) {
            cursorQuery = null;
        } catch (OutOfMemoryError unused5) {
            cursorQuery = null;
        } catch (Throwable unused6) {
            cursorQuery = null;
        }
    }

    public final synchronized long d(String str, String str2, String str3) {
        if (m() == null) {
            return -1L;
        }
        try {
            ContentValues contentValues = new ContentValues();
            contentValues.put(d.f67742m, str);
            contentValues.put("type", str3);
            contentValues.put("value", str2);
            StringBuilder sb2 = new StringBuilder();
            sb2.append(System.currentTimeMillis());
            contentValues.put(d.f67745q, sb2.toString());
            if (m(str, str3)) {
                return m().update(d.f67740d, contentValues, "key = ? AND type = ?", new String[]{str, str3});
            }
            return m().insert(d.f67740d, null, contentValues);
        } catch (Exception unused) {
            return -1L;
        }
    }

    public static q d(n nVar) {
        if (f67739m == null) {
            synchronized (q.class) {
                try {
                    if (f67739m == null) {
                        f67739m = new q(nVar);
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        return f67739m;
    }

    public final synchronized int d(String str) {
        if (m() == null) {
            return -1;
        }
        try {
            return m().delete(d.f67740d, "key=?", new String[]{str});
        } catch (Throwable unused) {
            return -1;
        }
    }

    private synchronized List<dqq> d(Cursor cursor) {
        if (cursor != null) {
            try {
                if (cursor.getCount() > 0) {
                    ArrayList arrayList = new ArrayList();
                    while (cursor.moveToNext()) {
                        dqq dqqVar = new dqq();
                        dqqVar.m(cursor.getString(cursor.getColumnIndex(d.f67742m)));
                        dqqVar.n(cursor.getString(cursor.getColumnIndex("type")));
                        dqqVar.o(cursor.getString(cursor.getColumnIndex("value")));
                        dqqVar.d(cursor.getString(cursor.getColumnIndex(d.f67745q)));
                        arrayList.add(dqqVar);
                    }
                    cursor.close();
                    return arrayList;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:15:0x0028 A[Catch: all -> 0x0020, PHI: r10
  0x0028: PHI (r10v7 android.database.Cursor) = (r10v5 android.database.Cursor), (r10v6 android.database.Cursor), (r10v8 android.database.Cursor) binds: [B:14:0x0026, B:19:0x0030, B:28:0x003e] A[DONT_GENERATE, DONT_INLINE], TRY_ENTER, TRY_LEAVE, TryCatch #0 {, blocks: (B:7:0x001c, B:15:0x0028, B:24:0x0037, B:25:0x003a, B:18:0x002d), top: B:36:0x0002, inners: #1 }] */
    public final synchronized List<dqq> d(String str, String str2) {
        Cursor cursorQuery;
        try {
            cursorQuery = d().query(d.f67740d, null, "key = ? and type = ?", new String[]{str, str2}, null, null, null);
            try {
                List<dqq> listD = d(cursorQuery);
                if (cursorQuery != null) {
                    cursorQuery.close();
                }
                return listD;
            } catch (Exception unused) {
                if (cursorQuery != null) {
                    cursorQuery.close();
                }
                return null;
            } catch (OutOfMemoryError unused2) {
                try {
                    System.gc();
                    if (cursorQuery != null) {
                        cursorQuery.close();
                    }
                    return null;
                } catch (Throwable th2) {
                    if (cursorQuery != null) {
                        cursorQuery.close();
                        throw th2;
                    }
                    throw th2;
                }
            } catch (Throwable unused3) {
                if (cursorQuery != null) {
                    cursorQuery.close();
                }
                return null;
            }
        } catch (Exception unused4) {
            cursorQuery = null;
        } catch (OutOfMemoryError unused5) {
            cursorQuery = null;
        } catch (Throwable unused6) {
            cursorQuery = null;
        }
    }
}