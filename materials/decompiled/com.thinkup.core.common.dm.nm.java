package com.thinkup.core.common.dm;

import java.util.Map;
import java.util.UUID;

/* JADX INFO: loaded from: classes7.dex */
public final class nm {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final String f68480d;

    /* JADX INFO: renamed from: d0, reason: collision with root package name */
    private String f68481d0 = UUID.randomUUID().toString();

    /* JADX INFO: renamed from: dd, reason: collision with root package name */
    private String f68482dd;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final String f68483m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private String f68484n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private Map<String, String> f68485o;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private boolean f68486q;

    public nm(String str, String str2) {
        this.f68480d = str;
        this.f68483m = str2;
    }

    private boolean dm() {
        return this.f68486q;
    }

    public final String d() {
        return this.f68480d;
    }

    public final String d0() {
        return this.f68481d0;
    }

    public final String dd() {
        return this.f68482dd;
    }

    public final String m() {
        return this.f68483m;
    }

    public final String n() {
        return this.f68484n;
    }

    public final Map<String, String> o() {
        return this.f68485o;
    }

    public final void q() {
        this.f68486q = true;
    }

    public final void d(String str) {
        this.f68484n = str;
    }

    public final void m(String str) {
        this.f68481d0 = str;
    }

    public final void n(String str) {
        this.f68482dd = str;
    }

    public final void d(Map<String, String> map) {
        this.f68485o = map;
    }
}