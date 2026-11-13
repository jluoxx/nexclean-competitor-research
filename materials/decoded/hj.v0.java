package hj;

import java.lang.ref.SoftReference;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.LinkedBlockingDeque;

/* JADX INFO: loaded from: classes7.dex */
public class v0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final HashMap f83723a = new HashMap();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final HashMap f83724b = new HashMap();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Map f83725c = new HashMap();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final HashMap f83726d = new HashMap();

    public interface a {
        boolean d(int i10);
    }

    public static final class b extends ll.m implements tl.n {
        public final /* synthetic */ p003kotlin.jvm.internal.v0 OooO00o;
        public final /* synthetic */ v0 OooO0O0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(p003kotlin.jvm.internal.v0 v0Var, v0 v0Var2, kl.f fVar) {
            super(2, fVar);
            this.OooO00o = v0Var;
            this.OooO0O0 = v0Var2;
        }

        @Override // tl.n
        /* JADX INFO: renamed from: OooO00o, reason: merged with bridge method [inline-methods] */
        public final Object invoke(kotlinx.coroutines.p0 p0Var, kl.f<? super fl.m0> fVar) {
            return new b(this.OooO00o, this.OooO0O0, fVar).invokeSuspend(fl.m0.f80959a);
        }

        @Override // ll.a
        public final kl.f<fl.m0> create(Object obj, kl.f<?> fVar) {
            return new b(this.OooO00o, this.OooO0O0, fVar);
        }

        @Override // ll.a
        public final Object invokeSuspend(Object obj) {
            LinkedBlockingDeque linkedBlockingDeque;
            SoftReference softReference;
            mj.b bVar;
            p003kotlin.coroutines.intrinsics.c.f();
            fl.v.b(obj);
            for (String str : (List) this.OooO00o.element) {
                List list = (List) this.OooO0O0.f83726d.get(str);
                if ((list != null ? list.size() : 0) > 0 && (linkedBlockingDeque = (LinkedBlockingDeque) this.OooO0O0.f83723a.get(str)) != null && (softReference = (SoftReference) linkedBlockingDeque.pollFirst()) != null && (bVar = (mj.b) softReference.get()) != null) {
                    bVar.b();
                }
            }
            return fl.m0.f80959a;
        }
    }

    public static final class c implements Comparator {
        @Override // java.util.Comparator
        public final int compare(Object obj, Object obj2) {
            kj.d dVar = ((k) obj2).f83614m;
            Double dValueOf = dVar != null ? Double.valueOf(dVar.d()) : null;
            kj.d dVar2 = ((k) obj).f83614m;
            return jl.c.e(dValueOf, dVar2 != null ? Double.valueOf(dVar2.d()) : null);
        }
    }

    public static void f(List list, k kVar) {
        if (list.isEmpty()) {
            list.add(kVar);
            return;
        }
        kj.d dVar = kVar.f83614m;
        Double dValueOf = dVar != null ? Double.valueOf(dVar.d()) : null;
        Iterator it = list.iterator();
        int i10 = 0;
        while (it.hasNext()) {
            int i11 = i10 + 1;
            kj.d dVar2 = ((k) it.next()).f83614m;
            Double dValueOf2 = dVar2 != null ? Double.valueOf(dVar2.d()) : null;
            if (dValueOf != null && dValueOf2 != null && dValueOf.doubleValue() > dValueOf2.doubleValue()) {
                list.add(i10, kVar);
                return;
            } else {
                if (i10 == list.size() - 1) {
                    list.add(kVar);
                    return;
                }
                i10 = i11;
            }
        }
    }

    public final synchronized k a(String str, int i10) {
        Iterator it;
        try {
            synchronized (this.f83726d) {
                try {
                    List list = (List) this.f83726d.get(str);
                    if (list != null && (it = list.iterator()) != null) {
                        while (it.hasNext()) {
                            k kVar = (k) it.next();
                            if (kVar.i()) {
                                it.remove();
                            } else {
                                kj.d dVar = kVar.f83614m;
                                if (dVar != null && i10 == dVar.b()) {
                                    kj.d dVar2 = kVar.f83614m;
                                    if (dVar2 != null) {
                                        q1 q1VarA = r.f83668a.a(dVar2.b());
                                        if (q1VarA != null && q1VarA.a()) {
                                            return kVar;
                                        }
                                    } else {
                                        it.remove();
                                    }
                                }
                            }
                        }
                        fl.m0 m0Var = fl.m0.f80959a;
                        return null;
                    }
                    return null;
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        } catch (Throwable th3) {
            throw th3;
        }
    }

    public final synchronized void b() {
        try {
            synchronized (this.f83726d) {
                try {
                    Iterator it = this.f83726d.entrySet().iterator();
                    while (it.hasNext()) {
                        Iterator it2 = ((List) ((Map.Entry) it.next()).getValue()).iterator();
                        while (it2.hasNext()) {
                            k kVar = (k) it2.next();
                            if (kVar.i()) {
                                it2.remove();
                            } else {
                                kj.d dVar = kVar.f83614m;
                                if (dVar != null) {
                                    q1 q1VarA = r.f83668a.a(dVar.b());
                                    if (q1VarA == null || !q1VarA.a()) {
                                        it2.remove();
                                    }
                                } else {
                                    it2.remove();
                                }
                            }
                        }
                    }
                    fl.m0 m0Var = fl.m0.f80959a;
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        } catch (Throwable th3) {
            throw th3;
        }
    }

    public final synchronized void c(k kVar) {
        String strE;
        a aVar;
        a aVar2;
        if (kVar != null) {
            try {
                kj.d dVar = kVar.f83614m;
                if (dVar == null || (strE = dVar.e()) == null) {
                    strE = "";
                }
                a aVar3 = (a) this.f83724b.get(strE);
                if (aVar3 == null) {
                    Map map = this.f83725c;
                    kj.d dVar2 = kVar.f83614m;
                    List<String> list = (List) map.get(dVar2 != null ? dVar2.a() : null);
                    if (list != null) {
                        for (String str : list) {
                            if (!p003kotlin.jvm.internal.v.c(str, strE) && (aVar = (a) this.f83724b.get(str)) != null) {
                                kj.d dVar3 = kVar.f83614m;
                                if (aVar.d(dVar3 != null ? dVar3.b() : 0)) {
                                    break;
                                }
                            }
                        }
                    }
                } else {
                    kj.d dVar4 = kVar.f83614m;
                    if (!aVar3.d(dVar4 != null ? dVar4.b() : 0)) {
                        Map map2 = this.f83725c;
                        kj.d dVar5 = kVar.f83614m;
                        List<String> list2 = (List) map2.get(dVar5 != null ? dVar5.a() : null);
                        if (list2 != null) {
                            for (String str2 : list2) {
                                if (!p003kotlin.jvm.internal.v.c(str2, strE) && (aVar2 = (a) this.f83724b.get(str2)) != null) {
                                    kj.d dVar6 = kVar.f83614m;
                                    if (aVar2.d(dVar6 != null ? dVar6.b() : 0)) {
                                        break;
                                    }
                                }
                            }
                        }
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final synchronized void d(String str, k kVar) {
        String strA;
        try {
            kj.d dVar = kVar.f83614m;
            if (dVar == null || (strA = dVar.a()) == null) {
                strA = "";
            }
            p003kotlin.jvm.internal.v0 v0Var = new p003kotlin.jvm.internal.v0();
            List arrayList = (List) this.f83725c.get(strA);
            if (arrayList == null) {
                arrayList = new ArrayList();
                this.f83725c.put(strA, arrayList);
            }
            v0Var.element = arrayList;
            if (arrayList.isEmpty() || !((List) v0Var.element).contains(str)) {
                ((List) v0Var.element).add(str);
            }
            for (String str2 : (List) v0Var.element) {
                List arrayList2 = (List) this.f83726d.get(str2);
                if (arrayList2 == null) {
                    arrayList2 = new ArrayList();
                    this.f83726d.put(str2, arrayList2);
                }
                synchronized (this.f83726d) {
                    f(arrayList2, kVar);
                    fl.m0 m0Var = fl.m0.f80959a;
                }
            }
            kotlinx.coroutines.k.d(kotlinx.coroutines.v1.f87249a, kotlinx.coroutines.f1.c(), null, new b(v0Var, this, null), 2, null);
        } catch (Throwable th2) {
            th2.printStackTrace();
        }
    }

    public final synchronized void e(String str, mj.b bVar) {
        try {
            LinkedBlockingDeque linkedBlockingDeque = (LinkedBlockingDeque) this.f83723a.get(str);
            if (linkedBlockingDeque == null) {
                linkedBlockingDeque = new LinkedBlockingDeque(30);
                this.f83723a.put(str, linkedBlockingDeque);
            }
            if (linkedBlockingDeque.remainingCapacity() <= 0) {
                linkedBlockingDeque.pollLast();
            }
            linkedBlockingDeque.offerFirst(new SoftReference(bVar));
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public final synchronized void g(k kVar) {
        if (kVar == null) {
            return;
        }
        try {
            synchronized (this.f83726d) {
                try {
                    Iterator it = this.f83726d.entrySet().iterator();
                    while (it.hasNext()) {
                        List list = (List) ((Map.Entry) it.next()).getValue();
                        if (!list.isEmpty()) {
                            list.remove(kVar);
                        }
                    }
                    fl.m0 m0Var = fl.m0.f80959a;
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        } catch (Throwable th3) {
            throw th3;
        }
    }

    public final synchronized k h(String str) {
        Iterator it;
        Iterator it2;
        List list;
        kj.d dVar;
        List list2 = (List) this.f83726d.get(str);
        if (list2 != null && (it = list2.iterator()) != null) {
            synchronized (this.f83726d) {
                try {
                    Iterator itA = gl.z.A(it);
                    boolean z10 = false;
                    while (itA.hasNext()) {
                        gl.n0 n0Var = (gl.n0) itA.next();
                        int iA = n0Var.a();
                        k kVar = (k) n0Var.b();
                        if (kVar.i()) {
                            it.remove();
                        } else {
                            kj.d dVar2 = kVar.f83614m;
                            if ((dVar2 != null && dVar2.b() == 3) || ((dVar = kVar.f83614m) != null && dVar.b() == 30)) {
                                if (kVar.o() && iA > 0) {
                                    z10 = true;
                                }
                            }
                        }
                    }
                    if (z10 && (list = (List) this.f83726d.get(str)) != null && list.size() > 1) {
                        gl.a0.C(list, new c());
                    }
                    List list3 = (List) this.f83726d.get(str);
                    if (list3 != null && (it2 = list3.iterator()) != null) {
                        Iterator itA2 = gl.z.A(it2);
                        while (itA2.hasNext()) {
                            gl.n0 n0Var2 = (gl.n0) itA2.next();
                            n0Var2.a();
                            k kVar2 = (k) n0Var2.b();
                            kj.d dVar3 = kVar2.f83614m;
                            if (dVar3 != null) {
                                q1 q1VarA = r.f83668a.a(dVar3.b());
                                if (q1VarA != null && q1VarA.a()) {
                                    return kVar2;
                                }
                            } else {
                                it2.remove();
                            }
                        }
                        fl.m0 m0Var = fl.m0.f80959a;
                        return null;
                    }
                    return null;
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        return null;
    }

    public final synchronized List i(String str) {
        List list = (List) this.f83726d.get(str);
        if (list != null) {
            return list;
        }
        ArrayList arrayList = new ArrayList();
        this.f83726d.put(str, arrayList);
        return arrayList;
    }
}