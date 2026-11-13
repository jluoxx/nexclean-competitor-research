package ni;

import android.content.Context;
import android.os.RemoteException;
import com.android.installreferrer.api.InstallReferrerClient;
import com.android.installreferrer.api.InstallReferrerStateListener;
import com.android.installreferrer.api.ReferrerDetails;
import com.neeeex.eraser.m0;
import com.neeeex.eraser.utils.b0;
import gl.b1;
import java.util.Collection;
import java.util.Iterator;
import java.util.Set;
import p003kotlin.jvm.internal.m;
import p003kotlin.jvm.internal.v;
import p003kotlin.text.k0;
import tl.p;

/* JADX INFO: loaded from: classes7.dex */
public final class c {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final String f89481b = "referrer_status" /* decoded XOR */;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final String f89482c = "referrer_end_time" /* decoded XOR */;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final c f89480a = new c();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final Set f89483d = b1.k("utm_source=organic" /* decoded XOR */, "utm_source=not%20set" /* decoded XOR */, "utm_source=(not set)" /* decoded XOR */, "utm_source=(not%20set)" /* decoded XOR */, "utm_medium=organic" /* decoded XOR */);

    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f89486a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final long f89487b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final long f89488c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final boolean f89489d;

        public b(String str, long j10, long j11, boolean z10) {
            this.f89486a = str;
            this.f89487b = j10;
            this.f89488c = j11;
            this.f89489d = z10;
        }

        public final long a() {
            return this.f89487b;
        }

        public final long b() {
            return this.f89488c;
        }

        public final boolean c() {
            return this.f89489d;
        }

        public final String d() {
            return this.f89486a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return v.c(this.f89486a, bVar.f89486a) && this.f89487b == bVar.f89487b && this.f89488c == bVar.f89488c && this.f89489d == bVar.f89489d;
        }

        public int hashCode() {
            String str = this.f89486a;
            return ((((((str == null ? 0 : str.hashCode()) * 31) + Long.hashCode(this.f89487b)) * 31) + Long.hashCode(this.f89488c)) * 31) + Boolean.hashCode(this.f89489d);
        }

        public String toString() {
            return "ReferrerResult(referrer=" + this.f89486a + ", clickTime=" + this.f89487b + ", installTime=" + this.f89488c + ", instant=" + this.f89489d + ")";
        }
    }

    /* JADX INFO: renamed from: ni.c$c, reason: collision with other inner class name */
    public static final class C1157c implements InstallReferrerStateListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ InstallReferrerClient f89490a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ p f89491b;

        public C1157c(InstallReferrerClient installReferrerClient, p pVar) {
            this.f89490a = installReferrerClient;
            this.f89491b = pVar;
        }

        @Override // com.android.installreferrer.api.InstallReferrerStateListener
        public void onInstallReferrerServiceDisconnected() {
            this.f89490a.endConnection();
        }

        @Override // com.android.installreferrer.api.InstallReferrerStateListener
        public void onInstallReferrerSetupFinished(int i10) {
            InstallReferrerClient installReferrerClient = this.f89490a;
            if (i10 != 0) {
                installReferrerClient.endConnection();
                return;
            }
            try {
                try {
                    ReferrerDetails installReferrer = installReferrerClient.getInstallReferrer();
                    if (installReferrer != null) {
                        b bVar = new b(installReferrer.getInstallReferrer(), installReferrer.getReferrerClickTimestampSeconds(), installReferrer.getInstallBeginTimestampSeconds(), installReferrer.getGooglePlayInstantParam());
                        this.f89491b.invoke(bVar.d(), Long.valueOf(bVar.a()), Long.valueOf(bVar.b()), Boolean.valueOf(bVar.c()));
                    }
                } catch (RemoteException e10) {
                    e10.printStackTrace();
                }
            } finally {
                this.f89490a.endConnection();
            }
        }
    }

    public static fl.m0 a(String str, long j10, long j11, boolean z10) {
        b0 b0Var = b0.f66131a;
        b0Var.B(f89481b, a.Companion.b(str).getStoredValue());
        b0Var.C(f89482c, System.currentTimeMillis());
        return fl.m0.f80959a;
    }

    public final void c(Context context) {
        "context" /* decoded XOR */;
        context.getClass();
        if (b0.f66131a.u(f89481b, -1) != -1) {
            return;
        }
        d(context, new p() { // from class: ni.b
            @Override // tl.p
            public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
                return c.a((String) obj, ((Long) obj2).longValue(), ((Long) obj3).longValue(), ((Boolean) obj4).booleanValue());
            }
        });
    }

    public final void d(Context context, p pVar) {
        "context" /* decoded XOR */;
        context.getClass();
        "onReferrerReceived" /* decoded XOR */;
        pVar.getClass();
        InstallReferrerClient installReferrerClientBuild = InstallReferrerClient.newBuilder(context).build();
        if (installReferrerClientBuild != null) {
            installReferrerClientBuild.startConnection(new C1157c(installReferrerClientBuild, pVar));
        }
    }

    public enum a {
        ORGANIC(0),
        PAID(1);

        private final int storedValue;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ ml.a f89485b = ml.b.a(d());
        public static final C1156a Companion = new C1156a(null);

        a(int i10) {
            this.storedValue = i10;
        }

        public static ml.a getEntries() {
            return f89485b;
        }

        public final int getStoredValue() {
            return this.storedValue;
        }

        /* JADX INFO: renamed from: ni.c$a$a, reason: collision with other inner class name */
        public static final class C1156a {
            public /* synthetic */ C1156a(m mVar) {
                this();
            }

            public final boolean a(String str) {
                if (str == null) {
                    return false;
                }
                if (k0.c0(str, "gclid=" /* decoded XOR */, false, 2, null)) {
                    return true;
                }
                if (!k0.c0(str, "utm_source=" /* decoded XOR */, false, 2, null)) {
                    return false;
                }
                Set set = c.f89483d;
                if ((set instanceof Collection) && set.isEmpty()) {
                    return true;
                }
                Iterator it = set.iterator();
                while (it.hasNext()) {
                    if (k0.c0(str, (CharSequence) it.next(), false, 2, null)) {
                        return false;
                    }
                }
                return true;
            }

            public final a b(String str) {
                return a(str) ? a.PAID : a.ORGANIC;
            }

            public C1156a() {
            }
        }
    }
}