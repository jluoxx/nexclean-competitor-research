package ti;

import am.j;
import android.content.Context;
import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;
import android.os.Build;
import com.neeeex.eraser.m0;
import gl.q0;
import java.util.Collection;
import java.util.Iterator;

/* JADX INFO: loaded from: classes7.dex */
public abstract class b {
    public static final ConnectivityManager a(Context context) {
        m0.a("NOUBq1/o\n", "CJFpwizW3CY=\n");
        context.getClass();
        Object systemService = l2.a.getSystemService(context, ConnectivityManager.class);
        systemService.getClass();
        return (ConnectivityManager) systemService;
    }

    public static final boolean b(ConnectivityManager connectivityManager) {
        NetworkCapabilities networkCapabilities;
        Network activeNetwork = connectivityManager.getActiveNetwork();
        if (activeNetwork == null || (networkCapabilities = connectivityManager.getNetworkCapabilities(activeNetwork)) == null) {
            return false;
        }
        Iterable jVar = new j(0, Build.VERSION.SDK_INT >= 27 ? 6 : 5);
        if ((jVar instanceof Collection) && ((Collection) jVar).isEmpty()) {
            return false;
        }
        Iterator it = jVar.iterator();
        while (it.hasNext()) {
            if (networkCapabilities.hasTransport(((q0) it).nextInt())) {
                return true;
            }
        }
        return false;
    }

    public static final boolean c(Context context) {
        m0.a("t9oazNyP\n", "i65ypa+xTHc=\n");
        context.getClass();
        return b(a(context));
    }
}