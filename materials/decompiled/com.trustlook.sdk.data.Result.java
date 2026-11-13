package com.trustlook.sdk.data;

/* JADX INFO: loaded from: classes8.dex */
public abstract class Result {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private boolean f76918a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f76919b;

    public int getError() {
        return this.f76919b;
    }

    public boolean isSuccess() {
        return this.f76918a;
    }

    public void setError(int i10) {
        this.f76919b = i10;
    }

    public void setIsSuccess(boolean z10) {
        this.f76918a = z10;
    }
}