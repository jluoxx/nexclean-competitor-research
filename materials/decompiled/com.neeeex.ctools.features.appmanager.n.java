package com.neeeex.ctools.features.appmanager;

import com.neeeex.eraser.m0;
import p003kotlin.jvm.internal.v;

/* JADX INFO: loaded from: classes7.dex */
public final class n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f64220a;

    public n(String str) {
        m0.a("ro6Yqw==\n", "2uvg3+ABXqE=\n");
        str.getClass();
        this.f64220a = str;
    }

    public final String a() {
        return this.f64220a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof n) && v.c(this.f64220a, ((n) obj).f64220a);
    }

    public int hashCode() {
        return this.f64220a.hashCode();
    }

    public String toString() {
        return "Message(text=" + this.f64220a + ")";
    }
}