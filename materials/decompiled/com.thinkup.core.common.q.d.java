package com.thinkup.core.common.q;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import com.mbridge.msdk.playercommon.exoplayer2.text.ttml.TtmlNode;
import com.thinkup.core.api.TUInitMediation;
import com.thinkup.core.common.nn.mo;
import com.thinkup.core.common.o.nd;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes7.dex */
public class d {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int f73190d = -1;

    /* JADX INFO: renamed from: d0, reason: collision with root package name */
    private static volatile d f73191d0 = null;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final int f73192m = 1;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final int f73193n = 2;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final int f73194o = 3;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private final String f73196q = "AdxSDKDetectManager";

    /* JADX INFO: renamed from: dd, reason: collision with root package name */
    private final AtomicBoolean f73195dd = new AtomicBoolean(false);

    /* JADX INFO: renamed from: com.thinkup.core.common.q.d$1, reason: invalid class name */
    public class AnonymousClass1 implements Runnable {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ Activity f73197d;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        final /* synthetic */ m f73198m;

        private AnonymousClass1(Activity activity, m mVar) {
            this.f73197d = activity;
            this.f73198m = mVar;
        }

        @Override // java.lang.Runnable
        public final void run() {
            try {
                String string = this.f73197d.getResources().getString(mo.d(this.f73197d, "adx_sdk_check_tips_title", "string"));
                String string2 = this.f73197d.getResources().getString(mo.d(this.f73197d, "adx_sdk_check_tips_confirm", "string"));
                Activity activity = this.f73197d;
                AlertDialog.Builder builder = new AlertDialog.Builder(activity, mo.d(activity, "system_dialog", TtmlNode.TAG_STYLE));
                builder.setTitle(string).setMessage(this.f73198m.f73203m).setCancelable(true).setPositiveButton(string2, new DialogInterface.OnClickListener() { // from class: com.thinkup.core.common.q.d.1.1
                    @Override // android.content.DialogInterface.OnClickListener
                    public final void onClick(DialogInterface dialogInterface, int i10) {
                        dialogInterface.dismiss();
                    }
                });
                AlertDialog alertDialogCreate = builder.create();
                alertDialogCreate.setOnShowListener(new DialogInterface.OnShowListener() { // from class: com.thinkup.core.common.q.d.1.2
                    @Override // android.content.DialogInterface.OnShowListener
                    public final void onShow(DialogInterface dialogInterface) {
                        d.this.f73195dd.set(true);
                    }
                });
                alertDialogCreate.show();
            } catch (Throwable unused) {
            }
        }
    }

    private d() {
    }

    public static m d(Context context) {
        try {
            try {
                Object objInvoke = Class.forName("com.thinkup.network.adx.AdxTUInitManager").getDeclaredMethod("getInstance", null).invoke(null, null);
                if (objInvoke != null && (objInvoke instanceof TUInitMediation)) {
                    try {
                        Class.forName(((TUInitMediation) objInvoke).getNetworkSDKClass());
                    } catch (Throwable th2) {
                        String string = "There is a problem with the integrated TU SDK:Adx aar is missing";
                        if (context != null) {
                            string = context.getResources().getString(mo.d(context, "adx_sdk_check_tips_miss_sdk", "string"));
                            try {
                                string = String.format(string, "thinkup");
                            } catch (Throwable unused) {
                            }
                        }
                        return new m(2, string, th2.getMessage());
                    }
                }
            } catch (Throwable th3) {
                String string2 = "There is a problem with the integrated TU SDK:Adx Adapter is missing";
                if (context != null) {
                    string2 = context.getResources().getString(mo.d(context, "adx_sdk_check_tips_miss_adapter", "string"));
                    try {
                        string2 = String.format(string2, "thinkup");
                    } catch (Throwable unused2) {
                    }
                }
                return new m(1, string2, th3.getMessage());
            }
        } catch (Throwable unused3) {
        }
        return null;
    }

    public static d d() {
        if (f73191d0 == null) {
            synchronized (d.class) {
                try {
                    if (f73191d0 == null) {
                        f73191d0 = new d();
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        return f73191d0;
    }

    private static void d(Activity activity) {
        if (activity == null) {
            return;
        }
        nd.m();
    }
}