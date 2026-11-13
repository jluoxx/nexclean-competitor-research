package hj;

import com.google.android.libraries.ads.mobile.sdk.appopen.AppOpenAd;
import com.google.android.libraries.ads.mobile.sdk.banner.BannerAd;
import com.google.android.libraries.ads.mobile.sdk.interstitial.InterstitialAd;
import com.google.android.libraries.ads.mobile.sdk.nativead.NativeAd;
import com.google.android.libraries.ads.mobile.sdk.rewarded.RewardedAd;
import com.tradplus.ads.base.util.TradPlusInterstitialConstants;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.HashMap;

/* JADX INFO: loaded from: classes7.dex */
public final class l0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final l0 f83618a = new l0();

    public static double f(Number number) {
        return new BigDecimal(number.doubleValue()).divide(new BigDecimal(1000), 6, RoundingMode.HALF_UP).doubleValue();
    }

    public static void g(String str, String str2, Double d10) {
        try {
            HashMap map = new HashMap();
            map.put("ad_format", str2);
            if (d10 != null) {
                map.put("ecpm", String.valueOf(d10.doubleValue()));
            }
            u0.f83705a.getClass();
        } catch (Throwable unused) {
        }
    }

    public final double a(AppOpenAd appOpenAd) {
        try {
            Object objA = o1.f83647a.a(appOpenAd, "b.b.m.b");
            if (objA == null || !(objA instanceof Number)) {
                g("pp_am_ecpm_m_fail", "appopen", null);
                return 0.0d;
            }
            double dF = f((Number) objA);
            g("pp_am_ecpm_m1_success", "appopen", Double.valueOf(dF));
            return dF;
        } catch (Throwable th2) {
            g("pp_am_ecpm_m_error", "appopen", null);
            th2.printStackTrace();
            return 0.0d;
        }
    }

    public final double b(BannerAd bannerAd) {
        try {
            Object objA = o1.f83647a.a(bannerAd, "b.b.m.b");
            if (objA == null || !(objA instanceof Number)) {
                g("pp_am_ecpm_m_fail", TradPlusInterstitialConstants.INTERSTITIAL_TYPE_BANNER, null);
                return 0.0d;
            }
            double dF = f((Number) objA);
            g("pp_am_ecpm_m1_success", TradPlusInterstitialConstants.INTERSTITIAL_TYPE_BANNER, Double.valueOf(dF));
            return dF;
        } catch (Throwable th2) {
            g("pp_am_ecpm_m_error", TradPlusInterstitialConstants.INTERSTITIAL_TYPE_BANNER, null);
            th2.printStackTrace();
            return 0.0d;
        }
    }

    public final double c(InterstitialAd interstitialAd) {
        try {
            Object objA = o1.f83647a.a(interstitialAd, "b.b.m.b");
            if (objA == null || !(objA instanceof Number)) {
                g("pp_am_ecpm_m_fail", "inter", null);
                return 0.0d;
            }
            double dF = f((Number) objA);
            g("pp_am_ecpm_m1_success", "inter", Double.valueOf(dF));
            return dF;
        } catch (Throwable th2) {
            g("pp_am_ecpm_m_error", "inter", null);
            th2.printStackTrace();
            return 0.0d;
        }
    }

    public final double d(NativeAd nativeAd) {
        try {
            Object objA = o1.f83647a.a(nativeAd, "b.b.m.b");
            if (objA == null || !(objA instanceof Number)) {
                g("pp_am_ecpm_m_fail", "native", null);
                return 0.0d;
            }
            double dF = f((Number) objA);
            g("pp_am_ecpm_m1_success", "native", Double.valueOf(dF));
            return dF;
        } catch (Throwable th2) {
            g("pp_am_ecpm_m_error", "native", null);
            th2.printStackTrace();
            return 0.0d;
        }
    }

    public final double e(RewardedAd rewardedAd) {
        try {
            Object objA = o1.f83647a.a(rewardedAd, "b.b.m.b");
            if (objA == null || !(objA instanceof Number)) {
                g("pp_am_ecpm_m_fail", "reward", null);
                return 0.0d;
            }
            double dF = f((Number) objA);
            g("pp_am_ecpm_m1_success", "reward", Double.valueOf(dF));
            return dF;
        } catch (Throwable th2) {
            g("pp_am_ecpm_m_error", "reward", null);
            th2.printStackTrace();
            return 0.0d;
        }
    }
}