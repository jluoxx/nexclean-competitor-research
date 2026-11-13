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
public final class z extends a {
    /* JADX WARN: Illegal instructions before constructor call */
    public z() {
        int i10 = R$drawable.ic_neeeex_push_recover_image;
        super(null, false, 1, 1, 1, 0, false, new Function1() { // from class: ri.b
            @Override // p003kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return z.D(((Integer) obj).intValue());
            }
        }, new Function1() { // from class: ri.c
            @Override // p003kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return z.C(((Integer) obj).intValue());
            }
        }, R$string.common_neeeex_recover, i10, 1, false, 0L, false, false, false, 127075, null);
    }

    public static CharSequence C(int i10) {
        return "";
    }

    public static CharSequence D(int i10) {
        String string;
        Context contextA = com.neeeex.eraser.y.Companion.a();
        return (contextA == null || (string = com.neeeex.eraser.utils.g.b(contextA).getString(new Integer[]{Integer.valueOf(R$string.push_neeeex_content1), Integer.valueOf(R$string.push_neeeex_content2), Integer.valueOf(R$string.push_neeeex_content3), Integer.valueOf(R$string.push_neeeex_content4), Integer.valueOf(R$string.push_neeeex_content5), Integer.valueOf(R$string.push_neeeex_content6)}[i10].intValue())) == null) ? "" : string;
    }

    public final RemoteViews E(int i10, CharSequence charSequence, CharSequence charSequence2, PendingIntent pendingIntent) {
        Context contextA = com.neeeex.eraser.y.Companion.a();
        RemoteViews remoteViews = new RemoteViews(contextA != null ? contextA.getPackageName() : null, i10);
        F(remoteViews, charSequence, charSequence2);
        remoteViews.setOnClickPendingIntent(R$id.rl_container, pendingIntent);
        return remoteViews;
    }

    public final void F(RemoteViews remoteViews, CharSequence charSequence, CharSequence charSequence2) {
        String string;
        remoteViews.setImageViewResource(R$id.iv_neeeex_icon, o());
        remoteViews.setTextViewText(R$id.tv_neeeex_content, charSequence);
        int i10 = R$id.tv_neeeex_button;
        Context contextN = n();
        if (contextN == null || (string = contextN.getString(l())) == null) {
            string = "";
        }
        remoteViews.setTextViewText(i10, string);
    }

    @Override // ri.a
    public fl.y s(int i10, int i11, String str, int i12) {
        com.neeeex.eraser.m0.a("qPAo+DNgo0uv\n", "y5hJll0FzwI=\n");
        str.getClass();
        int iNextInt = yl.c.Default.nextInt(0, 6);
        CharSequence charSequence = (CharSequence) v().invoke(Integer.valueOf(iNextInt));
        CharSequence charSequence2 = (CharSequence) m().invoke(Integer.valueOf(iNextInt));
        Bundle bundle = new Bundle();
        z(bundle, i11, str, i12);
        fl.m0 m0Var = fl.m0.f80959a;
        PendingIntent pendingIntentI = a.i(this, i10, bundle, false, 4, null);
        RemoteViews remoteViewsE = E(R$layout.push_neeeex_recover_small, charSequence, charSequence2, pendingIntentI);
        RemoteViews remoteViewsE2 = E(R$layout.push_neeeex_recover_mid, charSequence, charSequence2, pendingIntentI);
        if (com.neeeex.eraser.utils.c0.f66142a.d()) {
            remoteViewsE2.setViewVisibility(R$id.iv_neeeex_none, 0);
        }
        return new fl.y(remoteViewsE, remoteViewsE2, E(R$layout.push_neeeex_recover_large, charSequence, charSequence2, pendingIntentI));
    }
}