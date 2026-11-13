package com.neeeex.eraser.utils;

import android.content.Context;
import android.net.Uri;
import fl.m0;
import gq.v0;
import kotlinx.coroutines.p0;
import p003kotlin.jvm.functions.Function0;
import p003kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes7.dex */
public final class j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final j f66185a = new j();

    public static final class c extends ll.m implements tl.n {
        final /* synthetic */ Uri $uri;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(Uri uri, kl.f<? super c> fVar) {
            super(2, fVar);
            this.$uri = uri;
        }

        @Override // ll.a
        public final kl.f<m0> create(Object obj, kl.f<?> fVar) {
            return new c(this.$uri, fVar);
        }

        @Override // tl.n
        public final Object invoke(p0 p0Var, kl.f<? super m0> fVar) {
            return ((c) create(p0Var, fVar)).invokeSuspend(m0.f80959a);
        }

        @Override // ll.a
        public final Object invokeSuspend(Object obj) {
            p003kotlin.coroutines.intrinsics.c.f();
            if (this.label != 0) {
                v0.a("call to 'resume' before 'invoke' with coroutine" /* decoded XOR */);
                return null;
            }
            fl.v.b(obj);
            com.neeeex.eraser.push.c.f65487a.s(this.$uri);
            return m0.f80959a;
        }
    }

    public static m0 a(String str) {
        "it" /* decoded XOR */;
        str.getClass();
        return m0.f80959a;
    }

    public final void d(String str, int i10) {
        Function0 aVar;
        if (com.neeeex.eraser.ads.e.b0().o0()) {
            return;
        }
        if (i10 != 0) {
            aVar = i10 != 1 ? null : new b(com.neeeex.eraser.push.c.f65487a);
        } else {
            aVar = new a(com.neeeex.eraser.push.c.f65487a);
        }
        if (aVar != null) {
            aVar.invoke();
        }
    }

    public final void e(Uri uri) {
        if (com.neeeex.eraser.ads.e.b0().o0()) {
            return;
        }
        kotlinx.coroutines.k.d(com.neeeex.eraser.y.Companion.c(), null, null, new c(uri, null), 3, null);
    }

    public final void f(Context context) {
        "context" /* decoded XOR */;
        context.getClass();
        new h(context, new d(this), new Function1() { // from class: com.neeeex.eraser.utils.i
            @Override // p003kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return j.a((String) obj);
            }
        }, new e(this)).v();
    }

    public static final /* synthetic */ class a extends p003kotlin.jvm.internal.s implements Function0 {
        public a(Object obj) {
            super(0, obj, com.neeeex.eraser.push.c.class, "postMonitorImage" /* decoded XOR */, "postMonitorImage()V" /* decoded XOR */, 0);
        }

        /* JADX INFO: renamed from: invoke, reason: collision with other method in class */
        public final void m174invoke() {
            ((com.neeeex.eraser.push.c) this.receiver).r();
        }

        @Override // p003kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Object invoke() {
            m174invoke();
            return m0.f80959a;
        }
    }

    public static final /* synthetic */ class b extends p003kotlin.jvm.internal.s implements Function0 {
        public b(Object obj) {
            super(0, obj, com.neeeex.eraser.push.c.class, "postMonitorVideo" /* decoded XOR */, "postMonitorVideo()V" /* decoded XOR */, 0);
        }

        /* JADX INFO: renamed from: invoke, reason: collision with other method in class */
        public final void m175invoke() {
            ((com.neeeex.eraser.push.c) this.receiver).t();
        }

        @Override // p003kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Object invoke() {
            m175invoke();
            return m0.f80959a;
        }
    }

    public static final /* synthetic */ class d extends p003kotlin.jvm.internal.s implements tl.n {
        public d(Object obj) {
            super(2, obj, j.class, "dispatchDeleteNotification" /* decoded XOR */, "dispatchDeleteNotification(Ljava/lang/String;I)V" /* decoded XOR */, 0);
        }

        public final void invoke(String str, int i10) {
            "p0" /* decoded XOR */;
            str.getClass();
            ((j) this.receiver).d(str, i10);
        }

        @Override // tl.n
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            invoke((String) obj, ((Number) obj2).intValue());
            return m0.f80959a;
        }
    }

    public static final /* synthetic */ class e extends p003kotlin.jvm.internal.s implements Function1 {
        public e(Object obj) {
            super(1, obj, j.class, "dispatchScreenshotNotification" /* decoded XOR */, "dispatchScreenshotNotification(Landroid/net/Uri;)V" /* decoded XOR */, 0);
        }

        public final void invoke(Uri uri) {
            "p0" /* decoded XOR */;
            uri.getClass();
            ((j) this.receiver).e(uri);
        }

        @Override // p003kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((Uri) obj);
            return m0.f80959a;
        }
    }
}