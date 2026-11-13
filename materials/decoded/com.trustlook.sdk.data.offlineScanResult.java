package com.trustlook.sdk.data;

/* JADX INFO: loaded from: classes8.dex */
public class offlineScanResult {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private String f76929a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f76930b;

    public offlineScanResult(String str, int i10) {
        this.f76929a = str;
        this.f76930b = i10;
    }

    public String getMd5() {
        return this.f76929a;
    }

    public int getScore() {
        return this.f76930b;
    }

    public void setMd5(String str) {
        this.f76929a = str;
    }

    public void setScore(int i10) {
        this.f76930b = i10;
    }

    public String toString() {
        return "offlineScanResult{md5='" + this.f76929a + "', score=" + this.f76930b + '}';
    }
}