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
        m0.a("q1CJKq0=\n", "zibsRNnCMOM=\n");
        event.getClass();
        m0.a("CHU5/YLg\n", "expMj+GFwdk=\n");
        source.getClass();
        Context contextA = com.neeeex.eraser.y.Companion.a();
        if (contextA == null) {
            return;
        }
        Bundle bundle = new Bundle();
        bundle.putString(m0.a("npKPIW1r\n", "7f36Uw4OV2o=\n"), source);
        bundle.putString(m0.a("Ce7CGaIGPQ==\n", "epuwf8NlWKk=\n"), m0.a("ZkCKj7dL2fM=\n", "CiH/4dQjvIE=\n"));
        bundle.putBoolean(m0.a("Yjla/ilm7vBuM1H6\n", "Blw8n1wKmq8=\n"), DefaultHomeController.INSTANCE.isDefaultHome(contextA));
        fl.m0 m0Var = fl.m0.f80959a;
        FirebaseAnalytics.getInstance(contextA).a("neeeex_" + event, bundle);
    }
}