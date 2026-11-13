package com.neeeex.eraser.launcher;

import android.content.Context;
import android.os.Bundle;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.neeeex.eraser.m0;
import p003kotlin.Metadata;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001d\u0010\b\u001a\u00020\u00072\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0004¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lcom/neeeex/eraser/launcher/LauncherTelemetry;", "", "<init>", "()V", "", "event", "source", "Lfl/m0;", "report", "(Ljava/lang/String;Ljava/lang/String;)V", "tool-feature_productionRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class LauncherTelemetry {
    public static final LauncherTelemetry INSTANCE = new LauncherTelemetry();

    private LauncherTelemetry() {
    }

    public final void report(String event, String source) {
        "event" /* decoded XOR */;
        event.getClass();
        "source" /* decoded XOR */;
        source.getClass();
        Context contextA = com.neeeex.eraser.y.Companion.a();
        if (contextA == null) {
            return;
        }
        Bundle bundle = new Bundle();
        bundle.putString("source" /* decoded XOR */, source);
        bundle.putString("surface" /* decoded XOR */, "launcher" /* decoded XOR */);
        bundle.putBoolean("default_home" /* decoded XOR */, DefaultHomeController.INSTANCE.isDefaultHome(contextA));
        fl.m0 m0Var = fl.m0.f80959a;
        FirebaseAnalytics.getInstance(contextA).a("neeeex_" + event, bundle);
    }
}