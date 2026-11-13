package com.neeeex.similar3p.junk;

import com.neeeex.eraser.m0;
import gl.b1;
import java.io.File;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Locale;
import java.util.Set;
import p003kotlin.jvm.functions.Function1;
import p003kotlin.text.k0;

/* JADX INFO: loaded from: classes7.dex */
public final class x {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final c f66509a = new c(null);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Set f66510b = b1.k("apk" /* decoded XOR */, "aab" /* decoded XOR */);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Set f66511c = b1.k("log" /* decoded XOR */, "dmp" /* decoded XOR */);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final Set f66512d = b1.k("tmp" /* decoded XOR */, "temp" /* decoded XOR */);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final Set f66513e = b1.k("logs" /* decoded XOR */, "log" /* decoded XOR */, "bugreport" /* decoded XOR */, "bugreports" /* decoded XOR */, "debug_log" /* decoded XOR */, "mipushlog" /* decoded XOR */, "crash" /* decoded XOR */, "crashes" /* decoded XOR */);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final Set f66514f = b1.k("supersonicads" /* decoded XOR */, "unityadsvideocache" /* decoded XOR */, "splashad" /* decoded XOR */);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final Set f66515g = b1.k("tmp" /* decoded XOR */, "temp" /* decoded XOR */, "temporary" /* decoded XOR */, "thumbnail" /* decoded XOR */, "thumbnails" /* decoded XOR */, ".thumbnails" /* decoded XOR */, ".thumb" /* decoded XOR */);

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final File f66516a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final i0 f66517b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final String f66518c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final String f66519d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final String f66520e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final Set f66521f;

        public a(File file, i0 i0Var, String str, String str2, String str3, Set set) {
            "file" /* decoded XOR */;
            file.getClass();
            "source" /* decoded XOR */;
            i0Var.getClass();
            "path" /* decoded XOR */;
            str.getClass();
            "name" /* decoded XOR */;
            str2.getClass();
            "extension" /* decoded XOR */;
            str3.getClass();
            "segments" /* decoded XOR */;
            set.getClass();
            this.f66516a = file;
            this.f66517b = i0Var;
            this.f66518c = str;
            this.f66519d = str2;
            this.f66520e = str3;
            this.f66521f = set;
        }

        public final String a() {
            return this.f66520e;
        }

        public final File b() {
            return this.f66516a;
        }

        public final String c() {
            return this.f66519d;
        }

        public final String d() {
            return this.f66518c;
        }

        public final Set e() {
            return this.f66521f;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return p003kotlin.jvm.internal.v.c(this.f66516a, aVar.f66516a) && this.f66517b == aVar.f66517b && p003kotlin.jvm.internal.v.c(this.f66518c, aVar.f66518c) && p003kotlin.jvm.internal.v.c(this.f66519d, aVar.f66519d) && p003kotlin.jvm.internal.v.c(this.f66520e, aVar.f66520e) && p003kotlin.jvm.internal.v.c(this.f66521f, aVar.f66521f);
        }

        public final i0 f() {
            return this.f66517b;
        }

        public int hashCode() {
            return (((((((((this.f66516a.hashCode() * 31) + this.f66517b.hashCode()) * 31) + this.f66518c.hashCode()) * 31) + this.f66519d.hashCode()) * 31) + this.f66520e.hashCode()) * 31) + this.f66521f.hashCode();
        }

