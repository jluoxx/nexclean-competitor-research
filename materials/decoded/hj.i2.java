package hj;

import android.graphics.Color;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.android.systemui.shared.system.SysUiStatsLog;
import com.sg.sdk.api.nativead.AdIconView;
import com.sg.sdk.api.nativead.MediaView;
import com.tradplus.ads.base.adapter.nativead.TPNativeAdView;
import com.tradplus.ads.base.common.TPImageLoader;
import com.tradplus.ads.open.nativead.TPNativeAdRender;

/* JADX INFO: loaded from: classes7.dex */
public final class i2 extends TPNativeAdRender {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ nj.a f83591a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ViewGroup f83592b;

    public i2(nj.a aVar, ViewGroup viewGroup) {
        this.f83591a = aVar;
        this.f83592b = viewGroup;
    }

    @Override // com.tradplus.ads.open.nativead.TPNativeAdRender
    public final ViewGroup createAdLayoutView() {
        return this.f83591a;
    }

    @Override // com.tradplus.ads.open.nativead.TPNativeAdRender
    public final ViewGroup renderAdView(TPNativeAdView tPNativeAdView) {
        ViewGroup viewGroup;
        if (this.f83591a.getChildCount() <= 0 || !(this.f83591a.getChildAt(0) instanceof ViewGroup)) {
            viewGroup = null;
        } else {
            View childAt = this.f83591a.getChildAt(0);
            childAt.getClass();
            viewGroup = (ViewGroup) childAt;
        }
        if (viewGroup == null) {
            return null;
        }
        new RelativeLayout.LayoutParams(-1, -1);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-2, -2);
        RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(-1, -2);
        layoutParams2.addRule(13);
        ImageView imageView = new ImageView(this.f83591a.getContext());
        MediaView mediaView = new MediaView(this.f83591a.getContext());
        imageView.setLayoutParams(layoutParams2);
        mediaView.setLayoutParams(layoutParams2);
        if (tPNativeAdView.getMediaView() != null) {
            mediaView.addView(tPNativeAdView.getMediaView());
        } else if (tPNativeAdView.getMainImage() != null) {
            imageView.setImageDrawable(tPNativeAdView.getMainImage());
            mediaView.addView(imageView);
        } else if (tPNativeAdView.getMainImageUrl() != null) {
            TPImageLoader.getInstance().loadImage(imageView, tPNativeAdView.getMainImageUrl());
            mediaView.addView(imageView);
        }
        MediaView mediaView2 = this.f83591a.getMediaView();
        if (mediaView2 != null) {
            mediaView2.addView(mediaView);
        }
        ImageView imageView2 = new ImageView(this.f83591a.getContext());
        if (tPNativeAdView.getIconImage() != null) {
            imageView2.setImageDrawable(tPNativeAdView.getIconImage());
        } else if (tPNativeAdView.getIconImageUrl() != null) {
            TPImageLoader.getInstance().loadImage(imageView2, tPNativeAdView.getIconImageUrl());
        }
        AdIconView adIconView = new AdIconView(this.f83591a.getContext());
        adIconView.addView(imageView2);
        adIconView.setLayoutParams(layoutParams);
        AdIconView adIconView2 = this.f83591a.getAdIconView();
        if (adIconView2 != null) {
            adIconView2.addView(adIconView);
        }
        View titleView = this.f83591a.getTitleView();
        if (titleView != null && (titleView instanceof TextView)) {
            ((TextView) titleView).setText(tPNativeAdView.getTitle());
        }
        View descView = this.f83591a.getDescView();
        if (descView != null && (descView instanceof TextView)) {
            ((TextView) descView).setText(tPNativeAdView.getSubTitle());
        }
        View callToActionView = this.f83591a.getCallToActionView();
        if (callToActionView != null && (callToActionView instanceof TextView)) {
            ((TextView) callToActionView).setText(tPNativeAdView.getCallToAction());
        }
        if (this.f83591a.getAdFlagView() == null) {
            TextView textView = new TextView(this.f83591a.getContext());
            RelativeLayout.LayoutParams layoutParams3 = new RelativeLayout.LayoutParams(50, 35);
            layoutParams3.addRule(10);
            layoutParams3.setMargins(15, 0, 15, 0);
            textView.setLayoutParams(layoutParams3);
            textView.setBackgroundColor(Color.argb(255, 234, 234, 234));
            textView.setGravity(17);
            textView.setText("Ad");
            textView.setTextSize(10.0f);
            textView.setTextColor(Color.argb(255, 45, SysUiStatsLog.ASSIST_GESTURE_STAGE_REPORTED, 201));
            textView.bringToFront();
            viewGroup.addView(textView);
        }
        getClickViews().add(mediaView);
        setImageView(imageView, true);
        setIconView(imageView2, true);
        View titleView2 = this.f83591a.getTitleView();
        titleView2.getClass();
        setTitleView((TextView) titleView2, true);
        View descView2 = this.f83591a.getDescView();
        descView2.getClass();
        setSubTitleView((TextView) descView2, true);
        View callToActionView2 = this.f83591a.getCallToActionView();
        callToActionView2.getClass();
        setCallToActionView((TextView) callToActionView2, true);
        RelativeLayout.LayoutParams layoutParams4 = new RelativeLayout.LayoutParams(-2, -2);
        layoutParams4.addRule(17);
        this.f83592b.removeAllViews();
        this.f83592b.addView(this.f83591a, layoutParams4);
        return viewGroup;
    }
}