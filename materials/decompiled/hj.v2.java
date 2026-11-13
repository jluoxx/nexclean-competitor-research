package hj;

import com.thinkup.core.common.o.dn;
import com.tradplus.ads.base.bean.MixAdInfo;
import com.tradplus.ads.base.bean.TPAdInfo;
import com.tradplus.ads.base.util.AppKeyManager;
import com.tradplus.ads.base.util.SegmentUtils;
import com.tradplus.ads.base.util.TradPlusInterstitialConstants;
import com.tradplus.ads.mgr.TPResult;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;

/* JADX INFO: loaded from: classes7.dex */
public final class v2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final v2 f83727a = new v2();

    public final double a(String str) {
        int i10;
        try {
            TPResult tPResult = new TPResult();
            ArrayList arrayList = new ArrayList();
            MixAdInfo mixAdInfo = new MixAdInfo();
            mixAdInfo.setAdUnitId(str);
            arrayList.add(mixAdInfo);
            double ecpm = 1000.0d;
            double ecpm2 = 0.0d;
            while (true) {
                MixAdInfo mixAdInfo2 = new MixAdInfo();
                mixAdInfo2.setEcpm(ecpm);
                arrayList.add(mixAdInfo2);
                i10 = 0;
                if (!p003kotlin.jvm.internal.v.c(tPResult.handleMix(arrayList).get(0).getAdUnitId(), str)) {
                    break;
                }
                ecpm += 1000.0d;
                ecpm2 += 1000.0d;
            }
            double d10 = 0.0d;
            while (true) {
                double d11 = ecpm - ecpm2;
                if (d11 <= 0.001d) {
                    break;
                }
                ArrayList arrayList2 = new ArrayList();
                arrayList2.clear();
                MixAdInfo mixAdInfo3 = new MixAdInfo();
                mixAdInfo3.setAdUnitId(str);
                arrayList2.add(mixAdInfo3);
                double d12 = d11 / ((double) 10);
                try {
                    ArrayList arrayList3 = new ArrayList(11);
                    int i11 = i10;
                    while (i11 < 11) {
                        double d13 = d12;
                        arrayList3.add(Double.valueOf((((double) i11) * d13) + ecpm2));
                        i11++;
                        d12 = d13;
                    }
                    int size = arrayList3.size();
                    int i12 = 0;
                    while (i12 < size) {
                        Object obj = arrayList3.get(i12);
                        i12++;
                        double dDoubleValue = ((Number) obj).doubleValue();
                        MixAdInfo mixAdInfo4 = new MixAdInfo();
                        mixAdInfo4.setEcpm(dDoubleValue);
                        arrayList2.add(mixAdInfo4);
                    }
                    List<MixAdInfo> listHandleMix = tPResult.handleMix(arrayList2);
                    Iterator<MixAdInfo> it = listHandleMix.iterator();
                    int i13 = 0;
                    while (true) {
                        if (!it.hasNext()) {
                            i13 = -1;
                            break;
                        }
                        if (p003kotlin.jvm.internal.v.c(it.next().getAdUnitId(), str)) {
                            break;
                        }
                        i13++;
                    }
                    if (i13 < 0 || i13 > listHandleMix.size() - 1) {
                        break;
                        break;
                    }
                    if (i13 == 0) {
                        return ecpm;
                    }
                    if (i13 == listHandleMix.size() - 1) {
                        return ecpm2;
                    }
                    ecpm2 = listHandleMix.get(i13 + 1).getEcpm();
                    ecpm = listHandleMix.get(i13 - 1).getEcpm();
                    d10 = (ecpm2 + ecpm) / ((double) 2);
                    i10 = 0;
                } catch (Throwable unused) {
                    return 0.0d;
                }
            }
            return d10;
        } catch (Throwable unused2) {
            return 0.0d;
        }
    }

    /* JADX WARN: Code duplicated, block: B:15:0x001f  */
    /* JADX WARN: Code duplicated, block: B:26:0x003c  */
    /* JADX WARN: Code duplicated, block: B:30:0x004c A[Catch: all -> 0x0051, TryCatch #0 {all -> 0x0051, blocks: (B:28:0x0040, B:30:0x004c, B:36:0x0054), top: B:82:0x0040 }] */
    /* JADX WARN: Code duplicated, block: B:35:0x0053  */
    /* JADX WARN: Code duplicated, block: B:39:0x0061 A[Catch: all -> 0x0027, TRY_ENTER, TryCatch #1 {all -> 0x0027, blocks: (B:17:0x0022, B:23:0x002c, B:39:0x0061, B:43:0x0067, B:45:0x006f, B:47:0x007b, B:51:0x0081), top: B:84:0x0022 }] */
    /* JADX WARN: Code duplicated, block: B:45:0x006f A[Catch: all -> 0x0027, TryCatch #1 {all -> 0x0027, blocks: (B:17:0x0022, B:23:0x002c, B:39:0x0061, B:43:0x0067, B:45:0x006f, B:47:0x007b, B:51:0x0081), top: B:84:0x0022 }] */
    /* JADX WARN: Code duplicated, block: B:47:0x007b A[Catch: all -> 0x0027, TryCatch #1 {all -> 0x0027, blocks: (B:17:0x0022, B:23:0x002c, B:39:0x0061, B:43:0x0067, B:45:0x006f, B:47:0x007b, B:51:0x0081), top: B:84:0x0022 }] */
    /* JADX WARN: Code duplicated, block: B:56:0x0094  */
    /* JADX WARN: Code duplicated, block: B:57:0x0097  */
    /* JADX WARN: Code duplicated, block: B:59:0x009a  */
    /* JADX WARN: Code duplicated, block: B:61:0x00a3  */
    /* JADX WARN: Code duplicated, block: B:63:0x00a8  */
    /* JADX WARN: Code duplicated, block: B:66:0x00ae  */
    /* JADX WARN: Code duplicated, block: B:71:0x00ba  */
    /* JADX WARN: Code duplicated, block: B:74:0x00c3  */
    /* JADX WARN: Code duplicated, block: B:75:0x00c5  */
    /* JADX WARN: Code duplicated, block: B:78:0x00ce  */
    /* JADX WARN: Code duplicated, block: B:79:0x00d0  */
    public final w2 b(TPAdInfo tPAdInfo, double d10) {
        String str;
        Throwable th2;
        double d11;
        Throwable th3;
        String str2;
        int i10;
        int iHashCode;
        String str3;
        String str4;
        String str5;
        String str6;
        String str7;
        String str8 = "";
        if (tPAdInfo == null || (str = tPAdInfo.adNetworkId) == null) {
            str = "";
        }
        int iD = d(str);
        if (tPAdInfo != null) {
            try {
                String str9 = tPAdInfo.ecpm;
                if (str9 != null) {
                    d11 = Double.parseDouble(str9);
                } else {
                    d11 = 0.0d;
                }
            } catch (Throwable th4) {
                th2 = th4;
                d11 = 0.0d;
                th3 = th2;
                d10 = d11;
                th3.printStackTrace();
                d11 = d10;
                if (tPAdInfo != null) {
                    str2 = tPAdInfo.ecpmPrecision;
                } else {
                    str2 = null;
                }
                if (str2 == null) {
                    i10 = 0;
                } else {
                    iHashCode = str2.hashCode();
                    if (iHashCode != -623607748) {
                        if (iHashCode != 96946943) {
                            if (iHashCode != 655944390) {
                                i10 = 0;
                            } else {
                                i10 = 2;
                            }
                        } else if (str2.equals("exact")) {
                            i10 = 3;
                        } else {
                            i10 = 0;
                        }
                    } else if (str2.equals("estimated")) {
                        i10 = 1;
                    } else {
                        i10 = 0;
                    }
                }
                return new w2(d11, dn.dq.f72682d, i10, iD);
            }
        } else {
            d11 = 0.0d;
        }
        if (tPAdInfo != null) {
            try {
                str3 = tPAdInfo.adNetworkId;
                if (str3 == null) {
                    str3 = "";
                    str4 = "0";
                    if (p003kotlin.jvm.internal.v.c(str3, "1") && d10 > 0.0d) {
                        try {
                            HashMap map = new HashMap();
                            map.put("tx_platform", "meta");
                            if (tPAdInfo != null || (str7 = tPAdInfo.ecpm) == null) {
                                str7 = "0";
                            }
                            map.put("tx_sdk_ecpm", str7);
                            map.put("tx_cal_ecpm", String.valueOf(d10));
                            d11 = d10;
                        } catch (Throwable th5) {
                            th3 = th5;
                            th3.printStackTrace();
                            d11 = d10;
                        }
                    }
                    if (tPAdInfo != null && (str6 = tPAdInfo.adNetworkId) != null) {
                        str8 = str6;
                    }
                    if (p003kotlin.jvm.internal.v.c(str8, "2")) {
                        HashMap map2 = new HashMap();
                        map2.put("tx_platform", "admob");
                        if (tPAdInfo != null && (str5 = tPAdInfo.ecpm) != null) {
                            str4 = str5;
                        }
                        map2.put("tx_sdk_ecpm", str4);
                        map2.put("tx_cal_ecpm", String.valueOf(d10));
                    }
                } else {
                    str4 = "0";
                    if (p003kotlin.jvm.internal.v.c(str3, "1")) {
                        HashMap map3 = new HashMap();
                        map3.put("tx_platform", "meta");
                        if (tPAdInfo != null) {
                            str7 = "0";
                        } else {
                            str7 = "0";
                        }
                        map3.put("tx_sdk_ecpm", str7);
                        map3.put("tx_cal_ecpm", String.valueOf(d10));
                        d11 = d10;
                    }
                    if (tPAdInfo != null) {
                        str8 = str6;
                    }
                    if (p003kotlin.jvm.internal.v.c(str8, "2")) {
                        HashMap map4 = new HashMap();
                        map4.put("tx_platform", "admob");
                        if (tPAdInfo != null) {
                            str4 = str5;
                        }
                        map4.put("tx_sdk_ecpm", str4);
                        map4.put("tx_cal_ecpm", String.valueOf(d10));
                    }
                }
            } catch (Throwable th6) {
                th2 = th6;
                th3 = th2;
                d10 = d11;
                th3.printStackTrace();
                d11 = d10;
                if (tPAdInfo != null) {
                    str2 = tPAdInfo.ecpmPrecision;
                } else {
                    str2 = null;
                }
                if (str2 == null) {
                    i10 = 0;
                } else {
                    iHashCode = str2.hashCode();
                    if (iHashCode != -623607748) {
                        if (iHashCode != 96946943) {
                            if (iHashCode != 655944390) {
                                i10 = 0;
                            } else {
                                i10 = 2;
                            }
                        } else if (str2.equals("exact")) {
                            i10 = 0;
                        } else {
                            i10 = 3;
                        }
                    } else if (str2.equals("estimated")) {
                        i10 = 0;
                    } else {
                        i10 = 1;
                    }
                }
                return new w2(d11, dn.dq.f72682d, i10, iD);
            }
        } else {
            str3 = "";
            str4 = "0";
            if (p003kotlin.jvm.internal.v.c(str3, "1")) {
                HashMap map5 = new HashMap();
                map5.put("tx_platform", "meta");
                if (tPAdInfo != null) {
                    str7 = "0";
                } else {
                    str7 = "0";
                }
                map5.put("tx_sdk_ecpm", str7);
                map5.put("tx_cal_ecpm", String.valueOf(d10));
                d11 = d10;
            }
            if (tPAdInfo != null) {
                str8 = str6;
            }
            if (p003kotlin.jvm.internal.v.c(str8, "2")) {
                HashMap map6 = new HashMap();
                map6.put("tx_platform", "admob");
                if (tPAdInfo != null) {
                    str4 = str5;
                }
                map6.put("tx_sdk_ecpm", str4);
                map6.put("tx_cal_ecpm", String.valueOf(d10));
            }
        }
        if (tPAdInfo != null) {
            str2 = tPAdInfo.ecpmPrecision;
        } else {
            str2 = null;
        }
        if (str2 == null) {
            i10 = 0;
        } else {
            iHashCode = str2.hashCode();
            if (iHashCode != -623607748) {
                if (iHashCode != 96946943) {
                    if (iHashCode != 655944390 && str2.equals("publisher_defined")) {
                        i10 = 2;
                    } else {
                        i10 = 0;
                    }
                } else if (str2.equals("exact")) {
                    i10 = 0;
                } else {
                    i10 = 3;
                }
            } else if (str2.equals("estimated")) {
                i10 = 0;
            } else {
                i10 = 1;
            }
        }
        return new w2(d11, dn.dq.f72682d, i10, iD);
    }

    public final void c(String str, int i10) {
        try {
            p003kotlin.jvm.internal.b1 b1Var = p003kotlin.jvm.internal.b1.f86707a;
            String str2 = String.format(Locale.US, "%.1f", Arrays.copyOf(new Object[]{Double.valueOf(v.f83716a.a(i10))}, 1));
            HashMap map = new HashMap();
            map.put(AppKeyManager.UVA_ECPM, str2);
            SegmentUtils.initPlacementCustomMap(str, map);
        } catch (Throwable unused) {
        }
    }

    public final int d(String str) {
        int iHashCode = str.hashCode();
        if (iHashCode == 49) {
            return !str.equals("1") ? 30 : 4;
        }
        if (iHashCode == 50) {
            return !str.equals("2") ? 30 : 1;
        }
        if (iHashCode == 55) {
            return !str.equals("7") ? 30 : 8;
        }
        if (iHashCode == 1601) {
            return !str.equals(TradPlusInterstitialConstants.NETWORK_INMOBI) ? 30 : 9;
        }
        if (iHashCode == 1668) {
            return !str.equals(TradPlusInterstitialConstants.NETWORK_GAM) ? 30 : 2;
        }
        if (iHashCode == 1698) {
            return !str.equals("57") ? 30 : 10;
        }
        if (iHashCode != 1575) {
            return (iHashCode == 1576 && str.equals("19")) ? 5 : 30;
        }
        return !str.equals("18") ? 30 : 6;
    }

    public final boolean e(String str) {
        return p003kotlin.jvm.internal.v.c(str, "2") || p003kotlin.jvm.internal.v.c(str, "1");
    }
}