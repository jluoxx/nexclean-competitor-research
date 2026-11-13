package com.thinkup.core.common.mq;

import android.text.TextUtils;
import com.mbridge.msdk.playercommon.exoplayer2.trackselection.AdaptiveTrackSelection;
import com.tradplus.ads.base.util.BaseTimeOutAdapter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes7.dex */
public class dd {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final String f71474d = "dd";

    /* JADX INFO: renamed from: d0, reason: collision with root package name */
    private int f71475d0;

    /* JADX INFO: renamed from: dd, reason: collision with root package name */
    private long f71476dd;

    /* JADX INFO: renamed from: dm, reason: collision with root package name */
    private int f71477dm;

    /* JADX INFO: renamed from: dn, reason: collision with root package name */
    private long f71478dn;

    /* JADX INFO: renamed from: do, reason: not valid java name */
    private Integer[] f196do;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private boolean f71480m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private long f71482n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private int f71483o;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private long f71484q;

    /* JADX INFO: renamed from: dq, reason: collision with root package name */
    private final List<dm> f71479dq = Collections.synchronizedList(new ArrayList());

    /* JADX INFO: renamed from: m0, reason: collision with root package name */
    private final Map<String, dm> f71481m0 = new ConcurrentHashMap();

    public static dd d(JSONObject jSONObject) {
        if (jSONObject == null) {
            return null;
        }
        try {
            dd ddVar = new dd();
            ddVar.f71482n = jSONObject.optLong("pre_load_time", BaseTimeOutAdapter.TIME_DELTA);
            ddVar.f71483o = jSONObject.optInt("pre_load_num", 1);
            ddVar.f71484q = jSONObject.optLong("pre_load_timeout", BaseTimeOutAdapter.TIME_DELTA);
            ddVar.f71475d0 = jSONObject.optInt("pre_load_mode", 1);
            ddVar.f71476dd = jSONObject.optLong("shared_delay_time_in_wf", AdaptiveTrackSelection.DEFAULT_MIN_TIME_BETWEEN_BUFFER_REEVALUTATION_MS);
            ddVar.f71478dn = jSONObject.optLong("shared_retry_time_in_loadfailed", 15000L);
            ddVar.f71477dm = jSONObject.optInt("shared_retry_count_in_loadfailed", 6);
            ddVar.f196do = m(jSONObject);
            JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("formats");
            if (jSONArrayOptJSONArray != null) {
                int length = jSONArrayOptJSONArray.length();
                for (int i10 = 0; i10 < length; i10++) {
                    try {
                        JSONObject jSONObjectOptJSONObject = jSONArrayOptJSONArray.optJSONObject(i10);
                        if (jSONObjectOptJSONObject != null) {
                            dm dmVar = new dm();
                            dmVar.f71485d = jSONObjectOptJSONObject.optInt(com.thinkup.core.common.d0.d.C0836d.f67683o);
                            dmVar.f71491m = jSONObjectOptJSONObject.optString(com.thinkup.core.common.m0.d0.ndo, "");
                            dmVar.f71492n = jSONObjectOptJSONObject.optInt("req_pacing");
                            dmVar.f71493o = jSONObjectOptJSONObject.optInt("ad_cache", 1);
                            dmVar.f71494q = jSONObjectOptJSONObject.optDouble("ad_ecpm", -1.0d);
                            dmVar.f197do = ddVar;
                            if (!jSONObjectOptJSONObject.isNull("pre_load_mode_n")) {
                                dmVar.f71490dq = n(jSONObjectOptJSONObject);
                            }
                            ddVar.f71479dq.add(dmVar);
                            ddVar.f71481m0.put(dmVar.f71491m, dmVar);
                        }
                    } catch (Throwable unused) {
                    }
                }
            }
            return ddVar;
        } catch (Throwable unused2) {
            return null;
        }
    }

