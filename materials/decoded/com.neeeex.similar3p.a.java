package com.neeeex.similar3p;

import com.neeeex.eraser.m0;
import gl.g0;
import java.util.List;

/* JADX INFO: loaded from: classes7.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f66261a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static volatile C0807a f66262b;

    /* JADX INFO: renamed from: com.neeeex.similar3p.a$a, reason: collision with other inner class name */
    public static final class C0807a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final long f66263a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f66264b;

        public C0807a(long j10, String str) {
            "preferenceKey" /* decoded XOR */;
            str.getClass();
            this.f66263a = j10;
            this.f66264b = str;
        }

        public final long a() {
            return this.f66263a;
        }

        public final String b() {
            return this.f66264b;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C0807a)) {
                return false;
            }
            C0807a c0807a = (C0807a) obj;
            return this.f66263a == c0807a.f66263a && p003kotlin.jvm.internal.v.c(this.f66264b, c0807a.f66264b);
        }

        public int hashCode() {
            return (Long.hashCode(this.f66263a) * 31) + this.f66264b.hashCode();
        }

        public String toString() {
            return "DeleteAdPolicy(interval=" + this.f66263a + ", preferenceKey=" + this.f66264b + ")";
        }
    }

    static {
        a aVar = new a();
        f66261a = aVar;
        f66262b = new C0807a(45000L, aVar.a());
    }

    public final String a() {
        List listC = gl.v.c();
        listC.add("neeeex" /* decoded XOR */);
        listC.add("sp" /* decoded XOR */);
        listC.add("key" /* decoded XOR */);
        listC.add("timestamp" /* decoded XOR */);
        listC.add("clean" /* decoded XOR */);
        listC.add("delete" /* decoded XOR */);
        listC.add("show" /* decoded XOR */);
        listC.add("ad" /* decoded XOR */);
        return g0.y0(gl.v.a(listC), "_" /* decoded XOR */, null, null, 0, null, null, 62, null);
    }

    public final long b() {
        return f66262b.a();
    }

    public final String c() {
        return f66262b.b();
    }
}