package com.thinkup.core.q;

import android.location.Location;
import android.text.TextUtils;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.mbsignalcommon.commonwebview.ToolBar;
import com.mbridge.msdk.playercommon.exoplayer2.trackselection.AdaptiveTrackSelection;
import com.reyun.solar.engine.report.Common;
import com.thinkup.core.api.TUAdConst;
import com.thinkup.core.api.TUAdRequest;
import com.thinkup.core.api.TURewardInfo;
import com.thinkup.core.api.TUSDKGlobalSetting;
import com.thinkup.core.api.TUUserDeviceInfo;
import com.thinkup.core.common.dm.d0q;
import com.thinkup.core.common.dm.dmn;
import com.thinkup.core.common.dm.dmq;
import com.thinkup.core.common.dm.don;
import com.thinkup.core.common.dm.m0m;
import com.thinkup.core.common.dm.m0q;
import com.thinkup.core.common.dm.no;
import com.thinkup.core.common.dm.nq;
import com.thinkup.core.common.dm.oo;
import com.thinkup.core.common.dm.qo;
import com.tiktok.appevents.contents.TTContentsEventConstants;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes7.dex */
public final class m0 extends q {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final String f73927d = "Placement";

    /* JADX INFO: renamed from: d0, reason: collision with root package name */
    public static final int f73928d0 = 1;

    /* JADX INFO: renamed from: dd, reason: collision with root package name */
    public static final int f73929dd = 2;

    /* JADX INFO: renamed from: dm, reason: collision with root package name */
    public static final int f73930dm = 3;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final int f73931m = 0;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final int f73932n = 1;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final int f73933q = 2;
    private int d00;
    private String d0d;
    private Map<String, Object> d0m;
    private Map<String, TURewardInfo> d0n;
    private TURewardInfo d0o;
    private String d0q;
    private String dd0;
    private long ddd;
    private String ddm;
    private long ddn;
    private int ddo;
    private long ddq;
    private int dm0;
    private List<dmn> dmd;
    private dmq dmm;
    private long dmn;
    private double dmo;
    private String dmq;

    /* JADX INFO: renamed from: dn, reason: collision with root package name */
    TUAdRequest f73934dn;
    private List<String> dn0;
    private String dnd;
    private String dnm;
    private String dnn;
    private String dno;
    private long dnq;

    /* JADX INFO: renamed from: do, reason: not valid java name */
    private String f251do;
    private String do0;
    private String dod;
    private double dom;
    private long don;
    private long doo;
    private long doq;

    /* JADX INFO: renamed from: dq, reason: collision with root package name */
    private long f73935dq;
    private long dq0;
    private int dqd;
    private int dqm;
    private int dqn;
    private long dqo;
    private JSONObject dqq;

    /* JADX INFO: renamed from: m0, reason: collision with root package name */
    private long f73936m0;
    private JSONObject m00;
    private String m0d;
    private String m0m;
    private int m0n;
    private int m0o;
    private List<Integer> m0q;

    /* JADX INFO: renamed from: md, reason: collision with root package name */
    private int f73937md;
    private int md0;
    private int mdd;
    private int mdm;
    private int mdo;

    /* JADX INFO: renamed from: mm, reason: collision with root package name */
    private int f73938mm;
    private double[][] mmm;
    private int mmo;
    private dd mmq;

    /* JADX INFO: renamed from: mn, reason: collision with root package name */
    private int f73939mn;
    private boolean mnd;
    private int mnm;
    private int mnn;
    private int mno;
    private long mnq;

    /* JADX INFO: renamed from: mo, reason: collision with root package name */
    private long f73940mo;
    private long mo0;
    private long mod;
    private int mom;
    private int mon;
    private JSONArray moo;
    private JSONArray moq;

    /* JADX INFO: renamed from: mq, reason: collision with root package name */
    private long f73941mq;
    private JSONArray mq0;
    private JSONArray mqd;
    private JSONArray mqm;
    private JSONArray mqn;
    private JSONArray mqo;
    private JSONArray mqq;

    /* JADX INFO: renamed from: n0, reason: collision with root package name */
    private long f73942n0;
    private JSONArray n00;
    private JSONArray n0d;
    private JSONArray n0m;
    private JSONArray n0n;
    private d0 n0o;
    private long n0q;

    /* JADX INFO: renamed from: nd, reason: collision with root package name */
    private int f73943nd;
    private int nd0;
    private int ndd;
    private int ndm;
    private List<Integer> ndn;
    private int ndq;

    /* JADX INFO: renamed from: nm, reason: collision with root package name */
    private int f73944nm;
    private String nm0;
    private int nmd;
    private int nmm;
    private int[] nmn;
    private Boolean nmq;

    /* JADX INFO: renamed from: nn, reason: collision with root package name */
    private int f73945nn;
    private int nn0;
    private String nnd;
    private d0q nnm;
    private int nnn;
    private int nno;
    private int nnq;

    /* JADX INFO: renamed from: no, reason: collision with root package name */
    private int f73946no;
    private int no0;
    private qo nod;
    private List<String> nom;
    private JSONObject non;

    /* JADX INFO: renamed from: nq, reason: collision with root package name */
    private List<m0q> f73947nq;
    private JSONObject nqd;
    private long nqn;
    private int nqo;

    /* JADX INFO: renamed from: o0, reason: collision with root package name */
    private Map<String, m0q> f73948o0;
    private long o00;
    private List<com.thinkup.core.common.m.o> o0d;
    private int o0m;
    private String o0n;
    private String o0o;
    private long o0q;

    /* JADX INFO: renamed from: od, reason: collision with root package name */
    private int f73949od;
    private double od0;
    private int odd;
    private int odm;
    private int odn;
    private int odo;
    private JSONObject odq;

    /* JADX INFO: renamed from: om, reason: collision with root package name */
    private int f73950om;
    private int om0;
    private long omd;

    /* JADX INFO: renamed from: on, reason: collision with root package name */
    private long f73951on;

    /* JADX INFO: renamed from: oo, reason: collision with root package name */
    private long f73952oo;

    /* JADX INFO: renamed from: oq, reason: collision with root package name */
    private long f73953oq;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    private int f73954q0;

    /* JADX INFO: renamed from: qd, reason: collision with root package name */
    private String f73955qd;

    /* JADX INFO: renamed from: qm, reason: collision with root package name */
    private m0m f73956qm;

    /* JADX INFO: renamed from: qn, reason: collision with root package name */
    private int f73957qn;

    /* JADX INFO: renamed from: qo, reason: collision with root package name */
    private String f73958qo;

    /* JADX INFO: renamed from: qq, reason: collision with root package name */
    private int f73959qq;
    private int mdn = 0;
    private int mdq = 10;
    private int mm0 = 10;
    private int mmd = 2;
    private int mmn = 1;
    private com.thinkup.core.common.dm.mn mn0 = new com.thinkup.core.common.dm.mn();
    private int ndo = 2;
    private int nmo = 2;
    private int noo = 1;
    private int noq = 10000;
    private int nq0 = 3000;
    private int nqm = 1;
    private int nqq = 2;

    public static class d {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final String f73960d = "hb_bid_timeout";

        /* JADX INFO: renamed from: d0, reason: collision with root package name */
        public static final String f73961d0 = "cached_offers_num";
        public static final String d00 = "xdb_list";
        public static final String d0d = "s2s_bd_max";
        public static final String d0m = "req_merge";
        public static final String d0n = "exclude_id_max";
        public static final String d0o = "install_id_max";
        public static final String d0q = "install_ids";

        /* JADX INFO: renamed from: dd, reason: collision with root package name */
        public static final String f73962dd = "adx_list";
        public static final String dd0 = "exclude_ids";
        public static final String ddd = "is_test";
        public static final String ddm = "gsp_rates";
        public static final String ddn = "adx_ext";
        public static final String ddo = "wf_id";
        public static final String ddq = "sysh_mtg_sw";

        /* JADX INFO: renamed from: dm, reason: collision with root package name */
        public static final String f73963dm = "adx_st";
        public static final String dm0 = "mid_gdt_sw";
        public static final String dmd = "lm_lrqf_interval_sws";
        public static final String dmm = "wf_lscb_type";
        public static final String dmn = "reqid_pg_sw";
        public static final String dmo = "sr_sw";
        public static final String dmq = "p_c";

        /* JADX INFO: renamed from: dn, reason: collision with root package name */
        public static final String f73964dn = "ilrd";
        public static final String dn0 = "has_1st_rl";
        public static final String dnd = "updateTime";
        public static final String dnm = "upd_type";
        public static final String dnn = "upd_th";
        public static final String dno = "value_n";
        public static final String dnq = "bid_value_n";

        /* JADX INFO: renamed from: do, reason: not valid java name */
        public static final String f252do = "hb_list";
        public static final String do0 = "sto_stg";
        public static final String dod = "lf_rt_itr";
        public static final String dom = "wf2_mode_sw";
        public static final String don = "wf2_req_ug_type";
        public static final String doo = "wf2_mode_req_num";
        public static final String doq = "am_est_num";

        /* JADX INFO: renamed from: dq, reason: collision with root package name */
        public static final String f73965dq = "inh_list";
        public static final String dq0 = "share_pl_id";
        public static final String dqd = "s2s_sw";
        public static final String dqm = "bd_req_bid_sw";
        public static final String dqn = "bn_template_id";
        public static final String dqo = "mix_click_type";
        public static final String dqq = "auto_refresh_type";

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public static final String f73966m = "addr_bid";

        /* JADX INFO: renamed from: m0, reason: collision with root package name */
        public static final String f73967m0 = "fbhb_bid_wtime";
        public static final String m00 = "wf_sw";
        public static final String m0d = "wf_obj";
        public static final String m0m = "pl_wf_st_type";
        public static final String m0n = "presetwf_reload_sw";
        public static final String m0o = "wf2_nf_sw";
        public static final String m0q = "ps_ct_max";

        /* JADX INFO: renamed from: md, reason: collision with root package name */
        public static final String f73968md = "burl_nt_firm";
        public static final String md0 = "adx_dsp";
        public static final String mdd = "unique_id";
        public static final String mdm = "e_key_data";
        public static final String mdn = "c_pub_key";
        public static final String mdo = "s_id";
        public static final String mdq = "c_id";

