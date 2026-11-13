package com.thinkup.core.common.m0.m;

import android.os.SystemClock;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes7.dex */
public class m {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final String f69826d = "m";

    /* JADX INFO: renamed from: d0, reason: collision with root package name */
    private static volatile m f69827d0 = null;

    /* JADX INFO: renamed from: dm, reason: collision with root package name */
    private static final Comparator<C0852m> f69828dm = new Comparator<C0852m>() { // from class: com.thinkup.core.common.m0.m.m.2
        private static int d(C0852m c0852m, C0852m c0852m2) {
            return Long.compare(c0852m2.f69838m, c0852m.f69838m);
        }

        @Override // java.util.Comparator
        public final /* bridge */ /* synthetic */ int compare(C0852m c0852m, C0852m c0852m2) {
            return Long.compare(c0852m2.f69838m, c0852m.f69838m);
        }
    };

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private static final int f69829m = 5;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static final int f69830n = 100;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private static final int f69831o = 3;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private static final long f69832q = 3600000;

    /* JADX INFO: renamed from: dd, reason: collision with root package name */
    private final LinkedHashMap<String, d> f69833dd = new LinkedHashMap<String, d>() { // from class: com.thinkup.core.common.m0.m.m.1
        @Override // java.util.LinkedHashMap
        public final boolean removeEldestEntry(Map.Entry<String, d> entry) {
            return size() > 100;
        }
    };

    /* JADX INFO: renamed from: com.thinkup.core.common.m0.m.m$m, reason: collision with other inner class name */
    public static class C0852m {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final String f69837d;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public long f69838m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public int f69839n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        public int f69840o;

        public C0852m(String str) {
            this.f69837d = str;
        }
    }

    private m() {
    }

    private synchronized boolean n(String str, String str2) {
        if (o(str, str2)) {
            return false;
        }
        d dVar = this.f69833dd.get(str);
        if (dVar == null) {
            return false;
        }
        Long l10 = dVar.f69836m.get(str2);
        return l10 != null && l10.longValue() > SystemClock.elapsedRealtime();
    }

    private static boolean o(String str, String str2) {
        return str == null || str.isEmpty() || str2 == null || str2.isEmpty();
    }

    public final synchronized void d(String str, String str2) {
        try {
            if (o(str, str2)) {
                return;
            }
            d dVar = this.f69833dd.get(str);
            byte b10 = 0;
            if (dVar == null) {
                dVar = new d(b10);
                this.f69833dd.put(str, dVar);
            }
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            d(dVar, jElapsedRealtime);
            Long l10 = dVar.f69836m.get(str2);
            if (l10 == null || l10.longValue() <= jElapsedRealtime) {
                C0852m c0852mD = d(dVar.f69835d, str2);
                if (c0852mD != null) {
                    c0852mD.f69838m = jElapsedRealtime;
                    c0852mD.f69839n++;
                    c0852mD.f69840o = 0;
                    return;
                }
                if (dVar.f69835d.size() >= 5) {
                    C0852m c0852m = null;
                    for (C0852m c0852m2 : dVar.f69835d) {
                        if (c0852m == null || c0852m2.f69838m < c0852m.f69838m) {
                            c0852m = c0852m2;
                        }
                    }
                    if (c0852m != null) {
                        dVar.f69835d.remove(c0852m);
                    }
                }
                C0852m c0852m3 = new C0852m(str2);
                c0852m3.f69838m = jElapsedRealtime;
                c0852m3.f69839n = 1;
                dVar.f69835d.add(c0852m3);
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public final synchronized boolean m(String str, String str2) {
        if (o(str, str2)) {
            return false;
        }
        d dVar = this.f69833dd.get(str);
        if (dVar == null) {
            return false;
        }
        d(dVar, SystemClock.elapsedRealtime());
        C0852m c0852mD = d(dVar.f69835d, str2);
        if (c0852mD == null) {
            return false;
        }
        int i10 = c0852mD.f69840o + 1;
        c0852mD.f69840o = i10;
        if (i10 < 3) {
            return false;
        }
        dVar.f69835d.remove(c0852mD);
        dVar.f69836m.put(str2, Long.valueOf(SystemClock.elapsedRealtime() + f69832q));
        return true;
    }

    public static class d {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final List<C0852m> f69835d;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        final Map<String, Long> f69836m;

        private d() {
            this.f69835d = new ArrayList(5);
            this.f69836m = new HashMap(4);
        }

        public /* synthetic */ d(byte b10) {
            this();
        }
    }

    private synchronized int n() {
        return this.f69833dd.size();
    }

    private synchronized void m() {
        this.f69833dd.clear();
    }

    private synchronized int m(String str) {
        d dVar = str != null ? this.f69833dd.get(str) : null;
        if (dVar == null) {
            return 0;
        }
        return dVar.f69835d.size();
    }

    public static m d() {
        if (f69827d0 == null) {
            synchronized (m.class) {
                try {
                    if (f69827d0 == null) {
                        f69827d0 = new m();
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        return f69827d0;
    }

    public final synchronized List<String> d(String str) {
        try {
            if (str == null) {
                return Collections.EMPTY_LIST;
            }
            d dVar = this.f69833dd.get(str);
            if (dVar != null && !dVar.f69835d.isEmpty()) {
                ArrayList arrayList = new ArrayList(dVar.f69835d);
                Collections.sort(arrayList, f69828dm);
                int iMin = Math.min(3, arrayList.size());
                ArrayList arrayList2 = new ArrayList(iMin);
                for (int i10 = 0; i10 < iMin; i10++) {
                    arrayList2.add(((C0852m) arrayList.get(i10)).f69837d);
                }
                return arrayList2;
            }
            return Collections.EMPTY_LIST;
        } catch (Throwable th2) {
            throw th2;
        }
    }

    private static C0852m d(List<C0852m> list, String str) {
        for (C0852m c0852m : list) {
            if (str.equals(c0852m.f69837d)) {
                return c0852m;
            }
        }
        return null;
    }

    private static void d(d dVar, long j10) {
        if (dVar.f69836m.isEmpty()) {
            return;
        }
        Iterator<Map.Entry<String, Long>> it = dVar.f69836m.entrySet().iterator();
        while (it.hasNext()) {
            if (it.next().getValue().longValue() <= j10) {
                it.remove();
            }
        }
    }
}