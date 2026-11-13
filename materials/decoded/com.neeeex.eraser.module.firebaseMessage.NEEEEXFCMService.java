package com.neeeex.eraser.module.firebaseMessage;

import android.content.res.Resources;
import android.text.TextUtils;
import com.google.firebase.messaging.FirebaseMessagingService;
import com.neeeex.eraser.m0;
import com.neeeex.eraser.push.service.NEEEEXFGService;
import com.neeeex.eraser.utils.b0;
import com.neeeex.eraser.utils.c0;
import com.neeeex.eraser.utils.f;
import java.util.Calendar;
import java.util.Locale;
import mi.a;
import pi.d;
import pi.e;

/* JADX INFO: loaded from: classes7.dex */
public class NEEEEXFCMService extends FirebaseMessagingService {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final String f65235h = "FCM" /* decoded XOR */;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final String f65236i = "sp_neeeex_device_push_word" /* decoded XOR */;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final String f65237j = "sp_neeeex_device_push_token" /* decoded XOR */;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final String f65238k = "sp_neeeex_topic_push" /* decoded XOR */;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final String f65239l = "sp_neeeex_fcm_fg_service_start_day" /* decoded XOR */;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final Object f65240m = new Object();

    public static Locale w() {
        return Resources.getSystem().getConfiguration().getLocales().get(0);
    }

    @Override // com.google.firebase.messaging.FirebaseMessagingService
    public void p(bg.m0 m0Var) {
        super.p(m0Var);
        if (m0Var.getPriority() == 1) {
            x();
            a.f88870a.R();
        } else {
            a.f88870a.S();
        }
        a.f88870a.Q();
        if (com.neeeex.eraser.module.report.bytedance.a.k() && d.f91409a.a(this)) {
            e.f91413a.d();
        }
    }

    @Override // com.google.firebase.messaging.FirebaseMessagingService
    public void r(String str) {
        super.r(str);
        try {
            if (TextUtils.isEmpty(str)) {
                return;
            }
            b0.f66131a.D("push_token" /* decoded XOR */, str);
            new li.a().h(this, str, u(), "1.3.5" /* decoded XOR */);
        } catch (Throwable unused) {
        }
    }

    public final String u() {
        String strA = f.f66153a.a();
        return "system" /* decoded XOR */.equalsIgnoreCase(strA) ? w().getLanguage() : strA;
    }

    public final long v() {
        Calendar calendar = Calendar.getInstance();
        return (((long) calendar.get(1)) * 1000) + ((long) calendar.get(6));
    }

    public final void x() {
        synchronized (f65240m) {
            try {
                if (c0.f66142a.c(this)) {
                    return;
                }
                long jV = v();
                b0 b0Var = b0.f66131a;
                String str = f65239l;
                if (b0Var.v(str, 0L) == jV) {
                    return;
                }
                NEEEEXFGService.INSTANCE.b(this);
                b0Var.C(str, jV);
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}