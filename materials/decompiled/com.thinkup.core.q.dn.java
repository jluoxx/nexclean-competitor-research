package com.thinkup.core.q;

import android.text.TextUtils;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes7.dex */
public class dn extends q {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int f73835d = 1;

    /* JADX INFO: renamed from: d0, reason: collision with root package name */
    public static final long f73836d0 = 604800000;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final int f73837m = 3;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final int f73838n = 3;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final int f73839q = 5;

    /* JADX INFO: renamed from: dd, reason: collision with root package name */
    private int f73840dd;

    /* JADX INFO: renamed from: dm, reason: collision with root package name */
    private d f73841dm;

    /* JADX INFO: renamed from: dn, reason: collision with root package name */
    private JSONObject f73842dn;

    /* JADX INFO: renamed from: do, reason: not valid java name */
    private long f248do;

    /* JADX INFO: renamed from: dq, reason: collision with root package name */
    private long f73843dq;

    public static class d {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public int f73844d;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public int f73845m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public int f73846n;
    }

    public static class m {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static String f73847d = "adap_c";

        /* JADX INFO: renamed from: d0, reason: collision with root package name */
        private static String f73848d0 = "value_times";

        /* JADX INFO: renamed from: dd, reason: collision with root package name */
        private static String f73849dd = "cold_times";

        /* JADX INFO: renamed from: dm, reason: collision with root package name */
        private static String f73850dm = "st_timeout";

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public static String f73851m = "updateTime";

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private static String f73852n = "rule";

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        private static String f73853o = "group_st";

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        private static String f73854q = "num";
    }

    public static dn d(JSONObject jSONObject) {
        if (jSONObject == null) {
            return null;
        }
        dn dnVar = new dn();
        try {
            dnVar.m(jSONObject);
            dnVar.n(jSONObject);
            dnVar.o(jSONObject);
            dnVar.f73840dd = jSONObject.optInt(m.f73852n, 1);
            String strOptString = jSONObject.optString(m.f73853o);
            if (!TextUtils.isEmpty(strOptString)) {
                try {
                    JSONObject jSONObject2 = new JSONObject(strOptString);
                    d dVar = new d();
                    dVar.f73844d = jSONObject2.optInt(m.f73854q, 3);
                    dVar.f73845m = jSONObject2.optInt(m.f73848d0, 3);
                    dVar.f73846n = jSONObject2.optInt(m.f73849dd, 5);
                    dnVar.f73841dm = dVar;
                } catch (Throwable th2) {
                    th2.printStackTrace();
                }
            }
            dnVar.f73842dn = jSONObject.optJSONObject(m.f73847d);
            dnVar.f73843dq = jSONObject.optLong(m.f73851m, 0L);
            dnVar.f248do = jSONObject.optLong(m.f73850dm, f73836d0);
        } catch (Throwable unused) {
        }
        return dnVar;
    }

    private long d0() {
        return this.f248do;
    }

    private long o() {
        return this.f73843dq;
    }

    private JSONObject q() {
        return this.f73842dn;
    }

    public final d m() {
        return this.f73841dm;
    }

    public final boolean n() {
        return System.currentTimeMillis() - this.f73843dq > this.f248do;
    }

    private void m(long j10) {
        this.f248do = j10;
    }

    private void q(JSONObject jSONObject) {
        this.f73842dn = jSONObject;
    }

    public final int d() {
        return this.f73840dd;
    }

    private void d(int i10) {
        this.f73840dd = i10;
    }

    private void d(d dVar) {
        this.f73841dm = dVar;
    }

    private void d(long j10) {
        this.f73843dq = j10;
    }
}