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
    public static final String f87855b = m0.a("iNJYzIdIOJz21VrKj0lOn/ikLcqCTE/q/NRSv4U5Su4=\n", "zuVr+rd4fKg=\n");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f87856a = m0.a("qc1rrIpbAiWv3Ge/lQRMZPKXfLOUTl14rt0yvYkIAg==\n", "wbkf3PlhLQo=\n");

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
            String strB = li.b.b(m0.a("OR9cSqM=\n", "W34vL57iJL4=\n") + this.f87858a + m0.a("mM9PQZBltw==\n", "vqEgL/MAivo=\n") + this.f87860c + m0.a("cVIDGHuC0pg6Vlc=\n", "VyZqdR7xpvk=\n") + this.f87859b + m0.a("jTfHtmo=\n", "q1yiz1fc7Kg=\n") + m0.a("Hi6a+CC8cBNgKZj+KL0GEG5Y7/4luAdlaiiQiyLNAmE=\n", "WBmpzhCMNCc=\n"));
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
            new JSONObject(str).optInt(m0.a("Qi/kLw==\n", "IUCASiwQr0U=\n"));
        } catch (Exception e10) {
            e10.printStackTrace();
        }
    }

    public final Map c(c cVar) {
        HashMap map = new HashMap();
        try {
            b bVar = new b(e(d(), cVar.f87863c, cVar.f87864d));
            map.put(m0.a("QsIoCQ==\n", "IKNbbEZ88FU=\n"), bVar.f87858a);
            map.put(m0.a("wqQFkExNWEHG\n", "ts1o9T85OSw=\n"), bVar.f87859b);
            map.put(m0.a("zzNl+Ns=\n", "oVwLm74YpoU=\n"), bVar.f87860c);
            map.put(m0.a("3SyFiv0Q17bINw==\n", "rVn24qJkuN0=\n"), cVar.f87862b);
            map.put(m0.a("qtjkbA==\n", "2bGDArEC/YQ=\n"), bVar.a());
            map.put(m0.a("3FxjCg==\n", "uz0KbjzTXfw=\n"), y.Companion.b());
            map.put(m0.a("32VYhCa9UPPBZVaK\n", "rwQ770faNaw=\n"), cVar.f87861a.getPackageName());
            return map;
        } catch (Exception e10) {
            e10.printStackTrace();
            return map;
        }
    }

    public final String d() {
        b0 b0Var = b0.f66131a;
        String strX = b0Var.x(m0.a("1foSTiWz+VjV\n", "sZ9kJ0bWpjE=\n"), "");
        if (!TextUtils.isEmpty(strX)) {
            return strX;
        }
        String string = UUID.randomUUID().toString();
        b0Var.D(m0.a("6OVCebOQprHo\n", "jIA0END1+dg=\n"), string);
        return string;
    }

    public final JSONObject e(String str, String str2, String str3) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        Object[][] objArr = {new Object[]{m0.a("tPzC9VSBoLc=\n", "0Jm0nDfk6dM=\n"), str}, new Object[]{m0.a("c1c=\n", "HCQQbatbwos=\n"), m0.a("ug==\n", "i2+SHnCE4mI=\n")}, new Object[]{m0.a("cHan4JGGAZlwdr0=\n", "FBPRifLjTPY=\n"), Build.MANUFACTURER}, new Object[]{m0.a("KL422gEMUA==\n", "Sc5GlmBiN6s=\n"), str2}, new Object[]{m0.a("Z++P5/8oDhRp8Q==\n", "Bp//sZpafX0=\n"), str3}, new Object[]{m0.a("M3u1pmQh3wEvbA==\n", "QALG8AFTrGg=\n"), Build.VERSION.RELEASE}, new Object[]{m0.a("hNa6+xfZSyQ=\n", "8L/Xnm22JUE=\n"), g()}};
        for (int i10 = 0; i10 < 7; i10++) {
            Object[] objArr2 = objArr[i10];
            jSONObject.put((String) objArr2[0], objArr2[1]);
        }
        return jSONObject;
    }

    public final void f(c cVar) {
        e.b(cVar.f87861a).d(this.f87856a + m0.a("KBQoeADkwcs=\n", "SWRYV2mKqL8=\n"), new HashMap(), c(cVar), new C1122a());
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