        /* JADX INFO: renamed from: mm, reason: collision with root package name */
        public static final String f73969mm = "wf_bid_addr";
        public static final String mm0 = "sp_sdk_pri_timeout";
        public static final String mmd = "dn_c2shb_list";
        public static final String mmm = "dn_s2shb_list";
        public static final String mmn = "bid_wait_other_time";
        public static final String mmo = "h_s_t_auto_sdk_to_time";
        public static final String mmq = "ps_ct_out_cus";

        /* JADX INFO: renamed from: mn, reason: collision with root package name */
        public static final String f73970mn = "ss_data";
        public static final String mn0 = "autoload_t";
        public static final String mnd = "ads_lg_st";
        public static final String mnm = "rotation_num";
        public static final String mnn = "rotation_inter";
        public static final String mno = "rotation_cache_ts";
        public static final String mnq = "adx_id_b_sw";

        /* JADX INFO: renamed from: mo, reason: collision with root package name */
        public static final String f73971mo = "cn_addr_bid";
        public static final String mo0 = "addr_st";
        public static final String mod = "i_r_sw";
        public static final String mom = "strategy_domain_type_key";
        public static final String mon = "anr_dyna_st";
        public static final String moo = "wf_dfp";
        private static final String moq = "ps_id_timeout";

        /* JADX INFO: renamed from: mq, reason: collision with root package name */
        public static final String f73972mq = "cn_wf_bid_addr";
        private static final String mq0 = "ps_ct";
        private static final String mqd = "ps_ct_out";
        private static final String mqm = "pucs";
        private static final String mqn = "ad_delivery_sw";
        private static final String mqo = "req_ug_num";
        private static final String mqq = "unit_caps_d";

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public static final String f73973n = "load_fail_wtime";

        /* JADX INFO: renamed from: n0, reason: collision with root package name */
        public static final String f73974n0 = "byuid_wt";
        private static final String n00 = "unit_caps_h";
        private static final String n0d = "unit_pacing";
        private static final String n0m = "wifi_auto_sw";
        private static final String n0n = "show_type";
        private static final String n0o = "refresh";
        private static final String n0q = "ug_list";

        /* JADX INFO: renamed from: nd, reason: collision with root package name */
        public static final String f73975nd = "addr_bks";
        private static final String nd0 = "ol_list";
        private static final String ndd = "gro_id";
        private static final String ndm = "hb_list";
        private static final String ndn = "s2shb_list";
        private static final String ndo = "format";
        private static final String ndq = "auto_refresh";

        /* JADX INFO: renamed from: nm, reason: collision with root package name */
        public static final String f73976nm = "addr_subbks";
        private static final String nm0 = "auto_refresh_time";
        private static final String nmd = "s_t";
        private static final String nmm = "l_s_t";
        private static final String nmn = "ra";
        private static final String nmo = "asid";
        private static final String nmq = "tp_ps";

        /* JADX INFO: renamed from: nn, reason: collision with root package name */
        public static final String f73977nn = "s2sbks_list";
        private static final String nn0 = "t_g_id";
        private static final String nnd = "s_id";
        private static final String nnm = "u_n_f_sw";
        private static final String nnn = "m_o";
        private static final String nno = "m_o_s";
        private static final String nnq = "m_o_ks";

        /* JADX INFO: renamed from: no, reason: collision with root package name */
        public static final String f73978no = "exch_rate_c2u";
        private static final String no0 = "p_m_o";
        private static final String nod = "callback";
        private static final String nom = "sc_list";
        private static final String non = "rw_n";
        private static final String noo = "rw_num";
        private static final String noq = "reward";

        /* JADX INFO: renamed from: nq, reason: collision with root package name */
        public static final String f73979nq = "doffer_list";
        private static final String nq0 = "currency";
        private static final String nqd = "cc";
        private static final String nqm = "exch_r";
        private static final String nqn = "acct_cy";
        private static final String nqo = "req_ug_type_v2";
        private static final String nqq = "device_perf_sw";

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        public static final String f73980o = "load_cap";

        /* JADX INFO: renamed from: o0, reason: collision with root package name */
        public static final String f73981o0 = "bottom_list";
        private static final String o00 = "max_cached_num";
        private static final String o0d = "wf_req_wait_t";
        private static final String o0m = "c2s_req_wait_t";
        private static final String o0n = "s2s_req_wait_t";
        private static final String o0o = "auto_req_type";
        private static final String o0q = "auto_refresh_type_v2";

        /* JADX INFO: renamed from: od, reason: collision with root package name */
        public static final String f73982od = "bottom_reqts";
        private static final String od0 = "pl_refresh_timeout";
        private static final String odd = "wait_bid_load_sw";
        private static final String odm = "wait_bid_cb_t";

        /* JADX INFO: renamed from: om, reason: collision with root package name */
        public static final String f73983om = "cb_w_time";

        /* JADX INFO: renamed from: on, reason: collision with root package name */
        public static final String f73984on = "req_w_time";

        /* JADX INFO: renamed from: oo, reason: collision with root package name */
        public static final String f73985oo = "wf_loadts";

        /* JADX INFO: renamed from: oq, reason: collision with root package name */
        public static final String f73986oq = "req_ug_type";

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        public static final String f73987q = "load_cap_time";

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public static final String f73988q0 = "req_ug_numsp";

        /* JADX INFO: renamed from: qd, reason: collision with root package name */
        public static final String f73989qd = "bf_ldf_rf_sw";

        /* JADX INFO: renamed from: qm, reason: collision with root package name */
        public static final String f73990qm = "hb_start_time";

        /* JADX INFO: renamed from: qn, reason: collision with root package name */
        public static final String f73991qn = "dsp_list";

        /* JADX INFO: renamed from: qo, reason: collision with root package name */
        public static final String f73992qo = "bid_floor";

        /* JADX INFO: renamed from: qq, reason: collision with root package name */
        public static final String f73993qq = "max_unit_ids";
    }

    private m0(String str) {
        this.f251do = str;
    }

    private void dd(int i10) {
        this.mno = i10;
    }

    private void dm(int i10) {
        this.mom = i10;
    }

    private void dn(int i10) {
        this.mon = i10;
    }

