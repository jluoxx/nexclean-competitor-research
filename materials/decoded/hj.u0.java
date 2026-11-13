package hj;

import android.app.Application;
import com.thinkup.core.api.TUSDK;
import java.util.HashMap;

/* JADX INFO: loaded from: classes7.dex */
public final class u0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final u0 f83705a = new u0();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static boolean f83706b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static x1 f83707c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static x1 f83708d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static x1 f83709e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static x1 f83710f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static a2 f83711g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static r2 f83712h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static a0 f83713i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static x0 f83714j;

    public static final class a implements j1 {
        @Override // hj.j1
        public final void a(String str) {
        }

        @Override // hj.j1
        public final void onInitSuccess() {
        }
    }

    public final kj.a.C1088a a(String str) {
        HashMap map;
        x0 x0Var = f83714j;
        if (x0Var == null || (map = x0Var.f83747a) == null) {
            return null;
        }
        return (kj.a.C1088a) map.get(str);
    }

    public final void b(Application application, kj.a aVar) {
        s1.f83694a.c();
        w0.f83728a.a();
        f83714j = new x0(aVar);
    }

    public final void c(String str) {
        HashMap map = new HashMap();
        map.put("channel", str);
        TUSDK.initCustomMap(map);
        TUSDK.setChannel(str);
    }

    public final boolean d() {
        return f83714j != null;
    }

    public final void e() {
        q1 q1VarA = r.f83668a.a(1);
        if (q1VarA != null) {
            q1VarA.b(new a());
        }
    }
}