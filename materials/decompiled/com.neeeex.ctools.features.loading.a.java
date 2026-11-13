package com.neeeex.ctools.features.loading;

import androidx.appcompat.app.AppCompatActivity;
import com.neeeex.ctools.features.network.NetworkTrafficNEEEEXActivity;
import com.neeeex.ctools.features.recent.RecentAppsNEEEEXActivity;
import com.neeeex.eraser.R$raw;
import com.neeeex.eraser.R$string;
import com.neeeex.eraser.m0;
import ml.b;
import p003kotlin.jvm.internal.m;
import p003kotlin.jvm.internal.v;

/* JADX INFO: loaded from: classes7.dex */
public enum a {
    RECENT_APPS(m0.a("KoV67TBwfxIokGo=\n", "eMA5qH4kIFM=\n"), R$string.ctools_neeeex_recent_apps_title, R$string.ctools_neeeex_loading_recent_apps, R$raw.neeeex_lottie_scan_recent_apps, m0.a("7zGqvPpev+3pJqC94lKh7/w2uqD1TK7g6SuhrP9D\n", "rGXl87YN4L8=\n"), vh.a.e.RECENT_APPS, RecentAppsNEEEEXActivity.class),
    NETWORK_TRAFFIC(m0.a("DXc2QKYo0XgXYCNRrzPZ\n", "QzJiF+l6mic=\n"), R$string.ctools_neeeex_network_traffic_title, R$string.ctools_neeeex_loading_network_traffic, R$raw.neeeex_lottie_scan_network_traffic, m0.a("QxConjnz2SRFELCeJ+vZPlIFoZc849k5QwWpjjDuwjVJCg==\n", "AETn0XWghmo=\n"), vh.a.e.NETWORK_TRAFFIC, NetworkTrafficNEEEEXActivity.class);

    private final vh.a.e actionInterstitialCooldownScope;
    private final Class<? extends AppCompatActivity> destination;
    private final String extraValue;
    private final int lottieRawRes;
    private final String scanEndInterstitialPosition;
    private final int statusRes;
    private final int titleRes;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ ml.a f64348b = b.a(d());
    public static final C0739a Companion = new C0739a(null);

    a(String str, int i10, int i11, int i12, String str2, vh.a.e eVar, Class cls) {
        this.extraValue = str;
        this.titleRes = i10;
        this.statusRes = i11;
        this.lottieRawRes = i12;
        this.scanEndInterstitialPosition = str2;
        this.actionInterstitialCooldownScope = eVar;
        this.destination = cls;
    }

    public static ml.a getEntries() {
        return f64348b;
    }

    public final vh.a.e getActionInterstitialCooldownScope() {
        return this.actionInterstitialCooldownScope;
    }

    public final Class<? extends AppCompatActivity> getDestination() {
        return this.destination;
    }

    public final String getExtraValue() {
        return this.extraValue;
    }

    public final int getLottieRawRes() {
        return this.lottieRawRes;
    }

    public final String getScanEndInterstitialPosition() {
        return this.scanEndInterstitialPosition;
    }

    public final int getStatusRes() {
        return this.statusRes;
    }

    public final int getTitleRes() {
        return this.titleRes;
    }

    /* JADX INFO: renamed from: com.neeeex.ctools.features.loading.a$a, reason: collision with other inner class name */
    public static final class C0739a {
        public /* synthetic */ C0739a(m mVar) {
            this();
        }

        public final a a(String str) {
            for (a aVar : a.getEntries()) {
                if (v.c(aVar.getExtraValue(), str)) {
                    return aVar;
                }
            }
            return a.RECENT_APPS;
        }

        public C0739a() {
        }
    }
}