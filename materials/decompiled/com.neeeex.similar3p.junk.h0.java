package com.neeeex.similar3p.junk;

import com.neeeex.eraser.m0;
import gl.a1;
import gl.c1;
import gl.v0;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes7.dex */
public final class h0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final LinkedHashMap f66350a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Map f66351b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Set f66352c;

    public interface a {

        /* JADX INFO: renamed from: com.neeeex.similar3p.junk.h0$a$a, reason: collision with other inner class name */
        public static final class C0811a implements a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final com.neeeex.similar3p.junk.a f66353a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final boolean f66354b;

            public C0811a(com.neeeex.similar3p.junk.a aVar, boolean z10) {
                m0.a("gCXBxZdhnOc=\n", "40S1oPAO7p4=\n");
                aVar.getClass();
                this.f66353a = aVar;
                this.f66354b = z10;
            }

            public final com.neeeex.similar3p.junk.a a() {
                return this.f66353a;
            }

            public final boolean b() {
                return this.f66354b;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof C0811a)) {
                    return false;
                }
                C0811a c0811a = (C0811a) obj;
                return this.f66353a == c0811a.f66353a && this.f66354b == c0811a.f66354b;
            }

            public int hashCode() {
                return (this.f66353a.hashCode() * 31) + Boolean.hashCode(this.f66354b);
            }

            public String toString() {
                return "Category(category=" + this.f66353a + ", selected=" + this.f66354b + ")";
            }
        }

        public static final class b implements a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final String f66355a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final boolean f66356b;

            public b(String str, boolean z10) {
                m0.a("JqmHGg==\n", "VsjzcvaPVIE=\n");
                str.getClass();
                this.f66355a = str;
                this.f66356b = z10;
            }

            public final String a() {
                return this.f66355a;
            }

            public final boolean b() {
                return this.f66356b;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof b)) {
                    return false;
                }
                b bVar = (b) obj;
                return p003kotlin.jvm.internal.v.c(this.f66355a, bVar.f66355a) && this.f66356b == bVar.f66356b;
            }

            public int hashCode() {
                return (this.f66355a.hashCode() * 31) + Boolean.hashCode(this.f66356b);
            }

            public String toString() {
                return "Item(path=" + this.f66355a + ", selected=" + this.f66356b + ")";
            }
        }
    }

    public h0(List list, Set set) {
        m0.a("VjEoPyA=\n", "P0VNUlMnR0U=\n");
        list.getClass();
        m0.a("YjAzU2C9BxpyDT9LbL8fE28OO1Nhrw==\n", "C15aJwnca3Y=\n");
        set.getClass();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Object obj : list) {
            linkedHashMap.put(((b0) obj).d(), obj);
        }
        this.f66350a = linkedHashMap;
        Collection collectionValues = linkedHashMap.values();
        m0.a("ihMZGX6IIQ7DEQ9Te9BuTJ8=\n", "tnR8bVP+QGI=\n");
        collectionValues.getClass();
        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        for (Object obj2 : collectionValues) {
            com.neeeex.similar3p.junk.a aVarA = ((b0) obj2).a();
            Object arrayList = linkedHashMap2.get(aVarA);
            if (arrayList == null) {
                arrayList = new ArrayList();
                linkedHashMap2.put(aVarA, arrayList);
            }
            ((List) arrayList).add(obj2);
        }
        this.f66351b = linkedHashMap2;
        Set setKeySet = this.f66350a.keySet();
        m0.a("LvWreZ/XvmZhrOYjnJLy\n", "EpLODbK82x8=\n");
        setKeySet.getClass();
        this.f66352c = gl.g0.u0(set, setKeySet);
    }

    public final long a() {
        Iterator it = this.f66352c.iterator();
        long jE = 0;
        while (it.hasNext()) {
            jE += ((b0) v0.l(this.f66350a, (String) it.next())).e();
        }
        return jE;
    }

    public final int b() {
        return this.f66352c.size();
    }

    public final boolean c(com.neeeex.similar3p.junk.a aVar) {
        m0.a("+ov33LpLLQg=\n", "meqDud0kX3E=\n");
        aVar.getClass();
        List listD = d(aVar);
        if (listD.isEmpty()) {
            return false;
        }
        List list = listD;
        if ((list instanceof Collection) && list.isEmpty()) {
            return true;
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            if (!this.f66352c.contains(((b0) it.next()).d())) {
                return false;
            }
        }
        return true;
    }

    public final List d(com.neeeex.similar3p.junk.a aVar) {
        m0.a("exlUgWaRR7E=\n", "GHgg5AH+Ncg=\n");
        aVar.getClass();
        List list = (List) this.f66351b.get(aVar);
        return list == null ? gl.w.m() : list;
    }

    public final void e(a aVar) {
        Collection collectionU0;
        boolean zB;
        boolean z10 = aVar instanceof a.C0811a;
        if (z10) {
            List listD = d(((a.C0811a) aVar).a());
            collectionU0 = new LinkedHashSet();
            Iterator it = listD.iterator();
            while (it.hasNext()) {
                collectionU0.add(((b0) it.next()).d());
            }
        } else {
            if (!(aVar instanceof a.b)) {
                coil.util.j.a();
                return;
            }
            Set setD = a1.d(((a.b) aVar).a());
            Set setKeySet = this.f66350a.keySet();
            m0.a("vhK+9S6fvWHxS/OvLdrx\n", "gnXbgQP02Bg=\n");
            setKeySet.getClass();
            collectionU0 = gl.g0.u0(setD, setKeySet);
        }
        if (z10) {
            zB = ((a.C0811a) aVar).b();
        } else {
            if (!(aVar instanceof a.b)) {
                coil.util.j.a();
                return;
            }
            zB = ((a.b) aVar).b();
        }
        Set set = this.f66352c;
        Collection collection = collectionU0;
        this.f66352c = zB ? c1.n(set, collection) : c1.l(set, collection);
    }

    public final Set f() {
        return new LinkedHashSet(this.f66352c);
    }

    public final void g(com.neeeex.similar3p.junk.a aVar, boolean z10) {
        m0.a("Y8QIVPewQ2c=\n", "AKV8MZDfMR4=\n");
        aVar.getClass();
        e(new a.C0811a(aVar, z10));
    }

    public final void h(String str, boolean z10) {
        m0.a("/2LYBQ==\n", "jwOsbXPXZxE=\n");
        str.getClass();
        e(new a.b(str, z10));
    }
}