    private static m0 m(String str, JSONObject jSONObject) {
        m0 m0Var;
        long jOptLong;
        m0 m0Var2;
        int i10;
        JSONArray jSONArrayOptJSONArray;
        int length;
        if (jSONObject == null) {
            return null;
        }
        try {
            m0 m0Var3 = new m0(str);
            m0Var3.nqn = System.currentTimeMillis();
            m0Var3.m(jSONObject);
            m0Var3.n(jSONObject);
            m0Var3.o(jSONObject);
            if (jSONObject.isNull("ps_ct")) {
                m0Var3.f73935dq = 0L;
            } else {
                m0Var3.f73935dq = jSONObject.optLong("ps_ct");
            }
            if (jSONObject.isNull("ps_ct_out")) {
                m0Var3.f73936m0 = 0L;
            } else {
                m0Var3.f73936m0 = jSONObject.optLong("ps_ct_out");
            }
            if (jSONObject.isNull("pucs")) {
                m0Var3.f73937md = 1;
            } else {
                m0Var3.f73937md = jSONObject.optInt("pucs");
            }
            if (jSONObject.isNull("ad_delivery_sw")) {
                m0Var3.f73938mm = 1;
            } else {
                m0Var3.f73938mm = jSONObject.optInt("ad_delivery_sw");
            }
            if (jSONObject.isNull("req_ug_num")) {
                m0Var3.f73939mn = 1;
            } else {
                int iOptInt = jSONObject.optInt("req_ug_num", 1);
                if (iOptInt <= 0) {
                    iOptInt = 1;
                }
                m0Var3.f73939mn = iOptInt;
            }
            if (jSONObject.isNull("unit_caps_d")) {
                m0Var3.f73940mo = -1L;
            } else {
                m0Var3.f73940mo = jSONObject.optLong("unit_caps_d");
            }
            if (jSONObject.isNull("unit_caps_h")) {
                m0Var3.f73941mq = -1L;
            } else {
                m0Var3.f73941mq = jSONObject.optLong("unit_caps_h");
            }
            if (jSONObject.isNull("unit_pacing")) {
                m0Var3.f73942n0 = -1L;
            } else {
                m0Var3.f73942n0 = jSONObject.optLong("unit_pacing");
            }
            if (jSONObject.isNull("wifi_auto_sw")) {
                m0Var3.f73943nd = 0;
            } else {
                m0Var3.f73943nd = jSONObject.optInt("wifi_auto_sw");
            }
            if (jSONObject.isNull(CampaignEx.KEY_SHOW_TYPE)) {
                m0Var3.f73944nm = 0;
            } else {
                m0Var3.f73944nm = jSONObject.optInt(CampaignEx.KEY_SHOW_TYPE);
            }
            if (jSONObject.isNull(ToolBar.REFRESH)) {
                m0Var3.f73945nn = 0;
            } else {
                m0Var3.f73945nn = jSONObject.optInt(ToolBar.REFRESH);
            }
            if (jSONObject.isNull("gro_id")) {
                m0Var3.f73946no = 0;
            } else {
                m0Var3.f73946no = jSONObject.optInt("gro_id");
            }
            if (jSONObject.isNull(com.thinkup.core.common.d0.d.C0836d.f67683o)) {
                m0Var3.f73949od = 0;
            } else {
                m0Var3.f73949od = jSONObject.optInt(com.thinkup.core.common.d0.d.C0836d.f67683o);
            }
            if (jSONObject.isNull("auto_refresh")) {
                m0Var3.f73950om = 0;
            } else {
                m0Var3.f73950om = jSONObject.optInt("auto_refresh");
            }
            if (jSONObject.isNull("auto_refresh_time")) {
                m0Var3.f73951on = 0L;
            } else {
                m0Var3.f73951on = jSONObject.optLong("auto_refresh_time");
            }
            if (jSONObject.isNull("s_t")) {
                m0Var3.f73952oo = 900000L;
            } else {
                m0Var3.f73952oo = jSONObject.optLong("s_t");
            }
            if (jSONObject.isNull(com.thinkup.core.common.dq.d0q)) {
                m0Var3.f73953oq = com.thinkup.core.common.dd.n.f67831d;
            } else {
                m0Var3.f73953oq = jSONObject.optLong(com.thinkup.core.common.dq.d0q);
            }
            if (jSONObject.isNull("ra")) {
                m0Var3.f73954q0 = -1;
            } else {
                m0Var3.f73954q0 = jSONObject.optInt("ra");
            }
            if (jSONObject.isNull("asid")) {
                m0Var3.f73955qd = "";
            } else {
                m0Var3.f73955qd = jSONObject.optString("asid");
            }
            if (jSONObject.isNull("tp_ps")) {
                m0Var = null;
                try {
                    m0Var3.f73956qm = null;
                } catch (Exception unused) {
                    return m0Var;
                }
            } else {
                try {
                    m0m m0mVar = new m0m();
                    JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("tp_ps");
                    m0mVar.f68276d = jSONObjectOptJSONObject.optInt("pucs") == 1;
                    m0mVar.f68279m = jSONObjectOptJSONObject.optLong("apdt");
                    m0mVar.f68280n = jSONObjectOptJSONObject.optInt("aprn");
                    m0mVar.f68281o = jSONObjectOptJSONObject.optInt("puas") == 1;
                    m0mVar.f68282q = jSONObjectOptJSONObject.optLong("cdt");
                    m0mVar.f68277d0 = jSONObjectOptJSONObject.optInt("ski_swt") == 1;
                    m0mVar.f68278dd = jSONObjectOptJSONObject.optInt("aut_swt") == 1;
                    m0Var3.f73956qm = m0mVar;
                } catch (Exception unused2) {
                }
            }
            if (jSONObject.isNull("ug_list")) {
                m0Var3.moo = new JSONArray();
            } else {
                m0Var3.moo = jSONObject.optJSONArray("ug_list");
            }
            if (jSONObject.isNull("ol_list")) {
                m0Var3.moq = new JSONArray();
            } else {
                m0Var3.moq = jSONObject.optJSONArray("ol_list");
            }
            if (jSONObject.isNull("s2shb_list")) {
                m0Var3.mq0 = new JSONArray();
            } else {
                m0Var3.mq0 = jSONObject.optJSONArray("s2shb_list");
            }
            if (jSONObject.isNull(d.f73962dd)) {
                m0Var3.mqd = new JSONArray();
            } else {
                m0Var3.mqd = jSONObject.optJSONArray(d.f73962dd);
            }
            if (jSONObject.isNull(d.f252do)) {
                m0Var3.mqm = new JSONArray();
            } else {
                m0Var3.mqm = jSONObject.optJSONArray(d.f252do);
            }
            if (jSONObject.isNull(d.f73965dq)) {
                m0Var3.mqn = new JSONArray();
            } else {
                m0Var3.mqn = jSONObject.optJSONArray(d.f73965dq);
            }
            if (jSONObject.isNull(d.f73977nn)) {
                m0Var3.mqo = new JSONArray();
            } else {
                m0Var3.mqo = jSONObject.optJSONArray(d.f73977nn);
            }
            if (jSONObject.isNull(d.f73979nq)) {
                m0Var3.mqq = new JSONArray();
            } else {
                m0Var3.mqq = jSONObject.optJSONArray(d.f73979nq);
            }
            if (jSONObject.isNull(d.dnd)) {
                m0Var3.o0q = 0L;
                jOptLong = 0;
            } else {
                jOptLong = jSONObject.optLong(d.dnd);
                m0Var3.o0q = jOptLong;
            }
            if (jSONObject.isNull("t_g_id")) {
                m0Var3.f73957qn = -1;
            } else {
                m0Var3.f73957qn = jSONObject.optInt("t_g_id");
            }
            if (jSONObject.isNull(d.mdo)) {
                m0Var3.f73958qo = "";
            } else {
                m0Var3.f73958qo = jSONObject.optString(d.mdo);
            }
            if (jSONObject.isNull("u_n_f_sw")) {
                m0Var3.f73959qq = 0;
            } else {
                m0Var3.f73959qq = jSONObject.optInt("u_n_f_sw");
            }
            if (!jSONObject.isNull("m_o_s")) {
                m0Var3.dmm = dmq.nn(jSONObject.optString("m_o_s"));
            }
            if (jSONObject.isNull("m_o")) {
                m0Var2 = null;
                try {
                    m0Var3.dmd = null;
                } catch (Exception unused3) {
                    return m0Var2;
                }
            } else {
                m0Var3.dmd = d(jSONObject.optString("m_o"), jSONObject.optString("m_o_ks"), jOptLong, m0Var3.dmm);
            }
            if (jSONObject.isNull("p_m_o")) {
                m0Var3.d00 = 0;
            } else {
                m0Var3.d00 = jSONObject.optInt("p_m_o");
            }
            if (jSONObject.isNull(com.thinkup.core.common.m0.nn.f69944m)) {
                m0Var = null;
                m0Var3.d0m = null;
            } else {
                JSONObject jSONObject2 = new JSONObject(jSONObject.optString(com.thinkup.core.common.m0.nn.f69944m));
                HashMap map = new HashMap();
                Iterator<String> itKeys = jSONObject2.keys();
                while (itKeys.hasNext()) {
                    String next = itKeys.next();
                    map.put(next, jSONObject2.opt(next));
                }
                m0Var3.d0m = map;
            }
            if (!jSONObject.isNull("callback")) {
                JSONObject jSONObject3 = new JSONObject(jSONObject.optString("callback"));
                if (!jSONObject3.isNull("sc_list")) {
                    JSONObject jSONObject4 = new JSONObject(jSONObject3.optString("sc_list"));
                    HashMap map2 = new HashMap();
                    Iterator<String> itKeys2 = jSONObject4.keys();
                    while (itKeys2.hasNext()) {
                        String next2 = itKeys2.next();
                        JSONObject jSONObject5 = new JSONObject(jSONObject4.optString(next2));
                        TURewardInfo tURewardInfo = new TURewardInfo();
                        tURewardInfo.rewardName = jSONObject5.optString("rw_n");
                        tURewardInfo.rewardNumber = jSONObject5.optInt("rw_num");
                        map2.put(next2, tURewardInfo);
                    }
                    m0Var3.d0n = map2;
                }
                if (!jSONObject3.isNull("reward")) {
                    JSONObject jSONObject6 = new JSONObject(jSONObject3.optString("reward"));
                    TURewardInfo tURewardInfo2 = new TURewardInfo();
                    if (!jSONObject6.isNull("rw_n")) {
                        tURewardInfo2.rewardName = jSONObject6.optString("rw_n");
                    }
                    if (!jSONObject6.isNull("rw_num")) {
                        tURewardInfo2.rewardNumber = jSONObject6.optInt("rw_num");
                    }
                    m0Var3.d0o = tURewardInfo2;
                }
                if (!jSONObject3.isNull(TTContentsEventConstants.Params.EVENT_PROPERTY_CURRENCY)) {
                    m0Var3.d0q = jSONObject3.optString(TTContentsEventConstants.Params.EVENT_PROPERTY_CURRENCY);
                }
                if (!jSONObject3.isNull("cc")) {
                    m0Var3.dd0 = jSONObject3.optString("cc");
                }
                if (!jSONObject3.isNull("exch_r")) {
                    m0Var3.dmo = jSONObject3.optDouble("exch_r", 0.0d);
                }
                if (!jSONObject3.isNull("acct_cy")) {
                    m0Var3.dmq = jSONObject3.optString("acct_cy");
                }
            }
            if (jSONObject.isNull(d.f73960d)) {
                m0Var3.ddd = 10000L;
            } else {
                m0Var3.ddd = jSONObject.optLong(d.f73960d);
            }
            if (jSONObject.isNull(d.f73966m)) {
                m0Var3.ddm = "";
            } else {
                m0Var3.ddm = jSONObject.optString(d.f73966m);
            }
            if (jSONObject.isNull(d.f73973n)) {
                m0Var3.ddn = 10000L;
            } else {
                m0Var3.ddn = jSONObject.optLong(d.f73973n);
            }
            if (jSONObject.isNull(d.f73980o)) {
                m0Var3.ddo = -1;
            } else {
                m0Var3.ddo = jSONObject.optInt(d.f73980o);
            }
            if (jSONObject.isNull(d.f73987q)) {
                m0Var3.ddq = 900000L;
            } else {
                m0Var3.ddq = jSONObject.optLong(d.f73987q);
            }
            if (jSONObject.isNull(d.f73961d0)) {
                m0Var3.dm0 = 2;
            } else {
                int iOptInt2 = jSONObject.optInt(d.f73961d0, 1);
                if (iOptInt2 <= 0) {
                    iOptInt2 = 1;
                }
                m0Var3.dm0 = iOptInt2;
            }
            if (jSONObject.isNull(d.f73964dn)) {
                m0Var3.o0n = null;
            } else {
                m0Var3.o0n = jSONObject.optString(d.f73964dn);
            }
            if (jSONObject.isNull(d.f73963dm)) {
                m0Var3.o0o = "";
            } else {
                m0Var3.o0o = jSONObject.optString(d.f73963dm);
            }
            if (jSONObject.isNull(d.f73967m0)) {
                m0Var3.dmn = 4000L;
            } else {
                m0Var3.dmn = jSONObject.optLong(d.f73967m0);
            }
            if (jSONObject.isNull(d.f73968md)) {
                m0Var3.dn0 = null;
            } else {
                JSONArray jSONArrayOptJSONArray2 = jSONObject.optJSONArray(d.f73968md);
                ArrayList arrayList = new ArrayList(3);
                for (int i11 = 0; i11 < jSONArrayOptJSONArray2.length(); i11++) {
                    arrayList.add(jSONArrayOptJSONArray2.optString(i11));
                }
                m0Var3.dn0 = arrayList;
            }
            if (jSONObject.isNull(d.f73969mm)) {
                m0Var3.dnd = "";
            } else {
                m0Var3.dnd = jSONObject.optString(d.f73969mm);
            }
            if (jSONObject.isNull(d.f73970mn)) {
                m0Var3.dnm = "";
            } else {
                m0Var3.dnm = jSONObject.optString(d.f73970mn);
            }
            if (jSONObject.isNull(d.f73971mo)) {
                m0Var3.dnn = "";
            } else {
                m0Var3.dnn = jSONObject.optString(d.f73971mo);
            }
            if (jSONObject.isNull(d.f73972mq)) {
                m0Var3.dno = "";
            } else {
                m0Var3.dno = jSONObject.optString(d.f73972mq);
            }
            if (jSONObject.isNull(d.f73974n0)) {
                m0Var3.dnq = 500L;
            } else {
                m0Var3.dnq = jSONObject.optLong(d.f73974n0);
            }
            if (jSONObject.isNull(d.f73975nd)) {
                m0Var3.do0 = "";
            } else {
                m0Var3.do0 = jSONObject.optString(d.f73975nd);
            }
            if (jSONObject.isNull(d.f73976nm)) {
                m0Var3.dod = "";
            } else {
                m0Var3.dod = jSONObject.optString(d.f73976nm);
            }
            if (jSONObject.isNull(d.f73978no)) {
                m0Var3.dom = 0.1614d;
            } else {
                m0Var3.dom = jSONObject.optDouble(d.f73978no);
            }
            if (jSONObject.isNull(d.f73981o0)) {
                m0Var3.n0d = new JSONArray();
            } else {
                m0Var3.n0d = jSONObject.optJSONArray(d.f73981o0);
            }
            if (jSONObject.isNull(d.f73982od)) {
                m0Var3.don = 1000L;
            } else {
                m0Var3.don = jSONObject.optLong(d.f73982od);
            }
            if (jSONObject.isNull(d.f73983om)) {
                m0Var3.doo = 0L;
            } else {
                m0Var3.doo = jSONObject.optLong(d.f73983om);
            }
            if (jSONObject.isNull(d.f73984on)) {
                m0Var3.doq = AdaptiveTrackSelection.DEFAULT_MIN_TIME_BETWEEN_BUFFER_REEVALUTATION_MS;
            } else {
                m0Var3.doq = jSONObject.optLong(d.f73984on);
            }
            if (jSONObject.isNull(d.f73985oo)) {
                m0Var3.dq0 = -1L;
            } else {
                m0Var3.dq0 = jSONObject.optLong(d.f73985oo);
            }
            if (jSONObject.isNull(d.f73986oq)) {
                m0Var3.dqd = 1;
            } else {
                int iOptInt3 = jSONObject.optInt(d.f73986oq);
                if (iOptInt3 != 1 && iOptInt3 != 2) {
                    iOptInt3 = 1;
                }
                m0Var3.dqd = iOptInt3;
            }
            if (jSONObject.isNull(d.f73988q0)) {
                m0Var3.dqm = 1;
            } else {
                m0Var3.dqm = jSONObject.optInt(d.f73988q0);
            }
            if (jSONObject.isNull(d.f73989qd)) {
                m0Var3.dqn = 2;
            } else {
                m0Var3.dqn = jSONObject.optInt(d.f73989qd);
            }
            if (jSONObject.isNull(d.f73990qm)) {
                m0Var3.dqo = AdaptiveTrackSelection.DEFAULT_MIN_TIME_BETWEEN_BUFFER_REEVALUTATION_MS;
            } else {
                m0Var3.dqo = jSONObject.optLong(d.f73990qm);
            }
            if (jSONObject.isNull(d.f73991qn)) {
                m0Var3.n00 = new JSONArray();
            } else {
                m0Var3.n00 = jSONObject.optJSONArray(d.f73991qn);
            }
            if (jSONObject.isNull("bid_floor")) {
                m0Var3.od0 = 0.0d;
            } else {
                m0Var3.od0 = jSONObject.optDouble("bid_floor");
            }
            if (jSONObject.isNull(d.f73993qq)) {
                m0Var3.dqq = null;
            } else {
                m0Var3.dqq = jSONObject.optJSONObject(d.f73993qq);
            }
            if (jSONObject.isNull(d.d0d)) {
                m0Var3.odd = 0;
            } else {
                m0Var3.odd = jSONObject.optInt(d.d0d);
            }
            if (jSONObject.isNull(d.d0m)) {
                m0Var3.odm = 2;
            } else {
                m0Var3.odm = jSONObject.optInt(d.d0m);
            }
            if (jSONObject.isNull(d.d0n)) {
                m0Var3.odo = 0;
            } else {
                m0Var3.odo = jSONObject.optInt(d.d0n);
            }
            if (jSONObject.isNull(d.d0o)) {
                m0Var3.odn = 0;
            } else {
                m0Var3.odn = jSONObject.optInt(d.d0o);
            }
            if (jSONObject.isNull("is_test")) {
                m0Var3.o0m = 2;
            } else {
                m0Var3.o0m = jSONObject.optInt("is_test");
            }
            m0Var3.m00 = jSONObject.optJSONObject(d.ddm);
            if (jSONObject.isNull(d.ddn)) {
                m0Var3.m0d = "";
            } else {
                m0Var3.m0d = jSONObject.optString(d.ddn);
            }
            if (jSONObject.isNull(d.ddo)) {
                m0Var3.m0m = "";
            } else {
                m0Var3.m0m = jSONObject.optString(d.ddo);
            }
            if (jSONObject.isNull(d.ddq)) {
                m0Var3.m0n = 2;
            } else {
                m0Var3.m0n = jSONObject.optInt(d.ddq);
            }
            if (jSONObject.isNull(d.dm0)) {
                i10 = 1;
                m0Var3.m0o = 1;
            } else {
                m0Var3.m0o = jSONObject.optInt(d.dm0);
                i10 = 1;
            }
            if (jSONObject.isNull(d.dmd)) {
                m0Var3.m0q = new ArrayList(i10);
            } else {
                ArrayList arrayList2 = new ArrayList(3);
                JSONArray jSONArrayOptJSONArray3 = jSONObject.optJSONArray(d.dmd);
                if (jSONArrayOptJSONArray3 != null) {
                    int length2 = jSONArrayOptJSONArray3.length();
                    for (int i12 = 0; i12 < length2; i12++) {
                        arrayList2.add(Integer.valueOf(jSONArrayOptJSONArray3.optInt(i12)));
                    }
                }
                m0Var3.m0q = arrayList2;
            }
            if (jSONObject.isNull(d.dmm)) {
                m0Var3.md0 = 2;
            } else {
                m0Var3.md0 = jSONObject.optInt(d.dmm);
            }
            if (jSONObject.isNull(d.dmn)) {
                m0Var3.mdd = 1;
            } else {
                m0Var3.mdd = jSONObject.optInt(d.dmn);
            }
            if (jSONObject.isNull(d.dmo)) {
                m0Var3.mdm = 2;
            } else {
                m0Var3.mdm = jSONObject.optInt(d.dmo);
            }
            if (!jSONObject.isNull(d.dmq)) {
                m0Var3.odq = jSONObject.optJSONObject(d.dmq);
            }
            if (!jSONObject.isNull(d.dn0)) {
                m0Var3.mdo = jSONObject.optInt(d.dn0);
            }
            if (!jSONObject.isNull(d.dno)) {
                m0Var3.mdq = jSONObject.optInt(d.dno);
            }
            if (!jSONObject.isNull(d.dnq)) {
                m0Var3.mm0 = jSONObject.optInt(d.dnq);
            }
            if (!jSONObject.isNull(d.dnm)) {
                m0Var3.mmd = jSONObject.optInt(d.dnm);
            }
            if (!jSONObject.isNull(d.dnn)) {
                try {
                    JSONArray jSONArrayOptJSONArray4 = jSONObject.optJSONArray(d.dnn);
                    if (jSONArrayOptJSONArray4 != null) {
                        double[][] dArr = new double[jSONArrayOptJSONArray4.length()][];
                        for (int i13 = 0; i13 < jSONArrayOptJSONArray4.length(); i13++) {
                            Object obj = jSONArrayOptJSONArray4.get(i13);
                            if (obj instanceof JSONArray) {
                                JSONArray jSONArray = (JSONArray) obj;
                                dArr[i13] = new double[]{Double.parseDouble(String.valueOf(jSONArray.get(0))), Double.parseDouble(String.valueOf(jSONArray.get(1)))};
                            }
                        }
                        m0Var3.mmm = dArr;
                    }
                } catch (Exception unused4) {
                }
            }
            if (!jSONObject.isNull(d.do0)) {
                m0Var3.mmn = jSONObject.optInt(d.do0);
            }
            m0Var3.n0q = jSONObject.optLong(d.dod, AdaptiveTrackSelection.DEFAULT_MIN_TIME_BETWEEN_BUFFER_REEVALUTATION_MS);
            m0Var3.nd0 = jSONObject.optInt(d.dom, 2);
            int iOptInt4 = jSONObject.optInt(d.don, 1);
            if (iOptInt4 != 1 && iOptInt4 != 2) {
                iOptInt4 = 1;
            }
            m0Var3.ndd = iOptInt4;
            int iOptInt5 = jSONObject.optInt(d.doo, 1);
            if (iOptInt5 <= 0) {
                iOptInt5 = 1;
            }
            m0Var3.ndm = iOptInt5;
            m0Var3.ndq = jSONObject.optInt(d.doq, 0);
            m0Var3.nm0 = jSONObject.optString(d.dq0, "");
            m0Var3.nmd = jSONObject.optInt("s2s_sw", 2);
            JSONArray jSONArrayOptJSONArray5 = jSONObject.optJSONArray(d.dqm);
            if (jSONArrayOptJSONArray5 != null && (length = jSONArrayOptJSONArray5.length()) > 0) {
                ArrayList arrayList3 = new ArrayList();
                for (int i14 = 0; i14 < length; i14++) {
                    Object obj2 = jSONArrayOptJSONArray5.get(i14);
                    if (obj2 instanceof Integer) {
                        arrayList3.add((Integer) obj2);
                    }
                }
                m0Var3.ndn = arrayList3;
            }
            m0Var3.nmm = jSONObject.optInt(d.dqn, 1);
            int[] iArr = {1, 2, 3, 4, 5};
            if (!jSONObject.isNull(d.dqo) && (jSONArrayOptJSONArray = jSONObject.optJSONArray(d.dqo)) != null && jSONArrayOptJSONArray.length() > 0) {
                try {
                    iArr = new int[jSONArrayOptJSONArray.length()];
                    for (int i15 = 0; i15 < jSONArrayOptJSONArray.length(); i15++) {
                        iArr[i15] = jSONArrayOptJSONArray.getInt(i15);
                    }
                } catch (Exception unused5) {
                    iArr = new int[]{1, 2, 3, 4, 5};
                }
            }
            m0Var3.nmn = iArr;
            m0Var3.mmo = jSONObject.optInt(d.dqq, 1);
            int iOptInt6 = jSONObject.optInt(d.m00, 2);
            if (iOptInt6 == 1) {
                m0Var3.mmq = dd.d(jSONObject.optString(d.m0d));
            } else {
                m0Var3.mmq = null;
            }
            m0Var3.mdn = jSONObject.optInt(d.m0m, 0);
            m0Var3.nmo = jSONObject.optInt(d.m0n, 2);
            m0Var3.ndo = jSONObject.optInt(d.m0o);
            m0Var3.nn0 = jSONObject.optInt(d.m0q, Common.REPORT_EVENT_MAX_TIMEOUT);
            m0Var3.nnd = jSONObject.optString(d.md0);
            JSONObject jSONObjectOptJSONObject2 = jSONObject.optJSONObject(d.mdm);
            if (jSONObjectOptJSONObject2 != null && jSONObjectOptJSONObject2.length() > 0) {
                d0q d0qVar = new d0q();
                d0qVar.d(jSONObject.optString(d.mdd));
                d0qVar.n(jSONObjectOptJSONObject2.optString(d.mdn));
                d0qVar.d(jSONObjectOptJSONObject2.optInt(d.mdo));
                d0qVar.m(jSONObjectOptJSONObject2.optInt(d.mdq));
                m0Var3.nnm = d0qVar;
            }
            com.thinkup.core.common.nn.nd.d(m0Var3.dom);
            m0Var3.nnn = jSONObject.optInt(d.mm0, -1);
            JSONArray jSONArrayOptJSONArray6 = jSONObject.optJSONArray(d.mmd);
            if (jSONArrayOptJSONArray6 == null) {
                jSONArrayOptJSONArray6 = new JSONArray();
            }
            m0Var3.n0m = jSONArrayOptJSONArray6;
            JSONArray jSONArrayOptJSONArray7 = jSONObject.optJSONArray(d.mmm);
            if (jSONArrayOptJSONArray7 == null) {
                jSONArrayOptJSONArray7 = new JSONArray();
            }
            m0Var3.n0n = jSONArrayOptJSONArray7;
            m0Var3.nno = jSONObject.optInt(d.mmn, -1);
            m0Var3.nnq = jSONObject.optInt(d.mmo, -1);
            m0Var3.no0 = jSONObject.optInt(d.mmq, 2000);
            m0Var3.nod = qo.d(jSONObject);
            m0Var3.nom = com.thinkup.core.common.nn.mo.m(jSONObject.optJSONArray(d.mn0));
            JSONObject jSONObjectOptJSONObject3 = jSONObject.optJSONObject(d.mnd);
            if (jSONObjectOptJSONObject3 != null) {
                m0Var3.non = jSONObjectOptJSONObject3;
            }
            m0Var3.noo = jSONObject.optInt(d.mnm, 1);
            m0Var3.noq = jSONObject.optInt(d.mnn, 10000);
            m0Var3.nq0 = jSONObject.optInt(d.mno, 3000);
            m0Var3.nqq = jSONObject.optInt(d.mnq, 2);
            JSONObject jSONObjectOptJSONObject4 = jSONObject.optJSONObject(d.mo0);
            if (jSONObjectOptJSONObject4 != null) {
                m0Var3.nqd = jSONObjectOptJSONObject4;
            }
            m0Var3.nqm = jSONObject.optInt(d.mod, 2);
            m0Var3.mnm = jSONObject.optInt("req_ug_type_v2", -1);
            m0Var3.mnn = jSONObject.optInt("device_perf_sw", 0);
            m0Var3.mno = jSONObject.optInt("max_cached_num", -1);
            m0Var3.mnq = jSONObject.optLong("wf_req_wait_t", 0L);
            m0Var3.mo0 = jSONObject.optLong("c2s_req_wait_t", 0L);
            m0Var3.mod = jSONObject.optLong("s2s_req_wait_t", 0L);
            m0Var3.mom = jSONObject.optInt("auto_req_type", -1);
            m0Var3.mon = jSONObject.optInt("auto_refresh_type_v2", -1);
            m0Var3.o00 = jSONObject.optLong("pl_refresh_timeout", 5000L);
            m0Var3.d0(jSONObject.optInt("strategy_domain_type_key", 0));
            m0Var3.om0 = jSONObject.optInt("wait_bid_load_sw", 2);
            m0Var3.omd = jSONObject.optLong("wait_bid_cb_t", 5000L);
            JSONArray jSONArrayOptJSONArray8 = jSONObject.optJSONArray("anr_dyna_st");
            if (jSONArrayOptJSONArray8 != null && jSONArrayOptJSONArray8.length() > 0) {
                ArrayList arrayList4 = new ArrayList();
                for (int i16 = 0; i16 < jSONArrayOptJSONArray8.length(); i16++) {
                    com.thinkup.core.common.m.o oVarD = com.thinkup.core.common.m.o.d(jSONArrayOptJSONArray8.optJSONObject(i16));
                    if (oVarD != null) {
                        arrayList4.add(oVarD);
                    }
                }
                m0Var3.o0d = arrayList4;
            }
            if (iOptInt6 == 1) {
                m0Var3.n0o = d0.d(jSONObject.optJSONObject(d.moo));
            } else {
                m0Var2 = null;
                m0Var3.n0o = null;
            }
            return m0Var3;
        } catch (Exception unused6) {
            return null;
        }
    }

