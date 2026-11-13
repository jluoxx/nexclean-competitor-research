package hj;

import android.content.Context;
import android.util.DisplayMetrics;
import android.view.WindowManager;
import com.google.android.libraries.ads.mobile.sdk.banner.AdSize;
import com.google.android.libraries.ads.mobile.sdk.banner.BannerAdRequest;
import com.google.android.libraries.ads.mobile.sdk.common.AdRequest;
import com.google.android.libraries.ads.mobile.sdk.common.AdValue;
import com.google.android.libraries.ads.mobile.sdk.common.PrecisionType;
import com.google.android.libraries.ads.mobile.sdk.common.VideoOptions;
import com.google.android.libraries.ads.mobile.sdk.nativead.NativeAd;
import com.google.android.libraries.ads.mobile.sdk.nativead.NativeAdRequest;
import java.math.BigDecimal;
import java.math.RoundingMode;

/* JADX INFO: loaded from: classes7.dex */
public final class f0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final f0 f83559a = new f0();

    public static final /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f83560a;

        static {
            int[] iArr = new int[PrecisionType.values().length];
            try {
                iArr[PrecisionType.ESTIMATED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[PrecisionType.PUBLISHER_PROVIDED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[PrecisionType.PRECISE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f83560a = iArr;
        }
    }

    public final int a(Context context) {
        Object systemService = context.getSystemService("window");
        systemService.getClass();
        DisplayMetrics displayMetrics = new DisplayMetrics();
        ((WindowManager) systemService).getDefaultDisplay().getMetrics(displayMetrics);
        return (int) (displayMetrics.widthPixels / displayMetrics.density);
    }

    public final int b(String str) {
        switch (str.hashCode()) {
            case -1844297126:
                return !str.equals("3525379893916449117") ? 1 : 5;
            case -1423612945:
                return !str.equals("4692500501762622185") ? 1 : 8;
            case -715147069:
                return !str.equals("1328079684332308356") ? 1 : 7;
            case -586506941:
                return !str.equals("6250601289653372374") ? 1 : 6;
            case -266403428:
                return !str.equals("1357746574408896200") ? 1 : 6;
            case 53153280:
                return !str.equals("11198165126854996598") ? 1 : 4;
            case 1163214571:
                return !str.equals("10568273599589928883") ? 1 : 4;
            case 1359417476:
                return !str.equals("1063618907739174004") ? 1 : 7;
            case 2000650096:
                return !str.equals("4069896914521993236") ? 1 : 5;
            case 2074782320:
                return !str.equals("1953547073528090325") ? 1 : 8;
            default:
                return 1;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final BannerAdRequest c(String str, AdSize adSize) {
        return ((BannerAdRequest.Builder) new BannerAdRequest.Builder(str, adSize).putCustomTargeting("key_custom_admob_ad_value", g(p.f83648a.a(1), 1))).build();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final AdRequest d(String str, int i10) {
        return ((AdRequest.Builder) new AdRequest.Builder(str).putCustomTargeting("key_custom_admob_ad_value", g(p.f83648a.a(i10), i10))).build();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final NativeAdRequest e(String str, boolean z10) {
        return ((NativeAdRequest.Builder) new NativeAdRequest.Builder(str, gl.v.e(NativeAd.NativeAdType.NATIVE)).putCustomTargeting("key_custom_admob_ad_value", g(p.f83648a.a(3), 3))).setVideoOptions(new VideoOptions.Builder().setStartMuted(z10).build()).build();
    }

    public final w2 f(AdValue adValue, String str) {
        PrecisionType precisionType = adValue.getPrecisionType();
        long valueMicros = adValue.getValueMicros();
        String currencyCode = adValue.getCurrencyCode();
        int i10 = a.f83560a[precisionType.ordinal()];
        int i11 = 1;
        if (i10 != 1) {
            i11 = 2;
            if (i10 != 2) {
                i11 = 3;
                if (i10 != 3) {
                    i11 = 0;
                }
            }
        }
        return new w2(new BigDecimal(valueMicros).divide(new BigDecimal(1000), 6, RoundingMode.HALF_UP).doubleValue(), currencyCode, i11, b(str));
    }

    public final String g(double d10, int i10) {
        if (d10 < 1.0E-9d) {
            return "admob_ad_value_0";
        }
        if (i10 != 2 && i10 != 4 && i10 != 5) {
            if (d10 >= 75.0d) {
                return "admob_ad_value_75";
            }
            if (d10 >= 55.0d) {
                return "admob_ad_value_55";
            }
            if (d10 >= 45.0d) {
                return "admob_ad_value_45";
            }
            if (d10 >= 37.0d) {
                return "admob_ad_value_37";
            }
            if (d10 >= 30.0d) {
                return "admob_ad_value_30";
            }
            if (d10 >= 23.0d) {
                return "admob_ad_value_23";
            }
            if (d10 >= 17.0d) {
                return "admob_ad_value_17";
            }
            if (d10 >= 13.0d) {
                return "admob_ad_value_13";
            }
            if (d10 >= 9.0d) {
                return "admob_ad_value_9";
            }
            if (d10 >= 5.0d) {
                return "admob_ad_value_5";
            }
            return d10 >= 3.0d ? "admob_ad_value_3" : "admob_ad_value_1_5";
        }
        if (d10 >= 360.0d) {
            return "admob_ad_value_360";
        }
        if (d10 >= 300.0d) {
            return "admob_ad_value_300";
        }
        if (d10 >= 240.0d) {
            return "admob_ad_value_240";
        }
        if (d10 >= 190.0d) {
            return "admob_ad_value_190";
        }
        if (d10 >= 150.0d) {
            return "admob_ad_value_150";
        }
        if (d10 >= 110.0d) {
            return "admob_ad_value_110";
        }
        if (d10 >= 75.0d) {
            return "admob_ad_value_75";
        }
        if (d10 >= 55.0d) {
            return "admob_ad_value_55";
        }
        if (d10 >= 45.0d) {
            return "admob_ad_value_45";
        }
        if (d10 >= 37.0d) {
            return "admob_ad_value_37";
        }
        if (d10 >= 30.0d) {
            return "admob_ad_value_30";
        }
        if (d10 >= 23.0d) {
            return "admob_ad_value_23";
        }
        if (d10 >= 17.0d) {
            return "admob_ad_value_17";
        }
        if (d10 >= 13.0d) {
            return "admob_ad_value_13";
        }
        if (d10 >= 9.0d) {
            return "admob_ad_value_9";
        }
        return d10 >= 5.0d ? "admob_ad_value_5" : "admob_ad_value_3";
    }
}