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
public final class a2 extends ri.a {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final a f92965r = new a(null);

    public a2() {
        super(null, false, 103, 0, 0, 0, false, new Function1() { // from class: ri.y1
            @Override // p003kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return a2.C(((Integer) obj).intValue());
            }
        }, new Function1() { // from class: ri.z1
            @Override // p003kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return a2.D(((Integer) obj).intValue());
            }
        }, R$string.common_neeeex_close, 0, 0, false, 0L, false, false, false, 130155, null);
    }

    public static CharSequence C(int i10) {
        String string;
        Context contextA = com.neeeex.eraser.y.Companion.a();
        return (contextA == null || (string = com.neeeex.eraser.utils.g.b(contextA).getString(new Integer[]{Integer.valueOf(R$string.push_neeeex_content_retain_ad_inter_overtime)}[i10].intValue())) == null) ? "" : string;
    }

    public static CharSequence D(int i10) {
        return "";
    }

    private final RemoteViews F(int i10, int i11, CharSequence charSequence, PendingIntent pendingIntent) {
        Context contextA = com.neeeex.eraser.y.Companion.a();
        RemoteViews remoteViews = new RemoteViews(contextA != null ? contextA.getPackageName() : null, i10);
        G(remoteViews, i11, charSequence);
        remoteViews.setOnClickPendingIntent(R$id.rl_container, pendingIntent);
        return remoteViews;
    }

    private final void G(RemoteViews remoteViews, int i10, CharSequence charSequence) {
        String string;
        remoteViews.setImageViewResource(R$id.iv_neeeex_icon, i10);
        remoteViews.setTextViewText(R$id.tv_neeeex_content, charSequence);
        int i11 = R$id.tv_neeeex_button;
        Context contextN = n();
        if (contextN == null || (string = contextN.getString(l())) == null) {
            string = "";
        }
        remoteViews.setTextViewText(i11, string);
    }

    public final PendingIntent E(int i10, int i11, String str, int i12) {
        Bundle bundle = new Bundle();
        z(bundle, i11, str, i12);
        fl.m0 m0Var = fl.m0.f80959a;
        return ri.a.f(this, i10, bundle, false, 4, null);
    }

    @Override // ri.a
    public fl.y s(int i10, int i11, String str, int i12) {
        com.neeeex.eraser.m0.a("BSozapiJyCsC\n", "ZkJSBPbspGI=\n");
        str.getClass();
        int i13 = R$drawable.ic_neeeex_retain_overtime;
        CharSequence charSequence = (CharSequence) v().invoke(0);
        PendingIntent pendingIntentE = E(i10, i11, str, i12);
        RemoteViews remoteViewsF = F(R$layout.push_neeeex_recover_small, i13, charSequence, pendingIntentE);
        RemoteViews remoteViewsF2 = F(R$layout.push_neeeex_recover_mid, i13, charSequence, pendingIntentE);
        if (com.neeeex.eraser.utils.c0.f66142a.d()) {
            remoteViewsF2.setViewVisibility(R$id.iv_neeeex_none, 0);
        }
        return new fl.y(remoteViewsF, remoteViewsF2, F(R$layout.push_neeeex_recover_large, i13, charSequence, pendingIntentE));
    }

    @Override // ri.a
    public PendingIntent t(int i10, int i11, String str, int i12) {
        com.neeeex.eraser.m0.a("HxVXQ7lBOVwY\n", "fH02LdckVRU=\n");
        str.getClass();
        return E(i10, i11, str, i12);
    }

    @Override // ri.a
    public CharSequence u() {
        return (CharSequence) v().invoke(0);
    }

    public static final class a {
        public /* synthetic */ a(p003kotlin.jvm.internal.m mVar) {
            this();
        }

        public a() {
        }
    }
}