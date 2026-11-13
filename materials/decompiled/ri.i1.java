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
public final class i1 extends a {
    /* JADX WARN: Illegal instructions before constructor call */
    public i1() {
        int i10 = R$drawable.ic_neeeex_push_attention_photo;
        super(null, false, 5, 0, 1, 0, true, new Function1() { // from class: ri.g1
            @Override // p003kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return i1.C(((Integer) obj).intValue());
            }
        }, new Function1() { // from class: ri.h1
            @Override // p003kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return i1.D(((Integer) obj).intValue());
            }
        }, R$string.common_neeeex_recover, i10, 1, false, 0L, false, false, false, 127019, null);
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
    public boolean a(int i10, boolean z10) {
        if (com.neeeex.eraser.push.a.f65469a.f(1) <= 0) {
            return false;
        }
        return super.a(i10, z10);
    }

    @Override // ri.a
    public fl.y s(int i10, int i11, String str, int i12) {
        String string;
        String string2;
        com.neeeex.eraser.m0.a("c2uPywzl1PF0\n", "EAPupWKAuLg=\n");
        str.getClass();
        int iF = com.neeeex.eraser.push.a.f65469a.f(1);
        com.neeeex.eraser.push.n nVar = com.neeeex.eraser.push.n.f65534a;
        Context contextN = n();
        String str2 = "";
        if (contextN == null || (string = contextN.getString(R$string.puth_neeeex_normal_4, Integer.valueOf(iF))) == null) {
            string = "";
        }
        Spanned spannedF = nVar.f(string, String.valueOf(iF));
        Context contextN2 = n();
        if (contextN2 != null && (string2 = contextN2.getString(R$string.puth_neeeex_normal_4, Integer.valueOf(iF))) != null) {
            str2 = string2;
        }
        Spanned spannedG = nVar.g(str2, String.valueOf(iF));
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