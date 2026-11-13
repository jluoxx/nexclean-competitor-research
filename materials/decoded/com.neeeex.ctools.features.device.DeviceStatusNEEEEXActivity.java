package com.neeeex.ctools.features.device;

import android.R;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Build;
import android.os.Bundle;
import android.os.SystemClock;
import android.text.format.Formatter;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.core.view.a1;
import androidx.core.view.c1;
import androidx.core.view.d1;
import androidx.core.view.y;
import androidx.fragment.app.l0;
import androidx.p002lifecycle.LifecycleOwnerKt;
import b.k0;
import b.o0;
import com.airbnb.lottie.LottieAnimationView;
import com.mbridge.msdk.foundation.download.core.DownloadCommon;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.neeeex.eraser.R$id;
import com.neeeex.eraser.R$layout;
import com.neeeex.eraser.R$string;
import com.neeeex.eraser.base.BaseAdActivity;
import com.neeeex.eraser.base.BaseStoragePermActivity;
import com.neeeex.eraser.m0;
import com.neeeex.eraser.module.dialog.ExitScanDialog;
import com.pgl.ssdk.b0;
import fl.z;
import gl.q0;
import gl.v0;
import gl.w;
import gl.x;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.f1;
import kotlinx.coroutines.p0;
import kotlinx.coroutines.z0;
import p003kotlin.Metadata;
import p003kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000°\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0010\t\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\b\b*\u0002\u0089\u0001\u0018\u0000 \u008d\u00012\u00020\u0001:\u0005W\u008e\u0001\u008f\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0019\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0014¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\n\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\u0004H\u0014¢\u0006\u0004\b\n\u0010\bJ\u0017\u0010\r\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\u000bH\u0014¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u000f\u001a\u00020\u0006H\u0014¢\u0006\u0004\b\u000f\u0010\u0003J\u000f\u0010\u0010\u001a\u00020\u0006H\u0014¢\u0006\u0004\b\u0010\u0010\u0003J\u000f\u0010\u0011\u001a\u00020\u0006H\u0014¢\u0006\u0004\b\u0011\u0010\u0003J\u000f\u0010\u0012\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0012\u0010\u0003J\u000f\u0010\u0013\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0013\u0010\u0003J\u000f\u0010\u0014\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0014\u0010\u0003J\u000f\u0010\u0015\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0015\u0010\u0003J\u000f\u0010\u0016\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0016\u0010\u0003J\u000f\u0010\u0017\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0017\u0010\u0003J\u0011\u0010\u0018\u001a\u0004\u0018\u00010\u000bH\u0002¢\u0006\u0004\b\u0018\u0010\u0019J\u000f\u0010\u001a\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u001a\u0010\u0003J\u000f\u0010\u001b\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u001b\u0010\u0003J\u000f\u0010\u001c\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u001c\u0010\u0003J\u0017\u0010\u001f\u001a\u00020\u00062\u0006\u0010\u001e\u001a\u00020\u001dH\u0002¢\u0006\u0004\b\u001f\u0010 J/\u0010'\u001a\u00020\u00062\u0006\u0010\"\u001a\u00020!2\u0006\u0010$\u001a\u00020#2\u0006\u0010%\u001a\u00020#2\u0006\u0010&\u001a\u00020#H\u0002¢\u0006\u0004\b'\u0010(J\u000f\u0010)\u001a\u00020\u0006H\u0002¢\u0006\u0004\b)\u0010\u0003J\u0017\u0010+\u001a\u00020\u00062\u0006\u0010*\u001a\u00020#H\u0002¢\u0006\u0004\b+\u0010,J\u000f\u0010.\u001a\u00020-H\u0002¢\u0006\u0004\b.\u0010/J\u000f\u00100\u001a\u00020\u0006H\u0002¢\u0006\u0004\b0\u0010\u0003J\u0010\u00101\u001a\u00020\u0006H\u0082@¢\u0006\u0004\b1\u00102J\u0017\u00103\u001a\u00020\u00062\u0006\u0010*\u001a\u00020#H\u0002¢\u0006\u0004\b3\u0010,J\u000f\u00104\u001a\u00020\u0006H\u0002¢\u0006\u0004\b4\u0010\u0003J\u000f\u00105\u001a\u00020\u0006H\u0002¢\u0006\u0004\b5\u0010\u0003J\u000f\u00106\u001a\u00020\u0006H\u0002¢\u0006\u0004\b6\u0010\u0003J\u000f\u00107\u001a\u00020\u0006H\u0002¢\u0006\u0004\b7\u0010\u0003J)\u0010<\u001a\u00020;2\u0006\u00109\u001a\u0002082\u0006\u0010:\u001a\u00020#2\b\b\u0002\u0010$\u001a\u00020#H\u0002¢\u0006\u0004\b<\u0010=J\u0017\u0010@\u001a\u00020\u00062\u0006\u0010?\u001a\u00020>H\u0002¢\u0006\u0004\b@\u0010AJ\u0017\u0010C\u001a\u00020B2\u0006\u0010?\u001a\u00020>H\u0002¢\u0006\u0004\bC\u0010DJ\u0017\u0010F\u001a\u00020B2\u0006\u0010E\u001a\u00020#H\u0002¢\u0006\u0004\bF\u0010GJ\u0017\u0010H\u001a\u00020B2\u0006\u0010?\u001a\u00020#H\u0002¢\u0006\u0004\bH\u0010GJ\u0017\u0010J\u001a\u00020B2\u0006\u0010I\u001a\u00020#H\u0002¢\u0006\u0004\bJ\u0010GJ\u0017\u0010M\u001a\u00020#2\u0006\u0010L\u001a\u00020KH\u0002¢\u0006\u0004\bM\u0010NJ\u0017\u0010O\u001a\u00020#2\u0006\u0010L\u001a\u00020KH\u0002¢\u0006\u0004\bO\u0010NJ\u0017\u0010R\u001a\u00020B2\u0006\u0010Q\u001a\u00020PH\u0002¢\u0006\u0004\bR\u0010SJ\u000f\u0010T\u001a\u00020BH\u0002¢\u0006\u0004\bT\u0010UR\u0016\u0010Y\u001a\u00020V8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\bW\u0010XR\u0016\u0010]\u001a\u00020Z8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b[\u0010\\R\u0016\u0010_\u001a\u00020Z8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b^\u0010\\R\u0016\u0010c\u001a\u00020`8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\ba\u0010bR\u0016\u0010g\u001a\u00020d8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\be\u0010fR\u0016\u0010j\u001a\u00020;8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\bh\u0010iR\u0016\u0010l\u001a\u00020Z8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\bk\u0010\\R\u0016\u0010o\u001a\u0002088\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\bm\u0010nR\u0016\u0010r\u001a\u00020P8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bp\u0010qR\u0016\u0010t\u001a\u00020P8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bs\u0010qR\u0016\u0010v\u001a\u00020P8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bu\u0010qR\u0016\u0010x\u001a\u00020P8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bw\u0010qR\u0016\u0010|\u001a\u00020y8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bz\u0010{R\u0019\u0010\u0080\u0001\u001a\u0004\u0018\u00010}8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b~\u0010\u007fR\u001a\u0010\u0082\u0001\u001a\u0004\u0018\u00010}8\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b\u0081\u0001\u0010\u007fR\u0018\u0010\u0084\u0001\u001a\u00020P8\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b\u0083\u0001\u0010qR\u001a\u0010\u0088\u0001\u001a\u00030\u0085\u00018\u0002@\u0002X\u0082.¢\u0006\b\n\u0006\b\u0086\u0001\u0010\u0087\u0001R\u0018\u0010\u008c\u0001\u001a\u00030\u0089\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u008a\u0001\u0010\u008b\u0001¨\u0006\u0090\u0001"}, d2 = {"Lcom/neeeex/ctools/features/device/DeviceStatusNEEEEXActivity;", "Lcom/neeeex/eraser/base/BaseStoragePermActivity;", "<init>", "()V", "Landroid/os/Bundle;", "savedInstanceState", "Lfl/m0;", "onCreate", "(Landroid/os/Bundle;)V", "outState", "onSaveInstanceState", "Landroid/content/Intent;", "intent", "onNewIntent", "(Landroid/content/Intent;)V", "onStart", "onStop", "onDestroy", "onStoragePermission", "e1", "d1", "m1", "i1", "c1", "p1", "()Landroid/content/Intent;", "s1", "o1", "k1", "Lcom/neeeex/ctools/features/device/t;", "snapshot", "u1", "(Lcom/neeeex/ctools/features/device/t;)V", "Lcom/neeeex/ctools/features/device/u;", "metric", "", "valueId", "totalId", "progressId", "v1", "(Lcom/neeeex/ctools/features/device/u;III)V", "l1", "value", "L0", "(I)V", "", "q1", "()J", "A1", "j1", "(Lkl/f;)Ljava/lang/Object;", "t1", "y1", "z1", "Z0", "g1", "Landroid/view/ViewGroup;", "container", "labelRes", "Landroid/widget/TextView;", "X0", "(Landroid/view/ViewGroup;II)Landroid/widget/TextView;", "Lcom/neeeex/ctools/features/device/b;", "status", "r1", "(Lcom/neeeex/ctools/features/device/b;)V", "", "h1", "(Lcom/neeeex/ctools/features/device/b;)Ljava/lang/String;", "health", "a1", "(I)Ljava/lang/String;", "b1", "plugged", "f1", "Lcom/neeeex/ctools/features/device/c;", "sensor", "w1", "(Lcom/neeeex/ctools/features/device/c;)I", "x1", "", "supported", "B1", "(Z)Ljava/lang/String;", "C1", "()Ljava/lang/String;", "Lcom/neeeex/ctools/features/device/s;", "c", "Lcom/neeeex/ctools/features/device/s;", "provider", "Landroid/view/View;", "d", "Landroid/view/View;", "root", "e", "loadingView", "Lcom/airbnb/lottie/LottieAnimationView;", "f", "Lcom/airbnb/lottie/LottieAnimationView;", "loadingAnimation", "Landroid/widget/ProgressBar;", "g", "Landroid/widget/ProgressBar;", "loadingProgress", "h", "Landroid/widget/TextView;", "loadingPercentage", "i", "resultScroll", "j", "Landroid/view/ViewGroup;", "adContainer", CampaignEx.JSON_KEY_AD_K, "Z", "receiverRegistered", "l", "hasShownResult", "m", "hasRequestedResultAd", com.thinkup.core.common.nn.m.n.f72065d, "hasRequestedScanEndInterstitial", "Lcom/neeeex/ctools/features/device/DeviceStatusNEEEEXActivity$c;", com.thinkup.core.q.o.f74114d, "Lcom/neeeex/ctools/features/device/DeviceStatusNEEEEXActivity$c;", "progressTimeline", "Lkotlinx/coroutines/Job;", "p", "Lkotlinx/coroutines/Job;", "smoothProgressJob", "q", "snapshotJob", CampaignEx.JSON_KEY_AD_R, "exitInProgress", "Lcom/neeeex/ctools/features/device/DeviceStatusNEEEEXActivity$a;", "s", "Lcom/neeeex/ctools/features/device/DeviceStatusNEEEEXActivity$a;", "batteryRows", "com/neeeex/ctools/features/device/DeviceStatusNEEEEXActivity$batteryReceiver$1", "t", "Lcom/neeeex/ctools/features/device/DeviceStatusNEEEEXActivity$batteryReceiver$1;", "batteryReceiver", "u", "a", DownloadCommon.DOWNLOAD_REPORT_FIND_FILE_RESULT_VALUE_B, "tool-feature_productionRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class DeviceStatusNEEEEXActivity extends BaseStoragePermActivity {

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    public s provider;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    public View root;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    public View loadingView;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    public LottieAnimationView loadingAnimation;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    public ProgressBar loadingProgress;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    public TextView loadingPercentage;

    /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata */
    public View resultScroll;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    public ViewGroup adContainer;

    /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata */
    public boolean receiverRegistered;

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
    public boolean hasShownResult;

    /* JADX INFO: renamed from: m, reason: collision with root package name and from kotlin metadata */
    public boolean hasRequestedResultAd;

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    public boolean hasRequestedScanEndInterstitial;

    /* JADX INFO: renamed from: p, reason: collision with root package name and from kotlin metadata */
    public Job smoothProgressJob;

    /* JADX INFO: renamed from: q, reason: collision with root package name and from kotlin metadata */
    public Job snapshotJob;

    /* JADX INFO: renamed from: r, reason: collision with root package name and from kotlin metadata */
    public boolean exitInProgress;

    /* JADX INFO: renamed from: s, reason: collision with root package name and from kotlin metadata */
    public a batteryRows;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public static final String f64237y = "state_scan_end_interstitial_requested" /* decoded XOR */;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final Map f64234v = v0.n(z.a(2, Integer.valueOf(R$string.ctools_neeeex_device_battery_good)), z.a(3, Integer.valueOf(R$string.ctools_neeeex_device_battery_overheat)), z.a(4, Integer.valueOf(R$string.ctools_neeeex_device_battery_dead)), z.a(5, Integer.valueOf(R$string.ctools_neeeex_device_battery_over_voltage)), z.a(6, Integer.valueOf(R$string.ctools_neeeex_device_battery_failure)), z.a(7, Integer.valueOf(R$string.ctools_neeeex_device_battery_cold)));

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static final Map f64235w = v0.n(z.a(2, Integer.valueOf(R$string.ctools_neeeex_device_battery_charging)), z.a(3, Integer.valueOf(R$string.ctools_neeeex_device_battery_discharging)), z.a(4, Integer.valueOf(R$string.ctools_neeeex_device_battery_not_charging)), z.a(5, Integer.valueOf(R$string.ctools_neeeex_device_battery_full)));

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public static final Map f64236x = v0.n(z.a(1, Integer.valueOf(R$string.ctools_neeeex_device_battery_ac)), z.a(2, Integer.valueOf(R$string.ctools_neeeex_device_battery_usb)), z.a(4, Integer.valueOf(R$string.ctools_neeeex_device_battery_wireless)));

    /* JADX INFO: renamed from: o, reason: collision with root package name and from kotlin metadata */
    public c progressTimeline = new c();

    /* JADX INFO: renamed from: t, reason: collision with root package name and from kotlin metadata */
    public final DeviceStatusNEEEEXActivity$batteryReceiver$1 batteryReceiver = new BroadcastReceiver() { // from class: com.neeeex.ctools.features.device.DeviceStatusNEEEEXActivity$batteryReceiver$1
        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            s sVar = null;
            if (p003kotlin.jvm.internal.v.c(intent != null ? intent.getAction() : null, "android.intent.action.BATTERY_CHANGED" /* decoded XOR */)) {
                DeviceStatusNEEEEXActivity deviceStatusNEEEEXActivity = this.f64264a;
                s sVar2 = deviceStatusNEEEEXActivity.provider;
                if (sVar2 == null) {
                    p003kotlin.jvm.internal.v.n("provider" /* decoded XOR */);
                } else {
                    sVar = sVar2;
                }
                deviceStatusNEEEEXActivity.r1(sVar.p(intent));
            }
        }
    };

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final TextView f64256a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final TextView f64257b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final TextView f64258c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final TextView f64259d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final TextView f64260e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final TextView f64261f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final TextView f64262g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final TextView f64263h;

        public a(TextView textView, TextView textView2, TextView textView3, TextView textView4, TextView textView5, TextView textView6, TextView textView7, TextView textView8) {
            "health" /* decoded XOR */;
            textView.getClass();
            "currentCapacity" /* decoded XOR */;
            textView2.getClass();
            "totalCapacity" /* decoded XOR */;
            textView3.getClass();
            "voltage" /* decoded XOR */;
            textView4.getClass();
            "temperature" /* decoded XOR */;
            textView5.getClass();
            "status" /* decoded XOR */;
            textView6.getClass();
            "charging" /* decoded XOR */;
            textView7.getClass();
            "technology" /* decoded XOR */;
            textView8.getClass();
            this.f64256a = textView;
            this.f64257b = textView2;
            this.f64258c = textView3;
            this.f64259d = textView4;
            this.f64260e = textView5;
            this.f64261f = textView6;
            this.f64262g = textView7;
            this.f64263h = textView8;
        }

        public final TextView a() {
            return this.f64262g;
        }

        public final TextView b() {
            return this.f64257b;
        }

        public final TextView c() {
            return this.f64256a;
        }

        public final TextView d() {
            return this.f64261f;
        }

        public final TextView e() {
            return this.f64263h;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return p003kotlin.jvm.internal.v.c(this.f64256a, aVar.f64256a) && p003kotlin.jvm.internal.v.c(this.f64257b, aVar.f64257b) && p003kotlin.jvm.internal.v.c(this.f64258c, aVar.f64258c) && p003kotlin.jvm.internal.v.c(this.f64259d, aVar.f64259d) && p003kotlin.jvm.internal.v.c(this.f64260e, aVar.f64260e) && p003kotlin.jvm.internal.v.c(this.f64261f, aVar.f64261f) && p003kotlin.jvm.internal.v.c(this.f64262g, aVar.f64262g) && p003kotlin.jvm.internal.v.c(this.f64263h, aVar.f64263h);
        }

        public final TextView f() {
            return this.f64260e;
        }

        public final TextView g() {
            return this.f64258c;
        }

        public final TextView h() {
            return this.f64259d;
        }

        public int hashCode() {
            return (((((((((((((this.f64256a.hashCode() * 31) + this.f64257b.hashCode()) * 31) + this.f64258c.hashCode()) * 31) + this.f64259d.hashCode()) * 31) + this.f64260e.hashCode()) * 31) + this.f64261f.hashCode()) * 31) + this.f64262g.hashCode()) * 31) + this.f64263h.hashCode();
        }

        public String toString() {
            return "BatteryRows(health=" + this.f64256a + ", currentCapacity=" + this.f64257b + ", totalCapacity=" + this.f64258c + ", voltage=" + this.f64259d + ", temperature=" + this.f64260e + ", status=" + this.f64261f + ", charging=" + this.f64262g + ", technology=" + this.f64263h + ")";
        }
    }

    public static final class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public long f64265a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public volatile int f64266b;

        public final void a(int i10) {
            this.f64266b = Math.max(this.f64266b, i10);
        }

        public final List b(int i10) {
            am.j jVar = new am.j(1, 10);
            ArrayList arrayList = new ArrayList(x.x(jVar, 10));
            Iterator it = jVar.iterator();
            while (it.hasNext()) {
                arrayList.add(Integer.valueOf(((int) ((100 - i10) * (((q0) it).nextInt() / 10))) + i10));
            }
            return arrayList;
        }

        public final long c(long j10) {
            return am.q.g(2800 - (j10 - this.f64265a), 0L);
        }

        public final void d(long j10) {
            this.f64265a = j10;
            this.f64266b = 0;
        }

        public final int e(long j10) {
            return Math.min(this.f64266b, am.q.p((int) (((j10 - this.f64265a) * ((long) 95)) / 2800), 0, 95));
        }
    }

    public static final /* synthetic */ class d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f64267a;

        static {
            int[] iArr = new int[com.neeeex.ctools.features.device.c.values().length];
            try {
                iArr[com.neeeex.ctools.features.device.c.ACCELEROMETER.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[com.neeeex.ctools.features.device.c.MAGNETIC_FIELD.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[com.neeeex.ctools.features.device.c.ORIENTATION.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[com.neeeex.ctools.features.device.c.GYROSCOPE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[com.neeeex.ctools.features.device.c.LIGHT.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[com.neeeex.ctools.features.device.c.PROXIMITY.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[com.neeeex.ctools.features.device.c.AMBIENT_TEMPERATURE.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            f64267a = iArr;
        }
    }

    public static final class e extends ll.d {
        int I$0;
        int I$1;
        int I$2;
        int I$3;
        Object L$0;
        Object L$1;
        Object L$2;
        int label;
        /* synthetic */ Object result;

        public e(kl.f<? super e> fVar) {
            super(fVar);
        }

        @Override // ll.a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return DeviceStatusNEEEEXActivity.this.j1(this);
        }
    }

    public static final class g extends ll.m implements tl.n {
        int I$0;
        int I$1;
        private /* synthetic */ Object L$0;
        int label;

        public g(kl.f<? super g> fVar) {
            super(2, fVar);
        }

        @Override // ll.a
        public final kl.f<fl.m0> create(Object obj, kl.f<?> fVar) {
            g gVar = DeviceStatusNEEEEXActivity.this.new g(fVar);
            gVar.L$0 = obj;
            return gVar;
        }

        @Override // tl.n
        public final Object invoke(p0 p0Var, kl.f<? super fl.m0> fVar) {
            return ((g) create(p0Var, fVar)).invokeSuspend(fl.m0.f80959a);
        }

        @Override // ll.a
        public final Object invokeSuspend(Object obj) {
            p0 p0Var = (p0) this.L$0;
            Object objF = p003kotlin.coroutines.intrinsics.c.f();
            int i10 = this.label;
            if (i10 != 0 && i10 != 1) {
                gq.v0.a("call to 'resume' before 'invoke' with coroutine" /* decoded XOR */);
                return null;
            }
            fl.v.b(obj);
            while (kotlinx.coroutines.q0.g(p0Var) && !DeviceStatusNEEEEXActivity.this.hasShownResult) {
                int iE = DeviceStatusNEEEEXActivity.this.progressTimeline.e(SystemClock.elapsedRealtime());
                ProgressBar progressBar = DeviceStatusNEEEEXActivity.this.loadingProgress;
                if (progressBar == null) {
                    p003kotlin.jvm.internal.v.n("loadingProgress" /* decoded XOR */);
                    progressBar = null;
                }
                int progress = progressBar.getProgress();
                if (progress < iE) {
                    DeviceStatusNEEEEXActivity.this.t1(Math.min(progress + 2, iE));
                }
                this.L$0 = p0Var;
                this.I$0 = iE;
                this.I$1 = progress;
                this.label = 1;
                if (z0.b(32L, this) == objF) {
                    return objF;
                }
            }
            return fl.m0.f80959a;
        }
    }

    public static c1 H0(View view, DeviceStatusNEEEEXActivity deviceStatusNEEEEXActivity, int i10, int i11, View view2, c1 c1Var) {
        "<unused var>" /* decoded XOR */;
        view2.getClass();
        "insets" /* decoded XOR */;
        c1Var.getClass();
        o2.d dVarF = c1Var.f(c1.p.i());
        "getInsets(...)" /* decoded XOR */;
        dVarF.getClass();
        view.getClass();
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams == null) {
            b0.a("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams" /* decoded XOR */);
            return null;
        }
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
        marginLayoutParams.topMargin = i10 + dVarF.f89981b;
        view.setLayoutParams(marginLayoutParams);
        ViewGroup viewGroup = deviceStatusNEEEEXActivity.adContainer;
        if (viewGroup == null) {
            p003kotlin.jvm.internal.v.n("adContainer" /* decoded XOR */);
            viewGroup = null;
        }
        ViewGroup.LayoutParams layoutParams2 = viewGroup.getLayoutParams();
        if (layoutParams2 == null) {
            b0.a("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams" /* decoded XOR */);
            return null;
        }
        ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) layoutParams2;
        marginLayoutParams2.bottomMargin = i11 + dVarF.f89983d;
        viewGroup.setLayoutParams(marginLayoutParams2);
        return c1Var;
    }

    public static void I0(DeviceStatusNEEEEXActivity deviceStatusNEEEEXActivity, View view) {
        deviceStatusNEEEEXActivity.o1();
    }

    public static void J0(DeviceStatusNEEEEXActivity deviceStatusNEEEEXActivity, View view) {
        deviceStatusNEEEEXActivity.m1();
    }

    public static fl.m0 K0(DeviceStatusNEEEEXActivity deviceStatusNEEEEXActivity, k0 k0Var) {
        "$this$addCallback" /* decoded XOR */;
        k0Var.getClass();
        deviceStatusNEEEEXActivity.m1();
        return fl.m0.f80959a;
    }

    public static /* synthetic */ TextView Y0(DeviceStatusNEEEEXActivity deviceStatusNEEEEXActivity, ViewGroup viewGroup, int i10, int i11, int i12, Object obj) {
        if ((i12 & 4) != 0) {
            i11 = -1;
        }
        return deviceStatusNEEEEXActivity.X0(viewGroup, i10, i11);
    }

    private final void Z0() {
        final View viewFindViewById = findViewById(R$id.neeeex_device_layout_title);
        ViewGroup.LayoutParams layoutParams = viewFindViewById.getLayoutParams();
        View view = null;
        ViewGroup.MarginLayoutParams marginLayoutParams = layoutParams instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams : null;
        final int i10 = marginLayoutParams != null ? marginLayoutParams.topMargin : 0;
        ViewGroup viewGroup = this.adContainer;
        if (viewGroup == null) {
            p003kotlin.jvm.internal.v.n("adContainer" /* decoded XOR */);
            viewGroup = null;
        }
        ViewGroup.LayoutParams layoutParams2 = viewGroup.getLayoutParams();
        ViewGroup.MarginLayoutParams marginLayoutParams2 = layoutParams2 instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams2 : null;
        final int i11 = marginLayoutParams2 != null ? marginLayoutParams2.bottomMargin : 0;
        Window window = getWindow();
        View view2 = this.root;
        if (view2 == null) {
            p003kotlin.jvm.internal.v.n("root" /* decoded XOR */);
            view2 = null;
        }
        d1 d1VarA = a1.a(window, view2);
        d1VarA.d(true);
        d1VarA.c(true);
        View view3 = this.root;
        if (view3 == null) {
            p003kotlin.jvm.internal.v.n("root" /* decoded XOR */);
            view3 = null;
        }
        androidx.core.view.m0.w0(view3, new y() { // from class: com.neeeex.ctools.features.device.f
            @Override // androidx.core.view.y
            public final c1 a(View view4, c1 c1Var) {
                return DeviceStatusNEEEEXActivity.H0(viewFindViewById, this, i10, i11, view4, c1Var);
            }
        });
        View view4 = this.root;
        if (view4 == null) {
            p003kotlin.jvm.internal.v.n("root" /* decoded XOR */);
        } else {
            view = view4;
        }
        androidx.core.view.m0.i0(view);
    }

    private final void e1() {
        View viewFindViewById = findViewById(R$id.neeeex_device_root);
        "findViewById(...)" /* decoded XOR */;
        viewFindViewById.getClass();
        this.root = viewFindViewById;
        View viewFindViewById2 = findViewById(R$id.neeeex_device_loading);
        "findViewById(...)" /* decoded XOR */;
        viewFindViewById2.getClass();
        this.loadingView = viewFindViewById2;
        View viewFindViewById3 = findViewById(R$id.neeeex_device_loading_lottie);
        "findViewById(...)" /* decoded XOR */;
        viewFindViewById3.getClass();
        this.loadingAnimation = (LottieAnimationView) viewFindViewById3;
        View viewFindViewById4 = findViewById(R$id.neeeex_device_loading_progress);
        "findViewById(...)" /* decoded XOR */;
        viewFindViewById4.getClass();
        this.loadingProgress = (ProgressBar) viewFindViewById4;
        View viewFindViewById5 = findViewById(R$id.neeeex_device_loading_percentage);
        "findViewById(...)" /* decoded XOR */;
        viewFindViewById5.getClass();
        this.loadingPercentage = (TextView) viewFindViewById5;
        View viewFindViewById6 = findViewById(R$id.neeeex_device_scroll);
        "findViewById(...)" /* decoded XOR */;
        viewFindViewById6.getClass();
        this.resultScroll = viewFindViewById6;
        View viewFindViewById7 = findViewById(R$id.neeeex_device_ad_container_banner);
        "findViewById(...)" /* decoded XOR */;
        viewFindViewById7.getClass();
        this.adContainer = (ViewGroup) viewFindViewById7;
    }

    private final void i1() {
        if (this.exitInProgress) {
            return;
        }
        this.exitInProgress = true;
        Job job = this.smoothProgressJob;
        LottieAnimationView lottieAnimationView = null;
        if (job != null) {
            Job.a.a(job, null, 1, null);
        }
        Job job2 = this.snapshotJob;
        if (job2 != null) {
            Job.a.a(job2, null, 1, null);
        }
        LottieAnimationView lottieAnimationView2 = this.loadingAnimation;
        if (lottieAnimationView2 == null) {
            p003kotlin.jvm.internal.v.n("loadingAnimation" /* decoded XOR */);
        } else {
            lottieAnimationView = lottieAnimationView2;
        }
        lottieAnimationView.m();
        zi.l.f104405a.b(this, "neeeex_pdf_clean_scan_exit_fs" /* decoded XOR */, zi.n.DEVICE_STATUS);
    }

    private final void m1() {
        if (this.exitInProgress) {
            return;
        }
        if (this.hasShownResult) {
            i1();
            return;
        }
        ExitScanDialog exitScanDialogB = ExitScanDialog.Companion.b(ExitScanDialog.INSTANCE, 0, 1, null);
        exitScanDialogB.p(new ki.a() { // from class: com.neeeex.ctools.features.device.j
            @Override // ki.a
            public final void a() {
                DeviceStatusNEEEEXActivity.n1(this.f64294a);
            }
        });
        l0 supportFragmentManager = getSupportFragmentManager();
        "getSupportFragmentManager(...)" /* decoded XOR */;
        supportFragmentManager.getClass();
        exitScanDialogB.i(supportFragmentManager);
    }

    public static final void n1(DeviceStatusNEEEEXActivity deviceStatusNEEEEXActivity) {
        deviceStatusNEEEEXActivity.i1();
    }

    private final void s1() {
        if (this.hasRequestedResultAd) {
            return;
        }
        this.hasRequestedResultAd = true;
        ViewGroup viewGroup = this.adContainer;
        if (viewGroup == null) {
            p003kotlin.jvm.internal.v.n("adContainer" /* decoded XOR */);
            viewGroup = null;
        }
        BaseAdActivity.showRenderAdAndRefresh$default(this, viewGroup, R$layout.ad_neeeex_native_white, "CTOOLS_DEVICE_STATUS_RESULT_NATIVE" /* decoded XOR */, null, 8, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void t1(int value) {
        if (this.hasShownResult) {
            return;
        }
        int iP = am.q.p(value, 0, 100);
        ProgressBar progressBar = this.loadingProgress;
        TextView textView = null;
        if (progressBar == null) {
            p003kotlin.jvm.internal.v.n("loadingProgress" /* decoded XOR */);
            progressBar = null;
        }
        progressBar.setProgress(iP);
        TextView textView2 = this.loadingPercentage;
        if (textView2 == null) {
            p003kotlin.jvm.internal.v.n("loadingPercentage" /* decoded XOR */);
        } else {
            textView = textView2;
        }
        textView.setText(getString(R$string.ctools_neeeex_loading_percentage, new Object[]{Integer.valueOf(iP)}));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void y1() {
        if (this.exitInProgress) {
            return;
        }
        this.hasShownResult = true;
        View view = this.root;
        View view2 = null;
        if (view == null) {
            p003kotlin.jvm.internal.v.n("root" /* decoded XOR */);
            view = null;
        }
        view.setBackgroundColor(l2.a.getColor(this, R.color.white));
        LottieAnimationView lottieAnimationView = this.loadingAnimation;
        if (lottieAnimationView == null) {
            p003kotlin.jvm.internal.v.n("loadingAnimation" /* decoded XOR */);
            lottieAnimationView = null;
        }
        lottieAnimationView.u();
        View view3 = this.loadingView;
        if (view3 == null) {
            p003kotlin.jvm.internal.v.n("loadingView" /* decoded XOR */);
            view3 = null;
        }
        view3.setVisibility(8);
        View view4 = this.resultScroll;
        if (view4 == null) {
            p003kotlin.jvm.internal.v.n("resultScroll" /* decoded XOR */);
        } else {
            view2 = view4;
        }
        view2.setVisibility(0);
        z1();
        s1();
    }

    private final void z1() {
        if (this.hasRequestedScanEndInterstitial) {
            return;
        }
        this.hasRequestedScanEndInterstitial = true;
        if (com.neeeex.eraser.module.report.bytedance.a.k()) {
            BaseAdActivity.showInter$default(this, "CTOOLS_DEVICE_STATUS_SCAN_END_IN" /* decoded XOR */, null, 2, null);
        }
    }

    public final void A1() {
        Job job = this.smoothProgressJob;
        if (job != null) {
            Job.a.a(job, null, 1, null);
        }
        this.smoothProgressJob = kotlinx.coroutines.k.d(LifecycleOwnerKt.getLifecycleScope(this), null, null, new g(null), 3, null);
    }

    public final String B1(boolean supported) {
        String string = getString(supported ? R$string.ctools_neeeex_device_supported : R$string.ctools_neeeex_device_not_supported);
        "getString(...)" /* decoded XOR */;
        string.getClass();
        return string;
    }

    public final String C1() {
        String string = getString(R$string.ctools_neeeex_device_unavailable);
        "getString(...)" /* decoded XOR */;
        string.getClass();
        return string;
    }

    public final void L0(int value) {
        this.progressTimeline.a(value);
    }

    public final TextView X0(ViewGroup container, int labelRes, int valueId) {
        View viewInflate = getLayoutInflater().inflate(R$layout.item_neeeex_device_status_row, container, false);
        ((TextView) viewInflate.findViewById(R$id.neeeex_device_row_label)).setText(labelRes);
        TextView textView = (TextView) viewInflate.findViewById(R$id.neeeex_device_row_value);
        if (valueId != -1) {
            textView.setId(valueId);
        }
        container.addView(viewInflate);
        textView.getClass();
        return textView;
    }

    public final String a1(int health) {
        Integer num = (Integer) f64234v.get(Integer.valueOf(health));
        String string = getString(num != null ? num.intValue() : R$string.ctools_neeeex_device_unknown);
        "getString(...)" /* decoded XOR */;
        string.getClass();
        return string;
    }

    public final String b1(int status) {
        Integer num = (Integer) f64235w.get(Integer.valueOf(status));
        String string = getString(num != null ? num.intValue() : R$string.ctools_neeeex_device_unknown);
        "getString(...)" /* decoded XOR */;
        string.getClass();
        return string;
    }

    public final void c1() {
        t1(0);
        c cVar = new c();
        cVar.d(SystemClock.elapsedRealtime());
        this.progressTimeline = cVar;
        A1();
        l1();
    }

    public final void d1() {
        findViewById(R$id.neeeex_device_button_back).setOnClickListener(new View.OnClickListener() { // from class: com.neeeex.ctools.features.device.g
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                DeviceStatusNEEEEXActivity.J0(this.f64291a, view);
            }
        });
        o0.b(getOnBackPressedDispatcher(), this, false, new Function1() { // from class: com.neeeex.ctools.features.device.h
            @Override // p003kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return DeviceStatusNEEEEXActivity.K0(this.f64292a, (k0) obj);
            }
        }, 2, null);
        findViewById(R$id.neeeex_device_clean).setOnClickListener(new View.OnClickListener() { // from class: com.neeeex.ctools.features.device.i
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                DeviceStatusNEEEEXActivity.I0(this.f64293a, view);
            }
        });
    }

    public final String f1(int plugged) {
        Integer num = (Integer) f64236x.get(Integer.valueOf(plugged));
        String string = getString(num != null ? num.intValue() : R$string.ctools_neeeex_device_battery_not_plugged);
        "getString(...)" /* decoded XOR */;
        string.getClass();
        return string;
    }

    public final void g1() {
        LinearLayout linearLayout = (LinearLayout) findViewById(R$id.neeeex_device_screen_section);
        for (fl.t tVar : w.p(z.a(Integer.valueOf(R$string.ctools_neeeex_device_screen_resolution), Integer.valueOf(R$id.neeeex_device_resolution_value)), z.a(Integer.valueOf(R$string.ctools_neeeex_device_screen_density), Integer.valueOf(R$id.neeeex_device_density_value)), z.a(Integer.valueOf(R$string.ctools_neeeex_device_screen_multitouch), Integer.valueOf(R$id.neeeex_device_multitouch_value)))) {
            int iIntValue = ((Number) tVar.component1()).intValue();
            int iIntValue2 = ((Number) tVar.component2()).intValue();
            linearLayout.getClass();
            X0(linearLayout, iIntValue, iIntValue2);
        }
        LinearLayout linearLayout2 = (LinearLayout) findViewById(R$id.neeeex_device_battery_section);
        linearLayout2.getClass();
        this.batteryRows = new a(Y0(this, linearLayout2, R$string.ctools_neeeex_device_battery_health, 0, 4, null), Y0(this, linearLayout2, R$string.ctools_neeeex_device_battery_current_capacity, 0, 4, null), Y0(this, linearLayout2, R$string.ctools_neeeex_device_battery_total_capacity, 0, 4, null), Y0(this, linearLayout2, R$string.ctools_neeeex_device_battery_voltage, 0, 4, null), Y0(this, linearLayout2, R$string.ctools_neeeex_device_battery_temperature, 0, 4, null), Y0(this, linearLayout2, R$string.ctools_neeeex_device_battery_status, 0, 4, null), Y0(this, linearLayout2, R$string.ctools_neeeex_device_battery_charging_source, 0, 4, null), Y0(this, linearLayout2, R$string.ctools_neeeex_device_battery_technology, 0, 4, null));
        LinearLayout linearLayout3 = (LinearLayout) findViewById(R$id.neeeex_device_sensor_section);
        for (com.neeeex.ctools.features.device.c cVar : com.neeeex.ctools.features.device.c.getEntries()) {
            linearLayout3.getClass();
            X0(linearLayout3, w1(cVar), x1(cVar));
        }
    }

    public final String h1(b status) {
        Integer numA = status.a().a();
        Integer numC = status.c();
        if (numA != null && numC != null) {
            String string = getString(R$string.ctools_neeeex_device_capacity_percent_mah, new Object[]{numA, numC});
            "getString(...)" /* decoded XOR */;
            string.getClass();
            return string;
        }
        if (numA != null) {
            String string2 = getString(R$string.ctools_neeeex_device_capacity_mah, new Object[]{numA});
            "getString(...)" /* decoded XOR */;
            string2.getClass();
            return string2;
        }
        if (numC == null) {
            return C1();
        }
        String string3 = getString(R$string.ctools_neeeex_device_capacity_percent, new Object[]{numC});
        "getString(...)" /* decoded XOR */;
        string3.getClass();
        return string3;
    }

    /* JADX WARN: Code duplicated, block: B:24:0x007c  */
    /* JADX WARN: Code duplicated, block: B:26:0x00a7 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:25:0x00a5 -> B:27:0x00a8). Please report as a decompilation issue!!! */
    /*  JADX ERROR: StackOverflowError in pass: RegionMakerVisitor
        java.lang.StackOverflowError
        	at jadx.core.utils.BlockUtils.traverseSuccessorsUntil(BlockUtils.java:731)
        	at jadx.core.utils.BlockUtils.traverseSuccessorsUntil(BlockUtils.java:749)
        */
    public final java.lang.Object j1(kl.f r12) {
        /*
            r11 = this;
            boolean r0 = r12 instanceof com.neeeex.ctools.features.device.DeviceStatusNEEEEXActivity.e
            if (r0 == 0) goto L13
            r0 = r12
            com.neeeex.ctools.features.device.DeviceStatusNEEEEXActivity$e r0 = (com.neeeex.ctools.features.device.DeviceStatusNEEEEXActivity.e) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            com.neeeex.ctools.features.device.DeviceStatusNEEEEXActivity$e r0 = new com.neeeex.ctools.features.device.DeviceStatusNEEEEXActivity$e
            r0.<init>(r12)
        L18:
            java.lang.Object r12 = r0.result
            java.lang.Object r1 = p003kotlin.coroutines.intrinsics.c.f()
            int r2 = r0.label
            r3 = 0
            r4 = 1
            if (r2 == 0) goto L46
            if (r2 != r4) goto L39
            int r2 = r0.I$2
            int r5 = r0.I$1
            int r6 = r0.I$0
            java.lang.Object r7 = r0.L$1
            java.util.Iterator r7 = (java.util.Iterator) r7
            java.lang.Object r8 = r0.L$0
            java.lang.Iterable r8 = (java.lang.Iterable) r8
            fl.v.b(r12)
            goto La8
        L39:
            java.lang.String r12 = "ia5mPIiVn7jNvW8j3YyVv8qtbzbHk5W4zaZkJseKlb/KuGMkwMGT95igfyTBj5U=\n"
            java.lang.String r0 = "6s8KUKjh8Jg=\n"
            java.lang.String r12 = com.neeeex.eraser.m0.a(r12, r0)
            gq.v0.a(r12)
            r12 = 0
            return r12
        L46:
            fl.v.b(r12)
            kotlinx.coroutines.Job r12 = r11.smoothProgressJob
            r2 = 0
            if (r12 == 0) goto L51
            kotlinx.coroutines.Job.a.a(r12, r2, r4, r2)
        L51:
            android.widget.ProgressBar r12 = r11.loadingProgress
            if (r12 != 0) goto L61
            java.lang.String r12 = "Mj/R7BuEvicsP9f6F5mq\n"
            java.lang.String r5 = "XlCwiHLq2Xc=\n"
            java.lang.String r12 = com.neeeex.eraser.m0.a(r12, r5)
            p003kotlin.jvm.internal.v.n(r12)
            goto L62
        L61:
            r2 = r12
        L62:
            int r12 = r2.getProgress()
            com.neeeex.ctools.features.device.DeviceStatusNEEEEXActivity$c r2 = r11.progressTimeline
            java.util.List r2 = r2.b(r12)
            java.lang.Iterable r2 = (java.lang.Iterable) r2
            java.util.Iterator r5 = r2.iterator()
            r6 = r12
            r8 = r2
            r7 = r5
            r5 = r3
        L76:
            boolean r12 = r7.hasNext()
            if (r12 == 0) goto Lac
            java.lang.Object r12 = r7.next()
            r2 = r12
            java.lang.Number r2 = (java.lang.Number) r2
            int r2 = r2.intValue()
            java.lang.Object r9 = ll.l.a(r8)
            r0.L$0 = r9
            r0.L$1 = r7
            java.lang.Object r12 = ll.l.a(r12)
            r0.L$2 = r12
            r0.I$0 = r6
            r0.I$1 = r5
            r0.I$2 = r2
            r0.I$3 = r3
            r0.label = r4
            r9 = 20
            java.lang.Object r12 = kotlinx.coroutines.z0.b(r9, r0)
            if (r12 != r1) goto La8
            return r1
        La8:
            r11.t1(r2)
            goto L76
        Lac:
            fl.m0 r12 = fl.m0.f80959a
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: com.neeeex.ctools.features.device.DeviceStatusNEEEEXActivity.j1(kl.f):java.lang.Object");
    }

    public final void k1() {
        com.neeeex.eraser.module.main.k.f65361a.a(this, com.neeeex.similar3p.y.JUNK_FILES);
    }

    public final void l1() {
        this.snapshotJob = kotlinx.coroutines.k.d(LifecycleOwnerKt.getLifecycleScope(this), null, null, new f(null), 3, null);
    }

    public final void o1() {
        mi.a.f88870a.B();
        com.neeeex.ctools.features.device.d.f64280a.a();
        k1();
    }

    @Override // com.neeeex.eraser.base.RootActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        b.w.b(this, null, null, 3, null);
        setContentView(R$layout.activity_neeeex_device_status);
        boolean z10 = false;
        if (savedInstanceState != null && savedInstanceState.getBoolean(f64237y)) {
            z10 = true;
        }
        this.hasRequestedScanEndInterstitial = z10;
        mi.a.f88870a.G();
        Context applicationContext = getApplicationContext();
        "getApplicationContext(...)" /* decoded XOR */;
        applicationContext.getClass();
        this.provider = new s(applicationContext);
        e1();
        d1();
        g1();
        Z0();
        c1();
    }

    @Override // com.neeeex.eraser.base.BaseStoragePermActivity, com.neeeex.eraser.base.BaseAdActivity, com.neeeex.eraser.base.RootActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        Job job = this.smoothProgressJob;
        if (job != null) {
            Job.a.a(job, null, 1, null);
        }
        Job job2 = this.snapshotJob;
        if (job2 != null) {
            Job.a.a(job2, null, 1, null);
        }
        super.onDestroy();
    }

    @Override // com.neeeex.eraser.base.BaseStoragePermActivity, com.neeeex.eraser.base.RootActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onNewIntent(Intent intent) {
        "intent" /* decoded XOR */;
        intent.getClass();
        super.onNewIntent(intent);
        setIntent(intent);
    }

    @Override // androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onSaveInstanceState(Bundle outState) {
        "outState" /* decoded XOR */;
        outState.getClass();
        outState.putBoolean(f64237y, this.hasRequestedScanEndInterstitial);
        super.onSaveInstanceState(outState);
    }

    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onStart() {
        super.onStart();
        if (this.receiverRegistered) {
            return;
        }
        Intent intentP1 = p1();
        this.receiverRegistered = true;
        if (intentP1 != null) {
            s sVar = this.provider;
            if (sVar == null) {
                p003kotlin.jvm.internal.v.n("provider" /* decoded XOR */);
                sVar = null;
            }
            r1(sVar.p(intentP1));
        }
    }

    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onStop() {
        if (this.receiverRegistered) {
            try {
                fl.u.a aVar = fl.u.Companion;
                unregisterReceiver(this.batteryReceiver);
                fl.u.m372constructorimpl(fl.m0.f80959a);
            } catch (Throwable th2) {
                fl.u.a aVar2 = fl.u.Companion;
                fl.u.m372constructorimpl(fl.v.a(th2));
            }
            this.receiverRegistered = false;
        }
        super.onStop();
    }

    @Override // com.neeeex.eraser.base.BaseStoragePermActivity
    public void onStoragePermission() {
        if (com.neeeex.ctools.features.device.d.f64280a.b()) {
            k1();
        }
    }

    public final Intent p1() {
        IntentFilter intentFilter = new IntentFilter("android.intent.action.BATTERY_CHANGED" /* decoded XOR */);
        int i10 = Build.VERSION.SDK_INT;
        DeviceStatusNEEEEXActivity$batteryReceiver$1 deviceStatusNEEEEXActivity$batteryReceiver$1 = this.batteryReceiver;
        return i10 >= 33 ? registerReceiver(deviceStatusNEEEEXActivity$batteryReceiver$1, intentFilter, 4) : registerReceiver(deviceStatusNEEEEXActivity$batteryReceiver$1, intentFilter);
    }

    public final long q1() {
        return this.progressTimeline.c(SystemClock.elapsedRealtime());
    }

    /* JADX WARN: Code duplicated, block: B:19:0x0071  */
    /* JADX WARN: Code duplicated, block: B:28:0x00ae  */
    /* JADX WARN: Code duplicated, block: B:37:0x00e4  */
    public final void r1(b status) {
        String strC1;
        String strC2;
        String strC3;
        a aVar = this.batteryRows;
        if (aVar == null) {
            return;
        }
        a aVar2 = null;
        if (aVar == null) {
            p003kotlin.jvm.internal.v.n("batteryRows" /* decoded XOR */);
            aVar = null;
        }
        aVar.c().setText(a1(status.b()));
        a aVar3 = this.batteryRows;
        if (aVar3 == null) {
            p003kotlin.jvm.internal.v.n("batteryRows" /* decoded XOR */);
            aVar3 = null;
        }
        aVar3.b().setText(h1(status));
        a aVar4 = this.batteryRows;
        if (aVar4 == null) {
            p003kotlin.jvm.internal.v.n("batteryRows" /* decoded XOR */);
            aVar4 = null;
        }
        TextView textViewG = aVar4.g();
        Integer numB = status.a().b();
        if (numB != null) {
            strC1 = getString(R$string.ctools_neeeex_device_capacity_mah, new Object[]{Integer.valueOf(numB.intValue())});
            if (strC1 == null) {
                strC1 = C1();
            }
        } else {
            strC1 = C1();
        }
        textViewG.setText(strC1);
        a aVar5 = this.batteryRows;
        if (aVar5 == null) {
            p003kotlin.jvm.internal.v.n("batteryRows" /* decoded XOR */);
            aVar5 = null;
        }
        TextView textViewH = aVar5.h();
        Integer numH = status.h();
        if (numH != null) {
            strC2 = getString(R$string.ctools_neeeex_device_voltage_value, new Object[]{Double.valueOf(((double) numH.intValue()) / 1000.0d)});
            if (strC2 == null) {
                strC2 = C1();
            }
        } else {
            strC2 = C1();
        }
        textViewH.setText(strC2);
        a aVar6 = this.batteryRows;
        if (aVar6 == null) {
            p003kotlin.jvm.internal.v.n("batteryRows" /* decoded XOR */);
            aVar6 = null;
        }
        TextView textViewF = aVar6.f();
        Double dG = status.g();
        if (dG != null) {
            strC3 = getString(R$string.ctools_neeeex_device_temperature_value, new Object[]{Double.valueOf(dG.doubleValue())});
            if (strC3 == null) {
                strC3 = C1();
            }
        } else {
            strC3 = C1();
        }
        textViewF.setText(strC3);
        a aVar7 = this.batteryRows;
        if (aVar7 == null) {
            p003kotlin.jvm.internal.v.n("batteryRows" /* decoded XOR */);
            aVar7 = null;
        }
        aVar7.d().setText(b1(status.e()));
        a aVar8 = this.batteryRows;
        if (aVar8 == null) {
            p003kotlin.jvm.internal.v.n("batteryRows" /* decoded XOR */);
            aVar8 = null;
        }
        aVar8.a().setText(f1(status.d()));
        a aVar9 = this.batteryRows;
        if (aVar9 == null) {
            p003kotlin.jvm.internal.v.n("batteryRows" /* decoded XOR */);
        } else {
            aVar2 = aVar9;
        }
        TextView textViewE = aVar2.e();
        String strF = status.f();
        if (strF == null) {
            strF = C1();
        }
        textViewE.setText(strF);
    }

    public final void u1(t snapshot) {
        Integer numValueOf = Integer.valueOf(R$id.neeeex_device_model_value);
        String strC = snapshot.c();
        if (p003kotlin.text.k0.r0(strC)) {
            strC = C1();
        }
        fl.t tVarA = z.a(numValueOf, strC);
        Integer numValueOf2 = Integer.valueOf(R$id.neeeex_device_android_value);
        int i10 = R$string.ctools_neeeex_device_android_release_value;
        String strA = snapshot.a();
        if (p003kotlin.text.k0.r0(strA)) {
            strA = C1();
        }
        for (Map.Entry entry : v0.n(tVarA, z.a(numValueOf2, getString(i10, new Object[]{strA}))).entrySet()) {
            int iIntValue = ((Number) entry.getKey()).intValue();
            ((TextView) findViewById(iIntValue)).setText((String) entry.getValue());
        }
        v1(snapshot.b(), R$id.neeeex_device_ram_value, R$id.neeeex_device_ram_total, R$id.neeeex_device_ram_progress);
        v1(snapshot.f(), R$id.neeeex_device_storage_value, R$id.neeeex_device_storage_total, R$id.neeeex_device_storage_progress);
        ((TextView) findViewById(R$id.neeeex_device_resolution_value)).setText(getString(R$string.ctools_neeeex_device_resolution_value, new Object[]{Integer.valueOf(snapshot.d().d()), Integer.valueOf(snapshot.d().b())}));
        ((TextView) findViewById(R$id.neeeex_device_density_value)).setText(getString(R$string.ctools_neeeex_device_density_value, new Object[]{Integer.valueOf(snapshot.d().a())}));
        ((TextView) findViewById(R$id.neeeex_device_multitouch_value)).setText(B1(snapshot.d().c()));
        for (Map.Entry entry2 : snapshot.e().entrySet()) {
            ((TextView) findViewById(x1((com.neeeex.ctools.features.device.c) entry2.getKey()))).setText(B1(((Boolean) entry2.getValue()).booleanValue()));
        }
    }

    public final void v1(u metric, int valueId, int totalId, int progressId) {
        TextView textView = (TextView) findViewById(valueId);
        TextView textView2 = (TextView) findViewById(totalId);
        if (metric.d()) {
            textView.setText(Formatter.formatFileSize(this, metric.c()));
            textView2.setText(getString(R$string.ctools_neeeex_device_total_value, new Object[]{Formatter.formatFileSize(this, metric.b())}));
        } else {
            textView.setText(C1());
            textView2.setText("");
        }
        ((ProgressBar) findViewById(progressId)).setProgress(metric.a());
    }

    public final int w1(com.neeeex.ctools.features.device.c sensor) {
        switch (d.f64267a[sensor.ordinal()]) {
            case 1:
                return R$string.ctools_neeeex_device_sensor_accelerometer;
            case 2:
                return R$string.ctools_neeeex_device_sensor_magnetic;
            case 3:
                return R$string.ctools_neeeex_device_sensor_orientation;
            case 4:
                return R$string.ctools_neeeex_device_sensor_gyroscope;
            case 5:
                return R$string.ctools_neeeex_device_sensor_light;
            case 6:
                return R$string.ctools_neeeex_device_sensor_proximity;
            case 7:
                return R$string.ctools_neeeex_device_sensor_temperature;
            default:
                coil.util.j.a();
                return 0;
        }
    }

    public final int x1(com.neeeex.ctools.features.device.c sensor) {
        switch (d.f64267a[sensor.ordinal()]) {
            case 1:
                return R$id.neeeex_device_sensor_accelerometer_value;
            case 2:
                return R$id.neeeex_device_sensor_magnetic_value;
            case 3:
                return R$id.neeeex_device_sensor_orientation_value;
            case 4:
                return R$id.neeeex_device_sensor_gyroscope_value;
            case 5:
                return R$id.neeeex_device_sensor_light_value;
            case 6:
                return R$id.neeeex_device_sensor_proximity_value;
            case 7:
                return R$id.neeeex_device_sensor_temperature_value;
            default:
                coil.util.j.a();
                return 0;
        }
    }

    public static final class f extends ll.m implements tl.n {
        int I$0;
        long J$0;
        private /* synthetic */ Object L$0;
        Object L$1;
        int label;

        public f(kl.f<? super f> fVar) {
            super(2, fVar);
        }

        @Override // ll.a
        public final kl.f<fl.m0> create(Object obj, kl.f<?> fVar) {
            f fVar2 = DeviceStatusNEEEEXActivity.this.new f(fVar);
            fVar2.L$0 = obj;
            return fVar2;
        }

        @Override // tl.n
        public final Object invoke(p0 p0Var, kl.f<? super fl.m0> fVar) {
            return ((f) create(p0Var, fVar)).invokeSuspend(fl.m0.f80959a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:38:0x00c6, code lost:
        
            if (r5.j1(r8) == r1) goto L39;
         */
        @Override // ll.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            Object objM372constructorimpl;
            t tVar;
            long jQ1;
            t tVar2;
            p0 p0Var = (p0) this.L$0;
            Object objF = p003kotlin.coroutines.intrinsics.c.f();
            int i10 = this.label;
            try {
                if (i10 == 0) {
                    fl.v.b(obj);
                    DeviceStatusNEEEEXActivity deviceStatusNEEEEXActivity = DeviceStatusNEEEEXActivity.this;
                    fl.u.a aVar = fl.u.Companion;
                    kotlinx.coroutines.l0 l0VarB = f1.b();
                    a aVar2 = new a(deviceStatusNEEEEXActivity, null);
                    this.L$0 = ll.l.a(p0Var);
                    this.L$1 = ll.l.a(p0Var);
                    this.I$0 = 0;
                    this.label = 1;
                    obj = kotlinx.coroutines.i.g(l0VarB, aVar2, this);
                    if (obj == objF) {
                    }
                    return objF;
                }
                if (i10 == 1) {
                    fl.v.b(obj);
                } else if (i10 == 2) {
                    jQ1 = this.J$0;
                    tVar2 = (t) this.L$1;
                    fl.v.b(obj);
                    tVar = tVar2;
                    DeviceStatusNEEEEXActivity deviceStatusNEEEEXActivity2 = DeviceStatusNEEEEXActivity.this;
                    this.L$0 = ll.l.a(p0Var);
                    this.L$1 = ll.l.a(tVar);
                    this.J$0 = jQ1;
                    this.label = 3;
                } else {
                    if (i10 != 3) {
                        gq.v0.a("call to 'resume' before 'invoke' with coroutine" /* decoded XOR */);
                        return null;
                    }
                    fl.v.b(obj);
                }
                DeviceStatusNEEEEXActivity.this.y1();
                return fl.m0.f80959a;
                objM372constructorimpl = fl.u.m372constructorimpl((t) obj);
            } catch (Throwable th2) {
                fl.u.a aVar3 = fl.u.Companion;
                objM372constructorimpl = fl.u.m372constructorimpl(fl.v.a(th2));
            }
            tVar = (t) (fl.u.m377isFailureimpl(objM372constructorimpl) ? null : objM372constructorimpl);
            if (tVar != null) {
                DeviceStatusNEEEEXActivity.this.u1(tVar);
            }
            jQ1 = DeviceStatusNEEEEXActivity.this.q1();
            if (jQ1 > 0) {
                this.L$0 = ll.l.a(p0Var);
                this.L$1 = ll.l.a(tVar);
                this.J$0 = jQ1;
                this.label = 2;
                if (z0.b(jQ1, this) != objF) {
                    tVar2 = tVar;
                    tVar = tVar2;
                    DeviceStatusNEEEEXActivity deviceStatusNEEEEXActivity3 = DeviceStatusNEEEEXActivity.this;
                    this.L$0 = ll.l.a(p0Var);
                    this.L$1 = ll.l.a(tVar);
                    this.J$0 = jQ1;
                    this.label = 3;
                }
            } else {
                DeviceStatusNEEEEXActivity deviceStatusNEEEEXActivity4 = DeviceStatusNEEEEXActivity.this;
                this.L$0 = ll.l.a(p0Var);
                this.L$1 = ll.l.a(tVar);
                this.J$0 = jQ1;
                this.label = 3;
            }
            return objF;
        }

        public static final class a extends ll.m implements tl.n {
            int label;
            final /* synthetic */ DeviceStatusNEEEEXActivity this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(DeviceStatusNEEEEXActivity deviceStatusNEEEEXActivity, kl.f<? super a> fVar) {
                super(2, fVar);
                this.this$0 = deviceStatusNEEEEXActivity;
            }

            @Override // ll.a
            public final kl.f<fl.m0> create(Object obj, kl.f<?> fVar) {
                return new a(this.this$0, fVar);
            }

            @Override // tl.n
            public final Object invoke(p0 p0Var, kl.f<? super t> fVar) {
                return ((a) create(p0Var, fVar)).invokeSuspend(fl.m0.f80959a);
            }

            @Override // ll.a
            public final Object invokeSuspend(Object obj) {
                p003kotlin.coroutines.intrinsics.c.f();
                if (this.label != 0) {
                    gq.v0.a("call to 'resume' before 'invoke' with coroutine" /* decoded XOR */);
                    return null;
                }
                fl.v.b(obj);
                s sVar = this.this$0.provider;
                if (sVar == null) {
                    p003kotlin.jvm.internal.v.n("provider" /* decoded XOR */);
                    sVar = null;
                }
                return sVar.C(new C0737a(this.this$0));
            }

            /* JADX INFO: renamed from: com.neeeex.ctools.features.device.DeviceStatusNEEEEXActivity$f$a$a, reason: collision with other inner class name */
            public static final /* synthetic */ class C0737a extends p003kotlin.jvm.internal.s implements Function1 {
                public C0737a(Object obj) {
                    super(1, obj, DeviceStatusNEEEEXActivity.class, "acceptActualProgress" /* decoded XOR */, "acceptActualProgress(I)V" /* decoded XOR */, 0);
                }

                @Override // p003kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                    invoke(((Number) obj).intValue());
                    return fl.m0.f80959a;
                }

                public final void invoke(int i10) {
                    ((DeviceStatusNEEEEXActivity) this.receiver).L0(i10);
                }
            }
        }
    }
}