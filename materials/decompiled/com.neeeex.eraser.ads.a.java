package com.neeeex.eraser.ads;

import com.neeeex.eraser.m0;
import p003kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes7.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f64885a = new Object();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public volatile boolean f64886b;

    public final void a(Function0 function0, Function0 function1) {
        m0.a("/C3zuwH+hWz5N8CwDA==\n", "lV661WiK7A0=\n");
        function0.getClass();
        m0.a("F50AglH7Kq8Elg==\n", "fvNp9jiaRsY=\n");
        function1.getClass();
        if (((Boolean) function0.invoke()).booleanValue()) {
            this.f64886b = true;
            return;
        }
        if (this.f64886b) {
            return;
        }
        synchronized (this.f64885a) {
            if (((Boolean) function0.invoke()).booleanValue()) {
                this.f64886b = true;
            } else {
                if (this.f64886b) {
                    return;
                }
                function1.invoke();
                this.f64886b = true;
                fl.m0 m0Var = fl.m0.f80959a;
            }
        }
    }
}