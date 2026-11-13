package com.neeeex.ctools.features.photocompressor.detail;

import android.net.Uri;
import com.neeeex.eraser.m0;
import p003kotlin.jvm.internal.v;

/* JADX INFO: loaded from: classes7.dex */
public interface h {

    public static final class a implements h {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f64703a = new a();

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof a);
        }

        public int hashCode() {
            return -1134071820;
        }

        public String toString() {
            return m0.a("V9TIJU5PSNpmzNMtRlFU8Q==\n", "Fri6QC8rMZU=\n");
        }
    }

    public static final class b implements h {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final b f64704a = new b();

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof b);
        }

        public int hashCode() {
            return -1722256578;
        }

        public String toString() {
            return m0.a("xdj/VsCCOYbv1/Q=\n", "hrmTNbXuWPI=\n");
        }
    }

    public static final class c implements h {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f64705a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final boolean f64706b;

        public c(int i10, boolean z10) {
            this.f64705a = i10;
            this.f64706b = z10;
        }

        public final boolean a() {
            return this.f64706b;
        }

        public final int b() {
            return this.f64705a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            return this.f64705a == cVar.f64705a && this.f64706b == cVar.f64706b;
        }

        public int hashCode() {
            return (Integer.hashCode(this.f64705a) * 31) + Boolean.hashCode(this.f64706b);
        }

        public String toString() {
            return "Error(messageRes=" + this.f64705a + ", canRetrySave=" + this.f64706b + ")";
        }
    }

    public static final class d implements h {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final d f64707a = new d();

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof d);
        }

        public int hashCode() {
            return -1718692967;
        }

        public String toString() {
            return m0.a("OgN8Yw==\n", "c2cQBsduQCQ=\n");
        }
    }

    public static final class e implements h {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final com.neeeex.ctools.features.photocompressor.core.a f64708a;

        public e(com.neeeex.ctools.features.photocompressor.core.a aVar) {
            m0.a("fXp1s1Hl6Ys=\n", "HAgB2jeEiv8=\n");
            aVar.getClass();
            this.f64708a = aVar;
        }

        public final com.neeeex.ctools.features.photocompressor.core.a a() {
            return this.f64708a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof e) && v.c(this.f64708a, ((e) obj).f64708a);
        }

        public int hashCode() {
            return this.f64708a.hashCode();
        }

        public String toString() {
            return "Ready(artifact=" + this.f64708a + ")";
        }
    }

    public static final class f implements h {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final f f64709a = new f();

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof f);
        }

        public int hashCode() {
            return -2112673409;
        }

        public String toString() {
            return m0.a("c2vP3Kks\n", "IAq5tcdLFjs=\n");
        }
    }

    public static final class g implements h {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Uri f64710a;

        public g(Uri uri) {
            m0.a("RRdh\n", "MGUIG5aywOk=\n");
            uri.getClass();
            this.f64710a = uri;
        }

        public final Uri a() {
            return this.f64710a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof g) && v.c(this.f64710a, ((g) obj).f64710a);
        }

        public int hashCode() {
            return this.f64710a.hashCode();
        }

        public String toString() {
            return "Success(uri=" + this.f64710a + ")";
        }
    }
}