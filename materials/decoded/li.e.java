package li;

import android.content.Context;
import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.StringRequest;
import com.android.volley.toolbox.Volley;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/* JADX INFO: loaded from: classes7.dex */
public class e {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static e f87870c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final RequestQueue f87871a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Map f87872b = new HashMap();

    public static final class a extends StringRequest {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Map f87873a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Map f87874b;

        public a(int i10, String str, Map map, Map map2, Response.Listener listener, Response.ErrorListener errorListener) {
            super(i10, str, listener, errorListener);
            this.f87873a = map;
            this.f87874b = map2;
        }

        @Override // com.android.volley.Request
        public Map getHeaders() {
            return this.f87874b;
        }

        @Override // com.android.volley.Request
        public Map getParams() {
            return this.f87873a;
        }
    }

    public interface b {
        void onError(String str);

        void onSuccess(Object obj);
    }

    public e(Context context) {
        this.f87871a = Volley.newRequestQueue(context.getApplicationContext());
    }

    public static synchronized e b(Context context) {
        e eVar = f87870c;
        if (eVar != null) {
            return eVar;
        }
        e eVar2 = new e(context);
        f87870c = eVar2;
        return eVar2;
    }

    public final Map c(Map map) {
        HashMap map2 = this.f87872b == null ? new HashMap() : new HashMap(this.f87872b);
        if (map != null) {
            map2.putAll(map);
        }
        return map2;
    }

    public void d(String str, Map map, Map map2, final b bVar) {
        Map mapC = c(map2);
        Objects.requireNonNull(bVar);
        e(new a(1, str, map, mapC, new Response.Listener() { // from class: li.c
            @Override // com.android.volley.Response.Listener
            public final void onResponse(Object obj) {
                bVar.onSuccess((String) obj);
            }
        }, new Response.ErrorListener() { // from class: li.d
            @Override // com.android.volley.Response.ErrorListener
            public final void onErrorResponse(VolleyError volleyError) {
                bVar.onError(volleyError.getMessage());
            }
        }));
    }

    public final void e(Request request) {
        this.f87871a.add(request);
    }
}