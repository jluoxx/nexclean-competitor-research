package com.neeeex.ctools.features.device;

import android.app.ActivityManager;
import android.app.usage.StorageStatsManager;
import android.content.Context;
import android.content.Intent;
import android.graphics.Rect;
import android.hardware.SensorManager;
import android.os.BatteryManager;
import android.os.Build;
import android.os.Environment;
import android.os.StatFs;
import android.os.storage.StorageManager;
import android.util.DisplayMetrics;
import android.view.Display;
import android.view.WindowManager;
import android.view.WindowMetrics;
import com.neeeex.eraser.m0;
import fl.z;
import gl.g0;
import gl.v0;
import gl.w;
import java.util.Collection;
import java.util.EnumMap;
import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.Map;
import java.util.UUID;
import p003kotlin.jvm.functions.Function0;
import p003kotlin.jvm.functions.Function1;
import p003kotlin.text.k0;

/* JADX INFO: loaded from: classes7.dex */
public final class s {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final b f64305b = new b(null);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final u f64306c = new u(0, 0, 0);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f64307a;

    public final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Intent f64308a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Integer f64309b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ s f64310c;

        public a(s sVar, Intent intent, Integer num) {
            m0.a("o7iens/g\n", "0Nfr7KyFZ50=\n");
            intent.getClass();
            this.f64310c = sVar;
            this.f64308a = intent;
            this.f64309b = num;
        }