    private void n(int i10) {
        this.mnm = i10;
    }

    private void o(int i10) {
        this.mnn = i10;
    }

    private JSONObject o00() {
        return this.dqq;
    }

    private String o0d() {
        return this.o0o;
    }

    private dmq o0m() {
        return this.dmm;
    }

    private List<dmn> o0n() {
        return this.dmd;
    }

    private String o0o() {
        return this.ddm;
    }

    private int o0q() {
        return this.f73954q0;
    }

    private int od0() {
        return this.f73938mm;
    }

    private int odd() {
        return this.f73943nd;
    }

    private int odm() {
        return this.f73944nm;
    }

    private int odn() {
        return this.f73945nn;
    }

    private m0m odo() {
        return this.f73956qm;
    }

    private long odq() {
        return this.o0q;
    }

    private String om0() {
        return this.dnn;
    }

    private long omd() {
        return this.doo;
    }

    private long omm() {
        return this.doq;
    }

    private int omn() {
        return this.odn;
    }

    private int omo() {
        return this.odo;
    }

    private int omq() {
        return this.m0o;
    }

    private int on0() {
        return this.mdd;
    }

    private int[] ond() {
        return this.nmn;
    }

    private int onm() {
        return this.ndo;
    }

    private m0q onn() {
        List<m0q> listD = nn.d(this, this.mqd);
        if (listD.size() > 0) {
            return listD.get(0);
        }
        return null;
    }

