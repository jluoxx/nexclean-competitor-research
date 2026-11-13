package com.neeeex.eraser.module.main;

/* JADX INFO: loaded from: classes7.dex */
public final class j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final j f65357a = new j();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static a f65358b;

    public interface a {

        /* JADX INFO: renamed from: com.neeeex.eraser.module.main.j$a$a, reason: collision with other inner class name */
        public static final class C0780a implements a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final C0780a f65359a = new C0780a();

            public boolean equals(Object obj) {
                return this == obj || (obj instanceof C0780a);
            }

            public int hashCode() {
                return 1773563393;
            }

            public String toString() {
                return com.neeeex.eraser.m0.a("qfpH+yJ6GuGJ4E38PlYH\n", "+ZIoj005dYw=\n");
            }
        }
    }

    public final synchronized void a() {
        f65358b = null;
    }

    public final synchronized a b() {
        a aVar;
        aVar = f65358b;
        f65358b = null;
        return aVar;
    }

    public final synchronized void c(a aVar) {
        com.neeeex.eraser.m0.a("bfEN60b8\n", "DJJ5gimSQC8=\n");
        aVar.getClass();
        f65358b = aVar;
    }
}