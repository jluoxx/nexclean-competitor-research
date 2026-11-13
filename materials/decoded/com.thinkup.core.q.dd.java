package com.thinkup.core.q;

import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes7.dex */
public final class dd {

    /* JADX INFO: renamed from: dd, reason: collision with root package name */
    private int[] f73827dd;

    /* JADX INFO: renamed from: dm, reason: collision with root package name */
    private String f73828dm;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f73825d = 1;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private int f73829m = 0;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private int f73830n = 3;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private int f73831o = 1;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private double f73832q = 2.0d;

    /* JADX INFO: renamed from: d0, reason: collision with root package name */
    private int f73826d0 = 3;

    public static dd d(String str) {
        try {
            JSONObject jSONObject = new JSONObject(str);
            dd ddVar = new dd();
            ddVar.f73825d = jSONObject.optInt("limit_sw", 1);
            ddVar.f73829m = jSONObject.optInt("latest_day", 0);
            ddVar.f73830n = jSONObject.optInt("max_n", 3);
            ddVar.f73831o = jSONObject.optInt("min_m", 1);
            ddVar.f73832q = jSONObject.optDouble("premium_rate", 2.0d);
            ddVar.f73826d0 = jSONObject.optInt("premium_level", 3);
            JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("not_filter_list");
            if (jSONArrayOptJSONArray != null && jSONArrayOptJSONArray.length() > 0) {
                ddVar.f73828dm = jSONArrayOptJSONArray.toString();
                ddVar.f73827dd = new int[jSONArrayOptJSONArray.length()];
                for (int i10 = 0; i10 < jSONArrayOptJSONArray.length(); i10++) {
                    ddVar.f73827dd[i10] = jSONArrayOptJSONArray.optInt(i10);
                }
            }
            return ddVar;
        } catch (Throwable unused) {
            return null;
        }
    }

    public final int d0() {
        return this.f73826d0;
    }

    public final int[] dd() {
        return this.f73827dd;
    }

    public final String dm() {
        return this.f73828dm;
    }

    public final int m() {
        return this.f73829m;
    }

    public final int n() {
        return this.f73830n;
    }

    public final int o() {
        return this.f73831o;
    }

    public final double q() {
        return this.f73832q;
    }

    public final String toString() {
        return "DynamicWaterfallStrategy{limitSegmentSwitch=" + this.f73825d + ", latestDay=" + this.f73829m + ", maxCollectCount=" + this.f73830n + ", minCollectCount=" + this.f73831o + ", premiumRate=" + this.f73832q + ", premiumLevel=" + this.f73826d0 + '}';
    }

    public final int d() {
        return this.f73825d;
    }
}