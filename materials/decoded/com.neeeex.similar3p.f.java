package com.neeeex.similar3p;

import com.neeeex.eraser.m0;
import gl.b1;
import java.util.LinkedHashSet;
import java.util.Set;

/* JADX INFO: loaded from: classes7.dex */
public final class f {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final a f66270n = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f66271a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f66272b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f66273c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f66274d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final boolean f66275e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final boolean f66276f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final boolean f66277g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final long f66278h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final Set f66279i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final Set f66280j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final Set f66281k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final Set f66282l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final Set f66283m;

    public /* synthetic */ f(boolean z10, boolean z11, boolean z12, boolean z13, boolean z14, boolean z15, boolean z16, long j10, Set set, Set set2, Set set3, Set set4, Set set5, int i10, p003kotlin.jvm.internal.m mVar) {
        this((i10 & 1) != 0 ? true : z10, (i10 & 2) != 0 ? true : z11, (i10 & 4) != 0 ? true : z12, (i10 & 8) != 0 ? true : z13, (i10 & 16) != 0 ? true : z14, (i10 & 32) != 0 ? true : z15, (i10 & 64) == 0 ? z16 : true, (i10 & 128) != 0 ? 0L : j10, (i10 & 256) != 0 ? f66270n.f() : set, (i10 & 512) != 0 ? f66270n.g() : set2, (i10 & 1024) != 0 ? f66270n.e() : set3, (i10 & 2048) != 0 ? f66270n.h() : set4, (i10 & 4096) != 0 ? b1.f() : set5);
    }

    public final Set a() {
        return this.f66281k;
    }

    public final Set b() {
        return this.f66279i;
    }

    public final Set c() {
        return this.f66280j;
    }

    public final boolean d() {
        return this.f66275e;
    }

    public final boolean e() {
        return this.f66271a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        return this.f66271a == fVar.f66271a && this.f66272b == fVar.f66272b && this.f66273c == fVar.f66273c && this.f66274d == fVar.f66274d && this.f66275e == fVar.f66275e && this.f66276f == fVar.f66276f && this.f66277g == fVar.f66277g && this.f66278h == fVar.f66278h && p003kotlin.jvm.internal.v.c(this.f66279i, fVar.f66279i) && p003kotlin.jvm.internal.v.c(this.f66280j, fVar.f66280j) && p003kotlin.jvm.internal.v.c(this.f66281k, fVar.f66281k) && p003kotlin.jvm.internal.v.c(this.f66282l, fVar.f66282l) && p003kotlin.jvm.internal.v.c(this.f66283m, fVar.f66283m);
    }

    public final boolean f() {
        return this.f66273c;
    }

    public final boolean g() {
        return this.f66277g;
    }

    public final boolean h() {
        return this.f66274d;
    }

    public int hashCode() {
        return (((((((((((((((((((((((Boolean.hashCode(this.f66271a) * 31) + Boolean.hashCode(this.f66272b)) * 31) + Boolean.hashCode(this.f66273c)) * 31) + Boolean.hashCode(this.f66274d)) * 31) + Boolean.hashCode(this.f66275e)) * 31) + Boolean.hashCode(this.f66276f)) * 31) + Boolean.hashCode(this.f66277g)) * 31) + Long.hashCode(this.f66278h)) * 31) + this.f66279i.hashCode()) * 31) + this.f66280j.hashCode()) * 31) + this.f66281k.hashCode()) * 31) + this.f66282l.hashCode()) * 31) + this.f66283m.hashCode();
    }

    public final boolean i() {
        return this.f66272b;
    }

    public final boolean j() {
        return this.f66276f;
    }

    public final long k() {
        return this.f66278h;
    }

    public final Set l() {
        return this.f66282l;
    }

    public final Set m() {
        return this.f66283m;
    }

    public String toString() {
        return "JunkScanRules(includeAppLogs=" + this.f66271a + ", includeTempFiles=" + this.f66272b + ", includeCacheFiles=" + this.f66273c + ", includeNoMedia=" + this.f66274d + ", includeAppCacheDirs=" + this.f66275e + ", includeUninstalledAppDirs=" + this.f66276f + ", includeEmptyFolders=" + this.f66277g + ", minJunkFileSizeBytes=" + this.f66278h + ", extensionRules=" + this.f66279i + ", fileNameRules=" + this.f66280j + ", directoryNameRules=" + this.f66281k + ", pathKeywordRules=" + this.f66282l + ", whitelistPaths=" + this.f66283m + ")";
    }

    public static final class a {
        public /* synthetic */ a(p003kotlin.jvm.internal.m mVar) {
            this();
        }

        public final Set e() {
            return i("cache" /* decoded XOR */, "caches" /* decoded XOR */, "tmp" /* decoded XOR */, "temp" /* decoded XOR */, "logs" /* decoded XOR */, "log" /* decoded XOR */, "crash" /* decoded XOR */, "crashes" /* decoded XOR */, ".thumbnails" /* decoded XOR */, "thumbnails" /* decoded XOR */);
        }

        public final Set f() {
            return i("log" /* decoded XOR */, "tmp" /* decoded XOR */, "temp" /* decoded XOR */, "cache" /* decoded XOR */, "bak" /* decoded XOR */, "old" /* decoded XOR */, "dmp" /* decoded XOR */);
        }

        public final Set g() {
            return i(".nomedia" /* decoded XOR */, "thumbs.db" /* decoded XOR */);
        }

        public final Set h() {
            return i("/cache/" /* decoded XOR */, "/tmp/" /* decoded XOR */, "/temp/" /* decoded XOR */, "/logs/" /* decoded XOR */, "/log/" /* decoded XOR */);
        }

        public final Set i(String... strArr) {
            return (Set) gl.s.j1(strArr, new LinkedHashSet(strArr.length));
        }

        public a() {
        }
    }

    public f(boolean z10, boolean z11, boolean z12, boolean z13, boolean z14, boolean z15, boolean z16, long j10, Set set, Set set2, Set set3, Set set4, Set set5) {
        "extensionRules" /* decoded XOR */;
        set.getClass();
        "fileNameRules" /* decoded XOR */;
        set2.getClass();
        "directoryNameRules" /* decoded XOR */;
        set3.getClass();
        "pathKeywordRules" /* decoded XOR */;
        set4.getClass();
        "whitelistPaths" /* decoded XOR */;
        set5.getClass();
        this.f66271a = z10;
        this.f66272b = z11;
        this.f66273c = z12;
        this.f66274d = z13;
        this.f66275e = z14;
        this.f66276f = z15;
        this.f66277g = z16;
        this.f66278h = j10;
        this.f66279i = set;
        this.f66280j = set2;
        this.f66281k = set3;
        this.f66282l = set4;
        this.f66283m = set5;
    }
}