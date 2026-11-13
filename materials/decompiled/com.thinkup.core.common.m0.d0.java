package com.thinkup.core.common.m0;

import android.content.Context;
import android.location.Location;
import android.text.TextUtils;
import com.thinkup.core.api.TUCustomRuleKeys;
import com.thinkup.core.api.TUSDK;
import com.thinkup.core.api.TUUserDeviceInfo;
import com.thinkup.core.common.dm.mdm;
import com.varbto.utils.api.MediationUtilsManager;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes7.dex */
public final class d0 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final String f69754d = "platform";

    /* JADX INFO: renamed from: d0, reason: collision with root package name */
    public static final String f69755d0 = "app_vc";
    public static final String d00 = "abtest_id";
    public static final String d0d = "first_init_time";
    public static final String d0m = "days_from_first_init";
    public static final String d0n = "cs_cl";
    public static final String d0o = "is_ofm";
    public static final String d0q = "app_id";

    /* JADX INFO: renamed from: dd, reason: collision with root package name */
    public static final String f69756dd = "brand";
    public static final String dd0 = "api_ver";
    public static final String ddd = "custom";
    public static final String ddm = "data";
    public static final String ddn = "tcp_tk_da_type";
    public static final String ddo = "ofl";
    public static final String ddq = "tcp_rate";

    /* JADX INFO: renamed from: dm, reason: collision with root package name */
    public static final String f69757dm = "model";
    public static final String dm0 = "sample_rate";
    public static final String dmd = "p";
    public static final String dmm = "p2";
    public static final String dmn = "sign";
    public static final String dmo = "common";
    public static final int dmq = 1;

    /* JADX INFO: renamed from: dn, reason: collision with root package name */
    public static final String f69758dn = "screen";
    public static final int dn0 = 2;
    public static final int dnd = 3;
    public static final String dnm = "area_type";
    public static final String dnn = "sp_http";
    public static final String dno = "os_fw";
    public static final String dnq = "is_test";

    /* JADX INFO: renamed from: do, reason: not valid java name */
    public static final String f142do = "network_type";
    public static final String do0 = "user_num";
    public static final String dod = "cp_device_id";
    public static final String dom = "cp_pl_id";
    public static int don = -1;
    public static int doo = -1;
    public static final String doq = "al_it_apil";

    /* JADX INFO: renamed from: dq, reason: collision with root package name */
    public static final String f69759dq = "mnc";
    public static final String dq0 = "wx_data";
    public static final String dqd = "cached";
    public static final String dqm = "cached";
    public static final String dqn = "n_cache";
    public static final String dqo = "get_1st_rl";
    public static final String dqq = "value_d";

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final String f69760m = "os_vn";

    /* JADX INFO: renamed from: m0, reason: collision with root package name */
    public static final String f69761m0 = "mcc";
    public static final String m00 = "pl_type";
    public static final String m0d = "amazon_id";
    public static final String m0m = "amazon_lat";
    public static final String m0n = "t_mem";
    public static final String m0o = "c_num";
    public static final String m0q = "t_store";

    /* JADX INFO: renamed from: md, reason: collision with root package name */
    public static final String f69762md = "language";
    public static final String md0 = "s_c";
    public static final String mdd = "u_a";
    public static final String mdm = "b_p";
    public static final String mdn = "d_s";
    public static final String mdo = "s_d";
    public static final String mdq = "a_cl";

    /* JADX INFO: renamed from: mm, reason: collision with root package name */
    public static final String f69763mm = "timezone";
    public static final String mm0 = "http_type";
    public static final String mmd = "ip_v4";
    public static final String mmm = "ip_v6";
    public static final String mmn = "test_mode";
    public static final String mmo = "cpu";
    public static final String mmq = "isroot";

    /* JADX INFO: renamed from: mn, reason: collision with root package name */
    public static final String f69764mn = "sdk_ver";
    public static final String mn0 = "isagent";
    public static final String mnd = "is_sim";
    public static final String mnm = "is_mul";
    public static final String mnn = "is_vpn";
    public static final String mno = "is_charge";
    public static final String mnq = "battery";

    /* JADX INFO: renamed from: mo, reason: collision with root package name */
    public static final String f69765mo = "gp_ver";
    public static final String mo0 = "http_able";
    public static final String mod = "bld_type";
    public static final String mom = "bld_tags";
    public static final String mon = "bld_user";
    public static final String moo = "bld_radio";
    public static final String moq = "bld_bootloader";

    /* JADX INFO: renamed from: mq, reason: collision with root package name */
    public static final String f69766mq = "nw_ver";
    public static final String mq0 = "bld_hardware";
    public static final String mqd = "bld_host";
    public static final String mqm = "bld_codename";
    public static final String mqn = "bld_incremental";
    public static final String mqo = "bld_serial";
    public static final String mqq = "bld_display";

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final String f69767n = "os_vc";

    /* JADX INFO: renamed from: n0, reason: collision with root package name */
    public static final String f69768n0 = "ua";
    public static final String n00 = "bld_version_codes";
    public static final String n0d = "bld_board";
    public static final String n0m = "ps";
    public static final String n0n = "pm";
    public static final String n0o = "is_s";
    public static final String n0q = "m_data";

    /* JADX INFO: renamed from: nd, reason: collision with root package name */
    public static final String f69769nd = "orient";
    public static final String nd0 = "sdk_ext";
    public static final String ndd = "pil_s_fu";
    public static final String ndm = "al_it_apil_t";
    public static final String ndn = "demand_ids";
    public static final String ndo = "pl_id";
    public static final String ndq = "session_id";

    /* JADX INFO: renamed from: nm, reason: collision with root package name */
    public static final String f69770nm = "system";
    public static final String nm0 = "debug_key";
    public static final String nmd = "wf";
    public static final String nmm = "sdk_time";
    public static final String nmn = "sdk_start_time";
    public static final String nmo = "cpu_d";
    public static final String nmq = "mem_d";

    /* JADX INFO: renamed from: nn, reason: collision with root package name */
    public static final String f69771nn = "oaid";
    public static final String nn0 = "stack_d";
    public static final String nnd = "stack_s";
    public static final String nnm = "cpu_info_s";
    public static final String nnn = "cpu_core_c";
    public static final String nno = "mem_t_s";
    public static final String nnq = "u_t";

    /* JADX INFO: renamed from: no, reason: collision with root package name */
    public static final String f69772no = "android_id";
    public static final String no0 = "channel_from";
    public static final String nod = "is_fdevice";
    public static final String nom = "d_r_ls";
    public static final String non = "sensor_deny";
    public static final String noo = "device_minor_data_deny";
    public static final String noq = "ail_deny";

    /* JADX INFO: renamed from: nq, reason: collision with root package name */
    public static final String f69773nq = "gaid";
    public static final String nq0 = "bil_deny";
    public static final String nqd = "app_info";
    public static final String nqm = "accessibility_status";
    public static final String nqn = "volume_status";
    public static final String nqo = "build_info";
    public static final String nqq = "properties_info";

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final String f69774o = "package_name";

    /* JADX INFO: renamed from: o0, reason: collision with root package name */
    public static final String f69775o0 = "channel";
    public static final String o00 = "sys_ua";
    public static final String o0d = "sp_nw";
    public static final String o0m = "anr_sw";
    public static final String o0n = "new_upid";
    public static final String o0o = "open_ns";
    public static final String o0q = "mb_track_id";

    /* JADX INFO: renamed from: od, reason: collision with root package name */
    public static final String f69776od = "sub_channel";
    public static final String od0 = "req_rsn";
    public static final String odd = "host";
    public static final String odm = "anr_num";
    public static final String odn = "dyn_score";
    public static final String odo = "static_score";
    public static final String odq = "mmed_m_a_c";

    /* JADX INFO: renamed from: om, reason: collision with root package name */
    public static final String f69777om = "upid";
    public static final String om0 = "pg_ctm";

    /* JADX INFO: renamed from: on, reason: collision with root package name */
    public static final String f69778on = "ps_id";

    /* JADX INFO: renamed from: oo, reason: collision with root package name */
    public static final String f69779oo = "it_src";

    /* JADX INFO: renamed from: oq, reason: collision with root package name */
    public static final String f69780oq = "lat";

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final String f69781q = "app_vn";

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public static final String f69782q0 = "lon";

    /* JADX INFO: renamed from: qd, reason: collision with root package name */
    public static final String f69783qd = "inst_wx";

    /* JADX INFO: renamed from: qm, reason: collision with root package name */
    public static final String f69784qm = "mini_sdk";

    /* JADX INFO: renamed from: qn, reason: collision with root package name */
    public static final String f69785qn = "ms_type";

    /* JADX INFO: renamed from: qo, reason: collision with root package name */
    public static final String f69786qo = "device_set";

    /* JADX INFO: renamed from: qq, reason: collision with root package name */
    public static final String f69787qq = "gdpr_cs";

    public static JSONObject d(int i10, List<String> list) {
        JSONArray[] jSONArrayArrM;
        Map<String, String> mapN;
        JSONObject jSONObjectMoq;
        com.thinkup.core.common.nn.m0.mo(com.thinkup.core.common.o.nd.m().dd());
        JSONObject jSONObject = new JSONObject();
        Context contextDd = com.thinkup.core.common.o.nd.m().dd();
        try {
            jSONObject.put("cpu", com.thinkup.core.common.nn.m0.mq());
            jSONObject.put("platform", 1);
            jSONObject.put("os_vn", com.thinkup.core.common.nn.m0.q());
            jSONObject.put("os_vc", com.thinkup.core.common.nn.m0.o());
            jSONObject.put("package_name", com.thinkup.core.common.nn.m0.m294do(contextDd));
            jSONObject.put("app_vn", com.thinkup.core.common.nn.m0.dm(contextDd));
            jSONObject.put("app_vc", com.thinkup.core.common.nn.m0.dd(contextDd));
            jSONObject.put("brand", com.thinkup.core.common.nn.m0.m());
            jSONObject.put("model", com.thinkup.core.common.nn.m0.d());
            jSONObject.put("screen", com.thinkup.core.common.nn.m0.dn(contextDd));
            jSONObject.put("network_type", com.thinkup.core.common.nn.m0.m0(contextDd));
            jSONObject.put("mnc", com.thinkup.core.common.nn.m0.n(contextDd));
            jSONObject.put("mcc", com.thinkup.core.common.nn.m0.m(contextDd));
            jSONObject.put("language", com.thinkup.core.common.nn.m0.q(contextDd));
            jSONObject.put("timezone", com.thinkup.core.common.nn.m0.n());
            jSONObject.put("sdk_ver", com.thinkup.core.common.nn.mn.d());
            jSONObject.put("gp_ver", com.thinkup.core.common.nn.m0.md(contextDd));
            jSONObject.put("ua", com.thinkup.core.common.nn.m0.dm());
            jSONObject.put("orient", com.thinkup.core.common.nn.m0.d0(contextDd));
            jSONObject.put("system", 1);
            if (!TextUtils.isEmpty(com.thinkup.core.common.o.nd.m().mm())) {
                jSONObject.put("channel", com.thinkup.core.common.o.nd.m().mm());
            }
            if (!TextUtils.isEmpty(com.thinkup.core.common.o.nd.m().mn())) {
                jSONObject.put("sub_channel", com.thinkup.core.common.o.nd.m().mn());
            }
            String strQd = "";
            jSONObject.put("upid", com.thinkup.core.common.o.nn.d(contextDd).m() ? com.thinkup.core.common.o.nd.m().oo() : "");
            jSONObject.put("ps_id", com.thinkup.core.common.o.nd.m().n0());
            com.thinkup.core.q.m mVarM = com.thinkup.core.q.o.d(contextDd).m(com.thinkup.core.common.o.nd.m().mo());
            if (mVarM != null) {
                if (!TextUtils.isEmpty(mVarM.qd())) {
                    strQd = mVarM.qd();
                }
                jSONObject.put(d00, strQd);
            }
            jSONObject.put(d0d, com.thinkup.core.common.o.nd.m().dm());
            jSONObject.put(d0m, com.thinkup.core.common.o.nd.m().dn());
            StringBuilder sb2 = new StringBuilder();
            sb2.append(com.thinkup.core.common.o.nd.m().q());
            sb2.append(com.thinkup.core.common.o.nn.d(contextDd).d());
            jSONObject.put(f69787qq, sb2.toString());
            jSONObject.put(d0n, "300000001");
            if (com.thinkup.core.common.o.nd.m().m302do() == 1) {
                jSONObject.put(d0o, 1);
            }
            jSONObject.put(o0d, 1);
            jSONObject.put(dnn, com.thinkup.core.common.o.nd.m().d00() ? com.thinkup.core.common.o.nd.m().d0d() ? "1" : "3" : com.thinkup.core.common.o.nd.m().d0d() ? "2" : "4");
            com.thinkup.core.common.o.n0 n0VarN = com.thinkup.core.common.o.nd.m().n();
            if (n0VarN != null) {
                n0VarN.fillRequestDeviceData(jSONObject, i10);
            }
            String strDq = com.thinkup.core.common.nn.m0.dq();
            if (!TextUtils.isEmpty(strDq)) {
                jSONObject.put(dno, Integer.parseInt(strDq));
            }
            if ((i10 & 4) == 4) {
                try {
                    com.thinkup.core.q.m mVarM2 = com.thinkup.core.q.o.d(com.thinkup.core.common.o.nd.m().dd()).m(com.thinkup.core.common.o.nd.m().mo());
                    if (mVarM2 != null && (jSONObjectMoq = mVarM2.moq()) != null) {
                        jSONObject.put("a_c", jSONObjectMoq);
                    }
                } catch (Exception unused) {
                }
            }
            if ((i10 & 16) == 16 && (mapN = com.thinkup.core.common.n.m.d().n()) != null && !mapN.isEmpty()) {
                for (Map.Entry<String, String> entry : mapN.entrySet()) {
                    String key = entry.getKey();
                    String value = entry.getValue();
                    if (!TextUtils.isEmpty(key) && !TextUtils.isEmpty(value)) {
                        jSONObject.put(key, value);
                    }
                }
            }
            if ((i10 & 64) == 64) {
                jSONObject.put("isroot", com.thinkup.core.common.nn.m0.n0());
                jSONObject.put("isagent", com.thinkup.core.common.nn.m0.nm(contextDd));
                jSONObject.put(mnd, com.thinkup.core.common.nn.m0.no(contextDd));
                jSONObject.put(mnm, com.thinkup.core.common.nn.m0.nq(contextDd));
                jSONObject.put(mnn, com.thinkup.core.common.nn.m0.nn(contextDd));
                jSONObject.put(mno, com.thinkup.core.common.nn.m0.o0(contextDd));
                jSONObject.put("battery", com.thinkup.core.common.nn.m0.od(contextDd));
                jSONObject.put(mo0, com.thinkup.core.common.nn.m0.nd());
            }
            if ((i10 & 128) == 128 && (jSONArrayArrM = com.thinkup.core.common.n.m.d().m()) != null && jSONArrayArrM.length == 2) {
                JSONArray jSONArray = jSONArrayArrM[0];
                if (jSONArray != null && jSONArray.length() > 0) {
                    jSONObject.put(doq, jSONArray);
                }
                JSONArray jSONArray2 = jSONArrayArrM[1];
                if (jSONArray2 != null && jSONArray2.length() > 0) {
                    jSONObject.put(ndm, jSONArray2);
                }
            }
            jSONObject.put(n0m, com.thinkup.core.common.nn.mm.m(com.thinkup.core.common.nn.m0.m(contextDd, n0m)));
            jSONObject.put(n0n, com.thinkup.core.common.nn.mm.m(com.thinkup.core.common.nn.m0.n(contextDd, n0n)));
            if (mVarM != null && list != null && list.contains("http_type") && mVarM.mdo() == 2) {
                jSONObject.put("http_type", 1);
            }
            if (TUSDK.isCnSDK()) {
                jSONObject.put("app_id", com.thinkup.core.common.o.nd.m().mo());
                com.thinkup.core.bridge.d.m.d().d(com.thinkup.core.common.o.nd.m().dd(), jSONObject);
            }
            try {
                Map<String, Object> staticPerformanceDataMap = MediationUtilsManager.getInstance(contextDd).getStaticPerformanceDataMap();
                if (staticPerformanceDataMap != null) {
                    for (Map.Entry<String, Object> entry2 : staticPerformanceDataMap.entrySet()) {
                        jSONObject.put(entry2.getKey(), entry2.getValue());
                    }
                }
            } catch (Throwable unused2) {
            }
            m(jSONObject);
            JSONObject jSONObjectDo0 = com.thinkup.core.common.o.nd.m().do0();
            if (jSONObjectDo0 != null) {
                jSONObject.put("mmed_m_a_c", jSONObjectDo0);
            }
            String strNq = com.thinkup.core.common.o.nd.m().nq();
            if (!TextUtils.isEmpty(strNq)) {
                jSONObject.put(om0, strNq);
            }
        } catch (Exception unused3) {
        }
        return jSONObject;
    }

    /* JADX WARN: Code duplicated, block: B:150:0x0322 A[Catch: all -> 0x033e, TRY_LEAVE, TryCatch #3 {all -> 0x033e, blocks: (B:4:0x0023, B:6:0x0029, B:9:0x0030, B:11:0x003b, B:18:0x0049, B:20:0x004f, B:22:0x0065, B:23:0x0068, B:26:0x0070, B:28:0x007b, B:30:0x0089, B:31:0x009b, B:33:0x00a9, B:34:0x00b2, B:37:0x00bb, B:41:0x00ce, B:52:0x00eb, B:56:0x00f3, B:61:0x0102, B:63:0x010c, B:65:0x0123, B:66:0x0128, B:68:0x012e, B:69:0x0133, B:71:0x0139, B:72:0x013e, B:74:0x014d, B:75:0x0152, B:82:0x0180, B:84:0x018a, B:85:0x018f, B:87:0x0195, B:88:0x019a, B:90:0x01a0, B:92:0x01aa, B:93:0x01b7, B:95:0x01c1, B:96:0x01ce, B:98:0x01dc, B:99:0x01e9, B:101:0x01ee, B:103:0x01f8, B:104:0x01fd, B:106:0x0207, B:107:0x020c, B:109:0x0216, B:110:0x021b, B:112:0x0225, B:113:0x022a, B:115:0x0234, B:116:0x0239, B:118:0x0243, B:119:0x0248, B:121:0x0252, B:122:0x0257, B:124:0x0261, B:125:0x0266, B:127:0x0270, B:128:0x0275, B:130:0x027f, B:131:0x0284, B:133:0x028e, B:134:0x0293, B:136:0x029d, B:137:0x02a2, B:139:0x02ac, B:141:0x02b3, B:143:0x02bb, B:144:0x02df, B:147:0x02fb, B:148:0x02fe, B:150:0x0322, B:57:0x00f7, B:59:0x00fd, B:60:0x0100, B:42:0x00d2, B:50:0x00e6, B:51:0x00e9, B:27:0x0076), top: B:162:0x0023, inners: #1 }] */
    /* JADX WARN: Code duplicated, block: B:15:0x0044  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v8, types: [com.thinkup.core.common.o.n0] */
    /* JADX WARN: Type inference failed for: r10v7, types: [com.thinkup.core.bridge.d.m] */
    /* JADX WARN: Type inference failed for: r2v0, types: [org.json.JSONObject] */
    /* JADX WARN: Type inference failed for: r6v2 */
    /* JADX WARN: Type inference failed for: r6v3 */
    /* JADX WARN: Type inference failed for: r6v4, types: [int] */
    /* JADX WARN: Type inference failed for: r6v5 */
    /* JADX WARN: Type inference failed for: r6v6 */
    public static JSONObject m(int i10, List<String> list) {
        String strD00;
        boolean z10;
        Context contextDd = com.thinkup.core.common.o.nd.m().dd();
        ?? jSONObject = new JSONObject();
        com.thinkup.core.q.m mVarM = com.thinkup.core.q.o.d(contextDd).m(com.thinkup.core.common.o.nd.m().mo());
        if (mVarM != null) {
            try {
                strD00 = mVarM.d00();
            } catch (Throwable unused) {
            }
        } else {
            strD00 = "";
        }
        if (TextUtils.isEmpty(strD00)) {
            z10 = true;
        } else {
            try {
                JSONObject jSONObject2 = new JSONObject(strD00);
                if (jSONObject2.isNull("a") || jSONObject2.optInt("a") == 1) {
                    z10 = true;
                } else {
                    z10 = false;
                }
            } catch (Exception unused2) {
            }
        }
        jSONObject.put("android_id", z10 ? com.thinkup.core.common.nn.m0.o(contextDd) : "");
        jSONObject.put("gaid", com.thinkup.core.common.nn.m0.d0());
        ?? N = com.thinkup.core.common.o.nd.m().n();
        if (N != 0) {
            N.fillRequestData(jSONObject, mVarM, i10);
        }
        if (TUSDK.isCnSDK()) {
            jSONObject.put("is_cn_sdk", "1");
        } else {
            jSONObject.put("is_cn_sdk", "0");
        }
        String strDq = com.thinkup.core.common.nn.m0.dq(contextDd);
        Location locationNm = com.thinkup.core.common.o.nd.m().nm();
        if (locationNm != null) {
            jSONObject.put(f69780oq, locationNm.getLatitude());
            jSONObject.put(f69782q0, locationNm.getLongitude());
        }
        String strNn = com.thinkup.core.common.o.nd.m().nn();
        if (!TextUtils.isEmpty(strNn)) {
            jSONObject.put(f69783qd, Integer.parseInt(strNn));
        }
        jSONObject.put("it_src", TextUtils.isEmpty(strDq) ? "" : strDq);
        jSONObject.put(dnm, com.thinkup.core.common.o.dn.d0.f72647d);
        int i11 = don;
        if (i11 == -1) {
            boolean zN = com.thinkup.core.common.nn.mn.n(contextDd);
            boolean zM = com.thinkup.core.common.nn.mn.m(contextDd);
            ?? r10 = zM ? 2 : zN;
            if (zN && zM) {
                r10 = 3;
            }
            if (r10 > 0) {
                jSONObject.put(f69785qn, r10);
            }
            don = r10;
        } else if (i11 > 0) {
            jSONObject.put(f69785qn, i11);
        }
        int i12 = doo;
        if (i12 == -1) {
            boolean zN2 = com.thinkup.core.common.nn.mn.n();
            if (zN2) {
                jSONObject.put(f69784qm, 1);
            }
            doo = zN2 ? 1 : 0;
        } else if (i12 == 1) {
            jSONObject.put(f69784qm, i12);
        }
        TUUserDeviceInfo tUUserDeviceInfoDd0 = com.thinkup.core.common.o.nd.m().dd0();
        if (tUUserDeviceInfoDd0 != null) {
            String devGaid = tUUserDeviceInfoDd0.getDevGaid();
            String devImei = tUUserDeviceInfoDd0.getDevImei();
            String devOaid = tUUserDeviceInfoDd0.getDevOaid();
            JSONObject jSONObject3 = new JSONObject();
            if (!TextUtils.isEmpty(devGaid)) {
                jSONObject3.put("set_gaid", devGaid);
            }
            if (!TextUtils.isEmpty(devImei)) {
                jSONObject3.put("set_imei", devImei);
            }
            if (!TextUtils.isEmpty(devOaid)) {
                jSONObject3.put("set_oaid", devOaid);
            }
            jSONObject.put(f69786qo, jSONObject3);
            String devUID2Token = tUUserDeviceInfoDd0.getDevUID2Token();
            if (!TextUtils.isEmpty(devUID2Token)) {
                jSONObject.put(nnq, devUID2Token);
            }
        }
        Map<String, Object> mapMd = com.thinkup.core.common.o.nd.m().md();
        try {
            Object obj = mapMd.get(TUCustomRuleKeys.USER_NUMBER);
            if (obj != null) {
                jSONObject.put(do0, Long.parseLong(obj.toString()));
            }
        } catch (Throwable unused3) {
        }
        try {
            Object obj2 = mapMd.get(TUCustomRuleKeys.USER_DEVICE_ID);
            if (obj2 != null) {
                jSONObject.put(dod, obj2.toString());
            }
        } catch (Throwable unused4) {
        }
        String strMn = com.thinkup.core.common.nn.m0.mn();
        if (!TextUtils.isEmpty(strMn)) {
            jSONObject.put("amazon_id", strMn);
        }
        int iMo = com.thinkup.core.common.nn.m0.mo();
        if (iMo > 0) {
            jSONObject.put(m0m, iMo);
        }
        if ((i10 & 32) == 32) {
            if (com.thinkup.core.common.mm.q.d().d0() > 0) {
                jSONObject.put("t_mem", com.thinkup.core.common.mm.q.d().d0());
            }
            if (com.thinkup.core.common.mm.q.d().dd() > 0) {
                jSONObject.put("c_num", com.thinkup.core.common.mm.q.d().dd());
            }
            if (com.thinkup.core.common.mm.q.d().dm() > 0) {
                jSONObject.put("t_store", com.thinkup.core.common.mm.q.d().dm());
            }
        }
        if ((i10 & 64) == 64) {
            String strNm = com.thinkup.core.common.nn.m0.nm();
            if (!TextUtils.isEmpty(strNm)) {
                jSONObject.put("bld_type", strNm);
            }
            String strNn2 = com.thinkup.core.common.nn.m0.nn();
            if (!TextUtils.isEmpty(strNn2)) {
                jSONObject.put("bld_tags", strNn2);
            }
            String strNo = com.thinkup.core.common.nn.m0.no();
            if (!TextUtils.isEmpty(strNo)) {
                jSONObject.put("bld_user", strNo);
            }
            String strNq = com.thinkup.core.common.nn.m0.nq();
            if (!TextUtils.isEmpty(strNq)) {
                jSONObject.put("bld_radio", strNq);
            }
            String strO0 = com.thinkup.core.common.nn.m0.o0();
            if (!TextUtils.isEmpty(strO0)) {
                jSONObject.put("bld_bootloader", strO0);
            }
            String strOd = com.thinkup.core.common.nn.m0.od();
            if (!TextUtils.isEmpty(strOd)) {
                jSONObject.put("bld_hardware", strOd);
            }
            String strOm = com.thinkup.core.common.nn.m0.om();
            if (!TextUtils.isEmpty(strOm)) {
                jSONObject.put("bld_host", strOm);
            }
            String strOn = com.thinkup.core.common.nn.m0.on();
            if (!TextUtils.isEmpty(strOn)) {
                jSONObject.put("bld_codename", strOn);
            }
            String strOo = com.thinkup.core.common.nn.m0.oo();
            if (!TextUtils.isEmpty(strOo)) {
                jSONObject.put("bld_incremental", strOo);
            }
            String strOq = com.thinkup.core.common.nn.m0.oq();
            if (!TextUtils.isEmpty(strOq)) {
                jSONObject.put("bld_serial", strOq);
            }
            String strQ0 = com.thinkup.core.common.nn.m0.q0();
            if (!TextUtils.isEmpty(strQ0)) {
                jSONObject.put("bld_display", strQ0);
            }
            String strQd = com.thinkup.core.common.nn.m0.qd();
            if (!TextUtils.isEmpty(strQd)) {
                jSONObject.put("bld_version_codes", strQd);
            }
            String strQm = com.thinkup.core.common.nn.m0.qm();
            if (!TextUtils.isEmpty(strQm)) {
                jSONObject.put("bld_board", strQm);
            }
        }
        if (list == null || !list.contains(com.thinkup.core.common.o.dn.oq.f72891d)) {
            jSONObject.put("ip_v4", com.thinkup.core.common.nn.m0.qo());
            jSONObject.put("ip_v6", com.thinkup.core.common.nn.m0.qq());
            com.thinkup.core.common.m.d0.d();
            jSONObject.put("anr_sw", com.thinkup.core.common.m.d0.n());
            if (TUSDK.isCnSDK()) {
                jSONObject.put("app_id", com.thinkup.core.common.o.nd.m().mo());
                com.thinkup.core.bridge.d.m.d().m(com.thinkup.core.common.o.nd.m().dd(), jSONObject);
            }
        } else {
            jSONObject.put("s_c", com.thinkup.core.common.nn.m0.on(contextDd));
            jSONObject.put("u_a", com.thinkup.core.common.nn.m0.oo(contextDd));
            jSONObject.put(mdm, com.thinkup.core.common.nn.m0.oq(contextDd));
            jSONObject.put("d_s", com.thinkup.core.common.nn.m0.q0(contextDd));
            try {
                jSONObject.put(mdo, Integer.parseInt(com.thinkup.core.common.nn.m0.no(contextDd)));
                jSONObject.put(mdq, Integer.parseInt(com.thinkup.core.common.nn.m0.nq(contextDd)));
            } catch (Exception e10) {
                e10.printStackTrace();
            }
            jSONObject.put("ip_v4", com.thinkup.core.common.nn.m0.qo());
            jSONObject.put("ip_v6", com.thinkup.core.common.nn.m0.qq());
            com.thinkup.core.common.m.d0.d();
            jSONObject.put("anr_sw", com.thinkup.core.common.m.d0.n());
            if (TUSDK.isCnSDK()) {
                jSONObject.put("app_id", com.thinkup.core.common.o.nd.m().mo());
                com.thinkup.core.bridge.d.m.d().m(com.thinkup.core.common.o.nd.m().dd(), jSONObject);
            }
        }
        return jSONObject;
    }

    private static void n(JSONObject jSONObject) throws JSONException {
        TUUserDeviceInfo tUUserDeviceInfoDd0 = com.thinkup.core.common.o.nd.m().dd0();
        if (tUUserDeviceInfoDd0 != null) {
            String devGaid = tUUserDeviceInfoDd0.getDevGaid();
            String devImei = tUUserDeviceInfoDd0.getDevImei();
            String devOaid = tUUserDeviceInfoDd0.getDevOaid();
            JSONObject jSONObject2 = new JSONObject();
            if (!TextUtils.isEmpty(devGaid)) {
                jSONObject2.put("set_gaid", devGaid);
            }
            if (!TextUtils.isEmpty(devImei)) {
                jSONObject2.put("set_imei", devImei);
            }
            if (!TextUtils.isEmpty(devOaid)) {
                jSONObject2.put("set_oaid", devOaid);
            }
            jSONObject.put(f69786qo, jSONObject2);
            String devUID2Token = tUUserDeviceInfoDd0.getDevUID2Token();
            if (TextUtils.isEmpty(devUID2Token)) {
                return;
            }
            jSONObject.put(nnq, devUID2Token);
        }
    }

    public static JSONObject m(int i10) {
        return m(i10, (List<String>) null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v0 */
    /* JADX WARN: Type inference failed for: r3v1 */
    /* JADX WARN: Type inference failed for: r3v2, types: [int] */
    /* JADX WARN: Type inference failed for: r3v3 */
    /* JADX WARN: Type inference failed for: r3v4 */
    /* JADX WARN: Type inference failed for: r5v0, types: [org.json.JSONObject] */
    private static void m(Context context, JSONObject jSONObject) throws JSONException {
        int i10 = don;
        if (i10 == -1) {
            boolean zN = com.thinkup.core.common.nn.mn.n(context);
            boolean zM = com.thinkup.core.common.nn.mn.m(context);
            ?? r10 = zM ? 2 : zN;
            if (zN && zM) {
                r10 = 3;
            }
            if (r10 > 0) {
                jSONObject.put(f69785qn, r10);
            }
            don = r10;
        } else if (i10 > 0) {
            jSONObject.put(f69785qn, i10);
        }
        int i11 = doo;
        if (i11 != -1) {
            if (i11 == 1) {
                jSONObject.put(f69784qm, i11);
            }
        } else {
            boolean zN2 = com.thinkup.core.common.nn.mn.n();
            if (zN2) {
                jSONObject.put(f69784qm, 1);
            }
            doo = zN2 ? 1 : 0;
        }
    }

    public static void m(JSONObject jSONObject) throws JSONException {
        com.thinkup.core.common.m.d0.d();
        jSONObject.put(odm, com.thinkup.core.common.m.d0.dd());
        com.thinkup.core.common.m.d0.d();
        jSONObject.put(odn, com.thinkup.core.common.m.d0.dm());
        com.thinkup.core.common.m.d0.d();
        jSONObject.put(odo, com.thinkup.core.common.m.d0.dn());
    }

    public static JSONObject d(int i10) {
        return d(i10, (List<String>) null);
    }

    public static void d(JSONObject jSONObject) {
        try {
            mdm mdmVarDdd = com.thinkup.core.common.o.nd.m().ddd();
            JSONObject jSONObject2 = new JSONObject();
            int i10 = 1;
            if (mdmVarDdd.m() != 1) {
                i10 = 0;
            }
            jSONObject2.put("has_sdk", i10);
            jSONObject2.put("sdk_ver", String.valueOf(mdmVarDdd.n()));
            jSONObject2.put("sdk_api_ver", String.valueOf(mdmVarDdd.o()));
            jSONObject2.put("open_app_id", com.thinkup.core.common.nn.m0.md());
            jSONObject.put(dq0, jSONObject2);
        } catch (Throwable unused) {
        }
    }

    public static JSONObject d() {
        return d(com.thinkup.core.common.o.nd.m().md());
    }

    public static JSONObject d(String str) {
        return d(com.thinkup.core.common.o.nd.m().o(str));
    }

    public static JSONObject d(Map<String, Object> map) {
        if (map == null) {
            return null;
        }
        try {
            JSONObject jSONObject = new JSONObject();
            try {
                for (String str : map.keySet()) {
                    Object obj = map.get(str);
                    if (obj != null) {
                        try {
                            jSONObject.put(str, obj.toString());
                        } catch (Throwable unused) {
                        }
                    }
                }
            } catch (Throwable unused2) {
            }
            return jSONObject;
        } catch (Throwable unused3) {
            return null;
        }
    }

    public static void d(Context context, JSONObject jSONObject) throws JSONException {
        jSONObject.put("app_id", com.thinkup.core.common.o.nd.m().mo());
        boolean z10 = true;
        jSONObject.put("platform", 1);
        jSONObject.put("sdk_ver", com.thinkup.core.common.nn.mn.d());
        jSONObject.put("upid", com.thinkup.core.common.o.nn.d(context).m() ? com.thinkup.core.common.o.nd.m().oo() : "");
        com.thinkup.core.q.m mVarM = com.thinkup.core.q.o.d(context).m(com.thinkup.core.common.o.nd.m().mo());
        String strD00 = mVarM != null ? mVarM.d00() : "";
        if (!TextUtils.isEmpty(strD00)) {
            try {
                JSONObject jSONObject2 = new JSONObject(strD00);
                if (!jSONObject2.isNull("a") && jSONObject2.optInt("a") != 1) {
                    z10 = false;
                }
            } catch (Exception unused) {
            }
        }
        jSONObject.put("android_id", z10 ? com.thinkup.core.common.nn.m0.o(context) : "");
        jSONObject.put("gaid", com.thinkup.core.common.nn.m0.d0());
        com.thinkup.core.common.o.n0 n0VarN = com.thinkup.core.common.o.nd.m().n();
        if (n0VarN != null) {
            n0VarN.fillRequestData(jSONObject, mVarM, -1);
        }
    }
}