package com.neeeex.eraser.module.main;

import android.content.Context;
import android.content.Intent;
import android.content.res.ColorStateList;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.neeeex.eraser.R$color;
import com.neeeex.eraser.R$drawable;
import com.neeeex.eraser.R$layout;
import com.neeeex.eraser.R$string;
import com.neeeex.eraser.base.BaseAdActivity;
import com.neeeex.eraser.base.BaseStoragePermActivity;
import ji.k1;
import p003kotlin.Metadata;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0007\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000 #2\u00020\u0001:\u0001$B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0005\u0010\u0003J\u000f\u0010\u0006\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0006\u0010\u0003J\u0019\u0010\t\u001a\u00020\u00042\b\u0010\b\u001a\u0004\u0018\u00010\u0007H\u0014¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\u000b\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u000b\u0010\u0003J\u000f\u0010\f\u001a\u00020\u0004H\u0014¢\u0006\u0004\b\f\u0010\u0003J\u0017\u0010\u000f\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\rH\u0014¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0011\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0011\u0010\u0003J\u000f\u0010\u0012\u001a\u00020\u0004H\u0014¢\u0006\u0004\b\u0012\u0010\u0003J\u000f\u0010\u0013\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0013\u0010\u0003J'\u0010\u0018\u001a\u00020\u00042\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0016\u001a\u00020\u00142\u0006\u0010\u0017\u001a\u00020\u0014H\u0002¢\u0006\u0004\b\u0018\u0010\u0019J\u000f\u0010\u001a\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u001a\u0010\u0003J\u0017\u0010\u001d\u001a\u00020\u00042\u0006\u0010\u001c\u001a\u00020\u001bH\u0002¢\u0006\u0004\b\u001d\u0010\u001eR\u0016\u0010\"\u001a\u00020\u001f8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b \u0010!¨\u0006%"}, d2 = {"Lcom/neeeex/eraser/module/main/CapacityNEEEEXActivity;", "Lcom/neeeex/eraser/base/BaseStoragePermActivity;", "<init>", "()V", "Lfl/m0;", "b1", "Z0", "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "(Landroid/os/Bundle;)V", "onBackPressed", "onResume", "Landroid/content/Intent;", "intent", "onNewIntent", "(Landroid/content/Intent;)V", "onStoragePermission", "onPause", "a1", "", "imgFraction", "vidFraction", "miscFraction", "P0", "(FFF)V", "Q0", "Lcom/neeeex/similar3p/y;", "category", "c1", "(Lcom/neeeex/similar3p/y;)V", "Lji/b;", "c", "Lji/b;", "binding", "d", "a", "tool-feature_productionRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class CapacityNEEEEXActivity extends BaseStoragePermActivity {

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    public ji.b binding;

    public static void N0(CapacityNEEEEXActivity capacityNEEEEXActivity, View view) {
        capacityNEEEEXActivity.onBackPressed();
    }

    public static final void R0(CapacityNEEEEXActivity capacityNEEEEXActivity, com.neeeex.similar3p.y yVar, View view) {
        capacityNEEEEXActivity.c1(yVar);
    }

    public static final void S0(CapacityNEEEEXActivity capacityNEEEEXActivity, com.neeeex.similar3p.y yVar, View view) {
        capacityNEEEEXActivity.c1(yVar);
    }

    public static final void T0(CapacityNEEEEXActivity capacityNEEEEXActivity, View view) {
        capacityNEEEEXActivity.c1(com.neeeex.similar3p.y.JUNK_FILES);
    }

    public static final void U0(CapacityNEEEEXActivity capacityNEEEEXActivity, View view) {
        capacityNEEEEXActivity.c1(com.neeeex.similar3p.y.JUNK_FILES);
    }

    public static final void V0(CapacityNEEEEXActivity capacityNEEEEXActivity, View view) {
        capacityNEEEEXActivity.c1(com.neeeex.similar3p.y.SCREEN_CAPTURE_FILES);
    }

    public static final void W0(CapacityNEEEEXActivity capacityNEEEEXActivity, View view) {
        capacityNEEEEXActivity.c1(com.neeeex.similar3p.y.SCREEN_CAPTURE_FILES);
    }

    public static final void X0(CapacityNEEEEXActivity capacityNEEEEXActivity, View view) {
        capacityNEEEEXActivity.b1();
    }

    public static final void Y0(CapacityNEEEEXActivity capacityNEEEEXActivity, View view) {
        capacityNEEEEXActivity.b1();
    }

    private final void Z0() {
        mi.a.f88870a.J();
        fi.a.f80895a.a(this);
    }

    private final void b1() {
        j.a.C0780a c0780a = j.a.C0780a.f65359a;
        if (checkStoragePermission(this)) {
            j.f65357a.a();
            Z0();
        } else {
            j.f65357a.c(c0780a);
            BaseStoragePermActivity.askPermission$default(this, null, 1, null);
        }
    }

    public final void P0(float imgFraction, float vidFraction, float miscFraction) {
        ji.b bVar = this.binding;
        ji.b bVar2 = null;
        if (bVar == null) {
            p003kotlin.jvm.internal.v.n("binding" /* decoded XOR */);
            bVar = null;
        }
        ViewGroup.LayoutParams layoutParams = bVar.f85321d.f85341b.getLayoutParams();
        "null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams" /* decoded XOR */;
        layoutParams.getClass();
        ConstraintLayout.b bVar3 = (ConstraintLayout.b) layoutParams;
        bVar3.V = miscFraction;
        ji.b bVar4 = this.binding;
        if (bVar4 == null) {
            p003kotlin.jvm.internal.v.n("binding" /* decoded XOR */);
        } else {
            bVar2 = bVar4;
        }
        bVar2.f85321d.f85341b.setLayoutParams(bVar3);
    }

    public final void Q0() {
        ji.b bVar = this.binding;
        ji.b bVar2 = null;
        if (bVar == null) {
            p003kotlin.jvm.internal.v.n("binding" /* decoded XOR */);
            bVar = null;
        }
        fl.t tVarA = fl.z.a(new fl.y(bVar.f85326i, Integer.valueOf(R$string.neeeex_large_docs), Integer.valueOf(R$drawable.neeeex_similar_ic_large_file)), com.neeeex.similar3p.y.LARGE_DOCS);
        ji.b bVar3 = this.binding;
        if (bVar3 == null) {
            p003kotlin.jvm.internal.v.n("binding" /* decoded XOR */);
            bVar3 = null;
        }
        fl.t tVarA2 = fl.z.a(new fl.y(bVar3.f85323f, Integer.valueOf(R$string.neeeex_duplicate_docs), Integer.valueOf(R$drawable.neeeex_similar_ic_duplicate_file)), com.neeeex.similar3p.y.DUPLICATE_DOCS);
        ji.b bVar4 = this.binding;
        if (bVar4 == null) {
            p003kotlin.jvm.internal.v.n("binding" /* decoded XOR */);
            bVar4 = null;
        }
        fl.t tVarA3 = fl.z.a(new fl.y(bVar4.f85327j, Integer.valueOf(R$string.neeeex_large_media), Integer.valueOf(R$drawable.neeeex_similar_ic_large_media)), com.neeeex.similar3p.y.LARGE_MEDIA);
        ji.b bVar5 = this.binding;
        if (bVar5 == null) {
            p003kotlin.jvm.internal.v.n("binding" /* decoded XOR */);
            bVar5 = null;
        }
        fl.t tVarA4 = fl.z.a(new fl.y(bVar5.f85324g, Integer.valueOf(R$string.neeeex_duplicate_media), Integer.valueOf(R$drawable.neeeex_similar_ic_duplicate_media)), com.neeeex.similar3p.y.DUPLICATE_MEDIA);
        ji.b bVar6 = this.binding;
        if (bVar6 == null) {
            p003kotlin.jvm.internal.v.n("binding" /* decoded XOR */);
            bVar6 = null;
        }
        for (fl.t tVar : gl.w.p(tVarA, tVarA2, tVarA3, tVarA4, fl.z.a(new fl.y(bVar6.f85330m, Integer.valueOf(R$string.neeeex_similar_images), Integer.valueOf(R$drawable.neeeex_similar_ic_similar)), com.neeeex.similar3p.y.SIMILAR_IMAGES))) {
            fl.y yVar = (fl.y) tVar.component1();
            final com.neeeex.similar3p.y yVar2 = (com.neeeex.similar3p.y) tVar.component2();
            Object objComponent1 = yVar.component1();
            "component1(...)" /* decoded XOR */;
            objComponent1.getClass();
            k1 k1Var = (k1) objComponent1;
            int iIntValue = ((Number) yVar.component2()).intValue();
            int iIntValue2 = ((Number) yVar.component3()).intValue();
            k1Var.f85532f.setText(getString(iIntValue));
            k1Var.f85530d.setImageResource(iIntValue2);
            k1Var.getRoot().setOnClickListener(new View.OnClickListener() { // from class: com.neeeex.eraser.module.main.b
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    CapacityNEEEEXActivity.R0(this.f65339a, yVar2, view);
                }
            });
            k1Var.f85529c.setOnClickListener(new View.OnClickListener() { // from class: com.neeeex.eraser.module.main.c
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    CapacityNEEEEXActivity.S0(this.f65342a, yVar2, view);
                }
            });
        }
        ji.b bVar7 = this.binding;
        if (bVar7 == null) {
            p003kotlin.jvm.internal.v.n("binding" /* decoded XOR */);
            bVar7 = null;
        }
        k1 k1Var2 = bVar7.f85325h;
        k1Var2.f85531e.setVisibility(0);
        k1Var2.f85532f.setText(getString(R$string.neeeex_similar_junk_files));
        k1Var2.f85530d.setImageResource(R$drawable.neeeex_similar_ic_junk);
        k1Var2.getRoot().setOnClickListener(new View.OnClickListener() { // from class: com.neeeex.eraser.module.main.d
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                CapacityNEEEEXActivity.T0(this.f65345a, view);
            }
        });
        k1Var2.f85529c.setOnClickListener(new View.OnClickListener() { // from class: com.neeeex.eraser.module.main.e
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                CapacityNEEEEXActivity.U0(this.f65347a, view);
            }
        });
        ji.b bVar8 = this.binding;
        if (bVar8 == null) {
            p003kotlin.jvm.internal.v.n("binding" /* decoded XOR */);
            bVar8 = null;
        }
        k1 k1Var3 = bVar8.f85329l;
        k1Var3.f85532f.setText(getString(R$string.neeeex_similar_screenshots));
        k1Var3.f85530d.setImageResource(R$drawable.neeeex_similar_ic_sceenshot);
        k1Var3.getRoot().setOnClickListener(new View.OnClickListener() { // from class: com.neeeex.eraser.module.main.f
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                CapacityNEEEEXActivity.V0(this.f65349a, view);
            }
        });
        k1Var3.f85529c.setOnClickListener(new View.OnClickListener() { // from class: com.neeeex.eraser.module.main.g
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                CapacityNEEEEXActivity.W0(this.f65351a, view);
            }
        });
        ji.b bVar9 = this.binding;
        if (bVar9 == null) {
            p003kotlin.jvm.internal.v.n("binding" /* decoded XOR */);
        } else {
            bVar2 = bVar9;
        }
        k1 k1Var4 = bVar2.f85328k;
        k1Var4.f85532f.setText(getString(R$string.ctools_neeeex_photo_compressor_title));
        k1Var4.f85530d.setImageResource(R$drawable.neeeex_ic_photo_compressor);
        k1Var4.getRoot().setOnClickListener(new View.OnClickListener() { // from class: com.neeeex.eraser.module.main.h
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                CapacityNEEEEXActivity.X0(this.f65353a, view);
            }
        });
        k1Var4.f85529c.setOnClickListener(new View.OnClickListener() { // from class: com.neeeex.eraser.module.main.i
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                CapacityNEEEEXActivity.Y0(this.f65355a, view);
            }
        });
    }

    public final void a1() {
        com.neeeex.eraser.a capacityViewModel = getCapacityViewModel();
        if (capacityViewModel != null) {
            capacityViewModel.d();
        }
        fl.t tVarA = hi.a.f83493a.a();
        if (tVarA == null) {
            tVarA = fl.z.a(0L, 0L);
        }
        long jLongValue = ((Number) tVarA.component1()).longValue();
        long jLongValue2 = ((Number) tVarA.component2()).longValue();
        ji.b bVar = this.binding;
        if (bVar == null) {
            p003kotlin.jvm.internal.v.n("binding" /* decoded XOR */);
            bVar = null;
        }
        bVar.f85331n.setText(com.neeeex.eraser.utils.d.b(jLongValue, 0, 2, null) + " / " + com.neeeex.eraser.utils.d.b(jLongValue2, 0, 2, null));
        P0(0.0f, 0.0f, ((float) jLongValue) / ((float) jLongValue2));
    }

    public final void c1(com.neeeex.similar3p.y category) {
        j.f65357a.a();
        k.f65361a.a(this, category);
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        if (com.neeeex.eraser.module.report.bytedance.a.k()) {
            BaseAdActivity.showInter$default(this, "CAPACITY_LIST_BACK_IN" /* decoded XOR */, null, 2, null);
        }
        super.onBackPressed();
    }

    @Override // com.neeeex.eraser.base.RootActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ji.b bVarC = ji.b.c(getLayoutInflater());
        "inflate(...)" /* decoded XOR */;
        bVarC.getClass();
        this.binding = bVarC;
        ji.b bVar = null;
        if (bVarC == null) {
            p003kotlin.jvm.internal.v.n("binding" /* decoded XOR */);
            bVarC = null;
        }
        setContentView(bVarC.getRoot());
        ji.b bVar2 = this.binding;
        if (bVar2 == null) {
            p003kotlin.jvm.internal.v.n("binding" /* decoded XOR */);
            bVar2 = null;
        }
        bVar2.f85321d.getRoot().setBackgroundTintList(ColorStateList.valueOf(getColor(R$color.color_neeeex_fill_4)));
        ji.b bVar3 = this.binding;
        if (bVar3 == null) {
            p003kotlin.jvm.internal.v.n("binding" /* decoded XOR */);
            bVar3 = null;
        }
        bVar3.f85320c.setOnClickListener(new View.OnClickListener() { // from class: com.neeeex.eraser.module.main.a
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                CapacityNEEEEXActivity.N0(this.f65337a, view);
            }
        });
        Q0();
        ji.b bVar4 = this.binding;
        if (bVar4 == null) {
            p003kotlin.jvm.internal.v.n("binding" /* decoded XOR */);
        } else {
            bVar = bVar4;
        }
        FrameLayout frameLayout = bVar.f85319b;
        "flAdContainer" /* decoded XOR */;
        frameLayout.getClass();
        BaseAdActivity.showRenderAdAndRefresh$default(this, frameLayout, R$layout.ad_neeeex_native, "CAPACITY_LIST_NATIVE" /* decoded XOR */, null, 8, null);
    }

    @Override // com.neeeex.eraser.base.BaseStoragePermActivity, com.neeeex.eraser.base.RootActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onNewIntent(Intent intent) {
        "intent" /* decoded XOR */;
        intent.getClass();
        super.onNewIntent(intent);
        setIntent(intent);
    }

    @Override // com.neeeex.eraser.base.BaseAdActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onPause() {
        super.onPause();
    }

    @Override // com.neeeex.eraser.base.BaseStoragePermActivity, com.neeeex.eraser.base.BaseAdActivity, com.neeeex.eraser.base.RootActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onResume() {
        super.onResume();
        a1();
    }

    @Override // com.neeeex.eraser.base.BaseStoragePermActivity
    public void onStoragePermission() {
        j.a aVarB = j.f65357a.b();
        if (p003kotlin.jvm.internal.v.c(aVarB, j.a.C0780a.f65359a)) {
            Z0();
        } else {
            if (aVarB == null) {
                return;
            }
            coil.util.j.a();
        }
    }

    /* JADX INFO: renamed from: com.neeeex.eraser.module.main.CapacityNEEEEXActivity$a, reason: from kotlin metadata */
    public static final class Companion {
        public /* synthetic */ Companion(p003kotlin.jvm.internal.m mVar) {
            this();
        }

        public final void a(Context context) {
            "context" /* decoded XOR */;
            context.getClass();
            context.startActivity(new Intent(context, (Class<?>) CapacityNEEEEXActivity.class));
        }

        public Companion() {
        }
    }
}