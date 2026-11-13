package com.neeeex.eraser.launcher;

import android.app.Activity;
import android.os.Handler;
import android.os.Looper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.neeeex.eraser.R$id;
import com.neeeex.eraser.R$layout;
import com.neeeex.eraser.m0;
import com.sg.sdk.api.nativead.AdIconView;
import com.sg.sdk.api.nativead.MediaView;
import com.tradplus.ads.base.util.BaseTimeOutAdapter;
import p003kotlin.Metadata;
import p003kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\b\u0003\n\u0002\b\u0004*\u0002 #\b\u0000\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\u000b\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\r\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\r\u0010\fJ\u000f\u0010\u000e\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\u000e\u0010\fJ\u000f\u0010\u0010\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\r\u0010\u0012\u001a\u00020\u0007¢\u0006\u0004\b\u0012\u0010\fJ\r\u0010\u0013\u001a\u00020\u0007¢\u0006\u0004\b\u0013\u0010\fJ\r\u0010\u0014\u001a\u00020\u0007¢\u0006\u0004\b\u0014\u0010\fR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0015R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0016R\u001a\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\u0017R\u0014\u0010\u0019\u001a\u00020\u00188\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u0016\u0010\u001b\u001a\u00020\u000f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR\u0018\u0010\u001e\u001a\u0004\u0018\u00010\u001d8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR\u0014\u0010!\u001a\u00020 8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010\"R\u0014\u0010$\u001a\u00020#8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010%¨\u0006&"}, d2 = {"Lcom/neeeex/eraser/launcher/PanelAdController;", "", "Landroid/app/Activity;", "activity", "Landroid/view/ViewGroup;", "container", "Lkotlin/Function0;", "Lfl/m0;", "beforeActivityLaunch", "<init>", "(Landroid/app/Activity;Landroid/view/ViewGroup;Lkotlin/jvm/functions/Function0;)V", "render", "()V", "showBanner", "showNative", "", "isHostReady", "()Z", CampaignEx.JSON_NATIVE_VIDEO_RESUME, CampaignEx.JSON_NATIVE_VIDEO_PAUSE, "destroy", "Landroid/app/Activity;", "Landroid/view/ViewGroup;", "Lkotlin/jvm/functions/Function0;", "Landroid/os/Handler;", "handler", "Landroid/os/Handler;", AppMeasurementSdk.ConditionalUserProperty.ACTIVE, "Z", "Loj/a;", "renderView", "Loj/a;", "com/neeeex/eraser/launcher/PanelAdController$callback$1", "callback", "Lcom/neeeex/eraser/launcher/PanelAdController$callback$1;", "com/neeeex/eraser/launcher/PanelAdController$tick$1", "tick", "Lcom/neeeex/eraser/launcher/PanelAdController$tick$1;", "tool-feature_productionRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class PanelAdController {
    private boolean active;
    private final Activity activity;
    private final Function0 beforeActivityLaunch;
    private final PanelAdController$callback$1 callback;
    private final ViewGroup container;
    private final Handler handler;
    private oj.a renderView;
    private final PanelAdController$tick$1 tick;

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

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
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX INFO: renamed from: com.neeeex.eraser.launcher.PanelAdController$showBanner$1, reason: invalid class name */
    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final /* synthetic */ class AnonymousClass1 extends p003kotlin.jvm.internal.s implements Function0 {
        public AnonymousClass1(Object obj) {
            super(0, obj, PanelAdController.class, m0.a("anc9yypTlvNiYAw=\n", "AwR1pFknxJY=\n"), m0.a("jLZFAGFM/4iEoXRHO2I=\n", "5cUNbxI4re0=\n"), 0);
        }

        @Override // p003kotlin.jvm.functions.Function0
        public final Boolean invoke() {
            return Boolean.valueOf(((PanelAdController) this.receiver).isHostReady());
        }
    }

    /* JADX INFO: renamed from: com.neeeex.eraser.launcher.PanelAdController$showNative$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final /* synthetic */ class C36421 extends p003kotlin.jvm.internal.s implements Function0 {
        public C36421(Object obj) {
            super(0, obj, PanelAdController.class, m0.a("oHcVBeXVs9yoYCQ=\n", "yQRdapah4bk=\n"), m0.a("nR0GyRRWqkKVCjeOTng=\n", "9G5Opmci+Cc=\n"), 0);
        }

        @Override // p003kotlin.jvm.functions.Function0
        public final Boolean invoke() {
            return Boolean.valueOf(((PanelAdController) this.receiver).isHostReady());
        }
    }

    /* JADX WARN: Type inference failed for: r3v2, types: [com.neeeex.eraser.launcher.PanelAdController$callback$1] */
    /* JADX WARN: Type inference failed for: r3v3, types: [com.neeeex.eraser.launcher.PanelAdController$tick$1] */
    public PanelAdController(Activity activity, ViewGroup viewGroup, Function0 function0) {
        m0.a("h7dmq2jhLSo=\n", "5tQSwh6IWVM=\n");
        activity.getClass();
        m0.a("cof16+W6vyxj\n", "Eeibn4TT0Uk=\n");
        viewGroup.getClass();
        m0.a("b0N70r9MGwd5T2vUuVAWBXhIftU=\n", "DSYdvc0pWmQ=\n");
        function0.getClass();
        this.activity = activity;
        this.container = viewGroup;
        this.beforeActivityLaunch = function0;
        this.handler = new Handler(Looper.getMainLooper());
        this.callback = new com.neeeex.eraser.ads.o() { // from class: com.neeeex.eraser.launcher.PanelAdController$callback$1
            @Override // com.neeeex.eraser.ads.o
            public void onAdClick() {
                this.this$0.beforeActivityLaunch.invoke();
            }

            @Override // com.neeeex.eraser.ads.o
            public void onAdClose() {
            }

            @Override // com.neeeex.eraser.ads.o
            public void onAdShowFailed(oj.a iRenderView) {
                if (this.this$0.active) {
                    this.this$0.renderView = iRenderView;
                } else if (iRenderView != null) {
                    iRenderView.destroy();
                }
            }

            @Override // com.neeeex.eraser.ads.o
            public void onAdShowSuccess(oj.a iRenderView) {
                if (this.this$0.active) {
                    this.this$0.renderView = iRenderView;
                } else if (iRenderView != null) {
                    iRenderView.destroy();
                }
            }
        };
        this.tick = new Runnable() { // from class: com.neeeex.eraser.launcher.PanelAdController$tick$1
            @Override // java.lang.Runnable
            public void run() {
                if (!this.this$0.active || this.this$0.activity.isFinishing() || this.this$0.activity.isDestroyed() || !com.neeeex.eraser.module.report.bytedance.a.k()) {
                    return;
                }
                com.neeeex.eraser.ads.h hVar = com.neeeex.eraser.ads.h.f64923a;
                if (hVar.i().d() <= -0.1d && hVar.f().d() <= -0.1d) {
                    this.this$0.handler.postDelayed(this, 500L);
                } else {
                    this.this$0.render();
                    this.this$0.handler.postDelayed(this, BaseTimeOutAdapter.TIME_DELTA);
                }
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean isHostReady() {
        return (!this.active || this.activity.isFinishing() || this.activity.isDestroyed()) ? false : true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void render() {
        com.neeeex.eraser.ads.p pVar = com.neeeex.eraser.ads.p.f64984a;
        com.neeeex.eraser.ads.h hVar = com.neeeex.eraser.ads.h.f64923a;
        int i10 = WhenMappings.$EnumSwitchMapping$0[pVar.a(hVar.f().d(), hVar.i().d()).ordinal()];
        if (i10 == 1) {
            showBanner();
        } else if (i10 == 2) {
            showNative();
        } else {
            coil.util.j.a();
        }
    }

    private final void showBanner() {
        com.neeeex.eraser.ads.h hVar = com.neeeex.eraser.ads.h.f64923a;
        hVar.f().b(m0.a("sULucmcxcUuwW+Y=\n", "+Q2jNzh/MB8=\n"));
        hVar.f().g(this.activity, this.container, m0.a("uxs+lE8Hccq6AjY=\n", "81Rz0RBJMJ4=\n"), this.renderView, this.callback, new AnonymousClass1(this));
    }

    private final void showNative() {
        View viewInflate = LayoutInflater.from(this.container.getContext()).inflate(R$layout.ad_neeeex_native, (ViewGroup) null);
        m0.a("z2rxBw41N/LPcOlLTDN2/8Bs6UtaOXbyznGwBVs6OrzVZu0ODjc4+NNw9A8AID/51jHLAkshEe7O\nau0=\n", "oR+day5WVpw=\n");
        viewInflate.getClass();
        ViewGroup viewGroup = (ViewGroup) viewInflate;
        nj.a aVar = new nj.a(this.container.getContext());
        aVar.addView(viewGroup);
        aVar.setTitleView(viewGroup.findViewById(R$id.ad_title));
        aVar.setDescView(viewGroup.findViewById(R$id.ad_desc));
        aVar.setCallToActionView(viewGroup.findViewById(R$id.ad_btn));
        aVar.setMediaView((MediaView) viewGroup.findViewById(R$id.ad_media));
        aVar.setAdIconView((AdIconView) viewGroup.findViewById(R$id.ad_icon_media));
        aVar.setAdFlagView(viewGroup.findViewById(R$id.ad_flag));
        com.neeeex.eraser.ads.h hVar = com.neeeex.eraser.ads.h.f64923a;
        hVar.i().b(m0.a("CiTZQb1qvnMLPdE=\n", "QmuUBOIk/yc=\n"));
        hVar.i().g(this.activity, this.container, aVar, m0.a("SyS/tC87XWhKPbc=\n", "A2vy8XB1HDw=\n"), this.renderView, this.callback, new C36421(this));
    }

    public final void destroy() {
        pause();
        oj.a aVar = this.renderView;
        if (aVar != null) {
            aVar.destroy();
        }
        this.renderView = null;
        this.container.removeAllViews();
    }

    public final void pause() {
        this.active = false;
        this.handler.removeCallbacks(this.tick);
    }

    public final void resume() {
        if (this.active) {
            return;
        }
        this.active = true;
        com.neeeex.eraser.ads.h.f64923a.c(this.activity);
        if (com.neeeex.eraser.module.report.bytedance.a.k()) {
            this.handler.postDelayed(this.tick, 200L);
        }
    }
}