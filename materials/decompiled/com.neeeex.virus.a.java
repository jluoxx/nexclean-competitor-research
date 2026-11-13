package com.neeeex.virus;

import android.content.Context;
import com.neeeex.eraser.R$string;
import com.neeeex.eraser.m0;
import com.trustlook.sdk.cloudscan.CloudScanClient;
import com.trustlook.sdk.cloudscan.CloudScanListener;
import com.trustlook.sdk.data.AppInfo;
import com.trustlook.sdk.data.Region;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import p003kotlin.text.k0;

/* JADX INFO: loaded from: classes7.dex */
public final class a implements u {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final C0822a f66640c = new C0822a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f66641a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final CloudScanClient f66642b;

    public static final class b extends CloudScanListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ u.a f66643a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ a f66644b;

        public b(u.a aVar, a aVar2) {
            this.f66643a = aVar;
            this.f66644b = aVar2;
        }

        @Override // com.trustlook.sdk.cloudscan.CloudScanListener
        public void onScanCanceled() {
            this.f66643a.onCanceled();
        }

        @Override // com.trustlook.sdk.cloudscan.CloudScanListener
        public void onScanError(int i10, String str) {
            u.a aVar = this.f66643a;
            if (str == null) {
                str = "";
            }
            aVar.onError(i10, str);
        }

        @Override // com.trustlook.sdk.cloudscan.CloudScanListener
        public void onScanFinished(List list) {
            u.a aVar = this.f66643a;
            if (list == null) {
                list = gl.w.m();
            }
            a aVar2 = this.f66644b;
            ArrayList arrayList = new ArrayList();
            Iterator it = list.iterator();
            while (it.hasNext()) {
                e0 e0VarD = aVar2.d((AppInfo) it.next());
                if (e0VarD != null) {
                    arrayList.add(e0VarD);
                }
            }
            HashSet hashSet = new HashSet();
            ArrayList arrayList2 = new ArrayList();
            for (Object obj : arrayList) {
                if (hashSet.add(((e0) obj).g())) {
                    arrayList2.add(obj);
                }
            }
            aVar.c(arrayList2);
        }

        @Override // com.trustlook.sdk.cloudscan.CloudScanListener
        public void onScanInterrupt() {
            u.a aVar = this.f66643a;
            String string = this.f66644b.f66641a.getString(R$string.virus_neeeex_scan_interrupted);
            m0.a("zDTHHb3lgxnMeZ1g574=\n", "q1GzTsmX6nc=\n");
            string.getClass();
            aVar.onError(-2, string);
        }

        @Override // com.trustlook.sdk.cloudscan.CloudScanListener
        public void onScanProgress(int i10, int i11, AppInfo appInfo) {
            m0.a("CGiLJUhY\n", "eg34UCQsCto=\n");
            appInfo.getClass();
            u.a aVar = this.f66643a;
            String appName = appInfo.getAppName();
            if (appName == null) {
                appName = "";
            }
            if (k0.r0(appName)) {
                String packageName = appInfo.getPackageName();
                appName = packageName != null ? packageName : "";
            }
            aVar.a(i10, i11, appName, this.f66644b.d(appInfo));
        }

        @Override // com.trustlook.sdk.cloudscan.CloudScanListener
        public void onScanStarted() {
            this.f66643a.b();
        }
    }

    public a(Context context) {
        m0.a("vc+Lef+kVQ==\n", "3qDlDZrcIS4=\n");
        context.getClass();
        Context applicationContext = context.getApplicationContext();
        this.f66641a = applicationContext;
        this.f66642b = new CloudScanClient.Builder(applicationContext).setRegion(Region.INTL).setConnectionTimeout(30000).setSocketTimeout(30000).build();
    }

    @Override // com.neeeex.virus.u
    public void a(u.a aVar) {
        m0.a("575QfehkfJk=\n", "i9cjCY0KGes=\n");
        aVar.getClass();
        try {
            this.f66642b.startComprehensiveScan(100, new b(aVar, this));
        } catch (Throwable th2) {
            String message = th2.getMessage();
            if (message == null) {
                message = "";
            }
            aVar.onError(-3, message);
        }
    }

    @Override // com.neeeex.virus.u
    public void cancel() {
        try {
            fl.u.a aVar = fl.u.Companion;
            this.f66642b.cancelScan();
            fl.u.m372constructorimpl(fl.m0.f80959a);
        } catch (Throwable th2) {
            fl.u.a aVar2 = fl.u.Companion;
            fl.u.m372constructorimpl(fl.v.a(th2));
        }
    }

    public final e0 d(AppInfo appInfo) {
        if (!g0.f66682a.b(appInfo.getScore())) {
            return null;
        }
        String packageName = appInfo.getPackageName();
        if (packageName == null) {
            packageName = "";
        }
        String appName = appInfo.getAppName();
        if (appName == null) {
            appName = "";
        }
        String apkPath = appInfo.getApkPath();
        if (apkPath == null) {
            apkPath = "";
        }
        int score = appInfo.getScore();
        String str = appName;
        String str2 = apkPath;
        long sizeInBytes = appInfo.getSizeInBytes();
        boolean installed = appInfo.getInstalled();
        String virusName = appInfo.getVirusName();
        return new e0(packageName, str, str2, score, sizeInBytes, installed, virusName != null ? virusName : "");
    }

    /* JADX INFO: renamed from: com.neeeex.virus.a$a, reason: collision with other inner class name */
    public static final class C0822a {
        public /* synthetic */ C0822a(p003kotlin.jvm.internal.m mVar) {
            this();
        }

        public C0822a() {
        }
    }
}