package com.neeeex.eraser.module.main;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;
import com.neeeex.eraser.R$id;
import com.neeeex.eraser.R$layout;
import com.neeeex.eraser.R$string;
import com.neeeex.eraser.base.RootActivity;
import p003kotlin.Metadata;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000 \u00172\u00020\u0001:\u0001\u0018B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0019\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0015¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\t\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\u0003J\u000f\u0010\n\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\n\u0010\u0003J\u0017\u0010\r\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\r\u0010\u000eR\u0016\u0010\u0012\u001a\u00020\u000f8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u0016\u0010\u0016\u001a\u00020\u00138\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015¨\u0006\u0019"}, d2 = {"Lcom/neeeex/eraser/module/main/WebViewNeeeexActivity;", "Lcom/neeeex/eraser/base/RootActivity;", "<init>", "()V", "Landroid/os/Bundle;", "savedInstanceState", "Lfl/m0;", "onCreate", "(Landroid/os/Bundle;)V", "onBackPressed", "j0", "", "targetUrl", "k0", "(Ljava/lang/String;)V", "Landroid/webkit/WebView;", "c", "Landroid/webkit/WebView;", "webView", "Landroid/widget/ProgressBar;", "d", "Landroid/widget/ProgressBar;", "progressBar", "e", "a", "tool-feature_productionRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class WebViewNeeeexActivity extends RootActivity {

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    public WebView webView;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    public ProgressBar progressBar;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final String f65332f = com.neeeex.eraser.m0.a("BmmCZqC/HkkGdJNsnpQZWA90\n", "YxH2FMHgcCw=\n");

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final String f65333g = com.neeeex.eraser.m0.a("11Hcejl24A/XTM1wB1z8Bg==\n", "simoCFgpjmo=\n");

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    public static final class b extends WebChromeClient {
        public b() {
        }

        @Override // android.webkit.WebChromeClient
        public void onProgressChanged(WebView webView, int i10) {
            ProgressBar progressBar = WebViewNeeeexActivity.this.progressBar;
            ProgressBar progressBar2 = null;
            if (progressBar == null) {
                p003kotlin.jvm.internal.v.n(com.neeeex.eraser.m0.a("J1rwfp/kiWUVSe0=\n", "VyifGe2B+hY=\n"));
                progressBar = null;
            }
            progressBar.setVisibility(i10 < 100 ? 0 : 8);
            ProgressBar progressBar3 = WebViewNeeeexActivity.this.progressBar;
            if (progressBar3 == null) {
                p003kotlin.jvm.internal.v.n(com.neeeex.eraser.m0.a("uKoCJF0ONwaKuR8=\n", "yNhtQy9rRHU=\n"));
            } else {
                progressBar2 = progressBar3;
            }
            progressBar2.setProgress(i10);
        }
    }

    public static void h0(WebViewNeeeexActivity webViewNeeeexActivity, View view) {
        webViewNeeeexActivity.finish();
    }

    public final void j0() {
        WebView webView = this.webView;
        if (webView == null) {
            p003kotlin.jvm.internal.v.n(com.neeeex.eraser.m0.a("GYmK14rykw==\n", "buzogeOX5MQ=\n"));
            webView = null;
        }
        webView.getSettings().setJavaScriptEnabled(true);
        webView.setWebViewClient(new WebViewClient());
        webView.setWebChromeClient(new b());
    }

    public final void k0(String targetUrl) {
        WebView webView = null;
        String str = (p003kotlin.text.e0.U(targetUrl, com.neeeex.eraser.m0.a("YRb/Bg==\n", "CWKLdpsr9Xw=\n"), false, 2, null) || p003kotlin.text.e0.U(targetUrl, com.neeeex.eraser.m0.a("cZHKZw==\n", "F/imAio5g+4=\n"), false, 2, null)) ? targetUrl : null;
        if (str == null) {
            str = "file:///android_asset/" + targetUrl;
        }
        WebView webView2 = this.webView;
        if (webView2 == null) {
            p003kotlin.jvm.internal.v.n(com.neeeex.eraser.m0.a("TYcfgQ5mmA==\n", "OuJ912cD7+A=\n"));
        } else {
            webView = webView2;
        }
        webView.loadUrl(str);
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        WebView webView = this.webView;
        WebView webView2 = null;
        if (webView == null) {
            p003kotlin.jvm.internal.v.n(com.neeeex.eraser.m0.a("gJ5YVxH65g==\n", "9/s6AXifkUY=\n"));
            webView = null;
        }
        if (!webView.canGoBack()) {
            super.onBackPressed();
            return;
        }
        WebView webView3 = this.webView;
        if (webView3 == null) {
            p003kotlin.jvm.internal.v.n(com.neeeex.eraser.m0.a("bymtP10tsg==\n", "GEzPaTRIxRc=\n"));
        } else {
            webView2 = webView3;
        }
        webView2.goBack();
    }

    @Override // com.neeeex.eraser.base.RootActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R$layout.activity_neeeex_web_view);
        String stringExtra = getIntent().getStringExtra(f65332f);
        if (stringExtra == null) {
            stringExtra = getString(R$string.app_name);
            com.neeeex.eraser.m0.a("Amx1iFDuV3ICIS/1CrU=\n", "ZQkB2yScPhw=\n");
            stringExtra.getClass();
        }
        String stringExtra2 = getIntent().getStringExtra(f65333g);
        if (stringExtra2 == null) {
            stringExtra2 = "";
        }
        ((TextView) findViewById(R$id.tv_neeeex_title)).setText(stringExtra);
        ((ImageView) findViewById(R$id.iv_neeeex_back)).setOnClickListener(new View.OnClickListener() { // from class: com.neeeex.eraser.module.main.n0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                WebViewNeeeexActivity.h0(this.f65371a, view);
            }
        });
        View viewFindViewById = findViewById(R$id.webView);
        com.neeeex.eraser.m0.a("2T4jabznV0H9LgRpwqAcGJY=\n", "v1dNDeqOMjY=\n");
        viewFindViewById.getClass();
        this.webView = (WebView) viewFindViewById;
        View viewFindViewById2 = findViewById(R$id.progressBar);
        com.neeeex.eraser.m0.a("A0zfQsaTkRYnXPhCuNTaT0w=\n", "ZSWxJpD69GE=\n");
        viewFindViewById2.getClass();
        this.progressBar = (ProgressBar) viewFindViewById2;
        j0();
        k0(stringExtra2);
    }

    /* JADX INFO: renamed from: com.neeeex.eraser.module.main.WebViewNeeeexActivity$a, reason: from kotlin metadata */
    public static final class Companion {
        public /* synthetic */ Companion(p003kotlin.jvm.internal.m mVar) {
            this();
        }

        public final void a(Context context, String str, String str2) {
            com.neeeex.eraser.m0.a("cii0sFk77g==\n", "EUfaxDxDmig=\n");
            context.getClass();
            com.neeeex.eraser.m0.a("gtxkoKo=\n", "9rUQzM/mJYw=\n");
            str.getClass();
            com.neeeex.eraser.m0.a("52Bi\n", "khIOGDwCQyY=\n");
            str2.getClass();
            Intent intent = new Intent(context, (Class<?>) WebViewNeeeexActivity.class);
            intent.putExtra(com.neeeex.eraser.m0.a("6nVuocSzrbLqaH+r+piqo+No\n", "jw0a06Xsw9c=\n"), str);
            intent.putExtra(com.neeeex.eraser.m0.a("8srACORJg/by19EC2mOf/w==\n", "l7K0eoUW7ZM=\n"), str2);
            context.startActivity(intent);
        }

        public Companion() {
        }
    }
}