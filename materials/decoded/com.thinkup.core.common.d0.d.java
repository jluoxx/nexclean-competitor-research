package com.thinkup.core.common.d0;

import android.content.ContentValues;
import android.database.Cursor;
import android.provider.BaseColumns;
import android.util.Pair;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/* JADX INFO: loaded from: classes7.dex */
public class d extends m<com.thinkup.core.common.dm.o> {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final String f67647d = "1";

    /* JADX INFO: renamed from: dd, reason: collision with root package name */
    private static volatile d f67648dd = null;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final String f67649m = "2";

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final String f67650n = "3";

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final String f67651o = "4";

    /* JADX INFO: renamed from: d0, reason: collision with root package name */
    private final String f67652d0;

    /* JADX INFO: renamed from: com.thinkup.core.common.d0.d$d, reason: collision with other inner class name */
    public static class C0836d implements BaseColumns {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final String f67665d = "ad_frequency";

        /* JADX INFO: renamed from: d0, reason: collision with root package name */
        public static final String f67666d0 = "network_format";

        /* JADX INFO: renamed from: dd, reason: collision with root package name */
        public static final String f67667dd = "placement_id";

        /* JADX INFO: renamed from: dm, reason: collision with root package name */
        public static final String f67668dm = "source_id";

        /* JADX INFO: renamed from: dn, reason: collision with root package name */
        public static final String f67669dn = "extra";

        /* JADX INFO: renamed from: do, reason: not valid java name */
        public static final String f81do = "month";

        /* JADX INFO: renamed from: dq, reason: collision with root package name */
        public static final String f67670dq = "day";

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public static final String f67671m = "event_type";

        /* JADX INFO: renamed from: m0, reason: collision with root package name */
        public static final String f67672m0 = "hour";

        /* JADX INFO: renamed from: md, reason: collision with root package name */
        public static final String f67673md = "time_stamp";

        /* JADX INFO: renamed from: mm, reason: collision with root package name */
        public static final String f67674mm = "req_num";

        /* JADX INFO: renamed from: mn, reason: collision with root package name */
        public static final String f67675mn = "rule_id";

        /* JADX INFO: renamed from: mo, reason: collision with root package name */
        public static final String f67676mo = "fail_count";

        /* JADX INFO: renamed from: mq, reason: collision with root package name */
        public static final String f67677mq = "next_req_timestamp";

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public static final String f67678n = "app";

        /* JADX INFO: renamed from: n0, reason: collision with root package name */
        public static final String f67679n0 = "CREATE TABLE IF NOT EXISTS ad_frequency(_id INTEGER PRIMARY KEY AUTOINCREMENT ,event_type TEXT ,app TEXT ,network_id TEXT ,format TEXT ,network_format TEXT ,placement_id TEXT ,source_id TEXT ,extra TEXT ,month INTEGER ,day INTEGER ,hour INTEGER , req_num INTEGER , time_stamp INTEGER)";

        /* JADX INFO: renamed from: nd, reason: collision with root package name */
        public static final String f67680nd = "ALTER TABLE ad_frequency ADD COLUMN rule_id INTEGER;";

        /* JADX INFO: renamed from: nm, reason: collision with root package name */
        public static final String f67681nm = "ALTER TABLE ad_frequency ADD COLUMN fail_count INTEGER;";

        /* JADX INFO: renamed from: nn, reason: collision with root package name */
        public static final String f67682nn = "ALTER TABLE ad_frequency ADD COLUMN next_req_timestamp INTEGER;";

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        public static final String f67683o = "format";

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        public static final String f67684q = "network_id";
    }

    private d(n nVar) {
        super(nVar);
        this.f67652d0 = "AdFrequencyDao";
    }

