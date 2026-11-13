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
    public static final String f91410b = "neeeex_push_messaging_msg_day" /* decoded XOR */;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final String f91411c = "neeeex_push_messaging_msg_count" /* decoded XOR */;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final String f91412d = "neeeex_push_messaging_show_time" /* decoded XOR */;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final d f91409a = new d();

    public final boolean a(Context context) {
        "context" /* decoded XOR */;
        context.getClass();
        Calendar calendar = Calendar.getInstance();
        "getInstance(...)" /* decoded XOR */;
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
        long jV = b0Var.v("sp_neeeex_first_start_time" /* decoded XOR */, 0L);
        long jCurrentTimeMillis = System.currentTimeMillis();
        if (jCurrentTimeMillis < jV || jCurrentTimeMillis - jV < dn.m0.f72686d || jCurrentTimeMillis - b0Var.v(f91412d, 0L) < j10) {
            return false;
        }
        String str = new SimpleDateFormat("yyyy-MM-dd" /* decoded XOR */, Locale.getDefault()).format(new Date());
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