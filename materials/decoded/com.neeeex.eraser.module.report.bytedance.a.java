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
    public static final String f65392a = "key_neeeex_report_attr_start" /* decoded XOR */;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final String f65393b = "key_neeeex_report_attr_result" /* decoded XOR */;

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
            int iOptInt = jSONObject.optInt("channel_id" /* decoded XOR */);
            this.f65396a = iOptInt;
            this.f65397b = c.resolve(iOptInt);
            this.f65398c = jSONObject.optString("adplan_name" /* decoded XOR */, "");
            this.f65399d = System.currentTimeMillis() - j10;
        }

        public void a(Context context) {
            a.n(this.f65396a, this.f65397b.label, this.f65399d);
            a.l(this.f65396a, this.f65397b.label);
            a.m(context, this.f65398c);
        }
    }

    public enum c {
        ORGANIC(-1, "Organic" /* decoded XOR */),
        GOOGLE(5305, "Google" /* decoded XOR */),
        TIKTOK(5306, "Tiktok" /* decoded XOR */),
        MINTEGRAL(8221, "Mintegral" /* decoded XOR */),
        META(19806, "Meta" /* decoded XOR */),
        OTHER(Integer.MIN_VALUE, "Other" /* decoded XOR */);

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
        builder.setFbAppID("1055908737152939" /* decoded XOR */);
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
            InitConfig initConfig = new InitConfig(str, b0.f66131a.x("neeeex_attr_channel" /* decoded XOR */, "unknown" /* decoded XOR */));
            initConfig.setUriConfig(UriConfig.createByDomain("https://gator.volces.com" /* decoded XOR */, null));
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
        return b0Var.s("KEY_NEEEEX_FORCE_ATTR" /* decoded XOR */, false) || (b0Var.u("channel_id" /* decoded XOR */, -1) != -1);
    }

    public static void l(int i10, String str) {
        ij.a.l(str);
        b0 b0Var = b0.f66131a;
        b0Var.B("channel_id" /* decoded XOR */, i10);
        b0Var.D("neeeex_attr_channel" /* decoded XOR */, str);
    }

    public static void m(Context context, String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        b0.f66131a.D("neeeex_attr_campaign" /* decoded XOR */, str);
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("utm_campaign" /* decoded XOR */, str);
        } catch (JSONException unused) {
        }
        com.neeeex.eraser.module.report.bytedance.c.f(jSONObject);
        com.neeeex.eraser.module.report.bytedance.c.h(context, "utm_campaign" /* decoded XOR */, str);
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