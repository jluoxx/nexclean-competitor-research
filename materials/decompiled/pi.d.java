package pi;

import android.content.Context;
import com.neeeex.eraser.m0;
import com.neeeex.eraser.utils.b0;
import com.neeeex.eraser.utils.c0;
import com.thinkup.core.common.dd.n;
import com.thinkup.core.common.o.dn;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;
import p003kotlin.jvm.internal.v;

/* JADX INFO: loaded from: classes7.dex */
public final class d {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final String f91410b = m0.a("4x1bd3Y+49f4C1ZNfiPP1OwfV3x0GdHU6idac2o=\n", "jXg+EhNGvKc=\n");

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final String f91411c = m0.a("CUjejqsHNZESXtO0oxoZkgZK0oWpIAeSAHLYhLsRHg==\n", "Zy27685/auE=\n");

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final String f91412d = m0.a("TdIwP7OvPvtWxD0Fu7IS+ELQPDSxiBLjTMAKLr+6BA==\n", "I7dVWtbXYYs=\n");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final d f91409a = new d();

    public final boolean a(Context context) {
        m0.a("OmkFYbLvxQ==\n", "WQZrFdeXsWY=\n");
        context.getClass();
        Calendar calendar = Calendar.getInstance();
        m0.a("6fviq9HtZ/3g/fPKkbA9tQ==\n", "jp6W4r+eE5w=\n");
        calendar.getClass();
        if (!b(calendar.get(11))) {
            return false;
        }
        c0 c0Var = c0.f66142a;
        if (c0Var.h()) {
            return false;
        }
        int i10 = c0Var.e() ? 2 : 18;
        long j10 = c0Var.e() ? 18000000L : n.f67831d;
        b0 b0Var = b0.f66131a;
        long jV = b0Var.v(m0.a("pyvs/Fz2kP2sBNX7S+CBx6cv0uBNzIHxuT4=\n", "1FuzkjmT9Zg=\n"), 0L);
        long jCurrentTimeMillis = System.currentTimeMillis();
        if (jCurrentTimeMillis < jV || jCurrentTimeMillis - jV < dn.m0.f72686d || jCurrentTimeMillis - b0Var.v(f91412d, 0L) < j10) {
            return false;
        }
        String str = new SimpleDateFormat(m0.a("0NzXaE+BdGfNwQ==\n", "qaWuEWLMOUo=\n"), Locale.getDefault()).format(new Date());
        String str2 = f91410b;
        String strX = b0Var.x(str2, "");
        String str3 = f91411c;
        int iU = b0Var.u(str3, 0);
        if (!v.c(str, strX)) {
            b0Var.D(str2, str);
            b0Var.B(str3, 1);
            return true;
        }
        if (iU < i10) {
            b0Var.B(str3, iU + 1);
            return true;
        }
        return false;
    }

    public final boolean b(int i10) {
        return 6 <= i10 && i10 < 24;
    }

    public final void c() {
        b0.f66131a.C(f91412d, System.currentTimeMillis());
    }
}