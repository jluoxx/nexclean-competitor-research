package com.neeeex.eraser.ads;

/* JADX INFO: loaded from: classes7.dex */
public final class p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final p f64984a = new p();

    public enum a {
        BANNER,
        NATIVE;


        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ ml.a f64986b = ml.b.a(d());

        public static ml.a getEntries() {
            return f64986b;
        }
    }

    public final a a(double d10, double d11) {
        return d10 > d11 ? a.BANNER : a.NATIVE;
    }
}