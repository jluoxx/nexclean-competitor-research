package com.neeeex.eraser;

import android.app.Application;
import android.os.Environment;
import android.os.StatFs;
import androidx.p002lifecycle.AndroidViewModel;
import androidx.p002lifecycle.MutableLiveData;

/* JADX INFO: loaded from: classes7.dex */
public final class a extends AndroidViewModel {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Application f64879a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ii.e f64880b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final MutableLiveData f64881c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final MutableLiveData f64882d;

    /* JADX INFO: renamed from: com.neeeex.eraser.a$a, reason: collision with other inner class name */
    public static final class C0774a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final long f64883a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final long f64884b;

        public C0774a(long j10, long j11) {
            this.f64883a = j10;
            this.f64884b = j11;
        }

        public final long a() {
            return this.f64884b;
        }

        public final long b() {
            return this.f64884b - this.f64883a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C0774a)) {
                return false;
            }
            C0774a c0774a = (C0774a) obj;
            return this.f64883a == c0774a.f64883a && this.f64884b == c0774a.f64884b;
        }

        public int hashCode() {
            return (Long.hashCode(this.f64883a) * 31) + Long.hashCode(this.f64884b);
        }

        public String toString() {
            return "StorageSnapshot(availableBytes=" + this.f64883a + ", totalBytes=" + this.f64884b + ")";
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(Application application) {
        super(application);
        m0.a("DWJF/+M2+NsFfVs=\n", "bBI1k4pVma8=\n");
        application.getClass();
        this.f64879a = application;
        this.f64880b = new ii.e();
        this.f64881c = new MutableLiveData();
        this.f64882d = new MutableLiveData();
    }

    public final void d() {
        C0774a c0774aE = e();
        hi.a.f83493a.g(fl.z.a(Long.valueOf(c0774aE.b()), Long.valueOf(c0774aE.a())));
    }

    public final C0774a e() {
        StatFs statFs = new StatFs(Environment.getDataDirectory().getPath());
        return new C0774a(statFs.getAvailableBytes(), statFs.getBlockCountLong() * statFs.getBlockSizeLong());
    }
}