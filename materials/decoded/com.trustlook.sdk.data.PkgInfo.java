package com.trustlook.sdk.data;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.Signature;
import com.trustlook.sdk.Constants;
import com.trustlook.sdk.cloudscan.PkgUtils;
import com.trustlook.sdk.cloudscan.a;
import com.trustlook.sdk.database.DBHelper;
import java.io.ByteArrayInputStream;
import java.security.MessageDigest;
import java.security.cert.CertificateException;
import java.security.cert.CertificateFactory;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes8.dex */
public class PkgInfo {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private String f76897a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private String f76898b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private String f76899c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private long f76900d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private String f76901e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private boolean f76902f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private String f76903g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private int f76904h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private String f76905i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private String f76906j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private String f76907k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private String f76908l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private String f76909m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private String f76910n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private String f76911o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private int f76912p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private int f76913q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private boolean f76914r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private String f76915s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private String f76916t;

    public PkgInfo(String str) {
        this.f76897a = str;
    }

    private static void a(Context context, PkgInfo pkgInfo, boolean z10) {
        String pkgName = pkgInfo.getPkgName();
        ArrayList arrayList = new ArrayList();
        try {
            CertificateFactory certificateFactory = CertificateFactory.getInstance("X509");
            PackageManager packageManager = context.getPackageManager();
            PackageInfo packageInfo = !z10 ? packageManager.getPackageInfo(pkgName, 64) : packageManager.getPackageArchiveInfo(pkgInfo.getPkgPath(), 64);
            if (packageInfo != null) {
                for (Signature signature : packageInfo.signatures) {
                    ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(signature.toByteArray());
                    X509Certificate x509Certificate = (X509Certificate) certificateFactory.generateCertificate(byteArrayInputStream);
                    AppCertificate appCertificate = new AppCertificate();
                    appCertificate.setPemIssuer(x509Certificate.getIssuerDN().toString());
                    appCertificate.setPemStartDate(x509Certificate.getNotBefore().getTime() / 1000);
                    appCertificate.setPemExpiredDate(x509Certificate.getNotAfter().getTime() / 1000);
                    appCertificate.setPemSerialNumber(x509Certificate.getSerialNumber().toString(16));
                    arrayList.add(appCertificate);
                    MessageDigest messageDigest = MessageDigest.getInstance("SHA1");
                    messageDigest.update(x509Certificate.getEncoded());
                    pkgInfo.setCertSha1(PkgUtils.formatHexComma(messageDigest.digest()));
                    byteArrayInputStream.close();
                }
            }
        } catch (PackageManager.NameNotFoundException | CertificateException unused) {
        } catch (Exception e10) {
            a.a(e10, new StringBuilder("populateSha1 Exception: "), Constants.TAG);
        }
    }

    public String getAppName() {
        return this.f76916t;
    }

    public String getAppPermissions() {
        return this.f76909m;
    }

    public String getCertSha1() {
        return this.f76903g;
    }

    public int getDeepScan() {
        return this.f76912p;
    }

    public int getDeepScanFinished() {
        return this.f76913q;
    }

    public String getFeatures() {
        return this.f76907k;
    }

    public String getHmc() {
        return this.f76910n;
    }

    public String getIntents() {
        return this.f76906j;
    }

    public String getMd5() {
        return this.f76899c;
    }

    public String getNetworks() {
        return this.f76911o;
    }

    public String getPkgName() {
        return this.f76897a;
    }

    public String getPkgPath() {
        return this.f76898b;
    }

    public long getPkgSize() {
        return this.f76900d;
    }

    public String getPkgSource() {
        return this.f76901e;
    }

    public String getProviders() {
        return this.f76908l;
    }

    public String getVect() {
        return this.f76915s;
    }

    public int getVersionCode() {
        return this.f76904h;
    }

    public String getVersionName() {
        return this.f76905i;
    }

    public boolean isCache() {
        return this.f76914r;
    }

    public boolean isSystemApp() {
        return this.f76902f;
    }

    public void setAppName(String str) {
        this.f76916t = str;
    }

    public void setAppPermissions(String str) {
        this.f76909m = str;
    }

    public void setCache(boolean z10) {
        this.f76914r = z10;
    }

    public void setCertSha1(String str) {
        this.f76903g = str;
    }

    public void setDeepScan(int i10) {
        this.f76912p = i10;
    }

    public void setDeepScanFinished(int i10) {
        this.f76913q = i10;
    }

    public void setFeatures(String str) {
        this.f76907k = str;
    }

    public void setHmc(String str) {
        this.f76910n = str;
    }

    public void setIntents(String str) {
        this.f76906j = str;
    }

    public void setIsSystemApp(boolean z10) {
        this.f76902f = z10;
    }

    public void setMd5(String str) {
        this.f76899c = str;
    }

    public void setNetworks(String str) {
        this.f76911o = str;
    }

    public void setPkgName(String str) {
        this.f76897a = str;
    }

    public void setPkgPath(String str) {
        this.f76898b = str;
    }

    public void setPkgSize(long j10) {
        this.f76900d = j10;
    }

    public void setPkgSource(String str) {
        this.f76901e = str;
    }

    public void setProviders(String str) {
        this.f76908l = str;
    }

    public void setSystemApp(boolean z10) {
        this.f76902f = z10;
    }

    public void setVect(String str) {
        this.f76915s = str;
    }

    public void setVersionCode(int i10) {
        this.f76904h = i10;
    }

    public void setVersionName(String str) {
        this.f76905i = str;
    }

    public AppInfo toAppInfo() {
        AppInfo appInfo = new AppInfo(this.f76897a, this.f76899c);
        appInfo.setApkPath(this.f76898b);
        appInfo.setSizeInBytes(this.f76900d);
        appInfo.setSystemApp(this.f76902f);
        appInfo.setCertSha1(this.f76903g);
        appInfo.setAppName(this.f76916t);
        return appInfo;
    }

    public JSONObject toJSON(Context context, boolean z10) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("nm", this.f76897a);
            jSONObject.put(DBHelper.COLUMN_MD5, this.f76899c);
            jSONObject.put("sz", this.f76900d);
            jSONObject.put("src", this.f76901e);
            jSONObject.put("vc", this.f76904h);
            jSONObject.put("vn", this.f76905i);
            String str = this.f76903g;
            if (str == null || "".equals(str)) {
                if ((this.f76900d / 1024.0f) / 1024.0f <= Constants.GIGANTIC_APK_MB) {
                    a(context, this, z10);
                } else {
                    this.f76903g = "";
                }
            }
            jSONObject.put("cs1", this.f76903g);
            boolean z11 = this.f76914r;
            if (z11) {
                jSONObject.put("c", z11);
            }
            jSONObject.toString();
            return jSONObject;
        } catch (JSONException e10) {
            e10.getMessage();
            return jSONObject;
        }
    }

    public String toString() {
        return "PkgInfo{pkgName='" + this.f76897a + "', pkgPath='" + this.f76898b + "', md5='" + this.f76899c + "', pkgSize=" + this.f76900d + ", pkgSource='" + this.f76901e + "', appName='" + this.f76916t + "'}";
    }
}