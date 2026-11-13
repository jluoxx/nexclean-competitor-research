package com.thinkup.core.d;

import android.content.Context;
import android.text.TextUtils;
import android.util.Pair;
import com.mbridge.msdk.playercommon.exoplayer2.source.chunk.ChunkedTrackBlacklistUtil;
import com.thinkup.core.common.dm.dn;
import com.thinkup.core.common.dm.m0q;
import com.thinkup.core.common.dq;
import com.thinkup.core.common.o.nd;
import com.thinkup.core.q.m0;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes7.dex */
public class m {

    /* JADX INFO: renamed from: mn, reason: collision with root package name */
    private static volatile m f73371mn;

    /* JADX INFO: renamed from: d0, reason: collision with root package name */
    ConcurrentHashMap<String, com.thinkup.core.common.dm.o> f73374d0;

    /* JADX INFO: renamed from: dd, reason: collision with root package name */
    ConcurrentHashMap<String, com.thinkup.core.common.dm.o> f73375dd;

    /* JADX INFO: renamed from: dm, reason: collision with root package name */
    ConcurrentHashMap<String, Long> f73376dm;

    /* JADX INFO: renamed from: dn, reason: collision with root package name */
    ConcurrentHashMap<String, Long> f73377dn;

    /* JADX INFO: renamed from: do, reason: not valid java name */
    ConcurrentHashMap<String, Long> f237do;

    /* JADX INFO: renamed from: dq, reason: collision with root package name */
    ConcurrentHashMap<String, Long> f73378dq;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    ConcurrentHashMap<String, com.thinkup.core.common.dm.o> f73379m;

    /* JADX INFO: renamed from: m0, reason: collision with root package name */
    ConcurrentHashMap<String, Long> f73380m0;

    /* JADX INFO: renamed from: md, reason: collision with root package name */
    ConcurrentHashMap<String, Long> f73381md;

    /* JADX INFO: renamed from: mq, reason: collision with root package name */
    private final com.thinkup.core.common.d0.d f73382mq;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    ConcurrentHashMap<String, com.thinkup.core.common.dm.o> f73383n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    ConcurrentHashMap<String, com.thinkup.core.common.dm.o> f73390o;

    /* JADX INFO: renamed from: o0, reason: collision with root package name */
    private volatile q f73391o0;

    /* JADX INFO: renamed from: od, reason: collision with root package name */
    private volatile d f73392od;

    /* JADX INFO: renamed from: om, reason: collision with root package name */
    private volatile d f73393om;

    /* JADX INFO: renamed from: on, reason: collision with root package name */
    private volatile d f73394on;

    /* JADX INFO: renamed from: oo, reason: collision with root package name */
    private volatile d f73395oo;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    ConcurrentHashMap<String, com.thinkup.core.common.dm.o> f73396q;

    /* JADX INFO: renamed from: mo, reason: collision with root package name */
    private static final ThreadLocal<SimpleDateFormat> f73372mo = new ThreadLocal<SimpleDateFormat>() { // from class: com.thinkup.core.d.m.1
        private static SimpleDateFormat d() {
            return new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        }

        @Override // java.lang.ThreadLocal
        public final /* synthetic */ SimpleDateFormat initialValue() {
            return new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        }
    };

    /* JADX INFO: renamed from: mm, reason: collision with root package name */
    public static int f73370mm = -1;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final String f73373d = m.class.getSimpleName();

    /* JADX INFO: renamed from: n0, reason: collision with root package name */
    private volatile int f73384n0 = -1;

    /* JADX INFO: renamed from: nd, reason: collision with root package name */
    private volatile int f73385nd = -1;

    /* JADX INFO: renamed from: nm, reason: collision with root package name */
    private volatile String f73386nm = "";

    /* JADX INFO: renamed from: nn, reason: collision with root package name */
    private volatile long f73387nn = 0;

    /* JADX INFO: renamed from: no, reason: collision with root package name */
    private volatile long f73388no = 0;

    /* JADX INFO: renamed from: nq, reason: collision with root package name */
    private final Object f73389nq = new Object();

    /* JADX INFO: renamed from: com.thinkup.core.d.m$2, reason: invalid class name */
    public class AnonymousClass2 implements Runnable {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ String f73397d;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        final /* synthetic */ String f73398m;

        public AnonymousClass2(String str, String str2) {
            this.f73397d = str;
            this.f73398m = str2;
        }

        @Override // java.lang.Runnable
        public final void run() {
            if (m.this.f73382mq != null) {
                m.this.f73382mq.q(this.f73397d, this.f73398m);
            }
        }
    }

    private m(Context context) {
        this.f73382mq = com.thinkup.core.common.d0.d.d(com.thinkup.core.common.d0.o.d(context));
        m();
        try {
            com.thinkup.core.common.nn.m.n.d().q(new com.thinkup.core.common.nn.m.o(com.thinkup.core.common.nn.m.q.f72110mq, new AnonymousClass2(d(new Date()), m(new Date()))));
        } catch (Throwable th2) {
            th2.printStackTrace();
        }
        this.f73379m = new ConcurrentHashMap<>(3);
        this.f73383n = new ConcurrentHashMap<>(3);
        this.f73390o = new ConcurrentHashMap<>(3);
        this.f73396q = new ConcurrentHashMap<>(3);
        this.f73374d0 = new ConcurrentHashMap<>();
        this.f73375dd = new ConcurrentHashMap<>(3);
        this.f73376dm = new ConcurrentHashMap<>(3);
        this.f237do = new ConcurrentHashMap<>(3);
        this.f73377dn = new ConcurrentHashMap<>(3);
        this.f73378dq = new ConcurrentHashMap<>(3);
        this.f73381md = new ConcurrentHashMap<>(3);
        this.f73380m0 = new ConcurrentHashMap<>(3);
    }

    private ConcurrentHashMap<String, Long> dm() {
        return this.f73381md;
    }

