package com.thinkup.core.q;

import android.content.Context;
import android.os.Looper;
import android.text.TextUtils;
import com.thinkup.core.common.nn.q0;
import java.util.concurrent.ConcurrentHashMap;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes7.dex */
public final class mo {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final String f74058d = "PlaceStrategySaver";

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final Context f74061m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final ConcurrentHashMap<String, m0> f74062n = new ConcurrentHashMap<>();

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private final ConcurrentHashMap<String, m0> f74063o = new ConcurrentHashMap<>();

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private final ConcurrentHashMap<String, m0> f74064q = new ConcurrentHashMap<>();

    /* JADX INFO: renamed from: d0, reason: collision with root package name */
    private final ConcurrentHashMap<String, Integer> f74059d0 = new ConcurrentHashMap<>();

    /* JADX INFO: renamed from: dd, reason: collision with root package name */
    private final ConcurrentHashMap<String, Integer> f74060dd = new ConcurrentHashMap<>();

    public mo(Context context) {
        this.f74061m = context;
    }

    private boolean d0(String str, String str2) {
        return d(str, str2, 0) != null;
    }

    private m0 q(String str, String str2) {
        return d(str, str2, true);
    }

    public final m0 d(String str, String str2, int i10, boolean z10) {
        ConcurrentHashMap<String, m0> concurrentHashMap;
        while (true) {
            String str3 = str + str2;
            if (i10 == 1) {
                concurrentHashMap = this.f74064q;
            } else {
                concurrentHashMap = i10 == 2 ? this.f74062n : this.f74063o;
            }
            m0 m0Var = concurrentHashMap.get(str3);
            if (m0Var != null) {
                return m0Var;
            }
            if (i10 == 1) {
                return null;
            }
            boolean z11 = i10 == 2;
            if (z10) {
                String strN = q0.n(this.f74061m, com.thinkup.core.common.o.nm.m.f73146d, m(str3, z11), "");
                if (!TextUtils.isEmpty(strN)) {
                    Looper.getMainLooper();
                    Looper.myLooper();
                    try {
                        m0 m0VarD = m0.d(str2, new JSONObject(strN));
                        if (m0VarD != null) {
                            if (m0VarD.ndd() == 1 && !m0VarD.ndn()) {
                                m0VarD.q(1);
                            }
                            m0VarD.d(i10);
                            concurrentHashMap.put(str3, m0VarD);
                            return m0VarD;
                        }
                    } catch (Throwable unused) {
                    }
                } else if (z11) {
                    z10 = true;
                    i10 = 0;
                }
                return null;
            }
            if (!z11) {
                return null;
            }
            i10 = 0;
            z10 = false;
        }
    }

    public final void m(String str, String str2, int i10) {
        String str3 = str + str2;
        if (i10 == 1) {
            this.f74064q.remove(str3);
            return;
        }
        if (i10 == 2) {
            this.f74062n.remove(str3);
        }
        if (i10 == 0) {
            this.f74063o.remove(str3);
        }
        q0.d(this.f74061m, com.thinkup.core.common.o.nm.m.f73146d, m(str3, i10 == 2));
    }

    public final void n(String str, String str2) {
        String str3 = str + str2;
        Integer num = this.f74059d0.get(str3);
        ConcurrentHashMap<String, Integer> concurrentHashMap = this.f74059d0;
        if (num == null) {
            concurrentHashMap.put(str3, 1);
        } else {
            concurrentHashMap.put(str3, Integer.valueOf(num.intValue() + 1));
        }
    }

    public final int o(String str, String str2) {
        String str3 = str + str2;
        ConcurrentHashMap<String, Integer> concurrentHashMap = this.f74059d0;
        Integer num = concurrentHashMap != null ? concurrentHashMap.get(str3) : null;
        if (num != null) {
            return num.intValue();
        }
        return 1;
    }

    public final boolean m(String str, String str2) {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(str);
        sb2.append(str2);
        return this.f74059d0.get(sb2.toString()) == null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static String m(String str, boolean z10) {
        return str + "_" + (z10 ? com.thinkup.core.common.o.nm.d.f73121mm : com.thinkup.core.common.o.nm.d.f73120md);
    }

    public final void d(String str, String str2, m0 m0Var, final JSONObject jSONObject, int i10) {
        final boolean z10;
        if (this.f74061m == null || m0Var == null || TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
            return;
        }
        final String str3 = str + str2;
        if (i10 == 1) {
            this.f74064q.put(str3, m0Var);
            return;
        }
        if (i10 == 2) {
            this.f74062n.put(str3, m0Var);
            z10 = true;
        } else {
            this.f74063o.put(str3, m0Var);
            z10 = false;
        }
        if (m0Var.qd() != 1 && !m0Var.nmm()) {
            com.thinkup.core.common.nn.m.n.d().q(new com.thinkup.core.common.nn.m.o(com.thinkup.core.common.nn.m.q.omd, new Runnable() { // from class: com.thinkup.core.q.mo.1
                @Override // java.lang.Runnable
                public final void run() {
                    JSONObject jSONObject2 = jSONObject;
                    q0.m(mo.this.f74061m, com.thinkup.core.common.o.nm.m.f73146d, mo.m(str3, z10), jSONObject2 == null ? "" : jSONObject2.toString());
                }
            }));
        } else {
            com.thinkup.core.common.o.nd.m().d0q();
        }
    }

    public final void d(String str, int i10) {
        this.f74060dd.put(str, Integer.valueOf(i10));
    }

    public final m0 d(String str, String str2) {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(str);
        sb2.append(str2);
        int i10 = this.f74059d0.get(sb2.toString()) == null ? 2 : 0;
        m0 m0VarD = d(str, str2, i10);
        if (m0VarD == null && i10 == 2) {
            return d(str, str2, 0);
        }
        return m0VarD == null ? d(str, str2, 2) : m0VarD;
    }

    public final m0 d(String str, String str2, boolean z10) {
        m0 m0VarD;
        Integer num = this.f74060dd.get(str2);
        int iIntValue = num == null ? 0 : num.intValue();
        return (iIntValue != 1 || (m0VarD = d(str, str2, 0, z10)) == null) ? d(str, str2, iIntValue, z10) : m0VarD;
    }

    public final m0 d(String str, String str2, int i10) {
        return d(str, str2, i10, true);
    }
}