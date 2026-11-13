package com.thinkup.core.common.m0.m;

import java.net.InetAddress;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes7.dex */
public final class d {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final String f69825d = "d";

    private d() {
    }

    public static List<InetAddress> d(String str, List<String> list) {
        if (str == null || str.isEmpty() || list == null || list.isEmpty()) {
            return Collections.EMPTY_LIST;
        }
        ArrayList arrayList = new ArrayList(list.size());
        Iterator<String> it = list.iterator();
        while (it.hasNext()) {
            InetAddress inetAddressD = d(str, it.next());
            if (inetAddressD != null) {
                arrayList.add(inetAddressD);
            }
        }
        return arrayList;
    }

    private static InetAddress d(String str, String str2) {
        if (str2 != null && !str2.isEmpty()) {
            try {
                return InetAddress.getByAddress(str, InetAddress.getByName(str2).getAddress());
            } catch (Throwable unused) {
            }
        }
        return null;
    }
}