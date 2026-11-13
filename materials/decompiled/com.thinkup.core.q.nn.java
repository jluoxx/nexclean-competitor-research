package com.thinkup.core.q;

import android.text.TextUtils;
import com.android.launcher3.testing.shared.TestProtocol;
import com.mbridge.msdk.playercommon.exoplayer2.trackselection.AdaptiveTrackSelection;
import com.thinkup.core.api.TUAdConst;
import com.thinkup.core.api.TUAdRequest;
import com.thinkup.core.api.TUCustomAdapterConfig;
import com.thinkup.core.common.dm.Cdo;
import com.thinkup.core.common.dm.d0q;
import com.thinkup.core.common.dm.m0q;
import com.thinkup.core.common.dm.od;
import com.tradplus.ads.base.util.PrivacyDataInfo;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes7.dex */
public final class nn {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final String[] f74113d = {"unit_id", "unitid", "slot_id", "placement_id", "zone_id", "ad_place_id", "position_id", "pos_id", "placement_name", "spot_id", "ad_tag", "ad_id", "plid", "space_id", PrivacyDataInfo.LOCATION, "tagid", "adslot_id", TUAdConst.NETWORK_REQUEST_PARAMS_KEY.INSTANCE_ID, TestProtocol.REQUEST_PID};

    private static m0q d(int i10, int i11, JSONObject jSONObject, m0 m0Var) {
        long j10;
        int i12;
        od odVarD;
        TUCustomAdapterConfig tUCustomAdapterConfigM;
        JSONObject jSONObjectOptJSONObject;
        JSONArray jSONArrayOptJSONArray;
        int i13 = (i11 == 0 || i11 == 4 || i11 == 8) ? 0 : 1;
        m0q m0qVar = new m0q(i10);
        m0qVar.dn(i11);
        m0qVar.dm(i13);
        if (jSONObject.isNull(com.thinkup.core.common.dq.f68832qd)) {
            m0qVar.n("");
        } else {
            m0qVar.n(jSONObject.optString(com.thinkup.core.common.dq.f68832qd));
        }
        if (jSONObject.isNull(com.thinkup.core.common.dq.f68828oo)) {
            m0qVar.d0(-1);
        } else {
            m0qVar.d0(jSONObject.optInt(com.thinkup.core.common.dq.f68828oo));
        }
        if (jSONObject.isNull(com.thinkup.core.common.dq.f68829oq)) {
            m0qVar.dd(-1);
        } else {
            m0qVar.dd(jSONObject.optInt(com.thinkup.core.common.dq.f68829oq));
        }
        if (jSONObject.isNull("nw_firm_id")) {
            m0qVar.q(-1);
        } else {
            m0qVar.q(jSONObject.optInt("nw_firm_id"));
        }
        if (jSONObject.isNull("content")) {
            m0qVar.m("");
            m0qVar.d(new HashMap());
        } else {
            String strOptString = jSONObject.optString("content");
            Map<String, Object> mapN = com.thinkup.core.common.nn.mo.n(strOptString);
            if (m0qVar.mm() == 22 && com.thinkup.core.common.nn.mo.d(mapN, "unit_type", 0) == 1) {
                mapN.put("render_type", 1);
            }
            m0qVar.m(strOptString);
            m0qVar.d(mapN);
            m0qVar.dq(d(m0Var.dn(), m0qVar));
        }
        if (jSONObject.isNull(com.thinkup.core.common.dq.f68827on)) {
            m0qVar.d("");
        } else {
            m0qVar.d(jSONObject.optString(com.thinkup.core.common.dq.f68827on));
        }
        if (jSONObject.isNull(com.thinkup.core.common.dq.f68833qm)) {
            m0qVar.q(com.thinkup.core.common.nn.m0.f72152o);
        } else {
            m0qVar.q(jSONObject.optString(com.thinkup.core.common.dq.f68833qm));
        }
        if (jSONObject.isNull(com.thinkup.core.common.dq.f68825od)) {
            m0qVar.dd(0L);
        } else {
            m0qVar.dd(jSONObject.optInt(com.thinkup.core.common.dq.f68825od));
        }
        if (jSONObject.isNull(com.thinkup.core.common.dq.f68822nq)) {
            m0qVar.dm(0L);
        } else {
            m0qVar.dm(jSONObject.optInt(com.thinkup.core.common.dq.f68822nq));
        }
        if (jSONObject.isNull(com.thinkup.core.common.dq.f68824o0)) {
            m0qVar.m0(1);
        } else {
            m0qVar.m0(jSONObject.optInt(com.thinkup.core.common.dq.f68824o0));
        }
        if (jSONObject.isNull(com.thinkup.core.common.dq.f68834qn)) {
            m0qVar.dn(-1L);
        } else {
            m0qVar.dn(jSONObject.optLong(com.thinkup.core.common.dq.f68834qn));
        }
        if (jSONObject.isNull("unit_id")) {
            m0qVar.d0("");
        } else {
            m0qVar.d0(jSONObject.optString("unit_id"));
        }
        if (jSONObject.isNull("ecpm")) {
            m0qVar.m(0.0d);
        } else {
            m0qVar.m(jSONObject.optDouble("ecpm", 0.0d));
        }
        if (jSONObject.isNull(com.thinkup.core.common.dq.d00)) {
            m0qVar.m229do(AdaptiveTrackSelection.DEFAULT_MIN_TIME_BETWEEN_BUFFER_REEVALUTATION_MS);
        } else {
            m0qVar.m229do(jSONObject.optInt(com.thinkup.core.common.dq.d00));
        }
        if (jSONObject.isNull(com.thinkup.core.common.dq.d0m)) {
            m0qVar.dd("");
        } else {
            m0qVar.dd(jSONObject.optString(com.thinkup.core.common.dq.d0m));
        }
        if (jSONObject.isNull(com.thinkup.core.common.dq.d0n)) {
            m0qVar.md(0);
        } else {
            m0qVar.md(jSONObject.optInt(com.thinkup.core.common.dq.d0n));
        }
        if (jSONObject.isNull(com.thinkup.core.common.dq.d0o)) {
            m0qVar.mm(3000);
        } else {
            m0qVar.mm(jSONObject.optInt(com.thinkup.core.common.dq.d0o));
        }
        if (jSONObject.isNull("payload")) {
            m0qVar.dm("");
        } else {
            m0qVar.dm(jSONObject.optString("payload"));
        }
        if (jSONObject.isNull("error")) {
            m0qVar.dn("");
        } else {
            m0qVar.dn(jSONObject.optString("error"));
        }
        if (jSONObject.isNull(com.thinkup.core.common.dq.d0q)) {
            m0qVar.dq(com.thinkup.core.common.dd.n.f67831d);
        } else {
            m0qVar.dq(jSONObject.optLong(com.thinkup.core.common.dq.d0q));
        }
        if (jSONObject.isNull(com.thinkup.core.common.dq.dd0)) {
            m0qVar.m0(-1L);
        } else {
            m0qVar.m0(jSONObject.optLong(com.thinkup.core.common.dq.dd0));
        }
        if (jSONObject.isNull(com.thinkup.core.common.dq.ddd)) {
            m0qVar.d0(com.thinkup.core.common.dd.n.f67831d);
        } else {
            m0qVar.d0(jSONObject.optLong(com.thinkup.core.common.dq.ddd));
        }
        if (jSONObject.isNull(com.thinkup.core.common.dq.dq0)) {
            m0qVar.dq(i13 ^ 1);
        } else {
            m0qVar.dq(jSONObject.optInt(com.thinkup.core.common.dq.dq0));
        }
        if (jSONObject.isNull(com.thinkup.core.common.dq.ddm)) {
            m0qVar.mn(1);
        } else {
            m0qVar.mn(jSONObject.optInt(com.thinkup.core.common.dq.ddm));
        }
        if (jSONObject.isNull(com.thinkup.core.common.dq.ddn)) {
            m0qVar.mo(1);
        } else {
            m0qVar.mo(jSONObject.optInt(com.thinkup.core.common.dq.ddn));
        }
        if (jSONObject.isNull(com.thinkup.core.common.dq.ddo)) {
            m0qVar.mq(-1);
        } else {
            m0qVar.mq(jSONObject.optInt(com.thinkup.core.common.dq.ddo));
        }
        if (jSONObject.isNull(com.thinkup.core.common.dq.ddq)) {
            m0qVar.m230do("publisher_defined");
        } else {
            m0qVar.m230do(jSONObject.optString(com.thinkup.core.common.dq.ddq));
        }
        if (jSONObject.isNull(com.thinkup.core.common.dq.dm0)) {
            j10 = 0;
            m0qVar.md(0L);
        } else {
            j10 = 0;
            m0qVar.md(jSONObject.optLong(com.thinkup.core.common.dq.dm0));
        }
        if (jSONObject.isNull(com.thinkup.core.common.dq.dmd)) {
            m0qVar.mm(j10);
        } else {
            m0qVar.mm(jSONObject.optLong(com.thinkup.core.common.dq.dmd));
        }
        if (jSONObject.isNull(com.thinkup.core.common.dq.dmm)) {
            m0qVar.n(0.0d);
        } else {
            m0qVar.n(jSONObject.optDouble(com.thinkup.core.common.dq.dmm, 0.0d));
        }
        if (jSONObject.isNull(com.thinkup.core.common.dq.dmn)) {
            m0qVar.n0(1);
        } else {
            m0qVar.n0(jSONObject.optInt(com.thinkup.core.common.dq.dmn));
        }
        if (jSONObject.isNull(com.thinkup.core.common.dq.dmo)) {
            m0qVar.nd(1);
        } else {
            m0qVar.nd(jSONObject.optInt(com.thinkup.core.common.dq.dmo));
        }
        if (jSONObject.isNull(com.thinkup.core.common.dq.dmq)) {
            m0qVar.nm(2);
        } else {
            m0qVar.nm(jSONObject.optInt(com.thinkup.core.common.dq.dmq));
        }
        if (jSONObject.isNull(com.thinkup.core.common.dq.dn0)) {
            m0qVar.m228do(1);
        } else {
            m0qVar.m228do(jSONObject.optInt(com.thinkup.core.common.dq.dn0));
        }
        if (jSONObject.isNull("s2s_sw")) {
            m0qVar.nn(2);
        } else {
            m0qVar.nn(jSONObject.optInt("s2s_sw"));
        }
        if (jSONObject.isNull(com.thinkup.core.common.dq.dnd)) {
            m0qVar.nq(2);
        } else {
            m0qVar.nq(jSONObject.optInt(com.thinkup.core.common.dq.dnd));
        }
        if (jSONObject.isNull(com.thinkup.core.common.dq.dnm)) {
            m0qVar.no(0);
        } else {
            m0qVar.no(jSONObject.optInt(com.thinkup.core.common.dq.dnm));
        }
        if (jSONObject.isNull(com.thinkup.core.common.dq.dno)) {
            m0qVar.o0(1);
        } else {
            m0qVar.o0(jSONObject.optInt(com.thinkup.core.common.dq.dno));
        }
        if (jSONObject.isNull(com.thinkup.core.common.dq.dod)) {
            m0qVar.m0("");
        } else {
            m0qVar.m0(jSONObject.optString(com.thinkup.core.common.dq.dod));
        }
        if (jSONObject.isNull(com.thinkup.core.common.dq.dnq)) {
            m0qVar.od(2);
        } else {
            m0qVar.od(jSONObject.optInt(com.thinkup.core.common.dq.dnq));
        }
        if (jSONObject.isNull("ad_type")) {
            i12 = -1;
            m0qVar.om(-1);
        } else {
            i12 = -1;
            m0qVar.om(jSONObject.optInt("ad_type", -1));
        }
        if (jSONObject.isNull(com.thinkup.core.common.dq.dom)) {
            m0qVar.on(i12);
        } else {
            m0qVar.on(jSONObject.optInt(com.thinkup.core.common.dq.dom, i12));
        }
        if (m0qVar.od() == 2 && m0qVar.mm() == 22) {
            m0qVar.d(TUAdConst.CURRENCY.RMB_CENT);
        } else {
            m0qVar.d(TUAdConst.CURRENCY.USD);
        }
        if (jSONObject.isNull(com.thinkup.core.common.dq.don)) {
            m0qVar.qo(0);
        } else {
            m0qVar.qo(jSONObject.optInt(com.thinkup.core.common.dq.don, 0));
        }
        if (jSONObject.isNull("bid_floor")) {
            m0qVar.o(0.0d);
        } else {
            m0qVar.o(jSONObject.optDouble("bid_floor", 0.0d));
        }
        if (jSONObject.isNull(com.thinkup.core.common.dq.dqm)) {
            m0qVar.qq(-1);
        } else {
            m0qVar.qq(jSONObject.optInt(com.thinkup.core.common.dq.dqm, -1));
        }
        if (jSONObject.isNull(com.thinkup.core.common.dq.dqn)) {
            m0qVar.q(m0qVar.d0d());
        } else {
            m0qVar.q(jSONObject.optDouble(com.thinkup.core.common.dq.dqn, m0qVar.d0d()));
        }
        if (jSONObject.isNull(com.thinkup.core.common.dq.dqo)) {
            m0qVar.mm(com.thinkup.core.common.o.dn.dq.f72683m);
        } else {
            m0qVar.mm(jSONObject.optString(com.thinkup.core.common.dq.dqo, com.thinkup.core.common.o.dn.dq.f72683m));
        }
        if (jSONObject.isNull(com.thinkup.core.common.dq.dqq)) {
            m0qVar.d00(2);
        } else {
            m0qVar.d00(jSONObject.optInt(com.thinkup.core.common.dq.dqq, 2));
        }
        if (jSONObject.isNull(com.thinkup.core.common.dq.m00)) {
            m0qVar.d0n(1);
        } else {
            m0qVar.d0n(jSONObject.optInt(com.thinkup.core.common.dq.m00));
        }
        if (jSONObject.isNull(com.thinkup.core.common.dq.m0d)) {
            m0qVar.d0o(2);
        } else {
            m0qVar.d0o(jSONObject.optInt(com.thinkup.core.common.dq.m0d, 2));
        }
        if (jSONObject.has(com.thinkup.core.common.dq.m0m)) {
            m0qVar.mn(jSONObject.optString(com.thinkup.core.common.dq.m0m));
        } else {
            m0qVar.mn("TopOn");
        }
        m0qVar.mo(jSONObject.optLong(com.thinkup.core.common.dq.m0n, 15000L));
        int[] iArr = null;
        if (!jSONObject.isNull(m0.d.dqo) && (jSONArrayOptJSONArray = jSONObject.optJSONArray(m0.d.dqo)) != null && jSONArrayOptJSONArray.length() > 0) {
            try {
                iArr = new int[jSONArrayOptJSONArray.length()];
                for (int i14 = 0; i14 < jSONArrayOptJSONArray.length(); i14++) {
                    iArr[i14] = jSONArrayOptJSONArray.getInt(i14);
                }
            } catch (Exception unused) {
            }
        }
        m0qVar.d(iArr);
        m0qVar.d0q(jSONObject.optInt(com.thinkup.core.common.dq.m0o, 1));
        m0qVar.dd0(jSONObject.optInt(com.thinkup.core.common.dq.m0q, 1));
        if (!jSONObject.isNull(com.thinkup.core.common.dq.md0)) {
            m0qVar.d(jSONObject.optJSONArray(com.thinkup.core.common.dq.md0));
        }
        if (!jSONObject.isNull(com.thinkup.core.common.dq.mdd)) {
            m0qVar.ddd(jSONObject.optInt(com.thinkup.core.common.dq.mdd));
        }
        if (!jSONObject.isNull("ad_s_reqf_mode")) {
            m0qVar.ddm(jSONObject.optInt("ad_s_reqf_mode"));
        }
        m0qVar.ddo(jSONObject.optInt("unit_type", 0));
        m0qVar.ddq(jSONObject.optInt(com.thinkup.core.common.dq.mdo, 0));
        m0qVar.ddn(jSONObject.optInt("network_id"));
        m0qVar.dm0(jSONObject.optInt(com.thinkup.core.common.dq.mm0, 2));
        m0qVar.dm(jSONObject.optDouble(com.thinkup.core.common.dq.mno, 0.0d));
        m0qVar.dd(jSONObject.optDouble(com.thinkup.core.common.dq.mnq, 0.0d));
        m0qVar.d(jSONObject.optJSONObject(com.thinkup.core.common.dq.mo0));
        m0qVar.dmd(jSONObject.optInt(com.thinkup.core.common.dq.mod));
        m0qVar.dmm(jSONObject.optInt(com.thinkup.core.common.dq.mom, 1));
        d0q d0qVarN0d = m0Var.n0d();
        if (d0qVarN0d != null) {
            d0q d0qVar = new d0q();
            d0qVar.m(d0qVarN0d.q());
            d0qVar.d(d0qVarN0d.o());
            d0qVar.d(d0qVarN0d.d());
            String strOptString2 = jSONObject.optString(com.thinkup.core.common.dq.mon);
            if (!TextUtils.isEmpty(strOptString2)) {
                d0qVar.m(strOptString2);
            }
            String strOptString3 = jSONObject.optString(com.thinkup.core.common.dq.moo);
            if (!TextUtils.isEmpty(strOptString3)) {
                d0qVar.o(strOptString3);
            }
            m0qVar.d(d0qVar);
        }
        m0qVar.d(jSONObject.optDouble(com.thinkup.core.common.dq.moq, 0.0d));
        m0qVar.dmn(jSONObject.optInt(com.thinkup.core.common.dq.mq0, 2));
        m0qVar.dmo(jSONObject.optInt(com.thinkup.core.common.dq.mqd, 1));
        m0qVar.mq(jSONObject.optLong(com.thinkup.core.common.dq.mqm, 500L));
        String strOptString4 = jSONObject.optString(com.thinkup.core.common.dq.mqn);
        if (TextUtils.isEmpty(strOptString4)) {
            odVarD = m0qVar.mm() == 2 ? od.d() : null;
        } else {
            try {
                odVarD = od.d(strOptString4);
            } catch (Throwable unused2) {
            }
        }
        m0qVar.d(odVarD);
        m0qVar.dmq(jSONObject.optInt(com.thinkup.core.common.dq.mqo, 0));
        m0qVar.n0(jSONObject.optLong(com.thinkup.core.common.dq.mqq, 0L));
        m0qVar.dn0(m0Var.dqm());
        JSONObject jSONObjectNnq = m0Var.nnq();
        if (jSONObjectNnq != null && (jSONObjectOptJSONObject = jSONObjectNnq.optJSONObject(String.valueOf(m0qVar.mm()))) != null) {
            m0qVar.dnd(jSONObjectOptJSONObject.optInt(com.thinkup.core.common.dq.n00, 2));
            m0qVar.mo(jSONObjectOptJSONObject.optString(com.thinkup.core.common.dq.n0d, ""));
            m0qVar.d0(jSONObjectOptJSONObject.optJSONArray(com.thinkup.core.common.dq.n0m));
            m0qVar.m(jSONObjectOptJSONObject.optJSONArray(com.thinkup.core.common.dq.n0n));
            m0qVar.n(jSONObjectOptJSONObject.optJSONArray(com.thinkup.core.common.dq.n0o));
            m0qVar.dnm(jSONObjectOptJSONObject.optInt(com.thinkup.core.common.dq.nmo, 2));
            m0qVar.o(jSONObjectOptJSONObject.optJSONArray(com.thinkup.core.common.dq.nmq));
            m0qVar.q(jSONObjectOptJSONObject.optJSONArray(com.thinkup.core.common.dq.nn0));
        }
        m0qVar.dnn(jSONObject.optInt(com.thinkup.core.common.dq.n0q));
        m0qVar.nd(jSONObject.optLong(com.thinkup.core.common.dq.nd0));
        m0qVar.nm(jSONObject.optLong(com.thinkup.core.common.dq.ndd));
        m0qVar.dn(jSONObject.optDouble(com.thinkup.core.common.dq.ndm, 0.0d));
        m0qVar.oo(jSONObject.optInt(com.thinkup.core.common.dq.ndn, 2));
        m0qVar.oq(jSONObject.optInt(com.thinkup.core.common.dq.ndo, 2));
        m0qVar.q0(jSONObject.optInt(com.thinkup.core.common.dq.ndq, 0));
        JSONObject jSONObjectNoo = m0Var.noo();
        if (jSONObjectNoo != null) {
            m0qVar.md(jSONObjectNoo.optString(com.thinkup.core.common.dq.nm0, ""));
        }
        m0qVar.qd(jSONObject.optInt(com.thinkup.core.common.dq.nmd, 2));
        m0qVar.dno(jSONObject.optInt(com.thinkup.core.common.dq.nmm, 1));
        m0qVar.qm(jSONObject.optInt(com.thinkup.core.common.dq.nmn, 2));
        TUAdRequest tUAdRequest = m0Var.f73934dn;
        if (tUAdRequest != null) {
            m0qVar.d(tUAdRequest);
        }
        m0qVar.d(Cdo.d(jSONObject.optJSONObject(com.thinkup.core.common.dq.nnd)));
        m0qVar.n(jSONObject.optInt(com.thinkup.core.common.dq.nnm, 2));
        m0qVar.m(jSONObject.optInt(com.thinkup.core.common.dq.nnn, 2));
        m0qVar.o(jSONObject.optLong(com.thinkup.core.common.dq.nno, 0L));
        m0qVar.o(jSONObject.optInt(com.thinkup.core.common.dq.nnq, 2));
        m0qVar.d(jSONObject.optInt(com.thinkup.core.common.dq.no0, 0));
        m0qVar.do0(jSONObject.optInt(com.thinkup.core.common.dq.nod, 1));
        m0qVar.dod(jSONObject.optInt(com.thinkup.core.common.dq.nom, 2));
        m0qVar.no(jSONObject.optLong(com.thinkup.core.common.dq.non, 500L));
        m0qVar.dom(jSONObject.optInt(com.thinkup.core.common.dq.noo, 2));
        if (m0qVar.mm() >= 100000 && (tUCustomAdapterConfigM = com.thinkup.core.common.o.nd.m().m(m0qVar.nm())) != null) {
            m0qVar.m228do(tUCustomAdapterConfigM.isRealTimeBidSwitch() ? 2 : 1);
            m0qVar.dd(tUCustomAdapterConfigM.getAdCacheTime());
            if (tUCustomAdapterConfigM.getLossNoticePostion() > 0) {
                m0qVar.qq(tUCustomAdapterConfigM.getLossNoticePostion());
            }
        }
        return m0qVar;
    }

