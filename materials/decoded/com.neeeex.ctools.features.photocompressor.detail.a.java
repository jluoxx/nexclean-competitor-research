package com.neeeex.ctools.features.photocompressor.detail;

import android.content.Context;
import android.content.Intent;
import com.neeeex.eraser.m0;
import gl.w;
import java.util.Iterator;
import java.util.List;
import p003kotlin.jvm.internal.v;

/* JADX INFO: loaded from: classes7.dex */
public final class a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final String f64679b = "ctools_photo_compressor_uri" /* decoded XOR */;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final String f64680c = "ctools_photo_compressor_display_name" /* decoded XOR */;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final String f64681d = "ctools_photo_compressor_size_bytes" /* decoded XOR */;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final String f64682e = "ctools_photo_compressor_mime_type" /* decoded XOR */;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final String f64683f = "ctools_photo_compressor_read_only" /* decoded XOR */;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final String f64684g = "com.neeeex.ctools.features.photocompressor.detail.PhotoCompressionNEEEEXActivity" /* decoded XOR */;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f64678a = new a();

    /* JADX INFO: renamed from: com.neeeex.ctools.features.photocompressor.detail.a$a, reason: collision with other inner class name */
    public interface InterfaceC0758a {

        /* JADX INFO: renamed from: com.neeeex.ctools.features.photocompressor.detail.a$a$a, reason: collision with other inner class name */
        public static final class C0759a implements InterfaceC0758a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final String f64685a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final boolean f64686b;

            public C0759a(String str, boolean z10) {
                "key" /* decoded XOR */;
                str.getClass();
                this.f64685a = str;
                this.f64686b = z10;
            }

            @Override // com.neeeex.ctools.features.photocompressor.detail.a.InterfaceC0758a
            public void a(Intent intent) {
                "intent" /* decoded XOR */;
                intent.getClass();
                intent.putExtra(this.f64685a, this.f64686b);
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof C0759a)) {
                    return false;
                }
                C0759a c0759a = (C0759a) obj;
                return v.c(this.f64685a, c0759a.f64685a) && this.f64686b == c0759a.f64686b;
            }

            public int hashCode() {
                return (this.f64685a.hashCode() * 31) + Boolean.hashCode(this.f64686b);
            }

            public String toString() {
                return "Flag(key=" + this.f64685a + ", value=" + this.f64686b + ")";
            }
        }

        /* JADX INFO: renamed from: com.neeeex.ctools.features.photocompressor.detail.a$a$b */
        public static final class b implements InterfaceC0758a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final String f64687a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final long f64688b;

            public b(String str, long j10) {
                "key" /* decoded XOR */;
                str.getClass();
                this.f64687a = str;
                this.f64688b = j10;
            }

            @Override // com.neeeex.ctools.features.photocompressor.detail.a.InterfaceC0758a
            public void a(Intent intent) {
                "intent" /* decoded XOR */;
                intent.getClass();
                intent.putExtra(this.f64687a, this.f64688b);
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof b)) {
                    return false;
                }
                b bVar = (b) obj;
                return v.c(this.f64687a, bVar.f64687a) && this.f64688b == bVar.f64688b;
            }

            public int hashCode() {
                return (this.f64687a.hashCode() * 31) + Long.hashCode(this.f64688b);
            }

            public String toString() {
                return "Number(key=" + this.f64687a + ", value=" + this.f64688b + ")";
            }
        }

        /* JADX INFO: renamed from: com.neeeex.ctools.features.photocompressor.detail.a$a$c */
        public static final class c implements InterfaceC0758a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final String f64689a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final String f64690b;

            public c(String str, String str2) {
                "key" /* decoded XOR */;
                str.getClass();
                "value" /* decoded XOR */;
                str2.getClass();
                this.f64689a = str;
                this.f64690b = str2;
            }

            @Override // com.neeeex.ctools.features.photocompressor.detail.a.InterfaceC0758a
            public void a(Intent intent) {
                "intent" /* decoded XOR */;
                intent.getClass();
                intent.putExtra(this.f64689a, this.f64690b);
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof c)) {
                    return false;
                }
                c cVar = (c) obj;
                return v.c(this.f64689a, cVar.f64689a) && v.c(this.f64690b, cVar.f64690b);
            }

            public int hashCode() {
                return (this.f64689a.hashCode() * 31) + this.f64690b.hashCode();
            }

            public String toString() {
                return "Text(key=" + this.f64689a + ", value=" + this.f64690b + ")";
            }
        }

        void a(Intent intent);
    }

    public final Intent a(Context context, com.neeeex.ctools.features.photocompressor.data.c cVar) {
        "context" /* decoded XOR */;
        context.getClass();
        "item" /* decoded XOR */;
        cVar.getClass();
        Intent className = new Intent().setClassName(context, f64684g);
        "setClassName(...)" /* decoded XOR */;
        className.getClass();
        Iterator it = b(cVar).iterator();
        while (it.hasNext()) {
            ((InterfaceC0758a) it.next()).a(className);
        }
        return className;
    }

    public final List b(com.neeeex.ctools.features.photocompressor.data.c cVar) {
        String str = f64679b;
        String string = cVar.e().toString();
        "toString(...)" /* decoded XOR */;
        string.getClass();
        return w.p(new InterfaceC0758a.c(str, string), new InterfaceC0758a.c(f64680c, cVar.b()), new InterfaceC0758a.b(f64681d, cVar.d()), new InterfaceC0758a.c(f64682e, cVar.c()), new InterfaceC0758a.C0759a(f64683f, cVar.f()));
    }
}