    public final List<com.thinkup.core.common.dm.o> d(List<Pair<String, String>> list, int i10) {
        Cursor cursorQuery;
        ArrayList arrayList = new ArrayList();
        synchronized (this) {
            try {
                Pair<String, String[]> pairN = n(list);
                cursorQuery = i10 > 0 ? d().query(C0836d.f67665d, null, (String) pairN.first, (String[]) pairN.second, null, null, "time_stamp DESC", String.valueOf(i10)) : d().query(C0836d.f67665d, null, (String) pairN.first, (String[]) pairN.second, null, null, "time_stamp DESC", null);
                while (cursorQuery.moveToNext()) {
                    try {
                        String string = cursorQuery.getString(cursorQuery.getColumnIndex("event_type"));
                        long j10 = cursorQuery.getLong(cursorQuery.getColumnIndex("time_stamp"));
                        int i11 = cursorQuery.getInt(cursorQuery.getColumnIndex(C0836d.f67674mm));
                        String string2 = cursorQuery.getString(cursorQuery.getColumnIndex(C0836d.f67668dm));
                        int i12 = cursorQuery.getInt(cursorQuery.getColumnIndex(C0836d.f67675mn));
                        int i13 = cursorQuery.getInt(cursorQuery.getColumnIndex(C0836d.f67676mo));
                        long j11 = cursorQuery.getLong(cursorQuery.getColumnIndex(C0836d.f67677mq));
                        com.thinkup.core.common.dm.o oVar = new com.thinkup.core.common.dm.o(string, string2, C0836d.f67668dm, j10, i11);
                        oVar.d(i12);
                        oVar.m(i13);
                        oVar.m(j11);
                        arrayList.add(oVar);
                    } catch (Throwable unused) {
                        if (cursorQuery != null) {
                        }
                        return arrayList;
                    }
                }
            } catch (Throwable unused2) {
                cursorQuery = null;
            }
            try {
                cursorQuery.close();
            } catch (Throwable unused3) {
            }
        }
        return arrayList;
    }

