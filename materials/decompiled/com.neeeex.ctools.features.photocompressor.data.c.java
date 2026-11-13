package com.neeeex.ctools.features.photocompressor.data;

import android.net.Uri;
import com.neeeex.eraser.m0;
import p003kotlin.jvm.internal.v;

/* JADX INFO: loaded from: classes7.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Uri f64613a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f64614b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f64615c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f64616d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f64617e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f64618f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final long f64619g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final boolean f64620h;

    public c(Uri uri, String str, long j10, String str2, int i10, int i11, long j11, boolean z10) {
        m0.a("pHF3\n", "0QMeqx5kpKc=\n");
        uri.getClass();
        m0.a("6kECDNS3KD/vRRQ=\n", "jihxfLjWUXE=\n");
        str.getClass();
        m0.a("IdreORV5JFM=\n", "TLOzXEEAVDY=\n");
        str2.getClass();
        this.f64613a = uri;
        this.f64614b = str;
        this.f64615c = j10;
        this.f64616d = str2;
        this.f64617e = i10;
        this.f64618f = i11;
        this.f64619g = j11;
        this.f64620h = z10;
    }

    public final long a() {
        return this.f64619g;
    }

    public final String b() {
        return this.f64614b;
    }

    public final String c() {
        return this.f64616d;
    }

    public final long d() {
        return this.f64615c;
    }

    public final Uri e() {
        return this.f64613a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return v.c(this.f64613a, cVar.f64613a) && v.c(this.f64614b, cVar.f64614b) && this.f64615c == cVar.f64615c && v.c(this.f64616d, cVar.f64616d) && this.f64617e == cVar.f64617e && this.f64618f == cVar.f64618f && this.f64619g == cVar.f64619g && this.f64620h == cVar.f64620h;
    }

    public final boolean f() {
        return this.f64620h;
    }

    public int hashCode() {
        return (((((((((((((this.f64613a.hashCode() * 31) + this.f64614b.hashCode()) * 31) + Long.hashCode(this.f64615c)) * 31) + this.f64616d.hashCode()) * 31) + Integer.hashCode(this.f64617e)) * 31) + Integer.hashCode(this.f64618f)) * 31) + Long.hashCode(this.f64619g)) * 31) + Boolean.hashCode(this.f64620h);
    }

    public String toString() {
        return "PhotoMediaItem(uri=" + this.f64613a + ", displayName=" + this.f64614b + ", sizeBytes=" + this.f64615c + ", mimeType=" + this.f64616d + ", width=" + this.f64617e + ", height=" + this.f64618f + ", dateAddedSeconds=" + this.f64619g + ", isCompressed=" + this.f64620h + ")";
    }
}