    public static List<m0q> m(m0 m0Var) {
        List<m0q> listD = d(m0Var, m0Var.m0q(), 0, 1);
        listD.addAll(d(m0Var, m0Var.md0(), 4, 6));
        Collections.sort(listD);
        return listD;
    }

    public static List<m0q> n(m0 m0Var) {
        return d(m0Var, m0Var.d0d(), 8, 10);
    }

    public static List<m0q> o(m0 m0Var) {
        return d(m0Var, m0Var.nmo(), 2, 12);
    }

    public static List<m0q> q(m0 m0Var) {
        return d(m0Var, m0Var.nmq(), 1, 13);
    }

    public static void d(m0 m0Var, Map<String, m0q> map, List<m0q> list) {
        d(m0Var, map, list, m0Var.m0q(), 0, 1);
        d(m0Var, map, list, m0Var.md0(), 0, 6);
        d(m0Var, map, list, m0Var.mdd(), 1, 3);
        d(m0Var, map, list, m0Var.dmo(), 3, 4);
        d(m0Var, map, list, m0Var.mdm(), 2, 2);
        d(m0Var, map, list, m0Var.dd0(), 6, 11);
        d(m0Var, map, list, m0Var.mmm(), 7, 8);
        d(m0Var, map, list, m0Var.mmn(), 3, 5);
        d(m0Var, map, list, m0Var.d0d(), 8, 10);
        d(m0Var, map, list, m0Var.nmo(), 2, 12);
        d(m0Var, map, list, m0Var.nmq(), 1, 13);
    }

