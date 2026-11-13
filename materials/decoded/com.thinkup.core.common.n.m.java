package com.thinkup.core.common.n;

import android.content.Context;
import android.text.TextUtils;
import com.thinkup.core.api.TUSDKGlobalSetting;
import com.thinkup.core.common.nn.mo;
import com.thinkup.core.common.nn.q0;
import com.thinkup.core.common.o.nd;
import com.thinkup.core.common.o.nm;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentLinkedQueue;
import org.json.JSONArray;

/* JADX INFO: loaded from: classes7.dex */
public class m {

    /* JADX INFO: renamed from: d0, reason: collision with root package name */
    private static m f71531d0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    Runnable f71532d;

    /* JADX INFO: renamed from: dd, reason: collision with root package name */
    private long f71533dd;

    /* JADX INFO: renamed from: dq, reason: collision with root package name */
    private String f71536dq;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    JSONArray[] f71537m;

    /* JADX INFO: renamed from: m0, reason: collision with root package name */
    private String f71538m0;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final String f71540n = getClass().getSimpleName();

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private final String f71541o = com.thinkup.core.common.m0.d0.doq;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private final String f71542q = com.thinkup.core.common.m0.d0.ndm;

    /* JADX INFO: renamed from: do, reason: not valid java name */
    private final Object f199do = new Object();

    /* JADX INFO: renamed from: md, reason: collision with root package name */
    private final Object f71539md = new Object();

    /* JADX INFO: renamed from: dm, reason: collision with root package name */
    private ConcurrentLinkedQueue<q> f71534dm = new ConcurrentLinkedQueue<>();

    /* JADX INFO: renamed from: dn, reason: collision with root package name */
    private ConcurrentHashMap<String, String> f71535dn = new ConcurrentHashMap<>();

    public m() {
        com.thinkup.core.q.m mVarM;
        this.f71533dd = 0L;
        this.f71533dd = Math.max(0L, TUSDKGlobalSetting.mInspectInterval);
        if (!TextUtils.isEmpty(nd.m().mo()) && (mVarM = com.thinkup.core.q.o.d(nd.m().dd()).m(nd.m().mo())) != null && !mVarM.d0d()) {
            this.f71533dd = mVarM.dqn();
        }
        d(new Runnable() { // from class: com.thinkup.core.common.n.m.1
            @Override // java.lang.Runnable
            public final void run() {
                synchronized (m.this.f71539md) {
                    m mVar = m.this;
                    if (mVar.f71537m == null) {
                        mVar.f71536dq = q0.n(nd.m().dd(), nm.m.f73146d, com.thinkup.core.common.m0.d0.doq, "");
                        m.this.f71538m0 = q0.n(nd.m().dd(), nm.m.f73146d, com.thinkup.core.common.m0.d0.ndm, "");
                        if (!TextUtils.isEmpty(m.this.f71536dq) && !TextUtils.isEmpty(m.this.f71538m0)) {
                            JSONArray[] jSONArrayArr = new JSONArray[2];
                            m.this.f71537m = jSONArrayArr;
                            try {
                                jSONArrayArr[0] = new JSONArray(m.this.f71536dq);
                                m.this.f71537m[1] = new JSONArray(m.this.f71538m0);
                            } catch (Throwable unused) {
                            }
                        }
                    }
                }
            }
        });
    }

    private static void d(final Runnable runnable, long j10) {
        if (j10 > 0) {
            com.thinkup.core.common.nn.m.n.d().m(new com.thinkup.core.common.nn.m.o(com.thinkup.core.common.nn.m.q.d00, new Runnable() { // from class: com.thinkup.core.common.n.a
                @Override // java.lang.Runnable
                public final void run() {
                    m.m(runnable);
                }
            }), j10);
        } else {
            com.thinkup.core.common.nn.m.n.d().q(new com.thinkup.core.common.nn.m.o(com.thinkup.core.common.nn.m.q.d0m, runnable));
        }
    }

