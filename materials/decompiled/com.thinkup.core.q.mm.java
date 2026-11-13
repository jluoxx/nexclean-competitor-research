package com.thinkup.core.q;

import android.content.Context;
import android.text.TextUtils;
import com.thinkup.core.api.AdError;
import com.thinkup.core.api.ErrorCode;
import com.thinkup.core.api.TUAdRequest;
import com.thinkup.core.common.dm.doq;
import java.util.Map;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes7.dex */
public class mm {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final String f74002d = "mm";

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private static volatile mm f74003m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private Context f74005n;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private final mo f74007q;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private final nd f74006o = new nd();

    /* JADX INFO: renamed from: d0, reason: collision with root package name */
    private final mn f74004d0 = new mn(this);

    public interface m {
        void d();

        void d(AdError adError);

        void d(m0 m0Var);

        void m();

        void m(m0 m0Var);
    }

    private mm(Context context) {
        this.f74005n = context;
        this.f74007q = new mo(context);
    }

    private m0 n(String str, int i10) {
        return this.f74007q.d(com.thinkup.core.common.o.nd.m().mo(), str, i10, true);
    }

    public final void d(final m0 m0Var, String str, String str2, final String str3, Map<String, Object> map, m mVar, int i10, boolean z10, TUAdRequest tUAdRequest, boolean z11, String str4) {
        long jDqo;
        com.thinkup.core.common.nn.m.o oVar;
        final doq doqVar;
        final d dVar;
        d dVar2 = new d(str3, mVar);
        String strDod = m0Var != null ? m0Var.dod() : "";
        Map<String, Object> mapO = com.thinkup.core.common.o.nd.m().o(str3);
        doq doqVar2 = new doq(str, str2, str3, strDod, mapO, map, com.thinkup.core.common.nm.d().n(str3), tUAdRequest);
        doqVar2.d(z11);
        doqVar2.d(i10);
        if (m0Var == null) {
            doqVar2.d("1");
            this.f74004d0.d(this.f74005n, doqVar2, new md(this, doqVar2, dVar2, null));
            return;
        }
        if (m0Var.nmm()) {
            m0Var.m(4);
            dVar2.d(m0Var);
            return;
        }
        final int i11 = 3;
        m0Var.m(3);
        doqVar2.d(m0Var.n0q());
        if (z10) {
            if (!TextUtils.isEmpty(str4)) {
                doqVar2.d(str4);
            }
            this.f74004d0.d(this.f74005n, doqVar2, new md(this, doqVar2, dVar2, m0Var));
            return;
        }
        boolean zNdn = m0Var.ndn();
        if (m0Var.mnn()) {
            dVar2.d(m0Var);
            doqVar2.d((Map<String, String>) null);
            doqVar2.d("1");
            this.f74004d0.d(this.f74005n, doqVar2, new md(this, doqVar2, dVar2, m0Var));
            return;
        }
        if (!zNdn && m0Var.mnq()) {
            dVar2.d(m0Var);
            dVar2.f74020m = null;
        }
        m0 m0VarD0 = d0(str3);
        if (m0VarD0 == null) {
            doqVar2.d((Map<String, String>) null);
            doqVar2.d("1");
            this.f74004d0.d(this.f74005n, doqVar2, new md(this, doqVar2, dVar2, m0Var));
            return;
        }
        doqVar2.d(m0VarD0.n0q());
        boolean zEquals = mapO.equals(m0VarD0.dno());
        boolean zNd0 = m0VarD0.nd0();
        boolean zM = com.thinkup.core.common.n0.d().m(this.f74005n, str3);
        if (zEquals && !m0VarD0.ndm() && !zM && !zNdn && !zNd0) {
            dVar2.d(m0Var);
            return;
        }
        if (zNdn) {
            doqVar2.d(com.thinkup.core.common.o.dn.q0.f72939o);
        } else if (!zEquals) {
            doqVar2.d("3");
        } else if (zM) {
            doqVar2.d(com.thinkup.core.common.o.dn.q0.f72931dn);
        } else if (m0VarD0.ndm()) {
            doqVar2.d("2");
        } else if (zNd0) {
            doqVar2.d(com.thinkup.core.common.o.dn.q0.f72936mm);
        }
        m0VarD0.q(0);
        final boolean[] zArr = new boolean[1];
        if (zNdn) {
            jDqo = m0VarD0.nqn();
        } else if (zEquals) {
            jDqo = m0VarD0.dqo();
            i11 = 1;
        } else {
            jDqo = m0VarD0.nnm();
            i11 = 2;
        }
        com.thinkup.core.common.nd.d dVarD = com.thinkup.core.common.nd.n.d();
        if (jDqo == 0) {
            zArr[0] = true;
            dVar2.d(m0Var);
            oVar = null;
            doqVar = doqVar2;
            dVar = dVar2;
        } else {
            doqVar = doqVar2;
            dVar = dVar2;
            oVar = new com.thinkup.core.common.nn.m.o(com.thinkup.core.common.nn.m.q.d0dn, new Runnable() { // from class: com.thinkup.core.q.mm.1
                @Override // java.lang.Runnable
                public final void run() {
                    zArr[0] = true;
                    m0Var.m(1);
                    dVar.d(m0Var);
                    com.thinkup.core.common.nm.d0.d("placement", "", "strategy timeout", "", str3, "", "", (TUAdRequest) null, doqVar.dq(), i11);
                }
            });
            dVarD.d(oVar, jDqo);
        }
        com.thinkup.core.o.m.d().m(str3);
        this.f74004d0.d(this.f74005n, doqVar, new md(this, doqVar, dVar, m0Var, dVarD, oVar, zArr));
    }

