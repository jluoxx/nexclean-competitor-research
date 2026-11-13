package com.neeeex.eraser.launcher.contract;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import com.android.launcher3.LauncherSettings;
import gq.o;
import p003kotlin.Metadata;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001J\u0019\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\u0007\u001a\u00020\u0004H&¢\u0006\u0004\b\u0007\u0010\bJ#\u0010\r\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\t2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000bH&¢\u0006\u0004\b\r\u0010\u000eR\u0014\u0010\u0012\u001a\u00020\u000f8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0013À\u0006\u0003"}, d2 = {"Lcom/neeeex/eraser/launcher/contract/ToolHost;", "", "", "animate", "Lfl/m0;", "closeTool", "(Z)V", "prepareForActivityLaunch", "()V", "Landroid/content/Intent;", "intent", "Landroid/os/Bundle;", LauncherSettings.Favorites.OPTIONS, "launch", "(Landroid/content/Intent;Landroid/os/Bundle;)V", "Landroid/app/Activity;", "getActivity", "()Landroid/app/Activity;", "activity", "launcher-contract_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
public interface ToolHost {

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class DefaultImpls {
    }

    static /* synthetic */ void closeTool$default(ToolHost toolHost, boolean z10, int i10, Object obj) {
        if (obj != null) {
            o.a("Super calls with default arguments not supported in this target, function: closeTool");
            return;
        }
        if ((i10 & 1) != 0) {
            z10 = true;
        }
        toolHost.closeTool(z10);
    }

    static /* synthetic */ void launch$default(ToolHost toolHost, Intent intent, Bundle bundle, int i10, Object obj) {
        if (obj != null) {
            o.a("Super calls with default arguments not supported in this target, function: launch");
            return;
        }
        if ((i10 & 2) != 0) {
            bundle = null;
        }
        toolHost.launch(intent, bundle);
    }

    void closeTool(boolean animate);

    Activity getActivity();

    void launch(Intent intent, Bundle options);

    void prepareForActivityLaunch();
}