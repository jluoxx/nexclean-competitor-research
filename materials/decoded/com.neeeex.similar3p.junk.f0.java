package com.neeeex.similar3p.junk;

import com.neeeex.eraser.m0;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes7.dex */
public final class f0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f66339a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f66340b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Map f66341c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Set f66342d;

    public f0(String str, long j10, Map map, Set set) {
        "currentPath" /* decoded XOR */;
        str.getClass();
        "totals" /* decoded XOR */;
        map.getClass();
        "completedCategories" /* decoded XOR */;
        set.getClass();
        this.f66339a = str;
        this.f66340b = j10;
        this.f66341c = map;
        this.f66342d = set;
    }

    public final Set a() {
        return this.f66342d;
    }

    public final String b() {
        return this.f66339a;
    }

    public final long c() {
        return this.f66340b;
    }

    public final Map d() {
        return this.f66341c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f0)) {
            return false;
        }
        f0 f0Var = (f0) obj;
        return p003kotlin.jvm.internal.v.c(this.f66339a, f0Var.f66339a) && this.f66340b == f0Var.f66340b && p003kotlin.jvm.internal.v.c(this.f66341c, f0Var.f66341c) && p003kotlin.jvm.internal.v.c(this.f66342d, f0Var.f66342d);
    }

    public int hashCode() {
        return (((((this.f66339a.hashCode() * 31) + Long.hashCode(this.f66340b)) * 31) + this.f66341c.hashCode()) * 31) + this.f66342d.hashCode();
    }

    public String toString() {
        return "JunkScanSnapshot(currentPath=" + this.f66339a + ", totalBytes=" + this.f66340b + ", totals=" + this.f66341c + ", completedCategories=" + this.f66342d + ")";
    }
}