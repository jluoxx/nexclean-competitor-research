package com.neeeex.ctools.features.photocompressor.data;

import am.q;
import android.content.ContentResolver;
import android.content.ContentUris;
import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.os.Build;
import android.provider.MediaStore;
import com.neeeex.eraser.m0;
import fl.v;
import gl.b1;
import gl.g0;
import gl.w;
import gq.v0;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Set;
import kotlinx.coroutines.f1;
import kotlinx.coroutines.i;
import kotlinx.coroutines.p0;
import ll.m;
import p003kotlin.jvm.functions.Function1;
import p003kotlin.text.e0;
import p003kotlin.text.k0;
import tl.n;

/* JADX INFO: loaded from: classes7.dex */
public final class d {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final a f64621b = new a(null);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Set f64622c = b1.k(m0.a("DDh2XeoAHngD\n", "ZVUXOo8veRE=\n"), m0.a("ZfF1ohGpsoNrt2yoGA==\n", "DJwUxXSGwfU=\n"));

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ContentResolver f64623a;

    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Function1 f64624a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f64625b;

        public b(Function1 function1) {
            m0.a("qBm1NZR5Qo8=\n", "y3jZWfYYIeQ=\n");
            function1.getClass();
            this.f64624a = function1;
            this.f64625b = -1;
        }

