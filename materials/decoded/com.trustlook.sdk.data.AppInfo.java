package com.trustlook.sdk.data;

import android.content.Context;
import com.android.launcher3.AutoInstallsLayout;
import com.tradplus.ads.adapter.ErrorUtil;
import com.trustlook.sdk.Constants;
import java.io.Serializable;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes8.dex */
public class AppInfo implements Comparable<AppInfo>, Serializable {
    static final long serialVersionUID = 6639583737921199633L;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private String f76869a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private String f76870b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private String f76871c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private long f76872d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private boolean f76873e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private String f76874f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private String f76875g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private int f76876h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private String f76877i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private int f76878j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private String[] f76879k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private String[] f76880l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private String f76881m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private String f76882n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private int f76883o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private int f76884p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private int f76885q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private String f76886r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private boolean f76887s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private boolean f76888t;

    public AppInfo(String str, String str2) {
        this.f76871c = str;
        this.f76869a = str2;
        setScore(-1);
        setVid(ErrorUtil.TOKEN_CRASH);
        setFromStatic(false);
    }

    @Override // java.lang.Comparable
    public int compareTo(AppInfo appInfo) {
        if (this == appInfo) {
            return 0;
        }
        return appInfo.f76878j - this.f76878j;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof AppInfo) {
            return this.f76871c.equals(((AppInfo) obj).f76871c);
        }
        return false;
    }

    public String getApkPath() {
        return this.f76870b;
    }

    public String getAppName() {
        return this.f76886r;
    }

    public String[] getCategory() {
        return this.f76880l;
    }

    public String getCertSha1() {
        return this.f76874f;
    }

    public int getDeepScan() {
        return this.f76884p;
    }

    public int getDeepScanFinished() {
        return this.f76885q;
    }

    public boolean getInstalled() {
        return this.f76888t;
    }

    public String getMd5() {
        return this.f76869a;
    }

    public String getPackageName() {
        return this.f76871c;
    }

    public int getScore() {
        return this.f76878j;
    }

    public long getSizeInBytes() {
        return this.f76872d;
    }

    public String getSource() {
        return this.f76877i;
    }

    public String[] getSummary() {
        return this.f76879k;
    }

    public int getUpload() {
        return this.f76883o;
    }

    public int getVersionCode() {
        return this.f76876h;
    }

    public String getVersionName() {
        return this.f76875g;
    }

    public String getVid() {
        return this.f76882n;
    }

    public String getVirusName() {
        return this.f76881m;
    }

    public boolean isFromStatic() {
        return this.f76887s;
    }

    public boolean isSystemApp() {
        return this.f76873e;
    }

    public void setApkPath(String str) {
        this.f76870b = str;
    }

    public void setAppName(String str) {
        this.f76886r = str;
    }

    public void setCategory(String[] strArr) {
        this.f76880l = strArr;
    }

    public void setCertSha1(String str) {
        this.f76874f = str;
    }

    public void setDeepScan(int i10) {
        this.f76884p = i10;
    }

    public void setDeepScanFinished(int i10) {
        this.f76885q = i10;
    }

    public void setFromStatic(boolean z10) {
        this.f76887s = z10;
    }

    public void setInstalled(boolean z10) {
        this.f76888t = z10;
    }

    public void setMd5(String str) {
        this.f76869a = str;
    }

    public void setPackageName(String str) {
        this.f76871c = str;
    }

    public void setScore(int i10) {
        this.f76878j = i10;
    }

    public void setSizeInBytes(long j10) {
        this.f76872d = j10;
    }

    public void setSource(String str) {
        this.f76877i = str;
    }

    public void setSummary(String[] strArr) {
        this.f76879k = strArr;
    }

    public void setSystemApp(boolean z10) {
        this.f76873e = z10;
    }

    public void setUpload(int i10) {
        this.f76883o = i10;
    }

    public void setVersionCode(int i10) {
        this.f76876h = i10;
    }

    public void setVersionName(String str) {
        this.f76875g = str;
    }

    public void setVid(String str) {
        this.f76882n = str;
    }

    public void setVirusName(String str) {
        this.f76881m = str;
    }

    public void setVirusNameCategorySummaryByScore(int i10) {
        this.f76878j = i10;
        if (i10 >= 8) {
            this.f76881m = "Android.Malware.General";
            setSummary(Constants.SUMMARY_MALWARE_DEFAULT);
            setCategory(Constants.CATEGORY_MALWARE_DEFAULT);
        } else if (i10 >= 6) {
            this.f76881m = "Android.PUA.General";
            setSummary(Constants.SUMMARY_PUA_DEFAULT);
            setCategory(Constants.CATEGORY_PUA_DEFAULT);
        } else if (i10 >= 0) {
            this.f76881m = "Android.Benign";
            setSummary(Constants.SUMMARY_BENIGN_DEFAULT);
            setCategory(Constants.CATEGORY_BENIGN_DEFAULT);
        } else {
            this.f76881m = "Unknown";
            setSummary(Constants.SUMMARY_UNKNOWN_DEFAULT);
            setCategory(Constants.CATEGORY_UNKNOWN_DEFAULT);
        }
    }

    public JSONObject toJSON(Context context) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put(AutoInstallsLayout.ATTR_PACKAGE_NAME, this.f76871c);
            jSONObject.put("MD5", this.f76869a);
            jSONObject.put("size", this.f76872d);
            jSONObject.toString();
            return jSONObject;
        } catch (JSONException e10) {
            e10.getMessage();
            return jSONObject;
        }
    }

    public PkgInfo toPkgInfo() {
        PkgInfo pkgInfo = new PkgInfo(this.f76871c);
        pkgInfo.setMd5(this.f76869a);
        pkgInfo.setPkgPath(this.f76870b);
        pkgInfo.setPkgSize(this.f76872d);
        pkgInfo.setIsSystemApp(this.f76873e);
        pkgInfo.setCertSha1(this.f76874f);
        pkgInfo.setDeepScan(this.f76884p);
        return pkgInfo;
    }

    public AppInfo(String str) {
        this(str, "");
    }
}