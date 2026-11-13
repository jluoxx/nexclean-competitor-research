package com.neeeex.similar3p;

import com.neeeex.eraser.m0;
import java.util.List;

/* JADX INFO: loaded from: classes7.dex */
public final class x {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final x f66611a = new x();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static a f66612b = new a(null, null, null, null, 15, null);

    public final synchronized y a() {
        return f66612b.f();
    }

    public final synchronized List b() {
        return f66612b.c();
    }

    public final synchronized List c() {
        return f66612b.d();
    }

    public final synchronized List d() {
        return f66612b.e();
    }

    public final synchronized void e(y yVar) {
        "value" /* decoded XOR */;
        yVar.getClass();
        f66612b = a.b(f66612b, null, null, null, yVar, 7, null);
    }

    public final synchronized void f(List list) {
        "value" /* decoded XOR */;
        list.getClass();
        f66612b = a.b(f66612b, null, list, null, null, 13, null);
    }

    public final synchronized void g(List list) {
        "value" /* decoded XOR */;
        list.getClass();
        f66612b = a.b(f66612b, list, null, null, null, 14, null);
    }

    public final synchronized void h(List list) {
        "value" /* decoded XOR */;
        list.getClass();
        f66612b = a.b(f66612b, null, null, list, null, 11, null);
    }

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final List f66613a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final List f66614b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final List f66615c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final y f66616d;

        public a(List list, List list2, List list3, y yVar) {
            "files" /* decoded XOR */;
            list.getClass();
            "duplicateGroups" /* decoded XOR */;
            list2.getClass();
            "similarGroups" /* decoded XOR */;
            list3.getClass();
            "type" /* decoded XOR */;
            yVar.getClass();
            this.f66613a = list;
            this.f66614b = list2;
            this.f66615c = list3;
            this.f66616d = yVar;
        }

        public static /* synthetic */ a b(a aVar, List list, List list2, List list3, y yVar, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                list = aVar.f66613a;
            }
            if ((i10 & 2) != 0) {
                list2 = aVar.f66614b;
            }
            if ((i10 & 4) != 0) {
                list3 = aVar.f66615c;
            }
            if ((i10 & 8) != 0) {
                yVar = aVar.f66616d;
            }
            return aVar.a(list, list2, list3, yVar);
        }

        public final a a(List list, List list2, List list3, y yVar) {
            "files" /* decoded XOR */;
            list.getClass();
            "duplicateGroups" /* decoded XOR */;
            list2.getClass();
            "similarGroups" /* decoded XOR */;
            list3.getClass();
            "type" /* decoded XOR */;
            yVar.getClass();
            return new a(list, list2, list3, yVar);
        }

        public final List c() {
            return this.f66614b;
        }

        public final List d() {
            return this.f66613a;
        }

        public final List e() {
            return this.f66615c;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return p003kotlin.jvm.internal.v.c(this.f66613a, aVar.f66613a) && p003kotlin.jvm.internal.v.c(this.f66614b, aVar.f66614b) && p003kotlin.jvm.internal.v.c(this.f66615c, aVar.f66615c) && this.f66616d == aVar.f66616d;
        }

        public final y f() {
            return this.f66616d;
        }

        public int hashCode() {
            return (((((this.f66613a.hashCode() * 31) + this.f66614b.hashCode()) * 31) + this.f66615c.hashCode()) * 31) + this.f66616d.hashCode();
        }

        public String toString() {
            return "ScanSnapshot(files=" + this.f66613a + ", duplicateGroups=" + this.f66614b + ", similarGroups=" + this.f66615c + ", type=" + this.f66616d + ")";
        }

        public /* synthetic */ a(List list, List list2, List list3, y yVar, int i10, p003kotlin.jvm.internal.m mVar) {
            this((i10 & 1) != 0 ? gl.w.m() : list, (i10 & 2) != 0 ? gl.w.m() : list2, (i10 & 4) != 0 ? gl.w.m() : list3, (i10 & 8) != 0 ? y.LARGE_DOCS : yVar);
        }
    }
}