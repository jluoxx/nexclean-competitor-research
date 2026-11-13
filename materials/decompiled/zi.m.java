package zi;

import android.text.format.DateUtils;
import com.neeeex.eraser.m0;
import com.neeeex.eraser.utils.b0;
import gl.g0;
import gl.v;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import p003kotlin.jvm.functions.Function1;
import p003kotlin.jvm.internal.n0;
import p003kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes7.dex */
public final class m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final m f104407a = new m();

    public static final /* synthetic */ class a extends s implements Function1 {
        public a(Object obj) {
            super(1, obj, m.class, m0.a("MOQYX2kZMScu8g0=\n", "RZd5OAxbREQ=\n"), m0.a("2tcCiz4yogHEwRfEFxO4D4DKBok+Fa9N3M0OhTcRpVHfixGJOB+6D8rKB40vGbgMgPYGjzQdugfB\nwAaIHRW2FtrWBtdyOQ==\n", "r6Rj7Ftw12I=\n"), 0);
        }

        @Override // p003kotlin.jvm.functions.Function1
        public final Integer invoke(p pVar) {
            m0.a("xGo=\n", "tFoH4a8VG8A=\n");
            pVar.getClass();
            return Integer.valueOf(((m) this.receiver).f(pVar));
        }
    }

    public final o b(p pVar) {
        Object next;
        if (pVar != null) {
            e(pVar);
        }
        p[] pVarArrValues = p.values();
        ArrayList arrayList = new ArrayList();
        for (p pVar2 : pVarArrValues) {
            if (pVar2 != pVar) {
                arrayList.add(pVar2);
            }
        }
        List listV0 = g0.V0(arrayList, jl.c.c(new a(this), new n0() { // from class: zi.m.b
            {
                m0.a("GHscqtdxHw==\n", "dwl4w7kQc6c=\n");
                m0.a("/k+5fM0IVby4dA==\n", "kT3dFaNpOZQ=\n");
            }

            @Override // p003kotlin.jvm.internal.n0, p003kotlin.jvm.internal.m0, bm.o
            public Object get(Object obj) {
                return Integer.valueOf(((p) obj).ordinal());
            }
        }));
        Iterator it = listV0.iterator();
        if (it.hasNext()) {
            next = it.next();
            if (it.hasNext()) {
                long jD = d((p) next);
                do {
                    Object next2 = it.next();
                    long jD2 = d((p) next2);
                    if (jD > jD2) {
                        next = next2;
                        jD = jD2;
                    }
                } while (it.hasNext());
            }
        } else {
            next = null;
        }
        p pVar3 = (p) next;
        if (pVar3 == null) {
            return null;
        }
        b0.f66131a.C(c(pVar3), System.currentTimeMillis());
        List listE = v.e(pVar3);
        ArrayList arrayList2 = new ArrayList();
        for (Object obj : listV0) {
            if (((p) obj) != pVar3) {
                arrayList2.add(obj);
            }
        }
        return new o(pVar3, g0.L0(listE, arrayList2));
    }

    public final String c(p pVar) {
        String lowerCase = pVar.name().toLowerCase(Locale.ROOT);
        m0.a("QFjU8aqysUdVRP228/ntLQ==\n", "NDeYnt3XwwQ=\n");
        lowerCase.getClass();
        return "neeeex_for_you_highlight_at_" + lowerCase;
    }

    public final long d(p pVar) {
        return b0.f66131a.v(c(pVar), 0L);
    }

    public final void e(p pVar) {
        m0.a("1Ww/O6uYTw==\n", "swleT97qKsY=\n");
        pVar.getClass();
        b0.f66131a.C(g(pVar), System.currentTimeMillis());
    }

    public final int f(p pVar) {
        long jV = b0.f66131a.v(g(pVar), 0L);
        if (jV <= 0) {
            return 0;
        }
        return !DateUtils.isToday(jV) ? 1 : 2;
    }

    public final String g(p pVar) {
        String lowerCase = pVar.name().toLowerCase(Locale.ROOT);
        m0.a("XK9c660/NNVJs3Ws9HRovw==\n", "KMAQhNpaRpY=\n");
        lowerCase.getClass();
        return "neeeex_for_you_used_at_" + lowerCase;
    }
}