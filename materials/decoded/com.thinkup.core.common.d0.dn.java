package com.thinkup.core.common.d0;

import android.content.ContentValues;
import android.database.Cursor;
import com.thinkup.core.common.dm.dnq;
import com.thinkup.core.common.dm.oo;
import com.thinkup.core.common.dm.qd;
import com.thinkup.core.common.o.nd;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes7.dex */
public class dn extends m<com.thinkup.core.common.d.q> {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private static volatile dn f67711m = null;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static final int f67712n = 500;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final String f67713d;

    public static class d {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final String f67714d = "offer_data_cache";

        /* JADX INFO: renamed from: d0, reason: collision with root package name */
        public static final String f67715d0 = "bid_result";

        /* JADX INFO: renamed from: dd, reason: collision with root package name */
        public static final String f67716dd = "offer_data";

        /* JADX INFO: renamed from: dm, reason: collision with root package name */
        public static final String f67717dm = "out_date_timestamp";

        /* JADX INFO: renamed from: dn, reason: collision with root package name */
        public static final String f67718dn = "vast_parse_result";

        /* JADX INFO: renamed from: do, reason: not valid java name */
        public static final String f83do = "CREATE TABLE IF NOT EXISTS offer_data_cache(placement_id TEXT ,bid_id TEXT ,adsource_id TEXT ,network_firm_id INTEGER ,bid_result TEXT ,offer_data TEXT ,out_date_timestamp INTEGER ,vast_parse_result TEXT)";

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public static final String f67719m = "placement_id";

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public static final String f67720n = "bid_id";

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        public static final String f67721o = "adsource_id";

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        public static final String f67722q = "network_firm_id";
    }

    private dn(n nVar) {
        super(nVar);
        this.f67713d = dn.class.getName();
    }

    private synchronized void d(List<String> list) {
        if (list.isEmpty()) {
            return;
        }
        int i10 = 0;
        while (i10 < list.size()) {
            try {
                int i11 = i10 + 500;
                List<String> listSubList = list.subList(i10, Math.min(i11, list.size()));
                StringBuilder sb2 = new StringBuilder();
                sb2.append("bid_id IN (");
                for (int i12 = 0; i12 < listSubList.size(); i12++) {
                    if (i12 > 0) {
                        sb2.append(",");
                    }
                    sb2.append("?");
                }
                sb2.append(")");
                m().delete(d.f67714d, sb2.toString(), (String[]) listSubList.toArray(new String[0]));
                i10 = i11;
            } catch (Throwable th2) {
                com.thinkup.core.common.nm.d0.m("Error_SQL_DELETE_2", th2.getMessage(), nd.m().n0());
                return;
            }
        }
    }

