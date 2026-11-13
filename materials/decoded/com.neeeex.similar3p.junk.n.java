package com.neeeex.similar3p.junk;

import com.neeeex.eraser.m0;
import gl.b1;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Set;
import p003kotlin.jvm.functions.Function0;
import p003kotlin.jvm.functions.Function1;
import p003kotlin.text.k0;

/* JADX INFO: loaded from: classes7.dex */
public final class n {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final a f66368g = new a(null);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final Set f66369h = b1.k("data" /* decoded XOR */, "obb" /* decoded XOR */);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final c f66370a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f66371b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List f66372c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final File f66373d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final List f66374e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Set f66375f;

    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final d f66376a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Function0 f66377b;

        public b(d dVar, Function0 function0) {
            "reason" /* decoded XOR */;
            dVar.getClass();
            "rejected" /* decoded XOR */;
            function0.getClass();
            this.f66376a = dVar;
            this.f66377b = function0;
        }

        public final d a() {
            return this.f66376a;
        }

        public final Function0 b() {
            return this.f66377b;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return this.f66376a == bVar.f66376a && p003kotlin.jvm.internal.v.c(this.f66377b, bVar.f66377b);
        }

        public int hashCode() {
            return (this.f66376a.hashCode() * 31) + this.f66377b.hashCode();
        }

