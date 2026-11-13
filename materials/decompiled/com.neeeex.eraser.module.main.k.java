package com.neeeex.eraser.module.main;

import android.app.Activity;
import android.content.Intent;
import com.neeeex.similar3p.ScanNEEEEXActivity;
import com.neeeex.similar3p.junk.ui.JunkScanNEEEEXActivity;
import p003kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes7.dex */
public final class k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final k f65361a = new k();

    public static final /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f65362a;

        static {
            int[] iArr = new int[com.neeeex.similar3p.y.values().length];
            try {
                iArr[com.neeeex.similar3p.y.LARGE_DOCS.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[com.neeeex.similar3p.y.DUPLICATE_DOCS.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[com.neeeex.similar3p.y.LARGE_MEDIA.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[com.neeeex.similar3p.y.DUPLICATE_MEDIA.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[com.neeeex.similar3p.y.SIMILAR_IMAGES.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[com.neeeex.similar3p.y.JUNK_FILES.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[com.neeeex.similar3p.y.SCREEN_CAPTURE_FILES.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            f65362a = iArr;
        }
    }

    public final void a(Activity activity, com.neeeex.similar3p.y yVar) {
        Intent intentPutExtra;
        com.neeeex.eraser.m0.a("0X+88oPZ/DM=\n", "sBzIm/WwiEo=\n");
        activity.getClass();
        com.neeeex.eraser.m0.a("ZtRKLA==\n", "Eq06SR9hchM=\n");
        yVar.getClass();
        b(yVar).invoke();
        if (yVar == com.neeeex.similar3p.y.JUNK_FILES) {
            intentPutExtra = new Intent(activity, (Class<?>) JunkScanNEEEEXActivity.class);
        } else {
            intentPutExtra = new Intent(activity, (Class<?>) ScanNEEEEXActivity.class).putExtra(com.neeeex.eraser.m0.a("KHxWQ9i5nTc+\n", "ez8XDYftxGc=\n"), yVar.name());
            intentPutExtra.getClass();
        }
        activity.startActivity(intentPutExtra);
    }

    public final Function0 b(com.neeeex.similar3p.y yVar) {
        switch (a.f65362a[yVar.ordinal()]) {
            case 1:
                return new b(mi.a.f88870a);
            case 2:
                return new c(mi.a.f88870a);
            case 3:
                return new d(mi.a.f88870a);
            case 4:
                return new e(mi.a.f88870a);
            case 5:
                return new f(mi.a.f88870a);
            case 6:
                return new g(mi.a.f88870a);
            case 7:
                return new h(mi.a.f88870a);
            default:
                coil.util.j.a();
                return null;
        }
    }

    public static final /* synthetic */ class b extends p003kotlin.jvm.internal.s implements Function0 {
        public b(Object obj) {
            super(0, obj, mi.a.class, com.neeeex.eraser.m0.a("QFB3lSd7K0lXVGmpNm4GaVNHYJ8RYAtW\n", "MjUH+lUPaCU=\n"), com.neeeex.eraser.m0.a("lXUxxHWiRQiCcS/4ZLdoKIZiJs5DuWUXzzkX\n", "5xBBqwfWBmQ=\n"), 0);
        }

        /* JADX INFO: renamed from: invoke, reason: collision with other method in class */
        public final void m167invoke() {
            ((mi.a) this.receiver).w();
        }

        @Override // p003kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Object invoke() {
            m167invoke();
            return fl.m0.f80959a;
        }
    }

    public static final /* synthetic */ class c extends p003kotlin.jvm.internal.s implements Function0 {
        public c(Object obj) {
            super(0, obj, mi.a.class, com.neeeex.eraser.m0.a("eU81nReEEXBuSyuhBpE8WH5aKZsGkSZ5T0UmgQ==\n", "CypF8mXwUhw=\n"), com.neeeex.eraser.m0.a("Onp7SpS1N70tfmV2haAalT1vZ0yFoAC0DHBoVs7oIg==\n", "SB8LJebBdNE=\n"), 0);
        }

        /* JADX INFO: renamed from: invoke, reason: collision with other method in class */
        public final void m168invoke() {
            ((mi.a) this.receiver).t();
        }

        @Override // p003kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Object invoke() {
            m168invoke();
            return fl.m0.f80959a;
        }
    }

    public static final /* synthetic */ class d extends p003kotlin.jvm.internal.s implements Function0 {
        public d(Object obj) {
            super(0, obj, mi.a.class, com.neeeex.eraser.m0.a("wPQfTZH8Q8TX8AFxgOlu5NPjCEeu7WTB0w==\n", "spFvIuOIAKg=\n"), com.neeeex.eraser.m0.a("rRKnDEQjsiu6FrkwVTafC74FsAZ7MpUuvl/+NQ==\n", "33fXYzZX8Uc=\n"), 0);
        }

        /* JADX INFO: renamed from: invoke, reason: collision with other method in class */
        public final void m169invoke() {
            ((mi.a) this.receiver).x();
        }

        @Override // p003kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Object invoke() {
            m169invoke();
            return fl.m0.f80959a;
        }
    }

    public static final /* synthetic */ class e extends p003kotlin.jvm.internal.s implements Function0 {
        public e(Object obj) {
            super(0, obj, mi.a.class, com.neeeex.eraser.m0.a("AQTA0ikVt5IWAN7uOACaugYR3NQ4AICbPgTU1Do=\n", "c2GwvVth9P4=\n"), com.neeeex.eraser.m0.a("5OXlxbJTDLHz4fv5o0YhmePw+cOjRju42+Xxw6EPZos=\n", "loCVqsAnT90=\n"), 0);
        }

        /* JADX INFO: renamed from: invoke, reason: collision with other method in class */
        public final void m170invoke() {
            ((mi.a) this.receiver).u();
        }

        @Override // p003kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Object invoke() {
            m170invoke();
            return fl.m0.f80959a;
        }
    }

    public static final /* synthetic */ class f extends p003kotlin.jvm.internal.s implements Function0 {
        public f(Object obj) {
            super(0, obj, mi.a.class, com.neeeex.eraser.m0.a("hTgyUCWZZsGSPCxsNIxL/p4wK1M2n2zAljonTA==\n", "911CP1ftJa0=\n"), com.neeeex.eraser.m0.a("jrSj5EcM9muZsL3YVhnbVJW8uudUCvxqnba2+B1R4w==\n", "/NHTizV4tQc=\n"), 0);
        }

        /* JADX INFO: renamed from: invoke, reason: collision with other method in class */
        public final void m171invoke() {
            ((mi.a) this.receiver).z();
        }

        @Override // p003kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Object invoke() {
            m171invoke();
            return fl.m0.f80959a;
        }
    }

    public static final /* synthetic */ class g extends p003kotlin.jvm.internal.s implements Function0 {
        public g(Object obj) {
            super(0, obj, mi.a.class, com.neeeex.eraser.m0.a("MmIhPI3e5N4lZj8AnMvJ+DVpOhWWxsLB\n", "QAdRU/+qp7I=\n"), com.neeeex.eraser.m0.a("G0pw+TIVzdkMTm7FIwDg/xxBa9ApDevGQQZW\n", "aS8AlkBhjrU=\n"), 0);
        }

        /* JADX INFO: renamed from: invoke, reason: collision with other method in class */
        public final void m172invoke() {
            ((mi.a) this.receiver).v();
        }

        @Override // p003kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Object invoke() {
            m172invoke();
            return fl.m0.f80959a;
        }
    }

    public static final /* synthetic */ class h extends p003kotlin.jvm.internal.s implements Function0 {
        public h(Object obj) {
            super(0, obj, mi.a.class, com.neeeex.eraser.m0.a("Ny1yVnExM1MgKWxqYCQebCY6Z1xtNhhQMTs=\n", "RUgCOQNFcD8=\n"), com.neeeex.eraser.m0.a("b3pdKCxZHBl4fkMUPUwxJn5tSCIwXjcaaWwFbgg=\n", "HR8tR14tX3U=\n"), 0);
        }

        /* JADX INFO: renamed from: invoke, reason: collision with other method in class */
        public final void m173invoke() {
            ((mi.a) this.receiver).y();
        }

        @Override // p003kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Object invoke() {
            m173invoke();
            return fl.m0.f80959a;
        }
    }
}