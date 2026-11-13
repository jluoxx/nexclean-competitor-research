package com.thinkup.core.common.m0.d.d;

import java.net.InetAddress;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes7.dex */
public final class o {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final String f69701d = "o";

    private o() {
    }

    public static List<InetAddress> d(List<InetAddress> list) {
        if (list == null || list.isEmpty()) {
            return null;
        }
        ArrayList arrayList = new ArrayList(list.size());
        for (InetAddress inetAddress : list) {
            if (inetAddress != null && !inetAddress.isAnyLocalAddress() && !inetAddress.isLoopbackAddress() && !inetAddress.isLinkLocalAddress()) {
                arrayList.add(inetAddress);
            }
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        return arrayList;
    }
}