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
            super(1, obj, m.class, "usageBucket" /* decoded XOR */, "usageBucket(Lcom/neeeex/similar3p/recommendation/RecommendedFeature;)I" /* decoded XOR */, 0);
        }

        @Override // p003kotlin.jvm.functions.Function1
        public final Integer invoke(p pVar) {
            "p0" /* decoded XOR */;
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
                "ordinal" /* decoded XOR */;
                "ordinal()I" /* decoded XOR */;
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
        "toLowerCase(...)" /* decoded XOR */;
        lowerCase.getClass();
        return "neeeex_for_you_highlight_at_" + lowerCase;
    }

    public final long d(p pVar) {
        return b0.f66131a.v(c(pVar), 0L);
    }

    public final void e(p pVar) {
        "feature" /* decoded XOR */;
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
        "toLowerCase(...)" /* decoded XOR */;
        lowerCase.getClass();
        return "neeeex_for_you_used_at_" + lowerCase;
    }
}