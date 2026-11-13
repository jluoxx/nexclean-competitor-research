package com.neeeex.eraser.push;

/* JADX INFO: loaded from: classes7.dex */
public final class p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final p f65536a = new p();

    public final boolean a(long j10, long j11, long j12, boolean z10) {
        if (!z10 && j11 > 0 && j10 - j11 >= 21600000) {
            return j12 <= 0 || j10 - j12 >= 5000;
        }
        return false;
    }
}