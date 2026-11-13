package ri;

import android.app.PendingIntent;
import android.content.Context;
import android.os.Bundle;
import android.widget.RemoteViews;
import com.neeeex.eraser.R$id;
import com.neeeex.eraser.R$layout;
import com.neeeex.eraser.R$string;
import p003kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes7.dex */
public final class f1 extends a {
    public f1() {
        super(null, false, 4, 0, 1, 0, true, new Function1() { // from class: ri.d1
            @Override // p003kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return f1.C(((Integer) obj).intValue());
            }
        }, new Function1() { // from class: ri.e1
            @Override // p003kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return f1.D(((Integer) obj).intValue());
            }
        }, R$string.puth_neeeex_normal_2, 0, 1, false, 0L, false, false, false, 128043, null);
    }

    public static CharSequence C(int i10) {
        String string;
        Context contextA = com.neeeex.eraser.y.Companion.a();
        return (contextA == null || (string = com.neeeex.eraser.utils.g.b(contextA).getString(R$string.puth_neeeex_normal_3)) == null) ? "" : string;
    }

    public static CharSequence D(int i10) {
        return "";
    }

    public final RemoteViews E(int i10, int i11, CharSequence charSequence, PendingIntent pendingIntent) {
        Context contextA = com.neeeex.eraser.y.Companion.a();
        RemoteViews remoteViews = new RemoteViews(contextA != null ? contextA.getPackageName() : null, i10);
        F(remoteViews, i11, charSequence);
        remoteViews.setOnClickPendingIntent(R$id.rl_container, pendingIntent);
        return remoteViews;
    }

    public final void F(RemoteViews remoteViews, int i10, CharSequence charSequence) {
        remoteViews.setTextViewText(R$id.tv_neeeex_day_count, String.valueOf(i10));
        int i11 = R$id.tv_neeeex_days;
        Context contextN = n();
        remoteViews.setTextViewText(i11, contextN != null ? contextN.getString(R$string.puth_neeeex_normal_8) : null);
        remoteViews.setTextViewText(R$id.tv_neeeex_content, charSequence);
        int i12 = R$id.tv_neeeex_button;
        Context contextN2 = n();
        remoteViews.setTextViewText(i12, contextN2 != null ? contextN2.getString(l()) : null);
    }

    @Override // ri.a
    public boolean a(int i10, boolean z10) {
        if (com.neeeex.eraser.push.a.f65469a.j() < 2) {
            return false;
        }
        return super.a(i10, z10);
    }

    @Override // ri.a
    public fl.y s(int i10, int i11, String str, int i12) {
        "channelId" /* decoded XOR */;
        str.getClass();
        int iJ = com.neeeex.eraser.push.a.f65469a.j();
        CharSequence charSequence = (CharSequence) v().invoke(0);
        Bundle bundle = new Bundle();
        z(bundle, i11, str, i12);
        fl.m0 m0Var = fl.m0.f80959a;
        PendingIntent pendingIntentI = a.i(this, i10, bundle, false, 4, null);
        RemoteViews remoteViewsE = E(R$layout.push_neeeex_attention_small, iJ, charSequence, pendingIntentI);
        RemoteViews remoteViewsE2 = E(R$layout.push_neeeex_attention_mid, iJ, charSequence, pendingIntentI);
        if (com.neeeex.eraser.utils.c0.f66142a.d()) {
            remoteViewsE2.setViewVisibility(R$id.iv_neeeex_none, 0);
        }
        return new fl.y(remoteViewsE, remoteViewsE2, E(R$layout.push_neeeex_attention_large, iJ, charSequence, pendingIntentI));
    }
}