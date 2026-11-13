package com.trustlook.sdk.data;

/* JADX INFO: loaded from: classes8.dex */
public class LargeAppInfo {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private String f76892a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private String f76893b;

    public LargeAppInfo(String str, String str2) {
        this.f76892a = str;
        this.f76893b = str2;
    }

    public String getKey() {
        return this.f76893b;
    }

    public String getMd5() {
        return this.f76892a;
    }

    public void setKey(String str) {
        this.f76893b = str;
    }

    public void setMd5(String str) {
        this.f76892a = str;
    }
}