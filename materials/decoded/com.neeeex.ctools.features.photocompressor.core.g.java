package com.neeeex.ctools.features.photocompressor.core;

import com.neeeex.eraser.m0;

/* JADX INFO: loaded from: classes7.dex */
public enum g {
    JPEG("jpg" /* decoded XOR */, "image/jpeg" /* decoded XOR */),
    WEBP("webp" /* decoded XOR */, "image/webp" /* decoded XOR */);


    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ ml.a f64602b = ml.b.a(d());
    private final String extension;
    private final String mimeType;

    g(String str, String str2) {
        this.extension = str;
        this.mimeType = str2;
    }

    public static ml.a getEntries() {
        return f64602b;
    }

    public final String getExtension() {
        return this.extension;
    }

    public final String getMimeType() {
        return this.mimeType;
    }
}