    private String ono() {
        return this.nnd;
    }

    public final Map<String, Object> d(String str, String str2, m0q m0qVar, TUAdRequest tUAdRequest) {
        com.thinkup.core.common.dm.mn mnVar;
        oo ooVarDmn;
        int iD;
        Map<String, Object> mapNd = m0qVar.nd();
        boolean zM = com.thinkup.core.common.nn.mn.m();
        m mVarM = o.d(com.thinkup.core.common.o.nd.m().dd()).m(com.thinkup.core.common.o.nd.m().mo());
        if (!TextUtils.isEmpty(m0qVar.d0m())) {
            mapNd.put("payload", m0qVar.d0m());
            if (m0qVar.dmn() != null && !TextUtils.isEmpty(m0qVar.dmn().mq())) {
                mapNd.put("bidtoken", m0qVar.dmn().mq());
            }
        }
        if (!TextUtils.isEmpty(m0qVar.dnm())) {
            mapNd.put("custom_inhouse_bid_result", m0qVar.dnm());
        }
        boolean z10 = false;
        mapNd.put("app_ccpa_switch", Boolean.valueOf(mVarM.nm() == 3));
        if (mVarM.nn() == 2 && zM) {
            z10 = true;
        }
        mapNd.put("app_coppa_switch", Boolean.valueOf(z10));
        mapNd.put("gdpr_consent", Boolean.valueOf(com.thinkup.core.common.o.nn.d(com.thinkup.core.common.o.nd.m().dd()).m(m0qVar.mm())));
        if (m0qVar.mm() != 66 || m0qVar.dmn() == null || (iD = m0qVar.dmn().d(this.f73949od)) < 0) {
            mapNd.put("ad_type", Integer.valueOf(m0qVar.don()));
        } else {
            mapNd.put("ad_type", Integer.valueOf(iD));
        }
        if (this.m0o == 1) {
            mapNd.put(TUAdConst.NETWORK_REQUEST_PARAMS_KEY.MEDIATION_WF_ID, str + "_" + this.f73957qn + "_" + this.f73946no + "_" + str2);
        }
        mapNd.put(TUAdConst.NETWORK_REQUEST_PARAMS_KEY.STACK_INFO, com.thinkup.core.common.nm.d().m(str));
        if (m0qVar.mm() == 28 && (ooVarDmn = m0qVar.dmn()) != null) {
            mapNd.put("thinkup_gsp", Double.valueOf(com.thinkup.core.common.nn.mn.d(m0qVar) * ooVarDmn.f68651m0));
        }
        String strMd = com.thinkup.core.common.nn.m0.md();
        if (!TextUtils.isEmpty(strMd)) {
            mapNd.put(TUAdConst.KEY.WECHAT_APPID, strMd);
        }
        if (m0qVar.mm() == 35 || m0qVar.od() == 3 || m0qVar.od() == 4 || m0qVar.od() == 7) {
            no noVar = new no();
            noVar.f68528dn = m0qVar.d0m();
            noVar.f106do = m0qVar.mm();
            noVar.f68542q = m0qVar.qn();
            noVar.f68525d0 = str2;
            noVar.f68524d = str;
            noVar.f68537n = this.f73957qn;
            noVar.f68541o = this.f73946no;
            noVar.f68530m = this.f73949od;
            noVar.f68529dq = m0qVar.mn();
            if (tUAdRequest != null) {
                noVar.f68532md = tUAdRequest.getChannelSource();
            }
            noVar.f68534mn = m0qVar.n0();
            oo ooVarDmn2 = m0qVar.dmn();
            if (ooVarDmn2 != null) {
                noVar.f68533mm = ooVarDmn2.d(this.f73949od);
                noVar.f68527dm = ooVarDmn2.nq();
                noVar.f68526dd = ooVarDmn2.getOriginRequestId();
            } else {
                noVar.f68533mm = -1;
            }
            noVar.f68531m0 = ooVarDmn2 != null ? ooVarDmn2.f68646dd : "";
            noVar.f68536mq = ooVarDmn2 != null ? ooVarDmn2.f68647dm : "";
            if (m0qVar.mm() == 35) {
                noVar.f68540nm = this.dmm;
            } else {
                noVar.f68540nm = don.nn(this.o0o);
            }
            nq nqVar = noVar.f68540nm;
            if (nqVar != null) {
                nqVar.n0(this.f73949od);
            }
            noVar.f68535mo = ooVarDmn2 != null ? ooVarDmn2.f68645d0 : 0L;
            noVar.f68538n0 = this.odn;
            noVar.f68539nd = this.odo;
            try {
                mapNd.put(com.thinkup.core.bridge.d.C0834d.f67344o, n0n());
                com.thinkup.core.common.o.nd ndVarM = com.thinkup.core.common.o.nd.m();
                com.thinkup.core.bridge.entity.q qVar = new com.thinkup.core.bridge.entity.q();
                com.thinkup.core.bridge.entity.dd ddVar = new com.thinkup.core.bridge.entity.dd(noVar);
                com.thinkup.core.bridge.entity.d0 d0Var = new com.thinkup.core.bridge.entity.d0();
                com.thinkup.core.bridge.entity.n nVar = new com.thinkup.core.bridge.entity.n();
                if (m0qVar.dmn() != null) {
                    nVar = m0qVar.dmn().om();
                }
                qVar.d(ddVar);
                qVar.d(d0Var);
                qVar.d(nVar);
                mapNd.put(com.thinkup.core.bridge.d.C0834d.f67343n, com.thinkup.core.bridge.n.d(qVar));
                com.thinkup.core.bridge.entity.o oVar = new com.thinkup.core.bridge.entity.o();
                oVar.o(com.thinkup.core.common.nn.m0.dm());
                oVar.m(com.thinkup.core.common.nn.m0.qn());
                mapNd.put(com.thinkup.core.bridge.d.C0834d.f67341d, com.thinkup.core.bridge.n.d(oVar));
                com.thinkup.core.bridge.entity.d dVar = new com.thinkup.core.bridge.entity.d();
                dVar.d();
                dVar.d(com.thinkup.core.common.nn.mn.d());
                dVar.m(com.thinkup.core.common.o.nd.m().mo());
                dVar.n(com.thinkup.core.common.o.nd.m().mq());
                mapNd.put(com.thinkup.core.bridge.d.C0834d.f67342m, com.thinkup.core.bridge.n.d(dVar));
                TUUserDeviceInfo tUUserDeviceInfoDd0 = ndVarM.dd0();
                if (tUUserDeviceInfoDd0 != null) {
                    mapNd.put(TUAdConst.NETWORK_REQUEST_PARAMS_KEY.ADX_USER_DEVICE_INFO, tUUserDeviceInfoDd0);
                }
                String[] strArrD0 = ndVarM.d0();
                if (strArrD0 != null && strArrD0.length > 0) {
                    mapNd.put(TUAdConst.NETWORK_REQUEST_PARAMS_KEY.ADX_DENNY_DEVICE_INFO, strArrD0);
                }
                mapNd.put(TUAdConst.NETWORK_REQUEST_PARAMS_KEY.ADX_APP_ID, ndVarM.mo());
                mapNd.put(TUAdConst.NETWORK_REQUEST_PARAMS_KEY.ADX_APP_KEY, ndVarM.mq());
                mapNd.put(TUAdConst.NETWORK_REQUEST_PARAMS_KEY.ADX_PLACEMENT_ID, noVar.f68524d);
                mapNd.put(TUAdConst.NETWORK_REQUEST_PARAMS_KEY.ADX_SYSTEM_DEV_FRAMEWORK_TYPE, com.thinkup.core.common.nn.m0.dq());
                Location locationNm = ndVarM.nm();
                if (locationNm != null) {
                    mapNd.put(TUAdConst.NETWORK_REQUEST_PARAMS_KEY.ADX_LOCATION, locationNm);
                }
                mapNd.put(TUAdConst.NETWORK_REQUEST_PARAMS_KEY.ADX_WX_INSTALL_STATUS, Boolean.valueOf(ndVarM.nd()));
                mapNd.put(TUAdConst.NETWORK_REQUEST_PARAMS_KEY.ADX_DELAY_INSPECT_TIME, Long.valueOf(TUSDKGlobalSetting.mDelayInspectTime));
                mapNd.put(TUAdConst.NETWORK_REQUEST_PARAMS_KEY.ADX_INSPECT_INTERVAL, Long.valueOf(TUSDKGlobalSetting.mInspectInterval));
                mapNd.put(TUAdConst.NETWORK_REQUEST_PARAMS_KEY.ADX_ENABLE_GET_RUNNING_APP_PROCESSES, Boolean.valueOf(!TUSDKGlobalSetting.isDenyApi_getRunningAppProcesses()));
                mapNd.put(TUAdConst.NETWORK_REQUEST_PARAMS_KEY.ADX_ENABLE_GET_DEVICE_INFO_IN_BG, Boolean.valueOf(TUSDKGlobalSetting.enableGetDeviceInfoInBg));
                mapNd.put(TUAdConst.NETWORK_REQUEST_PARAMS_KEY.ADX_EXCLUDE_PKG_LIST, com.thinkup.core.common.o.nd.m().dq());
            } catch (Throwable unused) {
            }
        }
        if (m0qVar.mm() == 50 && this.mdd == 1) {
            mapNd.put("pangle_request_id", str2);
        }
        TUAdConst.CURRENCY currency = TUAdConst.CURRENCY.RMB;
        if (TextUtils.equals(m0qVar.mdn(), com.thinkup.core.common.o.dn.dq.f72682d)) {
            currency = TUAdConst.CURRENCY.USD;
        }
        mapNd.put("gm_currency", currency);
        if (m0qVar.mm() == 2) {
            mapNd.put("thinkup_g_ra_label", m0qVar.mn0());
            mapNd.put("admob_init_mode", Integer.valueOf(mVarM.dqo()));
            mapNd.put("admob_adsource_id", m0qVar.qn());
            if (m0qVar.moo() == 1 && (mnVar = this.mn0) != null) {
                mapNd.put("admob_hybrid_status", Boolean.valueOf(mnVar.d()));
                if (this.mn0.d() || this.mn0.f68428m) {
                    mapNd.put("mediation_request_id", str2);
                }
            }
        }
        if (m0qVar.don() == 0) {
            mapNd.put(d.dqn, Integer.valueOf(this.nmm));
            if (m0qVar.mnm() == null) {
                mapNd.put(d.dqo, this.nmn);
            } else {
                mapNd.put(d.dqo, m0qVar.mnm());
            }
            mapNd.put("nw_firm_id", Integer.valueOf(m0qVar.mm()));
        }
        JSONObject jSONObjectDdn = mVarM.ddn();
        if (jSONObjectDdn != null) {
            try {
                String string = jSONObjectDdn.getString(String.valueOf(m0qVar.mm()));
                if (!TextUtils.isEmpty(string)) {
                    mapNd.put("network_ext", string);
                }
            } catch (Exception unused2) {
            }
        }
        JSONArray jSONArrayMnq = m0qVar.mnq();
        if (jSONArrayMnq != null && jSONArrayMnq.length() > 0) {
            mapNd.put("web_content_urls", jSONArrayMnq);
        }
        int iMo0 = m0qVar.mo0();
        if (iMo0 > 0) {
            mapNd.put(com.thinkup.core.common.dq.mdd, Integer.valueOf(iMo0));
        }
        mapNd.put("ad_s_reqf_mode", Integer.valueOf(m0qVar.mod()));
        mapNd.put("ad_format", Integer.valueOf(this.f73949od));
        mapNd.put(TUAdConst.NETWORK_REQUEST_PARAMS_KEY.GM_REFRESH_KEY, Boolean.valueOf(mVarM.dqm()));
        if (m0qVar.mm() == 8) {
            mapNd.put("load_params_switch", Integer.valueOf(m0qVar.mqo()));
        }
        if (m0qVar.mm() == 39) {
            mapNd.put("bid_max_time", Long.valueOf(m0qVar.n0q()));
            mapNd.put("splash_type", Integer.valueOf(m0qVar.ndm()));
        }
        if (m0qVar.mm() == 77) {
            mapNd.put("mediation_request_id", str2);
        }
        if (m0qVar.mm() == 22) {
            mapNd.put("bd_imp_type", Integer.valueOf(m0qVar.dqo()));
        }
        mapNd.put("c_b_i_r", Integer.valueOf(m0qVar.q()));
        return mapNd;
    }