    private static Integer[] m(JSONObject jSONObject) {
        try {
            JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("pre_load_mode_n");
            if (jSONArrayOptJSONArray == null || jSONArrayOptJSONArray.length() <= 0) {
                return new Integer[]{Integer.valueOf(d(jSONObject.optInt("pre_load_mode", 1))), 6, 11};
            }
            Integer[] numArr = new Integer[jSONArrayOptJSONArray.length()];
            for (int i10 = 0; i10 < jSONArrayOptJSONArray.length(); i10++) {
                try {
                    numArr[i10] = Integer.valueOf(d(jSONArrayOptJSONArray.optInt(i10)));
                } catch (Throwable unused) {
                    return numArr;
                }
            }
            return numArr;
        } catch (Throwable unused2) {
            return null;
        }
    }

    private int md() {
        return this.f71475d0;
    }

    private static Integer[] n(JSONObject jSONObject) {
        Integer[] numArr = null;
        try {
            JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("pre_load_mode_n");
            if (jSONArrayOptJSONArray != null && jSONArrayOptJSONArray.length() > 0) {
                numArr = new Integer[jSONArrayOptJSONArray.length()];
                for (int i10 = 0; i10 < jSONArrayOptJSONArray.length(); i10++) {
                    numArr[i10] = Integer.valueOf(d(jSONArrayOptJSONArray.optInt(i10)));
                }
            }
        } catch (Throwable unused) {
        }
        return numArr;
    }

    public final long d0() {
        return this.f71476dd;
    }

    public final int dd() {
        if (this.f71477dm <= 0) {
            this.f71477dm = 6;
        }
        return this.f71477dm;
    }

    public final long dm() {
        return this.f71478dn;
    }

    public final boolean dn() {
        Integer[] numArr;
        if (this.f71479dq != null) {
            for (int i10 = 0; i10 < this.f71479dq.size(); i10++) {
                dm dmVar = this.f71479dq.get(i10);
                if (dmVar != null && (numArr = dmVar.f71490dq) != null) {
                    for (Integer num : numArr) {
                        if (num.intValue() == 10) {
                            return true;
                        }
                    }
                }
            }
        }
        Integer[] numArr2 = this.f196do;
        if (numArr2 != null) {
            return Arrays.asList(numArr2).contains(10);
        }
        return false;
    }

    /* JADX INFO: renamed from: do, reason: not valid java name */
    public final boolean m285do() {
        Integer[] numArr = this.f196do;
        if (numArr != null) {
            return Arrays.asList(numArr).contains(10);
        }
        return false;
    }

    public final boolean dq() {
        return this.f71480m;
    }

    public final void m0() {
        this.f71480m = true;
    }

    public final Map<String, dm> o() {
        return this.f71481m0;
    }

    public final List<dm> q() {
        return this.f71479dq;
    }

    public String toString() {
        return "SharedPlaceConfig{isPreLocalConfig=" + this.f71480m + ", delayPreloadTime=" + this.f71482n + ", parallelReqNum=" + this.f71483o + ", preLoadTimeout=" + this.f71484q + ", preloadMode=" + this.f71475d0 + ", loadDelayTimeInWF=" + this.f71476dd + ", retryLoadCountInFailed=" + this.f71477dm + ", retryLoadDelayTimeInfFailed=" + this.f71478dn + ", loadModes=" + Arrays.toString(this.f196do) + ", sharedPlaceInfoList=" + this.f71479dq + ", placementIdToSharedPlaceInfoMap=" + this.f71481m0 + '}';
    }

    public final long n() {
        return this.f71484q;
    }

    public final int m() {
        return this.f71483o;
    }

    private static int d(int i10) {
        switch (i10) {
            case 1:
                return 10;
            case 2:
                return 12;
            case 3:
                return 6;
            case 4:
                return 11;
            case 5:
                return 15;
            case 6:
                return 16;
            default:
                return 17;
        }
    }

    public final long d() {
        return this.f71482n;
    }

    public final boolean d(int i10, String str) {
        dm dmVar;
        Integer[] numArr;
        if (this.f71481m0 == null || TextUtils.isEmpty(str) || (dmVar = this.f71481m0.get(str)) == null || (numArr = dmVar.f71490dq) == null) {
            Integer[] numArr2 = this.f196do;
            if (numArr2 != null) {
                return Arrays.asList(numArr2).contains(Integer.valueOf(i10));
            }
        } else {
            for (Integer num : numArr) {
                if (num.intValue() == i10) {
                    return true;
                }
            }
        }
        return false;
    }
}