        public final void a(int i10) {
            int iP = q.p(i10, 0, 96);
            if (iP == this.f64625b) {
                return;
            }
            this.f64625b = iP;
            this.f64624a.invoke(Integer.valueOf(iP));
        }
    }

    public final class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final long f64626a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f64627b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final long f64628c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final String f64629d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final int f64630e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final int f64631f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final long f64632g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final String f64633h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public final /* synthetic */ d f64634i;

        public c(d dVar, long j10, String str, long j11, String str2, int i10, int i11, long j12, String str3) {
            m0.a("5zCOJw==\n", "ilnjQgv9AQ4=\n");
            str2.getClass();
            this.f64634i = dVar;
            this.f64626a = j10;
            this.f64627b = str;
            this.f64628c = j11;
            this.f64629d = str2;
            this.f64630e = i10;
            this.f64631f = i11;
            this.f64632g = j12;
            this.f64633h = str3;
        }

        public final boolean a() {
            return this.f64626a > 0 && this.f64628c > 0 && this.f64634i.f(this.f64629d);
        }

        public final com.neeeex.ctools.features.photocompressor.data.c b(boolean z10) {
            Uri uriWithAppendedId = ContentUris.withAppendedId(MediaStore.Images.Media.EXTERNAL_CONTENT_URI, this.f64626a);
            m0.a("J2727b0rGz4+Y+fhtT9DdX4pqw==\n", "UAeChfxba1s=\n");
            uriWithAppendedId.getClass();
            String str = this.f64627b;
            if (str == null) {
                str = "";
            }
            if (k0.r0(str)) {
                str = "image_" + this.f64626a;
            }
            return new com.neeeex.ctools.features.photocompressor.data.c(uriWithAppendedId, str, this.f64628c, this.f64629d, q.f(this.f64630e, 0), q.f(this.f64631f, 0), q.g(this.f64632g, 0L), com.neeeex.ctools.features.photocompressor.data.e.f64647a.b(z10 ? this.f64633h : null, z10 ? null : this.f64633h));
        }
    }

    /* JADX INFO: renamed from: com.neeeex.ctools.features.photocompressor.data.d$d, reason: collision with other inner class name */
    public final class C0755d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final boolean f64635a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Cursor f64636b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final int f64637c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final int f64638d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final int f64639e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final int f64640f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final int f64641g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final int f64642h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public final int f64643i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public final int f64644j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public final /* synthetic */ d f64645k;

        public C0755d(d dVar, Cursor cursor, String str, boolean z10) {
            m0.a("zsEq6YEz\n", "rbRYmu5Bvm8=\n");
            cursor.getClass();
            m0.a("WsVDEZ5HdwhHyg==\n", "KqQ3ed0oG30=\n");
            str.getClass();
            this.f64645k = dVar;
            this.f64635a = z10;
            this.f64636b = cursor;
            this.f64637c = cursor.getColumnIndexOrThrow(m0.a("iWQ6\n", "1g1eChQ/y0M=\n"));
            this.f64638d = cursor.getColumnIndexOrThrow(m0.a("fVqbE5OC/d19UJMNhg==\n", "Ij7yYOPunKQ=\n"));
            this.f64639e = cursor.getColumnIndexOrThrow(m0.a("vMnSi1Q=\n", "47q78TG6fvg=\n"));
            this.f64640f = cursor.getColumnIndexOrThrow(m0.a("eoB2MjiNX1hy\n", "F+kbV2f5Jig=\n"));
            this.f64641g = cursor.getColumnIndexOrThrow(m0.a("+OOHPfw=\n", "j4rjSZThs+4=\n"));
            this.f64642h = cursor.getColumnIndexOrThrow(m0.a("sLE8czJ1\n", "2NRVFFoByCQ=\n"));
            this.f64643i = cursor.getColumnIndexOrThrow(m0.a("cqFQDuAz9XhzpA==\n", "FsAka79SkRw=\n"));
            this.f64644j = cursor.getColumnIndexOrThrow(str);
        }

        public final com.neeeex.ctools.features.photocompressor.data.c a() {
            d dVar = this.f64645k;
            long j10 = this.f64636b.getLong(this.f64637c);
            String string = this.f64636b.getString(this.f64638d);
            long j11 = this.f64636b.getLong(this.f64639e);
            String string2 = this.f64636b.getString(this.f64640f);
            if (string2 == null) {
                string2 = "";
            }
            c cVar = new c(dVar, j10, string, j11, string2, this.f64636b.getInt(this.f64641g), this.f64636b.getInt(this.f64642h), this.f64636b.getLong(this.f64643i), this.f64636b.getString(this.f64644j));
            if (cVar.a()) {
                return cVar.b(this.f64635a);
            }
            return null;
        }
    }

    public static final class e implements Comparator {
        @Override // java.util.Comparator
        public final int compare(Object obj, Object obj2) {
            return jl.c.e(Long.valueOf(((com.neeeex.ctools.features.photocompressor.data.c) obj2).a()), Long.valueOf(((com.neeeex.ctools.features.photocompressor.data.c) obj).a()));
        }
    }

    public static final class f implements Comparator {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Comparator f64646a;

        public f(Comparator comparator) {
            this.f64646a = comparator;
        }

        @Override // java.util.Comparator
        public final int compare(Object obj, Object obj2) {
            int iCompare = this.f64646a.compare(obj, obj2);
            return iCompare != 0 ? iCompare : jl.c.e(((com.neeeex.ctools.features.photocompressor.data.c) obj).e().toString(), ((com.neeeex.ctools.features.photocompressor.data.c) obj2).e().toString());
        }
    }

    public static final class g extends m implements n {
        final /* synthetic */ Function1 $onProgress;
        int label;
        final /* synthetic */ d this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(Function1 function1, d dVar, kl.f<? super g> fVar) {
            super(2, fVar);
            this.$onProgress = function1;
            this.this$0 = dVar;
        }

        @Override // ll.a
        public final kl.f<fl.m0> create(Object obj, kl.f<?> fVar) {
            return new g(this.$onProgress, this.this$0, fVar);
        }

        @Override // tl.n
        public final Object invoke(p0 p0Var, kl.f<? super com.neeeex.ctools.features.photocompressor.data.b> fVar) {
            return ((g) create(p0Var, fVar)).invokeSuspend(fl.m0.f80959a);
        }

        @Override // ll.a
        public final Object invokeSuspend(Object obj) {
            String str;
            String str2;
            p003kotlin.coroutines.intrinsics.c.f();
            if (this.label != 0) {
                v0.a(m0.a("VXCk/I62AbwRY63j268LuxZzrfbBsAu8EXim5sGpC7sWZqHkxuIN80R+veTHrAs=\n", "NhHIkK7Cbpw=\n"));
                return null;
            }
            v.b(obj);
            ArrayList arrayList = new ArrayList();
            b bVar = new b(this.$onProgress);
            bVar.a(2);
            Uri uri = MediaStore.Images.Media.EXTERNAL_CONTENT_URI;
            int i10 = 0;
            boolean z10 = Build.VERSION.SDK_INT >= 29;
            if (z10) {
                str = "rttlAsm3py2DzmgX1Q==\n";
                str2 = "3L4JY73e0Ug=\n";
            } else {
                str = "Qtao8rg=\n";
                str2 = "HbLJhtnDsQE=\n";
            }
            String strA = m0.a(str, str2);
            Cursor cursorQuery = this.this$0.f64623a.query(uri, this.this$0.h(strA), null, null, m0.a("GLKupFwY8MEZt/qFRirX\n", "fNPawQN5lKU=\n"));
            if (cursorQuery != null) {
                Cursor cursor = cursorQuery;
                d dVar = this.this$0;
                try {
                    Cursor cursor2 = cursor;
                    int iF = q.f(cursor2.getCount(), 1);
                    bVar.a(8);
                    C0755d c0755d = new C0755d(dVar, cursor2, strA, z10);
                    while (cursor2.moveToNext()) {
                        i10++;
                        bVar.a(((i10 * 88) / iF) + 8);
                        com.neeeex.ctools.features.photocompressor.data.c cVarA = c0755d.a();
                        if (cVarA != null) {
                            ll.b.a(arrayList.add(cVarA));
                        }
                    }
                    fl.m0 m0Var = fl.m0.f80959a;
                    ql.c.a(cursor, null);
                } catch (Throwable th2) {
                    try {
                        throw th2;
                    } catch (Throwable th3) {
                        ql.c.a(cursor, th2);
                        throw th3;
                    }
                }
            }
            bVar.a(96);
            return this.this$0.e(arrayList);
        }
    }

    public d(Context context) {
        m0.a("mTMqiD4R1A==\n", "+lxE/FtpoDU=\n");
        context.getClass();
        this.f64623a = context.getApplicationContext().getContentResolver();
    }

    public final com.neeeex.ctools.features.photocompressor.data.b e(List list) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Object obj : list) {
            Boolean boolValueOf = Boolean.valueOf(((com.neeeex.ctools.features.photocompressor.data.c) obj).f());
            Object arrayList = linkedHashMap.get(boolValueOf);
            if (arrayList == null) {
                arrayList = new ArrayList();
                linkedHashMap.put(boolValueOf, arrayList);
            }
            ((List) arrayList).add(obj);
        }
        f fVar = new f(new e());
        List listM = (List) linkedHashMap.get(Boolean.FALSE);
        if (listM == null) {
            listM = w.m();
        }
        List listV0 = g0.V0(listM, fVar);
        List listM2 = (List) linkedHashMap.get(Boolean.TRUE);
        if (listM2 == null) {
            listM2 = w.m();
        }
        return new com.neeeex.ctools.features.photocompressor.data.b(listV0, g0.V0(listM2, fVar));
    }

    public final boolean f(String str) {
        return e0.U(str, m0.a("q8ehTMmn\n", "wqrAK6yIt6E=\n"), false, 2, null) && !f64622c.contains(str);
    }

    public final Object g(Function1 function1, kl.f fVar) {
        return i.g(f1.b(), new g(function1, this, null), fVar);
    }

    public final String[] h(String str) {
        return new String[]{m0.a("mJh5\n", "x/Ed8eX4lX0=\n"), m0.a("UDhMdF8K31NQMkRqSg==\n", "D1wlBy9mvio=\n"), m0.a("aHw/4yg=\n", "Nw9WmU1Q8Dc=\n"), m0.a("aH9ziUjHw75g\n", "BRYe7Bezus4=\n"), m0.a("l5KhSKI=\n", "4PvFPMqr6Fc=\n"), m0.a("E88kTShm\n", "e6pNKkASErU=\n"), m0.a("0yNqrXdUnxTSJg==\n", "t0IeyCg1+3A=\n"), str};
    }

    public static final class a {
        public /* synthetic */ a(p003kotlin.jvm.internal.m mVar) {
            this();
        }

        public a() {
        }
    }
}