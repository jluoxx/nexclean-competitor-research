package com.neeeex.eraser.launcher;

import android.content.Intent;
import android.os.Parcel;
import android.util.Base64;
import com.neeeex.eraser.m0;
import p003kotlin.Metadata;
import p003kotlin.text.k0;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\t\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\t\u0010\nR\u0014\u0010\f\u001a\u00020\u000b8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"Lcom/neeeex/eraser/launcher/PendingToolEntry;", "", "<init>", "()V", "Landroid/content/Intent;", "intent", "Lfl/m0;", "save", "(Landroid/content/Intent;)V", "consume", "()Landroid/content/Intent;", "", "KEY", "Ljava/lang/String;", "tool-feature_productionRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class PendingToolEntry {
    private static final String KEY = "neeeex_pending_startup_entry" /* decoded XOR */;
    public static final PendingToolEntry INSTANCE = new PendingToolEntry();

    private PendingToolEntry() {
    }

    public final Intent consume() {
        com.neeeex.eraser.utils.b0 b0Var = com.neeeex.eraser.utils.b0.f66131a;
        String str = KEY;
        String strW = b0Var.w(str);
        if (k0.r0(strW)) {
            return null;
        }
        b0Var.E(str);
        Parcel parcelObtain = Parcel.obtain();
        "obtain(...)" /* decoded XOR */;
        parcelObtain.getClass();
        try {
            byte[] bArrDecode = Base64.decode(strW, 2);
            parcelObtain.unmarshall(bArrDecode, 0, bArrDecode.length);
            parcelObtain.setDataPosition(0);
            Object objCreateFromParcel = Intent.CREATOR.createFromParcel(parcelObtain);
            ((Intent) objCreateFromParcel).setExtrasClassLoader(PendingToolEntry.class.getClassLoader());
            return (Intent) objCreateFromParcel;
        } catch (RuntimeException unused) {
            return null;
        } finally {
            parcelObtain.recycle();
        }
    }

    public final void save(Intent intent) {
        "intent" /* decoded XOR */;
        intent.getClass();
        Parcel parcelObtain = Parcel.obtain();
        "obtain(...)" /* decoded XOR */;
        parcelObtain.getClass();
        try {
            intent.writeToParcel(parcelObtain, 0);
            com.neeeex.eraser.utils.b0.f66131a.D(KEY, Base64.encodeToString(parcelObtain.marshall(), 2));
        } finally {
            parcelObtain.recycle();
        }
    }
}