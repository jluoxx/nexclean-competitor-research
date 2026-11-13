package com.thinkup.core.q;

import android.content.Context;
import com.thinkup.core.api.AdError;
import com.thinkup.core.common.dm.dmm;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.thinkup.core.q.do, reason: invalid class name */
/* JADX INFO: loaded from: classes7.dex */
public class Cdo {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final String f73855d = "do";

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private static volatile Cdo f73856m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private Context f73857n;

    /* JADX INFO: renamed from: com.thinkup.core.q.do$d */
    public interface d {
        void d(String str);

        void d(JSONObject jSONObject);
    }

    private Cdo(Context context) {
        this.f73857n = context.getApplicationContext();
    }

    public static Cdo d(Context context) {
        if (f73856m == null) {
            synchronized (Cdo.class) {
                try {
                    if (f73856m == null) {
                        f73856m = new Cdo(context);
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        return f73856m;
    }

    private static void m(Object obj, d dVar) {
        if (!(obj instanceof JSONObject)) {
            if (dVar != null) {
                dVar.d("get mediation adapter Strategy error");
            }
        } else {
            JSONObject jSONObject = (JSONObject) obj;
            d(jSONObject);
            if (dVar != null) {
                dVar.d(jSONObject);
            }
        }
    }

    private static dn d(JSONObject jSONObject) {
        try {
            jSONObject.put(dn.m.f73851m, System.currentTimeMillis());
        } catch (Throwable unused) {
        }
        return dn.d(jSONObject);
    }

    public final synchronized void d(dmm dmmVar, final d dVar) {
        new com.thinkup.core.common.m0.mn(this.f73857n, dmmVar).d(0, new com.thinkup.core.common.m0.nd() { // from class: com.thinkup.core.q.do.1
            @Override // com.thinkup.core.common.m0.nd
            public final void onLoadCanceled(int i10) {
                d dVar2 = dVar;
                if (dVar2 != null) {
                    dVar2.d("Request cancel");
                }
            }

            @Override // com.thinkup.core.common.m0.nd
            public final void onLoadError(int i10, String str, AdError adError) {
                d dVar2 = dVar;
                if (dVar2 != null) {
                    if (str == null) {
                        str = "Request Strategy error.";
                    }
                    dVar2.d(str);
                }
            }

            @Override // com.thinkup.core.common.m0.nd
            public final void onLoadFinish(int i10, Object obj) {
                Context unused = Cdo.this.f73857n;
                Cdo.d(obj, dVar);
            }

            @Override // com.thinkup.core.common.m0.nd
            public final void onLoadStart(int i10) {
            }
        });
    }

    public static /* synthetic */ void d(Object obj, d dVar) {
        if (!(obj instanceof JSONObject)) {
            if (dVar != null) {
                dVar.d("get mediation adapter Strategy error");
            }
        } else {
            JSONObject jSONObject = (JSONObject) obj;
            d(jSONObject);
            if (dVar != null) {
                dVar.d(jSONObject);
            }
        }
    }
}