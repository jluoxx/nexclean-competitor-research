package com.thinkup.core.common.n;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.text.TextUtils;
import com.thinkup.core.common.nn.m0;

/* JADX INFO: loaded from: classes7.dex */
public final class d0 extends o {

    /* JADX INFO: renamed from: dm, reason: collision with root package name */
    d f71530dm;

    public interface d {
        void d(PackageInfo packageInfo);
    }

    public d0(Context context, String str, d dVar) {
        super(context, str, "", 0L);
        this.f71530dm = dVar;
    }

    @Override // com.thinkup.core.common.n.q
    public final n m() {
        PackageInfo packageInfoD = !TextUtils.isEmpty(this.f71563o) ? m0.d(this.f71564q, this.f71563o) : null;
        d dVar = this.f71530dm;
        if (dVar != null) {
            dVar.d(packageInfoD);
        }
        return null;
    }

    @Override // com.thinkup.core.common.n.q
    public final int n() {
        return 3;
    }

    private d0(Context context, String str, String str2, long j10) {
        super(context, str, str2, j10);
    }
}