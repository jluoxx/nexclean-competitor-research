package com.thinkup.core.q;

import android.content.Context;
import android.text.TextUtils;
import com.thinkup.core.common.nn.Cdo;
import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStreamReader;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes7.dex */
public final class nd {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final String f74109d = "PrePlacementStrategy";

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private String f74110m;

    private String n(String str) {
        int i10;
        int i11;
        Context contextDd = com.thinkup.core.common.o.nd.m().dd();
        if (contextDd != null && !TextUtils.isEmpty(str) && !TextUtils.isEmpty(this.f74110m)) {
            try {
                try {
                    BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(contextDd.getResources().getAssets().open(this.f74110m + File.separator + str + ".json")));
                    StringBuilder sb2 = new StringBuilder();
                    while (true) {
                        String line = bufferedReader.readLine();
                        if (line == null) {
                            break;
                        }
                        sb2.append(line);
                    }
                    JSONObject jSONObject = new JSONObject(Cdo.m(sb2.toString()));
                    int iOptInt = jSONObject.optInt(com.thinkup.core.common.m0.d0.d0n, 0);
                    if (300000001 != iOptInt) {
                        com.thinkup.core.common.nm.d0.m("pre_s_cus_code_error", "sdk_cus_code = 300000001 strategy_cus_code = ".concat(String.valueOf(iOptInt)), com.thinkup.core.common.o.nd.m().n0());
                        return "";
                    }
                    if (!jSONObject.isNull("sdk_ver")) {
                        String string = jSONObject.getString("sdk_ver");
                        if (!TextUtils.isEmpty(string) && (i11 = Integer.parseInt(com.thinkup.core.common.nn.mn.d().replace("UA_", "").replace(".", ""))) < (i10 = Integer.parseInt(string.replace(".", "")))) {
                            String.format("The sdk version(%s) must be greater than or equal to the version(%s) in the placement strategy.", Integer.valueOf(i11), Integer.valueOf(i10));
                            return "";
                        }
                    }
                    if (!jSONObject.isNull(com.thinkup.core.common.m0.d0.ndo)) {
                        String string2 = jSONObject.getString(com.thinkup.core.common.m0.d0.ndo);
                        if (!TextUtils.isEmpty(string2) && !str.equals(string2)) {
                            return "";
                        }
                    }
                    if (!jSONObject.isNull("pl_data")) {
                        return jSONObject.getJSONObject("pl_data").toString();
                    }
                } catch (IOException unused) {
                    return "";
                }
            } catch (Throwable th2) {
                th2.getMessage();
            }
        }
        return "";
    }

    public final void d(String str) {
        this.f74110m = str;
    }

    public final m0 m(String str) {
        String strN = n(str);
        if (TextUtils.isEmpty(strN)) {
            return null;
        }
        try {
            m0 m0VarD = m0.d(str, new JSONObject(strN));
            m0VarD.d(1);
            return m0VarD;
        } catch (Throwable unused) {
            return null;
        }
    }
}