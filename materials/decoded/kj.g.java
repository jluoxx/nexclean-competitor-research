package kj;

import com.thinkup.core.common.nn.m0;
import com.thinkup.core.common.o.dn;

/* JADX INFO: loaded from: classes7.dex */
public abstract class g {
    public static String a(int i10) {
        if (i10 == 1) {
            return dn.mn.f72709n;
        }
        if (i10 == 2) {
            return dn.mn.f72710o;
        }
        if (i10 == 3) {
            return dn.mn.f72706d;
        }
        if (i10 != 4) {
            return i10 != 5 ? m0.f72152o : "AppOpen";
        }
        return "Reward";
    }
}