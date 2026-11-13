package com.neeeex.eraser.launcher;

import com.neeeex.eraser.m0;
import p003kotlin.Metadata;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\t¨\u0006\n"}, d2 = {"Lcom/neeeex/eraser/launcher/FirstMinusOneEntryPath;", "", "value", "", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "getValue", "()Ljava/lang/String;", "SPLASH_AD", "DEVICE_SCAN", "tool-feature_productionRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public enum FirstMinusOneEntryPath {
    SPLASH_AD("splash_ad" /* decoded XOR */),
    DEVICE_SCAN("device_scan" /* decoded XOR */);

    private static final /* synthetic */ ml.a $ENTRIES = ml.b.a(values());
    private final String value;

    FirstMinusOneEntryPath(String str) {
        this.value = str;
    }

    public static ml.a getEntries() {
        return $ENTRIES;
    }

    public final String getValue() {
        return this.value;
    }
}