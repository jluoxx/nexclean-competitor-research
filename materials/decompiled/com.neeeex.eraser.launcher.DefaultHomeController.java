package com.neeeex.eraser.launcher;

import android.app.Activity;
import android.app.role.RoleManager;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.ResolveInfo;
import android.os.Build;
import com.neeeex.eraser.m0;
import p003kotlin.Metadata;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0015\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"Lcom/neeeex/eraser/launcher/DefaultHomeController;", "", "<init>", "()V", "Landroid/content/Context;", "context", "", "isDefaultHome", "(Landroid/content/Context;)Z", "Landroid/app/Activity;", "activity", "Lfl/m0;", "request", "(Landroid/app/Activity;)V", "tool-feature_productionRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class DefaultHomeController {
    public static final DefaultHomeController INSTANCE = new DefaultHomeController();

    private DefaultHomeController() {
    }

    public final boolean isDefaultHome(Context context) {
        ActivityInfo activityInfo;
        RoleManager roleManager;
        m0.a("3iJ1ZAtvSA==\n", "vU0bEG4XPG8=\n");
        context.getClass();
        if (Build.VERSION.SDK_INT >= 29 && (roleManager = (RoleManager) context.getSystemService(RoleManager.class)) != null && roleManager.isRoleAvailable(m0.a("bgsgsCNpxbRuFTTsPm/N/yEtC48J\n", "D2VEwkwAoZo=\n"))) {
            return roleManager.isRoleHeld(m0.a("spcDRjpNVayyiRcaJ0td5/2xKHkQ\n", "0/lnNFUkMYI=\n"));
        }
        Intent intentAddCategory = new Intent(m0.a("q0JN2Alj2emjQl3PCH6TpqlYQMUIJPCGg2I=\n", "yiwpqmYKvcc=\n")).addCategory(m0.a("zZrtH+UbpYTFmv0I5Abvyc2A7ArlALiE5LvEKA==\n", "rPSJbYpywao=\n"));
        m0.a("XTkeLaNVWctTLwNG7A8ShQ==\n", "PF16bsIhPKw=\n");
        intentAddCategory.getClass();
        ResolveInfo resolveInfoResolveActivity = context.getPackageManager().resolveActivity(intentAddCategory, 65536);
        return p003kotlin.jvm.internal.v.c((resolveInfoResolveActivity == null || (activityInfo = resolveInfoResolveActivity.activityInfo) == null) ? null : activityInfo.packageName, context.getPackageName());
    }

    public final void request(Activity activity) {
        m0.a("/I2FUTNtbS8=\n", "ne7xOEUEGVY=\n");
        activity.getClass();
        com.neeeex.eraser.ads.e.b0().R0();
        DefaultHomeOnboardingHelper.requestDefaultHome$default(DefaultHomeOnboardingHelper.INSTANCE, activity, 2601, null, 4, null);
    }
}