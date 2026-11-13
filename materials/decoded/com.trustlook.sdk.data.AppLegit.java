package com.trustlook.sdk.data;

/* JADX INFO: loaded from: classes8.dex */
public class AppLegit {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private String f76889a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private LegitState f76890b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private String f76891c;

    public AppLegit(String str, String str2, LegitState legitState) {
        this.f76891c = str;
        this.f76889a = str2;
        this.f76890b = legitState;
    }

    public LegitState getLegitState() {
        return this.f76890b;
    }

    public String getMd5() {
        return this.f76891c;
    }

    public String getPkgName() {
        return this.f76889a;
    }

    public void setLegitState(LegitState legitState) {
        this.f76890b = legitState;
    }

    public void setMd5(String str) {
        this.f76891c = str;
    }

    public void setPkgName(String str) {
        this.f76889a = str;
    }
}