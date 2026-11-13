package fg;

import android.content.Context;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.SuccessContinuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import ve.y;

/* JADX INFO: loaded from: classes6.dex */
public class k {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final byte[] f80860n = new byte[0];

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f80861a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ne.f f80862b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final oe.c f80863c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Executor f80864d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final gg.e f80865e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final gg.e f80866f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final gg.e f80867g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final com.google.firebase.remoteconfig.internal.c f80868h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final gg.l f80869i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final com.google.firebase.remoteconfig.internal.d f80870j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final vf.h f80871k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final gg.m f80872l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final hg.e f80873m;

    public k(Context context, ne.f fVar, vf.h hVar, oe.c cVar, Executor executor, gg.e eVar, gg.e eVar2, gg.e eVar3, com.google.firebase.remoteconfig.internal.c cVar2, gg.l lVar, com.google.firebase.remoteconfig.internal.d dVar, gg.m mVar, hg.e eVar4) {
        this.f80861a = context;
        this.f80862b = fVar;
        this.f80871k = hVar;
        this.f80863c = cVar;
        this.f80864d = executor;
        this.f80865e = eVar;
        this.f80866f = eVar2;
        this.f80867g = eVar3;
        this.f80868h = cVar2;
        this.f80869i = lVar;
        this.f80870j = dVar;
        this.f80872l = mVar;
        this.f80873m = eVar4;
    }

    public static /* synthetic */ Void a(k kVar, p pVar) {
        kVar.f80870j.k(pVar);
        return null;
    }

    public static /* synthetic */ Task f(final k kVar, Task task, Task task2, Task task3) {
        kVar.getClass();
        if (!task.isSuccessful() || task.getResult() == null) {
            return Tasks.forResult(Boolean.FALSE);
        }
        com.google.firebase.remoteconfig.internal.b bVar = (com.google.firebase.remoteconfig.internal.b) task.getResult();
        return (!task2.isSuccessful() || q(bVar, (com.google.firebase.remoteconfig.internal.b) task2.getResult())) ? kVar.f80866f.i(bVar).continueWith(kVar.f80864d, new Continuation() { // from class: fg.j
            @Override // com.google.android.gms.tasks.Continuation
            public final Object then(Task task4) {
                return Boolean.valueOf(this.f80859a.r(task4));
            }
        }) : Tasks.forResult(Boolean.FALSE);
    }

    public static k l() {
        return m(ne.f.l());
    }

    public static k m(ne.f fVar) {
        return ((u) fVar.j(u.class)).g();
    }

    public static boolean q(com.google.firebase.remoteconfig.internal.b bVar, com.google.firebase.remoteconfig.internal.b bVar2) {
        return bVar2 == null || !bVar.h().equals(bVar2.h());
    }

    public static List x(JSONArray jSONArray) throws JSONException {
        ArrayList arrayList = new ArrayList();
        for (int i10 = 0; i10 < jSONArray.length(); i10++) {
            HashMap map = new HashMap();
            JSONObject jSONObject = jSONArray.getJSONObject(i10);
            Iterator<String> itKeys = jSONObject.keys();
            while (itKeys.hasNext()) {
                String next = itKeys.next();
                map.put(next, jSONObject.getString(next));
            }
            arrayList.add(map);
        }
        return arrayList;
    }

    public Task g() {
        final Task taskE = this.f80865e.e();
        final Task taskE2 = this.f80866f.e();
        return Tasks.whenAllComplete((Task<?>[]) new Task[]{taskE, taskE2}).continueWithTask(this.f80864d, new Continuation() { // from class: fg.h
            @Override // com.google.android.gms.tasks.Continuation
            public final Object then(Task task) {
                return k.f(this.f80856a, taskE, taskE2, task);
            }
        });
    }

    public d h(c cVar) {
        return this.f80872l.a(cVar);
    }

    public Task i() {
        return this.f80868h.i().onSuccessTask(y.a(), new SuccessContinuation() { // from class: fg.i
            @Override // com.google.android.gms.tasks.SuccessContinuation
            public final Task then(Object obj) {
                return Tasks.forResult(null);
            }
        });
    }

    public Task j() {
        return i().onSuccessTask(this.f80864d, new SuccessContinuation() { // from class: fg.g
            @Override // com.google.android.gms.tasks.SuccessContinuation
            public final Task then(Object obj) {
                return this.f80855a.g();
            }
        });
    }

    public boolean k(String str) {
        return this.f80869i.d(str);
    }

    public long n(String str) {
        return this.f80869i.f(str);
    }

    public hg.e o() {
        return this.f80873m;
    }

    public q p(String str) {
        return this.f80869i.i(str);
    }

    public final boolean r(Task task) {
        if (!task.isSuccessful()) {
            return false;
        }
        this.f80865e.d();
        com.google.firebase.remoteconfig.internal.b bVar = (com.google.firebase.remoteconfig.internal.b) task.getResult();
        if (bVar == null) {
            return true;
        }
        y(bVar.e());
        this.f80873m.d(bVar);
        return true;
    }

    public Task s(final p pVar) {
        return Tasks.call(this.f80864d, new Callable() { // from class: fg.f
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return k.a(this.f80853a, pVar);
            }
        });
    }

    public void t(boolean z10) {
        this.f80872l.c(z10);
    }

    public Task u(Map map) {
        HashMap map2 = new HashMap();
        for (Map.Entry entry : map.entrySet()) {
            Object value = entry.getValue();
            if (value instanceof byte[]) {
                map2.put((String) entry.getKey(), new String((byte[]) value));
            } else {
                map2.put((String) entry.getKey(), value.toString());
            }
        }
        return v(map2);
    }

    public final Task v(Map map) {
        try {
            return this.f80867g.i(com.google.firebase.remoteconfig.internal.b.l().b(map).a()).onSuccessTask(y.a(), new SuccessContinuation() { // from class: fg.e
                @Override // com.google.android.gms.tasks.SuccessContinuation
                public final Task then(Object obj) {
                    return Tasks.forResult(null);
                }
            });
        } catch (JSONException unused) {
            return Tasks.forResult(null);
        }
    }

    public void w() {
        this.f80866f.e();
        this.f80867g.e();
        this.f80865e.e();
    }

    public void y(JSONArray jSONArray) {
        if (this.f80863c == null) {
            return;
        }
        try {
            this.f80863c.m(x(jSONArray));
        } catch (oe.a | JSONException unused) {
        }
    }
}