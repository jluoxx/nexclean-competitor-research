package com.thinkup.core.d;

import com.thinkup.core.common.dm.m0q;
import com.thinkup.core.common.o.nd;
import com.thinkup.core.q.m0;

/* JADX INFO: loaded from: classes7.dex */
public class o {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static volatile o f73407d;

    public static int d(m0q m0qVar) {
        if (m0qVar == null) {
            return 3;
        }
        return m.d(nd.m().dd()).d(String.valueOf(m0qVar.mm()), m0qVar.qn(), String.valueOf(m0qVar.ndo()), m0qVar.qm());
    }

    public static int d(String str, m0 m0Var) {
        if (m0Var == null) {
            return 3;
        }
        return m.d(nd.m().dd()).d(str, String.valueOf(m0Var.dqm()), m0Var.m0n());
    }

    public static o d() {
        if (f73407d == null) {
            synchronized (o.class) {
                try {
                    if (f73407d == null) {
                        f73407d = new o();
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        return f73407d;
    }
}