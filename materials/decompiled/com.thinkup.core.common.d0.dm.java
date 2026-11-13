package com.thinkup.core.common.d0;

import android.content.ContentValues;
import android.database.Cursor;
import com.thinkup.core.common.dm.dnm;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes7.dex */
public class dm extends com.thinkup.core.common.d0.m<dm> {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final String f67698d = "com.thinkup.core.common.d0.dm";

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private static dm f67699m;

    public static class d {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public List<dnm> f67700d;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public Map<String, dnm> f67701m;
    }

    public static class m {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final String f67702d = "notice_url_fail_info";

        /* JADX INFO: renamed from: d0, reason: collision with root package name */
        public static final String f67703d0 = "first_fail_time";

        /* JADX INFO: renamed from: dd, reason: collision with root package name */
        public static final String f67704dd = "offer_out_date_time";

        /* JADX INFO: renamed from: dm, reason: collision with root package name */
        public static final String f67705dm = "retry_count";

        /* JADX INFO: renamed from: dn, reason: collision with root package name */
        public static final String f67706dn = "CREATE TABLE IF NOT EXISTS notice_url_fail_info(id TEXT, req_type INTEGER, req_url TEXT, req_head TEXT, first_fail_time INTEGER, offer_out_date_time INTEGER, retry_count INTEGER )";

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public static final String f67707m = "id";

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public static final String f67708n = "req_type";

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        public static final String f67709o = "req_url";

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        public static final String f67710q = "req_head";
    }

    private dm(n nVar) {
        super(nVar);
    }

    private synchronized void o() {
        try {
            if (m() == null) {
                return;
            }
            m().delete(m.f67702d, null, null);
        } catch (Exception unused) {
        }
    }

    public final synchronized long d(dnm dnmVar) {
        if (m() == null || dnmVar == null) {
            return -1L;
        }
        try {
            ContentValues contentValues = new ContentValues();
            contentValues.put("id", dnmVar.f68060d);
            contentValues.put(m.f67708n, Integer.valueOf(dnmVar.f68063m));
            contentValues.put(m.f67709o, dnmVar.f68065o);
            contentValues.put(m.f67710q, dnmVar.f68064n);
            contentValues.put(m.f67703d0, Long.valueOf(dnmVar.f68066q));
            contentValues.put(m.f67704dd, Long.valueOf(dnmVar.f68061d0));
            contentValues.put("retry_count", Integer.valueOf(dnmVar.f68062dd));
            if (d(dnmVar.f68060d)) {
                return m().update(m.f67702d, contentValues, "id = ? ", new String[]{dnmVar.f68060d});
            }
            return m().insert(m.f67702d, null, contentValues);
        } catch (Exception unused) {
            return -1L;
        }
    }

    public final synchronized int m(dnm dnmVar) {
        if (m() == null || dnmVar == null) {
            return -1;
        }
        try {
            return m().delete(m.f67702d, "id=?", new String[]{dnmVar.f68060d});
        } catch (Throwable unused) {
            return -1;
        }
    }

    public final synchronized d n() {
        d dVar = new d();
        List<dnm> listSynchronizedList = Collections.synchronizedList(new ArrayList(8));
        ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap(8);
        dVar.f67700d = listSynchronizedList;
        dVar.f67701m = concurrentHashMap;
        Cursor cursorQuery = null;
        try {
            try {
                cursorQuery = d().query(m.f67702d, null, null, null, null, null, m.f67703d0);
                if (cursorQuery == null || cursorQuery.getCount() <= 0) {
                    if (cursorQuery != null) {
                    }
                    return dVar;
                }
                ArrayList arrayList = new ArrayList(4);
                while (cursorQuery.moveToNext()) {
                    dnm dnmVar = new dnm();
                    dnmVar.f68060d = cursorQuery.getString(cursorQuery.getColumnIndex("id"));
                    dnmVar.f68063m = cursorQuery.getInt(cursorQuery.getColumnIndex(m.f67708n));
                    dnmVar.f68065o = cursorQuery.getString(cursorQuery.getColumnIndex(m.f67709o));
                    dnmVar.f68064n = cursorQuery.getString(cursorQuery.getColumnIndex(m.f67710q));
                    dnmVar.f68066q = cursorQuery.getLong(cursorQuery.getColumnIndex(m.f67703d0));
                    dnmVar.f68061d0 = cursorQuery.getLong(cursorQuery.getColumnIndex(m.f67704dd));
                    dnmVar.f68062dd = cursorQuery.getInt(cursorQuery.getColumnIndex("retry_count"));
                    if (System.currentTimeMillis() < dnmVar.f68061d0) {
                        listSynchronizedList.add(dnmVar);
                        concurrentHashMap.put(dnmVar.f68060d, dnmVar);
                    } else {
                        arrayList.add(dnmVar);
                    }
                }
                cursorQuery.close();
                if (arrayList.size() > 0) {
                    Iterator it = arrayList.iterator();
                    while (it.hasNext()) {
                        m((dnm) it.next());
                    }
                }
                cursorQuery.close();
                return dVar;
            } catch (Throwable th2) {
                if (cursorQuery != null) {
                    cursorQuery.close();
                }
                throw th2;
            }
        } catch (Exception unused) {
            if (cursorQuery != null) {
            }
        } catch (OutOfMemoryError unused2) {
            System.gc();
            if (cursorQuery != null) {
            }
        } catch (Throwable unused3) {
            if (cursorQuery != null) {
            }
        }
        cursorQuery.close();
        return dVar;
    }

    public static dm d(n nVar) {
        if (f67699m == null) {
            synchronized (dm.class) {
                try {
                    if (f67699m == null) {
                        f67699m = new dm(nVar);
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        return f67699m;
    }

    private boolean d(String str) {
        Cursor cursorQuery;
        try {
            cursorQuery = d().query(m.f67702d, new String[]{"id"}, "id=?", new String[]{str}, "id", null, null);
            if (cursorQuery != null) {
                try {
                    if (cursorQuery.getCount() > 0) {
                        cursorQuery.close();
                        cursorQuery.close();
                        return true;
                    }
                } catch (Throwable unused) {
                    if (cursorQuery == null) {
                        return false;
                    }
                }
            }
            if (cursorQuery == null) {
                return false;
            }
        } catch (Throwable unused2) {
            cursorQuery = null;
        }
        cursorQuery.close();
        return false;
    }
}