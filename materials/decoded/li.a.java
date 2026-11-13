package li;

import android.content.Context;
import android.os.Build;
import android.text.TextUtils;
import com.neeeex.eraser.m0;
import com.neeeex.eraser.utils.b0;
import com.neeeex.eraser.y;
import java.util.HashMap;
import java.util.Map;
import java.util.TimeZone;
import java.util.UUID;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes7.dex */
public class a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final String f87855b = "F73600D4801081276AF0543B219E2A6F" /* decoded XOR */;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f87856a = "https://nexclean3.com/prod-api/" /* decoded XOR */;

    /* JADX INFO: renamed from: li.a$a, reason: collision with other inner class name */
    public class C1122a implements e.b {
        public C1122a() {
        }

        @Override // li.e.b
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void onSuccess(String str) {
            a.this.b(str);
        }

        @Override // li.e.b
        public void onError(String str) {
        }
    }

    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f87858a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f87859b = String.valueOf(System.currentTimeMillis());

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final String f87860c = li.b.c(7);

        public b(JSONObject jSONObject) {
            this.f87858a = jSONObject.toString();
        }

        public String a() {
            String strB = li.b.b("base=" /* decoded XOR */ + this.f87858a + "&nonce=" /* decoded XOR */ + this.f87860c + "&timestamp=" /* decoded XOR */ + this.f87859b + "&key=" /* decoded XOR */ + "F73600D4801081276AF0543B219E2A6F" /* decoded XOR */);
            return strB == null ? "" : strB.toUpperCase();
        }
    }

    public static final class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Context f87861a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f87862b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final String f87863c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final String f87864d;

        public c(Context context, String str, String str2, String str3) {
            this.f87861a = context;
            this.f87862b = str;
            this.f87863c = str2;
            this.f87864d = str3;
        }
    }

    public final void b(String str) {
        try {
            new JSONObject(str).optInt("code" /* decoded XOR */);
        } catch (Exception e10) {
            e10.printStackTrace();
        }
    }

    public final Map c(c cVar) {
        HashMap map = new HashMap();
        try {
            b bVar = new b(e(d(), cVar.f87863c, cVar.f87864d));
            map.put("base" /* decoded XOR */, bVar.f87858a);
            map.put("timestamp" /* decoded XOR */, bVar.f87859b);
            map.put("nonce" /* decoded XOR */, bVar.f87860c);
            map.put("push_token" /* decoded XOR */, cVar.f87862b);
            map.put("sign" /* decoded XOR */, bVar.a());
            map.put("gaid" /* decoded XOR */, y.Companion.b());
            map.put("package_name" /* decoded XOR */, cVar.f87861a.getPackageName());
            return map;
        } catch (Exception e10) {
            e10.printStackTrace();
            return map;
        }
    }

    public final String d() {
        b0 b0Var = b0.f66131a;
        String strX = b0Var.x("device_id" /* decoded XOR */, "");
        if (!TextUtils.isEmpty(strX)) {
            return strX;
        }
        String string = UUID.randomUUID().toString();
        b0Var.D("device_id" /* decoded XOR */, string);
        return string;
    }

    public final JSONObject e(String str, String str2, String str3) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        Object[][] objArr = {new Object[]{"deviceId" /* decoded XOR */, str}, new Object[]{"os" /* decoded XOR */, "1" /* decoded XOR */}, new Object[]{"deviceModel" /* decoded XOR */, Build.MANUFACTURER}, new Object[]{"appLang" /* decoded XOR */, str2}, new Object[]{"appVersion" /* decoded XOR */, str3}, new Object[]{"sysVersion" /* decoded XOR */, Build.VERSION.RELEASE}, new Object[]{"timezone" /* decoded XOR */, g()}};
        for (int i10 = 0; i10 < 7; i10++) {
            Object[] objArr2 = objArr[i10];
            jSONObject.put((String) objArr2[0], objArr2[1]);
        }
        return jSONObject;
    }

    public final void f(c cVar) {
        e.b(cVar.f87861a).d(this.f87856a + "app/init" /* decoded XOR */, new HashMap(), c(cVar), new C1122a());
    }

    public final String g() {
        String str;
        String str2;
        int rawOffset = TimeZone.getDefault().getRawOffset() / 60000;
        if (rawOffset < 0) {
            str = "tA==\n";
            str2 = "meogdnE+snY=\n";
        } else {
            str = "Gg==\n";
            str2 = "MTDcMPpoQSI=\n";
        }
        return m0.a(str, str2) + (Math.abs(rawOffset) / 60);
    }

    public void h(Context context, String str, String str2, String str3) {
        f(new c(context, str, str2, str3));
    }
}