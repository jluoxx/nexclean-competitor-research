package com.thinkup.core.q;

import android.content.Context;
import android.os.Looper;
import android.text.TextUtils;
import com.thinkup.core.common.nn.Cdo;
import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStreamReader;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes7.dex */
public class n0 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final String f74107d = "n0";

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private String f74108m;

    private String n(String str) {
        try {
            Context contextDd = com.thinkup.core.common.o.nd.m().dd();
            if (contextDd != null && !TextUtils.isEmpty(str) && !TextUtils.isEmpty(this.f74108m)) {
                try {
                    BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(contextDd.getResources().getAssets().open(this.f74108m + File.separator + str + ".json")));
                    StringBuilder sb2 = new StringBuilder();
                    while (true) {
                        String line = bufferedReader.readLine();
                        if (line == null) {
                            return Cdo.m(sb2.toString());
                        }
                        sb2.append(line);
                    }
                } catch (IOException unused) {
                }
            }
            return "";
        } catch (Exception e10) {
            e10.getMessage();
            return "";
        }
    }

    public final void d(String str) {
        this.f74108m = str;
    }

    public final m m(String str) {
        Looper.myLooper();
        Looper.getMainLooper();
        try {
            String strN = n(str);
            if (TextUtils.isEmpty(strN)) {
                return null;
            }
            JSONObject jSONObject = new JSONObject(strN);
            JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject(m.d.f73898dq);
            JSONObject jSONObjectOptJSONObject2 = jSONObject.optJSONObject(m.d.f73919oq);
            com.thinkup.core.common.mq.dd ddVarD = com.thinkup.core.common.mq.dd.d(jSONObjectOptJSONObject);
            m mVar = new m();
            if (ddVarD != null) {
                ddVarD.m0();
                mVar.d(ddVarD);
            }
            if (jSONObjectOptJSONObject2 != null) {
                m.d(mVar, jSONObjectOptJSONObject2);
            }
            return mVar;
        } catch (Throwable unused) {
            return null;
        }
    }
}