        public final com.neeeex.ctools.features.device.b a() {
            String string;
            int intExtra = this.f64308a.getIntExtra(m0.a("CWPDj8uA\n", "YQai47/oI+Y=\n"), 1);
            Integer num = this.f64309b;
            com.neeeex.ctools.features.device.e eVar = com.neeeex.ctools.features.device.e.f64282a;
            long jW = this.f64310c.w();
            Integer num2 = this.f64309b;
            com.neeeex.ctools.features.device.a aVarA = eVar.a(jW, num2 != null ? num2.intValue() : 0);
            Integer numV = this.f64310c.v(this.f64308a, m0.a("tDtCPrudYg==\n", "wlQuStr6Bw0=\n"));
            Integer numT = this.f64310c.t(this.f64308a, m0.a("KOQMgDkhgX8p8wQ=\n", "XIFh8FxT4As=\n"));
            String str = null;
            Double dValueOf = numT != null ? Double.valueOf(((double) numT.intValue()) / 10.0d) : null;
            int intExtra2 = this.f64308a.getIntExtra(m0.a("/Bk92oCn\n", "j21crvXUSts=\n"), 1);
            int intExtra3 = this.f64308a.getIntExtra(m0.a("tetb8VtjEA==\n", "xYculjwGdOk=\n"), 0);
            String stringExtra = this.f64308a.getStringExtra(m0.a("9axB/MVosHzmsA==\n", "gckilKsH3BM=\n"));
            if (stringExtra != null && (string = k0.x1(stringExtra).toString()) != null && !k0.r0(string)) {
                str = string;
            }
            return new com.neeeex.ctools.features.device.b(intExtra, num, aVarA, numV, dValueOf, intExtra2, intExtra3, str);
        }
    }

    public static final class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f64311a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Function0 f64312b;

        public c(int i10, Function0 function0) {
            m0.a("Fg51QhINB6oX\n", "eX4QMHN5bsU=\n");
            function0.getClass();
            this.f64311a = i10;
            this.f64312b = function0;
        }

        public final Function0 a() {
            return this.f64312b;
        }

        public final int b() {
            return this.f64311a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            return this.f64311a == cVar.f64311a && p003kotlin.jvm.internal.v.c(this.f64312b, cVar.f64312b);
        }

        public int hashCode() {
            return (Integer.hashCode(this.f64311a) * 31) + this.f64312b.hashCode();
        }

        public String toString() {
            return "ScanStage(progress=" + this.f64311a + ", operation=" + this.f64312b + ")";
        }
    }

    public final class d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public fl.t f64313a = z.a("", "");

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public u f64314b = s.f64305b.a();

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public u f64315c = s.f64305b.a();

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public v f64316d = new v(0, 0, 0, false);

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public Map f64317e = v0.k();

        public d() {
        }

        public final void a(fl.t tVar) {
            m0.a("AzIvPfWz4w==\n", "P0FKSdiM3Tk=\n");
            tVar.getClass();
            this.f64313a = tVar;
        }

        public final void b(u uVar) {
            m0.a("NmTGYO5xOw==\n", "ChejFMNOBRY=\n");
            uVar.getClass();
            this.f64314b = uVar;
        }

        public final void c(v vVar) {
            m0.a("ojFeYe5OUA==\n", "nkI7FcNxbvA=\n");
            vVar.getClass();
            this.f64316d = vVar;
        }

        public final void d(Map map) {
            m0.a("V5nJRy/1TQ==\n", "a+qsMwLKc2Q=\n");
            map.getClass();
            this.f64317e = map;
        }

        public final void e(u uVar) {
            m0.a("RbAfHolf3w==\n", "ecN6aqRg4SM=\n");
            uVar.getClass();
            this.f64315c = uVar;
        }

        public final t f() {
            return new t((String) this.f64313a.getFirst(), (String) this.f64313a.getSecond(), Build.VERSION.SDK_INT, this.f64314b, this.f64315c, this.f64316d, this.f64317e);
        }
    }

    public static final class e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final long f64319a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final long f64320b;

        public e(long j10, long j11) {
            this.f64319a = j10;
            this.f64320b = j11;
        }

        public final long a() {
            return this.f64319a;
        }

        public final long b() {
            return this.f64319a - this.f64320b;
        }

        public final e c() {
            long jG = am.q.g(this.f64319a, 0L);
            return new e(jG, am.q.r(this.f64320b, 0L, jG));
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof e)) {
                return false;
            }
            e eVar = (e) obj;
            return this.f64319a == eVar.f64319a && this.f64320b == eVar.f64320b;
        }

        public int hashCode() {
            return (Long.hashCode(this.f64319a) * 31) + Long.hashCode(this.f64320b);
        }

        public String toString() {
            return "StorageSpace(total=" + this.f64319a + ", free=" + this.f64320b + ")";
        }
    }

    public static final /* synthetic */ class f extends p003kotlin.jvm.internal.s implements Function0 {
        public f(Object obj) {
            super(0, obj, s.class, m0.a("JtEDHkdQl+wFyQ0YQFiA1zfRFw9S\n", "Vr1iaiE/5YE=\n"), m0.a("OHkEgga0HY0bYQqEAbwKtil5EJMT80asI3oRmgm1QLApfBfN\n", "SBVl9mDbb+A=\n"), 0);
        }

        @Override // p003kotlin.jvm.functions.Function0
        public final fl.t invoke() {
            return ((s) this.receiver).u();
        }
    }

    public static final /* synthetic */ class g extends p003kotlin.jvm.internal.s implements Function0 {
        public g(Object obj) {
            super(0, obj, s.class, m0.a("BmsVTXFhP7gFfBNLd04NoB9rAQ==\n", "ag5yLBIYbMw=\n"), m0.a("p7d5bt+lZDekoH9o2YpWL763bSeVkFwsv753YZOMViq56Q==\n", "y9IeD7zcN0M=\n"), 0);
        }

        @Override // p003kotlin.jvm.functions.Function0
        public final fl.t invoke() {
            return ((s) this.receiver).s();
        }
    }

    public s(Context context) {
        m0.a("YR4Ij9eWJw==\n", "AnFm+7LuUy8=\n");
        context.getClass();
        this.f64307a = context.getApplicationContext();
    }

    public static /* synthetic */ t D(s sVar, Function1 function1, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            function1 = new Function1() { // from class: com.neeeex.ctools.features.device.r
                @Override // p003kotlin.jvm.functions.Function1
                public final Object invoke(Object obj2) {
                    return s.g(((Integer) obj2).intValue());
                }
            };
        }
        return sVar.C(function1);
    }

    public static fl.m0 a(d dVar, s sVar) {
        dVar.b(sVar.x());
        return fl.m0.f80959a;
    }

    public static fl.m0 b(d dVar, s sVar) {
        dVar.d(sVar.z());
        return fl.m0.f80959a;
    }

    public static fl.m0 c() {
        return fl.m0.f80959a;
    }

    public static fl.m0 d(d dVar, s sVar) {
        dVar.e(sVar.A());
        return fl.m0.f80959a;
    }

    public static fl.m0 e(d dVar, s sVar) {
        dVar.a(sVar.r());
        return fl.m0.f80959a;
    }

    public static fl.m0 f(d dVar, s sVar) {
        dVar.c(sVar.y());
        return fl.m0.f80959a;
    }

    public static fl.m0 g(int i10) {
        return fl.m0.f80959a;
    }

    public static fl.t h(bm.h hVar) {
        m0.a("C73XwA==\n", "edi2pHI4oUY=\n");
        hVar.getClass();
        return (fl.t) ((Function0) hVar).invoke();
    }

    public final u A() {
        fl.t tVar = (fl.t) to.v.D(to.v.M(to.s.t(new f(this), new g(this)), new Function1() { // from class: com.neeeex.ctools.features.device.q
            @Override // p003kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return s.h((bm.h) obj);
            }
        }));
        return tVar == null ? f64306c : E(((Number) tVar.getFirst()).longValue(), ((Number) tVar.getSecond()).longValue());
    }

    public final Rect B(WindowManager windowManager) {
        Display defaultDisplay;
        if (Build.VERSION.SDK_INT < 30 || windowManager == null) {
            DisplayMetrics displayMetrics = new DisplayMetrics();
            if (windowManager != null && (defaultDisplay = windowManager.getDefaultDisplay()) != null) {
                defaultDisplay.getRealMetrics(displayMetrics);
            }
            return new Rect(0, 0, displayMetrics.widthPixels, displayMetrics.heightPixels);
        }
        WindowMetrics currentWindowMetrics = windowManager.getCurrentWindowMetrics();
        m0.a("/F8olJgWQcT1Tgu+gwBc1tZfKKWEB0CJtRRy/g==\n", "mzpc1+1kM6E=\n");
        currentWindowMetrics.getClass();
        Rect bounds = currentWindowMetrics.getBounds();
        m0.a("4Dl8RvCxslL0dCYqse0=\n", "h1wIBJ/E3DY=\n");
        bounds.getClass();
        return bounds;
    }

    public final t C(Function1 function1) {
        m0.a("fz+HdPtBwotjIg==\n", "EFHXBpQmsO4=\n");
        function1.getClass();
        final d dVar = new d();
        for (c cVar : w.p(new c(0, new Function0() { // from class: com.neeeex.ctools.features.device.k
            @Override // p003kotlin.jvm.functions.Function0
            public final Object invoke() {
                return s.c();
            }
        }), new c(15, new Function0() { // from class: com.neeeex.ctools.features.device.l
            @Override // p003kotlin.jvm.functions.Function0
            public final Object invoke() {
                return s.e(dVar, this);
            }
        }), new c(35, new Function0() { // from class: com.neeeex.ctools.features.device.m
            @Override // p003kotlin.jvm.functions.Function0
            public final Object invoke() {
                return s.a(dVar, this);
            }
        }), new c(60, new Function0() { // from class: com.neeeex.ctools.features.device.n
            @Override // p003kotlin.jvm.functions.Function0
            public final Object invoke() {
                return s.d(dVar, this);
            }
        }), new c(80, new Function0() { // from class: com.neeeex.ctools.features.device.o
            @Override // p003kotlin.jvm.functions.Function0
            public final Object invoke() {
                return s.f(dVar, this);
            }
        }), new c(100, new Function0() { // from class: com.neeeex.ctools.features.device.p
            @Override // p003kotlin.jvm.functions.Function0
            public final Object invoke() {
                return s.b(dVar, this);
            }
        }))) {
            cVar.a().invoke();
            function1.invoke(Integer.valueOf(cVar.b()));
        }
        return dVar.f();
    }

    public final u E(long j10, long j11) {
        e eVarC = new e(j10, j11).c();
        return new u(eVarC.b(), eVarC.a(), com.neeeex.ctools.features.device.e.f64282a.b(eVarC.b(), eVarC.a()));
    }

    public final com.neeeex.ctools.features.device.b p(Intent intent) {
        m0.a("6o4KTr1T\n", "g+B+K9MnkOQ=\n");
        intent.getClass();
        return new a(this, intent, q(intent)).a();
    }

    public final Integer q(Intent intent) {
        int intExtra = intent.getIntExtra(m0.a("Kyo6Dw0=\n", "R09MamENLdc=\n"), -1);
        Integer numValueOf = Integer.valueOf(intent.getIntExtra(m0.a("xLAn7sU=\n", "t9NGgqBGAAA=\n"), -1));
        if (numValueOf.intValue() <= 0 || intExtra < 0) {
            numValueOf = null;
        }
        if (numValueOf != null) {
            return Integer.valueOf(am.q.p((int) ((((double) intExtra) * 100.0d) / ((double) numValueOf.intValue())), 0, 100));
        }
        return null;
    }

    public final fl.t r() {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        String[] strArr = {Build.BRAND, Build.MODEL};
        for (int i10 = 0; i10 < 2; i10++) {
            String str = strArr[i10];
            str.getClass();
            String string = k0.x1(str).toString();
            if (string.length() > 0) {
                String lowerCase = string.toLowerCase(Locale.ROOT);
                m0.a("nEbTslNHlxeJWvr1CgzLfQ==\n", "6Cmf3SQi5VQ=\n");
                lowerCase.getClass();
                linkedHashMap.putIfAbsent(lowerCase, string);
            }
        }
        Collection collectionValues = linkedHashMap.values();
        m0.a("MEdS3Ren5H95RUSXEv+rPSU=\n", "DCA3qTrRhRM=\n");
        collectionValues.getClass();
        String strY0 = g0.y0(collectionValues, " ", null, null, 0, null, null, 62, null);
        String str2 = Build.VERSION.RELEASE;
        if (str2 == null) {
            str2 = "";
        }
        return z.a(strY0, str2);
    }

    public final fl.t s() {
        Object objM372constructorimpl;
        try {
            fl.u.a aVar = fl.u.Companion;
            StatFs statFs = new StatFs(Environment.getDataDirectory().getAbsolutePath());
            objM372constructorimpl = fl.u.m372constructorimpl(z.a(Long.valueOf(statFs.getTotalBytes()), Long.valueOf(statFs.getAvailableBytes())));
        } catch (Throwable th2) {
            fl.u.a aVar2 = fl.u.Companion;
            objM372constructorimpl = fl.u.m372constructorimpl(fl.v.a(th2));
        }
        if (fl.u.m377isFailureimpl(objM372constructorimpl)) {
            objM372constructorimpl = null;
        }
        return (fl.t) objM372constructorimpl;
    }

    public final Integer t(Intent intent, String str) {
        Integer numValueOf = Integer.valueOf(intent.getIntExtra(str, Integer.MIN_VALUE));
        if (numValueOf.intValue() == Integer.MIN_VALUE) {
            return null;
        }
        return numValueOf;
    }

    public final fl.t u() {
        Object objM372constructorimpl;
        try {
            fl.u.a aVar = fl.u.Companion;
            Object systemService = this.f64307a.getSystemService((Class<Object>) StorageStatsManager.class);
            if (systemService == null) {
                throw new IllegalStateException(m0.a("DdJa9qiMXpx/wUrvtJsbjz7EC+20klfW\n", "X7crg8H+O/g=\n").toString());
            }
            StorageStatsManager storageStatsManager = (StorageStatsManager) systemService;
            UUID uuid = StorageManager.UUID_DEFAULT;
            objM372constructorimpl = fl.u.m372constructorimpl(z.a(Long.valueOf(storageStatsManager.getTotalBytes(uuid)), Long.valueOf(storageStatsManager.getFreeBytes(uuid))));
            if (fl.u.m377isFailureimpl(objM372constructorimpl)) {
                objM372constructorimpl = null;
            }
            return (fl.t) objM372constructorimpl;
        } catch (Throwable th2) {
            fl.u.a aVar2 = fl.u.Companion;
            objM372constructorimpl = fl.u.m372constructorimpl(fl.v.a(th2));
        }
    }

    public final Integer v(Intent intent, String str) {
        Integer numValueOf = Integer.valueOf(intent.getIntExtra(str, -1));
        if (numValueOf.intValue() > 0) {
            return numValueOf;
        }
        return null;
    }

    public final long w() {
        Object objM372constructorimpl;
        try {
            fl.u.a aVar = fl.u.Companion;
            Object systemService = this.f64307a.getSystemService(m0.a("0faQ8dMaixjS+YXi0xo=\n", "s5fkhbZo8nU=\n"));
            BatteryManager batteryManager = systemService instanceof BatteryManager ? (BatteryManager) systemService : null;
            objM372constructorimpl = fl.u.m372constructorimpl(Long.valueOf(batteryManager != null ? batteryManager.getLongProperty(1) : Long.MIN_VALUE));
        } catch (Throwable th2) {
            fl.u.a aVar2 = fl.u.Companion;
            objM372constructorimpl = fl.u.m372constructorimpl(fl.v.a(th2));
        }
        if (fl.u.m377isFailureimpl(objM372constructorimpl)) {
            objM372constructorimpl = Long.MIN_VALUE;
        }
        return ((Number) objM372constructorimpl).longValue();
    }

    public final u x() {
        Object objM372constructorimpl;
        Object systemService = this.f64307a.getSystemService(m0.a("Xg68FkDwjWU=\n", "P23IfzaZ+Rw=\n"));
        ActivityManager activityManager = systemService instanceof ActivityManager ? (ActivityManager) systemService : null;
        if (activityManager == null) {
            return f64306c;
        }
        try {
            fl.u.a aVar = fl.u.Companion;
            ActivityManager.MemoryInfo memoryInfo = new ActivityManager.MemoryInfo();
            activityManager.getMemoryInfo(memoryInfo);
            objM372constructorimpl = fl.u.m372constructorimpl(E(memoryInfo.totalMem, memoryInfo.availMem));
        } catch (Throwable th2) {
            fl.u.a aVar2 = fl.u.Companion;
            objM372constructorimpl = fl.u.m372constructorimpl(fl.v.a(th2));
        }
        u uVar = f64306c;
        if (fl.u.m377isFailureimpl(objM372constructorimpl)) {
            objM372constructorimpl = uVar;
        }
        return (u) objM372constructorimpl;
    }

    public final v y() {
        Object systemService = this.f64307a.getSystemService(m0.a("8GGf0Cw3\n", "hwjxtENAQZ4=\n"));
        Rect rectB = B(systemService instanceof WindowManager ? (WindowManager) systemService : null);
        return new v(am.q.f(rectB.width(), 0), am.q.f(rectB.height(), 0), this.f64307a.getResources().getDisplayMetrics().densityDpi, this.f64307a.getPackageManager().hasSystemFeature(m0.a("D6/w9kQ1sMUGoObgXD2mjkC1+/FINKeIHKTx6gUxoYcaqODrXj+8\n", "bsGUhCtc1Os=\n")));
    }

    public final Map z() {
        Object systemService = this.f64307a.getSystemService(m0.a("daWX7Yl8\n", "BsD5nuYOiTQ=\n"));
        SensorManager sensorManager = systemService instanceof SensorManager ? (SensorManager) systemService : null;
        EnumMap enumMap = new EnumMap(com.neeeex.ctools.features.device.c.class);
        for (com.neeeex.ctools.features.device.c cVar : com.neeeex.ctools.features.device.c.getEntries()) {
            enumMap.put(cVar, Boolean.valueOf((sensorManager != null ? sensorManager.getDefaultSensor(cVar.getSensorType()) : null) != null));
        }
        return enumMap;
    }

    public static final class b {
        public /* synthetic */ b(p003kotlin.jvm.internal.m mVar) {
            this();
        }

        public final u a() {
            return s.f64306c;
        }

        public b() {
        }
    }
}