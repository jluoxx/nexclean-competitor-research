package com.neeeex.ctools.features.appmanager;

import com.neeeex.eraser.m0;
import java.util.List;
import p003kotlin.jvm.internal.v;

/* JADX INFO: loaded from: classes7.dex */
public final class m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f64219a;

    public m(List list) {
        m0.a("2iN+rjA=\n", "s1cbw0OmEWs=\n");
        list.getClass();
        this.f64219a = list;
    }

    public final List a() {
        return this.f64219a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof m) && v.c(this.f64219a, ((m) obj).f64219a);
    }

    public int hashCode() {
        return this.f64219a.hashCode();
    }

    public String toString() {
        return "Applications(items=" + this.f64219a + ")";
    }
}