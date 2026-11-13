package com.neeeex.eraser.module.main;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import com.neeeex.eraser.R$string;
import com.neeeex.eraser.base.RootActivity;
import p003kotlin.Metadata;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000 \u00102\u00020\u0001:\u0001\u0011B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0005\u0010\u0003J\u0019\u0010\b\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0014¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\n\u001a\u00020\u0004H\u0014¢\u0006\u0004\b\n\u0010\u0003J\u000f\u0010\u000b\u001a\u00020\u0004H\u0014¢\u0006\u0004\b\u000b\u0010\u0003R\u0016\u0010\u000f\u001a\u00020\f8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\r\u0010\u000e¨\u0006\u0012"}, d2 = {"Lcom/neeeex/eraser/module/main/SettingNEEEEXActivity;", "Lcom/neeeex/eraser/base/RootActivity;", "<init>", "()V", "Lfl/m0;", "l0", "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "(Landroid/os/Bundle;)V", "onResume", "onPause", "Lji/v;", "c", "Lji/v;", "binding", "d", "a", "tool-feature_productionRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class SettingNEEEEXActivity extends RootActivity {

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    public ji.v binding;

    private final void l0() {
        ji.v vVar = this.binding;
        if (vVar == null) {
            p003kotlin.jvm.internal.v.n(com.neeeex.eraser.m0.a("HoO0uI3tOQ==\n", "fOra3OSDXjA=\n"));
            vVar = null;
        }
        vVar.f85708b.setOnClickListener(new View.OnClickListener() { // from class: com.neeeex.eraser.module.main.e0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                SettingNEEEEXActivity.m0(this.f65348a, view);
            }
        });
        vVar.f85709c.setOnClickListener(new View.OnClickListener() { // from class: com.neeeex.eraser.module.main.f0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                SettingNEEEEXActivity.n0(this.f65350a, view);
            }
        });
        vVar.f85710d.setOnClickListener(new View.OnClickListener() { // from class: com.neeeex.eraser.module.main.g0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                SettingNEEEEXActivity.o0(this.f65352a, view);
            }
        });
        vVar.f85711e.setOnClickListener(new View.OnClickListener() { // from class: com.neeeex.eraser.module.main.h0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                SettingNEEEEXActivity.p0(this.f65354a, view);
            }
        });
    }

    public static final void m0(SettingNEEEEXActivity settingNEEEEXActivity, View view) {
        settingNEEEEXActivity.onBackPressed();
    }

    public static final void n0(SettingNEEEEXActivity settingNEEEEXActivity, View view) {
        LanguageNEEEEXSettingActivity.INSTANCE.a(settingNEEEEXActivity);
    }

    public static final void o0(SettingNEEEEXActivity settingNEEEEXActivity, View view) {
        WebViewNeeeexActivity.Companion aVar = WebViewNeeeexActivity.INSTANCE;
        String string = settingNEEEEXActivity.getString(R$string.setting_neeeex_pp);
        com.neeeex.eraser.m0.a("dMbQWZScWRd0i4okzsc=\n", "E6OkCuDuMHk=\n");
        string.getClass();
        aVar.a(settingNEEEEXActivity, string, com.neeeex.eraser.m0.a("kgntYPr/HaiJFO11+utV6JUa9XWnpl3q1Qvwdf7qXOKCHvV16Ksf94gU73HqvB/3lRHwc/A=\n", "+n2ZEInFMoc=\n"));
    }

    public static final void p0(SettingNEEEEXActivity settingNEEEEXActivity, View view) {
        WebViewNeeeexActivity.Companion aVar = WebViewNeeeexActivity.INSTANCE;
        String string = settingNEEEEXActivity.getString(R$string.setting_neeeex_ts);
        com.neeeex.eraser.m0.a("kCnFJDgt+66QZJ9ZYnY=\n", "90yxd0xfksA=\n");
        string.getClass();
        aVar.a(settingNEEEEXActivity, string, com.neeeex.eraser.m0.a("UQfNkiekcA5KGs2HJ7A4TlYU1Yd6/TBMFgXQhyOxMURBENWHNfByVVwB1JF58TkMShbLlD39Og==\n", "OXO54lSeXyE=\n"));
    }

    @Override // com.neeeex.eraser.base.RootActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ji.v vVarC = ji.v.c(getLayoutInflater());
        com.neeeex.eraser.m0.a("yF9URprot8SPHxwD\n", "oTEyKvuc0uw=\n");
        vVarC.getClass();
        this.binding = vVarC;
        if (vVarC == null) {
            p003kotlin.jvm.internal.v.n(com.neeeex.eraser.m0.a("mGbhSShEvg==\n", "+g+PLUEq2c4=\n"));
            vVarC = null;
        }
        setContentView(vVarC.getRoot());
        l0();
    }

    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onPause() {
        super.onPause();
    }

    @Override // com.neeeex.eraser.base.RootActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onResume() {
        super.onResume();
    }

    /* JADX INFO: renamed from: com.neeeex.eraser.module.main.SettingNEEEEXActivity$a, reason: from kotlin metadata */
    public static final class Companion {
        public /* synthetic */ Companion(p003kotlin.jvm.internal.m mVar) {
            this();
        }

        public final void a(Context context) {
            com.neeeex.eraser.m0.a("+EPFDueNNw==\n", "myyreoL1QxM=\n");
            context.getClass();
            context.startActivity(new Intent(context, (Class<?>) SettingNEEEEXActivity.class));
        }

        public Companion() {
        }
    }
}