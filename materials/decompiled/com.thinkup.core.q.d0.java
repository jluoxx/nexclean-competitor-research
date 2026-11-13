package com.thinkup.core.q;

import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes7.dex */
public final class d0 {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private List<Integer> f73821m;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f73819d = 0;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private int f73822n = 1500;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private int f73823o = 1;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private float f73824q = 1.0f;

    /* JADX INFO: renamed from: d0, reason: collision with root package name */
    private int f73820d0 = 1;

    public static d0 d(JSONObject jSONObject) {
        try {
            d0 d0Var = new d0();
            d0Var.f73819d = jSONObject.optInt("dfp_exec_mode", 0);
            JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("nw_firm_id");
            d0Var.f73821m = new ArrayList();
            if (jSONArrayOptJSONArray != null) {
                for (int i10 = 0; i10 < jSONArrayOptJSONArray.length(); i10++) {
                    d0Var.f73821m.add(Integer.valueOf(jSONArrayOptJSONArray.optInt(i10)));
                }
            }
            d0Var.f73822n = jSONObject.optInt("bid_wait_window", 1500);
            d0Var.f73823o = jSONObject.optInt("bid_wait_min_count", 1);
            float fOptDouble = (float) jSONObject.optDouble("dfp_rate", 1.0d);
            if (fOptDouble <= 0.0f) {
                fOptDouble = 1.0f;
            }
            d0Var.f73824q = fOptDouble;
            d0Var.f73820d0 = jSONObject.optInt("dfp_fail_fallback", 1);
            if (d0Var.f73819d != 1 || d0Var.f73821m.isEmpty()) {
                return null;
            }
            return d0Var;
        } catch (Throwable unused) {
        }
    }

    private int d0() {
        return this.f73819d;
    }

    public final int m() {
        return this.f73822n;
    }

    public final int n() {
        return this.f73823o;
    }

    public final float o() {
        return this.f73824q;
    }

    public final int q() {
        return this.f73820d0;
    }

    private void m(int i10) {
        this.f73822n = i10;
    }

    private void n(int i10) {
        this.f73823o = i10;
    }

    private void o(int i10) {
        this.f73820d0 = i10;
    }

    public final List<Integer> d() {
        return this.f73821m;
    }

    private void d(List<Integer> list) {
        this.f73821m = list;
    }

    private void d(float f10) {
        this.f73824q = f10;
    }

    private void d(int i10) {
        this.f73819d = i10;
    }
}