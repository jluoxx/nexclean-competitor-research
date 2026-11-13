package pi;

import android.content.Context;
import android.content.res.Resources;
import com.neeeex.eraser.m0;
import fl.t;
import fl.z;
import gl.w;
import java.util.List;
import p003kotlin.jvm.functions.Function1;
import p003kotlin.jvm.internal.v;

/* JADX INFO: loaded from: classes7.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final c f91405a = new c();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final List f91406b = w.p(z.a("push_neeeex_similar_similar_" /* decoded XOR */, 6), z.a("push_neeeex_similar_large_media_" /* decoded XOR */, 6), z.a("push_neeeex_similar_duplicate_media_" /* decoded XOR */, 6), z.a("push_neeeex_similar_large_file_" /* decoded XOR */, 6), z.a("push_neeeex_similar_duplicate_file_" /* decoded XOR */, 6), z.a("push_neeeex_similar_junk_files_" /* decoded XOR */, 9), z.a("push_neeeex_similar_screenshots_recordings_" /* decoded XOR */, 6), z.a("push_neeeex_similar_recent_apps_" /* decoded XOR */, 4), z.a("push_neeeex_similar_network_traffic_" /* decoded XOR */, 4), z.a("push_neeeex_similar_photo_compressor_" /* decoded XOR */, 4), z.a("push_neeeex_similar_virus_" /* decoded XOR */, 5));

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f91407a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f91408b;

        public a(String str, int i10) {
            "content" /* decoded XOR */;
            str.getClass();
            this.f91407a = str;
            this.f91408b = i10;
        }

        public final int a() {
            return this.f91408b;
        }

        public final String b() {
            return this.f91407a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return v.c(this.f91407a, aVar.f91407a) && this.f91408b == aVar.f91408b;
        }

        public int hashCode() {
            return (this.f91407a.hashCode() * 31) + Integer.hashCode(this.f91408b);
        }

        public String toString() {
            return "CleanNotificationTarget(content=" + this.f91407a + ", action=" + this.f91408b + ")";
        }
    }

    public static String a(Resources resources, int i10) {
        String string = resources.getString(i10);
        "getString(...)" /* decoded XOR */;
        string.getClass();
        return string;
    }

    public static int b(Resources resources, String str, String str2) {
        "resourceName" /* decoded XOR */;
        str2.getClass();
        return resources.getIdentifier(str2, "string" /* decoded XOR */, str);
    }

    public final int c(String str) {
        switch (str.hashCode()) {
            case -1128547213:
                return !str.equals("push_neeeex_similar_duplicate_media_" /* decoded XOR */) ? 0 : 7;
            case -632159205:
                return !str.equals("push_neeeex_similar_large_file_" /* decoded XOR */) ? 0 : 8;
            case -479166373:
                return !str.equals("push_neeeex_similar_junk_files_" /* decoded XOR */) ? 0 : 11;
            case -466543208:
                return !str.equals("push_neeeex_similar_similar_" /* decoded XOR */) ? 0 : 5;
            case -310461769:
                return !str.equals("push_neeeex_similar_network_traffic_" /* decoded XOR */) ? 0 : 14;
            case -181290005:
                return !str.equals("push_neeeex_similar_duplicate_file_" /* decoded XOR */) ? 0 : 9;
            case 969283655:
                return !str.equals("push_neeeex_similar_screenshots_recordings_" /* decoded XOR */) ? 0 : 12;
            case 1366382697:
                return !str.equals("push_neeeex_similar_photo_compressor_" /* decoded XOR */) ? 0 : 15;
            case 1782673677:
                return !str.equals("push_neeeex_similar_recent_apps_" /* decoded XOR */) ? 0 : 13;
            case 1989471174:
                return !str.equals("push_neeeex_similar_virus_" /* decoded XOR */) ? 0 : 16;
            case 2074376771:
                return !str.equals("push_neeeex_similar_large_media_" /* decoded XOR */) ? 0 : 6;
            default:
                return 0;
        }
    }

    public final a d(Context context) {
        "context" /* decoded XOR */;
        context.getClass();
        final Resources resources = context.getResources();
        final String packageName = context.getPackageName();
        return g(yl.c.Default, new Function1() { // from class: pi.a
            @Override // p003kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return Integer.valueOf(c.b(resources, packageName, (String) obj));
            }
        }, new Function1() { // from class: pi.b
            @Override // p003kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return c.a(resources, ((Integer) obj).intValue());
            }
        });
    }

    public final String e(Context context, int i10) {
        "context" /* decoded XOR */;
        context.getClass();
        Resources resources = context.getResources();
        int identifier = resources.getIdentifier("push_neeeex_content" + i10, "string" /* decoded XOR */, context.getPackageName());
        if (identifier == 0) {
            return "";
        }
        String string = resources.getString(identifier);
        "getString(...)" /* decoded XOR */;
        string.getClass();
        return string;
    }

    public final t f(yl.c cVar) {
        List list = f91406b;
        t tVar = (t) list.get(cVar.nextInt(list.size()));
        String str = (String) tVar.component1();
        return z.a(str + cVar.nextInt(((Number) tVar.component2()).intValue()), Integer.valueOf(c(str)));
    }

    public final a g(yl.c cVar, Function1 function1, Function1 function2) {
        "random" /* decoded XOR */;
        cVar.getClass();
        "getIdentifier" /* decoded XOR */;
        function1.getClass();
        "getString" /* decoded XOR */;
        function2.getClass();
        t tVarF = f(cVar);
        String str = (String) tVarF.component1();
        int iIntValue = ((Number) tVarF.component2()).intValue();
        int iIntValue2 = ((Number) function1.invoke(str)).intValue();
        return new a(iIntValue2 == 0 ? "" : (String) function2.invoke(Integer.valueOf(iIntValue2)), iIntValue);
    }
}