    public final void m(com.thinkup.core.common.dm.o oVar) {
        synchronized (this) {
            try {
                try {
                    ContentValues contentValues = new ContentValues();
                    contentValues.put("event_type", "2");
                    contentValues.put("app", oVar.m240do());
                    contentValues.put("placement_id", oVar.o());
                    contentValues.put("network_id", oVar.m());
                    contentValues.put(C0836d.f67683o, oVar.n());
                    contentValues.put(C0836d.f67666d0, oVar.dq());
                    contentValues.put(C0836d.f67668dm, oVar.q());
                    contentValues.put(C0836d.f81do, Integer.valueOf(oVar.d0()));
                    contentValues.put(C0836d.f67670dq, Integer.valueOf(oVar.dd()));
                    contentValues.put(C0836d.f67672m0, Integer.valueOf(oVar.dm()));
                    contentValues.put("time_stamp", Long.valueOf(oVar.dn()));
                    m().insert(C0836d.f67665d, null, contentValues);
                } catch (Throwable th2) {
                    th2.printStackTrace();
                }
            } catch (Throwable th3) {
                throw th3;
            }
        }
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public final void n(String str, String str2, int i10, long j10) {
        synchronized (this) {
            try {
                try {
                    ContentValues contentValues = new ContentValues();
                    contentValues.put("event_type", "1");
                    contentValues.put(C0836d.f67674mm, Integer.valueOf(i10));
                    contentValues.put("time_stamp", Long.valueOf(j10));
                    switch (str2.hashCode()) {
                        case -1928631512:
                            if (str2.equals(C0836d.f67666d0)) {
                                contentValues.put(C0836d.f67666d0, str);
                            }
                            break;
                        case -1698410561:
                            if (str2.equals(C0836d.f67668dm)) {
                                contentValues.put(C0836d.f67668dm, str);
                            }
                            break;
                        case -1268779017:
                            if (str2.equals(C0836d.f67683o)) {
                                contentValues.put(C0836d.f67683o, str);
                            }
                            break;
                        case -478232372:
                            if (str2.equals("network_id")) {
                                contentValues.put("network_id", str);
                            }
                            break;
                        case 96801:
                            if (str2.equals("app")) {
                                contentValues.put("app", str);
                            }
                            break;
                        case 1224358069:
                            if (str2.equals("placement_id")) {
                                contentValues.put("placement_id", str);
                            }
                            break;
                    }
                    m().insert(C0836d.f67665d, null, contentValues);
                } catch (Throwable th2) {
                    th2.printStackTrace();
                }
            } catch (Throwable th3) {
                throw th3;
            }
        }
    }

    public final com.thinkup.core.common.dm.o o(String str, String str2) {
        Throwable th2;
        com.thinkup.core.common.dm.o oVar;
        com.thinkup.core.common.dm.o oVar2;
        synchronized (this) {
            Cursor cursor = null;
            oVar2 = null;
            try {
                Cursor cursorQuery = d().query(C0836d.f67665d, null, String.format("event_type = ? and %s = ?", str2), new String[]{"1", str}, null, null, null, "1");
                while (cursorQuery.moveToNext()) {
                    try {
                        String str3 = str2;
                        oVar2 = new com.thinkup.core.common.dm.o(cursorQuery.getString(cursorQuery.getColumnIndex("event_type")), cursorQuery.getString(cursorQuery.getColumnIndex(str2)), str3, cursorQuery.getLong(cursorQuery.getColumnIndex("time_stamp")), cursorQuery.getInt(cursorQuery.getColumnIndex(C0836d.f67674mm)));
                        str2 = str3;
                    } catch (Throwable th3) {
                        th2 = th3;
                        com.thinkup.core.common.dm.o oVar3 = oVar2;
                        cursor = cursorQuery;
                        oVar = oVar3;
                        try {
                            th2.printStackTrace();
                            if (cursor != null) {
                                cursor.close();
                            }
                            oVar2 = oVar;
                        } catch (Throwable th4) {
                            if (cursor == null) {
                                throw th4;
                            }
                            cursor.close();
                            throw th4;
                        }
                    }
                }
                cursorQuery.close();
            } catch (Throwable th5) {
                th2 = th5;
                oVar = null;
            }
        }
        return oVar2;
    }

    public final void q(String str, String str2) {
        synchronized (this) {
            try {
                if (m() == null) {
                    return;
                }
                m().delete(C0836d.f67665d, "event_type = ? and (month != ? or day != ?)", new String[]{"2", str, str2});
            } catch (Throwable th2) {
                th2.printStackTrace();
            }
        }
    }

    private void o(com.thinkup.core.common.dm.o oVar) {
        synchronized (this) {
            try {
                ContentValues contentValues = new ContentValues();
                contentValues.put("time_stamp", Long.valueOf(oVar.dn()));
                contentValues.put(C0836d.f67677mq, Long.valueOf(oVar.mm()));
                contentValues.put(C0836d.f67676mo, Integer.valueOf(oVar.md()));
                contentValues.put(C0836d.f67674mm, Integer.valueOf(oVar.f68577d));
                m().update(C0836d.f67665d, contentValues, String.format("%s = ? and %s = ? and %s = ?", "event_type", C0836d.f67668dm, C0836d.f67675mn), new String[]{oVar.d(), oVar.q(), String.valueOf(oVar.m0())});
            } catch (Throwable unused) {
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:21:0x0052 A[Catch: all -> 0x0046, PHI: r1
  0x0052: PHI (r1v2 android.database.Cursor) = (r1v1 android.database.Cursor), (r1v3 android.database.Cursor) binds: [B:20:0x0050, B:17:0x004a] A[DONT_GENERATE, DONT_INLINE], TRY_ENTER, TryCatch #0 {, blocks: (B:3:0x0001, B:10:0x0041, B:11:0x0044, B:22:0x0055, B:21:0x0052, B:27:0x005c, B:28:0x005f, B:5:0x0007, B:7:0x0036, B:9:0x003c, B:19:0x004d), top: B:31:0x0001, inners: #1, #2 }] */
    public final long m(String str, String str2) {
        synchronized (this) {
            Date date = new Date();
            Cursor cursorRawQuery = null;
            try {
                cursorRawQuery = d().rawQuery("SELECT COUNT(*) FROM ad_frequency WHERE event_type = ? AND " + str2 + " = ? AND month = ? AND day = ? AND hour = ?", new String[]{"2", str, com.thinkup.core.d.m.d(date), com.thinkup.core.d.m.m(date), com.thinkup.core.d.m.n(date)});
                if (cursorRawQuery != null && cursorRawQuery.moveToFirst()) {
                    long j10 = cursorRawQuery.getLong(0);
                    cursorRawQuery.close();
                    return j10;
                }
                if (cursorRawQuery != null) {
                    cursorRawQuery.close();
                }
            } catch (Throwable th2) {
                try {
                    th2.printStackTrace();
                    if (cursorRawQuery != null) {
                        cursorRawQuery.close();
                    }
                } catch (Throwable th3) {
                    if (cursorRawQuery != null) {
                        cursorRawQuery.close();
                    }
                    throw th3;
                }
            }
            return 0L;
        }
    }

    public final com.thinkup.core.common.dm.o n(String str, String str2) {
        com.thinkup.core.common.dm.o oVar;
        Cursor cursorRawQuery;
        synchronized (this) {
            oVar = null;
            try {
                cursorRawQuery = d().rawQuery(String.format("select * from ad_frequency where event_type = '2' and %s = '" + str + "' order by time_stamp DESC limit 1", str2), null);
                try {
                    List<com.thinkup.core.common.dm.o> listD = d(cursorRawQuery);
                    oVar = listD.isEmpty() ? null : listD.get(0);
                    if (cursorRawQuery != null) {
                        cursorRawQuery.close();
                    }
                } catch (Throwable th2) {
                    th = th2;
                    try {
                        th.printStackTrace();
                        if (cursorRawQuery != null) {
                        }
                        return oVar;
                    } catch (Throwable th3) {
                        if (cursorRawQuery != null) {
                            cursorRawQuery.close();
                        }
                        throw th3;
                    }
                }
            } catch (Throwable th4) {
                th = th4;
                cursorRawQuery = null;
            }
        }
        return oVar;
    }

    private void n(com.thinkup.core.common.dm.o oVar) {
        synchronized (this) {
            try {
                ContentValues contentValues = new ContentValues();
                contentValues.put("event_type", oVar.d());
                contentValues.put(C0836d.f67675mn, Integer.valueOf(oVar.m0()));
                contentValues.put(C0836d.f67668dm, oVar.q());
                contentValues.put("time_stamp", Long.valueOf(oVar.dn()));
                contentValues.put(C0836d.f67677mq, Long.valueOf(oVar.mm()));
                contentValues.put(C0836d.f67676mo, Integer.valueOf(oVar.md()));
                contentValues.put(C0836d.f67674mm, Integer.valueOf(oVar.f68577d));
                m().insert(C0836d.f67665d, null, contentValues);
            } catch (Throwable unused) {
            }
        }
    }

    public final void m(final String str, final String str2, final int i10, final long j10) {
        try {
            com.thinkup.core.common.nn.m.n.d().q(new com.thinkup.core.common.nn.m.o(com.thinkup.core.common.nn.m.q.f72108mn, new Runnable() { // from class: com.thinkup.core.common.d0.d.2
                @Override // java.lang.Runnable
                public final void run() {
                    com.thinkup.core.common.dm.o oVarO = d.this.o(str, str2);
                    d dVar = d.this;
                    if (oVarO != null) {
                        dVar.d(str, str2, i10, j10);
                    } else {
                        dVar.n(str, str2, i10, j10);
                    }
                }
            }));
        } catch (Throwable th2) {
            th2.printStackTrace();
        }
    }

    public static /* synthetic */ void m(d dVar, com.thinkup.core.common.dm.o oVar) {
        synchronized (dVar) {
            try {
                ContentValues contentValues = new ContentValues();
                contentValues.put("event_type", oVar.d());
                contentValues.put(C0836d.f67675mn, Integer.valueOf(oVar.m0()));
                contentValues.put(C0836d.f67668dm, oVar.q());
                contentValues.put("time_stamp", Long.valueOf(oVar.dn()));
                contentValues.put(C0836d.f67677mq, Long.valueOf(oVar.mm()));
                contentValues.put(C0836d.f67676mo, Integer.valueOf(oVar.md()));
                contentValues.put(C0836d.f67674mm, Integer.valueOf(oVar.f68577d));
                dVar.m().insert(C0836d.f67665d, null, contentValues);
            } catch (Throwable unused) {
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static Pair<String, String[]> n(List<Pair<String, String>> list) {
        String[] strArr;
        StringBuilder sb2 = new StringBuilder();
        if (list == null || list.isEmpty()) {
            strArr = null;
        } else {
            strArr = new String[list.size()];
            for (int i10 = 0; i10 < list.size(); i10++) {
                Pair<String, String> pair = list.get(i10);
                sb2.append((String) pair.first);
                if (i10 != list.size() - 1) {
                    sb2.append(" and ");
                }
                strArr[i10] = (String) pair.second;
            }
        }
        return new Pair<>(sb2.toString(), strArr);
    }

    public final void d(final com.thinkup.core.common.dm.o oVar) {
        try {
            com.thinkup.core.common.nn.m.n.d().q(new com.thinkup.core.common.nn.m.o(com.thinkup.core.common.nn.m.q.f72107mm, new Runnable() { // from class: com.thinkup.core.common.d0.d.1
                @Override // java.lang.Runnable
                public final void run() {
                    d.this.m(oVar);
                }
            }));
        } catch (Throwable th2) {
            th2.printStackTrace();
        }
    }

    /* JADX WARN: Code duplicated, block: B:21:0x004e A[Catch: all -> 0x0042, PHI: r1
  0x004e: PHI (r1v2 android.database.Cursor) = (r1v1 android.database.Cursor), (r1v3 android.database.Cursor) binds: [B:20:0x004c, B:17:0x0046] A[DONT_GENERATE, DONT_INLINE], TRY_ENTER, TryCatch #0 {, blocks: (B:3:0x0001, B:10:0x003d, B:11:0x0040, B:22:0x0051, B:21:0x004e, B:27:0x0058, B:28:0x005b, B:5:0x0007, B:7:0x0032, B:9:0x0038, B:19:0x0049), top: B:31:0x0001, inners: #1, #2 }] */
    public final long d(String str, String str2) {
        synchronized (this) {
            Date date = new Date();
            Cursor cursorRawQuery = null;
            try {
                cursorRawQuery = d().rawQuery("SELECT COUNT(*) FROM ad_frequency WHERE event_type = ? AND " + str2 + " = ? AND month = ? AND day = ?", new String[]{"2", str, com.thinkup.core.d.m.d(date), com.thinkup.core.d.m.m(date)});
                if (cursorRawQuery != null && cursorRawQuery.moveToFirst()) {
                    long j10 = cursorRawQuery.getLong(0);
                    cursorRawQuery.close();
                    return j10;
                }
                if (cursorRawQuery != null) {
                    cursorRawQuery.close();
                }
            } catch (Throwable th2) {
                try {
                    th2.printStackTrace();
                    if (cursorRawQuery != null) {
                        cursorRawQuery.close();
                    }
                } catch (Throwable th3) {
                    if (cursorRawQuery != null) {
                        cursorRawQuery.close();
                    }
                    throw th3;
                }
            }
            return 0L;
        }
    }

    private static List<com.thinkup.core.common.dm.o> d(Cursor cursor) {
        ArrayList arrayList = new ArrayList();
        if (cursor != null) {
            while (cursor.moveToNext()) {
                try {
                    arrayList.add(new com.thinkup.core.common.dm.o(cursor.getString(cursor.getColumnIndex("event_type")), cursor.getString(cursor.getColumnIndex("app")), cursor.getString(cursor.getColumnIndex("network_id")), cursor.getString(cursor.getColumnIndex(C0836d.f67683o)), cursor.getString(cursor.getColumnIndex(C0836d.f67666d0)), cursor.getString(cursor.getColumnIndex("placement_id")), cursor.getString(cursor.getColumnIndex(C0836d.f67668dm)), cursor.getInt(cursor.getColumnIndex(C0836d.f81do)), cursor.getInt(cursor.getColumnIndex(C0836d.f67670dq)), cursor.getInt(cursor.getColumnIndex(C0836d.f67672m0)), cursor.getLong(cursor.getColumnIndex("time_stamp"))));
                } catch (Throwable th2) {
                    th2.printStackTrace();
                }
            }
        }
        return arrayList;
    }

    public final void d(String str, String str2, int i10, long j10) {
        synchronized (this) {
            try {
                try {
                    ContentValues contentValues = new ContentValues();
                    contentValues.put(C0836d.f67674mm, Integer.valueOf(i10));
                    contentValues.put("time_stamp", Long.valueOf(j10));
                    m().update(C0836d.f67665d, contentValues, String.format("event_type = ? and %s = ?", str2), new String[]{"1", str});
                } catch (Throwable th2) {
                    th2.printStackTrace();
                }
            } catch (Throwable th3) {
                throw th3;
            }
        }
    }

    public final void d(final com.thinkup.core.common.dm.o oVar, final boolean z10) {
        if (oVar == null) {
            return;
        }
        try {
            com.thinkup.core.common.nn.m.n.d().q(new com.thinkup.core.common.nn.m.o(com.thinkup.core.common.nn.m.q.f72109mo, new Runnable() { // from class: com.thinkup.core.common.d0.d.3
                @Override // java.lang.Runnable
                public final void run() {
                    boolean z11 = z10;
                    d dVar = d.this;
                    if (z11) {
                        d.d(dVar, oVar);
                    } else {
                        d.m(dVar, oVar);
                    }
                }
            }));
        } catch (Throwable unused) {
        }
    }

    public static d d(n nVar) {
        if (f67648dd == null) {
            synchronized (d.class) {
                try {
                    if (f67648dd == null) {
                        f67648dd = new d(nVar);
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        return f67648dd;
    }

    public final void d(final List<Pair<String, String>> list) {
        com.thinkup.core.common.nn.m.n.d().q(new com.thinkup.core.common.nn.m.o(com.thinkup.core.common.nn.m.q.f72106md, new Runnable() { // from class: com.thinkup.core.common.d0.d.4
            @Override // java.lang.Runnable
            public final void run() {
                synchronized (this) {
                    try {
                        Pair pairN = d.n((List<Pair<String, String>>) list);
                        d.this.m().delete(C0836d.f67665d, (String) pairN.first, (String[]) pairN.second);
                    } catch (Throwable unused) {
                    }
                }
            }
        }));
    }

    public static /* synthetic */ void d(d dVar, com.thinkup.core.common.dm.o oVar) {
        synchronized (dVar) {
            try {
                ContentValues contentValues = new ContentValues();
                contentValues.put("time_stamp", Long.valueOf(oVar.dn()));
                contentValues.put(C0836d.f67677mq, Long.valueOf(oVar.mm()));
                contentValues.put(C0836d.f67676mo, Integer.valueOf(oVar.md()));
                contentValues.put(C0836d.f67674mm, Integer.valueOf(oVar.f68577d));
                dVar.m().update(C0836d.f67665d, contentValues, String.format("%s = ? and %s = ? and %s = ?", "event_type", C0836d.f67668dm, C0836d.f67675mn), new String[]{oVar.d(), oVar.q(), String.valueOf(oVar.m0())});
            } catch (Throwable unused) {
            }
        }
    }
}