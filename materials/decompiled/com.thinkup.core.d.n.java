package com.thinkup.core.d;

import android.content.Context;
import android.text.TextUtils;
import com.thinkup.core.common.dm.dn;
import com.thinkup.core.common.dm.m0q;
import com.thinkup.core.q.m0;

/* JADX INFO: loaded from: classes7.dex */
public class n {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private static volatile n f73405m;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final String f73406d = n.class.getSimpleName();

    public static void d(Context context, m0q m0qVar, String str) {
        if (context == null || m0qVar == null || TextUtils.isEmpty(str)) {
            return;
        }
        if (!TextUtils.isEmpty(str)) {
            m.d(context).o(m0qVar);
        }
        int iNn0 = m0qVar.nn0();
        long jNnd = m0qVar.nnd();
        String strQn = m0qVar.qn();
        m.d(context).m(iNn0, jNnd, m0qVar.mm(), strQn, String.valueOf(m0qVar.ndo()));
    }

    public static void m(Context context, String str, m0 m0Var) {
        if (context == null || m0Var == null || TextUtils.isEmpty(str)) {
            return;
        }
        m.d(context).d(m0Var.mdo(), m0Var.mdq(), str, m0Var.dqm());
    }

    private static void n(Context context, m0q m0qVar, String str) {
        if (context == null || m0qVar == null || TextUtils.isEmpty(str)) {
            return;
        }
        m.d(context).o(m0qVar);
    }

    public static void m(Context context, m0q m0qVar, String str) {
        if (context == null || m0qVar == null || TextUtils.isEmpty(str)) {
            return;
        }
        m.d(context).d(m0qVar);
    }

    public static void m(Context context, m0q m0qVar) {
        if (context == null || m0qVar == null) {
            return;
        }
        m.d(context).n(m0qVar);
    }

    public static int d(Context context, String str) {
        if (context != null && !TextUtils.isEmpty(str)) {
            int iD = m.d(context).d(str);
            int i10 = m.f73370mm;
            return iD != i10 ? iD : i10;
        }
        return m.f73370mm;
    }

    public static int d(Context context, String str, m0 m0Var) {
        if (context != null && m0Var != null && !TextUtils.isEmpty(str)) {
            return m.d(context).d(m0Var.mdo(), m0Var.mdq(), str);
        }
        return m.f73370mm;
    }

    public static int d(Context context, m0q m0qVar, String str, int i10) {
        if (context != null && m0qVar != null && !TextUtils.isEmpty(str)) {
            return m.d(context).d(m0qVar.nn0(), m0qVar.nnd(), m0qVar.mm(), m0qVar.qn(), String.valueOf(i10));
        }
        return m.f73370mm;
    }

    public static n d() {
        if (f73405m == null) {
            synchronized (n.class) {
                try {
                    if (f73405m == null) {
                        f73405m = new n();
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        return f73405m;
    }

    public static dn d(Context context, m0q m0qVar) {
        if (context == null || m0qVar == null) {
            return null;
        }
        return m.d(context).m(m0qVar);
    }
}