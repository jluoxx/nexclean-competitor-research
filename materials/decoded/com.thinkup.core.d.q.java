package com.thinkup.core.d;

import android.text.TextUtils;
import android.util.Pair;
import com.thinkup.core.api.ErrorCode;
import com.thinkup.core.common.dm.Cdo;
import com.thinkup.core.common.dm.dn;
import com.thinkup.core.common.dm.m0q;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArraySet;

/* JADX INFO: loaded from: classes7.dex */
public final class q {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final String f73408d = "AdSourceFltRuleHandler";

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final com.thinkup.core.common.d0.d f73409m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final Map<String, Long> f73410n = new ConcurrentHashMap();

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private final Map<String, Pair<Integer, Long>> f73412q = new ConcurrentHashMap();

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private final Set<String> f73411o = new CopyOnWriteArraySet();

    public q(com.thinkup.core.common.d0.d dVar) {
        this.f73409m = dVar;
    }

    private static com.thinkup.core.common.dm.o d(Cdo cdo, com.thinkup.core.common.dm.o oVar, com.thinkup.core.common.dm.o oVar2) {
        long jD0;
        oVar2.q();
        int i10 = 1;
        int iMd = oVar2.md() + 1;
        long jDn = oVar2.dn();
        long jCurrentTimeMillis = System.currentTimeMillis();
        int iD = cdo.d();
        long j10 = 0;
        if (iD == 1) {
            if (iMd >= cdo.m()) {
                jD0 = cdo.d0();
                j10 = jCurrentTimeMillis + jD0;
            }
            i10 = iMd;
        } else if (iD != 2) {
            if (iD != 3) {
                i10 = iMd;
            } else if (jCurrentTimeMillis >= jDn + cdo.o()) {
                oVar2.d(jCurrentTimeMillis);
            } else {
                int i11 = oVar != null ? oVar.f68577d : 0;
                if (i11 > 0 && i11 >= cdo.dd() && (iMd * 100) / i11 >= cdo.q()) {
                    jD0 = cdo.d0();
                    j10 = jCurrentTimeMillis + jD0;
                }
                i10 = iMd;
            }
        } else if (jCurrentTimeMillis >= jDn + cdo.o()) {
            oVar2.d(jCurrentTimeMillis);
        } else {
            if (iMd >= cdo.n()) {
                jD0 = cdo.d0();
                j10 = jCurrentTimeMillis + jD0;
            }
            i10 = iMd;
        }
        oVar2.m(j10);
        oVar2.m(i10);
        return oVar2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x003d, code lost:
    
        if (r1.mm() > java.lang.System.currentTimeMillis()) goto L16;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final dn m(m0q m0qVar) {
        try {
            String strQn = m0qVar.qn();
            int iD = m0qVar.nq0().d();
            if (TextUtils.isEmpty(strQn)) {
                return null;
            }
            Long l10 = this.f73410n.get(strQn);
            if (l10 == null) {
                com.thinkup.core.common.dm.o oVarD = d("4", strQn, iD);
                if (oVarD != null) {
                }
                return null;
            }
            if (l10.longValue() > System.currentTimeMillis()) {
                if (iD == 1) {
                    return new dn(32, ErrorCode.getErrorCode("2036", "", ""));
                }
                if (iD == 2) {
                    return new dn(33, ErrorCode.getErrorCode(ErrorCode.noFillSError, "", ""));
                }
                if (iD != 3) {
                    return null;
                }
                return new dn(34, ErrorCode.getErrorCode(ErrorCode.noFillSrError, "", ""));
            }
            return null;
        } catch (Throwable unused) {
        }
    }

    public final void n(m0q m0qVar) {
        try {
            Cdo cdoNq0 = m0qVar.nq0();
            if (cdoNq0 == null) {
                return;
            }
            int iD = cdoNq0.d();
            String strQn = m0qVar.qn();
            if (iD == 1 && !TextUtils.isEmpty(strQn)) {
                List<Pair<String, String>> listM = m("4", strQn, iD);
                if (this.f73411o.contains(strQn)) {
                    return;
                }
                this.f73411o.add(strQn);
                this.f73410n.remove(strQn);
                this.f73409m.d(listM);
            }
        } catch (Throwable unused) {
        }
    }

    public final void o(m0q m0qVar) {
        com.thinkup.core.common.dm.o oVarD;
        long jD0;
        long j10;
        try {
            Cdo cdoNq0 = m0qVar.nq0();
            long jCurrentTimeMillis = System.currentTimeMillis();
            int iD = cdoNq0.d();
            String strQn = m0qVar.qn();
            if (TextUtils.isEmpty(strQn)) {
                return;
            }
            com.thinkup.core.common.dm.o oVar = new com.thinkup.core.common.dm.o("4");
            com.thinkup.core.common.dm.o oVar2 = null;
            if (iD == 3) {
                boolean zContainsKey = this.f73412q.containsKey(strQn);
                Pair<Integer, Long> pair = this.f73412q.get(strQn);
                if (!zContainsKey || pair == null) {
                    ArrayList arrayList = new ArrayList();
                    arrayList.add(new Pair(d(com.thinkup.core.common.d0.d.C0836d.f67668dm, "="), strQn));
                    arrayList.add(new Pair(d(com.thinkup.core.common.d0.d.C0836d.f67675mn, "="), String.valueOf(iD)));
                    oVarD = null;
                    for (com.thinkup.core.common.dm.o oVar3 : this.f73409m.d(arrayList, 2)) {
                        if ("4".equals(oVar3.d())) {
                            oVarD = oVar3;
                        } else if ("3".equals(oVar3.d())) {
                            oVar2 = oVar3;
                        }
                    }
                } else {
                    int iIntValue = ((Integer) pair.first).intValue();
                    long jLongValue = ((Long) pair.second).longValue();
                    oVar2 = new com.thinkup.core.common.dm.o("3");
                    oVar2.f68577d = iIntValue;
                    oVar2.d(jLongValue);
                    oVar2.d(3);
                    oVarD = d("4", strQn, iD);
                }
            } else {
                oVarD = d("4", strQn, iD);
            }
            boolean z10 = oVarD != null;
            if (z10) {
                oVarD.q();
                int iMd = oVarD.md() + 1;
                long jDn = oVarD.dn();
                long jCurrentTimeMillis2 = System.currentTimeMillis();
                int iD2 = cdoNq0.d();
                if (iD2 != 1) {
                    if (iD2 != 2) {
                        if (iD2 == 3) {
                            if (jCurrentTimeMillis2 >= jDn + cdoNq0.o()) {
                                oVarD.d(jCurrentTimeMillis2);
                                iMd = 1;
                            } else {
                                int i10 = oVar2 != null ? oVar2.f68577d : 0;
                                if (i10 > 0 && i10 >= cdoNq0.dd() && (iMd * 100) / i10 >= cdoNq0.q()) {
                                    jD0 = cdoNq0.d0();
                                    j10 = jCurrentTimeMillis2 + jD0;
                                }
                            }
                        }
                        j10 = 0;
                    } else {
                        if (jCurrentTimeMillis2 >= jDn + cdoNq0.o()) {
                            oVarD.d(jCurrentTimeMillis2);
                            iMd = 1;
                        } else if (iMd >= cdoNq0.n()) {
                            jD0 = cdoNq0.d0();
                            j10 = jCurrentTimeMillis2 + jD0;
                        }
                        j10 = 0;
                    }
                } else if (iMd >= cdoNq0.m()) {
                    jD0 = cdoNq0.d0();
                    j10 = jCurrentTimeMillis2 + jD0;
                } else {
                    j10 = 0;
                }
                oVarD.m(j10);
                oVarD.m(iMd);
                oVar = oVarD;
            } else {
                oVar.d(strQn);
                oVar.d(iD);
                oVar.d(jCurrentTimeMillis);
                oVar.m(1);
                oVar.m(0L);
            }
            if (iD == 1) {
                this.f73411o.remove(strQn);
            }
            if (iD == 3 && oVar2 != null) {
                oVar.d(oVar2.dn());
            }
            this.f73410n.put(strQn, Long.valueOf(oVar.mm()));
            this.f73409m.d(oVar, z10);
        } catch (Throwable unused) {
        }
    }

    private static List<Pair<String, String>> m(String str, String str2, int i10) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new Pair(d("event_type", "="), str));
        arrayList.add(new Pair(d(com.thinkup.core.common.d0.d.C0836d.f67668dm, "="), str2));
        arrayList.add(new Pair(d(com.thinkup.core.common.d0.d.C0836d.f67675mn, "="), String.valueOf(i10)));
        return arrayList;
    }

    public final void d(m0q m0qVar) {
        try {
            Cdo cdoNq0 = m0qVar.nq0();
            int iD = cdoNq0.d();
            if (iD != 3) {
                return;
            }
            String strQn = m0qVar.qn();
            if (TextUtils.isEmpty(strQn)) {
                return;
            }
            com.thinkup.core.common.dm.o oVarD = d("3", strQn, iD);
            int i10 = 1;
            boolean z10 = oVarD != null;
            long jCurrentTimeMillis = System.currentTimeMillis();
            if (z10) {
                long jDn = oVarD.dn();
                if (jCurrentTimeMillis < cdoNq0.o() + jDn) {
                    i10 = 1 + oVarD.f68577d;
                    jCurrentTimeMillis = jDn;
                }
            } else {
                oVarD = new com.thinkup.core.common.dm.o("3");
                oVarD.d(strQn);
                oVarD.d(iD);
            }
            oVarD.d(jCurrentTimeMillis);
            oVarD.f68577d = i10;
            this.f73412q.put(strQn, new Pair<>(Integer.valueOf(i10), Long.valueOf(jCurrentTimeMillis)));
            this.f73409m.d(oVarD, z10);
        } catch (Throwable unused) {
        }
    }

    private static dn d(int i10) {
        if (i10 == 1) {
            return new dn(32, ErrorCode.getErrorCode("2036", "", ""));
        }
        if (i10 == 2) {
            return new dn(33, ErrorCode.getErrorCode(ErrorCode.noFillSError, "", ""));
        }
        if (i10 != 3) {
            return null;
        }
        return new dn(34, ErrorCode.getErrorCode(ErrorCode.noFillSrError, "", ""));
    }

    private static String d(String str) {
        return d(str, "=");
    }

    private static String d(String str, String str2) {
        return String.format("%s %s ?", str, str2);
    }

    private com.thinkup.core.common.dm.o d(String str, String str2, int i10) {
        List<com.thinkup.core.common.dm.o> listD = this.f73409m.d(m(str, str2, i10), 1);
        if (listD.isEmpty()) {
            return null;
        }
        return listD.get(0);
    }

    private List<com.thinkup.core.common.dm.o> d(String str, int i10) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new Pair(d(com.thinkup.core.common.d0.d.C0836d.f67668dm, "="), str));
        arrayList.add(new Pair(d(com.thinkup.core.common.d0.d.C0836d.f67675mn, "="), String.valueOf(i10)));
        return this.f73409m.d(arrayList, 2);
    }
}