    public final m0 d0(String str) {
        return this.f74007q.d(com.thinkup.core.common.o.nd.m().mo(), str, 0);
    }

    public final m0 dd(String str) {
        String strMo = com.thinkup.core.common.o.nd.m().mo();
        m0 m0VarD = this.f74007q.d(com.thinkup.core.common.o.nd.m().mo(), str, 0);
        mo moVar = this.f74007q;
        if (m0VarD != null) {
            moVar.m(strMo, str, 1);
            return null;
        }
        m0 m0VarD2 = moVar.d(strMo, str, 1);
        if (m0VarD2 == null) {
            m0VarD2 = this.f74006o.m(str);
        }
        if (m0VarD2 != null) {
            d(str, m0VarD2, null, 1);
        }
        return m0VarD2;
    }

    public final void dm(String str) {
        this.f74007q.n(com.thinkup.core.common.o.nd.m().mo(), str);
    }

    public final boolean dn(String str) {
        return this.f74007q.m(com.thinkup.core.common.o.nd.m().mo(), str);
    }

    /* JADX INFO: renamed from: do, reason: not valid java name */
    public final void m320do(String str) {
        this.f74006o.d(str);
    }

    public final int dq(String str) {
        return this.f74007q.o(com.thinkup.core.common.o.nd.m().mo(), str);
    }

    public final void m(String str, int i10) {
        this.f74007q.d(str, i10);
    }

    public final m0 o(String str) {
        return this.f74007q.d(com.thinkup.core.common.o.nd.m().mo(), str);
    }

    public final m0 q(String str) {
        return this.f74007q.d(com.thinkup.core.common.o.nd.m().mo(), str, 2);
    }

    public static class d implements m {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final String f74019d;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        private m f74020m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private volatile boolean f74021n = false;

        public d(String str, m mVar) {
            this.f74019d = str;
            this.f74020m = mVar;
        }

        @Override // com.thinkup.core.q.mm.m
        public final void d(m0 m0Var) {
            if (this.f74020m == null || this.f74021n) {
                return;
            }
            mm.d(com.thinkup.core.common.o.nd.m().dd()).m(this.f74019d, m0Var.moq());
            this.f74021n = true;
            this.f74020m.d(m0Var);
        }

        @Override // com.thinkup.core.q.mm.m
        public final void m() {
            m mVar = this.f74020m;
            if (mVar != null) {
                mVar.m();
            }
        }

        @Override // com.thinkup.core.q.mm.m
        public final void m(m0 m0Var) {
            m mVar = this.f74020m;
            if (mVar != null) {
                mVar.m(m0Var);
            }
        }

        @Override // com.thinkup.core.q.mm.m
        public final void d() {
            m mVar = this.f74020m;
            if (mVar != null) {
                mVar.d();
            }
        }

        @Override // com.thinkup.core.q.mm.m
        public final void d(AdError adError) {
            if (this.f74020m == null || this.f74021n) {
                return;
            }
            this.f74021n = true;
            this.f74020m.d(adError);
        }
    }

    public final m0 m(String str) {
        return d(str, true);
    }

    public final m0 n(String str) {
        return d(str, false);
    }

