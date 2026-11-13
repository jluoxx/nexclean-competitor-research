package com.neeeex.ctools.features.photocompressor.core;

import com.neeeex.eraser.m0;

/* JADX INFO: loaded from: classes7.dex */
public enum g {
    JPEG(m0.a("fB4v\n", "Fm5ILa+giTo=\n"), m0.a("Wbcl8PnttxdVvQ==\n", "MNpEl5zC3Wc=\n")),
    WEBP(m0.a("MBR8rw==\n", "R3Ee3zpA7Og=\n"), m0.a("Jeg9oJIE7JUu9Q==\n", "TIVcx/crm/A=\n"));


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