package ri;

import android.app.PendingIntent;
import android.content.Context;
import android.os.Bundle;
import android.text.Spanned;
import android.widget.RemoteViews;
import com.neeeex.eraser.R$drawable;
import com.neeeex.eraser.R$id;
import com.neeeex.eraser.R$layout;
import com.neeeex.eraser.R$string;
import p003kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes7.dex */
public final class b1 extends a {
    /* JADX WARN: Illegal instructions before constructor call */
    public b1() {
        int i10 = R$drawable.neeeex_similar_ic_junk;
        super(null, false, 28, 0, 11, 0, false, new Function1() { // from class: ri.z0
            @Override // p003kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return b1.C(((Integer) obj).intValue());
            }
        }, new Function1() { // from class: ri.a1
            @Override // p003kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return b1.D(((Integer) obj).intValue());
            }
        }, R$string.puth_neeeex_normal_2, i10, 4, false, 0L, false, true, true, 28779, null);
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
        String string;
        "channelId" /* decoded XOR */;
        str.getClass();
        int iNextInt = yl.c.Default.nextInt(c1.f92966a.length);
        int iC = c1.c();
        String str2 = iC + "%";
        Context contextN = n();
        if (contextN == null || (string = contextN.getString(c1.f92966a[iNextInt], Integer.valueOf(iC))) == null) {
            string = "";
        }
        com.neeeex.eraser.push.n nVar = com.neeeex.eraser.push.n.f65534a;
        Spanned spannedF = nVar.f(string, str2);
        Spanned spannedG = nVar.g(string, str2);
        Bundle bundle = new Bundle();
        z(bundle, i11, str, i12);
        fl.m0 m0Var = fl.m0.f80959a;
        PendingIntent pendingIntentI = a.i(this, i10, bundle, false, 4, null);
        RemoteViews remoteViewsE = E(R$layout.push_neeeex_recover_small, spannedF, pendingIntentI);
        RemoteViews remoteViewsE2 = E(R$layout.push_neeeex_recover_mid, spannedF, pendingIntentI);
        if (com.neeeex.eraser.utils.c0.f66142a.d()) {
            remoteViewsE2.setViewVisibility(R$id.iv_neeeex_none, 0);
        }
        return new fl.y(remoteViewsE, remoteViewsE2, E(R$layout.push_neeeex_recover_large, spannedG, pendingIntentI));
    }
}