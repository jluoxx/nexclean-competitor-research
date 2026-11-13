package com.trustlook.sdk.data;

import java.io.Serializable;

/* JADX INFO: loaded from: classes8.dex */
public enum LegitState implements Serializable {
    BAD(0, "Bad"),
    SYSTEM(2, "System"),
    SIGNATURE_ERROR(-3, "Sig calculate error"),
    INADEQUATE_INFO(-2, "Inadequate info provided"),
    DEBUG(3, "Debug"),
    NOT_DECIDE(-1, "Good or bad not decided yet"),
    GOOD(1, "Good"),
    UNKNOWN(999, "Unknown");


    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f76895a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private String f76896b;

    LegitState(int i10, String str) {
        this.f76895a = i10;
        this.f76896b = str;
    }

    public static LegitState getLegitStateFromValue(int i10) {
        for (LegitState legitState : values()) {
            if (legitState.f76895a == i10) {
                return legitState;
            }
        }
        return UNKNOWN;
    }

    public String getCause() {
        return this.f76896b;
    }

    public int getValue() {
        return this.f76895a;
    }

    public void setCause(String str) {
        this.f76896b = str;
    }

    public void setValue(int i10) {
        this.f76895a = i10;
    }
}