    public final long d0() {
        return this.mod;
    }

    public final long d00() {
        return this.dq0;
    }

    public final JSONArray d0d() {
        return this.n0d;
    }

    public final long d0m() {
        return this.don;
    }

    public final double d0n() {
        return this.dom;
    }

    public final String d0o() {
        return this.do0;
    }

    public final String d0q() {
        return this.dod;
    }

    public final JSONArray dd0() {
        return this.mqo;
    }

    public final long ddd() {
        return this.dnq;
    }

    public final String ddm() {
        return this.dnm;
    }

    public final String ddn() {
        return this.dnd;
    }

    public final List<String> ddo() {
        return this.dn0;
    }

    public final double ddq() {
        return this.dmo;
    }

    public final String dm0() {
        return this.dmq;
    }

    public final long dmd() {
        return this.dmn;
    }

    public final JSONArray dmm() {
        return this.mqn;
    }

    public final String dmn() {
        return this.o0n;
    }

    public final JSONArray dmo() {
        return this.mqd;
    }

    public final long dmq() {
        return this.ddd;
    }

    public final Map<String, TURewardInfo> dn0() {
        return this.d0n;
    }

    public final String dnd() {
        return this.d0q;
    }

    public final String dnm() {
        return this.dd0;
    }

    public final TURewardInfo dnn() {
        return this.d0o;
    }

    public final Map<String, Object> dno() {
        return this.d0m;
    }

    public final int dnq() {
        return this.d00;
    }

    /* JADX INFO: renamed from: do, reason: not valid java name */
    public final dd m319do() {
        return this.mmq;
    }

    public final int do0() {
        return this.f73957qn;
    }

    public final String dod() {
        return this.f73958qo;
    }

    public final int dom() {
        return this.f73959qq;
    }

    public final long don() {
        return this.f73952oo;
    }

    public final long doo() {
        return this.f73953oq;
    }

    public final String doq() {
        return this.f73955qd;
    }

    public final d0 dq() {
        return this.n0o;
    }

    public final int dq0() {
        return this.f73950om;
    }

    public final long dqd() {
        return this.f73951on;
    }

    public final int dqm() {
        return this.f73949od;
    }

    public final long dqn() {
        return this.f73935dq;
    }

    public final long dqo() {
        return this.f73936m0;
    }

    public final int dqq() {
        return this.f73937md;
    }

    public final int m0() {
        return this.mmo;
    }

    public final int m00() {
        return this.f73939mn;
    }

    public final long m0d() {
        return this.f73940mo;
    }

