package com.neeeex.similar3p.junk;

import com.neeeex.eraser.m0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

/* JADX INFO: loaded from: classes7.dex */
public final class e0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final e0 f66328a = new e0();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static g0 f66329b;

    public interface a {

        /* JADX INFO: renamed from: com.neeeex.similar3p.junk.e0$a$a, reason: collision with other inner class name */
        public static final class C0809a implements a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final C0809a f66330a = new C0809a();

            public boolean equals(Object obj) {
                return this == obj || (obj instanceof C0809a);
            }

            public int hashCode() {
                return -707662824;
            }

            public String toString() {
                return "Clear" /* decoded XOR */;
            }
        }

        public static final class b implements a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final d0 f66331a;

            public b(d0 d0Var) {
                "result" /* decoded XOR */;
                d0Var.getClass();
                this.f66331a = d0Var;
            }

            public final d0 a() {
                return this.f66331a;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof b) && p003kotlin.jvm.internal.v.c(this.f66331a, ((b) obj).f66331a);
            }

            public int hashCode() {
                return this.f66331a.hashCode();
            }

            public String toString() {
                return "Replace(result=" + this.f66331a + ")";
            }
        }

        public static final class c implements a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final Set f66332a;

            public c(Set set) {
                "paths" /* decoded XOR */;
                set.getClass();
                this.f66332a = set;
            }

            public final Set a() {
                return this.f66332a;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof c) && p003kotlin.jvm.internal.v.c(this.f66332a, ((c) obj).f66332a);
            }

            public int hashCode() {
                return this.f66332a.hashCode();
            }

            public String toString() {
                return "Select(paths=" + this.f66332a + ")";
            }
        }
    }

    public final synchronized void a() {
        d(a.C0809a.f66330a);
    }

    public final d0 b(d0 d0Var) {
        return new d0(gl.g0.f1(d0Var.b()));
    }

    public final g0 c(g0 g0Var) {
        return new g0(b(g0Var.c()), gl.g0.k1(g0Var.d()));
    }

    public final void d(a aVar) {
        g0 g0VarB;
        if (aVar instanceof a.b) {
            d0 d0VarB = b(((a.b) aVar).a());
            g0VarB = new g0(d0VarB, f66328a.e(d0VarB.b()));
        } else {
            if (aVar instanceof a.c) {
                g0 g0Var = f66329b;
                if (g0Var != null) {
                    g0VarB = g0.b(g0Var, null, gl.g0.u0(((a.c) aVar).a(), f66328a.e(g0Var.c().b())), 1, null);
                }
            } else if (!p003kotlin.jvm.internal.v.c(aVar, a.C0809a.f66330a)) {
                coil.util.j.a();
                return;
            }
            g0VarB = null;
        }
        f66329b = g0VarB;
    }

    public final Set e(List list) {
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            linkedHashSet.add(((b0) it.next()).d());
        }
        return linkedHashSet;
    }

    public final synchronized void f(d0 d0Var) {
        "result" /* decoded XOR */;
        d0Var.getClass();
        d(new a.b(d0Var));
    }

    public final synchronized List g() {
        ArrayList arrayList;
        Set setD;
        d0 d0VarC;
        try {
            g0 g0Var = f66329b;
            List listB = (g0Var == null || (d0VarC = g0Var.c()) == null) ? null : d0VarC.b();
            if (listB == null) {
                listB = gl.w.m();
            }
            arrayList = new ArrayList();
            for (Object obj : listB) {
                b0 b0Var = (b0) obj;
                if (g0Var != null && (setD = g0Var.d()) != null && setD.contains(b0Var.d())) {
                    arrayList.add(obj);
                }
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return arrayList;
    }

    public final synchronized void h(Set set) {
        "paths" /* decoded XOR */;
        set.getClass();
        d(new a.c(set));
    }

    public final synchronized g0 i() {
        g0 g0Var;
        g0Var = f66329b;
        return g0Var != null ? c(g0Var) : null;
    }
}