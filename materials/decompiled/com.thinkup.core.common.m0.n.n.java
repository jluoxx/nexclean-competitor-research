package com.thinkup.core.common.m0.n;

import android.text.TextUtils;
import com.thinkup.core.api.TUSDK;
import com.thinkup.core.common.md.d.dq;
import com.thinkup.core.common.o.dn;
import java.util.ArrayList;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes7.dex */
public final class n {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final long f69917d = 500;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private static final m[] f69918m = {new m(dn.on.f72874d, 53, 500), new m(dn.on.f72879m, 53, 500), new m(dn.on.f72880n, 53, 500), new m(dn.on.f72881o, 53, 500), new m(dn.on.f72882q, 53, 500), new m(dn.on.f72875d0, 53, 500)};

    /* JADX INFO: renamed from: d0, reason: collision with root package name */
    private long f69919d0;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private int f69923n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private d f69924o;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private int f69925q = 1;

    /* JADX INFO: renamed from: dd, reason: collision with root package name */
    private int f69920dd = 1;

    /* JADX INFO: renamed from: dm, reason: collision with root package name */
    private int f69921dm = 1;

    /* JADX INFO: renamed from: dn, reason: collision with root package name */
    private int f69922dn = 1;

    public static class d {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final int[] f69926d;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        private final long f69927m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private final m[] f69928n;

        public d(int[] iArr, long j10, m[] mVarArr) {
            this.f69926d = iArr;
            this.f69927m = j10;
            this.f69928n = mVarArr;
        }

        private long n() {
            return this.f69927m;
        }

        public final int[] d() {
            return this.f69926d;
        }

        public final m[] m() {
            return this.f69928n;
        }
    }

    public static class m {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final String f69929d;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        private final int f69930m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private final long f69931n;

        public m(String str, int i10, long j10) {
            this.f69929d = str;
            this.f69930m = i10;
            this.f69931n = j10;
        }

        public final String d() {
            return this.f69929d;
        }

        public final int m() {
            return this.f69930m;
        }

        public final long n() {
            return this.f69931n;
        }
    }

    private n() {
    }

    public static n d(JSONObject jSONObject) {
        int[] iArr = null;
        if (jSONObject == null) {
            return null;
        }
        n nVar = new n();
        nVar.f69923n = jSONObject.optInt("net_type", 2);
        nVar.f69925q = jSONObject.optInt("dns_udp_sw", 1);
        nVar.f69920dd = jSONObject.optInt("dns_doh_sw", 1);
        nVar.f69919d0 = jSONObject.optLong("tcp_f_timeout", 0L);
        nVar.f69921dm = jSONObject.optInt("api_tcp_sw", 1);
        nVar.f69922dn = jSONObject.optInt("bid_tcp_sw", 1);
        JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("net_d");
        if (jSONObjectOptJSONObject != null) {
            long jOptLong = jSONObjectOptJSONObject.optLong("s_timeout", 500L);
            JSONArray jSONArrayOptJSONArray = jSONObjectOptJSONObject.optJSONArray("s_i");
            JSONArray jSONArrayOptJSONArray2 = jSONObjectOptJSONObject.optJSONArray("srv");
            if (jSONArrayOptJSONArray != null && jSONArrayOptJSONArray.length() > 0) {
                iArr = new int[jSONArrayOptJSONArray.length()];
                for (int i10 = 0; i10 < jSONArrayOptJSONArray.length(); i10++) {
                    iArr[i10] = jSONArrayOptJSONArray.optInt(i10);
                }
            }
            ArrayList arrayList = new ArrayList();
            if (jSONArrayOptJSONArray2 != null && jSONArrayOptJSONArray2.length() > 0) {
                for (int i11 = 0; i11 < jSONArrayOptJSONArray2.length(); i11++) {
                    JSONObject jSONObjectOptJSONObject2 = jSONArrayOptJSONArray2.optJSONObject(i11);
                    if (jSONObjectOptJSONObject2 != null) {
                        String strOptString = jSONObjectOptJSONObject2.optString("ip");
                        if (!TextUtils.isEmpty(strOptString)) {
                            arrayList.add(new m(strOptString, jSONObjectOptJSONObject2.optInt("port", 53), jSONObjectOptJSONObject2.optLong("timeout", 500L)));
                        }
                    }
                }
            }
            if (!arrayList.isEmpty()) {
                nVar.f69924o = new d(iArr, jOptLong, (m[]) arrayList.toArray(new m[0]));
            }
        }
        return nVar;
    }

    public static dq[] m() {
        if (TUSDK.isCnSDK()) {
            return null;
        }
        dq[] dqVarArr = new dq[f69918m.length];
        int i10 = 0;
        while (true) {
            m[] mVarArr = f69918m;
            if (i10 >= mVarArr.length) {
                return dqVarArr;
            }
            m mVar = mVarArr[i10];
            dqVarArr[i10] = new com.thinkup.core.common.md.d.dm(mVar.d(), mVar.m(), mVar.n());
            i10++;
        }
    }

    public final int d0() {
        return this.f69920dd;
    }

    public final int dd() {
        return this.f69921dm;
    }

    public final int dm() {
        return this.f69922dn;
    }

    public final int n() {
        return this.f69923n;
    }

    public final int o() {
        return this.f69925q;
    }

    public final long q() {
        return this.f69919d0;
    }

    private void n(int i10) {
        this.f69920dd = i10;
    }

    private void o(int i10) {
        this.f69921dm = i10;
    }

    private void q(int i10) {
        this.f69922dn = i10;
    }

    private void m(int i10) {
        this.f69925q = i10;
    }

    public final boolean d(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        d dVar = this.f69924o;
        boolean z10 = (dVar == null || dVar.m() == null || this.f69924o.m().length <= 0 || this.f69924o.d() == null || this.f69924o.d().length <= 0 || TUSDK.isCnSDK()) ? false : true;
        if (!z10) {
            return z10;
        }
        int[] iArrD = this.f69924o.d();
        try {
            int iD = dd.d(str);
            for (int i10 : iArrD) {
                if (iD == i10) {
                    return true;
                }
            }
        } catch (Throwable unused) {
        }
        return false;
    }

    public final dq[] d() {
        d dVar = this.f69924o;
        m[] mVarArrM = dVar != null ? dVar.m() : null;
        if (mVarArrM != null && mVarArrM.length != 0) {
            dq[] dqVarArr = new dq[mVarArrM.length];
            for (int i10 = 0; i10 < mVarArrM.length; i10++) {
                m mVar = mVarArrM[i10];
                if (mVar != null) {
                    dqVarArr[i10] = new com.thinkup.core.common.md.d.dm(mVar.d(), mVar.m(), mVar.n());
                }
            }
            return dqVarArr;
        }
        return m();
    }

    private void d(int i10) {
        this.f69923n = i10;
    }

    private void d(d dVar) {
        this.f69924o = dVar;
    }

    private void d(long j10) {
        this.f69919d0 = j10;
    }
}