    private static void d(m0 m0Var, Map<String, m0q> map, List<m0q> list, JSONArray jSONArray, int i10, int i11) {
        try {
            com.thinkup.core.common.dm.mn mnVarMqn = m0Var.mqn();
            for (int i12 = 0; i12 < jSONArray.length(); i12++) {
                JSONObject jSONObjectOptJSONObject = jSONArray.optJSONObject(i12);
                if (jSONObjectOptJSONObject != null) {
                    m0q m0qVarD = d(i11, i10, jSONObjectOptJSONObject, m0Var);
                    map.put(m0qVarD.qn(), m0qVarD);
                    if (m0qVarD.mm() == 35) {
                        list.add(m0qVarD);
                    }
                    d(m0Var, m0qVarD);
                    if (mnVarMqn != null && m0qVarD.mm() == 2) {
                        if (i10 == 0) {
                            mnVarMqn.f68427d = true;
                        }
                        if (i10 == 1) {
                            mnVarMqn.f68428m = true;
                        }
                    }
                    if (m0Var.ndq() == null && m0qVarD.nq() && m0qVarD.mqn() == 1) {
                        m0Var.d(Boolean.TRUE);
                    }
                }
            }
        } catch (Throwable unused) {
        }
    }

    private static void d(m0 m0Var, m0q m0qVar) {
        if (m0qVar.md0() > 0.0d || m0Var == null) {
            return;
        }
        double dMn0 = m0Var.mn0();
        if (dMn0 > 0.0d) {
            m0qVar.o(dMn0);
        }
    }

