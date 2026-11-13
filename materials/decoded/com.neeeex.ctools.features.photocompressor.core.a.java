package com.neeeex.ctools.features.photocompressor.core;

import com.neeeex.eraser.m0;
import java.io.File;
import p003kotlin.jvm.internal.v;

/* JADX INFO: loaded from: classes7.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final File f64576a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f64577b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f64578c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f64579d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f64580e;

    public a(File file, String str, String str2, int i10, int i11) {
        "file" /* decoded XOR */;
        file.getClass();
        "displayName" /* decoded XOR */;
        str.getClass();
        "mimeType" /* decoded XOR */;
        str2.getClass();
        this.f64576a = file;
        this.f64577b = str;
        this.f64578c = str2;
        this.f64579d = i10;
        this.f64580e = i11;
    }

    public final String a() {
        return this.f64577b;
    }

    public final File b() {
        return this.f64576a;
    }

    public final String c() {
        return this.f64578c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return v.c(this.f64576a, aVar.f64576a) && v.c(this.f64577b, aVar.f64577b) && v.c(this.f64578c, aVar.f64578c) && this.f64579d == aVar.f64579d && this.f64580e == aVar.f64580e;
    }

    public int hashCode() {
        return (((((((this.f64576a.hashCode() * 31) + this.f64577b.hashCode()) * 31) + this.f64578c.hashCode()) * 31) + Integer.hashCode(this.f64579d)) * 31) + Integer.hashCode(this.f64580e);
    }

    public String toString() {
        return "CompressionArtifact(file=" + this.f64576a + ", displayName=" + this.f64577b + ", mimeType=" + this.f64578c + ", width=" + this.f64579d + ", height=" + this.f64580e + ")";
    }
}