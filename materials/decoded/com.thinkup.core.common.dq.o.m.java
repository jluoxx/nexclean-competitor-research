package com.thinkup.core.common.dq.o;

import com.thinkup.core.api.bridge.ITUBaseAdAdapter;
import com.thinkup.core.common.dq;
import com.thinkup.core.common.nn.mo;
import java.util.Map;

/* JADX INFO: loaded from: classes7.dex */
public class m {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int f68882d = -1;

    /* JADX INFO: renamed from: d0, reason: collision with root package name */
    private int f68883d0;

    /* JADX INFO: renamed from: dd, reason: collision with root package name */
    private String f68884dd;

    /* JADX INFO: renamed from: dm, reason: collision with root package name */
    private ITUBaseAdAdapter f68885dm;

    /* JADX INFO: renamed from: dn, reason: collision with root package name */
    private int f68886dn;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private Map<String, Object> f68887m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private Map<String, Object> f68888n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private int f68889o;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private int f68890q;

    public m(Map<String, Object> map) {
        this.f68886dn = 0;
        this.f68887m = map;
        this.f68889o = mo.d(map, "ad_format", -1);
        this.f68890q = mo.d(map, "ad_type", -1);
        this.f68883d0 = mo.d(map, dq.mmn, 1);
        this.f68884dd = mo.d(map, dq.mmo, "");
        this.f68886dn = mo.d(map, "render_type", 0);
    }

    public final <T> T d(String str, T t10) {
        return (T) mo.d(this.f68887m, str, t10);
    }

    public final boolean d0() {
        return String.valueOf(this.f68889o).equals("2");
    }

    public final boolean dd() {
        return String.valueOf(this.f68889o).equals("4");
    }

    public final boolean dm() {
        return String.valueOf(this.f68889o).equals("3");
    }

    public final boolean dn() {
        return String.valueOf(this.f68889o).equals("1");
    }

    /* JADX INFO: renamed from: do, reason: not valid java name */
    public final boolean m249do() {
        return String.valueOf(this.f68889o).equals("0");
    }

    public final boolean dq() {
        int i10;
        int i11 = this.f68889o;
        return (i11 == -1 || (i10 = this.f68890q) == -1 || i11 == i10) ? false : true;
    }

    public final int m() {
        return this.f68890q;
    }

    public final boolean m0() {
        return dq() && this.f68890q == 0;
    }

    public final boolean md() {
        return dq() && this.f68890q == 4;
    }

    public final boolean mm() {
        return dq() && this.f68890q == 2;
    }

    public final boolean mn() {
        return dq() && this.f68890q == 3;
    }

    public final int mo() {
        return this.f68886dn;
    }

    public final Map<String, Object> mq() {
        return this.f68888n;
    }

    public final int n() {
        return this.f68883d0;
    }

    public final ITUBaseAdAdapter n0() {
        return this.f68885dm;
    }

    public final String o() {
        return this.f68884dd;
    }

    public final int q() {
        return this.f68889o;
    }

    private void m(int i10) {
        this.f68883d0 = i10;
    }

    private void n(int i10) {
        this.f68889o = i10;
    }

    public final Map<String, Object> d() {
        return this.f68887m;
    }

    private void d(int i10) {
        this.f68890q = i10;
    }

    private void d(String str) {
        this.f68884dd = str;
    }

    public final void d(Map<String, Object> map) {
        this.f68888n = map;
    }

    public final void d(ITUBaseAdAdapter iTUBaseAdAdapter) {
        this.f68885dm = iTUBaseAdAdapter;
    }
}