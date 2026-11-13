package hj;

import java.util.Comparator;
import java.util.List;

/* JADX INFO: loaded from: classes7.dex */
public final class m1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final m1 f83625a = new m1();

    public static final class a implements Comparator {
        @Override // java.util.Comparator
        public final int compare(Object obj, Object obj2) {
            return jl.c.e(Double.valueOf(((kj.e) obj2).d()), Double.valueOf(((kj.e) obj).d()));
        }
    }

    public final List a(kj.a.C1088a c1088a) {
        if (c1088a == null) {
            return gl.w.m();
        }
        List listB = c1088a.b();
        if (listB != null) {
            return gl.g0.V0(listB, new a());
        }
        return null;
    }
}