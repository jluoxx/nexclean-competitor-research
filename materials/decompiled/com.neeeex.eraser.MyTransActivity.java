package com.neeeex.eraser;

import android.os.Bundle;
import com.neeeex.eraser.base.RootActivity;
import com.neeeex.eraser.launcher.DesktopNavigator;
import p003kotlin.Metadata;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0006\u0018\u0000 \u000f2\u00020\u0001:\u0001\u0010B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0019\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0014¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\t\u001a\u00020\u0006H\u0014¢\u0006\u0004\b\t\u0010\u0003J\u000f\u0010\n\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\n\u0010\u0003R\u0016\u0010\u000e\u001a\u00020\u000b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\f\u0010\r¨\u0006\u0011"}, d2 = {"Lcom/neeeex/eraser/MyTransActivity;", "Lcom/neeeex/eraser/base/RootActivity;", "<init>", "()V", "Landroid/os/Bundle;", "savedInstanceState", "Lfl/m0;", "onCreate", "(Landroid/os/Bundle;)V", "onPostResume", "onBackPressed", "", "c", "Z", "delivered", "d", "a", "tool-feature_productionRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class MyTransActivity extends RootActivity {

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    public boolean delivered;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final String f64874e = m0.a("ir9/k4jdJkibrmSP\n", "78cL4emCRys=\n");

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        finish();
    }

    @Override // com.neeeex.eraser.base.RootActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R$layout.activity_my_trans);
    }

    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onPostResume() {
        super.onPostResume();
        if (this.delivered) {
            return;
        }
        this.delivered = true;
        int iX = com.neeeex.eraser.ads.e.b0().X(this);
        DesktopNavigator desktopNavigator = DesktopNavigator.INSTANCE;
        Integer numValueOf = Integer.valueOf(iX);
        if (numValueOf.intValue() < 0) {
            numValueOf = null;
        }
        desktopNavigator.finishDelivery(this, Integer.valueOf(numValueOf != null ? numValueOf.intValue() : getTaskId()));
    }
}