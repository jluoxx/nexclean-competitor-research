package hj;

import com.thinkup.core.api.TUAdInfo;
import com.thinkup.core.api.TUSDK;
import com.thinkup.core.common.dm.m0q;
import com.thinkup.network.admob.AdmobTUAdapter;
import com.thinkup.network.admob.AdmobTUBannerAdapter;
import com.thinkup.network.admob.AdmobTUInterstitialAdapter;
import com.thinkup.network.admob.AdmobTURewardedVideoAdapter;
import com.thinkup.network.admob.AdmobTUSplashAdapter;
import java.lang.reflect.Field;
import java.util.HashMap;
import java.util.Locale;

/* JADX INFO: loaded from: classes7.dex */
public final class t2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final t2 f83703a = new t2();

    public final double a(TUAdInfo tUAdInfo) {
        m0q unitGroupInfo;
        try {
            Field declaredField = tUAdInfo.getClass().getDeclaredField("d");
            declaredField.setAccessible(true);
            Object obj = declaredField.get(tUAdInfo);
            if ((obj instanceof AdmobTUSplashAdapter) && (unitGroupInfo = ((AdmobTUSplashAdapter) obj).getUnitGroupInfo()) != null) {
                Field declaredField2 = unitGroupInfo.getClass().getDeclaredField("ddd");
                declaredField2.setAccessible(true);
                double d10 = declaredField2.getDouble(unitGroupInfo);
                if (d10 > 0.0d) {
                    return d10;
                }
                Field declaredField3 = unitGroupInfo.getClass().getDeclaredField("do");
                declaredField3.setAccessible(true);
                return declaredField3.getDouble(unitGroupInfo);
            }
        } catch (Throwable th2) {
            th2.printStackTrace();
        }
        return 0.0d;
    }

    /* JADX WARN: Code duplicated, block: B:28:0x0050  */
    /* JADX WARN: Code duplicated, block: B:29:0x0052  */
    public final w2 b(TUAdInfo tUAdInfo, double d10) {
        int i10;
        int iH = h(tUAdInfo);
        double ecpm = tUAdInfo.getEcpm();
        String ecpmPrecision = tUAdInfo.getEcpmPrecision();
        if (ecpmPrecision == null) {
            i10 = 0;
        } else {
            int iHashCode = ecpmPrecision.hashCode();
            if (iHashCode != -623607748) {
                if (iHashCode != 96946943) {
                    if (iHashCode != 655944390) {
                        if (iHashCode == 908791542 && ecpmPrecision.equals("ecpm_api")) {
                            i10 = 1;
                        }
                    } else if (ecpmPrecision.equals("publisher_defined")) {
                        i10 = 2;
                    }
                    i10 = 0;
                } else if (ecpmPrecision.equals("exact")) {
                    i10 = 3;
                } else {
                    i10 = 0;
                }
            } else if (ecpmPrecision.equals("estimated")) {
                i10 = 1;
            } else {
                i10 = 0;
            }
        }
        return new w2(ecpm, tUAdInfo.getCurrency(), i10, iH);
    }

    public final void c(String str, int i10) {
        try {
            double d10 = 10;
            double dRint = Math.rint(v.f83716a.a(i10) * d10) / d10;
            HashMap map = new HashMap();
            map.put("custom_tupp_ecpm", Float.valueOf((float) dRint));
            TUSDK.initPlacementCustomMap(str, map);
        } catch (Throwable unused) {
        }
    }

    public final boolean d(int i10) {
        return i10 == 2;
    }

    public final double e(TUAdInfo tUAdInfo) {
        m0q unitGroupInfo;
        try {
            Field declaredField = tUAdInfo.getClass().getDeclaredField("d");
            declaredField.setAccessible(true);
            Object obj = declaredField.get(tUAdInfo);
            if ((obj instanceof AdmobTUBannerAdapter) && (unitGroupInfo = ((AdmobTUBannerAdapter) obj).getUnitGroupInfo()) != null) {
                Field declaredField2 = unitGroupInfo.getClass().getDeclaredField("ddd");
                declaredField2.setAccessible(true);
                double d10 = declaredField2.getDouble(unitGroupInfo);
                if (d10 > 0.0d) {
                    return d10;
                }
                Field declaredField3 = unitGroupInfo.getClass().getDeclaredField("do");
                declaredField3.setAccessible(true);
                return declaredField3.getDouble(unitGroupInfo);
            }
        } catch (Throwable th2) {
            th2.printStackTrace();
        }
        return 0.0d;
    }

    public final double f(TUAdInfo tUAdInfo) {
        m0q unitGroupInfo;
        try {
            Field declaredField = tUAdInfo.getClass().getDeclaredField("d");
            declaredField.setAccessible(true);
            Object obj = declaredField.get(tUAdInfo);
            if ((obj instanceof AdmobTUInterstitialAdapter) && (unitGroupInfo = ((AdmobTUInterstitialAdapter) obj).getUnitGroupInfo()) != null) {
                Field declaredField2 = unitGroupInfo.getClass().getDeclaredField("ddd");
                declaredField2.setAccessible(true);
                double d10 = declaredField2.getDouble(unitGroupInfo);
                if (d10 > 0.0d) {
                    return d10;
                }
                Field declaredField3 = unitGroupInfo.getClass().getDeclaredField("do");
                declaredField3.setAccessible(true);
                return declaredField3.getDouble(unitGroupInfo);
            }
        } catch (Throwable th2) {
            th2.printStackTrace();
        }
        return 0.0d;
    }

    public final double g(TUAdInfo tUAdInfo) {
        m0q unitGroupInfo;
        try {
            Field declaredField = tUAdInfo.getClass().getDeclaredField("d");
            declaredField.setAccessible(true);
            Object obj = declaredField.get(tUAdInfo);
            if ((obj instanceof AdmobTUAdapter) && (unitGroupInfo = ((AdmobTUAdapter) obj).getUnitGroupInfo()) != null) {
                Field declaredField2 = unitGroupInfo.getClass().getDeclaredField("ddd");
                declaredField2.setAccessible(true);
                double d10 = declaredField2.getDouble(unitGroupInfo);
                if (d10 > 0.0d) {
                    return d10;
                }
                Field declaredField3 = unitGroupInfo.getClass().getDeclaredField("do");
                declaredField3.setAccessible(true);
                return declaredField3.getDouble(unitGroupInfo);
            }
        } catch (Throwable th2) {
            th2.printStackTrace();
        }
        return 0.0d;
    }

    public final int h(TUAdInfo tUAdInfo) {
        int networkFirmId = tUAdInfo.getNetworkFirmId();
        if (networkFirmId == 1) {
            return 4;
        }
        if (networkFirmId == 2) {
            return 1;
        }
        if (networkFirmId == 3) {
            return 9;
        }
        if (networkFirmId == 5) {
            return 7;
        }
        if (networkFirmId == 6) {
            return 6;
        }
        if (networkFirmId == 9) {
            return 14;
        }
        if (networkFirmId == 45) {
            return 25;
        }
        if (networkFirmId == 48) {
            return 26;
        }
        if (networkFirmId == 50) {
            return 5;
        }
        if (networkFirmId == 75) {
            return 17;
        }
        if (networkFirmId == 77) {
            return 29;
        }
        if (networkFirmId == 84) {
            return 16;
        }
        if (networkFirmId == 36) {
            return 24;
        }
        if (networkFirmId == 37) {
            return 15;
        }
        if (networkFirmId == 65) {
            return 28;
        }
        if (networkFirmId == 66) {
            return 3;
        }
        switch (networkFirmId) {
            case 11:
                return 18;
            case 12:
                return 12;
            case 13:
                return 8;
            default:
                switch (networkFirmId) {
                    case 23:
                        return 19;
                    case 24:
                        return 20;
                    case 25:
                        return 21;
                    default:
                        switch (networkFirmId) {
                            case 32:
                                return 22;
                            case 33:
                                return 2;
                            case 34:
                                return 23;
                            default:
                                switch (networkFirmId) {
                                    case 57:
                                        return 27;
                                    case 58:
                                        return 13;
                                    case 59:
                                        return 10;
                                    default:
                                        String lowerCase = tUAdInfo.getNetworkName().toLowerCase(Locale.ROOT);
                                        lowerCase.getClass();
                                        if (p003kotlin.text.k0.c0(lowerCase, "max", false, 2, null)) {
                                            return 11;
                                        }
                                        if (p003kotlin.text.k0.c0(lowerCase, "applovin", false, 2, null)) {
                                            return 7;
                                        }
                                        if (p003kotlin.text.k0.c0(lowerCase, "google", false, 2, null) || p003kotlin.text.k0.c0(lowerCase, "admob", false, 2, null)) {
                                            return 1;
                                        }
                                        if (p003kotlin.text.k0.c0(lowerCase, "meta", false, 2, null) || p003kotlin.text.k0.c0(lowerCase, "facebook", false, 2, null)) {
                                            return 4;
                                        }
                                        if (p003kotlin.text.k0.c0(lowerCase, "mintegral", false, 2, null)) {
                                            return 6;
                                        }
                                        if (p003kotlin.text.k0.c0(lowerCase, "pangle", false, 2, null)) {
                                            return 5;
                                        }
                                        return p003kotlin.text.k0.c0(lowerCase, "bigo", false, 2, null) ? 10 : 3;
                                }
                        }
                }
        }
    }

    public final double i(TUAdInfo tUAdInfo) {
        m0q unitGroupInfo;
        try {
            Field declaredField = tUAdInfo.getClass().getDeclaredField("d");
            declaredField.setAccessible(true);
            Object obj = declaredField.get(tUAdInfo);
            if ((obj instanceof AdmobTURewardedVideoAdapter) && (unitGroupInfo = ((AdmobTURewardedVideoAdapter) obj).getUnitGroupInfo()) != null) {
                Field declaredField2 = unitGroupInfo.getClass().getDeclaredField("ddd");
                declaredField2.setAccessible(true);
                double d10 = declaredField2.getDouble(unitGroupInfo);
                if (d10 > 0.0d) {
                    return d10;
                }
                Field declaredField3 = unitGroupInfo.getClass().getDeclaredField("do");
                declaredField3.setAccessible(true);
                return declaredField3.getDouble(unitGroupInfo);
            }
        } catch (Throwable th2) {
            th2.printStackTrace();
        }
        return 0.0d;
    }

    public final boolean j(TUAdInfo tUAdInfo) {
        int networkFirmId = tUAdInfo.getNetworkFirmId();
        if (networkFirmId == 1 || networkFirmId == 6 || networkFirmId == 50 || networkFirmId == 59) {
            return true;
        }
        String lowerCase = tUAdInfo.getNetworkName().toLowerCase(Locale.ROOT);
        lowerCase.getClass();
        return p003kotlin.text.k0.c0(lowerCase, "max", false, 2, null);
    }
}