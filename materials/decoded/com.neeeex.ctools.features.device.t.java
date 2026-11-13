package com.neeeex.ctools.features.device;

import com.neeeex.eraser.m0;
import java.util.Map;

/* JADX INFO: loaded from: classes7.dex */
public final class t {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f64321a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f64322b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f64323c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final u f64324d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final u f64325e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final v f64326f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Map f64327g;

    public t(String str, String str2, int i10, u uVar, u uVar2, v vVar, Map map) {
        "modelName" /* decoded XOR */;
        str.getClass();
        "androidRelease" /* decoded XOR */;
        str2.getClass();
        "memory" /* decoded XOR */;
        uVar.getClass();
        "storage" /* decoded XOR */;
        uVar2.getClass();
        "screen" /* decoded XOR */;
        vVar.getClass();
        "sensorSupport" /* decoded XOR */;
        map.getClass();
        this.f64321a = str;
        this.f64322b = str2;
        this.f64323c = i10;
        this.f64324d = uVar;
        this.f64325e = uVar2;
        this.f64326f = vVar;
        this.f64327g = map;
    }

    public final String a() {
        return this.f64322b;
    }

    public final u b() {
        return this.f64324d;
    }

    public final String c() {
        return this.f64321a;
    }

    public final v d() {
        return this.f64326f;
    }

    public final Map e() {
        return this.f64327g;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof t)) {
            return false;
        }
        t tVar = (t) obj;
        return p003kotlin.jvm.internal.v.c(this.f64321a, tVar.f64321a) && p003kotlin.jvm.internal.v.c(this.f64322b, tVar.f64322b) && this.f64323c == tVar.f64323c && p003kotlin.jvm.internal.v.c(this.f64324d, tVar.f64324d) && p003kotlin.jvm.internal.v.c(this.f64325e, tVar.f64325e) && p003kotlin.jvm.internal.v.c(this.f64326f, tVar.f64326f) && p003kotlin.jvm.internal.v.c(this.f64327g, tVar.f64327g);
    }

    public final u f() {
        return this.f64325e;
    }

    public int hashCode() {
        return (((((((((((this.f64321a.hashCode() * 31) + this.f64322b.hashCode()) * 31) + Integer.hashCode(this.f64323c)) * 31) + this.f64324d.hashCode()) * 31) + this.f64325e.hashCode()) * 31) + this.f64326f.hashCode()) * 31) + this.f64327g.hashCode();
    }

    public String toString() {
        return "DeviceStatusSnapshot(modelName=" + this.f64321a + ", androidRelease=" + this.f64322b + ", sdkInt=" + this.f64323c + ", memory=" + this.f64324d + ", storage=" + this.f64325e + ", screen=" + this.f64326f + ", sensorSupport=" + this.f64327g + ")";
    }
}