    public static mm d(Context context) {
        if (f74003m == null) {
            synchronized (mm.class) {
                try {
                    if (f74003m == null) {
                        f74003m = new mm(context);
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        return f74003m;
    }

    public final void d(String str, m0 m0Var, JSONObject jSONObject, int i10) {
        this.f74007q.d(com.thinkup.core.common.o.nd.m().mo(), str, m0Var, jSONObject, i10);
    }

    public final m0 d(String str) {
        return d(str, true);
    }

    private m0 d(String str, boolean z10) {
        return this.f74007q.d(com.thinkup.core.common.o.nd.m().mo(), str, z10);
    }

    private void d(JSONObject jSONObject, JSONObject jSONObject2, String str) {
        m0 m0VarD;
        JSONObject jSONObjectMnm;
        if (jSONObject != null) {
            if (jSONObject2 == null && TextUtils.isEmpty(str)) {
                return;
            }
            try {
                if (jSONObject2 != null) {
                    jSONObject.put(m0.d.dmq, jSONObject2);
                } else {
                    if (TextUtils.isEmpty(str) || (m0VarD = d(str, true)) == null || (jSONObjectMnm = m0VarD.mnm()) == null) {
                        return;
                    }
                    jSONObject.put(m0.d.dmq, jSONObjectMnm);
                }
            } catch (Exception unused) {
            }
        }
    }

    public final void d(int i10, Object obj, final doq doqVar, m mVar, boolean[] zArr, m0 m0Var) {
        if (!(obj instanceof JSONObject) || doqVar == null) {
            if (mVar != null) {
                if (m0Var == null) {
                    mVar.d(ErrorCode.getErrorCode("3001", "", "Placement LoadParams error."));
                    return;
                } else {
                    mVar.d(m0Var);
                    return;
                }
            }
            return;
        }
        JSONObject jSONObject = (JSONObject) obj;
        try {
            jSONObject.put(m0.d.dnd, System.currentTimeMillis());
            jSONObject.put("strategy_domain_type_key", i10 == 1 ? 1 : 0);
            m0 m0VarD = d(doqVar.o(), jSONObject.optInt(m0.d.m0m, 0));
            if (m0VarD != null) {
                m0VarD.d(jSONObject, doqVar.o());
            }
        } catch (Throwable th2) {
            th2.getMessage();
        }
        final m0 m0VarD2 = m0.d(doqVar.o(), jSONObject);
        final String strO = doqVar.o();
        if (m0VarD2 != null) {
            m0VarD2.m(doqVar.mn() ? 5 : 2);
            if (m0VarD2.dqq() != 1) {
                jSONObject = null;
            }
            d(strO, m0VarD2, jSONObject, m0VarD2.moq());
            if (doqVar.dm() == 3 && m0VarD2.mnq()) {
                doqVar.d(2);
                doqVar.d((Map<String, String>) null);
                doqVar.d(com.thinkup.core.common.o.dn.q0.f72940q);
                this.f74004d0.d(this.f74005n, doqVar);
            } else if (m0VarD2.mo0()) {
                com.thinkup.core.common.nn.m.n.d().q(new com.thinkup.core.common.nn.m.o(com.thinkup.core.common.nn.m.q.om0, new Runnable() { // from class: com.thinkup.core.q.mm.2
                    @Override // java.lang.Runnable
                    public final void run() {
                        if (m0VarD2.dnq() == 1) {
                            com.thinkup.core.common.n0.d().d(mm.this.f74005n, strO, m0VarD2.n0n());
                        }
                        if (!m0VarD2.mno()) {
                            mm.this.f74007q.m(doqVar.m(), strO, 2);
                            return;
                        }
                        doqVar.d(1);
                        m0 m0VarQ = mm.this.q(strO);
                        doq doqVar2 = doqVar;
                        if (m0VarQ != null) {
                            doqVar2.d(m0VarQ.n0q());
                        } else {
                            doqVar2.d((Map<String, String>) null);
                        }
                        doqVar.d(com.thinkup.core.common.o.dn.q0.f72928d0);
                        mm.this.f74004d0.d(mm.this.f74005n, doqVar);
                    }
                }));
            }
        }
        if (zArr != null && zArr.length > 0 && zArr[0]) {
            if (mVar == null || m0VarD2 == null) {
                return;
            }
            mVar.m(m0VarD2);
            return;
        }
        if (mVar != null) {
            if (m0VarD2 != null) {
                mVar.d(m0VarD2);
            } else {
                mVar.d(ErrorCode.getErrorCode("3001", "", "Placement Service error."));
            }
        }
    }

    public final void d(String str, String str2, m0 m0Var) {
        if (m0Var == null) {
            return;
        }
        this.f74007q.m(str, str2, m0Var.moq());
    }

    public final m0 d(String str, int i10) {
        return this.f74007q.d(com.thinkup.core.common.o.nd.m().mo(), str, i10, true);
    }
}