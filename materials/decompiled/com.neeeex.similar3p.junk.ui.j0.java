package com.neeeex.similar3p.junk.ui;

import com.neeeex.eraser.m0;

/* JADX INFO: loaded from: classes7.dex */
public final class j0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f66472a;

    public j0(String str) {
        m0.a("d3NFNWE=\n", "ARIpQASV3Lw=\n");
        str.getClass();
        this.f66472a = str;
    }

    public final String a() {
        return this.f66472a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof j0) && p003kotlin.jvm.internal.v.c(this.f66472a, ((j0) obj).f66472a);
    }

    public int hashCode() {
        return this.f66472a.hashCode();
    }

    public String toString() {
        return "Formatted(value=" + this.f66472a + ")";
    }
}