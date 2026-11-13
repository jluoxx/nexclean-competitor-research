package com.neeeex.ctools.features.networkspeed;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;
import com.neeeex.eraser.m0;
import java.util.Iterator;

/* JADX INFO: loaded from: classes7.dex */
public final class b {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final a f64494b = new a(null);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int[] f64495c = {12, 16};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ConnectivityManager f64496a;

    public b(Context context) {
        "context" /* decoded XOR */;
        context.getClass();
        Object systemService = context.getApplicationContext().getSystemService("connectivity" /* decoded XOR */);
        this.f64496a = systemService instanceof ConnectivityManager ? (ConnectivityManager) systemService : null;
    }

    public final y a(NetworkCapabilities networkCapabilities) {
        Object next;
        y yVar;
        if (networkCapabilities == null) {
            return y.NONE;
        }
        for (int i10 : f64495c) {
            if (!networkCapabilities.hasCapability(i10)) {
                return y.NONE;
            }
        }
        Iterator it = gl.w.p(fl.z.a(1, y.WIFI), fl.z.a(0, y.CELLULAR)).iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (!networkCapabilities.hasTransport(((Number) ((fl.t) next).component1()).intValue()));
        fl.t tVar = (fl.t) next;
        return (tVar == null || (yVar = (y) tVar.getSecond()) == null) ? y.OTHER : yVar;
    }

    public final y b() {
        ConnectivityManager connectivityManager = this.f64496a;
        if (connectivityManager == null) {
            return y.NONE;
        }
        Network activeNetwork = connectivityManager.getActiveNetwork();
        return a(activeNetwork != null ? connectivityManager.getNetworkCapabilities(activeNetwork) : null);
    }

    public static final class a {
        public /* synthetic */ a(p003kotlin.jvm.internal.m mVar) {
            this();
        }

        public a() {
        }
    }
}