    public final long m0m() {
        return this.f73941mq;
    }

    public final long m0n() {
        return this.f73942n0;
    }

    public final int m0o() {
        return this.f73946no;
    }

    public final JSONArray m0q() {
        return this.moo;
    }

    public final int md() {
        return this.mdm;
    }

    public final JSONArray md0() {
        return this.moq;
    }

    public final JSONArray mdd() {
        return this.mq0;
    }

    public final JSONArray mdm() {
        return this.mqm;
    }

    public final long mdn() {
        return this.ddn;
    }

    public final int mdo() {
        return this.ddo;
    }

    public final long mdq() {
        return this.ddq;
    }

    public final List<Integer> mm() {
        return this.ndn;
    }

    public final int mm0() {
        return this.dm0;
    }

    public final String mmd() {
        return this.dno;
    }

    public final JSONArray mmm() {
        return this.mqq;
    }

    public final JSONArray mmn() {
        return this.n00;
    }

    public final int mmo() {
        return this.odm;
    }

    public final int mmq() {
        return this.odd;
    }

    public final int mn() {
        return this.ndd;
    }

    public final double mn0() {
        return this.od0;
    }

    public final int mnd() {
        return this.m0n;
    }

    public final JSONObject mnm() {
        return this.odq;
    }

    public final boolean mnn() {
        return this.mdn == 1;
    }

    public final boolean mno() {
        return this.mdo == 1;
    }

    public final boolean mnq() {
        return this.mdn == 2;
    }

    public final int mo() {
        return this.ndm;
    }

    public final boolean mo0() {
        return this.mdn == 0;
    }

    public final int mod() {
        return this.mdq;
    }

    public final int mom() {
        return this.mm0;
    }

    public final int mon() {
        return this.mmd;
    }

    public final double[][] moo() {
        return this.mmm;
    }

    public final int moq() {
        return this.mdn;
    }

    public final int mq() {
        return this.nd0;
    }

    public final int mq0() {
        return this.mmn;
    }

    public final int mqd() {
        return this.nmm;
    }

    public final boolean mqm() {
        return this.nmo == 1;
    }

    public final com.thinkup.core.common.dm.mn mqn() {
        return this.mn0;
    }

    public final boolean mqo() {
        return this.nd0 == 1;
    }

    public final boolean mqq() {
        return this.ndo == 1;
    }

    public final int n0() {
        return this.nd0 == 1 ? 2 : 1;
    }

    public final List<com.thinkup.core.common.m.o> n00() {
        return this.o0d;
    }

    public final d0q n0d() {
        return this.nnm;
    }

    public final boolean n0m() {
        return this.f73938mm == 1;
    }

    public final long nd() {
        return this.n0q;
    }

    public final boolean ndm() {
        return System.currentTimeMillis() - this.o0q > this.f73935dq;
    }

    public final boolean ndn() {
        System.currentTimeMillis();
        return System.currentTimeMillis() - this.o0q > ((long) this.nn0);
    }

    public final boolean ndo() {
        return !TextUtils.isEmpty(this.nm0);
    }

    public final Boolean ndq() {
        return this.nmq;
    }

    public final TUAdRequest nm() {
        return this.f73934dn;
    }

    public final int nm0() {
        return this.nn0;
    }

    public final int nmd() {
        return this.nnn;
    }

    public final boolean nmm() {
        return this.mnd;
    }

    public final void nmn() {
        this.mnd = true;
    }

    public final JSONArray nmo() {
        return this.n0m;
    }

    public final JSONArray nmq() {
        return this.n0n;
    }

    public final int nn() {
        return this.ndq;
    }

    public final int nn0() {
        return this.nno;
    }

    public final int nnd() {
        return this.nnq;
    }

    public final int nnm() {
        return this.no0;
    }

    public final qo nnn() {
        return this.nod;
    }

    public final List<String> nno() {
        return this.nom;
    }

    public final JSONObject nnq() {
        return this.non;
    }

    public final String no() {
        return this.nm0;
    }

    public final int no0() {
        return this.noo;
    }

    public final int nod() {
        return this.noq;
    }

    public final int nom() {
        return this.nq0;
    }

    public final int non() {
        return this.nqq;
    }

    public final JSONObject noo() {
        return this.nqd;
    }

    public final int noq() {
        return this.nqm;
    }

    public final int nq() {
        return this.nmd;
    }

    public final long nq0() {
        return this.nqn;
    }

    public final int nqd() {
        return this.nqo;
    }

    public final boolean nqm() {
        int i10 = this.nqo;
        return i10 == 2 || i10 == 5;
    }

    public final long nqn() {
        return this.o00;
    }

    public final boolean nqo() {
        return this.om0 == 1;
    }

    public final long nqq() {
        return this.omd;
    }

    public final Map<String, m0q> o0() {
        return this.f73948o0;
    }

    public final List<m0q> od() {
        return this.f73947nq;
    }

    public final int om() {
        return this.md0;
    }

    public final List<Integer> on() {
        return this.m0q;
    }

    public final String oo() {
        return this.m0m;
    }

    public final String oq() {
        return this.m0d;
    }

    public final long q() {
        return this.mo0;
    }

    public final JSONObject q0() {
        return this.m00;
    }

    public final int qd() {
        return this.o0m;
    }

    public final long qm() {
        return this.dqo;
    }

    public final int qn() {
        return this.dqn;
    }

    public final int qo() {
        int i10 = this.mnm;
        if (i10 != -1 && this.mnn == 1) {
            this.dqd = i10;
        }
        return this.dqd;
    }

    public final int qq() {
        int i10 = this.dqd;
        if (i10 == 1) {
            return this.f73939mn;
        }
        if (i10 != 2) {
            return 1;
        }
        return this.dqm;
    }

    private void d0(long j10) {
        this.dq0 = j10;
    }

    private void d00(int i10) {
        this.dm0 = i10;
    }

    private void d0d(int i10) {
        this.odm = i10;
    }

    private void d0m(int i10) {
        this.odd = i10;
    }

    private void d0n(int i10) {
        this.odn = i10;
    }

    private void d0o(int i10) {
        this.odo = i10;
    }

    private void d0q(int i10) {
        this.m0n = i10;
    }

    private void dd0(int i10) {
        this.m0o = i10;
    }

    private void ddd(int i10) {
        this.mdd = i10;
    }

    private void ddm(int i10) {
        this.mdo = i10;
    }

    private void ddn(int i10) {
        this.mdq = i10;
    }

    private void ddo(int i10) {
        this.mm0 = i10;
    }

    private void ddq(int i10) {
        this.mmd = i10;
    }

    private void dm0(int i10) {
        this.mmn = i10;
    }

    private void dmd(int i10) {
        this.nmm = i10;
    }

    private void dmm(int i10) {
        this.nmo = i10;
    }

    private void dmn(int i10) {
        this.ndo = i10;
    }

    private void dmo(int i10) {
        this.nn0 = i10;
    }

    private void dmq(int i10) {
        this.nnn = i10;
    }

    private void dn0(int i10) {
        this.nno = i10;
    }

    private void dnd(int i10) {
        this.nnq = i10;
    }

    private void dnm(int i10) {
        this.no0 = i10;
    }

    private void dnn(int i10) {
        this.noo = i10;
    }

    private void dno(int i10) {
        this.noq = i10;
    }

    private void dnq(int i10) {
        this.nq0 = i10;
    }

    /* JADX INFO: renamed from: do, reason: not valid java name */
    private void m315do(int i10) {
        this.mmo = i10;
    }

    private void do0(int i10) {
        this.nqq = i10;
    }

    private void dod(int i10) {
        this.nqm = i10;
    }

    private void dom(int i10) {
        this.om0 = i10;
    }

    private void dq(int i10) {
        this.mdm = i10;
    }

    private void m0(int i10) {
        this.ndd = i10;
    }

    private void md(int i10) {
        this.ndm = i10;
    }

    private void mm(int i10) {
        this.nd0 = i10;
    }

    private void mn(int i10) {
        this.ndq = i10;
    }

    private void mo(int i10) {
        this.nmd = i10;
    }

    private void mq(int i10) {
        this.md0 = i10;
    }

    private void nd(int i10) {
        this.dqn = i10;
    }

    private void nm(int i10) {
        this.dqd = i10;
    }

    private void nn(int i10) {
        this.dqm = i10;
    }

    private void no(int i10) {
        this.d00 = i10;
    }

    private void nq(int i10) {
        this.f73957qn = i10;
    }

    private void o0(int i10) {
        this.f73959qq = i10;
    }

    private void od(int i10) {
        this.f73954q0 = i10;
    }

    private void om(int i10) {
        this.f73950om = i10;
    }

    private void on(int i10) {
        this.f73949od = i10;
    }

    private void oo(int i10) {
        this.f73937md = i10;
    }

    private void oq(int i10) {
        this.f73938mm = i10;
    }

    private void q(String str) {
        this.m0d = str;
    }

    private void q0(int i10) {
        this.f73939mn = i10;
    }

    private void qd(int i10) {
        this.f73943nd = i10;
    }

    private void qm(int i10) {
        this.f73944nm = i10;
    }

    private void qn(int i10) {
        this.f73945nn = i10;
    }

    public final int dd() {
        return this.mom;
    }

    public final int dm() {
        return this.mon;
    }

    public final String dn() {
        return this.f251do;
    }

    public final int n() {
        return this.mno;
    }

    public final long o() {
        return this.mnq;
    }

    private void d0(String str) {
        this.do0 = str;
    }

    private void dd(long j10) {
        this.don = j10;
    }

    private void dm(long j10) {
        this.dnq = j10;
    }

    private void dn(String str) {
        this.dnd = str;
    }

    /* JADX INFO: renamed from: do, reason: not valid java name */
    private void m317do(String str) {
        this.dmq = str;
    }

    private void dq(String str) {
        this.o0n = str;
    }

    private void m0(String str) {
        this.o0o = str;
    }

    private void md(String str) {
        this.ddm = str;
    }

    private void mm(String str) {
        this.d0q = str;
    }

    private void mn(String str) {
        this.dd0 = str;
    }

    private void mo(String str) {
        this.f73958qo = str;
    }

    private void mq(String str) {
        this.f73955qd = str;
    }

    private void n(long j10) {
        this.mod = j10;
    }

    private void nd(long j10) {
        this.o0q = j10;
    }

    private void nm(long j10) {
        this.ddn = j10;
    }

    private void nn(long j10) {
        this.ddq = j10;
    }

    private void no(long j10) {
        this.doo = j10;
    }

