package com.thinkup.core.common.m0.d;

import java.util.Map;

/* JADX INFO: loaded from: classes7.dex */
public final class dn {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public String f69732d;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public String f69733m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public byte[] f69734n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public String f69735o;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public Map<String, String> f69736q;

    private dn(d dVar) {
        this.f69732d = dVar.f69737d;
        this.f69733m = dVar.f69738m;
        this.f69734n = dVar.f69739n;
        this.f69735o = dVar.f69740o;
        this.f69736q = dVar.f69741q;
    }

    public static class d {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private String f69737d;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        private String f69738m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private byte[] f69739n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        private String f69740o;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        private Map<String, String> f69741q;

        public final dn d() {
            return new dn(this, (byte) 0);
        }

        public final d m(String str) {
            this.f69738m = str;
            return this;
        }

        public final d n(String str) {
            this.f69740o = str;
            return this;
        }

        public final d d(String str) {
            this.f69737d = str;
            return this;
        }

        public final d d(byte[] bArr) {
            this.f69739n = bArr;
            return this;
        }

        public final d d(Map<String, String> map) {
            this.f69741q = map;
            return this;
        }
    }

    public /* synthetic */ dn(d dVar, byte b10) {
        this(dVar);
    }
}