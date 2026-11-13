package com.neeeex.ctools.features.networkspeed;

import androidx.p002lifecycle.ViewModel;
import androidx.p002lifecycle.ViewModelProvider;
import androidx.p002lifecycle.viewmodel.CreationExtras;
import com.neeeex.eraser.m0;

/* JADX INFO: loaded from: classes7.dex */
public final class x implements ViewModelProvider.Factory {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final e f64559a;

    public x(e eVar) {
        "measurement" /* decoded XOR */;
        eVar.getClass();
        this.f64559a = eVar;
    }

    @Override // androidx.lifecycle.ViewModelProvider.Factory
    public ViewModel create(Class cls) {
        "modelClass" /* decoded XOR */;
        cls.getClass();
        if (cls.isAssignableFrom(v.class)) {
            return new v(this.f64559a);
        }
        gq.e.a("Unknown ViewModel class" /* decoded XOR */);
        return null;
    }

    public /* synthetic */ x(e eVar, int i10, p003kotlin.jvm.internal.m mVar) {
        this((i10 & 1) != 0 ? new n() : eVar);
    }

    @Override // androidx.lifecycle.ViewModelProvider.Factory
    public /* bridge */ ViewModel create(Class cls, CreationExtras creationExtras) {
        return super.create(cls, creationExtras);
    }
}