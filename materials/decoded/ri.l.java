package ri;

import android.app.PendingIntent;
import android.content.Context;
import android.os.Bundle;
import android.widget.RemoteViews;
import com.neeeex.eraser.R$drawable;
import com.neeeex.eraser.R$id;
import com.neeeex.eraser.R$layout;
import com.neeeex.eraser.R$string;
import p003kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes7.dex */
public final class l extends a {
    /* JADX WARN: Illegal instructions before constructor call */
    public l() {
        int i10 = R$drawable.neeeex_similar_ic_large_media;
        super(null, false, 14, 0, 6, 0, false, new Function1() { // from class: ri.j
            @Override // p003kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return l.D(((Integer) obj).intValue());
            }
        }, new Function1() { // from class: ri.k
            @Override // p003kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return l.C(((Integer) obj).intValue());
            }
        }, R$string.puth_neeeex_normal_2, i10, 2, false, 0L, false, false, false, 127083, null);
    }

    public static CharSequence C(int i10) {
        return "";
    }

    public static CharSequence D(int i10) {
        String string;
        Context contextA = com.neeeex.eraser.y.Companion.a();
        return (contextA == null || (string = com.neeeex.eraser.utils.g.b(contextA).getString(new Integer[]{Integer.valueOf(R$string.push_neeeex_similar_large_media_0), Integer.valueOf(R$string.push_neeeex_similar_large_media_1), Integer.valueOf(R$string.push_neeeex_similar_large_media_2), Integer.valueOf(R$string.push_neeeex_similar_large_media_3), Integer.valueOf(R$string.push_neeeex_similar_large_media_4), Integer.valueOf(R$string.push_neeeex_similar_large_media_5)}[i10].intValue())) == null) ? "" : string;
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
        "channelId" /* decoded XOR */;
        str.getClass();
        CharSequence charSequence = (CharSequence) v().invoke(Integer.valueOf(yl.c.Default.nextInt(0, 6)));
        Bundle bundle = new Bundle();
        z(bundle, i11, str, i12);
        fl.m0 m0Var = fl.m0.f80959a;
        PendingIntent pendingIntentI = a.i(this, i10, bundle, false, 4, null);
        RemoteViews remoteViewsE = E(R$layout.push_neeeex_recover_small, charSequence, pendingIntentI);
        RemoteViews remoteViewsE2 = E(R$layout.push_neeeex_recover_mid, charSequence, pendingIntentI);
        if (com.neeeex.eraser.utils.c0.f66142a.d()) {
            remoteViewsE2.setViewVisibility(R$id.iv_neeeex_none, 0);
        }
        return new fl.y(remoteViewsE, remoteViewsE2, E(R$layout.push_neeeex_recover_large, charSequence, pendingIntentI));
    }
}