        public String toString() {
            return "Candidate(file=" + this.f66516a + ", source=" + this.f66517b + ", path=" + this.f66518c + ", name=" + this.f66519d + ", extension=" + this.f66520e + ", segments=" + this.f66521f + ")";
        }
    }

    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final com.neeeex.similar3p.junk.a f66522a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final boolean f66523b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final Function1 f66524c;

        public b(com.neeeex.similar3p.junk.a aVar, boolean z10, Function1 function1) {
            "category" /* decoded XOR */;
            aVar.getClass();
            "accepts" /* decoded XOR */;
            function1.getClass();
            this.f66522a = aVar;
            this.f66523b = z10;
            this.f66524c = function1;
        }

        public final Function1 a() {
            return this.f66524c;
        }

        public final com.neeeex.similar3p.junk.a b() {
            return this.f66522a;
        }

        public final boolean c() {
            return this.f66523b;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return this.f66522a == bVar.f66522a && this.f66523b == bVar.f66523b && p003kotlin.jvm.internal.v.c(this.f66524c, bVar.f66524c);
        }

        public int hashCode() {
            return (((this.f66522a.hashCode() * 31) + Boolean.hashCode(this.f66523b)) * 31) + this.f66524c.hashCode();
        }

        public String toString() {
            return "ClassificationRule(category=" + this.f66522a + ", enabled=" + this.f66523b + ", accepts=" + this.f66524c + ")";
        }
    }

    public static final class d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Set f66525a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Set f66526b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final Set f66527c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final Set f66528d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final Set f66529e;

        public d(Set set, Set set2, Set set3, Set set4, Set set5) {
            "extensions" /* decoded XOR */;
            set.getClass();
            "fileNames" /* decoded XOR */;
            set2.getClass();
            "directoryNames" /* decoded XOR */;
            set3.getClass();
            "pathKeywords" /* decoded XOR */;
            set4.getClass();
            "whitelist" /* decoded XOR */;
            set5.getClass();
            this.f66525a = set;
            this.f66526b = set2;
            this.f66527c = set3;
            this.f66528d = set4;
            this.f66529e = set5;
        }

        public final Set a() {
            return this.f66527c;
        }

        public final Set b() {
            return this.f66525a;
        }

        public final Set c() {
            return this.f66526b;
        }

        public final Set d() {
            return this.f66528d;
        }

        public final Set e() {
            return this.f66529e;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof d)) {
                return false;
            }
            d dVar = (d) obj;
            return p003kotlin.jvm.internal.v.c(this.f66525a, dVar.f66525a) && p003kotlin.jvm.internal.v.c(this.f66526b, dVar.f66526b) && p003kotlin.jvm.internal.v.c(this.f66527c, dVar.f66527c) && p003kotlin.jvm.internal.v.c(this.f66528d, dVar.f66528d) && p003kotlin.jvm.internal.v.c(this.f66529e, dVar.f66529e);
        }

        public int hashCode() {
            return (((((((this.f66525a.hashCode() * 31) + this.f66526b.hashCode()) * 31) + this.f66527c.hashCode()) * 31) + this.f66528d.hashCode()) * 31) + this.f66529e.hashCode();
        }

        public String toString() {
            return "RuleIndex(extensions=" + this.f66525a + ", fileNames=" + this.f66526b + ", directoryNames=" + this.f66527c + ", pathKeywords=" + this.f66528d + ", whitelist=" + this.f66529e + ")";
        }
    }

    public static final /* synthetic */ class e extends p003kotlin.jvm.internal.s implements Function1 {
        public static final e INSTANCE = new e();

        public e() {
            super(1, p003kotlin.text.s.class, "isNotEmpty" /* decoded XOR */, "isNotEmpty(Ljava/lang/CharSequence;)Z" /* decoded XOR */, 1);
        }

        @Override // p003kotlin.jvm.functions.Function1
        public final Boolean invoke(String str) {
            "p0" /* decoded XOR */;
            str.getClass();
            return Boolean.valueOf(str.length() > 0);
        }
    }

    public static boolean a(a aVar) {
        "it" /* decoded XOR */;
        aVar.getClass();
        return p003kotlin.jvm.internal.v.c(aVar.c(), ".nomedia" /* decoded XOR */);
    }

    public static boolean b(x xVar, d dVar, a aVar) {
        "it" /* decoded XOR */;
        aVar.getClass();
        return xVar.o(aVar, dVar);
    }

    public static boolean c(a aVar) {
        "it" /* decoded XOR */;
        aVar.getClass();
        Set setE = aVar.e();
        Set set = f66514f;
        if ((setE instanceof Collection) && setE.isEmpty()) {
            return false;
        }
        Iterator it = setE.iterator();
        while (it.hasNext()) {
            if (set.contains((String) it.next())) {
                return true;
            }
        }
        return false;
    }

    public static boolean d(a aVar) {
        "it" /* decoded XOR */;
        aVar.getClass();
        return f66510b.contains(aVar.a());
    }

    public static boolean e(String str) {
        "it" /* decoded XOR */;
        str.getClass();
        return k0.c0(str, "/log/" /* decoded XOR */, false, 2, null) || k0.c0(str, "/logs/" /* decoded XOR */, false, 2, null);
    }

    public static boolean f(String str) {
        "it" /* decoded XOR */;
        str.getClass();
        return k0.c0(str, "/tmp/" /* decoded XOR */, false, 2, null) || k0.c0(str, "/temp/" /* decoded XOR */, false, 2, null);
    }

    public static boolean g(a aVar) {
        "it" /* decoded XOR */;
        aVar.getClass();
        return aVar.f() == i0.APP_CACHE;
    }

    public static boolean h(x xVar, d dVar, a aVar) {
        "it" /* decoded XOR */;
        aVar.getClass();
        return xVar.n(aVar, dVar);
    }

    public static boolean i(x xVar, d dVar, a aVar) {
        "it" /* decoded XOR */;
        aVar.getClass();
        return xVar.p(aVar, dVar);
    }

    public final List j(final d dVar, com.neeeex.similar3p.f fVar) {
        b bVar = new b(com.neeeex.similar3p.junk.a.APK, true, new Function1() { // from class: com.neeeex.similar3p.junk.o
            @Override // p003kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return Boolean.valueOf(x.d((x.a) obj));
            }
        });
        b bVar2 = new b(com.neeeex.similar3p.junk.a.LOG, fVar.e(), new Function1() { // from class: com.neeeex.similar3p.junk.p
            @Override // p003kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return Boolean.valueOf(x.b(this.f66382a, dVar, (x.a) obj));
            }
        });
        b bVar3 = new b(com.neeeex.similar3p.junk.a.AD, fVar.f(), new Function1() { // from class: com.neeeex.similar3p.junk.q
            @Override // p003kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return Boolean.valueOf(x.c((x.a) obj));
            }
        });
        com.neeeex.similar3p.junk.a aVar = com.neeeex.similar3p.junk.a.TEMP;
        b bVar4 = new b(aVar, fVar.i(), new Function1() { // from class: com.neeeex.similar3p.junk.r
            @Override // p003kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return Boolean.valueOf(x.i(this.f66384a, dVar, (x.a) obj));
            }
        });
        b bVar5 = new b(aVar, fVar.h(), new Function1() { // from class: com.neeeex.similar3p.junk.s
            @Override // p003kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return Boolean.valueOf(x.a((x.a) obj));
            }
        });
        com.neeeex.similar3p.junk.a aVar2 = com.neeeex.similar3p.junk.a.CACHE;
        return gl.w.p(bVar, bVar2, bVar3, bVar4, bVar5, new b(aVar2, fVar.d(), new Function1() { // from class: com.neeeex.similar3p.junk.t
            @Override // p003kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return Boolean.valueOf(x.g((x.a) obj));
            }
        }), new b(aVar2, fVar.f(), new Function1() { // from class: com.neeeex.similar3p.junk.u
            @Override // p003kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return Boolean.valueOf(x.h(this.f66386a, dVar, (x.a) obj));
            }
        }));
    }

    public final com.neeeex.similar3p.junk.a k(File file, i0 i0Var, com.neeeex.similar3p.f fVar) {
        Object next;
        "file" /* decoded XOR */;
        file.getClass();
        "source" /* decoded XOR */;
        i0Var.getClass();
        "rules" /* decoded XOR */;
        fVar.getClass();
        d dVarM = m(fVar);
        a aVarL = l(file, i0Var);
        if (s(aVarL, dVarM, fVar)) {
            return null;
        }
        Iterator it = j(dVarM, fVar).iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            b bVar = (b) next;
            if (bVar.c() && ((Boolean) bVar.a().invoke(aVarL)).booleanValue()) {
                break;
            }
        }
        b bVar2 = (b) next;
        if (bVar2 != null) {
            return bVar2.b();
        }
        return null;
    }

    public final a l(File file, i0 i0Var) {
        String absolutePath = file.getAbsolutePath();
        "getAbsolutePath(...)" /* decoded XOR */;
        absolutePath.getClass();
        String strR = r(absolutePath);
        String name = file.getName();
        "getName(...)" /* decoded XOR */;
        name.getClass();
        Locale locale = Locale.ROOT;
        "ROOT" /* decoded XOR */;
        locale.getClass();
        String lowerCase = name.toLowerCase(locale);
        "toLowerCase(...)" /* decoded XOR */;
        lowerCase.getClass();
        String strP = ql.m.p(file);
        "ROOT" /* decoded XOR */;
        locale.getClass();
        String lowerCase2 = strP.toLowerCase(locale);
        "toLowerCase(...)" /* decoded XOR */;
        lowerCase2.getClass();
        return new a(file, i0Var, strR, lowerCase, lowerCase2, (Set) to.v.S(to.v.z(k0.Y0(strR, new char[]{'/'}, false, 0, 6, null), e.INSTANCE), new LinkedHashSet()));
    }

    public final d m(com.neeeex.similar3p.f fVar) {
        return new d(q(fVar.b()), q(fVar.c()), q(fVar.a()), q(fVar.l()), q(fVar.m()));
    }

    public final boolean n(a aVar, d dVar) {
        boolean z10;
        boolean z11;
        boolean z12 = (!dVar.b().contains(aVar.a()) || f66511c.contains(aVar.a()) || f66512d.contains(aVar.a())) ? false : true;
        boolean z13 = (!dVar.c().contains(aVar.c()) || p003kotlin.jvm.internal.v.c(aVar.c(), ".nomedia" /* decoded XOR */) || k0.c0(aVar.c(), "thumb" /* decoded XOR */, false, 2, null)) ? false : true;
        Set setE = aVar.e();
        if (!(setE instanceof Collection) || !setE.isEmpty()) {
            Iterator it = setE.iterator();
            while (true) {
                if (!it.hasNext()) {
                    z10 = false;
                    break;
                }
                String str = (String) it.next();
                if (dVar.a().contains(str) && !f66513e.contains(str) && !f66515g.contains(str)) {
                    z10 = true;
                    break;
                }
            }
        } else {
            z10 = false;
            break;
        }
        Set setD = dVar.d();
        if (!(setD instanceof Collection) || !setD.isEmpty()) {
            Iterator it2 = setD.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    z11 = false;
                    break;
                }
                String str2 = (String) it2.next();
                if (str2.length() > 0 && k0.c0(aVar.d(), str2, false, 2, null) && !k0.c0(str2, "/log/" /* decoded XOR */, false, 2, null) && !k0.c0(str2, "/logs/" /* decoded XOR */, false, 2, null) && !k0.c0(str2, "/tmp/" /* decoded XOR */, false, 2, null) && !k0.c0(str2, "/temp/" /* decoded XOR */, false, 2, null)) {
                    z11 = true;
                    break;
                }
            }
        } else {
            z11 = false;
            break;
        }
        return z12 || z13 || z10 || z11;
    }

    /* JADX WARN: Code duplicated, block: B:26:0x0076 A[RETURN] */
    public final boolean o(a aVar, d dVar) {
        boolean z10;
        Iterator it = to.v.z(gl.g0.b0(dVar.d()), new Function1() { // from class: com.neeeex.similar3p.junk.v
            @Override // p003kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return Boolean.valueOf(x.e((String) obj));
            }
        }).iterator();
        while (true) {
            if (!it.hasNext()) {
                z10 = false;
                break;
            }
            String str = (String) it.next();
            if (str.length() > 0 && k0.c0(aVar.d(), str, false, 2, null)) {
                z10 = true;
                break;
            }
        }
        if (!f66511c.contains(aVar.a())) {
            Set setE = aVar.e();
            Set set = f66513e;
            if (!(setE instanceof Collection) || !setE.isEmpty()) {
                Iterator it2 = setE.iterator();
                while (it2.hasNext()) {
                    if (set.contains((String) it2.next())) {
                    }
                }
                if (z10) {
                    return false;
                }
            } else if (z10) {
                return false;
            }
        }
        return true;
    }

    public final boolean p(a aVar, d dVar) {
        boolean z10;
        boolean z11 = p003kotlin.jvm.internal.v.c(aVar.c(), "thumbs.db" /* decoded XOR */) || p003kotlin.text.e0.U(aVar.c(), "thumbdata" /* decoded XOR */, false, 2, null) || p003kotlin.text.e0.U(aVar.c(), ".thumbdata" /* decoded XOR */, false, 2, null) || (dVar.c().contains(aVar.c()) && k0.c0(aVar.c(), "thumb" /* decoded XOR */, false, 2, null));
        Iterator it = to.v.z(gl.g0.b0(dVar.d()), new Function1() { // from class: com.neeeex.similar3p.junk.w
            @Override // p003kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return Boolean.valueOf(x.f((String) obj));
            }
        }).iterator();
        while (true) {
            if (!it.hasNext()) {
                z10 = false;
                break;
            }
            String str = (String) it.next();
            if (str.length() > 0 && k0.c0(aVar.d(), str, false, 2, null)) {
                z10 = true;
                break;
            }
        }
        if (!f66512d.contains(aVar.a())) {
            Set setE = aVar.e();
            Set set = f66515g;
            if (!(setE instanceof Collection) || !setE.isEmpty()) {
                Iterator it2 = setE.iterator();
                while (it2.hasNext()) {
                    if (set.contains((String) it2.next())) {
                    }
                }
                if (z11 && !z10) {
                    return false;
                }
            } else if (z11) {
            }
        }
        return true;
    }

    public final Set q(Set set) {
        HashSet hashSet = new HashSet();
        Iterator it = set.iterator();
        while (it.hasNext()) {
            hashSet.add(r((String) it.next()));
        }
        return hashSet;
    }

    public final String r(String str) {
        String strN = p003kotlin.text.e0.N(str, '\\', '/', false, 4, null);
        Locale locale = Locale.ROOT;
        "ROOT" /* decoded XOR */;
        locale.getClass();
        String lowerCase = strN.toLowerCase(locale);
        "toLowerCase(...)" /* decoded XOR */;
        lowerCase.getClass();
        return lowerCase;
    }

    public final boolean s(a aVar, d dVar, com.neeeex.similar3p.f fVar) {
        boolean z10;
        Set setE = dVar.e();
        if (!(setE instanceof Collection) || !setE.isEmpty()) {
            Iterator it = setE.iterator();
            while (true) {
                if (!it.hasNext()) {
                    z10 = false;
                    break;
                }
                String str = (String) it.next();
                if (str.length() > 0 && k0.c0(aVar.d(), str, false, 2, null)) {
                    z10 = true;
                    break;
                }
            }
        } else {
            z10 = false;
            break;
        }
        return z10 || (aVar.b().isFile() && (aVar.b().length() > am.q.g(fVar.k(), 0L) ? 1 : (aVar.b().length() == am.q.g(fVar.k(), 0L) ? 0 : -1)) < 0);
    }

    public static final class c {
        public /* synthetic */ c(p003kotlin.jvm.internal.m mVar) {
            this();
        }

        public c() {
        }
    }
}