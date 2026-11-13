package com.neeeex.eraser.recover.reco.v;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.FrameLayout;
import androidx.p002lifecycle.MutableLiveData;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.foundation.download.core.DownloadCommon;
import com.neeeex.eraser.R$layout;
import com.neeeex.eraser.base.BaseAdActivity;
import com.neeeex.eraser.module.dialog.DeleteTipDialog;
import java.io.File;
import p003kotlin.Metadata;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u0000 \u001d2\u00020\u0001:\u0003\u001e\u001f\u001aB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\t\u0010\nJ\u0019\u0010\r\u001a\u00020\b2\b\u0010\f\u001a\u0004\u0018\u00010\u000bH\u0014¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u0010\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u0017\u0010\u0013\u001a\u00020\b2\u0006\u0010\u0012\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u0017\u0010\u0017\u001a\u00020\b2\u0006\u0010\u0016\u001a\u00020\u0015H\u0002¢\u0006\u0004\b\u0017\u0010\u0018R\u0016\u0010\u001c\u001a\u00020\u00198\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u001a\u0010\u001b¨\u0006 "}, d2 = {"Lcom/neeeex/eraser/recover/reco/v/VideoPreviewNEEEEXActivity;", "Lcom/neeeex/eraser/base/BaseAdActivity;", "<init>", "()V", "", MBridgeConstans.DYNAMIC_VIEW_WX_PATH, "", "recover", "Lfl/m0;", "D0", "(Ljava/lang/String;Z)V", "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "(Landroid/os/Bundle;)V", "Lcom/neeeex/eraser/recover/reco/v/VideoPreviewNEEEEXActivity$c;", "E0", "()Lcom/neeeex/eraser/recover/reco/v/VideoPreviewNEEEEXActivity$c;", "content", "x0", "(Lcom/neeeex/eraser/recover/reco/v/VideoPreviewNEEEEXActivity$c;)V", "Lcom/neeeex/eraser/recover/reco/v/VideoPreviewNEEEEXActivity$b;", "action", "B0", "(Lcom/neeeex/eraser/recover/reco/v/VideoPreviewNEEEEXActivity$b;)V", "Lji/c0;", "c", "Lji/c0;", "binding", "d", DownloadCommon.DOWNLOAD_REPORT_FIND_FILE_RESULT_VALUE_B, "a", "tool-feature_productionRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class VideoPreviewNEEEEXActivity extends BaseAdActivity {

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    public ji.c0 binding;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final String f65925e = com.neeeex.eraser.m0.a("iR1y63o87A2IDGfGdQLsDQ==\n", "7GUGmRtjgWg=\n");

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final String f65926f = com.neeeex.eraser.m0.a("qRTiiyMJEwKoBfemMjcKDw==\n", "zGyW+UJWfmc=\n");

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final String f65927g = com.neeeex.eraser.m0.a("B6Za8arpJYAGt0/cudM7ig6rWuqk2A==\n", "Yt4ug8u2SOU=\n");

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final String f65928h = com.neeeex.eraser.m0.a("phd/XiTuiganBmpzNtidBg==\n", "w28LLEWx52M=\n");

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final String f65929i = com.neeeex.eraser.m0.a("wd8mKFMHvLDAzjMFVi2jtNDOPTQ=\n", "pKdSWjJY0dU=\n");

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final String f65930j = com.neeeex.eraser.m0.a("2DNOTY8NDdPZIltgijMU0w==\n", "vUs6P+5SYLY=\n");

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final String f65931k = com.neeeex.eraser.m0.a("7/ZtEQiw0Bfu53g8G4reHfzrawYN\n", "io4ZY2nvvXI=\n");

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    public static final class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f65934a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f65935b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final String f65936c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final String f65937d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final String f65938e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final String f65939f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final boolean f65940g;

        public c(String str, String str2, String str3, String str4, String str5, String str6, boolean z10) {
            com.neeeex.eraser.m0.a("JfrrhA==\n", "S5uG4e1iiAY=\n");
            str.getClass();
            com.neeeex.eraser.m0.a("cnho7w==\n", "Ahkch9teXFk=\n");
            str2.getClass();
            com.neeeex.eraser.m0.a("5PjmVimnyPD58w==\n", "lp2VOUXSvJk=\n");
            str3.getClass();
            com.neeeex.eraser.m0.a("SKoumg==\n", "O8NU/8/FNDc=\n");
            str4.getClass();
            com.neeeex.eraser.m0.a("eqvDbwPaABQ=\n", "Ht6xDnezb3o=\n");
            str5.getClass();
            com.neeeex.eraser.m0.a("m6nSug==\n", "/8im39eXUns=\n");
            str6.getClass();
            this.f65934a = str;
            this.f65935b = str2;
            this.f65936c = str3;
            this.f65937d = str4;
            this.f65938e = str5;
            this.f65939f = str6;
            this.f65940g = z10;
        }

        public final String a() {
            return this.f65939f;
        }

        public final String b() {
            return this.f65938e;
        }

        public final String c() {
            return this.f65934a;
        }

        public final String d() {
            return this.f65935b;
        }

        public final boolean e() {
            return this.f65940g;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            return p003kotlin.jvm.internal.v.c(this.f65934a, cVar.f65934a) && p003kotlin.jvm.internal.v.c(this.f65935b, cVar.f65935b) && p003kotlin.jvm.internal.v.c(this.f65936c, cVar.f65936c) && p003kotlin.jvm.internal.v.c(this.f65937d, cVar.f65937d) && p003kotlin.jvm.internal.v.c(this.f65938e, cVar.f65938e) && p003kotlin.jvm.internal.v.c(this.f65939f, cVar.f65939f) && this.f65940g == cVar.f65940g;
        }

        public final String f() {
            return this.f65936c;
        }

        public final String g() {
            return this.f65937d;
        }

        public int hashCode() {
            return (((((((((((this.f65934a.hashCode() * 31) + this.f65935b.hashCode()) * 31) + this.f65936c.hashCode()) * 31) + this.f65937d.hashCode()) * 31) + this.f65938e.hashCode()) * 31) + this.f65939f.hashCode()) * 31) + Boolean.hashCode(this.f65940g);
        }

        public String toString() {
            return "VideoContent(name=" + this.f65934a + ", path=" + this.f65935b + ", resolution=" + this.f65936c + ", size=" + this.f65937d + ", duration=" + this.f65938e + ", date=" + this.f65939f + ", recovered=" + this.f65940g + ")";
        }
    }

    public static final void A0(VideoPreviewNEEEEXActivity videoPreviewNEEEEXActivity, c cVar, View view) {
        videoPreviewNEEEEXActivity.B0(new b.c(cVar.d()));
    }

    public static final void C0(VideoPreviewNEEEEXActivity videoPreviewNEEEEXActivity, b bVar) {
        videoPreviewNEEEEXActivity.D0(bVar.a(), false);
    }

    private final void D0(String path, boolean recover) {
        MutableLiveData mutableLiveDataD = null;
        if (recover) {
            com.neeeex.eraser.h0 sharedViewModel = getSharedViewModel();
            if (sharedViewModel != null) {
                mutableLiveDataD = sharedViewModel.E();
            }
        } else {
            com.neeeex.eraser.h0 sharedViewModel2 = getSharedViewModel();
            if (sharedViewModel2 != null) {
                mutableLiveDataD = sharedViewModel2.D();
            }
        }
        if (mutableLiveDataD != null) {
            mutableLiveDataD.postValue(path);
        }
        finish();
    }

    public static void s0(VideoPreviewNEEEEXActivity videoPreviewNEEEEXActivity, View view) {
        videoPreviewNEEEEXActivity.onBackPressed();
    }

    public static final void y0(VideoPreviewNEEEEXActivity videoPreviewNEEEEXActivity, c cVar, View view) {
        videoPreviewNEEEEXActivity.B0(new b.a(cVar.d()));
    }

    public static final void z0(VideoPreviewNEEEEXActivity videoPreviewNEEEEXActivity, c cVar, View view) {
        videoPreviewNEEEEXActivity.B0(new b.C0799b(cVar.d()));
    }

    public final void B0(final b action) {
        if (action instanceof b.C0799b) {
            VideoFullPreviewNEEEEXActivity.INSTANCE.a(this, action.a());
            return;
        }
        if (action instanceof b.c) {
            D0(action.a(), true);
            return;
        }
        if (!(action instanceof b.a)) {
            coil.util.j.a();
            return;
        }
        DeleteTipDialog deleteTipDialogA = DeleteTipDialog.INSTANCE.a();
        deleteTipDialogA.m(new ki.a() { // from class: com.neeeex.eraser.recover.reco.v.l0
            @Override // ki.a
            public final void a() {
                VideoPreviewNEEEEXActivity.C0(this.f66045a, action);
            }
        });
        androidx.fragment.app.l0 supportFragmentManager = getSupportFragmentManager();
        com.neeeex.eraser.m0.a("7CtlbXlV+w35OldMbULmB+U6XF9iROwH+WY/ECIM\n", "i04RPgwli2I=\n");
        supportFragmentManager.getClass();
        deleteTipDialogA.i(supportFragmentManager);
    }

    public final c E0() {
        String stringExtra = getIntent().getStringExtra(f65925e);
        if (stringExtra == null) {
            stringExtra = "";
        }
        String stringExtra2 = getIntent().getStringExtra(f65926f);
        if (stringExtra2 == null) {
            stringExtra2 = "";
        }
        String stringExtra3 = getIntent().getStringExtra(f65927g);
        if (stringExtra3 == null) {
            stringExtra3 = "";
        }
        String stringExtra4 = getIntent().getStringExtra(f65928h);
        if (stringExtra4 == null) {
            stringExtra4 = "";
        }
        String stringExtra5 = getIntent().getStringExtra(f65929i);
        if (stringExtra5 == null) {
            stringExtra5 = "";
        }
        String stringExtra6 = getIntent().getStringExtra(f65930j);
        return new c(stringExtra, stringExtra2, stringExtra3, stringExtra4, stringExtra5, stringExtra6 != null ? stringExtra6 : "", getIntent().getBooleanExtra(f65931k, false));
    }

    @Override // com.neeeex.eraser.base.RootActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ji.c0 c0VarC = ji.c0.c(getLayoutInflater());
        com.neeeex.eraser.m0.a("UPaPKA10khYXtsdt\n", "OZjpRGwA9z4=\n");
        c0VarC.getClass();
        this.binding = c0VarC;
        ji.c0 c0Var = null;
        if (c0VarC == null) {
            p003kotlin.jvm.internal.v.n(com.neeeex.eraser.m0.a("SJJXffE6xA==\n", "Kvs5GZhUoww=\n"));
            c0VarC = null;
        }
        setContentView(c0VarC.getRoot());
        ji.c0 c0Var2 = this.binding;
        if (c0Var2 == null) {
            p003kotlin.jvm.internal.v.n(com.neeeex.eraser.m0.a("k4cos0uCgA==\n", "8e5G1yLs52A=\n"));
            c0Var2 = null;
        }
        c0Var2.f85360e.setOnClickListener(new View.OnClickListener() { // from class: com.neeeex.eraser.recover.reco.v.h0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                VideoPreviewNEEEEXActivity.s0(this.f66033a, view);
            }
        });
        x0(E0());
        ji.c0 c0Var3 = this.binding;
        if (c0Var3 == null) {
            p003kotlin.jvm.internal.v.n(com.neeeex.eraser.m0.a("dZnxKjzMRQ==\n", "F/CfTlWiIqk=\n"));
        } else {
            c0Var = c0Var3;
        }
        FrameLayout frameLayout = c0Var.f85359d;
        com.neeeex.eraser.m0.a("zRb3q3C5wwzKE9iqQQ==\n", "q3q2zzPWrXg=\n");
        frameLayout.getClass();
        BaseAdActivity.showRenderAdAndRefresh$default(this, frameLayout, R$layout.ad_neeeex_native, com.neeeex.eraser.m0.a("PN5X3OfXl/Qi10bZ9sqA+A==\n", "bogImKKD1r0=\n"), null, 8, null);
    }

    public final void x0(final c content) {
        ji.c0 c0Var = this.binding;
        if (c0Var == null) {
            p003kotlin.jvm.internal.v.n(com.neeeex.eraser.m0.a("kxWZPjWnRQ==\n", "8Xz3WlzJIv8=\n"));
            c0Var = null;
        }
        c0Var.f85365j.setVisibility(content.e() ? 8 : 0);
        c0Var.f85368m.setText(content.c());
        c0Var.f85369n.setText(content.d());
        c0Var.f85370o.setText(content.f());
        c0Var.f85371p.setText(content.g());
        c0Var.f85367l.setText(content.b());
        c0Var.f85366k.setText(content.a());
        com.bumptech.glide.b.v(this).s(new File(content.d())).G0(c0Var.f85364i);
        c0Var.f85362g.setOnClickListener(new View.OnClickListener() { // from class: com.neeeex.eraser.recover.reco.v.i0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                VideoPreviewNEEEEXActivity.y0(this.f66035a, content, view);
            }
        });
        View.OnClickListener onClickListener = new View.OnClickListener() { // from class: com.neeeex.eraser.recover.reco.v.j0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                VideoPreviewNEEEEXActivity.z0(this.f66038a, content, view);
            }
        };
        c0Var.f85361f.setOnClickListener(onClickListener);
        c0Var.f85363h.setOnClickListener(onClickListener);
        c0Var.f85365j.setOnClickListener(new View.OnClickListener() { // from class: com.neeeex.eraser.recover.reco.v.k0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                VideoPreviewNEEEEXActivity.A0(this.f66042a, content, view);
            }
        });
    }

    /* JADX INFO: renamed from: com.neeeex.eraser.recover.reco.v.VideoPreviewNEEEEXActivity$a, reason: from kotlin metadata */
    public static final class Companion {
        public /* synthetic */ Companion(p003kotlin.jvm.internal.m mVar) {
            this();
        }

        public final void a(Context context, String str, String str2, String str3, String str4, String str5, String str6, boolean z10) {
            com.neeeex.eraser.m0.a("QqGYVFtknQ==\n", "Ic72ID4c6VQ=\n");
            context.getClass();
            com.neeeex.eraser.m0.a("0puSVA==\n", "vPr/MRUfR/k=\n");
            str.getClass();
            com.neeeex.eraser.m0.a("xGRw6g==\n", "tAUEgsJdOB4=\n");
            str2.getClass();
            com.neeeex.eraser.m0.a("ZRm1s+CgDzt4Eg==\n", "F3zG3IzVe1I=\n");
            str3.getClass();
            com.neeeex.eraser.m0.a("nI2HFw==\n", "7+T9cn1Gxw0=\n");
            str4.getClass();
            com.neeeex.eraser.m0.a("jvX/9iU+3R0=\n", "6oCNl1FXsnM=\n");
            str5.getClass();
            com.neeeex.eraser.m0.a("ce3xMQ==\n", "FYyFVBC72YA=\n");
            str6.getClass();
            Intent intent = new Intent(context, (Class<?>) VideoPreviewNEEEEXActivity.class);
            intent.putExtra(com.neeeex.eraser.m0.a("rl28B1vVD1mvTKkqVOsPWQ==\n", "yyXIdTqKYjw=\n"), str);
            intent.putExtra(com.neeeex.eraser.m0.a("r17w5S1HxTGuT+XIPHncPA==\n", "yiaEl0wYqFQ=\n"), str2);
            intent.putExtra(com.neeeex.eraser.m0.a("+vjaBL7SSqL76c8prehUqPP12h+w4w==\n", "n4Cudt+NJ8c=\n"), str3);
            intent.putExtra(com.neeeex.eraser.m0.a("QdisbC2NIHZAyblBP7s3dg==\n", "JKDYHkzSTRM=\n"), str4);
            intent.putExtra(com.neeeex.eraser.m0.a("LpIXgfMnLyIvgwKs9g0wJj+DDJ0=\n", "S+pj85J4Qkc=\n"), str5);
            intent.putExtra(com.neeeex.eraser.m0.a("Ik6a1EhPXJwjX4/5TXFFnA==\n", "RzbupikQMfk=\n"), str6);
            intent.putExtra(com.neeeex.eraser.m0.a("giHgMS7OLJmDMPUcPfQik5E85iYr\n", "51mUQ0+RQfw=\n"), z10);
            context.startActivity(intent);
        }

        public Companion() {
        }
    }

    public static abstract class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f65933a;

        public static final class a extends b {
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(String str) {
                super(str, null);
                com.neeeex.eraser.m0.a("8pUUyA==\n", "gvRgoDI1aRk=\n");
                str.getClass();
            }
        }

        /* JADX INFO: renamed from: com.neeeex.eraser.recover.reco.v.VideoPreviewNEEEEXActivity$b$b, reason: collision with other inner class name */
        public static final class C0799b extends b {
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0799b(String str) {
                super(str, null);
                com.neeeex.eraser.m0.a("H535Nw==\n", "b/yNX5LbPBI=\n");
                str.getClass();
            }
        }

        public static final class c extends b {
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public c(String str) {
                super(str, null);
                com.neeeex.eraser.m0.a("qLepwg==\n", "2NbdqrzJCd0=\n");
                str.getClass();
            }
        }

        public b(String str) {
            this.f65933a = str;
        }

        public final String a() {
            return this.f65933a;
        }

        public /* synthetic */ b(String str, p003kotlin.jvm.internal.m mVar) {
            this(str);
        }
    }
}