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
public final class g2 extends ri.a {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final a f92970s = new a(null);

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final String f92971r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g2(String str) {
        super(null, false, 202, 0, 0, 0, false, new Function1() { // from class: ri.e2
            @Override // p003kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return g2.C(((Integer) obj).intValue());
            }
        }, new Function1() { // from class: ri.f2
            @Override // p003kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return g2.D(((Integer) obj).intValue());
            }
        }, R$string.common_neeeex_view, 0, 0, false, 0L, false, false, false, 130155, null);
        com.neeeex.eraser.m0.a("dc0lpNyD3zdGyyWsw4TqCknJPKA=\n", "B6hRxbXtnnM=\n");
        str.getClass();
        this.f92971r = str;
    }

    public static CharSequence C(int i10) {
        String string;
        Context contextA = com.neeeex.eraser.y.Companion.a();
        return (contextA == null || (string = com.neeeex.eraser.utils.g.b(contextA).getString(new Integer[]{Integer.valueOf(R$string.push_neeeex_scan_end)}[i10].intValue())) == null) ? "" : string;
    }

    public static CharSequence D(int i10) {
        return "";
    }

    private final RemoteViews E(int i10, int i11, CharSequence charSequence, PendingIntent pendingIntent) {
        Context contextA = com.neeeex.eraser.y.Companion.a();
        RemoteViews remoteViews = new RemoteViews(contextA != null ? contextA.getPackageName() : null, i10);
        F(remoteViews, i11, charSequence);
        remoteViews.setOnClickPendingIntent(R$id.rl_container, pendingIntent);
        return remoteViews;
    }

    private final void F(RemoteViews remoteViews, int i10, CharSequence charSequence) {
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

    @Override // ri.a
    public fl.y s(int i10, int i11, String str, int i12) {
        com.neeeex.eraser.m0.a("7e7yPxUNfxzq\n", "joaTUXtoE1U=\n");
        str.getClass();
        int i13 = R$drawable.ic_neeeex_push_scan_end;
        CharSequence charSequence = (CharSequence) v().invoke(0);
        String str2 = this.f92971r;
        Bundle bundle = new Bundle();
        z(bundle, i11, str, i12);
        fl.m0 m0Var = fl.m0.f80959a;
        PendingIntent pendingIntentJ = ri.a.j(this, str2, i10, bundle, false, 8, null);
        RemoteViews remoteViewsE = E(R$layout.push_neeeex_recover_small, i13, charSequence, pendingIntentJ);
        RemoteViews remoteViewsE2 = E(R$layout.push_neeeex_recover_mid, i13, charSequence, pendingIntentJ);
        if (com.neeeex.eraser.utils.c0.f66142a.d()) {
            remoteViewsE2.setViewVisibility(R$id.iv_neeeex_none, 0);
        }
        return new fl.y(remoteViewsE, remoteViewsE2, E(R$layout.push_neeeex_recover_large, i13, charSequence, pendingIntentJ));
    }

    @Override // ri.a
    public PendingIntent t(int i10, int i11, String str, int i12) {
        com.neeeex.eraser.m0.a("8Kn+wQUI54v3\n", "k8Gfr2tti8I=\n");
        str.getClass();
        String str2 = this.f92971r;
        Bundle bundle = new Bundle();
        z(bundle, i11, str, i12);
        fl.m0 m0Var = fl.m0.f80959a;
        return ri.a.j(this, str2, i10, bundle, false, 8, null);
    }

    public static final class a {
        public /* synthetic */ a(p003kotlin.jvm.internal.m mVar) {
            this();
        }

        public a() {
        }
    }
}