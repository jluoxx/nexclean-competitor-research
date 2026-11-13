package com.neeeex.eraser.module.report.bytedance;

import android.content.Context;
import android.text.TextUtils;
import com.bytedance.applog.AppLog;
import com.neeeex.eraser.m0;
import com.neeeex.eraser.utils.b0;
import com.reyun.solar.engine.SolarEngineManager;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.io.Writer;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;
import we.h;

/* JADX INFO: loaded from: classes7.dex */
public abstract class c {

    public interface a {
        void a(JSONObject jSONObject);
    }

    public static /* synthetic */ void a(Map map, JSONObject jSONObject) throws JSONException {
        for (Map.Entry entry : map.entrySet()) {
            jSONObject.put((String) entry.getKey(), String.valueOf(entry.getValue()));
        }
    }

    public static JSONObject b(JSONObject jSONObject) {
        String str;
        String str2;
        try {
            String strA = m0.a("WbnzFhaOC1U=\n", "OtieZnfnbDs=\n");
            b0 b0Var = b0.f66131a;
            String[][] strArr = {new String[]{strA, b0Var.x(m0.a("I0CaIUJarOw5UY0bREOe/SxMmCo=\n", "TSX/RCci840=\n"), "")}, new String[]{m0.a("qW0LPNILUw==\n", "ygVqUrxuP9k=\n"), b0Var.x(m0.a("cTj+PqgGCFprKekErhY2VXE49w==\n", "H12bW81+Vzs=\n"), "")}};
            for (int i10 = 0; i10 < 2; i10++) {
                String[] strArr2 = strArr[i10];
                if (!TextUtils.isEmpty(strArr2[1])) {
                    jSONObject.put(strArr2[0], strArr2[1]);
                }
            }
            String strA2 = m0.a("oEqRseFXOJQ=\n", "1Tn0w5UuSPE=\n");
            if (com.neeeex.eraser.push.a.f65469a.i()) {
                str = "kA==\n";
                str2 = "oYcWqhlB6lM=\n";
            } else {
                str = "4w==\n";
                str2 = "0b9IrLA+GdY=\n";
            }
            jSONObject.put(strA2, m0.a(str, str2));
        } catch (Exception unused) {
        }
        return jSONObject;
    }

    public static void c(String str, a aVar) {
        try {
            JSONObject jSONObject = new JSONObject();
            if (aVar != null) {
                aVar.a(jSONObject);
            }
            b(jSONObject);
            AppLog.onEventV3(str, jSONObject);
        } catch (Exception e10) {
            e10.printStackTrace();
        }
    }

    public static void d(String str) {
        c(str, null);
    }

    public static void e(String str, final Map map) {
        c(str, map == null ? null : new a() { // from class: com.neeeex.eraser.module.report.bytedance.b
            @Override // com.neeeex.eraser.module.report.bytedance.c.a
            public final void a(JSONObject jSONObject) throws JSONException {
                c.a(map, jSONObject);
            }
        });
    }

    public static void f(JSONObject jSONObject) {
        AppLog.profileSet(jSONObject);
    }

    public static void g(Throwable th2) {
        try {
            m0.a("tNV3msHCCqCf\n", "8a0U/7G2Y88=\n");
            i(th2);
            h.b().d(th2);
        } catch (Exception unused) {
        }
    }

    public static void h(Context context, String str, String str2) {
        SolarEngineManager.getInstance().setSuperProperties(context, str, str2);
    }

    public static String i(Throwable th2) {
        if (th2 == null) {
            return "";
        }
        StringWriter stringWriter = new StringWriter();
        try {
            PrintWriter printWriter = new PrintWriter((Writer) stringWriter, true);
            th2.printStackTrace(printWriter);
            printWriter.close();
            return stringWriter.toString();
        } catch (Exception unused) {
            return "";
        }
    }
}