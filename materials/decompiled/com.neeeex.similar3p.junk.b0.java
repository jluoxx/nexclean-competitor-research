package com.neeeex.similar3p.junk;

import com.neeeex.eraser.m0;
import java.io.File;
import java.io.IOException;

/* JADX INFO: loaded from: classes7.dex */
public final class b0 {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final a f66309g = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f66310a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f66311b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f66312c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f66313d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final boolean f66314e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final com.neeeex.similar3p.junk.a f66315f;

    public b0(String str, String str2, long j10, long j11, boolean z10, com.neeeex.similar3p.junk.a aVar) {
        m0.a("nR73XQ==\n", "7X+DNQW/82Q=\n");
        str.getClass();
        m0.a("HzunMQ==\n", "cVrKVMfFhDw=\n");
        str2.getClass();
        m0.a("i+D9fQ50/AI=\n", "6IGJGGkbjns=\n");
        aVar.getClass();
        this.f66310a = str;
        this.f66311b = str2;
        this.f66312c = j10;
        this.f66313d = j11;
        this.f66314e = z10;
        this.f66315f = aVar;
    }

    public final com.neeeex.similar3p.junk.a a() {
        return this.f66315f;
    }

    public final File b() {
        return new File(this.f66310a);
    }

    public final String c() {
        return this.f66311b;
    }

    public final String d() {
        return this.f66310a;
    }

    public final long e() {
        return this.f66312c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b0)) {
            return false;
        }
        b0 b0Var = (b0) obj;
        return p003kotlin.jvm.internal.v.c(this.f66310a, b0Var.f66310a) && p003kotlin.jvm.internal.v.c(this.f66311b, b0Var.f66311b) && this.f66312c == b0Var.f66312c && this.f66313d == b0Var.f66313d && this.f66314e == b0Var.f66314e && this.f66315f == b0Var.f66315f;
    }

    public int hashCode() {
        return (((((((((this.f66310a.hashCode() * 31) + this.f66311b.hashCode()) * 31) + Long.hashCode(this.f66312c)) * 31) + Long.hashCode(this.f66313d)) * 31) + Boolean.hashCode(this.f66314e)) * 31) + this.f66315f.hashCode();
    }

    public String toString() {
        return "JunkScanItem(path=" + this.f66310a + ", name=" + this.f66311b + ", size=" + this.f66312c + ", lastModified=" + this.f66313d + ", isDirectory=" + this.f66314e + ", category=" + this.f66315f + ")";
    }

    public static final class a {
        public /* synthetic */ a(p003kotlin.jvm.internal.m mVar) {
            this();
        }

        public final b0 a(File file, com.neeeex.similar3p.junk.a aVar) throws IOException {
            m0.a("ZlYoSw==\n", "AD9ELid5oN4=\n");
            file.getClass();
            m0.a("vvo1gXl9Q3E=\n", "3ZtB5B4SMQg=\n");
            aVar.getClass();
            File canonicalFile = file.getCanonicalFile();
            m0.a("ZR3T/xPSXoprG8bQNNVdgSpWiZJb\n", "AninvHK8MeQ=\n");
            canonicalFile.getClass();
            return b(canonicalFile, aVar);
        }

        public final b0 b(File file, com.neeeex.similar3p.junk.a aVar) {
            String path = file.getPath();
            m0.a("utQCo0NNnznzn1ja\n", "3bF28yI59xE=\n");
            path.getClass();
            String name = file.getName();
            if (name.length() == 0) {
                name = null;
            }
            if (name == null) {
                name = file.getPath();
            }
            String str = name;
            str.getClass();
            File file2 = file.isFile() ? file : null;
            return new b0(path, str, file2 != null ? file2.length() : 0L, file.lastModified(), file.isDirectory(), aVar);
        }

        public a() {
        }
    }
}