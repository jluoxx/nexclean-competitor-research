package com.neeeex.eraser.recover.recod;

import a5.a;
import am.j;
import am.q;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.FrameLayout;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.l0;
import androidx.p002lifecycle.Lifecycle;
import androidx.viewpager2.widget.ViewPager2;
import com.google.android.material.tabs.TabLayout;
import com.mbridge.msdk.foundation.download.core.DownloadCommon;
import com.neeeex.eraser.R$layout;
import com.neeeex.eraser.R$string;
import com.neeeex.eraser.base.BaseAdActivity;
import com.neeeex.eraser.m0;
import com.neeeex.eraser.recover.recod.RecoveredNEEEEXActivity;
import gl.q0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import ji.u;
import p003kotlin.Metadata;
import p003kotlin.jvm.functions.Function0;
import p003kotlin.jvm.internal.m;
import p003kotlin.jvm.internal.s;
import p003kotlin.jvm.internal.v;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u0000 \u001f2\u00020\u0001:\u0003\u0014 !B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0019\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0014¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\t\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\u0003J\u000f\u0010\n\u001a\u00020\u0006H\u0014¢\u0006\u0004\b\n\u0010\u0003J\u000f\u0010\u000b\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u000b\u0010\u0003J\u000f\u0010\f\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\f\u0010\u0003J\u000f\u0010\r\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\r\u0010\u0003J\u001b\u0010\u0011\u001a\u00020\u0006*\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u0011\u0010\u0012R\u0016\u0010\u0016\u001a\u00020\u00138\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u001a\u0010\u001a\u001a\u00060\u0017R\u00020\u00008\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u0016\u0010\u001e\u001a\u00020\u001b8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u001c\u0010\u001d¨\u0006\""}, d2 = {"Lcom/neeeex/eraser/recover/recod/RecoveredNEEEEXActivity;", "Lcom/neeeex/eraser/base/BaseAdActivity;", "<init>", "()V", "Landroid/os/Bundle;", "savedInstanceState", "Lfl/m0;", "onCreate", "(Landroid/os/Bundle;)V", "onBackPressed", "onDestroy", "z0", "A0", "x0", "Landroidx/fragment/app/Fragment;", "", "delete", "y0", "(Landroidx/fragment/app/Fragment;Z)V", "", "c", "I", "selectedTab", "Lcom/neeeex/eraser/recover/recod/RecoveredNEEEEXActivity$b;", "d", "Lcom/neeeex/eraser/recover/recod/RecoveredNEEEEXActivity$b;", "pagerAdapter", "Lji/u;", "e", "Lji/u;", "binding", "f", "a", DownloadCommon.DOWNLOAD_REPORT_FIND_FILE_RESULT_VALUE_B, "tool-feature_productionRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class RecoveredNEEEEXActivity extends BaseAdActivity {

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    public int selectedTab;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    public b pagerAdapter;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    public u binding;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final String f66101g = m0.a("XnKQzt03Yf9SfrvM3Q9t42RjitjZEA==\n", "OwrkvLxoCJE=\n");

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    public final class b extends a {

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public final Map f66105j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public final /* synthetic */ RecoveredNEEEEXActivity f66106k;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(RecoveredNEEEEXActivity recoveredNEEEEXActivity, l0 l0Var, Lifecycle lifecycle) {
            super(l0Var, lifecycle);
            m0.a("BHk=\n", "YhR46oAaXsc=\n");
            l0Var.getClass();
            m0.a("JUI=\n", "SSGulVZHTaU=\n");
            lifecycle.getClass();
            this.f66106k = recoveredNEEEEXActivity;
            this.f66105j = new LinkedHashMap();
        }

        public final Fragment A(int i10) {
            return (Fragment) c.Companion.a(i10).getFactory().invoke();
        }

        public final Fragment B(int i10) {
            return (Fragment) this.f66105j.get(Integer.valueOf(i10));
        }

        @Override // androidx.recyclerview.widget.RecyclerView.h
        public int getItemCount() {
            return c.getEntries().size();
        }

        @Override // a5.a
        public Fragment i(int i10) {
            Map map = this.f66105j;
            Integer numValueOf = Integer.valueOf(i10);
            Object objA = map.get(numValueOf);
            if (objA == null) {
                objA = A(i10);
                map.put(numValueOf, objA);
            }
            return (Fragment) objA;
        }
    }

    public static final class d extends ViewPager2.i {
        public d() {
        }

        @Override // androidx.viewpager2.widget.ViewPager2.i
        public void c(int i10) {
            super.c(i10);
            RecoveredNEEEEXActivity.this.selectedTab = i10;
            RecoveredNEEEEXActivity.this.x0();
        }
    }

    public static void s0(RecoveredNEEEEXActivity recoveredNEEEEXActivity, View view) {
        recoveredNEEEEXActivity.A0();
    }

    public static void t0(TabLayout.g gVar, int i10) {
        m0.a("jpaR\n", "+vfz6MJ/GFI=\n");
        gVar.getClass();
        gVar.n(c.Companion.a(i10).getTitle());
    }

    public static void u0(RecoveredNEEEEXActivity recoveredNEEEEXActivity, View view) {
        recoveredNEEEEXActivity.onBackPressed();
    }

    public final void A0() {
        b bVar = this.pagerAdapter;
        if (bVar == null) {
            v.n(m0.a("AImpLXQAqbEAnKs6\n", "cOjOSAZBzdA=\n"));
            bVar = null;
        }
        Fragment fragmentB = bVar.B(this.selectedTab);
        if (fragmentB != null) {
            y0(fragmentB, true);
        }
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        if (com.neeeex.eraser.module.report.bytedance.a.k()) {
            BaseAdActivity.showInter$default(this, m0.a("HlOXMs1uEZ8TVZAuyngLhQ==\n", "TBfRbYEnQss=\n"), null, 2, null);
        }
        super.onBackPressed();
    }

    @Override // com.neeeex.eraser.base.RootActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        u uVarC = u.c(getLayoutInflater());
        m0.a("cqtr559OQsE16yOi\n", "G8UNi/46J+k=\n");
        uVarC.getClass();
        this.binding = uVarC;
        u uVar = null;
        if (uVarC == null) {
            v.n(m0.a("5PpeXYeeVA==\n", "hpMwOe7wM5Q=\n"));
            uVarC = null;
        }
        setContentView(uVarC.getRoot());
        z0();
        u uVar2 = this.binding;
        if (uVar2 == null) {
            v.n(m0.a("qf13rYHm2g==\n", "y5QZyeiIvWo=\n"));
        } else {
            uVar = uVar2;
        }
        FrameLayout frameLayout = uVar.f85689b;
        m0.a("CHFS7cRkXCQPdH3s9Q==\n", "bh0TiYcLMlA=\n");
        frameLayout.getClass();
        BaseAdActivity.showRenderAdAndRefresh$default(this, frameLayout, R$layout.ad_neeeex_native, m0.a("000aaruhkN/eRx1hvr6G\n", "gQlcNffow4s=\n"), null, 8, null);
        mi.a.f88870a.y0();
    }

    @Override // com.neeeex.eraser.base.BaseAdActivity, com.neeeex.eraser.base.RootActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        hi.b.f83500a.a();
    }

    public final void x0() {
        b bVar = this.pagerAdapter;
        b bVar2 = null;
        if (bVar == null) {
            v.n(m0.a("bZZyrvEu9LNtg3C5\n", "HfcVy4NvkNI=\n"));
            bVar = null;
        }
        j jVarX = q.x(0, bVar.getItemCount());
        b bVar3 = this.pagerAdapter;
        if (bVar3 == null) {
            v.n(m0.a("ncXPd1SezEmd0M1g\n", "7aSoEibfqCg=\n"));
        } else {
            bVar2 = bVar3;
        }
        ArrayList arrayList = new ArrayList();
        Iterator it = jVarX.iterator();
        while (it.hasNext()) {
            Fragment fragmentB = bVar2.B(((q0) it).nextInt());
            if (fragmentB != null) {
                arrayList.add(fragmentB);
            }
        }
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            y0((Fragment) it2.next(), false);
        }
    }

    public final void y0(Fragment fragment, boolean z10) {
        if (fragment instanceof PhotoRecoveredFragment) {
            PhotoRecoveredFragment photoRecoveredFragment = (PhotoRecoveredFragment) fragment;
            if (z10) {
                photoRecoveredFragment.q();
                return;
            } else {
                photoRecoveredFragment.n();
                return;
            }
        }
        if (fragment instanceof VideoRecoveredFragment) {
            VideoRecoveredFragment videoRecoveredFragment = (VideoRecoveredFragment) fragment;
            if (z10) {
                videoRecoveredFragment.q();
                return;
            } else {
                videoRecoveredFragment.n();
                return;
            }
        }
        if (fragment instanceof FileRecoveredFragment) {
            FileRecoveredFragment fileRecoveredFragment = (FileRecoveredFragment) fragment;
            if (z10) {
                fileRecoveredFragment.r();
            } else {
                fileRecoveredFragment.o();
            }
        }
    }

    public final void z0() {
        u uVar = this.binding;
        u uVar2 = null;
        if (uVar == null) {
            v.n(m0.a("R5VKcI/GyA==\n", "JfwkFOaor/8=\n"));
            uVar = null;
        }
        uVar.f85690c.setOnClickListener(new View.OnClickListener() { // from class: si.t
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                RecoveredNEEEEXActivity.u0(this.f98413a, view);
            }
        });
        u uVar3 = this.binding;
        if (uVar3 == null) {
            v.n(m0.a("k/WHOolUQA==\n", "8ZzpXuA6J24=\n"));
            uVar3 = null;
        }
        uVar3.f85691d.setOnClickListener(new View.OnClickListener() { // from class: si.u
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                RecoveredNEEEEXActivity.s0(this.f98414a, view);
            }
        });
        int intExtra = getIntent().getIntExtra(f66101g, 0);
        this.selectedTab = intExtra;
        l0 supportFragmentManager = getSupportFragmentManager();
        m0.a("ykC2SXqBlbPfUYRobpaIucNRj3thkIK53w3sNCHY\n", "rSXCGg/x5dw=\n");
        supportFragmentManager.getClass();
        this.pagerAdapter = new b(this, supportFragmentManager, getLifecycle());
        u uVar4 = this.binding;
        if (uVar4 == null) {
            v.n(m0.a("lwjPT1nPQQ==\n", "9WGhKzChJp4=\n"));
            uVar4 = null;
        }
        ViewPager2 viewPager2 = uVar4.f85694g;
        b bVar = this.pagerAdapter;
        if (bVar == null) {
            v.n(m0.a("+hHKHBi1pMH6BMgL\n", "inCteWr0wKA=\n"));
            bVar = null;
        }
        viewPager2.setAdapter(bVar);
        u uVar5 = this.binding;
        if (uVar5 == null) {
            v.n(m0.a("Zr39qn6MWg==\n", "BNSTzhfiPes=\n"));
            uVar5 = null;
        }
        uVar5.f85694g.g(new d());
        u uVar6 = this.binding;
        if (uVar6 == null) {
            v.n(m0.a("IAAVSUmu+g==\n", "Qml7LSDAnWw=\n"));
            uVar6 = null;
        }
        TabLayout tabLayout = uVar6.f85692e;
        u uVar7 = this.binding;
        if (uVar7 == null) {
            v.n(m0.a("8QDyxvNXrw==\n", "k2mcopo5yLI=\n"));
            uVar7 = null;
        }
        new com.google.android.material.tabs.b(tabLayout, uVar7.f85694g, new com.google.android.material.tabs.b.InterfaceC0548b() { // from class: si.v
            @Override // com.google.android.material.tabs.b.InterfaceC0548b
            public final void a(TabLayout.g gVar, int i10) {
                RecoveredNEEEEXActivity.t0(gVar, i10);
            }
        }).a();
        u uVar8 = this.binding;
        if (uVar8 == null) {
            v.n(m0.a("+QT4b/1eug==\n", "m22WC5Qw3b8=\n"));
        } else {
            uVar2 = uVar8;
        }
        uVar2.f85694g.setCurrentItem(intExtra);
    }

    public enum c {
        PHOTO(R$string.recovered_neeeex_tag_photo, new a(PhotoRecoveredFragment.INSTANCE)),
        VIDEO(R$string.recovered_neeeex_tag_video, new b(VideoRecoveredFragment.INSTANCE)),
        FILE(R$string.recovered_neeeex_tag_other, new C0802c(FileRecoveredFragment.INSTANCE));

        private final Function0 factory;
        private final int title;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ ml.a f66108b = ml.b.a(d());
        public static final d Companion = new d(null);

        public static final /* synthetic */ class a extends s implements Function0 {
            public a(Object obj) {
                super(0, obj, PhotoRecoveredFragment.Companion.class, m0.a("lJujrJyE1wWUnbE=\n", "+v7U5fL3o2Q=\n"), m0.a("mBen8yozZZqYEbWSbQxylJtdvt8hJXSD2Rei2zclY9SEF7PVMiVj1IQXs9Ugb0GTmQa/6CEjfo2T\nALXeAjJwnJsXvs5/\n", "9nLQukRAEfs=\n"), 0);
            }

            @Override // p003kotlin.jvm.functions.Function0
            public final PhotoRecoveredFragment invoke() {
                return ((PhotoRecoveredFragment.Companion) this.receiver).a();
            }
        }

        public static final /* synthetic */ class b extends s implements Function0 {
            public b(Object obj) {
                super(0, obj, VideoRecoveredFragment.Companion.class, m0.a("JxNPS5jQn1UnFV0=\n", "SXY4Avaj6zQ=\n"), m0.a("pE1J/y2adCmkS1ueaqVjJ6cHUNMmjGUw5U1M1zCMcme4TV3ZNYxyZ7hNXdknxlYhrk1R5CaKbz6v\nWlvSBZthL6dNUMJ4\n", "yig+tkPpAEg=\n"), 0);
            }

            @Override // p003kotlin.jvm.functions.Function0
            public final VideoRecoveredFragment invoke() {
                return ((VideoRecoveredFragment.Companion) this.receiver).a();
            }
        }

        /* JADX INFO: renamed from: com.neeeex.eraser.recover.recod.RecoveredNEEEEXActivity$c$c, reason: collision with other inner class name */
        public static final /* synthetic */ class C0802c extends s implements Function0 {
            public C0802c(Object obj) {
                super(0, obj, FileRecoveredFragment.Companion.class, m0.a("QT1p3CTnTb1BO3s=\n", "L1gelUqUOdw=\n"), m0.a("8ouIiMXvmH/yjZrpgtCPcfHBkaTO+Ylms4uNoNj5njHui5yu3fmeMe6LnK7Ps6p38IutpMjzmnvu\ni5uH2f2Lc/mAi/o=\n", "nO7/wauc7B4=\n"), 0);
            }

            @Override // p003kotlin.jvm.functions.Function0
            public final FileRecoveredFragment invoke() {
                return ((FileRecoveredFragment.Companion) this.receiver).a();
            }
        }

        c(int i10, Function0 function0) {
            this.title = i10;
            this.factory = function0;
        }

        public static ml.a getEntries() {
            return f66108b;
        }

        public final Function0 getFactory() {
            return this.factory;
        }

        public final int getTitle() {
            return this.title;
        }

        public static final class d {
            public /* synthetic */ d(m mVar) {
                this();
            }

            public final c a(int i10) {
                ml.a entries = c.getEntries();
                return (c) ((i10 < 0 || i10 >= entries.size()) ? c.PHOTO : entries.get(i10));
            }

            public d() {
            }
        }
    }

    /* JADX INFO: renamed from: com.neeeex.eraser.recover.recod.RecoveredNEEEEXActivity$a, reason: from kotlin metadata */
    public static final class Companion {
        public /* synthetic */ Companion(m mVar) {
            this();
        }

        public final void a(Context context, int i10) {
            m0.a("cFgQ1HmdpQ==\n", "Ezd+oBzl0QE=\n");
            context.getClass();
            Intent intent = new Intent(context, (Class<?>) RecoveredNEEEEXActivity.class);
            intent.putExtra(m0.a("NFYEA4pr20w4Wi8BilPXUA5HHhWOTA==\n", "US5wces0siI=\n"), i10);
            context.startActivity(intent);
        }

        public Companion() {
        }
    }
}