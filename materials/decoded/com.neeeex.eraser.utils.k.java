package com.neeeex.eraser.utils;

import android.net.Uri;
import com.neeeex.eraser.m0;

/* JADX INFO: loaded from: classes7.dex */
public final class k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f66186a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Uri f66187b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f66188c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f66189d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final boolean f66190e;

    public k(long j10, Uri uri, String str, long j11, boolean z10) {
        "uri" /* decoded XOR */;
        uri.getClass();
        "pathHint" /* decoded XOR */;
        str.getClass();
        this.f66186a = j10;
        this.f66187b = uri;
        this.f66188c = str;
        this.f66189d = j11;
        this.f66190e = z10;
    }

    public final long a() {
        return this.f66189d;
    }

    public final long b() {
        return this.f66186a;
    }

    public final String c() {
        return this.f66188c;
    }

    public final Uri d() {
        return this.f66187b;
    }

    public final boolean e() {
        return this.f66190e;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k)) {
            return false;
        }
        k kVar = (k) obj;
        return this.f66186a == kVar.f66186a && p003kotlin.jvm.internal.v.c(this.f66187b, kVar.f66187b) && p003kotlin.jvm.internal.v.c(this.f66188c, kVar.f66188c) && this.f66189d == kVar.f66189d && this.f66190e == kVar.f66190e;
    }

    public int hashCode() {
        return (((((((Long.hashCode(this.f66186a) * 31) + this.f66187b.hashCode()) * 31) + this.f66188c.hashCode()) * 31) + Long.hashCode(this.f66189d)) * 31) + Boolean.hashCode(this.f66190e);
    }

    public String toString() {
        return "ObservedImage(id=" + this.f66186a + ", uri=" + this.f66187b + ", pathHint=" + this.f66188c + ", dateAddedMillis=" + this.f66189d + ", isPending=" + this.f66190e + ")";
    }
}