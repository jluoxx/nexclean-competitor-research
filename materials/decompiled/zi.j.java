package zi;

import android.content.Intent;
import androidx.fragment.app.l0;
import com.neeeex.ctools.features.appmanager.AppManagerNEEEEXActivity;
import com.neeeex.ctools.features.device.DeviceStatusNEEEEXActivity;
import com.neeeex.ctools.features.loading.CtoolsLoadingNEEEEXActivity;
import com.neeeex.ctools.features.networkspeed.NetworkSpeedNEEEEXActivity;
import com.neeeex.ctools.features.permission.UsagePermissionActivity;
import com.neeeex.eraser.R$string;
import com.neeeex.eraser.base.BaseStoragePermActivity;
import com.neeeex.eraser.m0;
import com.neeeex.eraser.module.dialog.FilePermDialog;
import com.neeeex.similar3p.y;
import com.neeeex.virus.VirusScanNEEEEXActivity;
import fl.t;
import fl.z;
import p003kotlin.jvm.functions.Function0;
import p003kotlin.jvm.internal.v;

/* JADX INFO: loaded from: classes7.dex */
public final class j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final BaseStoragePermActivity f104394a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final fl.n f104395b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public a f104396c;

    public static final /* synthetic */ class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f104400a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ int[] f104401b;

        static {
            int[] iArr = new int[p.values().length];
            try {
                iArr[p.JUNK_CLEANER.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[p.SCREENSHOTS.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[p.SIMILAR_IMAGES.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[p.DUPLICATE_MEDIA.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[p.LARGE_MEDIA.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[p.LARGE_FILES.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[p.DUPLICATE_DOCS.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[p.NETWORK_TRAFFIC.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr[p.APP_MANAGER.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr[p.PHOTO_COMPRESSOR.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr[p.RECENT_APPS.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                iArr[p.DEVICE_STATUS.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                iArr[p.NETWORK_SPEED.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                iArr[p.VIRUS_SCAN.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            f104400a = iArr;
            int[] iArr2 = new int[ei.b.values().length];
            try {
                iArr2[ei.b.RECENT_APPS.ordinal()] = 1;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                iArr2[ei.b.NETWORK_TRAFFIC.ordinal()] = 2;
            } catch (NoSuchFieldError unused16) {
            }
            f104401b = iArr2;
        }
    }

    public j(BaseStoragePermActivity baseStoragePermActivity) {
        m0.a("pOQGpdLT+M0=\n", "xYdyzKS6jLQ=\n");
        baseStoragePermActivity.getClass();
        this.f104394a = baseStoragePermActivity;
        this.f104395b = fl.o.b(new Function0() { // from class: zi.h
            @Override // p003kotlin.jvm.functions.Function0
            public final Object invoke() {
                return j.b(this.f104390a);
            }
        });
        this.f104396c = a.C1348a.f104397a;
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public static void a(j jVar) {
        BaseStoragePermActivity baseStoragePermActivity = jVar.f104394a;
        if (baseStoragePermActivity.checkStoragePermission(baseStoragePermActivity)) {
            jVar.i();
        } else {
            jVar.f104396c = a.c.f104399a;
            BaseStoragePermActivity.askPermission$default(jVar.f104394a, null, 1, null);
        }
    }

    public static yh.a b(j jVar) {
        return new yh.a(jVar.f104394a);
    }

    public static final void l(p pVar, j jVar, ei.b bVar) {
        m.f104407a.e(pVar);
        BaseStoragePermActivity baseStoragePermActivity = jVar.f104394a;
        baseStoragePermActivity.startActivity(UsagePermissionActivity.INSTANCE.a(baseStoragePermActivity, bVar));
        jVar.f104394a.finish();
    }

    public final yh.a d() {
        return (yh.a) this.f104395b.getValue();
    }

    public final void e(p pVar) {
        m0.a("EqLTuKGY0w==\n", "dMeyzNTqths=\n");
        pVar.getClass();
        switch (b.f104400a[pVar.ordinal()]) {
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
                h(pVar);
                break;
            case 8:
                k(pVar, ei.b.NETWORK_TRAFFIC, com.neeeex.ctools.features.loading.a.NETWORK_TRAFFIC);
                break;
            case 9:
                f(pVar, new Intent(this.f104394a, (Class<?>) AppManagerNEEEEXActivity.class));
                break;
            case 10:
                m();
                break;
            case 11:
                k(pVar, ei.b.RECENT_APPS, com.neeeex.ctools.features.loading.a.RECENT_APPS);
                break;
            case 12:
                f(pVar, new Intent(this.f104394a, (Class<?>) DeviceStatusNEEEEXActivity.class));
                break;
            case 13:
                f(pVar, new Intent(this.f104394a, (Class<?>) NetworkSpeedNEEEEXActivity.class));
                break;
            case 14:
                n();
                break;
            default:
                coil.util.j.a();
                break;
        }
    }

    public final void f(p pVar, Intent intent) {
        m.f104407a.e(pVar);
        this.f104394a.startActivity(intent);
        this.f104394a.finish();
    }

    public final void g() {
        this.f104396c = a.C1348a.f104397a;
        m.f104407a.e(p.PHOTO_COMPRESSOR);
        mi.a.f88870a.J();
        fi.a.f80895a.a(this.f104394a);
        this.f104394a.finish();
    }

    public final void h(p pVar) {
        y yVar;
        switch (b.f104400a[pVar.ordinal()]) {
            case 1:
                yVar = y.JUNK_FILES;
                break;
            case 2:
                yVar = y.SCREEN_CAPTURE_FILES;
                break;
            case 3:
                yVar = y.SIMILAR_IMAGES;
                break;
            case 4:
                yVar = y.DUPLICATE_MEDIA;
                break;
            case 5:
                yVar = y.LARGE_MEDIA;
                break;
            case 6:
                yVar = y.LARGE_DOCS;
                break;
            case 7:
                yVar = y.DUPLICATE_DOCS;
                break;
            default:
                return;
        }
        m.f104407a.e(pVar);
        com.neeeex.eraser.module.main.k.f65361a.a(this.f104394a, yVar);
        this.f104394a.finish();
    }

    public final void i() {
        this.f104396c = a.C1348a.f104397a;
        m.f104407a.e(p.VIRUS_SCAN);
        this.f104394a.startActivity(new Intent(this.f104394a, (Class<?>) VirusScanNEEEEXActivity.class));
        this.f104394a.finish();
    }

    public final void j() {
        a aVar = this.f104396c;
        a.C1348a c1348a = a.C1348a.f104397a;
        this.f104396c = c1348a;
        if (v.c(aVar, c1348a)) {
            return;
        }
        if (v.c(aVar, a.b.f104398a)) {
            g();
        } else if (v.c(aVar, a.c.f104399a)) {
            i();
        } else {
            coil.util.j.a();
        }
    }

    public final void k(final p pVar, final ei.b bVar, com.neeeex.ctools.features.loading.a aVar) {
        t tVarA;
        if (d().b()) {
            f(pVar, CtoolsLoadingNEEEEXActivity.INSTANCE.a(this.f104394a, aVar));
            return;
        }
        int i10 = b.f104401b[bVar.ordinal()];
        if (i10 == 1) {
            tVarA = z.a(Integer.valueOf(R$string.ctools_neeeex_recent_apps_permission_title), Integer.valueOf(R$string.ctools_neeeex_recent_apps_permission_body));
        } else {
            if (i10 != 2) {
                coil.util.j.a();
                return;
            }
            tVarA = z.a(Integer.valueOf(R$string.ctools_neeeex_network_traffic_permission_title), Integer.valueOf(R$string.ctools_neeeex_network_traffic_permission_body));
        }
        FilePermDialog filePermDialogA = FilePermDialog.INSTANCE.a(((Number) tVarA.component1()).intValue(), ((Number) tVarA.component2()).intValue(), R$string.dialog_neeeex_file_perm_agree);
        filePermDialogA.q(new ki.a() { // from class: zi.i
            @Override // ki.a
            public final void a() {
                j.l(pVar, this, bVar);
            }
        });
        l0 supportFragmentManager = this.f104394a.getSupportFragmentManager();
        m0.a("LgYvGYLn6PU7Fx04lvD1/ycXFiuZ9v//O0t1ZNm+\n", "SWNbSveXmJo=\n");
        supportFragmentManager.getClass();
        filePermDialogA.i(supportFragmentManager);
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public final void m() {
        BaseStoragePermActivity baseStoragePermActivity = this.f104394a;
        if (baseStoragePermActivity.checkStoragePermission(baseStoragePermActivity)) {
            g();
        } else {
            this.f104396c = a.b.f104398a;
            BaseStoragePermActivity.askPermission$default(this.f104394a, null, 1, null);
        }
    }

    public final void n() {
        this.f104396c = a.C1348a.f104397a;
        mi.a.f88870a.A1();
        com.neeeex.virus.l.k(this.f104394a, new Runnable() { // from class: zi.g
            @Override // java.lang.Runnable
            public final void run() {
                j.a(this.f104389a);
            }
        });
    }

    public static abstract class a {

        /* JADX INFO: renamed from: zi.j$a$a, reason: collision with other inner class name */
        public static final class C1348a extends a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final C1348a f104397a = new C1348a();

            public C1348a() {
                super(null);
            }
        }

        public static final class b extends a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final b f104398a = new b();

            public b() {
                super(null);
            }
        }

        public static final class c extends a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final c f104399a = new c();

            public c() {
                super(null);
            }
        }

        public /* synthetic */ a(p003kotlin.jvm.internal.m mVar) {
            this();
        }

        public a() {
        }
    }
}