    private void nq(long j10) {
        this.doq = j10;
    }

    private void o(long j10) {
        this.n0q = j10;
    }

    private void o0(long j10) {
        this.o00 = j10;
    }

    private void od(long j10) {
        this.omd = j10;
    }

    private void q(JSONObject jSONObject) {
        this.dqq = jSONObject;
    }

    private void d0(JSONArray jSONArray) {
        this.moq = jSONArray;
    }

    private void dd(String str) {
        this.dod = str;
    }

    private void dm(String str) {
        this.dnm = str;
    }

    private void dn(long j10) {
        this.dmn = j10;
    }

    /* JADX INFO: renamed from: do, reason: not valid java name */
    private void m316do(long j10) {
        this.ddd = j10;
    }

    private void dq(long j10) {
        this.f73952oo = j10;
    }

    private void m0(long j10) {
        this.f73953oq = j10;
    }

    private void md(long j10) {
        this.f73951on = j10;
    }

    private void mm(long j10) {
        this.f73935dq = j10;
    }

    private void mn(long j10) {
        this.f73936m0 = j10;
    }

    private void mo(long j10) {
        this.f73940mo = j10;
    }

    private void mq(long j10) {
        this.f73941mq = j10;
    }

    private void n(String str) {
        this.nm0 = str;
    }

    private void nd(String str) {
        this.dno = str;
    }

    private void nm(String str) {
        this.nnd = str;
    }

    private void o(String str) {
        this.m0m = str;
    }

    private void q(long j10) {
        this.dqo = j10;
    }

    private void d0(JSONObject jSONObject) {
        this.odq = jSONObject;
    }

    private void dd(JSONArray jSONArray) {
        this.mq0 = jSONArray;
    }

    private void dm(JSONArray jSONArray) {
        this.mqm = jSONArray;
    }

    private void dn(JSONArray jSONArray) {
        this.mqq = jSONArray;
    }

    /* JADX INFO: renamed from: do, reason: not valid java name */
    private void m318do(JSONArray jSONArray) {
        this.n00 = jSONArray;
    }

    private void dq(JSONArray jSONArray) {
        this.n0m = jSONArray;
    }

    private void m0(JSONArray jSONArray) {
        this.n0n = jSONArray;
    }

    private void n(List<Integer> list) {
        this.m0q = list;
    }

    private void o(List<String> list) {
        this.dn0 = list;
    }

    private void q(List<dmn> list) {
        this.dmd = list;
    }

    private void d0(List<com.thinkup.core.common.m.o> list) {
        this.o0d = list;
    }

    private void dd(List<String> list) {
        this.nom = list;
    }

    private void dm(JSONObject jSONObject) {
        this.nqd = jSONObject;
    }

    private void n(JSONArray jSONArray) {
        this.mqn = jSONArray;
    }

    private void o(JSONArray jSONArray) {
        this.mqd = jSONArray;
    }

    private void q(JSONArray jSONArray) {
        this.moo = jSONArray;
    }

    private void dd(JSONObject jSONObject) {
        this.non = jSONObject;
    }

    private void n(Map<String, Object> map) {
        this.d0m = map;
    }

    private void n0(long j10) {
        this.f73942n0 = j10;
    }

    private void n(double d10) {
        this.od0 = d10;
    }

    private void n0(String str) {
        this.dnn = str;
    }

    private void n0(int i10) {
        this.o0m = i10;
    }

    private void qo(int i10) {
        this.f73946no = i10;
    }

    private void qq(int i10) {
        this.ddo = i10;
    }

    private void d(long j10) {
        this.mnq = j10;
    }

    private void d(dd ddVar) {
        this.mmq = ddVar;
    }

    private void d(d0 d0Var) {
        this.n0o = d0Var;
    }

    private void d(List<Integer> list) {
        this.ndn = list;
    }

    public final void d(TUAdRequest tUAdRequest) {
        this.f73934dn = tUAdRequest;
    }

    private void d(Map<String, m0q> map) {
        this.f73948o0 = map;
    }

    public final m0q d(String str) {
        Map<String, m0q> map = this.f73948o0;
        if (map != null) {
            return map.get(str);
        }
        return null;
    }

    private void d(JSONObject jSONObject) {
        this.m00 = jSONObject;
    }

    private void d(JSONArray jSONArray) {
        this.n0d = jSONArray;
    }

    private void d(double d10) {
        this.dom = d10;
    }

    private void d(dmq dmqVar) {
        this.dmm = dmqVar;
    }

    private void d(TURewardInfo tURewardInfo) {
        this.d0o = tURewardInfo;
    }

    private void d(m0m m0mVar) {
        this.f73956qm = m0mVar;
    }

    private void d(double[][] dArr) {
        this.mmm = dArr;
    }

    public final void d(int i10) {
        this.mdn = i10;
    }

    private void d(int[] iArr) {
        this.nmn = iArr;
    }

    public static m0 d(String str, JSONObject jSONObject) {
        m0 m0VarM = m(str, jSONObject);
        if (m0VarM != null) {
            ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap();
            ArrayList arrayList = new ArrayList();
            nn.d(m0VarM, concurrentHashMap, arrayList);
            m0VarM.f73947nq = arrayList;
            m0VarM.f73948o0 = concurrentHashMap;
            com.thinkup.core.common.nn.nm.d();
        }
        return m0VarM;
    }

    private static List<dmn> d(String str, String str2, long j10, dmq dmqVar) {
        ArrayList arrayList = new ArrayList();
        try {
            JSONArray jSONArray = new JSONArray(str);
            for (int i10 = 0; i10 < jSONArray.length(); i10++) {
                dmn dmnVar = new dmn();
                JSONObject jSONObjectOptJSONObject = jSONArray.optJSONObject(i10);
                dmnVar.m(jSONObjectOptJSONObject.optString("o_id"));
                dmnVar.n(jSONObjectOptJSONObject.optString(d.mdq));
                dmnVar.o(jSONObjectOptJSONObject.optString("t"));
                dmnVar.mn(jSONObjectOptJSONObject.optString("p_g"));
                dmnVar.q(jSONObjectOptJSONObject.optString("d"));
                dmnVar.d0(jSONObjectOptJSONObject.optString("ic_u"));
                dmnVar.dd(jSONObjectOptJSONObject.optString("im_u"));
                dmnVar.dm(jSONObjectOptJSONObject.optString("f_i_u"));
                dmnVar.dn(jSONObjectOptJSONObject.optString("a_c_u"));
                dmnVar.m235do(jSONObjectOptJSONObject.optString("c_t"));
                dmnVar.dq(jSONObjectOptJSONObject.optString("v_u"));
                dmnVar.m(jSONObjectOptJSONObject.optInt("l_t"));
                dmnVar.m0(jSONObjectOptJSONObject.optString("p_u"));
                dmnVar.md(jSONObjectOptJSONObject.optString("dl"));
                dmnVar.mm(jSONObjectOptJSONObject.optString("c_u"));
                dmnVar.oo(jSONObjectOptJSONObject.optString("ip_u"));
                dmnVar.oq(jSONObjectOptJSONObject.optString("t_u"));
                dmnVar.q0(jSONObjectOptJSONObject.optString("t_u_25"));
                dmnVar.qd(jSONObjectOptJSONObject.optString("t_u_50"));
                dmnVar.qm(jSONObjectOptJSONObject.optString("t_u_75"));
                dmnVar.qn(jSONObjectOptJSONObject.optString("t_u_100"));
                dmnVar.qo(jSONObjectOptJSONObject.optString("s_e_c_t_u"));
                dmnVar.qq(jSONObjectOptJSONObject.optString("c_t_u"));
                dmnVar.d00(jSONObjectOptJSONObject.optString("ip_n_u"));
                dmnVar.d0d(jSONObjectOptJSONObject.optString("c_n_u"));
                dmnVar.f68041n = jSONObjectOptJSONObject.optInt("o_a_d_c");
                dmnVar.f68042o = jSONObjectOptJSONObject.optLong("o_a_p");
                dmnVar.d(j10);
                dmnVar.d(jSONObjectOptJSONObject.optInt("unit_type"));
                dmnVar.o(jSONObjectOptJSONObject.optInt("c_m"));
                dmnVar.o0(jSONObjectOptJSONObject.optString("ext_h_pic"));
                dmnVar.od(jSONObjectOptJSONObject.optString("ext_big_h_pic"));
                dmnVar.om(jSONObjectOptJSONObject.optString("ext_rect_h_pic"));
                dmnVar.on(jSONObjectOptJSONObject.optString("ext_home_h_pic"));
                dmnVar.nq(str2);
                dmnVar.mo(jSONObjectOptJSONObject.optString("pub"));
                dmnVar.mq(jSONObjectOptJSONObject.optString("app_vc"));
                dmnVar.n0(jSONObjectOptJSONObject.optString("pvc"));
                dmnVar.nd(jSONObjectOptJSONObject.optString("pms"));
                dmnVar.d((nq) dmqVar);
                arrayList.add(dmnVar);
            }
            return arrayList;
        } catch (Throwable th2) {
            th2.printStackTrace();
            return arrayList;
        }
    }

    public final int d() {
        return this.mnm;
    }

    public final void d(Boolean bool) {
        this.nmq = bool;
    }

    private void d(d0q d0qVar) {
        this.nnm = d0qVar;
    }

    private void d(qo qoVar) {
        this.nod = qoVar;
    }

    private boolean d(m0 m0Var) {
        if (m0Var == null) {
            return true;
        }
        return (TextUtils.equals(this.f73955qd, m0Var.f73955qd) || n0o()) ? false : true;
    }

    private void m(long j10) {
        this.mo0 = j10;
    }

    public final int m() {
        return this.mnn;
    }

    private void m(List<m0q> list) {
        this.f73947nq = list;
    }

    private void m(JSONArray jSONArray) {
        this.mqo = jSONArray;
    }

    private void m(double d10) {
        this.dmo = d10;
    }

    private void m(Map<String, TURewardInfo> map) {
        this.d0n = map;
    }

    public final dmn m(String str) {
        List<dmn> list = this.dmd;
        if (list == null) {
            return null;
        }
        for (dmn dmnVar : list) {
            if (dmnVar.d0() == null) {
                dmnVar.d((nq) this.dmm);
            }
            if (TextUtils.equals(str, dmnVar.dm()) && !dmnVar.d(this.dmm)) {
                return dmnVar;
            }
        }
        return null;
    }

    public final void m(int i10) {
        this.nqo = i10;
    }
}