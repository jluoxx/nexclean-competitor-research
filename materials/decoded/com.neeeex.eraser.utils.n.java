package com.neeeex.eraser.utils;

import androidx.p002lifecycle.LifecycleOwner;
import androidx.p002lifecycle.MutableLiveData;
import androidx.p002lifecycle.Observer;
import com.neeeex.eraser.m0;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes7.dex */
public final class n extends MutableLiveData {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final AtomicBoolean f66195a = new AtomicBoolean();

    public static void a(n nVar, Observer observer, Object obj) {
        if (nVar.f66195a.getAndSet(false)) {
            observer.onChanged(obj);
        }
    }

    public final void b(Object obj, boolean z10) {
        this.f66195a.set(true);
        if (z10) {
            super.postValue(obj);
        } else {
            super.setValue(obj);
        }
    }

    @Override // androidx.p002lifecycle.LiveData
    public void observe(LifecycleOwner lifecycleOwner, final Observer observer) {
        "owner" /* decoded XOR */;
        lifecycleOwner.getClass();
        "observer" /* decoded XOR */;
        observer.getClass();
        super.observe(lifecycleOwner, new Observer() { // from class: com.neeeex.eraser.utils.m
            @Override // androidx.p002lifecycle.Observer
            public final void onChanged(Object obj) {
                n.a(this.f66193a, observer, obj);
            }
        });
    }

    @Override // androidx.p002lifecycle.MutableLiveData, androidx.p002lifecycle.LiveData
    public void postValue(Object obj) {
        b(obj, true);
    }

    @Override // androidx.p002lifecycle.MutableLiveData, androidx.p002lifecycle.LiveData
    public void setValue(Object obj) {
        b(obj, false);
    }
}