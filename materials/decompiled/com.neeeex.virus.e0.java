package com.neeeex.virus;

import android.os.Parcel;
import android.os.Parcelable;
import com.neeeex.eraser.m0;
import p003kotlin.text.k0;

/* JADX INFO: loaded from: classes7.dex */
public final class e0 implements Parcelable {
    public static final Parcelable.Creator<e0> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f66671a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f66672b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f66673c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f66674d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final long f66675e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final boolean f66676f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final String f66677g;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final e0 createFromParcel(Parcel parcel) {
            m0.a("sqLKkuFp\n", "wsO48YQFrhI=\n");
            parcel.getClass();
            return new e0(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt(), parcel.readLong(), parcel.readInt() != 0, parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final e0[] newArray(int i10) {
            return new e0[i10];
        }
    }

    public e0(String str, String str2, String str3, int i10, long j10, boolean z10, String str4) {
        m0.a("um1cciIDGFGrYVo=\n", "ygw/GUNkfR8=\n");
        str.getClass();
        m0.a("SywS3dxTxg==\n", "Klxik70+oys=\n");
        str2.getClass();
        m0.a("Qtd1hhquyw==\n", "I6ce1nvaoxQ=\n");
        str3.getClass();
        m0.a("YiglpR2ivqdx\n", "FEFX0G7s38o=\n");
        str4.getClass();
        this.f66671a = str;
        this.f66672b = str2;
        this.f66673c = str3;
        this.f66674d = i10;
        this.f66675e = j10;
        this.f66676f = z10;
        this.f66677g = str4;
    }

    public final f0 a() {
        return g0.f66682a.a(this.f66676f, this.f66673c);
    }

    public final String b() {
        return this.f66673c;
    }

    public final String c() {
        return this.f66672b;
    }

    public final String d() {
        return this.f66671a;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final h0 e() {
        return g0.f66682a.c(this.f66674d);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e0)) {
            return false;
        }
        e0 e0Var = (e0) obj;
        return p003kotlin.jvm.internal.v.c(this.f66671a, e0Var.f66671a) && p003kotlin.jvm.internal.v.c(this.f66672b, e0Var.f66672b) && p003kotlin.jvm.internal.v.c(this.f66673c, e0Var.f66673c) && this.f66674d == e0Var.f66674d && this.f66675e == e0Var.f66675e && this.f66676f == e0Var.f66676f && p003kotlin.jvm.internal.v.c(this.f66677g, e0Var.f66677g);
    }

    public final long f() {
        return this.f66675e;
    }

    public final String g() {
        if (a() == f0.UNINSTALL && !k0.r0(this.f66671a)) {
            return this.f66671a;
        }
        String str = this.f66673c;
        return k0.r0(str) ? this.f66671a : str;
    }

    public int hashCode() {
        return (((((((((((this.f66671a.hashCode() * 31) + this.f66672b.hashCode()) * 31) + this.f66673c.hashCode()) * 31) + Integer.hashCode(this.f66674d)) * 31) + Long.hashCode(this.f66675e)) * 31) + Boolean.hashCode(this.f66676f)) * 31) + this.f66677g.hashCode();
    }

    public String toString() {
        return "VirusThreat(packageName=" + this.f66671a + ", appName=" + this.f66672b + ", apkPath=" + this.f66673c + ", score=" + this.f66674d + ", sizeBytes=" + this.f66675e + ", installed=" + this.f66676f + ", virusName=" + this.f66677g + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        m0.a("Kn5r0g==\n", "ThsYphRBo3A=\n");
        parcel.getClass();
        parcel.writeString(this.f66671a);
        parcel.writeString(this.f66672b);
        parcel.writeString(this.f66673c);
        parcel.writeInt(this.f66674d);
        parcel.writeLong(this.f66675e);
        parcel.writeInt(this.f66676f ? 1 : 0);
        parcel.writeString(this.f66677g);
    }
}