package com.neeeex.eraser.launcher;

import com.neeeex.eraser.launcher.contract.ToolHost;
import com.neeeex.eraser.m0;
import p003kotlin.Metadata;
import p003kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
public final /* synthetic */ class NexCleanLauncherHomeView$ads$1 extends p003kotlin.jvm.internal.s implements Function0 {
    public NexCleanLauncherHomeView$ads$1(Object obj) {
        super(0, obj, ToolHost.class, "prepareForActivityLaunch" /* decoded XOR */, "prepareForActivityLaunch()V" /* decoded XOR */, 0);
    }

    /* JADX INFO: renamed from: invoke, reason: collision with other method in class */
    public final void m165invoke() {
        ((ToolHost) this.receiver).prepareForActivityLaunch();
    }

    @Override // p003kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Object invoke() {
        m165invoke();
        return fl.m0.f80959a;
    }
}