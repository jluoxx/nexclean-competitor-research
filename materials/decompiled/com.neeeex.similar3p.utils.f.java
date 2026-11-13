package com.neeeex.similar3p.utils;

import am.q;
import android.content.Context;
import android.content.pm.PackageManager;
import android.database.Cursor;
import android.graphics.Bitmap;
import android.os.Build;
import android.os.Environment;
import android.os.StatFs;
import android.provider.MediaStore;
import com.neeeex.eraser.R$string;
import com.neeeex.eraser.m0;
import fl.t;
import fl.u;
import fl.y;
import fl.z;
import gl.a1;
import gl.b1;
import gl.c1;
import gl.g0;
import gl.q0;
import gl.s;
import gl.w;
import gl.x;
import gq.v0;
import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.security.MessageDigest;
import java.text.Normalizer;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicInteger;
import kotlinx.coroutines.f1;
import kotlinx.coroutines.l2;
import kotlinx.coroutines.p0;
import p003kotlin.jvm.functions.Function1;
import p003kotlin.jvm.internal.v;
import p003kotlin.text.k0;

/* JADX INFO: loaded from: classes7.dex */
public final class f {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final Set f66555e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final Set f66556f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final Set f66557g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final Set f66558h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final Set f66559i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final Set f66560j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final Set f66561k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final Set f66562l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final Set f66563m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final Set f66564n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final Set f66565o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final Set f66566p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final Set f66567q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final Set f66568r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final Set f66569s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final Set f66570t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public static final Set f66571u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final Set f66572v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static final Set f66573w;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public static final Set f66575y;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f66576a;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public static final String f66574x = m0.a("P5oz\n", "XupY39V+ex4=\n");

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final a f66552b = new a(null);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Set f66553c = b1.k(yi.f.IMAGE, yi.f.VIDEO);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final p003kotlin.text.p f66554d = new p003kotlin.text.p(m0.a("nZ8A0jsB\n", "we97n0YqxlA=\n"));

    public interface c {

        public static final class a implements c {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final a f66581a = new a();

            public boolean equals(Object obj) {
                return this == obj || (obj instanceof a);
            }

            public int hashCode() {
                return 1614057875;
            }

            public String toString() {
                return m0.a("zKMW9o8B\n", "hcR4mf1k8nY=\n");
            }
        }

        public static final class b implements c {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final File f66582a;

            public b(File file) {
                m0.a("SwNNVLIsuvVW\n", "L2o/MdFY1Yc=\n");
                file.getClass();
                this.f66582a = file;
            }

            public final File a() {
                return this.f66582a;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof b) && v.c(this.f66582a, ((b) obj).f66582a);
            }

            public int hashCode() {
                return this.f66582a.hashCode();
            }

            public String toString() {
                return "RecordDirectory(directory=" + this.f66582a + ")";
            }
        }

        /* JADX INFO: renamed from: com.neeeex.similar3p.utils.f$c$c, reason: collision with other inner class name */
        public static final class C0818c implements c {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final File f66583a;

            public C0818c(File file) {
                m0.a("Yv9zcg==\n", "BJYfF6n+dY0=\n");
                file.getClass();
                this.f66583a = file;
            }

            public final File a() {
                return this.f66583a;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof C0818c) && v.c(this.f66583a, ((C0818c) obj).f66583a);
            }

            public int hashCode() {
                return this.f66583a.hashCode();
            }

