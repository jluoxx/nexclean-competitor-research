package com.thinkup.core.d;

import android.content.Context;
import com.thinkup.core.common.dm.dqd;
import com.thinkup.core.common.dm.m0q;
import com.thinkup.core.common.o.nd;
import com.thinkup.core.q.m0;

/* JADX INFO: loaded from: classes7.dex */
public class d {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static volatile d f73367n;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    Context f73368d;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final String f73369m = getClass().getSimpleName();

    private d(Context context) {
        this.f73368d = context;
    }

    public static int d(m0q m0qVar, int i10) {
        if (m0qVar == null) {
            return m.f73370mm;
        }
        m mVarD = m.d(nd.m().dd());
        String strValueOf = String.valueOf(m0qVar.mm());
        String strQn = m0qVar.qn();
        String strValueOf2 = String.valueOf(i10);
        long jMo = m0qVar.mo();
        long jMq = m0qVar.mq();
        m0qVar.qm();
        return mVarD.d(strValueOf, strQn, strValueOf2, jMo, jMq);
    }

    public static int d(m0 m0Var, String str) {
        if (m0Var == null) {
            return m.f73370mm;
        }
        return m.d(nd.m().dd()).d(str, String.valueOf(m0Var.dqm()), m0Var.m0d(), m0Var.m0m());
    }

    public static d d(Context context) {
        if (f73367n == null) {
            synchronized (d.class) {
                try {
                    if (f73367n == null) {
                        f73367n = new d(context);
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        return f73367n;
    }

    public static dqd d(String str, int i10) {
        m mVarD = m.d(nd.m().dd());
        dqd dqdVar = new dqd();
        dqdVar.f68169m = str;
        dqdVar.f68165d = i10;
        dqdVar.f68170n = (int) mVarD.m(str);
        dqdVar.f68171o = (int) mVarD.n(str);
        return dqdVar;
    }

    public static dqd.d d(String str) {
        m mVarD = m.d(nd.m().dd());
        dqd.d dVar = new dqd.d();
        dVar.f68173d = str;
        dVar.f68177o = (int) mVarD.o(str);
        dVar.f68178q = (int) mVarD.q(str);
        return dVar;
    }

    public static int[] d(int i10) {
        m mVarD = m.d(nd.m().dd());
        String strValueOf = String.valueOf(i10);
        return new int[]{(int) mVarD.d0(strValueOf), (int) mVarD.dd(strValueOf)};
    }

    public static void d(com.thinkup.core.common.dm.m0 m0Var, String str, String str2, String str3) {
        m.d(nd.m().dd()).d(m0Var.dmo(), str, str2, str3);
    }
}