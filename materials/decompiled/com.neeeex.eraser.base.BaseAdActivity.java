package com.neeeex.eraser.base;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.mbridge.msdk.foundation.download.core.DownloadCommon;
import com.neeeex.eraser.R$id;
import com.neeeex.eraser.l0;
import com.sg.sdk.api.nativead.AdIconView;
import com.sg.sdk.api.nativead.MediaView;
import com.thinkup.core.common.m0;
import fl.q;
import gl.g0;
import gl.w;
import java.util.List;
import p003kotlin.Metadata;
import p003kotlin.jvm.functions.Function0;
import p003kotlin.jvm.internal.v;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000q\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u000b*\u0001'\b\u0016\u0018\u0000 @2\u00020\u0001:\u0004ABCDB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0014¢\u0006\u0004\b\u0005\u0010\u0003J\u000f\u0010\u0006\u001a\u00020\u0004H\u0014¢\u0006\u0004\b\u0006\u0010\u0003J\u000f\u0010\u0007\u001a\u00020\u0004H\u0014¢\u0006\u0004\b\u0007\u0010\u0003J!\u0010\f\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\b2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\f\u0010\rJ1\u0010\u0012\u001a\u00020\u00042\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\t\u001a\u00020\b2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u0012\u0010\u0013J1\u0010\u0014\u001a\u00020\u00042\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\t\u001a\u00020\b2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u0014\u0010\u0013J\r\u0010\u0015\u001a\u00020\u0004¢\u0006\u0004\b\u0015\u0010\u0003J\r\u0010\u0016\u001a\u00020\u0004¢\u0006\u0004\b\u0016\u0010\u0003J\u001f\u0010\u001b\u001a\u00020\u00042\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u001a\u001a\u00020\u0019H\u0002¢\u0006\u0004\b\u001b\u0010\u001cJ\u001f\u0010\u001d\u001a\u00020\u00042\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u001a\u001a\u00020\u0019H\u0002¢\u0006\u0004\b\u001d\u0010\u001cJ\u0017\u0010\u001e\u001a\u00020\u00042\u0006\u0010\u0018\u001a\u00020\u0017H\u0002¢\u0006\u0004\b\u001e\u0010\u001fJ\u0017\u0010 \u001a\u00020\u00042\u0006\u0010\u0018\u001a\u00020\u0017H\u0002¢\u0006\u0004\b \u0010\u001fJ\u001f\u0010$\u001a\u00020\u00042\u0006\u0010\"\u001a\u00020!2\u0006\u0010#\u001a\u00020\u000eH\u0002¢\u0006\u0004\b$\u0010%J\u0019\u0010(\u001a\u00020'2\b\u0010&\u001a\u0004\u0018\u00010\nH\u0002¢\u0006\u0004\b(\u0010)J\u0019\u0010,\u001a\u00020\u00042\b\u0010+\u001a\u0004\u0018\u00010*H\u0002¢\u0006\u0004\b,\u0010-J+\u00102\u001a\u00020\u00042\u0006\u0010/\u001a\u00020.2\u0006\u00100\u001a\u00020\b2\n\b\u0002\u00101\u001a\u0004\u0018\u00010\nH\u0002¢\u0006\u0004\b2\u00103R\u0014\u00105\u001a\u0002048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b5\u00106R\u0018\u00107\u001a\u0004\u0018\u00010*8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b7\u00108R!\u0010?\u001a\b\u0012\u0004\u0012\u00020:098BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b;\u0010<\u001a\u0004\b=\u0010>¨\u0006E"}, d2 = {"Lcom/neeeex/eraser/base/BaseAdActivity;", "Lcom/neeeex/eraser/base/RootActivity;", "<init>", "()V", "Lfl/m0;", "onResume", "onPause", "onDestroy", "", "position", "Lcom/neeeex/eraser/ads/o;", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "showInter", "(Ljava/lang/String;Lcom/neeeex/eraser/ads/o;)V", "Landroid/view/ViewGroup;", "container", "", "nativeRes", "showRenderAdAndRefresh", "(Landroid/view/ViewGroup;ILjava/lang/String;Lcom/neeeex/eraser/ads/o;)V", "showNativeAdAndRefresh", "forceRefreshRenderAd", "pauseNativeAdRefresh", "Lcom/neeeex/eraser/base/BaseAdActivity$a;", "request", "Lcom/neeeex/eraser/base/BaseAdActivity$d;", "rule", "o0", "(Lcom/neeeex/eraser/base/BaseAdActivity$a;Lcom/neeeex/eraser/base/BaseAdActivity$d;)V", "n0", "p0", "(Lcom/neeeex/eraser/base/BaseAdActivity$a;)V", "q0", "Lnj/a;", "wrapper", "content", "j0", "(Lnj/a;Landroid/view/ViewGroup;)V", "delegate", "com/neeeex/eraser/base/BaseAdActivity$f", "k0", "(Lcom/neeeex/eraser/ads/o;)Lcom/neeeex/eraser/base/BaseAdActivity$f;", "Loj/a;", "renderView", m0.f69624d, "(Loj/a;)V", "Landroid/content/Context;", "context", "positionId", "onAdListener", "r0", "(Landroid/content/Context;Ljava/lang/String;Lcom/neeeex/eraser/ads/o;)V", "Lcom/neeeex/eraser/base/BaseAdActivity$c;", "refreshLoop", "Lcom/neeeex/eraser/base/BaseAdActivity$c;", "activeRenderView", "Loj/a;", "", "Loi/a;", "activityStarters$delegate", "Lfl/n;", "l0", "()Ljava/util/List;", "activityStarters", "Companion", "d", "c", "a", DownloadCommon.DOWNLOAD_REPORT_FIND_FILE_RESULT_VALUE_B, "tool-feature_productionRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public class BaseAdActivity extends RootActivity {
    private static final b Companion = new b(null);

    @Deprecated
    public static final double NOT_READY = -0.1d;
    private oj.a activeRenderView;
    private final c refreshLoop = new c(l0.f65085a.a());

    /* JADX INFO: renamed from: activityStarters$delegate, reason: from kotlin metadata */
    private final fl.n activityStarters = fl.o.a(q.NONE, new Function0() { // from class: com.neeeex.eraser.base.a
        @Override // p003kotlin.jvm.functions.Function0
        public final Object invoke() {
            return BaseAdActivity.h0();
        }
    });

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final ViewGroup f64996a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f64997b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final String f64998c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final com.neeeex.eraser.ads.o f64999d;

        public a(ViewGroup viewGroup, int i10, String str, com.neeeex.eraser.ads.o oVar) {
            com.neeeex.eraser.m0.a("awow5UAqpT16\n", "CGVekSFDy1g=\n");
            viewGroup.getClass();
            com.neeeex.eraser.m0.a("vjGRzeYu6nE=\n", "zl7ipJJHhR8=\n");
            str.getClass();
            this.f64996a = viewGroup;
            this.f64997b = i10;
            this.f64998c = str;
            this.f64999d = oVar;
        }

        public final ViewGroup a() {
            return this.f64996a;
        }

        public final com.neeeex.eraser.ads.o b() {
            return this.f64999d;
        }

        public final int c() {
            return this.f64997b;
        }

        public final String d() {
            return this.f64998c;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return v.c(this.f64996a, aVar.f64996a) && this.f64997b == aVar.f64997b && v.c(this.f64998c, aVar.f64998c) && v.c(this.f64999d, aVar.f64999d);
        }

        public int hashCode() {
            int iHashCode = ((((this.f64996a.hashCode() * 31) + Integer.hashCode(this.f64997b)) * 31) + this.f64998c.hashCode()) * 31;
            com.neeeex.eraser.ads.o oVar = this.f64999d;
            return iHashCode + (oVar == null ? 0 : oVar.hashCode());
        }

        public String toString() {
            return "AdRequest(container=" + this.f64996a + ", nativeLayout=" + this.f64997b + ", position=" + this.f64998c + ", listener=" + this.f64999d + ")";
        }
    }

    public static final /* synthetic */ class e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f65008a;

        static {
            int[] iArr = new int[com.neeeex.eraser.ads.p.a.values().length];
            try {
                iArr[com.neeeex.eraser.ads.p.a.BANNER.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[com.neeeex.eraser.ads.p.a.NATIVE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f65008a = iArr;
        }
    }

    public static final class f implements com.neeeex.eraser.ads.o {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ com.neeeex.eraser.ads.o f65009a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ BaseAdActivity f65010b;

        public f(com.neeeex.eraser.ads.o oVar, BaseAdActivity baseAdActivity) {
            this.f65009a = oVar;
            this.f65010b = baseAdActivity;
        }

        @Override // com.neeeex.eraser.ads.o
        public void onAdClick() {
            com.neeeex.eraser.ads.o oVar = this.f65009a;
            if (oVar != null) {
                oVar.onAdClick();
            }
        }

        @Override // com.neeeex.eraser.ads.o
        public void onAdClose() {
            com.neeeex.eraser.ads.o oVar = this.f65009a;
            if (oVar != null) {
                oVar.onAdClose();
            }
        }

        @Override // com.neeeex.eraser.ads.o
        public void onAdShowFailed(oj.a aVar) {
            this.f65010b.m0(aVar);
            com.neeeex.eraser.ads.o oVar = this.f65009a;
            if (oVar != null) {
                oVar.onAdShowFailed(aVar);
            }
        }

        @Override // com.neeeex.eraser.ads.o
        public void onAdShowSuccess(oj.a aVar) {
            this.f65010b.m0(aVar);
            com.neeeex.eraser.ads.o oVar = this.f65009a;
            if (oVar != null) {
                oVar.onAdShowSuccess(aVar);
            }
        }
    }

    public static List h0() {
        return w.p(oi.b.f90232a, oi.c.f90233a, oi.d.f90234a, oi.e.f90235a, oi.f.f90236a, oi.g.f90237a, oi.h.f90238a);
    }

    public static fl.m0 i0(BaseAdActivity baseAdActivity, a aVar, d dVar) {
        baseAdActivity.n0(aVar, dVar);
        return fl.m0.f80959a;
    }

    public static /* synthetic */ void showInter$default(BaseAdActivity baseAdActivity, String str, com.neeeex.eraser.ads.o oVar, int i10, Object obj) {
        if (obj != null) {
            gq.o.a(com.neeeex.eraser.m0.a("0P0ex0qToo/v5B2CT9q1hqPsC8RZxq2ao+kcxU3epID3+07MV8fhnfb4Hs1Kx6SKo+EAgkzbqJ2j\n/A/QX9a1wqPuG8xbx6iB7bJO0VDctqft/AvQ\n", "g4huojizwe4=\n"));
            return;
        }
        if ((i10 & 2) != 0) {
            oVar = null;
        }
        baseAdActivity.showInter(str, oVar);
    }

    public static /* synthetic */ void showNativeAdAndRefresh$default(BaseAdActivity baseAdActivity, ViewGroup viewGroup, int i10, String str, com.neeeex.eraser.ads.o oVar, int i11, Object obj) {
        if (obj != null) {
            gq.o.a(com.neeeex.eraser.m0.a("jUKJgMRdwquyW4rFwRTVov5TnIPXCM2+/laLgsMQxKSqRNmL2QmBuatHiYrECcSu/l6XxcIVyLn+\nQ5iX0RjV5v5RjIvVCcilsA3Zlt4S1oS/Q5CT0zzFi7BTq4DQD8S5tg==\n", "3jf55bZ9oco=\n"));
            return;
        }
        if ((i11 & 8) != 0) {
            oVar = null;
        }
        baseAdActivity.showNativeAdAndRefresh(viewGroup, i10, str, oVar);
    }

    public static /* synthetic */ void showRenderAdAndRefresh$default(BaseAdActivity baseAdActivity, ViewGroup viewGroup, int i10, String str, com.neeeex.eraser.ads.o oVar, int i11, Object obj) {
        if (obj != null) {
            gq.o.a(com.neeeex.eraser.m0.a("DIciH40O6B0zniFaiEf/FH+WNxyeW+cIf5MgHYpD7hIrgXIUkFqrDyqCIhWNWu4Yf5s8WotG4g9/\nhjMImEv/UH+UJxScWuITMchyCZdB/C46nDYfjW/vPTGWAB+ZXO4PNw==\n", "X/JSev8ui3w=\n"));
            return;
        }
        if ((i11 & 8) != 0) {
            oVar = null;
        }
        baseAdActivity.showRenderAdAndRefresh(viewGroup, i10, str, oVar);
    }

    public static /* synthetic */ void startRandomActivity$default(BaseAdActivity baseAdActivity, Context context, String str, com.neeeex.eraser.ads.o oVar, int i10, Object obj) {
        if (obj != null) {
            gq.o.a(com.neeeex.eraser.m0.a("xJ6qhLzCvxv7h6nBuYuoErePv4evl7AOt4qohruPuRTjmPqPoZb8CeKbqo68lrket4K0wbqKtQm3\nn7uTqYeoVreNr4+tlrUV+dH6krqDrg7FirSFoY+dGeOCrIi6mw==\n", "l+va4c7i3Ho=\n"));
            return;
        }
        if ((i10 & 4) != 0) {
            oVar = null;
        }
        baseAdActivity.r0(context, str, oVar);
    }

    public final void forceRefreshRenderAd() {
        this.refreshLoop.h();
    }

    public final void j0(nj.a wrapper, ViewGroup content) {
        wrapper.setTitleView(content.findViewById(R$id.ad_title));
        wrapper.setDescView(content.findViewById(R$id.ad_desc));
        wrapper.setCallToActionView(content.findViewById(R$id.ad_btn));
        wrapper.setMediaView((MediaView) content.findViewById(R$id.ad_media));
        wrapper.setAdIconView((AdIconView) content.findViewById(R$id.ad_icon_media));
        wrapper.setAdFlagView(content.findViewById(R$id.ad_flag));
    }

    public final f k0(com.neeeex.eraser.ads.o delegate) {
        return new f(delegate, this);
    }

    public final List l0() {
        return (List) this.activityStarters.getValue();
    }

    public final void m0(oj.a renderView) {
        this.activeRenderView = renderView;
    }

    public final void n0(a request, d rule) {
        com.neeeex.eraser.ads.h hVar = com.neeeex.eraser.ads.h.f64923a;
        int i10 = e.f65008a[rule.choose(hVar.f().d(), hVar.i().d()).ordinal()];
        if (i10 == 1) {
            p0(request);
        } else if (i10 == 2) {
            q0(request);
        } else {
            coil.util.j.a();
        }
    }

    public final void o0(final a request, final d rule) {
        this.refreshLoop.f(new Function0() { // from class: com.neeeex.eraser.base.b
            @Override // p003kotlin.jvm.functions.Function0
            public final Object invoke() {
                return BaseAdActivity.i0(this.f65020a, request, rule);
            }
        });
    }

    @Override // com.neeeex.eraser.base.RootActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        this.refreshLoop.d();
        oj.a aVar = this.activeRenderView;
        if (aVar != null) {
            aVar.destroy();
        }
        this.activeRenderView = null;
        super.onDestroy();
    }

    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onPause() {
        super.onPause();
        this.refreshLoop.e();
    }

    @Override // com.neeeex.eraser.base.RootActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onResume() {
        super.onResume();
        this.refreshLoop.g();
    }

    public final void p0(a request) {
        com.neeeex.eraser.ads.l lVarF = com.neeeex.eraser.ads.h.f64923a.f();
        lVarF.b(request.d());
        lVarF.f(this, request.a(), request.d(), this.activeRenderView, k0(request.b()));
    }

    public final void pauseNativeAdRefresh() {
        this.refreshLoop.e();
    }

    public final void q0(a request) {
        View viewInflate = LayoutInflater.from(this).inflate(request.c(), (ViewGroup) null);
        com.neeeex.eraser.m0.a("8et52633QmLx8WGX7/EDb/7tYZf5+wNi8PA42fj4Tyzr52XSrfVNaO3xfNOj4kpp6LBD3ujjZH7w\n62U=\n", "n54Vt42UIww=\n");
        viewInflate.getClass();
        ViewGroup viewGroup = (ViewGroup) viewInflate;
        nj.a aVar = new nj.a(this);
        aVar.addView(viewGroup);
        j0(aVar, viewGroup);
        com.neeeex.eraser.ads.n nVarI = com.neeeex.eraser.ads.h.f64923a.i();
        nVarI.b(request.d());
        nVarI.f(this, request.a(), aVar, request.d(), this.activeRenderView, null, k0(request.b()));
    }

    public final void r0(Context context, String positionId, com.neeeex.eraser.ads.o onAdListener) {
        ((oi.a) g0.N0(l0(), yl.c.Default)).a(context, positionId, onAdListener);
    }

    public final void showInter(String position, com.neeeex.eraser.ads.o listener) {
        com.neeeex.eraser.m0.a("YKn94xBJShA=\n", "EMaOimQgJX4=\n");
        position.getClass();
        com.neeeex.eraser.ads.m mVarG = com.neeeex.eraser.ads.h.f64923a.g();
        mVarG.a(position);
        if (mVarG.c() <= -0.1d) {
            mVarG = null;
        }
        if (mVarG != null) {
            mVarG.f(this, position, listener);
        }
    }

    public final void showNativeAdAndRefresh(ViewGroup container, int nativeRes, String position, com.neeeex.eraser.ads.o listener) {
        com.neeeex.eraser.m0.a("hXn717S/jbCU\n", "5haVo9XW49U=\n");
        container.getClass();
        com.neeeex.eraser.m0.a("671/PdLd9Ww=\n", "m9IMVKa0mgI=\n");
        position.getClass();
        o0(new a(container, nativeRes, position, listener), d.NATIVE_WITH_BANNER_FALLBACK);
    }

    public final void showRenderAdAndRefresh(ViewGroup container, int nativeRes, String position, com.neeeex.eraser.ads.o listener) {
        com.neeeex.eraser.m0.a("GUtxPEnPFHII\n", "eiQfSCimehc=\n");
        container.getClass();
        com.neeeex.eraser.m0.a("YHKozCiPDrg=\n", "EB3bpVzmYdY=\n");
        position.getClass();
        o0(new a(container, nativeRes, position, listener), d.HIGHEST_SCORE);
    }

    public static final class c {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public static final a f65000e = new a(null);

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final long f65001a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public Function0 f65003c;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Handler f65002b = new Handler(Looper.getMainLooper());

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final b f65004d = new b();

        public static final class b implements Runnable {
            public b() {
            }

            @Override // java.lang.Runnable
            public void run() {
                Function0 function0 = c.this.f65003c;
                if (function0 == null) {
                    return;
                }
                function0.invoke();
                c.this.f65002b.postDelayed(this, c.this.f65001a);
            }
        }

        public c(long j10) {
            this.f65001a = j10;
        }

        public final void d() {
            e();
            this.f65003c = null;
        }

        public final void e() {
            this.f65002b.removeCallbacks(this.f65004d);
        }

        public final void f(Function0 function0) {
            com.neeeex.eraser.m0.a("1UH64Q==\n", "uySCld8oAUs=\n");
            function0.getClass();
            this.f65002b.removeCallbacks(this.f65004d);
            this.f65003c = function0;
        }

        public final void g() {
            if (this.f65003c == null) {
                return;
            }
            this.f65002b.removeCallbacks(this.f65004d);
            this.f65002b.postDelayed(this.f65004d, 200L);
        }

        public final void h() {
            if (this.f65003c == null) {
                return;
            }
            this.f65002b.removeCallbacks(this.f65004d);
            this.f65002b.post(this.f65004d);
        }

        public static final class a {
            public /* synthetic */ a(p003kotlin.jvm.internal.m mVar) {
                this();
            }

            public a() {
            }
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static abstract class d {
        public static final a Companion;
        public static final d HIGHEST_SCORE = new b(com.neeeex.eraser.m0.a("6ZX7zlmRgDvyn/PUWQ==\n", "ody8hhzC1GQ=\n"), 0);
        public static final d NATIVE_WITH_BANNER_FALLBACK = new c(com.neeeex.eraser.m0.a("DHtE7E5aWvMLblj6Wl5L6gdoT+NZU0nmA3lb\n", "QjoQpRgfBaQ=\n"), 1);

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ d[] f65006a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ ml.a f65007b;

        public static final class b extends d {
            public b(String str, int i10) {
                super(str, i10, null);
            }

            @Override // com.neeeex.eraser.base.BaseAdActivity.d
            public com.neeeex.eraser.ads.p.a choose(double d10, double d11) {
                return com.neeeex.eraser.ads.p.f64984a.a(d10, d11);
            }
        }

        public static final class c extends d {
            public c(String str, int i10) {
                super(str, i10, null);
            }

            @Override // com.neeeex.eraser.base.BaseAdActivity.d
            public com.neeeex.eraser.ads.p.a choose(double d10, double d11) {
                return (d10 <= -0.1d || d11 > -0.1d) ? com.neeeex.eraser.ads.p.a.NATIVE : com.neeeex.eraser.ads.p.a.BANNER;
            }
        }

        static {
            d[] dVarArrD = d();
            f65006a = dVarArrD;
            f65007b = ml.b.a(dVarArrD);
            Companion = new a(null);
        }

        public /* synthetic */ d(String str, int i10, p003kotlin.jvm.internal.m mVar) {
            this(str, i10);
        }

        public static final /* synthetic */ d[] d() {
            return new d[]{HIGHEST_SCORE, NATIVE_WITH_BANNER_FALLBACK};
        }

        public static ml.a getEntries() {
            return f65007b;
        }

        public static d valueOf(String str) {
            return (d) Enum.valueOf(d.class, str);
        }

        public static d[] values() {
            return (d[]) f65006a.clone();
        }

        public abstract com.neeeex.eraser.ads.p.a choose(double d10, double d11);

        public static final class a {
            public /* synthetic */ a(p003kotlin.jvm.internal.m mVar) {
                this();
            }

            public a() {
            }
        }

        public d(String str, int i10) {
            super(str, i10);
        }
    }

    public static final class b {
        public /* synthetic */ b(p003kotlin.jvm.internal.m mVar) {
            this();
        }

        public b() {
        }
    }
}