package com.thinkup.core.q;

import android.content.Context;
import android.text.TextUtils;
import com.thinkup.core.api.AdError;
import com.thinkup.core.common.dm.dqq;
import com.thinkup.core.common.nn.q0;
import com.thinkup.core.common.no;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes7.dex */
public class o {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final String f74114d = "o";

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static volatile o f74115n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private static volatile m f74116o;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private Context f74122q;

    /* JADX INFO: renamed from: dd, reason: collision with root package name */
    private Object f74118dd = new Object();

    /* JADX INFO: renamed from: d0, reason: collision with root package name */
    private boolean f74117d0 = false;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    List<d> f74121m = Collections.synchronizedList(new ArrayList(3));

    /* JADX INFO: renamed from: dm, reason: collision with root package name */
    private String f74119dm = com.thinkup.core.common.o.nm.d.f73117dq;

    /* JADX INFO: renamed from: dn, reason: collision with root package name */
    private final n0 f74120dn = new n0();

    /* JADX INFO: renamed from: do, reason: not valid java name */
    private final n f255do = new n();

    public interface d {
        void d();

        void m();
    }

    private o(Context context) {
        this.f74122q = context;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d(Context context, int i10, Object obj, String str) {
        if (obj instanceof JSONObject) {
            m mVarD = d(i10, context, str, (JSONObject) obj);
            if (mVarD != null) {
                f74116o = mVarD;
                String strNq = mVarD.nq();
                if (!TextUtils.isEmpty(strNq) && TextUtils.isEmpty(com.thinkup.core.common.o.nd.m().oq())) {
                    com.thinkup.core.common.o.nd.m().m303do(strNq);
                }
                com.thinkup.core.common.nm.d.d.d();
                com.thinkup.core.common.nm.d.d.d(true);
                com.thinkup.core.common.mq.d(context).d(f74116o);
                d(context, f74116o);
                com.thinkup.core.common.nn.m.n.d().q(new com.thinkup.core.common.nn.m.o(com.thinkup.core.common.nn.m.q.ddn, new Runnable() { // from class: com.thinkup.core.q.o.4
                    @Override // java.lang.Runnable
                    public final void run() {
                        com.thinkup.core.common.n.m.d().d(o.f74116o.dqn());
                        com.thinkup.core.common.mm.q.d().d(o.f74116o);
                    }
                }));
                com.thinkup.core.common.o.nd.m();
                com.thinkup.core.common.o.nd.n(mVarD);
                no.d().d(f74116o.dd());
                com.thinkup.core.common.n.d().m(f74116o.dn());
                com.thinkup.core.common.d.dd.d().n();
                com.thinkup.core.common.o.nd.m();
                com.thinkup.core.d.m.d(context.getApplicationContext()).d(mVarD.m0d());
                com.thinkup.core.common.o.nd.m().qn();
                com.thinkup.core.common.o.nd.m().d(mVarD);
                com.thinkup.core.common.nn.q.d().d(mVarD.d0());
                com.thinkup.core.common.o.n0 n0VarN = com.thinkup.core.common.o.nd.m().n();
                if (n0VarN != null) {
                    n0VarN.uploadAegisData(mVarD);
                }
                com.thinkup.core.bridge.d.m.d().d(context.getApplicationContext());
                com.thinkup.core.common.m0.d(context.getApplicationContext()).d(mVarD.mo0());
            }
            q();
        }
    }

    private boolean d0() {
        return this.f74117d0;
    }

    private static void dd() {
    }

    private m n(Context context) {
        n0 n0Var;
        m mVar = new m();
        mVar.f73866m = true;
        mVar.dm0();
        mVar.n("0");
        mVar.d(0L);
        mVar.dn0();
        mVar.dnn();
        mVar.dnq();
        mVar.o("");
        mVar.dom();
        mVar.doo();
        mVar.q("");
        mVar.ddq();
        mVar.d0q();
        mVar.qn();
        mVar.qq();
        mVar.m("[\"com.thinkup\"]");
        mVar.oq();
        mVar.mn();
        mVar.m();
        mVar.m0();
        if (context != null && (n0Var = this.f74120dn) != null) {
            m mVarM = n0Var.m(com.thinkup.core.common.o.nd.m().mo());
            if (mVarM != null) {
                mVar.d(mVarM.dd());
                mVar.n(mVarM.mqo());
                mVar.o(mVarM.mqq());
                mVar.d(mVarM.n00());
                mVar.d(mVarM.n0d());
            } else {
                mVar.n(1);
                mVar.o(2);
                mVar.d(com.thinkup.core.common.m.m.n());
            }
        }
        mVar.mnn();
        mVar.mnq();
        return mVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void q() {
        synchronized (this.f74118dd) {
            try {
                Iterator<d> it = this.f74121m.iterator();
                while (it.hasNext()) {
                    it.next();
                }
                this.f74121m.clear();
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final m m(String str) {
        n0 n0Var;
        if (f74116o == null) {
            synchronized (this) {
                try {
                    if (f74116o == null) {
                        try {
                            if (this.f74122q == null) {
                                this.f74122q = com.thinkup.core.common.o.nd.m().dd();
                            }
                            f74116o = d(this.f74122q, str);
                        } catch (Throwable unused) {
                        }
                        if (f74116o == null) {
                            Context context = this.f74122q;
                            m mVar = new m();
                            mVar.f73866m = true;
                            mVar.dm0();
                            mVar.n("0");
                            mVar.d(0L);
                            mVar.dn0();
                            mVar.dnn();
                            mVar.dnq();
                            mVar.o("");
                            mVar.dom();
                            mVar.doo();
                            mVar.q("");
                            mVar.ddq();
                            mVar.d0q();
                            mVar.qn();
                            mVar.qq();
                            mVar.m("[\"com.thinkup\"]");
                            mVar.oq();
                            mVar.mn();
                            mVar.m();
                            mVar.m0();
                            if (context != null && (n0Var = this.f74120dn) != null) {
                                m mVarM = n0Var.m(com.thinkup.core.common.o.nd.m().mo());
                                if (mVarM != null) {
                                    mVar.d(mVarM.dd());
                                    mVar.n(mVarM.mqo());
                                    mVar.o(mVarM.mqq());
                                    mVar.d(mVarM.n00());
                                    mVar.d(mVarM.n0d());
                                } else {
                                    mVar.n(1);
                                    mVar.o(2);
                                    mVar.d(com.thinkup.core.common.m.m.n());
                                }
                            }
                            mVar.mnn();
                            mVar.mnq();
                            f74116o = mVar;
                        }
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        return f74116o;
    }

    public final void o(String str) {
        n0 n0Var = this.f74120dn;
        if (n0Var != null) {
            n0Var.d(str);
        }
    }

    private Context o() {
        return this.f74122q;
    }

    public final void n(String str) {
        com.thinkup.core.common.o.nd ndVarM = com.thinkup.core.common.o.nd.m();
        final String strMo = ndVarM.mo();
        String strMq = ndVarM.mq();
        final Context context = this.f74122q;
        if (context == null || TextUtils.isEmpty(strMo) || TextUtils.isEmpty(strMq)) {
            return;
        }
        m mVarM = m(strMo);
        Map<String, String> map = new HashMap<>();
        if (!mVarM.f73866m) {
            map = mVarM.n0q();
        }
        com.thinkup.core.common.dm.nm nmVar = new com.thinkup.core.common.dm.nm(strMo, strMq);
        nmVar.d(map);
        if (!TextUtils.isEmpty(str)) {
            nmVar.m(str);
        }
        nmVar.n(com.thinkup.core.common.o.dn.q0.f72937mn);
        n.m(context, nmVar, new com.thinkup.core.common.m0.nd() { // from class: com.thinkup.core.q.o.3
            @Override // com.thinkup.core.common.m0.nd
            public final void onLoadCanceled(int i10) {
                o.this.q();
            }

            @Override // com.thinkup.core.common.m0.nd
            public final void onLoadError(int i10, String str2, AdError adError) {
                o.this.q();
            }

            @Override // com.thinkup.core.common.m0.nd
            public final void onLoadFinish(int i10, Object obj) {
                o.this.d(context, i10, obj, strMo);
            }

            @Override // com.thinkup.core.common.m0.nd
            public final void onLoadStart(int i10) {
            }
        });
    }

    private void m(Context context) {
        this.f74122q = context;
    }

    private void m(d dVar) {
        synchronized (this.f74118dd) {
            if (dVar != null) {
                try {
                    this.f74121m.remove(dVar);
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
    }

    public static /* synthetic */ boolean m(o oVar) {
        oVar.f74117d0 = false;
        return false;
    }

    public static long m() {
        if (f74116o == null || f74116o.d0o() == 0) {
            return 204800L;
        }
        return f74116o.d0o();
    }

    public static o d(Context context) {
        if (f74115n == null) {
            synchronized (o.class) {
                try {
                    if (f74115n == null) {
                        f74115n = new o(context);
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        return f74115n;
    }

    public static m d() {
        return d(com.thinkup.core.common.o.nd.m().dd()).m(com.thinkup.core.common.o.nd.m().mo());
    }

    private void d(d dVar) {
        synchronized (this.f74118dd) {
            try {
                if (this.f74118dd != null) {
                    this.f74121m.add(dVar);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final String d(String str) {
        m mVarM = m(str);
        if (mVarM == null) {
            return "1";
        }
        boolean zD0d = mVarM.d0d();
        boolean zMqn = mVarM.mqn();
        boolean zNd0 = mVarM.nd0();
        Map<String, Object> map = mVarM.f73873n;
        Map<String, Object> mapMd = com.thinkup.core.common.o.nd.m().md();
        boolean zEquals = true;
        if (map != null) {
            zEquals = true ^ map.equals(mapMd);
        } else if (mapMd == null) {
            zEquals = false;
        }
        if (zD0d) {
            return "1";
        }
        if (zMqn) {
            return "2";
        }
        if (zEquals) {
            return "3";
        }
        if (zNd0) {
            return com.thinkup.core.common.o.dn.q0.f72936mm;
        }
        return "";
    }

    private m d(Context context, String str) {
        dqq dqqVar;
        List<dqq> listD = com.thinkup.core.common.d0.q.d(com.thinkup.core.common.d0.o.d(context)).d(str, this.f74119dm);
        if (listD != null && listD.size() > 0 && (dqqVar = listD.get(0)) != null) {
            try {
                m mVarD = m.d(new JSONObject(dqqVar.o()));
                if (mVarD != null) {
                    mVarD.d(Long.parseLong(dqqVar.d()));
                    if (mVarD.ndd() == 1 && !mVarD.mqn()) {
                        mVarD.q(1);
                    }
                }
                return mVarD;
            } catch (Throwable unused) {
            }
        }
        return null;
    }

    private m d(int i10, final Context context, final String str, final JSONObject jSONObject) {
        try {
            m mVarM = d(context).m(str);
            if (!mVarM.d0d()) {
                mVarM.d(jSONObject, (String) null);
            }
        } catch (Throwable unused) {
        }
        if (jSONObject != null) {
            try {
                jSONObject.put("strategy_domain_type_key", i10 != 1 ? 0 : 1);
            } catch (Throwable unused2) {
            }
        }
        final m mVarD = m.d(jSONObject);
        mVarD.d(System.currentTimeMillis());
        com.thinkup.core.common.nn.m.n.d().q(new com.thinkup.core.common.nn.m.o(com.thinkup.core.common.nn.m.q.ddo, new Runnable() { // from class: com.thinkup.core.q.o.1
            @Override // java.lang.Runnable
            public final void run() {
                com.thinkup.core.common.d0.q.d(com.thinkup.core.common.d0.o.d(context)).d(str, jSONObject.toString(), o.this.f74119dm);
                q0.d(context, com.thinkup.core.common.o.nm.m.f73146d, com.thinkup.core.common.o.nm.d.f73133o0, mVarD.dmo());
                q0.d(context, com.thinkup.core.common.o.nm.m.f73146d, com.thinkup.core.common.o.nm.d.f73134od, mVarD.dmq());
            }
        }));
        return mVarD;
    }

    public final synchronized void d(final String str, String str2, String str3) {
        try {
            if (this.f74117d0) {
                return;
            }
            this.f74117d0 = true;
            com.thinkup.core.common.dm.nm nmVar = new com.thinkup.core.common.dm.nm(str, str2);
            nmVar.q();
            if (f74116o != null) {
                f74116o.q(0);
                nmVar.d(f74116o.n0q());
            }
            if (!TextUtils.isEmpty(str3)) {
                nmVar.n(str3);
            }
            this.f255do.d(this.f74122q, nmVar, new com.thinkup.core.common.m0.nd() { // from class: com.thinkup.core.q.o.2
                @Override // com.thinkup.core.common.m0.nd
                public final void onLoadCanceled(int i10) {
                    o.m(o.this);
                    o.this.q();
                }

                @Override // com.thinkup.core.common.m0.nd
                public final void onLoadError(int i10, String str4, AdError adError) {
                    o.m(o.this);
                    o.this.q();
                }

                @Override // com.thinkup.core.common.m0.nd
                public final void onLoadFinish(int i10, Object obj) {
                    o.m(o.this);
                    o oVar = o.this;
                    oVar.d(oVar.f74122q, i10, obj, str);
                }

                @Override // com.thinkup.core.common.m0.nd
                public final void onLoadStart(int i10) {
                }
            });
        } catch (Throwable th2) {
            throw th2;
        }
    }

    private static void d(Context context, m mVar) {
        if (mVar == null) {
            return;
        }
        String strN0 = mVar.n0();
        if (TextUtils.isEmpty(strN0)) {
            return;
        }
        com.thinkup.core.common.res.m.d(context).d(new com.thinkup.core.common.res.q(3, strN0), (com.thinkup.core.common.res.m.d) null);
    }

    private void d(JSONObject jSONObject) {
        JSONObject jSONObjectMoq;
        try {
            m mVarM = m(com.thinkup.core.common.o.nd.m().mo());
            if (mVarM == null || (jSONObjectMoq = mVarM.moq()) == null) {
                return;
            }
            jSONObject.put("a_c", jSONObjectMoq);
        } catch (Exception unused) {
        }
    }

    public final void d(Context context, Object obj, String str) {
        d(context, 0, obj, str);
    }
}