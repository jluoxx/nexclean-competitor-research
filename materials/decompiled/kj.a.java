package kj;

import java.util.List;

/* JADX INFO: loaded from: classes7.dex */
public class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f86558a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f86559b = 0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public List f86560c;

    public List a() {
        return this.f86560c;
    }

    public void b(List list) {
        this.f86560c = list;
    }

    /* JADX INFO: renamed from: kj.a$a, reason: collision with other inner class name */
    public static class C1088a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public String f86561a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f86562b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f86563c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public List f86564d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public int f86565e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public int f86566f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public int f86567g;

        public C1088a(String str, int i10, int i11, List list, int i12, int i13, int i14) {
            this.f86561a = str;
            this.f86562b = i10;
            this.f86563c = i11;
            this.f86564d = list;
            this.f86565e = i12;
            this.f86566f = i13;
            this.f86567g = i14;
        }

        public int a() {
            return this.f86563c;
        }

        public List b() {
            return this.f86564d;
        }

        public int c() {
            return this.f86562b;
        }

        public String d() {
            return this.f86561a;
        }

        public int e() {
            return this.f86566f;
        }

        public C1088a(String str, int i10, int i11, List list) {
            this(str, i10, i11, list, 0, 0, 0);
        }
    }
}