        public String toString() {
            return "RejectionProbe(reason=" + this.f66376a + ", rejected=" + this.f66377b + ")";
        }
    }

    public static final class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final File f66378a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final File f66379b;

        public c(File file, File file2) {
            "requested" /* decoded XOR */;
            file.getClass();
            "canonical" /* decoded XOR */;
            file2.getClass();
            this.f66378a = file;
            this.f66379b = file2;
        }

        public final File a() {
            return this.f66379b;
        }

        public final File b() {
            return this.f66378a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            return p003kotlin.jvm.internal.v.c(this.f66378a, cVar.f66378a) && p003kotlin.jvm.internal.v.c(this.f66379b, cVar.f66379b);
        }

        public int hashCode() {
            return (this.f66378a.hashCode() * 31) + this.f66379b.hashCode();
        }

        public String toString() {
            return "RootMapping(requested=" + this.f66378a + ", canonical=" + this.f66379b + ")";
        }
    }

    public enum d {
        SYMBOLIC_LINK,
        OUTSIDE_ROOTS,
        OTHER_APP_PRIVATE;


        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ ml.a f66381b = ml.b.a(d());

        public static ml.a getEntries() {
            return f66381b;
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

    public static final class f implements Comparator {
        @Override // java.util.Comparator
        public final int compare(Object obj, Object obj2) {
            return jl.c.e(Integer.valueOf(((c) obj2).b().getPath().length()), Integer.valueOf(((c) obj).b().getPath().length()));
        }
    }

    public n(File file, List list) throws IOException {
        Object objM372constructorimpl;
        "storageRoot" /* decoded XOR */;
        file.getClass();
        "ownCacheRoots" /* decoded XOR */;
        list.getClass();
        File absoluteFile = file.getAbsoluteFile();
        "getAbsoluteFile(...)" /* decoded XOR */;
        absoluteFile.getClass();
        File fileR = ql.m.r(absoluteFile);
        File canonicalFile = file.getCanonicalFile();
        "getCanonicalFile(...)" /* decoded XOR */;
        canonicalFile.getClass();
        this.f66370a = new c(fileR, canonicalFile);
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            File file2 = (File) it.next();
            try {
                fl.u.a aVar = fl.u.Companion;
                File absoluteFile2 = file2.getAbsoluteFile();
                "getAbsoluteFile(...)" /* decoded XOR */;
                absoluteFile2.getClass();
                File fileR2 = ql.m.r(absoluteFile2);
                File canonicalFile2 = file2.getCanonicalFile();
                "getCanonicalFile(...)" /* decoded XOR */;
                canonicalFile2.getClass();
                objM372constructorimpl = fl.u.m372constructorimpl(new c(fileR2, canonicalFile2));
            } catch (Throwable th2) {
                fl.u.a aVar2 = fl.u.Companion;
                objM372constructorimpl = fl.u.m372constructorimpl(fl.v.a(th2));
            }
            c cVar = (c) (fl.u.m377isFailureimpl(objM372constructorimpl) ? null : objM372constructorimpl);
            if (cVar != null) {
                arrayList.add(cVar);
            }
        }
        HashSet hashSet = new HashSet();
        ArrayList arrayList2 = new ArrayList();
        for (Object obj : arrayList) {
            if (hashSet.add(((c) obj).a().getPath())) {
                arrayList2.add(obj);
            }
        }
        this.f66371b = arrayList2;
        this.f66372c = gl.g0.V0(gl.g0.L0(gl.v.e(this.f66370a), arrayList2), new f());
        this.f66373d = this.f66370a.a();
        ArrayList arrayList3 = arrayList2;
        ArrayList arrayList4 = new ArrayList(gl.x.x(arrayList3, 10));
        Iterator it2 = arrayList3.iterator();
        while (it2.hasNext()) {
            arrayList4.add(((c) it2.next()).a());
        }
        this.f66374e = arrayList4;
        this.f66375f = b1.k("download" /* decoded XOR */, "dcim" /* decoded XOR */, "pictures" /* decoded XOR */, "movies" /* decoded XOR */, "music" /* decoded XOR */, "documents" /* decoded XOR */);
    }

    public static boolean a(n nVar, File file) {
        return nVar.p(file);
    }

    public static boolean b(n nVar, File file) {
        return nVar.l(file);
    }

    public static boolean c(n nVar, File file) {
        return !nVar.r(file);
    }

    public static boolean d(n nVar, File file) {
        if (!nVar.o(file)) {
            return false;
        }
        List list = nVar.f66374e;
        if ((list instanceof Collection) && list.isEmpty()) {
            return true;
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            if (nVar.m(file, (File) it.next())) {
                return false;
            }
        }
        return true;
    }

    public static boolean e(n nVar, File file, File file2) {
        return nVar.k(file, file2);
    }

    public static boolean f(n nVar, File file, File file2) {
        return nVar.t(file, file2) != null;
    }

    public static String g(String str) {
        "it" /* decoded XOR */;
        str.getClass();
        Locale locale = Locale.ROOT;
        "ROOT" /* decoded XOR */;
        locale.getClass();
        String lowerCase = str.toLowerCase(locale);
        "toLowerCase(...)" /* decoded XOR */;
        lowerCase.getClass();
        return lowerCase;
    }

    public final File h(File file) {
        "file" /* decoded XOR */;
        file.getClass();
        try {
            return file.getCanonicalFile();
        } catch (Exception unused) {
            return null;
        }
    }

    public final List i(final File file, final File file2) {
        return gl.w.p(new Function0() { // from class: com.neeeex.similar3p.junk.j
            @Override // p003kotlin.jvm.functions.Function0
            public final Object invoke() {
                return Boolean.valueOf(n.f(this.f66361a, file, file2));
            }
        }, new Function0() { // from class: com.neeeex.similar3p.junk.k
            @Override // p003kotlin.jvm.functions.Function0
            public final Object invoke() {
                return Boolean.valueOf(n.b(this.f66364a, file2));
            }
        }, new Function0() { // from class: com.neeeex.similar3p.junk.l
            @Override // p003kotlin.jvm.functions.Function0
            public final Object invoke() {
                return Boolean.valueOf(n.a(this.f66366a, file2));
            }
        });
    }

    public final File j(b0 b0Var) {
        "item" /* decoded XOR */;
        b0Var.getClass();
        File fileB = b0Var.b();
        File fileH = h(fileB);
        if (fileH == null) {
            return null;
        }
        for (Function0 function0 : i(fileB, fileH)) {
            if (fileH == null || ((Boolean) function0.invoke()).booleanValue()) {
                fileH = null;
            }
        }
        if (fileH == null || !n(fileH)) {
            return null;
        }
        return fileH;
    }

    public final boolean k(File file, File file2) {
        Object next;
        File absoluteFile = file.getAbsoluteFile();
        "getAbsoluteFile(...)" /* decoded XOR */;
        absoluteFile.getClass();
        File fileR = ql.m.r(absoluteFile);
        Iterator it = this.f66372c.iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (!m(fileR, ((c) next).b()));
        c cVar = (c) next;
        if (cVar == null) {
            return false;
        }
        File absoluteFile2 = new File(cVar.a(), ql.m.u(fileR, cVar.b()).getPath()).getAbsoluteFile();
        "getAbsoluteFile(...)" /* decoded XOR */;
        absoluteFile2.getClass();
        return !p003kotlin.jvm.internal.v.c(file2.getPath(), ql.m.r(absoluteFile2).getPath());
    }

    public final boolean l(File file) {
        if (p003kotlin.jvm.internal.v.c(file, this.f66373d)) {
            return true;
        }
        List list = this.f66374e;
        if ((list instanceof Collection) && list.isEmpty()) {
            return false;
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            if (p003kotlin.jvm.internal.v.c(file, (File) it.next())) {
                return true;
            }
        }
        return false;
    }

    public final boolean m(File file, File file2) {
        if (p003kotlin.jvm.internal.v.c(file, file2)) {
            return true;
        }
        String path = file2.getPath();
        "getPath(...)" /* decoded XOR */;
        path.getClass();
        String str = k0.z1(path, File.separatorChar) + File.separator;
        String path2 = file.getPath();
        "getPath(...)" /* decoded XOR */;
        path2.getClass();
        return p003kotlin.text.e0.U(path2, str, false, 2, null);
    }

    public final boolean n(File file) {
        String[] list;
        if (file.isFile()) {
            return true;
        }
        return file.isDirectory() && (list = file.list()) != null && list.length == 0;
    }

    public final boolean o(File file) {
        Object objM372constructorimpl;
        if (!m(file, this.f66373d)) {
            return false;
        }
        try {
            fl.u.a aVar = fl.u.Companion;
            objM372constructorimpl = fl.u.m372constructorimpl(ql.m.u(file, this.f66373d));
        } catch (Throwable th2) {
            fl.u.a aVar2 = fl.u.Companion;
            objM372constructorimpl = fl.u.m372constructorimpl(fl.v.a(th2));
        }
        if (fl.u.m375exceptionOrNullimpl(objM372constructorimpl) != null) {
            return true;
        }
        Iterator it = to.v.K(to.v.z(k0.Y0(ql.m.q((File) objM372constructorimpl), new char[]{'/'}, false, 0, 6, null), e.INSTANCE), new Function1() { // from class: com.neeeex.similar3p.junk.m
            @Override // p003kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return n.g((String) obj);
            }
        }).iterator();
        if (it.hasNext() && p003kotlin.jvm.internal.v.c(it.next(), "android" /* decoded XOR */) && it.hasNext()) {
            return f66369h.contains(it.next());
        }
        return false;
    }

    public final boolean p(File file) {
        if (!p003kotlin.jvm.internal.v.c(file.getParentFile(), this.f66373d)) {
            return false;
        }
        Set set = this.f66375f;
        String name = file.getName();
        "getName(...)" /* decoded XOR */;
        name.getClass();
        Locale locale = Locale.ROOT;
        "ROOT" /* decoded XOR */;
        locale.getClass();
        String lowerCase = name.toLowerCase(locale);
        "toLowerCase(...)" /* decoded XOR */;
        lowerCase.getClass();
        return set.contains(lowerCase);
    }

    public final boolean q(File file) {
        "file" /* decoded XOR */;
        file.getClass();
        File fileH = h(file);
        return fileH != null && t(file, fileH) == null;
    }

    public final boolean r(File file) {
        if (m(file, this.f66373d)) {
            return true;
        }
        List list = this.f66374e;
        if ((list instanceof Collection) && list.isEmpty()) {
            return false;
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            if (m(file, (File) it.next())) {
                return true;
            }
        }
        return false;
    }

    public final List s(final File file, final File file2) {
        return gl.w.p(new b(d.SYMBOLIC_LINK, new Function0() { // from class: com.neeeex.similar3p.junk.g
            @Override // p003kotlin.jvm.functions.Function0
            public final Object invoke() {
                return Boolean.valueOf(n.e(this.f66343a, file, file2));
            }
        }), new b(d.OUTSIDE_ROOTS, new Function0() { // from class: com.neeeex.similar3p.junk.h
            @Override // p003kotlin.jvm.functions.Function0
            public final Object invoke() {
                return Boolean.valueOf(n.c(this.f66348a, file2));
            }
        }), new b(d.OTHER_APP_PRIVATE, new Function0() { // from class: com.neeeex.similar3p.junk.i
            @Override // p003kotlin.jvm.functions.Function0
            public final Object invoke() {
                return Boolean.valueOf(n.d(this.f66357a, file2));
            }
        }));
    }

    public final d t(File file, File file2) {
        Object next;
        Iterator it = s(file, file2).iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (!((Boolean) ((b) next).b().invoke()).booleanValue());
        b bVar = (b) next;
        if (bVar != null) {
            return bVar.a();
        }
        return null;
    }

    public static final class a {
        public /* synthetic */ a(p003kotlin.jvm.internal.m mVar) {
            this();
        }

        public a() {
        }
    }
}