    private q dn() {
        if (this.f73391o0 == null) {
            synchronized (this.f73389nq) {
                try {
                    if (this.f73391o0 == null) {
                        this.f73391o0 = new q(this.f73382mq);
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        return this.f73391o0;
    }

    public static String n(Date date) {
        return f73372mo.get().format(date).substring(11, 13);
    }

    public final void d(m0q m0qVar, String str) {
        long j10;
        long j11;
        com.thinkup.core.common.dm.o oVarN;
        Pair<Integer, Integer> pair;
        com.thinkup.core.common.dm.o oVarN2;
        Pair<Integer, Integer> pair2;
        com.thinkup.core.common.dm.o oVarN3;
        Pair<Integer, Integer> pair3;
        Pair<Integer, Integer> pair4;
        Pair<Integer, Integer> pair5;
        Pair<Integer, Integer> pair6;
        com.thinkup.core.common.dm.o oVarO;
        Pair<Integer, Integer> pair7;
        com.thinkup.core.common.dm.o oVarO2;
        Pair<Integer, Integer> pair8;
        com.thinkup.core.common.dm.o oVarO3;
        if (m0qVar == null || TextUtils.isEmpty(str)) {
            return;
        }
        String strQn = m0qVar.qn();
        if (TextUtils.isEmpty(strQn)) {
            return;
        }
        int iMm = m0qVar.mm();
        int iNn0 = m0qVar.nn0();
        long jNnd = m0qVar.nnd();
        try {
            if (TextUtils.isEmpty(strQn) || TextUtils.isEmpty(str)) {
                j10 = 0;
            } else {
                String strValueOf = String.valueOf(iMm);
                String str2 = iMm + "_" + str;
                if (this.f73395oo != null) {
                    Map<String, Pair<Integer, Integer>> mapO = this.f73395oo.o();
                    if (mapO == null || (pair8 = mapO.get(strValueOf)) == null) {
                        j10 = 0;
                    } else {
                        j10 = 0;
                        try {
                            if (((Integer) pair8.first).intValue() > 0 && ((Integer) pair8.second).intValue() > 0 && !this.f73396q.containsKey(strValueOf) && (oVarO3 = this.f73382mq.o(strValueOf, "network_id")) != null) {
                                this.f73396q.put(strValueOf, oVarO3);
                            }
                        } catch (Throwable unused) {
                        }
                    }
                    Map<String, Pair<Integer, Integer>> mapQ = this.f73395oo.q();
                    if (mapQ != null && (pair7 = mapQ.get(str2)) != null && ((Integer) pair7.first).intValue() > 0 && ((Integer) pair7.second).intValue() > 0 && !this.f73375dd.containsKey(str2) && (oVarO2 = this.f73382mq.o(str2, com.thinkup.core.common.d0.d.C0836d.f67666d0)) != null) {
                        this.f73375dd.put(str2, oVarO2);
                    }
                } else {
                    j10 = 0;
                }
                if (iNn0 > 0 && jNnd > j10 && !this.f73374d0.containsKey(strQn) && (oVarO = this.f73382mq.o(strQn, com.thinkup.core.common.d0.d.C0836d.f67668dm)) != null) {
                    this.f73374d0.put(strQn, oVarO);
                }
            }
        } catch (Throwable unused2) {
        }
        String strValueOf2 = String.valueOf(iMm);
        long jMo = m0qVar.mo();
        long jMq = m0qVar.mq();
        long jQm = m0qVar.qm();
        try {
            int iN = n();
            int iO = o();
            String str3 = strValueOf2 + "_" + str;
            if (this.f73392od != null) {
                Map<String, Pair<Integer, Integer>> mapO2 = this.f73392od.o();
                if (mapO2 == null || (pair6 = mapO2.get(strValueOf2)) == null || ((Integer) pair6.first).intValue() <= 0) {
                    j11 = jMq;
                } else {
                    String str4 = "day_" + iN + "_" + strValueOf2;
                    j11 = jMq;
                    if (!this.f73378dq.containsKey(str4)) {
                        long jD = this.f73382mq.d(strValueOf2, "network_id");
                        Long lValueOf = Long.valueOf(jD);
                        if (jD > j10) {
                            this.f73378dq.put(str4, lValueOf);
                        }
                    }
                }
                Map<String, Pair<Integer, Integer>> mapQ2 = this.f73392od.q();
                if (mapQ2 != null && (pair5 = mapQ2.get(str3)) != null && ((Integer) pair5.first).intValue() > 0) {
                    String str5 = "day_" + iN + "_" + str3;
                    if (!this.f73380m0.containsKey(str5)) {
                        long jD2 = this.f73382mq.d(str3, com.thinkup.core.common.d0.d.C0836d.f67666d0);
                        Long lValueOf2 = Long.valueOf(jD2);
                        if (jD2 > j10) {
                            this.f73380m0.put(str5, lValueOf2);
                        }
                    }
                }
            } else {
                j11 = jMq;
            }
            if (jMo > j10) {
                String str6 = "day_" + iN + "_" + strQn;
                if (!this.f73381md.containsKey(str6)) {
                    long jD3 = this.f73382mq.d(strQn, com.thinkup.core.common.d0.d.C0836d.f67668dm);
                    Long lValueOf3 = Long.valueOf(jD3);
                    if (jD3 > j10) {
                        this.f73381md.put(str6, lValueOf3);
                    }
                }
            }
            if (this.f73393om != null) {
                Map<String, Pair<Integer, Integer>> mapO3 = this.f73393om.o();
                if (mapO3 != null && (pair4 = mapO3.get(strValueOf2)) != null && ((Integer) pair4.first).intValue() > 0) {
                    String str7 = "hour_" + iO + "_" + strValueOf2;
                    if (!this.f73378dq.containsKey(str7)) {
                        long jM = this.f73382mq.m(strValueOf2, "network_id");
                        Long lValueOf4 = Long.valueOf(jM);
                        if (jM > j10) {
                            this.f73378dq.put(str7, lValueOf4);
                        }
                    }
                }
                Map<String, Pair<Integer, Integer>> mapQ3 = this.f73393om.q();
                if (mapQ3 != null && (pair3 = mapQ3.get(str3)) != null && ((Integer) pair3.first).intValue() > 0) {
                    String str8 = "hour_" + iO + "_" + str3;
                    if (!this.f73380m0.containsKey(str8)) {
                        long jM2 = this.f73382mq.m(str3, com.thinkup.core.common.d0.d.C0836d.f67666d0);
                        Long lValueOf5 = Long.valueOf(jM2);
                        if (jM2 > j10) {
                            this.f73380m0.put(str8, lValueOf5);
                        }
                    }
                }
            }
            if (j11 > j10) {
                String str9 = "hour_" + iO + "_" + strQn;
                if (!this.f73381md.containsKey(str9)) {
                    long jM3 = this.f73382mq.m(strQn, com.thinkup.core.common.d0.d.C0836d.f67668dm);
                    Long lValueOf6 = Long.valueOf(jM3);
                    if (jM3 > j10) {
                        this.f73381md.put(str9, lValueOf6);
                    }
                }
            }
            if (this.f73394on != null) {
                Map<String, Pair<Integer, Integer>> mapO4 = this.f73394on.o();
                if (mapO4 != null && (pair2 = mapO4.get(strValueOf2)) != null && ((Integer) pair2.second).intValue() > 0) {
                    String strConcat = "time_stamp_".concat(String.valueOf(strValueOf2));
                    if (!this.f73378dq.containsKey(strConcat) && (oVarN3 = this.f73382mq.n(strValueOf2, "network_id")) != null) {
                        this.f73378dq.put(strConcat, Long.valueOf(oVarN3.dn()));
                    }
                }
                Map<String, Pair<Integer, Integer>> mapQ4 = this.f73394on.q();
                if (mapQ4 != null && (pair = mapQ4.get(str3)) != null && ((Integer) pair.second).intValue() > 0) {
                    String strConcat2 = "time_stamp_".concat(str3);
                    if (!this.f73380m0.containsKey(strConcat2) && (oVarN2 = this.f73382mq.n(str3, com.thinkup.core.common.d0.d.C0836d.f67666d0)) != null) {
                        this.f73380m0.put(strConcat2, Long.valueOf(oVarN2.dn()));
                    }
                }
            }
            if (jQm > j10) {
                String strConcat3 = "time_stamp_".concat(String.valueOf(strQn));
                if (this.f73381md.containsKey(strConcat3) || (oVarN = this.f73382mq.n(strQn, com.thinkup.core.common.d0.d.C0836d.f67668dm)) == null) {
                    return;
                }
                this.f73381md.put(strConcat3, Long.valueOf(oVarN.dn()));
            }
        } catch (Throwable unused3) {
        }
    }

    public final long d0(String str) {
        return d(str, com.thinkup.core.common.d0.d.C0836d.f67683o, this.f73377dn);
    }

    public final long dd(String str) {
        return m(str, com.thinkup.core.common.d0.d.C0836d.f67683o, this.f73377dn);
    }

    public final void m(int i10, long j10, int i11, String str, String str2) {
        String str3;
        Pair<Integer, Integer> pair;
        try {
            if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2) && !TextUtils.isEmpty(String.valueOf(i11))) {
                if (this.f73395oo != null) {
                    Map<String, Pair<Integer, Integer>> mapO = this.f73395oo.o();
                    if (mapO != null && !mapO.isEmpty() && (pair = mapO.get(String.valueOf(i11))) != null && ((Integer) pair.first).intValue() > 0 && ((Integer) pair.second).intValue() > 0) {
                        com.thinkup.core.common.dm.o oVar = this.f73396q.get(String.valueOf(i11));
                        if (oVar != null) {
                            synchronized (oVar) {
                                try {
                                    if (System.currentTimeMillis() - oVar.dn() > ((Integer) pair.second).intValue()) {
                                        oVar.d(System.currentTimeMillis());
                                        oVar.f68577d = 1;
                                    } else {
                                        oVar.f68577d++;
                                    }
                                } catch (Throwable th2) {
                                    throw th2;
                                }
                            }
                        } else {
                            oVar = new com.thinkup.core.common.dm.o("1", String.valueOf(i11), "network_id", System.currentTimeMillis(), 1);
                            this.f73396q.put(String.valueOf(i11), oVar);
                        }
                        this.f73382mq.m(String.valueOf(i11), "network_id", oVar.f68577d, oVar.dn());
                    }
                    Map<String, Pair<Integer, Integer>> mapQ = this.f73395oo.q();
                    if (mapQ != null && !mapQ.isEmpty()) {
                        Pair<Integer, Integer> pair2 = mapQ.get(i11 + "_" + str2);
                        if (pair2 != null && ((Integer) pair2.first).intValue() > 0 && ((Integer) pair2.second).intValue() > 0) {
                            com.thinkup.core.common.dm.o oVar2 = this.f73375dd.get(i11 + "_" + str2);
                            if (oVar2 != null) {
                                synchronized (oVar2) {
                                    try {
                                        if (System.currentTimeMillis() - oVar2.dn() > ((Integer) pair2.second).intValue()) {
                                            oVar2.d(System.currentTimeMillis());
                                            oVar2.f68577d = 1;
                                        } else {
                                            oVar2.f68577d++;
                                        }
                                    } catch (Throwable th3) {
                                        throw th3;
                                    }
                                }
                            } else {
                                oVar2 = new com.thinkup.core.common.dm.o("1", i11 + "_" + str2, com.thinkup.core.common.d0.d.C0836d.f67666d0, System.currentTimeMillis(), 1);
                                this.f73375dd.put(i11 + "_" + str2, oVar2);
                            }
                            this.f73382mq.m(i11 + "_" + str2, com.thinkup.core.common.d0.d.C0836d.f67666d0, oVar2.f68577d, oVar2.dn());
                        }
                    }
                }
                if (i10 <= 0 || j10 <= 0) {
                    return;
                }
                com.thinkup.core.common.dm.o oVar3 = this.f73374d0.get(str);
                if (oVar3 != null) {
                    synchronized (oVar3) {
                        try {
                            if (System.currentTimeMillis() - oVar3.dn() > j10) {
                                oVar3.d(System.currentTimeMillis());
                                oVar3.f68577d = 1;
                            } else {
                                oVar3.f68577d++;
                            }
                        } catch (Throwable th4) {
                            throw th4;
                        }
                    }
                    str3 = str;
                } else {
                    com.thinkup.core.common.dm.o oVar4 = new com.thinkup.core.common.dm.o("1", str, com.thinkup.core.common.d0.d.C0836d.f67668dm, System.currentTimeMillis(), 1);
                    str3 = str;
                    this.f73374d0.put(str3, oVar4);
                    oVar3 = oVar4;
                }
                com.thinkup.core.common.dm.o oVar5 = oVar3;
                this.f73382mq.m(str3, com.thinkup.core.common.d0.d.C0836d.f67668dm, oVar5.f68577d, oVar5.dn());
            }
        } catch (Exception e10) {
            e10.printStackTrace();
        }
    }

    public final void o(m0q m0qVar) {
        if (m0qVar.nq0() == null || this.f73382mq == null) {
            return;
        }
        dn().d(m0qVar);
    }

    public final long q(String str) {
        return m(str, com.thinkup.core.common.d0.d.C0836d.f67668dm, this.f73381md);
    }

    public static class d {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private int f73400d;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        private int f73401m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private Map<String, Pair<Integer, Integer>> f73402n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        private Map<String, Pair<Integer, Integer>> f73403o;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        private Map<String, Pair<Integer, Integer>> f73404q;

        public final void d(int i10) {
            this.f73400d = i10;
        }

        public final void m(int i10) {
            this.f73401m = i10;
        }

        public final void n(Map<String, Pair<Integer, Integer>> map) {
            this.f73404q = map;
        }

        public final Map<String, Pair<Integer, Integer>> o() {
            return this.f73403o;
        }

        public final Map<String, Pair<Integer, Integer>> q() {
            return this.f73404q;
        }

        public final void d(Map<String, Pair<Integer, Integer>> map) {
            this.f73402n = map;
        }

        public final void m(Map<String, Pair<Integer, Integer>> map) {
            this.f73403o = map;
        }

        public final Map<String, Pair<Integer, Integer>> n() {
            return this.f73402n;
        }

        public final int d() {
            return this.f73400d;
        }

        public final int m() {
            return this.f73401m;
        }
    }

    private ConcurrentHashMap<String, com.thinkup.core.common.dm.o> d0() {
        return this.f73374d0;
    }

    private ConcurrentHashMap<String, Long> dd() {
        return this.f237do;
    }

    private ConcurrentHashMap<String, com.thinkup.core.common.dm.o> q() {
        return this.f73383n;
    }

    public final long o(String str) {
        return d(str, com.thinkup.core.common.d0.d.C0836d.f67668dm, this.f73381md);
    }

    private int o() {
        m();
        return this.f73385nd;
    }

    private int n() {
        m();
        return this.f73384n0;
    }

    public final long n(String str) {
        return m(str, "placement_id", this.f237do);
    }

    public final void n(m0q m0qVar) {
        if (m0qVar.nq0() == null || this.f73382mq == null) {
            return;
        }
        dn().n(m0qVar);
    }

    private void m() {
        long jCurrentTimeMillis = System.currentTimeMillis();
        if (jCurrentTimeMillis >= this.f73388no || jCurrentTimeMillis - this.f73387nn > ChunkedTrackBlacklistUtil.DEFAULT_TRACK_BLACKLIST_MS) {
            synchronized (this.f73389nq) {
                try {
                    long jCurrentTimeMillis2 = System.currentTimeMillis();
                    if (jCurrentTimeMillis2 >= this.f73388no || jCurrentTimeMillis2 - this.f73387nn > ChunkedTrackBlacklistUtil.DEFAULT_TRACK_BLACKLIST_MS) {
                        Date date = new Date(jCurrentTimeMillis2);
                        Calendar calendar = Calendar.getInstance();
                        calendar.setTimeInMillis(jCurrentTimeMillis2);
                        calendar.set(12, 0);
                        calendar.set(13, 0);
                        calendar.set(14, 0);
                        calendar.add(11, 1);
                        this.f73384n0 = Integer.parseInt(m(date));
                        this.f73385nd = Integer.parseInt(n(date));
                        this.f73386nm = d(date);
                        this.f73387nn = jCurrentTimeMillis2;
                        this.f73388no = calendar.getTimeInMillis();
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
    }

    public static String m(Date date) {
        return f73372mo.get().format(date).substring(8, 10);
    }

    private long m(String str, String str2, ConcurrentHashMap<String, Long> concurrentHashMap) {
        String str3 = "hour_" + o() + "_" + str;
        Long lValueOf = concurrentHashMap.get(str3);
        if (lValueOf == null) {
            long jM = this.f73382mq.m(str, str2);
            lValueOf = Long.valueOf(jM);
            if (jM > 0) {
                concurrentHashMap.put(str3, lValueOf);
            }
        }
        return lValueOf.longValue();
    }

    public final long m(String str) {
        return d(str, "placement_id", this.f237do);
    }

    private static void m(int i10, ConcurrentHashMap<String, Long> concurrentHashMap, String str, long j10) {
        long jValueOf;
        if (concurrentHashMap != null) {
            if (i10 == 2) {
                concurrentHashMap.put(str, Long.valueOf(j10));
                return;
            }
            Long l10 = concurrentHashMap.get(str);
            if (l10 == null) {
                jValueOf = 1L;
            } else {
                jValueOf = Long.valueOf(l10.longValue() + 1);
            }
            concurrentHashMap.put(str, jValueOf);
        }
    }

    public final dn m(m0q m0qVar) {
        if (m0qVar.nq0() == null || this.f73382mq == null) {
            return null;
        }
        return dn().m(m0qVar);
    }

    private static d m(JSONObject jSONObject) {
        JSONObject jSONObjectOptJSONObject;
        JSONObject jSONObjectOptJSONObject2;
        JSONObject jSONObjectOptJSONObject3;
        JSONObject jSONObjectOptJSONObject4;
        if (jSONObject == null) {
            return null;
        }
        try {
            d dVar = new d();
            JSONObject jSONObjectOptJSONObject5 = jSONObject.optJSONObject(com.thinkup.core.common.d0.d.C0836d.f67683o);
            if (jSONObjectOptJSONObject5 != null) {
                HashMap map = new HashMap();
                Iterator<String> itKeys = jSONObjectOptJSONObject5.keys();
                while (itKeys.hasNext()) {
                    String next = itKeys.next();
                    if (!TextUtils.isEmpty(next) && (jSONObjectOptJSONObject4 = jSONObjectOptJSONObject5.optJSONObject(next)) != null) {
                        int iOptInt = jSONObjectOptJSONObject4.optInt("max_num");
                        int iOptInt2 = jSONObjectOptJSONObject4.optInt("per_second");
                        if (iOptInt != 0 || iOptInt2 != 0) {
                            map.put(next, new Pair<>(Integer.valueOf(iOptInt), Integer.valueOf(iOptInt2)));
                        }
                    }
                }
                if (!map.isEmpty()) {
                    dVar.d(map);
                }
            }
            JSONObject jSONObjectOptJSONObject6 = jSONObject.optJSONObject("nw");
            if (jSONObjectOptJSONObject6 != null) {
                HashMap map2 = new HashMap();
                Iterator<String> itKeys2 = jSONObjectOptJSONObject6.keys();
                while (itKeys2.hasNext()) {
                    String next2 = itKeys2.next();
                    if (!TextUtils.isEmpty(next2) && (jSONObjectOptJSONObject3 = jSONObjectOptJSONObject6.optJSONObject(next2)) != null) {
                        int iOptInt3 = jSONObjectOptJSONObject3.optInt("max_num");
                        int iOptInt4 = jSONObjectOptJSONObject3.optInt("per_second");
                        if (iOptInt3 != 0 || iOptInt4 != 0) {
                            map2.put(next2, new Pair<>(Integer.valueOf(iOptInt3), Integer.valueOf(iOptInt4)));
                        }
                    }
                }
                if (!map2.isEmpty()) {
                    dVar.m(map2);
                }
            }
            JSONObject jSONObjectOptJSONObject7 = jSONObject.optJSONObject("nw_format");
            if (jSONObjectOptJSONObject7 != null) {
                HashMap map3 = new HashMap();
                Iterator<String> itKeys3 = jSONObjectOptJSONObject7.keys();
                while (itKeys3.hasNext()) {
                    String next3 = itKeys3.next();
                    if (!TextUtils.isEmpty(next3) && (jSONObjectOptJSONObject2 = jSONObjectOptJSONObject7.optJSONObject(next3)) != null) {
                        int iOptInt5 = jSONObjectOptJSONObject2.optInt("max_num");
                        int iOptInt6 = jSONObjectOptJSONObject2.optInt("per_second");
                        if (iOptInt5 != 0 || iOptInt6 != 0) {
                            map3.put(next3, new Pair<>(Integer.valueOf(iOptInt5), Integer.valueOf(iOptInt6)));
                        }
                    }
                }
                if (!map3.isEmpty()) {
                    dVar.n(map3);
                }
            }
            JSONObject jSONObjectOptJSONObject8 = jSONObject.optJSONObject("global");
            if (jSONObjectOptJSONObject8 != null && (jSONObjectOptJSONObject = jSONObjectOptJSONObject8.optJSONObject("global")) != null) {
                int iOptInt7 = jSONObjectOptJSONObject.optInt("max_num");
                if (iOptInt7 != 0) {
                    dVar.d(iOptInt7);
                }
                int iOptInt8 = jSONObjectOptJSONObject.optInt("per_second");
                if (iOptInt8 != 0) {
                    dVar.m(iOptInt8);
                }
            }
            return dVar;
        } catch (Exception e10) {
            e10.printStackTrace();
            return null;
        }
    }

    public static m d(Context context) {
        if (f73371mn == null) {
            synchronized (m.class) {
                try {
                    if (f73371mn == null) {
                        f73371mn = new m(context);
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        return f73371mn;
    }

    private com.thinkup.core.common.d0.d d() {
        return this.f73382mq;
    }

    public static String d(Date date) {
        return f73372mo.get().format(date).substring(5, 7);
    }

    private void d(String str, String str2) {
        try {
            com.thinkup.core.common.nn.m.n.d().q(new com.thinkup.core.common.nn.m.o(com.thinkup.core.common.nn.m.q.f72110mq, new AnonymousClass2(str, str2)));
        } catch (Throwable th2) {
            th2.printStackTrace();
        }
    }

    public final synchronized void d(JSONObject jSONObject) {
        try {
            if (jSONObject != null) {
                JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject(dq.f68828oo);
                if (jSONObjectOptJSONObject != null) {
                    this.f73392od = m(jSONObjectOptJSONObject);
                } else if (this.f73392od != null) {
                    this.f73392od = null;
                }
                JSONObject jSONObjectOptJSONObject2 = jSONObject.optJSONObject(dq.f68829oq);
                if (jSONObjectOptJSONObject2 != null) {
                    this.f73393om = m(jSONObjectOptJSONObject2);
                } else if (this.f73393om != null) {
                    this.f73393om = null;
                }
                JSONObject jSONObjectOptJSONObject3 = jSONObject.optJSONObject("caps_s");
                if (jSONObjectOptJSONObject3 != null) {
                    this.f73394on = m(jSONObjectOptJSONObject3);
                } else if (this.f73394on != null) {
                    this.f73394on = null;
                }
                JSONObject jSONObjectOptJSONObject4 = jSONObject.optJSONObject("req_pace");
                if (jSONObjectOptJSONObject4 != null) {
                    this.f73395oo = m(jSONObjectOptJSONObject4);
                    return;
                } else {
                    if (this.f73395oo != null) {
                        this.f73395oo = null;
                    }
                    return;
                }
            }
            if (this.f73392od != null) {
                this.f73392od = null;
            }
            if (this.f73393om != null) {
                this.f73393om = null;
            }
            if (this.f73394on != null) {
                this.f73394on = null;
            }
            if (this.f73395oo != null) {
                this.f73395oo = null;
            }
        } catch (Throwable unused) {
        }
    }

    public final int d(String str) {
        Pair<Integer, Integer> pair;
        com.thinkup.core.common.dm.o oVar;
        com.thinkup.core.common.dm.o oVar2;
        try {
            if (this.f73395oo != null) {
                if (this.f73395oo.d() > 0 && this.f73395oo.m() > 0) {
                    String strMo = nd.m().mo();
                    if (!TextUtils.isEmpty(strMo) && (oVar2 = this.f73379m.get(strMo)) != null && oVar2.f68577d >= this.f73395oo.d() && System.currentTimeMillis() - oVar2.dn() <= this.f73395oo.m()) {
                        return 9;
                    }
                }
                Map<String, Pair<Integer, Integer>> mapN = this.f73395oo.n();
                if (mapN != null && !mapN.isEmpty() && (pair = mapN.get(str)) != null && ((Integer) pair.first).intValue() > 0 && ((Integer) pair.second).intValue() > 0 && (oVar = this.f73390o.get(str)) != null && oVar.f68577d >= ((Integer) pair.first).intValue() && System.currentTimeMillis() - oVar.dn() <= ((Integer) pair.second).intValue()) {
                    return 10;
                }
            }
        } catch (Exception e10) {
            e10.printStackTrace();
        }
        return f73370mm;
    }

    public final int d(int i10, long j10, String str) {
        if (i10 > 0 && j10 > 0) {
            try {
                com.thinkup.core.common.dm.o oVar = this.f73383n.get(str);
                if (oVar != null && oVar.f68577d >= i10 && System.currentTimeMillis() - oVar.dn() <= j10) {
                    return 8;
                }
            } catch (Exception e10) {
                e10.printStackTrace();
            }
        }
        return f73370mm;
    }

    public final void d(int i10, long j10, String str, int i11) {
        String str2;
        Pair<Integer, Integer> pair;
        String str3;
        try {
            if (this.f73395oo != null) {
                if (this.f73395oo.d() > 0 && this.f73395oo.m() > 0) {
                    String strMo = nd.m().mo();
                    if (!TextUtils.isEmpty(strMo)) {
                        com.thinkup.core.common.dm.o oVar = this.f73379m.get(strMo);
                        if (oVar != null) {
                            synchronized (oVar) {
                                try {
                                    if (System.currentTimeMillis() - oVar.dn() > this.f73395oo.m()) {
                                        oVar.d(System.currentTimeMillis());
                                        oVar.f68577d = 1;
                                    } else {
                                        oVar.f68577d++;
                                    }
                                } catch (Throwable th2) {
                                    throw th2;
                                }
                            }
                            str3 = strMo;
                        } else {
                            str3 = strMo;
                            oVar = new com.thinkup.core.common.dm.o("1", str3, "app", System.currentTimeMillis(), 1);
                            this.f73379m.put(str3, oVar);
                        }
                        this.f73382mq.m(str3, "app", oVar.f68577d, oVar.dn());
                    }
                }
                Map<String, Pair<Integer, Integer>> mapN = this.f73395oo.n();
                if (mapN != null && !mapN.isEmpty() && (pair = mapN.get(String.valueOf(i11))) != null && ((Integer) pair.first).intValue() > 0 && ((Integer) pair.second).intValue() > 0) {
                    com.thinkup.core.common.dm.o oVar2 = this.f73390o.get(String.valueOf(i11));
                    if (oVar2 != null) {
                        synchronized (oVar2) {
                            try {
                                if (System.currentTimeMillis() - oVar2.dn() > ((Integer) pair.second).intValue()) {
                                    oVar2.d(System.currentTimeMillis());
                                    oVar2.f68577d = 1;
                                } else {
                                    oVar2.f68577d++;
                                }
                            } catch (Throwable th3) {
                                throw th3;
                            }
                        }
                    } else {
                        com.thinkup.core.common.dm.o oVar3 = new com.thinkup.core.common.dm.o("1", String.valueOf(i11), com.thinkup.core.common.d0.d.C0836d.f67683o, System.currentTimeMillis(), 1);
                        this.f73390o.put(String.valueOf(i11), oVar3);
                        oVar2 = oVar3;
                    }
                    this.f73382mq.m(String.valueOf(i11), com.thinkup.core.common.d0.d.C0836d.f67683o, oVar2.f68577d, oVar2.dn());
                }
            }
            if (i10 <= 0 || j10 <= 0) {
                return;
            }
            com.thinkup.core.common.dm.o oVar4 = this.f73383n.get(str);
            if (oVar4 != null) {
                synchronized (oVar4) {
                    try {
                        if (System.currentTimeMillis() - oVar4.dn() > j10) {
                            oVar4.d(System.currentTimeMillis());
                            oVar4.f68577d = 1;
                        } else {
                            oVar4.f68577d++;
                        }
                    } catch (Throwable th4) {
                        throw th4;
                    }
                }
                str2 = str;
            } else {
                str2 = str;
                com.thinkup.core.common.dm.o oVar5 = new com.thinkup.core.common.dm.o("1", str2, "placement_id", System.currentTimeMillis(), 1);
                this.f73383n.put(str2, oVar5);
                oVar4 = oVar5;
            }
            this.f73382mq.m(str2, "placement_id", oVar4.f68577d, oVar4.dn());
        } catch (Throwable unused) {
        }
    }

    public final int d(int i10, long j10, int i11, String str, String str2) {
        com.thinkup.core.common.dm.o oVar;
        Pair<Integer, Integer> pair;
        com.thinkup.core.common.dm.o oVar2;
        try {
            if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2)) {
                if (this.f73395oo != null) {
                    Map<String, Pair<Integer, Integer>> mapO = this.f73395oo.o();
                    if (mapO != null && !mapO.isEmpty() && (pair = mapO.get(String.valueOf(i11))) != null && ((Integer) pair.first).intValue() > 0 && ((Integer) pair.second).intValue() > 0 && (oVar2 = this.f73396q.get(String.valueOf(i11))) != null && oVar2.f68577d >= ((Integer) pair.first).intValue() && System.currentTimeMillis() - oVar2.dn() <= ((Integer) pair.second).intValue()) {
                        return 25;
                    }
                    Map<String, Pair<Integer, Integer>> mapQ = this.f73395oo.q();
                    if (mapQ != null && !mapQ.isEmpty()) {
                        Pair<Integer, Integer> pair2 = mapQ.get(i11 + "_" + str2);
                        if (pair2 != null && ((Integer) pair2.first).intValue() > 0 && ((Integer) pair2.second).intValue() > 0) {
                            com.thinkup.core.common.dm.o oVar3 = this.f73375dd.get(i11 + "_" + str2);
                            if (oVar3 != null && oVar3.f68577d >= ((Integer) pair2.first).intValue() && System.currentTimeMillis() - oVar3.dn() <= ((Integer) pair2.second).intValue()) {
                                return 26;
                            }
                        }
                    }
                }
                if (i10 > 0 && j10 > 0 && (oVar = this.f73374d0.get(str)) != null && oVar.f68577d >= i10 && System.currentTimeMillis() - oVar.dn() <= j10) {
                    return 18;
                }
                return f73370mm;
            }
            return f73370mm;
        } catch (Exception e10) {
            e10.printStackTrace();
        }
    }

    public final int d(String str, String str2, long j10, long j11) {
        Pair<Integer, Integer> pair;
        Long l10;
        Pair<Integer, Integer> pair2;
        Long l11;
        try {
            int iN = n();
            int iO = o();
            if (this.f73392od != null) {
                if (this.f73392od.d() > 0 && (l11 = this.f73376dm.get("day_".concat(String.valueOf(iN)))) != null && l11.longValue() > 0 && l11.longValue() >= this.f73392od.d()) {
                    return 7;
                }
                Map<String, Pair<Integer, Integer>> mapN = this.f73392od.n();
                if (mapN != null && !mapN.isEmpty() && (pair2 = mapN.get(str2)) != null && ((Integer) pair2.first).intValue() > 0) {
                    Long l12 = this.f73377dn.get("day_" + iN + "_" + str2);
                    if (l12 != null && l12.longValue() > 0 && l12.longValue() >= ((Integer) pair2.first).intValue()) {
                        return 8;
                    }
                }
            }
            if (j10 > 0) {
                Long l13 = this.f237do.get("day_" + iN + "_" + str);
                if (l13 != null && l13.longValue() > 0 && l13.longValue() >= j10) {
                    return 2;
                }
            }
            if (this.f73393om != null) {
                if (this.f73393om.d() > 0 && (l10 = this.f73376dm.get("hour_".concat(String.valueOf(iO)))) != null && l10.longValue() > 0 && l10.longValue() >= this.f73393om.d()) {
                    return 9;
                }
                Map<String, Pair<Integer, Integer>> mapN2 = this.f73393om.n();
                if (mapN2 != null && !mapN2.isEmpty() && (pair = mapN2.get(str2)) != null && ((Integer) pair.first).intValue() > 0) {
                    Long l14 = this.f73377dn.get("hour_" + iO + "_" + str2);
                    if (l14 != null && l14.longValue() > 0 && l14.longValue() >= ((Integer) pair.first).intValue()) {
                        return 10;
                    }
                }
            }
            if (j11 > 0) {
                Long l15 = this.f237do.get("hour_" + iO + "_" + str);
                if (l15 != null && l15.longValue() > 0 && l15.longValue() >= j11) {
                    return 2;
                }
            }
        } catch (Throwable th2) {
            th2.printStackTrace();
        }
        return f73370mm;
    }

    public final int d(String str, String str2, long j10) {
        Long l10;
        Pair<Integer, Integer> pair;
        Long l11;
        Long l12;
        try {
            if (this.f73394on != null) {
                if (this.f73394on.m() > 0 && (l12 = this.f73376dm.get("time_stamp")) != null && System.currentTimeMillis() - l12.longValue() < this.f73394on.m()) {
                    return 11;
                }
                Map<String, Pair<Integer, Integer>> mapN = this.f73394on.n();
                if (mapN != null && !mapN.isEmpty() && (pair = mapN.get(str2)) != null && ((Integer) pair.second).intValue() > 0 && (l11 = this.f73377dn.get("time_stamp_".concat(String.valueOf(str2)))) != null && System.currentTimeMillis() - l11.longValue() < ((Integer) pair.second).intValue()) {
                    return 12;
                }
            }
            if (j10 > 0 && (l10 = this.f237do.get("time_stamp_".concat(String.valueOf(str)))) != null && System.currentTimeMillis() - l10.longValue() < j10) {
                return 3;
            }
        } catch (Throwable th2) {
            th2.printStackTrace();
        }
        return f73370mm;
    }

    public final int d(String str, String str2, String str3, long j10, long j11) {
        Pair<Integer, Integer> pair;
        Pair<Integer, Integer> pair2;
        try {
            int iN = n();
            int iO = o();
            if (this.f73392od != null) {
                Map<String, Pair<Integer, Integer>> mapO = this.f73392od.o();
                if (mapO != null && !mapO.isEmpty() && (pair2 = mapO.get(str)) != null && ((Integer) pair2.first).intValue() > 0) {
                    Long l10 = this.f73378dq.get("day_" + iN + "_" + str);
                    if (l10 != null && l10.longValue() > 0 && l10.longValue() >= ((Integer) pair2.first).intValue()) {
                        return 8;
                    }
                }
                Map<String, Pair<Integer, Integer>> mapQ = this.f73392od.q();
                if (mapQ != null && !mapQ.isEmpty()) {
                    Pair<Integer, Integer> pair3 = mapQ.get(str + "_" + str3);
                    if (pair3 != null && ((Integer) pair3.first).intValue() > 0) {
                        Long l11 = this.f73380m0.get("day_" + iN + "_" + str + "_" + str3);
                        if (l11 != null && l11.longValue() > 0 && l11.longValue() >= ((Integer) pair3.first).intValue()) {
                            return 9;
                        }
                    }
                }
            }
            if (j10 > 0) {
                Long l12 = this.f73381md.get("day_" + iN + "_" + str2);
                if (l12 != null && l12.longValue() > 0 && l12.longValue() >= j10) {
                    return 2;
                }
            }
            if (this.f73393om != null) {
                Map<String, Pair<Integer, Integer>> mapO2 = this.f73393om.o();
                if (mapO2 != null && !mapO2.isEmpty() && (pair = mapO2.get(str)) != null && ((Integer) pair.first).intValue() > 0) {
                    Long l13 = this.f73378dq.get("hour_" + iO + "_" + str);
                    if (l13 != null && l13.longValue() > 0 && l13.longValue() >= ((Integer) pair.first).intValue()) {
                        return 10;
                    }
                }
                Map<String, Pair<Integer, Integer>> mapQ2 = this.f73393om.q();
                if (mapQ2 != null && !mapQ2.isEmpty()) {
                    Pair<Integer, Integer> pair4 = mapQ2.get(str + "_" + str3);
                    if (pair4 != null && ((Integer) pair4.first).intValue() > 0) {
                        Long l14 = this.f73380m0.get("hour_" + iO + "_" + str + "_" + str3);
                        if (l14 != null && l14.longValue() > 0 && l14.longValue() >= ((Integer) pair4.first).intValue()) {
                            return 11;
                        }
                    }
                }
            }
            if (j11 > 0) {
                Long l15 = this.f73381md.get("hour_" + iO + "_" + str2);
                if (l15 != null && l15.longValue() > 0 && l15.longValue() >= j11) {
                    return 2;
                }
            }
        } catch (Throwable th2) {
            th2.printStackTrace();
        }
        return f73370mm;
    }

    public final int d(String str, String str2, String str3, long j10) {
        Long l10;
        Pair<Integer, Integer> pair;
        Long l11;
        try {
            if (this.f73394on != null) {
                Map<String, Pair<Integer, Integer>> mapO = this.f73394on.o();
                if (mapO != null && !mapO.isEmpty() && (pair = mapO.get(str)) != null && ((Integer) pair.second).intValue() > 0 && (l11 = this.f73378dq.get("time_stamp_".concat(String.valueOf(str)))) != null && System.currentTimeMillis() - l11.longValue() < ((Integer) pair.second).intValue()) {
                    return 12;
                }
                Map<String, Pair<Integer, Integer>> mapQ = this.f73394on.q();
                if (mapQ != null && !mapQ.isEmpty()) {
                    Pair<Integer, Integer> pair2 = mapQ.get(str + "_" + str3);
                    if (pair2 != null && ((Integer) pair2.second).intValue() > 0) {
                        Long l12 = this.f73380m0.get("time_stamp_" + str + "_" + str3);
                        if (l12 != null && System.currentTimeMillis() - l12.longValue() < ((Integer) pair2.second).intValue()) {
                            return 13;
                        }
                    }
                }
            }
            if (j10 > 0 && (l10 = this.f73381md.get("time_stamp_".concat(String.valueOf(str2)))) != null && System.currentTimeMillis() - l10.longValue() < j10) {
                return 3;
            }
        } catch (Throwable th2) {
            th2.printStackTrace();
        }
        return f73370mm;
    }

    public final void d(String str, m0 m0Var) {
        long j10;
        com.thinkup.core.common.dm.o oVarN;
        Pair<Integer, Integer> pair;
        com.thinkup.core.common.dm.o oVarN2;
        com.thinkup.core.common.dm.o oVarN3;
        Pair<Integer, Integer> pair2;
        Pair<Integer, Integer> pair3;
        com.thinkup.core.common.dm.o oVarO;
        Pair<Integer, Integer> pair4;
        com.thinkup.core.common.dm.o oVarO2;
        com.thinkup.core.common.dm.o oVarO3;
        if (m0Var == null || TextUtils.isEmpty(str)) {
            return;
        }
        String strValueOf = String.valueOf(m0Var.dqm());
        int iMdo = m0Var.mdo();
        long jMdq = m0Var.mdq();
        try {
            if (this.f73395oo != null) {
                if (this.f73395oo.d() > 0 && this.f73395oo.m() > 0) {
                    String strMo = nd.m().mo();
                    if (!TextUtils.isEmpty(strMo) && !this.f73379m.containsKey(strMo) && (oVarO3 = this.f73382mq.o(strMo, "app")) != null) {
                        this.f73379m.put(strMo, oVarO3);
                    }
                }
                Map<String, Pair<Integer, Integer>> mapN = this.f73395oo.n();
                if (mapN != null && (pair4 = mapN.get(strValueOf)) != null && ((Integer) pair4.first).intValue() > 0 && ((Integer) pair4.second).intValue() > 0 && !this.f73390o.containsKey(strValueOf) && (oVarO2 = this.f73382mq.o(strValueOf, com.thinkup.core.common.d0.d.C0836d.f67683o)) != null) {
                    this.f73390o.put(strValueOf, oVarO2);
                }
            }
            if (iMdo > 0 && jMdq > 0 && !this.f73383n.containsKey(str) && (oVarO = this.f73382mq.o(str, "placement_id")) != null) {
                this.f73383n.put(str, oVarO);
            }
        } catch (Throwable unused) {
        }
        long jM0d = m0Var.m0d();
        long jM0m = m0Var.m0m();
        long jM0n = m0Var.m0n();
        try {
            int iN = n();
            int iO = o();
            String strMo2 = nd.m().mo();
            if (this.f73392od != null) {
                if (this.f73392od.d() <= 0 || TextUtils.isEmpty(strMo2)) {
                    j10 = jM0m;
                } else {
                    String strConcat = "day_".concat(String.valueOf(iN));
                    j10 = jM0m;
                    if (!this.f73376dm.containsKey(strConcat)) {
                        long jD = this.f73382mq.d(strMo2, "app");
                        Long lValueOf = Long.valueOf(jD);
                        if (jD > 0) {
                            this.f73376dm.put(strConcat, lValueOf);
                        }
                    }
                }
                Map<String, Pair<Integer, Integer>> mapN2 = this.f73392od.n();
                if (mapN2 != null && (pair3 = mapN2.get(strValueOf)) != null && ((Integer) pair3.first).intValue() > 0) {
                    String str2 = "day_" + iN + "_" + strValueOf;
                    if (!this.f73377dn.containsKey(str2)) {
                        long jD2 = this.f73382mq.d(strValueOf, com.thinkup.core.common.d0.d.C0836d.f67683o);
                        Long lValueOf2 = Long.valueOf(jD2);
                        if (jD2 > 0) {
                            this.f73377dn.put(str2, lValueOf2);
                        }
                    }
                }
            } else {
                j10 = jM0m;
            }
            if (jM0d > 0) {
                String str3 = "day_" + iN + "_" + str;
                if (!this.f237do.containsKey(str3)) {
                    long jD3 = this.f73382mq.d(str, "placement_id");
                    Long lValueOf3 = Long.valueOf(jD3);
                    if (jD3 > 0) {
                        this.f237do.put(str3, lValueOf3);
                    }
                }
            }
            if (this.f73393om != null) {
                if (this.f73393om.d() > 0 && !TextUtils.isEmpty(strMo2)) {
                    String strConcat2 = "hour_".concat(String.valueOf(iO));
                    if (!this.f73376dm.containsKey(strConcat2)) {
                        long jM = this.f73382mq.m(strMo2, "app");
                        Long lValueOf4 = Long.valueOf(jM);
                        if (jM > 0) {
                            this.f73376dm.put(strConcat2, lValueOf4);
                        }
                    }
                }
                Map<String, Pair<Integer, Integer>> mapN3 = this.f73393om.n();
                if (mapN3 != null && (pair2 = mapN3.get(strValueOf)) != null && ((Integer) pair2.first).intValue() > 0) {
                    String str4 = "hour_" + iO + "_" + strValueOf;
                    if (!this.f73377dn.containsKey(str4)) {
                        long jM2 = this.f73382mq.m(strValueOf, com.thinkup.core.common.d0.d.C0836d.f67683o);
                        Long lValueOf5 = Long.valueOf(jM2);
                        if (jM2 > 0) {
                            this.f73377dn.put(str4, lValueOf5);
                        }
                    }
                }
            }
            if (j10 > 0) {
                String str5 = "hour_" + iO + "_" + str;
                if (!this.f237do.containsKey(str5)) {
                    long jM3 = this.f73382mq.m(str, "placement_id");
                    Long lValueOf6 = Long.valueOf(jM3);
                    if (jM3 > 0) {
                        this.f237do.put(str5, lValueOf6);
                    }
                }
            }
            if (this.f73394on != null) {
                if (this.f73394on.m() > 0 && !TextUtils.isEmpty(strMo2) && !this.f73376dm.containsKey("time_stamp") && (oVarN3 = this.f73382mq.n(strMo2, "app")) != null) {
                    this.f73376dm.put("time_stamp", Long.valueOf(oVarN3.dn()));
                }
                Map<String, Pair<Integer, Integer>> mapN4 = this.f73394on.n();
                if (mapN4 != null && (pair = mapN4.get(strValueOf)) != null && ((Integer) pair.second).intValue() > 0) {
                    String strConcat3 = "time_stamp_".concat(String.valueOf(strValueOf));
                    if (!this.f73377dn.containsKey(strConcat3) && (oVarN2 = this.f73382mq.n(strValueOf, com.thinkup.core.common.d0.d.C0836d.f67683o)) != null) {
                        this.f73377dn.put(strConcat3, Long.valueOf(oVarN2.dn()));
                    }
                }
            }
            if (jM0n > 0) {
                String strConcat4 = "time_stamp_".concat(String.valueOf(str));
                if (this.f237do.containsKey(strConcat4) || (oVarN = this.f73382mq.n(str, "placement_id")) == null) {
                    return;
                }
                this.f237do.put(strConcat4, Long.valueOf(oVarN.dn()));
            }
        } catch (Throwable unused2) {
        }
    }

    private void d(String str, String str2, int i10, long j10) {
        com.thinkup.core.common.dm.o oVarO;
        Pair<Integer, Integer> pair;
        com.thinkup.core.common.dm.o oVarO2;
        com.thinkup.core.common.dm.o oVarO3;
        try {
            if (this.f73395oo != null) {
                if (this.f73395oo.d() > 0 && this.f73395oo.m() > 0) {
                    String strMo = nd.m().mo();
                    if (!TextUtils.isEmpty(strMo) && !this.f73379m.containsKey(strMo) && (oVarO3 = this.f73382mq.o(strMo, "app")) != null) {
                        this.f73379m.put(strMo, oVarO3);
                    }
                }
                Map<String, Pair<Integer, Integer>> mapN = this.f73395oo.n();
                if (mapN != null && (pair = mapN.get(str2)) != null && ((Integer) pair.first).intValue() > 0 && ((Integer) pair.second).intValue() > 0 && !this.f73390o.containsKey(str2) && (oVarO2 = this.f73382mq.o(str2, com.thinkup.core.common.d0.d.C0836d.f67683o)) != null) {
                    this.f73390o.put(str2, oVarO2);
                }
            }
            if (i10 <= 0 || j10 <= 0 || this.f73383n.containsKey(str) || (oVarO = this.f73382mq.o(str, "placement_id")) == null) {
                return;
            }
            this.f73383n.put(str, oVarO);
        } catch (Throwable unused) {
        }
    }

    private void d(int i10, String str, String str2, int i11, long j10) {
        com.thinkup.core.common.dm.o oVarO;
        Pair<Integer, Integer> pair;
        com.thinkup.core.common.dm.o oVarO2;
        Pair<Integer, Integer> pair2;
        com.thinkup.core.common.dm.o oVarO3;
        try {
            if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2)) {
                String strValueOf = String.valueOf(i10);
                String str3 = i10 + "_" + str2;
                if (this.f73395oo != null) {
                    Map<String, Pair<Integer, Integer>> mapO = this.f73395oo.o();
                    if (mapO != null && (pair2 = mapO.get(strValueOf)) != null && ((Integer) pair2.first).intValue() > 0 && ((Integer) pair2.second).intValue() > 0 && !this.f73396q.containsKey(strValueOf) && (oVarO3 = this.f73382mq.o(strValueOf, "network_id")) != null) {
                        this.f73396q.put(strValueOf, oVarO3);
                    }
                    Map<String, Pair<Integer, Integer>> mapQ = this.f73395oo.q();
                    if (mapQ != null && (pair = mapQ.get(str3)) != null && ((Integer) pair.first).intValue() > 0 && ((Integer) pair.second).intValue() > 0 && !this.f73375dd.containsKey(str3) && (oVarO2 = this.f73382mq.o(str3, com.thinkup.core.common.d0.d.C0836d.f67666d0)) != null) {
                        this.f73375dd.put(str3, oVarO2);
                    }
                }
                if (i11 <= 0 || j10 <= 0 || this.f73374d0.containsKey(str) || (oVarO = this.f73382mq.o(str, com.thinkup.core.common.d0.d.C0836d.f67668dm)) == null) {
                    return;
                }
                this.f73374d0.put(str, oVarO);
            }
        } catch (Throwable unused) {
        }
    }

    private void d(String str, String str2, long j10, long j11, long j12) {
        com.thinkup.core.common.dm.o oVarN;
        Pair<Integer, Integer> pair;
        com.thinkup.core.common.dm.o oVarN2;
        com.thinkup.core.common.dm.o oVarN3;
        Pair<Integer, Integer> pair2;
        Pair<Integer, Integer> pair3;
        try {
            int iN = n();
            int iO = o();
            String strMo = nd.m().mo();
            if (this.f73392od != null) {
                if (this.f73392od.d() > 0 && !TextUtils.isEmpty(strMo)) {
                    String strConcat = "day_".concat(String.valueOf(iN));
                    if (!this.f73376dm.containsKey(strConcat)) {
                        long jD = this.f73382mq.d(strMo, "app");
                        Long lValueOf = Long.valueOf(jD);
                        if (jD > 0) {
                            this.f73376dm.put(strConcat, lValueOf);
                        }
                    }
                }
                Map<String, Pair<Integer, Integer>> mapN = this.f73392od.n();
                if (mapN != null && (pair3 = mapN.get(str2)) != null && ((Integer) pair3.first).intValue() > 0) {
                    String str3 = "day_" + iN + "_" + str2;
                    if (!this.f73377dn.containsKey(str3)) {
                        long jD2 = this.f73382mq.d(str2, com.thinkup.core.common.d0.d.C0836d.f67683o);
                        Long lValueOf2 = Long.valueOf(jD2);
                        if (jD2 > 0) {
                            this.f73377dn.put(str3, lValueOf2);
                        }
                    }
                }
            }
            if (j10 > 0) {
                String str4 = "day_" + iN + "_" + str;
                if (!this.f237do.containsKey(str4)) {
                    long jD3 = this.f73382mq.d(str, "placement_id");
                    Long lValueOf3 = Long.valueOf(jD3);
                    if (jD3 > 0) {
                        this.f237do.put(str4, lValueOf3);
                    }
                }
            }
            if (this.f73393om != null) {
                if (this.f73393om.d() > 0 && !TextUtils.isEmpty(strMo)) {
                    String strConcat2 = "hour_".concat(String.valueOf(iO));
                    if (!this.f73376dm.containsKey(strConcat2)) {
                        long jM = this.f73382mq.m(strMo, "app");
                        Long lValueOf4 = Long.valueOf(jM);
                        if (jM > 0) {
                            this.f73376dm.put(strConcat2, lValueOf4);
                        }
                    }
                }
                Map<String, Pair<Integer, Integer>> mapN2 = this.f73393om.n();
                if (mapN2 != null && (pair2 = mapN2.get(str2)) != null && ((Integer) pair2.first).intValue() > 0) {
                    String str5 = "hour_" + iO + "_" + str2;
                    if (!this.f73377dn.containsKey(str5)) {
                        long jM2 = this.f73382mq.m(str2, com.thinkup.core.common.d0.d.C0836d.f67683o);
                        Long lValueOf5 = Long.valueOf(jM2);
                        if (jM2 > 0) {
                            this.f73377dn.put(str5, lValueOf5);
                        }
                    }
                }
            }
            if (j11 > 0) {
                String str6 = "hour_" + iO + "_" + str;
                if (!this.f237do.containsKey(str6)) {
                    long jM3 = this.f73382mq.m(str, "placement_id");
                    Long lValueOf6 = Long.valueOf(jM3);
                    if (jM3 > 0) {
                        this.f237do.put(str6, lValueOf6);
                    }
                }
            }
            if (this.f73394on != null) {
                if (this.f73394on.m() > 0 && !TextUtils.isEmpty(strMo) && !this.f73376dm.containsKey("time_stamp") && (oVarN3 = this.f73382mq.n(strMo, "app")) != null) {
                    this.f73376dm.put("time_stamp", Long.valueOf(oVarN3.dn()));
                }
                Map<String, Pair<Integer, Integer>> mapN3 = this.f73394on.n();
                if (mapN3 != null && (pair = mapN3.get(str2)) != null && ((Integer) pair.second).intValue() > 0) {
                    String strConcat3 = "time_stamp_".concat(String.valueOf(str2));
                    if (!this.f73377dn.containsKey(strConcat3) && (oVarN2 = this.f73382mq.n(str2, com.thinkup.core.common.d0.d.C0836d.f67683o)) != null) {
                        this.f73377dn.put(strConcat3, Long.valueOf(oVarN2.dn()));
                    }
                }
            }
            if (j12 > 0) {
                String strConcat4 = "time_stamp_".concat(String.valueOf(str));
                if (this.f237do.containsKey(strConcat4) || (oVarN = this.f73382mq.n(str, "placement_id")) == null) {
                    return;
                }
                this.f237do.put(strConcat4, Long.valueOf(oVarN.dn()));
            }
        } catch (Throwable unused) {
        }
    }

    private void d(String str, String str2, String str3, long j10, long j11, long j12) {
        com.thinkup.core.common.dm.o oVarN;
        Pair<Integer, Integer> pair;
        com.thinkup.core.common.dm.o oVarN2;
        Pair<Integer, Integer> pair2;
        com.thinkup.core.common.dm.o oVarN3;
        Pair<Integer, Integer> pair3;
        Pair<Integer, Integer> pair4;
        Pair<Integer, Integer> pair5;
        Pair<Integer, Integer> pair6;
        try {
            int iN = n();
            int iO = o();
            String str4 = str + "_" + str3;
            if (this.f73392od != null) {
                Map<String, Pair<Integer, Integer>> mapO = this.f73392od.o();
                if (mapO != null && (pair6 = mapO.get(str)) != null && ((Integer) pair6.first).intValue() > 0) {
                    String str5 = "day_" + iN + "_" + str;
                    if (!this.f73378dq.containsKey(str5)) {
                        long jD = this.f73382mq.d(str, "network_id");
                        Long lValueOf = Long.valueOf(jD);
                        if (jD > 0) {
                            this.f73378dq.put(str5, lValueOf);
                        }
                    }
                }
                Map<String, Pair<Integer, Integer>> mapQ = this.f73392od.q();
                if (mapQ != null && (pair5 = mapQ.get(str4)) != null && ((Integer) pair5.first).intValue() > 0) {
                    String str6 = "day_" + iN + "_" + str4;
                    if (!this.f73380m0.containsKey(str6)) {
                        long jD2 = this.f73382mq.d(str4, com.thinkup.core.common.d0.d.C0836d.f67666d0);
                        Long lValueOf2 = Long.valueOf(jD2);
                        if (jD2 > 0) {
                            this.f73380m0.put(str6, lValueOf2);
                        }
                    }
                }
            }
            if (j10 > 0) {
                String str7 = "day_" + iN + "_" + str2;
                if (!this.f73381md.containsKey(str7)) {
                    long jD3 = this.f73382mq.d(str2, com.thinkup.core.common.d0.d.C0836d.f67668dm);
                    Long lValueOf3 = Long.valueOf(jD3);
                    if (jD3 > 0) {
                        this.f73381md.put(str7, lValueOf3);
                    }
                }
            }
            if (this.f73393om != null) {
                Map<String, Pair<Integer, Integer>> mapO2 = this.f73393om.o();
                if (mapO2 != null && (pair4 = mapO2.get(str)) != null && ((Integer) pair4.first).intValue() > 0) {
                    String str8 = "hour_" + iO + "_" + str;
                    if (!this.f73378dq.containsKey(str8)) {
                        long jM = this.f73382mq.m(str, "network_id");
                        Long lValueOf4 = Long.valueOf(jM);
                        if (jM > 0) {
                            this.f73378dq.put(str8, lValueOf4);
                        }
                    }
                }
                Map<String, Pair<Integer, Integer>> mapQ2 = this.f73393om.q();
                if (mapQ2 != null && (pair3 = mapQ2.get(str4)) != null && ((Integer) pair3.first).intValue() > 0) {
                    String str9 = "hour_" + iO + "_" + str4;
                    if (!this.f73380m0.containsKey(str9)) {
                        long jM2 = this.f73382mq.m(str4, com.thinkup.core.common.d0.d.C0836d.f67666d0);
                        Long lValueOf5 = Long.valueOf(jM2);
                        if (jM2 > 0) {
                            this.f73380m0.put(str9, lValueOf5);
                        }
                    }
                }
            }
            if (j11 > 0) {
                String str10 = "hour_" + iO + "_" + str2;
                if (!this.f73381md.containsKey(str10)) {
                    long jM3 = this.f73382mq.m(str2, com.thinkup.core.common.d0.d.C0836d.f67668dm);
                    Long lValueOf6 = Long.valueOf(jM3);
                    if (jM3 > 0) {
                        this.f73381md.put(str10, lValueOf6);
                    }
                }
            }
            if (this.f73394on != null) {
                Map<String, Pair<Integer, Integer>> mapO3 = this.f73394on.o();
                if (mapO3 != null && (pair2 = mapO3.get(str)) != null && ((Integer) pair2.second).intValue() > 0) {
                    String strConcat = "time_stamp_".concat(String.valueOf(str));
                    if (!this.f73378dq.containsKey(strConcat) && (oVarN3 = this.f73382mq.n(str, "network_id")) != null) {
                        this.f73378dq.put(strConcat, Long.valueOf(oVarN3.dn()));
                    }
                }
                Map<String, Pair<Integer, Integer>> mapQ3 = this.f73394on.q();
                if (mapQ3 != null && (pair = mapQ3.get(str4)) != null && ((Integer) pair.second).intValue() > 0) {
                    String strConcat2 = "time_stamp_".concat(str4);
                    if (!this.f73380m0.containsKey(strConcat2) && (oVarN2 = this.f73382mq.n(str4, com.thinkup.core.common.d0.d.C0836d.f67666d0)) != null) {
                        this.f73380m0.put(strConcat2, Long.valueOf(oVarN2.dn()));
                    }
                }
            }
            if (j12 > 0) {
                String strConcat3 = "time_stamp_".concat(String.valueOf(str2));
                if (this.f73381md.containsKey(strConcat3) || (oVarN = this.f73382mq.n(str2, com.thinkup.core.common.d0.d.C0836d.f67668dm)) == null) {
                    return;
                }
                this.f73381md.put(strConcat3, Long.valueOf(oVarN.dn()));
            }
        } catch (Throwable unused) {
        }
    }

    private long d(String str, String str2, ConcurrentHashMap<String, Long> concurrentHashMap) {
        String str3 = "day_" + n() + "_" + str;
        Long lValueOf = concurrentHashMap.get(str3);
        if (lValueOf == null) {
            long jD = this.f73382mq.d(str, str2);
            lValueOf = Long.valueOf(jD);
            if (jD > 0) {
                concurrentHashMap.put(str3, lValueOf);
            }
        }
        return lValueOf.longValue();
    }

    public final void d(int i10, String str, String str2, String str3) {
        try {
            String strMo = nd.m().mo();
            long jCurrentTimeMillis = System.currentTimeMillis();
            m();
            int i11 = Integer.parseInt(this.f73386nm);
            int i12 = this.f73384n0;
            int i13 = this.f73385nd;
            this.f73382mq.d(new com.thinkup.core.common.dm.o("2", strMo, String.valueOf(i10), str, i10 + "_" + str, str2, str3, i11, i12, i13, jCurrentTimeMillis));
            d(1, this.f73376dm, "day_".concat(String.valueOf(i12)), jCurrentTimeMillis);
            d(1, this.f73377dn, "day_" + i12 + "_" + str, jCurrentTimeMillis);
            d(1, this.f73378dq, "day_" + i12 + "_" + i10, jCurrentTimeMillis);
            d(1, this.f73380m0, "day_" + i12 + "_" + i10 + "_" + str, jCurrentTimeMillis);
            ConcurrentHashMap<String, Long> concurrentHashMap = this.f237do;
            StringBuilder sb2 = new StringBuilder("day_");
            sb2.append(i12);
            sb2.append("_");
            sb2.append(str2);
            m(1, concurrentHashMap, sb2.toString(), jCurrentTimeMillis);
            m(1, this.f73381md, "day_" + i12 + "_" + str3, jCurrentTimeMillis);
            d(1, this.f73376dm, "hour_".concat(String.valueOf(i13)), jCurrentTimeMillis);
            d(1, this.f73377dn, "hour_" + i13 + "_" + str, jCurrentTimeMillis);
            d(1, this.f73378dq, "hour_" + i13 + "_" + i10, jCurrentTimeMillis);
            d(1, this.f73380m0, "hour_" + i13 + "_" + i10 + "_" + str, jCurrentTimeMillis);
            ConcurrentHashMap<String, Long> concurrentHashMap2 = this.f237do;
            StringBuilder sb3 = new StringBuilder("hour_");
            sb3.append(i13);
            sb3.append("_");
            sb3.append(str2);
            m(1, concurrentHashMap2, sb3.toString(), jCurrentTimeMillis);
            m(1, this.f73381md, "hour_" + i13 + "_" + str3, jCurrentTimeMillis);
            d(2, this.f73376dm, "time_stamp", jCurrentTimeMillis);
            d(2, this.f73377dn, "time_stamp_".concat(String.valueOf(str)), jCurrentTimeMillis);
            d(2, this.f73378dq, "time_stamp_".concat(String.valueOf(i10)), jCurrentTimeMillis);
            d(2, this.f73380m0, "time_stamp_" + i10 + "_" + str, jCurrentTimeMillis);
            m(2, this.f237do, "time_stamp_".concat(String.valueOf(str2)), jCurrentTimeMillis);
            m(2, this.f73381md, "time_stamp_".concat(String.valueOf(str3)), jCurrentTimeMillis);
        } catch (Throwable unused) {
        }
    }

    private static void d(int i10, ConcurrentHashMap<String, Long> concurrentHashMap, String str, long j10) {
        long jValueOf;
        if (concurrentHashMap != null) {
            if (i10 == 2) {
                concurrentHashMap.put(str, Long.valueOf(j10));
                return;
            }
            Long l10 = concurrentHashMap.get(str);
            if (l10 == null) {
                jValueOf = 1L;
            } else {
                jValueOf = Long.valueOf(l10.longValue() + 1);
            }
            concurrentHashMap.put(str, jValueOf);
        }
    }

    public final void d(m0q m0qVar) {
        if (m0qVar.nq0() == null || this.f73382mq == null) {
            return;
        }
        dn().o(m0qVar);
    }
}