package com.neeeex.eraser.module.report.bytedance;

import android.content.Context;
import android.text.TextUtils;
import com.bytedance.applog.AppLog;
import com.bytedance.applog.InitConfig;
import com.bytedance.applog.UriConfig;
import com.neeeex.eraser.m0;
import com.neeeex.eraser.utils.b0;
import com.reyun.solar.engine.OnAttributionListener;
import com.reyun.solar.engine.SolarEngineConfig;
import com.reyun.solar.engine.SolarEngineManager;
import com.reyun.solar.engine.config.RemoteConfig;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes7.dex */
public abstract class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final String f65392a = m0.a("XBnlAyBgo2FSBMMuK3WpdkMj/Sg6d5l3Qx3uKA==\n", "N3ycXE4FxgQ=\n");

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final String f65393b = m0.a("7wTnd4SNDRjhGcFaj5gHD/A+/1yemjcP4RLrRJ4=\n", "hGGeKOroaH0=\n");

    /* JADX INFO: renamed from: com.neeeex.eraser.module.report.bytedance.a$a, reason: collision with other inner class name */
    public class C0781a implements OnAttributionListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ long f65394a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Context f65395b;

        public C0781a(long j10, Context context) {
            this.f65394a = j10;
            this.f65395b = context;
        }

        @Override // com.reyun.solar.engine.OnAttributionListener
        public void onAttributionFail(int i10) {
            a.g();
        }

        @Override // com.reyun.solar.engine.OnAttributionListener
        public void onAttributionSuccess(JSONObject jSONObject) {
            a.h(jSONObject, this.f65394a, this.f65395b);
        }
    }

    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f65396a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final c f65397b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final String f65398c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final long f65399d;

        public b(JSONObject jSONObject, long j10) {
            int iOptInt = jSONObject.optInt(m0.a("7+H4m6ugdYDl7Q==\n", "jImZ9cXFGd8=\n"));
            this.f65396a = iOptInt;
            this.f65397b = c.resolve(iOptInt);
            this.f65398c = jSONObject.optString(m0.a("m2lVbzgHB4SbYEA=\n", "+g0lA1lpWOo=\n"), "");
            this.f65399d = System.currentTimeMillis() - j10;
        }

        public void a(Context context) {
            a.n(this.f65396a, this.f65397b.label, this.f65399d);
            a.l(this.f65396a, this.f65397b.label);
            a.m(context, this.f65398c);
        }
    }

    public enum c {
        ORGANIC(-1, m0.a("Zt/kEGvIfQ==\n", "Ka2DcQWhHqo=\n")),
        GOOGLE(5305, m0.a("w2YCS9+K\n", "hAltLLPvaiw=\n")),
        TIKTOK(5306, m0.a("k4USnbiF\n", "x+x56dfuCyI=\n")),
        MINTEGRAL(8221, m0.a("ZJLM1fVjLRZF\n", "KfuioZAEX3c=\n")),
        META(19806, m0.a("UMBgLQ==\n", "HaUUTENF6nk=\n")),
        OTHER(Integer.MIN_VALUE, m0.a("2E+hpYM=\n", "lzvJwPEykHU=\n"));

        final int channelId;
        final String label;

        c(int i10, String str) {
            this.channelId = i10;
            this.label = str;
        }

        public static c resolve(int i10) {
            for (c cVar : values()) {
                if (cVar.channelId == i10) {
                    return cVar;
                }
            }
            return OTHER;
        }
    }

    public static SolarEngineConfig.Builder f() {
        SolarEngineConfig.Builder builder = new SolarEngineConfig.Builder();
        builder.setFbAppID(m0.a("ibx8QyE1OTCLu3hDKjwyPg==\n", "uIxJdhgFAQc=\n"));
        builder.isDebugModel(false);
        builder.withRemoteConfig(new RemoteConfig(true, RemoteConfig.MergeType.WITH_CACHE, null, null, null));
        return builder;
    }

    public static void g() {
        b0 b0Var = b0.f66131a;
        String str = f65393b;
        if (b0Var.s(str, false)) {
            return;
        }
        mi.a.f88870a.i();
        b0Var.z(str, true);
    }

    public static void h(JSONObject jSONObject, long j10, Context context) {
        if (jSONObject == null) {
            return;
        }
        try {
            new b(jSONObject, j10).a(context);
        } catch (Exception e10) {
            com.neeeex.eraser.module.report.bytedance.c.g(e10);
        }
    }

    public static void i(Context context, String str) {
        try {
            InitConfig initConfig = new InitConfig(str, b0.f66131a.x(m0.a("6XCOKl/YXMPzYZkQWchizOlwhw==\n", "hxXrTzqgA6I=\n"), m0.a("Z+Kg5cAGvA==\n", "EozLi69x0jA=\n")));
            initConfig.setUriConfig(UriConfig.createByDomain(m0.a("ibofBgEzRCKGrx8ZACcdYo2tDgVcagRg\n", "4c5rdnIJaw0=\n"), null));
            initConfig.setAutoStart(true);
            initConfig.setAutoTrackEnabled(false);
            initConfig.setLogEnable(false);
            AppLog.setEncryptAndCompress(true);
            initConfig.setMacEnable(false);
            initConfig.setImeiEnable(false);
            initConfig.setOaidEnabled(false);
            initConfig.setAndroidIdEnabled(false);
            AppLog.init(context, initConfig);
            AppLog.start();
        } catch (Exception e10) {
            e10.printStackTrace();
        }
    }

    public static void j(Context context, String str) {
        SolarEngineManager.getInstance().preInit(context, str);
        long jCurrentTimeMillis = System.currentTimeMillis();
        SolarEngineConfig solarEngineConfigBuild = f().build();
        solarEngineConfigBuild.setOnAttributionListener(new C0781a(jCurrentTimeMillis, context));
        o();
        SolarEngineManager.getInstance().initialize(context, str, solarEngineConfigBuild);
        SolarEngineManager.getInstance().getDistinctId();
    }

    public static boolean k() {
        b0 b0Var = b0.f66131a;
        return b0Var.s(m0.a("IbozDKnHDGEvpzUVqNAKYTW+Pge1\n", "av9qU+eCSSQ=\n"), false) || (b0Var.u(m0.a("BatLaJ9d1zcPpw==\n", "ZsMqBvE4u2g=\n"), -1) != -1);
    }

    public static void l(int i10, String str) {
        ij.a.l(str);
        b0 b0Var = b0.f66131a;
        b0Var.B(m0.a("zuJR2bI39Q3E7g==\n", "rYowt9xSmVI=\n"), i10);
        b0Var.D(m0.a("6/wIssvhkurx7R+IzfGs5ev8AQ==\n", "hZlt166ZzYs=\n"), str);
    }

    public static void m(Context context, String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        b0.f66131a.D(m0.a("IH+FT+l93sE6bpJ172Ts0C9zh0Q=\n", "ThrgKowFgaA=\n"), str);
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put(m0.a("qsSQRiGuKEq+2Zp3\n", "37D9GULPRTo=\n"), str);
        } catch (JSONException unused) {
        }
        com.neeeex.eraser.module.report.bytedance.c.f(jSONObject);
        com.neeeex.eraser.module.report.bytedance.c.h(context, m0.a("kEYpkF3btRaEWyOh\n", "5TJEzz662GY=\n"), str);
    }

    public static void n(int i10, String str, long j10) {
        b0 b0Var = b0.f66131a;
        String str2 = f65393b;
        if (b0Var.s(str2, false)) {
            return;
        }
        if (i10 != -1) {
            mi.a.f88870a.l();
        }
        mi.a.f88870a.k(j10, str);
        b0Var.z(str2, true);
    }

    public static void o() {
        b0 b0Var = b0.f66131a;
        String str = f65392a;
        if (b0Var.s(str, false)) {
            return;
        }
        mi.a.f88870a.j();
        b0Var.z(str, true);
    }
}