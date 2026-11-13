package com.neeeex.eraser.module.main;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import com.neeeex.eraser.base.RootActivity;
import p003kotlin.Metadata;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000 \r2\u00020\u0001:\u0001\u000eB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0019\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0014¢\u0006\u0004\b\u0007\u0010\bR\u0016\u0010\f\u001a\u00020\t8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\n\u0010\u000b¨\u0006\u000f"}, d2 = {"Lcom/neeeex/eraser/module/main/FileNEEEEXPermActivity;", "Lcom/neeeex/eraser/base/RootActivity;", "<init>", "()V", "Landroid/os/Bundle;", "savedInstanceState", "Lfl/m0;", "onCreate", "(Landroid/os/Bundle;)V", "Lji/e;", "c", "Lji/e;", "binding", "d", "a", "tool-feature_productionRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class FileNEEEEXPermActivity extends RootActivity {

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    public ji.e binding;

    public static void h0(FileNEEEEXPermActivity fileNEEEEXPermActivity, View view) {
        fileNEEEEXPermActivity.finish();
    }

    @Override // com.neeeex.eraser.base.RootActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ji.e eVarC = ji.e.c(getLayoutInflater());
        "inflate(...)" /* decoded XOR */;
        eVarC.getClass();
        this.binding = eVarC;
        ji.e eVar = null;
        if (eVarC == null) {
            p003kotlin.jvm.internal.v.n("binding" /* decoded XOR */);
            eVarC = null;
        }
        setContentView(eVarC.getRoot());
        ji.e eVar2 = this.binding;
        if (eVar2 == null) {
            p003kotlin.jvm.internal.v.n("binding" /* decoded XOR */);
        } else {
            eVar = eVar2;
        }
        eVar.f85398b.setOnClickListener(new View.OnClickListener() { // from class: com.neeeex.eraser.module.main.l
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                FileNEEEEXPermActivity.h0(this.f65364a, view);
            }
        });
    }

    /* JADX INFO: renamed from: com.neeeex.eraser.module.main.FileNEEEEXPermActivity$a, reason: from kotlin metadata */
    public static final class Companion {
        public /* synthetic */ Companion(p003kotlin.jvm.internal.m mVar) {
            this();
        }

        public final void a(Context context) {
            "context" /* decoded XOR */;
            context.getClass();
            context.startActivity(new Intent(context, (Class<?>) FileNEEEEXPermActivity.class));
        }

        public Companion() {
        }
    }
}