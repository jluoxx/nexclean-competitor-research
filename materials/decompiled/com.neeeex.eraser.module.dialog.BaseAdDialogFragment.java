package com.neeeex.eraser.module.dialog;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.FragmentActivity;
import coil.util.j;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.neeeex.eraser.R$id;
import com.neeeex.eraser.ads.h;
import com.neeeex.eraser.ads.p;
import com.neeeex.eraser.m0;
import com.sg.sdk.api.nativead.AdIconView;
import com.sg.sdk.api.nativead.MediaView;
import com.thinkup.core.common.nn.m.n;
import com.thinkup.core.q.o;
import p003kotlin.Metadata;
import p003kotlin.jvm.internal.v;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000M\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\b\u0007*\u0001\u001f\b\u0016\u0018\u00002\u00020\u0001:\u0001\"B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0019\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\t\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\u0003J%\u0010\u0010\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0013\u001a\u00020\u0012H\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u0017\u0010\u0017\u001a\u00020\u00062\u0006\u0010\u0016\u001a\u00020\u0015H\u0002¢\u0006\u0004\b\u0017\u0010\u0018J\u0017\u0010\u0019\u001a\u00020\u00062\u0006\u0010\u0016\u001a\u00020\u0015H\u0002¢\u0006\u0004\b\u0019\u0010\u0018J\u001f\u0010\u001d\u001a\u00020\u00062\u0006\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u001c\u001a\u00020\nH\u0002¢\u0006\u0004\b\u001d\u0010\u001eJ\u000f\u0010 \u001a\u00020\u001fH\u0002¢\u0006\u0004\b \u0010!R\u0018\u0010$\u001a\u0004\u0018\u00010\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\"\u0010#¨\u0006%"}, d2 = {"Lcom/neeeex/eraser/module/dialog/BaseAdDialogFragment;", "Lcom/neeeex/eraser/module/dialog/BaseDialogFragment;", "<init>", "()V", "Loj/a;", "renderView", "Lfl/m0;", n.f72065d, "(Loj/a;)V", "onDestroyView", "Landroid/view/ViewGroup;", "container", "", "nativeRes", "", "position", "q", "(Landroid/view/ViewGroup;ILjava/lang/String;)V", "Lcom/neeeex/eraser/ads/p$a;", "p", "()Lcom/neeeex/eraser/ads/p$a;", "Lcom/neeeex/eraser/module/dialog/BaseAdDialogFragment$a;", "request", "l", "(Lcom/neeeex/eraser/module/dialog/BaseAdDialogFragment$a;)V", "m", "Lnj/a;", "wrapper", "content", CampaignEx.JSON_KEY_AD_K, "(Lnj/a;Landroid/view/ViewGroup;)V", "com/neeeex/eraser/module/dialog/BaseAdDialogFragment$c", o.f74114d, "()Lcom/neeeex/eraser/module/dialog/BaseAdDialogFragment$c;", "a", "Loj/a;", "activeRenderView", "tool-feature_productionRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public class BaseAdDialogFragment extends BaseDialogFragment {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    public oj.a activeRenderView;

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Activity f65184a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final ViewGroup f65185b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final int f65186c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final String f65187d;

        public a(Activity activity, ViewGroup viewGroup, int i10, String str) {
            m0.a("wHk8UQcP2qQ=\n", "oRpIOHFmrt0=\n");
            activity.getClass();
            m0.a("Bw5xL0jMEAEW\n", "ZGEfWymlfmQ=\n");
            viewGroup.getClass();
            m0.a("VtIuwqR8BiE=\n", "Jr1dq9AVaU8=\n");
            str.getClass();
            this.f65184a = activity;
            this.f65185b = viewGroup;
            this.f65186c = i10;
            this.f65187d = str;
        }

        public final Activity a() {
            return this.f65184a;
        }

        public final ViewGroup b() {
            return this.f65185b;
        }

        public final int c() {
            return this.f65186c;
        }

        public final String d() {
            return this.f65187d;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return v.c(this.f65184a, aVar.f65184a) && v.c(this.f65185b, aVar.f65185b) && this.f65186c == aVar.f65186c && v.c(this.f65187d, aVar.f65187d);
        }

        public int hashCode() {
            return (((((this.f65184a.hashCode() * 31) + this.f65185b.hashCode()) * 31) + Integer.hashCode(this.f65186c)) * 31) + this.f65187d.hashCode();
        }

        public String toString() {
            return "DialogAdRequest(activity=" + this.f65184a + ", container=" + this.f65185b + ", nativeLayout=" + this.f65186c + ", position=" + this.f65187d + ")";
        }
    }

    public static final /* synthetic */ class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f65188a;

        static {
            int[] iArr = new int[p.a.values().length];
            try {
                iArr[p.a.BANNER.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[p.a.NATIVE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f65188a = iArr;
        }
    }

    public static final class c implements com.neeeex.eraser.ads.o {
        public c() {
        }

        @Override // com.neeeex.eraser.ads.o
        public void onAdClick() {
        }

        @Override // com.neeeex.eraser.ads.o
        public void onAdClose() {
        }

        @Override // com.neeeex.eraser.ads.o
        public void onAdShowFailed(oj.a aVar) {
            BaseAdDialogFragment.this.n(aVar);
        }

        @Override // com.neeeex.eraser.ads.o
        public void onAdShowSuccess(oj.a aVar) {
            BaseAdDialogFragment.this.n(aVar);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void n(oj.a renderView) {
        this.activeRenderView = renderView;
    }

    public final void k(nj.a wrapper, ViewGroup content) {
        wrapper.setTitleView(content.findViewById(R$id.ad_title));
        wrapper.setDescView(content.findViewById(R$id.ad_desc));
        wrapper.setCallToActionView(content.findViewById(R$id.ad_btn));
        wrapper.setMediaView((MediaView) content.findViewById(R$id.ad_media));
        wrapper.setAdIconView((AdIconView) content.findViewById(R$id.ad_icon_media));
        wrapper.setAdFlagView(content.findViewById(R$id.ad_flag));
    }

    public final void l(a request) {
        h.f64923a.f().f(request.a(), request.b(), request.d(), this.activeRenderView, o());
    }

    public final void m(a request) {
        View viewInflate = LayoutInflater.from(request.a()).inflate(request.c(), (ViewGroup) null);
        m0.a("/BcmeAPZvAP8DT40Qd/9DvMRPjRX1f0D/QxnelbWsU3mGzpxA9uzCeANI3ANzLQI5UwcfUbNmh/9\nFzo=\n", "kmJKFCO63W0=\n");
        viewInflate.getClass();
        ViewGroup viewGroup = (ViewGroup) viewInflate;
        nj.a aVar = new nj.a(request.a());
        aVar.addView(viewGroup);
        k(aVar, viewGroup);
        h.f64923a.i().f(request.a(), request.b(), aVar, request.d(), this.activeRenderView, null, o());
    }

    public final c o() {
        return new c();
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onDestroyView() {
        oj.a aVar = this.activeRenderView;
        if (aVar != null) {
            aVar.destroy();
        }
        this.activeRenderView = null;
        super.onDestroyView();
    }

    public final p.a p() {
        h hVar = h.f64923a;
        return p.f64984a.a(hVar.f().d(), hVar.i().d());
    }

    public final void q(ViewGroup container, int nativeRes, String position) {
        m0.a("qCJ/QmuF5iu5\n", "y00RNgrsiE4=\n");
        container.getClass();
        m0.a("ZgNmNnQl0a4=\n", "FmwVXwBMvsA=\n");
        position.getClass();
        p.a aVarP = p();
        int[] iArr = b.f65188a;
        int i10 = iArr[aVarP.ordinal()];
        if (i10 == 1) {
            h.f64923a.f().b(position);
        } else {
            if (i10 != 2) {
                j.a();
                return;
            }
            h.f64923a.i().b(position);
        }
        FragmentActivity activity = getActivity();
        if (activity == null) {
            return;
        }
        a aVar = new a(activity, container, nativeRes, position);
        int i11 = iArr[aVarP.ordinal()];
        if (i11 == 1) {
            l(aVar);
        } else if (i11 == 2) {
            m(aVar);
        } else {
            j.a();
        }
    }
}