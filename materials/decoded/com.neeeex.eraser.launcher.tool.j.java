package com.neeeex.eraser.launcher.tool;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class j implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ToolOverlayManager f65168a;

    public /* synthetic */ j(ToolOverlayManager toolOverlayManager) {
        this.f65168a = toolOverlayManager;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f65168a.registerOverlayBackCallback();
    }
}