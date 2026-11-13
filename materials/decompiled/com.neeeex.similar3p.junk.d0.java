package com.neeeex.similar3p.junk;

import com.neeeex.eraser.m0;
import gl.u0;
import gl.v0;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes7.dex */
public final class d0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f66325a;

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final long f66326a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Map f66327b;

        public a(long j10, Map map) {
            m0.a("cCMVX5/8twZ2MQ==\n", "E0JhOviTxW8=\n");
            map.getClass();
            this.f66326a = j10;
            this.f66327b = map;
        }

        public final a a(b0 b0Var) {
            m0.a("Cj0GCw==\n", "Y0ljZp+/k20=\n");
            b0Var.getClass();
            b bVar = (b) v0.l(this.f66327b, b0Var.a());
            return new a(this.f66326a + b0Var.e(), v0.q(this.f66327b, fl.z.a(b0Var.a(), new b(bVar.b() + 1, bVar.a() + b0Var.e()))));
        }

        public final long b() {
            return this.f66326a;
        }

        public final Map c() {
            return this.f66327b;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return this.f66326a == aVar.f66326a && p003kotlin.jvm.internal.v.c(this.f66327b, aVar.f66327b);
        }

        public int hashCode() {
            return (Long.hashCode(this.f66326a) * 31) + this.f66327b.hashCode();
        }

        public String toString() {
            return "JunkAggregate(bytes=" + this.f66326a + ", categories=" + this.f66327b + ")";
        }
    }

    public d0(List list) {
        m0.a("k5D3d/M=\n", "+uSSGoD6Nc8=\n");
        list.getClass();
        this.f66325a = list;
    }

    public final a a() {
        ml.a entries = com.neeeex.similar3p.junk.a.getEntries();
        LinkedHashMap linkedHashMap = new LinkedHashMap(am.q.f(u0.e(gl.x.x(entries, 10)), 16));
        for (Object obj : entries) {
            linkedHashMap.put(obj, new b(0, 0L, 3, null));
        }
        a aVar = new a(0L, linkedHashMap);
        Iterator it = this.f66325a.iterator();
        while (it.hasNext()) {
            aVar = aVar.a((b0) it.next());
        }
        return aVar;
    }

    public final List b() {
        return this.f66325a;
    }

    public final long c() {
        return a().b();
    }

    public final Map d() {
        return a().c();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof d0) && p003kotlin.jvm.internal.v.c(this.f66325a, ((d0) obj).f66325a);
    }

    public int hashCode() {
        return this.f66325a.hashCode();
    }

    public String toString() {
        return "JunkScanResult(items=" + this.f66325a + ")";
    }
}