    private void d0() {
        synchronized (this.f199do) {
            try {
                if (this.f71532d != null) {
                    this.f71532d = null;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    private static int dd() {
        return q0.m(nd.m().dd(), nm.m.f73146d, nm.d.f73141qd, 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void m(Runnable runnable) {
        com.thinkup.core.common.nn.m.n.d().q(new com.thinkup.core.common.nn.m.o(com.thinkup.core.common.nn.m.q.d0d, runnable));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void q() {
        synchronized (this.f199do) {
            try {
                if (this.f71533dd >= 0 && this.f71534dm.size() > 0 && this.f71532d == null) {
                    q qVarPoll = this.f71534dm.poll();
                    if (qVarPoll != null) {
                        Runnable runnableD = d(qVarPoll);
                        this.f71532d = runnableD;
                        d(runnableD);
                    } else {
                        q();
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final Map<String, String> n() {
        ConcurrentHashMap<String, String> concurrentHashMap;
        synchronized (this.f71539md) {
            concurrentHashMap = this.f71535dn;
        }
        return concurrentHashMap;
    }

    private static void o() {
    }

    public final JSONArray[] m() {
        JSONArray[] jSONArrayArr;
        synchronized (this.f71539md) {
            jSONArrayArr = this.f71537m;
        }
        return jSONArrayArr;
    }

    public static /* synthetic */ void d0(m mVar) {
        synchronized (mVar.f199do) {
            try {
                if (mVar.f71532d != null) {
                    mVar.f71532d = null;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public static m d() {
        if (f71531d0 == null) {
            synchronized (m.class) {
                try {
                    if (f71531d0 == null) {
                        f71531d0 = new m();
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        return f71531d0;
    }

    public final void d(long j10) {
        this.f71533dd = j10;
        nd.m().n(com.thinkup.core.common.m0.d0.noq);
    }

    private void d(final Context context, final String str, final d0.d dVar) {
        d(new Runnable() { // from class: com.thinkup.core.common.n.m.2
            @Override // java.lang.Runnable
            public final void run() {
                ArrayList arrayList = new ArrayList();
                arrayList.add(new d0(context, str, dVar));
                m.d(m.this, arrayList);
            }
        });
    }

    private void d(List<q> list) {
        synchronized (this.f199do) {
            if (list != null) {
                try {
                    if (list.size() > 0) {
                        this.f71534dm.addAll(list);
                        q();
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
    }

    private Runnable d(final q qVar) {
        return new Runnable() { // from class: com.thinkup.core.common.n.m.3
            @Override // java.lang.Runnable
            public final void run() {
                n nVarM;
                synchronized (m.this.f199do) {
                    try {
                        try {
                            q qVar2 = qVar;
                            if (qVar2 != null && ((nVarM = qVar2.m()) == null || nVarM.d())) {
                                if (m.this.f71533dd > 0) {
                                    try {
                                        Thread.sleep(m.this.f71533dd);
                                    } catch (Throwable unused) {
                                    }
                                }
                            }
                            m.d0(m.this);
                            m.this.q();
                        } catch (Throwable th2) {
                            StackTraceElement[] stackTrace = th2.getStackTrace();
                            StringBuilder sb2 = new StringBuilder("queue size=");
                            sb2.append(m.this.f71534dm != null ? m.this.f71534dm.size() : -1);
                            sb2.append(" , ");
                            sb2.append(mo.d(stackTrace));
                            com.thinkup.core.common.nm.d0.m("inspect error", sb2.toString(), nd.m().n0());
                        }
                    } catch (Throwable th3) {
                        throw th3;
                    }
                }
            }
        };
    }

    public final void d(Map<String, String> map) {
        synchronized (this.f71539md) {
            if (map == null) {
                return;
            }
            try {
                if (map.isEmpty()) {
                    return;
                }
                this.f71535dn.clear();
                this.f71535dn.putAll(map);
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    private static void d(Runnable runnable) {
        com.thinkup.core.common.nn.m.n.d().q(new com.thinkup.core.common.nn.m.o(com.thinkup.core.common.nn.m.q.d0n, runnable));
    }

    public final void d(final JSONArray[] jSONArrayArr) {
        synchronized (this.f71539md) {
            this.f71537m = jSONArrayArr;
        }
        com.thinkup.core.common.nn.m.n.d().q(new com.thinkup.core.common.nn.m.o(com.thinkup.core.common.nn.m.q.d0o, new Runnable() { // from class: com.thinkup.core.common.n.m.4
            @Override // java.lang.Runnable
            public final void run() {
                JSONArray[] jSONArrayArr2 = jSONArrayArr;
                if (jSONArrayArr2 == null || jSONArrayArr2.length != 2) {
                    return;
                }
                try {
                    JSONArray jSONArray = jSONArrayArr2[0];
                    if (jSONArray != null) {
                        String string = jSONArray.toString();
                        if (!TextUtils.equals(string, m.this.f71536dq)) {
                            m.this.f71536dq = string;
                            q0.m(nd.m().dd(), nm.m.f73146d, com.thinkup.core.common.m0.d0.doq, m.this.f71536dq);
                        }
                    }
                    JSONArray jSONArray2 = jSONArrayArr[1];
                    if (jSONArray2 != null) {
                        String string2 = jSONArray2.toString();
                        if (TextUtils.equals(string2, m.this.f71538m0)) {
                            return;
                        }
                        m.this.f71538m0 = string2;
                        q0.m(nd.m().dd(), nm.m.f73146d, com.thinkup.core.common.m0.d0.ndm, m.this.f71538m0);
                    }
                } catch (Throwable unused) {
                }
            }
        }));
    }

    public static /* synthetic */ void d(m mVar, List list) {
        synchronized (mVar.f199do) {
            try {
                if (list.size() > 0) {
                    mVar.f71534dm.addAll(list);
                    mVar.q();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}