            public String toString() {
                return "RecordFile(file=" + this.f66583a + ")";
            }
        }

        public static final class d implements c {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final File f66584a;

            public d(File file) {
                m0.a("97TlxLV2T0rq\n", "k92XodYCIDg=\n");
                file.getClass();
                this.f66584a = file;
            }

            public final File a() {
                return this.f66584a;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof d) && v.c(this.f66584a, ((d) obj).f66584a);
            }

            public int hashCode() {
                return this.f66584a.hashCode();
            }

            public String toString() {
                return "VisitDirectory(directory=" + this.f66584a + ")";
            }
        }
    }

    public static final class e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final boolean f66588a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final boolean f66589b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final boolean f66590c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final boolean f66591d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final boolean f66592e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final boolean f66593f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final boolean f66594g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final long f66595h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public final Set f66596i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public final Set f66597j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public final Set f66598k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public final Set f66599l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public final Set f66600m;

        public e(boolean z10, boolean z11, boolean z12, boolean z13, boolean z14, boolean z15, boolean z16, long j10, Set set, Set set2, Set set3, Set set4, Set set5) {
            m0.a("3JZv8Q==\n", "ue4bgiWlU/w=\n");
            set.getClass();
            m0.a("GCFHdPg=\n", "dkAqEYvUQQQ=\n");
            set2.getClass();
            m0.a("5n1Dyg==\n", "ghQxuVQxdi4=\n");
            set3.getClass();
            m0.a("suUdMAHJ9bw=\n", "woRpWEqsjM8=\n");
            set4.getClass();
            m0.a("SEkfmw==\n", "Oyh5/niDOdQ=\n");
            set5.getClass();
            this.f66588a = z10;
            this.f66589b = z11;
            this.f66590c = z12;
            this.f66591d = z13;
            this.f66592e = z14;
            this.f66593f = z15;
            this.f66594g = z16;
            this.f66595h = j10;
            this.f66596i = set;
            this.f66597j = set2;
            this.f66598k = set3;
            this.f66599l = set4;
            this.f66600m = set5;
        }

        public final boolean a() {
            return this.f66592e;
        }

        public final boolean b() {
            return this.f66590c;
        }

        public final Set c() {
            return this.f66598k;
        }

        public final boolean d() {
            return this.f66594g;
        }

        public final Set e() {
            return this.f66596i;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof e)) {
                return false;
            }
            e eVar = (e) obj;
            return this.f66588a == eVar.f66588a && this.f66589b == eVar.f66589b && this.f66590c == eVar.f66590c && this.f66591d == eVar.f66591d && this.f66592e == eVar.f66592e && this.f66593f == eVar.f66593f && this.f66594g == eVar.f66594g && this.f66595h == eVar.f66595h && v.c(this.f66596i, eVar.f66596i) && v.c(this.f66597j, eVar.f66597j) && v.c(this.f66598k, eVar.f66598k) && v.c(this.f66599l, eVar.f66599l) && v.c(this.f66600m, eVar.f66600m);
        }

        public final boolean f() {
            return this.f66588a;
        }

        public final long g() {
            return this.f66595h;
        }

        public final Set h() {
            return this.f66597j;
        }

        public int hashCode() {
            return (((((((((((((((((((((((Boolean.hashCode(this.f66588a) * 31) + Boolean.hashCode(this.f66589b)) * 31) + Boolean.hashCode(this.f66590c)) * 31) + Boolean.hashCode(this.f66591d)) * 31) + Boolean.hashCode(this.f66592e)) * 31) + Boolean.hashCode(this.f66593f)) * 31) + Boolean.hashCode(this.f66594g)) * 31) + Long.hashCode(this.f66595h)) * 31) + this.f66596i.hashCode()) * 31) + this.f66597j.hashCode()) * 31) + this.f66598k.hashCode()) * 31) + this.f66599l.hashCode()) * 31) + this.f66600m.hashCode();
        }

        public final boolean i() {
            return this.f66591d;
        }

        public final Set j() {
            return this.f66599l;
        }

        public final Set k() {
            return this.f66600m;
        }

        public final boolean l() {
            return this.f66589b;
        }

        public final boolean m() {
            return this.f66593f;
        }

        public String toString() {
            return "RuntimeJunkPolicy(logFlag=" + this.f66588a + ", tmpFlag=" + this.f66589b + ", cacheFlag=" + this.f66590c + ", noMediaFlag=" + this.f66591d + ", appCacheFlag=" + this.f66592e + ", uninstallFlag=" + this.f66593f + ", emptyDirFlag=" + this.f66594g + ", minBytes=" + this.f66595h + ", exts=" + this.f66596i + ", names=" + this.f66597j + ", dirs=" + this.f66598k + ", pathKeys=" + this.f66599l + ", safe=" + this.f66600m + ")";
        }
    }

    /* JADX INFO: renamed from: com.neeeex.similar3p.utils.f$f, reason: collision with other inner class name */
    public static final class C0819f extends ll.m implements tl.n {
        final /* synthetic */ tl.o $onProgress;
        final /* synthetic */ List<b> $records;
        final /* synthetic */ long $spaceUsed;
        int I$0;
        private /* synthetic */ Object L$0;
        Object L$1;
        int label;
        final /* synthetic */ f this$0;

        /* JADX INFO: renamed from: com.neeeex.similar3p.utils.f$f$a */
        public static final class a extends ll.m implements tl.n {
            final /* synthetic */ AtomicInteger $completed;
            final /* synthetic */ tl.o $onProgress;
            final /* synthetic */ b $record;
            final /* synthetic */ long $spaceUsed;
            final /* synthetic */ int $total;
            int I$0;
            long J$0;
            Object L$0;
            int label;
            final /* synthetic */ f this$0;

            /* JADX INFO: renamed from: com.neeeex.similar3p.utils.f$f$a$a, reason: collision with other inner class name */
            public static final class C0820a extends ll.m implements tl.n {
                final /* synthetic */ long $current;
                final /* synthetic */ int $done;
                final /* synthetic */ tl.o $onProgress;
                final /* synthetic */ long $spaceUsed;
                final /* synthetic */ int $total;
                int label;
                final /* synthetic */ f this$0;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public C0820a(tl.o oVar, long j10, long j11, f fVar, int i10, int i11, kl.f<? super C0820a> fVar2) {
                    super(2, fVar2);
                    this.$onProgress = oVar;
                    this.$current = j10;
                    this.$spaceUsed = j11;
                    this.this$0 = fVar;
                    this.$done = i10;
                    this.$total = i11;
                }

                @Override // ll.a
                public final kl.f<fl.m0> create(Object obj, kl.f<?> fVar) {
                    return new C0820a(this.$onProgress, this.$current, this.$spaceUsed, this.this$0, this.$done, this.$total, fVar);
                }

                @Override // tl.n
                public final Object invoke(p0 p0Var, kl.f<? super fl.m0> fVar) {
                    return ((C0820a) create(p0Var, fVar)).invokeSuspend(fl.m0.f80959a);
                }

                @Override // ll.a
                public final Object invokeSuspend(Object obj) {
                    p003kotlin.coroutines.intrinsics.c.f();
                    if (this.label != 0) {
                        v0.a(m0.a("Ram11qj72RYBurzJ/eLTEQaqvNzn/dMWAaG3zOfk0xEGv7DO4K/VWVSnrM7h4dM=\n", "JsjZuoiPtjY=\n"));
                        return null;
                    }
                    fl.v.b(obj);
                    tl.o oVar = this.$onProgress;
                    Long lE = ll.b.e(this.$current);
                    Long lE2 = ll.b.e(this.$spaceUsed);
                    String string = this.this$0.f66576a.getString(R$string.neeeex_progress_analyzing, ll.b.d(this.$done), ll.b.d(this.$total));
                    m0.a("ofT7w/77BHKhuaG+pKA=\n", "xpGPkIqJbRw=\n");
                    string.getClass();
                    oVar.invoke(lE, lE2, string);
                    return fl.m0.f80959a;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(f fVar, b bVar, AtomicInteger atomicInteger, int i10, long j10, tl.o oVar, kl.f<? super a> fVar2) {
                super(2, fVar2);
                this.this$0 = fVar;
                this.$record = bVar;
                this.$completed = atomicInteger;
                this.$total = i10;
                this.$spaceUsed = j10;
                this.$onProgress = oVar;
            }

            @Override // ll.a
            public final kl.f<fl.m0> create(Object obj, kl.f<?> fVar) {
                return new a(this.this$0, this.$record, this.$completed, this.$total, this.$spaceUsed, this.$onProgress, fVar);
            }

            @Override // tl.n
            public final Object invoke(p0 p0Var, kl.f<? super b> fVar) {
                return ((a) create(p0Var, fVar)).invokeSuspend(fl.m0.f80959a);
            }

            @Override // ll.a
            public final Object invokeSuspend(Object obj) throws Throwable {
                Object objF = p003kotlin.coroutines.intrinsics.c.f();
                int i10 = this.label;
                if (i10 == 0) {
                    fl.v.b(obj);
                    try {
                        Bitmap bitmap = (Bitmap) ((com.bumptech.glide.j) com.bumptech.glide.b.t(this.this$0.f66576a).e().L0(this.$record.b().g()).i()).P0(32, 32).get();
                        b bVar = this.$record;
                        com.neeeex.similar3p.utils.k kVar = com.neeeex.similar3p.utils.k.f66608a;
                        bitmap.getClass();
                        bVar.e(kVar.h(bitmap));
                        b bVar2 = this.$record;
                        b bVar3 = bVar2.a().length() > 0 ? bVar2 : null;
                        int iIncrementAndGet = this.$completed.incrementAndGet();
                        if (iIncrementAndGet % 20 == 0 || iIncrementAndGet == this.$total) {
                            long j10 = this.$spaceUsed;
                            long j11 = (j10 / ((long) 5)) + ((((j10 * ((long) 6)) / ((long) 10)) * ((long) iIncrementAndGet)) / ((long) this.$total));
                            l2 l2VarC = f1.c();
                            C0820a c0820a = new C0820a(this.$onProgress, j11, this.$spaceUsed, this.this$0, iIncrementAndGet, this.$total, null);
                            this.L$0 = bVar3;
                            this.I$0 = iIncrementAndGet;
                            this.J$0 = j11;
                            this.label = 1;
                            if (kotlinx.coroutines.i.g(l2VarC, c0820a, this) == objF) {
                                return objF;
                            }
                        }
                        return bVar3;
                    } catch (Exception unused) {
                        int iIncrementAndGet2 = this.$completed.incrementAndGet();
                        if (iIncrementAndGet2 % 20 == 0 || iIncrementAndGet2 == this.$total) {
                            long j12 = this.$spaceUsed;
                            long j13 = (j12 / ((long) 5)) + ((((j12 * ((long) 6)) / ((long) 10)) * ((long) iIncrementAndGet2)) / ((long) this.$total));
                            l2 l2VarC2 = f1.c();
                            C0820a c0820a2 = new C0820a(this.$onProgress, j13, this.$spaceUsed, this.this$0, iIncrementAndGet2, this.$total, null);
                            this.I$0 = iIncrementAndGet2;
                            this.J$0 = j13;
                            this.label = 2;
                            if (kotlinx.coroutines.i.g(l2VarC2, c0820a2, this) == objF) {
                            }
                        }
                        return null;
                    } catch (Throwable th2) {
                        int iIncrementAndGet3 = this.$completed.incrementAndGet();
                        if (iIncrementAndGet3 % 20 != 0 && iIncrementAndGet3 != this.$total) {
                            throw th2;
                        }
                        long j14 = this.$spaceUsed;
                        long j15 = (j14 / ((long) 5)) + ((((j14 * ((long) 6)) / ((long) 10)) * ((long) iIncrementAndGet3)) / ((long) this.$total));
                        l2 l2VarC3 = f1.c();
                        C0820a c0820a3 = new C0820a(this.$onProgress, j15, this.$spaceUsed, this.this$0, iIncrementAndGet3, this.$total, null);
                        this.L$0 = th2;
                        this.I$0 = iIncrementAndGet3;
                        this.J$0 = j15;
                        this.label = 3;
                        if (kotlinx.coroutines.i.g(l2VarC3, c0820a3, this) != objF) {
                            throw th2;
                        }
                    }
                } else {
                    if (i10 == 1) {
                        b bVar4 = (b) this.L$0;
                        fl.v.b(obj);
                        return bVar4;
                    }
                    if (i10 != 2) {
                        if (i10 != 3) {
                            v0.a(m0.a("APArGzRlFidE4yIEYXwcIEPzIhF7YxwnRPgpAXt6HCBD5i4DfDEaaBH+MgN9fxw=\n", "Y5FHdxQReQc=\n"));
                            return null;
                        }
                        Throwable th3 = (Throwable) this.L$0;
                        fl.v.b(obj);
                        throw th3;
                    }
                    fl.v.b(obj);
                }
                return null;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C0819f(List<b> list, f fVar, long j10, tl.o oVar, kl.f<? super C0819f> fVar2) {
            super(2, fVar2);
            this.$records = list;
            this.this$0 = fVar;
            this.$spaceUsed = j10;
            this.$onProgress = oVar;
        }

        @Override // ll.a
        public final kl.f<fl.m0> create(Object obj, kl.f<?> fVar) {
            C0819f c0819f = new C0819f(this.$records, this.this$0, this.$spaceUsed, this.$onProgress, fVar);
            c0819f.L$0 = obj;
            return c0819f;
        }

        @Override // tl.n
        public final Object invoke(p0 p0Var, kl.f<? super List<b>> fVar) {
            return ((C0819f) create(p0Var, fVar)).invokeSuspend(fl.m0.f80959a);
        }

        @Override // ll.a
        public final Object invokeSuspend(Object obj) {
            Object objA;
            p0 p0Var = (p0) this.L$0;
            Object objF = p003kotlin.coroutines.intrinsics.c.f();
            int i10 = this.label;
            if (i10 == 0) {
                fl.v.b(obj);
                AtomicInteger atomicInteger = new AtomicInteger();
                int size = this.$records.size();
                List<b> list = this.$records;
                f fVar = this.this$0;
                long j10 = this.$spaceUsed;
                tl.o oVar = this.$onProgress;
                ArrayList arrayList = new ArrayList(x.x(list, 10));
                Iterator<T> it = list.iterator();
                while (it.hasNext()) {
                    tl.o oVar2 = oVar;
                    ArrayList arrayList2 = arrayList;
                    arrayList2.add(kotlinx.coroutines.k.b(p0Var, f1.a(), null, new a(fVar, (b) it.next(), atomicInteger, size, j10, oVar2, null), 2, null));
                    arrayList = arrayList2;
                    oVar = oVar2;
                }
                this.L$0 = ll.l.a(p0Var);
                this.L$1 = ll.l.a(atomicInteger);
                this.I$0 = size;
                this.label = 1;
                objA = kotlinx.coroutines.f.a(arrayList, this);
                if (objA == objF) {
                    return objF;
                }
            } else {
                if (i10 != 1) {
                    v0.a(m0.a("vPLmXrc7DxP44e9B4iIFFP/x71T4PQUT+PrkRPgkBRT/5ONG/28DXK38/0b+IQU=\n", "35OKMpdPYDM=\n"));
                    return null;
                }
                fl.v.b(obj);
                objA = obj;
            }
            return g0.m0((Iterable) objA);
        }
    }

    public static final class g extends ll.m implements tl.n {
        final /* synthetic */ List<yi.e> $files;
        private /* synthetic */ Object L$0;
        int label;
        final /* synthetic */ f this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(List<yi.e> list, f fVar, kl.f<? super g> fVar2) {
            super(2, fVar2);
            this.$files = list;
            this.this$0 = fVar;
        }

        @Override // ll.a
        public final kl.f<fl.m0> create(Object obj, kl.f<?> fVar) {
            g gVar = new g(this.$files, this.this$0, fVar);
            gVar.L$0 = obj;
            return gVar;
        }

        @Override // tl.n
        public final Object invoke(p0 p0Var, kl.f<? super Integer> fVar) {
            return ((g) create(p0Var, fVar)).invokeSuspend(fl.m0.f80959a);
        }

        @Override // ll.a
        public final Object invokeSuspend(Object obj) {
            Object objM372constructorimpl;
            p003kotlin.coroutines.intrinsics.c.f();
            if (this.label != 0) {
                v0.a(m0.a("hbCTTI9GIbPBo5pT2l8rtMazmkbAQCuzwbiRVsBZK7TGppZUxxIt/JS+ilTGXCs=\n", "5tH/IK8yTpM=\n"));
                return null;
            }
            fl.v.b(obj);
            List<yi.e> list = this.$files;
            Integer numD = ll.b.d(0);
            f fVar = this.this$0;
            for (yi.e eVar : list) {
                int iIntValue = numD.intValue();
                try {
                    u.a aVar = u.Companion;
                    objM372constructorimpl = u.m372constructorimpl(ll.b.a(fVar.P(eVar.d())));
                } catch (Throwable th2) {
                    u.a aVar2 = u.Companion;
                    objM372constructorimpl = u.m372constructorimpl(fl.v.a(th2));
                }
                Boolean boolA = ll.b.a(false);
                if (u.m377isFailureimpl(objM372constructorimpl)) {
                    objM372constructorimpl = boolA;
                }
                numD = ll.b.d(iIntValue + (((Boolean) objM372constructorimpl).booleanValue() ? 1 : 0));
            }
            return numD;
        }
    }

    public static final class h extends ll.m implements tl.n {
        final /* synthetic */ File $current;
        final /* synthetic */ tl.o $progress;
        final /* synthetic */ d $tracker;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h(tl.o oVar, d dVar, File file, kl.f<? super h> fVar) {
            super(2, fVar);
            this.$progress = oVar;
            this.$tracker = dVar;
            this.$current = file;
        }

        @Override // ll.a
        public final kl.f<fl.m0> create(Object obj, kl.f<?> fVar) {
            return new h(this.$progress, this.$tracker, this.$current, fVar);
        }

        @Override // tl.n
        public final Object invoke(p0 p0Var, kl.f<? super fl.m0> fVar) {
            return ((h) create(p0Var, fVar)).invokeSuspend(fl.m0.f80959a);
        }

        @Override // ll.a
        public final Object invokeSuspend(Object obj) {
            p003kotlin.coroutines.intrinsics.c.f();
            if (this.label != 0) {
                v0.a(m0.a("f95XpGveJ207zV67PsctajzdXq4k2C1tO9ZVviTBLWo8yFK8I4orIm7QTrwixC0=\n", "HL87yEuqSE0=\n"));
                return null;
            }
            fl.v.b(obj);
            tl.o oVar = this.$progress;
            Long lE = ll.b.e(this.$tracker.b());
            Long lE2 = ll.b.e(this.$tracker.c());
            String absolutePath = this.$current.getAbsolutePath();
            m0.a("JMlwei+czn822GFrLJvJO22CKhI=\n", "Q6wEO03voRM=\n");
            absolutePath.getClass();
            oVar.invoke(lE, lE2, absolutePath);
            return fl.m0.f80959a;
        }
    }

    public static final class i extends ll.m implements tl.n {
        final /* synthetic */ tl.o $callback;
        final /* synthetic */ long $completed;
        final /* synthetic */ int $messageResource;
        final /* synthetic */ long $total;
        int label;
        final /* synthetic */ f this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public i(tl.o oVar, long j10, long j11, f fVar, int i10, kl.f<? super i> fVar2) {
            super(2, fVar2);
            this.$callback = oVar;
            this.$completed = j10;
            this.$total = j11;
            this.this$0 = fVar;
            this.$messageResource = i10;
        }

        @Override // ll.a
        public final kl.f<fl.m0> create(Object obj, kl.f<?> fVar) {
            return new i(this.$callback, this.$completed, this.$total, this.this$0, this.$messageResource, fVar);
        }

        @Override // tl.n
        public final Object invoke(p0 p0Var, kl.f<? super fl.m0> fVar) {
            return ((i) create(p0Var, fVar)).invokeSuspend(fl.m0.f80959a);
        }

        @Override // ll.a
        public final Object invokeSuspend(Object obj) {
            p003kotlin.coroutines.intrinsics.c.f();
            if (this.label != 0) {
                v0.a(m0.a("Vw89O63sgzoTHDQk+PWJPRQMNDHi6ok6Ewc/IeLziT0UGTgj5biPdUYBJCPk9ok=\n", "NG5RV42Y7Bo=\n"));
                return null;
            }
            fl.v.b(obj);
            tl.o oVar = this.$callback;
            Long lE = ll.b.e(this.$completed);
            Long lE2 = ll.b.e(this.$total);
            String string = this.this$0.f66576a.getString(this.$messageResource);
            m0.a("IxrvXC2wBNQjV7Uhd+s=\n", "RH+bD1nCbbo=\n");
            string.getClass();
            oVar.invoke(lE, lE2, string);
            return fl.m0.f80959a;
        }
    }

    public static final class j extends ll.m implements tl.n {
        final /* synthetic */ Set<yi.f> $acceptedTypes;
        final /* synthetic */ tl.o $onProgress;
        Object L$0;
        int label;

        public static final class a implements Comparator {
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                return jl.c.e(Long.valueOf(((yi.b) obj2).d().h()), Long.valueOf(((yi.b) obj).d().h()));
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public j(tl.o oVar, Set<? extends yi.f> set, kl.f<? super j> fVar) {
            super(2, fVar);
            this.$onProgress = oVar;
            this.$acceptedTypes = set;
        }

        public static fl.m0 b(ArrayList arrayList, Set set, File file) {
            yi.e eVarC = yi.e.f103504h.c(file);
            if (!set.contains(eVarC.j())) {
                eVarC = null;
            }
            if (eVarC != null) {
                arrayList.add(eVarC);
            }
            return fl.m0.f80959a;
        }

        @Override // ll.a
        public final kl.f<fl.m0> create(Object obj, kl.f<?> fVar) {
            return f.this.new j(this.$onProgress, this.$acceptedTypes, fVar);
        }

        @Override // tl.n
        public final Object invoke(p0 p0Var, kl.f<? super List<yi.b>> fVar) {
            return ((j) create(p0Var, fVar)).invokeSuspend(fl.m0.f80959a);
        }

        @Override // ll.a
        public final Object invokeSuspend(Object obj) {
            ArrayList arrayList;
            Object objF = p003kotlin.coroutines.intrinsics.c.f();
            int i10 = this.label;
            if (i10 == 0) {
                fl.v.b(obj);
                final ArrayList arrayList2 = new ArrayList();
                f fVar = f.this;
                File externalStorageDirectory = Environment.getExternalStorageDirectory();
                m0.a("9ZG99h76MNT8laXgEuEnx/WRjdoU6zbS/Yawm0ige48=\n", "kvTJs2aOVaY=\n");
                externalStorageDirectory.getClass();
                d dVar = new d(f.this.D().a(), 0L, 0L, 6, null);
                tl.o oVar = this.$onProgress;
                final Set<yi.f> set = this.$acceptedTypes;
                Function1 function1 = new Function1() { // from class: com.neeeex.similar3p.utils.g
                    @Override // p003kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj2) {
                        return f.j.b(arrayList2, set, (File) obj2);
                    }
                };
                this.L$0 = arrayList2;
                this.label = 1;
                if (fVar.d0(externalStorageDirectory, dVar, oVar, function1, this) == objF) {
                    return objF;
                }
                arrayList = arrayList2;
            } else {
                if (i10 != 1) {
                    v0.a(m0.a("nYQXgympZAnZlx6cfLBuDt6HHolmr24J2YwVmWa2bg7ekhKbYf1oRoyKDptgs24=\n", "/uV77wndCyk=\n"));
                    return null;
                }
                arrayList = (ArrayList) this.L$0;
                fl.v.b(obj);
            }
            List listC = f.this.C(arrayList);
            ArrayList arrayList3 = new ArrayList(x.x(listC, 10));
            int i11 = 0;
            for (Object obj2 : listC) {
                int i12 = i11 + 1;
                if (i11 < 0) {
                    w.w();
                }
                List list = (List) obj2;
                arrayList3.add(new yi.b((yi.e) g0.p0(list), new ArrayList(g0.g0(list, 1)), i12));
                i11 = i12;
            }
            return g0.V0(arrayList3, new a());
        }
    }

    public static final class k extends ll.m implements tl.n {
        final /* synthetic */ tl.o $onProgress;
        Object L$0;
        Object L$1;
        Object L$2;
        int label;

        public static final class a implements Comparator {
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                return jl.c.e(Long.valueOf(((yi.e) obj2).h()), Long.valueOf(((yi.e) obj).h()));
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public k(tl.o oVar, kl.f<? super k> fVar) {
            super(2, fVar);
            this.$onProgress = oVar;
        }

        @Override // ll.a
        public final kl.f<fl.m0> create(Object obj, kl.f<?> fVar) {
            return f.this.new k(this.$onProgress, fVar);
        }

        @Override // tl.n
        public final Object invoke(p0 p0Var, kl.f<? super List<yi.e>> fVar) {
            return ((k) create(p0Var, fVar)).invokeSuspend(fl.m0.f80959a);
        }

        @Override // ll.a
        public final Object invokeSuspend(Object obj) {
            LinkedHashMap linkedHashMap;
            e eVar;
            Object objF = p003kotlin.coroutines.intrinsics.c.f();
            int i10 = this.label;
            if (i10 == 0) {
                fl.v.b(obj);
                e eVarX = f.this.x(com.neeeex.similar3p.e.f66268a.a());
                d dVar = new d(f.this.D().a(), 0L, 0L, 6, null);
                LinkedHashMap linkedHashMap2 = new LinkedHashMap();
                if (eVarX.a()) {
                    List listR = w.r(f.this.f66576a.getCacheDir(), f.this.f66576a.getExternalCacheDir());
                    ArrayList arrayList = new ArrayList();
                    for (Object obj2 : listR) {
                        File file = (File) obj2;
                        if (file.exists() && file.isDirectory()) {
                            arrayList.add(obj2);
                        }
                    }
                    f fVar = f.this;
                    Iterator it = arrayList.iterator();
                    while (it.hasNext()) {
                        fVar.R((File) it.next(), linkedHashMap2);
                    }
                }
                f fVar2 = f.this;
                File externalStorageDirectory = Environment.getExternalStorageDirectory();
                m0.a("HNotTgzoPH4V3jVYAPMrbRzaHWIG+Tp4FM0gI1qydyU=\n", "e79ZC3ScWQw=\n");
                externalStorageDirectory.getClass();
                tl.o oVar = this.$onProgress;
                this.L$0 = eVarX;
                this.L$1 = ll.l.a(dVar);
                this.L$2 = linkedHashMap2;
                this.label = 1;
                if (fVar2.c0(externalStorageDirectory, linkedHashMap2, dVar, oVar, eVarX, this) == objF) {
                    return objF;
                }
                linkedHashMap = linkedHashMap2;
                eVar = eVarX;
            } else {
                if (i10 != 1) {
                    v0.a(m0.a("oFqb/ePLudHkSZLittKz1uNZkveszbPR5FKZ56zUs9bjTJ7lq5+1nrFUguWq0bM=\n", "wzv3kcO/1vE=\n"));
                    return null;
                }
                linkedHashMap = (LinkedHashMap) this.L$2;
                eVar = (e) this.L$0;
                fl.v.b(obj);
            }
            if (eVar.m()) {
                f.this.w(linkedHashMap, eVar);
            }
            Collection collectionValues = linkedHashMap.values();
            m0.a("MwG3gsgLKIR6A6HIzVNnxiY=\n", "D2bS9uV9Seg=\n");
            collectionValues.getClass();
            return g0.V0(collectionValues, new a());
        }
    }

    public static final class l extends ll.m implements tl.n {
        final /* synthetic */ Set<yi.f> $acceptedTypes;
        final /* synthetic */ tl.o $onProgress;
        Object L$0;
        int label;

        public static final class a implements Comparator {
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                return jl.c.e(Long.valueOf(((yi.e) obj2).h()), Long.valueOf(((yi.e) obj).h()));
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public l(tl.o oVar, Set<? extends yi.f> set, kl.f<? super l> fVar) {
            super(2, fVar);
            this.$onProgress = oVar;
            this.$acceptedTypes = set;
        }

        public static fl.m0 b(ArrayList arrayList, Set set, File file) {
            if (file.length() >= 3145728) {
                yi.e eVarC = yi.e.f103504h.c(file);
                if (!set.contains(eVarC.j())) {
                    eVarC = null;
                }
                if (eVarC != null) {
                    arrayList.add(eVarC);
                }
            }
            return fl.m0.f80959a;
        }

        @Override // ll.a
        public final kl.f<fl.m0> create(Object obj, kl.f<?> fVar) {
            return f.this.new l(this.$onProgress, this.$acceptedTypes, fVar);
        }

        @Override // tl.n
        public final Object invoke(p0 p0Var, kl.f<? super List<yi.e>> fVar) {
            return ((l) create(p0Var, fVar)).invokeSuspend(fl.m0.f80959a);
        }

        @Override // ll.a
        public final Object invokeSuspend(Object obj) {
            ArrayList arrayList;
            Object objF = p003kotlin.coroutines.intrinsics.c.f();
            int i10 = this.label;
            if (i10 == 0) {
                fl.v.b(obj);
                final ArrayList arrayList2 = new ArrayList();
                f fVar = f.this;
                File externalStorageDirectory = Environment.getExternalStorageDirectory();
                m0.a("zR1BHnhpa6zEGVkIdHJ8v80dcTJyeG2qxQpMcy4zIPc=\n", "qng1WwAdDt4=\n");
                externalStorageDirectory.getClass();
                d dVar = new d(f.this.D().a(), 0L, 0L, 6, null);
                tl.o oVar = this.$onProgress;
                final Set<yi.f> set = this.$acceptedTypes;
                Function1 function1 = new Function1() { // from class: com.neeeex.similar3p.utils.h
                    @Override // p003kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj2) {
                        return f.l.b(arrayList2, set, (File) obj2);
                    }
                };
                this.L$0 = arrayList2;
                this.label = 1;
                if (fVar.d0(externalStorageDirectory, dVar, oVar, function1, this) == objF) {
                    return objF;
                }
                arrayList = arrayList2;
            } else {
                if (i10 != 1) {
                    v0.a(m0.a("PHskAhN31hZ4aC0dRm7cEX94LQhccdwWeHMmGFxo3BF/bSEaWyPaWS11PRpabdw=\n", "XxpIbjMDuTY=\n"));
                    return null;
                }
                arrayList = (ArrayList) this.L$0;
                fl.v.b(obj);
            }
            return g0.V0(arrayList, new a());
        }
    }

    public static final class m extends ll.m implements tl.n {
        final /* synthetic */ tl.o $onProgress;
        Object L$0;
        int label;

        public static final class a implements Comparator {
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                return jl.c.e(Long.valueOf(((yi.e) obj2).h()), Long.valueOf(((yi.e) obj).h()));
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public m(tl.o oVar, kl.f<? super m> fVar) {
            super(2, fVar);
            this.$onProgress = oVar;
        }

        public static fl.m0 b(f fVar, ArrayList arrayList, File file) {
            yi.e eVarC = yi.e.f103504h.c(file);
            if (f.f66553c.contains(eVarC.j()) && fVar.K(eVarC)) {
                arrayList.add(eVarC);
            }
            return fl.m0.f80959a;
        }

        @Override // ll.a
        public final kl.f<fl.m0> create(Object obj, kl.f<?> fVar) {
            return f.this.new m(this.$onProgress, fVar);
        }

        @Override // tl.n
        public final Object invoke(p0 p0Var, kl.f<? super List<yi.e>> fVar) {
            return ((m) create(p0Var, fVar)).invokeSuspend(fl.m0.f80959a);
        }

        @Override // ll.a
        public final Object invokeSuspend(Object obj) {
            ArrayList arrayList;
            Object objF = p003kotlin.coroutines.intrinsics.c.f();
            int i10 = this.label;
            if (i10 == 0) {
                fl.v.b(obj);
                final ArrayList arrayList2 = new ArrayList();
                f fVar = f.this;
                File externalStorageDirectory = Environment.getExternalStorageDirectory();
                m0.a("ICOzhfiEqNkpJ6uT9J+/yiAjg6nyla7fKDS+6K7e44I=\n", "R0bHwIDwzas=\n");
                externalStorageDirectory.getClass();
                d dVar = new d(f.this.D().a(), 0L, 0L, 6, null);
                tl.o oVar = this.$onProgress;
                final f fVar2 = f.this;
                Function1 function1 = new Function1() { // from class: com.neeeex.similar3p.utils.i
                    @Override // p003kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj2) {
                        return f.m.b(fVar2, arrayList2, (File) obj2);
                    }
                };
                this.L$0 = arrayList2;
                this.label = 1;
                if (fVar.d0(externalStorageDirectory, dVar, oVar, function1, this) == objF) {
                    return objF;
                }
                arrayList = arrayList2;
            } else {
                if (i10 != 1) {
                    v0.a(m0.a("Vmyl62scBQMSf6z0PgUPBBVvrOEkGg8DEmSn8SQDDwQVeqDzI0gJTEdivPMiBg8=\n", "NQ3Jh0toaiM=\n"));
                    return null;
                }
                arrayList = (ArrayList) this.L$0;
                fl.v.b(obj);
            }
            return g0.V0(arrayList, new a());
        }
    }

    public static final class n extends ll.m implements tl.n {
        final /* synthetic */ tl.o $onProgress;
        long J$0;
        Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        int label;

        public static final class a extends ll.m implements tl.n {
            final /* synthetic */ tl.o $onProgress;
            final /* synthetic */ ArrayList<b> $pending;
            final /* synthetic */ ArrayList<b> $ready;
            final /* synthetic */ long $spaceUsed;
            int label;
            final /* synthetic */ f this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(tl.o oVar, long j10, f fVar, ArrayList<b> arrayList, ArrayList<b> arrayList2, kl.f<? super a> fVar2) {
                super(2, fVar2);
                this.$onProgress = oVar;
                this.$spaceUsed = j10;
                this.this$0 = fVar;
                this.$ready = arrayList;
                this.$pending = arrayList2;
            }

            @Override // ll.a
            public final kl.f<fl.m0> create(Object obj, kl.f<?> fVar) {
                return new a(this.$onProgress, this.$spaceUsed, this.this$0, this.$ready, this.$pending, fVar);
            }

            @Override // tl.n
            public final Object invoke(p0 p0Var, kl.f<? super fl.m0> fVar) {
                return ((a) create(p0Var, fVar)).invokeSuspend(fl.m0.f80959a);
            }

            @Override // ll.a
            public final Object invokeSuspend(Object obj) {
                p003kotlin.coroutines.intrinsics.c.f();
                if (this.label != 0) {
                    v0.a(m0.a("h4Cx28rT0yHDk7jEn8rZJsSDuNGF1dkhw4izwYXM2SbElrTDgoffbpaOqMODydk=\n", "5OHdt+qnvAE=\n"));
                    return null;
                }
                fl.v.b(obj);
                tl.o oVar = this.$onProgress;
                Long lE = ll.b.e(this.$spaceUsed / ((long) 5));
                Long lE2 = ll.b.e(this.$spaceUsed);
                String string = this.this$0.f66576a.getString(R$string.neeeex_progress_cache_status, ll.b.d(this.$ready.size()), ll.b.d(this.$pending.size()));
                m0.a("rv5Fwy8GQgOusx++dV0=\n", "yZsxkFt0K20=\n");
                string.getClass();
                oVar.invoke(lE, lE2, string);
                return fl.m0.f80959a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public n(tl.o oVar, kl.f<? super n> fVar) {
            super(2, fVar);
            this.$onProgress = oVar;
        }

        @Override // ll.a
        public final kl.f<fl.m0> create(Object obj, kl.f<?> fVar) {
            return f.this.new n(this.$onProgress, fVar);
        }

        @Override // tl.n
        public final Object invoke(p0 p0Var, kl.f<? super List<yi.h>> fVar) {
            return ((n) create(p0Var, fVar)).invokeSuspend(fl.m0.f80959a);
        }

        /* JADX WARN: Code duplicated, block: B:30:0x0141  */
        /* JADX WARN: Code duplicated, block: B:33:0x014a  */
        /* JADX WARN: Code duplicated, block: B:36:0x016b  */
        /* JADX WARN: Code duplicated, block: B:40:0x018a A[LOOP:0: B:38:0x0184->B:40:0x018a, LOOP_END] */
        /* JADX WARN: Code duplicated, block: B:43:0x01b1  */
        /* JADX WARN: Code duplicated, block: B:45:0x01b9  */
        /* JADX WARN: Code duplicated, block: B:48:0x01c1  */
        /* JADX WARN: Code duplicated, block: B:50:0x01c6  */
        /* JADX WARN: Code duplicated, block: B:53:0x01f8  */
        @Override // ll.a
        public final Object invokeSuspend(Object obj) {
            xi.b bVar;
            long jA;
            long j10;
            xi.b bVar2;
            List list;
            l2 l2VarC;
            a aVar;
            long j11;
            ArrayList arrayList;
            ArrayList arrayList2;
            List list2;
            xi.b bVar3;
            long j12;
            long j13;
            ArrayList arrayList3;
            Object objY;
            List list3;
            xi.b bVar4;
            f fVar;
            tl.o oVar;
            ArrayList arrayList4;
            long j14;
            int i10;
            ArrayList arrayList5;
            ArrayList arrayList6;
            Object objF = p003kotlin.coroutines.intrinsics.c.f();
            int i11 = this.label;
            if (i11 == 0) {
                fl.v.b(obj);
                bVar = new xi.b(f.this.f66576a);
                jA = f.this.D().a();
                f fVar2 = f.this;
                tl.o oVar2 = this.$onProgress;
                int i12 = R$string.neeeex_progress_loading_images;
                this.L$0 = bVar;
                this.J$0 = jA;
                this.label = 1;
                if (fVar2.S(oVar2, 0L, jA, i12, this) != objF) {
                }
                return objF;
            }
            if (i11 == 1) {
                long j15 = this.J$0;
                xi.b bVar5 = (xi.b) this.L$0;
                fl.v.b(obj);
                jA = j15;
                bVar = bVar5;
            } else {
                if (i11 == 2) {
                    long j16 = this.J$0;
                    list = (List) this.L$1;
                    bVar2 = (xi.b) this.L$0;
                    fl.v.b(obj);
                    j10 = j16;
                    t tVarU = f.this.u(list, bVar2.h());
                    ArrayList arrayList7 = (ArrayList) tVarU.component1();
                    ArrayList arrayList8 = (ArrayList) tVarU.component2();
                    l2VarC = f1.c();
                    aVar = new a(this.$onProgress, j10, f.this, arrayList7, arrayList8, null);
                    j11 = j10;
                    arrayList = arrayList7;
                    arrayList2 = arrayList8;
                    this.L$0 = bVar2;
                    this.L$1 = ll.l.a(list);
                    this.L$2 = arrayList;
                    this.L$3 = arrayList2;
                    this.J$0 = j11;
                    this.label = 3;
                    if (kotlinx.coroutines.i.g(l2VarC, aVar, this) != objF) {
                        list2 = list;
                        bVar3 = bVar2;
                        j12 = j11;
                        if (arrayList2.isEmpty()) {
                            j13 = j12;
                            arrayList3 = arrayList;
                            if (arrayList3.size() < 2) {
                                return w.m();
                            }
                            fVar = f.this;
                            ArrayList arrayList9 = arrayList2;
                            oVar = this.$onProgress;
                            arrayList4 = arrayList3;
                            j14 = (((long) 9) * j13) / ((long) 10);
                            i10 = R$string.neeeex_progress_grouping;
                            this.L$0 = ll.l.a(bVar3);
                            this.L$1 = ll.l.a(list2);
                            this.L$2 = arrayList4;
                            this.L$3 = ll.l.a(arrayList9);
                            this.J$0 = j13;
                            this.label = 5;
                            if (fVar.S(oVar, j14, j13, i10, this) != objF) {
                                arrayList5 = arrayList4;
                            }
                        } else {
                            f fVar3 = f.this;
                            tl.o oVar3 = this.$onProgress;
                            this.L$0 = bVar3;
                            this.L$1 = ll.l.a(list2);
                            this.L$2 = arrayList;
                            this.L$3 = ll.l.a(arrayList2);
                            this.J$0 = j12;
                            this.label = 4;
                            objY = fVar3.y(arrayList2, j12, oVar3, this);
                            if (objY != objF) {
                                list3 = list2;
                                bVar4 = bVar3;
                                List list4 = (List) objY;
                                arrayList.addAll(list4);
                                List<b> list5 = list4;
                                arrayList6 = new ArrayList(x.x(list5, 10));
                                for (b bVar6 : list5) {
                                    arrayList6.add(new xi.b.c(bVar6.d(), bVar6.c(), bVar6.a(), null, 8, null));
                                }
                                if (!arrayList6.isEmpty()) {
                                    bVar4.j(arrayList6);
                                }
                                list2 = list3;
                                bVar3 = bVar4;
                                arrayList3 = arrayList;
                                j13 = j12;
                                if (arrayList3.size() < 2) {
                                    return w.m();
                                }
                                fVar = f.this;
                                ArrayList arrayList10 = arrayList2;
                                oVar = this.$onProgress;
                                arrayList4 = arrayList3;
                                j14 = (((long) 9) * j13) / ((long) 10);
                                i10 = R$string.neeeex_progress_grouping;
                                this.L$0 = ll.l.a(bVar3);
                                this.L$1 = ll.l.a(list2);
                                this.L$2 = arrayList4;
                                this.L$3 = ll.l.a(arrayList10);
                                this.J$0 = j13;
                                this.label = 5;
                                if (fVar.S(oVar, j14, j13, i10, this) != objF) {
                                    arrayList5 = arrayList4;
                                }
                            }
                        }
                    }
                    return objF;
                }
                if (i11 == 3) {
                    long j17 = this.J$0;
                    ArrayList arrayList11 = (ArrayList) this.L$3;
                    ArrayList arrayList12 = (ArrayList) this.L$2;
                    List list6 = (List) this.L$1;
                    xi.b bVar7 = (xi.b) this.L$0;
                    fl.v.b(obj);
                    arrayList = arrayList12;
                    list2 = list6;
                    bVar3 = bVar7;
                    arrayList2 = arrayList11;
                    j12 = j17;
                    if (arrayList2.isEmpty()) {
                        f fVar4 = f.this;
                        tl.o oVar4 = this.$onProgress;
                        this.L$0 = bVar3;
                        this.L$1 = ll.l.a(list2);
                        this.L$2 = arrayList;
                        this.L$3 = ll.l.a(arrayList2);
                        this.J$0 = j12;
                        this.label = 4;
                        objY = fVar4.y(arrayList2, j12, oVar4, this);
                        if (objY != objF) {
                            list3 = list2;
                            bVar4 = bVar3;
                            List list7 = (List) objY;
                            arrayList.addAll(list7);
                            List<b> list8 = list7;
                            arrayList6 = new ArrayList(x.x(list8, 10));
                            while (r0.hasNext()) {
                                arrayList6.add(new xi.b.c(bVar6.d(), bVar6.c(), bVar6.a(), null, 8, null));
                            }
                            if (!arrayList6.isEmpty()) {
                                bVar4.j(arrayList6);
                            }
                            list2 = list3;
                            bVar3 = bVar4;
                            arrayList3 = arrayList;
                            j13 = j12;
                            if (arrayList3.size() < 2) {
                                return w.m();
                            }
                            fVar = f.this;
                            ArrayList arrayList13 = arrayList2;
                            oVar = this.$onProgress;
                            arrayList4 = arrayList3;
                            j14 = (((long) 9) * j13) / ((long) 10);
                            i10 = R$string.neeeex_progress_grouping;
                            this.L$0 = ll.l.a(bVar3);
                            this.L$1 = ll.l.a(list2);
                            this.L$2 = arrayList4;
                            this.L$3 = ll.l.a(arrayList13);
                            this.J$0 = j13;
                            this.label = 5;
                            if (fVar.S(oVar, j14, j13, i10, this) != objF) {
                                arrayList5 = arrayList4;
                            }
                        }
                    } else {
                        j13 = j12;
                        arrayList3 = arrayList;
                        if (arrayList3.size() < 2) {
                            return w.m();
                        }
                        fVar = f.this;
                        ArrayList arrayList14 = arrayList2;
                        oVar = this.$onProgress;
                        arrayList4 = arrayList3;
                        j14 = (((long) 9) * j13) / ((long) 10);
                        i10 = R$string.neeeex_progress_grouping;
                        this.L$0 = ll.l.a(bVar3);
                        this.L$1 = ll.l.a(list2);
                        this.L$2 = arrayList4;
                        this.L$3 = ll.l.a(arrayList14);
                        this.J$0 = j13;
                        this.label = 5;
                        if (fVar.S(oVar, j14, j13, i10, this) != objF) {
                            arrayList5 = arrayList4;
                        }
                    }
                    return objF;
                }
                if (i11 == 4) {
                    long j18 = this.J$0;
                    ArrayList arrayList15 = (ArrayList) this.L$3;
                    ArrayList arrayList16 = (ArrayList) this.L$2;
                    list3 = (List) this.L$1;
                    bVar4 = (xi.b) this.L$0;
                    fl.v.b(obj);
                    arrayList = arrayList16;
                    objY = obj;
                    arrayList2 = arrayList15;
                    j12 = j18;
                    List list9 = (List) objY;
                    arrayList.addAll(list9);
                    List<b> list10 = list9;
                    arrayList6 = new ArrayList(x.x(list10, 10));
                    while (r0.hasNext()) {
                        arrayList6.add(new xi.b.c(bVar6.d(), bVar6.c(), bVar6.a(), null, 8, null));
                    }
                    if (!arrayList6.isEmpty()) {
                        bVar4.j(arrayList6);
                    }
                    list2 = list3;
                    bVar3 = bVar4;
                    arrayList3 = arrayList;
                    j13 = j12;
                    if (arrayList3.size() < 2) {
                        return w.m();
                    }
                    fVar = f.this;
                    ArrayList arrayList17 = arrayList2;
                    oVar = this.$onProgress;
                    arrayList4 = arrayList3;
                    j14 = (((long) 9) * j13) / ((long) 10);
                    i10 = R$string.neeeex_progress_grouping;
                    this.L$0 = ll.l.a(bVar3);
                    this.L$1 = ll.l.a(list2);
                    this.L$2 = arrayList4;
                    this.L$3 = ll.l.a(arrayList17);
                    this.J$0 = j13;
                    this.label = 5;
                    if (fVar.S(oVar, j14, j13, i10, this) != objF) {
                        arrayList5 = arrayList4;
                    }
                    return objF;
                }
                if (i11 != 5) {
                    v0.a(m0.a("fWnqR1vgsLM5euNYDvm6tD5q400U5rqzOWHoXRT/urQ+f+9fE7S8/Gxn818S+ro=\n", "HgiGK3uU35M=\n"));
                    return null;
                }
                arrayList5 = (ArrayList) this.L$2;
                fl.v.b(obj);
            }
            return f.this.E(arrayList5);
            List listQ = f.this.Q();
            if (listQ.isEmpty()) {
                return w.m();
            }
            int i13 = R$string.neeeex_progress_checking_cache;
            this.L$0 = bVar;
            this.L$1 = listQ;
            this.J$0 = jA;
            this.label = 2;
            if (f.this.S(this.$onProgress, jA / ((long) 10), jA, i13, this) != objF) {
                j10 = jA;
                bVar2 = bVar;
                list = listQ;
                t tVarU2 = f.this.u(list, bVar2.h());
                ArrayList arrayList18 = (ArrayList) tVarU2.component1();
                ArrayList arrayList19 = (ArrayList) tVarU2.component2();
                l2VarC = f1.c();
                aVar = new a(this.$onProgress, j10, f.this, arrayList18, arrayList19, null);
                j11 = j10;
                arrayList = arrayList18;
                arrayList2 = arrayList19;
                this.L$0 = bVar2;
                this.L$1 = ll.l.a(list);
                this.L$2 = arrayList;
                this.L$3 = arrayList2;
                this.J$0 = j11;
                this.label = 3;
                if (kotlinx.coroutines.i.g(l2VarC, aVar, this) != objF) {
                    list2 = list;
                    bVar3 = bVar2;
                    j12 = j11;
                    if (arrayList2.isEmpty()) {
                        f fVar5 = f.this;
                        tl.o oVar5 = this.$onProgress;
                        this.L$0 = bVar3;
                        this.L$1 = ll.l.a(list2);
                        this.L$2 = arrayList;
                        this.L$3 = ll.l.a(arrayList2);
                        this.J$0 = j12;
                        this.label = 4;
                        objY = fVar5.y(arrayList2, j12, oVar5, this);
                        if (objY != objF) {
                            list3 = list2;
                            bVar4 = bVar3;
                            List list11 = (List) objY;
                            arrayList.addAll(list11);
                            List<b> list12 = list11;
                            arrayList6 = new ArrayList(x.x(list12, 10));
                            while (r0.hasNext()) {
                                arrayList6.add(new xi.b.c(bVar6.d(), bVar6.c(), bVar6.a(), null, 8, null));
                            }
                            if (!arrayList6.isEmpty()) {
                                bVar4.j(arrayList6);
                            }
                            list2 = list3;
                            bVar3 = bVar4;
                            arrayList3 = arrayList;
                            j13 = j12;
                            if (arrayList3.size() < 2) {
                                return w.m();
                            }
                            fVar = f.this;
                            ArrayList arrayList110 = arrayList2;
                            oVar = this.$onProgress;
                            arrayList4 = arrayList3;
                            j14 = (((long) 9) * j13) / ((long) 10);
                            i10 = R$string.neeeex_progress_grouping;
                            this.L$0 = ll.l.a(bVar3);
                            this.L$1 = ll.l.a(list2);
                            this.L$2 = arrayList4;
                            this.L$3 = ll.l.a(arrayList110);
                            this.J$0 = j13;
                            this.label = 5;
                            if (fVar.S(oVar, j14, j13, i10, this) != objF) {
                                arrayList5 = arrayList4;
                                return f.this.E(arrayList5);
                            }
                        }
                    } else {
                        j13 = j12;
                        arrayList3 = arrayList;
                        if (arrayList3.size() < 2) {
                            return w.m();
                        }
                        fVar = f.this;
                        ArrayList arrayList111 = arrayList2;
                        oVar = this.$onProgress;
                        arrayList4 = arrayList3;
                        j14 = (((long) 9) * j13) / ((long) 10);
                        i10 = R$string.neeeex_progress_grouping;
                        this.L$0 = ll.l.a(bVar3);
                        this.L$1 = ll.l.a(list2);
                        this.L$2 = arrayList4;
                        this.L$3 = ll.l.a(arrayList111);
                        this.J$0 = j13;
                        this.label = 5;
                        if (fVar.S(oVar, j14, j13, i10, this) != objF) {
                            arrayList5 = arrayList4;
                            return f.this.E(arrayList5);
                        }
                    }
                }
            }
            return objF;
        }
    }

    public static final class o extends ll.d {
        int I$0;
        int I$1;
        int I$2;
        Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        Object L$4;
        Object L$5;
        Object L$6;
        Object L$7;
        Object L$8;
        Object L$9;
        boolean Z$0;
        int label;
        /* synthetic */ Object result;

        public o(kl.f<? super o> fVar) {
            super(fVar);
        }

        @Override // ll.a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return f.this.c0(null, null, null, null, null, this);
        }
    }

    public static final class p extends ll.d {
        int I$0;
        int I$1;
        Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        Object L$4;
        Object L$5;
        Object L$6;
        Object L$7;
        int label;
        /* synthetic */ Object result;

        public p(kl.f<? super p> fVar) {
            super(fVar);
        }

        @Override // ll.a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return f.this.d0(null, null, null, null, this);
        }
    }

    static {
        Set setK = b1.k(m0.a("m3Lsla9yojGHZQ==\n", "6BGe8Moc0Vk=\n"), m0.a("ZtNjwkkXM/d932U=\n", "FbARpyx5bIQ=\n"), m0.a("yAs6jr7dzHLTBzw=\n", "u2hI69uz4QE=\n"), m0.a("ll2gLbplXGiGUaAs\n", "5T7SSN8LLg0=\n"), m0.a("bI5b9qYAFVl6jkbhpw==\n", "H+0pk8NuSis=\n"), m0.a("jjWDxhobhIuYNZ7RGw==\n", "/Vbxo391qfk=\n"), m0.a("8U3bsYnNZ9nhQduwidE=\n", "gi6p1OyjFbw=\n"), m0.a("jlueNgfbYsSSTJ8=\n", "/TjsU2K1Eaw=\n"), m0.a("trGEssgrfGOmvYSz3g==\n", "xdL2161FDgY=\n"));
        f66555e = setK;
        Set setK2 = b1.k(m0.a("4aDcNj4E2qzjr9gjJxra\n", "gsGsQkt2u9w=\n"), m0.a("MSqF0QUOVUg3P5DJEQ==\n", "Ukv1pXB8NCw=\n"), m0.a("pkjKg4Ozp5GgTNmFlw==\n", "xSm69/bBxvU=\n"), m0.a("HTpzzoQLorgbOHHbnw==\n", "flsDuvF5w9w=\n"), m0.a("n7/fCyZkqvGPu9UAIWg=\n", "/dazb1UHwpg=\n"), m0.a("CT76Tb5FSSgZOvdcq0hAKQYy\n", "a1eWKc0mIUE=\n"), m0.a("t757Oa/+Uuql\n", "xN0TXN2TM54=\n"), m0.a("QXZq2gyq7RVaamU=\n", "OwQQr3jPhmc=\n"), m0.a("MQXOH9pUBy4kHcEK\n", "RWSgeLE1d0I=\n"), m0.a("HESnzgNdhAoPWK3d\n", "biHMr2486mY=\n"), m0.a("Jh8LpwUNtRcmHwutAxA=\n", "R3FjxG14xXo=\n"), m0.a("l1I/pA1kU0eeUg==\n", "8DpWyWwKOy4=\n"), m0.a("wfoFQYndLvDR/wNVlM8=\n", "pJF3IOe6QYI=\n"), m0.a("y5te2hMKZknKmQ==\n", "rvAsu31hBzA=\n"));
        f66556f = setK2;
        Set setK3 = b1.k(m0.a("+78s/bvS\n", "HTeGGApdwTA=\n"), m0.a("IBHIodbw\n", "xpliRE1OYt8=\n"), m0.a("MfpHw2Rb\n", "1EfSJtXUHZI=\n"));
        f66557g = setK3;
        f66558h = c1.n(c1.n(setK, setK2), setK3);
        Set setK4 = b1.k(m0.a("rran8pj49zvzt6H1hr/rLPL9\n", "gdLEm/XXhFg=\n"), m0.a("i6e4+yAYbtPX+KL7Jgh52Ne/vuwnQg==\n", "pNfRmFRtHLY=\n"), m0.a("8ZTK1kRhQnuty9DWQnFVcKyBwNpCcB8=\n", "3uSjtTAUMB4=\n"), m0.a("gjoA8eiQzU3eZRrx7oDaRt8vCv3ugcwH\n", "rUppkpzlvyg=\n"), m0.a("ZEo2FUgDF9U4RCsGRAgWnyhIKwcO\n", "SydZYyFmZPo=\n"), m0.a("+++8ekKK5AKn4aFpToHlSLftoWhYwA==\n", "1ILTDCvvly0=\n"), m0.a("OEs3i6SXbFhlSjGMu918VGVLew==\n", "Fy9U4sm4Hzs=\n"), m0.a("0KDx0JgEGF2NoffXh04IUY2g4ZY=\n", "/8SSufUraz4=\n"), m0.a("y8N6ItO1c8aWwnwlzP9jypbDfDmR\n", "5KcZS76aAKU=\n"), m0.a("JGb1nwnWCp15bvmEEpwakXlv+ZhP\n", "Cwuc6mD5ef4=\n"), m0.a("GzpbNx6ZCm1cJkw2VA==\n", "NEk4RXv8ZB4=\n"), m0.a("UvJ6VYg8ahYY4nZViXY=\n", "fYEZJ+1ZBGQ=\n"), m0.a("XBS81wNSFpcWBLDXAkRX\n", "c2ffpWY3eOU=\n"));
        f66559i = setK4;
        Set setK5 = b1.k(m0.a("vKlOviCxpSvgrkq+NaqjK/+mTuE=\n", "k8ovzlTE10o=\n"), m0.a("Tx8EgpOPTtcEGRGXi5sT\n", "YHxl8uf6PLY=\n"), m0.a("6lZTOh/C+hC2UVc+DtvpXg==\n", "xTUySmu3iHE=\n"), m0.a("zM8IiKx41PSHyQybqmyJ\n", "46xp+NgNppU=\n"), m0.a("e+qRanfv0oEw7JNoYvSP\n", "VInwGgOaoOA=\n"), m0.a("uRPmS3QK4CrlFOJYch78YA==\n", "lnCHOwB/kk8=\n"), m0.a("R6ryMZtwH1Ucvfkum3kCQg2s7iKQOA==\n", "aM+cQ/4XdiY=\n"), m0.a("/am9+6u6fYa7ubnxoL1xnf0=\n", "0svUl8/JHu4=\n"), m0.a("BTrtNfrBQKxDKuk469RNpUI14Tex\n", "KliEWZ6yI8Q=\n"), m0.a("plIHfJatskT9REs=\n", "iSFkFPPf3yU=\n"), m0.a("AuPG8X1zkSxM68r5emWWPUX00ft7Lw==\n", "LZGjlhQA5V4=\n"), m0.a("4m+IrDlxSYimZ5u4OSo=\n", "zRX61kwFMO0=\n"), m0.a("UOnp/c+sowwe4uPo3KO4Sg==\n", "f4eImr3NzWU=\n"), m0.a("UI+EfkSaT5kelYlxWpBcxg==\n", "f/vlECPxLuk=\n"), m0.a("kclWjshYUonS2kqE2xo=\n", "vrsz5ak1M+c=\n"), m0.a("852UnOIm37mujZGa9iTdpLXX\n", "3Pj/7oNIuNY=\n"), m0.a("oxCScpVhBLD1EZAv\n", "jHX5APQPb9E=\n"), m0.a("cNKAdBI3wGEy0oB0GDHdPg==\n", "X7PuHHFftRE=\n"), m0.a("Xz2I7g//WrAZNIio\n", "cFrgh2KeNNg=\n"), m0.a("SKoME7LnUI3k420p7YZ83YTLOUnSwhzt5KoNIn4=\n", "Z0mOqlFl/24=\n"), m0.a("9gjsmSTz/9NVXZ+2dkE=\n", "2e94Is1uXTo=\n"), m0.a("dmPyspaaSTTjL4eU5Rw=\n", "WY5rJn0z/dg=\n"), m0.a("ZrXVil0DzDPM4aGHIoU=\n", "SVhMHraqeNg=\n"), m0.a("T11j2Ei4CTTYXF/Zerk3NeJdaSc=\n", "YIziCPJpieQ=\n"), m0.a("buwfKIzvy0T57SkpsO75RPvtKCiM78lE8RM=\n", "QTyo+Dw/dJQ=\n"), m0.a("jNLlqGNvK28K08aoZW8obwTT1alImA==\n", "owthceG3nLc=\n"), m0.a("SoeVj39E8fnvhruPa0XZ+NGHmI94RPQP\n", "ZV8/V8ycXSA=\n"), m0.a("04GSEiWZSW1E/8oKbsFDFBzYo1J9kxs1dIGSH+o=\n", "/GEqssUh+40=\n"), m0.a("4ieAxDARtbh1XtjmR0m87i1/ub5oAuTgVCeB1zARtrh1T9jmfYY=\n", "zcc4XtCpBFg=\n"), m0.a("4W3btfxNzXk=\n", "zotTHxn8QlY=\n"), m0.a("wjy3g/QWBK8=\n", "7do/KRGNuoA=\n"), m0.a("nGcj0LKG+Pc=\n", "s4KeRVc3d9g=\n"));
        f66560j = setK5;
        f66561k = c1.n(setK4, setK5);
        Set setK6 = b1.k(m0.a("rFkVL6ZZ\n", "3zpnSsM35II=\n"), m0.a("FC37HNs7m4k=\n", "ZEyVaLpX9+g=\n"), m0.a("6SCiKA==\n", "nUXOSd8+ayE=\n"), m0.a("gZbaw/4=\n", "5PWoopCYTeI=\n"), m0.a("mTac4rq0c7uJMg==\n", "+1/whsnXG9I=\n"), m0.a("FLM7EYef2w==\n", "Z9BTdPXytAs=\n"), m0.a("3eKp4Sk=\n", "uInbgEe0dgI=\n"), m0.a("Cs0SzS4=\n", "ZqxrrFyhW/k=\n"), m0.a("s5iJMpc0FQ==\n", "3vnnWv5afW8=\n"));
        f66562l = setK6;
        Set setK7 = b1.k(m0.a("1jS/KuWu3HE=\n", "B7lvkDQuDME=\n"), m0.a("+Fii+SFfHLOxOZimQHNM\n", "G9obGqPw/zA=\n"), m0.a("U8pE9pbQ\n", "tF7/Hwty8jk=\n"), m0.a("aqmEt7nW\n", "hzAQXBBiC3Y=\n"), m0.a("7eOdf6+qREQ=\n", "NVdF2HcenO0=\n"), m0.a("++OeYdAAmN+Su40ziCHwhqP2\n", "G1s1gWiZeGY=\n"));
        f66563m = setK7;
        f66564n = c1.n(setK6, setK7);
        Set setK8 = b1.k(m0.a("92LHuQ==\n", "hAqozQjq3rA=\n"), m0.a("tMmT8h3Sx96o3g==\n", "x6rhl3i8tLY=\n"), m0.a("5VhqCzZMcw==\n", "hjkaf0M+Fqc=\n"), m0.a("Itbj1NUYYw==\n", "QbeToKBqAgM=\n"), m0.a("2/DKcw==\n", "vZ++HDMMilI=\n"), m0.a("NtB/PgitOYok\n", "RbMXW3rAWP4=\n"), m0.a("vsdzBrU=\n", "xLUJc8G2wMA=\n"), m0.a("2sVlEt34nt/A\n", "rqQLdbaZ7r4=\n"), m0.a("KwcUXg==\n", "SG9hLlLcWBE=\n"), m0.a("JCqevtO/3gE2\n", "Q0Xsy73Lq3I=\n"));
        f66565o = setK8;
        Set setK9 = b1.k(m0.a("Z028gVozTRtmcQ==\n", "tsxsO4uznaM=\n"), m0.a("nHJOoAeqLck=\n", "TfOeHdcS/XU=\n"), m0.a("2h8Dv3vKV52Ofjn7\n", "OZ26XPlltB8=\n"), m0.a("EIy3PioC\n", "/DYW0piazbw=\n"), m0.a("Up9tAehcvOU=\n", "ixu0gzDrZEw=\n"), m0.a("9pXA73aa6YuI\n", "Fi1gD84oCTM=\n"));
        f66566p = setK9;
        f66567q = c1.n(setK8, setK9);
        Set setK10 = b1.k(m0.a("2w/mkJH+\n", "qWqF/+Oam20=\n"), m0.a("V35L8jYgCTBC\n", "JRsonUREYF4=\n"), m0.a("RdHeA+OoFHhM\n", "IqO/YYLLfRc=\n"), m0.a("605+/NrAIIY=\n", "jDwfirujQek=\n"), m0.a("pA6AIsDQz+qzBZ8iyc0=\n", "wWDyR6e5vJ4=\n"), m0.a("phl/WAl7RM0=\n", "x2wZNmgTKag=\n"), m0.a("hyEwQRGV9tCPLThGBw==\n", "9URXKGLhhLE=\n"), m0.a("39bZWCoP\n", "sbe+Kkthj2s=\n"), m0.a("uDucJvg=\n", "yl73R5XiIWI=\n"), m0.a("Sm2A\n", "LQXpQaTfjSY=\n"), m0.a("ddC9FyQ=\n", "HrHEc025s7k=\n"));
        f66568r = setK10;
        Set setK11 = b1.k(m0.a("tJN2l2tnxWW1pQ==\n", "ZCSmJ7vYFd0=\n"), m0.a("01LlP0lS\n", "Ot5X2N3pqw4=\n"), m0.a("gaD6mTE4\n", "aiVDdKis8JM=\n"), m0.a("ITJJrC116YogHA==\n", "+ZiRH/XZMAA=\n"), m0.a("mC6/07WFwgnhdp2k7YyUUcAX\n", "eJYlMw00IrE=\n"));
        f66569s = setK11;
        f66570t = c1.n(setK10, setK11);
        f66571u = b1.k(m0.a("EYaJPRwMUZ1fwZEmRg==\n", "Pqj9VWlhM/M=\n"), m0.a("OT8XxB+daJt/Jwye\n", "Fkt/sXL/Bvo=\n"), m0.a("aFql6W0oAJguQuI=\n", "Ry7NnABKbvk=\n"), m0.a("CRCbGjjAPw==\n", "JmTzb1WiEBk=\n"), m0.a("UYNTfIO4YMwdn14m\n", "fvc7Ce7aA60=\n"), m0.a("JWOzqcK8T8Bidb+ohQ==\n", "CgDSyqrZYLQ=\n"), m0.a("HSEzM37vyQlaNz8yeOuPER0=\n", "MkJSUBaK5n0=\n"), m0.a("dEkb6taY3BEzXxfr0JyaCSgF\n", "Wyp6ib7982U=\n"), m0.a("7Yg8TGFfj0SqmTJHYhHIXLHD\n", "wuxfJQxwoTA=\n"), m0.a("fSS4J4c9nm99Ibc3lH2UZD9rty2RIJhiNmumMZoknm83N6VtmDeTYjNruyyRJ5tufSa3IJ032A==\n", "UkXWQ/VS9ws=\n"));
        f66572v = b1.k(m0.a("YOdqgzvV0ih2\n", "FI8f7lmm/Ew=\n"), m0.a("hJlURlXjhDWR\n", "8PEhKzeH5UE=\n"), m0.a("4pzuhzZKvBW4iQ==\n", "zOiG8lso2HQ=\n"), m0.a("OeU+eDgSBgkh\n", "TY1LFVp8Z2A=\n"), m0.a("SCjiIAGU5ktQMw==\n", "PECXTWP6hyI=\n"), m0.a("MhacUYY=\n", "Rn7pPORmEgY=\n"));
        f66573w = b1.k(m0.a("Ro8=\n", "Iu3V3Zt5+W8=\n"), m0.a("KsyX\n", "XqHn29VnnPo=\n"), m0.a("VP3aDkI=\n", "N5y5ZieUQd8=\n"), m0.a("poYtWA==\n", "0eNPKCtcmII=\n"), m0.a("Ux9j\n", "OW8EnI2yCKM=\n"), m0.a("JjNKzw==\n", "TEMvqBKehn0=\n"), m0.a("DkU1\n", "fitSPbuHAjs=\n"));
        f66575y = b1.k(m0.a("tb4gC9VlbKv+9Q==\n", "mtpPfLsJA8o=\n"), m0.a("n2eAEwMiesrUcMA=\n", "sAPvZG1OFas=\n"));
    }

    public f(Context context) {
        m0.a("Lo7vsnXnXg==\n", "TeGBxhCfKn8=\n");
        context.getClass();
        this.f66576a = context;
    }

    public static final CharSequence M(byte b10) {
        String str = String.format(m0.a("CMxayg==\n", "Lfxosne7QoE=\n"), Arrays.copyOf(new Object[]{Byte.valueOf(b10)}, 1));
        m0.a("1vStiufkxSuetfY=\n", "sJvf54aQ7QU=\n");
        return str;
    }

    public static boolean b(List list) {
        m0.a("ayw=\n", "Alin6e09ymw=\n");
        list.getClass();
        return list.size() > 1;
    }

    public static yi.h c(int i10, List list) {
        m0.a("4xzKN/8=\n", "hXWmUow6atU=\n");
        list.getClass();
        return new yi.h(new ArrayList(list), i10 + 1, 0.0f, 4, null);
    }

    public static List d(List list, int[] iArr) {
        m0.a("kVyDI35BdA==\n", "+DLnSh0kB4M=\n");
        iArr.getClass();
        ArrayList arrayList = new ArrayList(iArr.length);
        for (int i10 : iArr) {
            arrayList.add(((b) list.get(i10)).b());
        }
        return arrayList;
    }

    public final Object A(List list, kl.f fVar) {
        return kotlinx.coroutines.i.g(f1.b(), new g(list, this, null), fVar);
    }

    public final Object B(File file, d dVar, tl.o oVar, kl.f fVar) {
        long jCurrentTimeMillis = System.currentTimeMillis();
        if (jCurrentTimeMillis - dVar.a() < 100) {
            return fl.m0.f80959a;
        }
        dVar.d(jCurrentTimeMillis);
        Object objG = kotlinx.coroutines.i.g(f1.c(), new h(oVar, dVar, file, null), fVar);
        return objG == p003kotlin.coroutines.intrinsics.c.f() ? objG : fl.m0.f80959a;
    }

    public final List C(List list) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Object obj : list) {
            Long lValueOf = Long.valueOf(((yi.e) obj).h());
            Object arrayList = linkedHashMap.get(lValueOf);
            if (arrayList == null) {
                arrayList = new ArrayList();
                linkedHashMap.put(lValueOf, arrayList);
            }
            ((List) arrayList).add(obj);
        }
        List listC = gl.v.c();
        Collection<List> collectionValues = linkedHashMap.values();
        m0.a("/ECi4CjFaai1QrSqLZ0m6uk=\n", "wCfHlAWzCMQ=\n");
        collectionValues.getClass();
        for (List<yi.e> list2 : collectionValues) {
            if (list2.size() >= 2) {
                LinkedHashMap linkedHashMap2 = new LinkedHashMap();
                for (yi.e eVar : list2) {
                    String strL = L(eVar.d());
                    Object arrayList2 = linkedHashMap2.get(strL);
                    if (arrayList2 == null) {
                        arrayList2 = new ArrayList();
                        linkedHashMap2.put(strL, arrayList2);
                    }
                    ((List) arrayList2).add(eVar);
                }
                Collection collectionValues2 = linkedHashMap2.values();
                m0.a("QsTQWJzRrIkLxsYSmYnjy1c=\n", "fqO1LLGnzeU=\n");
                collectionValues2.getClass();
                List list3 = listC;
                for (Object obj2 : collectionValues2) {
                    if (((List) obj2).size() > 1) {
                        list3.add(obj2);
                    }
                }
            }
        }
        return gl.v.a(listC);
    }

    public final yi.i D() {
        StatFs statFs = new StatFs(Environment.getExternalStorageDirectory().getPath());
        long blockSizeLong = statFs.getBlockSizeLong();
        long blockCountLong = statFs.getBlockCountLong() * blockSizeLong;
        long availableBlocksLong = statFs.getAvailableBlocksLong() * blockSizeLong;
        return new yi.i(blockCountLong, blockCountLong - availableBlocksLong, availableBlocksLong);
    }

    public final List E(final List list) {
        int size = list.size();
        long[] jArr = new long[size];
        for (int i10 = 0; i10 < size; i10++) {
            jArr[i10] = com.neeeex.similar3p.utils.k.f66608a.d(((b) list.get(i10)).a());
        }
        try {
            return to.v.T(to.v.L(to.v.z(to.v.K(s.d0(ImageNUtils.INSTANCE.ac(jArr, 10)), new Function1() { // from class: com.neeeex.similar3p.utils.b
                @Override // p003kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return f.d(list, (int[]) obj);
                }
            }), new Function1() { // from class: com.neeeex.similar3p.utils.c
                @Override // p003kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return Boolean.valueOf(f.b((List) obj));
                }
            }), new tl.n() { // from class: com.neeeex.similar3p.utils.d
                @Override // tl.n
                public final Object invoke(Object obj, Object obj2) {
                    return f.c(((Integer) obj).intValue(), (List) obj2);
                }
            }));
        } catch (Throwable unused) {
            return F(list);
        }
    }

    public final List F(List list) {
        boolean[] zArr = new boolean[list.size()];
        ArrayList arrayList = new ArrayList();
        Iterator it = w.n(list).iterator();
        while (it.hasNext()) {
            int iNextInt = ((q0) it).nextInt();
            if (!zArr[iNextInt]) {
                zArr[iNextInt] = true;
                ArrayList arrayListH = w.h(((b) list.get(iNextInt)).b());
                Iterator it2 = q.x(iNextInt + 1, list.size()).iterator();
                while (it2.hasNext()) {
                    int iNextInt2 = ((q0) it2).nextInt();
                    if (!zArr[iNextInt2] && com.neeeex.similar3p.utils.k.f66608a.b(((b) list.get(iNextInt)).a(), ((b) list.get(iNextInt2)).a()) <= 10) {
                        zArr[iNextInt2] = true;
                        arrayListH.add(((b) list.get(iNextInt2)).b());
                    }
                }
                if (arrayListH.size() > 1) {
                    arrayList.add(new yi.h(arrayListH, arrayList.size() + 1, 0.0f, 4, null));
                }
            }
        }
        return arrayList;
    }

    public final boolean G(File file) {
        Object objM372constructorimpl;
        try {
            u.a aVar = u.Companion;
            String[] list = file.list();
            objM372constructorimpl = u.m372constructorimpl(Boolean.valueOf(list == null || list.length == 0));
        } catch (Throwable th2) {
            u.a aVar2 = u.Companion;
            objM372constructorimpl = u.m372constructorimpl(fl.v.a(th2));
        }
        Boolean bool = Boolean.FALSE;
        if (u.m377isFailureimpl(objM372constructorimpl)) {
            objM372constructorimpl = bool;
        }
        return ((Boolean) objM372constructorimpl).booleanValue();
    }

    public final boolean H(File file, e eVar) {
        String name = file.getName();
        m0.a("Cc3ezjxq4kJAhoSp\n", "bqiqgF0Hh2o=\n");
        name.getClass();
        Locale locale = Locale.ROOT;
        m0.a("tRjxFA==\n", "51e+QAAse7A=\n");
        locale.getClass();
        String lowerCase = name.toLowerCase(locale);
        m0.a("qk7g4vvTofS/Usmlopj9ng==\n", "3iGsjYy207c=\n");
        lowerCase.getClass();
        String absolutePath = file.getAbsolutePath();
        m0.a("cEGNfIodmQViUJxtiRqeQTkK1xQ=\n", "FyT5Pehu9mk=\n");
        absolutePath.getClass();
        m0.a("lH+ARA==\n", "xjDPELr4ULs=\n");
        locale.getClass();
        String lowerCase2 = absolutePath.toLowerCase(locale);
        m0.a("Zwo0j1JvkUZyFh3ICyTNLA==\n", "E2V44CUK4wU=\n");
        lowerCase2.getClass();
        if (eVar.c().contains(lowerCase)) {
            return v(lowerCase2, "", eVar);
        }
        Set setJ = eVar.j();
        if ((setJ instanceof Collection) && setJ.isEmpty()) {
            return false;
        }
        Iterator it = setJ.iterator();
        while (it.hasNext()) {
            if (k0.c0(lowerCase2, (String) it.next(), false, 2, null) && v(lowerCase2, "", eVar)) {
                return true;
            }
        }
        return false;
    }

    public final boolean I(File file, e eVar) {
        if (file.length() < eVar.g()) {
            return false;
        }
        String strP = ql.m.p(file);
        Locale locale = Locale.ROOT;
        m0.a("uVZl6Q==\n", "6xkqvaP9h0o=\n");
        locale.getClass();
        String lowerCase = strP.toLowerCase(locale);
        m0.a("MsG4OpbdGAUn3ZF9z5ZEbw==\n", "Rq70VeG4akY=\n");
        lowerCase.getClass();
        String name = file.getName();
        m0.a("kiwo2Fdg9MrbZ3K/\n", "9UlcljYNkeI=\n");
        name.getClass();
        m0.a("6SM+Fw==\n", "u2xxQ1TLD6U=\n");
        locale.getClass();
        String lowerCase2 = name.toLowerCase(locale);
        m0.a("bqpBVih/Nyt7tmgRcTRrQQ==\n", "GsUNOV8aRWg=\n");
        lowerCase2.getClass();
        String absolutePath = file.getAbsolutePath();
        m0.a("5xP8bWlDX1r1Au18akRYHq5YpgU=\n", "gHaILAswMDY=\n");
        absolutePath.getClass();
        m0.a("NMlCzw==\n", "ZoYNmy9FA6g=\n");
        locale.getClass();
        String lowerCase3 = absolutePath.toLowerCase(locale);
        m0.a("dw1llWbEMjBiEUzSP49uWg==\n", "A2Ip+hGhQHM=\n");
        lowerCase3.getClass();
        if (v.c(lowerCase2, m0.a("714DRkC8qOk=\n", "wTBsKyXYwYg=\n"))) {
            return eVar.i();
        }
        if (eVar.h().contains(lowerCase2)) {
            return true;
        }
        if (eVar.e().contains(lowerCase)) {
            return v(lowerCase3, lowerCase, eVar);
        }
        Set setJ = eVar.j();
        if ((setJ instanceof Collection) && setJ.isEmpty()) {
            return false;
        }
        Iterator it = setJ.iterator();
        while (it.hasNext()) {
            if (k0.c0(lowerCase3, (String) it.next(), false, 2, null) && v(lowerCase3, lowerCase, eVar)) {
                return true;
            }
        }
        return false;
    }

    public final boolean J(String str, e eVar) {
        Locale locale = Locale.ROOT;
        m0.a("9Go69Q==\n", "piV1oah0EGk=\n");
        locale.getClass();
        String lowerCase = str.toLowerCase(locale);
        m0.a("1zWqdrAHI+fCKYMx6Ux/jQ==\n", "o1rmGcdiUaQ=\n");
        lowerCase.getClass();
        Set setK = eVar.k();
        if ((setK instanceof Collection) && setK.isEmpty()) {
            return false;
        }
        Iterator it = setK.iterator();
        while (it.hasNext()) {
            if (k0.c0(lowerCase, (String) it.next(), false, 2, null)) {
                return true;
            }
        }
        return false;
    }

    public final boolean K(yi.e eVar) throws IOException {
        String strO = O(eVar.g());
        String strO2 = O(eVar.f());
        Set set = f66561k;
        if (!(set instanceof Collection) || !set.isEmpty()) {
            Iterator it = set.iterator();
            while (it.hasNext()) {
                if (k0.c0(strO, (CharSequence) it.next(), false, 2, null)) {
                    return true;
                }
            }
        }
        String str = strO + "/" + strO2;
        Set set2 = f66558h;
        if (!(set2 instanceof Collection) || !set2.isEmpty()) {
            Iterator it2 = set2.iterator();
            while (it2.hasNext()) {
                if (k0.c0(str, (CharSequence) it2.next(), false, 2, null)) {
                    return true;
                }
            }
        }
        Set set3 = f66564n;
        if (!(set3 instanceof Collection) || !set3.isEmpty()) {
            Iterator it3 = set3.iterator();
            while (it3.hasNext()) {
                if (k0.c0(str, (CharSequence) it3.next(), false, 2, null)) {
                    Set set4 = f66567q;
                    if (!(set4 instanceof Collection) || !set4.isEmpty()) {
                        Iterator it4 = set4.iterator();
                        while (it4.hasNext()) {
                            if (k0.c0(str, (CharSequence) it4.next(), false, 2, null)) {
                                return true;
                            }
                        }
                    }
                    Set set5 = f66570t;
                    if (!(set5 instanceof Collection) || !set5.isEmpty()) {
                        Iterator it5 = set5.iterator();
                        while (it5.hasNext()) {
                            if (k0.c0(str, (CharSequence) it5.next(), false, 2, null)) {
                                return true;
                            }
                        }
                        break;
                    }
                    break;
                }
            }
        }
        return false;
    }

    /* JADX WARN: Code duplicated, block: B:24:0x006e  */
    public final String L(File file) {
        Object objM372constructorimpl;
        try {
            u.a aVar = u.Companion;
            MessageDigest messageDigest = MessageDigest.getInstance(m0.a("Viiq\n", "G2yfG1o6X14=\n"));
            BufferedInputStream bufferedInputStream = new BufferedInputStream(new FileInputStream(file));
            try {
                byte[] bArr = new byte[8192];
                while (true) {
                    int i10 = bufferedInputStream.read(bArr);
                    if (i10 < 0) {
                        break;
                    }
                    messageDigest.update(bArr, 0, i10);
                    u.a aVar2 = u.Companion;
                    objM372constructorimpl = u.m372constructorimpl(fl.v.a(th));
                    if (u.m375exceptionOrNullimpl(objM372constructorimpl) != null) {
                        objM372constructorimpl = String.valueOf(file.getAbsolutePath().hashCode());
                    }
                    return (String) objM372constructorimpl;
                }
                fl.m0 m0Var = fl.m0.f80959a;
                ql.c.a(bufferedInputStream, null);
                byte[] bArrDigest = messageDigest.digest();
                m0.a("XUaxt87h1PMXAf8=\n", "OS/W0r2V/N0=\n");
                bArrDigest.getClass();
                objM372constructorimpl = u.m372constructorimpl(s.N0(bArrDigest, "", null, null, 0, null, new Function1() { // from class: com.neeeex.similar3p.utils.e
                    @Override // p003kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return f.M(((Byte) obj).byteValue());
                    }
                }, 30, null));
            } catch (Throwable th2) {
                try {
                    throw th2;
                } catch (Throwable th3) {
                    ql.c.a(bufferedInputStream, th2);
                    throw th3;
                }
            }
        } catch (Throwable th4) {
            u.a aVar3 = u.Companion;
            objM372constructorimpl = u.m372constructorimpl(fl.v.a(th4));
        }
        if (u.m375exceptionOrNullimpl(objM372constructorimpl) != null) {
            objM372constructorimpl = String.valueOf(file.getAbsolutePath().hashCode());
        }
        return (String) objM372constructorimpl;
    }

    public final long N(File file) {
        Object objM372constructorimpl;
        ArrayDeque arrayDeque = new ArrayDeque();
        arrayDeque.addLast(file);
        long length = 0;
        while (!arrayDeque.isEmpty()) {
            File file2 = (File) arrayDeque.removeLast();
            try {
                u.a aVar = u.Companion;
                objM372constructorimpl = u.m372constructorimpl(file2.listFiles());
            } catch (Throwable th2) {
                u.a aVar2 = u.Companion;
                objM372constructorimpl = u.m372constructorimpl(fl.v.a(th2));
            }
            if (u.m377isFailureimpl(objM372constructorimpl)) {
                objM372constructorimpl = null;
            }
            File[] fileArr = (File[]) objM372constructorimpl;
            if (fileArr != null) {
                for (File file3 : fileArr) {
                    if (file3.isFile()) {
                        length += file3.length();
                    } else if (file3.isDirectory()) {
                        arrayDeque.addLast(file3);
                    }
                }
            }
        }
        return length;
    }

    public final String O(String str) throws IOException {
        Locale locale = Locale.ROOT;
        m0.a("JYkr4g==\n", "d8ZktvBM0kI=\n");
        locale.getClass();
        String lowerCase = str.toLowerCase(locale);
        m0.a("WOEvJayJNNdN/QZi9cJovQ==\n", "LI5jStvsRpQ=\n");
        lowerCase.getClass();
        String strNormalize = Normalizer.normalize(lowerCase, Normalizer.Form.NFKD);
        m0.a("Y0BMgzxDzHxoBxDAcwY=\n", "DS8+7l0vpQY=\n");
        strNormalize.getClass();
        String strReplace = f66554d.replace(strNormalize, "");
        StringBuilder sb2 = new StringBuilder();
        for (int i10 = 0; i10 < strReplace.length(); i10++) {
            char cCharAt = strReplace.charAt(i10);
            if (cCharAt != '\'' && cCharAt != '`' && cCharAt != ' ') {
                sb2.append(cCharAt);
            }
        }
        return sb2.toString();
    }

    public final boolean P(File file) {
        Object objM372constructorimpl;
        Object objM372constructorimpl2;
        Object objM372constructorimpl3;
        if (!file.isDirectory()) {
            try {
                u.a aVar = u.Companion;
                objM372constructorimpl = u.m372constructorimpl(Boolean.valueOf(file.delete()));
            } catch (Throwable th2) {
                u.a aVar2 = u.Companion;
                objM372constructorimpl = u.m372constructorimpl(fl.v.a(th2));
            }
            Boolean bool = Boolean.FALSE;
            if (u.m377isFailureimpl(objM372constructorimpl)) {
                objM372constructorimpl = bool;
            }
            return ((Boolean) objM372constructorimpl).booleanValue();
        }
        ArrayDeque arrayDeque = new ArrayDeque();
        arrayDeque.addLast(z.a(file, Boolean.FALSE));
        boolean z10 = false;
        while (!arrayDeque.isEmpty()) {
            t tVar = (t) arrayDeque.removeLast();
            File file2 = (File) tVar.component1();
            boolean zBooleanValue = ((Boolean) tVar.component2()).booleanValue();
            if (!file2.isDirectory() || zBooleanValue) {
                try {
                    u.a aVar3 = u.Companion;
                    objM372constructorimpl2 = u.m372constructorimpl(Boolean.valueOf(file2.delete()));
                } catch (Throwable th3) {
                    u.a aVar4 = u.Companion;
                    objM372constructorimpl2 = u.m372constructorimpl(fl.v.a(th3));
                }
                Boolean bool2 = Boolean.FALSE;
                if (u.m377isFailureimpl(objM372constructorimpl2)) {
                    objM372constructorimpl2 = bool2;
                }
                boolean zBooleanValue2 = ((Boolean) objM372constructorimpl2).booleanValue();
                if (v.c(file2, file)) {
                    z10 = zBooleanValue2;
                }
            } else {
                arrayDeque.addLast(z.a(file2, Boolean.TRUE));
                try {
                    u.a aVar5 = u.Companion;
                    objM372constructorimpl3 = u.m372constructorimpl(file2.listFiles());
                } catch (Throwable th4) {
                    u.a aVar6 = u.Companion;
                    objM372constructorimpl3 = u.m372constructorimpl(fl.v.a(th4));
                }
                if (u.m377isFailureimpl(objM372constructorimpl3)) {
                    objM372constructorimpl3 = null;
                }
                File[] fileArr = (File[]) objM372constructorimpl3;
                if (fileArr != null) {
                    for (File file3 : fileArr) {
                        arrayDeque.addLast(z.a(file3, Boolean.FALSE));
                    }
                }
            }
        }
        return z10;
    }

    public final List Q() {
        String string;
        ArrayList arrayList = new ArrayList();
        Cursor cursorQuery = this.f66576a.getContentResolver().query(MediaStore.Images.Media.EXTERNAL_CONTENT_URI, new String[]{m0.a("Gcc1\n", "Rq5RPEUEfKg=\n"), m0.a("UTeyJ9I=\n", "DlPTU7MmbB4=\n"), m0.a("TxX/HvHKCRRCEuIeyg==\n", "K3SLe66nZnA=\n"), m0.a("o9CZnUM=\n", "/KPw5yZl4r8=\n")}, null, null, m0.a("JYylLrx6jsQkifEPpkip\n", "Qe3RS+Mb6qA=\n"));
        if (cursorQuery == null) {
            return arrayList;
        }
        Cursor cursor = cursorQuery;
        try {
            Cursor cursor2 = cursor;
            int columnIndexOrThrow = cursor2.getColumnIndexOrThrow(m0.a("Fcz6\n", "SqWewV1jyd4=\n"));
            int columnIndexOrThrow2 = cursor2.getColumnIndexOrThrow(m0.a("9SdOFFE=\n", "qkMvYDCdpis=\n"));
            int columnIndexOrThrow3 = cursor2.getColumnIndexOrThrow(m0.a("7hBb9gED7VzjF0b2Og==\n", "inEvk15ugjg=\n"));
            int columnIndexOrThrow4 = cursor2.getColumnIndexOrThrow(m0.a("eGiZiEY=\n", "Jxvw8iMqGtM=\n"));
            while (true) {
                if (!cursor2.moveToNext()) {
                    fl.m0 m0Var = fl.m0.f80959a;
                    ql.c.a(cursor, null);
                    return arrayList;
                }
                if (cursor2.getLong(columnIndexOrThrow4) >= 1024 && (string = cursor2.getString(columnIndexOrThrow2)) != null) {
                    String str = k0.r0(string) ? null : string;
                    if (str != null) {
                        File file = new File(str);
                        if (file.exists()) {
                            arrayList.add(new b(yi.e.f103504h.c(file), cursor2.getLong(columnIndexOrThrow), 1000 * cursor2.getLong(columnIndexOrThrow3), null, 8, null));
                        }
                    }
                }
            }
        } catch (Throwable th2) {
            try {
                throw th2;
            } catch (Throwable th3) {
                ql.c.a(cursor, th2);
                throw th3;
            }
        }
    }

    public final void R(File file, Map map) {
        String absolutePath = file.getAbsolutePath();
        if (map.containsKey(absolutePath)) {
            return;
        }
        absolutePath.getClass();
        String name = file.getName();
        String str = name.length() == 0 ? absolutePath : name;
        m0.a("M8npWtDQ9r10gYIe\n", "Wq+sN6Ckj5U=\n");
        str.getClass();
        map.put(absolutePath, new yi.e(absolutePath, str, N(file), file.lastModified(), yi.f.OTHER, yi.g.FILE_TYPE_DIRECTORY, false, 64, null));
    }

    public final Object S(tl.o oVar, long j10, long j11, int i10, kl.f fVar) {
        Object objG = kotlinx.coroutines.i.g(f1.c(), new i(oVar, j10, j11, this, i10, null), fVar);
        return objG == p003kotlin.coroutines.intrinsics.c.f() ? objG : fl.m0.f80959a;
    }

    public final Object T(tl.o oVar, kl.f fVar) {
        return V(a1.d(yi.f.DOCUMENT), oVar, fVar);
    }

    public final Object U(tl.o oVar, kl.f fVar) {
        return V(b1.k(yi.f.IMAGE, yi.f.VIDEO), oVar, fVar);
    }

    public final Object V(Set set, tl.o oVar, kl.f fVar) {
        return kotlinx.coroutines.i.g(f1.b(), new j(oVar, set, null), fVar);
    }

    public final Object W(tl.o oVar, kl.f fVar) {
        return kotlinx.coroutines.i.g(f1.b(), new k(oVar, null), fVar);
    }

    public final Object X(Set set, tl.o oVar, kl.f fVar) {
        return kotlinx.coroutines.i.g(f1.b(), new l(oVar, set, null), fVar);
    }

    public final Object Y(tl.o oVar, kl.f fVar) {
        return X(b1.k(yi.f.DOCUMENT, yi.f.OTHER), oVar, fVar);
    }

    public final Object Z(tl.o oVar, kl.f fVar) {
        return X(b1.k(yi.f.IMAGE, yi.f.VIDEO), oVar, fVar);
    }

    public final Object a0(tl.o oVar, kl.f fVar) {
        return kotlinx.coroutines.i.g(f1.b(), new m(oVar, null), fVar);
    }

    public final Object b0(tl.o oVar, kl.f fVar) {
        return kotlinx.coroutines.i.g(f1.b(), new n(oVar, null), fVar);
    }

    /* JADX WARN: Code duplicated, block: B:100:0x010c A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:34:0x00c5  */
    /* JADX WARN: Code duplicated, block: B:38:0x00e5 A[Catch: all -> 0x00f3, TryCatch #2 {all -> 0x00f3, blocks: (B:36:0x00dd, B:38:0x00e5, B:41:0x00f5), top: B:96:0x00dd }] */
    /* JADX WARN: Code duplicated, block: B:50:0x013e A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:51:0x013f  */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX WARN: Code duplicated, block: B:87:0x01f1  */
    /* JADX WARN: Code duplicated, block: B:89:0x01f8  */
    /* JADX WARN: Code duplicated, block: B:96:0x00dd A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:32:0x00b8 -> B:33:0x00c3). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:51:0x013f -> B:104:0x014b). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:60:0x0171 -> B:53:0x0151). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:89:0x01f8
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public final java.lang.Object c0(java.io.File r22, java.util.Map r23, com.neeeex.similar3p.utils.f.d r24, tl.o r25, com.neeeex.similar3p.utils.f.e r26, kl.f r27) {
        /*
            Method dump skipped, instruction units count: 520
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.neeeex.similar3p.utils.f.c0(java.io.File, java.util.Map, com.neeeex.similar3p.utils.f$d, tl.o, com.neeeex.similar3p.utils.f$e, kl.f):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:19:0x007a  */
    /* JADX WARN: Code duplicated, block: B:26:0x009d  */
    /* JADX WARN: Code duplicated, block: B:32:0x00b6  */
    /* JADX WARN: Code duplicated, block: B:35:0x00be A[Catch: Exception -> 0x00fc, TryCatch #0 {Exception -> 0x00fc, blocks: (B:33:0x00b8, B:35:0x00be, B:37:0x00d2, B:36:0x00c2), top: B:47:0x00b8 }] */
    /* JADX WARN: Code duplicated, block: B:36:0x00c2 A[Catch: Exception -> 0x00fc, TryCatch #0 {Exception -> 0x00fc, blocks: (B:33:0x00b8, B:35:0x00be, B:37:0x00d2, B:36:0x00c2), top: B:47:0x00b8 }] */
    /* JADX WARN: Code duplicated, block: B:39:0x00fb A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:40:0x00fc  */
    /* JADX WARN: Code duplicated, block: B:42:0x011a  */
    /* JADX WARN: Code duplicated, block: B:55:0x00a3 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:57:? A[LOOP:0: B:17:0x0074->B:57:?, LOOP_END, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:30:0x00a3 -> B:31:0x00b4). Please report as a decompilation issue!!! */
    /*  JADX ERROR: StackOverflowError in pass: RegionMakerVisitor
        java.lang.StackOverflowError
        	at jadx.core.utils.BlockUtils.traverseSuccessorsUntil(BlockUtils.java:731)
        	at jadx.core.utils.BlockUtils.traverseSuccessorsUntil(BlockUtils.java:749)
        */
    public final java.lang.Object d0(java.io.File r22, com.neeeex.similar3p.utils.f.d r23, tl.o r24, p003kotlin.jvm.functions.Function1 r25, kl.f r26) {
        /*
            Method dump skipped, instruction units count: 292
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.neeeex.similar3p.utils.f.d0(java.io.File, com.neeeex.similar3p.utils.f$d, tl.o, kotlin.jvm.functions.Function1, kl.f):java.lang.Object");
    }

    public final boolean t(String str) {
        try {
            int i10 = Build.VERSION.SDK_INT;
            Context context = this.f66576a;
            if (i10 >= 33) {
                context.getPackageManager().getPackageInfo(str, PackageManager.PackageInfoFlags.of(0L));
                return true;
            }
            context.getPackageManager().getPackageInfo(str, 0);
            return true;
        } catch (Exception unused) {
            return false;
        }
    }

    public final t u(List list, Map map) {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            b bVar = (b) it.next();
            y yVar = (y) map.get(Long.valueOf(bVar.d()));
            if (yVar == null || ((Number) yVar.getFirst()).longValue() != bVar.c() || ((CharSequence) yVar.getSecond()).length() <= 0) {
                arrayList2.add(bVar);
            } else {
                bVar.e((String) yVar.getSecond());
                arrayList.add(bVar);
            }
        }
        return z.a(arrayList, arrayList2);
    }

    public final boolean v(String str, String str2, e eVar) {
        if (k0.c0(str, m0.a("AO4XDP0=\n", "L4J4a9IMZXY=\n"), false, 2, null) || k0.c0(str, m0.a("i2QVf+q5\n", "pAh6GJmWiRY=\n"), false, 2, null) || v.c(str2, m0.a("oIvO\n", "zOSpimNXcq8=\n")) || v.c(str2, m0.a("u6ee\n", "38ru2yRg3LM=\n"))) {
            return eVar.f();
        }
        if (k0.c0(str, m0.a("T3IEqD4=\n", "YAZp2BE6I+0=\n"), false, 2, null) || k0.c0(str, m0.a("OyQqiSPM\n", "FFBP5FPjIWU=\n"), false, 2, null) || v.c(str2, m0.a("IMX6\n", "VKiK93IQIDs=\n")) || v.c(str2, m0.a("+K0uxQ==\n", "jMhDtQ2LjD8=\n"))) {
            return eVar.l();
        }
        if (k0.c0(str, m0.a("h9qzxZpuOA==\n", "qLnSpvILFy4=\n"), false, 2, null) || v.c(str2, m0.a("e3gWKvM=\n", "GBl1QpbWeqU=\n")) || v.c(str2, m0.a("sxW7\n", "0XTQAudUZ1g=\n")) || v.c(str2, m0.a("ywQl\n", "pGhBumztLmk=\n"))) {
            return eVar.b();
        }
        return true;
    }

    public final void w(Map map, e eVar) {
        File externalStorageDirectory = Environment.getExternalStorageDirectory();
        String[] strArr = {m0.a("NH2IAqCg9CERcpgR\n", "dRPscM/JkA4=\n"), m0.a("HDIE9gse+rEyPgI=\n", "XVxghGR3np4=\n"), m0.a("x1VVL5FohJrrXlU0nw==\n", "hjsxXf4B4LU=\n")};
        for (int i10 = 0; i10 < 3; i10++) {
            try {
                File[] fileArrListFiles = new File(externalStorageDirectory, strArr[i10]).listFiles();
                if (fileArrListFiles != null) {
                    ArrayList<File> arrayList = new ArrayList();
                    for (File file : fileArrListFiles) {
                        if (file.isDirectory()) {
                            String absolutePath = file.getAbsolutePath();
                            m0.a("tSo83fwpkRWnOy3M/y6WUfxhZrU=\n", "0k9InJ5a/nk=\n");
                            absolutePath.getClass();
                            if (!J(absolutePath, eVar)) {
                                String name = file.getName();
                                m0.a("dZFZg8nlUm082gPk\n", "EvQtzaiIN0U=\n");
                                name.getClass();
                                if (!t(name)) {
                                    arrayList.add(file);
                                }
                            }
                        }
                    }
                    for (File file2 : arrayList) {
                        file2.getClass();
                        R(file2, map);
                    }
                }
            } catch (Exception unused) {
            }
        }
    }

    public final e x(com.neeeex.similar3p.f fVar) {
        boolean zE = fVar.e();
        boolean zI = fVar.i();
        boolean zF = fVar.f();
        boolean zH = fVar.h();
        boolean zD = fVar.d();
        boolean zJ = fVar.j();
        boolean zG = fVar.g();
        long jG = q.g(fVar.k(), 0L);
        Set<String> setB = fVar.b();
        ArrayList arrayList = new ArrayList(x.x(setB, 10));
        for (String str : setB) {
            Locale locale = Locale.ROOT;
            m0.a("9d+lVg==\n", "p5DqAnlqElI=\n");
            locale.getClass();
            String lowerCase = str.toLowerCase(locale);
            m0.a("GGRo74+J6lMNeEGo1sK2OQ==\n", "bAskgPjsmBA=\n");
            lowerCase.getClass();
            arrayList.add(lowerCase);
        }
        HashSet hashSetD1 = g0.d1(arrayList);
        Set<String> setC = fVar.c();
        ArrayList arrayList2 = new ArrayList(x.x(setC, 10));
        for (String str2 : setC) {
            Locale locale2 = Locale.ROOT;
            m0.a("Ij29kg==\n", "cHLyxgsh27Y=\n");
            locale2.getClass();
            String lowerCase2 = str2.toLowerCase(locale2);
            m0.a("ZbBmXVbfJstwrE8aD5R6oQ==\n", "Ed8qMiG6VIg=\n");
            lowerCase2.getClass();
            arrayList2.add(lowerCase2);
        }
        HashSet hashSetD2 = g0.d1(arrayList2);
        Set setA = fVar.a();
        ArrayList arrayList3 = new ArrayList(x.x(setA, 10));
        Iterator it = setA.iterator();
        while (it.hasNext()) {
            String str3 = (String) it.next();
            Locale locale3 = Locale.ROOT;
            Iterator it2 = it;
            m0.a("+YCi3Q==\n", "q8/tiXbw2+A=\n");
            locale3.getClass();
            String lowerCase3 = str3.toLowerCase(locale3);
            m0.a("iGGZCHxdpQmdfbBPJRb5Yw==\n", "/A7VZws410o=\n");
            lowerCase3.getClass();
            arrayList3.add(lowerCase3);
            it = it2;
        }
        HashSet hashSetD3 = g0.d1(arrayList3);
        Set setL = fVar.l();
        ArrayList arrayList4 = new ArrayList(x.x(setL, 10));
        Iterator it3 = setL.iterator();
        while (it3.hasNext()) {
            String str4 = (String) it3.next();
            Locale locale4 = Locale.ROOT;
            Iterator it4 = it3;
            m0.a("wx3jcQ==\n", "kVKsJe6v0po=\n");
            locale4.getClass();
            String lowerCase4 = str4.toLowerCase(locale4);
            m0.a("2McvIfNZhUvN2wZmqhLZIQ==\n", "rKhjToQ89wg=\n");
            lowerCase4.getClass();
            arrayList4.add(lowerCase4);
            it3 = it4;
            zE = zE;
        }
        boolean z10 = zE;
        HashSet hashSetD4 = g0.d1(arrayList4);
        Set setM = fVar.m();
        ArrayList arrayList5 = new ArrayList(x.x(setM, 10));
        Iterator it5 = setM.iterator();
        while (it5.hasNext()) {
            String str5 = (String) it5.next();
            Locale locale5 = Locale.ROOT;
            Iterator it6 = it5;
            m0.a("0FMmBg==\n", "ghxpUs2nPAE=\n");
            locale5.getClass();
            String lowerCase5 = str5.toLowerCase(locale5);
            m0.a("wb+Iya5R+4HUo6GO9xqn6w==\n", "tdDEptk0icI=\n");
            lowerCase5.getClass();
            arrayList5.add(lowerCase5);
            it5 = it6;
            zI = zI;
        }
        return new e(z10, zI, zF, zH, zD, zJ, zG, jG, hashSetD1, hashSetD2, hashSetD3, hashSetD4, g0.d1(arrayList5));
    }

    public final Object y(List list, long j10, tl.o oVar, kl.f fVar) {
        return kotlinx.coroutines.q0.e(new C0819f(list, this, j10, oVar, null), fVar);
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x0066, code lost:
    
        if (p003kotlin.jvm.internal.v.c(r5, com.neeeex.similar3p.utils.f.f66574x) != false) goto L26;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final c z(File file, e eVar) {
        if (file.isDirectory() && eVar.d() && G(file)) {
            return new c.b(file);
        }
        if (file.isDirectory() && H(file, eVar)) {
            return new c.b(file);
        }
        if (file.isDirectory()) {
            return new c.d(file);
        }
        if (file.isFile()) {
            if (!I(file, eVar)) {
                String strP = ql.m.p(file);
                Locale locale = Locale.ROOT;
                m0.a("BDc9Xg==\n", "VnhyCgcSMGY=\n");
                locale.getClass();
                String lowerCase = strP.toLowerCase(locale);
                m0.a("BD4F8RrTeu4RIiy2Q5gmhA==\n", "cFFJnm22CK0=\n");
                lowerCase.getClass();
            }
            return new c.C0818c(file);
        }
        return c.a.f66581a;
    }

    public static final class a {
        public /* synthetic */ a(p003kotlin.jvm.internal.m mVar) {
            this();
        }

        public a() {
        }
    }

    public static final class d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final long f66585a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public volatile long f66586b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public volatile long f66587c;

        public /* synthetic */ d(long j10, long j11, long j12, int i10, p003kotlin.jvm.internal.m mVar) {
            this(j10, (i10 & 2) != 0 ? 0L : j11, (i10 & 4) != 0 ? 0L : j12);
        }

        public final long a() {
            return this.f66587c;
        }

        public final long b() {
            return this.f66586b;
        }

        public final long c() {
            return this.f66585a;
        }

        public final void d(long j10) {
            this.f66587c = j10;
        }

        public final void e(long j10) {
            this.f66586b = j10;
        }

        public d(long j10, long j11, long j12) {
            this.f66585a = j10;
            this.f66586b = j11;
            this.f66587c = j12;
        }
    }

    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final yi.e f66577a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final long f66578b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final long f66579c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public String f66580d;

        public b(yi.e eVar, long j10, long j11, String str) {
            m0.a("8nw=\n", "lBXXqpGHTxs=\n");
            eVar.getClass();
            m0.a("+gSPRz4=\n", "nmzuNFarUG0=\n");
            str.getClass();
            this.f66577a = eVar;
            this.f66578b = j10;
            this.f66579c = j11;
            this.f66580d = str;
        }

        public final String a() {
            return this.f66580d;
        }

        public final yi.e b() {
            return this.f66577a;
        }

        public final long c() {
            return this.f66579c;
        }

        public final long d() {
            return this.f66578b;
        }

        public final void e(String str) {
            m0.a("OnC3PY4ivg==\n", "BgPSSaMdgBY=\n");
            str.getClass();
            this.f66580d = str;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return v.c(this.f66577a, bVar.f66577a) && this.f66578b == bVar.f66578b && this.f66579c == bVar.f66579c && v.c(this.f66580d, bVar.f66580d);
        }

        public int hashCode() {
            return (((((this.f66577a.hashCode() * 31) + Long.hashCode(this.f66578b)) * 31) + Long.hashCode(this.f66579c)) * 31) + this.f66580d.hashCode();
        }

        public String toString() {
            return "ImgHashRecord(fi=" + this.f66577a + ", storeId=" + this.f66578b + ", modifiedTs=" + this.f66579c + ", dhash=" + this.f66580d + ")";
        }

        public /* synthetic */ b(yi.e eVar, long j10, long j11, String str, int i10, p003kotlin.jvm.internal.m mVar) {
            this(eVar, j10, j11, (i10 & 8) != 0 ? "" : str);
        }
    }
}