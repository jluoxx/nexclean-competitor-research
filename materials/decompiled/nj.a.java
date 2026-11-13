package nj;

import android.content.Context;
import android.view.View;
import android.widget.RelativeLayout;
import com.sg.sdk.api.nativead.AdIconView;
import com.sg.sdk.api.nativead.MediaView;

/* JADX INFO: loaded from: classes7.dex */
public class a extends RelativeLayout {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public MediaView f89505a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public AdIconView f89506b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public View f89507c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public View f89508d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public View f89509e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public View f89510f;

    public a(Context context) {
        super(context);
    }

    public View getAdFlagView() {
        return this.f89510f;
    }

    public AdIconView getAdIconView() {
        return this.f89506b;
    }

    public View getCallToActionView() {
        return this.f89509e;
    }

    public View getDescView() {
        return this.f89508d;
    }

    public MediaView getMediaView() {
        return this.f89505a;
    }

    public View getTitleView() {
        return this.f89507c;
    }

    public void setAdFlagView(View view) {
        this.f89510f = view;
    }

    public void setAdIconView(AdIconView adIconView) {
        this.f89506b = adIconView;
    }

    public void setCallToActionView(View view) {
        this.f89509e = view;
    }

    public void setDescView(View view) {
        this.f89508d = view;
    }

    public void setMediaView(MediaView mediaView) {
        this.f89505a = mediaView;
    }

    public void setTitleView(View view) {
        this.f89507c = view;
    }
}