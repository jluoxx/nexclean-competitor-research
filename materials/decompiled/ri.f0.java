package ri;

import android.app.PendingIntent;
import android.content.Context;
import android.os.Bundle;
import android.widget.RemoteViews;
import com.neeeex.eraser.R$id;
import com.neeeex.eraser.R$layout;
import com.neeeex.eraser.R$mipmap;
import com.neeeex.eraser.R$string;
import p003kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes7.dex */
public final class f0 extends a {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final CharSequence f92969r;

    /* JADX WARN: Illegal instructions before constructor call */
    public f0(CharSequence charSequence) {
        com.neeeex.eraser.m0.a("JI3xs4wx5Jwy\n", "V+WexNhYkPA=\n");
        charSequence.getClass();
        int i10 = R$mipmap.ic_launcher;
        super(null, false, 21, 0, 11, 0, false, new Function1() { // from class: ri.d0
            @Override // p003kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return f0.C(((Integer) obj).intValue());
            }
        }, new Function1() { // from class: ri.e0
            @Override // p003kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return f0.D(((Integer) obj).intValue());
            }
        }, R$string.puth_neeeex_normal_2, i10, 1000, false, 0L, false, false, false, 127083, null);
        this.f92969r = charSequence;
    }

    public static CharSequence C(int i10) {
        return "";
    }

    public static CharSequence D(int i10) {
        return "";
    }

    private final RemoteViews E(int i10, CharSequence charSequence, PendingIntent pendingIntent) {
        Context contextA = com.neeeex.eraser.y.Companion.a();
        RemoteViews remoteViews = new RemoteViews(contextA != null ? contextA.getPackageName() : null, i10);
        F(remoteViews, charSequence);
        remoteViews.setOnClickPendingIntent(R$id.rl_container, pendingIntent);
        return remoteViews;
    }

    private final void F(RemoteViews remoteViews, CharSequence charSequence) {
        remoteViews.setImageViewResource(R$id.iv_neeeex_icon, o());
        remoteViews.setTextViewText(R$id.tv_neeeex_content, charSequence);
        int i10 = R$id.tv_neeeex_button;
        Context contextN = n();
        remoteViews.setTextViewText(i10, contextN != null ? contextN.getString(l()) : null);
    }

    @Override // ri.a
    public fl.y s(int i10, int i11, String str, int i12) {
        com.neeeex.eraser.m0.a("Wu33Nnl5xNxd\n", "OYWWWBccqJU=\n");
        str.getClass();
        Bundle bundle = new Bundle();
        z(bundle, i11, str, i12);
        fl.m0 m0Var = fl.m0.f80959a;
        PendingIntent pendingIntentI = a.i(this, i10, bundle, false, 4, null);
        RemoteViews remoteViewsE = E(R$layout.push_neeeex_recover_small, this.f92969r, pendingIntentI);
        RemoteViews remoteViewsE2 = E(R$layout.push_neeeex_recover_mid, this.f92969r, pendingIntentI);
        if (com.neeeex.eraser.utils.c0.f66142a.d()) {
            remoteViewsE2.setViewVisibility(R$id.iv_neeeex_none, 0);
        }
        return new fl.y(remoteViewsE, remoteViewsE2, E(R$layout.push_neeeex_recover_large, this.f92969r, pendingIntentI));
    }
}