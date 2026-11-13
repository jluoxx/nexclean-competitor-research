package com.neeeex.eraser.utils;

import com.neeeex.eraser.m0;
import p003kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes7.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final b f66129a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final fl.n f66130b;

    public static final /* synthetic */ class a extends p003kotlin.jvm.internal.s implements Function0 {
        public a(Object obj) {
            super(0, obj, b.class, m0.a("HX8dmqPE4rEbXxysvdw=\n", "cxpqydOog8I=\n"), m0.a("tyQxZ2u+97qxBDBRdaa+4JUiKVk0vPOsvCQ+G36g97q8M2lBb7v6uvYSL1p8vvOFsDcjcW23+L3i\n", "2UFGNBvSlsk=\n"), 0);
        }

        @Override // p003kotlin.jvm.functions.Function0
        public final n invoke() {
            return ((b) this.receiver).c();
        }
    }

    static {
        b bVar = new b();
        f66129a = bVar;
        f66130b = fl.o.a(fl.q.NONE, new a(bVar));
    }

    public static final n b() {
        return (n) f66130b.getValue();
    }

    public final n c() {
        return new n();
    }
}