    private synchronized boolean q(String str) {
        Cursor cursorQuery;
        try {
            try {
                cursorQuery = d().query(d.f67714d, new String[]{"placement_id"}, "bid_id=?", new String[]{str}, null, null, null);
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
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public final synchronized qd m(String str) {
        qd qdVar;
        Cursor cursorQuery;
        qdVar = new qd();
        try {
            cursorQuery = d().query(d.f67714d, new String[]{"placement_id", d.f67721o, d.f67715d0, d.f67720n, d.f67717dm}, "placement_id=?", new String[]{str}, null, null, null);
            try {
                ArrayList arrayList = new ArrayList();
                while (cursorQuery.moveToNext()) {
                    String string = cursorQuery.getString(cursorQuery.getColumnIndex(d.f67720n));
                    if (System.currentTimeMillis() >= cursorQuery.getLong(cursorQuery.getColumnIndex(d.f67717dm))) {
                        arrayList.add(string);
                    } else {
                        String string2 = cursorQuery.getString(cursorQuery.getColumnIndex(d.f67721o));
                        oo ooVarD = oo.d(cursorQuery.getString(cursorQuery.getColumnIndex(d.f67715d0)));
                        if (ooVarD != null) {
                            qdVar.d(string2, ooVarD);
                        }
                    }
                }
                if (!arrayList.isEmpty()) {
                    d(arrayList);
                }
            } catch (Throwable unused) {
            }
        } catch (Throwable unused2) {
            cursorQuery = null;
        }
        if (cursorQuery != null) {
            try {
                cursorQuery.close();
            } catch (Throwable unused3) {
            }
        }
        return qdVar;
    }

    public final synchronized dnq n(String str) {
        Cursor cursorQuery;
        try {
            try {
                cursorQuery = d().query(d.f67714d, new String[]{d.f67716dd, d.f67717dm}, "bid_id=?", new String[]{str}, null, null, null);
                if (cursorQuery != null) {
                    try {
                        if (cursorQuery.getCount() > 0) {
                            cursorQuery.moveToNext();
                            dnq dnqVar = new dnq(cursorQuery.getString(0), cursorQuery.getLong(1));
                            cursorQuery.close();
                            cursorQuery.close();
                            return dnqVar;
                        }
                    } catch (Throwable unused) {
                        if (cursorQuery != null) {
                        }
                        return null;
                    }
                }
                if (cursorQuery != null) {
                    cursorQuery.close();
                }
            } catch (Throwable unused2) {
                cursorQuery = null;
            }
            return null;
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public final synchronized String o(String str) {
        Cursor cursorQuery;
        try {
            try {
                cursorQuery = d().query(d.f67714d, new String[]{d.f67718dn}, "bid_id=?", new String[]{str}, null, null, null);
                if (cursorQuery != null) {
                    try {
                        if (cursorQuery.getCount() > 0) {
                            cursorQuery.moveToNext();
                            String string = cursorQuery.getString(0);
                            cursorQuery.close();
                            cursorQuery.close();
                            return string;
                        }
                    } catch (Throwable unused) {
                        if (cursorQuery != null) {
                        }
                        return null;
                    }
                }
                if (cursorQuery != null) {
                    cursorQuery.close();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        } catch (Throwable unused2) {
            cursorQuery = null;
        }
        return null;
    }

    public final synchronized void d(String str) {
        try {
            m().delete(d.f67714d, "bid_id = ? ", new String[]{str});
        } catch (Throwable th2) {
            com.thinkup.core.common.nm.d0.m("Error_SQL_DELETE", th2.getMessage(), nd.m().n0());
        }
    }

    public static dn d(n nVar) {
        if (f67711m == null) {
            synchronized (dn.class) {
                try {
                    if (f67711m == null) {
                        f67711m = new dn(nVar);
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        return f67711m;
    }

    public final synchronized long d(String str, oo ooVar) {
        if (m() == null || ooVar == null) {
            return -1L;
        }
        try {
            ContentValues contentValues = new ContentValues();
            contentValues.put("placement_id", str);
            contentValues.put(d.f67721o, ooVar.f68649dq);
            contentValues.put("network_firm_id", Integer.valueOf(ooVar.f68664o));
            contentValues.put(d.f67720n, ooVar.token);
            contentValues.put(d.f67715d0, ooVar.m());
            contentValues.put(d.f67717dm, Long.valueOf(ooVar.f68645d0));
            if (q(ooVar.token)) {
                return m().update(d.f67714d, contentValues, "bid_id = ? ", new String[]{ooVar.token});
            }
            return m().insert(d.f67714d, null, contentValues);
        } catch (Exception unused) {
            return -1L;
        }
    }

    public final synchronized long m(String str, String str2) {
        if (m() == null) {
            return -1L;
        }
        try {
            ContentValues contentValues = new ContentValues();
            contentValues.put(d.f67718dn, str2);
            if (!q(str)) {
                return -1L;
            }
            return m().update(d.f67714d, contentValues, "bid_id = ? ", new String[]{str});
        } catch (Exception unused) {
            return -1L;
        }
    }

    public final synchronized int d(oo ooVar) {
        if (q(ooVar.token)) {
            try {
                ContentValues contentValues = new ContentValues();
                contentValues.put(d.f67715d0, ooVar.m());
                return m().update(d.f67714d, contentValues, "bid_id = ? ", new String[]{ooVar.token});
            } catch (Throwable unused) {
            }
        }
        return -1;
    }

    public final synchronized long d(String str, String str2) {
        if (m() == null) {
            return -1L;
        }
        try {
            ContentValues contentValues = new ContentValues();
            contentValues.put(d.f67716dd, str2);
            if (!q(str)) {
                return -1L;
            }
            return m().update(d.f67714d, contentValues, "bid_id = ? ", new String[]{str});
        } catch (Exception unused) {
            return -1L;
        }
    }
}