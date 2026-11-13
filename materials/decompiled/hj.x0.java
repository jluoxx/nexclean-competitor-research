package hj;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/* JADX INFO: loaded from: classes7.dex */
public final class x0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final HashMap f83747a = new HashMap();

    public x0(kj.a aVar) {
        a(aVar);
    }

    public final void a(kj.a aVar) {
        List<kj.a.C1088a> listA = aVar.a();
        if (listA == null || listA.isEmpty()) {
            return;
        }
        this.f83747a.clear();
        HashMap map = new HashMap();
        for (kj.a.C1088a c1088a : listA) {
            if (c1088a != null) {
                List<kj.e> listB = c1088a.b();
                if (listB != null && !listB.isEmpty()) {
                    for (kj.e eVar : listB) {
                        List arrayList = (List) map.get(eVar.a());
                        if (arrayList == null) {
                            arrayList = new ArrayList();
                            map.put(eVar.a(), arrayList);
                        }
                        if (!arrayList.contains(c1088a.d())) {
                            arrayList.add(c1088a.d());
                        }
                        eVar.m(c1088a.d());
                        eVar.k(c1088a.a());
                        if (eVar.b() == 1) {
                            double dA = y.f83761a.a(eVar.a());
                            if (dA > 1.0E-9d) {
                                eVar.l(dA);
                            }
                        }
                    }
                }
                this.f83747a.put(c1088a.d(), c1088a);
            }
        }
        w0.f83728a.b(map);
    }
}