    public static List<m0q> d(m0 m0Var) {
        List<m0q> listD = d(m0Var, m0Var.mdd(), 1, 3);
        List<m0q> listD2 = d(m0Var, m0Var.dmo(), 3, 4);
        List<m0q> listD3 = d(m0Var, m0Var.mdm(), 2, 2);
        List<m0q> listD4 = d(m0Var, m0Var.dd0(), 6, 11);
        List<m0q> listD5 = d(m0Var, m0Var.mmm(), 7, 8);
        List<m0q> listD6 = d(m0Var, m0Var.mmn(), 3, 5);
        listD.addAll(listD2);
        listD.addAll(listD3);
        listD.addAll(listD4);
        listD.addAll(listD5);
        listD.addAll(listD6);
        return listD;
    }

    public static List<m0q> d(m0 m0Var, JSONArray jSONArray) {
        return d(m0Var, jSONArray, 3, 4);
    }

    private static List<m0q> d(m0 m0Var, JSONArray jSONArray, int i10, int i11) {
        ArrayList arrayList = new ArrayList();
        for (int i12 = 0; i12 < jSONArray.length(); i12++) {
            try {
                JSONObject jSONObject = jSONArray.getJSONObject(i12);
                if (jSONObject != null) {
                    m0q m0qVarD = d(i11, i10, jSONObject, m0Var);
                    d(m0Var, m0qVarD);
                    arrayList.add(m0qVarD);
                }
            } catch (Exception unused) {
            }
        }
        return arrayList;
    }

    private static String d(String str, m0q m0qVar) {
        try {
            int iOd = m0qVar.od();
            if (iOd != 3 && iOd != 7 && m0qVar.mm() != 35) {
                Map<String, Object> mapNd = m0qVar.nd();
                for (String str2 : f74113d) {
                    String strD = com.thinkup.core.common.nn.mo.d(mapNd, str2, "");
                    if (!TextUtils.isEmpty(strD)) {
                        return strD;
                    }
                }
                return "";
            }
            return str;
        } catch (Throwable unused) {
        }
    }

    private static void d(Map<String, Object> map, int i10) {
        if (map != null && i10 == 22 && com.thinkup.core.common.nn.mo.d(map, "unit_type", 0) == 1) {
            map.put("render_type", 1);
        }
    }
}